package hb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45609f2;
import eb0.C45628s0;
import eb0.C97625j3;
import java.util.Set;
import sf0.C77691f;

/* renamed from: hb0.t */
public class C46017t implements C44668u3.C44670b {
    /* renamed from: J1 */
    public void mo433J1(C44668u3 u3Var, C72996z1 z1Var) {
        String username = z1Var.getUsername();
        if (C72996z1.m85811N4(z1Var.getUsername())) {
            z1Var.setUsername(C72996z1.m85829Z5(z1Var.getUsername()));
        }
        if (Util.isNullOrNil(z1Var.mo62942y2())) {
            z1Var.mo62882W2(C77691f.m93687b(z1Var.getNickname()));
        }
        if (Util.isNullOrNil(z1Var.mo62945z2())) {
            z1Var.mo62884X2(C77691f.m93686a(z1Var.getNickname()));
        }
        if (Util.isNullOrNil(z1Var.mo73971p2())) {
            z1Var.mo62864M2(C77691f.m93687b(z1Var.mo73969n2()));
        }
        if (Util.isNullOrNil(z1Var.mo73970o2())) {
            z1Var.mo62862L2(C77691f.m93686a(z1Var.mo73969n2()));
        }
        Set<String> set = C45628s0.f123410p;
        if (C72996z1.m85820U5(z1Var.getUsername()) && z1Var.mo62927s3()) {
            z1Var.mo62886Y2(43);
            z1Var.mo62882W2(C77691f.m93687b(z1Var.mo62909j3()));
            z1Var.mo62884X2(C77691f.m93686a(z1Var.mo62909j3()));
            z1Var.mo62862L2(C77691f.m93686a(z1Var.mo62898f()));
            z1Var.mo62864M2(z1Var.mo62898f());
            return;
        }
        if (C45628s0.m50812z(username)) {
            z1Var.mo62868O3();
            z1Var.mo62879U3(4);
            z1Var.mo62886Y2(33);
            z1Var.setUsername(username);
            z1Var.mo62868O3();
            C45609f2.m50670c(z1Var);
            z1Var.mo62877T3();
        }
        if (z1Var.mo62934u3()) {
            z1Var.mo62886Y2(z1Var.mo62901g3());
        }
        if (C72996z1.m85841l5(username)) {
            Log.m105925i("MicroMsg.MMCore", "update official account helper showhead %d", 31);
            z1Var.mo62886Y2(31);
        }
        if (z1Var.mo62920o3()) {
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69762e0(new String[]{username}, "@blacklist");
        }
        Log.m105919d("MicroMsg.MMCore", "onPreInsertContact2: %s, %s", z1Var.getUsername(), z1Var.mo62942y2());
    }

    /* renamed from: K4 */
    public int mo434K4(C72996z1 z1Var, boolean z) {
        return 0;
    }

    public C72996z1 get(String str) {
        return null;
    }
}
