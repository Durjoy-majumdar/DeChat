package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsAdNativePageLifecycleEvent;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.C96067m3;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C30610e0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44234a0;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import di3.C86312j;
import e00.C45513i0;
import e00.C7580y;
import fy3.C32228q;
import gc0.C20828a;
import h81.C32735h;
import hc0.C20937c;
import j20.C117292a;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import org.json.JSONObject;
import p156gj.C87203t;
import p447aw.C103918d;
import ps2.C100891r;
import ps2.C100894u;
import qo3.C101218e0;
import qo3.C89779i0;
import qs2.C101255a0;
import qs2.C101286q0;
import qs2.C101295u0;
import rq2.C101425k;
import rx3.C13598b0;
import us2.C102077f;
import vr2.C102236a0;
import vr2.C102251n;
import vr2.C102260r;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l */
public class C95136l extends C95295z implements C102077f {

    /* renamed from: E */
    public static MMWebView f276103E;

    /* renamed from: A */
    public Runnable f276104A = new l$$l(this);

    /* renamed from: B */
    public C89779i0 f276105B = null;

    /* renamed from: C */
    public C102251n.C102257c f276106C = new l$$d(this);

    /* renamed from: D */
    public C32228q<String, String, Map<String, ? extends Object>, C13598b0> f276107D = new l$$e(this);

    /* renamed from: s */
    public MMWebView f276108s;

    /* renamed from: t */
    public C7580y f276109t;

    /* renamed from: u */
    public volatile boolean f276110u = false;

    /* renamed from: v */
    public IListener<SnsAdNativePageLifecycleEvent> f276111v;

    /* renamed from: w */
    public final String[] f276112w = {"weixin.qq.com", "wxs.qq.com", "h5.gdt.qq.com", "xj.gdt.qq.com", "test-xj.gdt.qq.com", "bricks.e.qq.com", "test.bricks.e.qq.com"};

    /* renamed from: x */
    public volatile boolean f276113x;

    /* renamed from: y */
    public MMHandler f276114y = new MMHandler(Looper.getMainLooper());

    /* renamed from: z */
    public Runnable f276115z = new l$$g(this);

    public C95136l(Context context, C101255a0 a0Var, ViewGroup viewGroup) {
        super(context, a0Var, viewGroup);
    }

    /* renamed from: E */
    public static /* synthetic */ boolean m121011E(C95136l lVar) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        boolean z = lVar.f276113x;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        return z;
    }

    /* renamed from: G */
    public static /* synthetic */ MMWebView m121012G(C95136l lVar) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        MMWebView mMWebView = lVar.f276108s;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        return mMWebView;
    }

    /* renamed from: H */
    public static void m121013H(C95136l lVar) {
        ViewGroup viewGroup;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        lVar.getClass();
        SnsMethodCalculate.markStartTimeMs("fixWebViewWhiteLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        MMWebView mMWebView = lVar.f276108s;
        if (mMWebView != null && mMWebView.isAttachedToWindow() && (viewGroup = (ViewGroup) mMWebView.getChildAt(0)) != null && viewGroup.getChildCount() > 0) {
            viewGroup.setPadding(0, 0, 0, 0);
            View childAt = viewGroup.getChildAt(0);
            if (childAt != null) {
                childAt.requestLayout();
            }
        }
        SnsMethodCalculate.markEndTimeMs("fixWebViewWhiteLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    /* renamed from: I */
    public static void m121014I(C95136l lVar) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        lVar.getClass();
        SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        ((C119157j) C119157j.f356862d).mo183895z(new C95189n(lVar));
        SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    /* renamed from: J */
    public static /* synthetic */ void m121015J(C95136l lVar, String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        lVar.mo131654P(str, z);
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    /* renamed from: K */
    public static /* synthetic */ void m121016K(C95136l lVar, String str, String str2, Map map) {
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        lVar.mo131655Q(str, str2, map);
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    /* renamed from: M */
    public static /* synthetic */ C89779i0 m121017M(C95136l lVar) {
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        C89779i0 i0Var = lVar.f276105B;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        return i0Var;
    }

    /* renamed from: W */
    public static void m121018W() {
        SnsMethodCalculate.markStartTimeMs("preloadWebView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        Log.m105924i("AdLandingNewH5Comp", "try preloadWebView sWebViewInstance= " + f276103E);
        try {
            if (C102260r.m134873m()) {
                ((C119157j) C119157j.f356862d).mo183895z(new l$$f());
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("preloadWebView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        super.mo124360B();
        SnsMethodCalculate.markStartTimeMs("requestWebViewLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        try {
            MMWebView mMWebView = this.f276108s;
            if (mMWebView != null) {
                mMWebView.postOnAnimation(this.f276104A);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("requestWebViewLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        super.mo67235C();
        C101286q0 q0Var = (C101286q0) mo131856q();
        if (q0Var != null && q0Var.f296687D) {
            this.f276114y.removeCallbacks(this.f276115z);
        }
        mo131855p();
        MMWebView mMWebView = this.f276108s;
        if (!(mMWebView == null || mMWebView.getParent() == null)) {
            ((ViewGroup) mMWebView.getParent()).removeView(mMWebView);
            mMWebView.setTag((Object) null);
            mMWebView.destroy();
        }
        this.f276110u = true;
        this.f276109t = null;
        this.f276586n = null;
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    /* renamed from: N */
    public final void mo131652N(String str) {
        SnsMethodCalculate.markStartTimeMs("acquireDeviceInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        String url = this.f276108s.getUrl();
        SnsMethodCalculate.markStartTimeMs("checkDeviceInfoUrlPermission", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        boolean z = true;
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_landing_page_form_device_id, 1);
        Log.m105918d("AdLandingNewH5Comp", "checkDeviceInfoUrlPermission::expt value is " + Qe);
        if (Qe == 0) {
            SnsMethodCalculate.markEndTimeMs("checkDeviceInfoUrlPermission", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        } else if (TextUtils.isEmpty(url)) {
            SnsMethodCalculate.markEndTimeMs("checkDeviceInfoUrlPermission", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        } else {
            String host = Uri.parse(url).getHost();
            if (host != null && C101425k.m133102f(this.f276112w)) {
                for (String str2 : this.f276112w) {
                    if (str2 != null && host.contains(str2)) {
                        SnsMethodCalculate.markEndTimeMs("checkDeviceInfoUrlPermission", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                        break;
                    }
                }
            }
            Log.m105918d("AdLandingNewH5Comp", "checkDeviceInfoUrlPermission::the domain is " + host);
            SnsMethodCalculate.markEndTimeMs("checkDeviceInfoUrlPermission", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        }
        z = false;
        if (!z) {
            mo131659X(str, -2, "url permission denied", "");
            SnsMethodCalculate.markEndTimeMs("acquireDeviceInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        } else if (!((C103918d) C86312j.m106911c(C103918d.class)).Gd0(this.f276579d, "android.permission.READ_PHONE_STATE")) {
            mo131659X(str, -3, "system permission denied", "");
            SnsMethodCalculate.markEndTimeMs("acquireDeviceInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        } else {
            String f = C87203t.m108270f(false);
            if (TextUtils.isEmpty(f)) {
                mo131659X(str, -1, "id is empty", "");
                SnsMethodCalculate.markEndTimeMs("acquireDeviceInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                return;
            }
            mo131659X(str, 0, "ok", MD5Util.getMD5String(f));
            SnsMethodCalculate.markEndTimeMs("acquireDeviceInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        }
    }

    /* renamed from: O */
    public void mo131653O(String str, String str2, Map<String, Object> map) {
        SnsMethodCalculate.markStartTimeMs("callJs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        mo131655Q(str, str2, map);
        SnsMethodCalculate.markEndTimeMs("callJs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    /* renamed from: P */
    public final void mo131654P(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("callbackQRResultToJS", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        Log.m105924i("AdLandingNewH5Comp", "callbackQRResultToJS, isSucc=" + z + ", callbackId=" + str);
        ((C119157j) C119157j.f356862d).mo183895z(new l$$c(this, z, str));
        SnsMethodCalculate.markEndTimeMs("callbackQRResultToJS", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    /* renamed from: Q */
    public final void mo131655Q(String str, String str2, Map<String, Object> map) {
        long currentThreadTimeMillis;
        Class<?> cls;
        SnsMethodCalculate.markStartTimeMs("callbackToJS", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        SnsMethodCalculate.markStartTimeMs("ensureJsApiHandler", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        if (this.f276109t == null && !this.f276110u) {
            SnsMethodCalculate.markStartTimeMs("ensureJsApiHandlerFromService", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            Method method = null;
            try {
                C45513i0 i0Var = (C45513i0) C86312j.m106911c(C45513i0.class);
                C7580y U1 = i0Var != null ? i0Var.mo70781U1(this.f276108s) : null;
                if (U1 != null) {
                    Log.m105918d("AdLandingNewH5Comp", "the jsApiHandler is set from service");
                    this.f276109t = U1;
                } else {
                    Log.m105928w("AdLandingNewH5Comp", "the jsApiHandler is null from service!");
                }
            } catch (Throwable unused) {
                Log.m105920e("AdLandingNewH5Comp", "ensureJsApiHandlerFromService has something wrong!!");
            }
            SnsMethodCalculate.markEndTimeMs("ensureJsApiHandlerFromService", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            if (this.f276109t == null) {
                SnsMethodCalculate.markStartTimeMs("ensureJsApiHandlerFromWebView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                try {
                    currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                    cls = this.f276108s.getClass();
                    SnsMethodCalculate.markStartTimeMs("getJsapiMethod", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                    method = cls.getMethod("getJsapi", new Class[0]);
                    SnsMethodCalculate.markEndTimeMs("getJsapiMethod", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                } catch (Throwable unused2) {
                    Log.m105920e("AdLandingNewH5Comp", "there is no getJsApiHandler method, the jsApiHandler object may be null!!");
                }
                if (method == null) {
                    Log.m105924i("AdLandingNewH5Comp", "the js method is not found in getJsapiMethod, try to findJsapiMethod");
                    method = mo131656R(cls);
                }
                if (method == null) {
                    Log.m105928w("AdLandingNewH5Comp", "the js method is not found!");
                    SnsMethodCalculate.markEndTimeMs("ensureJsApiHandlerFromWebView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                } else {
                    Object invoke = method.invoke(this.f276108s, new Object[0]);
                    if (invoke instanceof C7580y) {
                        Log.m105924i("AdLandingNewH5Comp", "the method return type is js api in ensureJsApiHandlerFromWebView");
                        this.f276109t = (C7580y) invoke;
                    } else {
                        Log.m105928w("AdLandingNewH5Comp", "the method return value is null ??");
                    }
                    Log.m105924i("AdLandingNewH5Comp", "get the js api handler takes : " + (SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
                    SnsMethodCalculate.markEndTimeMs("ensureJsApiHandlerFromWebView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("ensureJsApiHandler", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        C7580y yVar = this.f276109t;
        if (yVar != null) {
            Log.m105918d("AdLandingNewH5Comp", "the js api handler is called!!");
            String str3 = str;
            yVar.mo8702g(str, str2, map, true);
        } else {
            Log.m105928w("AdLandingNewH5Comp", "the js api handler is null!!");
        }
        SnsMethodCalculate.markEndTimeMs("callbackToJS", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    /* renamed from: R */
    public final Method mo131656R(Class<?> cls) {
        SnsMethodCalculate.markStartTimeMs("findJsapiMethod", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        Method method = null;
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method2 = declaredMethods[i];
                method2.getReturnType();
                if (C101425k.m133099c(method2.getParameterTypes())) {
                    method = method2;
                    break;
                }
                i++;
            }
            if (method == null) {
                Log.m105928w("AdLandingNewH5Comp", "there is no method satisfying the condition");
            }
        } catch (Throwable unused) {
            Log.m105920e("AdLandingNewH5Comp", "finding the js method occurs something exception");
        }
        SnsMethodCalculate.markEndTimeMs("findJsapiMethod", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        return method;
    }

    /* renamed from: U */
    public void mo131657U(String str, JSONObject jSONObject) {
        String str2;
        String str3;
        View view;
        View view2;
        String str4 = str;
        JSONObject jSONObject2 = jSONObject;
        SnsMethodCalculate.markStartTimeMs("handleBindPhoneNumber", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        String phoneNumber = AdLandingPagesProxy.getInstance().getPhoneNumber();
        String optString = jSONObject2.optString("requestName");
        String optString2 = jSONObject2.optString("requestIconUrl");
        StringBuilder sb = new StringBuilder();
        sb.append("handleBindPhoneNumber, phone.len=");
        sb.append(phoneNumber == null ? 0 : phoneNumber.length());
        sb.append(", name=");
        sb.append(optString);
        sb.append(", iconUrl=");
        sb.append(optString2);
        Log.m105924i("AdLandingNewH5Comp", sb.toString());
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            str2 = "handleBindPhoneNumber";
            str3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp";
            HashMap hashMap = new HashMap();
            hashMap.put("ret", "-3");
            hashMap.put("err_msg", "params error");
            mo131655Q(str4, "params error", hashMap);
            Log.m105924i("AdLandingNewH5Comp", "handleBindPhoneNumber, params error");
        } else {
            SnsMethodCalculate.markStartTimeMs("showRequestPhoneNumDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            C101218e0 e0Var = new C101218e0(this.f276579d, 0, 0, false);
            e0Var.f296384g.setBackgroundColor(this.f276579d.getResources().getColor(C0966R.color.al6));
            View inflate = View.inflate(this.f276579d, C0966R.C0971layout.c0t, (ViewGroup) null);
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.f359083iq3);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.iq5);
            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.hvf);
            View findViewById = inflate.findViewById(C0966R.C0970id.hvg);
            View findViewById2 = inflate.findViewById(C0966R.C0970id.aoi);
            str2 = "handleBindPhoneNumber";
            View findViewById3 = inflate.findViewById(C0966R.C0970id.aoj);
            String str5 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp";
            View findViewById4 = inflate.findViewById(C0966R.C0970id.ipy);
            String str6 = "showRequestPhoneNumDialog";
            View findViewById5 = inflate.findViewById(C0966R.C0970id.iq6);
            View view3 = inflate;
            if (TextUtils.isEmpty(phoneNumber)) {
                view2 = findViewById5;
                textView2.setVisibility(0);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view4 = findViewById;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view = findViewById4;
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view5 = findViewById2;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view6 = findViewById3;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView2.setTextColor(this.f276579d.getResources().getColor(C0966R.color.f3563xt));
                textView2.setText(this.f276579d.getText(C0966R.string.ja4));
            } else {
                view = findViewById4;
                view2 = findViewById5;
                textView2.setVisibility(0);
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view7 = findViewById;
                C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(0);
                View view8 = findViewById2;
                C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(8);
                View view9 = findViewById3;
                C117292a.m165358d(view9, aVar6.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp", "showRequestPhoneNumDialog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView2.setText(phoneNumber);
            }
            textView.setText(Util.nullAsNil(optString));
            if (!TextUtils.isEmpty(optString2)) {
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59347c = true;
                bVar.f59359o = C0966R.raw.default_avatar_round;
                bVar.f59364t = true;
                C20828a.m22825b().mo32519h(optString2, imageView, bVar.mo32666a());
            }
            view.setOnClickListener(new C43064o(this, e0Var, str4));
            view2.setOnClickListener(new C43065p(this, e0Var, phoneNumber, str4));
            findViewById3.setOnClickListener(new C43066q(this, e0Var, str4));
            e0Var.mo140663j(view3);
            e0Var.mo140655A();
            str3 = str5;
            SnsMethodCalculate.markEndTimeMs(str6, str3);
        }
        SnsMethodCalculate.markEndTimeMs(str2, str3);
    }

    /* renamed from: V */
    public void mo131658V(String str, int i, int i2, String str2) {
        String str3 = str;
        int i3 = i;
        int i4 = i2;
        String str4 = str2;
        SnsMethodCalculate.markStartTimeMs("handleQR", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        try {
            Log.m105924i("AdLandingNewH5Comp", "handleQR, qrDirectJump=" + i3 + ", syncQrImageDownload=" + i4 + ", jsCallbackId=" + str4 + ", url=" + str3);
            boolean z = true;
            boolean z2 = i3 == 1;
            if (i4 != 1) {
                z = false;
            }
            Bundle bundle = new Bundle();
            C101286q0 q0Var = (C101286q0) mo131856q();
            bundle.putString("qrExtInfo", q0Var != null ? q0Var.f296686C : "");
            bundle.putInt("qrIsDirectJump", i3);
            bundle.putString("jsCallbackId", str4);
            C102251n nVar = new C102251n(this.f276579d, mo131854m(), 2, bundle);
            String l = C100891r.m132217l("adId", str3);
            if (TextUtils.isEmpty(l) || !C86013q1.m106450k(l)) {
                C101286q0 q0Var2 = (C101286q0) mo131856q();
                if (!z) {
                    Bitmap bitmapFromView = BitmapUtil.getBitmapFromView(this.f276586n);
                    if (bitmapFromView != null) {
                        Log.m105924i("AdLandingNewH5Comp", "shoot webView succ");
                        String l2 = C100891r.m132217l("adId", str3 + "_shoot");
                        Uri n = C116299g2.m163858n(l2);
                        String path = n.getPath();
                        if (path != null) {
                            String k = C116299g2.m163855k(path, false, false);
                            if (!n.getPath().equals(k)) {
                                n = n.buildUpon().path(k).build();
                            }
                        }
                        OutputStream G = C86013q1.m106425G(n, C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null), false);
                        boolean compress = bitmapFromView.compress(Bitmap.CompressFormat.JPEG, 100, G);
                        G.flush();
                        G.close();
                        if (compress) {
                            Log.m105924i("AdLandingNewH5Comp", "shoot save succ");
                            if (z2) {
                                nVar.mo141816j(l2, str3, this.f276106C);
                            } else {
                                nVar.mo141817k(l2, str3, this.f276106C);
                            }
                        } else {
                            Log.m105920e("AdLandingNewH5Comp", "compressBitmap failed");
                            mo131654P(str4, false);
                        }
                    } else {
                        Log.m105920e("AdLandingNewH5Comp", "getBitmapFromView==null");
                        mo131654P(str4, false);
                    }
                    C100891r.m132208c(str3, false, q0Var2.f296496b, 0, new l$$b(this, str3));
                } else if (TextUtils.isEmpty(str)) {
                    Log.m105920e("AdLandingNewH5Comp", "imageUrl is empty");
                    mo131654P(str4, false);
                    SnsMethodCalculate.markEndTimeMs("handleQR", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                    return;
                } else {
                    SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                    ((C119157j) C119157j.f356862d).mo183895z(new C95143m(this));
                    SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                    C100891r.m132208c(str3, false, q0Var2.f296496b, 0, new l$$m(this, str, str2, z2, nVar));
                }
                SnsMethodCalculate.markEndTimeMs("handleQR", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            }
            Log.m105924i("AdLandingNewH5Comp", "local file exists, imageUrl=" + str3);
            if (z2) {
                nVar.mo141816j(l, str3, this.f276106C);
            } else {
                nVar.mo141817k(l, str3, this.f276106C);
            }
            SnsMethodCalculate.markEndTimeMs("handleQR", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        } catch (Throwable th) {
            Log.m105920e("AdLandingNewH5Comp", "handleQR, exp=" + th.toString());
        }
    }

    /* renamed from: X */
    public final void mo131659X(String str, int i, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("resultDeviceId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        HashMap hashMap = new HashMap();
        hashMap.put("ret", Integer.valueOf(i));
        hashMap.put(TPDownloadProxyEnum.USER_DEVICE_ID, Util.nullAsNil(str3));
        mo131655Q(str, str2, hashMap);
        SnsMethodCalculate.markEndTimeMs("resultDeviceId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    /* renamed from: d */
    public void mo124363d() {
        SnsMethodCalculate.markStartTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        C101286q0 q0Var = (C101286q0) mo131856q();
        if (q0Var == null || q0Var.f296685B == null || q0Var.f296504j != 2) {
            super.mo124363d();
            SnsMethodCalculate.markEndTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    /* renamed from: f */
    public View mo67239f() {
        SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        this.f276110u = false;
        MMWebView mMWebView = f276103E;
        if (mMWebView != null) {
            this.f276108s = mMWebView;
            f276103E = null;
            C115669n.INSTANCE.mo175911u(1911, 0);
            Log.m105924i("AdLandingNewH5Comp", "is preload webView");
        } else {
            this.f276108s = C30610e0.C30611a.f82425a.mo57505a(this.f276579d);
            C115669n.INSTANCE.mo175911u(1911, 1);
            Log.m105924i("AdLandingNewH5Comp", "just new webView");
        }
        this.f276108s.setCleanOnDetached(false);
        this.f276108s.getSettings().setAppCacheEnabled(true);
        this.f276108s.getSettings().setCacheMode(-1);
        this.f276108s.getSettings().setDomStorageEnabled(true);
        C101286q0 q0Var = (C101286q0) mo131856q();
        if (q0Var != null && q0Var.f296687D) {
            this.f276108s.setAlpha(0.0f);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f276108s, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.addListener(new l$$h(this));
        MMWebView mMWebView2 = this.f276108s;
        mMWebView2.setWebViewClient(C44234a0.C30609a.f82424a.mo68941nM(mMWebView2, false, new l$$i(this, q0Var, ofFloat)));
        if (q0Var == null || q0Var.f296685B == null || q0Var.f296504j != 2) {
            MMWebView mMWebView3 = this.f276108s;
            SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            return mMWebView3;
        }
        l$$j l__j = new l$$j(this, this.f276579d);
        l__j.addView(this.f276108s);
        ViewGroup.LayoutParams layoutParams = this.f276108s.getLayoutParams();
        layoutParams.width = -1;
        C101295u0 u0Var = q0Var.f296685B;
        layoutParams.height = (int) (((float) C76577a.m92159j(this.f276579d)) - C100894u.m132234n((double) q0Var.f296684A, u0Var.f296748a, u0Var.f296749b, u0Var.f296750c));
        this.f276108s.setLayoutParams(layoutParams);
        Context context = this.f276579d;
        if ((context instanceof C96067m3) && (context instanceof C0125s)) {
            ((C96067m3) context).mo132529c3().observe((C0125s) this.f276579d, new l$$k(this, q0Var));
        }
        SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        return l__j;
    }

    /* renamed from: g */
    public void mo67240g() {
        String str;
        String str2;
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        C101286q0 q0Var = (C101286q0) mo131856q();
        if (q0Var != null) {
            mo131855p();
            MMWebView mMWebView = this.f276108s;
            if (mMWebView != null) {
                SnsMethodCalculate.markStartTimeMs("getUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                C101286q0 q0Var2 = (C101286q0) mo131856q();
                if (!TextUtils.isEmpty(q0Var2.f296688z)) {
                    String uin = AdLandingPagesProxy.getInstance().getUin();
                    String a = C95198o2.m121129a(q0Var2.f296688z, "uin=" + uin);
                    String adWuid = AdLandingPagesProxy.getInstance().getAdWuid();
                    if (!TextUtils.isEmpty(adWuid)) {
                        Vibrator vibrator = C102236a0.f301037a;
                        SnsMethodCalculate.markStartTimeMs("appendUrlParamsWithUrlEncode", "com.tencent.mm.plugin.sns.data.SnsUtil");
                        try {
                            str2 = URLEncoder.encode(Util.nullAsNil(adWuid), "UTF-8");
                        } catch (Exception e) {
                            Log.m105920e("MicroMsg.SnsUtil", "appendUrlParamsWithUrlEncode exp:" + e.toString() + ", " + adWuid);
                            str2 = "";
                        }
                        a = C102236a0.m134738d(a, "wuid", str2);
                        SnsMethodCalculate.markEndTimeMs("appendUrlParamsWithUrlEncode", "com.tencent.mm.plugin.sns.data.SnsUtil");
                    } else {
                        Log.m105920e("AdLandingNewH5Comp", "AdWuidHelper, wuid is empty");
                    }
                    str = C102236a0.m134734b(a, mo131854m().mo140745l());
                    if (q0Var2.f296504j == 1) {
                        String adVoteInfo = AdLandingPagesProxy.getInstance().getAdVoteInfo(q0Var2.f296688z, mo131854m().mo140745l(), uin);
                        if (!Util.isNullOrNil(adVoteInfo)) {
                            str = str + "&" + adVoteInfo;
                        }
                    }
                    Log.m105924i("AdLandingNewH5Comp", "final url=" + str);
                    SnsMethodCalculate.markEndTimeMs("getUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                } else {
                    Log.m105920e("AdLandingNewH5Comp", "final url empty");
                    str = q0Var2.f296688z;
                    SnsMethodCalculate.markEndTimeMs("getUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                }
                mMWebView.loadUrl(str);
                if (q0Var.f296687D) {
                    this.f276114y.removeCallbacks(this.f276115z);
                    this.f276114y.postDelayed(this.f276115z, 3000);
                }
            }
        }
        SnsMethodCalculate.markStartTimeMs("ensureNativeActivityLifeCycleListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        try {
            if (this.f276111v == null) {
                AdLandingNewH5Comp$15 adLandingNewH5Comp$15 = new AdLandingNewH5Comp$15(this, C40008f.f107254d);
                this.f276111v = adLandingNewH5Comp$15;
                adLandingNewH5Comp$15.alive();
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("ensureNativeActivityLifeCycleListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        ViewGroup.LayoutParams layoutParams = this.f276586n.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C101255a0 a0Var = this.f276580e;
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) a0Var.f296499e, (int) a0Var.f296497c, (int) a0Var.f296500f, (int) a0Var.f296498d);
        }
        this.f276586n.setLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
    }
}
