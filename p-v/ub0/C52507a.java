package ub0;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import ic0.C108455d;
import java.lang.ref.WeakReference;

/* renamed from: ub0.a */
public class C52507a implements C108455d {

    /* renamed from: a */
    public final /* synthetic */ String f146664a;

    /* renamed from: b */
    public final /* synthetic */ WeakReference f146665b;

    public C52507a(String str, WeakReference weakReference) {
        this.f146664a = str;
        this.f146665b = weakReference;
    }

    /* renamed from: a */
    public void mo26263a(boolean z, Object... objArr) {
        Log.m105929w("MicroMsg.OpenSdkBridge", "doSendImage onImageDownload success? %s=%b", this.f146664a, Boolean.valueOf(z));
        if (z) {
            Bitmap decodeFile = BitmapUtil.decodeFile(this.f146664a, (BitmapFactory.Options) null);
            Activity activity = (Activity) this.f146665b.get();
            if (decodeFile == null) {
                Log.m105928w("MicroMsg.OpenSdkBridge", "doSendImage null bitmap");
            }
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                Log.m105928w("MicroMsg.OpenSdkBridge", "doSendImage null or finished context");
                return;
            }
            WXImageObject wXImageObject = new WXImageObject(decodeFile);
            WXMediaMessage wXMediaMessage = new WXMediaMessage();
            wXMediaMessage.mediaObject = wXImageObject;
            SendMessageToWX.Req req = new SendMessageToWX.Req();
            req.transaction = "com.tencent.wework.img";
            req.message = wXMediaMessage;
            req.scene = 0;
            C52508b.m58754b(activity, req);
        }
    }
}
