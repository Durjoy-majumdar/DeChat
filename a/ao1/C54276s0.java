package ao1;

import android.content.Intent;
import android.os.Bundle;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import dp1.C58408t0;
import dr1.C7470a;
import er1.C58684b;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60213x3;
import nj3.C76912y0;
import org.json.JSONObject;
import p166hy.C98567o0;
import rx3.C13598b0;
import te3.C52271zj0;
import up1.C37521f;
import z04.C112551y;

/* renamed from: ao1.s0 */
public final class C54276s0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ PostMainUIC f152337d;

    /* renamed from: e */
    public final /* synthetic */ long f152338e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54276s0(PostMainUIC postMainUIC, long j) {
        super(0);
        this.f152337d = postMainUIC;
        this.f152338e = j;
    }

    public Object invoke() {
        this.f152337d.mo78419P3(1);
        PostMainUIC postMainUIC = this.f152337d;
        postMainUIC.f160263R = true;
        postMainUIC.f160259M = 10;
        if (C54264e.f152304b != null) {
            Log.m105924i("Finder.PostCallbackMgr", "doCallback state:1 errMsg:");
            C60213x3 x3Var = C54264e.f152304b;
            if (x3Var != null) {
                x3Var.mo5408a(1, "");
            }
            C54264e.f152304b = null;
            PostMainUIC postMainUIC2 = this.f152337d;
            if (postMainUIC2.f160262Q != 19) {
                C76912y0.m92768g(postMainUIC2.getContext(), this.f152337d.getResources().getString(C0966R.string.eij));
            }
        } else {
            long j = this.f152338e;
            Class cls = C58684b.class;
            FinderTimelineUIC.f18784i = true;
            C7470a aVar = postMainUIC.f160287x;
            if (aVar != null) {
                C52271zj0 i = aVar.mo8613i();
                String stringExtra = postMainUIC.getIntent().getStringExtra("key_activity_src_type");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                if (i != null) {
                    if (!(stringExtra.length() == 0)) {
                        String str = i.f146007f;
                        if (!(str == null || str.length() == 0)) {
                            postMainUIC.f160268W.put("ActiveId", postMainUIC.getIntent().getLongExtra("key_topic_id", 0));
                        } else {
                            postMainUIC.f160268W.put("Activeid", "");
                        }
                        JSONObject jSONObject = postMainUIC.f160268W;
                        C87412m.m108594g(jSONObject, "activeId");
                        FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
                        if (finderFeedReportObject != null) {
                            String jSONObject2 = jSONObject.toString();
                            C87412m.m108593f(jSONObject2, "activeId.toString()");
                            finderFeedReportObject.activeInfo = C112551y.m153814n(jSONObject2, ",", ";", false);
                        }
                    }
                }
                int i2 = postMainUIC.f160262Q;
                if (i2 == 5 || i2 == 6 || i2 == 8 || i2 == 20) {
                    C37521f.f99374d.getClass();
                    if (C37521f.f99420i1.mo60266n().intValue() == 1) {
                        if (postMainUIC.getContext().getIntent().getBooleanExtra("KEY_POST_DIRECTLY_FROM_SNS", false)) {
                            Intent intent = new Intent();
                            intent.addFlags(67108864);
                            intent.addFlags(536870912);
                            Bundle bundle = new Bundle();
                            bundle.putLong("key_finder_post_local_id", j);
                            if (!Util.isNullOrNil(postMainUIC.getIntent().getStringExtra("key_context_id"))) {
                                bundle.putString("key_context_id", postMainUIC.getIntent().getStringExtra("key_context_id"));
                            }
                            intent.putExtra("key_finder_bundle_info", bundle);
                            ((C98567o0) C86312j.m106911c(C98567o0.class)).yb0(postMainUIC.getContext(), intent, -1, new C98567o0.C76249a(true, false, false, false, 0, (String) null, false, false, 254, (C8480h) null));
                        } else {
                            Intent intent2 = new Intent();
                            intent2.putExtra("KEY_FINDER_POST_FINISH_JUMP_FOLLOW_TAB", true);
                            intent2.putExtra("key_finder_post_local_id", j);
                            if (postMainUIC.f160262Q == 8) {
                                intent2.putExtra("KEY_FROM_SDK_SHARE", true);
                            }
                            if (postMainUIC.f160262Q == 20) {
                                intent2.putExtra("KEY_FROM_SNS_SYNC_POST", true);
                            }
                            if (!Util.isNullOrNil(postMainUIC.getIntent().getStringExtra("key_context_id"))) {
                                intent2.putExtra("key_context_id", postMainUIC.getIntent().getStringExtra("key_context_id"));
                            }
                            C7335d c = C86312j.m106911c(cls);
                            C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
                            C58684b.by0((C58684b) c, postMainUIC.getActivity(), intent2, 0, false, 12, (Object) null);
                        }
                        postMainUIC.getActivity().overridePendingTransition(0, 0);
                        postMainUIC.getActivity().finish();
                        this.f152337d.mo78413J3();
                        this.f152337d.mo78423d3(((C54270m1) C39818r.f106831a.mo62444c(this.f152337d.getActivity()).mo75002a(C54270m1.class)).mo75060c3());
                    }
                }
                int i3 = postMainUIC.f160262Q;
                if (!(i3 == -1 || i3 == 19)) {
                    Intent intent3 = new Intent();
                    intent3.putExtra("key_finder_post_router", postMainUIC.f160262Q);
                    ((C58684b) C86312j.m106911c(cls)).mo83582c0(postMainUIC.getActivity(), intent3);
                }
                postMainUIC.getActivity().finish();
                this.f152337d.mo78413J3();
                this.f152337d.mo78423d3(((C54270m1) C39818r.f106831a.mo62444c(this.f152337d.getActivity()).mo75002a(C54270m1.class)).mo75060c3());
            } else {
                C87412m.m108603p("activityWidget");
                throw null;
            }
        }
        this.f152337d.getActivity().finish();
        return C13598b0.f38549a;
    }
}
