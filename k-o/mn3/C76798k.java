package mn3;

import androidx.camera.core.FocusMeteringAction;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import kn3.C61118a;
import kn3.C76616l;
import ln3.C76709a;
import ln3.C76718l;

/* renamed from: mn3.k */
public final class C76798k extends C76787a<C76718l> {

    /* renamed from: f */
    public C76718l f224617f;

    /* renamed from: g */
    public final Runnable f224618g = new C76799a(this);

    /* renamed from: mn3.k$a */
    public static final class C76799a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C76798k f224619d;

        public C76799a(C76798k kVar) {
            this.f224619d = kVar;
        }

        public final void run() {
            this.f224619d.mo107034Z5();
        }
    }

    /* renamed from: Z */
    public List<C76718l> mo86472Z(C67391b bVar, C39969i iVar) {
        C87412m.m108594g(bVar, "context");
        C87412m.m108594g(iVar, "talkerInfo");
        long c = C31543z5.m39453c();
        C76718l lVar = this.f224617f;
        if (lVar != null) {
            long j = lVar.f224450x - c;
            if (j <= 0 || j >= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                this.f224617f = null;
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(lVar);
                return linkedList;
            }
        }
        return null;
    }

    /* renamed from: c */
    public int mo86473c() {
        int i = C76709a.f224424g;
        return C76709a.f224434t;
    }

    /* renamed from: y */
    public C61118a<C76718l> mo86474y(int i, C67391b bVar, ChatTipsBarGroup.C74825d dVar) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "tipsBarContext");
        return new C76616l(bVar, dVar, this);
    }
}
