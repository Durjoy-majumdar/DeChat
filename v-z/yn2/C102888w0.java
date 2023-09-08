package yn2;

import ad0.C0033t;
import android.util.Base64;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelstat.C92859v;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86301e;
import di3.C86312j;
import eb0.C86493v0;
import ei3.C86522b;
import java.net.URLEncoder;
import jr2.C76442r;
import jr2.C99016j;
import po2.C100833f;
import rq2.C63505q;
import te3.bb4;
import te3.cb4;
import te3.za4;

@C86522b
/* renamed from: yn2.w0 */
public class C102888w0 extends C86301e implements C76442r {
    /* renamed from: N9 */
    public void mo106654N9(C72963f4 f4Var) {
        SnsMethodCalculate.markStartTimeMs("statisticsExtInfo", "com.tencent.mm.plugin.sns.SnsStatService");
        SnsMethodCalculate.markStartTimeMs("statisticsExtInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
        try {
            bb4 h = C92859v.m117130h(C92859v.m117127e(f4Var));
            if (h != null) {
                if (h.f226992d != null) {
                    String t = f4Var.mo108768t();
                    SnsMethodCalculate.markStartTimeMs("getChatScene", "com.tencent.mm.modelstat.SnsStatExtUtil");
                    String str = t.endsWith("@chatroom") ? "2" : "1";
                    SnsMethodCalculate.markEndTimeMs("getChatScene", "com.tencent.mm.modelstat.SnsStatExtUtil");
                    int d = C92859v.m117126d(f4Var.getContent());
                    Log.m105924i("MicroMsg.SnsStatExtUtil", "report adPageExposure(13235) for chat: scene=" + str + ", adCanvasType=" + d + ", srcSnsId=" + h.f226992d.f298023e + ", uxinfo=" + h.f226992d.f298024f);
                    cb4 cb4 = h.f226992d;
                    StringBuilder sb = new StringBuilder();
                    sb.append(d);
                    sb.append("");
                    ((C99016j) C86312j.m106911c(C99016j.class)).mo55731h(13235, str, cb4.f298023e, cb4.f298024f, "", "", sb.toString());
                    C100833f fVar = new C100833f();
                    cb4 cb42 = h.f226992d;
                    fVar.f295341a = cb42.f298023e;
                    fVar.f295342b = cb42.f298024f;
                    fVar.f295343c = 1;
                    fVar.f295344d = Util.safeParseInt(str);
                    fVar.f295345e = d;
                    C63505q.m74843b(fVar);
                    SnsMethodCalculate.markEndTimeMs("statisticsExtInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
                    SnsMethodCalculate.markEndTimeMs("statisticsExtInfo", "com.tencent.mm.plugin.sns.SnsStatService");
                }
            }
            Log.m105920e("MicroMsg.SnsStatExtUtil", "statisticsExtInfo for chat, extInfo or extInfo.StatSnsAdInfo==null");
            SnsMethodCalculate.markEndTimeMs("statisticsExtInfo", "com.tencent.mm.modelstat.SnsStatExtUtil");
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsStatExtUtil", "statisticsExtInfo for chat, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("statisticsExtInfo", "com.tencent.mm.plugin.sns.SnsStatService");
    }

    /* renamed from: nS */
    public void mo106655nS(String str, C0033t tVar) {
        SnsMethodCalculate.markStartTimeMs("appendSourceAndSnsStatWithExt", "com.tencent.mm.plugin.sns.SnsStatService");
        C92859v.m117124b(str, tVar);
        SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStatWithExt", "com.tencent.mm.plugin.sns.SnsStatService");
    }

    /* renamed from: pL */
    public void mo106656pL(String str, C86493v0.C86495c cVar, C72963f4 f4Var) {
        SnsMethodCalculate.markStartTimeMs("dealWith", "com.tencent.mm.plugin.sns.SnsStatService");
        SnsMethodCalculate.markStartTimeMs("dealWith", "com.tencent.mm.modelstat.SnsStatExtUtil");
        if (!f4Var.mo101020w3()) {
            SnsMethodCalculate.markEndTimeMs("dealWith", "com.tencent.mm.modelstat.SnsStatExtUtil");
        } else {
            C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
            if (u == null) {
                SnsMethodCalculate.markEndTimeMs("dealWith", "com.tencent.mm.modelstat.SnsStatExtUtil");
            } else {
                if (!Util.isNullOrNil(u.f195535U1)) {
                    cVar.mo120962i(str, u.f195535U1);
                }
                SnsMethodCalculate.markEndTimeMs("dealWith", "com.tencent.mm.modelstat.SnsStatExtUtil");
            }
        }
        SnsMethodCalculate.markEndTimeMs("dealWith", "com.tencent.mm.plugin.sns.SnsStatService");
    }

    public String qv0(C72963f4 f4Var) {
        SnsMethodCalculate.markStartTimeMs("getExtStr", "com.tencent.mm.plugin.sns.SnsStatService");
        String e = C92859v.m117127e(f4Var);
        SnsMethodCalculate.markEndTimeMs("getExtStr", "com.tencent.mm.plugin.sns.SnsStatService");
        return e;
    }

    public String yc0(String str, PString pString) {
        SnsMethodCalculate.markStartTimeMs("getADExtStr", "com.tencent.mm.plugin.sns.SnsStatService");
        SnsMethodCalculate.markStartTimeMs("getADExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
        String str2 = "";
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getADExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
        } else {
            byte[] decode = Base64.decode(str, 0);
            bb4 bb4 = new bb4();
            try {
                bb4.parseFrom(decode);
                cb4 cb4 = bb4.f226992d;
                String format = String.format("snsId=%s&uxInfo=%s&source=%d&snsStatExt=%s", new Object[]{URLEncoder.encode(cb4.f298024f, "UTF-8"), URLEncoder.encode(cb4.f298023e, "UTF-8"), Integer.valueOf(bb4.f226992d.f298025g), URLEncoder.encode(C92859v.m117128f(bb4.f226992d), "UTF-8")});
                za4 za4 = bb4.f226994f;
                pString.value = za4 == null ? str2 : za4.f186651d;
                SnsMethodCalculate.markEndTimeMs("getADExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
                str2 = format;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SnsStatExtUtil", e, str2, new Object[0]);
                SnsMethodCalculate.markEndTimeMs("getADExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
            }
        }
        SnsMethodCalculate.markEndTimeMs("getADExtStr", "com.tencent.mm.plugin.sns.SnsStatService");
        return str2;
    }
}
