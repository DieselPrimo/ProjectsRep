
import java.io.File;

public class InfoSpace {

    private static final int DEVIDER = 1024 * 1024 * 1024;

    private static long totalSpace = 0;
    private static long usableSpace = 0;
    private static long freeSpace = 0;

    static {
        updateSpaceInfo();
    }

    public static void updateSpaceInfo() {
        totalSpace = 0;
        usableSpace = 0;
        freeSpace = 0;

        final File[] roots = File.listRoots();
        for (final File file : roots) {
            totalSpace += file.getTotalSpace();
            usableSpace += file.getUsableSpace();
            freeSpace += file.getFreeSpace();
        }
    }

    public static long getFreeSpace() {
        return freeSpace / DEVIDER;
    }

    public static long getUsableSpace() {
        return usableSpace / DEVIDER;
    }

    public static long getTotalSpace() {
        return totalSpace / DEVIDER;
    }

}
