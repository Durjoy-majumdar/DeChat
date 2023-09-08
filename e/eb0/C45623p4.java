package eb0;

import android.database.Cursor;
import android.database.MergeCursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: eb0.p4 */
public class C45623p4 {

    /* renamed from: a */
    public ISQLiteDatabase f123389a;

    /* renamed from: b */
    public C44668u3 f123390b;

    public C45623p4(ISQLiteDatabase iSQLiteDatabase, C44668u3 u3Var) {
        this.f123389a = iSQLiteDatabase;
        this.f123390b = u3Var;
    }

    /* renamed from: a */
    public Cursor mo71144a(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact ");
        sb.append(this.f123390b.mo69649B3("@all.contact.android", "", list));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" and (username in (");
        stringBuffer.append("select chatroomname from chatroom where ");
        if (!(arrayList2 == null || arrayList2.size() == 0)) {
            Iterator<String> it = arrayList2.iterator();
            while (it.hasNext()) {
                stringBuffer.append("chatroomname != '" + it.next() + "' and ");
            }
        }
        stringBuffer.append("(memberlist like '%" + str + "%'");
        Iterator<String> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            stringBuffer.append(" or memberlist like '%" + it4.next() + "%'");
        }
        if (!(arrayList3 == null || arrayList3.size() == 0)) {
            Iterator<String> it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                stringBuffer.append(" or chatroomname = '" + it5.next() + "'");
            }
        }
        stringBuffer.append(")))");
        sb.append(stringBuffer.toString());
        sb.append(this.f123390b.mo69655G3());
        String sb4 = sb.toString();
        Log.m105926v("Micro.SimpleSearchConversationModel", "roomsSql " + sb4);
        return this.f123389a.rawQuery(sb4, (String[]) null);
    }

    /* renamed from: b */
    public Cursor mo71145b(String str, String str2, String str3, List<String> list, boolean z, boolean z2, boolean z3) {
        return mo71146c(str, str2, str3, list, z, z2, z3, 1, (List<String>) null);
    }

    /* renamed from: c */
    public final Cursor mo71146c(String str, String str2, String str3, List<String> list, boolean z, boolean z2, boolean z3, int i, List<String> list2) {
        String str4 = str;
        List<String> list3 = list;
        List<String> list4 = list2;
        String str5 = i == 2 ? "select 2, *,rowid from rcontact " : "select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact ";
        StringBuilder sb = new StringBuilder();
        sb.append(str5);
        String str6 = str2;
        sb.append(this.f123390b.mo69649B3(str2, str3, list3));
        sb.append(this.f123390b.mo69713m3(str));
        sb.append(this.f123390b.mo69655G3());
        String sb4 = sb.toString();
        Log.m105926v("Micro.SimpleSearchConversationModel", sb4);
        Cursor rawQuery = this.f123389a.rawQuery(sb4, (String[]) null);
        if (z) {
            String str7 = str5 + this.f123390b.mo69717o3(list3, z2) + this.f123390b.mo69713m3(str) + this.f123390b.mo69673V3();
            Log.m105926v("Micro.SimpleSearchConversationModel", "favourSql " + str7);
            rawQuery = new MergeCursor(new Cursor[]{rawQuery, this.f123389a.rawQuery(str7, (String[]) null)});
        }
        Cursor cursor = rawQuery;
        if (!z3) {
            return cursor;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndex("username"));
            if (!C72996z1.m85820U5(string)) {
                arrayList.add(string);
            } else {
                arrayList2.add(string);
            }
        }
        if (!(list4 == null || list2.size() == 0)) {
            arrayList.addAll(list4);
        }
        if (arrayList.size() == 0) {
            return cursor;
        }
        return new MergeCursor(new Cursor[]{cursor, mo71144a(str, arrayList, arrayList2, (ArrayList<String>) null, list)});
    }
}
