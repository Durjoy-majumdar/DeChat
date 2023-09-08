package ea3;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import nj3.C76879j;
import qo3.C89779i0;

/* renamed from: ea3.e */
public final class C45588e {

    /* renamed from: a */
    public static final C45588e f123306a = new C45588e();

    /* renamed from: ea3.e$a */
    public static final class C45589a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public static final C45589a f123307d = new C45589a();

        public final void onCancel(DialogInterface dialogInterface) {
            try {
                dialogInterface.dismiss();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ToastUtil", "showProgressDlg onCancel exp: %s ", e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: a */
    public final C89779i0 mo71111a(String str, Context context, C89779i0 i0Var) {
        Context context2;
        C87412m.m108594g(str, "wording");
        C87412m.m108594g(context, "context");
        if (context instanceof MMActivity) {
            context2 = context;
        } else {
            context2 = context;
            while (!(context2 instanceof MMActivity) && (context2 instanceof ContextWrapper)) {
                context2 = ((ContextWrapper) context2).getBaseContext();
                C87412m.m108593f(context2, "baseContext.baseContext");
            }
        }
        MMActivity mMActivity = context2 instanceof MMActivity ? (MMActivity) context2 : null;
        boolean z = true;
        if (mMActivity == null || !mMActivity.isFinishing()) {
            z = false;
        }
        if (z) {
            return null;
        }
        if (i0Var != null) {
            if (i0Var.isShowing()) {
                i0Var.dismiss();
            }
            if (!i0Var.isShowing()) {
                i0Var.show();
                return i0Var;
            }
        }
        return C76879j.m92723Q(context, (String) null, str, true, true, C45589a.f123307d);
    }
}
