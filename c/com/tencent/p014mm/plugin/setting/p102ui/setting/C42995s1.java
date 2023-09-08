package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsAuthUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.s1 */
public final class C42995s1 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsAuthUI.C42929a f116407d;

    public C42995s1(SettingsAuthUI.C42929a aVar) {
        this.f116407d = aVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$SettingsAuthListAdapter$updateAuthItem$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if ((motionEvent.getAction() & 255) == 0) {
            this.f116407d.f116258n = (int) motionEvent.getRawX();
            this.f116407d.f116259o = (int) motionEvent.getRawY();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$SettingsAuthListAdapter$updateAuthItem$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
