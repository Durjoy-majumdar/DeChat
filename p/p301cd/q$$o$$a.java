package p301cd;

import android.os.Bundle;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;

/* renamed from: cd.q$$o$$a */
public final /* synthetic */ class q$$o$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ q$$o f234342d;

    /* renamed from: e */
    public final /* synthetic */ String f234343e;

    public /* synthetic */ q$$o$$a(q$$o q__o, String str) {
        this.f234342d = q__o;
        this.f234343e = str;
    }

    public final void run() {
        q$$o q__o = this.f234342d;
        String str = this.f234343e;
        if (q__o.f234372a.f234327i != null) {
            Bundle bundle = new Bundle();
            bundle.putString(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, str);
            q__o.f234372a.f234327i.mo21073e(bundle);
        }
    }
}
