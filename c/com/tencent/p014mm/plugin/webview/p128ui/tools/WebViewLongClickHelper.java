package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.View;
import android.webkit.URLUtil;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import com.tencent.xweb.WebView;
import d93.C45310h;
import di3.C86312j;
import ea3.C45591h;
import ea3.C45601r;
import ex0.C45696d;
import f40.C86709a0;
import h81.C32735h;
import j93.C46450c;
import j93.C46451d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p200lx.C46896e0;
import p200lx.C46897s;
import p200lx.C46900z;
import p200lx.C61416x;
import p823sg.C48379o;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper */
public class WebViewLongClickHelper implements C46451d {

    /* renamed from: r */
    public static Map<String, Boolean> f118388r = new HashMap();

    /* renamed from: s */
    public static long f118389s = 0;

    /* renamed from: t */
    public static long f118390t = 0;

    /* renamed from: u */
    public static IListener f118391u;

    /* renamed from: a */
    public ArrayList<ImageQBarDataBean> f118392a = new ArrayList<>();

    /* renamed from: b */
    public String f118393b;

    /* renamed from: c */
    public WebView.HitTestResult f118394c;

    /* renamed from: d */
    public WebView.HitTestResult f118395d;

    /* renamed from: e */
    public C45591h f118396e;

    /* renamed from: f */
    public C77407n f118397f;

    /* renamed from: g */
    public C46900z f118398g;

    /* renamed from: h */
    public C45601r f118399h;

    /* renamed from: i */
    public String f118400i = "";

    /* renamed from: j */
    public HashMap<String, Long> f118401j = new HashMap<>();

    /* renamed from: k */
    public Long f118402k = 0L;

    /* renamed from: l */
    public Long f118403l = 0L;

    /* renamed from: m */
    public Long f118404m = 0L;

    /* renamed from: n */
    public WeakReference<Activity> f118405n;

    /* renamed from: o */
    public C46450c f118406o;

    /* renamed from: p */
    public C45591h.C45595d f118407p = new WebViewLongClickHelper$$c(this);

    /* renamed from: q */
    public C75018a.C75024d f118408q = new WebViewLongClickHelper$$b(this);

    public WebViewLongClickHelper(C46450c cVar) {
        this.f118405n = new WeakReference<>(cVar.getContext());
        this.f118406o = cVar;
        this.f118398g = ((C46896e0) C86312j.m106911c(C46896e0.class)).mo71986Hu(cVar.getContext(), new WebViewLongClickHelper$$a(this));
    }

    /* renamed from: a */
    public static String m47784a(WebViewLongClickHelper webViewLongClickHelper) {
        String currentUrl = webViewLongClickHelper.f118406o.getController().getCurrentUrl();
        webViewLongClickHelper.f118400i = currentUrl;
        if (Util.isNullOrNil(currentUrl)) {
            webViewLongClickHelper.f118400i = webViewLongClickHelper.f118406o.getController().mo63683n0();
        }
        return webViewLongClickHelper.f118400i;
    }

    /* renamed from: b */
    public static boolean m47785b(WebViewLongClickHelper webViewLongClickHelper, View view) {
        MMWebView mMWebView;
        if (!webViewLongClickHelper.mo68199m() && (mMWebView = webViewLongClickHelper.f118406o.getController().f117553a) != null) {
            try {
                if (view instanceof android.webkit.WebView) {
                    WebView.HitTestResult hitTestResult = mMWebView.getHitTestResult();
                    if (hitTestResult != null) {
                        if (hitTestResult.getType() == 5 || hitTestResult.getType() == 8) {
                            webViewLongClickHelper.mo68202p(hitTestResult);
                        }
                    }
                } else if (view instanceof MMWebView) {
                    WebView.HitTestResult hitTestResult2 = ((MMWebView) view).getHitTestResult();
                    if (hitTestResult2 != null) {
                        if (hitTestResult2.getType() == 5 || hitTestResult2.getType() == 8) {
                            webViewLongClickHelper.mo68201o(hitTestResult2);
                        }
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WebViewLongClickHelper", "onCreateContextMenu exp %s", e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m47786c(WebViewLongClickHelper webViewLongClickHelper, int i, ImageQBarDataBean imageQBarDataBean) {
        String str;
        C45601r rVar = webViewLongClickHelper.f118399h;
        if (rVar != null) {
            C46450c cVar = webViewLongClickHelper.f118406o;
            if (cVar != null) {
                rVar.f123324b = webViewLongClickHelper.f118400i;
                rVar.f123326d = cVar.getController().mo67758z();
            }
            if (imageQBarDataBean != null) {
                C45601r rVar2 = webViewLongClickHelper.f118399h;
                rVar2.f123325c = true;
                rVar2.f123329g = imageQBarDataBean.f273114e == 22 ? "WX_CODE" : "QR_CODE";
                rVar2.f123328f = imageQBarDataBean.f273113d;
            }
            if (URLUtil.isDataUrl(webViewLongClickHelper.f118393b)) {
                try {
                    str = C48379o.m53725b(webViewLongClickHelper.f118393b);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.WebViewLongClickHelper", "getSHA1 ex %s", e.getMessage());
                    str = "";
                }
            } else {
                String str2 = webViewLongClickHelper.f118393b;
                QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
                str = WebViewUtilities.doUrlEncode(str2);
            }
            C45601r rVar3 = webViewLongClickHelper.f118399h;
            rVar3.f123330h = str;
            rVar3.mo71118a(i);
        }
    }

    /* renamed from: d */
    public static void m47787d(WebViewLongClickHelper webViewLongClickHelper, String str) {
        webViewLongClickHelper.getClass();
        Log.m105918d("MicroMsg.WebViewLongClickHelper", "cancelRecogQBar:" + str);
        if (!Util.isNullOrNil(str) && webViewLongClickHelper.f118401j.containsKey(str)) {
            Log.m105924i("MicroMsg.WebViewLongClickHelper", "do cancelRecogQBar:" + str);
            try {
                XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new CancelRecogQBarData(str, webViewLongClickHelper.f118401j.get(str).longValue()), WebViewLongClickHelper$$k.class, (C1256g) null);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WebViewLongClickHelper", e, "", new Object[0]);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0048, code lost:
        if (r5.startsWith(com.tencent.p014mm.sdk.http.HttpWrapperBase.PROTOCAL_HTTP + com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(com.tencent.p014mm.C0966R.string.f360885fm3) + "/s") != false) goto L_0x004a;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m47788e(com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewLongClickHelper r5) {
        /*
            java.lang.String r5 = r5.f118400i
            java.lang.String r0 = "/s"
            r1 = 0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x004c }
            if (r2 != 0) goto L_0x0056
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004c }
            r2.<init>()     // Catch:{ Exception -> 0x004c }
            java.lang.String r3 = "https://"
            r2.append(r3)     // Catch:{ Exception -> 0x004c }
            r3 = 2131831321(0x7f112a19, float:1.9295664E38)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r3)     // Catch:{ Exception -> 0x004c }
            r2.append(r4)     // Catch:{ Exception -> 0x004c }
            r2.append(r0)     // Catch:{ Exception -> 0x004c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x004c }
            boolean r2 = r5.startsWith(r2)     // Catch:{ Exception -> 0x004c }
            if (r2 != 0) goto L_0x004a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004c }
            r2.<init>()     // Catch:{ Exception -> 0x004c }
            java.lang.String r4 = "http://"
            r2.append(r4)     // Catch:{ Exception -> 0x004c }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r3)     // Catch:{ Exception -> 0x004c }
            r2.append(r3)     // Catch:{ Exception -> 0x004c }
            r2.append(r0)     // Catch:{ Exception -> 0x004c }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x004c }
            boolean r5 = r5.startsWith(r0)     // Catch:{ Exception -> 0x004c }
            if (r5 == 0) goto L_0x0056
        L_0x004a:
            r1 = 1
            goto L_0x0056
        L_0x004c:
            r5 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "MicroMsg.WebViewLongClickHelper"
            java.lang.String r3 = "isMpUrl"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r5, r3, r0)
        L_0x0056:
            if (r1 == 0) goto L_0x005a
            r5 = 5
            goto L_0x005b
        L_0x005a:
            r5 = 3
        L_0x005b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewLongClickHelper.m47788e(com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper):int");
    }

    /* renamed from: f */
    public static void m47789f(WebViewLongClickHelper webViewLongClickHelper, ImageQBarDataBean imageQBarDataBean) {
        String str;
        String str2;
        webViewLongClickHelper.getClass();
        try {
            Bundle bundle = new Bundle();
            bundle.putString("preUsername", webViewLongClickHelper.mo68194h().getIntent().getStringExtra("preUsername"));
            bundle.putString("preChatName", webViewLongClickHelper.mo68194h().getIntent().getStringExtra("preChatName"));
            bundle.putString("rawUrl", webViewLongClickHelper.f118406o.getController().mo63683n0());
            String stringExtra = webViewLongClickHelper.mo68194h().getIntent().getStringExtra("pre_username");
            if (stringExtra == null || !webViewLongClickHelper.f118406o.getController().f117601y.mo68095Gm(stringExtra)) {
                bundle.putString("pre_username", webViewLongClickHelper.mo68194h().getIntent().getStringExtra(C74928u.C45093i.f122324p));
            } else {
                bundle.putString("pre_username", stringExtra);
            }
            int g = webViewLongClickHelper.f118406o.getController().mo67719g();
            C43791l lVar = webViewLongClickHelper.f118406o.getController().f117601y;
            String str3 = imageQBarDataBean.f273113d;
            String str4 = webViewLongClickHelper.f118400i;
            if (Util.isNullOrNil(str3)) {
                str2 = "";
            } else if (str3.length() > 1024) {
                str2 = str3.substring(0, 1024);
            } else {
                str = str3;
                lVar.Cl0(g, str3, str4, str, imageQBarDataBean.f273114e, imageQBarDataBean.f273115f, bundle);
                Log.m105924i("MicroMsg.WebViewLongClickHelper", "onMenuItemClick recognize qbcode");
            }
            str = str2;
            lVar.Cl0(g, str3, str4, str, imageQBarDataBean.f273114e, imageQBarDataBean.f273115f, bundle);
            Log.m105924i("MicroMsg.WebViewLongClickHelper", "onMenuItemClick recognize qbcode");
        } catch (RemoteException unused) {
            Log.m105920e("MicroMsg.WebViewLongClickHelper", "recognize qbar result failed");
        }
    }

    /* renamed from: g */
    public final boolean mo68193g() {
        try {
            return this.f118406o.getController().f117601y.isSDCardAvailable();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WebViewLongClickHelper", "onCreateContextMenu fail, ex = " + e.getMessage());
            return false;
        }
    }

    /* renamed from: h */
    public Activity mo68194h() {
        return this.f118405n.get();
    }

    /* renamed from: i */
    public final String mo68195i(String str) {
        Class cls = C45696d.class;
        if (Util.isNullOrNil(str)) {
            return "";
        }
        return !((str == null || C86709a0.m107533q(cls) == null) ? false : ((C45696d) C86709a0.m107533q(cls)).mo70989eQ(str)) ? str : ((C45696d) C86709a0.m107533q(cls)).mo70950A9(str);
    }

    /* renamed from: j */
    public void mo68196j() {
        MMWebView mMWebView;
        if (!mo68199m() && (mMWebView = this.f118406o.getController().f117553a) != null) {
            Class cls = C32735h.class;
            if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_webview_long_press_test_enable, 0) == 1) {
                Log.m105924i("MicroMsg.WebViewLongClickHelper", "WebViewLongPress AB Test Enabled");
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_webview_long_press_menu_duration, 500);
                if (Qe < 150 || Qe > 2500) {
                    Log.m105929w("MicroMsg.WebViewLongClickHelper", "WebViewLongPress  is invalid, time = %d", Integer.valueOf(Qe));
                } else {
                    Log.m105925i("MicroMsg.WebViewLongClickHelper", "WebViewLongPress Set Time: %d", Integer.valueOf(Qe));
                    mMWebView.getSettings().enableCustomizedLongPressTimeout(Qe);
                }
            }
            mMWebView.setOnLongClickListener(new WebViewLongClickHelper$$d(this, mMWebView));
        }
    }

    /* renamed from: k */
    public final boolean mo68197k() {
        int k0 = this.f118406o.getController().mo67729k0(Util.nullAsNil(Util.nullAsNil(mo68194h().getIntent().getStringExtra("sentUsername"))));
        if (k0 == 53 || k0 == 52) {
            Log.m105924i("MicroMsg.WebViewLongClickHelper", "isAllowScanQRCode open link not allow to ScanQRCode");
            return false;
        }
        try {
            if (this.f118406o.getController().f117601y != null) {
                return this.f118406o.getController().f117601y.Ms0();
            }
            Log.m105928w("MicroMsg.WebViewLongClickHelper", "invoker is null");
            return false;
        } catch (RemoteException e) {
            Log.m105920e("MicroMsg.WebViewLongClickHelper", "unable get config for Scan QRCode" + e.getMessage());
            return false;
        }
    }

    /* renamed from: l */
    public final boolean mo68198l() {
        if (!((HashMap) f118388r).containsKey(mo68195i(this.f118400i))) {
            return false;
        }
        return ((Boolean) ((HashMap) f118388r).get(mo68195i(this.f118400i))).booleanValue();
    }

    /* renamed from: m */
    public boolean mo68199m() {
        return mo68194h() == null || this.f118406o == null || mo68194h().isFinishing();
    }

    /* renamed from: n */
    public final boolean mo68200n(String str) {
        boolean z = false;
        if (mo68199m()) {
            return false;
        }
        if (!mo68193g()) {
            return true;
        }
        this.f118393b = str;
        if (this.f118397f == null) {
            this.f118397f = new C77407n((Context) mo68194h(), 1, false);
        }
        C77407n nVar = this.f118397f;
        nVar.f225771i = new WebViewLongClickHelper$$e(this);
        nVar.f225782p = new WebViewLongClickHelper$$f(this, str);
        nVar.f225761d = new WebViewLongClickHelper$$g(this);
        if (!mo68194h().isFinishing()) {
            if (!mo68198l() || !Util.isNullOrNil((List) this.f118392a)) {
                z = true;
            }
            if (z) {
                this.f118397f.mo107573q();
            }
        }
        return this.f118397f.mo107563h();
    }

    /* renamed from: o */
    public final boolean mo68201o(WebView.HitTestResult hitTestResult) {
        boolean n = mo68200n(hitTestResult.getExtra());
        MMWebView mMWebView = this.f118406o.getController().f117553a;
        C45310h hVar = this.f118406o.getController().f117539M;
        if (Util.isNullOrNil((List) this.f118392a) && hVar != null && hVar.mo70859b().mo69432d() && mo68197k()) {
            this.f118395d = hitTestResult;
            C45591h hVar2 = new C45591h();
            this.f118396e = hVar2;
            hVar2.mo71113a(mMWebView, this.f118407p);
        }
        return n;
    }

    /* renamed from: p */
    public final boolean mo68202p(WebView.HitTestResult hitTestResult) {
        boolean n = mo68200n(hitTestResult.getExtra());
        MMWebView mMWebView = this.f118406o.getController().f117553a;
        C45310h hVar = this.f118406o.getController().f117539M;
        if (Util.isNullOrNil((List) this.f118392a) && hVar != null && hVar.mo70859b().mo69432d() && mo68197k()) {
            this.f118394c = hitTestResult;
            C45591h hVar2 = new C45591h();
            this.f118396e = hVar2;
            hVar2.mo71113a(mMWebView, this.f118407p);
        }
        return n;
    }

    /* renamed from: q */
    public final void mo68203q() {
        if (Util.isNullOrNil((List) this.f118392a)) {
            Log.m105928w("MicroMsg.WebViewLongClickHelper", "processGetWXACodeNickName mImageQBarDataList nil");
        } else if (this.f118392a.size() == 1) {
            ImageQBarDataBean imageQBarDataBean = this.f118392a.get(0);
            if (((C61416x) C86312j.m106911c(C61416x.class)).mo72002rO(imageQBarDataBean.f273114e, imageQBarDataBean.f273113d)) {
                Log.m105924i("MicroMsg.WebViewLongClickHelper", "processGetWXACodeNickName");
                C46900z zVar = this.f118398g;
                int i = imageQBarDataBean.f273114e;
                String str = imageQBarDataBean.f273113d;
                String str2 = this.f118400i;
                C46897s.C46898a aVar = new C46897s.C46898a(str);
                aVar.f126106b = 4;
                aVar.f126107c = str2;
                ((ScanCodeSheetItemLogic) zVar).mo67078i(i, aVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$CancelRecogQBarData */
    public static class CancelRecogQBarData implements Parcelable {
        public static final Parcelable.Creator<CancelRecogQBarData> CREATOR = new C43806a();

        /* renamed from: d */
        public String f118409d;

        /* renamed from: e */
        public long f118410e;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$CancelRecogQBarData$a */
        public class C43806a implements Parcelable.Creator<CancelRecogQBarData> {
            public Object createFromParcel(Parcel parcel) {
                return new CancelRecogQBarData(parcel);
            }

            public Object[] newArray(int i) {
                return new CancelRecogQBarData[i];
            }
        }

        public CancelRecogQBarData(String str, long j) {
            this.f118409d = str;
            this.f118410e = j;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f118409d);
            parcel.writeLong(this.f118410e);
        }

        public CancelRecogQBarData(Parcel parcel) {
            this.f118409d = parcel.readString();
            this.f118410e = parcel.readLong();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$ImageQBarData */
    public static class ImageQBarData implements Parcelable {
        public static final Parcelable.Creator<ImageQBarData> CREATOR = new C43807a();

        /* renamed from: d */
        public ArrayList<ImageQBarDataBean> f118411d;

        /* renamed from: e */
        public String f118412e;

        /* renamed from: f */
        public boolean f118413f;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$ImageQBarData$a */
        public class C43807a implements Parcelable.Creator<ImageQBarData> {
            public Object createFromParcel(Parcel parcel) {
                return new ImageQBarData(parcel);
            }

            public Object[] newArray(int i) {
                return new ImageQBarData[i];
            }
        }

        public ImageQBarData(ArrayList<ImageQBarDataBean> arrayList, String str, Boolean bool) {
            this.f118411d = arrayList;
            this.f118412e = str;
            this.f118413f = bool.booleanValue();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.f118411d);
            parcel.writeString(this.f118412e);
            parcel.writeByte(this.f118413f ? (byte) 1 : 0);
        }

        public ImageQBarData(Parcel parcel) {
            this.f118411d = parcel.createTypedArrayList(ImageQBarDataBean.CREATOR);
            this.f118412e = parcel.readString();
            this.f118413f = parcel.readByte() != 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$ScanImageData */
    public static class ScanImageData implements Parcelable {
        public static final Parcelable.Creator<ScanImageData> CREATOR = new C43808a();

        /* renamed from: d */
        public String f118414d;

        /* renamed from: e */
        public long f118415e;

        /* renamed from: f */
        public float f118416f;

        /* renamed from: g */
        public float f118417g;

        /* renamed from: h */
        public int f118418h;

        /* renamed from: i */
        public int f118419i;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$ScanImageData$a */
        public class C43808a implements Parcelable.Creator<ScanImageData> {
            public Object createFromParcel(Parcel parcel) {
                return new ScanImageData(parcel);
            }

            public Object[] newArray(int i) {
                return new ScanImageData[i];
            }
        }

        public ScanImageData(String str, long j, float f, float f2, int i, int i2) {
            this.f118414d = str;
            this.f118415e = j;
            this.f118416f = f;
            this.f118417g = f2;
            this.f118418h = i;
            this.f118419i = i2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f118414d);
            parcel.writeLong(this.f118415e);
            parcel.writeFloat(this.f118416f);
            parcel.writeFloat(this.f118417g);
            parcel.writeInt(this.f118418h);
            parcel.writeInt(this.f118419i);
        }

        public ScanImageData(Parcel parcel) {
            this.f118414d = parcel.readString();
            this.f118415e = parcel.readLong();
            this.f118416f = parcel.readFloat();
            this.f118417g = parcel.readFloat();
            this.f118418h = parcel.readInt();
            this.f118419i = parcel.readInt();
        }
    }
}
