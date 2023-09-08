package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ApduEngineFuncEvent;
import com.tencent.p014mm.autogen.events.ServiceClickEvent;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.handoff.model.HandOffURL;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.jsapi.exdevice.WebViewExDeviceMgr;
import com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43860c;
import com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C6160a;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.C44209a;
import com.tencent.p014mm.plugin.webview.stub.C43787d;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import d93.C45310h;
import di3.C86312j;
import e00.C45518r0;
import ex0.C45696d;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import lg3.C88494d;
import org.json.JSONArray;
import org.json.JSONObject;
import p645pj.C47506e;
import p749xh.C66261f3;
import qe3.C25549c;
import qo3.C77398g;
import qo3.C77407n;
import t83.C13841a;
import t83.C13851h1;
import t83.C48590l;
import t83.C48593m;
import t83.C48595n;
import t83.C48597o;
import t83.C48599p;
import t83.C48602q0;
import t83.C48603r;
import t83.C48604r0;
import t83.C48605s;
import t83.C48606s0;
import t83.C48609u;
import t93.C48618a;
import tc2.C118418g;
import te3.C64459j13;
import y93.C53513a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1 */
public class C44132q1 extends C6107m.C6108a {

    /* renamed from: e */
    public final WeakReference<WebViewUI> f119554e;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$a */
    public class C44133a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119555d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119556e;

        /* renamed from: f */
        public final /* synthetic */ String f119557f;

        /* renamed from: g */
        public final /* synthetic */ int f119558g;

        public C44133a(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, String str, int i) {
            this.f119555d = webViewUI;
            this.f119556e = lVar;
            this.f119557f = str;
            this.f119558g = i;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119555d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119556e) != null) {
                lVar.mo73217N(this.f119557f, this.f119558g);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$a0 */
    public class C44134a0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119559d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f119560e;

        public C44134a0(C44132q1 q1Var, WebViewUI webViewUI, Bundle bundle) {
            this.f119559d = webViewUI;
            this.f119560e = bundle;
        }

        public void run() {
            WebViewUI webViewUI = this.f119559d;
            if (webViewUI != null && !webViewUI.isFinishing()) {
                ((C44209a) ((C45518r0) C86312j.m106911c(C45518r0.class)).gi0()).mo68873d(2, this.f119560e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$a1 */
    public class C44135a1 implements Runnable {
        public C44135a1() {
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing() && C44132q1.this.f119554e.get().f118533i1 != null && C44132q1.this.f119554e.get().f118533i1.isShowing()) {
                C44132q1.this.f119554e.get().f118533i1.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$b */
    public class C44136b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119562d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119563e;

        /* renamed from: f */
        public final /* synthetic */ String f119564f;

        /* renamed from: g */
        public final /* synthetic */ int f119565g;

        /* renamed from: h */
        public final /* synthetic */ String f119566h;

        /* renamed from: i */
        public final /* synthetic */ int f119567i;

        /* renamed from: j */
        public final /* synthetic */ String f119568j;

        /* renamed from: n */
        public final /* synthetic */ String f119569n;

        /* renamed from: o */
        public final /* synthetic */ String f119570o;

        public C44136b(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, String str, int i, String str2, int i2, String str3, String str4, String str5) {
            this.f119562d = webViewUI;
            this.f119563e = lVar;
            this.f119564f = str;
            this.f119565g = i;
            this.f119566h = str2;
            this.f119567i = i2;
            this.f119568j = str3;
            this.f119569n = str4;
            this.f119570o = str5;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119562d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119563e) != null) {
                String str = this.f119564f;
                int i = this.f119565g;
                String str2 = this.f119566h;
                int i2 = this.f119567i;
                String str3 = this.f119568j;
                String str4 = this.f119569n;
                String str5 = this.f119570o;
                if (!lVar.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "onBackgroundAudioStateChange fail, not ready");
                    return;
                }
                Log.m105925i("MicroMsg.JsApiHandler", "onBackgroundAudioStateChange, state : %s, duration : %d, src:%s, errCode:%d, errMsg:%s, srcId:%s", str, Integer.valueOf(i), str2, Integer.valueOf(i2), str3, str4);
                HashMap hashMap = new HashMap();
                hashMap.put("state", str);
                hashMap.put("duration", Integer.valueOf(i));
                hashMap.put("src", str2);
                hashMap.put("errCode", Integer.valueOf(i2));
                hashMap.put("errMsg", str3);
                hashMap.put("srcId", str4);
                hashMap.put("audioId", str5);
                MMHandlerThread.postToMainThread(new C48605s(lVar, C13851h1.C13852a.m13143c("onBackgroundAudioStateChange", hashMap, lVar.f130011p, lVar.f130012q)));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$b0 */
    public class C44137b0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119571d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f119572e;

        public C44137b0(C44132q1 q1Var, WebViewUI webViewUI, Bundle bundle) {
            this.f119571d = webViewUI;
            this.f119572e = bundle;
        }

        public void run() {
            WebViewUI webViewUI = this.f119571d;
            if (webViewUI != null && !webViewUI.isFinishing()) {
                ((C44209a) ((C45518r0) C86312j.m106911c(C45518r0.class)).gi0()).mo68873d(1, this.f119572e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$b1 */
    public class C44138b1 implements Runnable {
        public C44138b1() {
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing()) {
                C44132q1.this.f119554e.get().f118530h1 = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$c */
    public class C44139c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119574d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119575e;

        /* renamed from: f */
        public final /* synthetic */ String f119576f;

        /* renamed from: g */
        public final /* synthetic */ int f119577g;

        public C44139c(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, String str, int i) {
            this.f119574d = webViewUI;
            this.f119575e = lVar;
            this.f119576f = str;
            this.f119577g = i;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119574d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119575e) != null) {
                lVar.mo73216M(this.f119576f, this.f119577g);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$c0 */
    public class C44140c0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119578d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f119579e;

        public C44140c0(C44132q1 q1Var, WebViewUI webViewUI, Bundle bundle) {
            this.f119578d = webViewUI;
            this.f119579e = bundle;
        }

        public void run() {
            WebViewUI webViewUI = this.f119578d;
            if (webViewUI != null && !webViewUI.isFinishing()) {
                Bundle bundle = this.f119579e;
                int i = -1;
                int i2 = bundle != null ? bundle.getInt("key_image_pos", -1) : -1;
                Bundle bundle2 = this.f119579e;
                if (bundle2 != null) {
                    i = bundle2.getInt("key_webview_id", -1);
                }
                ((C48618a) ((C45518r0) C86312j.m106911c(C45518r0.class)).mo70754Pl()).mo73331a(i, i2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$c1 */
    public class C44141c1 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119580d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119581e;

        /* renamed from: f */
        public final /* synthetic */ C45310h f119582f;

        /* renamed from: g */
        public final /* synthetic */ Bundle f119583g;

        public C44141c1(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, C45310h hVar, Bundle bundle) {
            this.f119580d = webViewUI;
            this.f119581e = lVar;
            this.f119582f = hVar;
            this.f119583g = bundle;
        }

        public void run() {
            C45310h hVar;
            WebViewUI webViewUI = this.f119580d;
            if (webViewUI != null && !webViewUI.isFinishing() && this.f119581e != null && (hVar = this.f119582f) != null && hVar.mo70860c().mo69447f(42)) {
                this.f119581e.mo73207D(this.f119583g, "download_resumed");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$d */
    public class C44142d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119584d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119585e;

        /* renamed from: f */
        public final /* synthetic */ String f119586f;

        /* renamed from: g */
        public final /* synthetic */ int f119587g;

        public C44142d(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, String str, int i) {
            this.f119584d = webViewUI;
            this.f119585e = lVar;
            this.f119586f = str;
            this.f119587g = i;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119584d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119585e) != null) {
                lVar.mo73250o0(this.f119586f, this.f119587g);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$d0 */
    public class C44143d0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f119588d;

        public C44143d0(int i) {
            this.f119588d = i;
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing()) {
                C44132q1.this.f119554e.get().setProgressBarIndeterminateVisibility(false);
                Log.m105919d("MicroMsg.WebViewStubCallbackAIDLStub", "[cpan] set title pb visibility:%d", Integer.valueOf(this.f119588d));
                if (this.f119588d != 0) {
                    C44132q1.this.f119554e.get().f118535j.mo25981a();
                } else if (!C44132q1.this.f119554e.get().f118558r1 && !C44132q1.this.f119554e.get().f118561s1 && !C44132q1.this.f119554e.get().mo63704r9()) {
                    C44132q1.this.f119554e.get().f118535j.mo25983c();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$d1 */
    public class C44144d1 implements DialogInterface.OnClickListener {
        public C44144d1() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C44132q1.this.f119554e.get().f118508Z.mo73260u0(1, dialogInterface == null ? "" : ((C77398g) dialogInterface).mo107527g(), 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$e */
    public class C44145e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119591d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119592e;

        /* renamed from: f */
        public final /* synthetic */ String f119593f;

        /* renamed from: g */
        public final /* synthetic */ int f119594g;

        public C44145e(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, String str, int i) {
            this.f119591d = webViewUI;
            this.f119592e = lVar;
            this.f119593f = str;
            this.f119594g = i;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119591d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119592e) != null) {
                lVar.mo73244l0(this.f119593f, this.f119594g);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$e0 */
    public class C44146e0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f119595d;

        /* renamed from: e */
        public final /* synthetic */ String f119596e;

        /* renamed from: f */
        public final /* synthetic */ Bundle f119597f;

        /* renamed from: g */
        public final /* synthetic */ boolean f119598g;

        public C44146e0(String str, String str2, Bundle bundle, boolean z) {
            this.f119595d = str;
            this.f119596e = str2;
            this.f119597f = bundle;
            this.f119598g = z;
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing()) {
                C44132q1.this.f119554e.get().f118508Z.mo8702g(this.f119595d, this.f119596e, C13841a.m13131a(this.f119597f), this.f119598g);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$e1 */
    public class C44147e1 implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ Bundle f119600d;

        public C44147e1(Bundle bundle) {
            this.f119600d = bundle;
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.WebViewStubCallbackAIDLStub", "WebViewUITipsDialogCancel");
            try {
                this.f119600d.putInt("WebViewShare_BinderID", C44132q1.this.f119554e.get().mo68267Y7());
                C44132q1.this.f119554e.get().f118511a1.mo68114V5(111, this.f119600d);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WebViewStubCallbackAIDLStub", "hide dialog err %s", e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$f */
    public class C44148f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119602d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119603e;

        /* renamed from: f */
        public final /* synthetic */ String f119604f;

        /* renamed from: g */
        public final /* synthetic */ int f119605g;

        public C44148f(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, String str, int i) {
            this.f119602d = webViewUI;
            this.f119603e = lVar;
            this.f119604f = str;
            this.f119605g = i;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119602d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119603e) != null) {
                lVar.mo73242k0(this.f119604f, this.f119605g);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$f0 */
    public class C44149f0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f119606d;

        /* renamed from: e */
        public final /* synthetic */ boolean f119607e;

        public C44149f0(boolean z, boolean z2) {
            this.f119606d = z;
            this.f119607e = z2;
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing()) {
                if (this.f119606d) {
                    if (C44132q1.this.f119554e.get().f118523f != null && !Util.isNullOrNil(C44132q1.this.f119554e.get().f118523f.getUrl())) {
                        C44132q1.this.f119554e.get().f118518d1.put(C44132q1.this.f119554e.get().f118523f.getUrl(), Boolean.FALSE);
                    }
                    C44132q1.this.f119554e.get().mo68225B8(false);
                    return;
                }
                if (C44132q1.this.f119554e.get().f118523f != null && !Util.isNullOrNil(C44132q1.this.f119554e.get().f118523f.getUrl())) {
                    C44132q1.this.f119554e.get().f118518d1.put(C44132q1.this.f119554e.get().f118523f.getUrl(), Boolean.valueOf(this.f119607e));
                }
                C44132q1.this.f119554e.get().mo68225B8(this.f119607e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$f1 */
    public class C44150f1 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f119609d;

        /* renamed from: e */
        public final /* synthetic */ String f119610e;

        public C44150f1(String str, String str2) {
            this.f119609d = str;
            this.f119610e = str2;
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing() && !Util.isNullOrNil(this.f119609d)) {
                if (!Util.isNullOrNil(this.f119610e)) {
                    C44132q1.this.mo68777j().putExtra("view_port_code", this.f119610e);
                }
                C44132q1.this.f119554e.get().mo68248O8(this.f119609d, (Map<String, String>) null, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$g */
    public class C44151g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119612d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119613e;

        /* renamed from: f */
        public final /* synthetic */ Map f119614f;

        public C44151g(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, Map map) {
            this.f119612d = webViewUI;
            this.f119613e = lVar;
            this.f119614f = map;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119612d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119613e) != null) {
                lVar.mo73246m0(this.f119614f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$g0 */
    public class C44152g0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119615d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119616e;

        /* renamed from: f */
        public final /* synthetic */ C45310h f119617f;

        /* renamed from: g */
        public final /* synthetic */ Bundle f119618g;

        public C44152g0(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, C45310h hVar, Bundle bundle) {
            this.f119615d = webViewUI;
            this.f119616e = lVar;
            this.f119617f = hVar;
            this.f119618g = bundle;
        }

        public void run() {
            C45310h hVar;
            WebViewUI webViewUI = this.f119615d;
            if (webViewUI != null && !webViewUI.isFinishing() && this.f119616e != null && (hVar = this.f119617f) != null && hVar.mo70860c().mo69447f(42)) {
                this.f119616e.mo73207D(this.f119618g, "download_removed");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$g1 */
    public class C44153g1 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119619d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119620e;

        /* renamed from: f */
        public final /* synthetic */ C45310h f119621f;

        /* renamed from: g */
        public final /* synthetic */ Bundle f119622g;

        public C44153g1(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, C45310h hVar, Bundle bundle) {
            this.f119619d = webViewUI;
            this.f119620e = lVar;
            this.f119621f = hVar;
            this.f119622g = bundle;
        }

        public void run() {
            C45310h hVar;
            WebViewUI webViewUI = this.f119619d;
            if (webViewUI != null && !webViewUI.isFinishing() && this.f119620e != null && (hVar = this.f119621f) != null && hVar.mo70860c().mo69447f(42)) {
                this.f119620e.mo73207D(this.f119622g, "download_start");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$h */
    public class C44154h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119623d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119624e;

        /* renamed from: f */
        public final /* synthetic */ int f119625f;

        public C44154h(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, int i) {
            this.f119623d = webViewUI;
            this.f119624e = lVar;
            this.f119625f = i;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119623d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119624e) != null) {
                int i = this.f119625f;
                if (!lVar.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "onNfcTouch fail, not ready");
                    return;
                }
                Log.m105925i("MicroMsg.JsApiHandler", "onNfcTouch errCode=%d", Integer.valueOf(i));
                HashMap hashMap = new HashMap();
                hashMap.put("errCode", Integer.valueOf(i));
                MMHandlerThread.postToMainThread(new C48609u(lVar, C13851h1.C13852a.m13143c("onNfcTouch", hashMap, lVar.f130011p, lVar.f130012q)));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$h0 */
    public class C44155h0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f119626d;

        public C44155h0(boolean z) {
            this.f119626d = z;
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing()) {
                C44132q1.this.f119554e.get().mo68288i9(this.f119626d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$h1 */
    public class C44156h1 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119628d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119629e;

        /* renamed from: f */
        public final /* synthetic */ C45310h f119630f;

        /* renamed from: g */
        public final /* synthetic */ String f119631g;

        /* renamed from: h */
        public final /* synthetic */ long f119632h;

        /* renamed from: i */
        public final /* synthetic */ int f119633i;

        /* renamed from: j */
        public final /* synthetic */ float f119634j;

        public C44156h1(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, C45310h hVar, String str, long j, int i, float f) {
            this.f119628d = webViewUI;
            this.f119629e = lVar;
            this.f119630f = hVar;
            this.f119631g = str;
            this.f119632h = j;
            this.f119633i = i;
            this.f119634j = f;
        }

        public void run() {
            C45310h hVar;
            WebViewUI webViewUI = this.f119628d;
            if (webViewUI != null && !webViewUI.isFinishing() && this.f119629e != null && (hVar = this.f119630f) != null && hVar.mo70860c().mo69447f(42)) {
                this.f119629e.mo73206C(this.f119631g, this.f119632h, this.f119633i, this.f119634j);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$i */
    public class C44157i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119635d;

        public C44157i(C44132q1 q1Var, WebViewUI webViewUI) {
            this.f119635d = webViewUI;
        }

        public void run() {
            WebViewUI webViewUI = this.f119635d;
            if (webViewUI != null && !webViewUI.isFinishing()) {
                this.f119635d.setMMSubTitle((int) C0966R.string.lgw);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$i0 */
    public class C44158i0 implements Runnable {
        public C44158i0() {
        }

        public void run() {
            C44132q1.this.f119554e.get().finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$i1 */
    public class C44159i1 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119637d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119638e;

        /* renamed from: f */
        public final /* synthetic */ C45310h f119639f;

        /* renamed from: g */
        public final /* synthetic */ String f119640g;

        /* renamed from: h */
        public final /* synthetic */ int f119641h;

        /* renamed from: i */
        public final /* synthetic */ Boolean f119642i;

        public C44159i1(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, C45310h hVar, String str, int i, Boolean bool) {
            this.f119637d = webViewUI;
            this.f119638e = lVar;
            this.f119639f = hVar;
            this.f119640g = str;
            this.f119641h = i;
            this.f119642i = bool;
        }

        public void run() {
            C45310h hVar;
            WebViewUI webViewUI = this.f119637d;
            if (webViewUI != null && !webViewUI.isFinishing()) {
                C48590l lVar = this.f119638e;
                if (lVar != null && (hVar = this.f119639f) != null) {
                    hVar.mo70860c().getClass();
                    this.f119638e.mo73252p0(this.f119640g, this.f119641h);
                } else if (lVar == null || !this.f119642i.booleanValue()) {
                    Object[] objArr = new Object[2];
                    boolean z = false;
                    objArr[0] = Boolean.valueOf(this.f119638e == null);
                    if (this.f119639f == null) {
                        z = true;
                    }
                    objArr[1] = Boolean.valueOf(z);
                    Log.m105929w("MicroMsg.WebViewStubCallbackAIDLStub", "something null, %s, %s", objArr);
                } else {
                    this.f119638e.mo73252p0(this.f119640g, this.f119641h);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$j */
    public class C44160j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119643d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119644e;

        /* renamed from: f */
        public final /* synthetic */ Map f119645f;

        public C44160j(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, Map map) {
            this.f119643d = webViewUI;
            this.f119644e = lVar;
            this.f119645f = map;
        }

        public void run() {
            WebViewUI webViewUI = this.f119643d;
            if (webViewUI != null && !webViewUI.isFinishing()) {
                this.f119643d.setMMSubTitle((String) null);
                C48590l lVar = this.f119644e;
                if (lVar != null) {
                    lVar.mo73248n0(this.f119645f);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$j0 */
    public class C44161j0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f119646d;

        public C44161j0(int i) {
            this.f119646d = i;
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing()) {
                C44132q1.this.f119554e.get().mo68252P8(this.f119646d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$j1 */
    public class C44162j1 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119648d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119649e;

        /* renamed from: f */
        public final /* synthetic */ String f119650f;

        /* renamed from: g */
        public final /* synthetic */ int f119651g;

        public C44162j1(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, String str, int i) {
            this.f119648d = webViewUI;
            this.f119649e = lVar;
            this.f119650f = str;
            this.f119651g = i;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119648d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119649e) != null) {
                String str = this.f119650f;
                int i = this.f119651g;
                if (!lVar.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "onMediaFileUploadProgress fail, not ready");
                    return;
                }
                Log.m105925i("MicroMsg.JsApiHandler", "onMediaFileUploadProgress, local id : %s, percent : %d", str, Integer.valueOf(i));
                HashMap hashMap = new HashMap();
                hashMap.put(C66261f3.COL_LOCALID, str);
                hashMap.put("percent", Integer.valueOf(i));
                MMHandlerThread.postToMainThread(new C48603r(lVar, C13851h1.C13852a.m13143c("onMediaFileUploadProgress", hashMap, lVar.f130011p, lVar.f130012q)));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$k */
    public class C44163k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119652d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119653e;

        /* renamed from: f */
        public final /* synthetic */ C45310h f119654f;

        /* renamed from: g */
        public final /* synthetic */ Bundle f119655g;

        public C44163k(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, C45310h hVar, Bundle bundle) {
            this.f119652d = webViewUI;
            this.f119653e = lVar;
            this.f119654f = hVar;
            this.f119655g = bundle;
        }

        public void run() {
            C45310h hVar;
            WebViewUI webViewUI = this.f119652d;
            if (webViewUI != null && !webViewUI.isFinishing() && this.f119653e != null && (hVar = this.f119654f) != null && hVar.mo70860c().mo69447f(42)) {
                this.f119653e.mo73207D(this.f119655g, "download_succ");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$k0 */
    public class C44164k0 implements Runnable {
        public C44164k0(String str, int i, int i2) {
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing() && C44132q1.this.f119554e.get().f118523f != null) {
                WebViewLongClickHelper webViewLongClickHelper = C44132q1.this.f119554e.get().f118463G1;
                webViewLongClickHelper.getClass();
                Log.m105924i("MicroMsg.WebViewLongClickHelper", "onGetQRCodeResult");
                MMHandlerThread.postToMainThread(new C43845c1(webViewLongClickHelper));
                webViewLongClickHelper.mo68203q();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$l */
    public class C44165l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119657d;

        public C44165l(C44132q1 q1Var, WebViewUI webViewUI) {
            this.f119657d = webViewUI;
        }

        public void run() {
            WebViewUI webViewUI = this.f119657d;
            if (webViewUI != null && !webViewUI.isFinishing()) {
                this.f119657d.setMMSubTitle((String) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$l0 */
    public class C44166l0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f119658d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f119659e;

        public C44166l0(int i, Bundle bundle) {
            this.f119658d = i;
            this.f119659e = bundle;
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing() && C44132q1.this.f119554e.get().f118523f != null) {
                Log.m105924i("MicroMsg.WebViewStubCallbackAIDLStub", "setMenuItemsVisible, actionCode = " + this.f119658d);
                HashSet hashSet = new HashSet();
                String url = C44132q1.this.f119554e.get().f118523f.getUrl();
                int i = this.f119658d;
                if (i == 3003 || i == 3004) {
                    hashSet.add("menuItem:share:brand");
                    hashSet.add("menuItem:share:appMessage");
                    hashSet.add("menuItem:share:dataMessage");
                    hashSet.add("menuItem:share:timeline");
                    hashSet.add("menuItem:favorite");
                    hashSet.add("menuItem:profile");
                    hashSet.add("menuItem:addContact");
                    hashSet.add("menuItem:copyUrl");
                    hashSet.add("menuItem:openWithSafari");
                    hashSet.add("menuItem:share:email");
                    hashSet.add("menuItem:delete");
                    hashSet.add("menuItem:editTag");
                    hashSet.add("menuItem:readMode");
                    hashSet.add("menuItem:originPage");
                    hashSet.add("menuItem:share:qq");
                    hashSet.add("menuItem:share:weiboApp");
                    hashSet.add("menuItem:share:QZone");
                    hashSet.add("menuItem:share:facebook");
                    hashSet.add("menuItem:share:enterprise");
                    hashSet.add("menuItem:share:wework");
                    hashSet.add("menuItem:share:wework_LOCAL");
                    hashSet.add("menuItem:share:weread");
                    hashSet.add("menuItem:addShortcut");
                    hashSet.add("menuItem:haoKan");
                    hashSet.add("menuItem:cancelHaoKan");
                } else {
                    Bundle bundle = this.f119659e;
                    if (bundle == null) {
                        Log.m105928w("MicroMsg.WebViewStubCallbackAIDLStub", "setMenuItemsVisible data is null.");
                        return;
                    }
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("menu_item_list");
                    if (stringArrayList == null || stringArrayList.size() == 0) {
                        Log.m105928w("MicroMsg.WebViewStubCallbackAIDLStub", "setMenuItemsVisible menuItems is null or nil.");
                        return;
                    }
                    hashSet.addAll(stringArrayList);
                    hashSet.remove("menuItem:exposeArticle");
                    hashSet.remove("menuItem:keepTop");
                    hashSet.remove("menuItem:cancelKeepTop");
                    hashSet.remove("menuItem:profile");
                    hashSet.remove("menuItem:addContact");
                    if (!((C45696d) C86709a0.m107533q(C45696d.class)).B60(url)) {
                        hashSet.remove("menuItem:setFont");
                        hashSet.remove("menuItem:refresh");
                    }
                }
                SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) ((HashMap) C44132q1.this.f119554e.get().f118465H1.f119129b).get(url);
                boolean z = false;
                switch (this.f119658d) {
                    case 3001:
                    case 3003:
                        if (sparseBooleanArray == null) {
                            sparseBooleanArray = new SparseBooleanArray();
                            ((HashMap) C44132q1.this.f119554e.get().f118465H1.f119129b).put(url, sparseBooleanArray);
                            C44132q1.this.f119554e.get().f118465H1.mo68569C(url, C44132q1.this.mo68777j());
                        }
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            int nullAs = Util.nullAs((Integer) ((HashMap) C44132q1.this.f119554e.get().f118465H1.f119130c).get(it.next()), -1);
                            if (nullAs >= 0) {
                                sparseBooleanArray.put(nullAs, true);
                            }
                        }
                        C43977g1 g1Var = C44132q1.this.f119554e.get().f118465H1;
                        C77407n nVar = g1Var.f119144q;
                        if (nVar != null) {
                            z = nVar.mo107563h();
                        }
                        if (z) {
                            g1Var.mo68575I();
                            return;
                        }
                        return;
                    case 3002:
                    case 3004:
                        if (sparseBooleanArray != null) {
                            Iterator it4 = hashSet.iterator();
                            while (it4.hasNext()) {
                                int nullAs2 = Util.nullAs((Integer) ((HashMap) C44132q1.this.f119554e.get().f118465H1.f119130c).get(it4.next()), -1);
                                if (nullAs2 >= 0) {
                                    sparseBooleanArray.delete(nullAs2);
                                }
                            }
                            C43977g1 g1Var2 = C44132q1.this.f119554e.get().f118465H1;
                            C77407n nVar2 = g1Var2.f119144q;
                            if (nVar2 != null) {
                                z = nVar2.mo107563h();
                            }
                            if (z) {
                                g1Var2.mo68575I();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$m */
    public class C44167m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119661d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f119662e;

        /* renamed from: f */
        public final /* synthetic */ C45310h f119663f;

        /* renamed from: g */
        public final /* synthetic */ C48590l f119664g;

        public C44167m(C44132q1 q1Var, WebViewUI webViewUI, Bundle bundle, C45310h hVar, C48590l lVar) {
            this.f119661d = webViewUI;
            this.f119662e = bundle;
            this.f119663f = hVar;
            this.f119664g = lVar;
        }

        public void run() {
            C45310h hVar;
            WebViewUI webViewUI = this.f119661d;
            if (webViewUI != null && !webViewUI.isFinishing()) {
                if (!this.f119662e.containsKey("jsapi_preverify_fun_list") || (hVar = this.f119663f) == null) {
                    boolean z = true;
                    Object[] objArr = new Object[1];
                    if (this.f119663f == null) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    Log.m105921e("MicroMsg.WebViewStubCallbackAIDLStub", "has JSAPI_CONTROL_BYTES wvPerm %b", objArr);
                } else {
                    hVar.mo70866i(this.f119662e);
                }
                C48590l lVar = this.f119664g;
                if (lVar != null) {
                    lVar.mo8700d();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$m0 */
    public class C44168m0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f119665d;

        public C44168m0(String str) {
            this.f119665d = str;
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing()) {
                if (!Util.isNullOrNil(C44132q1.this.f119554e.get().f118523f.getUrl())) {
                    Log.m105924i("MicroMsg.WebViewStubCallbackAIDLStub", "setPageOwner, userName = " + this.f119665d);
                    C44132q1.this.f119554e.get().f118521e1.put(C44132q1.this.f119554e.get().f118523f.getUrl(), this.f119665d);
                    return;
                }
                Log.m105924i("MicroMsg.WebViewStubCallbackAIDLStub", "setPageOwner, null url");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$n */
    public class C44169n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119667d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119668e;

        /* renamed from: f */
        public final /* synthetic */ String f119669f;

        /* renamed from: g */
        public final /* synthetic */ byte[] f119670g;

        /* renamed from: h */
        public final /* synthetic */ boolean f119671h;

        /* renamed from: i */
        public final /* synthetic */ boolean f119672i;

        /* renamed from: j */
        public final /* synthetic */ C45310h f119673j;

        public C44169n(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, String str, byte[] bArr, boolean z, boolean z2, C45310h hVar) {
            this.f119667d = webViewUI;
            this.f119668e = lVar;
            this.f119669f = str;
            this.f119670g = bArr;
            this.f119671h = z;
            this.f119672i = z2;
            this.f119673j = hVar;
        }

        public void run() {
            WebViewUI webViewUI = this.f119667d;
            if (webViewUI != null && !webViewUI.isFinishing()) {
                C48590l lVar = this.f119668e;
                if (lVar != null) {
                    String str = this.f119669f;
                    byte[] bArr = this.f119670g;
                    boolean z = this.f119671h;
                    boolean z2 = this.f119672i;
                    if (!lVar.f130003h) {
                        Log.m105920e("MicroMsg.JsApiHandler", "onScanWXDeviceResult fail, not ready");
                        return;
                    }
                    Object[] objArr = new Object[3];
                    objArr[0] = str;
                    objArr[1] = Boolean.valueOf(z);
                    objArr[2] = Integer.valueOf(bArr == null ? 0 : bArr.length);
                    Log.m105925i("MicroMsg.JsApiHandler", "onScanWXDeviceResult: device id = %s, isCompleted = %s, %s", objArr);
                    if (Util.isNullOrNil(str)) {
                        Log.m105920e("MicroMsg.JsApiHandler", "parameter error!!!");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONArray jSONArray = new JSONArray();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("deviceId", str);
                        WebViewExDeviceMgr.m5585d().getClass();
                        if ((bArr != null && bArr.length >= 9 && bArr[bArr.length + -7] == 1 && bArr[bArr.length + -8] == 1 && bArr[bArr.length - 9] == -2) || (bArr != null && z2)) {
                            jSONObject2.put("base64BroadcastData", Base64.encodeToString(bArr, 2));
                        }
                        jSONArray.put(jSONObject2);
                        jSONObject.put("devices", jSONArray);
                        if (z) {
                            jSONObject.put("isCompleted", "1");
                        } else {
                            jSONObject.put("isCompleted", "0");
                        }
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.JsApiHandler", "Ex in onScanWXDeviceResult, %s", e.getMessage());
                    }
                    String d = C13851h1.C13852a.m13144d("onScanWXDeviceResult", jSONObject, lVar.f130011p, lVar.f130012q);
                    try {
                        Log.m105925i("MicroMsg.JsApiHandler", "hakon onScanWXDeviceResult, %s", d);
                        MMWebView mMWebView = lVar.f129996a;
                        mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + d + ")", (ValueCallback<String>) null);
                    } catch (Exception e2) {
                        Log.m105929w("MicroMsg.JsApiHandler", "onScanWXDeviceResult, %s", e2.getMessage());
                    }
                    if (!z2) {
                        WebViewExDeviceMgr.m5585d().getClass();
                        return;
                    }
                    return;
                }
                Log.m105921e("MicroMsg.WebViewStubCallbackAIDLStub", "hakon can not call onScanWXDeviceResult, %s, %s", lVar, this.f119673j);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$n0 */
    public class C44170n0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bundle f119674d;

        /* renamed from: e */
        public final /* synthetic */ ApduEngineFuncEvent f119675e;

        public C44170n0(C44132q1 q1Var, Bundle bundle, ApduEngineFuncEvent apduEngineFuncEvent) {
            this.f119674d = bundle;
            this.f119675e = apduEngineFuncEvent;
        }

        public void run() {
            this.f119674d.putAll(this.f119675e.f107357e.f107363a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$o */
    public class C44171o implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119676d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119677e;

        /* renamed from: f */
        public final /* synthetic */ String f119678f;

        /* renamed from: g */
        public final /* synthetic */ byte[] f119679g;

        /* renamed from: h */
        public final /* synthetic */ String f119680h;

        public C44171o(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, String str, byte[] bArr, String str2) {
            this.f119676d = webViewUI;
            this.f119677e = lVar;
            this.f119678f = str;
            this.f119679g = bArr;
            this.f119680h = str2;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119676d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119677e) != null) {
                String str = this.f119678f;
                byte[] bArr = this.f119679g;
                String str2 = this.f119680h;
                if (!lVar.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "onReceiveDataFromWXDevice fail, not ready");
                    return;
                }
                Log.m105925i("MicroMsg.JsApiHandler", "onReceiveDataFromWXDevice: device id = %s, brandName = %s", str, str2);
                if (Util.isNullOrNil(str) || Util.isNullOrNil(str2) || bArr == null) {
                    Log.m105920e("MicroMsg.JsApiHandler", "parameter error!!!");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("deviceId", str);
                hashMap.put("base64Data", Base64.encodeToString(bArr, 2));
                MMHandlerThread.postToMainThread(new C48593m(lVar, C13851h1.C13852a.m13143c("onReceiveDataFromWXDevice", hashMap, lVar.f130011p, lVar.f130012q)));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$o0 */
    public class C44172o0 implements Runnable {
        public C44172o0() {
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing()) {
                C44132q1.this.f119554e.get().f118531h2.mo68760e(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$p */
    public class C44173p implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119682d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119683e;

        /* renamed from: f */
        public final /* synthetic */ String f119684f;

        /* renamed from: g */
        public final /* synthetic */ boolean f119685g;

        public C44173p(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, String str, boolean z) {
            this.f119682d = webViewUI;
            this.f119683e = lVar;
            this.f119684f = str;
            this.f119685g = z;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119682d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119683e) != null) {
                String str = this.f119684f;
                boolean z = this.f119685g;
                if (!lVar.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "onWXDeviceBindStateChange fail, not ready");
                    return;
                }
                Log.m105925i("MicroMsg.JsApiHandler", "onWXDeviceBindStateChange: device id = %s, isBound = %s", str, Boolean.valueOf(z));
                if (Util.isNullOrNil(str)) {
                    Log.m105920e("MicroMsg.JsApiHandler", "parameter error!!!");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("deviceId", str);
                if (z) {
                    hashMap.put("state", "bind");
                } else {
                    hashMap.put("state", "unbind");
                }
                MMHandlerThread.postToMainThread(new C48595n(lVar, C13851h1.C13852a.m13143c("onWXDeviceBindStateChange", hashMap, lVar.f130011p, lVar.f130012q)));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$p0 */
    public class C44174p0 implements Runnable {
        public C44174p0() {
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing()) {
                WebViewUI webViewUI = C44132q1.this.f119554e.get();
                C44125o1 o1Var = webViewUI.f118531h2;
                o1Var.f119525a = new C44205v1(webViewUI);
                o1Var.f119529e = true;
                LogoWebViewWrapper logoWebViewWrapper = o1Var.f119527c;
                if (logoWebViewWrapper != null) {
                    logoWebViewWrapper.setVisibility(0);
                    o1Var.f119527c.setMMOverScrollOffsetListener(o1Var);
                    o1Var.f119527c.setFastScrollBack(true);
                    LogoWebViewWrapper logoWebViewWrapper2 = o1Var.f119527c;
                    logoWebViewWrapper2.f118324p = false;
                    logoWebViewWrapper2.setReleaseTargetHeight(o1Var.f119528d);
                }
                ImageView imageView = o1Var.f119526b;
                if (imageView != null) {
                    imageView.setWillNotDraw(true);
                    o1Var.f119526b.setImageResource(C0966R.C0969drawable.cfk);
                    o1Var.f119526b.setVisibility(0);
                    o1Var.f119526b.setAlpha(0.0f);
                    o1Var.f119526b.setWillNotDraw(false);
                    o1Var.f119526b.invalidate();
                }
                o1Var.mo68757b();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$q */
    public class C44175q implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119687d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119688e;

        /* renamed from: f */
        public final /* synthetic */ boolean f119689f;

        public C44175q(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, boolean z) {
            this.f119687d = webViewUI;
            this.f119688e = lVar;
            this.f119689f = z;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119687d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119688e) != null) {
                boolean z = this.f119689f;
                if (!lVar.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "onWXDeviceBTStateChange fail, not ready");
                    return;
                }
                Log.m105925i("MicroMsg.JsApiHandler", "onWXDeviceBTStateChange: state = %s", Boolean.valueOf(z));
                HashMap hashMap = new HashMap();
                if (z) {
                    hashMap.put("state", "on");
                } else {
                    hashMap.put("state", "off");
                }
                MMHandlerThread.postToMainThread(new C48597o(lVar, C13851h1.C13852a.m13143c("onWXDeviceBluetoothStateChange", hashMap, lVar.f130011p, lVar.f130012q)));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$q0 */
    public class C44176q0 implements Runnable {
        public C44176q0() {
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing()) {
                C44132q1.this.f119554e.get().f118531h2.mo68766j();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$r */
    public class C44177r implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119691d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119692e;

        /* renamed from: f */
        public final /* synthetic */ boolean f119693f;

        public C44177r(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, boolean z) {
            this.f119691d = webViewUI;
            this.f119692e = lVar;
            this.f119693f = z;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119691d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119692e) != null) {
                boolean z = this.f119693f;
                if (!lVar.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "onWXDeviceLanStateChange fail, not ready");
                    return;
                }
                Log.m105925i("MicroMsg.JsApiHandler", "onWXDeviceLanStateChange: state = %s", Boolean.valueOf(z));
                HashMap hashMap = new HashMap();
                if (z) {
                    hashMap.put("state", "on");
                } else {
                    hashMap.put("state", "off");
                }
                MMHandlerThread.postToMainThread(new C48599p(lVar, C13851h1.C13852a.m13143c("onWXDeviceLanStateChange", hashMap, lVar.f130011p, lVar.f130012q)));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$r0 */
    public class C44178r0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119694d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119695e;

        /* renamed from: f */
        public final /* synthetic */ C45310h f119696f;

        /* renamed from: g */
        public final /* synthetic */ Bundle f119697g;

        public C44178r0(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, C45310h hVar, Bundle bundle) {
            this.f119694d = webViewUI;
            this.f119695e = lVar;
            this.f119696f = hVar;
            this.f119697g = bundle;
        }

        public void run() {
            C45310h hVar;
            WebViewUI webViewUI = this.f119694d;
            if (webViewUI != null && !webViewUI.isFinishing() && this.f119695e != null && (hVar = this.f119696f) != null && hVar.mo70860c().mo69447f(42)) {
                this.f119695e.mo73207D(this.f119697g, "download_pause");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$s */
    public class C44179s implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119698d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119699e;

        /* renamed from: f */
        public final /* synthetic */ JSONArray f119700f;

        public C44179s(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, JSONArray jSONArray) {
            this.f119698d = webViewUI;
            this.f119699e = lVar;
            this.f119700f = jSONArray;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119698d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119699e) != null) {
                JSONArray jSONArray = this.f119700f;
                if (!lVar.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "not ready");
                } else if (jSONArray == null) {
                    Log.m105920e("MicroMsg.JsApiHandler", "onGetMsgProofItems fail, not ready");
                } else {
                    Log.m105924i("MicroMsg.JsApiHandler", "onGetMsgProofItems success, ready");
                    HashMap hashMap = new HashMap();
                    hashMap.put("msgs", jSONArray);
                    MMHandlerThread.postToMainThread(new C48602q0(lVar, C13851h1.C13852a.m13143c("onGetMsgProofItems", hashMap, lVar.f130011p, lVar.f130012q)));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$s0 */
    public class C44180s0 implements Runnable {
        public C44180s0() {
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing()) {
                C44132q1.this.f119554e.get().f118531h2.mo68756a();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$t */
    public class C44181t implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119702d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119703e;

        /* renamed from: f */
        public final /* synthetic */ String f119704f;

        public C44181t(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, String str) {
            this.f119702d = webViewUI;
            this.f119703e = lVar;
            this.f119704f = str;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119702d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119703e) != null) {
                lVar.mo73225V(this.f119704f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$t0 */
    public class C44182t0 implements Runnable {
        public C44182t0() {
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing()) {
                C44132q1.this.f119554e.get().f118531h2.mo68765i();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$u */
    public class C44183u implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119706d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f119707e;

        public C44183u(C44132q1 q1Var, WebViewUI webViewUI, Bundle bundle) {
            this.f119706d = webViewUI;
            this.f119707e = bundle;
        }

        public void run() {
            Bundle bundle;
            C53513a aVar;
            Bundle bundle2;
            Bundle bundle3;
            WebViewUI webViewUI = this.f119706d;
            if (webViewUI != null && !webViewUI.isFinishing() && (bundle = this.f119707e) != null) {
                String string = bundle.getString("key_bag_icon");
                if (!Util.isNullOrNil(string)) {
                    HandOffURL handOffURL = this.f119706d.f118475M1;
                    if (handOffURL != null) {
                        handOffURL.setIcon(Util.nullAsNil(string));
                    }
                    C53513a aVar2 = this.f119706d.f118483Q1;
                    if (aVar2 != null) {
                        aVar2.mo160076N(string);
                    }
                    this.f119706d.f118480P1.mo149076p0(string);
                }
                String string2 = this.f119707e.getString("key_brand_name");
                String string3 = this.f119707e.getString("key_brand_user_name");
                String string4 = this.f119707e.getString("key_title");
                if (!Util.isNullOrNil(string3)) {
                    this.f119706d.getIntent().putExtra("srcUsername", string3);
                }
                Log.m105925i("FloatBall", "currentMpInfo, brandName:%s, title:%s", string2, string4);
                WebViewUIStyleHelper webViewUIStyleHelper = this.f119706d.f118477N1;
                if (!(webViewUIStyleHelper == null || (bundle3 = this.f119707e) == null)) {
                    String string5 = bundle3.getString("key_url");
                    if (Util.isNullOrNil(string5)) {
                        Log.m105928w("MicroMsg.WebViewUIStyleHelper", "updateCurrentInfo url is null");
                    } else {
                        Log.m105919d("MicroMsg.WebViewUIStyleHelper", "updateCurrentInfo url %s", string5);
                        String e = webViewUIStyleHelper.mo68373e(string5);
                        Bundle bundle4 = (Bundle) ((HashMap) WebViewUIStyleHelper.f118663r).get(e);
                        if (bundle4 == null) {
                            ((HashMap) WebViewUIStyleHelper.f118663r).put(e, bundle3);
                        } else {
                            bundle3.putBoolean("key_current_info_show", bundle4.getBoolean("key_current_info_show"));
                            ((HashMap) WebViewUIStyleHelper.f118663r).put(e, bundle3);
                        }
                        if (!bundle3.getBoolean("key_show_live_top_bar", true) || !webViewUIStyleHelper.mo68378j() || !((C45696d) C86709a0.m107533q(C45696d.class)).mo70989eQ(string5)) {
                            webViewUIStyleHelper.mo68381m();
                        } else {
                            if (webViewUIStyleHelper.mo68376h(bundle3)) {
                                webViewUIStyleHelper.mo68382o();
                            }
                            webViewUIStyleHelper.mo68383p(bundle3.getString("key_brand_user_name"));
                        }
                    }
                }
                WebViewLongClickHelper webViewLongClickHelper = this.f119706d.f118463G1;
                if (!(webViewLongClickHelper == null || (bundle2 = this.f119707e) == null)) {
                    ((HashMap) WebViewLongClickHelper.f118388r).put(webViewLongClickHelper.mo68195i(webViewLongClickHelper.f118400i), Boolean.valueOf(bundle2.getBoolean("key_forbidForward")));
                }
                if (Util.isNullOrNil(string4) && this.f119706d.getMMTitle() != null) {
                    string4 = this.f119706d.getMMTitle().toString();
                }
                C64459j13 j132 = null;
                if (!Util.isNullOrNil(string4)) {
                    C53513a aVar3 = this.f119706d.f118483Q1;
                    if (aVar3 != null) {
                        aVar3.mo160077O(string4);
                    }
                    this.f119706d.f118480P1.mo67998q0(string4);
                    HandOffURL handOffURL2 = this.f119706d.f118475M1;
                    if (handOffURL2 != null) {
                        handOffURL2.setTitle(string4);
                    }
                } else {
                    BallInfo ballInfo = this.f119706d.f118480P1.f311726d;
                    if (Util.isNullOrNil(ballInfo != null ? ballInfo.f311699t : null)) {
                        this.f119706d.f118480P1.mo67998q0(string2);
                    }
                    if (Util.isNullOrNil(this.f119706d.f118483Q1.f150468z.f135054h)) {
                        this.f119706d.f118483Q1.mo160077O(string2);
                    }
                    HandOffURL handOffURL3 = this.f119706d.f118475M1;
                    if (handOffURL3 != null && Util.isNullOrNil(handOffURL3.getTitle()) && !Util.isNullOrNil(string2)) {
                        this.f119706d.f118475M1.setTitle(string2);
                    }
                }
                if (!Util.isNullOrNil(string2) && (aVar = this.f119706d.f118483Q1) != null) {
                    MultiTaskInfo multiTaskInfo = aVar.f326418a;
                    if (multiTaskInfo != null) {
                        j132 = multiTaskInfo.mo80305m2();
                    }
                    if (j132 != null) {
                        j132.f183751d = string2;
                    }
                    aVar.mo160074L();
                }
                if (this.f119706d.f118475M1 != null) {
                    ((C92331c) C86312j.m106911c(C92331c.class)).Gg0(this.f119706d.f118475M1);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$u0 */
    public class C44184u0 implements Runnable {
        public C44184u0() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
            r0 = r3.f119708d.f119554e.get();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                com.tencent.mm.plugin.webview.ui.tools.q1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C44132q1.this
                java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r0.f119554e
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L_0x0033
                com.tencent.mm.plugin.webview.ui.tools.q1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C44132q1.this
                java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r0.f119554e
                java.lang.Object r0 = r0.get()
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
                boolean r0 = r0.isFinishing()
                if (r0 == 0) goto L_0x001b
                goto L_0x0033
            L_0x001b:
                com.tencent.mm.plugin.webview.ui.tools.q1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C44132q1.this
                java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r0.f119554e
                java.lang.Object r0 = r0.get()
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
                com.tencent.mm.ui.widget.MMWebView r1 = r0.f118523f
                if (r1 == 0) goto L_0x0033
                com.tencent.mm.plugin.webview.ui.tools.w1 r2 = new com.tencent.mm.plugin.webview.ui.tools.w1
                r2.<init>(r0)
                java.lang.String r0 = "javascript:(function(){return window.getComputedStyle(document.body,null).backgroundColor})()"
                r1.evaluateJavascript(r0, r2)
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.C44132q1.C44184u0.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$v */
    public class C44185v implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119709d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119710e;

        /* renamed from: f */
        public final /* synthetic */ C45310h f119711f;

        /* renamed from: g */
        public final /* synthetic */ Bundle f119712g;

        public C44185v(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, C45310h hVar, Bundle bundle) {
            this.f119709d = webViewUI;
            this.f119710e = lVar;
            this.f119711f = hVar;
            this.f119712g = bundle;
        }

        public void run() {
            C45310h hVar;
            WebViewUI webViewUI = this.f119709d;
            if (webViewUI != null && !webViewUI.isFinishing() && this.f119710e != null && (hVar = this.f119711f) != null && hVar.mo70860c().mo69447f(42)) {
                this.f119710e.mo73207D(this.f119712g, "download_fail");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$v0 */
    public class C44186v0 implements MenuItem.OnMenuItemClickListener {
        public C44186v0() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105919d("MicroMsg.WebViewStubCallbackAIDLStub", "click item: %s", Integer.valueOf(menuItem.getItemId()));
            C44132q1.this.f119554e.get().f118508Z.mo73224U();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$w */
    public class C44187w implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119714d;

        public C44187w(C44132q1 q1Var, WebViewUI webViewUI) {
            this.f119714d = webViewUI;
        }

        public void run() {
            MMWebView mMWebView;
            WebViewUI webViewUI = this.f119714d;
            if (webViewUI != null && !webViewUI.isFinishing() && (mMWebView = this.f119714d.f118523f) != null) {
                C118418g.INSTANCE.mo175786As(mMWebView, ServiceClickEvent.class);
                if (this.f119714d.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).getBoolean("forceTrigger", false)) {
                    Log.m105924i("MicroMsg.WebViewStubCallbackAIDLStub", "on service click, test");
                    new ServiceClickEvent().publish();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$w0 */
    public class C44188w0 implements MenuItem.OnMenuItemClickListener {
        public C44188w0() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105919d("MicroMsg.WebViewStubCallbackAIDLStub", "click item: %s", Integer.valueOf(menuItem.getItemId()));
            C44132q1.this.f119554e.get().f118508Z.mo73224U();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$x */
    public class C44189x implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119716d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119717e;

        /* renamed from: f */
        public final /* synthetic */ String f119718f;

        /* renamed from: g */
        public final /* synthetic */ int f119719g;

        public C44189x(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, String str, int i) {
            this.f119716d = webViewUI;
            this.f119717e = lVar;
            this.f119718f = str;
            this.f119719g = i;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119716d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119717e) != null) {
                String str = this.f119718f;
                int i = this.f119719g;
                if (!lVar.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "not ready");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("postId", str);
                hashMap.put("result", Integer.valueOf(i));
                MMHandlerThread.postToMainThread(new C48604r0(lVar, C13851h1.C13852a.m13143c("onPublishHaowanEnd", hashMap, lVar.f130011p, lVar.f130012q)));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$x0 */
    public class C44190x0 implements MenuItem.OnMenuItemClickListener {
        public C44190x0() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105919d("MicroMsg.WebViewStubCallbackAIDLStub", "click item: %s", Integer.valueOf(menuItem.getItemId()));
            C44132q1.this.f119554e.get().f118508Z.mo73224U();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$y */
    public class C44191y implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119721d;

        /* renamed from: e */
        public final /* synthetic */ C48590l f119722e;

        /* renamed from: f */
        public final /* synthetic */ String f119723f;

        /* renamed from: g */
        public final /* synthetic */ float f119724g;

        public C44191y(C44132q1 q1Var, WebViewUI webViewUI, C48590l lVar, String str, float f) {
            this.f119721d = webViewUI;
            this.f119722e = lVar;
            this.f119723f = str;
            this.f119724g = f;
        }

        public void run() {
            C48590l lVar;
            WebViewUI webViewUI = this.f119721d;
            if (webViewUI != null && !webViewUI.isFinishing() && (lVar = this.f119722e) != null) {
                String str = this.f119723f;
                float f = this.f119724g;
                if (!lVar.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "not ready");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("postId", str);
                hashMap.put("percent", Float.valueOf(f));
                MMHandlerThread.postToMainThread(new C48606s0(lVar, C13851h1.C13852a.m13143c("onPublishHaowanProgress", hashMap, lVar.f130011p, lVar.f130012q)));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$y0 */
    public class C44192y0 implements MenuItem.OnMenuItemClickListener {
        public C44192y0() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105919d("MicroMsg.WebViewStubCallbackAIDLStub", "click item: %s", Integer.valueOf(menuItem.getItemId()));
            C44132q1.this.f119554e.get().f118508Z.mo73224U();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$z */
    public class C44193z implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WebViewUI f119726d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f119727e;

        public C44193z(C44132q1 q1Var, WebViewUI webViewUI, Bundle bundle) {
            this.f119726d = webViewUI;
            this.f119727e = bundle;
        }

        public void run() {
            WebViewUI webViewUI = this.f119726d;
            if (webViewUI != null && !webViewUI.isFinishing()) {
                ((C44209a) ((C45518r0) C86312j.m106911c(C45518r0.class)).gi0()).mo68872c(this.f119727e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.q1$z0 */
    public class C44194z0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bundle f119728d;

        public C44194z0(Bundle bundle) {
            this.f119728d = bundle;
        }

        public void run() {
            if (C44132q1.this.f119554e.get() != null && !C44132q1.this.f119554e.get().isFinishing()) {
                boolean z = this.f119728d.getBoolean("enable_fullscreen_params_enable", false);
                if (C44132q1.this.mo68777j() != null) {
                    C44132q1.this.mo68777j().removeExtra("show_full_screen");
                }
                C44132q1.this.f119554e.get().mo68278e9(z, false);
            }
        }
    }

    public C44132q1(WebViewUI webViewUI) {
        this.f119554e = new WeakReference<>(webViewUI);
    }

    /* renamed from: B7 */
    public void mo7025B7(String str) {
        if (this.f119554e.get() != null && !this.f119554e.get().isFinishing()) {
            int i = 0;
            try {
                i = Util.getInt(str, 0);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WebViewStubCallbackAIDLStub", "setFontSizeCb, ex = " + e.getMessage());
            }
            if (this.f119554e.get().f118523f == null) {
                Log.m105920e("MicroMsg.WebViewStubCallbackAIDLStub", "setFontSizeCb fail, viewWV is null");
            } else {
                MMHandlerThread.postToMainThread(new C44161j0(i));
            }
        }
    }

    public void Ef0() {
        LinkedList<C13851h1> linkedList;
        if (this.f119554e.get() != null && !this.f119554e.get().isFinishing() && this.f119554e.get().f118508Z != null && (linkedList = this.f119554e.get().f118508Z.f130000e) != null) {
            linkedList.clear();
        }
    }

    /* renamed from: F7 */
    public int mo7027F7() {
        C43522y yVar = this.f119554e.get() != null ? this.f119554e.get().f118513b1 : null;
        if (yVar != null) {
            return yVar.mo67698U().f122685b;
        }
        Log.m105920e("MicroMsg.WebViewStubCallbackAIDLStub", "GetA8keyScene, controller is nil");
        return 0;
    }

    /* renamed from: Gb */
    public void mo7028Gb(String str, String str2) {
        MMHandlerThread.postToMainThread(new C44168m0(str));
    }

    /* renamed from: Ni */
    public String mo7029Ni() {
        if (this.f119554e.get() == null || this.f119554e.get().isFinishing()) {
            return null;
        }
        return this.f119554e.get().mo6901n0();
    }

    /* renamed from: US */
    public void mo7030US(String str, String str2, int i, int i2) {
        if (this.f119554e.get() != null && !this.f119554e.get().isFinishing()) {
            Log.m105918d("MicroMsg.WebViewStubCallbackAIDLStub", "result: " + str2);
            if (this.f119554e.get().f118463G1.f118396e != null && str != null && str.equals(this.f119554e.get().f118463G1.f118396e.f123310c)) {
                if (this.f119554e.get().f118463G1.f118396e != null) {
                    this.f119554e.get().f118463G1.f118396e.mo71114b();
                }
                if (str2 != null && this.f119554e.get().f118463G1 != null) {
                    MMHandlerThread.postToMainThread(new C44164k0(str2, i, i2));
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x10de  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x10e9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0161  */
    /* renamed from: V5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle mo7031V5(int r30, android.os.Bundle r31) {
        /*
            r29 = this;
            r1 = r29
            r0 = r30
            r2 = r31
            java.lang.Class<ex0.d> r3 = ex0.C45696d.class
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "invokeAsResult, actionCode = "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.WebViewStubCallbackAIDLStub"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r6 = r1.f119554e
            java.lang.Object r6 = r6.get()
            if (r6 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r6 = r1.f119554e
            java.lang.Object r6 = r6.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r6 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r6
            boolean r6 = r6.isFinishing()
            if (r6 == 0) goto L_0x003b
            goto L_0x1610
        L_0x003b:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r6 = r1.f119554e
            java.lang.Object r6 = r6.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r6 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r6
            d93.h r6 = r6.f118491T0
            r7 = 11
            if (r0 == r7) goto L_0x1608
            r7 = 12
            if (r0 == r7) goto L_0x15ff
            r7 = 53
            if (r0 == r7) goto L_0x15d9
            r7 = 54
            if (r0 == r7) goto L_0x15b9
            r7 = 252(0xfc, float:3.53E-43)
            if (r0 == r7) goto L_0x15a3
            r7 = 253(0xfd, float:3.55E-43)
            if (r0 == r7) goto L_0x158d
            java.lang.String r7 = "url"
            java.lang.String r8 = "KAppId"
            java.lang.String r9 = "webview_current_url"
            java.lang.String r10 = "webview_video_proxy_play_data_id"
            java.lang.String r11 = "KPublisherId"
            java.lang.String r12 = "scene"
            java.lang.String r13 = "geta8key_scene"
            java.lang.String r14 = "geta8key_username"
            r15 = 258(0x102, float:3.62E-43)
            if (r0 == r15) goto L_0x155c
            r15 = 259(0x103, float:3.63E-43)
            if (r0 == r15) goto L_0x1533
            java.lang.String r15 = "raw_url"
            r16 = r15
            java.lang.String r15 = ""
            r18 = r10
            switch(r0) {
                case 18: goto L_0x1439;
                case 22: goto L_0x1412;
                case 25: goto L_0x13ed;
                case 77: goto L_0x139c;
                case 79: goto L_0x1371;
                case 81: goto L_0x1360;
                case 95: goto L_0x1353;
                case 97: goto L_0x1349;
                case 99: goto L_0x1331;
                case 101: goto L_0x12eb;
                case 107: goto L_0x12bb;
                case 140: goto L_0x1297;
                case 150: goto L_0x1246;
                case 1009: goto L_0x11a0;
                case 1020: goto L_0x1115;
                case 4008: goto L_0x10c1;
                case 6001: goto L_0x108e;
                case 100000: goto L_0x1081;
                default: goto L_0x0083;
            }
        L_0x0083:
            switch(r0) {
                case 33: goto L_0x1067;
                case 34: goto L_0x105a;
                case 35: goto L_0x1050;
                case 36: goto L_0x1046;
                case 37: goto L_0x0f73;
                case 38: goto L_0x0f5a;
                case 39: goto L_0x0f50;
                default: goto L_0x0086;
            }
        L_0x0086:
            switch(r0) {
                case 299: goto L_0x0f3e;
                case 300: goto L_0x0ef4;
                case 301: goto L_0x0ec6;
                case 302: goto L_0x0eb2;
                case 303: goto L_0x0e45;
                case 304: goto L_0x0e1f;
                case 305: goto L_0x0e02;
                default: goto L_0x0089;
            }
        L_0x0089:
            switch(r0) {
                case 4001: goto L_0x10c1;
                case 4002: goto L_0x10c1;
                case 4003: goto L_0x10c1;
                case 4004: goto L_0x10c1;
                case 4005: goto L_0x10c1;
                default: goto L_0x008c;
            }
        L_0x008c:
            switch(r0) {
                case 5001: goto L_0x0ced;
                case 5002: goto L_0x0c78;
                case 5003: goto L_0x0c54;
                case 5004: goto L_0x0c41;
                case 5005: goto L_0x0c2e;
                case 5006: goto L_0x0c15;
                case 5007: goto L_0x0bdf;
                default: goto L_0x008f;
            }
        L_0x008f:
            java.lang.String r10 = "username"
            switch(r0) {
                case 90000: goto L_0x0ba2;
                case 90001: goto L_0x0b4d;
                case 90002: goto L_0x0b39;
                case 90003: goto L_0x0aa9;
                case 90004: goto L_0x0a27;
                default: goto L_0x0095;
            }
        L_0x0095:
            switch(r0) {
                case 43: goto L_0x026f;
                case 44: goto L_0x00be;
                case 45: goto L_0x00b1;
                default: goto L_0x0098;
            }
        L_0x0098:
            switch(r0) {
                case 47: goto L_0x02c7;
                case 48: goto L_0x1610;
                case 49: goto L_0x1610;
                default: goto L_0x009b;
            }
        L_0x009b:
            switch(r0) {
                case 71: goto L_0x042b;
                case 72: goto L_0x03fc;
                case 73: goto L_0x02d4;
                default: goto L_0x009e;
            }
        L_0x009e:
            java.lang.String r6 = "webpageTitle"
            switch(r0) {
                case 84: goto L_0x066a;
                case 85: goto L_0x0568;
                case 86: goto L_0x0556;
                case 87: goto L_0x045b;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            switch(r0) {
                case 198: goto L_0x089d;
                case 199: goto L_0x0872;
                case 200: goto L_0x0779;
                case 201: goto L_0x0704;
                case 202: goto L_0x06cf;
                case 203: goto L_0x06c2;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            switch(r0) {
                case 205: goto L_0x09ac;
                case 206: goto L_0x0933;
                case 207: goto L_0x091f;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            java.lang.String r0 = "undefine action code!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x1610
        L_0x00b1:
            r29.mo68779l(r30, r31)
            com.tencent.mm.plugin.webview.ui.tools.q1$z0 r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$z0
            r0.<init>(r2)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x1610
        L_0x00be:
            r29.mo68779l(r30, r31)
            java.lang.String r0 = "set_navigation_bar_buttons_text"
            java.lang.String r3 = r2.getString(r0)
            java.lang.String r0 = "set_navigation_bar_buttons_icon_data"
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r6 = "set_navigation_bar_buttons_hide_right_button"
            r7 = 0
            boolean r6 = r2.getBoolean(r6, r7)
            java.lang.String r8 = "set_navigation_bar_right_style"
            boolean r8 = r2.getBoolean(r8, r7)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r9 != 0) goto L_0x00f1
            android.graphics.Bitmap r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v.m6906a(r0)     // Catch:{ Exception -> 0x00e5 }
            goto L_0x00f2
        L_0x00e5:
            r0 = move-exception
            r9 = r0
            r10 = 1
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r7] = r9
            java.lang.String r7 = "setNavigationBarButtons, decode base64 image, exception = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r7, r0)
        L_0x00f1:
            r0 = 0
        L_0x00f2:
            java.lang.String r5 = "set_navigation_bar_buttons_left_text_color"
            java.lang.String r5 = r2.getString(r5)
            boolean r7 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r7 == 0) goto L_0x0100
            r7 = -1
            goto L_0x0102
        L_0x0100:
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x0102:
            int r5 = com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v.m6908c(r5, r7)
            java.lang.String r7 = "set_navigation_bar_buttons_need_click_event"
            r9 = 0
            boolean r7 = r2.getBoolean(r7, r9)
            java.lang.String r9 = "set_navigation_bar_buttons_text_color"
            java.lang.String r2 = r2.getString(r9)
            r9 = -1
            long r9 = com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v.m6909d(r2, r9)
            int r2 = (int) r9
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r9 = r1.f119554e
            java.lang.Object r9 = r9.get()
            if (r9 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r9 = r1.f119554e
            java.lang.Object r9 = r9.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r9 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r9
            boolean r9 = r9.isFinishing()
            if (r9 == 0) goto L_0x0132
            goto L_0x1610
        L_0x0132:
            if (r8 == 0) goto L_0x0151
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r8 = r1.f119554e
            java.lang.Object r8 = r8.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r8 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r8
            y93.a r8 = r8.mo68301p8()
            if (r8 == 0) goto L_0x0151
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r8 = r1.f119554e
            java.lang.Object r8 = r8.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r8 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r8
            y93.a r8 = r8.mo68301p8()
            r8.mo74192Z()
        L_0x0151:
            if (r6 == 0) goto L_0x0161
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            r2 = 1
            r0.mo68251P7(r2)
            goto L_0x1610
        L_0x0161:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r6 = r1.f119554e
            java.lang.Object r6 = r6.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r6 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r6
            java.lang.String r6 = r6.getCurrentURL()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r8 != 0) goto L_0x0184
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r8 = r1.f119554e
            java.lang.Object r8 = r8.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r8 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r8
            java.util.HashMap<java.lang.String, java.lang.Boolean> r8 = r8.f118527g1
            java.lang.Object r6 = r8.get(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            goto L_0x0185
        L_0x0184:
            r6 = 0
        L_0x0185:
            if (r6 != 0) goto L_0x0189
            r6 = 0
            goto L_0x018d
        L_0x0189:
            boolean r6 = r6.booleanValue()
        L_0x018d:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r8 = r1.f119554e
            java.lang.Object r8 = r8.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r8 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r8
            boolean r6 = r6.booleanValue()
            r8.mo68251P7(r6)
            if (r0 == 0) goto L_0x01d9
            boolean r6 = r0.isRecycled()
            if (r6 != 0) goto L_0x01d9
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r8 = r1.f119554e
            java.lang.Object r8 = r8.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r8 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r8
            android.content.res.Resources r8 = r8.getResources()
            r6.<init>(r8, r0)
            r2.mo68275c9(r3, r6)
            if (r7 == 0) goto L_0x0236
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.ui.tools.q1$v0 r2 = new com.tencent.mm.plugin.webview.ui.tools.q1$v0
            r2.<init>()
            r3 = 0
            r6 = 0
            r0.updateOptionMenuListener(r3, r2, r6)
            goto L_0x0236
        L_0x01d9:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 != 0) goto L_0x0206
            r6 = -1
            if (r2 != r6) goto L_0x01f4
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.ui.tools.q1$w0 r2 = new com.tencent.mm.plugin.webview.ui.tools.q1$w0
            r2.<init>()
            r6 = 0
            r0.addTextOptionMenu(r6, r3, r2)
            goto L_0x0236
        L_0x01f4:
            r6 = 0
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.ui.tools.q1$x0 r7 = new com.tencent.mm.plugin.webview.ui.tools.q1$x0
            r7.<init>()
            r0.addTextOptionMenu((int) r6, (java.lang.String) r3, (int) r2, (android.view.MenuItem.OnMenuItemClickListener) r7)
            goto L_0x0236
        L_0x0206:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            java.util.LinkedList r2 = r2.mo68277e8()
            if (r2 == 0) goto L_0x0220
            r2 = 2131756657(0x7f100671, float:1.9144228E38)
            goto L_0x0223
        L_0x0220:
            r2 = 2131756370(0x7f100552, float:1.9143646E38)
        L_0x0223:
            com.tencent.mm.plugin.webview.ui.tools.q1$y0 r3 = new com.tencent.mm.plugin.webview.ui.tools.q1$y0
            r3.<init>()
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r6 = r1.f119554e
            java.lang.Object r6 = r6.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r6 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r6
            android.view.View$OnLongClickListener r6 = r6.f118553p2
            r7 = 0
            r0.addIconOptionMenu((int) r7, (int) r2, (android.view.MenuItem.OnMenuItemClickListener) r3, (android.view.View.OnLongClickListener) r6)
        L_0x0236:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            int r0 = r0.mo68268Z7()
            r2 = 16
            if (r0 == r2) goto L_0x0261
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            boolean r0 = r0.mo68240J8()
            if (r0 != 0) goto L_0x0261
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            r0.mo68285h9(r5)
            goto L_0x1610
        L_0x0261:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            r2 = -1
            r0.setActionbarElementColor(r2)
            goto L_0x1610
        L_0x026f:
            r29.mo68779l(r30, r31)
            java.lang.String r0 = "set_page_title_text"
            java.lang.String r0 = r2.getString(r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r3 = r1.f119554e
            java.lang.Object r3 = r3.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r3
            if (r3 == 0) goto L_0x1610
            boolean r5 = r3.isFinishing()
            if (r5 == 0) goto L_0x028a
            goto L_0x1610
        L_0x028a:
            boolean r5 = r3.f118484R
            if (r5 != 0) goto L_0x0290
            goto L_0x1610
        L_0x0290:
            if (r0 == 0) goto L_0x0295
            r3.setMMTitle((java.lang.String) r0)
        L_0x0295:
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r5 = "set_page_title_alpha"
            float r0 = r2.getFloat(r5, r0)
            java.lang.String r5 = "set_page_title_color"
            java.lang.String r2 = r2.getString(r5)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r5 = r1.f119554e
            java.lang.Object r5 = r5.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r5 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r5
            int r5 = r5.mo68274c8()
            int r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v.m6908c(r2, r5)
            r3.setMMTitleColor(r2)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x1610
            double r5 = (double) r0
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x1610
            r3.setTitleAlpha(r0)
            goto L_0x1610
        L_0x02c7:
            r29.mo68779l(r30, r31)
            com.tencent.mm.plugin.webview.ui.tools.q1$s0 r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$s0
            r0.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x1610
        L_0x02d4:
            android.content.Intent r0 = r29.mo68777j()
            if (r2 == 0) goto L_0x1610
            int r2 = r2.getInt(r12)
            r3 = 45
            if (r2 == r3) goto L_0x03e6
            r3 = 51
            if (r2 == r3) goto L_0x03bd
            r3 = 990(0x3de, float:1.387E-42)
            if (r2 == r3) goto L_0x03b1
            switch(r2) {
                case 1: goto L_0x03e6;
                case 2: goto L_0x03e6;
                case 3: goto L_0x03e6;
                case 4: goto L_0x03e6;
                case 5: goto L_0x03e6;
                case 6: goto L_0x03e6;
                case 7: goto L_0x03e6;
                default: goto L_0x02ed;
            }
        L_0x02ed:
            switch(r2) {
                case 33: goto L_0x039f;
                case 34: goto L_0x0301;
                case 35: goto L_0x03f1;
                case 36: goto L_0x03f1;
                case 37: goto L_0x03e6;
                case 38: goto L_0x03f1;
                case 39: goto L_0x03f1;
                default: goto L_0x02f0;
            }
        L_0x02f0:
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r3[r6] = r2
            java.lang.String r2 = "unknown expose scene: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r3)
            goto L_0x03f1
        L_0x0301:
            java.lang.String r2 = "k_webview_img"
            java.lang.String r2 = r0.getStringExtra(r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x032a
            java.lang.String r2 = "k_webview_img"
            java.lang.String r2 = r0.getStringExtra(r2)
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            int r3 = (int) r5
            r5 = 0
            byte[] r3 = com.tencent.p014mm.vfs.C86013q1.m106433O(r2, r5, r3)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r2)
            java.lang.String r2 = android.util.Base64.encodeToString(r3, r5)
            java.lang.String r3 = "webviewImg"
            r4.putString(r3, r2)
        L_0x032a:
            java.lang.String r2 = "k_webview_html"
            java.lang.String r2 = r0.getStringExtra(r2)
            if (r2 == 0) goto L_0x033e
            java.lang.String r2 = "k_webview_html"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.String r3 = "webviewHtml"
            r4.putString(r3, r2)
        L_0x033e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "<exposecontent>"
            r2.append(r3)
            java.lang.String r3 = "<weburl>"
            r2.append(r3)
            java.lang.String r3 = "k_expose_url"
            java.lang.String r3 = r0.getStringExtra(r3)
            if (r3 == 0) goto L_0x035e
            java.lang.String r3 = "k_expose_url"
            java.lang.String r3 = r0.getStringExtra(r3)
            r2.append(r3)
        L_0x035e:
            java.lang.String r3 = "</weburl>"
            r2.append(r3)
            java.lang.String r3 = "<firstJumpUrl>"
            r2.append(r3)
            java.lang.String r3 = "k_expose_raw_url"
            java.lang.String r3 = r0.getStringExtra(r3)
            if (r3 == 0) goto L_0x0379
            java.lang.String r3 = "k_expose_raw_url"
            java.lang.String r3 = r0.getStringExtra(r3)
            r2.append(r3)
        L_0x0379:
            java.lang.String r3 = "</firstJumpUrl>"
            r2.append(r3)
            java.lang.String r3 = "<webscence>"
            r2.append(r3)
            java.lang.String r3 = "k_expose_web_scene"
            r5 = 0
            int r3 = r0.getIntExtra(r3, r5)
            r2.append(r3)
            java.lang.String r3 = "</webscence>"
            r2.append(r3)
            java.lang.String r3 = "</exposecontent>"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r4.putString(r7, r2)
            goto L_0x03f1
        L_0x039f:
            r2 = 0
            java.lang.String r5 = "k_expose_msg_id"
            long r2 = r0.getLongExtra(r5, r2)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.ConvertUtils.longToString(r2)
            java.lang.String r3 = "newMsgId"
            r4.putString(r3, r2)
            goto L_0x03f1
        L_0x03b1:
            java.lang.String r2 = "k_realchatuser"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.String r3 = "realChatUser"
            r4.putString(r3, r2)
            goto L_0x03f1
        L_0x03bd:
            r2 = 0
            java.lang.String r5 = "k_expose_msg_id"
            long r2 = r0.getLongExtra(r5, r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "newMsgId"
            r4.putString(r3, r2)
            java.lang.String r2 = "k_outside_expose_proof_item_list"
            java.util.ArrayList r2 = r0.getStringArrayListExtra(r2)
            java.lang.String r3 = "proof"
            r4.putStringArrayList(r3, r2)
            java.lang.String r2 = "k_expose_msg_type"
            r3 = 0
            int r2 = r0.getIntExtra(r2, r3)
            java.lang.String r3 = "msgType"
            r4.putInt(r3, r2)
            goto L_0x03f1
        L_0x03e6:
            java.lang.String r2 = "k_outside_expose_proof_item_list"
            java.util.ArrayList r2 = r0.getStringArrayListExtra(r2)
            java.lang.String r3 = "proof"
            r4.putStringArrayList(r3, r2)
        L_0x03f1:
            java.lang.String r2 = "k_username"
            java.lang.String r0 = r0.getStringExtra(r2)
            r4.putString(r10, r0)
            goto L_0x1610
        L_0x03fc:
            r29.mo68779l(r30, r31)
            java.lang.String r0 = "key_set_bounce_background_color"
            java.lang.String r0 = r2.getString(r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131101817(0x7f060879, float:1.7816054E38)
            int r2 = r2.getColor(r3)
            int r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v.m6908c(r0, r2)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            com.tencent.mm.plugin.webview.ui.tools.o1 r2 = r2.f118531h2
            r2.mo68762g(r0)
            goto L_0x1610
        L_0x042b:
            java.lang.String r0 = "enterprise_action"
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r2 = "enterprise_get_context_bizchat"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x1610
            android.content.Intent r0 = r29.mo68777j()
            java.lang.String r2 = "enterprise_biz_name"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r2 = "enterprise_context_biz"
            r4.putString(r2, r0)
            android.content.Intent r0 = r29.mo68777j()
            r2 = -1
            java.lang.String r5 = "biz_chat_chat_id"
            long r2 = r0.getLongExtra(r5, r2)
            java.lang.String r0 = "enterprise_context_bizchatid"
            r4.putLong(r0, r2)
            goto L_0x1610
        L_0x045b:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            boolean r0 = r0.mo68235G8()
            if (r0 == 0) goto L_0x0472
            java.lang.String r0 = "result"
            java.lang.String r2 = "not_return"
            r4.putString(r0, r2)
            goto L_0x1610
        L_0x0472:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.String r0 = r0.f118564t1
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            java.lang.String r2 = "full_url"
            r4.putString(r2, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.util.Map r0 = r0.mo68261V7()
            if (r0 == 0) goto L_0x054e
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.util.Map r0 = r0.mo68261V7()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            int r0 = r0.size()
            if (r0 == 0) goto L_0x054e
            java.lang.String r0 = "set_cookie"
            r2 = 1
            r4.putInt(r0, r2)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.util.Map r0 = r0.mo68261V7()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x04c3:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x050d
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.tencent.xweb.CookieManager r3 = com.tencent.xweb.CookieManager.getInstance()
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r6 = r1.f119554e
            java.lang.Object r6 = r6.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r6 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r6
            java.lang.String r6 = r6.f118564t1
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.getDomin(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r8 = "="
            r7.append(r8)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r8 = r1.f119554e
            java.lang.Object r8 = r8.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r8 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r8
            java.util.Map r8 = r8.mo68261V7()
            java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8
            java.lang.Object r2 = r8.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r3.setCookie(r6, r2)
            goto L_0x04c3
        L_0x050d:
            com.tencent.xweb.CookieManager r0 = com.tencent.xweb.CookieManager.getInstance()
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            java.lang.String r2 = r2.f118564t1
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.getDomin(r2)
            java.lang.String r3 = "httponly"
            r0.setCookie(r2, r3)
            com.tencent.xweb.CookieManager r0 = com.tencent.xweb.CookieManager.getInstance()
            r0.flush()
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.tencent.xweb.CookieManager r2 = com.tencent.xweb.CookieManager.getInstance()
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r3 = r1.f119554e
            java.lang.Object r3 = r3.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r3
            java.lang.String r3 = r3.f118564t1
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.getDomin(r3)
            java.lang.String r2 = r2.getCookie(r3)
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "cookies:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            goto L_0x1610
        L_0x054e:
            r3 = 0
            java.lang.String r0 = "set_cookie"
            r4.putInt(r0, r3)
            goto L_0x1610
        L_0x0556:
            r3 = 0
            android.content.Intent r0 = r29.mo68777j()
            java.lang.String r2 = "is_from_keep_top"
            boolean r0 = r0.getBooleanExtra(r2, r3)
            java.lang.String r2 = "is_from_keep_top"
            r4.putBoolean(r2, r0)
            goto L_0x1610
        L_0x0568:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.CharSequence r0 = r0.getMMTitle()
            java.lang.String r2 = r29.getCurrentUrl()
            java.lang.String r3 = r29.mo7029Ni()
            android.content.Intent r5 = r29.mo68777j()
            if (r5 == 0) goto L_0x0609
            java.lang.String r6 = "share_report_pre_msg_url"
            java.lang.String r6 = r5.getStringExtra(r6)
            java.lang.String r7 = "share_report_pre_msg_url"
            r4.putString(r7, r6)
            java.lang.String r6 = "share_report_pre_msg_title"
            java.lang.String r6 = r5.getStringExtra(r6)
            java.lang.String r7 = "share_report_pre_msg_title"
            r4.putString(r7, r6)
            java.lang.String r6 = "share_report_pre_msg_desc"
            java.lang.String r6 = r5.getStringExtra(r6)
            java.lang.String r7 = "share_report_pre_msg_desc"
            r4.putString(r7, r6)
            java.lang.String r6 = "share_report_pre_msg_icon_url"
            java.lang.String r6 = r5.getStringExtra(r6)
            java.lang.String r7 = "share_report_pre_msg_icon_url"
            r4.putString(r7, r6)
            java.lang.String r6 = "share_report_pre_msg_appid"
            java.lang.String r6 = r5.getStringExtra(r6)
            java.lang.String r7 = "share_report_pre_msg_appid"
            r4.putString(r7, r6)
            java.lang.String r6 = "share_report_from_scene"
            r7 = 0
            int r6 = r5.getIntExtra(r6, r7)
            java.lang.String r7 = "share_report_from_scene"
            r4.putInt(r7, r6)
            java.lang.String r6 = "share_report_biz_username"
            java.lang.String r6 = r5.getStringExtra(r6)
            java.lang.String r7 = "share_report_biz_username"
            r4.putString(r7, r6)
            java.lang.String r6 = "ad_report_bundle"
            android.os.Bundle r5 = r5.getBundleExtra(r6)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r6 != 0) goto L_0x0609
            if (r5 == 0) goto L_0x0609
            java.lang.String r6 = "ad_report_ux_info"
            java.lang.String r6 = r5.getString(r6)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0609
            android.net.Uri r6 = android.net.Uri.parse(r2)
            java.lang.String r7 = "mid"
            java.lang.String r7 = r6.getQueryParameter(r7)
            java.lang.String r8 = "idx"
            java.lang.String r6 = r6.getQueryParameter(r8)
            java.lang.String r8 = "ad_report_mid"
            r5.putString(r8, r7)
            java.lang.String r7 = "ad_report_idx"
            r5.putString(r7, r6)
            java.lang.String r6 = "ad_report_bundle"
            r4.putBundle(r6, r5)
        L_0x0609:
            java.lang.String r5 = "rawUrl"
            r4.putString(r5, r3)
            java.lang.String r3 = "share_report_current_url"
            r4.putString(r3, r2)
            if (r0 == 0) goto L_0x0619
            java.lang.String r15 = r0.toString()
        L_0x0619:
            java.lang.String r0 = "share_report_current_title"
            r4.putString(r0, r15)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1
            if (r0 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1
            if (r0 == 0) goto L_0x1610
            d93.c r0 = r0.mo67816n1()
            int r2 = r0.mo70847m()
            java.lang.String r3 = "key_get_a8key_req_params_req_id"
            r4.putInt(r3, r2)
            int r2 = r0.mo70846l()
            r4.putInt(r13, r2)
            te3.zt1 r2 = r0.f122707x
            if (r2 == 0) goto L_0x0659
            int r10 = r2.f146213d
            goto L_0x065a
        L_0x0659:
            r10 = 0
        L_0x065a:
            java.lang.String r2 = "key_get_a8key_req_params_ctrl_mode"
            r4.putInt(r2, r10)
            java.lang.String r0 = r0.mo70842h()
            java.lang.String r2 = "key_get_a8key_req_params_msg_id"
            r4.putString(r2, r0)
            goto L_0x1610
        L_0x066a:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.CharSequence r0 = r0.getMMTitle()
            java.lang.String r2 = r29.getCurrentUrl()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r0)
            if (r5 == 0) goto L_0x0694
            k40.a r3 = f40.C86709a0.m107533q(r3)
            ex0.d r3 = (ex0.C45696d) r3
            boolean r3 = r3.mo70989eQ(r2)
            if (r3 == 0) goto L_0x0694
            android.content.Intent r0 = r29.mo68777j()
            java.lang.String r0 = r0.getStringExtra(r6)
        L_0x0694:
            r4.putString(r9, r2)
            if (r0 == 0) goto L_0x069e
            java.lang.String r0 = r0.toString()
            goto L_0x069f
        L_0x069e:
            r0 = r15
        L_0x069f:
            java.lang.String r2 = "webview_current_title"
            r4.putString(r2, r0)
            java.lang.String r0 = "webview_current_desc"
            r4.putString(r0, r15)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x1610
            java.lang.String r0 = r0.getStringExtra(r8)
            r4.putString(r8, r0)
            goto L_0x1610
        L_0x06c2:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            r0.mo68233E9()
            goto L_0x1610
        L_0x06cf:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof h93.C46014b
            if (r0 == 0) goto L_0x1610
            if (r2 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            h93.b r0 = (h93.C46014b) r0
            java.lang.String r3 = "action"
            java.lang.String r3 = r2.getString(r3)
            java.lang.String r5 = "writeComment"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x06f7
            r0.mo68231E4(r2)
            goto L_0x1610
        L_0x06f7:
            java.lang.String r5 = "closeComment"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x1610
            r0.mo68239J3(r2)
            goto L_0x1610
        L_0x0704:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof h93.C46014b
            if (r0 == 0) goto L_0x1610
            if (r2 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            h93.b r0 = (h93.C46014b) r0
            java.lang.String r3 = "action"
            java.lang.String r3 = r2.getString(r3)
            r3.getClass()
            int r5 = r3.hashCode()
            switch(r5) {
                case -1913642710: goto L_0x074c;
                case -1471793536: goto L_0x0741;
                case -633182848: goto L_0x0735;
                case 2006199626: goto L_0x0729;
                default: goto L_0x0728;
            }
        L_0x0728:
            goto L_0x0757
        L_0x0729:
            java.lang.String r5 = "writeCommentReply"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0733
            goto L_0x0757
        L_0x0733:
            r10 = 3
            goto L_0x0758
        L_0x0735:
            java.lang.String r5 = "writeComment"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x073f
            goto L_0x0757
        L_0x073f:
            r10 = 2
            goto L_0x0758
        L_0x0741:
            java.lang.String r5 = "readArticle"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x074a
            goto L_0x0757
        L_0x074a:
            r10 = 1
            goto L_0x0758
        L_0x074c:
            java.lang.String r5 = "showToast"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0755
            goto L_0x0757
        L_0x0755:
            r10 = 0
            goto L_0x0758
        L_0x0757:
            r10 = -1
        L_0x0758:
            if (r10 == 0) goto L_0x0774
            r3 = 1
            if (r10 == r3) goto L_0x076f
            r3 = 2
            if (r10 == r3) goto L_0x076a
            r3 = 3
            if (r10 == r3) goto L_0x0765
            goto L_0x1610
        L_0x0765:
            r0.mo68323z2(r2)
            goto L_0x1610
        L_0x076a:
            r0.mo68281g7(r2)
            goto L_0x1610
        L_0x076f:
            r0.mo68250P5(r2)
            goto L_0x1610
        L_0x0774:
            r0.mo68249P0(r2)
            goto L_0x1610
        L_0x0779:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            r20 = r0
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r20 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r20
            if (r20 != 0) goto L_0x078c
            java.lang.String r0 = "AC_ON_FAST_LOAD but null WebViewUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x1610
        L_0x078c:
            ex0.d$a r0 = new ex0.d$a
            r0.<init>()
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r6 = "item_show_type"
            int r6 = r2.getInt(r6)
            r8 = 5
            if (r6 != r8) goto L_0x07b0
            r5.putExtras(r2)
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 1061(0x425, double:5.24E-321)
            r24 = 21
            r26 = 1
            r28 = 0
            r21.idkeyStat(r22, r24, r26, r28)
            goto L_0x07b7
        L_0x07b0:
            java.lang.String r6 = r2.getString(r11)
            r5.putExtra(r11, r6)
        L_0x07b7:
            int r6 = r29.mo7027F7()
            int r6 = r2.getInt(r13, r6)
            r5.putExtra(r13, r6)
            java.lang.String r6 = "KPageScene"
            r8 = 0
            int r6 = r2.getInt(r6, r8)
            java.lang.String r8 = "KPageScene"
            r5.putExtra(r8, r6)
            java.lang.String r6 = "KPageInfo"
            java.lang.String r6 = r2.getString(r6)
            java.lang.String r8 = "KPageInfo"
            r5.putExtra(r8, r6)
            int r6 = r2.getInt(r12)
            r8 = 10000(0x2710, float:1.4013E-41)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r9 = r1.f119554e
            java.lang.Object r9 = r9.get()
            if (r9 == 0) goto L_0x07f9
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r9 = r1.f119554e
            java.lang.Object r9 = r9.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r9 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r9
            android.content.Intent r9 = r9.getIntent()
            java.lang.String r10 = "KOpenArticleSceneFromScene"
            int r8 = r9.getIntExtra(r10, r8)
        L_0x07f9:
            java.lang.String r9 = "subscene"
            int r8 = r2.getInt(r9, r8)
            java.lang.String r7 = r2.getString(r7)
            k40.a r9 = f40.C86709a0.m107533q(r3)
            ex0.d r9 = (ex0.C45696d) r9
            boolean r9 = r9.B60(r7)
            if (r9 == 0) goto L_0x0821
            long r9 = java.lang.System.currentTimeMillis()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r11
            int r10 = (int) r9
            k40.a r9 = f40.C86709a0.m107533q(r3)
            ex0.d r9 = (ex0.C45696d) r9
            java.lang.String r7 = r9.mo70959F2(r7, r6, r8, r10)
        L_0x0821:
            r21 = r7
            android.content.Intent r7 = r20.getIntent()
            if (r7 == 0) goto L_0x0838
            java.lang.String r7 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122325q
            android.content.Intent r9 = r20.getIntent()
            java.lang.String r10 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122325q
            java.lang.String r9 = r9.getStringExtra(r10)
            r5.putExtra(r7, r9)
        L_0x0838:
            k40.a r3 = f40.C86709a0.m107533q(r3)
            r19 = r3
            ex0.d r19 = (ex0.C45696d) r19
            java.lang.String r3 = "item_show_type"
            int r22 = r2.getInt(r3)
            java.lang.String r3 = "isNativePage"
            boolean r23 = r2.getBoolean(r3)
            java.lang.String r3 = "openType"
            int r27 = r2.getInt(r3)
            r24 = r6
            r25 = r8
            r26 = r5
            r28 = r0
            boolean r2 = r19.Zi0(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.String r3 = "success"
            r4.putBoolean(r3, r2)
            boolean r2 = r0.f26630a
            if (r2 != 0) goto L_0x1610
            java.lang.String r0 = r0.f26631b
            if (r0 == 0) goto L_0x1610
            java.lang.String r2 = "desc"
            r4.putString(r2, r0)
            goto L_0x1610
        L_0x0872:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            qo3.i0 r0 = r0.f118554q
            if (r0 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            qo3.i0 r0 = r0.f118554q
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            qo3.i0 r0 = r0.f118554q
            r0.dismiss()
            goto L_0x1610
        L_0x089d:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            qo3.i0 r0 = r0.f118554q
            if (r0 == 0) goto L_0x08c6
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            qo3.i0 r0 = r0.f118554q
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x08c6
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            qo3.i0 r0 = r0.f118554q
            r0.dismiss()
        L_0x08c6:
            if (r2 != 0) goto L_0x08cf
            java.lang.String r0 = "show dialog, data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            goto L_0x1610
        L_0x08cf:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            r3 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r0 = r0.getString(r3)
            java.lang.String r3 = "title"
            java.lang.String r6 = r2.getString(r3, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            r3 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r0 = r0.getString(r3)
            java.lang.String r3 = "message"
            java.lang.String r7 = r2.getString(r3, r0)
            java.lang.String r0 = "cancelable"
            r3 = 1
            boolean r9 = r2.getBoolean(r0, r3)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r3 = r1.f119554e
            java.lang.Object r3 = r3.get()
            r5 = r3
            android.content.Context r5 = (android.content.Context) r5
            r8 = 1
            com.tencent.mm.plugin.webview.ui.tools.q1$e1 r10 = new com.tencent.mm.plugin.webview.ui.tools.q1$e1
            r10.<init>(r2)
            qo3.i0 r2 = nj3.C76879j.m92723Q(r5, r6, r7, r8, r9, r10)
            r0.f118554q = r2
            goto L_0x1610
        L_0x091f:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            boolean r0 = r0.mo68241K7()
            java.lang.String r2 = "webview_allow_msg_tail"
            r4.putBoolean(r2, r0)
            goto L_0x1610
        L_0x0933:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r0 = r0.getStringExtra(r6)
            r4.putString(r6, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r2 = "thumbUrl"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r2 = "thumbUrl"
            r4.putString(r2, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r2 = "thumbPath"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r2 = "thumbPath"
            r4.putString(r2, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1
            java.lang.String r0 = r0.mo67732m0()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x099b
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1
            java.lang.String r0 = r0.mo67732m0()
            r4.putString(r9, r0)
            goto L_0x1610
        L_0x099b:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.String r0 = r0.mo6901n0()
            r4.putString(r9, r0)
            goto L_0x1610
        L_0x09ac:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            int r2 = r2.hashCode()
            java.lang.String r3 = "WebViewShare_BinderID"
            r0.putInt(r3, r2)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            com.tencent.mm.ui.widget.MMWebView r2 = r2.f118523f
            java.lang.String r2 = r2.getUrl()
            java.lang.String r3 = "WebViewShare_wv_url"
            r0.putString(r3, r2)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e     // Catch:{ Exception -> 0x09f0 }
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x09f0 }
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2     // Catch:{ Exception -> 0x09f0 }
            com.tencent.mm.plugin.webview.core.y r2 = r2.f118513b1     // Catch:{ Exception -> 0x09f0 }
            com.tencent.mm.plugin.webview.stub.l r2 = r2.f117601y     // Catch:{ Exception -> 0x09f0 }
            r3 = 109(0x6d, float:1.53E-43)
            android.os.Bundle r0 = r2.mo68114V5(r3, r0)     // Catch:{ Exception -> 0x09f0 }
            if (r0 == 0) goto L_0x0a00
            java.lang.String r2 = "key_hao_kan_title"
            java.lang.String r10 = r0.getString(r2)     // Catch:{ Exception -> 0x09f0 }
            goto L_0x0a01
        L_0x09f0:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "setHaoKanStatus e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r2)
        L_0x0a00:
            r10 = 0
        L_0x0a01:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "AC_SHOW_HAO_KAN_DIALOG  title:"
            r0.append(r2)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            com.tencent.mm.plugin.webview.ui.tools.q1$d1 r2 = new com.tencent.mm.plugin.webview.ui.tools.q1$d1
            r2.<init>()
            ea3.C7619n.m7753a(r0, r10, r2)
            goto L_0x1610
        L_0x0a27:
            java.lang.String r0 = "geta8key_result_req_url"
            r2.getString(r0)
            java.lang.String r0 = "geta8key_result_full_url"
            java.lang.String r0 = r2.getString(r0)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 != 0) goto L_0x0aa1
            com.tencent.mm.protocal.JsapiPermissionWrapper r3 = new com.tencent.mm.protocal.JsapiPermissionWrapper
            java.lang.String r5 = "geta8key_result_jsapi_perm_control_bytes"
            byte[] r5 = r2.getByteArray(r5)
            r3.<init>((byte[]) r5)
            com.tencent.mm.protocal.GeneralControlWrapper r5 = new com.tencent.mm.protocal.GeneralControlWrapper
            java.lang.String r7 = "geta8key_result_general_ctrl_b1"
            int r7 = r2.getInt(r7)
            r5.<init>((int) r7)
            java.lang.String r7 = "http://"
            java.lang.String r8 = "https//"
            java.lang.String r0 = r0.replaceFirst(r7, r8)
            r6.mo70864g(r0, r3, r5)
            java.lang.String r0 = "geta8key_result_http_header_key_list"
            java.lang.String[] r0 = r2.getStringArray(r0)
            java.lang.String r3 = "geta8key_result_http_header_value_list"
            java.lang.String[] r3 = r2.getStringArray(r3)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            if (r0 == 0) goto L_0x0a86
            if (r3 == 0) goto L_0x0a86
            int r6 = r0.length
            if (r6 <= 0) goto L_0x0a86
            int r6 = r3.length
            if (r6 <= 0) goto L_0x0a86
            int r6 = r0.length
            int r7 = r3.length
            if (r6 != r7) goto L_0x0a86
            r10 = 0
        L_0x0a79:
            int r6 = r0.length
            if (r10 >= r6) goto L_0x0a86
            r6 = r0[r10]
            r7 = r3[r10]
            r5.put(r6, r7)
            int r10 = r10 + 1
            goto L_0x0a79
        L_0x0a86:
            java.lang.String r0 = "geta8key_result_title"
            java.lang.String r0 = r2.getString(r0)
            if (r0 == 0) goto L_0x1610
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            r2.setMMTitle((java.lang.String) r0)
            goto L_0x1610
        L_0x0aa1:
            java.lang.String r0 = "updatePageAuth fail fullUrl is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x1610
        L_0x0aa9:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.String r0 = r0.mo6901n0()
            java.lang.String r2 = "geta8key_data_req_url"
            r4.putString(r2, r0)
            android.content.Intent r0 = r29.mo68777j()
            java.lang.String r0 = r0.getStringExtra(r14)
            java.lang.String r2 = "geta8key_data_username"
            r4.putString(r2, r0)
            android.content.Intent r0 = r29.mo68777j()
            java.lang.String r0 = r0.getStringExtra(r14)
            int r0 = r1.mo68778k(r0)
            java.lang.String r2 = "geta8key_data_scene"
            r4.putInt(r2, r0)
            r0 = 8
            java.lang.String r2 = "geta8key_data_reason"
            r4.putInt(r2, r0)
            java.lang.String r0 = "geta8key_data_flag"
            r2 = 0
            r4.putInt(r0, r2)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
            java.lang.String r0 = com.tencent.p014mm.plugin.webview.model.C43704h2.m47538d()
            java.lang.String r2 = "geta8key_data_net_type"
            r4.putString(r2, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            int r0 = r0.f118502X
            java.lang.String r2 = "geta8key_session_id"
            r4.putInt(r2, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            int r0 = r0.mo68267Y7()
            java.lang.String r2 = "webview_binder_id"
            r4.putInt(r2, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            byte[] r0 = r0.f118505Y
            java.lang.String r2 = "k_a8key_cookie"
            r4.putByteArray(r2, r0)
            android.content.Intent r0 = r29.mo68777j()
            java.lang.String r2 = "geta8key_open_webview_appid"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r2 = "geta8key_data_appid"
            r4.putString(r2, r0)
            goto L_0x1610
        L_0x0b39:
            r29.mo68779l(r30, r31)
            java.lang.String r0 = "traceid"
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r2 = r2.getString(r10)
            com.tencent.mm.plugin.webview.ui.tools.p1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C44130p1.f119545i
            r3.mo68775f(r0, r2)
            goto L_0x1610
        L_0x0b4d:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.String r0 = r0.getCurrentURL()
            com.tencent.xweb.CookieManager r3 = com.tencent.xweb.CookieManager.getInstance()
            java.lang.String r3 = r3.getCookie(r0)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r0
            r7 = 1
            r6[r7] = r3
            java.lang.String r0 = "url = %s, cookie = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r6)
            java.lang.String r0 = "cookie"
            r4.putString(r0, r3)
            float r0 = r29.mo68776e()
            java.lang.String r3 = "density"
            r4.putFloat(r3, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            int r0 = r0.mo68296n8()
            java.lang.String r3 = "topOffset"
            r4.putInt(r3, r0)
            if (r2 == 0) goto L_0x1610
            java.lang.String r0 = "currentPicUrl"
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r0 = com.tencent.p014mm.plugin.webview.modeltools.C6085v.m5954e(r0)
            java.lang.String r2 = "currentUrlPath"
            r4.putString(r2, r0)
            goto L_0x1610
        L_0x0ba2:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1
            rx3.g r0 = r0.f117690d1
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.plugin.webview.modeltools.c0 r0 = (com.tencent.p014mm.plugin.webview.modeltools.C43748c0) r0
            java.lang.String[] r0 = r0.mo68057c()
            java.lang.String r2 = "webview_get_route_url_list"
            r4.putStringArray(r2, r0)
            android.content.Intent r0 = r29.mo68777j()
            java.lang.String r0 = r0.getStringExtra(r14)
            int r0 = r1.mo68778k(r0)
            java.lang.String r2 = "webview_get_route_url_geta8key_scene"
            r4.putInt(r2, r0)
            android.content.Intent r0 = r29.mo68777j()
            java.lang.String r0 = r0.getStringExtra(r14)
            r4.putString(r14, r0)
            goto L_0x1610
        L_0x0bdf:
            r29.mo68779l(r30, r31)
            r3 = r18
            int r0 = r2.getInt(r3)
            java.lang.String r3 = "webview_video_proxy_preload_duration"
            int r2 = r2.getInt(r3)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r7 = 0
            r3[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r7 = 1
            r3[r7] = r6
            java.lang.String r6 = "playid = %d, duration = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r3)
            com.tencent.qqvideo.proxy.api.IPlayManager r3 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
            int r0 = r3.preLoad(r0, r2)
            java.lang.String r2 = "webview_video_proxy_pre_load_result"
            r4.putInt(r2, r0)
            goto L_0x1610
        L_0x0c15:
            r3 = r18
            r29.mo68779l(r30, r31)
            int r0 = r2.getInt(r3)
            java.lang.String r3 = "webview_video_proxy_play_remain_time"
            int r2 = r2.getInt(r3)
            com.tencent.qqvideo.proxy.api.IPlayManager r3 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
            r3.setRemainTime(r0, r2)
            goto L_0x1610
        L_0x0c2e:
            r29.mo68779l(r30, r31)
            java.lang.String r0 = "webview_video_proxy_net_state"
            int r0 = r2.getInt(r0)
            com.tencent.qqvideo.proxy.api.IPlayManager r2 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
            r2.setNetWorkState(r0)
            goto L_0x1610
        L_0x0c41:
            r29.mo68779l(r30, r31)
            java.lang.String r0 = "webview_video_proxy_play_state"
            int r0 = r2.getInt(r0)
            com.tencent.qqvideo.proxy.api.IPlayManager r2 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
            r2.setPlayerState(r0)
            goto L_0x1610
        L_0x0c54:
            r3 = r18
            r29.mo68779l(r30, r31)
            int r0 = r2.getInt(r3)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r6 = 0
            r2[r6] = r3
            java.lang.String r3 = "webview proxy stop play, play id = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
            if (r0 <= 0) goto L_0x1610
            com.tencent.qqvideo.proxy.api.IPlayManager r2 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
            r2.stopPlay(r0)
            goto L_0x1610
        L_0x0c78:
            r3 = r18
            r29.mo68779l(r30, r31)
            java.lang.String r0 = "webview_video_proxy_cdn_urls"
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r6 = "webview_video_proxy_fileId"
            java.lang.String r13 = r2.getString(r6)
            java.lang.String r6 = "webview_video_proxy_file_size"
            int r14 = r2.getInt(r6)
            java.lang.String r6 = "webview_video_proxy_file_duration"
            int r15 = r2.getInt(r6)
            java.lang.String r6 = "webview_video_proxy_file_type"
            int r2 = r2.getInt(r6)
            com.tencent.qqvideo.proxy.api.IPlayManager r6 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
            long r10 = (long) r14
            r7 = r0
            r8 = r2
            r9 = r13
            r12 = r15
            int r6 = r6.startPlay(r7, r8, r9, r10, r12)
            com.tencent.qqvideo.proxy.api.IPlayManager r7 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
            java.lang.String r7 = r7.buildPlayURLMp4(r6)
            r8 = 7
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r9 = 0
            r8[r9] = r0
            r9 = 1
            r8[r9] = r13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r9 = 2
            r8[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r9 = 3
            r8[r9] = r0
            r0 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8[r0] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2 = 5
            r8[r2] = r0
            r0 = 6
            r8[r0] = r7
            java.lang.String r0 = "cdnurls = %s, filedId = %s, fileSize = %d, fileDuration = %d, fileType = %d, playDataId = %d, localUrl = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r8)
            r4.putInt(r3, r6)
            java.lang.String r0 = "webview_video_proxy_local_url"
            r4.putString(r0, r7)
            goto L_0x1610
        L_0x0ced:
            r29.mo68779l(r30, r31)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.stub.l r0 = r0.f118511a1
            boolean r0 = r0.isSDCardAvailable()
            if (r0 == 0) goto L_0x0d85
            long r2 = com.tencent.p014mm.sdk.platformtools.SdcardUtil.getAvailableExternalMemorySize2()
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            r7 = 0
            r0[r7] = r6
            java.lang.String r6 = "availableSize = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r0)
            r6 = 524288000(0x1f400000, double:2.590326893E-315)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0d2d
            java.lang.String r0 = "available size not enough"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            com.tencent.qqvideo.proxy.api.IPlayManager r0 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 0
            int r0 = r0.init(r2, r3)
            goto L_0x0d97
        L_0x0d2d:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r2 = i83.C46175a.f124472b
            r0.<init>((java.lang.String) r2)
            boolean r2 = r0.mo119967g()
            if (r2 != 0) goto L_0x0d55
            boolean r2 = r0.mo119987x()
            r3 = 2
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r3 = r0.mo119971i()
            r7 = 0
            r6[r7] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r8 = 1
            r6[r8] = r3
            java.lang.String r3 = "create proxy cache path : %s, %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r6)
            goto L_0x0d57
        L_0x0d55:
            r7 = 0
            r2 = 1
        L_0x0d57:
            if (r2 == 0) goto L_0x0d77
            com.tencent.qqvideo.proxy.api.IPlayManager r2 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = r0.mo119971i()
            java.lang.String r0 = p823sg.C48380r.m53726a(r0, r7)
            int r0 = r2.init(r3, r0)
            com.tencent.qqvideo.proxy.api.IPlayManager r2 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
            r6 = 200(0xc8, double:9.9E-322)
            r2.setMaxStorageSize(r6)
            goto L_0x0d97
        L_0x0d77:
            com.tencent.qqvideo.proxy.api.IPlayManager r0 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 0
            int r0 = r0.init(r2, r3)
            goto L_0x0d97
        L_0x0d85:
            r3 = 0
            java.lang.String r0 = "sdcard not available"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.qqvideo.proxy.api.IPlayManager r0 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r0 = r0.init(r2, r3)
        L_0x0d97:
            if (r0 != 0) goto L_0x0dfa
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            com.tencent.qqvideo.proxy.api.IUtils r2 = r2.f118469J1
            if (r2 != 0) goto L_0x0dcc
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r3 = r1.f119554e
            java.lang.Object r3 = r3.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r3
            com.tencent.mm.plugin.webview.ui.tools.q0 r3 = r3.mo68258T8()
            r2.f118469J1 = r3
            com.tencent.qqvideo.proxy.api.IPlayManager r2 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r3 = r1.f119554e
            java.lang.Object r3 = r3.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r3
            com.tencent.qqvideo.proxy.api.IUtils r3 = r3.f118469J1
            r2.setUtilsObject(r3)
        L_0x0dcc:
            com.tencent.qqvideo.proxy.api.IPlayManager r2 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
            int r2 = r2.getLocalServerPort()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r7 = 0
            r3[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r7 = 1
            r3[r7] = r6
            java.lang.String r6 = "webview video init result = %d, local port = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r3)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r3 = r1.f119554e
            java.lang.Object r3 = r3.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r3
            com.tencent.mm.plugin.webview.model.q1 r3 = r3.mo68303q8()
            r3.mo68025a(r2)
        L_0x0dfa:
            java.lang.String r2 = "webview_video_proxy_init"
            r4.putInt(r2, r0)
            goto L_0x1610
        L_0x0e02:
            if (r2 == 0) goto L_0x1610
            java.lang.String r0 = "forbid_response_kb_state_when_inactive"
            boolean r0 = r2.getBoolean(r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            r2.mo68292k9(r0)
            goto L_0x1610
        L_0x0e1f:
            android.content.Intent r0 = r29.mo68777j()
            java.lang.String r2 = "code_scene"
            r3 = 0
            int r0 = r0.getIntExtra(r2, r3)
            r4.putInt(r2, r0)
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            android.content.Intent r6 = r29.mo68777j()
            int r2 = r6.getIntExtra(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r3] = r2
            java.lang.String r2 = "key value: pay code scene(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            goto L_0x1610
        L_0x0e45:
            r3 = 0
            android.content.Intent r0 = r29.mo68777j()
            java.lang.String r2 = "msgUsername"
            java.lang.String r0 = r0.getStringExtra(r2)
            android.content.Intent r6 = r29.mo68777j()
            java.lang.String r6 = r6.getStringExtra(r14)
            android.content.Intent r7 = r29.mo68777j()
            int r7 = r7.getIntExtra(r13, r3)
            android.content.Intent r8 = r29.mo68777j()
            java.lang.String r9 = "pay_qrcode_session_type"
            int r8 = r8.getIntExtra(r9, r3)
            android.content.Intent r3 = r29.mo68777j()
            java.lang.String r10 = "pay_qrcode_session_name"
            java.lang.String r3 = r3.getStringExtra(r10)
            android.content.Intent r11 = r29.mo68777j()
            java.lang.String r12 = "pay_qrcode_timeline_objid"
            java.lang.String r11 = r11.getStringExtra(r12)
            r17 = r15
            if (r0 == 0) goto L_0x0e83
            r15 = r0
        L_0x0e83:
            r4.putString(r2, r15)
            if (r6 == 0) goto L_0x0e8a
            r15 = r6
            goto L_0x0e8c
        L_0x0e8a:
            r15 = r17
        L_0x0e8c:
            r4.putString(r14, r15)
            r4.putInt(r13, r7)
            r4.putInt(r9, r8)
            r4.putString(r10, r3)
            r4.putString(r12, r11)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r3 = 1
            r2[r3] = r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r3 = 2
            r2[r3] = r0
            java.lang.String r0 = "key value: senderUsername(%s), talkerUsername(%s), scene(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r2)
            goto L_0x1610
        L_0x0eb2:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L_0x0ec5
            com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate r0 = com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.m893a(r0)
            java.lang.String r2 = "delegate"
            r4.putParcelable(r2, r0)
        L_0x0ec5:
            return r4
        L_0x0ec6:
            android.os.Bundle r0 = new android.os.Bundle
            r2 = 1
            r0.<init>(r2)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            if (r2 == 0) goto L_0x0eed
            android.content.Intent r2 = r2.getIntent()
            if (r2 != 0) goto L_0x0edd
            goto L_0x0eed
        L_0x0edd:
            android.content.Intent r2 = r29.mo68777j()
            java.lang.String r3 = "key_h5pay_cookie"
            java.lang.String r2 = r2.getStringExtra(r3)
            java.lang.String r3 = "key_h5pay_cookie"
            r0.putString(r3, r2)
            return r0
        L_0x0eed:
            java.lang.String r0 = "AC_GET_H5_PAY_COOKIE but null WebViewUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x1610
        L_0x0ef4:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.String r2 = "MicroMsg.WxPayAdUxInfoTracer"
            if (r0 == 0) goto L_0x0f30
            android.content.Intent r3 = r0.getIntent()
            if (r3 != 0) goto L_0x0f07
            goto L_0x0f30
        L_0x0f07:
            android.os.Bundle r3 = new android.os.Bundle
            r4 = 1
            r3.<init>(r4)
            java.lang.String r5 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122325q
            android.content.Intent r6 = r0.getIntent()
            java.lang.String r7 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122325q
            java.lang.String r6 = r6.getStringExtra(r7)
            r3.putString(r5, r6)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r0
            java.lang.String r0 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122325q
            java.lang.String r0 = r3.getString(r0)
            r5[r4] = r0
            java.lang.String r0 = "trace: WebViewStubCallback activity[%s] adUxInfo[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r5)
            return r3
        L_0x0f30:
            r4 = 1
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = "trace: WebViewStubCallback activity[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r3)
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            return r0
        L_0x0f3e:
            r4 = 1
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r4)
            com.tencent.mm.plugin.webview.ui.tools.p1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C44130p1.f119545i
            java.lang.String r2 = r2.mo68771b()
            java.lang.String r3 = "ad_info_traceId"
            r0.putString(r3, r2)
            return r0
        L_0x0f50:
            com.tencent.mm.plugin.webview.ui.tools.q1$u0 r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$u0
            r0.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x1610
        L_0x0f5a:
            r29.mo68779l(r30, r31)
            java.lang.String r0 = "webview_disable_bounce_scroll_top"
            r3 = 0
            int r0 = r2.getInt(r0, r3)
            if (r0 > 0) goto L_0x0f69
            goto L_0x1610
        L_0x0f69:
            com.tencent.mm.plugin.webview.ui.tools.q1$o0 r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$o0
            r0.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x1610
        L_0x0f73:
            java.lang.String r0 = "show_kb_placeholder"
            java.lang.String r8 = r2.getString(r0)
            java.lang.String r0 = "show_kb_max_length"
            int r9 = r2.getInt(r0)
            java.lang.String r0 = "show_kb_show_remind_word_count"
            int r10 = r2.getInt(r0)
            java.lang.String r0 = "show_kb_text"
            java.lang.String r7 = r2.getString(r0)
            java.lang.String r0 = "show_kb_to_show"
            boolean r3 = r2.getBoolean(r0)
            java.lang.String r0 = "key_show_kb_custom_params"
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r6 = "switchToSmile"
            r2.getBoolean(r6)
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0ffb }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0ffb }
            java.lang.String r0 = "showType"
            java.lang.String r12 = "showType"
            java.lang.String r12 = r2.optString(r12)     // Catch:{ Exception -> 0x0ffb }
            r11.put(r0, r12)     // Catch:{ Exception -> 0x0ffb }
            java.lang.String r0 = "leftWords"
            java.lang.String r12 = "leftWords"
            java.lang.String r12 = r2.optString(r12)     // Catch:{ Exception -> 0x0ffb }
            r11.put(r0, r12)     // Catch:{ Exception -> 0x0ffb }
            java.lang.String r0 = "rightWords"
            java.lang.String r12 = "rightWords"
            java.lang.String r12 = r2.optString(r12)     // Catch:{ Exception -> 0x0ffb }
            r11.put(r0, r12)     // Catch:{ Exception -> 0x0ffb }
            java.lang.String r0 = "editBoxHeight"
            java.lang.String r12 = "editBoxHeight"
            java.lang.String r12 = r2.optString(r12)     // Catch:{ Exception -> 0x0ffb }
            r11.put(r0, r12)     // Catch:{ Exception -> 0x0ffb }
            java.lang.String r0 = "sendButtonWord"
            java.lang.String r12 = "sendButtonWord"
            java.lang.String r12 = r2.optString(r12)     // Catch:{ Exception -> 0x0ffb }
            r11.put(r0, r12)     // Catch:{ Exception -> 0x0ffb }
            java.lang.String r0 = r2.optString(r6)     // Catch:{ Exception -> 0x0ffb }
            r11.put(r6, r0)     // Catch:{ Exception -> 0x0ffb }
            java.lang.String r0 = "textViewMargin"
            java.lang.String r6 = "textViewMargin"
            java.lang.String r6 = r2.optString(r6)     // Catch:{ Exception -> 0x0ffb }
            r11.put(r0, r6)     // Catch:{ Exception -> 0x0ffb }
            java.lang.String r0 = "buttonMargin"
            java.lang.String r6 = "buttonMargin"
            java.lang.String r2 = r2.optString(r6)     // Catch:{ Exception -> 0x0ffb }
            r11.put(r0, r2)     // Catch:{ Exception -> 0x0ffb }
            goto L_0x100b
        L_0x0ffb:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r6 = 0
            r2[r6] = r0
            java.lang.String r0 = "keyboard json error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r2)
        L_0x100b:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x103f
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x1022
            goto L_0x103f
        L_0x1022:
            if (r3 == 0) goto L_0x1032
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            r6 = r0
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r6 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r6
            r6.mo68322y9(r7, r8, r9, r10, r11)
            goto L_0x1610
        L_0x1032:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            r0.mo68319x8()
            goto L_0x1610
        L_0x103f:
            java.lang.String r0 = "keyboard, ui finishing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r2 = 0
            return r2
        L_0x1046:
            com.tencent.mm.plugin.webview.ui.tools.q1$q0 r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$q0
            r0.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x1610
        L_0x1050:
            com.tencent.mm.plugin.webview.ui.tools.q1$t0 r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$t0
            r0.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x1610
        L_0x105a:
            r29.mo68779l(r30, r31)
            com.tencent.mm.plugin.webview.ui.tools.q1$p0 r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$p0
            r0.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x1610
        L_0x1067:
            android.content.Intent r0 = r29.mo68777j()
            if (r0 == 0) goto L_0x1610
            java.lang.String r2 = "publishIdPrefix"
            java.lang.String r3 = r0.getStringExtra(r2)
            r4.putString(r2, r3)
            java.lang.String r2 = "reportSessionId"
            java.lang.String r0 = r0.getStringExtra(r2)
            r4.putString(r2, r0)
            goto L_0x1610
        L_0x1081:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            r3 = 1
            r0.f118457D1 = r3
            goto L_0x1610
        L_0x108e:
            r3 = 1
            java.lang.String r0 = "clear_webview_cache_clear_cookie"
            r6 = 0
            boolean r0 = r2.getBoolean(r0, r6)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r2[r6] = r3
            java.lang.String r3 = "includeCookie = %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "tools_process_action_code_key"
            java.lang.String r5 = "com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE"
            r2.putExtra(r3, r5)
            java.lang.String r3 = "tools_clean_webview_cache_ignore_cookie"
            r2.putExtra(r3, r0)
            java.lang.Class<s00.f> r0 = s00.C90110f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            s00.f r0 = (s00.C90110f) r0
            r0.bg0(r2)
            goto L_0x1610
        L_0x10c1:
            com.tencent.mm.autogen.events.ApduEngineFuncEvent r3 = new com.tencent.mm.autogen.events.ApduEngineFuncEvent
            r3.<init>()
            com.tencent.mm.autogen.events.ApduEngineFuncEvent$a r5 = r3.f107356d
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r6 = r1.f119554e
            java.lang.Object r6 = r6.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r6 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r6
            androidx.appcompat.app.AppCompatActivity r6 = r6.getContext()
            r5.f107359b = r6
            com.tencent.mm.autogen.events.ApduEngineFuncEvent$a r5 = r3.f107356d
            r5.f107358a = r0
            r5 = 4003(0xfa3, float:5.61E-42)
            if (r5 != r0) goto L_0x10e9
            java.lang.String r0 = "apdu"
            java.lang.String r0 = r2.getString(r0)
            com.tencent.mm.autogen.events.ApduEngineFuncEvent$a r2 = r3.f107356d
            r2.f107360c = r0
            goto L_0x1109
        L_0x10e9:
            r5 = 4004(0xfa4, float:5.611E-42)
            if (r5 != r0) goto L_0x1109
            java.lang.String r0 = "apdus"
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r5 = "breakIfFail"
            r6 = 1
            boolean r5 = r2.getBoolean(r5, r6)
            java.lang.String r6 = "breakIfTrue"
            r7 = 0
            boolean r2 = r2.getBoolean(r6, r7)
            com.tencent.mm.autogen.events.ApduEngineFuncEvent$a r6 = r3.f107356d
            r6.f107360c = r0
            r6.f107361d = r5
            r6.f107362e = r2
        L_0x1109:
            com.tencent.mm.plugin.webview.ui.tools.q1$n0 r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$n0
            r0.<init>(r1, r4, r3)
            r3.callback = r0
            r3.publish()
            goto L_0x1610
        L_0x1115:
            r2 = 0
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x1129
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.core.y r10 = r0.f118513b1
            goto L_0x112a
        L_0x1129:
            r10 = r2
        L_0x112a:
            if (r10 != 0) goto L_0x1133
            java.lang.String r0 = "GetA8key req params, controller is nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x1610
        L_0x1133:
            d93.c r0 = r10.mo67816n1()
            int r2 = r0.mo70847m()
            java.lang.String r3 = "key_get_a8key_req_params_req_id"
            r4.putInt(r3, r2)
            int r2 = r0.mo70843i()
            java.lang.String r3 = "key_get_a8key_req_params_msg_type"
            r4.putInt(r3, r2)
            int r2 = r0.mo70837b()
            java.lang.String r3 = "key_get_a8key_req_params_app_msg_type"
            r4.putInt(r3, r2)
            te3.zt1 r2 = r0.f122707x
            if (r2 == 0) goto L_0x1159
            int r2 = r2.f146213d
            goto L_0x115a
        L_0x1159:
            r2 = 0
        L_0x115a:
            java.lang.String r3 = "key_get_a8key_req_params_ctrl_mode"
            r4.putInt(r3, r2)
            int r2 = r0.mo70846l()
            java.lang.String r3 = "key_get_a8key_req_params_scene"
            r4.putInt(r3, r2)
            java.lang.String r2 = r0.mo70842h()
            java.lang.String r3 = "key_get_a8key_req_params_msg_id"
            r4.putString(r3, r2)
            java.lang.String r2 = r0.mo70849o()
            java.lang.String r3 = "key_get_a8key_req_params_username"
            r4.putString(r3, r2)
            java.lang.String r0 = r0.mo70844j()
            java.lang.String r2 = "key_get_a8key_req_params_msg_username"
            r4.putString(r2, r0)
            boolean r0 = r10.mo67824v1()
            java.lang.String r2 = "key_get_a8key_req_params_has_touched"
            r4.putBoolean(r2, r0)
            android.graphics.Point r0 = r10.mo67820r1()
            java.lang.String r2 = "key_get_a8key_req_params_touch_position"
            r4.putParcelable(r2, r0)
            long r2 = r10.mo67821s1()
            java.lang.String r0 = "key_get_a8key_req_params_touch_timestamp"
            r4.putLong(r0, r2)
            goto L_0x1610
        L_0x11a0:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            we0.a r0 = r0.f118456D
            if (r0 == 0) goto L_0x11b9
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            we0.a r0 = r0.f118456D
            r0.disable()
        L_0x11b9:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.String r3 = "screen_orientation"
            r6 = -1
            int r2 = r2.getInt(r3, r6)
            r0.f118447A = r2
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            int r0 = r0.f118447A
            r2 = 1001(0x3e9, float:1.403E-42)
            if (r0 != r2) goto L_0x1202
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            r2 = 0
            r0.f118447A = r2
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            we0.a r0 = r0.f118456D
            if (r0 == 0) goto L_0x1239
            java.lang.String r0 = "OrientationListener, start listen orientation change"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            we0.a r0 = r0.f118456D
            r0.enable()
            goto L_0x1239
        L_0x1202:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            int r0 = r0.f118447A
            r2 = 1002(0x3ea, float:1.404E-42)
            if (r0 != r2) goto L_0x1239
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            r2 = 1
            r0.f118447A = r2
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            we0.a r0 = r0.f118456D
            if (r0 == 0) goto L_0x1239
            java.lang.String r0 = "OrientationListener, start listen orientation change"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            we0.a r0 = r0.f118456D
            r0.enable()
        L_0x1239:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            r0.setMMOrientation()
            goto L_0x1610
        L_0x1246:
            r17 = r15
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.game.GameWebViewUI
            if (r0 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.game.GameWebViewUI) r0
            java.lang.String r2 = r0.mo6901n0()
            r3 = r16
            r4.putString(r3, r2)
            java.lang.String r2 = r0.mo68606I9()
            java.lang.String r3 = "page_key"
            r4.putString(r3, r2)
            k00.c r0 = r0.mo68607J9()
            if (r0 == 0) goto L_0x1610
            kb3.m r0 = (kb3.C46677m) r0
            java.lang.String r2 = r0.mo71924c()
            java.lang.String r3 = "comm_js_version"
            r4.putString(r3, r2)
            com.tencent.mm.plugin.wepkg.model.WepkgVersion r2 = r0.f125653f
            if (r2 == 0) goto L_0x1284
            java.lang.String r15 = r2.f120653f
            goto L_0x1286
        L_0x1284:
            r15 = r17
        L_0x1286:
            java.lang.String r2 = "wepkg_version"
            r4.putString(r2, r15)
            boolean r0 = r0.mo71925d()
            java.lang.String r2 = "is_used_wepkg"
            r4.putBoolean(r2, r0)
            goto L_0x1610
        L_0x1297:
            r3 = r16
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.String r0 = r0.getCurrentURL()
            java.lang.String r2 = "current_url"
            r4.putString(r2, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.String r0 = r0.mo6901n0()
            r4.putString(r3, r0)
            goto L_0x1610
        L_0x12bb:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            java.lang.String r2 = "isFullScreen"
            if (r0 == 0) goto L_0x12e5
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x12d4
            goto L_0x12e5
        L_0x12d4:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            boolean r0 = r0.mo68234F8()
            r4.putBoolean(r2, r0)
            goto L_0x1610
        L_0x12e5:
            r3 = 0
            r4.putBoolean(r2, r3)
            goto L_0x1610
        L_0x12eb:
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r2.setClassLoader(r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r3 = "open_ui_with_webview_ui_plugin_name"
            java.lang.String r3 = r2.getString(r3)
            java.lang.String r5 = "open_ui_with_webview_ui_plugin_entry"
            java.lang.String r5 = r2.getString(r5)
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r7 = "open_ui_with_webview_ui_extras"
            android.os.Bundle r2 = r2.getBundle(r7)
            android.content.Intent r2 = r6.putExtras(r2)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r6 = r1.f119554e
            java.lang.Object r6 = r6.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r6 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r6
            java.lang.String r6 = r6.f118476N
            android.content.Intent r2 = r2.putExtra(r11, r6)
            java.lang.String r6 = "key_search_icon_and_hint_fix_default"
            r7 = 1
            android.content.Intent r2 = r2.putExtra(r6, r7)
            ke3.C88144b.m109790h(r0, r3, r5, r2)
            goto L_0x1610
        L_0x1331:
            r7 = 1
            int r0 = r29.mo7027F7()
            r4.putInt(r13, r0)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "Key value: getA8KeyScene(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r2)
            goto L_0x1610
        L_0x1349:
            int r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI.f118443E2
            java.lang.String r2 = "web_page_count"
            r4.putInt(r2, r0)
            goto L_0x1610
        L_0x1353:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            r0.mo68295m9(r2)
            goto L_0x1610
        L_0x1360:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            boolean r0 = r0.f118499W
            java.lang.String r2 = "from_shortcut"
            r4.putBoolean(r2, r0)
            goto L_0x1610
        L_0x1371:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x1389
            goto L_0x1610
        L_0x1389:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            int r0 = r0.mo68320x9()
            java.lang.String r2 = "height"
            r4.putInt(r2, r0)
            goto L_0x1610
        L_0x139c:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.String r0 = r0.f118479P
            java.lang.String r2 = "KSessionId"
            r4.putString(r2, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.String r0 = r0.mo68293l8()
            java.lang.String r2 = "KUserAgent"
            r4.putString(r2, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.String r0 = r0.getCurrentURL()
            java.lang.String r2 = "KUrl"
            r4.putString(r2, r0)
            android.content.Intent r0 = r29.mo68777j()
            java.lang.String r0 = r0.getStringExtra(r14)
            int r0 = r1.mo68778k(r0)
            r2 = 7
            if (r0 == r2) goto L_0x13e0
            r2 = 56
            if (r0 != r2) goto L_0x1610
        L_0x13e0:
            android.content.Intent r0 = r29.mo68777j()
            java.lang.String r0 = r0.getStringExtra(r14)
            r4.putString(r14, r0)
            goto L_0x1610
        L_0x13ed:
            android.content.Intent r0 = r29.mo68777j()
            r2 = -1
            int r0 = r0.getIntExtra(r12, r2)
            r4.putInt(r12, r0)
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            android.content.Intent r2 = r29.mo68777j()
            r3 = 0
            int r2 = r2.getIntExtra(r12, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r3] = r2
            java.lang.String r2 = "Key value: Scene(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            goto L_0x1610
        L_0x1412:
            android.content.Intent r0 = r29.mo68777j()
            java.lang.String r2 = "pay_channel"
            r3 = -1
            int r0 = r0.getIntExtra(r2, r3)
            r4.putInt(r2, r0)
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            android.content.Intent r6 = r29.mo68777j()
            int r2 = r6.getIntExtra(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "key value: pay channel(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            goto L_0x1610
        L_0x1439:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            java.lang.String r0 = r0.f118476N
            r4.putString(r11, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1
            if (r0 == 0) goto L_0x1483
            d93.c r2 = r0.mo67816n1()
            int r2 = r2.mo70847m()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "KPublisherReqId"
            r4.putString(r3, r2)
            d93.c r2 = r0.mo67816n1()
            java.lang.String r2 = r2.mo70842h()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "serverMsgID"
            r4.putString(r3, r2)
            d93.c r0 = r0.mo67816n1()
            java.lang.String r0 = r0.mo70849o()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.putString(r14, r0)
        L_0x1483:
            android.content.Intent r0 = r29.mo68777j()
            if (r0 == 0) goto L_0x1610
            java.lang.String r2 = "sns_local_id"
            java.lang.String r3 = r0.getStringExtra(r2)
            r4.putString(r2, r3)
            android.content.Intent r2 = r29.mo68777j()
            java.lang.String r2 = r2.getStringExtra(r14)
            int r2 = r1.mo68778k(r2)
            java.lang.String r3 = "preChatName"
            java.lang.String r5 = r0.getStringExtra(r3)
            r4.putString(r3, r5)
            java.lang.String r3 = "preMsgIndex"
            r5 = 0
            int r6 = r0.getIntExtra(r3, r5)
            r4.putInt(r3, r6)
            java.lang.String r3 = "prePublishId"
            java.lang.String r3 = r0.getStringExtra(r3)
            java.lang.String r5 = "prePublishId"
            r4.putString(r5, r3)
            java.lang.String r3 = "preUsername"
            java.lang.String r3 = r0.getStringExtra(r3)
            java.lang.String r5 = "preUsername"
            r4.putString(r5, r3)
            java.lang.String r3 = "getA8KeyScene"
            r4.putInt(r3, r2)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            java.lang.String r2 = r2.mo68289j8()
            java.lang.String r3 = "referUrl"
            r4.putString(r3, r2)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            java.lang.String r2 = r2.getCurrentURL()
            r4.putString(r7, r2)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            java.lang.String r2 = r2.mo6901n0()
            java.lang.String r3 = "rawUrl"
            r4.putString(r3, r2)
            android.content.Intent r2 = r29.mo68777j()
            java.lang.String r3 = "preChatTYPE"
            r5 = 0
            int r2 = r2.getIntExtra(r3, r5)
            java.lang.String r3 = "preChatTYPE"
            r4.putInt(r3, r2)
            java.lang.String r0 = r0.getStringExtra(r8)
            r4.putString(r8, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            int r0 = r0.mo68267Y7()
            java.lang.String r2 = "webViewId"
            r4.putInt(r2, r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            r0.mo68297n9(r4)
            goto L_0x1610
        L_0x1533:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1
            if (r0 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1
            boolean r0 = r0.mo67744q0()
            java.lang.String r2 = "k_text_url_share"
            r4.putBoolean(r2, r0)
            goto L_0x1610
        L_0x155c:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1
            if (r0 == 0) goto L_0x1610
            java.lang.String r0 = r2.getString(r9)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            com.tencent.mm.plugin.webview.core.y r2 = r2.f118513b1
            d93.c r2 = r2.mo67816n1()
            java.lang.String r0 = r2.mo70848n(r0)
            java.lang.String r2 = "k_share_url"
            r4.putString(r2, r0)
            goto L_0x1610
        L_0x158d:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.game.GameWebViewUI
            if (r0 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.game.GameWebViewUI) r0
            r0.mo68609L9()
            goto L_0x1610
        L_0x15a3:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.game.GameWebViewUI
            if (r0 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.game.GameWebViewUI) r0
            r0.mo68608K9()
            goto L_0x1610
        L_0x15b9:
            java.lang.String r0 = "add_shortcut_status"
            boolean r0 = r2.getBoolean(r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            t83.l r2 = r2.f118508Z
            if (r2 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r1.f119554e
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r2
            t83.l r2 = r2.f118508Z
            r2.mo73205B(r0)
            goto L_0x1610
        L_0x15d9:
            r29.mo68779l(r30, r31)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x1610
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x15f3
            goto L_0x1610
        L_0x15f3:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r1.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            r0.mo68315v8(r2)
            goto L_0x1610
        L_0x15ff:
            com.tencent.mm.plugin.webview.ui.tools.q1$b1 r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$b1
            r0.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x1610
        L_0x1608:
            com.tencent.mm.plugin.webview.ui.tools.q1$a1 r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$a1
            r0.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
        L_0x1610:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.C44132q1.mo7031V5(int, android.os.Bundle):android.os.Bundle");
    }

    /* renamed from: XB */
    public void mo7032XB(int i, Bundle bundle) {
        if (this.f119554e.get() != null && !this.f119554e.get().isFinishing()) {
            MMHandlerThread.postToMainThread(new C44166l0(i, bundle));
        }
    }

    public boolean Zu0(String str, String str2, Bundle bundle, boolean z) {
        if (this.f119554e.get() == null || this.f119554e.get().isFinishing() || this.f119554e.get().f118508Z == null) {
            return false;
        }
        C44146e0 e0Var = new C44146e0(str, str2, bundle, z);
        if (MMHandlerThread.isMainThread()) {
            e0Var.run();
            return false;
        }
        MMHandlerThread.postToMainThread(e0Var);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x016c A[LOOP:0: B:48:0x016c->B:51:0x017c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(int r17, android.os.Bundle r18) {
        /*
            r16 = this;
            r12 = r16
            r0 = r17
            r6 = r18
            java.lang.String r1 = "__webComptList"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "callback, actionCode = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.WebViewStubCallbackAIDLStub"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r2 = r12.f119554e
            java.lang.Object r2 = r2.get()
            r4 = r2
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r4
            r2 = 0
            if (r4 == 0) goto L_0x0552
            boolean r5 = r4.isFinishing()
            if (r5 == 0) goto L_0x0032
            goto L_0x0552
        L_0x0032:
            t83.l r7 = r4.f118508Z
            d93.h r9 = r4.f118491T0
            java.lang.String r5 = "err_msg"
            java.lang.String r8 = ""
            java.lang.String r10 = "localId"
            java.lang.String r11 = "webview_jssdk_file_item_progreess"
            java.lang.String r13 = "webview_jssdk_file_item_local_id"
            r14 = 13
            r15 = 1
            if (r0 == r14) goto L_0x053c
            r14 = 90
            if (r0 == r14) goto L_0x052c
            r14 = 161(0xa1, float:2.26E-43)
            if (r0 == r14) goto L_0x0522
            r14 = 2100(0x834, float:2.943E-42)
            if (r0 == r14) goto L_0x04e4
            r14 = 4007(0xfa7, float:5.615E-42)
            if (r0 == r14) goto L_0x04d5
            switch(r0) {
                case 26: goto L_0x04d2;
                case 27: goto L_0x04d2;
                case 28: goto L_0x04d2;
                case 29: goto L_0x04d2;
                case 30: goto L_0x04d2;
                case 31: goto L_0x04d2;
                case 32: goto L_0x04d2;
                case 33: goto L_0x04d2;
                case 34: goto L_0x04d2;
                case 35: goto L_0x04d2;
                case 36: goto L_0x04d2;
                case 37: goto L_0x04d2;
                case 38: goto L_0x04d2;
                case 39: goto L_0x04d2;
                case 40: goto L_0x04d2;
                case 41: goto L_0x04d2;
                case 42: goto L_0x04d2;
                case 43: goto L_0x04d2;
                case 44: goto L_0x04d2;
                case 45: goto L_0x04d2;
                case 46: goto L_0x04d2;
                case 47: goto L_0x04c4;
                case 48: goto L_0x0434;
                default: goto L_0x005a;
            }
        L_0x005a:
            switch(r0) {
                case 1006: goto L_0x0420;
                case 1007: goto L_0x03f5;
                case 1008: goto L_0x03e3;
                default: goto L_0x005d;
            }
        L_0x005d:
            switch(r0) {
                case 1010: goto L_0x03d1;
                case 1011: goto L_0x03bf;
                case 1012: goto L_0x03ad;
                case 1013: goto L_0x0357;
                default: goto L_0x0060;
            }
        L_0x0060:
            switch(r0) {
                case 2002: goto L_0x0338;
                case 2003: goto L_0x0321;
                case 2004: goto L_0x030a;
                case 2005: goto L_0x02f3;
                case 2006: goto L_0x02dc;
                case 2007: goto L_0x02d2;
                case 2008: goto L_0x02b3;
                case 2009: goto L_0x02a9;
                case 2010: goto L_0x0292;
                case 2011: goto L_0x027b;
                default: goto L_0x0063;
            }
        L_0x0063:
            switch(r0) {
                case 80001: goto L_0x0276;
                case 80002: goto L_0x0276;
                default: goto L_0x0066;
            }
        L_0x0066:
            switch(r0) {
                case 100001: goto L_0x0522;
                case 100002: goto L_0x0522;
                default: goto L_0x0069;
            }
        L_0x0069:
            switch(r0) {
                case 121000: goto L_0x0256;
                case 121001: goto L_0x0236;
                case 121002: goto L_0x0216;
                case 121003: goto L_0x0208;
                default: goto L_0x006c;
            }
        L_0x006c:
            switch(r0) {
                case 200000: goto L_0x0522;
                case 200001: goto L_0x0522;
                case 200002: goto L_0x0522;
                case 200003: goto L_0x0522;
                default: goto L_0x006f;
            }
        L_0x006f:
            java.lang.String r1 = "exdevice_device_id"
            switch(r0) {
                case 15: goto L_0x00de;
                case 16: goto L_0x00be;
                case 17: goto L_0x00a5;
                case 18: goto L_0x0095;
                default: goto L_0x0074;
            }
        L_0x0074:
            switch(r0) {
                case 60: goto L_0x0522;
                case 61: goto L_0x0522;
                case 62: goto L_0x0522;
                default: goto L_0x0077;
            }
        L_0x0077:
            switch(r0) {
                case 70: goto L_0x0127;
                case 71: goto L_0x0106;
                case 72: goto L_0x0106;
                default: goto L_0x007a;
            }
        L_0x007a:
            switch(r0) {
                case 119: goto L_0x0522;
                case 120: goto L_0x0522;
                case 121: goto L_0x0522;
                case 122: goto L_0x0522;
                case 123: goto L_0x0522;
                case 124: goto L_0x0522;
                case 125: goto L_0x0522;
                case 126: goto L_0x0522;
                case 127: goto L_0x0522;
                case 128: goto L_0x0522;
                default: goto L_0x007d;
            }
        L_0x007d:
            switch(r0) {
                case 133: goto L_0x0522;
                case 134: goto L_0x0522;
                case 135: goto L_0x0522;
                case 136: goto L_0x0522;
                case 137: goto L_0x0522;
                case 138: goto L_0x0522;
                default: goto L_0x0080;
            }
        L_0x0080:
            switch(r0) {
                case 142: goto L_0x0522;
                case 143: goto L_0x0522;
                case 144: goto L_0x0522;
                case 145: goto L_0x0522;
                default: goto L_0x0083;
            }
        L_0x0083:
            switch(r0) {
                case 147: goto L_0x0522;
                case 148: goto L_0x0522;
                case 149: goto L_0x0522;
                case 150: goto L_0x0522;
                case 151: goto L_0x0522;
                case 152: goto L_0x0522;
                case 153: goto L_0x0522;
                case 154: goto L_0x0522;
                case 155: goto L_0x0522;
                case 156: goto L_0x0522;
                default: goto L_0x0086;
            }
        L_0x0086:
            java.lang.String r2 = "game_haowan_publish_post_id"
            switch(r0) {
                case 254: goto L_0x0199;
                case 255: goto L_0x0180;
                case 256: goto L_0x0148;
                default: goto L_0x008b;
            }
        L_0x008b:
            switch(r0) {
                case 1001: goto L_0x01fd;
                case 1002: goto L_0x01eb;
                case 1003: goto L_0x01d9;
                case 1004: goto L_0x01b2;
                default: goto L_0x008e;
            }
        L_0x008e:
            java.lang.String r0 = "undefine action code!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            goto L_0x04d2
        L_0x0095:
            java.lang.String r0 = "exdevice_bt_state"
            boolean r0 = r6.getBoolean(r0)
            com.tencent.mm.plugin.webview.ui.tools.q1$q r1 = new com.tencent.mm.plugin.webview.ui.tools.q1$q
            r1.<init>(r12, r4, r7, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            goto L_0x04d2
        L_0x00a5:
            java.lang.String r5 = r6.getString(r1)
            java.lang.String r0 = "exdevice_is_bound"
            boolean r6 = r6.getBoolean(r0)
            com.tencent.mm.plugin.webview.ui.tools.q1$p r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$p
            r1 = r0
            r2 = r16
            r3 = r4
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x00be:
            java.lang.String r5 = r6.getString(r1)
            java.lang.String r0 = "exdevice_brand_name"
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r1 = "exdevice_data"
            byte[] r6 = r6.getByteArray(r1)
            com.tencent.mm.plugin.webview.ui.tools.q1$o r8 = new com.tencent.mm.plugin.webview.ui.tools.q1$o
            r1 = r8
            r2 = r16
            r3 = r4
            r4 = r7
            r7 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r8)
            goto L_0x04d2
        L_0x00de:
            java.lang.String r5 = r6.getString(r1)
            java.lang.String r0 = "exdevice_is_complete"
            boolean r0 = r6.getBoolean(r0)
            java.lang.String r1 = "exdevice_broadcast_data"
            byte[] r8 = r6.getByteArray(r1)
            java.lang.String r1 = "exdevice_is_lan_device"
            boolean r10 = r6.getBoolean(r1)
            com.tencent.mm.plugin.webview.ui.tools.q1$n r11 = new com.tencent.mm.plugin.webview.ui.tools.q1$n
            r1 = r11
            r2 = r16
            r3 = r4
            r4 = r7
            r6 = r8
            r7 = r0
            r8 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r11)
            goto L_0x04d2
        L_0x0106:
            com.tencent.mm.plugin.webview.ui.tools.q1$u r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$u
            r0.<init>(r12, r4, r6)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            java.lang.Thread r2 = r2.getThread()
            if (r1 != r2) goto L_0x011e
            r0.run()
            goto L_0x04d2
        L_0x011e:
            zt3.t r1 = zt3.C119157j.f356862d
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183875f(r0)
            goto L_0x04d2
        L_0x0127:
            java.lang.String r0 = "service_click_tid"
            java.lang.String r0 = r6.getString(r0)
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r2] = r0
            java.lang.String r2 = "on service click, update tid = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r1)
            r4.f118471K1 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r4.f118473L1 = r0
            com.tencent.mm.plugin.webview.ui.tools.q1$w r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$w
            r0.<init>(r12, r4)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x0148:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r12.f119554e
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x04d2
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r12.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1
            if (r0 == 0) goto L_0x04d2
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r12.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1
            java.util.concurrent.ConcurrentLinkedDeque<com.tencent.mm.plugin.webview.core.b0> r0 = r0.f117545S
            java.util.Iterator r0 = r0.iterator()
        L_0x016c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04d2
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.webview.core.b0 r1 = (com.tencent.p014mm.plugin.webview.core.C43505b0) r1
            boolean r1 = r1.mo67779i()
            if (r1 == 0) goto L_0x016c
            goto L_0x04d2
        L_0x0180:
            java.lang.String r5 = r6.getString(r2)
            java.lang.String r0 = "game_haowan_publish_progress"
            float r6 = r6.getFloat(r0)
            com.tencent.mm.plugin.webview.ui.tools.q1$y r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$y
            r1 = r0
            r2 = r16
            r3 = r4
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x0199:
            java.lang.String r5 = r6.getString(r2)
            java.lang.String r0 = "game_haowan_publish_retcode"
            int r6 = r6.getInt(r0)
            com.tencent.mm.plugin.webview.ui.tools.q1$x r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$x
            r1 = r0
            r2 = r16
            r3 = r4
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x01b2:
            java.lang.String r0 = r6.getString(r1)
            java.lang.String r1 = "exdevice_on_state_change_state"
            int r8 = r6.getInt(r1)
            java.lang.String r1 = "exdevice_inner_call"
            boolean r1 = r6.getBoolean(r1)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            com.tencent.mm.plugin.webview.ui.tools.q1$i1 r11 = new com.tencent.mm.plugin.webview.ui.tools.q1$i1
            r1 = r11
            r2 = r16
            r3 = r4
            r4 = r7
            r5 = r9
            r6 = r0
            r7 = r8
            r8 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r11)
            goto L_0x04d2
        L_0x01d9:
            com.tencent.mm.plugin.webview.ui.tools.q1$v r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$v
            r1 = r0
            r2 = r16
            r3 = r4
            r4 = r7
            r5 = r9
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x01eb:
            com.tencent.mm.plugin.webview.ui.tools.q1$k r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$k
            r1 = r0
            r2 = r16
            r3 = r4
            r4 = r7
            r5 = r9
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x01fd:
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x04d2
            r4.finish()
            goto L_0x04d2
        L_0x0208:
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.webview.ui.tools.q1$c0 r1 = new com.tencent.mm.plugin.webview.ui.tools.q1$c0
            r1.<init>(r12, r4, r6)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r1)
            goto L_0x04d2
        L_0x0216:
            f40.j r0 = f40.C86709a0.m107531m()
            j40.a r0 = r0.mo58407a()
            j40.b r0 = (j40.C87829b) r0
            boolean r0 = r0.mo71804b()
            if (r0 == 0) goto L_0x0228
            goto L_0x04d2
        L_0x0228:
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.webview.ui.tools.q1$b0 r1 = new com.tencent.mm.plugin.webview.ui.tools.q1$b0
            r1.<init>(r12, r4, r6)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r1)
            goto L_0x04d2
        L_0x0236:
            f40.j r0 = f40.C86709a0.m107531m()
            j40.a r0 = r0.mo58407a()
            j40.b r0 = (j40.C87829b) r0
            boolean r0 = r0.mo71804b()
            if (r0 == 0) goto L_0x0248
            goto L_0x04d2
        L_0x0248:
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.webview.ui.tools.q1$a0 r1 = new com.tencent.mm.plugin.webview.ui.tools.q1$a0
            r1.<init>(r12, r4, r6)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r1)
            goto L_0x04d2
        L_0x0256:
            f40.j r0 = f40.C86709a0.m107531m()
            j40.a r0 = r0.mo58407a()
            j40.b r0 = (j40.C87829b) r0
            boolean r0 = r0.mo71804b()
            if (r0 == 0) goto L_0x0268
            goto L_0x04d2
        L_0x0268:
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.webview.ui.tools.q1$z r1 = new com.tencent.mm.plugin.webview.ui.tools.q1$z
            r1.<init>(r12, r4, r6)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r1)
            goto L_0x04d2
        L_0x0276:
            r4.mo68312t8(r0, r6)
            goto L_0x04d2
        L_0x027b:
            java.lang.String r5 = r6.getString(r13)
            int r6 = r6.getInt(r11)
            com.tencent.mm.plugin.webview.ui.tools.q1$j1 r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$j1
            r1 = r0
            r2 = r16
            r3 = r4
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x0292:
            java.lang.String r5 = r6.getString(r13)
            int r6 = r6.getInt(r11)
            com.tencent.mm.plugin.webview.ui.tools.q1$f r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$f
            r1 = r0
            r2 = r16
            r3 = r4
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x02a9:
            com.tencent.mm.plugin.webview.ui.tools.q1$l r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$l
            r0.<init>(r12, r4)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x02b3:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = r6.getString(r10)
            r0.put(r10, r1)
            java.lang.String r1 = "recordResult"
            java.lang.String r1 = r6.getString(r1)
            r0.put(r5, r1)
            com.tencent.mm.plugin.webview.ui.tools.q1$j r1 = new com.tencent.mm.plugin.webview.ui.tools.q1$j
            r1.<init>(r12, r4, r7, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            goto L_0x04d2
        L_0x02d2:
            com.tencent.mm.plugin.webview.ui.tools.q1$i r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$i
            r0.<init>(r12, r4)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x02dc:
            java.lang.String r5 = r6.getString(r13)
            int r6 = r6.getInt(r11)
            com.tencent.mm.plugin.webview.ui.tools.q1$e r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$e
            r1 = r0
            r2 = r16
            r3 = r4
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x02f3:
            java.lang.String r5 = r6.getString(r13)
            int r6 = r6.getInt(r11)
            com.tencent.mm.plugin.webview.ui.tools.q1$d r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$d
            r1 = r0
            r2 = r16
            r3 = r4
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x030a:
            java.lang.String r5 = r6.getString(r13)
            int r6 = r6.getInt(r11)
            com.tencent.mm.plugin.webview.ui.tools.q1$c r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$c
            r1 = r0
            r2 = r16
            r3 = r4
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x0321:
            java.lang.String r5 = r6.getString(r13)
            int r6 = r6.getInt(r11)
            com.tencent.mm.plugin.webview.ui.tools.q1$a r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$a
            r1 = r0
            r2 = r16
            r3 = r4
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x0338:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "playResult"
            java.lang.String r1 = r6.getString(r1)
            r0.put(r5, r1)
            java.lang.String r1 = r6.getString(r10)
            r0.put(r10, r1)
            com.tencent.mm.plugin.webview.ui.tools.q1$g r1 = new com.tencent.mm.plugin.webview.ui.tools.q1$g
            r1.<init>(r12, r4, r7, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            goto L_0x04d2
        L_0x0357:
            if (r7 == 0) goto L_0x04d2
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ IOException -> 0x03a3 }
            r0.<init>()     // Catch:{ IOException -> 0x03a3 }
            java.lang.String r4 = "__appId"
            java.lang.String r4 = r6.getString(r4)     // Catch:{ IOException -> 0x03a3 }
            java.lang.String r5 = "__url"
            java.lang.String r5 = r6.getString(r5)     // Catch:{ IOException -> 0x03a3 }
            boolean r8 = r6.containsKey(r1)     // Catch:{ IOException -> 0x03a3 }
            if (r8 == 0) goto L_0x0394
            java.util.ArrayList r1 = r6.getStringArrayList(r1)     // Catch:{ IOException -> 0x03a3 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x03a3 }
        L_0x0378:
            boolean r8 = r1.hasNext()     // Catch:{ IOException -> 0x03a3 }
            if (r8 == 0) goto L_0x0394
            java.lang.Object r8 = r1.next()     // Catch:{ IOException -> 0x03a3 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x03a3 }
            te3.bk2 r9 = new te3.bk2     // Catch:{ IOException -> 0x03a3 }
            r9.<init>()     // Catch:{ IOException -> 0x03a3 }
            byte[] r8 = r6.getByteArray(r8)     // Catch:{ IOException -> 0x03a3 }
            r9.parseFrom(r8)     // Catch:{ IOException -> 0x03a3 }
            r0.add(r9)     // Catch:{ IOException -> 0x03a3 }
            goto L_0x0378
        L_0x0394:
            com.tencent.mm.plugin.webview.webcompt.z r1 = r7.mo73268z()     // Catch:{ IOException -> 0x03a3 }
            if (r1 == 0) goto L_0x04d2
            com.tencent.mm.plugin.webview.webcompt.z r1 = r7.mo73268z()     // Catch:{ IOException -> 0x03a3 }
            r1.mo69226b(r4, r5, r0)     // Catch:{ IOException -> 0x03a3 }
            goto L_0x04d2
        L_0x03a3:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "parse webCompt"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r1)
            goto L_0x04d2
        L_0x03ad:
            com.tencent.mm.plugin.webview.ui.tools.q1$g1 r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$g1
            r1 = r0
            r2 = r16
            r3 = r4
            r4 = r7
            r5 = r9
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x03bf:
            com.tencent.mm.plugin.webview.ui.tools.q1$c1 r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$c1
            r1 = r0
            r2 = r16
            r3 = r4
            r4 = r7
            r5 = r9
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x03d1:
            com.tencent.mm.plugin.webview.ui.tools.q1$r0 r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$r0
            r1 = r0
            r2 = r16
            r3 = r4
            r4 = r7
            r5 = r9
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x03e3:
            com.tencent.mm.plugin.webview.ui.tools.q1$g0 r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$g0
            r1 = r0
            r2 = r16
            r3 = r4
            r4 = r7
            r5 = r9
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x03f5:
            java.lang.String r0 = "download_manager_downloadid"
            long r10 = r6.getLong(r0)
            java.lang.String r0 = "download_manager_progress"
            int r0 = r6.getInt(r0)
            java.lang.String r1 = "download_manager_progress_float"
            float r13 = r6.getFloat(r1)
            java.lang.String r1 = "download_manager_appid"
            java.lang.String r6 = r6.getString(r1, r8)
            com.tencent.mm.plugin.webview.ui.tools.q1$h1 r14 = new com.tencent.mm.plugin.webview.ui.tools.q1$h1
            r1 = r14
            r2 = r16
            r3 = r4
            r4 = r7
            r5 = r9
            r7 = r10
            r9 = r0
            r10 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r14)
            goto L_0x04d2
        L_0x0420:
            if (r7 == 0) goto L_0x04d2
            com.tencent.mm.plugin.webview.ui.tools.q1$m r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$m
            r1 = r0
            r2 = r16
            r3 = r4
            r4 = r18
            r5 = r9
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x0434:
            java.lang.String r0 = "msgIds"
            java.lang.String[] r1 = r6.getStringArray(r0)
            java.lang.String r0 = "contents"
            java.lang.String[] r5 = r6.getStringArray(r0)
            java.lang.String r0 = "senders"
            java.lang.String[] r8 = r6.getStringArray(r0)
            java.lang.String r0 = "msgTypes"
            int[] r9 = r6.getIntArray(r0)
            java.lang.String r0 = "msgTimes"
            int[] r10 = r6.getIntArray(r0)
            java.lang.String r11 = "msgSignature"
            java.lang.String[] r6 = r6.getStringArray(r11)
            org.json.JSONArray r13 = new org.json.JSONArray
            r13.<init>()
            if (r1 != 0) goto L_0x0461
            r14 = 0
            goto L_0x0463
        L_0x0461:
            int r0 = r1.length
            r14 = r0
        L_0x0463:
            if (r2 >= r14) goto L_0x04bb
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x049a }
            r0.<init>()     // Catch:{ JSONException -> 0x049a }
            java.lang.String r15 = "newMsgId"
            r17 = r14
            r14 = r1[r2]     // Catch:{ JSONException -> 0x0498 }
            r0.put(r15, r14)     // Catch:{ JSONException -> 0x0498 }
            java.lang.String r14 = "content"
            r15 = r5[r2]     // Catch:{ JSONException -> 0x0498 }
            r0.put(r14, r15)     // Catch:{ JSONException -> 0x0498 }
            java.lang.String r14 = "sender"
            r15 = r8[r2]     // Catch:{ JSONException -> 0x0498 }
            r0.put(r14, r15)     // Catch:{ JSONException -> 0x0498 }
            java.lang.String r14 = "msgType"
            r15 = r9[r2]     // Catch:{ JSONException -> 0x0498 }
            r0.put(r14, r15)     // Catch:{ JSONException -> 0x0498 }
            java.lang.String r14 = "msgTime"
            r15 = r10[r2]     // Catch:{ JSONException -> 0x0498 }
            r0.put(r14, r15)     // Catch:{ JSONException -> 0x0498 }
            r14 = r6[r2]     // Catch:{ JSONException -> 0x0498 }
            r0.put(r11, r14)     // Catch:{ JSONException -> 0x0498 }
            r13.put(r0)     // Catch:{ JSONException -> 0x0498 }
            goto L_0x04b5
        L_0x0498:
            r0 = move-exception
            goto L_0x049d
        L_0x049a:
            r0 = move-exception
            r17 = r14
        L_0x049d:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "GetMsgProofItems exception "
            r14.append(r15)
            java.lang.String r0 = r0.getMessage()
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x04b5:
            int r2 = r2 + 1
            r14 = r17
            r15 = 1
            goto L_0x0463
        L_0x04bb:
            com.tencent.mm.plugin.webview.ui.tools.q1$s r0 = new com.tencent.mm.plugin.webview.ui.tools.q1$s
            r0.<init>(r12, r4, r7, r13)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x04d2
        L_0x04c4:
            java.lang.String r0 = "exdevice_lan_state"
            boolean r0 = r6.getBoolean(r0)
            com.tencent.mm.plugin.webview.ui.tools.q1$r r1 = new com.tencent.mm.plugin.webview.ui.tools.q1$r
            r1.<init>(r12, r4, r7, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
        L_0x04d2:
            r1 = 1
            goto L_0x0551
        L_0x04d5:
            java.lang.String r0 = "nfc_key_on_touch_errcode"
            int r0 = r6.getInt(r0, r2)
            com.tencent.mm.plugin.webview.ui.tools.q1$h r1 = new com.tencent.mm.plugin.webview.ui.tools.q1$h
            r1.<init>(r12, r4, r7, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            goto L_0x04d2
        L_0x04e4:
            java.lang.String r0 = "background_audio_state_player_state"
            java.lang.String r5 = r6.getString(r0)
            java.lang.String r0 = "background_audio_state_player_duration"
            int r0 = r6.getInt(r0)
            java.lang.String r1 = "background_audio_state_player_src"
            java.lang.String r9 = r6.getString(r1)
            java.lang.String r1 = "background_audio_state_player_err_code"
            int r10 = r6.getInt(r1)
            java.lang.String r1 = "background_audio_state_player_err_msg"
            java.lang.String r11 = r6.getString(r1)
            java.lang.String r1 = "background_audio_state_player_src_id"
            java.lang.String r13 = r6.getString(r1)
            java.lang.String r1 = "background_audio_state_player_audio_id"
            java.lang.String r14 = r6.getString(r1, r8)
            com.tencent.mm.plugin.webview.ui.tools.q1$b r15 = new com.tencent.mm.plugin.webview.ui.tools.q1$b
            r1 = r15
            r2 = r16
            r3 = r4
            r4 = r7
            r6 = r0
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r13
            r11 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r15)
            goto L_0x04d2
        L_0x0522:
            boolean r1 = r4.isFinishing()
            if (r1 != 0) goto L_0x04d2
            r4.mo63388u8(r0, r6)
            goto L_0x04d2
        L_0x052c:
            java.lang.String r0 = "webview_network_type"
            java.lang.String r0 = r6.getString(r0)
            com.tencent.mm.plugin.webview.ui.tools.q1$t r1 = new com.tencent.mm.plugin.webview.ui.tools.q1$t
            r1.<init>(r12, r4, r7, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            goto L_0x04d2
        L_0x053c:
            if (r6 == 0) goto L_0x04d2
            com.tencent.mm.plugin.webview.stub.l r0 = r4.f118511a1
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r1 = "application_language"
            r6.putString(r1, r0)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$i0 r0 = new com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$i0
            r0.<init>(r6)
            r4.f118530h1 = r0
            goto L_0x04d2
        L_0x0551:
            return r1
        L_0x0552:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.C44132q1.callback(int, android.os.Bundle):boolean");
    }

    /* renamed from: d */
    public void mo7036d(Bundle bundle) {
        if (this.f119554e.get() != null && !this.f119554e.get().isFinishing()) {
            Log.m105924i("MicroMsg.WebViewStubCallbackAIDLStub", "IUIController, closeWindow");
            if (bundle != null) {
                Intent intent = new Intent();
                intent.putExtra("result_data", bundle);
                this.f119554e.get().setResult(-1, intent);
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C44158i0());
        }
    }

    /* renamed from: e */
    public final float mo68776e() {
        return this.f119554e.get().f118523f != null ? this.f119554e.get().f118523f.getMMDensity() : C88494d.m110349f();
    }

    /* renamed from: e3 */
    public String mo7037e3() {
        if (this.f119554e.get() == null || this.f119554e.get().isFinishing()) {
            return null;
        }
        return this.f119554e.get().f118513b1.f117522C;
    }

    /* renamed from: es */
    public void mo7061es(boolean z) {
        if (this.f119554e.get() != null && !this.f119554e.get().isFinishing()) {
            boolean booleanExtra = this.f119554e.get().getIntent().getBooleanExtra("forceHideShare", false);
            Log.m105919d("MicroMsg.WebViewStubCallbackAIDLStub", "[cpan] setShareBtnVisible:%d visible:%b  forceHideShare:%b", Long.valueOf(System.currentTimeMillis()), Boolean.valueOf(z), Boolean.valueOf(booleanExtra));
            MMHandlerThread.postToMainThread(new C44149f0(booleanExtra, z));
        }
    }

    public boolean fq0(C43787d dVar) {
        return true;
    }

    public String getCurrentUrl() {
        if (this.f119554e.get() == null || this.f119554e.get().isFinishing()) {
            return null;
        }
        return this.f119554e.get().getCurrentURL();
    }

    /* renamed from: hb */
    public boolean mo7040hb(int i) {
        MMHandlerThread.postToMainThread(new C44143d0(i));
        return true;
    }

    /* renamed from: j */
    public final Intent mo68777j() {
        return this.f119554e.get().getIntent();
    }

    /* renamed from: k */
    public final int mo68778k(String str) {
        return this.f119554e.get().mo68291k8(str);
    }

    /* renamed from: kn */
    public void mo7062kn(boolean z) {
        if (this.f119554e.get() != null && !this.f119554e.get().isFinishing()) {
            MMHandlerThread.postToMainThread(new C44155h0(z));
        }
    }

    /* renamed from: l */
    public final void mo68779l(int i, Bundle bundle) {
        C6160a aVar;
        if (bundle != null && this.f119554e.get() != null && this.f119554e.get().f118513b1 != null) {
            C43860c cVar = this.f119554e.get().f118513b1.f117678R0;
            C6160a aVar2 = new C6160a(i, bundle);
            synchronized (cVar) {
                if (cVar.f118780a) {
                    Iterator<T> it = cVar.f118782c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            aVar = null;
                            break;
                        }
                        aVar = (C6160a) it.next();
                        if (aVar.f22627a == aVar2.f22627a) {
                            break;
                        }
                    }
                    if (aVar != null) {
                        cVar.f118782c.remove(aVar);
                    }
                    cVar.f118782c.add(aVar2);
                }
            }
        }
    }

    /* renamed from: mC */
    public void mo7041mC(Bundle bundle) {
        if (this.f119554e.get() != null && !this.f119554e.get().isFinishing()) {
            Log.m105924i("MicroMsg.WebViewStubCallbackAIDLStub", "setCustomMenu");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("keys");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("titles");
            int size = stringArrayList.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                arrayList.add(new C47506e.C47508b(stringArrayList.get(i), stringArrayList2.get(i)));
            }
            if (stringArrayList.size() > 0) {
                String url = this.f119554e.get().f118523f.getUrl();
                if (this.f119554e.get().f118524f1.containsKey(url)) {
                    this.f119554e.get().f118524f1.remove(url);
                }
                this.f119554e.get().f118524f1.put(url, arrayList);
            }
        }
    }

    public Bundle q10(String str, String str2) {
        return C25549c.m33050a(false, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r0 = r3.f119554e.get().f118508Z;
     */
    /* renamed from: uP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7043uP() {
        /*
            r3 = this;
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r3.f119554e
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0039
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r3.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x0017
            goto L_0x0039
        L_0x0017:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r3.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            t83.l r0 = r0.f118508Z
            if (r0 == 0) goto L_0x0039
            java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r0 = r3.f119554e
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI) r0
            t83.l r0 = r0.f118508Z
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r0.f130001f
            if (r1 == 0) goto L_0x0039
            t83.y r2 = new t83.y
            r2.<init>(r0)
            r1.post(r2)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.C44132q1.mo7043uP():void");
    }

    /* renamed from: xf */
    public void mo7044xf(boolean z) {
        if (this.f119554e.get() != null && !this.f119554e.get().isFinishing()) {
            this.f119554e.get().mo68251P7(z);
        }
    }

    /* renamed from: xx */
    public void mo7045xx(String str, String str2) {
        MMHandlerThread.postToMainThread(new C44150f1(str, str2));
    }

    public String ya0() {
        if (this.f119554e.get() == null || this.f119554e.get().isFinishing()) {
            return null;
        }
        return this.f119554e.get().getIntent().getStringExtra("srcUsername");
    }
}
