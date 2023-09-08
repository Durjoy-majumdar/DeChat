package com.tencent.p014mm.plugin.fav.p047ui;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.fav.ui.r0 */
public class C93696r0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ FavPostVoiceUI f270493d;

    public C93696r0(FavPostVoiceUI favPostVoiceUI) {
        this.f270493d = favPostVoiceUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        FavPostVoiceUI favPostVoiceUI = this.f270493d;
        int[] iArr = FavPostVoiceUI.f269760C;
        favPostVoiceUI.mo128290G7();
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
