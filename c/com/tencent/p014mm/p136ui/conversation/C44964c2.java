package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceConversationUI;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import he0.C46020f;
import ie0.C46220j;
import je0.C46477j0;
import ne0.C47224a;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: com.tencent.mm.ui.conversation.c2 */
public final class C44964c2 extends C87413o implements C32226l<C46020f, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ OpenImKefuServiceConversationUI f121973d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44964c2(OpenImKefuServiceConversationUI openImKefuServiceConversationUI) {
        super(1);
        this.f121973d = openImKefuServiceConversationUI;
    }

    public Object invoke(Object obj) {
        C46020f fVar = (C46020f) obj;
        OpenImKefuServiceConversationUI openImKefuServiceConversationUI = this.f121973d;
        OpenImKefuServiceConversationUI.C44924a aVar = OpenImKefuServiceConversationUI.f121846j;
        int i = ((Boolean) ((C36570n) openImKefuServiceConversationUI.f121850g).getValue()).booleanValue() ? 24 : 23;
        C46220j jVar = fVar instanceof C46220j ? (C46220j) fVar : null;
        OpenIMKefuStartConversationRequest I7 = this.f121973d.mo70220I7();
        C87412m.m108591d(I7);
        C47224a.m52532c(jVar, i, I7.f108517f, 0, 8, (Object) null);
        if (fVar != null ? C87412m.m108589b(fVar.mo71447r1(), Boolean.TRUE) : false) {
            C46477j0 j0Var = C46477j0.f125215a;
            String username = fVar.getUsername();
            C87412m.m108593f(username, "contact.username");
            String U = fVar.mo71443U();
            C87412m.m108593f(U, "contact.locationType");
            C46477j0.m51766c(j0Var, username, U, 1, (C32226l) null, 8, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
