package af3;

import com.tencent.p014mm.recoveryv2.C85671c;
import p329d3.C86165a;

/* renamed from: af3.g */
public class C79532g implements C86165a<Integer> {

    /* renamed from: a */
    public final int[] f233184a;

    public C79532g(int[] iArr) {
        this.f233184a = iArr;
    }

    public void accept(Object obj) {
        Integer num = (Integer) obj;
        C85671c.m105784b("MicroMsg.recovery.service", "#fetchTinkerPatch callback, status = " + num);
        this.f233184a[0] = num.intValue();
    }
}
