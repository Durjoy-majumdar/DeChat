package w33;

import android.util.Size;
import c30.C104289g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.mmdata.rpt.VoipRenderReportStruct;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.voip.p475ui.VoipAutomatedTestSetupShell;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import l33.C109247e;
import org.json.JSONObject;
import rx3.C13598b0;
import x33.C112039b;
import z04.C112551y;
import z33.C112595h;

/* renamed from: w33.u */
public final class C111725u {

    /* renamed from: A */
    public long f334482A;

    /* renamed from: B */
    public int f334483B;

    /* renamed from: C */
    public int f334484C;

    /* renamed from: D */
    public int f334485D;

    /* renamed from: E */
    public long f334486E;

    /* renamed from: F */
    public long f334487F;

    /* renamed from: G */
    public long f334488G;

    /* renamed from: H */
    public int f334489H;

    /* renamed from: I */
    public int f334490I;

    /* renamed from: J */
    public int f334491J;

    /* renamed from: K */
    public long f334492K;

    /* renamed from: L */
    public long f334493L;

    /* renamed from: M */
    public long f334494M;

    /* renamed from: a */
    public boolean f334495a = C112595h.f337166a.mo164369c();

    /* renamed from: b */
    public HashMap<String, C112039b.C112040a> f334496b = new HashMap<>();

    /* renamed from: c */
    public HashMap<String, C112039b.C112040a> f334497c = new HashMap<>();

    /* renamed from: d */
    public String f334498d;

    /* renamed from: e */
    public String f334499e;

    /* renamed from: f */
    public String f334500f;

    /* renamed from: g */
    public String f334501g;

    /* renamed from: h */
    public String f334502h;

    /* renamed from: i */
    public HashSet<Size> f334503i = new HashSet<>();

    /* renamed from: j */
    public HashSet<Size> f334504j = new HashSet<>();

    /* renamed from: k */
    public HashSet<Size> f334505k = new HashSet<>();

    /* renamed from: l */
    public HashSet<Size> f334506l = new HashSet<>();

    /* renamed from: m */
    public HashSet<Integer> f334507m = new HashSet<>();

    /* renamed from: n */
    public HashSet<Integer> f334508n = new HashSet<>();

    /* renamed from: o */
    public int f334509o;

    /* renamed from: p */
    public int f334510p;

    /* renamed from: q */
    public int f334511q;

    /* renamed from: r */
    public long f334512r;

    /* renamed from: s */
    public long f334513s;

    /* renamed from: t */
    public long f334514t;

    /* renamed from: u */
    public boolean f334515u;

    /* renamed from: v */
    public long f334516v;

    /* renamed from: w */
    public long f334517w;

    /* renamed from: x */
    public int f334518x;

    /* renamed from: y */
    public int f334519y;

    /* renamed from: z */
    public int f334520z;

    /* renamed from: a */
    public final void mo163419a() {
        char c;
        String str;
        C112039b.C112040a aVar;
        C112039b.C112040a aVar2;
        C112039b.C112040a aVar3;
        C112039b.C112040a aVar4;
        C112039b.C112040a aVar5;
        long j = C109247e.vx0().f333459s;
        long j2 = C109247e.vx0().f333458r;
        VoipRenderReportStruct voipRenderReportStruct = new VoipRenderReportStruct();
        C104289g gVar = new C104289g();
        String str2 = this.f334502h;
        if (!(str2 == null || (aVar5 = this.f334496b.get(str2)) == null)) {
            aVar5.mo163757a();
        }
        String str3 = this.f334498d;
        if (!(str3 == null || (aVar4 = this.f334496b.get(str3)) == null)) {
            aVar4.mo163757a();
        }
        String str4 = this.f334500f;
        if (!(str4 == null || (aVar3 = this.f334496b.get(str4)) == null)) {
            aVar3.mo163757a();
        }
        String str5 = this.f334499e;
        if (!(str5 == null || (aVar2 = this.f334496b.get(str5)) == null)) {
            aVar2.mo163757a();
        }
        String str6 = this.f334501g;
        if (!(str6 == null || (aVar = this.f334496b.get(str6)) == null)) {
            aVar.mo163757a();
        }
        Iterator<Size> it = this.f334504j.iterator();
        while (true) {
            c = '*';
            if (!it.hasNext()) {
                break;
            }
            Size next = it.next();
            HashMap<String, C112039b.C112040a> hashMap = this.f334496b;
            C112039b.C112040a aVar6 = hashMap.get("LocalDrawSizeChange_" + next.getWidth() + '*' + next.getHeight());
            if (aVar6 != null) {
                C112039b c2 = aVar6.mo163759c();
                StringBuilder sb = new StringBuilder();
                sb.append(next.getWidth());
                sb.append('*');
                sb.append(next.getHeight());
                gVar.put(sb.toString(), mo163436r(next, c2.f335400b, c2.f335399a));
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "tempValueJson.toString()");
        String str7 = ";";
        voipRenderReportStruct.f310491k = voipRenderReportStruct.mo86045b("LocalDrawSize", C112551y.m153814n(gVar2, ",", str7, false), true);
        C104289g gVar3 = new C104289g();
        Iterator<Size> it4 = this.f334506l.iterator();
        while (it4.hasNext()) {
            Size next2 = it4.next();
            HashMap<String, C112039b.C112040a> hashMap2 = this.f334496b;
            C112039b.C112040a aVar7 = hashMap2.get("RemoteDrawSizeChange_" + next2.getWidth() + c + next2.getHeight());
            if (aVar7 != null) {
                C112039b c3 = aVar7.mo163759c();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(next2.getWidth());
                sb4.append(c);
                sb4.append(next2.getHeight());
                str = str7;
                gVar3.put(sb4.toString(), mo163436r(next2, c3.f335400b, c3.f335399a));
                C13598b0 b0Var2 = C13598b0.f38549a;
            } else {
                str = str7;
            }
            str7 = str;
            c = '*';
        }
        String gVar4 = gVar3.toString();
        C87412m.m108593f(gVar4, "tempValueJson.toString()");
        String str8 = str7;
        voipRenderReportStruct.f310493m = voipRenderReportStruct.mo86045b("RemoteDrawSize", C112551y.m153814n(gVar4, ",", str8, false), true);
        C104289g gVar5 = new C104289g();
        Iterator<Size> it5 = this.f334503i.iterator();
        while (it5.hasNext()) {
            Size next3 = it5.next();
            HashMap<String, C112039b.C112040a> hashMap3 = this.f334496b;
            C112039b.C112040a aVar8 = hashMap3.get("LocalTextureSizeChange_" + next3.getWidth() + '*' + next3.getHeight());
            if (aVar8 != null) {
                C112039b c4 = aVar8.mo163759c();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(next3.getWidth());
                sb5.append('*');
                sb5.append(next3.getHeight());
                gVar5.put(sb5.toString(), mo163436r(next3, c4.f335400b, c4.f335399a));
                C13598b0 b0Var3 = C13598b0.f38549a;
            }
        }
        String gVar6 = gVar5.toString();
        C87412m.m108593f(gVar6, "tempValueJson.toString()");
        voipRenderReportStruct.f310492l = voipRenderReportStruct.mo86045b("LocalTextureSize", C112551y.m153814n(gVar6, ",", str8, false), true);
        C104289g gVar7 = new C104289g();
        Iterator<Size> it6 = this.f334505k.iterator();
        while (it6.hasNext()) {
            Size next4 = it6.next();
            HashMap<String, C112039b.C112040a> hashMap4 = this.f334496b;
            C112039b.C112040a aVar9 = hashMap4.get("RemoteTextureSizeChange_" + next4.getWidth() + '*' + next4.getHeight());
            if (aVar9 != null) {
                C112039b c5 = aVar9.mo163759c();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(next4.getWidth());
                sb6.append('*');
                sb6.append(next4.getHeight());
                gVar7.put(sb6.toString(), mo163436r(next4, c5.f335400b, c5.f335399a));
                C13598b0 b0Var4 = C13598b0.f38549a;
            }
        }
        String gVar8 = gVar7.toString();
        C87412m.m108593f(gVar8, "tempValueJson.toString()");
        voipRenderReportStruct.f310494n = voipRenderReportStruct.mo86045b("RemoteTextureSize", C112551y.m153814n(gVar8, ",", str8, false), true);
        C104289g gVar9 = new C104289g();
        Iterator<Integer> it7 = this.f334507m.iterator();
        while (it7.hasNext()) {
            int intValue = it7.next().intValue();
            HashMap<String, C112039b.C112040a> hashMap5 = this.f334496b;
            C112039b.C112040a aVar10 = hashMap5.get("DrawLocalRotateChange" + intValue);
            if (aVar10 != null) {
                C112039b c6 = aVar10.mo163759c();
                gVar9.put(String.valueOf(intValue), mo163437s(intValue, c6.f335400b, c6.f335399a));
                C13598b0 b0Var5 = C13598b0.f38549a;
            }
        }
        String gVar10 = gVar9.toString();
        C87412m.m108593f(gVar10, "tempValueJson.toString()");
        voipRenderReportStruct.f310495o = voipRenderReportStruct.mo86045b("LocalRotate", C112551y.m153814n(gVar10, ",", str8, false), true);
        C104289g gVar11 = new C104289g();
        Iterator<Integer> it8 = this.f334508n.iterator();
        while (it8.hasNext()) {
            int intValue2 = it8.next().intValue();
            HashMap<String, C112039b.C112040a> hashMap6 = this.f334496b;
            C112039b.C112040a aVar11 = hashMap6.get("DrawRemoteRotateChange" + intValue2);
            if (aVar11 != null) {
                C112039b c7 = aVar11.mo163759c();
                gVar11.put(String.valueOf(intValue2), mo163437s(intValue2, c7.f335400b, c7.f335399a));
                C13598b0 b0Var6 = C13598b0.f38549a;
            }
        }
        String gVar12 = gVar11.toString();
        C87412m.m108593f(gVar12, "tempValueJson.toString()");
        voipRenderReportStruct.f310496p = voipRenderReportStruct.mo86045b("RemoteRotate", C112551y.m153814n(gVar12, ",", str8, false), true);
        C112039b.C112040a aVar12 = this.f334496b.get("DecodeChangeSoft");
        if (aVar12 != null) {
            aVar12.mo163757a();
        }
        C112039b.C112040a aVar13 = this.f334496b.get("DecodeChangeSoft");
        if (aVar13 != null) {
            C112039b c8 = aVar13.mo163759c();
            voipRenderReportStruct.f310489i = c8.f335399a;
            voipRenderReportStruct.f310490j = (int) c8.f335400b;
            C13598b0 b0Var7 = C13598b0.f38549a;
        }
        C112039b.C112040a aVar14 = this.f334496b.get("DecodeChangeHard");
        if (aVar14 != null) {
            aVar14.mo163757a();
        }
        C112039b.C112040a aVar15 = this.f334496b.get("DecodeChangeHard");
        if (aVar15 != null) {
            C112039b c9 = aVar15.mo163759c();
            voipRenderReportStruct.f310486f = c9.f335399a;
            voipRenderReportStruct.f310488h = (int) c9.f335400b;
            C13598b0 b0Var8 = C13598b0.f38549a;
        }
        C112039b.C112040a aVar16 = this.f334497c.get("LocalSourceTimeoutNoFrame");
        if (aVar16 != null) {
            C112039b c15 = aVar16.mo163759c();
            voipRenderReportStruct.f310497q = c15.f335399a;
            voipRenderReportStruct.f310498r = (int) c15.f335400b;
            C13598b0 b0Var9 = C13598b0.f38549a;
        }
        C112039b.C112040a aVar17 = this.f334497c.get("RemoteSourceTimeoutNoFrame");
        if (aVar17 != null) {
            C112039b c16 = aVar17.mo163759c();
            voipRenderReportStruct.f310501u = c16.f335399a;
            voipRenderReportStruct.f310502v = (int) c16.f335400b;
            C13598b0 b0Var10 = C13598b0.f38549a;
        }
        C112039b.C112040a aVar18 = this.f334497c.get("LocalOnScreenTimeoutNoFrame");
        if (aVar18 != null) {
            C112039b c17 = aVar18.mo163759c();
            voipRenderReportStruct.f310499s = c17.f335399a;
            voipRenderReportStruct.f310500t = (int) c17.f335400b;
            C13598b0 b0Var11 = C13598b0.f38549a;
        }
        C112039b.C112040a aVar19 = this.f334497c.get("RemoteOnScreenTimeoutNoFrame");
        if (aVar19 != null) {
            C112039b c18 = aVar19.mo163759c();
            voipRenderReportStruct.f310503w = c18.f335399a;
            voipRenderReportStruct.f310504x = (int) c18.f335400b;
            C13598b0 b0Var12 = C13598b0.f38549a;
        }
        C112039b.C112040a aVar20 = this.f334497c.get("LocalTextureError");
        if (aVar20 != null) {
            aVar20.mo163757a();
        }
        C112039b.C112040a aVar21 = this.f334497c.get("LocalTextureError");
        if (aVar21 != null) {
            C112039b c19 = aVar21.mo163759c();
            voipRenderReportStruct.f310505y = c19.f335399a;
            voipRenderReportStruct.f310506z = (int) c19.f335400b;
            C13598b0 b0Var13 = C13598b0.f38549a;
        }
        C112039b.C112040a aVar22 = this.f334497c.get("LocalDrawError");
        if (aVar22 != null) {
            aVar22.mo163757a();
        }
        C112039b.C112040a aVar23 = this.f334497c.get("LocalDrawError");
        if (aVar23 != null) {
            C112039b c25 = aVar23.mo163759c();
            voipRenderReportStruct.f310474A = c25.f335399a;
            voipRenderReportStruct.f310475B = (int) c25.f335400b;
            C13598b0 b0Var14 = C13598b0.f38549a;
        }
        C112039b.C112040a aVar24 = this.f334497c.get("RemoteTextureError");
        if (aVar24 != null) {
            aVar24.mo163757a();
        }
        C112039b.C112040a aVar25 = this.f334497c.get("RemoteTextureError");
        if (aVar25 != null) {
            C112039b c26 = aVar25.mo163759c();
            voipRenderReportStruct.f310476C = c26.f335399a;
            voipRenderReportStruct.f310477D = (int) c26.f335400b;
            C13598b0 b0Var15 = C13598b0.f38549a;
        }
        C112039b.C112040a aVar26 = this.f334497c.get("RemoteDrawError");
        if (aVar26 != null) {
            aVar26.mo163757a();
        }
        C112039b.C112040a aVar27 = this.f334497c.get("RemoteDrawError");
        if (aVar27 != null) {
            C112039b c27 = aVar27.mo163759c();
            voipRenderReportStruct.f310478E = c27.f335399a;
            voipRenderReportStruct.f310479F = (int) c27.f335400b;
            C13598b0 b0Var16 = C13598b0.f38549a;
        }
        long milliSecondsToNow = j2 == 0 ? 0 : Util.milliSecondsToNow(j2);
        long milliSecondsToNow2 = j == 0 ? 0 : Util.milliSecondsToNow(j);
        C104289g gVar13 = new C104289g();
        gVar13.mo145953n("total", this.f334520z);
        gVar13.mo145953n("less", this.f334518x);
        gVar13.mo145953n("serious", this.f334519y);
        gVar13.mo145954o("lessTotal", this.f334516v);
        gVar13.mo145954o("lessSerious", this.f334517w);
        gVar13.mo145954o("totalTime", milliSecondsToNow);
        String gVar14 = gVar13.toString();
        C87412m.m108593f(gVar14, "valueJson.toString()");
        long j3 = milliSecondsToNow;
        voipRenderReportStruct.f310480G = voipRenderReportStruct.mo86045b("LocalFrameInfo", C112551y.m153814n(gVar14, ",", str8, false), true);
        C104289g gVar15 = new C104289g();
        gVar15.mo145953n("count", this.f334511q);
        gVar15.mo145953n("less", this.f334509o);
        gVar15.mo145953n("serious", this.f334510p);
        String str9 = "less";
        String str10 = "serious";
        gVar15.mo145954o("lessTotal", this.f334512r);
        gVar15.mo145954o("lessSerious", this.f334513s);
        gVar15.mo145954o("totalTime", milliSecondsToNow2);
        String gVar16 = gVar15.toString();
        C87412m.m108593f(gVar16, "valueJson.toString()");
        voipRenderReportStruct.f310481H = voipRenderReportStruct.mo86045b("RemoteFrameInfo", C112551y.m153814n(gVar16, ",", str8, false), true);
        C104289g gVar17 = new C104289g();
        gVar17.mo145953n("total", this.f334485D);
        gVar17.mo145953n(str9, this.f334483B);
        gVar17.mo145953n(str10, this.f334484C);
        gVar17.mo145954o("lessTotal", this.f334486E);
        gVar17.mo145954o("lessSerious", this.f334487F);
        gVar17.mo145954o("totalTime", milliSecondsToNow2);
        String gVar18 = gVar17.toString();
        C87412m.m108593f(gVar18, "valueJson.toString()");
        voipRenderReportStruct.f310482I = voipRenderReportStruct.mo86045b("DecodeFrameInfo", C112551y.m153814n(gVar18, ",", str8, false), true);
        C104289g gVar19 = new C104289g();
        gVar19.mo145953n("total", this.f334491J);
        gVar19.mo145953n(str9, this.f334489H);
        gVar19.mo145953n(str10, this.f334490I);
        gVar19.mo145954o("lessTotal", this.f334492K);
        gVar19.mo145954o("lessSerious", this.f334493L);
        gVar19.mo145954o("totalTime", milliSecondsToNow2);
        String gVar20 = gVar19.toString();
        C87412m.m108593f(gVar20, "valueJson.toString()");
        voipRenderReportStruct.f310483J = voipRenderReportStruct.mo86045b("EncodeFrameInfo", C112551y.m153814n(gVar20, ",", str8, false), true);
        voipRenderReportStruct.f310487g = this.f334495a ? 0 : 1;
        voipRenderReportStruct.f310484d = j3;
        voipRenderReportStruct.f310485e = Math.max(100 - (this.f334497c.size() * 20), 0);
        voipRenderReportStruct.mo86054n();
        VoipAutomatedTestSetupShell voipAutomatedTestSetupShell = VoipAutomatedTestSetupShell.f82264a;
        Log.m105924i("MicroMsg.VoipAutomatedTestSetupShell", "reportRender");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("localSourceNoFrameTimes", voipRenderReportStruct.f310497q);
        jSONObject.put("localSourceNoFrameTotalTime", voipRenderReportStruct.f310498r);
        jSONObject.put("localOnScreenNoFrameTimes", voipRenderReportStruct.f310499s);
        jSONObject.put("localOnScreenNoFrameTotalTime", voipRenderReportStruct.f310500t);
        jSONObject.put("remoteOnScreenNoFrameTimes", voipRenderReportStruct.f310503w);
        jSONObject.put("remoteOnScreenNoFrameTotalTime", voipRenderReportStruct.f310504x);
        jSONObject.put("remoteSourceNoFrameTimes", voipRenderReportStruct.f310501u);
        jSONObject.put("remoteSourceNoFrameTotalTime", voipRenderReportStruct.f310502v);
        VoipAutomatedTestSetupShell.f82267d = jSONObject;
        voipAutomatedTestSetupShell.mo57464a();
    }

    /* renamed from: b */
    public final String mo163420b() {
        C104289g gVar = new C104289g();
        C112039b.C112040a aVar = this.f334497c.get("EncoderSourceTimeoutNotFrame");
        if (aVar != null) {
            C112039b c = aVar.mo163759c();
            gVar.mo145953n("times", c.f335399a);
            gVar.mo145954o("total", c.f335400b);
        }
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "sourceJson.toString()");
        return C112551y.m153814n(gVar2, ",", ";", false);
    }

    /* renamed from: c */
    public final String mo163421c() {
        C104289g gVar = new C104289g();
        for (Size size : this.f334503i) {
            HashMap<String, C112039b.C112040a> hashMap = this.f334496b;
            C112039b.C112040a aVar = hashMap.get("LocalTextureSizeChange_" + size.getWidth() + '*' + size.getHeight());
            if (aVar != null) {
                C112039b c = aVar.mo163759c();
                StringBuilder sb = new StringBuilder();
                sb.append(size.getWidth());
                sb.append('*');
                sb.append(size.getHeight());
                gVar.put(sb.toString(), mo163436r(size, c.f335400b, c.f335399a));
            }
        }
        C104289g gVar2 = new C104289g();
        for (Size size2 : this.f334504j) {
            HashMap<String, C112039b.C112040a> hashMap2 = this.f334496b;
            C112039b.C112040a aVar2 = hashMap2.get("LocalDrawSizeChange_" + size2.getWidth() + '*' + size2.getHeight());
            if (aVar2 != null) {
                C112039b c2 = aVar2.mo163759c();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(size2.getWidth());
                sb4.append('*');
                sb4.append(size2.getHeight());
                gVar2.put(sb4.toString(), mo163436r(size2, c2.f335400b, c2.f335399a));
            }
        }
        C104289g gVar3 = new C104289g();
        for (Number intValue : this.f334507m) {
            int intValue2 = intValue.intValue();
            HashMap<String, C112039b.C112040a> hashMap3 = this.f334496b;
            C112039b.C112040a aVar3 = hashMap3.get("DrawLocalRotateChange" + intValue2);
            if (aVar3 != null) {
                C112039b c3 = aVar3.mo163759c();
                gVar3.put(String.valueOf(intValue2), mo163437s(intValue2, c3.f335400b, c3.f335399a));
            }
        }
        C104289g gVar4 = new C104289g();
        String gVar5 = gVar.toString();
        C87412m.m108593f(gVar5, "textureJson.toString()");
        gVar4.put("textureSize", C112551y.m153814n(gVar5, ",", ";", false));
        String gVar6 = gVar2.toString();
        C87412m.m108593f(gVar6, "drawJson.toString()");
        gVar4.put("drawSize", C112551y.m153814n(gVar6, ",", ";", false));
        String gVar7 = gVar3.toString();
        C87412m.m108593f(gVar7, "rotateJson.toString()");
        gVar4.put(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, C112551y.m153814n(gVar7, ",", ";", false));
        String gVar8 = gVar4.toString();
        C87412m.m108593f(gVar8, "valueJson.toString()");
        return C112551y.m153814n(gVar8, ",", ";", false);
    }

    /* renamed from: d */
    public final String mo163422d() {
        C104289g gVar = new C104289g();
        C112039b.C112040a aVar = this.f334497c.get("LocalSourceTimeoutNoFrame");
        if (aVar != null) {
            C112039b c = aVar.mo163759c();
            gVar.mo145953n("times", c.f335399a);
            gVar.mo145954o("total", c.f335400b);
        }
        C104289g gVar2 = new C104289g();
        C112039b.C112040a aVar2 = this.f334497c.get("LocalOnScreenTimeoutNoFrame");
        if (aVar2 != null) {
            C112039b c2 = aVar2.mo163759c();
            gVar2.mo145953n("times", c2.f335399a);
            gVar2.mo145954o("total", c2.f335400b);
        }
        C104289g gVar3 = new C104289g();
        String gVar4 = gVar.toString();
        C87412m.m108593f(gVar4, "sourceJson.toString()");
        gVar3.put(FirebaseAnalytics.C113379b.SOURCE, C112551y.m153814n(gVar4, ",", ";", false));
        String gVar5 = gVar2.toString();
        C87412m.m108593f(gVar5, "screenJson.toString()");
        gVar3.put("screen", C112551y.m153814n(gVar5, ",", ";", false));
        String gVar6 = gVar3.toString();
        C87412m.m108593f(gVar6, "valueJson.toString()");
        return C112551y.m153814n(gVar6, ",", ";", false);
    }

    /* renamed from: e */
    public final String mo163423e() {
        C104289g gVar = new C104289g();
        C112039b.C112040a aVar = this.f334497c.get("LocalTextureError");
        if (aVar != null) {
            C112039b c = aVar.mo163759c();
            gVar.mo145953n("times", c.f335399a);
            gVar.mo145954o("total", c.f335400b);
        }
        C104289g gVar2 = new C104289g();
        C112039b.C112040a aVar2 = this.f334497c.get("LocalDrawError");
        if (aVar2 != null) {
            C112039b c2 = aVar2.mo163759c();
            gVar2.mo145953n("times", c2.f335399a);
            gVar2.mo145954o("total", c2.f335400b);
        }
        C104289g gVar3 = new C104289g();
        String gVar4 = gVar.toString();
        C87412m.m108593f(gVar4, "textureJson.toString()");
        gVar3.put("texture", C112551y.m153814n(gVar4, ",", ";", false));
        String gVar5 = gVar2.toString();
        C87412m.m108593f(gVar5, "drawJson.toString()");
        gVar3.put("draw", C112551y.m153814n(gVar5, ",", ";", false));
        String gVar6 = gVar3.toString();
        C87412m.m108593f(gVar6, "valueJson.toString()");
        return C112551y.m153814n(gVar6, ",", ";", false);
    }

    /* renamed from: f */
    public final String mo163424f() {
        C104289g gVar = new C104289g();
        for (Size size : this.f334505k) {
            HashMap<String, C112039b.C112040a> hashMap = this.f334496b;
            C112039b.C112040a aVar = hashMap.get("RemoteTextureSizeChange_" + size.getWidth() + '*' + size.getHeight());
            if (aVar != null) {
                C112039b c = aVar.mo163759c();
                StringBuilder sb = new StringBuilder();
                sb.append(size.getWidth());
                sb.append('*');
                sb.append(size.getHeight());
                gVar.put(sb.toString(), mo163436r(size, c.f335400b, c.f335399a));
            }
        }
        C104289g gVar2 = new C104289g();
        for (Size size2 : this.f334506l) {
            HashMap<String, C112039b.C112040a> hashMap2 = this.f334496b;
            C112039b.C112040a aVar2 = hashMap2.get("RemoteDrawSizeChange_" + size2.getWidth() + '*' + size2.getHeight());
            if (aVar2 != null) {
                C112039b c2 = aVar2.mo163759c();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(size2.getWidth());
                sb4.append('*');
                sb4.append(size2.getHeight());
                gVar2.put(sb4.toString(), mo163436r(size2, c2.f335400b, c2.f335399a));
            }
        }
        C104289g gVar3 = new C104289g();
        for (Number intValue : this.f334508n) {
            int intValue2 = intValue.intValue();
            HashMap<String, C112039b.C112040a> hashMap3 = this.f334496b;
            C112039b.C112040a aVar3 = hashMap3.get("DrawRemoteRotateChange" + intValue2);
            if (aVar3 != null) {
                C112039b c3 = aVar3.mo163759c();
                gVar3.put(String.valueOf(intValue2), mo163437s(intValue2, c3.f335400b, c3.f335399a));
            }
        }
        C104289g gVar4 = new C104289g();
        String gVar5 = gVar.toString();
        C87412m.m108593f(gVar5, "textureJson.toString()");
        gVar4.put("textureSize", C112551y.m153814n(gVar5, ",", ";", false));
        String gVar6 = gVar2.toString();
        C87412m.m108593f(gVar6, "drawJson.toString()");
        gVar4.put("drawSize", C112551y.m153814n(gVar6, ",", ";", false));
        String gVar7 = gVar3.toString();
        C87412m.m108593f(gVar7, "rotateJson.toString()");
        gVar4.put(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, C112551y.m153814n(gVar7, ",", ";", false));
        String gVar8 = gVar4.toString();
        C87412m.m108593f(gVar8, "valueJson.toString()");
        return C112551y.m153814n(gVar8, ",", ";", false);
    }

    /* renamed from: g */
    public final String mo163425g() {
        C104289g gVar = new C104289g();
        C112039b.C112040a aVar = this.f334497c.get("RemoteSourceTimeoutNoFrame");
        if (aVar != null) {
            C112039b c = aVar.mo163759c();
            gVar.mo145953n("times", c.f335399a);
            gVar.mo145954o("total", c.f335400b);
        }
        C104289g gVar2 = new C104289g();
        C112039b.C112040a aVar2 = this.f334497c.get("RemoteOnScreenTimeoutNoFrame");
        if (aVar2 != null) {
            C112039b c2 = aVar2.mo163759c();
            gVar2.mo145953n("times", c2.f335399a);
            gVar2.mo145954o("total", c2.f335400b);
        }
        C104289g gVar3 = new C104289g();
        String gVar4 = gVar.toString();
        C87412m.m108593f(gVar4, "sourceJson.toString()");
        gVar3.put(FirebaseAnalytics.C113379b.SOURCE, C112551y.m153814n(gVar4, ",", ";", false));
        String gVar5 = gVar2.toString();
        C87412m.m108593f(gVar5, "screenJson.toString()");
        gVar3.put("screen", C112551y.m153814n(gVar5, ",", ";", false));
        String gVar6 = gVar3.toString();
        C87412m.m108593f(gVar6, "valueJson.toString()");
        return C112551y.m153814n(gVar6, ",", ";", false);
    }

    /* renamed from: h */
    public final String mo163426h() {
        C104289g gVar = new C104289g();
        C112039b.C112040a aVar = this.f334497c.get("RemoteTextureError");
        if (aVar != null) {
            C112039b c = aVar.mo163759c();
            gVar.mo145953n("times", c.f335399a);
            gVar.mo145954o("total", c.f335400b);
        }
        C104289g gVar2 = new C104289g();
        C112039b.C112040a aVar2 = this.f334497c.get("RemoteDrawError");
        if (aVar2 != null) {
            C112039b c2 = aVar2.mo163759c();
            gVar2.mo145953n("times", c2.f335399a);
            gVar2.mo145954o("total", c2.f335400b);
        }
        C104289g gVar3 = new C104289g();
        String gVar4 = gVar.toString();
        C87412m.m108593f(gVar4, "textureJson.toString()");
        gVar3.put("texture", C112551y.m153814n(gVar4, ",", ";", false));
        String gVar5 = gVar2.toString();
        C87412m.m108593f(gVar5, "drawJson.toString()");
        gVar3.put("draw", C112551y.m153814n(gVar5, ",", ";", false));
        String gVar6 = gVar3.toString();
        C87412m.m108593f(gVar6, "valueJson.toString()");
        return C112551y.m153814n(gVar6, ",", ";", false);
    }

    /* renamed from: i */
    public final String mo163427i() {
        C104289g gVar = new C104289g();
        C112039b.C112040a aVar = this.f334496b.get("DecodeChangeHard");
        Integer num = null;
        gVar.put("decodeHard", aVar != null ? Integer.valueOf(aVar.mo163759c().f335399a) : null);
        C112039b.C112040a aVar2 = this.f334496b.get("DecodeChangeSoft");
        if (aVar2 != null) {
            num = Integer.valueOf(aVar2.mo163759c().f335399a);
        }
        gVar.put("decodeSoft", num);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "valueJson.toString()");
        return C112551y.m153814n(gVar2, ",", ";", false);
    }

    /* renamed from: j */
    public final String mo163428j() {
        C104289g gVar = new C104289g();
        C112039b.C112040a aVar = this.f334496b.get("DecodeChangeHard");
        Long l = null;
        gVar.put("decodeHard", aVar != null ? Long.valueOf(aVar.mo163759c().f335400b) : null);
        C112039b.C112040a aVar2 = this.f334496b.get("DecodeChangeSoft");
        if (aVar2 != null) {
            l = Long.valueOf(aVar2.mo163759c().f335400b);
        }
        gVar.put("decodeSoft", l);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "valueJson.toString()");
        return C112551y.m153814n(gVar2, ",", ";", false);
    }

    /* renamed from: k */
    public final void mo163429k(boolean z) {
        boolean z2 = false;
        if (z) {
            if (this.f334482A == 0) {
                this.f334482A = Util.nowMilliSecond();
            }
            long milliSecondsToNow = Util.milliSecondsToNow(this.f334482A);
            if (201 <= milliSecondsToNow && milliSecondsToNow < 500) {
                z2 = true;
            }
            if (z2) {
                this.f334518x++;
                this.f334516v += milliSecondsToNow;
            } else if (milliSecondsToNow > 500) {
                this.f334519y++;
                this.f334517w += milliSecondsToNow;
            }
            this.f334520z++;
            this.f334482A = Util.nowMilliSecond();
        } else if (!this.f334515u) {
            if (this.f334514t == 0) {
                this.f334514t = Util.nowMilliSecond();
            }
            long milliSecondsToNow2 = Util.milliSecondsToNow(this.f334514t);
            if (201 <= milliSecondsToNow2 && milliSecondsToNow2 < 500) {
                z2 = true;
            }
            if (z2) {
                this.f334509o++;
                this.f334512r += milliSecondsToNow2;
            } else if (milliSecondsToNow2 > 500) {
                this.f334510p++;
                this.f334513s += milliSecondsToNow2;
            }
            this.f334511q++;
            this.f334514t = Util.nowMilliSecond();
        }
    }

    /* renamed from: l */
    public final void mo163430l(Size size, boolean z) {
        String str;
        C87412m.m108594g(size, "size");
        Log.m105924i("MicroMsg.VoIPRenderReport", "isLocal : " + z + "onRenderSizeChanged " + size.getWidth() + '*' + size.getHeight());
        if (size.getWidth() * size.getHeight() <= 1) {
            Log.m105924i("MicroMsg.VoIPRenderReport", "isLocal : " + z + "onDrawSizeError");
            long j = C109247e.vx0().f333458r;
            String str2 = z ? "LocalDrawError" : "RemoteDrawError";
            C112039b.C112040a aVar = this.f334497c.get(str2);
            if (aVar == null) {
                aVar = new C112039b.C112040a();
            }
            aVar.mo163760d(Util.milliSecondsToNow(j));
            aVar.f335401a = str2;
            this.f334497c.put(str2, aVar);
        }
        if (z) {
            this.f334504j.add(size);
        } else {
            this.f334506l.add(size);
        }
        long j2 = C109247e.vx0().f333458r;
        if (z) {
            str = "LocalDrawSizeChange_" + size.getWidth() + '*' + size.getHeight();
        } else {
            str = "RemoteDrawSizeChange_" + size.getWidth() + '*' + size.getHeight();
        }
        String str3 = z ? this.f334500f : this.f334501g;
        C112039b.C112040a aVar2 = this.f334496b.get(str);
        if (aVar2 == null) {
            aVar2 = new C112039b.C112040a();
        }
        C112039b.C112040a aVar3 = this.f334496b.get(str3);
        if (aVar3 != null) {
            aVar3.mo163758b();
            this.f334496b.put(str, aVar3);
        }
        aVar2.mo163760d(Util.milliSecondsToNow(j2));
        aVar2.mo163762f(str);
        StringBuilder sb = new StringBuilder();
        sb.append(size.getWidth());
        sb.append('*');
        sb.append(size.getHeight());
        aVar2.mo163763g(sb.toString());
        this.f334496b.put(str, aVar2);
        if (z) {
            this.f334500f = str;
        } else {
            this.f334501g = str;
        }
    }

    /* renamed from: m */
    public final void mo163431m(Size size, boolean z) {
        String str;
        C87412m.m108594g(size, "size");
        Log.m105924i("MicroMsg.VoIPRenderReport", "isLocal : " + z + "onTextureSizeChanged " + size.getWidth() + '*' + size.getHeight());
        if (size.getWidth() * size.getHeight() <= 1) {
            Log.m105924i("MicroMsg.VoIPRenderReport", "isLocal : " + z + "onTextureSizeError");
            long j = C109247e.vx0().f333458r;
            String str2 = z ? "LocalTextureError" : "RemoteTextureError";
            C112039b.C112040a aVar = this.f334497c.get(str2);
            if (aVar == null) {
                aVar = new C112039b.C112040a();
            }
            aVar.mo163760d(Util.milliSecondsToNow(j));
            aVar.f335401a = str2;
            this.f334497c.put(str2, aVar);
        }
        if (z) {
            this.f334503i.add(size);
        } else {
            this.f334505k.add(size);
        }
        long j2 = C109247e.vx0().f333458r;
        if (z) {
            str = "LocalTextureSizeChange_" + size.getWidth() + '*' + size.getHeight();
        } else {
            str = "RemoteTextureSizeChange_" + size.getWidth() + '*' + size.getHeight();
        }
        String str3 = z ? this.f334498d : this.f334499e;
        C112039b.C112040a aVar2 = this.f334496b.get(str);
        if (aVar2 == null) {
            aVar2 = new C112039b.C112040a();
        }
        C112039b.C112040a aVar3 = this.f334496b.get(str3);
        if (aVar3 != null) {
            aVar3.mo163758b();
        }
        aVar2.mo163760d(Util.milliSecondsToNow(j2));
        aVar2.mo163762f(str);
        StringBuilder sb = new StringBuilder();
        sb.append(size.getWidth());
        sb.append('*');
        sb.append(size.getHeight());
        aVar2.mo163763g(sb.toString());
        this.f334496b.put(str, aVar2);
        if (z) {
            this.f334498d = str;
        } else {
            this.f334499e = str;
        }
    }

    /* renamed from: n */
    public final void mo163432n(boolean z, long j) {
        Log.m105924i("MicroMsg.VoIPRenderReport", "isLocal : " + z + "timeOutOnScreenNoFrameResume");
        String str = z ? "LocalOnScreenTimeoutNoFrame" : "RemoteOnScreenTimeoutNoFrame";
        C112039b.C112040a aVar = this.f334497c.get(str);
        if (aVar != null) {
            aVar.mo163761e(j);
            aVar.f335404d += j;
            aVar.f335402b++;
            this.f334497c.put(str, aVar);
        }
    }

    /* renamed from: o */
    public final void mo163433o(boolean z) {
        Log.m105924i("MicroMsg.VoIPRenderReport", "isLocal : " + z + "timeoutOffScreenNoFrame");
        long j = C109247e.vx0().f333458r;
        String str = z ? "LocalSourceTimeoutNoFrame" : "RemoteSourceTimeoutNoFrame";
        C112039b.C112040a aVar = this.f334497c.get(str);
        if (aVar == null) {
            aVar = new C112039b.C112040a();
        }
        aVar.mo163760d(Util.milliSecondsToNow(j));
        aVar.f335401a = str;
        this.f334497c.put(str, aVar);
    }

    /* renamed from: p */
    public final void mo163434p(boolean z, long j) {
        Log.m105924i("MicroMsg.VoIPRenderReport", "isLocal : " + z + "timeoutOffScreenNoFrameResume");
        String str = z ? "LocalSourceTimeoutNoFrame" : "RemoteSourceTimeoutNoFrame";
        C112039b.C112040a aVar = this.f334497c.get(str);
        if (aVar != null) {
            aVar.mo163761e(j);
            aVar.f335404d += j;
            aVar.f335402b++;
            this.f334497c.put(str, aVar);
        }
    }

    /* renamed from: q */
    public final void mo163435q(boolean z) {
        Log.m105924i("MicroMsg.VoIPRenderReport", "isLocal : " + z + "timeoutOnScreenNoFrame");
        long j = C109247e.vx0().f333458r;
        String str = z ? "LocalOnScreenTimeoutNoFrame" : "RemoteOnScreenTimeoutNoFrame";
        C112039b.C112040a aVar = this.f334497c.get(str);
        if (aVar == null) {
            aVar = new C112039b.C112040a();
        }
        aVar.mo163760d(Util.milliSecondsToNow(j));
        aVar.f335401a = str;
        this.f334497c.put(str, aVar);
    }

    /* renamed from: r */
    public final String mo163436r(Size size, long j, int i) {
        C104289g gVar = new C104289g();
        StringBuilder sb = new StringBuilder();
        sb.append(size.getWidth());
        sb.append('*');
        sb.append(size.getHeight());
        gVar.put("size", sb.toString());
        gVar.mo145954o("totalTime", j);
        gVar.mo145953n("times", i);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "valueJson.toString()");
        return C112551y.m153814n(gVar2, ",", ";", false);
    }

    /* renamed from: s */
    public final String mo163437s(int i, long j, int i2) {
        C104289g gVar = new C104289g();
        gVar.mo145953n(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, i);
        gVar.mo145954o("totalTime", j);
        gVar.mo145953n("times", i2);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "valueJson.toString()");
        return C112551y.m153814n(gVar2, ",", ";", false);
    }
}
