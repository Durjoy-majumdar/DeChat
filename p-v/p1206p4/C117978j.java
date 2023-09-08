package p1206p4;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;
import p1014o4.C117693m;

/* renamed from: p4.j */
public class C117978j {

    /* renamed from: a */
    public static final String f352599a = C117693m.m165967e("WrkDbPathHelper");

    /* renamed from: b */
    public static final String[] f352600b = {"-journal", "-shm", "-wal"};

    /* renamed from: a */
    public static void m166385a(Context context) {
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && databasePath.exists()) {
            C117693m.m165966c().mo182389a(f352599a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            if (i >= 23) {
                File databasePath2 = context.getDatabasePath("androidx.work.workdb");
                File databasePath3 = i < 23 ? context.getDatabasePath("androidx.work.workdb") : new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                hashMap.put(databasePath2, databasePath3);
                for (String str : f352600b) {
                    hashMap.put(new File(databasePath2.getPath() + str), new File(databasePath3.getPath() + str));
                }
            }
            for (File file : hashMap.keySet()) {
                File file2 = (File) hashMap.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        C117693m.m165966c().mo182392f(f352599a, String.format("Over-writing contents of %s", new Object[]{file2}), new Throwable[0]);
                    }
                    C117693m.m165966c().mo182389a(f352599a, file.renameTo(file2) ? String.format("Migrated %s to %s", new Object[]{file, file2}) : String.format("Renaming %s to %s failed", new Object[]{file, file2}), new Throwable[0]);
                }
            }
        }
    }
}
