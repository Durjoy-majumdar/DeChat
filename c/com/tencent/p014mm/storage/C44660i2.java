package com.tencent.p014mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Looper;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMStack;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import g62.C45881a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;
import kj2.C117407d;
import p261wl.C38166b;
import p261wl.C38174i;
import p922vj.C78420a;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.i2 */
public class C44660i2 extends MStorageEx implements C30783v3 {

    /* renamed from: h */
    public static final String[] f121076h = {MAutoStorage.getCreateSQLs(C78420a.f229768m1, "rconversation"), MAutoStorage.getCreateSQLs(C78420a.f229768m1, "rbottleconversation"), "CREATE TABLE IF NOT EXISTS conversation ( unReadCount INTEGER, status INT, isSend INT, createTime LONG, username VARCHAR(40), content TEXT, reserved TEXT );", "CREATE TABLE IF NOT EXISTS bottleconversation ( unReadCount INTEGER, status INT, isSend INT, createTime LONG, username VARCHAR(40), content TEXT, reserved TEXT );", "CREATE INDEX IF NOT EXISTS rconversation_unreadcount_index ON rconversation ( unReadCount )", "DROP INDEX IF EXISTS multi_index ", "DROP INDEX IF EXISTS rconversation_multi_index", "CREATE INDEX IF NOT EXISTS rconversation_parentref_index ON  rconversation ( parentRef )", "CREATE INDEX IF NOT EXISTS rbottleconversation_unreadcount_index ON  rbottleconversation ( unReadCount )", "CREATE INDEX IF NOT EXISTS rconversation_flag_parentref_index ON  rconversation ( flag,parentRef )"};

    /* renamed from: c */
    public final ISQLiteDatabase f121077c;

    /* renamed from: d */
    public C30783v3.C30785b f121078d;

    /* renamed from: e */
    public i2$$g f121079e = new i2$$g((i2$$e) null);

    /* renamed from: f */
    public MStorageEvent<C30783v3.C30784a, C72976h2> f121080f;

    /* renamed from: g */
    public MStorageEvent<C30783v3.C30784a, C72976h2> f121081g;

    public C44660i2(ISQLiteDatabase iSQLiteDatabase) {
        boolean z;
        i2$$e i2__e = new i2$$e(this);
        this.f121080f = i2__e;
        i2__e.add(new i2$$a(), (Looper) null);
        i2$$f i2__f = new i2$$f(this);
        this.f121081g = i2__f;
        i2__f.add(new i2$$b(), (Looper) null);
        Assert.assertTrue(iSQLiteDatabase instanceof C91753f);
        Cursor rawQuery = iSQLiteDatabase.rawQuery("PRAGMA table_info( rconversation)", (String[]) null, 2);
        int columnIndex = rawQuery.getColumnIndex("name");
        while (true) {
            if (rawQuery.moveToNext()) {
                if (columnIndex >= 0 && "flag".equalsIgnoreCase(rawQuery.getString(columnIndex))) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        rawQuery.close();
        List<String> updateSQLs = MAutoStorage.getUpdateSQLs(C78420a.f229768m1, "rconversation", iSQLiteDatabase);
        updateSQLs.addAll(MAutoStorage.getUpdateSQLs(C78420a.f229768m1, "rbottleconversation", iSQLiteDatabase));
        for (String execSQL : updateSQLs) {
            iSQLiteDatabase.execSQL("rconversation", execSQL);
        }
        if (!z) {
            iSQLiteDatabase.execSQL("rconversation", "update rconversation set flag = conversationTime");
        }
        this.f121077c = iSQLiteDatabase;
    }

    /* renamed from: S */
    public static String m49224S(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (sb.length() > 0) {
                sb.append(" or ");
            }
            sb.append("parentRef");
            sb.append(" = '");
            sb.append(Util.escapeSqlValue(str));
            sb.append("'");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m49225a(String str, List<String> list) {
        StringBuilder sb = new StringBuilder("");
        if (list != null && list.size() > 0) {
            sb.append(str);
            sb.append(" not in (");
            int i = 0;
            while (i < list.size()) {
                sb.append(FastJsonResponse.QUOTE);
                sb.append(Util.escapeSqlValue(list.get(i)));
                sb.append(FastJsonResponse.QUOTE);
                sb.append(i == list.size() + -1 ? "" : ",");
                i++;
            }
            sb.append(") ");
        }
        return sb.toString();
    }

    /* renamed from: F */
    public List<String> mo69735F(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        String str = ("select username from rconversation" + m49225a(" where username", list)) + " order by flag desc, conversationTime desc";
        Log.m105925i("MicroMsg.ConversationStorage", "getAllConvUserName sql %s", str);
        Cursor rawQuery = this.f121077c.rawQuery(str, (String[]) null);
        int columnIndex = rawQuery.getColumnIndex("username");
        while (rawQuery.moveToNext()) {
            arrayList.add(rawQuery.getString(columnIndex));
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: G */
    public Cursor mo69736G(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("select unReadCount, conversationTime, username, flag");
        sb.append(" from ");
        sb.append("rconversation");
        sb.append(" where ");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
        if (str2 == null) {
            sb.append(" ( ");
            sb.append("parentRef");
            sb.append(" is null ");
            sb.append(" or ");
            sb.append("parentRef");
            sb.append(" = '' ");
            sb.append(" or ");
            sb.append(m49224S("message_fold") + " ) ");
        } else if ("*".equals(str2)) {
            sb.append(" 1 = 1 ");
        } else {
            sb.append("parentRef");
            sb.append(" = '");
            sb.append(Util.escapeSqlValue(str2));
            sb.append("' ");
        }
        sb.append(Util.nullAsNil(str));
        sb.append(" order by ");
        sb.append("flag");
        sb.append(" desc");
        sb.append(" limit ");
        sb.append(i);
        Log.m105918d("MicroMsg.ConversationStorage", "getNecessaryCursor sql " + sb.toString());
        return this.f121077c.rawQuery(sb.toString(), (String[]) null);
    }

    /* renamed from: H */
    public Cursor mo69737H(List<String> list, int i, int i2) {
        if (list == null) {
            list = new ArrayList<>();
        }
        int i3 = 0;
        String str = "select username from rconversation";
        while (i3 < list.size()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(i3 > 0 ? " and " : " where ");
            sb.append("username");
            sb.append(" != \"");
            sb.append(Util.escapeSqlValue(list.get(i3)));
            sb.append(FastJsonResponse.QUOTE);
            str = sb.toString();
            i3++;
        }
        return this.f121077c.rawQuery(str + " order by flag desc, conversationTime desc limit " + i2 + " offset " + i, (String[]) null);
    }

    /* renamed from: I */
    public Cursor mo69738I(int i, List<String> list, String str, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from ");
        sb.append("rconversation");
        sb.append(" where ");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
        if (str == null) {
            sb.append(mo69760d0());
        } else if ("*".equals(str)) {
            sb.append(" 1 = 1 ");
        } else {
            sb.append("parentRef");
            sb.append(" = '");
            sb.append(Util.escapeSqlValue(str));
            sb.append("' ");
        }
        sb.append(Util.nullAsNil(C45628s0.m50762a(false, i)));
        if (list != null && list.size() > 0) {
            for (String append : list) {
                sb.append(" and ");
                sb.append("rconversation");
                sb.append(".");
                sb.append("username");
                sb.append(" != '");
                sb.append(append);
                sb.append("'");
            }
        }
        sb.append(" order by ");
        sb.append("flag");
        sb.append(" desc, ");
        sb.append("conversationTime");
        sb.append(" desc");
        if (i2 > 0) {
            sb.append(" limit ");
            sb.append(i2);
        }
        return this.f121077c.rawQuery(sb.toString(), (String[]) null);
    }

    /* renamed from: J */
    public Cursor mo69739J(List<String> list, int i, List<String> list2, String str, boolean z, String str2) {
        String str3 = (str2 == null || str2.length() <= 0) ? " " : " and rconversation.username = rcontact.username ";
        StringBuilder sb = new StringBuilder("select unReadCount, status, isSend, conversationTime, rconversation.username, content, rconversation.msgType, rconversation.flag, rconversation.digest, rconversation.digestUser, rconversation.hasTrunc, rcontact.nickname from rconversation,rcontact" + " " + " where " + "rconversation" + "." + "username" + " = " + "rcontact" + "." + "username" + str3 + "and (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 != list.size() - 1) {
                sb.append("rconversation.username = '");
                sb.append(list.get(i2));
                sb.append("' OR ");
            } else {
                sb.append("rconversation.username = '");
                sb.append(list.get(i2));
                sb.append("')");
            }
        }
        sb.append(Util.nullAsNil(C45628s0.m50762a(false, i)));
        sb.append(m49225a(" and rconversation.username", list2));
        if (z) {
            sb.append(" and ( verifyFlag & 8 ) = 0");
        }
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
        if (str == null) {
            sb.append(" and ( parentRef is null or parentRef = '' or " + m49224S("message_fold", "conversationboxservice") + " ) ");
        }
        if (str2 != null && str2.length() > 0) {
            sb.append(mo69744O(str2));
        }
        sb.append("order by case rconversation.");
        sb.append("username");
        sb.append(" ");
        for (int i3 = 0; i3 < list.size(); i3++) {
            sb.append(" when '");
            sb.append(list.get(i3));
            sb.append("' then ");
            sb.append(i3);
        }
        sb.append(" end");
        Log.m105918d("MicroMsg.ConversationStorage", "getCursorByNamesInListOrder sql:" + sb);
        return this.f121077c.rawQuery(sb.toString().toString(), (String[]) null);
    }

    /* renamed from: K */
    public int mo69740K(String str) {
        String str2 = "SELECT COUNT(*) FROM " + "rconversation" + " WHERE " + "parentRef" + " = '" + str + "'";
        int i = 0;
        Log.m105925i("MicroMsg.ConversationStorage", "get enterprise conversation count, sql is %s", str2);
        Cursor rawQuery = this.f121077c.rawQuery(str2, (String[]) null, 2);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                i = rawQuery.getInt(0);
            }
            rawQuery.close();
        }
        return i;
    }

    /* renamed from: L */
    public C30783v3.C30785b mo69741L() {
        if (this.f121078d == null) {
            this.f121078d = ((C30783v3.C30786c) C86312j.m106911c(C30783v3.C30786c.class)).mo57710U9();
        }
        return this.f121078d;
    }

    /* renamed from: M */
    public C72976h2 mo69742M(String str) {
        C72976h2 h2Var = null;
        Cursor I = ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69738I(1, (List<String>) null, str, -1);
        if (I != null) {
            if (I.getCount() > 0 && I.moveToFirst()) {
                C72976h2 h2Var2 = new C72976h2();
                h2Var2.convertFrom(I);
                h2Var = h2Var2;
            }
            I.close();
        }
        return h2Var;
    }

    /* renamed from: N */
    public String mo69743N(String str) {
        String str2 = "SELECT " + "rconversation" + "." + "username" + " FROM " + "rconversation" + " WHERE " + "parentRef" + " = '" + str + "'" + " ORDER BY " + "conversationTime" + " DESC, " + "conversationTime" + " DESC " + " LIMIT 1 ";
        Log.m105925i("MicroMsg.ConversationStorage", "get last enterprise conversation user, sql is %s", str2);
        Cursor rawQuery = this.f121077c.rawQuery(str2, (String[]) null, 2);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                String string = rawQuery.getString(0);
                rawQuery.close();
                return string;
            }
            rawQuery.close();
        }
        return null;
    }

    /* renamed from: O */
    public final String mo69744O(String str) {
        return " and ( rconversation.username like '%" + str + "%' or " + "content" + " like '%" + str + "%' or " + "rcontact" + "." + "nickname" + " like '%" + str + "%' or " + "rcontact" + "." + "alias" + " like '%" + str + "%' or " + "rcontact" + "." + "pyInitial" + " like '%" + str + "%' or " + "rcontact" + "." + "quanPin" + " like '%" + str + "%' or " + "rcontact" + "." + "conRemark" + " like '%" + str + "%'  ) ";
    }

    /* renamed from: P */
    public Cursor mo69745P(int i, List<String> list, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("select unReadCount, status, isSend, conversationTime, username, content, msgType, flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, hasTodo, hbMarkRed, remitMarkRed, hasSpecialFollow");
        sb.append(" from rconversation where ");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
        if (str == null) {
            sb.append(mo69760d0());
        } else if ("*".equals(str)) {
            sb.append(" 1 = 1 ");
        } else {
            sb.append("parentRef = '");
            sb.append(Util.escapeSqlValue(str));
            sb.append("' ");
        }
        int i2 = 0;
        sb.append(Util.nullAsNil(C45628s0.m50762a(false, i)));
        if (list != null && list.size() > 0) {
            Iterator it = new ArrayList(list).iterator();
            while (it.hasNext()) {
                sb.append(" and rconversation.username != '");
                sb.append((String) it.next());
                sb.append("'");
            }
        }
        sb.append(" order by flag desc");
        Log.m105918d("MicroMsg.ConversationStorage", "getNecessaryCursor sql " + sb.toString());
        ISQLiteDatabase iSQLiteDatabase = this.f121077c;
        String sb4 = sb.toString();
        if (z) {
            i2 = 4;
        }
        return iSQLiteDatabase.rawQuery(sb4, (String[]) null, i2);
    }

    /* renamed from: Q */
    public Cursor mo69746Q(ArrayList<String> arrayList, int i, List<String> list, String str) {
        StringBuilder sb = new StringBuilder(1024);
        sb.append("select unReadCount, status, isSend, conversationTime, username, content, msgType,flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, editingQuoteMsgId, hasTodo, hbMarkRed, remitMarkRed, hasSpecialFollow, parentRef");
        sb.append(" from rconversation where username in (");
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            sb.append('\'');
            sb.append(arrayList.get(i2));
            sb.append('\'');
        }
        sb.append(") and ");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
        if (str == null) {
            sb.append(mo69760d0());
        } else if ("*".equals(str)) {
            sb.append(" 1 = 1 ");
        } else {
            sb.append("parentRef = '");
            sb.append(Util.escapeSqlValue(str));
            sb.append("' ");
        }
        sb.append(Util.nullAsNil(C45628s0.m50762a(false, i)));
        if (list != null && list.size() > 0) {
            Iterator it = new ArrayList(list).iterator();
            while (it.hasNext()) {
                sb.append(" and rconversation.username != '");
                sb.append((String) it.next());
                sb.append("'");
            }
        }
        Log.m105919d("MicroMsg.ConversationStorage", "getNecessaryCursorByNames sql %s", sb.toString());
        return this.f121077c.rawQuery(sb.toString(), (String[]) null);
    }

    /* renamed from: R */
    public Cursor mo69747R(int i, List<String> list, String str, boolean z, String str2) {
        String str3;
        String str4 = ("select unReadCount, status, isSend, conversationTime, rconversation.username, content, rconversation.msgType, rconversation.flag, rconversation.digest, rconversation.digestUser, rconversation.hasTrunc, rcontact.nickname from rconversation,rcontact" + " " + " where " + "rconversation" + "." + "username" + " = " + "rcontact" + "." + "username" + ((str2 == null || str2.length() <= 0) ? " " : " and rconversation.username = rcontact.username ") + Util.nullAsNil(C45628s0.m50762a(false, i))) + m49225a(" and rconversation.username", list);
        if (z) {
            str4 = str4 + " and ( verifyFlag & 8 ) = 0";
        }
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
        if (str == null) {
            str4 = str4 + " and ( parentRef is null or parentRef = '' or " + m49224S("message_fold") + " ) ";
        }
        if (str2 != null && str2.length() > 0) {
            str4 = str4 + mo69744O(str2);
        }
        if (str2 == null || str2.equals("")) {
            str3 = str4 + " order by flag desc, conversationTime desc";
        } else {
            str3 = str4 + " order by rconversation.username like \"%@chatroom\" asc";
        }
        Log.m105918d("MicroMsg.ConversationStorage", "getSearchCursor sql " + str3);
        return this.f121077c.rawQuery(str3, (String[]) null);
    }

    /* renamed from: T */
    public final String mo69748T(String str) {
        Log.m105926v("MicroMsg.ConversationStorage", "talker :" + str);
        return C72996z1.m85811N4(str) ? "rbottleconversation" : "rconversation";
    }

    /* renamed from: U */
    public int mo69749U(String str) {
        Cursor rawQuery = this.f121077c.rawQuery("select sum(unReadCount) from rconversation,rcontact where rconversation.username = rcontact.username" + Util.nullAsNil(str), (String[]) null, 2);
        int i = 0;
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }

    /* renamed from: V */
    public Cursor mo69750V() {
        return this.f121077c.rawQuery("SELECT rconversation.username, " + "rconversation.unReadCount" + " FROM rconversation" + " WHERE unReadCount > 0" + " AND " + mo69760d0(), (String[]) null);
    }

    /* renamed from: W */
    public long mo69751W(C72976h2 h2Var) {
        String nullAsNil = Util.nullAsNil(h2Var.getUsername());
        if (nullAsNil.length() <= 0) {
            Log.m105920e("MicroMsg.ConversationStorage", "insert conversation failed, username empty");
            return -1;
        }
        h2Var.mo101161T2(C45881a.m51166c(h2Var.mo108828u2(), h2Var.mo108821o2()));
        mo69756b(h2Var, true);
        long insert = this.f121077c.insert(mo69748T(nullAsNil), (String) null, h2Var.convertTo());
        if (insert != -1) {
            doNotify(2, this, h2Var.getUsername());
        } else {
            Log.m105921e("MicroMsg.ConversationStorage", "insert failed return -1, table:%s", mo69748T(nullAsNil));
        }
        return insert;
    }

    /* renamed from: X */
    public boolean mo69752X(String str) {
        return mo69771j(str) != null;
    }

    /* renamed from: Y */
    public boolean mo69753Y(String str) {
        if (mo69755a0(str)) {
            if (MultiProcessMMKV.getMMKV("message_fold_config2").decodeInt("fold_button_status_int_sync", 65536) != 65536) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Z */
    public boolean mo69754Z(C72976h2 h2Var) {
        if (h2Var != null) {
            return C45881a.m51165b(h2Var, 4, 0) != 0;
        }
        Log.m105920e("MicroMsg.ConversationStorage", "isPlacedTop failed, conversation null");
        return false;
    }

    /* renamed from: a0 */
    public boolean mo69755a0(String str) {
        if (str != null && str.length() > 0) {
            return mo69754Z(mo69771j(str));
        }
        Log.m105920e("MicroMsg.ConversationStorage", "isPlacedTop failed");
        return false;
    }

    /* renamed from: b */
    public final void mo69756b(C72976h2 h2Var, boolean z) {
        if (h2Var != null) {
            if (z && h2Var.mo108786G2() > 0) {
                Log.m105918d("MicroMsg.ConversationStorage", "jacks check attrFlag & cancel mark ");
                if ((h2Var.mo108819m2() & 1048576) != 0) {
                    h2Var.mo108812g3(h2Var.mo108786G2() - 1);
                    h2Var.mo108790K2(h2Var.mo108819m2() & -1048577);
                }
            }
            if ("message_fold".equals(h2Var.getUsername()) && !mo69754Z(h2Var)) {
                Log.m105921e("MicroMsg.ConversationStorage", "insert or update message_fold error!, stack: %s", android.util.Log.getStackTraceString(new Throwable()));
            }
        }
    }

    /* renamed from: b0 */
    public String mo69757b0(int i, String str) {
        Map<String, String> parseXml;
        if (Util.isNullOrNil(str) || i != 49 || (parseXml = XmlParser.parseXml(str, "msg", (String) null)) == null) {
            return null;
        }
        String str2 = parseXml.get(".msg.appmsg.title");
        Log.m105919d("MicroMsg.ConversationStorage", "[oneliang][parseConversationMsgContentTitle] title:%s", str2);
        return str2;
    }

    /* renamed from: c0 */
    public void mo69758c0() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("msgCount", 0);
        this.f121077c.update("rconversation", contentValues, (String) null, (String[]) null);
    }

    /* renamed from: d */
    public final void mo69759d(C72976h2 h2Var, boolean z) {
        if (h2Var != null) {
            if (C72996z1.m85828Z4(h2Var.getUsername())) {
                h2Var.mo108807c3((String) null);
            } else if (z) {
                if (h2Var.mo108782C2() == null || h2Var.mo108782C2().isEmpty() || h2Var.mo108782C2().equals("message_fold")) {
                    if (!mo69754Z(h2Var) && h2Var.mo108786G2() == 0 && h2Var.mo108788I2() == 0 && !h2Var.mo108372k3(1048576) && !h2Var.mo108372k3(536870912)) {
                        if (MultiProcessMMKV.getSingleMMKV("message_fold_config2").decodeInt("fold_button_status_int_sync", 65536) == 131072) {
                            h2Var.mo108807c3("message_fold");
                            return;
                        }
                    }
                    h2Var.mo108807c3((String) null);
                }
            } else if (h2Var.mo108782C2() != null && !h2Var.mo108782C2().isEmpty() && !h2Var.mo108782C2().equals("message_fold")) {
            } else {
                if (h2Var.mo108786G2() == 0 && h2Var.mo108788I2() == 0 && !h2Var.mo108372k3(1048576) && !h2Var.mo108372k3(536870912) && mo69754Z(h2Var)) {
                    h2Var.mo108807c3("message_fold");
                } else if ("message_fold".equals(h2Var.mo108782C2())) {
                    h2Var.mo108807c3((String) null);
                }
            }
        }
    }

    /* renamed from: d0 */
    public final String mo69760d0() {
        StringBuilder sb = new StringBuilder();
        int decodeInt = MultiProcessMMKV.getSingleMMKV("message_fold_config2").decodeInt("fold_button_status_int_sync", 65536);
        if (decodeInt == 262144 || decodeInt == 65536) {
            sb.append("((parentRef is null) or (parentRef in ('', '");
            sb.append(Util.escapeSqlValue("message_fold"));
            sb.append("')))");
        } else {
            sb.append("((parentRef is null) or (parentRef=''))");
        }
        return sb.toString();
    }

    /* renamed from: e */
    public void mo69761e(C72976h2 h2Var, int i, int i2) {
        if (StateEvent.Name.MESSAGE.equals(((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).hy0(h2Var.getUsername()))) {
            if (Util.nullAsNil(h2Var.getUsername()).length() <= 0) {
                Log.m105920e("MicroMsg.ConversationStorage", "countMsg conversation failed, username empty");
                return;
            }
            if (h2Var.mo108780A2() == 0) {
                h2Var.mo108805a3(C75604z3.m90850v(h2Var.getUsername()));
                Log.m105924i("MicroMsg.ConversationStorage", "getMsgCount from message table");
            } else if (i > 0) {
                h2Var.mo108805a3(h2Var.mo108780A2() - i);
                if (h2Var.mo108780A2() < 0) {
                    Log.m105920e("MicroMsg.ConversationStorage", "msg < 0 ,some path must be ignore!");
                    h2Var.mo108805a3(0);
                }
            } else if (i2 > 0) {
                h2Var.mo108805a3(h2Var.mo108780A2() + i2);
            }
            Log.m105925i("MicroMsg.ConversationStorage", "countMsg %d talker :%s deleteCount:%d insertCount:%d", Integer.valueOf(h2Var.mo108780A2()), h2Var.getUsername(), Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* renamed from: e0 */
    public void mo69762e0(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Update ");
        sb.append("rconversation");
        sb.append(" set ");
        sb.append("parentRef");
        sb.append(" = '");
        sb.append(Util.nullAsNil(str));
        sb.append("' where 1 != 1 ");
        for (String append : strArr) {
            sb.append(" or ");
            sb.append("username");
            sb.append(" = '");
            sb.append(append);
            sb.append("'");
        }
        String sb4 = sb.toString();
        Log.m105919d("MicroMsg.ConversationStorage", "update sql: %s", sb4);
        if (this.f121077c.execSQL("rconversation", sb4)) {
            for (String doNotify : strArr) {
                doNotify(3, this, doNotify);
            }
        }
    }

    /* renamed from: f */
    public void mo69763f(String str) {
        Log.m105929w("MicroMsg.ConversationStorage", "delChatContact username:%s  stack:%s", str, MMStack.getStack(true));
        if (this.f121077c.delete(mo69748T(str), "username=?", new String[]{str}) != 0) {
            doNotify(5, this, str);
        }
    }

    /* renamed from: f0 */
    public boolean mo69764f0(C72976h2 h2Var) {
        if (h2Var == null) {
            Log.m105920e("MicroMsg.ConversationStorage", "setMoveUp conv == null");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Cursor rawQuery = this.f121077c.rawQuery("select max(conversationTime) as conversationTime from rconversation", (String[]) null, 2);
        long j = 0;
        while (rawQuery.moveToNext()) {
            j = rawQuery.getLong(0);
        }
        rawQuery.close();
        Log.m105919d("MicroMsg.ConversationStorage", "latestConversationTime = %s, cost = %d", Long.valueOf(j), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        long a = C31543z5.m39451a();
        if (j > a) {
            Log.m105929w("MicroMsg.ConversationStorage", "conversationTime=%s serverTime=%s diff=%s", Long.valueOf(j), Long.valueOf(a), Long.valueOf(a - j));
            j = a;
        }
        long b = C45881a.m51165b(h2Var, 1, j + 1);
        ISQLiteDatabase iSQLiteDatabase = this.f121077c;
        boolean execSQL = iSQLiteDatabase.execSQL("rconversation", "update " + mo69748T(h2Var.getUsername()) + " set " + "flag" + " = " + b + " where " + "username" + " = \"" + Util.escapeSqlValue(h2Var.getUsername()) + FastJsonResponse.QUOTE);
        Log.m105925i("MicroMsg.ConversationStorage", "[setMoveUp] flag=%s result=%s", Long.valueOf(b), Boolean.valueOf(execSQL));
        if (execSQL) {
            doNotify(3, this, h2Var.getUsername());
        }
        return execSQL;
    }

    /* renamed from: g */
    public boolean mo69765g() {
        boolean z = this.f121077c.execSQL("rconversation", "delete from rconversation") || this.f121077c.execSQL("rconversation", "delete from rbottleconversation");
        if (z) {
            doNotify(5, this, "");
        }
        return z;
    }

    /* renamed from: g0 */
    public boolean mo69766g0(String str) {
        if (str == null || str.length() <= 0) {
            Log.m105920e("MicroMsg.ConversationStorage", "setPlacedTop conversation failed");
            return false;
        }
        if (mo69771j(str) == null) {
            C72976h2 h2Var = new C72976h2(str);
            h2Var.mo108793N2(System.currentTimeMillis());
            mo69751W(h2Var);
            Log.m105924i("MicroMsg.ConversationStorage", "setPlacedTop username = " + str);
        }
        C72976h2 j = mo69771j(str);
        mo69759d(j, true);
        if (j == null) {
            return false;
        }
        long b = C45881a.m51165b(j, 2, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("update " + mo69748T(j.getUsername()) + " set " + "flag" + " = " + b);
        if ("message_fold".equals(j.mo108782C2())) {
            sb.append(" , ");
            sb.append("parentRef");
            sb.append(" = '");
            sb.append(Util.escapeSqlValue(j.mo108782C2()));
            sb.append("' ");
        }
        sb.append(" where username = \"");
        sb.append(Util.escapeSqlValue(j.getUsername()));
        sb.append(FastJsonResponse.QUOTE);
        boolean execSQL = this.f121077c.execSQL("rconversation", sb.toString());
        Log.m105925i("MicroMsg.ConversationStorage", "[setPlacedTop] flag=%s result=%s", Long.valueOf(b), Boolean.valueOf(execSQL));
        if (execSQL) {
            doNotify(3, this, j.getUsername());
        }
        return execSQL;
    }

    /* renamed from: h */
    public void mo69767h(LinkedList<String> linkedList) {
        Log.m105929w("MicroMsg.ConversationStorage", "deleteConversations   stack:%s", MMStack.getStack(true));
        if (linkedList == null || linkedList.isEmpty()) {
            Log.m105928w("MicroMsg.ConversationStorage", "deleteConversation:namelist is null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("delete from ");
        sb.append("rconversation");
        sb.append(" where ");
        sb.append("username");
        sb.append("='");
        sb.append(linkedList.poll());
        sb.append('\'');
        while (!linkedList.isEmpty()) {
            sb.append(" or ");
            sb.append("username");
            sb.append("='");
            sb.append(linkedList.poll());
            sb.append('\'');
        }
        Log.m105925i("MicroMsg.ConversationStorage", "deleteConversations:sql is %s", sb.toString());
        this.f121077c.execSQL("rconversation", sb.toString());
    }

    /* renamed from: h0 */
    public boolean mo69768h0(String str) {
        if (str == null || str.length() <= 0) {
            Log.m105920e("MicroMsg.ConversationStorage", "update conversation failed");
            return false;
        }
        C72976h2 j = mo69771j(str);
        if (j == null || (j.mo108786G2() > 0 && str.equals(j.getUsername()))) {
            return true;
        }
        j.mo108790K2(j.mo108819m2() | 1048576);
        mo69759d(j, false);
        ContentValues contentValues = new ContentValues();
        contentValues.put("unReadCount", 1);
        contentValues.put("atCount", 0);
        contentValues.put("attrflag", Integer.valueOf(j.mo108819m2()));
        contentValues.put("parentRef", j.mo108782C2());
        int update = this.f121077c.update(mo69748T(str), contentValues, "username= ?", new String[]{Util.escapeSqlValue(str)});
        if (update > 0) {
            doNotify(3, this, str);
        }
        return update > 0;
    }

    /* renamed from: i */
    public boolean mo69769i(String str) {
        Log.m105929w("MicroMsg.ConversationStorage", "deleteMessageEndByName nameTag:%s  stack:%s", str, MMStack.getStack(true));
        ISQLiteDatabase iSQLiteDatabase = this.f121077c;
        boolean execSQL = iSQLiteDatabase.execSQL("rconversation", "delete from " + mo69748T(str) + " where username like '%" + str + "'");
        if (execSQL) {
            doNotify(5, this, str);
        }
        return execSQL;
    }

    /* renamed from: i0 */
    public boolean mo69770i0(C72976h2 h2Var) {
        if (h2Var == null) {
            Log.m105920e("MicroMsg.ConversationStorage", "unSetPlacedTop conversation null");
            return false;
        }
        long b = C45881a.m51165b(h2Var, 3, h2Var.mo108821o2());
        StringBuilder sb = new StringBuilder();
        sb.append("update " + mo69748T(h2Var.getUsername()) + " set " + "flag" + " = " + b);
        if ("message_fold".equals(h2Var.mo108782C2())) {
            sb.append(" , ");
            sb.append("parentRef");
            sb.append(" = '' ");
        }
        sb.append(" where username = \"");
        sb.append(Util.escapeSqlValue(h2Var.getUsername()));
        sb.append(FastJsonResponse.QUOTE);
        boolean execSQL = this.f121077c.execSQL("rconversation", sb.toString());
        Log.m105925i("MicroMsg.ConversationStorage", "[setPlacedTop] flag=%s result=%s", Long.valueOf(b), Boolean.valueOf(execSQL));
        if (execSQL) {
            doNotify(3, this, h2Var.getUsername());
        }
        return execSQL;
    }

    /* renamed from: j */
    public C72976h2 mo69771j(String str) {
        Cursor query = this.f121077c.query(mo69748T(str), (String[]) null, "username=?", new String[]{str}, (String) null, (String) null, (String) null, 2);
        if (!query.moveToFirst()) {
            Log.m105928w("MicroMsg.ConversationStorage", "get null with username:" + str);
            query.close();
            return null;
        }
        C72976h2 h2Var = new C72976h2();
        h2Var.convertFrom(query);
        query.close();
        return h2Var;
    }

    /* renamed from: j0 */
    public boolean mo69772j0(String str) {
        if (str != null && str.length() > 0) {
            return mo69770i0(mo69771j(str));
        }
        Log.m105920e("MicroMsg.ConversationStorage", "unSetPlacedTop conversation failed");
        return false;
    }

    /* renamed from: k0 */
    public int mo69773k0(C72976h2 h2Var, String str) {
        return mo69775m0(h2Var, str, true, true);
    }

    /* renamed from: l0 */
    public int mo69774l0(C72976h2 h2Var, String str, boolean z) {
        return mo69775m0(h2Var, str, z, true);
    }

    /* renamed from: m0 */
    public int mo69775m0(C72976h2 h2Var, String str, boolean z, boolean z2) {
        long j;
        if (str == null || str.length() <= 0) {
            Log.m105920e("MicroMsg.ConversationStorage", "update conversation failed");
            return 0;
        }
        if (z) {
            if (h2Var != null) {
                j = C45881a.m51166c(h2Var.mo108828u2(), h2Var.mo108821o2());
            } else {
                j = Util.nowMilliSecond() & 72057594037927935L;
            }
            h2Var.mo101161T2(j);
        }
        mo69756b(h2Var, z2);
        mo69759d(h2Var, false);
        int update = this.f121077c.update(mo69748T(str), h2Var.convertTo(), "username=?", new String[]{str});
        if (update != 0) {
            doNotify(3, this, str);
        } else {
            Log.m105921e("MicroMsg.ConversationStorage", "update failed return 0,  table:%s", mo69748T(str));
        }
        return update;
    }

    /* renamed from: n0 */
    public boolean mo69776n0(String str, int i, boolean z, int i2) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        if (mo69771j(str) == null) {
            return true;
        }
        int i3 = z ? i2 | i : (~i) & i2;
        if (i3 == i2) {
            return false;
        }
        if (i2 >= 0 && i2 < 536870912 && ((i3 >= 536870912 || i3 < 0) && str.contains("@"))) {
            Log.m105925i("Conversition", "wrong add attr flag: %s, %s, %s, %s, %s", str, Integer.valueOf(i2), Integer.valueOf(i), Boolean.valueOf(z), Util.getStack());
            C117407d.INSTANCE.mo160131h(20435, 3, Integer.valueOf(i2), Integer.valueOf(i), str);
        }
        ISQLiteDatabase iSQLiteDatabase = this.f121077c;
        boolean execSQL = iSQLiteDatabase.execSQL("rconversation", "update " + mo69748T(str) + " set " + "attrflag" + " = " + i3 + " where " + "username" + " = \"" + Util.escapeSqlValue(str) + FastJsonResponse.QUOTE);
        if (execSQL) {
            doNotify(3, this, str);
        }
        return execSQL;
    }

    public boolean needNotifyExtension() {
        return true;
    }

    /* renamed from: o0 */
    public void mo69777o0(C72963f4 f4Var) {
        boolean z;
        String t = f4Var.mo108768t();
        C72976h2 j = mo69771j(t);
        if (j == null || j.mo108821o2() <= f4Var.getCreateTime() || j.mo108821o2() == MAlarmHandler.NEXT_FIRE_INTERVAL) {
            if (j == null) {
                j = new C72976h2(t);
                z = true;
            } else {
                z = false;
            }
            j.mo108803Y2(f4Var.mo108769t2());
            j.mo108812g3(j.mo108786G2());
            j.mo101164o3(f4Var);
            j.mo108806b3(Integer.toString(f4Var.getType()));
            j.mo101161T2((j.mo108828u2() & 4611686018427387904L) | (f4Var.getCreateTime() & 72057594037927935L));
            if (z) {
                mo69751W(j);
            } else {
                mo69773k0(j, t);
            }
        } else {
            Log.m105924i("MicroMsg.ConversationStorage", "updateConvFromLastMsg ignore(maybe the system time is bigger than normal)");
        }
    }

    /* renamed from: p0 */
    public boolean mo69778p0(String str) {
        C72976h2 j;
        if (str == null || str.length() <= 0) {
            Log.m105920e("MicroMsg.ConversationStorage", "update conversation failed");
            return false;
        }
        Log.m105925i("MicroMsg.ConversationStorage", "updateUnreadByTalker %s", str);
        C72976h2 j2 = mo69771j(str);
        if (j2 != null) {
            mo69759d(j2, false);
            if (j2.mo108786G2() == 0 && j2.mo108788I2() == 0 && str.equals(j2.getUsername())) {
                mo69776n0(str, 1048576, false, j2.mo108819m2());
                ContentValues contentValues = new ContentValues();
                contentValues.put("UnReadInvite", 0);
                contentValues.put("atCount", 0);
                contentValues.put("parentRef", j2.mo108782C2());
                if (this.f121077c.update(mo69748T(str), contentValues, "username= ?", new String[]{Util.escapeSqlValue(str)}) > 0) {
                    doNotify(3, this, str);
                }
            } else {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("unReadCount", 0);
                contentValues2.put("unReadMuteCount", 0);
                contentValues2.put("UnReadInvite", 0);
                contentValues2.put("atCount", 0);
                contentValues2.put("attrflag", Integer.valueOf(j2.mo108819m2() & -1048577));
                contentValues2.put("parentRef", j2.mo108782C2());
                int update = this.f121077c.update(mo69748T(str), contentValues2, "username= ?", new String[]{Util.escapeSqlValue(str)});
                if (update > 0) {
                    doNotify(3, this, str);
                }
                if (C72996z1.m85846q5(str) && C72996z1.m85845p5(j2.mo108782C2()) && (j = mo69771j(j2.mo108782C2())) != null) {
                    String username = j.getUsername();
                    ContentValues contentValues3 = new ContentValues();
                    int G2 = j.mo108786G2() - j2.mo108786G2();
                    contentValues3.put("unReadCount", Integer.valueOf(G2 > 0 ? G2 : 0));
                    int I2 = j.mo108788I2() - j2.mo108788I2();
                    contentValues3.put("unReadMuteCount", Integer.valueOf(I2 > 0 ? I2 : 0));
                    if (G2 <= 0 && I2 <= 0) {
                        contentValues3.put("attrflag", Integer.valueOf(j2.mo108819m2() & -1048577));
                    }
                    int update2 = this.f121077c.update(mo69748T(username), contentValues3, "username= ?", new String[]{Util.escapeSqlValue(username)});
                    if (update2 > 0) {
                        doNotify(3, this, username);
                    }
                    update = update2;
                }
                return update > 0;
            }
        }
    }

    public void processEventForExtensionOnDemand(MStorageEx.Event event) {
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C30783v3.C30787d.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            ((C30783v3.C30787d) ((C38174i) bVar.next()).get()).onNotifyChange(event.event, event.mstorage, event.obj);
        }
    }

    public boolean shouldProcessEvent() {
        ISQLiteDatabase iSQLiteDatabase = this.f121077c;
        if (iSQLiteDatabase != null && !iSQLiteDatabase.isClose()) {
            return true;
        }
        Object[] objArr = new Object[1];
        ISQLiteDatabase iSQLiteDatabase2 = this.f121077c;
        objArr[0] = iSQLiteDatabase2 == null ? "null" : Boolean.valueOf(iSQLiteDatabase2.isClose());
        Log.m105929w("MicroMsg.ConversationStorage", "shouldProcessEvent db is close :%s", objArr);
        return false;
    }
}
