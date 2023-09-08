package uy2;

import az2.C39674e;
import com.tencent.p014mm.chatting.BasePrivateMsgConvListFragment;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import yy2.C53658a;

/* renamed from: uy2.b */
public final class C52658b implements BasePrivateMsgConvListFragment.C40274b<C52657a> {

    /* renamed from: a */
    public final int f147043a;

    public C52658b(int i, int i2, int i3, C8480h hVar) {
        this.f147043a = (i3 & 2) != 0 ? 1 : i2;
    }

    /* renamed from: L4 */
    public MAutoStorage<C52657a> mo62834L4() {
        return C39674e.f106452d.mo62238D();
    }

    /* renamed from: M4 */
    public List<C52657a> mo62835M4(int i) {
        MAutoStorage<C52657a> L4 = mo62834L4();
        C87412m.m108592e(L4, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.conversation.storage.TextStatusConversationStorage");
        return ((C53658a) L4).mo74247Yt(i, 60, (int[]) null, this.f147043a);
    }

    /* renamed from: N4 */
    public List<C52657a> mo62836N4() {
        LinkedList linkedList = new LinkedList();
        MAutoStorage<C52657a> L4 = mo62834L4();
        C87412m.m108592e(L4, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.conversation.storage.TextStatusConversationStorage");
        List<C52657a> Yt = ((C53658a) L4).mo74247Yt(0, 15, (int[]) null, this.f147043a);
        if (!Yt.isEmpty()) {
            linkedList.addAll(Yt);
        }
        C39674e.f106452d.mo62243O().getClass();
        return linkedList;
    }
}
