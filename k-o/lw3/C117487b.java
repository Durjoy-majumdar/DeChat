package lw3;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.io.File;
import rv3.C118245h;
import rv3.C90102d;

/* renamed from: lw3.b */
public class C117487b {

    /* renamed from: a */
    public String f351591a;

    /* renamed from: a */
    public static long m165723a(C117487b bVar, File file) {
        bVar.getClass();
        if (file == null) {
            return MAlarmHandler.NEXT_FIRE_INTERVAL;
        }
        String[] split = file.getName().split("_");
        return split.length != 2 ? MAlarmHandler.NEXT_FIRE_INTERVAL : Long.parseLong(split[1]);
    }

    /* renamed from: b */
    public String mo182195b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return str + File.separator + str2;
    }

    /* renamed from: c */
    public File[] mo182196c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.listFiles();
        }
        return null;
    }

    /* renamed from: d */
    public File mo182197d(Context context) {
        if (context == null) {
            return null;
        }
        if (TextUtils.isEmpty(this.f351591a)) {
            this.f351591a = C90102d.m112732a(C90102d.f258757a);
        }
        if (TextUtils.isEmpty(this.f351591a)) {
            return null;
        }
        String str = "dir : " + this.f351591a;
        if (C118245h.f353423a) {
            Log.m105918d("Persistence", str);
        }
        return context.getDir(this.f351591a, 0);
    }

    /* renamed from: e */
    public File mo182198e(File file, String str) {
        if (file == null) {
            return null;
        }
        File file2 = new File(file.getAbsolutePath() + File.separator + str);
        if (file2.exists() || file2.mkdirs()) {
            return file2;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0020 A[Catch:{ all -> 0x001d, all -> 0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo182199f(java.lang.String r4, byte[] r5) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0008
            r4 = 0
            return r4
        L_0x0008:
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x001e }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x001e }
            r2.<init>(r4)     // Catch:{ all -> 0x001e }
            r1.<init>(r2)     // Catch:{ all -> 0x001e }
            r1.write(r5)     // Catch:{ all -> 0x001d }
            r1.flush()     // Catch:{ all -> 0x001d }
            r1.close()     // Catch:{ all -> 0x0023 }
            goto L_0x0023
        L_0x001d:
            r0 = r1
        L_0x001e:
            if (r0 == 0) goto L_0x0023
            r0.close()     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lw3.C117487b.mo182199f(java.lang.String, byte[]):boolean");
    }
}
