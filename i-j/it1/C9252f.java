package it1;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import qo3.C89779i0;

/* renamed from: it1.f */
public final class C9252f extends C9254h {

    /* renamed from: b */
    public C89779i0 f28995b;

    /* renamed from: c */
    public String f28996c;

    /* renamed from: d */
    public DialogInterface.OnCancelListener f28997d;

    public C9252f() {
        String string = MMApplicationContext.getContext().getString(C0966R.string.a4d);
        C87412m.m108593f(string, "getContext().getString(c…mui.R.string.app_waiting)");
        this.f28996c = string;
    }

    /* renamed from: a */
    public void mo10029a() {
        C89779i0 i0Var = this.f28995b;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }

    /* renamed from: b */
    public void mo10030b() {
        Context context;
        WeakReference<Context> weakReference = this.f28999a;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = MMApplicationContext.getContext();
        }
        String str = this.f28996c;
        DialogInterface.OnCancelListener onCancelListener = this.f28997d;
        this.f28995b = C89779i0.m112248e(context, str, onCancelListener != null, 0, onCancelListener);
    }
}
