package fh1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53916l;
import a14.C53934p0;
import a14.C53973z1;
import android.animation.Animator;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cl1.C54991o;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import fj1.C45795b;
import fy3.C32227p;
import gg1.C32444a;
import gh1.C8313a;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kotlin.Result;
import nk1.C11207i;
import o40.C61926c;
import q00.C62571i;
import rx3.C13598b0;
import te3.C48928bz0;
import tf1.C13914m;
import wx3.C15601d;
import wx3.C66212f;
import xh1.C23087a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: fh1.h */
public final class C8048h extends C8313a {

    /* renamed from: n */
    public static final C8049a f26771n = new C8049a((C8480h) null);

    /* renamed from: j */
    public C8053d f26772j;

    /* renamed from: fh1.h$a */
    public static final class C8049a {
        public C8049a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo9136a(C45795b bVar) {
            boolean z;
            C32444a aVar = C32444a.f86121a;
            if (C32444a.f86066I1.mo60266n().intValue() == 0) {
                Log.m105924i("Finder.GestureEffectAnchorSettingController", "canShowGestureEffect FINDER_LIVE_GESTURE_EFFECT_CONFIG false");
                return false;
            }
            boolean u = C61926c.m72696u((int) C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0), 4);
            String a = ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR().mo11889a("MODEL_HAND");
            Log.m105924i("Finder.GestureEffectAnchorSettingController", "canShowGestureEffect modelHandPath=" + a);
            if (!u) {
                return false;
            }
            C23087a.f66318a.getClass();
            Map<String, Boolean> map = C23087a.f66321d;
            if (!map.isEmpty()) {
                Iterator it = ((LinkedHashMap) map).values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            return !(a == null || a.length() == 0);
        }

        /* renamed from: b */
        public final boolean mo9137b(C45795b bVar) {
            boolean a = mo9136a(bVar);
            boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_GESTURE_EFFECT_BOOLEAN_SYNC, false);
            Log.m105924i("Finder.GestureEffectAnchorSettingController", "canShowRedDot: " + a + ", " + g);
            return a && !g;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d4, code lost:
            if (r6.contains(java.lang.Integer.valueOf(r14 != null ? r14.f186453d : -1)) != false) goto L_0x00d6;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo9138c(fj1.C45795b r14) {
            /*
                r13 = this;
                java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                pe1.c<java.lang.Integer> r1 = gg1.C32444a.f86066I1
                java.lang.Object r1 = r1.mo60266n()
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r2 = 0
                java.lang.String r3 = "Finder.GestureEffectAnchorSettingController"
                if (r1 != 0) goto L_0x0019
                java.lang.String r14 = "isGestureEffectSwitchEnable FINDER_LIVE_GESTURE_EFFECT_CONFIG false"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
                return r2
            L_0x0019:
                if (r14 == 0) goto L_0x0024
                androidx.lifecycle.i0 r1 = r14.mo71262a(r0)
                cl1.o r1 = (cl1.C54991o) r1
                int r1 = r1.f154354q
                goto L_0x0025
            L_0x0024:
                r1 = 0
            L_0x0025:
                r4 = 131072(0x20000, float:1.83671E-40)
                boolean r1 = o40.C61926c.m72696u(r1, r4)
                f40.o r4 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r4 = r4.mo121142i()
                com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SWITCH_GESTURE_EFFECT_BOOLEAN_SYNC
                boolean r4 = r4.mo119686g(r5, r2)
                java.lang.String r5 = "isGestureEffectSwitchEnable localSwitch:"
                if (r4 == 0) goto L_0x0058
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r5)
                r14.append(r4)
                java.lang.String r0 = ", checkAnchorStatus:"
                r14.append(r0)
                r14.append(r1)
                java.lang.String r14 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
                return r1
            L_0x0058:
                r1 = 1
                if (r14 == 0) goto L_0x00d7
                androidx.lifecycle.i0 r14 = r14.mo71262a(r0)
                cl1.o r14 = (cl1.C54991o) r14
                te3.y91 r14 = r14.f154326i2
                if (r14 == 0) goto L_0x00d7
                xh1.d r0 = xh1.C15685d.f42379a
                rx3.g r0 = xh1.C15685d.f42380b
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r0
                java.lang.String r6 = ""
                java.lang.String r7 = "MMKV_KEY_DEFAULT_TURN_ON_TAG_ID"
                java.lang.String r0 = r0.getString(r7, r6)
                if (r0 != 0) goto L_0x007d
                r7 = r6
                goto L_0x007e
            L_0x007d:
                r7 = r0
            L_0x007e:
                java.lang.String r0 = ","
                java.lang.String[] r8 = new java.lang.String[]{r0}
                r9 = 0
                r10 = 0
                r11 = 6
                r12 = 0
                java.util.List r0 = z04.C112550d0.m153785U(r7, r8, r9, r10, r11, r12)
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x0095:
                boolean r7 = r0.hasNext()
                if (r7 == 0) goto L_0x00b8
                java.lang.Object r7 = r0.next()
                java.lang.String r7 = (java.lang.String) r7
                int r8 = r7.length()
                if (r8 <= 0) goto L_0x00a9
                r8 = 1
                goto L_0x00aa
            L_0x00a9:
                r8 = 0
            L_0x00aa:
                if (r8 == 0) goto L_0x0095
                int r7 = com.tencent.p014mm.sdk.platformtools.StringKtKt.safeToInt(r7)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r6.add(r7)
                goto L_0x0095
            L_0x00b8:
                int r0 = r14.f186453d
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                boolean r0 = r6.contains(r0)
                if (r0 != 0) goto L_0x00d6
                te3.y91 r14 = r14.f186456g
                if (r14 == 0) goto L_0x00cb
                int r14 = r14.f186453d
                goto L_0x00cc
            L_0x00cb:
                r14 = -1
            L_0x00cc:
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                boolean r14 = r6.contains(r14)
                if (r14 == 0) goto L_0x00d7
            L_0x00d6:
                r2 = 1
            L_0x00d7:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r5)
                r14.append(r4)
                java.lang.String r0 = ", checkTag:"
                r14.append(r0)
                r14.append(r2)
                java.lang.String r14 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: fh1.C8048h.C8049a.mo9138c(fj1.b):boolean");
        }
    }

    /* renamed from: fh1.h$b */
    public static final class C8050b extends C60896i<C8051c> {
        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.f359822d53;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C8051c cVar2 = (C8051c) cVar;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(cVar2, "item");
            ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.nw7);
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.nw8);
            String str = cVar2.f26773d.f131400e;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            C0000n0 n0Var = oVar.f29679z;
            if (n0Var != null) {
                C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C8057i(cVar2, imageView, (C15601d<? super C8057i>) null), 3, (Object) null);
            }
        }
    }

    /* renamed from: fh1.h$c */
    public static final class C8051c implements C0740i2 {

        /* renamed from: d */
        public final C48928bz0 f26773d;

        /* renamed from: e */
        public boolean f26774e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.GestureEffectAnchorSettingController$GestureEffectSettingFeed", mo125469f = "GestureEffectAnchorSettingController.kt", mo125470l = {304}, mo125471m = "getImagePath")
        /* renamed from: fh1.h$c$a */
        public static final class C8052a extends C66704d {

            /* renamed from: d */
            public Object f26775d;

            /* renamed from: e */
            public /* synthetic */ Object f26776e;

            /* renamed from: f */
            public final /* synthetic */ C8051c f26777f;

            /* renamed from: g */
            public int f26778g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C8052a(C8051c cVar, C15601d<? super C8052a> dVar) {
                super(dVar);
                this.f26777f = cVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f26776e = obj;
                this.f26778g |= Integer.MIN_VALUE;
                return this.f26777f.mo9139a(this);
            }
        }

        public C8051c(C48928bz0 bz02) {
            C87412m.m108594g(bz02, "gestureInfo");
            this.f26773d = bz02;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo9139a(wx3.C15601d<? super java.lang.String> r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof fh1.C8048h.C8051c.C8052a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                fh1.h$c$a r0 = (fh1.C8048h.C8051c.C8052a) r0
                int r1 = r0.f26778g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f26778g = r1
                goto L_0x0018
            L_0x0013:
                fh1.h$c$a r0 = new fh1.h$c$a
                r0.<init>(r5, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f26776e
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f26778g
                r3 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 != r3) goto L_0x002b
                java.lang.Object r0 = r0.f26775d
                fh1.h$c r0 = (fh1.C8048h.C8051c) r0
                kotlin.ResultKt.throwOnFailure(r6)
                goto L_0x0046
            L_0x002b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x0033:
                kotlin.ResultKt.throwOnFailure(r6)
                xh1.a r6 = xh1.C23087a.f66318a
                te3.bz0 r2 = r5.f26773d
                r0.f26775d = r5
                r0.f26778g = r3
                java.lang.Object r6 = r6.mo36497d(r2, r0)
                if (r6 != r1) goto L_0x0045
                return r1
            L_0x0045:
                r0 = r5
            L_0x0046:
                xh1.a$b r6 = (xh1.C23087a.C15677b) r6
                java.lang.String r1 = ""
                if (r6 == 0) goto L_0x0050
                java.lang.String r2 = r6.f42363a
                if (r2 != 0) goto L_0x0051
            L_0x0050:
                r2 = r1
            L_0x0051:
                boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r3 == 0) goto L_0x005e
                if (r6 == 0) goto L_0x0066
                java.lang.String r6 = r6.f42364b
                if (r6 != 0) goto L_0x0065
                goto L_0x0066
            L_0x005e:
                if (r6 == 0) goto L_0x0066
                java.lang.String r6 = r6.f42365c
                if (r6 != 0) goto L_0x0065
                goto L_0x0066
            L_0x0065:
                r1 = r6
            L_0x0066:
                boolean r6 = r0.f26774e
                java.lang.String r3 = "getImagePath "
                java.lang.String r4 = "Finder.GestureEffectAnchorSettingController"
                if (r6 == 0) goto L_0x008d
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r3)
                te3.bz0 r0 = r0.f26773d
                int r0 = r0.f131399d
                r6.append(r0)
                java.lang.String r0 = " enablePath:"
                r6.append(r0)
                r6.append(r2)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
                return r2
            L_0x008d:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r3)
                te3.bz0 r0 = r0.f26773d
                int r0 = r0.f131399d
                r6.append(r0)
                java.lang.String r0 = " disablePath:"
                r6.append(r0)
                r6.append(r1)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: fh1.C8048h.C8051c.mo9139a(wx3.d):java.lang.Object");
        }

        /* renamed from: c */
        public int mo75c() {
            return C8051c.class.hashCode();
        }

        /* renamed from: f */
        public int mo76f(C13914m mVar) {
            C87412m.m108594g(mVar, "obj");
            return 0;
        }

        public long getItemId() {
            return (long) this.f26773d.f131399d;
        }
    }

    /* renamed from: fh1.h$d */
    public final class C8053d {

        /* renamed from: a */
        public final View f26779a;

        /* renamed from: b */
        public final List<C48928bz0> f26780b;

        /* renamed from: c */
        public final View f26781c;

        /* renamed from: d */
        public final View f26782d;

        /* renamed from: e */
        public final ImageView f26783e;

        /* renamed from: f */
        public final TextView f26784f;

        /* renamed from: g */
        public int f26785g;

        /* renamed from: h */
        public C53973z1 f26786h;

        /* renamed from: i */
        public final /* synthetic */ C8048h f26787i;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.GestureEffectAnchorSettingController$LoopTips$startLoop$1", mo125469f = "GestureEffectAnchorSettingController.kt", mo125470l = {386, 429}, mo125471m = "invokeSuspend")
        /* renamed from: fh1.h$d$a */
        public static final class C8054a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f26788d;

            /* renamed from: e */
            public int f26789e;

            /* renamed from: f */
            public final /* synthetic */ C8053d f26790f;

            /* renamed from: g */
            public final /* synthetic */ boolean f26791g;

            /* renamed from: fh1.h$d$a$a */
            public static final class C8055a implements Animator.AnimatorListener {

                /* renamed from: d */
                public final /* synthetic */ C8477a0 f26792d;

                /* renamed from: e */
                public final /* synthetic */ C53916l<C13598b0> f26793e;

                public C8055a(C8477a0 a0Var, C53916l<? super C13598b0> lVar) {
                    this.f26792d = a0Var;
                    this.f26793e = lVar;
                }

                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationEnd(Animator animator) {
                    C8477a0 a0Var = this.f26792d;
                    if (!a0Var.f27482d) {
                        a0Var.f27482d = true;
                        C53916l<C13598b0> lVar = this.f26793e;
                        Result.Companion companion = Result.Companion;
                        lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
                    }
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C8054a(C8053d dVar, boolean z, C15601d<? super C8054a> dVar2) {
                super(2, dVar2);
                this.f26790f = dVar;
                this.f26791g = z;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C8054a(this.f26790f, this.f26791g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C8054a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0096  */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x0120  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x0123  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    r17 = this;
                    r0 = r17
                    xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r2 = r0.f26789e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x0029
                    if (r2 == r4) goto L_0x0021
                    if (r2 != r3) goto L_0x0019
                    java.lang.Object r2 = r0.f26788d
                    fh1.h$d r2 = (fh1.C8048h.C8053d) r2
                    kotlin.ResultKt.throwOnFailure(r18)
                    r2 = r0
                    r5 = r1
                    goto L_0x011b
                L_0x0019:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0021:
                    kotlin.ResultKt.throwOnFailure(r18)
                    r6 = r18
                    r2 = r0
                    r5 = r1
                    goto L_0x003c
                L_0x0029:
                    kotlin.ResultKt.throwOnFailure(r18)
                    r2 = r0
                    r5 = r1
                L_0x002e:
                    fh1.h$d r6 = r2.f26790f
                    r7 = 0
                    r2.f26788d = r7
                    r2.f26789e = r4
                    java.lang.Object r6 = fh1.C8048h.C8053d.m8167a(r6, r2)
                    if (r6 != r5) goto L_0x003c
                    return r5
                L_0x003c:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    fh1.h$d r7 = r2.f26790f
                    android.view.View r7 = r7.f26782d
                    r8 = 1065353216(0x3f800000, float:1.0)
                    k20.a r15 = new k20.a
                    r15.<init>()
                    java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
                    java.lang.Float r8 = java.lang.Float.valueOf(r8)
                    r15.mo10233c(r8)
                    java.lang.Object[] r9 = r15.mo10232b()
                    java.lang.String r10 = "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips$startLoop$1"
                    java.lang.String r11 = "invokeSuspend"
                    java.lang.String r12 = "(Ljava/lang/Object;)Ljava/lang/Object;"
                    java.lang.String r13 = "android/view/View_EXEC_"
                    java.lang.String r14 = "setAlpha"
                    java.lang.String r16 = "(F)V"
                    r8 = r7
                    r3 = r15
                    r15 = r16
                    j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                    r15 = 0
                    java.lang.Object r3 = r3.mo10231a(r15)
                    java.lang.Float r3 = (java.lang.Float) r3
                    float r3 = r3.floatValue()
                    r7.setAlpha(r3)
                    java.lang.String r9 = "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips$startLoop$1"
                    java.lang.String r10 = "invokeSuspend"
                    java.lang.String r11 = "(Ljava/lang/Object;)Ljava/lang/Object;"
                    java.lang.String r12 = "android/view/View_EXEC_"
                    java.lang.String r13 = "setAlpha"
                    java.lang.String r14 = "(F)V"
                    j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                    if (r6 != 0) goto L_0x0096
                    fh1.h$d r1 = r2.f26790f
                    r1.mo9141c()
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    return r1
                L_0x0096:
                    java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
                    r3.<init>()
                    java.lang.Integer r6 = new java.lang.Integer
                    r6.<init>(r4)
                    java.lang.String r7 = "features_stage"
                    r3.put(r7, r6)
                    fh1.h$d r6 = r2.f26790f
                    java.util.List<te3.bz0> r7 = r6.f26780b
                    int r6 = r6.f26785g
                    int r8 = r7.size()
                    int r6 = r6 % r8
                    java.lang.Object r6 = sx3.C110818d0.m150917O(r7, r6)
                    te3.bz0 r6 = (te3.C48928bz0) r6
                    if (r6 == 0) goto L_0x00ba
                    int r15 = r6.f131399d
                L_0x00ba:
                    java.lang.Integer r6 = new java.lang.Integer
                    r6.<init>(r15)
                    java.lang.String r7 = "features_type"
                    r3.put(r7, r6)
                    java.lang.Class<ak1.o> r6 = ak1.C54108o.class
                    di3.d r6 = di3.C86312j.m106911c(r6)
                    ak1.o r6 = (ak1.C54108o) r6
                    java.lang.String r7 = "live_anchor_gesture_features_hint"
                    java.lang.String r8 = "view_exp"
                    r6.Rx0(r7, r8, r3)
                    fh1.h$d r3 = r2.f26790f
                    int r6 = r3.f26785g
                    int r6 = r6 + r4
                    r3.f26785g = r6
                    boolean r6 = r2.f26791g
                    if (r6 == 0) goto L_0x011b
                    r2.f26788d = r3
                    r6 = 2
                    r2.f26789e = r6
                    a14.m r7 = new a14.m
                    wx3.d r8 = xx3.C66447b.m78392b(r2)
                    r7.<init>(r8, r4)
                    r7.mo74609p()
                    gy3.a0 r8 = new gy3.a0
                    r8.<init>()
                    android.view.View r3 = r3.f26782d
                    android.view.ViewPropertyAnimator r3 = r3.animate()
                    r9 = 3000(0xbb8, double:1.482E-320)
                    android.view.ViewPropertyAnimator r3 = r3.setStartDelay(r9)
                    r9 = 0
                    android.view.ViewPropertyAnimator r3 = r3.alpha(r9)
                    r9 = 500(0x1f4, double:2.47E-321)
                    android.view.ViewPropertyAnimator r3 = r3.setDuration(r9)
                    fh1.h$d$a$a r9 = new fh1.h$d$a$a
                    r9.<init>(r8, r7)
                    r3.setListener(r9)
                    java.lang.Object r3 = r7.mo74608o()
                    if (r3 != r5) goto L_0x011c
                    return r5
                L_0x011b:
                    r6 = 2
                L_0x011c:
                    boolean r3 = r2.f26791g
                    if (r3 != 0) goto L_0x0123
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    return r1
                L_0x0123:
                    r3 = 2
                    goto L_0x002e
                */
                throw new UnsupportedOperationException("Method not decompiled: fh1.C8048h.C8053d.C8054a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C8053d(C8048h hVar, View view, List<? extends C48928bz0> list) {
            C87412m.m108594g(view, "rootView");
            C87412m.m108594g(list, "gestureInfoList");
            this.f26787i = hVar;
            this.f26779a = view;
            this.f26780b = list;
            View findViewById = view.findViewById(C0966R.C0970id.nx5);
            this.f26781c = findViewById;
            View findViewById2 = findViewById.findViewById(C0966R.C0970id.nx6);
            this.f26782d = findViewById2;
            this.f26783e = (ImageView) findViewById2.findViewById(C0966R.C0970id.nzh);
            this.f26784f = (TextView) findViewById2.findViewById(C0966R.C0970id.nzi);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips", "<init>", "(Lcom/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController;Landroid/view/View;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips", "<init>", "(Lcom/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController;Landroid/view/View;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final java.lang.Object m8167a(fh1.C8048h.C8053d r6, wx3.C15601d r7) {
            /*
                r6.getClass()
                boolean r0 = r7 instanceof fh1.C8059j
                if (r0 == 0) goto L_0x0016
                r0 = r7
                fh1.j r0 = (fh1.C8059j) r0
                int r1 = r0.f26804h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0016
                int r1 = r1 - r2
                r0.f26804h = r1
                goto L_0x001b
            L_0x0016:
                fh1.j r0 = new fh1.j
                r0.<init>(r6, r7)
            L_0x001b:
                java.lang.Object r7 = r0.f26802f
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f26804h
                r3 = 1
                if (r2 == 0) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r6 = r0.f26801e
                te3.bz0 r6 = (te3.C48928bz0) r6
                java.lang.Object r0 = r0.f26800d
                fh1.h$d r0 = (fh1.C8048h.C8053d) r0
                kotlin.ResultKt.throwOnFailure(r7)
                r5 = r7
                r7 = r6
                r6 = r0
                r0 = r5
                goto L_0x0064
            L_0x0036:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x003e:
                kotlin.ResultKt.throwOnFailure(r7)
                java.util.List<te3.bz0> r7 = r6.f26780b
                int r2 = r6.f26785g
                int r4 = r7.size()
                int r2 = r2 % r4
                java.lang.Object r7 = sx3.C110818d0.m150917O(r7, r2)
                te3.bz0 r7 = (te3.C48928bz0) r7
                if (r7 != 0) goto L_0x0055
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                goto L_0x00a6
            L_0x0055:
                xh1.a r2 = xh1.C23087a.f66318a
                r0.f26800d = r6
                r0.f26801e = r7
                r0.f26804h = r3
                java.lang.Object r0 = r2.mo36499f(r7, r0)
                if (r0 != r1) goto L_0x0064
                goto L_0x00a6
            L_0x0064:
                xh1.a$d r0 = (xh1.C23087a.C15679d) r0
                if (r0 != 0) goto L_0x006b
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                goto L_0x00a6
            L_0x006b:
                android.widget.TextView r1 = r6.f26784f
                java.lang.String r2 = r7.f131403h
                if (r2 == 0) goto L_0x0072
                goto L_0x0074
            L_0x0072:
                java.lang.String r2 = ""
            L_0x0074:
                r1.setText(r2)
                android.widget.ImageView r6 = r6.f26783e
                java.lang.String r1 = r0.f42371a
                android.graphics.Bitmap r1 = com.tencent.p014mm.graphics.MMBitmapFactory.m98734c(r1)
                r6.setImageBitmap(r1)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r1 = "loop tips bindData, "
                r6.append(r1)
                java.lang.String r7 = r7.f131403h
                r6.append(r7)
                java.lang.String r7 = ", "
                r6.append(r7)
                java.lang.String r7 = r0.f42371a
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r7 = "Finder.GestureEffectAnchorSettingController"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
            L_0x00a6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: fh1.C8048h.C8053d.m8167a(fh1.h$d, wx3.d):java.lang.Object");
        }

        /* renamed from: b */
        public final void mo9140b() {
            boolean z = false;
            if (this.f26780b.isEmpty() || ((C54991o) this.f26787i.business(C54991o.class)).mo75999e4()) {
                View view = this.f26781c;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips", "startLoop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips", "startLoop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_LIVE_ANCHOR_HAS_SWITCH_GESTURE_TIPS_BOOLEAN_SYNC;
            if (i.mo119686g(aVar2, false)) {
                Log.m105924i("Finder.GestureEffectAnchorSettingController", "startLoop but hasShown");
                return;
            }
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, Boolean.TRUE);
            C53973z1 z1Var = this.f26786h;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f26782d.animate().cancel();
            this.f26785g = 0;
            View view2 = this.f26781c;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips", "startLoop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips", "startLoop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f26780b.size() > 1) {
                z = true;
            }
            this.f26786h = C11207i.m11066b(this.f26787i, (C66212f) null, (C53934p0) null, new C8054a(this, z, (C15601d<? super C8054a>) null), 3, (Object) null);
        }

        /* renamed from: c */
        public final void mo9141c() {
            C53973z1 z1Var = this.f26786h;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f26782d.animate().cancel();
            this.f26785g = 0;
            View view = this.f26781c;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips", "stopLoop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips", "stopLoop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8048h(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    public void onLiveActivate() {
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
    }
}
