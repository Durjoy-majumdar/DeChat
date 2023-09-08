package eb0;

import android.database.Cursor;
import com.tencent.p014mm.contact.C40294d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.storage.C30783v3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: eb0.q4 */
public class C45625q4 {

    /* renamed from: a */
    public ISQLiteDatabase f123392a;

    public C45625q4(ISQLiteDatabase iSQLiteDatabase, C30783v3 v3Var) {
        this.f123392a = iSQLiteDatabase;
    }

    /* renamed from: a */
    public Cursor mo71147a(String str, List<String> list, String str2) {
        String str3;
        String str4 = str2;
        String str5 = "select " + "1" + "," + "unReadCount" + ", " + "status" + ", " + "isSend" + ", " + "conversationTime" + ", " + "rconversation" + "." + "username" + ", " + "content" + ", " + "rconversation" + "." + "msgType" + ", " + "rconversation" + "." + "flag" + ", " + "rcontact" + "." + "nickname" + " from " + "rconversation" + "," + "rcontact" + " " + " where " + "rconversation" + "." + "username" + " = " + "rcontact" + "." + "username" + ((str4 == null || str2.length() <= 0) ? " " : " and rconversation.username = rcontact.username ") + Util.nullAsNil(str);
        String str6 = "";
        if (list == null || list.size() <= 0) {
            str3 = str6;
        } else {
            str3 = str6;
            for (String str7 : list) {
                str3 = str3 + " and " + "rconversation" + "." + "username" + " != '" + str7 + "'";
            }
        }
        String str8 = str5 + str3;
        if (str4 != null && str2.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str8);
            ArrayList arrayList = new ArrayList();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("select username from rcontact where (username like '%");
            sb4.append(str4);
            sb4.append("%' or ");
            sb4.append("nickname");
            sb4.append(" like '%");
            sb4.append(str4);
            sb4.append("%' or ");
            StringBuilder sb5 = sb;
            sb4.append("alias");
            sb4.append(" like '%");
            sb4.append(str4);
            sb4.append("%' or ");
            String str9 = "alias";
            sb4.append("pyInitial");
            sb4.append(" like '%");
            sb4.append(str4);
            sb4.append("%' or ");
            String str10 = "pyInitial";
            sb4.append("quanPin");
            sb4.append(" like '%");
            sb4.append(str4);
            sb4.append("%' or ");
            String str11 = "quanPin";
            sb4.append("conRemark");
            sb4.append(" like '%");
            sb4.append(str4);
            String str12 = "conRemark";
            sb4.append("%' )and ");
            sb4.append("username");
            sb4.append(" not like '%@%' and ");
            sb4.append("type");
            sb4.append(" & ");
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
            sb4.append(32);
            sb4.append("=0 ");
            String sb6 = sb4.toString();
            String str13 = "nickname";
            Cursor rawQuery = this.f123392a.rawQuery(sb6, (String[]) null, 2);
            Log.m105927v("Micro.SimpleSearchConversationModel", "contactsql %s", sb6);
            while (rawQuery.moveToNext()) {
                String string = rawQuery.getString(rawQuery.getColumnIndex("username"));
                if (!string.endsWith("@chatroom")) {
                    arrayList.add(string);
                }
            }
            rawQuery.close();
            if (arrayList.size() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(" ( rconversation.username in ( select chatroomname from chatroom where ");
                stringBuffer.append("memberlist like '%" + str4 + "%'");
                for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                    stringBuffer.append(" or memberlist like '%" + ((String) it.next()) + "%'");
                }
                stringBuffer.append("))");
                str6 = str6 + stringBuffer.toString() + " or ";
            }
            StringBuilder sb7 = sb5;
            sb7.append(" and ( " + "rconversation" + "." + "username" + " like '%" + str4 + "%' or " + str6 + "rconversation" + "." + "content" + " like '%" + str4 + "%' or " + "rcontact" + "." + str13 + " like '%" + str4 + "%' or " + "rcontact" + "." + str9 + " like '%" + str4 + "%' or " + "rcontact" + "." + str10 + " like '%" + str4 + "%' or " + "rcontact" + "." + str11 + " like '%" + str4 + "%' or " + "rcontact" + "." + str12 + " like '%" + str4 + "%'  ) ");
            str8 = sb7.toString();
        }
        String str14 = ((str8 + " order by ") + "rconversation" + "." + "username" + " like '%" + "@chatroom" + "' asc, ") + "flag desc, conversationTime desc";
        Log.m105927v("Micro.SimpleSearchConversationModel", "convsql %s", str14);
        return this.f123392a.rawQuery(str14, (String[]) null);
    }
}
