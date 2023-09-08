package ht2;

import ad0.C91998s;
import android.content.Context;
import android.database.Cursor;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94974y1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l40.C99336c;
import lo2.C99554m;
import os2.C100400e0;
import vr2.C102236a0;

/* renamed from: ht2.a */
public abstract class C98524a extends C98525b {

    /* renamed from: A */
    public byte[] f288919A = new byte[0];

    /* renamed from: B */
    public HashMap<String, Boolean> f288920B = new HashMap<>();

    /* renamed from: C */
    public HashMap<String, String> f288921C = new HashMap<>();

    /* renamed from: D */
    public List<String> f288922D = new ArrayList();

    /* renamed from: o */
    public SnsTimeLineBaseAdapter f288923o;

    /* renamed from: p */
    public Context f288924p;

    /* renamed from: q */
    public int f288925q = ((int) (System.currentTimeMillis() / 1000));

    /* renamed from: r */
    public String f288926r;

    /* renamed from: s */
    public C44668u3 f288927s;

    /* renamed from: t */
    public volatile String f288928t = "";

    /* renamed from: u */
    public volatile String f288929u = "";

    /* renamed from: v */
    public volatile String f288930v = "";

    /* renamed from: w */
    public volatile String f288931w = "";

    /* renamed from: x */
    public volatile String f288932x = "";

    /* renamed from: y */
    public boolean f288933y = false;

    /* renamed from: z */
    public volatile boolean f288934z = false;

    public C98524a(SnsInfo snsInfo) {
        super(snsInfo);
        mo136790j(true);
    }

    public void applyChangeSynchronized(Object obj) {
        SnsMethodCalculate.markStartTimeMs("applyChangeSynchronized", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        SnsMethodCalculate.markStartTimeMs("applyChangeSynchronized", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        mo136785c();
        this.f286198i = (Cursor) obj;
        SnsMethodCalculate.markEndTimeMs("applyChangeSynchronized", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        SnsMethodCalculate.markEndTimeMs("applyChangeSynchronized", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
    }

    public void destroyAsynchronous() {
        SnsMethodCalculate.markStartTimeMs("destroyAsynchronous", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        mo136785c();
        C99336c.f291266b.mo138731a();
        this.f288920B.clear();
        this.f288924p = null;
        this.f288923o = null;
        this.f288927s = null;
        this.f286196g = null;
        SnsMethodCalculate.markEndTimeMs("destroyAsynchronous", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
    }

    /* renamed from: f */
    public Object mo136786f(Object obj, Cursor cursor) {
        SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        if (snsInfo == null) {
            snsInfo = new SnsInfo();
        }
        snsInfo.convertFrom(cursor);
        SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        return snsInfo;
    }

    /* renamed from: i */
    public Cursor mo136789i() {
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        SnsMethodCalculate.markStartTimeMs("prepareCursorAsynchronous", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        long currentTimeMillis = System.currentTimeMillis();
        mo137882y();
        if (!Util.isNullOrNil(mo137876n())) {
            C100400e0 Yx0 = C94866e1.Yx0();
            String l = mo137875l();
            String n = mo137876n();
            Yx0.getClass();
            SnsMethodCalculate.markStartTimeMs("getLastAndFirstTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            int[] iArr = new int[2];
            boolean zs02 = Yx0.zs0(n);
            Yx0.P50();
            String str = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ";
            if (Yx0.zs0(l)) {
                str = str + " AND " + Yx0.mo139827nP(l);
            }
            if (zs02) {
                str = str + " AND " + Yx0.mo139832vP(n);
            }
            String str2 = (str + " AND  (snsId != 0 ) ") + C100400e0.f294097p;
            Cursor rawQuery = Yx0.f294108d.rawQuery(str2, (String[]) null, 2);
            if (rawQuery.moveToFirst()) {
                SnsInfo snsInfo = new SnsInfo();
                snsInfo.convertFrom(rawQuery);
                i3 = snsInfo.field_createTime;
            } else {
                i3 = 0;
            }
            if (!zs02 || !rawQuery.moveToLast()) {
                i4 = 0;
            } else {
                SnsInfo snsInfo2 = new SnsInfo();
                snsInfo2.convertFrom(rawQuery);
                i4 = snsInfo2.field_createTime;
            }
            rawQuery.close();
            Log.m105924i("MicroMsg.SnsInfoStorage", "getLastAndFirstTime " + str2 + " downCreatetime " + i3 + " upCreatetime " + i4);
            c = 0;
            iArr[0] = i3;
            iArr[1] = i4;
            SnsMethodCalculate.markEndTimeMs("getLastAndFirstTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            int i5 = iArr[0];
            i = iArr[1];
            i2 = i5;
        } else {
            c = 0;
            i2 = C94866e1.Yx0().mo139797CZ(mo137875l());
            i = 0;
        }
        Object[] objArr = new Object[3];
        objArr[c] = Integer.valueOf(this.f288925q);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = mo137875l();
        Log.m105925i("MicroMsg.SnsTimeLineVendingSide", "create time sql %s to %s getLimitSeq() %s", objArr);
        try {
            C99554m.m129936a(this.f288925q, i2, this.f288926r);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsTimeLineVendingSide", "checkDeleteExpireAdByPage exp=" + th.toString());
        }
        this.f288925q = i2;
        Log.m105925i("MicroMsg.SnsTimeLineVendingSide", "up:%s, down:%s, upCreateTime:%s, downCreateTime:%s", Long.valueOf(C102236a0.m134706B0(mo137876n())), Long.valueOf(C102236a0.m134706B0(mo137875l())), Integer.valueOf(i), Integer.valueOf(i2));
        Cursor bF = C94866e1.Yx0().mo139815bF(mo137875l(), mo137876n(), i2, i);
        Log.m105925i("MicroMsg.SnsTimeLineVendingSide", "prepareCursorAsynchronous %s", Long.valueOf(Util.milliSecondsToNow(currentTimeMillis)));
        SnsMethodCalculate.markStartTimeMs("onCursorResetFinish", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        Log.m105918d("MicroMsg.SnsTimeLineVendingSide", "onCursorResetFinish");
        C91998s.m115550d(500);
        SnsMethodCalculate.markEndTimeMs("onCursorResetFinish", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        C94974y1 fy02 = C94866e1.fy0();
        fy02.getClass();
        SnsMethodCalculate.markStartTimeMs("resetCursorSnsIdCache", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        if (fy02.f275347b) {
            ((HashMap) fy02.f275357l).clear();
        }
        SnsMethodCalculate.markEndTimeMs("resetCursorSnsIdCache", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        SnsMethodCalculate.markEndTimeMs("prepareCursorAsynchronous", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        return bF;
    }

    /* renamed from: k */
    public void mo137874k() {
        SnsMethodCalculate.markStartTimeMs("addSize", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        looperCheckForVending();
        int i = C94866e1.fy0().f275362q;
        if (i == 0) {
            SnsMethodCalculate.markStartTimeMs("addSizeBySpecial", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            long j = C94866e1.fy0().f275361p;
            SnsMethodCalculate.markStartTimeMs("updateDownLimitSeqWithoutFault", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            Log.printDebugStack("MicroMsg.SnsTimeLineVendingSide", "updateDownLimitSeqWithoutFault", new Object[0]);
            Log.m105919d("MicroMsg.SnsTimeLineVendingSide", "updateDownLimitSeqWithoutFault %s %s", Integer.valueOf(C94866e1.dy0().mo6417h()), this.f288931w);
            this.f288931w = C102236a0.m134763p0(C94866e1.Yx0().r50(j, C94866e1.dy0().mo6417h(), false));
            String str = this.f288931w;
            SnsMethodCalculate.markEndTimeMs("updateDownLimitSeqWithoutFault", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            this.f288931w = str;
            this.f288932x = C102236a0.m134763p0(j);
            Log.m105919d("MicroMsg.SnsTimeLineVendingSide", "unreadTipFaultItem.end:%s, upLimitSeq:%s, downLimitSeq:%s", Long.valueOf(j), Long.valueOf(C102236a0.m134706B0(this.f288932x)), Long.valueOf(C102236a0.m134706B0(this.f288931w)));
            SnsMethodCalculate.markEndTimeMs("addSizeBySpecial", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        } else {
            long j2 = 0;
            if (i == 2) {
                SnsMethodCalculate.markStartTimeMs("addSizeByNormal", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
                int i2 = this.f285600e;
                if (i2 != 0) {
                    int i3 = i2 - 1;
                    int i4 = 0;
                    while (true) {
                        SnsInfo snsInfo = (SnsInfo) mo136788h(i3);
                        if (snsInfo != null && !snsInfo.isSourceExist(32)) {
                            long j3 = snsInfo.field_snsId;
                            if (j3 != 0) {
                                Log.m105925i("MicroMsg.SnsTimeLineVendingSide", "get list last not ad item %s %s", Long.valueOf(j3), snsInfo.getStringSeq());
                                j2 = j3;
                                break;
                            }
                        }
                        i4++;
                        i3--;
                        if (i3 >= 0) {
                            if (i4 > 500) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                this.f288934z = true;
                synchronized (this.f288919A) {
                    try {
                        Log.m105924i("MicroMsg.SnsTimeLineVendingSide", "updateDownLimitSeq by addSizeByNormal");
                        this.f288931w = mo137883v(j2, this.f288931w);
                    } catch (Throwable th) {
                        while (true) {
                            SnsMethodCalculate.markEndTimeMs("addSizeByNormal", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
                            throw th;
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("addSizeByNormal", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            } else if (i == 1) {
                SnsMethodCalculate.markStartTimeMs("addSizeByUp", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
                if (this.f285600e != 0) {
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        SnsInfo snsInfo2 = (SnsInfo) mo136788h(i5);
                        if (snsInfo2 != null && !snsInfo2.isSourceExist(32)) {
                            long j4 = snsInfo2.field_snsId;
                            if (j4 != 0) {
                                Log.m105925i("MicroMsg.SnsTimeLineVendingSide", "get list last not ad item %s %s", Long.valueOf(j4), snsInfo2.getStringSeq());
                                j2 = j4;
                                break;
                            }
                        }
                        i6++;
                        i5++;
                        if (i5 < this.f285600e) {
                            if (i6 > 500) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                synchronized (this.f288919A) {
                    try {
                        this.f288932x = mo137884w(j2);
                    } catch (Throwable th4) {
                        while (true) {
                            SnsMethodCalculate.markEndTimeMs("addSizeByUp", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
                            throw th4;
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("addSizeByUp", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            }
        }
        SnsMethodCalculate.markEndTimeMs("addSize", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
    }

    /* renamed from: l */
    public String mo137875l() {
        SnsMethodCalculate.markStartTimeMs("getLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        String str = this.f288931w;
        SnsMethodCalculate.markEndTimeMs("getLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        return str;
    }

    /* renamed from: n */
    public String mo137876n() {
        SnsMethodCalculate.markStartTimeMs("getUpLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        String str = this.f288932x;
        SnsMethodCalculate.markEndTimeMs("getUpLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        return str;
    }

    /* renamed from: q */
    public void mo137877q() {
        SnsMethodCalculate.markStartTimeMs("resetSize", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        looperCheckForVending();
        Log.m105925i("MicroMsg.SnsTimeLineVendingSide", "resetSize %s", Boolean.valueOf(this.f288934z));
        if (this.f288934z) {
            SnsMethodCalculate.markEndTimeMs("resetSize", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            return;
        }
        synchronized (this.f288919A) {
            try {
                Log.m105924i("MicroMsg.SnsTimeLineVendingSide", "updateDownLimitSeq by resetSize");
                this.f288931w = mo137883v(0, this.f288931w);
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("resetSize", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("resetSize", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
    }

    /* renamed from: r */
    public void mo137878r(String str) {
        SnsMethodCalculate.markStartTimeMs("setRespMinSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        this.f288928t = str;
        SnsMethodCalculate.markEndTimeMs("setRespMinSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
    }

    /* renamed from: s */
    public void mo137879s(String str) {
        SnsMethodCalculate.markStartTimeMs("setUnreadBottomSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        Log.m105925i("MicroMsg.SnsTimeLineVendingSide", "setUnreadBottomSeq:[%s, %s]", str, Long.valueOf(C102236a0.m134706B0(str)));
        this.f288929u = str;
        SnsMethodCalculate.markEndTimeMs("setUnreadBottomSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
    }

    /* renamed from: t */
    public void mo137880t(String str) {
        SnsMethodCalculate.markStartTimeMs("setUnreadTopSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        Log.m105925i("MicroMsg.SnsTimeLineVendingSide", "setUnreadTopSeq:[%s, %s]", str, Long.valueOf(C102236a0.m134706B0(str)));
        this.f288930v = str;
        SnsMethodCalculate.markEndTimeMs("setUnreadTopSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
    }

    /* renamed from: u */
    public void mo137881u(String str) {
        SnsMethodCalculate.markStartTimeMs("setUpLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        synchronized (this.f288919A) {
            try {
                this.f288932x = str;
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("setUpLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("setUpLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
    }

    /* renamed from: y */
    public void mo137882y() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        if (!this.f288933y) {
            SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            synchronized (this.f288919A) {
                try {
                    Log.m105924i("MicroMsg.SnsTimeLineVendingSide", "updateDownLimitSeq by initData");
                    if (Util.isNullOrNil(mo137876n())) {
                        this.f288931w = mo137883v(0, this.f288931w);
                    }
                } catch (Throwable th) {
                    while (true) {
                        SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
                        throw th;
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            this.f288933y = true;
        }
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
    }
}
