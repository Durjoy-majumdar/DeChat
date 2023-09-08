package qo0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import ej0.C86525c;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: qo0.n */
public final class C89748n implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C89741g f258088d;

    public C89748n(C89741g gVar) {
        this.f258088d = gVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C32227p<? super C86525c, ? super Integer, C13598b0> pVar = this.f258088d.f258066v;
        if (pVar != null) {
            C13598b0 invoke = pVar.invoke(null, 0);
        }
        AppBrandRuntime a = this.f258088d.f258051d.mo123732a();
        if (a != null) {
            a.mo113016K0(this.f258088d.f258069y);
        }
    }
}
