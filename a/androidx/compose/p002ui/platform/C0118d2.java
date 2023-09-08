package androidx.compose.p002ui.platform;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y04.C15925h;

/* renamed from: androidx.compose.ui.platform.d2 */
public final class C0118d2 implements C15925h<C0117c2> {

    /* renamed from: a */
    public final List<C0117c2> f554a = new ArrayList();

    /* renamed from: b */
    public final void mo101b(String str, Object obj) {
        C87412m.m108594g(str, "name");
        ((ArrayList) this.f554a).add(new C0117c2(str, obj));
    }

    public Iterator<C0117c2> iterator() {
        return ((ArrayList) this.f554a).iterator();
    }
}
