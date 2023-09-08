package fs3;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import org.json.JSONObject;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: fs3.b */
public final class C59314b {

    /* renamed from: a */
    public final String f169605a;

    /* renamed from: b */
    public View f169606b;

    /* renamed from: c */
    public String f169607c;

    /* renamed from: d */
    public long f169608d;

    /* renamed from: e */
    public String f169609e = "";

    @C91590f(mo125468c = "com.tencent.plugin.finder.detector.api.DetectorAdapter$checkLeakDetailReport$1$1", mo125469f = "DetectorAdapter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: fs3.b$a */
    public static final class C59315a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ int f169610d;

        /* renamed from: e */
        public final /* synthetic */ String f169611e;

        /* renamed from: f */
        public final /* synthetic */ C59314b f169612f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59315a(int i, String str, C59314b bVar, C15601d<? super C59315a> dVar) {
            super(2, dVar);
            this.f169610d = i;
            this.f169611e = str;
            this.f169612f = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59315a(this.f169610d, this.f169611e, this.f169612f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59315a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            FinderLiveErrorReportStruct finderLiveErrorReportStruct = new FinderLiveErrorReportStruct();
            finderLiveErrorReportStruct.f155539e = this.f169610d;
            JSONObject jSONObject = new JSONObject(C112551y.m153816p(this.f169611e, ";", ",", false, 4, (Object) null));
            jSONObject.put("leak_time", (System.currentTimeMillis() - this.f169612f.f169608d) / ((long) 1000));
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject(it.replace(\";…             }.toString()");
            String n = C112551y.m153814n(jSONObject2, ",", ";", false);
            finderLiveErrorReportStruct.mo76263s(n);
            String str = this.f169612f.f169605a;
            Log.m105924i(str, "checkLeakDetailReport leakJson: " + n);
            finderLiveErrorReportStruct.mo86054n();
            C59314b bVar = this.f169612f;
            bVar.f169607c = "";
            bVar.f169608d = 0;
            return C13598b0.f38549a;
        }
    }

    public C59314b(String str) {
        C87412m.m108594g(str, "eventTag");
        this.f169605a = str;
    }

    /* renamed from: a */
    public final void mo84415a(View view) {
        this.f169606b = view;
        String str = this.f169605a;
        Log.m105924i(str, "bindMiniWindowView: " + view);
    }

    /* renamed from: b */
    public final void mo84416b(int i) {
        String str;
        String str2 = this.f169607c;
        if (!(str2 == null || str2.length() == 0) && this.f169608d > 0 && (str = this.f169607c) != null) {
            C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C59315a(i, str, this, (C15601d<? super C59315a>) null), 2, (Object) null);
        }
    }
}
