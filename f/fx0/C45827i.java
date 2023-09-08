package fx0;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gc0.C20828a;
import hc0.C20937c;
import ic0.C98661k;

/* renamed from: fx0.i */
public final class C45827i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f123735d;

    /* renamed from: e */
    public final /* synthetic */ String f123736e;

    /* renamed from: fx0.i$a */
    public static final class C45828a implements C98661k {

        /* renamed from: a */
        public static final C45828a f123737a = new C45828a();

        /* renamed from: a */
        public final void mo6935a(String str, View view, Bitmap bitmap, Object[] objArr) {
            Log.m105925i("MicroMsg.BizVideoChannelStrategy", "preloadIcon finish: url = %s", str);
            C45825h.f123727a.mo71297j(11);
        }
    }

    public C45827i(String str, String str2) {
        this.f123735d = str;
        this.f123736e = str2;
    }

    public final void run() {
        Log.m105925i("MicroMsg.BizVideoChannelStrategy", "preloadIcon start = %s", this.f123735d);
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59364t = true;
        bVar.f59359o = C0966R.C0969drawable.be5;
        bVar.f59346b = true;
        bVar.f59350f = this.f123736e;
        C20828a.m22825b().mo32521j(this.f123735d, (ImageView) null, bVar.mo32666a(), C45828a.f123737a);
    }
}
