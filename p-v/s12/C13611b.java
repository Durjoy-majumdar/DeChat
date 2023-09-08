package s12;

import android.database.Cursor;
import android.provider.ContactsContract;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p447aw.C103918d;
import sf0.C77691f;
import t12.C13818a;

/* renamed from: s12.b */
public class C13611b {

    /* renamed from: a */
    public static final String f38573a = new String(Character.toChars(91));

    /* renamed from: b */
    public static HashMap<String, C13612c> f38574b = new HashMap<>();

    /* renamed from: a */
    public static C13612c m12911a(Cursor cursor, int i, int i2, int i3) {
        String str = null;
        if (!((C103918d) C86312j.m106911c(C103918d.class)).Lb0(MMApplicationContext.getContext(), "android.permission.READ_CONTACTS")) {
            Log.m105920e("MicroMsg.IPCallAddressBookInfoExtracter", "no contact permission");
            return null;
        }
        C13612c cVar = new C13612c();
        cVar.f38576t = new ArrayList<>();
        String string = cursor.getString(i);
        String string2 = cursor.getString(i2);
        String string3 = cursor.getString(i3);
        cVar.field_contactId = string;
        cVar.field_systemAddressBookUsername = string2;
        if (!Util.isNullOrNil(string3) && !cVar.f38576t.contains(string3)) {
            cVar.f38576t.add(string3);
        }
        if (Util.isNullOrNil(cVar.field_systemAddressBookUsername) && cVar.f38576t.size() > 0) {
            cVar.field_systemAddressBookUsername = cVar.f38576t.get(0);
        }
        Iterator<String> it = cVar.f38576t.iterator();
        String str2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String k = C13818a.m13115k(it.next());
            if (!Util.isNullOrNil(k)) {
                if (!k.endsWith("@stranger")) {
                    str2 = k;
                    break;
                }
                str2 = k;
            }
        }
        if (!Util.isNullOrNil(str2)) {
            cVar.field_wechatUsername = str2;
        }
        if (!Util.isNullOrNil(cVar.field_systemAddressBookUsername)) {
            try {
                str = C77691f.m93686a(cVar.field_systemAddressBookUsername);
            } catch (Exception e) {
                Log.m105919d("MicroMsg.IPCallAddressBookInfoExtracter", "getFullSpell error: %s, class: %s", e.getMessage(), e.getClass().getSimpleName());
            }
            if (Util.isNullOrNil(str)) {
                cVar.field_sortKey = "";
            } else if (!Character.isLetter(str.charAt(0))) {
                cVar.field_sortKey = f38573a + str.toUpperCase();
            } else {
                cVar.field_sortKey = str.toUpperCase();
            }
        } else {
            cVar.field_sortKey = "";
        }
        return cVar;
    }

    /* renamed from: b */
    public static ArrayList<C13612c> m12912b() {
        ArrayList<String> arrayList;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<C13612c> arrayList2 = new ArrayList<>();
        if (!((C103918d) C86312j.m106911c(C103918d.class)).Lb0(MMApplicationContext.getContext(), "android.permission.READ_CONTACTS")) {
            Log.m105920e("MicroMsg.IPCallAddressBookInfoExtracter", "no contact permission");
            return arrayList2;
        }
        Cursor query = MMApplicationContext.getContext().getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "display_name", "data1"}, "mimetype='vnd.android.cursor.item/phone_v2'", (String[]) null, (String) null);
        HashMap<String, C13612c> hashMap = new HashMap<>();
        Log.m105918d("MicroMsg.IPCallAddressBookInfoExtracter", "query FromSystemPhoneBook, time: " + (System.currentTimeMillis() - currentTimeMillis));
        if (query == null) {
            return arrayList2;
        }
        try {
            Log.m105919d("MicroMsg.IPCallAddressBookInfoExtracter", "getAllAddressItemFromSystemPhoneBook, count: %d", Integer.valueOf(query.getCount()));
            if (query.moveToFirst()) {
                int columnIndex = query.getColumnIndex("contact_id");
                int columnIndex2 = query.getColumnIndex("display_name");
                int columnIndex3 = query.getColumnIndex("data1");
                while (!query.isAfterLast()) {
                    C13612c a = m12911a(query, columnIndex, columnIndex2, columnIndex3);
                    if (a != null && (arrayList = a.f38576t) != null && arrayList.size() > 0 && !Util.isNullOrNil(a.field_contactId)) {
                        if (hashMap.containsKey(a.field_contactId)) {
                            C13612c cVar = hashMap.get(a.field_contactId);
                            if (a.f38576t.size() > 0 && !cVar.f38576t.contains(a.f38576t.get(0))) {
                                cVar.f38576t.add(a.f38576t.get(0));
                            }
                        } else {
                            hashMap.put(a.field_contactId, a);
                        }
                    }
                    query.moveToNext();
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.IPCallAddressBookInfoExtracter", "getAllAddressItemFromSystemPhoneBook error: %s, class: %s", e.getMessage(), e.getClass().getSimpleName());
        } catch (Throwable th) {
            query.close();
            throw th;
        }
        query.close();
        arrayList2.addAll(hashMap.values());
        f38574b = hashMap;
        Log.m105919d("MicroMsg.IPCallAddressBookInfoExtracter", "getAllAddressItemFromSystemPhoneBook, result size: %d, used %dms", Integer.valueOf(arrayList2.size()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return arrayList2;
    }
}
