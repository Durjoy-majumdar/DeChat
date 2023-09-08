package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import java.util.ArrayList;
import java.util.List;
import p270xi.C91212b;
import zj3.C79393z;

@C91212b(exportInterface = C79393z.class)
/* renamed from: com.tencent.mm.ui.chatting.component.h2 */
public class C73490h2 extends C73412a implements C79393z {

    /* renamed from: e */
    public List<Long> f215910e = new ArrayList();

    /* renamed from: a5 */
    public boolean mo102454a5(C72963f4 f4Var) {
        if (f4Var == null || f4Var.mo108722A2() == null) {
            return false;
        }
        return !((ArrayList) this.f215910e).contains(Long.valueOf(f4Var.getMsgId()));
    }

    /* renamed from: e2 */
    public void mo102455e2(long j) {
        if (!((ArrayList) this.f215910e).contains(Long.valueOf(j))) {
            ((ArrayList) this.f215910e).add(Long.valueOf(j));
        }
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        Log.m105924i("MicroMsg.groupsolitaire.GroupSolitaireComponent", "onChattingExitAnimStart");
        ((ArrayList) this.f215910e).clear();
    }
}
