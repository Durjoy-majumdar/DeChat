package wg1;

import a14.C0000n0;
import a14.C53934p0;
import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C0317e;
import bl3.C39818r;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84701w0;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import er1.C7777a0;
import f40.C86709a0;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import je1.C9363p2;
import je1.C9386w4;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import kotlin.ResultKt;
import n60.C100075f;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONObject;
import p140cw.C7138g;
import p159gw.C98250h;
import p200lx.C76736w;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48729ak3;
import te3.C49098d51;
import te3.C49386f61;
import te3.C49516g51;
import tf0.C13883o1;
import tf0.C13887q1;
import tf0.C64916p1;
import up1.C27696y;
import up1.C37521f;
import wg1.C15320l4;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

/* renamed from: wg1.z1 */
public final class C15370z1 extends UIComponent implements C11385n {

    /* renamed from: A */
    public final C13601g f41726A;

    /* renamed from: B */
    public final C13601g f41727B;

    /* renamed from: C */
    public final C13601g f41728C;

    /* renamed from: D */
    public final C13601g f41729D;

    /* renamed from: E */
    public final C13601g f41730E;

    /* renamed from: F */
    public final C13601g f41731F;

    /* renamed from: G */
    public boolean f41732G;

    /* renamed from: H */
    public C49516g51 f41733H;

    /* renamed from: I */
    public int f41734I;

    /* renamed from: J */
    public int f41735J;

    /* renamed from: K */
    public String f41736K;

    /* renamed from: L */
    public String f41737L;

    /* renamed from: M */
    public C58969q f41738M;

    /* renamed from: N */
    public C15320l4.C15321a f41739N = new C15320l4.C15321a();

    /* renamed from: P */
    public C89779i0 f41740P;

    /* renamed from: Q */
    public int f41741Q = 2;

    /* renamed from: R */
    public C7777a0 f41742R;

    /* renamed from: d */
    public final C13601g f41743d;

    /* renamed from: e */
    public final C13601g f41744e;

    /* renamed from: f */
    public final C13601g f41745f;

    /* renamed from: g */
    public final C13601g f41746g;

    /* renamed from: h */
    public final C13601g f41747h;

    /* renamed from: i */
    public final C13601g f41748i;

    /* renamed from: j */
    public final C13601g f41749j;

    /* renamed from: n */
    public final C13601g f41750n;

    /* renamed from: o */
    public final C13601g f41751o;

    /* renamed from: p */
    public final C13601g f41752p;

    /* renamed from: q */
    public final C13601g f41753q;

    /* renamed from: r */
    public final C13601g f41754r;

    /* renamed from: s */
    public final C13601g f41755s;

    /* renamed from: t */
    public final C13601g f41756t;

    /* renamed from: u */
    public final C13601g f41757u;

    /* renamed from: v */
    public final C13601g f41758v;

    /* renamed from: w */
    public final C13601g f41759w;

    /* renamed from: x */
    public final C13601g f41760x;

    /* renamed from: y */
    public final C13601g f41761y;

    /* renamed from: z */
    public final C13601g f41762z;

    /* renamed from: wg1.z1$a */
    public static final class C15371a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41763d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15371a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41763d = appCompatActivity;
        }

        public Object invoke() {
            return this.f41763d.findViewById(C0966R.C0970id.npa);
        }
    }

    /* renamed from: wg1.z1$a0 */
    public static final class C15372a0 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41764d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15372a0(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41764d = appCompatActivity;
        }

        public Object invoke() {
            return this.f41764d.findViewById(C0966R.C0970id.f358206ol3);
        }
    }

    /* renamed from: wg1.z1$b */
    public static final class C15373b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15373b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41765d = appCompatActivity;
        }

        public Object invoke() {
            return this.f41765d.findViewById(C0966R.C0970id.nsb);
        }
    }

    /* renamed from: wg1.z1$b0 */
    public static final class C15374b0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15370z1 f41766d;

        public C15374b0(C15370z1 z1Var) {
            this.f41766d = z1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$setAnchorBottomWithState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f41766d.mo14195j3(4);
            this.f41766d.getActivity().finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$setAnchorBottomWithState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wg1.z1$c */
    public static final class C15375c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41767d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15375c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41767d = appCompatActivity;
        }

        public Object invoke() {
            return this.f41767d.findViewById(C0966R.C0970id.ma_);
        }
    }

    /* renamed from: wg1.z1$c0 */
    public static final class C15376c0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15370z1 f41768d;

        public C15376c0(C15370z1 z1Var) {
            this.f41768d = z1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$setAnchorBottomWithState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C15370z1 z1Var = this.f41768d;
            z1Var.f41741Q = 2;
            z1Var.mo14196k3(false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$setAnchorBottomWithState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wg1.z1$d */
    public static final class C15377d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41769d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15377d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41769d = appCompatActivity;
        }

        public Object invoke() {
            return this.f41769d.findViewById(C0966R.C0970id.car);
        }
    }

    /* renamed from: wg1.z1$d0 */
    public static final class C15378d0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15370z1 f41770d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveNoticeQRCodeUIC$setQrCodeStyle$3$1$2", mo125469f = "FinderLiveNoticeQRCodeUIC.kt", mo125470l = {1235}, mo125471m = "invokeSuspend")
        /* renamed from: wg1.z1$d0$a */
        public static final class C15379a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f41771d;

            /* renamed from: e */
            public final /* synthetic */ C15370z1 f41772e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15379a(C15370z1 z1Var, C15601d<? super C15379a> dVar) {
                super(2, dVar);
                this.f41772e = z1Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C15379a(this.f41772e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C15379a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f41771d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C15370z1 z1Var = this.f41772e;
                    this.f41771d = 1;
                    obj = C15370z1.m14342c3(z1Var, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C15370z1 z1Var2 = this.f41772e;
                String e802 = ((C64916p1) C86312j.m106911c(C64916p1.class)).e80();
                BitmapUtil.saveBitmapToImage((Bitmap) obj, 80, Bitmap.CompressFormat.JPEG, e802, true);
                z1Var2.getClass();
                ((C98250h) C86312j.m106911c(C98250h.class)).mo137346Zv(z1Var2.getActivity(), e802, new C15315k2(z1Var2));
                return C13598b0.f38549a;
            }
        }

        public C15378d0(C15370z1 z1Var) {
            this.f41770d = z1Var;
        }

        public final void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$setQrCodeStyle$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C15370z1 z1Var = this.f41770d;
            if (z1Var.f41739N.f41642a) {
                z1Var.mo14195j3(5);
            } else {
                C8777j5 j5Var = (C8777j5) C86312j.m106911c(C8777j5.class);
                C54067f0.C0050b0 b0Var = C54067f0.C0050b0.LIVE_CREATE_QRCODE;
                C104289g gVar = new C104289g();
                C15370z1 z1Var2 = this.f41770d;
                gVar.mo145953n("style_id", z1Var2.f41734I);
                String str2 = z1Var2.f41737L;
                gVar.mo145953n("is_pic", ((str2 == null || str2.length() == 0) ? 1 : 0) ^ 1);
                C13598b0 b0Var2 = C13598b0.f38549a;
                String gVar2 = gVar.toString();
                C49098d51 d512 = this.f41770d.f41739N.f41643b;
                if (d512 == null || (str = d512.f132121g) == null) {
                    str = "";
                }
                j5Var.mo9608aH(b0Var, gVar2, str);
            }
            C15370z1 z1Var3 = this.f41770d;
            C0317e.launchUI$default(z1Var3, (C66212f) null, (C53934p0) null, new C15379a(z1Var3, (C15601d<? super C15379a>) null), 3, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$setQrCodeStyle$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wg1.z1$e */
    public static final class C15380e extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41773d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15380e(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41773d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f41773d.findViewById(C0966R.C0970id.du9);
        }
    }

    /* renamed from: wg1.z1$e0 */
    public static final class C15381e0 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41774d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15381e0(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41774d = appCompatActivity;
        }

        public Object invoke() {
            return this.f41774d.findViewById(C0966R.C0970id.nmb);
        }
    }

    /* renamed from: wg1.z1$f */
    public static final class C15382f extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41775d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15382f(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41775d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f41775d.findViewById(C0966R.C0970id.du_);
        }
    }

    /* renamed from: wg1.z1$f0 */
    public static final class C15383f0 extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41776d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15383f0(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41776d = appCompatActivity;
        }

        public Object invoke() {
            return this.f41776d.findViewById(C0966R.C0970id.jhs);
        }
    }

    /* renamed from: wg1.z1$g */
    public static final class C15384g extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41777d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15384g(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41777d = appCompatActivity;
        }

        public Object invoke() {
            return (LinearLayout) this.f41777d.findViewById(C0966R.C0970id.cdj);
        }
    }

    /* renamed from: wg1.z1$h */
    public static final class C15385h extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41778d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15385h(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41778d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f41778d.findViewById(C0966R.C0970id.a2y);
        }
    }

    /* renamed from: wg1.z1$i */
    public static final class C15386i extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41779d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15386i(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41779d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f41779d.findViewById(C0966R.C0970id.o7b);
        }
    }

    /* renamed from: wg1.z1$j */
    public static final class C15387j extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41780d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15387j(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41780d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f41780d.findViewById(C0966R.C0970id.o8x);
        }
    }

    /* renamed from: wg1.z1$k */
    public static final class C15388k extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41781d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15388k(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41781d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f41781d.findViewById(C0966R.C0970id.nns);
        }
    }

    /* renamed from: wg1.z1$l */
    public static final class C15389l extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41782d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15389l(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41782d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f41782d.findViewById(C0966R.C0970id.duh);
        }
    }

    /* renamed from: wg1.z1$m */
    public static final class C15390m extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41783d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15390m(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41783d = appCompatActivity;
        }

        public Object invoke() {
            return (WeImageView) this.f41783d.findViewById(C0966R.C0970id.o7n);
        }
    }

    /* renamed from: wg1.z1$n */
    public static final class C15391n extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41784d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15391n(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41784d = appCompatActivity;
        }

        public Object invoke() {
            return (LinearLayout) this.f41784d.findViewById(C0966R.C0970id.o9i);
        }
    }

    /* renamed from: wg1.z1$o */
    public static final class C15392o extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41785d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15392o(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41785d = appCompatActivity;
        }

        public Object invoke() {
            return this.f41785d.findViewById(C0966R.C0970id.gz5);
        }
    }

    /* renamed from: wg1.z1$p */
    public static final class C15393p extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41786d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15393p(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41786d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f41786d.findViewById(C0966R.C0970id.dus);
        }
    }

    /* renamed from: wg1.z1$q */
    public static final class C15394q extends C87413o implements C32224a<RoundCornerRelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41787d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15394q(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41787d = appCompatActivity;
        }

        public Object invoke() {
            return (RoundCornerRelativeLayout) this.f41787d.findViewById(C0966R.C0970id.duo);
        }
    }

    /* renamed from: wg1.z1$r */
    public static final class C15395r extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41788d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15395r(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41788d = appCompatActivity;
        }

        public Object invoke() {
            return this.f41788d.findViewById(C0966R.C0970id.j0m);
        }
    }

    /* renamed from: wg1.z1$s */
    public static final class C15396s extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41789d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15396s(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41789d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f41789d.findViewById(C0966R.C0970id.duu);
        }
    }

    /* renamed from: wg1.z1$t */
    public static final class C15397t extends C87413o implements C32224a<ScrollView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41790d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15397t(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41790d = appCompatActivity;
        }

        public Object invoke() {
            return (ScrollView) this.f41790d.findViewById(C0966R.C0970id.oa9);
        }
    }

    /* renamed from: wg1.z1$u */
    public static final class C15398u extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41791d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15398u(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41791d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f41791d.findViewById(C0966R.C0970id.duz);
        }
    }

    /* renamed from: wg1.z1$v */
    public static final class C15399v extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41792d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15399v(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41792d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f41792d.findViewById(C0966R.C0970id.o7c);
        }
    }

    /* renamed from: wg1.z1$w */
    public static final class C15400w extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41793d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15400w(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41793d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f41793d.findViewById(C0966R.C0970id.f358211m03);
        }
    }

    /* renamed from: wg1.z1$x */
    public static final class C15401x implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C15370z1 f41794d;

        public C15401x(C15370z1 z1Var) {
            this.f41794d = z1Var;
        }

        public final void run() {
            String str;
            C15370z1 z1Var = this.f41794d;
            z1Var.getClass();
            C61926c.m72668M(new C15366x2(true, z1Var, new C15318l2(z1Var)));
            C58969q qVar = z1Var.f41738M;
            String str2 = "";
            String username = qVar != null ? qVar.getUsername() : str2;
            C49098d51 d512 = z1Var.f41739N.f41643b;
            if (!(d512 == null || (str = d512.f132122h) == null)) {
                str2 = str;
            }
            C86709a0.m107524d().mo123460f(new C9386w4(username, str2));
        }
    }

    /* renamed from: wg1.z1$y */
    public static final class C15402y implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15370z1 f41795d;

        public C15402y(C15370z1 z1Var) {
            this.f41795d = z1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C49386f61 a = C15320l4.f41639a.mo14170a(this.f41795d.f41734I);
            if (a != null) {
                C15370z1 z1Var = this.f41795d;
                z1Var.mo14199n3(a);
                z1Var.mo14198m3();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wg1.z1$z */
    public static final class C15403z implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15370z1 f41796d;

        public C15403z(C15370z1 z1Var) {
            this.f41796d = z1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$onSceneEnd$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C49386f61 a = C15320l4.f41639a.mo14170a(this.f41796d.f41734I);
            if (a != null) {
                C15370z1 z1Var = this.f41796d;
                z1Var.mo14199n3(a);
                z1Var.mo14198m3();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$onSceneEnd$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15370z1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f41743d = C36568h.m40985a(new C15397t(appCompatActivity));
        this.f41744e = C36568h.m40985a(new C15382f(appCompatActivity));
        this.f41745f = C36568h.m40985a(new C15390m(appCompatActivity));
        this.f41746g = C36568h.m40985a(new C15387j(appCompatActivity));
        this.f41747h = C36568h.m40985a(new C15391n(appCompatActivity));
        this.f41748i = C36568h.m40985a(new C15393p(appCompatActivity));
        this.f41749j = C36568h.m40985a(new C15380e(appCompatActivity));
        this.f41750n = C36568h.m40985a(new C15389l(appCompatActivity));
        this.f41751o = C36568h.m40985a(new C15398u(appCompatActivity));
        this.f41752p = C36568h.m40985a(new C15396s(appCompatActivity));
        this.f41753q = C36568h.m40985a(new C15394q(appCompatActivity));
        this.f41754r = C36568h.m40985a(new C15388k(appCompatActivity));
        this.f41755s = C36568h.m40985a(new C15384g(appCompatActivity));
        this.f41756t = C36568h.m40985a(new C15385h(appCompatActivity));
        this.f41757u = C36568h.m40985a(new C15392o(appCompatActivity));
        this.f41758v = C36568h.m40985a(new C15371a(appCompatActivity));
        this.f41759w = C36568h.m40985a(new C15399v(appCompatActivity));
        this.f41760x = C36568h.m40985a(new C15400w(appCompatActivity));
        this.f41761y = C36568h.m40985a(new C15381e0(appCompatActivity));
        this.f41762z = C36568h.m40985a(new C15373b(appCompatActivity));
        this.f41726A = C36568h.m40985a(new C15377d(appCompatActivity));
        this.f41727B = C36568h.m40985a(new C15383f0(appCompatActivity));
        this.f41728C = C36568h.m40985a(new C15395r(appCompatActivity));
        this.f41729D = C36568h.m40985a(new C15375c(appCompatActivity));
        this.f41730E = C36568h.m40985a(new C15372a0(appCompatActivity));
        this.f41731F = C36568h.m40985a(new C15386i(appCompatActivity));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0096, code lost:
        if (a14.C53965x0.m60607b(100, r0) == r1) goto L_0x010e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m14342c3(wg1.C15370z1 r14, wx3.C15601d r15) {
        /*
            r14.getClass()
            boolean r0 = r15 instanceof wg1.C15325n2
            if (r0 == 0) goto L_0x0016
            r0 = r15
            wg1.n2 r0 = (wg1.C15325n2) r0
            int r1 = r0.f41653g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f41653g = r1
            goto L_0x001b
        L_0x0016:
            wg1.n2 r0 = new wg1.n2
            r0.<init>(r14, r15)
        L_0x001b:
            java.lang.Object r15 = r0.f41651e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f41653g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r14 = r0.f41650d
            wg1.z1 r14 = (wg1.C15370z1) r14
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x009a
        L_0x002f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r15)
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r15 = r14.mo14194i3()
            if (r15 == 0) goto L_0x0044
            r2 = 0
            r15.setRadius(r2)
        L_0x0044:
            android.view.View r15 = r14.mo14191e3()
            if (r15 != 0) goto L_0x004b
            goto L_0x008c
        L_0x004b:
            r2 = 4
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r13.mo10233c(r2)
            java.lang.Object[] r6 = r13.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC"
            java.lang.String r8 = "getBitmapFromView"
            java.lang.String r9 = "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r15
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r2 = r13.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r15.setVisibility(r2)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC"
            java.lang.String r7 = "getBitmapFromView"
            java.lang.String r8 = "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x008c:
            r5 = 100
            r0.f41650d = r14
            r0.f41653g = r4
            java.lang.Object r15 = a14.C53965x0.m60607b(r5, r0)
            if (r15 != r1) goto L_0x009a
            goto L_0x010e
        L_0x009a:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r15 = r14.mo14194i3()
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapFromView(r15)
            boolean r15 = r14.f41732G
            if (r15 != 0) goto L_0x00ab
            int r15 = r14.f41741Q
            if (r15 != r4) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r4 = 0
        L_0x00ac:
            if (r4 == 0) goto L_0x00f5
            android.view.View r15 = r14.mo14191e3()
            if (r15 != 0) goto L_0x00b5
            goto L_0x00f5
        L_0x00b5:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.mo10233c(r2)
            java.lang.Object[] r6 = r0.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC"
            java.lang.String r8 = "getBitmapFromView"
            java.lang.String r9 = "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r15
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = r0.mo10231a(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r15.setVisibility(r0)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC"
            java.lang.String r7 = "getBitmapFromView"
            java.lang.String r8 = "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x00f5:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r15 = r14.mo14194i3()
            if (r15 == 0) goto L_0x0109
            android.app.Activity r14 = r14.getContext()
            r0 = 20
            int r14 = com.tencent.p014mm.plugin.appbrand.p026ui.C84701w0.m104350a(r14, r0)
            float r14 = (float) r14
            r15.setRadius(r14)
        L_0x0109:
            java.lang.String r14 = "b"
            gy3.C87412m.m108593f(r1, r14)
        L_0x010e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C15370z1.m14342c3(wg1.z1, wx3.d):java.lang.Object");
    }

    /* renamed from: d3 */
    public final void mo14190d3() {
        if (!C87412m.m108589b(this.f41737L, this.f41736K)) {
            mo14197l3(this.f41736K);
        }
        int i = this.f41734I;
        int i2 = this.f41735J;
        if (i != i2) {
            this.f41734I = i2;
            C49386f61 b = C15320l4.f41639a.mo14171b(i2);
            if (b != null) {
                mo14199n3(b);
            }
            mo14198m3();
        }
    }

    /* renamed from: e3 */
    public final View mo14191e3() {
        return (View) ((C36570n) this.f41758v).getValue();
    }

    /* renamed from: f3 */
    public final TextView mo14192f3() {
        return (TextView) ((C36570n) this.f41750n).getValue();
    }

    /* renamed from: g3 */
    public final View mo14193g3() {
        return (View) ((C36570n) this.f41757u).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ail;
    }

    /* renamed from: i3 */
    public final RoundCornerRelativeLayout mo14194i3() {
        return (RoundCornerRelativeLayout) ((C36570n) this.f41753q).getValue();
    }

    /* renamed from: j3 */
    public final void mo14195j3(int i) {
        String jSONObject = new JSONObject().put("type", i).toString();
        C87412m.m108593f(jSONObject, "JSONObject().put(\"type\", action).toString()");
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_QRCODE, jSONObject, (String) null, 4, (Object) null);
    }

    /* renamed from: k3 */
    public final void mo14196k3(boolean z) {
        int i = this.f41741Q;
        if (i == 2) {
            View view = (View) ((C36570n) this.f41762z).getValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = (View) ((C36570n) this.f41729D).getValue();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View e3 = mo14191e3();
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(4);
            View view3 = e3;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((ImageView) ((C36570n) this.f41756t).getValue()).setImageDrawable(getContext().getResources().getDrawable(C0966R.raw.icons_outlined_close));
            ((LinearLayout) ((C36570n) this.f41755s).getValue()).setOnClickListener(new C15374b0(this));
            View g3 = mo14193g3();
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view4 = g3;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!z) {
                mo14190d3();
            }
        } else {
            boolean z2 = true;
            if (i == 1) {
                View view5 = (View) ((C36570n) this.f41762z).getValue();
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar5.mo10233c(8);
                C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view6 = (View) ((C36570n) this.f41729D).getValue();
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(0);
                C117292a.m165358d(view6, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (this.f41732G || this.f41741Q != 1) {
                    z2 = false;
                }
                if (z2) {
                    View e35 = mo14191e3();
                    C9556a aVar7 = new C9556a();
                    aVar7.mo10233c(0);
                    View view7 = e35;
                    C117292a.m165358d(view7, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    e35.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                ((LinearLayout) ((C36570n) this.f41755s).getValue()).setOnClickListener(new C15376c0(this));
                ((ImageView) ((C36570n) this.f41756t).getValue()).setImageDrawable(getContext().getResources().getDrawable(C0966R.raw.icons_outlined_back));
                View g35 = mo14193g3();
                C9556a aVar8 = new C9556a();
                aVar8.mo10233c(8);
                View view8 = g35;
                C117292a.m165358d(view8, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                g35.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.f41739N.f41642a) {
            View g36 = mo14193g3();
            C9556a aVar9 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar9.mo10233c(8);
            View view9 = g36;
            C117292a.m165358d(view9, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g36.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setAnchorBottomWithState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: l3 */
    public final void mo14197l3(String str) {
        this.f41737L = str;
        if (str == null || str.length() == 0) {
            ImageView imageView = (ImageView) ((C36570n) this.f41754r).getValue();
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ((LinearLayout) ((C36570n) this.f41747h).getValue()).setPadding(C84701w0.m104350a(getContext(), 32), C84701w0.m104350a(getContext(), 80), C84701w0.m104350a(getContext(), 32), C84701w0.m104350a(getContext(), 40));
            ViewGroup.LayoutParams layoutParams = mo14192f3().getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof LinearLayout.LayoutParams)) {
                ((LinearLayout.LayoutParams) layoutParams).topMargin = C84701w0.m104350a(getContext(), 64);
                mo14192f3().setLayoutParams(layoutParams);
            }
        } else {
            C100075f.C100076a aVar = new C100075f.C100076a();
            aVar.f293176b = true;
            aVar.f293175a = false;
            C37521f fVar = C37521f.f99374d;
            aVar.f293181g = fVar.mo61198x();
            aVar.f293180f = fVar.mo61199y();
            C100075f a = aVar.mo139398a();
            C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2();
            C11984n0 n0Var = new C11984n0(this.f41737L, C27696y.THUMB_IMAGE);
            ImageView imageView2 = (ImageView) ((C36570n) this.f41754r).getValue();
            C87412m.m108593f(imageView2, "mCoverImageView");
            f2.mo85957c(n0Var, imageView2, a);
            ImageView imageView3 = (ImageView) ((C36570n) this.f41754r).getValue();
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            ((LinearLayout) ((C36570n) this.f41747h).getValue()).setPadding(C84701w0.m104350a(getContext(), 32), C84701w0.m104350a(getContext(), 40), C84701w0.m104350a(getContext(), 32), C84701w0.m104350a(getContext(), 40));
            ViewGroup.LayoutParams layoutParams2 = mo14192f3().getLayoutParams();
            if (layoutParams2 != null && (layoutParams2 instanceof LinearLayout.LayoutParams)) {
                ((LinearLayout.LayoutParams) layoutParams2).topMargin = C84701w0.m104350a(getContext(), 40);
                mo14192f3().setLayoutParams(layoutParams2);
            }
        }
        mo14192f3().setVisibility(4);
        C0317e.launchUI$default(this, (C66212f) null, (C53934p0) null, new C15322m2(this, (C15601d<? super C15322m2>) null), 3, (Object) null);
    }

    /* renamed from: m3 */
    public final void mo14198m3() {
        Bitmap bitmap;
        LinkedList<C48729ak3> linkedList;
        Class cls = C76736w.class;
        C49516g51 g512 = this.f41733H;
        C13598b0 b0Var = null;
        if (g512 == null || (linkedList = g512.f133862i) == null) {
            bitmap = null;
        } else {
            bitmap = null;
            for (C48729ak3 ak32 : linkedList) {
                if (ak32.f130595e.contains(Integer.valueOf(this.f41734I))) {
                    C89349b bVar = ak32.f130594d;
                    bitmap = BitmapUtil.decodeByteArray(bVar != null ? bVar.f257327a : null);
                }
            }
        }
        if (bitmap == null) {
            C49516g51 g513 = this.f41733H;
            if (!Util.isNullOrNil(g513 != null ? g513.f133859f : null)) {
                StringBuilder sb = new StringBuilder();
                sb.append("notice qrCode: ");
                C49516g51 g514 = this.f41733H;
                sb.append(g514 != null ? g514.f133859f : null);
                Log.m105924i("FinderLiveNoticeQRCodeUIC", sb.toString());
                C49516g51 g515 = this.f41733H;
                String str = g515 != null ? g515.f133859f : null;
                bitmap = str == null ? null : ((C76736w) C86312j.m106911c(cls)).mo106913qj(getActivity(), str, 12, 0);
            } else {
                if (this.f41739N.mo14173a().length() > 0) {
                    Log.m105924i("FinderLiveNoticeQRCodeUIC", "living qrCode: " + this.f41739N.mo14173a());
                    bitmap = ((C76736w) C86312j.m106911c(cls)).mo106913qj(getActivity(), this.f41739N.mo14173a(), 12, 0);
                }
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
        if (bitmap != null) {
            ((ImageView) ((C36570n) this.f41752p).getValue()).setImageBitmap(bitmap);
            View view = (View) ((C36570n) this.f41761y).getValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setQrCodeStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "setQrCodeStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((View) ((C36570n) this.f41728C).getValue()).setOnClickListener(new C15378d0(this));
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            C76912y0.m92769h(getActivity(), getActivity().getResources().getString(C0966R.string.dzr), C0966R.raw.icons_filled_close);
        }
    }

    /* renamed from: n3 */
    public final void mo14199n3(C49386f61 f612) {
        String str;
        C49386f61 f613 = f612;
        C11978e0.C11979a aVar = C11978e0.C11979a.DEFAULT;
        C27696y yVar = C27696y.THUMB_IMAGE;
        Class cls = C11990s0.class;
        Class cls2 = C60200t1.class;
        Log.m105924i("FinderLiveNoticeQRCodeUIC", "#setStyleToUI bg_type=" + f613.f133310e + " bg_sub_type=" + f613.f133311f + " fg_color=" + f613.f133312g + " finder_logo_color=" + f613.f133313h + " auth_icon_url=" + f613.f133314i);
        this.f41734I = f613.f133309d;
        int i = f613.f133310e;
        boolean z = false;
        String str2 = null;
        if (i == 0) {
            String str3 = f613.f133311f;
            if (str3 != null) {
                if (!(str3.length() > 0)) {
                    str3 = null;
                }
                if (str3 != null) {
                    try {
                        ((ImageView) ((C36570n) this.f41746g).getValue()).setImageBitmap((Bitmap) null);
                        ((ImageView) ((C36570n) this.f41746g).getValue()).setBackgroundColor(Color.parseColor(str3));
                    } catch (Exception e) {
                        Log.m105920e("FinderLiveNoticeQRCodeUIC", e.toString());
                    }
                }
            }
        } else if (i == 1) {
            C58969q qVar = this.f41738M;
            if (qVar != null) {
                if (!(qVar.getUsername().length() > 0)) {
                    qVar = null;
                }
                if (qVar != null) {
                    C7335d c = C86312j.m106911c(cls2);
                    C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                    C60200t1.C60201a.m70367e((C60200t1) c, qVar.getAvatarUrl(), (ImageView) ((C36570n) this.f41746g).getValue(), (C11978e0.C11979a) null, 4, (Object) null);
                }
            }
        } else if (i == 2 && (str = f613.f133311f) != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                C39818r rVar = C39818r.f106831a;
                C60979d<C100810g0> f2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                C11984n0 n0Var = new C11984n0(str, yVar);
                ImageView imageView = (ImageView) ((C36570n) this.f41746g).getValue();
                C87412m.m108593f(imageView, "mContentStyleBg");
                f2.mo85957c(n0Var, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
            }
        }
        String str4 = f613.f133312g;
        if (str4 != null) {
            if (!(str4.length() > 0)) {
                str4 = null;
            }
            if (str4 != null) {
                try {
                    int parseColor = Color.parseColor(str4);
                    ((TextView) ((C36570n) this.f41748i).getValue()).setTextColor(parseColor);
                    mo14192f3().setTextColor(parseColor);
                    ((TextView) ((C36570n) this.f41751o).getValue()).setTextColor(parseColor);
                    ((TextView) ((C36570n) this.f41759w).getValue()).setTextColor(parseColor);
                    ((TextView) ((C36570n) this.f41760x).getValue()).setTextColor(parseColor);
                } catch (Exception e2) {
                    Log.m105920e("FinderLiveNoticeQRCodeUIC", e2.toString());
                }
            }
        }
        String str5 = f613.f133313h;
        if (str5 != null) {
            if (!(str5.length() > 0)) {
                str5 = null;
            }
            if (str5 != null) {
                try {
                    ((WeImageView) ((C36570n) this.f41745f).getValue()).setIconColor(Color.parseColor(str5));
                } catch (Exception e3) {
                    Log.m105920e("FinderLiveNoticeQRCodeUIC", e3.toString());
                }
            }
        }
        String str6 = f613.f133314i;
        if (str6 != null) {
            if (str6.length() > 0) {
                z = true;
            }
            if (z) {
                str2 = str6;
            }
            if (str2 != null) {
                C39818r rVar2 = C39818r.f106831a;
                C60979d<C100810g0> f25 = ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                C11984n0 n0Var2 = new C11984n0(str2, yVar);
                ImageView imageView2 = (ImageView) ((C36570n) this.f41749j).getValue();
                C87412m.m108593f(imageView2, "mAuthView");
                f25.mo85957c(n0Var2, imageView2, ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        String str = null;
        if (i != 1000) {
            if (i == 100113 && i2 == -1) {
                CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = intent != null ? (CaptureDataManager.CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO") : null;
                if (captureVideoNormalModel != null) {
                    str = captureVideoNormalModel.f272895f;
                }
                Log.m105924i("FinderLiveNoticeQRCodeUIC", "REQUEST_CODE_EDIT_AND_CROP_IMAGE filePath: " + str);
                if (str == null || !C86013q1.m106450k(str)) {
                    Log.m105920e("FinderLiveNoticeQRCodeUIC", "REQUEST_CODE_EDIT_AND_CROP_IMAGE ERROR! filePath=" + str);
                    return;
                }
                mo14197l3(str);
            }
        } else if (intent != null && i2 == -1) {
            Uri data = intent.getData();
            if (data != null) {
                str = data.getPath();
            }
            if (Util.isNullOrNil(str)) {
                str = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(getActivity(), intent, ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76713pw());
            }
            String str2 = str;
            Log.m105924i("FinderLiveNoticeQRCodeUIC", "REQUEST_CODE_SELECT_IMAGE filePath[" + str2 + "] " + intent);
            if (str2 != null) {
                C7777a0 a0Var = new C7777a0(getActivity(), 100113);
                this.f41742R = a0Var;
                a0Var.mo8889a(str2, C7777a0.f26271h.mo8891a(), 1.3333334f, getActivity().getResources().getColor(C0966R.color.a_j), false);
            } else {
                return;
            }
        }
        C7777a0 a0Var2 = this.f41742R;
        if (a0Var2 != null) {
            a0Var2.mo8890b(i2);
        }
    }

    public boolean onBackPressed() {
        if (this.f41741Q != 1) {
            return super.onBackPressed();
        }
        this.f41741Q = 2;
        mo14196k3(false);
        return true;
    }

    public void onBeforeFinish(Intent intent) {
        super.onBeforeFinish(intent);
        if (getIntent().getBooleanExtra("KEY_FINDER_LIVE_NOTICE_QR_NEED_BACK_PROFILE", false)) {
            Intent intent2 = new Intent();
            intent2.putExtra("finder_username", C66785b.f191882e.mo90662O5());
            intent2.putExtra("KEY_FINDER_SELF_FLAG", true);
            C49098d51 d512 = this.f41739N.f41643b;
            intent2.putExtra("KEY_FINDER_LIVE_NOTICE_INFO", d512 != null ? d512.toByteArray() : null);
            C7335d c = C86312j.m106911c(C64916p1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            C64916p1.C64917a.m76443j((C64916p1) c, getActivity(), intent2, 0, (String) null, 0, 0, false, 124, (Object) null);
            ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13272V1(getActivity(), intent2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r6 = r19
            super.onCreate(r20)
            androidx.appcompat.app.AppCompatActivity r0 = r19.getActivity()
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "KEY_FINDER_LIVE_NOTICE_QR_CONTACT"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 == 0) goto L_0x001d
            fe1.d$b r1 = fe1.C58961d.f168673a
            fe1.q r0 = r1.mo84155b(r0)
            r6.f41738M = r0
        L_0x001d:
            androidx.appcompat.app.AppCompatActivity r0 = r19.getActivity()
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "KEY_FINDER_LIVE_NOTICE_QR_INFO"
            byte[] r0 = r0.getByteArrayExtra(r1)
            r7 = 0
            if (r0 == 0) goto L_0x003c
            te3.d51 r1 = new te3.d51
            r1.<init>()
            r1.parseFrom(r0)
            wg1.l4$a r0 = r6.f41739N
            r0.f41643b = r1
            r0.f41642a = r7
        L_0x003c:
            androidx.appcompat.app.AppCompatActivity r0 = r19.getActivity()
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "KEY_FINDER_LIVE_LIVING_QR_INFO"
            byte[] r0 = r0.getByteArrayExtra(r1)
            r8 = 1
            if (r0 == 0) goto L_0x005b
            te3.o81 r1 = new te3.o81
            r1.<init>()
            r1.parseFrom(r0)
            wg1.l4$a r0 = r6.f41739N
            r0.f41644c = r1
            r0.f41642a = r8
        L_0x005b:
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            rx3.g r2 = r6.f41743d
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.widget.ScrollView r2 = (android.widget.ScrollView) r2
            wg1.u2 r3 = wg1.C15355u2.f41707d
            r2.setOnTouchListener(r3)
            fe1.q r2 = r6.f41738M
            r3 = 0
            if (r2 == 0) goto L_0x010e
            java.lang.String r4 = r2.getUsername()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x007f
            r4 = 1
            goto L_0x0080
        L_0x007f:
            r4 = 0
        L_0x0080:
            if (r4 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r2 = r3
        L_0x0084:
            if (r2 == 0) goto L_0x010e
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62446e(r1)
            bl3.c r5 = r5.mo62447c(r0)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11872i2()
            pl1.f r9 = new pl1.f
            java.lang.String r10 = r2.getAvatarUrl()
            r11 = 2
            r9.<init>(r10, r3, r11, r3)
            rx3.g r10 = r6.f41744e
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            java.lang.String r11 = "mAvatarView"
            gy3.C87412m.m108593f(r10, r11)
            pl1.e0$a r11 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r1 = r4.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r11)
            r5.mo85957c(r9, r10, r0)
            rx3.g r0 = r6.f41748i
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            androidx.appcompat.app.AppCompatActivity r4 = r19.getActivity()
            java.lang.String r5 = r2.getNickname()
            android.text.SpannableString r1 = r1.mo107057T1(r4, r5)
            r0.setText(r1)
            java.lang.Class<tf0.p1> r0 = tf0.C64916p1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r1 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r9 = r0
            tf0.p1 r9 = (tf0.C64916p1) r9
            rx3.g r0 = r6.f41749j
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            r10 = r0
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            java.lang.String r0 = "mAuthView"
            gy3.C87412m.m108593f(r10, r0)
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r11 = r2.field_authInfo
            r12 = 0
            r13 = 0
            r14 = 12
            r15 = 0
            tf0.C64916p1.C64917a.m76444k(r9, r10, r11, r12, r13, r14, r15)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x010f
        L_0x010e:
            r0 = r3
        L_0x010f:
            if (r0 != 0) goto L_0x0118
            androidx.appcompat.app.AppCompatActivity r0 = r19.getActivity()
            r0.finish()
        L_0x0118:
            wg1.l4$a r0 = r6.f41739N
            boolean r1 = r0.f41642a
            if (r1 == 0) goto L_0x011f
            goto L_0x012d
        L_0x011f:
            te3.d51 r1 = r0.f41643b
            if (r1 == 0) goto L_0x012f
            java.lang.String r1 = r1.f132122h
            if (r1 == 0) goto L_0x012f
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x012f
        L_0x012d:
            r1 = 1
            goto L_0x0130
        L_0x012f:
            r1 = 0
        L_0x0130:
            if (r1 == 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r0 = r3
        L_0x0134:
            r9 = 4
            java.lang.String r10 = ""
            if (r0 == 0) goto L_0x020c
            androidx.appcompat.app.AppCompatActivity r1 = r19.getActivity()
            android.content.res.Resources r1 = r1.getResources()
            boolean r2 = r0.f41642a
            if (r2 == 0) goto L_0x0146
            goto L_0x0151
        L_0x0146:
            te3.d51 r4 = r0.f41643b
            if (r4 == 0) goto L_0x0151
            te3.nc3 r4 = r4.f132128q
            if (r4 == 0) goto L_0x0151
            boolean r4 = r4.f138532d
            goto L_0x0152
        L_0x0151:
            r4 = 0
        L_0x0152:
            if (r4 == 0) goto L_0x0158
            r4 = 2131828273(0x7f111e31, float:1.9289482E38)
            goto L_0x015b
        L_0x0158:
            r4 = 2131828272(0x7f111e30, float:1.928948E38)
        L_0x015b:
            java.lang.Object[] r5 = new java.lang.Object[r8]
            er1.j4 r11 = er1.C58739j4.f168176a
            if (r2 == 0) goto L_0x0168
            te3.o81 r2 = r0.f41644c
            if (r2 == 0) goto L_0x016f
            int r2 = r2.f139018e
            goto L_0x0170
        L_0x0168:
            te3.d51 r2 = r0.f41643b
            if (r2 == 0) goto L_0x016f
            int r2 = r2.f132118d
            goto L_0x0170
        L_0x016f:
            r2 = 0
        L_0x0170:
            long r12 = (long) r2
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r14
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r15 = 0
            r16 = 4
            r17 = 0
            java.lang.String r2 = er1.C58739j4.m68254u(r11, r12, r14, r15, r16, r17)
            r5[r7] = r2
            java.lang.String r1 = r1.getString(r4, r5)
            java.lang.String r2 = "activity.resources.getSt…000L, true)\n            )"
            gy3.C87412m.m108593f(r1, r2)
            boolean r2 = r0.f41642a
            if (r2 == 0) goto L_0x0198
            te3.o81 r2 = r0.f41644c
            if (r2 == 0) goto L_0x01a0
            java.lang.String r2 = r2.f139019f
            if (r2 != 0) goto L_0x01a1
            goto L_0x01a0
        L_0x0198:
            te3.d51 r2 = r0.f41643b
            if (r2 == 0) goto L_0x01a0
            java.lang.String r2 = r2.f132121g
            if (r2 != 0) goto L_0x01a1
        L_0x01a0:
            r2 = r10
        L_0x01a1:
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x01a9
            r2 = 1
            goto L_0x01aa
        L_0x01a9:
            r2 = 0
        L_0x01aa:
            if (r2 != r8) goto L_0x01ae
            r2 = 1
            goto L_0x01af
        L_0x01ae:
            r2 = 0
        L_0x01af:
            if (r2 == 0) goto L_0x01dc
            android.widget.TextView r2 = r19.mo14192f3()
            boolean r4 = r0.f41642a
            if (r4 == 0) goto L_0x01c2
            te3.o81 r0 = r0.f41644c
            if (r0 == 0) goto L_0x01ca
            java.lang.String r0 = r0.f139019f
            if (r0 != 0) goto L_0x01cb
            goto L_0x01ca
        L_0x01c2:
            te3.d51 r0 = r0.f41643b
            if (r0 == 0) goto L_0x01ca
            java.lang.String r0 = r0.f132121g
            if (r0 != 0) goto L_0x01cb
        L_0x01ca:
            r0 = r10
        L_0x01cb:
            r2.setText(r0)
            rx3.g r0 = r6.f41751o
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
            goto L_0x01f2
        L_0x01dc:
            android.widget.TextView r0 = r19.mo14192f3()
            r0.setText(r1)
            rx3.g r0 = r6.f41751o
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 8
            r0.setVisibility(r1)
        L_0x01f2:
            android.widget.TextView r0 = r19.mo14192f3()
            r0.setVisibility(r9)
            wg1.m2 r4 = new wg1.m2
            r4.<init>(r6, r3)
            r1 = 0
            r2 = 0
            r5 = 3
            r11 = 0
            r0 = r19
            r3 = r4
            r4 = r5
            r5 = r11
            bl3.C0317e.launchUI$default(r0, r1, r2, r3, r4, r5)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x020c:
            if (r3 != 0) goto L_0x0215
            androidx.appcompat.app.AppCompatActivity r0 = r19.getActivity()
            r0.finish()
        L_0x0215:
            androidx.appcompat.app.AppCompatActivity r0 = r19.getActivity()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165371(0x7f0700bb, float:1.7944957E38)
            int r0 = r0.getDimensionPixelOffset(r1)
            rx3.g r1 = r6.f41755s
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            androidx.appcompat.app.AppCompatActivity r2 = r19.getActivity()
            int r2 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r2)
            r1.setPadding(r0, r2, r0, r7)
            rx3.g r1 = r6.f41755s
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            wg1.v2 r2 = new wg1.v2
            r2.<init>(r6)
            r1.setOnClickListener(r2)
            android.view.View r1 = r19.mo14193g3()
            androidx.appcompat.app.AppCompatActivity r2 = r19.getActivity()
            int r2 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r2)
            r1.setPadding(r0, r2, r0, r7)
            android.view.View r0 = r19.mo14193g3()
            wg1.w2 r1 = new wg1.w2
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            android.view.View r0 = r19.mo14191e3()
            wg1.t2 r1 = new wg1.t2
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            r6.mo14196k3(r7)
            rx3.g r0 = r6.f41727B
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            wg1.o2 r1 = new wg1.o2
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            rx3.g r0 = r6.f41726A
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            wg1.p2 r1 = new wg1.p2
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            rx3.g r0 = r6.f41730E
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            wg1.q2 r1 = new wg1.q2
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r1 = 4214(0x1076, float:5.905E-42)
            r0.mo123455a(r1, r6)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r1 = 6653(0x19fd, float:9.323E-42)
            r0.mo123455a(r1, r6)
            wg1.l4$a r0 = r6.f41739N
            boolean r0 = r0.f41642a
            if (r0 != 0) goto L_0x02d1
            android.view.View r0 = r19.getRootView()
            wg1.z1$x r1 = new wg1.z1$x
            r1.<init>(r6)
            r0.post(r1)
            goto L_0x03fe
        L_0x02d1:
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r1 = "KEY_FINDER_LIVE_NOTICE_QR_IS_MOD_PIC_DISABLE"
            boolean r0 = r0.getBooleanExtra(r1, r7)
            r6.f41732G = r0
            if (r0 != 0) goto L_0x02e4
            int r0 = r6.f41741Q
            if (r0 != r8) goto L_0x02e4
            goto L_0x02e5
        L_0x02e4:
            r8 = 0
        L_0x02e5:
            if (r8 != 0) goto L_0x032b
            android.view.View r0 = r19.mo14191e3()
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r1.mo10233c(r2)
            java.lang.Object[] r12 = r1.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC"
            java.lang.String r14 = "onCreate"
            java.lang.String r15 = "(Landroid/os/Bundle;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r1 = r1.mo10231a(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC"
            java.lang.String r13 = "onCreate"
            java.lang.String r14 = "(Landroid/os/Bundle;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x032b:
            wg1.l4$a r0 = r6.f41739N
            boolean r1 = r0.f41642a
            if (r1 == 0) goto L_0x033a
            te3.o81 r0 = r0.f41644c
            if (r0 == 0) goto L_0x0342
            java.lang.String r0 = r0.f139020g
            if (r0 != 0) goto L_0x0343
            goto L_0x0342
        L_0x033a:
            te3.d51 r0 = r0.f41643b
            if (r0 == 0) goto L_0x0342
            java.lang.String r0 = r0.f132130s
            if (r0 != 0) goto L_0x0343
        L_0x0342:
            r0 = r10
        L_0x0343:
            r6.mo14197l3(r0)
            wg1.l4$a r0 = r6.f41739N
            boolean r1 = r0.f41642a
            if (r1 == 0) goto L_0x0355
            te3.o81 r0 = r0.f41644c
            if (r0 == 0) goto L_0x035f
            java.lang.String r0 = r0.f139020g
            if (r0 != 0) goto L_0x035e
            goto L_0x035f
        L_0x0355:
            te3.d51 r0 = r0.f41643b
            if (r0 == 0) goto L_0x035f
            java.lang.String r0 = r0.f132130s
            if (r0 != 0) goto L_0x035e
            goto L_0x035f
        L_0x035e:
            r10 = r0
        L_0x035f:
            r6.f41736K = r10
            rx3.g r0 = r6.f41759w
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.app.Activity r1 = r19.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131828266(0x7f111e2a, float:1.9289468E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setText(r1)
            rx3.g r0 = r6.f41760x
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.app.Activity r1 = r19.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131828276(0x7f111e34, float:1.9289488E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setText(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "qrcode living url "
            r0.append(r1)
            wg1.l4$a r1 = r6.f41739N
            java.lang.String r1 = r1.mo14173a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderLiveNoticeQRCodeUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            wg1.l4 r0 = wg1.C15320l4.f41639a
            wg1.l4$a r1 = r6.f41739N
            te3.o81 r1 = r1.f41644c
            if (r1 == 0) goto L_0x03c0
            int r1 = r1.f139024n
            goto L_0x03c1
        L_0x03c0:
            r1 = 0
        L_0x03c1:
            te3.f61 r0 = r0.mo14171b(r1)
            if (r0 == 0) goto L_0x03ce
            r6.mo14199n3(r0)
            int r0 = r0.f133309d
            r6.f41735J = r0
        L_0x03ce:
            r0 = 3
            r6.mo14195j3(r0)
            r19.mo14198m3()
            java.util.List<te3.f61> r0 = wg1.C15320l4.f41641c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ec
            rx3.g r0 = r6.f41731F
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r7)
        L_0x03ec:
            rx3.g r0 = r6.f41731F
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            wg1.z1$y r1 = new wg1.z1$y
            r1.<init>(r6)
            r0.setOnClickListener(r1)
        L_0x03fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C15370z1.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(4214, this);
        C86709a0.m107524d().mo123470p(6653, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        String str3;
        String str4;
        int i3 = i2;
        C117747y yVar2 = yVar;
        int i4 = 0;
        String str5 = null;
        C61926c.m72668M(new C15366x2(false, this, (DialogInterface.OnCancelListener) null));
        String str6 = "";
        boolean z = true;
        if (yVar2 instanceof C9386w4) {
            if (i == 0 && i3 == 0) {
                C15320l4 l4Var = C15320l4.f41639a;
                if (((ArrayList) C15320l4.f41641c).size() > 0) {
                    ((TextView) ((C36570n) this.f41731F).getValue()).setVisibility(0);
                }
                C49516g51 l1 = ((C9386w4) yVar2).mo10114l1();
                this.f41733H = l1;
                boolean z2 = l1.f133861h == 1;
                this.f41732G = z2;
                if (z2 || this.f41741Q != 1) {
                    z = false;
                }
                if (!z) {
                    View e3 = mo14191e3();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(4);
                    View view = e3;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    e3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C49516g51 g512 = this.f41733H;
                mo14197l3(g512 != null ? g512.f133860g : null);
                C49516g51 g513 = this.f41733H;
                this.f41736K = g513 != null ? g513.f133860g : null;
                StringBuilder sb = new StringBuilder();
                sb.append("qrcode url ");
                C49516g51 g514 = this.f41733H;
                if (g514 != null) {
                    str5 = g514.f133859f;
                }
                sb.append(str5);
                Log.m105924i("FinderLiveNoticeQRCodeUIC", sb.toString());
                C49516g51 g515 = this.f41733H;
                if (g515 != null) {
                    i4 = g515.f133864n;
                }
                C49386f61 b = l4Var.mo14171b(i4);
                if (b != null) {
                    mo14199n3(b);
                    this.f41735J = b.f133309d;
                }
                mo14198m3();
                ((TextView) ((C36570n) this.f41731F).getValue()).setOnClickListener(new C15403z(this));
            } else {
                C76912y0.m92769h(getActivity(), getActivity().getResources().getString(C0966R.string.dzr), C0966R.raw.icons_filled_close);
            }
            C8777j5 j5Var = (C8777j5) C86312j.m106911c(C8777j5.class);
            C54067f0.C0050b0 b0Var = C54067f0.C0050b0.LIVE_GO_IN_NOTICE_ACTIVITY;
            C49098d51 d512 = this.f41739N.f41643b;
            if (d512 == null || (str4 = d512.f132121g) == null) {
                str4 = str6;
            }
            j5Var.mo9608aH(b0Var, str6, str4);
        } else if (!(yVar2 instanceof C9363p2)) {
        } else {
            if (i == 0 && i3 == 0) {
                C13887q1 q1Var = (C13887q1) C86312j.m106911c(C13887q1.class);
                C49098d51 d513 = this.f41739N.f41643b;
                if (d513 == null || (str2 = d513.f132122h) == null) {
                    str2 = str6;
                }
                q1Var.Cg0(str2);
                Intent intent = new Intent();
                C49098d51 d514 = this.f41739N.f41643b;
                if (!(d514 == null || (str3 = d514.f132122h) == null)) {
                    str6 = str3;
                }
                intent.putExtra("ACTIVITY_RESULT_REMOVE_NOTICE_KEY", str6);
                getActivity().setResult(1000, intent);
                getActivity().finish();
                C76912y0.m92768g(getContext(), getActivity().getResources().getString(C0966R.string.lrz));
            } else if (i3 == -200211) {
                if (str == null || str.length() == 0) {
                    i4 = 1;
                }
                String string = i4 != 0 ? getActivity().getResources().getString(C0966R.string.f360648n24) : str;
                C87412m.m108593f(string, "if (errMsg.isNullOrEmpty…              else errMsg");
                C76912y0.m92767f(getContext(), string);
            } else {
                C76912y0.m92767f(getContext(), getActivity().getResources().getString(C0966R.string.n25));
            }
        }
    }
}
