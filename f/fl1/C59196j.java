package fl1;

import a14.C0000n0;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import d14.C58052j1;
import d14.C58087u0;
import fy3.C32227p;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13600d;
import te3.C49291ej0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.state.anchor.FinderLiveAnchorLivingUIC$createLive$1$1", mo125469f = "FinderLiveAnchorLivingUIC.kt", mo125470l = {1525}, mo125471m = "invokeSuspend")
/* renamed from: fl1.j */
public final class C59196j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f169316d;

    /* renamed from: e */
    public final /* synthetic */ C59161f f169317e;

    /* renamed from: f */
    public final /* synthetic */ boolean f169318f;

    /* renamed from: g */
    public final /* synthetic */ int f169319g;

    /* renamed from: h */
    public final /* synthetic */ boolean f169320h;

    /* renamed from: i */
    public final /* synthetic */ String f169321i;

    /* renamed from: j */
    public final /* synthetic */ C49291ej0 f169322j;

    /* renamed from: n */
    public final /* synthetic */ int f169323n;

    /* renamed from: o */
    public final /* synthetic */ String f169324o;

    /* renamed from: fl1.j$a */
    public static final class C59197a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C59161f f169325d;

        /* renamed from: e */
        public final /* synthetic */ boolean f169326e;

        /* renamed from: f */
        public final /* synthetic */ int f169327f;

        /* renamed from: g */
        public final /* synthetic */ boolean f169328g;

        /* renamed from: h */
        public final /* synthetic */ String f169329h;

        /* renamed from: i */
        public final /* synthetic */ C49291ej0 f169330i;

        /* renamed from: j */
        public final /* synthetic */ int f169331j;

        /* renamed from: n */
        public final /* synthetic */ String f169332n;

        public C59197a(C59161f fVar, boolean z, int i, boolean z2, String str, C49291ej0 ej02, int i2, String str2) {
            this.f169325d = fVar;
            this.f169326e = z;
            this.f169327f = i;
            this.f169328g = z2;
            this.f169329h = str;
            this.f169330i = ej02;
            this.f169331j = i2;
            this.f169332n = str2;
        }

        public Object emit(Object obj, C15601d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            String str = this.f169325d.f169228i;
            Log.m105924i(str, "isReadyPluginCountDownOk collect: " + booleanValue);
            if (booleanValue) {
                C61926c.m72668M(new C59193i(this.f169325d, this.f169326e, this.f169327f, this.f169328g, this.f169329h, this.f169330i, this.f169331j, this.f169332n));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59196j(C59161f fVar, boolean z, int i, boolean z2, String str, C49291ej0 ej02, int i2, String str2, C15601d<? super C59196j> dVar) {
        super(2, dVar);
        this.f169317e = fVar;
        this.f169318f = z;
        this.f169319g = i;
        this.f169320h = z2;
        this.f169321i = str;
        this.f169322j = ej02;
        this.f169323n = i2;
        this.f169324o = str2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59196j(this.f169317e, this.f169318f, this.f169319g, this.f169320h, this.f169321i, this.f169322j, this.f169323n, this.f169324o, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        ((C59196j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        return C15911a.COROUTINE_SUSPENDED;
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f169316d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i(this.f169317e.f169228i, "isReadyPluginCountDownOk startCollect");
            C58087u0<Boolean> u0Var = ((C54991o) this.f169317e.mo83051g(C54991o.class)).f154221K3;
            C59197a aVar2 = new C59197a(this.f169317e, this.f169318f, this.f169319g, this.f169320h, this.f169321i, this.f169322j, this.f169323n, this.f169324o);
            this.f169316d = 1;
            if (((C58052j1) u0Var).mo31880a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        throw new C13600d();
    }
}
