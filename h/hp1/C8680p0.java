package hp1;

import ak1.C54067f0;
import android.view.View;
import cm1.C0712b0;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import te3.C48868bk1;

/* renamed from: hp1.p0 */
public final class C8680p0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f27871d;

    /* renamed from: e */
    public final /* synthetic */ C8684r0 f27872e;

    public C8680p0(int i, C8684r0 r0Var) {
        this.f27871d = i;
        this.f27872e = r0Var;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$MixSearchProfileAdapter$bindData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Object tag = view.getTag();
        C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchInfo");
        C48868bk1 bk12 = (C48868bk1) tag;
        FinderContact finderContact = bk12.f131162d;
        boolean z = false;
        if (finderContact != null && finderContact.liveStatus == 1) {
            z = true;
        }
        if (z) {
            C8777j5 j5Var = (C8777j5) C86312j.m106911c(C8777j5.class);
            FinderContact finderContact2 = bk12.f131162d;
            if (finderContact2 == null || (str = finderContact2.username) == null) {
                str = "";
            }
            j5Var.mo9604Pw((C0712b0) null, str, (long) this.f27871d, C54067f0.C54078q.LIVE_AUDIENCE_CLICK_SINGLE_AVATAR, "23");
        }
        this.f27872e.f27879e.mo3914n1(bk12, this.f27871d - 1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$MixSearchProfileAdapter$bindData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
