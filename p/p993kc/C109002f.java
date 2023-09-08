package p993kc;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kc.f */
public final class C109002f extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108996e f326489d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109002f(C108996e eVar) {
        super(1);
        this.f326489d = eVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Log.m105925i(this.f326489d.f326463a, "onInputDone#onShowKeyboard, fromDoneButton: %b, confirmHold: %b", Boolean.valueOf(booleanValue), Boolean.valueOf(this.f326489d.f326473k));
        return C13598b0.f38549a;
    }
}
