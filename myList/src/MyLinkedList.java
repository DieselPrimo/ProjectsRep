import java.util.NoSuchElementException;

public class MyLinkedList<E> {
    MyLinkedList.Node<E> first;
    MyLinkedList.Node<E> last;
    int size;

    MyLinkedList() {
        this.size = 0;
    }

    private static class Node<E> {
        E item;
        MyLinkedList.Node<E> next;
        MyLinkedList.Node<E> prev;

        Node(MyLinkedList.Node<E> prev, E element, MyLinkedList.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private void linkFirst(E var1) {
        MyLinkedList.Node var2 = this.first;
        MyLinkedList.Node var3 = new MyLinkedList.Node((MyLinkedList.Node) null, var1, var2);
        this.first = var3;
        if (var2 == null) {
            this.last = var3;
        } else {
            var2.prev = var3;
        }

        ++this.size;

    }

    void linkLast(E var1) {
        MyLinkedList.Node var2 = this.last;
        MyLinkedList.Node var3 = new MyLinkedList.Node(var2, var1, (MyLinkedList.Node) null);
        this.last = var3;
        if (var2 == null) {
            this.first = var3;
        } else {
            var2.next = var3;
        }

        ++this.size;

    }

    public E getFirst() {
        MyLinkedList.Node var1 = this.first;
        if (var1 == null) {
            throw new NoSuchElementException();
        } else {
            return (E) var1.item;
        }
    }

    public E getLast() {
        MyLinkedList.Node var1 = this.last;
        if (var1 == null) {
            throw new NoSuchElementException();
        } else {
            return (E) var1.item;
        }
    }

    public E removeFirst() {
        MyLinkedList.Node var1 = this.first;
        if (var1 == null) {
            throw new NoSuchElementException();
        } else {
            return (E) this.unlinkFirst(var1);
        }
    }

    public E removeLast() {
        MyLinkedList.Node var1 = this.last;
        if (var1 == null) {
            throw new NoSuchElementException();
        } else {
            return (E) this.unlinkLast(var1);
        }
    }

    private E unlinkFirst(MyLinkedList.Node<E> var1) {
        Object var2 = var1.item;
        MyLinkedList.Node var3 = var1.next;
        var1.item = null;
        var1.next = null;
        this.first = var3;
        if (var3 == null) {
            this.last = null;
        } else {
            var3.prev = null;
        }

        --this.size;

        return (E) var2;
    }

    private E unlinkLast(MyLinkedList.Node<E> var1) {
        Object var2 = var1.item;
        MyLinkedList.Node var3 = var1.prev;
        var1.item = null;
        var1.prev = null;
        this.last = var3;
        if (var3 == null) {
            this.first = null;
        } else {
            var3.next = null;
        }

        --this.size;

        return (E) var2;
    }

    E unlink(MyLinkedList.Node<E> var1) {
        Object var2 = var1.item;
        MyLinkedList.Node var3 = var1.next;
        MyLinkedList.Node var4 = var1.prev;
        if (var4 == null) {
            this.first = var3;
        } else {
            var4.next = var3;
            var1.prev = null;
        }

        if (var3 == null) {
            this.last = var4;
        } else {
            var3.prev = var4;
            var1.next = null;
        }

        var1.item = null;
        --this.size;

        return (E) var2;
    }

    public boolean add(E var1) {
        this.linkLast(var1);
        return true;
    }

    public boolean remove(Object var1) {
        MyLinkedList.Node var2;
        if (var1 == null) {
            for (var2 = this.first; var2 != null; var2 = var2.next) {
                if (var2.item == null) {
                    this.unlink(var2);
                    return true;
                }
            }
        } else {
            for (var2 = this.first; var2 != null; var2 = var2.next) {
                if (var1.equals(var2.item)) {
                    this.unlink(var2);
                    return true;
                }
            }
        }

        return false;
    }

    public int size() {
        return this.size;
    }

    public E get(int var1) {
        this.checkElementIndex(var1);
        return this.node(var1).item;
    }

    public E set(int var1, E var2) {
        this.checkElementIndex(var1);
        MyLinkedList.Node var3 = this.node(var1);
        Object var4 = var3.item;
        var3.item = var2;
        return (E) var4;
    }

    public void add(int var1, E var2) {
        this.checkPositionIndex(var1);
        if (var1 == this.size) {
            this.linkLast(var2);
        } else {
            this.linkBefore(var2, this.node(var1));
        }

    }

    private void checkElementIndex(int var1) {
        if (!this.isElementIndex(var1)) {
            throw new IndexOutOfBoundsException(this.outOfBoundsMsg(var1));
        }
    }

    private boolean isElementIndex(int var1) {
        return var1 >= 0 && var1 < this.size;
    }

    private String outOfBoundsMsg(int var1) {
        return "Index: " + var1 + ", Size: " + this.size;
    }


    private void checkPositionIndex(int var1) {
        if (!this.isPositionIndex(var1)) {
            throw new IndexOutOfBoundsException(this.outOfBoundsMsg(var1));
        }
    }

    private boolean isPositionIndex(int var1) {
        return var1 >= 0 && var1 <= this.size;
    }


    void linkBefore(E var1, MyLinkedList.Node<E> var2) {
        MyLinkedList.Node var3 = var2.prev;
        MyLinkedList.Node var4 = new MyLinkedList.Node(var3, var1, var2);
        var2.prev = var4;
        if (var3 == null) {
            this.first = var4;
        } else {
            var3.next = var4;
        }

        ++this.size;
    }

    MyLinkedList.Node<E> node(int var1) {
        MyLinkedList.Node var2;
        int var3;
        if (var1 < this.size >> 1) {
            var2 = this.first;

            for (var3 = 0; var3 < var1; ++var3) {
                var2 = var2.next;
            }

            return var2;
        } else {
            var2 = this.last;

            for (var3 = this.size - 1; var3 > var1; --var3) {
                var2 = var2.prev;
            }

            return var2;
        }
    }

    public int indexOf(Object var1) {
        int var2 = 0;
        MyLinkedList.Node var3;
        if (var1 == null) {
            for (var3 = this.first; var3 != null; var3 = var3.next) {
                if (var3.item == null) {
                    return var2;
                }

                ++var2;
            }
        } else {
            for (var3 = this.first; var3 != null; var3 = var3.next) {
                if (var1.equals(var3.item)) {
                    return var2;
                }

                ++var2;
            }
        }

        return -1;
    }


}

