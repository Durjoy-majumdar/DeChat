package kl1;

import a14.C53934p0;
import a14.C53973z1;
import ak1.C54067f0;
import ak1.C54116w;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import ky3.C88334c;
import my3.C61595o;
import nk1.C11207i;
import ok1.C62042e;
import qj1.C12322e5;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110823p;
import tm0.C14039u;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: kl1.v */
public final class C10346v {

    /* renamed from: a */
    public final ViewGroup f31512a;

    /* renamed from: b */
    public final C12322e5 f31513b;

    /* renamed from: c */
    public final String f31514c = "FinderLiveHotCommentWidget";

    /* renamed from: d */
    public final C13601g f31515d = C36568h.m40985a(new C10349c(this));

    /* renamed from: e */
    public final C13601g f31516e = C36568h.m40985a(new C10348b(this));

    /* renamed from: f */
    public final long f31517f = 8;

    /* renamed from: g */
    public final Integer[] f31518g = {89, 64, Integer.valueOf(C14039u.CTRL_INDEX)};

    /* renamed from: h */
    public final C13601g f31519h = C36568h.m40985a(new C10350d(this));

    /* renamed from: i */
    public final ObjectAnimator f31520i;

    /* renamed from: j */
    public final ObjectAnimator f31521j;

    /* renamed from: k */
    public final ObjectAnimator f31522k;

    /* renamed from: l */
    public final List<Integer> f31523l;

    /* renamed from: m */
    public C53973z1 f31524m;

    /* renamed from: n */
    public AnimatorSet f31525n;

    /* renamed from: kl1.v$a */
    public static final class C10347a extends C87413o implements C32224a<C10345u> {

        /* renamed from: d */
        public final /* synthetic */ C10346v f31526d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10347a(C10346v vVar) {
            super(0);
            this.f31526d = vVar;
        }

        public Object invoke() {
            return new C10345u(this.f31526d);
        }
    }

    /* renamed from: kl1.v$b */
    public static final class C10348b extends C87413o implements C32224a<FinderLiveGiftTextView> {

        /* renamed from: d */
        public final /* synthetic */ C10346v f31527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10348b(C10346v vVar) {
            super(0);
            this.f31527d = vVar;
        }

        public Object invoke() {
            FinderLiveGiftTextView finderLiveGiftTextView = (FinderLiveGiftTextView) this.f31527d.f31512a.findViewById(C0966R.C0970id.dm4);
            C62042e eVar = C62042e.f176370a;
            C87412m.m108593f(finderLiveGiftTextView, "this");
            eVar.mo87033P1(finderLiveGiftTextView);
            return finderLiveGiftTextView;
        }
    }

    /* renamed from: kl1.v$c */
    public static final class C10349c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C10346v f31528d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10349c(C10346v vVar) {
            super(0);
            this.f31528d = vVar;
        }

        public Object invoke() {
            return (TextView) this.f31528d.f31512a.findViewById(C0966R.C0970id.nuj);
        }
    }

    /* renamed from: kl1.v$d */
    public static final class C10350d extends C87413o implements C32224a<ObjectAnimator> {

        /* renamed from: d */
        public final /* synthetic */ C10346v f31529d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10350d(C10346v vVar) {
            super(0);
            this.f31529d = vVar;
        }

        public Object invoke() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f31529d.f31512a, "translationX", new float[]{-500.0f, 0.0f});
            C10346v vVar = this.f31529d;
            ofFloat.setDuration(500);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addListener(new C10351w(vVar));
            return ofFloat;
        }
    }

    public C10346v(ViewGroup viewGroup, C12322e5 e5Var) {
        C87412m.m108594g(viewGroup, "bullet");
        C87412m.m108594g(e5Var, "plugin");
        this.f31512a = viewGroup;
        this.f31513b = e5Var;
        ObjectAnimator duration = ObjectAnimator.ofFloat(mo10643d(), "scaleX", new float[]{0.0f, 1.1f}).setDuration(125);
        C87412m.m108593f(duration, "ofFloat(cntTv, \"scaleX\",…f, 1.1f).setDuration(125)");
        this.f31520i = duration;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(mo10643d(), "scaleY", new float[]{0.0f, 1.1f}).setDuration(125);
        C87412m.m108593f(duration2, "ofFloat(cntTv, \"scaleY\",…f, 1.1f).setDuration(125)");
        this.f31521j = duration2;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(mo10643d(), "alpha", new float[]{0.0f, 1.0f}).setDuration(208);
        C87412m.m108593f(duration3, "ofFloat(cntTv, \"alpha\", 0f, 1.0f).setDuration(208)");
        this.f31522k = duration3;
        this.f31523l = Collections.synchronizedList(new ArrayList());
        C13601g a = C36568h.m40985a(new C10347a(this));
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(mo10643d(), "scaleX", new float[]{1.1f, 1.0f}).setDuration(83);
        C87412m.m108593f(duration4, "ofFloat(cntTv, \"scaleX\",…1f, 1.0f).setDuration(83)");
        duration4.setStartDelay(125);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(mo10643d(), "scaleY", new float[]{1.1f, 1.0f}).setDuration(83);
        C87412m.m108593f(duration5, "ofFloat(cntTv, \"scaleY\",…1f, 1.0f).setDuration(83)");
        duration5.setStartDelay(125);
        mo10643d().setPivotX(0.0f);
        mo10643d().setPivotY((float) mo10643d().getMeasuredHeight());
        animatorSet.playTogether(new Animator[]{duration, duration2, duration4, duration5, duration3});
        animatorSet.addListener((C10345u) ((C36570n) a).getValue());
        this.f31525n = animatorSet;
    }

    /* renamed from: a */
    public static final void m10276a(C10346v vVar) {
        Log.m105918d(vVar.f31514c, "launchCntAnim");
        List<Integer> list = vVar.f31523l;
        C87412m.m108593f(list, "cntQueue");
        if (!list.isEmpty()) {
            vVar.f31525n.start();
            return;
        }
        C53973z1 z1Var = vVar.f31524m;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        vVar.f31524m = C11207i.m11072h(vVar.f31513b, (C66212f) null, (C53934p0) null, new C10352x(vVar, (C15601d<? super C10352x>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public static final void m10277b(C10346v vVar) {
        vVar.getClass();
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54067f0.C54076o0 o0Var = C54067f0.C54076o0.HOT_COMMENT;
        C104289g gVar = new C104289g();
        gVar.mo145953n("type", 1);
        gVar.put("hot_word", ((TextView) ((C36570n) vVar.f31515d).getValue()).getText());
        C13598b0 b0Var = C13598b0.f38549a;
        C54116w.Ex0((C54116w) c, o0Var, gVar.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    /* renamed from: c */
    public final void mo10642c(int i, int i2) {
        if (i <= i2) {
            while (true) {
                if (!C110823p.m151009y(this.f31518g, Integer.valueOf(i))) {
                    this.f31523l.add(Integer.valueOf(i));
                }
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        Long valueOf = Long.valueOf(((long) this.f31523l.size()) - this.f31517f);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            for (long j = 0; j < longValue; j++) {
                int g = C61595o.m72299g(C61595o.m72301i(1, this.f31523l.size() - 1), C88334c.f255322d);
                String str = this.f31514c;
                Log.m105918d(str, "[resetCntQueueLength] del_index = " + g + ", cntQueue.size = " + this.f31523l.size());
                this.f31523l.remove(g);
            }
        }
    }

    /* renamed from: d */
    public final FinderLiveGiftTextView mo10643d() {
        return (FinderLiveGiftTextView) this.f31516e.getValue();
    }

    /* renamed from: e */
    public final void mo10644e() {
        if (((ObjectAnimator) ((C36570n) this.f31519h).getValue()).isRunning()) {
            ((ObjectAnimator) ((C36570n) this.f31519h).getValue()).cancel();
        }
        if (this.f31525n.isRunning()) {
            this.f31525n.cancel();
        }
        this.f31523l.clear();
        this.f31512a.setVisibility(8);
        C53973z1 z1Var = this.f31524m;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }
}
