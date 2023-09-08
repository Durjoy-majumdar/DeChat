package ik1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import eb0.C75592q0;
import er1.C58739j4;
import gy3.C8480h;
import gy3.C87412m;
import hg1.C8527b;
import ig1.C8915b;
import java.util.Map;
import java.util.Set;
import ok1.C62042e;
import p749xh.C38572h3;

/* renamed from: ik1.b */
public final class C8923b extends C8527b {

    /* renamed from: e */
    public final ISQLiteDatabase f28223e;

    /* renamed from: f */
    public volatile boolean f28224f;

    /* renamed from: g */
    public final LruCache<Long, C8924a> f28225g;

    /* renamed from: ik1.b$a */
    public static final class C8924a {

        /* renamed from: a */
        public long f28226a;

        /* renamed from: b */
        public int f28227b;

        /* renamed from: c */
        public int f28228c;

        /* renamed from: d */
        public int f28229d;

        /* renamed from: e */
        public int f28230e;

        public C8924a() {
            this(0, 0, 0, 0, 0, 31, (C8480h) null);
        }

        public C8924a(long j, int i, int i2, int i3, int i4) {
            this.f28226a = j;
            this.f28227b = i;
            this.f28228c = i2;
            this.f28229d = i3;
            this.f28230e = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8924a)) {
                return false;
            }
            C8924a aVar = (C8924a) obj;
            return this.f28226a == aVar.f28226a && this.f28227b == aVar.f28227b && this.f28228c == aVar.f28228c && this.f28229d == aVar.f28229d && this.f28230e == aVar.f28230e;
        }

        public int hashCode() {
            long j = this.f28226a;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + this.f28227b) * 31) + this.f28228c) * 31) + this.f28229d) * 31) + this.f28230e;
        }

        public String toString() {
            return "liveId:" + this.f28226a + ",time:(" + this.f28227b + ", " + this.f28228c + "),payForLive:" + this.f28229d + ",invalid:" + this.f28230e;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C8924a(long j, int i, int i2, int i3, int i4, int i5, C8480h hVar) {
            this((i5 & 1) != 0 ? 0 : j, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8923b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C8915b.f28210v, "FinderLiveChargeInfo", C38572h3.f102416j);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C8915b.f28210v;
        this.f28223e = iSQLiteDatabase;
        this.f28225g = new LruCache<>(C58739j4.f168176a.mo83692U() ? 5 : 600);
    }

    /* renamed from: Lo */
    public void mo9437Lo() {
        boolean isEmpty = this.f28225g.entrySet().isEmpty();
        if (isEmpty) {
            Cursor rawQuery = this.f28223e.rawQuery("SELECT * FROM FinderLiveChargeInfo", (String[]) null, 2);
            while (rawQuery.moveToNext()) {
                C8915b bVar = new C8915b();
                bVar.convertFrom(rawQuery);
                long j = bVar.field_liveId;
                C8924a aVar = new C8924a(j, bVar.field_freeTimeForLive, bVar.field_freeTimeForReplay, bVar.field_payForLive, bVar.field_invalid);
                this.f28225g.put(Long.valueOf(j), aVar);
                C62042e eVar = C62042e.f176370a;
                eVar.mo86998D1("FinderLiveChargeInfoStorage", "initChargeInfo " + aVar);
            }
            rawQuery.close();
        }
        this.f28224f = true;
        Log.m105924i("FinderLiveChargeInfoStorage", "initChargeInfo: " + C75592q0.m90789s() + ", isEmpty:" + isEmpty + ", cache size:" + this.f28225g.size());
    }

    /* renamed from: Ow */
    public void mo9438Ow(long j) {
        if (!this.f28224f) {
            mo9437Lo();
        }
        C8924a aVar = this.f28225g.get(Long.valueOf(j));
        if (aVar == null) {
            C8924a put = this.f28225g.put(Long.valueOf(j), new C8924a(j, 0, 0, 0, 1));
        } else if (aVar.f28229d != 1) {
            aVar.f28230e = 1;
        }
        C8924a aVar2 = this.f28225g.get(Long.valueOf(j));
        C87412m.m108593f(aVar2, "chargeInfoCache.get(liveId)");
        mo9735bD(j, aVar2);
        Log.m105924i("FinderLiveChargeInfoStorage", "setInvalid liveId:" + j + ",cache size:" + this.f28225g.size());
    }

    /* renamed from: Yt */
    public void mo9439Yt() {
        Set<Map.Entry<Long, C8924a>> entrySet = this.f28225g.entrySet();
        C87412m.m108593f(entrySet, "chargeInfoCache.entrySet()");
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            C87412m.m108593f(key, "it.key");
            long longValue = ((Number) key).longValue();
            Object value = entry.getValue();
            C87412m.m108593f(value, "it.value");
            mo9735bD(longValue, (C8924a) value);
        }
        Log.m105924i("FinderLiveChargeInfoStorage", "saveChargeInfo finish size:" + this.f28225g.size() + '!');
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a7, code lost:
        if (r8.f28223e.insert("FinderLiveChargeInfo", "liveId", r9.convertTo()) > 0) goto L_0x00ab;
     */
    /* renamed from: bD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9735bD(long r9, ik1.C8923b.C8924a r11) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SELECT * FROM FinderLiveChargeInfo where FinderLiveChargeInfo.liveId="
            r0.append(r1)
            java.lang.String r1 = o40.C61926c.m72691p(r9)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r8.f28223e
            r2 = 0
            r3 = 2
            android.database.Cursor r0 = r1.rawQuery(r0, r2, r3)
            boolean r1 = r0.moveToNext()
            java.lang.String r2 = "FinderLiveChargeInfoStorage"
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x005b
            ig1.b r9 = new ig1.b
            r9.<init>()
            r9.convertFrom(r0)
            int r10 = r9.field_freeTimeForLive
            int r1 = r11.f28227b
            if (r10 != r1) goto L_0x004a
            int r10 = r9.field_freeTimeForReplay
            int r5 = r11.f28228c
            if (r10 != r5) goto L_0x004a
            int r10 = r9.field_payForLive
            int r5 = r11.f28229d
            if (r10 != r5) goto L_0x004a
            int r10 = r9.field_invalid
            int r5 = r11.f28230e
            if (r10 == r5) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r10 = 0
            goto L_0x004b
        L_0x004a:
            r10 = 1
        L_0x004b:
            r9.field_freeTimeForLive = r1
            int r1 = r11.f28228c
            r9.field_freeTimeForReplay = r1
            int r1 = r11.f28229d
            r9.field_payForLive = r1
            int r11 = r11.f28230e
            r9.field_invalid = r11
            r11 = 0
            goto L_0x0089
        L_0x005b:
            ig1.b r1 = new ig1.b
            r1.<init>()
            r1.field_liveId = r9
            int r9 = r11.f28227b
            r1.field_freeTimeForLive = r9
            int r9 = r11.f28228c
            r1.field_freeTimeForReplay = r9
            int r9 = r11.f28229d
            r1.field_payForLive = r9
            int r9 = r11.f28230e
            r1.field_invalid = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "create new charge info:"
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            r9 = r1
            r10 = 0
            r11 = 1
        L_0x0089:
            r0.close()
            if (r10 == 0) goto L_0x0093
            boolean r3 = r8.replace(r9)
            goto L_0x00ab
        L_0x0093:
            if (r11 == 0) goto L_0x00aa
            android.content.ContentValues r0 = r9.convertTo()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r8.f28223e
            java.lang.String r5 = "FinderLiveChargeInfo"
            java.lang.String r6 = "liveId"
            long r0 = r1.insert(r5, r6, r0)
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r3 = 0
        L_0x00ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "saveCache "
            r0.append(r1)
            long r4 = r9.field_liveId
            r0.append(r4)
            java.lang.String r1 = ",liveTime:"
            r0.append(r1)
            int r1 = r9.field_freeTimeForLive
            r0.append(r1)
            java.lang.String r1 = ",replay:"
            r0.append(r1)
            int r1 = r9.field_freeTimeForReplay
            r0.append(r1)
            java.lang.String r1 = ",payForLive:"
            r0.append(r1)
            int r1 = r9.field_payForLive
            r0.append(r1)
            java.lang.String r1 = ",invalid:"
            r0.append(r1)
            int r9 = r9.field_invalid
            r0.append(r9)
            java.lang.String r9 = ", needReplace:"
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = ",needInsert:"
            r0.append(r9)
            r0.append(r11)
            java.lang.String r9 = ",result:"
            r0.append(r9)
            r0.append(r3)
            java.lang.String r9 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ik1.C8923b.mo9735bD(long, ik1.b$a):void");
    }

    /* renamed from: jo */
    public boolean mo9440jo(long j) {
        if (!this.f28224f) {
            mo9437Lo();
        }
        C8924a aVar = this.f28225g.get(Long.valueOf(j));
        return aVar != null && aVar.f28229d == 1;
    }

    /* renamed from: qq */
    public boolean mo9441qq(long j) {
        if (!this.f28224f) {
            mo9437Lo();
        }
        C8924a aVar = this.f28225g.get(Long.valueOf(j));
        return aVar != null && aVar.f28230e == 1;
    }
}
