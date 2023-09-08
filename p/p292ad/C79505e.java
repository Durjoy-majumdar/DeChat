package p292ad;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLivePlayer;
import p1066yc.C91414k;

/* renamed from: ad.e */
public class C79505e implements TXLivePlayer.ITXSnapshotListener {

    /* renamed from: a */
    public final /* synthetic */ C79502b f233140a;

    public C79505e(C79502b bVar) {
        this.f233140a = bVar;
    }

    public void onSnapshot(Bitmap bitmap) {
        Log.m105924i(this.f233140a.mo109516v(), "getSnapshotAsync, onSnapshot");
        C91414k kVar = this.f233140a.f233094U;
        if (kVar == null) {
            Log.m105928w(this.f233140a.mo109516v(), "getSnapshotAsync, getSnapshotCallback is null");
            return;
        }
        kVar.mo109546a(bitmap);
        this.f233140a.f233094U = null;
    }
}
