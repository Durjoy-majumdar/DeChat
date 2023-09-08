package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.widget.LinearLayout;
import androidx.legacy.widget.Space;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsAdWebViewFileResultEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad.ScrollableLayout;
import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.p014mm.plugin.webview.stub.C43783b;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.JsResult;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewCallbackClient;
import d93.C45310h;
import di3.C86312j;
import e00.C45513i0;
import e00.C45520t;
import e00.C7580y;
import ea3.C45606x;
import h81.C32735h;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import ke3.C88144b;
import ko2.C46734a;
import nj3.C76879j;
import p447aw.C103918d;
import qs2.C101262e;
import qs2.C101271i0;
import t83.C13841a;
import vr2.C102236a0;
import vr2.C102260r;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e */
public class C43047e extends C95295z implements ScrollableLayout.C43159b, ScrollableLayout.C43160c {

    /* renamed from: A */
    public C43783b f116521A = new C43048a();

    /* renamed from: B */
    public boolean f116522B = false;

    /* renamed from: s */
    public MMWebView f116523s;

    /* renamed from: t */
    public ScrollableLayout f116524t;

    /* renamed from: u */
    public View f116525u;

    /* renamed from: v */
    public C45520t f116526v;

    /* renamed from: w */
    public C101262e f116527w;

    /* renamed from: x */
    public IListener<SnsAdWebViewFileResultEvent> f116528x;

    /* renamed from: y */
    public C43053e f116529y;

    /* renamed from: z */
    public boolean f116530z = false;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e$a */
    public class C43048a extends C43783b {

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e$a$a */
        public class C43049a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C7580y f116532d;

            /* renamed from: e */
            public final /* synthetic */ String f116533e;

            /* renamed from: f */
            public final /* synthetic */ String f116534f;

            /* renamed from: g */
            public final /* synthetic */ Bundle f116535g;

            /* renamed from: h */
            public final /* synthetic */ boolean f116536h;

            public C43049a(C43048a aVar, C7580y yVar, String str, String str2, Bundle bundle, boolean z) {
                this.f116532d = yVar;
                this.f116533e = str;
                this.f116534f = str2;
                this.f116535g = bundle;
                this.f116536h = z;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1$1");
                try {
                    C7580y yVar = this.f116532d;
                    if (yVar != null) {
                        yVar.mo8702g(this.f116533e, this.f116534f, C13841a.m13131a(this.f116535g), this.f116536h);
                    }
                } catch (Throwable unused) {
                    Log.m105920e("AdLandingFloatWebView", "In jsapi onHandleEnd method, it happens something unwanted!");
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1$1");
            }
        }

        public C43048a() {
        }

        /* renamed from: V5 */
        public Bundle mo7031V5(int i, Bundle bundle) {
            SnsMethodCalculate.markStartTimeMs("invokeAsResult", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
            Bundle bundle2 = new Bundle();
            Context context = C43047e.this.f276579d;
            if (!(i != 101 || context == null || bundle == null)) {
                try {
                    bundle.setClassLoader(context.getClassLoader());
                    Bundle bundle3 = bundle.getBundle("open_ui_with_webview_ui_extras");
                    String string = IntentUtil.getString(bundle, "open_ui_with_webview_ui_plugin_name");
                    String string2 = IntentUtil.getString(bundle, "open_ui_with_webview_ui_plugin_entry");
                    Context context2 = C43047e.this.f276579d;
                    Intent intent = new Intent();
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                    }
                    C88144b.m109791i(context2, string, string2, intent.putExtras(bundle3), (Bundle) null);
                } catch (Throwable unused) {
                    Log.m105920e("AdLandingFloatWebView", "In invokeAsResult method, it happens something unwanted!");
                }
            }
            SnsMethodCalculate.markEndTimeMs("invokeAsResult", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
            return bundle2;
        }

        public boolean Zu0(String str, String str2, Bundle bundle, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onHandleEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
            C45520t E = C43047e.m46679E(C43047e.this);
            if (E == null) {
                SnsMethodCalculate.markEndTimeMs("onHandleEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
                return false;
            }
            try {
                C7580y q = E.mo67743q();
                ((C119157j) C119157j.f356862d).mo183895z(new C43049a(this, q, str, str2, bundle, z));
            } catch (Throwable unused) {
                Log.m105920e("AdLandingFloatWebView", "In onHandleEnd method, it happens something unwanted!");
            }
            SnsMethodCalculate.markEndTimeMs("onHandleEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
            return false;
        }

        public boolean callback(int i, Bundle bundle) {
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
            try {
                C45520t E = C43047e.m46679E(C43047e.this);
                SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
                if (E == null) {
                    SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
                } else {
                    C7580y q = E.mo67743q();
                    C45310h E2 = E.mo67669E();
                    if (i == 1006) {
                        ((C119157j) C119157j.f356862d).mo183895z(new C43058f(this, bundle, E2, q));
                    }
                    SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
                return true;
            } catch (Throwable unused) {
                Log.m105920e("AdLandingFloatWebView", "In callback method, it happens something unwanted!");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
                return true;
            }
        }

        /* renamed from: e3 */
        public String mo7037e3() {
            SnsMethodCalculate.markStartTimeMs("getCommitUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
            try {
                C45520t E = C43047e.m46679E(C43047e.this);
                if (E != null) {
                    String e3 = E.mo67716e3();
                    SnsMethodCalculate.markEndTimeMs("getCommitUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
                    return e3;
                }
            } catch (Throwable unused) {
                Log.m105920e("AdLandingFloatWebView", "callback: getCommitUrl failed");
            }
            SnsMethodCalculate.markEndTimeMs("getCommitUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
            return "";
        }

        public String getCurrentUrl() {
            SnsMethodCalculate.markStartTimeMs("getCurrentUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
            try {
                C45520t E = C43047e.m46679E(C43047e.this);
                if (E != null) {
                    String currentUrl = E.getCurrentUrl();
                    SnsMethodCalculate.markEndTimeMs("getCurrentUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
                    return currentUrl;
                }
            } catch (Throwable unused) {
                Log.m105920e("AdLandingFloatWebView", "callback: getCurrentUrl failed");
            }
            SnsMethodCalculate.markEndTimeMs("getCurrentUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$1");
            return "";
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e$b */
    public class C43050b extends C43558z {
        public C43050b() {
        }

        /* renamed from: e */
        public void mo64862e() {
            SnsMethodCalculate.markStartTimeMs("onBinded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$2");
            try {
                C43791l m = C43047e.m46679E(C43047e.this).mo67731m();
                C43047e eVar = C43047e.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
                C43783b bVar = eVar.f116521A;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
                m.Np0(bVar, C43047e.m46679E(C43047e.this).mo67719g());
            } catch (Throwable unused) {
                Log.m105920e("AdLandingFloatWebView", "bind webview callback failed");
            }
            SnsMethodCalculate.markEndTimeMs("onBinded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e$c */
    public class C43051c implements ScrollableLayout.C43158a {
        public C43051c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e$d */
    public class C43052d implements WebViewCallbackClient {
        public C43052d() {
        }

        public void onContentHeightChanged(int i) {
            SnsMethodCalculate.markStartTimeMs("onContentHeightChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$4");
            Log.m105918d("AdLandingFloatWebView", "onContentHeightChanged:" + i);
            SnsMethodCalculate.markEndTimeMs("onContentHeightChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$4");
        }

        public void onOverScrolled(int i, int i2, boolean z, boolean z2, View view) {
            SnsMethodCalculate.markStartTimeMs("onOverScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$4");
            Log.m105918d("AdLandingFloatWebView", "onOverScrolled: scrollY=" + i2 + ", clampedY=" + z2);
            SnsMethodCalculate.markEndTimeMs("onOverScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$4");
        }

        public void onScrollChanged(int i, int i2, int i3, int i4, View view) {
            SnsMethodCalculate.markStartTimeMs("onScrollChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$4");
            Log.m105918d("AdLandingFloatWebView", "onScrollChanged:" + i + ", " + i2 + ", " + i3 + ", " + i4);
            C43047e eVar = C43047e.this;
            SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            eVar.f116522B = true;
            SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            SnsMethodCalculate.markEndTimeMs("onScrollChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$4");
        }

        public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, View view) {
            SnsMethodCalculate.markStartTimeMs("overScrollBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$4");
            Log.m105918d("AdLandingFloatWebView", "overScrollBy: scrollY=" + i4 + ", scrollRangeY=" + i6);
            if (i4 == 0 && i6 > 0) {
                C43047e eVar = C43047e.this;
                SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
                eVar.f116522B = false;
                SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            }
            SnsMethodCalculate.markEndTimeMs("overScrollBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$4");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e$e */
    public static class C43053e {

        /* renamed from: a */
        public ValueCallback<Uri> f116540a;

        /* renamed from: b */
        public ValueCallback<Uri[]> f116541b;

        /* renamed from: c */
        public String f116542c;

        /* renamed from: d */
        public String f116543d;

        /* JADX WARNING: Removed duplicated region for block: B:58:0x0167 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x019f  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01b4  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m46692a(com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C43047e.C43053e r17, android.app.Activity r18, d93.C45310h r19, android.webkit.ValueCallback r20, android.webkit.ValueCallback r21, java.lang.String r22, java.lang.String r23) {
            /*
                r0 = r17
                r1 = r18
                r2 = r22
                r3 = r23
                java.lang.String r8 = "access$400"
                java.lang.String r9 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$FileChooser"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
                r17.getClass()
                java.lang.Class<aw.d> r4 = p447aw.C103918d.class
                java.lang.String r10 = "doOpenFileChooser"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r9)
                boolean r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C43047e.m46682K(r18)
                java.lang.String r11 = "AdLandingFloatWebView"
                if (r5 != 0) goto L_0x002b
                java.lang.String r0 = "activity is finished."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r9)
                goto L_0x01f4
            L_0x002b:
                if (r19 != 0) goto L_0x0038
                java.lang.String r0 = "openFileChooser fail, wvPerm is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r9)
                goto L_0x01f4
            L_0x0038:
                com.tencent.mm.protocal.JsapiPermissionWrapper r5 = r19.mo70860c()
                r6 = 56
                boolean r5 = r5.mo69447f(r6)
                if (r5 != 0) goto L_0x004f
                java.lang.String r0 = "open file chooser failed, permission fail"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r9)
                goto L_0x01f4
            L_0x004f:
                r5 = r20
                r0.f116540a = r5
                r5 = r21
                r0.f116541b = r5
                r0.f116542c = r2
                long r5 = java.lang.System.currentTimeMillis()
                java.lang.String r5 = java.lang.String.valueOf(r5)
                r0.f116543d = r5
                java.lang.String r5 = "adjustCapture"
                java.lang.String r6 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
                java.lang.String r7 = "user"
                boolean r7 = r7.equalsIgnoreCase(r3)
                java.lang.String r12 = "true"
                if (r7 != 0) goto L_0x0083
                java.lang.String r7 = "environment"
                boolean r7 = r7.equalsIgnoreCase(r3)
                if (r7 == 0) goto L_0x007f
                goto L_0x0083
            L_0x007f:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
                goto L_0x0087
            L_0x0083:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
                r3 = r12
            L_0x0087:
                java.lang.String r0 = r0.f116543d
                android.content.Intent r5 = new android.content.Intent
                java.lang.String r6 = "android.intent.action.GET_CONTENT"
                r5.<init>(r6)
                java.lang.String r6 = "android.intent.category.OPENABLE"
                r5.addCategory(r6)
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r22)
                if (r6 == 0) goto L_0x00a1
                java.lang.String r6 = "*/*"
                r5.setType(r6)
                goto L_0x00a4
            L_0x00a1:
                r5.setType(r2)
            L_0x00a4:
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                r13 = 1
                r14 = 0
                if (r6 != 0) goto L_0x0149
                java.lang.String r6 = "camera"
                boolean r6 = r6.equalsIgnoreCase(r3)
                if (r6 == 0) goto L_0x00bf
                android.content.Intent[] r7 = new android.content.Intent[r13]
                android.content.Intent r0 = ea3.C7615i.m7749a(r0)
                r7[r14] = r0
            L_0x00bc:
                r2 = 0
                goto L_0x0164
            L_0x00bf:
                java.lang.String r6 = "camcorder"
                boolean r6 = r6.equalsIgnoreCase(r3)
                java.lang.String r15 = "android.media.action.VIDEO_CAPTURE"
                if (r6 == 0) goto L_0x00d3
                android.content.Intent[] r7 = new android.content.Intent[r13]
                android.content.Intent r0 = new android.content.Intent
                r0.<init>(r15)
                r7[r14] = r0
                goto L_0x00bc
            L_0x00d3:
                java.lang.String r6 = "microphone"
                boolean r6 = r6.equalsIgnoreCase(r3)
                java.lang.String r7 = "android.provider.MediaStore.RECORD_SOUND"
                if (r6 == 0) goto L_0x00e9
                android.content.Intent[] r0 = new android.content.Intent[r13]
                android.content.Intent r2 = new android.content.Intent
                r2.<init>(r7)
                r0[r14] = r2
                r7 = r0
                goto L_0x00bc
            L_0x00e9:
                java.lang.String r6 = "*"
                boolean r16 = r6.equalsIgnoreCase(r3)
                java.lang.String r14 = "false"
                if (r16 != 0) goto L_0x00ff
                boolean r12 = r12.equalsIgnoreCase(r3)
                if (r12 != 0) goto L_0x00ff
                boolean r12 = r14.equalsIgnoreCase(r3)
                if (r12 == 0) goto L_0x0162
            L_0x00ff:
                java.lang.String r12 = "image/*"
                boolean r12 = r2.equalsIgnoreCase(r12)
                if (r12 == 0) goto L_0x0112
                android.content.Intent[] r2 = new android.content.Intent[r13]
                android.content.Intent r0 = ea3.C7615i.m7749a(r0)
                r12 = 0
                r2[r12] = r0
                r7 = r2
                goto L_0x013a
            L_0x0112:
                r12 = 0
                java.lang.String r0 = "audio/*"
                boolean r0 = r2.equalsIgnoreCase(r0)
                if (r0 == 0) goto L_0x0126
                android.content.Intent[] r0 = new android.content.Intent[r13]
                android.content.Intent r2 = new android.content.Intent
                r2.<init>(r7)
                r0[r12] = r2
            L_0x0124:
                r7 = r0
                goto L_0x013a
            L_0x0126:
                java.lang.String r0 = "video/*"
                boolean r0 = r2.equalsIgnoreCase(r0)
                if (r0 == 0) goto L_0x0139
                android.content.Intent[] r0 = new android.content.Intent[r13]
                android.content.Intent r2 = new android.content.Intent
                r2.<init>(r15)
                r0[r12] = r2
                goto L_0x0124
            L_0x0139:
                r7 = 0
            L_0x013a:
                boolean r0 = r14.equalsIgnoreCase(r3)
                if (r0 != 0) goto L_0x0146
                boolean r0 = r6.equalsIgnoreCase(r3)
                if (r0 == 0) goto L_0x00bc
            L_0x0146:
                r0 = 1
                r2 = 0
                goto L_0x0165
            L_0x0149:
                r2 = 16
                boolean r2 = p206nj.C11171e.m11044a(r2)
                if (r2 == 0) goto L_0x0162
                java.lang.String r2 = "MicroMsg.WebJSSDKUtil"
                java.lang.String r3 = "android API version is below 16."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                android.content.Intent[] r7 = new android.content.Intent[r13]
                android.content.Intent r0 = ea3.C7615i.m7749a(r0)
                r2 = 0
                r7[r2] = r0
                goto L_0x0164
            L_0x0162:
                r2 = 0
                r7 = 0
            L_0x0164:
                r0 = 0
            L_0x0165:
                if (r0 != 0) goto L_0x0170
                if (r7 == 0) goto L_0x0170
                int r0 = r7.length
                if (r0 != 0) goto L_0x016d
                goto L_0x0170
            L_0x016d:
                r0 = r7[r2]
                goto L_0x0191
            L_0x0170:
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r2 = "android.intent.action.CHOOSER"
                r0.<init>(r2)
                java.lang.String r2 = "android.intent.extra.INITIAL_INTENTS"
                r0.putExtra(r2, r7)
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r3 = 2131840053(0x7f114c35, float:1.9313375E38)
                java.lang.String r2 = r2.getString(r3)
                java.lang.String r3 = "android.intent.extra.TITLE"
                r0.putExtra(r3, r2)
                java.lang.String r2 = "android.intent.extra.INTENT"
                r0.putExtra(r2, r5)
            L_0x0191:
                di3.d r2 = di3.C86312j.m106911c(r4)
                aw.d r2 = (p447aw.C103918d) r2
                java.lang.String r3 = "android.permission.CAMERA"
                boolean r2 = r2.Lb0(r1, r3)
                if (r2 != 0) goto L_0x01b4
                di3.d r0 = di3.C86312j.m106911c(r4)
                aw.d r0 = (p447aw.C103918d) r0
                r2 = 119(0x77, float:1.67E-43)
                r0.mo125790zt(r1, r3, r2)
                java.lang.String r0 = "openFileChooser no Permission"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r9)
                goto L_0x01f4
            L_0x01b4:
                r2 = 2003(0x7d3, float:2.807E-42)
                k20.a r3 = new k20.a     // Catch:{ Exception -> 0x01e5 }
                r3.<init>()     // Catch:{ Exception -> 0x01e5 }
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a     // Catch:{ Exception -> 0x01e5 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x01e5 }
                r3.mo10233c(r2)     // Catch:{ Exception -> 0x01e5 }
                r3.mo10233c(r0)     // Catch:{ Exception -> 0x01e5 }
                java.lang.Object[] r2 = r3.mo10232b()     // Catch:{ Exception -> 0x01e5 }
                java.lang.String r3 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatWebViewComponent$FileChooser"
                java.lang.String r4 = "doOpenFileChooser"
                java.lang.String r5 = "(Landroid/app/Activity;Lcom/tencent/mm/plugin/webview/permission/WebViewPermission;Landroid/webkit/ValueCallback;Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V"
                java.lang.String r6 = "android/app/Activity"
                java.lang.String r7 = "startActivityForResult"
                java.lang.String r12 = "(Landroid/content/Intent;I)V"
                r0 = r18
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r12
                j20.C117292a.m165364j(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01e5 }
                goto L_0x01f1
            L_0x01e5:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r13]
                r2 = 0
                r1[r2] = r0
                java.lang.String r0 = "openFileChooser e = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r1)
            L_0x01f1:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r9)
            L_0x01f4:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C43047e.C43053e.m46692a(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e$e, android.app.Activity, d93.h, android.webkit.ValueCallback, android.webkit.ValueCallback, java.lang.String, java.lang.String):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e$f */
    public class C43054f implements ViewTreeObserver.OnGlobalLayoutListener {
        public C43054f() {
        }

        public void onGlobalLayout() {
            SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$VOnGlobalLayoutListener");
            try {
                Log.m105924i("AdLandingFloatWebView", "viewTreeObserver OnGlobalLayoutListener is called");
                View view = C43047e.this.f276586n;
                if (view != null && view.getViewTreeObserver().isAlive()) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    View rootView = view.getRootView();
                    if (rootView != null) {
                        view = rootView;
                    }
                    View findViewById = view.findViewById(C0966R.C0970id.l4g);
                    if ((findViewById instanceof ViewGroup) && ((ViewGroup) findViewById).getChildCount() > 0) {
                        View childAt = ((ViewGroup) findViewById).getChildAt(0);
                        if (childAt == null) {
                            SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$VOnGlobalLayoutListener");
                            return;
                        }
                        View findViewById2 = childAt.findViewById(C0966R.C0970id.f357792bs3);
                        if ((findViewById2 instanceof ViewGroup) && ((ViewGroup) findViewById2).getChildCount() > 0) {
                            View childAt2 = ((ViewGroup) findViewById2).getChildAt(0);
                            if (!C102260r.m134871k()) {
                                int i = 0;
                                for (int i2 = 0; i2 < ((ViewGroup) findViewById2).getChildCount(); i2++) {
                                    View childAt3 = ((ViewGroup) findViewById2).getChildAt(i2);
                                    if (childAt3 != null) {
                                        int height = childAt3.getHeight();
                                        i += height;
                                        Log.m105924i("AdLandingFloatWebView", "OnGlobalLayoutListener rv: child: " + i2 + " height: " + height);
                                    }
                                }
                                Log.m105924i("AdLandingFloatWebView", "OnGlobalLayoutListener rv:  " + findViewById2.getHeight());
                                if (childAt2 != null) {
                                    C43047e.m46681H(C43047e.this, childAt2.getWidth(), i);
                                }
                            } else if (childAt2 != null) {
                                C43047e.m46681H(C43047e.this, childAt2.getWidth(), childAt2.getHeight());
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$VOnGlobalLayoutListener");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e$g */
    public static class C43055g extends WebChromeClient {

        /* renamed from: a */
        public Reference<Activity> f116545a;

        /* renamed from: b */
        public C45310h f116546b;

        /* renamed from: c */
        public final C43053e f116547c;

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e$g$a */
        public class C43056a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ GeolocationPermissions.Callback f116548d;

            /* renamed from: e */
            public final /* synthetic */ String f116549e;

            /* renamed from: f */
            public final /* synthetic */ Activity f116550f;

            public C43056a(C43055g gVar, GeolocationPermissions.Callback callback, String str, Activity activity) {
                this.f116548d = callback;
                this.f116549e = str;
                this.f116550f = activity;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient$1");
                Log.m105924i("AdLandingFloatWebView", "onGeolocationPermissionsShowPrompt ok");
                try {
                    this.f116548d.invoke(this.f116549e, true, true);
                    C95198o2.m121133e(this.f116550f);
                } catch (Throwable unused) {
                    Log.m105920e("AdLandingFloatWebView", "GeolocationPermissions.Callback has something wrong!");
                }
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e$g$b */
        public class C43057b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ GeolocationPermissions.Callback f116551d;

            /* renamed from: e */
            public final /* synthetic */ String f116552e;

            /* renamed from: f */
            public final /* synthetic */ Activity f116553f;

            public C43057b(C43055g gVar, GeolocationPermissions.Callback callback, String str, Activity activity) {
                this.f116551d = callback;
                this.f116552e = str;
                this.f116553f = activity;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient$2");
                Log.m105924i("AdLandingFloatWebView", "onGeolocationPermissionsShowPrompt cancel");
                try {
                    this.f116551d.invoke(this.f116552e, false, false);
                    C95198o2.m121133e(this.f116553f);
                } catch (Throwable unused) {
                    Log.m105920e("AdLandingFloatWebView", "GeolocationPermissions.Callback has something wrong!");
                }
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient$2");
            }
        }

        public C43055g(Activity activity, C45310h hVar, C43053e eVar) {
            this.f116545a = new WeakReference(activity);
            this.f116546b = hVar;
            this.f116547c = eVar;
        }

        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            String str2 = str;
            GeolocationPermissions.Callback callback2 = callback;
            SnsMethodCalculate.markStartTimeMs("onGeolocationPermissionsShowPrompt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
            Log.m105925i("AdLandingFloatWebView", "onGeolocationPermissionsShowPrompt, origin = %s", str2);
            try {
                Activity activity = this.f116545a.get();
                if (C43047e.m46682K(activity)) {
                    if (callback2 != null) {
                        if (((C103918d) C86312j.m106911c(C103918d.class)).Lb0(activity, "android.permission.ACCESS_FINE_LOCATION")) {
                            C76879j.m92717K(activity, false, activity.getString(C0966R.string.lfm, new Object[]{str2}), activity.getString(C0966R.string.lfn), activity.getString(C0966R.string.a18), activity.getString(C0966R.string.f7926wf), new C43056a(this, callback2, str2, activity), new C43057b(this, callback2, str2, activity));
                        } else {
                            Log.m105928w("AdLandingFloatWebView", "the application has no geo permission.");
                        }
                        SnsMethodCalculate.markEndTimeMs("onGeolocationPermissionsShowPrompt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
                        return;
                    }
                }
                Log.m105928w("AdLandingFloatWebView", "the activity is finished.");
                SnsMethodCalculate.markEndTimeMs("onGeolocationPermissionsShowPrompt", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
            } catch (Throwable unused) {
                Log.m105928w("AdLandingFloatWebView", "the application has no geo permission.");
            }
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            SnsMethodCalculate.markStartTimeMs("onJsAlert", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
            SnsMethodCalculate.markEndTimeMs("onJsAlert", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
            return false;
        }

        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            SnsMethodCalculate.markStartTimeMs("onJsConfirm", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
            Log.m105918d("AdLandingFloatWebView", "onJsConfirm");
            boolean onJsConfirm = super.onJsConfirm(webView, str, str2, jsResult);
            SnsMethodCalculate.markEndTimeMs("onJsConfirm", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
            return onJsConfirm;
        }

        public void onProgressChanged(WebView webView, int i) {
            SnsMethodCalculate.markStartTimeMs("onProgressChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
            Log.m105919d("AdLandingFloatWebView", "onProgressChanged %d", Integer.valueOf(i));
            SnsMethodCalculate.markEndTimeMs("onProgressChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
        }

        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            String str;
            String str2;
            SnsMethodCalculate.markStartTimeMs("onShowFileChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
            try {
                Activity activity = this.f116545a.get();
                if ((C43047e.m46682K(activity) && fileChooserParams.getMode() == 0) || fileChooserParams.getMode() == 1) {
                    if (fileChooserParams.getAcceptTypes() != null) {
                        if (fileChooserParams.getAcceptTypes().length > 0) {
                            String str3 = fileChooserParams.getAcceptTypes()[0];
                            if (fileChooserParams.isCaptureEnabled()) {
                                if ("image/*".equalsIgnoreCase(str3)) {
                                    str2 = "camera";
                                } else if ("video/*".equalsIgnoreCase(str3)) {
                                    str2 = "camcorder";
                                }
                                str = str2;
                                C43053e.m46692a(this.f116547c, activity, this.f116546b, (ValueCallback) null, valueCallback, str3, str);
                                SnsMethodCalculate.markEndTimeMs("onShowFileChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
                                return true;
                            }
                            str = "*";
                            C43053e.m46692a(this.f116547c, activity, this.f116546b, (ValueCallback) null, valueCallback, str3, str);
                            SnsMethodCalculate.markEndTimeMs("onShowFileChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
                            return true;
                        }
                    }
                    Log.m105924i("AdLandingFloatWebView", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
                    SnsMethodCalculate.markEndTimeMs("onShowFileChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
                    return true;
                }
            } catch (Throwable unused) {
                Log.m105920e("AdLandingFloatWebView", "onShowFileChooser has something wrong");
            }
            SnsMethodCalculate.markEndTimeMs("onShowFileChooser", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$XWebChromeClient");
            return false;
        }
    }

    public C43047e(Context context, C101262e eVar, ViewGroup viewGroup) {
        super(context, eVar, viewGroup);
        try {
            this.f116527w = eVar;
            SnsMethodCalculate.markStartTimeMs("ensureEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            if (this.f116528x == null) {
                AdLandingFloatWebViewComponent$5 adLandingFloatWebViewComponent$5 = new AdLandingFloatWebViewComponent$5(this, C40008f.f107254d);
                this.f116528x = adLandingFloatWebViewComponent$5;
                adLandingFloatWebViewComponent$5.alive();
            }
            SnsMethodCalculate.markEndTimeMs("ensureEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: E */
    public static /* synthetic */ C45520t m46679E(C43047e eVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        C45520t tVar = eVar.f116526v;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        return tVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0225  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m46680G(com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C43047e r23, com.tencent.p014mm.autogen.events.SnsAdWebViewFileResultEvent r24) {
        /*
            r0 = r23
            r1 = r24
            java.lang.String r2 = "access$300"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r23.getClass()
            java.lang.String r4 = "onEventCall"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            if (r1 == 0) goto L_0x025d
            com.tencent.mm.autogen.events.SnsAdWebViewFileResultEvent$a r1 = r1.f107758d
            int r5 = r1.f107759a
            if (r5 != 0) goto L_0x0022
            r17 = r2
            r1 = r3
            r0 = r4
            goto L_0x0264
        L_0x0022:
            r6 = 1
            if (r5 != r6) goto L_0x025d
            int r5 = r1.f107760b
            int r7 = r1.f107761c
            android.content.Intent r1 = r1.f107762d
            java.lang.String r8 = "onActivityResult"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r3)
            r9 = 2003(0x7d3, float:2.807E-42)
            if (r5 != r9) goto L_0x0250
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e$e r10 = r0.f116529y
            if (r10 == 0) goto L_0x0250
            android.content.Context r0 = r0.f276579d
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.String r11 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$FileChooser"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r11)
            if (r5 != r9) goto L_0x0245
            java.lang.String r5 = "onActivityResultInternal"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r11)
            android.webkit.ValueCallback<android.net.Uri> r9 = r10.f116540a
            java.lang.String r12 = "AdLandingFloatWebView"
            if (r9 != 0) goto L_0x0066
            android.webkit.ValueCallback<android.net.Uri[]> r9 = r10.f116541b
            if (r9 != 0) goto L_0x0066
            java.lang.String r0 = "uploadFileCallback is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r11)
            r17 = r2
            r22 = r3
            r20 = r4
            r0 = r8
            goto L_0x0241
        L_0x0066:
            java.lang.String r9 = "getUriFromActivityResult"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r11)
            r13 = -1
            r15 = 0
            if (r7 == r13) goto L_0x007c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
            r17 = r2
            r22 = r3
            r20 = r4
            r21 = r8
            goto L_0x0202
        L_0x007c:
            if (r1 == 0) goto L_0x00cc
            android.net.Uri r7 = r1.getData()
            if (r7 != 0) goto L_0x009b
            android.os.Bundle r7 = r1.getExtras()
            if (r7 == 0) goto L_0x0099
            java.lang.String r13 = "android.intent.extra.STREAM"
            android.os.Parcelable r16 = r7.getParcelable(r13)
            if (r16 == 0) goto L_0x0099
            android.os.Parcelable r7 = r7.getParcelable(r13)
            android.net.Uri r7 = (android.net.Uri) r7
            goto L_0x009f
        L_0x0099:
            r7 = 0
            goto L_0x009f
        L_0x009b:
            android.net.Uri r7 = r1.getData()
        L_0x009f:
            java.lang.Class<h81.h> r13 = h81.C32735h.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            h81.h r13 = (h81.C32735h) r13
            h81.h$c r14 = h81.C32735h.C32737c.clicfg_open_file_choose_new
            int r13 = r13.mo58779Qe(r14, r6)
            if (r13 != r6) goto L_0x00be
            if (r7 == 0) goto L_0x00be
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
            r17 = r2
            r22 = r3
            r20 = r4
            r21 = r8
            goto L_0x0203
        L_0x00be:
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.getFilePath(r0, r7)
            java.lang.Object[] r13 = new java.lang.Object[r6]
            r13[r15] = r7
            java.lang.String r14 = "get file path:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r14, r13)
            goto L_0x00cd
        L_0x00cc:
            r7 = 0
        L_0x00cd:
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r13 != 0) goto L_0x01de
            java.lang.String r13 = com.tencent.p014mm.sdk.system.MimeTypeUtil.getMimeTypeByFilePath(r7)
            java.lang.Object[] r14 = new java.lang.Object[r6]
            r14[r15] = r13
            java.lang.String r6 = "get file mime type [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r6, r14)
            java.lang.String r6 = "matchAcceptType"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r11)
            java.lang.String r14 = r10.f116542c
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 == 0) goto L_0x00fb
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r11)
            r17 = r2
            r22 = r3
            r20 = r4
            r21 = r8
            goto L_0x01a3
        L_0x00fb:
            java.lang.String r14 = r10.f116542c
            java.lang.String r15 = ","
            java.lang.String[] r14 = r14.split(r15)
            int r15 = r14.length
            r17 = r2
            r2 = 0
        L_0x0107:
            if (r2 >= r15) goto L_0x01b3
            r18 = r15
            r15 = r14[r2]
            r19 = r14
            java.lang.String r14 = " "
            r20 = r4
            java.lang.String r4 = ""
            java.lang.String r4 = r15.replace(r14, r4)
            java.lang.String r14 = "matchAcceptTypeInternal"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r11)
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r15 == 0) goto L_0x012f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r11)
            r22 = r3
            r21 = r8
            r3 = 1
            goto L_0x019e
        L_0x012f:
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r15 == 0) goto L_0x013d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r11)
            r22 = r3
            r21 = r8
            goto L_0x0191
        L_0x013d:
            java.lang.String r15 = "/"
            boolean r21 = r4.contains(r15)
            if (r21 == 0) goto L_0x0193
            boolean r21 = r13.contains(r15)
            if (r21 != 0) goto L_0x014c
            goto L_0x0193
        L_0x014c:
            java.lang.String[] r4 = r4.split(r15)
            java.lang.String[] r15 = r13.split(r15)
            r16 = 0
            r21 = r4[r16]
            r22 = r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r21)
            r21 = r8
            r8 = r15[r16]
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x018e
            r3 = 1
            r8 = r4[r3]
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.String r3 = "*"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x0189
            r3 = 1
            r4 = r4[r3]
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r8 = r15[r3]
            boolean r3 = r4.equals(r8)
            if (r3 == 0) goto L_0x0187
            goto L_0x0189
        L_0x0187:
            r3 = 0
            goto L_0x018a
        L_0x0189:
            r3 = 1
        L_0x018a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r11)
            goto L_0x019e
        L_0x018e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r11)
        L_0x0191:
            r3 = 0
            goto L_0x019e
        L_0x0193:
            r22 = r3
            r21 = r8
            boolean r3 = r4.equals(r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r11)
        L_0x019e:
            if (r3 == 0) goto L_0x01a5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r11)
        L_0x01a3:
            r2 = 1
            goto L_0x01bd
        L_0x01a5:
            int r2 = r2 + 1
            r15 = r18
            r14 = r19
            r4 = r20
            r8 = r21
            r3 = r22
            goto L_0x0107
        L_0x01b3:
            r22 = r3
            r20 = r4
            r21 = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r11)
            r2 = 0
        L_0x01bd:
            if (r2 != 0) goto L_0x01c3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
            goto L_0x0202
        L_0x01c3:
            android.net.Uri r2 = r1.getData()
            if (r2 != 0) goto L_0x01d6
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            r1.<init>((java.lang.String) r7)
            android.net.Uri r7 = com.tencent.p014mm.sdk.platformtools.FileProviderHelper.getUriForFile(r0, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
            goto L_0x0203
        L_0x01d6:
            android.net.Uri r7 = r1.getData()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
            goto L_0x0203
        L_0x01de:
            r17 = r2
            r22 = r3
            r20 = r4
            r21 = r8
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r2 = r10.f116543d
            java.lang.String r2 = ea3.C7615i.m7750b(r2)
            r1.<init>((java.lang.String) r2)
            boolean r2 = r1.mo119967g()
            if (r2 == 0) goto L_0x01ff
            android.net.Uri r7 = com.tencent.p014mm.sdk.platformtools.FileProviderHelper.getUriForFile(r0, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
            goto L_0x0203
        L_0x01ff:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)
        L_0x0202:
            r7 = 0
        L_0x0203:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "result = "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            java.lang.String r0 = "callbackOnReceiveValue"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r11)
            android.webkit.ValueCallback<android.net.Uri> r1 = r10.f116540a
            if (r1 == 0) goto L_0x0225
            r1.onReceiveValue(r7)
            goto L_0x0239
        L_0x0225:
            android.webkit.ValueCallback<android.net.Uri[]> r1 = r10.f116541b
            if (r1 == 0) goto L_0x0239
            if (r7 != 0) goto L_0x0230
            r2 = 0
            r1.onReceiveValue(r2)
            goto L_0x0239
        L_0x0230:
            r2 = 1
            android.net.Uri[] r2 = new android.net.Uri[r2]
            r3 = 0
            r2[r3] = r7
            r1.onReceiveValue(r2)
        L_0x0239:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r11)
            r0 = r21
        L_0x0241:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r11)
            goto L_0x0257
        L_0x0245:
            r17 = r2
            r22 = r3
            r20 = r4
            r0 = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r11)
            goto L_0x0257
        L_0x0250:
            r17 = r2
            r22 = r3
            r20 = r4
            r0 = r8
        L_0x0257:
            r1 = r22
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0262
        L_0x025d:
            r17 = r2
            r1 = r3
            r20 = r4
        L_0x0262:
            r0 = r20
        L_0x0264:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r0 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C43047e.m46680G(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e, com.tencent.mm.autogen.events.SnsAdWebViewFileResultEvent):void");
    }

    /* renamed from: H */
    public static void m46681H(C43047e eVar, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        eVar.getClass();
        SnsMethodCalculate.markStartTimeMs("onResizeViewLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        if (!(eVar.f116525u == null || eVar.f116524t == null || eVar.f116523s == null)) {
            Log.m105918d("AdLandingFloatWebView", "on event center information: the  height is " + i2);
            Log.m105918d("AdLandingFloatWebView", "on event center information: the  height of mPlaceHolderView is " + eVar.f116525u.getHeight());
            Log.m105918d("AdLandingFloatWebView", "on event center information: the  height of mScrollableLayout is " + eVar.f116524t.getHeight());
            Log.m105918d("AdLandingFloatWebView", "on event center information: the  height of mWebView is " + eVar.f116523s.getHeight());
            ViewGroup.LayoutParams layoutParams = eVar.f116525u.getLayoutParams();
            layoutParams.height = i2;
            eVar.f116525u.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = eVar.f116523s.getLayoutParams();
            int height = eVar.f116524t.getHeight();
            SnsMethodCalculate.markStartTimeMs("computeWebViewHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            try {
                int i3 = C95198o2.m121130b(eVar.f276579d)[1];
                if (height == i3 && C85875k4.m106205t(eVar.f276579d, false)) {
                    height = i3 - C85875k4.m106198o(eVar.f276579d);
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("computeWebViewHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            layoutParams2.height = height;
            eVar.f116523s.setLayoutParams(layoutParams2);
            eVar.f116524t.setMaxYScrollOffset(i2);
            eVar.f116524t.requestLayout();
        }
        SnsMethodCalculate.markEndTimeMs("onResizeViewLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
    }

    /* renamed from: K */
    public static boolean m46682K(Activity activity) {
        SnsMethodCalculate.markStartTimeMs("isActivityAlive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        boolean z = activity != null && !activity.isFinishing() && !activity.isDestroyed();
        SnsMethodCalculate.markEndTimeMs("isActivityAlive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        return z;
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        super.mo67235C();
        try {
            SnsMethodCalculate.markStartTimeMs("onViewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            Log.m105924i("AdLandingFloatWebView", "the view is going to destroy");
            IListener<SnsAdWebViewFileResultEvent> iListener = this.f116528x;
            if (iListener != null) {
                iListener.dead();
            }
            C45520t tVar = this.f116526v;
            if (tVar != null) {
                tVar.onDestroy();
            }
            MMWebView mMWebView = this.f116523s;
            if (mMWebView != null) {
                mMWebView.destroy();
            }
            SnsMethodCalculate.markEndTimeMs("onViewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        } catch (Throwable unused) {
            Log.m105928w("AdLandingFloatWebView", "the destroy method has something wrong");
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
    }

    /* renamed from: I */
    public final String mo67236I(String str) {
        SnsMethodCalculate.markStartTimeMs("fillUrlParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        try {
            C101271i0 m = mo131854m();
            if (m != null && !TextUtils.isEmpty(str)) {
                String k = m.mo140744k();
                if (TextUtils.isEmpty(k)) {
                    k = m.mo140745l();
                }
                if (!TextUtils.isEmpty(k)) {
                    str = C102236a0.m134734b(str, k);
                }
                str = C46734a.m52032e(str);
            }
        } catch (Throwable unused) {
            Log.m105920e("AdLandingFloatWebView", "fill url param occur error!");
        }
        SnsMethodCalculate.markEndTimeMs("fillUrlParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        return str;
    }

    /* renamed from: J */
    public boolean mo67237J() {
        SnsMethodCalculate.markStartTimeMs("fixWebViewScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        boolean z = true;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_timeline_ad_h5_fix_scroll_switch, 1);
            Log.m105924i("AdLandingFloatWebView", "fixWebViewScroll, exptValue=" + Qe);
            if (Qe <= 0) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("fixWebViewScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            return z;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("fixWebViewScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            return true;
        }
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        super.mo67238e();
        SnsMethodCalculate.markStartTimeMs("obtainPlaceViewHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        if (!this.f116530z) {
            this.f116530z = true;
            try {
                View view = this.f276586n;
                if (view != null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(new C43054f());
                    }
                }
            } catch (Throwable unused) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("obtainPlaceViewHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
    }

    /* renamed from: f */
    public View mo67239f() {
        SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        try {
            this.f116524t = new ScrollableLayout(this.f276579d, (AttributeSet) null);
            SnsMethodCalculate.markStartTimeMs("createWebView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            String str = this.f116527w.f296561z;
            String[] strArr = C45606x.f123373a;
            MMWebView a = MMWebView.C45103b.m49948a(this.f276579d);
            a.mo70468T();
            SnsMethodCalculate.markEndTimeMs("createWebView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
            this.f116523s = a;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            Space space = new Space(this.f276579d, (AttributeSet) null);
            this.f116525u = space;
            space.setLayoutParams(layoutParams);
            this.f116524t.addView(this.f116525u);
            this.f116529y = new C43053e();
            this.f116524t.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f116524t.setDescendantScrollStatusHunter(this);
            this.f116524t.setOnScrollStatusListener(this);
            this.f116524t.setChildScrollableListener(new C43051c());
            if (mo67237J()) {
                this.f116523s.setWebViewCallbackClient(new C43052d());
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
            ScrollableLayout scrollableLayout = this.f116524t;
            MMWebView mMWebView = this.f116523s;
            scrollableLayout.getClass();
            SnsMethodCalculate.markStartTimeMs("addView", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
            scrollableLayout.addView(mMWebView, layoutParams2);
            scrollableLayout.f116754h = mMWebView;
        } catch (Throwable unused) {
            Log.m105928w("AdLandingFloatWebView", "the customLayout method has something wrong");
        }
        SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ui.widget.ad.ScrollableLayout");
        ScrollableLayout scrollableLayout2 = this.f116524t;
        SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        return scrollableLayout2;
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
        try {
            if (this.f116526v == null) {
                String I = mo67236I(this.f116527w.f296561z);
                SnsMethodCalculate.markStartTimeMs("generateWebViewIntent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
                Intent intent = new Intent();
                intent.putExtra("rawUrl", I);
                intent.putExtra("useJs", true);
                intent.putExtra("type", -255);
                intent.putExtra("geta8key_scene", 69);
                SnsMethodCalculate.markEndTimeMs("generateWebViewIntent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
                C45520t u3 = ((C45513i0) C86312j.m106911c(C45513i0.class)).mo70785u3(this.f116523s, 69);
                this.f116526v = u3;
                u3.mo67741p(new C43050b());
                this.f116523s.setWebChromeClient(new MMWebView.C45105d(new C43055g((Activity) this.f276579d, this.f116526v.mo67669E(), this.f116529y)));
                this.f116526v.init();
                this.f116526v.mo67677I(intent);
                Log.m105918d("AdLandingFloatWebView", "url is " + I);
            }
        } catch (Throwable unused) {
            Log.m105920e("AdLandingFloatWebView", "bind webview callback failed");
        }
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent");
    }
}
