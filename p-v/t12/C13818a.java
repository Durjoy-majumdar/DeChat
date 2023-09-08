package t12;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.provider.ContactsContract;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.CheckCanSyncAddrBookEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import dg0.C75398e;
import di3.C86312j;
import hg0.C76166a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import p447aw.C103918d;
import p823sg.C90193h;
import wc3.C15131b;

/* renamed from: t12.a */
public class C13818a {

    /* renamed from: a */
    public static PhoneFormater f38950a = new PhoneFormater();

    /* renamed from: b */
    public static HashMap<String, C13821b> f38951b = new HashMap<>();

    /* renamed from: c */
    public static HashMap<String, String> f38952c = new HashMap<>();

    /* renamed from: d */
    public static HashMap<String, String> f38953d = new HashMap<>();

    /* renamed from: e */
    public static HashMap<String, String> f38954e = new HashMap<>();

    /* renamed from: f */
    public static HashMap<String, String> f38955f = new HashMap<>();

    /* renamed from: t12.a$b */
    public static class C13820b implements Comparator<String> {
        public C13820b(C13819a aVar) {
        }

        public int compare(Object obj, Object obj2) {
            return ((String) obj).length() - ((String) obj2).length();
        }
    }

    /* renamed from: a */
    public static boolean m13105a() {
        CheckCanSyncAddrBookEvent checkCanSyncAddrBookEvent = new CheckCanSyncAddrBookEvent();
        checkCanSyncAddrBookEvent.publish();
        Log.m105919d("MicroMsg.IPCallAddressUtil", "canSyncAddrBook: %b", Boolean.valueOf(checkCanSyncAddrBookEvent.f9042d.f9043a));
        return checkCanSyncAddrBookEvent.f9042d.f9043a;
    }

    /* renamed from: b */
    public static String m13106b(String str) {
        if (f38952c.size() == 0) {
            m13116l();
        }
        if (m13118n(str)) {
            String j = C110899d.m151196j(m13120p(str));
            ArrayList arrayList = new ArrayList(f38952c.keySet());
            Collections.sort(arrayList, Collections.reverseOrder(new C13820b((C13819a) null)));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (j.startsWith(str2)) {
                    return str2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m13107c(String str) {
        if (f38952c.size() == 0) {
            m13116l();
        }
        if (!m13118n(str)) {
            return str;
        }
        String j = C110899d.m151196j(m13120p(str));
        ArrayList arrayList = new ArrayList(f38952c.keySet());
        Collections.sort(arrayList, Collections.reverseOrder(new C13820b((C13819a) null)));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (j.startsWith(str2)) {
                return j.substring(str2.length());
            }
        }
        return j;
    }

    /* renamed from: d */
    public static String m13108d(String str) {
        String str2;
        String j = C110899d.m151196j(str);
        String j2 = C110899d.m151196j(j);
        String b = m13118n(j2) ? m13106b(j2) : null;
        if (!Util.isNullOrNil(b)) {
            String substring = m13120p(j2).substring(b.length());
            String formatNumber = f38950a.formatNumber(b, substring);
            if (!Util.isNullOrNil(formatNumber)) {
                substring = formatNumber;
            }
            if (!substring.startsWith("+")) {
                str2 = "+" + b + " " + substring;
            } else {
                str2 = "+" + b + " " + substring.replace("+", "");
            }
        } else {
            str2 = PhoneFormater.formatMobileString(j);
        }
        if (str2.length() <= 25) {
            return str2;
        }
        return str2.substring(0, 25) + "...";
    }

    /* renamed from: e */
    public static Bitmap m13109e(Context context, String str, boolean z) {
        if (!Util.isNullOrNil(str)) {
            return C15131b.m14238b(str, context, z);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (r9 != null) goto L_0x0066;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m13110f(android.content.Context r9, java.lang.String r10) {
        /*
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            aw.d r0 = (p447aw.C103918d) r0
            java.lang.String r1 = "android.permission.READ_CONTACTS"
            boolean r0 = r0.Lb0(r9, r1)
            java.lang.String r1 = "MicroMsg.IPCallAddressUtil"
            r2 = 0
            if (r0 != 0) goto L_0x0019
            java.lang.String r9 = "no contact permission"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r9)
            return r2
        L_0x0019:
            android.content.ContentResolver r3 = r9.getContentResolver()
            android.net.Uri r4 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            java.lang.String r9 = "contact_id"
            java.lang.String r0 = "data1"
            java.lang.String[] r5 = new java.lang.String[]{r9, r0}
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)
            if (r9 == 0) goto L_0x006e
            r0 = 0
            r3 = 1
            boolean r4 = r9.moveToFirst()     // Catch:{ Exception -> 0x0058 }
            if (r4 == 0) goto L_0x006e
        L_0x0038:
            boolean r4 = r9.isAfterLast()     // Catch:{ Exception -> 0x0058 }
            if (r4 != 0) goto L_0x006e
            java.lang.String r4 = wc3.C15131b.m14237a(r10)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r5 = r9.getString(r3)     // Catch:{ Exception -> 0x0058 }
            boolean r4 = android.telephony.PhoneNumberUtils.compare(r4, r5)     // Catch:{ Exception -> 0x0058 }
            if (r4 == 0) goto L_0x0052
            java.lang.String r10 = r9.getString(r0)     // Catch:{ Exception -> 0x0058 }
            r2 = r10
            goto L_0x006e
        L_0x0052:
            r9.moveToNext()     // Catch:{ Exception -> 0x0058 }
            goto L_0x0038
        L_0x0056:
            r10 = move-exception
            goto L_0x006a
        L_0x0058:
            r10 = move-exception
            java.lang.String r4 = "getNicknameByPhonenumber, error: %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0056 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x0056 }
            r3[r0] = r10     // Catch:{ all -> 0x0056 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r4, r3)     // Catch:{ all -> 0x0056 }
        L_0x0066:
            r9.close()
            goto L_0x0071
        L_0x006a:
            r9.close()
            throw r10
        L_0x006e:
            if (r9 == 0) goto L_0x0071
            goto L_0x0066
        L_0x0071:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t12.C13818a.m13110f(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: g */
    public static String m13111g(String str) {
        if (f38952c.size() == 0) {
            m13116l();
        }
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return f38952c.get(str);
    }

    /* renamed from: h */
    public static String m13112h(String str) {
        if (f38954e.size() == 0) {
            m13116l();
        }
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return f38954e.get(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m13113i() {
        /*
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f38953d
            int r0 = r0.size()
            if (r0 != 0) goto L_0x000b
            m13116l()
        L_0x000b:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.getSimCountryCode(r0)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r2 = "final sim countryCode: %s"
            java.lang.String r3 = ""
            java.lang.String r4 = "MicroMsg.IPCallAddressUtil"
            r5 = 0
            r6 = 1
            if (r1 != 0) goto L_0x0045
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r0
            java.lang.String r7 = "simCountryCode: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r1)
            java.lang.String r0 = r0.toUpperCase()
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f38955f
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0045
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
            goto L_0x0046
        L_0x0045:
            r0 = r3
        L_0x0046:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x004d
            return r0
        L_0x004d:
            eb0.o4 r0 = eb0.C75590o4.m90740a()
            java.lang.String r0 = r0.f222070g
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r0
            java.lang.String r7 = "personalInfoCountryCode: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0078
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f38955f
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0078
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
            return r0
        L_0x0078:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2131824486(0x7f110f66, float:1.9281801E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r0
            java.lang.String r2 = "fallbackCountryCode: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
            java.lang.String r1 = "+"
            java.lang.String r0 = r0.replace(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t12.C13818a.m13113i():java.lang.String");
    }

    /* renamed from: j */
    public static int m13114j(String str, String str2) {
        if (!((C103918d) C86312j.m106911c(C103918d.class)).Lb0(MMApplicationContext.getContext(), "android.permission.READ_CONTACTS")) {
            Log.m105920e("MicroMsg.IPCallAddressUtil", "no contact permission");
            return -1;
        }
        Cursor query = MMApplicationContext.getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, (String[]) null, "contact_id=?", new String[]{str}, (String) null);
        String j = C110899d.m151196j(str2);
        try {
            if (query.moveToFirst()) {
                while (!query.isAfterLast()) {
                    int i = query.getInt(query.getColumnIndex("data2"));
                    if (C110899d.m151196j(query.getString(query.getColumnIndex("data1"))).equals(j)) {
                        query.close();
                        return i;
                    }
                    query.moveToNext();
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.IPCallAddressUtil", "getPhoneTypeByContactIdAndPhoneNumber error: %s", e.getMessage());
        } catch (Throwable th) {
            query.close();
            throw th;
        }
        query.close();
        return -1;
    }

    /* renamed from: k */
    public static String m13115k(String str) {
        C76166a b;
        if (!Util.isNullOrNil(str) && (b = C75398e.vx0().mo106402b(C90193h.m112878f(C110899d.m151196j(str).getBytes()))) != null) {
            return b.mo106389i();
        }
        return null;
    }

    /* renamed from: l */
    public static void m13116l() {
        String str;
        f38952c.clear();
        f38953d.clear();
        f38954e.clear();
        f38955f.clear();
        f38951b.clear();
        InputStream inputStream = null;
        try {
            inputStream = MMApplicationContext.getContext().getAssets().open("ipcall_country_code.txt");
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            str = new String(bArr);
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.m105921e("MicroMsg.IPCallAddressUtil", "exception:%s", Util.stackTraceToString(e));
            }
        } catch (IOException e2) {
            Log.m105921e("MicroMsg.IPCallAddressUtil", "exception:%s", Util.stackTraceToString(e2));
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    Log.m105921e("MicroMsg.IPCallAddressUtil", "exception:%s", Util.stackTraceToString(e3));
                }
            }
            str = "";
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    Log.m105921e("MicroMsg.IPCallAddressUtil", "exception:%s", Util.stackTraceToString(e4));
                }
            }
            throw th;
        }
        String[] split = str.trim().split("\n");
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].trim().split(" ");
            if (split2.length < 2) {
                Log.m105921e("MicroMsg.IPCallAddressUtil", "this country item has problem %s", split[i]);
            } else {
                C13821b bVar = new C13821b();
                bVar.f38956a = split2[0];
                bVar.f38957b = split2[1];
                String l = RegionCodeDecoder.m124563k().mo135576l(split2[0]);
                if (Util.isNullOrNil(l)) {
                    l = new Locale("", split2[0]).getDisplayCountry(MMApplicationContext.getResources().getConfiguration().locale);
                }
                bVar.f38958c = l;
                f38954e.put(bVar.f38957b, bVar.f38956a);
                f38955f.put(bVar.f38956a, bVar.f38957b);
                f38952c.put(bVar.f38957b, bVar.f38958c);
                f38953d.put(bVar.f38958c, bVar.f38957b);
                f38951b.put(bVar.f38956a, bVar);
            }
        }
    }

    /* renamed from: m */
    public static boolean m13117m(String str) {
        if (f38952c.size() == 0) {
            m13116l();
        }
        return f38952c.containsKey(str);
    }

    /* renamed from: n */
    public static boolean m13118n(String str) {
        if (!Util.isNullOrNil(str)) {
            return str.startsWith("+") || str.startsWith("00");
        }
        return false;
    }

    /* renamed from: o */
    public static String m13119o(int i) {
        Context context = MMApplicationContext.getContext();
        return i != 1 ? i != 2 ? i != 4 ? i != 5 ? i != 10 ? context.getString(C0966R.string.his) : context.getString(C0966R.string.hin) : context.getString(C0966R.string.hiq) : context.getString(C0966R.string.hio) : context.getString(C0966R.string.hir) : context.getString(C0966R.string.hip);
    }

    /* renamed from: p */
    public static String m13120p(String str) {
        return !Util.isNullOrNil(str) ? str.startsWith("+") ? str.substring(1) : str.startsWith("00") ? str.substring(2) : str : str;
    }
}
