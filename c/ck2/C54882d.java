package ck2;

import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32227p;
import gy3.C87413o;
import pj2.C62323d;
import rx3.C13598b0;

/* renamed from: ck2.d */
public final class C54882d extends C87413o implements C32227p<Boolean, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RingtoneDataUIC f153831d;

    /* renamed from: e */
    public final /* synthetic */ int f153832e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54882d(RingtoneDataUIC ringtoneDataUIC, int i) {
        super(2);
        this.f153831d = ringtoneDataUIC;
        this.f153832e = i;
    }

    public Object invoke(Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        WxRecyclerAdapter<C62323d> wxRecyclerAdapter = this.f153831d.f164076i;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyItemChanged(this.f153832e, Boolean.TRUE);
        }
        return C13598b0.f38549a;
    }
}
