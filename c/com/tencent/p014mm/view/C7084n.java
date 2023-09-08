package com.tencent.p014mm.view;

import android.graphics.Rect;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.view.n */
public final class C7084n extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RefreshLoadMoreLayout f24964d;

    /* renamed from: e */
    public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f24965e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7084n(RefreshLoadMoreLayout refreshLoadMoreLayout, RefreshLoadMoreLayout.C7080c<Object> cVar) {
        super(0);
        this.f24964d = refreshLoadMoreLayout;
        this.f24965e = cVar;
    }

    public Object invoke() {
        int i;
        int[] iArr = new int[2];
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f24964d;
        View view = refreshLoadMoreLayout.f165626x;
        boolean z = true;
        if (view != null) {
            view.getLocationInWindow(iArr);
            int i2 = iArr[1];
            Log.m105918d("MicroMsg.RLMoreLayout", "loadMoreFooter top=" + i2);
            Rect rect = new Rect();
            if (refreshLoadMoreLayout.getGlobalVisibleRect(rect)) {
                int parentTranslation = rect.bottom + refreshLoadMoreLayout.getParentTranslation();
                Log.m105918d("MicroMsg.RLMoreLayout", "parentBottom=" + parentTranslation);
                i = parentTranslation - i2;
            } else {
                float translationY = refreshLoadMoreLayout.getTranslationY() - ((float) (-refreshLoadMoreLayout.f165600A));
                Log.m105918d("MicroMsg.RLMoreLayout", "reset offset=" + translationY);
                i = (int) translationY;
            }
        } else {
            i = 0;
        }
        float translationY2 = this.f24964d.getTranslationY() + ((float) i);
        RefreshLoadMoreLayout.C7080c<Object> cVar = this.f24965e;
        if (i <= 0) {
            z = false;
        }
        cVar.f24954i = z;
        if (this.f24964d.getDEBUG()) {
            Log.m105924i("MicroMsg.RLMoreLayout", "onPreFinishLoadMoreSmooth " + this.f24964d.getTranslationY() + " rectHeight:" + i + " targetY:" + translationY2);
        }
        RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f24964d;
        int i3 = refreshLoadMoreLayout2.f165600A;
        if (translationY2 >= ((float) (-i3))) {
            translationY2 = -((float) i3);
        }
        refreshLoadMoreLayout2.setTranslationY(translationY2);
        this.f24964d.getRecyclerView().scrollBy(0, i);
        View view2 = this.f24964d.f165626x;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout$onPreFinishLoadMoreSmooth$1$innerFunc$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/view/RefreshLoadMoreLayout$onPreFinishLoadMoreSmooth$1$innerFunc$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return C13598b0.f38549a;
    }
}
