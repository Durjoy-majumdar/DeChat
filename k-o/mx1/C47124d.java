package mx1;

import a14.C0000n0;
import a14.C53916l;
import bx1.C39856k;
import bx1.C39867t;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.ResultKt;
import ob0.C117747y;
import ob0.C89137b0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.game.chatroom.viewmodel.ChatroomMemberPreloadManager$handleSyncChatroomMember$1", mo125469f = "ChatroomMemberPreloadManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: mx1.d */
public final class C47124d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C117747y f126621d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47124d(C117747y yVar, C15601d<? super C47124d> dVar) {
        super(2, dVar);
        this.f126621d = yVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C47124d(this.f126621d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C47124d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C47119a aVar = C47119a.f126606d;
        LinkedList<String> linkedList = ((C39867t) this.f126621d).mo62496k1().member_username_list;
        C87412m.m108593f(linkedList, "scene.response.member_username_list");
        String str = ((C39867t) this.f126621d).mo62495j1().chatroom_name;
        C87412m.m108593f(str, "scene.request.chatroom_name");
        LinkedList<String> d = aVar.mo72233d(linkedList, str);
        C89137b0 d2 = C86709a0.m107524d();
        String str2 = ((C39867t) this.f126621d).mo62495j1().chatroom_name;
        C87412m.m108593f(str2, "scene.request.chatroom_name");
        d2.mo123460f(new C39856k(d, str2, aVar.mo72231b().get(((C39867t) this.f126621d).mo62495j1().chatroom_name), true, (C53916l) null, 16, (C8480h) null));
        return C13598b0.f38549a;
    }
}
