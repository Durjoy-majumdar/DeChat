package b51;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C47350c;
import pe3.C47465a;
import u41.C52444x;

/* renamed from: b51.i */
public final class C0247i implements C40324j.C40326a {

    /* renamed from: a */
    public static final C0247i f785a = new C0247i();

    /* renamed from: a */
    public final void mo288a(int i, int i2, String str, C47350c cVar) {
        C47465a aVar = cVar.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.downloader.game.dl.protobuf.SetCloudGameRetainRecordResponse");
        C52444x xVar = (C52444x) aVar;
        if (i == 0 && i2 == 0) {
            Log.m105924i("GameDetainManager.GameCloudAppDownloadUI", "SetCloudGameRetainRecordResponse response  ok ");
        }
    }
}
