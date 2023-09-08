package er1;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.MenuItem;
import fy3.C32224a;
import gy3.C87413o;
import qo3.C77407n;
import rx3.C13598b0;

/* renamed from: er1.o2 */
public final class C7848o2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MenuItem f26424d;

    /* renamed from: e */
    public final /* synthetic */ Activity f26425e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f26426f;

    /* renamed from: g */
    public final /* synthetic */ C77407n f26427g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7848o2(MenuItem menuItem, Activity activity, Bitmap bitmap, C77407n nVar) {
        super(0);
        this.f26424d = menuItem;
        this.f26425e = activity;
        this.f26426f = bitmap;
        this.f26427g = nVar;
    }

    public Object invoke() {
        this.f26424d.setIcon(new BitmapDrawable(this.f26425e.getResources(), this.f26426f));
        this.f26427g.mo107564i();
        return C13598b0.f38549a;
    }
}
