package vg3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import qo3.C77390c0;
import qo3.C77393e;

/* renamed from: vg3.b */
public final class C118676b {
    /* renamed from: a */
    public static void m167362a(Context context, Dialog dialog) {
        if (context instanceof MMActivity) {
            ((MMActivity) context).addDialog(dialog);
            if (!(context instanceof C77393e)) {
                return;
            }
            if (dialog instanceof C118677e) {
                ((C118677e) dialog).f355129u = (C77393e) context;
            } else if (dialog instanceof C77390c0) {
                ((C77390c0) dialog).setiOnDialogDismissListener((C77393e) context);
            }
        }
    }

    /* renamed from: b */
    public static C118677e m167363b(Context context, String str, String str2, String str3, String str4, boolean z, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C118675a aVar = new C118675a();
        aVar.f355108a = str2;
        aVar.f355109b = str;
        aVar.f355110c = str3;
        aVar.f355113f = onClickListener;
        aVar.f355111d = str4;
        aVar.f355114g = onClickListener2;
        aVar.f355112e = z;
        C118677e eVar = new C118677e(context, C0966R.style.a66);
        eVar.mo183393a(aVar);
        eVar.show();
        m167362a(context, eVar);
        return eVar;
    }

    /* renamed from: c */
    public static C118677e m167364c(Context context, String str, String str2, boolean z, DialogInterface.OnClickListener onClickListener) {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        C118675a aVar = new C118675a();
        aVar.f355108a = str2;
        aVar.f355109b = str;
        aVar.f355110c = context.getString(C0966R.string.a18);
        aVar.f355113f = onClickListener;
        aVar.f355112e = z;
        C118677e eVar = new C118677e(context, C0966R.style.a66);
        eVar.mo183393a(aVar);
        eVar.show();
        m167362a(context, eVar);
        return eVar;
    }
}
