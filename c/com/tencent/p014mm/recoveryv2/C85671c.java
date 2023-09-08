package com.tencent.p014mm.recoveryv2;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.booter.C80814d;
import com.tencent.p014mm.recoveryv2.C85675e;
import com.tencent.p014mm.recoveryv2.C85692k;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.recoveryv2.c */
public class C85671c {
    /* renamed from: a */
    public static void m105783a(Context context) {
        m105784b("MicroMsg.recovery.logger", "flush recovery log to file");
        C85675e.C85677b bVar = new C85675e.C85677b(context);
        bVar.mo119261a();
        C80814d.m98665b(context).mo112570e("RECOVERY");
        String b = bVar.mo119262b();
        if (TextUtils.isEmpty(b)) {
            b = "nothing";
        }
        Log.m105924i("MicroMsg.recovery.logger", ">>>>> dump recovery internal log (:recovery) <<<<<");
        Log.m105924i("MicroMsg.recovery.logger", "\n" + b);
        Log.m105924i("MicroMsg.recovery.logger", ">>>>>>>>>>>>>>>>>>>>>> end <<<<<<<<<<<<<<<<<<<<<<<");
        Log.appenderFlush();
    }

    /* renamed from: b */
    public static void m105784b(String str, String str2) {
        Log.m105924i(str, str2);
        C85692k.C85693a.m105840a(4, str, str2);
    }

    /* renamed from: c */
    public static void m105785c(String str, String str2, Throwable th) {
        Log.printErrStackTrace(str, th, str2, new Object[0]);
        C85692k.m105839a(str, str2, th);
    }
}
