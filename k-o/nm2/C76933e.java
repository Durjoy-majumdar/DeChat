package nm2;

import com.tencent.p014mm.autogen.mmdata.rpt.MultiMessageForwardStruct;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: nm2.e */
public class C76933e {

    /* renamed from: b */
    public static C76933e f224829b;

    /* renamed from: a */
    public MultiMessageForwardStruct f224830a;

    public C76933e() {
        this.f224830a = null;
        this.f224830a = new MultiMessageForwardStruct();
    }

    /* renamed from: a */
    public static C76933e m92785a() {
        if (f224829b == null) {
            f224829b = new C76933e();
        }
        return f224829b;
    }

    /* renamed from: b */
    public boolean mo107268b() {
        MultiMessageForwardStruct multiMessageForwardStruct = this.f224830a;
        multiMessageForwardStruct.f194288i = 1;
        Log.m105919d("MicroMsg.MultiMessageForwardReportManager", "%s", multiMessageForwardStruct.mo1006q());
        return this.f224830a.mo86054n();
    }

    /* renamed from: c */
    public boolean mo107269c() {
        mo107270d(2);
        return mo107268b();
    }

    /* renamed from: d */
    public void mo107270d(int i) {
        MultiMessageForwardStruct multiMessageForwardStruct = this.f224830a;
        multiMessageForwardStruct.f194283d = multiMessageForwardStruct.mo86045b("HasConfirmed", i + "", true);
    }
}
