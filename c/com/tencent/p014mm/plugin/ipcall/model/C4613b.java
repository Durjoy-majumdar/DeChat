package com.tencent.p014mm.plugin.ipcall.model;

import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.ArrayList;
import s12.C13611b;
import s12.C13612c;

/* renamed from: com.tencent.mm.plugin.ipcall.model.b */
public class C4613b {

    /* renamed from: f */
    public static C4613b f19412f;

    /* renamed from: a */
    public boolean f19413a = false;

    /* renamed from: b */
    public ArrayList<C4615b> f19414b = new ArrayList<>();

    /* renamed from: c */
    public long f19415c = -1;

    /* renamed from: d */
    public long f19416d = -1;

    /* renamed from: e */
    public MMHandler f19417e = new C4614a(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.plugin.ipcall.model.b$a */
    public class C4614a extends MMHandler {
        public C4614a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x008a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r22) {
            /*
                r21 = this;
                r0 = r21
                long r1 = java.lang.System.currentTimeMillis()
                s12.d r3 = com.tencent.p014mm.plugin.ipcall.model.C105385g.vx0()
                r4 = r22
                java.lang.Object r4 = r4.obj
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                r3.getClass()
                r5 = -1
                r7 = 0
                if (r4 == 0) goto L_0x00a0
                int r8 = r4.size()
                if (r8 <= 0) goto L_0x00a0
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                long r8 = r8.getId()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r10 = r3.f38579d
                boolean r11 = r10 instanceof zh3.C91753f
                if (r11 == 0) goto L_0x0033
                zh3.f r10 = (zh3.C91753f) r10
                long r8 = r10.beginTransaction(r8)
                goto L_0x0034
            L_0x0033:
                r8 = r5
            L_0x0034:
                java.lang.String r10 = "MicroMsg.IPCallAddressStorage"
                java.lang.String r11 = "getContactIdMap start"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r12 = r3.f38579d
                java.lang.String r11 = "contactId"
                java.lang.String[] r14 = new java.lang.String[]{r11}
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 2
                java.lang.String r13 = "IPCallAddressItem"
                android.database.Cursor r11 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)
                java.util.HashMap r12 = new java.util.HashMap
                r12.<init>()
                if (r11 == 0) goto L_0x0076
                boolean r13 = r11.moveToFirst()
                if (r13 == 0) goto L_0x0076
            L_0x0061:
                java.lang.String r13 = r11.getString(r7)
                boolean r14 = r12.containsKey(r13)
                if (r14 != 0) goto L_0x0070
                java.lang.Boolean r14 = java.lang.Boolean.TRUE
                r12.put(r13, r14)
            L_0x0070:
                boolean r13 = r11.moveToNext()
                if (r13 != 0) goto L_0x0061
            L_0x0076:
                if (r11 == 0) goto L_0x007b
                r11.close()
            L_0x007b:
                java.lang.String r11 = "getContactIdMap end"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
                java.util.Iterator r4 = r4.iterator()
            L_0x0084:
                boolean r10 = r4.hasNext()
                if (r10 == 0) goto L_0x009d
                java.lang.Object r10 = r4.next()
                s12.c r10 = (s12.C13612c) r10
                java.lang.String r11 = r10.field_contactId
                boolean r11 = r12.containsKey(r11)
                if (r11 == 0) goto L_0x0099
                goto L_0x0084
            L_0x0099:
                r3.insert(r10)
                goto L_0x0084
            L_0x009d:
                r3.mo13009jo(r8)
            L_0x00a0:
                long r3 = java.lang.System.currentTimeMillis()
                r8 = 1
                java.lang.Object[] r9 = new java.lang.Object[r8]
                long r3 = r3 - r1
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                r9[r7] = r1
                java.lang.String r1 = "MicroMsg.IPCallAddressBookLoader"
                java.lang.String r2 = "batchInsert, used %dms"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r2, r9)
                com.tencent.mm.plugin.ipcall.model.b r2 = com.tencent.p014mm.plugin.ipcall.model.C4613b.this
                long r3 = java.lang.System.currentTimeMillis()
                r2.f19416d = r3
                java.lang.Object[] r2 = new java.lang.Object[r8]
                com.tencent.mm.plugin.ipcall.model.b r3 = com.tencent.p014mm.plugin.ipcall.model.C4613b.this
                long r8 = r3.f19416d
                long r3 = r3.f19415c
                long r8 = r8 - r3
                java.lang.Long r3 = java.lang.Long.valueOf(r8)
                r2[r7] = r3
                java.lang.String r3 = "loadAllAddressItem, used: %dms"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r3, r2)
                com.tencent.mm.plugin.ipcall.model.b r1 = com.tencent.p014mm.plugin.ipcall.model.C4613b.this
                r1.f19413a = r7
                r1.f19416d = r5
                r1.f19415c = r5
                java.util.ArrayList<com.tencent.mm.plugin.ipcall.model.b$b> r1 = r1.f19414b
                java.util.Iterator r1 = r1.iterator()
            L_0x00df:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x00f1
                java.lang.Object r2 = r1.next()
                com.tencent.mm.plugin.ipcall.model.b$b r2 = (com.tencent.p014mm.plugin.ipcall.model.C4613b.C4615b) r2
                if (r2 == 0) goto L_0x00df
                r2.mo5493a()
                goto L_0x00df
            L_0x00f1:
                com.tencent.mm.plugin.ipcall.model.b r1 = com.tencent.p014mm.plugin.ipcall.model.C4613b.this
                java.util.ArrayList<com.tencent.mm.plugin.ipcall.model.b$b> r1 = r1.f19414b
                r1.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.model.C4613b.C4614a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.model.b$b */
    public interface C4615b {
        /* renamed from: a */
        void mo5493a();
    }

    /* renamed from: a */
    public void mo5492a(C4615b bVar, boolean z) {
        if (bVar != null) {
            this.f19414b.add(bVar);
        }
        if (this.f19413a) {
            Log.m105918d("MicroMsg.IPCallAddressBookLoader", "loadAllAddressItem, isLoading is true, ignore");
            return;
        }
        this.f19415c = System.currentTimeMillis();
        if (C13611b.f38574b.size() == 0 || !z) {
            Log.m105918d("MicroMsg.IPCallAddressBookLoader", "loadFromSystemAddressBook");
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList<C13612c> b = C13611b.m12912b();
            Log.m105919d("MicroMsg.IPCallAddressBookLoader", "getAllAddressItemFromSystemPhoneBook, used %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            Message obtainMessage = this.f19417e.obtainMessage();
            obtainMessage.obj = b;
            this.f19417e.sendMessage(obtainMessage);
            this.f19413a = true;
        }
    }
}
