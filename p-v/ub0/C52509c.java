package ub0;

import android.app.Activity;
import android.util.Base64;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import f12.C7970a;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import java.lang.ref.WeakReference;
import p823sg.C90193h;
import rb0.C47985k0;
import rb0.C48006u;
import rb0.C48008v;
import te3.cy4;
import te3.dy4;
import te3.fy4;
import te3.gy4;
import te3.hy4;

/* renamed from: ub0.c */
public class C52509c {

    /* renamed from: a */
    public boolean f146666a = false;

    /* renamed from: b */
    public fy4 f146667b;

    /* renamed from: a */
    public void mo73443a(String str) {
        if (this.f146667b == null) {
            if (!this.f146666a) {
                cy4 cy4 = new cy4();
                cy4.f132031d = 0;
                C86709a0.m107529k().f251779b.mo123460f(new C47985k0(str, 2, cy4, new C48006u(new dy4(), str)));
                this.f146666a = true;
            }
            fy4 fy4 = null;
            try {
                byte[] decodeBytes = MultiProcessMMKV.getMMKV("brandService", 1).decodeBytes(C48008v.m53370a(str, 2, (String) null));
                fy4 fy42 = new fy4();
                fy42.parseFrom(decodeBytes);
                fy4 = fy42;
            } catch (Throwable unused) {
            }
            this.f146667b = fy4;
        }
    }

    /* renamed from: b */
    public void mo73444b(Activity activity) {
        String str;
        fy4 fy4 = this.f146667b;
        if (fy4 != null) {
            int i = fy4.f133746d;
            if (i == 1) {
                gy4 gy4 = fy4.f133747e;
                if (gy4 != null) {
                    String str2 = gy4.f134368d;
                    if (Util.isNullOrNil(str2)) {
                        str = null;
                    } else {
                        str = C7970a.m8128b() + C90193h.m112878f(str2.getBytes());
                    }
                    if (str == null) {
                        Log.m105928w("MicroMsg.OpenSdkBridge", "doSendImage bad img_url=" + gy4.f134368d);
                        return;
                    }
                    C20937c.C20939b bVar = new C20937c.C20939b();
                    bVar.f59350f = str;
                    bVar.f59346b = true;
                    bVar.f59345a = true;
                    Log.m105929w("MicroMsg.OpenSdkBridge", "doSendImage fullPath=%s", str);
                    C20828a.m22825b().mo32515d(gy4.f134368d, bVar.mo32666a(), new C52507a(str, new WeakReference(activity)));
                }
            } else if (i == 2) {
                hy4 hy4 = fy4.f133748f;
                WXWebpageObject wXWebpageObject = new WXWebpageObject();
                wXWebpageObject.webpageUrl = hy4.f134977d;
                WXMediaMessage wXMediaMessage = new WXMediaMessage(wXWebpageObject);
                wXMediaMessage.title = hy4.f134979f;
                wXMediaMessage.description = hy4.f134980g;
                try {
                    wXMediaMessage.thumbData = Base64.decode(hy4.f134978e.f257327a, 0);
                } catch (Throwable unused) {
                }
                SendMessageToWX.Req req = new SendMessageToWX.Req();
                req.transaction = "com.tencent.wework.webpage";
                req.message = wXMediaMessage;
                req.scene = 0;
                C52508b.m58754b(activity, req);
            }
        }
    }
}
