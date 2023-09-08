package vz2;

import b03.C39697g;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.TextStatusCliPostStruct;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import lz2.C34452l;
import org.json.JSONArray;
import org.json.JSONObject;
import uz2.C52676d1;
import uz2.C78318v1;
import z04.C112551y;

/* renamed from: vz2.e */
public final class C78503e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C78318v1 f229947d;

    /* renamed from: e */
    public final /* synthetic */ Long f229948e;

    /* renamed from: f */
    public final /* synthetic */ String f229949f;

    /* renamed from: g */
    public final /* synthetic */ String f229950g;

    public C78503e(C78318v1 v1Var, Long l, String str, String str2) {
        this.f229947d = v1Var;
        this.f229948e = l;
        this.f229949f = str;
        this.f229950g = str2;
    }

    public final void run() {
        TextStatusCliPostStruct textStatusCliPostStruct = new TextStatusCliPostStruct();
        C78318v1 v1Var = this.f229947d;
        Long l = this.f229948e;
        String str = this.f229949f;
        String str2 = this.f229950g;
        textStatusCliPostStruct.f194555d = textStatusCliPostStruct.mo86045b("SessionID", Util.nullAs(v1Var.f229475N, ""), true);
        textStatusCliPostStruct.f194559f = v1Var.f229476P;
        textStatusCliPostStruct.f194557e = textStatusCliPostStruct.mo86045b("CliPostID", Util.nullAs(v1Var.f229500d, ""), true);
        textStatusCliPostStruct.f194561g = v1Var.f229504g;
        long j = 0;
        textStatusCliPostStruct.f194565i = l != null ? l.longValue() : 0;
        textStatusCliPostStruct.f194567j = C31543z5.m39453c();
        textStatusCliPostStruct.f194569k = textStatusCliPostStruct.mo86045b("ExitTopicID", Util.nullAs(str, ""), true);
        textStatusCliPostStruct.f194571l = textStatusCliPostStruct.mo86045b("ExitTextStatusID", Util.nullAs(str2, ""), true);
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = v1Var.f229506i.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (sb.length() > 0) {
                z = true;
            }
            if (z) {
                sb.append(";");
            }
            sb.append(next);
        }
        textStatusCliPostStruct.f194563h = textStatusCliPostStruct.mo86045b("StatusIcons", sb.toString(), true);
        textStatusCliPostStruct.f194573m = v1Var.f229509o;
        textStatusCliPostStruct.f194575n = v1Var.f229510p;
        textStatusCliPostStruct.f194577o = v1Var.f229512q;
        textStatusCliPostStruct.f194579p = v1Var.f229513r;
        textStatusCliPostStruct.f194581q = v1Var.f229514s;
        textStatusCliPostStruct.f194583r = textStatusCliPostStruct.mo86045b("SourceID", Util.nullAs(v1Var.f229515t, ""), true);
        textStatusCliPostStruct.f194585s = textStatusCliPostStruct.mo86045b("SourceActivityID", Util.nullAs(v1Var.f229516u, ""), true);
        textStatusCliPostStruct.f194586t = textStatusCliPostStruct.mo86045b("SourceName", Util.nullAs(v1Var.f229517v, ""), true);
        textStatusCliPostStruct.f194587u = textStatusCliPostStruct.mo86045b("SourceIcon", Util.nullAs(v1Var.f229518w, ""), true);
        textStatusCliPostStruct.f194588v = v1Var.f229519x;
        textStatusCliPostStruct.f194589w = v1Var.f229521y;
        textStatusCliPostStruct.f194590x = v1Var.f229523z;
        textStatusCliPostStruct.f194591y = v1Var.f229462A;
        textStatusCliPostStruct.f194592z = v1Var.f229463B;
        textStatusCliPostStruct.f194526A = v1Var.f229464C;
        textStatusCliPostStruct.f194527B = v1Var.f229465D;
        textStatusCliPostStruct.f194528C = v1Var.f229466E;
        textStatusCliPostStruct.f194530E = v1Var.f229467F;
        textStatusCliPostStruct.f194531F = v1Var.f229468G;
        textStatusCliPostStruct.f194532G = v1Var.f229469H;
        textStatusCliPostStruct.f194533H = v1Var.f229470I;
        textStatusCliPostStruct.f194534I = (long) v1Var.f229471J;
        textStatusCliPostStruct.f194535J = v1Var.f229472K;
        textStatusCliPostStruct.f194536K = v1Var.f229473L;
        textStatusCliPostStruct.f194537L = v1Var.f229474M;
        textStatusCliPostStruct.f194541P = v1Var.f229477Q;
        textStatusCliPostStruct.f194542Q = v1Var.f229479R;
        textStatusCliPostStruct.f194543R = 0;
        textStatusCliPostStruct.f194544S = (long) v1Var.f229485U;
        textStatusCliPostStruct.f194545T = (long) v1Var.f229487V;
        textStatusCliPostStruct.f194529D = v1Var.f229496Z0;
        textStatusCliPostStruct.f194546U = textStatusCliPostStruct.mo86045b("RefBackgroundUser", v1Var.f229491X, true);
        textStatusCliPostStruct.f194547V = textStatusCliPostStruct.mo86045b("RefBackgroundStatus", v1Var.f229493Y, true);
        textStatusCliPostStruct.f194548W = (long) v1Var.f229481S;
        textStatusCliPostStruct.f194549X = textStatusCliPostStruct.mo86045b("ImgVideoMd5Orig", v1Var.f229483T, true);
        textStatusCliPostStruct.f194550Y = textStatusCliPostStruct.mo86045b("FinderPickerSessionId", v1Var.f229495Z, true);
        textStatusCliPostStruct.f194538M = v1Var.f229511p0;
        textStatusCliPostStruct.f194539N = v1Var.f229520x0;
        textStatusCliPostStruct.f194540O = textStatusCliPostStruct.mo86045b("FinalCustomTitle", v1Var.f229522y0, true);
        textStatusCliPostStruct.f194551Z = (long) v1Var.f229478Q0;
        textStatusCliPostStruct.f194552a0 = (long) v1Var.f229480R0;
        textStatusCliPostStruct.f194553b0 = (long) v1Var.f229482S0;
        textStatusCliPostStruct.f194554c0 = (long) v1Var.f229484T0;
        textStatusCliPostStruct.f194556d0 = (long) v1Var.f229486U0;
        textStatusCliPostStruct.f194558e0 = (long) v1Var.f229488V0;
        textStatusCliPostStruct.f194560f0 = textStatusCliPostStruct.mo86045b("FinalEmoticon", v1Var.f229490W0, true);
        textStatusCliPostStruct.f194562g0 = 2;
        textStatusCliPostStruct.f194564h0 = 2;
        textStatusCliPostStruct.f194566i0 = textStatusCliPostStruct.mo86045b("WeRunInfo", v1Var.f229492X0, true);
        textStatusCliPostStruct.f194568j0 = textStatusCliPostStruct.mo86045b("PaymentInfo", v1Var.f229494Y0, true);
        textStatusCliPostStruct.f194572l0 = textStatusCliPostStruct.mo86045b("PostRecomIconID", IStatusIconHelperKt.m39109a().mo62294f(), true);
        textStatusCliPostStruct.f194574m0 = C78501d.f229945a.mo108457c();
        textStatusCliPostStruct.f194576n0 = v1Var.f229497a1;
        if (IStatusIconHelperKt.m39109a().mo62311w()) {
            j = v1Var.f229498b1;
        }
        textStatusCliPostStruct.f194578o0 = j;
        C39697g gVar = C39697g.f106502a;
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it4 = ((ArrayList) gVar.mo62325c()).iterator();
            while (it4.hasNext()) {
                C34452l lVar = (C34452l) it4.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("iconid", lVar.f92747d);
                C52676d1 j2 = IStatusIconHelperKt.m39109a().mo62298j(lVar.f92747d);
                jSONObject.put("icontype", j2 != null ? j2.f147084g : 0);
                jSONObject.put("customtitle", lVar.f92748e);
                jSONArray.put(jSONObject);
            }
        } catch (Exception unused) {
        }
        String jSONArray2 = jSONArray.toString();
        C87412m.m108593f(jSONArray2, "jsonArray.toString()");
        Pattern compile = Pattern.compile(",");
        C87412m.m108593f(compile, "compile(pattern)");
        String replaceAll = compile.matcher(jSONArray2).replaceAll(";");
        C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        textStatusCliPostStruct.f194580p0 = textStatusCliPostStruct.mo86045b("FreqIcons", replaceAll, true);
        textStatusCliPostStruct.f194582q0 = textStatusCliPostStruct.mo86045b("IconSelections", v1Var.f229499c1, true);
        textStatusCliPostStruct.f194584r0 = v1Var.f229501d1;
        textStatusCliPostStruct.mo86054n();
        String q = textStatusCliPostStruct.mo1006q();
        C87412m.m108593f(q, "struct.toShowString()");
        Log.m105925i("MicroMsg.TextStatus.tsReport", "report%s %s", 22219, C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
