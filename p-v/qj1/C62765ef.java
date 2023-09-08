package qj1;

import cl1.C54951d;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: qj1.ef */
public final class C62765ef extends C87413o implements C32224a<Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C63170ze f178173d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62765ef(C63170ze zeVar) {
        super(0);
        this.f178173d = zeVar;
    }

    public Object invoke() {
        boolean z = ((C54951d) this.f178173d.mo87696x0(C54951d.class)).f154007o.getValue() == C54951d.C54952a.STARTUP_VIDEO_PLAYING;
        String str = this.f178173d.f179243q;
        StringBuilder sb = new StringBuilder();
        sb.append("switchInLiveRoom: isDetachInvokeFun:");
        boolean z2 = !z;
        sb.append(z2);
        Log.m105924i(str, sb.toString());
        return Boolean.valueOf(z2);
    }
}
