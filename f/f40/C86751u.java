package f40;

import android.text.format.DateFormat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Date;

/* renamed from: f40.u */
public class C86751u {

    /* renamed from: a */
    public static final File f251827a;

    /* renamed from: b */
    public static final File f251828b;

    static {
        File file = new File(MMApplicationContext.getContext().getCacheDir(), "file-disappeared-logs");
        f251827a = file;
        File file2 = new File(file, DateFormat.format("yyyy-MM-dd", new Date()).toString());
        f251828b = file2;
        Log.m105929w("MicroMsg.FileDisappearedObserver", "FileDisappearedLogging %s", file2.getAbsoluteFile());
        try {
            if (file.isDirectory()) {
                if (file.listFiles().length > 3) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (File file3 : file.listFiles()) {
                        if (file3.isFile()) {
                            if (currentTimeMillis >= file3.lastModified()) {
                                if (currentTimeMillis - file3.lastModified() >= 259200000) {
                                    file3.delete();
                                }
                            } else if (currentTimeMillis < file3.lastModified() && file3.lastModified() - currentTimeMillis >= 259200000) {
                                file3.delete();
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.FileDisappearedObserver", th, "", new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m107635a() {
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        try {
            File file = f251827a;
            if (file.isDirectory()) {
                long j = 0;
                fileInputStream = null;
                File file2 = null;
                for (File file3 : file.listFiles()) {
                    if (file3.isFile()) {
                        if (file3.lastModified() > j) {
                            j = file3.lastModified();
                            file2 = file3;
                        }
                    }
                }
                if (file2 != null) {
                    Log.m105929w("MicroMsg.FileDisappearedObserver", "Print content of file %s", file2.getAbsolutePath());
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file2);
                        try {
                            inputStreamReader = new InputStreamReader(fileInputStream2);
                        } catch (Throwable th) {
                            th = th;
                            inputStreamReader = null;
                            bufferedReader = null;
                            fileInputStream = fileInputStream2;
                            Log.printErrStackTrace("MicroMsg.FileDisappearedObserver", th, th.getMessage(), new Object[0]);
                            Util.qualityClose(fileInputStream);
                            Util.qualityClose(inputStreamReader);
                            Util.qualityClose(bufferedReader);
                        }
                        try {
                            bufferedReader = new BufferedReader(inputStreamReader);
                            while (true) {
                                try {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    Log.m105928w("MicroMsg.FileDisappearedObserver", readLine);
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileInputStream = fileInputStream2;
                                    Log.printErrStackTrace("MicroMsg.FileDisappearedObserver", th, th.getMessage(), new Object[0]);
                                    Util.qualityClose(fileInputStream);
                                    Util.qualityClose(inputStreamReader);
                                    Util.qualityClose(bufferedReader);
                                }
                            }
                            Util.qualityClose(fileInputStream2);
                            Util.qualityClose(inputStreamReader);
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedReader = null;
                            fileInputStream = fileInputStream2;
                            Log.printErrStackTrace("MicroMsg.FileDisappearedObserver", th, th.getMessage(), new Object[0]);
                            Util.qualityClose(fileInputStream);
                            Util.qualityClose(inputStreamReader);
                            Util.qualityClose(bufferedReader);
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        inputStreamReader = null;
                        bufferedReader = null;
                        Log.printErrStackTrace("MicroMsg.FileDisappearedObserver", th, th.getMessage(), new Object[0]);
                        Util.qualityClose(fileInputStream);
                        Util.qualityClose(inputStreamReader);
                        Util.qualityClose(bufferedReader);
                    }
                    Util.qualityClose(bufferedReader);
                }
            }
        } catch (Throwable th7) {
            Log.printErrStackTrace("MicroMsg.FileDisappearedObserver", th7, "", new Object[0]);
        }
    }
}
