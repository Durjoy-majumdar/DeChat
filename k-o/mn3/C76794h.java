package mn3;

import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.util.FrequentLimiter;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import ie3.C76328d;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kn3.C61118a;
import kn3.C76609g;
import ln3.C76709a;
import ln3.C76714h;
import te3.jy4;
import te3.ky4;

/* renamed from: mn3.h */
public final class C76794h extends C76787a<C76714h> implements MStorageEx.IOnStorageChange {

    /* renamed from: f */
    public final String f224613f = "PayPluginTopMsgTipsBarProcessor";

    /* renamed from: F4 */
    public void mo26186F4() {
        C86709a0.m107535s().mo121142i().add(this);
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        C86709a0.m107535s().mo121142i().remove(this);
    }

    /* renamed from: Y5 */
    public void mo86475Y5() {
    }

    /* renamed from: Z */
    public List<C76714h> mo86472Z(C67391b bVar, C39969i iVar) {
        C87412m.m108594g(bVar, "context");
        C87412m.m108594g(iVar, "talkerInfo");
        String str = iVar.f107141a;
        ky4 z0 = ((C76328d) C86312j.m106911c(C76328d.class)).mo106563z0(str);
        if (z0 != null && z0.f227784e.size() > 0) {
            LinkedList linkedList = new LinkedList();
            LinkedList<jy4> linkedList2 = z0.f227784e;
            C87412m.m108593f(linkedList2, "topMsgRecord.msg_list");
            Iterator<T> it = linkedList2.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                jy4 jy4 = (jy4) it.next();
                long a = C31543z5.m39451a() - jy4.f227711f;
                long j = jy4.f227712g;
                if (j <= 0) {
                    j = FrequentLimiter.WEEK_MILLS;
                }
                if (a <= 0 || a >= j) {
                    Log.m105925i(this.f224613f, "invalid time gap is %s , ignore show", Long.valueOf(a));
                } else {
                    String str2 = jy4.f227709d;
                    C87412m.m108593f(str2, "it.msg_svrId");
                    C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(str, Long.parseLong(str2));
                    if (!(h302.getMsgId() == 0 || h302.getType() == 268445456)) {
                        z = true;
                    }
                    if (z) {
                        linkedList.add(new C76714h(jy4, h302));
                    }
                }
            }
            if (linkedList.size() > 0) {
                C115669n.INSTANCE.mo160131h(27193, 1, 1);
                Log.m105925i(this.f224613f, "show %s pay plugin topmsg", Integer.valueOf(linkedList.size()));
                return linkedList;
            }
        }
        return null;
    }

    /* renamed from: c */
    public int mo86473c() {
        int i = C76709a.f224424g;
        return C76709a.f224425h;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (C87412m.m108589b(mStorageEx, C86709a0.m107535s().mo121142i()) && obj == C72994y1.C72995a.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC) {
            mo107034Z5();
        }
    }

    /* renamed from: y */
    public C61118a<C76714h> mo86474y(int i, C67391b bVar, ChatTipsBarGroup.C74825d dVar) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "tipsBarContext");
        return new C76609g(bVar, dVar, this);
    }
}
