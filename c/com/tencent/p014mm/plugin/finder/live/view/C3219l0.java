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

/* renamed from: com.tencent.mm.plugin.finder.live.view.l0 */
public final class C3219l0 extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveFoldTextView f15340d;

    public C3219l0(FinderLiveFoldTextView finderLiveFoldTextView) {
        this.f15340d = finderLiveFoldTextView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveFoldTextView$makeCanFoldFullText$2$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        FinderLiveFoldTextView finderLiveFoldTextView = this.f15340d;
        finderLiveFoldTextView.setMaxLines(finderLiveFoldTextView.f15235Q0);
        finderLiveFoldTextView.mo104279b(finderLiveFoldTextView.f15239x0);
        finderLiveFoldTextView.f15236V = true;
        finderLiveFoldTextView.setScrollY(0);
        C32224a<C13598b0> aVar = finderLiveFoldTextView.f15238p0;
        if (aVar != null) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveFoldTextView$makeCanFoldFullText$2$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f15340d.getContext().getResources().getColor(C0966R.color.f3423sb));
    }
}
