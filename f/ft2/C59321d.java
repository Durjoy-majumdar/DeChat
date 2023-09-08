package ft2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import di3.C86312j;
import h81.C59774i;
import java.util.HashMap;
import java.util.Map;
import q31.C118148a;
import te3.C64623p81;

/* renamed from: ft2.d */
public class C59321d implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ C64623p81 f169621a;

    /* renamed from: b */
    public final /* synthetic */ TimeLineObject f169622b;

    public C59321d(C97979c cVar, C64623p81 p812, TimeLineObject timeLineObject) {
        this.f169621a = p812;
        this.f169622b = timeLineObject;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public Map<String, Object> mo37b(String str) {
        Class cls = C59774i.class;
        SnsMethodCalculate.markStartTimeMs("getDynamicParams", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$3");
        HashMap hashMap = new HashMap();
        hashMap.put("behaviour_session_id", ((C59774i) C86312j.m106911c(cls)).mo84751Wb());
        hashMap.put("finder_context_id", ((C59774i) C86312j.m106911c(cls)).mo84747E());
        hashMap.put("finder_tab_context_id", ((C59774i) C86312j.m106911c(cls)).mo84749S0());
        if (this.f169621a.f184791t == 1) {
            hashMap.put("live_enter_status", 1);
        } else {
            hashMap.put("live_enter_status", 2);
        }
        hashMap.put("share_username", this.f169622b.UserName);
        SnsMethodCalculate.markEndTimeMs("getDynamicParams", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$3");
        return hashMap;
    }
}
