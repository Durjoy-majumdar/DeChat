package gs3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53922m0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import com.tencent.p014mm.live.core.core.player.FinderPageExitPlayerDetector;
import com.tencent.p014mm.plugin.finder.detector.FinderMMPlayerDetector;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.plugin.finder.detector.api.detect.BaseEventDetector;
import fs3.C8205a;
import fy3.C32227p;
import gy3.C87412m;
import hs3.C60149a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import org.json.JSONArray;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: gs3.c */
public final class C59698c {

    /* renamed from: a */
    public static final C59698c f170541a = new C59698c();

    /* renamed from: b */
    public static final HashSet<String> f170542b = new HashSet<>();

    /* renamed from: c */
    public static final HashMap<Class<?>, BaseEventDetector<?>> f170543c;

    /* renamed from: d */
    public static C0000n0 f170544d = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c).plus(new C53922m0("page_event_detector_checker")));

    /* renamed from: e */
    public static C53973z1 f170545e;

    /* renamed from: f */
    public static final C8205a f170546f = new C8205a();

    @C91590f(mo125468c = "com.tencent.plugin.finder.detector.api.detect.PageEventDetectorManager$checkDetect$1", mo125469f = "PageEventDetectorManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: gs3.c$a */
    public static final class C59699a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f170547d;

        /* renamed from: e */
        public final /* synthetic */ String f170548e;

        /* renamed from: f */
        public final /* synthetic */ JSONArray f170549f;

        @C91590f(mo125468c = "com.tencent.plugin.finder.detector.api.detect.PageEventDetectorManager$checkDetect$1$1$1", mo125469f = "PageEventDetectorManager.kt", mo125470l = {82}, mo125471m = "invokeSuspend")
        /* renamed from: gs3.c$a$a */
        public static final class C59700a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f170550d;

            /* renamed from: e */
            public final /* synthetic */ Map.Entry<Class<?>, BaseEventDetector<?>> f170551e;

            /* renamed from: f */
            public final /* synthetic */ String f170552f;

            /* renamed from: g */
            public final /* synthetic */ JSONArray f170553g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59700a(Map.Entry<? extends Class<?>, ? extends BaseEventDetector<?>> entry, String str, JSONArray jSONArray, C15601d<? super C59700a> dVar) {
                super(2, dVar);
                this.f170551e = entry;
                this.f170552f = str;
                this.f170553g = jSONArray;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C59700a(this.f170551e, this.f170552f, this.f170553g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C59700a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f170550d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BaseEventDetector value = this.f170551e.getValue();
                    C60149a aVar2 = new C60149a(this.f170552f, this.f170553g);
                    this.f170550d = 1;
                    value.getClass();
                    if (BaseEventDetector.m67012a(value, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59699a(String str, JSONArray jSONArray, C15601d<? super C59699a> dVar) {
            super(2, dVar);
            this.f170548e = str;
            this.f170549f = jSONArray;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C59699a aVar = new C59699a(this.f170548e, this.f170549f, dVar);
            aVar.f170547d = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59699a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f170547d;
            HashMap<Class<?>, BaseEventDetector<?>> hashMap = C59698c.f170543c;
            String str = this.f170548e;
            JSONArray jSONArray = this.f170549f;
            for (Map.Entry<Class<?>, BaseEventDetector<?>> aVar : hashMap.entrySet()) {
                C53895h.m60464b(n0Var, (C66212f) null, (C53934p0) null, new C59700a(aVar, str, jSONArray, (C15601d<? super C59700a>) null), 3, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    static {
        HashMap<Class<?>, BaseEventDetector<?>> hashMap = new HashMap<>();
        f170543c = hashMap;
        Class<FinderPageExitPlayerDetector> cls = FinderPageExitPlayerDetector.class;
        FinderPageExitPlayerDetector newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        C87412m.m108593f(newInstance, "cls.getConstructor().newInstance()");
        hashMap.put(cls, newInstance);
        Class<FinderMMPlayerDetector> cls2 = FinderMMPlayerDetector.class;
        FinderMMPlayerDetector newInstance2 = cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
        C87412m.m108593f(newInstance2, "cls.getConstructor().newInstance()");
        hashMap.put(cls2, newInstance2);
    }

    /* renamed from: a */
    public final void mo84677a(String str) {
        JSONArray jSONArray;
        C87412m.m108594g(str, "detectorSource");
        C8205a aVar = f170546f;
        synchronized (aVar.f27134d) {
            jSONArray = new JSONArray();
            for (String put : aVar.f27134d) {
                jSONArray.put(put);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("start checkDetect checkJob: ");
        C53973z1 z1Var = f170545e;
        sb.append(z1Var != null ? Boolean.valueOf(z1Var.mo74530c()) : null);
        sb.append(" detectorSource: ");
        sb.append(str);
        sb.append(" traceDump: ");
        sb.append(jSONArray);
        Log.m105924i("PageEventDetectorManager", sb.toString());
        C53973z1 z1Var2 = f170545e;
        if (z1Var2 != null) {
            C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
        }
        f170545e = C53895h.m60466d(f170544d, (C66212f) null, (C53934p0) null, new C59699a(str, jSONArray, (C15601d<? super C59699a>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public final <T> T mo84678b(Class<? extends BaseEventDetector<?>> cls) {
        C87412m.m108594g(cls, "cls");
        HashMap<Class<?>, BaseEventDetector<?>> hashMap = f170543c;
        if (hashMap.get(cls) != null) {
            return hashMap.get(cls);
        }
        throw new RuntimeException("current detector: " + cls.getSimpleName() + " need to register on init");
    }
}
