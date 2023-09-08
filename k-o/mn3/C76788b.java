package mn3;

import a11.C39479c;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import kn3.C61118a;
import kn3.C76601b;
import ln3.C76709a;
import ln3.C76710b;
import p644pi.C77088c;

/* renamed from: mn3.b */
public final class C76788b extends C76787a<C76710b> {
    /* renamed from: Z */
    public List<C76710b> mo86472Z(C67391b bVar, C39969i iVar) {
        C87412m.m108594g(bVar, "context");
        C87412m.m108594g(iVar, "talkerInfo");
        String str = iVar.f107141a;
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        if (!bVar.f193286j.hasDestory && Lo != null) {
            int i = 0;
            boolean z = true;
            if (!C72996z1.m85847r5(str) ? Lo.mo69788p2() != 2 : (Lo.mo69788p2() & 1) != 1) {
                z = false;
            }
            if (z) {
                i = ((C77088c) C86312j.m106911c(C77088c.class)).Yc0(str, 0);
            }
            if (i > 0) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(new C76710b(i));
                return linkedList;
            }
        }
        return null;
    }

    /* renamed from: c */
    public int mo86473c() {
        int i = C76709a.f224424g;
        return C76709a.f224428n;
    }

    /* renamed from: y */
    public C61118a<C76710b> mo86474y(int i, C67391b bVar, ChatTipsBarGroup.C74825d dVar) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "tipsBarContext");
        return new C76601b(bVar, dVar, this);
    }
}
