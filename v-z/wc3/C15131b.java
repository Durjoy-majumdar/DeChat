package wc3;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.provider.ContactsContract;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p447aw.C103918d;

/* renamed from: wc3.b */
public final class C15131b {
    /* renamed from: a */
    public static String m14237a(String str) {
        String trim = str.trim();
        boolean startsWith = trim.startsWith("+");
        if (startsWith && trim.length() > 1) {
            trim = trim.substring(1, trim.length());
        }
        Matcher matcher = Pattern.compile("[^0-9]").matcher(trim);
        if (!startsWith) {
            return matcher.replaceAll("").trim();
        }
        return "+" + matcher.replaceAll("").trim();
    }

    /* renamed from: b */
    public static Bitmap m14238b(String str, Context context, boolean z) {
        if (str != null && !str.equals("")) {
            try {
                InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(context.getContentResolver(), ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Util.safeParseLong(str)), z);
                if (openContactPhotoInputStream == null) {
                    return null;
                }
                Bitmap decodeStream = BitmapUtil.decodeStream(openContactPhotoInputStream);
                return decodeStream != null ? BitmapUtil.getRoundedCornerBitmap(decodeStream, true, 4.0f) : decodeStream;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AddressBookUtil", e, "getAvatar, contactId:%s", str);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m14239c(String str, Context context) {
        Cursor cursor;
        String str2 = "";
        if (!((C103918d) C86312j.m106911c(C103918d.class)).Un0(context, "android.permission.READ_CONTACTS", false)) {
            Log.m105920e("MicroMsg.AddressBookUtil", "no contact permission");
            return str2;
        }
        try {
            cursor = context.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"display_name"}, "_id = ?", new String[]{str}, (String) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AddressBookUtil", e, "getContactNameById:", new Object[0]);
            cursor = null;
        }
        if (cursor == null) {
            return str2;
        }
        if (cursor.moveToFirst()) {
            str2 = cursor.getString(0);
        }
        cursor.close();
        return str2;
    }

    /* renamed from: d */
    public static List<String[]> m14240d(Context context) {
        LinkedList linkedList = new LinkedList();
        ContentResolver contentResolver = context.getContentResolver();
        if (!((C103918d) C86312j.m106911c(C103918d.class)).Un0(context, "android.permission.READ_CONTACTS", false)) {
            Log.m105920e("MicroMsg.AddressBookUtil", "no contact permission");
            return linkedList;
        }
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, (String[]) null, (String) null, (String[]) null, (String) null);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AddressBookUtil", "getMobileInfo: exception occured [%s]", e.getMessage());
            Log.printErrStackTrace("MicroMsg.AddressBookUtil", e, "", new Object[0]);
        }
        if (cursor == null) {
            Log.m105920e("MicroMsg.AddressBookUtil", "getMobileInfo: mobile is null");
            return linkedList;
        }
        try {
            if (cursor.getCount() > 0 && cursor.moveToFirst()) {
                do {
                    String string = cursor.getString(cursor.getColumnIndex("display_name"));
                    String string2 = cursor.getString(cursor.getColumnIndex("contact_id"));
                    String string3 = cursor.getString(cursor.getColumnIndex("data1"));
                    String string4 = cursor.getString(cursor.getColumnIndex("raw_contact_id"));
                    Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndex("photo_id")));
                    linkedList.add(new String[]{string2, string, string3, string4, "" + valueOf});
                } while (cursor.moveToNext());
            }
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.AddressBookUtil", "getMobileInfo: exception2 occured [%s]", e2.getMessage());
            Log.printErrStackTrace("MicroMsg.AddressBookUtil", e2, "", new Object[0]);
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
        cursor.close();
        return linkedList;
    }

    /* renamed from: e */
    public static List<String[]> m14241e(Context context) {
        Cursor cursor;
        LinkedList linkedList = new LinkedList();
        ContentResolver contentResolver = context.getContentResolver();
        if (!((C103918d) C86312j.m106911c(C103918d.class)).Un0(context, "android.permission.READ_CONTACTS", false)) {
            Log.m105920e("MicroMsg.AddressBookUtil", "no contact permission");
            return linkedList;
        }
        try {
            cursor = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, (String[]) null, (String) null, (String[]) null, "sort_key_alt");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AddressBookUtil", e, "", new Object[0]);
            Log.m105921e("MicroMsg.AddressBookUtil", "exception in getMoblieOrderInfo(), [%s]", e.getMessage());
            cursor = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, (String[]) null, (String) null, (String[]) null, (String) null);
        }
        if (cursor == null) {
            Log.m105920e("MicroMsg.AddressBookUtil", "getMobileInfo: mobile is null");
            return linkedList;
        }
        try {
            if (cursor.getCount() > 0 && cursor.moveToFirst()) {
                do {
                    String string = cursor.getString(cursor.getColumnIndex("display_name"));
                    linkedList.add(new String[]{cursor.getString(cursor.getColumnIndex("contact_id")), string, cursor.getString(cursor.getColumnIndex("data1")), cursor.getString(cursor.getColumnIndex("raw_contact_id"))});
                } while (cursor.moveToNext());
            }
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.AddressBookUtil", e2, "", new Object[0]);
            Log.m105921e("MicroMsg.AddressBookUtil", "exception in getMoblieOrderInfo()2, [%s]", e2.getMessage());
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
        cursor.close();
        return linkedList;
    }
}
