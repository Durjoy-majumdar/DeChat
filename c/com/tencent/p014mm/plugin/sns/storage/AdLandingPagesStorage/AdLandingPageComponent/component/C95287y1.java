package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.C115750SphereImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import p1208q3.C118144a;
import qs2.C101296v;
import sn0.C90259e;
import zs2.C103069a;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y1 */
public class C95287y1 extends C95295z {

    /* renamed from: A */
    public boolean f276558A = false;

    /* renamed from: B */
    public boolean f276559B = false;

    /* renamed from: C */
    public MMHandler f276560C = new C95289b(Looper.getMainLooper());

    /* renamed from: D */
    public C115750SphereImageView.C115754e f276561D = new C95290c();

    /* renamed from: E */
    public boolean f276562E = true;

    /* renamed from: s */
    public C115750SphereImageView f276563s;

    /* renamed from: t */
    public ProgressBar f276564t;

    /* renamed from: u */
    public View f276565u;

    /* renamed from: v */
    public ImageView f276566v;

    /* renamed from: w */
    public boolean f276567w = true;

    /* renamed from: x */
    public C103069a f276568x;

    /* renamed from: y */
    public Context f276569y;

    /* renamed from: z */
    public int f276570z;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y1$a */
    public class C95288a implements C103069a.C103074e {
        public C95288a() {
        }

        /* renamed from: a */
        public void mo131835a(boolean z, String str, Bitmap bitmap, String str2) {
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$1");
            Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "ImageLoader onFinish, isSucc=" + z + ", errInfo=" + str);
            C95287y1.this.f276563s.mo176087j(bitmap, str2);
            if (!z) {
                C95287y1 y1Var = C95287y1.this;
                y1Var.getClass();
                SnsMethodCalculate.markStartTimeMs("stopLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
                y1Var.f276564t.setVisibility(8);
                SnsMethodCalculate.markEndTimeMs("stopLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
            }
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$1");
        }

        /* renamed from: b */
        public void mo131836b(String str) {
            SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$1");
            Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "ImageLoader onStart");
            Bitmap b = C103069a.m136314b(str, "scene_ad_landing");
            if (b != null) {
                C95287y1.this.f276566v.setImageBitmap(b);
                C95287y1.this.f276566v.setVisibility(0);
            } else {
                C95287y1 y1Var = C95287y1.this;
                y1Var.getClass();
                SnsMethodCalculate.markStartTimeMs("startLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
                y1Var.f276564t.setVisibility(0);
                SnsMethodCalculate.markEndTimeMs("startLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
            }
            SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y1$b */
    public class C95289b extends MMHandler {
        public C95289b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$2");
            C95287y1.this.mo131834G("com.tencent.mm.adlanding.sphereimage.next_page_view_alpha_none");
            C95287y1.this.f276559B = false;
            SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y1$c */
    public class C95290c implements C115750SphereImageView.C115754e {

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y1$c$a */
        public class C95291a implements Animation.AnimationListener {
            public C95291a() {
            }

            public void onAnimationEnd(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$1");
                C95287y1.this.f276566v.setVisibility(8);
                C95287y1.this.f276566v.setImageDrawable((Drawable) null);
                View view = C95287y1.this.f276565u;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSphereImageComponent$3$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSphereImageComponent$3$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(C95287y1.this.f276565u, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(400);
                ofFloat.start();
                SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$1");
            }

            public void onAnimationRepeat(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$1");
                SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$1");
            }

            public void onAnimationStart(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$1");
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y1$c$b */
        public class C95292b implements Runnable {

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y1$c$b$a */
            public class C95293a implements Animation.AnimationListener {
                public C95293a() {
                }

                public void onAnimationEnd(Animation animation) {
                    SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$2$1");
                    Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "hide rollTipView");
                    View view = C95287y1.this.f276565u;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSphereImageComponent$3$2$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSphereImageComponent$3$2$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C95287y1.this.mo131834G("com.tencent.mm.adlanding.sphereimage.next_page_view_show");
                    C95287y1.this.f276559B = false;
                    SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$2$1");
                }

                public void onAnimationRepeat(Animation animation) {
                    SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$2$1");
                    SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$2$1");
                }

                public void onAnimationStart(Animation animation) {
                    SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$2$1");
                    SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$2$1");
                }
            }

            public C95292b() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$2");
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300);
                alphaAnimation.setAnimationListener(new C95293a());
                C95287y1.this.f276565u.startAnimation(alphaAnimation);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$2");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y1$c$c */
        public class C95294c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ long f276577d;

            public C95294c(long j) {
                this.f276577d = j;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$3");
                C95287y1.this.f276563s.mo176088k();
                C95287y1.this.f276563s.mo176044d();
                String str = C95287y1.this.mo131833E().f296751A;
                if (!C103069a.m136315c(str, "scene_ad_landing")) {
                    Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "do shoot");
                    C103069a.m136317f(C95287y1.this.f276563s, str, "scene_ad_landing");
                }
                Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "enable sensor after shoot");
                C95287y1.this.f276563s.setSensorEnabled(true);
                Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "enable touch, delay=" + this.f276577d);
                C95287y1.this.f276563s.setTouchEnabled(true);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3$3");
            }
        }

        public C95290c() {
        }

        /* renamed from: a */
        public void mo131837a() {
            SnsMethodCalculate.markStartTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3");
            Log.m105918d("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", C90259e.C90264e.NAME);
            C95287y1.this.f276560C.removeMessages(1);
            C95287y1.this.f276560C.sendEmptyMessageDelayed(1, 3000);
            C95287y1 y1Var = C95287y1.this;
            SnsMethodCalculate.markStartTimeMs("access$008", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
            y1Var.f276570z++;
            SnsMethodCalculate.markEndTimeMs("access$008", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
            SnsMethodCalculate.markEndTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3");
        }

        /* renamed from: b */
        public void mo131838b(String str) {
            SnsMethodCalculate.markStartTimeMs("onUpdateImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3");
            Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "onUpdateImage, isFirstShow=" + C95287y1.this.f276567w);
            C95287y1 y1Var = C95287y1.this;
            y1Var.getClass();
            SnsMethodCalculate.markStartTimeMs("stopLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
            y1Var.f276564t.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("stopLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
            if (C95287y1.this.f276566v.getVisibility() == 0) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300);
                alphaAnimation.setAnimationListener(new C95291a());
                C95287y1.this.f276566v.startAnimation(alphaAnimation);
            }
            C95287y1 y1Var2 = C95287y1.this;
            if (y1Var2.f276567w) {
                y1Var2.f276567w = false;
                y1Var2.f276560C.postDelayed(new C95292b(), 2500);
                long j = (long) C95287y1.this.mo131833E().f296753z;
                if (j < 800) {
                    j = 800;
                }
                C95287y1.this.f276560C.postDelayed(new C95294c(j), j);
            } else {
                Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "enable sensor, isFirstShow=false");
                C95287y1.this.f276563s.setSensorEnabled(true);
            }
            SnsMethodCalculate.markEndTimeMs("onUpdateImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3");
        }

        /* renamed from: c */
        public void mo131839c() {
            SnsMethodCalculate.markStartTimeMs("onTouchBegin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3");
            Log.m105918d("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "onTouchBegin, isRoating=" + C95287y1.this.f276559B);
            C95287y1 y1Var = C95287y1.this;
            if (!y1Var.f276559B) {
                y1Var.mo131834G("com.tencent.mm.adlanding.sphereimage.next_page_view_alpha_half");
                C95287y1.this.f276559B = true;
            }
            C95287y1.this.f276560C.removeMessages(1);
            SnsMethodCalculate.markEndTimeMs("onTouchBegin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3");
        }

        /* renamed from: d */
        public void mo131840d() {
            SnsMethodCalculate.markStartTimeMs("onAngleChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3");
            C95287y1 y1Var = C95287y1.this;
            if (!y1Var.f276559B) {
                y1Var.mo131834G("com.tencent.mm.adlanding.sphereimage.next_page_view_alpha_half");
                C95287y1.this.f276559B = true;
                Log.m105918d("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "onAngleChange");
            }
            C95287y1.this.f276560C.removeMessages(1);
            C95287y1.this.f276560C.sendEmptyMessageDelayed(1, 3000);
            SnsMethodCalculate.markEndTimeMs("onAngleChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3");
        }

        public void onDetachedFromWindow() {
            SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3");
            SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent$3");
        }
    }

    public C95287y1(Context context, C101296v vVar, ViewGroup viewGroup) {
        super(context, vVar, viewGroup);
        this.f276569y = context;
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        super.mo124360B();
        Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "viewWillAppear, isFirstApper=" + this.f276562E);
        if (!this.f276562E) {
            this.f276563s.setSensorEnabled(true);
            if (!this.f276559B) {
                mo131834G("com.tencent.mm.adlanding.sphereimage.next_page_view_alpha_half");
                this.f276559B = true;
            }
            this.f276560C.removeMessages(1);
            this.f276560C.sendEmptyMessageDelayed(1, 3000);
        } else {
            this.f276562E = false;
        }
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        super.mo67235C();
        Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "viewWillDestroy, disable sensor");
        this.f276563s.setSensorEnabled(false);
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        super.mo124361D();
        Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "viewWillDisappear, disable sensor");
        this.f276563s.setSensorEnabled(false);
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
    }

    /* renamed from: E */
    public C101296v mo131833E() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        C101296v vVar = (C101296v) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        return vVar;
    }

    /* renamed from: G */
    public void mo131834G(String str) {
        SnsMethodCalculate.markStartTimeMs("notifyNextPageBtnStateChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        SnsMethodCalculate.markStartTimeMs("isFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        SnsMethodCalculate.markEndTimeMs("isFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        Context context = this.f276569y;
        SnsMethodCalculate.markStartTimeMs("sendLocalBroadcast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        C118144a.m166672a(context).mo182944c(new Intent(str));
        SnsMethodCalculate.markEndTimeMs("sendLocalBroadcast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        SnsMethodCalculate.markEndTimeMs("notifyNextPageBtnStateChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        this.f276563s = (C115750SphereImageView) this.f276586n.findViewById(C0966R.C0970id.jzd);
        this.f276564t = (ProgressBar) this.f276586n.findViewById(C0966R.C0970id.i89);
        this.f276565u = this.f276586n.findViewById(C0966R.C0970id.kml);
        this.f276566v = (ImageView) this.f276586n.findViewById(C0966R.C0970id.gos);
        this.f276563s.setEventListener(this.f276561D);
        this.f276563s.mo176086i(2.0f, 30.0f, -4.0f);
        this.f276563s.setTouchSensitivity(0.35f);
        this.f276563s.setSensorEnabled(false);
        Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "createView, hash=" + this.f276563s.hashCode());
        this.f276563s.setTouchEnabled(false);
        Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "disable touch init");
        C103069a aVar = new C103069a();
        this.f276568x = aVar;
        C95288a aVar2 = new C95288a();
        SnsMethodCalculate.markStartTimeMs("setOnLoadListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        aVar.f304112a = aVar2;
        SnsMethodCalculate.markEndTimeMs("setOnLoadListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        try {
            if (!(this.f276586n == null || this.f276563s == null)) {
                if (this.f276564t != null) {
                    if (mo131833E() == null) {
                        Log.m105920e("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "fillItem, getInfo==null");
                        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
                        return;
                    }
                    String str = mo131833E().f296751A;
                    String str2 = mo131833E().f296752B;
                    float f = mo131833E().f296508n;
                    float f2 = mo131833E().f296507m;
                    mo131833E().getClass();
                    this.f276558A = false;
                    Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "fillItem， server.w=" + f2 + ", h=" + f + ", screen.w=" + this.f276588p + ", h=" + this.f276589q);
                    ViewGroup.LayoutParams layoutParams = this.f276563s.getLayoutParams();
                    if (f == 0.0f || f2 == 0.0f) {
                        layoutParams.width = this.f276588p;
                        layoutParams.height = this.f276589q;
                        this.f276558A = true;
                    } else {
                        float f3 = (float) ((this.f276588p - ((int) mo131833E().f296499e)) - ((int) mo131833E().f296500f));
                        if (f2 >= f3) {
                            f2 = f3;
                        }
                        int i = (int) f2;
                        layoutParams.width = i;
                        int i2 = (int) ((mo131833E().f296508n * f2) / mo131833E().f296507m);
                        layoutParams.height = i2;
                        if (i >= this.f276588p && i2 >= this.f276589q) {
                            this.f276558A = true;
                        }
                    }
                    this.f276563s.setLayoutParams(layoutParams);
                    ViewGroup.LayoutParams layoutParams2 = this.f276566v.getLayoutParams();
                    layoutParams2.width = layoutParams.width;
                    layoutParams2.height = layoutParams.height;
                    this.f276566v.setLayoutParams(layoutParams2);
                    if (str2 != null && str2.length() > 0) {
                        try {
                            this.f276586n.setBackgroundColor(Color.parseColor(str2));
                        } catch (Exception e) {
                            Log.m105920e("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "parseColor exp:" + e.toString());
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        Log.m105920e("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "fillItem, imageUrl is empty");
                        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
                        return;
                    }
                    Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "fillItem, loadImage isFullScreen=" + this.f276558A);
                    this.f276568x.mo142780e(str, layoutParams.width, layoutParams.height, "scene_ad_landing");
                    SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
                    return;
                }
            }
            Log.m105920e("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "fillItem, view==null");
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        } catch (Exception e2) {
            Log.m105920e("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "fillItem exp=" + e2.toString());
        }
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        return C0966R.C0971layout.c1j;
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        if (!super.mo118822v(jSONObject)) {
            Log.m105920e("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "setComponentKVReportData super failed");
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
            return false;
        }
        try {
            jSONObject.put("panCount", this.f276570z);
            Log.m105924i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "setComponentKVReportData json=" + jSONObject.toString());
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
            return true;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "setComponentKVReportData exp=" + e.toString());
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
            return false;
        }
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        ViewGroup.LayoutParams layoutParams = this.f276586n.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins((int) mo131833E().f296499e, (int) mo131833E().f296497c, (int) mo131833E().f296500f, (int) mo131833E().f296498d);
            this.f276586n.setLayoutParams(marginLayoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
    }
}
