package v82;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C0120a0;
import androidx.transition.AutoTransition;
import androidx.transition.C103834d;
import androidx.transition.ChangeBounds;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import bl3.C39818r;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.multitalk.model.C105806i0;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.C105853x;
import com.tencent.p014mm.plugin.multitalk.p078ui.C105883g;
import com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkMainUI;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.MultiTalkControlIconLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import dd0.C75346e;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lu3.C34379c;
import nj3.C76912y0;
import p447aw.C103918d;
import p853i4.C60244h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import w33.C111720c0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: v82.m */
public final class C111474m implements View.OnClickListener {

    /* renamed from: H */
    public static int f333737H = 1;

    /* renamed from: A */
    public C34379c<?> f333738A;

    /* renamed from: B */
    public C0120a0<Boolean> f333739B;

    /* renamed from: C */
    public C0120a0<Boolean> f333740C;

    /* renamed from: D */
    public C0120a0<Boolean> f333741D;

    /* renamed from: E */
    public C0120a0<Boolean> f333742E;

    /* renamed from: F */
    public C0120a0<Boolean> f333743F;

    /* renamed from: G */
    public boolean f333744G;

    /* renamed from: d */
    public final MultiTalkMainUI f333745d;

    /* renamed from: e */
    public final C13601g f333746e = C36568h.m40985a(new C52795u(this));

    /* renamed from: f */
    public final C13601g f333747f = C36568h.m40985a(new C52780b(this));

    /* renamed from: g */
    public final C13601g f333748g = C36568h.m40985a(new C111478s(this));

    /* renamed from: h */
    public final C13601g f333749h = C36568h.m40985a(new C111477r(this));

    /* renamed from: i */
    public final C13601g f333750i = C36568h.m40985a(new C52792o(this));

    /* renamed from: j */
    public final C13601g f333751j = C36568h.m40985a(new C52785g(this));

    /* renamed from: n */
    public final C13601g f333752n = C36568h.m40985a(new C52779a(this));

    /* renamed from: o */
    public boolean f333753o;

    /* renamed from: p */
    public int f333754p;

    /* renamed from: q */
    public C32226l<? super Integer, C13598b0> f333755q;

    /* renamed from: r */
    public int f333756r;

    /* renamed from: s */
    public boolean f333757s;

    /* renamed from: t */
    public View f333758t;

    /* renamed from: u */
    public boolean f333759u;

    /* renamed from: v */
    public final C13601g f333760v;

    /* renamed from: w */
    public final C13601g f333761w;

    /* renamed from: x */
    public int f333762x;

    /* renamed from: y */
    public Boolean f333763y;

    /* renamed from: z */
    public boolean f333764z;

    /* renamed from: v82.m$a */
    public static final class C52779a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C111474m f147472d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52779a(C111474m mVar) {
            super(0);
            this.f147472d = mVar;
        }

        public Object invoke() {
            return this.f147472d.f333745d.findViewById(C0966R.C0970id.kfo);
        }
    }

    /* renamed from: v82.m$b */
    public static final class C52780b extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ C111474m f147473d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52780b(C111474m mVar) {
            super(0);
            this.f147473d = mVar;
        }

        public Object invoke() {
            return (FrameLayout) this.f147473d.f333745d.findViewById(C0966R.C0970id.f358795kc1);
        }
    }

    /* renamed from: v82.m$c */
    public static final class C52781c extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ C111474m f147474d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52781c(C111474m mVar) {
            super(0);
            this.f147474d = mVar;
        }

        public Object invoke() {
            return Float.valueOf(((float) ((Number) ((C36570n) this.f147474d.f333760v).getValue()).intValue()) - this.f147474d.f333745d.getResources().getDimension(C0966R.dimen.f4315k3));
        }
    }

    /* renamed from: v82.m$d */
    public static final class C52782d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C111474m f147475d;

        /* renamed from: e */
        public final /* synthetic */ int f147476e;

        public C52782d(C111474m mVar, int i) {
            this.f147475d = mVar;
            this.f147476e = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$handleBadNetworkLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C111474m mVar = this.f147475d;
            if (mVar.f333764z) {
                mVar.f333745d.mo150873V(this.f147476e);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$handleBadNetworkLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: v82.m$e */
    public static final class C52783e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111474m f147477d;

        public C52783e(C111474m mVar) {
            this.f147477d = mVar;
        }

        public final void run() {
            C111474m mVar = this.f147477d;
            mVar.f333764z = false;
            View findViewById = mVar.f333745d.findViewById(C0966R.C0970id.f356907for);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$handleBadNetworkLogic$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$handleBadNetworkLogic$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView = (TextView) this.f147477d.f333745d.findViewById(C0966R.C0970id.f359525ld0);
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: v82.m$f */
    public static final class C52784f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111474m f147478d;

        public C52784f(C111474m mVar) {
            this.f147478d = mVar;
        }

        public final void run() {
            C111474m mVar = this.f147478d;
            mVar.f333764z = false;
            ViewGroup viewGroup = mVar.mo163180e().f171770c;
            C87412m.m108593f(viewGroup, "sceneExpand.sceneRoot");
            Log.m105924i("MicroMsg.MT.ControlPanelLogic", "handleBadNetworkLogic: hideView");
            View findViewById = viewGroup.findViewById(C0966R.C0970id.has);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "handleBadNetworkLogic$hideNetView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "handleBadNetworkLogic$hideNetView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = viewGroup.findViewById(C0966R.C0970id.f5843q5);
            ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            layoutParams.height -= findViewById2.getResources().getDimensionPixelSize(C0966R.dimen.f4316k4);
            findViewById2.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: v82.m$g */
    public static final class C52785g extends C87413o implements C32224a<RelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ C111474m f147479d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52785g(C111474m mVar) {
            super(0);
            this.f147479d = mVar;
        }

        public Object invoke() {
            View inflate = this.f147479d.f333745d.getLayoutInflater().inflate(C0966R.C0971layout.bhc, (ViewGroup) null, false);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
            return (RelativeLayout) inflate;
        }
    }

    /* renamed from: v82.m$i */
    public static final class C52786i<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ ImageView f147480d;

        /* renamed from: e */
        public final /* synthetic */ TextView f147481e;

        /* renamed from: f */
        public final /* synthetic */ C111474m f147482f;

        public C52786i(ImageView imageView, TextView textView, C111474m mVar) {
            this.f147480d = imageView;
            this.f147481e = textView;
            this.f147482f = mVar;
        }

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            Log.m105924i("MicroMsg.MT.ControlPanelLogic", "speakeron btn state: " + bool);
            C87412m.m108593f(bool, LocaleUtil.ITALIAN);
            if (bool.booleanValue()) {
                this.f147480d.setSelected(true);
                this.f147481e.setText(C0966R.string.h0w);
                this.f147480d.setContentDescription(this.f147482f.f333745d.getString(C0966R.string.h0w));
                return;
            }
            this.f147480d.setSelected(false);
            this.f147481e.setText(C0966R.string.h0v);
            this.f147480d.setContentDescription(this.f147482f.f333745d.getString(C0966R.string.h0v));
        }
    }

    /* renamed from: v82.m$j */
    public static final class C52787j<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ ImageView f147483d;

        /* renamed from: e */
        public final /* synthetic */ TextView f147484e;

        public C52787j(ImageView imageView, TextView textView) {
            this.f147483d = imageView;
            this.f147484e = textView;
        }

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            Log.m105924i("MicroMsg.MT.ControlPanelLogic", "handsfreeEnable state: " + bool);
            ImageView imageView = this.f147483d;
            C87412m.m108593f(bool, LocaleUtil.ITALIAN);
            imageView.setEnabled(bool.booleanValue());
            float f = 0.3f;
            this.f147483d.setAlpha(bool.booleanValue() ? 1.0f : 0.3f);
            TextView textView = this.f147484e;
            if (bool.booleanValue()) {
                f = 1.0f;
            }
            textView.setAlpha(f);
        }
    }

    /* renamed from: v82.m$k */
    public static final class C52788k<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ ImageView f147485d;

        /* renamed from: e */
        public final /* synthetic */ TextView f147486e;

        public C52788k(ImageView imageView, TextView textView) {
            this.f147485d = imageView;
            this.f147486e = textView;
        }

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            Log.m105924i("MicroMsg.MT.ControlPanelLogic", "cameraEnable state: " + bool);
            ImageView imageView = this.f147485d;
            C87412m.m108593f(bool, LocaleUtil.ITALIAN);
            imageView.setEnabled(bool.booleanValue());
            float f = 0.3f;
            this.f147485d.setAlpha(bool.booleanValue() ? 1.0f : 0.3f);
            TextView textView = this.f147486e;
            if (bool.booleanValue()) {
                f = 1.0f;
            }
            textView.setAlpha(f);
        }
    }

    /* renamed from: v82.m$l */
    public static final class C52789l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111474m f147487d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f147488e;

        public C52789l(C111474m mVar, ViewGroup viewGroup) {
            this.f147487d = mVar;
            this.f147488e = viewGroup;
        }

        public final void run() {
            C111474m.m151983a(this.f147487d, (int) this.f147488e.getY());
        }
    }

    /* renamed from: v82.m$m */
    public static final class C52790m<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ ImageView f147489d;

        /* renamed from: e */
        public final /* synthetic */ TextView f147490e;

        /* renamed from: f */
        public final /* synthetic */ C111474m f147491f;

        public C52790m(ImageView imageView, TextView textView, C111474m mVar) {
            this.f147489d = imageView;
            this.f147490e = textView;
            this.f147491f = mVar;
        }

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            Log.m105924i("MicroMsg.MT.ControlPanelLogic", "camera btn state: " + bool);
            C87412m.m108593f(bool, LocaleUtil.ITALIAN);
            if (bool.booleanValue()) {
                this.f147489d.setSelected(true);
                this.f147490e.setText(C0966R.string.gyo);
                this.f147489d.setContentDescription(this.f147491f.f333745d.getString(C0966R.string.gyo));
                return;
            }
            this.f147489d.setSelected(false);
            this.f147490e.setText(C0966R.string.gyn);
            this.f147489d.setContentDescription(this.f147491f.f333745d.getString(C0966R.string.gyn));
        }
    }

    /* renamed from: v82.m$n */
    public static final class C52791n<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ ImageView f147492d;

        /* renamed from: e */
        public final /* synthetic */ TextView f147493e;

        /* renamed from: f */
        public final /* synthetic */ C111474m f147494f;

        public C52791n(ImageView imageView, TextView textView, C111474m mVar) {
            this.f147492d = imageView;
            this.f147493e = textView;
            this.f147494f = mVar;
        }

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            Log.m105924i("MicroMsg.MT.ControlPanelLogic", "mic btn state: " + bool);
            C87412m.m108593f(bool, LocaleUtil.ITALIAN);
            if (bool.booleanValue()) {
                this.f147492d.setSelected(true);
                this.f147493e.setText(C0966R.string.f361065h04);
                this.f147492d.setContentDescription(this.f147494f.f333745d.getString(C0966R.string.f361065h04));
                return;
            }
            this.f147492d.setSelected(false);
            this.f147493e.setText(C0966R.string.f361064h03);
            this.f147492d.setContentDescription(this.f147494f.f333745d.getString(C0966R.string.f361064h03));
        }
    }

    /* renamed from: v82.m$o */
    public static final class C52792o extends C87413o implements C32224a<ConstraintLayout> {

        /* renamed from: d */
        public final /* synthetic */ C111474m f147495d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52792o(C111474m mVar) {
            super(0);
            this.f147495d = mVar;
        }

        public Object invoke() {
            View inflate = this.f147495d.f333745d.getLayoutInflater().inflate(C0966R.C0971layout.bhd, (ViewGroup) null, false);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            return (ConstraintLayout) inflate;
        }
    }

    /* renamed from: v82.m$q */
    public static final class C52793q extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public static final C52793q f147496d = new C52793q();

        public C52793q() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: v82.m$t */
    public static final class C52794t extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C111474m f147497d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52794t(C111474m mVar) {
            super(0);
            this.f147497d = mVar;
        }

        public Object invoke() {
            return Integer.valueOf(C74783i3.m89537a(this.f147497d.f333745d).f24705b);
        }
    }

    /* renamed from: v82.m$u */
    public static final class C52795u extends C87413o implements C32224a<C105883g> {

        /* renamed from: d */
        public final /* synthetic */ C111474m f147498d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52795u(C111474m mVar) {
            super(0);
            this.f147498d = mVar;
        }

        public Object invoke() {
            return (C105883g) C39818r.f106831a.mo62444c(this.f147498d.f333745d).mo75002a(C105883g.class);
        }
    }

    /* renamed from: v82.m$h */
    public static final class C111475h implements Transition.C103824e {

        /* renamed from: d */
        public final /* synthetic */ C111474m f333765d;

        public C111475h(C111474m mVar) {
            this.f333765d = mVar;
        }

        /* renamed from: a */
        public void mo91179a(Transition transition) {
            C87412m.m108594g(transition, "transition");
        }

        /* renamed from: b */
        public void mo77557b(Transition transition) {
            C87412m.m108594g(transition, "transition");
            C111474m mVar = this.f333765d;
            mVar.f333755q.invoke(Integer.valueOf(mVar.mo163180e().f171770c.findViewById(C0966R.C0970id.f5843q5).getHeight()));
        }

        /* renamed from: c */
        public void mo91180c(Transition transition) {
            C87412m.m108594g(transition, "transition");
        }

        /* renamed from: d */
        public void mo91181d(Transition transition) {
            C87412m.m108594g(transition, "transition");
        }
    }

    /* renamed from: v82.m$p */
    public static final class C111476p implements Runnable {

        /* renamed from: d */
        public static final C111476p f333766d = new C111476p();

        public final void run() {
            VoipFloatCardPermissionDialog.C30531a aVar = VoipFloatCardPermissionDialog.f117099e;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            aVar.mo57461a(context);
        }
    }

    /* renamed from: v82.m$r */
    public static final class C111477r extends C87413o implements C32224a<C60244h> {

        /* renamed from: d */
        public final /* synthetic */ C111474m f333767d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111477r(C111474m mVar) {
            super(0);
            this.f333767d = mVar;
        }

        public Object invoke() {
            return C60244h.m70515b(this.f333767d.mo163179d(), C0966R.C0971layout.cjd, this.f333767d.f333745d);
        }
    }

    /* renamed from: v82.m$s */
    public static final class C111478s extends C87413o implements C32224a<C60244h> {

        /* renamed from: d */
        public final /* synthetic */ C111474m f333768d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111478s(C111474m mVar) {
            super(0);
            this.f333768d = mVar;
        }

        public Object invoke() {
            return C60244h.m70515b(this.f333768d.mo163179d(), C0966R.C0971layout.cje, this.f333768d.f333745d);
        }
    }

    public C111474m(MultiTalkMainUI multiTalkMainUI) {
        boolean z;
        C87412m.m108594g(multiTalkMainUI, "mainUI");
        this.f333745d = multiTalkMainUI;
        Object obj = ((HashMap) C105851w0.zx0().f314482U).get("panel_mini_info");
        if (obj != null) {
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            if (bool != null) {
                z = bool.booleanValue();
                this.f333753o = z;
                this.f333754p = Integer.MAX_VALUE;
                this.f333755q = C52793q.f147496d;
                this.f333759u = true;
                this.f333760v = C36568h.m40985a(new C52794t(this));
                this.f333761w = C36568h.m40985a(new C52781c(this));
            }
        }
        z = false;
        this.f333753o = z;
        this.f333754p = Integer.MAX_VALUE;
        this.f333755q = C52793q.f147496d;
        this.f333759u = true;
        this.f333760v = C36568h.m40985a(new C52794t(this));
        this.f333761w = C36568h.m40985a(new C52781c(this));
    }

    /* renamed from: a */
    public static final void m151983a(C111474m mVar, int i) {
        mVar.getClass();
        Log.m105924i("MicroMsg.MT.ControlPanelLogic", "setCurrentY: from " + mVar.f333754p + " to " + i);
        if (mVar.f333754p != i) {
            mVar.f333754p = i;
            mVar.mo163177b(mVar.f333756r, false);
        }
    }

    /* renamed from: b */
    public final void mo163177b(int i, boolean z) {
        Log.m105924i("MicroMsg.MT.ControlPanelLogic", "checkNeedFold: " + i + ", expandedPanelHeight: " + ((Number) ((C36570n) this.f333761w).getValue()).floatValue());
        this.f333756r = i;
        boolean z2 = true;
        if (!this.f333753o) {
            if (i > this.f333754p) {
                this.f333753o = true;
                Map<String, Object> map = C105851w0.zx0().f314482U;
                C87412m.m108593f(map, "getMultiTalkManager().miniInfoHolder");
                ((HashMap) map).put("panel_mini_info", Boolean.TRUE);
                if (((float) i) >= ((Number) ((C36570n) this.f333761w).getValue()).floatValue()) {
                    z2 = false;
                }
                mo163183h(z2, false);
            }
        } else if (z) {
            if (((float) i) >= ((Number) ((C36570n) this.f333761w).getValue()).floatValue()) {
                z2 = false;
            }
            mo163183h(z2, false);
        }
    }

    /* renamed from: c */
    public final View mo163178c() {
        return (View) ((C36570n) this.f333752n).getValue();
    }

    /* renamed from: d */
    public final FrameLayout mo163179d() {
        return (FrameLayout) ((C36570n) this.f333747f).getValue();
    }

    /* renamed from: e */
    public final C60244h mo163180e() {
        return (C60244h) ((C36570n) this.f333749h).getValue();
    }

    /* renamed from: f */
    public final C105883g mo163181f() {
        return (C105883g) ((C36570n) this.f333746e).getValue();
    }

    /* renamed from: g */
    public final void mo163182g(int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (!this.f333753o) {
            if (!this.f333764z) {
                View findViewById = this.f333745d.findViewById(C0966R.C0970id.has);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new C52782d(this, i4));
                }
                ImageView imageView = (ImageView) this.f333745d.findViewById(C0966R.C0970id.f356907for);
                if (imageView != null) {
                    imageView.setVisibility(0);
                    imageView.setImageDrawable(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_filled_arrow, -1));
                }
                TextView textView = (TextView) this.f333745d.findViewById(C0966R.C0970id.f359525ld0);
                if (textView != null) {
                    textView.setVisibility(0);
                    textView.setText(i6);
                }
                this.f333764z = true;
                C119157j jVar = (C119157j) C119157j.f356862d;
                jVar.getClass();
                jVar.mo183892w(new C52783e(this), ((long) i5) * 1000, false);
            }
        } else if (!this.f333764z) {
            ViewGroup viewGroup = mo163180e().f171770c;
            C87412m.m108593f(viewGroup, "sceneExpand.sceneRoot");
            Log.m105924i("MicroMsg.MT.ControlPanelLogic", "handleBadNetworkLogic: showView");
            View findViewById2 = viewGroup.findViewById(C0966R.C0970id.has);
            if (findViewById2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById2;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "handleBadNetworkLogic$initNetView", "(ILcom/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic;ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "handleBadNetworkLogic$initNetView", "(ILcom/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic;ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setOnClickListener(new C52796n(this, i4));
            }
            ((TextView) viewGroup.findViewById(C0966R.C0970id.f359525ld0)).setText(i6);
            ImageView imageView2 = (ImageView) viewGroup.findViewById(C0966R.C0970id.f356907for);
            if (imageView2 != null) {
                imageView2.setImageDrawable(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_filled_arrow, -1));
            }
            View findViewById3 = viewGroup.findViewById(C0966R.C0970id.f5843q5);
            ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
            layoutParams.height += viewGroup.getResources().getDimensionPixelSize(C0966R.dimen.f4316k4);
            findViewById3.setLayoutParams(layoutParams);
            this.f333764z = true;
            C34379c<?> cVar = this.f333738A;
            if (cVar != null) {
                cVar.cancel(false);
            }
            C119157j jVar2 = (C119157j) C119157j.f356862d;
            jVar2.getClass();
            this.f333738A = jVar2.mo183892w(new C52784f(this), ((long) i5) * 1000, false);
        }
    }

    /* renamed from: h */
    public final void mo163183h(boolean z, boolean z2) {
        boolean z3 = z;
        if (z2) {
            this.f333753o = true;
            Map<String, Object> map = C105851w0.zx0().f314482U;
            C87412m.m108593f(map, "getMultiTalkManager().miniInfoHolder");
            ((HashMap) map).put("panel_mini_info", Boolean.TRUE);
        }
        if (!this.f333753o) {
            View c = mo163178c();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = c;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo163179d().setVisibility(8);
            RelativeLayout relativeLayout = (RelativeLayout) this.f333745d.findViewById(C0966R.C0970id.ete);
            relativeLayout.removeAllViews();
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f333745d.findViewById(C0966R.C0970id.bsw);
            relativeLayout2.removeAllViews();
            if (mo163178c() != null) {
                ViewGroup.LayoutParams layoutParams = mo163178c().getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = ((int) ((((double) C76577a.m92159j(this.f333745d)) * 3.6d) / ((double) 100))) + this.f333762x;
                mo163178c().setLayoutParams(layoutParams2);
            }
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams3.addRule(13);
            relativeLayout2.addView((ConstraintLayout) ((C36570n) this.f333750i).getValue(), layoutParams3);
            relativeLayout.addView((RelativeLayout) ((C36570n) this.f333751j).getValue());
            mo163178c().findViewById(C0966R.C0970id.kfp).setOnClickListener(this);
            View findViewById = mo163178c().findViewById(C0966R.C0970id.h46);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "initNormalControl", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "initNormalControl", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            MultiTalkControlIconLayout multiTalkControlIconLayout = (MultiTalkControlIconLayout) mo163178c().findViewById(C0966R.C0970id.h4k);
            multiTalkControlIconLayout.setOnClickListener(new C111487s(this, multiTalkControlIconLayout));
            C0120a0<Boolean> a0Var = this.f333740C;
            if (a0Var != null) {
                mo163181f().f314935e.removeObserver(a0Var);
            }
            C78371t tVar = new C78371t(multiTalkControlIconLayout);
            mo163181f().f314935e.observe(this.f333745d, tVar);
            this.f333740C = tVar;
            MultiTalkControlIconLayout multiTalkControlIconLayout2 = (MultiTalkControlIconLayout) mo163178c().findViewById(C0966R.C0970id.h49);
            multiTalkControlIconLayout2.setOnClickListener(new C111490u(this, multiTalkControlIconLayout2));
            C0120a0<Boolean> a0Var2 = this.f333741D;
            if (a0Var2 != null) {
                mo163181f().f314937g.removeObserver(a0Var2);
            }
            C78372v vVar = new C78372v(multiTalkControlIconLayout2);
            mo163181f().f314937g.observe(this.f333745d, vVar);
            this.f333741D = vVar;
            MultiTalkControlIconLayout multiTalkControlIconLayout3 = (MultiTalkControlIconLayout) mo163178c().findViewById(C0966R.C0970id.h59);
            multiTalkControlIconLayout3.setOnClickListener(new C111491w(this, multiTalkControlIconLayout3));
            C0120a0<Boolean> a0Var3 = this.f333739B;
            if (a0Var3 != null) {
                mo163181f().f314939i.removeObserver(a0Var3);
            }
            C78368o oVar = new C78368o(multiTalkControlIconLayout3);
            mo163181f().f314939i.observe(this.f333745d, oVar);
            this.f333739B = oVar;
            C0120a0<Boolean> a0Var4 = this.f333742E;
            if (a0Var4 != null) {
                mo163181f().f314949v.removeObserver(a0Var4);
            }
            C78369p pVar = new C78369p(multiTalkControlIconLayout2);
            mo163181f().f314949v.observe(this.f333745d, pVar);
            this.f333742E = pVar;
            C0120a0<Boolean> a0Var5 = this.f333743F;
            if (a0Var5 != null) {
                mo163181f().f314951x.removeObserver(a0Var5);
            }
            C78370q qVar = new C78370q(multiTalkControlIconLayout3);
            mo163181f().f314951x.observe(this.f333745d, qVar);
            this.f333743F = qVar;
            mo163178c().post(new C52798r(this));
            f333737H = 1;
            return;
        }
        View c2 = mo163178c();
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view3 = c2;
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo163179d().setVisibility(0);
        View findViewById2 = this.f333745d.findViewById(C0966R.C0970id.has);
        if (findViewById2 != null) {
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view4 = findViewById2;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f333757s = z3;
        mo163179d().setVisibility(0);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.mo145325b(C0966R.C0970id.f5843q5);
        changeBounds.mo145325b(C0966R.C0970id.h4k);
        changeBounds.mo145325b(C0966R.C0970id.h49);
        changeBounds.mo145325b(C0966R.C0970id.h59);
        changeBounds.mo145325b(C0966R.C0970id.kfp);
        changeBounds.f306715f = 300;
        transitionSet.mo145348U(changeBounds);
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.mo145347T(C0966R.C0970id.f358797kc3);
        autoTransition.mo145347T(C0966R.C0970id.f358796kc2);
        autoTransition.mo145347T(C0966R.C0970id.kc6);
        autoTransition.mo145347T(C0966R.C0970id.has);
        long j = 150;
        autoTransition.mo145349V(150);
        if (!z3) {
            j = 0;
        }
        autoTransition.f306714e = j;
        transitionSet.mo145348U(autoTransition);
        transitionSet.mo145346S(new C111475h(this));
        if (z3) {
            C103834d.m138409c(mo163180e(), transitionSet);
            ViewGroup viewGroup = mo163180e().f171770c;
            C87412m.m108593f(viewGroup, "sceneExpand.sceneRoot");
            mo163184i(viewGroup);
            f333737H = 2;
            return;
        }
        C103834d.m138409c((C60244h) ((C36570n) this.f333748g).getValue(), transitionSet);
        ViewGroup viewGroup2 = ((C60244h) ((C36570n) this.f333748g).getValue()).f171770c;
        C87412m.m108593f(viewGroup2, "sceneFold.sceneRoot");
        mo163184i(viewGroup2);
        f333737H = 3;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163184i(android.view.ViewGroup r13) {
        /*
            r12 = this;
            lu3.c<?> r0 = r12.f333738A
            r1 = 0
            if (r0 == 0) goto L_0x0008
            r0.cancel(r1)
        L_0x0008:
            i4.h r0 = r12.mo163180e()
            android.view.ViewGroup r0 = r0.f171770c
            r2 = 2131310072(0x7f0935f8, float:1.8238446E38)
            android.view.View r0 = r0.findViewById(r2)
            if (r0 != 0) goto L_0x0018
            goto L_0x0058
        L_0x0018:
            r2 = 8
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11.mo10233c(r2)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic"
            java.lang.String r6 = "resetNetTip"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r2 = r11.mo10231a(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r4 = "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic"
            java.lang.String r5 = "resetNetTip"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x0058:
            r12.f333764z = r1
            r12.f333758t = r13
            v82.m$l r0 = new v82.m$l
            r0.<init>(r12, r13)
            r13.post(r0)
            r0 = 2131309489(0x7f0933b1, float:1.8237263E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r2 = r12.f333745d
            r3 = 2131755951(0x7f1003af, float:1.9142796E38)
            r4 = -1
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r2, r3, r4)
            r0.setBackground(r2)
            boolean r0 = r12.f333744G
            if (r0 != 0) goto L_0x0084
            r0 = 1
            com.tencent.p014mm.plugin.multitalk.model.C105853x.m142238i(r0, r1)
            r12.f333744G = r0
        L_0x0084:
            r0 = 2131314932(0x7f0948f4, float:1.8248303E38)
            android.view.View r1 = r13.findViewById(r0)
            r1.setOnClickListener(r12)
            r1 = 2131309488(0x7f0933b0, float:1.8237261E38)
            android.view.View r2 = r13.findViewById(r1)
            r2.setOnClickListener(r12)
            r2 = 2131309735(0x7f0934a7, float:1.8237762E38)
            android.view.View r2 = r13.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3 = 2131309736(0x7f0934a8, float:1.8237764E38)
            android.view.View r3 = r13.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            androidx.lifecycle.a0<java.lang.Boolean> r4 = r12.f333739B
            if (r4 == 0) goto L_0x00b7
            com.tencent.mm.plugin.multitalk.ui.g r5 = r12.mo163181f()
            androidx.lifecycle.LiveData<java.lang.Boolean> r5 = r5.f314939i
            r5.removeObserver(r4)
        L_0x00b7:
            v82.m$m r4 = new v82.m$m
            r4.<init>(r2, r3, r12)
            com.tencent.mm.plugin.multitalk.ui.g r5 = r12.mo163181f()
            androidx.lifecycle.LiveData<java.lang.Boolean> r5 = r5.f314939i
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r6 = r12.f333745d
            r5.observe(r6, r4)
            r12.f333739B = r4
            r2.setOnClickListener(r12)
            r4 = 2131309708(0x7f09348c, float:1.8237707E38)
            android.view.View r4 = r13.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 2131309709(0x7f09348d, float:1.823771E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            androidx.lifecycle.a0<java.lang.Boolean> r6 = r12.f333740C
            if (r6 == 0) goto L_0x00eb
            com.tencent.mm.plugin.multitalk.ui.g r7 = r12.mo163181f()
            androidx.lifecycle.LiveData<java.lang.Boolean> r7 = r7.f314935e
            r7.removeObserver(r6)
        L_0x00eb:
            v82.m$n r6 = new v82.m$n
            r6.<init>(r4, r5, r12)
            com.tencent.mm.plugin.multitalk.ui.g r5 = r12.mo163181f()
            androidx.lifecycle.LiveData<java.lang.Boolean> r5 = r5.f314935e
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r7 = r12.f333745d
            r5.observe(r7, r6)
            r12.f333740C = r6
            r4.setOnClickListener(r12)
            r4 = 2131309695(0x7f09347f, float:1.8237681E38)
            android.view.View r4 = r13.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 2131309696(0x7f093480, float:1.8237683E38)
            android.view.View r13 = r13.findViewById(r5)
            android.widget.TextView r13 = (android.widget.TextView) r13
            androidx.lifecycle.a0<java.lang.Boolean> r5 = r12.f333741D
            if (r5 == 0) goto L_0x011f
            com.tencent.mm.plugin.multitalk.ui.g r6 = r12.mo163181f()
            androidx.lifecycle.LiveData<java.lang.Boolean> r6 = r6.f314937g
            r6.removeObserver(r5)
        L_0x011f:
            v82.m$i r5 = new v82.m$i
            r5.<init>(r4, r13, r12)
            com.tencent.mm.plugin.multitalk.ui.g r6 = r12.mo163181f()
            androidx.lifecycle.LiveData<java.lang.Boolean> r6 = r6.f314937g
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r7 = r12.f333745d
            r6.observe(r7, r5)
            r12.f333741D = r5
            r4.setOnClickListener(r12)
            androidx.lifecycle.a0<java.lang.Boolean> r5 = r12.f333742E
            if (r5 == 0) goto L_0x0141
            com.tencent.mm.plugin.multitalk.ui.g r6 = r12.mo163181f()
            androidx.lifecycle.LiveData<java.lang.Boolean> r6 = r6.f314949v
            r6.removeObserver(r5)
        L_0x0141:
            v82.m$j r5 = new v82.m$j
            r5.<init>(r4, r13)
            com.tencent.mm.plugin.multitalk.ui.g r13 = r12.mo163181f()
            androidx.lifecycle.LiveData<java.lang.Boolean> r13 = r13.f314949v
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r4 = r12.f333745d
            r13.observe(r4, r5)
            r12.f333742E = r5
            androidx.lifecycle.a0<java.lang.Boolean> r13 = r12.f333743F
            if (r13 == 0) goto L_0x0160
            com.tencent.mm.plugin.multitalk.ui.g r4 = r12.mo163181f()
            androidx.lifecycle.LiveData<java.lang.Boolean> r4 = r4.f314951x
            r4.removeObserver(r13)
        L_0x0160:
            v82.m$k r13 = new v82.m$k
            r13.<init>(r2, r3)
            com.tencent.mm.plugin.multitalk.ui.g r2 = r12.mo163181f()
            androidx.lifecycle.LiveData<java.lang.Boolean> r2 = r2.f314951x
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI r3 = r12.f333745d
            r2.observe(r3, r13)
            r12.f333743F = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "checkNaviHeight() called with: h = "
            r13.append(r2)
            int r2 = r12.f333762x
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            java.lang.String r2 = "MicroMsg.MT.ControlPanelLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r13)
            java.lang.Boolean r13 = r12.f333763y
            boolean r3 = r12.f333757s
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r13 = gy3.C87412m.m108589b(r13, r3)
            if (r13 == 0) goto L_0x019f
            java.lang.String r13 = "checkNaviHeight: no need to update"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r13)
            goto L_0x0249
        L_0x019f:
            boolean r13 = r12.f333757s
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r12.f333763y = r13
            int r13 = r12.f333762x
            i4.h r2 = r12.mo163180e()
            android.view.ViewGroup r2 = r2.f171770c
            r3 = 2131300436(0x7f091054, float:1.8218902E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "it.findViewById<View>(R.id.control_panel_root)"
            gy3.C87412m.m108593f(r3, r4)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            int r5 = r4.height
            int r5 = r5 + r13
            r4.height = r5
            r3.setLayoutParams(r4)
            r3 = 2131296984(0x7f0902d8, float:1.82119E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "it.findViewById<View>(R.id.anim_bg)"
            gy3.C87412m.m108593f(r3, r4)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            int r5 = r4.height
            int r5 = r5 + r13
            r4.height = r5
            r3.setLayoutParams(r4)
            android.view.View r0 = r2.findViewById(r0)
            java.lang.String r3 = "it.findViewById<View>(R.id.talking_hangup_btn)"
            gy3.C87412m.m108593f(r0, r3)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            boolean r4 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            r5 = 0
            if (r4 == 0) goto L_0x01f4
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L_0x01f5
        L_0x01f4:
            r3 = r5
        L_0x01f5:
            if (r3 != 0) goto L_0x01f8
            goto L_0x0200
        L_0x01f8:
            int r4 = r3.bottomMargin
            int r4 = r4 + r13
            r3.bottomMargin = r4
            r0.setLayoutParams(r3)
        L_0x0200:
            android.view.View r0 = r2.findViewById(r1)
            java.lang.String r1 = "it.findViewById<View>(R.id.more_arrow)"
            gy3.C87412m.m108593f(r0, r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r3 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L_0x0214
            r5 = r1
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
        L_0x0214:
            if (r5 != 0) goto L_0x0217
            goto L_0x021f
        L_0x0217:
            int r1 = r5.bottomMargin
            int r1 = r1 + r13
            r5.bottomMargin = r1
            r0.setLayoutParams(r5)
        L_0x021f:
            r0 = 2131300434(0x7f091052, float:1.8218898E38)
            android.view.View r0 = r2.findViewById(r0)
            androidx.constraintlayout.widget.Guideline r0 = (androidx.constraintlayout.widget.Guideline) r0
            if (r0 == 0) goto L_0x023b
            android.content.res.Resources r1 = r0.getResources()
            r3 = 2131166982(0x7f070706, float:1.7948225E38)
            float r1 = r1.getDimension(r3)
            float r3 = (float) r13
            float r1 = r1 + r3
            int r1 = (int) r1
            r0.setGuidelineEnd(r1)
        L_0x023b:
            r0 = 2131300435(0x7f091053, float:1.82189E38)
            android.view.View r0 = r2.findViewById(r0)
            androidx.constraintlayout.widget.Guideline r0 = (androidx.constraintlayout.widget.Guideline) r0
            if (r0 == 0) goto L_0x0249
            r0.setGuidelineEnd(r13)
        L_0x0249:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v82.C111474m.mo163184i(android.view.ViewGroup):void");
    }

    public void onClick(View view) {
        View view2 = view;
        Class cls = C103918d.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f333759u) {
            Log.m105928w("MicroMsg.MT.ControlPanelLogic", "now disable click");
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z = false;
        if (view2 != null && !view.isEnabled()) {
            Log.m105928w("MicroMsg.MT.ControlPanelLogic", "onClick view is not enable");
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Integer valueOf = view2 != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.kfp) {
            Log.m105924i("MicroMsg.MT.ControlPanelLogic", "hangup click ");
            C111720c0 c0Var = C111720c0.f334432a;
            C111720c0.f334439h = System.currentTimeMillis();
            C105851w0.zx0().mo150660f(true, false);
            if (!((C103918d) C86312j.m106911c(cls)).mo125772Jn(this.f333745d)) {
                C119179t tVar = C119157j.f356862d;
                C111476p pVar = C111476p.f333766d;
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(pVar, 2000, false);
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.f358770gz3) {
            Log.m105924i("MicroMsg.MT.ControlPanelLogic", "onClick: more_array " + this.f333757s);
            C105853x.m142238i(false, this.f333757s ^ true);
            mo163183h(this.f333757s ^ true, false);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.h59) {
            Log.m105924i("MicroMsg.MT.ControlPanelLogic", "onClick: video_action");
            if (C87412m.m108589b(mo163181f().f314939i.getValue(), Boolean.TRUE)) {
                MultiTalkMainUI multiTalkMainUI = this.f333745d;
                C76912y0.m92773l(multiTalkMainUI, multiTalkMainUI.getResources().getString(C0966R.string.ifa));
            } else {
                if (!((C103918d) C86312j.m106911c(cls)).mo125788z1(this.f333745d.getContext(), "android.permission.CAMERA", 22, "", "")) {
                    Log.m105924i("MicroMsg.MT.ControlPanelLogic", "checkCameraPermission: no camera permission");
                    C115669n.INSTANCE.idkeyStat(220, 26, 1, false);
                } else if (!C105851w0.zx0().mo150683y()) {
                    Log.m105924i("MicroMsg.MT.ControlPanelLogic", "checkCameraPermission: multitalk not starting");
                } else if (!C105851w0.zx0().mo150684z()) {
                    Log.m105924i("MicroMsg.MT.ControlPanelLogic", "checkCameraPermission: multitalk not talking");
                } else if (!NetStatusUtil.isNetworkConnected(this.f333745d)) {
                    Log.m105924i("MicroMsg.MT.ControlPanelLogic", "checkCameraPermission: no netwotk");
                    C75346e.m90356b(this.f333745d, C0966R.string.f360087a11, (Runnable) null);
                } else {
                    long a = C105806i0.m142148a();
                    if (a > 0) {
                        Log.m105925i("MicroMsg.MT.ControlPanelLogic", "onClickVideoAction, isOverLoadFail is true! videoWaitMills:%s", Long.valueOf(a));
                        Toast.makeText(MMApplicationContext.getContext(), MMApplicationContext.getContext().getString(C0966R.string.lv6, new Object[]{Integer.valueOf((int) Math.ceil((double) (((float) a) / 1000.0f)))}), 0).show();
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    Log.m105924i("MicroMsg.MT.ControlPanelLogic", "camera permission error");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            C105883g f = mo163181f();
            C87412m.m108593f(f, "viewModel");
            f.mo150904d3((Boolean) null);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.h4k) {
            Log.m105924i("MicroMsg.MT.ControlPanelLogic", "onClick: mute_action");
            C105883g f2 = mo163181f();
            f2.getClass();
            Log.m105924i("MicroMsg.MT.MultiTalkUIViewModel", "onMicClick, cur state: " + f2.f314935e.getValue());
            Boolean value = f2.f314935e.getValue();
            if (value == null) {
                value = Boolean.FALSE;
            }
            boolean booleanValue = value.booleanValue();
            f2.f314934d.setValue(Boolean.valueOf(!booleanValue));
            C105853x.f314824b++;
            C105851w0.zx0().mo150641R(booleanValue);
            if (booleanValue) {
                C105853x.m142230a(1);
                C105851w0.xx0().mo150826f(false);
            } else {
                C105853x.m142230a(2);
                C105851w0.xx0().mo150826f(true);
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.h49) {
            Log.m105924i("MicroMsg.MT.ControlPanelLogic", "onClick: handsfree_action");
            C105883g f3 = mo163181f();
            C87412m.m108593f(f3, "viewModel");
            f3.mo150905e3((Boolean) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
