package nz1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.p136ui.chatting.viewitems.C73991g2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74015h2;
import com.tencent.p014mm.plugin.base.stub.WXEntryActivity;
import com.tencent.p014mm.plugin.gamesharecard.GameShareCardInfo;
import com.tencent.p014mm.plugin.gamesharecard.LiteAppBizDataInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72915l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import java.util.HashSet;
import ke3.C88144b;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import oz1.C77050b;
import p1081gi.C98121d;
import p763ym.C79138l;
import pz1.C77296a;
import sx3.C110818d0;
import te3.C49640h12;
import te3.C49784i12;
import te3.C49878io2;
import te3.C50586ns1;
import te3.C50724os1;

@C86522b
/* renamed from: nz1.b */
public class C76983b extends C86301e implements C77050b {

    /* renamed from: nz1.b$a */
    public class C47312a implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C77050b.C77051a f126984d;

        public C47312a(C76983b bVar, C77050b.C77051a aVar) {
            this.f126984d = aVar;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            if (i == 0 && i2 == 0) {
                C49784i12 i122 = (C49784i12) cVar.f127056b.f127083a;
                if (i122 != null) {
                    C49878io2 io22 = i122.f135024e;
                    LiteAppBizDataInfo liteAppBizDataInfo = new LiteAppBizDataInfo(io22.f135542d, io22.f135543e, io22.f135544f, io22.f135545g, Integer.valueOf(io22.f135546h), i122.f135024e.f135547i);
                    ((WXEntryActivity.C68743d) this.f126984d).mo94576a(i122.f135023d, liteAppBizDataInfo);
                    return 0;
                }
                ((WXEntryActivity.C68743d) this.f126984d).mo94576a((String) null, (LiteAppBizDataInfo) null);
                return 0;
            }
            ((WXEntryActivity.C68743d) this.f126984d).mo94576a((String) null, (LiteAppBizDataInfo) null);
            return 0;
        }
    }

    /* renamed from: nz1.b$b */
    public class C76984b implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C77050b.C77052b f224927d;

        public C76984b(C76983b bVar, C77050b.C77052b bVar2) {
            this.f224927d = bVar2;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            C50724os1 os12;
            if (i != 0 || i2 != 0 || (os12 = (C50724os1) cVar.f127056b.f127083a) == null) {
                return 0;
            }
            C77050b.C77052b bVar = this.f224927d;
            String str2 = os12.f139352d;
            C73991g2 g2Var = (C73991g2) bVar;
            g2Var.getClass();
            Class cls = C75700k0.class;
            if (Util.isNullOrNil(str2)) {
                Log.m105920e("MicroMsg.ChattingItemAppMsgGameShare", "readtext callback read is nullornil");
                return 0;
            }
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(g2Var.f217116a.getMsgId());
            C68070l.C68072b bVar2 = null;
            String content = b002.getContent();
            if (content != null) {
                bVar2 = C68070l.C68072b.m80422u(content, b002.mo108775z2());
            }
            C68070l.C68072b bVar3 = bVar2;
            if (bVar3 == null) {
                Log.m105920e("MicroMsg.ChattingItemAppMsgGameShare", "null == content");
                return 0;
            }
            C72915l lVar = (C72915l) bVar3.mo93555w(C72915l.class);
            lVar.f212518i = str2;
            StringBuilder sb = new StringBuilder();
            bVar3.mo93545f(lVar);
            lVar.mo7616c(sb, bVar3, (String) null, (C98121d) null, 0, 0);
            C74015h2.m87848a(sb, b002);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(g2Var.f217116a.getMsgId(), b002);
            return 0;
        }
    }

    /* renamed from: FN */
    public void mo107303FN(String str, String str2, C77050b.C77051a aVar) {
        C49640h12 h122 = new C49640h12();
        h122.f134404d = str;
        h122.f134405e = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = h122;
        bVar.f127069d = 5050;
        bVar.f127068c = "/cgi-bin/mmgame-bin/gameshareappsvr/getgamesharemsginfo";
        bVar.f127067b = new C49784i12();
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C89144l0.m111429e(bVar.mo72403a(), new C47312a(this, aVar), false);
    }

    /* renamed from: GM */
    public void mo107304GM(String str, C77050b.C77052b bVar) {
        C50586ns1 ns12 = new C50586ns1();
        ns12.f138745d = str;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = ns12;
        bVar2.f127069d = 5020;
        bVar2.f127068c = "/cgi-bin/mmgame-bin/gameshareappsvr/gamesharefirstexpose";
        bVar2.f127067b = new C50724os1();
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        C89144l0.m111429e(bVar2.mo72403a(), new C76984b(this, bVar), false);
    }

    /* renamed from: Yb */
    public void mo107305Yb(GameShareCardInfo gameShareCardInfo, byte[] bArr, String str) {
        C68070l.C68072b bVar = new C68070l.C68072b();
        bVar.f195570f = gameShareCardInfo.f19378g;
        bVar.f195582i = 101;
        String str2 = gameShareCardInfo.f19381j;
        if (!Util.isNullOrNil(str2)) {
            bVar.f195562d = str2;
            C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(str2);
            if (appInfo != null) {
                bVar.f195484F = appInfo.field_appName;
            }
        }
        bVar.f195586j = "https://support.weixin.qq.com/update/";
        LiteAppBizDataInfo liteAppBizDataInfo = gameShareCardInfo.f19375d;
        bVar.f195621r2 = liteAppBizDataInfo.f19382d;
        bVar.f195625s2 = liteAppBizDataInfo.f19383e;
        bVar.f195629t2 = liteAppBizDataInfo.f19384f;
        bVar.f195633u2 = liteAppBizDataInfo.f19386h.intValue();
        C72915l lVar = new C72915l();
        LiteAppBizDataInfo liteAppBizDataInfo2 = gameShareCardInfo.f19375d;
        lVar.f212511b = liteAppBizDataInfo2.f19385g;
        lVar.f212512c = liteAppBizDataInfo2.f19387i;
        lVar.f212513d = gameShareCardInfo.f19376e;
        lVar.f212514e = gameShareCardInfo.f19377f;
        lVar.f212515f = gameShareCardInfo.f19379h;
        lVar.f212516g = gameShareCardInfo.f19380i;
        bVar.mo93545f(lVar);
        C80996q.C1279a.m1369a().mo112827qE(bVar, "", "", str, "", bArr);
    }

    /* renamed from: ZZ */
    public void mo107306ZZ(Context context, GameShareCardInfo gameShareCardInfo, String str) {
        Intent intent = new Intent();
        intent.putExtra("Ksnsupload_title", Util.nullAs(gameShareCardInfo.f19378g, ""));
        if (!Util.isNullOrNil(str)) {
            if (str.startsWith("http")) {
                intent.putExtra("Ksnsupload_imgurl", str);
            } else {
                intent.putExtra("KsnsUpload_imgPath", str);
            }
        }
        intent.putExtra("Ksnsupload_type", 34);
        String str2 = gameShareCardInfo.f19381j;
        if (str2 != null && str2.length() > 0) {
            intent.putExtra("Ksnsupload_appid", gameShareCardInfo.f19381j);
        }
        intent.putExtra("ksnsis_gamesharecard", true);
        intent.putExtra("ksnsUpload_gameShareIsVideo", gameShareCardInfo.f19379h);
        intent.putExtra("ksnsUpload_gameShareData", gameShareCardInfo.f19377f);
        intent.putExtra("ksnsUpload_gameShareDuration", gameShareCardInfo.f19380i);
        intent.putExtra("ksnsUpload_gameShareId", gameShareCardInfo.f19376e);
        intent.putExtra("KsnsUpload_LiteAppId", gameShareCardInfo.f19375d.f19382d);
        intent.putExtra("KsnsUpload_LiteAppPath", gameShareCardInfo.f19375d.f19383e);
        intent.putExtra("KsnsUpload_LiteAppQuery", gameShareCardInfo.f19375d.f19384f);
        intent.putExtra("ksnsUpload_gameShareLiteAppBizData", gameShareCardInfo.f19375d.f19385g);
        intent.putExtra("ksnsUpload_gameShareLiteAppPriority", gameShareCardInfo.f19375d.f19387i);
        C88144b.m109791i(context, "sns", ".ui.SnsUploadUI", intent, (Bundle) null);
    }

    /* renamed from: of */
    public void mo107307of(C68070l.C68072b bVar, Long l, int i) {
        long longValue = l.longValue();
        HashSet<Long> hashSet = C77296a.f225409a;
        C87412m.m108594g(bVar, "content");
        StringBuilder sb = new StringBuilder();
        sb.append("johnexpose : msgSvrId is ");
        sb.append(longValue);
        sb.append(", chatsetlen is ");
        HashSet<Long> hashSet2 = C77296a.f225409a;
        sb.append(hashSet2.size());
        Log.m105924i("MicroMsg.GameShareCardReport", sb.toString());
        if (!Long.valueOf(longValue).equals(0)) {
            if (i == 1) {
                if (!hashSet2.contains(Long.valueOf(longValue))) {
                    hashSet2.add(Long.valueOf(longValue));
                } else {
                    return;
                }
            }
            C72915l lVar = (C72915l) bVar.mo93555w(C72915l.class);
            C115669n.INSTANCE.mo160131h(28466, Integer.valueOf(lVar.f212515f == 0 ? 1 : 2), "", 1, bVar.f195562d, 0, lVar.f212513d, Integer.valueOf(i), Integer.valueOf(Util.isNullOrNil(bVar.f195562d) ? 2 : 1));
        }
    }

    public void u10(String str, String str2, int i, String str3, int i2) {
        HashSet<Long> hashSet = C77296a.f225409a;
        StringBuilder sb = new StringBuilder();
        sb.append("johnexpose : snsId is ");
        sb.append(str);
        sb.append(", snssetlen is ");
        HashSet<String> hashSet2 = C77296a.f225410b;
        sb.append(hashSet2.size());
        Log.m105924i("MicroMsg.GameShareCardReport", sb.toString());
        if (!Util.isNullOrNil(str)) {
            if (i2 == 1) {
                if (!C110818d0.m150903D(hashSet2, str)) {
                    if (str != null) {
                        hashSet2.add(str);
                    }
                } else {
                    return;
                }
            }
            C115669n.INSTANCE.mo160131h(28466, Integer.valueOf(i == 0 ? 1 : 2), "", 2, str2, 0, str3, Integer.valueOf(i2), Integer.valueOf(Util.isNullOrNil(str2) ? 2 : 1));
        }
    }
}
