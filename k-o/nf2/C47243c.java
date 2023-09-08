package nf2;

import com.tencent.p014mm.plugin.profile.p088ui.tab.list.BizProfileTabMsgFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import kf2.C46720a;
import kf2.C46721b;
import rx3.C13598b0;

/* renamed from: nf2.c */
public final class C47243c extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizProfileTabMsgFragment f126826d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47243c(BizProfileTabMsgFragment bizProfileTabMsgFragment) {
        super(1);
        this.f126826d = bizProfileTabMsgFragment;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Log.m105924i(this.f126826d.f115700j, "user click topic arrow");
        if (booleanValue) {
            C46721b bVar = new C46721b();
            bVar.f125775a = 2002;
            bVar.f125776b = true;
            C46720a.f125771a.mo71961a(bVar);
        }
        return C13598b0.f38549a;
    }
}
