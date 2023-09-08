package p301cd;

import android.os.Bundle;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;

/* renamed from: cd.q$$u$$a */
public final /* synthetic */ class q$$u$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ q$$u f234348d;

    /* renamed from: e */
    public final /* synthetic */ String f234349e;

    public /* synthetic */ q$$u$$a(q$$u q__u, String str) {
        this.f234348d = q__u;
        this.f234349e = str;
    }

    public final void run() {
        q$$u q__u = this.f234348d;
        String str = this.f234349e;
        if (q__u.f234391a.f234327i != null) {
            Bundle bundle = new Bundle();
            bundle.putString(V2TXJSAdapterConstants.PUSHER_KEY_BACKGROUND_IMAGE, str);
            q__u.f234391a.f234327i.mo21073e(bundle);
        }
    }
}
