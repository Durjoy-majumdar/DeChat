package ym3;

import a11.C39479c;
import a14.C0000n0;
import a14.C53934p0;
import android.os.Bundle;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import c14.C54624g;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.statecenter.IStateActionResult;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C58017a1;
import d14.C58085t0;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import p278yh.C79115l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C64958n;
import tm3.C78062l;
import tm3.C78064o;
import tm3.C78069w;
import wx3.C15601d;
import xx3.C15911a;
import yb2.C15946a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: ym3.a */
public final class C66670a extends C15946a {

    /* renamed from: d */
    public final C13601g f191692d = C36568h.m40985a(C66675d.f191705d);

    /* renamed from: e */
    public ArrayList<C99664b> f191693e = new ArrayList<>();

    /* renamed from: f */
    public final C13601g f191694f = C36568h.m40985a(new C66678g(this));

    /* renamed from: g */
    public final C13601g f191695g = C36568h.m40985a(new C66674c(this));

    /* renamed from: h */
    public final C13601g f191696h = C36568h.m40985a(new C66673b(this));

    /* renamed from: i */
    public final C13601g f191697i = C36568h.m40985a(new C66677f(this));

    /* renamed from: ym3.a$a */
    public final class C66671a implements C61173o {

        /* renamed from: d */
        public final C58085t0<C10656l> f191698d;

        /* renamed from: e */
        public final /* synthetic */ C66670a f191699e;

        @C91590f(mo125468c = "com.tencent.mm.ui.mvvm.uic.chatroommember.SelectContactChatRoomMemberSearchUIC$FTSResultListener$onFTSSearchEnd$2$1", mo125469f = "SelectContactChatRoomMemberSearchUIC.kt", mo125470l = {167}, mo125471m = "invokeSuspend")
        /* renamed from: ym3.a$a$a */
        public static final class C66672a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f191700d;

            /* renamed from: e */
            public final /* synthetic */ C66671a f191701e;

            /* renamed from: f */
            public final /* synthetic */ C10656l f191702f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66672a(C66671a aVar, C10656l lVar, C15601d<? super C66672a> dVar) {
                super(2, dVar);
                this.f191701e = aVar;
                this.f191702f = lVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C66672a(this.f191701e, this.f191702f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C66672a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f191700d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C58085t0<C10656l> t0Var = this.f191701e.f191698d;
                    C10656l lVar = this.f191702f;
                    this.f191700d = 1;
                    if (t0Var.emit(lVar, this) == aVar) {
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

        public C66671a(C66670a aVar, C78064o oVar, C58085t0 t0Var, int i, boolean z, int i2, C8480h hVar) {
            C87412m.m108594g(oVar, "request");
            C87412m.m108594g(t0Var, "searchFlow");
            this.f191699e = aVar;
            this.f191698d = t0Var;
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            LifecycleScope c3;
            if (lVar != null) {
                C66670a aVar = this.f191699e;
                Log.m105924i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "onFTSSearchEnd " + lVar.f32073b.hashCode());
                boolean z = false;
                Iterator<T> it = aVar.f191693e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C87412m.m108589b((C99664b) it.next(), lVar.f32073b)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if ((z ? lVar : null) != null) {
                    C66670a aVar2 = this.f191699e;
                    if (lVar.f32074c == 0 && (c3 = aVar2.mo14597c3()) != null) {
                        LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C66672a(this, lVar, (C15601d<? super C66672a>) null), 1, (Object) null);
                    }
                }
            }
        }
    }

    /* renamed from: ym3.a$b */
    public static final class C66673b extends C87413o implements C32224a<C44661m1> {

        /* renamed from: d */
        public final /* synthetic */ C66670a f191703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66673b(C66670a aVar) {
            super(0);
            this.f191703d = aVar;
        }

        public Object invoke() {
            return ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo((String) ((C36570n) this.f191703d.f191695g).getValue());
        }
    }

    /* renamed from: ym3.a$c */
    public static final class C66674c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C66670a f191704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66674c(C66670a aVar) {
            super(0);
            this.f191704d = aVar;
        }

        public Object invoke() {
            String stringExtra = this.f191704d.getIntent().getStringExtra("chatroomName");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: ym3.a$d */
    public static final class C66675d extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C66675d f191705d = new C66675d();

        public C66675d() {
            super(0);
        }

        public Object invoke() {
            return new MMHandler(Looper.getMainLooper());
        }
    }

    /* renamed from: ym3.a$e */
    public static final class C66676e extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66670a f191706d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66676e(C66670a aVar) {
            super(1);
            this.f191706d = aVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C64958n nVar = (C64958n) wVar.checkAction(C64958n.class);
            if (nVar != null) {
                C66670a aVar = this.f191706d;
                if (!C112551y.m153811k(nVar.f187041b)) {
                    IStateActionResult result = nVar.getResult();
                    if (result != null && (result instanceof C78064o)) {
                        C78064o oVar = (C78064o) result;
                        aVar.getClass();
                        Class cls = C99260q.class;
                        Log.m105924i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "startSearch " + oVar.f228810b);
                        Iterator<C99664b> it = aVar.f191693e.iterator();
                        while (it.hasNext()) {
                            ((C99260q) C86312j.m106911c(cls)).mo128757ki(it.next());
                        }
                        aVar.f191693e.clear();
                        HashMap hashMap = new HashMap();
                        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
                        C76728k kVar = new C76728k();
                        kVar.f224469d = (String) ((C36570n) aVar.f191695g).getValue();
                        kVar.f224468c = oVar.f228810b;
                        kVar.f224467b = 12;
                        kVar.f224479n = (MMHandler) ((C36570n) aVar.f191692d).getValue();
                        C66671a aVar2 = r6;
                        C76728k kVar2 = kVar;
                        C66671a aVar3 = new C66671a(aVar, oVar, b, 0, false, 12, (C8480h) null);
                        kVar2.f224478m = aVar2;
                        kVar2.f224475j.addAll(wVar.f228827o);
                        kVar2.f224476k.addAll((List) ((C36570n) aVar.f191697i).getValue());
                        kVar2.f224481p = true;
                        C99664b Xn0 = ((C99260q) C86312j.m106911c(cls)).Xn0(2, kVar2);
                        Log.m105924i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "startSearch " + Xn0.hashCode());
                        aVar.f191693e.add(Xn0);
                        LifecycleScope c3 = aVar.mo14597c3();
                        if (c3 != null) {
                            LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C66679b(b, hashMap, aVar, oVar, (C15601d<? super C66679b>) null), 1, (Object) null);
                        }
                    }
                    C66670a.m78662g3(aVar).mo109049g().setVisibility(8);
                    C66670a.m78662g3(aVar).mo109047e().setVisibility(0);
                } else {
                    C66670a.m78662g3(aVar).mo109049g().setVisibility(0);
                    C66670a.m78662g3(aVar).mo109047e().setVisibility(8);
                    aVar.mo90720i3();
                    nVar.f187042c.invoke();
                }
            }
            C78062l lVar = (C78062l) wVar.checkAction(C78062l.class);
            if (lVar != null) {
                C66670a aVar4 = this.f191706d;
                if (!C112551y.m153811k(lVar.f228805b)) {
                    C66670a.m78662g3(aVar4).mo109049g().setVisibility(8);
                    C66670a.m78662g3(aVar4).mo109047e().setVisibility(0);
                } else {
                    C66670a.m78662g3(aVar4).mo109049g().setVisibility(0);
                    C66670a.m78662g3(aVar4).mo109047e().setVisibility(8);
                    aVar4.mo90720i3();
                    lVar.f228806c.invoke();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ym3.a$f */
    public static final class C66677f extends C87413o implements C32224a<List<? extends String>> {

        /* renamed from: d */
        public final /* synthetic */ C66670a f191707d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66677f(C66670a aVar) {
            super(0);
            this.f191707d = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r9 = this;
                ym3.a r0 = r9.f191707d
                android.content.Intent r0 = r0.getIntent()
                java.lang.String r1 = "chatroommemberlist"
                java.lang.String r0 = r0.getStringExtra(r1)
                r1 = 0
                if (r0 == 0) goto L_0x002b
                boolean r2 = z04.C112551y.m153811k(r0)
                r2 = r2 ^ 1
                if (r2 == 0) goto L_0x0019
                r3 = r0
                goto L_0x001a
            L_0x0019:
                r3 = r1
            L_0x001a:
                if (r3 == 0) goto L_0x002b
                java.lang.String r0 = ","
                java.lang.String[] r4 = new java.lang.String[]{r0}
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                java.util.List r0 = z04.C112550d0.m153785U(r3, r4, r5, r6, r7, r8)
                goto L_0x002d
            L_0x002b:
                sx3.f0 r0 = sx3.C64186f0.f181907d
            L_0x002d:
                java.lang.Class<m02.b> r2 = m02.C46940b.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                m02.b r2 = (m02.C46940b) r2
                if (r2 == 0) goto L_0x003c
                r1 = 2
                java.util.List r1 = r2.Vg0(r0, r1)
            L_0x003c:
                if (r1 != 0) goto L_0x003f
                goto L_0x0040
            L_0x003f:
                r0 = r1
            L_0x0040:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ym3.C66670a.C66677f.invoke():java.lang.Object");
        }
    }

    /* renamed from: ym3.a$g */
    public static final class C66678g extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C66670a f191708d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66678g(C66670a aVar) {
            super(0);
            this.f191708d = aVar;
        }

        public Object invoke() {
            return new C79115l(this.f191708d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66670a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public static final C79115l m78662g3(C66670a aVar) {
        return (C79115l) ((C36570n) aVar.f191694f).getValue();
    }

    /* renamed from: i3 */
    public final void mo90720i3() {
        Log.m105924i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "stopSearch");
        for (C99664b ki : this.f191693e) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(ki);
        }
        this.f191693e.clear();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.observe((C0125s) getActivity(), new C66676e(this));
        }
    }

    public void onDestroy() {
        for (C99664b ki : this.f191693e) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(ki);
        }
        this.f191693e.clear();
    }
}
