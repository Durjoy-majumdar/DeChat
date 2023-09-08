package mx1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import ax1.C39646i;
import bx1.C39859l;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest;
import com.tencent.stubs.logger.Log;
import ex1.C45711d;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import ob0.C117747y;
import pe3.C47465a;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.game.chatroom.viewmodel.ChatroomMemberPreloadManager$handleGetUserAtMembersRsp$1", mo125469f = "ChatroomMemberPreloadManager.kt", mo125470l = {186, 191}, mo125471m = "invokeSuspend")
/* renamed from: mx1.c */
public final class C47122c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f126616d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<String> f126617e;

    /* renamed from: f */
    public final /* synthetic */ C117747y f126618f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.game.chatroom.viewmodel.ChatroomMemberPreloadManager$handleGetUserAtMembersRsp$1$1", mo125469f = "ChatroomMemberPreloadManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: mx1.c$a */
    public static final class C47123a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C117747y f126619d;

        /* renamed from: e */
        public final /* synthetic */ List<C45711d> f126620e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47123a(C117747y yVar, List<? extends C45711d> list, C15601d<? super C47123a> dVar) {
            super(2, dVar);
            this.f126619d = yVar;
            this.f126620e = list;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C47123a(this.f126619d, this.f126620e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C47123a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            HashMap<String, C39646i> c = C47119a.f126606d.mo72232c();
            C47465a aVar = ((C39859l) this.f126619d).getCommReqResp().f127055a.f127080a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest");
            C39646i iVar = c.get(((GetUserAtMemberListRequest) aVar).chatroom_name);
            if (iVar != null) {
                iVar.mo62215a(this.f126620e);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47122c(LinkedList<String> linkedList, C117747y yVar, C15601d<? super C47122c> dVar) {
        super(2, dVar);
        this.f126617e = linkedList;
        this.f126618f = yVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C47122c(this.f126617e, this.f126618f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C47122c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f126616d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C47119a aVar2 = C47119a.f126606d;
            LinkedList<String> linkedList = this.f126617e;
            C87412m.m108593f(linkedList, "userNames");
            C47465a aVar3 = ((C39859l) this.f126618f).getCommReqResp().f127055a.f127080a;
            C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest");
            String str = ((GetUserAtMemberListRequest) aVar3).chatroom_name;
            C87412m.m108593f(str, "scene.request.chatroom_name");
            this.f126616d = 1;
            obj = C47119a.m52417a(aVar2, linkedList, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj;
        Log.m106505i("GameChatRoom.ChatroomMemberPreloadManager", "getSimpleUsersFromDbOrNet  rawUserSize = " + this.f126617e.size() + " resultSimpleUsers = " + list.size() + "  threadId = " + Thread.currentThread().getId() + "   threadName =  " + Thread.currentThread().getName());
        C53896h0 h0Var = C53872d1.f151117a;
        C53915k2 k2Var = C58901s.f168555a;
        C47123a aVar4 = new C47123a(this.f126618f, list, (C15601d<? super C47123a>) null);
        this.f126616d = 2;
        if (C53895h.m60469g(k2Var, aVar4, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
