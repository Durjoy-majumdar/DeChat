package r80;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import java.nio.ByteBuffer;
import m80.C109537f;
import o80.C109993a;
import rx3.C13598b0;

/* renamed from: r80.p */
public final class C110536p {

    /* renamed from: a */
    public final C109993a f330540a;

    /* renamed from: b */
    public C109537f f330541b;

    /* renamed from: c */
    public C32227p<? super MediaFormat, ? super C110536p, C13598b0> f330542c;

    /* renamed from: d */
    public boolean f330543d;

    /* renamed from: e */
    public final Object f330544e;

    /* renamed from: f */
    public final MMHandler f330545f;

    /* renamed from: g */
    public final String f330546g;

    /* renamed from: h */
    public HandlerThread f330547h;

    /* renamed from: i */
    public final C32229r<ByteBuffer, Long, MediaCodec.BufferInfo, Boolean, C13598b0> f330548i;

    /* renamed from: j */
    public final C32226l<MediaFormat, C13598b0> f330549j;

    public C110536p(C109993a aVar, boolean z, int i, C8480h hVar) {
        Looper mainLooper;
        z = (i & 2) != 0 ? false : z;
        C87412m.m108594g(aVar, "mediaExtractor");
        this.f330540a = aVar;
        this.f330544e = new Object();
        this.f330546g = "MicroMsg.MediaCodecCheckVideoCropRect";
        this.f330545f = new MMHandler((Looper.myLooper() == null || z) ? Looper.getMainLooper() : mainLooper);
        Log.m105924i("MicroMsg.MediaCodecCheckVideoCropRect", "create MediaCodecCheckVideoCropRect");
        aVar.mo161330h();
        this.f330548i = new C110529j(this);
        this.f330549j = new C110531l(this);
    }
}
