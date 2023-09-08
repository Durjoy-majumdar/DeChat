package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import te3.C51517ua2;
import te3.io4;
import xm2.C53384o;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.q1 */
public final class C42990q1 extends UIComponent implements C11385n {

    /* renamed from: d */
    public C42991a f116401d;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.q1$a */
    public interface C42991a {
        /* renamed from: a */
        void mo67137a(int i, int i2, String str);

        /* renamed from: b */
        void mo67138b(C42992b bVar);
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.q1$b */
    public static final class C42992b {

        /* renamed from: a */
        public final boolean f116402a;

        /* renamed from: b */
        public final List<io4> f116403b;

        /* renamed from: c */
        public final byte[] f116404c;

        public C42992b(boolean z, List<io4> list, byte[] bArr) {
            this.f116402a = z;
            this.f116403b = list;
            this.f116404c = bArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C42992b)) {
                return false;
            }
            C42992b bVar = (C42992b) obj;
            return this.f116402a == bVar.f116402a && C87412m.m108589b(this.f116403b, bVar.f116403b) && C87412m.m108589b(this.f116404c, bVar.f116404c);
        }

        public int hashCode() {
            boolean z = this.f116402a;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            List<io4> list = this.f116403b;
            int i2 = 0;
            int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
            byte[] bArr = this.f116404c;
            if (bArr != null) {
                i2 = Arrays.hashCode(bArr);
            }
            return hashCode + i2;
        }

        public String toString() {
            return "SettingsAuthData(requestNextPage=" + this.f116402a + ", authAppList=" + this.f116403b + ", nextPageData=" + Arrays.toString(this.f116404c) + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42990q1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo67193c3(byte[] bArr) {
        Log.m105925i("MicroMsg.SettingsAuthDataUIC", "getAuthData nextPageData: %s", bArr);
        C53384o oVar = new C53384o(bArr);
        oVar.f150214g = true;
        C86709a0.m107524d().mo123460f(oVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(1146, this);
        mo67193c3((byte[]) null);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(1146, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C42991a aVar;
        StringBuilder sb = new StringBuilder();
        sb.append("getUserAuthList onSceneEnd errType ");
        sb.append(i);
        sb.append(", errCode ");
        sb.append(i2);
        sb.append(", errMsg ");
        sb.append(str);
        sb.append(", type: ");
        sb.append(yVar != null ? Integer.valueOf(yVar.getType()) : null);
        Log.m105924i("MicroMsg.SettingsAuthDataUIC", sb.toString());
        boolean z = true;
        if (i == 0 && i2 == 0) {
            if (yVar != null && yVar.getType() == 1146) {
                C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.model.NetSceneGetUserAuthList");
                C53384o oVar = (C53384o) yVar;
                oVar.mo74032j1();
                C42991a aVar2 = this.f116401d;
                if (aVar2 != null) {
                    if (oVar.f150213f == null) {
                        z = false;
                    }
                    C51517ua2 ua22 = oVar.f150212e;
                    aVar2.mo67138b(new C42992b(z, ua22 != null ? ua22.f142698e : Collections.emptyList(), oVar.mo74032j1()));
                    return;
                }
                return;
            }
            return;
        }
        if (yVar == null || yVar.getType() != 1146) {
            z = false;
        }
        if (z && (aVar = this.f116401d) != null) {
            aVar.mo67137a(i, i2, str);
        }
    }
}
