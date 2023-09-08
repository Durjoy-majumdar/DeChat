package lg1;

import a14.C0000n0;
import ak1.C54116w;
import cl1.C39975j;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import ks3.C46740q;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C50317lw0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.box.plugin.FinderLiveBoxGroupHintPlugin$switchToBox$1", mo125469f = "FinderLiveBoxGroupHintPlugin.kt", mo125470l = {116}, mo125471m = "invokeSuspend")
/* renamed from: lg1.g */
public final class C46853g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f126023d;

    /* renamed from: e */
    public final /* synthetic */ C10509e f126024e;

    /* renamed from: f */
    public final /* synthetic */ String f126025f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46853g(C10509e eVar, String str, C15601d<? super C46853g> dVar) {
        super(2, dVar);
        this.f126024e = eVar;
        this.f126025f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C46853g(this.f126024e, this.f126025f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C46853g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Class cls = C39975j.class;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f126023d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.f126025f;
            this.f126023d = 1;
            if (((C39975j) this.f126024e.mo87696x0(cls)).mo62583k3(str, true, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str2 = this.f126025f;
        C87412m.m108594g(str2, "boxId");
        C50317lw0 lw02 = new C50317lw0();
        int i2 = C46740q.f125820a;
        lw02.f137676d = 1;
        lw02.f137677e = str2;
        ((C39975j) this.f126024e.mo87696x0(cls)).mo62576c3(lw02);
        String str3 = this.f126025f;
        C87412m.m108594g(str3, "boxId");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_type", 1);
            jSONObject.put("group_box_number", str3);
            ((C54116w) C86312j.m106911c(C54116w.class)).Lx0(jSONObject);
        } catch (Throwable unused) {
        }
        return C13598b0.f38549a;
    }
}
