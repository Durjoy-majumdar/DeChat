package ja0;

import a14.C0000n0;
import a14.C53973z1;
import com.tencent.p014mm.autogen.mmdata.rpt.MaaSCreationReportStruct;
import com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import org.json.JSONArray;
import org.json.JSONObject;
import p232rw.C63679m;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

@C91590f(mo125468c = "com.tencent.mm.mj_template.maas.report.MaasReport24946$markExportVideoInfo$1", mo125469f = "MaasReport24946.kt", mo125470l = {81}, mo125471m = "invokeSuspend")
/* renamed from: ja0.c */
public final class C60782c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f173120d;

    /* renamed from: e */
    public final /* synthetic */ C53973z1 f173121e;

    /* renamed from: f */
    public final /* synthetic */ String f173122f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60782c(C53973z1 z1Var, String str, C15601d<? super C60782c> dVar) {
        super(2, dVar);
        this.f173121e = z1Var;
        this.f173122f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60782c(this.f173121e, this.f173122f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60782c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f173120d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C53973z1 z1Var = this.f173121e;
            if (z1Var != null) {
                this.f173120d = 1;
                if (z1Var.mo74521O(this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MaaSCreationReportStruct maaSCreationReportStruct = C60784e.f173128c;
        C60784e eVar = C60784e.f173126a;
        String str = this.f173122f;
        JSONObject jSONObject = new JSONObject();
        C63679m.C63680a b = MultiMediaVideoChecker.f273077a.mo129930b(str);
        if (b != null) {
            Log.m105924i("MaasReport24946", "getVideoReportInfo videoPath:" + str + " info:" + b);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(b.f180525a);
            jSONArray.put(b.f180526b);
            C13598b0 b0Var = C13598b0.f38549a;
            jSONObject.put("s", jSONArray);
            jSONObject.put("d", b.f180528d);
            jSONObject.put("f", Float.valueOf(b.f180527c));
            jSONObject.put("vb", b.f180529e);
            jSONObject.put("ab", b.f180532h);
            jSONObject.put("as", b.f180534j);
            jSONObject.put("acc", b.f180533i);
            jSONObject.put("t", b.f180531g ? "265" : "264");
        }
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …       }\n    }.toString()");
        maaSCreationReportStruct.f156482i = maaSCreationReportStruct.mo86045b("exportMediaInfo", C112551y.m153814n(jSONObject2, ",", ";", false), true);
        return C13598b0.f38549a;
    }
}
