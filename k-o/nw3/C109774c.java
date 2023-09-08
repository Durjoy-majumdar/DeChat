package nw3;

import android.text.TextUtils;
import as3.C103860b1;
import bs3.C104161b;
import bs3.C104163d;
import bs3.C104166f;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember;
import com.tencent.wecall.talkroom.model.TalkRoom;
import cs3.C106962a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: nw3.c */
public final class C109774c {

    /* renamed from: d */
    public static final C104163d<C109774c> f328537d = new C109775a();

    /* renamed from: a */
    public Map<String, TalkRoom> f328538a = new HashMap();

    /* renamed from: b */
    public Map<String, String> f328539b = new HashMap();

    /* renamed from: c */
    public C109804j f328540c;

    /* renamed from: nw3.c$a */
    public static class C109775a extends C104163d<C109774c> {
    }

    public C109774c() {
        C104161b.m138993b("TalkRoomManager", "asyncLoadCache");
    }

    /* renamed from: b */
    public static C109774c m149103b() {
        T t;
        C104163d<C109774c> dVar = f328537d;
        synchronized (dVar) {
            if (dVar.f308397a == null) {
                dVar.f308397a = new C109774c();
            }
            t = dVar.f308397a;
        }
        return (C109774c) t;
    }

    /* renamed from: a */
    public int[] mo161014a(String str) {
        TalkRoom h;
        if (TextUtils.isEmpty(str) || (h = mo161020h(str)) == null) {
            return null;
        }
        ArrayList arrayList = (ArrayList) h.mo157172a();
        int[] iArr = new int[arrayList.size()];
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayList.size(); i++) {
            C109777d dVar = (C109777d) arrayList.get(i);
            if (dVar != null) {
                C103860b1 b1Var = dVar.f328542a;
                int i2 = b1Var == null ? -1 : b1Var.f306893f;
                iArr[i] = i2;
                stringBuffer.append(i2);
                stringBuffer.append(",");
            }
        }
        C104161b.m138997f("TalkRoomManager", "getAllMemberIds memberIds: ", stringBuffer.toString());
        return iArr;
    }

    /* renamed from: c */
    public String mo161015c(String str, int i, long j) {
        if (i == 0 && j == 0) {
            C104161b.m138997f("TalkRoomManager", "getMsgKeyByGroupId roomId and roomKey is 0,groupId: ", str);
            return null;
        }
        TalkRoom h = mo161020h(str);
        if (h == null) {
            C104161b.m138997f("TalkRoomManager", "getMsgKeyByGroupId talkRoom is null,groupId: ", str);
            return null;
        }
        C109777d b = h.mo157173b(C106962a.f320180a);
        if (b == null) {
            C104161b.m138997f("TalkRoomManager", "getMsgKeyByGroupId talkRoomMember is null,groupId: ", str);
            return null;
        }
        C103860b1 b1Var = b.f328542a;
        if (b1Var == null) {
            C104161b.m138997f("TalkRoomManager", "getMsgKeyByGroupId voiceGroupMem is null,groupId: ", str);
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(",");
        stringBuffer.append(i);
        stringBuffer.append(",");
        stringBuffer.append(j);
        stringBuffer.append(",");
        stringBuffer.append(b1Var.f306896i);
        C104161b.m138997f("TalkRoomManager", "getMsgKeyByGroupId msgKey is", stringBuffer.toString());
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public MultiTalkGroup mo161016d(String str) {
        int i;
        TalkRoom h = mo161020h(str);
        if (h == null) {
            return null;
        }
        MultiTalkGroup multiTalkGroup = new MultiTalkGroup();
        multiTalkGroup.f320042d = h.f320042d;
        multiTalkGroup.f320043e = h.f320043e;
        multiTalkGroup.f320045g = h.f320045g;
        multiTalkGroup.f320044f = h.f320044f;
        multiTalkGroup.f320046h = h.f320046h;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(((ConcurrentHashMap) h.f320125n).values());
        if (arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C109777d dVar = (C109777d) it.next();
                if (dVar != null) {
                    MultiTalkGroupMember multiTalkGroupMember = new MultiTalkGroupMember();
                    multiTalkGroupMember.f320048d = dVar.mo161024a();
                    C103860b1 b1Var = dVar.f328542a;
                    multiTalkGroupMember.f320049e = b1Var != null ? b1Var.f306907t : "";
                    int i2 = 0;
                    multiTalkGroupMember.f320051g = b1Var != null ? b1Var.f306892e : 0;
                    multiTalkGroupMember.f320050f = b1Var == null ? 0 : b1Var.f306891d;
                    if (!(b1Var == null || (i = b1Var.f306894g) == 0)) {
                        i2 = i;
                    }
                    multiTalkGroupMember.f320052h = i2;
                    arrayList.add(multiTalkGroupMember);
                }
            }
        }
        multiTalkGroup.f320047i = arrayList;
        return multiTalkGroup;
    }

    /* renamed from: e */
    public int mo161017e(String str) {
        TalkRoom h = mo161020h(str);
        if (h == null) {
            C104161b.m138997f("TalkRoomManager", "getMyUuid TalkRoom is null  groupId: ", str);
            return 0;
        }
        C109777d b = h.mo157173b(C106962a.f320180a);
        if (b == null) {
            C104161b.m138997f("TalkRoomManager", "getMyUuid talkRoomMember is null  groupId: ", str);
            return 0;
        }
        C103860b1 b1Var = b.f328542a;
        if (b1Var == null) {
            C104161b.m138997f("TalkRoomManager", "getMyUuid voiceGroupMem is null  groupId: ", str);
            return 0;
        }
        C104161b.m138993b("TalkRoomManager", "getMyUuid groupId: ", str, " uuid: ", Integer.valueOf(b1Var.f306889b));
        return b1Var.f306889b;
    }

    /* renamed from: f */
    public int mo161018f(String str) {
        if (TextUtils.isEmpty(str)) {
            C104161b.m138997f("TalkRoomManager", "getRountIdByGrouId invalid groupId");
            return 0;
        }
        TalkRoom h = mo161020h(str);
        if (h == null) {
            C104161b.m138997f("TalkRoomManager", "getRountIdByGrouId TalkRoom is null  groupId: ", str);
            return 0;
        }
        int i = h.f320045g;
        if (i == 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: g */
    public int mo161019g(String str) {
        if (TextUtils.isEmpty(str)) {
            C104161b.m138997f("TalkRoomManager", "getSelfMemberId invalid groupId");
            return -1;
        }
        TalkRoom h = mo161020h(str);
        if (h == null) {
            C104161b.m138997f("TalkRoomManager", "getSelfMemberId TalkRoom is null  groupId: ", str);
            return -1;
        }
        C109777d b = h.mo157173b(C106962a.f320180a);
        if (b != null) {
            Object[] objArr = new Object[6];
            objArr[0] = "getSelfMemberId TalkRoomMember is not null groupId: ";
            objArr[1] = str;
            objArr[2] = " uuid: ";
            objArr[3] = C106962a.f320180a;
            objArr[4] = " memberId: ";
            C103860b1 b1Var = b.f328542a;
            objArr[5] = Integer.valueOf(b1Var == null ? -1 : b1Var.f306893f);
            C104161b.m138997f("TalkRoomManager", objArr);
            C103860b1 b1Var2 = b.f328542a;
            if (b1Var2 == null) {
                return -1;
            }
            return b1Var2.f306893f;
        }
        C104161b.m138997f("TalkRoomManager", "getSelfMemberId TalkRoomMember is null");
        return -1;
    }

    /* renamed from: h */
    public TalkRoom mo161020h(String str) {
        TalkRoom talkRoom = (TalkRoom) ((HashMap) this.f328538a).get(str);
        if (talkRoom != null || !C109801h0.m149216a(str)) {
            return talkRoom;
        }
        return (TalkRoom) ((HashMap) this.f328538a).get((String) ((HashMap) this.f328539b).get(str));
    }

    /* renamed from: i */
    public String mo161021i(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            C104161b.m138997f("TalkRoomManager", "getUsrNameByMemberId groupId is null memberId: ", Integer.valueOf(i));
            return "";
        }
        TalkRoom h = mo161020h(str);
        if (h == null) {
            C104161b.m138997f("TalkRoomManager", "getUsrNameByMemberId talkRoom is null groupId: ", str, " memberId: ", Integer.valueOf(i));
            return "";
        }
        Iterator it = ((ArrayList) h.mo157174c()).iterator();
        while (it.hasNext()) {
            C103860b1 b1Var = (C103860b1) it.next();
            if (b1Var != null && b1Var.f306893f == i) {
                C104161b.m138993b("TalkRoomManager", "getUsrNameByMemberId wxUserName:", b1Var.f306906s, " groupId: ", str, " memberId: ", Integer.valueOf(i));
                String str2 = b1Var.f306906s;
                return str2 == null ? "" : str2;
            }
        }
        return "";
    }

    /* renamed from: j */
    public boolean mo161022j(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            C104161b.m138997f("TalkRoomManager", "isGroupActiveExceptMySelf groupid is null");
            return false;
        }
        TalkRoom h = mo161020h(str);
        if (h == null) {
            C104161b.m138997f("TalkRoomManager", "isGroupActiveExceptMySelf talkRoom is null");
            return false;
        }
        Iterator it = ((ArrayList) h.mo157172a()).iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            C109777d dVar = (C109777d) it.next();
            if (dVar != null) {
                dVar.mo161024a();
                C103860b1 b1Var = dVar.f328542a;
                if ((b1Var == null ? 0 : b1Var.f306891d) == 10) {
                    if (C104166f.m139001a(C106962a.f320180a, dVar.mo161024a())) {
                        z3 = true;
                    } else {
                        z2 = true;
                    }
                }
                if (z && z2) {
                    return true;
                }
                if (z3 && z2) {
                    C104161b.m138997f("TalkRoomManager", "isGroupActiveExceptMySelf is true");
                    return true;
                }
            }
        }
        return false;
    }
}
