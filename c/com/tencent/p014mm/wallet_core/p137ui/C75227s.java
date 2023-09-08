package com.tencent.p014mm.wallet_core.p137ui;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import xb3.C78781k;
import yb3.C79064a;
import yb3.C79066c;

/* renamed from: com.tencent.mm.wallet_core.ui.s */
public class C75227s extends C78781k {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75227s(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        C87412m.m108594g(appCompatActivity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C79066c cVar = C79066c.ViewId_WcPayKeyboard_Action_Btn;
        MMFragmentActivity mMFragmentActivity = (MMFragmentActivity) appCompatActivity2;
        C79064a aVar = new C79064a(true, true, 300, (View) null, C0966R.C0970id.ffp, cVar.toString(), mMFragmentActivity, false, 0, 0);
        aVar.f232172c = 500;
        mo108699c3("keyboard_show_1", aVar);
        C79064a aVar2 = new C79064a(true, true, 300, (View) null, C0966R.C0970id.ffp, cVar.toString(), mMFragmentActivity, false, 0, 0);
        aVar.f232172c = 500;
        mo108699c3("keyboard_show_2", aVar2);
    }

    /* renamed from: i3 */
    public final void mo105155i3(int i) {
        C79066c cVar = C79066c.ViewId_WcPayKeyboard_Action_Btn;
        if (i == 1) {
            mo108701e3(cVar.toString());
            return;
        }
        mo108701e3(cVar.toString());
        mo108701e3(C79066c.ViewId_WcPayKeyboard_Anim_Action_Btn.toString());
    }

    /* renamed from: j3 */
    public final void mo105156j3(int i) {
        C78781k.C78782a aVar = C78781k.C78782a.Event_Custom;
        if (i == 1) {
            mo108702f3(aVar, "keyboard_show_1");
        } else if (i == 2) {
            mo108702f3(aVar, "keyboard_show_2");
        }
    }
}
