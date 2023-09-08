package com.tencent.p014mm.modelstat;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.RWCache;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import f40.C86709a0;
import java.util.HashSet;
import junit.framework.Assert;
import p680ru.C36491k;
import zh3.C91753f;

/* renamed from: com.tencent.mm.modelstat.r */
public class C114748r extends MStorage implements RWCache.IRWCacheAppender<Integer, C114747n>, C36491k {

    /* renamed from: h */
    public static final String[] f344050h = {"CREATE TABLE IF NOT EXISTS netstat ( id INTEGER PRIMARY KEY, peroid INT, textCountIn INT, textBytesIn INT, imageCountIn INT, imageBytesIn INT, voiceCountIn INT, voiceBytesIn INT, videoCountIn INT, videoBytesIn INT, mobileBytesIn INT, wifiBytesIn INT, sysMobileBytesIn INT, sysWifiBytesIn INT, textCountOut INT, textBytesOut INT, imageCountOut INT, imageBytesOut INT, voiceCountOut INT, voiceBytesOut INT, videoCountOut INT, videoBytesOut INT, mobileBytesOut INT, wifiBytesOut INT, sysMobileBytesOut INT, sysWifiBytesOut INT, reserved1 INT, reserved2 INT, reserved3 TEXT, realMobileBytesIn INT, realWifiBytesIn INT, realMobileBytesOut INT, realWifiBytesOut INT) ", "CREATE INDEX IF NOT EXISTS  statInfoIndex ON netstat ( peroid ) "};

    /* renamed from: i */
    public static final String[] f344051i = {"realMobileBytesIn", "realWifiBytesIn", "realMobileBytesOut", "realWifiBytesOut"};

    /* renamed from: d */
    public C91753f f344052d;

    /* renamed from: e */
    public long f344053e;

    /* renamed from: f */
    public RWCache<Integer, C114747n> f344054f = new RWCache(this, C86709a0.m107525e().getLooper(), 30, 2, 300000, 1000);

    /* renamed from: g */
    public long f344055g;

    public C114748r(C91753f fVar) {
        this.f344052d = fVar;
        HashSet hashSet = new HashSet();
        String[] strArr = f344051i;
        for (int i = 0; i < 4; i++) {
            hashSet.add(strArr[i]);
        }
        Cursor rawQuery = this.f344052d.rawQuery("PRAGMA table_info(netstat);", (String[]) null, 2);
        int columnIndex = rawQuery.getColumnIndex("name");
        while (rawQuery.moveToNext()) {
            hashSet.remove(rawQuery.getString(columnIndex));
        }
        rawQuery.close();
        String[] strArr2 = f344051i;
        for (int i2 = 0; i2 < 4; i2++) {
            String str = strArr2[i2];
            if (hashSet.contains(str)) {
                this.f344052d.execSQL("netstat", "ALTER TABLE netstat ADD COLUMN " + str + " INT;");
            }
        }
        this.f344055g = System.currentTimeMillis();
    }

    /* renamed from: Lo */
    public C114747n mo174390Lo(int i) {
        C114747n nVar = this.f344054f.get(Integer.valueOf(i));
        if (nVar == null) {
            C91753f fVar = this.f344052d;
            Cursor query = fVar.query("netstat", (String[]) null, "peroid = " + i, (String[]) null, (String) null, (String) null, (String) null, 2);
            if (query.moveToFirst()) {
                nVar = new C114747n();
                nVar.mo174382b(query);
            }
            query.close();
            if (nVar != null) {
                this.f344054f.set(Integer.valueOf(i), nVar);
                return nVar;
            }
            RWCache<Integer, C114747n> rWCache = this.f344054f;
            Integer valueOf = Integer.valueOf(i);
            C114747n nVar2 = new C114747n();
            nVar2.f344024a = 0;
            nVar2.f344025b = 0;
            nVar2.f344026c = 0;
            nVar2.f344027d = 0;
            nVar2.f344028e = 0;
            nVar2.f344029f = 0;
            nVar2.f344030g = 0;
            nVar2.f344031h = 0;
            nVar2.f344032i = 0;
            nVar2.f344033j = 0;
            nVar2.f344034k = 0;
            nVar2.f344035l = 0;
            nVar2.f344036m = 0;
            nVar2.f344037n = 0;
            nVar2.f344038o = 0;
            nVar2.f344039p = 0;
            nVar2.f344040q = 0;
            nVar2.f344041r = 0;
            nVar2.f344042s = 0;
            nVar2.f344043t = 0;
            nVar2.f344044u = 0;
            nVar2.f344045v = 0;
            nVar2.f344046w = 0;
            nVar2.f344047x = 0;
            nVar2.f344048y = 0;
            nVar2.f344049z = 0;
            nVar2.f344019A = 0;
            nVar2.f344020B = 0;
            nVar2.f344021C = 0;
            nVar2.f344022D = 0;
            nVar2.f344023E = 0;
            rWCache.set(valueOf, nVar2);
            return nVar;
        } else if (nVar.f344026c != i) {
            return null;
        } else {
            return nVar;
        }
    }

    /* renamed from: Yt */
    public final boolean mo174391Yt(C114747n nVar) {
        Assert.assertNotNull(nVar);
        Assert.assertTrue(nVar.mo174385e() > 0);
        return this.f344054f.set(Integer.valueOf(nVar.mo174385e()), nVar);
    }

    public void append(RWCache<Integer, C114747n> rWCache, RWCache.Holder<Integer, C114747n> holder) {
        int i = holder.funcType;
        C114747n nVar = (C114747n) holder.values;
        if (nVar != null && i == 1) {
            int i2 = nVar.f344026c;
            int i3 = nVar.f344025b;
            if (i2 > 0) {
                ContentValues contentValues = new ContentValues();
                if ((nVar.f344024a & 2) != 0) {
                    contentValues.put("peroid", Integer.valueOf(nVar.f344026c));
                }
                if ((nVar.f344024a & 4) != 0) {
                    contentValues.put("textCountIn", Integer.valueOf(nVar.f344027d));
                }
                if ((nVar.f344024a & 8) != 0) {
                    contentValues.put("textBytesIn", Long.valueOf(nVar.f344028e));
                }
                if ((nVar.f344024a & 16) != 0) {
                    contentValues.put("imageCountIn", Integer.valueOf(nVar.f344029f));
                }
                if ((nVar.f344024a & 32) != 0) {
                    contentValues.put("imageBytesIn", Long.valueOf(nVar.f344030g));
                }
                if ((nVar.f344024a & 64) != 0) {
                    contentValues.put("voiceCountIn", Integer.valueOf(nVar.f344031h));
                }
                if ((nVar.f344024a & 128) != 0) {
                    contentValues.put("voiceBytesIn", Long.valueOf(nVar.f344032i));
                }
                if ((nVar.f344024a & 256) != 0) {
                    contentValues.put("videoCountIn", Integer.valueOf(nVar.f344033j));
                }
                if ((nVar.f344024a & 512) != 0) {
                    contentValues.put("videoBytesIn", Long.valueOf(nVar.f344034k));
                }
                if ((nVar.f344024a & 1024) != 0) {
                    contentValues.put("mobileBytesIn", Long.valueOf(nVar.f344035l));
                }
                if ((nVar.f344024a & 2048) != 0) {
                    contentValues.put("wifiBytesIn", Long.valueOf(nVar.f344036m));
                }
                if ((nVar.f344024a & 4096) != 0) {
                    contentValues.put("sysMobileBytesIn", Long.valueOf(nVar.f344037n));
                }
                if ((nVar.f344024a & 8192) != 0) {
                    contentValues.put("sysWifiBytesIn", Long.valueOf(nVar.f344038o));
                }
                if ((nVar.f344024a & 16384) != 0) {
                    contentValues.put("textCountOut", Integer.valueOf(nVar.f344039p));
                }
                if ((nVar.f344024a & 32768) != 0) {
                    contentValues.put("textBytesOut", Long.valueOf(nVar.f344040q));
                }
                if ((nVar.f344024a & 65536) != 0) {
                    contentValues.put("imageCountOut", Integer.valueOf(nVar.f344041r));
                }
                if ((nVar.f344024a & 131072) != 0) {
                    contentValues.put("imageBytesOut", Long.valueOf(nVar.f344042s));
                }
                if ((nVar.f344024a & 262144) != 0) {
                    contentValues.put("voiceCountOut", Integer.valueOf(nVar.f344043t));
                }
                if ((nVar.f344024a & 524288) != 0) {
                    contentValues.put("voiceBytesOut", Long.valueOf(nVar.f344044u));
                }
                if ((nVar.f344024a & 1048576) != 0) {
                    contentValues.put("videoCountOut", Integer.valueOf(nVar.f344045v));
                }
                if ((nVar.f344024a & 2097152) != 0) {
                    contentValues.put("videoBytesOut", Long.valueOf(nVar.f344046w));
                }
                if ((nVar.f344024a & 4194304) != 0) {
                    contentValues.put("mobileBytesOut", Long.valueOf(nVar.f344047x));
                }
                if ((nVar.f344024a & 8388608) != 0) {
                    contentValues.put("wifiBytesOut", Long.valueOf(nVar.f344048y));
                }
                if ((nVar.f344024a & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0) {
                    contentValues.put("sysMobileBytesOut", Long.valueOf(nVar.f344049z));
                }
                if ((nVar.f344024a & TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0) {
                    contentValues.put("sysWifiBytesOut", Long.valueOf(nVar.f344019A));
                }
                if ((nVar.f344024a & 67108864) != 0) {
                    contentValues.put("realMobileBytesIn", Long.valueOf(nVar.f344020B));
                }
                if ((nVar.f344024a & 134217728) != 0) {
                    contentValues.put("realWifiBytesIn", Long.valueOf(nVar.f344021C));
                }
                if ((nVar.f344024a & 268435456) != 0) {
                    contentValues.put("realMobileBytesOut", Long.valueOf(nVar.f344022D));
                }
                if ((nVar.f344024a & 536870912) != 0) {
                    contentValues.put("realWifiBytesOut", Long.valueOf(nVar.f344023E));
                }
                if (i3 < 0) {
                    nVar.f344025b = (int) this.f344052d.mo125627q("netstat", "id", contentValues, false);
                    return;
                }
                C91753f fVar = this.f344052d;
                fVar.update("netstat", contentValues, "peroid=" + i2, (String[]) null);
            }
        }
    }

    /* renamed from: jo */
    public void mo174392jo(C114747n nVar) {
        Assert.assertNotNull(nVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (nVar.mo174385e() <= 0) {
            nVar.mo174388h((int) (currentTimeMillis / 86400000));
        }
        if (nVar.mo174385e() > 0) {
            C114747n Lo = mo174390Lo(nVar.mo174385e());
            if (Lo == null || nVar.mo174385e() != Lo.mo174385e()) {
                nVar.mo174386f(nVar.mo174383c() | 2);
                nVar.mo174387g(-1);
                if (Lo != null) {
                    Log.m105924i("MicroMsg.NetStat", Lo.toString());
                } else {
                    Log.m105924i("MicroMsg.NetStat", "NetStat started.");
                }
                this.f344055g = currentTimeMillis;
            } else {
                nVar.mo174381a(Lo);
                nVar.mo174387g(Lo.mo174384d());
                nVar.mo174386f(nVar.mo174383c() | 2);
                if (currentTimeMillis - this.f344055g > 300000) {
                    Log.m105924i("MicroMsg.NetStat", nVar.toString());
                    this.f344055g = currentTimeMillis;
                }
            }
            mo174391Yt(nVar);
        }
    }

    public void postAppend() {
        long j = this.f344053e;
        if (j > 0) {
            this.f344052d.endTransaction(j);
        }
    }

    public boolean preAppend() {
        if (this.f344052d.mo125622l()) {
            Log.m105924i("MicroMsg.NetStat", "summer preAppend inTransaction return false");
            return false;
        }
        long beginTransaction = this.f344052d.beginTransaction(Thread.currentThread().getId());
        this.f344053e = beginTransaction;
        if (beginTransaction > 0) {
            return true;
        }
        Log.m105924i("MicroMsg.NetStat", "summer preAppend ticket: " + this.f344053e + " return false");
        return false;
    }

    /* renamed from: qq */
    public long mo174393qq() {
        this.f344054f.appendAll(true);
        int nowMilliSecond = (int) ((Util.nowMilliSecond() - 1296000000) / 86400000);
        int currentDayInMills = (int) (Util.currentDayInMills() / 86400000);
        Cursor rawQuery = this.f344052d.rawQuery("SELECT peroid FROM netstat  WHERE peroid > " + nowMilliSecond + " order by " + "peroid" + " limit 1", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            currentDayInMills = rawQuery.getInt(rawQuery.getColumnIndex("peroid"));
        }
        rawQuery.close();
        return ((long) currentDayInMills) * 86400000;
    }
}
