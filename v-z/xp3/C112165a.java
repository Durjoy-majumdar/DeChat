package xp3;

import android.opengl.EGL14;
import android.util.ArrayMap;
import android.util.Size;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tav.coremedia.CGRect;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tavkit.ciimage.CIContext;
import com.tencent.tavkit.ciimage.CIImage;
import com.tencent.tavkit.composition.TAVClip;
import com.tencent.tavkit.composition.model.TAVVideoCompositionTrack;
import com.tencent.tavkit.composition.model.TAVVideoConfiguration;
import com.tencent.tavkit.composition.resource.TAVEmptyResource;
import com.tencent.tavkit.composition.video.ImageCollection;
import com.tencent.tavkit.composition.video.RenderInfo;
import com.tencent.tavkit.composition.video.TAVVideoMixEffect;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import rx3.C110660q;
import rx3.C13604l;
import sp3.C110801c;
import sp3.C110804g;
import sx3.C64175a0;
import yp3.C112478a;

/* renamed from: xp3.a */
public abstract class C112165a implements TAVVideoMixEffect.Filter {

    /* renamed from: a */
    public ArrayMap<C13604l<Integer, Integer>, LinkedList<TextureInfo>> f335850a = new ArrayMap<>();

    /* renamed from: b */
    public Size f335851b;

    /* renamed from: c */
    public TAVVideoConfiguration.TAVVideoConfigurationContentMode f335852c;

    public C112165a() {
        C87412m.m108590c(EGL14.EGL_NO_CONTEXT, "EGL14.EGL_NO_CONTEXT");
        this.f335851b = new Size(0, 0);
        this.f335852c = TAVVideoConfiguration.TAVVideoConfigurationContentMode.aspectFill;
        C112478a.m153625c("BaseMultiVideoCompositionEffect", "init: " + this, new Object[0]);
    }

    /* renamed from: a */
    public abstract TextureInfo mo163968a(CIContext cIContext, long j, List<C110804g> list);

    public CIImage apply(TAVVideoMixEffect tAVVideoMixEffect, ImageCollection imageCollection, RenderInfo renderInfo) {
        CIContext ciContext;
        if (renderInfo == null || (ciContext = renderInfo.getCiContext()) == null) {
            return null;
        }
        if (this.f335851b.getWidth() == 0 || this.f335851b.getHeight() == 0) {
            mo163970c(renderInfo.getRenderWidth(), renderInfo.getRenderHeight());
            C112478a.m153624b("BaseMultiVideoCompositionEffect", "assetsSize error %s, update as renderSize", this.f335851b);
        }
        C87412m.m108590c(ciContext.getRenderContext().eglContext(), "context.renderContext.eglContext()");
        CMTime time = renderInfo.getTime();
        C87412m.m108590c(time, "renderInfo.time");
        long j = (long) 1000;
        long timeUs = time.getTimeUs() / j;
        if (imageCollection == null) {
            return null;
        }
        LinkedList<C13604l> linkedList = new LinkedList<>();
        for (ImageCollection.TrackImagePair next : imageCollection.getVideoChannelImages()) {
            C87412m.m108590c(next, LocaleUtil.ITALIAN);
            TAVVideoCompositionTrack track = next.getTrack();
            if (track != null) {
                TAVClip tAVClip = (TAVClip) track;
                if (!(tAVClip.getResource() instanceof TAVEmptyResource)) {
                    CMTime startTime = tAVClip.getStartTime();
                    C87412m.m108590c(startTime, "clip.startTime");
                    long timeUs2 = startTime.getTimeUs() / j;
                    CMTime duration = tAVClip.getDuration();
                    C87412m.m108590c(duration, "clip.duration");
                    long timeUs3 = (duration.getTimeUs() / j) + timeUs2 + 1;
                    if (timeUs2 <= timeUs && timeUs3 > timeUs) {
                        Object extraTrackInfo = tAVClip.getExtraTrackInfo("key_extra_track");
                        if (!(extraTrackInfo instanceof C110801c)) {
                            extraTrackInfo = null;
                        }
                        C110801c cVar = (C110801c) extraTrackInfo;
                        if (cVar != null) {
                            linkedList.add(new C13604l(cVar, next.getImage()));
                        }
                    }
                }
            } else {
                throw new C110660q("null cannot be cast to non-null type com.tencent.tavkit.composition.TAVClip");
            }
        }
        LinkedList<C110804g> linkedList2 = new LinkedList<>();
        for (C13604l lVar : linkedList) {
            CIImage cIImage = (CIImage) lVar.f38556e;
            int i = (int) cIImage.getSize().width;
            int i2 = (int) cIImage.getSize().height;
            if (i > 0 && i2 > 0) {
                Integer valueOf = Integer.valueOf(i);
                Integer valueOf2 = Integer.valueOf(i2);
                LinkedList linkedList3 = this.f335850a.get(new C13604l(valueOf, valueOf2));
                TextureInfo newTextureInfo = !(linkedList3 == null || linkedList3.isEmpty()) ? (TextureInfo) linkedList3.removeFirst() : CIContext.newTextureInfo(valueOf.intValue(), valueOf2.intValue());
                ((CIImage) lVar.f38556e).applyFlip(false, true);
                ciContext.convertImageToTexture((CIImage) lVar.f38556e, newTextureInfo);
                ((CIImage) lVar.f38556e).reset();
                C87412m.m108590c(newTextureInfo, "sourceTextureInfo");
                linkedList2.add(new C110804g((C110801c) lVar.f38555d, newTextureInfo));
            }
        }
        TextureInfo a = mo163968a(ciContext, timeUs, linkedList2);
        for (C110804g gVar : linkedList2) {
            C13604l lVar2 = new C13604l(Integer.valueOf(gVar.f331492b.width), Integer.valueOf(gVar.f331492b.height));
            ArrayMap<C13604l<Integer, Integer>, LinkedList<TextureInfo>> arrayMap = this.f335850a;
            LinkedList<TextureInfo> linkedList4 = arrayMap.get(lVar2);
            if (linkedList4 == null) {
                linkedList4 = new LinkedList<>();
                arrayMap.put(lVar2, linkedList4);
            }
            linkedList4.add(gVar.f331492b);
        }
        CIImage cIImage2 = new CIImage(a);
        cIImage2.applyFlip(false, true);
        cIImage2.applyFillInFrame(new CGRect(0.0f, 0.0f, (float) renderInfo.getRenderWidth(), (float) renderInfo.getRenderHeight()), this.f335852c);
        return cIImage2;
    }

    /* renamed from: b */
    public final void mo163969b(TAVVideoConfiguration.TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode) {
        C87412m.m108595h(tAVVideoConfigurationContentMode, "newMode");
        C112478a.m153625c("BaseMultiVideoCompositionEffect", "setVideoConfigurationContentMode newMode:" + tAVVideoConfigurationContentMode, new Object[0]);
        this.f335852c = tAVVideoConfigurationContentMode;
    }

    /* renamed from: c */
    public void mo163970c(int i, int i2) {
        C112478a.m153625c("BaseMultiVideoCompositionEffect", "updateRenderSize width:" + i + ", height:" + i2, new Object[0]);
        this.f335851b = new Size(i, i2);
    }

    public void release() {
        C112478a.m153625c("BaseMultiVideoCompositionEffect", "release: " + this, new Object[0]);
        ArrayMap<C13604l<Integer, Integer>, LinkedList<TextureInfo>> arrayMap = this.f335850a;
        ArrayList<TextureInfo> arrayList = new ArrayList<>();
        for (Map.Entry<C13604l<Integer, Integer>, LinkedList<TextureInfo>> value : arrayMap.entrySet()) {
            C64175a0.m75508p(arrayList, (LinkedList) value.getValue());
        }
        for (TextureInfo release : arrayList) {
            release.release();
        }
        this.f335850a.clear();
    }
}
