package k11;

import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanNewUI;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import oa1.C117731d;
import wy0.C102506a;
import wy0.C102522u;

public final /* synthetic */ class x$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CleanNewUI f290540d;

    /* renamed from: e */
    public final /* synthetic */ C102522u f290541e;

    public /* synthetic */ x$$g(CleanNewUI cleanNewUI, C102522u uVar) {
        this.f290540d = cleanNewUI;
        this.f290541e = uVar;
    }

    public final void run() {
        CleanNewUI cleanNewUI = this.f290540d;
        C102522u uVar = this.f290541e;
        String str = CleanNewUI.f267927I;
        cleanNewUI.getClass();
        boolean z = false;
        if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_clean_reset_calc_index_time", "0", false, true), 0) > MultiProcessMMKV.getMMKV("CleanCalcMMKV").getInt("CleanCalcResetIndexTime", 0)) {
            z = true;
        }
        if (z) {
            C102506a.f301832a.mo142120e().mo142694TO(true, cleanNewUI.f267954y);
        }
        C102506a.f301832a.mo142124j(uVar, cleanNewUI.f267954y);
    }
}
