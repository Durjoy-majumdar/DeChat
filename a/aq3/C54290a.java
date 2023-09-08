package aq3;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.graphics.RectF;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C54208j0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.item.FloatLayerItem;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45253g;
import d14.C58095x0;
import fy3.C32224a;
import fy3.C32227p;
import gq3.C59616c;
import gq3.C59617d;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: aq3.a */
public final class C54290a extends UIComponent {

    /* renamed from: d */
    public final C13601g f152388d;

    /* renamed from: e */
    public C53973z1 f152389e;

    /* renamed from: f */
    public C53973z1 f152390f;

    /* renamed from: g */
    public final C13601g f152391g;

    /* renamed from: aq3.a$a */
    public static final class C54291a extends C87413o implements C32224a<FloatLayerItem> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f152392d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54291a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f152392d = appCompatActivity;
        }

        public Object invoke() {
            return (FloatLayerItem) this.f152392d.findViewById(C0966R.C0970id.mds);
        }
    }

    /* renamed from: aq3.a$b */
    public static final class C54292b extends C87413o implements C32224a<C59617d> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f152393d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54292b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f152393d = appCompatActivity;
        }

        public Object invoke() {
            return (C59617d) C39818r.f106831a.mo62444c(this.f152393d).mo75002a(C59617d.class);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.view.activity.ImageGalleryFloatLayerUIC$showFloatLayer$1", mo125469f = "ImageGalleryFloatLayerUIC.kt", mo125470l = {39}, mo125471m = "invokeSuspend")
    /* renamed from: aq3.a$c */
    public static final class C54293c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f152394d;

        /* renamed from: e */
        public final /* synthetic */ C54290a f152395e;

        /* renamed from: f */
        public final /* synthetic */ String f152396f;

        /* renamed from: g */
        public final /* synthetic */ String f152397g;

        /* renamed from: aq3.a$c$a */
        public static final class C54294a implements C45253g<C13604l<? extends String, ? extends ArrayList<RectF>>> {

            /* renamed from: d */
            public final /* synthetic */ String f152398d;

            /* renamed from: e */
            public final /* synthetic */ String f152399e;

            /* renamed from: f */
            public final /* synthetic */ C54290a f152400f;

            public C54294a(String str, String str2, C54290a aVar) {
                this.f152398d = str;
                this.f152399e = str2;
                this.f152400f = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0178  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r12, wx3.C15601d r13) {
                /*
                    r11 = this;
                    rx3.l r12 = (rx3.C13604l) r12
                    java.lang.StringBuilder r13 = new java.lang.StringBuilder
                    r13.<init>()
                    java.lang.String r0 = "showFloatLayer imagePath: "
                    r13.append(r0)
                    java.lang.String r0 = r11.f152398d
                    r13.append(r0)
                    java.lang.String r0 = ", keyword: "
                    r13.append(r0)
                    java.lang.String r0 = r11.f152399e
                    r13.append(r0)
                    java.lang.String r0 = "  >> result >> "
                    r13.append(r0)
                    B r0 = r12.f38556e
                    java.util.ArrayList r0 = (java.util.ArrayList) r0
                    int r0 = r0.size()
                    r13.append(r0)
                    java.lang.String r0 = ", "
                    r13.append(r0)
                    A r1 = r12.f38555d
                    java.lang.String r1 = (java.lang.String) r1
                    r13.append(r1)
                    java.lang.String r13 = r13.toString()
                    java.lang.String r1 = "MicroMsg.ImageGalleryFloatLayerUIC"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
                    A r13 = r12.f38555d
                    java.lang.String r2 = r11.f152398d
                    boolean r13 = gy3.C87412m.m108589b(r13, r2)
                    if (r13 == 0) goto L_0x01bd
                    B r13 = r12.f38556e
                    java.util.Collection r13 = (java.util.Collection) r13
                    boolean r13 = r13.isEmpty()
                    r2 = 1
                    r13 = r13 ^ r2
                    if (r13 == 0) goto L_0x01bd
                    aq3.a r13 = r11.f152400f
                    B r3 = r12.f38556e
                    java.util.ArrayList r3 = (java.util.ArrayList) r3
                    r13.getClass()
                    bl3.r r4 = bl3.C39818r.f106831a
                    androidx.appcompat.app.AppCompatActivity r13 = r13.getActivity()
                    bl3.r$a r13 = r4.mo62444c(r13)
                    java.lang.Class<aq3.g> r4 = aq3.C92068g.class
                    androidx.lifecycle.i0 r13 = r13.mo75002a(r4)
                    aq3.g r13 = (aq3.C92068g) r13
                    com.tencent.mm.ui.base.WxImageView r13 = r13.mo126057c3()
                    r4 = 0
                    if (r13 == 0) goto L_0x0175
                    android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    android.graphics.Point r5 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r5)
                    int r5 = r5.x
                    android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    android.graphics.Point r6 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r6)
                    int r6 = r6.y
                    float r7 = (float) r5
                    int r8 = r13.getImageWidth()
                    float r8 = (float) r8
                    float r7 = r7 / r8
                    int r8 = r13.getImageHeight()
                    float r8 = (float) r8
                    float r8 = r8 * r7
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    r9.<init>()
                    int r10 = r13.getImageHeight()
                    r9.append(r10)
                    r9.append(r0)
                    int r13 = r13.getImageWidth()
                    r9.append(r13)
                    r9.append(r0)
                    r9.append(r7)
                    r9.append(r0)
                    r9.append(r8)
                    r13 = 44
                    r9.append(r13)
                    r9.append(r5)
                    r9.append(r0)
                    r9.append(r6)
                    java.lang.String r13 = r9.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
                    float r13 = (float) r6
                    int r5 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                    if (r5 <= 0) goto L_0x00d9
                    goto L_0x0175
                L_0x00d9:
                    float r13 = r13 - r8
                    r5 = 2
                    float r5 = (float) r5
                    float r13 = r13 / r5
                    java.util.Iterator r3 = r3.iterator()
                L_0x00e1:
                    boolean r5 = r3.hasNext()
                    if (r5 == 0) goto L_0x0176
                    java.lang.Object r5 = r3.next()
                    android.graphics.RectF r5 = (android.graphics.RectF) r5
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r8 = "scaleRecF >> rectF: "
                    r6.append(r8)
                    float r8 = r5.top
                    r6.append(r8)
                    r6.append(r0)
                    float r8 = r5.left
                    r6.append(r8)
                    r6.append(r0)
                    float r8 = r5.right
                    r6.append(r8)
                    r6.append(r0)
                    float r8 = r5.bottom
                    r6.append(r8)
                    java.lang.String r8 = ", scale: "
                    r6.append(r8)
                    r6.append(r7)
                    java.lang.String r8 = ", offset: "
                    r6.append(r8)
                    r6.append(r13)
                    java.lang.String r6 = r6.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
                    float r6 = r5.top
                    float r6 = r6 * r7
                    float r6 = r6 + r13
                    r5.top = r6
                    float r6 = r5.right
                    float r6 = r6 * r7
                    r5.right = r6
                    float r6 = r5.left
                    float r6 = r6 * r7
                    r5.left = r6
                    float r6 = r5.bottom
                    float r6 = r6 * r7
                    float r6 = r6 + r13
                    r5.bottom = r6
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r8 = "after scaleRecF >> rectF: "
                    r6.append(r8)
                    float r8 = r5.top
                    r6.append(r8)
                    r6.append(r0)
                    float r8 = r5.left
                    r6.append(r8)
                    r6.append(r0)
                    float r8 = r5.right
                    r6.append(r8)
                    r6.append(r0)
                    float r5 = r5.bottom
                    r6.append(r5)
                    java.lang.String r5 = r6.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
                    goto L_0x00e1
                L_0x0175:
                    r2 = 0
                L_0x0176:
                    if (r2 == 0) goto L_0x01bd
                    aq3.a r13 = r11.f152400f
                    com.tencent.mm.view.item.FloatLayerItem r13 = r13.mo75093c3()
                    B r12 = r12.f38556e
                    java.util.ArrayList r12 = (java.util.ArrayList) r12
                    java.lang.String r0 = "rectFList"
                    gy3.C87412m.m108594g(r12, r0)
                    r13.f165712d = r12
                    aq3.a r12 = r11.f152400f
                    com.tencent.mm.view.item.FloatLayerItem r13 = r12.mo75093c3()
                    r13.setVisibility(r4)
                    android.view.animation.AlphaAnimation r13 = new android.view.animation.AlphaAnimation
                    r0 = 0
                    r1 = 1065353216(0x3f800000, float:1.0)
                    r13.<init>(r0, r1)
                    r0 = 150(0x96, double:7.4E-322)
                    r13.setDuration(r0)
                    com.tencent.mm.view.item.FloatLayerItem r12 = r12.mo75093c3()
                    r12.startAnimation(r13)
                    aq3.a r12 = r11.f152400f
                    a14.n0 r0 = r12.getMainScope()
                    a14.h0 r1 = a14.C53872d1.f151119c
                    r2 = 0
                    aq3.b r3 = new aq3.b
                    r13 = 0
                    r3.<init>(r12, r13)
                    r4 = 2
                    r5 = 0
                    a14.z1 r13 = a14.C53895h.m60466d(r0, r1, r2, r3, r4, r5)
                    r12.f152389e = r13
                L_0x01bd:
                    rx3.b0 r12 = rx3.C13598b0.f38549a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: aq3.C54290a.C54293c.C54294a.emit(java.lang.Object, wx3.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54293c(C54290a aVar, String str, String str2, C15601d<? super C54293c> dVar) {
            super(2, dVar);
            this.f152395e = aVar;
            this.f152396f = str;
            this.f152397g = str2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54293c(this.f152395e, this.f152396f, this.f152397g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54293c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f152394d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f152396f;
                String str2 = this.f152397g;
                ((C59617d) ((C36570n) this.f152395e.f152391g).getValue()).getClass();
                C87412m.m108594g(str, "imagePath");
                C87412m.m108594g(str2, "keyword");
                C58095x0 x0Var = new C58095x0(new C59616c(str, str2, (C15601d<? super C59616c>) null));
                C54294a aVar2 = new C54294a(this.f152396f, this.f152397g, this.f152395e);
                this.f152394d = 1;
                if (x0Var.mo31880a(aVar2, this) == aVar) {
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
    public C54290a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f152388d = C36568h.m40985a(new C54291a(appCompatActivity));
        this.f152391g = C36568h.m40985a(new C54292b(appCompatActivity));
    }

    /* renamed from: c3 */
    public final FloatLayerItem mo75093c3() {
        Object value = ((C36570n) this.f152388d).getValue();
        C87412m.m108593f(value, "<get-floatLayer>(...)");
        return (FloatLayerItem) value;
    }

    /* renamed from: d3 */
    public final void mo75094d3(String str, String str2) {
        C87412m.m108594g(str, "imagePath");
        C87412m.m108594g(str2, "keyword");
        Log.m105924i("MicroMsg.ImageGalleryFloatLayerUIC", "showFloatLayer >> imagePath: " + str + ", keyword: " + str2);
        if (str2.length() > 0) {
            C53973z1 z1Var = this.f152389e;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C53973z1 z1Var2 = this.f152390f;
            if (z1Var2 != null) {
                C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
            }
            if (mo75093c3().getVisibility() == 0) {
                mo75093c3().setVisibility(8);
            }
            this.f152390f = C53895h.m60466d(C54208j0.m60899a(this), (C66212f) null, (C53934p0) null, new C54293c(this, str, str2, (C15601d<? super C54293c>) null), 3, (Object) null);
        }
    }
}
