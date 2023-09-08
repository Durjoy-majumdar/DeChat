package ol1;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.C16569a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di1.C7333c;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import il1.C8961e;
import ok1.C11471u;

/* renamed from: ol1.a */
public abstract class C11475a<LiveData> extends C8961e implements C0120a0<LiveData> {

    /* renamed from: h */
    public final C0125s f33735h;

    /* renamed from: i */
    public final C7333c<LiveData> f33736i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11475a(Context context, C0125s sVar) {
        super(context, false, (C11471u.C11473b) null, 6, (C8480h) null);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(sVar, "owner");
        this.f33735h = sVar;
        C7333c<LiveData> cVar = new C7333c<>((C32227p) null, 1, (C8480h) null);
        this.f33736i = cVar;
        cVar.observe(sVar, this);
    }

    /* renamed from: q */
    public C7333c<LiveData> mo11445q() {
        if (!this.f33736i.hasObservers()) {
            Log.m105924i("BaseWishPanelWidget", "getViewData reobserve: " + this.f33735h);
            this.f33736i.observe(this.f33735h, this);
        }
        return this.f33736i;
    }

    /* renamed from: r */
    public void mo11446r(ConstraintLayout constraintLayout) {
        C87412m.m108594g(constraintLayout, "giftPanelLayout");
        C16569a aVar = new C16569a();
        aVar.mo16716c(constraintLayout);
        int childCount = constraintLayout.getChildCount();
        if (childCount == 1) {
            View childAt = constraintLayout.getChildAt(0);
            aVar.mo16718e(childAt.getId(), 1, 0, 1, 0);
            aVar.mo16717d(childAt.getId(), 2, 0, 2);
            aVar.mo16723k(childAt.getId(), 0);
        } else if (childCount == 2) {
            View childAt2 = constraintLayout.getChildAt(0);
            aVar.mo16718e(childAt2.getId(), 1, 0, 1, 0);
            aVar.mo16717d(childAt2.getId(), 2, constraintLayout.getChildAt(1).getId(), 1);
            aVar.mo16723k(childAt2.getId(), 2);
            View childAt3 = constraintLayout.getChildAt(1);
            aVar.mo16718e(childAt3.getId(), 1, constraintLayout.getChildAt(0).getId(), 2, (int) childAt3.getContext().getResources().getDimension(C0966R.dimen.f3736cp));
            aVar.mo16717d(childAt3.getId(), 2, 0, 2);
            aVar.mo16723k(childAt3.getId(), 0);
        } else if (childCount == 3) {
            View childAt4 = constraintLayout.getChildAt(0);
            aVar.mo16718e(childAt4.getId(), 1, 0, 1, 0);
            aVar.mo16717d(childAt4.getId(), 2, constraintLayout.getChildAt(1).getId(), 1);
            aVar.mo16723k(childAt4.getId(), 1);
            View childAt5 = constraintLayout.getChildAt(1);
            aVar.mo16718e(childAt5.getId(), 1, constraintLayout.getChildAt(0).getId(), 2, 0);
            aVar.mo16717d(childAt5.getId(), 2, constraintLayout.getChildAt(2).getId(), 1);
            aVar.mo16723k(childAt5.getId(), 0);
            View childAt6 = constraintLayout.getChildAt(2);
            aVar.mo16718e(childAt6.getId(), 1, constraintLayout.getChildAt(1).getId(), 2, 0);
            aVar.mo16717d(childAt6.getId(), 2, 0, 2);
            aVar.mo16723k(childAt6.getId(), 0);
        }
        aVar.mo16714a(constraintLayout);
        constraintLayout.setConstraintSet((C16569a) null);
    }
}
