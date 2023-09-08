package com.tencent.p014mm.view;

import android.graphics.Rect;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.view.k */
public final class C7083k extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ RefreshLoadMoreLayout f24962d;

    /* renamed from: e */
    public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f24963e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7083k(RefreshLoadMoreLayout refreshLoadMoreLayout, RefreshLoadMoreLayout.C7080c<Object> cVar) {
        super(0);
        this.f24962d = refreshLoadMoreLayout;
        this.f24963e = cVar;
    }

    public Object invoke() {
        int i;
        View findViewById;
        View findViewById2;
        this.f24962d.animate().cancel();
        int[] iArr = new int[2];
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f24962d;
        View view = refreshLoadMoreLayout.f165626x;
        if (view != null) {
            RefreshLoadMoreLayout.C7080c<Object> cVar = this.f24963e;
            view.getLocationInWindow(iArr);
            int i2 = iArr[1];
            Log.m105918d("MicroMsg.RLMoreLayout", "loadMoreFooter top=" + i2 + " isSliceNoShowLoadingRefresh=" + cVar.f24955j);
            Rect rect = new Rect();
            if (refreshLoadMoreLayout.getGlobalVisibleRect(rect)) {
                int i3 = rect.bottom;
                Log.m105918d("MicroMsg.RLMoreLayout", "parentBottom=" + i3);
                i = i3 - i2;
            } else {
                float translationY = refreshLoadMoreLayout.getTranslationY() - ((float) (-refreshLoadMoreLayout.f165600A));
                Log.m105918d("MicroMsg.RLMoreLayout", "reset offset=" + translationY);
                i = (int) translationY;
            }
        } else {
            i = 0;
        }
        RefreshLoadMoreLayout.C7080c<Object> cVar2 = this.f24963e;
        cVar2.f24954i = i > 0;
        if (cVar2.f24955j) {
            this.f24962d.setTranslationY(this.f24962d.getTranslationY() + ((float) i));
            View view2 = this.f24962d.f165626x;
            if (view2 != null && view2.getVisibility() == 0) {
                this.f24963e.f24956k = true;
            }
            View view3 = this.f24962d.f165626x;
            if (view3 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view4 = view3;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh2$1$innerFunc$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh2$1$innerFunc$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        float f = -((float) this.f24962d.f165600A);
        Log.m105924i("MicroMsg.RLMoreLayout", "[onFinishRefresh2] targetY=" + f + " isSliceNoShowLoadingRefresh=" + this.f24963e.f24955j);
        if (!this.f24963e.f24955j) {
            this.f24962d.setTranslationY(f);
        }
        View refreshHeader = this.f24962d.getRefreshHeader();
        if (refreshHeader != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            View view5 = refreshHeader;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh2$1$innerFunc$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            refreshHeader.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh2$1$innerFunc$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View refreshHeader2 = this.f24962d.getRefreshHeader();
        if (!(refreshHeader2 == null || (findViewById2 = refreshHeader2.findViewById(C0966R.C0970id.ive)) == null)) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = findViewById2;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh2$1$innerFunc$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh2$1$innerFunc$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View refreshHeader3 = this.f24962d.getRefreshHeader();
        if (refreshHeader3 == null || (findViewById = refreshHeader3.findViewById(C0966R.C0970id.iji)) == null) {
            return null;
        }
        C9556a aVar4 = new C9556a();
        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
        aVar4.mo10233c(8);
        View view7 = findViewById;
        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh2$1$innerFunc$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishRefresh2$1$innerFunc$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return findViewById;
    }
}
