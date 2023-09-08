package l52;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39629l0;
import androidx.lifecycle.C54209k0;
import c30.C104289g;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45253g;
import fy3.C32226l;
import fy3.C32227p;
import g70.C87164i;
import gy3.C87412m;
import gy3.C87413o;
import i70.C87667c;
import java.lang.ref.WeakReference;
import k52.C88115a;
import kotlin.ResultKt;
import n70.C47167a;
import o52.C11353b;
import o52.C11354h;
import o52.C35106a;
import o52.C35107c;
import o52.C61944e;
import p175j0.C108504h;
import p175j0.C33487v1;
import p435a0.C103214y0;
import p583k2.C108846c;
import p721v0.C65503j;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: l52.a */
public final class C61217a extends UIComponent {

    /* renamed from: d */
    public C87667c<?, ?>.a f174260d;

    /* renamed from: e */
    public final C61944e f174261e;

    /* renamed from: f */
    public final C88115a f174262f;

    /* renamed from: g */
    public final FrameLayout f174263g;

    /* renamed from: l52.a$a */
    public static final class C61218a extends C87413o implements C32226l<Context, FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ C61217a f174264d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61218a(C61217a aVar) {
            super(1);
            this.f174264d = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((Context) obj, LocaleUtil.ITALIAN);
            return this.f174264d.f174263g;
        }
    }

    /* renamed from: l52.a$b */
    public static final class C61219b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61217a f174265d;

        /* renamed from: e */
        public final /* synthetic */ int f174266e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61219b(C61217a aVar, int i) {
            super(2);
            this.f174265d = aVar;
            this.f174266e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            this.f174265d.mo86193c3((C108504h) obj, this.f174266e | 1);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.magicbrush.scldemo.component.MagicBrushSclDemoCoreUIC", mo125469f = "MagicBrushSclDemoCoreUIC.kt", mo125470l = {59}, mo125471m = "init")
    /* renamed from: l52.a$c */
    public static final class C61220c extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f174267d;

        /* renamed from: e */
        public final /* synthetic */ C61217a f174268e;

        /* renamed from: f */
        public int f174269f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61220c(C61217a aVar, C15601d<? super C61220c> dVar) {
            super(dVar);
            this.f174268e = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f174267d = obj;
            this.f174269f |= Integer.MIN_VALUE;
            this.f174268e.mo86194d3(this);
            return C15911a.COROUTINE_SUSPENDED;
        }
    }

    /* renamed from: l52.a$d */
    public static final class C61221d implements C45253g<Object> {

        /* renamed from: d */
        public final /* synthetic */ C61217a f174270d;

        public C61221d(C61217a aVar) {
            this.f174270d = aVar;
        }

        public final Object emit(Object obj, C15601d<? super C13598b0> dVar) {
            if (obj instanceof C11353b) {
                C61217a aVar = this.f174270d;
                C11353b bVar = (C11353b) obj;
                aVar.f174260d = aVar.f174262f.mo122091i0(aVar, aVar.getActivity(), "wxf337cbaa27790mb2", bVar.f33447a, bVar.f33448b);
            } else if (obj instanceof C35107c) {
                C87667c<?, ?>.a aVar2 = this.f174270d.f174260d;
                if (aVar2 != null) {
                    ((C35107c) obj).f94183a.mo76546c(aVar2);
                }
            } else if (obj instanceof C35106a) {
                int a = C47167a.m52444a(new Integer(C75044y4.m89990b(MMApplicationContext.getContext()).x));
                C35106a aVar3 = (C35106a) obj;
                C87164i frameSet = aVar3.f94182a.getFrameSet();
                if (frameSet != null) {
                    frameSet.f252790f = a;
                }
                C61217a aVar4 = this.f174270d;
                MagicBrushSclDemoView magicBrushSclDemoView = aVar3.f94182a;
                C87667c<?, ?>.a aVar5 = aVar4.f174260d;
                if (aVar5 != null) {
                    magicBrushSclDemoView.mo76544a(aVar5);
                }
            } else if (obj instanceof C11354h) {
                C61217a aVar6 = this.f174270d;
                String str = ((C11354h) obj).f33449a;
                C87667c<?, ?>.a aVar7 = aVar6.f174260d;
                if (aVar7 != null) {
                    C104289g gVar = new C104289g();
                    gVar.put("frameSetName", "mock_tl_card_123");
                    C13598b0 b0Var = C13598b0.f38549a;
                    aVar7.mo122099a(str, gVar.toString());
                }
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.magicbrush.scldemo.component.MagicBrushSclDemoCoreUIC$onCreate$1", mo125469f = "MagicBrushSclDemoCoreUIC.kt", mo125470l = {42}, mo125471m = "invokeSuspend")
    /* renamed from: l52.a$e */
    public static final class C61222e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f174271d;

        /* renamed from: e */
        public final /* synthetic */ C61217a f174272e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61222e(C61217a aVar, C15601d<? super C61222e> dVar) {
            super(2, dVar);
            this.f174272e = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61222e(this.f174272e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61222e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f174271d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C61217a aVar2 = this.f174272e;
                this.f174271d = 1;
                aVar2.mo86194d3(this);
                return aVar;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61217a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39629l0.m42233a(appCompatActivity, (C54209k0.C54210b) null).mo75002a(C61944e.class);
        C87412m.m108593f(a, "of(activity).get(MagicBr…emoViewModel::class.java)");
        C61944e eVar = (C61944e) a;
        this.f174261e = eVar;
        C88115a aVar = new C88115a();
        aVar.f254866p = eVar;
        aVar.f254867q = new WeakReference<>(appCompatActivity);
        this.f174262f = aVar;
        this.f174263g = new FrameLayout(appCompatActivity);
    }

    /* renamed from: c3 */
    public final void mo86193c3(C108504h hVar, int i) {
        C108504h z = hVar.mo51623z(838515586);
        C61218a aVar = new C61218a(this);
        int i2 = C65503j.f188489K0;
        C108846c.m147713a(aVar, C103214y0.m136590f(C65503j.C65504a.f188490d, 0.0f, 1, (Object) null), (C32226l) null, z, 48, 4);
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C61219b(this, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo86194d3(wx3.C15601d<? super rx3.C13598b0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof l52.C61217a.C61220c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            l52.a$c r0 = (l52.C61217a.C61220c) r0
            int r1 = r0.f174269f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f174269f = r1
            goto L_0x0018
        L_0x0013:
            l52.a$c r0 = new l52.a$c
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f174267d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f174269f
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 == r3) goto L_0x002b
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x002b:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0079
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r8)
            k52.a r8 = r7.f174262f
            android.widget.FrameLayout r2 = r7.f174263g
            r8.getClass()
            java.lang.String r4 = "container"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.Class<com.tencent.mm.plugin.magicbrush.a0> r4 = com.tencent.p014mm.plugin.magicbrush.C30172a0.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            com.tencent.mm.plugin.magicbrush.a0 r4 = (com.tencent.p014mm.plugin.magicbrush.C30172a0) r4
            android.content.Context r5 = r2.getContext()
            java.lang.String r6 = "container.context"
            gy3.C87412m.m108593f(r5, r6)
            q52.g r4 = r4.mo57195t7(r5)
            r4.mo87639c(r2)
            r8.f254864n = r4
            r8.f254865o = r2
            r8.mo118863q0()
            k52.a r8 = r7.f174262f
            r8.mo121029B0()
            o52.e r8 = r7.f174261e
            d14.t0<java.lang.Object> r8 = r8.f176075d
            l52.a$d r2 = new l52.a$d
            r2.<init>(r7)
            r0.f174269f = r3
            d14.z0 r8 = (d14.C58100z0) r8
            r8.getClass()
            java.lang.Object r8 = d14.C58100z0.m67238l(r8, r2, r0)
            if (r8 != r1) goto L_0x0079
            return r1
        L_0x0079:
            rx3.d r8 = new rx3.d
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l52.C61217a.mo86194d3(wx3.d):java.lang.Object");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C61222e(this, (C15601d<? super C61222e>) null), 3, (Object) null);
    }
}
