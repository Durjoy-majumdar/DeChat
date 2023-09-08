package com.tencent.p014mm.plugin.luckymoney.model;

import a70.C112760b;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.autogen.events.WxPayLuckMoneyNewYearDownloadPAGResultEvent;
import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import org.libpag.PAGView;
import p1081gi.C98124g;
import p663qo.C77384i;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.g1 */
public class C69218g1 {

    /* renamed from: a */
    public static final String f199176a = (C112760b.m154225d() + "luckymoneynewyear/");

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.g1$d */
    public class C4830d implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f19906a;

        public C4830d(View view) {
            this.f19906a = view;
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            View view = this.f19906a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyNewYearLogic$4", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyNewYearLogic$4", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.g1$e */
    public class C4831e implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f19907a;

        public C4831e(View view) {
            this.f19907a = view;
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            View view = this.f19907a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyNewYearLogic$5", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyNewYearLogic$5", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.g1$f */
    public class C4832f implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f19908a;

        /* renamed from: b */
        public final /* synthetic */ int f19909b;

        public C4832f(View view, int i) {
            this.f19908a = view;
            this.f19909b = i;
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            View view = this.f19908a;
            int i = this.f19909b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyNewYearLogic$6", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyNewYearLogic$6", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.g1$g */
    public class C4833g implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f19910a;

        /* renamed from: b */
        public final /* synthetic */ int f19911b;

        public C4833g(View view, int i) {
            this.f19910a = view;
            this.f19911b = i;
        }

        public void onAnimationEnd(Animation animation) {
            View view = this.f19910a;
            int i = this.f19911b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyNewYearLogic$7", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyNewYearLogic$7", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.g1$a */
    public class C69219a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ PAGView f199177d;

        /* renamed from: e */
        public final /* synthetic */ String f199178e;

        /* renamed from: com.tencent.mm.plugin.luckymoney.model.g1$a$a */
        public class C69220a implements Animation.AnimationListener {
            public C69220a(C69219a aVar) {
            }

            public void onAnimationEnd(Animation animation) {
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        public C69219a(PAGView pAGView, String str) {
            this.f199177d = pAGView;
            this.f199178e = str;
        }

        public void run() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(500);
            this.f199177d.startAnimation(alphaAnimation);
            alphaAnimation.setAnimationListener(new C69220a(this));
            this.f199177d.setPath(this.f199178e);
            this.f199177d.stop();
            this.f199177d.flush();
            this.f199177d.play();
            this.f199177d.setVisibility(0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.g1$b */
    public class C69221b implements Animation.AnimationListener {
        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.g1$c */
    public class C69222c implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ PAGView f199179a;

        public C69222c(PAGView pAGView) {
            this.f199179a = pAGView;
        }

        public void onAnimationEnd(Animation animation) {
            this.f199179a.setVisibility(8);
            this.f199179a.stop();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.g1$h */
    public class C69223h implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f199180a;

        /* renamed from: b */
        public final /* synthetic */ ScaleAnimation f199181b;

        public C69223h(View view, ScaleAnimation scaleAnimation) {
            this.f199180a = view;
            this.f199181b = scaleAnimation;
        }

        public void onAnimationEnd(Animation animation) {
            this.f199180a.startAnimation(this.f199181b);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: a */
    public static boolean m81554a() {
        String e = m81558e();
        Log.m105925i("MicroMsg.LuckyMoneyNewYearLogic", "checkPAGAnimResource: %s", e);
        if (!C86013q1.m106450k(e)) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearLogic", "targetPath is not exist");
            return false;
        }
        C86009m1[] u = new C86009m1(e).mo119984u();
        if (u == null || u.length <= 0) {
            Log.m105925i("MicroMsg.LuckyMoneyNewYearLogic", "targetPath empty: %s", e);
            return false;
        }
        Log.m105925i("MicroMsg.LuckyMoneyNewYearLogic", "targetPath has size : %s", Integer.valueOf(u.length));
        return true;
    }

    /* renamed from: b */
    public static void m81555b(String str, String str2) {
        int i;
        String str3 = C69266u0.f199336d;
        boolean z = false;
        Log.m105925i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "downnloadPAGAnimResource fileId：%s aesKey:%s", str, str2);
        if (Util.isNullOrNil(str)) {
            i = -1;
        } else {
            C115669n.INSTANCE.mo175911u(991, 26);
            CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
            String str4 = f199176a + "pagResource" + ".zip";
            c2CDownloadRequest.url = str;
            c2CDownloadRequest.fileKey = str;
            c2CDownloadRequest.bizid = 3;
            c2CDownloadRequest.apptype = 266;
            c2CDownloadRequest.fileType = 20303;
            c2CDownloadRequest.setSavePath(str4);
            long nowMilliSecond = Util.nowMilliSecond();
            c2CDownloadRequest.taskStartTime = nowMilliSecond;
            Log.m105925i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download beginTime: %s", Long.valueOf(nowMilliSecond));
            i = CdnLogic.startSNSDownload(c2CDownloadRequest, (CdnLogic.VideoStreamingCallback) null, new C69265t0(nowMilliSecond, str, str4, str2), 0);
        }
        Log.m105925i("MicroMsg.LuckyMoneyNewYearLogic", "downloadRet:%s", Integer.valueOf(i));
        WxPayLuckMoneyNewYearDownloadPAGResultEvent wxPayLuckMoneyNewYearDownloadPAGResultEvent = new WxPayLuckMoneyNewYearDownloadPAGResultEvent();
        WxPayLuckMoneyNewYearDownloadPAGResultEvent.C67833a aVar = wxPayLuckMoneyNewYearDownloadPAGResultEvent.f194107d;
        if (i == 0) {
            z = true;
        }
        aVar.f194108a = z;
        wxPayLuckMoneyNewYearDownloadPAGResultEvent.publish();
        if (i == 0) {
            C115669n.INSTANCE.mo175911u(991, 27);
        } else {
            C115669n.INSTANCE.mo175911u(991, 28);
        }
    }

    /* renamed from: c */
    public static boolean m81556c(String str, String str2, C55384i iVar) {
        C98124g gVar = new C98124g();
        gVar.field_mediaId = "VoiceData" + str2;
        StringBuilder sb = new StringBuilder();
        sb.append(f199176a + "voice" + "/");
        sb.append(str2);
        String sb4 = sb.toString();
        gVar.field_fullpath = sb4;
        gVar.field_fileType = 15;
        gVar.field_aesKey = str2;
        gVar.field_fileId = str;
        gVar.field_chattype = 0;
        Log.m105925i("MicroMsg.LuckyMoneyNewYearLogic", "downloadVoiceFile %s %s %s", gVar.field_mediaId, sb4, str2);
        return ((C77384i) C86312j.m106911c(C77384i.class)).mo107504hs(gVar, new WeakReference(iVar)) != null;
    }

    /* renamed from: d */
    public static String m81557d(String str, String str2) {
        String str3 = f199176a + "pagResource" + "/" + str + str2 + ".pag";
        Log.m105925i("MicroMsg.LuckyMoneyNewYearLogic", "getPAGAnimResource :%s", str3);
        if (C86013q1.m106450k(str3)) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearLogic", "getPAGAnimResource succ");
            return str3;
        }
        Log.m105924i("MicroMsg.LuckyMoneyNewYearLogic", "getPAGAnimResource fail");
        return "";
    }

    /* renamed from: e */
    public static String m81558e() {
        return f199176a + "pagResource";
    }

    /* renamed from: f */
    public static void m81559f(View view, Animation.AnimationListener animationListener) {
        View view2 = view;
        Animation.AnimationListener animationListener2 = animationListener;
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 0.96f, 0.0f, 0.96f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300);
        scaleAnimation.setInterpolator(new OvershootInterpolator(1.0f));
        scaleAnimation.setFillAfter(true);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.96f, 1.0f, 0.96f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(100);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation.setAnimationListener(new C69223h(view2, scaleAnimation2));
        if (animationListener2 != null) {
            scaleAnimation2.setAnimationListener(animationListener2);
        }
        if (view2 != null) {
            view2.startAnimation(scaleAnimation);
        }
    }

    /* renamed from: g */
    public static boolean m81560g(String str, String str2) {
        Log.m105924i("MicroMsg.LuckyMoneyNewYearLogic", "saveFiletoLocal");
        if (C86013q1.m106450k(str2)) {
            Log.m105925i("MicroMsg.LuckyMoneyNewYearLogic", "fileExists exist, first delete file ：%s", str2);
            C86013q1.m106446g(str2, true);
        }
        Uri n = C116299g2.m163858n(m81558e());
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (l.mo177810a()) {
            l.f348991a.mo119937g(l.f348992b);
        }
        int R = C86013q1.m106436R(str, m81558e());
        Log.m105925i("MicroMsg.LuckyMoneyNewYearLogic", "unzip ret: %s", Integer.valueOf(R));
        C86013q1.m106447h(str);
        WxPayLuckMoneyNewYearDownloadPAGResultEvent wxPayLuckMoneyNewYearDownloadPAGResultEvent = new WxPayLuckMoneyNewYearDownloadPAGResultEvent();
        wxPayLuckMoneyNewYearDownloadPAGResultEvent.f194107d.f194109b = R == 0;
        wxPayLuckMoneyNewYearDownloadPAGResultEvent.publish();
        return R == 0;
    }

    /* renamed from: h */
    public static void m81561h(View view, int i) {
        if (i == 4) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300);
            alphaAnimation.setAnimationListener(new C4830d(view));
            view.startAnimation(alphaAnimation);
            return;
        }
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(300);
        alphaAnimation2.setAnimationListener(new C4831e(view));
        view.startAnimation(alphaAnimation2);
    }

    /* renamed from: i */
    public static void m81562i(View view, int i) {
        if (i == 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(250);
            alphaAnimation.setAnimationListener(new C4832f(view, i));
            view.startAnimation(alphaAnimation);
            return;
        }
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(250);
        alphaAnimation2.setAnimationListener(new C4833g(view, i));
        view.startAnimation(alphaAnimation2);
    }

    /* renamed from: j */
    public static void m81563j(ImageView imageView, int i) {
        if (imageView != null) {
            imageView.setImageResource(i);
            AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
            if (animationDrawable != null) {
                animationDrawable.start();
            }
        }
    }

    /* renamed from: k */
    public static void m81564k(String str, String str2, PAGView pAGView, PAGView pAGView2, PAGView.PAGViewListener pAGViewListener, PAGView.PAGViewListener pAGViewListener2) {
        boolean z = true;
        Log.m105925i("MicroMsg.LuckyMoneyNewYearLogic", "startPAGAnim ：%s ", str);
        if (str.equals("loop")) {
            pAGView.removeListener(pAGViewListener);
            pAGView.addListener(pAGViewListener2);
            pAGView.setRepeatCount(0);
        } else {
            pAGView.removeListener(pAGViewListener2);
            pAGView.addListener(pAGViewListener);
            pAGView.setRepeatCount(1);
            if (pAGView2 != null) {
                m81566m(pAGView2, pAGViewListener, pAGViewListener2);
                pAGView.postDelayed(new C69219a(pAGView, str2), 200);
                z = false;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(500);
                pAGView.startAnimation(alphaAnimation);
                alphaAnimation.setAnimationListener(new C69221b());
            }
        }
        if (z) {
            pAGView.setPath(str2);
            pAGView.stop();
            pAGView.flush();
            pAGView.play();
            pAGView.setVisibility(0);
        }
    }

    /* renamed from: l */
    public static void m81565l(ImageView imageView) {
        AnimationDrawable animationDrawable;
        if (imageView != null && (imageView.getDrawable() instanceof AnimationDrawable) && (animationDrawable = (AnimationDrawable) imageView.getDrawable()) != null) {
            animationDrawable.stop();
            animationDrawable.selectDrawable(0);
        }
    }

    /* renamed from: m */
    public static void m81566m(PAGView pAGView, PAGView.PAGViewListener pAGViewListener, PAGView.PAGViewListener pAGViewListener2) {
        Log.m105924i("MicroMsg.LuckyMoneyNewYearLogic", "stopPAGAnim");
        pAGView.removeListener(pAGViewListener);
        pAGView.removeListener(pAGViewListener2);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500);
        pAGView.startAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new C69222c(pAGView));
    }
}
