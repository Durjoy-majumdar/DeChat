package cp1;

import android.graphics.Bitmap;
import android.view.View;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import te3.C64662qp2;

/* renamed from: cp1.f */
public final class C57938f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C57939g f165822d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f165823e;

    /* renamed from: f */
    public final /* synthetic */ C64662qp2 f165824f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57938f(C57939g gVar, Bitmap bitmap, C64662qp2 qp22) {
        super(0);
        this.f165822d = gVar;
        this.f165823e = bitmap;
        this.f165824f = qp22;
    }

    public Object invoke() {
        this.f165822d.f165826d.setImageBitmap(this.f165823e);
        View view = this.f165822d.f165829g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayFragmentThumbView$setFragment$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayFragmentThumbView$setFragment$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f165822d.setDimension(((float) this.f165823e.getWidth()) / ((float) this.f165823e.getHeight()));
        C57939g gVar = this.f165822d;
        gVar.f165828f.setOnClickListener(new C57937e(gVar, this.f165824f));
        return C13598b0.f38549a;
    }
}
