package com.tencent.p014mm.plugin.ipcall;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import ob0.C11385n;
import ob0.C117747y;
import t12.C13818a;

/* renamed from: com.tencent.mm.plugin.ipcall.b */
public class C4609b implements C11385n {

    /* renamed from: g */
    public static C4609b f19406g;

    /* renamed from: d */
    public boolean f19407d = false;

    /* renamed from: e */
    public long f19408e = -1;

    /* renamed from: f */
    public long f19409f = -1;

    /* renamed from: com.tencent.mm.plugin.ipcall.b$a */
    public class C4610a implements Runnable {
        public C4610a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r11v2, types: [android.database.Cursor] */
        /* JADX WARNING: type inference failed for: r11v3 */
        /* JADX WARNING: type inference failed for: r11v4 */
        /* JADX WARNING: type inference failed for: r11v5 */
        /* JADX WARNING: type inference failed for: r11v6 */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00be, code lost:
            if (r10 != null) goto L_0x00c0;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00c8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r1 = r22
                com.tencent.mm.plugin.ipcall.b r2 = com.tencent.p014mm.plugin.ipcall.C4609b.this
                r2.getClass()
                java.lang.String r3 = "MicroMsg.IPCallAddressBookUsernameUpdater"
                java.lang.String r0 = "updateUsernameAfterGetMFriend"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
                long r4 = java.lang.System.currentTimeMillis()
                r2.f19409f = r4
                s12.d r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.vx0()
                java.util.ArrayList r0 = r0.mo13005Lo()
                r4 = 1
                r5 = 0
                if (r0 == 0) goto L_0x011a
                int r6 = r0.size()
                if (r6 <= 0) goto L_0x011a
                java.lang.Object[] r6 = new java.lang.Object[r4]
                int r7 = r0.size()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r6[r5] = r7
                java.lang.String r7 = "addressitemList.size: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r7, r6)
                s12.d r6 = com.tencent.p014mm.plugin.ipcall.model.C105385g.vx0()
                java.lang.Thread r7 = java.lang.Thread.currentThread()
                long r7 = r7.getId()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r6.f38579d
                boolean r9 = r6 instanceof zh3.C91753f
                if (r9 == 0) goto L_0x0051
                zh3.f r6 = (zh3.C91753f) r6
                long r6 = r6.beginTransaction(r7)
                goto L_0x0053
            L_0x0051:
                r6 = -1
            L_0x0053:
                java.util.Iterator r8 = r0.iterator()
            L_0x0057:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L_0x0113
                java.lang.Object r0 = r8.next()
                r9 = r0
                s12.c r9 = (s12.C13612c) r9
                java.lang.String r0 = r9.field_contactId
                com.tencent.mm.sdk.platformtools.PhoneFormater r10 = t12.C13818a.f38950a
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                r11 = 0
                if (r10 != 0) goto L_0x00cc
                hg0.b r10 = dg0.C75398e.vx0()
                r10.getClass()
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r12 != 0) goto L_0x00cc
                zh3.f r13 = r10.f223157c     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
                java.lang.String r14 = "addr_upload2"
                r15 = 0
                java.lang.String r16 = "peopleid=?"
                java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
                r10[r5] = r0     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 2
                r17 = r10
                android.database.Cursor r10 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
                boolean r0 = r10.moveToFirst()     // Catch:{ Exception -> 0x00a9 }
                if (r0 == 0) goto L_0x00c0
                hg0.a r0 = new hg0.a     // Catch:{ Exception -> 0x00a9 }
                r0.<init>()     // Catch:{ Exception -> 0x00a9 }
                r0.mo106383b(r10)     // Catch:{ Exception -> 0x00a9 }
                java.lang.String r0 = r0.mo106389i()     // Catch:{ Exception -> 0x00a9 }
                r11 = r0
                goto L_0x00c0
            L_0x00a9:
                r0 = move-exception
                goto L_0x00af
            L_0x00ab:
                r0 = move-exception
                goto L_0x00c6
            L_0x00ad:
                r0 = move-exception
                r10 = r11
            L_0x00af:
                java.lang.String r12 = "MicroMsg.AddrUploadStorage"
                java.lang.String r13 = "getFriendUsernameBySystemAddrBookPeopleId, error:%s"
                java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch:{ all -> 0x00c4 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00c4 }
                r14[r5] = r0     // Catch:{ all -> 0x00c4 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r13, r14)     // Catch:{ all -> 0x00c4 }
                if (r10 == 0) goto L_0x00cc
            L_0x00c0:
                r10.close()
                goto L_0x00cc
            L_0x00c4:
                r0 = move-exception
                r11 = r10
            L_0x00c6:
                if (r11 == 0) goto L_0x00cb
                r11.close()
            L_0x00cb:
                throw r0
            L_0x00cc:
                long r12 = r9.systemRowid
                r14 = 0
                int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r0 <= 0) goto L_0x0057
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
                if (r0 != 0) goto L_0x0057
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r10 = r9.field_contactId
                r0[r5] = r10
                r0[r4] = r11
                r10 = 2
                java.lang.String r12 = r9.field_wechatUsername
                r0[r10] = r12
                java.lang.String r10 = "update username for contactId: %s, newUsername: %s, oldUsername: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r10, r0)
                java.lang.String r0 = r9.field_wechatUsername
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x00fe
                java.lang.String r0 = r9.field_wechatUsername
                boolean r0 = r0.equals(r11)
                if (r0 == 0) goto L_0x0106
            L_0x00fe:
                java.lang.String r0 = r9.field_wechatUsername
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x0057
            L_0x0106:
                r9.field_wechatUsername = r11
                s12.d r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.vx0()
                long r10 = r9.systemRowid
                r0.update((long) r10, r9)
                goto L_0x0057
            L_0x0113:
                s12.d r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.vx0()
                r0.mo13009jo(r6)
            L_0x011a:
                long r6 = java.lang.System.currentTimeMillis()
                java.lang.Object[] r0 = new java.lang.Object[r4]
                long r8 = r2.f19409f
                long r6 = r6 - r8
                java.lang.Long r4 = java.lang.Long.valueOf(r6)
                r0[r5] = r4
                java.lang.String r4 = "update username use %dms"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r0)
                r2.f19407d = r5
                long r2 = java.lang.System.currentTimeMillis()
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r0 = r0.mo105906u()
                com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_IPCALL_ADDRESS_GETMFRIEND_LASTUPDATE_TIME_LONG
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r0.mo119677K(r4, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.C4609b.C4610a.run():void");
        }
    }

    /* renamed from: a */
    public void mo5490a() {
        if (!C13818a.m13105a()) {
            Log.m105918d("MicroMsg.IPCallAddressBookUsernameUpdater", "tryUpdate, can't sync addr book");
        }
        if (this.f19407d) {
            Log.m105918d("MicroMsg.IPCallAddressBookUsernameUpdater", "tryUpdate, updating");
        } else if (Math.abs(System.currentTimeMillis() - ((Long) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IPCALL_ADDRESS_GETMFRIEND_LASTUPDATE_TIME_LONG, 0L)).longValue()) >= 86400000) {
            this.f19407d = true;
            this.f19408e = -1;
            this.f19409f = -1;
            C97625j3.m125815e().mo123455a(32, this);
            ThreadPool.post(new C4608a(this), "IPCallAddressBookUpdater_updateUsername");
        } else {
            Log.m105918d("MicroMsg.IPCallAddressBookUsernameUpdater", "tryUpdate, not reach time limit");
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105919d("MicroMsg.IPCallAddressBookUsernameUpdater", "onSceneEnd, errType: %d, errCode: %d, isUpdating: %b", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(this.f19407d));
        if (this.f19407d) {
            C97625j3.m125815e().mo123470p(32, this);
            Log.m105919d("MicroMsg.IPCallAddressBookUsernameUpdater", "GetMFriend used %dms", Long.valueOf(System.currentTimeMillis() - this.f19408e));
            if (i == 0 && i2 == 0) {
                ThreadPool.post(new C4610a(), "IPCallAddressBookUsernameUpdater_updateUsernameAfterGetMFriend");
                return;
            }
            Log.m105918d("MicroMsg.IPCallAddressBookUsernameUpdater", "GetMFriend failed");
            this.f19407d = false;
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IPCALL_ADDRESS_GETMFRIEND_LASTUPDATE_TIME_LONG, Long.valueOf(System.currentTimeMillis()));
        }
    }
}
