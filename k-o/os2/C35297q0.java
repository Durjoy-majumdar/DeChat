package os2;

import com.tencent.p014mm.plugin.sns.model.C94847c1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import zh3.C91753f;

/* renamed from: os2.q0 */
public class C35297q0 extends MAutoStorage<C35296p0> {

    /* renamed from: e */
    public static final String[] f94559e = {MAutoStorage.getCreateSQLs(C35296p0.f94558t, "SnsWsFoldGroup")};

    /* renamed from: d */
    public C91753f f94560d;

    public C35297q0(C91753f fVar) {
        super(fVar, C11765l0.f34450t, "SnsWsFoldGroup", (String[]) null);
        this.f94560d = fVar;
    }

    /* renamed from: jo */
    public boolean mo60194jo(C35296p0 p0Var) {
        SnsMethodCalculate.markStartTimeMs("insertWsFoldGroup", "com.tencent.mm.plugin.sns.storage.SnsWsFoldGroupStorage");
        boolean z = true;
        if (p0Var.field_size >= C94847c1.m120221i()) {
            p0Var.field_state = 1;
        }
        if (this.f94560d.replace("SnsWsFoldGroup", "bottom", p0Var.convertTo()) <= 0) {
            z = false;
        }
        Log.m105918d("MicroMsg.SnsWsFoldGroupStorage", "SnsWsFoldGroup replace result " + z);
        SnsMethodCalculate.markEndTimeMs("insertWsFoldGroup", "com.tencent.mm.plugin.sns.storage.SnsWsFoldGroupStorage");
        return z;
    }
}
