package j72;

import android.media.MediaCodec;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j72.i */
public class C108613i extends C108614j {

    /* renamed from: J */
    public ArrayList<Integer> f325183J = new ArrayList<>();

    public C108613i(int i, int i2, int i3, boolean z) {
        super(i, i2, i3, (C108644v) null, z);
    }

    /* renamed from: c */
    public int mo138254c(int i, String str) {
        this.f325183J.clear();
        this.f325183J.add(Integer.valueOf(i));
        return super.mo138254c(i, str);
    }

    /* renamed from: j */
    public boolean mo159637j() {
        return true;
    }

    /* renamed from: k */
    public void mo159638k(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f325183J.size() > 0 && byteBuffer != null && !this.f325213u) {
            Iterator<Integer> it = this.f325183J.iterator();
            while (it.hasNext()) {
                SightVideoJNI.writeAACDataLock(it.next().intValue(), byteBuffer, bufferInfo.size, bufferInfo.presentationTimeUs);
            }
        }
    }

    /* renamed from: l */
    public void mo159639l(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i, int i2, int i3) {
        if (this.f325183J.size() > 0 && byteBuffer != null && !this.f325213u) {
            Iterator<Integer> it = this.f325183J.iterator();
            while (it.hasNext()) {
                SightVideoJNI.writeAACDataWithADTSLock(it.next().intValue(), byteBuffer, bufferInfo.size, bufferInfo.presentationTimeUs, i, i2, i3);
            }
        }
    }
}
