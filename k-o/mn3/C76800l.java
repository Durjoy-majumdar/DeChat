package mn3;

import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.storage.C72958d5;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import kn3.C61118a;
import kn3.C76617m;
import kr0.C27608u0;
import ln3.C76709a;
import ln3.C76719m;
import p749xh.C78806c9;

/* renamed from: mn3.l */
public final class C76800l extends C76787a<C76719m> {

    /* renamed from: f */
    public final String f224620f = "TopMsg.TopMsgTipsBarProcessor";

    /* renamed from: g */
    public final IStorageObserver<C72958d5> f224621g = new C76801a(this);

    /* renamed from: mn3.l$a */
    public static final class C76801a<T extends IAutoDBItem> implements IStorageObserver {

        /* renamed from: d */
        public final /* synthetic */ C76800l f224622d;

        public C76801a(C76800l lVar) {
            this.f224622d = lVar;
        }

        public void onChanged(Object obj) {
            StorageObserverEvent storageObserverEvent = (StorageObserverEvent) obj;
            C87412m.m108594g(storageObserverEvent, "event");
            String str = this.f224622d.f224620f;
            Log.m105918d(str, "onChanged() called with: event = " + storageObserverEvent);
            this.f224622d.mo107034Z5();
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        C78806c9.f230593t.observe(this.f215752d.f193286j, this.f224621g);
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        C78806c9.f230593t.removeObserver(this.f224621g);
    }

    /* renamed from: Y5 */
    public void mo86475Y5() {
    }

    /* renamed from: Z */
    public List<C76719m> mo86472Z(C67391b bVar, C39969i iVar) {
        C87412m.m108594g(bVar, "context");
        C87412m.m108594g(iVar, "talkerInfo");
        String str = iVar.f107141a;
        List<C72958d5> z0 = ((C27608u0) C86312j.m106911c(C27608u0.class)).mo55362z0(str);
        if (z0 == null || z0.size() <= 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (C72958d5 d5Var : z0) {
            if (!d5Var.mo108715m2()) {
                linkedList.add(new C76719m(d5Var, ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(str, d5Var.mo108716n2().f183488f)));
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    public int mo86473c() {
        int i = C76709a.f224424g;
        return C76709a.f224426i;
    }

    /* renamed from: y */
    public C61118a<C76719m> mo86474y(int i, C67391b bVar, ChatTipsBarGroup.C74825d dVar) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "tipsBarContext");
        return new C76617m(bVar, dVar, this);
    }
}
