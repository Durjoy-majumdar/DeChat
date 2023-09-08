package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.RemoteException;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82980n;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.core.C43520v;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e00.C45516n0;
import ea3.C58536w;
import ea3.C7618l;
import fy3.C32226l;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C47268j0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76878h0;
import p248ug.C14184u0;
import p629ny.C76979h;
import qo3.C77407n;
import rx3.C13598b0;
import t83.C48590l;
import wc3.C15133e0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.i */
public final class C44272i implements C45516n0 {

    /* renamed from: a */
    public C77407n f119958a;

    /* renamed from: b */
    public final LruCache<String, Bitmap> f119959b = new LruCache<>(12);

    /* renamed from: c */
    public final HashMap<String, String> f119960c = new HashMap<>();

    /* renamed from: d */
    public C58536w f119961d = new C58536w();

    /* renamed from: e */
    public WeakReference<Context> f119962e;

    /* renamed from: f */
    public WeakReference<BaseWebViewController> f119963f;

    /* renamed from: g */
    public HashMap<String, SparseBooleanArray> f119964g = new HashMap<>();

    /* renamed from: h */
    public final HashMap<String, Integer> f119965h;

    /* renamed from: i */
    public C77407n.C47880p f119966i;

    /* renamed from: j */
    public C11184p0 f119967j;

    /* renamed from: k */
    public final ArrayList<MenuItem> f119968k;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.i$a */
    public static final class C44273a implements C77407n.C12924o {

        /* renamed from: a */
        public final /* synthetic */ C44272i f119969a;

        public C44273a(C44272i iVar) {
            this.f119969a = iVar;
        }

        /* renamed from: a */
        public final void mo2362a() {
            this.f119969a.f119961d.f167570b = 1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.i$b */
    public static final class C44274b implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C44272i f119970d;

        public C44274b(C44272i iVar) {
            this.f119970d = iVar;
        }

        public void onViewAttachedToWindow(View view) {
            C87412m.m108594g(view, "view");
        }

        public void onViewDetachedFromWindow(View view) {
            C87412m.m108594g(view, "v");
            this.f119970d.f119961d.f167573e = System.currentTimeMillis();
            C44272i iVar = this.f119970d;
            iVar.f119961d.mo83444a(iVar.mo68975e());
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.i$c */
    public static final class C44275c implements C76878h0 {

        /* renamed from: a */
        public final /* synthetic */ C44272i f119971a;

        public C44275c(C44272i iVar) {
            this.f119971a = iVar;
        }

        /* renamed from: a */
        public final void mo6974a(ImageView imageView, ImageView imageView2, MenuItem menuItem) {
            String str = menuItem.getTitle() + "";
            if (!Util.isNullOrNil(((C76875f0) menuItem).f224730y)) {
                try {
                    String mr = this.f119971a.mo68976f().mo67731m().mo68142mr(((C76875f0) menuItem).f224730y);
                    C87412m.m108593f(mr, "controller.invoker.getHeadImgPath(menuItem.webUrl)");
                    Bitmap a = C7618l.f25900a.mo8750a(mr);
                    if (a != null) {
                        Bitmap roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(a, true, ((float) a.getWidth()) * 0.1f);
                        imageView.setVisibility(8);
                        imageView2.setImageBitmap(roundedCornerBitmap);
                        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                        this.f119971a.f119959b.put(str, roundedCornerBitmap);
                    }
                } catch (RemoteException e) {
                    Log.m105928w("MicroMsg.HalfScreenWebViewMenuHelper", "handle share to recent friends, ex = " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.i$d */
    public static final class C44276d implements C47268j0 {

        /* renamed from: a */
        public final /* synthetic */ C44272i f119972a;

        public C44276d(C44272i iVar) {
            this.f119972a = iVar;
        }

        /* renamed from: a */
        public final void mo7130a(TextView textView, MenuItem menuItem) {
            CharSequence charSequence;
            String str = menuItem.getTitle() + "";
            if (textView == null) {
                return;
            }
            if (!(menuItem instanceof C76875f0) || (charSequence = ((C76875f0) menuItem).f224719n) == null) {
                String str2 = this.f119972a.f119960c.get(str);
                if (Util.isNullOrNil(str2)) {
                    this.f119972a.getClass();
                    textView.setText(str);
                    return;
                }
                textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f119972a.mo68975e(), str2, textView.getTextSize()));
                return;
            }
            C44272i iVar = this.f119972a;
            String obj = charSequence.toString();
            iVar.getClass();
            textView.setText(obj);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.i$e */
    public static final class C44277e implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C44272i f119973d;

        /* renamed from: e */
        public final /* synthetic */ JsapiPermissionWrapper f119974e;

        public C44277e(C44272i iVar, JsapiPermissionWrapper jsapiPermissionWrapper) {
            this.f119973d = iVar;
            this.f119974e = jsapiPermissionWrapper;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            Context e = this.f119973d.mo68975e();
            Activity activity = e instanceof Activity ? (Activity) e : null;
            boolean z = false;
            if (activity != null && activity.isFinishing()) {
                z = true;
            }
            if (!z) {
                this.f119973d.getClass();
                e0Var.clear();
                if (C44272i.m48558b(this.f119973d, this.f119974e, 21) && this.f119973d.mo68974d(1)) {
                    e0Var.mo107150j(1, this.f119973d.mo68975e().getString(C0966R.string.hre), C0966R.raw.icons_filled_share, this.f119973d.mo68975e().getResources().getColor(C0966R.color.f2939n), C44272i.m48559c(this.f119973d, this.f119974e, 21));
                    if (!C44272i.m48559c(this.f119973d, this.f119974e, 21)) {
                        Context e2 = this.f119973d.mo68975e();
                        BaseWebViewController f = this.f119973d.mo68976f();
                        C44272i iVar = this.f119973d;
                        C77407n nVar = iVar.f119958a;
                        C58536w wVar = iVar.f119961d;
                        iVar.getClass();
                        C87412m.m108594g(wVar, "recentForwardReporter");
                        if (nVar != null) {
                            C15133e0 Ct0 = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0();
                            nVar.f225778n = new C44245d(Ct0, e2, nVar, f, wVar, (View) null);
                            nVar.f225789s = new C44251e(Ct0, wVar, (C32226l<? super String, C13598b0>) null, f);
                            nVar.f225791t = new C44254f(Ct0, nVar);
                        }
                    }
                }
                if (C44272i.m48558b(this.f119973d, this.f119974e, 23) && this.f119973d.mo68974d(2)) {
                    e0Var.mo107150j(2, this.f119973d.mo68975e().getString(C0966R.string.hrf), C0966R.raw.bottomsheet_icon_moment, 0, C44272i.m48559c(this.f119973d, this.f119974e, 23));
                }
                C77407n nVar2 = this.f119973d.f119958a;
                C87412m.m108591d(nVar2);
                nVar2.mo107564i();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.i$f */
    public static final class C44278f implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C44272i f119975d;

        /* renamed from: e */
        public final /* synthetic */ JsapiPermissionWrapper f119976e;

        public C44278f(C44272i iVar, JsapiPermissionWrapper jsapiPermissionWrapper) {
            this.f119975d = iVar;
            this.f119976e = jsapiPermissionWrapper;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            Context e = this.f119975d.mo68975e();
            Activity activity = e instanceof Activity ? (Activity) e : null;
            boolean z = true;
            if (activity == null || !activity.isFinishing()) {
                z = false;
            }
            if (!z) {
                e0Var.clear();
                C43520v.C43521b bVar = C43520v.f117665a;
                if (C14184u0.m13519a() && C44272i.m48558b(this.f119975d, this.f119976e, 44) && this.f119975d.mo68974d(6)) {
                    e0Var.mo107151k(6, this.f119975d.mo68975e().getString(C0966R.string.lle), C0966R.raw.icons_outlined_link, C44272i.m48559c(this.f119975d, this.f119976e, 44));
                }
                for (MenuItem t : this.f119975d.f119968k) {
                    e0Var.mo107174t(t);
                }
                C77407n nVar = this.f119975d.f119958a;
                if (nVar != null) {
                    nVar.mo107564i();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.i$g */
    public static final class C44279g implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ C44272i f119977a;

        public C44279g(C44272i iVar) {
            this.f119977a = iVar;
        }

        public final void onDismiss() {
            C44272i iVar = this.f119977a;
            iVar.f119961d.f167570b = 1;
            C77407n.C47880p pVar = iVar.f119966i;
            if (pVar != null) {
                pVar.onDismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.i$h */
    public static final class C44280h implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C44272i f119978d;

        public C44280h(C44272i iVar) {
            this.f119978d = iVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Context e = this.f119978d.mo68975e();
            Activity activity = e instanceof Activity ? (Activity) e : null;
            if (!(activity != null && activity.isFinishing())) {
                if (menuItem.getItemId() == 1) {
                    this.f119978d.f119961d.f167570b = 2;
                } else {
                    this.f119978d.f119961d.f167570b = 4;
                }
                Log.m105925i("MicroMsg.HalfScreenWebViewMenuHelper", "onMMMenuItemSelected %d", Integer.valueOf(menuItem.getItemId()));
                int itemId = menuItem.getItemId();
                if (itemId == 1) {
                    C48590l g0 = this.f119978d.mo68976f().mo67720g0();
                    if (g0 != null) {
                        g0.mo73243l("sendAppMessage", true);
                        g0.mo73237f0((HashMap<String, String>) null, 0);
                    }
                } else if (itemId == 2) {
                    C48590l g05 = this.f119978d.mo68976f().mo67720g0();
                    if (g05 != null) {
                        g05.mo73243l(C82980n.NAME, true);
                        g05.mo73238g0(0, (HashMap<String, String>) null, 0);
                    }
                } else if (itemId != 6) {
                    C11184p0 p0Var = this.f119978d.f119967j;
                    if (p0Var != null) {
                        p0Var.onMMMenuItemSelected(menuItem, i);
                    }
                } else {
                    C44272i iVar = this.f119978d;
                    String l0 = iVar.mo68976f().mo67730l0();
                    if (l0 != null) {
                        ClipboardHelper.setText(l0);
                        Toast.makeText(iVar.mo68975e(), iVar.mo68975e().getString(C0966R.string.llf), 0).show();
                    }
                }
            }
        }
    }

    public C44272i() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        this.f119965h = hashMap;
        this.f119968k = new ArrayList<>();
        hashMap.clear();
        hashMap.put("menuItem:share:appMessage", 1);
        hashMap.put("menuItem:share:timeline", 2);
        hashMap.put("menuItem:copyUrl", 6);
    }

    /* renamed from: b */
    public static final boolean m48558b(C44272i iVar, JsapiPermissionWrapper jsapiPermissionWrapper, int i) {
        iVar.getClass();
        if (jsapiPermissionWrapper == null) {
            return false;
        }
        int d = jsapiPermissionWrapper.mo69443d(i);
        return d == 1 || d == 10;
    }

    /* renamed from: c */
    public static final boolean m48559c(C44272i iVar, JsapiPermissionWrapper jsapiPermissionWrapper, int i) {
        iVar.getClass();
        return jsapiPermissionWrapper != null && jsapiPermissionWrapper.mo69443d(i) == 10;
    }

    /* renamed from: a */
    public boolean mo68973a(JsapiPermissionWrapper jsapiPermissionWrapper, int i, int i2) {
        return jsapiPermissionWrapper != null && jsapiPermissionWrapper.mo69443d(i) == 1 && mo68974d(i2);
    }

    /* renamed from: d */
    public final boolean mo68974d(int i) {
        SparseBooleanArray sparseBooleanArray = this.f119964g.get(mo68976f().f117553a.getUrl());
        return sparseBooleanArray == null || !sparseBooleanArray.get(i, false);
    }

    /* renamed from: e */
    public final Context mo68975e() {
        WeakReference<Context> weakReference = this.f119962e;
        Context context = weakReference != null ? weakReference.get() : null;
        C87412m.m108591d(context);
        return context;
    }

    /* renamed from: f */
    public final BaseWebViewController mo68976f() {
        WeakReference<BaseWebViewController> weakReference = this.f119963f;
        BaseWebViewController baseWebViewController = weakReference != null ? weakReference.get() : null;
        C87412m.m108591d(baseWebViewController);
        return baseWebViewController;
    }

    /* renamed from: g */
    public final void mo68977g() {
        C77407n nVar = this.f119958a;
        if (nVar != null) {
            if (nVar.mo107563h()) {
                C77407n nVar2 = this.f119958a;
                C87412m.m108591d(nVar2);
                nVar2.mo107572p();
            }
            C77407n nVar3 = this.f119958a;
            C87412m.m108591d(nVar3);
            nVar3.mo107565j();
            this.f119958a = null;
        }
        this.f119966i = null;
    }

    /* renamed from: h */
    public final void mo68978h() {
        C77407n nVar;
        Window c;
        View decorView;
        if (this.f119962e != null && this.f119963f != null) {
            C77407n nVar2 = this.f119958a;
            if (!(nVar2 != null && nVar2.mo107563h())) {
                this.f119958a = new C77407n(mo68975e(), 0, true);
            }
            this.f119961d.f167572d = System.currentTimeMillis();
            C77407n nVar3 = this.f119958a;
            if (nVar3 != null) {
                nVar3.f225802y = new C44273a(this);
            }
            if (!(nVar3 == null || (c = nVar3.mo107558c()) == null || (decorView = c.getDecorView()) == null)) {
                decorView.addOnAttachStateChangeListener(new C44274b(this));
            }
            C77407n nVar4 = this.f119958a;
            if (nVar4 != null) {
                nVar4.f225805z = new C44275c(this);
            }
            if (nVar4 != null) {
                nVar4.f225725D = new C44276d(this);
            }
            C44280h hVar = new C44280h(this);
            if (nVar4 != null) {
                nVar4.f225782p = hVar;
            }
            if (nVar4 != null) {
                nVar4.f225787r = hVar;
            }
            JsapiPermissionWrapper c2 = mo68976f().f117539M.mo70860c();
            C87412m.m108593f(c2, "controller.wvPerm.jsPerm");
            C77407n nVar5 = this.f119958a;
            if (nVar5 != null) {
                nVar5.f225771i = new C44277e(this, c2);
            }
            if (nVar5 != null) {
                nVar5.f225773j = new C44278f(this, c2);
            }
            if (nVar5 != null) {
                nVar5.f225761d = new C44279g(this);
            }
            String currentUrl = mo68976f().getCurrentUrl();
            if (currentUrl == null) {
                currentUrl = mo68976f().mo63683n0();
            }
            if (!Util.isNullOrNil(currentUrl)) {
                String host = Uri.parse(currentUrl).getHost();
                String string = mo68975e().getString(C0966R.string.lga, new Object[]{host});
                C87412m.m108593f(string, "context.getString(com.te…iew_logo_url, domainName)");
                if (!Util.isNullOrNil(host) && (nVar = this.f119958a) != null) {
                    nVar.mo107568m(string, 1, 0);
                }
            } else {
                C77407n nVar6 = this.f119958a;
                if (nVar6 != null) {
                    nVar6.mo107568m(" ", 1, 0);
                }
            }
            try {
                C77407n nVar7 = this.f119958a;
                if (nVar7 != null) {
                    nVar7.mo107573q();
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.HalfScreenWebViewMenuHelper", "tryShow ex %s", e.getMessage());
            }
            if (mo68976f().mo67720g0() != null) {
                mo68976f().mo67720g0().mo73222S("");
            }
        }
    }
}
