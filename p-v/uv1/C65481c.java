package uv1;

import com.tencent.p014mm.sdk.statecenter.BaseStateAction;

/* renamed from: uv1.c */
public final class C65481c extends BaseStateAction {

    /* renamed from: a */
    public final int f188434a;

    public C65481c(int i) {
        this.f188434a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C65481c) && this.f188434a == ((C65481c) obj).f188434a;
    }

    public int hashCode() {
        return this.f188434a;
    }

    public String toString() {
        return "KeyboardChangeAction(height=" + this.f188434a + ')';
    }
}
