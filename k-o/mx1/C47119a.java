package mx1;

import a14.C53872d1;
import a14.C53895h;
import a14.C53916l;
import a14.C53921m;
import a14.C53930o0;
import a14.C53934p0;
import ax1.C39646i;
import bx1.C39856k;
import bx1.C39859l;
import bx1.C39867t;
import com.tencent.p014mm.plugin.game.autogen.chatroom.AdminInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetUserAtMemberListResponse;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.stubs.logger.Log;
import di3.C86312j;
import ex1.C45711d;
import ex1.C45712e;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Result;
import ob0.C11385n;
import ob0.C117747y;
import p749xh.C66261f3;
import pe3.C47465a;
import py1.C47617l;
import py1.C47680u;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sw1.C48485r;
import sx3.C36907w;
import sx3.C64186f0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C66447b;
import z04.C119027c;

/* renamed from: mx1.a */
public final class C47119a implements C11385n {

    /* renamed from: d */
    public static final C47119a f126606d = new C47119a();

    /* renamed from: e */
    public static final C13601g f126607e;

    /* renamed from: f */
    public static final C13601g f126608f;

    /* renamed from: g */
    public static final C13601g f126609g;

    /* renamed from: h */
    public static final C13601g f126610h;

    /* renamed from: i */
    public static final C13601g f126611i;

    /* renamed from: j */
    public static final C13601g f126612j = C36568h.m40985a(C47120a.f126613d);

    /* renamed from: mx1.a$b */
    public static final class C34679b extends C87413o implements C32224a<HashMap<String, AdminInfo>> {

        /* renamed from: d */
        public static final C34679b f93240d = new C34679b();

        public C34679b() {
            super(0);
        }

        public Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: mx1.a$c */
    public static final class C34680c extends C87413o implements C32224a<HashMap<String, C39646i>> {

        /* renamed from: d */
        public static final C34680c f93241d = new C34680c();

        public C34680c() {
            super(0);
        }

        public Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: mx1.a$d */
    public static final class C34681d extends C87413o implements C32224a<C45712e> {

        /* renamed from: d */
        public static final C34681d f93242d = new C34681d();

        public C34681d() {
            super(0);
        }

        public Object invoke() {
            return (C45712e) C86312j.m106911c(C45712e.class);
        }
    }

    /* renamed from: mx1.a$e */
    public static final class C34682e extends C87413o implements C32224a<HashMap<String, C13604l<? extends String, ? extends String>>> {

        /* renamed from: d */
        public static final C34682e f93243d = new C34682e();

        public C34682e() {
            super(0);
        }

        public Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: mx1.a$f */
    public static final class C34683f extends C87413o implements C32224a<HashMap<String, List<? extends String>>> {

        /* renamed from: d */
        public static final C34683f f93244d = new C34683f();

        public C34683f() {
            super(0);
        }

        public Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: mx1.a$a */
    public static final class C47120a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C47120a f126613d = new C47120a();

        public C47120a() {
            super(0);
        }

        public Object invoke() {
            int i;
            C47680u b = C41853c.m45368b();
            if (b != null) {
                C47617l lVar = b.f128045f;
                Integer valueOf = lVar != null ? Integer.valueOf(lVar.f127847f) : null;
                if (valueOf != null) {
                    i = valueOf.intValue();
                    return Integer.valueOf(i);
                }
            }
            i = 50;
            return Integer.valueOf(i);
        }
    }

    static {
        C13602i iVar = C13602i.NONE;
        f126607e = C36568h.m40986b(iVar, C34680c.f93241d);
        f126608f = C36568h.m40986b(iVar, C34679b.f93240d);
        f126609g = C36568h.m40986b(iVar, C34682e.f93243d);
        f126610h = C36568h.m40986b(iVar, C34683f.f93244d);
        f126611i = C36568h.m40986b(iVar, C34681d.f93242d);
    }

    /* renamed from: a */
    public static final Object m52417a(C47119a aVar, List list, String str, C15601d dVar) {
        aVar.getClass();
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        if (list.isEmpty() && mVar.mo74597a()) {
            Result.Companion companion = Result.Companion;
            mVar.resumeWith(Result.m168114constructorimpl(C64186f0.f181907d));
        }
        List<C45711d> iP = ((C45712e) f126611i.getValue()).mo71207iP(list, str);
        if (iP.size() != list.size()) {
            ArrayList arrayList = new ArrayList(C36907w.m41090l(iP, 10));
            for (C45711d dVar2 : iP) {
                arrayList.add(dVar2.field_userName);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next : list) {
                if (!arrayList.contains((String) next)) {
                    arrayList2.add(next);
                }
            }
            if (!arrayList2.isEmpty()) {
                C86709a0.m107524d().mo123460f(new C39856k(new LinkedList(list), str, f126606d.mo72231b().get(str), false, mVar));
            }
        } else if (mVar.mo74597a()) {
            mVar.resumeWith(Result.m168114constructorimpl(iP));
        }
        return mVar.mo74608o();
    }

    /* renamed from: b */
    public final HashMap<String, AdminInfo> mo72231b() {
        return (HashMap) f126608f.getValue();
    }

    /* renamed from: c */
    public final HashMap<String, C39646i> mo72232c() {
        return (HashMap) f126607e.getValue();
    }

    /* renamed from: d */
    public final LinkedList<String> mo72233d(List<String> list, String str) {
        int size = list.size();
        C13601g gVar = f126612j;
        if (size > ((Number) ((C36570n) gVar).getValue()).intValue()) {
            List<String> subList = list.subList(((Number) ((C36570n) gVar).getValue()).intValue(), size);
            ((HashMap) f126610h.getValue()).put(str, subList);
            List<String> subList2 = list.subList(0, ((Number) ((C36570n) gVar).getValue()).intValue());
            Log.m106505i("GameChatRoom.ChatroomMemberPreloadManager", "handleSyncChatroomMember restList size = " + subList.size() + "  requestSize = " + subList2.size() + "  rawUserSize =" + list.size());
            list = subList2;
        } else {
            ((HashMap) f126610h.getValue()).remove(str);
        }
        return list instanceof LinkedList ? (LinkedList) list : new LinkedList<>(list);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C117747y yVar2 = yVar;
        Class cls = C48485r.class;
        if (yVar2 != null) {
            int type = yVar.getType();
            int i3 = 0;
            boolean z = true;
            if (type != 4713) {
                if (type == 4952) {
                    C47119a aVar = f126606d;
                    if (i == 0 && i2 == 0 && (yVar2 instanceof C39856k)) {
                        C39856k kVar = (C39856k) yVar2;
                        if (kVar.f106890g) {
                            List list = (List) ((HashMap) f126610h.getValue()).get(kVar.f106888e);
                            if (list != null && !list.isEmpty()) {
                                z = false;
                            }
                            if (z) {
                                C13604l lVar = (C13604l) ((HashMap) f126609g.getValue()).get(kVar.f106888e);
                                if (lVar != null) {
                                    if (lVar.f38555d == null) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        C48485r rVar = (C48485r) C86312j.m106911c(cls);
                                        String str2 = kVar.f106888e + C66261f3.COL_UPDATETIME;
                                        byte[] bArr = new byte[8];
                                        while (i3 < 8) {
                                            bArr[i3] = (byte) ((int) ((currentTimeMillis >> (i3 * 8)) & 255));
                                            i3++;
                                        }
                                        rVar.vn0(str2, bArr);
                                    }
                                    byte[] bytes = ((String) lVar.f38556e).getBytes(C119027c.f356488a);
                                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                                    ((C48485r) C86312j.m106911c(cls)).vn0(kVar.f106888e + "memberVersion", bytes);
                                }
                                aVar.mo72231b().remove(kVar.f106888e);
                                C39646i remove = aVar.mo72232c().remove(kVar.f106888e);
                                if (remove != null) {
                                    remove.mo62217c();
                                    return;
                                }
                                return;
                            }
                            C86709a0.m107524d().mo123460f(new C39856k(aVar.mo72233d(list, kVar.f106888e), kVar.f106888e, aVar.mo72231b().get(kVar.f106888e), true, (C53916l) null, 16, (C8480h) null));
                        }
                    }
                } else if (type == 5069) {
                    C47119a aVar2 = f126606d;
                    if (i == 0 && i2 == 0 && (yVar2 instanceof C39859l)) {
                        C39859l lVar2 = (C39859l) yVar2;
                        if (lVar2.getCommReqResp().f127056b.f127083a instanceof GetUserAtMemberListResponse) {
                            C47465a aVar3 = lVar2.getCommReqResp().f127056b.f127083a;
                            C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListResponse");
                            LinkedList<String> linkedList = ((GetUserAtMemberListResponse) aVar3).at_member_username_list;
                            Log.m106505i("GameChatRoom.ChatroomMemberPreloadManager", "handleCgiGetUserAtMemberList  atMembers = " + linkedList.size() + "  threadId = " + Thread.currentThread().getId() + "   threadName =  " + Thread.currentThread().getName());
                            if (linkedList.isEmpty()) {
                                HashMap<String, C39646i> c = aVar2.mo72232c();
                                C47465a aVar4 = lVar2.getCommReqResp().f127055a.f127080a;
                                C87412m.m108592e(aVar4, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest");
                                C39646i iVar = c.get(((GetUserAtMemberListRequest) aVar4).chatroom_name);
                                if (iVar != null) {
                                    iVar.mo62215a(C64186f0.f181907d);
                                    return;
                                }
                                return;
                            }
                            C53895h.m60466d(C53930o0.m60554a(C53872d1.f151119c), (C66212f) null, (C53934p0) null, new C47122c(linkedList, yVar2, (C15601d<? super C47122c>) null), 3, (Object) null);
                        }
                    }
                }
            } else if (i == 0 && i2 == 0 && (yVar2 instanceof C39867t)) {
                StringBuilder sb = new StringBuilder();
                sb.append("handleSyncChatroomMember  rawUserSize = ");
                C39867t tVar = (C39867t) yVar2;
                sb.append(tVar.mo62496k1().member_username_list.size());
                sb.append(" chatroomName = ");
                sb.append(tVar.mo62495j1().chatroom_name);
                sb.append("   lastVersion = ");
                sb.append(tVar.mo62495j1().last_version);
                sb.append("   nextVersion = ");
                sb.append(tVar.mo62496k1().next_version);
                Log.m106505i("GameChatRoom.ChatroomMemberPreloadManager", sb.toString());
                LinkedList<String> linkedList2 = tVar.mo62496k1().member_username_list;
                if (linkedList2 == null || linkedList2.isEmpty()) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    String str3 = tVar.mo62496k1().next_version;
                    C87412m.m108593f(str3, "scene.response.next_version");
                    byte[] bytes2 = str3.getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
                    ((C48485r) C86312j.m106911c(cls)).vn0(tVar.mo62495j1().chatroom_name + "memberVersion", bytes2);
                    return;
                }
                String str4 = tVar.mo62495j1().chatroom_name;
                C87412m.m108593f(str4, "scene.request.chatroom_name");
                ((HashMap) f126609g.getValue()).put(str4, new C13604l(tVar.mo62495j1().last_version, tVar.mo62496k1().next_version));
                C53895h.m60466d(C53930o0.m60554a(C53872d1.f151119c), (C66212f) null, (C53934p0) null, new C47124d(yVar2, (C15601d<? super C47124d>) null), 3, (Object) null);
            }
        }
    }
}
