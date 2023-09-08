package p292ad;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLivePlayer;
import jo0.C87995c;
import p830xc.C91165a;
import p932bd.C79687a;

/* renamed from: ad.k */
public class C79511k implements TXLivePlayer.ITXSnapshotListener {

    /* renamed from: a */
    public final /* synthetic */ C91165a f233148a;

    /* renamed from: b */
    public final /* synthetic */ C79502b f233149b;

    public C79511k(C79502b bVar, C91165a aVar) {
        this.f233149b = bVar;
        this.f233148a = aVar;
    }

    public void onSnapshot(Bitmap bitmap) {
        C91165a aVar = this.f233148a;
        if (aVar == null) {
            Log.m105920e("MicroMsg.SameLayer.LivePlayerPluginHandler", "operateSnapshot, invokeContext is null");
            return;
        }
        C79687a aVar2 = this.f233149b.f233100n;
        if (aVar2 != null) {
            ((C87995c) aVar2).mo122448c(aVar, bitmap);
        }
    }
}
