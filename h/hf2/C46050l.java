package hf2;

import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.NewBizInfoSettingUI;
import cw0.C116541b;

/* renamed from: hf2.l */
public class C46050l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NewBizInfoSettingUI f124173d;

    public C46050l(NewBizInfoSettingUI newBizInfoSettingUI) {
        this.f124173d = newBizInfoSettingUI;
    }

    public void run() {
        if (!this.f124173d.isFinishing()) {
            NewBizInfoSettingUI newBizInfoSettingUI = this.f124173d;
            C116541b.m164352b(newBizInfoSettingUI, newBizInfoSettingUI.f115447e.getUsername(), true);
            C116541b.m164360j(this.f124173d);
        }
    }
}
