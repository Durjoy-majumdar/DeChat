package n20;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.pipeline.ProcessorPipelineComponent;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import di3.C86312j;
import gy3.C87412m;
import wx3.C15601d;

/* renamed from: n20.c */
public final class C100033c extends ProcessorPipelineComponent<C100031a, C100032b> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100033c(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    public Object processAction(PipelineState pipelineState, BaseStateAction baseStateAction, C15601d dVar) {
        C100031a aVar = (C100031a) baseStateAction;
        Bitmap bitmap = null;
        if (ImgUtil.isWXGF(aVar.f293058b)) {
            byte[] Ir0 = ((C34739t) C86312j.m106911c(C34739t.class)).Ir0(aVar.f293058b);
            if (Ir0 != null) {
                C61605g gVar = aVar.f293059c;
                Bitmap decodeByteArray = BitmapUtil.decodeByteArray(Ir0, gVar.f175192a, gVar.f175193b, (Bitmap.Config) null);
                if (decodeByteArray != null) {
                    bitmap = decodeByteArray;
                }
            }
        } else {
            byte[] bArr = aVar.f293058b;
            C61605g gVar2 = aVar.f293059c;
            bitmap = BitmapUtil.decodeByteArray(bArr, gVar2.f175192a, gVar2.f175193b, (Bitmap.Config) null);
        }
        if (bitmap != null) {
            aVar.f293059c.getClass();
            float f = aVar.f293059c.f175194c;
            if (f > 0.0f) {
                bitmap = BitmapUtil.getRoundedCornerBitmap(bitmap, false, f * ((float) bitmap.getWidth()));
            }
        }
        Log.m105924i("MicroMsg.CommonConvertDataToBitmapPPC", "convert to bitmap " + C100039p.m130707a(bitmap));
        return new C100032b(aVar.f293057a, bitmap);
    }
}
