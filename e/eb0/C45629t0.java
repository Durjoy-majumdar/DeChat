package eb0;

import android.database.Cursor;
import com.tencent.p014mm.contact.ContactUpgradeHelper;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;
import p922vj.C78420a;

/* renamed from: eb0.t0 */
public class C45629t0 {

    /* renamed from: a */
    public static final List<C45630a> f123411a = new ArrayList();

    /* renamed from: eb0.t0$a */
    public interface C45630a {
        /* renamed from: a */
        boolean mo71148a(String str, String str2, PInt pInt);
    }

    /* renamed from: a */
    public static void m50814a(C45630a aVar) {
        Assert.assertNotNull(aVar);
        List<C45630a> list = f123411a;
        synchronized (list) {
            ((ArrayList) list).add(aVar);
        }
    }

    /* renamed from: b */
    public static int m50815b(String str, String str2) {
        boolean z;
        int i = 0;
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        if ("notification_messages".equals(str)) {
            return 8;
        }
        if (str2 != null && str2.endsWith("@chatroom")) {
            return 2;
        }
        PInt pInt = new PInt();
        synchronized (f123411a) {
            int i2 = 0;
            z = false;
            while (true) {
                List<C45630a> list = f123411a;
                if (i2 < ((ArrayList) list).size()) {
                    C45630a aVar = (C45630a) ((ArrayList) list).get(i2);
                    if (aVar != null && (z = aVar.mo71148a(str, str2, pInt))) {
                        i = pInt.value;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        if (!z) {
            return 1;
        }
        return i;
    }

    /* renamed from: c */
    public static int m50816c(String str) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        if (C72996z1.m85820U5(str)) {
            return C45628s0.m50739D(str) ? 3 : 4;
        }
        if (C72996z1.m85841l5(str)) {
            return 5;
        }
        if (C72996z1.m85808L4(str) || C72996z1.m85806K4(str) || C72996z1.m85840k5(str)) {
            return 7;
        }
        if (C72996z1.m85845p5(str)) {
            return 9;
        }
        if (C72996z1.m85855z5(str)) {
            return 8;
        }
        if (C45628s0.m50738C(str)) {
            return 6;
        }
        if (C72996z1.m85846q5(str)) {
            return 10;
        }
        return C45628s0.m50747L(str) ? 2 : 1;
    }

    /* renamed from: d */
    public static int m50817d(String str, String[] strArr) {
        boolean z;
        boolean z2;
        Class cls = C75700k0.class;
        int i = 0;
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.ConversationLogic", "get total unread, but has not set uin");
            return 0;
        }
        C44660i2 i2Var = (C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
        i2Var.getClass();
        String str2 = "select unReadCount, " + "parentRef" + " from " + "rconversation" + " where " + "username" + " = '" + str + "'" + " AND " + "unReadCount" + " > 0 ";
        boolean z3 = true;
        Log.m105919d("MicroMsg.ConversationStorage", "get unread by username, sql is %s", str2);
        Cursor rawQuery = i2Var.f121077c.rawQuery(str2, (String[]) null);
        if (rawQuery != null && rawQuery.getCount() > 0) {
            rawQuery.moveToFirst();
            String string = rawQuery.getString(1);
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).getClass();
            int decodeInt = MultiProcessMMKV.getSingleMMKV("message_fold_config2").decodeInt("fold_button_status_int_sync", 65536);
            if (!(decodeInt == 262144 || decodeInt == 65536) ? string == null || string.isEmpty() : string == null || string.isEmpty() || string.equalsIgnoreCase("message_fold")) {
                Set<String> set = C45628s0.f123410p;
                if (strArr != null) {
                    boolean z4 = false;
                    for (String str3 : strArr) {
                        if ("@all.android".equals(str3)) {
                            z4 = true;
                        } else {
                            if ("@micromsg.qq.com".equals(str3)) {
                                z2 = str.contains("@");
                            } else {
                                if ("@chatroom".equals(str3)) {
                                    z = str.endsWith("@chatroom");
                                } else if ("@talkroom".equals(str3)) {
                                    z = str.endsWith("@talkroom");
                                } else if ("@t.qq.com".equals(str3)) {
                                    z = str.endsWith("@t.qq.com");
                                } else if ("@qqim".equals(str3)) {
                                    z = str.endsWith("@qqim");
                                } else if ("@chatroom_exclusive".equals(str3)) {
                                    z2 = str.endsWith("@chatroom");
                                } else if ("@app".equals(str3)) {
                                    z = str.endsWith("@app");
                                } else if ("@openim".equals(str3)) {
                                    z = str.endsWith("@openim");
                                } else if ("@im.chatroom".equals(str3)) {
                                    z = str.endsWith("@im.chatroom");
                                } else if ("@kefu.openim".equalsIgnoreCase(str3)) {
                                    z = str.endsWith("@kefu.openim");
                                }
                                z4 |= z;
                            }
                            z = !z2;
                            z4 |= z;
                        }
                    }
                    z3 = z4;
                }
                if (z3) {
                    i = rawQuery.getInt(0);
                }
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return i;
    }

    /* renamed from: e */
    public static Map<String, C72996z1> m50818e(String str) {
        HashMap hashMap = new HashMap();
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.ConversationLogic", "get Total Unread Talker, but has not set uin");
            return hashMap;
        }
        long currentTicks = Util.currentTicks();
        C44660i2 i2Var = (C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
        i2Var.getClass();
        String str2 = "SELECT rcontact.*" + " FROM rcontact,rconversation" + " WHERE unReadCount" + " > 0 AND " + i2Var.mo69760d0() + " AND rconversation.username = rcontact.username" + Util.nullAsNil(str) + " ORDER BY " + "flag" + " DESC, " + "conversationTime" + " DESC ";
        Log.m105925i("MicroMsg.ConversationStorage", "get total unread contact with black list, sql is %s", str2);
        Cursor rawQuery = i2Var.f121077c.rawQuery(str2, (String[]) null);
        if (rawQuery != null) {
            List<String> g = m50820g();
            while (rawQuery.moveToNext()) {
                C72996z1 z1Var = new C72996z1();
                z1Var.convertFrom(rawQuery);
                if (((ArrayList) g).contains(z1Var.getUsername()) || m50822i(z1Var)) {
                    Log.m105919d("MicroMsg.ConversationLogic", "ignore contact %s", z1Var.getUsername());
                } else {
                    hashMap.put(z1Var.getUsername(), z1Var);
                }
            }
            rawQuery.close();
        }
        Log.m105925i("MicroMsg.ConversationLogic", "[getTotalUnreadTalker] cost %d ms  unread contact: %s, stack %s", Long.valueOf(Util.ticksToNow(currentTicks)), hashMap.keySet(), Util.getStack());
        return hashMap;
    }

    /* renamed from: f */
    public static HashMap<String, C72976h2> m50819f(int i) {
        Cursor F3;
        Class cls = C75700k0.class;
        long currentTicks = Util.currentTicks();
        C44660i2 i2Var = (C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
        i2Var.getClass();
        Log.m105925i("MicroMsg.ConversationStorage", "getUnreadConversationCursor filterType[%d] [%s]", Integer.valueOf(i), Util.getStack());
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT rconversation.username, rconversation.unReadCount, rconversation.conversationTime");
        boolean a = ContactUpgradeHelper.f10280h.mo1134a();
        sb.append(" from ");
        Set<String> set = C45628s0.f123410p;
        sb.append(a ? "rconversation inner join rcontact WHERE rconversation.username=rcontact.username AND " : "rconversation WHERE ");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
        sb.append("unReadCount > 0 AND (parentRef is null or parentRef = '' ) ");
        sb.append(C45628s0.m50762a(a, i));
        String sb4 = sb.toString();
        Log.m105925i("MicroMsg.ConversationStorage", "get unread conversation with black list, sql is %s", sb4);
        Cursor rawQuery = i2Var.f121077c.rawQuery(sb4, (String[]) null);
        HashMap<String, C72976h2> hashMap = new HashMap<>();
        if (rawQuery == null) {
            return hashMap;
        }
        HashSet hashSet = new HashSet();
        while (rawQuery.moveToNext()) {
            C72976h2 h2Var = new C72976h2();
            h2Var.convertFrom(rawQuery);
            hashSet.add(h2Var.getUsername());
            hashMap.put(h2Var.getUsername(), h2Var);
        }
        rawQuery.close();
        List<String> g = m50820g();
        HashSet hashSet2 = new HashSet(g);
        HashSet hashSet3 = new HashSet(hashSet);
        hashSet3.removeAll(g);
        if (!hashSet3.isEmpty() && (F3 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69654F3(new ArrayList(hashSet3))) != null) {
            while (F3.moveToNext()) {
                C72996z1 z1Var = new C72996z1();
                z1Var.convertFrom(F3);
                if (m50822i(z1Var)) {
                    Log.m105919d("MicroMsg.ConversationLogic", "ignore contact %s", z1Var.getUsername());
                    hashSet2.add(z1Var.getUsername());
                }
            }
            F3.close();
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            hashMap.remove((String) it.next());
        }
        Log.m105925i("MicroMsg.ConversationLogic", "[getUnreadConversation] cost %d ms  unread conversations: %s, stack:%s", Long.valueOf(Util.ticksToNow(currentTicks)), hashMap.keySet(), Util.getStack());
        return hashMap;
    }

    /* renamed from: g */
    public static List<String> m50820g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("floatbottle");
        if (!C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC, true)) {
            arrayList.add("notifymessage");
            Log.m105918d("MicroMsg.ConversationLogic", "add service notify message into show unread count blacklist.");
        }
        if (!C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC, true)) {
            arrayList.add("appbrandcustomerservicemsg");
            Log.m105918d("MicroMsg.ConversationLogic", "add wxa custom session notify message into show unread count blacklist.");
        }
        arrayList.add("appbrand_notify_message");
        arrayList.add("officialaccounts");
        arrayList.add("conversationboxservice");
        arrayList.add("message_fold");
        Log.m105919d("MicroMsg.ConversationLogic", "getUnreadCountBlacklist blacklist(%s).", arrayList);
        return arrayList;
    }

    /* renamed from: h */
    public static boolean m50821h(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        if (((ArrayList) m50820g()).contains(str)) {
            return true;
        }
        return m50822i(C45628s0.m50782k(str));
    }

    /* renamed from: i */
    public static boolean m50822i(C72996z1 z1Var) {
        if (!(z1Var == null || ((int) z1Var.f108320R1) == 0)) {
            if (C45628s0.m50746K(z1Var)) {
                if ((z1Var.getType() & 1024) == 0) {
                    return true;
                }
            }
            return C72996z1.m85820U5(z1Var.getUsername()) && z1Var.f149512S == 0;
        }
    }

    /* renamed from: j */
    public static void m50823j(String str) {
        Class cls = C75700k0.class;
        C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(str);
        if (j == null || (!Util.isNullOrNil(j.mo108782C2()) && !"message_fold".equalsIgnoreCase(j.mo108782C2()) && !"conversationboxservice".equalsIgnoreCase(j.mo108782C2()))) {
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69763f(str);
            return;
        }
        String[] strArr = {str};
        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69762e0(strArr, "hidden_conv_parent");
    }
}
