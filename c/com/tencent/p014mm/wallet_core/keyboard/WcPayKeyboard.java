package com.tencent.p014mm.wallet_core.keyboard;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.gridlayout.widget.GridLayout;
import br3.C67310a;
import br3.C67311b;
import br3.C67313c;
import br3.C67314d;
import br3.C67315e;
import br3.C67316f;
import br3.C67320j;
import com.tencent.kinda.gen.TraitsType;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.LayoutListenerView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import yq3.C79145c;

/* renamed from: com.tencent.mm.wallet_core.keyboard.WcPayKeyboard */
public class WcPayKeyboard extends RelativeLayout {

    /* renamed from: G */
    public static final /* synthetic */ int f220893G = 0;

    /* renamed from: A */
    public C75087g f220894A;

    /* renamed from: B */
    public C75086f f220895B;

    /* renamed from: C */
    public boolean f220896C;

    /* renamed from: D */
    public boolean f220897D;

    /* renamed from: E */
    public ObjectAnimator f220898E;

    /* renamed from: F */
    public ObjectAnimator f220899F;

    /* renamed from: d */
    public TextView f220900d;

    /* renamed from: e */
    public TextView f220901e;

    /* renamed from: f */
    public TextView f220902f;

    /* renamed from: g */
    public TextView f220903g;

    /* renamed from: h */
    public TextView f220904h;

    /* renamed from: i */
    public TextView f220905i;

    /* renamed from: j */
    public TextView f220906j;

    /* renamed from: n */
    public TextView f220907n;

    /* renamed from: o */
    public TextView f220908o;

    /* renamed from: p */
    public TextView f220909p;

    /* renamed from: q */
    public TextView f220910q;

    /* renamed from: r */
    public TextView f220911r;

    /* renamed from: s */
    public View f220912s;

    /* renamed from: t */
    public TextView f220913t;

    /* renamed from: u */
    public LinearLayout f220914u;

    /* renamed from: v */
    public ViewGroup f220915v;

    /* renamed from: w */
    public LinearLayout f220916w;

    /* renamed from: x */
    public WcPayKeyboardAnimationActionButton f220917x;

    /* renamed from: y */
    public EditText f220918y;

    /* renamed from: z */
    public View f220919z;

    /* renamed from: com.tencent.mm.wallet_core.keyboard.WcPayKeyboard$a */
    public class C75079a implements View.OnClickListener {
        public C75079a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/wallet_core/keyboard/WcPayKeyboard$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (WcPayKeyboard.this.f220918y == null) {
                C117292a.m165361g(this, "com/tencent/mm/wallet_core/keyboard/WcPayKeyboard$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            int i = view.getId() == C0966R.C0970id.fff ? 7 : view.getId() == C0966R.C0970id.ffg ? 8 : view.getId() == C0966R.C0970id.ffh ? 9 : view.getId() == C0966R.C0970id.ffi ? 10 : view.getId() == C0966R.C0970id.ffj ? 11 : view.getId() == C0966R.C0970id.ffk ? 12 : view.getId() == C0966R.C0970id.ffl ? 13 : view.getId() == C0966R.C0970id.ffm ? 14 : view.getId() == C0966R.C0970id.ffn ? 15 : view.getId() == C0966R.C0970id.ffo ? 16 : view.getId() == C0966R.C0970id.ffw ? 67 : view.getId() == C0966R.C0970id.f358495fg3 ? 56 : (view.getId() == C0966R.C0970id.ffp || view.getId() == C0966R.C0970id.ffq) ? 66 : 0;
            if (!Util.isEqual(i, 0)) {
                view.performHapticFeedback(0, 2);
            }
            if (view.getId() != C0966R.C0970id.ffp) {
                view.getId();
            }
            WcPayKeyboard.this.f220918y.dispatchKeyEvent(new KeyEvent(0, i));
            WcPayKeyboard.this.f220918y.dispatchKeyEvent(new KeyEvent(1, i));
            C117292a.m165361g(this, "com/tencent/mm/wallet_core/keyboard/WcPayKeyboard$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.keyboard.WcPayKeyboard$b */
    public class C75080b implements Runnable {
        public C75080b() {
        }

        public void run() {
            WcPayKeyboard wcPayKeyboard = WcPayKeyboard.this;
            if (wcPayKeyboard.f220896C) {
                wcPayKeyboard.setWindowViewBottomMargin(wcPayKeyboard.f220916w.getHeight());
            }
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.keyboard.WcPayKeyboard$c */
    public class C75081c implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ int f220922d;

        /* renamed from: e */
        public final /* synthetic */ boolean f220923e;

        public C75081c(int i, boolean z) {
            this.f220922d = i;
            this.f220923e = z;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            WcPayKeyboard.this.f220916w.setVisibility(4);
            LinearLayout linearLayout = WcPayKeyboard.this.f220916w;
            linearLayout.setTranslationY(linearLayout.getTranslationY() - ((float) this.f220922d));
            if (this.f220923e) {
                WcPayKeyboard.this.setVisibility(8);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.keyboard.WcPayKeyboard$d */
    public class C75082d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ int f220925d;

        public C75082d(int i) {
            this.f220925d = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (WcPayKeyboard.this.f220895B != null) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = this.f220925d;
                float f = ((float) i) - floatValue;
                Log.m105927v("MicroMsg.WcPayKeyBoard", "hideWcPayKeyboardBase() onAnimationUpdate() baseHeight:%s translationY:%s %s", Integer.valueOf(i), Float.valueOf(floatValue), Float.valueOf(f));
                WcPayKeyboard.this.f220895B.mo95768R2(f);
            }
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.keyboard.WcPayKeyboard$e */
    public class C75083e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f220927d;

        /* renamed from: com.tencent.mm.wallet_core.keyboard.WcPayKeyboard$e$a */
        public class C75084a implements Animator.AnimatorListener {
            public C75084a() {
            }

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                Log.m105918d("MicroMsg.WcPayKeyBoard", "keyboard anim end");
                C75083e eVar = C75083e.this;
                if (!eVar.f220927d) {
                    WcPayKeyboard.this.f220911r.setVisibility(0);
                    WcPayKeyboard.this.f220917x.setVisibility(4);
                }
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                WcPayKeyboard.this.f220916w.setVisibility(0);
                C75083e eVar = C75083e.this;
                if (eVar.f220927d) {
                    WcPayKeyboard.this.f220911r.setVisibility(0);
                } else {
                    WcPayKeyboard.this.f220911r.setVisibility(4);
                }
            }
        }

        /* renamed from: com.tencent.mm.wallet_core.keyboard.WcPayKeyboard$e$b */
        public class C75085b implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ int f220930d;

            public C75085b(int i) {
                this.f220930d = i;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (WcPayKeyboard.this.f220895B != null) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int i = this.f220930d;
                    float f = ((float) i) - floatValue;
                    Log.m105927v("MicroMsg.WcPayKeyBoard", "showWcPayKeyboardBase() onAnimationUpdate() baseHeight:%s translationY:%s %s", Integer.valueOf(i), Float.valueOf(floatValue), Float.valueOf(f));
                    WcPayKeyboard.this.f220895B.mo95768R2(f);
                }
            }
        }

        public C75083e(boolean z) {
            this.f220927d = z;
        }

        public void run() {
            WcPayKeyboard wcPayKeyboard = WcPayKeyboard.this;
            if (wcPayKeyboard.f220896C) {
                boolean z = this.f220927d;
                Animation loadAnimation = AnimationUtils.loadAnimation(wcPayKeyboard.getContext(), C0966R.C0968anim.f2492eg);
                loadAnimation.setInterpolator(new LinearInterpolator());
                loadAnimation.setDuration(330);
                loadAnimation.setAnimationListener(new C67311b(wcPayKeyboard, z));
                wcPayKeyboard.f220916w.startAnimation(loadAnimation);
                return;
            }
            int height = wcPayKeyboard.f220916w.getHeight();
            WcPayKeyboard wcPayKeyboard2 = WcPayKeyboard.this;
            if (wcPayKeyboard2.f220898E == null) {
                float translationY = wcPayKeyboard2.f220916w.getTranslationY();
                WcPayKeyboard wcPayKeyboard3 = WcPayKeyboard.this;
                wcPayKeyboard3.f220898E = ObjectAnimator.ofFloat(wcPayKeyboard3.f220916w, "translationY", new float[]{((float) height) + translationY, translationY});
                WcPayKeyboard.this.f220898E.setDuration(300);
                WcPayKeyboard.this.f220898E.setInterpolator(new AccelerateDecelerateInterpolator());
            }
            WcPayKeyboard.this.f220898E.removeAllListeners();
            WcPayKeyboard.this.f220898E.addListener(new C75084a());
            WcPayKeyboard.this.f220898E.removeAllUpdateListeners();
            WcPayKeyboard.this.f220898E.addUpdateListener(new C75085b(height));
            WcPayKeyboard.this.f220898E.start();
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.keyboard.WcPayKeyboard$f */
    public interface C75086f {
        /* renamed from: R2 */
        void mo95768R2(float f);
    }

    /* renamed from: com.tencent.mm.wallet_core.keyboard.WcPayKeyboard$g */
    public enum C75087g {
        NORMAL_STATE,
        SINGLE_ACTION_STATE,
        INIT_STATE
    }

    public WcPayKeyboard(Context context) {
        super(context);
        this.f220894A = C75087g.INIT_STATE;
        this.f220896C = false;
        this.f220897D = true;
        this.f220898E = null;
        this.f220899F = null;
        mo104744h();
    }

    /* access modifiers changed from: private */
    public void setWindowViewBottomMargin(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f220919z.getLayoutParams();
        layoutParams.bottomMargin = i;
        this.f220919z.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public void mo104737b(MMActivity mMActivity, int i) {
        LayoutListenerView layoutListenerView = (LayoutListenerView) mMActivity.findViewById(C0966R.C0970id.f358753gv2);
        layoutListenerView.setBackgroundColor(i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        layoutListenerView.addView(this, layoutParams);
        setVisibility(8);
        this.f220919z = layoutListenerView.getChildAt(0);
        this.f220896C = true;
    }

    /* renamed from: c */
    public void mo104738c(boolean z) {
        this.f220911r.setEnabled(z);
        this.f220917x.setEnabled(z);
        if (z) {
            this.f220911r.setBackgroundResource(C0966R.C0969drawable.b2a);
            this.f220911r.setTextColor(getResources().getColor(C0966R.color.alc));
        } else if (C85875k4.m106211z()) {
            this.f220911r.setBackgroundResource(C0966R.C0969drawable.b2b);
            this.f220911r.setTextColor(Color.parseColor("#347051"));
        } else {
            this.f220911r.setBackgroundResource(C0966R.C0969drawable.b2a);
            this.f220911r.setTextColor(Color.parseColor("#CDF2DF"));
        }
    }

    /* renamed from: d */
    public final void mo104739d(boolean z, boolean z2) {
        if (z) {
            this.f220917x.setVisibility(0);
            WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton = this.f220917x;
            if (wcPayKeyboardAnimationActionButton.f220971z) {
                int[] iArr = new int[2];
                this.f220911r.getLocationOnScreen(iArr);
                this.f220915v.getLocationOnScreen(new int[2]);
                if (this.f220913t.isShown()) {
                    this.f220913t.getHeight();
                    C76577a.m92151b(getContext(), 24);
                }
                this.f220912s.getHeight();
                C76577a.m92151b(getContext(), 16);
                this.f220917x.mo104776b(this.f220911r.getWidth(), this.f220911r.getHeight(), C76577a.m92151b(getContext(), 8), iArr[0]);
            } else {
                wcPayKeyboardAnimationActionButton.mo104776b(wcPayKeyboardAnimationActionButton.f220937B, wcPayKeyboardAnimationActionButton.f220938C, wcPayKeyboardAnimationActionButton.f220939D, wcPayKeyboardAnimationActionButton.f220940E);
            }
            WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton2 = this.f220917x;
            wcPayKeyboardAnimationActionButton2.f220968w = this.f220911r.getText() + "";
            this.f220911r.setVisibility(4);
            MMHandlerThread.postToMainThread(new C67313c(this));
        } else if (z2) {
            WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton3 = this.f220917x;
            if (wcPayKeyboardAnimationActionButton3.f220949N == null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wcPayKeyboardAnimationActionButton3, "translationX", new float[]{wcPayKeyboardAnimationActionButton3.f220969x, wcPayKeyboardAnimationActionButton3.f220970y});
                wcPayKeyboardAnimationActionButton3.f220949N = ofFloat;
                ofFloat.setDuration((long) wcPayKeyboardAnimationActionButton3.f220966u);
                wcPayKeyboardAnimationActionButton3.f220949N.setInterpolator(new AccelerateDecelerateInterpolator());
            }
            int i = wcPayKeyboardAnimationActionButton3.f220962q;
            wcPayKeyboardAnimationActionButton3.f220964s = i;
            if (wcPayKeyboardAnimationActionButton3.f220950P == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, wcPayKeyboardAnimationActionButton3.f220959n});
                wcPayKeyboardAnimationActionButton3.f220950P = ofInt;
                ofInt.setDuration((long) wcPayKeyboardAnimationActionButton3.f220967v);
                wcPayKeyboardAnimationActionButton3.f220950P.addUpdateListener(new C67320j(wcPayKeyboardAnimationActionButton3));
            }
            wcPayKeyboardAnimationActionButton3.f220936A = false;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) wcPayKeyboardAnimationActionButton3.getLayoutParams();
            layoutParams.height = wcPayKeyboardAnimationActionButton3.f220959n;
            wcPayKeyboardAnimationActionButton3.setLayoutParams(layoutParams);
            AnimatorSet animatorSet = new AnimatorSet();
            wcPayKeyboardAnimationActionButton3.f220951Q = animatorSet;
            animatorSet.play(wcPayKeyboardAnimationActionButton3.f220950P).with(wcPayKeyboardAnimationActionButton3.f220949N);
            MMHandlerThread.postToMainThread(new C67314d(this));
        } else {
            WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton4 = this.f220917x;
            wcPayKeyboardAnimationActionButton4.f220960o = C76577a.m92151b(wcPayKeyboardAnimationActionButton4.f220952d, 4);
            wcPayKeyboardAnimationActionButton4.f220964s = wcPayKeyboardAnimationActionButton4.f220959n;
            wcPayKeyboardAnimationActionButton4.f220965t = wcPayKeyboardAnimationActionButton4.f220958j;
            wcPayKeyboardAnimationActionButton4.setTranslationX(wcPayKeyboardAnimationActionButton4.getTranslationX() + ((float) wcPayKeyboardAnimationActionButton4.f220961p));
            wcPayKeyboardAnimationActionButton4.invalidate();
            this.f220917x.setVisibility(8);
        }
    }

    /* renamed from: e */
    public void mo104740e() {
        this.f220913t.setVisibility(8);
        mo104750n();
    }

    /* renamed from: f */
    public void mo104741f() {
        Log.m105925i("MicroMsg.WcPayKeyBoard", "hideWcKb() %s %s [%s]", Boolean.valueOf(isShown()), this.f220894A, Util.getStack());
        if (!mo104745i() && this.f220894A != C75087g.INIT_STATE && isShown()) {
            if (mo104748l()) {
                mo104742g(true);
            }
            if (mo104749m()) {
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2542g0);
                loadAnimation.setAnimationListener(new C67315e(this, true));
                this.f220917x.startAnimation(loadAnimation);
            }
        }
    }

    /* renamed from: g */
    public final void mo104742g(boolean z) {
        if (this.f220896C) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2493eh);
            loadAnimation.setDuration(330);
            loadAnimation.setInterpolator(new LinearInterpolator());
            loadAnimation.setAnimationListener(new C67310a(this, z));
            this.f220916w.startAnimation(loadAnimation);
            setWindowViewBottomMargin(0);
            return;
        }
        int height = this.f220916w.getHeight();
        if (this.f220899F == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f220916w, "translationY", new float[]{0.0f, (float) height});
            this.f220899F = ofFloat;
            ofFloat.setDuration(300);
            this.f220899F.setInterpolator(new AccelerateDecelerateInterpolator());
        }
        this.f220899F.removeAllListeners();
        this.f220899F.addListener(new C75081c(height, z));
        this.f220899F.removeAllUpdateListeners();
        this.f220899F.addUpdateListener(new C75082d(height));
        this.f220899F.start();
    }

    public EditText getInputEditText() {
        return this.f220918y;
    }

    /* renamed from: h */
    public final void mo104744h() {
        if (this.f220897D) {
            LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.ch_, this, true);
        } else {
            LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cwm, this, true);
        }
        this.f220916w = (LinearLayout) findViewById(C0966R.C0970id.ffr);
        this.f220909p = (TextView) findViewById(C0966R.C0970id.fff);
        this.f220900d = (TextView) findViewById(C0966R.C0970id.ffg);
        this.f220901e = (TextView) findViewById(C0966R.C0970id.ffh);
        this.f220902f = (TextView) findViewById(C0966R.C0970id.ffi);
        this.f220903g = (TextView) findViewById(C0966R.C0970id.ffj);
        this.f220904h = (TextView) findViewById(C0966R.C0970id.ffk);
        this.f220905i = (TextView) findViewById(C0966R.C0970id.ffl);
        this.f220906j = (TextView) findViewById(C0966R.C0970id.ffm);
        this.f220907n = (TextView) findViewById(C0966R.C0970id.ffn);
        this.f220908o = (TextView) findViewById(C0966R.C0970id.ffo);
        this.f220910q = (TextView) findViewById(C0966R.C0970id.f358495fg3);
        this.f220912s = findViewById(C0966R.C0970id.ffw);
        TextView textView = (TextView) findViewById(C0966R.C0970id.ffp);
        this.f220911r = textView;
        if (textView == null) {
            this.f220911r = new TextView(getContext());
        }
        WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton = (WcPayKeyboardAnimationActionButton) findViewById(C0966R.C0970id.ffq);
        this.f220917x = wcPayKeyboardAnimationActionButton;
        if (wcPayKeyboardAnimationActionButton == null) {
            this.f220917x = new WcPayKeyboardAnimationActionButton(getContext());
        }
        this.f220913t = (TextView) findViewById(C0966R.C0970id.fg5);
        this.f220914u = (LinearLayout) findViewById(C0966R.C0970id.nnw);
        this.f220915v = (ViewGroup) findViewById(C0966R.C0970id.fg4);
        this.f220911r.setTypeface(Typeface.defaultFromStyle(1));
        this.f220911r.setTextSize(1, C76577a.m92165p(getContext()) * 17.0f);
        C75079a aVar = new C75079a();
        this.f220916w.setOnClickListener(aVar);
        this.f220909p.setOnClickListener(aVar);
        this.f220900d.setOnClickListener(aVar);
        this.f220901e.setOnClickListener(aVar);
        this.f220902f.setOnClickListener(aVar);
        this.f220903g.setOnClickListener(aVar);
        this.f220904h.setOnClickListener(aVar);
        this.f220905i.setOnClickListener(aVar);
        this.f220906j.setOnClickListener(aVar);
        this.f220907n.setOnClickListener(aVar);
        this.f220908o.setOnClickListener(aVar);
        this.f220912s.setOnClickListener(aVar);
        this.f220910q.setOnClickListener(aVar);
        this.f220911r.setOnClickListener(aVar);
        this.f220917x.setOnClickListener(aVar);
        C79145c cVar = new C79145c();
        cVar.setViewType(TraitsType.BUTTON);
        this.f220911r.setAccessibilityDelegate(cVar);
        this.f220912s.setAccessibilityDelegate(cVar);
    }

    /* renamed from: i */
    public boolean mo104745i() {
        ObjectAnimator objectAnimator = this.f220899F;
        boolean isRunning = objectAnimator == null ? false : objectAnimator.isRunning();
        ObjectAnimator objectAnimator2 = this.f220898E;
        if (!(isRunning || (objectAnimator2 == null ? false : objectAnimator2.isRunning()))) {
            WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton = this.f220917x;
            AnimatorSet animatorSet = wcPayKeyboardAnimationActionButton.f220948M;
            return (animatorSet != null && wcPayKeyboardAnimationActionButton.f220947L != null && wcPayKeyboardAnimationActionButton.f220946K != null && wcPayKeyboardAnimationActionButton.f220945J != null) ? animatorSet.isRunning() : false;
        }
    }

    /* renamed from: j */
    public boolean mo104746j() {
        return getVisibility() == 8 && !mo104747k();
    }

    /* renamed from: k */
    public boolean mo104747k() {
        return this.f220894A == C75087g.INIT_STATE;
    }

    /* renamed from: l */
    public boolean mo104748l() {
        return this.f220894A == C75087g.NORMAL_STATE;
    }

    /* renamed from: m */
    public boolean mo104749m() {
        return this.f220894A == C75087g.SINGLE_ACTION_STATE;
    }

    /* renamed from: n */
    public final void mo104750n() {
        if (this.f220916w.isShown()) {
            post(new C75080b());
        }
    }

    /* renamed from: o */
    public void mo104751o() {
        Log.m105925i("MicroMsg.WcPayKeyBoard", "showNormalStWcKb() %s %s %s [%s]", Boolean.valueOf(isShown()), this.f220894A, Boolean.valueOf(mo104745i()), Util.getStack());
        if (!mo104745i()) {
            if (!isShown()) {
                if (mo104749m()) {
                    mo104739d(false, false);
                }
                mo104754q(true);
            } else if (mo104749m()) {
                mo104739d(false, true);
            }
            this.f220894A = C75087g.NORMAL_STATE;
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!isShown() || !mo104748l()) {
            return false;
        }
        mo104753p();
        return true;
    }

    /* renamed from: p */
    public void mo104753p() {
        Log.m105925i("MicroMsg.WcPayKeyBoard", "showSingleActionStWcKb() %s %s %s [%s]", Boolean.valueOf(isShown()), this.f220894A, Boolean.valueOf(mo104745i()), Util.getStack());
        if (!mo104745i() && this.f220894A != C75087g.INIT_STATE) {
            if (isShown() && mo104748l()) {
                mo104739d(true, false);
            } else if (!isShown()) {
                if (mo104748l()) {
                    Log.m105920e("MicroMsg.WcPayKeyBoard", "showSingleActionStWcKb() why here??");
                } else if (mo104749m()) {
                    setVisibility(0);
                    this.f220917x.setVisibility(0);
                    Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2541fz);
                    loadAnimation.setAnimationListener(new C67316f(this));
                    this.f220917x.startAnimation(loadAnimation);
                }
            }
            this.f220894A = C75087g.SINGLE_ACTION_STATE;
        }
    }

    /* renamed from: q */
    public final void mo104754q(boolean z) {
        setVisibility(0);
        this.f220916w.setVisibility(4);
        this.f220916w.post(new C75083e(z));
    }

    public void setActionBtnColor(int i) {
        this.f220911r.setBackgroundResource(i);
        this.f220917x.setBackgroundResource(i);
    }

    public void setActionText(String str) {
        this.f220911r.setText(str);
        this.f220917x.setContentDescription(str);
    }

    public void setHeightListener(C75086f fVar) {
        this.f220895B = fVar;
    }

    public void setInputEditText(EditText editText) {
        if (editText != null) {
            this.f220918y = editText;
        }
    }

    public void setIsOnlySupportInteger(boolean z) {
        if (z) {
            this.f220910q.setVisibility(8);
            GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) this.f220909p.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f44610b = GridLayout.m15668l(0, 3, GridLayout.f44596w, 1.0f);
                this.f220909p.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f220910q.setVisibility(0);
        GridLayout.LayoutParams layoutParams2 = (GridLayout.LayoutParams) this.f220909p.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.f44610b = GridLayout.m15668l(0, 2, GridLayout.f44596w, 1.0f);
            this.f220909p.setLayoutParams(layoutParams2);
        }
    }

    public void setTipText(String str) {
        this.f220913t.setText(str);
        this.f220913t.setVisibility(0);
        mo104750n();
    }

    public void setToolBarContent(View view) {
        if (view != null) {
            this.f220914u.setVisibility(0);
            this.f220914u.removeAllViews();
            this.f220913t.setVisibility(8);
            this.f220914u.addView(view, -1, -2);
            mo104750n();
        }
    }

    public WcPayKeyboard(Context context, boolean z) {
        super(context);
        this.f220894A = C75087g.INIT_STATE;
        this.f220896C = false;
        this.f220898E = null;
        this.f220899F = null;
        this.f220897D = z;
        mo104744h();
    }

    public WcPayKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220894A = C75087g.INIT_STATE;
        this.f220896C = false;
        this.f220897D = true;
        this.f220898E = null;
        this.f220899F = null;
        mo104744h();
    }

    public WcPayKeyboard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f220894A = C75087g.INIT_STATE;
        this.f220896C = false;
        this.f220897D = true;
        this.f220898E = null;
        this.f220899F = null;
        mo104744h();
    }
}
