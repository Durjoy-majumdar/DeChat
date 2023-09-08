package mx1;

import a14.C0000n0;
import com.tencent.p014mm.plugin.game.autogen.chatroom.AdminInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomUserData;
import ex1.C45711d;
import ex1.C45712e;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C36907w;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.game.chatroom.viewmodel.ChatroomMemberViewModel$insertUsers$1", mo125469f = "ChatroomMemberViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: mx1.i */
public final class C47133i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ List<ChatroomUserData> f126640d;

    /* renamed from: e */
    public final /* synthetic */ C47127f f126641e;

    /* renamed from: f */
    public final /* synthetic */ String f126642f;

    /* renamed from: g */
    public final /* synthetic */ AdminInfo f126643g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47133i(List<? extends ChatroomUserData> list, C47127f fVar, String str, AdminInfo adminInfo, C15601d<? super C47133i> dVar) {
        super(2, dVar);
        this.f126640d = list;
        this.f126641e = fVar;
        this.f126642f = str;
        this.f126643g = adminInfo;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C47133i(this.f126640d, this.f126641e, this.f126642f, this.f126643g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C47133i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        LinkedList<String> linkedList;
        ResultKt.throwOnFailure(obj);
        long currentTimeMillis = System.currentTimeMillis();
        List<ChatroomUserData> list = this.f126640d;
        String str = this.f126642f;
        AdminInfo adminInfo = this.f126643g;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (ChatroomUserData chatroomUserData : list) {
            C45711d dVar = new C45711d();
            dVar.field_compositionKey = str + chatroomUserData.username;
            String str2 = chatroomUserData.username;
            dVar.field_userName = str2;
            dVar.field_nickName = chatroomUserData.nickname;
            dVar.field_roomName = str;
            dVar.field_avatarURL = chatroomUserData.avatar;
            C87412m.m108593f(str2, "it.username");
            int i = 1;
            if (!C87412m.m108589b(adminInfo != null ? adminInfo.owner_username : null, str2)) {
                if (adminInfo == null || (linkedList = adminInfo.admin_username_list) == null || !linkedList.contains(str2)) {
                    i = 0;
                }
                i = i != 0 ? 2 : 0;
            }
            dVar.field_role = i;
            dVar.field_updateTime = currentTimeMillis;
            arrayList.add(dVar);
        }
        ((C45712e) this.f126641e.f126631h.getValue()).mo71203OQ(arrayList, this.f126642f);
        return C13598b0.f38549a;
    }
}
