package y13;

import com.tencent.tav.codec.DefaultDecoderFactory;
import com.tencent.tav.codec.IDecoderFactory;
import com.tencent.tav.codec.IMediaCodec;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C8480h;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: y13.d */
public final class C112374d implements IDecoderFactory {

    /* renamed from: a */
    public boolean f336467a;

    /* renamed from: b */
    public boolean f336468b;

    /* renamed from: c */
    public final DefaultDecoderFactory f336469c;

    /* renamed from: d */
    public boolean f336470d;

    /* renamed from: e */
    public boolean f336471e;

    /* renamed from: f */
    public int f336472f;

    /* renamed from: g */
    public int f336473g;

    public C112374d(boolean z, boolean z2, int i, C8480h hVar) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        this.f336467a = z;
        this.f336468b = z2;
        this.f336469c = new DefaultDecoderFactory();
        this.f336470d = true;
        this.f336471e = true;
    }

    public IMediaCodec createAudioDecoder(String str, String str2) {
        C87412m.m108594g(str, "mime");
        C87412m.m108594g(str2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (this.f336470d && C112551y.m153819s(str, "audio/pcm", false)) {
            this.f336472f = 3;
            return new C112370a();
        } else if (this.f336468b) {
            this.f336472f = 1;
            return new C112370a();
        } else {
            try {
                IMediaCodec createAudioDecoder = this.f336469c.createAudioDecoder(str, str2);
                C87412m.m108593f(createAudioDecoder, "defaultFactory.createAudioDecoder(mime, scene)");
                return createAudioDecoder;
            } catch (Exception e) {
                if (this.f336471e) {
                    this.f336472f = 2;
                    return new C112370a();
                }
                throw e;
            }
        }
    }

    public IMediaCodec createVideoDecoder(String str) {
        C87412m.m108594g(str, "mime");
        if (this.f336467a) {
            this.f336473g = 1;
            return new C112375e();
        }
        try {
            IMediaCodec createVideoDecoder = this.f336469c.createVideoDecoder(str);
            C87412m.m108593f(createVideoDecoder, "defaultFactory.createVideoDecoder(mime)");
            return createVideoDecoder;
        } catch (Exception e) {
            if (this.f336471e) {
                this.f336473g = 2;
                return new C112375e();
            }
            throw e;
        }
    }
}
