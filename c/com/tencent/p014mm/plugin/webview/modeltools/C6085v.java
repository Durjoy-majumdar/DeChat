package com.tencent.p014mm.plugin.webview.modeltools;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import c70.C0427b;
import com.google.android.gms.common.internal.Constants;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5941l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.CookieManager;
import com.tencent.xweb.GetImageBitmapToFileFinishedCallback;
import di3.C86312j;
import h81.C32735h;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.v */
public class C6085v {

    /* renamed from: a */
    public static long f22417a = 0;

    /* renamed from: b */
    public static int f22418b = -1;

    /* renamed from: c */
    public static int f22419c = -1;

    /* renamed from: d */
    public static boolean f22420d;

    /* renamed from: e */
    public static Map<String, String> f22421e = new HashMap();

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.v$a */
    public class C6086a implements GetImageBitmapToFileFinishedCallback {

        /* renamed from: a */
        public final /* synthetic */ C6087b f22422a;

        /* renamed from: b */
        public final /* synthetic */ String f22423b;

        public C6086a(C6087b bVar, String str) {
            this.f22422a = bVar;
            this.f22423b = str;
        }

        public void onFinishImageBitmapToFile(int i, String str, String str2, int i2, int i3, String str3) {
            Log.m105925i("MicroMsg.WebViewPreviewImgHelper", "onFinishImageBitmapToFile result %d", Integer.valueOf(i));
            if (C6085v.f22420d) {
                C115669n.INSTANCE.idkeyStat(1059, i == 0 ? 0 : 1, 1, false);
            }
            if (i != 0) {
                C6087b bVar = this.f22422a;
                if (bVar != null) {
                    ((C5941l0.C5942a) bVar).mo6943a();
                    return;
                }
                return;
            }
            ((HashMap) C6085v.f22421e).put(this.f22423b, str2);
            C6087b bVar2 = this.f22422a;
            if (bVar2 != null) {
                ((C5941l0.C5942a) bVar2).mo6944b();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.v$b */
    public interface C6087b {
    }

    /* renamed from: a */
    public static boolean m5950a(String str) {
        if (Util.isNullOrNil(str) || !C86013q1.m106450k(str)) {
            Log.m105924i("MicroMsg.WebViewPreviewImgHelper", "checkCurrentPath path is null");
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        MMBitmapFactory.m98735d(str, options);
        if (options.outWidth <= 1 || options.outHeight <= 1) {
            Log.m105925i("MicroMsg.WebViewPreviewImgHelper", "checkCurrentPath file path invalid: %s", str);
            C115669n.INSTANCE.idkeyStat(1059, 4, 1, false);
            return false;
        }
        C115669n.INSTANCE.idkeyStat(1059, 3, 1, false);
        Log.m105925i("MicroMsg.WebViewPreviewImgHelper", "checkCurrentPath path: %s", str);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01bd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m5951b(android.os.Bundle r17, com.tencent.p014mm.p136ui.widget.MMWebView r18, android.os.Bundle r19, boolean r20) {
        /*
            r1 = r17
            r0 = r19
            java.lang.String r2 = "rawUrl"
            java.lang.String r3 = "preUsername"
            java.lang.String r4 = "preChatName"
            java.lang.String r5 = "cookie"
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = f22417a
            long r6 = r6 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x001a
            return
        L_0x001a:
            java.lang.String r6 = "url"
            java.lang.String r7 = r1.getString(r6)
            java.lang.String r8 = "filePath"
            java.lang.String r8 = r1.getString(r8)
            r9 = 1
            java.lang.String[] r10 = new java.lang.String[r9]
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            java.lang.String r12 = ""
            java.lang.String r13 = "MicroMsg.WebViewPreviewImgHelper"
            r14 = 0
            if (r11 != 0) goto L_0x005e
            android.graphics.BitmapFactory$Options r11 = new android.graphics.BitmapFactory$Options
            r11.<init>()
            r11.inJustDecodeBounds = r9
            android.graphics.Bitmap r11 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r8, r11)
            if (r11 == 0) goto L_0x0055
            java.lang.Object[] r15 = new java.lang.Object[r9]
            java.lang.String r16 = r11.toString()
            r15[r14] = r16
            java.lang.String r9 = "recycle bitmap:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r9, r15)
            r11.recycle()
            r10[r14] = r8
            goto L_0x005f
        L_0x0055:
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r14] = r8
            java.lang.String r8 = "decode fail %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r8, r11)
        L_0x005e:
            r8 = r12
        L_0x005f:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x01bd
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 != 0) goto L_0x01bd
            r10[r14] = r7
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r9 = "nowUrl"
            r8.putExtra(r9, r7)
            java.lang.String r9 = "urlList"
            r8.putExtra(r9, r10)
            r9 = -255(0xffffffffffffff01, float:NaN)
            java.lang.String r10 = "type"
            r8.putExtra(r10, r9)
            java.lang.String r9 = "isFromWebView"
            r10 = 1
            r8.putExtra(r9, r10)
            java.lang.String r9 = "isOuntLink"
            r8.putExtra(r9, r10)
            r9 = 0
            android.os.Bundle r10 = m5952c(r18)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r10 = r10.getString(r5, r9)     // Catch:{ Exception -> 0x00ff }
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ Exception -> 0x00ff }
            if (r11 != 0) goto L_0x00a2
            r8.putExtra(r5, r10)     // Catch:{ Exception -> 0x00ff }
        L_0x00a2:
            if (r0 == 0) goto L_0x00fd
            java.lang.String r5 = r0.getString(r4)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r10 = r0.getString(r3)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r11 = r0.getString(r2)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r12 = r0.getString(r6)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r15 = "getA8KeyScene"
            int r0 = r0.getInt(r15)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r15 = "ImgPreview"
            java.lang.String r15 = eb0.C86493v0.m107223a(r15)     // Catch:{ Exception -> 0x00ff }
            eb0.v0 r9 = eb0.C86493v0.m107224d()     // Catch:{ Exception -> 0x00ff }
            r14 = 1
            eb0.v0$c r9 = r9.mo120947c(r15, r14)     // Catch:{ Exception -> 0x00ff }
            r9.mo120962i(r3, r5)     // Catch:{ Exception -> 0x00ff }
            r9.mo120962i(r4, r10)     // Catch:{ Exception -> 0x00ff }
            r9.mo120962i(r6, r12)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r3 = "Contact_Sub_Scene"
            r4 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00ff }
            r9.mo120962i(r3, r4)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r3 = "Contact_Scene_Note"
            r9.mo120962i(r3, r7)     // Catch:{ Exception -> 0x00ff }
            r9.mo120962i(r2, r11)     // Catch:{ Exception -> 0x00ff }
            r2 = 53
            if (r0 == r2) goto L_0x00ef
            r2 = 52
            if (r0 != r2) goto L_0x00ed
            goto L_0x00ef
        L_0x00ed:
            r2 = 1
            goto L_0x00f5
        L_0x00ef:
            java.lang.String r0 = "not allow to ScanQRCode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)     // Catch:{ Exception -> 0x00ff }
            r2 = 0
        L_0x00f5:
            java.lang.String r0 = "img_gallery_session_id"
            r8.putExtra(r0, r15)     // Catch:{ Exception -> 0x00fb }
            goto L_0x0110
        L_0x00fb:
            r0 = move-exception
            goto L_0x0101
        L_0x00fd:
            r2 = 1
            goto L_0x0110
        L_0x00ff:
            r0 = move-exception
            r2 = 1
        L_0x0101:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r3 = 0
            r4[r3] = r0
            java.lang.String r0 = "getCookie fail : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r0, r4)
        L_0x0110:
            java.lang.String r0 = "shouldShowScanQrCodeMenu"
            r8.putExtra(r0, r2)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "stat_scene"
            r3 = 4
            r0.putInt(r2, r3)
            java.lang.String r2 = "stat_url"
            r0.putString(r2, r12)
            java.lang.String r2 = "_stat_obj"
            r8.putExtra(r2, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r2 = m5955f()
            if (r2 == 0) goto L_0x01af
            int r2 = com.tencent.p014mm.p136ui.C75044y4.m89989a(r0)
            int r4 = com.tencent.p014mm.p136ui.C75044y4.m89996h(r0)
            java.lang.String r5 = "width"
            float r5 = r1.getFloat(r5)
            int r5 = (int) r5
            java.lang.String r6 = "height"
            float r6 = r1.getFloat(r6)
            int r6 = (int) r6
            java.lang.String r7 = "left"
            float r7 = r1.getFloat(r7)
            int r7 = (int) r7
            java.lang.String r9 = "top"
            float r1 = r1.getFloat(r9)
            if (r20 == 0) goto L_0x0160
            r2 = 0
            goto L_0x0161
        L_0x0160:
            int r2 = r2 + r4
        L_0x0161:
            float r2 = (float) r2
            float r1 = r1 + r2
            int r1 = (int) r1
            int r0 = kg3.C76577a.m92159j(r0)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r4 = 0
            r2[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = 1
            r2[r4] = r3
            r3 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r2[r3] = r4
            r3 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r2[r3] = r4
            java.lang.String r3 = "doPreviewImg left %d, top %d, w %d, h %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r3, r2)
            java.lang.String r2 = "img_gallery_width"
            android.content.Intent r2 = r8.putExtra(r2, r5)
            java.lang.String r3 = "img_gallery_height"
            android.content.Intent r2 = r2.putExtra(r3, r6)
            java.lang.String r3 = "img_gallery_left"
            android.content.Intent r2 = r2.putExtra(r3, r7)
            java.lang.String r3 = "img_gallery_top"
            r2.putExtra(r3, r1)
            if (r5 <= 0) goto L_0x01af
            if (r6 <= 0) goto L_0x01af
            if (r6 >= r0) goto L_0x01af
            java.lang.String r0 = "shouldRunDragAnimation"
            r1 = 1
            r8.putExtra(r0, r1)
        L_0x01af:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "subapp"
            java.lang.String r2 = ".ui.gallery.GestureGalleryUI"
            r3 = 0
            ke3.C88144b.m109791i(r0, r1, r2, r8, r3)
            return
        L_0x01bd:
            java.lang.String r0 = "imagePreview failed url is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.modeltools.C6085v.m5951b(android.os.Bundle, com.tencent.mm.ui.widget.MMWebView, android.os.Bundle, boolean):void");
    }

    /* renamed from: c */
    public static Bundle m5952c(MMWebView mMWebView) {
        String url = mMWebView.getUrl();
        String cookie = CookieManager.getInstance().getCookie(url);
        Log.m105925i("MicroMsg.WebViewPreviewImgHelper", "url = %s, cookie = %s", url, cookie);
        Bundle bundle = new Bundle();
        bundle.putString("cookie", cookie);
        bundle.putFloat(Constants.PARAM_DENSITY, mMWebView.getMMDensity());
        return bundle;
    }

    /* renamed from: d */
    public static void m5953d(Map<String, Object> map, MMWebView mMWebView, C6087b bVar) {
        if (mMWebView != null && map != null) {
            boolean z = false;
            if (f22419c == -1) {
                int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_xweb_url_to_path_v2, 1);
                f22419c = Qe;
                Log.m105925i("MicroMsg.WebViewPreviewImgHelper", "openXWebUrlToPath %d", Integer.valueOf(Qe));
            }
            if (f22419c == 1) {
                String str = (String) map.get("current");
                if (!Util.isNullOrNil(str)) {
                    Log.m105918d("MicroMsg.WebViewPreviewImgHelper", "start getImageBitmapToFile");
                    StringBuilder sb = new StringBuilder();
                    String str2 = C0427b.f1050a;
                    StringBuilder sb4 = new StringBuilder();
                    String str3 = C0427b.f1050a;
                    sb4.append(str3);
                    sb4.append("/");
                    sb4.append(new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis())));
                    String sb5 = sb4.toString();
                    Log.m105919d("MicroMsg.Loader.ImageTmpFilehUtils", "[cpan] get tmp file path:%s", sb5);
                    Uri n = C116299g2.m163858n(str3);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0 f0Var = C116281f0.C116289i.f348994a;
                    C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
                    if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                        C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                        if (l2.mo177810a()) {
                            l2.f348991a.mo119937g(l2.f348992b);
                        }
                    }
                    Uri n2 = C116299g2.m163858n(sb5);
                    String path2 = n2.getPath();
                    if (path2 != null) {
                        String k2 = C116299g2.m163855k(path2, false, false);
                        if (!n2.getPath().equals(k2)) {
                            n2 = n2.buildUpon().path(k2).build();
                        }
                    }
                    C116281f0.C116288h l3 = f0Var.mo177799l(n2, (C116281f0.C116288h) null);
                    if (l3.mo177810a()) {
                        z = l3.f348991a.mo119948x(l3.f348992b);
                    }
                    if (!z) {
                        C116281f0.C116288h l4 = f0Var.mo177799l(n2, l3);
                        if (l4.mo177810a()) {
                            l4.f348991a.mo119937g(l4.f348992b);
                        }
                    }
                    sb.append(sb5);
                    sb.append("/reader_");
                    sb.append(C90193h.m112878f(str.getBytes()));
                    sb.append(".jpg");
                    String sb6 = sb.toString();
                    if (C86013q1.m106450k(sb6)) {
                        Log.m105924i("MicroMsg.WebViewPreviewImgHelper", "getImageBitmapToFile savePath exist");
                        ((HashMap) f22421e).put(str, sb6);
                        f22420d = true;
                        if (bVar != null) {
                            ((C5941l0.C5942a) bVar).mo6944b();
                            return;
                        }
                        return;
                    }
                    f22420d = mMWebView.getImageBitmapToFile(str, sb6, "", new C6086a(bVar, str));
                } else if (bVar != null) {
                    ((C5941l0.C5942a) bVar).mo6943a();
                }
            } else if (bVar != null) {
                ((C5941l0.C5942a) bVar).mo6943a();
            }
        } else if (bVar != null) {
            ((C5941l0.C5942a) bVar).mo6943a();
        }
    }

    /* renamed from: e */
    public static String m5954e(String str) {
        if (Util.isNullOrNil(str) || !f22420d) {
            return null;
        }
        String str2 = (String) ((HashMap) f22421e).get(str);
        if (!Util.isNullOrNil(str2)) {
            C115669n.INSTANCE.idkeyStat(1059, 2, 1, false);
        } else {
            C115669n.INSTANCE.idkeyStat(1059, 5, 1, false);
        }
        return str2;
    }

    /* renamed from: f */
    public static boolean m5955f() {
        if (f22418b == -1) {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_preview_img_with_ani, 1);
            f22418b = Qe;
            Log.m105925i("MicroMsg.WebViewPreviewImgHelper", "shouldShowAnimation %d", Integer.valueOf(Qe));
        }
        return f22418b == 1;
    }
}
