package com.tencent.p014mm.storage;

import android.content.Context;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import eb0.C31543z5;
import f40.C86709a0;
import g62.C8232g;
import java.util.List;
import p749xh.C78812i2;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.l3 */
public class C72982l3 extends MAutoStorage<C72979k3> implements MStorage.IOnStorageChange, C8232g {

    /* renamed from: g */
    public static final String[] f212803g = {MAutoStorage.getCreateSQLs(C72979k3.f212792y0, "fmessage_conversation")};

    /* renamed from: h */
    public static final String[] f212804h = {"CREATE INDEX IF NOT EXISTS  fmessageConversationTalkerIndex ON fmessage_conversation ( talker )", "CREATE INDEX IF NOT EXISTS  fmconversation_isnew_Index ON fmessage_conversation ( isNew )"};

    /* renamed from: d */
    public ISQLiteDatabase f212805d;

    /* renamed from: e */
    public Context f212806e;

    /* renamed from: f */
    public Runnable f212807f = new C72983a();

    /* renamed from: com.tencent.mm.storage.l3$a */
    public class C72983a implements Runnable {
        public C72983a() {
        }

        public void run() {
            int Ow = C72982l3.this.mo101166Ow();
            Log.m105927v("MicroMsg.FMessageConversationStorage", "onNotifyChange, newCount update to = %d", Integer.valueOf(Ow));
            C86709a0.m107535s().mo121142i().mo119676J(143618, Integer.valueOf(Ow));
        }
    }

    public C72982l3(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C72979k3.f212792y0, "fmessage_conversation", f212804h);
        this.f212805d = iSQLiteDatabase;
        this.f212806e = MMApplicationContext.getContext();
    }

    /* renamed from: Lo */
    public boolean mo101165Lo(long j, String str) {
        String str2;
        Log.m105925i("MicroMsg.FMessageConversationStorage", "deleteByTalker rowId: %d, talker: %s, stack = %s", Long.valueOf(j), str, Util.getStack());
        if (!Util.isNullOrNil(str)) {
            str2 = "delete from fmessage_conversation where talker = '" + Util.escapeSqlValue(str) + "'";
        } else if (j <= 0) {
            return false;
        } else {
            str2 = "delete from fmessage_conversation where fmsgSysRowId = '" + j + "'";
        }
        if (!this.f212805d.execSQL("fmessage_conversation", str2)) {
            return false;
        }
        Log.m105925i("MicroMsg.FMessageConversationStorage", "deleteByTalker success, rowId: %d, talker: %s", Long.valueOf(j), str);
        doNotify(str);
        return true;
    }

    /* renamed from: Ow */
    public int mo101166Ow() {
        int i = 0;
        Cursor rawQuery = this.f212805d.rawQuery(String.format("select count(*) from %s where %s = 1 and %s < 2", new Object[]{"fmessage_conversation", "isNew", "fmsgIsSend"}), (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        Log.m105918d("MicroMsg.FMessageConversationStorage", "getNewCount = " + i);
        return i;
    }

    /* renamed from: SE */
    public boolean mo101167SE(String str) {
        if (str == null || str.length() == 0) {
            Log.m105928w("MicroMsg.FMessageConversationStorage", "unsetNew fail, talker is null");
            return false;
        }
        C72979k3 Yt = mo101169Yt(str);
        if (Yt == null || !str.equals(Yt.field_talker)) {
            Log.m105928w("MicroMsg.FMessageConversationStorage", "unsetNew fail, conversation does not exist, talker = " + str);
            return false;
        }
        Yt.field_fmsgIsHasShowSelfQRCode = 1;
        return super.update(Yt, new String[0]);
    }

    /* renamed from: TE */
    public boolean mo101168TE(String str) {
        if (str == null || str.length() == 0) {
            Log.m105928w("MicroMsg.FMessageConversationStorage", "unsetNew fail, talker is null");
            return false;
        }
        C72979k3 Yt = mo101169Yt(str);
        if (Yt == null || !str.equals(Yt.field_talker)) {
            Log.m105928w("MicroMsg.FMessageConversationStorage", "unsetNew fail, conversation does not exist, talker = " + str);
            return false;
        }
        Yt.field_isNew = 0;
        Yt.field_fmsgIsHasShowSelfQRCode = 1;
        return super.update(Yt, new String[0]);
    }

    /* renamed from: Yt */
    public C72979k3 mo101169Yt(String str) {
        if (str == null || str.length() == 0) {
            Log.m105928w("MicroMsg.FMessageConversationStorage", "get fail, talker is null");
            return null;
        }
        C72979k3 k3Var = new C72979k3();
        k3Var.field_talker = str;
        if (super.get(k3Var, new String[0])) {
            return k3Var;
        }
        Log.m105924i("MicroMsg.FMessageConversationStorage", "get fail, maybe not exist, talker = " + str);
        return null;
    }

    /* renamed from: bD */
    public int mo101170bD() {
        SingleTable singleTable = C78812i2.f230792y;
        Column column = C78812i2.f230793z;
        SelectSql build = singleTable.select((Column) column.count()).where(C78812i2.f230766B.equal((Number) 1).and(column.isNotNullOrEmpty()).and(C78812i2.f230768D.smallerThan((Number) 2)).and(C78812i2.f230769E.notEqual((Number) 1)).and(C78812i2.f230767C.equal((Number) 30))).build();
        Cursor rawQuery = this.f212805d.rawQuery(build.toSql(), build.getParams());
        int i = 0;
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        Log.m105918d("MicroMsg.FMessageConversationStorage", "getNewCount = " + i);
        return i;
    }

    /* renamed from: bF */
    public boolean mo101171bF(String str, int i) {
        if (str == null || str.length() == 0) {
            Log.m105928w("MicroMsg.FMessageConversationStorage", "updateState fail, talker is null");
            return false;
        }
        C72979k3 Yt = mo101169Yt(str);
        if (Yt == null) {
            Log.m105928w("MicroMsg.FMessageConversationStorage", "updateState fail, get fail, talker = " + str);
            return false;
        } else if (i == Yt.field_state) {
            Log.m105918d("MicroMsg.FMessageConversationStorage", "updateState, no need to update");
            return true;
        } else {
            Yt.field_state = i;
            Yt.field_lastModifiedTime = C31543z5.m39453c();
            if (!super.update(Yt, new String[0])) {
                return false;
            }
            doNotify(str);
            return true;
        }
    }

    public Cursor getAll() {
        return this.f212805d.rawQuery("select * from fmessage_conversation  ORDER BY lastModifiedTime DESC", (String[]) null);
    }

    public int getCount() {
        Cursor rawQuery = this.f212805d.rawQuery("select count(*) from fmessage_conversation", (String[]) null, 2);
        int i = 0;
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        Log.m105918d("MicroMsg.FMessageConversationStorage", "getCount = " + i);
        return i;
    }

    /* renamed from: jo */
    public boolean mo101172jo() {
        if (this.f212805d.execSQL("fmessage_conversation", "update fmessage_conversation set isNew = 0")) {
            Log.m105918d("MicroMsg.FMessageConversationStorage", "clearAllNew success");
            doNotify();
            return true;
        }
        Log.m105920e("MicroMsg.FMessageConversationStorage", "clearAllNew fail");
        return false;
    }

    /* renamed from: kD */
    public List<C72979k3> mo101173kD(int i) {
        Log.m105927v("MicroMsg.FMessageConversationStorage", "getNewLimit, limit = %d", Integer.valueOf(i));
        return C78812i2.f230792y.selectAll().where(C78812i2.f230766B.equal((Number) 1).and(C78812i2.f230793z.isNotNullOrEmpty()).and(C78812i2.f230768D.smallerThan((Number) 2)).and(C78812i2.f230769E.notEqual((Number) 1)).and(C78812i2.f230767C.equal((Number) 30))).orderBy(C78812i2.f230765A.orderDesc()).limit(i, 0).build().multiQuery(this.f212805d, C72979k3.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01fc, code lost:
        if (r0.field_type == 2) goto L_0x01fe;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x04fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotifyChange(java.lang.String r19, com.tencent.p014mm.sdk.storage.MStorageEventData r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            java.lang.String r4 = "MicroMsg.FMessageConversationStorage"
            if (r2 == 0) goto L_0x051d
            int r0 = r19.length()
            if (r0 != 0) goto L_0x0012
            goto L_0x051d
        L_0x0012:
            r5 = 0
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r2, r5)     // Catch:{ Exception -> 0x0019 }
            goto L_0x003c
        L_0x0019:
            r0 = move-exception
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "onNotifyChange, id = "
            r0.append(r8)
            r0.append(r2)
            java.lang.String r2 = ", ex = "
            r0.append(r2)
            java.lang.String r2 = r7.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            r7 = r5
        L_0x003c:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "onNotifyChange fail, sysRowId is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            return
        L_0x0046:
            f40.e r0 = f40.C86709a0.m107523b()
            boolean r0 = r0.mo121114l()
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = "onNotifyChange, account not ready, can not insert fmessageconversation"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            return
        L_0x0056:
            com.tencent.mm.storage.m3 r0 = new com.tencent.mm.storage.m3
            r0.<init>()
            k40.a r2 = f40.C86709a0.m107533q(r3)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.h r2 = r2.mo96104vj()
            com.tencent.mm.storage.n3 r2 = (com.tencent.p014mm.storage.C72987n3) r2
            boolean r2 = r2.get((long) r7, r0)
            if (r2 != 0) goto L_0x0082
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onNotifyChange, get fail, id = "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            return
        L_0x0082:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "onNotifyChange succ, sysRowId = "
            r2.append(r5)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r2)
            k40.a r2 = f40.C86709a0.m107533q(r3)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.g r2 = r2.mo96096M5()
            java.lang.String r5 = r0.field_talker
            com.tencent.mm.storage.l3 r2 = (com.tencent.p014mm.storage.C72982l3) r2
            com.tencent.mm.storage.k3 r2 = r2.mo101169Yt(r5)
            java.lang.String r5 = "send, field_state = %s, fmsgConv.field_recvFmsgType = %s，new friend field_contentVerifyContent: %s"
            java.lang.String r6 = "send, field_state = %s, fmsgConv.field_recvFmsgType = %s，new friend field_contentVerifyContent: "
            java.lang.String r9 = "receive, new friend Username: "
            java.lang.String r10 = "new friend Nickname: "
            r11 = 4
            r12 = 3
            r14 = 0
            r15 = 1
            if (r2 != 0) goto L_0x0276
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r13 = "onNotifyChange, fmessage conversation does not exist, insert a new one, talker = "
            r2.append(r13)
            java.lang.String r13 = r0.field_talker
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            java.lang.String r2 = r0.field_talker
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x00da
            java.lang.String r0 = "onNotifyChange, fmessage info talker is null, quit insert fmessage conversation."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            return
        L_0x00da:
            com.tencent.mm.storage.k3 r2 = new com.tencent.mm.storage.k3
            r2.<init>()
            int r13 = r0.field_type
            if (r13 != 0) goto L_0x0137
            java.lang.String r9 = r0.field_msgContent
            com.tencent.mm.storage.f4$b r9 = com.tencent.p014mm.storage.C72963f4.C72964b.m85654f(r9)
            java.lang.String r13 = r9.mo101025b()
            r2.field_displayName = r13
            int r13 = r9.f212681g
            if (r13 != r11) goto L_0x00ff
            java.lang.String r11 = r9.mo101028e()
            if (r11 == 0) goto L_0x00ff
            java.lang.String r11 = r9.mo101028e()
            r2.field_displayName = r11
        L_0x00ff:
            int r11 = r9.f212681g
            r2.field_addScene = r11
            r2.field_isNew = r15
            r2.field_fmsgIsHasShowSelfQRCode = r14
            java.lang.String r11 = r9.f212675a
            r2.field_contentFromUsername = r11
            java.lang.String r11 = r9.f212676b
            r2.field_contentNickname = r11
            java.lang.String r11 = r9.f212682h
            r2.field_contentPhoneNumMD5 = r11
            java.lang.String r9 = r9.f212683i
            r2.field_contentFullPhoneNumMD5 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "push, new friend Username: "
            r9.append(r11)
            java.lang.String r11 = r2.field_contentFromUsername
            r9.append(r11)
            r9.append(r10)
            java.lang.String r10 = r2.field_contentNickname
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            goto L_0x01c8
        L_0x0137:
            boolean r11 = r0.mo101179l2()
            if (r11 == 0) goto L_0x017a
            java.lang.String r11 = r0.field_msgContent
            com.tencent.mm.storage.f4$h r11 = com.tencent.p014mm.storage.C72963f4.C72971h.m85668v(r11)
            java.lang.String r13 = r11.mo101038e()
            r2.field_displayName = r13
            int r13 = r11.f212744h
            r2.field_addScene = r13
            r2.field_isNew = r15
            r2.field_fmsgIsHasShowSelfQRCode = r14
            java.lang.String r13 = r11.f212737a
            r2.field_contentFromUsername = r13
            java.lang.String r13 = r11.f212739c
            r2.field_contentNickname = r13
            java.lang.String r11 = r11.f212742f
            r2.field_contentVerifyContent = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            java.lang.String r9 = r2.field_contentFromUsername
            r11.append(r9)
            r11.append(r10)
            java.lang.String r9 = r2.field_contentNickname
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            goto L_0x01c8
        L_0x017a:
            int r9 = r0.field_isSend
            if (r9 != r15) goto L_0x01c8
            int r9 = r0.field_type
            if (r9 != r15) goto L_0x01c8
            java.lang.String r9 = r0.field_msgContent
            com.tencent.mm.storage.f4$h r9 = com.tencent.p014mm.storage.C72963f4.C72971h.m85668v(r9)
            java.lang.String r11 = r9.f212737a
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x01c8
            java.lang.String r11 = r9.mo101038e()
            r2.field_displayName = r11
            int r11 = r9.f212744h
            r2.field_addScene = r11
            r2.field_isNew = r14
            r2.field_fmsgIsHasShowSelfQRCode = r15
            java.lang.String r11 = r9.f212737a
            r2.field_contentFromUsername = r11
            java.lang.String r11 = r9.f212739c
            r2.field_contentNickname = r11
            java.lang.String r9 = r9.f212742f
            r2.field_contentVerifyContent = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "send, new friend Username: "
            r9.append(r11)
            java.lang.String r11 = r2.field_contentFromUsername
            r9.append(r11)
            r9.append(r10)
            java.lang.String r10 = r2.field_contentNickname
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
        L_0x01c8:
            long r9 = eb0.C31543z5.m39453c()
            r2.field_lastModifiedTime = r9
            java.lang.String r9 = r0.field_talker
            r2.field_talker = r9
            java.lang.String r9 = r0.field_encryptTalker
            r2.field_encryptTalker = r9
            r2.field_fmsgSysRowId = r7
            int r7 = r0.field_isSend
            r2.field_fmsgIsSend = r7
            int r8 = r0.field_type
            r2.field_fmsgType = r8
            java.lang.String r9 = r0.field_msgContent
            r2.field_fmsgContent = r9
            if (r7 != r15) goto L_0x01e8
            if (r8 == r15) goto L_0x01f3
        L_0x01e8:
            boolean r7 = r0.mo101179l2()
            if (r7 == 0) goto L_0x01f5
            int r7 = r0.field_type
            if (r7 == r12) goto L_0x01f3
            goto L_0x01f5
        L_0x01f3:
            r9 = 2
            goto L_0x01fe
        L_0x01f5:
            int r7 = r0.field_isSend
            if (r7 != r15) goto L_0x021c
            int r8 = r0.field_type
            r9 = 2
            if (r8 != r9) goto L_0x021c
        L_0x01fe:
            r2.field_state = r9
            int r0 = r0.field_type
            r2.field_recvFmsgType = r0
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r0[r14] = r5
            int r5 = r2.field_recvFmsgType
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r15] = r5
            java.lang.String r5 = r2.field_contentVerifyContent
            r0[r9] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r0)
            goto L_0x024f
        L_0x021c:
            if (r7 != r15) goto L_0x0227
            int r6 = r0.field_type
            if (r6 != r12) goto L_0x0227
            r2.field_state = r14
            r2.field_recvFmsgType = r6
            goto L_0x024f
        L_0x0227:
            r2.field_state = r14
            boolean r6 = r0.mo101179l2()
            if (r6 == 0) goto L_0x0232
            int r0 = r0.field_type
            goto L_0x0233
        L_0x0232:
            r0 = 0
        L_0x0233:
            r2.field_recvFmsgType = r0
            java.lang.Object[] r0 = new java.lang.Object[r12]
            int r6 = r2.field_state
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r14] = r6
            int r6 = r2.field_recvFmsgType
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r15] = r6
            java.lang.String r6 = r2.field_contentVerifyContent
            r7 = 2
            r0[r7] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r0)
        L_0x024f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "field_fmsgContent: "
            r0.append(r5)
            java.lang.String r5 = r2.field_fmsgContent
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            k40.a r0 = f40.C86709a0.m107533q(r3)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.g r0 = r0.mo96096M5()
            com.tencent.mm.storage.l3 r0 = (com.tencent.p014mm.storage.C72982l3) r0
            r0.insert(r2)
            goto L_0x0510
        L_0x0276:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r12 = "onNotifyChange, fmessage conversation has existed, talker = "
            r13.append(r12)
            java.lang.String r12 = r0.field_talker
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r12)
            boolean r12 = r0.mo101179l2()
            if (r12 == 0) goto L_0x0296
            r2.field_isNew = r15
            r2.field_fmsgIsHasShowSelfQRCode = r14
        L_0x0296:
            java.lang.Class<lc3.b> r12 = lc3.C10485b.class
            k40.a r12 = f40.C86709a0.m107533q(r12)
            lc3.b r12 = (lc3.C10485b) r12
            pj.f r12 = r12.vh0()
            r13 = 259200(0x3f480, float:3.63217E-40)
            java.lang.String r15 = "VerifyUserTicketTimeExceed"
            int r12 = r12.mo107404b(r15, r13)
            long r12 = (long) r12
            r16 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r16
            long r16 = eb0.C31543z5.m39453c()
            long r14 = r2.field_lastModifiedTime
            long r16 = r16 - r14
            int r14 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x02be
            r14 = 1
            goto L_0x02bf
        L_0x02be:
            r14 = 0
        L_0x02bf:
            int r15 = r2.field_state
            r11 = 2
            if (r15 != r11) goto L_0x02c8
            if (r14 == 0) goto L_0x02c8
            r11 = 1
            goto L_0x02c9
        L_0x02c8:
            r11 = 0
        L_0x02c9:
            r14 = 4
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 0
            r14[r13] = r12
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)
            r13 = 1
            r14[r13] = r12
            int r12 = r0.field_type
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 2
            r14[r13] = r12
            int r12 = r2.field_addScene
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 3
            r14[r13] = r12
            java.lang.String r12 = "expired time , defaultExpireTime = %s, isWaitingVerfyTimeOut = %s, fmsgInfo.field_type = %s, fmsgConv.field_addScene = %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r12, r14)
            long r12 = eb0.C31543z5.m39453c()
            r2.field_lastModifiedTime = r12
            java.lang.String r12 = r0.field_encryptTalker
            r2.field_encryptTalker = r12
            r2.field_fmsgSysRowId = r7
            int r7 = r0.field_isSend
            r2.field_fmsgIsSend = r7
            int r7 = r0.field_type
            r2.field_fmsgType = r7
            java.lang.String r8 = r0.field_msgContent
            r2.field_fmsgContent = r8
            if (r7 != 0) goto L_0x033f
            com.tencent.mm.storage.f4$b r7 = com.tencent.p014mm.storage.C72963f4.C72964b.m85654f(r8)
            java.lang.String r8 = r7.f212675a
            r2.field_contentFromUsername = r8
            java.lang.String r8 = r7.f212676b
            r2.field_contentNickname = r8
            java.lang.String r8 = r7.f212682h
            r2.field_contentPhoneNumMD5 = r8
            java.lang.String r7 = r7.f212683i
            r2.field_contentFullPhoneNumMD5 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "TYPE_SYSTEM_PUSH, new friend Username: "
            r7.append(r8)
            java.lang.String r8 = r2.field_contentFromUsername
            r7.append(r8)
            r7.append(r10)
            java.lang.String r8 = r2.field_contentNickname
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            goto L_0x0467
        L_0x033f:
            boolean r7 = r0.mo101179l2()
            if (r7 == 0) goto L_0x03fb
            int r7 = r0.field_isSend
            r8 = 2
            if (r7 < r8) goto L_0x034c
            r7 = 1
            goto L_0x034d
        L_0x034c:
            r7 = 0
        L_0x034d:
            if (r7 != 0) goto L_0x03fb
            java.lang.String r7 = r0.field_msgContent
            com.tencent.mm.storage.f4$h r7 = com.tencent.p014mm.storage.C72963f4.C72971h.m85668v(r7)
            java.lang.String r8 = r7.f212742f
            r2.field_contentVerifyContent = r8
            java.lang.String r8 = r7.f212737a
            r2.field_contentFromUsername = r8
            java.lang.String r8 = r7.f212739c
            r2.field_contentNickname = r8
            int r7 = r7.f212744h
            r2.field_addScene = r7
            int r7 = r2.field_state
            int r8 = r2.field_recvFmsgType
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "field_contentVerifyContent: "
            r9.append(r10)
            java.lang.String r10 = r2.field_contentVerifyContent
            r9.append(r10)
            java.lang.String r10 = ", receive, new friend Username: "
            r9.append(r10)
            java.lang.String r10 = r2.field_contentFromUsername
            r9.append(r10)
            java.lang.String r10 = ", new friend Nickname: "
            r9.append(r10)
            java.lang.String r10 = r2.field_contentNickname
            r9.append(r10)
            java.lang.String r10 = ", preKey = "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = ", fmsgConv.field_state = "
            r9.append(r7)
            int r7 = r2.field_state
            r9.append(r7)
            java.lang.String r7 = ", fmsgInfo.field_type = "
            r9.append(r7)
            int r7 = r0.field_type
            r9.append(r7)
            java.lang.String r7 = ", prrecyType = "
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = ", isWaitingVerfyTimeOut  = "
            r9.append(r7)
            r9.append(r11)
            java.lang.String r7 = ", fmsgConv.field_addScene = "
            r9.append(r7)
            int r7 = r2.field_addScene
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            int r7 = r2.field_recvFmsgType
            r8 = 3
            if (r7 == r8) goto L_0x03e5
            java.lang.String r7 = r2.field_contentFromUsername
            java.lang.String r8 = r2.field_contentNickname
            com.tencent.mm.autogen.events.NotifyNewFriendRequestEvent r9 = new com.tencent.mm.autogen.events.NotifyNewFriendRequestEvent
            r9.<init>()
            com.tencent.mm.autogen.events.NotifyNewFriendRequestEvent$a r10 = r9.f107665d
            r10.f107666a = r7
            r10.f107667b = r8
            r7 = 1
            r10.f107668c = r7
            r9.publish()
            goto L_0x0467
        L_0x03e5:
            java.lang.String r7 = r2.field_contentFromUsername
            java.lang.String r8 = r2.field_contentNickname
            com.tencent.mm.autogen.events.NotifyNewFriendRequestEvent r9 = new com.tencent.mm.autogen.events.NotifyNewFriendRequestEvent
            r9.<init>()
            com.tencent.mm.autogen.events.NotifyNewFriendRequestEvent$a r10 = r9.f107665d
            r10.f107666a = r7
            r10.f107667b = r8
            r7 = 2
            r10.f107668c = r7
            r9.publish()
            goto L_0x0467
        L_0x03fb:
            r7 = 2
            int r8 = r0.field_isSend
            r11 = 1
            if (r8 != r11) goto L_0x0467
            int r8 = r0.field_type
            if (r8 == r7) goto L_0x0407
            if (r8 != r11) goto L_0x0467
        L_0x0407:
            java.lang.String r7 = r0.field_msgContent
            com.tencent.mm.storage.f4$h r7 = com.tencent.p014mm.storage.C72963f4.C72971h.m85668v(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "2 field_state = "
            r8.append(r11)
            int r11 = r2.field_state
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            int r8 = r0.field_type
            r2.field_recvFmsgType = r8
            java.lang.String r8 = r7.f212737a
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0467
            java.lang.String r8 = r7.mo101038e()
            r2.field_displayName = r8
            int r8 = r7.f212744h
            r2.field_addScene = r8
            r8 = 0
            r2.field_isNew = r8
            r8 = 1
            r2.field_fmsgIsHasShowSelfQRCode = r8
            java.lang.String r8 = r7.f212737a
            r2.field_contentFromUsername = r8
            java.lang.String r8 = r7.f212739c
            r2.field_contentNickname = r8
            java.lang.String r7 = r7.f212742f
            r2.field_contentVerifyContent = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            java.lang.String r8 = r2.field_contentFromUsername
            r7.append(r8)
            r7.append(r10)
            java.lang.String r8 = r2.field_contentNickname
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
        L_0x0467:
            int r7 = r0.field_isSend
            r8 = 1
            if (r7 != r8) goto L_0x0470
            int r7 = r0.field_type
            if (r7 == r8) goto L_0x047c
        L_0x0470:
            boolean r7 = r0.mo101179l2()
            if (r7 == 0) goto L_0x047e
            int r7 = r0.field_type
            r8 = 3
            if (r7 == r8) goto L_0x047c
            goto L_0x047e
        L_0x047c:
            r9 = 2
            goto L_0x0488
        L_0x047e:
            int r7 = r0.field_isSend
            r8 = 1
            if (r7 != r8) goto L_0x04aa
            int r8 = r0.field_type
            r9 = 2
            if (r8 != r9) goto L_0x04a9
        L_0x0488:
            r2.field_state = r9
            int r0 = r0.field_type
            r2.field_recvFmsgType = r0
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r7 = 0
            r0[r7] = r5
            int r5 = r2.field_recvFmsgType
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8 = 1
            r0[r8] = r5
            java.lang.String r5 = r2.field_contentVerifyContent
            r0[r9] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r0)
            goto L_0x04e2
        L_0x04a9:
            r8 = 1
        L_0x04aa:
            if (r7 != r8) goto L_0x04b7
            int r6 = r0.field_type
            r7 = 3
            if (r6 != r7) goto L_0x04b7
            r7 = 0
            r2.field_state = r7
            r2.field_recvFmsgType = r6
            goto L_0x04e2
        L_0x04b7:
            r7 = 0
            r2.field_state = r7
            boolean r6 = r0.mo101179l2()
            if (r6 == 0) goto L_0x04c3
            int r0 = r0.field_type
            goto L_0x04c4
        L_0x04c3:
            r0 = 0
        L_0x04c4:
            r2.field_recvFmsgType = r0
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r6 = r2.field_state
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r7] = r6
            int r6 = r2.field_recvFmsgType
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 1
            r0[r7] = r6
            java.lang.String r6 = r2.field_contentVerifyContent
            r7 = 2
            r0[r7] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r0)
        L_0x04e2:
            k40.a r0 = f40.C86709a0.m107533q(r3)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.g r0 = r0.mo96096M5()
            com.tencent.mm.storage.l3 r0 = (com.tencent.p014mm.storage.C72982l3) r0
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            r0.update(r2, (java.lang.String[]) r3)
            int r0 = r18.mo101166Ow()
            if (r0 != 0) goto L_0x0510
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r2 = 340225(0x53101, float:4.76757E-40)
            long r3 = eb0.C31543z5.m39453c()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.mo119676J(r2, r3)
        L_0x0510:
            java.lang.Runnable r0 = r1.f212807f
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r0)
            java.lang.Runnable r0 = r1.f212807f
            r2 = 500(0x1f4, double:2.47E-321)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r2)
            return
        L_0x051d:
            java.lang.String r0 = "onNotifyChange, id is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C72982l3.onNotifyChange(java.lang.String, com.tencent.mm.sdk.storage.MStorageEventData):void");
    }

    /* renamed from: qq */
    public C72979k3 mo101174qq(String str) {
        C72979k3 k3Var = null;
        if (str == null || str.length() == 0) {
            Log.m105928w("MicroMsg.FMessageConversationStorage", "get fail, encryptTalker is null");
            return null;
        }
        Cursor rawQuery = this.f212805d.rawQuery("select * from fmessage_conversation  where encryptTalker=" + C91753f.m115264e(str), (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            k3Var = new C72979k3();
            k3Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return k3Var;
    }
}
