package bx1;

import a14.C53916l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.AdminInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomUserSimpleData;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ex1.C45711d;
import ex1.C45712e;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Result;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sx3.C36907w;

/* renamed from: bx1.k */
public final class C39856k extends C117747y implements C1311n {

    /* renamed from: d */
    public final LinkedList<String> f106887d;

    /* renamed from: e */
    public final String f106888e;

    /* renamed from: f */
    public final AdminInfo f106889f;

    /* renamed from: g */
    public final boolean f106890g;

    /* renamed from: h */
    public final C53916l<List<? extends C45711d>> f106891h;

    /* renamed from: i */
    public final C13601g f106892i;

    /* renamed from: j */
    public C11385n f106893j;

    /* renamed from: n */
    public final C13601g f106894n;

    /* renamed from: bx1.k$a */
    public static final class C39857a extends C87413o implements C32224a<C47350c> {

        /* renamed from: d */
        public final /* synthetic */ C39856k f106895d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39857a(C39856k kVar) {
            super(0);
            this.f106895d = kVar;
        }

        public Object invoke() {
            C47350c.C47352b bVar = new C47350c.C47352b();
            C39856k kVar = this.f106895d;
            bVar.f127066a = new BatchGetSimpleChatroomMemberRequest();
            bVar.f127067b = new BatchGetSimpleChatroomMemberResponse();
            bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/batchgetsimplechatroommember";
            kVar.getClass();
            bVar.f127069d = 4952;
            C47350c a = bVar.mo72403a();
            C47465a aVar = a.f127055a.f127080a;
            if (aVar instanceof BatchGetSimpleChatroomMemberRequest) {
                ((BatchGetSimpleChatroomMemberRequest) aVar).username_list = this.f106895d.f106887d;
            }
            return a;
        }
    }

    /* renamed from: bx1.k$b */
    public static final class C39858b extends C87413o implements C32224a<C45712e> {

        /* renamed from: d */
        public static final C39858b f106896d = new C39858b();

        public C39858b() {
            super(0);
        }

        public Object invoke() {
            return (C45712e) C86312j.m106911c(C45712e.class);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39856k(LinkedList linkedList, String str, AdminInfo adminInfo, boolean z, C53916l lVar, int i, C8480h hVar) {
        this(linkedList, str, adminInfo, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : lVar);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106893j = nVar;
        Object value = this.f106894n.getValue();
        C87412m.m108593f(value, "<get-commReqResp>(...)");
        return dispatch(gVar, (C47350c) value, this);
    }

    public int getType() {
        return 4952;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        LinkedList<String> linkedList;
        Log.m105924i("ChatroomMemberPreloadManager.SyncRoomMember", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        if (i2 == 0 && i3 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Object value = this.f106894n.getValue();
            C87412m.m108593f(value, "<get-commReqResp>(...)");
            C47465a aVar = ((C47350c) value).f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberResponse");
            LinkedList<ChatroomUserSimpleData> linkedList2 = ((BatchGetSimpleChatroomMemberResponse) aVar).simple_data_list;
            C87412m.m108593f(linkedList2, "response.simple_data_list");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
            for (ChatroomUserSimpleData chatroomUserSimpleData : linkedList2) {
                C45711d dVar = new C45711d();
                dVar.field_compositionKey = this.f106888e + chatroomUserSimpleData.username;
                String str2 = chatroomUserSimpleData.username;
                dVar.field_userName = str2;
                dVar.field_nickName = chatroomUserSimpleData.nickname;
                dVar.field_roomName = this.f106888e;
                dVar.field_avatarURL = chatroomUserSimpleData.avatar;
                C87412m.m108593f(str2, "it.username");
                AdminInfo adminInfo = this.f106889f;
                int i4 = 1;
                if (!C87412m.m108589b(adminInfo != null ? adminInfo.owner_username : null, str2)) {
                    if (adminInfo == null || (linkedList = adminInfo.admin_username_list) == null || !linkedList.contains(str2)) {
                        i4 = 0;
                    }
                    i4 = i4 != 0 ? 2 : 0;
                }
                dVar.field_role = i4;
                dVar.field_updateTime = currentTimeMillis;
                arrayList.add(dVar);
            }
            C53916l<List<? extends C45711d>> lVar = this.f106891h;
            if (lVar != null && lVar.mo74597a()) {
                this.f106891h.resumeWith(Result.m168114constructorimpl(arrayList));
            }
            ((C45712e) this.f106892i.getValue()).mo71203OQ(arrayList, this.f106888e);
        }
        C11385n nVar = this.f106893j;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    public C39856k(LinkedList<String> linkedList, String str, AdminInfo adminInfo, boolean z, C53916l<? super List<? extends C45711d>> lVar) {
        C87412m.m108594g(linkedList, "userNameList");
        C87412m.m108594g(str, "chatroomName");
        this.f106887d = linkedList;
        this.f106888e = str;
        this.f106889f = adminInfo;
        this.f106890g = z;
        this.f106891h = lVar;
        C13602i iVar = C13602i.NONE;
        this.f106892i = C36568h.m40986b(iVar, C39858b.f106896d);
        this.f106894n = C36568h.m40986b(iVar, new C39857a(this));
    }
}
