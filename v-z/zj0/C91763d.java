package zj0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import p156gj.C107835h0;

/* renamed from: zj0.d */
public class C91763d {

    /* renamed from: a */
    public static boolean f262822a;

    /* renamed from: a */
    public static void m115295a(Context context) {
        String str = C107835h0.f322854k.f252863b;
        if (f262822a) {
            Log.m105924i("MicroMsg.WAGameShowFailDialogUtil", "hy: already shown");
            return;
        }
        String string = MMApplicationContext.getResources().getString(C0966R.string.a5f);
        C81956c.m100673a(context, !Util.isNullOrNil(str) ? str : string, MMApplicationContext.getResources().getString(C0966R.string.a3h), MMApplicationContext.getResources().getString(C0966R.string.a18), "", new C91760a(), new C91761b(), new C91762c());
        f262822a = true;
    }
}
