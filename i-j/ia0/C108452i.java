package ia0;

import android.os.SystemClock;
import com.tencent.maas.camerafun.MJAudioFrame;
import com.tencent.maas.model.time.MJTime;
import com.tencent.maas.model.time.MJTimeRange;
import com.tencent.tav.coremedia.TimeUtil;
import fy3.C32227p;
import gy3.C24565l;
import gy3.C87412m;
import ha0.C108210m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: ia0.i */
public final /* synthetic */ class C108452i extends C24565l implements C32227p<byte[], Integer, C13598b0> {
    public C108452i(Object obj) {
        super(2, obj, C108438c.class, "onReceiveAudioFrame", "onReceiveAudioFrame([BI)V", 0);
    }

    public Object invoke(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        int intValue = ((Number) obj2).intValue();
        C87412m.m108594g(bArr, "p0");
        C108438c cVar = (C108438c) this.receiver;
        C108436b bVar = cVar.f324704n;
        if (bVar != null) {
            cVar.f324716z.mo122117a(intValue);
            C87684j jVar = cVar.f324716z;
            ArrayList<ByteBuffer> arrayList = jVar.f253964a;
            int i = jVar.f253965b;
            jVar.f253965b = i + 1;
            ByteBuffer byteBuffer = arrayList.get(i % arrayList.size());
            C87412m.m108593f(byteBuffer, "pool[index++ % pool.size]");
            ByteBuffer byteBuffer2 = byteBuffer;
            byteBuffer2.clear();
            byteBuffer2.put(bArr, 0, intValue);
            byteBuffer2.position(0);
            C108435a aVar = bVar.f324690a;
            int i2 = aVar.f324688b;
            int i3 = (intValue / i2) / 2;
            int i4 = aVar.f324687a;
            int i5 = ((aVar.f324689c * i4) * i2) / 1000;
            long j = 1411200000 / ((long) i4);
            MJTime mJTime = cVar.f324695A;
            cVar.f324695A = mJTime == null ? MJTime.fromNanoseconds(SystemClock.elapsedRealtimeNanos()) : mJTime.add(new MJTime(((long) i3) * j));
            MJTimeRange mJTimeRange = new MJTimeRange(cVar.f324695A, MJTime.fromNanoseconds(((long) bVar.f324690a.f324689c) * TimeUtil.SECOND_TO_US));
            MJAudioFrame.MJAudioFrameSampleFormat mJAudioFrameSampleFormat = MJAudioFrame.MJAudioFrameSampleFormat.I16;
            C108435a aVar2 = bVar.f324690a;
            MJAudioFrame mJAudioFrame = new MJAudioFrame(mJAudioFrameSampleFormat, aVar2.f324687a, aVar2.f324688b == 1 ? MJAudioFrame.MJAudioFrameChannelLayout.Mono : MJAudioFrame.MJAudioFrameChannelLayout.Stereo, i3, mJTimeRange, byteBuffer2);
            C108210m mVar = cVar.f324699f;
            if (mVar != null) {
                mVar.f324011a.sendAudioFrame(mJAudioFrame);
            }
        }
        return C13598b0.f38549a;
    }
}
