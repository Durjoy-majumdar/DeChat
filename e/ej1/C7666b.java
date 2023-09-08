package ej1;

import android.view.ViewGroup;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveFoldTextView;
import fy3.C32230s;
import gy3.C8479f0;
import rx3.C13598b0;

/* renamed from: ej1.b */
public final class C7666b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveFoldTextView f26018d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<ViewGroup> f26019e;

    /* renamed from: f */
    public final /* synthetic */ C32230s<FinderLiveFoldTextView, CharSequence, Integer, Integer, Boolean, C13598b0> f26020f;

    /* renamed from: g */
    public final /* synthetic */ CharSequence f26021g;

    /* renamed from: h */
    public final /* synthetic */ int f26022h;

    /* renamed from: i */
    public final /* synthetic */ boolean f26023i;

    public C7666b(FinderLiveFoldTextView finderLiveFoldTextView, C8479f0<ViewGroup> f0Var, C32230s<? super FinderLiveFoldTextView, ? super CharSequence, ? super Integer, ? super Integer, ? super Boolean, C13598b0> sVar, CharSequence charSequence, int i, boolean z) {
        this.f26018d = finderLiveFoldTextView;
        this.f26019e = f0Var;
        this.f26020f = sVar;
        this.f26021g = charSequence;
        this.f26022h = i;
        this.f26023i = z;
    }

    public final void run() {
        if (this.f26018d.getLineCount() > 1) {
            T t = this.f26019e.f27484d;
            ((ViewGroup) t).setPadding(0, ((ViewGroup) t).getPaddingTop(), 0, ((ViewGroup) this.f26019e.f27484d).getPaddingBottom());
            this.f26018d.setSpacingAdd(5);
            C32230s<FinderLiveFoldTextView, CharSequence, Integer, Integer, Boolean, C13598b0> sVar = this.f26020f;
            FinderLiveFoldTextView finderLiveFoldTextView = this.f26018d;
            sVar.mo237D(finderLiveFoldTextView, this.f26021g, Integer.valueOf(finderLiveFoldTextView.getLineCount()), Integer.valueOf(this.f26022h), Boolean.valueOf(this.f26023i));
            return;
        }
        T t2 = this.f26019e.f27484d;
        ((ViewGroup) t2).setPadding(0, ((ViewGroup) t2).getPaddingTop(), ((ViewGroup) this.f26019e.f27484d).getPaddingRight(), ((ViewGroup) this.f26019e.f27484d).getPaddingBottom());
    }
}
