package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ba3.C39753d;
import ba3.C39754e;
import c02.C92331c;
import ca3.C0442a;
import ca3.C39932b;
import ca3.C39933c;
import ca3.C39935f;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ServiceClickEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85978w1;
import com.tencent.p014mm.p136ui.C85985z2;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.p136ui.base.MMFalseProgressBar;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.plugin.appbrand.jsapi.h5_interact.SendDataToH5FromMiniProgramEvent;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.p471ui.TmplWebViewMMUI;
import com.tencent.p014mm.plugin.handoff.model.HandOffURL;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.multitask.C56887p;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.webview.WebViewTransHelper;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.core.C43516l;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.core.C5853h;
import com.tencent.p014mm.plugin.webview.model.C43696b;
import com.tencent.p014mm.plugin.webview.model.C43697c;
import com.tencent.p014mm.plugin.webview.model.C43699e2;
import com.tencent.p014mm.plugin.webview.model.C43703h1;
import com.tencent.p014mm.plugin.webview.model.C43704h2;
import com.tencent.p014mm.plugin.webview.model.C43725q1;
import com.tencent.p014mm.plugin.webview.modeltools.C43740a;
import com.tencent.p014mm.plugin.webview.modeltools.C43741b;
import com.tencent.p014mm.plugin.webview.modeltools.C43754j;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUIStyleHelper;
import com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43859b;
import com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43861d;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44085t;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.MPVideoPlayFullScreenView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6425e3;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44248d1;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44366w0;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.FontChooserView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.MovingImageButton;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewRedesignInputFooter;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.pluginsdk.model.app.C44586x0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.AccessibilityUtil;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import com.tencent.p014mm.sdk.vendor.MIUI;
import com.tencent.qqvideo.proxy.api.FactoryProxyManager;
import com.tencent.qqvideo.proxy.api.IUtils;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewCallbackClient;
import com.tencent.xweb.XWebSdk;
import d92.C45292b;
import d92.C45293c;
import d93.C45310h;
import di3.C86312j;
import e00.C45520t;
import ea3.C45588e;
import ea3.C45598m;
import ea3.C45605v;
import ea3.C45606x;
import ex0.C45695b;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import h93.C46014b;
import i83.C46182g0;
import in3.C46279a;
import in3.C87763b;
import in3.C87771d;
import in3.C87773e;
import j20.C117292a;
import j83.C9286a;
import j93.C46450c;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import k93.C46658a;
import k93.C46661f;
import ke3.C88144b;
import kg3.C76577a;
import kw0.C46746a;
import l31.C61212e;
import m93.C46969f;
import nd3.C47223a;
import nf3.C34826a;
import nj3.C76879j;
import nj3.C76912y0;
import nj3.C88990b;
import o31.C11345b;
import org.xwalk.core.XWalkEnvironment;
import p159gw.C45962f;
import p206nj.C11171e;
import p225rc.C89916g;
import p225rc.g$$h;
import p385u2.C111105a;
import p645pj.C47506e;
import p680ru.C77570i;
import p830xc.C91165a;
import p849e3.C107168a0;
import p849e3.C107207u;
import qo3.C101218e0;
import qo3.C77398g;
import qo3.C77407n;
import qo3.C89779i0;
import rx3.C36570n;
import t83.C13851h1;
import t83.C13864v;
import t83.C36979g1;
import t83.C48574a1;
import t83.C48590l;
import t83.C48612w;
import uv0.C22663i;
import v83.C52805a;
import vo3.C90852c;
import we0.C53156a;
import xi3.C78844a;
import y93.C53513a;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI */
public class WebViewUI extends MMSecDataActivity implements C5853h, C46014b, MMWebView.C45106e, ScreenShotUtil.ScreenShotCallback, C0442a, C39933c, C39932b, g$$h, C46658a {

    /* renamed from: D2 */
    public static WebSettings.RenderPriority f118442D2 = WebSettings.RenderPriority.NORMAL;

    /* renamed from: E2 */
    public static int f118443E2 = 0;

    /* renamed from: F2 */
    public static Boolean f118444F2 = null;

    /* renamed from: G2 */
    public static final Pattern f118445G2 = Pattern.compile("\"\\s*rgba\\(\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*\\)\\s*\"");

    /* renamed from: H2 */
    public static final Pattern f118446H2 = Pattern.compile("\"\\s*rgb\\(\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*\\)\\s*\"");

    /* renamed from: A */
    public int f118447A = -1;

    /* renamed from: A1 */
    public boolean f118448A1;

    /* renamed from: A2 */
    public MMWebView.C45104c f118449A2;

    /* renamed from: B */
    public boolean f118450B = false;

    /* renamed from: B1 */
    public int f118451B1;

    /* renamed from: B2 */
    public boolean f118452B2;

    /* renamed from: C */
    public boolean f118453C = false;

    /* renamed from: C1 */
    public int f118454C1;

    /* renamed from: C2 */
    public C43516l f118455C2;

    /* renamed from: D */
    public C53156a f118456D;

    /* renamed from: D1 */
    public volatile boolean f118457D1;

    /* renamed from: E */
    public C46661f f118458E = new C46661f();

    /* renamed from: E1 */
    public C43704h2 f118459E1;

    /* renamed from: F */
    public WebViewRedesignInputFooter f118460F;

    /* renamed from: F1 */
    public C43697c f118461F1;

    /* renamed from: G */
    public View f118462G;

    /* renamed from: G1 */
    public WebViewLongClickHelper f118463G1;

    /* renamed from: H */
    public WebViewSearchContentInputFooter f118464H;

    /* renamed from: H1 */
    public C43977g1 f118465H1;

    /* renamed from: I */
    public boolean f118466I;

    /* renamed from: I1 */
    public C44097n2 f118467I1;

    /* renamed from: J */
    public String f118468J = null;

    /* renamed from: J1 */
    public IUtils f118469J1;

    /* renamed from: K */
    public boolean f118470K = true;

    /* renamed from: K1 */
    public volatile String f118471K1;

    /* renamed from: L */
    public boolean f118472L = false;

    /* renamed from: L1 */
    public volatile long f118473L1;

    /* renamed from: M */
    public boolean f118474M = false;

    /* renamed from: M1 */
    public HandOffURL f118475M1;

    /* renamed from: N */
    public String f118476N;

    /* renamed from: N1 */
    public WebViewUIStyleHelper f118477N1;

    /* renamed from: O1 */
    public C6595t0 f118478O1;

    /* renamed from: P */
    public String f118479P = "";

    /* renamed from: P1 */
    public C43859b f118480P1;

    /* renamed from: Q */
    public int f118481Q = -1;

    /* renamed from: Q0 */
    public View f118482Q0;

    /* renamed from: Q1 */
    public C53513a f118483Q1;

    /* renamed from: R */
    public boolean f118484R = true;

    /* renamed from: R0 */
    public WebChromeClient f118485R0;

    /* renamed from: R1 */
    public C45605v f118486R1;

    /* renamed from: S */
    public boolean f118487S = true;

    /* renamed from: S0 */
    public ProgressBar f118488S0;

    /* renamed from: S1 */
    public WebViewCallbackClient f118489S1;

    /* renamed from: T */
    public AccessibilityManager f118490T;

    /* renamed from: T0 */
    public C45310h f118491T0 = null;

    /* renamed from: T1 */
    public C6107m f118492T1;

    /* renamed from: U */
    public AccessibilityManager.AccessibilityStateChangeListener f118493U;

    /* renamed from: U0 */
    public boolean f118494U0 = false;

    /* renamed from: U1 */
    public IListener<ServiceClickEvent> f118495U1;

    /* renamed from: V */
    public boolean f118496V = false;

    /* renamed from: V0 */
    public boolean f118497V0 = false;

    /* renamed from: V1 */
    public View f118498V1;

    /* renamed from: W */
    public boolean f118499W = false;

    /* renamed from: W0 */
    public C6593r0 f118500W0 = null;

    /* renamed from: W1 */
    public MMHandler f118501W1;

    /* renamed from: X */
    public int f118502X;

    /* renamed from: X0 */
    public C39935f f118503X0 = new C39935f(this);

    /* renamed from: X1 */
    public C44366w0 f118504X1;

    /* renamed from: Y */
    public byte[] f118505Y = new byte[0];

    /* renamed from: Y0 */
    public final IListener<SendDataToH5FromMiniProgramEvent> f118506Y0;

    /* renamed from: Y1 */
    public MPVideoPlayFullScreenView f118507Y1;

    /* renamed from: Z */
    public C48590l f118508Z = null;

    /* renamed from: Z0 */
    public boolean f118509Z0;

    /* renamed from: Z1 */
    public C89779i0 f118510Z1;

    /* renamed from: a1 */
    public C43791l f118511a1;

    /* renamed from: a2 */
    public int f118512a2;

    /* renamed from: b1 */
    public C43522y f118513b1;

    /* renamed from: b2 */
    public long f118514b2;

    /* renamed from: c1 */
    public boolean f118515c1;

    /* renamed from: c2 */
    public C46450c f118516c2;

    /* renamed from: d */
    public boolean f118517d = false;

    /* renamed from: d1 */
    public HashMap<String, Boolean> f118518d1;

    /* renamed from: d2 */
    public View f118519d2;

    /* renamed from: e */
    public boolean f118520e = false;

    /* renamed from: e1 */
    public HashMap<String, String> f118521e1;

    /* renamed from: e2 */
    public int f118522e2;

    /* renamed from: f */
    public MMWebView f118523f;

    /* renamed from: f1 */
    public HashMap<String, ArrayList<C47506e.C47508b>> f118524f1;

    /* renamed from: f2 */
    public C53156a.C38082b f118525f2;

    /* renamed from: g */
    public long f118526g = 0;

    /* renamed from: g1 */
    public HashMap<String, Boolean> f118527g1;

    /* renamed from: g2 */
    public boolean f118528g2;

    /* renamed from: h */
    public long f118529h = 0;

    /* renamed from: h1 */
    public WebViewUI$$i0 f118530h1;

    /* renamed from: h2 */
    public final C44125o1 f118531h2;

    /* renamed from: i */
    public boolean f118532i = false;

    /* renamed from: i1 */
    public C77398g f118533i1;

    /* renamed from: i2 */
    public final C43754j f118534i2;

    /* renamed from: j */
    public MMFalseProgressBar f118535j;

    /* renamed from: j1 */
    public View f118536j1;

    /* renamed from: j2 */
    public final C43741b f118537j2;

    /* renamed from: k1 */
    public RelativeLayout f118538k1;

    /* renamed from: k2 */
    public final C44085t f118539k2;

    /* renamed from: l1 */
    public TextView f118540l1;

    /* renamed from: l2 */
    public boolean f118541l2;

    /* renamed from: m1 */
    public String f118542m1;

    /* renamed from: m2 */
    public View.OnLongClickListener f118543m2;
    private C87771d.C46280b mStatusBarHeightCallback;

    /* renamed from: n */
    public MultiCodeMaskView f118544n;

    /* renamed from: n1 */
    public boolean f118545n1;

    /* renamed from: n2 */
    public boolean f118546n2;

    /* renamed from: o */
    public ActionBar f118547o;

    /* renamed from: o1 */
    public boolean f118548o1;

    /* renamed from: o2 */
    public View.OnLongClickListener f118549o2;

    /* renamed from: p */
    public ProgressBar f118550p;

    /* renamed from: p0 */
    public View f118551p0;

    /* renamed from: p1 */
    public int f118552p1;

    /* renamed from: p2 */
    public View.OnLongClickListener f118553p2;

    /* renamed from: q */
    public C89779i0 f118554q;

    /* renamed from: q1 */
    public String f118555q1;

    /* renamed from: q2 */
    public Boolean f118556q2;

    /* renamed from: r */
    public C44199u0 f118557r;

    /* renamed from: r1 */
    public volatile boolean f118558r1;

    /* renamed from: r2 */
    public Runnable f118559r2;

    /* renamed from: s */
    public View f118560s;

    /* renamed from: s1 */
    public boolean f118561s1;

    /* renamed from: s2 */
    public String f118562s2;

    /* renamed from: t */
    public ImageButton f118563t;

    /* renamed from: t1 */
    public String f118564t1;

    /* renamed from: t2 */
    public volatile String f118565t2;

    /* renamed from: u */
    public ImageButton f118566u;

    /* renamed from: u1 */
    public Map f118567u1;

    /* renamed from: u2 */
    public WebChromeClient.CustomViewCallback f118568u2;

    /* renamed from: v */
    public View f118569v;

    /* renamed from: v1 */
    public int f118570v1;

    /* renamed from: v2 */
    public boolean f118571v2;

    /* renamed from: w */
    public WebViewKeyboardLinearLayout f118572w;

    /* renamed from: w1 */
    public int f118573w1;

    /* renamed from: w2 */
    public int f118574w2;

    /* renamed from: x */
    public FrameLayout f118575x;

    /* renamed from: x0 */
    public MTimerHandler f118576x0;

    /* renamed from: x1 */
    public boolean f118577x1;

    /* renamed from: x2 */
    public WebViewUI$$k0 f118578x2;

    /* renamed from: y */
    public FrameLayout f118579y;

    /* renamed from: y0 */
    public WebChromeClient.CustomViewCallback f118580y0;

    /* renamed from: y1 */
    public boolean f118581y1;

    /* renamed from: y2 */
    public C75018a.C75024d f118582y2;

    /* renamed from: z */
    public MovingImageButton f118583z;

    /* renamed from: z1 */
    public boolean f118584z1;

    /* renamed from: z2 */
    public int f118585z2;

    public WebViewUI() {
        C40008f fVar = C40008f.f107254d;
        this.f118506Y0 = new IListener<SendDataToH5FromMiniProgramEvent>(fVar) {
            {
                Class<SendDataToH5FromMiniProgramEvent> cls = SendDataToH5FromMiniProgramEvent.class;
                this.__eventId = -323543271;
            }

            public boolean callback(IEvent iEvent) {
                SendDataToH5FromMiniProgramEvent sendDataToH5FromMiniProgramEvent = (SendDataToH5FromMiniProgramEvent) iEvent;
                if (WebViewUI.this.mo68267Y7() != sendDataToH5FromMiniProgramEvent.f108756f || WebViewUI.this.f118508Z == null) {
                    return false;
                }
                HashMap hashMap = new HashMap(2);
                hashMap.put("miniprogramAppID", sendDataToH5FromMiniProgramEvent.f108754d);
                hashMap.put("data", sendDataToH5FromMiniProgramEvent.f108755e);
                WebViewUI.this.f118508Z.mo8701f("onMiniProgramData", hashMap);
                return false;
            }
        };
        this.f118509Z0 = false;
        this.f118511a1 = null;
        this.f118513b1 = null;
        this.f118515c1 = false;
        this.f118518d1 = new HashMap<>();
        this.f118521e1 = new HashMap<>();
        this.f118524f1 = new HashMap<>();
        this.f118527g1 = new HashMap<>();
        this.f118533i1 = null;
        this.f118536j1 = null;
        this.f118538k1 = null;
        this.f118540l1 = null;
        this.f118542m1 = null;
        this.f118545n1 = false;
        this.f118548o1 = false;
        this.f118552p1 = 0;
        this.f118555q1 = null;
        this.f118558r1 = false;
        this.f118561s1 = false;
        this.f118570v1 = 0;
        this.f118573w1 = (int) (System.currentTimeMillis() / 1000);
        this.f118577x1 = false;
        this.f118581y1 = false;
        this.f118584z1 = false;
        this.f118448A1 = false;
        this.f118457D1 = false;
        this.f118459E1 = new C43704h2();
        this.f118469J1 = null;
        this.f118486R1 = new C45605v();
        this.f118489S1 = new WebViewUI$$p(this);
        this.f118495U1 = new IListener<ServiceClickEvent>(fVar) {
            {
                this.__eventId = 1156034135;
            }

            public boolean callback(IEvent iEvent) {
                ServiceClickEvent serviceClickEvent = (ServiceClickEvent) iEvent;
                WebViewUI webViewUI = WebViewUI.this;
                if (webViewUI.f118511a1 == null) {
                    Log.m105920e("MicroMsg.WebViewUI", "Cli Event, invoker is null");
                } else if (webViewUI.f118471K1 == null || WebViewUI.this.f118471K1.length() == 0) {
                    Log.m105920e("MicroMsg.WebViewUI", "Cli Event, tid is null");
                } else {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        Log.m105925i("MicroMsg.WebViewUI", "Cli Event, tid = %s, stime = %d, etime = %d", WebViewUI.this.f118471K1, Long.valueOf(WebViewUI.this.f118473L1), Long.valueOf(currentTimeMillis));
                        Bundle bundle = new Bundle();
                        bundle.putString("service_click_tid", new String(WebViewUI.this.f118471K1));
                        bundle.putLong("service_click_stime", WebViewUI.this.f118473L1);
                        bundle.putLong("service_click_etime", currentTimeMillis);
                        WebViewUI.this.f118511a1.mo68108RV(2836, bundle);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.WebViewUI", "Cli Event Exception, msg = %s", e.getMessage());
                    }
                    WebViewUI.this.f118471K1 = null;
                }
                return false;
            }
        };
        this.f118512a2 = 0;
        this.f118514b2 = 0;
        this.f118516c2 = new WebViewUI$$g0(this);
        this.f118522e2 = 0;
        this.f118525f2 = new WebViewUI$$b(this);
        this.f118528g2 = false;
        this.f118531h2 = new C44125o1();
        this.f118534i2 = new C43754j();
        this.f118537j2 = new C43741b();
        this.f118539k2 = new C44085t();
        this.f118543m2 = new WebViewUI$$q(this);
        this.f118546n2 = false;
        this.f118553p2 = new WebViewUI$$t(this);
        this.f118556q2 = Boolean.FALSE;
        this.f118559r2 = new WebViewUI$$x(this);
        this.f118562s2 = "";
        this.f118565t2 = "";
        this.f118571v2 = true;
        this.f118574w2 = 0;
        this.f118578x2 = new WebViewUI$$k0(this);
        this.f118582y2 = new WebViewUI$$d0(this);
        this.f118585z2 = -1;
        this.f118449A2 = null;
        this.f118452B2 = false;
        this.f118455C2 = new WebViewUI$$e0(this);
    }

    /* renamed from: F9 */
    private void m47805F9() {
        if (this.f118511a1 != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("screen_orientation", this.f118447A);
                this.f118511a1.mo68114V5(83, bundle);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WebViewUI", "ac_set_screen_orientation : " + e.getMessage());
            }
        }
    }

    /* renamed from: H7 */
    public static void m47806H7(WebViewUI webViewUI, int i) {
        WebViewSearchContentInputFooter webViewSearchContentInputFooter = webViewUI.f118464H;
        if (webViewSearchContentInputFooter != null && webViewUI.f118548o1) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) webViewSearchContentInputFooter.getLayoutParams();
            if (marginLayoutParams.bottomMargin != i) {
                marginLayoutParams.bottomMargin = i;
                webViewUI.f118464H.setLayoutParams(marginLayoutParams);
            }
            if (webViewUI.f118464H.getVisibility() == 0) {
                i += webViewUI.f118464H.getHeight();
            }
            MMWebView mMWebView = webViewUI.f118523f;
            mMWebView.setPadding(mMWebView.getPaddingLeft(), webViewUI.f118523f.getPaddingTop(), webViewUI.f118523f.getPaddingRight(), i);
            webViewUI.f118523f.post(new C44204u1(webViewUI));
        }
    }

    /* renamed from: I7 */
    public static void m47807I7(WebViewUI webViewUI, WebView webView, String str) {
        webViewUI.getClass();
        Log.m105924i("MicroMsg.WebViewUI", "onWeixinReady when page commit");
        webViewUI.f118562s2 = str;
        Log.m105925i("MicroMsg.WebViewUI", "onWeixinReady, inject url=%s", str);
        C45310h hVar = webViewUI.f118491T0;
        if (hVar != null) {
            webViewUI.mo68230D9(hVar.mo70860c());
        }
        webViewUI.mo68288i9(webViewUI.mo68256S8());
        webViewUI.mo68225B8(webViewUI.f118518d1.containsKey(str) ? webViewUI.f118518d1.get(str).booleanValue() : webViewUI.mo68313t9());
        Boolean bool = webViewUI.f118527g1.get(str);
        if (bool == null || !bool.booleanValue()) {
            webViewUI.showOptionMenu(0, true);
        } else {
            webViewUI.showOptionMenu(0, false);
        }
        if (webViewUI.f118487S && Util.isNullOrNil(webViewUI.f118565t2)) {
            webViewUI.f118565t2 = webViewUI.f118513b1.f117597w;
        }
    }

    /* renamed from: J7 */
    public static void m47808J7(View view, int i) {
        if (view != null) {
            view.setSystemUiVisibility(i | view.getSystemUiVisibility());
        }
    }

    /* renamed from: A8 */
    public void mo68223A8() {
        if (getIntent() != null && getIntent().hasExtra("show_full_screen")) {
            mo68278e9(getIntent().getBooleanExtra("show_full_screen", false), true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        if (r1.startsWith(com.tencent.p014mm.sdk.http.HttpWrapperBase.PROTOCAL_HTTP + com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(com.tencent.p014mm.C0966R.string.f360885fm3) + "/") != false) goto L_0x0076;
     */
    /* renamed from: A9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo68224A9(java.lang.String r7) {
        /*
            r6 = this;
            com.tencent.mm.plugin.webview.ui.tools.floatball.b r0 = r6.f118480P1
            if (r0 == 0) goto L_0x001b
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r0 != 0) goto L_0x001b
            com.tencent.mm.plugin.webview.ui.tools.floatball.b r0 = r6.f118480P1
            java.lang.String r1 = r6.mo6901n0()
            boolean r0 = r0.mo68413C0(r1)
            if (r0 != 0) goto L_0x001b
            com.tencent.mm.plugin.webview.ui.tools.floatball.b r0 = r6.f118480P1
            r0.mo67998q0(r7)
        L_0x001b:
            y93.a r0 = r6.f118483Q1
            if (r0 == 0) goto L_0x007e
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r0 != 0) goto L_0x007e
            y93.a r0 = r6.f118483Q1
            java.lang.String r1 = r6.mo6901n0()
            r0.getClass()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r2 = 0
            if (r0 != 0) goto L_0x0077
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "https://"
            r0.append(r3)
            r3 = 2131831321(0x7f112a19, float:1.9295664E38)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r3)
            r0.append(r4)
            java.lang.String r4 = "/"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0076
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "http://"
            r0.append(r5)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r3)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0077
        L_0x0076:
            r2 = 1
        L_0x0077:
            if (r2 != 0) goto L_0x007e
            y93.a r0 = r6.f118483Q1
            r0.mo160077O(r7)
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI.mo68224A9(java.lang.String):void");
    }

    /* renamed from: B8 */
    public void mo68225B8(boolean z) {
        this.f118528g2 = z;
        if (this.f118523f == null) {
            Log.m105920e("MicroMsg.WebViewUI", "viewwv is null, maybe has destroyed");
            return;
        }
        enableOptionMenu(z);
        showOptionMenu(z);
        boolean booleanExtra = getIntent().getBooleanExtra("show_feedback", false);
        if (booleanExtra) {
            showOptionMenu(booleanExtra);
        }
        int i = mo68277e8() != null ? C0966R.raw.mm_title_btn_jd : mo68277e8() != null ? C0966R.raw.mm_title_btn_jd : C0966R.raw.icons_outlined_more;
        boolean booleanExtra2 = getIntent().getBooleanExtra("KRightBtn", false);
        boolean booleanExtra3 = getIntent().getBooleanExtra("KShowFixToolsBtn", false);
        Log.m105925i("MicroMsg.WebViewUI", "banRightBtn:%b, showFixToolsBtn:%b", Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3));
        if (!booleanExtra3 && C85875k4.m106197n0() && (C85875k4.m106208w() || C85985z2.m106332d(getTaskId()))) {
            boolean x = C85875k4.m106209x(getTaskId());
            int i2 = C0966R.raw.icons_outlined_sperated;
            int i3 = x ? C0966R.raw.icons_outlined_merge : C0966R.raw.icons_outlined_sperated;
            boolean x2 = C85875k4.m106209x(getTaskId());
            int i4 = C0966R.string.f361404jm3;
            int i5 = x2 ? C0966R.string.bfn : C0966R.string.f361404jm3;
            if (C85875k4.m106199o0()) {
                C85861e4.m106116c();
                Boolean valueOf = Boolean.valueOf(C85861e4.m106115b(this));
                this.f118556q2 = valueOf;
                if (valueOf.booleanValue()) {
                    i2 = C0966R.raw.icons_outlined_merge;
                }
                if (this.f118556q2.booleanValue()) {
                    i4 = C0966R.string.bfn;
                }
                i3 = i2;
                i5 = i4;
            }
            addIconOptionMenu(2, i5, i3, (MenuItem.OnMenuItemClickListener) new WebViewUI$$u(this));
        }
        if (!booleanExtra2) {
            if (booleanExtra3) {
                addIconOptionMenu(1, (int) C0966R.string.f8015za, (int) C0966R.raw.fix_tools_entry, (MenuItem.OnMenuItemClickListener) new WebViewUI$$v(this));
            }
            addIconOptionMenu(0, (int) C0966R.string.a0h, i, (MenuItem.OnMenuItemClickListener) new WebViewUI$$w(this), this.f118553p2);
        }
    }

    /* renamed from: B9 */
    public final void mo68226B9(String str) {
        if (this.f118475M1 != null && !Util.isNullOrNil(str)) {
            if (!(this.f118480P1 == null && this.f118483Q1 == null) && !((C45696d) C86709a0.m107533q(C45696d.class)).B60(mo6901n0()) && !this.f118475M1.getTitle().equals(str)) {
                this.f118475M1.setTitle(str);
                if (mo68243L8()) {
                    ((C92331c) C86312j.m106911c(C92331c.class)).Gg0(this.f118475M1);
                }
            }
        }
    }

    /* renamed from: C8 */
    public boolean mo68227C8() {
        return !Util.isNullOrNil(this.f118555q1) && this.f118555q1.equals("black");
    }

    /* renamed from: C9 */
    public final void mo68228C9(String str) {
        if (!Util.isNullOrNil(str) && !str.startsWith("data:text/html;charset=utf-8")) {
            C43522y yVar = this.f118513b1;
            String nullAsNil = Util.nullAsNil(yVar != null ? yVar.mo67730l0() : "");
            C43859b bVar = this.f118480P1;
            if (bVar != null) {
                bVar.mo149079t0(HandOffURL.KShareUrl, nullAsNil);
            }
            C53513a aVar = this.f118483Q1;
            if (aVar != null) {
                aVar.f150468z.f135052f = nullAsNil;
            }
            if (!nullAsNil.isEmpty()) {
                str = nullAsNil;
            }
            if (this.f118475M1 != null && !Util.isNullOrNil(str) && !this.f118475M1.getUrl().equals(str)) {
                this.f118475M1.setUrl(str);
                if (mo68243L8()) {
                    ((C92331c) C86312j.m106911c(C92331c.class)).Gg0(this.f118475M1);
                }
            }
        }
    }

    /* renamed from: D8 */
    public boolean mo68229D8() {
        return false;
    }

    /* renamed from: D9 */
    public final void mo68230D9(JsapiPermissionWrapper jsapiPermissionWrapper) {
        if (jsapiPermissionWrapper == null) {
            return;
        }
        if (jsapiPermissionWrapper.mo69447f(34)) {
            setMMSubTitle((int) C0966R.string.lii);
        } else if (jsapiPermissionWrapper.mo69447f(75)) {
            setMMSubTitle((int) C0966R.string.liv);
        } else {
            setMMSubTitle((String) null);
        }
    }

    /* renamed from: E4 */
    public void mo68231E4(Bundle bundle) {
        if (bundle != null) {
            "black".equals(bundle.getString("style"));
            C44366w0 r8 = mo68305r8();
            r8.mo69123q(1);
            r8.mo69119n(false);
            r8.mo69141x(true);
        }
    }

    /* renamed from: E8 */
    public boolean mo68232E8() {
        return false;
    }

    /* renamed from: E9 */
    public void mo68233E9() {
        C43977g1 g1Var = this.f118465H1;
        C77407n nVar = g1Var.f119144q;
        if (nVar == null ? false : nVar.mo107563h()) {
            g1Var.mo68575I();
        }
    }

    /* renamed from: F8 */
    public final boolean mo68234F8() {
        return this.f118450B;
    }

    /* renamed from: G8 */
    public boolean mo68235G8() {
        return this.f118513b1.f117604z0;
    }

    /* renamed from: G9 */
    public final void mo68236G9() {
        View view = this.f118536j1;
        if (view != null && view.getVisibility() == 0) {
            if (getResources().getConfiguration().orientation == 1) {
                RelativeLayout relativeLayout = this.f118538k1;
                if (relativeLayout != null) {
                    relativeLayout.setPadding(0, getResources().getDimensionPixelSize(C0966R.dimen.f3755d6), 0, getResources().getDimensionPixelSize(C0966R.dimen.f3709c2));
                    return;
                }
                return;
            }
            RelativeLayout relativeLayout2 = this.f118538k1;
            if (relativeLayout2 != null) {
                relativeLayout2.setPadding(0, getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, getResources().getDimensionPixelSize(C0966R.dimen.f3760da));
            }
        }
    }

    /* renamed from: H8 */
    public boolean mo68237H8() {
        C6595t0 t0Var = this.f118478O1;
        if (t0Var != null) {
            C6592p0 p0Var = t0Var.f23849b;
            if (p0Var.f23835a || p0Var.f23837c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H9 */
    public boolean mo63698H9() {
        String n0 = mo6901n0();
        if (Util.isNullOrNil(n0)) {
            return false;
        }
        try {
            URI create = URI.create(n0);
            Log.m105925i("MicroMsg.WebViewUI", "useSysWebView, rawUrl:%s, host:", n0, create.getHost());
            return !C45606x.m50664b(create) && !XWebSdk.needUseXWeb(n0);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebViewUI", e, "useSysWebView exception", new Object[0]);
            return false;
        }
    }

    /* renamed from: I0 */
    public void mo62534I0(C39754e eVar) {
        this.f118503X0.mo62534I0(eVar);
    }

    /* renamed from: I8 */
    public boolean mo68238I8() {
        if (!this.f118450B) {
            C39753d dVar = this.f118503X0.f107072g;
            if (!((dVar == null || dVar.f106652b == null) ? false : true)) {
                MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f118507Y1;
                if (mPVideoPlayFullScreenView == null) {
                    return false;
                }
                return mPVideoPlayFullScreenView.getVisibility() == 0;
            }
        }
    }

    /* renamed from: J3 */
    public void mo68239J3(Bundle bundle) {
        C44366w0 w0Var = this.f118504X1;
        if (w0Var != null) {
            w0Var.mo69124r();
            w0Var.f120265z.setText("");
        }
    }

    /* renamed from: J8 */
    public boolean mo68240J8() {
        C6595t0 t0Var = this.f118478O1;
        return t0Var != null && t0Var.f23849b.f23837c;
    }

    /* renamed from: K7 */
    public boolean mo68241K7() {
        C45310h hVar = this.f118491T0;
        return (hVar == null || hVar.mo70859b() == null || !this.f118491T0.mo70859b().mo69431c()) ? false : true;
    }

    /* renamed from: K8 */
    public boolean mo68242K8() {
        String i = C86709a0.m107522a() ? C86709a0.m107523b().mo121111i() : "MMWebViewTransShouldPullHalfScreenNotice";
        if (Util.isNullOrNil(i)) {
            Log.m105920e("MicroMsg.WebViewUI", "kvName is null");
            return true;
        }
        boolean decodeBool = MultiProcessMMKV.getSingleMMKV(i).decodeBool("MMWebViewTransHasPullBefore", false);
        Log.m105925i("MicroMsg.WebViewUI", "show trans notice before: %s", Boolean.toString(decodeBool));
        return decodeBool;
    }

    /* renamed from: L7 */
    public MMWebView mo63700L7() {
        C43522y c;
        MMWebView mMWebView;
        MMWebView mMWebView2 = null;
        if (C43861d.m48034d()) {
            String stringExtra = getIntent().getStringExtra("float_ball_key");
            if (Util.isNullOrNil(stringExtra) || (c = C43861d.f118783a.mo68421c(stringExtra)) == null || (mMWebView = c.f117553a) == null || mMWebView.f122358h) {
                MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(this);
                if (!mo63698H9()) {
                    return MMWebView.C45103b.m49948a(mutableContextWrapper);
                }
                try {
                    Log.m105924i("MMWebView", "TRACE_ORDER:MMWebView.java");
                    XWebSdk.initWebviewCore(mutableContextWrapper, MMWebView.f122352r, XWalkEnvironment.MODULE_TOOLS, (WebView.PreInitCallback) null);
                    mMWebView2 = new MMWebView(mutableContextWrapper, (AttributeSet) null, 0, WebView.WebViewKind.WV_KIND_SYS);
                } catch (Exception unused) {
                }
                return mMWebView2;
            }
            Log.m105925i("MicroMsg.WebViewUI", "createWebView from cache floatBallKey=%s", stringExtra);
            if (mMWebView.getParent() != null) {
                ((ViewGroup) mMWebView.getParent()).removeView(mMWebView);
                C115669n.INSTANCE.idkeyStat(1553, 21, 1, false);
                Log.m105928w("MicroMsg.WebViewUI", "createWebView wv has parent");
            }
            mMWebView.mo70470f(this);
            mMWebView.onShow();
            return mMWebView;
        } else if (!mo63698H9()) {
            return MMWebView.C45103b.m49948a(this);
        } else {
            try {
                Log.m105924i("MMWebView", "TRACE_ORDER:MMWebView.java");
                XWebSdk.initWebviewCore(this, MMWebView.f122352r, XWalkEnvironment.MODULE_TOOLS, (WebView.PreInitCallback) null);
                mMWebView2 = new MMWebView(this, (AttributeSet) null, 0, WebView.WebViewKind.WV_KIND_SYS);
            } catch (Exception unused2) {
            }
            return mMWebView2;
        }
    }

    /* renamed from: L8 */
    public boolean mo68243L8() {
        boolean booleanExtra = getIntent().getBooleanExtra("KRightBtn", false);
        Log.m105925i("MicroMsg.WebViewUI", "enableMinimize:%b, banRightBtn %b", Boolean.valueOf(mo63702S7()), Boolean.valueOf(booleanExtra));
        return !booleanExtra && mo68313t9() && mo63702S7();
    }

    /* renamed from: M7 */
    public C43522y mo63701M7() {
        MMWebView mMWebView;
        if (C43861d.m48034d()) {
            String stringExtra = getIntent().getStringExtra("float_ball_key");
            if (!Util.isNullOrNil(stringExtra)) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(1553, 1, 1, false);
                C43522y c = C43861d.f118783a.mo68421c(stringExtra);
                if (c == null || (mMWebView = c.f117553a) == null || mMWebView.f122358h) {
                    nVar.idkeyStat(1553, 3, 1, false);
                } else {
                    nVar.idkeyStat(1553, 2, 1, false);
                    this.f118515c1 = true;
                    Log.m105925i("MicroMsg.WebViewUI", "createWebViewController from cache floatBallKey=%s", stringExtra);
                    c.f117569i = this.f118486R1;
                    return c;
                }
            }
        }
        C43522y yVar = new C43522y(this.f118523f, this.f118459E1, new C45520t.C45522b(new C45520t.C45523c(getIntent()), getIntent().getBooleanExtra("key_trust_url", false), mo68257T7(), !mo68232E8() && !mo68229D8(), getIntent().getBooleanExtra("neverGetA8Key", false), 0, false));
        if (!this.f118515c1) {
            yVar.mo67679J(this.f118578x2);
        }
        yVar.f117569i = this.f118486R1;
        yVar.init();
        return yVar;
    }

    /* renamed from: M8 */
    public boolean mo68244M8() {
        return false;
    }

    /* renamed from: N7 */
    public boolean mo68245N7() {
        return false;
    }

    /* renamed from: N8 */
    public void mo68246N8() {
        System.currentTimeMillis();
        this.f118523f.goBack();
        C44130p1 p1Var = C44130p1.f119545i;
        Log.m105927v("MicroMsg.WebViewReportUtil", "goBack traceid %s", p1Var.f119546a);
        if (!Util.isNullOrNil(p1Var.f119546a)) {
            p1Var.mo68774e(5, "", 0);
        }
    }

    /* renamed from: O7 */
    public final void mo68247O7() {
        View view = this.f118551p0;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "dismissInputAlertToast", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "dismissInputAlertToast", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        MTimerHandler mTimerHandler = this.f118576x0;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
    }

    /* renamed from: O8 */
    public void mo68248O8(String str, Map<String, String> map, boolean z) {
        C43522y yVar = this.f118513b1;
        if (yVar != null) {
            yVar.mo67754x(str, map, z);
        }
    }

    /* renamed from: P0 */
    public void mo68249P0(Bundle bundle) {
        AppCompatActivity context = getContext();
        C89779i0 i0Var = this.f118510Z1;
        C87412m.m108594g(context, "context");
        String string = bundle != null ? bundle.getString("status") : null;
        if (string != null) {
            int hashCode = string.hashCode();
            if (hashCode != -1867169789) {
                if (hashCode != 336650556) {
                    if (hashCode == 1940070258 && string.equals("dismissloading")) {
                        if (i0Var != null && i0Var.isShowing()) {
                            i0Var.dismiss();
                        }
                        this.f118510Z1 = i0Var;
                    }
                } else if (string.equals("loading")) {
                    C45588e eVar = C45588e.f123306a;
                    String string2 = context.getString(C0966R.string.a4d);
                    C87412m.m108593f(string2, "context.getString(com.te…mui.R.string.app_waiting)");
                    i0Var = eVar.mo71111a(string2, context, i0Var);
                    this.f118510Z1 = i0Var;
                }
            } else if (string.equals("success")) {
                C76912y0.m92768g(context, bundle != null ? bundle.getString("wording") : null);
            }
        }
        i0Var = null;
        this.f118510Z1 = i0Var;
    }

    /* renamed from: P5 */
    public void mo68250P5(Bundle bundle) {
        this.f118512a2 = bundle.getInt("state", 0);
    }

    /* renamed from: P7 */
    public void mo68251P7(boolean z) {
        MMWebView mMWebView = this.f118523f;
        if (mMWebView != null) {
            String url = mMWebView.getUrl();
            if (z) {
                showOptionMenu(0, false);
                this.f118527g1.put(url, Boolean.TRUE);
                return;
            }
            showOptionMenu(0, true);
            if (this.f118527g1.containsKey(url)) {
                this.f118527g1.remove(url);
            }
        }
    }

    /* renamed from: P8 */
    public void mo68252P8(int i) {
        this.f118513b1.mo67668C0(i);
    }

    /* renamed from: Q7 */
    public final void mo68253Q7() {
        if (this.f118584z1) {
            Log.m105918d("MicroMsg.WebViewUI", "SwipeBackFinish, do not LaunchOuterApp");
            return;
        }
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("webview_invoke_launch_app_when_back", false);
        String stringExtra = intent.getStringExtra("KAppId");
        String stringExtra2 = intent.getStringExtra("webview_invoke_launch_app_ext_info_when_back");
        if (booleanExtra && stringExtra != null && stringExtra.length() > 0 && stringExtra2 != null && stringExtra2.length() > 0) {
            Bundle bundle = new Bundle();
            bundle.putString("appId", stringExtra);
            bundle.putString("extInfo", stringExtra2);
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C44586x0.class, (C1256g) null);
        }
    }

    /* renamed from: Q8 */
    public boolean mo68254Q8() {
        return true;
    }

    /* renamed from: R7 */
    public void mo68255R7() {
        View view = this.f118523f.getView();
        view.scrollTo(view.getScrollX(), 0);
        C43704h2.C43711h j = this.f118459E1.mo68012j();
        j.mo68019a(mo6901n0(), 7);
        C115669n.INSTANCE.mo160137l(11576, j.f118154a);
    }

    /* renamed from: R8 */
    public boolean mo68180R8() {
        return this instanceof TmplWebViewMMUI;
    }

    /* renamed from: S */
    public String mo6898S(String str) {
        return this.f118513b1.mo67694S(str);
    }

    /* renamed from: S7 */
    public boolean mo63702S7() {
        boolean z = getClass().equals(WebViewUI.class) && !getIntent().getBooleanExtra("disable_minimize", false);
        Log.m105925i("MicroMsg.WebViewUI", "enableMinimize class:%s enable:%b", getClass(), Boolean.valueOf(z));
        return z;
    }

    /* renamed from: S8 */
    public boolean mo68256S8() {
        C44199u0 u0Var;
        boolean z;
        if (this.f118472L) {
            return true;
        }
        MMWebView mMWebView = this.f118523f;
        if (mMWebView != null && ((mMWebView.canGoBack() || this.f118523f.canGoForward()) && (u0Var = this.f118557r) != null)) {
            Boolean bool = u0Var.f119743h;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("WebViewUIShowBottom");
                C87412m.m108591d(mmkv);
                if (mmkv.decodeInt("WebViewUIShowBottomNav", 0) == 1) {
                    Boolean bool2 = Boolean.TRUE;
                    u0Var.f119743h = bool2;
                    C87412m.m108591d(bool2);
                    z = true;
                } else {
                    if (!(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_webview_bottom_bar, 0) == 1)) {
                        Log.m105924i("MicroMsg.WebViewBottomNavigatorHelper", "needShowBottomNavigator not open");
                        Boolean bool3 = Boolean.FALSE;
                        u0Var.f119743h = bool3;
                        C87412m.m108591d(bool3);
                        z = false;
                    } else {
                        Boolean valueOf = Boolean.valueOf(((Boolean) ((C36570n) u0Var.f119746k).getValue()).booleanValue());
                        u0Var.f119743h = valueOf;
                        Log.m105925i("MicroMsg.WebViewBottomNavigatorHelper", "needShowBottomNavigator deviceShowBottomNav %b", valueOf);
                        Boolean bool4 = u0Var.f119743h;
                        C87412m.m108591d(bool4);
                        if (bool4.booleanValue()) {
                            C115669n nVar = C115669n.INSTANCE;
                            nVar.mo160131h(18210, 1);
                            nVar.idkeyStat(1160, 0, 1, false);
                        } else {
                            C115669n.INSTANCE.idkeyStat(1160, 2, 1, false);
                        }
                        Boolean bool5 = u0Var.f119743h;
                        C87412m.m108591d(bool5);
                        z = bool5.booleanValue();
                    }
                }
            }
            if (z) {
                this.f118470K = false;
                this.f118472L = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: T7 */
    public boolean mo68257T7() {
        return true;
    }

    /* renamed from: T8 */
    public C44131q0 mo68258T8() {
        return new C44131q0(this);
    }

    /* renamed from: U7 */
    public void mo68259U7() {
        if (this.f118519d2 != null && !this.f118450B) {
            int i8 = mo68287i8();
            Log.m105919d("MicroMsg.WebViewUI", "fixContentMarginImpl newTopMargin: %d, old: %d", Integer.valueOf(i8), Integer.valueOf(this.f118519d2.getPaddingTop()));
            mo68290j9(i8);
        }
    }

    /* renamed from: U8 */
    public final void mo68260U8(String str) {
        C48590l lVar = this.f118508Z;
        if (lVar != null && lVar.f130003h && str != null) {
            lVar.mo73204A(str, (String) null);
            try {
                if (str.equals("onPause")) {
                    C43791l lVar2 = this.f118511a1;
                    if (lVar2 != null) {
                        lVar2.U30(mo68267Y7());
                    }
                    this.f118508Z.mo73258s0(false);
                } else if (str.equals("onResume")) {
                    C43791l lVar3 = this.f118511a1;
                    if (lVar3 != null) {
                        lVar3.mo68104Ow(mo68267Y7());
                    }
                    this.f118508Z.mo73258s0(true);
                }
            } catch (Exception e) {
                Log.m105928w("MicroMsg.WebViewUI", "onResume, ex = " + e.getMessage());
            }
        }
    }

    /* renamed from: V7 */
    public Map<String, String> mo68261V7() {
        return this.f118513b1.f117540N;
    }

    /* renamed from: V8 */
    public void mo68262V8() {
        if (!mo68264W8()) {
            mo68253Q7();
            if (!mo68306s9()) {
                this.f118577x1 = true;
                C44130p1.f119545i.mo68770a();
                if (!this.f118584z1) {
                    C43704h2.C6037e.m5916a(getCurrentURL(), 1);
                }
                C53513a aVar = this.f118483Q1;
                if (aVar == null || !aVar.mo67896U(1, aVar.f150464v)) {
                    finish();
                }
            }
        }
    }

    /* renamed from: W4 */
    public void mo62536W4(C91165a.C53318a aVar) {
        this.f118503X0.mo62536W4(aVar);
    }

    /* renamed from: W7 */
    public int mo68263W7() {
        return this.f118561s1 ? C0966R.raw.actionbar_icon_dark_back : C0966R.raw.actionbar_icon_dark_close;
    }

    /* renamed from: W8 */
    public boolean mo68264W8() {
        int intExtra = getIntent().getIntExtra("key_close_action", 0);
        Bundle bundleExtra = getIntent().getBundleExtra("key_close_data");
        Log.m105925i("MicroMsg.WebViewUI", "close action %s", Integer.valueOf(intExtra));
        if (intExtra != 1) {
            if (intExtra == 2 && bundleExtra != null) {
                String string = bundleExtra.getString("close_jump_url");
                int i = bundleExtra.getInt("close_jump_url_request_code", 0);
                if (!Util.isNullOrNil(string)) {
                    Intent intent = new Intent(this, WebViewUI.class);
                    intent.putExtra("rawUrl", string);
                    intent.putExtra("showShare", false);
                    intent.putExtra("show_bottom", false);
                    intent.putExtra("needRedirect", false);
                    intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
                    intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
                    startActivityForResult(intent, i);
                    C88990b.m111197f(this);
                    return true;
                }
            }
        } else if (bundleExtra != null) {
            String string2 = bundleExtra.getString("close_dialog_title");
            String string3 = bundleExtra.getString("close_dialog_msg");
            String string4 = bundleExtra.getString("close_dialog_ok");
            String string5 = bundleExtra.getString("close_dialog_cancel");
            boolean z = bundleExtra.getBoolean("close_dialog_ok_close", true);
            if (!Util.isNullOrNil(string3, string4, string5)) {
                if (z) {
                    C76879j.m92709C(this, string2, string3, string4, string5, false, new WebViewUI$$b0(this), (DialogInterface.OnClickListener) null);
                } else {
                    C76879j.m92709C(this, string2, string3, string4, string5, false, (DialogInterface.OnClickListener) null, new WebViewUI$$c0(this));
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: X7 */
    public int mo68265X7() {
        return getResources().getDimensionPixelSize(C0966R.dimen.f357083au0) > C76577a.m92151b(this, 48) ? getResources().getDimensionPixelSize(C0966R.dimen.f357083au0) : KeyBoardUtil.isPortOrientation(this) ? getResources().getDimensionPixelSize(C0966R.dimen.f3679b9) : getResources().getDimensionPixelSize(C0966R.dimen.f3678b8);
    }

    /* renamed from: X8 */
    public void mo68266X8(WebView webView, String str) {
        C43704h2 h2Var = this.f118459E1;
        Intent intent = getIntent();
        String n0 = mo6901n0();
        h2Var.getClass();
        int intExtra = intent.getIntExtra("geta8key_scene", 0);
        int intExtra2 = intent.getIntExtra("bizEnterId", h2Var.f118135r);
        int intExtra3 = intent.getIntExtra("webview_scene_type", 1);
        String stringExtra = intent.getStringExtra("webview_scene_note");
        String stringExtra2 = intent.getStringExtra("srcUsername");
        if (Util.isNullOrNil(stringExtra2)) {
            stringExtra2 = intent.getStringExtra("geta8key_username");
        }
        String stringExtra3 = intent.getStringExtra("KAppId");
        C115669n nVar = C115669n.INSTANCE;
        QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
        nVar.mo160131h(18452, Integer.valueOf(intExtra2), Integer.valueOf(intExtra), WebViewUtilities.doUrlEncode(n0), WebViewUtilities.doUrlEncode(str), Integer.valueOf(intExtra3), stringExtra, stringExtra3, stringExtra2);
        mo68317w8();
    }

    /* renamed from: Y3 */
    public void mo62535Y3(C39754e eVar) {
        this.f118503X0.mo62535Y3(eVar);
    }

    /* renamed from: Y5 */
    public C6107m mo6895Y5() {
        return this.f118492T1;
    }

    /* renamed from: Y7 */
    public int mo68267Y7() {
        return this.f118513b1.mo67719g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0b02, code lost:
        if (f118444F2.booleanValue() != false) goto L_0x0b04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01f1, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r7) != false) goto L_0x022e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0643  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x064b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x06a4  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x06dd  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0700  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0735  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0738  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x076e  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x078f  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x07c4 A[Catch:{ Exception -> 0x07f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x07d2 A[Catch:{ Exception -> 0x07f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0801  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0841  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x084f  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0854  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0891  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x08b6  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0905 A[Catch:{ Exception -> 0x0911 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0909 A[Catch:{ Exception -> 0x0911 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x092d  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x09da  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x09e7  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0a10  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0a37  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0a3d  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0a4b  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0a69  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0abd  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0b08  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0b1e  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0b42  */
    /* JADX WARNING: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0621  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0634  */
    /* renamed from: Y8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63703Y8() {
        /*
            r19 = this;
            r1 = r19
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            int r3 = r19.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r0[r4] = r3
            java.lang.String r3 = "MicroMsg.WebViewUI"
            java.lang.String r5 = "WebViewUI-LifeCycle onCreate, WebViewUI#%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r0)
            com.tencent.mm.plugin.webview.ui.tools.q1 r0 = new com.tencent.mm.plugin.webview.ui.tools.q1
            r0.<init>(r1)
            r1.f118492T1 = r0
            com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper r0 = new com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper
            j93.c r5 = r1.f118516c2
            r0.<init>(r5)
            r1.f118463G1 = r0
            com.tencent.mm.plugin.webview.ui.tools.r0 r0 = new com.tencent.mm.plugin.webview.ui.tools.r0
            r0.<init>(r1)
            r1.f118500W0 = r0
            r0.f23841d = r4
            java.lang.String r5 = r0.f23839b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "onCreate#"
            r6.append(r7)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r7 = r0.mo68388b()
            int r7 = r7.hashCode()
            r6.append(r7)
            java.lang.String r7 = " closeNewJsapiPay "
            r6.append(r7)
            boolean r7 = r0.f23841d
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            boolean r5 = r0.f23841d
            r6 = 8
            java.lang.String r7 = ""
            if (r5 == 0) goto L_0x0061
            goto L_0x00d0
        L_0x0061:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleDefault()
            java.lang.String r8 = "getSingleDefault()"
            gy3.C87412m.m108593f(r5, r8)
            android.content.Intent r8 = r0.mo68387a()
            java.lang.String r9 = "key_jsapi_pay_uuid"
            boolean r8 = r8.hasExtra(r9)
            if (r8 == 0) goto L_0x00b9
            android.content.Intent r8 = r0.mo68387a()
            java.lang.String r8 = r8.getStringExtra(r9)
            java.lang.String r10 = r5.decodeString(r9, r7)
            java.lang.String r11 = "mmkv.decodeString(Consta…ViewUI.KJsApiPayUUID, \"\")"
            gy3.C87412m.m108593f(r10, r11)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 != 0) goto L_0x0099
            boolean r11 = gy3.C87412m.m108589b(r10, r8)
            if (r11 == 0) goto L_0x0099
            r0.f23842e = r2
            r5.encode((java.lang.String) r9, (java.lang.String) r7)
            goto L_0x00b9
        L_0x0099:
            r0.f23842e = r4
            java.lang.String r9 = r0.f23839b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "isManualOpen:false uuid:"
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = " uuidkv:"
            r11.append(r8)
            r11.append(r10)
            java.lang.String r8 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
        L_0x00b9:
            boolean r8 = r0.f23842e
            if (r8 != 0) goto L_0x00d0
            boolean r8 = r0.mo7519e(r5)
            if (r8 == 0) goto L_0x00d0
            java.lang.String r8 = r0.f23839b
            java.lang.String r9 = "clearAndFinish because isManualOpen is false and url is same"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            r0.mo7520f(r6)
            r0.mo7518d(r5)
        L_0x00d0:
            r1.f118546n2 = r2
            android.content.Intent r0 = r19.getIntent()
            int r5 = qe3.C12212g.m11775a()
            java.lang.String r8 = "geta8key_session_id"
            int r0 = r0.getIntExtra(r8, r5)
            r1.f118502X = r0
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r5 = "geta8key_cookie"
            byte[] r0 = r0.getByteArrayExtra(r5)
            r1.f118505Y = r0
            android.content.Intent r0 = r19.getIntent()
            r5 = -1
            java.lang.String r8 = "screen_orientation"
            int r0 = r0.getIntExtra(r8, r5)
            r1.f118447A = r0
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r8 = "from_shortcut"
            boolean r0 = r0.getBooleanExtra(r8, r4)
            r1.f118499W = r0
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r8 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122318j
            int r0 = r0.getIntExtra(r8, r5)
            r1.f118481Q = r0
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r8 = "status_bar_style"
            java.lang.String r0 = r0.getStringExtra(r8)
            r1.f118555q1 = r0
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r8 = "customize_status_bar_color"
            int r0 = r0.getIntExtra(r8, r4)
            r1.f118552p1 = r0
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r9 = "show_native_web_view"
            boolean r0 = r0.getBooleanExtra(r9, r4)
            r1.f118561s1 = r0
            androidx.appcompat.app.ActionBar r0 = r19.getSupportActionBar()
            r1.f118547o = r0
            r0 = 2131296436(0x7f0900b4, float:1.8210789E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.f118498V1 = r0
            if (r0 == 0) goto L_0x016d
            boolean r0 = in3.C87771d.f254121g
            if (r0 != 0) goto L_0x014d
            goto L_0x016d
        L_0x014d:
            in3.d r0 = in3.C87771d.m109203b(r19)
            com.tencent.mm.plugin.webview.ui.tools.j2 r10 = new com.tencent.mm.plugin.webview.ui.tools.j2
            r10.<init>(r1)
            r1.mStatusBarHeightCallback = r10
            r0.mo122180d(r10)
            android.view.Window r0 = r19.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.requestApplyInsets()
            android.view.Window r0 = r19.getWindow()
            in3.C87773e.m109211d(r0)
        L_0x016d:
            com.tencent.mm.plugin.webview.ui.tools.t0 r0 = new com.tencent.mm.plugin.webview.ui.tools.t0
            r0.<init>(r1)
            r1.f118478O1 = r0
            boolean r0 = r19.mo68237H8()
            r10 = 0
            if (r0 == 0) goto L_0x01a3
            com.tencent.mm.plugin.webview.ui.tools.t0 r0 = r1.f118478O1
            com.tencent.mm.plugin.webview.ui.tools.p0 r7 = r0.f23849b
            boolean r7 = r7.f23836b
            if (r7 == 0) goto L_0x0190
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f23848a
            r7 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r7 = kg3.C76577a.m92153d(r0, r7)
            r0.setActionbarColor(r7)
            goto L_0x019c
        L_0x0190:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f23848a
            r7 = 2131101841(0x7f060891, float:1.7816103E38)
            int r7 = kg3.C76577a.m92153d(r0, r7)
            r0.setActionbarColor(r7)
        L_0x019c:
            ca3.f r0 = r1.f118503X0
            r0.getClass()
            goto L_0x022e
        L_0x01a3:
            android.content.Intent r0 = r19.getIntent()
            if (r0 != 0) goto L_0x01aa
            goto L_0x01b4
        L_0x01aa:
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r7 = "custom_action_bar_color"
            java.lang.String r7 = r0.getStringExtra(r7)
        L_0x01b4:
            android.content.Intent r0 = r19.getIntent()
            if (r0 != 0) goto L_0x01bc
            r0 = 0
            goto L_0x01c6
        L_0x01bc:
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r11 = "open_custom_style_url"
            boolean r0 = r0.getBooleanExtra(r11, r4)
        L_0x01c6:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            r11[r4] = r12
            java.lang.String r12 = "initCustomActionBarColorIfNeed isNativeStyle is %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r12, r11)
            if (r0 == 0) goto L_0x01ed
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r0 == 0) goto L_0x01e4
            r0 = 2131099650(0x7f060002, float:1.781166E38)
            r1.mo68285h9(r0)
            java.lang.String r7 = "black"
            goto L_0x01f4
        L_0x01e4:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.mo68285h9(r0)
            java.lang.String r7 = "white"
            goto L_0x01f4
        L_0x01ed:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r0 == 0) goto L_0x01f4
            goto L_0x022e
        L_0x01f4:
            int r0 = android.graphics.Color.parseColor(r7)     // Catch:{ Exception -> 0x01fd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01fd }
            goto L_0x01ff
        L_0x01fd:
            r0 = r10
        L_0x01ff:
            if (r0 != 0) goto L_0x0202
            goto L_0x022e
        L_0x0202:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r2)
            int r11 = r0.intValue()
            java.lang.String r12 = "set_navigation_bar_color_color"
            r7.putInt(r12, r11)
            r11 = 255(0xff, float:3.57E-43)
            java.lang.String r12 = "set_navigation_bar_color_alpha"
            r7.putInt(r12, r11)
            r1.mo68315v8(r7)
            com.tencent.mm.plugin.webview.ui.tools.t0 r7 = r1.f118478O1
            r7.f23850c = r2
            android.content.Intent r7 = r19.getIntent()
            boolean r7 = r7.hasExtra(r8)
            if (r7 != 0) goto L_0x022e
            int r0 = r0.intValue()
            r1.f118552p1 = r0
        L_0x022e:
            java.lang.String r0 = r19.mo6901n0()
            ea3.C45606x.m50663a(r0)
            r1.f118468J = r0
            android.content.Intent r7 = r19.getIntent()
            boolean r7 = r7.getBooleanExtra(r9, r4)
            r1.f118561s1 = r7
            int r7 = f118443E2
            int r7 = r7 + r2
            f118443E2 = r7
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r4] = r0
            int r9 = r1.f118481Q
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r2] = r9
            java.lang.String r9 = "WebView-Trace initView rawUrl = %s, itemShowType %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r8)
            android.content.Intent r8 = r19.getIntent()
            java.lang.String r9 = "KPublisherId"
            java.lang.String r8 = r8.getStringExtra(r9)
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            r1.f118476N = r8
            com.tencent.mm.sdk.platformtools.MMHandler r8 = new com.tencent.mm.sdk.platformtools.MMHandler
            r8.<init>()
            r1.f118501W1 = r8
            zt3.t r8 = zt3.C119157j.f356862d
            com.tencent.mm.pluginsdk.model.app.j0$$a r9 = new com.tencent.mm.pluginsdk.model.app.j0$$a
            r9.<init>(r1, r0)
            zt3.j r8 = (zt3.C119157j) r8
            java.lang.String r11 = "reportLaunchWechat"
            r8.mo183876g(r9, r11)
            com.tencent.mm.plugin.webview.model.h2 r8 = r1.f118459E1
            java.lang.String r9 = "mm_report_bundle"
            if (r8 == 0) goto L_0x02a1
            android.content.Intent r11 = r19.getIntent()
            android.os.Bundle r11 = r11.getBundleExtra(r9)
            if (r11 == 0) goto L_0x029c
            com.tencent.mm.plugin.webview.model.h2$a r12 = r8.f118131n
            if (r12 == 0) goto L_0x0293
            r12.f118136a = r10
        L_0x0293:
            com.tencent.mm.plugin.webview.model.h2$a r12 = new com.tencent.mm.plugin.webview.model.h2$a
            r12.<init>(r8, r11)
            r8.f118131n = r12
            r8 = 1
            goto L_0x029d
        L_0x029c:
            r8 = 0
        L_0x029d:
            if (r8 == 0) goto L_0x02a1
            r8 = 1
            goto L_0x02a2
        L_0x02a1:
            r8 = 0
        L_0x02a2:
            r1.f118474M = r8
            android.content.Intent r8 = r19.getIntent()
            java.lang.String r11 = "close_window_confirm_info"
            android.os.Bundle r8 = r8.getBundleExtra(r11)
            if (r8 == 0) goto L_0x02b7
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$i0 r11 = new com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$i0
            r11.<init>(r8)
            r1.f118530h1 = r11
        L_0x02b7:
            android.view.Window r8 = r19.getWindow()
            r11 = 16777216(0x1000000, float:2.3509887E-38)
            r8.setFlags(r11, r11)
            android.view.Window r8 = r19.getWindow()
            r11 = -3
            r8.setFormat(r11)
            long r11 = java.lang.System.currentTimeMillis()
            android.os.MessageQueue r8 = android.os.Looper.myQueue()
            com.tencent.mm.pluginsdk.model.o1 r13 = new com.tencent.mm.pluginsdk.model.o1
            r13.<init>(r1)
            r8.addIdleHandler(r13)
            long r13 = java.lang.System.currentTimeMillis()
            r1.f118526g = r13
            boolean r8 = com.tencent.xweb.XWebSdk.hasWebViewCoreInited()
            r8 = r8 ^ r2
            r1.f118532i = r8
            java.lang.Object[] r13 = new java.lang.Object[r7]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r13[r4] = r8
            java.lang.String r8 = r19.mo6901n0()
            r13[r2] = r8
            java.lang.String r8 = "initWebView, isColdWebView:%s, raw url: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r13)
            r19.mo6901n0()
            com.tencent.mm.ui.widget.MMWebView r8 = r19.mo63700L7()
            r1.f118523f = r8
            long r13 = java.lang.System.currentTimeMillis()
            r1.f118529h = r13
            com.tencent.mm.ui.widget.MMWebView r8 = r1.f118523f
            r8.f122361n = r1
            long r13 = java.lang.System.currentTimeMillis()
            ea3.v r8 = r1.f118486R1
            long r13 = r13 - r11
            r8.f123363f = r13
            r19.initView()
            com.tencent.mm.plugin.webview.core.y r8 = r19.mo63701M7()
            r1.f118513b1 = r8
            boolean r8 = r19.mo68180R8()
            if (r8 == 0) goto L_0x0329
            com.tencent.mm.plugin.webview.core.y r8 = r1.f118513b1
            com.tencent.mm.plugin.webview.core.l r11 = r1.f118455C2
            r8.f117529F0 = r11
        L_0x0329:
            java.lang.Object[] r8 = new java.lang.Object[r2]
            com.tencent.mm.plugin.webview.core.y r11 = r1.f118513b1
            int r11 = r11.mo67719g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8[r4] = r11
            java.lang.String r11 = "WebViewUI-LifeCycle createWebViewController binderId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r11, r8)
            android.content.Intent r8 = r19.getIntent()
            java.lang.String r11 = "startTime"
            r13 = 0
            long r15 = r8.getLongExtra(r11, r13)
            android.content.Intent r8 = r19.getIntent()
            java.lang.String r11 = "createTime"
            long r17 = r8.getLongExtra(r11, r13)
            android.content.Intent r8 = r19.getIntent()
            java.lang.String r11 = "isReCreateUI"
            boolean r8 = r8.getBooleanExtra(r11, r4)
            com.tencent.mm.plugin.webview.core.y r11 = r1.f118513b1
            android.content.Intent r12 = r19.getIntent()
            r13 = r15
            r15 = r17
            r17 = r8
            r18 = r0
            r11.mo67752v0(r12, r13, r15, r17, r18)
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            ea3.u r0 = r0.f117543Q
            long r11 = r1.f118526g
            java.lang.String r8 = "onWebViewCreateStart"
            r0.mo73829a(r8, r11)
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            ea3.u r0 = r0.f117543Q
            long r11 = r1.f118529h
            java.lang.String r8 = "onWebViewCreateEnd"
            r0.mo73829a(r8, r11)
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper r0 = r0.f117676P0
            if (r0 == 0) goto L_0x03b4
            r1.f118477N1 = r0
            r0.f118667d = r1
            com.tencent.mm.plugin.webview.ui.tools.s0 r8 = r0.f118668e
            if (r8 != 0) goto L_0x0398
            com.tencent.mm.plugin.webview.ui.tools.s0 r8 = new com.tencent.mm.plugin.webview.ui.tools.s0
            r8.<init>(r1)
            r0.f118668e = r8
            goto L_0x039a
        L_0x0398:
            r8.f119731a = r1
        L_0x039a:
            com.tencent.mm.sdk.event.IListener r8 = r0.f118672i
            if (r8 != 0) goto L_0x03ae
            boolean r8 = r0.mo68378j()
            if (r8 == 0) goto L_0x03ae
            com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper$BizFinderLineStatusChangedEventListenerImpl r8 = new com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper$BizFinderLineStatusChangedEventListenerImpl
            r8.<init>(r0)
            r0.f118672i = r8
            r8.alive()
        L_0x03ae:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper r0 = r1.f118477N1
            r0.mo68375g()
            goto L_0x03c2
        L_0x03b4:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper r0 = new com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper
            r0.<init>(r1)
            r1.f118477N1 = r0
            com.tencent.mm.plugin.webview.core.y r8 = r1.f118513b1
            r8.f117676P0 = r0
            r0.mo68375g()
        L_0x03c2:
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            t83.l r0 = r0.mo67720g0()
            r1.f118508Z = r0
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            d93.h r0 = r0.f117539M
            r1.f118491T0 = r0
            boolean r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43861d.m48034d()
            if (r0 == 0) goto L_0x03e4
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            java.lang.String r11 = "webviewCurrentProcess"
            r0.putExtra(r11, r8)
        L_0x03e4:
            t83.l r0 = r1.f118508Z
            if (r0 == 0) goto L_0x03f7
            r0.f130006k = r4
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r0[r4] = r8
            java.lang.String r8 = "MicroMsg.JsApiHandler"
            java.lang.String r11 = "setIsFloating %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r11, r0)
        L_0x03f7:
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            com.tencent.mm.plugin.webview.ui.tools.g1 r0 = r0.f117675O0
            r8 = 7
            r11 = 5
            r12 = 3
            r13 = 6
            if (r0 == 0) goto L_0x040c
            r1.f118465H1 = r0
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r1)
            r0.f118700a = r6
            goto L_0x061b
        L_0x040c:
            com.tencent.mm.plugin.webview.ui.tools.g1 r0 = new com.tencent.mm.plugin.webview.ui.tools.g1
            r0.<init>(r1)
            r1.f118465H1 = r0
            boolean r14 = r19.mo68240J8()
            r0.f119139l = r14
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            com.tencent.mm.plugin.webview.ui.tools.g1 r14 = r1.f118465H1
            r0.f117675O0 = r14
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.clear()
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r5 = "menuItem:share:brand"
            r0.put(r5, r15)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:share:appMessage"
            r0.put(r15, r5)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r5 = 23
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:share:dataMessage"
            r0.put(r15, r5)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:share:timeline"
            r0.put(r15, r5)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:favorite"
            r0.put(r15, r5)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:profile"
            r0.put(r15, r5)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:addContact"
            r0.put(r15, r5)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:copyUrl"
            r0.put(r15, r5)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:openWithSafari"
            r0.put(r15, r5)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "menuItem:share:email"
            r0.put(r6, r5)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r5 = 9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "menuItem:delete"
            r0.put(r6, r5)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r5 = 10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "menuItem:exposeArticle"
            r0.put(r6, r5)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r5 = 11
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:setFont"
            r0.put(r15, r6)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r6 = 12
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:editTag"
            r0.put(r15, r6)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r6 = 20
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:share:qq"
            r0.put(r15, r6)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r6 = 22
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:share:QZone"
            r0.put(r15, r6)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r6 = 33
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:share:facebook"
            r0.put(r15, r6)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r6 = 24
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:share:enterprise"
            r0.put(r15, r6)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r6 = 28
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r13 = "menuItem:refresh"
            r0.put(r13, r15)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r13 = 26
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:share:weread"
            r0.put(r15, r13)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r13 = 29
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:addShortcut"
            r0.put(r15, r13)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r13 = 31
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:search"
            r0.put(r15, r13)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r13 = 34
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:readArticle"
            r0.put(r15, r13)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r13 = 35
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:minimize"
            r0.put(r15, r13)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r13 = 36
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:cancelMinimize"
            r0.put(r15, r13)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r13 = 37
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:translate"
            r0.put(r15, r13)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r13 = 38
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:haoKan"
            r0.put(r15, r13)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r13 = 39
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:cancelHaoKan"
            r0.put(r15, r13)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r13 = 40
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:ttsStart"
            r0.put(r15, r13)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r13 = 41
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r15 = "menuItem:ttsPause"
            r0.put(r15, r13)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r14.f119130c
            r13 = 42
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r14 = "menuItem:ttsResume"
            r0.put(r14, r13)
            com.tencent.mm.plugin.webview.ui.tools.g1 r0 = r1.f118465H1
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r13 = r0.mo68388b()
            boolean r13 = r13 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.game.GameWebViewUI
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            if (r13 == 0) goto L_0x0602
            java.util.Set<java.lang.Integer> r13 = r0.f119142o
            java.util.HashSet r13 = (java.util.HashSet) r13
            r13.add(r5)
            java.util.Set<java.lang.Integer> r0 = r0.f119142o
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.add(r6)
            goto L_0x061b
        L_0x0602:
            java.util.Set<java.lang.Integer> r13 = r0.f119142o
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            java.util.HashSet r13 = (java.util.HashSet) r13
            r13.add(r14)
            java.util.Set<java.lang.Integer> r13 = r0.f119142o
            java.util.HashSet r13 = (java.util.HashSet) r13
            r13.add(r5)
            java.util.Set<java.lang.Integer> r0 = r0.f119142o
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.add(r6)
        L_0x061b:
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            ca3.f r5 = r0.f117677Q0
            if (r5 == 0) goto L_0x0634
            ca3.f r0 = r1.f118503X0
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0.mo62555c(r5)
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            ca3.f r0 = r0.f117677Q0
            r1.f118503X0 = r0
            r0.mo62555c(r1)
            goto L_0x0638
        L_0x0634:
            ca3.f r5 = r1.f118503X0
            r0.f117677Q0 = r5
        L_0x0638:
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            r0.f117680T0 = r1
            boolean r5 = r1.f118532i
            if (r5 == 0) goto L_0x0643
            i93.e$a r5 = i93.C46206e.C46207a.ColdBoot
            goto L_0x0645
        L_0x0643:
            i93.e$a r5 = i93.C46206e.C46207a.WarmBoot
        L_0x0645:
            r0.f117595v = r5
            boolean r5 = r1.f118515c1
            if (r5 == 0) goto L_0x06a4
            f93.c r5 = r0.f117563f
            r5.f123644k = r2
            r0.f117532H = r4
            java.util.concurrent.ConcurrentLinkedDeque<com.tencent.mm.plugin.webview.core.b0> r5 = r0.f117545S
            java.util.Iterator r5 = r5.iterator()
        L_0x0657:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x066a
            java.lang.Object r6 = r5.next()
            com.tencent.mm.plugin.webview.core.b0 r6 = (com.tencent.p014mm.plugin.webview.core.C43505b0) r6
            boolean r6 = r6.mo67786t()
            if (r6 == 0) goto L_0x0657
            goto L_0x0697
        L_0x066a:
            rx3.g r5 = r0.f117688b1
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            com.tencent.mm.plugin.webview.ui.tools.g r5 = (com.tencent.p014mm.plugin.webview.p128ui.tools.C43976g) r5
            com.tencent.mm.ui.widget.MMWebView r6 = r0.f117553a
            android.content.Context r6 = r6.getActivityContextIfHas()
            r5.f119123a = r6
            com.tencent.mm.ui.widget.MMWebView r5 = r0.f117553a
            android.content.Context r5 = r5.getActivityContextIfHas()
            boolean r6 = r5 instanceof android.app.Activity
            if (r6 == 0) goto L_0x0689
            android.app.Activity r5 = (android.app.Activity) r5
            goto L_0x068a
        L_0x0689:
            r5 = r10
        L_0x068a:
            if (r5 == 0) goto L_0x0697
            android.content.Intent r5 = r5.getIntent()
            java.lang.String r6 = "it.intent"
            gy3.C87412m.m108593f(r5, r6)
            r0.f117603z = r5
        L_0x0697:
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.webview.ui.tools.k2 r5 = new com.tencent.mm.plugin.webview.ui.tools.k2
            r5.<init>(r1)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r5)
            goto L_0x06ab
        L_0x06a4:
            android.content.Intent r5 = r19.getIntent()
            r0.mo67677I(r5)
        L_0x06ab:
            com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper r0 = r1.f118463G1
            r0.mo68196j()
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            v83.b r0 = r0.f117573k
            boolean r5 = r19.mo68237H8()
            r0.f147523a = r5
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r5)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r1.f118490T = r0
            if (r0 != 0) goto L_0x06cb
            goto L_0x06d5
        L_0x06cb:
            com.tencent.mm.plugin.webview.ui.tools.x1 r5 = new com.tencent.mm.plugin.webview.ui.tools.x1
            r5.<init>(r1)
            r1.f118493U = r5
            r0.addAccessibilityStateChangeListener(r5)
        L_0x06d5:
            com.tencent.mm.plugin.webview.model.h2 r0 = r1.f118459E1
            com.tencent.mm.plugin.webview.core.y r5 = r1.f118513b1
            com.tencent.mm.plugin.webview.model.h2 r5 = r5.f117672L0
            if (r0 == r5) goto L_0x06fa
            r1.f118459E1 = r5
            android.content.Intent r0 = r19.getIntent()
            android.os.Bundle r0 = r0.getBundleExtra(r9)
            if (r0 == 0) goto L_0x06f7
            com.tencent.mm.plugin.webview.model.h2$a r6 = r5.f118131n
            if (r6 == 0) goto L_0x06ef
            r6.f118136a = r10
        L_0x06ef:
            com.tencent.mm.plugin.webview.model.h2$a r6 = new com.tencent.mm.plugin.webview.model.h2$a
            r6.<init>(r5, r0)
            r5.f118131n = r6
            goto L_0x06fa
        L_0x06f7:
            r5.getClass()
        L_0x06fa:
            com.tencent.mm.plugin.webview.model.h2 r0 = r1.f118459E1
            com.tencent.mm.plugin.webview.model.h2$m r5 = r0.f118118a
            if (r5 != 0) goto L_0x0707
            com.tencent.mm.plugin.webview.model.h2$m r5 = new com.tencent.mm.plugin.webview.model.h2$m
            r5.<init>(r0)
            r0.f118118a = r5
        L_0x0707:
            com.tencent.mm.plugin.webview.model.h2$m r0 = r0.f118118a
            com.tencent.mm.plugin.webview.core.y r5 = r1.f118513b1
            int r5 = r5.mo67758z()
            java.lang.String r6 = r1.f118476N
            r0.f118164d = r5
            r0.f118165e = r6
            java.lang.String r0 = "onCreate"
            r1.mo68260U8(r0)
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r5 = "from_scence"
            int r0 = r0.getIntExtra(r5, r4)
            android.content.Intent r5 = r19.getIntent()
            java.lang.String r6 = "KOpenArticleSceneFromScene"
            r9 = -1
            int r5 = r5.getIntExtra(r6, r9)
            com.tencent.mm.plugin.webview.core.y r6 = r1.f118513b1
            ea3.u r6 = r6.f117543Q
            if (r5 == r9) goto L_0x0738
            r6.f123353t = r5
            goto L_0x0744
        L_0x0738:
            if (r0 == r7) goto L_0x0741
            if (r0 == r12) goto L_0x073f
            r5 = 999(0x3e7, float:1.4E-42)
            goto L_0x0742
        L_0x073f:
            r5 = 2
            goto L_0x0742
        L_0x0741:
            r5 = 1
        L_0x0742:
            r6.f123353t = r5
        L_0x0744:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r4] = r0
            java.lang.String r0 = " onCreate fromScene %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r0, r5)
            int r0 = r19.mo68267Y7()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = eb0.C86493v0.m107223a(r0)
            r1.f118479P = r0
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r4] = r0
            java.lang.String r0 = " onCreate sessionId %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r0, r5)
            com.tencent.mm.plugin.webview.model.h2 r0 = r1.f118459E1
            com.tencent.mm.plugin.webview.model.h2$g r5 = r0.f118123f
            if (r5 != 0) goto L_0x0775
            com.tencent.mm.plugin.webview.model.h2$g r5 = new com.tencent.mm.plugin.webview.model.h2$g
            r5.<init>(r0)
            r0.f118123f = r5
        L_0x0775:
            com.tencent.mm.plugin.webview.model.h2$g r0 = r0.f118123f
            com.tencent.mm.plugin.webview.core.y r5 = r1.f118513b1
            int r5 = r5.mo67758z()
            java.lang.String r6 = r1.f118476N
            r0.f118152d = r5
            r0.f118153e = r6
            java.lang.String r5 = r19.mo6901n0()
            r0.f118150b = r5
            com.tencent.mm.plugin.webview.model.h2 r0 = r1.f118459E1
            com.tencent.mm.plugin.webview.model.h2$c r5 = r0.f118130m
            if (r5 != 0) goto L_0x0796
            com.tencent.mm.plugin.webview.model.h2$c r5 = new com.tencent.mm.plugin.webview.model.h2$c
            r5.<init>()
            r0.f118130m = r5
        L_0x0796:
            com.tencent.mm.plugin.webview.model.h2$c r0 = r0.f118130m
            java.lang.String r5 = r19.mo6901n0()
            r0.getClass()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r4] = r5
            java.lang.String r9 = "MicroMsg.WebviewReporter.DomainReporter"
            java.lang.String r10 = "setRawUrl, value = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r6)
            android.net.Uri r6 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x07f2 }
            java.lang.String r10 = r6.getScheme()     // Catch:{ Exception -> 0x07f2 }
            if (r10 == 0) goto L_0x07d2
            java.lang.String r10 = r6.getScheme()     // Catch:{ Exception -> 0x07f2 }
            java.lang.String r10 = r10.toLowerCase()     // Catch:{ Exception -> 0x07f2 }
            java.lang.String r13 = "http"
            boolean r10 = r10.startsWith(r13)     // Catch:{ Exception -> 0x07f2 }
            if (r10 != 0) goto L_0x07d2
            java.lang.String r0 = "rawUrl scheme is not http/https, skip, scheme = %s"
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x07f2 }
            java.lang.String r6 = r6.getScheme()     // Catch:{ Exception -> 0x07f2 }
            r10[r4] = r6     // Catch:{ Exception -> 0x07f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r10)     // Catch:{ Exception -> 0x07f2 }
            goto L_0x07fb
        L_0x07d2:
            java.lang.String r6 = r6.getHost()     // Catch:{ Exception -> 0x07f2 }
            if (r6 == 0) goto L_0x07e8
            java.lang.String r10 = r6.toLowerCase()     // Catch:{ Exception -> 0x07f2 }
            java.lang.String r13 = ".qq.com"
            boolean r10 = r10.endsWith(r13)     // Catch:{ Exception -> 0x07f2 }
            if (r10 == 0) goto L_0x07e5
            goto L_0x07e8
        L_0x07e5:
            r0.f118140a = r2     // Catch:{ Exception -> 0x07f2 }
            goto L_0x07fb
        L_0x07e8:
            java.lang.String r0 = "rawUrl, host is .qq.com, skip, host = %s"
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x07f2 }
            r10[r4] = r6     // Catch:{ Exception -> 0x07f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r10)     // Catch:{ Exception -> 0x07f2 }
            goto L_0x07fb
        L_0x07f2:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r5
            java.lang.String r5 = "parse rawUrl fail, rawUrl = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r5, r0)
        L_0x07fb:
            com.tencent.mm.plugin.webview.model.h2 r0 = r1.f118459E1
            com.tencent.mm.plugin.webview.model.r1 r5 = r0.f118133p
            if (r5 != 0) goto L_0x0808
            com.tencent.mm.plugin.webview.model.r1 r5 = new com.tencent.mm.plugin.webview.model.r1
            r5.<init>()
            r0.f118133p = r5
        L_0x0808:
            com.tencent.mm.plugin.webview.model.r1 r0 = r0.f118133p
            android.content.Intent r5 = r19.getIntent()
            r0.getClass()
            java.lang.String r6 = "intent"
            gy3.C87412m.m108594g(r5, r6)
            java.lang.String r6 = "jsapiargs"
            android.os.Bundle r5 = r5.getBundleExtra(r6)     // Catch:{ Exception -> 0x0831 }
            if (r5 == 0) goto L_0x083b
            java.lang.String r6 = "key_webview_secret_msg_info"
            byte[] r5 = r5.getByteArray(r6)     // Catch:{ Exception -> 0x0831 }
            if (r5 == 0) goto L_0x083b
            te3.j25 r6 = new te3.j25     // Catch:{ Exception -> 0x0831 }
            r6.<init>()     // Catch:{ Exception -> 0x0831 }
            r6.parseFrom(r5)     // Catch:{ Exception -> 0x0831 }
            r0.f118185a = r6     // Catch:{ Exception -> 0x0831 }
            goto L_0x083b
        L_0x0831:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "MicroMsg.WebViewSecretMsgReporter"
            java.lang.String r9 = "alvinluo initWebViewSecretMsgReporter exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r9, r5)
        L_0x083b:
            com.tencent.mm.plugin.webview.model.h2 r0 = r1.f118459E1
            com.tencent.mm.plugin.webview.model.r1 r5 = r0.f118133p
            if (r5 != 0) goto L_0x0848
            com.tencent.mm.plugin.webview.model.r1 r5 = new com.tencent.mm.plugin.webview.model.r1
            r5.<init>()
            r0.f118133p = r5
        L_0x0848:
            com.tencent.mm.plugin.webview.model.r1 r0 = r0.f118133p
            te3.j25 r0 = r0.f118185a
            if (r0 != 0) goto L_0x084f
            goto L_0x0851
        L_0x084f:
            r0.f135836i = r7
        L_0x0851:
            if (r0 != 0) goto L_0x0854
            goto L_0x088b
        L_0x0854:
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 23341(0x5b2d, float:3.2708E-41)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            int r9 = r0.f135831d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r4] = r9
            java.lang.String r9 = r0.f135832e
            r8[r2] = r9
            int r9 = r0.f135836i
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r7] = r9
            java.lang.String r9 = r0.f135833f
            r8[r12] = r9
            r9 = 4
            int r10 = r0.f135834g
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8[r9] = r10
            java.lang.String r9 = r0.f135835h
            r8[r11] = r9
            int r0 = r0.f135837j
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9 = 6
            r8[r9] = r0
            r5.mo160131h(r6, r8)
        L_0x088b:
            com.tencent.mm.plugin.webview.model.h2 r0 = r1.f118459E1
            com.tencent.mm.plugin.webview.model.y1 r5 = r0.f118134q
            if (r5 != 0) goto L_0x0898
            com.tencent.mm.plugin.webview.model.y1 r5 = new com.tencent.mm.plugin.webview.model.y1
            r5.<init>()
            r0.f118134q = r5
        L_0x0898:
            com.tencent.mm.plugin.webview.model.y1 r0 = r0.f118134q
            com.tencent.mm.plugin.webview.core.y r5 = r1.f118513b1
            d93.c r5 = r5.mo67698U()
            int r5 = r5.f122692i
            long r5 = (long) r5
            r0.f22369a = r5
            rx3.g<java.lang.Boolean> r5 = com.tencent.p014mm.plugin.webview.model.C6067y1.f22367c
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x08b6
            goto L_0x08be
        L_0x08b6:
            com.tencent.mm.plugin.webview.model.a2 r5 = new com.tencent.mm.plugin.webview.model.a2
            r5.<init>(r0)
            com.tencent.xweb.XWebSdk.setXWebReportRequestIpInterface(r5)
        L_0x08be:
            android.view.View r0 = r19.getContentView()     // Catch:{ Exception -> 0x08e0 }
            r1.f118519d2 = r0     // Catch:{ Exception -> 0x08e0 }
            r19.mo68259U7()     // Catch:{ Exception -> 0x08e0 }
            android.view.Window r0 = r19.getWindow()     // Catch:{ Exception -> 0x08e0 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x08e0 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x08e0 }
            android.view.View r0 = r0.getChildAt(r4)     // Catch:{ Exception -> 0x08e0 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x08e0 }
            com.tencent.mm.plugin.webview.ui.tools.s1 r5 = new com.tencent.mm.plugin.webview.ui.tools.s1     // Catch:{ Exception -> 0x08e0 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x08e0 }
            r0.addOnLayoutChangeListener(r5)     // Catch:{ Exception -> 0x08e0 }
            goto L_0x08ee
        L_0x08e0:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r5[r4] = r0
            java.lang.String r0 = "fixContentMargin error : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r5)
        L_0x08ee:
            boolean r0 = r19.mo68237H8()     // Catch:{ Exception -> 0x0911 }
            if (r0 == 0) goto L_0x091f
            boolean r0 = r1 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.game.H5GameWebViewUI     // Catch:{ Exception -> 0x0911 }
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x091f
            r0 = 21
            boolean r0 = p206nj.C11171e.m11046c(r0)     // Catch:{ Exception -> 0x0911 }
            if (r0 == 0) goto L_0x0909
            int r0 = r1.f118552p1     // Catch:{ Exception -> 0x0911 }
            if (r0 == 0) goto L_0x0909
            r1.setActionbarColor(r0)     // Catch:{ Exception -> 0x0911 }
            goto L_0x091f
        L_0x0909:
            int r0 = r19.mo63387d8()     // Catch:{ Exception -> 0x0911 }
            r1.mo68299o9(r0)     // Catch:{ Exception -> 0x0911 }
            goto L_0x091f
        L_0x0911:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r5[r4] = r0
            java.lang.String r0 = "tryToExpandToStatusBar error : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r5)
        L_0x091f:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$a r0 = new com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$a
            r0.<init>()
            j83.C9286a.m8929a(r0)
            boolean r0 = ke3.C88144b.m109787f()
            if (r0 == 0) goto L_0x096f
            we0.a r0 = new we0.a
            androidx.appcompat.app.AppCompatActivity r5 = r19.getContext()
            we0.a$b r6 = r1.f118525f2
            r0.<init>(r5, r6)
            r1.f118456D = r0
            com.tencent.mm.plugin.webview.ui.tools.n2 r0 = new com.tencent.mm.plugin.webview.ui.tools.n2
            r0.<init>(r1)
            r1.f118467I1 = r0
            java.lang.String r5 = "MicroMsg.WebViewVideoFullScreenHelper"
            java.lang.String r6 = "alive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r6 = r0.mo68388b()
            if (r6 != 0) goto L_0x0954
            java.lang.String r6 = "initOrientationListenerHelper  fail, ui is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
            goto L_0x0964
        L_0x0954:
            we0.a r5 = new we0.a
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r6 = r0.mo68388b()
            com.tencent.mm.plugin.webview.ui.tools.o2 r8 = new com.tencent.mm.plugin.webview.ui.tools.o2
            r8.<init>(r0)
            r5.<init>(r6, r8)
            r0.f119460d = r5
        L_0x0964:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r5 = r0.mo68388b()
            if (r5 == 0) goto L_0x096f
            ba3.e r0 = r0.f119461e
            r5.mo62535Y3(r0)
        L_0x096f:
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ServiceClickEvent> r0 = r1.f118495U1
            r0.alive()
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToH5FromMiniProgramEvent> r0 = r1.f118506Y0
            r0.alive()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper r0 = r1.f118477N1
            if (r0 == 0) goto L_0x0a45
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r5 = r0.f118667d
            if (r5 != 0) goto L_0x0983
            goto L_0x0a45
        L_0x0983:
            java.lang.String r5 = r5.getCurrentURL()
            r0.f118670g = r5
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r5 = r0.f118667d
            com.tencent.mm.ui.widget.MMWebView r5 = r5.f118523f
            r0.f118666c = r5
            com.tencent.mm.plugin.webview.WebViewTransHelper r5 = new com.tencent.mm.plugin.webview.WebViewTransHelper
            r5.<init>(r0)
            r0.f118669f = r5
            java.lang.String r5 = "MicroMsg.WebViewUIStyleHelper"
            java.lang.String r6 = "init transHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r6 = r0.f118667d
            androidx.lifecycle.j r6 = r6.getLifecycle()
            com.tencent.mm.plugin.webview.WebViewTransHelper r8 = r0.f118669f
            r6.addObserver(r8)
            com.tencent.mm.plugin.webview.WebViewTransHelper$a r6 = new com.tencent.mm.plugin.webview.WebViewTransHelper$a
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            com.tencent.mm.plugin.webview.WebViewTransHelper r9 = r0.f118669f
            r8.<init>(r9)
            r6.<init>(r8)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r8 = r0.f118667d
            com.tencent.mm.plugin.webview.core.y r8 = r8.f118513b1
            r8.mo67671F(r6)
            aa3.a r6 = new aa3.a
            r6.<init>()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r8 = r0.f118667d
            com.tencent.mm.plugin.webview.core.y r8 = r8.f118513b1
            r8.mo67671F(r6)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r6 = r0.f118667d
            com.tencent.mm.plugin.webview.core.y r6 = r6.f118513b1
            i83.s r6 = r6.f117679S0
            java.lang.String r8 = "<set-?>"
            if (r6 == 0) goto L_0x09e7
            java.lang.String r9 = r6.f124519a
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x09da
            goto L_0x09e7
        L_0x09da:
            com.tencent.mm.plugin.webview.WebViewTransHelper r9 = r0.f118669f
            java.lang.String r10 = r6.f124519a
            r9.getClass()
            gy3.C87412m.m108594g(r10, r8)
            r9.f117512o = r10
            goto L_0x09f7
        L_0x09e7:
            com.tencent.mm.plugin.webview.WebViewTransHelper r9 = r0.f118669f
            r10 = 32
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.getRandomString(r10)
            r9.getClass()
            gy3.C87412m.m108594g(r10, r8)
            r9.f117512o = r10
        L_0x09f7:
            if (r6 == 0) goto L_0x0a0b
            i83.a0 r6 = r6.f124520b
            i83.a0 r8 = i83.C46176a0.None
            if (r6 == r8) goto L_0x0a0b
            com.tencent.mm.plugin.webview.WebViewTransHelper r8 = r0.f118669f
            androidx.lifecycle.z<i83.a0> r8 = r8.f117508h
            r8.setValue(r6)
            com.tencent.mm.ui.widget.MMWebView r6 = r0.f118666c
            r6.reload()
        L_0x0a0b:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r6 = r0.f118667d
            if (r6 != 0) goto L_0x0a10
            goto L_0x0a33
        L_0x0a10:
            com.tencent.mm.plugin.webview.ui.tools.t0 r6 = r6.f118478O1
            com.tencent.mm.plugin.webview.ui.tools.p0 r6 = r6.f23849b
            boolean r6 = r6.f23838d
            com.tencent.mm.plugin.webview.WebViewTransHelper r8 = r0.f118669f
            r8.f117506f = r6
            r8 = r6 ^ 1
            r0.f118676m = r8
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r8[r4] = r6
            boolean r6 = r0.f118676m
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r8[r2] = r6
            java.lang.String r6 = "initWebViewTitleStyle hideWebViewTitle: %s, canShowTopBar: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r8)
        L_0x0a33:
            boolean r6 = r0.f118664a
            if (r6 == 0) goto L_0x0a3d
            java.lang.String r0 = "initNewWebViewUIStyleIfNeed, disableLightActionbarStyle true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0a45
        L_0x0a3d:
            java.lang.String r6 = "initNewWebViewUIStyleIfNeed, disableLightActionbarStyle false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            r0.mo68379k()
        L_0x0a45:
            boolean r0 = r19.mo68240J8()
            if (r0 == 0) goto L_0x0a69
            android.view.Window r0 = r19.getWindow()
            android.view.View r0 = r0.getDecorView()
            r5 = 4866(0x1302, float:6.819E-42)
            m47808J7(r0, r5)
            android.view.Window r0 = r19.getWindow()
            r5 = 1024(0x400, float:1.435E-42)
            r0.addFlags(r5)
            r5 = -1
            r1.setActionbarElementColor(r5)
            r1.mo68285h9(r5)
            goto L_0x0a76
        L_0x0a69:
            android.view.Window r0 = r19.getWindow()
            android.view.View r0 = r0.getDecorView()
            r5 = 256(0x100, float:3.59E-43)
            m47808J7(r0, r5)
        L_0x0a76:
            com.tencent.mm.plugin.webview.model.h2 r0 = r1.f118459E1
            android.content.Intent r5 = r19.getIntent()
            java.lang.String r6 = "start_activity_time"
            r8 = 0
            long r5 = r5.getLongExtra(r6, r8)
            r0.getClass()
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0a8c
            goto L_0x0ab1
        L_0x0a8c:
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r5
            int r0 = (int) r8
            if (r0 < 0) goto L_0x0ab1
            r8 = 20000(0x4e20, float:2.8026E-41)
            if (r0 >= r8) goto L_0x0ab1
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 16269(0x3f8d, float:2.2798E-41)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r4] = r0
            r10 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r10
            int r0 = (int) r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r2] = r0
            r8.mo160131h(r9, r7)
        L_0x0ab1:
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r5 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122326r
            boolean r0 = r0.getBooleanExtra(r5, r4)
            if (r0 != 0) goto L_0x0b04
            java.lang.Boolean r0 = f118444F2
            if (r0 != 0) goto L_0x0afc
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0aed }
            java.lang.String r5 = "clicfg_webview_force_dark_disable"
            java.lang.String r6 = "0"
            java.lang.String r0 = r0.mo182444f(r5, r6, r4, r2)     // Catch:{ Exception -> 0x0aed }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)     // Catch:{ Exception -> 0x0aed }
            if (r0 <= 0) goto L_0x0ae0
            java.lang.String r0 = "disableForceDark on!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x0aed }
            java.lang.Boolean r0 = new java.lang.Boolean     // Catch:{ Exception -> 0x0aed }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0aed }
            f118444F2 = r0     // Catch:{ Exception -> 0x0aed }
            goto L_0x0afc
        L_0x0ae0:
            java.lang.String r0 = "disableForceDark close!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x0aed }
            java.lang.Boolean r0 = new java.lang.Boolean     // Catch:{ Exception -> 0x0aed }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0aed }
            f118444F2 = r0     // Catch:{ Exception -> 0x0aed }
            goto L_0x0afc
        L_0x0aed:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "disableForceDark"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r6, r5)
            java.lang.Boolean r0 = new java.lang.Boolean
            r0.<init>(r4)
            f118444F2 = r0
        L_0x0afc:
            java.lang.Boolean r0 = f118444F2
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0b0f
        L_0x0b04:
            com.tencent.mm.ui.widget.MMWebView r0 = r1.f118523f
            if (r0 == 0) goto L_0x0b0f
            com.tencent.xweb.WebSettings r0 = r0.getSettings()
            r0.setForceDarkBehavior(r2)
        L_0x0b0f:
            com.tencent.mm.plugin.webview.ui.tools.x0 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C44395x0.f120338a
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r2 = "rawUrl"
            java.lang.String r0 = r0.getStringExtra(r2)
            if (r0 != 0) goto L_0x0b1e
            goto L_0x0b28
        L_0x0b1e:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI>> r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C44395x0.f120339b
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r1)
            r2.put(r0, r3)
        L_0x0b28:
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r2 = "key_first_tips"
            java.lang.String r4 = r0.getStringExtra(r2)
            android.content.Intent r0 = r19.getIntent()
            java.lang.String r2 = "key_first_tips_title"
            java.lang.String r5 = r0.getStringExtra(r2)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r0 != 0) goto L_0x0b56
            androidx.appcompat.app.AppCompatActivity r3 = r19.getContext()
            r0 = 2131821557(0x7f1103f5, float:1.927586E38)
            java.lang.String r6 = r1.getString(r0)
            r7 = 0
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$h0 r8 = new com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$h0
            r8.<init>(r1)
            nj3.C76879j.m92711E(r3, r4, r5, r6, r7, r8)
        L_0x0b56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI.mo63703Y8():void");
    }

    /* renamed from: Z7 */
    public int mo68268Z7() {
        WebViewUIStyleHelper.C43828c a8 = mo68270a8();
        int i = a8 != null ? a8.f118697g : -1;
        Log.m105924i("MicroMsg.WebViewUI", "getCurrentMPPageItemShowType  itemShowType:" + i);
        return i;
    }

    /* renamed from: Z8 */
    public void mo68269Z8(ResolveInfo resolveInfo) {
        C43741b bVar = this.f118537j2;
        C43791l lVar = this.f118511a1;
        bVar.getClass();
        if (!isFinishing()) {
            String currentURL = getCurrentURL();
            if (Util.isNullOrNil(currentURL)) {
                Log.m105920e("MicroMsg.BrowserChooserHelper", "open in browser fail, url is null");
                return;
            }
            if (lVar != null) {
                try {
                    currentURL = lVar.mo68123cU(currentURL);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.BrowserChooserHelper", "showAndOpenInBrowser, getShareUrl, exception = %s", e);
                }
            }
            if (!currentURL.startsWith(HttpWrapperBase.PROTOCAL_HTTP) && !currentURL.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
                currentURL = HttpWrapperBase.PROTOCAL_HTTP + currentURL;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(currentURL));
            intent.putExtra("targeturl", currentURL);
            C46969f.m52280e(this, intent, resolveInfo);
        }
    }

    /* renamed from: a8 */
    public WebViewUIStyleHelper.C43828c mo68270a8() {
        WebViewUIStyleHelper webViewUIStyleHelper = this.f118477N1;
        if (webViewUIStyleHelper == null) {
            return null;
        }
        return webViewUIStyleHelper.mo68370b(getCurrentURL());
    }

    /* renamed from: a9 */
    public void mo63385a9() {
        int i;
        int i2;
        int i3;
        HandOffURL handOffURL;
        boolean z;
        BallInfo e0;
        C53513a aVar;
        Class cls = C92331c.class;
        if (this.f118581y1 || this.f118577x1 || isFinishing()) {
            Log.m105920e("MicroMsg.WebViewUI", "edw postBinded finished");
            return;
        }
        C48574a1 f8 = mo68279f8();
        if (f8 != null) {
            f8.f129947a = this.f118513b1.mo67720g0();
        }
        C43791l m = this.f118513b1.mo67731m();
        this.f118511a1 = m;
        try {
            m.Np0(this.f118492T1, mo68267Y7());
        } catch (RemoteException e) {
            Log.printErrStackTrace("MicroMsg.WebViewUI", e, "addCallbacker", new Object[0]);
        }
        Log.m105924i("MicroMsg.WebViewUI", "edw postBinded");
        this.f118480P1 = new C43859b(new C22663i(this), this);
        String stringExtra = getIntent().getStringExtra("float_ball_key");
        int i4 = 2;
        if (!Util.isNullOrNil(stringExtra)) {
            this.f118480P1.mo35648A(2, stringExtra);
        } else {
            this.f118480P1.mo35648A(2, MD5Util.getMD5String(String.format("%s#%s", new Object[]{Long.valueOf(System.currentTimeMillis()), mo6901n0()})));
        }
        this.f118480P1.mo67998q0(mo6901n0());
        this.f118480P1.mo149079t0("rawUrl", mo6901n0());
        C43859b bVar = this.f118480P1;
        bVar.getReportInfo().f311718g = mo6901n0();
        bVar.mo68414O();
        C45293c cVar = new C45293c(this);
        this.f118483Q1 = new C53513a(cVar, this);
        String stringExtra2 = getIntent().getStringExtra("float_ball_key");
        if (!Util.isNullOrNil(stringExtra2)) {
            this.f118483Q1.mo35809D(2, stringExtra2);
        } else {
            this.f118483Q1.mo35809D(2, C56887p.m65610d(((C45696d) C86709a0.m107533q(C45696d.class)).mo70950A9(mo6901n0())));
        }
        this.f118483Q1.f150468z.f135051e = mo6901n0();
        this.f118483Q1.getClass();
        if (BuildInfo.IS_FLAVOR_RED ? true : ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_multitask_fullscreen_scroll_enable, true)) {
            C45292b bVar2 = cVar.f122671c;
            this.f118449A2 = bVar2 != null ? bVar2.mo70827e() : null;
        }
        C43859b bVar3 = this.f118480P1;
        if (bVar3 != null) {
            bVar3.mo64003o();
        }
        C53513a aVar2 = this.f118483Q1;
        if (aVar2 != null) {
            aVar2.mo74188E();
        }
        HandOffURL handOffURL2 = this.f118475M1;
        boolean z2 = handOffURL2 != null;
        if (handOffURL2 == null) {
            this.f118475M1 = new HandOffURL(mo6901n0(), mo6901n0(), "");
        }
        if (!C85875k4.m106163T() || (aVar = this.f118483Q1) == null) {
            C43859b bVar4 = this.f118480P1;
            if (!(bVar4 == null || (e0 = bVar4.mo149069e0()) == null)) {
                String str = e0.f311699t;
                if (!Util.isNullOrNil(str)) {
                    this.f118475M1.setTitle(str);
                }
                this.f118475M1.setIcon(Util.nullAsNil(e0.f311695p));
            }
        } else {
            MultiTaskInfo multiTaskInfo = aVar.f326418a;
            if (multiTaskInfo != null) {
                String str2 = multiTaskInfo.mo80305m2().f183752e;
                if (!Util.isNullOrNil(str2)) {
                    this.f118475M1.setTitle(str2);
                }
                this.f118475M1.setIcon(Util.nullAsNil(multiTaskInfo.mo80305m2().f183756i));
            }
        }
        if (mo68243L8()) {
            if (z2) {
                ((C92331c) C86312j.m106911c(cls)).Gg0(this.f118475M1);
                Log.m105924i("MicroMsg.WebViewUI", "[Handoff] onPostBinded, exist:true, call upsert " + this.f118475M1.toString());
            } else {
                ((C92331c) C86312j.m106911c(cls)).mo58361Xv(this.f118475M1);
                Log.m105924i("MicroMsg.WebViewUI", "[Handoff] onPostBinded, exist:false, call onWebViewCreate " + this.f118475M1.toString());
            }
        }
        mo68228C9(mo6901n0());
        if (this.f118461F1 == null) {
            this.f118461F1 = new C43697c(this.f118459E1);
        }
        C43697c cVar2 = this.f118461F1;
        C43791l lVar = this.f118511a1;
        cVar2.getClass();
        try {
            String mf02 = lVar.mf0("DNSAdvanceOpen");
            Log.m105925i("MicroMsg.DNSPreGetOptimize", "switch open value : %s", mf02);
            if (Util.isNullOrNil(mf02)) {
                Log.m105920e("MicroMsg.DNSPreGetOptimize", "get switch value is null or nil");
                z = false;
            } else {
                z = mf02.equalsIgnoreCase("1");
            }
            if (!z) {
                Log.m105924i("MicroMsg.DNSPreGetOptimize", "server closed the switch");
            } else {
                try {
                    String mf03 = lVar.mf0("DNSAdvanceRelateDomain");
                    if (Util.isNullOrNil(mf03)) {
                        Log.m105920e("MicroMsg.DNSPreGetOptimize", "domain list is null, just return");
                    } else {
                        C9286a.m8929a(new C43696b(cVar2, mf03));
                    }
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.DNSPreGetOptimize", e2, "", new Object[0]);
                }
            }
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.DNSPreGetOptimize", "get dns pre get switch failed");
        }
        if (mo68244M8()) {
            MMHandlerThread.postToMainThread(new WebViewUI$$r(this));
        }
        String q1 = this.f118513b1.mo67819q1();
        mo68224A9(q1);
        mo68226B9(q1);
        try {
            WebViewUIStyleHelper.C43828c a8 = mo68270a8();
            if (!(a8 == null || (handOffURL = this.f118475M1) == null)) {
                handOffURL.setTitle(Util.nullAsNil(a8.f118694d));
                this.f118475M1.setIcon(Util.nullAsNil(a8.f118693c));
                this.f118475M1.setNickname(Util.nullAsNil(a8.f118692b));
                if (mo68243L8()) {
                    ((C92331c) C86312j.m106911c(cls)).Gg0(this.f118475M1);
                }
            }
        } catch (Exception e3) {
            Log.printErrStackTrace("MicroMsg.WebViewUI", e3, "fillMpInfoToHandOff fail", new Object[0]);
        }
        boolean booleanExtra = getIntent().getBooleanExtra("disable_bounce_scroll", false);
        Log.m105925i("MicroMsg.WebViewUI", "postBinded disableBounceScroll = %b", Boolean.valueOf(booleanExtra));
        if (booleanExtra) {
            this.f118531h2.mo68760e(true);
        }
        this.f118513b1.f117543Q.mo73829a("onJSAPIEnd", System.currentTimeMillis());
        C43704h2 h2Var = this.f118459E1;
        boolean startsWith = Util.nullAsNil(mo6901n0()).startsWith(HttpWrapperBase.PROTOCAL_HTTPS);
        h2Var.getClass();
        C43704h2.f118116s = 0;
        if (startsWith) {
            C43704h2.f118117t = 1;
        } else {
            C43704h2.f118117t = 0;
        }
        try {
            i2 = Util.getInt(this.f118511a1.mf0("XwebBatchTranslateMaxByteLength"), 0);
            i = Util.getInt(this.f118511a1.mf0("XwebBatchTranslateMaxCnt"), 0);
        } catch (Exception e4) {
            Log.m105928w("MicroMsg.WebViewUI", "getting flag of XwebBatchTranslate para failid, ex = " + e4.getMessage());
            i2 = 0;
            i = 0;
        }
        Log.m105924i("MicroMsg.WebViewUI", "getting flag of XwebBatchTranslate para BatchTranslateMaxByteLength  = " + i2 + " BatchTranslateCnt = " + i);
        mo68225B8(mo68313t9());
        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.cho, (ViewGroup) null);
        this.f118569v = inflate;
        FontChooserView fontChooserView = (FontChooserView) inflate.findViewById(C0966R.C0970id.ecv);
        View findViewById = this.f118569v.findViewById(C0966R.C0970id.ecu);
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar3.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "initFontChooserView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "initFontChooserView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new C6177h2(this));
        fontChooserView.setOnChangeListener(new WebViewUI$$l0(this, (C438121) null));
        this.f118569v.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        this.f118575x.addView(this.f118569v);
        View view2 = this.f118569v;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "initFontChooserView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "initFontChooserView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        try {
            if (this.f118511a1.mo68094Fu()) {
                if (!mo68232E8()) {
                    if (!mo68229D8()) {
                        i3 = C45598m.m50660b(getContext(), this.f118511a1, mo6901n0());
                        if (i3 >= 1 && i3 <= 8) {
                            i4 = i3;
                        }
                        fontChooserView.setSliderIndex(i4 - 1);
                        this.f118513b1.mo67828z1(i4);
                        mo68252P8(i4);
                    }
                }
                i3 = C45598m.m50659a(getContext());
                i4 = i3;
                fontChooserView.setSliderIndex(i4 - 1);
                this.f118513b1.mo67828z1(i4);
                mo68252P8(i4);
            }
        } catch (Exception e5) {
            Log.m105928w("MicroMsg.WebViewUI", "initFontChooserView, ex = " + e5.getMessage());
        }
        i3 = 2;
        i4 = i3;
        fontChooserView.setSliderIndex(i4 - 1);
        this.f118513b1.mo67828z1(i4);
        mo68252P8(i4);
    }

    public void addIconOptionMenu(int i, int i2, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        if (!C11171e.m11046c(21)) {
            super.addIconOptionMenu(i, i2, onMenuItemClickListener);
            return;
        }
        Object obj = C111105a.f332697a;
        Drawable b = C111105a.C111110c.m151511b(this, i2);
        if (b != null) {
            if (mo68227C8()) {
                b.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            } else {
                WebViewUIStyleHelper webViewUIStyleHelper = this.f118477N1;
                if (webViewUIStyleHelper == null || webViewUIStyleHelper.f118664a) {
                    b.clearColorFilter();
                } else {
                    b.setColorFilter(getResources().getColor(C0966R.color.FG_0), PorterDuff.Mode.SRC_ATOP);
                }
            }
            addIconOptionMenu(i, getString(C0966R.string.a0h), b, onMenuItemClickListener);
        }
    }

    /* renamed from: b8 */
    public C52805a mo68272b8() {
        C48590l lVar = this.f118508Z;
        if (lVar == null) {
            return new C52805a();
        }
        if (lVar.f129984D == null) {
            lVar.f129984D = new C52805a();
        }
        C52805a aVar = lVar.f129984D;
        aVar.f147521a = lVar.f129996a;
        return aVar;
    }

    /* renamed from: b9 */
    public void mo68273b9(Callable<Void> callable) {
        String i = C86709a0.m107522a() ? C86709a0.m107523b().mo121111i() : "MMWebViewTransShouldPullHalfScreenNotice";
        if (Util.isNullOrNil(i)) {
            Log.m105920e("MicroMsg.WebViewUI", "kvName is null");
            return;
        }
        MultiProcessMMKV.getSingleMMKV(i).encode("MMWebViewTransHasPullBefore", true);
        C101218e0 e0Var = new C101218e0(getContext(), 2, 2);
        e0Var.mo140671q(getResources().getString(C0966R.string.lgp));
        e0Var.mo140677w(getResources().getString(C0966R.string.f8029zr));
        e0Var.mo140676v(1);
        TextView textView = new TextView(getContext());
        textView.setTextColor(getResources().getColor(C0966R.color.FG_0));
        textView.setText(getResources().getString(C0966R.string.lgo));
        e0Var.f296375F = new WebViewUI$$a0(this, callable, e0Var);
        Log.m105924i("MicroMsg.WebViewUI", "show trans notice");
        e0Var.mo140663j(textView);
        e0Var.mo140655A();
    }

    /* renamed from: c8 */
    public int mo68274c8() {
        return ((!C11171e.m11046c(21) || !mo68227C8()) && C85875k4.m106211z()) ? -1 : -16777216;
    }

    /* renamed from: c9 */
    public void mo68275c9(String str, Drawable drawable) {
        addIconOptionMenu(0, str, drawable, (MenuItem.OnMenuItemClickListener) new WebViewUI$$s(this, this.f118513b1.mo67826x1(), getIntent().getStringExtra("srcUsername")));
    }

    public boolean convertActivityFromTranslucent() {
        return getIntent().getBooleanExtra("convertActivityFromTranslucent", false);
    }

    /* renamed from: d8 */
    public int mo63387d8() {
        return getActionbarColor();
    }

    /* renamed from: d9 */
    public void mo68276d9() {
        C39935f fVar = this.f118503X0;
        C39753d dVar = fVar.f107072g;
        if ((dVar == null || dVar.f106652b == null) ? false : true) {
            fVar.mo62553a(false);
        }
        C43522y yVar = this.f118513b1;
        if (yVar != null) {
            yVar.reload();
        }
    }

    /* renamed from: e8 */
    public LinkedList<C47506e.C47507a> mo68277e8() {
        if (this.f118523f == null) {
            Log.m105920e("MicroMsg.WebViewUI", "viewwv is null, maybe has destroyed");
            return null;
        }
        String n0 = mo6901n0();
        MMWebView mMWebView = this.f118523f;
        if (mMWebView != null) {
            String url = mMWebView.getUrl();
            if (!Util.isNullOrNil(url)) {
                n0 = url;
            }
        }
        if (n0 == null) {
            return null;
        }
        try {
            URL url2 = new URL(n0);
            Pattern compile = Pattern.compile(".*(\\.wanggou\\.com|\\.jd\\.com)");
            String host = url2.getHost();
            if (Util.isNullOrNil(host)) {
                return null;
            }
            if (!host.startsWith(".")) {
                host = "." + host;
            }
            Log.m105919d("MicroMsg.WebViewUI", "host = %s", host);
            if (compile.matcher(host).matches()) {
                if (this.f118567u1 == null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Map jx = this.f118511a1.mo68139jx();
                    this.f118567u1 = jx;
                    Object[] objArr = new Object[2];
                    objArr[0] = Boolean.valueOf(jx != null);
                    objArr[1] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
                    Log.m105919d("MicroMsg.WebViewUI", "[hakon] getConfigListMap %b, cost %d", objArr);
                }
                Map map = this.f118567u1;
                if (map != null && map.size() > 0) {
                    return C47506e.m52835a(this.f118567u1);
                }
            }
            return null;
        } catch (Exception e) {
            Log.m105919d("MicroMsg.WebViewUI", "[hakon] getJDMenuItems, ex = ", e.getMessage());
        }
    }

    /* renamed from: e9 */
    public void mo68278e9(boolean z, boolean z2) {
        this.f118450B = z;
        C87763b bVar = null;
        if (z) {
            ActionBar actionBar = this.f118547o;
            if (actionBar != null) {
                actionBar.mo91104o();
            }
            if (this.f118519d2 != null) {
                mo68290j9(0);
            }
            View view = this.f118519d2;
            if (view != null) {
                while (true) {
                    if (!(view instanceof C87763b)) {
                        ViewParent parent = view.getParent();
                        if (parent == null || !(parent instanceof ViewGroup)) {
                            break;
                        }
                        view = (View) parent;
                    } else {
                        bVar = (C87763b) view;
                        break;
                    }
                }
            }
            if (bVar != null) {
                bVar.mo122166H(true);
            }
            getWindow().addFlags(1024);
            View decorView = getWindow().getDecorView();
            decorView.setOnSystemUiVisibilityChangeListener(new WebViewUI$$d(this, decorView));
            m47808J7(decorView, 5894);
            if (z2) {
                this.f118583z.setOnClickListener(new WebViewUI$$e(this));
                this.f118583z.setVisibility(0);
                return;
            }
            this.f118583z.setVisibility(8);
            return;
        }
        this.f118583z.setVisibility(8);
        getWindow().clearFlags(1024);
        View decorView2 = getWindow().getDecorView();
        if (decorView2 != null) {
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -5895);
        }
        ActionBar actionBar2 = this.f118547o;
        if (actionBar2 != null) {
            actionBar2.mo91094L();
            if (this.f118519d2 != null) {
                mo68290j9(mo68287i8());
            }
        }
        View view2 = this.f118519d2;
        if (view2 != null) {
            while (true) {
                if (!(view2 instanceof C87763b)) {
                    ViewParent parent2 = view2.getParent();
                    if (parent2 == null || !(parent2 instanceof ViewGroup)) {
                        break;
                    }
                    view2 = (View) parent2;
                } else {
                    bVar = (C87763b) view2;
                    break;
                }
            }
        }
        if (bVar != null) {
            bVar.mo122166H(false);
        }
    }

    /* renamed from: f1 */
    public void mo62537f1(C91165a.C53318a aVar) {
        this.f118503X0.mo62537f1(aVar);
    }

    /* renamed from: f8 */
    public C48574a1 mo68279f8() {
        return null;
    }

    /* renamed from: f9 */
    public void mo68280f9(int i) {
        this.f118508Z.mo73243l("sendAppMessage", true);
        this.f118508Z.mo73237f0(this.f118465H1.mo68588x(), i);
        this.f118459E1.mo68014l("mm_send_friend_count");
    }

    public void finish() {
        C53513a aVar;
        boolean z = true;
        Object[] objArr = new Object[1];
        C43522y yVar = this.f118513b1;
        objArr[0] = yVar != null ? Integer.valueOf(yVar.mo67719g()) : "null";
        Log.m105925i("MicroMsg.WebViewUI", "Call finish %s", objArr);
        hideVKB();
        MMHandler mMHandler = this.f118501W1;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
        this.f118581y1 = true;
        boolean z2 = C43861d.m48034d() && this.f118511a1 != null && (aVar = this.f118483Q1) != null && aVar.mo160080e();
        C43522y yVar2 = this.f118513b1;
        if (yVar2 != null) {
            yVar2.mo67695S0(z2);
            yVar2.f117532H = true;
        }
        super.finish();
        C53513a aVar2 = this.f118483Q1;
        if (aVar2 == null || !aVar2.mo160082g()) {
            z = false;
        }
        if (C85875k4.m106197n0() && !z) {
            overridePendingTransition(0, MMFragmentActivity$$c.f318651h);
        }
        if (getIntent().getBooleanExtra("KPopUpTransition", false)) {
            overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
        }
        C43859b bVar = this.f118480P1;
        if (bVar != null) {
            bVar.mo149068c0();
        }
    }

    /* renamed from: g7 */
    public void mo68281g7(Bundle bundle) {
        if (bundle != null) {
            "black".equals(bundle.getString("style"));
            mo68305r8().setCommentTopicId(bundle.getLong("commentTopicId"));
        }
        C44366w0 r8 = mo68305r8();
        String currentURL = getCurrentURL();
        r8.getClass();
        if (!Util.isNullOrNil(currentURL)) {
            r8.f120246M = currentURL;
        }
        C44366w0 r84 = mo68305r8();
        r84.mo69123q(1);
        r84.mo69119n(false);
        r84.mo69141x(false);
    }

    /* renamed from: g8 */
    public JsapiPermissionWrapper mo68282g8() {
        C45310h hVar;
        C46661f fVar = this.f118458E;
        if (!fVar.f125614a) {
            return this.f118513b1.f117539M.mo70860c();
        }
        C43522y yVar = fVar.f125624k;
        if (yVar == null || (hVar = yVar.f117539M) == null) {
            return null;
        }
        return hVar.mo70860c();
    }

    /* renamed from: g9 */
    public void mo68283g9(boolean z) {
        TextView textView;
        Log.m105919d("MicroMsg.WebViewUI", "setAccessibilityFocusable %b", Boolean.valueOf(z));
        if (C78844a.C15689b.f42385a.mo108842h(true)) {
            ActionBar actionBar = this.f118547o;
            View j = actionBar == null ? null : actionBar.mo91099j();
            if (z) {
                this.f118571v2 = isOptionMenuShow(0);
                this.f118574w2 = j != null ? j.getVisibility() : 0;
                showOptionMenu(0, false);
                if (j != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(4);
                    View view = j;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "setAccessibilityFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "setAccessibilityFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                showOptionMenu(0, this.f118571v2);
                if (j != null) {
                    int i = this.f118574w2;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Integer.valueOf(i));
                    View view2 = j;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "setAccessibilityFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "setAccessibilityFocusable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            C44125o1 o1Var = this.f118531h2;
            if (o1Var != null && (textView = o1Var.f119539o) != null) {
                C46746a aVar3 = C46746a.f125826a;
                if (!z) {
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107208b.m145191s(textView, 1);
                    return;
                }
                WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                C107207u.C107208b.m145191s(textView, 2);
            }
        }
    }

    public int getActionBarHeightFromTheme() {
        return mo68265X7();
    }

    public String getCurrentURL() {
        C43522y yVar = this.f118513b1;
        return (yVar == null || Util.isNullOrNil(yVar.getCurrentUrl())) ? mo6901n0() : this.f118513b1.getCurrentUrl();
    }

    public int getForceOrientation() {
        C39753d dVar = this.f118503X0.f107072g;
        boolean z = false;
        if (!(dVar == null || dVar.f106652b == null)) {
            z = true;
        }
        return z ? getRequestedOrientation() : this.f118447A;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cht;
    }

    /* renamed from: h9 */
    public void mo68285h9(int i) {
        Drawable mutate = getResources().getDrawable(mo68263W7()).mutate();
        mutate.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        updateBackBtn(mutate);
    }

    public void hideVKB() {
        super.hideVKB();
        this.f118494U0 = true;
        this.f118585z2 = -2;
    }

    /* renamed from: i8 */
    public final int mo68287i8() {
        int i = 0;
        if (mo68237H8()) {
            return 0;
        }
        if (C87771d.f254121g) {
            i = C87771d.m109203b(this).f254129e;
        }
        ActionBar actionBar = this.f118547o;
        return (actionBar == null || !actionBar.mo91106q()) ? i : i + mo68265X7();
    }

    /* renamed from: i9 */
    public void mo68288i9(boolean z) {
        C44199u0 u0Var = this.f118557r;
        if (u0Var != null) {
            u0Var.f119742g = z;
            if (!z) {
                u0Var.mo68844b();
            } else {
                u0Var.mo68845c();
            }
        }
        MMWebView mMWebView = this.f118523f;
        if (mMWebView != null && this.f118560s != null) {
            boolean z2 = false;
            this.f118563t.setEnabled(mMWebView.canGoBack());
            ImageButton imageButton = this.f118566u;
            MMWebView mMWebView2 = this.f118523f;
            if (mMWebView2 != null && mMWebView2.canGoForward()) {
                z2 = true;
            }
            imageButton.setEnabled(z2);
        }
    }

    public void initActivityCloseAnimation() {
        C53513a aVar = this.f118483Q1;
        boolean z = aVar != null && aVar.mo160082g();
        if (!C85875k4.m106197n0() || z) {
            super.initActivityCloseAnimation();
        } else {
            overridePendingTransition(0, MMFragmentActivity$$c.f318651h);
        }
    }

    public void initSwipeBack() {
        super.initSwipeBack();
        if (getSwipeBackLayout() != null) {
            this.f118548o1 = true;
        }
    }

    public void initView() {
        this.f118572w = (WebViewKeyboardLinearLayout) findViewById(C0966R.C0970id.lmr);
        this.f118575x = (FrameLayout) findViewById(C0966R.C0970id.iwf);
        this.f118496V = getIntent().getBooleanExtra("finishviewifloadfailed", false);
        this.f118487S = getIntent().getBooleanExtra("is_favorite_item", false);
        this.f118484R = getIntent().getBooleanExtra("isWebwx", true);
        boolean booleanExtra = getIntent().getBooleanExtra("show_feedback", false);
        this.f118542m1 = Util.nullAsNil(getIntent().getStringExtra("sentUsername"));
        if (booleanExtra) {
            addTextOptionMenu(1, getString(C0966R.string.isb), new WebViewUI$$f(this));
        }
        this.f118550p = (ProgressBar) findViewById(C0966R.C0970id.bw6);
        if (mo68237H8() && this.f118478O1.f23849b.f23836b) {
            this.f118550p.setIndeterminateDrawable(getResources().getDrawable(C0966R.C0969drawable.an7));
        }
        this.f118536j1 = findViewById(C0966R.C0970id.ijl);
        this.f118540l1 = (TextView) findViewById(C0966R.C0970id.f359579o50);
        this.f118538k1 = (RelativeLayout) findViewById(C0966R.C0970id.ijm);
        TextView textView = this.f118540l1;
        if (textView != null) {
            C85875k4.m106191k0(textView.getPaint());
            this.f118540l1.setOnClickListener(new C43998g2(this));
        }
        if (this.f118484R) {
            String nullAsNil = Util.nullAsNil(getIntent().getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
            if (nullAsNil.length() > 0) {
                this.f118517d = true;
            }
            this.f118520e = getIntent().getBooleanExtra("key_show_web_page_title", false);
            setMMTitle((CharSequence) nullAsNil);
        } else {
            setMMTitle("");
        }
        View findViewById = findViewById(C0966R.C0970id.lly);
        this.f118560s = findViewById;
        if (findViewById != null) {
            this.f118557r = new C44199u0(findViewById, this.f118572w, this.f118523f);
            View view = this.f118560s;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "initBottomNavigator", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "initBottomNavigator", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ImageButton imageButton = (ImageButton) findViewById(C0966R.C0970id.llu);
            this.f118563t = imageButton;
            imageButton.setOnClickListener(new C43852e2(this));
            ImageButton imageButton2 = (ImageButton) findViewById(C0966R.C0970id.llx);
            this.f118566u = imageButton2;
            imageButton2.setOnClickListener(new C43858f2(this));
        }
        if (this.f118523f == null) {
            Log.m105924i("MicroMsg.WebViewUI", "initView viewWV is null");
            finish();
            return;
        }
        if (f118442D2 == WebSettings.RenderPriority.NORMAL) {
            Log.m105924i("MicroMsg.WebViewUI", "initView, set render priority to HIGH");
            this.f118523f.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
            f118442D2 = WebSettings.RenderPriority.HIGH;
        }
        C44125o1 o1Var = this.f118531h2;
        View contentView = getContentView();
        o1Var.getClass();
        o1Var.f119527c = (LogoWebViewWrapper) contentView.findViewById(C0966R.C0970id.g6o);
        o1Var.f119526b = (ImageView) contentView.findViewById(C0966R.C0970id.lmt);
        View findViewById2 = contentView.findViewById(C0966R.C0970id.lms);
        o1Var.f119537m = findViewById2;
        if (findViewById2 != null) {
            View findViewById3 = findViewById2.findViewById(C0966R.C0970id.mx7);
            o1Var.f119538n = findViewById3;
            o1Var.f119539o = (TextView) findViewById3.findViewById(C0966R.C0970id.mx6);
        }
        o1Var.f119528d = BackwardSupportUtil.BitmapFactory.fromDPToPix(o1Var.f119527c.getContext(), (float) 72);
        Object[] objArr = new Object[2];
        ImageView imageView = o1Var.f119526b;
        String str = "null";
        objArr[0] = imageView == null ? str : String.valueOf(imageView.getId());
        LogoWebViewWrapper logoWebViewWrapper = o1Var.f119527c;
        if (logoWebViewWrapper != null) {
            str = String.valueOf(logoWebViewWrapper.getId());
        }
        objArr[1] = str;
        Log.m105919d("MicroMsg.WebViewPullDownLogoDelegate", "refreshImage.id = %s, logoWrapper.id = %s", objArr);
        Log.m105919d("MicroMsg.WebViewPullDownLogoDelegate", "LOADING_LOGO_HEIGHT = %d", Integer.valueOf(o1Var.f119528d));
        C44125o1 o1Var2 = this.f118531h2;
        MMWebView mMWebView = this.f118523f;
        o1Var2.getClass();
        mMWebView.mo70468T();
        LogoWebViewWrapper logoWebViewWrapper2 = o1Var2.f119527c;
        logoWebViewWrapper2.getWebViewContainer();
        FrameLayout frameLayout = logoWebViewWrapper2.f118316e;
        if (frameLayout != null) {
            logoWebViewWrapper2.f118315d = mMWebView;
            frameLayout.addView(mMWebView);
        }
        if (mMWebView.isXWalkKernel()) {
            o1Var2.f119540p = true;
        } else {
            o1Var2.f119540p = false;
        }
        if (!o1Var2.f119540p || o1Var2.f119541q) {
            o1Var2.mo68760e(true);
        } else {
            o1Var2.mo68760e(false);
            o1Var2.mo68764h();
        }
        mo68187z8();
        this.f118579y = (FrameLayout) findViewById(C0966R.C0970id.f357785br0);
        this.f118523f.setWebViewClientExtension(new C43850e(this));
        this.f118523f.setWebViewCallbackClient(this.f118489S1);
        this.f118462G = findViewById(C0966R.C0970id.lmp);
        WebViewRedesignInputFooter webViewRedesignInputFooter = (WebViewRedesignInputFooter) findViewById(C0966R.C0970id.lml);
        this.f118460F = webViewRedesignInputFooter;
        if (webViewRedesignInputFooter != null) {
            webViewRedesignInputFooter.setInputShadowView(this.f118462G);
            Log.m105924i("MicroMsg.WebViewUI", "keyboard init hide");
            this.f118460F.mo68994b();
            this.f118460F.setOnTextSendListener(new WebViewUI$$g(this));
            this.f118460F.setOnSmileyChosenListener(new WebViewUI$$h(this));
        }
        WebViewSearchContentInputFooter webViewSearchContentInputFooter = (WebViewSearchContentInputFooter) findViewById(C0966R.C0970id.j59);
        this.f118464H = webViewSearchContentInputFooter;
        if (webViewSearchContentInputFooter != null) {
            webViewSearchContentInputFooter.setActionDelegate(new WebViewUI$$i(this));
            this.f118523f.setFindListener(new WebViewUI$$j(this));
        }
        this.f118583z = (MovingImageButton) findViewById(C0966R.C0970id.egz);
        View findViewById4 = findViewById(C0966R.C0970id.lmi);
        this.f118551p0 = findViewById4;
        if (findViewById4 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = findViewById4;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f118523f.setWebChromeClient(mo68298o8());
        this.f118523f.setDownloadListener(new WebViewUI$$k(this));
        this.f118523f.requestFocus(130);
        this.f118523f.setOnTouchListener(new WebViewUI$$l(this));
        this.f118523f.mo70469W();
        setBackBtn(new WebViewUI$$m(this), mo68263W7());
        if (mo68254Q8()) {
            this.f118572w.setOnkbdStateListener(new C44403z1(this));
        }
        this.f118535j = (MMFalseProgressBar) findViewById(C0966R.C0970id.llw);
        this.f118544n = new MultiCodeMaskView(this);
        this.f118544n.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f118544n.setVisibility(8);
        ((ViewGroup) getWindow().getDecorView()).addView(this.f118544n);
        super.setTitleBarDoubleClickListener(new WebViewUI$$n(this));
    }

    public boolean isContentAtTop() {
        return this.f118523f.getWebScrollY() == 0;
    }

    public boolean isSupportNavigationSwipeBack() {
        if (!getIntent().getBooleanExtra("hide_close_btn", false)) {
            return super.isSupportNavigationSwipeBack();
        }
        Log.m105928w("MicroMsg.WebViewUI", "Close and return are not allowed");
        return false;
    }

    /* renamed from: j8 */
    public String mo68289j8() {
        return this.f118513b1.f117689c1;
    }

    /* renamed from: j9 */
    public final void mo68290j9(int i) {
        if (!isFragmentMode() && i != this.f118519d2.getPaddingTop()) {
            this.f118519d2.setPadding(0, i, 0, 0);
        }
    }

    /* renamed from: k8 */
    public int mo68291k8(String str) {
        return this.f118513b1.mo67729k0(str);
    }

    /* renamed from: k9 */
    public void mo68292k9(boolean z) {
        this.f118497V0 = z;
        Log.m105924i("MicroMsg.WebViewUI", "setForbidResponseKbStateWhenInActive:" + z);
    }

    /* renamed from: l8 */
    public String mo68293l8() {
        return this.f118513b1.f117553a.getSettings().getUserAgentString();
    }

    /* renamed from: m8 */
    public MPVideoPlayFullScreenView mo68294m8() {
        if (this.f118507Y1 == null) {
            MPVideoPlayFullScreenView mPVideoPlayFullScreenView = new MPVideoPlayFullScreenView(this, (AttributeSet) null);
            this.f118507Y1 = mPVideoPlayFullScreenView;
            mPVideoPlayFullScreenView.setVisibility(8);
            ViewParent viewParent = (ViewParent) getWindow().getDecorView();
            if (viewParent instanceof ViewGroup) {
                ((ViewGroup) viewParent).addView(this.f118507Y1, new FrameLayout.LayoutParams(-1, -1));
            }
        }
        return this.f118507Y1;
    }

    /* renamed from: m9 */
    public void mo68295m9(Bundle bundle) {
    }

    public boolean moveTaskToBack(boolean z) {
        boolean moveTaskToBack = super.moveTaskToBack(z);
        initActivityCloseAnimation();
        return moveTaskToBack;
    }

    /* renamed from: n0 */
    public String mo6901n0() {
        try {
            return BaseWebViewController.f117516J0.mo6892a(getIntent());
        } catch (Exception unused) {
            finish();
            return null;
        }
    }

    /* renamed from: n8 */
    public int mo68296n8() {
        int measuredHeight = this.f118523f != null ? (getWindow().getDecorView().getMeasuredHeight() - this.f118523f.getMeasuredHeight()) - C75044y4.m89991c(this) : 0;
        Log.m105918d("MicroMsg.WebViewUI", "getWVTopOffest :" + measuredHeight);
        return measuredHeight;
    }

    /* renamed from: n9 */
    public void mo68297n9(Bundle bundle) {
        if (((C45696d) C86709a0.m107533q(C45696d.class)).B60(mo6901n0())) {
            bundle.putInt("_DATA_CENTER_ITEM_SHOW_TYPE", this.f118481Q);
        }
    }

    public boolean needShowIdcError() {
        return false;
    }

    /* renamed from: o8 */
    public synchronized com.tencent.xweb.WebChromeClient mo68298o8() {
        if (this.f118485R0 == null) {
            this.f118485R0 = new MMWebView.C45105d(new WebViewUI$$j0(this));
        }
        return this.f118485R0;
    }

    /* renamed from: o9 */
    public void mo68299o9(int i) {
        C46279a.m51577a(getContentView(), i, !C74933u4.m89770g(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            super.onActivityResult(r10, r11, r12)
            rc.g r0 = p225rc.C89916g.m112446a(r9)
            r0.mo124233g(r10, r11, r12)
            com.tencent.mm.plugin.webview.modeltools.j r0 = r9.f118534i2
            android.util.Pair<android.content.Intent, java.lang.Integer> r1 = r0.f118229e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0014
        L_0x0012:
            r0 = 1
            goto L_0x001d
        L_0x0014:
            r1 = 201(0xc9, float:2.82E-43)
            if (r10 != r1) goto L_0x001c
            r0.mo68063f(r9, r10, r11, r12)
            goto L_0x0012
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0020
            return
        L_0x0020:
            com.tencent.mm.plugin.webview.modeltools.b r0 = r9.f118537j2
            boolean r0 = r0.mo68049a(r9, r10, r11, r12)
            if (r0 == 0) goto L_0x0029
            return
        L_0x0029:
            com.tencent.mm.plugin.webview.ui.tools.media.t r0 = r9.f118539k2
            boolean r0 = r0.mo68718a(r9, r10, r11, r12)
            if (r0 == 0) goto L_0x0032
            return
        L_0x0032:
            com.tencent.mm.plugin.webview.ui.tools.r0 r0 = r9.f118500W0
            r1 = 214(0xd6, float:3.0E-43)
            r4 = 3
            r5 = 2
            if (r10 != r1) goto L_0x009d
            boolean r1 = r0.f23841d
            if (r1 == 0) goto L_0x003f
            goto L_0x00a0
        L_0x003f:
            if (r12 == 0) goto L_0x0048
            java.lang.String r1 = "key_jsapi_close_page_after_pay"
            int r1 = r12.getIntExtra(r1, r3)
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            java.lang.String r6 = r0.f23839b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "onActivityResult#"
            r7.append(r8)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r8 = r0.mo68388b()
            int r8 = r8.hashCode()
            r7.append(r8)
            java.lang.String r8 = " closePage:"
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleDefault()
            java.lang.String r7 = "getSingleDefault()"
            gy3.C87412m.m108593f(r6, r7)
            if (r1 != r2) goto L_0x0088
            java.lang.String r1 = r0.f23839b
            java.lang.String r7 = "clearAndFinish because closePage is 1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            r0.mo7520f(r5)
            r0.mo7518d(r6)
            goto L_0x009b
        L_0x0088:
            boolean r1 = r0.mo7519e(r6)
            if (r1 == 0) goto L_0x009b
            java.lang.String r1 = r0.f23839b
            java.lang.String r7 = "clearAndFinish because url is same"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            r0.mo7520f(r4)
            r0.mo7518d(r6)
        L_0x009b:
            r0 = 1
            goto L_0x00a1
        L_0x009d:
            r0.getClass()
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            if (r0 == 0) goto L_0x00a4
            return
        L_0x00a4:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r1 = r9.mo68267Y7()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r3] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r2] = r1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0[r5] = r11
            java.lang.String r11 = "MicroMsg.WebViewUI"
            java.lang.String r1 = "WebViewUI-LifeCycle onActivityResult#%s requestCode: %d, resultCode: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
            r0 = 206(0xce, float:2.89E-43)
            if (r10 != r0) goto L_0x0114
            r10 = 0
            java.lang.String r0 = "result_data"
            if (r12 == 0) goto L_0x00d0
            android.os.Bundle r10 = r12.getBundleExtra(r0)
        L_0x00d0:
            java.lang.String r12 = "go_next"
            if (r10 == 0) goto L_0x00e8
            java.lang.String r1 = ""
            java.lang.String r10 = r10.getString(r12, r1)
            java.lang.String r1 = "gdpr_confirm_continue"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x00e8
            java.lang.String r10 = "gdpr continue:true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            goto L_0x0114
        L_0x00e8:
            java.lang.String r10 = "gdpr continue:false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r1 = "gdpr_confirm_logout"
            r11.putString(r12, r1)
            r10.putExtra(r0, r11)
            r9.f118577x1 = r2
            com.tencent.mm.plugin.webview.ui.tools.p1 r11 = com.tencent.p014mm.plugin.webview.p128ui.tools.C44130p1.f119545i
            r11.mo68770a()
            java.lang.String r11 = r9.getCurrentURL()
            com.tencent.p014mm.plugin.webview.model.C43704h2.C6037e.m5916a(r11, r2)
            r11 = -1
            r9.setResult(r11, r10)
            r9.finish()
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        MultiCodeMaskView multiCodeMaskView = this.f118544n;
        if (multiCodeMaskView == null || multiCodeMaskView.getVisibility() != 0) {
            super.onBackPressed();
            return;
        }
        long j = 0;
        WebViewLongClickHelper webViewLongClickHelper = this.f118463G1;
        if (webViewLongClickHelper != null) {
            j = webViewLongClickHelper.f118402k.longValue();
        }
        this.f118544n.mo67041d(j, false);
    }

    public void onCancel() {
        MMWebView mMWebView = this.f118523f;
        if (mMWebView != null) {
            if (this.f118541l2) {
                mMWebView.setOnLongClickListener(this.f118543m2);
            } else {
                this.f118463G1.mo68196j();
            }
        }
        super.onCancel();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r8) {
        /*
            r7 = this;
            super.onConfigurationChanged(r8)
            int r0 = r7.f118522e2
            int r1 = r8.orientation
            if (r0 == r1) goto L_0x005a
            r7.mo68236G9()
            java.lang.String r0 = "MicroMsg.WebViewUI"
            r1 = 0
            r2 = 1
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()     // Catch:{ Exception -> 0x001f }
            java.lang.String r4 = "action_bar_container"
            java.lang.String r5 = "id"
            java.lang.String r6 = "android"
            int r3 = r3.getIdentifier(r4, r5, r6)     // Catch:{ Exception -> 0x001f }
            goto L_0x002a
        L_0x001f:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r3
            java.lang.String r3 = "get resId action_bar_container, exp = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r4)
            r3 = -1
        L_0x002a:
            r4 = 0
            if (r3 <= 0) goto L_0x0032
            android.view.View r5 = r7.findViewById(r3)
            goto L_0x0033
        L_0x0032:
            r5 = r4
        L_0x0033:
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6[r1] = r3
            r6[r2] = r5
            java.lang.String r1 = "getActionBarContainer, viewResId = %d, get view = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r6)
            if (r5 != 0) goto L_0x0046
            goto L_0x004d
        L_0x0046:
            android.view.ViewParent r0 = r5.getParent()
            r4 = r0
            android.view.View r4 = (android.view.View) r4
        L_0x004d:
            if (r4 != 0) goto L_0x0050
            return
        L_0x0050:
            r4.dispatchConfigurationChanged(r8)
            r4.requestLayout()
            int r8 = r8.orientation
            r7.f118522e2 = r8
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI.onConfigurationChanged(android.content.res.Configuration):void");
    }

    public void onCreate(Bundle bundle) {
        C45605v vVar = this.f118486R1;
        vVar.getClass();
        vVar.f123370m = MMApplicationContext.isProcessExist(MMApplicationContext.getPackageName() + ":xweb_sandboxed_process_ex_0");
        vVar.f123371n = MMApplicationContext.isProcessExist(MMApplicationContext.getPackageName() + ":xweb_sandboxed_process_0:com.tencent.xweb.pinus.sdk.process.SandboxedProcessService0");
        vVar.f123372o = MMApplicationContext.isProcessExist(MMApplicationContext.getPackageName() + ":xweb_privileged_process_0");
        long currentTimeMillis = System.currentTimeMillis();
        long longExtra = getIntent().getLongExtra("startTime", 0);
        C45605v vVar2 = this.f118486R1;
        vVar2.f123358a = longExtra;
        vVar2.f123361d = currentTimeMillis - longExtra;
        this.f118486R1.f123368k = getIntent().getBooleanExtra("renderRecoverMode", false);
        AccessibilityUtil.smartDisableAccessibility();
        customfixStatusbar(true);
        long currentTimeMillis2 = System.currentTimeMillis();
        getIntent().putExtra("createTime", currentTimeMillis2);
        if (bundle != null) {
            boolean z = bundle.getBoolean("isReCreateUI", false);
            Log.m105925i("MicroMsg.WebViewUI", "onRestoreInstanceState %s, now: %s", Boolean.valueOf(z), Long.valueOf(currentTimeMillis2));
            if (z) {
                getIntent().putExtra("startTime", currentTimeMillis2);
                getIntent().putExtra("isReCreateUI", true);
            }
        }
        super.onCreate(bundle);
        long currentTimeMillis3 = System.currentTimeMillis();
        mo63703Y8();
        long currentTimeMillis4 = System.currentTimeMillis();
        this.f118513b1.f117543Q.mo73829a("onUIInitStart", currentTimeMillis3);
        this.f118513b1.f117543Q.mo73829a("onUIInitEnd", currentTimeMillis4);
        Intent intent = getIntent();
        if (C85875k4.m106197n0()) {
            overridePendingTransition(MMFragmentActivity$$c.f318648e, 0);
        }
        if (intent.hasExtra("nextAnimIn") || intent.hasExtra("currentAnimOut")) {
            overridePendingTransition(intent.getIntExtra("nextAnimIn", C0966R.C0968anim.f2503er), intent.getIntExtra("currentAnimOut", C0966R.C0968anim.f2498em));
        }
        if (intent.getBooleanExtra("KPopUpTransition", false)) {
            overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        }
        C43704h2.m47540n(0);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.WebViewUI);
    }

    public void onCreateBeforeSetContentView() {
        supportRequestWindowFeature(5);
        supportRequestWindowFeature(9);
        setProgressBarIndeterminateVisibility(false);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        this.f118501W1.removeCallbacks(this.f118559r2);
        this.f118501W1.postDelayed(this.f118559r2, 1000);
        return onCreateOptionsMenu;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:334|335) */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02fc, code lost:
        if (r10.isEmpty() != false) goto L_0x02fe;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:334:0x084a */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x086d A[SYNTHETIC, Splitter:B:348:0x086d] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0828 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0257  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r0 = "MicroMsg.WebViewUI"
            java.lang.String r2 = "WebViewUI-LifeCycle onDestroy#%s, WebViewUI#%s"
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r5 = r17.mo68267Y7()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            int r5 = r17.hashCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 1
            r4[r7] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r4)
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            r2 = 0
            if (r0 == 0) goto L_0x0029
            r0.f117529F0 = r2
        L_0x0029:
            com.tencent.mm.plugin.webview.ui.tools.r0 r0 = r1.f118500W0
            boolean r4 = r0.f23841d
            if (r4 == 0) goto L_0x0031
            goto L_0x00c7
        L_0x0031:
            java.lang.String r4 = r0.f23839b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "onDestroy#"
            r5.append(r8)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r8 = r0.mo68388b()
            int r8 = r8.hashCode()
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleDefault()
            java.lang.String r5 = "getSingleDefault()"
            gy3.C87412m.m108593f(r4, r5)
            java.lang.String r5 = "key_jsapi_pay_need_close"
            java.lang.String r8 = ""
            java.lang.String r4 = r4.decodeString(r5, r8)
            java.lang.String r5 = "mmkv.decodeString(Consta…I.KJsApiPayNeedClose, \"\")"
            gy3.C87412m.m108593f(r4, r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 != 0) goto L_0x00c7
            java.lang.String r5 = r0.f23839b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "is same url: "
            r8.append(r9)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r9 = r0.mo68388b()
            java.lang.String r9 = r9.mo6901n0()
            boolean r9 = gy3.C87412m.m108589b(r4, r9)
            r8.append(r9)
            java.lang.String r9 = ", pay need close url:%s rawUrl:%s"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r6] = r4
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r10 = r0.mo68388b()
            java.lang.String r10 = r10.mo6901n0()
            r9[r7] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r9)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r5 = r0.mo68388b()
            java.lang.String r5 = r5.mo6901n0()
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 == 0) goto L_0x00c3
            int r4 = r0.f23840c
            if (r4 != r7) goto L_0x00b7
            r4 = 5
            r0.mo7520f(r4)
            goto L_0x00c7
        L_0x00b7:
            if (r4 != r3) goto L_0x00be
            r4 = 6
            r0.mo7520f(r4)
            goto L_0x00c7
        L_0x00be:
            r4 = 7
            r0.mo7520f(r4)
            goto L_0x00c7
        L_0x00c3:
            r4 = 4
            r0.mo7520f(r4)
        L_0x00c7:
            boolean r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43861d.m48034d()
            if (r0 == 0) goto L_0x021c
            y93.a r0 = r1.f118483Q1
            if (r0 == 0) goto L_0x021c
            boolean r0 = r0.mo160080e()
            if (r0 == 0) goto L_0x021c
            com.tencent.mm.ui.widget.MMWebView r0 = r1.f118523f
            if (r0 == 0) goto L_0x021c
            int r0 = r17.mo68268Z7()
            java.lang.String r4 = "MicroMsg.WebViewUI"
            r5 = 16
            if (r0 != r5) goto L_0x00ec
            java.lang.String r0 = "saveMultiTaskInfo immersive is not save"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x01d3
        L_0x00ec:
            y93.a r0 = r1.f118483Q1
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r0 = r0.f326418a
            if (r0 == 0) goto L_0x01c2
            java.lang.String r5 = r0.field_id
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x00fc
            goto L_0x01c2
        L_0x00fc:
            java.lang.String r0 = r0.field_id
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r5[r6] = r0
            java.lang.String r8 = "saveMultiTaskInfo to cache multiTaskId=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r5)
            com.tencent.mm.ui.widget.MMWebView r5 = r1.f118523f
            if (r5 == 0) goto L_0x0147
            android.view.ViewParent r5 = r5.getParent()
            if (r5 == 0) goto L_0x0147
            com.tencent.mm.ui.widget.MMWebView r5 = r1.f118523f
            android.content.Context r5 = r5.getActivityContextIfHas()
            if (r5 != r1) goto L_0x0147
            ca3.f r4 = r1.f118503X0
            ba3.d r5 = r4.f107072g
            if (r5 == 0) goto L_0x0125
            android.view.View r5 = r5.f106652b
            if (r5 == 0) goto L_0x0125
            r5 = 1
            goto L_0x0126
        L_0x0125:
            r5 = 0
        L_0x0126:
            if (r5 == 0) goto L_0x012b
            r4.mo62553a(r7)
        L_0x012b:
            com.tencent.mm.ui.widget.MMWebView r4 = r1.f118523f
            r4.onHide()
            com.tencent.mm.ui.widget.MMWebView r4 = r1.f118523f
            android.view.ViewParent r4 = r4.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            com.tencent.mm.ui.widget.MMWebView r5 = r1.f118523f
            r4.removeView(r5)
            com.tencent.mm.ui.widget.MMWebView r4 = r1.f118523f
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r4.mo70470f(r5)
            goto L_0x0167
        L_0x0147:
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 1553(0x611, double:7.673E-321)
            r11 = 20
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            com.tencent.mm.ui.widget.MMWebView r8 = r1.f118523f
            if (r8 != 0) goto L_0x015b
            r8 = 1
            goto L_0x015c
        L_0x015b:
            r8 = 0
        L_0x015c:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r5[r6] = r8
            java.lang.String r8 = "saveMultiTaskInfo wv has no parent, %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r8, r5)
        L_0x0167:
            t83.l r4 = r1.f118508Z
            if (r4 == 0) goto L_0x017a
            r4.f130006k = r7
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4[r6] = r5
            java.lang.String r5 = "MicroMsg.JsApiHandler"
            java.lang.String r8 = "setIsFloating %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r4)
        L_0x017a:
            com.tencent.mm.plugin.webview.core.y r4 = r1.f118513b1
            com.tencent.mm.plugin.webview.ui.tools.floatball.c r4 = r4.f117678R0
            java.lang.CharSequence r5 = r17.getMMTitle()
            if (r5 == 0) goto L_0x019e
            com.tencent.mm.ui.MMActivityController r5 = r17.getController()
            android.widget.TextView r5 = r5.f348066G
            if (r5 == 0) goto L_0x0191
            int r5 = r5.getVisibility()
            goto L_0x0192
        L_0x0191:
            r5 = 0
        L_0x0192:
            if (r5 != 0) goto L_0x019e
            java.lang.CharSequence r5 = r17.getMMTitle()
            java.lang.String r5 = r5.toString()
            r4.f118781b = r5
        L_0x019e:
            com.tencent.mm.plugin.webview.core.y r4 = r1.f118513b1
            java.lang.String r5 = "id"
            gy3.C87412m.m108594g(r0, r5)
            java.lang.String r5 = "controller"
            gy3.C87412m.m108594g(r4, r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.SoftReference<com.tencent.mm.plugin.webview.core.y>> r5 = com.tencent.p014mm.plugin.webview.p128ui.tools.floatball.C43861d.f118785c
            java.lang.ref.SoftReference r8 = new java.lang.ref.SoftReference
            r8.<init>(r4)
            r5.put(r0, r8)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1553(0x611, double:7.673E-321)
            r12 = 0
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            goto L_0x01d3
        L_0x01c2:
            java.lang.String r0 = "saveMultiTaskInfo taskInfo invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 1553(0x611, double:7.673E-321)
            r11 = 26
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
        L_0x01d3:
            com.tencent.mm.plugin.webview.ui.tools.g1 r0 = r1.f118465H1
            qo3.n r4 = r0.f119144q
            if (r4 == 0) goto L_0x01eb
            boolean r4 = r4.mo107563h()
            if (r4 == 0) goto L_0x01e4
            qo3.n r4 = r0.f119144q
            r4.mo107572p()
        L_0x01e4:
            qo3.n r4 = r0.f119144q
            r4.mo107565j()
            r0.f119144q = r2
        L_0x01eb:
            r0.f119136i = r2
            r0.f119145r = r2
            com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper r0 = r1.f118477N1
            com.tencent.mm.plugin.webview.WebViewTransHelper r0 = r0.f118669f
            if (r0 == 0) goto L_0x021a
            java.lang.String r0 = r0.f117512o
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x021a
            i83.s r0 = new i83.s
            r0.<init>()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper r4 = r1.f118477N1
            com.tencent.mm.plugin.webview.WebViewTransHelper r4 = r4.f118669f
            java.lang.String r5 = r4.f117512o
            r0.f124519a = r5
            androidx.lifecycle.z<i83.a0> r4 = r4.f117508h
            java.lang.Object r4 = r4.getValue()
            i83.a0 r4 = (i83.C46176a0) r4
            if (r4 == 0) goto L_0x0216
            r0.f124520b = r4
        L_0x0216:
            com.tencent.mm.plugin.webview.core.y r4 = r1.f118513b1
            r4.f117679S0 = r0
        L_0x021a:
            r4 = 1
            goto L_0x021d
        L_0x021c:
            r4 = 0
        L_0x021d:
            super.onDestroy()
            com.tencent.mm.plugin.webview.ui.tools.x0 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C44395x0.f120338a
            android.content.Intent r5 = r17.getIntent()
            java.lang.String r8 = "rawUrl"
            java.lang.String r5 = r5.getStringExtra(r8)
            if (r5 != 0) goto L_0x022f
            goto L_0x0265
        L_0x022f:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<com.tencent.mm.plugin.webview.ui.tools.WebViewUI>> r8 = com.tencent.p014mm.plugin.webview.p128ui.tools.C44395x0.f120339b
            r8.remove(r5)
            r0.mo69169a(r5)
            boolean r0 = com.tencent.p014mm.pluginsdk.model.C44594n1.m49046b()
            if (r0 == 0) goto L_0x0254
            android.net.Uri r0 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x0253 }
            boolean r8 = ke3.C88144b.m109781C(r0)     // Catch:{ Exception -> 0x0253 }
            if (r8 != 0) goto L_0x0254
            java.lang.String r0 = r0.getHost()     // Catch:{ Exception -> 0x0253 }
            boolean r0 = com.tencent.xweb.XWebSdk.needSwitchToTools(r0)     // Catch:{ Exception -> 0x0253 }
            if (r0 == 0) goto L_0x0254
            r0 = 0
            goto L_0x0255
        L_0x0253:
        L_0x0254:
            r0 = 1
        L_0x0255:
            if (r0 != 0) goto L_0x0265
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.webview.ui.tools.y0 r8 = new com.tencent.mm.plugin.webview.ui.tools.y0
            r8.<init>(r5)
            zt3.j r0 = (zt3.C119157j) r0
            java.lang.String r5 = "NotifyWebViewUIDestroy"
            r0.mo183876g(r8, r5)
        L_0x0265:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.util.ArrayList<java.lang.String> r5 = com.tencent.p014mm.plugin.webview.modeltools.C43749d.f118217a
            if (r5 == 0) goto L_0x0270
            int r5 = r5.size()
            goto L_0x0271
        L_0x0270:
            r5 = 0
        L_0x0271:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r6] = r5
            java.lang.String r5 = "MicroMsg.WebView.CookiesCleanup"
            java.lang.String r8 = "clearWebViewData url list size %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r0)
            java.util.ArrayList<java.lang.String> r0 = com.tencent.p014mm.plugin.webview.modeltools.C43749d.f118217a
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r0 == 0) goto L_0x0288
            goto L_0x03e2
        L_0x0288:
            java.util.ArrayList<java.lang.String> r0 = com.tencent.p014mm.plugin.webview.modeltools.C43749d.f118217a
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r0 == 0) goto L_0x0292
            goto L_0x03bf
        L_0x0292:
            java.util.ArrayList<java.lang.String> r0 = com.tencent.p014mm.plugin.webview.modeltools.C43749d.f118217a
            java.util.Iterator r0 = r0.iterator()
        L_0x0298:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x03b3
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r6] = r8
            java.lang.String r10 = "cookies cleanup: url(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r9)
            com.tencent.xweb.CookieManager r9 = com.tencent.xweb.CookieManager.getInstance()
            java.lang.String r9 = r9.getCookie(r8)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            java.lang.String r11 = "="
            if (r10 == 0) goto L_0x02be
            goto L_0x02fe
        L_0x02be:
            java.lang.String r10 = ";"
            java.lang.String[] r9 = r9.split(r10)
            int r10 = r9.length
            r12 = 0
        L_0x02c6:
            if (r12 >= r10) goto L_0x02d3
            r13 = r9[r12]
            java.lang.String r13 = r13.trim()
            r9[r12] = r13
            int r12 = r12 + 1
            goto L_0x02c6
        L_0x02d3:
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            int r12 = r9.length
            r13 = 0
        L_0x02da:
            if (r13 >= r12) goto L_0x02f8
            r14 = r9[r13]
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r15 == 0) goto L_0x02e5
            goto L_0x02f5
        L_0x02e5:
            boolean r15 = r14.contains(r11)
            if (r15 != 0) goto L_0x02ec
            goto L_0x02f5
        L_0x02ec:
            java.lang.String[] r14 = r14.split(r11)
            r14 = r14[r6]
            r10.add(r14)
        L_0x02f5:
            int r13 = r13 + 1
            goto L_0x02da
        L_0x02f8:
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L_0x02ff
        L_0x02fe:
            r10 = r2
        L_0x02ff:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r10)
            if (r9 != 0) goto L_0x0298
            android.net.Uri r9 = android.net.Uri.parse(r8)
            java.lang.String r9 = r9.getHost()
            java.lang.String r12 = "\\."
            java.lang.String[] r12 = r9.split(r12)
            int r13 = r12.length
            if (r13 > r7) goto L_0x0319
            java.lang.String r12 = ""
            goto L_0x0336
        L_0x0319:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r14 = r12.length
            int r14 = r14 + -2
            r14 = r12[r14]
            r13.append(r14)
            java.lang.String r14 = "."
            r13.append(r14)
            int r14 = r12.length
            int r14 = r14 - r7
            r12 = r12[r14]
            r13.append(r12)
            java.lang.String r12 = r13.toString()
        L_0x0336:
            java.lang.Object[] r13 = new java.lang.Object[r7]
            r13[r6] = r9
            java.lang.String r9 = "host(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r9, r13)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r6] = r12
            java.lang.String r13 = "domain(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r13, r9)
            java.util.Iterator r9 = r10.iterator()
        L_0x034c:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0298
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r13 != 0) goto L_0x034c
            com.tencent.xweb.CookieManager r13 = com.tencent.xweb.CookieManager.getInstance()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            r14.append(r11)
            java.lang.String r14 = r14.toString()
            r13.setCookie(r8, r14)
            com.tencent.xweb.CookieManager r13 = com.tencent.xweb.CookieManager.getInstance()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            java.lang.String r15 = "=;path=/"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.setCookie(r8, r14)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 != 0) goto L_0x034c
            com.tencent.xweb.CookieManager r13 = com.tencent.xweb.CookieManager.getInstance()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            java.lang.String r10 = "=;domain=."
            r14.append(r10)
            r14.append(r12)
            java.lang.String r10 = ";path=/"
            r14.append(r10)
            java.lang.String r10 = r14.toString()
            r13.setCookie(r12, r10)
            goto L_0x034c
        L_0x03b3:
            com.tencent.xweb.CookieManager r0 = com.tencent.xweb.CookieManager.getInstance()
            r0.flush()
            java.lang.String r0 = "clearHostCookies end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
        L_0x03bf:
            java.util.ArrayList<java.lang.String> r0 = com.tencent.p014mm.plugin.webview.modeltools.C43749d.f118217a
            java.util.Iterator r0 = r0.iterator()
        L_0x03c5:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x03dd
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.plugin.webview.modeltools.C43749d.m47592a(r5)
            com.tencent.xweb.WebStorage r8 = com.tencent.xweb.WebStorage.getInstance()
            r8.deleteOrigin(r5)
            goto L_0x03c5
        L_0x03dd:
            java.util.ArrayList<java.lang.String> r0 = com.tencent.p014mm.plugin.webview.modeltools.C43749d.f118217a
            r0.clear()
        L_0x03e2:
            java.lang.String r0 = r17.getCurrentURL()
            if (r0 == 0) goto L_0x0408
            java.lang.String[] r5 = ea3.C45606x.f123373a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r8 = "webview_url_prefs_url"
            java.lang.String r5 = r5.getString(r8, r2)
            if (r5 == 0) goto L_0x040f
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x040f
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r5 = "webview_url_prefs_url"
            r0.remove(r5)
            goto L_0x040f
        L_0x0408:
            java.lang.String r0 = "MicroMsg.WebViewUI"
            java.lang.String r5 = "currentURL == null, qbrowser.url may be not accurate"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r5)
        L_0x040f:
            com.tencent.mm.plugin.webview.ui.tools.floatball.b r0 = r1.f118480P1
            if (r0 == 0) goto L_0x0416
            r0.mo67996A0()
        L_0x0416:
            com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter r0 = r1.f118460F
            if (r0 == 0) goto L_0x047c
            r0.mo68997e()
            com.tencent.mm.ui.widget.MMEditText r5 = r0.f120006o
            if (r5 == 0) goto L_0x0428
            com.tencent.mm.ui.MMActivity r8 = r0.f120013v
            if (r8 == 0) goto L_0x0428
            r8.hideVKB(r5)
        L_0x0428:
            r0.f120006o = r2
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r5 = r0.f120002h
            r8 = 8
            if (r5 == 0) goto L_0x0433
            r5.setVisibility(r8)
        L_0x0433:
            android.view.View r5 = r0.f120015x
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r15.mo10233c(r8)
            java.lang.Object[] r10 = r15.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter"
            java.lang.String r12 = "onDestroy"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r5
            r3 = r15
            r15 = r8
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r3 = r3.mo10231a(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r5.setVisibility(r3)
            java.lang.String r10 = "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter"
            java.lang.String r11 = "onDestroy"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            r0.removeAllViews()
            r0.f120013v = r2
            r0.f119998d = r2
        L_0x047c:
            com.tencent.mm.plugin.handoff.model.HandOffURL r0 = r1.f118475M1
            if (r0 == 0) goto L_0x0489
            java.lang.String r0 = "MicroMsg.WebViewUI"
            java.lang.String r3 = "onDestroy, invalidate mHandOffURL"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            r1.f118475M1 = r2
        L_0x0489:
            com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper r0 = r1.f118463G1
            if (r0 == 0) goto L_0x04a4
            lx.z r3 = r0.f118398g
            if (r3 == 0) goto L_0x0499
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic r3 = (com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic) r3
            r3.f116146d = r5
        L_0x0499:
            qo3.n r3 = r0.f118397f
            if (r3 == 0) goto L_0x04a2
            r3.mo107565j()
            r0.f118397f = r2
        L_0x04a2:
            r0.f118406o = r2
        L_0x04a4:
            we0.a r0 = r1.f118456D
            if (r0 == 0) goto L_0x04ab
            r0.disable()
        L_0x04ab:
            r1.f118577x1 = r7
            int r0 = f118443E2
            int r0 = r0 - r7
            f118443E2 = r0
            android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener r0 = r1.f118493U
            if (r0 == 0) goto L_0x04bd
            android.view.accessibility.AccessibilityManager r3 = r1.f118490T
            if (r3 == 0) goto L_0x04bd
            r3.removeAccessibilityStateChangeListener(r0)
        L_0x04bd:
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            i93.e$c r0 = r0.f117565g
            long r8 = java.lang.System.currentTimeMillis()
            java.util.ArrayList<i93.e$c$a> r3 = r0.f124561a
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x04e2
            java.util.ArrayList<i93.e$c$a> r3 = r0.f124561a
            java.lang.Object r3 = sx3.C110818d0.m150923U(r3)
            i93.e$c$a r3 = (i93.C46206e.C46209c.C46210a) r3
            java.util.ArrayList<i93.e$c$a> r0 = r0.f124561a
            java.lang.Object r0 = sx3.C110818d0.m150923U(r0)
            i93.e$c$a r0 = (i93.C46206e.C46209c.C46210a) r0
            long r10 = r0.f124563b
            long r8 = r8 - r10
            r3.f124565d = r8
        L_0x04e2:
            com.tencent.mm.plugin.webview.model.h2 r0 = r1.f118459E1
            r0.mo68015m()
            com.tencent.mm.plugin.webview.model.h2 r0 = r1.f118459E1
            r0.f118121d = r2
            r0.f118119b = r2
            r0.f118120c = r2
            r0.f118118a = r2
            r0.f118123f = r2
            r0.f118124g = r2
            r0.f118125h = r2
            r0.f118126i = r2
            com.tencent.mm.plugin.webview.model.h2$a r3 = r0.f118131n
            if (r3 == 0) goto L_0x0501
            r3.f118136a = r2
            r0.f118131n = r2
        L_0x0501:
            java.lang.String r0 = "onDestroy"
            r1.mo68260U8(r0)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r1.f118518d1
            if (r0 == 0) goto L_0x050d
            r0.clear()
        L_0x050d:
            com.tencent.mm.plugin.webview.model.c r0 = r1.f118461F1
            if (r0 != 0) goto L_0x051a
            com.tencent.mm.plugin.webview.model.c r0 = new com.tencent.mm.plugin.webview.model.c
            com.tencent.mm.plugin.webview.model.h2 r3 = r1.f118459E1
            r0.<init>(r3)
            r1.f118461F1 = r0
        L_0x051a:
            com.tencent.mm.plugin.webview.model.c r0 = r1.f118461F1
            r0.getClass()
            qo3.g r0 = r1.f118533i1
            if (r0 == 0) goto L_0x0532
            boolean r3 = r0.isShowing()
            if (r3 == 0) goto L_0x052c
            r0.dismiss()
        L_0x052c:
            r0.setCancelMessage(r2)
            r0.setDismissMessage(r2)
        L_0x0532:
            com.tencent.xweb.WebChromeClient r0 = r1.f118485R0
            if (r0 == 0) goto L_0x0554
            boolean r3 = r0 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI$$j0
            if (r3 == 0) goto L_0x0554
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$j0 r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI$$j0) r0
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r0.f118615c
            qo3.g r0 = r0.f118614b
            r3.getClass()
            if (r0 == 0) goto L_0x0554
            boolean r3 = r0.isShowing()
            if (r3 == 0) goto L_0x054e
            r0.dismiss()
        L_0x054e:
            r0.setCancelMessage(r2)
            r0.setDismissMessage(r2)
        L_0x0554:
            com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter r0 = r1.f118460F
            if (r0 == 0) goto L_0x055b
            r0.setOnTextSendListener(r2)
        L_0x055b:
            com.tencent.mm.plugin.webview.ui.tools.u0 r0 = r1.f118557r
            if (r0 == 0) goto L_0x056f
            android.view.View r0 = r0.f119736a
            if (r0 == 0) goto L_0x056f
            android.view.animation.Animation r3 = r0.getAnimation()
            if (r3 == 0) goto L_0x056c
            r3.setAnimationListener(r2)
        L_0x056c:
            r0.clearAnimation()
        L_0x056f:
            com.tencent.mm.plugin.scanner.MultiCodeMaskView r0 = r1.f118544n
            if (r0 == 0) goto L_0x0576
            r0.mo67038a()
        L_0x0576:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.f118521e1
            if (r0 == 0) goto L_0x057d
            r0.clear()
        L_0x057d:
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ServiceClickEvent> r0 = r1.f118495U1
            r0.dead()
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToH5FromMiniProgramEvent> r0 = r1.f118506Y0
            r0.dead()
            com.tencent.mm.plugin.webview.ui.tools.n2 r0 = r1.f118467I1
            if (r0 == 0) goto L_0x05a4
            java.lang.String r3 = "MicroMsg.WebViewVideoFullScreenHelper"
            java.lang.String r5 = "dead"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r0.mo68388b()
            if (r3 == 0) goto L_0x059d
            ba3.e r5 = r0.f119461e
            r3.mo62534I0(r5)
        L_0x059d:
            we0.a r0 = r0.f119460d
            if (r0 == 0) goto L_0x05a4
            r0.disable()
        L_0x05a4:
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$c r3 = new com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$c
            r3.<init>(r1)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183875f(r3)
            java.lang.String r0 = "MicroMsg.WebViewUI"
            java.lang.String r3 = "on destroy isNeedCallbackMMRpt[%b]"
            java.lang.Object[] r5 = new java.lang.Object[r7]
            boolean r8 = r1.f118474M
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r5[r6] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r0, r3, r5)
            boolean r0 = r1.f118474M
            if (r0 == 0) goto L_0x060a
            android.content.Intent r0 = r17.getIntent()     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r3 = "mm_report_bundle"
            android.os.Bundle r0 = r0.getBundleExtra(r3)     // Catch:{ Exception -> 0x05f9 }
            java.lang.String r3 = "mm_event_class"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ Exception -> 0x05f9 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x05f9 }
            if (r3 != 0) goto L_0x05f0
            com.tencent.mm.plugin.webview.stub.l r3 = r1.f118511a1     // Catch:{ Exception -> 0x05f9 }
            if (r3 == 0) goto L_0x060a
            java.lang.String r3 = "key_activity_browse_time"
            long r8 = r17.getActivityBrowseTimeMs()     // Catch:{ Exception -> 0x05f9 }
            r0.putLong(r3, r8)     // Catch:{ Exception -> 0x05f9 }
            com.tencent.mm.plugin.webview.stub.l r3 = r1.f118511a1     // Catch:{ Exception -> 0x05f9 }
            r5 = 250(0xfa, float:3.5E-43)
            r3.mo68114V5(r5, r0)     // Catch:{ Exception -> 0x05f9 }
            goto L_0x060a
        L_0x05f0:
            java.lang.String r0 = "MicroMsg.WebViewUI"
            java.lang.String r3 = "webview on destroy callback mm but eventclass is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)     // Catch:{ Exception -> 0x05f9 }
            goto L_0x060a
        L_0x05f9:
            r0 = move-exception
            java.lang.String r3 = "MicroMsg.WebViewUI"
            java.lang.String r5 = "webview on destroy callback mm exception [%s]"
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r0 = r0.toString()
            r8[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r5, r8)
        L_0x060a:
            com.tencent.mm.plugin.webview.stub.l r0 = r1.f118511a1     // Catch:{ Exception -> 0x0624 }
            if (r0 == 0) goto L_0x0635
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x0624 }
            r0.<init>()     // Catch:{ Exception -> 0x0624 }
            java.lang.String r3 = "key_activity_browse_time"
            long r8 = r17.getActivityBrowseTimeMs()     // Catch:{ Exception -> 0x0624 }
            r0.putLong(r3, r8)     // Catch:{ Exception -> 0x0624 }
            com.tencent.mm.plugin.webview.stub.l r3 = r1.f118511a1     // Catch:{ Exception -> 0x0624 }
            r5 = 251(0xfb, float:3.52E-43)
            r3.mo68114V5(r5, r0)     // Catch:{ Exception -> 0x0624 }
            goto L_0x0635
        L_0x0624:
            r0 = move-exception
            java.lang.String r3 = "MicroMsg.WebViewUI"
            java.lang.String r5 = "webview on destroy callback mm exception [%s]"
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r0 = r0.toString()
            r8[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r5, r8)
        L_0x0635:
            com.tencent.mm.plugin.webview.stub.l r0 = r1.f118511a1     // Catch:{ Exception -> 0x0675 }
            if (r0 == 0) goto L_0x0685
            r3 = 19
            android.os.Bundle r0 = r0.mo68114V5(r3, r2)     // Catch:{ Exception -> 0x0675 }
            if (r0 == 0) goto L_0x0685
            java.lang.String r3 = "webview_video_proxy_init"
            boolean r0 = r0.getBoolean(r3)     // Catch:{ Exception -> 0x0675 }
            java.lang.String r3 = "MicroMsg.WebViewUI"
            java.lang.String r5 = "onDestroy, has init = %b, webviewHoldingCounter = %d"
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0675 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0675 }
            r8[r6] = r9     // Catch:{ Exception -> 0x0675 }
            int r9 = f118443E2     // Catch:{ Exception -> 0x0675 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0675 }
            r8[r7] = r9     // Catch:{ Exception -> 0x0675 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r8)     // Catch:{ Exception -> 0x0675 }
            if (r0 == 0) goto L_0x0685
            int r0 = f118443E2     // Catch:{ Exception -> 0x0675 }
            if (r0 > 0) goto L_0x0685
            com.tencent.qqvideo.proxy.api.IPlayManager r0 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()     // Catch:{ Exception -> 0x0675 }
            r0.deinit()     // Catch:{ Exception -> 0x0675 }
            com.tencent.mm.plugin.webview.stub.l r0 = r1.f118511a1     // Catch:{ Exception -> 0x0675 }
            r3 = 75
            r0.mo68114V5(r3, r2)     // Catch:{ Exception -> 0x0675 }
            goto L_0x0685
        L_0x0675:
            r0 = move-exception
            java.lang.String r3 = "MicroMsg.WebViewUI"
            java.lang.String r5 = "deinit video player failed : %s"
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r8[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r5, r8)
        L_0x0685:
            com.tencent.mm.ui.widget.MMWebView r0 = r1.f118523f
            if (r0 == 0) goto L_0x06b0
            r0.f122361n = r2
            r0.setOnTouchListener(r2)
            com.tencent.mm.ui.widget.MMWebView r0 = r1.f118523f
            r0.setWebViewCallbackClient(r2)
            com.tencent.mm.ui.widget.MMWebView r0 = r1.f118523f
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0.mo70470f(r3)
            com.tencent.mm.ui.widget.MMWebView r0 = r1.f118523f
            r0.setDownloadListener(r2)
            com.tencent.mm.ui.widget.MMWebView r0 = r1.f118523f
            r0.setFindListener(r2)
            com.tencent.mm.ui.widget.MMWebView r0 = r1.f118523f
            r0.setWebChromeClient(r2)
            com.tencent.mm.ui.widget.MMWebView r0 = r1.f118523f
            r0.setOnLongClickListener(r2)
        L_0x06b0:
            k93.f r0 = r1.f118458E
            r0.mo71920b()
            if (r4 != 0) goto L_0x06d7
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            r0.mo67812d()
            d93.h r0 = r1.f118491T0
            if (r0 == 0) goto L_0x06d4
            java.lang.String r3 = "MicroMsg.WebViewPermission"
            java.lang.String r4 = "detach"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            java.util.Map<java.lang.String, d93.h$b> r3 = r0.f122759a
            if (r3 == 0) goto L_0x06d2
            java.util.HashMap r3 = (java.util.HashMap) r3
            r3.clear()
            r0.f122759a = r2
        L_0x06d2:
            r1.f118491T0 = r2
        L_0x06d4:
            r1.f118523f = r2
            goto L_0x06ef
        L_0x06d7:
            ca3.f r0 = r1.f118503X0
            java.util.Set<xc.a$a> r0 = r0.f107071f
            java.util.Iterator r0 = r0.iterator()
        L_0x06df:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x06ef
            java.lang.Object r3 = r0.next()
            xc.a$a r3 = (p830xc.C91165a.C53318a) r3
            r3.mo18009a(r7)
            goto L_0x06df
        L_0x06ef:
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            ca3.f r3 = r0.f117677Q0
            if (r3 == 0) goto L_0x0701
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = "getContext()"
            gy3.C87412m.m108593f(r4, r5)
            r3.mo62555c(r4)
        L_0x0701:
            rx3.g r3 = r0.f117688b1
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            com.tencent.mm.plugin.webview.ui.tools.g r3 = (com.tencent.p014mm.plugin.webview.p128ui.tools.C43976g) r3
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3.f119123a = r4
            com.tencent.mm.plugin.webview.model.o0$c r3 = r0.f117696j1
            com.tencent.mm.plugin.webview.core.y$s r3 = (com.tencent.p014mm.plugin.webview.core.C43522y.C43550s) r3
            r3.mo67838a()
            boolean r3 = r0.f117691e1
            if (r3 != 0) goto L_0x072a
            java.lang.String r0 = r0.mo67822t1()
            java.lang.String r3 = "onWebViewUIDestroy without pageStarted"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)
            r3 = 11
            com.tencent.p014mm.plugin.webview.model.C43704h2.m47540n(r3)
        L_0x072a:
            com.tencent.p014mm.plugin.webview.model.C85541t0.m105568c()
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            rx3.g r0 = r0.f117690d1
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.plugin.webview.modeltools.c0 r0 = (com.tencent.p014mm.plugin.webview.modeltools.C43748c0) r0
            r0.getClass()
            boolean r3 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            if (r3 != 0) goto L_0x0743
            goto L_0x0776
        L_0x0743:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "routeList: "
            r3.<init>(r4)
            java.util.LinkedList<java.lang.String> r4 = r0.f118216a
            monitor-enter(r4)
            java.util.LinkedList<java.lang.String> r0 = r0.f118216a     // Catch:{ all -> 0x087f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x087f }
        L_0x0753:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x087f }
            if (r5 == 0) goto L_0x076c
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x087f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x087f }
            java.lang.String r5 = java.net.URLDecoder.decode(r5)     // Catch:{ all -> 0x087f }
            r3.append(r5)     // Catch:{ all -> 0x087f }
            java.lang.String r5 = "\n"
            r3.append(r5)     // Catch:{ all -> 0x087f }
            goto L_0x0753
        L_0x076c:
            monitor-exit(r4)     // Catch:{ all -> 0x087f }
            java.lang.String r0 = "MicroMsg.WebViewURLRouteList"
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r3)
        L_0x0776:
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            r0.f117680T0 = r2
            r1.f118516c2 = r2
            com.tencent.mm.plugin.webview.ui.tools.o1 r0 = r1.f118531h2     // Catch:{ all -> 0x0793 }
            r0.mo68759d()     // Catch:{ all -> 0x0793 }
            android.view.View r0 = r17.getContentView()     // Catch:{ all -> 0x0793 }
            boolean r0 = r0 instanceof android.view.ViewGroup     // Catch:{ all -> 0x0793 }
            if (r0 == 0) goto L_0x079f
            android.view.View r0 = r17.getContentView()     // Catch:{ all -> 0x0793 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x0793 }
            r0.removeAllViews()     // Catch:{ all -> 0x0793 }
            goto L_0x079f
        L_0x0793:
            r0 = move-exception
            java.lang.String r3 = "MicroMsg.WebViewUI"
            java.lang.String r4 = "onDestroy contentView removeAllViews %s"
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r5[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r4, r5)
        L_0x079f:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper r0 = r1.f118477N1
            com.tencent.mm.sdk.event.IListener r3 = r0.f118672i
            if (r3 == 0) goto L_0x07aa
            r3.dead()
            r0.f118672i = r2
        L_0x07aa:
            r0.f118677n = r2
            r0.f118675l = r2
            r0.f118674k = r2
            r0.f118667d = r2
            r0.f118666c = r2
            com.tencent.mm.plugin.webview.ui.tools.s0 r0 = r0.f118668e
            r0.f119731a = r2
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$k0 r3 = r1.f118578x2
            r0.mo67693R0(r3)
            com.tencent.mm.plugin.webview.core.y r0 = r1.f118513b1
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$k0 r3 = r1.f118578x2
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$k0$a r3 = r3.f118640c
            r0.mo67723h(r3)
            com.tencent.qqvideo.proxy.api.IUtils r0 = r1.f118469J1
            if (r0 == 0) goto L_0x07d5
            r1.f118469J1 = r2
            com.tencent.qqvideo.proxy.api.IPlayManager r0 = com.tencent.qqvideo.proxy.api.FactoryProxyManager.getPlayManager()
            r0.setUtilsObject(r2)
        L_0x07d5:
            int r0 = r17.hashCode()
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r4 == r3) goto L_0x07e1
            goto L_0x0878
        L_0x07e1:
            boolean r3 = p206nj.C76866m.m92673b()
            if (r3 != 0) goto L_0x07ef
            boolean r3 = p206nj.C76866m.m92672a()
            if (r3 != 0) goto L_0x07ef
            goto L_0x0878
        L_0x07ef:
            java.lang.String r3 = "android.app.HwChangeButtonWindowCtrl"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x0878 }
            java.lang.String r4 = "mInstanceMap"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ Exception -> 0x0878 }
            r3.setAccessible(r7)     // Catch:{ Exception -> 0x0878 }
            java.lang.Class r4 = r3.getType()     // Catch:{ Exception -> 0x0878 }
            java.lang.Object r4 = r4.newInstance()     // Catch:{ Exception -> 0x0878 }
            java.lang.Object r4 = r3.get(r4)     // Catch:{ Exception -> 0x0878 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ Exception -> 0x0878 }
            java.lang.Class r5 = r3.getType()     // Catch:{ Exception -> 0x0878 }
            java.lang.Object r5 = r5.newInstance()     // Catch:{ Exception -> 0x0878 }
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ Exception -> 0x0878 }
            if (r4 != 0) goto L_0x0819
            goto L_0x0878
        L_0x0819:
            int r6 = r4.size()     // Catch:{ Exception -> 0x0878 }
            if (r6 != 0) goto L_0x0820
            goto L_0x0878
        L_0x0820:
            java.util.Set r6 = r4.keySet()     // Catch:{ Exception -> 0x0878 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x0878 }
        L_0x0828:
            boolean r8 = r6.hasNext()     // Catch:{ Exception -> 0x0878 }
            if (r8 == 0) goto L_0x0875
            java.lang.Object r8 = r6.next()     // Catch:{ Exception -> 0x0878 }
            java.lang.Object r9 = r4.get(r8)     // Catch:{ Exception -> 0x0878 }
            java.util.Objects.requireNonNull(r9)     // Catch:{ Exception -> 0x0878 }
            java.lang.String r10 = "mActivity"
            java.lang.Class r9 = r9.getClass()     // Catch:{ Exception -> 0x0878 }
        L_0x083f:
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            if (r9 == r11) goto L_0x084f
            if (r9 == 0) goto L_0x084f
            java.lang.reflect.Field r9 = r9.getDeclaredField(r10)     // Catch:{ NoSuchFieldException -> 0x084a }
            goto L_0x0850
        L_0x084a:
            java.lang.Class r9 = r9.getSuperclass()     // Catch:{ Exception -> 0x0878 }
            goto L_0x083f
        L_0x084f:
            r9 = r2
        L_0x0850:
            if (r9 == 0) goto L_0x086a
            r9.setAccessible(r7)     // Catch:{ Exception -> 0x0878 }
            java.lang.Object r10 = r4.get(r8)     // Catch:{ Exception -> 0x0869 }
            java.lang.Object r9 = r9.get(r10)     // Catch:{ Exception -> 0x0869 }
            if (r9 == 0) goto L_0x086b
            int r10 = r9.hashCode()     // Catch:{ Exception -> 0x0869 }
            if (r10 != r0) goto L_0x086b
            r3.set(r9, r2)     // Catch:{ Exception -> 0x0869 }
            goto L_0x086b
        L_0x0869:
        L_0x086a:
            r9 = r2
        L_0x086b:
            if (r9 != 0) goto L_0x0828
            java.lang.Object r9 = r4.get(r8)     // Catch:{ Exception -> 0x0878 }
            r5.put(r8, r9)     // Catch:{ Exception -> 0x0878 }
            goto L_0x0828
        L_0x0875:
            r3.set(r4, r5)     // Catch:{ Exception -> 0x0878 }
        L_0x0878:
            p225rc.C89916g.m112447b(r17)
            java.lang.System.gc()
            return
        L_0x087f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x087f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI.onDestroy():void");
    }

    public void onDrag() {
        MMWebView mMWebView = this.f118523f;
        if (mMWebView != null) {
            mMWebView.setOnLongClickListener(new WebViewUI$$o(this));
        }
        super.onDrag();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C44366w0 w0Var;
        boolean z;
        com.tencent.xweb.WebChromeClient webChromeClient;
        boolean z2 = false;
        Log.m105925i("MicroMsg.WebViewUI", "onKeyDown keyCode %d", Integer.valueOf(i));
        if (i == 4) {
            MMWebView mMWebView = this.f118523f;
            if (mMWebView != null && mMWebView.hasEnteredFullscreen()) {
                this.f118523f.leaveFullscreen();
                return true;
            } else if (this.f118503X0.mo62553a(false)) {
                return true;
            }
        }
        if (i != 4 || this.f118482Q0 == null || this.f118580y0 == null || (webChromeClient = this.f118485R0) == null) {
            if (i == 4) {
                WebViewRedesignInputFooter webViewRedesignInputFooter = this.f118460F;
                if (webViewRedesignInputFooter == null || !webViewRedesignInputFooter.isShown()) {
                    z = false;
                } else {
                    Log.m105924i("MicroMsg.WebViewUI", "keyboard shouldHideWebPlusKeyBoard");
                    this.f118460F.mo68994b();
                    mo68247O7();
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
            if (i == 4) {
                MMWebView mMWebView2 = this.f118523f;
                if (mMWebView2 == null || !mMWebView2.canGoBack() || !this.f118470K) {
                    C44130p1.f119545i.mo68770a();
                    C43704h2.C6037e.m5916a(getCurrentURL(), 8);
                    C43522y yVar = this.f118513b1;
                    yVar.f117583p++;
                    yVar.f117585q = System.currentTimeMillis();
                } else {
                    mo68246N8();
                    C43704h2.C6037e.m5916a(getCurrentURL(), 7);
                    C43522y yVar2 = this.f118513b1;
                    yVar2.f117583p++;
                    yVar2.f117585q = System.currentTimeMillis();
                    return true;
                }
            }
            if (getIntent().getBooleanExtra("hide_close_btn", false)) {
                Log.m105928w("MicroMsg.WebViewUI", "Close and return are not allowed");
                return true;
            } else if (i == 4 && mo68264W8() && mo68306s9()) {
                return true;
            } else {
                if (i == 4 && this.f118483Q1 != null) {
                    if (mo68321y8().booleanValue()) {
                        return true;
                    }
                    C53513a aVar = this.f118483Q1;
                    if (aVar.mo67896U(2, aVar.f150464v)) {
                        return true;
                    }
                }
                if (i == 4 && (w0Var = this.f118504X1) != null) {
                    if (w0Var.getVisibility() == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        this.f118504X1.mo69124r();
                        return true;
                    }
                }
                if (i == 4) {
                    if (mo68321y8().booleanValue()) {
                        return true;
                    }
                    mo68253Q7();
                }
                return super.onKeyDown(i, keyEvent);
            }
        } else {
            try {
                webChromeClient.onHideCustomView();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WebViewUI", e, "onkeydown", new Object[0]);
            }
            C43704h2.C6037e.m5916a(getCurrentURL(), 7);
            C43522y yVar3 = this.f118513b1;
            yVar3.f117583p++;
            yVar3.f117585q = System.currentTimeMillis();
            return true;
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 82 || this.f118528g2) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public void onPause() {
        Bundle V5;
        Class cls = C77570i.class;
        super.onPause();
        Log.m105925i("MicroMsg.WebViewUI", "WebViewUI-LifeCycle onPause#%s", Integer.valueOf(mo68267Y7()));
        C43859b bVar = this.f118480P1;
        if (bVar != null) {
            bVar.mo64001C();
        }
        C53513a aVar = this.f118483Q1;
        if (aVar != null) {
            aVar.mo74189F();
        }
        C43522y yVar = this.f118513b1;
        if (!(yVar == null || yVar.mo67720g0() == null || this.f118460F == null)) {
            Log.m105924i("MicroMsg.WebViewUI", "keyboard onPause");
            C6425e3.f23429d.mo7433e(this.f118513b1.mo67720g0(), this.f118460F.getEditText(), true);
        }
        ((C77570i) C86312j.m106911c(cls)).mo107725zI(4, "WebViewUI_" + mo68291k8(Util.nullAsNil(this.f118542m1)), mo68267Y7());
        ((C77570i) C86312j.m106911c(cls)).Ge0("WebViewUI_" + mo68291k8(Util.nullAsNil(this.f118542m1)), this.f118514b2, Util.nowSecond());
        C43699e2 k = this.f118459E1.mo68013k();
        long j = k.f118103v;
        if (j != -1) {
            k.f118088g += Util.ticksToNow(j) / 1000;
        }
        C43703h1 i = this.f118459E1.mo68011i();
        long j2 = i.f118115g;
        if (j2 != -1) {
            i.f118111c += Util.ticksToNow(j2);
        }
        C44130p1 p1Var = C44130p1.f119545i;
        Log.m105927v("MicroMsg.WebViewReportUtil", "onPause traceid %s", p1Var.f119546a);
        if (p1Var.f119552g) {
            Log.m105924i("MicroMsg.WebViewReportUtil", "isFinish is true");
        } else if (!Util.isNullOrNil(p1Var.f119546a)) {
            p1Var.mo68774e(6, "", 0);
        }
        try {
            C43791l lVar = this.f118511a1;
            if (!(lVar == null || (V5 = lVar.mo68114V5(19, (Bundle) null)) == null)) {
                boolean z = V5.getBoolean("webview_video_proxy_init");
                Log.m105925i("MicroMsg.WebViewUI", "onPause, has init = %b", Boolean.valueOf(z));
                if (z) {
                    FactoryProxyManager.getPlayManager().appToBack();
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WebViewUI", "notify app toback failed : %s", e.getMessage());
        }
        mo68247O7();
        ScreenShotUtil.setScreenShotCallback(MMApplicationContext.getContext(), (ScreenShotUtil.ScreenShotCallback) null);
        mo68260U8("onPause");
        if (this.f118485R0 != null) {
            Log.m105924i("MicroMsg.WebViewUI", "onPause, now try to hide customview");
            try {
                this.f118485R0.onHideCustomView();
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.WebViewUI", e2, "onPause", new Object[0]);
            }
        }
        C39935f fVar = this.f118503X0;
        synchronized (fVar) {
            for (C91165a.C53318a a : fVar.f107071f) {
                a.mo18009a(0);
            }
        }
        C45695b bVar2 = this.f118477N1.f118673j;
        if (bVar2 != null) {
            bVar2.stopCheck();
        }
        MMWebView mMWebView = this.f118523f;
        if (mMWebView != null) {
            mMWebView.onPause();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.WebViewUI", "onRequestPermissionsResult grantResults length 0. requestCode=%d", Integer.valueOf(i));
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        C89916g.m112446a(this).mo124234h(i, strArr, iArr);
        this.f118534i2.mo68064g(this, i, strArr, iArr);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C6593r0 r0Var = this.f118500W0;
        if (!r0Var.f23841d) {
            r0Var.f23840c = 2;
            String str = r0Var.f23839b;
            Log.m105924i(str, "onRestoreInstanceState#" + r0Var.mo68388b().hashCode());
        }
        boolean z = bundle.getBoolean("isReCreateUI", false);
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105925i("MicroMsg.WebViewUI", "WebViewUI-LifeCycle onRestoreInstanceState %s, now: %s", Boolean.valueOf(z), Long.valueOf(currentTimeMillis));
        if (z) {
            getIntent().putExtra("startTime", currentTimeMillis);
            C43522y yVar = this.f118513b1;
            if (yVar != null) {
                yVar.f117543Q.f123352s = currentTimeMillis;
            }
        }
    }

    public void onResume() {
        Bundle V5;
        super.onResume();
        this.f118497V0 = false;
        Log.m105925i("MicroMsg.WebViewUI", "WebViewUI-LifeCycle onResume#%s", Integer.valueOf(mo68267Y7()));
        C43859b bVar = this.f118480P1;
        if (bVar != null) {
            bVar.mo64003o();
        }
        C53513a aVar = this.f118483Q1;
        if (aVar != null) {
            aVar.mo74188E();
        }
        if (getCurrentURL() != null) {
            C45606x.m50663a(getCurrentURL());
        } else {
            C45606x.m50663a(mo6901n0());
        }
        C43699e2 k = this.f118459E1.mo68013k();
        k.getClass();
        k.f118103v = Util.currentTicks();
        C43703h1 i = this.f118459E1.mo68011i();
        i.getClass();
        i.f118115g = Util.currentTicks();
        C44130p1 p1Var = C44130p1.f119545i;
        Log.m105927v("MicroMsg.WebViewReportUtil", "onResume traceid %s", p1Var.f119546a);
        if (!Util.isNullOrNil(p1Var.f119546a)) {
            p1Var.mo68774e(7, "", 0);
        }
        mo68223A8();
        m47805F9();
        if (getIntent().getBooleanExtra("disable_swipe_back", false) && getSwipeBackLayout() != null) {
            getSwipeBackLayout().setEnableGesture(false);
        }
        try {
            if (C88144b.m109787f()) {
                ScreenShotUtil.setScreenShotCallback(MMApplicationContext.getContext(), this);
            }
        } catch (Exception e) {
            Log.m105929w("MicroMsg.WebViewUI", "setScreenShotCallback fail e:%s", e.getMessage());
        }
        mo68260U8("onResume");
        try {
            C43791l lVar = this.f118511a1;
            if (!(lVar == null || (V5 = lVar.mo68114V5(19, (Bundle) null)) == null)) {
                boolean z = V5.getBoolean("webview_video_proxy_init");
                Log.m105925i("MicroMsg.WebViewUI", "onResume, has init = %b", Boolean.valueOf(z));
                if (z) {
                    FactoryProxyManager.getPlayManager().appToFront();
                }
            }
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.WebViewUI", "notify app tofront failed : %s", e2.getMessage());
        }
        this.f118514b2 = Util.nowSecond();
        C9286a.m8929a(new WebViewUI$$f0(this));
        if (this.f118457D1) {
            finish();
        }
        WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = this.f118572w;
        if (webViewKeyboardLinearLayout != null && webViewKeyboardLinearLayout.f118382n) {
            hideVKB();
            this.f118572w.mo68189b(-2);
        }
        C39935f fVar = this.f118503X0;
        synchronized (fVar) {
            for (C91165a.C53318a c : fVar.f107071f) {
                c.mo18010c();
            }
        }
        WebViewUIStyleHelper webViewUIStyleHelper = this.f118477N1;
        if (webViewUIStyleHelper.mo68378j()) {
            Bundle bundle = (Bundle) ((HashMap) WebViewUIStyleHelper.f118663r).get(webViewUIStyleHelper.mo68373e(webViewUIStyleHelper.f118670g));
            if (!(bundle == null || webViewUIStyleHelper.f118667d == null || !bundle.getBoolean("key_show_live_top_bar", true))) {
                String string = bundle.getString("key_brand_user_name");
                ((C45696d) C86709a0.m107533q(C45696d.class)).mo70974T2();
                webViewUIStyleHelper.mo68383p(string);
            }
        }
        MMWebView mMWebView = this.f118523f;
        if (mMWebView != null) {
            mMWebView.onResume();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        try {
            C6593r0 r0Var = this.f118500W0;
            if (!r0Var.f23841d) {
                r0Var.f23840c = 1;
                String str = r0Var.f23839b;
                Log.m105924i(str, "onSaveInstanceState#" + r0Var.mo68388b().hashCode());
            }
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(mo68267Y7());
            objArr[1] = Boolean.valueOf(bundle != null);
            Log.m105925i("MicroMsg.WebViewUI", "WebViewUI-LifeCycle onSaveInstanceState#%s, outState != null: %s", objArr);
            if (bundle != null) {
                bundle.putBoolean("isReCreateUI", true);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebViewUI", e, "onSaveInstanceState exception", new Object[0]);
        }
    }

    public void onScreenShot(String str, long j) {
        MMWebView mMWebView;
        C48590l lVar = this.f118508Z;
        if (lVar != null && (mMWebView = this.f118523f) != null) {
            mMWebView.getUrl();
            Intent intent = getIntent();
            boolean z = (this.f118491T0.mo70859b().f121046d & 1048576) > 0;
            Log.m105918d("MicroMsg.GeneralControlWrapper", "allowOnScreenShot, ret = " + z);
            if (lVar.f130003h) {
                Log.m105925i("MicroMsg.JsApiHandler", "onScreenShot hasPermission: %b", Boolean.valueOf(z));
                if (z) {
                    String c = C13851h1.C13852a.m13143c("onScreenShot", new HashMap(), lVar.f130011p, lVar.f130012q);
                    MMWebView mMWebView2 = lVar.f129996a;
                    mMWebView2.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
                }
                MMWebView mMWebView3 = lVar.f129996a;
                String str2 = "";
                String q = lVar.mo73253q(mMWebView3 == null ? str2 : mMWebView3.getUrl());
                if (intent != null) {
                    try {
                        MMWebView mMWebView4 = lVar.f129996a;
                        if (mMWebView4 != null) {
                            str2 = mMWebView4.getUrl();
                        }
                        Bundle bundleExtra = intent.getBundleExtra("ad_report_bundle");
                        if (!Util.isNullOrNil(str2) && bundleExtra != null) {
                            String string = bundleExtra.getString("ad_report_ux_info");
                            if (!Util.isNullOrNil(string)) {
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                Uri parse = Uri.parse(str2);
                                String queryParameter = parse.getQueryParameter("mid");
                                String queryParameter2 = parse.getQueryParameter("idx");
                                Log.m105925i("MicroMsg.JsApiHandler", "alvinluo reportAdOnScreenShot appId: %s, mid: %s, idx: %s, adUxInfo: %s, url: %s", q, queryParameter, queryParameter2, string, str2);
                                C115669n.INSTANCE.mo160131h(19213, Integer.valueOf(currentTimeMillis), 6, string, q, queryParameter, queryParameter2, str2);
                            }
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.JsApiHandler", e, "alvinluo reportAdOnScreenShot exception", new Object[0]);
                    }
                }
            }
        }
    }

    public void onStart() {
        super.onStart();
        if (this.f118475M1 != null && mo68243L8()) {
            Log.m105924i("MicroMsg.WebViewUI", "[Handoff] onStart, call onWebViewCreate " + this.f118475M1.toString());
            ((C92331c) C86312j.m106911c(C92331c.class)).mo58361Xv(this.f118475M1);
        }
        Log.m105924i("MicroMsg.WebViewUI", "edw onStart");
    }

    public void onStop() {
        Log.m105925i("MicroMsg.WebViewUI", "WebViewUI-LifeCycle onStop#%s, WebViewUI#%s", Integer.valueOf(mo68267Y7()), Integer.valueOf(hashCode()));
        if (this.f118475M1 != null && mo68243L8()) {
            Log.m105924i("MicroMsg.WebViewUI", "[Handoff] onStop, call onWebViewDestroy " + this.f118475M1.toString());
            ((C92331c) C86312j.m106911c(C92331c.class)).co0(this.f118475M1);
        }
        this.f118535j.mo25981a();
        mo68304q9(true, true);
        super.onStop();
    }

    public void onSwipeBack() {
        hideVKB();
        super.onSwipeBack();
    }

    public boolean onSwipeBackFinish() {
        this.f118584z1 = true;
        C43704h2.C6037e.m5916a(getCurrentURL(), 2);
        return super.onSwipeBackFinish();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C48590l lVar = this.f118508Z;
        if (lVar != null) {
            lVar.mo73254q0(z, false);
        }
        if (z && mo68238I8()) {
            m47808J7(getWindow().getDecorView(), 5894);
        }
        if (z && mo68240J8()) {
            m47808J7(getWindow().getDecorView(), 4866);
        }
    }

    /* renamed from: p8 */
    public C53513a mo68301p8() {
        return this.f118483Q1;
    }

    /* renamed from: p9 */
    public void mo68302p9(int i, boolean z) {
        if (Build.VERSION.SDK_INT < 23 || MIUI.isMIUIV8()) {
            if (z) {
                HashMap<String, WeakReference<Bitmap>> hashMap = C6600v.f23854a;
                i = C85875k4.m106183g0(i, -16777216, 0.78f);
            }
            mo68299o9(i);
            return;
        }
        mo68299o9(i);
        Window window = getWindow();
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        window.getDecorView().setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
    }

    /* renamed from: q8 */
    public C43725q1 mo68303q8() {
        return this.f118513b1.f117685Y0;
    }

    /* renamed from: q9 */
    public final void mo68304q9(boolean z, boolean z2) {
        enableOptionMenu(z);
        boolean z3 = false;
        Log.m105919d("MicroMsg.WebViewUI", "[cpan] set title enable:%b", Boolean.valueOf(z));
        setProgressBarIndeterminateVisibility(false);
        if (z2) {
            C43977g1 g1Var = this.f118465H1;
            if (g1Var.f119141n) {
                g1Var.f119140m = false;
                g1Var.mo68388b().f118546n2 = false;
                g1Var.f119141n = false;
                C77407n nVar = g1Var.f119144q;
                if (nVar != null) {
                    z3 = nVar.mo107563h();
                }
                if (z3) {
                    g1Var.mo68575I();
                }
            }
        } else if (!this.f118558r1 && !this.f118561s1) {
            this.f118513b1.mo63685z0();
        }
    }

    /* renamed from: r8 */
    public C44366w0 mo68305r8() {
        if (this.f118504X1 == null) {
            C44366w0 w0Var = new C44366w0(this, false, new C85978w1(getContext(), C0966R.style.f8414hl), (AttributeSet) null);
            this.f118504X1 = w0Var;
            w0Var.setVisibility(8);
            ViewParent viewParent = (ViewParent) getWindow().getDecorView();
            if (viewParent instanceof ViewGroup) {
                ((ViewGroup) viewParent).addView(this.f118504X1, new FrameLayout.LayoutParams(-1, -1));
                C44366w0 w0Var2 = this.f118504X1;
                w0Var2.f120259v.setOnkbdStateListener(new C44248d1(w0Var2));
                int intExtra = getIntent().getIntExtra(C74928u.C45093i.f122318j, -1);
                int intExtra2 = getIntent().getIntExtra("KOpenArticleSceneFromScene", -1);
                int intExtra3 = getIntent().getIntExtra(C74928u.C45093i.f122315g, -1);
                C44366w0 w0Var3 = this.f118504X1;
                String n0 = mo6901n0();
                String charSequence = getTitle().toString();
                w0Var3.f120248P = intExtra2;
                w0Var3.f120249Q = intExtra3;
                w0Var3.f120250R = intExtra;
                w0Var3.f120251S = 0;
                w0Var3.f120246M = n0;
                w0Var3.f120247N = charSequence;
            }
        }
        return this.f118504X1;
    }

    /* renamed from: r9 */
    public boolean mo63704r9() {
        return false;
    }

    /* renamed from: s6 */
    public int mo6896s6() {
        return getIntent().getIntExtra("lastGetA8KeyRequestId", 0);
    }

    /* renamed from: s8 */
    public void mo66459s8() {
        if (this.f118523f != null) {
            boolean isNullOrNil = Util.isNullOrNil(getCurrentURL());
            if (this.f118545n1 && !isNullOrNil) {
                return;
            }
            if (this.f118523f.canGoBack()) {
                mo68246N8();
                return;
            }
            C44130p1.f119545i.mo68770a();
            finish();
        }
    }

    /* renamed from: s9 */
    public boolean mo68306s9() {
        WebViewUI$$i0 webViewUI$$i0 = this.f118530h1;
        if (webViewUI$$i0 != null) {
            if (Util.isNullOrNil(webViewUI$$i0.f118604a) ? false : webViewUI$$i0.f118604a.equals("true")) {
                WebViewUI$$i0 webViewUI$$i02 = this.f118530h1;
                if (!Util.isNullOrNil("zh_CN".equals(webViewUI$$i02.f118611h) ? webViewUI$$i02.f118605b : webViewUI$$i02.f118606c)) {
                    WebViewUI$$i0 webViewUI$$i03 = this.f118530h1;
                    if (!Util.isNullOrNil("zh_CN".equals(webViewUI$$i03.f118611h) ? webViewUI$$i03.f118607d : webViewUI$$i03.f118608e)) {
                        WebViewUI$$i0 webViewUI$$i04 = this.f118530h1;
                        if (!Util.isNullOrNil("zh_CN".equals(webViewUI$$i04.f118611h) ? webViewUI$$i04.f118609f : webViewUI$$i04.f118610g)) {
                            WebViewUI$$i0 webViewUI$$i05 = this.f118530h1;
                            String str = "zh_CN".equals(webViewUI$$i05.f118611h) ? webViewUI$$i05.f118605b : webViewUI$$i05.f118606c;
                            WebViewUI$$i0 webViewUI$$i06 = this.f118530h1;
                            String str2 = "zh_CN".equals(webViewUI$$i06.f118611h) ? webViewUI$$i06.f118607d : webViewUI$$i06.f118608e;
                            WebViewUI$$i0 webViewUI$$i07 = this.f118530h1;
                            String str3 = "zh_CN".equals(webViewUI$$i07.f118611h) ? webViewUI$$i07.f118609f : webViewUI$$i07.f118610g;
                            Log.m105925i("MicroMsg.WebViewUI", "use js api close window confirm info : %s, %s, %s", str, str2, str3);
                            View inflate = View.inflate(getContext(), C0966R.C0971layout.bbt, (ViewGroup) null);
                            CheckBox checkBox = (CheckBox) inflate.findViewById(C0966R.C0970id.gul);
                            checkBox.setChecked(false);
                            checkBox.setVisibility(8);
                            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gun);
                            textView.setText(str);
                            textView.setTextColor(getResources().getColor(C0966R.color.a7f));
                            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.gum);
                            textView2.setTextColor(getResources().getColor(C0966R.color.a7f));
                            textView2.setVisibility(8);
                            this.f118533i1 = C76879j.m92715I(getContext(), true, "", inflate, str2, str3, new WebViewUI$$y(this, checkBox), new WebViewUI$$z(this));
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void setActionbarColor(int i) {
        super.setActionbarColor(i);
        int i2 = (i >> 24) & 255;
        Log.m105927v("MicroMsg.WebViewUI", "setActionBarColor color: %08x, alpha: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 < 255 && this.f118519d2 != null && !mo68237H8()) {
            this.f118519d2.setBackgroundColor(getResources().getColor(C0966R.color.BW_93));
        }
        View view = this.f118498V1;
        if (view != null) {
            view.setBackgroundColor(getWindow().getStatusBarColor());
            C87773e.m109211d(getWindow());
        }
    }

    public void setBackBtn(MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i) {
        super.setBackBtn(onMenuItemClickListener, i);
        if (C11171e.m11046c(21) && mo68227C8()) {
            setBackBtnColorFilter(C0966R.color.BW_0);
        }
        if (getIntent().getBooleanExtra("hide_close_btn", false)) {
            setBackBtnVisible(false);
        }
    }

    public void setMMOrientation() {
        if (getForceOrientation() == -1) {
            boolean z = false;
            boolean z2 = getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 4).getBoolean("settings_landscape_mode", false);
            this.landscapeMode = z2;
            if (z2) {
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58782dM(new C34826a()) == 1) {
                    z = true;
                }
                if (z) {
                    setRequestedOrientation(-1);
                } else {
                    setRequestedOrientation(2);
                }
            } else {
                setRequestedOrientation(1);
            }
        } else {
            setRequestedOrientation(getForceOrientation());
        }
    }

    public void setMMTitle(String str) {
        super.setMMTitle(str);
        mo68224A9(str);
        mo68226B9(str);
    }

    public void setRequestedOrientation(int i) {
        this.f118447A = i;
        m47805F9();
        super.setRequestedOrientation(i);
    }

    public void showOptionMenu(boolean z) {
        if (getIntent().getBooleanExtra("hide_option_menu", false)) {
            super.showOptionMenu(false);
        } else {
            super.showOptionMenu(z);
        }
    }

    public void showVKB() {
        super.showVKB();
        if (this.f118585z2 == -3) {
            this.f118585z2 = -2;
        } else {
            this.f118585z2 = -3;
        }
    }

    public void startActivity(Intent intent) {
        if (Util.isEqual(intent.getType(), "application/vnd.android.package-archive")) {
            ((C45962f) C86312j.m106911c(C45962f.class)).mo71273X9(MMApplicationContext.getContext(), intent.getData(), (C47223a) null, false);
        } else {
            super.startActivity(intent);
        }
    }

    /* renamed from: t0 */
    public boolean mo483t0() {
        return this.f118503X0.mo483t0();
    }

    /* renamed from: t8 */
    public void mo68312t8(int i, Bundle bundle) {
        Log.m105924i("MicroMsg.WebViewUI", "handleEmojiStoreAction");
    }

    /* renamed from: t9 */
    public final boolean mo68313t9() {
        boolean booleanExtra = getIntent().getBooleanExtra("forceHideShare", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("showShare", true);
        Log.m105925i("MicroMsg.WebViewUI", "forceHideShare:%b: showShareBtn:%b", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2));
        return !booleanExtra && booleanExtra2;
    }

    /* renamed from: u */
    public C45520t mo6897u() {
        return this.f118513b1;
    }

    /* renamed from: u8 */
    public void mo63388u8(int i, Bundle bundle) {
    }

    /* renamed from: u9 */
    public void mo68314u9(C43977g1 g1Var) {
        C43741b bVar = this.f118537j2;
        C43791l lVar = this.f118511a1;
        bVar.getClass();
        if (!isFinishing()) {
            bVar.f118211a = new WeakReference<>(g1Var);
            String currentURL = getCurrentURL();
            if (Util.isNullOrNil(currentURL)) {
                Log.m105920e("MicroMsg.BrowserChooserHelper", "open in browser fail, url is null");
                return;
            }
            if (lVar != null) {
                try {
                    currentURL = lVar.mo68123cU(currentURL);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.BrowserChooserHelper", "showAndOpenInBrowser, getShareUrl, exception = %s", e);
                }
            }
            if (!currentURL.startsWith(HttpWrapperBase.PROTOCAL_HTTP) && !currentURL.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
                currentURL = HttpWrapperBase.PROTOCAL_HTTP + currentURL;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(currentURL));
            try {
                if (!Util.isOverseasUser(this)) {
                    if (!ChannelUtil.isGPVersion()) {
                        startActivityForResult(C46969f.m52276a(this, intent, currentURL, true), 205);
                        return;
                    }
                }
                Log.m105925i("MicroMsg.BrowserChooserHelper", "open in browser %b/%b", Boolean.valueOf(Util.isOverseasUser(this)), Boolean.valueOf(ChannelUtil.isGPVersion()));
                if (C11171e.m11046c(29)) {
                    PendingIntent.getActivity(this, 0, intent, 134217728).send(this, 1, (Intent) null, new C43740a(bVar), (Handler) null);
                    return;
                }
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "showAndOpenInBrowser", "(Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;Lcom/tencent/mm/plugin/webview/stub/WebViewStub_AIDL;Lcom/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "showAndOpenInBrowser", "(Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;Lcom/tencent/mm/plugin/webview/stub/WebViewStub_AIDL;Lcom/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.BrowserChooserHelper", "open in browser failed : %s", e2.getMessage());
            }
        }
    }

    /* renamed from: v8 */
    public void mo68315v8(Bundle bundle) {
        int i;
        int i2;
        boolean z = false;
        if (bundle.getBoolean("set_navigation_bar_color_reset", false)) {
            WebViewUIStyleHelper webViewUIStyleHelper = this.f118477N1;
            i = webViewUIStyleHelper == null ? getResources().getColor(C0966R.color.akm) : webViewUIStyleHelper.mo68371c();
            i2 = 255;
        } else {
            int i3 = bundle.getInt("set_navigation_bar_color_color");
            int i4 = bundle.getInt("set_navigation_bar_color_alpha");
            z = bundle.getBoolean("set_navigation_bar_color_titleAlphaAdjustment");
            i = i3;
            i2 = i4;
        }
        setActionbarColor((i & 16777215) | (i2 << 24));
        if (z) {
            setTitleAlpha(((float) i2) / 255.0f);
        }
    }

    /* renamed from: v9 */
    public void mo68316v9(String str) {
        this.f118508Z.mo73243l(Scopes.PROFILE, true);
        C48590l lVar = this.f118508Z;
        if (!lVar.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onGoProfile fail, not ready");
            return;
        }
        MMHandler mMHandler = lVar.f130001f;
        if (mMHandler != null) {
            mMHandler.post(new C13864v(lVar, str));
        }
    }

    /* renamed from: w4 */
    public void mo484w4(View view, int i) {
        C39935f fVar = this.f118503X0;
        if (view == null) {
            view = this.f118523f;
        }
        fVar.mo484w4(view, i);
    }

    /* renamed from: w8 */
    public void mo68317w8() {
        ProgressBar progressBar = this.f118550p;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            this.f118550p.setVisibility(8);
        }
    }

    /* renamed from: w9 */
    public void mo68318w9() {
        this.f118465H1.mo68575I();
    }

    /* renamed from: x4 */
    public void mo6902x4(String str) {
        Log.m105924i("MicroMsg.WebViewUI", "getTransText");
        WebViewTransHelper webViewTransHelper = this.f118477N1.f118669f;
        webViewTransHelper.getClass();
        C87412m.m108594g(str, "content");
        Log.m105924i("MicroMsg.WebViewTransHelper", "get web page content: " + str);
        new Handler(Looper.getMainLooper()).post(new C46182g0(webViewTransHelper, str));
    }

    /* renamed from: x8 */
    public void mo68319x8() {
        if (this.f118460F != null) {
            Log.m105924i("MicroMsg.WebViewUI", "keyboard hide hideWebPlusKeyBoard");
            this.f118460F.mo68994b();
        }
    }

    /* renamed from: x9 */
    public int mo68320x9() {
        WebViewRedesignInputFooter webViewRedesignInputFooter = this.f118460F;
        if (webViewRedesignInputFooter == null) {
            return 0;
        }
        webViewRedesignInputFooter.getClass();
        Log.m105924i("MicroMsg.WebViewInputFooter", "showSmileyOnly");
        webViewRedesignInputFooter.setVisibility(0);
        View view = webViewRedesignInputFooter.f120008q;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "showSmileyOnly", "()I", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "showSmileyOnly", "()I", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        webViewRedesignInputFooter.f120014w = true;
        webViewRedesignInputFooter.f120001g = 1;
        return webViewRedesignInputFooter.mo69007j();
    }

    /* renamed from: y2 */
    public void mo24942y2(int i, int i2, int i3, int i4) {
        WebViewUIStyleHelper webViewUIStyleHelper = this.f118477N1;
        if (!(webViewUIStyleHelper == null || webViewUIStyleHelper.f118664a || webViewUIStyleHelper.f118667d == null)) {
            if (Util.isNullOrNil(webViewUIStyleHelper.f118670g)) {
                webViewUIStyleHelper.f118670g = Util.nullAsNil(webViewUIStyleHelper.f118667d.getCurrentURL());
            }
            webViewUIStyleHelper.f118669f.f117509i.setValue(Integer.valueOf(i2));
            webViewUIStyleHelper.mo68380l();
        }
        C44199u0 u0Var = this.f118557r;
        if (u0Var != null && u0Var.f119742g) {
            long currentTimeMillis = System.currentTimeMillis();
            if (u0Var.f119739d == 0) {
                u0Var.f119739d = currentTimeMillis;
                u0Var.f119740e = i2;
            }
            if (Math.abs(currentTimeMillis - u0Var.f119739d) > 200 && Math.abs(i2 - u0Var.f119740e) > u0Var.f119741f) {
                if (i2 - u0Var.f119740e > 0 && u0Var.f119736a.getVisibility() == 0) {
                    u0Var.mo68844b();
                } else if (i2 - u0Var.f119740e < 0 && u0Var.f119736a.getVisibility() != 0) {
                    u0Var.mo68845c();
                }
                u0Var.f119739d = currentTimeMillis;
                u0Var.f119740e = i2;
            }
        }
    }

    /* renamed from: y8 */
    public final Boolean mo68321y8() {
        if (this.f118453C) {
            Log.m105924i("MicroMsg.WebViewUI", "hold on swipe back");
            this.f118453C = false;
            C48590l lVar = this.f118508Z;
            if (lVar != null) {
                if (!lVar.f130003h) {
                    Log.m105920e("MicroMsg.JsApiHandler", "not ready");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("userHasGoBack", Boolean.TRUE);
                    MMHandlerThread.postToMainThread(new C48612w(lVar, C13851h1.C13852a.m13143c("onUserGoBack", hashMap, lVar.f130011p, lVar.f130012q)));
                }
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: y9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo68322y9(java.lang.String r35, java.lang.String r36, int r37, int r38, java.util.Map<java.lang.String, java.lang.String> r39) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r39
            com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter r6 = r1.f118460F
            if (r6 != 0) goto L_0x0016
            java.lang.String r0 = "MicroMsg.WebViewUI"
            java.lang.String r2 = "null == this.inputFooter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            return
        L_0x0016:
            com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout r0 = r1.f118572w
            r6.f120011t = r0
            java.lang.String r0 = "showType"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r8 = "MicroMsg.WebViewInputFooter"
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            if (r7 != 0) goto L_0x003d
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0034 }
            goto L_0x003e
        L_0x0034:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = r7.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x003d:
            r0 = 0
        L_0x003e:
            java.lang.String r7 = "sendButtonWord"
            r12 = 1
            if (r0 != r12) goto L_0x02bd
            java.lang.String r0 = "showWriteMessageStyle"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            r6.removeAllViews()
            com.tencent.mm.ui.MMActivity r0 = r6.f120013v
            r13 = 2131498360(0x7f0c1578, float:1.862034E38)
            android.view.View r0 = android.view.View.inflate(r0, r13, r6)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.f120009r = r0
            r13 = 2131316954(0x7f0950da, float:1.8252404E38)
            android.view.View r0 = r0.findViewById(r13)
            r6.f120008q = r0
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            r14 = 0
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r13.mo10233c(r14)
            java.lang.Object[] r15 = r13.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter"
            java.lang.String r17 = "setWriteMessageStyleView"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setAlpha"
            java.lang.String r21 = "(F)V"
            r14 = r0
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r13 = r13.mo10231a(r9)
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            r0.setAlpha(r13)
            java.lang.String r15 = "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter"
            java.lang.String r16 = "setWriteMessageStyleView"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setAlpha"
            java.lang.String r20 = "(F)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.view.View r0 = r6.f120008q
            java.lang.String r13 = "writeMessage"
            r0.setTag(r13)
            android.view.ViewGroup r0 = r6.f120009r
            r13 = 2131316955(0x7f0950db, float:1.8252406E38)
            android.view.View r0 = r0.findViewById(r13)
            com.tencent.mm.ui.widget.MMEditText r0 = (com.tencent.p014mm.p136ui.widget.MMEditText) r0
            r6.f120006o = r0
            android.view.ViewGroup r0 = r6.f120009r
            r13 = 2131316979(0x7f0950f3, float:1.8252455E38)
            android.view.View r0 = r0.findViewById(r13)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f120010s = r0
            android.view.ViewGroup r0 = r6.f120009r
            r13 = 2131316965(0x7f0950e5, float:1.8252426E38)
            android.view.View r0 = r0.findViewById(r13)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r6.f120007p = r0
            r0 = 2131316957(0x7f0950dd, float:1.825241E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r6.f120012u = r0
            android.view.ViewGroup r0 = r6.f120009r
            r13 = 2131316962(0x7f0950e2, float:1.825242E38)
            android.view.View r0 = r0.findViewById(r13)
            android.widget.Button r0 = (android.widget.Button) r0
            r6.f120004j = r0
            android.view.ViewGroup r0 = r6.f120009r
            r13 = 2131316958(0x7f0950de, float:1.8252412E38)
            android.view.View r0 = r0.findViewById(r13)
            android.widget.Button r0 = (android.widget.Button) r0
            r6.f120005n = r0
            android.view.ViewGroup r0 = r6.f120009r
            r13 = 2131316963(0x7f0950e3, float:1.8252422E38)
            android.view.View r0 = r0.findViewById(r13)
            r6.f120003i = r0
            r6.mo69004h()
            r6.setVisibility(r9)
            android.view.ViewGroup r0 = r6.f120009r
            r13 = 2131316959(0x7f0950df, float:1.8252414E38)
            android.view.View r0 = r0.findViewById(r13)
            r13 = r0
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            android.view.ViewGroup r0 = r6.f120009r
            r14 = 2131307243(0x7f092aeb, float:1.8232708E38)
            android.view.View r0 = r0.findViewById(r14)
            r14 = r0
            android.widget.TextView r14 = (android.widget.TextView) r14
            android.view.ViewGroup r0 = r6.f120009r
            r15 = 2131307238(0x7f092ae6, float:1.8232698E38)
            android.view.View r0 = r0.findViewById(r15)
            r15 = r0
            android.widget.TextView r15 = (android.widget.TextView) r15
            java.lang.String r0 = "leftWords"
            java.lang.Object r0 = r5.get(r0)
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = "rightWords"
            java.lang.Object r0 = r5.get(r0)
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r0 = "editBoxHeight"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.tencent.mm.ui.MMActivity r9 = r6.f120013v
            java.lang.String r4 = "buttonMargin"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r4)
            int r4 = kg3.C76577a.m92151b(r9, r4)
            com.tencent.mm.ui.MMActivity r9 = r6.f120013v
            java.lang.String r3 = "textViewMargin"
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)
            int r3 = kg3.C76577a.m92151b(r9, r3)
            if (r4 > 0) goto L_0x0171
            com.tencent.mm.ui.MMActivity r4 = r6.f120013v
            r9 = 16
            int r4 = kg3.C76577a.m92151b(r4, r9)
        L_0x0171:
            if (r3 > 0) goto L_0x017b
            com.tencent.mm.ui.MMActivity r3 = r6.f120013v
            r9 = 12
            int r3 = kg3.C76577a.m92151b(r3, r9)
        L_0x017b:
            android.view.ViewGroup r9 = r6.f120009r
            r1 = 2131316961(0x7f0950e1, float:1.8252418E38)
            android.view.View r1 = r9.findViewById(r1)
            da3.d r9 = new da3.d
            r9.<init>(r6)
            r1.setOnClickListener(r9)
            if (r0 == 0) goto L_0x019c
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0193 }
            goto L_0x019d
        L_0x0193:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = r1.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x019c:
            r0 = 0
        L_0x019d:
            r14.setText(r11)
            r15.setText(r12)
            da3.e r1 = new da3.e
            r1.<init>(r6)
            r15.setOnClickListener(r1)
            r1 = 1056964608(0x3f000000, float:0.5)
            com.tencent.p014mm.p136ui.tools.C7007c1.m7257b(r15, r1)
            android.view.View r1 = r6.f120000f
            if (r1 == 0) goto L_0x01ee
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r10)
            java.lang.Object[] r20 = r8.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter"
            java.lang.String r22 = "showWriteMessageStyle"
            java.lang.String r23 = "(Ljava/util/Map;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r1
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r9 = 0
            java.lang.Object r8 = r8.mo10231a(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r1.setVisibility(r8)
            java.lang.String r20 = "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter"
            java.lang.String r21 = "showWriteMessageStyle"
            java.lang.String r22 = "(Ljava/util/Map;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x01ee:
            android.view.View r1 = r6.f120008q
            if (r1 == 0) goto L_0x022c
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r10)
            java.lang.Object[] r27 = r8.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter"
            java.lang.String r29 = "showWriteMessageStyle"
            java.lang.String r30 = "(Ljava/util/Map;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r1
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r9 = 0
            java.lang.Object r8 = r8.mo10231a(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r1.setVisibility(r8)
            java.lang.String r27 = "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter"
            java.lang.String r28 = "showWriteMessageStyle"
            java.lang.String r29 = "(Ljava/util/Map;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
        L_0x022c:
            com.tencent.mm.ui.widget.MMEditText r1 = r6.f120006o
            if (r1 == 0) goto L_0x0257
            r8 = 1
            r1.setEnabled(r8)
            com.tencent.mm.ui.widget.MMEditText r1 = r6.f120006o
            r8 = 2131235665(0x7f081351, float:1.808753E38)
            r1.setBackgroundResource(r8)
            if (r0 <= 0) goto L_0x0257
            com.tencent.mm.ui.widget.MMEditText r1 = r6.f120006o
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            com.tencent.mm.ui.MMActivity r8 = r6.f120013v
            int r0 = kg3.C76577a.m92151b(r8, r0)
            r1.height = r0
            r1.leftMargin = r3
            r1.rightMargin = r3
            com.tencent.mm.ui.widget.MMEditText r0 = r6.f120006o
            r0.setLayoutParams(r1)
        L_0x0257:
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            r0.leftMargin = r4
            r0.rightMargin = r4
            r13.setLayoutParams(r0)
            android.view.View r0 = r6.f120003i
            if (r0 == 0) goto L_0x02a2
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r10)
            java.lang.Object[] r20 = r1.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter"
            java.lang.String r22 = "showWriteMessageStyle"
            java.lang.String r23 = "(Ljava/util/Map;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r0
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r3 = 0
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r20 = "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter"
            java.lang.String r21 = "showWriteMessageStyle"
            java.lang.String r22 = "(Ljava/util/Map;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x02a2:
            java.lang.Object r0 = r5.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x02b8
            android.widget.Button r1 = r6.f120004j
            r1.setText(r0)
            android.widget.Button r1 = r6.f120005n
            r1.setText(r0)
        L_0x02b8:
            r6.mo68996d(r5)
            goto L_0x03b2
        L_0x02bd:
            java.lang.String r0 = "showDefaultStyle"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            r6.mo68999g()
            r1 = 0
            r6.setVisibility(r1)
            android.view.View r0 = r6.f120000f
            if (r0 == 0) goto L_0x0309
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r1.mo10233c(r10)
            java.lang.Object[] r20 = r1.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter"
            java.lang.String r22 = "showDefaultStyle"
            java.lang.String r23 = "(Ljava/util/Map;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r0
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r3 = 0
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r20 = "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter"
            java.lang.String r21 = "showDefaultStyle"
            java.lang.String r22 = "(Ljava/util/Map;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x0309:
            android.view.View r0 = r6.f120008q
            if (r0 == 0) goto L_0x0349
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r1.mo10233c(r10)
            java.lang.Object[] r27 = r1.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter"
            java.lang.String r29 = "showDefaultStyle"
            java.lang.String r30 = "(Ljava/util/Map;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r0
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r3 = 0
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r27 = "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter"
            java.lang.String r28 = "showDefaultStyle"
            java.lang.String r29 = "(Ljava/util/Map;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
        L_0x0349:
            com.tencent.mm.ui.widget.MMEditText r0 = r6.f120006o
            if (r0 == 0) goto L_0x0359
            r1 = 1
            r0.setEnabled(r1)
            com.tencent.mm.ui.widget.MMEditText r0 = r6.f120006o
            r1 = 2131235665(0x7f081351, float:1.808753E38)
            r0.setBackgroundResource(r1)
        L_0x0359:
            android.view.View r11 = r6.f120003i
            if (r11 == 0) goto L_0x0399
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r0.mo10233c(r10)
            java.lang.Object[] r20 = r0.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter"
            java.lang.String r22 = "showDefaultStyle"
            java.lang.String r23 = "(Ljava/util/Map;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r11
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r11.setVisibility(r0)
            java.lang.String r12 = "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter"
            java.lang.String r13 = "showDefaultStyle"
            java.lang.String r14 = "(Ljava/util/Map;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x0399:
            java.lang.Object r0 = r5.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x03af
            android.widget.Button r1 = r6.f120004j
            r1.setText(r0)
            android.widget.Button r1 = r6.f120005n
            r1.setText(r0)
        L_0x03af:
            r6.mo68996d(r5)
        L_0x03b2:
            r1 = r34
            if (r2 == 0) goto L_0x03bb
            com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter r0 = r1.f118460F
            r0.setText(r2)
        L_0x03bb:
            r2 = r36
            if (r2 == 0) goto L_0x03c4
            com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter r0 = r1.f118460F
            r0.setPlaceholder(r2)
        L_0x03c4:
            r2 = r37
            if (r2 <= 0) goto L_0x03d4
            com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter r0 = r1.f118460F
            r0.setMaxCount(r2)
            com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter r0 = r1.f118460F
            r2 = r38
            r0.setShowRemindWordCount(r2)
        L_0x03d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI.mo68322y9(java.lang.String, java.lang.String, int, int, java.util.Map):void");
    }

    /* renamed from: z2 */
    public void mo68323z2(Bundle bundle) {
        if (bundle != null) {
            mo68305r8().setCommentTopicId(bundle.getLong("commentTopicId"));
        }
        C44366w0 r8 = mo68305r8();
        String currentURL = getCurrentURL();
        r8.getClass();
        if (!Util.isNullOrNil(currentURL)) {
            r8.f120246M = currentURL;
        }
        C44366w0 r84 = mo68305r8();
        String string = bundle.getString("reply_content");
        int i = bundle.getInt("personal_comment_id");
        r84.getClass();
        C87412m.m108594g(string, "replyContent");
        r84.mo69123q(2);
        r84.mo69119n(false);
        if (Util.isNullOrNil(string) || i == 0 || !r84.mo69125s()) {
            r84.mo69123q(1);
            r84.mo69119n(false);
            r84.mo69141x(false);
            return;
        }
        r84.mo69140w(string, i, false);
        r84.mo69141x(false);
    }

    /* renamed from: z8 */
    public void mo68187z8() {
        int intExtra = getIntent().getIntExtra("webview_bg_color_rsID", -1);
        if (intExtra != -1 && getContentView() != null) {
            setBackGroundColorResource(intExtra);
            getContentView().setBackgroundResource(intExtra);
            this.f118523f.setBackgroundColor(0);
            this.f118572w.setBackgroundResource(17170445);
            this.f118575x.setBackgroundResource(17170445);
            this.f118531h2.mo68762g(0);
        } else if (getIntent().getBooleanExtra(C74928u.C45093i.f122326r, false)) {
            this.f118523f.setBackgroundColor(getResources().getColor(C0966R.color.f2975b6));
        } else {
            this.f118523f.setBackgroundColor(getResources().getColor(C0966R.color.al6));
        }
        if (mo68237H8()) {
            C44125o1 o1Var = this.f118531h2;
            o1Var.getClass();
            boolean isMainland = WeChatBrands.AppInfo.current().isMainland();
            o1Var.f119541q = true;
            this.f118531h2.mo68757b();
        }
    }

    /* renamed from: z9 */
    public void mo68324z9() {
        if (this.f118513b1 != null) {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("_webview_jsloader");
            C87412m.m108593f(mmkv, "getMMKV(\"_webview_jsloader\")");
            mmkv.putBoolean("vconsole", !C36979g1.m41111a());
            this.f118513b1.reload();
        }
    }

    public void setMMTitle(CharSequence charSequence) {
        super.setMMTitle(charSequence);
        mo68224A9(charSequence.toString());
        mo68226B9(charSequence.toString());
    }

    public void showOptionMenu(int i, boolean z) {
        if (getIntent().getBooleanExtra("hide_option_menu", false)) {
            super.showOptionMenu(i, false);
        } else {
            super.showOptionMenu(i, z);
        }
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
        try {
            Log.m105925i("MicroMsg.WebViewUI", "WebViewUI-LifeCycle onSaveInstanceStateWithPersistentState#%s", Integer.valueOf(mo68267Y7()));
            bundle.putBoolean("isReCreateUI", true);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebViewUI", e, "onSaveInstanceStateWithPersistentState exception", new Object[0]);
        }
    }
}
