package ku0;

import com.tencent.live2.V2TXLiveDef;
import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86920e;
import p301cd.C79999m;
import p830xc.C91165a;

/* renamed from: ku0.e */
public final class C88299e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88288a f255240d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f255241e;

    /* renamed from: f */
    public final /* synthetic */ int f255242f;

    /* renamed from: g */
    public final /* synthetic */ int f255243g;

    /* renamed from: h */
    public final /* synthetic */ int f255244h;

    /* renamed from: i */
    public final /* synthetic */ C91165a f255245i;

    public C88299e(C88288a aVar, byte[] bArr, int i, int i2, int i3, C91165a aVar2) {
        this.f255240d = aVar;
        this.f255241e = bArr;
        this.f255242f = i;
        this.f255243g = i2;
        this.f255244h = i3;
        this.f255245i = aVar2;
    }

    public final void run() {
        C88288a aVar = this.f255240d;
        byte[] bArr = this.f255241e;
        int i = this.f255242f;
        int i2 = this.f255243g;
        int i3 = this.f255244h;
        C91165a aVar2 = this.f255245i;
        if (C88288a.f255200F) {
            Log.m105918d(aVar.f255208f, "doSendCustomVideoFrame");
        }
        C79999m mVar = aVar.f255207e;
        V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame = new V2TXLiveDef.V2TXLiveVideoFrame();
        v2TXLiveVideoFrame.pixelFormat = V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        v2TXLiveVideoFrame.bufferType = V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray;
        v2TXLiveVideoFrame.data = bArr;
        v2TXLiveVideoFrame.width = i;
        v2TXLiveVideoFrame.height = i2;
        v2TXLiveVideoFrame.rotation = i3;
        mVar.mo33718j(v2TXLiveVideoFrame);
        aVar2.mo62551l(C86920e.f252311a);
    }
}
