package mx1;

import a14.C0000n0;
import a14.C53921m;
import ax1.C39639c;
import com.tencent.p014mm.plugin.game.autogen.chatroom.AdminInfo;
import cx1.C45223e;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.game.chatroom.viewmodel.ChatroomMemberViewModel$preloadChatroomMember$1", mo125469f = "ChatroomMemberViewModel.kt", mo125470l = {100}, mo125471m = "invokeSuspend")
/* renamed from: mx1.k */
public final class C47135k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f126645d;

    /* renamed from: e */
    public final /* synthetic */ C47127f f126646e;

    /* renamed from: f */
    public final /* synthetic */ AdminInfo f126647f;

    /* renamed from: g */
    public final /* synthetic */ String f126648g;

    /* renamed from: h */
    public final /* synthetic */ boolean f126649h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47135k(C47127f fVar, AdminInfo adminInfo, String str, boolean z, C15601d<? super C47135k> dVar) {
        super(2, dVar);
        this.f126646e = fVar;
        this.f126647f = adminInfo;
        this.f126648g = str;
        this.f126649h = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C47135k(this.f126646e, this.f126647f, this.f126648g, this.f126649h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C47135k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f126645d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.f126646e.f126630g;
            LinkedList<String> linkedList = this.f126647f.admin_username_list;
            C87412m.m108593f(linkedList, "adminInfo.admin_username_list");
            C47127f fVar = this.f126646e;
            for (String str2 : linkedList) {
                if (!fVar.f126632i.contains(str2)) {
                    fVar.f126632i.add(str2);
                }
            }
            if (!this.f126646e.f126632i.contains(this.f126648g)) {
                this.f126646e.f126632i.add(this.f126648g);
            }
            if (str != null) {
                C47119a aVar2 = C47119a.f126606d;
                this.f126645d = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                ((C39639c) C86312j.m106911c(C39639c.class)).lx0(str, new C47121b(str, mVar));
                obj = mVar.mo74608o();
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                C47127f.m52422c3(this.f126646e, (C45223e) null, this.f126649h);
                return C13598b0.f38549a;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C47127f.m52422c3(this.f126646e, (C45223e) obj, this.f126649h);
        return C13598b0.f38549a;
    }
}
