package gs3;

import a14.C0000n0;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.plugin.finder.detector.api.detect.BaseEventDetector;
import fs3.C59316c;
import fy3.C32227p;
import hs3.C60149a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.plugin.finder.detector.api.detect.BaseEventDetector$report$2", mo125469f = "BaseEventDetector.kt", mo125470l = {150}, mo125471m = "invokeSuspend")
/* renamed from: gs3.a */
public final class C59696a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f170532d;

    /* renamed from: e */
    public Object f170533e;

    /* renamed from: f */
    public Object f170534f;

    /* renamed from: g */
    public int f170535g;

    /* renamed from: h */
    public final /* synthetic */ Map<String, C59316c<Object>> f170536h;

    /* renamed from: i */
    public final /* synthetic */ BaseEventDetector<Object> f170537i;

    /* renamed from: j */
    public final /* synthetic */ C60149a f170538j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59696a(Map<String, C59316c<Object>> map, BaseEventDetector<Object> baseEventDetector, C60149a aVar, C15601d<? super C59696a> dVar) {
        super(2, dVar);
        this.f170536h = map;
        this.f170537i = baseEventDetector;
        this.f170538j = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59696a(this.f170536h, this.f170537i, this.f170538j, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59696a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        BaseEventDetector<Object> baseEventDetector;
        C60149a aVar;
        Iterator it;
        C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
        int i = this.f170535g;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Map<String, C59316c<Object>> map = this.f170536h;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                String str = ((C59316c) next.getValue()).f169614b;
                if (!(str == null || str.length() == 0)) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            BaseEventDetector<Object> baseEventDetector2 = this.f170537i;
            aVar = this.f170538j;
            it = linkedHashMap.entrySet().iterator();
            baseEventDetector = baseEventDetector2;
        } else if (i == 1) {
            it = (Iterator) this.f170534f;
            aVar = (C60149a) this.f170533e;
            baseEventDetector = (BaseEventDetector) this.f170532d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            FinderLiveErrorReportStruct finderLiveErrorReportStruct = new FinderLiveErrorReportStruct();
            finderLiveErrorReportStruct.f155539e = baseEventDetector.mo76382i();
            finderLiveErrorReportStruct.mo76263s(baseEventDetector.mo76383j((C59316c) entry.getValue(), aVar));
            finderLiveErrorReportStruct.f155538d = finderLiveErrorReportStruct.mo86045b("playerLeaksTrace", ((C59316c) entry.getValue()).f169614b, true);
            finderLiveErrorReportStruct.f155541g = baseEventDetector.mo76380g();
            String str2 = baseEventDetector.f165801e;
            Log.m105924i(str2, "ilog report " + finderLiveErrorReportStruct.f155540f + " version: " + finderLiveErrorReportStruct.f155541g);
            finderLiveErrorReportStruct.mo86054n();
            this.f170532d = baseEventDetector;
            this.f170533e = aVar;
            this.f170534f = it;
            this.f170535g = 1;
            if (baseEventDetector.mo82664o(aVar, entry, this) == aVar2) {
                return aVar2;
            }
        }
        return C13598b0.f38549a;
    }
}
