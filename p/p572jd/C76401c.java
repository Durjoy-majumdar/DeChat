package p572jd;

import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68712d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import qn3.C77382c;

/* renamed from: jd.c */
public final class C76401c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<Integer> f223713d;

    /* renamed from: e */
    public final /* synthetic */ C108701a f223714e;

    public C76401c(C8479f0<Integer> f0Var, C108701a aVar) {
        this.f223713d = f0Var;
        this.f223714e = aVar;
    }

    public final void run() {
        Integer num = (Integer) this.f223713d.f27484d;
        if (num != null) {
            int intValue = num.intValue();
            Log.m105924i("MicroMsg.DelegateEditText", "updateStyle, maxLength: " + intValue);
            C68712d0 g = C68712d0.m80987g(this.f223714e);
            g.f225611e = 0;
            g.f225610d = intValue;
            g.f225607a = false;
            g.f225612f = C45078p0.C45079a.MODE_CHINESE_AS_1;
            g.mo107499d((C77382c.C77383a) null);
        }
    }
}
