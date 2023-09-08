package yz3;

import gy3.C87412m;
import jy3.C88045a;
import ny3.C89104m;

/* renamed from: yz3.l */
public final class C23416l extends C88045a<Object> {

    /* renamed from: b */
    public final /* synthetic */ C26653k f67173b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23416l(Object obj, C26653k kVar) {
        super(obj);
        this.f67173b = kVar;
    }

    /* renamed from: b */
    public boolean mo36885b(C89104m<?> mVar, Object obj, Object obj2) {
        C87412m.m108594g(mVar, "property");
        if (!this.f67173b.f74199a) {
            return true;
        }
        throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
    }
}
