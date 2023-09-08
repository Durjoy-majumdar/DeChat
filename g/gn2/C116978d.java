package gn2;

import android.widget.TextView;
import bh3.C113177k;
import cc0.C92411b;
import com.tencent.p014mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.setting.p102ui.setting.view.SettingPermissionView;
import di3.C86312j;
import eb0.C45628s0;
import gy3.C87412m;
import p156gj.C87203t;
import p702ts.C78085c;

/* renamed from: gn2.d */
public final class C116978d implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ SettingPermissionView f350543a;

    public C116978d(SettingPermissionView settingPermissionView) {
        this.f350543a = settingPermissionView;
    }

    public final void onStatusChange(boolean z) {
        C92411b ms;
        Class cls = C113177k.class;
        this.f350543a.f347190p = z;
        C113177k kVar = (C113177k) C86312j.m106911c(cls);
        SettingPermissionView settingPermissionView = this.f350543a;
        String str = settingPermissionView.f347183f;
        if (str != null) {
            String str2 = settingPermissionView.f347184g;
            if (str2 != null) {
                kVar.mo165721yX(str, str2, z);
                long j = z ? 104 : 103;
                UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct = new UserPrivacySettingClientReportStruct();
                userPrivacySettingClientReportStruct.f10079d = j;
                userPrivacySettingClientReportStruct.f10084i = userPrivacySettingClientReportStruct.mo86045b("DeviceID", C87203t.m108266b(), true);
                userPrivacySettingClientReportStruct.f10085j = userPrivacySettingClientReportStruct.mo86045b("CurrentPrivacyFullStatus", ((C113177k) C86312j.m106911c(cls)).y60(), true);
                userPrivacySettingClientReportStruct.mo86054n();
                if (C45628s0.m50756U()) {
                    C113177k kVar2 = (C113177k) C86312j.m106911c(cls);
                    SettingPermissionView settingPermissionView2 = this.f350543a;
                    String str3 = settingPermissionView2.f347183f;
                    if (str3 != null) {
                        String str4 = settingPermissionView2.f347184g;
                        if (str4 == null) {
                            C87412m.m108603p("business");
                            throw null;
                        } else if (kVar2.mo165700GT(str3, str4) && z) {
                            C78085c cVar = (C78085c) C86312j.m106911c(C78085c.class);
                            if (cVar != null && (ms = cVar.mo108056ms()) != null) {
                                ms.mo126409c(this.f350543a.f347191q, true, false);
                                return;
                            }
                            return;
                        }
                    } else {
                        C87412m.m108603p("permission");
                        throw null;
                    }
                }
                TextView textView = this.f350543a.f347189o;
                if (textView != null) {
                    textView.setText("");
                }
                TextView textView2 = this.f350543a.f347189o;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    return;
                }
                return;
            }
            C87412m.m108603p("business");
            throw null;
        }
        C87412m.m108603p("permission");
        throw null;
    }
}
