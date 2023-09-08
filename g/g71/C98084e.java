package g71;

import b71.C92200j;
import com.tencent.p014mm.plugin.emojicapture.p841ui.capture.EditorStickerView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import rh3.C101380d;
import rx3.C13598b0;
import te3.C101814mn2;
import te3.C50567nn2;
import th3.C101893b;

/* renamed from: g71.e */
public final class C98084e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EditorStickerView f287554d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98084e(EditorStickerView editorStickerView) {
        super(0);
        this.f287554d = editorStickerView;
    }

    public Object invoke() {
        EditorStickerView editorStickerView = this.f287554d;
        C101380d F4 = editorStickerView.f269270g.mo137167F4(editorStickerView.f269271h);
        if (F4 != null && C92200j.f263887p.mo126169a(F4.f296960a)) {
            C101893b bVar = C101893b.f300042a;
            C101814mn2 mn22 = F4.f296960a;
            C87412m.m108594g(mn22, "lensInfo");
            LinkedList<C101814mn2> linkedList = C101893b.f300047f.f138692d;
            C87412m.m108593f(linkedList, "historyList.lensInfoList");
            Iterator<C101814mn2> it = linkedList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C87412m.m108589b(it.next().f298862d, mn22.f298862d)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                C50567nn2 nn22 = C101893b.f300047f;
                if (i < nn22.f138692d.size()) {
                    nn22.f138692d.remove(i);
                }
            }
            C50567nn2 nn23 = C101893b.f300047f;
            nn23.f138692d.add(0, mn22);
            if (nn23.f138692d.size() > 4) {
                LinkedList<C101814mn2> linkedList2 = nn23.f138692d;
                linkedList2.remove(linkedList2.size() - 1);
            }
            bVar.mo141390b();
        }
        return C13598b0.f38549a;
    }
}
