package gn2;

import android.widget.TextView;
import com.tencent.p014mm.modelgeo.Addr;
import com.tencent.p014mm.plugin.setting.p102ui.setting.view.SettingPermissionView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import p702ts.C78083b;

/* renamed from: gn2.b */
public final class C116977b implements C78083b.C78084a {

    /* renamed from: a */
    public final /* synthetic */ SettingPermissionView f350542a;

    public C116977b(SettingPermissionView settingPermissionView) {
        this.f350542a = settingPermissionView;
    }

    public final void onLocationAddr(Addr addr) {
        List<String> list = SettingPermissionView.f347179s;
        Log.m105919d("MicroMsg.SettingPermissionView", "onGetAddrss  %s, businessAllow=%s", addr.toString(), Boolean.valueOf(this.f350542a.f347190p));
        SettingPermissionView settingPermissionView = this.f350542a;
        if (settingPermissionView.f347190p) {
            TextView textView = settingPermissionView.f347189o;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f350542a.f347189o;
            if (textView2 != null) {
                textView2.setText(addr.f343957e + ' ' + addr.f343958f);
                return;
            }
            return;
        }
        TextView textView3 = settingPermissionView.f347189o;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
    }
}
