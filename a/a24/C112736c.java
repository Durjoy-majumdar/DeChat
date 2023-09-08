package a24;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import oicq.wlogin_sdk.request.WloginAllSigInfo;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;
import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: a24.c */
public class C112736c {

    /* renamed from: a */
    public Context f337560a;

    /* renamed from: b */
    public TreeMap<Long, WloginAllSigInfo> f337561b = new TreeMap<>();

    public C112736c(Context context) {
        this.f337560a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0124, code lost:
        r0 = (java.lang.String) j20.C117292a.m165363i(r14, "oicq/wlogin_sdk/tools/util", "get_imei_id", "(Landroid/content/Context;)[B", "android/telephony/TelephonyManager", "getDeviceId", "()Ljava/lang/String;");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x01cd */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01fc A[SYNTHETIC, Splitter:B:107:0x01fc] */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0114 A[SYNTHETIC, Splitter:B:59:0x0114] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0138 A[Catch:{ Exception -> 0x0170 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013d A[Catch:{ Exception -> 0x0170 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016b A[SYNTHETIC, Splitter:B:78:0x016b] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0195 A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x019a A[Catch:{ Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c8 A[SYNTHETIC, Splitter:B:99:0x01c8] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.TreeMap m154165c(android.content.Context r21, java.lang.String r22) {
        /*
            r1 = r21
            r0 = r22
            java.lang.String r10 = "DESede"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r11 = 1
            r12 = 0
            r13 = 0
            a24.a r14 = new a24.a     // Catch:{ Exception -> 0x0090 }
            r14.<init>(r1, r0, r12, r11)     // Catch:{ Exception -> 0x0090 }
            android.database.sqlite.SQLiteDatabase r3 = r14.getReadableDatabase()     // Catch:{ Exception -> 0x008e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLException -> 0x007a }
            java.lang.String r5 = "select count(*) from sqlite_master where type ='table' and name ='"
            r4.<init>(r5)     // Catch:{ SQLException -> 0x007a }
            r4.append(r0)     // Catch:{ SQLException -> 0x007a }
            java.lang.String r5 = "' "
            r4.append(r5)     // Catch:{ SQLException -> 0x007a }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLException -> 0x007a }
            android.database.Cursor r15 = r3.rawQuery(r4, r12)     // Catch:{ SQLException -> 0x007a }
            boolean r4 = r15.moveToNext()     // Catch:{ SQLException -> 0x0078 }
            if (r4 == 0) goto L_0x0039
            int r4 = r15.getInt(r13)     // Catch:{ SQLException -> 0x0078 }
            if (r4 <= 0) goto L_0x0039
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ SQLException -> 0x0078 }
        L_0x0039:
            boolean r4 = r15.isClosed()     // Catch:{ SQLException -> 0x0078 }
            if (r4 != 0) goto L_0x0042
            r15.close()     // Catch:{ SQLException -> 0x0078 }
        L_0x0042:
            boolean r2 = r2.booleanValue()     // Catch:{ SQLException -> 0x0078 }
            if (r2 != 0) goto L_0x004c
            r14.close()     // Catch:{ SQLException -> 0x0078 }
            goto L_0x009a
        L_0x004c:
            java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ SQLException -> 0x0078 }
            r4[r13] = r0     // Catch:{ SQLException -> 0x0078 }
            java.lang.String r5 = "ID=0"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r3
            r3 = r22
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLException -> 0x0078 }
            int r2 = r0.getCount()
            if (r2 != 0) goto L_0x006a
            r0.close()
            r14.close()
            goto L_0x009a
        L_0x006a:
            r0.moveToFirst()
            byte[] r2 = r0.getBlob(r13)
            r0.close()
            r14.close()
            goto L_0x009b
        L_0x0078:
            r0 = move-exception
            goto L_0x007c
        L_0x007a:
            r0 = move-exception
            r15 = r12
        L_0x007c:
            oicq.wlogin_sdk.tools.C117790util.m166197s(r0)
            if (r15 == 0) goto L_0x008a
            boolean r0 = r15.isClosed()
            if (r0 != 0) goto L_0x008a
            r15.close()
        L_0x008a:
            r14.close()
            goto L_0x009a
        L_0x008e:
            r0 = move-exception
            goto L_0x0092
        L_0x0090:
            r0 = move-exception
            r14 = r12
        L_0x0092:
            oicq.wlogin_sdk.tools.C117790util.m166197s(r0)
            if (r14 == 0) goto L_0x009a
            r14.close()
        L_0x009a:
            r2 = r12
        L_0x009b:
            if (r2 == 0) goto L_0x0201
            r3 = 2
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x00ca }
            byte[] r4 = a24.C112739f.f337570A     // Catch:{ Exception -> 0x00ca }
            r0.<init>(r4, r10)     // Catch:{ Exception -> 0x00ca }
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r10)     // Catch:{ Exception -> 0x00ca }
            r4.init(r3, r0)     // Catch:{ Exception -> 0x00ca }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x00ca }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00ca }
            javax.crypto.CipherInputStream r5 = new javax.crypto.CipherInputStream     // Catch:{ Exception -> 0x00ca }
            r5.<init>(r0, r4)     // Catch:{ Exception -> 0x00ca }
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x00ca }
            r0.<init>(r5)     // Catch:{ Exception -> 0x00ca }
            java.lang.Object r4 = r0.readObject()     // Catch:{ Exception -> 0x00ca }
            java.util.TreeMap r4 = (java.util.TreeMap) r4     // Catch:{ Exception -> 0x00ca }
            if (r4 == 0) goto L_0x00e8
            r0.close()     // Catch:{ Exception -> 0x00c7 }
            return r4
        L_0x00c7:
            r0 = move-exception
            r12 = r4
            goto L_0x00cb
        L_0x00ca:
            r0 = move-exception
        L_0x00cb:
            java.io.StringWriter r4 = new java.io.StringWriter
            r4.<init>()
            java.io.PrintWriter r5 = new java.io.PrintWriter
            r5.<init>(r4, r11)
            r0.printStackTrace(r5)
            r5.flush()
            r4.flush()
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "exception"
            oicq.wlogin_sdk.tools.C117790util.m166182d(r4, r0)
            r4 = r12
        L_0x00e8:
            byte[] r0 = oicq.wlogin_sdk.tools.C117790util.m166187i(r21)     // Catch:{ Exception -> 0x0119 }
            if (r0 == 0) goto L_0x0119
            int r5 = r0.length     // Catch:{ Exception -> 0x0119 }
            if (r5 <= 0) goto L_0x0119
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x0119 }
            r5.<init>(r0, r10)     // Catch:{ Exception -> 0x0119 }
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r10)     // Catch:{ Exception -> 0x0119 }
            r0.init(r3, r5)     // Catch:{ Exception -> 0x0119 }
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0119 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x0119 }
            javax.crypto.CipherInputStream r6 = new javax.crypto.CipherInputStream     // Catch:{ Exception -> 0x0119 }
            r6.<init>(r5, r0)     // Catch:{ Exception -> 0x0119 }
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0119 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0119 }
            java.lang.Object r5 = r0.readObject()     // Catch:{ Exception -> 0x0119 }
            java.util.TreeMap r5 = (java.util.TreeMap) r5     // Catch:{ Exception -> 0x0119 }
            if (r5 == 0) goto L_0x0118
            r0.close()     // Catch:{ Exception -> 0x0118 }
            return r5
        L_0x0118:
            r4 = r5
        L_0x0119:
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x0170 }
            r14 = r0
            android.telephony.TelephonyManager r14 = (android.telephony.TelephonyManager) r14     // Catch:{ Exception -> 0x0170 }
            if (r14 == 0) goto L_0x013d
            java.lang.String r15 = "oicq/wlogin_sdk/tools/util"
            java.lang.String r16 = "get_imei_id"
            java.lang.String r17 = "(Landroid/content/Context;)[B"
            java.lang.String r18 = "android/telephony/TelephonyManager"
            java.lang.String r19 = "getDeviceId"
            java.lang.String r20 = "()Ljava/lang/String;"
            java.lang.Object r0 = j20.C117292a.m165363i(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0170 }
            if (r0 == 0) goto L_0x013d
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x0170 }
            goto L_0x013f
        L_0x013d:
            byte[] r0 = new byte[r13]     // Catch:{ Exception -> 0x0170 }
        L_0x013f:
            if (r0 == 0) goto L_0x0170
            int r5 = r0.length     // Catch:{ Exception -> 0x0170 }
            if (r5 <= 0) goto L_0x0170
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x0170 }
            byte[] r0 = c24.C79920c.m97091l(r0)     // Catch:{ Exception -> 0x0170 }
            r5.<init>(r0, r10)     // Catch:{ Exception -> 0x0170 }
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r10)     // Catch:{ Exception -> 0x0170 }
            r0.init(r3, r5)     // Catch:{ Exception -> 0x0170 }
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0170 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x0170 }
            javax.crypto.CipherInputStream r6 = new javax.crypto.CipherInputStream     // Catch:{ Exception -> 0x0170 }
            r6.<init>(r5, r0)     // Catch:{ Exception -> 0x0170 }
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0170 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0170 }
            java.lang.Object r5 = r0.readObject()     // Catch:{ Exception -> 0x0170 }
            java.util.TreeMap r5 = (java.util.TreeMap) r5     // Catch:{ Exception -> 0x0170 }
            if (r5 == 0) goto L_0x016f
            r0.close()     // Catch:{ Exception -> 0x016f }
            return r5
        L_0x016f:
            r4 = r5
        L_0x0170:
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x01cd }
            r14 = r0
            android.net.wifi.WifiManager r14 = (android.net.wifi.WifiManager) r14     // Catch:{ Exception -> 0x01cd }
            if (r14 == 0) goto L_0x019a
            java.lang.String r15 = "oicq/wlogin_sdk/tools/util"
            java.lang.String r16 = "get_mac_addr"
            java.lang.String r17 = "(Landroid/content/Context;)[B"
            java.lang.String r18 = "android/net/wifi/WifiManager"
            java.lang.String r19 = "getConnectionInfo"
            java.lang.String r20 = "()Landroid/net/wifi/WifiInfo;"
            java.lang.Object r0 = j20.C117292a.m165363i(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x01cd }
            android.net.wifi.WifiInfo r0 = (android.net.wifi.WifiInfo) r0     // Catch:{ Exception -> 0x01cd }
            if (r0 == 0) goto L_0x019a
            java.lang.String r0 = r0.getMacAddress()     // Catch:{ Exception -> 0x01cd }
            if (r0 == 0) goto L_0x019a
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x01cd }
            goto L_0x019c
        L_0x019a:
            byte[] r0 = new byte[r13]     // Catch:{ Exception -> 0x01cd }
        L_0x019c:
            if (r0 == 0) goto L_0x01cd
            int r1 = r0.length     // Catch:{ Exception -> 0x01cd }
            if (r1 <= 0) goto L_0x01cd
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x01cd }
            byte[] r0 = c24.C79920c.m97091l(r0)     // Catch:{ Exception -> 0x01cd }
            r1.<init>(r0, r10)     // Catch:{ Exception -> 0x01cd }
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r10)     // Catch:{ Exception -> 0x01cd }
            r0.init(r3, r1)     // Catch:{ Exception -> 0x01cd }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x01cd }
            r1.<init>(r2)     // Catch:{ Exception -> 0x01cd }
            javax.crypto.CipherInputStream r5 = new javax.crypto.CipherInputStream     // Catch:{ Exception -> 0x01cd }
            r5.<init>(r1, r0)     // Catch:{ Exception -> 0x01cd }
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x01cd }
            r0.<init>(r5)     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r1 = r0.readObject()     // Catch:{ Exception -> 0x01cd }
            java.util.TreeMap r1 = (java.util.TreeMap) r1     // Catch:{ Exception -> 0x01cd }
            if (r1 == 0) goto L_0x01cc
            r0.close()     // Catch:{ Exception -> 0x01cc }
            return r1
        L_0x01cc:
            r4 = r1
        L_0x01cd:
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x0200 }
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x0200 }
            java.lang.String r5 = "%4;7t>;28<fc.5*6"
            r1.<init>(r5)     // Catch:{ Exception -> 0x0200 }
            byte[] r1 = r1.getBytes()     // Catch:{ Exception -> 0x0200 }
            r0.<init>(r1, r10)     // Catch:{ Exception -> 0x0200 }
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r10)     // Catch:{ Exception -> 0x0200 }
            r1.init(r3, r0)     // Catch:{ Exception -> 0x0200 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0200 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0200 }
            javax.crypto.CipherInputStream r2 = new javax.crypto.CipherInputStream     // Catch:{ Exception -> 0x0200 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x0200 }
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0200 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0200 }
            java.lang.Object r1 = r0.readObject()     // Catch:{ Exception -> 0x0200 }
            r12 = r1
            java.util.TreeMap r12 = (java.util.TreeMap) r12     // Catch:{ Exception -> 0x0200 }
            if (r12 == 0) goto L_0x0201
            r0.close()     // Catch:{ Exception -> 0x0201 }
            return r12
        L_0x0200:
            r12 = r4
        L_0x0201:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a24.C112736c.m154165c(android.content.Context, java.lang.String):java.util.TreeMap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m154166f(android.content.Context r12, java.lang.String r13, byte[] r14) {
        /*
            r0 = 0
            r1 = -1022(0xfffffffffffffc02, float:NaN)
            a24.a r2 = new a24.a     // Catch:{ Exception -> 0x00c2 }
            r3 = 1
            r2.<init>(r12, r13, r0, r3)     // Catch:{ Exception -> 0x00c2 }
            android.database.sqlite.SQLiteDatabase r12 = r2.getWritableDatabase()     // Catch:{ Exception -> 0x00bf }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SQLException -> 0x00b7 }
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS "
            r0.<init>(r4)     // Catch:{ SQLException -> 0x00b7 }
            r0.append(r13)     // Catch:{ SQLException -> 0x00b7 }
            java.lang.String r4 = " (ID INTEGER PRIMARY KEY, "
            r0.append(r4)     // Catch:{ SQLException -> 0x00b7 }
            r0.append(r13)     // Catch:{ SQLException -> 0x00b7 }
            java.lang.String r4 = " BLOB);"
            r0.append(r4)     // Catch:{ SQLException -> 0x00b7 }
            java.lang.String r0 = r0.toString()     // Catch:{ SQLException -> 0x00b7 }
            r12.execSQL(r0)     // Catch:{ SQLException -> 0x00b7 }
            java.lang.String r0 = "ID"
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch:{ SQLException -> 0x00af }
            java.lang.String r7 = "ID=0"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r12
            r5 = r13
            android.database.Cursor r0 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLException -> 0x00af }
            int r4 = r0.getCount()
            r5 = 0
            if (r4 != 0) goto L_0x007b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLException -> 0x0070 }
            java.lang.String r6 = "insert into "
            r4.<init>(r6)     // Catch:{ SQLException -> 0x0070 }
            r4.append(r13)     // Catch:{ SQLException -> 0x0070 }
            java.lang.String r6 = " (ID, "
            r4.append(r6)     // Catch:{ SQLException -> 0x0070 }
            r4.append(r13)     // Catch:{ SQLException -> 0x0070 }
            java.lang.String r6 = ") values (?,?);"
            r4.append(r6)     // Catch:{ SQLException -> 0x0070 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLException -> 0x0070 }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ SQLException -> 0x0070 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ SQLException -> 0x0070 }
            r6[r5] = r7     // Catch:{ SQLException -> 0x0070 }
            byte[] r7 = new byte[r3]     // Catch:{ SQLException -> 0x0070 }
            r6[r3] = r7     // Catch:{ SQLException -> 0x0070 }
            r12.execSQL(r4, r6)     // Catch:{ SQLException -> 0x0070 }
            goto L_0x007b
        L_0x0070:
            r12 = move-exception
            oicq.wlogin_sdk.tools.C117790util.m166197s(r12)
            r0.close()
            r2.close()
            return r1
        L_0x007b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLException -> 0x00a4 }
            java.lang.String r6 = "update "
            r4.<init>(r6)     // Catch:{ SQLException -> 0x00a4 }
            r4.append(r13)     // Catch:{ SQLException -> 0x00a4 }
            java.lang.String r6 = " set "
            r4.append(r6)     // Catch:{ SQLException -> 0x00a4 }
            r4.append(r13)     // Catch:{ SQLException -> 0x00a4 }
            java.lang.String r13 = " =? where ID=0"
            r4.append(r13)     // Catch:{ SQLException -> 0x00a4 }
            java.lang.String r13 = r4.toString()     // Catch:{ SQLException -> 0x00a4 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ SQLException -> 0x00a4 }
            r3[r5] = r14     // Catch:{ SQLException -> 0x00a4 }
            r12.execSQL(r13, r3)     // Catch:{ SQLException -> 0x00a4 }
            r0.close()
            r2.close()
            return r5
        L_0x00a4:
            r12 = move-exception
            oicq.wlogin_sdk.tools.C117790util.m166197s(r12)
            r0.close()
            r2.close()
            return r1
        L_0x00af:
            r12 = move-exception
            oicq.wlogin_sdk.tools.C117790util.m166197s(r12)
            r2.close()
            return r1
        L_0x00b7:
            r12 = move-exception
            oicq.wlogin_sdk.tools.C117790util.m166197s(r12)
            r2.close()
            return r1
        L_0x00bf:
            r12 = move-exception
            r0 = r2
            goto L_0x00c3
        L_0x00c2:
            r12 = move-exception
        L_0x00c3:
            oicq.wlogin_sdk.tools.C117790util.m166197s(r12)
            if (r0 == 0) goto L_0x00cb
            r0.close()
        L_0x00cb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a24.C112736c.m154166f(android.content.Context, java.lang.String, byte[]):int");
    }

    /* renamed from: a */
    public synchronized WloginAllSigInfo mo164486a(long j) {
        C117790util.m166180b("get_all_siginfo", "uin=" + j);
        WloginAllSigInfo wloginAllSigInfo = this.f337561b.get(new Long(j));
        if (wloginAllSigInfo != null) {
            return wloginAllSigInfo;
        }
        Context context = this.f337560a;
        if (context == null) {
            return null;
        }
        TreeMap c = m154165c(context, "tk_file");
        if (c == null) {
            return null;
        }
        WloginAllSigInfo wloginAllSigInfo2 = (WloginAllSigInfo) c.get(new Long(j));
        if (wloginAllSigInfo2 == null) {
            C117790util.m166180b("get_all_siginfo", "null");
            return null;
        }
        this.f337561b.put(new Long(j), wloginAllSigInfo2);
        return wloginAllSigInfo2.get_clone();
    }

    /* renamed from: b */
    public synchronized WloginSigInfo mo164487b(long j, long j2) {
        C117790util.m166180b("get_siginfo", "uin=" + j + "appid=" + j2);
        WloginAllSigInfo a = mo164486a(j);
        if (a == null) {
            return null;
        }
        WloginSigInfo wloginSigInfo = a._tk_map.get(new Long(j2));
        if (wloginSigInfo == null) {
            return null;
        }
        return wloginSigInfo;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public synchronized int mo164488d(long r37, long r39, long r41, long r43, long r45, long r47, byte[] r49, byte[] r50, byte[] r51, byte[] r52, byte[] r53, byte[] r54, byte[] r55, byte[] r56, byte[] r57, byte[] r58, byte[] r59, byte[] r60, byte[] r61, byte[] r62, byte[] r63, byte[] r64, byte[][] r65) {
        /*
            r36 = this;
            r1 = r36
            r9 = r37
            r14 = r39
            monitor-enter(r36)
            java.util.TreeMap<java.lang.Long, oicq.wlogin_sdk.request.WloginAllSigInfo> r0 = r1.f337561b     // Catch:{ all -> 0x00f2 }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x00f2 }
            r2.<init>(r9)     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x00f2 }
            oicq.wlogin_sdk.request.WloginAllSigInfo r0 = (oicq.wlogin_sdk.request.WloginAllSigInfo) r0     // Catch:{ all -> 0x00f2 }
            if (r0 != 0) goto L_0x001b
            oicq.wlogin_sdk.request.WloginAllSigInfo r0 = new oicq.wlogin_sdk.request.WloginAllSigInfo     // Catch:{ all -> 0x00f2 }
            r0.<init>()     // Catch:{ all -> 0x00f2 }
        L_0x001b:
            r12 = 0
            byte[] r2 = new byte[r12]     // Catch:{ all -> 0x00f2 }
            java.util.TreeMap<java.lang.Long, oicq.wlogin_sdk.sharemem.WloginSigInfo> r3 = r0._tk_map     // Catch:{ all -> 0x00f2 }
            java.lang.Long r4 = new java.lang.Long     // Catch:{ all -> 0x00f2 }
            r4.<init>(r14)     // Catch:{ all -> 0x00f2 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00f2 }
            oicq.wlogin_sdk.sharemem.WloginSigInfo r3 = (oicq.wlogin_sdk.sharemem.WloginSigInfo) r3     // Catch:{ all -> 0x00f2 }
            if (r3 == 0) goto L_0x0037
            byte[] r3 = r3._en_A1     // Catch:{ all -> 0x00f2 }
            if (r3 == 0) goto L_0x0037
            java.lang.Object r2 = r3.clone()     // Catch:{ all -> 0x00f2 }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x00f2 }
        L_0x0037:
            r35 = r2
            oicq.wlogin_sdk.sharemem.WloginSimpleInfo r11 = new oicq.wlogin_sdk.sharemem.WloginSimpleInfo     // Catch:{ all -> 0x00f2 }
            r2 = r11
            r3 = r37
            r5 = r49
            r6 = r50
            r7 = r51
            r8 = r52
            r2.<init>(r3, r5, r6, r7, r8)     // Catch:{ all -> 0x00f2 }
            r0._useInfo = r11     // Catch:{ all -> 0x00f2 }
            r11 = r0
            r2 = 0
            r12 = r39
            r3 = r14
            r14 = r41
            r16 = r43
            r18 = r45
            r20 = r47
            r22 = r53
            r23 = r54
            r24 = r55
            r25 = r56
            r26 = r57
            r27 = r58
            r28 = r59
            r29 = r60
            r30 = r61
            r31 = r62
            r32 = r63
            r33 = r64
            r34 = r65
            int r5 = r11.put_siginfo(r12, r14, r16, r18, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x00f2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            java.lang.String r7 = "before put_siginfo, ret="
            r6.<init>(r7)     // Catch:{ all -> 0x00f2 }
            r6.append(r5)     // Catch:{ all -> 0x00f2 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00f2 }
            oicq.wlogin_sdk.tools.C117790util.m166181c(r6)     // Catch:{ all -> 0x00f2 }
            android.content.Context r6 = r1.f337560a     // Catch:{ all -> 0x00f2 }
            if (r6 == 0) goto L_0x00cd
            java.lang.String r5 = "tk_file"
            java.util.TreeMap r5 = m154165c(r6, r5)     // Catch:{ all -> 0x00f2 }
            if (r5 != 0) goto L_0x0098
            java.util.TreeMap r5 = new java.util.TreeMap     // Catch:{ all -> 0x00f2 }
            r5.<init>()     // Catch:{ all -> 0x00f2 }
        L_0x0098:
            java.lang.String r6 = "after loadTKTreeMap"
            oicq.wlogin_sdk.tools.C117790util.m166181c(r6)     // Catch:{ all -> 0x00f2 }
            java.lang.Long r6 = new java.lang.Long     // Catch:{ all -> 0x00f2 }
            r6.<init>(r9)     // Catch:{ all -> 0x00f2 }
            oicq.wlogin_sdk.request.WloginAllSigInfo r7 = r0.get_clone()     // Catch:{ all -> 0x00f2 }
            r5.put(r6, r7)     // Catch:{ all -> 0x00f2 }
            java.lang.String r6 = "tk_file"
            monitor-enter(r36)     // Catch:{ all -> 0x00f2 }
            java.lang.String r7 = "tk_file"
            if (r6 != r7) goto L_0x00b5
            int r12 = r1.mo164489e(r5, r6)     // Catch:{ all -> 0x00ca }
            goto L_0x00b6
        L_0x00b5:
            r12 = 0
        L_0x00b6:
            monitor-exit(r36)     // Catch:{ all -> 0x00f2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            java.lang.String r5 = "after refreshTKTreeMap, ret="
            r2.<init>(r5)     // Catch:{ all -> 0x00f2 }
            r2.append(r12)     // Catch:{ all -> 0x00f2 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00f2 }
            oicq.wlogin_sdk.tools.C117790util.m166181c(r2)     // Catch:{ all -> 0x00f2 }
            r5 = r12
            goto L_0x00cd
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r36)     // Catch:{ all -> 0x00f2 }
            throw r0     // Catch:{ all -> 0x00f2 }
        L_0x00cd:
            if (r5 == 0) goto L_0x00e6
            java.util.TreeMap<java.lang.Long, oicq.wlogin_sdk.sharemem.WloginSigInfo> r2 = r0._tk_map     // Catch:{ all -> 0x00f2 }
            java.lang.Long r6 = new java.lang.Long     // Catch:{ all -> 0x00f2 }
            r6.<init>(r3)     // Catch:{ all -> 0x00f2 }
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x00f2 }
            oicq.wlogin_sdk.sharemem.WloginSigInfo r2 = (oicq.wlogin_sdk.sharemem.WloginSigInfo) r2     // Catch:{ all -> 0x00f2 }
            if (r2 == 0) goto L_0x00e6
            java.lang.Object r3 = r35.clone()     // Catch:{ all -> 0x00f2 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x00f2 }
            r2._en_A1 = r3     // Catch:{ all -> 0x00f2 }
        L_0x00e6:
            java.util.TreeMap<java.lang.Long, oicq.wlogin_sdk.request.WloginAllSigInfo> r2 = r1.f337561b     // Catch:{ all -> 0x00f2 }
            java.lang.Long r3 = new java.lang.Long     // Catch:{ all -> 0x00f2 }
            r3.<init>(r9)     // Catch:{ all -> 0x00f2 }
            r2.put(r3, r0)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r36)
            return r5
        L_0x00f2:
            r0 = move-exception
            monitor-exit(r36)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a24.C112736c.mo164488d(long, long, long, long, long, long, byte[], byte[], byte[], byte[], byte[], byte[], byte[], byte[], byte[], byte[], byte[], byte[], byte[], byte[], byte[], byte[], byte[][]):int");
    }

    /* renamed from: e */
    public synchronized int mo164489e(TreeMap treeMap, String str) {
        int i;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(C112739f.f337570A, "DESede");
            Cipher instance = Cipher.getInstance("DESede");
            instance.init(1, secretKeySpec);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new CipherOutputStream(byteArrayOutputStream, instance));
            objectOutputStream.writeObject(treeMap);
            objectOutputStream.close();
            i = m154166f(this.f337560a, str, byteArrayOutputStream.toByteArray());
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter, true);
            e.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            C117790util.m166182d("exception", stringWriter.toString());
            i = -1022;
        }
        return i;
    }
}
