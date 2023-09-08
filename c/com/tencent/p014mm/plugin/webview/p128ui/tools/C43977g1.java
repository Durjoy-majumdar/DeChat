package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82980n;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.model.C43704h2;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUIStyleHelper;
import com.tencent.p014mm.plugin.webview.p128ui.tools.game.GameWebViewUI;
import com.tencent.p014mm.plugin.webview.stub.C43784c;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d93.C45298c;
import de3.C107029o;
import di3.C86312j;
import ea3.C58536w;
import ea3.C7618l;
import gq0.C107879e0;
import gq0.C107885g0;
import gq0.C45944i0;
import gq0.C59603h0;
import h81.C32735h;
import i83.C33246y;
import i83.C46176a0;
import i83.C46194p;
import i83.C46205z;
import iq0.C98783b;
import j20.C117292a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jp3.C9486a;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kk0.C88191m;
import kr0.C109033l0;
import m93.C46969f;
import m93.C46971i;
import m93.C46973j;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C47268j0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76878h0;
import nj3.C76879j;
import org.json.JSONObject;
import p206nj.C117627q;
import p244tt.C14088e;
import p629ny.C76979h;
import p645pj.C47506e;
import pb1.C47453t0;
import qo3.C77407n;
import t83.C13851h1;
import t83.C36979g1;
import t83.C48590l;
import t83.C48607t;
import te3.C52304zt1;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1 */
public class C43977g1 extends C43830a {

    /* renamed from: b */
    public Map<String, SparseBooleanArray> f119129b = new HashMap();

    /* renamed from: c */
    public Map<String, Integer> f119130c = new HashMap();

    /* renamed from: d */
    public LruCache<String, Bitmap> f119131d = new LruCache<>(12);

    /* renamed from: e */
    public HashMap<String, String> f119132e = new HashMap<>();

    /* renamed from: f */
    public C46973j f119133f = new C46973j(1);

    /* renamed from: g */
    public HashMap<Integer, C43997u> f119134g = new HashMap<>();

    /* renamed from: h */
    public C58536w f119135h = new C58536w();

    /* renamed from: i */
    public View f119136i = null;

    /* renamed from: j */
    public String f119137j;

    /* renamed from: k */
    public HashMap<String, Integer> f119138k = new HashMap<>();

    /* renamed from: l */
    public boolean f119139l = false;

    /* renamed from: m */
    public boolean f119140m = true;

    /* renamed from: n */
    public boolean f119141n = false;

    /* renamed from: o */
    public Set<Integer> f119142o = new HashSet();

    /* renamed from: p */
    public Set<Integer> f119143p = new C6171k(this);

    /* renamed from: q */
    public C77407n f119144q;

    /* renamed from: r */
    public C76874e0 f119145r;

    /* renamed from: s */
    public ArrayList<C47506e.C47508b> f119146s;

    /* renamed from: t */
    public Boolean f119147t;

    /* renamed from: u */
    public String f119148u = null;

    /* renamed from: v */
    public AppBrandOpenMaterialCollection f119149v = null;

    /* renamed from: w */
    public C107885g0 f119150w = null;

    /* renamed from: x */
    public C43996t f119151x = null;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$k */
    public class C6171k extends HashSet<Integer> {
        public C6171k(C43977g1 g1Var) {
            add(1);
            add(2);
            add(38);
            add(39);
            add(3);
            add(35);
            add(10);
            add(1000);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$n */
    public class C6172n implements C76878h0 {
        public C6172n() {
        }

        /* renamed from: a */
        public void mo6974a(ImageView imageView, ImageView imageView2, MenuItem menuItem) {
            String str = menuItem.getTitle() + "";
            boolean z = true;
            if (!Util.isNullOrNil(((C76875f0) menuItem).f224730y)) {
                try {
                    String mr = C43977g1.this.mo68388b().f118513b1.f117601y.mo68142mr(((C76875f0) menuItem).f224730y);
                    HashMap<String, WeakReference<Bitmap>> hashMap = C6600v.f23854a;
                    Bitmap a = C7618l.f25900a.mo8750a(mr);
                    Bitmap roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(a, true, ((float) a.getWidth()) * 0.1f);
                    imageView.setVisibility(8);
                    imageView2.setImageBitmap(roundedCornerBitmap);
                    imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                    C43977g1.this.f119131d.put(str, roundedCornerBitmap);
                } catch (RemoteException e) {
                    Log.m105928w("MicroMsg.WebViewMenuHelper", "handle share to recent friends, ex = " + e.getMessage());
                }
            } else {
                C43977g1.this.getClass();
                if (menuItem.getItemId() < 10000) {
                    z = false;
                }
                if (z) {
                    imageView.setVisibility(8);
                } else if (C43977g1.this.f119131d.get(str) == null || C43977g1.this.f119131d.get(str).isRecycled()) {
                    Log.m105928w("MicroMsg.WebViewMenuHelper", "on attach icon, load from cache fail");
                    try {
                        String mr4 = C43977g1.this.mo68388b().f118513b1.f117601y.mo68142mr(str);
                        if (!Util.isNullOrNil(mr4)) {
                            HashMap<String, WeakReference<Bitmap>> hashMap2 = C6600v.f23854a;
                            Bitmap a2 = C7618l.f25900a.mo8750a(mr4);
                            if (a2 != null && !a2.isRecycled()) {
                                imageView.setImageBitmap(a2);
                                C43977g1.this.f119131d.put(str, a2);
                            }
                        }
                    } catch (Exception e2) {
                        Log.m105928w("MicroMsg.WebViewMenuHelper", "getheadimg, ex = " + e2.getMessage());
                    }
                } else {
                    imageView.setImageBitmap(C43977g1.this.f119131d.get(str));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$o */
    public class C6173o implements C47268j0 {
        public C6173o() {
        }

        /* renamed from: a */
        public void mo7130a(TextView textView, MenuItem menuItem) {
            CharSequence charSequence;
            String str = menuItem.getTitle() + "";
            if (textView == null) {
                return;
            }
            if (!(menuItem instanceof C76875f0) || (charSequence = ((C76875f0) menuItem).f224719n) == null) {
                String str2 = C43977g1.this.f119132e.get(str);
                if (Util.isNullOrNil(str2)) {
                    C43977g1.this.getClass();
                    textView.setText(str);
                    return;
                }
                textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(C43977g1.this.mo68388b(), str2, textView.getTextSize()));
                return;
            }
            C43977g1 g1Var = C43977g1.this;
            String charSequence2 = charSequence.toString();
            g1Var.getClass();
            textView.setText(charSequence2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$a */
    public class C43978a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ JsapiPermissionWrapper f119152d;

        /* renamed from: e */
        public final /* synthetic */ int f119153e;

        public C43978a(JsapiPermissionWrapper jsapiPermissionWrapper, int i) {
            this.f119152d = jsapiPermissionWrapper;
            this.f119153e = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0286, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isEqual(((e00.C31379w) di3.C86312j.m106911c(r10)).mo57932lF(r1.f119154f.mo68388b().f118513b1.f117597w, r1.f119154f.mo68388b().mo68268Z7()), ((e00.C31379w) di3.C86312j.m106911c(r10)).mo57932lF(r1.f119154f.mo68388b().f118565t2, r1.f119154f.mo68388b().mo68268Z7())) == false) goto L_0x0288;
         */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x03ce  */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x04a7  */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x0516  */
        /* JADX WARNING: Removed duplicated region for block: B:156:0x0529  */
        /* JADX WARNING: Removed duplicated region for block: B:181:0x05da A[Catch:{ Exception -> 0x05df }] */
        /* JADX WARNING: Removed duplicated region for block: B:186:0x05f9  */
        /* JADX WARNING: Removed duplicated region for block: B:199:0x0649  */
        /* JADX WARNING: Removed duplicated region for block: B:200:0x0678  */
        /* JADX WARNING: Removed duplicated region for block: B:233:0x0759 A[Catch:{ Exception -> 0x0769 }, LOOP:1: B:231:0x0753->B:233:0x0759, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x01be  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x022e  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0333  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0335  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x036e A[Catch:{ Exception -> 0x0394 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onCreateMMMenu(nj3.C76874e0 r25) {
            /*
                r24 = this;
                r1 = r24
                r8 = r25
                java.lang.String r9 = "enterprise_has_connector"
                java.lang.Class<e00.w> r10 = e00.C31379w.class
                java.lang.String r11 = "WebViewShare_wv_url"
                java.lang.String r12 = "MicroMsg.WebViewMenuHelper"
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                boolean r0 = r0.mo68389c()
                if (r0 == 0) goto L_0x0015
                return
            L_0x0015:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                boolean r0 = r0.mo68570D()
                if (r0 == 0) goto L_0x001e
                return
            L_0x001e:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r0.f119145r = r8
                com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r14 = 480(0x1e0, double:2.37E-321)
                r16 = 0
                r18 = 1
                r20 = 0
                r13.idkeyStat(r14, r16, r18, r20)
                r25.clear()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                java.lang.Boolean r0 = r0.f119147t
                boolean r0 = r0.booleanValue()
                r13 = 0
                r14 = 0
                if (r0 == 0) goto L_0x0069
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                java.util.ArrayList<pj.e$b> r0 = r0.f119146s
                int r0 = r0.size()
                r2 = 0
            L_0x0047:
                if (r2 >= r0) goto L_0x0068
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                java.util.ArrayList<pj.e$b> r3 = r3.f119146s
                java.lang.Object r3 = r3.get(r2)
                pj.e$b r3 = (p645pj.C47506e.C47508b) r3
                int r4 = r3.f127481c
                java.lang.String r5 = r3.f127479a
                android.view.MenuItem r4 = r8.mo107142f(r4, r5)
                nj3.f0 r4 = (nj3.C76875f0) r4
                r4.f224728w = r3
                r4.setIcon((android.graphics.drawable.Drawable) r13)
                r4.setIcon((int) r14)
                int r2 = r2 + 1
                goto L_0x0047
            L_0x0068:
                return
            L_0x0069:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r15 = 1
                boolean r0 = r0.mo68580p(r15)
                if (r0 == 0) goto L_0x0119
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r2 = r1.f119152d
                r7 = 21
                boolean r0 = r0.mo68567A(r2, r7)
                if (r0 == 0) goto L_0x0119
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                boolean r0 = r0.mo68581q(r15)
                if (r0 == 0) goto L_0x0119
                r3 = 1
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r2 = 2131834358(0x7f1135f6, float:1.9301824E38)
                java.lang.String r4 = r0.getString(r2)
                r5 = 2131756158(0x7f10047e, float:1.9143216E38)
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                android.content.res.Resources r0 = r0.getResources()
                r2 = 2131099756(0x7f06006c, float:1.7811874E38)
                int r6 = r0.getColor(r2)
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r2 = r1.f119152d
                boolean r0 = r0.mo68574H(r2, r7)
                r2 = r25
                r15 = 21
                r7 = r0
                r2.mo107150j(r3, r4, r5, r6, r7)
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r2 = r1.f119152d
                boolean r0 = r0.mo68574H(r2, r15)
                if (r0 != 0) goto L_0x0119
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.mo68388b()
                com.tencent.mm.plugin.webview.core.y r2 = r2.f118513b1
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                qo3.n r4 = r3.f119144q
                ea3.w r5 = r3.f119135h
                android.view.View r3 = r3.f119136i
                java.lang.String r6 = "context"
                gy3.C87412m.m108594g(r0, r6)
                java.lang.String r6 = "controller"
                gy3.C87412m.m108594g(r2, r6)
                java.lang.String r6 = "recentForwardReporter"
                gy3.C87412m.m108594g(r5, r6)
                if (r4 != 0) goto L_0x00ea
                goto L_0x0119
            L_0x00ea:
                java.lang.Class<wc3.e0> r6 = wc3.C15133e0.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                wc3.e0 r6 = (wc3.C15133e0) r6
                wc3.e0 r6 = r6.Ct0()
                com.tencent.mm.plugin.webview.ui.tools.widget.d r7 = new com.tencent.mm.plugin.webview.ui.tools.widget.d
                r17 = r7
                r18 = r6
                r19 = r0
                r20 = r4
                r21 = r2
                r22 = r5
                r23 = r3
                r17.<init>(r18, r19, r20, r21, r22, r23)
                r4.f225778n = r7
                com.tencent.mm.plugin.webview.ui.tools.widget.e r0 = new com.tencent.mm.plugin.webview.ui.tools.widget.e
                r0.<init>(r6, r5, r13, r2)
                r4.f225789s = r0
                com.tencent.mm.plugin.webview.ui.tools.widget.f r0 = new com.tencent.mm.plugin.webview.ui.tools.widget.f
                r0.<init>(r6, r4)
                r4.f225791t = r0
            L_0x0119:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r15 = 2
                boolean r0 = r0.mo68580p(r15)
                r7 = 23
                if (r0 == 0) goto L_0x0156
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r2 = r1.f119152d
                boolean r0 = r0.mo68567A(r2, r7)
                if (r0 == 0) goto L_0x0156
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                boolean r0 = r0.mo68581q(r15)
                if (r0 == 0) goto L_0x0156
                r3 = 2
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r2 = 2131834359(0x7f1135f7, float:1.9301826E38)
                java.lang.String r4 = r0.getString(r2)
                r5 = 2131755285(0x7f100115, float:1.9141445E38)
                r6 = 0
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r2 = r1.f119152d
                boolean r0 = r0.mo68574H(r2, r7)
                r2 = r25
                r7 = r0
                r2.mo107150j(r3, r4, r5, r6, r7)
            L_0x0156:
                r2 = -1
                android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x01a1 }
                r0.<init>()     // Catch:{ Exception -> 0x01a1 }
                java.lang.String r3 = "WebViewShare_BinderID"
                com.tencent.mm.plugin.webview.ui.tools.g1 r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x01a1 }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r4.mo68388b()     // Catch:{ Exception -> 0x01a1 }
                com.tencent.mm.plugin.webview.core.y r4 = r4.f118513b1     // Catch:{ Exception -> 0x01a1 }
                int r4 = r4.mo67719g()     // Catch:{ Exception -> 0x01a1 }
                r0.putInt(r3, r4)     // Catch:{ Exception -> 0x01a1 }
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x01a1 }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()     // Catch:{ Exception -> 0x01a1 }
                com.tencent.mm.plugin.webview.core.y r3 = r3.f118513b1     // Catch:{ Exception -> 0x01a1 }
                com.tencent.mm.ui.widget.MMWebView r3 = r3.f117553a     // Catch:{ Exception -> 0x01a1 }
                java.lang.String r3 = r3.getUrl()     // Catch:{ Exception -> 0x01a1 }
                r0.putString(r11, r3)     // Catch:{ Exception -> 0x01a1 }
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x01a1 }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()     // Catch:{ Exception -> 0x01a1 }
                com.tencent.mm.plugin.webview.core.y r3 = r3.f118513b1     // Catch:{ Exception -> 0x01a1 }
                com.tencent.mm.plugin.webview.stub.l r3 = r3.f117601y     // Catch:{ Exception -> 0x01a1 }
                r4 = 109(0x6d, float:1.53E-43)
                android.os.Bundle r0 = r3.mo68114V5(r4, r0)     // Catch:{ Exception -> 0x01a1 }
                if (r0 == 0) goto L_0x019f
                java.lang.String r3 = "key_hao_kan_permission"
                int r3 = r0.getInt(r3, r14)     // Catch:{ Exception -> 0x01a1 }
                java.lang.String r4 = "key_hao_kan_recommand"
                int r2 = r0.getInt(r4, r2)     // Catch:{ Exception -> 0x019d }
                goto L_0x01bb
            L_0x019d:
                r0 = move-exception
                goto L_0x01a3
            L_0x019f:
                r3 = -1
                goto L_0x01bb
            L_0x01a1:
                r0 = move-exception
                r3 = -1
            L_0x01a3:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "isSetHaoKan, e = "
                r4.append(r5)
                java.lang.String r0 = r0.getMessage()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            L_0x01bb:
                r4 = 1
                if (r3 != r4) goto L_0x0225
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r3 = 38
                boolean r0 = r0.mo68580p(r3)
                r4 = 2131099941(0x7f060125, float:1.781225E38)
                if (r0 == 0) goto L_0x01f7
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                boolean r0 = r0.mo68581q(r3)
                if (r0 == 0) goto L_0x01f7
                if (r2 != 0) goto L_0x01f7
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r2 = 2131834366(0x7f1135fe, float:1.930184E38)
                java.lang.String r0 = r0.getString(r2)
                r2 = 2131755279(0x7f10010f, float:1.9141433E38)
                com.tencent.mm.plugin.webview.ui.tools.g1 r5 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r5 = r5.mo68388b()
                android.content.res.Resources r5 = r5.getResources()
                int r4 = r5.getColor(r4)
                r8.mo107146h(r3, r0, r2, r4)
                goto L_0x0225
            L_0x01f7:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r3 = 39
                boolean r0 = r0.mo68581q(r3)
                if (r0 == 0) goto L_0x0225
                r5 = 1
                if (r2 != r5) goto L_0x0225
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r2 = 2131834360(0x7f1135f8, float:1.9301828E38)
                java.lang.String r0 = r0.getString(r2)
                r2 = 2131755270(0x7f100106, float:1.9141415E38)
                com.tencent.mm.plugin.webview.ui.tools.g1 r5 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r5 = r5.mo68388b()
                android.content.res.Resources r5 = r5.getResources()
                int r4 = r5.getColor(r4)
                r8.mo107146h(r3, r0, r2, r4)
            L_0x0225:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r2 = 3
                boolean r0 = r0.mo68580p(r2)
                if (r0 == 0) goto L_0x02c4
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                boolean r0 = r0.f118487S
                if (r0 == 0) goto L_0x0288
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1
                java.lang.String r0 = r0.f117597w
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x02c4
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1
                java.lang.String r0 = r0.f117597w
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                int r3 = r3.mo68268Z7()
                di3.d r4 = di3.C86312j.m106911c(r10)
                e00.w r4 = (e00.C31379w) r4
                java.lang.String r0 = r4.mo57932lF(r0, r3)
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.f118565t2
                com.tencent.mm.plugin.webview.ui.tools.g1 r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r4.mo68388b()
                int r4 = r4.mo68268Z7()
                di3.d r5 = di3.C86312j.m106911c(r10)
                e00.w r5 = (e00.C31379w) r5
                java.lang.String r3 = r5.mo57932lF(r3, r4)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r3)
                if (r0 != 0) goto L_0x02c4
            L_0x0288:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r3 = r1.f119152d
                r4 = 323(0x143, float:4.53E-43)
                boolean r0 = r0.mo68567A(r3, r4)
                if (r0 == 0) goto L_0x02c4
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                boolean r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48222k(r0)
                if (r0 == 0) goto L_0x02c4
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                boolean r0 = r0.mo68581q(r2)
                if (r0 == 0) goto L_0x02c4
                r3 = 3
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r2 = 2131834033(0x7f1134b1, float:1.9301165E38)
                java.lang.String r0 = r0.getString(r2)
                r5 = 2131755278(0x7f10010e, float:1.914143E38)
                r6 = 0
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r7 = r1.f119152d
                boolean r7 = r2.mo68574H(r7, r4)
                r2 = r25
                r4 = r0
                r2.mo107150j(r3, r4, r5, r6, r7)
            L_0x02c4:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                java.lang.String r0 = r0.getCurrentURL()
                java.lang.Class<ex0.d> r2 = ex0.C45696d.class
                k40.a r2 = f40.C86709a0.m107533q(r2)
                ex0.d r2 = (ex0.C45696d) r2
                boolean r0 = r2.mo70989eQ(r0)
                java.lang.Class<c02.c> r2 = c02.C92331c.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                c02.c r2 = (c02.C92331c) r2
                boolean r2 = r2.mo58357LH()
                if (r2 == 0) goto L_0x032d
                if (r0 == 0) goto L_0x032d
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                boolean r0 = r0.mo68243L8()
                if (r0 == 0) goto L_0x032d
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.handoff.model.HandOffURL r0 = r0.f118475M1
                if (r0 == 0) goto L_0x032d
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r2 = r1.f119152d
                r3 = 44
                boolean r0 = r0.mo68567A(r2, r3)
                if (r0 == 0) goto L_0x032d
                r0 = 46
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.mo68388b()
                r4 = 2131840048(0x7f114c30, float:1.9313365E38)
                java.lang.String r4 = r2.getString(r4)
                r5 = 2131756265(0x7f1004e9, float:1.9143433E38)
                r6 = 0
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r7 = r1.f119152d
                boolean r7 = r2.mo68574H(r7, r3)
                r2 = r25
                r3 = r0
                r2.mo107150j(r3, r4, r5, r6, r7)
            L_0x032d:
                int r0 = f40.C86718e.m107549h()
                if (r0 == 0) goto L_0x0335
                r10 = 1
                goto L_0x0336
            L_0x0335:
                r10 = 0
            L_0x0336:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r2 = 33
                boolean r0 = r0.mo68580p(r2)
                java.lang.String r7 = ""
                if (r0 == 0) goto L_0x039c
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r3 = r1.f119152d
                r4 = 31
                boolean r0 = r0.mo68567A(r3, r4)
                if (r0 == 0) goto L_0x039c
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                boolean r0 = r0.mo68581q(r2)
                if (r0 == 0) goto L_0x039c
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x0394 }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()     // Catch:{ Exception -> 0x0394 }
                com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1     // Catch:{ Exception -> 0x0394 }
                com.tencent.mm.plugin.webview.stub.l r0 = r0.f117601y     // Catch:{ Exception -> 0x0394 }
                r2 = 78
                android.os.Bundle r0 = r0.mo68114V5(r2, r13)     // Catch:{ Exception -> 0x0394 }
                java.lang.String r2 = "isOpenForFaceBook"
                boolean r0 = r0.getBoolean(r2, r14)     // Catch:{ Exception -> 0x0394 }
                if (r0 == 0) goto L_0x039c
                r3 = 33
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x0394 }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()     // Catch:{ Exception -> 0x0394 }
                r2 = 2131840288(0x7f114d20, float:1.9313852E38)
                java.lang.String r0 = r0.getString(r2)     // Catch:{ Exception -> 0x0394 }
                r5 = 2131755472(0x7f1001d0, float:1.9141824E38)
                r6 = 0
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x0394 }
                com.tencent.mm.protocal.JsapiPermissionWrapper r13 = r1.f119152d     // Catch:{ Exception -> 0x0394 }
                boolean r13 = r2.mo68574H(r13, r4)     // Catch:{ Exception -> 0x0394 }
                r2 = r25
                r4 = r0
                r15 = r7
                r7 = r13
                r2.mo107150j(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0392 }
                goto L_0x039d
            L_0x0392:
                r0 = move-exception
                goto L_0x0396
            L_0x0394:
                r0 = move-exception
                r15 = r7
            L_0x0396:
                java.lang.Object[] r2 = new java.lang.Object[r14]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r15, r2)
                goto L_0x039d
            L_0x039c:
                r15 = r7
            L_0x039d:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r2 = 26
                boolean r0 = r0.mo68580p(r2)
                if (r0 == 0) goto L_0x0444
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r3 = r1.f119152d
                r4 = 278(0x116, float:3.9E-43)
                boolean r0 = r0.mo68567A(r3, r4)
                if (r0 == 0) goto L_0x0444
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                com.tencent.mm.ui.widget.MMWebView r3 = r3.f118523f
                java.lang.String r3 = r3.getUrl()
                java.lang.String r5 = "MicroMsg.ConstantsWebViewStub"
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r6 == 0) goto L_0x03ce
                goto L_0x0418
            L_0x03ce:
                java.lang.String r6 = "com.tencent.weread"
                android.content.pm.PackageInfo r0 = js0.C9512b.m9207a(r0, r6)     // Catch:{ Exception -> 0x0409 }
                java.lang.String r6 = "isWeReadSupportShare(%s)."
                r7 = 1
                java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0409 }
                if (r0 == 0) goto L_0x03dd
                r7 = 1
                goto L_0x03de
            L_0x03dd:
                r7 = 0
            L_0x03de:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0409 }
                r13[r14] = r7     // Catch:{ Exception -> 0x0409 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r13)     // Catch:{ Exception -> 0x0409 }
                if (r0 != 0) goto L_0x03ea
                goto L_0x0418
            L_0x03ea:
                android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0409 }
                java.lang.String r3 = r3.getHost()     // Catch:{ Exception -> 0x0409 }
                r6 = 2131831321(0x7f112a19, float:1.9295664E38)
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r6)     // Catch:{ Exception -> 0x0409 }
                boolean r3 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0409 }
                if (r3 != 0) goto L_0x0400
                goto L_0x0418
            L_0x0400:
                int r0 = r0.versionCode     // Catch:{ Exception -> 0x0409 }
                r3 = 2000812(0x1e87ac, float:2.803735E-39)
                if (r0 <= r3) goto L_0x0418
                r0 = 1
                goto L_0x0419
            L_0x0409:
                r0 = move-exception
                r3 = 1
                java.lang.Object[] r6 = new java.lang.Object[r3]
                java.lang.String r0 = r0.getMessage()
                r6[r14] = r0
                java.lang.String r0 = "exception has occurred in isQzoneSupportShare(), e : %s."
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r6)
            L_0x0418:
                r0 = 0
            L_0x0419:
                if (r0 == 0) goto L_0x0444
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                boolean r0 = r0.mo68581q(r2)
                if (r0 == 0) goto L_0x0444
                r3 = 26
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r2 = 2131840284(0x7f114d1c, float:1.9313843E38)
                java.lang.String r0 = r0.getString(r2)
                r5 = 2131755295(0x7f10011f, float:1.9141465E38)
                r6 = 0
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r7 = r1.f119152d
                boolean r7 = r2.mo68574H(r7, r4)
                r2 = r25
                r4 = r0
                r2.mo107150j(r3, r4, r5, r6, r7)
            L_0x0444:
                r13 = 2131099823(0x7f0600af, float:1.781201E38)
                if (r10 == 0) goto L_0x0540
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r2 = 7
                boolean r0 = r0.mo68580p(r2)
                if (r0 == 0) goto L_0x0540
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r3 = r1.f119152d
                r7 = 45
                boolean r0 = r0.mo68567A(r3, r7)
                if (r0 == 0) goto L_0x0540
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                boolean r0 = r0.mo68581q(r2)
                if (r0 == 0) goto L_0x0540
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r2 = r1.f119152d
                boolean r6 = r0.mo68574H(r2, r7)
                r3 = 7
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r2 = 2131840245(0x7f114cf5, float:1.9313764E38)
                java.lang.String r4 = r0.getString(r2)
                r5 = 2131755269(0x7f100105, float:1.9141413E38)
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                android.content.res.Resources r0 = r0.getResources()
                int r0 = r0.getColor(r13)
                r2 = r25
                r19 = r6
                r6 = r0
                r0 = 45
                r7 = r19
                r2.mo107150j(r3, r4, r5, r6, r7)
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                java.util.HashMap<java.lang.Integer, com.tencent.mm.plugin.webview.ui.tools.g1$u> r2 = r2.f119134g
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                boolean r2 = r2.containsKey(r3)
                if (r2 != 0) goto L_0x0529
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                m93.j r2 = r0.f119133f
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                com.tencent.mm.plugin.webview.stub.l r3 = r3.f118511a1
                if (r3 == 0) goto L_0x04fb
                android.os.Bundle r4 = new android.os.Bundle     // Catch:{ Exception -> 0x04f3 }
                r4.<init>()     // Catch:{ Exception -> 0x04f3 }
                java.lang.String r5 = r0.getCurrentURL()     // Catch:{ Exception -> 0x04f3 }
                r4.putString(r11, r5)     // Catch:{ Exception -> 0x04f3 }
                r5 = 120000(0x1d4c0, float:1.68156E-40)
                android.os.Bundle r3 = r3.mo68114V5(r5, r4)     // Catch:{ Exception -> 0x04f3 }
                java.lang.String r4 = "default_browser_package_name"
                java.lang.String r4 = r3.getString(r4, r15)     // Catch:{ Exception -> 0x04f3 }
                java.lang.String r5 = "k_share_url"
                java.lang.String r3 = r3.getString(r5, r15)     // Catch:{ Exception -> 0x04f3 }
                android.content.pm.ResolveInfo r0 = m93.C46969f.m52278c(r0, r4, r3)     // Catch:{ Exception -> 0x04f3 }
                java.lang.String r3 = "alvinluo getDefaultBrowser defaultBrowserPackageName: %s, defaultBrowser != null: %b"
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x04f3 }
                r5[r14] = r4     // Catch:{ Exception -> 0x04f3 }
                if (r0 == 0) goto L_0x04e7
                r4 = 1
                goto L_0x04e8
            L_0x04e7:
                r4 = 0
            L_0x04e8:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x04f3 }
                r6 = 1
                r5[r6] = r4     // Catch:{ Exception -> 0x04f3 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r5)     // Catch:{ Exception -> 0x04f3 }
                goto L_0x04fc
            L_0x04f3:
                r0 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r14]
                java.lang.String r4 = "alvinluo addDefaultBrowserMenuItem exception"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r4, r3)
            L_0x04fb:
                r0 = 0
            L_0x04fc:
                r2.f126286b = r0
                r2 = 1
                java.lang.Object[] r0 = new java.lang.Object[r2]
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                m93.j r2 = r2.f119133f
                android.content.pm.ResolveInfo r2 = r2.f126286b
                r0[r14] = r2
                java.lang.String r2 = "alvinluo showReaderModeMenu defaultBrowser: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r0)
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                m93.j r0 = r2.f119133f
                android.content.pm.ResolveInfo r0 = r0.f126286b
                if (r0 == 0) goto L_0x0540
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r2.mo68388b()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                m93.j r0 = r0.f119133f
                android.content.pm.ResolveInfo r4 = r0.f126286b
                r7 = 0
                r5 = r25
                r6 = r19
                r2.mo68572F(r3, r4, r5, r6, r7)
                goto L_0x0540
            L_0x0529:
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                java.util.HashMap<java.lang.Integer, com.tencent.mm.plugin.webview.ui.tools.g1$u> r2 = r2.f119134g
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r0 = r2.get(r0)
                com.tencent.mm.plugin.webview.ui.tools.g1$u r0 = (com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.C43997u) r0
                if (r0 == 0) goto L_0x0540
                r2 = r19
                r0.f119201b = r2
                r25.size()
            L_0x0540:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                android.content.Intent r0 = r0.mo68387a()
                java.lang.String r2 = "sns_local_id"
                java.lang.String r0 = r0.getStringExtra(r2)
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                android.content.Intent r2 = r2.mo68387a()
                r3 = -9223372036854775808
                java.lang.String r5 = "msg_id"
                long r2 = r2.getLongExtra(r5, r3)
                com.tencent.mm.plugin.webview.ui.tools.g1 r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x0588 }
                r5 = 23
                boolean r4 = r4.mo68580p(r5)     // Catch:{ Exception -> 0x0588 }
                if (r4 == 0) goto L_0x058e
                com.tencent.mm.plugin.webview.ui.tools.g1 r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x0588 }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r4.mo68388b()     // Catch:{ Exception -> 0x0588 }
                com.tencent.mm.plugin.webview.core.y r4 = r4.f118513b1     // Catch:{ Exception -> 0x0588 }
                com.tencent.mm.plugin.webview.stub.l r4 = r4.f117601y     // Catch:{ Exception -> 0x0588 }
                boolean r0 = r4.mo68138jo(r2, r0)     // Catch:{ Exception -> 0x0588 }
                if (r0 == 0) goto L_0x058e
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x0588 }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()     // Catch:{ Exception -> 0x0588 }
                r2 = 2131824731(0x7f11105b, float:1.9282298E38)
                java.lang.String r0 = r0.getString(r2)     // Catch:{ Exception -> 0x0588 }
                r2 = 2131755287(0x7f100117, float:1.914145E38)
                r8.mo107146h(r5, r0, r2, r14)     // Catch:{ Exception -> 0x0588 }
                goto L_0x058e
            L_0x0588:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r14]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r15, r2)
            L_0x058e:
                r11 = 43
                java.lang.String r15 = "builder add, ex = "
                if (r10 == 0) goto L_0x0614
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r2 = 24
                boolean r0 = r0.mo68580p(r2)
                if (r0 == 0) goto L_0x0614
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r3 = r1.f119152d
                boolean r0 = r0.mo68567A(r3, r11)
                if (r0 == 0) goto L_0x0614
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                boolean r0 = r0.mo68581q(r2)
                if (r0 == 0) goto L_0x0614
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                java.lang.String r3 = "com.tencent.wework"
                boolean r0 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85020f(r0, r3)
                if (r0 != 0) goto L_0x0614
                android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x05df }
                r0.<init>()     // Catch:{ Exception -> 0x05df }
                java.lang.String r3 = "enterprise_action"
                r0.putString(r3, r9)     // Catch:{ Exception -> 0x05df }
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x05df }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()     // Catch:{ Exception -> 0x05df }
                com.tencent.mm.plugin.webview.core.y r3 = r3.f118513b1     // Catch:{ Exception -> 0x05df }
                com.tencent.mm.plugin.webview.stub.l r3 = r3.f117601y     // Catch:{ Exception -> 0x05df }
                r4 = 71
                android.os.Bundle r0 = r3.mo68114V5(r4, r0)     // Catch:{ Exception -> 0x05df }
                if (r0 == 0) goto L_0x05f6
                boolean r0 = r0.getBoolean(r9)     // Catch:{ Exception -> 0x05df }
                goto L_0x05f7
            L_0x05df:
                r0 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r15)
                java.lang.String r0 = r0.getMessage()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
            L_0x05f6:
                r0 = 0
            L_0x05f7:
                if (r0 == 0) goto L_0x0614
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r3 = 2131834374(0x7f113606, float:1.9301857E38)
                java.lang.String r0 = r0.getString(r3)
                r3 = 2131755276(0x7f10010c, float:1.9141427E38)
                com.tencent.mm.plugin.webview.ui.tools.g1 r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r5 = r1.f119152d
                boolean r4 = r4.mo68574H(r5, r11)
                r8.mo107151k(r2, r0, r3, r4)
            L_0x0614:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r2 = 8
                boolean r0 = r0.mo68580p(r2)
                if (r0 == 0) goto L_0x067d
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r3 = r1.f119152d
                r4 = 36
                boolean r0 = r0.mo68567A(r3, r4)
                if (r0 == 0) goto L_0x067d
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                boolean r0 = r0.mo68581q(r2)
                if (r0 == 0) goto L_0x067d
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x0641 }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()     // Catch:{ Exception -> 0x0641 }
                com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1     // Catch:{ Exception -> 0x0641 }
                com.tencent.mm.plugin.webview.stub.l r0 = r0.f117601y     // Catch:{ Exception -> 0x0641 }
                java.lang.String r0 = r0.xa0()     // Catch:{ Exception -> 0x0641 }
                goto L_0x0643
            L_0x0641:
                r0 = 0
            L_0x0643:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x0678
                r3 = 8
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r2 = 2131840247(0x7f114cf7, float:1.9313768E38)
                java.lang.String r0 = r0.getString(r2)
                r5 = 2131756020(0x7f1003f4, float:1.9142936E38)
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.mo68388b()
                android.content.res.Resources r2 = r2.getResources()
                int r6 = r2.getColor(r13)
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r7 = r1.f119152d
                boolean r7 = r2.mo68574H(r7, r4)
                r2 = r25
                r4 = r0
                r2.mo107150j(r3, r4, r5, r6, r7)
                goto L_0x067d
            L_0x0678:
                java.lang.String r0 = "get mail session key is null or nil, should not show send mail menu"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            L_0x067d:
                if (r10 == 0) goto L_0x06ca
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r2 = 20
                boolean r0 = r0.mo68580p(r2)
                if (r0 == 0) goto L_0x06ca
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r3 = r1.f119152d
                r4 = 91
                boolean r0 = r0.mo68567A(r3, r4)
                if (r0 == 0) goto L_0x06ca
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                boolean r0 = com.tencent.p014mm.plugin.webview.stub.C6100a.m5974a(r0)
                if (r0 == 0) goto L_0x06ca
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                boolean r0 = r0.mo68581q(r2)
                if (r0 == 0) goto L_0x06ca
                r3 = 20
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r2 = 2131840289(0x7f114d21, float:1.9313854E38)
                java.lang.String r0 = r0.getString(r2)
                r5 = 2131755289(0x7f100119, float:1.9141453E38)
                r6 = 0
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r7 = r1.f119152d
                boolean r7 = r2.mo68574H(r7, r4)
                r2 = r25
                r4 = r0
                r2.mo107150j(r3, r4, r5, r6, r7)
            L_0x06ca:
                if (r10 == 0) goto L_0x0717
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r2 = 22
                boolean r0 = r0.mo68580p(r2)
                if (r0 == 0) goto L_0x0717
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r3 = r1.f119152d
                r4 = 133(0x85, float:1.86E-43)
                boolean r0 = r0.mo68567A(r3, r4)
                if (r0 == 0) goto L_0x0717
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                boolean r0 = com.tencent.p014mm.plugin.webview.stub.C6100a.m5974a(r0)
                if (r0 == 0) goto L_0x0717
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                boolean r0 = r0.mo68581q(r2)
                if (r0 == 0) goto L_0x0717
                r3 = 22
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r2 = 2131840290(0x7f114d22, float:1.9313856E38)
                java.lang.String r0 = r0.getString(r2)
                r5 = 2131755290(0x7f10011a, float:1.9141455E38)
                r6 = 0
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r7 = r1.f119152d
                boolean r7 = r2.mo68574H(r7, r4)
                r2 = r25
                r4 = r0
                r2.mo107150j(r3, r4, r5, r6, r7)
            L_0x0717:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x0769 }
                boolean r0 = r0.mo68580p(r14)     // Catch:{ Exception -> 0x0769 }
                if (r0 == 0) goto L_0x0780
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x0769 }
                com.tencent.mm.protocal.JsapiPermissionWrapper r2 = r1.f119152d     // Catch:{ Exception -> 0x0769 }
                boolean r0 = r0.mo68567A(r2, r11)     // Catch:{ Exception -> 0x0769 }
                if (r0 == 0) goto L_0x0780
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x0769 }
                boolean r0 = r0.mo68581q(r14)     // Catch:{ Exception -> 0x0769 }
                if (r0 == 0) goto L_0x0780
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x0769 }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()     // Catch:{ Exception -> 0x0769 }
                com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1     // Catch:{ Exception -> 0x0769 }
                com.tencent.mm.plugin.webview.stub.l r0 = r0.f117601y     // Catch:{ Exception -> 0x0769 }
                boolean r0 = r0.mo68106RN()     // Catch:{ Exception -> 0x0769 }
                if (r0 == 0) goto L_0x0780
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x0769 }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()     // Catch:{ Exception -> 0x0769 }
                com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1     // Catch:{ Exception -> 0x0769 }
                com.tencent.mm.plugin.webview.stub.l r0 = r0.f117601y     // Catch:{ Exception -> 0x0769 }
                java.util.List r0 = r0.mo68148uU()     // Catch:{ Exception -> 0x0769 }
                java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x0769 }
            L_0x0753:
                boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x0769 }
                if (r3 == 0) goto L_0x0763
                java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x0769 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0769 }
                r8.add((java.lang.CharSequence) r3)     // Catch:{ Exception -> 0x0769 }
                goto L_0x0753
            L_0x0763:
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x0769 }
                r2.mo68585u(r0)     // Catch:{ Exception -> 0x0769 }
                goto L_0x0780
            L_0x0769:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r15)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
            L_0x0780:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r2 = 27
                boolean r0 = r0.mo68580p(r2)
                if (r0 == 0) goto L_0x07b5
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton r0 = r0.f118583z
                if (r0 == 0) goto L_0x07b5
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton r0 = r0.f118583z
                int r0 = r0.getVisibility()
                if (r0 != 0) goto L_0x07b5
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r3 = 2131834365(0x7f1135fd, float:1.9301838E38)
                java.lang.String r0 = r0.getString(r3)
                r3 = 2131755277(0x7f10010d, float:1.9141429E38)
                r8.mo107144g(r2, r0, r3)
            L_0x07b5:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.mo68388b()
                com.tencent.mm.plugin.webview.core.y r2 = r2.f118513b1
                java.lang.String r2 = r2.f117597w
                java.lang.String r0 = r0.mo6898S(r2)
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                android.content.Intent r2 = r2.mo68387a()
                java.lang.String r3 = "shortcut_user_name"
                java.lang.String r2 = r2.getStringExtra(r3)
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                boolean r3 = r3.f118499W
                if (r3 != 0) goto L_0x0824
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x0824
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r0 != 0) goto L_0x0824
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r2 = r1.f119152d
                r3 = 255(0xff, float:3.57E-43)
                boolean r0 = r0.mo68567A(r2, r3)
                if (r0 == 0) goto L_0x0824
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r2 = 29
                boolean r0 = r0.mo68581q(r2)
                if (r0 == 0) goto L_0x0824
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                boolean r0 = r0.mo68580p(r2)
                if (r0 == 0) goto L_0x0824
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r4 = 2131834356(0x7f1135f4, float:1.930182E38)
                java.lang.String r0 = r0.getString(r4)
                r4 = 2131757177(0x7f100879, float:1.9145282E38)
                com.tencent.mm.plugin.webview.ui.tools.g1 r5 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.protocal.JsapiPermissionWrapper r6 = r1.f119152d
                boolean r3 = r5.mo68574H(r6, r3)
                r8.mo107151k(r2, r0, r4, r3)
            L_0x0824:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                int r2 = r1.f119153e
                com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48223l(r0, r2, r8)
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                qo3.n r0 = r0.f119144q
                r0.mo107564i()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.C43978a.onCreateMMMenu(nj3.e0):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$b */
    public class C43979b implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f119155d;

        /* renamed from: e */
        public final /* synthetic */ JsapiPermissionWrapper f119156e;

        /* renamed from: f */
        public final /* synthetic */ WebViewUIStyleHelper.C43828c f119157f;

        /* renamed from: g */
        public final /* synthetic */ long f119158g;

        /* renamed from: h */
        public final /* synthetic */ int f119159h;

        public C43979b(ArrayList arrayList, JsapiPermissionWrapper jsapiPermissionWrapper, WebViewUIStyleHelper.C43828c cVar, long j, int i) {
            this.f119155d = arrayList;
            this.f119156e = jsapiPermissionWrapper;
            this.f119157f = cVar;
            this.f119158g = j;
            this.f119159h = i;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            C33246y yVar = C33246y.Expose;
            if (!C43977g1.this.mo68389c()) {
                C115669n.INSTANCE.idkeyStat(480, 0, 1, false);
                e0Var.clear();
                if (!C43977g1.this.f119147t.booleanValue()) {
                    if (!this.f119155d.isEmpty()) {
                        for (int i = 0; i < this.f119155d.size(); i++) {
                            try {
                                String str = (String) this.f119155d.get(i);
                                Log.m105924i("MicroMsg.WebViewMenuHelper", "menuItem:" + str);
                                JSONObject jSONObject = new JSONObject(str);
                                String obj = jSONObject.opt(FFmpegMetadataRetriever.METADATA_KEY_TITLE).toString();
                                byte[] decode = Base64.decode(jSONObject.opt("iconData").toString(), 0);
                                e0Var.mo107152l(1000, obj, new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length)));
                            } catch (Exception e) {
                                Log.printErrStackTrace("MicroMsg.WebViewMenuHelper", e, "", new Object[0]);
                            }
                        }
                    }
                    if (C43977g1.this.mo68388b().f118483Q1 != null && C43977g1.this.mo68388b().f118483Q1.mo67893A() && C43977g1.this.mo68580p(35) && C43977g1.this.mo68581q(35)) {
                        e0Var.mo107144g(35, C43977g1.this.mo68388b().getString(C0966R.string.hrr), C0966R.raw.icons_outlined_multitask);
                    }
                    int i2 = C43977g1.this.mo68388b().f118512a2;
                    if (i2 == 1) {
                        e0Var.mo107144g(40, C43977g1.this.mo68388b().getString(C0966R.string.lhi), C0966R.raw.icon_outlined_talk);
                    } else if (i2 == 2) {
                        e0Var.mo107144g(41, C43977g1.this.mo68388b().getString(C0966R.string.lhg), C0966R.raw.icon_outlined_stoptalking);
                    } else if (i2 == 3) {
                        e0Var.mo107144g(42, C43977g1.this.mo68388b().getString(C0966R.string.lhh), C0966R.raw.icon_outlined_talk);
                    }
                    try {
                        LinkedList<C47506e.C47507a> e8 = C43977g1.this.mo68388b().mo68277e8();
                        if (e8 != null && !C43977g1.this.mo68570D()) {
                            int i3 = 0;
                            while (i3 < e8.size() && i3 < 8) {
                                C47506e.C47507a aVar = e8.get(i3);
                                C76875f0 f0Var = null;
                                if (FirebaseAnalytics.C113379b.INDEX.equals(Util.nullAsNil(aVar.f127476a))) {
                                    f0Var = (C76875f0) e0Var.mo107144g(15, C43977g1.this.mo68388b().getString(C0966R.string.lfs), C0966R.raw.bottomsheet_icon_jd_index);
                                } else if ("categories".equals(Util.nullAsNil(aVar.f127476a))) {
                                    f0Var = (C76875f0) e0Var.mo107144g(16, C43977g1.this.mo68388b().getString(C0966R.string.lfr), C0966R.raw.bottomsheet_icon_jd_collect_list);
                                } else if ("cart".equals(Util.nullAsNil(aVar.f127476a))) {
                                    f0Var = (C76875f0) e0Var.mo107144g(17, C43977g1.this.mo68388b().getString(C0966R.string.lfq), C0966R.raw.bottomsheet_icon_jd_cart);
                                } else if (Scopes.PROFILE.equals(Util.nullAsNil(aVar.f127476a))) {
                                    f0Var = (C76875f0) e0Var.mo107144g(18, C43977g1.this.mo68388b().getString(C0966R.string.lfu), C0966R.raw.bottomsheet_icon_profile);
                                } else if ("member".equals(Util.nullAsNil(aVar.f127476a))) {
                                    f0Var = (C76875f0) e0Var.mo107144g(19, C43977g1.this.mo68388b().getString(C0966R.string.lft), C0966R.raw.bottomsheet_icon_jd_member);
                                }
                                if (f0Var != null) {
                                    f0Var.f224730y = aVar.f127477b;
                                }
                                i3++;
                            }
                        }
                    } catch (Exception e2) {
                        Log.m105920e("MicroMsg.WebViewMenuHelper", "exception in add jd menu, " + e2.getMessage());
                    }
                    String stringExtra = C43977g1.this.mo68387a().getStringExtra("srcUsername");
                    if (!Util.isNullOrNil(stringExtra)) {
                        try {
                            z = C43977g1.this.mo68388b().f118513b1.f117601y.mo68095Gm(stringExtra);
                        } catch (Exception e3) {
                            Log.m105920e("MicroMsg.WebViewMenuHelper", "sharebtn click fail isBizContact, ex = " + e3.getMessage());
                            z = false;
                        }
                        if (!z) {
                            try {
                                C43977g1.this.mo68388b().f118513b1.f117601y.Th0(stringExtra);
                            } catch (Exception e4) {
                                Log.m105920e("MicroMsg.WebViewMenuHelper", "sharebtn click fail triggerGetContact, ex = " + e4.getMessage());
                            }
                        } else {
                            try {
                                z2 = C43977g1.this.mo68388b().f118513b1.f117601y.Ie0(stringExtra);
                            } catch (Exception e5) {
                                Log.m105920e("MicroMsg.WebViewMenuHelper", "sharebtn click fail, ex = " + e5.getMessage());
                                z2 = false;
                            }
                            if (z2) {
                                z3 = C43977g1.this.mo68567A(this.f119156e, 19);
                                z4 = C43977g1.this.mo68574H(this.f119156e, 19);
                            } else {
                                z3 = C43977g1.this.mo68567A(this.f119156e, 20);
                                z4 = C43977g1.this.mo68574H(this.f119156e, 20);
                            }
                            boolean x1 = C43977g1.this.mo68388b().f118513b1.mo67826x1();
                            if (C43977g1.this.mo68580p(5) && z3 && C43977g1.this.mo68581q(5)) {
                                if (x1) {
                                    e0Var.mo107151k(5, C43977g1.this.mo68388b().getString(C0966R.string.llq), C0966R.raw.icons_outlined_official_accounts, z4);
                                } else {
                                    WebViewUIStyleHelper.C43828c cVar = this.f119157f;
                                    if (cVar == null || !cVar.f118696f) {
                                        e0Var.mo107151k(5, C43977g1.this.mo68388b().getString(C0966R.string.llp), C0966R.raw.icons_outlined_official_accounts, z4);
                                    }
                                }
                            }
                        }
                    }
                    if (C43977g1.this.mo68581q(10)) {
                        e0Var.mo107144g(10, C43977g1.this.mo68388b().getString(C0966R.string.anx), C0966R.raw.icons_outlined_report_problem);
                    }
                    if (C43977g1.this.mo68580p(6) && C43977g1.this.mo68567A(this.f119156e, 44) && C43977g1.this.mo68581q(6)) {
                        e0Var.mo107151k(6, C43977g1.this.mo68388b().getString(C0966R.string.lle), C0966R.raw.icons_outlined_link, C43977g1.this.mo68574H(this.f119156e, 44));
                    }
                    if (C43977g1.this.mo68580p(28) && C43977g1.this.mo68581q(28)) {
                        e0Var.mo107144g(28, C43977g1.this.mo68388b().getString(C0966R.string.leq), C0966R.raw.icons_outlined_refresh);
                    }
                    if ((this.f119158g & 1) == 0 && C43977g1.this.mo68580p(31) && C43977g1.this.mo68581q(31)) {
                        e0Var.mo107144g(31, C43977g1.this.mo68388b().getString(C0966R.string.lmh), C0966R.raw.actionbar_icon_dark_search);
                    }
                    if (this.f119156e.f121048d != null && C43977g1.this.mo68388b().f118487S && !Util.isNullOrNil(C43977g1.this.mo68388b().f118513b1.f117597w) && !Util.isNullOrNil(C43977g1.this.mo68388b().f118565t2) && C43977g1.this.mo68388b().f118513b1.f117597w.startsWith(C43977g1.this.mo68388b().f118565t2) && C43977g1.this.mo68387a().getBooleanExtra("key_detail_can_delete", true) && C43977g1.m48222k(C43977g1.this) && !C43977g1.this.mo68570D()) {
                        if (C43977g1.this.mo68580p(12) && C43977g1.this.mo68581q(12)) {
                            e0Var.mo107144g(12, C43977g1.this.mo68388b().getString(C0966R.string.cmy), C0966R.raw.bottomsheet_icon_addtag);
                        }
                        if (C43977g1.this.mo68580p(9)) {
                            e0Var.mo107144g(9, C43977g1.this.mo68388b().getString(C0966R.string.f7944x1), C0966R.raw.bottomsheet_icon_del);
                        }
                    }
                    if (C43977g1.this.mo68580p(37) && C43977g1.this.mo68581q(37)) {
                        if (C43977g1.this.mo68388b().f118477N1.f118669f.f117508h.getValue() == C46176a0.DoTrans) {
                            e0Var.mo107144g(37, C43977g1.this.mo68388b().getString(C0966R.string.lgn), C0966R.raw.icons_outlined_stoptranslate);
                            C43977g1.this.mo68388b().f118477N1.f118669f.mo67659e(yVar, C46205z.MenuRevertButton);
                        } else {
                            e0Var.mo107144g(37, C43977g1.this.mo68388b().getString(C0966R.string.lgj), C0966R.raw.icons_outlined_translate);
                            C43977g1.this.mo68388b().f118477N1.f118669f.mo67659e(yVar, C46205z.MenuTransButton);
                        }
                    }
                    if ((this.f119158g & 2) == 0 && C43977g1.this.mo68580p(11) && C43977g1.this.mo68567A(this.f119156e, 18) && C43977g1.this.mo68581q(11)) {
                        e0Var.mo107151k(11, C43977g1.this.mo68388b().getString(C0966R.string.hrd), C0966R.raw.icons_outlined_font, C43977g1.this.mo68574H(this.f119156e, 18));
                    }
                    if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_debug, 0) == 1) {
                        e0Var.mo107151k(99, C43977g1.this.mo68388b().getString(C36979g1.m41111a() ? C0966R.string.lgd : C0966R.string.lge), C0966R.raw.webview_menu_enable_debug, false);
                    }
                    C43977g1.m48223l(C43977g1.this, this.f119159h, e0Var);
                    C43977g1.this.f119144q.mo107564i();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$c */
    public class C43980c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WebViewUIStyleHelper.C43828c f119161d;

        public C43980c(WebViewUIStyleHelper.C43828c cVar) {
            this.f119161d = cVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C43977g1.this.mo68577K("Contact_Scene", C88191m.CTRL_INDEX);
            C43704h2.C43708d c = C43977g1.this.mo68388b().f118459E1.mo68007c();
            c.mo68018b(C43977g1.this.mo68388b().mo6901n0(), 38, 1);
            c.mo68017a();
            C43977g1.this.mo68388b().mo68316v9(this.f119161d.f118691a);
            C77407n nVar = C43977g1.this.f119144q;
            if (nVar != null) {
                nVar.mo107572p();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$d */
    public class C43981d extends C107029o {

        /* renamed from: j */
        public final /* synthetic */ String f119163j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43981d(C43977g1 g1Var, NeatTextView neatTextView, View.OnTouchListener onTouchListener, String str) {
            super(neatTextView, onTouchListener);
            this.f119163j = str;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean onTouch = super.onTouch(view, motionEvent);
            if (onTouch) {
                Log.m105924i("MMNeatTouchListener", "terry h5 apply click");
                C115669n.INSTANCE.mo160131h(16337, this.f119163j, 1, 1);
            }
            return onTouch;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$e */
    public class C43982e implements Runnable {
        public C43982e() {
        }

        public void run() {
            if (C43977g1.this.mo68388b().f118508Z != null) {
                C43977g1.this.mo68388b().f118508Z.mo73254q0(false, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$f */
    public class C43983f implements C46971i.C46972a {

        /* renamed from: a */
        public final /* synthetic */ C76874e0 f119165a;

        /* renamed from: b */
        public final /* synthetic */ String f119166b;

        /* renamed from: c */
        public final /* synthetic */ boolean f119167c;

        /* renamed from: d */
        public final /* synthetic */ boolean f119168d;

        public C43983f(C76874e0 e0Var, String str, boolean z, boolean z2) {
            this.f119165a = e0Var;
            this.f119166b = str;
            this.f119167c = z;
            this.f119168d = z2;
        }

        /* renamed from: a */
        public void mo68403a(Drawable drawable) {
            C77407n nVar;
            C43977g1 g1Var = C43977g1.this;
            g1Var.f119133f.f126287c = drawable;
            if (drawable != null && (nVar = g1Var.f119144q) != null && nVar.mo107563h()) {
                C43977g1.this.mo68578n(this.f119165a, this.f119166b, drawable, (Bitmap) null, this.f119167c, this.f119168d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$g */
    public class C43984g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C76874e0 f119170d;

        /* renamed from: e */
        public final /* synthetic */ Drawable f119171e;

        /* renamed from: f */
        public final /* synthetic */ String f119172f;

        /* renamed from: g */
        public final /* synthetic */ boolean f119173g;

        public C43984g(C76874e0 e0Var, Drawable drawable, String str, boolean z) {
            this.f119170d = e0Var;
            this.f119171e = drawable;
            this.f119172f = str;
            this.f119173g = z;
        }

        public void run() {
            C77407n nVar = C43977g1.this.f119144q;
            if (nVar != null && nVar.mo107563h()) {
                int max = Math.max(0, this.f119170d.mo107175u(7));
                if (C43977g1.this.mo68582r(this.f119170d, max, this.f119171e, this.f119172f, this.f119173g)) {
                    C77407n nVar2 = C43977g1.this.f119144q;
                    int size = nVar2.f225729G.size();
                    C77407n.C77423u uVar = nVar2.f225754Y;
                    if (uVar != null && max >= 0 && max < size) {
                        uVar.notifyItemInserted(max);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$h */
    public class C43985h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f119175d;

        public C43985h(boolean z) {
            this.f119175d = z;
        }

        public void run() {
            C43977g1.this.mo68571E(this.f119175d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$i */
    public class C43986i implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Intent f119177d;

        /* renamed from: e */
        public final /* synthetic */ boolean f119178e;

        /* renamed from: f */
        public final /* synthetic */ String f119179f;

        /* renamed from: g */
        public final /* synthetic */ String f119180g;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$i$a */
        public class C43987a implements C14088e.C14090b {
            public C43987a() {
            }

            /* renamed from: a */
            public void mo1717a() {
                Log.m105924i("MicroMsg.WebViewMenuHelper", "OpenLiteApp success");
            }

            /* renamed from: b */
            public void mo1718b() {
                Log.m105924i("MicroMsg.WebViewMenuHelper", "OpenLiteApp fail");
                C88144b.m109791i(C43977g1.this.mo68388b(), "webview", ".ui.tools.WebViewUI", C43986i.this.f119177d, (Bundle) null);
            }
        }

        public C43986i(Intent intent, boolean z, String str, String str2) {
            this.f119177d = intent;
            this.f119178e = z;
            this.f119179f = str;
            this.f119180g = str2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Class cls = C14088e.class;
            try {
                C86009m1 c = C86009m1.m106378c(C43977g1.this.mo68388b().getDir("expose", 0));
                c.mo119987x();
                MMWebView mMWebView = C43977g1.this.mo68388b().f118523f;
                Bitmap takeScreenShot = (mMWebView == null || !mMWebView.isXWalkKernel()) ? ScreenShotUtil.takeScreenShot(C43977g1.this.mo68388b()) : mMWebView.captureBitmap();
                String str = c.mo119971i() + "/screenshot.jpg";
                if (takeScreenShot != null) {
                    BitmapUtil.saveBitmapToImage(takeScreenShot, 75, Bitmap.CompressFormat.JPEG, str, true);
                    this.f119177d.putExtra("k_webview_img", str);
                }
                if (!this.f119178e) {
                    C88144b.m109791i(C43977g1.this.mo68388b(), "webview", ".ui.tools.WebViewUI", this.f119177d, (Bundle) null);
                } else if (((C14088e) C86312j.m106911c(cls)).mo13530uu("wxalited4df4810a40b1d9ddc0cbea44d263fd9")) {
                    Bundle bundle = new Bundle();
                    bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
                    bundle.putString(SearchIntents.EXTRA_QUERY, "{\"scene\":34}");
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("k_expose_url", this.f119179f);
                    bundle2.putString("k_expose_raw_url", C43977g1.this.mo68388b().mo6901n0());
                    bundle2.putInt("k_expose_web_scene", C43977g1.this.mo68388b().mo68291k8(this.f119180g));
                    bundle2.putString("k_webview_img", str);
                    bundle.putBundle("extraData", bundle2);
                    Log.m105924i("MicroMsg.WebViewMenuHelper", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
                    ((C14088e) C86312j.m106911c(cls)).mo13510OP(C43977g1.this.mo68388b(), bundle, true, true, new C43987a());
                } else {
                    C88144b.m109791i(C43977g1.this.mo68388b(), "webview", ".ui.tools.WebViewUI", this.f119177d, (Bundle) null);
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.WebViewMenuHelper", "[oneliang]save screen shot to file error, ex = " + e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$j */
    public class C43988j implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f119183d;

        /* renamed from: e */
        public final /* synthetic */ String f119184e;

        /* renamed from: f */
        public final /* synthetic */ String f119185f;

        /* renamed from: g */
        public final /* synthetic */ Intent f119186g;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$j$a */
        public class C43989a implements C14088e.C14090b {
            public C43989a() {
            }

            /* renamed from: a */
            public void mo1717a() {
                Log.m105924i("MicroMsg.WebViewMenuHelper", "OpenLiteApp success");
            }

            /* renamed from: b */
            public void mo1718b() {
                Log.m105924i("MicroMsg.WebViewMenuHelper", "OpenLiteApp fail");
                C88144b.m109791i(C43977g1.this.mo68388b(), "webview", ".ui.tools.WebViewUI", C43988j.this.f119186g, (Bundle) null);
            }
        }

        public C43988j(boolean z, String str, String str2, Intent intent) {
            this.f119183d = z;
            this.f119184e = str;
            this.f119185f = str2;
            this.f119186g = intent;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Class cls = C14088e.class;
            if (!this.f119183d) {
                C88144b.m109791i(C43977g1.this.mo68388b(), "webview", ".ui.tools.WebViewUI", this.f119186g, (Bundle) null);
            } else if (((C14088e) C86312j.m106911c(cls)).mo13530uu("wxalited4df4810a40b1d9ddc0cbea44d263fd9")) {
                Bundle bundle = new Bundle();
                bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
                bundle.putString(SearchIntents.EXTRA_QUERY, "{\"scene\":34}");
                Bundle bundle2 = new Bundle();
                bundle2.putString("k_expose_url", this.f119184e);
                bundle2.putString("k_expose_raw_url", C43977g1.this.mo68388b().mo6901n0());
                bundle2.putInt("k_expose_web_scene", C43977g1.this.mo68388b().mo68291k8(this.f119185f));
                bundle.putBundle("extraData", bundle2);
                Log.m105924i("MicroMsg.WebViewMenuHelper", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
                ((C14088e) C86312j.m106911c(cls)).mo13510OP(C43977g1.this.mo68388b(), bundle, true, true, new C43989a());
            } else {
                C88144b.m109791i(C43977g1.this.mo68388b(), "webview", ".ui.tools.WebViewUI", this.f119186g, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$l */
    public class C43990l implements C77407n.C12924o {
        public C43990l() {
        }

        /* renamed from: a */
        public void mo2362a() {
            C43977g1.this.f119135h.f167570b = 1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$m */
    public class C43991m implements View.OnAttachStateChangeListener {
        public C43991m() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            C43977g1.this.f119135h.f167573e = System.currentTimeMillis();
            C43977g1 g1Var = C43977g1.this;
            g1Var.f119135h.mo83444a(g1Var.mo68388b().getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$p */
    public class C43992p implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f119191d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$p$a */
        public class C6174a implements Animation.AnimationListener {
            public C6174a() {
            }

            public void onAnimationEnd(Animation animation) {
                View view = C43977g1.this.mo68388b().f118569v;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper$7$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper$7$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        public C43992p(ArrayList arrayList) {
            this.f119191d = arrayList;
        }

        /* JADX WARNING: Removed duplicated region for block: B:162:0x0b12  */
        /* JADX WARNING: Removed duplicated region for block: B:163:0x0b19  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMMMenuItemSelected(android.view.MenuItem r26, int r27) {
            /*
                r25 = this;
                r1 = r25
                r0 = r26
                java.lang.String r2 = "key_biz_type"
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                boolean r3 = r3.mo68389c()
                if (r3 == 0) goto L_0x000f
                return
            L_0x000f:
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r3.getClass()
                int r3 = r26.getItemId()
                r4 = 10000(0x2710, float:1.4013E-41)
                r5 = 1
                r6 = 0
                if (r3 < r4) goto L_0x0020
                r3 = 1
                goto L_0x0021
            L_0x0020:
                r3 = 0
            L_0x0021:
                java.lang.String r4 = ")"
                java.lang.String r7 = "javascript:WeixinJSBridge._handleMessageFromWeixin("
                java.lang.String r8 = "MicroMsg.JsApiHandler"
                r9 = 0
                if (r3 == 0) goto L_0x007e
                android.view.ContextMenu$ContextMenuInfo r0 = r26.getMenuInfo()
                pj.e$b r0 = (p645pj.C47506e.C47508b) r0
                if (r0 == 0) goto L_0x007d
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.mo68388b()
                t83.l r2 = r2.f118508Z
                boolean r3 = r2.f130003h
                if (r3 != 0) goto L_0x0044
                java.lang.String r0 = "not ready"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
                goto L_0x007d
            L_0x0044:
                java.lang.String r3 = "onCustomMenuClick"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                java.lang.String r5 = r0.f127480b
                java.lang.String r6 = "key"
                r3.put(r6, r5)
                java.lang.String r0 = r0.f127479a
                java.lang.String r5 = "title"
                r3.put(r5, r0)
                boolean r0 = r2.f130011p
                java.lang.String r5 = r2.f130012q
                java.lang.String r6 = "menu:custom"
                java.lang.String r0 = t83.C13851h1.C13852a.m13143c(r6, r3, r0, r5)
                com.tencent.mm.ui.widget.MMWebView r2 = r2.f129996a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r7)
                r3.append(r0)
                r3.append(r4)
                java.lang.String r0 = r3.toString()
                r2.evaluateJavascript(r0, r9)
            L_0x007d:
                return
            L_0x007e:
                int r3 = r26.getItemId()
                r10 = 4
                r11 = 2
                if (r3 != r5) goto L_0x008d
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                ea3.w r3 = r3.f119135h
                r3.f167570b = r11
                goto L_0x0093
            L_0x008d:
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                ea3.w r3 = r3.f119135h
                r3.f167570b = r10
            L_0x0093:
                java.lang.Object[] r3 = new java.lang.Object[r5]
                int r12 = r26.getItemId()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r3[r6] = r12
                java.lang.String r12 = "MicroMsg.WebViewMenuHelper"
                java.lang.String r13 = "onMMMenuItemSelected %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r3)
                int r3 = r26.getItemId()
                if (r3 == r5) goto L_0x0c53
                if (r3 == r11) goto L_0x0c1a
                r13 = 3
                if (r3 == r13) goto L_0x0bdb
                r14 = 31
                java.lang.String r15 = ""
                if (r3 == r14) goto L_0x0b57
                r14 = 99
                if (r3 == r14) goto L_0x0b20
                r17 = 10
                r18 = 6
                r19 = 7
                r22 = 12
                r23 = 9
                r24 = 13
                r10 = 11
                r14 = 8
                switch(r3) {
                    case 5: goto L_0x03e5;
                    case 6: goto L_0x03b8;
                    case 7: goto L_0x032d;
                    case 8: goto L_0x02b9;
                    case 9: goto L_0x0265;
                    case 10: goto L_0x0259;
                    case 11: goto L_0x0157;
                    case 12: goto L_0x00ec;
                    default: goto L_0x00ce;
                }
            L_0x00ce:
                java.lang.String r10 = "WebViewShare_reslut"
                switch(r3) {
                    case 15: goto L_0x05b2;
                    case 16: goto L_0x057d;
                    case 17: goto L_0x0548;
                    case 18: goto L_0x0513;
                    case 19: goto L_0x04de;
                    case 20: goto L_0x044e;
                    default: goto L_0x00d3;
                }
            L_0x00d3:
                r14 = 16
                switch(r3) {
                    case 22: goto L_0x06e1;
                    case 23: goto L_0x06a1;
                    case 24: goto L_0x05e7;
                    default: goto L_0x00d8;
                }
            L_0x00d8:
                switch(r3) {
                    case 26: goto L_0x0822;
                    case 27: goto L_0x07dd;
                    case 28: goto L_0x07a6;
                    case 29: goto L_0x0771;
                    default: goto L_0x00db;
                }
            L_0x00db:
                switch(r3) {
                    case 33: goto L_0x0971;
                    case 34: goto L_0x096a;
                    case 35: goto L_0x0918;
                    case 36: goto L_0x08e8;
                    case 37: goto L_0x08e1;
                    case 38: goto L_0x08a6;
                    case 39: goto L_0x086b;
                    case 40: goto L_0x0857;
                    case 41: goto L_0x0857;
                    case 42: goto L_0x0857;
                    default: goto L_0x00de;
                }
            L_0x00de:
                switch(r3) {
                    case 44: goto L_0x0a60;
                    case 45: goto L_0x09bd;
                    case 46: goto L_0x09a6;
                    default: goto L_0x00e1;
                }
            L_0x00e1:
                java.util.ArrayList r3 = r1.f119191d
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L_0x0a92
                r3 = 0
                goto L_0x0a6f
            L_0x00ec:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r2 = "key_fav_scene"
                r0.putExtra(r2, r11)
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                android.content.Intent r2 = r2.mo68387a()
                r3 = -1
                java.lang.String r5 = "fav_local_id"
                long r2 = r2.getLongExtra(r5, r3)
                java.lang.String r4 = "key_fav_item_id"
                r0.putExtra(r4, r2)
                java.lang.Class<xq.e> r2 = p272xq.C102712e.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                xq.e r2 = (p272xq.C102712e) r2
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r4 = ".ui.FavTagEditUI"
                r2.F20(r3, r4, r0)
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                java.lang.String r2 = "mm_edit_fav_count"
                r0.mo68014l(r2)
                goto L_0x0c61
            L_0x0157:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                android.view.View r0 = r0.f118569v
                int r0 = r0.getVisibility()
                if (r0 != r14) goto L_0x01f1
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r2 = 2130772084(0x7f010074, float:1.7147276E38)
                android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r0, r2)
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.mo68388b()
                android.view.View r2 = r2.f118569v
                r2.startAnimation(r0)
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                android.view.View r0 = r0.f118569v
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
                r2.mo10233c(r3)
                java.lang.Object[] r8 = r2.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper$7"
                java.lang.String r10 = "onMMMenuItemSelected"
                java.lang.String r11 = "(Landroid/view/MenuItem;I)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r0
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.Object r2 = r2.mo10231a(r6)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r0.setVisibility(r2)
                java.lang.String r8 = "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper$7"
                java.lang.String r9 = "onMMMenuItemSelected"
                java.lang.String r10 = "(Landroid/view/MenuItem;I)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                goto L_0x0c61
            L_0x01f1:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r2 = 2130772085(0x7f010075, float:1.7147278E38)
                android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r0, r2)
                com.tencent.mm.plugin.webview.ui.tools.g1$p$a r2 = new com.tencent.mm.plugin.webview.ui.tools.g1$p$a
                r2.<init>()
                r0.setAnimationListener(r2)
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.mo68388b()
                android.view.View r2 = r2.f118569v
                r2.startAnimation(r0)
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                android.view.View r7 = r0.f118569v
                k20.a r0 = new k20.a
                r0.<init>()
                java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
                r0.mo10233c(r2)
                java.lang.Object[] r16 = r0.mo10232b()
                java.lang.String r17 = "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper$7"
                java.lang.String r18 = "onMMMenuItemSelected"
                java.lang.String r19 = "(Landroid/view/MenuItem;I)V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                r15 = r7
                j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
                java.lang.Object r0 = r0.mo10231a(r6)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r7.setVisibility(r0)
                java.lang.String r8 = "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper$7"
                java.lang.String r9 = "onMMMenuItemSelected"
                java.lang.String r10 = "(Landroid/view/MenuItem;I)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                goto L_0x0c61
            L_0x0259:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48224m(r0, r10)
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r0.mo68583s(r9)
                goto L_0x0c61
            L_0x0265:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r0.mo68388b()
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r0.mo68388b()
                r4 = 2131821452(0x7f11038c, float:1.9275648E38)
                java.lang.String r3 = r3.getString(r4)
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r0.mo68388b()
                r5 = 2131821450(0x7f11038a, float:1.9275644E38)
                java.lang.String r6 = r4.getString(r5)
                com.tencent.mm.plugin.webview.ui.tools.k1 r7 = new com.tencent.mm.plugin.webview.ui.tools.k1
                r7.<init>(r0)
                r4 = 0
                r5 = 0
                nj3.C76879j.m92732c(r2, r3, r4, r5, r6, r7)
                goto L_0x0c61
            L_0x02b9:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                r3 = 15
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r0.mo68388b()
                t83.l r2 = r2.f118508Z
                java.lang.String r3 = "sendEmail"
                r2.mo73243l(r3, r5)
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                t83.l r0 = r0.f118508Z
                boolean r2 = r0.f130003h
                if (r2 != 0) goto L_0x0305
                java.lang.String r0 = "onSendMail fail, not ready"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
                goto L_0x0c61
            L_0x0305:
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                boolean r3 = r0.f130011p
                java.lang.String r5 = r0.f130012q
                java.lang.String r6 = "menu:share:email"
                java.lang.String r2 = t83.C13851h1.C13852a.m13143c(r6, r2, r3, r5)
                com.tencent.mm.ui.widget.MMWebView r0 = r0.f129996a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r7)
                r3.append(r2)
                r3.append(r4)
                java.lang.String r2 = r3.toString()
                r0.evaluateJavascript(r2, r9)
                goto L_0x0c61
            L_0x032d:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1
                if (r0 == 0) goto L_0x0343
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.core.y r0 = r0.f118513b1
                d93.c r9 = r0.mo67698U()
            L_0x0343:
                if (r9 == 0) goto L_0x03ab
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                r2 = 14
                java.lang.Object[] r2 = new java.lang.Object[r2]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r2[r13] = r15
                r3 = 4
                r2[r3] = r15
                r3 = 5
                r2[r3] = r15
                java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
                r2[r18] = r3
                r2[r19] = r15
                java.lang.String r3 = r9.f122688e
                r2[r14] = r3
                int r3 = r9.f122692i
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r23] = r3
                java.lang.String r3 = r9.f122704u
                r2[r17] = r3
                java.lang.String r3 = r9.f122703t
                r2[r10] = r3
                int r3 = r9.f122708y
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r22] = r3
                int r3 = r9.f122709z
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r24] = r3
                r0.getClass()
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 11577(0x2d39, float:1.6223E-41)
                r0.mo160131h(r3, r2)
            L_0x03ab:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r0.mo68314u9(r2)
                goto L_0x0c61
            L_0x03b8:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r2 = 5
                com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48224m(r0, r2)
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r0.mo68388b()
                com.tencent.mm.plugin.webview.core.y r2 = r2.f118513b1
                java.lang.String r2 = r2.mo67730l0()
                com.tencent.p014mm.sdk.platformtools.ClipboardHelper.setText(r2)
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r0.mo68388b()
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r3 = 2131840241(0x7f114cf1, float:1.9313756E38)
                java.lang.String r0 = r0.getString(r3)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r2, (java.lang.CharSequence) r0, (int) r6)
                r0.show()
                goto L_0x0c61
            L_0x03e5:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                r3 = 4
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.f118521e1
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.mo68388b()
                com.tencent.mm.ui.widget.MMWebView r2 = r2.f118523f
                java.lang.String r2 = r2.getUrl()
                java.lang.Object r0 = r0.get(r2)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 != 0) goto L_0x043a
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                android.content.Intent r0 = r0.mo68387a()
                java.lang.String r2 = "srcUsername"
                java.lang.String r0 = r0.getStringExtra(r2)
            L_0x043a:
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r3 = 43
                java.lang.String r4 = "Contact_Scene"
                r2.mo68577K(r4, r3)
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.mo68388b()
                r2.mo68316v9(r0)
                goto L_0x0c61
            L_0x044e:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                r3 = 17
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r0.mo68388b()
                t83.l r2 = r2.f118508Z
                java.lang.String r3 = "shareQQ"
                r2.mo73243l(r3, r5)
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r0.mo68388b()
                t83.l r2 = r2.f118508Z
                java.util.HashMap r0 = r0.mo68588x()
                boolean r11 = r2.f130003h
                if (r11 != 0) goto L_0x04a5
                java.lang.String r4 = "onShareQQ not ready"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r4)
                android.os.Bundle r0 = r2.mo73267y(r0)
                r2.mo73256r0(r0, r3)
                goto L_0x0c61
            L_0x04a5:
                android.os.Bundle r0 = r2.mo73265x(r5)
                if (r0 == 0) goto L_0x04b6
                boolean r5 = r0.getBoolean(r10, r6)
                if (r5 == 0) goto L_0x04b6
                r2.mo73256r0(r0, r3)
                goto L_0x0c61
            L_0x04b6:
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                boolean r3 = r2.f130011p
                java.lang.String r5 = r2.f130012q
                java.lang.String r6 = "menu:share:qq"
                java.lang.String r0 = t83.C13851h1.C13852a.m13143c(r6, r0, r3, r5)
                com.tencent.mm.ui.widget.MMWebView r2 = r2.f129996a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r7)
                r3.append(r0)
                r3.append(r4)
                java.lang.String r0 = r3.toString()
                r2.evaluateJavascript(r0, r9)
                goto L_0x0c61
            L_0x04de:
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r2 = r2.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r2 = r2.mo68007c()
                java.lang.Object[] r3 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r4.mo68388b()
                java.lang.String r4 = r4.mo6901n0()
                r3[r6] = r4
                r4 = 23
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r5] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
                r3[r11] = r4
                r2.mo68018b(r3)
                r2.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48217f(r2, r0)
                goto L_0x0c61
            L_0x0513:
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r2 = r2.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r2 = r2.mo68007c()
                java.lang.Object[] r3 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r4.mo68388b()
                java.lang.String r4 = r4.mo6901n0()
                r3[r6] = r4
                r4 = 22
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r5] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
                r3[r11] = r4
                r2.mo68018b(r3)
                r2.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48217f(r2, r0)
                goto L_0x0c61
            L_0x0548:
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r2 = r2.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r2 = r2.mo68007c()
                java.lang.Object[] r3 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r4.mo68388b()
                java.lang.String r4 = r4.mo6901n0()
                r3[r6] = r4
                r4 = 20
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r5] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
                r3[r11] = r4
                r2.mo68018b(r3)
                r2.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48217f(r2, r0)
                goto L_0x0c61
            L_0x057d:
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r2 = r2.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r2 = r2.mo68007c()
                java.lang.Object[] r3 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r4.mo68388b()
                java.lang.String r4 = r4.mo6901n0()
                r3[r6] = r4
                r4 = 21
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r5] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
                r3[r11] = r4
                r2.mo68018b(r3)
                r2.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48217f(r2, r0)
                goto L_0x0c61
            L_0x05b2:
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r2 = r2.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r2 = r2.mo68007c()
                java.lang.Object[] r3 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r4.mo68388b()
                java.lang.String r4 = r4.mo6901n0()
                r3[r6] = r4
                r4 = 19
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r5] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
                r3[r11] = r4
                r2.mo68018b(r3)
                r2.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48217f(r2, r0)
                goto L_0x0c61
            L_0x05e7:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r0.getClass()
                java.lang.String r2 = "enterprise_connectors"
                android.os.Bundle r3 = new android.os.Bundle     // Catch:{ Exception -> 0x0686 }
                r3.<init>()     // Catch:{ Exception -> 0x0686 }
                java.lang.String r4 = "enterprise_action"
                r3.putString(r4, r2)     // Catch:{ Exception -> 0x0686 }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r0.mo68388b()     // Catch:{ Exception -> 0x0686 }
                com.tencent.mm.plugin.webview.core.y r4 = r4.f118513b1     // Catch:{ Exception -> 0x0686 }
                com.tencent.mm.plugin.webview.stub.l r4 = r4.f117601y     // Catch:{ Exception -> 0x0686 }
                r7 = 71
                android.os.Bundle r3 = r4.mo68114V5(r7, r3)     // Catch:{ Exception -> 0x0686 }
                java.util.ArrayList r2 = r3.getStringArrayList(r2)     // Catch:{ Exception -> 0x0686 }
                if (r2 == 0) goto L_0x0c61
                int r3 = r2.size()     // Catch:{ Exception -> 0x0686 }
                if (r3 > 0) goto L_0x0640
                goto L_0x0c61
            L_0x0640:
                int r3 = r2.size()     // Catch:{ Exception -> 0x0686 }
                if (r3 != r5) goto L_0x0651
                java.lang.Object r2 = r2.get(r6)     // Catch:{ Exception -> 0x0686 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0686 }
                r0.mo68573G(r2)     // Catch:{ Exception -> 0x0686 }
                goto L_0x0c61
            L_0x0651:
                r0.mo68585u(r2)     // Catch:{ Exception -> 0x0686 }
                com.tencent.mm.ui.tools.x0 r3 = new com.tencent.mm.ui.tools.x0     // Catch:{ Exception -> 0x0686 }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r0.mo68388b()     // Catch:{ Exception -> 0x0686 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x0686 }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r0.mo68388b()     // Catch:{ Exception -> 0x0686 }
                com.tencent.mm.ui.widget.MMWebView r4 = r4.f118523f     // Catch:{ Exception -> 0x0686 }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r5 = r0.mo68388b()     // Catch:{ Exception -> 0x0686 }
                r3.mo70438d(r4, r5, r9)     // Catch:{ Exception -> 0x0686 }
                com.tencent.mm.plugin.webview.ui.tools.h1 r4 = new com.tencent.mm.plugin.webview.ui.tools.h1     // Catch:{ Exception -> 0x0686 }
                r4.<init>(r0)     // Catch:{ Exception -> 0x0686 }
                r3.f122292n = r4     // Catch:{ Exception -> 0x0686 }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r0.mo68388b()     // Catch:{ Exception -> 0x0686 }
                com.tencent.mm.ui.widget.MMWebView r4 = r4.f118523f     // Catch:{ Exception -> 0x0686 }
                com.tencent.mm.plugin.webview.ui.tools.i1 r5 = new com.tencent.mm.plugin.webview.ui.tools.i1     // Catch:{ Exception -> 0x0686 }
                r5.<init>(r0, r2)     // Catch:{ Exception -> 0x0686 }
                com.tencent.mm.plugin.webview.ui.tools.j1 r2 = new com.tencent.mm.plugin.webview.ui.tools.j1     // Catch:{ Exception -> 0x0686 }
                r2.<init>(r0)     // Catch:{ Exception -> 0x0686 }
                r3.mo70436b(r4, r5, r2, r9)     // Catch:{ Exception -> 0x0686 }
                goto L_0x0c61
            L_0x0686:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "builder add, ex = "
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
                goto L_0x0c61
            L_0x06a1:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                android.content.Intent r2 = r2.mo68387a()
                java.lang.String r3 = "sns_local_id"
                java.lang.String r2 = r2.getStringExtra(r3)
                if (r2 == 0) goto L_0x06bd
                java.lang.String r4 = "sns_send_data_ui_activity"
                r0.putExtra(r4, r5)
                r0.putExtra(r3, r2)
                goto L_0x06d4
            L_0x06bd:
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                android.content.Intent r2 = r2.mo68387a()
                r3 = -9223372036854775808
                java.lang.String r5 = "msg_id"
                long r2 = r2.getLongExtra(r5, r3)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                java.lang.String r3 = "Retr_Msg_Id"
                r0.putExtra(r3, r2)
            L_0x06d4:
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.mo68388b()
                java.lang.String r3 = ".ui.chatting.ChattingSendDataToDeviceUI"
                ke3.C88144b.m109801s(r2, r3, r0, r9)
                goto L_0x0c61
            L_0x06e1:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                r3 = 24
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r0.mo68388b()
                t83.l r2 = r2.f118508Z
                java.lang.String r3 = "shareQZone"
                r2.mo73243l(r3, r5)
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r0.mo68388b()
                t83.l r2 = r2.f118508Z
                java.util.HashMap r0 = r0.mo68588x()
                boolean r11 = r2.f130003h
                if (r11 != 0) goto L_0x0738
                java.lang.String r4 = "onShareQZone not ready"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r4)
                android.os.Bundle r0 = r2.mo73267y(r0)
                r2.mo73256r0(r0, r3)
                goto L_0x0c61
            L_0x0738:
                android.os.Bundle r0 = r2.mo73265x(r5)
                if (r0 == 0) goto L_0x0749
                boolean r5 = r0.getBoolean(r10, r6)
                if (r5 == 0) goto L_0x0749
                r2.mo73256r0(r0, r3)
                goto L_0x0c61
            L_0x0749:
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                boolean r3 = r2.f130011p
                java.lang.String r5 = r2.f130012q
                java.lang.String r6 = "menu:share:QZone"
                java.lang.String r0 = t83.C13851h1.C13852a.m13143c(r6, r0, r3, r5)
                com.tencent.mm.ui.widget.MMWebView r2 = r2.f129996a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r7)
                r3.append(r0)
                r3.append(r4)
                java.lang.String r0 = r3.toString()
                r2.evaluateJavascript(r0, r9)
                goto L_0x0c61
            L_0x0771:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                r3 = 31
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r0.mo68579o()
                goto L_0x0c61
            L_0x07a6:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r0.mo68276d9()
                goto L_0x0c61
            L_0x07dd:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                r3 = 32
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                boolean r0 = r0.mo68306s9()
                if (r0 != 0) goto L_0x0c61
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r0.finish()
                goto L_0x0c61
            L_0x0822:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                r3 = 27
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48218g(r0)
                goto L_0x0c61
            L_0x0857:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                t83.l r0 = r0.f118508Z
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                java.lang.String r3 = "onArticleReadingBtnClicked"
                r0.mo73236e0(r3, r9, r2)
                goto L_0x0c61
            L_0x086b:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                r3 = 37
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                t83.l r0 = r0.f118508Z
                r0.mo73260u0(r6, r15, r6)
                goto L_0x0c61
            L_0x08a6:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                r3 = 36
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                t83.l r0 = r0.f118508Z
                r0.mo73260u0(r5, r15, r6)
                goto L_0x0c61
            L_0x08e1:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48216e(r0)
                goto L_0x0c61
            L_0x08e8:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                r3 = 34
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                goto L_0x0c61
            L_0x0918:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                r3 = 33
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                int r0 = r0.mo68268Z7()
                if (r0 == r14) goto L_0x095d
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                ca3.f r0 = r0.f118503X0
                r0.mo62553a(r6)
            L_0x095d:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                y93.a r0 = r0.f118483Q1
                r0.mo67895G(r5)
                goto L_0x0c61
            L_0x096a:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48220i(r0)
                goto L_0x0c61
            L_0x0971:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                r3 = 14
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48219h(r0)
                goto L_0x0c61
            L_0x09a6:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.handoff.model.HandOffURL r0 = r0.f118475M1
                if (r0 == 0) goto L_0x0c61
                java.lang.Class<c02.c> r2 = c02.C92331c.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                c02.c r2 = (c02.C92331c) r2
                r2.k00(r0)
                goto L_0x0c61
            L_0x09bd:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                m93.j r0 = r0.f119133f
                android.content.pm.ResolveInfo r0 = r0.f126286b
                if (r0 == 0) goto L_0x09d0
                android.content.pm.ActivityInfo r2 = r0.activityInfo
                if (r2 == 0) goto L_0x09d0
                java.lang.String r2 = r2.packageName
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r15)
                goto L_0x09d1
            L_0x09d0:
                r2 = r15
            L_0x09d1:
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                com.tencent.mm.plugin.webview.core.y r3 = r3.f118513b1
                if (r3 == 0) goto L_0x09e7
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                com.tencent.mm.plugin.webview.core.y r3 = r3.f118513b1
                d93.c r9 = r3.mo67698U()
            L_0x09e7:
                if (r9 == 0) goto L_0x0a55
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r3 = r3.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r3 = r3.mo68007c()
                r4 = 14
                java.lang.Object[] r4 = new java.lang.Object[r4]
                com.tencent.mm.plugin.webview.ui.tools.g1 r7 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r7 = r7.mo68388b()
                java.lang.String r7 = r7.mo6901n0()
                r4[r6] = r7
                r7 = 39
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r4[r5] = r7
                java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
                r4[r11] = r5
                r4[r13] = r15
                r5 = 4
                r4[r5] = r15
                r5 = 5
                r4[r5] = r15
                java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
                r4[r18] = r5
                r4[r19] = r2
                java.lang.String r2 = r9.f122688e
                r5 = 8
                r4[r5] = r2
                int r2 = r9.f122692i
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4[r23] = r2
                java.lang.String r2 = r9.f122704u
                r4[r17] = r2
                java.lang.String r2 = r9.f122703t
                r5 = 11
                r4[r5] = r2
                int r2 = r9.f122708y
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4[r22] = r2
                int r2 = r9.f122709z
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4[r24] = r2
                r3.getClass()
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 11577(0x2d39, float:1.6223E-41)
                r2.mo160131h(r3, r4)
            L_0x0a55:
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r2.mo68388b()
                r2.mo68269Z8(r0)
                goto L_0x0c61
            L_0x0a60:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                int r0 = r0.getTaskId()
                com.tencent.p014mm.p136ui.C85878m2.m106216e(r0, r9)
                goto L_0x0c61
            L_0x0a6f:
                java.util.ArrayList r4 = r1.f119191d
                int r4 = r4.size()
                if (r3 >= r4) goto L_0x0a92
                r4 = r27
                if (r4 != r3) goto L_0x0a8f
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                t83.l r0 = r0.f118508Z
                java.util.ArrayList r2 = r1.f119191d
                java.lang.Object r2 = r2.get(r3)
                java.lang.String r2 = (java.lang.String) r2
                r0.mo73219P(r2)
                return
            L_0x0a8f:
                int r3 = r3 + 1
                goto L_0x0a6f
            L_0x0a92:
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r3 = r3.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r3 = r3.mo68007c()
                java.lang.Object[] r4 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r7 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r7 = r7.mo68388b()
                java.lang.String r7 = r7.mo6901n0()
                r4[r6] = r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
                r4[r5] = r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
                r4[r11] = r7
                r3.mo68018b(r4)
                r3.mo68017a()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.CharSequence r0 = r26.getTitle()
                r3.append(r0)
                r3.append(r15)
                java.lang.String r3 = r3.toString()
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r0 != 0) goto L_0x0c61
                android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x0b08 }
                r0.<init>()     // Catch:{ Exception -> 0x0b08 }
                java.lang.String r4 = "data"
                r0.putString(r4, r3)     // Catch:{ Exception -> 0x0b08 }
                com.tencent.mm.plugin.webview.ui.tools.g1 r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this     // Catch:{ Exception -> 0x0b08 }
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r4 = r4.mo68388b()     // Catch:{ Exception -> 0x0b08 }
                com.tencent.mm.plugin.webview.core.y r4 = r4.f118513b1     // Catch:{ Exception -> 0x0b08 }
                com.tencent.mm.plugin.webview.stub.l r4 = r4.f117601y     // Catch:{ Exception -> 0x0b08 }
                r7 = 50
                android.os.Bundle r0 = r4.mo68114V5(r7, r0)     // Catch:{ Exception -> 0x0b08 }
                if (r0 == 0) goto L_0x0b10
                int r4 = r0.getInt(r2)     // Catch:{ Exception -> 0x0b08 }
                if (r4 != r11) goto L_0x0afb
                r4 = 1
                goto L_0x0afc
            L_0x0afb:
                r4 = 0
            L_0x0afc:
                int r0 = r0.getInt(r2)     // Catch:{ Exception -> 0x0b06 }
                if (r0 != r13) goto L_0x0b03
                goto L_0x0b04
            L_0x0b03:
                r5 = 0
            L_0x0b04:
                r6 = r5
                goto L_0x0b10
            L_0x0b06:
                r0 = move-exception
                goto L_0x0b0a
            L_0x0b08:
                r0 = move-exception
                r4 = 0
            L_0x0b0a:
                java.lang.Object[] r2 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r15, r2)
                r6 = r4
            L_0x0b10:
                if (r6 == 0) goto L_0x0b19
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r0.mo68573G(r3)
                goto L_0x0c61
            L_0x0b19:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48221j(r0, r3)
                goto L_0x0c61
            L_0x0b20:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r0.mo68324z9()
                goto L_0x0c61
            L_0x0b57:
                com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r17 = 480(0x1e0, double:2.37E-321)
                r19 = 1
                r21 = 1
                r23 = 0
                r16.idkeyStat(r17, r19, r21, r23)
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                r3 = 28
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter r0 = r0.f118464H
                boolean r0 = r0.isShown()
                if (r0 != 0) goto L_0x0c61
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter r0 = r0.f118464H
                r0.mo68917c()
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter r0 = r0.f118464H
                android.widget.EditText r0 = r0.f119842e
                r0.setText(r15)
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter r0 = r0.f118464H
                r0.setVisibility(r6)
                com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter$g r2 = r0.f119847j
                if (r2 == 0) goto L_0x0bca
                r2.onShow()
            L_0x0bca:
                android.widget.EditText r2 = r0.f119842e
                r2.requestFocus()
                com.tencent.mm.plugin.webview.ui.tools.widget.m1 r2 = new com.tencent.mm.plugin.webview.ui.tools.widget.m1
                r2.<init>(r0)
                r3 = 100
                r0.postDelayed(r2, r3)
                goto L_0x0c61
            L_0x0bdb:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.plugin.webview.model.h2 r0 = r0.f118459E1
                com.tencent.mm.plugin.webview.model.h2$d r0 = r0.mo68007c()
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.mm.plugin.webview.ui.tools.g1 r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r3.mo68388b()
                java.lang.String r3 = r3.mo6901n0()
                r2[r6] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
                r2[r5] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r2[r11] = r3
                r0.mo68018b(r2)
                r0.mo68017a()
                com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r13 = 157(0x9d, double:7.76E-322)
                r15 = 6
                r17 = 1
                r19 = 0
                r12.idkeyStat(r13, r15, r17, r19)
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                r0.mo68586v()
                goto L_0x0c61
            L_0x0c1a:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48224m(r0, r11)
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r0.f119138k
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.ui.widget.MMWebView r0 = r0.f118523f
                java.lang.String r0 = r0.getUrl()
                boolean r0 = r2.containsKey(r0)
                if (r0 == 0) goto L_0x0c4c
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r0.f119138k
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                com.tencent.mm.ui.widget.MMWebView r0 = r0.f118523f
                java.lang.String r0 = r0.getUrl()
                java.lang.Object r0 = r2.get(r0)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                goto L_0x0c4d
            L_0x0c4c:
                r0 = 0
            L_0x0c4d:
                com.tencent.mm.plugin.webview.ui.tools.g1 r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48215d(r2, r0, r6)
                goto L_0x0c61
            L_0x0c53:
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.m48224m(r0, r5)
                com.tencent.mm.plugin.webview.ui.tools.g1 r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.this
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.mo68388b()
                r0.mo68280f9(r6)
            L_0x0c61:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.C43992p.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$q */
    public class C43993q implements C77407n.C77419q {
        public C43993q() {
        }

        public void onShow() {
            C76874e0 e0Var;
            RecyclerView.C16634v vVar;
            C43997u uVar = C43977g1.this.f119134g.get(45);
            if (uVar != null) {
                C43977g1.this.f119134g.remove(45);
                C77407n nVar = C43977g1.this.f119144q;
                if (!(nVar == null || !nVar.mo107563h() || (e0Var = C43977g1.this.f119145r) == null)) {
                    int u = e0Var.mo107175u(7);
                    C77407n nVar2 = C43977g1.this.f119144q;
                    RecyclerView recyclerView = nVar2.f225751W0;
                    if (!(recyclerView == null || recyclerView.getLayoutManager() == null || (vVar = nVar2.f225796v1) == null)) {
                        vVar.f44872a = u;
                        nVar2.f225751W0.getLayoutManager().startSmoothScroll(nVar2.f225796v1);
                    }
                }
                C43977g1 g1Var = C43977g1.this;
                g1Var.getClass();
                int i = uVar.f119200a;
                Bundle bundle = uVar.f119202c;
                if (bundle != null && i == 45) {
                    ResolveInfo resolveInfo = (ResolveInfo) bundle.getParcelable("show_browser_resolve_info");
                    boolean z = bundle.getBoolean("show_browser_with_animation", false);
                    if (resolveInfo != null) {
                        C46973j jVar = g1Var.f119133f;
                        jVar.f126287c = null;
                        jVar.f126286b = resolveInfo;
                        g1Var.mo68572F(g1Var.mo68388b(), g1Var.f119133f.f126286b, g1Var.f119145r, uVar.f119201b, z);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$r */
    public class C43994r implements C77407n.C47880p {
        public C43994r() {
        }

        public void onDismiss() {
            C43977g1 g1Var = C43977g1.this;
            g1Var.f119135h.f167570b = 1;
            if (g1Var.mo68388b().mo68238I8() && C43977g1.this.mo68388b().f118508Z != null) {
                C43977g1.this.mo68388b().f118508Z.mo73254q0(true, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$s */
    public static class C43995s implements C59603h0 {

        /* renamed from: a */
        public final WeakReference<C43977g1> f119195a;

        /* renamed from: b */
        public final String f119196b;

        /* renamed from: c */
        public final C109033l0 f119197c;

        public C43995s(C43977g1 g1Var, String str, C109033l0 l0Var) {
            this.f119195a = new WeakReference<>(g1Var);
            this.f119196b = str;
            this.f119197c = l0Var;
        }

        /* renamed from: a */
        public void mo25342a(boolean z, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
            C43977g1 g1Var = this.f119195a.get();
            if (g1Var == null) {
                Log.m105924i("MicroMsg.WebViewMenuHelper", "onOpenMaterialsGot, menuHelper is null");
            } else if (!z) {
                Log.m105924i("MicroMsg.WebViewMenuHelper", "onOpenMaterialsGot, fail");
            } else {
                g1Var.f119148u = this.f119196b;
                g1Var.f119149v = appBrandOpenMaterialCollection;
                g1Var.mo68584t(this.f119197c);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$t */
    public class C43996t implements C9486a {

        /* renamed from: d */
        public boolean f119198d = false;

        public C43996t() {
            Log.m105924i("MicroMsg.WebViewMenuHelper", "<init>#OpenMaterialReleaser");
        }

        public void dead() {
            Log.m105924i("MicroMsg.WebViewMenuHelper", "dead#OpenMaterialReleaser, isKept: " + this.f119198d);
            C43977g1 g1Var = C43977g1.this;
            g1Var.f119148u = null;
            g1Var.f119149v = null;
            g1Var.f119150w = null;
            this.f119198d = false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.g1$u */
    public static class C43997u {

        /* renamed from: a */
        public int f119200a;

        /* renamed from: b */
        public boolean f119201b = false;

        /* renamed from: c */
        public Bundle f119202c = null;

        public C43997u(int i) {
            this.f119200a = i;
        }
    }

    public C43977g1(WebViewUI webViewUI) {
        super(webViewUI);
        int i = webViewUI.getResources().getDisplayMetrics().widthPixels;
        int i2 = webViewUI.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: d */
    public static void m48215d(C43977g1 g1Var, int i, int i2) {
        g1Var.mo68388b().f118508Z.mo73243l(C82980n.NAME, true);
        g1Var.mo68388b().f118508Z.mo73238g0(i, g1Var.mo68588x(), i2);
        g1Var.mo68388b().f118459E1.mo68014l("mm_share_sns_count");
    }

    /* renamed from: e */
    public static void m48216e(C43977g1 g1Var) {
        if (g1Var.mo68388b().mo68242K8()) {
            g1Var.mo68388b().f118477N1.f118669f.mo67657d(C46194p.Menu);
        } else {
            g1Var.mo68388b().mo68273b9(new C44043l1(g1Var));
        }
    }

    /* renamed from: f */
    public static void m48217f(C43977g1 g1Var, MenuItem menuItem) {
        g1Var.getClass();
        if (menuItem instanceof C76875f0) {
            String str = ((C76875f0) menuItem).f224730y;
            if (!Util.isNullOrNil(str) && !str.equals(g1Var.mo68388b().f118523f.getUrl())) {
                g1Var.mo68388b().mo68248O8(str, (Map<String, String>) null, false);
            }
        }
    }

    /* renamed from: g */
    public static void m48218g(C43977g1 g1Var) {
        String l0 = g1Var.mo68388b().f118513b1.mo67730l0();
        if (Util.isNullOrNil(l0)) {
            l0 = g1Var.mo68388b().mo6901n0();
        }
        try {
            l0 = "weread://mp?url=" + C117627q.m165909b(l0, "utf-8");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WebViewMenuHelper", "encode url failed ; %s", e.getMessage());
        }
        Log.m105925i("MicroMsg.WebViewMenuHelper", "now url = %s", l0);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(l0));
        intent.addFlags(268435456);
        if (Util.isIntentAvailable(g1Var.mo68388b(), intent, true)) {
            try {
                WebViewUI b = g1Var.mo68388b();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(b, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper", "shareToWeRead", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                b.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(b, "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper", "shareToWeRead", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.WebViewMenuHelper", e2, "", new Object[0]);
            }
        } else {
            Log.m105920e("MicroMsg.WebViewMenuHelper", "not availble app match this intent");
        }
    }

    /* renamed from: h */
    public static void m48219h(C43977g1 g1Var) {
        g1Var.mo68388b().f118508Z.mo73243l("sendAppMessage", true);
        C48590l lVar = g1Var.mo68388b().f118508Z;
        if (!lVar.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onShareFaceBook fail, not ready");
            return;
        }
        String c = C13851h1.C13852a.m13143c("menu:share:appmessage", new HashMap(), lVar.f130011p, lVar.f130012q);
        MMWebView mMWebView = lVar.f129996a;
        mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
        try {
            lVar.f130007l.mo68088Bk(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "facebook", lVar.f130014s);
        } catch (Exception e) {
            Log.m105928w("MicroMsg.JsApiHandler", "jsapiBundlePutString, ex = " + e.getMessage());
        }
    }

    /* renamed from: i */
    public static void m48220i(C43977g1 g1Var) {
        g1Var.getClass();
        Log.m105924i("MicroMsg.WebViewMenuHelper", "JumpToReadArticle");
        if (g1Var.mo68388b().f118508Z != null) {
            C48590l lVar = g1Var.mo68388b().f118508Z;
            if (!lVar.f130003h) {
                Log.m105920e("MicroMsg.JsApiHandler", "onArticleReadBtnClicked fail, not ready");
                return;
            }
            Log.m105924i("MicroMsg.JsApiHandler", "onArticleReadBtnClicked");
            MMHandlerThread.postToMainThread(new C48607t(lVar, C13851h1.C13852a.m13143c("onArticleReadingBtnClicked", new HashMap(), lVar.f130011p, lVar.f130012q)));
        }
    }

    /* renamed from: j */
    public static void m48221j(C43977g1 g1Var, String str) {
        g1Var.mo68388b().f118508Z.mo73243l("sendAppMessage", false);
        C48590l lVar = g1Var.mo68388b().f118508Z;
        if (!lVar.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onSendToConnector fail, not ready");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "connector");
        String c = C13851h1.C13852a.m13143c("menu:share:appmessage", hashMap, lVar.f130011p, lVar.f130012q);
        MMWebView mMWebView = lVar.f129996a;
        mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
        try {
            lVar.f130007l.mo68088Bk("connector_local_send", str, lVar.f130014s);
            lVar.f130007l.mo68088Bk(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "connector", lVar.f130014s);
        } catch (Exception e) {
            Log.m105928w("MicroMsg.JsApiHandler", "jsapiBundlePutString, ex = " + e.getMessage());
        }
    }

    /* renamed from: k */
    public static boolean m48222k(C43977g1 g1Var) {
        g1Var.getClass();
        try {
            return g1Var.mo68388b().f118513b1.f117601y.Bq0("favorite");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebViewMenuHelper", e, "", new Object[0]);
            return false;
        }
    }

    /* renamed from: l */
    public static void m48223l(C43977g1 g1Var, int i, C76874e0 e0Var) {
        if (g1Var.f119139l || i == 16) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(e0Var.f224704d);
            Log.m105924i("MicroMsg.WebViewMenuHelper", "filterMenu original size:" + arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int itemId = ((MenuItem) it.next()).getItemId();
                if (!((HashSet) g1Var.f119143p).contains(Integer.valueOf(itemId))) {
                    Log.m105924i("MicroMsg.WebViewMenuHelper", "filterMenu removeItem:" + itemId);
                    e0Var.removeItem(itemId);
                }
            }
            Log.m105924i("MicroMsg.WebViewMenuHelper", "filterMenu return size:" + e0Var.size());
        }
    }

    /* renamed from: m */
    public static void m48224m(C43977g1 g1Var, int i) {
        if (g1Var.mo68388b() != null && !g1Var.mo68388b().isFinishing()) {
            C45298c U = g1Var.mo68388b().f118513b1.mo67698U();
            String stringExtra = g1Var.mo68387a().getStringExtra("KPublisherId");
            String stringExtra2 = g1Var.mo68387a().getStringExtra("KAppId");
            String stringExtra3 = g1Var.mo68387a().getStringExtra("srcUsername");
            C43704h2.C43708d c = g1Var.mo68388b().f118459E1.mo68007c();
            Object[] objArr = new Object[16];
            objArr[0] = g1Var.mo68388b().getCurrentURL();
            objArr[1] = Integer.valueOf(i);
            objArr[2] = 1;
            objArr[3] = stringExtra;
            objArr[4] = stringExtra2;
            objArr[5] = stringExtra3;
            objArr[6] = 0;
            objArr[7] = "";
            objArr[8] = U.f122688e;
            objArr[9] = Integer.valueOf(U.f122692i);
            objArr[10] = U.f122704u;
            objArr[11] = U.f122703t;
            objArr[12] = Integer.valueOf(U.f122708y);
            objArr[13] = Integer.valueOf(U.f122709z);
            C52304zt1 zt12 = U.f122707x;
            objArr[14] = Integer.valueOf(zt12 != null ? zt12.f146213d : 0);
            objArr[15] = 0;
            c.mo68018b(objArr);
            c.mo68017a();
        }
    }

    /* renamed from: A */
    public boolean mo68567A(JsapiPermissionWrapper jsapiPermissionWrapper, int i) {
        if (jsapiPermissionWrapper == null) {
            return false;
        }
        int d = jsapiPermissionWrapper.mo69443d(i);
        return d == 1 || d == 10;
    }

    /* renamed from: B */
    public boolean mo68568B(JsapiPermissionWrapper jsapiPermissionWrapper, int i, int i2) {
        return jsapiPermissionWrapper != null && jsapiPermissionWrapper.mo69443d(i) == 1 && mo68581q(i2);
    }

    /* renamed from: C */
    public void mo68569C(String str, Intent intent) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) ((HashMap) this.f119129b).get(str);
        if (sparseBooleanArray == null) {
            sparseBooleanArray = new SparseBooleanArray();
            ((HashMap) this.f119129b).put(str, sparseBooleanArray);
        }
        sparseBooleanArray.put(34, true);
        sparseBooleanArray.put(10, intent.getBooleanExtra("key_menu_hide_expose", false));
    }

    /* renamed from: D */
    public final boolean mo68570D() {
        WebViewUI b = mo68388b();
        return b != null && b.f118458E.f125614a;
    }

    /* renamed from: E */
    public final void mo68571E(boolean z) {
        C107885g0 g0Var;
        Log.m105918d("MicroMsg.WebViewMenuHelper", "loadOpenMaterialsIfNeedAndEnhanceBottomSheet, onBottomSheetCreate: " + z);
        C109033l0 l0Var = (C109033l0) C86312j.m106911c(C109033l0.class);
        if (l0Var == null) {
            Log.m105928w("MicroMsg.WebViewMenuHelper", "loadOpenMaterialsIfNeedAndEnhanceBottomSheet, openMaterialService is null");
        } else if (!l0Var.mo158321RB(C98783b.WEB_VIEW)) {
            Log.m105924i("MicroMsg.WebViewMenuHelper", "loadOpenMaterialsIfNeedAndEnhanceBottomSheet, openMaterialService is disabled");
        } else {
            WebViewUI b = mo68388b();
            if (b == null) {
                Log.m105928w("MicroMsg.WebViewMenuHelper", "loadOpenMaterialsIfNeedAndEnhanceBottomSheet, webViewUI is null");
                return;
            }
            C43522y yVar = b.f118513b1;
            if (yVar == null) {
                Log.m105928w("MicroMsg.WebViewMenuHelper", "loadOpenMaterialsIfNeedAndEnhanceBottomSheet, controller is null");
                return;
            }
            String l0 = yVar.mo67730l0();
            Log.m105918d("MicroMsg.WebViewMenuHelper", "loadOpenMaterialsIfNeedAndEnhanceBottomSheet, url: " + l0);
            if (Util.isNullOrNil(l0)) {
                Log.m105928w("MicroMsg.WebViewMenuHelper", "loadOpenMaterialsIfNeedAndEnhanceBottomSheet, url is empty");
                C119179t tVar = C119157j.f356862d;
                C43985h hVar = new C43985h(z);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(hVar, 1000, false);
                return;
            }
            if (z && (g0Var = this.f119150w) != null) {
                g0Var.dead();
                this.f119150w = null;
            }
            if (l0.equals(this.f119148u)) {
                Log.m105924i("MicroMsg.WebViewMenuHelper", "loadOpenMaterialsIfNeedAndEnhanceBottomSheet, already load");
                mo68584t(l0Var);
                return;
            }
            Map<String, String> map = MaterialModel.f267603g;
            Log.m105918d("MicroMsg.AppBrand.MaterialModel", "fromWebView, materialUrl: " + l0);
            l0Var.mo158324aj(new MaterialModel("text/html", "html", l0), new C43995s(this, l0, l0Var));
        }
    }

    /* renamed from: F */
    public final void mo68572F(WebViewUI webViewUI, ResolveInfo resolveInfo, C76874e0 e0Var, boolean z, boolean z2) {
        WebViewUI webViewUI2 = webViewUI;
        String b = C46969f.m52277b(webViewUI, resolveInfo);
        String format = String.format(webViewUI.getString(C0966R.string.let), new Object[]{b});
        Drawable drawable = this.f119133f.f126287c;
        if (drawable != null) {
            mo68578n(e0Var, format, drawable, (Bitmap) null, z, z2);
            return;
        }
        new C46971i(webViewUI, b, new C43983f(e0Var, format, z, z2)).execute(new ResolveInfo[]{resolveInfo});
    }

    /* renamed from: G */
    public final void mo68573G(String str) {
        mo68388b().f118508Z.mo73243l("sendAppMessage", false);
        C48590l lVar = mo68388b().f118508Z;
        if (!lVar.f130003h) {
            Log.m105920e("MicroMsg.JsApiHandler", "onSendToEnterprise fail, not ready");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "enterprise");
        String c = C13851h1.C13852a.m13143c("menu:share:appmessage", hashMap, lVar.f130011p, lVar.f130012q);
        MMWebView mMWebView = lVar.f129996a;
        mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c + ")", (ValueCallback<String>) null);
        try {
            lVar.f130007l.mo68088Bk("connector_local_send", str, lVar.f130014s);
            lVar.f130007l.mo68088Bk(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "enterprise", lVar.f130014s);
        } catch (Exception e) {
            Log.m105928w("MicroMsg.JsApiHandler", "jsapiBundlePutString, ex = " + e.getMessage());
        }
    }

    /* renamed from: H */
    public boolean mo68574H(JsapiPermissionWrapper jsapiPermissionWrapper, int i) {
        return jsapiPermissionWrapper != null && jsapiPermissionWrapper.mo69443d(i) == 10;
    }

    /* renamed from: I */
    public void mo68575I() {
        mo68576J(0, new ArrayList(), false, false, -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo68576J(long r17, java.util.ArrayList<java.lang.String> r19, boolean r20, boolean r21, int r22) {
        /*
            r16 = this;
            r9 = r16
            java.lang.Class<ex0.d> r0 = ex0.C45696d.class
            boolean r1 = r16.mo68389c()
            java.lang.String r10 = "MicroMsg.WebViewMenuHelper"
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = "showReaderModeMenu, webViewUI is finished"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            return
        L_0x0012:
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r19.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11 = 0
            r1[r11] = r2
            boolean r2 = r9.f119139l
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r12 = 1
            r1[r12] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r20)
            r13 = 2
            r1[r13] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r21)
            r14 = 3
            r1[r14] = r2
            r2 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r1[r2] = r3
            java.lang.String r2 = "showReaderModeMenu  mpShowMenuItems:%d , imersiveMode:%b, isDarkStyle:%b, disableMenuHeader:%b, itemShowType:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r1)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r1 = r16.mo68388b()
            com.tencent.mm.ui.widget.MMWebView r1 = r1.f118523f
            if (r1 != 0) goto L_0x0051
            java.lang.String r1 = "getCustomMenuList viewWV is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r1)
            goto L_0x0074
        L_0x0051:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r1 = r16.mo68388b()
            com.tencent.mm.ui.widget.MMWebView r1 = r1.f118523f
            java.lang.String r1 = r1.getUrl()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r16.mo68388b()
            java.util.HashMap<java.lang.String, java.util.ArrayList<pj.e$b>> r2 = r2.f118524f1
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L_0x0074
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r16.mo68388b()
            java.util.HashMap<java.lang.String, java.util.ArrayList<pj.e$b>> r2 = r2.f118524f1
            java.lang.Object r1 = r2.get(r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            goto L_0x0075
        L_0x0074:
            r1 = 0
        L_0x0075:
            r9.f119146s = r1
            if (r1 == 0) goto L_0x0081
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0081
            r1 = 1
            goto L_0x0082
        L_0x0081:
            r1 = 0
        L_0x0082:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r9.f119147t = r1
            qo3.n r1 = r9.f119144q
            if (r1 != 0) goto L_0x008e
            r1 = 0
            goto L_0x0092
        L_0x008e:
            boolean r1 = r1.mo107563h()
        L_0x0092:
            if (r1 != 0) goto L_0x00b3
            java.lang.Boolean r2 = r9.f119147t
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00a8
            qo3.n r2 = new qo3.n
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r16.mo68388b()
            r2.<init>((android.content.Context) r3, (int) r12, (boolean) r11)
            r9.f119144q = r2
            goto L_0x00b3
        L_0x00a8:
            qo3.n r2 = new qo3.n
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r16.mo68388b()
            r2.<init>((android.content.Context) r3, (int) r11, (boolean) r12)
            r9.f119144q = r2
        L_0x00b3:
            if (r20 == 0) goto L_0x00ba
            qo3.n r2 = r9.f119144q
            r2.mo107570o(r12)
        L_0x00ba:
            r1 = r1 ^ r12
            r9.mo68571E(r1)
            ea3.w r1 = r9.f119135h
            long r2 = java.lang.System.currentTimeMillis()
            r1.f167572d = r2
            qo3.n r1 = r9.f119144q
            com.tencent.mm.plugin.webview.ui.tools.g1$l r2 = new com.tencent.mm.plugin.webview.ui.tools.g1$l
            r2.<init>()
            r1.f225802y = r2
            android.view.Window r1 = r1.mo107558c()
            android.view.View r1 = r1.getDecorView()
            com.tencent.mm.plugin.webview.ui.tools.g1$m r2 = new com.tencent.mm.plugin.webview.ui.tools.g1$m
            r2.<init>()
            r1.addOnAttachStateChangeListener(r2)
            qo3.n r1 = r9.f119144q
            com.tencent.mm.plugin.webview.ui.tools.g1$n r2 = new com.tencent.mm.plugin.webview.ui.tools.g1$n
            r2.<init>()
            r1.f225805z = r2
            com.tencent.mm.plugin.webview.ui.tools.g1$o r2 = new com.tencent.mm.plugin.webview.ui.tools.g1$o
            r2.<init>()
            r1.f225725D = r2
            com.tencent.mm.plugin.webview.ui.tools.g1$p r8 = new com.tencent.mm.plugin.webview.ui.tools.g1$p
            r3 = r19
            r8.<init>(r3)
            r1.f225782p = r8
            com.tencent.mm.plugin.webview.ui.tools.g1$q r2 = new com.tencent.mm.plugin.webview.ui.tools.g1$q
            r2.<init>()
            r1.f225763e = r2
            com.tencent.mm.plugin.webview.ui.tools.g1$r r2 = new com.tencent.mm.plugin.webview.ui.tools.g1$r
            r2.<init>()
            r1.f225761d = r2
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r1 = r16.mo68388b()
            d93.h r1 = r1.f118491T0
            if (r1 != 0) goto L_0x0114
            java.lang.String r0 = "get permission failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            return
        L_0x0114:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r1 = r16.mo68388b()
            com.tencent.mm.protocal.JsapiPermissionWrapper r4 = r1.mo68282g8()
            qo3.n r1 = r9.f119144q
            com.tencent.mm.plugin.webview.ui.tools.g1$a r2 = new com.tencent.mm.plugin.webview.ui.tools.g1$a
            r6 = r22
            r2.<init>(r4, r6)
            r1.f225771i = r2
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r1 = r16.mo68388b()
            java.lang.String r1 = r1.getCurrentURL()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r2 = r16.mo68388b()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper r2 = r2.f118477N1
            com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper$c r7 = r2.mo68370b(r1)
            k40.a r2 = f40.C86709a0.m107533q(r0)
            if (r2 == 0) goto L_0x014d
            k40.a r0 = f40.C86709a0.m107533q(r0)
            ex0.d r0 = (ex0.C45696d) r0
            boolean r0 = r0.B60(r1)
            if (r0 == 0) goto L_0x014d
            r0 = 1
            goto L_0x014e
        L_0x014d:
            r0 = 0
        L_0x014e:
            qo3.n r5 = r9.f119144q
            com.tencent.mm.plugin.webview.ui.tools.g1$b r2 = new com.tencent.mm.plugin.webview.ui.tools.g1$b
            r1 = r2
            r13 = r2
            r2 = r16
            r3 = r19
            r14 = r5
            r5 = r7
            r15 = r7
            r6 = r17
            r11 = r8
            r8 = r22
            r1.<init>(r3, r4, r5, r6, r8)
            r14.f225773j = r13
            r14.f225787r = r11
            boolean r1 = r9.f119139l
            if (r1 != 0) goto L_0x02cc
            if (r21 != 0) goto L_0x02cc
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r1 = r16.mo68388b()
            java.lang.String r1 = r1.getCurrentURL()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x02c3
            android.net.Uri r2 = android.net.Uri.parse(r1)
            java.lang.String r2 = r2.getHost()
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r3 = r16.mo68388b()
            r4 = 2131840027(0x7f114c1b, float:1.9313322E38)
            java.lang.Object[] r5 = new java.lang.Object[r12]
            r6 = 0
            r5[r6] = r2
            java.lang.String r3 = r3.getString(r4, r5)
            java.lang.String r4 = r9.f119137j
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x022b
            if (r0 == 0) goto L_0x021d
            if (r15 == 0) goto L_0x021d
            java.lang.String r0 = r15.f118693c
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01bd
            java.lang.String r0 = r15.f118692b
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01bd
            java.lang.String r0 = r15.f118691a
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01bd
            boolean r0 = r15.f118696f
            if (r0 == 0) goto L_0x01bd
            r0 = 1
            goto L_0x01be
        L_0x01bd:
            r0 = 0
        L_0x01be:
            if (r0 == 0) goto L_0x021d
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r16.mo68388b()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131496658(0x7f0c0ed2, float:1.8616887E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r9.f119136i = r0
            r1 = 2131306748(0x7f0928fc, float:1.8231704E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2 = 2131315784(0x7f094c48, float:1.8250031E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131300398(0x7f09102e, float:1.8218825E38)
            android.view.View r3 = r0.findViewById(r3)
            java.lang.String r4 = r15.f118692b
            r2.setText(r4)
            hc0.c$b r2 = new hc0.c$b
            r2.<init>()
            r2.f59347c = r12
            r2.f59364t = r12
            r4 = 2131231871(0x7f08047f, float:1.8079835E38)
            r2.f59359o = r4
            gc0.a r4 = gc0.C20828a.m22825b()
            java.lang.String r5 = r15.f118693c
            hc0.c r2 = r2.mo32666a()
            r4.mo32519h(r5, r1, r2)
            com.tencent.mm.plugin.webview.ui.tools.g1$c r1 = new com.tencent.mm.plugin.webview.ui.tools.g1$c
            r1.<init>(r15)
            r3.setOnClickListener(r1)
            com.tencent.p014mm.p136ui.tools.C7007c1.m7256a(r3)
            qo3.n r1 = r9.f119144q
            r1.mo107569n(r0, r12)
            goto L_0x02cc
        L_0x021d:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 != 0) goto L_0x02cc
            qo3.n r0 = r9.f119144q
            r1 = 0
            r0.mo107568m(r3, r12, r1)
            goto L_0x02cc
        L_0x022b:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r16.mo68388b()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r2 = 2131496659(0x7f0c0ed3, float:1.861689E38)
            r4 = 0
            android.view.View r0 = r0.inflate(r2, r4)
            r9.f119136i = r0
            r2 = 2131315428(0x7f094ae4, float:1.8249309E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x0250
            r2.setText(r3)
            goto L_0x0255
        L_0x0250:
            r3 = 8
            r2.setVisibility(r3)
        L_0x0255:
            r2 = 2131300853(0x7f0911f5, float:1.8219747E38)
            android.view.View r2 = r0.findViewById(r2)
            com.tencent.mm.ui.widget.MMNeat7extView r2 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r2
            qo3.n r3 = r9.f119144q
            r3.mo107569n(r0, r12)
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            android.content.Context r3 = r2.getContext()
            java.lang.String r4 = r9.f119137j
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            float r5 = r2.getTextSize()
            int r5 = (int) r5
            android.text.SpannableString r0 = r0.mo107081qu(r3, r4, r5)
            r2.mo104279b(r0)
            int r3 = r0.length()
            java.lang.Class<android.text.style.ClickableSpan> r4 = android.text.style.ClickableSpan.class
            r5 = 0
            java.lang.Object[] r0 = r0.getSpans(r5, r3, r4)
            android.text.style.ClickableSpan[] r0 = (android.text.style.ClickableSpan[]) r0
            if (r0 == 0) goto L_0x02cc
            int r0 = r0.length
            if (r0 <= 0) goto L_0x02cc
            java.lang.String r0 = "terry h5 apply show"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 16337(0x3fd1, float:2.2893E-41)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r5] = r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r4[r12] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r5 = 2
            r4[r5] = r6
            r0.mo160131h(r3, r4)
            com.tencent.mm.plugin.webview.ui.tools.g1$d r0 = new com.tencent.mm.plugin.webview.ui.tools.g1$d
            de3.a0 r3 = new de3.a0
            android.content.Context r4 = r2.getContext()
            r3.<init>(r4)
            r0.<init>(r9, r2, r3, r1)
            r2.setOnTouchListener(r0)
            goto L_0x02cc
        L_0x02c3:
            qo3.n r0 = r9.f119144q
            java.lang.String r1 = " "
            r2 = 0
            r0.mo107568m(r1, r12, r2)
            goto L_0x02cd
        L_0x02cc:
            r2 = 0
        L_0x02cd:
            boolean r0 = r9.f119139l
            if (r0 != 0) goto L_0x02e3
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r16.mo68388b()
            boolean r0 = r0.mo68238I8()
            if (r0 == 0) goto L_0x02dc
            goto L_0x02e3
        L_0x02dc:
            qo3.n r0 = r9.f119144q
            r0.f225774j1 = r2
            r0.f225779n1 = r2
            goto L_0x02fb
        L_0x02e3:
            qo3.n r0 = r9.f119144q
            r0.f225774j1 = r12
            r0.f225779n1 = r12
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.webview.ui.tools.g1$e r1 = new com.tencent.mm.plugin.webview.ui.tools.g1$e
            r1.<init>()
            r2 = 500(0x1f4, double:2.47E-321)
            zt3.j r0 = (zt3.C119157j) r0
            r0.getClass()
            r4 = 0
            r0.mo183892w(r1, r2, r4)
        L_0x02fb:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r16.mo68388b()
            com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter r0 = r0.f118464H
            if (r0 == 0) goto L_0x0319
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r16.mo68388b()
            com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter r0 = r0.f118464H
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0319
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r16.mo68388b()
            com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter r0 = r0.f118464H
            r0.mo68915a()
            goto L_0x0320
        L_0x0319:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r16.mo68388b()
            r0.hideVKB()
        L_0x0320:
            qo3.n r0 = r9.f119144q     // Catch:{ Exception -> 0x0326 }
            r0.mo107573q()     // Catch:{ Exception -> 0x0326 }
            goto L_0x0335
        L_0x0326:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.String r0 = r0.getMessage()
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "tryShow ex %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r1)
        L_0x0335:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r16.mo68388b()
            t83.l r0 = r0.f118508Z
            if (r0 == 0) goto L_0x0348
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r16.mo68388b()
            t83.l r0 = r0.f118508Z
            java.lang.String r1 = ""
            r0.mo73222S(r1)
        L_0x0348:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.C43977g1.mo68576J(long, java.util.ArrayList, boolean, boolean, int):void");
    }

    /* renamed from: K */
    public void mo68577K(String str, int i) {
        if (mo68388b().f118508Z != null) {
            Bundle bundle = new Bundle();
            bundle.putInt(str, i);
            C48590l lVar = mo68388b().f118508Z;
            lVar.getClass();
            try {
                lVar.f130007l.mo68145pG(21, bundle, lVar.f130014s);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiHandler", e, "", new Object[0]);
                Log.m105928w("MicroMsg.JsApiHandler", "updateJsapiArgsBundleKV, ex = " + e);
            }
        }
    }

    /* renamed from: n */
    public final void mo68578n(C76874e0 e0Var, String str, Drawable drawable, Bitmap bitmap, boolean z, boolean z2) {
        Log.m105919d("MicroMsg.WebViewMenuHelper", "alvinluo addDefaultBrowserMenuItem withAnimation: %s, title: %s, iconDrawable: %s, bitmap: %s", Boolean.valueOf(z2), str, drawable, bitmap);
        if (this.f119144q != null) {
            if (!z2) {
                if (mo68582r(e0Var, Math.max(0, e0Var.mo107175u(7)), drawable, str, z)) {
                    this.f119144q.mo107564i();
                    return;
                }
                return;
            }
            C119179t tVar = C119157j.f356862d;
            C43984g gVar = new C43984g(e0Var, drawable, str, z);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(gVar, 100, false);
        }
    }

    /* renamed from: o */
    public void mo68579o() {
        String S = mo68388b().mo6898S(mo68388b().f118513b1.f117597w);
        String stringExtra = mo68387a().getStringExtra("shortcut_user_name");
        if (Util.isNullOrNil(S) || Util.isNullOrNil(stringExtra)) {
            Log.m105920e("MicroMsg.WebViewMenuHelper", "addShortcut, appid or username is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("KAppId", S);
        bundle.putString("shortcut_user_name", stringExtra);
        bundle.putInt("webviewui_binder_id", hashCode());
        try {
            mo68388b().f118513b1.f117601y.mo68114V5(80, bundle);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WebViewMenuHelper", "addShortcut, e = " + e.getMessage());
        }
    }

    /* renamed from: p */
    public final boolean mo68580p(int i) {
        if (mo68570D()) {
            return i == 6 || i == 10;
        }
        if (this.f119140m) {
            return ((HashSet) this.f119142o).contains(Integer.valueOf(i));
        }
    }

    /* renamed from: q */
    public boolean mo68581q(int i) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) ((HashMap) this.f119129b).get(mo68388b().f118523f.getUrl());
        return sparseBooleanArray == null || !sparseBooleanArray.get(i, false);
    }

    /* renamed from: r */
    public final boolean mo68582r(C76874e0 e0Var, int i, Drawable drawable, String str, boolean z) {
        if (e0Var == null) {
            return false;
        }
        if (e0Var.findItem(45) != null) {
            Log.m105928w("MicroMsg.WebViewMenuHelper", "alvinluo doAddDefaultBrowserMenuItem has added and ignore");
            return false;
        }
        Log.m105919d("MicroMsg.WebViewMenuHelper", "alvinluo doAddDefaultBrowserMenuItem index: %s", Integer.valueOf(i));
        MenuItem e = e0Var.mo107141e(45, i, str, 0, 0, z);
        C76875f0 f0Var = (C76875f0) e;
        f0Var.f224720o = TextUtils.TruncateAt.END;
        f0Var.f224727v = false;
        ((C76875f0) e).setIcon(drawable);
        return true;
    }

    /* renamed from: s */
    public void mo68583s(String str) {
        boolean z;
        String str2 = "";
        String stringExtra = mo68387a().getStringExtra("geta8key_username");
        String currentURL = mo68388b().getCurrentURL();
        String str3 = null;
        String host = !Util.isNullOrNil(currentURL) ? Uri.parse(currentURL).getHost() : null;
        if (!Util.isNullOrNil(host) && host.startsWith(WeChatHosts.domainString(C0966R.string.f360885fm3))) {
            try {
                str3 = String.format(C74928u.C45092d.f122307b, new Object[]{C117627q.m165909b(currentURL, "utf-8")});
            } catch (UnsupportedEncodingException e) {
                Log.m105920e("MicroMsg.WebViewMenuHelper", e.getMessage());
            }
        }
        String S = mo68388b().mo6898S(mo68388b().f118523f.getUrl());
        Log.m105919d("MicroMsg.WebViewMenuHelper", "doExpose enableReportPageEvent %s", Boolean.TRUE);
        if (!TextUtils.isEmpty(S) && !TextUtils.isEmpty(mo68388b().f118523f.getUrl())) {
            long nowSecond = Util.nowSecond();
            Log.m105919d("MicroMsg.WebViewMenuHelper", "report(%s), clickTimestamp : %d, appID : %s, url : %s, sessionId : %s, actionType : %d, flag : %d", 13377, Long.valueOf(nowSecond), S, mo68388b().f118523f.getUrl(), mo68388b().f118479P, 4, 1);
            try {
                str2 = C117627q.m165909b(mo68388b().f118523f.getUrl(), "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                Log.printErrStackTrace("MicroMsg.WebViewMenuHelper", e2, str2, new Object[0]);
            }
            C115669n.INSTANCE.mo160131h(13377, Long.valueOf(nowSecond), S, str2, mo68388b().f118479P, 4, 1);
        }
        if (Util.isNullOrNil(str3)) {
            str3 = String.format(C74928u.C45092d.f122306a, new Object[]{34});
            z = true;
        } else {
            z = false;
        }
        Intent intent = new Intent();
        if (!Util.isNullOrNil(str)) {
            try {
                intent.putExtra("k_webview_html", Base64.encodeToString(str.getBytes("UTF-8"), 11));
            } catch (UnsupportedEncodingException e3) {
                Log.m105920e("MicroMsg.WebViewMenuHelper", "[oneliang]html get byte error, ex = " + e3.getMessage());
            }
        }
        Log.m105925i("MicroMsg.WebViewMenuHelper", "expose curUrl %s, rawUrl %s", currentURL, mo68388b().mo6901n0());
        intent.putExtra("rawUrl", str3);
        intent.putExtra("k_expose_url", currentURL);
        intent.putExtra("k_expose_raw_url", mo68388b().mo6901n0());
        intent.putExtra("k_expose_web_scene", mo68388b().mo68291k8(stringExtra));
        intent.putExtra("key_menu_hide_expose", true);
        intent.putExtra("lastGetA8KeyRequestId", mo68388b().f118513b1.mo67698U().f122692i);
        C76879j.m92709C(mo68388b(), mo68388b().getString(C0966R.string.lgy), "", mo68388b().getString(C0966R.string.f7569jy), mo68388b().getString(C0966R.string.f7948x5), false, new C43986i(intent, z, currentURL, stringExtra), new C43988j(z, currentURL, stringExtra, intent));
    }

    /* renamed from: t */
    public final void mo68584t(C109033l0 l0Var) {
        if (this.f119149v == null) {
            Log.m105924i("MicroMsg.WebViewMenuHelper", "enhanceBottomSheet, openMaterialCollection is null");
        } else if (this.f119144q == null) {
            Log.m105924i("MicroMsg.WebViewMenuHelper", "enhanceBottomSheet, mmBottomSheet is null");
        } else {
            WebViewUI b = mo68388b();
            if (b == null) {
                Log.m105928w("MicroMsg.WebViewMenuHelper", "enhanceBottomSheet, webViewUI is null");
            } else if (!l0Var.mo158325ic(this.f119144q, this.f119149v)) {
                Log.m105924i("MicroMsg.WebViewMenuHelper", "enhanceBottomSheet, not need enhance");
            } else {
                boolean z = false;
                try {
                    JsapiPermissionWrapper g8 = mo68388b().mo68282g8();
                    if (!this.f119139l && mo68388b().mo68268Z7() != 16 && mo68580p(7) && mo68567A(g8, 45) && mo68581q(7) && !mo68574H(g8, 45) && !this.f119147t.booleanValue()) {
                        z = true;
                    }
                } catch (Exception e) {
                    Log.m105928w("MicroMsg.WebViewMenuHelper", "canShowOpenMaterials fail since " + e);
                }
                Log.m105924i("MicroMsg.WebViewMenuHelper", "enhanceBottomSheet, canShowOpenMaterials: " + z);
                C107885g0 g0Var = this.f119150w;
                if (g0Var != null) {
                    g0Var.mo158311o(z ? C107885g0.C45943b.ENABLE : C107885g0.C45943b.HIDE);
                } else if (z) {
                    this.f119150w = l0Var.mo158322RD(C98783b.WEB_VIEW, b, this.f119144q, this.f119149v, (C107879e0) null, (C45944i0) null);
                    C43996t tVar = this.f119151x;
                    if (tVar == null) {
                        tVar = new C43996t();
                        this.f119151x = tVar;
                    }
                    tVar.getClass();
                    Log.m105924i("MicroMsg.WebViewMenuHelper", "keepMyself#OpenMaterialReleaser, isKept: " + tVar.f119198d);
                    if (!tVar.f119198d) {
                        b.keep(tVar);
                        tVar.f119198d = true;
                    }
                }
            }
        }
    }

    /* renamed from: u */
    public final void mo68585u(List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (String next : list) {
                if (this.f119131d.get(next) != null) {
                    Log.m105925i("MicroMsg.WebViewMenuHelper", "find %s icon from cache ok", next);
                } else {
                    Log.m105929w("MicroMsg.WebViewMenuHelper", "not found %s icon from cache, try to load", next);
                    try {
                        String mr = mo68388b().f118513b1.f117601y.mo68142mr(next);
                        if (!Util.isNullOrNil(mr)) {
                            HashMap<String, WeakReference<Bitmap>> hashMap = C6600v.f23854a;
                            Bitmap a = C7618l.f25900a.mo8750a(mr);
                            if (a != null) {
                                Log.m105924i("MicroMsg.WebViewMenuHelper", "load ok, and cache it");
                                this.f119131d.put(next, a);
                            }
                        }
                    } catch (Exception e) {
                        Log.m105928w("MicroMsg.WebViewMenuHelper", "getheadimg, ex = " + e.getMessage());
                    }
                }
                if (this.f119132e.containsKey(next)) {
                    Log.m105925i("MicroMsg.WebViewMenuHelper", "find %s nick from cache ok", next);
                } else {
                    Log.m105929w("MicroMsg.WebViewMenuHelper", "not found %s nick from cache, try to load", next);
                    String str = null;
                    try {
                        str = mo68388b().f118513b1.f117601y.getDisplayName(next);
                        Log.m105924i("MicroMsg.WebViewMenuHelper", "load nick ok");
                    } catch (Exception e2) {
                        Log.m105928w("MicroMsg.WebViewMenuHelper", "onAttach, ex = " + e2.getMessage());
                    }
                    this.f119132e.put(next, str);
                }
            }
        }
    }

    /* renamed from: v */
    public void mo68586v() {
        if (mo68388b().f118508Z != null) {
            mo68388b().f118508Z.mo73222S("fav");
            mo68388b().f118508Z.mo73243l("sendAppMessage", false);
            mo68388b().f118508Z.mo73213J(mo68588x(), 0);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("msg_id", mo68387a().getLongExtra("msg_id", Long.MIN_VALUE));
        bundle.putString("sns_local_id", mo68387a().getStringExtra("sns_local_id"));
        bundle.putInt("news_svr_id", mo68387a().getIntExtra("news_svr_id", 0));
        bundle.putString("news_svr_tweetid", mo68387a().getStringExtra("news_svr_tweetid"));
        bundle.putInt("message_index", mo68387a().getIntExtra("message_index", 0));
        bundle.putString("rawUrl", mo68388b().mo6901n0());
        if (!Util.isNullOrNil(mo68388b().mo6901n0()) && mo68388b().mo6901n0().endsWith("#rd")) {
            String substring = mo68388b().mo6901n0().substring(0, mo68388b().mo6901n0().length() - 3);
            if (!Util.isNullOrNil(mo68388b().f118513b1.f117597w) && !mo68388b().f118513b1.f117597w.startsWith(substring)) {
                bundle.putString("rawUrl", mo68388b().f118513b1.f117597w);
                bundle.putLong("msg_id", Long.MIN_VALUE);
            }
        } else if (!Util.isNullOrNil(mo68388b().f118513b1.f117597w) && !mo68388b().f118513b1.f117597w.startsWith(mo68388b().mo6901n0())) {
            bundle.putString("rawUrl", mo68388b().f118513b1.f117597w);
            bundle.putLong("msg_id", Long.MIN_VALUE);
        }
        Intent a = mo68387a();
        if (a != null) {
            bundle.putString("preChatName", a.getStringExtra("preChatName"));
            bundle.putInt("preMsgIndex", a.getIntExtra("preMsgIndex", 0));
            bundle.putString("prePublishId", a.getStringExtra("prePublishId"));
            bundle.putString("preUsername", a.getStringExtra("preUsername"));
        }
        try {
            C43784c aG = mo68388b().f118513b1.f117601y.mo68119aG(bundle);
            if (aG.mo68154eQ()) {
                mo68388b().f118508Z.mo73243l("sendAppMessage", false);
                mo68388b().f118508Z.mo73213J(mo68588x(), 0);
                Log.m105924i("MicroMsg.WebViewMenuHelper", "on favorite simple url");
                return;
            }
            ((C47453t0) C86312j.m106911c(C47453t0.class)).mo72473I2(aG.getRet(), 35, mo68388b(), mo68388b().f118582y2);
            if (aG.getRet() == 0) {
                mo68587w(3, 1);
            } else {
                mo68587w(3, 2);
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WebViewMenuHelper", "edw, favoriteUrl fail, ex = " + e.getMessage());
        }
    }

    /* renamed from: w */
    public void mo68587w(int i, int i2) {
        String str;
        String str2 = "";
        String S = mo68388b().mo6898S(mo68388b().f118513b1.f117597w);
        if (TextUtils.isEmpty(mo68388b().f118513b1.f117597w) || TextUtils.isEmpty(S)) {
            Log.m105924i("MicroMsg.WebViewMenuHelper", "stev appId is null or empty");
            return;
        }
        Log.m105925i("MicroMsg.WebViewMenuHelper", "stev appId %s", S);
        long nowSecond = Util.nowSecond();
        Log.m105919d("MicroMsg.WebViewMenuHelper", "stev report(%s), clickTimestamp : %d, appID : %s, url : %s, sessionId : %s, actionType : %d, flag : %d", 13377, Long.valueOf(nowSecond), S, mo68388b().f118513b1.f117597w, mo68388b().f118479P, Integer.valueOf(i), Integer.valueOf(i2));
        try {
            str = C117627q.m165909b(mo68388b().f118513b1.f117597w, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.printErrStackTrace("MicroMsg.WebViewMenuHelper", e, str2, new Object[0]);
            str = str2;
        }
        int k8 = mo68388b().mo68291k8(mo68387a().getStringExtra("geta8key_username"));
        if (k8 == 7 || k8 == 56) {
            str2 = mo68387a().getStringExtra("geta8key_username");
        }
        C115669n.INSTANCE.mo160131h(13377, Long.valueOf(nowSecond), S, str, mo68388b().f118479P, Integer.valueOf(i), Integer.valueOf(i2), 0, str2);
    }

    /* renamed from: x */
    public HashMap<String, String> mo68588x() {
        if (!mo68388b().f118546n2) {
            return null;
        }
        Intent a = mo68387a();
        String stringExtra = a.getStringExtra("share_report_pre_msg_url");
        String stringExtra2 = a.getStringExtra("share_report_pre_msg_title");
        String stringExtra3 = a.getStringExtra("share_report_pre_msg_icon_url");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("share_report_pre_msg_url", stringExtra);
        hashMap.put("share_report_pre_msg_title", stringExtra2);
        hashMap.put("share_report_pre_msg_desc", a.getStringExtra("share_report_pre_msg_desc"));
        hashMap.put("share_report_pre_msg_icon_url", stringExtra3);
        return hashMap;
    }

    /* renamed from: y */
    public int mo68589y() {
        if (mo68388b() == null || mo68388b().f118491T0 == null) {
            Log.m105920e("MicroMsg.WebViewMenuHelper", "getShareFuncFlag params failed");
            return -1;
        }
        JsapiPermissionWrapper c = mo68388b().f118491T0.mo70860c();
        boolean B = mo68568B(c, 21, 1);
        if (mo68568B(c, 23, 2)) {
            B |= true;
        }
        Log.m105925i("MicroMsg.WebViewMenuHelper", "getShareFuncFlag %d", Integer.valueOf(B ? 1 : 0));
        return B;
    }

    /* renamed from: z */
    public void mo68590z() {
        this.f119140m = true;
        ((HashSet) this.f119142o).clear();
        if (mo68388b() instanceof GameWebViewUI) {
            ((HashSet) this.f119142o).add(11);
            ((HashSet) this.f119142o).add(28);
            return;
        }
        ((HashSet) this.f119142o).add(7);
        ((HashSet) this.f119142o).add(11);
        ((HashSet) this.f119142o).add(28);
    }
}
