package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.z3$$h;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import junit.framework.Assert;
import rb0.C47984k;
import rb0.C48009v0;
import sb0.C48334c;
import sb0.C48340e;
import sb0.C48353j;
import sb0.C48354k;

/* renamed from: com.tencent.mm.storage.a0 */
public class C72954a0 extends C72959e {

    /* renamed from: c */
    public static final String[] f212641c = {"CREATE TABLE IF NOT EXISTS bizchatmessage ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT, transBrandWording TEXT, bizChatId INTEGER DEFAULT -1, bizChatUserId TEXT ) ", "CREATE INDEX IF NOT EXISTS  bizmessageChatIdIndex ON bizchatmessage ( bizChatId )", "CREATE INDEX IF NOT EXISTS  bizmessageSvrIdIndex ON bizchatmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  bizmessageTalkerIndex ON bizchatmessage ( talker )", "CREATE INDEX IF NOT EXISTS  bizmessageTalerStatusIndex ON bizchatmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  bizmessageCreateTimeIndex ON bizchatmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  bizmessageCreateTaklerTimeIndex ON bizchatmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  bizmessageBizChatIdTypeCreateTimeIndex ON bizchatmessage ( bizChatId,type,createTime )", "CREATE INDEX IF NOT EXISTS  bizmessageSendCreateTimeIndex ON bizchatmessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  bizchatmessageTalkerTypeIndex ON bizchatmessage ( talker,type )"};

    public C72954a0(C75875l lVar) {
        super(lVar);
        mo100942g(mo100940c(), "bizchatmessage");
        mo100939a(new C75875l.C75878d(16, "bizchatmessage", C75875l.C75878d.m91132a(2500001, 3000000, 99000001, 102000000)));
    }

    /* renamed from: b */
    public boolean mo100922b(C72963f4 f4Var, z3$$h z3__h) {
        if (f4Var == null) {
            Log.m105928w("MicroMsg.BizChatMessageStorage", "dealMsgSourceValue:message == null");
            return false;
        }
        f4Var.mo108728H2(-1);
        if (z3__h != null) {
            if (C47984k.m53334h(f4Var.mo108768t())) {
                if (Util.isNullOrNil(z3__h.f222107n)) {
                    Log.m105929w("MicroMsg.BizChatMessageStorage", "EnterpriseChat msgSourceValue error: %s", f4Var.f230724G);
                    return false;
                }
                C48334c cVar = new C48334c();
                cVar.field_bizChatServId = z3__h.f222107n;
                cVar.field_brandUserName = f4Var.mo108768t();
                if (!Util.isNullOrNil(z3__h.f222108o)) {
                    cVar.field_chatVersion = Util.getInt(z3__h.f222108o, -1);
                }
                if (!Util.isNullOrNil(z3__h.f222106m)) {
                    cVar.field_chatType = Util.getInt(z3__h.f222106m, Util.getInt(z3__h.f222105l, -1));
                } else if (!Util.isNullOrNil(z3__h.f222105l)) {
                    cVar.field_chatType = Util.getInt(z3__h.f222105l, -1);
                }
                Log.m105919d("MicroMsg.BizChatMessageStorage", "bizchatId:%s,userId:%s", z3__h.f222107n, z3__h.f222109p);
                C48334c n = C48340e.m53673n(cVar);
                if (n != null) {
                    f4Var.mo108728H2(n.field_bizChatLocalId);
                    f4Var.mo108729I2(Util.nullAsNil(z3__h.f222109p));
                    if (z3__h.f222111r.equals("1")) {
                        f4Var.mo108740T2(1);
                    }
                    f4Var.mo108730J2(z3__h.f222098e);
                    if (!(f4Var.mo108769t2() == 1 || z3__h.f222109p == null)) {
                        if (z3__h.f222109p.equals(C48009v0.Bx0().mo73076Pk(f4Var.mo108768t()))) {
                            f4Var.mo108740T2(1);
                        }
                    }
                    if (!Util.isNullOrNil(z3__h.f222109p)) {
                        C48353j jVar = new C48353j();
                        jVar.field_userId = z3__h.f222109p;
                        jVar.field_userName = z3__h.f222110q;
                        jVar.field_brandUserName = f4Var.mo108768t();
                        C48354k Bx0 = C48009v0.Bx0();
                        Bx0.getClass();
                        Log.m105924i("MicroMsg.BizChatUserInfoStorage", "updateUserName");
                        C48353j jVar2 = Bx0.get(jVar.field_userId);
                        if (jVar2 == null) {
                            Bx0.insert(jVar);
                        } else if (!Util.isNullOrNil(jVar.field_userName) && !jVar.field_userName.equals(jVar2.field_userName)) {
                            jVar2.field_userName = jVar.field_userName;
                            Bx0.mo73075Lo(jVar2);
                        }
                    }
                } else {
                    Log.m105928w("MicroMsg.BizChatMessageStorage", "dealMsgSourceValue:bizChatInfo == null!");
                    return false;
                }
            } else if (!Util.isNullOrNil(z3__h.f222107n)) {
                Log.m105924i("MicroMsg.BizChatMessageStorage", "is EnterpriseChat but contact not ready");
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public String mo100923f(String str) {
        Assert.assertTrue(str != null && str.length() > 0);
        if (C47984k.m53334h(str)) {
            return "bizchatmessage";
        }
        return null;
    }

    /* renamed from: h */
    public int mo100924h(String str, long j) {
        if (str == null) {
            Log.m105929w("MicroMsg.BizChatMessageStorage", "getBizMsgCountFromMsgTable talker:%s,bizChatId:%s", str, Long.valueOf(j));
            return -1;
        }
        int i = C48009v0.Dx0().mo73024Yt(j).field_msgCount;
        if (i != 0) {
            return i;
        }
        Log.m105925i("MicroMsg.BizChatMessageStorage", "geBiztMsgCount contactMsgCount is 0 ,go normal %s", str);
        return mo100929m(str, j);
    }

    /* renamed from: i */
    public final String mo100925i(String str) {
        long jo = ((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101184jo(str);
        if (jo <= 0) {
            return "";
        }
        return " createTime > " + jo + " AND ";
    }

    /* renamed from: j */
    public Cursor mo100926j(String str, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, argument is invalid");
            return null;
        }
        String e = mo100941e(str);
        StringBuilder sb = new StringBuilder();
        sb.append("select * from ");
        sb.append(e);
        sb.append(" ");
        sb.append(" INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex ");
        sb.append(" where");
        sb.append(mo100928l(str, j));
        sb.append("AND ");
        this.f212648a.getClass();
        sb.append("type IN (3,39,13,43,62,44,49,268435505)");
        sb.append("  order by ");
        sb.append("createTime");
        String sb4 = sb.toString();
        Cursor rawQuery = mo100940c().rawQuery(sb4, (String[]) null);
        Log.m105919d("MicroMsg.BizChatMessageStorage", "all time: %d, sql: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), sb4);
        return rawQuery;
    }

    /* renamed from: k */
    public int mo100927k(String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(*) FROM ");
        sb.append(((C72972g4) this.f212648a).hy0(str));
        sb.append(" WHERE ");
        sb.append(mo100925i(str));
        sb.append(mo100928l(str, j));
        sb.append("AND ");
        this.f212648a.getClass();
        sb.append("type IN (3,39,13,43,62,44,268435505,486539313,1124073521)");
        Cursor rawQuery = mo100940c().rawQuery(sb.toString(), (String[]) null);
        int i = 0;
        if (rawQuery.moveToLast()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }

    /* renamed from: l */
    public String mo100928l(String str, long j) {
        return " bizChatId= " + j + " AND " + "talker" + "= '" + str + "'";
    }

    /* renamed from: m */
    public int mo100929m(String str, long j) {
        String str2 = "SELECT COUNT(*) FROM " + mo100941e(str) + " WHERE " + mo100928l(str, j);
        int i = 0;
        Log.m105927v("MicroMsg.BizChatMessageStorage", "getBizMsgCountFromMsgTable sql:[%s]", str2);
        Cursor rawQuery = mo100940c().rawQuery(str2, (String[]) null);
        if (rawQuery.moveToLast()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }

    /* renamed from: n */
    public C72963f4 mo100930n(String str, long j) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C72963f4 f4Var = new C72963f4();
        Cursor rawQuery = mo100940c().rawQuery("select * from " + mo100941e(str) + " where" + mo100928l(str, j) + "order by " + "createTime" + " DESC limit 1", (String[]) null);
        if (rawQuery.getCount() != 0) {
            rawQuery.moveToFirst();
            f4Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return f4Var;
    }
}
