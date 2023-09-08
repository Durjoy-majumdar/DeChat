package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsSwitchAccountUI;
import com.tencent.p014mm.plugin.setting.p102ui.widget.SwitchAccountGridView;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75593t5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import p156gj.C87203t;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.i3 */
public class C85444i3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f249031d;

    /* renamed from: e */
    public final /* synthetic */ SettingsSwitchAccountUI.C85428g f249032e;

    public C85444i3(SettingsSwitchAccountUI.C85428g gVar, String str) {
        this.f249032e = gVar;
        this.f249031d = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105925i("MicroMsg.SettingsSwitchAccountUI", "delete %s", this.f249031d);
        SettingsSwitchAccountUI.this.f248997r = true;
        C75593t5.f222075c.mo105947j(this.f249031d);
        ((HashMap) SettingsSwitchAccountUI.this.f248998s).remove(this.f249031d);
        SwitchAccountGridView switchAccountGridView = SettingsSwitchAccountUI.this.f248987e;
        String str = this.f249031d;
        if (((ArrayList) switchAccountGridView.f249042i).contains(str)) {
            int indexOf = ((ArrayList) switchAccountGridView.f249042i).indexOf(str);
            ((ArrayList) switchAccountGridView.f249042i).remove(str);
            ((ArrayList) switchAccountGridView.f249043j).remove(indexOf);
            ((ArrayList) switchAccountGridView.f249044n).remove(indexOf);
        }
        SettingsSwitchAccountUI.this.mo118785M7();
        SettingsSwitchAccountUI.this.f248987e.mo118801b();
        if (SettingsSwitchAccountUI.this.f248995p != 0) {
            return;
        }
        if (((HashSet) C75593t5.f222075c.mo105942e()).size() > 0) {
            C115669n.INSTANCE.mo160131h(14978, 1, 4, C75593t5.f222075c.mo105944g(), C75593t5.f222075c.mo105943f(), C87203t.m108273i());
            return;
        }
        C115669n.INSTANCE.mo160131h(14978, 0, 4, C75593t5.f222075c.mo105944g(), C75593t5.f222075c.mo105943f(), C87203t.m108273i());
    }
}
