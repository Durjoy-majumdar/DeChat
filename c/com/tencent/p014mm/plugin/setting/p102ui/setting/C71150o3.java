package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.ArrayList;
import na3.C76846i;
import p244tt.C14088e;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.o3 */
public class C71150o3 implements C14088e.C14090b {

    /* renamed from: a */
    public final /* synthetic */ SettingsUI f205947a;

    public C71150o3(SettingsUI settingsUI) {
        this.f205947a = settingsUI;
    }

    /* renamed from: a */
    public void mo1717a() {
        Log.m105924i("MicroMsg.SettingsUI", "OpenLiteApp success");
    }

    /* renamed from: b */
    public void mo1718b() {
        Log.m105924i("MicroMsg.SettingsUI", "OpenLiteApp fail");
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        arrayList.add("labs_browse");
        intent.putStringArrayListExtra("key_exclude_apps", arrayList);
        ((C76846i) C86312j.m106911c(C76846i.class)).Hv0(this.f205947a, intent);
    }
}
