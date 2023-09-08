package com.tencent.p014mm.plugin.appbrand.jsapi.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Looper;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.map.geolocation.sapp.TencentLocation;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.danmu.DanmuView;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.a$$g;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.p840ui.AppBrandDotPercentIndicator;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.file.XVFSFile;
import gn0.C107859a;
import gn0.C107860b;
import gn0.C107861c;
import gn0.C107862d;
import gn0.C107863e;
import gn0.C107864f;
import hn0.C20959a;
import hn0.C20960b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import js0.C88020k;
import js0.C88024r;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lb0.C88394b;
import on0.C21797a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p224ra.C89909e;
import ym0.C91510h;
import ym0.C91515l;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView */
public class AppBrandVideoView extends RelativeLayout {

    /* renamed from: Y0 */
    public static final /* synthetic */ int f49488Y0 = 0;

    /* renamed from: A */
    public boolean f49489A;

    /* renamed from: B */
    public boolean f49490B;

    /* renamed from: C */
    public C20960b f49491C;

    /* renamed from: D */
    public boolean f49492D;

    /* renamed from: E */
    public boolean f49493E;

    /* renamed from: F */
    public C21797a f49494F;

    /* renamed from: G */
    public C17972m f49495G;

    /* renamed from: H */
    public boolean f49496H;

    /* renamed from: I */
    public boolean f49497I;

    /* renamed from: J */
    public double f49498J;

    /* renamed from: K */
    public int f49499K;

    /* renamed from: L */
    public String f49500L;

    /* renamed from: M */
    public boolean f49501M;

    /* renamed from: N */
    public boolean f49502N;

    /* renamed from: P */
    public boolean f49503P;

    /* renamed from: Q */
    public boolean f49504Q;

    /* renamed from: Q0 */
    public boolean f49505Q0 = true;

    /* renamed from: R */
    public boolean f49506R;

    /* renamed from: R0 */
    public boolean f49507R0 = false;

    /* renamed from: S */
    public int f49508S;

    /* renamed from: S0 */
    public boolean f49509S0 = false;

    /* renamed from: T */
    public String f49510T;

    /* renamed from: T0 */
    public MTimerHandler f49511T0;

    /* renamed from: U */
    public boolean f49512U;

    /* renamed from: U0 */
    public int f49513U0 = 0;

    /* renamed from: V */
    public boolean f49514V;

    /* renamed from: V0 */
    public int f49515V0 = -16777216;

    /* renamed from: W */
    public boolean f49516W;

    /* renamed from: W0 */
    public C17978c.C17981c f49517W0;

    /* renamed from: X0 */
    public int f49518X0;

    /* renamed from: d */
    public int f49519d = -1;

    /* renamed from: e */
    public RelativeLayout f49520e;

    /* renamed from: f */
    public C17978c f49521f;

    /* renamed from: g */
    public TextView f49522g;

    /* renamed from: h */
    public DanmuView f49523h;

    /* renamed from: i */
    public C17978c.C17979a f49524i;

    /* renamed from: j */
    public View f49525j;

    /* renamed from: n */
    public View f49526n;

    /* renamed from: o */
    public TextView f49527o;

    /* renamed from: p */
    public LinearLayout f49528p;

    /* renamed from: p0 */
    public boolean f49529p0;

    /* renamed from: q */
    public AppBrandDotPercentIndicator f49530q;

    /* renamed from: r */
    public TextView f49531r;

    /* renamed from: s */
    public ImageView f49532s;

    /* renamed from: t */
    public ImageView f49533t;

    /* renamed from: u */
    public ImageView f49534u;

    /* renamed from: v */
    public ImageView f49535v;

    /* renamed from: w */
    public FrameLayout f49536w;

    /* renamed from: x */
    public String f49537x;

    /* renamed from: x0 */
    public boolean f49538x0;

    /* renamed from: y */
    public int f49539y;

    /* renamed from: y0 */
    public boolean f49540y0 = false;

    /* renamed from: z */
    public C82381f f49541z;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView$a */
    public class C17961a implements C17978c.C17987i {
        public C17961a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView$b */
    public class C17962b implements View.OnClickListener {
        public C17962b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AppBrandVideoView appBrandVideoView = AppBrandVideoView.this;
            appBrandVideoView.setMute(!appBrandVideoView.f49512U);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView$c */
    public class C17963c implements View.OnClickListener {
        public C17963c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AppBrandVideoView appBrandVideoView = AppBrandVideoView.this;
            appBrandVideoView.mo22237q(false, appBrandVideoView.f49519d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView$d */
    public class C17964d implements C17978c.C17984f {
        public C17964d() {
        }

        /* renamed from: a */
        public void mo22281a(boolean z) {
            AppBrandVideoView.m18397a(AppBrandVideoView.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView$e */
    public class C17965e implements C17978c.C17983e {
        public C17965e() {
        }

        /* renamed from: a */
        public void mo22282a(int i, int i2) {
            if (i2 > 0) {
                if (i < 0) {
                    i = 0;
                }
                if (i > i2) {
                    i = i2;
                }
                int width = (i * AppBrandVideoView.this.f49535v.getWidth()) / i2;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) AppBrandVideoView.this.f49534u.getLayoutParams();
                layoutParams.width = width;
                AppBrandVideoView.this.f49534u.setLayoutParams(layoutParams);
                AppBrandVideoView.this.f49534u.requestLayout();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView$g */
    public class C17966g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f49547d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView$g$a */
        public class C17967a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f49549d;

            public C17967a(Bitmap bitmap) {
                this.f49549d = bitmap;
            }

            public void run() {
                Bitmap bitmap = this.f49549d;
                if (bitmap != null && !bitmap.isRecycled()) {
                    AppBrandVideoView.this.f49533t.setImageBitmap(this.f49549d);
                }
            }
        }

        public C17966g(String str) {
            this.f49547d = str;
        }

        public void run() {
            MMHandlerThread.postToMainThread(new C17967a(BitmapUtil.createVideoThumbnail(this.f49547d, 1)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView$h */
    public class C17968h implements C17978c.C17985g {
        public C17968h() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView$j */
    public class C17969j implements View.OnClickListener {
        public C17969j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AppBrandVideoView appBrandVideoView = AppBrandVideoView.this;
            appBrandVideoView.mo22237q(!AppBrandVideoView.this.mo22232m(), appBrandVideoView.f49519d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView$k */
    public class C17970k implements C17978c.C17982d {
        public C17970k() {
        }

        /* renamed from: a */
        public void mo22286a(int i) {
            AppBrandVideoView.this.mo22239s((double) i, false);
        }

        public void onSeekPre() {
            Log.m105924i("MicroMsg.Video.AppBrandVideoView", "onSeekPre");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView$l */
    public class C17971l implements View.OnClickListener {
        public C17971l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (AppBrandVideoView.this.f49521f.isPlaying()) {
                AppBrandVideoView.this.mo22238r();
            } else {
                AppBrandVideoView.this.mo22277w();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView$m */
    public interface C17972m {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView$f */
    public class C17973f implements View.OnClickListener {
        public C17973f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AppBrandVideoView.this.mo22277w();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView$i */
    public class C17974i implements C107864f {
        public C17974i() {
        }
    }

    public <T extends View & C17978c> AppBrandVideoView(Context context, T t) {
        super(context);
        this.f49521f = (C17978c) t;
        mo22229j(context);
        this.f49520e.addView(t);
    }

    /* renamed from: a */
    public static void m18397a(AppBrandVideoView appBrandVideoView) {
        boolean s = appBrandVideoView.f49524i.mo22345s();
        if (appBrandVideoView.f49490B && appBrandVideoView.f49503P && appBrandVideoView.f49505Q0 && !s && !appBrandVideoView.mo22233n()) {
            if (!(appBrandVideoView.f49525j.getVisibility() == 0)) {
                appBrandVideoView.f49536w.setVisibility(0);
                return;
            }
        }
        appBrandVideoView.f49536w.setVisibility(8);
    }

    private void setCover(String str) {
        if (!Util.isNullOrNil(str)) {
            if (!Util.isNullOrNil(this.f49500L)) {
                Log.m105924i("MicroMsg.Video.AppBrandVideoView", "setCover mCoverUrl not null");
            } else {
                C88024r.m109571a().postToWorker(new C17966g(str));
            }
        }
    }

    /* renamed from: b */
    public boolean mo22215b(String str, String str2) {
        if (this.f49523h == null) {
            Log.m105928w("MicroMsg.Video.AppBrandVideoView", " addDanmaku mDanmakuView null");
            mo22231l();
        }
        int a = C88020k.m109550a(str2);
        C107859a aVar = new C107859a(getContext(), new SpannableString(str), a == 0 ? -1 : a, 0, 3.0f, this.f49521f.getCurrPosSec());
        DanmuView danmuView = this.f49523h;
        synchronized (danmuView.f311205q) {
            ((LinkedList) danmuView.f311205q).offerFirst(aVar);
            ((C119157j) C119157j.f356862d).mo183876g(new C107861c(danmuView, aVar), "DanmuView-addItemToWaitingHead");
        }
        return true;
    }

    /* renamed from: c */
    public final void mo22216c(boolean z) {
        C20960b bVar = this.f49491C;
        if (bVar != null) {
            int i = this.f49539y;
            int i2 = this.f49518X0;
            bVar.getClass();
            try {
                Log.m105925i("MicroMsg.Video.JsApiVideoCallback", "onVideoFullScreenChange videoPlayerId=%d isFullScreen=%b direction:%d", Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2));
                JSONObject c = bVar.mo32717c();
                c.put("fullScreen", z);
                c.put("videoPlayerId", i);
                c.put(TencentLocation.EXTRA_DIRECTION, i2);
                bVar.mo32716b(new C20960b.C20965e((C20959a) null), c);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.Video.JsApiVideoCallback", "onVideoFullScreenChange e=%s", e);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo22217d() {
        if (!(this.f49525j.getVisibility() == 0)) {
            if (mo22232m() || !this.f49492D) {
                return mo22232m() && this.f49493E;
            }
            return true;
        }
    }

    /* renamed from: e */
    public final boolean mo22218e() {
        if (this.f49502N && !this.f49521f.mo22308i()) {
            if (!(this.f49525j.getVisibility() == 0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo22219f() {
        Log.m105924i("MicroMsg.Video.AppBrandVideoView", "clean");
        mo22278x();
        this.f49521f.mo22297c();
        DanmuView danmuView = this.f49523h;
        if (danmuView != null) {
            danmuView.f311208t = 3;
            danmuView.mo148615b();
            ((LinkedList) danmuView.f311206r).clear();
            danmuView.invalidate();
        }
        this.f49524i.onDestroy();
        MTimerHandler mTimerHandler = this.f49511T0;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
    }

    /* renamed from: g */
    public void mo22220g(boolean z) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "enableProgressGesture %b", Boolean.valueOf(z));
        this.f49502N = z;
    }

    public int getCacheTimeSec() {
        C17978c cVar = this.f49521f;
        if (cVar != null) {
            return cVar.getCacheTimeSec();
        }
        return 0;
    }

    public C20960b getCallback() {
        return this.f49491C;
    }

    public String getCookieData() {
        return this.f49537x;
    }

    public int getCurrPosMs() {
        return this.f49521f.getCurrPosMs();
    }

    public int getCurrPosSec() {
        return this.f49521f.getCurrPosSec();
    }

    public int getDuration() {
        int i = this.f49499K;
        return i > 0 ? i : this.f49521f.getVideoDurationSec();
    }

    /* renamed from: h */
    public final String mo22227h(int i) {
        return mo22234o(i / 60) + XVFSFile.PATH_SEPARATOR + mo22234o(i % 60);
    }

    /* renamed from: i */
    public final void mo22228i() {
        this.f49524i.mo22371z();
    }

    /* renamed from: j */
    public final void mo22229j(Context context) {
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f6486g5, this);
        setBackgroundColor(this.f49515V0);
        this.f49520e = (RelativeLayout) findViewById(C0966R.C0970id.l7x);
        this.f49522g = (TextView) findViewById(C0966R.C0970id.i7j);
        this.f49525j = findViewById(C0966R.C0970id.buq);
        this.f49526n = findViewById(C0966R.C0970id.bvb);
        this.f49527o = (TextView) findViewById(C0966R.C0970id.bvf);
        this.f49528p = (LinearLayout) findViewById(C0966R.C0970id.f5644ko);
        this.f49530q = (AppBrandDotPercentIndicator) findViewById(C0966R.C0970id.f5645kp);
        this.f49531r = (TextView) findViewById(C0966R.C0970id.f5641kl);
        this.f49532s = (ImageView) findViewById(C0966R.C0970id.f5643kn);
        this.f49533t = (ImageView) findViewById(C0966R.C0970id.buo);
        this.f49534u = (ImageView) findViewById(C0966R.C0970id.hxg);
        this.f49535v = (ImageView) findViewById(C0966R.C0970id.hxf);
        this.f49536w = (FrameLayout) findViewById(C0966R.C0970id.hxh);
        this.f49530q.setDotsNum(8);
        ((ImageView) findViewById(C0966R.C0970id.bva)).setOnClickListener(new C17973f());
        this.f49494F = new C21797a(getContext(), this, new C17976a(this));
        this.f49521f.setIMMVideoViewCallback(new C17977b(this));
    }

    /* renamed from: k */
    public void mo22230k(C17978c.C17979a aVar) {
        this.f49524i = aVar;
        if ((aVar instanceof View) && aVar != null) {
            View view = (View) aVar;
            if (view.getId() != -1) {
                view.setId(C0966R.C0970id.f6028v_);
            }
        }
        this.f49524i.hide();
        this.f49524i.setFullScreenBtnOnClickListener(new C17969j());
        this.f49524i.setIplaySeekCallback(new C17970k());
        this.f49524i.setOnPlayButtonClickListener(new C17971l());
        this.f49524i.setStatePorter(new C17961a());
        this.f49524i.setMuteBtnOnClickListener(new C17962b());
        this.f49524i.setExitFullScreenBtnOnClickListener(new C17963c());
        this.f49524i.mo22338D(new C17964d());
        this.f49524i.setOnUpdateProgressLenListener(new C17965e());
    }

    /* renamed from: l */
    public final void mo22231l() {
        DanmuView danmuView = (DanmuView) findViewById(C0966R.C0970id.bys);
        this.f49523h = danmuView;
        danmuView.setDanmuViewCallBack(new C17974i());
        DanmuView danmuView2 = this.f49523h;
        danmuView2.f311199h = 0.0f;
        danmuView2.f311200i = 0.8f;
        danmuView2.setMaxRunningPerRow(5);
        this.f49523h.setPickItemInterval(200);
        DanmuView danmuView3 = this.f49523h;
        danmuView3.f311208t = 4;
        danmuView3.invalidate();
        C17978c cVar = this.f49521f;
        if (cVar != null && ((View) cVar).getHeight() > 0) {
            this.f49523h.setMaxRow((int) (((float) ((int) (this.f49523h.getYOffset() * ((float) ((View) this.f49521f).getHeight())))) / (((float) C76577a.m92151b(getContext(), 18)) * 2.0f)));
        }
    }

    /* renamed from: m */
    public boolean mo22232m() {
        C17972m mVar = this.f49495G;
        if (mVar == null) {
            Log.m105928w("MicroMsg.Video.AppBrandVideoView", "isInFullScreen mFullScreenDelegate null");
            return false;
        }
        a$$g a__g = (a$$g) mVar;
        C82520h.C82521a c = a__g.f49588a.mo109649c(a__g.f49589b);
        int i = a__g.f49590c;
        C83873p2 p2Var = (C83873p2) c;
        return p2Var.f244875i == i || p2Var.f244870d == i;
    }

    /* renamed from: n */
    public final boolean mo22233n() {
        return this.f49496H || this.f49521f.mo22308i();
    }

    /* renamed from: o */
    public final String mo22234o(int i) {
        if (i < 10) {
            return "0" + i;
        }
        return i + "";
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f49516W) {
            z = true;
        } else {
            z = mo22218e();
            if (!mo22217d()) {
                z = false;
            }
        }
        if (z) {
            C21797a aVar = this.f49494F;
            if (aVar != null) {
                aVar.f61785e.getClass();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    aVar.f61788h = motionEvent.getRawX();
                    aVar.f61787g = ((AudioManager) aVar.f61781a.getSystemService("audio")).getStreamVolume(3);
                    aVar.f61786f = C91515l.m114818b(aVar.f61781a);
                }
                GestureDetector gestureDetector = aVar.f61784d;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(motionEvent);
                GestureDetector gestureDetector2 = gestureDetector;
                C117292a.m165358d(gestureDetector2, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/video/ui/VideoPlayerGestureController", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                C117292a.m165360f(gestureDetector2, gestureDetector.onTouchEvent((MotionEvent) aVar2.mo10231a(0)), "com/tencent/mm/plugin/appbrand/jsapi/video/ui/VideoPlayerGestureController", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                if (actionMasked == 1 || actionMasked == 3) {
                    C21797a.C21799b bVar = aVar.f61783c;
                    if (bVar == C21797a.C21799b.FastBackwardOrForward) {
                        C21797a.C21800c cVar = aVar.f61785e;
                        int i = aVar.f61790j;
                        float rawX = motionEvent.getRawX() - aVar.f61788h;
                        C17976a aVar3 = (C17976a) cVar;
                        if (aVar3.f49577a.mo22218e()) {
                            aVar3.f49577a.f49522g.setVisibility(8);
                            aVar3.f49577a.f49524i.mo22335A();
                            Log.m105925i("MicroMsg.Video.AppBrandVideoView", "onEndDragProgress: dragPosition=%d currentPositon=%d totalDistanceX=%s", Integer.valueOf(i), Integer.valueOf(aVar3.f49577a.f49521f.getCurrPosSec()), Float.valueOf(rawX));
                            aVar3.f49577a.mo22239s((double) i, false);
                        }
                        aVar.f61789i = -1;
                        aVar.f61790j = 0;
                        aVar.f61788h = 0.0f;
                    } else if (bVar == C21797a.C21799b.Volume) {
                        ((AudioManager) aVar.f61781a.getSystemService("audio")).getStreamMaxVolume(3);
                        C17976a aVar4 = (C17976a) aVar.f61785e;
                        if (aVar4.f49577a.mo22217d()) {
                            aVar4.f49577a.f49528p.setVisibility(8);
                            aVar4.f49577a.f49524i.mo22335A();
                        }
                    } else if (bVar == C21797a.C21799b.Brightness) {
                        C17976a aVar5 = (C17976a) aVar.f61785e;
                        if (aVar5.f49577a.mo22217d()) {
                            aVar5.f49577a.f49528p.setVisibility(8);
                            aVar5.f49577a.f49524i.mo22335A();
                        }
                    }
                    aVar.f61783c = C21797a.C21799b.None;
                }
            }
            return true;
        }
        if (motionEvent.getAction() == 0 && this.f49490B && this.f49525j.getVisibility() != 0) {
            this.f49524i.mo22337C();
            if (this.f49514V) {
                mo22228i();
            }
        }
        if (this.f49501M) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public void mo22236p() {
        Log.m105924i("MicroMsg.Video.AppBrandVideoView", "onUIResume");
        if (this.f49540y0) {
            Log.m105924i("MicroMsg.Video.AppBrandVideoView", "onUIResume, should skip ui resume");
            this.f49540y0 = false;
            return;
        }
        this.f49521f.mo22299f();
    }

    /* renamed from: q */
    public void mo22237q(boolean z, int i) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "operateFullScreen toFullScreen:%b direction:%d", Boolean.valueOf(z), Integer.valueOf(i));
        if (this.f49495G == null) {
            Log.m105928w("MicroMsg.Video.AppBrandVideoView", "operateFullScreen mFullScreenDelegate null");
        } else if (z == mo22232m()) {
            Log.m105924i("MicroMsg.Video.AppBrandVideoView", "operateFullScreen current same");
        } else {
            if (i == -1) {
                i = this.f49519d;
                if (i == -1) {
                    i = 90;
                }
                Log.m105925i("MicroMsg.Video.AppBrandVideoView", "operateFullScreen target direction:%d", Integer.valueOf(i));
            }
            if (z) {
                this.f49518X0 = i;
                a$$g a__g = (a$$g) this.f49495G;
                ((C83873p2) a__g.f49588a.mo109649c(a__g.f49589b)).mo116432j(a__g.f49590c, a__g.f49591d, i);
                this.f49524i.mo22342p();
                mo22216c(true);
                return;
            }
            a$$g a__g2 = (a$$g) this.f49495G;
            ((C83873p2) a__g2.f49588a.mo109649c(a__g2.f49589b)).mo116433k(a__g2.f49590c);
            this.f49524i.mo22368w();
        }
    }

    /* renamed from: r */
    public void mo22238r() {
        Log.m105924i("MicroMsg.Video.AppBrandVideoView", "pause");
        if (!this.f49507R0) {
            Log.m105924i("MicroMsg.Video.AppBrandVideoView", "pause, video not prepared");
            this.f49509S0 = false;
        } else if (!this.f49521f.isPlaying()) {
            Log.m105924i("MicroMsg.Video.AppBrandVideoView", "pause, video not playing");
        } else {
            this.f49521f.pause();
            if (this.f49523h != null && this.f49524i.mo22367v()) {
                DanmuView danmuView = this.f49523h;
                danmuView.f311208t = 2;
                danmuView.invalidate();
            }
        }
    }

    /* renamed from: s */
    public void mo22239s(double d, boolean z) {
        double d2 = d;
        boolean z2 = z;
        int currPosSec = this.f49521f.getCurrPosSec();
        boolean z3 = false;
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "seek to position=%s current=%d isLive=%b", Double.valueOf(d), Integer.valueOf(currPosSec), Boolean.valueOf(this.f49496H));
        if (!mo22233n()) {
            View view = this.f49525j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "seekTo", "(DZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "seekTo", "(DZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (z2) {
                this.f49521f.mo22294a(d2, z2);
            } else {
                this.f49521f.mo22298d(d2);
            }
            DanmuView danmuView = this.f49523h;
            if (danmuView != null && ((double) currPosSec) > d2) {
                int i = (int) d2;
                Log.m105925i("MicroMsg.DanmuView", "seekToPlayTime playTime=%d", Integer.valueOf(i));
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    z3 = true;
                }
                if (z3) {
                    danmuView.f311209u = true;
                } else {
                    danmuView.post(new C107860b(danmuView));
                }
                danmuView.mo148615b();
                danmuView.mo148619f();
                ((C119157j) C119157j.f356862d).mo183875f(new C107863e(danmuView, i));
            }
        }
    }

    public void setAutoPauseIfNavigate(boolean z) {
        this.f49529p0 = z;
    }

    public void setAutoPauseIfOpenNative(boolean z) {
        this.f49538x0 = z;
    }

    public void setAutoPlay(boolean z) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setAutoPlay %b", Boolean.valueOf(z));
        this.f49489A = z;
    }

    public void setCallback(C20960b bVar) {
        this.f49491C = bVar;
    }

    public void setComponent(C82381f fVar) {
        this.f49541z = fVar;
        fVar.getAppId();
        C17978c cVar = this.f49521f;
        if (cVar instanceof AppBrandVideoWrapper) {
            ((AppBrandVideoWrapper) cVar).setHostComponent(fVar);
        }
    }

    public void setConsumeTouchEvent(boolean z) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setConsumeTouchEvent game=%s", Boolean.valueOf(z));
        this.f49501M = z;
    }

    public void setCookieData(String str) {
        this.f49537x = str;
    }

    public void setDanmakuEnable(boolean z) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setDanmakuEnable %b", Boolean.valueOf(z));
        this.f49524i.setDanmakuBtnOpen(z);
    }

    public void setDanmakuItemList(JSONArray jSONArray) {
        C107859a aVar;
        if (jSONArray != null) {
            boolean z = false;
            Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setDanmakuItemList length=%d", Integer.valueOf(jSONArray.length()));
            if (this.f49523h == null) {
                Log.m105928w("MicroMsg.Video.AppBrandVideoView", "setDanmakuItemList mDanmakuView null");
                mo22231l();
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    aVar = null;
                } else {
                    int optInt = optJSONObject.optInt("time", 0);
                    String optString = optJSONObject.optString(MimeTypes.BASE_TYPE_TEXT, "");
                    int a = C88020k.m109550a(optJSONObject.optString("color", ""));
                    aVar = new C107859a(getContext(), new SpannableString(optString), a == 0 ? -1 : a, 0, 3.0f, optInt);
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            DanmuView danmuView = this.f49523h;
            danmuView.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            if (z) {
                danmuView.f311209u = true;
            } else {
                danmuView.post(new C107860b(danmuView));
            }
            danmuView.mo148615b();
            ((LinkedList) danmuView.f311206r).clear();
            danmuView.mo148619f();
            if (arrayList.isEmpty()) {
                danmuView.mo148620g();
                return;
            }
            ((C119157j) C119157j.f356862d).mo183884o(new C107862d(danmuView, arrayList));
            danmuView.mo148620g();
        }
    }

    public void setDuration(int i) {
        if (i <= 0) {
            Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setDuration error duration=%d", Integer.valueOf(i));
            return;
        }
        this.f49527o.setText(mo22227h(i));
        this.f49499K = i;
    }

    public void setEnablePlayGesture(boolean z) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setEnablePlayGesture %b", Boolean.valueOf(z));
        this.f49516W = z;
    }

    public void setFullScreenDelegate(C17972m mVar) {
        this.f49495G = mVar;
    }

    public void setFullScreenDirection(int i) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setFullScreenDirection %d", Integer.valueOf(i));
        this.f49519d = i;
    }

    public void setFullScreenState(boolean z) {
        if (z) {
            this.f49524i.mo22342p();
        } else {
            this.f49524i.mo22368w();
        }
    }

    public void setIMMVideoViewCallback(C17978c.C17981c cVar) {
        this.f49517W0 = cVar;
    }

    public void setInitialTime(double d) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setInitialTime %s", Double.valueOf(d));
        this.f49498J = d;
    }

    public void setIsEnableBottomProgressBar(boolean z) {
        this.f49505Q0 = z;
    }

    public void setIsShowBasicControls(boolean z) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setIsShowBasicControls %b", Boolean.valueOf(z));
        this.f49490B = z;
        C17978c.C17979a aVar = this.f49524i;
        if (aVar == null) {
            return;
        }
        if (z) {
            aVar.mo22366t();
        } else {
            aVar.hide();
        }
    }

    public void setLoop(boolean z) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setLoop %b", Boolean.valueOf(z));
        this.f49497I = z;
    }

    public void setMute(boolean z) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setMute %b", Boolean.valueOf(z));
        this.f49512U = z;
        this.f49521f.setMute(z);
        this.f49524i.setMuteBtnState(z);
    }

    public void setObjectFit(String str) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setObjectFit %s", str);
        if ("fill".equalsIgnoreCase(str)) {
            this.f49521f.setScaleType(C17978c.C17986h.FILL);
            this.f49533t.setScaleType(ImageView.ScaleType.FIT_XY);
        } else if ("cover".equalsIgnoreCase(str)) {
            this.f49521f.setScaleType(C17978c.C17986h.COVER);
            this.f49533t.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            this.f49521f.setScaleType(C17978c.C17986h.CONTAIN);
            this.f49533t.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public void setPageGesture(boolean z) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setPageGesture %b", Boolean.valueOf(z));
        this.f49492D = z;
    }

    public void setPageGestureInFullscreen(boolean z) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setPageGestureInFullscreen %b", Boolean.valueOf(z));
        this.f49493E = z;
    }

    public void setPlayBtnPosition(String str) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setPlayBtnPosition %s", str);
        if (Util.isNullOrNil(str) || !str.equalsIgnoreCase("center")) {
            this.f49524i.setPlayBtnInCenterPosition(false);
        } else {
            this.f49524i.setPlayBtnInCenterPosition(true);
        }
    }

    public void setShowCenterPlayBtn(boolean z) {
        C17978c.C17979a aVar;
        boolean z2 = z;
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setShowCenterPlayBtn %b", Boolean.valueOf(z));
        this.f49506R = z2;
        View view = this.f49525j;
        int i = 8;
        int i2 = z2 ? 0 : 8;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(i2));
        View view2 = view;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "setShowCenterPlayBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "setShowCenterPlayBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f49526n;
        if (z2) {
            i = 0;
        }
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(Integer.valueOf(i));
        View view4 = view3;
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "setShowCenterPlayBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "setShowCenterPlayBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f49506R && (aVar = this.f49524i) != null) {
            aVar.hide();
        }
    }

    public void setShowControlProgress(boolean z) {
        boolean z2 = true;
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setShowControlProgress %b", Boolean.valueOf(z));
        C17978c.C17979a aVar = this.f49524i;
        if (!z || mo22233n()) {
            z2 = false;
        }
        aVar.setShowControlProgress(z2);
    }

    public void setShowDanmakuBtn(boolean z) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setShowDanmakuBtn %b", Boolean.valueOf(z));
        if (z) {
            if (this.f49523h == null) {
                mo22231l();
            }
            this.f49524i.setDanmakuBtnOnClickListener(new C17968h());
        }
        this.f49524i.setShowDanmakuBtn(z);
    }

    public void setShowFullScreenBtn(boolean z) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setShowFullScreenBtn %b", Boolean.valueOf(z));
        this.f49524i.setShowFullScreenBtn(z);
    }

    public void setShowMuteBtn(boolean z) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "showMuteBtn %b", Boolean.valueOf(z));
        this.f49524i.setShowMuteBtn(z);
    }

    public void setShowPlayBtn(boolean z) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setShowPlayBtn %b", Boolean.valueOf(z));
        this.f49524i.setShowPlayBtn(z);
    }

    public void setShowProgress(boolean z) {
        boolean z2 = true;
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setShowProgress %b", Boolean.valueOf(z));
        this.f49503P = z;
        C17978c.C17979a aVar = this.f49524i;
        if ((!z && !this.f49504Q) || mo22233n()) {
            z2 = false;
        }
        aVar.setShowProgress(z2);
    }

    public void setShowProgressBarInControlMode(boolean z) {
        boolean z2 = true;
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setShowProgressInControlMode %b", Boolean.valueOf(z));
        this.f49504Q = z;
        C17978c.C17979a aVar = this.f49524i;
        if ((!this.f49503P && !z) || mo22233n()) {
            z2 = false;
        }
        aVar.setShowProgress(z2);
    }

    public void setTitle(String str) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setTitle %s", str);
        this.f49524i.setTitle(str);
    }

    public void setVideoPlayerId(int i) {
        this.f49539y = i;
    }

    public void setVideoSource(int i) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setVideoSource %d", Integer.valueOf(i));
        this.f49508S = i;
    }

    /* renamed from: t */
    public void mo22275t(String str, String str2) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setCover:%s", str);
        if (!Util.isNullOrNil(str)) {
            this.f49500L = str;
            String str3 = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122786b(this.f49533t, str, (Drawable) null, (C88394b.C88408j) null);
        }
    }

    /* renamed from: v */
    public void mo22276v(String str, boolean z, int i) {
        String ya02;
        Class cls = C91510h.class;
        C82381f fVar = this.f49541z;
        if (!(fVar == null || fVar.getFileSystem() == null || !this.f49541z.getFileSystem().accept(str))) {
            C86009m1 absoluteFile = this.f49541z.getFileSystem().getAbsoluteFile(str);
            if (absoluteFile == null) {
                str = null;
            } else {
                str = "file://" + absoluteFile.mo119971i();
            }
        }
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setVideoPath path=%s isLive=%s", str, Boolean.valueOf(z));
        if (Util.isNullOrNil(str)) {
            Log.m105926v("MicroMsg.Video.AppBrandVideoView", "setVideoPath videoPath empty");
            return;
        }
        mo22278x();
        this.f49496H = z;
        this.f49510T = str;
        this.f49521f.setVideoSource(this.f49508S);
        this.f49521f.mo22307h(z, str, i);
        double d = this.f49498J;
        if (d > 0.0d) {
            this.f49521f.mo22294a(d, this.f49489A);
        }
        if (!(this.f49508S != 1 || C89909e.m112436a(cls) == null || (ya02 = ((C91510h) C89909e.m112436a(cls)).ya0(this.f49510T)) == null)) {
            Log.m105925i("MicroMsg.Video.AppBrandVideoView", "setVideoPath localVideoPath:%s", ya02);
            String str2 = this.f49510T;
            Log.m105925i("MicroMsg.Video.AppBrandVideoView", "leonlad setPreLoadVideoPath %s", ya02);
            if (!this.f49521f.isPlaying() && this.f49510T.equalsIgnoreCase(str2)) {
                this.f49510T = str2;
                this.f49521f.mo22307h(this.f49496H, ya02, 0);
                if (this.f49489A) {
                    Log.m105924i("MicroMsg.Video.AppBrandVideoView", "setVideoPath autoPlay true");
                    mo22277w();
                } else {
                    Log.m105924i("MicroMsg.Video.AppBrandVideoView", "setVideoPath autoPlay false");
                    C17978c cVar = this.f49521f;
                    if (cVar != null) {
                        cVar.mo22310j();
                    }
                }
            }
            C20960b bVar = this.f49491C;
            if (bVar != null) {
                try {
                    JSONObject c = bVar.mo32717c();
                    c.put("timeStamp", System.currentTimeMillis());
                    c.put("url", str2);
                    bVar.mo32716b(new C20960b.C20961a((C20959a) null), c);
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.Video.JsApiVideoCallback", "onVideoCanPlay e=%s", e);
                }
            }
        }
        if (this.f49489A) {
            Log.m105924i("MicroMsg.Video.AppBrandVideoView", "setVideoPath autoPlay true");
            mo22277w();
        } else {
            Log.m105924i("MicroMsg.Video.AppBrandVideoView", "setVideoPath autoPlay false");
            C17978c cVar2 = this.f49521f;
            if (cVar2 != null) {
                cVar2.mo22310j();
            }
        }
        setCover(str);
    }

    /* renamed from: w */
    public void mo22277w() {
        Class cls = C91510h.class;
        Log.m105924i("MicroMsg.Video.AppBrandVideoView", IXWebBroadcastListener.STAGE_START);
        if (!this.f49507R0) {
            Log.m105924i("MicroMsg.Video.AppBrandVideoView", "start, video not prepared");
            this.f49509S0 = true;
        } else {
            Log.m105924i("MicroMsg.Video.AppBrandVideoView", "start, video prepared, reset control flag");
            this.f49509S0 = false;
        }
        if (this.f49521f.isPlaying()) {
            Log.m105924i("MicroMsg.Video.AppBrandVideoView", "start, video is playing");
            return;
        }
        if (this.f49490B) {
            this.f49524i.mo22339E();
        }
        View view = this.f49525j;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", IXWebBroadcastListener.STAGE_START, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", IXWebBroadcastListener.STAGE_START, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f49521f.start();
        if (this.f49523h != null && this.f49524i.mo22367v()) {
            DanmuView danmuView = this.f49523h;
            danmuView.f311208t = 1;
            danmuView.invalidate();
        }
        if (C89909e.m112436a(cls) != null) {
            ((C91510h) C89909e.m112436a(cls)).report(this.f49510T);
        }
    }

    /* renamed from: x */
    public void mo22278x() {
        Log.m105924i("MicroMsg.Video.AppBrandVideoView", "stop");
        if (!this.f49507R0) {
            Log.m105924i("MicroMsg.Video.AppBrandVideoView", "stop, video not prepared");
            this.f49509S0 = false;
        } else if (!this.f49521f.isPlaying()) {
            Log.m105924i("MicroMsg.Video.AppBrandVideoView", "stop, video not playing");
        } else {
            this.f49521f.stop();
            this.f49524i.mo22336B();
            DanmuView danmuView = this.f49523h;
            if (danmuView != null) {
                danmuView.f311208t = 4;
                danmuView.invalidate();
            }
        }
    }

    public AppBrandVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo22229j(context);
    }

    public AppBrandVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo22229j(context);
    }
}
