package n20;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.pipeline.FlowPipelineComponent;
import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineFailAction;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.pipeline.PipelineSuccessAction;
import com.tencent.p014mm.sdk.pipeline.anno.PipelineFlow;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import com.tencent.p014mm.vfs.C86009m1;
import gc0.C20828a;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import wb0.C102382b;
import wb0.C102383c;

/* renamed from: n20.h */
public class C100035h extends FlowPipelineComponent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100035h(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    public String getUniqueKey() {
        return state().getStringOrInterrupt("Common_ImageKey");
    }

    @PipelineFlow
    public BaseStateAction handleConvertDataToBitmap(PipelineState pipelineState, C100032b bVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(bVar, "action");
        WeakReference weakReference = (WeakReference) pipelineState.getOrInterrupt("Common_ImageViewRef");
        Bitmap bitmap = bVar.f293061b;
        if (bitmap == null) {
            return new PipelineFailAction((PipelineState) null, 1, (C8480h) null);
        }
        C20828a.m22825b().mo32526o(bVar.f293060a, bitmap);
        return new C61606l(bVar.f293060a, bitmap, weakReference);
    }

    @PipelineFlow
    public BaseStateAction handleDataFromFile(PipelineState pipelineState, C100037j jVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(jVar, "action");
        C61605g gVar = (C61605g) pipelineState.getOrInterrupt("Common_BitmapOptions");
        byte[] bArr = jVar.f293066c;
        return bArr != null ? new C100031a(jVar.f293064a, bArr, gVar) : new C102382b(jVar.f293064a, jVar.f293065b);
    }

    @PipelineFlow
    public BaseStateAction handleDataFromRemote(PipelineState pipelineState, C102383c cVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(cVar, "action");
        C61605g gVar = (C61605g) pipelineState.getOrInterrupt("Common_BitmapOptions");
        byte[] bArr = cVar.f301544c;
        return bArr != null ? new C100031a(cVar.f301542a, bArr, gVar) : new PipelineFailAction((PipelineState) null, 1, (C8480h) null);
    }

    @PipelineFlow
    public BaseStateAction handleShowImageDone(PipelineState pipelineState, C61607m mVar) {
        C87412m.m108594g(pipelineState, "state");
        C87412m.m108594g(mVar, "action");
        return new PipelineSuccessAction((PipelineState) null, 1, (C8480h) null);
    }

    public BaseStateAction start(PipelineState pipelineState) {
        ImageView imageView;
        C87412m.m108594g(pipelineState, "state");
        String stringOrInterrupt = state().getStringOrInterrupt("Common_ImageKey");
        C61605g gVar = (C61605g) state().getOrInterrupt("Common_BitmapOptions");
        WeakReference weakReference = (WeakReference) state().getOrInterrupt("Common_ImageViewRef");
        String i = new C86009m1((C86009m1) state().getOrInterrupt("Common_TempFolder"), stringOrInterrupt).mo119971i();
        C87412m.m108593f(i, "VFSFile(tempFolder, imageKey).absolutePath");
        Bitmap e = C20828a.m22825b().mo32516e(stringOrInterrupt);
        if (e != null) {
            ImageView imageView2 = (ImageView) weakReference.get();
            if (imageView2 != null) {
                imageView2.setImageBitmap(e);
            }
            Log.m105924i("MicroMsg.ImageLoader.CommonImageLoaderFlowPPC", "onCreateAfter setImageBitmap From Cache " + stringOrInterrupt);
            return new PipelineSuccessAction((PipelineState) null, 1, (C8480h) null);
        }
        ImageView imageView3 = (ImageView) weakReference.get();
        if (imageView3 != null) {
            imageView3.setTag(C0966R.C0970id.oel, stringOrInterrupt);
        }
        if (gVar.f175195d != 0) {
            ImageView imageView4 = (ImageView) weakReference.get();
            if (imageView4 != null) {
                imageView4.setImageResource(gVar.f175195d);
            }
        } else if (!(gVar.f175196e == null || (imageView = (ImageView) weakReference.get()) == null)) {
            imageView.setImageBitmap(gVar.f175196e);
        }
        return new C100036i(stringOrInterrupt, i);
    }
}
