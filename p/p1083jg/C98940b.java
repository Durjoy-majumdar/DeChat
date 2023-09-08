package p1083jg;

import com.tencent.p014mm.autogen.mmdata.rpt.AssetSetMsgStruct;
import com.tencent.p014mm.storage.C72963f4;
import dm2.C58325i;
import gy3.C87412m;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p434ig.C98672d;
import p749xh.C38549d8;
import pe3.C47465a;
import qh0.C62619a;
import sx3.C64197v;
import z04.C112551y;

/* renamed from: jg.b */
public final class C98940b<T extends C47465a> implements C58325i {

    /* renamed from: a */
    public final /* synthetic */ long f290029a;

    /* renamed from: b */
    public final /* synthetic */ C72963f4 f290030b;

    /* renamed from: c */
    public final /* synthetic */ int f290031c;

    /* renamed from: d */
    public final /* synthetic */ int f290032d;

    /* renamed from: e */
    public final /* synthetic */ List<C98672d> f290033e;

    /* renamed from: f */
    public final /* synthetic */ List<Integer> f290034f;

    public C98940b(long j, C72963f4 f4Var, int i, int i2, List<? extends C98672d> list, List<Integer> list2) {
        this.f290029a = j;
        this.f290030b = f4Var;
        this.f290031c = i;
        this.f290032d = i2;
        this.f290033e = list;
        this.f290034f = list2;
    }

    /* renamed from: a */
    public void mo32063a(int i, boolean z, C38549d8 d8Var, C47465a aVar) {
        C62619a aVar2 = (C62619a) aVar;
        if (aVar2 != null) {
            long j = this.f290029a;
            C72963f4 f4Var = this.f290030b;
            int i2 = this.f290031c;
            int i3 = this.f290032d;
            List<C98672d> list = this.f290033e;
            List<Integer> list2 = this.f290034f;
            AssetSetMsgStruct assetSetMsgStruct = new AssetSetMsgStruct();
            assetSetMsgStruct.f265319d = j;
            assetSetMsgStruct.f265321f = assetSetMsgStruct.mo86045b("ChatName", f4Var != null ? f4Var.mo108768t() : null, true);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(f4Var != null ? Long.valueOf(f4Var.mo108774y2()) : null);
            assetSetMsgStruct.f265322g = assetSetMsgStruct.mo86045b("MsgID", sb.toString(), true);
            assetSetMsgStruct.f265323h = (long) i2;
            assetSetMsgStruct.f265324i = (long) i3;
            long j2 = 2;
            assetSetMsgStruct.f265325j = f4Var != null && f4Var.mo108769t2() == 1 ? 1 : 2;
            if (f4Var != null) {
                if (f4Var.getStatus() > 1 && f4Var.getStatus() != 9) {
                    j2 = 1;
                }
                assetSetMsgStruct.f265326k = j2;
            }
            if (list != null) {
                JSONArray jSONArray = new JSONArray();
                int i4 = 0;
                for (T next : list) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        C98672d dVar = (C98672d) next;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("pos", list2.get(i4).intValue());
                            int i6 = 2;
                            if (dVar.mo55274P() == 2) {
                                i6 = 1;
                            } else if (dVar.mo55274P() != 4) {
                                i6 = 0;
                            }
                            jSONObject.put("type", i6);
                        } catch (JSONException unused) {
                        }
                        jSONArray.put(jSONObject);
                        i4 = i5;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                String jSONArray2 = jSONArray.toString();
                C87412m.m108593f(jSONArray2, "jsonArray.toString()");
                assetSetMsgStruct.f265320e = assetSetMsgStruct.mo86045b("ActionElements", C112551y.m153814n(jSONArray2, ",", ";", false), true);
            }
            long j3 = aVar2.f177833h;
            assetSetMsgStruct.f265327l = ((int) j3) == -1 ? 1 : j3;
            assetSetMsgStruct.mo86054n();
        }
    }
}
