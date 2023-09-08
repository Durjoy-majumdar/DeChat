package m90;

import android.media.MediaCodec;
import com.tencent.p014mm.plugin.sight.base.C106139e;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j72.C108614j;
import j72.C108644v;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: m90.a */
public final class C109555a extends C108614j {

    /* renamed from: J */
    public final String f327932J = "MicroMsg.MMSightAACMediaCodecBufIdRecorder";

    /* renamed from: K */
    public ArrayList<C106139e> f327933K = new ArrayList<>();

    public C109555a(int i, int i2, int i3, boolean z) {
        super(i, i2, i3, (C108644v) null, z);
    }

    /* renamed from: j */
    public boolean mo159637j() {
        return true;
    }

    /* renamed from: k */
    public void mo159638k(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        C87412m.m108594g(byteBuffer, "outputBuffer");
        C87412m.m108594g(bufferInfo, "info");
        if (this.f327933K.size() >= 0 && !this.f325213u) {
            for (C106139e e : this.f327933K) {
                String str = this.f327932J;
                Log.m105918d(str, "writeAACDataLock  ,bufferInfo.size : " + bufferInfo.size + ", pts: " + bufferInfo.presentationTimeUs);
                C106139e.m142774e(e, byteBuffer, bufferInfo.size, bufferInfo.presentationTimeUs, 0, 0, 0, 56, (Object) null);
            }
        }
    }

    /* renamed from: l */
    public void mo159639l(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i, int i2, int i3) {
        C87412m.m108594g(bufferInfo, "info");
        if (this.f327933K.size() >= 0 && byteBuffer != null && !this.f325213u) {
            String str = this.f327932J;
            Log.m105918d(str, "writeAACDataWithADTSLock  ,bufferInfo.size : " + bufferInfo.size + ", pts: " + bufferInfo.presentationTimeUs);
            for (C106139e d : this.f327933K) {
                d.mo151876d(byteBuffer, bufferInfo.size, bufferInfo.presentationTimeUs, i, i2, i3);
            }
        }
    }

    /* renamed from: n */
    public final int mo160781n(C106139e eVar, String str) {
        C87412m.m108594g(eVar, "sightEncode");
        C87412m.m108594g(str, "tempPath");
        String str2 = this.f327932J;
        Log.m105918d(str2, "bufferId:" + eVar.f316167a + " ,tempPath:" + str);
        this.f327933K.clear();
        this.f327933K.add(eVar);
        return mo138254c(eVar.f316167a, str);
    }
}
