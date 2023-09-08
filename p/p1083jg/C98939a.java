package p1083jg;

import com.tencent.p014mm.autogen.mmdata.rpt.AssetSetMsgStruct;
import com.tencent.p014mm.storage.C72963f4;
import dm2.C58325i;
import gy3.C87412m;
import org.json.JSONException;
import org.json.JSONObject;
import p434ig.C98671a;
import p434ig.C98672d;
import p434ig.C98674g;
import p749xh.C38549d8;
import pe3.C47465a;
import qh0.C62619a;
import th0.C101888l;
import z04.C112551y;

/* renamed from: jg.a */
public final class C98939a<T extends C47465a> implements C58325i {

    /* renamed from: a */
    public final /* synthetic */ long f290023a;

    /* renamed from: b */
    public final /* synthetic */ C72963f4 f290024b;

    /* renamed from: c */
    public final /* synthetic */ int f290025c;

    /* renamed from: d */
    public final /* synthetic */ int f290026d;

    /* renamed from: e */
    public final /* synthetic */ C98672d f290027e;

    /* renamed from: f */
    public final /* synthetic */ int f290028f;

    public C98939a(long j, C72963f4 f4Var, int i, int i2, C98672d dVar, int i3) {
        this.f290023a = j;
        this.f290024b = f4Var;
        this.f290025c = i;
        this.f290026d = i2;
        this.f290027e = dVar;
        this.f290028f = i3;
    }

    /* renamed from: a */
    public void mo32063a(int i, boolean z, C38549d8 d8Var, C47465a aVar) {
        C62619a aVar2 = (C62619a) aVar;
        if (aVar2 != null) {
            long j = this.f290023a;
            C72963f4 f4Var = this.f290024b;
            int i2 = this.f290025c;
            int i3 = this.f290026d;
            C98672d dVar = this.f290027e;
            int i4 = this.f290028f;
            AssetSetMsgStruct assetSetMsgStruct = new AssetSetMsgStruct();
            assetSetMsgStruct.f265319d = j;
            C72963f4 f4Var2 = null;
            assetSetMsgStruct.f265321f = assetSetMsgStruct.mo86045b("ChatName", f4Var != null ? f4Var.mo108768t() : null, true);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(f4Var != null ? Long.valueOf(f4Var.mo108774y2()) : null);
            assetSetMsgStruct.f265322g = assetSetMsgStruct.mo86045b("MsgID", sb.toString(), true);
            if (i2 != 0 || i3 != 0) {
                assetSetMsgStruct.f265323h = (long) i2;
                assetSetMsgStruct.f265324i = (long) i3;
            } else if (f4Var != null) {
                if (f4Var.getContent() != null) {
                    f4Var2 = f4Var;
                }
                if (f4Var2 != null) {
                    C98671a aVar3 = new C98671a();
                    String content = f4Var2.getContent();
                    C87412m.m108593f(content, "it.content");
                    aVar3.mo141099d(content);
                    C98674g gVar = new C98674g();
                    gVar.mo141099d(aVar3.f289309p);
                    C101888l lVar = C101888l.f300029a;
                    assetSetMsgStruct.f265323h = (long) lVar.mo141354c(gVar).size();
                    assetSetMsgStruct.f265324i = (long) lVar.mo141355d(gVar).size();
                }
            }
            long j2 = 2;
            long j3 = 1;
            assetSetMsgStruct.f265325j = f4Var != null && f4Var.mo108769t2() == 1 ? 1 : 2;
            if (f4Var != null) {
                if (f4Var.getStatus() > 1 && f4Var.getStatus() != 9) {
                    j2 = 1;
                }
                assetSetMsgStruct.f265326k = j2;
            }
            if (dVar != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("pos", i4);
                    int i5 = 2;
                    if (dVar.mo55274P() == 2) {
                        i5 = 1;
                    } else if (dVar.mo55274P() != 4) {
                        i5 = 0;
                    }
                    jSONObject.put("type", i5);
                } catch (JSONException unused) {
                }
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "jsonObject.toString()");
                assetSetMsgStruct.f265320e = assetSetMsgStruct.mo86045b("ActionElements", C112551y.m153814n(jSONObject2, ",", ";", false), true);
            }
            long j4 = aVar2.f177833h;
            if (((int) j4) != -1) {
                j3 = j4;
            }
            assetSetMsgStruct.f265327l = j3;
            assetSetMsgStruct.mo86054n();
        }
    }
}
