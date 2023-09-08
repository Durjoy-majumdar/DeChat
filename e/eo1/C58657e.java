package eo1;

import bo1.C54512y;
import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import o40.C61926c;

/* renamed from: eo1.e */
public final class C58657e extends C87413o implements C32224a<LinkedList<C54512y>> {

    /* renamed from: d */
    public final /* synthetic */ C58638b f167929d;

    /* renamed from: e */
    public final /* synthetic */ String f167930e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58657e(C58638b bVar, String str) {
        super(0);
        this.f167929d = bVar;
        this.f167930e = str;
    }

    public Object invoke() {
        LinkedList linkedList = new LinkedList();
        C61926c.m72675T(this.f167929d.f167877f, new C58656d(this.f167930e, linkedList));
        return linkedList;
    }
}
