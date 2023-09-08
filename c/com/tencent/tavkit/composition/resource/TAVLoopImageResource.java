package com.tencent.tavkit.composition.resource;

import android.util.SparseArray;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tavkit.ciimage.CIImage;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\u0001H\u0016J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/tavkit/composition/resource/TAVLoopImageResource;", "Lcom/tencent/tavkit/composition/resource/TAVResource;", "images", "", "Lcom/tencent/tavkit/ciimage/CIImage;", "interval", "Lcom/tencent/tav/coremedia/CMTime;", "duration", "(Ljava/util/List;Lcom/tencent/tav/coremedia/CMTime;Lcom/tencent/tav/coremedia/CMTime;)V", "ciImageHashMap", "Ljava/lang/ThreadLocal;", "Landroid/util/SparseArray;", "clone", "imageAtTime", "time", "renderSize", "Lcom/tencent/tav/coremedia/CGSize;", "tavkit_release"}, mo182095k = 1, mo182096mv = {1, 1, 15})
public final class TAVLoopImageResource extends TAVResource {
    private final ThreadLocal<SparseArray<CIImage>> ciImageHashMap;
    private final List<CIImage> images;
    private final CMTime interval;

    public TAVLoopImageResource(List<? extends CIImage> list, CMTime cMTime, CMTime cMTime2) {
        C87412m.m108595h(list, "images");
        C87412m.m108595h(cMTime, "interval");
        C87412m.m108595h(cMTime2, "duration");
        this.images = list;
        this.interval = cMTime;
        this.ciImageHashMap = new ThreadLocal<>();
        setDuration(cMTime2);
        setSourceTimeRange(new CMTimeRange(CMTime.CMTimeZero, cMTime2));
    }

    public CIImage imageAtTime(CMTime cMTime, CGSize cGSize) {
        C87412m.m108595h(cMTime, "time");
        C87412m.m108595h(cGSize, "renderSize");
        if (!this.sourceTimeRange.containsTime(cMTime) || this.images.isEmpty()) {
            return null;
        }
        ThreadLocal<SparseArray<CIImage>> threadLocal = this.ciImageHashMap;
        SparseArray<CIImage> sparseArray = threadLocal.get();
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
            threadLocal.set(sparseArray);
        }
        SparseArray sparseArray2 = sparseArray;
        int timeUs = (int) ((cMTime.getTimeUs() / this.interval.getTimeUs()) % ((long) this.images.size()));
        CIImage cIImage = (CIImage) sparseArray2.get(timeUs);
        if (cIImage != null) {
            cIImage.reset();
            return cIImage;
        }
        sparseArray2.put(timeUs, this.images.get(timeUs).clone());
        return (CIImage) sparseArray2.get(timeUs);
    }

    public TAVResource clone() {
        List<CIImage> list = this.images;
        CMTime cMTime = this.interval;
        CMTime cMTime2 = this.duration;
        C87412m.m108590c(cMTime2, "duration");
        return new TAVLoopImageResource(list, cMTime, cMTime2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TAVLoopImageResource(java.util.List r3, com.tencent.tav.coremedia.CMTime r4, com.tencent.tav.coremedia.CMTime r5, int r6, gy3.C8480h r7) {
        /*
            r2 = this;
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0018
            int r5 = r3.size()
            long r5 = (long) r5
            long r0 = r4.getTimeUs()
            long r5 = r5 * r0
            com.tencent.tav.coremedia.CMTime r5 = com.tencent.tav.coremedia.CMTime.fromUs(r5)
            java.lang.String r6 = "CMTime.fromUs(images.size * interval.timeUs)"
            gy3.C87412m.m108590c(r5, r6)
        L_0x0018:
            r2.<init>(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tavkit.composition.resource.TAVLoopImageResource.<init>(java.util.List, com.tencent.tav.coremedia.CMTime, com.tencent.tav.coremedia.CMTime, int, gy3.h):void");
    }
}
