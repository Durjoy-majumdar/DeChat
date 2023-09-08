package n20;

import a14.C0000n0;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import fy3.C32227p;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.imageloader.CommonShowImagePPC$onCreate$1$1$1", mo125469f = "CommonShowImagePPC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: n20.n */
public final class C61608n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C61606l f175200d;

    /* renamed from: e */
    public final /* synthetic */ PipelineState f175201e;

    /* renamed from: f */
    public final /* synthetic */ C61609o f175202f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61608n(C61606l lVar, PipelineState pipelineState, C61609o oVar, C15601d<? super C61608n> dVar) {
        super(2, dVar);
        this.f175200d = lVar;
        this.f175201e = pipelineState;
        this.f175202f = oVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61608n(this.f175200d, this.f175201e, this.f175202f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61608n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        ImageView imageView = this.f175200d.f175199c.get();
        if (imageView != null) {
            if (!C87412m.m108589b(imageView.getTag(C0966R.C0970id.oel), this.f175200d.f175197a)) {
                imageView = null;
            }
            if (imageView != null) {
                imageView.setImageBitmap(this.f175200d.f175198b);
            }
        }
        Map map = (Map) this.f175201e.get("Common_ImageViewRefMap");
        if (map != null) {
            C61606l lVar = this.f175200d;
            List<WeakReference> list = (List) map.get(lVar.f175197a);
            if (list != null) {
                for (WeakReference weakReference : list) {
                    ImageView imageView2 = (ImageView) weakReference.get();
                    if (imageView2 != null) {
                        if (!C87412m.m108589b(imageView2.getTag(C0966R.C0970id.oel), lVar.f175197a)) {
                            imageView2 = null;
                        }
                        if (imageView2 != null) {
                            imageView2.setImageBitmap(lVar.f175198b);
                        }
                    }
                }
            }
            List list2 = (List) map.remove(lVar.f175197a);
        }
        this.f175202f.dispatch(new C61607m());
        return C13598b0.f38549a;
    }
}
