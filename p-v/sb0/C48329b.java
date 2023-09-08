package sb0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import di3.C86312j;
import eb0.C45628s0;
import eb0.z3$$g;
import f40.C86709a0;
import f62.C75700k0;
import rb0.C47966e0;
import rb0.C47984k;
import rb0.C48009v0;
import zt3.C119157j;

/* renamed from: sb0.b */
public class C48329b extends MAutoStorage<C48327a> implements MStorageEx.IOnStorageChange {

    /* renamed from: f */
    public static final String[] f129404f = {MAutoStorage.getCreateSQLs(C48327a.f129397W, "BizChatConversation")};

    /* renamed from: d */
    public ISQLiteDatabase f129405d;

    /* renamed from: e */
    public final MStorageEvent<C48332c, C48332c.C48333a> f129406e = new C48331b();

    /* renamed from: sb0.b$a */
    public class C48330a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ISQLiteDatabase f129407d;

        public C48330a(ISQLiteDatabase iSQLiteDatabase) {
            this.f129407d = iSQLiteDatabase;
        }

        public void run() {
            this.f129407d.execSQL("BizChatConversation", "CREATE INDEX IF NOT EXISTS BizChatConv_bizChatIdIndex ON BizChatConversation ( bizChatId )");
            this.f129407d.execSQL("BizChatConversation", "CREATE INDEX IF NOT EXISTS BizChatConv_brandUserNameIndex ON BizChatConversation ( brandUserName )");
            this.f129407d.execSQL("BizChatConversation", "CREATE INDEX IF NOT EXISTS unreadCountIndex ON BizChatConversation ( unReadCount )");
        }
    }

    /* renamed from: sb0.b$b */
    public class C48331b extends MStorageEvent<C48332c, C48332c.C48333a> {
        public C48331b() {
        }

        public void processEvent(Object obj, Object obj2) {
            ((C48332c) obj).mo69969a((C48332c.C48333a) obj2);
        }
    }

    /* renamed from: sb0.b$c */
    public interface C48332c {

        /* renamed from: sb0.b$c$a */
        public static class C48333a {

            /* renamed from: a */
            public long f129410a;

            /* renamed from: b */
            public C48327a f129411b;
        }

        /* renamed from: a */
        void mo69969a(C48333a aVar);
    }

    public C48329b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C48327a.f129397W, "BizChatConversation", (String[]) null);
        boolean z;
        this.f129405d = iSQLiteDatabase;
        ((C119157j) C119157j.f356862d).mo183878i(new C48330a(iSQLiteDatabase), 30000);
        Cursor rawQuery = iSQLiteDatabase.rawQuery("PRAGMA table_info( BizChatConversation)", (String[]) null, 2);
        while (true) {
            if (!rawQuery.moveToNext()) {
                z = false;
                break;
            }
            int columnIndex = rawQuery.getColumnIndex("name");
            if (columnIndex >= 0 && "flag".equalsIgnoreCase(rawQuery.getString(columnIndex))) {
                z = true;
                break;
            }
        }
        rawQuery.close();
        if (!z) {
            iSQLiteDatabase.execSQL("BizChatConversation", "update BizChatConversation set flag = lastMsgTime");
        }
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this);
    }

    /* renamed from: SE */
    public static long m53632SE(C48327a aVar, long j) {
        return (j & 72057594037927935L) | (aVar.field_flag & -72057594037927936L);
    }

    /* renamed from: kD */
    public static long m53633kD(C48327a aVar, int i, long j) {
        if (aVar == null) {
            return 0;
        }
        if (j == 0) {
            j = Util.nowMilliSecond();
        }
        return i != 2 ? i != 3 ? i != 4 ? m53632SE(aVar, j) : m53632SE(aVar, j) & 4611686018427387904L : m53632SE(aVar, j) & -4611686018427387905L : m53632SE(aVar, j) | 4611686018427387904L;
    }

    /* renamed from: DN */
    public boolean mo73019DN(long j) {
        C48327a Yt = mo73024Yt(j);
        if (Yt.field_unReadCount == 0 && Yt.field_bizChatId == j) {
            return true;
        }
        Yt.field_unReadCount = 0;
        Yt.field_atCount = 0;
        Yt.field_atAll = 0;
        mo73020LL(Yt);
        return true;
    }

    /* renamed from: LL */
    public boolean mo73020LL(C48327a aVar) {
        if (aVar == null) {
            Log.m105928w("MicroMsg.BizConversationStorage", "update wrong argument");
            return false;
        }
        boolean replace = super.replace(aVar);
        Log.m105925i("MicroMsg.BizConversationStorage", "BizChatConversationStorage update res:%s", Boolean.valueOf(replace));
        if (replace) {
            C48340e.m53678s(C48009v0.Ax0().mo73042a0(aVar.field_bizChatId));
            C48332c.C48333a aVar2 = new C48332c.C48333a();
            aVar2.f129410a = aVar.field_bizChatId;
            aVar2.f129411b = aVar;
            this.f129406e.event(aVar2);
            this.f129406e.doNotify();
        }
        return replace;
    }

    /* renamed from: Lo */
    public boolean mo73021Lo(String str) {
        String str2 = "delete from " + "BizChatConversation" + " where " + "brandUserName" + " = '" + str + "' ";
        boolean execSQL = this.f129405d.execSQL("BizChatConversation", str2);
        Log.m105925i("MicroMsg.BizConversationStorage", "deleteByBrandUserName sql %s,%s", str2, Boolean.valueOf(execSQL));
        if (execSQL) {
            C48327a aVar = new C48327a();
            C48332c.C48333a aVar2 = new C48332c.C48333a();
            aVar2.f129410a = -1;
            aVar2.f129411b = aVar;
            this.f129406e.event(aVar2);
            this.f129406e.doNotify();
        }
        return execSQL;
    }

    /* renamed from: Ow */
    public Cursor mo73022Ow(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from ");
        sb.append("BizChatConversation");
        sb.append(" where ");
        sb.append("brandUserName");
        sb.append(" = '");
        sb.append(str);
        sb.append("'");
        sb.append(" order by ");
        sb.append("flag");
        sb.append(" desc");
        sb.append(" , ");
        sb.append("lastMsgTime");
        sb.append(" desc");
        Log.m105919d("MicroMsg.BizConversationStorage", "getBizChatConversationCursor: sql:%s", sb.toString());
        return this.f129405d.rawQuery(sb.toString(), (String[]) null);
    }

    /* renamed from: TE */
    public boolean insert(C48327a aVar) {
        Log.m105918d("MicroMsg.BizConversationStorage", "BizChatConversationStorage insert");
        if (aVar == null) {
            Log.m105928w("MicroMsg.BizConversationStorage", "insert wrong argument");
            return false;
        }
        boolean insert = super.insert(aVar);
        Log.m105925i("MicroMsg.BizConversationStorage", "BizChatConversationStorage insert res:%s", Boolean.valueOf(insert));
        if (insert) {
            C48332c.C48333a aVar2 = new C48332c.C48333a();
            aVar2.f129410a = aVar.field_bizChatId;
            aVar2.f129411b = aVar;
            this.f129406e.event(aVar2);
            this.f129406e.doNotify();
        }
        return insert;
    }

    /* renamed from: Yt */
    public C48327a mo73024Yt(long j) {
        C48327a aVar = new C48327a();
        aVar.field_bizChatId = j;
        super.get(aVar, new String[0]);
        return aVar;
    }

    /* renamed from: bD */
    public int mo73025bD(String str) {
        Cursor rawQuery = this.f129405d.rawQuery("select count(*) from " + "BizChatConversation" + " where " + "brandUserName" + " = '" + str + "' ", (String[]) null, 2);
        int i = 0;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                i = rawQuery.getInt(0);
            }
            rawQuery.close();
        }
        return i;
    }

    /* renamed from: bF */
    public boolean mo73026bF(C48327a aVar) {
        if (aVar != null) {
            return m53633kD(aVar, 4, 0) != 0;
        }
        Log.m105920e("MicroMsg.BizConversationStorage", "isPlacedTop failed, conversation null");
        return false;
    }

    public void finalize() {
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
    }

    /* renamed from: jo */
    public void mo73028jo(C48327a aVar, int i, int i2) {
        int i3 = aVar.field_msgCount;
        if (i3 == 0) {
            aVar.field_msgCount = ((C47966e0) C86312j.m106911c(C47966e0.class)).mo72739Mm().mo100929m(aVar.field_brandUserName, aVar.field_bizChatId);
            Log.m105924i("MicroMsg.BizConversationStorage", "getMsgCount from message table");
        } else if (i > 0) {
            int i4 = i3 - i;
            aVar.field_msgCount = i4;
            if (i4 < 0) {
                Log.m105920e("MicroMsg.BizConversationStorage", "msg < 0 ,some path must be ignore!");
                aVar.field_msgCount = 0;
            }
        } else if (i2 > 0) {
            aVar.field_msgCount = i3 + i2;
        }
        Log.m105925i("MicroMsg.BizConversationStorage", "countMsg %d talker :%s deleteCount:%d insertCount:%d", Integer.valueOf(aVar.field_msgCount), Long.valueOf(aVar.field_bizChatId), Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: mI */
    public boolean mo73029mI(long j) {
        mo73024Yt(j);
        C48327a Yt = mo73024Yt(j);
        ISQLiteDatabase iSQLiteDatabase = this.f129405d;
        boolean execSQL = iSQLiteDatabase.execSQL("BizChatConversation", "update BizChatConversation set flag = " + m53633kD(Yt, 2, Yt.field_lastMsgTime) + " where " + "bizChatId" + " = " + Yt.field_bizChatId);
        if (execSQL) {
            C48327a Yt2 = mo73024Yt(Yt.field_bizChatId);
            C48332c.C48333a aVar = new C48332c.C48333a();
            aVar.f129410a = Yt2.field_bizChatId;
            aVar.f129411b = Yt2;
            this.f129406e.event(aVar);
            this.f129406e.doNotify();
        }
        return execSQL;
    }

    /* renamed from: mL */
    public boolean mo73030mL(long j) {
        C48327a Yt = mo73024Yt(j);
        ISQLiteDatabase iSQLiteDatabase = this.f129405d;
        boolean execSQL = iSQLiteDatabase.execSQL("BizChatConversation", "update BizChatConversation set flag = " + m53633kD(Yt, 3, Yt.field_lastMsgTime) + " where " + "bizChatId" + " = " + Yt.field_bizChatId);
        if (execSQL) {
            C48327a Yt2 = mo73024Yt(Yt.field_bizChatId);
            C48332c.C48333a aVar = new C48332c.C48333a();
            aVar.f129410a = Yt2.field_bizChatId;
            aVar.f129411b = Yt2;
            this.f129406e.event(aVar);
            this.f129406e.doNotify();
        }
        return execSQL;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        Log.m105924i("MicroMsg.BizConversationStorage", "onNotifyChange");
        if (obj != null && (obj instanceof String)) {
            String str = (String) obj;
            if (C47984k.m53334h(str) && !C45628s0.m50740E(str)) {
                C48340e.m53661b(str, true, (z3$$g) null);
            }
        }
    }

    /* renamed from: qq */
    public boolean mo73031qq(long j) {
        C48327a Yt = mo73024Yt(j);
        boolean delete = super.delete(Yt, "bizChatId");
        if (delete) {
            C48332c.C48333a aVar = new C48332c.C48333a();
            aVar.f129410a = Yt.field_bizChatId;
            aVar.f129411b = Yt;
            this.f129406e.event(aVar);
            this.f129406e.doNotify();
        }
        return delete;
    }
}
