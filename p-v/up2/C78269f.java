package up2;

import android.content.Context;
import android.util.Base64;
import co2.C67440e;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import org.json.JSONObject;
import p773yy.C66708h;
import ps2.C100891r;
import qy2.C63349b0;
import qy2.C77459z;
import uz2.C52718u;
import uz2.C52720v;
import uz2.C65489g0;
import uz2.C78316t;
import vr2.C102260r;

/* renamed from: up2.f */
public final class C78269f {

    /* renamed from: up2.f$a */
    public static final class C78270a {

        /* renamed from: a */
        public final String f229281a;

        /* renamed from: b */
        public final String f229282b;

        /* renamed from: c */
        public final int f229283c;

        /* renamed from: d */
        public final String f229284d;

        public C78270a(String str, String str2, int i, String str3) {
            this.f229281a = str;
            this.f229282b = str2;
            this.f229283c = i;
            this.f229284d = str3;
        }
    }

    /* renamed from: up2.f$b */
    public static final class C78271b implements C63349b0 {

        /* renamed from: a */
        public final /* synthetic */ C78270a f229285a;

        public C78271b(C78270a aVar) {
            this.f229285a = aVar;
        }

        public final void onFinishAction(int i, String str, C65489g0 g0Var) {
            SnsMethodCalculate.markStartTimeMs("onFinishAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$jumpToTextStatus$1");
            Log.m105924i("AdJumpTextStatusUIHelper", "callback:  result = " + i + ", errMsg = " + str + ",  info = " + g0Var);
            if (i == 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    C78270a aVar = this.f229285a;
                    aVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                    String str2 = aVar.f229282b;
                    SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                    jSONObject.put("snsid", str2);
                    C78270a aVar2 = this.f229285a;
                    aVar2.getClass();
                    SnsMethodCalculate.markStartTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                    String str3 = aVar2.f229281a;
                    SnsMethodCalculate.markEndTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                    jSONObject.put("uxinfo", str3);
                    C78270a aVar3 = this.f229285a;
                    aVar3.getClass();
                    SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                    int i2 = aVar3.f229283c;
                    SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                    jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i2);
                    C78270a aVar4 = this.f229285a;
                    aVar4.getClass();
                    SnsMethodCalculate.markStartTimeMs("getAdExtInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                    String str4 = aVar4.f229284d;
                    SnsMethodCalculate.markEndTimeMs("getAdExtInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                    jSONObject.put("adExtInfo", str4);
                    C102260r.m134858a("sns_ad_state_publish_user_confirm", jSONObject.toString());
                } catch (Throwable th) {
                    Log.printErrStackTrace("AdJumpTextStatusUIHelper", th, "adChannelCgiReport error!", new Object[0]);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onFinishAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$jumpToTextStatus$1");
        }
    }

    /* renamed from: a */
    public static final void m94560a(Context context, C67440e eVar, C78270a aVar) {
        SnsMethodCalculate.markStartTimeMs("jumpToTextStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper");
        if (eVar == null || context == null || aVar == null) {
            Log.m105920e("AdJumpTextStatusUIHelper", "jump() called with: info = " + eVar + " context = " + context);
            SnsMethodCalculate.markEndTimeMs("jumpToTextStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper");
            return;
        }
        C77459z zVar = new C77459z();
        C52720v vVar = new C52720v();
        try {
            SnsMethodCalculate.markStartTimeMs("getSourceFooterData", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
            String str = eVar.f193391c;
            SnsMethodCalculate.markEndTimeMs("getSourceFooterData", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
            vVar.parseFrom(Base64.decode(str, 0));
        } catch (Exception e) {
            Log.printErrStackTrace("AdJumpTextStatusUIHelper", e, "parseFrom data error!", new Object[0]);
        }
        zVar.f229399d.f147238g.f147095o = vVar;
        SnsMethodCalculate.markStartTimeMs("getIconId", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        String str2 = eVar.f193390b;
        SnsMethodCalculate.markEndTimeMs("getIconId", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        zVar.f229399d.f147238g.f147088e = str2;
        SnsMethodCalculate.markStartTimeMs("getDesc", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        String str3 = eVar.f193393e;
        SnsMethodCalculate.markEndTimeMs("getDesc", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        C52718u uVar = zVar.f229399d;
        uVar.f147231J = str3;
        uVar.f147237f = 1;
        SnsMethodCalculate.markStartTimeMs("getSourceVerifyInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        String str4 = eVar.f193392d;
        SnsMethodCalculate.markEndTimeMs("getSourceVerifyInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        zVar.f229399d.f147238g.f147091h = str4;
        zVar.f229398C.f229447h = true;
        SnsMethodCalculate.markStartTimeMs("getEmoticonMd5", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        String str5 = eVar.f193395g;
        SnsMethodCalculate.markEndTimeMs("getEmoticonMd5", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        zVar.f229398C.f229443d = str5;
        SnsMethodCalculate.markStartTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        String str6 = eVar.f193389a;
        SnsMethodCalculate.markEndTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        String l = C100891r.m132217l("adId_mm", str6);
        if (l == null || !C86013q1.m106450k(l)) {
            SnsMethodCalculate.markStartTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
            String str7 = eVar.f193389a;
            SnsMethodCalculate.markEndTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
            zVar.f229400e = str7;
        } else {
            zVar.f229400e = l;
        }
        SnsMethodCalculate.markStartTimeMs("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        String str8 = eVar.f193394f;
        SnsMethodCalculate.markEndTimeMs("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        String l2 = C100891r.m132217l("adId_mm", str8);
        if (l2 == null || !C86013q1.m106450k(l2)) {
            zVar.f229398C.f229446g = false;
            SnsMethodCalculate.markStartTimeMs("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
            String str9 = eVar.f193394f;
            SnsMethodCalculate.markEndTimeMs("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
            zVar.f229398C.f229444e = str9;
        } else {
            C78316t tVar = zVar.f229398C;
            tVar.f229446g = true;
            tVar.f229445f = l2;
        }
        ((C66708h) C86312j.m106911c(C66708h.class)).Y00(context, zVar, new C78271b(aVar));
        SnsMethodCalculate.markEndTimeMs("jumpToTextStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper");
    }
}
