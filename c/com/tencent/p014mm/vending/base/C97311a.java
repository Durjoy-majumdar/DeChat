package com.tencent.p014mm.vending.base;

import android.os.Handler;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.model.C94974y1;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vending.base.Vending;
import dp3.C97515b;
import ht2.C98524a;
import java.util.HashMap;
import java.util.Iterator;
import kp3.C88253a;
import os2.C35293n0;
import te3.k94;
import te3.w64;
import vr2.C102236a0;
import zr2.C66976a;

/* renamed from: com.tencent.mm.vending.base.a */
public abstract class C97311a<_Struct, _Change> extends Vending<_Struct, Integer, _Change> {

    /* renamed from: d */
    public int f285599d = 5;

    /* renamed from: e */
    public int f285600e = 0;

    /* renamed from: f */
    public C97313b f285601f = new C97313b((C97312a) null);

    /* renamed from: com.tencent.mm.vending.base.a$b */
    public static final class C97313b {

        /* renamed from: a */
        public int f285602a = -1;

        /* renamed from: b */
        public int f285603b = -1;

        /* renamed from: c */
        public boolean f285604c = false;

        public C97313b(C97312a aVar) {
        }

        /* renamed from: a */
        public int[] mo136393a(int i, int i2) {
            if (!this.f285604c) {
                this.f285602a = i;
                this.f285603b = i2;
                this.f285604c = true;
                return new int[]{i, i2};
            }
            int i3 = this.f285602a;
            int i4 = this.f285603b;
            if (i3 > i2 || i4 < i) {
                if (i3 > i2 + 1 || i4 < i - 1) {
                    this.f285602a = i;
                    this.f285603b = i2;
                }
                return new int[]{i, i2};
            } else if (i < i3) {
                if (i2 > i4) {
                    this.f285602a = i;
                    this.f285603b = i2;
                    return new int[]{i, i3 - 1, i4 + 1, i2};
                }
                this.f285602a = i;
                this.f285603b = i4;
                return new int[]{i, i3 - 1};
            } else if (i2 <= i4) {
                return null;
            } else {
                this.f285602a = i3;
                this.f285603b = i2;
                return new int[]{i4 + 1, i2};
            }
        }
    }

    /* renamed from: a */
    public <T> T mo136391a(int i) {
        if (this.f285600e != 0) {
            return super.get(Integer.valueOf(i));
        }
        C88253a.m109902a("Vending.ForwardVending", "mCount is 0, why call get()?", new Object[0]);
        return null;
    }

    /* renamed from: b */
    public final void mo136392b(int i, int i2) {
        int[] a;
        boolean z = i >= i2;
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        synchronized (this.f285601f) {
            a = this.f285601f.mo136393a(min, max);
        }
        if (a != null) {
            int length = z ? a.length - 2 : 0;
            while (true) {
                if (z) {
                    if (length < 0) {
                        return;
                    }
                } else if (length >= a.length) {
                    return;
                }
                int i3 = a[length];
                int i4 = a[length + 1];
                int abs = Math.abs(i3 - i4);
                for (int i5 = 0; i5 <= abs; i5++) {
                    int i6 = z ? i4 - i5 : i3 + i5;
                    Vending.C97304n loader = getLoader();
                    Integer valueOf = Integer.valueOf(i6);
                    if (!loader.f285581c.get()) {
                        synchronized (loader.f285582d) {
                            Vending.C97304n.C97307c cVar = loader.f285579a.get(valueOf);
                            if (cVar == null || cVar == Vending.C97304n.C97307c.NIL) {
                                loader.f285579a.put(valueOf, Vending.C97304n.C97307c.PENDING);
                                Handler handler = loader.f285583e;
                                handler.sendMessage(handler.obtainMessage(0, valueOf));
                            }
                        }
                    }
                }
                length = z ? length - 2 : length + 2;
            }
            while (true) {
            }
        }
    }

    public boolean invalidIndex(Object obj) {
        return ((Integer) obj).intValue() < 0;
    }

    public void loaderClear() {
        synchronized (this.f285601f) {
            C97313b bVar = this.f285601f;
            bVar.f285602a = -1;
            bVar.f285603b = -1;
            bVar.f285604c = false;
        }
    }

    public void requestIndexImpl(Vending.C97310q qVar, Object obj) {
        Integer num = (Integer) obj;
        int i = this.f285600e;
        if (i > 0) {
            int i2 = i - 1;
            mo136392b(Math.min(i2, num.intValue()), Math.min(i2, num.intValue() + this.f285599d));
            mo136392b(Math.max(Math.min(0, num.intValue()), num.intValue()), Math.max(Math.min(0, num.intValue()), num.intValue() - this.f285599d));
        }
    }

    public Object resolveAsynchronous(Object obj) {
        C96275w6 w6Var;
        String str;
        SnsInfo snsInfo;
        k94 k94;
        int intValue = ((Integer) obj).intValue();
        C98524a aVar = (C98524a) this;
        SnsMethodCalculate.markStartTimeMs("resolveAsynchronous", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        SnsMethodCalculate.markStartTimeMs("resolveAsynchronous", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        if (intValue < 0) {
            SnsMethodCalculate.markEndTimeMs("resolveAsynchronous", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            w6Var = null;
            str = "resolveAsynchronous";
        } else {
            Log.m105925i("MicroMsg.SnsTimeLineVendingSide", "resolveAsynchronous %s", Integer.valueOf(intValue));
            long currentTimeMillis = System.currentTimeMillis();
            SnsInfo snsInfo2 = (SnsInfo) aVar.mo136788h(intValue);
            if (snsInfo2 != null) {
                C94974y1 fy02 = C94866e1.fy0();
                long j = snsInfo2.field_snsId;
                fy02.getClass();
                SnsMethodCalculate.markStartTimeMs("addCursorCacheSnsId", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                if (fy02.f275347b) {
                    ((HashMap) fy02.f275357l).put(Long.valueOf(j), Integer.valueOf(intValue));
                }
                SnsMethodCalculate.markEndTimeMs("addCursorCacheSnsId", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            }
            if (snsInfo2 != null) {
                SnsMethodCalculate.markStartTimeMs("matchKeywords", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
                C66976a.m79133d(snsInfo2.getTimeLine().ContentDesc);
                SnsMethodCalculate.markEndTimeMs("matchKeywords", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            }
            SnsObject e = C94897n1.m120367e(snsInfo2);
            if (e != null) {
                SnsMethodCalculate.markStartTimeMs("matchComment", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
                Iterator<w64> it = e.CommentUserList.iterator();
                while (it.hasNext()) {
                    C66976a.m79133d(it.next().f299707h);
                }
                SnsMethodCalculate.markEndTimeMs("matchComment", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            }
            String str2 = "resolveAsynchronous";
            w6Var = C102236a0.m134783z0(snsInfo2, e, aVar.f288924p, aVar.f288923o, intValue < aVar.f288923o.mo132917g(), aVar.f288927s, aVar.f288926r, aVar.f288920B, aVar.f288921C, aVar.f288922D);
            C35293n0 n0Var = w6Var.f281372c0;
            if (!(n0Var == null || (k94 = w6Var.f281374d0) == null)) {
                SnsReportHelper.f275506m0.mo131366a(n0Var, k94, w6Var.f281398y);
            }
            if (intValue == aVar.f285600e - 1 && (snsInfo = w6Var.f281367a) != null) {
                SnsReportHelper.f275506m0.f275547h = C102236a0.m134728W(snsInfo);
                SnsReportHelper.f275506m0.f275549i = w6Var.f281367a.getCreateTime();
                SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
                Log.m105919d("MicroMsg.SnsTimeLineVendingSide", "last snsId:%s, createTime:%s", snsReportHelper.f275547h, Integer.valueOf(snsReportHelper.f275549i));
            }
            Log.m105919d("MicroMsg.SnsTimeLineVendingSide", "SnsTimeLineVendingStruct resolve %s %s ms", Integer.valueOf(intValue), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            str = str2;
            SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        }
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        return w6Var;
    }

    public void synchronizing(int i, Object obj) {
        C97515b bVar = (C97515b) this;
        if (bVar.f286200n < 0) {
            bVar.f286200n = bVar.mo136787g().getCount();
        }
        int i2 = bVar.f286200n;
        this.f285600e = i2;
        C88253a.m109903b("Vending.ForwardVending", "the count %s", Integer.valueOf(i2));
    }
}
