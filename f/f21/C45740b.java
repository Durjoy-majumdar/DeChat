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
import ob0.C11385n;
import ob0.C47350c;
import te3.C51426tp;
import te3.C51578up;

/* renamed from: f21.b */
public class C45740b extends C45737a {

    /* renamed from: j */
    public C47350c f123592j;

    /* renamed from: n */
    public C51578up f123593n;

    /* renamed from: o */
    public C11385n f123594o;

    /* renamed from: p */
    public boolean f123595p;

    public C45740b(boolean z) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51426tp();
        bVar.f127067b = new C51578up();
        bVar.f127069d = 1323;
        bVar.f127068c = "/cgi-bin/mmpay-bin/getrewardqrcode";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123592j = a;
        ((C51426tp) a.f127055a.f127080a).f142316d = z;
        this.f123595p = z;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123594o = nVar;
        return dispatch(gVar, this.f123592j, this);
    }

    public int getType() {
        return 1323;
    }

    /* renamed from: k1 */
    public void mo71232k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2 = str;
        Log.m105925i("MicroMsg.NetSceneQrRewardGetCode", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str2);
        C51578up upVar = (C51578up) ((C47350c) uVar).f127056b.f127083a;
        this.f123593n = upVar;
        Log.m105925i("MicroMsg.NetSceneQrRewardGetCode", "retcode: %s, retmsg: %s", Integer.valueOf(upVar.f142992d), this.f123593n.f142993e);
        boolean z = this.f123590h;
        if (!z && this.f123593n.f142992d != 0) {
            this.f123591i = true;
        }
        if (!z && !this.f123591i) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_PHOTO_WIDTH_INT_SYNC, Integer.valueOf(this.f123593n.f143005t));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_ICON_WIDTH_INT_SYNC, Integer.valueOf(this.f123593n.f142998j));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_DESC_STRING_SYNC, this.f123593n.f142999n);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_WORD_STRING_SYNC, this.f123593n.f142997i);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_MAX_AMT_INT_SYNC, Integer.valueOf(this.f123593n.f143004s));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_BOTTOM_STR_STRING_SYNC, this.f123593n.f143003r);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_BOTTOM_URL_STRING_SYNC, this.f123593n.f143002q);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_LAST_PHOTO_URL_STRING_SYNC, this.f123593n.f142995g);
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = this.f123593n.f143001p.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                arrayList.add("" + intValue);
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_AMT_LIST_STRING_SYNC, Util.listToString(arrayList, ","));
            C115669n.INSTANCE.idkeyStat(724, 2, 1, false);
        } else if (z) {
            C115669n.INSTANCE.idkeyStat(724, 4, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(724, 3, 1, false);
        }
        C11385n nVar = this.f123594o;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str2, this);
        }
    }
}
