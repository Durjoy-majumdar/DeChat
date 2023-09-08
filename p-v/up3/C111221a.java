package up3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest;
import com.tencent.tav.core.compositing.VideoCompositing;
import com.tencent.tav.core.compositing.VideoCompositionRenderContext;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;

/* renamed from: up3.a */
public final class C111221a implements VideoCompositing {
    public void cancelAllPendingVideoCompositionRequests() {
    }

    public void release() {
    }

    public void renderContextChanged(VideoCompositionRenderContext videoCompositionRenderContext) {
    }

    public HashMap<String, Object> requiredPixelBufferAttributesForRenderContext() {
        return null;
    }

    public HashMap<String, Object> sourcePixelBufferAttributes() {
        return null;
    }

    public void startVideoCompositionRequest(AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest) {
        List<Integer> sourceTrackIDs;
        if (asynchronousVideoCompositionRequest != null && (sourceTrackIDs = asynchronousVideoCompositionRequest.getSourceTrackIDs()) != null) {
            for (Integer num : sourceTrackIDs) {
                C87412m.m108590c(num, LocaleUtil.ITALIAN);
                asynchronousVideoCompositionRequest.finishWithComposedVideoFrame(asynchronousVideoCompositionRequest.sourceFrameByTrackID(num.intValue()));
            }
        }
    }
}
