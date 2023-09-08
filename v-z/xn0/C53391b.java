package xn0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C40478h;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.plugin.webview.stub.WebviewScanImageActivity;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6686h2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.CookieManager;
import com.tencent.xweb.WebView;
import di3.C86312j;
import e00.C45519s0;
import ea3.C45591h;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import nj3.C11184p0;
import p200lx.C46896e0;
import p200lx.C46900z;
import p235sm.C48419l0;
import p910lj.C76701a;
import te3.C51216sa2;

/* renamed from: xn0.b */
public final class C53391b extends C53389a implements View.OnCreateContextMenuListener {

    /* renamed from: h */
    public C45082x0 f150234h;

    /* renamed from: i */
    public String f150235i;

    /* renamed from: j */
    public String f150236j;

    /* renamed from: n */
    public int f150237n;

    /* renamed from: o */
    public int f150238o;

    /* renamed from: p */
    public C45591h f150239p;

    /* renamed from: q */
    public C46900z f150240q;

    /* renamed from: r */
    public C45591h.C45595d f150241r = new C53399f();

    /* renamed from: xn0.b$a */
    public class C53392a implements C46900z.C46902b {
        public C53392a() {
        }

        /* renamed from: a */
        public void mo72110a(String str, C51216sa2 sa22) {
            C45082x0 x0Var = C53391b.this.f150234h;
            if (x0Var != null && x0Var.f122286e.mo107563h()) {
                C53391b bVar = C53391b.this;
                bVar.f150228d.runOnUiThread(new C53401c(bVar));
            }
        }
    }

    /* renamed from: xn0.b$b */
    public class C53393b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: xn0.b$b$a */
        public class C53394a implements C6686h2.C6687a {
            public C53394a() {
            }

            /* renamed from: a */
            public void mo7610a(String str) {
                if (Util.isNullOrNil(str)) {
                    Log.m105928w("MicroMsg.AppBrand.HTMLViewScanHelper", "share image to friend fail, imgPath is null");
                    return;
                }
                C53391b bVar = C53391b.this;
                bVar.getClass();
                try {
                    bVar.f150230f.mo68153zr(str, bVar.f150228d.getController().getBinderID(), (Bundle) null);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrand.HTMLViewScanHelper", "sendImgToFriend(path:%s) ipc forMsgRetransmit get exception:%s", str, e);
                }
            }
        }

        public C53393b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                ((C45519s0) C86312j.m106911c(C45519s0.class)).ku0(C53391b.this.mo74033a(), C53391b.this.f150236j, CookieManager.getInstance().getCookie(C53391b.this.f150236j), C53391b.this.f150230f.isSDCardAvailable(), new C53394a());
                return true;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AppBrand.HTMLViewScanHelper", "onMenuItemClick fail, ex = " + e.getMessage());
                return true;
            }
        }
    }

    /* renamed from: xn0.b$c */
    public class C53395c implements MenuItem.OnMenuItemClickListener {
        public C53395c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            boolean z;
            try {
                z = C53391b.this.f150230f.isSDCardAvailable();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AppBrand.HTMLViewScanHelper", "onMenuItemClick fail, ex = " + e.getMessage());
                z = false;
            }
            try {
                Log.m105925i("MicroMsg.AppBrand.HTMLViewScanHelper", "onMenuItemClick saveImage2SD with url[%s]", C53391b.this.f150236j);
                ((C45519s0) C86312j.m106911c(C45519s0.class)).sg0(C53391b.this.mo74033a(), C53391b.this.f150236j, CookieManager.getInstance().getCookie(C53391b.this.f150236j), z);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrand.HTMLViewScanHelper", "save to sdcard failed : %s", e2.getMessage());
            }
            return true;
        }
    }

    /* renamed from: xn0.b$d */
    public class C53396d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: xn0.b$d$a */
        public class C53397a implements C6686h2.C6687a {
            public C53397a() {
            }

            /* renamed from: a */
            public void mo7610a(String str) {
                C53391b bVar = C53391b.this;
                bVar.getClass();
                try {
                    if (bVar.f150230f.mo68120aI(str) == 0) {
                        C76701a.makeText(bVar.mo74033a(), (CharSequence) bVar.mo74033a().getString(C0966R.string.cph), 0).show();
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.AppBrand.HTMLViewScanHelper", "favoriteUrl fail, ex = " + e.getMessage());
                }
            }
        }

        public C53396d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                boolean isSDCardAvailable = C53391b.this.f150230f.isSDCardAvailable();
                String replaceAll = C53391b.this.f150236j.replaceAll("tp=webp", "");
                ((C45519s0) C86312j.m106911c(C45519s0.class)).ku0(C53391b.this.mo74033a(), replaceAll, CookieManager.getInstance().getCookie(replaceAll), isSDCardAvailable, new C53397a());
                return true;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AppBrand.HTMLViewScanHelper", "onMenuItemClick fail, ex = " + e.getMessage());
                return true;
            }
        }
    }

    /* renamed from: xn0.b$e */
    public class C53398e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f150248d;

        /* renamed from: e */
        public final /* synthetic */ String f150249e;

        public C53398e(String str, String str2) {
            this.f150248d = str;
            this.f150249e = str2;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/webview/bwc/HTMLViewScanHelper$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C45082x0 x0Var = C53391b.this.f150234h;
            if (x0Var != null && x0Var.f122286e.mo107563h()) {
                C53391b.this.f150234h.mo70435a();
            }
            C53391b bVar = C53391b.this;
            String str = this.f150248d;
            String b = bVar.mo74035b();
            String str2 = this.f150249e;
            C53391b bVar2 = C53391b.this;
            int i = bVar2.f150237n;
            int i2 = bVar2.f150238o;
            if (str != null) {
                Intent intent = new Intent();
                intent.setClass(bVar.mo74033a(), WebviewScanImageActivity.class);
                intent.putExtra("key_string_for_scan", str);
                intent.putExtra("key_string_for_url", b);
                intent.putExtra("key_string_for_image_url", str2);
                intent.putExtra("key_codetype_for_scan", i);
                intent.putExtra("key_codeversion_for_scan", i2);
                C40478h hVar = bVar.f150228d;
                if (hVar != null && !Util.isNullOrNil(hVar.getAppId())) {
                    intent.putExtra("key_string_for_wxapp_id", bVar.f150228d.getAppId());
                }
                intent.putExtra("geta8key_scene", 44);
                C40478h hVar2 = bVar.f150228d;
                if (!(hVar2 == null || hVar2.getPageView() == null)) {
                    intent.putExtra("wxappPathWithQuery", bVar.f150228d.getPageView().mo116163R0());
                }
                Context a = bVar.mo74033a();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context = a;
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/webview/bwc/HTMLViewScanHelper", "reqDealQBarResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                a.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/appbrand/jsapi/webview/bwc/HTMLViewScanHelper", "reqDealQBarResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C83780d1 pageView = C53391b.this.f150228d.getPageView();
            C53391b bVar3 = C53391b.this;
            ((C48419l0) C86312j.m106911c(C48419l0.class)).mo73107Ma(pageView, true, bVar3.f150237n, bVar3.f150235i, true, true, bVar3.mo74035b());
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/webview/bwc/HTMLViewScanHelper$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xn0.b$f */
    public class C53399f implements C45591h.C45595d {
        public C53399f() {
        }

        /* renamed from: a */
        public void mo64787a(String str) {
            try {
                C43791l lVar = C53391b.this.f150230f;
                if (lVar != null) {
                    lVar.mo68099Kn(str, new int[]{3}, 0, 0);
                    return;
                }
                Log.m105924i("MicroMsg.AppBrand.HTMLViewScanHelper", "viewCaptureCallback, invoker is null");
            } catch (RemoteException unused) {
                Log.m105920e("MicroMsg.AppBrand.HTMLViewScanHelper", "recog failed");
            }
        }
    }

    public C53391b(C40478h hVar) {
        super(hVar);
        this.f150240q = ((C46896e0) C86312j.m106911c(C46896e0.class)).mo71989dd(mo74033a(), new C53392a(), hVar.getPageView().getLifecycleOwner());
        try {
            C45082x0 x0Var = new C45082x0(mo74033a());
            this.f150234h = x0Var;
            x0Var.mo70438d(hVar.getWebView(), this, (C11184p0) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.HTMLViewScanHelper", e, "<init> initMenu() get exception", new Object[0]);
            this.f150234h = null;
        }
    }

    /* renamed from: b */
    public final String mo74035b() {
        return ((C53441u) this.f150228d.getController()).getCurrentUrl();
    }

    /* renamed from: c */
    public final boolean mo74036c(ContextMenu contextMenu, String str) {
        boolean z;
        boolean z2;
        try {
            z = this.f150230f.isSDCardAvailable();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.AppBrand.HTMLViewScanHelper", "onCreateContextMenu fail, ex = " + e.getMessage());
            z = false;
        }
        if (!z || this.f150231g == null) {
            return true;
        }
        contextMenu.setHeaderTitle(C0966R.string.lm8);
        try {
            z2 = this.f150230f.mo68094Fu();
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.AppBrand.HTMLViewScanHelper", "get has setuin failed : %s", e2.getMessage());
            z2 = false;
        }
        boolean e3 = this.f150231g.mo70859b().mo69434e();
        boolean a = this.f150231g.mo70859b().mo69429a();
        Log.m105925i("MicroMsg.AppBrand.HTMLViewScanHelper", "hasSetAcc = %b, canShareImage = %b, canFavImage = %b", Boolean.valueOf(z2), Boolean.valueOf(e3), Boolean.valueOf(a));
        if (z2 && e3) {
            contextMenu.add(0, 0, 0, mo74033a().getString(C0966R.string.hre)).setOnMenuItemClickListener(new C53393b());
        }
        contextMenu.add(0, 0, 0, mo74033a().getString(C0966R.string.iaq)).setOnMenuItemClickListener(new C53395c());
        if (z2 && a) {
            contextMenu.add(0, 0, 0, mo74033a().getString(C0966R.string.f361137hk2)).setOnMenuItemClickListener(new C53396d());
        }
        this.f150234h.f122286e.mo107567l((View) null);
        String str2 = this.f150235i;
        if (str2 == null) {
            return false;
        }
        C53398e eVar = new C53398e(str2, str);
        this.f150234h.f122286e.mo107567l(((ScanCodeSheetItemLogic) this.f150240q).mo67071b(eVar, this.f150237n, str2, 10));
        ((C48419l0) C86312j.m106911c(C48419l0.class)).mo73107Ma(this.f150228d.getPageView(), true, this.f150237n, this.f150235i, true, false, mo74035b());
        return true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        WebView.HitTestResult hitTestResult;
        if (view instanceof android.webkit.WebView) {
            WebView.HitTestResult hitTestResult2 = this.f150229e.getHitTestResult();
            if (hitTestResult2 != null) {
                if (hitTestResult2.getType() == 5 || hitTestResult2.getType() == 8) {
                    boolean c = mo74036c(contextMenu, hitTestResult2.getExtra());
                    this.f150236j = hitTestResult2.getExtra();
                    if (!c && this.f150231g.mo70859b().mo69432d()) {
                        C45591h hVar = new C45591h();
                        this.f150239p = hVar;
                        hVar.mo71113a(this.f150229e, this.f150241r);
                    }
                }
            }
        } else if ((view instanceof MMWebView) && (hitTestResult = ((MMWebView) view).getHitTestResult()) != null) {
            if (hitTestResult.getType() == 5 || hitTestResult.getType() == 8) {
                boolean c2 = mo74036c(contextMenu, hitTestResult.getExtra());
                this.f150236j = hitTestResult.getExtra();
                if (!c2 && this.f150231g.mo70859b().mo69432d()) {
                    C45591h hVar2 = new C45591h();
                    this.f150239p = hVar2;
                    hVar2.mo71113a(this.f150229e, this.f150241r);
                }
            }
        }
    }
}
