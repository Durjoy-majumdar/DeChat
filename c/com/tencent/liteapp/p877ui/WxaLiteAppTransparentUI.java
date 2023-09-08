package com.tencent.liteapp.p877ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.liteapp.report.WxaLiteAppStartReport;
import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ext.p313ui.C80847a;
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

/* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI */
public class WxaLiteAppTransparentUI extends WxaLiteAppTransparentBaseUI implements C117728a, LiteAppCenter.ILiteAppUICallback {

    /* renamed from: P */
    public static final /* synthetic */ int f339363P = 0;

    /* renamed from: A */
    public boolean f339364A = false;

    /* renamed from: B */
    public boolean f339365B = true;

    /* renamed from: C */
    public boolean f339366C = true;

    /* renamed from: D */
    public boolean f339367D = false;

    /* renamed from: E */
    public WxaLiteAppStartReport f339368E;

    /* renamed from: F */
    public boolean f339369F = false;

    /* renamed from: G */
    public Handler f339370G;

    /* renamed from: H */
    public String f339371H;

    /* renamed from: I */
    public String[] f339372I;

    /* renamed from: J */
    public String[] f339373J;

    /* renamed from: K */
    public C89325c f339374K;

    /* renamed from: L */
    public final C89325c.C89326a f339375L = new C113409a();

    /* renamed from: M */
    public C56832d f339376M = null;

    /* renamed from: N */
    public int f339377N = -1;

    /* renamed from: p */
    public int f339378p = 0;

    /* renamed from: q */
    public FrameLayout f339379q;

    /* renamed from: r */
    public int f339380r = -1;

    /* renamed from: s */
    public int f339381s = -1;

    /* renamed from: t */
    public int f339382t = -1;

    /* renamed from: u */
    public boolean f339383u = false;

    /* renamed from: v */
    public String f339384v = "";

    /* renamed from: w */
    public long f339385w = -1;

    /* renamed from: x */
    public long f339386x = -1;

    /* renamed from: y */
    public long f339387y = -1;

    /* renamed from: z */
    public float f339388z = 1.0f;

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI$c */
    public class C67641c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f193412d;

        /* renamed from: e */
        public final /* synthetic */ int f193413e;

        public C67641c(long j, int i) {
            this.f193412d = j;
            this.f193413e = i;
        }

        public void run() {
            Vibrator vibrator = (Vibrator) WxaLiteAppTransparentUI.this.getSystemService("vibrator");
            if (vibrator != null) {
                if (Build.VERSION.SDK_INT < 26 || !vibrator.hasAmplitudeControl()) {
                    vibrator.vibrate(this.f193412d);
                } else {
                    vibrator.vibrate(VibrationEffect.createOneShot(this.f193412d, this.f193413e));
                }
            }
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI$f */
    public class C104501f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Intent f309718d;

        public C104501f(Intent intent) {
            this.f309718d = intent;
        }

        public void run() {
            WxaLiteAppTransparentUI.this.setResult(-1, this.f309718d);
            WxaLiteAppTransparentUI.this.finish();
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI$a */
    public class C113409a implements C89325c.C89326a {

        /* renamed from: a */
        public int f339389a = 0;

        /* renamed from: b */
        public boolean f339390b = false;

        /* renamed from: c */
        public int f339391c = 0;

        /* renamed from: d */
        public Handler f339392d = new Handler();

        /* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI$a$a */
        public class C113410a implements Runnable {
            public C113410a() {
            }

            public void run() {
                C118552d g = C118552d.m167207g();
                C113409a aVar = C113409a.this;
                int i = WxaLiteAppTransparentUI.this.f339361o;
                boolean z = aVar.f339390b;
                int i2 = aVar.f339389a;
                aVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("shown", Boolean.valueOf(z));
                hashMap.put("height", Integer.valueOf(i2));
                g.mo183268h(i, "notifyKeyboardChanged", hashMap);
            }
        }

        public C113409a() {
        }

        /* renamed from: a */
        public void mo123689a(boolean z, int i) {
            int[] iArr = new int[2];
            WxaLiteAppTransparentUI.this.f339379q.getLocationInWindow(iArr);
            this.f339389a = i + iArr[1];
            this.f339390b = z;
            C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "keyboardStateChange shown=%b h=%d", Boolean.valueOf(z), Integer.valueOf(this.f339389a));
            WxaLiteAppTransparentUI wxaLiteAppTransparentUI = WxaLiteAppTransparentUI.this;
            wxaLiteAppTransparentUI.getClass();
            boolean c = C89330g.m111651c(wxaLiteAppTransparentUI);
            WxaLiteAppTransparentUI wxaLiteAppTransparentUI2 = WxaLiteAppTransparentUI.this;
            wxaLiteAppTransparentUI2.getClass();
            int b = C89330g.m111650b(wxaLiteAppTransparentUI2);
            WxaLiteAppTransparentUI wxaLiteAppTransparentUI3 = WxaLiteAppTransparentUI.this;
            if (!(c == wxaLiteAppTransparentUI3.f339365B && this.f339391c == b)) {
                wxaLiteAppTransparentUI3.f339365B = c;
                LiteAppCenter.setSystemBarHeight(wxaLiteAppTransparentUI3.f339385w, -1.0f, (float) b, true);
                C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "onKeyboardStateChanged mShown=%b isShowNavigationBar=%b navigationBarHeight=%d", Boolean.valueOf(this.f339390b), Boolean.valueOf(WxaLiteAppTransparentUI.this.f339365B), Integer.valueOf(b));
            }
            this.f339391c = b;
            this.f339392d.postDelayed(new C113410a(), 35);
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI$b */
    public class C113411b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f339395d;

        public C113411b(long j) {
            this.f339395d = j;
        }

        public void run() {
            Vibrator vibrator = (Vibrator) WxaLiteAppTransparentUI.this.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(this.f339395d);
            }
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI$d */
    public class C113412d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f339397d;

        public C113412d(boolean z) {
            this.f339397d = z;
        }

        public void run() {
            WxaLiteAppTransparentUI wxaLiteAppTransparentUI = WxaLiteAppTransparentUI.this;
            boolean z = this.f339397d;
            wxaLiteAppTransparentUI.f339367D = z;
            if (z) {
                wxaLiteAppTransparentUI.getWindow().addFlags(128);
            } else {
                wxaLiteAppTransparentUI.getWindow().clearFlags(128);
            }
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI$e */
    public class C113413e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Method f339399d;

        /* renamed from: e */
        public final /* synthetic */ C117396b f339400e;

        /* renamed from: f */
        public final /* synthetic */ Object[] f339401f;

        public C113413e(WxaLiteAppTransparentUI wxaLiteAppTransparentUI, Method method, C117396b bVar, Object[] objArr) {
            this.f339399d = method;
            this.f339400e = bVar;
            this.f339401f = objArr;
        }

        public void run() {
            try {
                this.f339399d.invoke(this.f339400e, this.f339401f);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI$g */
    public class C113414g extends Handler {
        public C113414g(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                WxaLiteAppTransparentUI.m155258I7(WxaLiteAppTransparentUI.this, "openLiteAppANR");
            } else if (i == 2) {
                WxaLiteAppTransparentUI.m155258I7(WxaLiteAppTransparentUI.this, "openLiteAppLoadingError");
            }
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI$h */
    public class C113415h implements View.OnAttachStateChangeListener {
        public C113415h() {
        }

        public void onViewAttachedToWindow(View view) {
            C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "content view attach to Window", new Object[0]);
            WxaLiteAppTransparentUI wxaLiteAppTransparentUI = WxaLiteAppTransparentUI.this;
            int i = WxaLiteAppTransparentUI.f339363P;
            wxaLiteAppTransparentUI.mo169873N7();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI$i */
    public class C113416i implements ViewTreeObserver.OnGlobalLayoutListener {
        public C113416i() {
        }

        public void onGlobalLayout() {
            WxaLiteAppTransparentUI wxaLiteAppTransparentUI = WxaLiteAppTransparentUI.this;
            wxaLiteAppTransparentUI.f339364A = wxaLiteAppTransparentUI.getResources().getConfiguration().orientation == 2;
            C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "onGlobalLayout activityId=%d size=%d,%d", Long.valueOf(WxaLiteAppTransparentUI.this.f339387y), Integer.valueOf(WxaLiteAppTransparentUI.this.f339379q.getWidth()), Integer.valueOf(WxaLiteAppTransparentUI.this.f339379q.getHeight()));
            WxaLiteAppTransparentUI.this.mo169871L7(true);
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI$j */
    public class C113417j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f339405d;

        public C113417j(int i) {
            this.f339405d = i;
        }

        public void run() {
            WxaLiteAppTransparentUI wxaLiteAppTransparentUI = WxaLiteAppTransparentUI.this;
            int i = this.f339405d;
            int i2 = WxaLiteAppTransparentUI.f339363P;
            wxaLiteAppTransparentUI.mo169872M7(i);
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI$k */
    public class C113418k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f339407d;

        public C113418k(int i) {
            this.f339407d = i;
        }

        public void run() {
            WxaLiteAppTransparentUI wxaLiteAppTransparentUI = WxaLiteAppTransparentUI.this;
            int i = this.f339407d;
            int i2 = WxaLiteAppTransparentUI.f339363P;
            if (i == 0) {
                wxaLiteAppTransparentUI.setRequestedOrientation(1);
            } else if (i == 1) {
                wxaLiteAppTransparentUI.setRequestedOrientation(10);
            } else if (i == 2) {
                wxaLiteAppTransparentUI.setRequestedOrientation(1);
            } else if (i == 3) {
                wxaLiteAppTransparentUI.setRequestedOrientation(6);
            } else {
                wxaLiteAppTransparentUI.getClass();
            }
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI$l */
    public class C113419l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LiteAppCenter.PageInfo f339409d;

        public C113419l(LiteAppCenter.PageInfo pageInfo) {
            this.f339409d = pageInfo;
        }

        public void run() {
            WxaLiteAppTransparentUI.this.setFlags(this.f339409d.flags);
            WxaLiteAppTransparentUI.this.setPageOrientation(this.f339409d.pageOrientation);
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI$m */
    public class C113420m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f339411d;

        public C113420m(boolean z) {
            this.f339411d = z;
        }

        public void run() {
            WxaLiteAppTransparentUI.this.f339354e.mo180441e(Boolean.valueOf(this.f339411d).booleanValue());
        }
    }

    /* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI$n */
    public class C113421n implements Runnable {
        public C113421n() {
        }

        public void run() {
            WxaLiteAppTransparentUI.this.finish();
        }
    }

    /* renamed from: I7 */
    public static void m155258I7(WxaLiteAppTransparentUI wxaLiteAppTransparentUI, String str) {
        wxaLiteAppTransparentUI.getClass();
        try {
            if (LiteAppCenter.mCallback != null) {
                String stringExtra = wxaLiteAppTransparentUI.getIntent().getStringExtra(SearchIntents.EXTRA_QUERY);
                String stringExtra2 = wxaLiteAppTransparentUI.getIntent().getStringExtra("page");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", wxaLiteAppTransparentUI.f339384v);
                jSONObject.put("appUuid", String.valueOf(wxaLiteAppTransparentUI.f339378p));
                jSONObject.put("page", stringExtra2);
                jSONObject.put(SearchIntents.EXTRA_QUERY, stringExtra);
                LiteAppCenter.mCallback.dataReporting(str, jSONObject.toString());
            }
        } catch (JSONException e) {
            C88718b.m110680b("WxaLiteApp.WxaLiteAppTransparentUI", e.toString(), new Object[0]);
        }
    }

    /* renamed from: G7 */
    public View mo169865G7() {
        View G7 = super.mo169865G7();
        C89320b bVar = new C89320b(this, G7);
        this.f339379q = bVar;
        bVar.addView(G7, 0, new ViewGroup.LayoutParams(-1, -1));
        int i = C90824b.m113902b(this).y;
        ((C89320b) this.f339379q).setForceHeight(C90824b.m113902b(this).y);
        C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "initView height:%d", Integer.valueOf(i));
        return this.f339379q;
    }

    /* renamed from: J7 */
    public boolean mo150202J7() {
        return C90824b.m113904d(getResources());
    }

    /* renamed from: K7 */
    public final void mo169870K7(WxaLiteAppStartReport wxaLiteAppStartReport) {
        if (!this.f339369F) {
            this.f339369F = true;
            try {
                C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "reportStartLiteApp %s", wxaLiteAppStartReport.mo169793a());
                LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = LiteAppCenter.mCallback;
                if (iWxaLiteAppCallback != null) {
                    iWxaLiteAppCallback.dataReporting("startLiteAppTimeLine", wxaLiteAppStartReport.mo169793a());
                }
            } catch (Exception e) {
                C88718b.m110680b("WxaLiteApp.WxaLiteAppTransparentUI", e.toString(), new Object[0]);
            }
        }
    }

    /* renamed from: L7 */
    public final void mo169871L7(boolean z) {
        LiteAppCenter.setIsHalfScreen(this.f339385w, false);
        Point b = C90824b.m113902b(this);
        Context context = C117147b.f350981b;
        if (context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i = b.x;
            int i2 = b.y;
            if (z) {
                int height = this.f339379q.getHeight();
                if (height >= i2 || !this.f339366C) {
                    if (!this.f339366C) {
                        this.f339366C = true;
                        HashMap hashMap = new HashMap();
                        hashMap.put("activityId", getFlutterViewId());
                        hashMap.put("with", Boolean.TRUE);
                        C118552d.m167207g().mo183268h(this.f339361o, "withNavigationBar", hashMap);
                    }
                } else if (Math.abs(C89330g.m111650b(this) - (i2 - height)) < 10) {
                    this.f339366C = false;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("activityId", getFlutterViewId());
                    hashMap2.put("with", Boolean.FALSE);
                    C118552d.m167207g().mo183268h(this.f339361o, "withNavigationBar", hashMap2);
                }
            }
            float f = displayMetrics.density;
            int b2 = C89330g.m111650b(this);
            int e = C89330g.m111653e(this);
            float f2 = ((float) 48) * f;
            boolean z2 = getResources().getConfiguration().orientation == 2;
            this.f339364A = z2;
            if (z2) {
                LiteAppCenter.setSafeAreaInsets(this.f339385w, (float) e, 0.0f, (float) b2, 0.0f, false);
                b2 = 0;
                e = 0;
            }
            LiteAppCenter.setDisplayParams(this.f339385w, ((float) i) / f, ((float) i2) / f, ((float) b.x) / f, ((float) b.y) / f, displayMetrics.densityDpi, f, f2 / f, ((float) e) / f, ((float) b2) / f);
            C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "updateLvCppDisplayParams SetDisplayParams w=%d h=%d screen=%d,%d densityDpi=%d density=%f", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(b.x), Integer.valueOf(b.y), Integer.valueOf(displayMetrics.densityDpi), Float.valueOf(displayMetrics.density));
            return;
        }
        C87412m.m108603p("appContext");
        throw null;
    }

    /* renamed from: M7 */
    public final void mo169872M7(int i) {
        this.f339380r = i;
        C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "setWindowFlags mFlags=%d mWindowFlags=%d", Integer.valueOf(i), Integer.valueOf(this.f339381s));
        if (this.f339381s > 0) {
            getWindow().clearFlags(this.f339381s);
            this.f339381s = -1;
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
    public final void mo169873N7() {
        if (this.f339379q != null) {
            C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "addOnGlobalLayoutListener activityId=%d", Long.valueOf(this.f339387y));
            this.f339379q.getViewTreeObserver().addOnGlobalLayoutListener(new C113416i());
        }
    }

    /* renamed from: Z3 */
    public void mo95219Z3() {
        C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "openApp appUuid: " + this.f339378p, new Object[0]);
        this.f339370G.removeMessages(2);
        this.f339356g = true;
        this.f339360n.setVisibility(4);
    }

    /* renamed from: b1 */
    public void mo95220b1(Map map) {
        C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "openWebView", new Object[0]);
    }

    public void callDynamicModule(Method method, C117396b bVar, Object[] objArr) {
        runOnUiThread(new C113413e(this, method, bVar, objArr));
    }

    public void closeWindow(Intent intent) {
        new Handler(getMainLooper()).post(new C104501f(intent));
    }

    /* renamed from: d6 */
    public void mo95221d6() {
        mo169872M7(this.f339382t);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public int getDataUuid() {
        return this.f339377N;
    }

    public Bundle getExtraData() {
        if (getIntent().hasExtra("extraData")) {
            return getIntent().getBundleExtra("extraData");
        }
        return null;
    }

    public String getFlutterViewId() {
        C88718b.m110679a("WxaLiteApp.WxaLiteAppTransparentUI", "getFlutterViewId %s", Long.valueOf(this.f339387y));
        return String.valueOf(this.f339387y);
    }

    public String getFlutterViewName() {
        return String.valueOf(this.f339386x);
    }

    public Map getFlutterViewParams() {
        if (this.f339359j != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("activityId", Long.valueOf(this.f339359j.appUuid));
            hashMap.put("appId", this.f339359j.appId);
            hashMap.put("appPtr", Long.valueOf(this.f339359j.appPtr));
            hashMap.put("pageViewId", Long.valueOf(this.f339359j.pageId));
            hashMap.put("basePath", this.f339359j.basePath);
            hashMap.put("pageRenderPtr", Long.valueOf(this.f339359j.renderId));
            hashMap.put("flags", Integer.valueOf(this.f339359j.flags));
            hashMap.put("success", Integer.valueOf(this.f339359j.success));
            hashMap.put("startTime", Long.valueOf(System.currentTimeMillis()));
            return hashMap;
        }
        super.getFlutterViewParams();
        return null;
    }

    public C56832d getStore() {
        return this.f339376M;
    }

    public LiteAppCenter.SystemInfo getSystemInfo() {
        LiteAppCenter.SystemInfo systemInfo = LiteAppCenter.mCallback.getSystemInfo();
        systemInfo.appId = this.f339384v;
        systemInfo.isHalfScreen = false;
        return systemInfo;
    }

    public boolean hasCutOut() {
        return C90824b.m113903c(this, false);
    }

    public void hideKeyboard() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f339379q.getWindowToken(), 0);
    }

    /* renamed from: m2 */
    public void mo95223m2(boolean z) {
    }

    public void navigateBack(boolean z) {
        new Handler(getMainLooper()).post(new C113420m(z));
    }

    public void onCheckSumFail(String str, List<String> list) {
        for (String str2 : list) {
            C88718b.m110680b("WxaLiteApp.WxaLiteAppTransparentUI", "Check Sum Fail, appId: %s, path: %s", str, str2);
        }
        new Handler(getMainLooper()).post(new C113421n());
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean J7 = mo150202J7();
        if (J7 != this.f339383u) {
            C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "DarkMode change %b", Boolean.valueOf(J7));
            this.f339383u = J7;
            LiteAppCenter.updateDarkMode(J7);
        }
        int i = configuration.orientation;
        if (i == 2 && !this.f339364A) {
            this.f339364A = true;
            mo169866H7();
            int i2 = this.f339380r;
            if (i2 != 5 && i2 != 7) {
                getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 4100);
            }
        } else if (i != 1 || !this.f339364A) {
            float f = configuration.fontScale;
            if (f != this.f339388z && LiteAppCenter.fontScaleFollowSystem) {
                C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "fontScale change %b", Float.valueOf(f));
                float f2 = configuration.fontScale;
                this.f339388z = f2;
                LiteAppCenter.updateFontScale(f2);
            }
        } else {
            this.f339364A = false;
            mo169866H7();
            int i3 = this.f339380r;
            if (i3 != 5 && i3 != 7) {
                getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & -4101);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z = false;
        if (!LiteAppCenter.isInitialized) {
            C88718b.m110680b("WxaLiteApp.WxaLiteAppTransparentUI", "LiteAppCenter has no init.", new Object[0]);
            super.onCreate(bundle);
            finish();
            return;
        }
        if (getIntent().hasExtra("LiteApp")) {
            this.f339355f = (WxaLiteAppInfo) getIntent().getParcelableExtra("LiteApp");
        }
        if (getIntent().hasExtra("pageInfo")) {
            this.f339359j = (LiteAppCenter.PageInfo) getIntent().getParcelableExtra("pageInfo");
        }
        if (this.f339355f == null) {
            C88718b.m110680b("WxaLiteApp.WxaLiteAppTransparentUI", "no WxaLiteAppInfo!", new Object[0]);
            finish();
            return;
        }
        C113414g gVar = new C113414g(Looper.getMainLooper());
        this.f339370G = gVar;
        gVar.sendEmptyMessageDelayed(1, 10000);
        this.f339370G.sendEmptyMessageDelayed(2, 8000);
        int genAppUuid = LiteAppCenter.genAppUuid();
        this.f339378p = genAppUuid;
        C56832d dVar = this.f339376M;
        if (dVar != null) {
            dVar.f162865b = genAppUuid;
        }
        this.f339387y = (long) genAppUuid;
        this.f339386x = 0;
        if (getIntent().hasExtra("bundle")) {
            Bundle bundleExtra = getIntent().getBundleExtra("bundle");
            if (bundleExtra.containsKey("nextAnimIn")) {
                bundleExtra.getInt("nextAnimIn", 0);
            }
            if (bundleExtra.containsKey("currentAnimOut")) {
                bundleExtra.getInt("currentAnimOut", 0);
            }
            overridePendingTransition(C0966R.C0968anim.f2531g7, 0);
            if (bundleExtra.containsKey("transparent")) {
                boolean z2 = bundleExtra.getBoolean("transparent", false);
                this.f339357h = z2;
                if (z2) {
                    C80847a.m98692a(this, (C80847a.C80849b) null);
                    setTheme(C0966R.style.f361684a50);
                }
            }
            if (bundleExtra.containsKey("openWithNewTab")) {
                bundleExtra.getBoolean("openWithNewTab", false);
            }
            if (bundleExtra.containsKey("sourceType")) {
                this.f339371H = bundleExtra.getString("sourceType");
            }
            if (bundleExtra.containsKey("enableActions")) {
                this.f339372I = bundleExtra.getStringArray("enableActions");
            }
            if (bundleExtra.containsKey("enableViews")) {
                this.f339373J = bundleExtra.getStringArray("enableViews");
            }
        }
        super.onCreate(bundle);
        this.f339377N = getIntent().getIntExtra("dataUuid", -1);
        LiteAppCenter.setUICallback(this.f339378p, this);
        LiteAppCenter.setLocale(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        this.f339365B = C89330g.m111651c(this);
        boolean z3 = getResources().getConfiguration().orientation == 2;
        this.f339364A = z3;
        C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "onCreate isHorzontal=%b isShowNavigationBar=%b", Boolean.valueOf(z3), Boolean.valueOf(this.f339365B));
        this.f339368E = new WxaLiteAppStartReport();
        if (getIntent().hasExtra("report")) {
            this.f339368E = (WxaLiteAppStartReport) getIntent().getParcelableExtra("report");
        }
        this.f339368E.f339257D = System.currentTimeMillis();
        boolean J7 = mo150202J7();
        this.f339383u = J7;
        LiteAppCenter.updateDarkMode(J7);
        float f = LiteAppCenter.fontScaleFollowSystem ? getResources().getConfiguration().fontScale : LiteAppCenter.fontScale;
        this.f339388z = f;
        LiteAppCenter.updateFontScale(f);
        String stringExtra = getIntent().getStringExtra(SearchIntents.EXTRA_QUERY);
        String stringExtra2 = getIntent().getStringExtra("page");
        WxaLiteAppInfo wxaLiteAppInfo = this.f339355f;
        if (wxaLiteAppInfo != null) {
            this.f339384v = wxaLiteAppInfo.f339290d;
            C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "Use WxaLiteAppInfo appId: " + this.f339384v, new Object[0]);
            C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "Use WxaLiteAppInfo start ShowView", new Object[0]);
            if (TextUtils.isEmpty(stringExtra2)) {
                WxaLiteAppInfo wxaLiteAppInfo2 = this.f339355f;
                LiteAppCenter.showIndexView(wxaLiteAppInfo2.f339290d, wxaLiteAppInfo2.f339295i, wxaLiteAppInfo2.f339294h, stringExtra, this.f339361o, this.f339378p, this.f339357h, this.f339371H, this.f339372I, this.f339373J);
            } else {
                WxaLiteAppInfo wxaLiteAppInfo3 = this.f339355f;
                LiteAppCenter.showView(wxaLiteAppInfo3.f339290d, stringExtra2, stringExtra, wxaLiteAppInfo3.f339295i, wxaLiteAppInfo3.f339294h, this.f339361o, this.f339378p, this.f339357h, this.f339371H, this.f339372I, this.f339373J);
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
        FrameLayout frameLayout = this.f339379q;
        if (frameLayout != null) {
            C89325c b = C89320b.m111641b(frameLayout);
            this.f339374K = b;
            C89325c.C89326a aVar = this.f339375L;
            if (aVar == null) {
                b.getClass();
            } else if (!b.f257297f.contains(aVar)) {
                b.f257297f.add(aVar);
            }
        }
        FrameLayout frameLayout2 = this.f339379q;
        if (frameLayout2 == null) {
            return;
        }
        if (frameLayout2.isAttachedToWindow()) {
            mo169873N7();
        } else {
            this.f339379q.addOnAttachStateChangeListener(new C113415h());
        }
    }

    public void onCreateLitePageViewFinish(LiteAppCenter.PageInfo pageInfo) {
        C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "onCreateLitePageViewFinish appUuid: " + this.f339378p, new Object[0]);
        this.f339359j = pageInfo;
        this.f339370G.removeMessages(1);
        WxaLiteAppStartReport wxaLiteAppStartReport = this.f339368E;
        long currentTimeMillis = System.currentTimeMillis();
        WxaLiteAppStartReport wxaLiteAppStartReport2 = this.f339368E;
        wxaLiteAppStartReport.f339258E = currentTimeMillis - wxaLiteAppStartReport2.f339257D;
        wxaLiteAppStartReport2.f339256C = pageInfo.success;
        long currentTimeMillis2 = System.currentTimeMillis();
        WxaLiteAppStartReport wxaLiteAppStartReport3 = this.f339368E;
        wxaLiteAppStartReport2.f339259F = currentTimeMillis2 - wxaLiteAppStartReport3.f339266i;
        if (wxaLiteAppStartReport3.f339260G != 0) {
            mo169870K7(wxaLiteAppStartReport3);
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
                    this.f339384v = valueOf;
                }
            }
            if (hashMap.containsKey("appPtr")) {
                this.f339385w = Long.valueOf(hashMap.get("appPtr").toString()).longValue();
            }
            if (hashMap.containsKey("pageViewId")) {
                this.f339386x = Long.valueOf(hashMap.get("pageViewId").toString()).longValue();
            }
            if (hashMap.containsKey("activityId")) {
                this.f339387y = Long.valueOf(hashMap.get("activityId").toString()).longValue();
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
            this.f339380r = i;
        }
        setPageOrientation(pageInfo.pageOrientation);
        setFlags(pageInfo.flags);
        mo169871L7(false);
    }

    public void onDestroy() {
        C89325c.C89326a aVar;
        C89325c cVar = this.f339374K;
        if (!(cVar == null || (aVar = this.f339375L) == null)) {
            cVar.f257297f.remove(aVar);
        }
        Handler handler = this.f339370G;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        super.onDestroy();
        LiteAppCenter.unsetUICallback(this.f339378p, this);
    }

    public void onPause() {
        mo169866H7();
        super.onPause();
        if (this.f339367D) {
            getWindow().clearFlags(128);
        }
    }

    public void onResume() {
        mo169866H7();
        C38867b.C38868a aVar = C38867b.f104768a;
        C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "TimeRecord startLiteApp %s %d", this.f339384v, Long.valueOf(aVar.mo61814a("startLiteApp" + this.f339384v)));
        super.onResume();
        if (this.f339367D) {
            getWindow().addFlags(128);
        }
    }

    public void onShowPageTimeStamp(long j, long j2) {
        WxaLiteAppStartReport wxaLiteAppStartReport = this.f339368E;
        if (wxaLiteAppStartReport != null) {
            long currentTimeMillis = System.currentTimeMillis();
            WxaLiteAppStartReport wxaLiteAppStartReport2 = this.f339368E;
            wxaLiteAppStartReport.f339260G = currentTimeMillis - wxaLiteAppStartReport2.f339266i;
            if (wxaLiteAppStartReport2.f339259F != 0) {
                mo169870K7(wxaLiteAppStartReport2);
                return;
            }
            return;
        }
        C88718b.m110682d("WxaLiteApp.WxaLiteAppTransparentUI", "onShowPageTimeStamp reportStartLiteApp fail. report is null.", new Object[0]);
    }

    public void onStart() {
        super.onStart();
        LiteAppCenter.onForeground(this.f339378p);
    }

    public void onStop() {
        super.onStop();
        LiteAppCenter.onBackground(this.f339378p);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            mo169872M7(this.f339380r);
        }
    }

    /* renamed from: p */
    public void mo95225p() {
        this.f339382t = this.f339380r;
        mo169872M7(7);
    }

    public void setFlags(int i) {
        C88718b.m110681c("WxaLiteApp.WxaLiteAppTransparentUI", "setFlags %d old=%d", Integer.valueOf(i), Integer.valueOf(this.f339380r));
        if (this.f339380r != i) {
            runOnUiThread(new C113417j(i));
        }
    }

    public void setKeepScreenOn(boolean z) {
        runOnUiThread(new C113412d(z));
    }

    public void setPageOrientation(int i) {
        runOnUiThread(new C113418k(i));
    }

    public void setStore(C56832d dVar) {
        this.f339376M = dVar;
        dVar.f162865b = this.f339378p;
    }

    public void showPage(LiteAppCenter.PageInfo pageInfo) {
        this.f339359j = pageInfo;
        this.f339386x = pageInfo.pageId;
        runOnUiThread(new C113419l(pageInfo));
    }

    public void vibrateLong(long j) {
        runOnUiThread(new C113411b(j));
    }

    public void vibrateShort(long j, int i) {
        runOnUiThread(new C67641c(j, i));
    }
}
