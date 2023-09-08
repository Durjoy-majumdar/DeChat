package uv1;

import com.tencent.p014mm.plugin.fts.p059ui.widget.C18879e;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;

/* renamed from: uv1.f */
public final class C65484f extends BaseStateAction {

    /* renamed from: a */
    public final C18879e f188437a;

    public C65484f(C18879e eVar) {
        C87412m.m108594g(eVar, "proxy");
        this.f188437a = eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C65484f) && C87412m.m108589b(this.f188437a, ((C65484f) obj).f188437a);
    }

    public int hashCode() {
        return this.f188437a.hashCode();
    }

    public String toString() {
        return "VoiceSearchRequiredAction(proxy=" + this.f188437a + ')';
    }
}
