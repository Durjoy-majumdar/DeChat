package com.tencent.p014mm.plugin.luckymoney.story;

import android.view.MotionEvent;
import com.tencent.p014mm.plugin.luckymoney.p073ui.HorizontalLayoutManager;
import com.tencent.p014mm.plugin.luckymoney.scaledLayout.C56850a;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.r */
public class C56852r implements RecyclerHorizontalViewPager.C57876b {

    /* renamed from: a */
    public final /* synthetic */ C56850a f162891a;

    /* renamed from: b */
    public final /* synthetic */ HorizontalLayoutManager f162892b;

    public C56852r(EnvelopeAppBarLayout envelopeAppBarLayout, C56850a aVar, HorizontalLayoutManager horizontalLayoutManager) {
        this.f162891a = aVar;
        this.f162892b = horizontalLayoutManager;
    }

    /* renamed from: a */
    public void mo37032a(MotionEvent motionEvent) {
    }

    /* renamed from: b */
    public boolean mo37033b(int i, MotionEvent motionEvent, boolean z) {
        if (motionEvent.getAction() == 0) {
            C56850a aVar = this.f162891a;
            aVar.f162886f = aVar.mo80268n(this.f162892b);
        }
        return z;
    }
}
