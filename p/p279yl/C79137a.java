package p279yl;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import f40.C86718e;
import ke3.C88144b;
import p286zl.C16292g;
import p286zl.C39373h;
import qg0.C12215a;

@C86522b
/* renamed from: yl.a */
public class C79137a extends C86301e implements C16292g, C39373h {
    public void nr0(Context context, String str, int i, boolean z) {
        C12215a.m11778c(context, str, i, z);
    }

    public boolean xu0(Intent intent, Context context, Class<?> cls) {
        if (C86709a0.m107523b().mo121115m() && !C86718e.m107551r()) {
            return false;
        }
        Log.m105928w("MicroMsg.AccountSdkFeatureService", "not login");
        Intent intent2 = new Intent(context, cls);
        intent2.putExtras(intent);
        intent2.addFlags(67108864);
        intent2.setDataAndType(intent.getData(), intent.getType());
        intent2.setAction(intent.getAction());
        Intent intent3 = new Intent();
        intent3.putExtras(intent);
        C88144b.m109780B(context, "account", "com.tencent.mm.plugin.account.ui.SimpleLoginUI", intent3, intent2);
        return true;
    }
}
