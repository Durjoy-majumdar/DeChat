package f21;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import te3.C48751ar;
import te3.C52293zq;

/* renamed from: f21.g */
public class C45744g extends C45737a {

    /* renamed from: j */
    public C47350c f123603j;

    /* renamed from: n */
    public C48751ar f123604n;

    /* renamed from: o */
    public C11385n f123605o;

    public C45744g(LinkedList<Integer> linkedList, String str, boolean z, boolean z2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52293zq();
        bVar.f127067b = new C48751ar();
        bVar.f127069d = 1562;
        bVar.f127068c = "/cgi-bin/mmpay-bin/setrewardqrcode";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123603j = a;
        C52293zq zqVar = (C52293zq) a.f127055a.f127080a;
        zqVar.f146175d = linkedList;
        zqVar.f146176e = str;
        zqVar.f146177f = z;
        zqVar.f146178g = z2;
        Log.m105925i("MicroMsg.NetSceneQrRewardSetCode", "desc: %s, flag: %s, default: %s", str, Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123605o = nVar;
        return dispatch(gVar, this.f123603j, this);
    }

    public int getType() {
        return 1562;
    }

    /* renamed from: k1 */
    public void mo71232k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = str;
        Log.m105925i("MicroMsg.NetSceneQrRewardSetCode", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str2);
        C48751ar arVar = (C48751ar) ((C47350c) uVar).f127056b.f127083a;
        this.f123604n = arVar;
        Log.m105925i("MicroMsg.NetSceneQrRewardSetCode", "retcode: %s, retmsg: %s", Integer.valueOf(arVar.f130731d), this.f123604n.f130732e);
        boolean z = this.f123590h;
        if (!z && this.f123604n.f130731d != 0) {
            this.f123591i = true;
        }
        if (!z && !this.f123591i) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_PHOTO_WIDTH_INT_SYNC, Integer.valueOf(this.f123604n.f130738n));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_ICON_WIDTH_INT_SYNC, Integer.valueOf(this.f123604n.f130735h));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_DESC_STRING_SYNC, this.f123604n.f130737j);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_LAST_PHOTO_URL_STRING_SYNC, this.f123604n.f130733f);
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = this.f123604n.f130736i.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                arrayList.add("" + intValue);
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_AMT_LIST_STRING_SYNC, Util.listToString(arrayList, ","));
            C115669n.INSTANCE.idkeyStat(724, 5, 1, false);
        } else if (z) {
            C115669n.INSTANCE.idkeyStat(724, 7, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(724, 6, 1, false);
        }
        C11385n nVar = this.f123605o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str2, this);
        }
    }
}
