package jv3;

import android.content.Context;
import av3.C79633a;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import iv3.C87821a;
import iv3.C87825c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: jv3.b */
public class C88034b {

    /* renamed from: d */
    public static C88034b f254654d;

    /* renamed from: a */
    public File f254655a = null;

    /* renamed from: b */
    public File f254656b = null;

    /* renamed from: c */
    public Context f254657c;

    /* renamed from: jv3.b$a */
    public static class C88035a {

        /* renamed from: a */
        public String f254658a;

        /* renamed from: b */
        public String f254659b;

        public C88035a(String str, String str2) {
            this.f254658a = str;
            this.f254659b = str2;
        }

        /* JADX WARNING: type inference failed for: r2v3, types: [java.io.FileInputStream, java.io.InputStream] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static jv3.C88034b.C88035a m109608a(java.io.File r6) {
            /*
                java.util.Properties r0 = new java.util.Properties
                r0.<init>()
                r1 = 0
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
                r2.<init>(r6)     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
                r0.load(r2)     // Catch:{ IOException -> 0x0021 }
                java.lang.String r6 = "md5"
                java.lang.String r6 = r0.getProperty(r6)     // Catch:{ IOException -> 0x0021 }
                java.lang.String r3 = "times"
                java.lang.String r1 = r0.getProperty(r3)     // Catch:{ IOException -> 0x001f }
            L_0x001b:
                av3.C79633a.m96712a(r2)
                goto L_0x0043
            L_0x001f:
                r0 = move-exception
                goto L_0x0029
            L_0x0021:
                r0 = move-exception
                r6 = r1
                goto L_0x0029
            L_0x0024:
                r6 = move-exception
                goto L_0x004b
            L_0x0026:
                r0 = move-exception
                r6 = r1
                r2 = r6
            L_0x0029:
                java.lang.String r3 = "Tinker.UpgradePatchRetry"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
                r4.<init>()     // Catch:{ all -> 0x0049 }
                java.lang.String r5 = "fail to readRetryProperty:"
                r4.append(r5)     // Catch:{ all -> 0x0049 }
                r4.append(r0)     // Catch:{ all -> 0x0049 }
                java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0049 }
                r4 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0049 }
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r3, r0, r4)     // Catch:{ all -> 0x0049 }
                goto L_0x001b
            L_0x0043:
                jv3.b$a r0 = new jv3.b$a
                r0.<init>(r6, r1)
                return r0
            L_0x0049:
                r6 = move-exception
                r1 = r2
            L_0x004b:
                av3.C79633a.m96712a(r1)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: jv3.C88034b.C88035a.m109608a(java.io.File):jv3.b$a");
        }

        /* renamed from: b */
        public static void m109609b(File file, C88035a aVar) {
            if (aVar != null) {
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                Properties properties = new Properties();
                properties.put("md5", aVar.f254658a);
                properties.put("times", aVar.f254659b);
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                    try {
                        properties.store(fileOutputStream2, (String) null);
                        C79633a.m96712a(fileOutputStream2);
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        try {
                            ShareTinkerLog.printErrStackTrace("Tinker.UpgradePatchRetry", e, "retry write property fail", new Object[0]);
                            C79633a.m96712a(fileOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            C79633a.m96712a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = fileOutputStream2;
                        C79633a.m96712a(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    ShareTinkerLog.printErrStackTrace("Tinker.UpgradePatchRetry", e, "retry write property fail", new Object[0]);
                    C79633a.m96712a(fileOutputStream);
                }
            }
        }
    }

    public C88034b(Context context) {
        this.f254657c = context;
        this.f254655a = new File(SharePatchFileUtil.getPatchTempDirectory(context), "patch.retry");
        this.f254656b = new File(SharePatchFileUtil.getPatchTempDirectory(context), "temp.apk");
    }

    /* renamed from: b */
    public static C88034b m109603b(Context context) {
        if (f254654d == null) {
            f254654d = new C88034b(context);
        }
        return f254654d;
    }

    /* renamed from: a */
    public final void mo122481a(File file) {
        if (!file.getAbsolutePath().equals(this.f254656b.getAbsolutePath())) {
            ShareTinkerLog.m106534w("Tinker.UpgradePatchRetry", "try copy file: %s to %s", file.getAbsolutePath(), this.f254656b.getAbsolutePath());
            try {
                SharePatchFileUtil.copyFileUsingStream(file, this.f254656b);
            } catch (IOException unused) {
                ShareTinkerLog.m106531e("Tinker.UpgradePatchRetry", "fail to copy file: %s to %s", file.getAbsolutePath(), this.f254656b.getAbsolutePath());
            }
        }
    }

    /* renamed from: c */
    public boolean mo122482c(String str) {
        int parseInt;
        if (!this.f254655a.exists()) {
            ShareTinkerLog.m106534w("Tinker.UpgradePatchRetry", "onPatchListenerCheck retry file is not exist, just return", new Object[0]);
            return true;
        } else if (str == null) {
            ShareTinkerLog.m106534w("Tinker.UpgradePatchRetry", "onPatchListenerCheck md5 is null, just return", new Object[0]);
            return true;
        } else {
            C88035a a = C88035a.m109608a(this.f254655a);
            if (!str.equals(a.f254658a) || (parseInt = Integer.parseInt(a.f254659b)) < 20) {
                return true;
            }
            ShareTinkerLog.m106534w("Tinker.UpgradePatchRetry", "onPatchListenerCheck, retry count %d must exceed than max retry count", Integer.valueOf(parseInt));
            SharePatchFileUtil.safeDeleteFile(this.f254656b);
            return false;
        }
    }

    /* renamed from: d */
    public boolean mo122483d(String str) {
        if (!this.f254655a.exists()) {
            ShareTinkerLog.m106534w("Tinker.UpgradePatchRetry", "onPatchResetMaxCheck retry file is not exist, just return", new Object[0]);
            return true;
        } else if (str == null) {
            ShareTinkerLog.m106534w("Tinker.UpgradePatchRetry", "onPatchResetMaxCheck md5 is null, just return", new Object[0]);
            return true;
        } else {
            C88035a a = C88035a.m109608a(this.f254655a);
            if (str.equals(a.f254658a)) {
                ShareTinkerLog.m106532i("Tinker.UpgradePatchRetry", "onPatchResetMaxCheck, reset max check to 1", new Object[0]);
                a.f254659b = "1";
                C88035a.m109609b(this.f254655a, a);
            }
            return true;
        }
    }

    /* renamed from: e */
    public boolean mo122484e() {
        if (!C87821a.m109275c(this.f254657c).f254235h) {
            ShareTinkerLog.m106534w("Tinker.UpgradePatchRetry", "onPatchRetryLoad retry is not main process, just return", new Object[0]);
            return false;
        } else if (!this.f254655a.exists()) {
            ShareTinkerLog.m106534w("Tinker.UpgradePatchRetry", "onPatchRetryLoad retry info not exist, just return", new Object[0]);
            return false;
        } else if (C88033a.m109601b(this.f254657c)) {
            ShareTinkerLog.m106534w("Tinker.UpgradePatchRetry", "onPatchRetryLoad tinker service is running, just return", new Object[0]);
            return false;
        } else {
            String absolutePath = this.f254656b.getAbsolutePath();
            if (absolutePath == null || !new File(absolutePath).exists()) {
                ShareTinkerLog.m106534w("Tinker.UpgradePatchRetry", "onPatchRetryLoad patch file: %s is not exist, just return", absolutePath);
                return false;
            }
            ShareTinkerLog.m106534w("Tinker.UpgradePatchRetry", "onPatchRetryLoad patch file: %s is exist, retry to patch", absolutePath);
            C87825c.m109282a(this.f254657c, absolutePath);
            return true;
        }
    }
}
