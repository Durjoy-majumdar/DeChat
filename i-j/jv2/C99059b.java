package jv2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import hp3.C98494b;
import mp3.C88820e;
import op3.C117879d;
import op3.C117880e;

/* renamed from: jv2.b */
public class C99059b implements C98494b<C99056a> {

    /* renamed from: a */
    public C99056a f290372a;

    /* renamed from: b */
    public final C99060a f290373b = new C99060a();

    /* renamed from: c */
    public final C99061b f290374c = new C99061b();

    /* renamed from: d */
    public final C99062c f290375d = new C99062c();

    /* renamed from: jv2.b$a */
    public class C99060a implements C88820e<Void, C117879d<String, Boolean, Boolean, Integer>> {
        public C99060a() {
        }

        /* renamed from: a */
        public String mo55914a() {
            SnsMethodCalculate.markStartTimeMs("getSchedulerType", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoFpListFunctionalApi");
            SnsMethodCalculate.markEndTimeMs("getSchedulerType", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoFpListFunctionalApi");
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoFpListFunctionalApi");
            C117879d dVar = (C117879d) obj;
            SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoFpListFunctionalApi");
            C99056a aVar = C99059b.this.f290372a;
            boolean booleanValue = ((Boolean) dVar.mo182596a(1)).booleanValue();
            boolean booleanValue2 = ((Boolean) dVar.mo182596a(2)).booleanValue();
            int intValue = ((Integer) dVar.mo182596a(3)).intValue();
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("doFpList", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
            aVar.f290367v.mo6413d(1, (String) dVar.mo182596a(0), booleanValue, booleanValue2, intValue);
            SnsMethodCalculate.markEndTimeMs("doFpList", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
            SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoFpListFunctionalApi");
            SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoFpListFunctionalApi");
            return null;
        }
    }

    /* renamed from: jv2.b$b */
    public class C99061b implements C88820e<Void, C117879d<String, Boolean, Boolean, Integer>> {
        public C99061b() {
        }

        /* renamed from: a */
        public String mo55914a() {
            SnsMethodCalculate.markStartTimeMs("getSchedulerType", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoNpListFunctionalApi");
            SnsMethodCalculate.markEndTimeMs("getSchedulerType", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoNpListFunctionalApi");
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoNpListFunctionalApi");
            C117879d dVar = (C117879d) obj;
            SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoNpListFunctionalApi");
            C99056a aVar = C99059b.this.f290372a;
            boolean booleanValue = ((Boolean) dVar.mo182596a(1)).booleanValue();
            boolean booleanValue2 = ((Boolean) dVar.mo182596a(2)).booleanValue();
            int intValue = ((Integer) dVar.mo182596a(3)).intValue();
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("doNpList", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
            aVar.f290367v.mo6414e(1, (String) dVar.mo182596a(0), booleanValue, booleanValue2, intValue);
            SnsMethodCalculate.markEndTimeMs("doNpList", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
            SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoNpListFunctionalApi");
            SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoNpListFunctionalApi");
            return null;
        }
    }

    /* renamed from: jv2.b$c */
    public class C99062c implements C88820e<Void, C117880e<String, Integer, Boolean, Integer, Long>> {
        public C99062c() {
        }

        /* renamed from: a */
        public String mo55914a() {
            SnsMethodCalculate.markStartTimeMs("getSchedulerType", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoOtherListFunctionalApi");
            SnsMethodCalculate.markEndTimeMs("getSchedulerType", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoOtherListFunctionalApi");
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoOtherListFunctionalApi");
            C117880e eVar = (C117880e) obj;
            SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoOtherListFunctionalApi");
            C99056a aVar = C99059b.this.f290372a;
            int intValue = ((Integer) eVar.mo182596a(1)).intValue();
            boolean booleanValue = ((Boolean) eVar.mo182596a(2)).booleanValue();
            int intValue2 = ((Integer) eVar.mo182596a(3)).intValue();
            long longValue = ((Long) eVar.mo182596a(4)).longValue();
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("doOtherList", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
            aVar.f290367v.mo6415f(1, (String) eVar.mo182596a(0), intValue, booleanValue, longValue, intValue2);
            SnsMethodCalculate.markEndTimeMs("doOtherList", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
            SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoOtherListFunctionalApi");
            SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi$DoOtherListFunctionalApi");
            return null;
        }
    }

    public C99059b() {
        C99056a aVar = new C99056a();
        this.f290372a = aVar;
    }

    /* renamed from: a */
    public Object mo67527a() {
        SnsMethodCalculate.markStartTimeMs("originalApi", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi");
        SnsMethodCalculate.markStartTimeMs("originalApi", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi");
        C99056a aVar = this.f290372a;
        SnsMethodCalculate.markEndTimeMs("originalApi", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi");
        SnsMethodCalculate.markEndTimeMs("originalApi", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi");
        return aVar;
    }
}
