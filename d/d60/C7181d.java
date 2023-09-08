package d60;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: d60.d */
public final class C7181d extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7174c f25164d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7181d(C7174c cVar) {
        super(1);
        this.f25164d = cVar;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.f25164d.f25156s.setBackground(new BitmapDrawable(MMApplicationContext.getContext().getResources(), bitmap));
        }
        return C13598b0.f38549a;
    }
}
