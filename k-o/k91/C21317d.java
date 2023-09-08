package k91;

import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import te3.C22524q1;

/* renamed from: k91.d */
public final class C21317d extends C21315a {
    /* renamed from: a */
    public final C22524q1 mo33321a() {
        byte[] a = C116850b.m164831a("hell_aty_action_mmkv_key");
        if (a == null || a.length <= 0) {
            return null;
        }
        C22524q1 q1Var = new C22524q1();
        try {
            q1Var.parseFrom(a);
            return q1Var;
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.ActivityDao_MMKV", e, "HellhoundDao _doRead parse", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo33322b(C22524q1 q1Var) {
        try {
            C116850b.m164834d("hell_aty_action_mmkv_key", q1Var.toByteArray());
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.ActivityDao_MMKV", e, "HellhoundDao writeBack", new Object[0]);
        }
    }
}
