package pf1;

import a14.C0000n0;
import a14.C53973z1;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87413o;
import i31.C117134d;
import jt1.C9517a;
import jt1.C9519c;
import kotlin.ResultKt;
import pd1.C11887a;
import rx3.C13598b0;
import te3.C51722vp0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.jumper.JumperUtils$preloadTopicInfo$1", mo125469f = "JumperUtils.kt", mo125470l = {1399}, mo125471m = "invokeSuspend")
/* renamed from: pf1.m0 */
public final class C11913m0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f34811d;

    /* renamed from: e */
    public /* synthetic */ Object f34812e;

    /* renamed from: f */
    public final /* synthetic */ long f34813f;

    /* renamed from: pf1.m0$a */
    public static final class C11914a extends C87413o implements C32224a<C9519c<String, C51722vp0>> {

        /* renamed from: d */
        public final /* synthetic */ long f34814d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11914a(long j) {
            super(0);
            this.f34814d = j;
        }

        public Object invoke() {
            return new C11887a(this.f34814d, "");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11913m0(long j, C15601d<? super C11913m0> dVar) {
        super(2, dVar);
        this.f34813f = j;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C11913m0 m0Var = new C11913m0(this.f34813f, dVar);
        m0Var.f34812e = obj;
        return m0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C11913m0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f34811d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("Finder.JumperUtils", "preloadTopicInfo: preload topic eventTopicId = " + this.f34813f);
            C11914a aVar2 = new C11914a(this.f34813f);
            C66212f coroutineContext = ((C0000n0) this.f34812e).getCoroutineContext();
            int i2 = C53973z1.f151221b0;
            C9517a aVar3 = new C9517a(aVar2, (C53973z1) coroutineContext.get(C53973z1.C0004b.f3d), (C0125s) null, 4, (C8480h) null);
            this.f34811d = 1;
            if (C117134d.m165172f(aVar3, this) == aVar) {
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
