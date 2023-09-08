package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import c93.C39931b;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.model.C43718i1;
import com.tencent.p014mm.plugin.webview.model.C43725q1;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.C44209a;
import com.tencent.p014mm.plugin.webview.stub.C43787d;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.plugin.webview.stub.WebViewStubService;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import com.tencent.xweb.HttpAuthHandler;
import com.tencent.xweb.SslErrorHandler;
import com.tencent.xweb.WebResourceRequest;
import com.tencent.xweb.WebResourceResponse;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import d93.C45310h;
import di3.C86312j;
import e00.C45518r0;
import f40.C86709a0;
import i83.C46175a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import p225rc.C89925n;
import p237sp.C48455p;
import p749xh.C66261f3;
import qe3.C12212g;
import t83.C13841a;
import t83.C13851h1;
import t83.C48583f1;
import t83.C48590l;
import t83.C48616y;
import t93.C48618a;
import x83.C53298a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0 */
public class C44307k0 extends WebViewClient {

    /* renamed from: A */
    public C44335i f120069A = new C44335i();

    /* renamed from: B */
    public C44339m0 f120070B = new C44313f();

    /* renamed from: a */
    public MutableContextWrapper f120071a;

    /* renamed from: b */
    public MMWebView f120072b;

    /* renamed from: c */
    public MMHandler f120073c;

    /* renamed from: d */
    public C43791l f120074d;

    /* renamed from: e */
    public C45310h f120075e;

    /* renamed from: f */
    public C48583f1 f120076f = null;

    /* renamed from: g */
    public C48590l f120077g = null;

    /* renamed from: h */
    public final Bundle f120078h;

    /* renamed from: i */
    public boolean f120079i = false;

    /* renamed from: j */
    public String f120080j = "";

    /* renamed from: k */
    public final Map<String, Integer> f120081k = new HashMap();

    /* renamed from: l */
    public C44334h f120082l = new C44334h();

    /* renamed from: m */
    public C44333g f120083m = new C44333g((String) null);

    /* renamed from: n */
    public C43725q1 f120084n;

    /* renamed from: o */
    public String f120085o = null;

    /* renamed from: p */
    public String f120086p = null;

    /* renamed from: q */
    public String f120087q = null;

    /* renamed from: r */
    public List<C53298a> f120088r = new ArrayList();

    /* renamed from: s */
    public final Map<String, String> f120089s = new HashMap();

    /* renamed from: t */
    public final Map<String, Map<String, String>> f120090t = new ConcurrentHashMap();

    /* renamed from: u */
    public boolean f120091u = false;

    /* renamed from: v */
    public boolean f120092v = false;

    /* renamed from: w */
    public String f120093w;

    /* renamed from: x */
    public Map<String, String> f120094x;

    /* renamed from: y */
    public boolean f120095y = true;

    /* renamed from: z */
    public final Runnable f120096z = new C44310c();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$a */
    public class C44308a implements C45310h.C45313c {
        public C44308a() {
        }

        /* renamed from: a */
        public String mo67770a() {
            return C44307k0.this.f120072b.getUrl();
        }

        /* renamed from: b */
        public String mo67771b() {
            return C44307k0.this.f120072b.getUrl();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$b */
    public class C44309b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f120098d;

        public C44309b(String str) {
            this.f120098d = str;
        }

        public void run() {
            C44307k0.this.mo68627T(this.f120098d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$c */
    public class C44310c implements Runnable {
        public C44310c() {
        }

        public void run() {
            C48583f1 f1Var = C44307k0.this.f120076f;
            if (f1Var != null) {
                f1Var.mo73198c();
                C44307k0.this.f120076f.mo73199e();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$d */
    public class C44311d implements C48583f1.C48584a {
        public C44311d() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$e */
    public class C44312e extends SyncTask<String> {
        public C44312e(long j, String str) {
            super(j, str);
        }

        public Object run() {
            MMWebView mMWebView = C44307k0.this.f120072b;
            return mMWebView == null ? "" : mMWebView.getUrl();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f */
    public class C44313f extends C44339m0 {

        /* renamed from: e */
        public C44339m0 f120103e = new C44339m0();

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$a */
        public class C44314a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Map f120105d;

            public C44314a(Map map) {
                this.f120105d = map;
            }

            public void run() {
                C48590l lVar = C44307k0.this.f120077g;
                if (lVar != null) {
                    lVar.mo73246m0(this.f120105d);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$b */
        public class C44315b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Map f120107d;

            public C44315b(Map map) {
                this.f120107d = map;
            }

            public void run() {
                C48590l lVar = C44307k0.this.f120077g;
                if (lVar != null) {
                    lVar.mo73248n0(this.f120107d);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$c */
        public class C44316c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bundle f120109d;

            public C44316c(Bundle bundle) {
                this.f120109d = bundle;
            }

            public void run() {
                C45310h hVar;
                if (!this.f120109d.containsKey("jsapi_preverify_fun_list") || (hVar = C44307k0.this.f120075e) == null) {
                    boolean z = true;
                    Object[] objArr = new Object[1];
                    if (C44307k0.this.f120075e == null) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    Log.m105921e("MicroMsg.MMWebViewClient", "has JSAPI_CONTROL_BYTES wvPerm %b", objArr);
                } else {
                    hVar.mo70866i(this.f120109d);
                }
                C48590l lVar = C44307k0.this.f120077g;
                if (lVar != null) {
                    lVar.mo8700d();
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$d */
        public class C44317d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bundle f120111d;

            public C44317d(Bundle bundle) {
                this.f120111d = bundle;
            }

            public void run() {
                if (C44307k0.this.f120077g != null) {
                    C44307k0.this.f120077g.mo73225V(this.f120111d.getString("webview_network_type"));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$e */
        public class C44318e implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bundle f120113d;

            public C44318e(C44313f fVar, Bundle bundle) {
                this.f120113d = bundle;
            }

            public void run() {
                ((C44209a) ((C45518r0) C86312j.m106911c(C45518r0.class)).gi0()).mo68872c(this.f120113d);
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$f */
        public class C44319f implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bundle f120114d;

            public C44319f(C44313f fVar, Bundle bundle) {
                this.f120114d = bundle;
            }

            public void run() {
                ((C44209a) ((C45518r0) C86312j.m106911c(C45518r0.class)).gi0()).mo68873d(2, this.f120114d);
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$g */
        public class C44320g implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bundle f120115d;

            public C44320g(C44313f fVar, Bundle bundle) {
                this.f120115d = bundle;
            }

            public void run() {
                ((C44209a) ((C45518r0) C86312j.m106911c(C45518r0.class)).gi0()).mo68873d(1, this.f120115d);
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$h */
        public class C44321h implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bundle f120116d;

            public C44321h(C44313f fVar, Bundle bundle) {
                this.f120116d = bundle;
            }

            public void run() {
                Bundle bundle = this.f120116d;
                int i = -1;
                int i2 = bundle != null ? bundle.getInt("key_image_pos", -1) : -1;
                Bundle bundle2 = this.f120116d;
                if (bundle2 != null) {
                    i = bundle2.getInt("key_webview_id", -1);
                }
                ((C48618a) ((C45518r0) C86312j.m106911c(C45518r0.class)).mo70754Pl()).mo73331a(i, i2);
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$i */
        public class C44322i implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f120117d;

            /* renamed from: e */
            public final /* synthetic */ int f120118e;

            /* renamed from: f */
            public final /* synthetic */ int f120119f;

            /* renamed from: g */
            public final /* synthetic */ String f120120g;

            /* renamed from: h */
            public final /* synthetic */ Bundle f120121h;

            public C44322i(int i, int i2, int i3, String str, Bundle bundle) {
                this.f120117d = i;
                this.f120118e = i2;
                this.f120119f = i3;
                this.f120120g = str;
                this.f120121h = bundle;
            }

            public void run() {
                try {
                    C44307k0 k0Var = C44307k0.this;
                    int i = this.f120117d;
                    int i2 = this.f120118e;
                    int i3 = this.f120119f;
                    String str = this.f120120g;
                    Bundle bundle = this.f120121h;
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    C44307k0.m48595J(k0Var, i, i2, i3, str, bundle);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.MMWebViewClient", e.getMessage());
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$j */
        public class C44323j implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f120123d;

            /* renamed from: e */
            public final /* synthetic */ String f120124e;

            /* renamed from: f */
            public final /* synthetic */ Bundle f120125f;

            /* renamed from: g */
            public final /* synthetic */ boolean f120126g;

            public C44323j(String str, String str2, Bundle bundle, boolean z) {
                this.f120123d = str;
                this.f120124e = str2;
                this.f120125f = bundle;
                this.f120126g = z;
            }

            public void run() {
                C44307k0.this.f120077g.mo8702g(this.f120123d, this.f120124e, C13841a.m13131a(this.f120125f), this.f120126g);
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$k */
        public class C44324k implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bundle f120128d;

            public C44324k(Bundle bundle) {
                this.f120128d = bundle;
            }

            public void run() {
                C45310h hVar;
                C44307k0 k0Var = C44307k0.this;
                if (k0Var.f120077g != null && (hVar = k0Var.f120075e) != null && hVar.mo70860c().mo69447f(42)) {
                    C44307k0.this.f120077g.mo73207D(this.f120128d, "download_succ");
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$l */
        public class C44325l implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bundle f120130d;

            public C44325l(Bundle bundle) {
                this.f120130d = bundle;
            }

            public void run() {
                C45310h hVar;
                C44307k0 k0Var = C44307k0.this;
                if (k0Var.f120077g != null && (hVar = k0Var.f120075e) != null && hVar.mo70860c().mo69447f(42)) {
                    C44307k0.this.f120077g.mo73207D(this.f120130d, "download_fail");
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$m */
        public class C44326m implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bundle f120132d;

            public C44326m(Bundle bundle) {
                this.f120132d = bundle;
            }

            public void run() {
                C45310h hVar;
                C44307k0 k0Var = C44307k0.this;
                if (k0Var.f120077g != null && (hVar = k0Var.f120075e) != null && hVar.mo70860c().mo69447f(42)) {
                    C44307k0.this.f120077g.mo73207D(this.f120132d, "download_removed");
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$n */
        public class C44327n implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f120134d;

            /* renamed from: e */
            public final /* synthetic */ long f120135e;

            /* renamed from: f */
            public final /* synthetic */ int f120136f;

            /* renamed from: g */
            public final /* synthetic */ float f120137g;

            public C44327n(String str, long j, int i, float f) {
                this.f120134d = str;
                this.f120135e = j;
                this.f120136f = i;
                this.f120137g = f;
            }

            public void run() {
                C45310h hVar;
                C44307k0 k0Var = C44307k0.this;
                if (k0Var.f120077g != null && (hVar = k0Var.f120075e) != null && hVar.mo70860c().mo69447f(42)) {
                    C44307k0.this.f120077g.mo73206C(this.f120134d, this.f120135e, this.f120136f, this.f120137g);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$o */
        public class C44328o implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f120139d;

            /* renamed from: e */
            public final /* synthetic */ int f120140e;

            public C44328o(String str, int i) {
                this.f120139d = str;
                this.f120140e = i;
            }

            public void run() {
                C48590l lVar = C44307k0.this.f120077g;
                if (lVar != null) {
                    lVar.mo73217N(this.f120139d, this.f120140e);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$p */
        public class C44329p implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f120142d;

            /* renamed from: e */
            public final /* synthetic */ int f120143e;

            public C44329p(String str, int i) {
                this.f120142d = str;
                this.f120143e = i;
            }

            public void run() {
                C48590l lVar = C44307k0.this.f120077g;
                if (lVar != null) {
                    lVar.mo73216M(this.f120142d, this.f120143e);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$q */
        public class C44330q implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f120145d;

            /* renamed from: e */
            public final /* synthetic */ int f120146e;

            public C44330q(String str, int i) {
                this.f120145d = str;
                this.f120146e = i;
            }

            public void run() {
                C48590l lVar = C44307k0.this.f120077g;
                if (lVar != null) {
                    lVar.mo73250o0(this.f120145d, this.f120146e);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$r */
        public class C44331r implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f120148d;

            /* renamed from: e */
            public final /* synthetic */ int f120149e;

            public C44331r(String str, int i) {
                this.f120148d = str;
                this.f120149e = i;
            }

            public void run() {
                C48590l lVar = C44307k0.this.f120077g;
                if (lVar != null) {
                    lVar.mo73244l0(this.f120148d, this.f120149e);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$f$s */
        public class C44332s implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f120151d;

            /* renamed from: e */
            public final /* synthetic */ int f120152e;

            public C44332s(String str, int i) {
                this.f120151d = str;
                this.f120152e = i;
            }

            public void run() {
                C48590l lVar = C44307k0.this.f120077g;
                if (lVar != null) {
                    lVar.mo73242k0(this.f120151d, this.f120152e);
                }
            }
        }

        public C44313f() {
        }

        /* renamed from: B7 */
        public void mo7025B7(String str) {
            mo69054e().mo7025B7(str);
        }

        public void Ef0() {
            LinkedList<C13851h1> linkedList;
            C48590l lVar = C44307k0.this.f120077g;
            if (lVar != null && (linkedList = lVar.f130000e) != null) {
                linkedList.clear();
            }
        }

        /* renamed from: Gb */
        public void mo7028Gb(String str, String str2) {
            mo69054e().mo7028Gb(str, str2);
        }

        /* renamed from: Ni */
        public String mo7029Ni() {
            return C44307k0.this.f120085o;
        }

        /* renamed from: US */
        public void mo7030US(String str, String str2, int i, int i2) {
            mo69054e().mo7030US(str, str2, i, i2);
        }

        /* renamed from: V5 */
        public Bundle mo7031V5(int i, Bundle bundle) {
            return mo69054e().mo7031V5(i, bundle);
        }

        /* renamed from: XB */
        public void mo7032XB(int i, Bundle bundle) {
            mo69054e().mo7032XB(i, bundle);
        }

        public boolean Zu0(String str, String str2, Bundle bundle, boolean z) {
            C44307k0 k0Var = C44307k0.this;
            if (k0Var.f120077g == null) {
                return false;
            }
            k0Var.f120073c.post(new C44323j(str, str2, bundle, z));
            mo69054e().Zu0(str, str2, bundle, z);
            return false;
        }

        public boolean callback(int i, Bundle bundle) {
            Log.m105924i("MicroMsg.MMWebViewClient", "callback, actionCode = " + i);
            if (i == 90) {
                C44307k0 k0Var = C44307k0.this;
                if (k0Var.f120077g != null) {
                    k0Var.f120073c.post(new C44317d(bundle));
                }
            } else if (i == 2008) {
                HashMap hashMap = new HashMap();
                hashMap.put(C66261f3.COL_LOCALID, bundle.getString(C66261f3.COL_LOCALID));
                hashMap.put("err_msg", bundle.getString("recordResult"));
                C44307k0.this.f120073c.post(new C44315b(hashMap));
            } else if (i == 2010) {
                C44307k0.this.f120073c.post(new C44332s(bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
            } else if (i == 1002) {
                C44307k0.this.f120073c.post(new C44324k(bundle));
            } else if (i != 1003) {
                switch (i) {
                    case 1006:
                        C44307k0 k0Var2 = C44307k0.this;
                        if (k0Var2.f120077g != null) {
                            k0Var2.f120073c.post(new C44316c(bundle));
                            break;
                        }
                        break;
                    case 1007:
                        long j = bundle.getLong("download_manager_downloadid");
                        int i2 = bundle.getInt("download_manager_progress");
                        float f = bundle.getFloat("download_manager_progress_float");
                        C44307k0.this.f120073c.post(new C44327n(bundle.getString("download_manager_appid", ""), j, i2, f));
                        break;
                    case 1008:
                        C44307k0.this.f120073c.post(new C44326m(bundle));
                        break;
                    default:
                        switch (i) {
                            case 2002:
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("err_msg", bundle.getString("playResult"));
                                hashMap2.put(C66261f3.COL_LOCALID, bundle.getString(C66261f3.COL_LOCALID));
                                C44307k0.this.f120073c.post(new C44314a(hashMap2));
                                break;
                            case 2003:
                                C44307k0.this.f120073c.post(new C44328o(bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                break;
                            case 2004:
                                C44307k0.this.f120073c.post(new C44329p(bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                break;
                            case 2005:
                                C44307k0.this.f120073c.post(new C44330q(bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                break;
                            case 2006:
                                C44307k0.this.f120073c.post(new C44331r(bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                break;
                            default:
                                switch (i) {
                                    case 121000:
                                        if (!C86709a0.m107531m().mo58407a().mo71804b()) {
                                            C44307k0 k0Var3 = C44307k0.this;
                                            if (k0Var3.f120077g != null) {
                                                k0Var3.f120073c.post(new C44318e(this, bundle));
                                                break;
                                            }
                                        }
                                        break;
                                    case 121001:
                                        if (!C86709a0.m107531m().mo58407a().mo71804b()) {
                                            C44307k0 k0Var4 = C44307k0.this;
                                            if (k0Var4.f120077g != null) {
                                                k0Var4.f120073c.post(new C44319f(this, bundle));
                                                break;
                                            }
                                        }
                                        break;
                                    case 121002:
                                        if (!C86709a0.m107531m().mo58407a().mo71804b()) {
                                            C44307k0 k0Var5 = C44307k0.this;
                                            if (k0Var5.f120077g != null) {
                                                k0Var5.f120073c.post(new C44320g(this, bundle));
                                                break;
                                            }
                                        }
                                        break;
                                    case 121003:
                                        C44307k0 k0Var6 = C44307k0.this;
                                        if (k0Var6.f120077g != null) {
                                            k0Var6.f120073c.post(new C44321h(this, bundle));
                                            break;
                                        }
                                        break;
                                    default:
                                        Log.m105920e("MicroMsg.MMWebViewClient", "undefine action code!!!");
                                        break;
                                }
                        }
                }
            } else {
                C44307k0.this.f120073c.post(new C44325l(bundle));
            }
            mo69054e().callback(i, bundle);
            return true;
        }

        /* renamed from: d */
        public void mo7036d(Bundle bundle) {
            mo69054e().mo7036d(bundle);
        }

        /* renamed from: e */
        public final C44339m0 mo69054e() {
            C44339m0 M = C44307k0.this.mo68624M();
            return M == null ? this.f120103e : M;
        }

        /* renamed from: es */
        public void mo7061es(boolean z) {
            mo69054e().mo7061es(z);
        }

        public boolean fq0(C43787d dVar) {
            if (C44307k0.this.f120072b == null) {
                return true;
            }
            Log.m105924i("MicroMsg.MMWebViewClient", "onSceneEnd, instance hashcode = " + C44307k0.this.f120072b.hashCode());
            C44307k0.this.f120073c.post(new C44322i(dVar.getType(), dVar.Dq0(), dVar.Xe0(), dVar.getErrMsg(), dVar.getData()));
            return mo69054e().fq0(dVar);
        }

        public String getCurrentUrl() {
            return C44307k0.this.mo69044K();
        }

        /* renamed from: hb */
        public boolean mo7040hb(int i) {
            return mo69054e().mo7040hb(i);
        }

        /* renamed from: kn */
        public void mo7062kn(boolean z) {
            mo69054e().mo7062kn(z);
        }

        /* renamed from: mC */
        public void mo7041mC(Bundle bundle) {
            mo69054e().mo7041mC(bundle);
        }

        public Bundle q10(String str, String str2) {
            return mo69054e().q10(str, str2);
        }

        /* renamed from: uP */
        public void mo7043uP() {
            MMHandler mMHandler;
            C48590l lVar = C44307k0.this.f120077g;
            if (lVar != null && (mMHandler = lVar.f130001f) != null) {
                mMHandler.post(new C48616y(lVar));
            }
        }

        /* renamed from: xf */
        public void mo7044xf(boolean z) {
            mo69054e().mo7044xf(z);
        }

        /* renamed from: xx */
        public void mo7045xx(String str, String str2) {
            mo69054e().mo7045xx(str, str2);
        }

        public String ya0() {
            return mo69054e().ya0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$g */
    public static class C44333g {

        /* renamed from: b */
        public static final Pattern f120154b = Pattern.compile(".*#.*wechat_redirect");

        /* renamed from: a */
        public String f120155a;

        public C44333g(String str) {
            this.f120155a = str;
        }

        /* renamed from: a */
        public int mo69074a(String str, boolean z) {
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.MMWebViewClient", "getReason fail, url is null");
                return 0;
            } else if (!str.equals(this.f120155a) || !z) {
                return f120154b.matcher(str).find() ? 2 : 1;
            } else {
                return 0;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$h */
    public class C44334h {

        /* renamed from: a */
        public int f120156a = 0;

        public C44334h() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$i */
    public class C44335i implements ServiceConnection {
        public C44335i() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.m105924i("MicroMsg.MMWebViewClient", "onServiceConnected");
            C44307k0 k0Var = C44307k0.this;
            if (k0Var.f120072b == null) {
                Log.m105920e("MicroMsg.MMWebViewClient", "onServiceConnected, activity destroyed");
                return;
            }
            try {
                k0Var.f120074d = C43791l.C43792a.m47732a(iBinder);
                C44307k0.this.f120074d.Np0(new C44336j(new WeakReference(C44307k0.this.f120070B)), C44307k0.this.f120072b.hashCode());
                C44307k0 k0Var2 = C44307k0.this;
                Bundle bundle = k0Var2.f120078h;
                if (bundle != null) {
                    k0Var2.f120074d.Md0(bundle, k0Var2.f120072b.hashCode());
                }
                C44307k0.this.mo69047P();
                C44307k0.this.mo68626R();
                C44307k0 k0Var3 = C44307k0.this;
                k0Var3.mo68633Z(k0Var3.f120074d, k0Var3.f120075e);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MMWebViewClient", "addCallback fail, ex = %s", e.getMessage());
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Log.m105924i("MicroMsg.MMWebViewClient", "edw onServiceDisconnected");
            C44307k0 k0Var = C44307k0.this;
            if (!k0Var.f120072b.f122358h) {
                Log.m105924i("MicroMsg.MMWebViewClient", "maybe mm process crash, try rebind service");
                C44307k0 k0Var2 = C44307k0.this;
                k0Var2.getClass();
                Log.m105924i("MicroMsg.MMWebViewClient", "tryBindService");
                k0Var2.f120071a.bindService(new Intent(k0Var2.f120071a, WebViewStubService.class), k0Var2.f120069A, 1);
                return;
            }
            k0Var.f120074d = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k0$j */
    public static class C44336j extends C44339m0 {

        /* renamed from: e */
        public WeakReference<C44339m0> f120159e;

        public C44336j(WeakReference<C44339m0> weakReference) {
            this.f120159e = weakReference;
        }

        /* renamed from: B7 */
        public void mo7025B7(String str) {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                m0Var.mo7025B7(str);
            }
        }

        public void Ef0() {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                m0Var.Ef0();
            }
        }

        /* renamed from: F7 */
        public int mo7027F7() {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                return m0Var.mo7027F7();
            }
            return 0;
        }

        /* renamed from: Gb */
        public void mo7028Gb(String str, String str2) {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                m0Var.mo7028Gb(str, str2);
            }
        }

        /* renamed from: Ni */
        public String mo7029Ni() {
            C44339m0 m0Var = this.f120159e.get();
            return m0Var != null ? m0Var.mo7029Ni() : "";
        }

        /* renamed from: US */
        public void mo7030US(String str, String str2, int i, int i2) {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                m0Var.mo7030US(str, str2, i, i2);
            }
        }

        /* renamed from: V5 */
        public Bundle mo7031V5(int i, Bundle bundle) {
            C44339m0 m0Var = this.f120159e.get();
            return m0Var != null ? m0Var.mo7031V5(i, bundle) : new Bundle();
        }

        /* renamed from: XB */
        public void mo7032XB(int i, Bundle bundle) {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                m0Var.mo7032XB(i, bundle);
            }
        }

        public boolean Zu0(String str, String str2, Bundle bundle, boolean z) {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                return m0Var.Zu0(str, str2, bundle, z);
            }
            return false;
        }

        public boolean callback(int i, Bundle bundle) {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                return m0Var.callback(i, bundle);
            }
            return false;
        }

        /* renamed from: d */
        public void mo7036d(Bundle bundle) {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                m0Var.mo7036d(bundle);
            }
        }

        /* renamed from: e3 */
        public String mo7037e3() {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                return m0Var.mo7037e3();
            }
            return null;
        }

        /* renamed from: es */
        public void mo7061es(boolean z) {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                m0Var.mo7061es(z);
            }
        }

        public boolean fq0(C43787d dVar) {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                return m0Var.fq0(dVar);
            }
            return false;
        }

        public String getCurrentUrl() {
            C44339m0 m0Var = this.f120159e.get();
            return m0Var != null ? m0Var.getCurrentUrl() : "";
        }

        /* renamed from: hb */
        public boolean mo7040hb(int i) {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                return m0Var.mo7040hb(i);
            }
            return false;
        }

        /* renamed from: kn */
        public void mo7062kn(boolean z) {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                m0Var.mo7062kn(z);
            }
        }

        /* renamed from: mC */
        public void mo7041mC(Bundle bundle) {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                m0Var.mo7041mC(bundle);
            }
        }

        public Bundle q10(String str, String str2) {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                return m0Var.q10(str, str2);
            }
            return null;
        }

        /* renamed from: uP */
        public void mo7043uP() {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                m0Var.mo7043uP();
            }
        }

        /* renamed from: xf */
        public void mo7044xf(boolean z) {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                m0Var.mo7044xf(z);
            }
        }

        /* renamed from: xx */
        public void mo7045xx(String str, String str2) {
            C44339m0 m0Var = this.f120159e.get();
            if (m0Var != null) {
                m0Var.mo7045xx(str, str2);
            }
        }

        public String ya0() {
            C44339m0 m0Var = this.f120159e.get();
            return m0Var != null ? m0Var.ya0() : "";
        }
    }

    public C44307k0(MMWebView mMWebView, boolean z, Bundle bundle) {
        Parcelable parcelable = null;
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(mMWebView.getContext());
        if (mMWebView.getContext() instanceof MutableContextWrapper) {
            this.f120071a = (MutableContextWrapper) mMWebView.getContext();
        } else {
            MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(mMWebView.getContext());
            this.f120071a = mutableContextWrapper;
            if (castActivityOrNull != null) {
                mutableContextWrapper.setBaseContext(castActivityOrNull);
            }
        }
        this.f120072b = mMWebView;
        this.f120073c = new MMHandler();
        C45310h hVar = new C45310h(new C44308a());
        this.f120075e = hVar;
        hVar.mo70865h((JsapiPermissionWrapper) (castActivityOrNull == null ? null : castActivityOrNull.getIntent().getParcelableExtra("hardcode_jspermission")), (GeneralControlWrapper) (castActivityOrNull != null ? castActivityOrNull.getIntent().getParcelableExtra("hardcode_general_ctrl") : parcelable));
        this.f120079i = z;
        this.f120078h = bundle;
        this.f120084n = new C43725q1(this.f120071a);
        Log.m105925i("MicroMsg.MMWebViewClient", "MMWebViewClient init, webview: %d, resourceInterrupter: %d", Integer.valueOf(this.f120072b.hashCode()), Integer.valueOf(this.f120084n.hashCode()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b6, code lost:
        if (r3 != 5) goto L_0x0102;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m48595J(com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44307k0 r7, int r8, int r9, int r10, java.lang.String r11, android.os.Bundle r12) {
        /*
            com.tencent.mm.ui.widget.MMWebView r11 = r7.f120072b
            boolean r11 = r11.f122358h
            java.lang.String r0 = "MicroMsg.MMWebViewClient"
            r1 = 1
            if (r11 != 0) goto L_0x00fd
            d93.h r11 = r7.f120075e
            if (r11 != 0) goto L_0x000f
            goto L_0x00fd
        L_0x000f:
            java.lang.String r11 = "scene_end_listener_hash_code"
            int r11 = r12.getInt(r11)
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r3[r4] = r5
            com.tencent.mm.ui.widget.MMWebView r4 = r7.f120072b
            int r4 = r4.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
            java.lang.String r4 = "get hash code = %d, self hash code = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "edw onSceneEnd, type = "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = ", errCode = "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r4 = ", errType = "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            com.tencent.mm.ui.widget.MMWebView r3 = r7.f120072b
            int r3 = r3.hashCode()
            if (r11 == r3) goto L_0x0063
            java.lang.String r7 = "hash code not equal"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)
            goto L_0x0102
        L_0x0063:
            r11 = 233(0xe9, float:3.27E-43)
            if (r8 == r11) goto L_0x0069
            goto L_0x0102
        L_0x0069:
            com.tencent.mm.plugin.webview.ui.tools.widget.k0$h r8 = r7.f120082l
            int r3 = r8.f120156a
            int r3 = r3 + -1
            r8.f120156a = r3
            if (r3 > 0) goto L_0x0078
            com.tencent.mm.plugin.webview.ui.tools.widget.k0 r8 = com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44307k0.this
            r8.mo69049d0(r11)
        L_0x0078:
            com.tencent.mm.protocal.JsapiPermissionWrapper r8 = new com.tencent.mm.protocal.JsapiPermissionWrapper
            java.lang.String r11 = "geta8key_result_jsapi_perm_control_bytes"
            byte[] r11 = r12.getByteArray(r11)
            r8.<init>((byte[]) r11)
            com.tencent.mm.protocal.GeneralControlWrapper r11 = new com.tencent.mm.protocal.GeneralControlWrapper
            java.lang.String r3 = "geta8key_result_general_ctrl_b1"
            int r3 = r12.getInt(r3)
            r11.<init>((int) r3)
            java.lang.String r3 = "geta8key_result_reason"
            int r3 = r12.getInt(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "edw geta8key onSceneEnd, req reason = "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            java.lang.String r0 = "geta8key_result_full_url"
            r4 = -2005(0xfffffffffffff82b, float:NaN)
            r5 = 4
            java.lang.String r6 = "geta8key_result_req_url"
            if (r3 == 0) goto L_0x00e6
            if (r3 == r1) goto L_0x00b9
            if (r3 == r2) goto L_0x00e6
            r2 = 5
            if (r3 == r2) goto L_0x00b9
            goto L_0x0102
        L_0x00b9:
            if (r9 != 0) goto L_0x00ce
            if (r10 != 0) goto L_0x00ce
            java.lang.String r9 = r12.getString(r6)
            d93.h r10 = r7.f120075e
            r10.mo70864g(r9, r8, r11)
            java.util.Map<java.lang.String, java.lang.Integer> r7 = r7.f120081k
            java.util.HashMap r7 = (java.util.HashMap) r7
            r7.remove(r9)
            goto L_0x0102
        L_0x00ce:
            if (r9 != r5) goto L_0x0102
            if (r10 != r4) goto L_0x0102
            com.tencent.mm.ui.widget.MMWebView r9 = r7.f120072b
            r9.stopLoading()
            java.lang.String r9 = r12.getString(r0)
            java.lang.String r10 = r12.getString(r6)
            r7.mo69051h0(r10, r9, r8, r11)
            r7.mo68635c0(r12)
            goto L_0x0102
        L_0x00e6:
            if (r9 != 0) goto L_0x00ea
            if (r10 == 0) goto L_0x00ee
        L_0x00ea:
            if (r9 != r5) goto L_0x0102
            if (r10 != r4) goto L_0x0102
        L_0x00ee:
            java.lang.String r9 = r12.getString(r0)
            java.lang.String r10 = r12.getString(r6)
            r7.mo69051h0(r10, r9, r8, r11)
            r7.mo68635c0(r12)
            goto L_0x0102
        L_0x00fd:
            java.lang.String r7 = "onSceneEnd, isFinishing, do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r7)
        L_0x0102:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44307k0.m48595J(com.tencent.mm.plugin.webview.ui.tools.widget.k0, int, int, int, java.lang.String, android.os.Bundle):boolean");
    }

    /* renamed from: K */
    public final String mo69044K() {
        if (!Util.isNullOrNil(this.f120086p)) {
            return this.f120086p;
        }
        if (this.f120073c == null) {
            return null;
        }
        if (Thread.currentThread().getId() != this.f120073c.getLooper().getThread().getId()) {
            return (String) new C44312e(500, "").exec(this.f120073c);
        }
        MMWebView mMWebView = this.f120072b;
        return mMWebView == null ? "" : mMWebView.getUrl();
    }

    /* renamed from: L */
    public String mo68623L() {
        return "";
    }

    /* renamed from: M */
    public C44339m0 mo68624M() {
        return null;
    }

    /* renamed from: N */
    public boolean mo69045N(String str) {
        return false;
    }

    /* renamed from: O */
    public boolean mo69046O(String str) {
        Iterator it = ((ArrayList) this.f120088r).iterator();
        while (it.hasNext()) {
            C53298a aVar = (C53298a) it.next();
            if (aVar.mo67830e(str)) {
                boolean b = aVar.mo67829b(str);
                Log.m105924i("MicroMsg.MMWebViewClient", "url handled, ret = " + b + ", url = " + str);
                return true;
            }
        }
        return mo69045N(str);
    }

    /* renamed from: P */
    public void mo69047P() {
        int i;
        MMWebView mMWebView = this.f120072b;
        C48590l lVar = new C48590l(mMWebView, this.f120075e, mMWebView.hashCode());
        this.f120077g = lVar;
        lVar.f130007l = this.f120074d;
        Log.m105925i("MicroMsg.MMWebViewClient", "initJsApi， webview: %d, jsapi: %d", Integer.valueOf(this.f120072b.hashCode()), Integer.valueOf(this.f120077g.hashCode()));
        C48590l lVar2 = this.f120077g;
        lVar2.f130002g = null;
        this.f120072b.addJavascriptInterface(lVar2, "__wx");
        if (this.f120077g.mo73268z() != null) {
            this.f120072b.addJavascriptInterface(this.f120077g.mo73268z(), "__wxtag");
        }
        ((ArrayList) this.f120088r).add(this.f120077g);
        C48583f1 f1Var = new C48583f1(this.f120072b, this.f120077g, new C44311d(), false);
        this.f120076f = f1Var;
        mo68632Y(f1Var);
        try {
            i = Util.getInt(this.f120074d.mf0("WebviewDisableDigestVerify"), 0);
        } catch (Exception e) {
            Log.m105928w("MicroMsg.MMWebViewClient", "getting js digest verification config fails, ex = " + e.getMessage());
            i = 0;
        }
        Log.m105925i("MicroMsg.MMWebViewClient", "js digest verification config = %d", Integer.valueOf(i));
        if (i == 0 && this.f120071a.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).getBoolean("wvsha1", true)) {
            this.f120077g.mo73259t0(true);
        }
    }

    /* renamed from: Q */
    public boolean mo68625Q(String str) {
        return false;
    }

    /* renamed from: R */
    public void mo68626R() {
        if (!TextUtils.isEmpty(this.f120085o)) {
            if (C89925n.m112490c(this.f120085o, "weixin://")) {
                Log.m105929w("MicroMsg.MMWebViewClient", "loadInitialUrl can not deal with this weixin scheme, stop directly, url = %s", this.f120085o);
            } else if (!mo69046O(this.f120085o)) {
                Uri parse = Uri.parse(this.f120085o);
                if (parse.getScheme() == null) {
                    String str = this.f120085o + HttpWrapperBase.PROTOCAL_HTTP;
                    this.f120085o = str;
                    parse = Uri.parse(str);
                }
                if (parse.getScheme().startsWith("http")) {
                    Log.m105924i("MicroMsg.MMWebViewClient", "uri scheme not startwith http, scheme = " + parse.getScheme());
                    String str2 = this.f120085o;
                    this.f120083m = new C44333g(str2);
                    if (this.f120079i || this.f120075e.mo70862e(str2)) {
                        this.f120072b.loadUrl(this.f120085o);
                    } else {
                        mo68636e0(this.f120085o, false);
                    }
                } else if (!C43718i1.m47559a(this.f120085o)) {
                    mo68634a0(this.f120085o);
                } else {
                    this.f120072b.loadUrl(this.f120085o);
                }
            }
        }
    }

    /* renamed from: T */
    public void mo68627T(String str) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("Pragma", "no-cache");
        hashMap.put("Cache-Control", "no-cache");
        this.f120072b.loadUrl(str, hashMap);
    }

    /* renamed from: U */
    public void mo68628U() {
    }

    /* renamed from: V */
    public void mo68629V(WebView webView, String str) {
    }

    /* renamed from: W */
    public void mo68630W(WebView webView, String str, Bitmap bitmap) {
    }

    /* renamed from: X */
    public void mo68631X(C48590l lVar) {
    }

    /* renamed from: Y */
    public void mo68632Y(C48583f1 f1Var) {
    }

    /* renamed from: Z */
    public void mo68633Z(C43791l lVar, C45310h hVar) {
    }

    /* renamed from: a0 */
    public void mo68634a0(String str) {
    }

    /* renamed from: b0 */
    public final boolean mo69048b0(String str, String str2) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
            Pattern pattern = C46175a.f124471a;
            if (pattern.matcher(str).matches() && pattern.matcher(str2).matches()) {
                String replaceFirst = str.replaceFirst(HttpWrapperBase.PROTOCAL_HTTP, "").replaceFirst(HttpWrapperBase.PROTOCAL_HTTPS, "");
                int indexOf = replaceFirst.indexOf(35);
                if (indexOf > 0) {
                    replaceFirst = replaceFirst.substring(0, indexOf);
                }
                return str2.replaceFirst(HttpWrapperBase.PROTOCAL_HTTP, "").replaceFirst(HttpWrapperBase.PROTOCAL_HTTPS, "").startsWith(replaceFirst) && this.f120074d != null && mo68625Q(str);
            }
        }
    }

    /* renamed from: c0 */
    public boolean mo68635c0(Bundle bundle) {
        boolean z = false;
        Log.m105919d("MicroMsg.MMWebViewClient", "[cpan] process a8 key:%d", Long.valueOf(System.currentTimeMillis()));
        int i = bundle.getInt("geta8key_result_action_code");
        String string = bundle.getString("geta8key_result_title");
        String string2 = bundle.getString("geta8key_result_full_url");
        String string3 = bundle.getString("geta8key_result_content");
        Log.m105924i("MicroMsg.MMWebViewClient", "processGetA8Key, actionCode = " + i + ", title = " + string + ", fullUrl = " + string2 + ", content = " + string3);
        String[] stringArray = bundle.getStringArray("geta8key_result_http_header_key_list");
        String[] stringArray2 = bundle.getStringArray("geta8key_result_http_header_value_list");
        HashMap hashMap = new HashMap();
        if (stringArray != null && stringArray2 != null && stringArray.length > 0 && stringArray2.length > 0 && stringArray.length == stringArray2.length) {
            for (int i2 = 0; i2 < stringArray.length; i2++) {
                hashMap.put(stringArray[i2], stringArray2[i2]);
            }
        }
        this.f120094x = hashMap;
        if (i != 1) {
            if (i != 2) {
                if (i == 6) {
                    Log.m105924i("MicroMsg.MMWebViewClient", "getA8key-special_webview: fullUrl = " + string2);
                    if (string2 == null || string2.length() == 0) {
                        Log.m105920e("MicroMsg.MMWebViewClient", "getA8key-special_webview fail, invalid fullUrl");
                        return false;
                    } else if (!C43718i1.m47559a(string2)) {
                        Log.m105922f("MicroMsg.MMWebViewClient", "processGetA8Key special, canLoadUrl fail, url = " + string2);
                        mo68634a0(string2);
                        return true;
                    } else {
                        this.f120072b.loadUrl(string2);
                        return true;
                    }
                } else if (i != 7) {
                    Log.m105924i("MicroMsg.MMWebViewClient", "qrcode-getA8key-not_catch: action code = " + i);
                    return false;
                }
            }
            Log.m105924i("MicroMsg.MMWebViewClient", "getA8key-webview/no-notice: title = " + string + ", fullUrl = " + string2);
            if (string2 == null || string2.length() == 0) {
                Log.m105920e("MicroMsg.MMWebViewClient", "getA8key-webview fail, invalid fullUrl");
                return false;
            } else if (!C43718i1.m47559a(string2)) {
                Log.m105922f("MicroMsg.MMWebViewClient", "processGetA8Key qrcode, canLoadUrl fail, url = " + string2);
                mo68634a0(string2);
                return true;
            } else {
                String nullAs = Util.nullAs(mo69044K(), this.f120085o);
                if (Util.isNullOrNil(nullAs)) {
                    Log.m105920e("MicroMsg.MMWebViewClient", "after getA8Key, currentURL is null or nil, wtf");
                    this.f120072b.loadUrl(string2);
                } else if (this.f120077g == null) {
                    if (hashMap.size() > 0) {
                        this.f120072b.loadUrl(string2, hashMap);
                    } else {
                        this.f120072b.loadUrl(string2);
                    }
                } else if (!Util.nullAsNil(string2).contains("#wechat_redirect")) {
                    if (!mo69048b0(nullAs, string2)) {
                        String b = C39931b.m42722b(nullAs);
                        String b2 = C39931b.m42722b(string2);
                        if (!Util.isNullOrNil(b2) && !Util.isNullOrNil(b) && b2.equals(b) && this.f120074d != null && mo68625Q(nullAs)) {
                            z = true;
                        }
                        if (!z) {
                            if (hashMap.size() > 0) {
                                this.f120072b.loadUrl(string2, hashMap);
                            } else {
                                this.f120072b.loadUrl(string2);
                            }
                        }
                    }
                    ((HashMap) this.f120089s).put(nullAs, string2);
                    ((ConcurrentHashMap) this.f120090t).put(nullAs, hashMap);
                    this.f120077g.mo73214K(string2, hashMap);
                } else if (hashMap.size() > 0) {
                    this.f120072b.loadUrl(string2, hashMap);
                } else {
                    this.f120072b.loadUrl(string2);
                }
                return true;
            }
        } else {
            Log.m105924i("MicroMsg.MMWebViewClient", "getA8key-text: " + string3);
            if (string3 == null || string3.length() == 0) {
                Log.m105920e("MicroMsg.MMWebViewClient", "getA8key-text fail, invalid content");
                return false;
            }
            this.f120072b.getSettings().setJavaScriptEnabled(false);
            this.f120072b.loadData(string3, "text/html", "utf-8");
            return true;
        }
    }

    /* renamed from: d0 */
    public final void mo69049d0(int i) {
        try {
            if (this.f120074d != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("scene_end_type", i);
                bundle.putInt("scene_end_listener_hash_code", this.f120072b.hashCode());
                this.f120074d.mo68145pG(6, bundle, this.f120072b.hashCode());
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MMWebViewClient", "removeSceneEnd, ex = " + e.getMessage());
        }
    }

    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        Log.m105925i("MicroMsg.MMWebViewClient", "doUpdateVisitedHistory, url = %s, isReload = %b", str, Boolean.valueOf(z));
        super.doUpdateVisitedHistory(webView, str, z);
        String url = webView.getUrl();
        if (this.f120079i) {
            mo68636e0(url, false);
        }
        C45310h hVar = this.f120075e;
        if (hVar != null && !hVar.mo70862e(url)) {
            Log.m105925i("MicroMsg.MMWebViewClient", "doUpdateVisitedHistory start geta8key, url = %s", url);
            mo68636e0(url, false);
        }
    }

    /* renamed from: e0 */
    public void mo68636e0(String str, boolean z) {
        mo69050f0(str, z, 0);
    }

    /* renamed from: f0 */
    public final void mo69050f0(String str, boolean z, int i) {
        if (!this.f120072b.f122358h) {
            if (this.f120075e == null) {
                Log.m105920e("MicroMsg.MMWebViewClient", "startGetA8Key fail, after onDestroy");
            } else if (this.f120079i) {
                Log.m105924i("MicroMsg.MMWebViewClient", "edw startGetA8Key, nevergeta8key");
                this.f120075e.mo70864g(str, (JsapiPermissionWrapper) null, (GeneralControlWrapper) null);
            } else {
                Integer valueOf = Integer.valueOf(this.f120083m.mo69074a(str, this.f120095y));
                boolean z2 = false;
                boolean z3 = this.f120074d != null && valueOf.equals(((HashMap) this.f120081k).get(str));
                if ((this.f120075e.mo70862e(str) || z3) && !z) {
                    Log.m105924i("MicroMsg.MMWebViewClient", "edw startGetA8Key no need, wvPerm already has value, url = " + str);
                    return;
                }
                Log.m105924i("MicroMsg.MMWebViewClient", "edw startGetA8Key, url = " + str + ", scene = " + i + ", username = " + "" + ", reason = " + valueOf + ", force = " + z);
                Log.m105924i("MicroMsg.MMWebViewClient", "edw startGetA8Key, begin, set a default permission");
                ((HashMap) this.f120081k).put(str, valueOf);
                this.f120075e.mo70864g(str, (JsapiPermissionWrapper) null, (GeneralControlWrapper) null);
                this.f120092v = true;
                C44334h hVar = this.f120082l;
                if (hVar.f120156a == 0) {
                    C44307k0 k0Var = C44307k0.this;
                    k0Var.getClass();
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putInt("scene_end_type", 233);
                        bundle.putInt("scene_end_listener_hash_code", k0Var.f120072b.hashCode());
                        k0Var.f120074d.mo68145pG(5, bundle, k0Var.f120072b.hashCode());
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.MMWebViewClient", "addSceneEnd, ex = " + e.getMessage());
                    }
                }
                hVar.f120156a++;
                Bundle bundle2 = new Bundle();
                bundle2.putString("geta8key_data_req_url", str);
                bundle2.putString("geta8key_data_username", "");
                bundle2.putInt("geta8key_data_scene", i);
                bundle2.putInt("geta8key_data_reason", valueOf.intValue());
                bundle2.putInt("geta8key_data_flag", 0);
                bundle2.putString("geta8key_data_net_type", C44625c2.m49074g());
                bundle2.putInt("geta8key_session_id", C12212g.m11775a());
                bundle2.putInt("webview_binder_id", this.f120072b.hashCode());
                bundle2.putString("geta8key_outer_url", "");
                this.f120080j = str;
                this.f120095y = false;
                try {
                    z2 = this.f120074d.mo68108RV(233, bundle2);
                } catch (Exception e2) {
                    Log.m105928w("MicroMsg.MMWebViewClient", "startGetA8Key, ex = " + e2.getMessage());
                }
                Log.m105924i("MicroMsg.MMWebViewClient", "startGetA8Key, doScene ret = " + z2);
            }
        }
    }

    /* renamed from: g0 */
    public boolean mo68637g0(String str) {
        if (this.f120074d != null) {
            return false;
        }
        this.f120085o = str;
        Log.m105924i("MicroMsg.MMWebViewClient", "tryBindService");
        this.f120071a.bindService(new Intent(this.f120071a, WebViewStubService.class), this.f120069A, 1);
        return true;
    }

    /* renamed from: h0 */
    public final void mo69051h0(String str, String str2, JsapiPermissionWrapper jsapiPermissionWrapper, GeneralControlWrapper generalControlWrapper) {
        if (!Util.isNullOrNil(str2)) {
            this.f120075e.mo70864g(str2, jsapiPermissionWrapper, generalControlWrapper);
            ((HashMap) this.f120081k).remove(str2);
            this.f120092v = false;
            this.f120093w = str2;
        }
        if (mo69048b0(str, str2)) {
            this.f120075e.mo70864g(str, jsapiPermissionWrapper, generalControlWrapper);
            ((HashMap) this.f120081k).remove(str);
        } else if (this.f120074d != null && !Util.isNullOrNil(str) && mo68625Q(str2)) {
            this.f120075e.mo70864g(str, jsapiPermissionWrapper, generalControlWrapper);
            ((HashMap) this.f120081k).remove(str);
        }
    }

    public void onLoadResource(WebView webView, String str) {
        Log.m105924i("MicroMsg.MMWebViewClient", "edw onLoadResource opt, url = " + str);
        super.onLoadResource(webView, str);
    }

    public final void onPageFinished(WebView webView, String str) {
        Activity castActivityOrNull;
        boolean z = true;
        Log.m105919d("MicroMsg.MMWebViewClient", "onPageFinished url = %s", str);
        if (this.f120074d != null) {
            if (webView != null && ((castActivityOrNull = AndroidContextUtil.castActivityOrNull(webView.getContext())) == null || !castActivityOrNull.isFinishing())) {
                z = false;
            }
            if (!z) {
                super.onPageFinished(webView, str);
                if (!C43718i1.m47559a(str)) {
                    Log.m105922f("MicroMsg.MMWebViewClient", "onPageFinished, canLoadUrl fail, url = " + str);
                    mo68634a0(str);
                    return;
                }
                this.f120087q = "";
                if (str.equals("file:///android_asset/jsapi/wxjs.js")) {
                    Log.m105924i("MicroMsg.MMWebViewClient", "onPageFinished, js is finished loaded");
                    mo68629V(webView, str);
                    return;
                }
                this.f120073c.postDelayed(this.f120096z, 1000);
                mo68629V(webView, str);
            }
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Log.m105919d("MicroMsg.MMWebViewClient", "onPageStarted url = %s", str);
        if (this.f120074d == null || this.f120091u) {
            this.f120091u = false;
        } else if (!C43718i1.m47559a(str)) {
            Log.m105922f("MicroMsg.MMWebViewClient", "onPageStarted, canLoadUrl fail, url = " + str);
            mo68634a0(str);
        } else if (mo69046O(str)) {
            this.f120087q = str;
        } else {
            this.f120086p = str;
            super.onPageStarted(webView, str, bitmap);
            C48583f1 f1Var = this.f120076f;
            f1Var.getClass();
            Log.m105926v("MicroMsg.JsLoader", "onPageStarted");
            C48590l lVar = f1Var.f129969b;
            if (lVar != null) {
                lVar.mo73262v0(false);
            }
            if (mo68625Q(str)) {
                this.f120072b.evaluateJavascript("javascript:(function(){ window.isWeixinCached=true; })()", (ValueCallback<String>) null);
                C48590l lVar2 = this.f120077g;
                if (lVar2 != null) {
                    lVar2.mo73214K((String) ((HashMap) this.f120089s).get(str), (Map) ((ConcurrentHashMap) this.f120090t).get(str));
                }
            }
            mo68636e0(str, false);
            mo68630W(webView, str, bitmap);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        C115669n.INSTANCE.mo175913w(155, 35, 1);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null || Util.isNullOrNil(webResourceRequest.getUrl().toString())) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        Log.m105925i("MicroMsg.MMWebViewClient", "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", webResourceRequest.getUrl(), webResourceRequest.getMethod(), Boolean.valueOf(webResourceRequest.isForMainFrame()));
        return this.f120084n.mo68026b((String) null, webResourceRequest, false, this.f120074d);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Log.m105924i("MicroMsg.MMWebViewClient", "edw opt, shouldOverride url = " + str);
        if (this.f120074d == null) {
            Log.m105920e("MicroMsg.MMWebViewClient", "Service not ready yet, make sure url loading happens after service connected");
            return true;
        } else if (!C43718i1.m47559a(str)) {
            Log.m105922f("MicroMsg.MMWebViewClient", "shouldOverrideUrlLoading, URL load failed, url = " + str);
            mo68634a0(str);
            return true;
        } else if (str.equals(this.f120087q)) {
            this.f120087q = "";
            return true;
        } else if (((C48455p) C86312j.m106911c(C48455p.class)).mo60667qU(str, mo68623L(), webView)) {
            Log.m105924i("MicroMsg.MMWebViewClient", "use the downloader to download");
            return true;
        } else {
            boolean O = mo69046O(str);
            if (!O && str.startsWith("weixin://")) {
                Log.m105921e("MicroMsg.MMWebViewClient", "shouldOverrideUrlLoading, can not deal with this weixin scheme, stop directly, url = %s", str);
                return true;
            } else if (O) {
                return true;
            } else {
                int a = this.f120083m.mo69074a(str, this.f120095y);
                if ((a != 0 && a != 2) || this.f120079i) {
                    return false;
                }
                Log.m105924i("MicroMsg.MMWebViewClient", "edw shouldOverride, should not continue, reason = " + a);
                boolean z = a == 2 || (!str.equals(this.f120080j) && !this.f120075e.mo70863f(str));
                if (mo68625Q(str)) {
                    this.f120072b.stopLoading();
                    this.f120072b.post(new C44309b(str));
                } else if (z) {
                    this.f120072b.stopLoading();
                }
                if (!z) {
                    Log.m105929w("MicroMsg.MMWebViewClient", "shouldOverride, not trigger getA8key, nowURL[%s] newURL[%s] lastGetA8KeyUrl[%s] reason[%d]", webView.getUrl(), str, this.f120080j, Integer.valueOf(a));
                    return false;
                }
                mo68636e0(str, true);
                return true;
            }
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest, Bundle bundle) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null || Util.isNullOrNil(webResourceRequest.getUrl().toString())) {
            return super.shouldInterceptRequest(webView, webResourceRequest, bundle);
        }
        Log.m105925i("MicroMsg.MMWebViewClient", "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", webResourceRequest.getUrl(), webResourceRequest.getMethod(), Boolean.valueOf(webResourceRequest.isForMainFrame()));
        try {
            int i = bundle.getInt("resourceType");
            if (i == 1 || i == 7) {
                Log.m105925i("MicroMsg.MMWebViewClient", "get resoutce type is iframe : %d, start geta8key", Integer.valueOf(i));
                mo69050f0(webResourceRequest.getUrl().toString(), false, 5);
            }
        } catch (Exception e) {
            Log.m105929w("MicroMsg.MMWebViewClient", "get resource type failed Exception ; %s", e.getMessage());
        } catch (Throwable th) {
            Log.m105929w("MicroMsg.MMWebViewClient", "get resource type failed Throwable ; %s", th.getMessage());
        }
        return this.f120084n.mo68026b((String) null, webResourceRequest, true, this.f120074d);
    }
}
