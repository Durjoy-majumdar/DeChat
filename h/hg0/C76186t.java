package hg0;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.TimeLogger;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72982l3;
import com.tencent.p014mm.storage.C72987n3;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.List;
import mg0.C76754b;
import p286zl.C79396l;
import wc3.C15131b;
import zh3.C91753f;

/* renamed from: hg0.t */
public final class C76186t {
    /* renamed from: a */
    public static boolean m91533a() {
        boolean a = C86709a0.m107522a();
        if (!a) {
            Log.m105925i("MicroMsg.FriendLogic", "canSyncAddrBook isAccHasReady: %b", Boolean.valueOf(a));
            return false;
        }
        boolean z = m91534b() == C79396l.SUCC;
        if (!z) {
            Log.m105925i("MicroMsg.FriendLogic", "canSyncAddrBook userBindOpMobile: %b", Boolean.valueOf(z));
            return false;
        }
        boolean h = m91540h();
        if (h) {
            return true;
        }
        Log.m105925i("MicroMsg.FriendLogic", "canSyncAddrBook isUploadContact: %b", Boolean.valueOf(h));
        return false;
    }

    /* renamed from: b */
    public static C79396l m91534b() {
        C79396l lVar = C79396l.NO_INIT;
        try {
            String str = (String) C86709a0.m107535s().mo121142i().mo119684e(4097, "");
            String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(6, "");
            boolean z = (C75592q0.m90787q() & 131072) == 0;
            Log.m105924i("MicroMsg.FriendLogic", "isUpload " + z + " stat " + C75592q0.m90787q());
            if (str == null || str.length() <= 0) {
                str = null;
            }
            if (str2 == null || str2.length() <= 0) {
                str2 = null;
            }
            return (str == null && str2 == null) ? lVar : (str == null || str2 != null) ? z ? C79396l.SUCC : C79396l.SUCC_UNLOAD : C79396l.SET_MOBILE;
        } catch (Exception unused) {
            return lVar;
        }
    }

    /* renamed from: c */
    public static void m91535c(long j, String str) {
        Class cls = C75700k0.class;
        Log.m105925i("MicroMsg.FriendLogic", "clearFMsgAndFConvByTalker, rowId: %d, talker: %s", Long.valueOf(j), str);
        boolean Lo = ((C72982l3) ((C75700k0) C86709a0.m107533q(cls)).mo96096M5()).mo101165Lo(j, str);
        Log.m105924i("MicroMsg.FriendLogic", "clearFMsgAndFConvByTalker, delete fconversation, ret = " + Lo);
        boolean jo = ((C72987n3) ((C75700k0) C86709a0.m107533q(cls)).mo96104vj()).mo101191jo(str);
        Log.m105924i("MicroMsg.FriendLogic", "clearFMsgAndFConvByTalker, delete fmsginfo, ret = " + jo);
    }

    /* renamed from: d */
    public static List<String> m91536d() {
        Cursor rawQuery = ((C76168b) ((C76754b) C86312j.m106911c(C76754b.class)).R50()).f223157c.rawQuery("select addr_upload2.md5 from addr_upload2 where addr_upload2.uploadtime = 0 AND addr_upload2.type = 1", (String[]) null, 2);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            arrayList.add(rawQuery.getString(0));
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: e */
    public static String m91537e(String str) {
        String str2 = "";
        if (str != null && !str.equals(str2)) {
            C76168b bVar = (C76168b) ((C76754b) C86312j.m106911c(C76754b.class)).R50();
            bVar.getClass();
            Cursor rawQuery = bVar.f223157c.rawQuery("select addr_upload2.realname from addr_upload2 where addr_upload2.id = " + C76166a.m91467d(str) + str2, (String[]) null, 2);
            if (rawQuery != null) {
                if (rawQuery.moveToFirst()) {
                    str2 = rawQuery.getString(0);
                }
                rawQuery.close();
            }
        }
        return str2;
    }

    /* renamed from: f */
    public static List<String> m91538f() {
        Cursor rawQuery = ((C76168b) ((C76754b) C86312j.m106911c(C76754b.class)).R50()).f223157c.rawQuery("select addr_upload2.moblie from addr_upload2 where addr_upload2.uploadtime = 0 AND addr_upload2.type = 0", (String[]) null, 2);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            boolean z = false;
            String a = C15131b.m14237a(rawQuery.getString(0));
            if (a.length() > 0) {
                z = true;
            }
            if (z) {
                arrayList.add(a);
            }
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: g */
    public static boolean m91539g() {
        C79396l b = m91534b();
        Log.m105925i("MicroMsg.FriendLogic", "isTipInMobileFriend, state %s", b.toString());
        if (b == C79396l.SUCC) {
            boolean nullAs = Util.nullAs((Boolean) C86709a0.m107535s().mo121142i().mo119684e(12322, Boolean.FALSE), false);
            Log.m105925i("MicroMsg.FriendLogic", "USERINFO_UPLOAD_ADDR_LOOK_UP %B", Boolean.valueOf(nullAs));
            if (!nullAs) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m91540h() {
        if (C86709a0.m107535s() != null && C86709a0.m107535s().mo121142i() != null) {
            return Util.nullAs((Boolean) C86709a0.m107535s().mo121142i().mo119684e(12322, Boolean.TRUE), true);
        }
        Log.m105920e("MicroMsg.FriendLogic", "[arthurdan.UploadPhone] Notice!!!! MMKernel.storage() is null!!!");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m91541i(java.lang.String r18, android.content.Context r19, byte[] r20) {
        /*
            r0 = r18
            java.lang.String r1 = "vnd.android.cursor.item/photo"
            java.lang.String r2 = "mimetype"
            java.lang.String r3 = "raw_contact_id"
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x00ec
            java.lang.String r6 = ""
            boolean r7 = r0.equals(r6)
            if (r7 == 0) goto L_0x0017
            goto L_0x00ec
        L_0x0017:
            java.lang.Class<aw.d> r7 = p447aw.C103918d.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            aw.d r7 = (p447aw.C103918d) r7
            java.lang.String r8 = "android.permission.READ_CONTACTS"
            r9 = r19
            boolean r7 = r7.Lb0(r9, r8)
            java.lang.String r8 = "MicroMsg.AddressBookUtil"
            if (r7 != 0) goto L_0x0032
            java.lang.String r0 = "no contact permission"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x00ec
        L_0x0032:
            r7 = 0
            android.content.ContentResolver r15 = r19.getContentResolver()     // Catch:{ Exception -> 0x00ce }
            long r16 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r18)     // Catch:{ Exception -> 0x00ce }
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ Exception -> 0x00ce }
            r0.<init>()     // Catch:{ Exception -> 0x00ce }
            java.lang.String r9 = "%s=%d and %s='%s'"
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x00ce }
            r10[r4] = r3     // Catch:{ Exception -> 0x00ce }
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x00ce }
            r10[r5] = r11     // Catch:{ Exception -> 0x00ce }
            r11 = 2
            r10[r11] = r2     // Catch:{ Exception -> 0x00ce }
            r11 = 3
            r10[r11] = r1     // Catch:{ Exception -> 0x00ce }
            java.lang.String r12 = java.lang.String.format(r9, r10)     // Catch:{ Exception -> 0x00ce }
            java.lang.String r9 = "where is %s"
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00ce }
            r10[r4] = r12     // Catch:{ Exception -> 0x00ce }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r9, r10)     // Catch:{ Exception -> 0x00ce }
            android.net.Uri r10 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ Exception -> 0x00ce }
            r11 = 0
            r13 = 0
            r14 = 0
            r9 = r15
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00ce }
            if (r9 != 0) goto L_0x0074
            if (r9 == 0) goto L_0x00ec
        L_0x006f:
            r9.close()
            goto L_0x00ec
        L_0x0074:
            java.lang.String r10 = "_id"
            int r10 = r9.getColumnIndexOrThrow(r10)     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            boolean r11 = r9.moveToFirst()     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            if (r11 == 0) goto L_0x0085
            int r10 = r9.getInt(r10)     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            goto L_0x0086
        L_0x0085:
            r10 = -1
        L_0x0086:
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            r0.put(r3, r11)     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            java.lang.String r3 = "is_super_primary"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            r0.put(r3, r11)     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            java.lang.String r3 = "data15"
            r11 = r20
            r0.put(r3, r11)     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            if (r10 < 0) goto L_0x00bd
            android.net.Uri r1 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            r2.<init>()     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            java.lang.String r3 = "_id = "
            r2.append(r3)     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            r2.append(r10)     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            int r0 = r15.update(r1, r0, r2, r7)     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            if (r0 <= 0) goto L_0x006f
            r4 = 1
            goto L_0x006f
        L_0x00bd:
            android.net.Uri r1 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            r15.insert(r1, r0)     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            r9.close()
            r4 = 1
            goto L_0x00ec
        L_0x00c7:
            r0 = move-exception
            goto L_0x00e6
        L_0x00c9:
            r0 = move-exception
            r7 = r9
            goto L_0x00cf
        L_0x00cc:
            r0 = move-exception
            goto L_0x00e5
        L_0x00ce:
            r0 = move-exception
        L_0x00cf:
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x00cc }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r6, r1)     // Catch:{ all -> 0x00cc }
            if (r7 == 0) goto L_0x00df
            boolean r0 = r7.isClosed()     // Catch:{ all -> 0x00cc }
            if (r0 != 0) goto L_0x00df
            r7.close()     // Catch:{ all -> 0x00cc }
        L_0x00df:
            if (r7 == 0) goto L_0x00ec
            r7.close()
            goto L_0x00ec
        L_0x00e5:
            r9 = r7
        L_0x00e6:
            if (r9 == 0) goto L_0x00eb
            r9.close()
        L_0x00eb:
            throw r0
        L_0x00ec:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hg0.C76186t.m91541i(java.lang.String, android.content.Context, byte[]):boolean");
    }

    /* renamed from: j */
    public static void m91542j(boolean z) {
        if (z && !((Boolean) C86709a0.m107535s().mo121142i().mo119684e(12322, Boolean.FALSE)).booleanValue()) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_ACCOUNT_MANAGER_NEW_ACCOUNTS_BOOLEAN_SYNC, Boolean.TRUE);
        }
        C86709a0.m107535s().mo121142i().mo119676J(12322, Boolean.valueOf(z));
    }

    /* renamed from: k */
    public static void m91543k(List<String> list) {
        boolean z;
        int i;
        if (list == null) {
            Log.m105920e("MicroMsg.FriendLogic", "set uploaded mobile contact failed, null info list");
            return;
        }
        C76168b bVar = (C76168b) ((C76754b) C86312j.m106911c(C76754b.class)).R50();
        bVar.getClass();
        TimeLogger timeLogger = new TimeLogger("MicroMsg.AddrUploadStorage", "set uploaded transaction");
        timeLogger.addSplit("transation begin");
        long beginTransaction = bVar.f223157c.beginTransaction(Thread.currentThread().getId());
        int i2 = 1;
        try {
            for (String next : list) {
                if (next != null) {
                    if (next.length() > 0) {
                        C76166a aVar = new C76166a();
                        aVar.f223112O = 8;
                        aVar.f223116d = Util.nowSecond();
                        ContentValues c = aVar.mo106384c();
                        if (c.size() > 0) {
                            C91753f fVar = bVar.f223157c;
                            String[] strArr = new String[i2];
                            strArr[0] = "" + C76166a.m91467d(next);
                            i = fVar.update("addr_upload2", c, "id=?", strArr);
                        } else {
                            i = 0;
                        }
                        Log.m105924i("MicroMsg.AddrUploadStorage", "local contact uploaded : " + next + ", update result: " + i);
                    }
                }
                i2 = 1;
            }
            z = true;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.AddrUploadStorage", "" + e.getMessage());
            z = false;
        }
        bVar.f223157c.endTransaction(beginTransaction);
        timeLogger.addSplit("transation end");
        timeLogger.dumpToLog();
        if (z) {
            bVar.doNotify(3, bVar, (Object) null);
        }
    }

    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* renamed from: l */
    public static void m91544l(int i, List<C76166a> list) {
        boolean z;
        int i2;
        List<C76166a> list2 = list;
        if (list2 == null) {
            Log.m105920e("MicroMsg.FriendLogic", "sync address book failed, null info list");
            return;
        }
        C76168b bVar = (C76168b) ((C76754b) C86312j.m106911c(C76754b.class)).R50();
        bVar.getClass();
        if (list.size() > 0) {
            TimeLogger timeLogger = new TimeLogger("MicroMsg.AddrUploadStorage", "transaction");
            timeLogger.addSplit("transation begin");
            long beginTransaction = bVar.f223157c.beginTransaction(Thread.currentThread().getId());
            ? r7 = 0;
            int i3 = 0;
            while (true) {
                try {
                    if (i3 >= list.size()) {
                        break;
                    }
                    C76166a aVar = list2.get(i3);
                    if (aVar != null) {
                        String e = aVar.mo106385e();
                        Cursor rawQuery = bVar.f223157c.rawQuery("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where addr_upload2.id = " + C76166a.m91467d(e) + "", (String[]) null, 2);
                        if (rawQuery == null) {
                            z = false;
                        } else {
                            z = rawQuery.moveToFirst();
                            rawQuery.close();
                        }
                        if (!z) {
                            aVar.f223112O = -1;
                            if (((int) bVar.f223157c.mo125627q("addr_upload2", "id", aVar.mo106384c(), r7)) == -1) {
                                Object[] objArr = new Object[2];
                                objArr[r7] = aVar.mo106386f();
                                String str = aVar.f223126n;
                                if (str == null) {
                                    str = "";
                                }
                                objArr[1] = str;
                                Log.m105925i("MicroMsg.AddrUploadStorage", "batchSet insert failed, num:%s email:%s", objArr);
                            } else {
                                bVar.doNotify(2, bVar, aVar.mo106385e());
                            }
                        } else {
                            int d = C76166a.m91467d(aVar.mo106385e());
                            ContentValues c = aVar.mo106384c();
                            if (c.size() > 0) {
                                C91753f fVar = bVar.f223157c;
                                i2 = fVar.update("addr_upload2", c, "id=?", new String[]{"" + d});
                            } else {
                                i2 = 0;
                            }
                            if (i2 == 0) {
                                Object[] objArr2 = new Object[2];
                                objArr2[0] = aVar.mo106386f();
                                String str2 = aVar.f223126n;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                objArr2[1] = str2;
                                Log.m105925i("MicroMsg.AddrUploadStorage", "batchSet update result=0, num:%s email:%s", objArr2);
                            } else if (i2 < 0) {
                                Object[] objArr3 = new Object[2];
                                objArr3[0] = aVar.mo106386f();
                                String str3 = aVar.f223126n;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                objArr3[1] = str3;
                                Log.m105925i("MicroMsg.AddrUploadStorage", "batchSet update failed, num:%s email:%s", objArr3);
                            } else {
                                bVar.doNotify(3, bVar, aVar.mo106385e());
                                i3++;
                                r7 = 0;
                            }
                        }
                    }
                    i3++;
                    r7 = 0;
                } catch (Exception e2) {
                    Log.m105920e("MicroMsg.AddrUploadStorage", "" + e2.getMessage());
                }
            }
            bVar.f223157c.endTransaction(beginTransaction);
            timeLogger.addSplit("transation end");
            timeLogger.dumpToLog();
        }
    }
}
