package p595ll;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30769q2;
import fy3.C32226l;
import gy3.C87413o;
import p595ll.C34294c;
import rx3.C13598b0;

/* renamed from: ll.g */
public final class C34298g extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public static final C34298g f92433d = new C34298g();

    public C34298g() {
        super(1);
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        C30769q2 a = C30769q2.C30770a.f82743a.mo57693a(intValue);
        Log.m105924i("MicroMsg.EmojiPackSyncManager", "checkPack: checkDesigner " + intValue + ' ' + a.f82742c.size());
        if (a.f82742c.isEmpty()) {
            new C34294c.C34295a(intValue, (C32226l<? super Boolean, C13598b0>) null).mo59552b();
        }
        return C13598b0.f38549a;
    }
}
