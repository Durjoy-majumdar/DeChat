package rs1;

import a14.C0000n0;
import a14.C53934p0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import ao1.C0143d;
import bl3.C0317e;
import bl3.C39818r;
import c00.C0405n;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTimelineLbsUI;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.view.C4194v2;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.HardTouchableLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58368h1;
import dp1.C58378j1;
import dp1.C58403t;
import dp1.C58408t0;
import dp1.C58411u;
import dp1.C7419a1;
import dp1.C7421b1;
import dp1.C7422c0;
import er1.C58684b;
import er1.C58759o4;
import er1.C58784w3;
import er1.C7865r3;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8808v4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kotlin.Result;
import kotlin.ResultKt;
import nj3.C76912y0;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONObject;
import os1.C11739f;
import ot1.C11767a;
import p213oh.C11412b;
import p255vr.C65873e;
import qo3.C77407n;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C48736am1;
import te3.C50687oi1;
import te3.C64586nn1;
import u73.C14136q0;
import up1.C37521f;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;
import zt3.C119157j;

/* renamed from: rs1.r4 */
public final class C13392r4 extends UIComponent implements C4194v2 {

    /* renamed from: A */
    public final C13601g f37932A;

    /* renamed from: B */
    public int f37933B;

    /* renamed from: C */
    public int f37934C;

    /* renamed from: D */
    public int f37935D;

    /* renamed from: E */
    public final boolean f37936E;

    /* renamed from: d */
    public final C13601g f37937d = C36568h.m40985a(C13418w.f37993d);

    /* renamed from: e */
    public View f37938e;

    /* renamed from: f */
    public String f37939f = "";

    /* renamed from: g */
    public boolean f37940g;

    /* renamed from: h */
    public String f37941h = "";

    /* renamed from: i */
    public String f37942i = "";

    /* renamed from: j */
    public String f37943j = "";

    /* renamed from: n */
    public boolean f37944n;

    /* renamed from: o */
    public final int f37945o;

    /* renamed from: p */
    public final int f37946p;

    /* renamed from: q */
    public final int f37947q;

    /* renamed from: r */
    public final int f37948r;

    /* renamed from: s */
    public final int f37949s;

    /* renamed from: t */
    public final C13601g f37950t;

    /* renamed from: u */
    public final C13601g f37951u;

    /* renamed from: v */
    public final C13601g f37952v;

    /* renamed from: w */
    public final C13601g f37953w;

    /* renamed from: x */
    public final C13601g f37954x;

    /* renamed from: y */
    public final C13601g f37955y;

    /* renamed from: z */
    public final C13601g f37956z;

    /* renamed from: rs1.r4$a */
    public static final class C13393a {

        /* renamed from: a */
        public TabLayout.C55061f f37957a;

        /* renamed from: b */
        public int f37958b;

        /* renamed from: c */
        public TextView f37959c;

        /* renamed from: d */
        public WeImageView f37960d;

        /* renamed from: e */
        public ImageView f37961e;

        /* renamed from: f */
        public ImageView f37962f;

        /* renamed from: g */
        public ViewGroup f37963g;

        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1, types: [android.widget.TextView] */
        /* JADX WARNING: type inference failed for: r3v4, types: [android.widget.ImageView] */
        /* JADX WARNING: type inference failed for: r3v7 */
        /* JADX WARNING: type inference failed for: r3v8 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C13393a(com.google.android.material.tabs.TabLayout.C55061f r7, int r8) {
            /*
                r6 = this;
                java.lang.String r0 = "tab"
                gy3.C87412m.m108594g(r7, r0)
                r6.<init>()
                r6.f37957a = r7
                r6.f37958b = r8
                android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r7 = r7.getResources()
                r8 = 2131165337(0x7f070099, float:1.7944888E38)
                r7.getDimension(r8)
                android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r7 = r7.getResources()
                r8 = 2131165329(0x7f070091, float:1.7944872E38)
                r7.getDimension(r8)
                com.google.android.material.tabs.TabLayout$f r7 = r6.f37957a
                r7.f154600a = r6
                android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r8 = "getContext()"
                gy3.C87412m.m108593f(r7, r8)
                java.lang.String r8 = "window"
                java.lang.Object r8 = r7.getSystemService(r8)
                java.lang.String r0 = "null cannot be cast to non-null type android.view.WindowManager"
                gy3.C87412m.m108592e(r8, r0)
                android.view.WindowManager r8 = (android.view.WindowManager) r8
                android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
                r0.<init>()
                android.view.Display r8 = r8.getDefaultDisplay()
                if (r8 == 0) goto L_0x0052
                r8.getMetrics(r0)
            L_0x0052:
                float r8 = r0.density
                android.content.res.Resources r7 = r7.getResources()
                android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
                float r7 = r7.density
                r0 = 1097859072(0x41700000, float:15.0)
                float r0 = r0 * r8
                float r0 = r0 / r7
                android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r7 = r7.getResources()
                r8 = 2131100950(0x7f060516, float:1.7814296E38)
                int r7 = r7.getColor(r8)
                int r8 = r6.f37958b
                r1 = 2131314808(0x7f094878, float:1.8248051E38)
                r2 = 1
                r3 = 0
                r4 = 0
                if (r8 != r2) goto L_0x00ea
                com.google.android.material.tabs.TabLayout$f r8 = r6.f37957a
                r5 = 2131494706(0x7f0c0732, float:1.8612928E38)
                r8.mo76122c(r5)
                com.google.android.material.tabs.TabLayout$f r8 = r6.f37957a
                android.view.View r8 = r8.f154605f
                if (r8 == 0) goto L_0x0091
                android.view.View r8 = r8.findViewById(r1)
                android.widget.TextView r8 = (android.widget.TextView) r8
                goto L_0x0092
            L_0x0091:
                r8 = r3
            L_0x0092:
                r6.f37959c = r8
                if (r8 == 0) goto L_0x0099
                r8.setTextSize(r2, r0)
            L_0x0099:
                com.google.android.material.tabs.TabLayout$f r8 = r6.f37957a
                android.view.View r8 = r8.f154605f
                if (r8 == 0) goto L_0x00a9
                r0 = 2131314811(0x7f09487b, float:1.8248058E38)
                android.view.View r8 = r8.findViewById(r0)
                com.tencent.mm.ui.widget.imageview.WeImageView r8 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r8
                goto L_0x00aa
            L_0x00a9:
                r8 = r3
            L_0x00aa:
                r6.f37960d = r8
                com.google.android.material.tabs.TabLayout$f r8 = r6.f37957a
                android.view.View r8 = r8.f154605f
                if (r8 == 0) goto L_0x00bc
                r0 = 2131314812(0x7f09487c, float:1.824806E38)
                android.view.View r8 = r8.findViewById(r0)
                android.widget.ImageView r8 = (android.widget.ImageView) r8
                goto L_0x00bd
            L_0x00bc:
                r8 = r3
            L_0x00bd:
                r6.f37961e = r8
                com.google.android.material.tabs.TabLayout$f r8 = r6.f37957a
                android.view.View r8 = r8.f154605f
                if (r8 == 0) goto L_0x00cf
                r0 = 2131297748(0x7f0905d4, float:1.821345E38)
                android.view.View r8 = r8.findViewById(r0)
                r3 = r8
                android.widget.ImageView r3 = (android.widget.ImageView) r3
            L_0x00cf:
                r6.f37962f = r3
                com.tencent.mm.ui.widget.imageview.WeImageView r8 = r6.f37960d
                if (r8 == 0) goto L_0x0194
                er1.w3 r0 = er1.C58784w3.f168295a
                java.lang.Integer r0 = r0.mo83917b0(r2, r2)
                if (r0 == 0) goto L_0x00e2
                int r0 = r0.intValue()
                goto L_0x00e5
            L_0x00e2:
                r0 = 2131756066(0x7f100422, float:1.914303E38)
            L_0x00e5:
                r8.setImageResource(r0)
                goto L_0x0194
            L_0x00ea:
                r5 = 3
                if (r8 == r5) goto L_0x00fb
                r5 = 4
                if (r8 != r5) goto L_0x00f1
                goto L_0x00fb
            L_0x00f1:
                com.google.android.material.tabs.TabLayout$f r8 = r6.f37957a
                r0 = 2131494704(0x7f0c0730, float:1.8612924E38)
                r8.mo76122c(r0)
                goto L_0x0194
            L_0x00fb:
                com.google.android.material.tabs.TabLayout$f r8 = r6.f37957a
                r5 = 2131494705(0x7f0c0731, float:1.8612926E38)
                r8.mo76122c(r5)
                com.google.android.material.tabs.TabLayout$f r8 = r6.f37957a
                android.view.View r8 = r8.f154605f
                if (r8 == 0) goto L_0x0110
                android.view.View r8 = r8.findViewById(r1)
                android.widget.TextView r8 = (android.widget.TextView) r8
                goto L_0x0111
            L_0x0110:
                r8 = r3
            L_0x0111:
                r6.f37959c = r8
                if (r8 == 0) goto L_0x0118
                r8.setTextSize(r2, r0)
            L_0x0118:
                com.google.android.material.tabs.TabLayout$f r8 = r6.f37957a
                android.view.View r8 = r8.f154605f
                if (r8 == 0) goto L_0x0128
                r0 = 2131314805(0x7f094875, float:1.8248045E38)
                android.view.View r8 = r8.findViewById(r0)
                android.widget.ImageView r8 = (android.widget.ImageView) r8
                goto L_0x0129
            L_0x0128:
                r8 = r3
            L_0x0129:
                r6.f37961e = r8
                com.google.android.material.tabs.TabLayout$f r8 = r6.f37957a
                android.view.View r8 = r8.f154605f
                if (r8 == 0) goto L_0x013b
                r0 = 2131297747(0x7f0905d3, float:1.8213448E38)
                android.view.View r8 = r8.findViewById(r0)
                android.widget.ImageView r8 = (android.widget.ImageView) r8
                goto L_0x013c
            L_0x013b:
                r8 = r3
            L_0x013c:
                r6.f37962f = r8
                com.google.android.material.tabs.TabLayout$f r8 = r6.f37957a
                android.view.View r8 = r8.f154605f
                if (r8 == 0) goto L_0x014e
                r0 = 2131314810(0x7f09487a, float:1.8248056E38)
                android.view.View r8 = r8.findViewById(r0)
                android.view.ViewGroup r8 = (android.view.ViewGroup) r8
                goto L_0x014f
            L_0x014e:
                r8 = r3
            L_0x014f:
                r6.f37963g = r8
                if (r8 == 0) goto L_0x017d
                r0 = 2131314809(0x7f094879, float:1.8248053E38)
                android.view.View r8 = r8.findViewById(r0)
                android.widget.ImageView r8 = (android.widget.ImageView) r8
                if (r8 == 0) goto L_0x017d
                r0 = 2131755641(0x7f100279, float:1.9142167E38)
                android.view.ViewGroup r1 = r6.f37963g
                if (r1 == 0) goto L_0x0179
                android.content.Context r1 = r1.getContext()
                if (r1 == 0) goto L_0x0179
                android.content.res.Resources r1 = r1.getResources()
                if (r1 == 0) goto L_0x0179
                r5 = 2131101833(0x7f060889, float:1.7816087E38)
                int r1 = r1.getColor(r5)
                goto L_0x017a
            L_0x0179:
                r1 = 0
            L_0x017a:
                p207nl.C11216n.m11073a(r8, r0, r1)
            L_0x017d:
                com.google.android.material.tabs.TabLayout$f r8 = r6.f37957a
                android.view.View r8 = r8.f154605f
                if (r8 == 0) goto L_0x018d
                r0 = 2131314813(0x7f09487d, float:1.8248062E38)
                android.view.View r8 = r8.findViewById(r0)
                r3 = r8
                android.widget.TextView r3 = (android.widget.TextView) r3
            L_0x018d:
                if (r3 == 0) goto L_0x0194
                r8 = 1091567616(0x41100000, float:9.0)
                r3.setTextSize(r2, r8)
            L_0x0194:
                r6.mo12808b(r7, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C13392r4.C13393a.<init>(com.google.android.material.tabs.TabLayout$f, int):void");
        }

        /* renamed from: a */
        public final void mo12807a(boolean z) {
            TextView textView = this.f37959c;
            if (textView == null) {
                return;
            }
            if (z) {
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                return;
            }
            textView.getPaint().setFakeBoldText(false);
            textView.getPaint().setStrokeWidth(0.0f);
        }

        /* renamed from: b */
        public final void mo12808b(int i, boolean z) {
            TabLayout tabLayout;
            TextView textView = this.f37959c;
            if (textView != null) {
                textView.setTextColor(i);
            }
            WeImageView weImageView = this.f37960d;
            if (weImageView != null) {
                weImageView.setIconColor(i);
            }
            if (!z && (tabLayout = this.f37957a.f154606g) != null) {
                tabLayout.setSelectedTabIndicatorColor(i);
            }
        }
    }

    /* renamed from: rs1.r4$b */
    public static final class C13394b extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37964d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13394b(C13392r4 r4Var) {
            super(0);
            this.f37964d = r4Var;
        }

        public Object invoke() {
            return (WeImageView) this.f37964d.findViewById(C0966R.C0970id.a2z);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeActionBarUIC$doPrepareUser$1", mo125469f = "FinderHomeActionBarUIC.kt", mo125470l = {970}, mo125471m = "invokeSuspend")
    /* renamed from: rs1.r4$c */
    public static final class C13395c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f37965d;

        /* renamed from: e */
        public final /* synthetic */ C13392r4 f37966e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13395c(C13392r4 r4Var, C15601d<? super C13395c> dVar) {
            super(2, dVar);
            this.f37966e = r4Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C13395c(this.f37966e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13395c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f37965d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C66785b bVar = C66785b.f191882e;
                this.f37965d = 1;
                obj2 = bVar.mo90679u0(3, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m168123unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Result.m168117exceptionOrNullimpl(obj2);
            this.f37966e.f37944n = false;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.r4$d */
    public static final class C13396d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37967d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13396d(C13392r4 r4Var) {
            super(0);
            this.f37967d = r4Var;
        }

        public Object invoke() {
            return this.f37967d.findViewById(C0966R.C0970id.d3d);
        }
    }

    /* renamed from: rs1.r4$e */
    public static final class C13397e extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37968d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13397e(C13392r4 r4Var) {
            super(0);
            this.f37968d = r4Var;
        }

        public Object invoke() {
            return (WeImageView) this.f37968d.findViewById(C0966R.C0970id.m1n);
        }
    }

    /* renamed from: rs1.r4$f */
    public static final class C13398f extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37969d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13398f(C13392r4 r4Var) {
            super(0);
            this.f37969d = r4Var;
        }

        public Object invoke() {
            return (WeImageView) this.f37969d.findViewById(C0966R.C0970id.flw);
        }
    }

    /* renamed from: rs1.r4$g */
    public static final class C13399g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37970d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f37971e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13399g(C13392r4 r4Var, ViewGroup viewGroup) {
            super(0);
            this.f37970d = r4Var;
            this.f37971e = viewGroup;
        }

        public Object invoke() {
            if (this.f37970d.mo12805k3()) {
                this.f37971e.getLayoutParams().width = -1;
                this.f37971e.setScaleX(1.0f);
                this.f37971e.setScaleY(1.0f);
                Log.m105924i("Finder.HomeActionBarUIC", "afterLayout: is in expand status");
            } else {
                int childCount = this.f37971e.getChildCount();
                int i = 0;
                for (int i2 = 0; i2 < childCount; i2++) {
                    i += this.f37971e.getChildAt(i2).getWidth();
                }
                int c = C7865r3.f26468a.mo8970c();
                Log.m105924i("Finder.HomeActionBarUIC", "afterLayout width:" + i + " screenWidth:" + c);
                if (i > c) {
                    ViewGroup.LayoutParams layoutParams = this.f37971e.getLayoutParams();
                    layoutParams.width = i;
                    this.f37971e.setLayoutParams(layoutParams);
                    if (i > 0 && c > 0) {
                        this.f37971e.setPivotX(0.0f);
                        this.f37971e.setPivotY(0.0f);
                        float f = ((float) 1) / (((float) i) / ((float) c));
                        this.f37971e.setScaleX(f);
                        this.f37971e.setScaleY(f);
                    }
                } else {
                    this.f37971e.setScaleX(1.0f);
                    this.f37971e.setScaleY(1.0f);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.r4$h */
    public static final class C13400h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37972d;

        public C13400h(C13392r4 r4Var) {
            this.f37972d = r4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f37972d.getActivity().onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.r4$i */
    public static final class C13401i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37973d;

        public C13401i(C13392r4 r4Var) {
            this.f37973d = r4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C20480e0.f57583a.mo32031d();
            Intent intent = new Intent();
            C13442s8.C13443a.m12791e(C13442s8.f38060Q0, this.f37973d.getActivity(), intent, 0, (String) null, 0, 0, true, 0, WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_MD5_FAILED, (Object) null);
            AppCompatActivity activity = this.f37973d.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            MMActivity mMActivity = (MMActivity) activity;
            ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
            intent.setClass(mMActivity, FinderTimelineLbsUI.class);
            mMActivity.startActivityForResult(intent, 19999);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.r4$j */
    public static final class C13402j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37974d;

        public C13402j(C13392r4 r4Var) {
            this.f37974d = r4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C13392r4 r4Var = this.f37974d;
            r4Var.getClass();
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77239M5("TLPostCamera");
            C58408t0 t0Var = C58408t0.f167336a;
            t0Var.mo83261g(false, 1);
            if (!C11767a.f34453a.mo11659a("post")) {
                int q = C58784w3.m68441q(C58784w3.f168295a, (String) null, 1, (Object) null);
                if (q == 2) {
                    C77407n nVar = new C77407n((Context) r4Var.getActivity(), 1, true);
                    nVar.f225771i = C13476u4.f38193d;
                    nVar.f225782p = new C13486v4(r4Var);
                    View inflate = C85868k2.m106137b(r4Var.getActivity()).inflate(C0966R.C0971layout.apq, (ViewGroup) null);
                    View findViewById = inflate.findViewById(C0966R.C0970id.f5343ci);
                    if (findViewById != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = findViewById;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "doClickPostAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "doClickPostAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View findViewById2 = inflate.findViewById(C0966R.C0970id.f359391ko2);
                    if (findViewById2 != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view3 = findViewById2;
                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "doClickPostAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "doClickPostAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View findViewById3 = inflate.findViewById(C0966R.C0970id.f359390ko1);
                    if (findViewById3 != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar3.mo10233c(0);
                        View view4 = findViewById3;
                        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "doClickPostAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "doClickPostAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f359390ko1);
                    if (textView != null) {
                        textView.setText(r4Var.getActivity().getResources().getString(C0966R.string.f360451cy0));
                    }
                    nVar.mo107569n(inflate, true);
                    nVar.mo107573q();
                } else if (q == 4) {
                    C76912y0.makeText((Context) r4Var.getActivity(), (CharSequence) r4Var.getActivity().getResources().getString(C0966R.string.f7366e3), 1).show();
                    r4Var.mo12801f3(4);
                } else if (q == 5) {
                    C76912y0.makeText((Context) r4Var.getActivity(), (CharSequence) r4Var.getActivity().getResources().getString(C0966R.string.f7365e2), 1).show();
                    r4Var.mo12801f3(5);
                } else if (q == 6) {
                    C76912y0.makeText((Context) r4Var.getActivity(), (CharSequence) r4Var.getActivity().getResources().getString(C0966R.string.f7364e1), 1).show();
                    r4Var.mo12801f3(6);
                } else if (Util.isNullOrNil(C66785b.f191882e.mo90662O5())) {
                    Log.m105920e("Finder.HomeActionBarUIC", "getDefaultFinderUsername is null.");
                } else {
                    AppCompatActivity activity = r4Var.getActivity();
                    ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
                    C87412m.m108594g(activity, "context");
                    t0Var.mo83266l(3, false);
                    String str = C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond();
                    t0Var.mo83265k(str, (String) null);
                    C77407n a = C0143d.f574a.mo134a(r4Var.getActivity());
                    a.f225771i = C13501w4.f38266d;
                    a.f225782p = new C13530x4(str, activity);
                    a.f225761d = C13547y4.f38427a;
                    a.mo107573q();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.r4$k */
    public static final class C13403k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37975d;

        public C13403k(C13392r4 r4Var) {
            this.f37975d = r4Var;
        }

        public final void onClick(View view) {
            JSONArray b;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f = aVar.mo12873f(this.f37975d.getContext());
            if (f != null) {
                C58403t tVar = f.f38076K;
                C58368h1 h1Var = tVar instanceof C58368h1 ? (C58368h1) tVar : null;
                if (h1Var != null) {
                    h1Var.mo83127Q1();
                }
                C58368h1 h1Var2 = f.f38080P;
                if (h1Var2 != null) {
                    h1Var2.mo83127Q1();
                }
                C7422c0 c0Var = f.f38084T;
                if (!(c0Var instanceof C58368h1)) {
                    c0Var = null;
                }
                if (c0Var != null) {
                    c0Var.mo83127Q1();
                }
            }
            C7419a1 a1Var = C7419a1.f25592a;
            C58378j1 j1Var = C7419a1.f25594c;
            String p = C61926c.m72691p(j1Var != null ? j1Var.f167241a : 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("referrer_feed_id", p);
            synchronized (a1Var) {
                int i = C11412b.f33577a;
                Log.m105925i("Finder.SearchFeedInfoCollector", "reportBatch count:10", (Object[]) null);
                Collection<C7419a1.C7420a> values = C7419a1.f25593b.values();
                C87412m.m108593f(values, "feedInfoMap.values");
                b = a1Var.mo8553b(C110818d0.m150947s0(C110818d0.m150943o0(values, new C7421b1()), 10));
            }
            jSONObject.put("finderInfo", b);
            Log.m105924i("Finder.HomeActionBarUIC", "searchReportInfo:" + jSONObject);
            C0405n nVar = (C0405n) C86312j.m106911c(C0405n.class);
            Intent O20 = nVar.O20();
            O20.putExtra("ftsneedkeyboard", true);
            O20.putExtra("ftsbizscene", 123);
            O20.putExtra("ftsType", 14);
            O20.putExtra("key_change_search_icon", true);
            Map<String, String> hn = nVar.mo280hn(123, false, 14);
            long vk02 = ((C65873e) C86312j.m106911c(C65873e.class)).vk0(123);
            C87412m.m108593f(hn, "params");
            hn.put("sessionId", String.valueOf(vk02));
            hn.put("subSessionId", String.valueOf(vk02));
            hn.put("isSug", "1");
            O20.putExtra("sessionId", String.valueOf(vk02));
            O20.putExtra("subSessionId", String.valueOf(vk02));
            String str = nVar.mo277Vw(hn) + "&thirdExtParam=" + jSONObject;
            Log.m105924i("Finder.HomeActionBarUIC", "searchEntranceLayout url:" + str);
            O20.putExtra("rawUrl", str);
            O20.putExtra("key_load_js_without_delay", true);
            O20.putExtra("key_search_icon_and_hint_fix_default", true);
            O20.putExtra("key_preload_biz", 4);
            O20.putExtra("key_back_and_clear_query", true);
            C13442s8 f2 = aVar.mo12873f(this.f37975d.getContext());
            C58411u.f167343b = f2 != null ? f2.f38098n : null;
            C88144b.m109806x(this.f37975d.getActivity(), O20, (Bundle) null);
            C14136q0.m13469a(123, String.valueOf(vk02), String.valueOf(vk02), false, "", 14, "", false, "");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.r4$l */
    public static final class C13404l implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37976d;

        /* renamed from: rs1.r4$l$a */
        public static final class C13405a implements C85878m2.C85879a {

            /* renamed from: a */
            public final /* synthetic */ C13392r4 f37977a;

            public C13405a(C13392r4 r4Var) {
                this.f37977a = r4Var;
            }

            /* renamed from: a */
            public void mo4167a() {
                WeImageView weImageView = (WeImageView) this.f37977a.findViewById(C0966R.C0970id.m7b);
                if (weImageView != null) {
                    weImageView.setImageResource(C0966R.raw.icons_outlined_sperated);
                }
            }

            /* renamed from: b */
            public void mo4168b() {
                WeImageView weImageView = (WeImageView) this.f37977a.findViewById(C0966R.C0970id.m7b);
                if (weImageView != null) {
                    weImageView.setImageResource(C0966R.raw.icons_outlined_merge);
                }
            }
        }

        /* renamed from: rs1.r4$l$b */
        public static final class C13406b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C13392r4 f37978d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13406b(C13392r4 r4Var) {
                super(0);
                this.f37978d = r4Var;
            }

            public Object invoke() {
                AppCompatActivity activity = this.f37978d.getActivity();
                Intent intent = this.f37978d.getIntent();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$5$2", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$5$2", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return C13598b0.f38549a;
            }
        }

        public C13404l(C13392r4 r4Var) {
            this.f37976d = r4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C85878m2.m106216e(this.f37976d.getActivity().getTaskId(), new C13405a(this.f37976d));
            if (C85875k4.m106199o0() && Build.VERSION.SDK_INT >= 26) {
                this.f37976d.getActivity().finish();
                if (C85861e4.m106115b(this.f37976d.getActivity())) {
                    this.f37976d.getIntent().removeFlags(4096);
                } else {
                    this.f37976d.getIntent().addFlags(4096);
                }
                C61926c.m72666K(0, new C13406b(this.f37976d));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.r4$m */
    public static final class C13407m implements HardTouchableLayout.C7074a {

        /* renamed from: a */
        public final /* synthetic */ C13392r4 f37979a;

        /* renamed from: rs1.r4$m$a */
        public static final class C13408a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C13392r4 f37980d;

            public C13408a(C13392r4 r4Var) {
                this.f37980d = r4Var;
            }

            public final void run() {
                ((FinderHomeUIC) C39818r.f106831a.mo62444c(this.f37980d.getActivity()).mo75002a(FinderHomeUIC.class)).getActiveFragment().mo4177S();
            }
        }

        public C13407m(C13392r4 r4Var) {
            this.f37979a = r4Var;
        }

        /* renamed from: a */
        public void mo2343a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(motionEvent, "e");
            Log.m105924i("Finder.HomeActionBarUIC", "onDoubleClick ...");
            ((C119157j) C119157j.f356862d).mo183895z(new C13408a(this.f37979a));
        }
    }

    /* renamed from: rs1.r4$n */
    public static final class C13409n implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37981d;

        public C13409n(C13392r4 r4Var) {
            this.f37981d = r4Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:40:0x0102 A[SYNTHETIC, Splitter:B:40:0x0102] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0114  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r21) {
            /*
                r20 = this;
                r7 = r20
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r21
                r0.add(r1)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$7"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r20
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                rs1.s8$a r0 = rs1.C13442s8.f38060Q0
                rs1.r4 r1 = r7.f37981d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
                rs1.s8 r0 = r0.mo12873f(r1)
                r1 = 0
                if (r0 == 0) goto L_0x0035
                r2 = -1
                dp1.t r0 = r0.mo12855k3(r2)
                goto L_0x0036
            L_0x0035:
                r0 = r1
            L_0x0036:
                boolean r2 = r0 instanceof dp1.C58368h1
                r3 = 2
                r4 = 0
                if (r2 == 0) goto L_0x0057
                dp1.h1 r0 = (dp1.C58368h1) r0
                dp1.t$b r2 = dp1.C58403t.f167322q
                r5 = 3
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                rx3.l r6 = new rx3.l
                java.lang.String r8 = "feedActionType"
                r6.<init>(r8, r5)
                java.util.Map r5 = sx3.C90363p0.m113143b(r6)
                java.lang.String r2 = r2.mo83248b(r5)
                dp1.C58368h1.m67612b2(r0, r2, r4, r3, r1)
            L_0x0057:
                rs1.r4 r0 = r7.f37981d
                r0.mo12799d3(r3)
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
                com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r0.Nt0()
                java.lang.String r3 = "TLPersonalCenter"
                com.tencent.mm.plugin.finder.extension.reddot.s0 r0 = r0.mo77227G5(r3)
                if (r0 == 0) goto L_0x007a
                te3.nn1 r0 = r0.mo77308o2(r3)
                goto L_0x007b
            L_0x007a:
                r0 = r1
            L_0x007b:
                if (r0 == 0) goto L_0x007f
                r0 = 1
                goto L_0x0080
            L_0x007f:
                r0 = 0
            L_0x0080:
                java.lang.String r3 = "RED_DOT_EXIST_ON_ENTER"
                r2.putExtra(r3, r0)
                rs1.r4 r0 = r7.f37981d
                androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
                java.lang.String r3 = "activity"
                gy3.C87412m.m108594g(r0, r3)
                bl3.r r3 = bl3.C39818r.f106831a
                bl3.r$a r0 = r3.mo62444c(r0)
                java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC> r3 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC.class
                androidx.lifecycle.i0 r0 = r0.mo75002a(r3)
                com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r0 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC) r0
                com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r0 = r0.getActiveFragment()
                android.view.View r0 = r0.f165437h
                if (r0 == 0) goto L_0x00ff
                r3 = 2131312597(0x7f093fd5, float:1.8243567E38)
                android.view.View r0 = r0.findViewById(r3)
                com.tencent.mm.view.RefreshLoadMoreLayout r0 = (com.tencent.p014mm.view.RefreshLoadMoreLayout) r0
                if (r0 == 0) goto L_0x00ff
                androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
                if (r0 == 0) goto L_0x00ff
                android.graphics.Rect r3 = new android.graphics.Rect
                r3.<init>()
                androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r0.getLayoutManager()
                boolean r6 = r5 instanceof androidx.recyclerview.widget.LinearLayoutManager
                if (r6 == 0) goto L_0x00c7
                androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
                goto L_0x00c8
            L_0x00c7:
                r5 = r1
            L_0x00c8:
                if (r5 == 0) goto L_0x00ff
                int r6 = r5.mo17004z()
                int r5 = r5.mo16958D()
                if (r6 > r5) goto L_0x00ff
                r9 = r1
                r8 = 0
            L_0x00d6:
                androidx.recyclerview.widget.RecyclerView$z r10 = r0.mo17024J0(r6, r4)
                if (r10 != 0) goto L_0x00dd
                goto L_0x00fa
            L_0x00dd:
                android.view.View r11 = r10.f44854d
                java.lang.String r12 = "holder.itemView"
                gy3.C87412m.m108593f(r11, r12)
                r11.getLocalVisibleRect(r3)
                int r11 = r3.height()
                if (r11 <= r8) goto L_0x00fa
                int r8 = r3.height()
                boolean r9 = r10 instanceof jq3.C60905o
                if (r9 == 0) goto L_0x00f9
                r9 = r10
                jq3.o r9 = (jq3.C60905o) r9
                goto L_0x00fa
            L_0x00f9:
                r9 = r1
            L_0x00fa:
                if (r6 == r5) goto L_0x0100
                int r6 = r6 + 1
                goto L_0x00d6
            L_0x00ff:
                r9 = r1
            L_0x0100:
                if (r9 == 0) goto L_0x0111
                java.lang.Object r0 = r9.f173503E     // Catch:{ Exception -> 0x0107 }
                jq3.c r0 = (jq3.C9493c) r0     // Catch:{ Exception -> 0x0107 }
                goto L_0x0112
            L_0x0107:
                r0 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r4]
                java.lang.String r4 = "FinderHomeUtils"
                java.lang.String r5 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r5, r3)
            L_0x0111:
                r0 = r1
            L_0x0112:
                if (r0 == 0) goto L_0x011c
                long r0 = r0.getItemId()
                java.lang.Long r1 = java.lang.Long.valueOf(r0)
            L_0x011c:
                java.lang.String r0 = "key_ref_feed_id"
                r2.putExtra(r0, r1)
                bl3.r r0 = bl3.C39818r.f106831a
                rs1.r4 r1 = r7.f37981d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
                bl3.r$a r0 = r0.mo62444c(r1)
                java.lang.Class<rs1.s8> r1 = rs1.C13442s8.class
                androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
                rs1.s8 r0 = (rs1.C13442s8) r0
                int r0 = r0.f38096i
                java.lang.String r1 = "key_ref_comment_scene"
                r2.putExtra(r1, r0)
                rs1.s8$a r8 = rs1.C13442s8.f38060Q0
                rs1.r4 r0 = r7.f37981d
                androidx.appcompat.app.AppCompatActivity r9 = r0.getActivity()
                r11 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 252(0xfc, float:3.53E-43)
                r19 = 0
                r10 = r2
                rs1.C13442s8.C13443a.m12791e(r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19)
                java.lang.Class<er1.b> r0 = er1.C58684b.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                er1.b r0 = (er1.C58684b) r0
                rs1.r4 r1 = r7.f37981d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
                r0.Yx0(r1, r2)
                java.lang.String r0 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$7"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C13392r4.C13409n.onClick(android.view.View):void");
        }
    }

    /* renamed from: rs1.r4$o */
    public static final class C13410o implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37982d;

        public C13410o(C13392r4 r4Var) {
            this.f37982d = r4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C39622i0 a = C39818r.f106831a.mo62444c(this.f37982d.getActivity()).mo75002a(C63575n3.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…allNormalUIC::class.java)");
            C63575n3.m74909c3((C63575n3) a, false, false, false, 7, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.r4$p */
    public static final class C13411p implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37983d;

        public C13411p(C13392r4 r4Var) {
            this.f37983d = r4Var;
        }

        public final void run() {
            View findViewById;
            int color = this.f37983d.getResources().getColor(C0966R.color.f3578ya);
            C13392r4 r4Var = this.f37983d;
            r4Var.getClass();
            for (FinderHomeTabFragment view : ((FinderHomeUIC) C39818r.f106831a.mo62444c(r4Var.getActivity()).mo75002a(FinderHomeUIC.class)).mo5130f3()) {
                View view2 = view.getView();
                if (!(view2 == null || (findViewById = view2.findViewById(C0966R.C0970id.f359130j42)) == null)) {
                    findViewById.setBackgroundColor(color);
                }
            }
        }
    }

    /* renamed from: rs1.r4$q */
    public static final class C13412q implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f37984d;

        public C13412q(C32224a<C13598b0> aVar) {
            this.f37984d = aVar;
        }

        public final void run() {
            this.f37984d.invoke();
        }
    }

    /* renamed from: rs1.r4$r */
    public static final class C13413r extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f37985d;

        /* renamed from: e */
        public final /* synthetic */ int f37986e;

        /* renamed from: f */
        public final /* synthetic */ float f37987f;

        /* renamed from: g */
        public final /* synthetic */ C13392r4 f37988g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13413r(int i, int i2, float f, C13392r4 r4Var) {
            super(0);
            this.f37985d = i;
            this.f37986e = i2;
            this.f37987f = f;
            this.f37988g = r4Var;
        }

        public Object invoke() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            Log.m105924i("Finder.HomeActionBarUIC", "[onPageScrolled] position=" + this.f37985d + " positionOffsetPixels=" + this.f37986e + " percent=" + this.f37987f);
            if (this.f37985d == 0) {
                C58784w3 w3Var = C58784w3.f168295a;
                C13392r4 r4Var = this.f37988g;
                i = w3Var.mo83892O1(r4Var.f37947q, r4Var.f37945o, this.f37987f);
            } else {
                i = this.f37988g.f37945o;
            }
            TabLayout tabLayout = (TabLayout) ((C36570n) this.f37988g.f37956z).getValue();
            if (tabLayout != null) {
                tabLayout.setSelectedTabIndicatorColor(i);
            }
            if (this.f37985d == 0) {
                C58784w3 w3Var2 = C58784w3.f168295a;
                C13392r4 r4Var2 = this.f37988g;
                i2 = w3Var2.mo83892O1(r4Var2.f37947q, r4Var2.f37946p, this.f37987f);
            } else {
                i2 = this.f37988g.f37946p;
            }
            if (this.f37985d == 0) {
                C58784w3 w3Var3 = C58784w3.f168295a;
                C13392r4 r4Var3 = this.f37988g;
                i3 = w3Var3.mo83892O1(r4Var3.f37949s, r4Var3.f37946p, this.f37987f);
            } else {
                i3 = this.f37988g.f37946p;
            }
            WeImageView weImageView = (WeImageView) ((C36570n) this.f37988g.f37950t).getValue();
            if (weImageView != null) {
                weImageView.setIconColor(i2);
            }
            WeImageView weImageView2 = (WeImageView) ((C36570n) this.f37988g.f37951u).getValue();
            if (weImageView2 != null) {
                weImageView2.setIconColor(i2);
            }
            WeImageView weImageView3 = (WeImageView) ((C36570n) this.f37988g.f37952v).getValue();
            if (weImageView3 != null) {
                weImageView3.setIconColor(i2);
            }
            WeImageView weImageView4 = (WeImageView) ((C36570n) this.f37988g.f37953w).getValue();
            if (weImageView4 != null) {
                weImageView4.setIconColor(i2);
            }
            WeImageView weImageView5 = (WeImageView) ((C36570n) this.f37988g.f37954x).getValue();
            if (weImageView5 != null) {
                weImageView5.setIconColor(i2);
            }
            WeImageView weImageView6 = (WeImageView) ((C36570n) this.f37988g.f37955y).getValue();
            if (weImageView6 != null) {
                weImageView6.setIconColor(i3);
            }
            if (this.f37985d == 0) {
                C58784w3 w3Var4 = C58784w3.f168295a;
                C13392r4 r4Var4 = this.f37988g;
                i4 = w3Var4.mo83892O1(r4Var4.f37947q, r4Var4.f37945o, this.f37987f);
            } else {
                i4 = this.f37988g.f37945o;
            }
            if (this.f37985d == 0) {
                C58784w3 w3Var5 = C58784w3.f168295a;
                C13392r4 r4Var5 = this.f37988g;
                i5 = w3Var5.mo83892O1(r4Var5.f37948r, r4Var5.f37946p, this.f37987f);
            } else {
                i5 = this.f37988g.f37946p;
            }
            C13392r4 r4Var6 = this.f37988g;
            int i6 = r4Var6.f37935D;
            if (i6 == 0) {
                C13392r4.m12715c3(r4Var6, 3, i4);
                C13392r4.m12715c3(this.f37988g, 1, i5);
                C13392r4.m12715c3(this.f37988g, 4, i5);
            } else if (i6 == 1) {
                C13392r4.m12715c3(r4Var6, 3, i5);
                C13392r4.m12715c3(this.f37988g, 1, i4);
                C13392r4.m12715c3(this.f37988g, 4, i5);
            } else if (i6 == 2) {
                C13392r4.m12715c3(r4Var6, 3, i5);
                C13392r4.m12715c3(this.f37988g, 1, i5);
                C13392r4.m12715c3(this.f37988g, 4, i4);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.r4$s */
    public static final class C13414s extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37989d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13414s(C13392r4 r4Var) {
            super(0);
            this.f37989d = r4Var;
        }

        public Object invoke() {
            return (WeImageView) this.f37989d.findViewById(C0966R.C0970id.huj);
        }
    }

    /* renamed from: rs1.r4$t */
    public static final class C13415t extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37990d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13415t(C13392r4 r4Var) {
            super(0);
            this.f37990d = r4Var;
        }

        public Object invoke() {
            return (WeImageView) this.f37990d.findViewById(C0966R.C0970id.hzk);
        }
    }

    /* renamed from: rs1.r4$u */
    public static final class C13416u extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37991d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13416u(C13392r4 r4Var) {
            super(0);
            this.f37991d = r4Var;
        }

        public Object invoke() {
            return (WeImageView) this.f37991d.findViewById(C0966R.C0970id.j4j);
        }
    }

    /* renamed from: rs1.r4$v */
    public static final class C13417v extends C87413o implements C32224a<TabLayout> {

        /* renamed from: d */
        public final /* synthetic */ C13392r4 f37992d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13417v(C13392r4 r4Var) {
            super(0);
            this.f37992d = r4Var;
        }

        public Object invoke() {
            return (TabLayout) this.f37992d.findViewById(C0966R.C0970id.kci);
        }
    }

    /* renamed from: rs1.r4$w */
    public static final class C13418w extends C87413o implements C32224a<C11739f> {

        /* renamed from: d */
        public static final C13418w f37993d = new C13418w();

        public C13418w() {
            super(0);
        }

        public Object invoke() {
            return (C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13392r4(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        boolean z;
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f37945o = appCompatActivity.getResources().getColor(C0966R.color.f3593yt);
        this.f37946p = appCompatActivity.getResources().getColor(C0966R.color.f3583yg);
        this.f37947q = appCompatActivity.getResources().getColor(C0966R.color.f3133gi);
        this.f37948r = appCompatActivity.getResources().getColor(C0966R.color.f3288ma);
        this.f37949s = appCompatActivity.getResources().getColor(C0966R.color.f3572y4);
        this.f37950t = C36568h.m40985a(new C13394b(this));
        this.f37951u = C36568h.m40985a(new C13416u(this));
        this.f37952v = C36568h.m40985a(new C13415t(this));
        this.f37953w = C36568h.m40985a(new C13414s(this));
        this.f37954x = C36568h.m40985a(new C13398f(this));
        this.f37955y = C36568h.m40985a(new C13397e(this));
        this.f37956z = C36568h.m40985a(new C13417v(this));
        this.f37932A = C36568h.m40985a(new C13396d(this));
        this.f37933B = -1;
        this.f37934C = -1;
        this.f37935D = -1;
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        if (C37521f.f99322W7.mo60266n().intValue() > 0) {
            fVar.getClass();
            if (C37521f.f99315W0.mo60266n().intValue() == 2) {
                z = true;
                this.f37936E = z;
            }
        }
        z = false;
        this.f37936E = z;
    }

    /* renamed from: c3 */
    public static final void m12715c3(C13392r4 r4Var, int i, int i2) {
        C13393a i3 = r4Var.mo12803i3(i);
        if (i3 != null) {
            TextView textView = i3.f37959c;
            if (textView != null) {
                textView.setTextColor(i2);
            }
            WeImageView weImageView = i3.f37960d;
            if (weImageView != null) {
                weImageView.setIconColor(i2);
            }
        }
    }

    /* renamed from: d3 */
    public final void mo12799d3(int i) {
        C13442s8 f = C13442s8.f38060Q0.mo12873f(getActivity());
        this.f37939f = C2483o0.f12984a.mo2460j(i, f != null ? f.mo12861q3() : null, this.f37939f);
    }

    /* renamed from: e3 */
    public final void mo12800e3() {
        View findViewById = findViewById(C0966R.C0970id.j4k);
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (mo12805k3()) {
            View findViewById2 = findViewById(C0966R.C0970id.m7c);
            if (findViewById2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view = findViewById2;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById3 = findViewById(C0966R.C0970id.m1o);
            if (findViewById3 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view2 = findViewById3;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View findViewById4 = findViewById(C0966R.C0970id.m7c);
            if (findViewById4 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view3 = findViewById4;
                C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        View findViewById5 = findViewById(C0966R.C0970id.flx);
        if (findViewById5 != null) {
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view4 = findViewById5;
            C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View findViewById6 = findViewById(C0966R.C0970id.hzl);
        if (findViewById6 != null) {
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
            aVar6.mo10233c(8);
            View view5 = findViewById6;
            C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkPostEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: f3 */
    public final void mo12801f3(int i) {
        Class cls = FinderCommonFeatureService.class;
        Log.m105924i("Finder.HomeActionBarUIC", "[doPrepareUser] isPreparing=" + this.f37944n + " status=" + i);
        if (!this.f37944n) {
            this.f37944n = true;
            if (((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("TLPostCamera") == null) {
                C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("TLCamera");
            }
            C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C13395c(this, (C15601d<? super C13395c>) null), 3, (Object) null);
        }
    }

    /* renamed from: g3 */
    public final TabLayout.C55061f mo12802g3(TabLayout tabLayout, Object obj) {
        int tabCount = tabLayout.getTabCount();
        int i = 0;
        while (true) {
            Object obj2 = null;
            if (i >= tabCount) {
                return null;
            }
            TabLayout.C55061f k = tabLayout.mo146907k(i);
            if (k != null) {
                obj2 = k.f154600a;
            }
            if (obj2 instanceof C13393a) {
                Object obj3 = k.f154600a;
                C87412m.m108592e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeActionBarUIC.FinderTab");
                int i2 = ((C13393a) obj3).f37958b;
                if ((obj instanceof Integer) && i2 == ((Number) obj).intValue()) {
                    return k;
                }
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r3 = mo12802g3(r0, java.lang.Integer.valueOf(r3));
     */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rs1.C13392r4.C13393a mo12803i3(int r3) {
        /*
            r2 = this;
            r0 = 2131314801(0x7f094871, float:1.8248037E38)
            android.view.View r0 = r2.findViewById(r0)
            com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
            r1 = 0
            if (r0 == 0) goto L_0x0019
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.tabs.TabLayout$f r3 = r2.mo12802g3(r0, r3)
            if (r3 == 0) goto L_0x0019
            java.lang.Object r3 = r3.f154600a
            goto L_0x001a
        L_0x0019:
            r3 = r1
        L_0x001a:
            boolean r0 = r3 instanceof rs1.C13392r4.C13393a
            if (r0 == 0) goto L_0x0021
            r1 = r3
            rs1.r4$a r1 = (rs1.C13392r4.C13393a) r1
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13392r4.mo12803i3(int):rs1.r4$a");
    }

    /* renamed from: j3 */
    public final C11739f mo12804j3() {
        return (C11739f) ((C36570n) this.f37937d).getValue();
    }

    /* renamed from: k */
    public void mo5077k(int i, int i2, int i3, int i4) {
        this.f37935D = i2;
        this.f37933B = i4;
        this.f37934C = i3;
        if (this.f37936E) {
            if (i2 != 0) {
                C58784w3 w3Var = C58784w3.f168295a;
                Window window = getActivity().getWindow();
                C87412m.m108593f(window, "activity.window");
                w3Var.mo83945l(window, false);
                AppCompatActivity activity = getActivity();
                C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) activity).setNavigationbarColor(getActivity().getResources().getColor(C0966R.color.f3131gg));
            } else {
                C58784w3 w3Var2 = C58784w3.f168295a;
                Window window2 = getActivity().getWindow();
                C87412m.m108593f(window2, "activity.window");
                w3Var2.mo83945l(window2, true);
                AppCompatActivity activity2 = getActivity();
                C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) activity2).setNavigationbarColor(this.f37949s);
            }
            View view = (View) ((C36570n) this.f37932A).getValue();
            if (view != null) {
                view.setBackground((Drawable) null);
            }
        } else {
            C58784w3 w3Var3 = C58784w3.f168295a;
            Window window3 = getActivity().getWindow();
            C87412m.m108593f(window3, "activity.window");
            w3Var3.mo83945l(window3, false);
            AppCompatActivity activity3 = getActivity();
            C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) activity3).setNavigationbarColor(getActivity().getResources().getColor(C0966R.color.f3131gg));
            View view2 = (View) ((C36570n) this.f37932A).getValue();
            if (view2 != null) {
                view2.setBackground((Drawable) null);
            }
        }
        if (i != -1) {
            C13393a i35 = mo12803i3(this.f37933B);
            if (i35 != null) {
                i35.mo12808b(this.f37945o, false);
            }
            C13393a i36 = mo12803i3(this.f37934C);
            if (i36 != null) {
                i36.mo12808b(this.f37946p, true);
            }
        }
    }

    /* renamed from: k3 */
    public final boolean mo12805k3() {
        return C85875k4.m106197n0() && (C85875k4.m106156M(getActivity()) || (C85875k4.m106155L(getActivity().getContentResolver()) && Build.VERSION.SDK_INT >= 24 && !getActivity().isInMultiWindowMode()));
    }

    /* renamed from: l3 */
    public final void mo12806l3(int i) {
        TabLayout.C55061f k;
        Class cls = FinderCommonFeatureService.class;
        TabLayout tabLayout = (TabLayout) findViewById(C0966R.C0970id.kci);
        if (tabLayout != null && (k = tabLayout.mo146907k(i)) != null && !k.mo76120a()) {
            k.mo76121b();
            Object obj = k.f154600a;
            if ((obj instanceof C13393a ? (C13393a) obj : null) != null) {
                C48736am1 am12 = mo12804j3().f34361h;
                boolean z = true;
                am12.f130634i = 1;
                am12.f130633h = mo12804j3().f34363j;
                am12.f130632g = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("TLRecommendTab") != null;
                am12.f130631f = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("TLFollow") != null;
                am12.f130630e = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("finder_tl_hot_tab") != null;
                if (((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderEntrance") == null) {
                    z = false;
                }
                am12.f130629d = z;
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        mo12800e3();
    }

    public void onCreate(Bundle bundle) {
        View findViewById;
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        View decorView = getActivity().getWindow().getDecorView();
        C87412m.m108593f(decorView, "activity.window.decorView");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        getActivity().getWindow().setStatusBarColor(0);
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).getController().mo177059O0(getActivity(), getResources().getColor(C0966R.color.ahf));
        C74779i.m89536a(getActivity(), false);
        ActionBar supportActionBar2 = getActivity().getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.mo91112w(new ColorDrawable(0));
            supportActionBar2.mo91104o();
        }
        int f = C75044y4.m89994f(getActivity());
        View findViewById2 = findViewById(C0966R.C0970id.d3d);
        if (findViewById2 != null) {
            ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            layoutParams.height += f;
            findViewById2.setLayoutParams(layoutParams);
            findViewById2.setPadding(0, f, 0, 0);
        }
        View findViewById3 = findViewById(C0966R.C0970id.a2y);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new C13400h(this));
        }
        View findViewById4 = findViewById(C0966R.C0970id.flx);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new C13401i(this));
        }
        View findViewById5 = findViewById(C0966R.C0970id.hzl);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new C13402j(this));
        }
        View findViewById6 = findViewById(C0966R.C0970id.j4k);
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(new C13403k(this));
        }
        if (C85875k4.m106199o0() && C85875k4.m106208w()) {
            if (C85861e4.m106115b(getActivity())) {
                WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.m7b);
                if (weImageView != null) {
                    weImageView.setImageResource(C0966R.raw.icons_outlined_merge);
                }
            } else {
                WeImageView weImageView2 = (WeImageView) findViewById(C0966R.C0970id.m7b);
                if (weImageView2 != null) {
                    weImageView2.setImageResource(C0966R.raw.icons_outlined_sperated);
                }
            }
        }
        View findViewById7 = findViewById(C0966R.C0970id.m7c);
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(new C13404l(this));
        }
        HardTouchableLayout hardTouchableLayout = (HardTouchableLayout) findViewById(C0966R.C0970id.kcj);
        if (hardTouchableLayout != null) {
            hardTouchableLayout.setOnDoubleClickListener(new C13407m(this));
        }
        View findViewById8 = findViewById(C0966R.C0970id.huj);
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(new C13409n(this));
        }
        View findViewById9 = findViewById(C0966R.C0970id.m1o);
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(new C13410o(this));
        }
        TabLayout tabLayout = (TabLayout) findViewById(C0966R.C0970id.kci);
        boolean z = true;
        if (tabLayout != null) {
            int i = 0;
            for (T next : ((FinderHomeUIC) C39818r.f106831a.mo62444c(getActivity()).mo75002a(FinderHomeUIC.class)).mo5130f3()) {
                int i2 = i + 1;
                if (i >= 0) {
                    FinderHomeTabFragment finderHomeTabFragment = (FinderHomeTabFragment) next;
                    C13393a aVar = new C13393a(tabLayout.mo146908l(), finderHomeTabFragment.f17334o);
                    int i3 = finderHomeTabFragment.f17332j;
                    TextView textView = aVar.f37959c;
                    if (textView != null) {
                        C37521f fVar = C37521f.f99374d;
                        int i4 = aVar.f37958b;
                        View view = aVar.f37957a.f154605f;
                        C87412m.m108591d(view);
                        String string = view.getContext().getResources().getString(i3);
                        C87412m.m108593f(string, "tab.customView!!.context.resources.getString(id)");
                        textView.setText(fVar.mo61159M(i4, string));
                    }
                    if (finderHomeTabFragment.f17334o == 4) {
                        TabLayout.C55061f fVar2 = aVar.f37957a;
                        fVar2.f154603d = getString(C0966R.string.eqq);
                        fVar2.mo76124e();
                    }
                    if (finderHomeTabFragment.f17334o == 1) {
                        TabLayout.C55061f fVar3 = aVar.f37957a;
                        fVar3.f154603d = getString(C0966R.string.eqn);
                        fVar3.mo76124e();
                    }
                    if (finderHomeTabFragment.f17334o == 3) {
                        TabLayout.C55061f fVar4 = aVar.f37957a;
                        fVar4.f154603d = getString(C0966R.string.eql);
                        fVar4.mo76124e();
                    }
                    tabLayout.mo146889d(aVar.f37957a, false);
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            tabLayout.mo146882a(new C13439s4(this));
        }
        C61926c.m72695t(C2479n0.f12965k, getActivity(), new C13568z4(this));
        C61926c.m72695t(C2479n0.f12969o, getActivity(), new C13110a5(this));
        C61926c.m72695t(C2479n0.f12971q, getActivity(), new C13124b5(this));
        C61926c.m72695t(C2479n0.f12972r, getActivity(), new C13138c5(this));
        mo12799d3(1);
        mo12800e3();
        ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).getClass();
        if (C58759o4.f168229a.mo83760G5()) {
            View findViewById10 = findViewById(C0966R.C0970id.j4k);
            if (findViewById10 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = findViewById10;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkNearbyLiveFriends", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById10.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkNearbyLiveFriends", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (C85875k4.m106197n0() && (C85875k4.m106156M(getActivity()) || (C85875k4.m106155L(getActivity().getContentResolver()) && Build.VERSION.SDK_INT >= 24 && !getActivity().isInMultiWindowMode()))) {
                View findViewById11 = findViewById(C0966R.C0970id.m7c);
                if (findViewById11 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view3 = findViewById11;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkNearbyLiveFriends", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById11.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkNearbyLiveFriends", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View findViewById12 = findViewById(C0966R.C0970id.m1o);
                if (findViewById12 != null) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view4 = findViewById12;
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkNearbyLiveFriends", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById12.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkNearbyLiveFriends", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            View findViewById13 = findViewById(C0966R.C0970id.flx);
            if (findViewById13 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view5 = findViewById13;
                C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkNearbyLiveFriends", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById13.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkNearbyLiveFriends", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById14 = findViewById(C0966R.C0970id.hzl);
            if (findViewById14 != null) {
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar6.mo10233c(8);
                View view6 = findViewById14;
                C117292a.m165358d(view6, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkNearbyLiveFriends", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById14.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkNearbyLiveFriends", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            View findViewById15 = findViewById(C0966R.C0970id.flx);
            if (findViewById15 != null) {
                C9556a aVar7 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar7.mo10233c(8);
                View view7 = findViewById15;
                C117292a.m165358d(view7, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkFinderTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById15.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkFinderTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById16 = findViewById(C0966R.C0970id.hzl);
            if (findViewById16 != null) {
                C9556a aVar8 = new C9556a();
                ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                aVar8.mo10233c(8);
                View view8 = findViewById16;
                C117292a.m165358d(view8, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkFinderTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById16.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkFinderTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById17 = findViewById(C0966R.C0970id.j4k);
            if (findViewById17 != null) {
                C9556a aVar9 = new C9556a();
                ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                aVar9.mo10233c(8);
                View view9 = findViewById17;
                C117292a.m165358d(view9, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkFinderTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkFinderTeenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById18 = findViewById(C0966R.C0970id.kcj);
            if (findViewById18 != null) {
                findViewById18.post(new C13461t4(this));
            }
        }
        C50687oi1 oi12 = C66785b.f191882e.mo90673n0().mo62397b().f140461E;
        if (oi12 == null || oi12.f139196d != 1) {
            z = false;
        }
        if (z && (findViewById = findViewById(C0966R.C0970id.j4k)) != null) {
            C9556a aVar10 = new C9556a();
            ThreadLocal<C9556a> threadLocal9 = C60958c.f173611a;
            aVar10.mo10233c(8);
            View view10 = findViewById;
            C117292a.m165358d(view10, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkUSMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC", "checkUSMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        WeImageView weImageView3 = (WeImageView) getActivity().findViewById(C0966R.C0970id.a2z);
        if (weImageView3 != null) {
            weImageView3.setIconColor(this.f37946p);
        }
        WeImageView weImageView4 = (WeImageView) getActivity().findViewById(C0966R.C0970id.j4j);
        if (weImageView4 != null) {
            weImageView4.setIconColor(this.f37946p);
        }
        WeImageView weImageView5 = (WeImageView) getActivity().findViewById(C0966R.C0970id.m7b);
        if (weImageView5 != null) {
            weImageView5.setIconColor(this.f37946p);
        }
        WeImageView weImageView6 = (WeImageView) getActivity().findViewById(C0966R.C0970id.hzk);
        if (weImageView6 != null) {
            weImageView6.setIconColor(this.f37946p);
        }
        WeImageView weImageView7 = (WeImageView) getActivity().findViewById(C0966R.C0970id.huj);
        if (weImageView7 != null) {
            weImageView7.setIconColor(this.f37946p);
        }
        WeImageView weImageView8 = (WeImageView) getActivity().findViewById(C0966R.C0970id.flw);
        if (weImageView8 != null) {
            weImageView8.setIconColor(this.f37946p);
        }
        WeImageView weImageView9 = (WeImageView) getActivity().findViewById(C0966R.C0970id.m1n);
        if (weImageView9 != null) {
            weImageView9.setIconColor(this.f37946p);
        }
        View findViewById19 = getActivity().findViewById(C0966R.C0970id.d3d);
        if (findViewById19 != null) {
            findViewById19.setBackground((Drawable) null);
        }
        View findViewById20 = getActivity().findViewById(C0966R.C0970id.l89);
        if (findViewById20 != null) {
            findViewById20.post(new C13411p(this));
        }
        View findViewById21 = getActivity().findViewById(C0966R.C0970id.d3d);
        C87412m.m108593f(findViewById21, "activity.findViewById<Vi…R.id.finderHomeActionbar)");
        this.f37938e = findViewById21;
        ViewGroup viewGroup = (ViewGroup) getActivity().findViewById(C0966R.C0970id.d3d);
        if (viewGroup != null) {
            C61926c.m72677b(viewGroup, new C13399g(this, viewGroup));
        }
        Log.m105924i("Finder.HomeActionBarUIC", "[onCreate] lastShowFriendsAvatarRedDot=false");
    }

    public void onCreateBefore(Bundle bundle) {
        super.onCreateBefore(bundle);
        ((FinderHomeUIC) C39818r.f106831a.mo62444c(getActivity()).mo75002a(FinderHomeUIC.class)).f18653j.add(this);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (this.f37936E) {
            C13413r rVar = new C13413r(i, i2, f, this);
            TabLayout tabLayout = (TabLayout) ((C36570n) this.f37956z).getValue();
            if ((tabLayout != null ? tabLayout.getHeight() : 0) <= 0) {
                TabLayout tabLayout2 = (TabLayout) ((C36570n) this.f37956z).getValue();
                if (tabLayout2 != null) {
                    tabLayout2.post(new C13412q(rVar));
                    return;
                }
                return;
            }
            rVar.invoke();
        }
    }

    public void onPause() {
        super.onPause();
        this.f37940g = false;
    }

    public void onResume() {
        super.onResume();
        this.f37940g = true;
        C37521f.f99374d.getClass();
        int intValue = C37521f.f99446l2.mo60266n().intValue();
        if (intValue == 1) {
            C58408t0.f167336a.mo83261g(true, 1);
        } else if (intValue == 2) {
            boolean z = C66785b.f191882e.mo90662O5().length() > 0;
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[3];
            objArr[0] = 1;
            objArr[1] = Integer.valueOf(z ? 1 : 2);
            objArr[2] = 1;
            nVar.mo160131h(20971, objArr);
        }
    }

    /* renamed from: v */
    public void mo5078v(boolean z, int i, FinderHomeTabFragment finderHomeTabFragment) {
        C87412m.m108594g(finderHomeTabFragment, "fragment");
    }
}
