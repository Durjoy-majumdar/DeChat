package la0;

import a14.C0000n0;
import com.tencent.maas.analytics.MJAnalyticsS12;
import com.tencent.maas.model.MJTemplateInfo;
import com.tencent.p014mm.autogen.mmdata.rpt.MaasRecommendReportStruct;
import fy3.C32227p;
import gy3.C87412m;
import ha0.C108183c0;
import ja0.C24789f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import sx3.C36907w;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

@C91590f(mo125468c = "com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$onRecommendResult$2", mo125469f = "MaasSdkUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: la0.d */
public final class C61256d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C109300b f174347d;

    /* renamed from: e */
    public final /* synthetic */ List<MJTemplateInfo> f174348e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61256d(C109300b bVar, List<? extends MJTemplateInfo> list, C15601d<? super C61256d> dVar) {
        super(2, dVar);
        this.f174347d = bVar;
        this.f174348e = list;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61256d(this.f174347d, this.f174348e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61256d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        MJAnalyticsS12.MJAnalyticsMovieSession d;
        ResultKt.throwOnFailure(obj);
        C108183c0 c0Var = this.f174347d.f327191d;
        if (!(c0Var == null || (d = c0Var.mo158615d()) == null)) {
            List<MJTemplateInfo> list = this.f174348e;
            C24789f fVar = C24789f.f70694a;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (MJTemplateInfo mJTemplateInfo : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("tid", mJTemplateInfo.getTemplateID());
                if (d.getFixedTemplateIdsList().contains(mJTemplateInfo.getTemplateID())) {
                    jSONObject.put("src", 1);
                } else {
                    jSONObject.put("src", 2);
                }
                arrayList.add(jSONObject);
            }
            MaasRecommendReportStruct maasRecommendReportStruct = C24789f.f70695b;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(C24789f.f70698e);
            arrayList2.addAll(arrayList);
            C13598b0 b0Var = C13598b0.f38549a;
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                jSONArray.put((JSONObject) it.next());
            }
            String jSONArray2 = jSONArray.toString();
            C87412m.m108593f(jSONArray2, "JSONArray().also { jsonA…       }\n    }.toString()");
            maasRecommendReportStruct.f69528i = maasRecommendReportStruct.mo86045b("recids", C112551y.m153814n(jSONArray2, ",", ";", false), true);
        }
        return C13598b0.f38549a;
    }
}
