package eb0;

import a11.C39479c;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ChatroomMemberDataUpdatedEvent;
import com.tencent.p014mm.autogen.events.GetChatRoomInfoDetailEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.GroupUpgradeGuideHandleStruct;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import f62.C75700k0;
import g62.C32330n;
import gc2.C116945b;
import gc2.C75902d;
import he0.C76158j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;
import lc3.C10485b;
import p196ln.C76706g;
import p530fx.C45819c;
import p749xh.C53339k1;
import p788aj.C39607a;
import p788aj.C39608b;
import p823sg.C101611g;
import p823sg.C101614i;
import qe0.C12158i;
import sf0.C48374j0;
import tc0.C77885p;
import te3.C49324es;
import te3.C49464fs;
import te3.C49628gy2;
import te3.C49908iw2;
import te3.C51163rv3;
import te3.C51726vq2;
import te3.C51866wq2;
import zt3.C119157j;

/* renamed from: eb0.m0 */
public final class C45612m0 {

    /* renamed from: a */
    public static C51866wq2 f123381a = new C51866wq2();

    /* renamed from: b */
    public static C101611g<String, String> f123382b = new C101614i(100);

    /* renamed from: eb0.m0$a */
    public class C31490a implements Runnable {
        public void run() {
            Class cls = C45819c.class;
            Log.m105924i("MicroMsg.ChatroomMembersLogic", "checkGetChatroomMemberDetail " + C45612m0.f123381a.f144228d.size());
            if (C45612m0.f123381a.f144228d.isEmpty()) {
                byte[] decodeBytes = MultiProcessMMKV.getMMKV("getChatroomMemberDetail_" + C86718e.m107549h()).decodeBytes("detail");
                if (decodeBytes != null) {
                    C51866wq2 wq22 = new C51866wq2();
                    try {
                        wq22.parseFrom(decodeBytes);
                    } catch (IOException e) {
                        Log.m105920e("MicroMsg.ChatroomMembersLogic", "checkGetChatroomMemberDetail " + e.getMessage());
                    }
                    C45612m0.f123381a.f144228d.addAll(wq22.f144228d);
                } else {
                    return;
                }
            }
            if (C45612m0.f123381a.f144228d.isEmpty()) {
                Log.m105924i("MicroMsg.ChatroomMembersLogic", "getChatroomMemberDetails is null");
                return;
            }
            Log.m105924i("MicroMsg.ChatroomMembersLogic", "start Conversation:" + C45612m0.f123381a.f144228d.size());
            ArrayList arrayList = new ArrayList();
            Iterator<C51726vq2> it = C45612m0.f123381a.f144228d.iterator();
            while (it.hasNext()) {
                C51726vq2 next = it.next();
                if (((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69771j(next.f143625d) != null) {
                    ((C45819c) C86312j.m106911c(cls)).mo71192mK(next.f143625d).mo71501l(next.f143625d, next.f143626e).mo100865c();
                    arrayList.add(next);
                    Log.m105924i("MicroMsg.ChatroomMembersLogic", "checkGetChatroomMemberDetail " + next.f143625d + " " + next.f143626e);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C45612m0.f123381a.f144228d.remove((C51726vq2) it4.next());
            }
            Log.m105924i("MicroMsg.ChatroomMembersLogic", "delete " + arrayList.size() + " " + C45612m0.f123381a.f144228d.size());
            try {
                MultiProcessMMKV.getMMKV("getChatroomMemberDetail_" + C86718e.m107549h()).encode("detail", C45612m0.f123381a.toByteArray());
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.ChatroomMembersLogic", "checkGetChatroomMemberDetail " + e2.getMessage());
            }
            Log.m105924i("MicroMsg.ChatroomMembersLogic", "end Conversation");
            arrayList.clear();
            Iterator<C51726vq2> it5 = C45612m0.f123381a.f144228d.iterator();
            while (it5.hasNext()) {
                C51726vq2 next2 = it5.next();
                ((C45819c) C86312j.m106911c(cls)).mo71192mK(next2.f143625d).mo71501l(next2.f143625d, next2.f143626e).mo100865c();
                arrayList.add(next2);
            }
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                C45612m0.f123381a.f144228d.remove((C51726vq2) it6.next());
            }
            Log.m105924i("MicroMsg.ChatroomMembersLogic", "delete " + arrayList.size() + " " + C45612m0.f123381a.f144228d.size());
            try {
                MultiProcessMMKV.getMMKV("getChatroomMemberDetail_" + C86718e.m107549h()).encode("detail", C45612m0.f123381a.toByteArray());
            } catch (IOException e3) {
                Log.m105920e("MicroMsg.ChatroomMembersLogic", "checkGetChatroomMemberDetail " + e3.getMessage());
            }
        }
    }

    /* renamed from: A */
    public static boolean m50674A(String str, String str2) {
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        if (Lo == null) {
            return false;
        }
        return Lo.mo69796x2(str2) || Lo.mo69793u2(str2);
    }

    /* renamed from: B */
    public static boolean m50675B(String str) {
        return C72996z1.m85820U5(str) && !m50705v(str, true);
    }

    /* renamed from: C */
    public static void m50676C(String str) {
        C44662n1 n1Var = (C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
        C44661m1 Lo = n1Var.mo69799Lo(str);
        if (Lo != null && Lo.field_chatroomNoticeNew != 0) {
            Lo.field_chatroomNoticeNew = 0;
            n1Var.replace(Lo);
        }
    }

    /* renamed from: D */
    public static void m50677D(String str, String str2) {
        C44662n1 n1Var = (C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
        C44661m1 Lo = n1Var.mo69799Lo(str);
        if (Lo != null && Lo.field_chatroomNoticeNew != 0 && !Util.isNullOrNil(Lo.field_xmlChatroomnotice) && Lo.field_xmlChatroomnotice.contains(str2)) {
            Lo.field_chatroomNoticeNew = 0;
            n1Var.replace(Lo);
        }
    }

    /* renamed from: E */
    public static C72996z1 m50678E(C72996z1 z1Var, C49908iw2 iw22) {
        z1Var.setUsername(C48374j0.m53718g(iw22.f135708d));
        z1Var.mo62878U2(C48374j0.m53718g(iw22.f135708d));
        z1Var.mo62882W2(C48374j0.m53718g(iw22.f135708d));
        z1Var.mo62884X2(C48374j0.m53718g(iw22.f135712h));
        z1Var.mo62900f4(iw22.f135713i);
        z1Var.mo62860K2(C48374j0.m53718g(iw22.f135714j));
        z1Var.mo62864M2(C48374j0.m53718g(iw22.f135715n));
        z1Var.mo62862L2(C48374j0.m53718g(iw22.f135712h));
        z1Var.mo62866N3(iw22.f135717p);
        z1Var.mo62889Z3(iw22.f135721t);
        z1Var.mo62893c4(RegionCodeDecoder.m124564q(iw22.f135724w, iw22.f135718q, iw22.f135719r));
        z1Var.mo62902g4(iw22.f135720s);
        return z1Var;
    }

    /* renamed from: F */
    public static void m50679F(String str, C44661m1 m1Var, int i, C72996z1 z1Var) {
        C49628gy2 gy22 = new C49628gy2();
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str;
        rv32.f141176e = true;
        gy22.f134349d = rv32;
        gy22.f134350e = i;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(74, gy22));
        if (z1Var != null && !TextUtils.isEmpty(z1Var.getUsername())) {
            C45628s0.m50761Z(z1Var, true);
        }
    }

    /* renamed from: G */
    public static boolean m50680G(C44661m1 m1Var) {
        if (m1Var == null) {
            Log.m105920e("MicroMsg.ChatroomMembersLogic", "updateChatroomMember error! member is null");
            return false;
        }
        boolean replace = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).replace(m1Var);
        if (replace) {
            String str = m1Var.field_chatroomname;
            String str2 = m1Var.field_roomowner;
            Log.m105919d("MicroMsg.ChatroomMembersLogic", "update contact chatroom type to %d", 1);
            C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
            C72996z1 z1Var = Ni.get(str);
            if (((int) z1Var.f108320R1) != 0 && !Util.isNullOrNil(str2) && !Util.isNullOrNil(C75592q0.m90789s())) {
                if (str2.equals(C75592q0.m90789s())) {
                    z1Var.mo62858I3(1, 1);
                } else {
                    z1Var.mo62858I3(1, 0);
                }
                Ni.mo69719p3(str, z1Var);
            }
        }
        return replace;
    }

    /* renamed from: H */
    public static void m50681H(String str, int i) {
        C44662n1 n1Var = (C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
        C44661m1 Lo = n1Var.mo69799Lo(str);
        if (Lo != null) {
            if (Lo.mo69794v2(Lo.f121084u1)) {
                Lo.mo69784l2();
            }
            C39607a aVar = Lo.f121084u1;
            aVar.f106337f = i;
            Lo.mo69782E2(str, aVar, false);
            n1Var.replace(Lo);
        }
    }

    /* renamed from: I */
    public static boolean m50682I(String str, String str2, C49324es esVar, int i, int i2, int i3, String str3, C39607a aVar, IEvent iEvent) {
        String str4;
        C39608b n2;
        String str5 = str;
        String str6 = str2;
        C49324es esVar2 = esVar;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        String str7 = str3;
        C39607a aVar2 = aVar;
        Class cls = C76706g.class;
        Class cls2 = C39479c.class;
        if (str.toLowerCase().endsWith("@chatroom") || str.toLowerCase().endsWith("@im.chatroom") || str.toLowerCase().endsWith("@groupcard") || str.toLowerCase().endsWith("@talkroom")) {
            C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(cls2)).mo62084mr()).mo69799Lo(str5);
            if (Lo != null) {
                aVar2.f106341j = Lo.mo69791s2();
            } else {
                aVar2.f106341j = 0;
            }
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < esVar2.f133093d; i7++) {
                arrayList.add(esVar2.f133094e.get(i7).f133650d);
            }
            long currentTimeMillis = System.currentTimeMillis();
            SingleTable singleTable = C53339k1.f149474h1;
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            LinkedList linkedList3 = new LinkedList();
            Column column = C53339k1.f149475i1;
            linkedList.add(column);
            List<C72996z1> multiQuery = C53339k1.f149474h1.select((List<? extends ISqlColumn>) linkedList).where(column.inString(arrayList)).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3).build().multiQuery(C86709a0.m107535s().f251811i, C72996z1.class);
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (C72996z1 username : multiQuery) {
                arrayList2.remove(username.getUsername());
            }
            Log.m105924i("MicroMsg.ChatroomMembersLogic", "SyncAddChatroomMember: room:[" + str5 + "] memCnt:" + esVar2.f133093d);
            int i8 = 0;
            boolean z = false;
            while (i8 < esVar2.f133093d) {
                C49464fs fsVar = esVar2.f133094e.get(i8);
                if (!Util.isNullOrNil(fsVar.f133650d)) {
                    C39608b bVar = new C39608b();
                    bVar.f106343d = fsVar.f133650d;
                    bVar.f106346g = fsVar.f133656j;
                    bVar.f106345f = fsVar.f133655i;
                    if (esVar2.f133095f == 0) {
                        bVar.f106344e = fsVar.f133652f;
                        if (!Util.isNullOrNil(fsVar.f133654h)) {
                            C68097n Lo2 = ((C68098o) ((C76706g) C86312j.m106911c(cls)).mo106832eg()).mo93607Lo(fsVar.f133650d);
                            if (Lo2 == null) {
                                Lo2 = new C68097n();
                                Lo2.f195728a = fsVar.f133650d;
                            }
                            String str8 = fsVar.f133653g;
                            Lo2.f195732e = str8;
                            Lo2.f195731d = fsVar.f133654h;
                            Lo2.f195729b = 3;
                            Lo2.f195733f = Util.isNullOrNil(str8) ^ true ? 1 : 0;
                            ((C68098o) ((C76706g) C86312j.m106911c(cls)).mo106832eg()).mo93608Yt(Lo2);
                        }
                    }
                    if (!(Lo == null || (n2 = Lo.mo69786n2(fsVar.f133650d)) == null)) {
                        bVar.f106344e = n2.f106344e;
                        bVar.f106346g = Util.isNullOrNil(bVar.f106346g) ? n2.f106346g : bVar.f106346g;
                    }
                    aVar2.f106335d.add(bVar);
                    ((C76158j) C86312j.m106911c(C76158j.class)).ym0(fsVar.f133658o, fsVar.f133659p);
                    if (arrayList2.contains(fsVar.f133650d)) {
                        C72996z1 z1Var = new C72996z1();
                        z1Var.setUsername(fsVar.f133650d);
                        String str9 = fsVar.f133651e;
                        if (str9 != null) {
                            z1Var.mo62878U2(str9);
                        }
                        z1Var.mo62880V2(fsVar.f133658o);
                        z1Var.mo73960Q2(fsVar.f133659p);
                        z1Var.setType(z1Var.getType() | 4);
                        Ni.mo69667P3(z1Var);
                        z = true;
                    }
                }
                i8++;
                esVar2 = esVar;
                int i9 = i;
            }
            Log.m105924i("MicroMsg.ChatroomMembersLogic", "summertt SyncAddChatroomMember listUsernames size: " + arrayList.size() + " event: " + iEvent + " publish: " + z + " take[" + (System.currentTimeMillis() - currentTimeMillis) + "]ms");
            if (z) {
                m50691h(str5, aVar2.f106341j);
            } else if (Lo == null) {
                m50691h(str5, 0);
            }
            C44661m1 Lo3 = ((C44662n1) ((C39479c) C86709a0.m107533q(cls2)).mo62084mr()).mo69799Lo(str5);
            if (Lo3 == null) {
                Lo3 = new C44661m1();
            }
            int i15 = Lo3.field_chatroomStatus;
            long currentTimeMillis2 = System.currentTimeMillis();
            int i16 = i;
            if ((((long) i16) & 2) == 2) {
                Lo3.field_chatroomname = str5;
                str4 = str2;
                Lo3.field_roomowner = str4;
                Lo3.mo69780C2(arrayList);
                Lo3.field_chatroomStatus = i16;
                Lo3.mo69782E2(str3, aVar2, esVar.f133095f != 0);
                Lo3.field_memberCount = arrayList.size();
                if (Util.isNullOrNil(Lo3.mo69789q2(str5))) {
                    Lo3.field_selfDisplayName = m50694k();
                }
            } else {
                str4 = str2;
                String str10 = str3;
                Lo3.field_chatroomname = str5;
                Lo3.field_roomowner = str4;
                Lo3.mo69780C2(arrayList);
                Lo3.field_chatroomStatus = i16;
                Lo3.field_displayname = m50692i(arrayList, -1, "");
                Lo3.mo69782E2(str10, aVar2, esVar.f133095f != 0);
                Lo3.field_memberCount = arrayList.size();
            }
            int i17 = i2;
            if (i17 != -1) {
                Lo3.field_oldChatroomVersion = i17;
            }
            int i18 = i3;
            if (i18 != -1) {
                Lo3.field_chatroomVersion = i18;
            }
            int i19 = Lo3.field_memberCount;
            if (m50704u() && !Util.isNullOrNil(str)) {
                if (MultiProcessMMKV.getMMKV("room_upgrade_to_wework").getBoolean(str5, false)) {
                    Log.m105921e("MicroMsg.ChatroomMembersLogic", "handleAssociateOpenImChatroom %s member isHandle", str5);
                } else {
                    m50701r(str5, str4, i19, i16, (C75902d.C75903a) null);
                }
            }
            boolean G = m50680G(Lo3);
            if (G && i16 != i15) {
                C45628s0.f123396b.remove(str5);
            }
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
            Object[] objArr = new Object[6];
            objArr[0] = Boolean.valueOf(G);
            objArr[1] = Long.valueOf(currentTimeMillis3);
            objArr[2] = Boolean.valueOf(Lo3.mo69798z2());
            objArr[3] = Integer.valueOf(Lo3.mo69792t2() == null ? 0 : Lo3.mo69792t2().f106341j);
            objArr[4] = Integer.valueOf(Lo3.mo69792t2() == null ? 0 : Lo3.mo69792t2().f106342n);
            objArr[5] = Integer.valueOf(i);
            Log.m105925i("MicroMsg.ChatroomMembersLogic", "syncAddChatroomMember replaceChatroomMember ret : %s , during : %s %s oldVer:%s newVer:%s chatroomStatus:%s", objArr);
            if (Lo3.mo69798z2()) {
                Log.m105925i("MicroMsg.ChatroomMembersLogic", "syncAddChatroomMember OldVer:%d", Integer.valueOf(Lo3.mo69791s2()));
                ChatroomMemberDataUpdatedEvent chatroomMemberDataUpdatedEvent = new ChatroomMemberDataUpdatedEvent();
                chatroomMemberDataUpdatedEvent.f107408d.f107409a = str5;
                chatroomMemberDataUpdatedEvent.publish();
            }
            return G;
        }
        Log.m105920e("MicroMsg.ChatroomMembersLogic", "SyncAddChatroomMember: room:[" + str5 + "] listCnt:" + esVar2.f133093d);
        return false;
    }

    /* renamed from: J */
    public static boolean m50683J(String str) {
        if (!C72996z1.m85820U5(str)) {
            return false;
        }
        Log.m105919d("MicroMsg.ChatroomMembersLogic", "updateFailState chatRoomName %s", str);
        C44662n1 n1Var = (C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
        C44661m1 Lo = n1Var.mo69799Lo(str);
        if (Lo == null) {
            return false;
        }
        Lo.field_roomflag = 1;
        return n1Var.replace(Lo);
    }

    /* renamed from: a */
    public static boolean m50684a(String str, Map<String, String> map) {
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        if (Lo == null) {
            return false;
        }
        for (String next : Lo.mo69790r2()) {
            map.put(next, Lo.mo69789q2(next));
        }
        return true;
    }

    /* renamed from: b */
    public static void m50685b(boolean z) {
        Log.m105924i("MicroMsg.ChatroomMembersLogic", "checkGetChatroomMemberDetail " + z);
        if (z && f123381a.f144228d.isEmpty()) {
            return;
        }
        if (z || Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(15, (Object) null)) != 0) {
            ((C119157j) C119157j.f356862d).mo183876g(new C31490a(), "MicroMsg.ChatroomMembersLogic");
        }
    }

    /* renamed from: c */
    public static void m50686c(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ChatroomMembersLogic", "checkUpdateChatRoomInfoDetail username is null");
            return;
        }
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        if (Lo != null) {
            if (Lo.field_oldChatroomVersion < Lo.field_chatroomVersion) {
                Log.m105925i("MicroMsg.ChatroomMembersLogic", "checkUpdateChatRoomInfoDetail() %s update, stack:%s", str, Util.getStack().toString());
                GetChatRoomInfoDetailEvent getChatRoomInfoDetailEvent = new GetChatRoomInfoDetailEvent();
                getChatRoomInfoDetailEvent.f78814d.f78815a = str;
                getChatRoomInfoDetailEvent.publish();
            }
        }
    }

    /* renamed from: d */
    public static String m50687d(String str) {
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        if (Lo == null) {
            return null;
        }
        return Lo.field_chatroomnotice;
    }

    /* renamed from: e */
    public static String m50688e(String str) {
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        if (Lo == null) {
            return null;
        }
        return Lo.field_chatroomnoticeEditor;
    }

    /* renamed from: f */
    public static long m50689f(String str) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        if (Lo == null) {
            return -1;
        }
        long j = Lo.field_chatroomnoticePublishTime;
        return j == 0 ? currentTimeMillis : j;
    }

    /* renamed from: g */
    public static String m50690g(String str) {
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        if (Lo == null) {
            return null;
        }
        return Lo.field_xmlChatroomnotice;
    }

    /* renamed from: h */
    public static void m50691h(String str, int i) {
        if (Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(15, (Object) null)) != 0) {
            ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(str).mo71501l(str, i).mo100865c();
            return;
        }
        C51726vq2 vq22 = new C51726vq2();
        vq22.f143625d = str;
        vq22.f143626e = i;
        f123381a.f144228d.addFirst(vq22);
        try {
            MultiProcessMMKV.getMMKV("getChatroomMemberDetail_" + C86718e.m107549h()).encode("detail", f123381a.toByteArray());
        } catch (IOException e) {
            Log.m105920e("MicroMsg.ChatroomMembersLogic", "getChatroomMemberDetail " + e.getMessage());
        }
        Log.m105924i("MicroMsg.ChatroomMembersLogic", "getChatroomMemberDetail " + vq22.f143625d + " " + vq22.f143626e);
    }

    /* renamed from: i */
    public static String m50692i(List<String> list, int i, String str) {
        String str2 = "";
        if (!(list == null || list.size() == 0)) {
            int i2 = i - 1;
            int i3 = 0;
            while (true) {
                if (i3 >= list.size()) {
                    break;
                }
                String str3 = list.get(i3);
                if (str3.length() >= 1) {
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str3);
                    str2 = str2 + z1Var.mo62898f();
                    if (i3 == i2 && i3 < list.size()) {
                        str2 = str2 + "...";
                        break;
                    } else if (i3 < list.size() - 1) {
                        str2 = str2 + MMApplicationContext.getContext().getString(C0966R.string.b68);
                    }
                }
                i3++;
            }
            if (Util.isNullOrNil(str2) && !Util.isNullOrNil(str) && m50703t(str)) {
                return m50694k();
            }
        }
        return str2;
    }

    /* renamed from: j */
    public static String m50693j(List<String> list, String str) {
        String i = m50692i(list, -1, "");
        return (!Util.isNullOrNil(i) || !m50703t(str)) ? i : m50694k();
    }

    /* renamed from: k */
    public static String m50694k() {
        return MMApplicationContext.getContext().getResources().getString(C0966R.string.f7421ft);
    }

    /* renamed from: l */
    public static List<String> m50695l(String str) {
        if (str == null) {
            Log.m105920e("MicroMsg.ChatroomMembersLogic", "chatroomName is null");
            return null;
        } else if (m50709z(str)) {
            return ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69804bD(str);
        } else {
            Log.m105920e("MicroMsg.ChatroomMembersLogic", "getMembersByChatRoomName: this is not room:[" + str + "]");
            return null;
        }
    }

    /* renamed from: m */
    public static List<String> m50696m(String str) {
        if (str.toLowerCase().endsWith("@chatroom")) {
            return ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69804bD(str);
        }
        Log.m105920e("MicroMsg.ChatroomMembersLogic", "getMembersByChatRoomName: room:[" + str + "]");
        return null;
    }

    /* renamed from: n */
    public static int m50697n(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C45613m2 mr = ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
            if (mr != null) {
                return ((C44662n1) mr).mo69800Ow(str);
            }
            Log.m105925i("MicroMsg.ChatroomMembersLogic", "[getMembersCountByChatRoomName] cost:%s ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return 0;
        } finally {
            Log.m105925i("MicroMsg.ChatroomMembersLogic", "[getMembersCountByChatRoomName] cost:%s ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: o */
    public static String m50698o(String str) {
        String str2 = "";
        if (str != null && m50709z(str)) {
            List<String> l = m50695l(str);
            int i = 0;
            while (l != null) {
                LinkedList linkedList = (LinkedList) l;
                if (i >= linkedList.size()) {
                    break;
                }
                String str3 = (String) linkedList.get(i);
                if (str3.length() >= 1) {
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str3);
                    if (z1Var == null) {
                        str2 = str2 + str3;
                    } else {
                        str2 = str2 + z1Var.mo62909j3();
                    }
                    if (i < linkedList.size() - 1) {
                        str2 = str2 + MMApplicationContext.getContext().getString(C0966R.string.b68);
                    }
                }
                i++;
            }
        }
        return str2;
    }

    /* renamed from: p */
    public static int m50699p() {
        return ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("AssociateChatRoomLocalCheckMaxMemberCount", 200);
    }

    /* renamed from: q */
    public static List<String> m50700q(String str) {
        if (!m50709z(str)) {
            Log.m105920e("MicroMsg.ChatroomMembersLogic", "getOtherMembersByChatRoomName: room:[" + str + "]");
            return null;
        }
        List<String> l = m50695l(str);
        if (l == null) {
            return null;
        }
        LinkedList linkedList = (LinkedList) l;
        if (linkedList.size() <= 0) {
            return null;
        }
        String str2 = (String) C86709a0.m107535s().mo121142i().mo119683d(2);
        int i = 0;
        Assert.assertTrue(str2 != null && str2.length() > 0);
        while (true) {
            if (i >= linkedList.size()) {
                break;
            } else if (((String) linkedList.get(i)).equals(str2)) {
                linkedList.remove(i);
                break;
            } else {
                i++;
            }
        }
        if (linkedList.size() <= 0) {
            return null;
        }
        return l;
    }

    /* renamed from: r */
    public static void m50701r(String str, String str2, int i, int i2, C75902d.C75903a aVar) {
        if (C72996z1.m85807K5(str)) {
            long j = (long) i2;
            if ((j & 131072) != 131072 && (j & 65536) == 65536) {
                MultiProcessMMKV.getMMKV("room_upgrade_to_wework").putBoolean(str, true);
                boolean a = C12158i.m11772a();
                int p = m50699p();
                Log.m105925i("MicroMsg.ChatroomMembersLogic", "handleAssociateOpenImChatroom chatRoomName:%s chatroomOwner:%s chatroomStatus:%s isInstallWeWork:%s maxNum:%s", str, Util.nullAs(str2, "null"), Integer.valueOf(i2), Boolean.valueOf(a), Integer.valueOf(p));
                if (!a || i >= p || !Util.isEqual(str2, C75592q0.m90789s())) {
                    boolean z = !a;
                    if (!Util.isEqual(str2, C75592q0.m90789s())) {
                        z |= true;
                    }
                    if (i >= p) {
                        z |= true;
                    }
                    GroupUpgradeGuideHandleStruct groupUpgradeGuideHandleStruct = new GroupUpgradeGuideHandleStruct();
                    groupUpgradeGuideHandleStruct.f107949d = groupUpgradeGuideHandleStruct.mo86045b("Roomid", str, true);
                    groupUpgradeGuideHandleStruct.f107950e = z ? 1 : 0;
                    groupUpgradeGuideHandleStruct.mo86054n();
                    return;
                }
                C116945b.yx0().mo175769j("30001001_1", aVar);
                MultiProcessMMKV.getMMKV("room_upgrade_to_wework").putBoolean("enter_show", true);
                String string = MMApplicationContext.getResources().getString(C0966R.string.b6d);
                String string2 = MMApplicationContext.getResources().getString(C0966R.string.b6f);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(string);
                stringBuffer.append(" ");
                stringBuffer.append("<_wc_custom_link_ href=\"");
                stringBuffer.append("weixin://weixingroupupdate?");
                stringBuffer.append("roomname=");
                stringBuffer.append(str);
                stringBuffer.append("\">");
                stringBuffer.append(string2);
                stringBuffer.append("</_wc_custom_link_>");
                C72963f4 f4Var = new C72963f4();
                f4Var.mo108740T2(0);
                f4Var.mo108749c3(str);
                f4Var.mo100991d(3);
                f4Var.mo108732L2(stringBuffer.toString());
                f4Var.mo108733M2(C75604z3.m90841m(str, System.currentTimeMillis() / 1000));
                f4Var.setType(10000);
                f4Var.mo108735O2(f4Var.mo108762o2() | 8);
                C75604z3.m90852x(f4Var);
                GroupUpgradeGuideHandleStruct groupUpgradeGuideHandleStruct2 = new GroupUpgradeGuideHandleStruct();
                groupUpgradeGuideHandleStruct2.f107949d = groupUpgradeGuideHandleStruct2.mo86045b("Roomid", str, true);
                groupUpgradeGuideHandleStruct2.f107950e = (long) 0;
                groupUpgradeGuideHandleStruct2.mo86054n();
            }
        }
    }

    /* renamed from: s */
    public static boolean m50702s(String str, ArrayList<String> arrayList, String str2) {
        C44662n1 n1Var = (C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
        C44661m1 SE = n1Var.mo69801SE(str);
        List l = (str.endsWith("@chatroom") || str.endsWith("@im.chatroom")) ? m50695l(str) : new LinkedList();
        LinkedList linkedList = new LinkedList();
        int i = 0;
        if (l != null) {
            for (int i2 = 0; i2 < l.size(); i2++) {
                linkedList.add((String) l.get(i2));
            }
            while (i < arrayList.size()) {
                if (!l.contains(arrayList.get(i))) {
                    linkedList.add(arrayList.get(i));
                }
                i++;
            }
            if (!Util.isNullOrNil(str2)) {
                SE.field_roomowner = str2;
            }
            SE.mo69780C2(linkedList);
            SE.field_displayname = m50693j(linkedList, str);
            SE.field_memberCount = linkedList.size();
            return n1Var.replace(SE);
        }
        while (i < arrayList.size()) {
            linkedList.add(arrayList.get(i));
            i++;
        }
        if (!Util.isNullOrNil(str2)) {
            SE.field_roomowner = str2;
        }
        SE.mo69780C2(linkedList);
        SE.field_displayname = m50693j(linkedList, str);
        SE.field_memberCount = linkedList.size();
        SE.field_roomowner = str2;
        boolean replace = n1Var.replace(SE);
        Log.m105918d("MicroMsg.ChatroomMembersLogic", "insertMembersByChatRoomName " + replace);
        return replace;
    }

    /* renamed from: t */
    public static synchronized boolean m50703t(String str) {
        synchronized (C45612m0.class) {
            boolean z = C72996z1.m85820U5(str) && ((C39479c) C86709a0.m107533q(C39479c.class)).mo62086r1(str);
            boolean z2 = C72996z1.m85820U5(str) && !m50705v(str, false);
            Log.m105924i("MicroMsg.ChatroomMembersLogic", "isChatroomDismiss = " + z + ", inChatRoom = " + z2);
            return z || z2;
        }
    }

    /* renamed from: u */
    public static boolean m50704u() {
        return ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMForwardUpgradeChatRoomSwitch", 0) == 1;
    }

    /* renamed from: v */
    public static boolean m50705v(String str, boolean z) {
        String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
        List<String> l = m50695l(str);
        if (l == null) {
            Log.m105918d("MicroMsg.ChatroomMembersLogic", "getmembsersbychatroomname is null ");
            if (!z) {
                return false;
            }
            Log.m105928w("MicroMsg.ChatroomMembersLogic", "isInChatRoom temp change");
            return true;
        }
        LinkedList linkedList = (LinkedList) l;
        if (linkedList.size() != 0 && linkedList.contains(str2)) {
            return true;
        }
        Log.m105918d("MicroMsg.ChatroomMembersLogic", "getmembsersbychatroomname is list is zero or no contains user  " + linkedList.size() + " ");
        return false;
    }

    /* renamed from: w */
    public static boolean m50706w(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ChatroomMembersLogic", "username is null ");
            return false;
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        return z1Var != null && z1Var.mo62938w3();
    }

    /* renamed from: x */
    public static boolean m50707x(String str) {
        Class cls = C39479c.class;
        if (!C72996z1.m85820U5(str)) {
            return false;
        }
        C44662n1 n1Var = (C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr();
        n1Var.getClass();
        C44661m1 m1Var = null;
        Cursor rawQuery = n1Var.f121089d.rawQuery("select * from chatroom where chatroomname='" + Util.escapeSqlValue(str) + "'", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            m1Var = new C44661m1();
            m1Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        if (!(m1Var != null && (m1Var.field_roomflag & 1) == 0)) {
            Log.m105918d("MicroMsg.ChatroomMembersLogic", "state is die");
            return true;
        }
        List<String> bD = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69804bD(str);
        return bD == null || ((LinkedList) bD).size() == 0;
    }

    /* renamed from: y */
    public static boolean m50708y(String str) {
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        if (Lo == null) {
            Log.m105928w("MicroMsg.ChatroomMembersLogic", "isNeedUpdateChatroomInfo member is null");
            return false;
        }
        Log.m105925i("MicroMsg.ChatroomMembersLogic", "isNeedUpdateChatroomInfo old:%s new:%s", Integer.valueOf(Lo.field_oldChatroomVersion), Integer.valueOf(Lo.field_chatroomVersion));
        return Lo.field_oldChatroomVersion < Lo.field_chatroomVersion;
    }

    /* renamed from: z */
    public static boolean m50709z(String str) {
        return str.toLowerCase().endsWith("@chatroom") || str.toLowerCase().endsWith("@im.chatroom");
    }
}
