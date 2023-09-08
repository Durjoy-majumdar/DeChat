package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import xm2.C53380i;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.r1 */
public final class C42993r1 extends UIComponent implements C11385n {

    /* renamed from: d */
    public C42994a f116405d;

    /* renamed from: e */
    public int f116406e;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.r1$a */
    public interface C42994a {
        /* renamed from: a */
        void mo67139a(int i, int i2, String str);

        void onSuccess();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42993r1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo67197c3(String str, int i) {
        C87412m.m108594g(str, "appId");
        C53380i iVar = new C53380i(str, i);
        iVar.f150202g = true;
        this.f116406e = iVar.hashCode();
        Log.m105925i("MicroMsg.SettingsAuthDataUIC", "delUserAuth scene: %d, callbackId: %s", Integer.valueOf(i), Integer.valueOf(this.f116406e));
        C86709a0.m107524d().mo123460f(iVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(1127, this);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(1127, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C42994a aVar;
        C42994a aVar2;
        StringBuilder sb = new StringBuilder();
        sb.append("delUserAuth onSceneEnd errType ");
        sb.append(i);
        sb.append(", errCode ");
        sb.append(i2);
        sb.append(", errMsg ");
        sb.append(str);
        sb.append(", type: ");
        Integer num = null;
        sb.append(yVar != null ? Integer.valueOf(yVar.getType()) : null);
        sb.append(", callback: ");
        if (yVar != null) {
            num = Integer.valueOf(yVar.hashCode());
        }
        sb.append(num);
        Log.m105924i("MicroMsg.SettingsAuthDataUIC", sb.toString());
        boolean z = true;
        if (i == 0 && i2 == 0) {
            if (yVar == null || yVar.getType() != 1127) {
                z = false;
            }
            if (z && yVar.hashCode() == this.f116406e && (aVar2 = this.f116405d) != null) {
                aVar2.onSuccess();
                return;
            }
            return;
        }
        if (yVar == null || yVar.getType() != 1127) {
            z = false;
        }
        if (z && yVar.hashCode() == this.f116406e && (aVar = this.f116405d) != null) {
            aVar.mo67139a(i, i2, str);
        }
    }
}
