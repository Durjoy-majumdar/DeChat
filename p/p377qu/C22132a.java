package p377qu;

import com.tencent.p014mm.modelstat.ChattingOperationUitl;
import com.tencent.p014mm.plugin.report.kvdata.IMBehavior;
import com.tencent.p014mm.plugin.report.kvdata.IMBehaviorChattingOP;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86301e;
import ei3.C86522b;
import p680ru.C77569h;

@C86522b
/* renamed from: qu.a */
public class C22132a extends C86301e implements C77569h {
    /* renamed from: B1 */
    public void mo35228B1(C72963f4 f4Var) {
        ChattingOperationUitl.f48963f.mo21923f(f4Var);
    }

    /* renamed from: Bo */
    public void mo35229Bo(String str, boolean z) {
        ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.f48963f;
        if (chattingOperationUitl.mo21919b() && chattingOperationUitl.mo21918a(str)) {
            IMBehavior iMBehavior = new IMBehavior();
            int i = 1;
            iMBehavior.opType = 1;
            IMBehaviorChattingOP iMBehaviorChattingOP = new IMBehaviorChattingOP();
            iMBehavior.chattingOp = iMBehaviorChattingOP;
            if (!z) {
                i = 2;
            }
            iMBehaviorChattingOP.changeNotifyStatus = i;
            synchronized (chattingOperationUitl.f48965b) {
                chattingOperationUitl.f48964a.oplist_.add(iMBehavior);
            }
        }
    }

    /* renamed from: Fx */
    public void mo35230Fx(boolean z, String str, boolean z2) {
        ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.f48963f;
        if (chattingOperationUitl.mo21919b()) {
            IMBehavior iMBehavior = new IMBehavior();
            int i = 1;
            iMBehavior.opType = 1;
            IMBehaviorChattingOP iMBehaviorChattingOP = new IMBehaviorChattingOP();
            iMBehavior.chattingOp = iMBehaviorChattingOP;
            if (!z2) {
                i = 2;
            }
            iMBehaviorChattingOP.changeTop = i;
            if (z) {
                chattingOperationUitl.mo21921d();
            }
            if (chattingOperationUitl.mo21918a(str)) {
                synchronized (chattingOperationUitl.f48965b) {
                    chattingOperationUitl.f48964a.oplist_.add(iMBehavior);
                }
                if (z) {
                    chattingOperationUitl.mo21921d();
                }
            }
        }
    }

    /* renamed from: KK */
    public void mo35231KK(C72963f4 f4Var, int i) {
        ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.f48963f;
        if (chattingOperationUitl.mo21919b()) {
            chattingOperationUitl.mo21920c(f4Var, ChattingOperationUitl.C17797d.revoke, i);
        }
    }

    /* renamed from: L7 */
    public void mo35232L7(C72963f4 f4Var, boolean z, int i) {
        ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.f48963f;
        if (chattingOperationUitl.mo21919b()) {
            chattingOperationUitl.mo21920c(f4Var, z ? ChattingOperationUitl.C17797d.playMusic : ChattingOperationUitl.C17797d.stopMusic, i);
        }
    }

    public void Oi0(C72963f4 f4Var) {
        ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.f48963f;
        if (chattingOperationUitl.mo21919b()) {
            chattingOperationUitl.mo21920c(f4Var, ChattingOperationUitl.C17797d.revoke, 0);
        }
    }

    /* renamed from: T9 */
    public void mo35234T9(String str) {
        ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.f48963f;
        if (chattingOperationUitl.mo21919b() && chattingOperationUitl.mo21918a(str)) {
            IMBehavior iMBehavior = new IMBehavior();
            iMBehavior.opType = 1;
            IMBehaviorChattingOP iMBehaviorChattingOP = new IMBehaviorChattingOP();
            iMBehavior.chattingOp = iMBehaviorChattingOP;
            iMBehaviorChattingOP.expose = 1;
            synchronized (chattingOperationUitl.f48965b) {
                chattingOperationUitl.f48964a.oplist_.add(iMBehavior);
            }
        }
    }

    public void Tc0(C72963f4 f4Var) {
        ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.f48963f;
        if (chattingOperationUitl.mo21919b()) {
            chattingOperationUitl.mo21920c(f4Var, ChattingOperationUitl.C17797d.delete, 0);
        }
    }

    /* renamed from: XG */
    public void mo35236XG(boolean z, String str, boolean z2) {
        ChattingOperationUitl.f48963f.mo21924g(z, str, z2);
    }

    public void af0(C72963f4 f4Var) {
        ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.f48963f;
        if (chattingOperationUitl.mo21919b()) {
            chattingOperationUitl.mo21920c(f4Var, ChattingOperationUitl.C17797d.imageSaveToLocal, 0);
        }
    }

    /* renamed from: ci */
    public void mo35238ci(C72963f4 f4Var, int i) {
        ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.f48963f;
        if (chattingOperationUitl.mo21919b()) {
            chattingOperationUitl.mo21920c(f4Var, ChattingOperationUitl.C17797d.fav, i);
        }
    }

    /* renamed from: e8 */
    public void mo35239e8(C72963f4 f4Var, int i) {
        ChattingOperationUitl.f48963f.mo21922e(f4Var, i);
    }

    /* renamed from: lH */
    public void mo35240lH(C72963f4 f4Var) {
        ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.f48963f;
        if (chattingOperationUitl.mo21919b()) {
            chattingOperationUitl.mo21920c(f4Var, ChattingOperationUitl.C17797d.voiceToText, 0);
        }
    }

    /* renamed from: nt */
    public void mo35241nt(C72963f4 f4Var) {
        ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.f48963f;
        if (chattingOperationUitl.mo21919b()) {
            chattingOperationUitl.mo21920c(f4Var, ChattingOperationUitl.C17797d.fav, 0);
        }
    }

    /* renamed from: pr */
    public void mo35242pr() {
        ChattingOperationUitl.f48963f.mo21921d();
    }

    /* renamed from: qZ */
    public void mo35243qZ(String str) {
        ChattingOperationUitl.f48963f.mo21918a(str);
    }

    public void qx0(C72963f4 f4Var, boolean z) {
        ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.f48963f;
        if (chattingOperationUitl.mo21919b() && f4Var.mo100993e4()) {
            chattingOperationUitl.mo21920c(f4Var, z ? ChattingOperationUitl.C17797d.translate : ChattingOperationUitl.C17797d.translateHidden, 0);
        }
    }

    /* renamed from: rb */
    public void mo35245rb(C72963f4 f4Var, int i) {
        ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.f48963f;
        if (chattingOperationUitl.mo21919b()) {
            chattingOperationUitl.mo21920c(f4Var, ChattingOperationUitl.C17797d.delete, i);
        }
    }

    /* renamed from: zP */
    public void mo35246zP(String str, boolean z) {
        ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.f48963f;
        if (chattingOperationUitl.mo21919b() && chattingOperationUitl.mo21918a(str)) {
            IMBehavior iMBehavior = new IMBehavior();
            int i = 1;
            iMBehavior.opType = 1;
            IMBehaviorChattingOP iMBehaviorChattingOP = new IMBehaviorChattingOP();
            iMBehavior.chattingOp = iMBehaviorChattingOP;
            if (!z) {
                i = 2;
            }
            iMBehaviorChattingOP.changeSaveAddress = i;
            synchronized (chattingOperationUitl.f48965b) {
                chattingOperationUitl.f48964a.oplist_.add(iMBehavior);
            }
        }
    }

    /* renamed from: zz */
    public void mo35247zz(C72963f4 f4Var) {
        ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.f48963f;
        if (chattingOperationUitl.mo21919b()) {
            chattingOperationUitl.mo21920c(f4Var, ChattingOperationUitl.C17797d.click, 0);
        }
    }
}
