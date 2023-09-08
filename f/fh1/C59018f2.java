package fh1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53973z1;
import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import al1.C54127h;
import al1.C54129i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import c50.C54655b;
import cj1.C54741c;
import cj1.C54847z3;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.p136ui.widget.RoundCornerConstraintLayout;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.finder.live.FinderLivePresenter;
import com.tencent.p014mm.plugin.finder.live.controller.LivePromoteBannerController$initView$5;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.sidebar.FinderLiveSideBar;
import com.tencent.p014mm.plugin.finder.live.view.C3206b2;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C6606x;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.NativeInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import d50.C58115i;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import dk1.C58312g;
import e00.C45513i0;
import e00.C45520t;
import e00.C58468e0;
import f14.C58901s;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gg1.C32444a;
import gh1.C59453p;
import gh1.C8313a;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import ig1.C33317c;
import ik1.C33341d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import je1.C46526n3;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.ResultKt;
import l31.C61212e;
import nk1.C11207i;
import o40.C61926c;
import o40.C61937h;
import ob0.C117747y;
import ok1.C62042e;
import org.json.JSONObject;
import p165hr.C60106t;
import pe3.C47465a;
import pe3.C89349b;
import q31.C118148a;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C90363p0;
import t83.C13853i;
import te3.C48742ao0;
import te3.C49461fr0;
import te3.C50149km1;
import te3.C50285lm1;
import te3.C52005xq0;
import te3.C64331dw0;
import wg1.C66110y2;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: fh1.f2 */
public final class C59018f2 extends C8313a {

    /* renamed from: P */
    public static HashMap<String, Bitmap> f168857P = new HashMap<>();

    /* renamed from: Q */
    public static final int f168858Q = 40;

    /* renamed from: R */
    public static final int f168859R = 108;

    /* renamed from: S */
    public static int f168860S = 108;

    /* renamed from: T */
    public static int f168861T = 65535;

    /* renamed from: U */
    public static C32224a<C13598b0> f168862U;

    /* renamed from: A */
    public C9493c f168863A;

    /* renamed from: B */
    public C53973z1 f168864B;

    /* renamed from: C */
    public LinkedList<C54741c> f168865C = new LinkedList<>();

    /* renamed from: D */
    public FrameLayout f168866D;

    /* renamed from: E */
    public RoundCornerConstraintLayout f168867E;

    /* renamed from: F */
    public RoundedCornerFrameLayout f168868F;

    /* renamed from: G */
    public TextView f168869G;

    /* renamed from: H */
    public ViewGroup f168870H;

    /* renamed from: I */
    public C59453p f168871I;

    /* renamed from: J */
    public boolean f168872J;

    /* renamed from: K */
    public C53973z1 f168873K;

    /* renamed from: L */
    public C6606x f168874L;

    /* renamed from: M */
    public final HashMap<String, Long> f168875M = new HashMap<>();

    /* renamed from: N */
    public C13604l<String, String> f168876N;

    /* renamed from: j */
    public C53973z1 f168877j;

    /* renamed from: n */
    public RecyclerHorizontalViewPager f168878n;

    /* renamed from: o */
    public WxRecyclerAdapter<C9493c> f168879o;

    /* renamed from: p */
    public boolean f168880p;

    /* renamed from: q */
    public boolean f168881q;

    /* renamed from: r */
    public C9493c f168882r;

    /* renamed from: s */
    public String f168883s = "";

    /* renamed from: t */
    public int f168884t = -1;

    /* renamed from: u */
    public final Object f168885u = new Object();

    /* renamed from: v */
    public long f168886v;

    /* renamed from: w */
    public boolean f168887w;

    /* renamed from: x */
    public ArrayList<C9493c> f168888x = new ArrayList<>();

    /* renamed from: y */
    public ArrayList<C9493c> f168889y = new ArrayList<>();

    /* renamed from: z */
    public ArrayList<String> f168890z = new ArrayList<>();

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LivePromoteBannerController$onLiveStart$2$2", mo125469f = "LivePromoteBannerController.kt", mo125470l = {1120}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.f2$a */
    public static final class C59019a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f168891d;

        /* renamed from: e */
        public final /* synthetic */ C59018f2 f168892e;

        /* renamed from: f */
        public final /* synthetic */ C54741c f168893f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LivePromoteBannerController$onLiveStart$2$2$1", mo125469f = "LivePromoteBannerController.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: fh1.f2$a$a */
        public static final class C59020a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C54741c f168894d;

            /* renamed from: e */
            public final /* synthetic */ C59018f2 f168895e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59020a(C54741c cVar, C59018f2 f2Var, C15601d<? super C59020a> dVar) {
                super(2, dVar);
                this.f168894d = cVar;
                this.f168895e = f2Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C59020a(this.f168894d, this.f168895e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C59020a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                ArrayList c = C64197v.m75534c(this.f168894d);
                C59018f2.m68938o3(this.f168895e, c);
                C59018f2.m68935G3(this.f168895e, c);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: fh1.f2$a$b */
        public static final class C59021b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C59018f2 f168896d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59021b(C59018f2 f2Var) {
                super(0);
                this.f168896d = f2Var;
            }

            public Object invoke() {
                C59018f2 f2Var = this.f168896d;
                Class cls = C60106t.class;
                Class cls2 = C54991o.class;
                Class cls3 = C54116w.class;
                ViewGroup viewGroup = f2Var.f168870H;
                Bundle bundle = null;
                Context context = viewGroup != null ? viewGroup.getContext() : null;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    C54067f0.C54079q0 q0Var = C54067f0.C54079q0.CloseTypeFull;
                    ((C54116w) C86312j.m106911c(cls3)).Gy0(q0Var);
                    ((FinderLiveExitAnimateOpUIC) C39818r.f106831a.mo62443b(activity).mo75002a(FinderLiveExitAnimateOpUIC.class)).f160022q = true;
                    C3206b2 b2Var = f2Var.f27261e;
                    C56032b bVar = b2Var instanceof C56032b ? (C56032b) b2Var : null;
                    if (bVar != null) {
                        C58124b.C7172a.m7372a(bVar, C58124b.C58125b.CLOSE_LIVE, (Bundle) null, 2, (Object) null);
                    }
                    C66110y2.f190024a.mo90149a(3, ((C54991o) f2Var.business(cls2)).f154284Y2, ((C54991o) f2Var.business(cls2)).f154291a1, true);
                    C7335d c = C86312j.m106911c(cls3);
                    C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                    C54116w wVar = (C54116w) c;
                    FinderLiveService.f159376d.getClass();
                    C54129i iVar = FinderLiveService.f159398z;
                    if (iVar != null) {
                        bundle = iVar.f151996k;
                    }
                    C54116w.wy0(wVar, activity, q0Var, bundle, false, 8, (Object) null);
                    ((C60106t) C86312j.m106911c(cls)).Cx0().mo58846jo();
                    ((C60106t) C86312j.m106911c(cls)).yx0().mo9439Yt();
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59019a(C59018f2 f2Var, C54741c cVar, C15601d<? super C59019a> dVar) {
            super(2, dVar);
            this.f168892e = f2Var;
            this.f168893f = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59019a(this.f168892e, this.f168893f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59019a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Context context;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f168891d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53896h0 h0Var = C53872d1.f151119c;
                C59020a aVar2 = new C59020a(this.f168893f, this.f168892e, (C15601d<? super C59020a>) null);
                this.f168891d = 1;
                if (C53895h.m60469g(h0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C59018f2 f2Var = this.f168892e;
            HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
            f2Var.mo84252U3();
            ViewGroup viewGroup = this.f168892e.f168870H;
            if (!(viewGroup == null || (context = viewGroup.getContext()) == null)) {
                C59018f2 f2Var2 = this.f168892e;
                FinderLiveSideBar finderLiveSideBar = ((C58312g) C39818r.f106831a.mo62443b(context).mo75002a(C58312g.class)).f166968f;
                if (finderLiveSideBar != null) {
                    finderLiveSideBar.mo77741h(true, new C59021b(f2Var2));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fh1.f2$b */
    public static final class C59022b implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C59018f2 f168897a;

        public C59022b(C59018f2 f2Var) {
            this.f168897a = f2Var;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            FinderJumpInfo finderJumpInfo;
            C9493c cVar = this.f168897a.f168882r;
            Integer num = null;
            C54741c cVar2 = cVar instanceof C54741c ? (C54741c) cVar : null;
            if (!(cVar2 == null || (finderJumpInfo = cVar2.f153440d) == null)) {
                num = Integer.valueOf(finderJumpInfo.jumpinfo_type);
            }
            return C90363p0.m113143b(new C13604l("banner_jump_type", num));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LivePromoteBannerController$startJob$1", mo125469f = "LivePromoteBannerController.kt", mo125470l = {1193, 1197, 1200}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.f2$c */
    public static final class C59023c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f168898d;

        /* renamed from: e */
        public final /* synthetic */ C59018f2 f168899e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LivePromoteBannerController$startJob$1$2", mo125469f = "LivePromoteBannerController.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: fh1.f2$c$a */
        public static final class C59024a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C59018f2 f168900d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59024a(C59018f2 f2Var, C15601d<? super C59024a> dVar) {
                super(2, dVar);
                this.f168900d = f2Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C59024a(this.f168900d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C59024a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C64331dw0 dw02;
                FinderJumpInfo finderJumpInfo;
                ResultKt.throwOnFailure(obj);
                try {
                    C59018f2 f2Var = this.f168900d;
                    synchronized (f2Var.f168885u) {
                        if (f2Var.f168889y.size() > 0) {
                            int i = f2Var.f168884t + 1;
                            f2Var.f168884t = i;
                            RecyclerHorizontalViewPager recyclerHorizontalViewPager = f2Var.f168878n;
                            if (recyclerHorizontalViewPager != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(Integer.valueOf(i));
                                C117292a.m165358d(recyclerHorizontalViewPager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$startJob$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "smoothScrollToPosition", "(I)V");
                                recyclerHorizontalViewPager.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(recyclerHorizontalViewPager, "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$startJob$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "smoothScrollToPosition", "(I)V");
                            }
                            ArrayList<C9493c> arrayList = f2Var.f168889y;
                            f2Var.f168882r = arrayList.get(f2Var.f168884t % arrayList.size());
                            HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
                            StringBuilder sb = new StringBuilder();
                            sb.append("loop index ");
                            sb.append(f2Var.f168884t);
                            sb.append(", wording: ");
                            C9493c cVar = f2Var.f168882r;
                            Integer num = null;
                            C54741c cVar2 = cVar instanceof C54741c ? (C54741c) cVar : null;
                            sb.append((cVar2 == null || (finderJumpInfo = cVar2.f153440d) == null) ? null : finderJumpInfo.wording);
                            sb.append(", time: ");
                            C9493c cVar3 = f2Var.f168882r;
                            C54741c cVar4 = cVar3 instanceof C54741c ? (C54741c) cVar3 : null;
                            if (!(cVar4 == null || (dw02 = cVar4.f153444h) == null)) {
                                num = new Integer(dw02.f182893x);
                            }
                            sb.append(num);
                            Log.m105924i("Finder.LivePromoteBannerController", sb.toString());
                        }
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                } catch (Throwable unused) {
                    HashMap<String, Bitmap> hashMap2 = C59018f2.f168857P;
                    Log.m105924i("Finder.LivePromoteBannerController", "smoothScroll crash");
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59023c(C59018f2 f2Var, C15601d<? super C59023c> dVar) {
            super(2, dVar);
            this.f168899e = f2Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59023c(this.f168899e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59023c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8 A[RETURN] */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r9.f168898d
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x001f
                if (r1 == r4) goto L_0x0019
                if (r1 == r3) goto L_0x0019
                if (r1 != r2) goto L_0x0011
                goto L_0x001f
            L_0x0011:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0019:
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r9
                goto L_0x0095
            L_0x001f:
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r9
            L_0x0023:
                fh1.f2 r1 = r10.f168899e
                com.tencent.mm.view.RecyclerHorizontalViewPager r1 = r1.f168878n
                r6 = 0
                if (r1 != 0) goto L_0x002b
                goto L_0x002e
            L_0x002b:
                r1.setFrozeTouch(r6)
            L_0x002e:
                fh1.f2 r1 = r10.f168899e
                boolean r7 = r1.f168887w
                if (r7 == 0) goto L_0x0041
                r1.f168887w = r6
                r6 = 2000(0x7d0, double:9.88E-321)
                r10.f168898d = r4
                java.lang.Object r1 = a14.C53965x0.m60607b(r6, r10)
                if (r1 != r0) goto L_0x0095
                return r0
            L_0x0041:
                jq3.c r1 = r1.f168882r
                boolean r6 = r1 instanceof cj1.C54741c
                if (r6 == 0) goto L_0x004a
                cj1.c r1 = (cj1.C54741c) r1
                goto L_0x004b
            L_0x004a:
                r1 = r5
            L_0x004b:
                if (r1 == 0) goto L_0x0095
                java.util.HashMap<java.lang.String, android.graphics.Bitmap> r6 = fh1.C59018f2.f168857P
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "delay title: "
                r6.append(r7)
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r7 = r1.f153440d
                if (r7 == 0) goto L_0x0060
                java.lang.String r7 = r7.wording
                goto L_0x0061
            L_0x0060:
                r7 = r5
            L_0x0061:
                r6.append(r7)
                java.lang.String r7 = " , time: "
                r6.append(r7)
                te3.dw0 r7 = r1.f153444h
                if (r7 == 0) goto L_0x0075
                int r7 = r7.f182893x
                java.lang.Integer r8 = new java.lang.Integer
                r8.<init>(r7)
                goto L_0x0076
            L_0x0075:
                r8 = r5
            L_0x0076:
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                java.lang.String r7 = "Finder.LivePromoteBannerController"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
                te3.dw0 r1 = r1.f153444h
                if (r1 == 0) goto L_0x008a
                int r1 = r1.f182893x
                long r6 = (long) r1
                goto L_0x008c
            L_0x008a:
                r6 = 5000(0x1388, double:2.4703E-320)
            L_0x008c:
                r10.f168898d = r3
                java.lang.Object r1 = a14.C53965x0.m60607b(r6, r10)
                if (r1 != r0) goto L_0x0095
                return r0
            L_0x0095:
                a14.h0 r1 = a14.C53872d1.f151117a
                a14.k2 r1 = f14.C58901s.f168555a
                fh1.f2$c$a r6 = new fh1.f2$c$a
                fh1.f2 r7 = r10.f168899e
                r6.<init>(r7, r5)
                r10.f168898d = r2
                java.lang.Object r1 = a14.C53895h.m60469g(r1, r6, r10)
                if (r1 != r0) goto L_0x0023
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: fh1.C59018f2.C59023c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: fh1.f2$d */
    public static final class C59025d extends C54847z3.C54849b<C50285lm1> {

        /* renamed from: b */
        public final /* synthetic */ C59018f2 f168901b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59025d(C59018f2 f2Var, Class<C50285lm1> cls) {
            super(cls);
            this.f168901b = f2Var;
        }

        /* renamed from: a */
        public void mo9116a(C47465a aVar) {
            C50285lm1 lm12 = (C50285lm1) aVar;
            C87412m.m108594g(lm12, "result");
            HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
            Log.m105924i("Finder.LivePromoteBannerController", "onPollingSuccess");
            ((C54991o) this.f168901b.business(C54991o.class)).f154223L1 = true;
            C59018f2 f2Var = this.f168901b;
            C3206b2 b2Var = f2Var.f27261e;
            C56032b bVar = b2Var instanceof C56032b ? (C56032b) b2Var : null;
            if (bVar != null) {
                C11207i.m11070f(bVar, C53872d1.f151119c, (C53934p0) null, new C59036j2(f2Var, lm12, (C15601d<? super C59036j2>) null), 2, (Object) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59018f2(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: F3 */
    public static final void m68934F3(C59018f2 f2Var, C54741c cVar, boolean z) {
        ViewGroup viewGroup = f2Var.f168870H;
        if (viewGroup != null) {
            C8479f0 f0Var = new C8479f0();
            T nVar = new C77407n(viewGroup.getContext(), 1, true);
            f0Var.f27484d = nVar;
            nVar.f225771i = new C8047g2(viewGroup);
            nVar.f225782p = new C59029h2(cVar, f2Var, z, f0Var);
            nVar.f225761d = new C59033i2(f2Var);
            nVar.mo107568m(viewGroup.getContext().getString(C0966R.string.dkn), 17, 0);
            ((C77407n) f0Var.f27484d).mo107573q();
        }
    }

    /* renamed from: G3 */
    public static final void m68935G3(C59018f2 f2Var, List list) {
        Class cls = C54991o.class;
        synchronized (f2Var.f168885u) {
            ((C54991o) f2Var.business(cls)).f154211I1.clear();
            Log.m105925i("Finder.LivePromoteBannerController", "result or jump_infos size is %d", Integer.valueOf(list.size()));
            if (!list.isEmpty()) {
                ((C54991o) f2Var.business(cls)).f154211I1.addAll(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C54741c cVar = (C54741c) it.next();
                    FinderJumpInfo finderJumpInfo = cVar.f153440d;
                    Log.m105925i("Finder.LivePromoteBannerController", "wording:%s, businessType:%d, jumpType:%d, extInfo:%s", finderJumpInfo.wording, Integer.valueOf(finderJumpInfo.business_type), Integer.valueOf(cVar.f153440d.jumpinfo_type), cVar.f153440d.ext_info);
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:141:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0566  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0573  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0576  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x05ba  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x05c8  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x05d8  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x05e6  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0614  */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m68936m3(fh1.C59018f2 r39, android.content.Context r40, cj1.C54741c r41) {
        /*
            r1 = r39
            r2 = r40
            r3 = r41
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            java.lang.String r0 = "hexBackgroundColor"
            android.view.ViewGroup r5 = r1.f168870H
            if (r5 == 0) goto L_0x0623
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r8 = r3.f153440d
            int r8 = r8.business_type
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 0
            r7[r9] = r8
            java.lang.String r8 = "Finder.LivePromoteBannerController"
            java.lang.String r10 = "bannerJumpImpl business_type:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r7)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r7 = r3.f153440d
            int r7 = r7.business_type
            r10 = 5
            if (r7 == r10) goto L_0x0035
            r11 = 33
            if (r7 == r11) goto L_0x0035
            java.lang.String r0 = "business_type is not emFinderJumperBusinessType_LiveRoomBanner"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x0623
        L_0x0035:
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 3
            java.lang.Object[] r12 = new java.lang.Object[r11]
            te3.dw0 r13 = r3.f153444h
            java.lang.String r14 = ""
            if (r13 == 0) goto L_0x0044
            java.lang.String r13 = r13.f182876d
            if (r13 != 0) goto L_0x0045
        L_0x0044:
            r13 = r14
        L_0x0045:
            r12[r9] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r12[r6] = r13
            int r13 = r1.mo84243K3(r3)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r15 = 2
            r12[r15] = r13
            r13 = 27755(0x6c6b, float:3.8893E-41)
            r7.mo160131h(r13, r12)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r7 = r3.f153440d
            int r12 = r7.jumpinfo_type
            if (r12 == r6) goto L_0x061a
            java.lang.String r13 = "1"
            java.lang.String r10 = "root.context"
            if (r12 == r15) goto L_0x0321
            if (r12 == r11) goto L_0x006d
            goto L_0x031d
        L_0x006d:
            com.tencent.mm.protocal.protobuf.NativeInfo r0 = r7.native_info
            if (r0 == 0) goto L_0x0079
            int r0 = r0.native_type
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7 = r0
            goto L_0x007a
        L_0x0079:
            r7 = 0
        L_0x007a:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r3.f153440d
            com.tencent.mm.protocal.protobuf.NativeInfo r0 = r0.native_info
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = r0.necessary_params
            if (r0 != 0) goto L_0x0085
        L_0x0084:
            r0 = r14
        L_0x0085:
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r16 = 0
            r12[r16] = r0
            java.lang.String r9 = "jump native necessary_params:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r12)
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0096 }
            r9.<init>(r0)     // Catch:{ JSONException -> 0x0096 }
            goto L_0x009e
        L_0x0096:
            r0 = move-exception
            r9 = 0
            java.lang.Object[] r12 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r14, r12)
            r9 = 0
        L_0x009e:
            if (r9 != 0) goto L_0x00a5
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
        L_0x00a5:
            if (r7 != 0) goto L_0x00a8
            goto L_0x00b5
        L_0x00a8:
            int r0 = r7.intValue()
            if (r0 != r6) goto L_0x00b5
            nk1.g r0 = nk1.C61779g.f175628a
            r0.mo86698a(r2, r9)
            goto L_0x031d
        L_0x00b5:
            if (r7 != 0) goto L_0x00b8
            goto L_0x00c5
        L_0x00b8:
            int r0 = r7.intValue()
            if (r0 != r15) goto L_0x00c5
            nk1.g r0 = nk1.C61779g.f175628a
            r0.mo86699b(r2, r9)
            goto L_0x031d
        L_0x00c5:
            if (r7 != 0) goto L_0x00c8
            goto L_0x00e2
        L_0x00c8:
            int r0 = r7.intValue()
            if (r0 != r11) goto L_0x00e2
            r0 = 0
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r2, r3)
            java.lang.Class<tf0.o1> r3 = tf0.C13883o1.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            tf0.o1 r3 = (tf0.C13883o1) r3
            r3.Wb0(r2, r0, r9)
            goto L_0x031d
        L_0x00e2:
            if (r7 != 0) goto L_0x00e5
            goto L_0x00f3
        L_0x00e5:
            int r0 = r7.intValue()
            r11 = 4
            if (r0 != r11) goto L_0x00f3
            nk1.g r0 = nk1.C61779g.f175628a
            r0.mo86700c(r2, r9)
            goto L_0x031d
        L_0x00f3:
            java.lang.String r0 = "2"
            java.lang.String r2 = "liveid"
            if (r7 != 0) goto L_0x00fb
            goto L_0x018f
        L_0x00fb:
            int r11 = r7.intValue()
            r12 = 5
            if (r11 != r12) goto L_0x018f
            te3.x91 r3 = new te3.x91     // Catch:{ Exception -> 0x0184 }
            r3.<init>()     // Catch:{ Exception -> 0x0184 }
            java.lang.String r6 = "selectTabId"
            r7 = 0
            int r6 = r9.optInt(r6, r7)     // Catch:{ Exception -> 0x0184 }
            r3.f144531d = r6     // Catch:{ Exception -> 0x0184 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x0184 }
            r6.<init>()     // Catch:{ Exception -> 0x0184 }
            java.lang.String r7 = "tab_id"
            int r9 = r3.f144531d     // Catch:{ Exception -> 0x0184 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0184 }
            r6.put(r7, r9)     // Catch:{ Exception -> 0x0184 }
            androidx.lifecycle.i0 r4 = r1.business(r4)     // Catch:{ Exception -> 0x0184 }
            cl1.u r4 = (cl1.C55001u) r4     // Catch:{ Exception -> 0x0184 }
            te3.c21 r4 = r4.f154420q     // Catch:{ Exception -> 0x0184 }
            long r11 = r4.f182392d     // Catch:{ Exception -> 0x0184 }
            java.lang.String r4 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x0184 }
            r6.put(r2, r4)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r2 = "screen_type"
            boolean r1 = r39.mo9310g3()     // Catch:{ Exception -> 0x0184 }
            if (r1 == 0) goto L_0x013c
            r13 = r0
        L_0x013c:
            r6.put(r2, r13)     // Catch:{ Exception -> 0x0184 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0184 }
            java.lang.Class<ak1.o> r0 = ak1.C54108o.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r1 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r0, r1)     // Catch:{ Exception -> 0x0184 }
            r18 = r0
            ht1.j5 r18 = (ht1.C8777j5) r18     // Catch:{ Exception -> 0x0184 }
            ak1.f0$m r19 = ak1.C54067f0.C0064m.LIVE_PAGE_BANNER     // Catch:{ Exception -> 0x0184 }
            r21 = 0
            r22 = 4
            r23 = 0
            r20 = r6
            ht1.C8777j5.C8778a.m8606g(r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0184 }
            java.lang.Class<ns3.d> r0 = ns3.C11266d.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0184 }
            ns3.d r0 = (ns3.C11266d) r0     // Catch:{ Exception -> 0x0184 }
            android.content.Context r1 = r5.getContext()     // Catch:{ Exception -> 0x0184 }
            gy3.C87412m.m108593f(r1, r10)     // Catch:{ Exception -> 0x0184 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0184 }
            r2.<init>()     // Catch:{ Exception -> 0x0184 }
            java.lang.String r4 = "nearby_live_target_square_page_params_key"
            byte[] r3 = r3.toByteArray()     // Catch:{ Exception -> 0x0184 }
            r2.putExtra(r4, r3)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r3 = "key_context_id"
            r2.putExtra(r3, r14)     // Catch:{ Exception -> 0x0184 }
            r0.mo9184Nw(r1, r2)     // Catch:{ Exception -> 0x0184 }
            goto L_0x0623
        L_0x0184:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "openFinderView"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r2, r1)
            goto L_0x0623
        L_0x018f:
            r4 = 14
            if (r7 != 0) goto L_0x0195
            goto L_0x027e
        L_0x0195:
            int r8 = r7.intValue()
            if (r8 != r4) goto L_0x027e
            ok1.e r1 = ok1.C62042e.f176370a
            boolean r1 = r1.mo87027N0()
            if (r1 == 0) goto L_0x01a5
            goto L_0x0621
        L_0x01a5:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            j50.a r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r1 == 0) goto L_0x01b6
            boolean r1 = r1.mo85682Z()
            if (r1 != r6) goto L_0x01b6
            r1 = 1
            goto L_0x01b7
        L_0x01b6:
            r1 = 0
        L_0x01b7:
            if (r1 == 0) goto L_0x01d2
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r1 = r5.getResources()
            r2 = 2131827512(0x7f111b38, float:1.9287939E38)
            java.lang.String r1 = r1.getString(r2)
            r2 = 0
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)
            r0.show()
            goto L_0x0621
        L_0x01d2:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r3.f153440d     // Catch:{ all -> 0x031d }
            int r1 = r1.ext_type     // Catch:{ all -> 0x031d }
            java.lang.String r4 = "object_id"
            java.lang.String r4 = r9.optString(r4)     // Catch:{ all -> 0x031d }
            long r7 = o40.C61926c.m72671P(r4)     // Catch:{ all -> 0x031d }
            java.lang.String r2 = r9.optString(r2)     // Catch:{ all -> 0x031d }
            long r11 = o40.C61926c.m72671P(r2)     // Catch:{ all -> 0x031d }
            java.lang.String r2 = "nonceid"
            java.lang.String r2 = r9.optString(r2)     // Catch:{ all -> 0x031d }
            java.lang.String r4 = "session_buffer"
            java.lang.String r4 = r9.optString(r4)     // Catch:{ all -> 0x031d }
            te3.ap2 r9 = new te3.ap2     // Catch:{ all -> 0x031d }
            r9.<init>()     // Catch:{ all -> 0x031d }
            r9.f182124d = r7     // Catch:{ all -> 0x031d }
            r9.f182125e = r11     // Catch:{ all -> 0x031d }
            if (r2 == 0) goto L_0x0202
            r9.f182126f = r2     // Catch:{ all -> 0x031d }
        L_0x0202:
            if (r4 == 0) goto L_0x0206
            r9.f182128h = r4     // Catch:{ all -> 0x031d }
        L_0x0206:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x031d }
            te3.c90 r2 = new te3.c90     // Catch:{ all -> 0x031d }
            r2.<init>()     // Catch:{ all -> 0x031d }
            if (r1 != r6) goto L_0x025c
            wg1.r1 r1 = wg1.C15346r1.f41686a     // Catch:{ all -> 0x031d }
            te3.dw0 r4 = r3.f153444h     // Catch:{ all -> 0x031d }
            if (r4 == 0) goto L_0x0218
            java.lang.String r4 = r4.f182876d     // Catch:{ all -> 0x031d }
            goto L_0x0219
        L_0x0218:
            r4 = 0
        L_0x0219:
            r1.mo14181a(r15, r4)     // Catch:{ all -> 0x031d }
            te3.eq2 r1 = new te3.eq2     // Catch:{ all -> 0x031d }
            r1.<init>()     // Catch:{ all -> 0x031d }
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r3.f153440d     // Catch:{ all -> 0x031d }
            pe3.b r4 = r4.ext_buff     // Catch:{ all -> 0x031d }
            r1.f183027r = r4     // Catch:{ all -> 0x031d }
            r2.f182451n = r1     // Catch:{ all -> 0x031d }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x031d }
            r1.<init>()     // Catch:{ all -> 0x031d }
            java.lang.String r4 = "msg_id"
            te3.dw0 r3 = r3.f153444h     // Catch:{ all -> 0x031d }
            if (r3 == 0) goto L_0x023a
            java.lang.String r3 = r3.f182876d     // Catch:{ all -> 0x031d }
            if (r3 != 0) goto L_0x0239
            goto L_0x023a
        L_0x0239:
            r14 = r3
        L_0x023a:
            r1.put(r4, r14)     // Catch:{ all -> 0x031d }
            java.lang.String r3 = "msg_style"
            pe1.c<java.lang.Integer> r4 = gg1.C32444a.f86067I2     // Catch:{ all -> 0x031d }
            java.lang.Object r4 = r4.mo60266n()     // Catch:{ all -> 0x031d }
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ all -> 0x031d }
            int r4 = r4.intValue()     // Catch:{ all -> 0x031d }
            if (r4 != 0) goto L_0x024e
            r13 = r0
        L_0x024e:
            r1.put(r3, r13)     // Catch:{ all -> 0x031d }
            t91.c$a r0 = t91.C64208c.f181951a     // Catch:{ all -> 0x031d }
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x031d }
            java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, java.lang.String>> r3 = t91.C64208c.f181947N     // Catch:{ all -> 0x031d }
            r3.put(r0, r1)     // Catch:{ all -> 0x031d }
        L_0x025c:
            java.lang.Class<ls3.f> r0 = ls3.C10649f.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x031d }
            r20 = r0
            ls3.f r20 = (ls3.C10649f) r20     // Catch:{ all -> 0x031d }
            android.content.Context r0 = r5.getContext()     // Catch:{ all -> 0x031d }
            gy3.C87412m.m108593f(r0, r10)     // Catch:{ all -> 0x031d }
            r22 = 0
            r24 = 0
            r26 = 0
            r21 = r0
            r23 = r9
            r25 = r2
            r20.mo10916tP(r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x031d }
            goto L_0x031d
        L_0x027e:
            r0 = 9
            if (r7 != 0) goto L_0x0283
            goto L_0x02b4
        L_0x0283:
            int r2 = r7.intValue()
            if (r2 != r0) goto L_0x02b4
            bl3.r r0 = bl3.C39818r.f106831a
            android.content.Context r1 = r5.getContext()
            gy3.C87412m.m108593f(r1, r10)
            bl3.r$a r0 = r0.mo62443b(r1)
            java.lang.Class<dk1.g> r1 = dk1.C58312g.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            java.lang.String r1 = "UICProvider.of(root.cont…veSideBarUIC::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            dk1.g r0 = (dk1.C58312g) r0
            com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r1 = r0.f166968f
            if (r1 == 0) goto L_0x02ae
            r2 = 0
            r3 = 0
            r1.mo77741h(r3, r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x02ae:
            dk1.g$a r0 = r0.f166971i
            r0.mo83065c()
            goto L_0x031d
        L_0x02b4:
            r0 = 29
            if (r7 != 0) goto L_0x02b9
            goto L_0x031d
        L_0x02b9:
            int r2 = r7.intValue()
            if (r2 != r0) goto L_0x031d
            java.lang.String r0 = "queryWord"
            java.lang.String r0 = r9.optString(r0, r14)
            java.lang.String r2 = "query"
            gy3.C87412m.m108593f(r0, r2)
            u73.p0 r2 = new u73.p0
            r2.<init>()
            android.view.ViewGroup r3 = r1.f168870H
            if (r3 == 0) goto L_0x02d8
            android.content.Context r9 = r3.getContext()
            goto L_0x02d9
        L_0x02d8:
            r9 = 0
        L_0x02d9:
            r2.f39544a = r9
            r3 = 130(0x82, float:1.82E-43)
            r2.f39545b = r3
            r2.f39547d = r0
            r4 = 0
            r2.f39546c = r4
            java.lang.Class<c00.n> r0 = c00.C0405n.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            c00.n r0 = (c00.C0405n) r0
            java.lang.String r0 = r0.lh0(r3)
            r2.f39548e = r0
            r2.f39549f = r6
            r2.f39551h = r6
            r2.f39552i = r4
            r2.f39566w = r6
            r2.f39565v = r4
            r2.f39553j = r15
            r2.f39560q = r4
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131101833(0x7f060889, float:1.7816087E38)
            int r0 = kg3.C76577a.m92153d(r0, r3)
            r2.f39554k = r0
            r2.f39555l = r4
            java.lang.Class<u73.p> r0 = u73.C101982p.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            u73.p r0 = (u73.C101982p) r0
            r0.mo6877X6(r2)
            r39.mo84250R3()
        L_0x031d:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0621
        L_0x0321:
            gy3.f0 r7 = new gy3.f0
            r7.<init>()
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r9 = r3.f153440d
            com.tencent.mm.protocal.protobuf.Html5Info r9 = r9.html5_info
            if (r9 == 0) goto L_0x0330
            java.lang.String r9 = r9.url
            if (r9 != 0) goto L_0x0331
        L_0x0330:
            r9 = r14
        L_0x0331:
            r7.f27484d = r9
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x037d }
            java.lang.String r12 = "refreshButton"
            java.lang.String r12 = r9.getQueryParameter(r12)     // Catch:{ Exception -> 0x037d }
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)     // Catch:{ Exception -> 0x037d }
            boolean r12 = gy3.C87412m.m108589b(r12, r13)     // Catch:{ Exception -> 0x037d }
            java.lang.String r13 = r9.getQueryParameter(r0)     // Catch:{ Exception -> 0x037b }
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)     // Catch:{ Exception -> 0x037b }
            java.lang.String r11 = "nullAsNil(uri.getQueryPa…er(\"hexBackgroundColor\"))"
            gy3.C87412m.m108593f(r13, r11)     // Catch:{ Exception -> 0x037b }
            int r11 = r13.length()     // Catch:{ Exception -> 0x037b }
            if (r11 <= 0) goto L_0x035a
            r11 = 1
            goto L_0x035b
        L_0x035a:
            r11 = 0
        L_0x035b:
            if (r11 == 0) goto L_0x0397
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x037b }
            r11.<init>()     // Catch:{ Exception -> 0x037b }
            r13 = 35
            r11.append(r13)     // Catch:{ Exception -> 0x037b }
            java.lang.String r0 = r9.getQueryParameter(r0)     // Catch:{ Exception -> 0x037b }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x037b }
            r11.append(r0)     // Catch:{ Exception -> 0x037b }
            java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x037b }
            r35 = r0
            r33 = r12
            goto L_0x039b
        L_0x037b:
            r0 = move-exception
            goto L_0x037f
        L_0x037d:
            r0 = move-exception
            r12 = 0
        L_0x037f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "execption: "
            r9.append(r11)
            java.lang.String r0 = r0.getMessage()
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
        L_0x0397:
            r33 = r12
            r35 = r14
        L_0x039b:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            T r9 = r7.f27484d
            r11 = 0
            r0[r11] = r9
            java.lang.String r9 = "jump half h5 url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r0)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r3.f153440d
            com.tencent.mm.protocal.protobuf.Html5Info r0 = r0.html5_info
            if (r0 == 0) goto L_0x0614
            T r0 = r7.f27484d
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03b9
            goto L_0x0614
        L_0x03b9:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r3.f153440d
            com.tencent.mm.protocal.protobuf.Html5Info r0 = r0.html5_info
            if (r0 == 0) goto L_0x03c5
            int r9 = r0.style
            if (r9 != r6) goto L_0x03c5
            r9 = 1
            goto L_0x03c6
        L_0x03c5:
            r9 = 0
        L_0x03c6:
            if (r9 == 0) goto L_0x05ee
            if (r0 == 0) goto L_0x03cd
            int r0 = r0.height_percent
            goto L_0x03ce
        L_0x03cd:
            r0 = 0
        L_0x03ce:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "show HalfScreenWebView heightPercent:"
            r9.append(r11)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            r9 = 50
            if (r0 < r9) goto L_0x03eb
            r9 = 90
            if (r0 <= r9) goto L_0x03ed
        L_0x03eb:
            r0 = 75
        L_0x03ed:
            float r0 = (float) r0
            r9 = 100
            float r9 = (float) r9
            float r0 = r0 / r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "realScreenHeightPercent:"
            r9.append(r11)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            te3.dw0 r9 = r3.f153444h
            if (r9 == 0) goto L_0x0410
            int r11 = r9.f182891v
            if (r11 != r6) goto L_0x0410
            r11 = 1
            goto L_0x0411
        L_0x0410:
            r11 = 0
        L_0x0411:
            if (r11 == 0) goto L_0x0420
            if (r9 == 0) goto L_0x041b
            int r11 = r9.f182877e
            if (r11 != r6) goto L_0x041b
            r11 = 1
            goto L_0x041c
        L_0x041b:
            r11 = 0
        L_0x041c:
            if (r11 == 0) goto L_0x0420
            r9 = 3
            goto L_0x043b
        L_0x0420:
            if (r9 == 0) goto L_0x0428
            int r11 = r9.f182891v
            if (r11 != r6) goto L_0x0428
            r11 = 1
            goto L_0x0429
        L_0x0428:
            r11 = 0
        L_0x0429:
            if (r11 == 0) goto L_0x042d
            r9 = 2
            goto L_0x043b
        L_0x042d:
            if (r9 == 0) goto L_0x0435
            int r9 = r9.f182877e
            if (r9 != r6) goto L_0x0435
            r9 = 1
            goto L_0x0436
        L_0x0435:
            r9 = 0
        L_0x0436:
            if (r9 == 0) goto L_0x043a
            r9 = 1
            goto L_0x043b
        L_0x043a:
            r9 = 0
        L_0x043b:
            java.lang.Class<e00.e0> r11 = e00.C58468e0.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            e00.e0 r11 = (e00.C58468e0) r11
            T r12 = r7.f27484d
            java.lang.String r12 = (java.lang.String) r12
            boolean r11 = r11.mo70777lb(r12)
            java.lang.String r12 = "promoteBanner"
            if (r11 == 0) goto L_0x0498
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 5
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r17 = 0
            r13[r17] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r13[r6] = r12
            r13[r15] = r14
            r12 = 3
            r13[r12] = r14
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12 = 4
            r13[r12] = r9
            r9 = 27486(0x6b5e, float:3.8516E-41)
            r11.mo160131h(r9, r13)
            java.lang.Object[] r9 = new java.lang.Object[r12]
            te3.dw0 r12 = r3.f153444h
            if (r12 == 0) goto L_0x047b
            java.lang.String r12 = r12.f182876d
            if (r12 != 0) goto L_0x047a
            goto L_0x047b
        L_0x047a:
            r14 = r12
        L_0x047b:
            r13 = 0
            r9[r13] = r14
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r9[r6] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r9[r15] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r20 = 3
            r9[r20] = r12
            r12 = 27755(0x6c6b, float:3.8893E-41)
            r11.mo160131h(r12, r9)
            goto L_0x04b9
        L_0x0498:
            r13 = 0
            r20 = 3
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r13] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r13 = 1
            r6[r13] = r12
            r6[r15] = r14
            r6[r20] = r14
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12 = 4
            r6[r12] = r9
            r9 = 27486(0x6b5e, float:3.8516E-41)
            r11.mo160131h(r9, r6)
        L_0x04b9:
            java.lang.Class<e00.x> r6 = e00.C7578x.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            e00.x r6 = (e00.C7578x) r6
            android.content.Context r9 = r5.getContext()
            gy3.C87412m.m108593f(r9, r10)
            T r10 = r7.f27484d
            java.lang.String r10 = (java.lang.String) r10
            com.tencent.mm.plugin.webview.ui.tools.widget.u r11 = new com.tencent.mm.plugin.webview.ui.tools.widget.u
            java.lang.Class<cl1.o> r12 = cl1.C54991o.class
            androidx.lifecycle.i0 r12 = r1.business(r12)
            cl1.o r12 = (cl1.C54991o) r12
            java.lang.String r12 = r12.f154345o
            ok1.e r13 = ok1.C62042e.f176370a
            boolean r13 = r13.mo87027N0()
            if (r13 == 0) goto L_0x04e6
            zc1.b r12 = zc1.C66785b.f191882e
            java.lang.String r12 = r12.mo90662O5()
        L_0x04e6:
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            java.lang.String r14 = "finderId"
            r13.putOpt(r14, r12)
            androidx.lifecycle.i0 r4 = r1.business(r4)
            cl1.u r4 = (cl1.C55001u) r4
            te3.c21 r4 = r4.f154420q
            long r3 = r4.f182392d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "liveId"
            r13.putOpt(r4, r3)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r3 = r13.toString()
            r12 = 0
            r4[r12] = r3
            java.lang.String r3 = "getBannerHalfParam:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r4)
            java.lang.String r3 = r13.toString()
            r23 = r3
            java.lang.String r4 = "obj.toString()"
            gy3.C87412m.m108593f(r3, r4)
            r24 = 0
            r25 = 1
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            r36 = 0
            r37 = 22516(0x57f4, float:3.1552E-41)
            r38 = 0
            r21 = r11
            r22 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r3 = 0
            com.tencent.mm.plugin.webview.ui.tools.widget.x r0 = r6.mo8699Ws(r9, r10, r3, r11)
            r1.f168874L = r0
            nj3.f0 r0 = new nj3.f0
            r3 = 0
            r0.<init>(r2, r3, r3)
            android.content.Context r2 = r5.getContext()
            if (r2 == 0) goto L_0x0559
            r3 = 2131827299(0x7f111a63, float:1.9287507E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x055a
        L_0x0559:
            r2 = 0
        L_0x055a:
            r0.f224717i = r2
            r2 = 2131755622(0x7f100266, float:1.9142128E38)
            r0.setIcon((int) r2)
            com.tencent.mm.plugin.webview.ui.tools.widget.x r2 = r1.f168874L
            if (r2 == 0) goto L_0x056b
            r2.mo7525a(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x056b:
            android.content.Context r0 = r5.getContext()
            boolean r2 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r2 == 0) goto L_0x0576
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            goto L_0x0577
        L_0x0576:
            r0 = 0
        L_0x0577:
            if (r0 == 0) goto L_0x0581
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0581
            r0 = 1
            goto L_0x0582
        L_0x0581:
            r0 = 0
        L_0x0582:
            java.lang.String r2 = "dialogScene"
            if (r0 == 0) goto L_0x05a3
            com.tencent.mm.plugin.webview.ui.tools.widget.x r0 = r1.f168874L
            if (r0 == 0) goto L_0x058f
            r0.show()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x058f:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r15]
            r4 = 0
            r3[r4] = r2
            r5 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r3[r5] = r2
            r6 = 27486(0x6b5e, float:3.8516E-41)
            r0.mo160131h(r6, r3)
            goto L_0x05b6
        L_0x05a3:
            r4 = 0
            r5 = 1
            r6 = 27486(0x6b5e, float:3.8516E-41)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r15]
            r3[r4] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r3[r5] = r2
            r0.mo160131h(r6, r3)
        L_0x05b6:
            com.tencent.mm.plugin.webview.ui.tools.widget.x r0 = r1.f168874L
            if (r0 == 0) goto L_0x05c4
            fh1.k1 r2 = new fh1.k1
            r2.<init>()
            r0.mo7528g(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x05c4:
            com.tencent.mm.plugin.webview.ui.tools.widget.x r0 = r1.f168874L
            if (r0 == 0) goto L_0x05d4
            fh1.l1 r2 = new fh1.l1
            r3 = r41
            r2.<init>(r1, r3)
            r0.mo7526c(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x05d4:
            com.tencent.mm.plugin.webview.ui.tools.widget.x r0 = r1.f168874L
            if (r0 == 0) goto L_0x05e2
            fh1.m1 r2 = new fh1.m1
            r2.<init>(r1, r7)
            r0.setOnDismissListener(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x05e2:
            a14.z1 r0 = r1.f168864B
            if (r0 == 0) goto L_0x0611
            r1 = 0
            r2 = 1
            a14.C53973z1.C53974a.m60623a(r0, r1, r2, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0611
        L_0x05ee:
            java.lang.String r0 = "show FullScreenWebView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            T r1 = r7.f27484d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "rawUrl"
            r0.putExtra(r3, r1)
            java.lang.String r1 = "convertActivityFromTranslucent"
            r3 = 1
            r0.putExtra(r1, r3)
            java.lang.String r1 = "webview"
            java.lang.String r3 = ".ui.tools.WebViewUI"
            r4 = 0
            ke3.C88144b.m109791i(r2, r1, r3, r0, r4)
        L_0x0611:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0621
        L_0x0614:
            java.lang.String r0 = "jumpToHalfScreenH5 html5_info is null or url is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x0623
        L_0x061a:
            java.lang.String r0 = "jump mini app not implement"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0621:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0623:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59018f2.m68936m3(fh1.f2, android.content.Context, cj1.c):void");
    }

    /* renamed from: n3 */
    public static final void m68937n3(C59018f2 f2Var, String str, C64331dw0 dw02) {
        ViewGroup viewGroup;
        C59018f2 f2Var2 = f2Var;
        String str2 = str;
        C64331dw0 dw03 = dw02;
        f2Var.getClass();
        Class cls = C58468e0.class;
        if (!TextUtils.isEmpty(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = f2Var2.f168875M.get(dw03.f182876d);
            if (currentTimeMillis - (l != null ? l.longValue() : 0) >= ((long) dw03.f182886q) * 1000 && (viewGroup = f2Var2.f168870H) != null) {
                if (str2 != null) {
                    try {
                        if (((C58468e0) C86312j.m106911c(cls)).mo70776jp(str2) && ((C58468e0) C86312j.m106911c(cls)).mo70774Zw()) {
                            C45520t Q3 = ((C45513i0) C86312j.m106911c(C45513i0.class)).mo70780Q3(MMWebView.C45103b.m49948a(new MutableContextWrapper(viewGroup.getContext())), new C45520t.C45522b((C45520t.C45523c) null, false, false, false, false, 0, false, 105, (C8480h) null), (C13853i) null);
                            String str3 = dw03.f182876d;
                            if (str3 == null) {
                                str3 = "";
                            }
                            f2Var2.f168876N = new C13604l<>(str2, str3);
                            Log.m105924i("Finder.LivePromoteBannerController", "banner cacheInfo set id: " + dw03.f182876d + " url " + str2);
                            C7335d c = C86312j.m106911c(cls);
                            C87412m.m108593f(c, "getService(IWebViewContr…eloadService::class.java)");
                            C87412m.m108593f(Q3, "controller");
                            ((C58468e0) c).mo70772QF(str, Q3, true, -1, -1, 80);
                            HashMap<String, Long> hashMap = f2Var2.f168875M;
                            String str4 = dw03.f182876d;
                            if (str4 == null) {
                                str4 = "";
                            }
                            hashMap.put(str4, Long.valueOf(currentTimeMillis));
                            C115669n nVar = C115669n.INSTANCE;
                            Object[] objArr = new Object[6];
                            String str5 = dw03.f182876d;
                            if (str5 == null) {
                                str5 = "";
                            }
                            objArr[0] = str5;
                            objArr[1] = 0;
                            objArr[2] = 0;
                            objArr[3] = 0;
                            objArr[4] = 0;
                            objArr[5] = 1;
                            nVar.mo160131h(27755, objArr);
                        }
                    } catch (Throwable th) {
                        Log.printErrStackTrace("Finder.LivePromoteBannerController", th, "", new Object[0]);
                        ((C58468e0) C86312j.m106911c(cls)).clear();
                    }
                }
                Log.m105924i("Finder.LivePromoteBannerController", "end load wv");
            }
        }
    }

    /* renamed from: o3 */
    public static final void m68938o3(C59018f2 f2Var, ArrayList arrayList) {
        Context context;
        String str;
        f2Var.getClass();
        if (C32444a.f86084N1.mo60266n().intValue() != 0) {
            Log.m105924i("Finder.LivePromoteBannerController", "fetchSideBarInfo live side bar switch close!");
            C61926c.m72673R(arrayList, C59081t1.f169036d);
            return;
        }
        Log.m105924i("Finder.LivePromoteBannerController", "fetchSideBarInfo, origin size:" + arrayList.size());
        ViewGroup viewGroup = f2Var.f168870H;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            C39622i0 a = C39818r.f106831a.mo62443b(context).mo75002a(C58312g.class);
            C87412m.m108593f(a, "UICProvider.of(it).get(F…veSideBarUIC::class.java)");
            C58312g gVar = (C58312g) a;
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C54741c cVar = (C54741c) it.next();
                NativeInfo nativeInfo = cVar.f153440d.native_info;
                if (nativeInfo != null && nativeInfo.native_type == 9) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("banner necessary_params:");
                    NativeInfo nativeInfo2 = cVar.f153440d.native_info;
                    C46526n3 n3Var = null;
                    sb.append(nativeInfo2 != null ? nativeInfo2.necessary_params : null);
                    Log.m105924i("Finder.LivePromoteBannerController", sb.toString());
                    try {
                        NativeInfo nativeInfo3 = cVar.f153440d.native_info;
                        if (nativeInfo3 == null || (str = nativeInfo3.necessary_params) == null) {
                            str = "";
                        }
                        C89349b i = C61937h.m72710i(Base64.decode(new JSONObject(str).optString("last_buffer"), 0));
                        FinderLivePresenter finderLivePresenter = gVar.f166969g;
                        if (finderLivePresenter != null) {
                            n3Var = finderLivePresenter.mo77505n(i);
                        }
                        if (n3Var != null) {
                            hashMap.put(n3Var, new C59083u1(cVar, arrayList2));
                        } else {
                            Log.m105928w("Finder.LivePromoteBannerController", "invalid banner info");
                            arrayList2.add(cVar);
                        }
                    } catch (Throwable th) {
                        Log.printErrStackTrace("Finder.LivePromoteBannerController", th, "", new Object[0]);
                        arrayList2.add(cVar);
                    }
                }
            }
            if (hashMap.size() > 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("begin call netscene, size:");
                sb4.append(hashMap.size());
                sb4.append(", hashCodes:");
                Set<C117747y> keySet = hashMap.keySet();
                C87412m.m108593f(keySet, "netSceneMap.keys");
                ArrayList arrayList3 = new ArrayList(C36907w.m41090l(keySet, 10));
                for (C117747y hashCode : keySet) {
                    arrayList3.add(Integer.valueOf(hashCode.hashCode()));
                }
                sb4.append(C110818d0.m150921S(arrayList3, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
                Log.m105924i("Finder.LivePromoteBannerController", sb4.toString());
                CountDownLatch countDownLatch = new CountDownLatch(hashMap.size());
                C59086v1 v1Var = new C59086v1(hashMap, countDownLatch);
                C86709a0.m107524d().mo123455a(6479, v1Var);
                Set<C117747y> keySet2 = hashMap.keySet();
                C87412m.m108593f(keySet2, "netSceneMap.keys");
                for (C117747y f : keySet2) {
                    C86709a0.m107524d().mo123460f(f);
                }
                countDownLatch.await();
                C86709a0.m107524d().mo123470p(6479, v1Var);
                Log.m105924i("Finder.LivePromoteBannerController", "finish call netscene");
            }
            Log.m105924i("Finder.LivePromoteBannerController", "invalid size:" + arrayList2.size());
            arrayList.removeAll(arrayList2);
        }
    }

    /* renamed from: I3 */
    public final void mo84241I3(C54741c cVar) {
        String str;
        C64331dw0 dw02;
        if (cVar == null || (dw02 = cVar.f153444h) == null || (str = dw02.f182876d) == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str) && !this.f168890z.contains(str)) {
            boolean z = true;
            String L3 = mo84244L3(cVar, 1);
            ViewGroup viewGroup = this.f168870H;
            if (viewGroup == null || viewGroup.getVisibility() != 8) {
                z = false;
            }
            if (z && f168861T == 65535 && TextUtils.isEmpty(this.f168883s)) {
                Log.m105924i("Finder.LivePromoteBannerController", "reportBannerAction 1");
                mo84248P3(L3);
                this.f168890z.add(str);
            } else if (TextUtils.isEmpty(this.f168883s)) {
                Log.m105924i("Finder.LivePromoteBannerController", "reportBannerAction 2");
                mo84248P3(L3);
                this.f168890z.add(str);
            } else if (!C112551y.m153810j(this.f168883s, str, false, 2, (Object) null)) {
                Log.m105924i("Finder.LivePromoteBannerController", "reportBannerAction 3");
                mo84248P3(L3);
                this.f168890z.add(str);
            }
        }
    }

    /* renamed from: J3 */
    public final String mo84242J3(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        jSONObject.putOpt("bannerid", str);
        jSONObject.putOpt("type", Integer.valueOf(i));
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "obj.toString()");
        return jSONObject2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r4.f153444h;
     */
    /* renamed from: K3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo84243K3(cj1.C54741c r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L_0x000e
            te3.dw0 r2 = r4.f153444h
            if (r2 == 0) goto L_0x000e
            int r2 = r2.f182891v
            if (r2 != r1) goto L_0x000e
            r2 = 1
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            if (r2 == 0) goto L_0x0022
            if (r4 == 0) goto L_0x001d
            te3.dw0 r2 = r4.f153444h
            if (r2 == 0) goto L_0x001d
            int r2 = r2.f182877e
            if (r2 != r1) goto L_0x001d
            r2 = 1
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            if (r2 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0041
        L_0x0022:
            if (r4 == 0) goto L_0x002e
            te3.dw0 r2 = r4.f153444h
            if (r2 == 0) goto L_0x002e
            int r2 = r2.f182891v
            if (r2 != r1) goto L_0x002e
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            if (r2 == 0) goto L_0x0033
            r1 = 3
            goto L_0x0041
        L_0x0033:
            if (r4 == 0) goto L_0x003e
            te3.dw0 r4 = r4.f153444h
            if (r4 == 0) goto L_0x003e
            int r4 = r4.f182877e
            if (r4 != r1) goto L_0x003e
            r0 = 1
        L_0x003e:
            if (r0 == 0) goto L_0x0041
            r1 = 2
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59018f2.mo84243K3(cj1.c):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r8.f153440d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008e A[ADDED_TO_REGION] */
    /* renamed from: L3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo84244L3(cj1.C54741c r8, int r9) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x000f
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r8.f153440d
            if (r2 == 0) goto L_0x000f
            int r2 = r2.jumpinfo_type
            r3 = 3
            if (r2 != r3) goto L_0x000f
            r2 = 1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            if (r2 == 0) goto L_0x0025
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r8.f153440d
            com.tencent.mm.protocal.protobuf.NativeInfo r2 = r2.native_info
            if (r2 == 0) goto L_0x0020
            int r2 = r2.native_type
            r3 = 29
            if (r2 != r3) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            if (r2 == 0) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r3 = 0
            if (r2 == 0) goto L_0x008e
            java.lang.String r2 = ""
            if (r8 == 0) goto L_0x0039
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r8.f153440d
            if (r4 == 0) goto L_0x0039
            com.tencent.mm.protocal.protobuf.NativeInfo r4 = r4.native_info
            if (r4 == 0) goto L_0x0039
            java.lang.String r4 = r4.necessary_params
            if (r4 != 0) goto L_0x003a
        L_0x0039:
            r4 = r2
        L_0x003a:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r4
            java.lang.String r5 = "Finder.LivePromoteBannerController"
            java.lang.String r6 = "jump native necessary_params:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r0)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004b }
            r0.<init>(r4)     // Catch:{ JSONException -> 0x004b }
            goto L_0x0052
        L_0x004b:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r2, r1)
            r0 = r3
        L_0x0052:
            if (r0 == 0) goto L_0x005b
            java.lang.String r1 = "queryWord"
            java.lang.String r0 = r0.optString(r1, r2)
            goto L_0x005c
        L_0x005b:
            r0 = r3
        L_0x005c:
            if (r0 != 0) goto L_0x005f
            r0 = r2
        L_0x005f:
            if (r8 == 0) goto L_0x0067
            te3.dw0 r8 = r8.f153444h
            if (r8 == 0) goto L_0x0067
            java.lang.String r3 = r8.f182876d
        L_0x0067:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            if (r3 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            java.lang.String r1 = "bannerid"
            r8.putOpt(r1, r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r1 = "type"
            r8.putOpt(r1, r9)
            java.lang.String r9 = "search_word"
            r8.putOpt(r9, r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "obj.toString()"
            gy3.C87412m.m108593f(r8, r9)
            goto L_0x009a
        L_0x008e:
            if (r8 == 0) goto L_0x0096
            te3.dw0 r8 = r8.f153444h
            if (r8 == 0) goto L_0x0096
            java.lang.String r3 = r8.f182876d
        L_0x0096:
            java.lang.String r8 = r7.mo84242J3(r3, r9)
        L_0x009a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59018f2.mo84244L3(cj1.c, int):java.lang.String");
    }

    /* renamed from: M3 */
    public final boolean mo84245M3(C54741c cVar) {
        String str;
        boolean z;
        C64331dw0 dw02 = cVar != null ? cVar.f153444h : null;
        C33341d dVar = (C33341d) ((C36570n) ((C60106t) C86312j.m106911c(C60106t.class)).f171521u).getValue();
        if (dw02 == null || (str = dw02.f182876d) == null) {
            str = "";
        }
        dVar.getClass();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (dVar.f90381f.contains(str)) {
            return true;
        }
        synchronized (dVar) {
            C33317c cVar2 = new C33317c();
            cVar2.field_dislikeBannerId = str;
            z = dVar.get(cVar2, new String[0]);
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r5.f153440d;
     */
    /* renamed from: N3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo84246N3(cj1.C54741c r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x000f
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r5.f153440d
            if (r2 == 0) goto L_0x000f
            int r2 = r2.jumpinfo_type
            r3 = 3
            if (r2 != r3) goto L_0x000f
            r2 = 1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            if (r2 == 0) goto L_0x003c
            if (r5 == 0) goto L_0x0023
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r5.f153440d
            if (r2 == 0) goto L_0x0023
            com.tencent.mm.protocal.protobuf.NativeInfo r2 = r2.native_info
            if (r2 == 0) goto L_0x0023
            int r2 = r2.native_type
            r3 = 5
            if (r2 != r3) goto L_0x0023
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            if (r2 != 0) goto L_0x003d
            if (r5 == 0) goto L_0x0038
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r5 = r5.f153440d
            if (r5 == 0) goto L_0x0038
            com.tencent.mm.protocal.protobuf.NativeInfo r5 = r5.native_info
            if (r5 == 0) goto L_0x0038
            int r5 = r5.native_type
            r2 = 9
            if (r5 != r2) goto L_0x0038
            r5 = 1
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59018f2.mo84246N3(cj1.c):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.util.ArrayList<jq3.c>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.util.Iterator<jq3.c>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: cj1.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: jq3.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: cj1.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: cj1.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: cj1.c} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004e A[SYNTHETIC] */
    /* renamed from: O3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84247O3() {
        /*
            r9 = this;
            java.util.ArrayList<jq3.c> r0 = r9.f168889y
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x004f
            java.lang.Object r1 = r0.next()
            r5 = r1
            jq3.c r5 = (jq3.C9493c) r5
            boolean r6 = r5 instanceof cj1.C54741c
            if (r6 == 0) goto L_0x001e
            r7 = r5
            cj1.c r7 = (cj1.C54741c) r7
            goto L_0x001f
        L_0x001e:
            r7 = r2
        L_0x001f:
            if (r7 == 0) goto L_0x002c
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r7 = r7.f153440d
            if (r7 == 0) goto L_0x002c
            int r7 = r7.jumpinfo_type
            r8 = 3
            if (r7 != r8) goto L_0x002c
            r7 = 1
            goto L_0x002d
        L_0x002c:
            r7 = 0
        L_0x002d:
            if (r7 == 0) goto L_0x004b
            if (r6 == 0) goto L_0x0034
            r2 = r5
            cj1.c r2 = (cj1.C54741c) r2
        L_0x0034:
            if (r2 == 0) goto L_0x0046
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r2.f153440d
            if (r2 == 0) goto L_0x0046
            com.tencent.mm.protocal.protobuf.NativeInfo r2 = r2.native_info
            if (r2 == 0) goto L_0x0046
            int r2 = r2.native_type
            r5 = 29
            if (r2 != r5) goto L_0x0046
            r2 = 1
            goto L_0x0047
        L_0x0046:
            r2 = 0
        L_0x0047:
            if (r2 == 0) goto L_0x004b
            r2 = 1
            goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            if (r2 == 0) goto L_0x0006
            r2 = r1
        L_0x004f:
            if (r2 == 0) goto L_0x0052
            r3 = 1
        L_0x0052:
            if (r3 == 0) goto L_0x005f
            java.lang.Class<c00.n> r0 = c00.C0405n.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            c00.n r0 = (c00.C0405n) r0
            r0.mo278ce()
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59018f2.mo84247O3():void");
    }

    /* renamed from: P3 */
    public final void mo84248P3(String str) {
        Log.m105925i("Finder.LivePromoteBannerController", "reportBannerAction  result:%s", str);
        if (C62042e.f176370a.mo87027N0()) {
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.PROMOTE_BANNER, str, (String) null, 4, (Object) null);
            return;
        }
        C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
        wVar.getClass();
        C87412m.m108594g(str, "actionResult");
        C54116w.Ex0(wVar, C54067f0.C54076o0.PROMOTE_BANNER, str, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    /* renamed from: Q3 */
    public final void mo84249Q3() {
        FinderJumpInfo finderJumpInfo;
        FinderJumpInfo finderJumpInfo2;
        if (this.f168882r != null) {
            Iterator<C9493c> it = this.f168889y.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                C9493c next = it.next();
                String str = null;
                C54741c cVar = next instanceof C54741c ? (C54741c) next : null;
                String str2 = (cVar == null || (finderJumpInfo2 = cVar.f153440d) == null) ? null : finderJumpInfo2.ext_info;
                C9493c cVar2 = this.f168882r;
                C54741c cVar3 = cVar2 instanceof C54741c ? (C54741c) cVar2 : null;
                if (!(cVar3 == null || (finderJumpInfo = cVar3.f153440d) == null)) {
                    str = finderJumpInfo.ext_info;
                }
                if (C87412m.m108589b(str2, str)) {
                    break;
                }
                i++;
            }
            this.f168884t = i;
            if (i == -1) {
                this.f168884t = 0;
            }
        } else {
            this.f168884t = 0;
        }
        if (this.f168889y.size() > 0) {
            int size = this.f168884t + (1073741823 - (1073741823 % this.f168889y.size()));
            this.f168884t = size;
            RecyclerHorizontalViewPager recyclerHorizontalViewPager = this.f168878n;
            if (recyclerHorizontalViewPager != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(size));
                RecyclerHorizontalViewPager recyclerHorizontalViewPager2 = recyclerHorizontalViewPager;
                C117292a.m165358d(recyclerHorizontalViewPager2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController", "setCurrentBannerIndex", "()V", "Undefined", "scrollToPosition", "(I)V");
                recyclerHorizontalViewPager.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerHorizontalViewPager2, "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController", "setCurrentBannerIndex", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
            Log.m105924i("Finder.LivePromoteBannerController", "loop start index " + this.f168884t);
            ArrayList<C9493c> arrayList = this.f168889y;
            this.f168882r = arrayList.get(this.f168884t % arrayList.size());
            RecyclerHorizontalViewPager recyclerHorizontalViewPager3 = this.f168878n;
            if (recyclerHorizontalViewPager3 != null) {
                recyclerHorizontalViewPager3.setVisibility(0);
                return;
            }
            return;
        }
        RecyclerHorizontalViewPager recyclerHorizontalViewPager4 = this.f168878n;
        if (recyclerHorizontalViewPager4 != null) {
            recyclerHorizontalViewPager4.setVisibility(8);
        }
    }

    /* renamed from: R3 */
    public final void mo84250R3() {
        C53973z1 z1Var = this.f168864B;
        C53973z1 z1Var2 = null;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        if (this.f168889y.size() <= 1) {
            RecyclerHorizontalViewPager recyclerHorizontalViewPager = this.f168878n;
            if (recyclerHorizontalViewPager != null) {
                recyclerHorizontalViewPager.setFrozeTouch(true);
            }
            this.f168864B = null;
            return;
        }
        C3206b2 b2Var = this.f27261e;
        C56032b bVar = b2Var instanceof C56032b ? (C56032b) b2Var : null;
        if (bVar != null) {
            z1Var2 = C11207i.m11070f(bVar, C53872d1.f151119c, (C53934p0) null, new C59023c(this, (C15601d<? super C59023c>) null), 2, (Object) null);
        }
        this.f168864B = z1Var2;
    }

    /* renamed from: T3 */
    public final void mo84251T3() {
        if (this.f168880p) {
            Log.m105924i("Finder.LivePromoteBannerController", "startPollingBannerData is done");
        } else if (!this.f168888x.isEmpty()) {
            Log.m105924i("Finder.LivePromoteBannerController", "bannerJumpInfosList is not empty, return");
        } else {
            Log.m105924i("Finder.LivePromoteBannerController", "startPollingBannerData");
            this.f168880p = true;
            C50149km1 km12 = new C50149km1();
            FinderLiveService.f159376d.getClass();
            FinderLiveService.f159383n.mo75799e(3, km12, new C59025d(this, C50285lm1.class), false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:282:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x04d1  */
    /* renamed from: U3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84252U3() {
        /*
            r16 = this;
            r1 = r16
            java.lang.Class<ak1.o> r2 = ak1.C54108o.class
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            boolean r3 = r1.f168881q
            r4 = 8
            if (r3 == 0) goto L_0x001b
            java.lang.String r3 = "Finder.LivePromoteBannerController"
            java.lang.String r5 = "banner is closed by user"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            com.tencent.mm.view.RecyclerHorizontalViewPager r3 = r1.f168878n
            if (r3 != 0) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            r3.setVisibility(r4)
        L_0x001b:
            androidx.lifecycle.i0 r3 = r1.business(r0)
            cl1.o r3 = (cl1.C54991o) r3
            java.util.ArrayList<jq3.c> r3 = r3.f154211I1
            int r3 = r3.size()
            r5 = 0
            if (r3 != 0) goto L_0x004c
            java.lang.String r0 = "Finder.LivePromoteBannerController"
            java.lang.String r2 = "bannerInfo from back is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.util.ArrayList<jq3.c> r0 = r1.f168889y
            r0.clear()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<jq3.c> r0 = r1.f168879o
            if (r0 == 0) goto L_0x003d
            r0.notifyDataSetChanged()
        L_0x003d:
            java.util.ArrayList<jq3.c> r0 = r1.f168888x
            r0.clear()
            r1.f168863A = r5
            gh1.p r0 = r1.f168871I
            if (r0 == 0) goto L_0x004b
            r0.mo84560c(r4)
        L_0x004b:
            return
        L_0x004c:
            jq3.c r3 = r1.f168882r
            boolean r6 = r3 instanceof cj1.C54741c
            if (r6 == 0) goto L_0x0055
            cj1.c r3 = (cj1.C54741c) r3
            goto L_0x0056
        L_0x0055:
            r3 = r5
        L_0x0056:
            if (r3 == 0) goto L_0x0063
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r3.f153440d
            if (r3 == 0) goto L_0x0063
            int r3 = r3.ext_type
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0064
        L_0x0063:
            r3 = r5
        L_0x0064:
            jq3.c r6 = r1.f168882r
            boolean r7 = r6 instanceof cj1.C54741c
            if (r7 == 0) goto L_0x006d
            cj1.c r6 = (cj1.C54741c) r6
            goto L_0x006e
        L_0x006d:
            r6 = r5
        L_0x006e:
            r1.mo84241I3(r6)
            r6 = 1
            if (r3 != 0) goto L_0x0075
            goto L_0x0094
        L_0x0075:
            int r3 = r3.intValue()
            if (r3 != r6) goto L_0x0094
            wg1.r1 r3 = wg1.C15346r1.f41686a
            jq3.c r7 = r1.f168882r
            boolean r8 = r7 instanceof cj1.C54741c
            if (r8 == 0) goto L_0x0086
            cj1.c r7 = (cj1.C54741c) r7
            goto L_0x0087
        L_0x0086:
            r7 = r5
        L_0x0087:
            if (r7 == 0) goto L_0x0090
            te3.dw0 r7 = r7.f153444h
            if (r7 == 0) goto L_0x0090
            java.lang.String r7 = r7.f182876d
            goto L_0x0091
        L_0x0090:
            r7 = r5
        L_0x0091:
            r3.mo14181a(r6, r7)
        L_0x0094:
            androidx.lifecycle.i0 r3 = r1.business(r0)
            cl1.o r3 = (cl1.C54991o) r3
            java.util.ArrayList<jq3.c> r3 = r3.f154211I1
            java.util.ArrayList<jq3.c> r7 = r1.f168888x
            boolean r8 = r3.isEmpty()
            if (r8 != 0) goto L_0x017e
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x00ac
            goto L_0x017e
        L_0x00ac:
            int r8 = r3.size()
            int r10 = r7.size()
            if (r8 == r10) goto L_0x00b8
            goto L_0x017e
        L_0x00b8:
            java.util.Iterator r7 = r7.iterator()
            r8 = 0
        L_0x00bd:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x017c
            java.lang.Object r10 = r7.next()
            int r11 = r8 + 1
            if (r8 < 0) goto L_0x0178
            jq3.c r10 = (jq3.C9493c) r10
            boolean r12 = r10 instanceof cj1.C54741c
            if (r12 == 0) goto L_0x00d4
            cj1.c r10 = (cj1.C54741c) r10
            goto L_0x00d5
        L_0x00d4:
            r10 = r5
        L_0x00d5:
            java.lang.Object r12 = r3.get(r8)
            boolean r13 = r12 instanceof cj1.C54741c
            if (r13 == 0) goto L_0x00e0
            cj1.c r12 = (cj1.C54741c) r12
            goto L_0x00e1
        L_0x00e0:
            r12 = r5
        L_0x00e1:
            if (r12 == 0) goto L_0x00e6
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r13 = r12.f153440d
            goto L_0x00e7
        L_0x00e6:
            r13 = r5
        L_0x00e7:
            if (r13 == 0) goto L_0x017e
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r13 = r12.f153440d
            java.lang.String r13 = r13.ext_info
            if (r13 == 0) goto L_0x017e
            if (r10 == 0) goto L_0x00f4
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r13 = r10.f153440d
            goto L_0x00f5
        L_0x00f4:
            r13 = r5
        L_0x00f5:
            if (r13 == 0) goto L_0x017e
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r13 = r10.f153440d
            java.lang.String r13 = r13.ext_info
            if (r13 != 0) goto L_0x00ff
            goto L_0x017e
        L_0x00ff:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "version banner sync v1:"
            r13.append(r14)
            te3.dw0 r14 = r12.f153444h
            if (r14 == 0) goto L_0x0115
            int r14 = r14.f182895z
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x0116
        L_0x0115:
            r14 = r5
        L_0x0116:
            r13.append(r14)
            java.lang.String r14 = ", v2"
            r13.append(r14)
            te3.dw0 r14 = r10.f153444h
            if (r14 == 0) goto L_0x0129
            int r14 = r14.f182895z
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x012a
        L_0x0129:
            r14 = r5
        L_0x012a:
            r13.append(r14)
            java.lang.String r14 = ", wording:"
            r13.append(r14)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r14 = r12.f153440d
            java.lang.String r14 = r14.wording
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "Finder.LivePromoteBannerController"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
            te3.dw0 r13 = r12.f153444h
            if (r13 == 0) goto L_0x0149
            int r14 = r13.f182895z
            goto L_0x014a
        L_0x0149:
            r14 = 0
        L_0x014a:
            te3.dw0 r15 = r10.f153444h
            if (r15 == 0) goto L_0x0151
            int r9 = r15.f182895z
            goto L_0x0152
        L_0x0151:
            r9 = 0
        L_0x0152:
            if (r14 >= r9) goto L_0x016a
            if (r13 == 0) goto L_0x0159
            java.lang.String r9 = r13.f182876d
            goto L_0x015a
        L_0x0159:
            r9 = r5
        L_0x015a:
            if (r15 == 0) goto L_0x015f
            java.lang.String r13 = r15.f182876d
            goto L_0x0160
        L_0x015f:
            r13 = r5
        L_0x0160:
            boolean r9 = gy3.C87412m.m108589b(r9, r13)
            if (r9 == 0) goto L_0x016a
            r3.set(r8, r10)
            goto L_0x0175
        L_0x016a:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r8 = r12.f153440d
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r9 = r10.f153440d
            boolean r8 = r8.compareContent(r9)
            if (r8 != 0) goto L_0x0175
            goto L_0x017e
        L_0x0175:
            r8 = r11
            goto L_0x00bd
        L_0x0178:
            sx3.C64197v.m75542k()
            throw r5
        L_0x017c:
            r9 = 1
            goto L_0x017f
        L_0x017e:
            r9 = 0
        L_0x017f:
            r3 = 9
            if (r9 != 0) goto L_0x0239
            r1.f168863A = r5
            java.util.ArrayList<jq3.c> r7 = r1.f168888x
            r7.clear()
            java.util.ArrayList<jq3.c> r7 = r1.f168888x
            androidx.lifecycle.i0 r0 = r1.business(r0)
            cl1.o r0 = (cl1.C54991o) r0
            java.util.ArrayList<jq3.c> r0 = r0.f154211I1
            r7.addAll(r0)
            java.lang.Object r7 = r1.f168885u
            monitor-enter(r7)
            java.util.ArrayList<jq3.c> r0 = r1.f168889y     // Catch:{ all -> 0x0236 }
            r0.clear()     // Catch:{ all -> 0x0236 }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<jq3.c> r0 = r1.f168879o     // Catch:{ all -> 0x0236 }
            if (r0 == 0) goto L_0x01a6
            r0.notifyDataSetChanged()     // Catch:{ all -> 0x0236 }
        L_0x01a6:
            java.util.ArrayList<jq3.c> r0 = r1.f168888x     // Catch:{ all -> 0x0236 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0236 }
        L_0x01ac:
            boolean r8 = r0.hasNext()     // Catch:{ all -> 0x0236 }
            if (r8 == 0) goto L_0x0202
            java.lang.Object r8 = r0.next()     // Catch:{ all -> 0x0236 }
            jq3.c r8 = (jq3.C9493c) r8     // Catch:{ all -> 0x0236 }
            boolean r9 = r8 instanceof cj1.C54741c     // Catch:{ all -> 0x0236 }
            if (r9 == 0) goto L_0x01bf
            cj1.c r8 = (cj1.C54741c) r8     // Catch:{ all -> 0x0236 }
            goto L_0x01c0
        L_0x01bf:
            r8 = r5
        L_0x01c0:
            boolean r9 = r1.mo84246N3(r8)     // Catch:{ all -> 0x0236 }
            if (r9 == 0) goto L_0x01e0
            if (r8 == 0) goto L_0x01d6
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r9 = r8.f153440d     // Catch:{ all -> 0x0236 }
            if (r9 == 0) goto L_0x01d6
            com.tencent.mm.protocal.protobuf.NativeInfo r9 = r9.native_info     // Catch:{ all -> 0x0236 }
            if (r9 == 0) goto L_0x01d6
            int r9 = r9.native_type     // Catch:{ all -> 0x0236 }
            if (r9 != r3) goto L_0x01d6
            r9 = 1
            goto L_0x01d7
        L_0x01d6:
            r9 = 0
        L_0x01d7:
            if (r9 != 0) goto L_0x01dd
            jq3.c r9 = r1.f168863A     // Catch:{ all -> 0x0236 }
            if (r9 != 0) goto L_0x01ac
        L_0x01dd:
            r1.f168863A = r8     // Catch:{ all -> 0x0236 }
            goto L_0x01ac
        L_0x01e0:
            boolean r9 = r1.mo84245M3(r8)     // Catch:{ all -> 0x0236 }
            if (r9 != 0) goto L_0x01ac
            if (r8 == 0) goto L_0x01ac
            boolean r9 = r1.mo84246N3(r8)     // Catch:{ all -> 0x0236 }
            if (r9 != 0) goto L_0x01ac
            java.util.ArrayList<jq3.c> r9 = r1.f168889y     // Catch:{ all -> 0x0236 }
            r9.add(r8)     // Catch:{ all -> 0x0236 }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<jq3.c> r8 = r1.f168879o     // Catch:{ all -> 0x0236 }
            if (r8 == 0) goto L_0x01ac
            java.util.ArrayList<jq3.c> r9 = r1.f168889y     // Catch:{ all -> 0x0236 }
            int r9 = r9.size()     // Catch:{ all -> 0x0236 }
            int r9 = r9 - r6
            r8.notifyItemInserted(r9)     // Catch:{ all -> 0x0236 }
            goto L_0x01ac
        L_0x0202:
            r16.mo84249Q3()     // Catch:{ all -> 0x0236 }
            r16.mo84247O3()     // Catch:{ all -> 0x0236 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0236 }
            monitor-exit(r7)
            java.lang.String r0 = "Finder.LivePromoteBannerController"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "bannerDataList size: "
            r7.append(r8)
            java.util.ArrayList<jq3.c> r8 = r1.f168888x
            int r8 = r8.size()
            r7.append(r8)
            java.lang.String r8 = ", dataList: "
            r7.append(r8)
            java.util.ArrayList<jq3.c> r8 = r1.f168889y
            int r8 = r8.size()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            goto L_0x0239
        L_0x0236:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0239:
            java.util.ArrayList<jq3.c> r0 = r1.f168889y
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0254
            jq3.c r0 = r1.f168863A
            if (r0 != 0) goto L_0x0254
            java.lang.String r0 = "Finder.LivePromoteBannerController"
            java.lang.String r2 = "bannerInfo from local is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            gh1.p r0 = r1.f168871I
            if (r0 == 0) goto L_0x0253
            r0.mo84560c(r4)
        L_0x0253:
            return
        L_0x0254:
            r16.mo84250R3()
            jq3.c r0 = r1.f168863A
            boolean r7 = r0 instanceof cj1.C54741c
            if (r7 == 0) goto L_0x0261
            r7 = r0
            cj1.c r7 = (cj1.C54741c) r7
            goto L_0x0262
        L_0x0261:
            r7 = r5
        L_0x0262:
            java.lang.Class<pl1.s0> r8 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r9 = ht1.C60200t1.class
            android.view.ViewGroup r10 = r1.f168870H
            r11 = 2131828855(0x7f112077, float:1.9290663E38)
            r12 = 2
            if (r10 == 0) goto L_0x0511
            boolean r13 = r0 instanceof cj1.C54741c
            if (r13 == 0) goto L_0x0275
            cj1.c r0 = (cj1.C54741c) r0
            goto L_0x0276
        L_0x0275:
            r0 = r5
        L_0x0276:
            if (r0 == 0) goto L_0x0286
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r13 = r0.f153440d
            if (r13 == 0) goto L_0x0286
            com.tencent.mm.protocal.protobuf.NativeInfo r13 = r13.native_info
            if (r13 == 0) goto L_0x0286
            int r13 = r13.native_type
            if (r13 != r3) goto L_0x0286
            r3 = 1
            goto L_0x0287
        L_0x0286:
            r3 = 0
        L_0x0287:
            java.lang.String r13 = "Finder.LivePromoteBannerController"
            if (r3 == 0) goto L_0x036f
            boolean r3 = r16.mo9310g3()
            if (r3 == 0) goto L_0x029c
            android.widget.FrameLayout r0 = r1.f168866D
            if (r0 != 0) goto L_0x0297
            goto L_0x0511
        L_0x0297:
            r0.setVisibility(r4)
            goto L_0x0511
        L_0x029c:
            com.tencent.mm.ui.widget.RoundCornerConstraintLayout r3 = r1.f168867E
            if (r3 != 0) goto L_0x02a1
            goto L_0x02a4
        L_0x02a1:
            r3.setVisibility(r4)
        L_0x02a4:
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r3 = r1.f168868F
            r4 = 0
            if (r3 != 0) goto L_0x02aa
            goto L_0x02ad
        L_0x02aa:
            r3.setVisibility(r4)
        L_0x02ad:
            android.widget.FrameLayout r3 = r1.f168866D
            if (r3 != 0) goto L_0x02b2
            goto L_0x02b5
        L_0x02b2:
            r3.setVisibility(r4)
        L_0x02b5:
            android.widget.TextView r3 = r1.f168869G
            if (r3 != 0) goto L_0x02ba
            goto L_0x02d0
        L_0x02ba:
            if (r0 == 0) goto L_0x02c5
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r0.f153440d
            if (r4 == 0) goto L_0x02c5
            java.lang.String r4 = r4.wording
            if (r4 == 0) goto L_0x02c5
            goto L_0x02cd
        L_0x02c5:
            android.content.Context r4 = r10.getContext()
            java.lang.String r4 = r4.getString(r11)
        L_0x02cd:
            r3.setText(r4)
        L_0x02d0:
            android.content.Context r3 = r10.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165307(0x7f07007b, float:1.7944827E38)
            float r3 = r3.getDimension(r4)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r4 = r1.f168868F
            if (r4 == 0) goto L_0x02e6
            r4.mo153905b(r3, r3, r3, r3)
        L_0x02e6:
            if (r0 == 0) goto L_0x02eb
            te3.dw0 r0 = r0.f153444h
            goto L_0x02ec
        L_0x02eb:
            r0 = r5
        L_0x02ec:
            if (r0 == 0) goto L_0x04d4
            int r3 = r0.f182878f
            int r4 = ks3.C61163n.f174123a
            if (r3 != r6) goto L_0x04d4
            int[] r3 = new int[r12]     // Catch:{ all -> 0x0351 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0351 }
            r4.<init>()     // Catch:{ all -> 0x0351 }
            r8 = 35
            r4.append(r8)     // Catch:{ all -> 0x0351 }
            java.lang.String r9 = r0.f182879g     // Catch:{ all -> 0x0351 }
            java.lang.String r14 = "#26000000"
            if (r9 != 0) goto L_0x0307
            r9 = r14
        L_0x0307:
            r4.append(r9)     // Catch:{ all -> 0x0351 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0351 }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ all -> 0x0351 }
            r9 = 0
            r3[r9] = r4     // Catch:{ all -> 0x0351 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0351 }
            r4.<init>()     // Catch:{ all -> 0x0351 }
            r4.append(r8)     // Catch:{ all -> 0x0351 }
            java.lang.String r8 = r0.f182885p     // Catch:{ all -> 0x0351 }
            if (r8 != 0) goto L_0x0328
            java.lang.String r0 = r0.f182879g     // Catch:{ all -> 0x0351 }
            if (r0 != 0) goto L_0x0326
            goto L_0x0329
        L_0x0326:
            r14 = r0
            goto L_0x0329
        L_0x0328:
            r14 = r8
        L_0x0329:
            r4.append(r14)     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0351 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ all -> 0x0351 }
            r3[r6] = r0     // Catch:{ all -> 0x0351 }
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable     // Catch:{ all -> 0x0351 }
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT     // Catch:{ all -> 0x0351 }
            r0.<init>(r4, r3)     // Catch:{ all -> 0x0351 }
            r3 = 0
            r0.setGradientType(r3)     // Catch:{ all -> 0x0351 }
            r3 = 128(0x80, float:1.794E-43)
            r0.setAlpha(r3)     // Catch:{ all -> 0x0351 }
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r3 = r1.f168868F     // Catch:{ all -> 0x0351 }
            if (r3 != 0) goto L_0x034c
            goto L_0x04d4
        L_0x034c:
            r3.setBackground(r0)     // Catch:{ all -> 0x0351 }
            goto L_0x04d4
        L_0x0351:
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r0 = r1.f168868F
            if (r0 == 0) goto L_0x0368
            android.content.Context r3 = r10.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131099661(0x7f06000d, float:1.7811682E38)
            int r3 = r3.getColor(r4)
            r0.setBackgroundColor(r3)
        L_0x0368:
            java.lang.String r0 = "color invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            goto L_0x04d4
        L_0x036f:
            if (r0 == 0) goto L_0x037c
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r0.f153440d
            if (r3 == 0) goto L_0x037c
            int r3 = r3.jumpinfo_type
            r14 = 3
            if (r3 != r14) goto L_0x037c
            r3 = 1
            goto L_0x037d
        L_0x037c:
            r3 = 0
        L_0x037d:
            if (r3 != 0) goto L_0x038a
            android.widget.FrameLayout r0 = r1.f168866D
            if (r0 != 0) goto L_0x0385
            goto L_0x04d4
        L_0x0385:
            r0.setVisibility(r4)
            goto L_0x04d4
        L_0x038a:
            if (r0 == 0) goto L_0x038f
            te3.dw0 r3 = r0.f153444h
            goto L_0x0390
        L_0x038f:
            r3 = r5
        L_0x0390:
            if (r0 == 0) goto L_0x0399
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r14 = r0.f153440d
            if (r14 == 0) goto L_0x0399
            java.lang.String r14 = r14.icon_url
            goto L_0x039a
        L_0x0399:
            r14 = r5
        L_0x039a:
            com.tencent.mm.ui.widget.RoundCornerConstraintLayout r15 = r1.f168867E
            if (r15 == 0) goto L_0x03a8
            r5 = 2131304026(0x7f091e5a, float:1.8226183E38)
            android.view.View r5 = r15.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L_0x03a9
        L_0x03a8:
            r5 = 0
        L_0x03a9:
            if (r5 == 0) goto L_0x03ba
            android.content.Context r15 = r10.getContext()
            r11 = 1094713344(0x41400000, float:12.0)
            int r11 = kg3.C76577a.m92150a(r15, r11)
            float r11 = (float) r11
            r15 = 0
            r5.setTextSize(r15, r11)
        L_0x03ba:
            com.tencent.mm.ui.widget.RoundCornerConstraintLayout r11 = r1.f168867E
            if (r11 == 0) goto L_0x03c8
            r15 = 2131315891(0x7f094cb3, float:1.8250248E38)
            android.view.View r11 = r11.findViewById(r15)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            goto L_0x03c9
        L_0x03c8:
            r11 = 0
        L_0x03c9:
            if (r5 == 0) goto L_0x03d0
            java.lang.CharSequence r15 = r5.getText()
            goto L_0x03d1
        L_0x03d0:
            r15 = 0
        L_0x03d1:
            if (r0 == 0) goto L_0x03da
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r0.f153440d
            if (r4 == 0) goto L_0x03da
            java.lang.String r4 = r4.wording
            goto L_0x03db
        L_0x03da:
            r4 = 0
        L_0x03db:
            boolean r4 = gy3.C87412m.m108589b(r15, r4)
            if (r4 != 0) goto L_0x03f1
            if (r5 != 0) goto L_0x03e4
            goto L_0x03f1
        L_0x03e4:
            if (r0 == 0) goto L_0x03ed
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r0.f153440d
            if (r4 == 0) goto L_0x03ed
            java.lang.String r4 = r4.wording
            goto L_0x03ee
        L_0x03ed:
            r4 = 0
        L_0x03ee:
            r5.setText(r4)
        L_0x03f1:
            if (r3 == 0) goto L_0x03fb
            int r3 = r3.f182878f
            int r4 = ks3.C61163n.f174123a
            if (r3 != r12) goto L_0x03fb
            r3 = 1
            goto L_0x03fc
        L_0x03fb:
            r3 = 0
        L_0x03fc:
            if (r3 == 0) goto L_0x0431
            if (r11 == 0) goto L_0x042a
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r4 = r3.mo62446e(r9)
            bl3.c r4 = r4.mo62447c(r8)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11871f2()
            pl1.n0 r5 = new pl1.n0
            up1.y r15 = up1.C27696y.THUMB_IMAGE
            r5.<init>(r14, r15)
            pl1.e0$a r14 = pl1.C11978e0.C11979a.DEFAULT
            bl3.r$a r3 = r3.mo62446e(r9)
            bl3.c r3 = r3.mo62447c(r8)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r3 = r3.mo11867O2(r14)
            r4.mo85957c(r5, r11, r3)
        L_0x042a:
            if (r11 != 0) goto L_0x042d
            goto L_0x0431
        L_0x042d:
            r3 = 0
            r11.setVisibility(r3)
        L_0x0431:
            com.tencent.mm.ui.widget.RoundCornerConstraintLayout r3 = r1.f168867E
            if (r3 == 0) goto L_0x043d
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x043d
            r3 = 1
            goto L_0x043e
        L_0x043d:
            r3 = 0
        L_0x043e:
            if (r3 != 0) goto L_0x04b9
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0450
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r0.f153440d
            if (r0 == 0) goto L_0x0450
            com.tencent.mm.protocal.protobuf.NativeInfo r0 = r0.native_info
            if (r0 == 0) goto L_0x0450
            java.lang.String r0 = r0.necessary_params
            if (r0 != 0) goto L_0x0451
        L_0x0450:
            r0 = r3
        L_0x0451:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r5 = 0
            r4[r5] = r0
            java.lang.String r5 = "jump native necessary_params:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r5, r4)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0463 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x0463 }
            r0 = r4
            r4 = 0
            goto L_0x046b
        L_0x0463:
            r0 = move-exception
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r3, r5)
            r0 = 0
        L_0x046b:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r0 == 0) goto L_0x047e
            java.lang.String r5 = "selectTabId"
            int r0 = r0.optInt(r5, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x047f
        L_0x047e:
            r0 = 0
        L_0x047f:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "tab_id"
            r3.put(r4, r0)
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            androidx.lifecycle.i0 r0 = r1.business(r0)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            long r4 = r0.f182392d
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "liveid"
            r3.put(r4, r0)
            boolean r0 = r16.mo9310g3()
            if (r0 == 0) goto L_0x04a7
            java.lang.String r0 = "2"
            goto L_0x04a9
        L_0x04a7:
            java.lang.String r0 = "1"
        L_0x04a9:
            java.lang.String r4 = "screen_type"
            r3.put(r4, r0)
            di3.d r0 = di3.C86312j.m106911c(r2)
            ak1.o r0 = (ak1.C54108o) r0
            ak1.f0$n r4 = ak1.C54067f0.C0066n.LIVE_PAGE_BANNER
            r0.mo9602Jz(r4, r3)
        L_0x04b9:
            com.tencent.mm.ui.widget.RoundCornerConstraintLayout r0 = r1.f168867E
            r3 = 0
            if (r0 != 0) goto L_0x04bf
            goto L_0x04c2
        L_0x04bf:
            r0.setVisibility(r3)
        L_0x04c2:
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r0 = r1.f168868F
            if (r0 != 0) goto L_0x04c7
            goto L_0x04cc
        L_0x04c7:
            r4 = 8
            r0.setVisibility(r4)
        L_0x04cc:
            android.widget.FrameLayout r0 = r1.f168866D
            if (r0 != 0) goto L_0x04d1
            goto L_0x04d4
        L_0x04d1:
            r0.setVisibility(r3)
        L_0x04d4:
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            boolean r3 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L_0x04df
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            goto L_0x04e0
        L_0x04df:
            r0 = 0
        L_0x04e0:
            if (r0 == 0) goto L_0x0511
            boolean r3 = r16.mo9310g3()
            if (r3 == 0) goto L_0x04f8
            android.content.Context r3 = r10.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165351(0x7f0700a7, float:1.7944917E38)
            float r3 = r3.getDimension(r4)
            goto L_0x0507
        L_0x04f8:
            android.content.Context r3 = r10.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165324(0x7f07008c, float:1.7944862E38)
            float r3 = r3.getDimension(r4)
        L_0x0507:
            int r3 = (int) r3
            r0.setMarginEnd(r3)
            int r3 = r0.getMarginEnd()
            r0.rightMargin = r3
        L_0x0511:
            gh1.p r0 = r1.f168871I
            if (r0 == 0) goto L_0x0519
            r3 = 0
            r0.mo84560c(r3)
        L_0x0519:
            android.view.ViewGroup r0 = r1.f168870H
            if (r0 == 0) goto L_0x07fc
            bl3.r r3 = bl3.C39818r.f106831a
            android.content.Context r0 = r0.getContext()
            java.lang.String r4 = "it.context"
            gy3.C87412m.m108593f(r0, r4)
            bl3.r$a r0 = r3.mo62443b(r0)
            java.lang.Class<dk1.g> r3 = dk1.C58312g.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r3)
            java.lang.String r3 = "UICProvider.of(it.contex…veSideBarUIC::class.java)"
            gy3.C87412m.m108593f(r0, r3)
            dk1.g r0 = (dk1.C58312g) r0
            boolean r3 = r0.f166967e
            if (r3 != 0) goto L_0x07fc
            if (r7 == 0) goto L_0x0548
            java.util.ArrayList<al1.h> r3 = r7.f153441e
            if (r3 == 0) goto L_0x0548
            int r3 = r3.size()
            goto L_0x0549
        L_0x0548:
            r3 = 0
        L_0x0549:
            if (r3 <= 0) goto L_0x07ca
            boolean r3 = r16.mo9310g3()
            if (r3 != 0) goto L_0x07ca
            java.lang.String r3 = "Finder.LivePromoteBannerController"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "mount, sideBarList size:"
            r4.append(r5)
            if (r7 == 0) goto L_0x056c
            java.util.ArrayList<al1.h> r5 = r7.f153441e
            if (r5 == 0) goto L_0x056c
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x056d
        L_0x056c:
            r5 = 0
        L_0x056d:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.plugin.finder.live.view.b2 r3 = r1.f27261e
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout
            if (r4 == 0) goto L_0x0580
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r3 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) r3
            goto L_0x0581
        L_0x0580:
            r3 = 0
        L_0x0581:
            if (r3 == 0) goto L_0x07fc
            al1.h r3 = r3.getData()
            if (r3 == 0) goto L_0x07fc
            if (r7 == 0) goto L_0x074e
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r4.getClass()
            com.tencent.mm.plugin.finder.live.view.b r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r4 == 0) goto L_0x0599
            al1.h r4 = r4.getData()
            goto L_0x059a
        L_0x0599:
            r4 = 0
        L_0x059a:
            boolean r4 = gy3.C87412m.m108589b(r3, r4)
            java.lang.String r5 = "mountId: "
            if (r4 != 0) goto L_0x05ca
            java.lang.String r4 = r0.f166966d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = ", curId: "
            r6.append(r3)
            com.tencent.mm.plugin.finder.live.view.b r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r3 == 0) goto L_0x05bd
            al1.h r5 = r3.getData()
            goto L_0x05be
        L_0x05bd:
            r5 = 0
        L_0x05be:
            r6.append(r5)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            goto L_0x074e
        L_0x05ca:
            java.lang.String r4 = r0.f166966d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r3)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            cj1.d r4 = cj1.C54745d.f153453a
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r5 = r7.f153440d
            java.lang.String r5 = r5.ext_info
            te3.dw0 r4 = r4.mo75642b(r5)
            dk1.g$a r5 = new dk1.g$a
            r8 = -1
            if (r4 == 0) goto L_0x05f0
            int r4 = r4.f182880h
            goto L_0x05f1
        L_0x05f0:
            r4 = -1
        L_0x05f1:
            r5.<init>(r4)
            r0.f166971i = r5
            java.lang.String r4 = r0.f166966d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "report init reporter. "
            r5.append(r9)
            dk1.g$a r9 = r0.f166971i
            int r9 = r9.f166972a
            r5.append(r9)
            java.lang.String r9 = ", hashCode:"
            r5.append(r9)
            dk1.g$a r9 = r0.f166971i
            int r9 = r9.hashCode()
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            java.util.LinkedList<cj1.c> r4 = r0.f166970h
            r4.clear()
            java.util.LinkedList<cj1.c> r4 = r0.f166970h
            r4.add(r7)
            java.util.ArrayList<al1.h> r4 = r7.f153441e
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L_0x062f:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0650
            java.lang.Object r9 = r4.next()
            al1.h r9 = (al1.C54127h) r9
            com.tencent.mm.live.api.LiveConfig r9 = r9.f151977d
            long r9 = r9.f157064e
            com.tencent.mm.live.api.LiveConfig r11 = r3.f151977d
            long r13 = r11.f157064e
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x0649
            r9 = 1
            goto L_0x064a
        L_0x0649:
            r9 = 0
        L_0x064a:
            if (r9 == 0) goto L_0x064d
            goto L_0x0651
        L_0x064d:
            int r5 = r5 + 1
            goto L_0x062f
        L_0x0650:
            r5 = -1
        L_0x0651:
            if (r5 >= 0) goto L_0x0659
            java.util.ArrayList<al1.h> r4 = r7.f153441e
            r5 = 0
            r4.add(r5, r3)
        L_0x0659:
            com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r4 = r0.f166968f
            if (r4 == 0) goto L_0x074e
            java.util.ArrayList<al1.h> r5 = r7.f153441e
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r7 = r7.f153440d
            java.lang.String r7 = r7.wording
            if (r7 != 0) goto L_0x0670
            android.app.Activity r7 = r0.getContext()
            r9 = 2131828855(0x7f112077, float:1.9290663E38)
            java.lang.String r7 = r7.getString(r9)
        L_0x0670:
            java.lang.String r9 = "bannerJumpInfo.data.word…ive_sidebar_default_tips)"
            gy3.C87412m.m108593f(r7, r9)
            java.lang.String r9 = "dataList"
            gy3.C87412m.m108594g(r5, r9)
            java.lang.String r9 = r4.f159510b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "mount curLive:"
            r10.append(r11)
            com.tencent.mm.live.api.LiveConfig r11 = r3.f151977d
            long r13 = r11.f157064e
            java.lang.String r11 = o40.C61926c.m72691p(r13)
            r10.append(r11)
            java.lang.String r11 = ", dataList:"
            r10.append(r11)
            int r11 = r5.size()
            r10.append(r11)
            java.lang.String r11 = ", title:"
            r10.append(r11)
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            java.util.ArrayList<dk1.a> r9 = r4.f159517i
            r9.clear()
            r9 = 0
            r4.f159518j = r9
            java.util.ArrayList<dk1.a> r9 = r4.f159517i
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = sx3.C36907w.m41090l(r5, r11)
            r10.<init>(r11)
            java.util.Iterator r5 = r5.iterator()
        L_0x06c5:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x06da
            java.lang.Object r11 = r5.next()
            al1.h r11 = (al1.C54127h) r11
            dk1.a r13 = new dk1.a
            r13.<init>(r11)
            r10.add(r13)
            goto L_0x06c5
        L_0x06da:
            r9.addAll(r10)
            java.util.ArrayList<dk1.a> r5 = r4.f159517i
            java.util.Iterator r5 = r5.iterator()
            r9 = 0
        L_0x06e4:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0708
            java.lang.Object r10 = r5.next()
            dk1.a r10 = (dk1.C58307a) r10
            al1.h r10 = r10.f166953d
            com.tencent.mm.live.api.LiveConfig r10 = r10.f151977d
            long r10 = r10.f157064e
            com.tencent.mm.live.api.LiveConfig r13 = r3.f151977d
            long r13 = r13.f157064e
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x0700
            r10 = 1
            goto L_0x0701
        L_0x0700:
            r10 = 0
        L_0x0701:
            if (r10 == 0) goto L_0x0705
            r8 = r9
            goto L_0x0708
        L_0x0705:
            int r9 = r9 + 1
            goto L_0x06e4
        L_0x0708:
            r4.f159518j = r8
            if (r8 >= 0) goto L_0x0719
            r5 = 0
            r4.f159518j = r5
            java.util.ArrayList<dk1.a> r8 = r4.f159517i
            dk1.a r9 = new dk1.a
            r9.<init>(r3)
            r8.add(r5, r9)
        L_0x0719:
            java.util.ArrayList<dk1.a> r3 = r4.f159517i
            int r5 = r4.f159518j
            java.lang.Object r3 = sx3.C110818d0.m150917O(r3, r5)
            dk1.a r3 = (dk1.C58307a) r3
            if (r3 != 0) goto L_0x0726
            goto L_0x0728
        L_0x0726:
            r3.f166954e = r6
        L_0x0728:
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r4.mo77736c()
            androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
            if (r3 == 0) goto L_0x0735
            r3.notifyDataSetChanged()
        L_0x0735:
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r4.mo77736c()
            dk1.c r5 = new dk1.c
            r5.<init>(r4)
            r3.post(r5)
            r4.mo77742i(r6)
            com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$FinderLiveSideBarConfig r3 = r4.f159521m
            android.widget.TextView r3 = r3.f159523b
            if (r3 != 0) goto L_0x074b
            goto L_0x074e
        L_0x074b:
            r3.setText(r7)
        L_0x074e:
            dk1.g$a r0 = r0.f166971i
            r0.getClass()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.String r4 = "banner_type"
            java.lang.String r5 = "common_recmd"
            r3.put(r4, r5)
            int r4 = r0.f166972a
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "active_id"
            r3.put(r5, r4)
            dk1.g r4 = dk1.C58312g.this
            android.app.Activity r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.orientation
            if (r4 != r12) goto L_0x077f
            java.lang.String r4 = "2"
            goto L_0x0781
        L_0x077f:
            java.lang.String r4 = "1"
        L_0x0781:
            java.lang.String r5 = "screen_type"
            r3.put(r5, r4)
            di3.d r2 = di3.C86312j.m106911c(r2)
            ak1.o r2 = (ak1.C54108o) r2
            ak1.f0$n r4 = ak1.C54067f0.C0066n.SIDEBAR_BANNER
            r2.mo9602Jz(r4, r3)
            dk1.g r2 = dk1.C58312g.this
            java.lang.String r2 = r2.f166966d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "report reportBannerExpose "
            r4.append(r5)
            int r0 = r0.f166972a
            r4.append(r0)
            java.lang.String r0 = ", "
            r4.append(r0)
            java.lang.String r5 = "liveId"
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = "feedId"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x07fc
        L_0x07ca:
            java.lang.String r0 = "Finder.LivePromoteBannerController"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "not mount, because isLandscape():"
            r2.append(r3)
            boolean r3 = r16.mo9310g3()
            r2.append(r3)
            java.lang.String r3 = ", size:"
            r2.append(r3)
            if (r7 == 0) goto L_0x07f1
            java.util.ArrayList<al1.h> r3 = r7.f153441e
            if (r3 == 0) goto L_0x07f1
            int r3 = r3.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            goto L_0x07f2
        L_0x07f1:
            r5 = 0
        L_0x07f2:
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
        L_0x07fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59018f2.mo84252U3():void");
    }

    /* renamed from: m */
    public boolean mo9315m() {
        return ((C54991o) business(C54991o.class)).f154287Z0 != 2;
    }

    public void onLiveActivate() {
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
    }

    public void onLiveEnd() {
        super.onLiveEnd();
        C59453p pVar = this.f168871I;
        if (pVar != null) {
            pVar.mo84560c(8);
        }
    }

    public void onLiveMsg(C48742ao0 ao02) {
        super.onLiveMsg(ao02);
        if (((C54991o) business(C54991o.class)).f154215J1 != null) {
            C3206b2 b2Var = this.f27261e;
            C56032b bVar = b2Var instanceof C56032b ? (C56032b) b2Var : null;
            if (bVar != null) {
                C11207i.m11070f(bVar, (C66212f) null, (C53934p0) null, new C59057n1(this, (C15601d<? super C59057n1>) null), 3, (Object) null);
            }
        }
        C53973z1 z1Var = this.f168873K;
        boolean z = false;
        if (z1Var != null && !((C53884f2) z1Var).isCancelled()) {
            C53973z1 z1Var2 = this.f168873K;
            if (z1Var2 != null && !((C53884f2) z1Var2).mo74530c()) {
                z = true;
            }
            if (z) {
                return;
            }
        }
        C53896h0 h0Var = C53872d1.f151117a;
        this.f168873K = C11207i.m11071g(this, C58901s.f168555a, (C53934p0) null, new C59060o1(this, (C15601d<? super C59060o1>) null), 2, (Object) null);
    }

    public void onLiveStart(C52005xq0 xq02) {
        Intent intent;
        byte[] byteArrayExtra;
        Intent intent2;
        super.onLiveStart(xq02);
        mo84251T3();
        MMActivity c3 = mo9306c3();
        if (!(c3 == null || (intent = c3.getIntent()) == null || (byteArrayExtra = intent.getByteArrayExtra("FINDER_JUMP_INFO_WITH_OUTSIDE")) == null)) {
            C53973z1 z1Var = null;
            if (!(!(byteArrayExtra.length == 0))) {
                byteArrayExtra = null;
            }
            if (byteArrayExtra != null) {
                MMActivity c35 = mo9306c3();
                if (!(c35 == null || (intent2 = c35.getIntent()) == null)) {
                    intent2.removeExtra("FINDER_JUMP_INFO_WITH_OUTSIDE");
                }
                C47465a parseFrom = new C49461fr0().parseFrom(byteArrayExtra);
                C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderJumpInfoWithOutside");
                C49461fr0 fr02 = (C49461fr0) parseFrom;
                FinderJumpInfo finderJumpInfo = fr02.f133644e;
                if (finderJumpInfo == null) {
                    finderJumpInfo = new FinderJumpInfo();
                }
                C54741c cVar = new C54741c(finderJumpInfo);
                ArrayList arrayList = new ArrayList();
                LinkedList<FinderObject> linkedList = fr02.f133643d;
                C87412m.m108593f(linkedList, "outsideData.objects");
                for (FinderObject finderObject : linkedList) {
                    C87412m.m108593f(finderObject, "fo");
                    arrayList.add(new C54127h(finderObject));
                }
                cVar.f153441e.addAll(arrayList);
                C3206b2 b2Var = this.f27261e;
                C56032b bVar = b2Var instanceof C56032b ? (C56032b) b2Var : null;
                if (bVar != null) {
                    z1Var = C11207i.m11070f(bVar, (C66212f) null, (C53934p0) null, new C59019a(this, cVar, (C15601d<? super C59019a>) null), 3, (Object) null);
                }
                this.f168877j = z1Var;
            }
        }
        mo84252U3();
    }

    public void onViewMount(ViewGroup viewGroup) {
        Class cls = C61212e.class;
        Class cls2 = C54991o.class;
        C87412m.m108594g(viewGroup, "pluginLayout");
        super.onViewMount(viewGroup);
        if (!((C54991o) business(cls2)).mo75990Y3()) {
            Context context = viewGroup.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            if (!((AppCompatActivity) context).getIntent().hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
                ViewGroup viewGroup2 = (ViewGroup) mo9308e3(C0966R.C0970id.f358224nv3);
                this.f168870H = viewGroup2;
                if (viewGroup2 != null) {
                    viewGroup2.addOnLayoutChangeListener(new C8060j1(this));
                    this.f168878n = (RecyclerHorizontalViewPager) viewGroup2.findViewById(C0966R.C0970id.nrh);
                    this.f168868F = (RoundedCornerFrameLayout) viewGroup2.findViewById(C0966R.C0970id.jkn);
                    TextView textView = (TextView) viewGroup2.findViewById(C0966R.C0970id.jko);
                    this.f168869G = textView;
                    if (textView != null) {
                        textView.setTextSize(0, (float) C76577a.m92150a(viewGroup2.getContext(), 12.0f));
                    }
                    this.f168867E = (RoundCornerConstraintLayout) viewGroup2.findViewById(C0966R.C0970id.nxc);
                    this.f168866D = (FrameLayout) viewGroup2.findViewById(C0966R.C0970id.nxd);
                    RecyclerHorizontalViewPager recyclerHorizontalViewPager = this.f168878n;
                    if (recyclerHorizontalViewPager != null) {
                        recyclerHorizontalViewPager.setHasFixedSize(false);
                    }
                    RecyclerHorizontalViewPager recyclerHorizontalViewPager2 = this.f168878n;
                    if (recyclerHorizontalViewPager2 != null) {
                        recyclerHorizontalViewPager2.setItemViewCacheSize(0);
                    }
                    RecyclerHorizontalViewPager recyclerHorizontalViewPager3 = this.f168878n;
                    if (recyclerHorizontalViewPager3 != null) {
                        recyclerHorizontalViewPager3.setDisallowInterceptWhenHorizontalScroll(true);
                    }
                    Context context2 = viewGroup2.getContext();
                    C87412m.m108593f(context2, "root.context");
                    FinderLinearLayoutManager finderLinearLayoutManager = new FinderLinearLayoutManager(context2);
                    finderLinearLayoutManager.f162360w = 160.0f;
                    finderLinearLayoutManager.f44689u = 0;
                    finderLinearLayoutManager.setItemPrefetchEnabled(false);
                    finderLinearLayoutManager.mo16974W(0);
                    RecyclerHorizontalViewPager recyclerHorizontalViewPager4 = this.f168878n;
                    if (recyclerHorizontalViewPager4 != null) {
                        recyclerHorizontalViewPager4.setLayoutManager(finderLinearLayoutManager);
                    }
                    RecyclerHorizontalViewPager recyclerHorizontalViewPager5 = this.f168878n;
                    if (recyclerHorizontalViewPager5 != null) {
                        recyclerHorizontalViewPager5.setPageChangeListener(new C59088x1(this));
                    }
                    RecyclerHorizontalViewPager recyclerHorizontalViewPager6 = this.f168878n;
                    if (recyclerHorizontalViewPager6 != null) {
                        recyclerHorizontalViewPager6.setOnTouchListener(new C59090y1(this));
                    }
                    RecyclerHorizontalViewPager recyclerHorizontalViewPager7 = this.f168878n;
                    if (recyclerHorizontalViewPager7 != null) {
                        recyclerHorizontalViewPager7.setOnInterceptTouchEvent(new C59091z1(this));
                    }
                    RecyclerHorizontalViewPager recyclerHorizontalViewPager8 = this.f168878n;
                    ViewGroup.LayoutParams layoutParams = recyclerHorizontalViewPager8 != null ? recyclerHorizontalViewPager8.getLayoutParams() : null;
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    layoutParams.width = C76577a.m92151b(viewGroup2.getContext(), f168859R);
                    layoutParams.height = C76577a.m92151b(viewGroup2.getContext(), f168858Q);
                    RecyclerHorizontalViewPager recyclerHorizontalViewPager9 = this.f168878n;
                    if (recyclerHorizontalViewPager9 != null) {
                        recyclerHorizontalViewPager9.setLayoutParams(layoutParams);
                    }
                    RecyclerHorizontalViewPager recyclerHorizontalViewPager10 = this.f168878n;
                    if (recyclerHorizontalViewPager10 != null) {
                        recyclerHorizontalViewPager10.setCanMakeCancelAsUp(false);
                    }
                    C58996a2 a2Var = new C58996a2(this, new LivePromoteBannerController$initView$5(), this.f168889y);
                    a2Var.f173488o = new C59003c2(this, viewGroup2);
                    a2Var.f173487n = new C59010d2(this);
                    this.f168879o = a2Var;
                    FrameLayout frameLayout = this.f168866D;
                    if (frameLayout != null) {
                        frameLayout.setOnClickListener(new C59013e2(this, viewGroup2));
                    }
                    RecyclerHorizontalViewPager recyclerHorizontalViewPager11 = this.f168878n;
                    if (recyclerHorizontalViewPager11 != null) {
                        recyclerHorizontalViewPager11.setAdapter(this.f168879o);
                    }
                    C59453p pVar = new C59453p(viewGroup2, this);
                    this.f168871I = pVar;
                    this.f27265i = new C59087w1(pVar);
                    pVar.mo84560c(8);
                    ((C61212e) C86312j.m106911c(cls)).o30(viewGroup2.findViewById(C0966R.C0970id.dx4), "finder_live_more_banner");
                    if (((C56032b) viewGroup).getLiveRole() == 0) {
                        ((C61212e) C86312j.m106911c(cls)).E60(viewGroup2.findViewById(C0966R.C0970id.dx4), new C59022b(this));
                        ((C61212e) C86312j.m106911c(cls)).mo86175pO(viewGroup2.findViewById(C0966R.C0970id.dx4), 8, 25561);
                    }
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd((int) (mo9310g3() ? viewGroup2.getContext().getResources().getDimension(C0966R.dimen.f3753d4) : viewGroup2.getContext().getResources().getDimension(C0966R.dimen.f3736cp)));
                }
                if (!((C54991o) business(cls2)).f154260T3) {
                    ((C58468e0) C86312j.m106911c(C58468e0.class)).clear();
                }
                C39818r rVar = C39818r.f106831a;
                Context context3 = viewGroup.getContext();
                C87412m.m108593f(context3, "pluginLayout.context");
                C39622i0 a = rVar.mo62443b(context3).mo75002a(C58312g.class);
                C87412m.m108593f(a, "UICProvider.of(pluginLay…veSideBarUIC::class.java)");
                C58312g gVar = (C58312g) a;
                if (((C54991o) business(cls2)).mo75999e4()) {
                    mo84251T3();
                }
                mo84252U3();
            }
        }
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        Intent intent;
        C58115i iVar;
        Context context;
        Class cls = C54991o.class;
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f27265i = null;
        this.f168875M.clear();
        Log.m105924i("Finder.LivePromoteBannerController", "unMount");
        ViewGroup viewGroup2 = this.f168870H;
        if (!(viewGroup2 == null || (context = viewGroup2.getContext()) == null)) {
            C58312g gVar = (C58312g) C39818r.f106831a.mo62443b(context).mo75002a(C58312g.class);
            if (!gVar.f166967e) {
                C9493c cVar = this.f168863A;
                C54741c cVar2 = cVar instanceof C54741c ? (C54741c) cVar : null;
                if (cVar2 != null && gVar.f166970h.contains(cVar2)) {
                    gVar.mo83062d3();
                }
            }
        }
        C54655b b = FinderLiveService.f159376d.mo77626b();
        boolean z = ((b == null || (iVar = b.f172989A) == null) ? false : iVar.f166264k) && ((C54991o) business(cls)).f154369t3 == 3;
        ((C54991o) business(cls)).getClass();
        if (!z && !((C54991o) business(cls)).f154260T3) {
            Log.m105924i("Finder.LivePromoteBannerController", "landscape click don't clear webview controller");
            C58468e0 e0Var = (C58468e0) C86312j.m106911c(C58468e0.class);
            if (e0Var != null) {
                e0Var.clear();
            }
        }
        this.f168881q = false;
        this.f168880p = false;
        this.f168886v = 0;
        this.f168884t = -1;
        this.f168882r = null;
        this.f168863A = null;
        this.f168883s = "";
        this.f168888x.clear();
        this.f168890z.clear();
        this.f168889y.clear();
        WxRecyclerAdapter<C9493c> wxRecyclerAdapter = this.f168879o;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
        f168862U = null;
        this.f168887w = false;
        MMActivity c3 = mo9306c3();
        if (!(c3 == null || (intent = c3.getIntent()) == null)) {
            intent.removeExtra("FINDER_JUMP_INFO_WITH_OUTSIDE");
        }
        C53973z1 z1Var = this.f168864B;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        C53973z1 z1Var2 = this.f168873K;
        if (z1Var2 != null) {
            C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
        }
        C53973z1 z1Var3 = this.f168877j;
        if (z1Var3 != null) {
            C53973z1.C53974a.m60623a(z1Var3, (CancellationException) null, 1, (Object) null);
        }
        ((C54991o) business(cls)).f154223L1 = false;
    }
}
