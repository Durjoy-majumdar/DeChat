package mx1;

import a14.C0000n0;
import ex1.C45712e;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.game.chatroom.viewmodel.ChatroomMemberViewModel$deleteAllChatroomMember$1$1", mo125469f = "ChatroomMemberViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: mx1.h */
public final class C47132h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C47127f f126638d;

    /* renamed from: e */
    public final /* synthetic */ String f126639e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47132h(C47127f fVar, String str, C15601d<? super C47132h> dVar) {
        super(2, dVar);
        this.f126638d = fVar;
        this.f126639e = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C47132h(this.f126638d, this.f126639e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C47132h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        ((C45712e) this.f126638d.f126631h.getValue()).mo71201Dw(this.f126639e);
        return C13598b0.f38549a;
    }
}
