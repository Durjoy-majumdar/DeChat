package com.tencent.p014mm.p136ui.chatting.component;

import android.os.Looper;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C97625j3;
import g62.C75875l;
import java.util.Iterator;
import p270xi.C53356d;
import p565ir.C60606n;
import p565ir.C60611o;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.component.f0 */
public class C73471f0 extends C73412a implements C53356d, C75875l.C75877b {

    /* renamed from: e */
    public String f215884e = "ChattingFinderLiveNotifyComponent";

    /* renamed from: F4 */
    public void mo26186F4() {
        if (mo102425Y5()) {
            ((C60606n) C86312j.m106911c(C60606n.class)).mo85100ww().mo58255a();
            ((C119157j) C119157j.f356862d).mo183875f(new C73465e0(this));
        }
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        if (mo102425Y5()) {
            ((C60606n) C86312j.m106911c(C60606n.class)).mo85100ww().mo58259e();
        }
    }

    /* renamed from: X5 */
    public void mo102328X5(View view, int i) {
        if (mo102425Y5() && i == 0) {
            ((C119157j) C119157j.f356862d).mo183875f(new C73465e0(this));
        }
    }

    /* renamed from: Y5 */
    public final boolean mo102425Y5() {
        return "notifymessage".equals(this.f215752d.mo91574o().getUsername());
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        ((C72972g4) C97625j3.m125812b().mo105911z()).mo101137qq(this, Looper.getMainLooper());
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        if (C97625j3.m125811a()) {
            ((C72972g4) C97625j3.m125812b().mo105911z()).sy0(this);
        }
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        if (C97625j3.m125811a()) {
            ((C72972g4) C97625j3.m125812b().mo105911z()).sy0(this);
        }
    }

    /* renamed from: w5 */
    public void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
        Log.m105924i(this.f215884e, "[onNotifyChange]");
        if (eVar.f123845b.equals("delete") && !eVar.f123846c.isEmpty()) {
            Iterator<C72963f4> it = eVar.f123846c.iterator();
            while (it.hasNext()) {
                ((C60611o) C86312j.m106911c(C60611o.class)).od0(it.next().getMsgId());
            }
        }
    }
}
