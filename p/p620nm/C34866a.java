package p620nm;

import com.tencent.p014mm.app.C0991y;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: nm.a */
public class C34866a extends C86301e implements C0991y {
    /* renamed from: Kg */
    public void mo1001Kg() {
        int i = C80610p1.f235830o - 1;
        C80610p1.f235830o = i;
        Log.m105925i("MicroMsg.WorkerProfile", "startCheckAccountExpire: count:%s stack:%s", Integer.valueOf(i), Util.getStack());
    }

    public void R20() {
        int i = C80610p1.f235830o + 1;
        C80610p1.f235830o = i;
        Log.m105925i("MicroMsg.WorkerProfile", "stopCheckAccountExpire: count:%s stack:%s", Integer.valueOf(i), Util.getStack());
    }
}
