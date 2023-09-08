package z13;

import com.tencent.p014mm.plugin.vlog.model.C106197k;
import com.tencent.tav.core.ExportRuntimeException;
import com.tencent.tav.decoder.AssetWriterAudioEncoder;
import com.tencent.tav.decoder.AssetWriterVideoEncoder;
import com.tencent.tav.decoder.IEncoderFactory;
import com.tencent.tav.decoder.MediaCodecAssetWriterVideoEncoder;
import com.tencent.tav.decoder.MediaCodecAudioEncoder;

/* renamed from: z13.b */
public final class C112570b implements IEncoderFactory {

    /* renamed from: a */
    public boolean f337040a;

    /* renamed from: b */
    public boolean f337041b;

    /* renamed from: c */
    public int f337042c;

    public C112570b(boolean z, boolean z2) {
        this.f337040a = z;
        this.f337041b = z2;
    }

    public AssetWriterAudioEncoder getAudioEncoder() {
        if (this.f337041b) {
            try {
                this.f337042c = 1;
                return new C112569a();
            } catch (ExportRuntimeException unused) {
                this.f337042c = 3;
                return new MediaCodecAudioEncoder();
            }
        } else {
            try {
                return new MediaCodecAudioEncoder();
            } catch (Exception unused2) {
                this.f337042c = 2;
                return new C112569a();
            }
        }
    }

    public AssetWriterVideoEncoder getVideoEncoder() {
        return this.f337040a ? new C106197k() : new MediaCodecAssetWriterVideoEncoder();
    }
}
