package uv1;

import com.tencent.p014mm.sdk.statecenter.BaseStateAction;

/* renamed from: uv1.d */
public final class C65482d extends BaseStateAction {

    /* renamed from: a */
    public final boolean f188435a;

    public C65482d(boolean z) {
        this.f188435a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C65482d) && this.f188435a == ((C65482d) obj).f188435a;
    }

    public int hashCode() {
        boolean z = this.f188435a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "SearchEditTextFocusChangeAction(hasFocus=" + this.f188435a + ')';
    }
}
