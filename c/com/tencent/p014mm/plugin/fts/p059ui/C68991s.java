package com.tencent.p014mm.plugin.fts.p059ui;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.fts.ui.s */
public class C68991s implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ FTSBaseVoiceSearchUI f198239d;

    public C68991s(FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI) {
        this.f198239d = fTSBaseVoiceSearchUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f198239d.f52761d.mo153849a();
        this.f198239d.hideVKB();
        this.f198239d.getClass();
        boolean z = !this.f198239d.f52765h;
        C117292a.m165362h(z, this, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z;
    }
}
