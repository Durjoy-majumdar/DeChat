package com.tencent.p014mm.storage;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import eb0.C45613m2;
import eb0.C75592q0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;
import p749xh.C53335e1;

/* renamed from: com.tencent.mm.storage.n1 */
public class C44662n1 extends MAutoStorage<C44661m1> implements C45613m2 {

    /* renamed from: e */
    public static final String[] f121087e = {MAutoStorage.getCreateSQLs(C44661m1.f121082x1, "chatroom")};

    /* renamed from: f */
    public static final String[] f121088f = {"CREATE INDEX IF NOT EXISTS serverChatRoomUserIndex ON chatroom ( chatroomname )"};

    /* renamed from: d */
    public ISQLiteDatabase f121089d;

    public C44662n1(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C44661m1.f121082x1, "chatroom", f121088f);
        this.f121089d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public C44661m1 mo69799Lo(String str) {
        C44661m1 m1Var = new C44661m1();
        m1Var.field_chatroomname = str;
        if (super.get(m1Var, "chatroomname")) {
            return m1Var;
        }
        return null;
    }

    /* renamed from: Ow */
    public int mo69800Ow(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C44661m1 m1Var = null;
            Cursor rawQuery = this.f121089d.rawQuery("select memberCount from chatroom where chatroomname='" + Util.escapeSqlValue(str) + "'", (String[]) null, 2);
            if (rawQuery.moveToFirst()) {
                m1Var = new C44661m1();
                m1Var.convertFrom(rawQuery);
            }
            rawQuery.close();
            if (m1Var == null) {
                return 0;
            }
            if (m1Var.field_memberCount < 0) {
                int length = mo69803Yt(str).split(";").length;
                m1Var.field_memberCount = length;
                mo69805bF(str, length);
                Log.m105925i("MicroMsg.ChatroomStorage", "[getMemberCount] init field_memberCount! username:%s count:%s", str, Integer.valueOf(length));
            }
            int i = m1Var.field_memberCount;
            Log.m105925i("MicroMsg.ChatroomStorage", "[getMemberCount] cost:%sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return i;
        } finally {
            Log.m105925i("MicroMsg.ChatroomStorage", "[getMemberCount] cost:%sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: SE */
    public C44661m1 mo69801SE(String str) {
        C44661m1 m1Var = new C44661m1();
        m1Var.field_chatroomname = str;
        super.get(m1Var, "chatroomname");
        return m1Var;
    }

    /* renamed from: TE */
    public boolean replace(C44661m1 m1Var, boolean z) {
        if (m1Var == null) {
            Log.m105928w("MicroMsg.ChatroomStorage", "replace error(item == null)");
            return false;
        } else if (Util.isNullOrNil(m1Var.field_chatroomname)) {
            Log.m105928w("MicroMsg.ChatroomStorage", "replace error,item.field_chatroomname is null");
            return false;
        } else {
            String str = "select rowid,chatroomname from chatroom where chatroomname='" + Util.escapeSqlValue(m1Var.field_chatroomname) + "'";
            Log.m105918d("MicroMsg.ChatroomStorage", "replace : " + str);
            C44661m1 m1Var2 = null;
            Cursor rawQuery = this.f121089d.rawQuery(str, (String[]) null, 2);
            if (rawQuery.moveToFirst()) {
                m1Var2 = new C44661m1();
                m1Var2.convertFrom(rawQuery);
            }
            rawQuery.close();
            if (m1Var2 == null) {
                return insertNotify(m1Var, z);
            }
            long j = m1Var2.systemRowid;
            m1Var.systemRowid = j;
            return update(j, m1Var, z);
        }
    }

    /* renamed from: Yt */
    public String mo69803Yt(String str) {
        C44661m1 m1Var;
        Assert.assertTrue(str.length() > 0);
        Cursor rawQuery = this.f121089d.rawQuery("select memberlist from chatroom where chatroomname='" + Util.escapeSqlValue(str) + "'", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            m1Var = new C44661m1();
            m1Var.convertFrom(rawQuery);
        } else {
            m1Var = null;
        }
        rawQuery.close();
        if (m1Var == null) {
            return null;
        }
        return m1Var.field_memberlist;
    }

    /* renamed from: bD */
    public List<String> mo69804bD(String str) {
        String Yt = mo69803Yt(str);
        if (Yt == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        if (!Yt.equals("")) {
            String[] split = Yt.split(";");
            for (String add : split) {
                linkedList.add(add);
            }
        }
        return linkedList;
    }

    /* renamed from: bF */
    public final boolean mo69805bF(String str, int i) {
        return this.f121089d.execSQL("chatroom", "update chatroom set memberCount = " + i + " where " + "chatroomname" + " = '" + Util.escapeSqlValue(str) + "'");
    }

    public String getDisplayName(String str) {
        C44661m1 m1Var;
        Assert.assertTrue(str.length() > 0);
        Cursor rawQuery = this.f121089d.rawQuery("select displayname from chatroom where chatroomname='" + Util.escapeSqlValue(str) + "'", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            m1Var = new C44661m1();
            m1Var.convertFrom(rawQuery);
        } else {
            m1Var = null;
        }
        rawQuery.close();
        if (m1Var == null) {
            return null;
        }
        return m1Var.field_displayname;
    }

    /* renamed from: jo */
    public boolean mo69807jo(String str) {
        Assert.assertTrue(str.length() > 0);
        if (this.f121089d.delete("chatroom", "chatroomname=?", new String[]{str}) == 0) {
            return false;
        }
        doNotify(str, 5, str);
        return true;
    }

    /* renamed from: kD */
    public List<String> mo69808kD(int i) {
        SingleTable singleTable = C53335e1.f149283M;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        linkedList.add(C53335e1.f149285P);
        List<C53335e1> multiQuery = C53335e1.f149283M.select((List<? extends ISqlColumn>) linkedList).where(C53335e1.f149288R.equal(C75592q0.m90789s()).and(C53335e1.f149292T.smallerThan((Number) Integer.valueOf(i)))).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3).build().multiQuery(this.f121089d, C53335e1.class);
        ArrayList arrayList = new ArrayList();
        for (C53335e1 e1Var : multiQuery) {
            arrayList.add(e1Var.field_chatroomname);
        }
        return arrayList;
    }

    /* renamed from: qq */
    public String mo69809qq(String str) {
        C44661m1 m1Var;
        Assert.assertTrue(str.length() > 0);
        Cursor rawQuery = this.f121089d.rawQuery("select roomowner from chatroom where chatroomname='" + Util.escapeSqlValue(str) + "'", (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.ChatroomStorage", "getChatroomOwner fail, cursor is null");
            return null;
        }
        if (rawQuery.moveToFirst()) {
            m1Var = new C44661m1();
            m1Var.convertFrom(rawQuery);
        } else {
            m1Var = null;
        }
        rawQuery.close();
        if (m1Var == null) {
            return null;
        }
        return m1Var.field_roomowner;
    }

    public boolean replace(IAutoDBItem iAutoDBItem) {
        C44661m1 m1Var = (C44661m1) iAutoDBItem;
        if (replace(m1Var, true)) {
            doNotify(m1Var.field_chatroomname, 4, m1Var);
            return true;
        }
        Log.m105928w("MicroMsg.ChatroomStorage", "replace error");
        return false;
    }
}
