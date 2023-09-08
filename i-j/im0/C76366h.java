package im0;

import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import kg3.C76577a;

/* renamed from: im0.h */
public class C76366h implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ TextView f223647d;

    /* renamed from: e */
    public final /* synthetic */ C76362f f223648e;

    public C76366h(C76362f fVar, TextView textView) {
        this.f223648e = fVar;
        this.f223647d = textView;
    }

    public void onGlobalLayout() {
        if (this.f223647d.getLineCount() > 1) {
            TextView textView = this.f223647d;
            textView.setTextSize(0, (float) C76577a.m92157h(textView.getContext(), C0966R.dimen.f3684bd));
            TextView textView2 = this.f223647d;
            C76362f fVar = this.f223648e;
            int h = C76577a.m92157h(textView2.getContext(), C0966R.dimen.f3890i1);
            fVar.getClass();
            textView2.setSpannableFactory(new C76367i(fVar, h));
        }
        this.f223647d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
