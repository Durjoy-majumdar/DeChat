package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ck0.C92423c;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.plugin.webview.model.C43702g2;
import com.tencent.p014mm.plugin.webview.model.C6049n1;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKImageItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wxmm.v2helper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p1016ob.C89131a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$t */
public class MsgHandler$$t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f22858d;

    /* renamed from: e */
    public final /* synthetic */ String f22859e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f22860f;

    /* renamed from: g */
    public final /* synthetic */ MsgHandler f22861g;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$t$a */
    public class C6194a implements Runnable {
        public C6194a() {
        }

        public void run() {
            String a = C43702g2.m47528a(MsgHandler$$t.this.f22860f);
            Log.m105925i("MicroMsg.MsgHandler", "after parse to json data : %s", a);
            ProgressDialog progressDialog = MsgHandler$$t.this.f22861g.f22700g;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            Log.m105925i("MicroMsg.MsgHandler", "after parse to json data : %s", a);
            HashMap hashMap = new HashMap();
            hashMap.put("type", 1);
            hashMap.put("localIds", a);
            MsgHandler msgHandler = MsgHandler$$t.this.f22861g;
            msgHandler.mo7210k5(msgHandler.f22698e, "chooseHaowanMedia:ok", hashMap);
        }
    }

    public MsgHandler$$t(MsgHandler msgHandler, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f22861g = msgHandler;
        this.f22858d = arrayList;
        this.f22859e = str;
        this.f22860f = arrayList2;
    }

    public void run() {
        Iterator it = this.f22858d.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = this.f22859e + "microMsg.image." + currentTimeMillis + "." + (str.hashCode() & 65535);
            String str3 = this.f22859e + "microMsg.thumb." + currentTimeMillis + "." + (str.hashCode() & 65535);
            this.f22861g.getClass();
            if (!Util.isNullOrNil(str) && Exif.fromFile(str).getOrientationInDegree() != 0) {
                this.f22861g.getClass();
                int orientationInDegree = Exif.fromFile(str).getOrientationInDegree();
                if (orientationInDegree != 0) {
                    int i = orientationInDegree % v2helper.VOIP_ENC_HEIGHT_LV1;
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        Bitmap d = MMBitmapFactory.m98735d(str, options);
                        if (d == null) {
                            Log.m105920e("MicroMsg.MsgHandler", "rotate image, get null bmp");
                        } else {
                            Bitmap rotate = BitmapUtil.rotate(d, (float) i);
                            Log.m105925i("MicroMsg.MsgHandler", "doRotate, dstPath : %s", str2);
                            try {
                                BitmapUtil.saveBitmapToImage(rotate, 80, C89131a.m111396d(options) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, str2, true);
                                if (C89131a.m111396d(options)) {
                                    C92423c.m116249b(str, str2);
                                }
                            } catch (Exception e) {
                                Log.m105921e("MicroMsg.MsgHandler", "rotate image, exception occurred when saving | %s", e);
                                C86013q1.m106447h(str2);
                            }
                        }
                    } catch (NullPointerException | OutOfMemoryError unused) {
                    }
                }
                WebViewJSSDKFileItem c = C6049n1.m5934c(str, str3);
                BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str);
                c.f283030p = imageOptions.outWidth;
                c.f283031q = imageOptions.outHeight;
                ((WebViewJSSDKImageItem) c).f22268w = ImgUtil.isGif(str);
                String str4 = c.f283022e;
                C6080m.Ax0().mo7009a(c);
                Log.m105925i("MicroMsg.MsgHandler", "now filepath is : %s, local id is : %s", str, str4);
                this.f22860f.add(str4);
            } else if (C86013q1.m106443d(str, str2, false) <= 0) {
                WebViewJSSDKFileItem c2 = C6049n1.m5934c(str, str3);
                BitmapFactory.Options imageOptions2 = BitmapUtil.getImageOptions(str);
                c2.f283030p = imageOptions2.outWidth;
                c2.f283031q = imageOptions2.outHeight;
                ((WebViewJSSDKImageItem) c2).f22268w = ImgUtil.isGif(str);
                String str42 = c2.f283022e;
                C6080m.Ax0().mo7009a(c2);
                Log.m105925i("MicroMsg.MsgHandler", "now filepath is : %s, local id is : %s", str, str42);
                this.f22860f.add(str42);
            }
            str = str2;
            WebViewJSSDKFileItem c25 = C6049n1.m5934c(str, str3);
            BitmapFactory.Options imageOptions22 = BitmapUtil.getImageOptions(str);
            c25.f283030p = imageOptions22.outWidth;
            c25.f283031q = imageOptions22.outHeight;
            ((WebViewJSSDKImageItem) c25).f22268w = ImgUtil.isGif(str);
            String str422 = c25.f283022e;
            C6080m.Ax0().mo7009a(c25);
            Log.m105925i("MicroMsg.MsgHandler", "now filepath is : %s, local id is : %s", str, str422);
            this.f22860f.add(str422);
        }
        MMHandlerThread.postToMainThread(new C6194a());
    }
}
