package p713uq;

import com.tencent.p014mm.autogen.events.UpdateChatRoomSpamStatusEvent;
import eb0.C97625j3;
import fy3.C32224a;
import gb0.C75900d;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: uq.b */
public final class C78272b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ UpdateChatRoomSpamStatusEvent f229286d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78272b(UpdateChatRoomSpamStatusEvent updateChatRoomSpamStatusEvent) {
        super(0);
        this.f229286d = updateChatRoomSpamStatusEvent;
    }

    public Object invoke() {
        if ((this.f229286d.f193979d.f193981b & 1) != 1) {
            C75900d t = C97625j3.m125812b().mo105905t();
            String str = this.f229286d.f193979d.f193980a;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            if (C87412m.m108589b(t.mo106157c(str, "showtype"), "2")) {
                C75900d t2 = C97625j3.m125812b().mo105905t();
                String str3 = this.f229286d.f193979d.f193980a;
                if (str3 != null) {
                    str2 = str3;
                }
                t2.mo106156b(str2);
            }
        }
        return C13598b0.f38549a;
    }
}
