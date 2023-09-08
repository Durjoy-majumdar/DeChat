package com.tencent.liteapp.p877ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.liteapp.report.WxaLiteAppStartReport;
import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ext.p313ui.SwipeBackLayout;
import com.tencent.p014mm.plugin.lite.C56832d;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import gy3.C87412m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p1005ma.C88718b;
import p1020pa.C89320b;
import p1020pa.C89325c;
import p1020pa.C89330g;
import p1056vl.C90824b;
import p1198ka.C117396b;
import p1204oa.C117728a;
import p979ia.C117147b;
import tw3.C118552d;
import xw3.C38867b;

/* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI */
public class WxaLiteAppUI extends WxaLiteAppBaseUI implements C117728a, LiteAppCenter.ILiteAppUICallback {

    /* renamed from: X */
    public static final /* synthetic */ int f339414X = 0;

    /* renamed from: A */
    public long f339415A = -1;

    /* renamed from: B */
    public long f339416B = -1;

    /* renamed from: C */
    public float f339417C = 1.0f;

    /* renamed from: D */
    public int f339418D = -1;

    /* renamed from: E */
    public int f339419E = C0966R.C0968anim.f2430ga;

    /* renamed from: F */
    public int f339420F = -1;

    /* renamed from: G */
    public int f339421G = C0966R.C0968anim.f2496ek;

    /* renamed from: H */
    public boolean f339422H = false;

    /* renamed from: I */
    public boolean f339423I = true;

    /* renamed from: J */
    public boolean f339424J = true;

    /* renamed from: K */
    public boolean f339425K = false;

    /* renamed from: L */
    public boolean f339426L = false;

    /* renamed from: M */
    public WxaLiteAppStartReport f339427M;

    /* renamed from: N */
    public boolean f339428N = false;

    /* renamed from: P */
    public Handler f339429P;

    /* renamed from: Q */
    public String f339430Q;

    /* renamed from: R */
    public String[] f339431R;

    /* renamed from: S */
    public String[] f339432S;

    /* renamed from: T */
    public C89325c f339433T;

    /* renamed from: U */
    public final C89325c.C89326a f339434U = new C113422a();

    /* renamed from: V */
    public C56832d f339435V = null;

    /* renamed from: W */
    public int f339436W = -1;

    /* renamed from: s */
    public int f339437s = 0;

    /* renamed from: t */
    public FrameLayout f339438t;

    /* renamed from: u */
    public int f339439u = -1;

    /* renamed from: v */
    public int f339440v = -1;

    /* renamed from: w */
    public int f339441w = -1;

    /* renamed from: x */
    public boolean f339442x = false;

    /* renamed from: y */
    public String f339443y = "";

    /* renamed from: z */
    public long f339444z = -1;

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI$c */
    public class C67642c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f193415d;

        /* renamed from: e */
        public final /* synthetic */ int f193416e;

        public C67642c(long j, int i) {
            this.f193415d = j;
            this.f193416e = i;
        }

        public void run() {
            Vibrator vibrator = (Vibrator) WxaLiteAppUI.this.getSystemService("vibrator");
            if (vibrator != null) {
                if (Build.VERSION.SDK_INT < 26 || !vibrator.hasAmplitudeControl()) {
                    vibrator.vibrate(this.f193415d);
                } else {
                    vibrator.vibrate(VibrationEffect.createOneShot(this.f193415d, this.f193416e));
                }
            }
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI$f */
    public class C104502f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Intent f309720d;

        public C104502f(Intent intent) {
            this.f309720d = intent;
        }

        public void run() {
            WxaLiteAppUI.this.setResult(-1, this.f309720d);
            WxaLiteAppUI.this.finish();
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI$a */
    public class C113422a implements C89325c.C89326a {

        /* renamed from: a */
        public int f339445a = 0;

        /* renamed from: b */
        public boolean f339446b = false;

        /* renamed from: c */
        public int f339447c = 0;

        /* renamed from: d */
        public Handler f339448d = new Handler();

        /* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI$a$a */
        public class C113423a implements Runnable {
            public C113423a() {
            }

            public void run() {
                C118552d g = C118552d.m167207g();
                C113422a aVar = C113422a.this;
                int i = WxaLiteAppUI.this.f339322r;
                boolean z = aVar.f339446b;
                int i2 = aVar.f339445a;
                aVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("shown", Boolean.valueOf(z));
                hashMap.put("height", Integer.valueOf(i2));
                g.mo183268h(i, "notifyKeyboardChanged", hashMap);
            }
        }

        public C113422a() {
        }

        /* renamed from: a */
        public void mo123689a(boolean z, int i) {
            int[] iArr = new int[2];
            WxaLiteAppUI.this.f339438t.getLocationInWindow(iArr);
            this.f339445a = i + iArr[1];
            this.f339446b = z;
            C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "keyboardStateChange shown=%b h=%d", Boolean.valueOf(z), Integer.valueOf(this.f339445a));
            WxaLiteAppUI wxaLiteAppUI = WxaLiteAppUI.this;
            wxaLiteAppUI.getClass();
            boolean c = C89330g.m111651c(wxaLiteAppUI);
            WxaLiteAppUI wxaLiteAppUI2 = WxaLiteAppUI.this;
            wxaLiteAppUI2.getClass();
            int b = C89330g.m111650b(wxaLiteAppUI2);
            WxaLiteAppUI wxaLiteAppUI3 = WxaLiteAppUI.this;
            if (!(c == wxaLiteAppUI3.f339423I && this.f339447c == b)) {
                wxaLiteAppUI3.f339423I = c;
                LiteAppCenter.setSystemBarHeight(wxaLiteAppUI3.f339444z, -1.0f, (float) b, true);
                C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "onKeyboardStateChanged mShown=%b isShowNavigationBar=%b navigationBarHeight=%d", Boolean.valueOf(this.f339446b), Boolean.valueOf(WxaLiteAppUI.this.f339423I), Integer.valueOf(b));
            }
            this.f339447c = b;
            this.f339448d.postDelayed(new C113423a(), 35);
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI$b */
    public class C113424b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f339451d;

        public C113424b(long j) {
            this.f339451d = j;
        }

        public void run() {
            Vibrator vibrator = (Vibrator) WxaLiteAppUI.this.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(this.f339451d);
            }
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI$d */
    public class C113425d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f339453d;

        public C113425d(boolean z) {
            this.f339453d = z;
        }

        public void run() {
            WxaLiteAppUI wxaLiteAppUI = WxaLiteAppUI.this;
            boolean z = this.f339453d;
            wxaLiteAppUI.f339425K = z;
            if (z) {
                wxaLiteAppUI.getWindow().addFlags(128);
            } else {
                wxaLiteAppUI.getWindow().clearFlags(128);
            }
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI$e */
    public class C113426e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Method f339455d;

        /* renamed from: e */
        public final /* synthetic */ C117396b f339456e;

        /* renamed from: f */
        public final /* synthetic */ Object[] f339457f;

        public C113426e(WxaLiteAppUI wxaLiteAppUI, Method method, C117396b bVar, Object[] objArr) {
            this.f339455d = method;
            this.f339456e = bVar;
            this.f339457f = objArr;
        }

        public void run() {
            try {
                this.f339455d.invoke(this.f339456e, this.f339457f);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI$g */
    public class C113427g extends Handler {
        public C113427g(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                WxaLiteAppUI.m155271I7(WxaLiteAppUI.this, "openLiteAppANR");
            } else if (i == 2) {
                WxaLiteAppUI.m155271I7(WxaLiteAppUI.this, "openLiteAppLoadingError");
            }
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI$h */
    public class C113428h implements View.OnAttachStateChangeListener {
        public C113428h() {
        }

        public void onViewAttachedToWindow(View view) {
            C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "content view attach to Window", new Object[0]);
            WxaLiteAppUI wxaLiteAppUI = WxaLiteAppUI.this;
            int i = WxaLiteAppUI.f339414X;
            wxaLiteAppUI.mo169891N7();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI$i */
    public class C113429i implements ViewTreeObserver.OnGlobalLayoutListener {
        public C113429i() {
        }

        public void onGlobalLayout() {
            WxaLiteAppUI wxaLiteAppUI = WxaLiteAppUI.this;
            wxaLiteAppUI.f339422H = wxaLiteAppUI.getResources().getConfiguration().orientation == 2;
            C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "onGlobalLayout activityId=%d size=%d,%d", Long.valueOf(WxaLiteAppUI.this.f339416B), Integer.valueOf(WxaLiteAppUI.this.f339438t.getWidth()), Integer.valueOf(WxaLiteAppUI.this.f339438t.getHeight()));
            WxaLiteAppUI.this.mo169889L7(true);
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI$j */
    public class C113430j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f339461d;

        public C113430j(int i) {
            this.f339461d = i;
        }

        public void run() {
            WxaLiteAppUI wxaLiteAppUI = WxaLiteAppUI.this;
            int i = this.f339461d;
            int i2 = WxaLiteAppUI.f339414X;
            wxaLiteAppUI.mo169890M7(i);
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI$k */
    public class C113431k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f339463d;

        public C113431k(int i) {
            this.f339463d = i;
        }

        public void run() {
            WxaLiteAppUI wxaLiteAppUI = WxaLiteAppUI.this;
            int i = this.f339463d;
            int i2 = WxaLiteAppUI.f339414X;
            if (i == 0) {
                wxaLiteAppUI.setRequestedOrientation(1);
            } else if (i == 1) {
                wxaLiteAppUI.setRequestedOrientation(10);
            } else if (i == 2) {
                wxaLiteAppUI.setRequestedOrientation(1);
            } else if (i == 3) {
                wxaLiteAppUI.setRequestedOrientation(6);
            } else {
                wxaLiteAppUI.getClass();
            }
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI$l */
    public class C113432l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LiteAppCenter.PageInfo f339465d;

        public C113432l(LiteAppCenter.PageInfo pageInfo) {
            this.f339465d = pageInfo;
        }

        public void run() {
            WxaLiteAppUI.this.setFlags(this.f339465d.flags);
            WxaLiteAppUI.this.setPageOrientation(this.f339465d.pageOrientation);
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI$m */
    public class C113433m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f339467d;

        public C113433m(boolean z) {
            this.f339467d = z;
        }

        public void run() {
            WxaLiteAppUI.this.f339314g.mo180441e(Boolean.valueOf(this.f339467d).booleanValue());
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI$n */
    public class C113434n implements Runnable {
        public C113434n() {
        }

        public void run() {
            WxaLiteAppUI.this.finish();
        }
    }

    /* renamed from: I7 */
    public static void m155271I7(WxaLiteAppUI wxaLiteAppUI, String str) {
        wxaLiteAppUI.getClass();
        try {
            if (LiteAppCenter.mCallback != null) {
                String stringExtra = wxaLiteAppUI.getIntent().getStringExtra(SearchIntents.EXTRA_QUERY);
                String stringExtra2 = wxaLiteAppUI.getIntent().getStringExtra("page");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", wxaLiteAppUI.f339443y);
                jSONObject.put("appUuid", String.valueOf(wxaLiteAppUI.f339437s));
                jSONObject.put("page", stringExtra2);
                jSONObject.put(SearchIntents.EXTRA_QUERY, stringExtra);
                LiteAppCenter.mCallback.dataReporting(str, jSONObject.toString());
            }
        } catch (JSONException e) {
            C88718b.m110680b("WxaLiteApp.WxaLiteAppUI", e.toString(), new Object[0]);
        }
    }

    /* renamed from: G7 */
    public View mo169825G7() {
        C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "initView", new Object[0]);
        View G7 = super.mo169825G7();
        C89320b bVar = new C89320b(this, G7);
        this.f339438t = bVar;
        bVar.addView(G7, 0, new ViewGroup.LayoutParams(-1, -1));
        return this.f339438t;
    }

    /* renamed from: J7 */
    public boolean mo150199J7() {
        return C90824b.m113904d(getResources());
    }

    /* renamed from: K7 */
    public final void mo169888K7(WxaLiteAppStartReport wxaLiteAppStartReport) {
        if (!this.f339428N) {
            this.f339428N = true;
            try {
                C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "reportStartLiteApp %s", wxaLiteAppStartReport.mo169793a());
                LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = LiteAppCenter.mCallback;
                if (iWxaLiteAppCallback != null) {
                    iWxaLiteAppCallback.dataReporting("startLiteAppTimeLine", wxaLiteAppStartReport.mo169793a());
                }
            } catch (Exception e) {
                C88718b.m110680b("WxaLiteApp.WxaLiteAppUI", e.toString(), new Object[0]);
            }
        }
    }

    /* renamed from: L7 */
    public final void mo169889L7(boolean z) {
        LiteAppCenter.setIsHalfScreen(this.f339444z, false);
        Point b = C90824b.m113902b(this);
        Context context = C117147b.f350981b;
        if (context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i = b.x;
            int i2 = b.y;
            if (z) {
                int height = this.f339438t.getHeight();
                if (height >= i2 || !this.f339424J) {
                    if (!this.f339424J) {
                        this.f339424J = true;
                        HashMap hashMap = new HashMap();
                        hashMap.put("activityId", getFlutterViewId());
                        hashMap.put("with", Boolean.TRUE);
                        C118552d.m167207g().mo183268h(this.f339322r, "withNavigationBar", hashMap);
                    }
                } else if (Math.abs(C89330g.m111650b(this) - (i2 - height)) < 10) {
                    this.f339424J = false;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("activityId", getFlutterViewId());
                    hashMap2.put("with", Boolean.FALSE);
                    C118552d.m167207g().mo183268h(this.f339322r, "withNavigationBar", hashMap2);
                }
            }
            float f = displayMetrics.density;
            int b2 = C89330g.m111650b(this);
            int e = C89330g.m111653e(this);
            float f2 = ((float) 48) * f;
            boolean z2 = getResources().getConfiguration().orientation == 2;
            this.f339422H = z2;
            if (z2) {
                LiteAppCenter.setSafeAreaInsets(this.f339444z, (float) e, 0.0f, (float) b2, 0.0f, false);
                b2 = 0;
                e = 0;
            }
            LiteAppCenter.setDisplayParams(this.f339444z, ((float) i) / f, ((float) i2) / f, ((float) b.x) / f, ((float) b.y) / f, displayMetrics.densityDpi, f, f2 / f, ((float) e) / f, ((float) b2) / f);
            C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "updateLvCppDisplayParams SetDisplayParams w=%d h=%d screen=%d,%d densityDpi=%d density=%f", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(b.x), Integer.valueOf(b.y), Integer.valueOf(displayMetrics.densityDpi), Float.valueOf(displayMetrics.density));
            return;
        }
        C87412m.m108603p("appContext");
        throw null;
    }

    /* renamed from: M7 */
    public final void mo169890M7(int i) {
        this.f339439u = i;
        C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "setWindowFlags mFlags=%d mWindowFlags=%d", Integer.valueOf(i), Integer.valueOf(this.f339440v));
        if (this.f339440v > 0) {
            getWindow().clearFlags(this.f339440v);
            this.f339440v = -1;
        }
        int i2 = 1792;
        if (i == 5) {
            i2 = 5892;
        } else if (i == 7) {
            i2 = 5894;
        }
        if (getWindow() != null && getWindow().getDecorView() != null) {
            getWindow().getDecorView().setSystemUiVisibility(i2);
        }
    }

    /* renamed from: N7 */
    public final void mo169891N7() {
        if (this.f339438t != null) {
            C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "addOnGlobalLayoutListener activityId=%d", Long.valueOf(this.f339416B));
            this.f339438t.getViewTreeObserver().addOnGlobalLayoutListener(new C113429i());
        }
    }

    /* renamed from: Z3 */
    public void mo95219Z3() {
        C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "openApp appUuid: " + this.f339437s, new Object[0]);
        this.f339429P.removeMessages(2);
        this.f339317j = true;
        this.f339321q.setVisibility(4);
    }

    /* renamed from: b1 */
    public void mo95220b1(Map map) {
        C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "openWebView", new Object[0]);
    }

    public void callDynamicModule(Method method, C117396b bVar, Object[] objArr) {
        runOnUiThread(new C113426e(this, method, bVar, objArr));
    }

    public void closeWindow(Intent intent) {
        new Handler(getMainLooper()).post(new C104502f(intent));
    }

    /* renamed from: d6 */
    public void mo95221d6() {
        mo169890M7(this.f339441w);
    }

    public void finish() {
        super.finish();
        int i = this.f339420F;
        if (i >= 0) {
            overridePendingTransition(this.f339421G, i);
        }
    }

    public int getDataUuid() {
        return this.f339436W;
    }

    public Bundle getExtraData() {
        if (getIntent().hasExtra("extraData")) {
            return getIntent().getBundleExtra("extraData");
        }
        return null;
    }

    public String getFlutterViewId() {
        C88718b.m110679a("WxaLiteApp.WxaLiteAppUI", "getFlutterViewId %s", Long.valueOf(this.f339416B));
        return String.valueOf(this.f339416B);
    }

    public String getFlutterViewName() {
        return String.valueOf(this.f339415A);
    }

    public Map getFlutterViewParams() {
        if (this.f339320p != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("activityId", Long.valueOf(this.f339320p.appUuid));
            hashMap.put("appId", this.f339320p.appId);
            hashMap.put("appPtr", Long.valueOf(this.f339320p.appPtr));
            hashMap.put("pageViewId", Long.valueOf(this.f339320p.pageId));
            hashMap.put("basePath", this.f339320p.basePath);
            hashMap.put("pageRenderPtr", Long.valueOf(this.f339320p.renderId));
            hashMap.put("flags", Integer.valueOf(this.f339320p.flags));
            hashMap.put("success", Integer.valueOf(this.f339320p.success));
            hashMap.put("startTime", Long.valueOf(System.currentTimeMillis()));
            return hashMap;
        }
        super.getFlutterViewParams();
        return null;
    }

    public C56832d getStore() {
        return this.f339435V;
    }

    public LiteAppCenter.SystemInfo getSystemInfo() {
        LiteAppCenter.SystemInfo systemInfo = LiteAppCenter.mCallback.getSystemInfo();
        systemInfo.appId = this.f339443y;
        systemInfo.isHalfScreen = false;
        return systemInfo;
    }

    public boolean hasCutOut() {
        return C90824b.m113903c(this, false);
    }

    public void hideKeyboard() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f339438t.getWindowToken(), 0);
    }

    /* renamed from: m2 */
    public void mo95223m2(boolean z) {
    }

    public void navigateBack(boolean z) {
        new Handler(getMainLooper()).post(new C113433m(z));
    }

    public void onCheckSumFail(String str, List<String> list) {
        for (String str2 : list) {
            C88718b.m110680b("WxaLiteApp.WxaLiteAppUI", "Check Sum Fail, appId: %s, path: %s", str, str2);
        }
        new Handler(getMainLooper()).post(new C113434n());
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean J7 = mo150199J7();
        if (J7 != this.f339442x) {
            C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "DarkMode change %b", Boolean.valueOf(J7));
            this.f339442x = J7;
            LiteAppCenter.updateDarkMode(J7);
        }
        int i = configuration.orientation;
        if (i == 2 && !this.f339422H) {
            this.f339422H = true;
            mo169826H7();
            int i2 = this.f339439u;
            if (i2 != 5 && i2 != 7) {
                getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 4100);
            }
        } else if (i != 1 || !this.f339422H) {
            float f = configuration.fontScale;
            if (f != this.f339417C && LiteAppCenter.fontScaleFollowSystem) {
                C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "fontScale change %b", Float.valueOf(f));
                float f2 = configuration.fontScale;
                this.f339417C = f2;
                LiteAppCenter.updateFontScale(f2);
            }
        } else {
            this.f339422H = false;
            mo169826H7();
            int i3 = this.f339439u;
            if (i3 != 5 && i3 != 7) {
                getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & -4101);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z = false;
        if (!LiteAppCenter.isInitialized) {
            C88718b.m110680b("WxaLiteApp.WxaLiteAppUI", "LiteAppCenter has no init.", new Object[0]);
            super.onCreate(bundle);
            finish();
            return;
        }
        if (getIntent().hasExtra("LiteApp")) {
            this.f339315h = (WxaLiteAppInfo) getIntent().getParcelableExtra("LiteApp");
        }
        if (getIntent().hasExtra("pageInfo")) {
            this.f339320p = (LiteAppCenter.PageInfo) getIntent().getParcelableExtra("pageInfo");
        }
        if (this.f339315h == null) {
            C88718b.m110680b("WxaLiteApp.WxaLiteAppUI", "no WxaLiteAppInfo!", new Object[0]);
            finish();
            return;
        }
        C113427g gVar = new C113427g(Looper.getMainLooper());
        this.f339429P = gVar;
        gVar.sendEmptyMessageDelayed(1, 10000);
        this.f339429P.sendEmptyMessageDelayed(2, 8000);
        int genAppUuid = LiteAppCenter.genAppUuid();
        this.f339437s = genAppUuid;
        C56832d dVar = this.f339435V;
        if (dVar != null) {
            dVar.f162865b = genAppUuid;
        }
        this.f339416B = (long) genAppUuid;
        this.f339415A = 0;
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
        SwipeBackLayout swipeBackLayout = (SwipeBackLayout) LayoutInflater.from(this).inflate(C0966R.C0971layout.cj7, viewGroup, false);
        this.f343911d = swipeBackLayout;
        swipeBackLayout.mo21265a();
        this.f343911d.setFullscreen(true);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().getDecorView().setBackgroundDrawable((Drawable) null);
        View childAt = viewGroup.getChildAt(0);
        childAt.setBackgroundResource(17170445);
        viewGroup.removeView(childAt);
        this.f343911d.addView(childAt);
        this.f343911d.setContentView(childAt);
        viewGroup.addView(this.f343911d);
        this.f343911d.setSwipeGestureDelegate(this);
        if (getIntent().hasExtra("bundle")) {
            Bundle bundleExtra = getIntent().getBundleExtra("bundle");
            this.f339418D = C0966R.C0968anim.f2431g8;
            this.f339420F = C0966R.C0968anim.f2445d8;
            if (bundleExtra.containsKey("nextAnimIn")) {
                this.f339418D = bundleExtra.getInt("nextAnimIn", 0);
                this.f339419E = C0966R.C0968anim.f2333y;
            }
            if (bundleExtra.containsKey("currentAnimOut")) {
                this.f339420F = bundleExtra.getInt("currentAnimOut", 0);
                this.f339421G = C0966R.C0968anim.f2333y;
            }
            if (bundleExtra.containsKey("forbidRightGesture")) {
                boolean z2 = bundleExtra.getBoolean("forbidRightGesture");
                this.f339426L = z2;
                this.f343911d.setForceDisEnable(z2);
            }
            overridePendingTransition(this.f339418D, this.f339419E);
            if (bundleExtra.containsKey("transparent")) {
                boolean z3 = bundleExtra.getBoolean("transparent", false);
                this.f339318n = z3;
                if (z3) {
                    setTheme(C0966R.style.f361684a50);
                }
            }
            if (bundleExtra.containsKey("openWithNewTab")) {
                bundleExtra.getBoolean("openWithNewTab", false);
            }
            if (bundleExtra.containsKey("sourceType")) {
                this.f339430Q = bundleExtra.getString("sourceType");
            }
            if (bundleExtra.containsKey("enableActions")) {
                this.f339431R = bundleExtra.getStringArray("enableActions");
            }
            if (bundleExtra.containsKey("enableViews")) {
                this.f339432S = bundleExtra.getStringArray("enableViews");
            }
        }
        super.onCreate(bundle);
        int i = -1;
        this.f339436W = getIntent().getIntExtra("dataUuid", -1);
        LiteAppCenter.setUICallback(this.f339437s, this);
        LiteAppCenter.setLocale(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        this.f339423I = C89330g.m111651c(this);
        boolean z4 = getResources().getConfiguration().orientation == 2;
        this.f339422H = z4;
        C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "onCreate isHorzontal=%b isShowNavigationBar=%b", Boolean.valueOf(z4), Boolean.valueOf(this.f339423I));
        this.f339427M = new WxaLiteAppStartReport();
        if (getIntent().hasExtra("report")) {
            this.f339427M = (WxaLiteAppStartReport) getIntent().getParcelableExtra("report");
        }
        this.f339427M.f339257D = System.currentTimeMillis();
        boolean J7 = mo150199J7();
        this.f339442x = J7;
        LiteAppCenter.updateDarkMode(J7);
        float f = LiteAppCenter.fontScaleFollowSystem ? getResources().getConfiguration().fontScale : LiteAppCenter.fontScale;
        this.f339417C = f;
        LiteAppCenter.updateFontScale(f);
        String stringExtra = getIntent().getStringExtra(SearchIntents.EXTRA_QUERY);
        String stringExtra2 = getIntent().getStringExtra("page");
        WxaLiteAppInfo wxaLiteAppInfo = this.f339315h;
        if (wxaLiteAppInfo != null) {
            this.f339443y = wxaLiteAppInfo.f339290d;
            C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "Use WxaLiteAppInfo appId: " + this.f339443y, new Object[0]);
            C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "Use WxaLiteAppInfo start ShowView", new Object[0]);
            if (TextUtils.isEmpty(stringExtra2)) {
                WxaLiteAppInfo wxaLiteAppInfo2 = this.f339315h;
                LiteAppCenter.showIndexView(wxaLiteAppInfo2.f339290d, wxaLiteAppInfo2.f339295i, wxaLiteAppInfo2.f339294h, stringExtra, this.f339322r, this.f339437s, this.f339318n, this.f339430Q, this.f339431R, this.f339432S);
            } else {
                WxaLiteAppInfo wxaLiteAppInfo3 = this.f339315h;
                LiteAppCenter.showView(wxaLiteAppInfo3.f339290d, stringExtra2, stringExtra, wxaLiteAppInfo3.f339295i, wxaLiteAppInfo3.f339294h, this.f339322r, this.f339437s, this.f339318n, this.f339430Q, this.f339431R, this.f339432S);
            }
        }
        getWindow().clearFlags(201326592);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(getResources().getColor(C0966R.color.ahe));
        getWindow().setNavigationBarColor(getResources().getColor(C0966R.color.ahe));
        getWindow().setFlags(TPMediaCodecProfileLevel.HEVCMainTierLevel62, TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        if (Build.VERSION.SDK_INT >= 28) {
            z = true;
        }
        if (z) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        FrameLayout frameLayout = this.f339438t;
        if (frameLayout != null) {
            C89325c b = C89320b.m111641b(frameLayout);
            this.f339433T = b;
            C89325c.C89326a aVar = this.f339434U;
            if (aVar == null) {
                b.getClass();
            } else if (!b.f257297f.contains(aVar)) {
                b.f257297f.add(aVar);
            }
        }
        FrameLayout frameLayout2 = this.f339438t;
        if (frameLayout2 != null) {
            if (frameLayout2.isAttachedToWindow()) {
                mo169891N7();
            } else {
                this.f339438t.addOnAttachStateChangeListener(new C113428h());
            }
        }
        FrameLayout frameLayout3 = this.f339438t;
        if (frameLayout3 != null) {
            if (this.f339442x) {
                i = -16777216;
            }
            frameLayout3.setBackgroundColor(i);
        }
    }

    public void onCreateLitePageViewFinish(LiteAppCenter.PageInfo pageInfo) {
        C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "onCreateLitePageViewFinish appUuid: " + this.f339437s, new Object[0]);
        this.f339320p = pageInfo;
        this.f339429P.removeMessages(1);
        WxaLiteAppStartReport wxaLiteAppStartReport = this.f339427M;
        long currentTimeMillis = System.currentTimeMillis();
        WxaLiteAppStartReport wxaLiteAppStartReport2 = this.f339427M;
        wxaLiteAppStartReport.f339258E = currentTimeMillis - wxaLiteAppStartReport2.f339257D;
        wxaLiteAppStartReport2.f339256C = pageInfo.success;
        long currentTimeMillis2 = System.currentTimeMillis();
        WxaLiteAppStartReport wxaLiteAppStartReport3 = this.f339427M;
        wxaLiteAppStartReport2.f339259F = currentTimeMillis2 - wxaLiteAppStartReport3.f339266i;
        if (wxaLiteAppStartReport3.f339260G != 0) {
            mo169888K7(wxaLiteAppStartReport3);
        }
        Map flutterViewParams = getFlutterViewParams();
        if (flutterViewParams != null) {
            HashMap hashMap = (HashMap) flutterViewParams;
            if (hashMap.containsKey("startTime")) {
                Long.valueOf(hashMap.get("startTime").toString()).longValue();
                System.currentTimeMillis();
            }
            if (hashMap.containsKey("appId")) {
                String valueOf = String.valueOf(hashMap.get("appId"));
                if (!TextUtils.isEmpty(valueOf) && !valueOf.equals("null")) {
                    this.f339443y = valueOf;
                }
            }
            if (hashMap.containsKey("appPtr")) {
                this.f339444z = Long.valueOf(hashMap.get("appPtr").toString()).longValue();
            }
            if (hashMap.containsKey("pageViewId")) {
                this.f339415A = Long.valueOf(hashMap.get("pageViewId").toString()).longValue();
            }
            if (hashMap.containsKey("activityId")) {
                this.f339416B = Long.valueOf(hashMap.get("activityId").toString()).longValue();
            }
            if (hashMap.containsKey("pageRenderPtr")) {
                Long.valueOf(hashMap.get("pageRenderPtr").toString()).longValue();
            }
            if (hashMap.containsKey("success")) {
                Long.valueOf(hashMap.get("success").toString()).longValue();
            }
        }
        if (flutterViewParams != null) {
            int i = -1;
            HashMap hashMap2 = (HashMap) flutterViewParams;
            if (hashMap2.containsKey("flags")) {
                try {
                    i = Integer.parseInt(hashMap2.get("flags").toString());
                } catch (Exception unused) {
                }
            }
            this.f339439u = i;
        }
        setPageOrientation(pageInfo.pageOrientation);
        setFlags(pageInfo.flags);
        mo169889L7(false);
    }

    public void onDestroy() {
        C89325c.C89326a aVar;
        C89325c cVar = this.f339433T;
        if (!(cVar == null || (aVar = this.f339434U) == null)) {
            cVar.f257297f.remove(aVar);
        }
        Handler handler = this.f339429P;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        super.onDestroy();
        LiteAppCenter.unsetUICallback(this.f339437s, this);
    }

    public void onPause() {
        mo169826H7();
        super.onPause();
        if (this.f339425K) {
            getWindow().clearFlags(128);
        }
    }

    public void onResume() {
        mo169826H7();
        C38867b.C38868a aVar = C38867b.f104768a;
        C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "TimeRecord startLiteApp %s %d", this.f339443y, Long.valueOf(aVar.mo61814a("startLiteApp" + this.f339443y)));
        super.onResume();
        if (this.f339425K) {
            getWindow().addFlags(128);
        }
    }

    public void onShowPageTimeStamp(long j, long j2) {
        WxaLiteAppStartReport wxaLiteAppStartReport = this.f339427M;
        if (wxaLiteAppStartReport != null) {
            long currentTimeMillis = System.currentTimeMillis();
            WxaLiteAppStartReport wxaLiteAppStartReport2 = this.f339427M;
            wxaLiteAppStartReport.f339260G = currentTimeMillis - wxaLiteAppStartReport2.f339266i;
            if (wxaLiteAppStartReport2.f339259F != 0) {
                mo169888K7(wxaLiteAppStartReport2);
                return;
            }
            return;
        }
        C88718b.m110682d("WxaLiteApp.WxaLiteAppUI", "onShowPageTimeStamp reportStartLiteApp fail. report is null.", new Object[0]);
    }

    public void onStart() {
        super.onStart();
        LiteAppCenter.onForeground(this.f339437s);
    }

    public void onStop() {
        super.onStop();
        LiteAppCenter.onBackground(this.f339437s);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            mo169890M7(this.f339439u);
        }
    }

    /* renamed from: p */
    public void mo95225p() {
        this.f339441w = this.f339439u;
        mo169890M7(7);
    }

    public void setFlags(int i) {
        C88718b.m110681c("WxaLiteApp.WxaLiteAppUI", "setFlags %d old=%d", Integer.valueOf(i), Integer.valueOf(this.f339439u));
        if (this.f339439u != i) {
            runOnUiThread(new C113430j(i));
        }
    }

    public void setKeepScreenOn(boolean z) {
        runOnUiThread(new C113425d(z));
    }

    public void setPageOrientation(int i) {
        runOnUiThread(new C113431k(i));
    }

    public void setStore(C56832d dVar) {
        this.f339435V = dVar;
        dVar.f162865b = this.f339437s;
    }

    public void showPage(LiteAppCenter.PageInfo pageInfo) {
        this.f339320p = pageInfo;
        this.f339415A = pageInfo.pageId;
        runOnUiThread(new C113432l(pageInfo));
    }

    public void vibrateLong(long j) {
        runOnUiThread(new C113424b(j));
    }

    public void vibrateShort(long j, int i) {
        runOnUiThread(new C67642c(j, i));
    }
}
