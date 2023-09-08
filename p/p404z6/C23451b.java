package p404z6;

import android.media.MediaCodec;
import p333e8.C20551y;

/* renamed from: z6.b */
public final class C23451b {

    /* renamed from: a */
    public byte[] f67252a;

    /* renamed from: b */
    public int[] f67253b;

    /* renamed from: c */
    public int[] f67254c;

    /* renamed from: d */
    public final MediaCodec.CryptoInfo f67255d;

    /* renamed from: e */
    public final C23453b f67256e;

    /* renamed from: z6.b$b */
    public static final class C23453b {

        /* renamed from: a */
        public final MediaCodec.CryptoInfo f67257a;

        /* renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f67258b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public C23453b(MediaCodec.CryptoInfo cryptoInfo, C23452a aVar) {
            this.f67257a = cryptoInfo;
        }

        /* renamed from: a */
        public static void m28005a(C23453b bVar, int i, int i2) {
            bVar.f67258b.set(i, i2);
            bVar.f67257a.setPattern(bVar.f67258b);
        }
    }

    public C23451b() {
        int i = C20551y.f57835a;
        C23453b bVar = null;
        MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f67255d = cryptoInfo;
        this.f67256e = i >= 24 ? new C23453b(cryptoInfo, (C23452a) null) : bVar;
    }
}
