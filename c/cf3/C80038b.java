package cf3;

import com.tencent.p014mm.recovery.p952ui.RecoveryUI;
import com.tencent.p014mm.recoveryv2.C85671c;
import p329d3.C86165a;

/* renamed from: cf3.b */
public class C80038b implements C86165a<Integer> {

    /* renamed from: a */
    public final /* synthetic */ int[] f234478a;

    public C80038b(RecoveryUI recoveryUI, int[] iArr) {
        this.f234478a = iArr;
    }

    public void accept(Object obj) {
        Integer num = (Integer) obj;
        C85671c.m105784b("MicroMsg.recovery.ui", "#fetchTinkerPatch callback, status = " + num);
        this.f234478a[0] = num.intValue();
    }
}
