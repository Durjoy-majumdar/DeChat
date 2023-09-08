package com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95917e;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kg3.C76577a;
import nq2.C100151a;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import os2.C100409k;
import rq2.C63489a;
import uq2.C102072c;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView */
public class AdSocialAttitudeView extends RoundedCornerFrameLayout implements C102072c, C111847h {

    /* renamed from: V0 */
    public static final /* synthetic */ int f274292V0 = 0;

    /* renamed from: A */
    public LinearLayout f274293A;

    /* renamed from: B */
    public LinearLayout f274294B;

    /* renamed from: C */
    public int f274295C;

    /* renamed from: D */
    public int f274296D;

    /* renamed from: E */
    public int f274297E;

    /* renamed from: F */
    public int f274298F;

    /* renamed from: G */
    public int f274299G;

    /* renamed from: H */
    public int f274300H;

    /* renamed from: I */
    public int f274301I;

    /* renamed from: J */
    public int f274302J;

    /* renamed from: K */
    public int f274303K;

    /* renamed from: L */
    public int f274304L;

    /* renamed from: M */
    public int f274305M;

    /* renamed from: N */
    public int f274306N;

    /* renamed from: P */
    public int f274307P;

    /* renamed from: Q */
    public long f274308Q;

    /* renamed from: Q0 */
    public boolean f274309Q0;

    /* renamed from: R */
    public boolean f274310R;

    /* renamed from: R0 */
    public String f274311R0;

    /* renamed from: S */
    public boolean f274312S;

    /* renamed from: S0 */
    public boolean f274313S0;

    /* renamed from: T */
    public Drawable f274314T;

    /* renamed from: T0 */
    public PAGView.PAGFlushListener f274315T0;

    /* renamed from: U */
    public String f274316U;

    /* renamed from: U0 */
    public PAGView.PAGViewListener f274317U0;

    /* renamed from: V */
    public int f274318V;

    /* renamed from: W */
    public int f274319W;

    /* renamed from: g */
    public int f274320g;

    /* renamed from: h */
    public WeImageView f274321h;

    /* renamed from: i */
    public PAGView f274322i;

    /* renamed from: j */
    public TextView f274323j;

    /* renamed from: n */
    public RelativeLayout f274324n;

    /* renamed from: o */
    public LinearLayout f274325o;

    /* renamed from: p */
    public FrameLayout f274326p;

    /* renamed from: p0 */
    public String f274327p0;

    /* renamed from: q */
    public LinearLayout f274328q;

    /* renamed from: r */
    public ImageView f274329r;

    /* renamed from: s */
    public TextView f274330s;

    /* renamed from: t */
    public C94752h f274331t;

    /* renamed from: u */
    public C94752h f274332u;

    /* renamed from: v */
    public TimelineClickListener f274333v;

    /* renamed from: w */
    public C100151a.C100155d f274334w;

    /* renamed from: x */
    public SnsInfo f274335x;

    /* renamed from: x0 */
    public boolean f274336x0;

    /* renamed from: y */
    public C100409k f274337y;

    /* renamed from: y0 */
    public boolean f274338y0;

    /* renamed from: z */
    public ViewGroup f274339z;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$a */
    public class C94745a implements View.OnClickListener {
        public C94745a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialAttitudeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
            try {
                long currentTimeMillis = System.currentTimeMillis();
                AdSocialAttitudeView adSocialAttitudeView = AdSocialAttitudeView.this;
                int i = AdSocialAttitudeView.f274292V0;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                long j = adSocialAttitudeView.f274308Q;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                if (currentTimeMillis - j > 800) {
                    AdSocialAttitudeView adSocialAttitudeView2 = AdSocialAttitudeView.this;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    adSocialAttitudeView2.f274308Q = currentTimeMillis2;
                    SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    if (AdSocialAttitudeView.this.mo130474m()) {
                        AdSocialAttitudeView adSocialAttitudeView3 = AdSocialAttitudeView.this;
                        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        C100409k kVar = adSocialAttitudeView3.f274337y;
                        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        if (!kVar.f294156p) {
                            AdSocialAttitudeView adSocialAttitudeView4 = AdSocialAttitudeView.this;
                            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            C94752h hVar = adSocialAttitudeView4.f274331t;
                            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            if (hVar != null) {
                                AdSocialAttitudeView adSocialAttitudeView5 = AdSocialAttitudeView.this;
                                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                                C94752h hVar2 = adSocialAttitudeView5.f274331t;
                                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                                hVar2.mo130443a();
                            }
                            AdSocialAttitudeView adSocialAttitudeView6 = AdSocialAttitudeView.this;
                            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            C94752h hVar3 = adSocialAttitudeView6.f274332u;
                            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            if (hVar3 != null) {
                                AdSocialAttitudeView adSocialAttitudeView7 = AdSocialAttitudeView.this;
                                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                                C94752h hVar4 = adSocialAttitudeView7.f274332u;
                                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                                hVar4.mo130443a();
                            }
                            AdSocialAttitudeView.this.mo130487t();
                        }
                    }
                    AdSocialAttitudeView adSocialAttitudeView8 = AdSocialAttitudeView.this;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    TimelineClickListener timelineClickListener = adSocialAttitudeView8.f274333v;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    if (timelineClickListener != null) {
                        AdSocialAttitudeView adSocialAttitudeView9 = AdSocialAttitudeView.this;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        TimelineClickListener timelineClickListener2 = adSocialAttitudeView9.f274333v;
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        if (timelineClickListener2.f280389s != null) {
                            AdSocialAttitudeView adSocialAttitudeView10 = AdSocialAttitudeView.this;
                            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            TimelineClickListener timelineClickListener3 = adSocialAttitudeView10.f274333v;
                            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            timelineClickListener3.f280389s.onClick(view);
                        }
                    }
                } else {
                    Log.m105928w("AdSocialAttitudeView", "you must click button slowly");
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialAttitudeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$b */
    public class C94746b implements PAGView.PAGFlushListener {
        public C94746b() {
        }

        public void onFlush() {
            SnsMethodCalculate.markStartTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$2");
            if (AdSocialAttitudeView.m119976j(AdSocialAttitudeView.this) == null || AdSocialAttitudeView.m119976j(AdSocialAttitudeView.this).getVisibility() != 0) {
                Log.m105920e("AdSocialAttitudeView", "mCheerIv is null or not visible");
            } else {
                Log.m105924i("AdSocialAttitudeView", "mCheerIv need to be gone");
                AdSocialAttitudeView adSocialAttitudeView = AdSocialAttitudeView.this;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                adSocialAttitudeView.mo130481r();
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                AdSocialAttitudeView.m119976j(AdSocialAttitudeView.this).clearAnimation();
                AdSocialAttitudeView.m119976j(AdSocialAttitudeView.this).setVisibility(8);
            }
            SnsMethodCalculate.markEndTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$c */
    public class C94747c extends SimplePAGViewUpdateListener {
        public C94747c() {
        }

        public void onAnimationCancel(PAGView pAGView) {
            SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$3");
            SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$3");
        }

        public void onAnimationEnd(PAGView pAGView) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$3");
            if (AdSocialAttitudeView.m119976j(AdSocialAttitudeView.this) != null) {
                AdSocialAttitudeView.m119976j(AdSocialAttitudeView.this).setVisibility(0);
            }
            if (AdSocialAttitudeView.m119977k(AdSocialAttitudeView.this) != null) {
                AdSocialAttitudeView.m119977k(AdSocialAttitudeView.this).setVisibility(8);
            }
            AdSocialAttitudeView adSocialAttitudeView = AdSocialAttitudeView.this;
            SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            adSocialAttitudeView.mo130482s();
            SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            AdSocialAttitudeView adSocialAttitudeView2 = AdSocialAttitudeView.this;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            adSocialAttitudeView2.mo130481r();
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$3");
        }

        public void onAnimationRepeat(PAGView pAGView) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$3");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$3");
        }

        public void onAnimationStart(PAGView pAGView) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$3");
            AdSocialAttitudeView adSocialAttitudeView = AdSocialAttitudeView.this;
            int i = AdSocialAttitudeView.f274292V0;
            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            adSocialAttitudeView.getClass();
            SnsMethodCalculate.markStartTimeMs("startListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            try {
                if (!adSocialAttitudeView.f274309Q0) {
                    adSocialAttitudeView.f274309Q0 = true;
                    adSocialAttitudeView.f274322i.addPAGFlushListener(adSocialAttitudeView.f274315T0);
                    Log.m105924i("AdSocialAttitudeView", "startListenFlushListener");
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("startListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$d */
    public class C94748d implements Runnable {
        public C94748d() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$4");
            AdSocialAttitudeView.m119977k(AdSocialAttitudeView.this).play();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$e */
    public class C94749e implements Runnable {
        public C94749e() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$5");
            AdSocialAttitudeView.m119977k(AdSocialAttitudeView.this).stop();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$f */
    public class C94750f implements ViewTreeObserver.OnPreDrawListener {
        public C94750f() {
        }

        public boolean onPreDraw() {
            int i;
            int i2;
            int i3;
            SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$6");
            try {
                AdSocialAttitudeView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                AdSocialAttitudeView adSocialAttitudeView = AdSocialAttitudeView.this;
                int i4 = AdSocialAttitudeView.f274292V0;
                SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                C100151a.C100155d dVar = adSocialAttitudeView.f274334w;
                SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                if (dVar.f293355K.f293340a == 0) {
                    int width = AdSocialAttitudeView.m119969c(AdSocialAttitudeView.this).getWidth();
                    AdSocialAttitudeView adSocialAttitudeView2 = AdSocialAttitudeView.this;
                    SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    LinearLayout linearLayout = adSocialAttitudeView2.f274293A;
                    SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    i2 = width - linearLayout.getWidth();
                    AdSocialAttitudeView adSocialAttitudeView3 = AdSocialAttitudeView.this;
                    SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    i = adSocialAttitudeView3.f274300H;
                    SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                } else {
                    int width2 = AdSocialAttitudeView.m119969c(AdSocialAttitudeView.this).getWidth();
                    AdSocialAttitudeView adSocialAttitudeView4 = AdSocialAttitudeView.this;
                    SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    LinearLayout linearLayout2 = adSocialAttitudeView4.f274293A;
                    SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    i2 = width2 - linearLayout2.getWidth();
                    AdSocialAttitudeView adSocialAttitudeView5 = AdSocialAttitudeView.this;
                    SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    i = adSocialAttitudeView5.f274301I;
                    SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                }
                int i5 = i2 - i;
                StringBuilder sb = new StringBuilder();
                sb.append("parentViewGroupWidth is ");
                sb.append(AdSocialAttitudeView.m119969c(AdSocialAttitudeView.this).getWidth());
                sb.append(", adSocialLeftViewWidth is ");
                AdSocialAttitudeView adSocialAttitudeView6 = AdSocialAttitudeView.this;
                SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                LinearLayout linearLayout3 = adSocialAttitudeView6.f274293A;
                SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                sb.append(linearLayout3.getWidth());
                sb.append(", remainSpaceWidth is ");
                sb.append(i5);
                Log.m105924i("AdSocialAttitudeView", sb.toString());
                AdSocialAttitudeView adSocialAttitudeView7 = AdSocialAttitudeView.this;
                SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                FrameLayout frameLayout = adSocialAttitudeView7.f274326p;
                SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int width3 = frameLayout.getWidth();
                AdSocialAttitudeView adSocialAttitudeView8 = AdSocialAttitudeView.this;
                SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                ImageView imageView = adSocialAttitudeView8.f274329r;
                SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int width4 = width3 + imageView.getWidth();
                AdSocialAttitudeView adSocialAttitudeView9 = AdSocialAttitudeView.this;
                SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i6 = adSocialAttitudeView9.f274295C;
                SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i7 = width4 + i6;
                AdSocialAttitudeView adSocialAttitudeView10 = AdSocialAttitudeView.this;
                SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i8 = adSocialAttitudeView10.f274296D;
                SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i9 = i7 + i8 + 1;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("cheerTextMax is ");
                AdSocialAttitudeView adSocialAttitudeView11 = AdSocialAttitudeView.this;
                SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i15 = adSocialAttitudeView11.f274295C;
                SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                sb4.append(i15);
                sb4.append(", commentTextMax is ");
                AdSocialAttitudeView adSocialAttitudeView12 = AdSocialAttitudeView.this;
                SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i16 = adSocialAttitudeView12.f274296D;
                SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                sb4.append(i16);
                sb4.append(", contentWidth is ");
                sb4.append(i9);
                Log.m105924i("AdSocialAttitudeView", sb4.toString());
                int i17 = i5 - i9;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("marginWidth is ");
                sb5.append(i17);
                sb5.append(", maxMarginWidth is ");
                AdSocialAttitudeView adSocialAttitudeView13 = AdSocialAttitudeView.this;
                SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i18 = adSocialAttitudeView13.f274304L;
                SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                sb5.append(i18);
                sb5.append(", minMarginWidth is ");
                AdSocialAttitudeView adSocialAttitudeView14 = AdSocialAttitudeView.this;
                SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i19 = adSocialAttitudeView14.f274306N;
                SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                sb5.append(i19);
                sb5.append(", mPreviousLineStatus is ");
                sb5.append(AdSocialAttitudeView.m119970d(AdSocialAttitudeView.this));
                Log.m105924i("AdSocialAttitudeView", sb5.toString());
                AdSocialAttitudeView adSocialAttitudeView15 = AdSocialAttitudeView.this;
                SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i25 = adSocialAttitudeView15.f274306N;
                SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                if (i17 >= i25) {
                    float f = 1.0f;
                    AdSocialAttitudeView adSocialAttitudeView16 = AdSocialAttitudeView.this;
                    SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i26 = adSocialAttitudeView16.f274304L;
                    SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    if (i17 < i26) {
                        float f2 = (float) i17;
                        AdSocialAttitudeView adSocialAttitudeView17 = AdSocialAttitudeView.this;
                        SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        int i27 = adSocialAttitudeView17.f274304L;
                        SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        f = f2 / ((float) i27);
                    }
                    AdSocialAttitudeView adSocialAttitudeView18 = AdSocialAttitudeView.this;
                    SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i28 = adSocialAttitudeView18.f274297E;
                    SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i29 = (int) (((float) i28) * f);
                    AdSocialAttitudeView adSocialAttitudeView19 = AdSocialAttitudeView.this;
                    SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i35 = adSocialAttitudeView19.f274298F;
                    SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i36 = (int) (((float) i35) * f);
                    AdSocialAttitudeView.m119971e(AdSocialAttitudeView.this, i29, i36);
                    AdSocialAttitudeView.m119972f(AdSocialAttitudeView.this, false, 0);
                    Log.m105924i("AdSocialAttitudeView", "marginOuter is " + i29 + ", marginInner is " + i36 + ", rate is " + f);
                    AdSocialAttitudeView adSocialAttitudeView20 = AdSocialAttitudeView.this;
                    SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    C100151a.C100155d dVar2 = adSocialAttitudeView20.f274334w;
                    SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    if (dVar2.f293355K.f293340a == 0) {
                        if (AdSocialAttitudeView.m119970d(AdSocialAttitudeView.this) != 2) {
                            if (AdSocialAttitudeView.m119970d(AdSocialAttitudeView.this) != 0) {
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) AdSocialAttitudeView.this.getLayoutParams();
                                layoutParams.gravity = 8388629;
                                AdSocialAttitudeView.this.setLayoutParams(layoutParams);
                                AdSocialAttitudeView adSocialAttitudeView21 = AdSocialAttitudeView.this;
                                SnsMethodCalculate.markStartTimeMs("access$2302", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                                adSocialAttitudeView21.f274320g = 1;
                                SnsMethodCalculate.markEndTimeMs("access$2302", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            }
                        }
                        AdSocialAttitudeView.m119973g(AdSocialAttitudeView.this);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams2.gravity = 8388629;
                        ((FrameLayout) AdSocialAttitudeView.m119969c(AdSocialAttitudeView.this)).addView(AdSocialAttitudeView.this, layoutParams2);
                        AdSocialAttitudeView adSocialAttitudeView212 = AdSocialAttitudeView.this;
                        SnsMethodCalculate.markStartTimeMs("access$2302", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        adSocialAttitudeView212.f274320g = 1;
                        SnsMethodCalculate.markEndTimeMs("access$2302", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    } else {
                        AdSocialAttitudeView.m119974h(AdSocialAttitudeView.this, false);
                    }
                } else {
                    AdSocialAttitudeView adSocialAttitudeView22 = AdSocialAttitudeView.this;
                    SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    C100151a.C100155d dVar3 = adSocialAttitudeView22.f274334w;
                    SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    if (dVar3.f293355K.f293340a == 0) {
                        i3 = AdSocialAttitudeView.m119975i(AdSocialAttitudeView.this).getWidth();
                        int i37 = 0;
                        while (true) {
                            if (i37 >= AdSocialAttitudeView.m119975i(AdSocialAttitudeView.this).getChildCount()) {
                                i37 = 0;
                                break;
                            } else if (AdSocialAttitudeView.m119975i(AdSocialAttitudeView.this).getChildAt(i37).getId() == C0966R.C0970id.a7q) {
                                break;
                            } else {
                                i37++;
                            }
                        }
                        if (AdSocialAttitudeView.m119970d(AdSocialAttitudeView.this) != 1) {
                            if (AdSocialAttitudeView.m119970d(AdSocialAttitudeView.this) != 0) {
                                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) AdSocialAttitudeView.this.getLayoutParams();
                                AdSocialAttitudeView adSocialAttitudeView23 = AdSocialAttitudeView.this;
                                SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                                int i38 = adSocialAttitudeView23.f274307P;
                                SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                                layoutParams3.topMargin = i38 / 2;
                                AdSocialAttitudeView.this.setLayoutParams(layoutParams3);
                                AdSocialAttitudeView adSocialAttitudeView24 = AdSocialAttitudeView.this;
                                SnsMethodCalculate.markStartTimeMs("access$2302", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                                adSocialAttitudeView24.f274320g = 2;
                                SnsMethodCalculate.markEndTimeMs("access$2302", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            }
                        }
                        AdSocialAttitudeView.m119973g(AdSocialAttitudeView.this);
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                        AdSocialAttitudeView adSocialAttitudeView25 = AdSocialAttitudeView.this;
                        SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        int i39 = adSocialAttitudeView25.f274307P;
                        SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        layoutParams4.topMargin = i39 / 2;
                        AdSocialAttitudeView.m119975i(AdSocialAttitudeView.this).addView(AdSocialAttitudeView.this, i37 + 1, layoutParams4);
                        AdSocialAttitudeView adSocialAttitudeView242 = AdSocialAttitudeView.this;
                        SnsMethodCalculate.markStartTimeMs("access$2302", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        adSocialAttitudeView242.f274320g = 2;
                        SnsMethodCalculate.markEndTimeMs("access$2302", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    } else {
                        i3 = AdSocialAttitudeView.m119969c(AdSocialAttitudeView.this).getWidth();
                        AdSocialAttitudeView.m119974h(AdSocialAttitudeView.this, true);
                    }
                    AdSocialAttitudeView adSocialAttitudeView26 = AdSocialAttitudeView.this;
                    SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i44 = adSocialAttitudeView26.f274299G;
                    SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    AdSocialAttitudeView adSocialAttitudeView27 = AdSocialAttitudeView.this;
                    SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i45 = adSocialAttitudeView27.f274298F;
                    SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    AdSocialAttitudeView.m119971e(adSocialAttitudeView26, i44, i45);
                    AdSocialAttitudeView.m119972f(AdSocialAttitudeView.this, true, (i3 - 1) / 2);
                }
                AdSocialAttitudeView adSocialAttitudeView28 = AdSocialAttitudeView.this;
                SnsMethodCalculate.markStartTimeMs("access$3302", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                adSocialAttitudeView28.f274310R = false;
                SnsMethodCalculate.markEndTimeMs("access$3302", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                AdSocialAttitudeView.this.requestLayout();
                AdSocialAttitudeView adSocialAttitudeView29 = AdSocialAttitudeView.this;
                SnsMethodCalculate.markStartTimeMs("access$3402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                adSocialAttitudeView29.f274312S = true;
                SnsMethodCalculate.markEndTimeMs("access$3402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$6");
                return true;
            } catch (Throwable th) {
                Log.m105920e("AdSocialAttitudeView", th.toString());
                SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$6");
                return false;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$g */
    public static class C94751g implements C63489a.C63493f {

        /* renamed from: a */
        public WeakReference<AdSocialAttitudeView> f274346a;

        /* renamed from: b */
        public int f274347b;

        public C94751g(AdSocialAttitudeView adSocialAttitudeView) {
            this.f274346a = new WeakReference<>(adSocialAttitudeView);
            this.f274347b = C76577a.m92151b(adSocialAttitudeView.getContext(), 16);
        }

        /* renamed from: a */
        public void mo67280a(Bitmap bitmap, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$DownloadCallback");
            try {
                WeakReference<AdSocialAttitudeView> weakReference = this.f274346a;
                if (weakReference == null) {
                    SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$DownloadCallback");
                    return;
                }
                AdSocialAttitudeView adSocialAttitudeView = weakReference.get();
                if (adSocialAttitudeView == null) {
                    SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$DownloadCallback");
                    return;
                }
                Object tag = AdSocialAttitudeView.m119976j(adSocialAttitudeView).getTag(C0966R.C0970id.lww);
                if (tag instanceof String) {
                    String str = (String) tag;
                    SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    String str2 = adSocialAttitudeView.f274316U;
                    SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    if (!TextUtils.isEmpty(str2)) {
                        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        String str3 = adSocialAttitudeView.f274316U;
                        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        if (str3.equals(str) && AdSocialAttitudeView.m119976j(adSocialAttitudeView) != null) {
                            SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            Drawable drawable = adSocialAttitudeView.f274314T;
                            SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            if (z && bitmap != null) {
                                drawable = new BitmapDrawable(MMApplicationContext.getContext().getResources(), bitmap);
                                int i = this.f274347b;
                                drawable.setBounds(0, 0, i, i);
                            }
                            if (adSocialAttitudeView.mo130474m()) {
                                drawable.setColorFilter(adSocialAttitudeView.getResources().getColor(C0966R.color.f2958ae), PorterDuff.Mode.SRC_ATOP);
                                AdSocialAttitudeView.m119976j(adSocialAttitudeView).setImageDrawable(drawable);
                                AdSocialAttitudeView.m119976j(adSocialAttitudeView).setIconColor(adSocialAttitudeView.getResources().getColor(C0966R.color.f2958ae));
                            } else {
                                drawable.clearColorFilter();
                                AdSocialAttitudeView.m119976j(adSocialAttitudeView).setImageDrawable(drawable);
                                AdSocialAttitudeView.m119976j(adSocialAttitudeView).setIconColor(adSocialAttitudeView.getResources().getColor(C0966R.color.ahf));
                            }
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$DownloadCallback");
            } catch (Throwable th) {
                Log.m105920e("AdSocialAttitudeView", "onDownloadResult, exp=" + th.toString());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$h */
    public interface C94752h {
        /* renamed from: a */
        void mo130443a();
    }

    public AdSocialAttitudeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public static /* synthetic */ ViewGroup m119969c(AdSocialAttitudeView adSocialAttitudeView) {
        SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        ViewGroup viewGroup = adSocialAttitudeView.f274339z;
        SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        return viewGroup;
    }

    /* renamed from: d */
    public static /* synthetic */ int m119970d(AdSocialAttitudeView adSocialAttitudeView) {
        SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        int i = adSocialAttitudeView.f274320g;
        SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        return i;
    }

    /* renamed from: e */
    public static void m119971e(AdSocialAttitudeView adSocialAttitudeView, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        adSocialAttitudeView.getClass();
        SnsMethodCalculate.markStartTimeMs("resizeContentMarginParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        LinearLayout linearLayout = adSocialAttitudeView.f274325o;
        int i3 = adSocialAttitudeView.f274302J;
        linearLayout.setPadding(i, i3, i, i3);
        LinearLayout linearLayout2 = adSocialAttitudeView.f274328q;
        int i4 = adSocialAttitudeView.f274302J;
        linearLayout2.setPadding(i, i4, i, i4);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) adSocialAttitudeView.f274326p.getLayoutParams();
        layoutParams.rightMargin = i2;
        adSocialAttitudeView.f274326p.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) adSocialAttitudeView.f274329r.getLayoutParams();
        layoutParams2.rightMargin = i2;
        adSocialAttitudeView.f274329r.setLayoutParams(layoutParams2);
        SnsMethodCalculate.markEndTimeMs("resizeContentMarginParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    /* renamed from: f */
    public static void m119972f(AdSocialAttitudeView adSocialAttitudeView, boolean z, int i) {
        SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        adSocialAttitudeView.getClass();
        SnsMethodCalculate.markStartTimeMs("resizeCheerAndCommentContainerParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) adSocialAttitudeView.f274325o.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) adSocialAttitudeView.f274328q.getLayoutParams();
        if (!z || i <= 0) {
            layoutParams.width = -2;
            layoutParams2.width = -2;
        } else {
            layoutParams.width = i;
            layoutParams2.width = i;
        }
        adSocialAttitudeView.f274325o.setLayoutParams(layoutParams);
        adSocialAttitudeView.f274328q.setLayoutParams(layoutParams2);
        SnsMethodCalculate.markEndTimeMs("resizeCheerAndCommentContainerParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    /* renamed from: g */
    public static void m119973g(AdSocialAttitudeView adSocialAttitudeView) {
        SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        adSocialAttitudeView.getClass();
        SnsMethodCalculate.markStartTimeMs("removeViewFromParent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        ViewParent parent = adSocialAttitudeView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(adSocialAttitudeView);
        }
        SnsMethodCalculate.markEndTimeMs("removeViewFromParent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    /* renamed from: h */
    public static void m119974h(AdSocialAttitudeView adSocialAttitudeView, boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        adSocialAttitudeView.getClass();
        SnsMethodCalculate.markStartTimeMs("resizeParamsInSnsCommentUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        if (z) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(3, C0966R.C0970id.lvp);
        } else {
            if (adSocialAttitudeView.f274324n.getHeight() > 0) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) adSocialAttitudeView.f274293A.getLayoutParams();
                int i = adSocialAttitudeView.f274302J;
                layoutParams2.topMargin = i;
                layoutParams2.bottomMargin = i;
                adSocialAttitudeView.f274293A.setLayoutParams(layoutParams2);
            }
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(3, C0966R.C0970id.jub);
            layoutParams.addRule(21, -1);
        }
        adSocialAttitudeView.setLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("resizeParamsInSnsCommentUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    /* renamed from: i */
    public static /* synthetic */ LinearLayout m119975i(AdSocialAttitudeView adSocialAttitudeView) {
        SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        LinearLayout linearLayout = adSocialAttitudeView.f274294B;
        SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        return linearLayout;
    }

    /* renamed from: j */
    public static /* synthetic */ WeImageView m119976j(AdSocialAttitudeView adSocialAttitudeView) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        WeImageView weImageView = adSocialAttitudeView.f274321h;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        return weImageView;
    }

    /* renamed from: k */
    public static /* synthetic */ PAGView m119977k(AdSocialAttitudeView adSocialAttitudeView) {
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        PAGView pAGView = adSocialAttitudeView.f274322i;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        return pAGView;
    }

    /* renamed from: l */
    public void mo130473l() {
        SnsMethodCalculate.markStartTimeMs("calcAdSocialAttitudeParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        if (this.f274337y == null || this.f274334w == null) {
            SnsMethodCalculate.markEndTimeMs("calcAdSocialAttitudeParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        } else if (this.f274339z == null || this.f274293A == null) {
            SnsMethodCalculate.markEndTimeMs("calcAdSocialAttitudeParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        } else {
            if (!this.f274310R) {
                getViewTreeObserver().addOnPreDrawListener(new C94750f());
                this.f274310R = true;
            }
            SnsMethodCalculate.markEndTimeMs("calcAdSocialAttitudeParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        }
    }

    /* renamed from: m */
    public boolean mo130474m() {
        SnsInfo snsInfo;
        SnsMethodCalculate.markStartTimeMs("checkLikeStatus", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        C100151a.C100155d dVar = this.f274334w;
        boolean z = false;
        if (dVar == null || (snsInfo = this.f274335x) == null) {
            SnsMethodCalculate.markEndTimeMs("checkLikeStatus", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            return false;
        } else if (dVar.f293355K.f293340a == 0) {
            Object tag = getTag();
            if (tag instanceof C95917e.C95922e) {
                if (((C95917e.C95922e) tag).f279958h == 0) {
                    z = true;
                }
                SnsMethodCalculate.markEndTimeMs("checkLikeStatus", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                return z;
            }
            SnsMethodCalculate.markEndTimeMs("checkLikeStatus", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            return false;
        } else {
            if (snsInfo.getLikeFlag() == 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("checkLikeStatus", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            return z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e9, code lost:
        if (r12 == null) goto L_0x00ee;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo130475n(nq2.C100151a.C100155d r11, com.tencent.p014mm.plugin.sns.storage.SnsInfo r12) {
        /*
            r10 = this;
            java.lang.String r0 = "fillAdSocialAttitudeView"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "fillData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            r10.f274334w = r11
            r10.f274335x = r12
            java.lang.String r11 = "fixLikeFlagToLikeList"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r10.f274335x
            com.tencent.mm.protocal.protobuf.SnsObject r3 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120367e(r3)
            java.lang.String r4 = eb0.C75592q0.m90789s()
            r5 = 0
            if (r3 == 0) goto L_0x0061
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L_0x0029
            goto L_0x0061
        L_0x0029:
            java.util.LinkedList<te3.w64> r3 = r3.LikeUserList
            boolean r6 = rq2.C101425k.m133097a(r3)
            if (r6 == 0) goto L_0x0038
            r10.mo130479p(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r1)
            goto L_0x0067
        L_0x0038:
            int r6 = r3.size()
            r7 = 0
        L_0x003d:
            r8 = 1
            if (r7 >= r6) goto L_0x0057
            java.lang.Object r9 = r3.get(r7)
            te3.w64 r9 = (te3.w64) r9
            if (r9 == 0) goto L_0x0054
            java.lang.String r9 = r9.f299703d
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r9)
            if (r9 == 0) goto L_0x0054
            r10.mo130479p(r8)
            goto L_0x0058
        L_0x0054:
            int r7 = r7 + 1
            goto L_0x003d
        L_0x0057:
            r8 = 0
        L_0x0058:
            if (r8 != 0) goto L_0x005d
            r10.mo130479p(r5)
        L_0x005d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r1)
            goto L_0x0067
        L_0x0061:
            r10.mo130479p(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r1)
        L_0x0067:
            com.tencent.mm.plugin.sns.storage.ADXml r11 = r12.getAdXml()
            os2.k r11 = r11.adSocialInfo
            r10.f274337y = r11
            nq2.a$d r11 = r10.f274334w
            android.view.ViewGroup r12 = r11.f293381z
            r10.f274339z = r12
            android.widget.LinearLayout r12 = r11.f293345A
            r10.f274293A = r12
            android.widget.LinearLayout r11 = r11.f293346B
            r10.f274294B = r11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            java.lang.String r11 = "fillText"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r1)
            os2.k r12 = r10.f274337y
            java.lang.String r2 = "getCurrentLanAdSocialText"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = ""
            if (r12 != 0) goto L_0x0099
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r12 = r4
            r7 = r12
            goto L_0x00f3
        L_0x0099:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x00ec }
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r6)     // Catch:{ all -> 0x00ec }
            java.lang.String r7 = "zh_CN"
            boolean r7 = r7.equals(r6)     // Catch:{ all -> 0x00ec }
            if (r7 == 0) goto L_0x00bb
            java.lang.String r6 = r12.f294145e     // Catch:{ all -> 0x00ec }
            if (r6 != 0) goto L_0x00af
            r6 = r4
        L_0x00af:
            java.lang.String r7 = r12.f294148h     // Catch:{ all -> 0x00ec }
            if (r7 != 0) goto L_0x00b4
            r7 = r4
        L_0x00b4:
            java.lang.String r12 = r12.f294151k     // Catch:{ all -> 0x00ec }
            if (r12 != 0) goto L_0x00b9
            goto L_0x00ee
        L_0x00b9:
            r4 = r12
            goto L_0x00ee
        L_0x00bb:
            java.lang.String r7 = "zh_TW"
            boolean r7 = r7.equals(r6)     // Catch:{ all -> 0x00ec }
            if (r7 != 0) goto L_0x00dd
            java.lang.String r7 = "zh_HK"
            boolean r6 = r7.equals(r6)     // Catch:{ all -> 0x00ec }
            if (r6 == 0) goto L_0x00ce
            goto L_0x00dd
        L_0x00ce:
            java.lang.String r6 = r12.f294147g     // Catch:{ all -> 0x00ec }
            if (r6 != 0) goto L_0x00d3
            r6 = r4
        L_0x00d3:
            java.lang.String r7 = r12.f294150j     // Catch:{ all -> 0x00ec }
            if (r7 != 0) goto L_0x00d8
            r7 = r4
        L_0x00d8:
            java.lang.String r12 = r12.f294153m     // Catch:{ all -> 0x00ec }
            if (r12 != 0) goto L_0x00b9
            goto L_0x00ee
        L_0x00dd:
            java.lang.String r6 = r12.f294146f     // Catch:{ all -> 0x00ec }
            if (r6 != 0) goto L_0x00e2
            r6 = r4
        L_0x00e2:
            java.lang.String r7 = r12.f294149i     // Catch:{ all -> 0x00ec }
            if (r7 != 0) goto L_0x00e7
            r7 = r4
        L_0x00e7:
            java.lang.String r12 = r12.f294152l     // Catch:{ all -> 0x00ec }
            if (r12 != 0) goto L_0x00b9
            goto L_0x00ee
        L_0x00ec:
            r6 = r4
            r7 = r6
        L_0x00ee:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r12 = r4
            r4 = r6
        L_0x00f3:
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            android.widget.TextView r4 = r10.f274323j
            if (r4 == 0) goto L_0x012f
            boolean r4 = r10.mo130474m()
            if (r4 == 0) goto L_0x010f
            android.widget.TextView r4 = r10.f274323j
            r4.setText(r2)
            goto L_0x0114
        L_0x010f:
            android.widget.TextView r4 = r10.f274323j
            r4.setText(r3)
        L_0x0114:
            android.widget.TextView r4 = r10.f274323j
            android.text.TextPaint r4 = r4.getPaint()
            float r2 = r4.measureText(r2)
            android.widget.TextView r4 = r10.f274323j
            android.text.TextPaint r4 = r4.getPaint()
            float r3 = r4.measureText(r3)
            float r2 = java.lang.Math.max(r2, r3)
            int r2 = (int) r2
            r10.f274295C = r2
        L_0x012f:
            android.widget.TextView r2 = r10.f274330s
            if (r2 == 0) goto L_0x0143
            r2.setText(r12)
            android.widget.TextView r2 = r10.f274330s
            android.text.TextPaint r2 = r2.getPaint()
            float r12 = r2.measureText(r12)
            int r12 = (int) r12
            r10.f274296D = r12
        L_0x0143:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r1)
            java.lang.String r11 = "fillImg"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r1)
            boolean r12 = r10.mo130474m()
            if (r12 == 0) goto L_0x0158
            os2.k r12 = r10.f274337y
            java.lang.String r12 = r12.f294141a
            r10.f274316U = r12
            goto L_0x016b
        L_0x0158:
            boolean r12 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r12 == 0) goto L_0x0165
            os2.k r12 = r10.f274337y
            java.lang.String r12 = r12.f294143c
            r10.f274316U = r12
            goto L_0x016b
        L_0x0165:
            os2.k r12 = r10.f274337y
            java.lang.String r12 = r12.f294142b
            r10.f274316U = r12
        L_0x016b:
            com.tencent.mm.plugin.sns.storage.SnsInfo r12 = r10.f274335x
            java.lang.String r12 = r12.getSnsId()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r2 != 0) goto L_0x0184
            java.lang.String r2 = r10.f274311R0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r12, (java.lang.String) r2)
            if (r2 != 0) goto L_0x0184
            r10.mo130487t()
            r10.f274313S0 = r5
        L_0x0184:
            r10.f274311R0 = r12
            android.content.Context r12 = r10.getContext()
            r2 = 2131234284(0x7f080dec, float:1.808473E38)
            android.content.Context r3 = r10.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131099850(0x7f0600ca, float:1.7812065E38)
            int r3 = r3.getColor(r4)
            android.graphics.drawable.Drawable r12 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r12, r2, r3)
            r10.f274314T = r12
            int r2 = r12.getIntrinsicWidth()
            android.graphics.drawable.Drawable r3 = r10.f274314T
            int r3 = r3.getIntrinsicHeight()
            r12.setBounds(r5, r5, r2, r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r12 = r10.f274321h
            r2 = 2131313888(0x7f0944e0, float:1.8246185E38)
            java.lang.String r3 = r10.f274316U
            r12.setTag(r2, r3)
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$g r12 = new com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$g
            r12.<init>(r10)
            java.lang.String r2 = r10.f274316U
            rq2.C63489a.m74831f(r2, r12)
            android.widget.ImageView r12 = r10.f274329r
            android.content.Context r2 = r10.getContext()
            r3 = 2131230902(0x7f0800b6, float:1.807787E38)
            android.content.Context r5 = r10.getContext()
            android.content.res.Resources r5 = r5.getResources()
            int r4 = r5.getColor(r4)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r2, r3, r4)
            r12.setImageDrawable(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r1)
            r10.mo130473l()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial.AdSocialAttitudeView.mo130475n(nq2.a$d, com.tencent.mm.plugin.sns.storage.SnsInfo):void");
    }

    /* renamed from: o */
    public final void mo130476o() {
        SnsMethodCalculate.markStartTimeMs("initCalcParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        this.f274297E = C76577a.m92151b(getContext(), 12);
        this.f274298F = C76577a.m92151b(getContext(), 4);
        this.f274299G = C76577a.m92151b(getContext(), 6);
        this.f274300H = C76577a.m92151b(getContext(), 40);
        this.f274301I = C76577a.m92151b(getContext(), 32);
        this.f274302J = C76577a.m92151b(getContext(), 8);
        this.f274303K = 56;
        this.f274304L = C76577a.m92151b(getContext(), this.f274303K);
        this.f274305M = this.f274303K / 2;
        this.f274306N = C76577a.m92151b(getContext(), this.f274305M);
        this.f274307P = C76577a.m92151b(getContext(), 16);
        SnsMethodCalculate.markEndTimeMs("initCalcParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        super.onConfigurationChanged(configuration);
        mo130473l();
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        try {
            super.onDetachedFromWindow();
            mo130487t();
            this.f274311R0 = "";
            this.f274313S0 = false;
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void onFinishInflate() {
        SnsMethodCalculate.markStartTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        super.onFinishInflate();
        try {
            this.f274324n = (RelativeLayout) findViewById(C0966R.C0970id.br8);
            this.f274325o = (LinearLayout) findViewById(C0966R.C0970id.lvy);
            this.f274326p = (FrameLayout) findViewById(C0966R.C0970id.f1n);
            this.f274321h = (WeImageView) findViewById(C0966R.C0970id.f5730n2);
            this.f274322i = (PAGView) findViewById(C0966R.C0970id.o1w);
            this.f274323j = (TextView) findViewById(C0966R.C0970id.lvz);
            this.f274329r = (ImageView) findViewById(C0966R.C0970id.f357743lw0);
            this.f274328q = (LinearLayout) findViewById(C0966R.C0970id.bja);
            this.f274330s = (TextView) findViewById(C0966R.C0970id.bk8);
            mo130476o();
            this.f274325o.setOnClickListener(new C94745a());
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    /* renamed from: p */
    public final void mo130479p(int i) {
        SnsMethodCalculate.markStartTimeMs("resetLikeFlag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        if (this.f274334w.f293355K.f293340a == 0) {
            Object tag = getTag();
            if (tag instanceof C95917e.C95922e) {
                ((C95917e.C95922e) tag).f279958h = i;
            }
        }
        this.f274335x.setLikeFlag(i);
        SnsMethodCalculate.markEndTimeMs("resetLikeFlag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014e  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo130480q() {
        /*
            r12 = this;
            java.lang.String r0 = "startPlayIconAttractAnimation"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1612(0x64c, float:2.259E-42)
            r4 = 104(0x68, float:1.46E-43)
            r2.mo175911u(r3, r4)
            java.lang.String r4 = "checkPAGFileDownload"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r12.f274335x
            r6 = 0
            java.lang.String r7 = "AdSocialAttitudeView"
            r8 = 1
            if (r5 != 0) goto L_0x0024
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
        L_0x0021:
            r2 = 0
            goto L_0x0112
        L_0x0024:
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r5.getAdXml()
            os2.k r5 = r5.adSocialInfo
            os2.k$a r5 = r5.f294144d
            java.lang.String r5 = r5.f294161e
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            boolean r9 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r9 == 0) goto L_0x0048
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r12.f274335x
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r5.getAdXml()
            os2.k r5 = r5.adSocialInfo
            os2.k$a r5 = r5.f294144d
            java.lang.String r5 = r5.f294163g
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
        L_0x0048:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r9 == 0) goto L_0x0057
            java.lang.String r2 = "attractingAnimationInfo is exist, but icon pagFileUrl is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            goto L_0x0021
        L_0x0057:
            java.lang.String r9 = r12.f274327p0
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x006e
            boolean r5 = r12.f274336x0
            if (r5 == 0) goto L_0x006e
            java.lang.String r2 = "checkPAGFileDownload, return true directly"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            r2 = 1
            goto L_0x0112
        L_0x006e:
            java.lang.String r5 = "initPagAnimViewData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r12.f274335x
            if (r9 != 0) goto L_0x007c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            goto L_0x010e
        L_0x007c:
            com.tencent.mm.plugin.sns.storage.ADXml r9 = r9.getAdXml()
            os2.k r9 = r9.adSocialInfo
            os2.k$a r9 = r9.f294144d
            java.lang.String r9 = r9.f294161e
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r12.f274335x
            com.tencent.mm.plugin.sns.storage.ADXml r10 = r10.getAdXml()
            os2.k r10 = r10.adSocialInfo
            os2.k$a r10 = r10.f294144d
            java.lang.String r10 = r10.f294162f
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            boolean r11 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r11 == 0) goto L_0x00c0
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r12.f274335x
            com.tencent.mm.plugin.sns.storage.ADXml r9 = r9.getAdXml()
            os2.k r9 = r9.adSocialInfo
            os2.k$a r9 = r9.f294144d
            java.lang.String r9 = r9.f294163g
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r12.f274335x
            com.tencent.mm.plugin.sns.storage.ADXml r10 = r10.getAdXml()
            os2.k r10 = r10.adSocialInfo
            os2.k$a r10 = r10.f294144d
            java.lang.String r10 = r10.f294164h
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
        L_0x00c0:
            java.lang.String r10 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.C94724k.m119922b(r9, r10)
            r12.f274327p0 = r9
            r12.f274336x0 = r6
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00fe
            byte[] r2 = com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.C94724k.m119923c(r10)
            org.libpag.PAGFile r2 = org.libpag.PAGFile.Load((byte[]) r2)
            int r3 = r2.width()
            r12.f274318V = r3
            int r3 = r2.height()
            r12.f274319W = r3
            org.libpag.PAGView r3 = r12.f274322i
            r3.setComposition(r2)
            org.libpag.PAGView r2 = r12.f274322i
            r3 = 3
            r2.setScaleMode(r3)
            org.libpag.PAGView r2 = r12.f274322i
            r2.setRepeatCount(r8)
            r12.f274336x0 = r8
            java.lang.String r2 = "initPagAnimViewData, use server icon file"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            r2 = 1
            goto L_0x010f
        L_0x00fe:
            com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.C94724k.m119921a(r9)
            java.lang.String r9 = "initPagAnimViewData, start download icon pagFile"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
            r9 = 105(0x69, float:1.47E-43)
            r2.mo175911u(r3, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
        L_0x010e:
            r2 = 0
        L_0x010f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
        L_0x0112:
            if (r2 == 0) goto L_0x014e
            int r2 = r12.f274318V
            if (r2 <= 0) goto L_0x014e
            int r2 = r12.f274319W
            if (r2 <= 0) goto L_0x014e
            org.libpag.PAGView r2 = r12.f274322i
            r3 = 0
            r2.setProgress(r3)
            org.libpag.PAGView r2 = r12.f274322i
            r2.setVisibility(r6)
            java.lang.String r2 = "startListenPagView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            boolean r3 = r12.f274338y0     // Catch:{ all -> 0x013e }
            if (r3 != 0) goto L_0x013e
            r12.f274338y0 = r8     // Catch:{ all -> 0x013e }
            org.libpag.PAGView r3 = r12.f274322i     // Catch:{ all -> 0x013e }
            org.libpag.PAGView$PAGViewListener r4 = r12.f274317U0     // Catch:{ all -> 0x013e }
            r3.addListener(r4)     // Catch:{ all -> 0x013e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)     // Catch:{ all -> 0x013e }
        L_0x013e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            r12.f274313S0 = r8
            org.libpag.PAGView r2 = r12.f274322i
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$d r3 = new com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$d
            r3.<init>()
            r2.post(r3)
            goto L_0x0153
        L_0x014e:
            java.lang.String r2 = "icon pag file width or height <= 0 or may be download icon pag file"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r2)
        L_0x0153:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial.AdSocialAttitudeView.mo130480q():void");
    }

    /* renamed from: r */
    public final void mo130481r() {
        SnsMethodCalculate.markStartTimeMs("stopListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        try {
            if (this.f274309Q0) {
                this.f274309Q0 = false;
                this.f274322i.removePAGFlushListener(this.f274315T0);
                Log.m105924i("AdSocialAttitudeView", "stopListenFlushListener");
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("stopListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    /* renamed from: s */
    public final void mo130482s() {
        SnsMethodCalculate.markStartTimeMs("stopListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        try {
            if (this.f274338y0) {
                this.f274338y0 = false;
                this.f274322i.removeListener(this.f274317U0);
                Log.m105924i("AdSocialAttitudeView", "stopListenPagView");
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("stopListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void setOnCancelAttractAnimationListener(C94752h hVar) {
        SnsMethodCalculate.markStartTimeMs("setOnCancelAttractAnimationListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        this.f274332u = hVar;
        SnsMethodCalculate.markEndTimeMs("setOnCancelAttractAnimationListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void setOnCommentClickListener(TimelineClickListener timelineClickListener) {
        SnsMethodCalculate.markStartTimeMs("setOnCommentClickListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        LinearLayout linearLayout = this.f274328q;
        if (!(linearLayout == null || timelineClickListener == null)) {
            this.f274333v = timelineClickListener;
            linearLayout.setOnClickListener(timelineClickListener.f280388r);
        }
        SnsMethodCalculate.markEndTimeMs("setOnCommentClickListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void setOnShowAttitudeListener(C94752h hVar) {
        SnsMethodCalculate.markStartTimeMs("setOnShowAttitudeListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        this.f274331t = hVar;
        SnsMethodCalculate.markEndTimeMs("setOnShowAttitudeListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void setTag(Object obj) {
        SnsMethodCalculate.markStartTimeMs("setTag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        super.setTag(obj);
        LinearLayout linearLayout = this.f274328q;
        if (linearLayout != null) {
            linearLayout.setTag(obj);
        }
        LinearLayout linearLayout2 = this.f274325o;
        if (linearLayout2 != null) {
            linearLayout2.setTag(obj);
        }
        SnsMethodCalculate.markEndTimeMs("setTag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    /* renamed from: t */
    public void mo130487t() {
        SnsMethodCalculate.markStartTimeMs("stopPlayIconAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        try {
            WeImageView weImageView = this.f274321h;
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            if (this.f274322i != null) {
                mo130482s();
                mo130481r();
                this.f274322i.setVisibility(8);
                this.f274322i.post(new C94749e());
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("stopPlayIconAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public AdSocialAttitudeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f274320g = 0;
        this.f274338y0 = false;
        this.f274309Q0 = false;
        this.f274313S0 = false;
        this.f274315T0 = new C94746b();
        this.f274317U0 = new C94747c();
    }
}
