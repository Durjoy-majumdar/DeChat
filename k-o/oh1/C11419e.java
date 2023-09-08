package oh1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: oh1.e */
public final class C11419e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f33592d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f33593e;

    /* renamed from: f */
    public final /* synthetic */ C11415c f33594f;

    /* renamed from: g */
    public final /* synthetic */ String f33595g;

    /* renamed from: h */
    public final /* synthetic */ C15601d<C13598b0> f33596h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11419e(Bitmap bitmap, ImageView imageView, C11415c cVar, String str, C15601d<? super C13598b0> dVar) {
        super(0);
        this.f33592d = bitmap;
        this.f33593e = imageView;
        this.f33594f = cVar;
        this.f33595g = str;
        this.f33596h = dVar;
    }

    public Object invoke() {
        Bitmap bitmap = this.f33592d;
        if (bitmap != null) {
            this.f33593e.setImageBitmap(bitmap);
        } else {
            String str = this.f33594f.f33580j;
            Log.m105924i(str, this.f33595g + " resource is null");
        }
        C15601d<C13598b0> dVar = this.f33596h;
        Result.Companion companion = Result.Companion;
        C13598b0 b0Var = C13598b0.f38549a;
        dVar.resumeWith(Result.m168114constructorimpl(b0Var));
        return b0Var;
    }
}
