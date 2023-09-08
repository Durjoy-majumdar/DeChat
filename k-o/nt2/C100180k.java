package nt2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.C115750SphereImageView;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96963p0;
import j20.C117292a;
import java.net.URLEncoder;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import org.json.JSONObject;
import os2.C100416r;
import ps2.C100880k;
import ps2.C100891r;
import sn0.C90259e;
import vr2.C102260r;
import zs2.C103069a;

/* renamed from: nt2.k */
public class C100180k extends C100165c {

    /* renamed from: A */
    public ADXml.C95022i f293503A;

    /* renamed from: B */
    public C103069a f293504B;

    /* renamed from: C */
    public String f293505C = null;

    /* renamed from: D */
    public int f293506D = 0;

    /* renamed from: E */
    public C103069a.C103074e f293507E = new C100183b();

    /* renamed from: F */
    public C115750SphereImageView.C115754e f293508F = new C100184c();

    /* renamed from: o */
    public Context f293509o;

    /* renamed from: p */
    public View f293510p;

    /* renamed from: q */
    public View f293511q;

    /* renamed from: r */
    public TextView f293512r;

    /* renamed from: s */
    public TextView f293513s;

    /* renamed from: t */
    public TextView f293514t;

    /* renamed from: u */
    public TextView f293515u;

    /* renamed from: v */
    public View f293516v;

    /* renamed from: w */
    public C115750SphereImageView f293517w;

    /* renamed from: x */
    public ImageView f293518x;

    /* renamed from: y */
    public View f293519y;

    /* renamed from: z */
    public MMPinProgressBtn f293520z;

    /* renamed from: nt2.k$a */
    public class C100181a implements C103069a.C103074e {

        /* renamed from: a */
        public final /* synthetic */ String f293521a;

        /* renamed from: b */
        public final /* synthetic */ String f293522b;

        /* renamed from: nt2.k$a$a */
        public class C100182a implements C100880k.C100881a {
            public C100182a() {
            }

            /* renamed from: a */
            public void mo76113a() {
                SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
                Log.m105920e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "onDownloadError thumb");
                SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
            }

            /* renamed from: b */
            public void mo76114b() {
                SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
                SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
            }

            /* renamed from: c */
            public void mo76115c(String str) {
                SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
                Log.m105924i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "onDownloaded thumb, path=" + str);
                if (C100180k.m130933h(C100180k.this).getVisibility() == 0) {
                    try {
                        C100180k.m130933h(C100180k.this).setImageBitmap(MMBitmapFactory.m98734c(str));
                    } catch (Throwable th) {
                        Log.m105920e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "onDownloaded thumb exp:" + th.toString());
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
            }
        }

        public C100181a(String str, String str2) {
            this.f293521a = str;
            this.f293522b = str2;
        }

        /* renamed from: a */
        public void mo131835a(boolean z, String str, Bitmap bitmap, String str2) {
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1");
            if (str2 == null || !str2.equals(this.f293521a)) {
                SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1");
                return;
            }
            if (bitmap != null) {
                C100180k.m130933h(C100180k.this).setImageBitmap(bitmap);
            } else {
                Log.m105924i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "show progressView");
                C100180k.m130934i(C100180k.this).setVisibility(0);
                C100180k.m130934i(C100180k.this).mo153891a();
                if (!TextUtils.isEmpty(this.f293522b)) {
                    Log.m105924i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "have no shot and thumb cache, start download thumb image");
                    C100891r.m132208c(this.f293522b, false, 133, 0, new C100182a());
                } else {
                    Log.m105920e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "thumbUrl is empty");
                }
            }
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1");
        }

        /* renamed from: b */
        public void mo131836b(String str) {
            SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1");
            SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1");
        }
    }

    /* renamed from: nt2.k$b */
    public class C100183b implements C103069a.C103074e {
        public C100183b() {
        }

        /* renamed from: a */
        public void mo131835a(boolean z, String str, Bitmap bitmap, String str2) {
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$2");
            Log.m105924i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "ImageLoader onFinish, isSucc=" + z + ", errInfo=" + str);
            C100180k.this.f293517w.mo176087j(bitmap, str2);
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$2");
        }

        /* renamed from: b */
        public void mo131836b(String str) {
            SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$2");
            Log.m105924i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "ImageLoader onStart");
            SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$2");
        }
    }

    /* renamed from: nt2.k$c */
    public class C100184c implements C115750SphereImageView.C115754e {

        /* renamed from: nt2.k$c$a */
        public class C100185a implements Animation.AnimationListener {
            public C100185a() {
            }

            public void onAnimationEnd(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$1");
                C100180k.m130933h(C100180k.this).setVisibility(8);
                C100180k.m130933h(C100180k.this).setImageDrawable(new ColorDrawable(C100180k.m130933h(C100180k.this).getResources().getColor(C0966R.color.f2930d)));
                SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$1");
            }

            public void onAnimationRepeat(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$1");
                SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$1");
            }

            public void onAnimationStart(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$1");
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$1");
            }
        }

        /* renamed from: nt2.k$c$b */
        public class C100186b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f293528d;

            public C100186b(String str) {
                this.f293528d = str;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$2");
                String str = C100180k.m130935j(C100180k.this) != null ? C100180k.m130935j(C100180k.this).f275715g : "";
                String str2 = this.f293528d;
                if (str2 == null || !str2.equals(str)) {
                    Log.m105920e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "before do shot, url != CardInfo.sphereImageUrl, url=" + this.f293528d + ", info.url=" + str);
                } else {
                    Log.m105924i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "do shot");
                    C103069a.m136317f(C100180k.this.f293517w, str, "scene_timeline");
                }
                Log.m105924i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "enable touch and sensor after shot");
                C100180k.this.f293517w.setSensorEnabled(true);
                C100180k.this.f293517w.setTouchEnabled(true);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$2");
            }
        }

        public C100184c() {
        }

        /* renamed from: a */
        public void mo131837a() {
            SnsMethodCalculate.markStartTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
            C100180k kVar = C100180k.this;
            SnsMethodCalculate.markStartTimeMs("access$208", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
            kVar.f293506D++;
            SnsMethodCalculate.markEndTimeMs("access$208", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
            SnsMethodCalculate.markEndTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
        }

        /* renamed from: b */
        public void mo131838b(String str) {
            SnsMethodCalculate.markStartTimeMs("onUpdateImage", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
            if (C100180k.m130933h(C100180k.this).getVisibility() == 0) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(350);
                alphaAnimation.setAnimationListener(new C100185a());
                Log.m105924i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "do maskImage anim");
                C100180k.m130933h(C100180k.this).startAnimation(alphaAnimation);
            }
            if (C100180k.m130935j(C100180k.this) == null || C103069a.m136315c(C100180k.m130935j(C100180k.this).f275715g, "scene_timeline")) {
                C100180k.this.f293517w.setSensorEnabled(true);
                C100180k.this.f293517w.setTouchEnabled(true);
            } else {
                Log.m105924i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "disable touch before shot");
                C100180k.this.f293517w.setTouchEnabled(false);
                C100180k.this.f293517w.mo176088k();
                C100180k.this.f293517w.mo176044d();
                MMHandlerThread.postToMainThreadDelayed(new C100186b(str), 800);
            }
            if (C100180k.m130934i(C100180k.this).getVisibility() == 0) {
                C100180k.m130934i(C100180k.this).setVisibility(8);
                Log.m105924i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "hide progressView");
            }
            SnsMethodCalculate.markEndTimeMs("onUpdateImage", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
        }

        /* renamed from: c */
        public void mo131839c() {
            SnsMethodCalculate.markStartTimeMs("onTouchBegin", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
            SnsMethodCalculate.markEndTimeMs("onTouchBegin", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
        }

        /* renamed from: d */
        public void mo131840d() {
            SnsMethodCalculate.markStartTimeMs("onAngleChange", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
            SnsMethodCalculate.markEndTimeMs("onAngleChange", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
        }

        public void onDetachedFromWindow() {
            SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
            Log.m105924i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "onDetachedFromWindow, hash=" + C100180k.this.f293517w.hashCode());
            try {
                JSONObject jSONObject = new JSONObject();
                C100180k kVar = C100180k.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
                int i = kVar.f293506D;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
                jSONObject.put("panCount", i);
                jSONObject.put("type", 1);
                String encode = URLEncoder.encode(jSONObject.toString(), "UTF-8");
                String aid = C100180k.this.f293412e.getAid();
                if (aid == null) {
                    aid = "";
                }
                C115669n.INSTANCE.mo160131h(17539, C100180k.this.f293412e.getTimeLine().f283893Id, aid, C100180k.this.f293412e.getAdInfo().uxInfo, 2, encode);
                Log.m105924i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "KVReport, id=17539, touchCount=" + encode);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "kvStat exp:" + e.toString());
            }
            C100180k kVar2 = C100180k.this;
            SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
            kVar2.f293506D = 0;
            SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
            C100180k kVar3 = C100180k.this;
            SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
            kVar3.f293505C = null;
            SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
            SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
        }
    }

    public C100180k(TimeLineObject timeLineObject, SnsInfo snsInfo, TimelineClickListener timelineClickListener) {
        this.f293411d = timeLineObject;
        this.f293412e = snsInfo;
        this.f293418n = timelineClickListener;
    }

    /* renamed from: h */
    public static /* synthetic */ ImageView m130933h(C100180k kVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        ImageView imageView = kVar.f293518x;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        return imageView;
    }

    /* renamed from: i */
    public static /* synthetic */ MMPinProgressBtn m130934i(C100180k kVar) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        MMPinProgressBtn mMPinProgressBtn = kVar.f293520z;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        return mMPinProgressBtn;
    }

    /* renamed from: j */
    public static /* synthetic */ ADXml.C95022i m130935j(C100180k kVar) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        ADXml.C95022i iVar = kVar.f293503A;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        return iVar;
    }

    /* renamed from: a */
    public void mo139451a(View view, View view2) {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        this.f293413f = view;
        this.f293414g = view2;
        this.f293509o = view.getContext();
        this.f293519y = view.findViewById(C0966R.C0970id.jzb);
        this.f293510p = view.findViewById(C0966R.C0970id.kri);
        this.f293511q = view.findViewById(C0966R.C0970id.agt);
        this.f293512r = (TextView) view.findViewById(C0966R.C0970id.krk);
        this.f293513s = (TextView) view.findViewById(C0966R.C0970id.krj);
        this.f293514t = (TextView) view.findViewById(C0966R.C0970id.agv);
        this.f293515u = (TextView) view.findViewById(C0966R.C0970id.agu);
        this.f293516v = view.findViewById(C0966R.C0970id.f357559ah3);
        this.f293518x = (ImageView) view.findViewById(C0966R.C0970id.gos);
        this.f293517w = (C115750SphereImageView) view.findViewById(C0966R.C0970id.jzc);
        MMPinProgressBtn mMPinProgressBtn = (MMPinProgressBtn) view.findViewById(C0966R.C0970id.i7j);
        this.f293520z = mMPinProgressBtn;
        mMPinProgressBtn.setMax(50);
        float z = C102260r.m134886z(C0966R.dimen.anw);
        float z2 = C102260r.m134886z(C0966R.dimen.anr);
        this.f293512r.setTextSize(0, z);
        this.f293513s.setTextSize(0, z2);
        this.f293514t.setTextSize(0, z);
        this.f293515u.setTextSize(0, z2);
        this.f293517w.mo176086i(1.8f, 30.0f, -2.0f);
        this.f293517w.setTouchSensitivity(0.45f);
        this.f293517w.setEventListener(this.f293508F);
        this.f293517w.setTouchEnabled(true);
        this.f293517w.setSensorEnabled(false);
        this.f293517w.mo176088k();
        C103069a aVar = new C103069a();
        this.f293504B = aVar;
        C103069a.C103074e eVar = this.f293507E;
        SnsMethodCalculate.markStartTimeMs("setOnLoadListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        aVar.f304112a = eVar;
        SnsMethodCalculate.markEndTimeMs("setOnLoadListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        Log.m105924i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "initView, hash=" + this.f293517w.hashCode());
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
    }

    /* renamed from: g */
    public void mo139454g() {
        ViewGroup.LayoutParams layoutParams;
        SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        try {
            Log.m105924i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "refreshView, hash=" + this.f293517w.hashCode());
            SnsInfo a = C100416r.m131408a(this.f293412e.getSnsId());
            this.f293412e = a;
            this.f293503A = null;
            if (!(a == null || a.getAdXml() == null)) {
                this.f293503A = this.f293412e.getAdXml().adSphereCardInfo;
            }
            WindowManager windowManager = (WindowManager) this.f293509o.getSystemService("window");
            int min = Math.min(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight());
            View view = this.f293510p;
            C9556a aVar = new C9556a();
            C60958c.m71442b(8, aVar);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f293512r.setVisibility(8);
            this.f293513s.setVisibility(8);
            View view2 = this.f293511q;
            C9556a aVar2 = new C9556a();
            C60958c.m71442b(8, aVar2);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f293514t.setVisibility(8);
            this.f293515u.setVisibility(8);
            View view3 = this.f293516v;
            C9556a aVar3 = new C9556a();
            C60958c.m71442b(8, aVar3);
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f293503A != null) {
                int h = (((min - C76577a.m92157h(this.f293509o, C0966R.dimen.ao_)) - C76577a.m92157h(this.f293509o, C0966R.dimen.f3703bv)) - this.f293509o.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6)) - this.f293509o.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6);
                int i = this.f293503A.f275709a;
                if (i == 0) {
                    layoutParams = new ViewGroup.LayoutParams(-2, -2);
                    layoutParams.width = h;
                    layoutParams.height = (int) (((float) h) * 0.75f);
                } else if (i == 1) {
                    layoutParams = new ViewGroup.LayoutParams(-2, -2);
                    layoutParams.width = h;
                    layoutParams.height = h;
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    ViewGroup.LayoutParams layoutParams2 = this.f293413f.getLayoutParams();
                    layoutParams2.width = layoutParams.width;
                    layoutParams2.height = layoutParams.height;
                    this.f293413f.setLayoutParams(layoutParams2);
                    ((RoundedCornerFrameLayout) this.f293413f).setRadius((float) C76577a.m92151b(this.f293509o, 8));
                    ViewGroup.LayoutParams layoutParams3 = this.f293517w.getLayoutParams();
                    layoutParams3.width = layoutParams.width;
                    layoutParams3.height = layoutParams.height;
                    this.f293517w.setLayoutParams(layoutParams3);
                    ViewGroup.LayoutParams layoutParams4 = this.f293518x.getLayoutParams();
                    layoutParams4.width = layoutParams3.width;
                    layoutParams4.height = layoutParams3.height;
                    this.f293518x.setLayoutParams(layoutParams4);
                }
                ADXml.C95022i iVar = this.f293503A;
                int i2 = iVar.f275713e;
                if (i2 == 0) {
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb((int) (((float) iVar.f275712d) * 2.55f), 0, 0, 0), Color.argb(0, 0, 0, 0)});
                    gradientDrawable.setGradientType(0);
                    this.f293510p.setBackground(gradientDrawable);
                    if (!Util.isNullOrNil(this.f293503A.f275710b) || !Util.isNullOrNil(this.f293503A.f275711c)) {
                        View view4 = this.f293510p;
                        C9556a aVar4 = new C9556a();
                        C60958c.m71442b(0, aVar4);
                        C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View view5 = this.f293511q;
                    C9556a aVar5 = new C9556a();
                    C60958c.m71442b(8, aVar5);
                    C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (!Util.isNullOrNil(this.f293503A.f275710b)) {
                        this.f293512r.setVisibility(0);
                        this.f293512r.setText(C96963p0.wx0().mo83004M(this.f293512r.getContext(), this.f293503A.f275710b));
                    }
                    if (!Util.isNullOrNil(this.f293503A.f275711c)) {
                        this.f293513s.setVisibility(0);
                        this.f293513s.setText(C96963p0.wx0().mo83004M(this.f293513s.getContext(), this.f293503A.f275711c));
                    }
                } else if (i2 == 1) {
                    GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{Color.argb((int) (((float) iVar.f275712d) * 2.55f), 0, 0, 0), Color.argb(0, 0, 0, 0)});
                    gradientDrawable2.setGradientType(0);
                    View view6 = this.f293510p;
                    C9556a aVar6 = new C9556a();
                    C60958c.m71442b(8, aVar6);
                    C117292a.m165358d(view6, aVar6.mo10232b(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f293511q.setBackground(gradientDrawable2);
                    if (!Util.isNullOrNil(this.f293503A.f275710b) || !Util.isNullOrNil(this.f293503A.f275711c)) {
                        View view7 = this.f293511q;
                        C9556a aVar7 = new C9556a();
                        C60958c.m71442b(0, aVar7);
                        C117292a.m165358d(view7, aVar7.mo10232b(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f293516v.getLayoutParams();
                        layoutParams5.topMargin = C76577a.m92151b(this.f293509o, 4);
                        this.f293516v.setLayoutParams(layoutParams5);
                    }
                    if (!Util.isNullOrNil(this.f293503A.f275710b)) {
                        this.f293514t.setVisibility(0);
                        this.f293514t.setText(C96963p0.wx0().mo83004M(this.f293514t.getContext(), this.f293503A.f275710b));
                    }
                    if (!Util.isNullOrNil(this.f293503A.f275711c)) {
                        this.f293515u.setVisibility(0);
                        this.f293515u.setText(C96963p0.wx0().mo83004M(this.f293515u.getContext(), this.f293503A.f275711c));
                    }
                }
                SnsInfo snsInfo = this.f293412e;
                if (snsInfo != null && snsInfo.getAdInfo().isWeapp()) {
                    GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{Color.argb((int) (((float) this.f293503A.f275712d) * 2.55f), 0, 0, 0), Color.argb(0, 0, 0, 0)});
                    gradientDrawable3.setGradientType(0);
                    View view8 = this.f293511q;
                    C9556a aVar8 = new C9556a();
                    C60958c.m71442b(0, aVar8);
                    C117292a.m165358d(view8, aVar8.mo10232b(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f293511q.setBackground(gradientDrawable3);
                    View view9 = this.f293516v;
                    C9556a aVar9 = new C9556a();
                    C60958c.m71442b(0, aVar9);
                    C117292a.m165358d(view9, aVar9.mo10232b(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                    C117292a.m165359e(view9, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f293517w.setVisibility(0);
                this.f293517w.setTag(this);
                this.f293517w.setOnClickListener(this.f293418n.f280365U);
                String str = this.f293505C;
                if (str != null) {
                    if (str.equals(this.f293503A.f275715g)) {
                        Log.m105920e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "invalid refreshView");
                    }
                }
                Log.m105924i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "loadImage");
                mo139471k();
                this.f293504B.mo142780e(this.f293503A.f275715g, this.f293517w.getLayoutParams().width, this.f293517w.getLayoutParams().height, "scene_timeline");
                this.f293505C = this.f293503A.f275715g;
            } else {
                Log.m105920e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "invalid spherecardinfo");
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "refreshView, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
    }

    /* renamed from: k */
    public void mo139471k() {
        SnsMethodCalculate.markStartTimeMs("showMaskView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        try {
            this.f293518x.setVisibility(0);
            ADXml.C95022i iVar = this.f293503A;
            String str = iVar.f275715g;
            String str2 = iVar.f275716h;
            new C103069a.C103073d(str, str2, "scene_timeline", new C100181a(str, str2)).execute(new Void[0]);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "showMaskView exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("showMaskView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
    }
}
