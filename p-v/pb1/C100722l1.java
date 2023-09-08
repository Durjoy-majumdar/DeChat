package pb1;

import com.tencent.p014mm.autogen.events.WebviewReportPublisherIdEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C7628p0;
import eb0.C86493v0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p749xh.C66261f3;
import qb1.C101089b;
import te3.C101756ae0;
import te3.C101801kd0;
import te3.C101835rd0;
import te3.C49223e3;
import te3.C49370f3;
import xb1.C102612a;
import xb1.C102614d;

/* renamed from: pb1.l1 */
public class C100722l1 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f295088d;

    /* renamed from: e */
    public C11385n f295089e = null;

    /* renamed from: f */
    public C100755z f295090f;

    public C100722l1(C100755z zVar) {
        Log.m105925i("MicroMsg.Fav.NetSceneAddFav", "NetSceneAddFavItem %s", Long.valueOf(zVar.field_localId));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49223e3();
        bVar.f127067b = new C49370f3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/addfavitem";
        bVar.f127069d = 401;
        bVar.f127070e = 193;
        bVar.f127071f = 1000000193;
        this.f295088d = bVar.mo72403a();
        this.f295090f = zVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C49223e3 e3Var = (C49223e3) this.f295088d.f127055a.f127080a;
        e3Var.f132653d = C7628p0.m7761a(this.f295090f.field_xml, System.currentTimeMillis());
        C100755z zVar = this.f295090f;
        e3Var.f132654e = zVar.field_type;
        e3Var.f132655f = zVar.field_sourceType;
        zVar.field_xml = C100755z.m131907w2(zVar);
        ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).update(this.f295090f, C66261f3.COL_LOCALID);
        C100755z zVar2 = this.f295090f;
        e3Var.f132657h = zVar2.field_xml;
        e3Var.f132656g = zVar2.field_sourceId;
        zVar2.mo140187q2("MicroMsg.Fav.NetSceneAddFav", C100755z.f295170V0);
        this.f295089e = nVar;
        C100755z zVar3 = this.f295090f;
        Log.m105925i("MicroMsg.Fav.NetSceneAddFav", "ADD FavItem, sourceId:%s localId:%d favId:%d", zVar3.field_sourceId, Long.valueOf(zVar3.field_localId), Integer.valueOf(this.f295090f.field_id));
        return dispatch(gVar, this.f295088d, this);
    }

    public int getType() {
        return 401;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C49370f3 f3Var;
        C101801kd0 kd02;
        C101756ae0 ae02;
        String str2;
        C101835rd0 rd02;
        int i4 = i2;
        int i5 = i3;
        String str3 = str;
        Class cls = C100718j1.class;
        Log.m105924i("MicroMsg.Fav.NetSceneAddFav", "netId : " + i + " errType :" + i4 + " errCode: " + i5 + " errMsg :" + str3);
        C100745t.m131893e(this.f295090f.field_localId, i2, i3, i5 == 0, 0);
        C100745t.m131890b();
        int i6 = 4;
        if (i4 == 4 && i5 != 0) {
            C100745t.m131894f(10001, i5, str3);
        }
        if ((i4 == 0 && i5 == 0) || i5 == -400) {
            C49370f3 f3Var2 = (C49370f3) ((C47350c) uVar).f127056b.f127083a;
            Log.m105925i("MicroMsg.Fav.NetSceneAddFav", "fav id %d, local id %d, itemStatus %d, update seq %d", Integer.valueOf(f3Var2.f133258d), Long.valueOf(this.f295090f.field_localId), Integer.valueOf(this.f295090f.field_itemStatus), Integer.valueOf(f3Var2.f133259e));
            C100755z zVar = this.f295090f;
            zVar.field_id = f3Var2.f133258d;
            zVar.field_localSeq = f3Var2.f133259e;
            if (zVar.field_itemStatus == 12) {
                Log.m105926v("MicroMsg.Fav.NetSceneAddFav", "onGYNetEnd wait server upload sent");
                this.f295090f.field_itemStatus = 13;
            }
            if (this.f295090f.field_itemStatus == 9) {
                Log.m105926v("MicroMsg.Fav.NetSceneAddFav", "onGYNetEnd item done");
                this.f295090f.field_itemStatus = 10;
                f3Var = f3Var2;
                ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142257qq(this.f295090f.field_localId);
                C115669n.INSTANCE.mo160131h(10659, 0, Integer.valueOf(this.f295090f.field_type), 0, Long.valueOf(C100734q.m131817H(this.f295090f)), Long.valueOf(C100695a0.m131726a(this.f295090f.field_localId)));
            } else {
                f3Var = f3Var2;
            }
            C49370f3 f3Var3 = f3Var;
            C100755z qq = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142273qq((long) f3Var3.f133258d);
            if (qq != null) {
                this.f295090f.field_updateSeq = qq.field_updateSeq;
                ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142269jo(qq);
                ((C101089b) ((C100718j1) C86312j.m106911c(cls)).mo128206Ve()).mo140541a(qq, "", 30, 2);
                Log.m105925i("MicroMsg.Fav.NetSceneAddFav", "onGYNetEnd aleady exist, delete old info, favId:%d", Integer.valueOf(qq.field_id));
            }
            C86493v0.C86495c e = C86493v0.m107224d().mo120948e(this.f295090f.field_sessionId);
            if (!Util.isNullOrNil(this.f295090f.field_sessionId) && this.f295090f.field_type == 5 && e != null) {
                WebviewReportPublisherIdEvent webviewReportPublisherIdEvent = new WebviewReportPublisherIdEvent();
                webviewReportPublisherIdEvent.f265259d.f265260a = e.mo120959f("prePublishId", "");
                C101801kd0 kd03 = this.f295090f.field_favProto;
                if (!(kd03 == null || (rd02 = kd03.f298616d) == null)) {
                    webviewReportPublisherIdEvent.f265259d.f265264e = rd02.f299364y;
                }
                if (!(!Util.isNullOrNil(webviewReportPublisherIdEvent.f265259d.f265264e) || (kd02 = this.f295090f.field_favProto) == null || (ae02 = kd02.f298622j) == null || (str2 = ae02.f297867h) == null)) {
                    webviewReportPublisherIdEvent.f265259d.f265264e = str2;
                }
                if (Util.isNullOrNil(webviewReportPublisherIdEvent.f265259d.f265264e)) {
                    webviewReportPublisherIdEvent.f265259d.f265264e = e.mo120959f("url", "");
                }
                webviewReportPublisherIdEvent.f265259d.f265262c = e.mo120959f("preUsername", "");
                webviewReportPublisherIdEvent.f265259d.f265263d = e.mo120959f("preChatName", "");
                webviewReportPublisherIdEvent.f265259d.f265265f = e.mo120958e("preMsgIndex", 0);
                webviewReportPublisherIdEvent.f265259d.f265269j = e.mo120958e("sendAppMsgScene", 0);
                webviewReportPublisherIdEvent.f265259d.f265270k = e.mo120958e("getA8KeyScene", 0);
                webviewReportPublisherIdEvent.f265259d.f265271l = e.mo120959f("referUrl", (String) null);
                webviewReportPublisherIdEvent.f265259d.f265272m = e.mo120959f("adExtStr", (String) null);
                WebviewReportPublisherIdEvent.C92611a aVar = webviewReportPublisherIdEvent.f265259d;
                aVar.f265266g = "";
                aVar.f265267h = "";
                aVar.f265268i = 0;
                aVar.f265261b = "fav_" + C75592q0.m90789s() + "_" + this.f295090f.field_id;
                webviewReportPublisherIdEvent.publish();
            }
            this.f295090f.field_sessionId = null;
            ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(this.f295090f, C66261f3.COL_LOCALID);
            C100734q.m131869q0(f3Var3.f133260f);
            i6 = 4;
        }
        if (i4 == i6 && i5 == -401) {
            Log.m105924i("MicroMsg.Fav.NetSceneAddFav", "fav fail, full size");
            if (this.f295090f.mo140192z2()) {
                ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(16, this.f295090f.field_localId);
            } else {
                ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(6, this.f295090f.field_localId);
            }
        }
        C100734q.m131846f(this.f295090f);
        this.f295089e.onSceneEnd(i4, i5, str3, this);
    }
}
