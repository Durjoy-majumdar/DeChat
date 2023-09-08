package n80;

import android.media.MediaCodec;
import android.os.Looper;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import java.nio.ByteBuffer;
import l80.C109277d;
import rx3.C13598b0;

/* renamed from: n80.b */
public abstract class C109697b {

    /* renamed from: a */
    public C32226l<? super C109697b, C13598b0> f328344a;

    /* renamed from: b */
    public final String f328345b = "MicroMsg.IMediaCodecTransEncoder";

    /* renamed from: c */
    public Surface f328346c;

    /* renamed from: d */
    public C32227p<? super ByteBuffer, ? super MediaCodec.BufferInfo, C13598b0> f328347d;

    /* renamed from: e */
    public C32224a<C13598b0> f328348e;

    /* renamed from: f */
    public int f328349f;

    /* renamed from: g */
    public boolean f328350g;

    /* renamed from: h */
    public volatile boolean f328351h;

    /* renamed from: i */
    public volatile boolean f328352i;

    /* renamed from: j */
    public final Object f328353j = new Object();

    public C109697b(C109277d dVar, C32226l<? super C109697b, C13598b0> lVar) {
        C87412m.m108594g(dVar, "videoCodecConfig");
        this.f328344a = lVar;
    }

    /* renamed from: a */
    public abstract void mo160917a(long j);

    /* renamed from: b */
    public abstract void mo160918b();

    /* renamed from: c */
    public final Surface mo160919c() {
        Surface surface = this.f328346c;
        if (surface != null) {
            return surface;
        }
        C87412m.m108603p("codecSurface");
        throw null;
    }

    /* renamed from: d */
    public abstract long mo160920d();

    /* renamed from: e */
    public final void mo160921e(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        C87412m.m108594g(byteBuffer, "buffer");
        C87412m.m108594g(bufferInfo, "bufferInfo");
        Log.m105924i(this.f328345b, "processEncodeBuffer, buffer " + byteBuffer + ", pts: " + bufferInfo.presentationTimeUs + ", size: " + bufferInfo.size + ", isMain: " + C87412m.m108589b(Looper.getMainLooper(), Looper.myLooper()));
        C32227p<? super ByteBuffer, ? super MediaCodec.BufferInfo, C13598b0> pVar = this.f328347d;
        if (pVar != null) {
            pVar.invoke(byteBuffer, bufferInfo);
        }
        this.f328349f++;
    }

    /* renamed from: f */
    public abstract void mo160922f();
}
