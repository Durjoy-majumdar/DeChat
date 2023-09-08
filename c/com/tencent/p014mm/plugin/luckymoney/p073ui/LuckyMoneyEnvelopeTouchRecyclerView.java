package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyEnvelopeTouchRecyclerView */
public class LuckyMoneyEnvelopeTouchRecyclerView extends RecyclerView {

    /* renamed from: y1 */
    public C69394a f199954y1;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyEnvelopeTouchRecyclerView$a */
    public interface C69394a {
    }

    public LuckyMoneyEnvelopeTouchRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C69394a aVar = this.f199954y1;
        if (aVar != null) {
            LuckyMoneyPickEnvelopeUI.C69486h hVar = (LuckyMoneyPickEnvelopeUI.C69486h) aVar;
            hVar.getClass();
            if (motionEvent.getAction() == 0) {
                LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = LuckyMoneyPickEnvelopeUI.this;
                luckyMoneyPickEnvelopeUI.f200518B = luckyMoneyPickEnvelopeUI.f200519C.mo80268n(luckyMoneyPickEnvelopeUI.f200547i);
                LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI2 = LuckyMoneyPickEnvelopeUI.this;
                luckyMoneyPickEnvelopeUI2.f200519C.f162886f = luckyMoneyPickEnvelopeUI2.f200518B;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public LuckyMoneyEnvelopeTouchRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
