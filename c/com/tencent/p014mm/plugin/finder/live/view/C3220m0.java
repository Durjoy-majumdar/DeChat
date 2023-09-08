package com.tencent.p014mm.plugin.finder.live.view;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.live.view.m0 */
public final class C3220m0 extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveFoldTextView f15341d;

    public C3220m0(FinderLiveFoldTextView finderLiveFoldTextView) {
        this.f15341d = finderLiveFoldTextView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveFoldTextView$makeFoldingText$2$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        FinderLiveFoldTextView finderLiveFoldTextView = this.f15341d;
        finderLiveFoldTextView.setMaxLines(88);
        finderLiveFoldTextView.mo104279b(finderLiveFoldTextView.f15240y0);
        finderLiveFoldTextView.f15236V = false;
        C32224a<C13598b0> aVar = finderLiveFoldTextView.f15237W;
        if (aVar != null) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveFoldTextView$makeFoldingText$2$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f15341d.getContext().getResources().getColor(C0966R.color.f3423sb));
    }
}
