package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C68777r4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19641z0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.q4 */
public class C18489q4 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineUI f51337d;

    public C18489q4(BizTimeLineUI bizTimeLineUI) {
        this.f51337d = bizTimeLineUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f51337d.f50218K = true;
        C19641z0 z0Var = C19641z0.f55645a;
        C19641z0.f55649e = true;
        C68777r4.C18492a aVar = C68777r4.f197582a;
        if (aVar != null && aVar.f51350e == 0) {
            C68777r4.C18492a aVar2 = C68777r4.f197582a;
            C87412m.m108591d(aVar2);
            aVar2.f51350e = (int) (System.currentTimeMillis() - C68777r4.f197583b);
            Log.m105924i("MicroMsg.BizTimeReport", "markFirstTouchDown");
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
