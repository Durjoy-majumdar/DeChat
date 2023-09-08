package com.tencent.p014mm.storage;

import ai3.C112793f;
import ai3.C67048e;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MergeCursor;
import com.tencent.p014mm.contact.C40294d;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import eb0.C45628s0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;
import kj2.C117407d;
import o90.C100308d;
import p261wl.C38166b;
import p261wl.C38174i;
import p749xh.C53339k1;
import p823sg.C101611g;
import q90.C101062d;
import zh3.C79331c;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.g2 */
public class C44658g2 extends MStorageEx implements C44668u3 {

    /* renamed from: g */
    public static final String[] f121065g = {MAutoStorage.getCreateSQLs(C40294d.f108318T1, "rcontact"), MAutoStorage.getCreateSQLs(C40294d.f108318T1, "bottlecontact"), MAutoStorage.getCreateSQLs(C30720a2.f82629p, "ContactCmdBuf"), "CREATE TABLE IF NOT EXISTS contact ( contactID INTEGER PRIMARY KEY, sex INT, type INT, showHead INT, username VARCHAR(40), nickname VARCHAR(40), pyInitial VARCHAR(40), quanPin VARCHAR(60), reserved TEXT );", "CREATE TABLE IF NOT EXISTS contact_ext ( username VARCHAR(40), Uin INTEGER DEFAULT 0, Email VARCHAR(128), Mobile VARCHAR(40), ShowFlag INTEGER DEFAULT 0 , ConType INTEGER DEFAULT 0 , ConRemark TEXT, ConRemark_PYShort TEXT, ConRemark_PYFull TEXT, ConQQMBlog TEXT, ConSMBlog TEXT, DomainList TEXT, reserved1 INT DEFAULT 0 , reserved2 INT DEFAULT 0 , reserved3 INT DEFAULT 0 , reserved4 INT DEFAULT 0 , reserved5 INT DEFAULT 0 , reserved6 TEXT, reserved7 TEXT, reserved8 TEXT, reserved9 TEXT, reserved10 TEXT, weiboflag  INT DEFAULT 0 ,weibonickname TEXT  );"};

    /* renamed from: h */
    public static final String[] f121066h = {"CREATE UNIQUE INDEX IF NOT EXISTS  contact_username_unique_index ON rcontact ( username )", "CREATE INDEX IF NOT EXISTS  contact_alias_index ON rcontact ( alias )", "CREATE INDEX IF NOT EXISTS  en_username_unique_index ON rcontact ( encryptUsername )", "CREATE UNIQUE INDEX IF NOT EXISTS  bottle_username_unique_index ON bottlecontact ( username )", "CREATE INDEX IF NOT EXISTS type_verifyFlag_index ON rcontact ( type,verifyFlag ) ", "CREATE INDEX IF NOT EXISTS contact_usernameflag_index ON rcontact ( usernameFlag ) "};

    /* renamed from: i */
    public static String f121067i = "showHead = 32";

    /* renamed from: j */
    public static String f121068j = "type & 64 !=0  AND type >= 64";

    /* renamed from: c */
    public ISQLiteDatabase f121069c;

    /* renamed from: d */
    public final C101611g<String, C72996z1> f121070d = new C100308d(200);

    /* renamed from: e */
    public final C101611g<String, Integer> f121071e = new C100308d(400);

    /* renamed from: f */
    public C44659a f121072f = new C44659a((C44657f2) null);

    /* renamed from: com.tencent.mm.storage.g2$a */
    public static final class C44659a implements C44668u3.C44669a {

        /* renamed from: a */
        public ConcurrentHashMap<C44668u3.C44669a, Object> f121073a = new ConcurrentHashMap<>();

        public C44659a(C44657f2 f2Var) {
        }

        /* renamed from: J1 */
        public void mo69732J1(C44668u3 u3Var, C72996z1 z1Var) {
            for (C44668u3.C44669a J1 : this.f121073a.keySet()) {
                J1.mo69732J1(u3Var, z1Var);
            }
            C38166b.m41755b(C44668u3.C44670b.class, new g2$a$$a(u3Var, z1Var));
        }

        /* renamed from: K4 */
        public int mo69733K4(C72996z1 z1Var, boolean z) {
            for (C44668u3.C44669a next : this.f121073a.keySet()) {
                int K4 = next.mo69733K4(z1Var, z);
                if (K4 > 0) {
                    Log.m105925i("MicroMsg.ContactStorage", "[replace] ret=%s listener=%s", Integer.valueOf(K4), next);
                    return K4;
                }
            }
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C44668u3.C44670b.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                int K42 = ((C44668u3.C44670b) iVar.get()).mo434K4(z1Var, z);
                if (K42 > 0) {
                    Log.m105925i("MicroMsg.ContactStorage", "[replace] ret=%s listener=%s", Integer.valueOf(K42), iVar.get());
                    return K42;
                }
            }
            return -1;
        }

        public C72996z1 get(String str) {
            for (C44668u3.C44669a next : this.f121073a.keySet()) {
                C72996z1 z1Var = next.get(str);
                if (z1Var != null) {
                    Log.m105925i("MicroMsg.ContactStorage", "[get] contact=%s listener=%s", z1Var.getUsername(), next);
                    return z1Var;
                }
            }
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C44668u3.C44670b.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                C72996z1 z1Var2 = ((C44668u3.C44670b) iVar.get()).get(str);
                if (z1Var2 != null) {
                    Log.m105925i("MicroMsg.ContactStorage", "[get] contact=%s listener=%s", z1Var2.getUsername(), iVar.get());
                    return z1Var2;
                }
            }
            return null;
        }
    }

    public C44658g2(C91753f fVar) {
        Cursor rawQuery = fVar.rawQuery("PRAGMA table_info( contact_ext )", (String[]) null, 2);
        int columnIndex = rawQuery.getColumnIndex("name");
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        while (rawQuery.moveToNext() && (!z2 || !z3)) {
            if (columnIndex >= 0) {
                String string = rawQuery.getString(columnIndex);
                if ("weiboNickname".equalsIgnoreCase(string)) {
                    z3 = true;
                } else if ("weiboFlag".equalsIgnoreCase(string)) {
                    z2 = true;
                }
            }
        }
        rawQuery.close();
        if (!z2) {
            fVar.execSQL("contact_ext", "Alter table contact_ext add weiboFlag INT DEFAULT 0 ");
        }
        if (!z3) {
            fVar.execSQL("contact_ext", "Alter table contact_ext add weiboNickname INT DEFAULT 0 ");
        }
        Cursor rawQuery2 = fVar.rawQuery("PRAGMA table_info( rcontact )", (String[]) null, 2);
        int columnIndex2 = rawQuery2.getColumnIndex("name");
        while (true) {
            if (rawQuery2.moveToNext()) {
                if (columnIndex2 >= 0 && "verifyFlag".equalsIgnoreCase(rawQuery2.getString(columnIndex2))) {
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        rawQuery2.close();
        if (!z) {
            fVar.execSQL("rcontact", "Alter table rcontact add verifyFlag INT DEFAULT 0 ");
        }
        for (String execSQL : MAutoStorage.getUpdateSQLs(C40294d.f108318T1, "bottlecontact", fVar)) {
            fVar.execSQL("bottlecontact", execSQL);
        }
        for (String execSQL2 : MAutoStorage.getUpdateSQLs(C40294d.f108318T1, "rcontact", fVar)) {
            fVar.execSQL("rcontact", execSQL2);
        }
        for (String execSQL3 : f121066h) {
            fVar.execSQL("rcontact", execSQL3);
        }
        this.f121069c = fVar;
    }

    /* renamed from: F */
    public static String m49131F() {
        return m49135d() + " and " + m49132G();
    }

    /* renamed from: G */
    public static String m49132G() {
        StringBuilder sb = new StringBuilder();
        sb.append("type & ");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
        sb.append(8);
        sb.append("=0");
        sb.append(C45628s0.m50764b("username", "@openim", false, new String[0]));
        return sb.toString();
    }

    /* renamed from: H */
    public static String m49133H(String str) {
        return C72996z1.m85811N4(str) ? "bottlecontact" : "rcontact";
    }

    /* renamed from: I */
    public static String m49134I() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
        return "( (" + "type & 1!=0" + ") and " + "type" + " & " + 8 + "=0" + C45628s0.m50764b("username", "@talkroom", false, new String[0]) + ")";
    }

    /* renamed from: d */
    public static String m49135d() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
        return (" where (" + "type & 1!=0" + ") and ") + "type & " + 32 + "=0  ";
    }

    /* renamed from: e */
    public static String m49136e(boolean z, boolean z2) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
        String str = "type & 1!=0";
        if (z) {
            str = str + " or type & " + 16 + "!=0";
        }
        String str2 = ((" where (" + str + ")") + " and type & " + 32 + "=0 ") + " and type & " + 8 + " =0 ";
        if (z2) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" and verifyFlag & ");
        int i = C72996z1.f214113Y1;
        sb.append(8);
        sb.append(" =0 ");
        return sb.toString();
    }

    /* renamed from: g */
    public static String m49137g() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
        return ((" where (" + "type & 1 !=0 " + ") and ") + "type & " + 32 + " =0 and ") + "type & " + 8 + " =0";
    }

    /* renamed from: h */
    public static String m49138h() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
        return "( (" + "type & 1!=0" + ") and " + "type" + " & " + 8 + "=0" + C45628s0.m50768d("username", new String[]{"@chatroom", "@im.chatroom"}, new String[0]) + ")";
    }

    /* renamed from: A3 */
    public Cursor mo69648A3(int i, boolean z) {
        String str = "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact " + m49135d() + " AND " + "type" + " & " + i + " !=0  AND " + "type" + " >= " + i;
        if (z) {
            str = str + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
        }
        Log.m105926v("MicroMsg.ContactStorage", str);
        return this.f121069c.rawQuery(str, (String[]) null);
    }

    /* renamed from: B3 */
    public String mo69649B3(String str, String str2, List<String> list) {
        String str3;
        String str4 = str;
        boolean z = true;
        if (str4 == null || str4.equals("@all.android")) {
            str3 = "" + m49136e(true, false);
        } else if (str4.equals("@all.contact.android")) {
            str3 = "" + m49135d();
        } else if (str4.equals("@all.chatroom.contact")) {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("(type & ");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
            sb4.append(1);
            sb4.append("!=0");
            sb4.append(C45628s0.m50768d("username", new String[]{"@chatroom", "@im.chatroom"}, new String[0]));
            sb4.append(")");
            sb.append((" where (" + sb4.toString() + ") and ") + "type & " + 32 + "=0 ");
            str3 = sb.toString();
        } else if (str4.equals("@all.contact.without.chatroom")) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("");
            String e = m49136e(false, false);
            Assert.assertTrue(e != null && e.length() > 0);
            String str5 = " or (" + m49134I() + ')' + " or " + '(' + m49132G() + ")";
            sb5.append(e + C45628s0.m50766c("username", "@micromsg.qq.com", str5));
            str3 = sb5.toString();
        } else if (str4.equals("@all.contact.without.chatroom.without.openim") || str4.equals("@all.contact.without.chatroom.without.openim.without.openimfavour")) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("");
            String e2 = m49136e(false, false);
            Assert.assertTrue(e2 != null && e2.length() > 0);
            String str6 = " or (" + m49134I() + ')';
            sb6.append(e2 + C45628s0.m50766c("username", "@micromsg.qq.com", str6));
            str3 = sb6.toString();
        } else if (str4.equals("@black.android")) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C40294d.f108318T1;
            sb7.append(" where type & 8!=0 and type >= 8");
            str3 = sb7.toString();
        } else if (str4.equals("@werun.black.android")) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append("");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo3 = C40294d.f108318T1;
            sb8.append(" where type & 524288!=0");
            str3 = sb8.toString();
        } else if (str4.equals("@tophistory.black.android")) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo4 = C40294d.f108318T1;
            sb9.append(" where type & 131072!=0");
            str3 = sb9.toString();
        } else if (str4.equals("@tophistory.unlike.android")) {
            StringBuilder sb10 = new StringBuilder();
            sb10.append("");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo5 = C40294d.f108318T1;
            sb10.append(" where type & 262144!=0");
            str3 = sb10.toString();
        } else if (str4.equals("@social.black.android")) {
            StringBuilder sb11 = new StringBuilder();
            sb11.append("");
            StringBuilder sb12 = new StringBuilder();
            sb12.append(m49135d());
            sb12.append(" and ");
            sb12.append("type");
            sb12.append(" & ");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo6 = C40294d.f108318T1;
            sb12.append(8388608);
            sb12.append("!=0");
            sb11.append(sb12.toString());
            str3 = sb11.toString();
        } else if (str4.equals("@sns.black.android")) {
            StringBuilder sb13 = new StringBuilder();
            sb13.append("");
            StringBuilder sb14 = new StringBuilder();
            sb14.append(m49135d());
            sb14.append(" and ");
            sb14.append("type");
            sb14.append(" & ");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo7 = C40294d.f108318T1;
            sb14.append(256);
            sb14.append("!=0");
            sb13.append(sb14.toString());
            str3 = sb13.toString();
        } else if (str4.equals("@sns.unlike.android")) {
            StringBuilder sb15 = new StringBuilder();
            sb15.append("");
            StringBuilder sb16 = new StringBuilder();
            sb16.append(m49135d());
            sb16.append(" and ");
            sb16.append("type");
            sb16.append(" & ");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo8 = C40294d.f108318T1;
            sb16.append(1048576);
            sb16.append("!=0");
            sb15.append(sb16.toString());
            str3 = sb15.toString();
        } else if (str4.equals("@finder.block.his.liked.android")) {
            StringBuilder sb17 = new StringBuilder();
            sb17.append("");
            StringBuilder sb18 = new StringBuilder();
            sb18.append(m49135d());
            sb18.append(" and ");
            sb18.append("type");
            sb18.append(" & ");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo9 = C40294d.f108318T1;
            sb18.append(TPMediaCodecProfileLevel.HEVCHighTierLevel62);
            sb18.append("!=0");
            sb17.append(sb18.toString());
            str3 = sb17.toString();
        } else if (str4.equals("@finder.block.my.liked.android")) {
            StringBuilder sb19 = new StringBuilder();
            sb19.append("");
            StringBuilder sb20 = new StringBuilder();
            sb20.append(m49135d());
            sb20.append(" and ");
            sb20.append("type");
            sb20.append(" & ");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo10 = C40294d.f108318T1;
            sb20.append(134217728);
            sb20.append("!=0");
            sb19.append(sb20.toString());
            str3 = sb19.toString();
        } else if (str4.equals("@t.qq.com")) {
            StringBuilder sb21 = new StringBuilder();
            sb21.append("");
            sb21.append(" where username like '%" + "@t.qq.com" + "'");
            str3 = sb21.toString();
        } else if (str4.equals("@domain.android")) {
            StringBuilder sb22 = new StringBuilder();
            sb22.append("");
            String e3 = m49136e(true, false);
            if (e3 == null || e3.length() <= 0) {
                z = false;
            }
            Assert.assertTrue(z);
            sb22.append(e3 + " and domainList like '%" + str2 + "%'");
            str3 = sb22.toString();
        } else if (str4.equals("@micromsg.qq.com")) {
            StringBuilder sb23 = new StringBuilder();
            sb23.append("");
            String e4 = m49136e(false, false);
            Assert.assertTrue(e4 != null && e4.length() > 0);
            String str7 = " or (" + m49138h() + ')';
            String str8 = " or (" + m49134I() + ')';
            sb23.append(e4 + C45628s0.m50766c("username", "@micromsg.qq.com", str7, str8));
            str3 = sb23.toString();
        } else if (str4.equals("@micromsg.no.verify.biz.qq.com")) {
            StringBuilder sb24 = new StringBuilder();
            sb24.append("");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo11 = C40294d.f108318T1;
            StringBuilder sb25 = new StringBuilder();
            sb25.append((" where (type & 1 !=0 ) and " + "type & " + 32 + " =0 and ") + "type & " + 8 + " =0 and ");
            sb25.append("verifyFlag & ");
            int i = C72996z1.f214113Y1;
            sb25.append(8);
            sb25.append(" =0");
            String sb26 = sb25.toString();
            Assert.assertTrue(sb26 != null && sb26.length() > 0);
            String str9 = " or (" + m49138h() + ')';
            sb24.append(sb26 + C45628s0.m50766c("username", "@micromsg.qq.com", str9));
            str3 = sb24.toString();
        } else if (str4.equals("@micromsg.with.all.biz.qq.com")) {
            StringBuilder sb27 = new StringBuilder();
            sb27.append("");
            String g = m49137g();
            Assert.assertTrue(g != null && g.length() > 0);
            String str10 = " or (" + m49138h() + ')';
            sb27.append(g + C45628s0.m50766c("username", "@micromsg.qq.com", str10));
            str3 = sb27.toString();
        } else if (str4.equals("@micromsg.with.all.biz.qq.com.openim")) {
            StringBuilder sb28 = new StringBuilder();
            sb28.append("");
            String g2 = m49137g();
            Assert.assertTrue(g2 != null && g2.length() > 0);
            String str11 = " or (" + m49138h() + ')';
            sb28.append(g2 + C45628s0.m50766c("username", "@micromsg.qq.com", str11, " or ((username like '%@openim'))"));
            str3 = sb28.toString();
        } else if (str4.equals("@qqim")) {
            StringBuilder sb29 = new StringBuilder();
            sb29.append("");
            String e5 = m49136e(false, false);
            if (e5 == null || e5.length() <= 0) {
                z = false;
            }
            Assert.assertTrue(z);
            sb29.append(e5 + C45628s0.m50766c("username", "@qqim", new String[0]));
            str3 = sb29.toString();
        } else if (str4.equals("@all.chatroom")) {
            StringBuilder sb30 = new StringBuilder();
            sb30.append("");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo12 = C40294d.f108318T1;
            sb30.append(" where (" + ((("type & 1 !=0" + " or type & 2 !=0") + " or type & 4 !=0") + " or 1") + ") ");
            str3 = sb30.toString();
        } else if (str4.equals("@verify.contact")) {
            StringBuilder sb31 = new StringBuilder();
            sb31.append("");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo13 = C40294d.f108318T1;
            StringBuilder sb32 = new StringBuilder();
            sb32.append("type & 1 != 0 and ");
            sb32.append("verifyFlag & ");
            int i2 = C72996z1.f214113Y1;
            sb32.append(16);
            sb32.append(" != 0");
            sb31.append(" where (" + sb32.toString() + ") ");
            str3 = sb31.toString();
        } else if (str4.equals("@biz.contact")) {
            StringBuilder sb33 = new StringBuilder();
            sb33.append("");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo14 = C40294d.f108318T1;
            StringBuilder sb34 = new StringBuilder();
            sb34.append("type & 1 != 0 and ");
            sb34.append("verifyFlag & ");
            int i3 = C72996z1.f214113Y1;
            sb34.append(8);
            sb34.append(" != 0");
            sb33.append(" where (" + sb34.toString() + ") ");
            str3 = sb33.toString();
        } else if (str4.equals("@all.weixin.android")) {
            StringBuilder sb35 = new StringBuilder();
            sb35.append("");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo15 = C40294d.f108318T1;
            sb35.append(" where (" + "type & 1 != 0 or  (username not like '%@qqim' and username not like '%@qr' and username not like '%@bottle' and username not like '%@fb' and username not like '%@google' and username not like '%@t.qq.com' and username not like '%@t.sina.com' and username not like '%@t.sina.com')" + ") ");
            str3 = sb35.toString();
        } else if (str4.equals("@openim.contact")) {
            str3 = "" + m49131F();
        } else if (str4.equals("@guardian.teenmode")) {
            StringBuilder sb36 = new StringBuilder();
            sb36.append("");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo16 = C40294d.f108318T1;
            sb36.append(" where type & 1073741824!=0 ");
            str3 = sb36.toString();
        } else if (str4.equals("@ward.teenmode")) {
            StringBuilder sb37 = new StringBuilder();
            sb37.append("");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo17 = C40294d.f108318T1;
            sb37.append(" where type & 536870912!=0 ");
            str3 = sb37.toString();
        } else if (str4.equals("@all.contact.without.chatroom.openim.openimfavour.snsblack.black.socialblack")) {
            StringBuilder sb38 = new StringBuilder();
            sb38.append("");
            String e6 = m49136e(false, false);
            StringBuilder sb39 = new StringBuilder();
            sb39.append(e6);
            sb39.append(" and type & ");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo18 = C40294d.f108318T1;
            sb39.append(256);
            sb39.append("=0 and ");
            sb39.append("type");
            sb39.append(" & ");
            sb39.append(8388608);
            sb39.append("=0");
            String sb40 = sb39.toString();
            Assert.assertTrue(sb40 != null && sb40.length() > 0);
            String str12 = " or (" + m49134I() + ')';
            sb38.append((sb40 + " and ( username not like '%@%'" + str12 + ")") + C45628s0.m50766c("username", "@micromsg.qq.com", str12));
            str3 = sb38.toString();
        } else {
            Log.m105918d("MicroMsg.ContactStorage", "unknow role type");
            str3 = "" + m49136e(false, false);
        }
        return str3 + mo69685b(list);
    }

    /* renamed from: C3 */
    public Cursor mo69650C3(List<String> list, boolean z) {
        String str = "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact " + mo69717o3(list, z) + mo69673V3();
        Log.m105926v("MicroMsg.ContactStorage", "favourSql " + str);
        Log.m105925i("MicroMsg.ContactStorage", "getFavCursor favourSql = %s", str);
        return this.f121069c.rawQuery(str, (String[]) null);
    }

    /* renamed from: D3 */
    public Cursor mo69651D3(String str, String str2, List<String> list, List<String> list2, boolean z, boolean z2) {
        String str3 = "select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact " + mo69649B3(str, str2, list) + mo69703i(list2) + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
        Log.m105926v("MicroMsg.ContactStorage", str3);
        if (!z) {
            return this.f121069c.rawQuery(str3, (String[]) null, 4);
        }
        C112793f[] fVarArr = new C112793f[2];
        Log.m105926v("MicroMsg.ContactStorage", "favourSql " + str3);
        Cursor rawQuery = this.f121069c.rawQuery("select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact " + mo69717o3(list, z2) + mo69673V3(), (String[]) null, 4);
        Cursor rawQuery2 = this.f121069c.rawQuery(str3, (String[]) null, 4);
        if (!(rawQuery instanceof C112793f) || !(rawQuery2 instanceof C112793f)) {
            return C79331c.m96022a();
        }
        fVarArr[0] = (C112793f) rawQuery;
        fVarArr[1] = (C112793f) rawQuery2;
        return new C67048e(fVarArr);
    }

    /* renamed from: E3 */
    public Cursor mo69652E3(List<String> list) {
        Assert.assertTrue(list.size() > 0);
        String str = "select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,type from rcontact  where ";
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                str = str + "username = '" + list.get(i) + "' OR ";
            } else {
                str = str + "username = '" + list.get(i) + "'";
            }
        }
        return this.f121069c.rawQuery(str + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ", (String[]) null);
    }

    /* renamed from: F1 */
    public void mo69653F1(String str) {
        if (!Util.isNullOrNil(str)) {
            ((C101062d) this.f121070d).remove(str);
            ((C101062d) this.f121071e).remove(str);
            Log.m105919d("MicroMsg.ContactStorage", "removeFromCache(%s) username：%s", this.f121070d, str);
        }
    }

    /* renamed from: F3 */
    public Cursor mo69654F3(List<String> list) {
        Assert.assertTrue(list.size() > 0);
        StringBuilder sb = new StringBuilder("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact ");
        sb.append(" where ");
        sb.append("username");
        sb.append(" IN (");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                sb.append(" '");
                sb.append(list.get(i));
                sb.append("'");
            } else {
                sb.append(" '");
                sb.append(list.get(i));
                sb.append("',");
            }
        }
        sb.append(" )");
        sb.append(" order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ");
        return this.f121069c.rawQuery(sb.toString(), (String[]) null);
    }

    /* renamed from: G3 */
    public String mo69655G3() {
        return " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
    }

    /* renamed from: H3 */
    public C72996z1 mo69656H3(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        if (C72996z1.m85811N4(str)) {
            str = C72996z1.m85829Z5(str);
        }
        C72996z1 W2 = mo69674W2(str);
        if (W2 != null) {
            return W2;
        }
        C72996z1 z1Var = new C72996z1();
        StringBuilder sb = new StringBuilder();
        sb.append(C72996z1.m85811N4(str) ? "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from bottlecontact" : "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact");
        sb.append(" where ");
        sb.append("username");
        sb.append("=");
        sb.append(C91753f.m115264e(str));
        sb.append(" or ");
        sb.append("encryptUsername");
        sb.append("=");
        sb.append(C91753f.m115264e(str));
        Cursor rawQuery = this.f121069c.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            z1Var.convertFrom(rawQuery);
            mo69726u3(z1Var, false);
        }
        rawQuery.close();
        return z1Var;
    }

    /* renamed from: I3 */
    public Cursor mo69657I3(List<String> list, String str, List<String> list2) {
        String a = mo69682a("select rcontact.username ,rcontact.nickname ,rcontact.alias,rcontact.conRemark,rcontact.verifyFlag,rcontact.showHead,rcontact.weiboFlag,rcontact.rowid ,rcontact.deleteFlag,rcontact.lvbuff,rcontact.descWordingId, rcontact.openImAppid,  OpenIMWordingInfo.wording, OpenIMWordingInfo.quanpin  from rcontact left join OpenIMWordingInfo on rcontact.descWordingId=OpenIMWordingInfo.wordingId and rcontact.openImAppid = OpenIMWordingInfo.appid ", list, str, list2);
        return this.f121069c.rawQuery(a + " order by OpenIMWordingInfo.quanpin IS NULL, OpenIMWordingInfo.quanpin ", (String[]) null, 4);
    }

    /* renamed from: J */
    public final String mo69658J(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        int i = 0;
        if (strArr.length < 500) {
            String str = " and (";
            while (i < strArr.length) {
                if (i > 0) {
                    str = str + " or ";
                }
                str = str + "username = '" + strArr[i] + "' ";
                i++;
            }
            return str + " )";
        } else if (strArr.length == 0) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder("");
            while (i < strArr.length) {
                if (i == strArr.length - 1) {
                    sb.append(" '" + strArr[i].trim() + "' ");
                } else {
                    sb.append(" '" + strArr[i].trim() + "' ,");
                }
                i++;
            }
            return (" and " + "username in (" + sb.toString() + ") ") + "";
        }
    }

    /* renamed from: J3 */
    public Cursor mo69659J3() {
        StringBuilder sb = new StringBuilder();
        sb.append("select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact ");
        sb.append(" where ");
        sb.append("type");
        sb.append(" & ");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
        sb.append(1);
        sb.append(" !=0 and ");
        sb.append("type");
        sb.append(" & ");
        sb.append(32);
        sb.append(" =0 and ");
        sb.append("type");
        sb.append(" & ");
        sb.append(8);
        sb.append(" =0 and ");
        sb.append("verifyFlag");
        sb.append(" & ");
        sb.append(8);
        sb.append(" = 0");
        sb.append(C45628s0.m50764b("username", "@micromsg.qq.com", false, new String[0]));
        sb.append(" or ");
        sb.append("username");
        sb.append(" = '");
        sb.append("weixin");
        sb.append("'");
        Log.m105919d("MicroMsg.ContactStorage", "get friend cursor, sql is %s", sb.toString());
        return this.f121069c.rawQuery(sb.toString(), (String[]) null, 2);
    }

    /* renamed from: K */
    public final boolean mo69660K(C72996z1 z1Var) {
        boolean z = false;
        if (z1Var == null) {
            return false;
        }
        int i = z1Var.f108321S1;
        if (i > 0) {
            z = true;
        }
        Log.m105918d("MicroMsg.ContactStorage", "it need to update contact: " + z + " version code : " + i + " user: " + z1Var.getUsername());
        return z;
    }

    /* renamed from: K3 */
    public boolean mo69661K3(String str) {
        boolean z = false;
        if (Util.isNullOrNil(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("select count(*) from ");
        sb.append(m49133H(str));
        sb.append(" where ");
        sb.append("type");
        sb.append(" & ");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
        sb.append(8);
        sb.append(" !=0 and ");
        sb.append("username");
        sb.append("=");
        sb.append(C91753f.m115264e(str));
        Cursor rawQuery = this.f121069c.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery.moveToFirst() && rawQuery.getInt(0) > 0) {
            z = true;
        }
        rawQuery.close();
        return z;
    }

    /* renamed from: L3 */
    public String mo69662L3(String str) {
        C72996z1 f = mo69695f(str);
        if (f != null) {
            Log.m105925i("MicroMsg.ContactStorage", "getSendMsgTicket %s %s", Util.nullAs(str, ""), Integer.valueOf(Util.nullAs(f.mo73958K(), "").length()));
            return f.mo73958K();
        }
        Log.m105920e("MicroMsg.ContactStorage", "getSendMsgTicket ca == null");
        return "";
    }

    /* renamed from: M3 */
    public Cursor mo69663M3(List<String> list) {
        return this.f121069c.rawQuery("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact where (" + f121068j + ") and (" + mo69706j(list) + ")" + mo69673V3(), (String[]) null);
    }

    /* renamed from: N2 */
    public C72996z1 mo69664N2(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        if (C72996z1.m85811N4(str)) {
            str = C72996z1.m85829Z5(str);
        }
        C72996z1 W2 = mo69674W2(str);
        if (W2 != null) {
            W2.mo101232a6();
            return W2;
        }
        C72996z1 z1Var = this.f121072f.get(str);
        if (z1Var != null) {
            mo69726u3(z1Var, false);
            return z1Var;
        }
        C72996z1 z1Var2 = new C72996z1();
        StringBuilder sb = new StringBuilder();
        sb.append(C72996z1.m85811N4(str) ? "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from bottlecontact" : "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact");
        sb.append(" where ");
        sb.append("username");
        sb.append("=");
        sb.append(C91753f.m115264e(str));
        Cursor rawQuery = this.f121069c.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            z1Var2.convertFrom(rawQuery);
            mo69726u3(z1Var2, false);
        }
        rawQuery.close();
        z1Var2.mo101232a6();
        return z1Var2;
    }

    /* renamed from: N3 */
    public Cursor mo69665N3() {
        String str = "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact " + m49135d() + " AND " + f121068j + " AND " + f121067i + mo69673V3();
        Log.m105926v("MicroMsg.ContactStorage", str);
        return this.f121069c.rawQuery(str, (String[]) null);
    }

    /* renamed from: O3 */
    public void mo69666O3(C44668u3.C44669a aVar) {
        this.f121072f.f121073a.remove(aVar);
    }

    /* renamed from: P3 */
    public boolean mo69667P3(C72996z1 z1Var) {
        return mo69707j3(z1Var) > 0;
    }

    /* renamed from: Q3 */
    public boolean mo69668Q3(C72996z1 z1Var) {
        Assert.assertTrue("contact NULL !", z1Var != null);
        if (!mo69660K(z1Var)) {
            return true;
        }
        z1Var.mo62886Y2(z1Var.mo62901g3());
        z1Var.mo62923p4(z1Var.mo62905h3());
        this.f121072f.mo69732J1(this, z1Var);
        boolean z = this.f121072f.mo69733K4(z1Var, false) > 0;
        Log.m105925i("MicroMsg.ContactStorage", "[replace] ret:%s username=%s, showHead=%d, verifyFlag=%d", Boolean.valueOf(z), z1Var.getUsername(), Integer.valueOf(z1Var.mo62845A2()), Integer.valueOf(z1Var.mo73953E2()));
        if (!z) {
            ContentValues convertTo = z1Var.convertTo();
            if (z1Var.mo62907i3() > 0) {
                convertTo.put("rowid", Integer.valueOf(z1Var.mo62907i3()));
            }
            z = ((C91753f) this.f121069c).replace(m49133H(z1Var.getUsername()), C40294d.f108318T1.primaryKey, convertTo) > 0;
        }
        mo69653F1(z1Var.getUsername());
        if (!Util.isNullOrNil(z1Var.mo73978v2())) {
            mo69653F1(z1Var.mo73978v2());
        }
        if (!z) {
            return false;
        }
        doNotify(4, this, z1Var.getUsername(), z1Var);
        return true;
    }

    /* renamed from: R3 */
    public int mo69669R3() {
        String str = "select count(rowid) from rcontact " + mo69649B3("@biz.contact", (String) null, (List<String>) null);
        Log.m105926v("MicroMsg.ContactStorage", str);
        Cursor rawQuery = this.f121069c.rawQuery(str, (String[]) null, 2);
        int i = 0;
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }

    /* renamed from: S3 */
    public Cursor mo69670S3(String[] strArr, String str, String str2, String str3, List<String> list) {
        String str4 = "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact " + mo69649B3(str2, str3, list) + mo69658J(strArr) + mo69713m3(str) + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
        Log.m105926v("MicroMsg.ContactStorage", str4);
        return this.f121069c.rawQuery(str4, (String[]) null);
    }

    /* renamed from: T3 */
    public int mo69671T3(String str, String str2, List<String> list) {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        String str3 = "select count(username) from rcontact" + mo69649B3(str, str2, list) + mo69713m3(str2);
        Cursor rawQuery = this.f121069c.rawQuery(str3, (String[]) null, 2);
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            i = 0;
        } else {
            i = rawQuery.getInt(0);
            rawQuery.close();
        }
        Log.m105925i("MicroMsg.ContactStorage", "getCountByFilterType, sql:%s, count:%d, time:%d", str3, Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return i;
    }

    /* renamed from: U3 */
    public int[] mo69672U3(String[] strArr, String str, String str2, String str3, List<String> list) {
        long currentTimeMillis = System.currentTimeMillis();
        String str4 = "select count(*) from rcontact " + mo69649B3(str, str2, list) + mo69658J(strArr) + mo69713m3(str3);
        int[] iArr = null;
        Cursor rawQuery = this.f121069c.rawQuery(str4 + " group by showHead", (String[]) null);
        Log.m105918d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getSectionNumByShowHead db.rawQuery : " + (System.currentTimeMillis() - currentTimeMillis));
        long currentTimeMillis2 = System.currentTimeMillis();
        int count = rawQuery.getCount();
        Log.m105918d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getSectionNumByShowHead cu.getCount() : " + (System.currentTimeMillis() - currentTimeMillis2));
        if (count > 0) {
            iArr = new int[count];
            for (int i = 0; i < count; i++) {
                rawQuery.moveToPosition(i);
                iArr[i] = rawQuery.getInt(0);
            }
        }
        rawQuery.close();
        return iArr;
    }

    /* renamed from: V3 */
    public String mo69673V3() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = C72996z1.f214113Y1;
        stringBuffer.append(" order by case when verifyFlag & 8 != 0 then 0 else 1 end , showHead asc, ");
        stringBuffer.append(" case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull) ");
        stringBuffer.append(" else upper(quanPin) end asc, ");
        stringBuffer.append(" case when length(conRemark) > 0 then upper(conRemark) ");
        stringBuffer.append(" else upper(quanPin) end asc, ");
        stringBuffer.append(" upper(quanPin) asc, ");
        stringBuffer.append(" upper(nickname) asc, ");
        stringBuffer.append(" upper(username) asc ");
        return stringBuffer.toString();
    }

    /* renamed from: W2 */
    public C72996z1 mo69674W2(String str) {
        C72996z1 z1Var = (C72996z1) ((C101062d) this.f121070d).mo139556b(str);
        if (z1Var != null) {
            return z1Var;
        }
        return null;
    }

    /* renamed from: W3 */
    public int[] mo69675W3(List<String> list) {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor rawQuery = this.f121069c.rawQuery("select distinct showHead from rcontact  where (" + mo69706j(list) + ") " + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ", (String[]) null);
        Log.m105918d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getShowSectionByShowHead db.rawQuery : " + (System.currentTimeMillis() - currentTimeMillis));
        long currentTimeMillis2 = System.currentTimeMillis();
        int count = rawQuery.getCount() >= 0 ? rawQuery.getCount() : 0;
        Log.m105918d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getShowSectionByShowHead cu.getCount() : " + (System.currentTimeMillis() - currentTimeMillis2));
        int[] iArr = new int[count];
        if (rawQuery.getCount() > 0) {
            for (int i = 0; i < count; i++) {
                rawQuery.moveToPosition(i);
                iArr[i] = rawQuery.getInt(0);
            }
        }
        rawQuery.close();
        return iArr;
    }

    /* renamed from: X2 */
    public int mo69676X2(String str, String str2) {
        Log.m105925i("MicroMsg.ContactStorage", "updateSendMsgTicketByUser %s %s", Util.nullAs(str, ""), Integer.valueOf(Util.nullAs(str2, "").length()));
        C72996z1 f = mo69695f(str);
        if (f == null || Util.isEqual(f.mo73958K(), str2)) {
            return 0;
        }
        f.mo62890a3(str2);
        return mo69719p3(str, f);
    }

    /* renamed from: X3 */
    public List<String> mo69677X3(List<String> list) {
        if (list == null || list.isEmpty()) {
            Log.m105928w("MicroMsg.ContactStorage", "getFilterList: but white list is empty");
            return new LinkedList();
        }
        long currentTicks = Util.currentTicks();
        LinkedList linkedList = new LinkedList();
        StringBuilder sb = new StringBuilder();
        sb.append("username");
        sb.append("='");
        sb.append(list.get(0));
        sb.append("'");
        for (int i = 1; i < list.size(); i++) {
            sb.append(" or ");
            sb.append("username");
            sb.append("='");
            sb.append(list.get(i));
            sb.append("'");
        }
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
        String format = String.format("select %s from %s where (%s) and (%s & %d != 0)  order by %s", new Object[]{"username", "rcontact", sb.toString(), "type", 1, "showHead asc, pyInitial asc, quanPin asc, nickname asc, username asc "});
        Log.m105925i("MicroMsg.ContactStorage", "getFilterList: sql is %s", format);
        Cursor rawQuery = this.f121069c.rawQuery(format, (String[]) null, 2);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                linkedList.add(rawQuery.getString(0));
            }
            rawQuery.close();
        }
        Log.m105925i("MicroMsg.ContactStorage", "getFilerList: use time[%d ms] whiteList[%s], usernameList[%s]", Long.valueOf(Util.ticksToNow(currentTicks)), list, linkedList.toString());
        return linkedList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x02a1  */
    /* renamed from: Y2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo69678Y2(java.lang.String r19, com.tencent.p014mm.storage.C72996z1 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            java.lang.String r4 = "MicroMsg.ContactStorage"
            r5 = 0
            if (r3 != 0) goto L_0x02b4
            if (r2 == 0) goto L_0x02b4
            java.lang.String r3 = r20.getUsername()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x02b4
        L_0x001d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "updateEncryptUser contact: "
            r3.append(r6)
            java.lang.String r6 = r20.getUsername()
            r3.append(r6)
            java.lang.String r6 = " enUsername: "
            r3.append(r6)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            boolean r3 = r0.mo69660K(r2)
            r6 = 1
            if (r3 != 0) goto L_0x0045
            return r6
        L_0x0045:
            java.lang.String r3 = r20.getUsername()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85811N4(r3)
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = r20.getUsername()
            java.lang.String r3 = com.tencent.p014mm.storage.C72996z1.m85829Z5(r3)
            r2.setUsername(r3)
        L_0x005a:
            int r3 = r20.mo62901g3()
            r2.mo62886Y2(r3)
            long r7 = r20.mo62905h3()
            r2.mo62923p4(r7)
            com.tencent.mm.storage.g2$a r3 = r0.f121072f
            r3.mo69732J1(r0, r2)
            com.tencent.mm.storage.g2$a r3 = r0.f121072f
            int r3 = r3.mo69733K4(r2, r6)
            if (r3 <= 0) goto L_0x0077
            r3 = 1
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            r7[r5] = r8
            r7[r6] = r1
            java.lang.String r8 = r20.getUsername()
            r9 = 2
            r7[r9] = r8
            int r8 = r20.mo62845A2()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10 = 3
            r7[r10] = r8
            r8 = 4
            int r11 = r20.mo73953E2()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r7[r8] = r11
            r8 = 5
            int r11 = r20.getType()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r7[r8] = r11
            java.lang.String r8 = "[update] ret=%s oldUsername=%s, username=%s, showHead=%d, verifyFlag=%d type:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r7)
            android.content.ContentValues r7 = r20.convertTo()
            java.lang.String r8 = ", res:"
            java.lang.String r11 = " user :"
            java.lang.String r12 = "username=?"
            r13 = 0
            java.lang.String r15 = ""
            java.lang.String r9 = "fake_"
            if (r3 != 0) goto L_0x016e
            r16 = r11
            long r10 = r2.f108320R1
            int r17 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r17 > 0) goto L_0x016b
            com.tencent.mm.storage.z1 r3 = new com.tencent.mm.storage.z1
            r3.<init>(r1)
            r3.setType(r5)
            r3.mo73961b3(r13)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            r3.setUsername(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r10.append(r13)
            java.lang.String r9 = r10.toString()
            r3.mo62874S2(r9)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r0.f121069c
            java.lang.String r10 = m49133H(r19)
            android.content.ContentValues r3 = r3.convertTo()
            java.lang.String[] r11 = new java.lang.String[r6]
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r15)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            r11[r5] = r13
            zh3.f r9 = (zh3.C91753f) r9
            int r3 = r9.update(r10, r3, r12, r11)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "newContact.contactId <= 0 | delete "
            r9.append(r10)
            java.lang.String r10 = m49133H(r19)
            r9.append(r10)
            r10 = r16
            r9.append(r10)
            r9.append(r1)
            r9.append(r8)
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            int r3 = r7.size()
            if (r3 <= 0) goto L_0x0166
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r0.f121069c
            java.lang.String r8 = r20.getUsername()
            java.lang.String r8 = m49133H(r8)
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r9 = com.tencent.p014mm.contact.C40294d.f108318T1
            java.lang.String r9 = r9.primaryKey
            zh3.f r3 = (zh3.C91753f) r3
            long r8 = r3.replace(r8, r9, r7)
            int r3 = (int) r8
            goto L_0x0167
        L_0x0166:
            r3 = 0
        L_0x0167:
            r5 = 2
            r8 = 0
            goto L_0x0278
        L_0x016b:
            r10 = r16
            goto L_0x016f
        L_0x016e:
            r10 = r11
        L_0x016f:
            if (r3 != 0) goto L_0x0275
            java.lang.String r3 = r20.getUsername()
            boolean r3 = r1.equals(r3)
            java.lang.String r11 = "rowid=?"
            if (r3 == 0) goto L_0x01c6
            int r3 = r7.size()
            if (r3 <= 0) goto L_0x0275
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r0.f121069c
            java.lang.String r8 = r20.getUsername()
            java.lang.String r8 = m49133H(r8)
            java.lang.String[] r9 = new java.lang.String[r6]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r15)
            long r12 = r2.f108320R1
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r9[r5] = r10
            zh3.f r3 = (zh3.C91753f) r3
            int r3 = r3.update(r8, r7, r11, r9)
            r8 = 3
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r8 = r20.getUsername()
            r9[r5] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r9[r6] = r8
            long r10 = r2.f108320R1
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r10 = 2
            r9[r10] = r8
            java.lang.String r8 = "summercontact en equal username[%s], result1[%d], contactId[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r9)
            goto L_0x0167
        L_0x01c6:
            com.tencent.mm.storage.z1 r3 = new com.tencent.mm.storage.z1
            r3.<init>(r1)
            r3.setType(r5)
            r3.mo73961b3(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r13.append(r5)
            java.lang.String r5 = r13.toString()
            r3.setUsername(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r9)
            r6 = r15
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            r3.mo62874S2(r5)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r0.f121069c
            java.lang.String r13 = m49133H(r19)
            android.content.ContentValues r3 = r3.convertTo()
            r14 = 1
            java.lang.String[] r15 = new java.lang.String[r14]
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r6)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            r9 = 0
            r15[r9] = r14
            zh3.f r5 = (zh3.C91753f) r5
            int r3 = r5.update(r13, r3, r12, r15)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "delete "
            r5.append(r9)
            java.lang.String r9 = m49133H(r19)
            r5.append(r9)
            r5.append(r10)
            r5.append(r1)
            r5.append(r8)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            int r3 = r7.size()
            if (r3 <= 0) goto L_0x0275
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r0.f121069c
            java.lang.String r5 = r20.getUsername()
            java.lang.String r5 = m49133H(r5)
            r8 = 1
            java.lang.String[] r9 = new java.lang.String[r8]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            long r12 = r2.f108320R1
            r8.append(r12)
            java.lang.String r6 = r8.toString()
            r8 = 0
            r9[r8] = r6
            zh3.f r3 = (zh3.C91753f) r3
            int r3 = r3.update(r5, r7, r11, r9)
            goto L_0x0277
        L_0x0275:
            r8 = 0
            r3 = 0
        L_0x0277:
            r5 = 2
        L_0x0278:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r6 = r7.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r8] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r7 = 1
            r5[r7] = r6
            java.lang.String r6 = "updateEncryptUser values:%s, result1:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
            java.lang.String r4 = r20.getUsername()
            r0.mo69653F1(r4)
            java.lang.String r4 = r20.mo73978v2()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x02a8
            java.lang.String r4 = r20.mo73978v2()
            r0.mo69653F1(r4)
        L_0x02a8:
            r4 = 3
            r0.doNotify(r4, r0, r1, r2)
            java.lang.String r1 = r20.getUsername()
            r0.doNotify(r4, r0, r1, r2)
            return r3
        L_0x02b4:
            java.lang.String r1 = "update : wrong input!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C44658g2.mo69678Y2(java.lang.String, com.tencent.mm.storage.z1):int");
    }

    /* renamed from: Y3 */
    public Cursor mo69679Y3(String[] strArr, String str, String str2, List<String> list) {
        String str3 = "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact " + mo69649B3(str, str2, list) + mo69658J(strArr);
        if (strArr != null && strArr.length > 0) {
            str3 = str3 + " order by 1=1 ";
            for (String str4 : strArr) {
                str3 = str3 + ",username='" + str4 + "' desc";
            }
        }
        Log.m105926v("MicroMsg.ContactStorage", "getSearchCursorByArrOrder sql : " + str3);
        return this.f121069c.rawQuery(str3, (String[]) null);
    }

    /* renamed from: Z2 */
    public List<String> mo69680Z2() {
        Cursor rawQuery = this.f121069c.rawQuery("select username from rcontact where " + m49138h(), (String[]) null, 2);
        ArrayList arrayList = new ArrayList();
        if (rawQuery == null) {
            return arrayList;
        }
        if (rawQuery.moveToFirst()) {
            do {
                arrayList.add(rawQuery.getString(0));
            } while (rawQuery.moveToNext());
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: Z3 */
    public Cursor mo69681Z3() {
        Log.m105926v("MicroMsg.ContactStorage", "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact ");
        return this.f121069c.rawQuery("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact ", (String[]) null);
    }

    /* renamed from: a */
    public final String mo69682a(String str, List<String> list, String str2, List<String> list2) {
        String str3;
        String str4 = (str + " and OpenIMWordingInfo.language='" + str2 + "' ") + m49131F();
        String str5 = "";
        if (list2 != null && list2.size() > 0) {
            String str6 = str5;
            for (String next : list2) {
                if (str6.equals(str5)) {
                    str3 = str6 + " and (";
                } else {
                    str3 = str6 + " or ";
                }
                str6 = str3 + "openImAppid == '" + next + "'";
            }
            str5 = str6 + " )";
        }
        String str7 = (str4 + str5) + mo69685b(list);
        Log.m105927v("MicroMsg.ContactStorage", "getOpenIMCursor:%s", str7);
        return str7;
    }

    /* renamed from: a3 */
    public Cursor mo69683a3() {
        StringBuilder sb = new StringBuilder();
        sb.append("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact  where ");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("type & ");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
        sb4.append(8);
        sb4.append("=0");
        sb4.append(C45628s0.m50764b("username", "@chatroom", false, new String[0]));
        sb.append(sb4.toString());
        return this.f121069c.rawQuery(sb.toString(), (String[]) null);
    }

    /* renamed from: a4 */
    public Cursor mo69684a4(List<String> list, int i, boolean z) {
        String str = "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact " + m49135d() + " and ( " + mo69706j(list) + " ) ";
        if (z) {
            String str2 = str + " order by case username ";
            for (int i2 = 0; i2 < list.size(); i2++) {
                str2 = str2 + " when '" + list.get(i2) + "' then " + i2;
            }
            str = str2 + " end ";
        }
        if (i > 0) {
            str = str + " limit " + i;
        }
        Log.m105918d("MicroMsg.ContactStorage", "sql " + str);
        return this.f121069c.rawQuery(str, (String[]) null);
    }

    /* renamed from: b */
    public final String mo69685b(List<String> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < list.size(); i++) {
            if (!Util.isNullOrNil(list.get(i))) {
                if (i == list.size() - 1) {
                    sb.append(" '" + list.get(i).trim() + "' ");
                } else {
                    sb.append(" '" + list.get(i).trim() + "' ,");
                }
            }
        }
        return (" and " + "username not in (" + sb.toString() + ") ") + "";
    }

    /* renamed from: b3 */
    public Cursor mo69686b3(List<String> list, String str, List<String> list2) {
        String str2 = (mo69682a("select count(*)  from rcontact left join OpenIMWordingInfo on rcontact.descWordingId=OpenIMWordingInfo.wordingId and rcontact.openImAppid = OpenIMWordingInfo.appid ", list, str, list2) + "group by OpenIMWordingInfo.wording ") + " order by OpenIMWordingInfo.quanpin IS NULL, OpenIMWordingInfo.quanpin ";
        Log.m105927v("MicroMsg.ContactStorage", "getOpenIMHeaderCursor:%s", str2);
        return this.f121069c.rawQuery(str2, (String[]) null, 4);
    }

    /* renamed from: b4 */
    public Cursor mo69687b4(String str, String str2, List<String> list) {
        String str3 = "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact " + mo69649B3(str, str2, list) + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
        Log.m105926v("MicroMsg.ContactStorage", str3);
        return this.f121069c.rawQuery(str3, (String[]) null);
    }

    /* renamed from: c */
    public int mo69688c(String str) {
        Assert.assertTrue(str.length() > 0);
        if (C72996z1.m85811N4(str)) {
            str = C72996z1.m85829Z5(str);
        }
        mo69653F1(str);
        C72996z1 z1Var = new C72996z1(str);
        z1Var.setType(0);
        z1Var.mo73961b3(0);
        z1Var.setUsername("fake_" + Util.nowMilliSecond());
        z1Var.mo62874S2("fake_" + Util.nowMilliSecond());
        z1Var.mo62912k4(0);
        ISQLiteDatabase iSQLiteDatabase = this.f121069c;
        String H = m49133H(str);
        ContentValues convertTo = z1Var.convertTo();
        int update = ((C91753f) iSQLiteDatabase).update(H, convertTo, "username=?", new String[]{"" + str});
        mo69718o4(str);
        Log.m105929w("MicroMsg.ContactStorage", "delete (because the talker id , dk just mark it  disappear .) user:%s res:%s %s", str, Integer.valueOf(update), Util.getStack());
        if (update == 0) {
            return update;
        }
        doNotify(5, this, str, z1Var);
        return update;
    }

    /* renamed from: c3 */
    public Cursor mo69689c3(List<String> list, String str, List<String> list2) {
        String str2 = (mo69682a("select rcontact.username ,rcontact.nickname ,rcontact.alias,rcontact.conRemark,rcontact.verifyFlag,rcontact.showHead,rcontact.weiboFlag,rcontact.rowid ,rcontact.deleteFlag,rcontact.lvbuff,rcontact.descWordingId, rcontact.openImAppid,  OpenIMWordingInfo.wording, OpenIMWordingInfo.quanpin  from rcontact left join OpenIMWordingInfo on rcontact.descWordingId=OpenIMWordingInfo.wordingId and rcontact.openImAppid = OpenIMWordingInfo.appid ", list, str, list2) + "group by OpenIMWordingInfo.wording ") + " order by OpenIMWordingInfo.quanpin IS NULL, OpenIMWordingInfo.quanpin ";
        Log.m105927v("MicroMsg.ContactStorage", "getOpenIMHeaderCursor:%s", str2);
        return this.f121069c.rawQuery(str2, (String[]) null, 4);
    }

    /* renamed from: c4 */
    public void mo69690c4(C72996z1 z1Var) {
        mo69726u3(z1Var, false);
    }

    /* renamed from: d3 */
    public int[] mo69691d3(List<String> list) {
        long currentTimeMillis = System.currentTimeMillis();
        int[] iArr = null;
        Cursor rawQuery = this.f121069c.rawQuery(("select count(*) from rcontact " + "where " + mo69706j(list)) + " group by showHead", (String[]) null, 2);
        Log.m105918d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getSectionNumByShowHead db.rawQuery : " + (System.currentTimeMillis() - currentTimeMillis));
        long currentTimeMillis2 = System.currentTimeMillis();
        int count = rawQuery.getCount();
        Log.m105918d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getSectionNumByShowHead cu.getCount() : " + (System.currentTimeMillis() - currentTimeMillis2));
        if (count > 0) {
            iArr = new int[count];
            for (int i = 0; i < count; i++) {
                rawQuery.moveToPosition(i);
                iArr[i] = rawQuery.getInt(0);
            }
        }
        rawQuery.close();
        return iArr;
    }

    /* renamed from: d4 */
    public Cursor mo69692d4(List<String> list) {
        Assert.assertTrue(list.size() > 0);
        String str = "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact  where (";
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                str = str + "username = '" + list.get(i) + "' OR ";
            } else {
                str = str + "username = '" + list.get(i) + "'";
            }
        }
        String str2 = str + ") order by case username ";
        for (int i2 = 0; i2 < list.size(); i2++) {
            str2 = str2 + " when '" + list.get(i2) + "' then " + i2;
        }
        String str3 = str2 + " end";
        Log.m105918d("MicroMsg.ContactStorage", "getCursorByNamesInListOrder sql:" + str3);
        return this.f121069c.rawQuery(str3, (String[]) null);
    }

    public void doNotify(int i, MStorageEx mStorageEx, Object obj, Object obj2) {
        doNotify(new MStorageEx.Event(i, mStorageEx, obj, obj2));
        C53339k1.f149473Q1.doWrapNotify(i, (String) obj, (C72996z1) obj2);
    }

    /* renamed from: e3 */
    public Cursor mo69693e3(String str) {
        return this.f121069c.rawQuery(str, (String[]) null, 4);
    }

    /* renamed from: e4 */
    public C72996z1 mo69694e4(long j) {
        C72996z1 z1Var = null;
        if (j <= 0) {
            return null;
        }
        Cursor rawQuery = this.f121069c.rawQuery("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact  where rowid=" + j, (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            z1Var = new C72996z1();
            z1Var.convertFrom(rawQuery);
            mo69726u3(z1Var, false);
        }
        rawQuery.close();
        if (z1Var != null) {
            z1Var.mo101232a6();
        }
        return z1Var;
    }

    /* renamed from: f */
    public C72996z1 mo69695f(String str) {
        if (Util.isNullOrNil(str) || C72996z1.m85811N4(str)) {
            return null;
        }
        C72996z1 z1Var = new C72996z1();
        Cursor rawQuery = this.f121069c.rawQuery("select  *,rowid  from rcontact" + " where " + "username" + "=" + C91753f.m115264e(str) + " or " + "encryptUsername" + "=" + C91753f.m115264e(str), (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            z1Var.convertFrom(rawQuery);
            rawQuery.close();
            z1Var.mo101232a6();
            mo69726u3(z1Var, false);
        } else {
            rawQuery.close();
        }
        return z1Var;
    }

    /* renamed from: f3 */
    public C72996z1 mo69696f3(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        if (C72996z1.m85811N4(str)) {
            str = C72996z1.m85829Z5(str);
        }
        C72996z1 z1Var = new C72996z1();
        StringBuilder sb = new StringBuilder();
        sb.append(C72996z1.m85811N4(str) ? "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from bottlecontact" : "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact");
        sb.append(" where ");
        sb.append("username");
        sb.append("=");
        sb.append(C91753f.m115264e(str));
        sb.append(" or ");
        sb.append("encryptUsername");
        sb.append("=");
        sb.append(C91753f.m115264e(str));
        Cursor rawQuery = this.f121069c.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            z1Var.convertFrom(rawQuery);
            z1Var.mo101232a6();
        }
        rawQuery.close();
        return z1Var;
    }

    /* renamed from: f4 */
    public byte[] mo69697f4(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ContactStorage", "getCmdbuf failed user is null");
            return null;
        }
        C30720a2 a2Var = new C30720a2();
        Cursor query = ((C91753f) this.f121069c).query("ContactCmdBuf", (String[]) null, "username=?", new String[]{str}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            a2Var.convertFrom(query);
        }
        query.close();
        Object[] objArr = new Object[2];
        objArr[0] = str;
        byte[] bArr = a2Var.field_cmdbuf;
        objArr[1] = Integer.valueOf(bArr == null ? -1 : bArr.length);
        Log.m105919d("MicroMsg.ContactStorage", "getCmdbuf user:%s buf:%d", objArr);
        return a2Var.field_cmdbuf;
    }

    /* renamed from: g3 */
    public int mo69698g3(String str, long j) {
        Log.m105925i("MicroMsg.ContactStorage", "updateSendMsgTicketByUser %s %s", Util.nullAs(str, ""), Long.valueOf(j));
        C72996z1 N2 = mo69664N2(str);
        if (N2 == null || Util.isEqual(N2.f149536f1, j)) {
            return 0;
        }
        N2.mo62856H3(j);
        return mo69719p3(str, N2);
    }

    /* renamed from: g4 */
    public Cursor mo69699g4(List<String> list, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact ");
        sb.append(((m49136e(false, z) + " AND " + f121068j) + C45628s0.m50764b("username", "@openim", true, new String[0])) + mo69685b(list));
        sb.append(mo69673V3());
        String sb4 = sb.toString();
        Log.m105926v("MicroMsg.ContactStorage", "favourSql " + sb4);
        Log.m105925i("MicroMsg.ContactStorage", "getFavCursorWithoutOpenIM favourSql = %s", sb4);
        return this.f121069c.rawQuery(sb4, (String[]) null);
    }

    public C72996z1 get(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        if (C72996z1.m85811N4(str)) {
            str = C72996z1.m85829Z5(str);
        }
        C72996z1 W2 = mo69674W2(str);
        if (W2 != null) {
            Log.m105919d("MicroMsg.ContactStorage", "[get]getFromCache:%s %s", str, Integer.valueOf(W2.getType()));
            return W2;
        }
        C72996z1 z1Var = this.f121072f.get(str);
        if (z1Var != null) {
            Log.m105925i("MicroMsg.ContactStorage", "[get]extensions:%s %s", str, Integer.valueOf(z1Var.getType()));
            mo69726u3(z1Var, false);
            return z1Var;
        }
        C72996z1 z1Var2 = new C72996z1();
        StringBuilder sb = new StringBuilder();
        sb.append(C72996z1.m85811N4(str) ? "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from bottlecontact" : "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact");
        sb.append(" where ");
        sb.append("username");
        sb.append("=");
        sb.append(C91753f.m115264e(str));
        sb.append(" or ");
        sb.append("encryptUsername");
        sb.append("=");
        sb.append(C91753f.m115264e(str));
        Cursor rawQuery = this.f121069c.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            z1Var2.convertFrom(rawQuery);
            rawQuery.close();
            z1Var2.mo101232a6();
            mo69726u3(z1Var2, false);
        } else {
            rawQuery.close();
        }
        Log.m105925i("MicroMsg.ContactStorage", "[get]getRaw:%s %s", str, Integer.valueOf(z1Var2.getType()));
        return z1Var2;
    }

    /* renamed from: h3 */
    public void mo69701h3(C44668u3.C44669a aVar) {
        this.f121072f.f121073a.put(aVar, new Object());
    }

    /* renamed from: h4 */
    public Cursor mo69702h4(List<String> list) {
        Assert.assertTrue(list.size() > 0);
        StringBuilder sb = new StringBuilder("select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact ");
        sb.append(" where ");
        sb.append("username");
        sb.append(" IN (");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                sb.append(" '");
                sb.append(list.get(i));
                sb.append("'");
            } else {
                sb.append(" '");
                sb.append(list.get(i));
                sb.append("',");
            }
        }
        sb.append(" )");
        sb.append(" order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ");
        return this.f121069c.rawQuery(sb.toString(), (String[]) null);
    }

    /* renamed from: i */
    public final String mo69703i(List<String> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String append : list) {
            sb.append(" or ");
            sb.append("username");
            sb.append(" = '");
            sb.append(append);
            sb.append("'");
        }
        return sb.toString();
    }

    /* renamed from: i3 */
    public boolean mo69704i3(C72996z1 z1Var) {
        return mo69709k3(z1Var.getUsername()) ? mo69719p3(z1Var.getUsername(), z1Var) == 0 : mo69707j3(z1Var) >= 0;
    }

    /* renamed from: i4 */
    public Cursor mo69705i4(String str, String str2, List<String> list, boolean z) {
        String str3 = "select username from rcontact " + mo69649B3(str, str2, list);
        if (z) {
            str3 = str3 + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
        }
        Log.m105926v("MicroMsg.ContactStorage", str3);
        return this.f121069c.rawQuery(str3, (String[]) null);
    }

    /* renamed from: j */
    public final String mo69706j(List<String> list) {
        String i = mo69703i(list);
        int indexOf = i.indexOf("or");
        return indexOf <= 2 ? i.substring(indexOf + 2) : i;
    }

    /* renamed from: j3 */
    public int mo69707j3(C72996z1 z1Var) {
        if (Util.nullAsNil(z1Var.getUsername()).length() <= 0) {
            Log.m105920e("MicroMsg.ContactStorage", "FATAL ERROR, invalid contact, empty username");
            return -1;
        }
        z1Var.mo62886Y2(z1Var.mo62901g3());
        z1Var.mo62923p4(z1Var.mo62905h3());
        this.f121072f.mo69732J1(this, z1Var);
        int K4 = this.f121072f.mo69733K4(z1Var, false);
        Log.m105925i("MicroMsg.ContactStorage", "insert extensions replace=%s %s", Integer.valueOf(K4), z1Var.getUsername());
        if (K4 < 0) {
            ContentValues convertTo = z1Var.convertTo();
            long currentTimeMillis = System.currentTimeMillis();
            K4 = (int) ((C91753f) this.f121069c).mo125627q(m49133H(z1Var.getUsername()), C40294d.f108318T1.primaryKey, convertTo, false);
            int milliSecondsToNow = (int) Util.milliSecondsToNow(currentTimeMillis);
            boolean z = CrashReportFactory.foreground;
            C117407d.INSTANCE.mo160138m(463, z ? 11 : 14, z ? 12 : 15, milliSecondsToNow, false);
            Log.m105925i("MicroMsg.ContactStorage", "insert: username=%s, showHead=%d, verifyFlag=%d, ret=:%d take[%s]ms fg:%b", z1Var.getUsername(), Integer.valueOf(z1Var.mo62845A2()), Integer.valueOf(z1Var.mo73953E2()), Integer.valueOf(K4), Integer.valueOf(milliSecondsToNow), Boolean.valueOf(z));
            if (K4 != -1) {
                z1Var.f108320R1 = (long) K4;
                mo69726u3(z1Var, false);
                doNotify(2, this, z1Var.getUsername(), z1Var);
                return K4;
            }
            Log.m105921e("MicroMsg.ContactStorage", "insert failed: username=%s", z1Var.getUsername());
        }
        return K4;
    }

    /* renamed from: j4 */
    public Cursor mo69708j4(List<String> list, boolean z) {
        String str = "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact  where " + mo69706j(list);
        if (z) {
            str = str + " " + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
        }
        Log.m105918d("MicroMsg.ContactStorage", "sql " + str);
        return this.f121069c.rawQuery(str, (String[]) null);
    }

    /* renamed from: k3 */
    public boolean mo69709k3(String str) {
        C72996z1 z1Var = get(str);
        return z1Var != null && !Util.isNullOrNil(z1Var.getUsername()) && z1Var.getUsername().equals(str);
    }

    /* renamed from: k4 */
    public Cursor mo69710k4() {
        StringBuilder sb = new StringBuilder();
        sb.append("select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,descWordingId,openImAppid from rcontact ");
        sb.append(" where ");
        sb.append("type");
        sb.append(" & ");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
        sb.append(1);
        sb.append(" !=0 and ");
        sb.append("type");
        sb.append(" & ");
        sb.append(32);
        sb.append(" =0 and ");
        sb.append("type");
        sb.append(" & ");
        sb.append(8);
        sb.append(" =0 and ");
        sb.append("verifyFlag");
        sb.append(" & ");
        sb.append(8);
        sb.append(" = 0");
        sb.append(C45628s0.m50764b("username", "@micromsg.qq.com", false, new String[0]));
        sb.append(" or ");
        sb.append("username");
        sb.append(" = '");
        sb.append("weixin");
        sb.append("'");
        String sb4 = sb.toString();
        Cursor rawQuery = this.f121069c.rawQuery(sb4, (String[]) null, 2);
        Log.m105925i("MicroMsg.ContactStorage", "[oneliang]getNormalContactCursor, sql:%s", sb4);
        return rawQuery;
    }

    /* renamed from: l3 */
    public int mo69711l3(String[] strArr, String... strArr2) {
        int i;
        String[] strArr3 = strArr;
        String[] strArr4 = strArr2;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("select count(username) from ");
        sb.append("rcontact");
        sb.append(" where ");
        sb.append("type");
        sb.append(" & ");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
        sb.append(1);
        sb.append(" !=0 and ");
        sb.append("type");
        sb.append(" & ");
        sb.append(32);
        sb.append(" =0 and ");
        sb.append("type");
        sb.append(" & ");
        sb.append(8);
        sb.append(" =0 and ");
        sb.append("verifyFlag");
        sb.append(" & ");
        sb.append(8);
        sb.append(" = 0 ");
        sb.append(C45628s0.m50764b("username", "@micromsg.qq.com", false, new String[0]));
        if (strArr3 != null && strArr3.length > 0) {
            for (String str : strArr3) {
                if (!"weixin".equals(str)) {
                    sb.append(" and ");
                    sb.append("rcontact");
                    sb.append(".");
                    sb.append("username");
                    sb.append(" != '");
                    sb.append(str);
                    sb.append("'");
                }
            }
        }
        if (strArr4 != null && strArr4.length > 0) {
            for (String str2 : strArr4) {
                if (!"weixin".equals(str2)) {
                    sb.append(" and ");
                    sb.append("rcontact");
                    sb.append(".");
                    sb.append("username");
                    sb.append(" != '");
                    sb.append(str2);
                    sb.append("'");
                }
            }
        }
        sb.append(" or ");
        sb.append("username");
        sb.append(" = '");
        sb.append("weixin");
        sb.append("'");
        String sb4 = sb.toString();
        Cursor rawQuery = this.f121069c.rawQuery(sb4, (String[]) null, 2);
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            i = 0;
        } else {
            i = rawQuery.getInt(0);
            rawQuery.close();
        }
        Log.m105925i("MicroMsg.ContactStorage", "getNormalContactCount, sql:%s, result:%d, time:%d", sb4, Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return i;
    }

    /* renamed from: l4 */
    public Cursor mo69712l4(String[] strArr, String str, String str2, List<String> list, List<String> list2) {
        if (strArr == null || strArr.length == 0) {
            return C79331c.m96022a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact ");
        sb.append(mo69649B3(str, str2, list2));
        sb.append(mo69658J(strArr));
        String str3 = "";
        if (str2 != null && !str2.equals(str3)) {
            String str4 = " and (";
            if (!(list == null || list.size() == 0)) {
                for (String str5 : list) {
                    str4 = str4 + "username = '" + str5 + "' or ";
                }
            }
            str3 = (((((((str4 + "conRemark like '%" + str2 + "%' or ") + "conRemarkPYFull like '%" + str2 + "%' or ") + "conRemarkPYShort like '%" + str2 + "%' or ") + "alias like '%" + str2 + "%' or ") + "username like '%" + str2 + "%' or ") + "nickname like '%" + str2 + "%' or ") + "pyInitial like '%" + str2 + "%' or ") + "quanPin like '%" + str2 + "%' )";
        }
        sb.append(str3);
        sb.append(" order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ");
        String sb4 = sb.toString();
        Log.m105924i("MicroMsg.ContactStorage", sb4);
        return this.f121069c.rawQuery(sb4, (String[]) null);
    }

    /* renamed from: m3 */
    public String mo69713m3(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        return (((((((" and (" + "conRemark like '%" + str + "%' or ") + "conRemarkPYFull like '%" + str + "%' or ") + "conRemarkPYShort like '%" + str + "%' or ") + "alias like '%" + str + "%' or ") + "username like '%" + str + "%' or ") + "nickname like '%" + str + "%' or ") + "pyInitial like '%" + str + "%' or ") + "quanPin like '%" + str + "%' )";
    }

    /* renamed from: m4 */
    public Cursor mo69714m4() {
        return this.f121069c.rawQuery("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact  where rowid = -1", (String[]) null);
    }

    /* renamed from: n3 */
    public long mo69715n3(String str) {
        C72996z1 z1Var = get(str);
        if (z1Var != null) {
            long j = z1Var.f108320R1;
            if (j > 0) {
                return (long) ((int) j);
            }
        }
        return -1;
    }

    /* renamed from: n4 */
    public int mo69716n4(String str, byte[] bArr) {
        int i = -1;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ContactStorage", "getCmdbuf failed user is null");
            return -1;
        }
        C30720a2 a2Var = new C30720a2();
        a2Var.field_cmdbuf = bArr;
        a2Var.field_username = str;
        int replace = (int) ((C91753f) this.f121069c).replace("ContactCmdBuf", "username", a2Var.convertTo());
        Object[] objArr = new Object[3];
        objArr[0] = str;
        if (bArr != null) {
            i = bArr.length;
        }
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(replace);
        Log.m105919d("MicroMsg.ContactStorage", "setCmdbuf user:%s buf:%d result:%d", objArr);
        return replace;
    }

    public boolean needNotifyExtension() {
        return true;
    }

    /* renamed from: o3 */
    public String mo69717o3(List<String> list, boolean z) {
        return (m49136e(false, z) + " AND " + f121068j) + mo69685b(list);
    }

    /* renamed from: o4 */
    public int mo69718o4(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ContactStorage", "delCmdBuf failed user is null");
            return -1;
        }
        ISQLiteDatabase iSQLiteDatabase = this.f121069c;
        int delete = ((C91753f) iSQLiteDatabase).delete("ContactCmdBuf", "username=?", new String[]{"" + str});
        Log.m105919d("MicroMsg.ContactStorage", "delCmdBuf user:%s ret:%d", str, Integer.valueOf(delete));
        return delete;
    }

    /* renamed from: p3 */
    public int mo69719p3(String str, C72996z1 z1Var) {
        Log.m105925i("MicroMsg.ContactStorage", "begin to update contact :%s, usernameFlag=%d", str, Long.valueOf(z1Var.mo73952D2()));
        if (!mo69660K(z1Var)) {
            return 1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (C72996z1.m85811N4(str)) {
            str = C72996z1.m85829Z5(str);
        }
        z1Var.mo62886Y2(z1Var.mo62901g3());
        z1Var.mo62923p4(z1Var.mo62905h3());
        this.f121072f.mo69732J1(this, z1Var);
        int K4 = this.f121072f.mo69733K4(z1Var, true);
        if (K4 < 0) {
            ContentValues convertTo = z1Var.convertTo();
            long j = z1Var.f108320R1;
            if (((int) j) > 0) {
                convertTo.put("rowid", Integer.valueOf((int) j));
            }
            if (convertTo.size() > 0) {
                ISQLiteDatabase iSQLiteDatabase = this.f121069c;
                String H = m49133H(str);
                K4 = ((C91753f) iSQLiteDatabase).update(H, convertTo, "username=?", new String[]{"" + str});
            }
        }
        Log.m105925i("MicroMsg.ContactStorage", "[update] ret=%s username=%s, showHead=%d, verifyFlag=%d, type=%d, usernameFlag=%d, take[%d]ms", Integer.valueOf(K4), z1Var.getUsername(), Integer.valueOf(z1Var.mo62845A2()), Integer.valueOf(z1Var.mo73953E2()), Integer.valueOf(z1Var.getType()), Long.valueOf(z1Var.mo73952D2()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        mo69653F1(str);
        if (!Util.isNullOrNil(z1Var.mo73978v2())) {
            mo69653F1(z1Var.mo73978v2());
        }
        if (K4 != 0) {
            doNotify(4, this, z1Var.getUsername(), z1Var);
        }
        return K4;
    }

    /* renamed from: p4 */
    public int mo69720p4() {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
        Cursor rawQuery = this.f121069c.rawQuery("select count(1) from (select verifyFlag from rcontact where type & 1 !=0 and type & 32 =0 and type & 8 =0  )", (String[]) null, 2);
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            i = 0;
        } else {
            i = rawQuery.getInt(0);
            rawQuery.close();
        }
        Log.m105925i("MicroMsg.ContactStorage", "getNormalContactAndHelperCount, sql:%s, result:%d, time:%d", "select count(1) from (select verifyFlag from rcontact where type & 1 !=0 and type & 32 =0 and type & 8 =0  )", Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return i;
    }

    public void processEventForExtensionOnDemand(MStorageEx.Event event) {
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C44668u3.C30780c.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            ((C44668u3.C30780c) ((C38174i) bVar.next()).get()).onNotifyChange(event.event, this, event.obj);
        }
    }

    /* renamed from: q3 */
    public Cursor mo69721q3(String str, String str2, List<String> list, List<String> list2, boolean z, boolean z2) {
        String str3 = "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact " + mo69649B3(str, str2, list) + mo69703i(list2) + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
        Log.m105926v("MicroMsg.ContactStorage", str3);
        if (!z) {
            return this.f121069c.rawQuery(str3, (String[]) null);
        }
        String str4 = "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact " + mo69717o3(list, z2) + mo69673V3();
        Log.m105926v("MicroMsg.ContactStorage", "favourSql " + str3);
        return new MergeCursor(new Cursor[]{this.f121069c.rawQuery(str4, (String[]) null), this.f121069c.rawQuery(str3, (String[]) null)});
    }

    /* renamed from: q4 */
    public List<String> mo69722q4() {
        Cursor rawQuery = this.f121069c.rawQuery(" select openImAppid from rcontact" + m49131F() + " group by openImAppid ", (String[]) null, 4);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            String string = rawQuery.getString(0);
            if (!Util.isNullOrNil(string)) {
                arrayList.add("'" + string + "'");
            }
        }
        rawQuery.close();
        LinkedList linkedList = new LinkedList();
        if (arrayList.size() > 0) {
            Cursor rawQuery2 = this.f121069c.rawQuery(" select acctTypeId from OpenIMAppIdInfo where appid in (" + Util.listToString(arrayList, ",") + ") group by acctTypeId", (String[]) null, 4);
            if (rawQuery2.moveToFirst()) {
                do {
                    String string2 = rawQuery2.getString(0);
                    if (!Util.isNullOrNil(string2)) {
                        linkedList.add(string2);
                    }
                } while (rawQuery2.moveToNext());
            }
            rawQuery2.close();
        }
        return linkedList;
    }

    /* renamed from: r3 */
    public int[] mo69723r3(String[] strArr, String str, String str2, String str3, List<String> list) {
        String str4 = "select distinct showHead from rcontact " + mo69649B3(str, str2, list) + mo69658J(strArr) + mo69713m3(str3) + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
        long currentTimeMillis = System.currentTimeMillis();
        Cursor rawQuery = this.f121069c.rawQuery(str4, (String[]) null);
        Log.m105918d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getShowSectionByShowHead db.rawQuery : " + (System.currentTimeMillis() - currentTimeMillis));
        long currentTimeMillis2 = System.currentTimeMillis();
        int count = rawQuery.getCount() >= 0 ? rawQuery.getCount() : 0;
        Log.m105918d("MicroMsg.ContactStorage", "kevin MMCore.getAccStg().getContactStg().getShowSectionByShowHead cu.getCount() : " + (System.currentTimeMillis() - currentTimeMillis2));
        int[] iArr = new int[count];
        if (rawQuery.getCount() > 0) {
            for (int i = 0; i < count; i++) {
                rawQuery.moveToPosition(i);
                iArr[i] = rawQuery.getInt(0);
            }
        }
        rawQuery.close();
        return iArr;
    }

    /* renamed from: s3 */
    public boolean mo69724s3(String str) {
        if (!Util.isNullOrNil(str) && (!str.contains("@") || str.endsWith("@stranger"))) {
            Integer num = (Integer) ((C101062d) this.f121071e).get(str);
            if (num != null) {
                return (num.intValue() & 1) != 0;
            }
            C72996z1 z1Var = get(str);
            if (z1Var == null || (!z1Var.getUsername().equals(str) && !str.equals(z1Var.mo73978v2()))) {
                ((C101062d) this.f121071e).mo139557c(str, 0);
            } else {
                ((C101062d) this.f121071e).mo139557c(str, Integer.valueOf(z1Var.getType()));
                return (z1Var.getType() & 1) != 0;
            }
        }
        return false;
    }

    public boolean shouldProcessEvent() {
        ISQLiteDatabase iSQLiteDatabase = this.f121069c;
        if (iSQLiteDatabase != null && !((C91753f) iSQLiteDatabase).isClose()) {
            return true;
        }
        Object[] objArr = new Object[1];
        ISQLiteDatabase iSQLiteDatabase2 = this.f121069c;
        objArr[0] = iSQLiteDatabase2 == null ? "null" : Boolean.valueOf(((C91753f) iSQLiteDatabase2).isClose());
        Log.m105929w("MicroMsg.ContactStorage", "shouldProcessEvent db is close :%s", objArr);
        return false;
    }

    /* renamed from: t3 */
    public Cursor mo69725t3(String str, String str2, List<String> list, boolean z, boolean z2) {
        return mo69721q3(str, str2, list, (List<String>) null, z, z2);
    }

    /* renamed from: u3 */
    public void mo69726u3(C72996z1 z1Var, boolean z) {
        if (z1Var != null && z1Var.getUsername() != null) {
            if (z1Var.getType() != 0 || z) {
                ((C101062d) this.f121070d).mo139557c(z1Var.getUsername(), z1Var);
                ((C101062d) this.f121071e).mo139557c(z1Var.getUsername(), Integer.valueOf(z1Var.getType()));
            }
        }
    }

    /* renamed from: v3 */
    public Cursor mo69727v3(String str, String str2, List<String> list, List<String> list2, boolean z, boolean z2) {
        String str3 = "select username from rcontact " + mo69649B3(str, str2, list) + mo69703i(list2) + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
        Log.m105926v("MicroMsg.ContactStorage", str3);
        if (!z) {
            return this.f121069c.rawQuery(str3, (String[]) null);
        }
        C112793f[] fVarArr = new C112793f[2];
        Log.m105926v("MicroMsg.ContactStorage", "favourSql " + str3);
        Cursor rawQuery = this.f121069c.rawQuery("select username from rcontact " + mo69717o3(list, z2) + mo69673V3(), (String[]) null, 4);
        Cursor rawQuery2 = this.f121069c.rawQuery(str3, (String[]) null, 4);
        if (!(rawQuery instanceof C112793f) || !(rawQuery2 instanceof C112793f)) {
            return C79331c.m96022a();
        }
        fVarArr[0] = (C112793f) rawQuery;
        fVarArr[1] = (C112793f) rawQuery2;
        return new C67048e(fVarArr);
    }

    /* renamed from: w3 */
    public Cursor mo69728w3() {
        StringBuilder sb = new StringBuilder();
        sb.append("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact  where ");
        sb.append(f121068j);
        sb.append(" and ");
        sb.append("verifyFlag");
        sb.append(" & ");
        int i = C72996z1.f214113Y1;
        sb.append(8);
        sb.append(" !=0 ");
        String sb4 = sb.toString();
        Log.m105926v("MicroMsg.ContactStorage", "dkbf:" + sb4);
        return this.f121069c.rawQuery(sb4, (String[]) null);
    }

    /* renamed from: x3 */
    public int mo69729x3(String[] strArr, String... strArr2) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("select count(username) from ");
        sb.append("rcontact");
        sb.append(" where ");
        sb.append("type");
        sb.append(" & ");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
        sb.append(1);
        sb.append(" !=0 and ");
        sb.append("type");
        sb.append(" & ");
        sb.append(32);
        sb.append(" =0 and ");
        sb.append("type");
        sb.append(" & ");
        sb.append(8);
        sb.append(" =0 and ");
        sb.append("verifyFlag");
        sb.append(" & ");
        sb.append(8);
        sb.append(" = 0");
        sb.append(C45628s0.m50768d("username", new String[]{"@chatroom", "@im.chatroom"}, new String[0]));
        if (strArr != null && strArr.length > 0) {
            for (String append : strArr) {
                sb.append(" and ");
                sb.append("rcontact");
                sb.append(".");
                sb.append("username");
                sb.append(" != '");
                sb.append(append);
                sb.append("'");
            }
        }
        if (strArr2 != null && strArr2.length > 0) {
            for (String append2 : strArr2) {
                sb.append(" and ");
                sb.append("rcontact");
                sb.append(".");
                sb.append("username");
                sb.append(" != '");
                sb.append(append2);
                sb.append("'");
            }
        }
        String sb4 = sb.toString();
        Cursor rawQuery = this.f121069c.rawQuery(sb4, (String[]) null, 2);
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            i = 0;
        } else {
            i = rawQuery.getInt(0);
            rawQuery.close();
        }
        Log.m105927v("MicroMsg.ContactStorage", "getChatroomContactCount, sql:%s, result:%d", sb4, Integer.valueOf(i));
        return i;
    }

    /* renamed from: y3 */
    public C72996z1 mo69730y3(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C72996z1 z1Var = this.f121072f.get(str);
        if (z1Var != null) {
            mo69726u3(z1Var, false);
            return z1Var;
        }
        C72996z1 z1Var2 = new C72996z1();
        Cursor rawQuery = this.f121069c.rawQuery("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact where alias=" + C91753f.m115264e(str), (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            z1Var2.convertFrom(rawQuery);
            mo69726u3(z1Var2, false);
        }
        rawQuery.close();
        z1Var2.mo101232a6();
        return z1Var2;
    }

    /* renamed from: z3 */
    public Cursor mo69731z3(List<String> list) {
        return this.f121069c.rawQuery("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact where (" + f121068j + ") and (" + mo69706j(list) + ")" + mo69673V3() + " and (" + "username" + " like  '%@openim' )", (String[]) null);
    }
}
