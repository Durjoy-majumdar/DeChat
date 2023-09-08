package com.tencent.p014mm.plugin.luckymoney.story;

import a14.C0000n0;
import a14.C53930o0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import androidx.recyclerview.widget.RecyclerView;
import bp3.C104160f;
import bp3.C79758p;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.RoundCornerImageView;
import com.tencent.p014mm.plugin.luckymoney.p073ui.HorizontalLayoutManager;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI;
import com.tencent.p014mm.plugin.luckymoney.scaledLayout.C56850a;
import com.tencent.p014mm.plugin.luckymoney.story.EnvelopeStoryVideoManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.MediaBannerIndicator;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.wallet_core.model.C75142u0;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import f32.C75672b;
import f32.C75675d;
import f32.C75676e;
import f40.C86709a0;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import org.json.JSONObject;
import org.libpag.PAGView;
import p1081gi.C98124g;
import te3.C49712hj1;
import te3.C77993rp3;
import te3.vb4;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout */
public class EnvelopeAppBarLayout extends AppBarLayout implements C0124r, C111847h {

    /* renamed from: F1 */
    public static final /* synthetic */ int f199458F1 = 0;

    /* renamed from: A */
    public MediaBannerIndicator f199459A;

    /* renamed from: A1 */
    public boolean f199460A1 = false;

    /* renamed from: B */
    public TextView f199461B;

    /* renamed from: B1 */
    public boolean f199462B1;

    /* renamed from: C */
    public RoundCornerImageView f199463C;

    /* renamed from: C1 */
    public boolean f199464C1;

    /* renamed from: D */
    public TextView f199465D;

    /* renamed from: D1 */
    public View.OnClickListener f199466D1 = new C69297c();

    /* renamed from: E */
    public TextView f199467E;

    /* renamed from: E1 */
    public int f199468E1 = MMApplicationContext.getResources().getDimensionPixelSize(C0966R.dimen.ae4);

    /* renamed from: F */
    public TextView f199469F;

    /* renamed from: G */
    public TextView f199470G;

    /* renamed from: H */
    public TextView f199471H;

    /* renamed from: I */
    public TextView f199472I;

    /* renamed from: J */
    public ViewGroup f199473J;

    /* renamed from: K */
    public View f199474K;

    /* renamed from: L */
    public ImageView f199475L;

    /* renamed from: M */
    public ImageView f199476M;

    /* renamed from: N */
    public ImageView f199477N;

    /* renamed from: P */
    public ViewGroup f199478P;

    /* renamed from: Q */
    public ViewGroup f199479Q;

    /* renamed from: Q0 */
    public int f199480Q0 = C76577a.m92151b(MMApplicationContext.getContext(), 130);

    /* renamed from: R */
    public ViewGroup f199481R;

    /* renamed from: R0 */
    public int f199482R0 = C76577a.m92151b(MMApplicationContext.getContext(), 120);

    /* renamed from: S */
    public ProgressBar f199483S;

    /* renamed from: S0 */
    public int f199484S0 = (C76577a.m92151b(MMApplicationContext.getContext(), v2helper.EMethodSetPlayerPreCorrectCofOn) - this.f199482R0);

    /* renamed from: T */
    public LuckyMoneyDetailUI f199485T;

    /* renamed from: T0 */
    public int f199486T0 = 0;

    /* renamed from: U */
    public ObjectAnimator f199487U;

    /* renamed from: U0 */
    public EnvelopeStoryBehavior f199488U0;

    /* renamed from: V */
    public ObjectAnimator f199489V;

    /* renamed from: V0 */
    public ArrayList<C69303g> f199490V0 = new ArrayList<>();

    /* renamed from: W */
    public boolean f199491W = false;

    /* renamed from: W0 */
    public EnvelopeStoryVideoManager f199492W0;

    /* renamed from: X0 */
    public C77993rp3 f199493X0;

    /* renamed from: Y0 */
    public String f199494Y0;

    /* renamed from: Z0 */
    public String f199495Z0;

    /* renamed from: a1 */
    public String f199496a1;

    /* renamed from: b1 */
    public String f199497b1;

    /* renamed from: c1 */
    public String f199498c1;

    /* renamed from: d1 */
    public int f199499d1;

    /* renamed from: e1 */
    public boolean f199500e1 = true;

    /* renamed from: f1 */
    public boolean f199501f1 = false;

    /* renamed from: g1 */
    public boolean f199502g1 = false;

    /* renamed from: h1 */
    public ValueAnimator f199503h1;

    /* renamed from: i1 */
    public ObjectAnimator f199504i1;

    /* renamed from: j1 */
    public ValueAnimator f199505j1;

    /* renamed from: k1 */
    public AnimatorSet f199506k1;

    /* renamed from: l1 */
    public AppBarLayout.C67445c f199507l1;

    /* renamed from: m1 */
    public boolean f199508m1 = false;

    /* renamed from: n1 */
    public boolean f199509n1 = false;

    /* renamed from: o1 */
    public int f199510o1;

    /* renamed from: p0 */
    public int f199511p0;

    /* renamed from: p1 */
    public int f199512p1;

    /* renamed from: q1 */
    public boolean f199513q1 = false;

    /* renamed from: r */
    public View f199514r;

    /* renamed from: r1 */
    public boolean f199515r1 = false;

    /* renamed from: s */
    public ImageView f199516s;

    /* renamed from: s1 */
    public boolean f199517s1 = false;

    /* renamed from: t */
    public PAGView f199518t;

    /* renamed from: t1 */
    public boolean f199519t1 = false;

    /* renamed from: u */
    public PAGView.PAGViewListener f199520u;

    /* renamed from: u1 */
    public boolean f199521u1 = false;

    /* renamed from: v */
    public C0000n0 f199522v;

    /* renamed from: v1 */
    public boolean f199523v1 = false;

    /* renamed from: w */
    public RecyclerHorizontalViewPager f199524w;

    /* renamed from: w1 */
    public boolean f199525w1 = false;

    /* renamed from: x */
    public TouchCoordinatorLayout f199526x;

    /* renamed from: x0 */
    public int f199527x0;

    /* renamed from: x1 */
    public boolean f199528x1 = false;

    /* renamed from: y */
    public ViewGroup f199529y;

    /* renamed from: y0 */
    public int f199530y0;

    /* renamed from: y1 */
    public boolean f199531y1 = false;

    /* renamed from: z */
    public ViewGroup f199532z;

    /* renamed from: z1 */
    public boolean f199533z1 = false;

    /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout$a */
    public class C69294a implements Runnable {
        public C69294a() {
        }

        public void run() {
            EnvelopeAppBarLayout envelopeAppBarLayout = EnvelopeAppBarLayout.this;
            envelopeAppBarLayout.f199488U0.mo146260y(-(envelopeAppBarLayout.getTotalScrollRange() - EnvelopeAppBarLayout.this.f199484S0));
            EnvelopeAppBarLayout.this.f199529y.setAlpha(1.0f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout$b */
    public class C69295b implements Runnable {

        /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout$b$a */
        public class C69296a implements Runnable {
            public C69296a() {
            }

            public void run() {
                EnvelopeAppBarLayout envelopeAppBarLayout = EnvelopeAppBarLayout.this;
                int i = EnvelopeAppBarLayout.f199458F1;
                if (envelopeAppBarLayout.mo95437j()) {
                    EnvelopeAppBarLayout envelopeAppBarLayout2 = EnvelopeAppBarLayout.this;
                    C60905o oVar = (C60905o) envelopeAppBarLayout2.f199524w.mo17023I0(envelopeAppBarLayout2.f199486T0);
                    if (oVar != null) {
                        EnvelopeAppBarLayout envelopeAppBarLayout3 = EnvelopeAppBarLayout.this;
                        envelopeAppBarLayout3.mo95441n(oVar, envelopeAppBarLayout3.f199486T0, true);
                        LuckyMoneyDetailUI.C69386s sVar = (LuckyMoneyDetailUI.C69386s) EnvelopeAppBarLayout.this.f199485T.component(LuckyMoneyDetailUI.C69386s.class);
                        View view = oVar.f44854d;
                        sVar.getClass();
                        View findViewById = view.findViewById(C0966R.C0970id.gdx);
                        findViewById.sendAccessibilityEvent(32768);
                        findViewById.announceForAccessibility(sVar.getString(C0966R.string.gfc));
                    }
                }
            }
        }

        public C69295b() {
        }

        public void run() {
            EnvelopeAppBarLayout envelopeAppBarLayout = EnvelopeAppBarLayout.this;
            if (envelopeAppBarLayout.f199499d1 == 2 && envelopeAppBarLayout.mo95437j()) {
                EnvelopeAppBarLayout envelopeAppBarLayout2 = EnvelopeAppBarLayout.this;
                ImageView imageView = envelopeAppBarLayout2.f199516s;
                int i = 0;
                envelopeAppBarLayout2.f199487U = ObjectAnimator.ofFloat(imageView, "alpha", new float[]{imageView.getAlpha(), 0.0f});
                EnvelopeAppBarLayout envelopeAppBarLayout3 = EnvelopeAppBarLayout.this;
                EnvelopeAppBarLayout.m81665f(envelopeAppBarLayout3, envelopeAppBarLayout3.f199487U);
                EnvelopeAppBarLayout envelopeAppBarLayout4 = EnvelopeAppBarLayout.this;
                PAGView pAGView = envelopeAppBarLayout4.f199518t;
                envelopeAppBarLayout4.f199489V = ObjectAnimator.ofFloat(pAGView, "alpha", new float[]{pAGView.getAlpha(), 0.0f});
                EnvelopeAppBarLayout envelopeAppBarLayout5 = EnvelopeAppBarLayout.this;
                EnvelopeAppBarLayout.m81665f(envelopeAppBarLayout5, envelopeAppBarLayout5.f199489V);
                int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_STORY_AUTO_PLAY_DELAY_INT_SYNC, 1500)).intValue() - 300;
                if (intValue >= 0) {
                    i = intValue;
                }
                EnvelopeAppBarLayout.this.postDelayed(new C69296a(), (long) i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout$c */
    public class C69297c implements View.OnClickListener {
        public C69297c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EnvelopeAppBarLayout envelopeAppBarLayout = EnvelopeAppBarLayout.this;
            if (!envelopeAppBarLayout.f199502g1 && envelopeAppBarLayout.f199499d1 == 2) {
                envelopeAppBarLayout.mo146163d(true, true, true);
                EnvelopeAppBarLayout.this.f199508m1 = true;
                C75676e.m90932a(5);
                C75675d.m90931a(6, EnvelopeAppBarLayout.this.f199495Z0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout$d */
    public class C69298d implements Runnable {

        /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout$d$b */
        public class C42522b implements View.OnTouchListener {
            public C42522b(C69298d dVar) {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$2$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$2$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }

        /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout$d$a */
        public class C69299a implements View.OnTouchListener {

            /* renamed from: d */
            public float f199539d;

            /* renamed from: e */
            public float f199540e;

            /* renamed from: f */
            public long f199541f;

            /* renamed from: g */
            public boolean f199542g = false;

            /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout$d$a$a */
            public class C69300a implements Runnable {
                public C69300a() {
                }

                public void run() {
                    EnvelopeAppBarLayout.this.mo146163d(false, true, true);
                }
            }

            public C69299a() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                if (motionEvent.getActionMasked() == 0) {
                    EnvelopeAppBarLayout envelopeAppBarLayout = EnvelopeAppBarLayout.this;
                    int i = EnvelopeAppBarLayout.f199458F1;
                    envelopeAppBarLayout.mo95435h();
                }
                if (EnvelopeAppBarLayout.this.f199502g1) {
                    if (motionEvent.getActionMasked() == 0) {
                        Rect rect = new Rect();
                        EnvelopeAppBarLayout.this.f199474K.getGlobalVisibleRect(rect);
                        if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                            this.f199539d = motionEvent.getRawX();
                            this.f199540e = motionEvent.getRawY();
                            this.f199541f = Util.currentTicks();
                            this.f199542g = true;
                        } else {
                            this.f199542g = false;
                        }
                    } else if (motionEvent.getActionMasked() == 1 && this.f199542g && Util.ticksToNow(this.f199541f) < 500) {
                        Rect rect2 = new Rect();
                        EnvelopeAppBarLayout.this.f199474K.getGlobalVisibleRect(rect2);
                        int rawX = (int) motionEvent.getRawX();
                        int rawY = (int) motionEvent.getRawY();
                        if (Math.abs(((float) rawX) - this.f199539d) <= 20.0f && Math.abs(((float) rawY) - this.f199540e) <= 20.0f && rect2.contains(rawX, rawY)) {
                            Log.m105924i("MicroMsg.EnvelopeAppBarLayout", "click collapse view");
                            EnvelopeAppBarLayout envelopeAppBarLayout2 = EnvelopeAppBarLayout.this;
                            envelopeAppBarLayout2.f199509n1 = true;
                            envelopeAppBarLayout2.postDelayed(new C69300a(), 30);
                        }
                    }
                }
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }

        public C69298d() {
        }

        public void run() {
            EnvelopeAppBarLayout envelopeAppBarLayout = EnvelopeAppBarLayout.this;
            EnvelopeStoryBehavior envelopeStoryBehavior = (EnvelopeStoryBehavior) ((CoordinatorLayout.C103717e) EnvelopeAppBarLayout.this.getLayoutParams()).f306328a;
            envelopeAppBarLayout.f199488U0 = envelopeStoryBehavior;
            envelopeStoryBehavior.f199563G = envelopeAppBarLayout.f199501f1;
            int i = envelopeAppBarLayout.f199499d1;
            boolean z = true;
            if (!(i == 1 || i == 2)) {
                z = false;
            }
            envelopeStoryBehavior.f199562F = z;
            envelopeStoryBehavior.f199564H = envelopeAppBarLayout.f199507l1;
            envelopeAppBarLayout.f199526x = (TouchCoordinatorLayout) envelopeAppBarLayout.getParent();
            EnvelopeAppBarLayout envelopeAppBarLayout2 = EnvelopeAppBarLayout.this;
            envelopeAppBarLayout2.f199474K = envelopeAppBarLayout2.f199526x.findViewById(C0966R.C0970id.gcy);
            RecyclerView recyclerView = (RecyclerView) EnvelopeAppBarLayout.this.f199526x.findViewById(C0966R.C0970id.gdh);
            TouchCoordinatorLayout touchCoordinatorLayout = EnvelopeAppBarLayout.this.f199526x;
            ((ArrayList) touchCoordinatorLayout.f199576D).add(new C69299a());
            EnvelopeAppBarLayout.this.f199474K.setOnTouchListener(new C42522b(this));
            EnvelopeAppBarLayout.this.mo95439l();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout$e */
    public class C69301e implements AppBarLayout.C67445c {

        /* renamed from: a */
        public int f199545a = 0;

        /* renamed from: b */
        public int f199546b = 0;

        /* renamed from: c */
        public float f199547c = 0.0f;

        public C69301e() {
        }

        /* renamed from: a */
        public void mo3128a(AppBarLayout appBarLayout, int i) {
            C60905o oVar;
            int i2;
            int abs = Math.abs(i);
            int totalScrollRange = (appBarLayout.getTotalScrollRange() - EnvelopeAppBarLayout.this.f199484S0) - abs;
            float totalScrollRange2 = ((float) totalScrollRange) / (((float) (appBarLayout.getTotalScrollRange() - EnvelopeAppBarLayout.this.f199484S0)) * 1.0f);
            float f = 1.0f - totalScrollRange2;
            Log.m105919d("MicroMsg.EnvelopeAppBarLayout", "mOffsetChangedListener offset: %s, distance: %s ，currentPer：%s", Integer.valueOf(i), Integer.valueOf(totalScrollRange), Float.valueOf(totalScrollRange2));
            EnvelopeAppBarLayout envelopeAppBarLayout = EnvelopeAppBarLayout.this;
            if (!envelopeAppBarLayout.f199500e1) {
                float f2 = 1.0f - f;
                envelopeAppBarLayout.f199532z.setAlpha(f2);
                EnvelopeAppBarLayout envelopeAppBarLayout2 = EnvelopeAppBarLayout.this;
                if (abs <= envelopeAppBarLayout2.f199530y0 || envelopeAppBarLayout2.f199491W) {
                    envelopeAppBarLayout2.f199516s.setAlpha(0.0f);
                    EnvelopeAppBarLayout.this.f199518t.setAlpha(0.0f);
                } else {
                    int totalScrollRange3 = appBarLayout.getTotalScrollRange();
                    EnvelopeAppBarLayout envelopeAppBarLayout3 = EnvelopeAppBarLayout.this;
                    int i3 = totalScrollRange3 - envelopeAppBarLayout3.f199484S0;
                    int i4 = envelopeAppBarLayout3.f199530y0;
                    float f3 = ((float) (abs - i4)) / (((float) (i3 - i4)) * 1.0f);
                    envelopeAppBarLayout3.f199516s.setAlpha(f3);
                    EnvelopeAppBarLayout.this.f199518t.setAlpha(f3);
                }
                EnvelopeAppBarLayout.this.f199477N.setAlpha(f2);
            }
            Log.m105919d("MicroMsg.EnvelopeAppBarLayout", "mHasTranslationPagerView: %s", Boolean.valueOf(EnvelopeAppBarLayout.this.f199491W));
            if (EnvelopeAppBarLayout.this.f199491W && totalScrollRange >= 0 && totalScrollRange != (i2 = this.f199546b)) {
                EnvelopeAppBarLayout.this.f199524w.setTranslationY(((float) (-i)) / 2.0f);
                Log.m105919d("MicroMsg.EnvelopeAppBarLayout", "offset: %s, top: %s", Integer.valueOf(totalScrollRange - Math.max(0, i2)), Float.valueOf(EnvelopeAppBarLayout.this.f199524w.getTranslationY()));
                if (EnvelopeAppBarLayout.this.f199524w.getTranslationY() <= 0.0f) {
                    EnvelopeAppBarLayout.this.f199524w.setTranslationY(0.0f);
                    EnvelopeAppBarLayout.this.f199491W = false;
                }
            }
            EnvelopeAppBarLayout envelopeAppBarLayout4 = EnvelopeAppBarLayout.this;
            if (envelopeAppBarLayout4.f199529y != null) {
                int i5 = envelopeAppBarLayout4.f199499d1;
                if (i5 == 2) {
                    if (appBarLayout.getTotalScrollRange() - abs == 0 && this.f199545a != abs) {
                        EnvelopeAppBarLayout.this.f199529y.setAlpha(0.0f);
                        View view = EnvelopeAppBarLayout.this.f199485T.f199810I1;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Float.valueOf(0.0f));
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        EnvelopeAppBarLayout.this.f199485T.f199812J1.setVisibility(8);
                    } else if (this.f199547c != f) {
                        EnvelopeAppBarLayout.this.f199529y.setAlpha(f);
                        LinearLayout linearLayout = EnvelopeAppBarLayout.this.f199485T.f199839V;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(Float.valueOf(f));
                        LinearLayout linearLayout2 = linearLayout;
                        C117292a.m165358d(linearLayout2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        linearLayout.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                        C117292a.m165359e(linearLayout2, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        View view3 = EnvelopeAppBarLayout.this.f199485T.f199810I1;
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(Float.valueOf(f));
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view3.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        if (f == 0.0f) {
                            EnvelopeAppBarLayout.this.f199485T.f199812J1.setVisibility(8);
                        } else {
                            EnvelopeAppBarLayout.this.f199485T.f199812J1.setVisibility(0);
                        }
                    }
                    this.f199547c = f;
                } else if (i5 == 1) {
                    int totalScrollRange4 = appBarLayout.getTotalScrollRange() - abs;
                    Log.m105919d("MicroMsg.EnvelopeAppBarLayout", "distance: %s", Integer.valueOf(totalScrollRange4));
                    EnvelopeAppBarLayout envelopeAppBarLayout5 = EnvelopeAppBarLayout.this;
                    int i6 = envelopeAppBarLayout5.f199484S0;
                    if (totalScrollRange4 <= i6) {
                        envelopeAppBarLayout5.f199529y.setAlpha(((float) totalScrollRange4) / (((float) i6) * 1.0f));
                    } else {
                        envelopeAppBarLayout5.f199529y.setAlpha(1.0f);
                    }
                }
            }
            if (appBarLayout.getTotalScrollRange() - abs == 0 && this.f199545a != abs) {
                EnvelopeAppBarLayout envelopeAppBarLayout6 = EnvelopeAppBarLayout.this;
                envelopeAppBarLayout6.getClass();
                Log.m105924i("MicroMsg.EnvelopeAppBarLayout", "story view collapse");
                envelopeAppBarLayout6.f199478P.setClickable(false);
                if (envelopeAppBarLayout6.f199460A1 || envelopeAppBarLayout6.f199502g1) {
                    envelopeAppBarLayout6.f199502g1 = false;
                    envelopeAppBarLayout6.f199460A1 = false;
                    envelopeAppBarLayout6.mo95438k(true);
                    ((LuckyMoneyDetailUI.C69386s) envelopeAppBarLayout6.f199485T.component(LuckyMoneyDetailUI.C69386s.class)).mo95574c3(false);
                    envelopeAppBarLayout6.f199492W0.mo129406e();
                    if (envelopeAppBarLayout6.f199499d1 == 2) {
                        envelopeAppBarLayout6.f199485T.mo95562V7(true);
                    }
                    envelopeAppBarLayout6.mo95439l();
                    if (envelopeAppBarLayout6.f199509n1) {
                        envelopeAppBarLayout6.f199509n1 = false;
                        int i7 = envelopeAppBarLayout6.f199499d1;
                        if (i7 == 1 || i7 == 2) {
                            C69315e0.m81701a(2);
                        }
                        C75676e.m90932a(10);
                    } else {
                        int i8 = envelopeAppBarLayout6.f199499d1;
                        if (i8 == 1 || i8 == 2) {
                            C69315e0.m81701a(1);
                        }
                        C75676e.m90932a(9);
                    }
                } else {
                    Log.m105918d("MicroMsg.EnvelopeAppBarLayout", "has collapsed");
                }
            } else if (abs == 0 && this.f199545a != abs) {
                EnvelopeAppBarLayout envelopeAppBarLayout7 = EnvelopeAppBarLayout.this;
                envelopeAppBarLayout7.getClass();
                Log.m105924i("MicroMsg.EnvelopeAppBarLayout", "story view expand");
                envelopeAppBarLayout7.f199478P.setClickable(true);
                if (envelopeAppBarLayout7.f199502g1) {
                    Log.m105918d("MicroMsg.EnvelopeAppBarLayout", "has expanded");
                } else {
                    envelopeAppBarLayout7.f199502g1 = true;
                    envelopeAppBarLayout7.f199460A1 = false;
                    ((LuckyMoneyDetailUI.C69386s) envelopeAppBarLayout7.f199485T.component(LuckyMoneyDetailUI.C69386s.class)).mo95574c3(true);
                    if (envelopeAppBarLayout7.mo95437j() && (oVar = (C60905o) envelopeAppBarLayout7.f199524w.mo17023I0(envelopeAppBarLayout7.f199486T0)) != null) {
                        envelopeAppBarLayout7.mo95441n(oVar, envelopeAppBarLayout7.f199486T0, false);
                    }
                    C75676e.f222287d = true;
                    if (envelopeAppBarLayout7.f199508m1) {
                        envelopeAppBarLayout7.f199508m1 = false;
                        C69315e0.f199601k = 1;
                    } else {
                        C75676e.m90932a(4);
                        C75675d.m90931a(7, envelopeAppBarLayout7.f199495Z0);
                        C69315e0.f199601k = 2;
                    }
                    int i9 = envelopeAppBarLayout7.f199499d1;
                    if (i9 == 2 || i9 == 1) {
                        String str = C75675d.f222275a;
                        String str2 = envelopeAppBarLayout7.f199494Y0;
                        int i15 = envelopeAppBarLayout7.f199510o1;
                        int i16 = envelopeAppBarLayout7.f199512p1;
                        C69315e0.f199599i = str;
                        C69315e0.f199591a = str2;
                        C69315e0.f199596f = i15;
                        C69315e0.f199597g = i16;
                        C69315e0.f199598h = UUID.randomUUID().toString();
                        C69315e0.f199600j = SystemClock.elapsedRealtime() / 1000;
                        if (envelopeAppBarLayout7.f199499d1 == 2) {
                            envelopeAppBarLayout7.f199485T.mo95562V7(false);
                            if (!envelopeAppBarLayout7.f199513q1) {
                                C75675d.m90931a(5, envelopeAppBarLayout7.f199495Z0);
                                envelopeAppBarLayout7.f199513q1 = true;
                            }
                            C69313d0.m81700a(2);
                        }
                    }
                    envelopeAppBarLayout7.f199529y.setOnClickListener((View.OnClickListener) null);
                    envelopeAppBarLayout7.f199529y.setClickable(false);
                    envelopeAppBarLayout7.f199516s.setOnClickListener((View.OnClickListener) null);
                    envelopeAppBarLayout7.f199516s.setClickable(false);
                    envelopeAppBarLayout7.f199518t.setOnClickListener((View.OnClickListener) null);
                    envelopeAppBarLayout7.f199518t.setClickable(false);
                    C77993rp3 rp32 = envelopeAppBarLayout7.f199493X0;
                    if (rp32 != null && rp32.f228182j == 4 && !envelopeAppBarLayout7.f199528x1) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("red_cover_id", envelopeAppBarLayout7.f199493X0.f228186q);
                            jSONObject.put("finderusername", envelopeAppBarLayout7.f199493X0.f228184o);
                            jSONObject.put("red_cover_type", 1);
                        } catch (Throwable th) {
                            Log.m105921e("MicroMsg.EnvelopeAppBarLayout", "jump finder error, ", th);
                        }
                        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83788g6("red_cover_link_unfold", 0, jSONObject, (C49712hj1) null);
                        envelopeAppBarLayout7.f199528x1 = true;
                    }
                    if (envelopeAppBarLayout7.f199531y1) {
                        if (envelopeAppBarLayout7.f199533z1) {
                            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_STORY_PREVIEW_GUIDE_TIME_INT_SYNC, 3);
                        } else {
                            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_STORY_GUIDE_TIME_INT_SYNC, 3);
                        }
                    }
                }
            } else if (appBarLayout.getTotalScrollRange() - abs == C76577a.m92151b(MMApplicationContext.getContext(), 300) && this.f199545a != abs) {
                EnvelopeAppBarLayout.m81664e(EnvelopeAppBarLayout.this);
            }
            if (EnvelopeAppBarLayout.this.f199474K != null) {
                if (totalScrollRange2 > 1.0f) {
                    Log.m105925i("MicroMsg.EnvelopeAppBarLayout", "mOffsetChangedListener warning！need reset currentPer：%s", Float.valueOf(totalScrollRange2));
                    totalScrollRange2 = 0.0f;
                }
                View view5 = EnvelopeAppBarLayout.this.f199474K;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar4.mo10233c(Float.valueOf((float) (((double) totalScrollRange2) * 0.7d)));
                View view6 = view5;
                C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view5.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$3", "onOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            this.f199545a = abs;
            this.f199546b = totalScrollRange;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout$f */
    public class C69302f extends C60896i<C69303g> {
        public C69302f() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.b9k;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C60905o oVar2 = oVar;
            C69303g gVar = (C69303g) cVar;
            Class cls = C75672b.class;
            Log.m105919d("MicroMsg.EnvelopeAppBarLayout", "bind view holder: %s", Integer.valueOf(i));
            C69303g gVar2 = (C69303g) oVar2.f173503E;
            vb4 vb4 = gVar2.f199550d;
            if (vb4.f228306d == 1) {
                ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.gdt);
                imageView.setTag(C0966R.C0970id.f359346ke3, "1");
                imageView.setImportantForAccessibility(1);
                imageView.setImageBitmap((Bitmap) null);
                View D = oVar2.mo85812D(C0966R.C0970id.gdv);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = D;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryDetailConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryDetailConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                oVar2.mo85812D(C0966R.C0970id.gdv).setTag(C0966R.C0970id.gep, vb4.f228307e);
                String str = vb4.f228307e;
                String str2 = vb4.f228308f;
                EnvelopeAppBarLayout envelopeAppBarLayout = EnvelopeAppBarLayout.this;
                ((C75672b) C86312j.m106911c(cls)).mo95321Ug(imageView, str, str2, envelopeAppBarLayout.f199494Y0, envelopeAppBarLayout.f199527x0, envelopeAppBarLayout.f199511p0, false, 40, new C56853t(this, oVar2, vb4), gVar2.f199553g, 4, gVar2.f199554h);
                oVar2.mo85817I(C0966R.C0970id.gdx, 8);
                return;
            }
            View D2 = oVar2.mo85812D(C0966R.C0970id.gdv);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = D2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryDetailConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryDetailConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            gVar2.mo95453a();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar2.f199551e, gVar2.f199552f);
            layoutParams.gravity = 17;
            ((ViewGroup) oVar2.mo85812D(C0966R.C0970id.gjr)).setLayoutParams(layoutParams);
            oVar2.mo85817I(C0966R.C0970id.gjs, 4);
            oVar2.mo85817I(C0966R.C0970id.gdy, 8);
            ImageView imageView2 = (ImageView) oVar2.mo85812D(C0966R.C0970id.gdt);
            imageView2.setTag(C0966R.C0970id.f359346ke3, "2");
            imageView2.setImportantForAccessibility(2);
            imageView2.setImageBitmap((Bitmap) null);
            String str3 = vb4.f228311i;
            String str4 = vb4.f228312j;
            EnvelopeAppBarLayout envelopeAppBarLayout2 = EnvelopeAppBarLayout.this;
            ((C75672b) C86312j.m106911c(cls)).vi0(imageView2, str3, str4, envelopeAppBarLayout2.f199494Y0, envelopeAppBarLayout2.f199527x0, envelopeAppBarLayout2.f199511p0, false, 0, gVar2.f199553g, 5, gVar2.f199554h);
            oVar2.mo85817I(C0966R.C0970id.gdx, 0);
            String a = EnvelopeStoryVideoManager.m119067a(vb4.f228307e);
            String str5 = vb4.f228307e;
            String str6 = "MMVideo_" + str5.hashCode();
            boolean z2 = EnvelopeStoryVideoManager.m119068b().getInt(str6, 0) == 1;
            if (!C86013q1.m106450k(a) && !z2) {
                if (EnvelopeStoryVideoManager.m119069c(gVar2.f199553g, gVar2.f199555i)) {
                    Log.m105924i("MicroMsg.EnvelopeAppBarLayout", "[static luckymoney resource] has local video");
                    return;
                }
                Log.m105924i("MicroMsg.EnvelopeAppBarLayout", "preload video");
                EnvelopeStoryVideoManager.m119070f(str6, a, vb4.f228307e, vb4.f228308f, true, (C98124g.C98125a) null, new C69329u(this));
            }
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout$g */
    public class C69303g implements C9493c {

        /* renamed from: d */
        public vb4 f199550d;

        /* renamed from: e */
        public int f199551e = -1;

        /* renamed from: f */
        public int f199552f = -1;

        /* renamed from: g */
        public int f199553g = -1;

        /* renamed from: h */
        public int f199554h = -1;

        /* renamed from: i */
        public String f199555i = "";

        public C69303g() {
        }

        /* renamed from: a */
        public void mo95453a() {
            if (this.f199552f <= 0 || this.f199551e <= 0) {
                vb4 vb4 = this.f199550d;
                float f = ((float) vb4.f228309g) / (((float) vb4.f228310h) * 1.0f);
                if (f > 1.667f) {
                    int i = EnvelopeAppBarLayout.this.f199527x0;
                    this.f199552f = i;
                    this.f199551e = (int) (((float) i) / f);
                } else if (f < 1.667f) {
                    int i2 = EnvelopeAppBarLayout.this.f199511p0;
                    this.f199551e = i2;
                    this.f199552f = (int) (((float) i2) * f);
                } else {
                    EnvelopeAppBarLayout envelopeAppBarLayout = EnvelopeAppBarLayout.this;
                    this.f199552f = envelopeAppBarLayout.f199527x0;
                    this.f199551e = envelopeAppBarLayout.f199511p0;
                }
                Log.m105919d("MicroMsg.EnvelopeAppBarLayout", "video size: %s, %s", Integer.valueOf(this.f199551e), Integer.valueOf(this.f199552f));
            }
        }

        /* renamed from: c */
        public int mo75c() {
            return 0;
        }

        public long getItemId() {
            return 0;
        }
    }

    public EnvelopeAppBarLayout(Context context) {
        super(context);
        mo95436i();
    }

    /* renamed from: e */
    public static void m81664e(EnvelopeAppBarLayout envelopeAppBarLayout) {
        if (!envelopeAppBarLayout.f199460A1) {
            envelopeAppBarLayout.f199460A1 = true;
            if (envelopeAppBarLayout.f199493X0 != null) {
                ((LuckyMoneyDetailUI.C69386s) envelopeAppBarLayout.f199485T.component(LuckyMoneyDetailUI.C69386s.class)).mo95574c3(false);
                envelopeAppBarLayout.mo95439l();
                envelopeAppBarLayout.f199478P.setClickable(false);
                if (envelopeAppBarLayout.f199493X0.f228182j != 0) {
                    envelopeAppBarLayout.f199478P.setVisibility(0);
                }
                envelopeAppBarLayout.f199479Q.setVisibility(0);
                if (envelopeAppBarLayout.f199499d1 == 2) {
                    envelopeAppBarLayout.f199492W0.mo129406e();
                    envelopeAppBarLayout.f199502g1 = false;
                    envelopeAppBarLayout.f199485T.mo95562V7(true);
                }
            }
        }
    }

    /* renamed from: f */
    public static void m81665f(EnvelopeAppBarLayout envelopeAppBarLayout, ObjectAnimator objectAnimator) {
        envelopeAppBarLayout.getClass();
        objectAnimator.setDuration(500);
        objectAnimator.setStartDelay((long) ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_STORY_AUTO_PLAY_DELAY_INT_SYNC, 1500)).intValue());
        objectAnimator.start();
        objectAnimator.addListener(new C69324n(envelopeAppBarLayout, objectAnimator));
    }

    /* renamed from: g */
    public final void mo95434g() {
        int i = C85875k4.m106184h(getContext()).x;
        if (i > 0) {
            this.f199511p0 = i;
        } else {
            Rect rect = new Rect();
            getWindowVisibleDisplayFrame(rect);
            this.f199511p0 = rect.right - rect.left;
        }
        int i2 = (int) (((float) this.f199511p0) * 1.335f);
        this.f199527x0 = i2;
        this.f199516s.setMinimumHeight(i2);
        this.f199518t.setMinimumHeight(this.f199527x0);
        AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(-1, this.f199527x0);
        layoutParams.f193396a = 3;
        this.f199514r.setLayoutParams(layoutParams);
        this.f199514r.setMinimumHeight(this.f199482R0);
        postDelayed(new C69294a(), 50);
    }

    /* renamed from: h */
    public final void mo95435h() {
        ObjectAnimator objectAnimator = this.f199487U;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f199487U.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f199489V;
        if (objectAnimator2 != null && objectAnimator2.isStarted()) {
            this.f199489V.cancel();
        }
    }

    /* renamed from: i */
    public final void mo95436i() {
        View.inflate(getContext(), C0966R.C0971layout.b9l, this);
        setExpanded(false);
        post(new C69298d());
        this.f199492W0 = new EnvelopeStoryVideoManager();
        this.f199514r = findViewById(C0966R.C0970id.k4o);
        this.f199529y = (ViewGroup) findViewById(C0966R.C0970id.gdn);
        this.f199532z = (ViewGroup) findViewById(C0966R.C0970id.gds);
        this.f199516s = (ImageView) findViewById(C0966R.C0970id.k6o);
        this.f199518t = (PAGView) findViewById(C0966R.C0970id.o3w);
        this.f199483S = (ProgressBar) findViewById(C0966R.C0970id.k6p);
        this.f199524w = (RecyclerHorizontalViewPager) findViewById(C0966R.C0970id.k8j);
        this.f199459A = (MediaBannerIndicator) findViewById(C0966R.C0970id.k4p);
        this.f199461B = (TextView) findViewById(C0966R.C0970id.f359305k51);
        this.f199463C = (RoundCornerImageView) findViewById(C0966R.C0970id.f359316k80);
        this.f199465D = (TextView) findViewById(C0966R.C0970id.f359323k93);
        this.f199467E = (TextView) findViewById(C0966R.C0970id.oa8);
        this.f199469F = (TextView) findViewById(C0966R.C0970id.f359322k92);
        this.f199478P = (ViewGroup) findViewById(C0966R.C0970id.k8q);
        this.f199479Q = (ViewGroup) findViewById(C0966R.C0970id.k8r);
        this.f199470G = (TextView) findViewById(C0966R.C0970id.gdq);
        this.f199471H = (TextView) findViewById(C0966R.C0970id.gdo);
        this.f199473J = (ViewGroup) findViewById(C0966R.C0970id.gdp);
        this.f199472I = (TextView) findViewById(C0966R.C0970id.k8p);
        this.f199475L = (ImageView) findViewById(C0966R.C0970id.gdm);
        this.f199476M = (ImageView) findViewById(C0966R.C0970id.k6j);
        this.f199477N = (ImageView) findViewById(C0966R.C0970id.k6k);
        RoundCornerImageView roundCornerImageView = this.f199463C;
        roundCornerImageView.f220454o = 4;
        roundCornerImageView.f220455p = getResources().getColor(C0966R.color.BW_100_Alpha_0_3);
        this.f199459A.setSelectDrawable(getResources().getDrawable(C0966R.C0969drawable.aeg));
        this.f199459A.setUnSelectDrawable(getResources().getDrawable(C0966R.C0969drawable.aeh));
        this.f199459A.setIndicatorWidth(getResources().getDimensionPixelSize(C0966R.dimen.f3766df));
        HorizontalLayoutManager horizontalLayoutManager = new HorizontalLayoutManager(getContext());
        this.f199524w.setHasFixedSize(true);
        this.f199524w.setItemViewCacheSize(4);
        C56850a aVar = new C56850a();
        aVar.f162887g = getContext();
        aVar.f162888h = true;
        this.f199524w.setSnapHelper(aVar);
        this.f199524w.setOnInterceptTouchEvent(new C56852r(this, aVar, horizontalLayoutManager));
        horizontalLayoutManager.f162895v = 1;
        horizontalLayoutManager.setItemPrefetchEnabled(true);
        horizontalLayoutManager.f44689u = 3;
        horizontalLayoutManager.mo16974W(0);
        this.f199524w.setLayoutManager(horizontalLayoutManager);
        this.f199524w.setAdapter(new WxRecyclerAdapter(new C9500j() {
            public C60896i<?> getItemConvert(int i) {
                return new C69302f();
            }
        }, this.f199490V0, false));
        this.f199524w.setPageChangeListener(new C69328s(this));
        C69301e eVar = new C69301e();
        this.f199507l1 = eVar;
        mo146159a(eVar);
    }

    /* renamed from: j */
    public final boolean mo95437j() {
        C60905o oVar = (C60905o) this.f199524w.mo17023I0(this.f199486T0);
        return oVar != null && ((C69303g) oVar.f173503E).f199550d.f228306d == 2;
    }

    /* renamed from: k */
    public void mo95438k(boolean z) {
        C60905o oVar;
        if (this.f199486T0 >= 0 && !Util.isNullOrNil(C69315e0.f199598h) && (oVar = (C60905o) this.f199524w.mo17023I0(this.f199486T0)) != null) {
            boolean j = mo95437j();
            C69303g gVar = (C69303g) oVar.f173503E;
            if (j) {
                EnvelopeStoryVideoManager.C94180e eVar = (EnvelopeStoryVideoManager.C94180e) ((HashMap) this.f199492W0.f272055i).get(Integer.valueOf(this.f199486T0));
                if (eVar != null) {
                    eVar.f272079k = (long) eVar.f272081m.getCurrPosSec();
                    C115669n.INSTANCE.mo160131h(19270, 2, this.f199494Y0, eVar.f272080l, "", gVar.f199550d.f228307e, Integer.valueOf(eVar.f272080l.get() == 1 ? (int) (eVar.f272079k - eVar.f272078j) : eVar.f272080l.get() > 1 ? (int) ((((long) 0) - eVar.f272078j) + eVar.f272079k + ((long) ((eVar.f272080l.get() - 1) * 0))) : 0), C69315e0.f199598h, Integer.valueOf(eVar.f272074f ? 1 : 0), C75675d.f222275a);
                    return;
                }
                return;
            }
            C115669n.INSTANCE.mo160131h(19270, 1, this.f199494Y0, 0, gVar.f199550d.f228307e, "", 0, C69315e0.f199598h, 0, C75675d.f222275a);
        }
    }

    /* renamed from: l */
    public final void mo95439l() {
        this.f199529y.setOnClickListener(this.f199466D1);
        if (this.f199502g1 || this.f199499d1 != 2) {
            this.f199529y.setBackgroundResource(C0966R.C0969drawable.f357253c63);
        } else {
            this.f199529y.setBackgroundResource(C0966R.C0969drawable.adp);
        }
        this.f199516s.setOnClickListener(this.f199466D1);
        this.f199518t.setOnClickListener(this.f199466D1);
    }

    /* renamed from: m */
    public void mo95440m(int i) {
        this.f199499d1 = i;
        if (i == 0) {
            this.f199500e1 = true;
            this.f199501f1 = true;
            this.f199529y.setVisibility(8);
            this.f199477N.setVisibility(8);
            if (C85875k4.m106211z()) {
                this.f199476M.setImageResource(C0966R.raw.icons_filled_detail_skin_hb_mask_dark);
            } else {
                this.f199476M.setImageResource(C0966R.raw.icons_filled_detail_skin_hb_mask);
            }
            ImageView imageView = this.f199516s;
            Boolean bool = Boolean.FALSE;
            imageView.setTag(C0966R.C0970id.gcx, bool);
            this.f199518t.setTag(C0966R.C0970id.gcx, bool);
        } else if (i == 1) {
            this.f199500e1 = true;
            this.f199501f1 = true;
            this.f199529y.setVisibility(8);
            this.f199475L.setVisibility(8);
            this.f199529y.setPadding(C76577a.m92151b(getContext(), 12), C76577a.m92151b(getContext(), 8), C76577a.m92151b(getContext(), 12), C76577a.m92151b(getContext(), 4));
            this.f199516s.setVisibility(0);
            this.f199518t.setVisibility(0);
            this.f199477N.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = C76577a.m92151b(MMApplicationContext.getContext(), 15);
            this.f199473J.setLayoutParams(layoutParams);
            if (C85875k4.m106211z()) {
                this.f199476M.setImageResource(C0966R.raw.icons_filled_detail_skin_hb_mask_dark);
            } else {
                this.f199476M.setImageResource(C0966R.raw.icons_filled_detail_skin_hb_mask);
            }
            ImageView imageView2 = this.f199516s;
            Boolean bool2 = Boolean.TRUE;
            imageView2.setTag(C0966R.C0970id.gcx, bool2);
            this.f199518t.setTag(C0966R.C0970id.gcx, bool2);
        } else if (i == 2) {
            this.f199500e1 = false;
            this.f199501f1 = false;
            this.f199529y.setVisibility(0);
            this.f199475L.setVisibility(0);
            this.f199529y.setPadding(C76577a.m92151b(getContext(), 12), C76577a.m92151b(getContext(), 4), C76577a.m92151b(getContext(), 12), C76577a.m92151b(getContext(), 4));
            this.f199477N.setVisibility(0);
            this.f199477N.setAlpha(0.0f);
            if (C85875k4.m106211z()) {
                this.f199476M.setImageResource(C0966R.raw.icons_filled_detail_skin_hb_mask_dark);
            } else {
                this.f199476M.setImageResource(C0966R.raw.icons_filled_detail_skin_hb_mask);
            }
            C75675d.m90931a(4, this.f199495Z0);
            ImageView imageView3 = this.f199516s;
            Boolean bool3 = Boolean.TRUE;
            imageView3.setTag(C0966R.C0970id.gcx, bool3);
            this.f199518t.setTag(C0966R.C0970id.gcx, bool3);
        }
    }

    /* renamed from: n */
    public final void mo95441n(C60905o oVar, int i, boolean z) {
        boolean z2;
        String str;
        C60905o oVar2 = oVar;
        C69303g gVar = (C69303g) oVar2.f173503E;
        gVar.mo95453a();
        if (EnvelopeStoryVideoManager.m119069c(gVar.f199553g, gVar.f199555i)) {
            str = gVar.f199555i;
            z2 = true;
        } else {
            str = gVar.f199550d.f228307e;
            z2 = false;
        }
        this.f199492W0.mo129407g(getContext(), (FrameLayout) oVar2.mo85812D(C0966R.C0970id.gdx), (ImageView) oVar2.mo85812D(C0966R.C0970id.gdt), (ProgressBar) oVar2.mo85812D(C0966R.C0970id.gdv), str, gVar.f199550d.f228308f, gVar.f199551e, gVar.f199552f, i, true, z2, z);
    }

    /* renamed from: o */
    public final void mo95442o() {
        if (!this.f199462B1 || !this.f199464C1) {
            Log.m105924i("MicroMsg.EnvelopeAppBarLayout", "not run this time");
            return;
        }
        boolean z = false;
        int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Pay_LuckyMoneyEnvelopePreviewVideo_Int, 0);
        if (e == 1 || (e != 2 && ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_STORY_DISABLE_AUTO_PLAY_INT_SYNC, 0)).intValue() == 0)) {
            z = true;
        }
        if (!z) {
            Log.m105924i("MicroMsg.EnvelopeAppBarLayout", "disable auto play");
        } else {
            post(new C69295b());
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public void onUIDestroy() {
        mo95438k(true);
        this.f199492W0.mo129406e();
        int i = this.f199499d1;
        if (i == 1 || i == 2) {
            C69315e0.m81701a(3);
        }
        C75676e.m90932a(11);
        mo95435h();
        PAGView pAGView = this.f199518t;
        if (pAGView != null) {
            pAGView.stop();
            this.f199518t.removeListener(this.f199520u);
            this.f199520u = null;
            C75142u0 u0Var = C75142u0.f221103a;
            C0000n0 n0Var = this.f199522v;
            u0Var.getClass();
            if (n0Var != null) {
                C53930o0.m60556c(n0Var, (CancellationException) null);
            }
            this.f199522v = null;
        }
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onUIPause() {
    }

    public void setActivityLifeCycle(LuckyMoneyDetailUI luckyMoneyDetailUI) {
        luckyMoneyDetailUI.getLifecycle().addObserver(this.f199492W0);
        luckyMoneyDetailUI.getLifecycle().addObserver(this);
        this.f199485T = luckyMoneyDetailUI;
        EnvelopeStoryVideoManager envelopeStoryVideoManager = this.f199492W0;
        envelopeStoryVideoManager.f272050d = luckyMoneyDetailUI;
        MMHandlerThread.postToMainThread(new C69330v(envelopeStoryVideoManager));
    }

    public EnvelopeAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo95436i();
    }
}
