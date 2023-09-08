package rs1;

import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import di3.C86312j;
import dp1.C7435f2;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import p185kq.C10383h;
import rx3.C13598b0;

/* renamed from: rs1.h2 */
public final class C13257h2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32226l<FinderCommentInfo, C13598b0> f37629d;

    /* renamed from: e */
    public final /* synthetic */ FinderCommentInfo f37630e;

    /* renamed from: f */
    public final /* synthetic */ C13282j2 f37631f;

    public C13257h2(C32226l<? super FinderCommentInfo, C13598b0> lVar, FinderCommentInfo finderCommentInfo, C13282j2 j2Var) {
        this.f37629d = lVar;
        this.f37630e = finderCommentInfo;
        this.f37631f = j2Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedHotCommentUIC$onBindView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<FinderCommentInfo, C13598b0> lVar = this.f37629d;
        if (lVar != null) {
            lVar.invoke(this.f37630e);
        }
        C13282j2 j2Var = this.f37631f;
        long j = j2Var.f37700g;
        j2Var.getClass();
        Class cls = C10383h.class;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        long j2 = ((LinkedHashMap) j2Var.f37704n).get(Long.valueOf(j));
        if (j2 == null) {
            j2 = 0L;
        }
        jSONObject2.put("cid", ((C10383h) C86312j.m106911c(cls)).mo10700XQ(j2Var.f37701h));
        jSONObject2.put("feedid", ((C10383h) C86312j.m106911c(cls)).mo10700XQ(j));
        jSONObject2.put("current_play_sec", j2);
        jSONObject2.put("video_duration", j2Var.f37702i);
        jSONObject2.put("expose_start_time", j2Var.f37699f);
        jSONObject.put("hot_comment", jSONObject2);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(j2Var.getContext());
        C7435f2.f25626a.mo8577a(f != null ? f.mo12861q3() : null, "hot_comment", 1, jSONObject);
        C13282j2 j2Var2 = this.f37631f;
        j2Var2.mo12736m3(j2Var2.f37700g, 2);
        this.f37631f.f37703j = true;
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedHotCommentUIC$onBindView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
