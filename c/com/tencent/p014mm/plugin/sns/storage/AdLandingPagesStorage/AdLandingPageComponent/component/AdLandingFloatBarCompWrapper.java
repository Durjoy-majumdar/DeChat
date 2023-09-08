package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.C103733h;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsAdShowFloatCompEvent;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.C96328z2;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lo2.C99525b0;
import org.json.JSONObject;
import ps2.C100880k;
import ps2.C100891r;
import qs2.C101255a0;
import qs2.C101263e0;
import qs2.C101287r;
import rq2.C101419f;
import sq2.C101698b;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper */
public class AdLandingFloatBarCompWrapper extends C95295z {

    /* renamed from: A */
    public ViewGroup f275784A;

    /* renamed from: B */
    public C95098h0 f275785B;

    /* renamed from: C */
    public boolean f275786C = false;

    /* renamed from: D */
    public int f275787D = 0;

    /* renamed from: E */
    public boolean f275788E;

    /* renamed from: F */
    public boolean f275789F;

    /* renamed from: G */
    public IListener<SnsAdShowFloatCompEvent> f275790G = null;

    /* renamed from: H */
    public boolean f275791H = false;

    /* renamed from: I */
    public boolean f275792I = false;

    /* renamed from: J */
    public boolean f275793J = false;

    /* renamed from: K */
    public AnimatorSet f275794K = null;

    /* renamed from: L */
    public AnimatorSet f275795L = null;

    /* renamed from: M */
    public Handler f275796M = new C95038h(Looper.getMainLooper());

    /* renamed from: s */
    public Context f275797s;

    /* renamed from: t */
    public C101263e0 f275798t;

    /* renamed from: u */
    public View f275799u;

    /* renamed from: v */
    public ImageView f275800v;

    /* renamed from: w */
    public TextView f275801w;

    /* renamed from: x */
    public TextView f275802x;

    /* renamed from: y */
    public FrameLayout f275803y;

    /* renamed from: z */
    public RoundedCornerFrameLayout f275804z;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$a */
    public class C95031a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C101287r f275806d;

        /* renamed from: e */
        public final /* synthetic */ Button f275807e;

        public C95031a(AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper, C101287r rVar, Button button) {
            this.f275806d = rVar;
            this.f275807e = button;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$10");
            if (!Util.isNullOrNil(this.f275806d.f296707S)) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                Drawable drawable = this.f275807e.getCompoundDrawables()[0];
                if (drawable != null) {
                    drawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_ATOP);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$10");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$b */
    public class C95032b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f275808d;

        /* renamed from: e */
        public final /* synthetic */ C101287r f275809e;

        /* renamed from: f */
        public final /* synthetic */ Button f275810f;

        public C95032b(View view, C101287r rVar, Button button) {
            this.f275808d = view;
            this.f275809e = rVar;
            this.f275810f = button;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$11");
            try {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                ViewGroup.LayoutParams layoutParams = this.f275808d.getLayoutParams();
                layoutParams.width = num.intValue();
                this.f275808d.setLayoutParams(layoutParams);
                if (!Util.isNullOrNil(this.f275809e.f296707S)) {
                    C99525b0.m129878a(AdLandingFloatBarCompWrapper.this.f276579d, this.f275810f, (float) num.intValue(), this.f275809e);
                }
            } catch (Throwable th) {
                Log.m105920e("AdLandingFloatBarCompWrapper", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$11");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$c */
    public class C95033c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f275812d;

        public C95033c(AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper, View view) {
            this.f275812d = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$12");
            ViewGroup.LayoutParams layoutParams = this.f275812d.getLayoutParams();
            layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f275812d.setLayoutParams(layoutParams);
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$12");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$d */
    public class C95034d implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ View f275813d;

        /* renamed from: e */
        public final /* synthetic */ int f275814e;

        /* renamed from: f */
        public final /* synthetic */ int f275815f;

        public C95034d(View view, int i, int i2) {
            this.f275813d = view;
            this.f275814e = i;
            this.f275815f = i2;
        }

        public void onAnimationCancel(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$13");
            SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$13");
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$13");
            if (!AdLandingFloatBarCompWrapper.m120782H(AdLandingFloatBarCompWrapper.this)) {
                ViewParent parent = this.f275813d.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f275813d);
                }
                AdLandingFloatBarCompWrapper.this.f275784A.removeView(this.f275813d);
                this.f275813d.setTranslationX(0.0f);
                AdLandingFloatBarCompWrapper.this.f275803y.addView(this.f275813d, new FrameLayout.LayoutParams(-1, -1));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) AdLandingFloatBarCompWrapper.this.f275803y.getLayoutParams();
                layoutParams.width = this.f275814e;
                layoutParams.height = this.f275815f;
                AdLandingFloatBarCompWrapper.this.f275803y.setLayoutParams(layoutParams);
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$13");
        }

        public void onAnimationRepeat(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$13");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$13");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$13");
            Context context = AdLandingFloatBarCompWrapper.this.f275797s;
            if (context instanceof SnsAdNativeLandingPagesUI) {
                boolean D8 = ((SnsAdNativeLandingPagesUI) context).mo132496D8();
                if (!AdLandingFloatBarCompWrapper.m120782H(AdLandingFloatBarCompWrapper.this) && !D8) {
                    View view = AdLandingFloatBarCompWrapper.this.f275799u;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$13", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$13", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (SnsAdNativeLandingPagesUI) AdLandingFloatBarCompWrapper.this.f275797s;
                    snsAdNativeLandingPagesUI.getClass();
                    SnsMethodCalculate.markStartTimeMs("isOnPause", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    boolean z = snsAdNativeLandingPagesUI.f277597n1;
                    SnsMethodCalculate.markEndTimeMs("isOnPause", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    if (!z) {
                        AdLandingFloatBarCompWrapper.this.mo124360B();
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$13");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$e */
    public class C95035e implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ String f275817a;

        public C95035e(String str) {
            this.f275817a = str;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$2");
            Log.m105920e("AdLandingFloatBarCompWrapper", "refreshView icon onDownloadError, url=" + this.f275817a);
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$2");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$2");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$2");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$2");
            Log.m105924i("AdLandingFloatBarCompWrapper", "refreshView icon onDownloaded, path=" + str);
            try {
                AdLandingFloatBarCompWrapper.this.f275800v.setImageBitmap(BitmapUtil.decodeFile(str, (BitmapFactory.Options) null));
                AdLandingFloatBarCompWrapper.this.f275804z.setVisibility(0);
            } catch (Throwable th) {
                Log.m105920e("AdLandingFloatBarCompWrapper", "refreshView icon download exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$f */
    public class C95036f implements C100880k.C100881a {
        public C95036f() {
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$3");
            Log.m105920e("AdLandingFloatBarCompWrapper", "refreshView bkg onDownloadError");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$3");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$3");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$3");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$3");
            Log.m105924i("AdLandingFloatBarCompWrapper", "refreshView bkg onDownloaded, path=" + str);
            try {
                Drawable e = C101419f.m133082e(AdLandingFloatBarCompWrapper.this.f275797s.getResources(), str);
                if (e != null) {
                    AdLandingFloatBarCompWrapper.this.f275799u.setBackgroundDrawable(e);
                }
            } catch (Throwable th) {
                Log.m105920e("AdLandingFloatBarCompWrapper", "refreshView bkg download exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$g */
    public class C95037g implements View.OnClickListener {
        public C95037g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$4");
            AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper = AdLandingFloatBarCompWrapper.this;
            if (!adLandingFloatBarCompWrapper.f275786C) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$4");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            SnsMethodCalculate.markStartTimeMs("access$408", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            adLandingFloatBarCompWrapper.f275787D++;
            SnsMethodCalculate.markEndTimeMs("access$408", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            int i = 0;
            C95098h0 h0Var = AdLandingFloatBarCompWrapper.this.f275785B;
            if (h0Var != null) {
                Button button = null;
                try {
                    if (h0Var instanceof C95108i0) {
                        button = ((C95108i0) h0Var).mo131625N();
                    } else if (h0Var instanceof C95144m0) {
                        button = ((C95144m0) h0Var).mo131669h0();
                    }
                    if (button != null) {
                        button.performClick();
                    } else {
                        Log.m105920e("AdLandingFloatBarCompWrapper", "onClick noBtn found, comp=" + AdLandingFloatBarCompWrapper.this.f275785B);
                    }
                    i = AdLandingFloatBarCompWrapper.this.f275785B.mo131614H();
                } catch (Exception e) {
                    Log.m105920e("AdLandingFloatBarCompWrapper", "onClick exp=" + e.toString());
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onClick, clickCount=");
            AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper2 = AdLandingFloatBarCompWrapper.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            int i2 = adLandingFloatBarCompWrapper2.f275787D;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            sb.append(i2);
            sb.append(", btnClickCount=");
            sb.append(i);
            Log.m105924i("AdLandingFloatBarCompWrapper", sb.toString());
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$4");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$h */
    public class C95038h extends Handler {
        public C95038h(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$5");
            int i = message.what;
            if (i == 1) {
                AdLandingFloatBarCompWrapper.this.mo131503K(((Boolean) message.obj).booleanValue());
            } else if (i == 2) {
                AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper = AdLandingFloatBarCompWrapper.this;
                boolean booleanValue = ((Boolean) message.obj).booleanValue();
                adLandingFloatBarCompWrapper.getClass();
                SnsMethodCalculate.markStartTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                adLandingFloatBarCompWrapper.mo131502J(booleanValue, false);
                SnsMethodCalculate.markEndTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            }
            SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$i */
    public class C95039i implements Animation.AnimationListener {
        public C95039i() {
        }

        public void onAnimationEnd(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$6");
            Log.m105924i("AdLandingFloatBarCompWrapper", "mContentView onAnimationEnd() Gone ");
            if (!AdLandingFloatBarCompWrapper.m120780E(AdLandingFloatBarCompWrapper.this)) {
                View view = AdLandingFloatBarCompWrapper.this.f275799u;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$6");
        }

        public void onAnimationRepeat(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$6");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$6");
        }

        public void onAnimationStart(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$6");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$j */
    public class C95040j extends C101698b {
        public C95040j() {
        }

        public void onAnimationEnd(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$7");
            View view = AdLandingFloatBarCompWrapper.this.f275799u;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$7", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$7", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$7");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$k */
    public class C95041k implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C95098h0 f275824d;

        /* renamed from: e */
        public final /* synthetic */ Button f275825e;

        /* renamed from: f */
        public final /* synthetic */ View f275826f;

        public C95041k(C95098h0 h0Var, Button button, View view) {
            this.f275824d = h0Var;
            this.f275825e = button;
            this.f275826f = view;
        }

        public void onAnimationCancel(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$8");
            AdLandingFloatBarCompWrapper.m120781G(AdLandingFloatBarCompWrapper.this, false);
            SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$8");
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$8");
            AdLandingFloatBarCompWrapper.m120781G(AdLandingFloatBarCompWrapper.this, false);
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$8");
        }

        public void onAnimationRepeat(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$8");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$8");
        }

        public void onAnimationStart(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$8");
            Context context = AdLandingFloatBarCompWrapper.this.f275797s;
            if (context instanceof SnsAdNativeLandingPagesUI) {
                boolean D8 = ((SnsAdNativeLandingPagesUI) context).mo132496D8();
                if (!AdLandingFloatBarCompWrapper.m120782H(AdLandingFloatBarCompWrapper.this) && !D8) {
                    AdLandingFloatBarCompWrapper.m120781G(AdLandingFloatBarCompWrapper.this, false);
                    C95098h0 h0Var = this.f275824d;
                    if (h0Var instanceof C95144m0) {
                        C95144m0 m0Var = (C95144m0) h0Var;
                        m0Var.getClass();
                        SnsMethodCalculate.markStartTimeMs("setAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                        m0Var.f276154G = false;
                        SnsMethodCalculate.markEndTimeMs("setAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                    }
                    this.f275825e.setVisibility(0);
                    View view = this.f275826f;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$8", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$8", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (SnsAdNativeLandingPagesUI) AdLandingFloatBarCompWrapper.this.f275797s;
                    snsAdNativeLandingPagesUI.getClass();
                    SnsMethodCalculate.markStartTimeMs("isOnPause", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    boolean z = snsAdNativeLandingPagesUI.f277597n1;
                    SnsMethodCalculate.markEndTimeMs("isOnPause", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    if (!z) {
                        AdLandingFloatBarCompWrapper.this.f275785B.mo124360B();
                    }
                } else if (!AdLandingFloatBarCompWrapper.m120782H(AdLandingFloatBarCompWrapper.this) && AdLandingFloatBarCompWrapper.this.mo131507P()) {
                    View view3 = this.f275826f;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$8", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$8", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$8");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$l */
    public class C95042l implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C101287r f275828d;

        /* renamed from: e */
        public final /* synthetic */ Button f275829e;

        public C95042l(C101287r rVar, Button button) {
            this.f275828d = rVar;
            this.f275829e = button;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Drawable drawable;
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$9");
            if (!Util.isNullOrNil(this.f275828d.f296707S) && (drawable = this.f275829e.getCompoundDrawables()[0]) != null) {
                drawable.setColorFilter(C76577a.m92153d(AdLandingFloatBarCompWrapper.this.f276579d, C0966R.color.al6), PorterDuff.Mode.SRC_ATOP);
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$9");
        }
    }

    public AdLandingFloatBarCompWrapper(Context context, C101263e0 e0Var, ViewGroup viewGroup) {
        super(context, e0Var, viewGroup);
        boolean z = false;
        this.f275797s = context;
        this.f275784A = viewGroup;
        this.f275798t = e0Var;
        this.f275788E = e0Var.f296505k == 141;
        this.f275791H = e0Var.f296504j == 1 ? true : z;
        mo67238e();
        mo67240g();
        Log.m105924i("AdLandingFloatBarCompWrapper", "refreshView, cid=" + e0Var.f296495a + ", hash=" + hashCode());
        if ((context instanceof C0125s) && this.f275791H) {
            C950301 r5 = new IListener<SnsAdShowFloatCompEvent>((C0125s) context) {
                {
                    this.__eventId = 1394784535;
                }

                public boolean callback(IEvent iEvent) {
                    SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$1");
                    SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$1");
                    SnsAdShowFloatCompEvent.C92573a aVar = ((SnsAdShowFloatCompEvent) iEvent).f265132d;
                    boolean z = true;
                    if (aVar != null) {
                        int i = aVar.f265133a;
                        Context context = aVar.f265134b;
                        AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper = AdLandingFloatBarCompWrapper.this;
                        if (context != adLandingFloatBarCompWrapper.f275797s) {
                            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$1");
                        } else {
                            if (i == 0 && !AdLandingFloatBarCompWrapper.m120780E(adLandingFloatBarCompWrapper)) {
                                AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper2 = AdLandingFloatBarCompWrapper.this;
                                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                                boolean z2 = adLandingFloatBarCompWrapper2.f275788E;
                                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                                if (z2) {
                                    AdLandingFloatBarCompWrapper.this.mo131512W();
                                } else {
                                    AdLandingFloatBarCompWrapper.this.mo131503K(true);
                                }
                                AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper3 = AdLandingFloatBarCompWrapper.this;
                                SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                                adLandingFloatBarCompWrapper3.f275792I = true;
                                SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                            } else if (i == 1 && AdLandingFloatBarCompWrapper.m120780E(AdLandingFloatBarCompWrapper.this)) {
                                AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper4 = AdLandingFloatBarCompWrapper.this;
                                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                                boolean z3 = adLandingFloatBarCompWrapper4.f275788E;
                                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                                if (z3) {
                                    AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper5 = AdLandingFloatBarCompWrapper.this;
                                    if (!(adLandingFloatBarCompWrapper5.f275794K == null || adLandingFloatBarCompWrapper5.f275795L == null)) {
                                        AdLandingFloatBarCompWrapper.m120781G(adLandingFloatBarCompWrapper5, false);
                                        AdLandingFloatBarCompWrapper.this.f275795L.end();
                                        AdLandingFloatBarCompWrapper.this.f275794K.end();
                                    }
                                }
                                C119179t tVar = C119157j.f356862d;
                                C95080d dVar = new C95080d(this);
                                C119157j jVar = (C119157j) tVar;
                                jVar.getClass();
                                jVar.mo183892w(dVar, 100, false);
                                AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper6 = AdLandingFloatBarCompWrapper.this;
                                SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                                adLandingFloatBarCompWrapper6.f275792I = false;
                                SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                            }
                            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$1");
                            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$1");
                            return z;
                        }
                    } else {
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$1");
                    }
                    z = false;
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$1");
                    return z;
                }
            };
            this.f275790G = r5;
            r5.alive();
        }
    }

    /* renamed from: E */
    public static /* synthetic */ boolean m120780E(AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        boolean z = adLandingFloatBarCompWrapper.f275792I;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return z;
    }

    /* renamed from: G */
    public static /* synthetic */ boolean m120781G(AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        adLandingFloatBarCompWrapper.f275793J = z;
        SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return z;
    }

    /* renamed from: H */
    public static /* synthetic */ boolean m120782H(AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        boolean z = adLandingFloatBarCompWrapper.f275789F;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return z;
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        super.mo124360B();
        C95098h0 h0Var = this.f275785B;
        if (h0Var != null) {
            h0Var.mo124360B();
        }
        Log.m105924i("AdLandingFloatBarCompWrapper", "viewWillAppear");
        C95098h0 h0Var2 = this.f275785B;
        if ((h0Var2 instanceof AdLandingPageGetHBCoverBtnComp) && !((AdLandingPageGetHBCoverBtnComp) h0Var2).mo131625N().isEnabled()) {
            this.f275786C = false;
        }
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* renamed from: C */
    public void mo67235C() {
        IListener<SnsAdShowFloatCompEvent> iListener;
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        super.mo67235C();
        C95098h0 h0Var = this.f275785B;
        if (h0Var != null) {
            h0Var.mo67235C();
        }
        this.f275796M.removeCallbacksAndMessages((Object) null);
        if (this.f275791H && (iListener = this.f275790G) != null) {
            iListener.dead();
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        super.mo124361D();
        C95098h0 h0Var = this.f275785B;
        if (h0Var != null) {
            h0Var.mo124361D();
        }
        Log.m105924i("AdLandingFloatBarCompWrapper", "viewWillDisappear, exposureCount=" + mo131851j() + ", stayTime=" + mo131555o());
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* renamed from: I */
    public void mo131501I() {
        SnsMethodCalculate.markStartTimeMs("animationFloatBarExitSnsNativeUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (mo131506O()) {
            this.f275789F = true;
            Button button = null;
            C95098h0 h0Var = this.f275785B;
            if (h0Var instanceof C95108i0) {
                button = ((C95108i0) h0Var).mo131625N();
            } else if (h0Var instanceof C95144m0) {
                button = ((C95144m0) h0Var).mo131669h0();
            }
            if (!(button == null || this.f275785B.mo131855p() == null)) {
                button.clearAnimation();
                this.f275785B.mo131855p().clearAnimation();
                if (button.getVisibility() == 0) {
                    button.setVisibility(8);
                    this.f275785B.mo124361D();
                }
            }
            if (this.f275799u.getVisibility() == 0) {
                this.f275799u.clearAnimation();
                View view = this.f275799u;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "animationFloatBarExitSnsNativeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "animationFloatBarExitSnsNativeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo124361D();
            }
        } else if (this.f275791H) {
            SnsMethodCalculate.markStartTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            mo131502J(false, false);
            SnsMethodCalculate.markEndTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        } else {
            mo131504M(false, 0);
        }
        SnsMethodCalculate.markEndTimeMs("animationFloatBarExitSnsNativeUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* renamed from: J */
    public void mo131502J(boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (this.f275799u.getVisibility() == 0) {
            Log.m105924i("AdLandingFloatBarCompWrapper", "mContentView doHide ");
            View view = this.f275799u;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo124361D();
            this.f275799u.clearAnimation();
            if (z) {
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.5f);
                translateAnimation.setDuration(400);
                if (z2) {
                    View view2 = this.f275799u;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view3 = this.f275799u;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(Float.valueOf(1.0f));
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view3.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doHide", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    translateAnimation.setAnimationListener(new C95039i());
                } else {
                    translateAnimation.setAnimationListener(new C95040j());
                }
                this.f275799u.startAnimation(translateAnimation);
            }
        }
        SnsMethodCalculate.markEndTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* renamed from: K */
    public void mo131503K(boolean z) {
        SnsMethodCalculate.markStartTimeMs("doShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (this.f275799u.getVisibility() != 0) {
            Log.m105924i("AdLandingFloatBarCompWrapper", "mContentView doShow ");
            View view = this.f275799u;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "doShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo124360B();
            this.f275799u.clearAnimation();
            if (z) {
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.5f, 1, 0.0f);
                translateAnimation.setInterpolator(new OvershootInterpolator(1.0f));
                translateAnimation.setDuration(700);
                this.f275799u.startAnimation(translateAnimation);
            }
        }
        SnsMethodCalculate.markEndTimeMs("doShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* renamed from: M */
    public void mo131504M(boolean z, long j) {
        SnsMethodCalculate.markStartTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        SnsMethodCalculate.markStartTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (this.f275791H) {
            SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        } else {
            this.f275796M.removeCallbacksAndMessages((Object) null);
            this.f275796M.sendMessageDelayed(this.f275796M.obtainMessage(2, Boolean.valueOf(z)), j);
            SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        }
        SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* renamed from: N */
    public final void mo131505N() {
        SnsMethodCalculate.markStartTimeMs("hideViews", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        C95098h0 h0Var = this.f275785B;
        Button N = h0Var instanceof C95108i0 ? ((C95108i0) h0Var).mo131625N() : h0Var instanceof C95144m0 ? ((C95144m0) h0Var).mo131669h0() : null;
        if (N != null) {
            N.setVisibility(8);
        }
        View view = this.f275799u;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("hideViews", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* renamed from: O */
    public boolean mo131506O() {
        SnsMethodCalculate.markStartTimeMs("isAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        boolean z = this.f275788E;
        SnsMethodCalculate.markEndTimeMs("isAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return z;
    }

    /* renamed from: P */
    public boolean mo131507P() {
        SnsMethodCalculate.markStartTimeMs("isForHalfScreenType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        C101263e0 e0Var = this.f275798t;
        boolean z = false;
        if (e0Var == null) {
            SnsMethodCalculate.markEndTimeMs("isForHalfScreenType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return false;
        }
        if (e0Var.f296504j == 2) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isForHalfScreenType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return z;
    }

    /* renamed from: Q */
    public boolean mo131508Q() {
        SnsMethodCalculate.markStartTimeMs("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        boolean z = true;
        if (mo131506O()) {
            Button button = null;
            C95098h0 h0Var = this.f275785B;
            if (h0Var instanceof C95108i0) {
                button = ((C95108i0) h0Var).mo131625N();
            } else if (h0Var instanceof C95144m0) {
                button = ((C95144m0) h0Var).mo131669h0();
            }
            if ((button == null || button.getVisibility() != 0) && this.f275799u.getVisibility() != 0) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return z;
        }
        if (this.f275799u.getVisibility() != 0) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        return z;
    }

    /* renamed from: R */
    public final void mo131509R(C95098h0 h0Var, View view, Button button, C101287r rVar, float f, int i, int i2) {
        View view2 = view;
        Button button2 = button;
        C101287r rVar2 = rVar;
        int i3 = i;
        int i4 = i2;
        SnsMethodCalculate.markStartTimeMs("playEnterSnsAdNativeAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        AnimatorSet animatorSet = this.f275794K;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f275794K = animatorSet2;
        animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationY", new float[]{f, 0.0f});
        ofFloat.setDuration(300);
        ofFloat.setStartDelay(1000);
        this.f275793J = true;
        ofFloat.addListener(new C95041k(h0Var, button2, view2));
        ofFloat.addUpdateListener(new C95042l(rVar2, button2));
        ObjectAnimator ofInt = ObjectAnimator.ofInt((GradientDrawable) button.getBackground(), "color", new int[]{C76577a.m92153d(this.f276579d, C0966R.color.BW_0_Alpha_0_2), Color.parseColor(rVar2.f296695G)});
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.setDuration(500);
        ofInt.setStartDelay(1000);
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(button2, "textColor", new int[]{C76577a.m92153d(this.f276579d, C0966R.color.al6), Color.parseColor(rVar2.f296691C)});
        ofInt2.setEvaluator(new ArgbEvaluator());
        ofInt2.setDuration(500);
        ofInt2.setStartDelay(1000);
        ofInt2.addUpdateListener(new C95031a(this, rVar2, button2));
        AnimatorSet animatorSet3 = this.f275795L;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        this.f275795L = new AnimatorSet();
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f275799u, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "translationX", new float[]{0.0f, (float) (((this.f276588p - i3) / 2) - C76577a.m92151b(this.f276579d, 28))});
        ValueAnimator ofInt3 = ValueAnimator.ofInt(new int[]{C76577a.m92151b(this.f276579d, 190), i3});
        ValueAnimator ofInt4 = ValueAnimator.ofInt(new int[]{C76577a.m92151b(this.f276579d, 40), i4});
        ofInt3.addUpdateListener(new C95032b(view2, rVar2, button2));
        ofInt4.addUpdateListener(new C95033c(this, view2));
        this.f275795L.play(ofFloat2).with(ofFloat3).with(ofInt3).with(ofInt4);
        this.f275795L.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f275795L.setDuration(1000);
        this.f275795L.setStartDelay(1500);
        this.f275795L.addListener(new C95034d(view2, i3, i4));
        this.f275794K.play(ofInt).with(ofInt2).after(ofFloat).before(this.f275795L);
        this.f275794K.start();
        SnsMethodCalculate.markEndTimeMs("playEnterSnsAdNativeAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* renamed from: U */
    public void mo131510U(boolean z, long j) {
        SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (this.f275791H) {
            SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return;
        }
        this.f275796M.removeCallbacksAndMessages((Object) null);
        this.f275796M.sendMessageDelayed(this.f275796M.obtainMessage(1, Boolean.valueOf(z)), j);
        SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* renamed from: V */
    public void mo131511V() {
        SnsMethodCalculate.markStartTimeMs("showAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (this.f275791H) {
            if (!this.f275792I) {
                SnsMethodCalculate.markEndTimeMs("showAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                return;
            } else if (this.f275793J) {
                SnsMethodCalculate.markEndTimeMs("showAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                return;
            }
        }
        try {
            mo131513X();
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (SnsAdNativeLandingPagesUI) this.f275797s;
            snsAdNativeLandingPagesUI.getClass();
            SnsMethodCalculate.markStartTimeMs("isOnPause", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            boolean z = snsAdNativeLandingPagesUI.f277597n1;
            SnsMethodCalculate.markEndTimeMs("isOnPause", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (!z) {
                mo124360B();
            }
        } catch (Throwable th) {
            Log.m105920e("AdLandingFloatBarCompWrapper", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("showAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* renamed from: W */
    public void mo131512W() {
        SnsMethodCalculate.markStartTimeMs("showAnimationFloatBarWithAnim", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (!mo131506O()) {
            Log.m105924i("AdLandingFloatBarCompWrapper", "this is an old floatBarViewWrapper, isAnimationFloatBar: " + this.f275788E);
            SnsMethodCalculate.markEndTimeMs("showAnimationFloatBarWithAnim", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return;
        }
        Button button = null;
        C95098h0 h0Var = this.f275785B;
        if (h0Var instanceof C95108i0) {
            button = ((C95108i0) h0Var).mo131625N();
        } else if (h0Var instanceof C95144m0) {
            C95144m0 m0Var = (C95144m0) h0Var;
            m0Var.getClass();
            SnsMethodCalculate.markStartTimeMs("setAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            m0Var.f276154G = true;
            SnsMethodCalculate.markEndTimeMs("setAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            button = m0Var.mo131669h0();
        }
        Button button2 = button;
        if (button2 == null) {
            Log.m105920e("AdLandingFloatBarCompWrapper", "button is null");
            SnsMethodCalculate.markEndTimeMs("showAnimationFloatBarWithAnim", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return;
        }
        View p = this.f275785B.mo131855p();
        if (p == null) {
            Log.m105920e("AdLandingFloatBarCompWrapper", "btnView is null");
            SnsMethodCalculate.markEndTimeMs("showAnimationFloatBarWithAnim", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return;
        }
        C101255a0 a0Var = this.f275798t.f296572K;
        if (!(a0Var instanceof C101287r)) {
            Log.m105920e("AdLandingFloatBarCompWrapper", "btnInfo is not instanceof AdLandingPageCompentBtnInfo");
            SnsMethodCalculate.markEndTimeMs("showAnimationFloatBarWithAnim", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return;
        }
        C101287r rVar = (C101287r) a0Var;
        if (rVar == null) {
            Log.m105920e("AdLandingFloatBarCompWrapper", "info is null");
            SnsMethodCalculate.markEndTimeMs("showAnimationFloatBarWithAnim", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return;
        }
        try {
            int i = (int) rVar.f296501g;
            float f = rVar.f296508n;
            if (((int) f) == 0) {
                f = rVar.f296502h;
            }
            int i2 = (int) f;
            this.f275803y.removeView(p);
            View view = this.f275799u;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "showAnimationFloatBarWithAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "showAnimationFloatBarWithAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = this.f275799u;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "showAnimationFloatBarWithAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "showAnimationFloatBarWithAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(C76577a.m92153d(this.f276579d, C0966R.color.BW_0_Alpha_0_2));
            float f2 = rVar.f296706R;
            if (f2 > 0.0f) {
                gradientDrawable.setCornerRadius(f2);
            }
            button2.setBackground(gradientDrawable);
            button2.setTextColor(C76577a.m92153d(this.f276579d, C0966R.color.al6));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C76577a.m92151b(this.f276579d, 190), C76577a.m92151b(this.f276579d, 40));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = C76577a.m92151b(this.f275797s, 58);
            this.f275784A.addView(p, layoutParams);
            button2.setVisibility(8);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(p, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "showAnimationFloatBarWithAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(p, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "showAnimationFloatBarWithAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            button2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            mo131509R(this.f275785B, p, button2, rVar, (float) layoutParams.bottomMargin, i, i2);
        } catch (Throwable th) {
            Log.m105920e("AdLandingFloatBarCompWrapper", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("showAnimationFloatBarWithAnim", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* renamed from: X */
    public final void mo131513X() {
        SnsMethodCalculate.markStartTimeMs("showViews", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        C95098h0 h0Var = this.f275785B;
        Button N = h0Var instanceof C95108i0 ? ((C95108i0) h0Var).mo131625N() : h0Var instanceof C95144m0 ? ((C95144m0) h0Var).mo131669h0() : null;
        if (N != null) {
            N.setVisibility(0);
        }
        View view = this.f275799u;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "showViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "showViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("showViews", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        View inflate = LayoutInflater.from(this.f275797s).inflate(C0966R.C0971layout.f359993c14, this.f275784A, false);
        this.f275799u = inflate;
        this.f275800v = (ImageView) inflate.findViewById(C0966R.C0970id.eag);
        this.f275801w = (TextView) inflate.findViewById(C0966R.C0970id.eai);
        this.f275802x = (TextView) inflate.findViewById(C0966R.C0970id.eaf);
        this.f275803y = (FrameLayout) inflate.findViewById(C0966R.C0970id.eac);
        ((RoundedCornerFrameLayout) inflate.findViewById(C0966R.C0970id.ea_)).setRadius((float) C76577a.m92151b(this.f275797s, 8));
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) inflate.findViewById(C0966R.C0970id.eaa);
        this.f275804z = roundedCornerFrameLayout;
        roundedCornerFrameLayout.setRadius((float) C76577a.m92151b(this.f275797s, 4));
        this.f275784A.addView(this.f275799u);
        if (this.f275788E) {
            ViewGroup.LayoutParams layoutParams = this.f275799u.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = C76577a.m92151b(this.f275797s, 42);
                this.f275799u.setLayoutParams(layoutParams2);
            }
        }
        View view = this.f275799u;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        if (!TextUtils.isEmpty(this.f275798t.f296563B)) {
            C101263e0 e0Var = this.f275798t;
            String str = e0Var.f296563B;
            C100891r.m132208c(str, false, e0Var.f296496b, 0, new C95035e(str));
        } else {
            this.f275804z.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f275798t.f296564C)) {
            this.f275801w.setText(this.f275798t.f296564C);
            this.f275801w.setVisibility(0);
        } else {
            this.f275801w.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f275798t.f296565D)) {
            this.f275802x.setText(this.f275798t.f296565D);
            this.f275802x.setVisibility(0);
        } else {
            this.f275802x.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f275798t.f296562A)) {
            try {
                this.f275799u.setBackgroundColor(Color.parseColor(this.f275798t.f296562A));
            } catch (Exception e) {
                Log.m105920e("AdLandingFloatBarCompWrapper", "refreshView backgroundColor, exp=" + e.toString() + ", color=" + this.f275798t.f296562A);
            }
        } else if (!TextUtils.isEmpty(this.f275798t.f296573z)) {
            C101263e0 e0Var2 = this.f275798t;
            C100891r.m132208c(e0Var2.f296573z, false, e0Var2.f296496b, 0, new C95036f());
        }
        if (!TextUtils.isEmpty(this.f275798t.f296566E)) {
            try {
                this.f275801w.setTextColor(Color.parseColor(this.f275798t.f296566E));
            } catch (Exception e2) {
                Log.m105920e("AdLandingFloatBarCompWrapper", "refreshView titleColor, exp=" + e2.toString() + ", color=" + this.f275798t.f296566E);
            }
        }
        if (!TextUtils.isEmpty(this.f275798t.f296567F)) {
            try {
                this.f275802x.setTextColor(Color.parseColor(this.f275798t.f296567F));
            } catch (Exception e3) {
                Log.m105920e("AdLandingFloatBarCompWrapper", "refreshView descColor, exp=" + e3.toString() + ", color=" + this.f275798t.f296567F);
            }
        }
        this.f275803y.removeAllViews();
        C95295z a = C96328z2.m123559a(this.f275797s, this.f275798t.f296572K, this.f275803y, 0);
        if (a instanceof C95098h0) {
            this.f275785B = (C95098h0) a;
        } else {
            Log.m105920e("AdLandingFloatBarCompWrapper", "btnComp=" + a);
        }
        Button button = null;
        C95098h0 h0Var = this.f275785B;
        if (h0Var != null) {
            if (h0Var instanceof C95108i0) {
                SnsMethodCalculate.markStartTimeMs("setAutoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
                ((C95108i0) h0Var).f276031z = true;
                SnsMethodCalculate.markEndTimeMs("setAutoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            } else if (h0Var instanceof C95144m0) {
                SnsMethodCalculate.markStartTimeMs("setAutoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                ((C95144m0) h0Var).f276161N = true;
                SnsMethodCalculate.markEndTimeMs("setAutoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            }
            View p = this.f275785B.mo131855p();
            C95098h0 h0Var2 = this.f275785B;
            if (h0Var2 instanceof C95108i0) {
                button = (Button) p.findViewById(C0966R.C0970id.jq_);
            } else if (h0Var2 instanceof C95144m0) {
                button = (Button) p.findViewById(C0966R.C0970id.c9o);
            }
            if (button != null) {
                button.setMaxLines(1);
                C103733h.m138105b(button, 1, (int) button.getTextSize(), 1, 0);
            }
            this.f275803y.addView(p);
        }
        this.f275786C = this.f275798t.f296568G;
        this.f275799u.setOnClickListener(new C95037g());
        if (!this.f275791H && !mo131507P()) {
            mo131512W();
        } else if (this.f275788E) {
            mo131505N();
        } else {
            View view = this.f275799u;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "fillItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper", "fillItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        boolean z = true;
        if (this.f275798t == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("kvReport, mFloatBarInfo==null?");
            if (this.f275798t != null) {
                z = false;
            }
            sb.append(z);
            Log.m105920e("AdLandingFloatBarCompWrapper", sb.toString());
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return false;
        } else if (!super.mo118822v(jSONObject)) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            return false;
        } else {
            try {
                jSONObject.put("clickCount", this.f275787D);
                Log.m105924i("AdLandingFloatBarCompWrapper", "kv=" + jSONObject.toString());
                SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                return true;
            } catch (Exception e) {
                Log.printErrStackTrace("AdLandingFloatBarCompWrapper", e, "", new Object[0]);
                SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                return false;
            }
        }
    }
}
