package fw0;

import com.tencent.p014mm.autogen.events.NetSceneGetChatroomMemberDetailEvent;
import com.tencent.p014mm.storage.C44661m1;
import eb0.C75597w2;

/* renamed from: fw0.p */
public class C45815p implements C75597w2.C31525a {

    /* renamed from: a */
    public final /* synthetic */ C44661m1 f123717a;

    /* renamed from: b */
    public final /* synthetic */ String f123718b;

    public C45815p(C45816q qVar, C44661m1 m1Var, String str) {
        this.f123717a = m1Var;
        this.f123718b = str;
    }

    /* renamed from: a */
    public void mo1109a(String str, boolean z) {
        C44661m1 m1Var = this.f123717a;
        if (m1Var != null && m1Var.mo69798z2()) {
            NetSceneGetChatroomMemberDetailEvent netSceneGetChatroomMemberDetailEvent = new NetSceneGetChatroomMemberDetailEvent();
            NetSceneGetChatroomMemberDetailEvent.C40141a aVar = netSceneGetChatroomMemberDetailEvent.f107649d;
            aVar.f107650a = this.f123718b;
            aVar.f107651b = this.f123717a.mo69791s2();
            netSceneGetChatroomMemberDetailEvent.publish();
        }
    }
}
