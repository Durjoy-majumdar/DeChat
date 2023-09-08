package zr2;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60197r4;
import ht1.C60200t1;
import rx3.C13598b0;

/* renamed from: zr2.d */
public final class C66983d extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ long f192443d;

    /* renamed from: e */
    public final /* synthetic */ int f192444e;

    /* renamed from: f */
    public final /* synthetic */ int f192445f;

    /* renamed from: g */
    public final /* synthetic */ C8478d0 f192446g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66983d(long j, int i, int i2, C8478d0 d0Var) {
        super(1);
        this.f192443d = j;
        this.f192444e = i;
        this.f192445f = i2;
        this.f192446g = d0Var;
    }

    public Object invoke(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2");
        String str = (String) obj;
        Class cls = C60200t1.class;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2");
        C87412m.m108594g(str, "keyword");
        Log.m105924i("MicroMsg.SnsKeywordMatcher", "click keyword:" + str);
        C60197r4.C33073b bVar = (C60197r4.C33073b) C66976a.m79130a().get(str);
        Intent intent = new Intent();
        intent.putExtra("key_topic_type", 9);
        intent.putExtra("key_hot_word", str);
        intent.putExtra("key_jump_scene", 0);
        intent.putExtra("key_pass_by_info", bVar != null ? bVar.f89800e : null);
        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 17, 115, intent);
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        ((C60200t1) C86312j.m106911c(cls)).Ur0(context, intent);
        C94866e1.my0().post(new C26713c(this.f192443d, this.f192444e, str, this.f192445f, this.f192446g));
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2");
        return b0Var;
    }
}
