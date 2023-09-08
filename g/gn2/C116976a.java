package gn2;

import cc0.C92411b;
import com.tencent.p014mm.plugin.setting.p102ui.setting.view.SettingPermissionView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.List;
import p702ts.C118505d;
import p702ts.C78085c;

/* renamed from: gn2.a */
public final class C116976a implements C92411b.C92412a {

    /* renamed from: d */
    public final /* synthetic */ SettingPermissionView f350541d;

    public C116976a(SettingPermissionView settingPermissionView) {
        this.f350541d = settingPermissionView;
    }

    public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
        if (z) {
            List<String> list = SettingPermissionView.f347179s;
            Log.m105924i("MicroMsg.SettingPermissionView", "getLocation suc");
            C78085c cVar = (C78085c) C86312j.m106911c(C78085c.class);
            if (cVar != null) {
                SettingPermissionView settingPermissionView = this.f350541d;
                if (cVar.mo108056ms() != null) {
                    cVar.mo108056ms().mo126408b(this);
                }
                cVar.oe0().mo108054a(new C118505d((double) f2, (double) f, 11, Integer.valueOf(settingPermissionView.hashCode()), true), settingPermissionView.getOnAddr());
            }
            return false;
        }
        List<String> list2 = SettingPermissionView.f347179s;
        Log.m105928w("MicroMsg.SettingPermissionView", "getLocation fail");
        return false;
    }
}
