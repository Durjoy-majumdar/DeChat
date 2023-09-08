package com.tencent.tavkit.component;

import com.tencent.tav.core.AssetImageGenerator;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tavkit.composition.TAVComposition;
import com.tencent.tavkit.composition.TAVSource;
import com.tencent.tavkit.composition.builder.TAVCompositionBuilder;
import java.util.ArrayList;
import java.util.List;

public class TAVSourceImageGenerator {
    public static final String TAG = "TAVSourceImageGenerator";
    private AssetImageGenerator assetImageGenerator;

    public TAVSourceImageGenerator(TAVComposition tAVComposition, CGSize cGSize) {
        init(new TAVCompositionBuilder(tAVComposition).buildSource(), cGSize);
    }

    private void checkRequestedTimes(List<CMTime> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (list.isEmpty()) {
            list.add(CMTime.CMTimeZero);
        }
        for (int i = 0; i < list.size(); i++) {
            CMTime cMTime = list.get(i);
            if (cMTime == null || cMTime.getTimeUs() < 0) {
                list.set(i, CMTime.CMTimeZero);
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (CMTime next : list) {
            if (!arrayList.contains(next)) {
                arrayList.add(next);
            }
        }
        list.clear();
        list.addAll(arrayList);
    }

    private void init(TAVSource tAVSource, CGSize cGSize) {
        AssetImageGenerator assetImageGenerator2 = new AssetImageGenerator(tAVSource.getAsset());
        this.assetImageGenerator = assetImageGenerator2;
        assetImageGenerator2.setMaximumSize(cGSize);
        this.assetImageGenerator.setAppliesPreferredTrackTransform(true);
        this.assetImageGenerator.setVideoComposition(tAVSource.getVideoComposition());
    }

    public void generateThumbnailAtTime(CMTime cMTime, AssetImageGenerator.ImageGeneratorListener imageGeneratorListener) {
        ArrayList arrayList = new ArrayList();
        if (cMTime == null || cMTime.getTimeUs() < 0) {
            cMTime = CMTime.CMTimeZero;
        }
        arrayList.add(cMTime);
        generateThumbnailAtTimes(arrayList, imageGeneratorListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r7.getTimeUs() < 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap generateThumbnailAtTimeSync(com.tencent.tav.coremedia.CMTime r7) {
        /*
            r6 = this;
            com.tencent.tav.core.AssetImageGenerator r0 = r6.assetImageGenerator
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r7 == 0) goto L_0x0011
            long r2 = r7.getTimeUs()     // Catch:{ Exception -> 0x001a }
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0013
        L_0x0011:
            com.tencent.tav.coremedia.CMTime r7 = com.tencent.tav.coremedia.CMTime.CMTimeZero     // Catch:{ Exception -> 0x001a }
        L_0x0013:
            com.tencent.tav.core.AssetImageGenerator r0 = r6.assetImageGenerator     // Catch:{ Exception -> 0x001a }
            android.graphics.Bitmap r1 = r0.copyCGImageAtTimeAndActualTime(r7, r1)     // Catch:{ Exception -> 0x001a }
            goto L_0x0021
        L_0x001a:
            r7 = move-exception
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r7)
            throw r0
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tavkit.component.TAVSourceImageGenerator.generateThumbnailAtTimeSync(com.tencent.tav.coremedia.CMTime):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void generateThumbnailAtTimes(java.util.List<com.tencent.tav.coremedia.CMTime> r3, final com.tencent.tav.core.AssetImageGenerator.ImageGeneratorListener r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.checkRequestedTimes(r3)     // Catch:{ all -> 0x001a }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x0018
            com.tencent.tav.core.AssetImageGenerator r0 = r2.assetImageGenerator     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x0010
            monitor-exit(r2)
            return
        L_0x0010:
            com.tencent.tavkit.component.TAVSourceImageGenerator$1 r1 = new com.tencent.tavkit.component.TAVSourceImageGenerator$1     // Catch:{ all -> 0x001a }
            r1.<init>(r4)     // Catch:{ all -> 0x001a }
            r0.generateCGImagesAsynchronouslyForTimes(r3, r1)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r2)
            return
        L_0x001a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tavkit.component.TAVSourceImageGenerator.generateThumbnailAtTimes(java.util.List, com.tencent.tav.core.AssetImageGenerator$ImageGeneratorListener):void");
    }

    public AssetImageGenerator getAssetImageGenerator() {
        return this.assetImageGenerator;
    }

    public TAVSourceImageGenerator(TAVSource tAVSource, CGSize cGSize) {
        init(tAVSource, cGSize);
    }
}
