package i61;

import android.database.Cursor;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import j61.C33523r;
import java.util.HashMap;
import lc3.C10485b;
import p441aq.C92054g;
import wh3.C38143r;

/* renamed from: i61.j */
public class C33213j {

    /* renamed from: a */
    public final boolean[] f90111a = {false};

    /* renamed from: b */
    public volatile boolean f90112b = true;

    /* renamed from: c */
    public long f90113c;

    /* renamed from: d */
    public int f90114d;

    /* renamed from: e */
    public int f90115e;

    /* renamed from: f */
    public C38143r f90116f;

    /* renamed from: g */
    public HashMap<String, C38143r> f90117g = new HashMap<>();

    /* renamed from: i61.j$a */
    public class C33214a implements Runnable {
        public C33214a() {
        }

        public void run() {
            Class cls = C92054g.class;
            if (C33213j.this.f90112b) {
                C33213j jVar = C33213j.this;
                jVar.getClass();
                ((C92054g) C86312j.m106911c(cls)).getClass();
                if (C30790w2.m39221h().mo57716c() != null) {
                    synchronized (jVar) {
                        ((C92054g) C86312j.m106911c(cls)).getClass();
                        jVar.f90116f = C30790w2.m39221h().mo57716c().mo61541jo();
                    }
                }
                C33213j jVar2 = C33213j.this;
                jVar2.getClass();
                Cursor cursor = null;
                try {
                    ((C92054g) C86312j.m106911c(cls)).getClass();
                    cursor = C30790w2.m39221h().mo57716c().getAll();
                    if (cursor != null && cursor.moveToFirst()) {
                        synchronized (jVar2) {
                            do {
                                C38143r rVar = new C38143r();
                                rVar.convertFrom(cursor);
                                jVar2.f90117g.put(rVar.field_prodcutID, rVar);
                            } while (cursor.moveToNext());
                        }
                    }
                    if (cursor == null) {
                    }
                } catch (Exception e) {
                    try {
                        Log.m105928w("MicroMsg.emoji.EmojiRewardTipMgr", Util.stackTraceToString(e));
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                }
            }
        }
    }

    public C33213j() {
        synchronized (this) {
            this.f90113c = 863913600000L;
            this.f90114d = 19;
            this.f90115e = 79;
            this.f90116f = null;
            this.f90117g = new HashMap<>();
        }
    }

    /* renamed from: a */
    public final void mo59027a() {
        Class cls = C10485b.class;
        String c = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("EmotionRewardTipsLimit");
        if (!Util.isNullOrNil(c)) {
            Log.m105925i("MicroMsg.emoji.EmojiRewardTipMgr", "updateConfig dynamic config %s", c);
            String[] split = c.split(",");
            if (split != null && split.length == 3) {
                synchronized (this) {
                    this.f90113c = Util.getInt(split[0], 0) == 0 ? 863913600000L : ((long) Util.getInt(split[0], 0)) * 86400000;
                    this.f90114d = Util.getInt(split[1], 20) - 1;
                    this.f90115e = Util.getInt(split[2], 80) - 1;
                }
            }
        }
        boolean z = (((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("EmotionRewardOption", 0) & 2) != 2;
        boolean booleanValue = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EMOJI_REWARD_TIP_ENABLE_BOOLEAN, Boolean.TRUE)).booleanValue();
        this.f90112b = z && booleanValue;
        Log.m105925i("MicroMsg.emoji.EmojiRewardTipMgr", "init RewardTipMgr RewardTipEnable:%b isEnableRewardTip:%b isTipsEnable:%b", Boolean.valueOf(this.f90112b), Boolean.valueOf(z), Boolean.valueOf(booleanValue));
        C86709a0.m107525e().postToWorker(new C33214a());
    }

    /* renamed from: b */
    public synchronized boolean mo59028b(String str) {
        C38143r rVar;
        C38143r rVar2;
        int i;
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip product id is null.");
            return false;
        } else if (this.f90112b || C75592q0.m90761I()) {
            HashMap<String, C38143r> hashMap = this.f90117g;
            if (hashMap == null || !hashMap.containsKey(str)) {
                rVar = new C38143r();
                rVar.field_prodcutID = str;
            } else {
                rVar = this.f90117g.get(str);
            }
            if (System.currentTimeMillis() - rVar.field_showTipsTime < this.f90113c) {
                Log.m105924i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip in cool down time.");
                mo59029c();
                return false;
            }
            if (System.currentTimeMillis() - rVar.field_setFlagTime > 86400000) {
                C38143r rVar3 = this.f90116f;
                if (rVar3 != null && str.equalsIgnoreCase(rVar3.field_prodcutID)) {
                    int i2 = this.f90116f.field_continuCount;
                    int i3 = this.f90114d;
                    if (i2 >= i3 - 1 && i2 <= (i3 + 5) - 1) {
                        C86709a0.m107529k().f251779b.mo123460f(new C33523r(str, 1));
                    }
                }
                int i4 = rVar.field_totalCount;
                int i5 = this.f90115e;
                if (i4 >= i5 - 1 && i4 <= (i5 + 5) - 1) {
                    C86709a0.m107529k().f251779b.mo123460f(new C33523r(str, 1));
                }
            } else {
                Object[] objArr = new Object[2];
                C38143r rVar4 = this.f90116f;
                objArr[0] = Integer.valueOf(rVar4 == null ? 0 : rVar4.field_continuCount);
                C38143r rVar5 = this.f90116f;
                objArr[1] = Integer.valueOf(rVar5 == null ? 0 : rVar5.field_totalCount);
                Log.m105919d("MicroMsg.emoji.EmojiRewardTipMgr", "no need to get reward today. continue count:%d total count:%d", objArr);
            }
            C38143r rVar6 = this.f90116f;
            if (rVar6 != null && str.equalsIgnoreCase(rVar6.field_prodcutID) && (i = rVar2.field_continuCount) >= this.f90114d) {
                int i6 = (rVar2 = this.f90116f).field_flag;
                if ((i6 & 1) != 1 || (i6 & 2) == 2) {
                    Log.m105925i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip:%b productid:%s  continue count:%d flag:%d", Boolean.FALSE, str, Integer.valueOf(i), Integer.valueOf(this.f90116f.field_flag));
                    mo59030d(rVar, false);
                    return false;
                }
                Log.m105925i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip:%b productid:%s  continue count:%d", Boolean.TRUE, str, Integer.valueOf(i));
                mo59030d(rVar, true);
                C115669n.INSTANCE.mo160131h(12953, 0, this.f90116f.field_prodcutID);
                return true;
            } else if (rVar.field_totalCount >= this.f90115e) {
                int i7 = rVar.field_flag;
                if ((i7 & 1) != 1 || (i7 & 2) == 2) {
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = Boolean.FALSE;
                    objArr2[1] = str;
                    C38143r rVar7 = this.f90116f;
                    objArr2[2] = Integer.valueOf(rVar7 == null ? 0 : rVar7.field_totalCount);
                    C38143r rVar8 = this.f90116f;
                    objArr2[3] = Integer.valueOf(rVar8 == null ? 0 : rVar8.field_flag);
                    Log.m105925i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip:%b productid:%s  total count :%d flag:%d", objArr2);
                    mo59030d(rVar, false);
                    return false;
                }
                Object[] objArr3 = new Object[3];
                objArr3[0] = Boolean.TRUE;
                objArr3[1] = str;
                C38143r rVar9 = this.f90116f;
                objArr3[2] = Integer.valueOf(rVar9 == null ? 0 : rVar9.field_totalCount);
                Log.m105925i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip:%b productid:%s  total count :%d", objArr3);
                mo59030d(rVar, true);
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr4 = new Object[2];
                objArr4[0] = 0;
                C38143r rVar10 = this.f90116f;
                objArr4[1] = rVar10 == null ? "" : rVar10.field_prodcutID;
                nVar.mo160131h(12953, objArr4);
                return true;
            } else {
                mo59030d(rVar, false);
                return false;
            }
        } else {
            Log.m105925i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip reward tip is disable. mRewardTipEnable:%b isOpenForWallet:%b", Boolean.valueOf(this.f90112b), Boolean.valueOf(C75592q0.m90761I()));
            return false;
        }
    }

    /* renamed from: c */
    public void mo59029c() {
        synchronized (this) {
            C38143r rVar = this.f90116f;
            if (rVar != null) {
                rVar.field_continuCount = 0;
                this.f90117g.put(rVar.field_prodcutID, rVar);
                ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
                C30790w2.m39221h().mo57716c().mo61540Lo(this.f90116f);
                this.f90116f = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo59030d(wh3.C38143r r8, boolean r9) {
        /*
            r7 = this;
            java.lang.Class<aq.g> r0 = p441aq.C92054g.class
            monitor-enter(r7)
            if (r8 != 0) goto L_0x000f
            java.lang.String r8 = "MicroMsg.emoji.EmojiRewardTipMgr"
            java.lang.String r9 = "updateLastRewardTipInfo failed. reward tip info is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r9)     // Catch:{ all -> 0x0091 }
            monitor-exit(r7)
            return
        L_0x000f:
            wh3.r r1 = r7.f90116f     // Catch:{ all -> 0x0091 }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0022
            java.lang.String r1 = r1.field_prodcutID     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = r8.field_prodcutID     // Catch:{ all -> 0x0091 }
            boolean r1 = r1.equalsIgnoreCase(r4)     // Catch:{ all -> 0x0091 }
            if (r1 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r1 = 0
            goto L_0x0023
        L_0x0022:
            r1 = 1
        L_0x0023:
            if (r1 != 0) goto L_0x0046
            wh3.r r4 = r7.f90116f     // Catch:{ all -> 0x0091 }
            r4.field_continuCount = r2     // Catch:{ all -> 0x0091 }
            java.util.HashMap<java.lang.String, wh3.r> r5 = r7.f90117g     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = r4.field_prodcutID     // Catch:{ all -> 0x0091 }
            r5.put(r6, r4)     // Catch:{ all -> 0x0091 }
            di3.d r4 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0091 }
            aq.g r4 = (p441aq.C92054g) r4     // Catch:{ all -> 0x0091 }
            r4.getClass()     // Catch:{ all -> 0x0091 }
            com.tencent.mm.storage.w2 r4 = com.tencent.p014mm.storage.C30790w2.m39221h()     // Catch:{ all -> 0x0091 }
            wh3.s r4 = r4.mo57716c()     // Catch:{ all -> 0x0091 }
            wh3.r r5 = r7.f90116f     // Catch:{ all -> 0x0091 }
            r4.mo61540Lo(r5)     // Catch:{ all -> 0x0091 }
        L_0x0046:
            r7.f90116f = r8     // Catch:{ all -> 0x0091 }
            if (r9 == 0) goto L_0x005b
            r3 = 0
            r8.field_modifyTime = r3     // Catch:{ all -> 0x0091 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0091 }
            r8.field_showTipsTime = r3     // Catch:{ all -> 0x0091 }
            wh3.r r8 = r7.f90116f     // Catch:{ all -> 0x0091 }
            r8.field_totalCount = r2     // Catch:{ all -> 0x0091 }
            r8.field_continuCount = r2     // Catch:{ all -> 0x0091 }
            goto L_0x0070
        L_0x005b:
            if (r1 == 0) goto L_0x0063
            int r9 = r8.field_continuCount     // Catch:{ all -> 0x0091 }
            int r9 = r9 + r3
            r8.field_continuCount = r9     // Catch:{ all -> 0x0091 }
            goto L_0x0065
        L_0x0063:
            r8.field_continuCount = r3     // Catch:{ all -> 0x0091 }
        L_0x0065:
            int r9 = r8.field_totalCount     // Catch:{ all -> 0x0091 }
            int r9 = r9 + r3
            r8.field_totalCount = r9     // Catch:{ all -> 0x0091 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0091 }
            r8.field_modifyTime = r1     // Catch:{ all -> 0x0091 }
        L_0x0070:
            java.util.HashMap<java.lang.String, wh3.r> r8 = r7.f90117g     // Catch:{ all -> 0x0091 }
            wh3.r r9 = r7.f90116f     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = r9.field_prodcutID     // Catch:{ all -> 0x0091 }
            r8.put(r1, r9)     // Catch:{ all -> 0x0091 }
            di3.d r8 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0091 }
            aq.g r8 = (p441aq.C92054g) r8     // Catch:{ all -> 0x0091 }
            r8.getClass()     // Catch:{ all -> 0x0091 }
            com.tencent.mm.storage.w2 r8 = com.tencent.p014mm.storage.C30790w2.m39221h()     // Catch:{ all -> 0x0091 }
            wh3.s r8 = r8.mo57716c()     // Catch:{ all -> 0x0091 }
            wh3.r r9 = r7.f90116f     // Catch:{ all -> 0x0091 }
            r8.mo61540Lo(r9)     // Catch:{ all -> 0x0091 }
            monitor-exit(r7)
            return
        L_0x0091:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i61.C33213j.mo59030d(wh3.r, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo59031e(java.lang.String r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0011
            java.lang.String r4 = "MicroMsg.emoji.EmojiRewardTipMgr"
            java.lang.String r5 = "updateProductFlag failed. no such product id."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r5)     // Catch:{ all -> 0x0044 }
            monitor-exit(r3)
            return
        L_0x0011:
            java.util.HashMap<java.lang.String, wh3.r> r0 = r3.f90117g     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0034
            java.util.HashMap<java.lang.String, wh3.r> r0 = r3.f90117g     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0044 }
            wh3.r r0 = (wh3.C38143r) r0     // Catch:{ all -> 0x0044 }
            r0.field_flag = r5     // Catch:{ all -> 0x0044 }
            java.util.HashMap<java.lang.String, wh3.r> r5 = r3.f90117g     // Catch:{ all -> 0x0044 }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x0044 }
            wh3.r r4 = (wh3.C38143r) r4     // Catch:{ all -> 0x0044 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0044 }
            r4.field_setFlagTime = r0     // Catch:{ all -> 0x0044 }
            goto L_0x0042
        L_0x0034:
            java.lang.String r5 = "MicroMsg.emoji.EmojiRewardTipMgr"
            java.lang.String r0 = "updateProductFlag map no contains this product id :%s"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0044 }
            r2 = 0
            r1[r2] = r4     // Catch:{ all -> 0x0044 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r1)     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r3)
            return
        L_0x0044:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i61.C33213j.mo59031e(java.lang.String, int):void");
    }
}
