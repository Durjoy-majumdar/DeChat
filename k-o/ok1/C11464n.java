package ok1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ok1.n */
public final class C11464n extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ View f33714d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Bitmap, C13598b0> f33715e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11464n(View view, C32226l<? super Bitmap, C13598b0> lVar) {
        super(1);
        this.f33714d = view;
        this.f33715e = lVar;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            View view = this.f33714d;
            if (view instanceof ImageView) {
                ((ImageView) view).setImageDrawable(new BitmapDrawable(MMApplicationContext.getContext().getResources(), bitmap));
            } else {
                view.setBackground(new BitmapDrawable(MMApplicationContext.getContext().getResources(), bitmap));
            }
            C32226l<Bitmap, C13598b0> lVar = this.f33715e;
            if (lVar != null) {
                lVar.invoke(bitmap);
            }
        } else {
            C32226l<Bitmap, C13598b0> lVar2 = this.f33715e;
            if (lVar2 != null) {
                lVar2.invoke(null);
            }
        }
        return C13598b0.f38549a;
    }
}
