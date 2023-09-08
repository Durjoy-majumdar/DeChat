package qb2;

import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;
import te3.C64525lh3;

/* renamed from: qb2.b */
public final class C62599b extends BaseStateAction {

    /* renamed from: a */
    public final C64525lh3 f177786a;

    public C62599b(C64525lh3 lh32) {
        C87412m.m108594g(lh32, "previewDataObj");
        this.f177786a = lh32;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C62599b) && C87412m.m108589b(this.f177786a, ((C62599b) obj).f177786a);
    }

    public int hashCode() {
        return this.f177786a.hashCode();
    }

    public String toString() {
        return "InitAction(previewDataObj=" + this.f177786a + ')';
    }
}
