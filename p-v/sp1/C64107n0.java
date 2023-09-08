package sp1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import ak1.C54067f0;
import ak1.C54116w;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import cj1.C54795n5;
import cl1.C54979h1;
import cl1.C54991o;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import f14.C58901s;
import ft1.C59319a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hq1.C60085d;
import hq1.C60090e;
import j20.C117292a;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import ky2.C10432i;
import nk1.C11207i;
import o40.C11348f;
import org.json.JSONObject;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import qj1.C62660c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk1.C63964u;
import sk1.C63965x;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zp3.C79406f;

/* renamed from: sp1.n0 */
public final class C64107n0 implements C64121q0, C64123r0 {

    /* renamed from: k */
    public static C64117o0 f181767k = new C64117o0((SoftReference) null, (SoftReference) null, (SoftReference) null, 7, (C8480h) null);

    /* renamed from: a */
    public final ViewGroup f181768a;

    /* renamed from: b */
    public final C58124b f181769b;

    /* renamed from: c */
    public final C62660c f181770c;

    /* renamed from: d */
    public boolean f181771d;

    /* renamed from: e */
    public PAGView f181772e;

    /* renamed from: f */
    public final C13601g f181773f = C36568h.m40985a(new C64109b(this));

    /* renamed from: g */
    public final C13601g f181774g = C36568h.m40985a(new C64110c(this));

    /* renamed from: h */
    public final C13601g f181775h = C36568h.m40985a(new C64111d(this));

    /* renamed from: i */
    public final String f181776i = "finder_live_shopping_entrance_fire.pag";

    /* renamed from: j */
    public final PAGView f181777j;

    /* renamed from: sp1.n0$a */
    public static final class C64108a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C64107n0 f181778d;

        public C64108a(C64107n0 n0Var) {
            this.f181778d = n0Var;
        }

        public final void onClick(View view) {
            C60085d dVar;
            C60090e eVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveVisitorShoppingEntranceWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C0740i2 i2Var = ((C54979h1) this.f181778d.f181770c.mo87696x0(C54979h1.class)).f154147v;
            Bundle bundle = new Bundle();
            if (i2Var instanceof C63965x) {
                bundle.putLong("PARAM_FINDER_LIVE_BUBBLE_PRODUCTID", ((C63965x) i2Var).f181347t);
            } else if (i2Var instanceof C63964u) {
                bundle.putLong("PARAM_FINDER_LIVE_BUBBLE_ADID", ((C63964u) i2Var).f181326t);
            }
            this.f181778d.f181769b.statusChange(C58124b.C58125b.FINDER_LIVE_SHOPPING_LIST_SHOW, bundle);
            if (!(!((C54991o) this.f181778d.f181770c.mo87696x0(C54991o.class)).mo75990Y3() || (dVar = (C60085d) this.f181778d.f181770c.mo87687E0(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                eVar.mo84955a();
                eVar.mo84957c(2016);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveVisitorShoppingEntranceWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sp1.n0$b */
    public static final class C64109b extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C64107n0 f181779d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64109b(C64107n0 n0Var) {
            super(0);
            this.f181779d = n0Var;
        }

        public Object invoke() {
            Context context = this.f181779d.f181768a.getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                return (ViewGroup) activity.findViewById(C0966R.C0970id.e16);
            }
            return null;
        }
    }

    /* renamed from: sp1.n0$c */
    public static final class C64110c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C64107n0 f181780d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64110c(C64107n0 n0Var) {
            super(0);
            this.f181780d = n0Var;
        }

        public Object invoke() {
            return this.f181780d.f181768a.findViewById(C0966R.C0970id.dys);
        }
    }

    /* renamed from: sp1.n0$d */
    public static final class C64111d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C64107n0 f181781d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64111d(C64107n0 n0Var) {
            super(0);
            this.f181781d = n0Var;
        }

        public Object invoke() {
            return this.f181781d.f181768a.findViewById(C0966R.C0970id.dyt);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.view.FinderLiveVisitorShoppingEntranceWidget$playPromotePag$1", mo125469f = "FinderLiveVisitorShoppingEntranceWidget.kt", mo125470l = {257}, mo125471m = "invokeSuspend")
    /* renamed from: sp1.n0$e */
    public static final class C64112e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f181782d;

        /* renamed from: e */
        public final /* synthetic */ C64107n0 f181783e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.view.FinderLiveVisitorShoppingEntranceWidget$playPromotePag$1$1", mo125469f = "FinderLiveVisitorShoppingEntranceWidget.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: sp1.n0$e$a */
        public static final class C64113a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C64107n0 f181784d;

            /* renamed from: sp1.n0$e$a$a */
            public static final class C64114a extends SimplePAGViewUpdateListener {

                /* renamed from: d */
                public final /* synthetic */ C64107n0 f181785d;

                public C64114a(C64107n0 n0Var) {
                    this.f181785d = n0Var;
                }

                public void onAnimationCancel(PAGView pAGView) {
                    if (pAGView != null) {
                        C64107n0 n0Var = this.f181785d;
                        pAGView.removeListener(this);
                        C64117o0 o0Var = C64107n0.f181767k;
                        View i = n0Var.mo88858i();
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view = i;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveVisitorShoppingEntranceWidget$playPromotePag$1$1$1", "onAnimationCancel", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        i.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveVisitorShoppingEntranceWidget$playPromotePag$1$1$1", "onAnimationCancel", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        pAGView.setVisibility(8);
                    }
                }

                public void onAnimationEnd(PAGView pAGView) {
                    if (pAGView != null) {
                        C64107n0 n0Var = this.f181785d;
                        pAGView.removeListener(this);
                        C64117o0 o0Var = C64107n0.f181767k;
                        View i = n0Var.mo88858i();
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view = i;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveVisitorShoppingEntranceWidget$playPromotePag$1$1$1", "onAnimationEnd", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        i.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveVisitorShoppingEntranceWidget$playPromotePag$1$1$1", "onAnimationEnd", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        pAGView.setVisibility(8);
                    }
                }

                public void onAnimationRepeat(PAGView pAGView) {
                }

                public void onAnimationStart(PAGView pAGView) {
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C64113a(C64107n0 n0Var, C15601d<? super C64113a> dVar) {
                super(2, dVar);
                this.f181784d = n0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C64113a(this.f181784d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C64113a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f181784d.f181777j.setVisibility(0);
                View i = this.f181784d.mo88858i();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = i;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveVisitorShoppingEntranceWidget$playPromotePag$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveVisitorShoppingEntranceWidget$playPromotePag$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f181784d.f181777j.play();
                C64107n0 n0Var = this.f181784d;
                n0Var.f181777j.addListener(new C64114a(n0Var));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64112e(C64107n0 n0Var, C15601d<? super C64112e> dVar) {
            super(2, dVar);
            this.f181783e = n0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C64112e(this.f181783e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64112e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f181782d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f181783e.f181777j.stop();
                if (this.f181783e.f181777j.getComposition() == null) {
                    C64107n0 n0Var = this.f181783e;
                    n0Var.f181777j.setComposition(PAGFile.Load(n0Var.f181768a.getContext().getAssets(), this.f181783e.f181776i));
                }
                this.f181783e.f181777j.flush();
                this.f181783e.f181777j.setRepeatCount(1);
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C64113a aVar2 = new C64113a(this.f181783e, (C15601d<? super C64113a>) null);
                this.f181782d = 1;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
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

    /* renamed from: sp1.n0$f */
    public static final class C64115f extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64107n0 f181786d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64115f(C64107n0 n0Var) {
            super(1);
            this.f181786d = n0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0033, code lost:
            r3 = r3.f172989A;
         */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r27) {
            /*
                r26 = this;
                r0 = r27
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                r0.booleanValue()
                r0 = r26
                sp1.n0 r1 = r0.f181786d
                java.lang.Class<cl1.h1> r2 = cl1.C54979h1.class
                qj1.c r3 = r1.f181770c
                androidx.lifecycle.i0 r3 = r3.mo87696x0(r2)
                cl1.h1 r3 = (cl1.C54979h1) r3
                boolean r3 = r3.f154122N
                if (r3 != 0) goto L_0x001b
                goto L_0x0272
            L_0x001b:
                p50.a$a r3 = p50.C62193a.f176816k1
                qj1.c r4 = r1.f181770c
                com.tencent.mm.plugin.finder.live.view.b r4 = r4.mo14484z0()
                al1.h r4 = r4.getData()
                com.tencent.mm.live.api.LiveConfig r4 = r4.f151977d
                long r4 = r4.f157064e
                p50.a r3 = r3.mo87262c(r4)
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x003f
                d50.i r3 = r3.f172989A
                if (r3 == 0) goto L_0x003f
                boolean r3 = r3.mo82881c()
                if (r3 != r4) goto L_0x003f
                r3 = 1
                goto L_0x0040
            L_0x003f:
                r3 = 0
            L_0x0040:
                java.lang.String r6 = "Finder.FinderLiveVisitorShoppingEntranceWidget"
                if (r3 == 0) goto L_0x004c
                java.lang.String r1 = "tryToPlayBagAnim but miniwindow mode!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
                goto L_0x0272
            L_0x004c:
                qj1.c r3 = r1.f181770c
                androidx.lifecycle.i0 r3 = r3.mo87696x0(r2)
                cl1.h1 r3 = (cl1.C54979h1) r3
                boolean r3 = r3.f154137i
                if (r3 != 0) goto L_0x0060
                java.lang.String r1 = "tryToPlayBagAnim but shoppingAvailable false!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
                goto L_0x0272
            L_0x0060:
                boolean r3 = r1.isVisible()
                if (r3 != 0) goto L_0x006e
                java.lang.String r1 = "tryToPlayBagAnim but root can't visible!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
                goto L_0x0272
            L_0x006e:
                qj1.c r3 = r1.f181770c
                androidx.lifecycle.i0 r3 = r3.mo87696x0(r2)
                cl1.h1 r3 = (cl1.C54979h1) r3
                te3.vx0 r3 = r3.f154126S
                r7 = 0
                if (r3 == 0) goto L_0x008e
                te3.w44 r3 = r3.f143755d
                if (r3 == 0) goto L_0x008e
                te3.u44 r3 = r3.f143856e
                if (r3 == 0) goto L_0x008e
                java.util.LinkedList<java.lang.String> r3 = r3.f142599g
                if (r3 == 0) goto L_0x008e
                java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
                java.lang.String r3 = (java.lang.String) r3
                goto L_0x008f
            L_0x008e:
                r3 = r7
            L_0x008f:
                np1.i0 r8 = np1.C61866i0.f175909a
                java.lang.String r9 = "shop_ec_bag"
                java.lang.String r10 = r8.mo86797i(r9, r3)
                qj1.c r11 = r1.f181770c
                androidx.lifecycle.i0 r11 = r11.mo87696x0(r2)
                cl1.h1 r11 = (cl1.C54979h1) r11
                te3.vx0 r11 = r11.f154126S
                if (r11 == 0) goto L_0x00ab
                te3.w44 r11 = r11.f143755d
                if (r11 == 0) goto L_0x00ab
                te3.u44 r11 = r11.f143856e
                goto L_0x00ac
            L_0x00ab:
                r11 = r7
            L_0x00ac:
                java.lang.String r12 = ""
                if (r11 == 0) goto L_0x00dc
                rx3.g r13 = np1.C61866i0.f175911c
                rx3.n r13 = (rx3.C36570n) r13
                java.lang.Object r13 = r13.getValue()
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L_0x00dc
                boolean r13 = r11.f142596d
                if (r13 == 0) goto L_0x00dc
                java.util.LinkedList<java.lang.String> r11 = r11.f142599g
                java.lang.String r13 = "it.content_url"
                gy3.C87412m.m108593f(r11, r13)
                java.lang.Object r11 = sx3.C110818d0.m150916N(r11)
                java.lang.String r11 = (java.lang.String) r11
                if (r11 != 0) goto L_0x00d4
                r11 = r12
            L_0x00d4:
                boolean r9 = r8.mo86801m(r9, r11)
                if (r9 == 0) goto L_0x00dc
                r9 = 1
                goto L_0x00dd
            L_0x00dc:
                r9 = 0
            L_0x00dd:
                java.lang.String r11 = "tryToPlayBagAnim("
                if (r9 != 0) goto L_0x00ff
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r11)
                int r1 = r1.hashCode()
                r2.append(r1)
                java.lang.String r1 = ") can't show entrance anim!"
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
                goto L_0x0272
            L_0x00ff:
                org.libpag.PAGView r9 = r1.f181772e
                if (r9 != 0) goto L_0x01d1
                float[] r9 = r1.mo88857h()
                r13 = r9[r5]
                r14 = 0
                int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
                if (r13 <= 0) goto L_0x01b0
                r13 = r9[r4]
                int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
                if (r13 <= 0) goto L_0x01b0
                org.libpag.PAGView r13 = new org.libpag.PAGView
                android.view.ViewGroup r14 = r1.f181768a
                android.content.Context r14 = r14.getContext()
                r13.<init>(r14)
                r13.setPath(r10)
                android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r14 = 1112539136(0x42500000, float:52.0)
                int r10 = zp3.C79406f.m96347a(r10, r14)
                android.widget.FrameLayout$LayoutParams r14 = new android.widget.FrameLayout$LayoutParams
                r14.<init>(r10, r10)
                r10 = r9[r5]
                int r10 = (int) r10
                r14.leftMargin = r10
                r9 = r9[r4]
                int r9 = (int) r9
                r14.topMargin = r9
                r13.setLayoutParams(r14)
                sp1.p0 r9 = new sp1.p0
                r9.<init>(r1)
                r13.addListener(r9)
                rx3.g r9 = r1.f181773f
                rx3.n r9 = (rx3.C36570n) r9
                java.lang.Object r9 = r9.getValue()
                android.view.ViewGroup r9 = (android.view.ViewGroup) r9
                if (r9 == 0) goto L_0x0155
                r9.addView(r13)
            L_0x0155:
                qj1.c r9 = r1.f181770c
                androidx.lifecycle.i0 r2 = r9.mo87696x0(r2)
                cl1.h1 r2 = (cl1.C54979h1) r2
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "shouldPlayBagAnim:"
                r9.append(r10)
                boolean r10 = r2.f154122N
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                java.lang.String r10 = "MMFinder.LiveShopSlice"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
                r2.f154122N = r5
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r9 = "tryToPlayBagAnim layoutParams width-height:"
                r2.append(r9)
                int r9 = r14.width
                r2.append(r9)
                r9 = 45
                r2.append(r9)
                int r9 = r14.height
                r2.append(r9)
                java.lang.String r9 = ",leftMargin:"
                r2.append(r9)
                int r9 = r14.leftMargin
                r2.append(r9)
                java.lang.String r9 = ",topMargin:"
                r2.append(r9)
                int r9 = r14.topMargin
                r2.append(r9)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
                r1.f181772e = r13
                goto L_0x01d1
            L_0x01b0:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r10 = "tryToPlayBagAnim fail,bagAnimPos:"
                r2.append(r10)
                r10 = r9[r5]
                r2.append(r10)
                r10 = 44
                r2.append(r10)
                r9 = r9[r4]
                r2.append(r9)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            L_0x01d1:
                org.libpag.PAGView r2 = r1.f181772e
                if (r2 == 0) goto L_0x026a
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r11)
                int r10 = r1.hashCode()
                r9.append(r10)
                java.lang.String r10 = ") play view!"
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                java.lang.Object[] r10 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r6, r9, r10)
                r2.play()
                android.view.View r2 = r1.mo88858i()
                r9 = 8
                k20.a r10 = new k20.a
                r10.<init>()
                java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10.mo10233c(r9)
                java.lang.Object[] r14 = r10.mo10232b()
                java.lang.String r15 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveVisitorShoppingEntranceWidget"
                java.lang.String r16 = "palyBagAnim"
                java.lang.String r17 = "()V"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setVisibility"
                java.lang.String r20 = "(I)V"
                r13 = r2
                j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.Object r5 = r10.mo10231a(r5)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r2.setVisibility(r5)
                java.lang.String r14 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveVisitorShoppingEntranceWidget"
                java.lang.String r15 = "palyBagAnim"
                java.lang.String r16 = "()V"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
                r1.f181771d = r4
                java.lang.Class<ak1.w> r1 = ak1.C54116w.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                java.lang.String r2 = "getService(HellLiveVisitorReoprter::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r13 = r1
                ak1.w r13 = (ak1.C54116w) r13
                ak1.f0$r0 r14 = ak1.C54067f0.C54081r0.CommerceActionEntranceExpose
                r15 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                if (r3 != 0) goto L_0x025b
                r3 = r12
            L_0x025b:
                org.json.JSONObject r23 = r8.mo86793d(r3, r7)
                r24 = 248(0xf8, float:3.48E-43)
                r25 = 0
                java.lang.String r16 = ""
                ak1.C54116w.Rx0(r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25)
                rx3.b0 r7 = rx3.C13598b0.f38549a
            L_0x026a:
                if (r7 != 0) goto L_0x0272
                java.lang.String r1 = "tryToPlayBagAnim Play Bag Anim,bagAnimView is null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
            L_0x0272:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: sp1.C64107n0.C64115f.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public C64107n0(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f181768a = viewGroup;
        this.f181769b = bVar;
        this.f181770c = cVar;
        viewGroup.setOnClickListener(new C64108a(this));
        this.f181777j = (PAGView) viewGroup.findViewById(C0966R.C0970id.o7m);
    }

    /* renamed from: a */
    public void mo88854a() {
        Class cls = C54979h1.class;
        if (((C54979h1) this.f181770c.mo87696x0(cls)).f154137i) {
            ((C54979h1) this.f181770c.mo87696x0(cls)).mo75936G3(((C54991o) this.f181770c.mo87696x0(C54991o.class)).mo75971M3(), new C64115f(this));
        }
    }

    /* renamed from: b */
    public void mo13126b() {
        C11207i.m11072h(this.f181770c, C53872d1.f151119c, (C53934p0) null, new C64112e(this, (C15601d<? super C64112e>) null), 2, (Object) null);
    }

    /* renamed from: c */
    public void mo88855c(int i) {
        PAGView pAGView = this.f181772e;
        if (pAGView != null) {
            pAGView.setVisibility(i);
        }
    }

    /* renamed from: d */
    public boolean mo88856d() {
        return this.f181771d;
    }

    /* renamed from: e */
    public ViewGroup mo13127e() {
        return this.f181768a;
    }

    /* renamed from: f */
    public void mo13128f(boolean z) {
        if (((C54979h1) this.f181770c.mo87696x0(C54979h1.class)).f154137i) {
            if (this.f181768a.getVisibility() != 0) {
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w.Rx0((C54116w) c, C54067f0.C54081r0.CommerceActionShoppingEntranceExposed, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (JSONObject) null, 504, (Object) null);
            }
            mo13129g(0);
            return;
        }
        mo13129g(8);
    }

    /* renamed from: g */
    public void mo13129g(int i) {
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            this.f181768a.setVisibility(8);
            Log.m105928w("Finder.FinderLiveVisitorShoppingEntranceWidget", "setVisible return for isTeenMode");
        } else if (((C54991o) this.f181770c.mo87696x0(C54991o.class)).mo75999e4() || i != 0) {
            this.f181768a.setVisibility(i);
        } else {
            C54795n5 D0 = this.f181770c.mo14476D0();
            if (D0 != null) {
                D0.mo75716T(this.f181768a, i);
            }
        }
    }

    /* renamed from: h */
    public final float[] mo88857h() {
        int i;
        int measuredWidth = ((View) ((C36570n) this.f181774g).getValue()).getMeasuredWidth();
        int measuredHeight = ((View) ((C36570n) this.f181774g).getValue()).getMeasuredHeight();
        int[] iArr = new int[2];
        ((View) ((C36570n) this.f181774g).getValue()).getLocationInWindow(iArr);
        if (measuredWidth <= 0 || measuredHeight <= 0 || (i = iArr[1]) <= 0) {
            return new float[]{0.0f, 0.0f};
        }
        float f = (float) 2;
        float f2 = ((float) iArr[0]) + (((float) measuredWidth) / f);
        float f3 = ((float) i) + (((float) measuredHeight) / f);
        int a = C79406f.m96347a(MMApplicationContext.getContext(), 52.0f);
        float f4 = (float) (a / 2);
        float f5 = f2 - f4;
        float f6 = f3 - f4;
        Log.m105924i("Finder.FinderLiveVisitorShoppingEntranceWidget", "calculateBagAnimPos entranceContainerW:" + measuredWidth + ",entranceContainerH:" + measuredHeight + ",loc:" + iArr[0] + '-' + iArr[1] + ",entranceContainerCenterX:" + f2 + ",entranceContainerCenterY:" + f3 + ",size:" + a + ",animLocX:" + f5 + ",animLocY:" + f6);
        return new float[]{f5, f6};
    }

    /* renamed from: i */
    public final View mo88858i() {
        return (View) ((C36570n) this.f181775h).getValue();
    }

    public boolean isVisible() {
        return this.f181768a.getVisibility() == 0;
    }

    /* renamed from: j */
    public final void mo88859j(PAGView pAGView) {
        C87412m.m108594g(pAGView, "animView");
        try {
            if (this.f181771d && ((ViewGroup) ((C36570n) this.f181773f).getValue()) != null) {
                ViewGroup viewGroup = (ViewGroup) ((C36570n) this.f181773f).getValue();
                if (!(viewGroup != null && viewGroup.indexOfChild(pAGView) == -1)) {
                    this.f181771d = false;
                    ViewGroup viewGroup2 = (ViewGroup) ((C36570n) this.f181773f).getValue();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(pAGView);
                    }
                    this.f181772e = null;
                }
            }
        } catch (Exception e) {
            C58739j4.f168176a.mo83712h0(e, "Finder.FinderLiveVisitorShoppingEntranceWidget-hideBagAnim");
            C11348f.C11349a.m11178b(C59319a.f169618b, "ecBagAnimRemoveViewError", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
        }
    }
}
