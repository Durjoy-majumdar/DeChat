package wg1;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import bl3.C39818r;
import cj1.C54754f;
import cj1.C54768h6;
import cj1.C54795n5;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGameLivePostUI;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import d60.C58124b;
import dj1.C45395w;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import j50.C60735a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import nk1.C11207i;
import o40.C61926c;
import ok1.C62042e;
import q40.C12040d;
import qj1.C62660c;
import qj1.C62987t2;
import qk1.C63213g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49325es0;
import te3.C49760hw0;
import te3.C51922x41;
import wg1.C53168x;
import wx3.C15601d;
import wx3.C66212f;
import xk1.C66355w;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

/* renamed from: wg1.a0 */
public final class C65954a0 implements C66089v {

    /* renamed from: d */
    public final Context f189620d;

    /* renamed from: e */
    public final C45795b f189621e;

    /* renamed from: f */
    public final C58124b f189622f;

    /* renamed from: g */
    public final C62660c f189623g;

    /* renamed from: h */
    public C66096w f189624h;

    /* renamed from: i */
    public C63213g f189625i;

    /* renamed from: j */
    public Integer f189626j;

    /* renamed from: n */
    public C53973z1 f189627n;

    /* renamed from: o */
    public final int f189628o = 1000;

    /* renamed from: p */
    public final int f189629p = 1001;

    /* renamed from: q */
    public long f189630q;

    /* renamed from: r */
    public final C13601g f189631r = C36568h.m40985a(new C65968m(this));

    /* renamed from: wg1.a0$a */
    public static final class C65955a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C65954a0 f189632d;

        public C65955a(C65954a0 a0Var) {
            this.f189632d = a0Var;
        }

        public final void run() {
            Intent intent;
            Context context = this.f189632d.f189620d;
            MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
            int i = 0;
            if (!(mMActivity == null || (intent = mMActivity.getIntent()) == null)) {
                i = intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0);
            }
            if (i != 3) {
                C32444a aVar = C32444a.f86121a;
                if (!((Boolean) C32444a.f86160j2.mo60266n()).booleanValue()) {
                    return;
                }
            }
            C58124b.C7172a.m7372a(this.f189632d.f189622f, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SHOW, (Bundle) null, 2, (Object) null);
        }
    }

    /* renamed from: wg1.a0$b */
    public static final class C65956b implements C45395w.C45396a {

        /* renamed from: a */
        public final /* synthetic */ C65954a0 f189633a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Integer, C13598b0> f189634b;

        /* renamed from: wg1.a0$b$a */
        public static final class C65957a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f189635d;

            /* renamed from: e */
            public final /* synthetic */ int f189636e;

            /* renamed from: f */
            public final /* synthetic */ C65954a0 f189637f;

            /* renamed from: g */
            public final /* synthetic */ C49760hw0 f189638g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<Integer, C13598b0> f189639h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65957a(int i, int i2, C65954a0 a0Var, C49760hw0 hw02, C32226l<? super Integer, C13598b0> lVar) {
                super(0);
                this.f189635d = i;
                this.f189636e = i2;
                this.f189637f = a0Var;
                this.f189638g = hw02;
                this.f189639h = lVar;
            }

            public Object invoke() {
                if (this.f189635d == 0 && this.f189636e == 0) {
                    ((C54991o) this.f189637f.f189621e.mo71262a(C54991o.class)).f154232N2.mo75654k(this.f189638g);
                    C32226l<Integer, C13598b0> lVar = this.f189639h;
                    if (lVar != null) {
                        LinkedList<C51922x41> linkedList = this.f189638g.f134910d;
                        lVar.invoke(Integer.valueOf(linkedList != null ? linkedList.size() : 0));
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C65956b(C65954a0 a0Var, C32226l<? super Integer, C13598b0> lVar) {
            this.f189633a = a0Var;
            this.f189634b = lVar;
        }

        /* renamed from: a */
        public void mo70900a(int i, int i2, String str, C49760hw0 hw02) {
            C87412m.m108594g(hw02, "resp");
            C61926c.m72668M(new C65957a(i, i2, this.f189633a, hw02, this.f189634b));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicPresenter$onBgmSwitch$1", mo125469f = "FinderLiveAnchorMusicPresenter.kt", mo125470l = {298}, mo125471m = "invokeSuspend")
    /* renamed from: wg1.a0$c */
    public static final class C65958c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f189640d;

        /* renamed from: e */
        public final /* synthetic */ C65954a0 f189641e;

        /* renamed from: f */
        public final /* synthetic */ C54768h6 f189642f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65958c(C65954a0 a0Var, C54768h6 h6Var, C15601d<? super C65958c> dVar) {
            super(2, dVar);
            this.f189641e = a0Var;
            this.f189642f = h6Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65958c(this.f189641e, this.f189642f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65958c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f189640d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C65954a0 a0Var = this.f189641e;
                Integer num = new Integer(this.f189642f.f153498a.f144442d);
                this.f189640d = 1;
                if (C65954a0.m77683j0(a0Var, 3, num, 0, this, 4, (Object) null) == aVar) {
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

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicPresenter$pauseMusic$1", mo125469f = "FinderLiveAnchorMusicPresenter.kt", mo125470l = {272}, mo125471m = "invokeSuspend")
    /* renamed from: wg1.a0$d */
    public static final class C65959d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f189643d;

        /* renamed from: e */
        public final /* synthetic */ C65954a0 f189644e;

        /* renamed from: f */
        public final /* synthetic */ C54768h6 f189645f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65959d(C65954a0 a0Var, C54768h6 h6Var, C15601d<? super C65959d> dVar) {
            super(2, dVar);
            this.f189644e = a0Var;
            this.f189645f = h6Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65959d(this.f189644e, this.f189645f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65959d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f189643d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C65954a0 a0Var = this.f189644e;
                Integer num = new Integer(this.f189645f.f153498a.f144442d);
                this.f189643d = 1;
                if (C65954a0.m77683j0(a0Var, 2, num, 0, this, 4, (Object) null) == aVar) {
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

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicPresenter$pauseMusic$2", mo125469f = "FinderLiveAnchorMusicPresenter.kt", mo125470l = {278}, mo125471m = "invokeSuspend")
    /* renamed from: wg1.a0$e */
    public static final class C65960e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f189646d;

        /* renamed from: e */
        public final /* synthetic */ C65954a0 f189647e;

        /* renamed from: f */
        public final /* synthetic */ C54768h6 f189648f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65960e(C65954a0 a0Var, C54768h6 h6Var, C15601d<? super C65960e> dVar) {
            super(2, dVar);
            this.f189647e = a0Var;
            this.f189648f = h6Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65960e(this.f189647e, this.f189648f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65960e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f189646d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C65954a0 a0Var = this.f189647e;
                Integer num = new Integer(this.f189648f.f153498a.f144442d);
                this.f189646d = 1;
                if (C65954a0.m77683j0(a0Var, 2, num, 0, this, 4, (Object) null) == aVar) {
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

    /* renamed from: wg1.a0$f */
    public static final class C65961f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65954a0 f189649d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65961f(C65954a0 a0Var) {
            super(0);
            this.f189649d = a0Var;
        }

        public Object invoke() {
            C63213g gVar = this.f189649d.f189625i;
            if (gVar != null) {
                C63213g.m74556F4(gVar, false, 1, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.a0$g */
    public static final class C65962g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65954a0 f189650d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65962g(C65954a0 a0Var) {
            super(0);
            this.f189650d = a0Var;
        }

        public Object invoke() {
            C63213g gVar = this.f189650d.f189625i;
            if (gVar != null) {
                C63213g.m74556F4(gVar, false, 1, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.a0$h */
    public static final class C65963h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65954a0 f189651d;

        /* renamed from: e */
        public final /* synthetic */ boolean f189652e;

        /* renamed from: f */
        public final /* synthetic */ C54768h6 f189653f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65963h(C65954a0 a0Var, boolean z, C54768h6 h6Var) {
            super(0);
            this.f189651d = a0Var;
            this.f189652e = z;
            this.f189653f = h6Var;
        }

        public Object invoke() {
            C65954a0 a0Var = this.f189651d;
            C11207i.m11072h(a0Var.f189623g, (C66212f) null, (C53934p0) null, new C65991e0(a0Var, this.f189652e, this.f189653f, (C15601d<? super C65991e0>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicPresenter$playMusic$2", mo125469f = "FinderLiveAnchorMusicPresenter.kt", mo125470l = {241}, mo125471m = "invokeSuspend")
    /* renamed from: wg1.a0$i */
    public static final class C65964i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f189654d;

        /* renamed from: e */
        public final /* synthetic */ C65954a0 f189655e;

        /* renamed from: f */
        public final /* synthetic */ boolean f189656f;

        /* renamed from: g */
        public final /* synthetic */ C54768h6 f189657g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65964i(C65954a0 a0Var, boolean z, C54768h6 h6Var, C15601d<? super C65964i> dVar) {
            super(2, dVar);
            this.f189655e = a0Var;
            this.f189656f = z;
            this.f189657g = h6Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65964i(this.f189655e, this.f189656f, this.f189657g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65964i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f189654d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C65954a0 a0Var = this.f189655e;
                int i2 = this.f189656f ? 3 : 1;
                Integer num = new Integer(this.f189657g.f153498a.f144442d);
                this.f189654d = 1;
                if (C65954a0.m77683j0(a0Var, i2, num, 0, this, 4, (Object) null) == aVar) {
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

    /* renamed from: wg1.a0$j */
    public static final class C65965j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65954a0 f189658d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65965j(C65954a0 a0Var) {
            super(0);
            this.f189658d = a0Var;
        }

        public Object invoke() {
            C63213g gVar = this.f189658d.f189625i;
            if (gVar != null) {
                C63213g.m74556F4(gVar, false, 1, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicPresenter$resumeMusic$1", mo125469f = "FinderLiveAnchorMusicPresenter.kt", mo125470l = {255}, mo125471m = "invokeSuspend")
    /* renamed from: wg1.a0$k */
    public static final class C65966k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f189659d;

        /* renamed from: e */
        public final /* synthetic */ C65954a0 f189660e;

        /* renamed from: f */
        public final /* synthetic */ C54768h6 f189661f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65966k(C65954a0 a0Var, C54768h6 h6Var, C15601d<? super C65966k> dVar) {
            super(2, dVar);
            this.f189660e = a0Var;
            this.f189661f = h6Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65966k(this.f189660e, this.f189661f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65966k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f189659d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C65954a0 a0Var = this.f189660e;
                Integer num = new Integer(this.f189661f.f153498a.f144442d);
                this.f189659d = 1;
                if (C65954a0.m77683j0(a0Var, 1, num, 0, this, 4, (Object) null) == aVar) {
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

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicPresenter$resumeMusic$2", mo125469f = "FinderLiveAnchorMusicPresenter.kt", mo125470l = {261}, mo125471m = "invokeSuspend")
    /* renamed from: wg1.a0$l */
    public static final class C65967l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f189662d;

        /* renamed from: e */
        public final /* synthetic */ C65954a0 f189663e;

        /* renamed from: f */
        public final /* synthetic */ C54768h6 f189664f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65967l(C65954a0 a0Var, C54768h6 h6Var, C15601d<? super C65967l> dVar) {
            super(2, dVar);
            this.f189663e = a0Var;
            this.f189664f = h6Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65967l(this.f189663e, this.f189664f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65967l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f189662d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C65954a0 a0Var = this.f189663e;
                Integer num = new Integer(this.f189664f.f153498a.f144442d);
                this.f189662d = 1;
                if (C65954a0.m77683j0(a0Var, 1, num, 0, this, 4, (Object) null) == aVar) {
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

    /* renamed from: wg1.a0$m */
    public static final class C65968m extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public final /* synthetic */ C65954a0 f189665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65968m(C65954a0 a0Var) {
            super(0);
            this.f189665d = a0Var;
        }

        public Object invoke() {
            MMHandler mMHandler = new MMHandler("FinderLiveAnchorMusicPresenter_seiDataHandler", (MMHandler.Callback) new C65998f0(this.f189665d));
            mMHandler.setLogging(false);
            return mMHandler;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicPresenter$setMusicVolume$1", mo125469f = "FinderLiveAnchorMusicPresenter.kt", mo125470l = {325}, mo125471m = "invokeSuspend")
    /* renamed from: wg1.a0$n */
    public static final class C65969n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f189666d;

        /* renamed from: e */
        public final /* synthetic */ C65954a0 f189667e;

        /* renamed from: f */
        public final /* synthetic */ int f189668f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicPresenter$setMusicVolume$1$1", mo125469f = "FinderLiveAnchorMusicPresenter.kt", mo125470l = {327}, mo125471m = "invokeSuspend")
        /* renamed from: wg1.a0$n$a */
        public static final class C65970a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f189669d;

            /* renamed from: e */
            public final /* synthetic */ C65954a0 f189670e;

            /* renamed from: f */
            public final /* synthetic */ int f189671f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65970a(C65954a0 a0Var, int i, C15601d<? super C65970a> dVar) {
                super(2, dVar);
                this.f189670e = a0Var;
                this.f189671f = i;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C65970a(this.f189670e, this.f189671f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C65970a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f189669d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C65954a0 a0Var = this.f189670e;
                    Integer num = a0Var.f189626j;
                    int i2 = this.f189671f;
                    this.f189669d = 1;
                    if (a0Var.mo89998f0(4, num, i2, this) == aVar) {
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
        public C65969n(C65954a0 a0Var, int i, C15601d<? super C65969n> dVar) {
            super(2, dVar);
            this.f189667e = a0Var;
            this.f189668f = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65969n(this.f189667e, this.f189668f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65969n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f189666d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f189666d = 1;
                if (C53965x0.m60607b(1000, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C65954a0 a0Var = this.f189667e;
            C11207i.m11072h(a0Var.f189623g, (C66212f) null, (C53934p0) null, new C65970a(a0Var, this.f189668f, (C15601d<? super C65970a>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicPresenter$setMusicVolume$2", mo125469f = "FinderLiveAnchorMusicPresenter.kt", mo125470l = {335}, mo125471m = "invokeSuspend")
    /* renamed from: wg1.a0$o */
    public static final class C65971o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f189672d;

        /* renamed from: e */
        public final /* synthetic */ C65954a0 f189673e;

        /* renamed from: f */
        public final /* synthetic */ int f189674f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicPresenter$setMusicVolume$2$1", mo125469f = "FinderLiveAnchorMusicPresenter.kt", mo125470l = {337}, mo125471m = "invokeSuspend")
        /* renamed from: wg1.a0$o$a */
        public static final class C65972a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f189675d;

            /* renamed from: e */
            public final /* synthetic */ C65954a0 f189676e;

            /* renamed from: f */
            public final /* synthetic */ int f189677f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65972a(C65954a0 a0Var, int i, C15601d<? super C65972a> dVar) {
                super(2, dVar);
                this.f189676e = a0Var;
                this.f189677f = i;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C65972a(this.f189676e, this.f189677f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C65972a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f189675d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C65954a0 a0Var = this.f189676e;
                    Integer num = a0Var.f189626j;
                    int i2 = this.f189677f;
                    this.f189675d = 1;
                    if (a0Var.mo89998f0(4, num, i2, this) == aVar) {
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
        public C65971o(C65954a0 a0Var, int i, C15601d<? super C65971o> dVar) {
            super(2, dVar);
            this.f189673e = a0Var;
            this.f189674f = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65971o(this.f189673e, this.f189674f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65971o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f189672d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f189672d = 1;
                if (C53965x0.m60607b(1000, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56032b F0 = this.f189673e.f189623g.mo14482F0();
            if (F0 != null) {
                C11207i.m11070f(F0, (C66212f) null, (C53934p0) null, new C65972a(this.f189673e, this.f189674f, (C15601d<? super C65972a>) null), 3, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicPresenter$syncBGMAction$$inlined$fail$default$1", mo125469f = "FinderLiveAnchorMusicPresenter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: wg1.a0$p */
    public static final class C65973p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f189678d;

        /* renamed from: e */
        public final /* synthetic */ int f189679e;

        /* renamed from: f */
        public final /* synthetic */ Integer f189680f;

        /* renamed from: g */
        public final /* synthetic */ int f189681g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65973p(C0287e eVar, C15601d dVar, int i, Integer num, int i2) {
            super(2, dVar);
            this.f189678d = eVar;
            this.f189679e = i;
            this.f189680f = num;
            this.f189681g = i2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65973p(this.f189678d, dVar, this.f189679e, this.f189680f, this.f189681g);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65973p) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            StringBuilder sb = new StringBuilder();
            sb.append("failed syncBGMAction action = ");
            sb.append(this.f189679e);
            sb.append(", curSongId:");
            sb.append(this.f189680f);
            sb.append("},errCode:");
            C12040d dVar = ((C0280a) ((C0281b) this.f189678d).f843b).f841a;
            sb.append(dVar != null ? new Integer(dVar.f35058f) : null);
            sb.append(", cur_volume:");
            sb.append(this.f189681g);
            Log.m105924i("FinderLiveAnchorMusicPresenter", sb.toString());
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicPresenter$syncBGMAction$$inlined$success$default$1", mo125469f = "FinderLiveAnchorMusicPresenter.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: wg1.a0$q */
    public static final class C65974q extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f189682d;

        /* renamed from: e */
        public final /* synthetic */ int f189683e;

        /* renamed from: f */
        public final /* synthetic */ Integer f189684f;

        /* renamed from: g */
        public final /* synthetic */ C65954a0 f189685g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65974q(C0287e eVar, C15601d dVar, int i, Integer num, C65954a0 a0Var) {
            super(2, dVar);
            this.f189682d = eVar;
            this.f189683e = i;
            this.f189684f = num;
            this.f189685g = a0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65974q(this.f189682d, dVar, this.f189683e, this.f189684f, this.f189685g);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65974q) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            long j = ((C49325es0) ((C0288f) this.f189682d).f855b).f133099d;
            Log.m105924i("FinderLiveAnchorMusicPresenter", "sucess syncBGMAction action = " + this.f189683e + ", curSongId:" + this.f189684f + "}, cur_volume:" + ((C54991o) this.f189685g.f189621e.mo71262a(C54991o.class)).f154235O2 + ", timeStamp:" + j);
            this.f189685g.mo90004q().sendMessage(this.f189685g.mo90004q().obtainMessage(this.f189685g.f189629p, new Long(j)));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicPresenter", mo125469f = "FinderLiveAnchorMusicPresenter.kt", mo125470l = {369, 487, 494}, mo125471m = "syncBGMAction")
    /* renamed from: wg1.a0$r */
    public static final class C65975r extends C66704d {

        /* renamed from: d */
        public Object f189686d;

        /* renamed from: e */
        public Object f189687e;

        /* renamed from: f */
        public int f189688f;

        /* renamed from: g */
        public int f189689g;

        /* renamed from: h */
        public /* synthetic */ Object f189690h;

        /* renamed from: i */
        public final /* synthetic */ C65954a0 f189691i;

        /* renamed from: j */
        public int f189692j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65975r(C65954a0 a0Var, C15601d<? super C65975r> dVar) {
            super(dVar);
            this.f189691i = a0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f189690h = obj;
            this.f189692j |= Integer.MIN_VALUE;
            return this.f189691i.mo89998f0(0, (Integer) null, 0, this);
        }
    }

    public C65954a0(Context context, C45795b bVar, C58124b bVar2, C62660c cVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(bVar2, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f189620d = context;
        this.f189621e = bVar;
        this.f189622f = bVar2;
        this.f189623g = cVar;
    }

    /* renamed from: j0 */
    public static Object m77683j0(C65954a0 a0Var, int i, Integer num, int i2, C15601d dVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = ((C54991o) a0Var.f189621e.mo71262a(C54991o.class)).f154235O2;
        }
        return a0Var.mo89998f0(i, num, i2, dVar);
    }

    /* renamed from: D0 */
    public void mo89989D0(C54768h6 h6Var) {
        C56032b F0;
        C87412m.m108594g(h6Var, "musicItem");
        this.f189626j = Integer.valueOf(h6Var.f153498a.f144442d);
        if ((C62042e.f176370a.mo87024M0(this.f189621e) || mo89991G()) && (F0 = this.f189623g.mo14482F0()) != null) {
            C11207i.m11070f(F0, (C66212f) null, (C53934p0) null, new C65958c(this, h6Var, (C15601d<? super C65958c>) null), 3, (Object) null);
        }
    }

    /* renamed from: E0 */
    public void mo89990E0(C54768h6 h6Var, int i) {
        C56032b F0;
        Class cls = C54991o.class;
        C87412m.m108594g(h6Var, "musicItem");
        this.f189626j = null;
        if (C62042e.f176370a.mo87024M0(this.f189621e)) {
            C11207i.m11072h(this.f189623g, (C66212f) null, (C53934p0) null, new C65959d(this, h6Var, (C15601d<? super C65959d>) null), 3, (Object) null);
        } else {
            C60735a c = FinderLiveService.f159376d.mo77627c();
            if (c != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("pauseBgMusic path:");
                TXAudioEffectManager.AudioMusicParam audioMusicParam = c.f172994F;
                sb.append(audioMusicParam != null ? audioMusicParam.path : null);
                sb.append(", publish:");
                TXAudioEffectManager.AudioMusicParam audioMusicParam2 = c.f172994F;
                sb.append(audioMusicParam2 != null ? Boolean.valueOf(audioMusicParam2.publish) : null);
                sb.append(", loopCount:");
                TXAudioEffectManager.AudioMusicParam audioMusicParam3 = c.f172994F;
                sb.append(audioMusicParam3 != null ? Integer.valueOf(audioMusicParam3.loopCount) : null);
                Log.m105924i("MicroMsg.LiveCore", sb.toString());
                TXAudioEffectManager.AudioMusicParam audioMusicParam4 = c.f172994F;
                if (audioMusicParam4 != null) {
                    c.mo85679W().getAudioEffectManager().pausePlayMusic(audioMusicParam4.f154608id);
                    c.f172995G = false;
                }
            }
            if (mo89991G() && (F0 = this.f189623g.mo14482F0()) != null) {
                C11207i.m11070f(F0, (C66212f) null, (C53934p0) null, new C65960e(this, h6Var, (C15601d<? super C65960e>) null), 3, (Object) null);
            }
        }
        ((C54991o) this.f189621e.mo71262a(cls)).f154232N2.mo75650g(h6Var, i);
        C66107x1.f190022a.mo90147a(((C54991o) this.f189621e.mo71262a(cls)).mo75999e4(), 9, ((C54991o) this.f189621e.mo71262a(cls)).f154232N2.mo75647d());
    }

    /* renamed from: G */
    public final boolean mo89991G() {
        Context context = this.f189620d;
        return (context instanceof FinderGameLivePostUI) && !((C66355w) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(C66355w.class)).mo90464m3();
    }

    /* renamed from: H0 */
    public void mo89992H0() {
        C66096w wVar = this.f189624h;
        C87412m.m108592e(wVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicViewCallback");
        WxRecyclerView wxRecyclerView = ((C66065o0) wVar).f189929F;
        if (wxRecyclerView != null) {
            wxRecyclerView.post(new C65955a(this));
        }
    }

    /* renamed from: N */
    public void mo89993N(C54768h6 h6Var, int i) {
        C56032b F0;
        C87412m.m108594g(h6Var, "musicItem");
        this.f189626j = Integer.valueOf(h6Var.f153498a.f144442d);
        if (C62042e.f176370a.mo87024M0(this.f189621e)) {
            C11207i.m11072h(this.f189623g, (C66212f) null, (C53934p0) null, new C65966k(this, h6Var, (C15601d<? super C65966k>) null), 3, (Object) null);
        } else {
            C60735a c = FinderLiveService.f159376d.mo77627c();
            if (c != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("resumeBgMusic path:");
                TXAudioEffectManager.AudioMusicParam audioMusicParam = c.f172994F;
                sb.append(audioMusicParam != null ? audioMusicParam.path : null);
                sb.append(", publish:");
                TXAudioEffectManager.AudioMusicParam audioMusicParam2 = c.f172994F;
                sb.append(audioMusicParam2 != null ? Boolean.valueOf(audioMusicParam2.publish) : null);
                sb.append(", loopCount:");
                TXAudioEffectManager.AudioMusicParam audioMusicParam3 = c.f172994F;
                sb.append(audioMusicParam3 != null ? Integer.valueOf(audioMusicParam3.loopCount) : null);
                Log.m105924i("MicroMsg.LiveCore", sb.toString());
                TXAudioEffectManager.AudioMusicParam audioMusicParam4 = c.f172994F;
                if (audioMusicParam4 != null) {
                    c.mo85679W().getAudioEffectManager().resumePlayMusic(audioMusicParam4.f154608id);
                    c.f172995G = true;
                }
            }
            if (mo89991G() && (F0 = this.f189623g.mo14482F0()) != null) {
                C11207i.m11070f(F0, (C66212f) null, (C53934p0) null, new C65967l(this, h6Var, (C15601d<? super C65967l>) null), 3, (Object) null);
            }
        }
        C54754f fVar = ((C54991o) this.f189621e.mo71262a(C54991o.class)).f154232N2;
        fVar.getClass();
        if (h6Var.f153499b != 1) {
            h6Var.f153499b = 1;
        }
        Log.m105924i("FinderLiveAnchorMusicData", "resumeMusicItem " + h6Var + " songId size:" + fVar.f153468e.size() + ", musicList id size:" + fVar.f153469f.size() + ", pos:" + i + ", curPlayPos:" + fVar.f153467d);
    }

    /* renamed from: O */
    public void mo89994O(C54768h6 h6Var, int i, boolean z) {
        C56032b F0;
        C87412m.m108594g(h6Var, "musicItem");
        Integer num = this.f189626j;
        boolean z2 = num == null || num.intValue() != h6Var.f153498a.f144442d;
        this.f189626j = Integer.valueOf(h6Var.f153498a.f144442d);
        Log.m105924i("FinderLiveAnchorMusicPresenter", "playMusic " + h6Var + ", forcePlay:" + z + ", stack:" + Util.getStack());
        if (C62042e.f176370a.mo87024M0(this.f189621e)) {
            FinderLiveService.f159376d.mo77600A(h6Var, i, z, new C65963h(this, z2, h6Var));
            return;
        }
        FinderLiveService.f159376d.mo77600A(h6Var, i, z, (C32224a<C13598b0>) null);
        if (mo89991G() && (F0 = this.f189623g.mo14482F0()) != null) {
            C11207i.m11070f(F0, (C66212f) null, (C53934p0) null, new C65964i(this, z2, h6Var, (C15601d<? super C65964i>) null), 3, (Object) null);
        }
    }

    /* renamed from: V */
    public void mo89995V(int i, boolean z) {
        if (!C62042e.f176370a.mo87024M0(this.f189621e) || !z) {
            if (mo89991G() && z) {
                C53973z1 z1Var = this.f189627n;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                this.f189627n = C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C65971o(this, i, (C15601d<? super C65971o>) null), 3, (Object) null);
            }
            C60735a c = FinderLiveService.f159376d.mo77627c();
            if (c != null) {
                Log.m105924i("MicroMsg.LiveCore", "setMusicVolume level:" + i);
                if (i < 0) {
                    i = 0;
                }
                if (i > 100) {
                    i = 100;
                }
                c.f173011T0 = i;
                c.mo85679W().getAudioEffectManager().setAllMusicVolume(c.f173011T0);
                return;
            }
            return;
        }
        C53973z1 z1Var2 = this.f189627n;
        if (z1Var2 != null) {
            C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
        }
        this.f189627n = C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C65969n(this, i, (C15601d<? super C65969n>) null), 3, (Object) null);
    }

    /* renamed from: Y */
    public void mo89996Y() {
        Class cls = C54991o.class;
        ArrayList<C54768h6> arrayList = ((C54991o) this.f189621e.mo71262a(cls)).f154232N2.f153469f;
        LinkedList<Integer> linkedList = ((C54991o) this.f189621e.mo71262a(cls)).f154232N2.f153468e;
        if (linkedList == null || linkedList.isEmpty()) {
            C66096w wVar = this.f189624h;
            if (wVar != null) {
                wVar.mo90099h(true);
                return;
            }
            return;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            C53168x.C53169a.m59582a(this, false, new C65981b0(this), 1, (Object) null);
            C66096w wVar2 = this.f189624h;
            if (wVar2 != null) {
                wVar2.mo90100l();
                return;
            }
            return;
        }
        C66096w wVar3 = this.f189624h;
        if (wVar3 != null) {
            wVar3.mo90098f(arrayList);
        }
        C63213g gVar = this.f189625i;
        if (gVar != null) {
            C63213g.m74556F4(gVar, false, 1, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0020, code lost:
        r1 = r1.f153498a;
     */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo89997d1(cj1.C54768h6 r22, int r23) {
        /*
            r21 = this;
            r7 = r21
            r8 = r22
            r0 = r23
            java.lang.Class<cl1.u> r9 = cl1.C55001u.class
            java.lang.Class<cl1.o> r10 = cl1.C54991o.class
            java.lang.String r1 = "musicItem"
            gy3.C87412m.m108594g(r8, r1)
            fj1.b r1 = r7.f189621e
            androidx.lifecycle.i0 r1 = r1.mo71262a(r10)
            cl1.o r1 = (cl1.C54991o) r1
            cj1.f r1 = r1.f154232N2
            cj1.h6 r1 = r1.mo75646c()
            r11 = 0
            if (r1 == 0) goto L_0x002c
            te3.x41 r1 = r1.f153498a
            if (r1 == 0) goto L_0x002c
            int r1 = r1.f144442d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12 = r1
            goto L_0x002d
        L_0x002c:
            r12 = r11
        L_0x002d:
            te3.x41 r1 = r8.f153498a
            int r13 = r1.f144442d
            r14 = 1
            if (r12 == 0) goto L_0x0094
            int r1 = r12.intValue()
            if (r13 != r1) goto L_0x0094
            fj1.b r1 = r7.f189621e
            androidx.lifecycle.i0 r1 = r1.mo71262a(r10)
            cl1.o r1 = (cl1.C54991o) r1
            cj1.f r1 = r1.f154232N2
            java.util.ArrayList<cj1.h6> r1 = r1.f153469f
            int r1 = r1.size()
            if (r1 <= r14) goto L_0x0089
            fj1.b r1 = r7.f189621e
            androidx.lifecycle.i0 r1 = r1.mo71262a(r10)
            cl1.o r1 = (cl1.C54991o) r1
            cj1.f r1 = r1.f154232N2
            fj1.b r2 = r7.f189621e
            androidx.lifecycle.i0 r2 = r2.mo71262a(r10)
            cl1.o r2 = (cl1.C54991o) r2
            cj1.f r2 = r2.f154232N2
            int r2 = r2.f153467d
            rx3.l r1 = r1.mo75645b(r8, r2)
            A r2 = r1.f38555d
            cj1.h6 r2 = (cj1.C54768h6) r2
            if (r2 == 0) goto L_0x007d
            B r1 = r1.f38556e
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r21
            wg1.C66089v.C66090a.m77877a(r1, r2, r3, r4, r5, r6)
            goto L_0x0094
        L_0x007d:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            j50.a r1 = r1.mo77627c()
            if (r1 == 0) goto L_0x0094
            r1.mo85701t0()
            goto L_0x0094
        L_0x0089:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            j50.a r1 = r1.mo77627c()
            if (r1 == 0) goto L_0x0094
            r1.mo85701t0()
        L_0x0094:
            fj1.b r1 = r7.f189621e
            androidx.lifecycle.i0 r1 = r1.mo71262a(r10)
            cl1.o r1 = (cl1.C54991o) r1
            cj1.f r1 = r1.f154232N2
            r1.getClass()
            java.util.ArrayList<cj1.h6> r2 = r1.f153469f     // Catch:{ Exception -> 0x0130 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ Exception -> 0x0130 }
            java.lang.String r3 = "musicList[index]"
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ Exception -> 0x0130 }
            cj1.h6 r2 = (cj1.C54768h6) r2     // Catch:{ Exception -> 0x0130 }
            java.util.LinkedList<java.lang.Integer> r3 = r1.f153468e     // Catch:{ Exception -> 0x0130 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ Exception -> 0x0130 }
            java.lang.String r4 = "songIdList[index]"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ Exception -> 0x0130 }
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ Exception -> 0x0130 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0130 }
            te3.x41 r4 = r8.f153498a     // Catch:{ Exception -> 0x0130 }
            int r4 = r4.f144442d     // Catch:{ Exception -> 0x0130 }
            te3.x41 r5 = r2.f153498a     // Catch:{ Exception -> 0x0130 }
            int r5 = r5.f144442d     // Catch:{ Exception -> 0x0130 }
            if (r4 != r5) goto L_0x00e3
            if (r4 != r3) goto L_0x00e3
            java.util.ArrayList<cj1.h6> r4 = r1.f153469f     // Catch:{ Exception -> 0x0130 }
            r4.remove(r0)     // Catch:{ Exception -> 0x0130 }
            java.util.LinkedList<java.lang.Integer> r4 = r1.f153468e     // Catch:{ Exception -> 0x0130 }
            r4.remove(r0)     // Catch:{ Exception -> 0x0130 }
            int r4 = r1.f153467d     // Catch:{ Exception -> 0x0130 }
            r5 = -1
            if (r4 <= r0) goto L_0x00df
            int r4 = r4 + r5
            r1.f153467d = r4     // Catch:{ Exception -> 0x0130 }
            goto L_0x00e3
        L_0x00df:
            if (r4 != r0) goto L_0x00e3
            r1.f153467d = r5     // Catch:{ Exception -> 0x0130 }
        L_0x00e3:
            java.lang.String r0 = "FinderLiveAnchorMusicData"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0130 }
            r4.<init>()     // Catch:{ Exception -> 0x0130 }
            java.lang.String r5 = "deleteMusicItem item:"
            r4.append(r5)     // Catch:{ Exception -> 0x0130 }
            r4.append(r8)     // Catch:{ Exception -> 0x0130 }
            java.lang.String r5 = " songId size:"
            r4.append(r5)     // Catch:{ Exception -> 0x0130 }
            java.util.LinkedList<java.lang.Integer> r5 = r1.f153468e     // Catch:{ Exception -> 0x0130 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x0130 }
            r4.append(r5)     // Catch:{ Exception -> 0x0130 }
            java.lang.String r5 = ", musicList id size:"
            r4.append(r5)     // Catch:{ Exception -> 0x0130 }
            java.util.ArrayList<cj1.h6> r5 = r1.f153469f     // Catch:{ Exception -> 0x0130 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x0130 }
            r4.append(r5)     // Catch:{ Exception -> 0x0130 }
            java.lang.String r5 = ", locMusicItem:"
            r4.append(r5)     // Catch:{ Exception -> 0x0130 }
            r4.append(r2)     // Catch:{ Exception -> 0x0130 }
            java.lang.String r2 = " locSongId:"
            r4.append(r2)     // Catch:{ Exception -> 0x0130 }
            r4.append(r3)     // Catch:{ Exception -> 0x0130 }
            java.lang.String r2 = ", curPlayPos:"
            r4.append(r2)     // Catch:{ Exception -> 0x0130 }
            int r1 = r1.f153467d     // Catch:{ Exception -> 0x0130 }
            r4.append(r1)     // Catch:{ Exception -> 0x0130 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0130 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x0130 }
            goto L_0x0138
        L_0x0130:
            r0 = move-exception
            er1.j4 r1 = er1.C58739j4.f168176a
            java.lang.String r2 = "FinderLiveAnchorMusicData deleteMusicItem"
            r1.mo83712h0(r0, r2)
        L_0x0138:
            fj1.b r0 = r7.f189621e
            androidx.lifecycle.i0 r0 = r0.mo71262a(r10)
            cl1.o r0 = (cl1.C54991o) r0
            cj1.f r0 = r0.f154232N2
            java.util.ArrayList<cj1.h6> r0 = r0.f153469f
            r1 = 0
            if (r0 == 0) goto L_0x0150
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r0 = 0
            goto L_0x0151
        L_0x0150:
            r0 = 1
        L_0x0151:
            if (r0 == 0) goto L_0x015b
            wg1.w r0 = r7.f189624h
            if (r0 == 0) goto L_0x0162
            r0.mo90099h(r1)
            goto L_0x0162
        L_0x015b:
            qk1.g r0 = r7.f189625i
            if (r0 == 0) goto L_0x0162
            qk1.C63213g.m74556F4(r0, r1, r14, r11)
        L_0x0162:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "deleteMusic bgMusicId:"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", songPlayId:"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderLiveAnchorMusicPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            fj1.b r0 = r7.f189621e
            androidx.lifecycle.i0 r0 = r0.mo71262a(r9)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            long r0 = r0.f182392d
            fj1.b r2 = r7.f189621e
            androidx.lifecycle.i0 r2 = r2.mo71262a(r9)
            cl1.u r2 = (cl1.C55001u) r2
            byte[] r2 = r2.f154417n
            zc1.b r3 = zc1.C66785b.f191882e
            java.lang.String r3 = r3.mo90662O5()
            fj1.b r4 = r7.f189621e
            androidx.lifecycle.i0 r4 = r4.mo71262a(r9)
            cl1.u r4 = (cl1.C55001u) r4
            long r4 = r4.f154416j
            fj1.b r6 = r7.f189621e
            androidx.lifecycle.i0 r6 = r6.mo71262a(r10)
            cl1.o r6 = (cl1.C54991o) r6
            cj1.f r6 = r6.f154232N2
            te3.zv0 r6 = r6.mo75648e()
            r19 = 3
            dj1.o0 r9 = new dj1.o0
            kk1.a r20 = new kk1.a
            r11 = r20
            r12 = r0
            r14 = r2
            r15 = r3
            r16 = r4
            r18 = r6
            r11.<init>(r12, r14, r15, r16, r18)
            r11 = r9
            r11.<init>(r12, r14, r15, r16, r18, r19, r20)
            r9.mo9225i()
            wg1.x1 r0 = wg1.C66107x1.f190022a
            fj1.b r1 = r7.f189621e
            androidx.lifecycle.i0 r1 = r1.mo71262a(r10)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75999e4()
            r2 = 4
            te3.x41 r3 = r8.f153498a
            int r3 = r3.f144442d
            r0.mo90147a(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C65954a0.mo89997d1(cj1.h6, int):void");
    }

    /* renamed from: e */
    public void mo73860e(boolean z, C32226l<? super Integer, C13598b0> lVar) {
        C54795n5 D0;
        Class cls = C55001u.class;
        C87412m.m108594g(lVar, "callback");
        LinkedList<Integer> f = ((C54991o) this.f189621e.mo71262a(C54991o.class)).f154232N2.mo75649f(z);
        Log.m105924i("FinderLiveAnchorMusicPresenter", "loadMoreData loadAll:" + z + " udpateMusicList:" + f);
        if (!(f == null || f.isEmpty())) {
            C62660c cVar = this.f189623g;
            if ((cVar != null ? cVar.mo14476D0() : null) != null) {
                C62660c cVar2 = this.f189623g;
                if (cVar2 != null && (D0 = cVar2.mo14476D0()) != null) {
                    D0.mo75735g(((C55001u) this.f189621e.mo71262a(cls)).f154420q.f182392d, ((C55001u) this.f189621e.mo71262a(cls)).f154417n, C66785b.f191882e.mo90662O5(), ((C55001u) this.f189621e.mo71262a(cls)).f154416j, 1, f, new C65956b(this, lVar));
                    return;
                }
                return;
            }
        }
        lVar.invoke(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo89998f0(int r20, java.lang.Integer r21, int r22, wx3.C15601d<? super bi1.C0287e<? extends te3.C49325es0, bi1.C0280a>> r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            java.lang.Class<cl1.u> r5 = cl1.C55001u.class
            boolean r6 = r4 instanceof wg1.C65954a0.C65975r
            if (r6 == 0) goto L_0x001f
            r6 = r4
            wg1.a0$r r6 = (wg1.C65954a0.C65975r) r6
            int r7 = r6.f189692j
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001f
            int r7 = r7 - r8
            r6.f189692j = r7
            goto L_0x0024
        L_0x001f:
            wg1.a0$r r6 = new wg1.a0$r
            r6.<init>(r0, r4)
        L_0x0024:
            java.lang.Object r4 = r6.f189690h
            xx3.a r7 = xx3.C15911a.COROUTINE_SUSPENDED
            int r8 = r6.f189692j
            r9 = 0
            r10 = 3
            r11 = 2
            r12 = 1
            if (r8 == 0) goto L_0x0071
            if (r8 == r12) goto L_0x0058
            if (r8 == r11) goto L_0x0047
            if (r8 != r10) goto L_0x003f
            java.lang.Object r1 = r6.f189686d
            bi1.e r1 = (bi1.C0287e) r1
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x0188
        L_0x003f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            int r1 = r6.f189689g
            int r2 = r6.f189688f
            java.lang.Object r3 = r6.f189687e
            bi1.e r3 = (bi1.C0287e) r3
            java.lang.Object r5 = r6.f189686d
            java.lang.Integer r5 = (java.lang.Integer) r5
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x015c
        L_0x0058:
            int r1 = r6.f189689g
            int r2 = r6.f189688f
            java.lang.Object r3 = r6.f189687e
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r5 = r6.f189686d
            wg1.a0 r5 = (wg1.C65954a0) r5
            kotlin.ResultKt.throwOnFailure(r4)
            r17 = r5
            r18 = r3
            r3 = r1
            r1 = r2
            r2 = r18
            goto L_0x012e
        L_0x0071:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "syncBGMAction action = "
            r4.append(r8)
            r4.append(r1)
            java.lang.String r8 = ", curSongId:"
            r4.append(r8)
            r4.append(r2)
            java.lang.String r8 = ", cur_volume:"
            r4.append(r8)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r8 = "FinderLiveAnchorMusicPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            te3.ds0 r4 = new te3.ds0
            r4.<init>()
            je1.h2 r8 = je1.C46523h2.f125330a
            r13 = 11254(0x2bf6, float:1.577E-41)
            te3.ig0 r8 = r8.mo71859a(r13)
            r4.f182834d = r8
            zc1.b r8 = zc1.C66785b.f191882e
            java.lang.String r8 = r8.mo90662O5()
            r4.f182835e = r8
            fj1.b r8 = r0.f189621e
            androidx.lifecycle.i0 r8 = r8.mo71262a(r5)
            cl1.u r8 = (cl1.C55001u) r8
            long r14 = r8.f154416j
            r4.f182838h = r14
            fj1.b$a r8 = fj1.C45795b.f123697j
            fj1.b r8 = fj1.C45795b.f123698n
            if (r8 == 0) goto L_0x00cd
            androidx.lifecycle.i0 r8 = r8.mo71262a(r5)
            cl1.u r8 = (cl1.C55001u) r8
            byte[] r8 = r8.f154417n
            goto L_0x00ce
        L_0x00cd:
            r8 = r9
        L_0x00ce:
            pe3.b r8 = pe3.C89349b.m111674a(r8)
            r4.f182837g = r8
            fj1.b r8 = r0.f189621e
            androidx.lifecycle.i0 r5 = r8.mo71262a(r5)
            cl1.u r5 = (cl1.C55001u) r5
            te3.c21 r5 = r5.f154420q
            long r14 = r5.f182392d
            r4.f182839i = r14
            r4.f182836f = r12
            r4.f182843p = r1
            if (r2 == 0) goto L_0x00ee
            int r5 = r21.intValue()
            r4.f182841n = r5
        L_0x00ee:
            r4.f182840j = r3
            ob0.c$b r5 = new ob0.c$b
            r5.<init>()
            r5.f127069d = r13
            java.lang.String r8 = "/cgi-bin/micromsg-bin/finderliveadjustbackgroundmusic"
            r5.f127068c = r8
            r5.f127066a = r4
            te3.es0 r4 = new te3.es0
            r4.<init>()
            r5.f127067b = r4
            ob0.c r4 = r5.mo72403a()
            java.lang.Class<ht1.s1> r5 = ht1.C8802s1.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ht1.s1 r5 = (ht1.C8802s1) r5
            ob0.b r5 = r5.mo9632ui()
            r5.mo123453j(r4)
            a14.h0 r4 = a14.C53872d1.f151117a
            a14.k2 r4 = f14.C58901s.f168555a
            r6.f189686d = r0
            r6.f189687e = r2
            r6.f189688f = r1
            r6.f189689g = r3
            r6.f189692j = r12
            java.lang.Object r4 = bi1.C0283d.m243a(r5, r4, r6)
            if (r4 != r7) goto L_0x012c
            return r7
        L_0x012c:
            r17 = r0
        L_0x012e:
            bi1.e r4 = (bi1.C0287e) r4
            boolean r5 = r4 instanceof bi1.C0288f
            if (r5 == 0) goto L_0x0162
            wx3.f r5 = r4.f854a
            if (r5 != 0) goto L_0x013c
            wx3.f r5 = r6.getContext()
        L_0x013c:
            wg1.a0$q r8 = new wg1.a0$q
            r14 = 0
            r12 = r8
            r13 = r4
            r15 = r1
            r16 = r2
            r12.<init>(r13, r14, r15, r16, r17)
            r6.f189686d = r2
            r6.f189687e = r4
            r6.f189688f = r1
            r6.f189689g = r3
            r6.f189692j = r11
            java.lang.Object r5 = a14.C53895h.m60469g(r5, r8, r6)
            if (r5 != r7) goto L_0x0158
            return r7
        L_0x0158:
            r5 = r2
            r2 = r1
            r1 = r3
            r3 = r4
        L_0x015c:
            r16 = r1
            r14 = r2
            r1 = r3
            r15 = r5
            goto L_0x0167
        L_0x0162:
            r14 = r1
            r15 = r2
            r16 = r3
            r1 = r4
        L_0x0167:
            boolean r2 = r1 instanceof bi1.C0281b
            if (r2 == 0) goto L_0x0188
            wx3.f r2 = r1.f854a
            if (r2 != 0) goto L_0x0173
            wx3.f r2 = r6.getContext()
        L_0x0173:
            wg1.a0$p r3 = new wg1.a0$p
            r13 = 0
            r11 = r3
            r12 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            r6.f189686d = r1
            r6.f189687e = r9
            r6.f189692j = r10
            java.lang.Object r2 = a14.C53895h.m60469g(r2, r3, r6)
            if (r2 != r7) goto L_0x0188
            return r7
        L_0x0188:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C65954a0.mo89998f0(int, java.lang.Integer, int, wx3.d):java.lang.Object");
    }

    /* renamed from: f1 */
    public void mo89999f1() {
        Log.m105924i("FinderLiveAnchorMusicPresenter", "playStart");
        C61926c.m72668M(new C65965j(this));
    }

    /* renamed from: g0 */
    public void mo90000g0() {
        Log.m105924i("FinderLiveAnchorMusicPresenter", "playComplete");
        C61926c.m72668M(new C65961f(this));
    }

    public void hide() {
        C58124b.C7172a.m7372a(this.f189622f, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_HIDE, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: j */
    public void mo90002j() {
        C58124b.C7172a.m7372a(this.f189622f, C58124b.C58125b.FINDER_LIVE_ANCHOR_SEARCH_MUSIC_SHOW, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: n */
    public boolean mo73861n(int i) {
        Class cls = C54991o.class;
        int size = ((C54991o) this.f189621e.mo71262a(cls)).f154232N2.f153469f.size();
        return size < ((C54991o) this.f189621e.mo71262a(cls)).f154232N2.f153468e.size() && i >= 0 && i >= size + -25;
    }

    /* renamed from: n0 */
    public void mo90003n0(C62987t2.C62988a aVar) {
        C87412m.m108594g(aVar, "seiDataFromGame");
        mo90004q().sendMessage(mo90004q().obtainMessage(this.f189628o, aVar));
    }

    public void onAttach(Object obj) {
        C66096w wVar = (C66096w) obj;
        C87412m.m108594g(wVar, "callback");
        Log.m105924i("FinderLiveAnchorMusicPresenter", "onAttach");
        this.f189624h = wVar;
        wVar.mo90097a();
        C63213g gVar = new C63213g(this.f189621e);
        this.f189625i = gVar;
        gVar.f179381n = new C65985c0(this, gVar);
        gVar.f179382o = new C65988d0(this);
        C66096w wVar2 = this.f189624h;
        C87412m.m108592e(wVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicViewCallback");
        WxRecyclerView wxRecyclerView = ((C66065o0) wVar2).f189929F;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(this.f189625i);
            wxRecyclerView.setLayoutManager(new LinearLayoutManager(wxRecyclerView.getContext()));
        }
    }

    public void onDetach() {
        Log.m105924i("FinderLiveAnchorMusicPresenter", "onDetach");
        mo90004q().removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: q */
    public final MMHandler mo90004q() {
        return (MMHandler) ((C36570n) this.f189631r).getValue();
    }

    /* renamed from: t */
    public boolean mo90005t() {
        return this.f189630q == 0;
    }

    /* renamed from: t0 */
    public void mo90006t0(int i) {
        Class cls = C54991o.class;
        Log.m105924i("FinderLiveAnchorMusicPresenter", "playError songId:" + i);
        C13604l<C54768h6, Integer> a = ((C54991o) this.f189621e.mo71262a(cls)).f154232N2.mo75644a(i);
        ((C54991o) this.f189621e.mo71262a(cls)).f154232N2.mo75652i((C54768h6) a.f38555d, ((Number) a.f38556e).intValue());
        C61926c.m72668M(new C65962g(this));
    }

    /* renamed from: x */
    public void mo90007x() {
        C66096w wVar = this.f189624h;
        if (wVar != null) {
            wVar.mo90102o();
        }
    }

    /* renamed from: x0 */
    public void mo90008x0() {
        C60735a c = FinderLiveService.f159376d.mo77627c();
        if (c != null) {
            c.mo85701t0();
        }
        this.f189626j = null;
        C54754f fVar = ((C54991o) this.f189621e.mo71262a(C54991o.class)).f154232N2;
        C54768h6 c2 = fVar.mo75646c();
        int i = fVar.f153467d;
        fVar.getClass();
        boolean z = false;
        if (c2 != null && c2.f153499b == 3) {
            z = true;
        }
        if (!z && c2 != null) {
            c2.f153499b = 3;
        }
        Log.m105924i("FinderLiveAnchorMusicData", "stopMusicItem " + c2 + " songId size:" + fVar.f153468e.size() + ", musicList id size:" + fVar.f153469f.size() + ", pos:" + i + ", curPlayPos:" + fVar.f153467d);
    }
}
