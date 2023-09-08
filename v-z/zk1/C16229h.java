package zk1;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import bd1.C54446b;
import bl3.C39818r;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveAudienceCommodityLogStruct;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d62.C75339i;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import je1.C9363p2;
import k60.C60979d;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ok1.C62042e;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qo3.C89779i0;
import ro3.C110588j;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13605o;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import te3.C48722aj0;
import te3.C49098d51;
import te3.C50019jp1;
import te3.C51946xa1;
import te3.C64284cg;
import tf0.C13883o1;
import tf0.C13887q1;
import tf0.C64916p1;
import up1.C27696y;
import z04.C112551y;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: zk1.h */
public final class C16229h extends UIComponent implements C11385n {

    /* renamed from: A */
    public final C13601g f43459A;

    /* renamed from: B */
    public final C13601g f43460B;

    /* renamed from: C */
    public final C13601g f43461C;

    /* renamed from: D */
    public final C13601g f43462D;

    /* renamed from: E */
    public final C13601g f43463E;

    /* renamed from: F */
    public int f43464F;

    /* renamed from: G */
    public C51946xa1 f43465G;

    /* renamed from: H */
    public C16230a f43466H;

    /* renamed from: I */
    public final String f43467I;

    /* renamed from: J */
    public C89779i0 f43468J;

    /* renamed from: K */
    public FinderContact f43469K;

    /* renamed from: L */
    public C50019jp1 f43470L;

    /* renamed from: M */
    public boolean f43471M;

    /* renamed from: N */
    public boolean f43472N;

    /* renamed from: P */
    public boolean f43473P;

    /* renamed from: Q */
    public int f43474Q;

    /* renamed from: R */
    public final int f43475R;

    /* renamed from: S */
    public KeyboardHeightProvider f43476S;

    /* renamed from: T */
    public int f43477T;

    /* renamed from: U */
    public final float f43478U;

    /* renamed from: V */
    public final float f43479V;

    /* renamed from: W */
    public final float f43480W;

    /* renamed from: X */
    public final float f43481X;

    /* renamed from: Y */
    public final float f43482Y;

    /* renamed from: d */
    public final String f43483d = "FinderLiveNoticeUIC";

    /* renamed from: e */
    public final C13601g f43484e;

    /* renamed from: f */
    public final C13601g f43485f;

    /* renamed from: g */
    public final C13601g f43486g;

    /* renamed from: h */
    public final C13601g f43487h;

    /* renamed from: i */
    public final C13601g f43488i;

    /* renamed from: j */
    public final C13601g f43489j;

    /* renamed from: n */
    public final C13601g f43490n;

    /* renamed from: o */
    public final C13601g f43491o;

    /* renamed from: p */
    public final C13601g f43492p;

    /* renamed from: q */
    public final C13601g f43493q;

    /* renamed from: r */
    public final C13601g f43494r;

    /* renamed from: s */
    public final C13601g f43495s;

    /* renamed from: t */
    public final C13601g f43496t;

    /* renamed from: u */
    public final C13601g f43497u;

    /* renamed from: v */
    public final C13601g f43498v;

    /* renamed from: w */
    public final C13601g f43499w;

    /* renamed from: x */
    public final C13601g f43500x;

    /* renamed from: y */
    public final C13601g f43501y;

    /* renamed from: z */
    public final C13601g f43502z;

    /* renamed from: zk1.h$a */
    public final class C16230a {

        /* renamed from: a */
        public String f43503a = "";

        /* renamed from: b */
        public String f43504b = "";

        public C16230a(C16229h hVar) {
        }
    }

    /* renamed from: zk1.h$a0 */
    public static final class C16231a0 extends C87413o implements C32224a<ScrollView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43505d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16231a0(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43505d = appCompatActivity;
        }

        public Object invoke() {
            return (ScrollView) this.f43505d.findViewById(C0966R.C0970id.j3w);
        }
    }

    /* renamed from: zk1.h$b */
    public static final class C16232b extends C87413o implements C32224a<MMSwitchBtn> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43506d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16232b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43506d = appCompatActivity;
        }

        public Object invoke() {
            return (MMSwitchBtn) this.f43506d.findViewById(C0966R.C0970id.mzk);
        }
    }

    /* renamed from: zk1.h$c */
    public static final class C16233c extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43507d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16233c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43507d = appCompatActivity;
        }

        public Object invoke() {
            return (LinearLayout) this.f43507d.findViewById(C0966R.C0970id.mzl);
        }
    }

    /* renamed from: zk1.h$d */
    public static final class C16234d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43508d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16234d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43508d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f43508d.findViewById(C0966R.C0970id.mzm);
        }
    }

    /* renamed from: zk1.h$e */
    public static final class C16235e extends C87413o implements C32224a<RelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43509d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16235e(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43509d = appCompatActivity;
        }

        public Object invoke() {
            return (RelativeLayout) this.f43509d.findViewById(C0966R.C0970id.mzn);
        }
    }

    /* renamed from: zk1.h$f */
    public static final class C16236f extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43510d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16236f(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43510d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f43510d.findViewById(C0966R.C0970id.du9);
        }
    }

    /* renamed from: zk1.h$g */
    public static final class C16237g extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43511d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16237g(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43511d = appCompatActivity;
        }

        public Object invoke() {
            return (ImageView) this.f43511d.findViewById(C0966R.C0970id.du_);
        }
    }

    /* renamed from: zk1.h$h */
    public static final class C16238h extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43512d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16238h(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43512d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f43512d.findViewById(C0966R.C0970id.dv6);
        }
    }

    /* renamed from: zk1.h$i */
    public static final class C16239i extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43513d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16239i(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43513d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f43513d.findViewById(C0966R.C0970id.lzz);
        }
    }

    /* renamed from: zk1.h$j */
    public static final class C16240j extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43514d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16240j(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43514d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f43514d.findViewById(C0966R.C0970id.dug);
        }
    }

    /* renamed from: zk1.h$k */
    public static final class C16241k extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43515d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16241k(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43515d = appCompatActivity;
        }

        public Object invoke() {
            return this.f43515d.findViewById(C0966R.C0970id.duj);
        }
    }

    /* renamed from: zk1.h$l */
    public static final class C16242l extends C87413o implements C32224a<MMEditText> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43516d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16242l(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43516d = appCompatActivity;
        }

        public Object invoke() {
            MMEditText mMEditText = (MMEditText) this.f43516d.findViewById(C0966R.C0970id.dui);
            mMEditText.setHint(C58739j4.f168176a.mo83720p());
            return mMEditText;
        }
    }

    /* renamed from: zk1.h$m */
    public static final class C16243m extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43517d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16243m(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43517d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f43517d.findViewById(C0966R.C0970id.dul);
        }
    }

    /* renamed from: zk1.h$n */
    public static final class C16244n extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43518d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16244n(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43518d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f43518d.findViewById(C0966R.C0970id.dus);
        }
    }

    /* renamed from: zk1.h$o */
    public static final class C16245o extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43519d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16245o(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43519d = appCompatActivity;
        }

        public Object invoke() {
            return this.f43519d.findViewById(C0966R.C0970id.f358208dv1);
        }
    }

    /* renamed from: zk1.h$p */
    public static final class C16246p extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43520d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16246p(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43520d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f43520d.findViewById(C0966R.C0970id.f358209dv2);
        }
    }

    /* renamed from: zk1.h$q */
    public static final class C16247q extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43521d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16247q(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43521d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f43521d.findViewById(C0966R.C0970id.f358210dv3);
        }
    }

    /* renamed from: zk1.h$r */
    public static final class C16248r implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C16229h f43522d;

        /* renamed from: zk1.h$r$a */
        public static final class C16249a implements C7020t0 {

            /* renamed from: d */
            public final /* synthetic */ C16229h f43523d;

            public C16249a(C16229h hVar) {
                this.f43523d = hVar;
            }

            /* renamed from: Q1 */
            public final void mo531Q1(int i, boolean z) {
                String str = this.f43523d.f43483d;
                Log.m105924i(str, "onKeyboardHeightChanged, height:" + i + ", isResized:" + z);
                C16229h hVar = this.f43523d;
                boolean z2 = i > 0;
                TextView f3 = hVar.mo14764f3();
                ViewGroup viewGroup = null;
                ViewGroup.LayoutParams layoutParams = f3 != null ? f3.getLayoutParams() : null;
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                TextView i3 = hVar.mo14766i3();
                ViewGroup.LayoutParams layoutParams3 = i3 != null ? i3.getLayoutParams() : null;
                LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
                View view = (View) ((C36570n) hVar.f43489j).getValue();
                ViewGroup.LayoutParams layoutParams5 = view != null ? view.getLayoutParams() : null;
                RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams5 : null;
                ScrollView scrollView = (ScrollView) ((C36570n) hVar.f43496t).getValue();
                ViewGroup.LayoutParams layoutParams7 = scrollView != null ? scrollView.getLayoutParams() : null;
                RelativeLayout.LayoutParams layoutParams8 = layoutParams7 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams7 : null;
                if (z2) {
                    if (layoutParams6 != null) {
                        layoutParams6.bottomMargin = (int) hVar.f43481X;
                    }
                    if (layoutParams2 != null) {
                        layoutParams2.bottomMargin = (int) hVar.f43479V;
                    }
                    if (layoutParams4 != null) {
                        layoutParams4.bottomMargin = (int) hVar.f43479V;
                    }
                    if (layoutParams8 != null) {
                        layoutParams8.height = hVar.f43477T - i;
                    }
                } else {
                    if (layoutParams6 != null) {
                        layoutParams6.bottomMargin = (int) hVar.f43482Y;
                    }
                    if (layoutParams2 != null) {
                        layoutParams2.bottomMargin = (int) hVar.f43480W;
                    }
                    if (layoutParams4 != null) {
                        layoutParams4.bottomMargin = (int) hVar.f43478U;
                    }
                    if (layoutParams8 != null) {
                        layoutParams8.height = hVar.f43477T;
                    }
                }
                TextView f35 = hVar.mo14764f3();
                ViewParent parent = f35 != null ? f35.getParent() : null;
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                }
                if (viewGroup != null) {
                    viewGroup.updateViewLayout(hVar.mo14764f3(), layoutParams2);
                    viewGroup.updateViewLayout(hVar.mo14766i3(), layoutParams4);
                }
            }
        }

        public C16248r(C16229h hVar) {
            this.f43522d = hVar;
        }

        public final void run() {
            C16229h hVar = this.f43522d;
            if (hVar.f43476S == null) {
                hVar.f43476S = new KeyboardHeightProvider(hVar.getActivity());
                C16229h hVar2 = this.f43522d;
                KeyboardHeightProvider keyboardHeightProvider = hVar2.f43476S;
                if (keyboardHeightProvider != null) {
                    keyboardHeightProvider.f220015b = new C16249a(hVar2);
                }
            }
            KeyboardHeightProvider keyboardHeightProvider2 = this.f43522d.f43476S;
            if (keyboardHeightProvider2 != null) {
                keyboardHeightProvider2.mo104022e();
            }
        }
    }

    /* renamed from: zk1.h$s */
    public static final class C16250s implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C16229h f43524d;

        public C16250s(C16229h hVar) {
            this.f43524d = hVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C16229h.m15121c3(this.f43524d);
        }
    }

    /* renamed from: zk1.h$t */
    public static final class C16251t extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43525d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16251t(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43525d = appCompatActivity;
        }

        public Object invoke() {
            return (WeImageView) this.f43525d.findViewById(C0966R.C0970id.neu);
        }
    }

    /* renamed from: zk1.h$u */
    public static final class C16252u extends C87413o implements C32224a<MMSwitchBtn> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43526d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16252u(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43526d = appCompatActivity;
        }

        public Object invoke() {
            return (MMSwitchBtn) this.f43526d.findViewById(C0966R.C0970id.neo);
        }
    }

    /* renamed from: zk1.h$v */
    public static final class C16253v extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16253v(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43527d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f43527d.findViewById(C0966R.C0970id.nep);
        }
    }

    /* renamed from: zk1.h$w */
    public static final class C16254w extends C87413o implements C32224a<RelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43528d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16254w(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43528d = appCompatActivity;
        }

        public Object invoke() {
            return (RelativeLayout) this.f43528d.findViewById(C0966R.C0970id.neq);
        }
    }

    /* renamed from: zk1.h$x */
    public static final class C16255x extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43529d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16255x(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43529d = appCompatActivity;
        }

        public Object invoke() {
            return (LinearLayout) this.f43529d.findViewById(C0966R.C0970id.nes);
        }
    }

    /* renamed from: zk1.h$y */
    public static final class C16256y extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43530d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16256y(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43530d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f43530d.findViewById(C0966R.C0970id.net);
        }
    }

    /* renamed from: zk1.h$z */
    public static final class C16257z extends C87413o implements C32224a<RelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43531d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16257z(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43531d = appCompatActivity;
        }

        public Object invoke() {
            return (RelativeLayout) this.f43531d.findViewById(C0966R.C0970id.nev);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16229h(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f43484e = C36568h.m40985a(new C16238h(appCompatActivity));
        this.f43485f = C36568h.m40985a(new C16237g(appCompatActivity));
        this.f43486g = C36568h.m40985a(new C16244n(appCompatActivity));
        this.f43487h = C36568h.m40985a(new C16236f(appCompatActivity));
        this.f43488i = C36568h.m40985a(new C16242l(appCompatActivity));
        this.f43489j = C36568h.m40985a(new C16241k(appCompatActivity));
        this.f43490n = C36568h.m40985a(new C16245o(appCompatActivity));
        this.f43491o = C36568h.m40985a(new C16246p(appCompatActivity));
        this.f43492p = C36568h.m40985a(new C16240j(appCompatActivity));
        this.f43493q = C36568h.m40985a(new C16243m(appCompatActivity));
        this.f43494r = C36568h.m40985a(new C16247q(appCompatActivity));
        this.f43495s = C36568h.m40985a(new C16239i(appCompatActivity));
        this.f43496t = C36568h.m40985a(new C16231a0(appCompatActivity));
        this.f43497u = C36568h.m40985a(new C16233c(appCompatActivity));
        this.f43498v = C36568h.m40985a(new C16232b(appCompatActivity));
        this.f43499w = C36568h.m40985a(new C16235e(appCompatActivity));
        this.f43500x = C36568h.m40985a(new C16234d(appCompatActivity));
        this.f43501y = C36568h.m40985a(new C16255x(appCompatActivity));
        this.f43502z = C36568h.m40985a(new C16252u(appCompatActivity));
        this.f43459A = C36568h.m40985a(new C16251t(appCompatActivity));
        this.f43460B = C36568h.m40985a(new C16257z(appCompatActivity));
        this.f43461C = C36568h.m40985a(new C16256y(appCompatActivity));
        this.f43462D = C36568h.m40985a(new C16254w(appCompatActivity));
        this.f43463E = C36568h.m40985a(new C16253v(appCompatActivity));
        this.f43465G = new C51946xa1();
        this.f43467I = "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/QnFg1sAtr4PwqQ0T";
        this.f43473P = true;
        this.f43475R = 120;
        this.f43478U = ((float) appCompatActivity.getResources().getDimensionPixelOffset(C0966R.dimen.f3749d0)) / C76577a.m92165p(appCompatActivity);
        this.f43479V = ((float) appCompatActivity.getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp)) / C76577a.m92165p(appCompatActivity);
        this.f43480W = ((float) appCompatActivity.getResources().getDimensionPixelOffset(C0966R.dimen.f3760da)) / C76577a.m92165p(appCompatActivity);
        this.f43481X = ((float) appCompatActivity.getResources().getDimensionPixelOffset(C0966R.dimen.f3755d6)) / C76577a.m92165p(appCompatActivity);
        this.f43482Y = ((float) appCompatActivity.getResources().getDimensionPixelOffset(C0966R.dimen.f3715c8)) / C76577a.m92165p(appCompatActivity);
    }

    /* renamed from: c3 */
    public static final void m15121c3(C16229h hVar) {
        Log.m105924i(hVar.f43483d, "onCreateLiveNote");
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = C62042e.f176370a.mo87109q0();
        AppCompatActivity activity = hVar.getActivity();
        C13605o oVar = (C13605o) f0Var.f27484d;
        C7045j jVar = new C7045j(activity, (ArrayList) oVar.f38557d, (ArrayList) oVar.f38558e, (ArrayList) oVar.f38559f, false);
        jVar.mo8108k(1, 12, 0);
        String string = hVar.getActivity().getResources().getString(C0966R.string.dzc);
        Button button = jVar.f24861i;
        if (button != null) {
            button.setText(string);
        }
        jVar.f24870u = new C16222d0(jVar, f0Var, hVar);
        View inflate = LayoutInflater.from(hVar.getActivity()).inflate(C0966R.C0971layout.f359674a82, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(activity).inflate(R…live_picker_footer, null)");
        View inflate2 = LayoutInflater.from(hVar.getActivity()).inflate(C0966R.C0971layout.f359740aj0, (ViewGroup) null);
        C87412m.m108593f(inflate2, "from(activity).inflate(R…live_picker_header, null)");
        int color = hVar.getActivity().getResources().getColor(C0966R.color.f3424sc);
        Button button2 = jVar.f24862j;
        if (button2 != null) {
            button2.setTextColor(color);
        }
        jVar.mo8105h(2);
        Button button3 = jVar.f24861i;
        if (button3 != null) {
            button3.setBackgroundResource(C0966R.C0969drawable.f5153yk);
        }
        jVar.mo8104g(inflate2);
        LinearLayout linearLayout = jVar.f24875z;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            jVar.f24875z.removeAllViews();
            jVar.f24875z.setGravity(17);
            jVar.f24875z.addView(inflate, new LinearLayout.LayoutParams(-1, -2));
        }
        jVar.mo8109l();
    }

    /* renamed from: d3 */
    public static final void m15122d3(C16229h hVar, int i, int i2, int i3) {
        hVar.getClass();
        C62042e eVar = C62042e.f176370a;
        C13605o<ArrayList<String>, ArrayList<List<String>>, ArrayList<List<String>>> q0 = eVar.mo87109q0();
        Date date = new Date(eVar.mo87112r0());
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.set(5, instance.get(5) + i);
        instance.set(11, (24 - ((List) ((ArrayList) q0.f38558e).get(i)).size()) + i2);
        instance.set(12, ((12 - ((List) ((ArrayList) q0.f38559f).get(i2)).size()) + i3) * 5);
        instance.set(13, 0);
        String str = hVar.f43483d;
        Log.m105924i(str, "chosen time:" + instance.getTime() + ",timeInMills:" + instance.getTimeInMillis());
        hVar.f43474Q = (int) (instance.getTimeInMillis() / ((long) 1000));
        ((TextView) ((C36570n) hVar.f43491o).getValue()).setText(C58739j4.m68254u(C58739j4.f168176a, instance.getTimeInMillis(), (Boolean) null, false, 6, (Object) null));
    }

    /* renamed from: e3 */
    public final MMSwitchBtn mo14763e3() {
        return (MMSwitchBtn) ((C36570n) this.f43498v).getValue();
    }

    /* renamed from: f3 */
    public final TextView mo14764f3() {
        return (TextView) ((C36570n) this.f43492p).getValue();
    }

    /* renamed from: g3 */
    public final MMEditText mo14765g3() {
        return (MMEditText) ((C36570n) this.f43488i).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aim;
    }

    /* renamed from: i3 */
    public final TextView mo14766i3() {
        return (TextView) ((C36570n) this.f43494r).getValue();
    }

    /* renamed from: j3 */
    public final MMSwitchBtn mo14767j3() {
        return (MMSwitchBtn) ((C36570n) this.f43502z).getValue();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        byte[] byteArrayExtra;
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 3 && intent != null && (byteArrayExtra = intent.getByteArrayExtra("KEY_PARAMS_WHITE_LIST")) != null) {
            C51946xa1 xa12 = new C51946xa1();
            xa12.parseFrom(byteArrayExtra);
            this.f43465G = xa12;
            TextView textView = (TextView) ((C36570n) this.f43463E).getValue();
            LinkedList<String> linkedList = this.f43465G.f144559f;
            if (linkedList == null) {
                linkedList = new LinkedList<>();
            }
            StringBuilder sb = new StringBuilder();
            int i3 = 0;
            for (T next : linkedList) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C72996z1 N2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69664N2((String) next);
                    if (N2 == null || (str = ((C75339i) C86312j.m106911c(C75339i.class)).pv0(N2, N2.getUsername())) == null) {
                        str = "";
                    }
                    sb.append(str);
                    if (i3 < linkedList.size() - 1) {
                        sb.append(",");
                    }
                    i3 = i4;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "result.toString()");
            textView.setText(sb4);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_FINDER_LIVE_NOTICE_CONTACT");
        if (byteArrayExtra != null) {
            FinderContact finderContact = new FinderContact();
            this.f43469K = finderContact;
            finderContact.parseFrom(byteArrayExtra);
        }
        byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("KEY_FINDER_LIVE_COUPON");
        if (byteArrayExtra2 != null) {
            Log.m105924i(this.f43483d, "#initData ready to parse coupon");
            C50019jp1 jp12 = new C50019jp1();
            this.f43470L = jp12;
            jp12.parseFrom(byteArrayExtra2);
        }
        String str = this.f43483d;
        StringBuilder sb = new StringBuilder();
        sb.append("#initData coupon.appUrl ");
        C50019jp1 jp13 = this.f43470L;
        sb.append(jp13 != null ? jp13.f136238e : null);
        Log.m105924i(str, sb.toString());
        this.f43471M = getIntent().getBooleanExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_PROFILE", false);
        this.f43472N = getIntent().getBooleanExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_LIVE", false);
        this.f43473P = getIntent().getBooleanExtra("KEY_FINDER_LIVE_NOTICE_IS_CAN_CREATE", true);
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C58739j4 j4Var = C58739j4.f168176a;
        TextView textView = (TextView) ((C36570n) this.f43461C).getValue();
        C87412m.m108593f(textView, "preSaleValueDesc");
        j4Var.mo83703c0(textView, true);
        ((TextView) ((C36570n) this.f43484e).getValue()).setOnClickListener(new C16281t(this));
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> i2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2();
        FinderContact finderContact2 = this.f43469K;
        if (finderContact2 != null) {
            C62345f fVar = new C62345f(finderContact2.headUrl, (C27696y) null, 2, (C8480h) null);
            ImageView imageView = (ImageView) ((C36570n) this.f43485f).getValue();
            C87412m.m108593f(imageView, "mAvatarView");
            i2.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            TextView textView2 = (TextView) ((C36570n) this.f43486g).getValue();
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            AppCompatActivity activity = getActivity();
            FinderContact finderContact3 = this.f43469K;
            if (finderContact3 != null) {
                textView2.setText(hVar.mo107057T1(activity, finderContact3.nickname));
                C7335d c = C86312j.m106911c(C64916p1.class);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                C64916p1 p1Var = (C64916p1) c;
                ImageView imageView2 = (ImageView) ((C36570n) this.f43487h).getValue();
                C87412m.m108593f(imageView2, "mAuthView");
                FinderContact finderContact4 = this.f43469K;
                if (finderContact4 != null) {
                    C64916p1.C64917a.m76444k(p1Var, imageView2, finderContact4.authInfo, 0, (C64284cg) null, 12, (Object) null);
                    ((View) ((C36570n) this.f43490n).getValue()).setOnClickListener(new C16283u(this));
                    mo14764f3().setOnClickListener(new C16284v(this));
                    if (this.f43472N) {
                        mo14764f3().setText(getContext().getString(C0966R.string.m6o));
                    }
                    mo14766i3().setOnClickListener(new C16288w(this));
                    ((TextView) ((C36570n) this.f43491o).getValue()).post(new C16289x(this));
                    ((View) ((C36570n) this.f43489j).getValue()).setOnClickListener(new C16290y(this));
                    mo14765g3().mo104244e((String) null, LocaleUtil.getCurrentLanguage(getContext()), new C16291z(this), (C110588j.C77559a.C77560a) null);
                    mo14765g3().setFilters(new InputFilter[]{new C16221c0(this), new C45078p0(this.f43475R, C45078p0.C45079a.MODE_CHINESE_AS_2)});
                    mo14765g3().addTextChangedListener(new C16219a0(this));
                    ((ScrollView) ((C36570n) this.f43496t).getValue()).post(new C16220b0(this));
                    if (this.f43473P) {
                        mo14764f3().setVisibility(0);
                        mo14766i3().setVisibility(0);
                        ((TextView) ((C36570n) this.f43495s).getValue()).setVisibility(4);
                    } else {
                        mo14764f3().setVisibility(4);
                        mo14766i3().setVisibility(4);
                        ((TextView) ((C36570n) this.f43495s).getValue()).setVisibility(0);
                    }
                    C50019jp1 jp14 = this.f43470L;
                    if (jp14 != null) {
                        ((LinearLayout) ((C36570n) this.f43497u).getValue()).setVisibility(0);
                        mo14763e3().setSwitchListener(new C16272o(this));
                        ((RelativeLayout) ((C36570n) this.f43499w).getValue()).setOnClickListener(new C16273p(this, jp14));
                        C104289g gVar = new C104289g();
                        gVar.put("finderuin", C66785b.f191882e.mo90662O5());
                        String gVar2 = gVar.toString();
                        C87412m.m108593f(gVar2, "paramsJson.toString()");
                        LiveAudienceCommodityLogStruct liveAudienceCommodityLogStruct = new LiveAudienceCommodityLogStruct();
                        liveAudienceCommodityLogStruct.mo76270s("expose_reserve_wtih_coupon_switch");
                        liveAudienceCommodityLogStruct.mo76271t(C112551y.m153814n(gVar2, ",", ";", false));
                        liveAudienceCommodityLogStruct.mo86054n();
                    }
                    C54446b c2 = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
                    int i = c2 != null ? c2.mo75251m2().f132499j : 0;
                    if (C61926c.m72696u(i, 8) && C61926c.m72696u(i, 16)) {
                        ((LinearLayout) ((C36570n) this.f43501y).getValue()).setVisibility(0);
                        mo14767j3().setSwitchListener(new C16276q(this));
                        ((RelativeLayout) ((C36570n) this.f43460B).getValue()).setOnClickListener(new C16279r(this));
                        ((RelativeLayout) ((C36570n) this.f43462D).getValue()).setOnClickListener(new C16280s(this));
                    }
                    C86709a0.m107524d().mo123455a(6653, this);
                    return;
                }
                C87412m.m108603p("contact");
                throw null;
            }
            C87412m.m108603p("contact");
            throw null;
        }
        C87412m.m108603p("contact");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(6653, this);
    }

    public void onPause() {
        super.onPause();
        KeyboardHeightProvider keyboardHeightProvider = this.f43476S;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    public void onResume() {
        View decorView;
        super.onResume();
        Window window = getActivity().getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new C16248r(this));
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Object obj;
        String str2;
        String str3;
        int i3 = i;
        int i4 = i2;
        String str4 = str;
        C117747y yVar2 = yVar;
        String str5 = this.f43483d;
        Log.m105924i(str5, "errType " + i3 + ", errCode " + i4 + ", errMsg " + str4);
        int i5 = 0;
        byte[] bArr = null;
        C61926c.m72668M(new C16224f0(false, this, (DialogInterface.OnCancelListener) null));
        if (yVar2 instanceof C9363p2) {
            boolean z = true;
            if (i3 == 0 && i4 == 0) {
                C48722aj0 response = ((C9363p2) yVar2).getResponse();
                Class cls = C54108o.class;
                Class cls2 = C13883o1.class;
                C49098d51 d512 = response.f130563e;
                if (d512 != null) {
                    ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13356qM(d512);
                }
                if (this.f43471M || this.f43472N) {
                    Intent intent = new Intent();
                    intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", C66785b.f191882e.mo90662O5());
                    C49098d51 d513 = response.f130563e;
                    if (d513 != null) {
                        bArr = d513.toByteArray();
                    }
                    intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", bArr);
                    intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", false);
                    C7335d c = C86312j.m106911c(cls2);
                    C87412m.m108593f(c, "getService(IActivityRouter::class.java)");
                    C13883o1.C13884a.m13250b((C13883o1) c, getActivity(), intent, 0, 4, (Object) null);
                    C61926c.m72666K(500, new C16259i(response, this));
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", C66785b.f191882e.mo90662O5());
                    C49098d51 d514 = response.f130563e;
                    if (d514 != null) {
                        bArr = d514.toByteArray();
                    }
                    intent2.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", bArr);
                    intent2.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", false);
                    intent2.putExtra("KEY_FINDER_LIVE_NOTICE_QR_NEED_BACK_PROFILE", true);
                    C7335d c2 = C86312j.m106911c(cls2);
                    C87412m.m108593f(c2, "getService(IActivityRouter::class.java)");
                    C13883o1.C13884a.m13250b((C13883o1) c2, getActivity(), intent2, 0, 4, (Object) null);
                    C61926c.m72666K(500, new C16263j(this));
                }
                if (response.f130563e != null) {
                    C54108o oVar = (C54108o) C86312j.m106911c(cls);
                    C54067f0.C0050b0 b0Var = C54067f0.C0050b0.LIVE_CREATE_BOOK_SUCC;
                    C49098d51 d515 = response.f130563e;
                    if (d515 != null) {
                        i5 = d515.f132118d;
                    }
                    String valueOf = String.valueOf(((long) i5) * 1000);
                    C49098d51 d516 = response.f130563e;
                    if (d516 == null || (str3 = d516.f132121g) == null) {
                        str3 = "";
                    }
                    oVar.mo9608aH(b0Var, valueOf, str3);
                }
                C54108o oVar2 = (C54108o) C86312j.m106911c(cls);
                C54067f0.C0050b0 b0Var2 = C54067f0.C0050b0.LIVE_JUMP_PROFILE_PAGE;
                C49098d51 d517 = response.f130563e;
                if (d517 == null || (str2 = d517.f132121g) == null) {
                    str2 = "";
                }
                oVar2.mo9608aH(b0Var2, "", str2);
                return;
            }
            if (str4 != null) {
                if (str.length() <= 0) {
                    z = false;
                }
                String str6 = z ? str4 : null;
                if (str6 != null) {
                    switch (i4) {
                        case -200165:
                        case -200164:
                            obj = C76879j.m92711E(getContext(), str6, (String) null, getContext().getResources().getString(C0966R.string.f8028zq), false, new C16250s(this));
                            break;
                        default:
                            Toast makeText = C76912y0.makeText((Context) getContext(), (CharSequence) str6, 0);
                            makeText.setGravity(17, 0, 0);
                            makeText.show();
                            obj = C13598b0.f38549a;
                            break;
                    }
                    if (obj != null) {
                        return;
                    }
                }
            }
            C76912y0.m92769h(getActivity(), getActivity().getResources().getString(C0966R.string.dze), C0966R.raw.icons_filled_info);
        }
    }
}
