package qj1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import cl1.C54979h1;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C86312j;
import er1.C7919x;
import f14.C58901s;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import nj3.C76912y0;
import ok1.C62042e;
import pe3.C89349b;
import q40.C12040d;
import qj1.C62966ri;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk1.C63956k;
import sk1.C63961q;
import te3.C49579gm1;
import te3.C50636o51;
import te3.C64605o91;
import te3.C64822x51;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: qj1.cd */
public final class C62674cd implements C62966ri {

    /* renamed from: d */
    public final Context f177963d;

    /* renamed from: e */
    public final C45795b f177964e;

    /* renamed from: f */
    public final C58124b f177965f;

    /* renamed from: g */
    public C32226l<? super C63956k, C13598b0> f177966g;

    /* renamed from: h */
    public C63956k f177967h;

    /* renamed from: i */
    public final String f177968i = "FinderLivePlayListBubble";

    /* renamed from: j */
    public ViewGroup f177969j;

    /* renamed from: n */
    public final C13601g f177970n = C36568h.m40985a(new C62687m(this));

    /* renamed from: o */
    public final C13601g f177971o = C36568h.m40985a(new C62686l(this));

    /* renamed from: p */
    public final C13601g f177972p;

    /* renamed from: q */
    public final C13601g f177973q;

    /* renamed from: r */
    public final C13601g f177974r;

    /* renamed from: s */
    public final C13601g f177975s;

    /* renamed from: t */
    public final C13601g f177976t;

    /* renamed from: u */
    public final C13601g f177977u;

    /* renamed from: v */
    public final String f177978v;

    /* renamed from: w */
    public final String f177979w;

    /* renamed from: x */
    public final long f177980x;

    /* renamed from: y */
    public C53973z1 f177981y;

    /* renamed from: qj1.cd$i */
    public static final class C47845i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62674cd f128425d;

        /* renamed from: e */
        public final /* synthetic */ C63961q f128426e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLivePlayListBubble$refreshView$2$1", mo125469f = "FinderLivePlayListBubble.kt", mo125470l = {149, 245, 252}, mo125471m = "invokeSuspend")
        /* renamed from: qj1.cd$i$a */
        public static final class C47846a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f128427d;

            /* renamed from: e */
            public int f128428e;

            /* renamed from: f */
            public final /* synthetic */ C63961q f128429f;

            /* renamed from: g */
            public final /* synthetic */ C62674cd f128430g;

            @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLivePlayListBubble$refreshView$2$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "FinderLivePlayListBubble.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: qj1.cd$i$a$a */
            public static final class C47847a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ C0287e f128431d;

                /* renamed from: e */
                public final /* synthetic */ C62674cd f128432e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C47847a(C0287e eVar, C15601d dVar, C62674cd cdVar) {
                    super(2, dVar);
                    this.f128431d = eVar;
                    this.f128432e = cdVar;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C47847a(this.f128431d, dVar, this.f128432e);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C47847a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    String str = this.f128432e.f177968i;
                    StringBuilder sb = new StringBuilder();
                    sb.append("FinderSubscribeProgrammeRequest failed,errCode:");
                    C12040d dVar = ((C0280a) ((C0281b) this.f128431d).f843b).f841a;
                    sb.append(dVar != null ? new Integer(dVar.f35058f) : null);
                    Log.m105924i(str, sb.toString());
                    return C13598b0.f38549a;
                }
            }

            @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLivePlayListBubble$refreshView$2$1$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderLivePlayListBubble.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: qj1.cd$i$a$b */
            public static final class C47848b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ C0287e f128433d;

                /* renamed from: e */
                public final /* synthetic */ C63961q f128434e;

                /* renamed from: f */
                public final /* synthetic */ C62674cd f128435f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C47848b(C0287e eVar, C15601d dVar, C63961q qVar, C62674cd cdVar) {
                    super(2, dVar);
                    this.f128433d = eVar;
                    this.f128434e = qVar;
                    this.f128435f = cdVar;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C47848b(this.f128433d, dVar, this.f128434e, this.f128435f);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C47848b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    C49579gm1 gm12 = (C49579gm1) ((C0288f) this.f128433d).f855b;
                    C50636o51 o512 = this.f128434e.f181313s;
                    boolean z = false;
                    int i = o512.f138964h == 0 ? 1 : 0;
                    o512.f138964h = i;
                    if (i == 1) {
                        Context context = this.f128435f.f177963d;
                        C76912y0.m92773l(context, context.getString(C0966R.string.f8138nn));
                    }
                    this.f128435f.mo87702a(this.f128434e);
                    C62674cd cdVar = this.f128435f;
                    C63961q qVar = this.f128434e;
                    cdVar.getClass();
                    C64605o91 o912 = new C64605o91();
                    o912.f184634d = qVar.f181291d;
                    o912.f184635e = qVar.f181292e;
                    o912.f184636f = new C89349b(qVar.f181313s.toByteArray());
                    if (qVar.f181313s.f138964h == 1) {
                        z = true;
                    }
                    o912.f184637g = z;
                    o912.f184638h = qVar.f181302r;
                    o912.f184639i = ((C54979h1) cdVar.f177964e.mo71262a(C54979h1.class)).f154120L;
                    String str = cdVar.f177968i;
                    Log.m105924i(str, "[updateSyncExtra]  hidden_state = " + o912.f184637g + ", extBUf = " + o912.f184635e + ", current_promoting_id = " + o912.f184634d);
                    FinderLiveService.f159376d.getClass();
                    FinderLiveService.f159383n.mo75802h(10, o912);
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C47846a(C63961q qVar, C62674cd cdVar, C15601d<? super C47846a> dVar) {
                super(2, dVar);
                this.f128429f = qVar;
                this.f128430g = cdVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C47846a(this.f128429f, this.f128430g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C47846a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r8.f128428e
                    r2 = 0
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L_0x002e
                    if (r1 == r5) goto L_0x002a
                    if (r1 == r4) goto L_0x0021
                    if (r1 != r3) goto L_0x0019
                    java.lang.Object r0 = r8.f128427d
                    bi1.e r0 = (bi1.C0287e) r0
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L_0x00c6
                L_0x0019:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L_0x0021:
                    java.lang.Object r1 = r8.f128427d
                    bi1.e r1 = (bi1.C0287e) r1
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L_0x00a8
                L_0x002a:
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L_0x0085
                L_0x002e:
                    kotlin.ResultKt.throwOnFailure(r9)
                    te3.fm1 r9 = new te3.fm1
                    r9.<init>()
                    sk1.q r1 = r8.f128429f
                    je1.h2 r6 = je1.C46523h2.f125330a
                    r7 = 7734(0x1e36, float:1.0838E-41)
                    te3.ig0 r6 = r6.mo71859a(r7)
                    r9.f133586d = r6
                    te3.o51 r1 = r1.f181313s
                    int r6 = r1.f138964h
                    if (r6 != 0) goto L_0x004a
                    r6 = 1
                    goto L_0x004b
                L_0x004a:
                    r6 = 2
                L_0x004b:
                    r9.f133587e = r6
                    java.lang.String r1 = r1.f138960d
                    r9.f133588f = r1
                    ob0.c$b r1 = new ob0.c$b
                    r1.<init>()
                    r1.f127069d = r7
                    java.lang.String r6 = "/cgi-bin/micromsg-bin/findersubscribeprogramme"
                    r1.f127068c = r6
                    r1.f127066a = r9
                    te3.gm1 r9 = new te3.gm1
                    r9.<init>()
                    r1.f127067b = r9
                    ob0.c r9 = r1.mo72403a()
                    java.lang.Class<ht1.s1> r1 = ht1.C8802s1.class
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    ht1.s1 r1 = (ht1.C8802s1) r1
                    ob0.b r1 = r1.mo9632ui()
                    r1.mo123453j(r9)
                    a14.h0 r9 = a14.C53872d1.f151117a
                    a14.k2 r9 = f14.C58901s.f168555a
                    r8.f128428e = r5
                    java.lang.Object r9 = bi1.C0283d.m243a(r1, r9, r8)
                    if (r9 != r0) goto L_0x0085
                    return r0
                L_0x0085:
                    r1 = r9
                    bi1.e r1 = (bi1.C0287e) r1
                    sk1.q r9 = r8.f128429f
                    qj1.cd r5 = r8.f128430g
                    boolean r6 = r1 instanceof bi1.C0288f
                    if (r6 == 0) goto L_0x00a8
                    wx3.f r6 = r1.f854a
                    if (r6 != 0) goto L_0x0098
                    wx3.f r6 = r8.getContext()
                L_0x0098:
                    qj1.cd$i$a$b r7 = new qj1.cd$i$a$b
                    r7.<init>(r1, r2, r9, r5)
                    r8.f128427d = r1
                    r8.f128428e = r4
                    java.lang.Object r9 = a14.C53895h.m60469g(r6, r7, r8)
                    if (r9 != r0) goto L_0x00a8
                    return r0
                L_0x00a8:
                    qj1.cd r9 = r8.f128430g
                    boolean r4 = r1 instanceof bi1.C0281b
                    if (r4 == 0) goto L_0x00c6
                    wx3.f r4 = r1.f854a
                    if (r4 != 0) goto L_0x00b6
                    wx3.f r4 = r8.getContext()
                L_0x00b6:
                    qj1.cd$i$a$a r5 = new qj1.cd$i$a$a
                    r5.<init>(r1, r2, r9)
                    r8.f128427d = r1
                    r8.f128428e = r3
                    java.lang.Object r9 = a14.C53895h.m60469g(r4, r5, r8)
                    if (r9 != r0) goto L_0x00c6
                    return r0
                L_0x00c6:
                    rx3.b0 r9 = rx3.C13598b0.f38549a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: qj1.C62674cd.C47845i.C47846a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C47845i(C62674cd cdVar, C63961q qVar) {
            this.f128425d = cdVar;
            this.f128426e = qVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C62674cd cdVar = this.f128425d;
            C53895h.m60466d(cdVar.f177964e.f123702i, (C66212f) null, (C53934p0) null, new C47846a(this.f128426e, cdVar, (C15601d<? super C47846a>) null), 3, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.cd$a */
    public static final class C62675a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62674cd f177982d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62675a(C62674cd cdVar) {
            super(0);
            this.f177982d = cdVar;
        }

        public Object invoke() {
            ViewGroup viewGroup = this.f177982d.f177969j;
            if (viewGroup != null) {
                return viewGroup.findViewById(C0966R.C0970id.fad);
            }
            C87412m.m108603p("root");
            throw null;
        }
    }

    /* renamed from: qj1.cd$b */
    public static final class C62676b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62674cd f177983d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62676b(C62674cd cdVar) {
            super(0);
            this.f177983d = cdVar;
        }

        public Object invoke() {
            ViewGroup viewGroup = this.f177983d.f177969j;
            if (viewGroup != null) {
                return (TextView) viewGroup.findViewById(C0966R.C0970id.ono);
            }
            C87412m.m108603p("root");
            throw null;
        }
    }

    /* renamed from: qj1.cd$c */
    public static final class C62677c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62674cd f177984d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62677c(C62674cd cdVar) {
            super(0);
            this.f177984d = cdVar;
        }

        public Object invoke() {
            ViewGroup viewGroup = this.f177984d.f177969j;
            if (viewGroup != null) {
                return viewGroup.findViewById(C0966R.C0970id.be4);
            }
            C87412m.m108603p("root");
            throw null;
        }
    }

    /* renamed from: qj1.cd$d */
    public static final class C62678d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62674cd f177985d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62678d(C62674cd cdVar) {
            super(0);
            this.f177985d = cdVar;
        }

        public Object invoke() {
            ViewGroup viewGroup = this.f177985d.f177969j;
            if (viewGroup != null) {
                return viewGroup.findViewById(C0966R.C0970id.onk);
            }
            C87412m.m108603p("root");
            throw null;
        }
    }

    /* renamed from: qj1.cd$e */
    public static final class C62679e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62674cd f177986d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62679e(C62674cd cdVar) {
            super(0);
            this.f177986d = cdVar;
        }

        public Object invoke() {
            ViewGroup viewGroup = this.f177986d.f177969j;
            if (viewGroup != null) {
                return viewGroup.findViewById(C0966R.C0970id.onl);
            }
            C87412m.m108603p("root");
            throw null;
        }
    }

    /* renamed from: qj1.cd$f */
    public static final class C62680f extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62674cd f177987d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62680f(C62674cd cdVar) {
            super(0);
            this.f177987d = cdVar;
        }

        public Object invoke() {
            ViewGroup viewGroup = this.f177987d.f177969j;
            if (viewGroup != null) {
                return (TextView) viewGroup.findViewById(C0966R.C0970id.onm);
            }
            C87412m.m108603p("root");
            throw null;
        }
    }

    /* renamed from: qj1.cd$g */
    public static final class C62681g extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62674cd f177988d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62681g(C62674cd cdVar) {
            super(0);
            this.f177988d = cdVar;
        }

        public Object invoke() {
            ViewGroup viewGroup = this.f177988d.f177969j;
            if (viewGroup != null) {
                return viewGroup.findViewById(C0966R.C0970id.onk);
            }
            C87412m.m108603p("root");
            throw null;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLivePlayListBubble$refreshView$1", mo125469f = "FinderLivePlayListBubble.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.cd$h */
    public static final class C62682h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f177989d;

        /* renamed from: e */
        public final /* synthetic */ C62674cd f177990e;

        /* renamed from: f */
        public final /* synthetic */ C63961q f177991f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLivePlayListBubble$refreshView$1$1", mo125469f = "FinderLivePlayListBubble.kt", mo125470l = {107}, mo125471m = "invokeSuspend")
        /* renamed from: qj1.cd$h$a */
        public static final class C62683a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f177992d;

            /* renamed from: e */
            public final /* synthetic */ C62674cd f177993e;

            /* renamed from: f */
            public final /* synthetic */ C63961q f177994f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62683a(C62674cd cdVar, C63961q qVar, C15601d<? super C62683a> dVar) {
                super(2, dVar);
                this.f177993e = cdVar;
                this.f177994f = qVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C62683a(this.f177993e, this.f177994f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C62683a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f177992d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.f177993e.f177980x;
                    this.f177992d = 1;
                    if (C53965x0.m60607b(j, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0740i2 i2Var = ((C54979h1) this.f177993e.f177964e.mo71262a(C54979h1.class)).f154147v;
                C63956k kVar = i2Var instanceof C63956k ? (C63956k) i2Var : null;
                if (kVar != null) {
                    long j2 = kVar.f181291d;
                    C63961q qVar = this.f177994f;
                    if (j2 == qVar.f181291d && C87412m.m108589b(kVar.f181302r, qVar.f181302r)) {
                        FinderLiveService.f159376d.getClass();
                        C56032b bVar = FinderLiveService.f159379g;
                        if (bVar != null) {
                            C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
                            Bundle bundle = new Bundle();
                            C63961q qVar2 = this.f177994f;
                            C64822x51 x512 = new C64822x51();
                            x512.f186254d = 13;
                            x512.f186256f = new C89349b(qVar2.f181313s.toByteArray());
                            x512.f186258h = qVar2.f181291d;
                            x512.f186267t = qVar2.f181302r;
                            C13598b0 b0Var = C13598b0.f38549a;
                            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", x512.toByteArray());
                            bVar.statusChange(bVar2, bundle);
                        }
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62682h(C62674cd cdVar, C63961q qVar, C15601d<? super C62682h> dVar) {
            super(2, dVar);
            this.f177990e = cdVar;
            this.f177991f = qVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C62682h hVar = new C62682h(this.f177990e, this.f177991f, dVar);
            hVar.f177989d = obj;
            return hVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62682h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f177989d;
            C53973z1 z1Var = this.f177990e.f177981y;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C62674cd cdVar = this.f177990e;
            cdVar.f177981y = C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C62683a(cdVar, this.f177991f, (C15601d<? super C62683a>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.cd$j */
    public static final class C62684j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62674cd f177995d;

        /* renamed from: e */
        public final /* synthetic */ C63961q f177996e;

        public C62684j(C62674cd cdVar, C63961q qVar) {
            this.f177995d = cdVar;
            this.f177996e = qVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i(this.f177995d.f177968i, "close promote");
            FinderLiveService.f159376d.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            if (bVar != null) {
                C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
                Bundle bundle = new Bundle();
                C63961q qVar = this.f177996e;
                C64822x51 x512 = new C64822x51();
                x512.f186258h = qVar.f181291d;
                x512.f186254d = 13;
                x512.f186256f = new C89349b(qVar.f181313s.toByteArray());
                C13598b0 b0Var = C13598b0.f38549a;
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", x512.toByteArray());
                bundle.putBoolean("PARAM_FINDER_LIVE_PROMOTE_DELETE_BY_VISITOR_CLICK_CLOSE", true);
                bVar.statusChange(bVar2, bundle);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.cd$k */
    public static final class C62685k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62674cd f177997d;

        /* renamed from: e */
        public final /* synthetic */ C63961q f177998e;

        public C62685k(C62674cd cdVar, C63961q qVar) {
            this.f177997d = cdVar;
            this.f177998e = qVar;
        }

        public final void onClick(View view) {
            C62712dd ddVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f177997d.f177963d.getResources().getConfiguration().orientation == 2) {
                C58124b bVar = this.f177997d.f177965f;
                byte[] bArr = null;
                C56032b bVar2 = bVar instanceof C56032b ? (C56032b) bVar : null;
                if (!(bVar2 == null || (ddVar = (C62712dd) bVar2.getPlugin(C62712dd.class)) == null)) {
                    String str = this.f177997d.f177978v;
                    Bundle bundle = new Bundle();
                    C62674cd cdVar = this.f177997d;
                    C63961q qVar = this.f177998e;
                    String str2 = cdVar.f177979w;
                    FinderJumpInfo finderJumpInfo = qVar.f181313s.f138965i;
                    if (finderJumpInfo != null) {
                        bArr = finderJumpInfo.toByteArray();
                    }
                    bundle.putByteArray(str2, bArr);
                    C13598b0 b0Var = C13598b0.f38549a;
                    ddVar.mo87694V0(str, bundle);
                }
            } else {
                FinderJumpInfo finderJumpInfo2 = this.f177998e.f181313s.f138965i;
                if (finderJumpInfo2 != null) {
                    ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76780ML(this.f177997d.f177963d, finderJumpInfo2, 0);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.cd$l */
    public static final class C62686l extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62674cd f177999d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62686l(C62674cd cdVar) {
            super(0);
            this.f177999d = cdVar;
        }

        public Object invoke() {
            ViewGroup viewGroup = this.f177999d.f177969j;
            if (viewGroup != null) {
                return (TextView) viewGroup.findViewById(C0966R.C0970id.onp);
            }
            C87412m.m108603p("root");
            throw null;
        }
    }

    /* renamed from: qj1.cd$m */
    public static final class C62687m extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62674cd f178000d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62687m(C62674cd cdVar) {
            super(0);
            this.f178000d = cdVar;
        }

        public Object invoke() {
            ViewGroup viewGroup = this.f178000d.f177969j;
            if (viewGroup != null) {
                TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.onq);
                C87412m.m108593f(textView, "this");
                C7919x.m8091a(textView);
                return textView;
            }
            C87412m.m108603p("root");
            throw null;
        }
    }

    public C62674cd(Context context, C45795b bVar, C58124b bVar2, C32226l<? super C63956k, C13598b0> lVar, C63956k kVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f177963d = context;
        this.f177964e = bVar;
        this.f177965f = bVar2;
        this.f177966g = lVar;
        this.f177967h = kVar;
        C36568h.m40985a(new C62678d(this));
        this.f177972p = C36568h.m40985a(new C62679e(this));
        this.f177973q = C36568h.m40985a(new C62680f(this));
        this.f177974r = C36568h.m40985a(new C62681g(this));
        this.f177975s = C36568h.m40985a(new C62675a(this));
        this.f177976t = C36568h.m40985a(new C62676b(this));
        this.f177977u = C36568h.m40985a(new C62677c(this));
        this.f177978v = "PORTRAIT_ACTION_FINDER_PLAY_LIST_CLICK";
        this.f177979w = "PORTRAIT_ACTION_BUNDLE_OPEN_PLAY_LIST";
        this.f177980x = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.f7182ss, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f177969j = (ViewGroup) inflate;
    }

    /* renamed from: A */
    public void mo12174A(Bundle bundle, long j) {
    }

    /* renamed from: C */
    public void mo12175C(Object obj) {
        C87412m.m108594g(obj, "data");
        if (obj instanceof C63961q) {
            mo87702a((C63961q) obj);
        }
    }

    /* renamed from: F */
    public void mo12176F(C32224a<C13598b0> aVar) {
        C62966ri.C12652b.m12153b(this, aVar);
    }

    /* renamed from: J */
    public C63956k mo12177J() {
        return this.f177967h;
    }

    /* renamed from: Q */
    public void mo12178Q() {
    }

    /* renamed from: V */
    public int mo12179V() {
        return C0966R.C0970id.be4;
    }

    /* renamed from: a */
    public final void mo87702a(C63961q qVar) {
        C63961q qVar2 = qVar;
        ((TextView) ((C36570n) this.f177970n).getValue()).setText(qVar2.f181313s.f138961e);
        TextView textView = (TextView) ((C36570n) this.f177971o).getValue();
        ViewGroup viewGroup = this.f177969j;
        if (viewGroup != null) {
            textView.setText(viewGroup.getContext().getString(C0966R.string.f8131n4, new Object[]{C72715f.m85111d("HH:mm", (long) qVar2.f181313s.f138962f)}));
            if (qVar2.f181313s.f138964h == 0) {
                View view = (View) ((C36570n) this.f177972p).getValue();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView2 = (TextView) ((C36570n) this.f177973q).getValue();
                ViewGroup viewGroup2 = this.f177969j;
                if (viewGroup2 != null) {
                    textView2.setText(viewGroup2.getContext().getString(C0966R.string.f8130n3));
                    C53973z1 z1Var = this.f177981y;
                    if (z1Var != null) {
                        C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                    }
                } else {
                    C87412m.m108603p("root");
                    throw null;
                }
            } else {
                View view3 = (View) ((C36570n) this.f177972p).getValue();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView3 = (TextView) ((C36570n) this.f177973q).getValue();
                ViewGroup viewGroup3 = this.f177969j;
                if (viewGroup3 != null) {
                    textView3.setText(viewGroup3.getContext().getString(C0966R.string.f8132na));
                    C55908a aVar3 = this.f177964e.f123702i;
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53895h.m60466d(aVar3, C58901s.f168555a, (C53934p0) null, new C62682h(this, qVar2, (C15601d<? super C62682h>) null), 2, (Object) null);
                } else {
                    C87412m.m108603p("root");
                    throw null;
                }
            }
            if (C62042e.f176370a.mo87032P0(this.f177964e)) {
                View view5 = (View) ((C36570n) this.f177974r).getValue();
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((View) ((C36570n) this.f177974r).getValue()).setOnClickListener((View.OnClickListener) null);
                ((TextView) ((C36570n) this.f177976t).getValue()).setVisibility(0);
                ((TextView) ((C36570n) this.f177976t).getValue()).setText(this.f177963d.getString(C0966R.string.f8137nm, new Object[]{Long.valueOf(qVar2.f181313s.f138963g)}));
                View view7 = (View) ((C36570n) this.f177977u).getValue();
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(4);
                C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view8 = (View) ((C36570n) this.f177974r).getValue();
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(0);
                View view9 = view8;
                C117292a.m165358d(view9, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((TextView) ((C36570n) this.f177976t).getValue()).setVisibility(8);
                View view10 = (View) ((C36570n) this.f177977u).getValue();
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(0);
                C117292a.m165358d(view10, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePlayListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((View) ((C36570n) this.f177974r).getValue()).setOnClickListener(new C47845i(this, qVar2));
                ((View) ((C36570n) this.f177977u).getValue()).setOnClickListener(new C62684j(this, qVar2));
            }
            ((View) ((C36570n) this.f177975s).getValue()).setOnClickListener(new C62685k(this, qVar2));
            return;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* renamed from: a0 */
    public int mo12180a0() {
        return C0966R.C0970id.fad;
    }

    /* renamed from: e */
    public void mo12183e(Bundle bundle, Object obj, long j) {
        FinderJumpInfo finderJumpInfo = null;
        String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (string == null) {
            string = "";
        }
        if (C87412m.m108589b(string, this.f177978v)) {
            FinderJumpInfo finderJumpInfo2 = new FinderJumpInfo();
            Bundle bundle2 = obj instanceof Bundle ? (Bundle) obj : null;
            byte[] byteArray = bundle2 != null ? bundle2.getByteArray(this.f177979w) : null;
            if (byteArray != null) {
                try {
                    finderJumpInfo2.parseFrom(byteArray);
                    finderJumpInfo = finderJumpInfo2;
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
            }
            if (finderJumpInfo != null) {
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76780ML(this.f177963d, finderJumpInfo, 0);
            }
        }
    }

    /* renamed from: f */
    public Rect mo12184f(View view) {
        return C62966ri.C12652b.m12152a(this, view);
    }

    public View getView() {
        ViewGroup viewGroup = this.f177969j;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* renamed from: k */
    public void mo12186k() {
        C62966ri.C12652b.m12154c(this);
    }

    public void onPause() {
    }

    public void onResume() {
    }

    /* renamed from: t */
    public void mo12189t(Object obj) {
        C87412m.m108594g(obj, "data");
        if (obj instanceof C63961q) {
            mo87702a((C63961q) obj);
        }
    }

    /* renamed from: w */
    public void mo12190w() {
    }
}
