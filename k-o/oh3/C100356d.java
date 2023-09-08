package oh3;

import a14.C0000n0;
import a14.C53934p0;
import android.content.Context;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import m03.C99783d;
import p175j0.C24725u1;
import rx3.C13598b0;
import te3.C101804kv2;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: oh3.d */
public final class C100356d implements C96875r0.C96876a, C24725u1 {

    /* renamed from: p */
    public static final List<C99783d> f293942p = Collections.synchronizedList(new LinkedList());

    /* renamed from: d */
    public final Context f293943d;

    /* renamed from: e */
    public final String f293944e;

    /* renamed from: f */
    public final int f293945f;

    /* renamed from: g */
    public final C101804kv2 f293946g;

    /* renamed from: h */
    public final int f293947h;

    /* renamed from: i */
    public final LifecycleScope f293948i;

    /* renamed from: j */
    public C99783d f293949j;

    /* renamed from: n */
    public boolean f293950n;

    /* renamed from: o */
    public String f293951o;

    @C91590f(mo125468c = "com.tencent.mm.sns_compose.widget.PlayerState$onForgotten$1", mo125469f = "PlayerVideo.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: oh3.d$a */
    public static final class C100357a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C100356d f293952d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100357a(C100356d dVar, C15601d<? super C100357a> dVar2) {
            super(2, dVar2);
            this.f293952d = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C100357a(this.f293952d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C100357a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C99783d dVar = this.f293952d.f293949j;
            if (dVar != null) {
                if (dVar != null) {
                    dVar.setVideoCallback((C96875r0.C96876a) null);
                }
                C99783d dVar2 = this.f293952d.f293949j;
                if (dVar2 != null) {
                    dVar2.stop();
                }
                List<C99783d> list = C100356d.f293942p;
                C99783d dVar3 = this.f293952d.f293949j;
                C87412m.m108591d(dVar3);
                list.add(dVar3);
                Log.m105924i("MiscroMsg.PlayerState", "onForgotten recycler :" + list.size() + ' ');
            }
            return C13598b0.f38549a;
        }
    }

    public C100356d(Context context, String str, int i, C101804kv2 kv22, int i2, LifecycleScope lifecycleScope) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "snsId");
        C87412m.m108594g(kv22, "media");
        C87412m.m108594g(lifecycleScope, "scope");
        this.f293943d = context;
        this.f293944e = str;
        this.f293945f = i;
        this.f293946g = kv22;
        this.f293947h = i2;
        this.f293948i = lifecycleScope;
        Log.m105926v("MiscroMsg.PlayerState", "PlayerState  snsId:" + str + " playerRecycler:" + f293942p.size());
    }

    /* renamed from: M0 */
    public int mo76207M0(int i, int i2) {
        return 0;
    }

    /* renamed from: b */
    public void mo51625b() {
        mo51627d();
    }

    /* renamed from: c */
    public void mo51626c() {
        Log.m105924i("MiscroMsg.PlayerState", "onRemembered snsId:" + this.f293944e);
        C87412m.m108594g(this.f293946g, "media");
        this.f293951o = null;
    }

    /* renamed from: d */
    public void mo51627d() {
        LifecycleScope.launchDefault$default(this.f293948i, (C53934p0) null, new C100357a(this, (C15601d<? super C100357a>) null), 1, (Object) null);
    }

    public void onCompletion() {
    }

    public void onError(int i, int i2) {
    }

    public void onPrepared() {
        C99783d dVar;
        Log.m105924i("MiscroMsg.PlayerState", "onPrepared snsId:" + this.f293944e + " isPlay:" + this.f293950n);
        if (this.f293950n && (dVar = this.f293949j) != null) {
            dVar.start();
        }
    }

    /* renamed from: p3 */
    public void mo76226p3(int i, int i2) {
    }
}
