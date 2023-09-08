package be2;

import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86012p1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import z04.C119027c;
import zt3.C119157j;

/* renamed from: be2.c */
public class C79693c {

    /* renamed from: a */
    public static final MultiProcessMMKV f233599a = MultiProcessMMKV.getMMKV("diagnostic_storage");

    /* renamed from: b */
    public static final String f233600b = ("KEY_USER_MEM_CAP_INT_" + Build.FINGERPRINT);

    /* renamed from: c */
    public static int f233601c;

    /* renamed from: be2.c$a */
    public class C79694a implements Runnable {
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
            r6 = java.lang.Long.valueOf(r6[0], 16).longValue();
            com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.performance.Utils", "begin = %x, line = %s", java.lang.Long.valueOf(r6), r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
            if (r6 >= 3221225472L) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r4.close();
            r1 = 4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                java.lang.String r0 = "MicroMsg.performance.Utils"
                java.lang.String r1 = "[MEM] detectMaps"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                r1 = 3
                r2 = 1
                r3 = 0
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x0076 }
                java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x0076 }
                java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0076 }
                java.lang.String r7 = "/proc/self/maps"
                r6.<init>(r7)     // Catch:{ all -> 0x0076 }
                r5.<init>(r6)     // Catch:{ all -> 0x0076 }
                r4.<init>(r5)     // Catch:{ all -> 0x0076 }
            L_0x001b:
                java.lang.String r5 = r4.readLine()     // Catch:{ all -> 0x006c }
                if (r5 == 0) goto L_0x0068
                java.lang.String r6 = "[stack]"
                boolean r6 = r5.endsWith(r6)     // Catch:{ all -> 0x006c }
                if (r6 == 0) goto L_0x001b
                java.lang.String r6 = " "
                java.lang.String[] r6 = r5.split(r6)     // Catch:{ all -> 0x006c }
                int r7 = r6.length     // Catch:{ all -> 0x006c }
                if (r7 < r2) goto L_0x001b
                r6 = r6[r3]     // Catch:{ all -> 0x006c }
                java.lang.String r7 = "-"
                java.lang.String[] r6 = r6.split(r7)     // Catch:{ all -> 0x006c }
                int r7 = r6.length     // Catch:{ all -> 0x006c }
                r8 = 2
                if (r7 != r8) goto L_0x001b
                r6 = r6[r3]     // Catch:{ all -> 0x006c }
                r7 = 16
                java.lang.Long r6 = java.lang.Long.valueOf(r6, r7)     // Catch:{ all -> 0x006c }
                long r6 = r6.longValue()     // Catch:{ all -> 0x006c }
                java.lang.String r9 = "begin = %x, line = %s"
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x006c }
                java.lang.Long r10 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x006c }
                r8[r3] = r10     // Catch:{ all -> 0x006c }
                r8[r2] = r5     // Catch:{ all -> 0x006c }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r9, r8)     // Catch:{ all -> 0x006c }
                r8 = 3221225472(0xc0000000, double:1.591496843E-314)
                int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r5 >= 0) goto L_0x0063
                goto L_0x0068
            L_0x0063:
                r4.close()     // Catch:{ all -> 0x0076 }
                r1 = 4
                goto L_0x007e
            L_0x0068:
                r4.close()     // Catch:{ all -> 0x0076 }
                goto L_0x007e
            L_0x006c:
                r5 = move-exception
                r4.close()     // Catch:{ all -> 0x0071 }
                goto L_0x0075
            L_0x0071:
                r4 = move-exception
                r5.addSuppressed(r4)     // Catch:{ all -> 0x0076 }
            L_0x0075:
                throw r5     // Catch:{ all -> 0x0076 }
            L_0x0076:
                r4 = move-exception
                java.lang.Object[] r5 = new java.lang.Object[r3]
                java.lang.String r6 = "MEM detectMaps failed"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r4, r6, r5)
            L_0x007e:
                be2.C79693c.f233601c = r1
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = be2.C79693c.f233599a
                java.lang.String r4 = be2.C79693c.f233600b
                int r5 = be2.C79693c.f233601c
                r1.encode((java.lang.String) r4, (int) r5)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                int r2 = be2.C79693c.f233601c
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1[r3] = r2
                java.lang.String r2 = "[MEM] detectMaps = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: be2.C79693c.C79694a.run():void");
        }
    }

    /* renamed from: a */
    public static String m96807a(Object[] objArr) {
        if (objArr == null) {
            return "null";
        }
        int length = objArr.length - 1;
        if (length == -1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            sb.append(String.valueOf(objArr[i]));
            if (i == length) {
                return sb.toString();
            }
            sb.append(";");
            i++;
        }
    }

    /* renamed from: b */
    public static void m96808b(C86009m1 m1Var) {
        C86009m1 m1Var2 = new C86009m1(MMApplicationContext.getContext().getExternalCacheDir() + "/Diagnostic");
        C86009m1 m1Var3 = new C86009m1(m1Var2, m1Var.getName());
        Log.m105925i("MicroMsg.performance.Utils", "DevEnv: copy [%s] to sdcard [%s]", m1Var.mo119971i(), m1Var3.mo119971i());
        if (!m1Var2.mo119967g()) {
            m1Var2.mo119987x();
        }
        C86013q1.m106463x(m1Var.mo119971i(), m1Var3.mo119971i());
    }

    /* renamed from: c */
    public static boolean m96809c() {
        int decodeInt = f233599a.decodeInt(f233600b, 0);
        f233601c = decodeInt;
        if (decodeInt != 0 || !MMApplicationContext.isMainProcess()) {
            Log.m105925i("MicroMsg.performance.Utils", "[MEM] detect3GUserSpace = %d", Integer.valueOf(f233601c));
            return f233601c == 3;
        }
        ((C119157j) C119157j.f356862d).mo183884o(new C79694a());
        return true;
    }

    /* renamed from: d */
    public static void m96810d(String str, C86009m1 m1Var) {
        BufferedReader bufferedReader;
        IOException e;
        Log.m105925i(str, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> dump file = %s, modified = %s", m1Var.getName(), m96812f(m1Var.mo119979q()));
        if (m1Var.mo119967g()) {
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(C86013q1.m106422D(m1Var)));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        Log.m105924i(str, readLine);
                    } catch (IOException e2) {
                        e = e2;
                        try {
                            Log.printErrStackTrace(str, e, "", new Object[0]);
                            Util.qualityClose(bufferedReader);
                            m1Var.mo119966f();
                            Log.m105925i(str, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< dump file = %s, modified = %s", m1Var.getName(), m96812f(m1Var.mo119979q()));
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            Util.qualityClose(bufferedReader2);
                            m1Var.mo119966f();
                            throw th;
                        }
                    }
                }
                if (WeChatEnvironment.isMonkeyEnv() || WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                    m96808b(m1Var);
                }
            } catch (IOException e3) {
                IOException iOException = e3;
                bufferedReader = null;
                e = iOException;
                Log.printErrStackTrace(str, e, "", new Object[0]);
                Util.qualityClose(bufferedReader);
                m1Var.mo119966f();
                Log.m105925i(str, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< dump file = %s, modified = %s", m1Var.getName(), m96812f(m1Var.mo119979q()));
            } catch (Throwable th4) {
                th = th4;
                Util.qualityClose(bufferedReader2);
                m1Var.mo119966f();
                throw th;
            }
            Util.qualityClose(bufferedReader);
            m1Var.mo119966f();
        }
        Log.m105925i(str, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< dump file = %s, modified = %s", m1Var.getName(), m96812f(m1Var.mo119979q()));
    }

    /* renamed from: e */
    public static String m96811e(String str) {
        String str2;
        IOException e;
        C86012p1 p1Var;
        Charset charset = C119027c.f356488a;
        C86009m1 m1Var = new C86009m1(str);
        try {
            p1Var = new C86012p1(m1Var);
            int r = (int) m1Var.mo119980r();
            byte[] bArr = new byte[r];
            int i = 0;
            while (true) {
                if (i >= r) {
                    break;
                }
                int read = p1Var.read(bArr, i, r - i);
                if (read == -1) {
                    break;
                }
                i += read;
            }
            str2 = new String(bArr, charset);
            try {
                p1Var.close();
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            str2 = null;
            e = e3;
            Log.printErrStackTrace("MicroMsg.performance.Utils", e, "", new Object[0]);
            return str2;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return str2;
        throw th;
    }

    /* renamed from: f */
    public static String m96812f(long j) {
        return new SimpleDateFormat("yy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j));
    }
}
