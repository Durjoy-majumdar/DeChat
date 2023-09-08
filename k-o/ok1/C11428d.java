package ok1;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import qj1.C62660c;

/* renamed from: ok1.d */
public final class C11428d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C62660c f33610d;

    /* renamed from: e */
    public final /* synthetic */ boolean f33611e;

    /* renamed from: f */
    public final /* synthetic */ boolean f33612f;

    public C11428d(C62660c cVar, boolean z, boolean z2) {
        this.f33610d = cVar;
        this.f33611e = z;
        this.f33612f = z2;
    }

    public final void run() {
        if (this.f33610d.f177935f.getLayoutParams() != null && (this.f33610d.f177935f.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && this.f33610d.mo82893g0()) {
            int d0 = this.f33610d.mo82891d0();
            C62042e eVar = C62042e.f176370a;
            Context context = this.f33610d.f177935f.getContext();
            C87412m.m108593f(context, "plugin.vg.context");
            int h0 = eVar.mo87083h0(context, eVar.mo87073d1(this.f33610d.mo87684A0()) || eVar.mo87035Q0(this.f33610d.mo87684A0()));
            if (this.f33611e) {
                ViewGroup.LayoutParams layoutParams = this.f33610d.f177935f.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = h0;
            }
            if (this.f33612f) {
                ViewGroup.LayoutParams layoutParams2 = this.f33610d.f177935f.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = h0;
            }
            this.f33610d.f177935f.requestLayout();
            this.f33610d.f177935f.setTag(C0966R.C0970id.dvj, Integer.valueOf(d0));
        }
    }
}
