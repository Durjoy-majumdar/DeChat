package p357lo;

import com.tencent.p014mm.feature.brandservice.flutter.model.FlutterBizPlugin;
import com.tencent.p014mm.sdk.platformtools.Log;
import rb0.C48009v0;

/* renamed from: lo.a */
public final class C21449a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FlutterBizPlugin f60725d;

    /* renamed from: e */
    public final /* synthetic */ long f60726e;

    public C21449a(FlutterBizPlugin flutterBizPlugin, long j) {
        this.f60725d = flutterBizPlugin;
        this.f60726e = j;
    }

    public final void run() {
        String unused = this.f60725d.getClass();
        Log.m105924i("MicroMsg.FlutterBizPlugin", "deleteMsg: delete in db msgId=" + this.f60726e);
        C48009v0.Jx0().mo25785Lo(this.f60726e);
    }
}
