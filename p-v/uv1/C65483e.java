package uv1;

import com.tencent.p014mm.sdk.statecenter.BaseStateAction;

/* renamed from: uv1.e */
public final class C65483e extends BaseStateAction {

    /* renamed from: a */
    public final boolean f188436a;

    public C65483e(boolean z) {
        this.f188436a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C65483e) && this.f188436a == ((C65483e) obj).f188436a;
    }

    public int hashCode() {
        boolean z = this.f188436a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "SearchEducationVisibleAction(visible=" + this.f188436a + ')';
    }
}
