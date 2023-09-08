package rf2;

import android.app.Activity;
import com.tencent.p014mm.plugin.profile.p088ui.tab.view.BizProfileTopicFlowView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import mf2.C47023f;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C49425fi;

/* renamed from: rf2.a */
public final class C48023a {

    /* renamed from: a */
    public final Activity f128815a;

    /* renamed from: b */
    public final ArrayList<C49425fi> f128816b;

    /* renamed from: c */
    public final String f128817c = "BizProfileTopicFlowController";

    /* renamed from: d */
    public final ArrayList<C47023f> f128818d = new ArrayList<>();

    /* renamed from: e */
    public BizProfileTopicFlowView f128819e;

    /* renamed from: f */
    public C32226l<? super C47023f, C13598b0> f128820f;

    /* renamed from: g */
    public C32226l<? super Boolean, C13598b0> f128821g;

    public C48023a(Activity activity, ArrayList<C49425fi> arrayList) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(arrayList, "outerDataList");
        this.f128815a = activity;
        this.f128816b = arrayList;
    }

    /* renamed from: a */
    public final void mo72803a(ArrayList<C49425fi> arrayList) {
        C87412m.m108594g(arrayList, "newDataList");
        this.f128818d.clear();
        ArrayList<C47023f> arrayList2 = this.f128818d;
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (C49425fi fVar : arrayList) {
            arrayList3.add(new C47023f(fVar));
        }
        arrayList2.addAll(arrayList3);
        if (this.f128818d.isEmpty()) {
            BizProfileTopicFlowView bizProfileTopicFlowView = this.f128819e;
            if (bizProfileTopicFlowView != null) {
                bizProfileTopicFlowView.setVisibility(8);
            }
        } else {
            BizProfileTopicFlowView bizProfileTopicFlowView2 = this.f128819e;
            if (bizProfileTopicFlowView2 != null) {
                bizProfileTopicFlowView2.setVisibility(0);
            }
        }
        BizProfileTopicFlowView bizProfileTopicFlowView3 = this.f128819e;
        if (bizProfileTopicFlowView3 != null) {
            bizProfileTopicFlowView3.mo24112c();
        }
        String str = this.f128817c;
        Log.m105924i(str, "refresh, dataList size:" + this.f128818d.size());
    }
}
