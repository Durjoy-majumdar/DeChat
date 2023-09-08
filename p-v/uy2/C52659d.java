package uy2;

import az2.C39674e;
import com.tencent.p014mm.chatting.BasePrivateMsgConvListFragment;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import yy2.C53659b;

/* renamed from: uy2.d */
public final class C52659d implements BasePrivateMsgConvListFragment.C40274b<C52660e> {

    /* renamed from: a */
    public int f147044a;

    /* renamed from: b */
    public final C13601g f147045b = C36568h.m40985a(C14392c.f39965d);

    public C52659d(int i, int i2, int i3, C8480h hVar) {
    }

    /* renamed from: L4 */
    public MAutoStorage<C52660e> mo62834L4() {
        return C39674e.f106452d.mo62243O();
    }

    /* renamed from: M4 */
    public List<C52660e> mo62835M4(int i) {
        MAutoStorage<C52660e> L4 = mo62834L4();
        C87412m.m108592e(L4, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.conversation.storage.TextStatusGreetingItemStorage");
        List<C52660e> Xs = ((C53659b) L4).mo74250Xs(i, 60);
        mo73603a(Xs);
        return Xs;
    }

    /* renamed from: N4 */
    public List<C52660e> mo62836N4() {
        MAutoStorage<C52660e> L4 = mo62834L4();
        C87412m.m108592e(L4, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.conversation.storage.TextStatusGreetingItemStorage");
        List<C52660e> Xs = ((C53659b) L4).mo74250Xs(0, 15);
        mo73603a(Xs);
        return Xs;
    }

    /* renamed from: a */
    public final void mo73603a(List<C52660e> list) {
        for (C52660e eVar : list) {
            int i = 2;
            if (this.f147044a == 2) {
                eVar.f147047M = 0;
            } else {
                if (Math.abs(((Number) ((C36570n) this.f147045b).getValue()).intValue() - eVar.field_createTime) >= 259200) {
                    int i2 = this.f147044a;
                    if (i2 == 0 || i2 == 1) {
                        this.f147044a = 2;
                        eVar.f147047M = i;
                    }
                } else if (this.f147044a == 0) {
                    this.f147044a = 1;
                    i = 1;
                    eVar.f147047M = i;
                }
                i = 0;
                eVar.f147047M = i;
            }
        }
    }
}
