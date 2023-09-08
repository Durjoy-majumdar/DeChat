package sp1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C8478d0;
import gy3.C87413o;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: sp1.k */
public final class C13772k extends C87413o implements C32226l<Float, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveGiftTextView f38887d;

    /* renamed from: e */
    public final /* synthetic */ View f38888e;

    /* renamed from: f */
    public final /* synthetic */ C8477a0 f38889f;

    /* renamed from: g */
    public final /* synthetic */ C15601d<Boolean> f38890g;

    /* renamed from: h */
    public final /* synthetic */ TextView f38891h;

    /* renamed from: i */
    public final /* synthetic */ C8478d0 f38892i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13772k(FinderLiveGiftTextView finderLiveGiftTextView, View view, C8477a0 a0Var, C15601d<? super Boolean> dVar, TextView textView, C8478d0 d0Var) {
        super(1);
        this.f38887d = finderLiveGiftTextView;
        this.f38888e = view;
        this.f38889f = a0Var;
        this.f38890g = dVar;
        this.f38891h = textView;
        this.f38892i = d0Var;
    }

    public Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        this.f38887d.setAlpha(floatValue);
        if (floatValue == 1.0f) {
            this.f38888e.getLayoutParams().width = -2;
            C8477a0 a0Var = this.f38889f;
            if (!a0Var.f27482d) {
                a0Var.f27482d = true;
                C15601d<Boolean> dVar = this.f38890g;
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
            }
        } else if (floatValue > 0.5f) {
            this.f38891h.setTextSize(2, (float) this.f38892i.f27483d);
            TextView textView = this.f38891h;
            textView.setText(textView.getContext().getResources().getString(C0966R.string.mbm));
        }
        return C13598b0.f38549a;
    }
}
