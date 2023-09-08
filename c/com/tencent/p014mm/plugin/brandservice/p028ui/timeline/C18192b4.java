package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C68777r4;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.b4 */
public class C18192b4 implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineUI f50275d;

    public C18192b4(BizTimeLineUI bizTimeLineUI) {
        this.f50275d = bizTimeLineUI;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        BizTimeLineUI bizTimeLineUI = this.f50275d;
        bizTimeLineUI.f50246s.mo23140d(bizTimeLineUI.f50235f.getFirstVisiblePosition() - this.f50275d.f50235f.getHeaderViewsCount(), this.f50275d.f50235f.getLastVisiblePosition());
        this.f50275d.f50235f.removeOnLayoutChangeListener(this);
        C68777r4.C18492a aVar = C68777r4.f197582a;
        if (aVar != null && aVar.f51348c == 0) {
            C68777r4.C18492a aVar2 = C68777r4.f197582a;
            C87412m.m108591d(aVar2);
            aVar2.f51348c = (int) (System.currentTimeMillis() - C68777r4.f197583b);
            Log.m105924i("MicroMsg.BizTimeReport", "markFirstGetView");
        }
    }
}
