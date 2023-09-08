package com.tencent.p014mm.plugin.finder.webview;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.MenuItem;
import android.view.View;
import android.webkit.URLUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CancelRecogImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.p136ui.widget.bottomsheet.ViewTitleWithAnimation;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.CookieManager;
import com.tencent.xweb.WebView;
import di3.C86312j;
import e00.C45519s0;
import ea3.C45591h;
import ea3.C45601r;
import eb0.C86493v0;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import p200lx.C46896e0;
import p200lx.C46897s;
import p200lx.C46900z;
import p200lx.C61416x;
import p248ug.C52570c0;
import p823sg.C48379o;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper */
public class WebViewLongClickHelper {

    /* renamed from: p */
    public static long f111997p = 0;

    /* renamed from: q */
    public static IListener f111998q;

    /* renamed from: a */
    public ArrayList<ImageQBarDataBean> f111999a = new ArrayList<>();

    /* renamed from: b */
    public String f112000b;

    /* renamed from: c */
    public WebView.HitTestResult f112001c;

    /* renamed from: d */
    public WebView.HitTestResult f112002d;

    /* renamed from: e */
    public C45591h f112003e;

    /* renamed from: f */
    public C77407n f112004f;

    /* renamed from: g */
    public C46900z f112005g;

    /* renamed from: h */
    public C45601r f112006h;

    /* renamed from: i */
    public String f112007i = "";

    /* renamed from: j */
    public HashMap<String, Long> f112008j = new HashMap<>();

    /* renamed from: k */
    public Long f112009k = 0L;

    /* renamed from: l */
    public Long f112010l = 0L;

    /* renamed from: m */
    public Long f112011m = 0L;

    /* renamed from: n */
    public WeakReference<C41650x> f112012n;

    /* renamed from: o */
    public C45591h.C45595d f112013o = new C41611a();

    /* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$a */
    public class C41611a implements C45591h.C45595d {
        public C41611a() {
        }

        /* renamed from: a */
        public void mo64787a(String str) {
            if (!WebViewLongClickHelper.this.mo64771h()) {
                Log.m105924i("MicroMsg.WebViewLongClickHelper", "onCaptureFinish:" + str);
                long currentTimeMillis = System.currentTimeMillis();
                WebViewLongClickHelper.f111997p = currentTimeMillis;
                WebViewLongClickHelper.this.f112008j.put(str, Long.valueOf(currentTimeMillis));
                XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new ScanImageData(str, WebViewLongClickHelper.f111997p, WebViewLongClickHelper.this.mo64769f().getTouchX().floatValue(), WebViewLongClickHelper.this.mo64769f().getTouchY().floatValue(), WebViewLongClickHelper.this.mo64769f().getWebView().getMeasuredWidth(), WebViewLongClickHelper.this.mo64769f().getWebView().getMeasuredHeight()), C41618h.class, new C41617g(new WeakReference(WebViewLongClickHelper.this), str));
                WebViewLongClickHelper.this.f112011m = Long.valueOf(System.currentTimeMillis());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$b */
    public class C41612b implements C46900z.C46901a {
        public C41612b() {
        }

        /* renamed from: a */
        public void mo64788a() {
            C77407n nVar = WebViewLongClickHelper.this.f112004f;
            if (nVar != null && nVar.mo107563h()) {
                WebViewLongClickHelper webViewLongClickHelper = WebViewLongClickHelper.this;
                webViewLongClickHelper.getClass();
                MMHandlerThread.postToMainThread(new C41629e0(webViewLongClickHelper));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$c */
    public class C41613c implements C11182m0 {
        public C41613c() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            boolean z;
            WebViewLongClickHelper webViewLongClickHelper = WebViewLongClickHelper.this;
            webViewLongClickHelper.getClass();
            try {
                z = webViewLongClickHelper.mo64769f().getInvoke().mo68094Fu();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WebViewLongClickHelper", "get has setuin failed : %s", e.getMessage());
                z = false;
            }
            boolean e2 = webViewLongClickHelper.mo64769f().getPerm().mo70859b().mo69434e();
            boolean a = webViewLongClickHelper.mo64769f().getPerm().mo70859b().mo69429a();
            Log.m105925i("MicroMsg.WebViewLongClickHelper", "installMenuItems hasSetAcc = %b, canShareImage = %b, canFavImage = %b", Boolean.valueOf(z), Boolean.valueOf(e2), Boolean.valueOf(a));
            ArrayList arrayList = new ArrayList();
            if (z && e2) {
                arrayList.add(new C41616f(1, webViewLongClickHelper.mo64769f().getContext().getString(C0966R.string.hre)));
            }
            arrayList.add(new C41616f(2, webViewLongClickHelper.mo64767d().getString(C0966R.string.iaq)));
            if (z && a) {
                arrayList.add(new C41616f(3, webViewLongClickHelper.mo64767d().getString(C0966R.string.f361137hk2)));
            }
            if (!((C52570c0) C86709a0.m107533q(C52570c0.class)).mo58182e()) {
                arrayList.add(new C41616f(5, webViewLongClickHelper.mo64767d().getString(C0966R.string.hlo)));
                Bundle bundle = new Bundle();
                try {
                    bundle.putString("web_search_data_ui_image_path", webViewLongClickHelper.f112000b);
                    bundle.putString("web_search_data_ui_image_path_origin_url", webViewLongClickHelper.f112007i);
                    webViewLongClickHelper.mo64769f().getInvoke().mo68145pG(54, bundle, webViewLongClickHelper.mo64769f().getController().mo67719g());
                } catch (RemoteException e3) {
                    Log.m105929w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic exp:%s", e3.getLocalizedMessage());
                }
            }
            if (!Util.isNullOrNil((List) webViewLongClickHelper.f111999a)) {
                arrayList.add(new C41616f(4, ((ScanCodeSheetItemLogic) webViewLongClickHelper.f112005g).mo67082m(webViewLongClickHelper.f111999a)));
            }
            webViewLongClickHelper.f112004f.mo107567l((View) null);
            e0Var.clear();
            for (int i = 0; i < arrayList.size(); i++) {
                C41616f fVar = (C41616f) arrayList.get(i);
                int i2 = fVar.f112031a;
                if (i2 == 4) {
                    C41631g0 g0Var = new C41631g0(webViewLongClickHelper);
                    View c = ((ScanCodeSheetItemLogic) webViewLongClickHelper.f112005g).mo67072c(g0Var, webViewLongClickHelper.f111999a, (ImageQBarDataBean) null, 7);
                    webViewLongClickHelper.f112004f.mo107567l(c);
                    if (c instanceof ViewTitleWithAnimation) {
                        if (arrayList.size() > 1) {
                            ((ViewTitleWithAnimation) c).setTopPaddingVisibility(0);
                        } else {
                            ((ViewTitleWithAnimation) c).setTopPaddingVisibility(8);
                        }
                    }
                } else {
                    e0Var.mo107142f(i2, fVar.f112032b);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$d */
    public class C41614d implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ String f112028d;

        public C41614d(String str) {
            this.f112028d = str;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Class cls = C45519s0.class;
            int itemId = menuItem.getItemId();
            ImageQBarDataBean imageQBarDataBean = null;
            if (itemId == 1) {
                WebViewLongClickHelper.this.mo64766c(1, (ImageQBarDataBean) null);
                WebViewLongClickHelper webViewLongClickHelper = WebViewLongClickHelper.this;
                String str = this.f112028d;
                webViewLongClickHelper.getClass();
                try {
                    ((C45519s0) C86312j.m106911c(cls)).ku0(webViewLongClickHelper.mo64767d(), str, CookieManager.getInstance().getCookie(str), webViewLongClickHelper.mo64768e(), new C41652z(webViewLongClickHelper));
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.WebViewLongClickHelper", "onMenuItemClick fail, ex = " + e.getMessage());
                }
            } else if (itemId == 2) {
                WebViewLongClickHelper webViewLongClickHelper2 = WebViewLongClickHelper.this;
                ArrayList<ImageQBarDataBean> arrayList = webViewLongClickHelper2.f111999a;
                if (arrayList != null && arrayList.size() > 0) {
                    imageQBarDataBean = WebViewLongClickHelper.this.f111999a.get(0);
                }
                webViewLongClickHelper2.mo64766c(2, imageQBarDataBean);
                WebViewLongClickHelper webViewLongClickHelper3 = WebViewLongClickHelper.this;
                String str2 = this.f112028d;
                webViewLongClickHelper3.getClass();
                try {
                    ((C45519s0) C86312j.m106911c(cls)).sg0(webViewLongClickHelper3.mo64767d(), str2, CookieManager.getInstance().getCookie(str2), webViewLongClickHelper3.mo64768e());
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.WebViewLongClickHelper", "save to sdcard failed : %s", e2.getMessage());
                }
            } else if (itemId == 3) {
                WebViewLongClickHelper.this.mo64766c(3, (ImageQBarDataBean) null);
                WebViewLongClickHelper webViewLongClickHelper4 = WebViewLongClickHelper.this;
                String str3 = this.f112028d;
                webViewLongClickHelper4.getClass();
                try {
                    boolean e3 = webViewLongClickHelper4.mo64768e();
                    String replaceAll = str3.replaceAll("tp=webp", "");
                    ((C45519s0) C86312j.m106911c(cls)).ku0(webViewLongClickHelper4.mo64767d(), replaceAll, CookieManager.getInstance().getCookie(replaceAll), e3, new C41620a0(webViewLongClickHelper4));
                } catch (Exception e4) {
                    Log.m105920e("MicroMsg.WebViewLongClickHelper", "onMenuItemClick fail, ex = " + e4.getMessage());
                }
            } else if (itemId == 5) {
                WebViewLongClickHelper.this.mo64766c(7, (ImageQBarDataBean) null);
                WebViewLongClickHelper webViewLongClickHelper5 = WebViewLongClickHelper.this;
                String str4 = this.f112028d;
                webViewLongClickHelper5.getClass();
                if (Util.isNullOrNil(str4)) {
                    Log.m105928w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic mResultOfImageUrl nil");
                    return;
                }
                try {
                    ((C45519s0) C86312j.m106911c(cls)).ku0(webViewLongClickHelper5.mo64769f().getContext(), str4, CookieManager.getInstance().getCookie(str4), webViewLongClickHelper5.mo64768e(), new C41626b0(webViewLongClickHelper5));
                } catch (Exception e5) {
                    Log.m105929w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic Exception:%s", e5.getLocalizedMessage());
                }
                Log.m105924i("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$e */
    public class C41615e implements C77407n.C47880p {
        public C41615e() {
        }

        public void onDismiss() {
            WebViewLongClickHelper.this.mo64766c(5, (ImageQBarDataBean) null);
            WebViewLongClickHelper webViewLongClickHelper = WebViewLongClickHelper.this;
            if (webViewLongClickHelper.f112003e != null && webViewLongClickHelper.mo64769f().getInvoke() != null) {
                try {
                    WebViewLongClickHelper.this.f111999a.clear();
                    ((ScanCodeSheetItemLogic) WebViewLongClickHelper.this.f112005g).mo67083n();
                    WebViewLongClickHelper webViewLongClickHelper2 = WebViewLongClickHelper.this;
                    WebViewLongClickHelper.m44936a(webViewLongClickHelper2, webViewLongClickHelper2.f112003e.f123310c);
                    WebViewLongClickHelper.this.f112003e.mo71114b();
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.WebViewLongClickHelper", "cancel capture failed");
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$f */
    public static final class C41616f {

        /* renamed from: a */
        public final int f112031a;

        /* renamed from: b */
        public final String f112032b;

        public C41616f(int i, String str) {
            this.f112031a = i;
            this.f112032b = str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$g */
    public static class C41617g implements C1256g<ImageQBarData> {

        /* renamed from: d */
        public WeakReference<WebViewLongClickHelper> f112033d;

        /* renamed from: e */
        public String f112034e;

        public C41617g(WeakReference<WebViewLongClickHelper> weakReference, String str) {
            this.f112033d = weakReference;
            this.f112034e = str;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            ImageQBarData imageQBarData = (ImageQBarData) obj;
            WebViewLongClickHelper webViewLongClickHelper = this.f112033d.get();
            if (webViewLongClickHelper == null) {
                Log.m105920e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack helper == null");
            } else if (Util.isNullOrNil(imageQBarData.f112017e) || !imageQBarData.f112017e.equals(this.f112034e)) {
                Log.m105920e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack   path error, data.mImagePath:" + imageQBarData.f112017e + "   path: " + this.f112034e);
            } else {
                if (webViewLongClickHelper.f112008j.containsKey(imageQBarData.f112017e)) {
                    webViewLongClickHelper.f112008j.remove(imageQBarData.f112017e);
                    Log.m105924i("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  remove filePath:" + imageQBarData.f112017e);
                }
                if (!imageQBarData.f112018f) {
                    Log.m105920e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  recog is fail:" + this.f112034e);
                    return;
                }
                webViewLongClickHelper.f112009k = Long.valueOf(System.currentTimeMillis());
                webViewLongClickHelper.f112010l = Long.valueOf(System.currentTimeMillis() - webViewLongClickHelper.f112011m.longValue());
                webViewLongClickHelper.f111999a.clear();
                ArrayList<ImageQBarDataBean> arrayList = imageQBarData.f112016d;
                if (arrayList != null && arrayList.size() > 0) {
                    webViewLongClickHelper.f111999a.add(imageQBarData.f112016d.get(0));
                }
                Log.m105924i("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  :" + webViewLongClickHelper.f111999a.size());
                MMHandlerThread.postToMainThread(new C41629e0(webViewLongClickHelper));
                if (Util.isNullOrNil((List) webViewLongClickHelper.f111999a)) {
                    Log.m105928w("MicroMsg.WebViewLongClickHelper", "processGetWXACodeNickName mImageQBarDataList nil");
                } else if (webViewLongClickHelper.f111999a.size() == 1) {
                    ImageQBarDataBean imageQBarDataBean = webViewLongClickHelper.f111999a.get(0);
                    if (((C61416x) C86312j.m106911c(C61416x.class)).mo72002rO(imageQBarDataBean.f273114e, imageQBarDataBean.f273113d)) {
                        Log.m105924i("MicroMsg.WebViewLongClickHelper", "processGetWXACodeNickName");
                        C46900z zVar = webViewLongClickHelper.f112005g;
                        int i = imageQBarDataBean.f273114e;
                        String str = imageQBarDataBean.f273113d;
                        String str2 = webViewLongClickHelper.f112007i;
                        C46897s.C46898a aVar = new C46897s.C46898a(str);
                        aVar.f126106b = 4;
                        aVar.f126107c = str2;
                        ((ScanCodeSheetItemLogic) zVar).mo67078i(i, aVar);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$h */
    public static class C41618h implements C80883e<ScanImageData, ImageQBarData> {
        public void invoke(Object obj, C1256g gVar) {
            PointF pointF;
            ScanImageData scanImageData = (ScanImageData) obj;
            Log.m105924i("MicroMsg.WebViewLongClickHelper", "RemoteCallbackRecogQBarTask invoke:" + scanImageData.f112019d);
            C40008f fVar = C40008f.f107254d;
            WebViewLongClickHelper$RemoteCallbackRecogQBarTask$1 webViewLongClickHelper$RemoteCallbackRecogQBarTask$1 = new WebViewLongClickHelper$RemoteCallbackRecogQBarTask$1(this, fVar, gVar);
            WebViewLongClickHelper.f111998q = new WebViewLongClickHelper$RemoteCallbackRecogQBarTask$2(this, fVar, gVar, webViewLongClickHelper$RemoteCallbackRecogQBarTask$1);
            C86493v0.C86495c c = C86493v0.m107224d().mo120947c("basescanui@datacenter", true);
            String str = scanImageData.f112019d;
            int i = scanImageData.f112023h;
            int i2 = scanImageData.f112024i;
            float f = scanImageData.f112021f;
            float f2 = scanImageData.f112022g;
            if (str == null) {
                pointF = new PointF(f, f2);
            } else {
                if (i > 0) {
                    f /= (float) i;
                }
                if (i2 > 0) {
                    f2 /= (float) i2;
                }
                pointF = new PointF(f, f2);
            }
            c.mo120962i("key_basescanui_touch_normalize_x", Float.valueOf(pointF.x));
            c.mo120962i("key_basescanui_touch_normalize_y", Float.valueOf(pointF.y));
            RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
            RecogQBarOfImageFileEvent.C40158a aVar = recogQBarOfImageFileEvent.f107731d;
            aVar.f107732a = WebViewLongClickHelper.f111997p;
            aVar.f107733b = scanImageData.f112019d;
            aVar.f107736e = true;
            webViewLongClickHelper$RemoteCallbackRecogQBarTask$1.alive();
            WebViewLongClickHelper.f111998q.alive();
            recogQBarOfImageFileEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$i */
    public static class C41619i implements C80883e<CancelRecogQBarData, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            CancelRecogQBarData cancelRecogQBarData = (CancelRecogQBarData) obj;
            CancelRecogImageFileEvent cancelRecogImageFileEvent = new CancelRecogImageFileEvent();
            CancelRecogImageFileEvent.C40046a aVar = cancelRecogImageFileEvent.f107390d;
            aVar.f107392b = cancelRecogQBarData.f112014d;
            aVar.f107391a = cancelRecogQBarData.f112015e;
            cancelRecogImageFileEvent.publish();
            C86013q1.m106447h(cancelRecogQBarData.f112014d);
            Log.m105924i("MicroMsg.WebViewLongClickHelper", "RemoteCallbackRecogQBarTask invoke:" + cancelRecogQBarData.f112014d);
        }
    }

    static {
        new HashMap();
    }

    public WebViewLongClickHelper(C41650x xVar) {
        this.f112012n = new WeakReference<>(xVar);
        if (mo64769f().getWebView() != null) {
            mo64769f().getWebView().setOnLongClickListener(new C41630f0(this));
        }
        this.f112005g = ((C46896e0) C86312j.m106911c(C46896e0.class)).mo71986Hu(mo64769f().getContext(), new C41612b());
    }

    /* renamed from: a */
    public static void m44936a(WebViewLongClickHelper webViewLongClickHelper, String str) {
        webViewLongClickHelper.getClass();
        Log.m105918d("MicroMsg.WebViewLongClickHelper", "cancelRecogQBar:" + str);
        if (!Util.isNullOrNil(str) && webViewLongClickHelper.f112008j.containsKey(str)) {
            Log.m105924i("MicroMsg.WebViewLongClickHelper", "do cancelRecogQBar:" + str);
            try {
                XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new CancelRecogQBarData(str, webViewLongClickHelper.f112008j.get(str).longValue()), C41619i.class, new C41628d0(webViewLongClickHelper));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WebViewLongClickHelper", e, "", new Object[0]);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0048, code lost:
        if (r5.startsWith(com.tencent.p014mm.sdk.http.HttpWrapperBase.PROTOCAL_HTTP + com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(com.tencent.p014mm.C0966R.string.f360885fm3) + "/s") != false) goto L_0x004a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m44937b(com.tencent.p014mm.plugin.finder.webview.WebViewLongClickHelper r5) {
        /*
            java.lang.String r5 = r5.f112007i
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.webview.WebViewLongClickHelper.m44937b(com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper):int");
    }

    /* renamed from: c */
    public final void mo64766c(int i, ImageQBarDataBean imageQBarDataBean) {
        String str;
        C45601r rVar = this.f112006h;
        if (rVar != null) {
            rVar.f123324b = this.f112007i;
            rVar.f123326d = 40;
            if (imageQBarDataBean != null) {
                rVar.f123325c = true;
                rVar.f123329g = imageQBarDataBean.f273114e == 22 ? "WX_CODE" : "QR_CODE";
                rVar.f123328f = imageQBarDataBean.f273113d;
            }
            if (URLUtil.isDataUrl(this.f112000b)) {
                try {
                    str = C48379o.m53725b(this.f112000b);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.WebViewLongClickHelper", "getSHA1 ex %s", e.getMessage());
                    str = "";
                }
            } else {
                str = WebViewUtilities.doUrlEncode(this.f112000b);
            }
            C45601r rVar2 = this.f112006h;
            rVar2.f123330h = str;
            rVar2.mo71118a(i);
        }
    }

    /* renamed from: d */
    public final Context mo64767d() {
        return mo64769f().getContext();
    }

    /* renamed from: e */
    public final boolean mo64768e() {
        try {
            return mo64769f().getInvoke().isSDCardAvailable();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WebViewLongClickHelper", "onCreateContextMenu fail, ex = " + e.getMessage());
            return false;
        }
    }

    /* renamed from: f */
    public final C41650x mo64769f() {
        return this.f112012n.get();
    }

    /* renamed from: g */
    public final boolean mo64770g() {
        try {
            if (mo64769f().getInvoke() != null) {
                return mo64769f().getInvoke().Ms0();
            }
            Log.m105928w("MicroMsg.WebViewLongClickHelper", "invoker is null");
            return false;
        } catch (RemoteException e) {
            Log.m105920e("MicroMsg.WebViewLongClickHelper", "unable get config for Scan QRCode" + e.getMessage());
            return false;
        }
    }

    /* renamed from: h */
    public final boolean mo64771h() {
        return mo64769f() == null || mo64769f().isRelease();
    }

    /* renamed from: i */
    public final boolean mo64772i(String str) {
        if (mo64771h()) {
            return false;
        }
        if (!mo64768e()) {
            return true;
        }
        this.f112000b = str;
        if (this.f112004f == null) {
            this.f112004f = new C77407n(mo64769f().getContext(), 1, false);
        }
        C77407n nVar = this.f112004f;
        nVar.f225771i = new C41613c();
        nVar.f225782p = new C41614d(str);
        nVar.f225761d = new C41615e();
        if (!mo64769f().isRelease()) {
            this.f112004f.mo107573q();
        }
        return this.f112004f.mo107563h();
    }

    /* renamed from: j */
    public final boolean mo64773j(WebView.HitTestResult hitTestResult) {
        boolean i = mo64772i(hitTestResult.getExtra());
        if (Util.isNullOrNil((List) this.f111999a) && mo64769f().getPerm().mo70859b().mo69432d() && mo64770g()) {
            this.f112002d = hitTestResult;
            C45591h hVar = new C45591h();
            this.f112003e = hVar;
            hVar.mo71113a(mo64769f().getWebView(), this.f112013o);
        }
        return i;
    }

    /* renamed from: k */
    public final boolean mo64774k(WebView.HitTestResult hitTestResult) {
        boolean i = mo64772i(hitTestResult.getExtra());
        if (Util.isNullOrNil((List) this.f111999a) && mo64769f().getPerm().mo70859b().mo69432d() && mo64770g()) {
            this.f112001c = hitTestResult;
            C45591h hVar = new C45591h();
            this.f112003e = hVar;
            hVar.mo71113a(mo64769f().getWebView(), this.f112013o);
        }
        return i;
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$CancelRecogQBarData */
    public static class CancelRecogQBarData implements Parcelable {
        public static final Parcelable.Creator<CancelRecogQBarData> CREATOR = new C41608a();

        /* renamed from: d */
        public String f112014d;

        /* renamed from: e */
        public long f112015e;

        /* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$CancelRecogQBarData$a */
        public class C41608a implements Parcelable.Creator<CancelRecogQBarData> {
            public Object createFromParcel(Parcel parcel) {
                return new CancelRecogQBarData(parcel);
            }

            public Object[] newArray(int i) {
                return new CancelRecogQBarData[i];
            }
        }

        public CancelRecogQBarData(String str, long j) {
            this.f112014d = str;
            this.f112015e = j;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f112014d);
            parcel.writeLong(this.f112015e);
        }

        public CancelRecogQBarData(Parcel parcel) {
            this.f112014d = parcel.readString();
            this.f112015e = parcel.readLong();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$ImageQBarData */
    public static class ImageQBarData implements Parcelable {
        public static final Parcelable.Creator<ImageQBarData> CREATOR = new C41609a();

        /* renamed from: d */
        public ArrayList<ImageQBarDataBean> f112016d;

        /* renamed from: e */
        public String f112017e;

        /* renamed from: f */
        public boolean f112018f;

        /* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$ImageQBarData$a */
        public class C41609a implements Parcelable.Creator<ImageQBarData> {
            public Object createFromParcel(Parcel parcel) {
                return new ImageQBarData(parcel);
            }

            public Object[] newArray(int i) {
                return new ImageQBarData[i];
            }
        }

        public ImageQBarData(ArrayList<ImageQBarDataBean> arrayList, String str, Boolean bool) {
            this.f112016d = arrayList;
            this.f112017e = str;
            this.f112018f = bool.booleanValue();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.f112016d);
            parcel.writeString(this.f112017e);
            parcel.writeByte(this.f112018f ? (byte) 1 : 0);
        }

        public ImageQBarData(Parcel parcel) {
            this.f112016d = parcel.createTypedArrayList(ImageQBarDataBean.CREATOR);
            this.f112017e = parcel.readString();
            this.f112018f = parcel.readByte() != 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$ScanImageData */
    public static class ScanImageData implements Parcelable {
        public static final Parcelable.Creator<ScanImageData> CREATOR = new C41610a();

        /* renamed from: d */
        public String f112019d;

        /* renamed from: e */
        public long f112020e;

        /* renamed from: f */
        public float f112021f;

        /* renamed from: g */
        public float f112022g;

        /* renamed from: h */
        public int f112023h;

        /* renamed from: i */
        public int f112024i;

        /* renamed from: com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$ScanImageData$a */
        public class C41610a implements Parcelable.Creator<ScanImageData> {
            public Object createFromParcel(Parcel parcel) {
                return new ScanImageData(parcel);
            }

            public Object[] newArray(int i) {
                return new ScanImageData[i];
            }
        }

        public ScanImageData(String str, long j, float f, float f2, int i, int i2) {
            this.f112019d = str;
            this.f112020e = j;
            this.f112021f = f;
            this.f112022g = f2;
            this.f112023h = i;
            this.f112024i = i2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f112019d);
            parcel.writeLong(this.f112020e);
            parcel.writeFloat(this.f112021f);
            parcel.writeFloat(this.f112022g);
            parcel.writeInt(this.f112023h);
            parcel.writeInt(this.f112024i);
        }

        public ScanImageData(Parcel parcel) {
            this.f112019d = parcel.readString();
            this.f112020e = parcel.readLong();
            this.f112021f = parcel.readFloat();
            this.f112022g = parcel.readFloat();
            this.f112023h = parcel.readInt();
            this.f112024i = parcel.readInt();
        }
    }
}
