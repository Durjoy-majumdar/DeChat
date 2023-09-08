package ht2;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import vr2.C102236a0;

/* renamed from: ht2.c */
public class C98526c extends C98524a {
    public C98526c() {
        super(new SnsInfo());
        mo136790j(true);
    }

    /* renamed from: v */
    public String mo137883v(long j, String str) {
        SnsMethodCalculate.markStartTimeMs("updateDownLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.SnsTimeLineVending");
        Log.printDebugStack("MicroMsg.SnsTimeLineVending", "updateDownLimitSeq", new Object[0]);
        Log.m105919d("MicroMsg.SnsTimeLineVending", "updateLitmitSeq %s %s", Integer.valueOf(C94866e1.dy0().mo6417h()), str);
        String p0 = C102236a0.m134763p0(C94866e1.Yx0().r50(j, str.equals("") ? C94866e1.dy0().mo6417h() / 2 : C94866e1.dy0().mo6417h(), false));
        SnsMethodCalculate.markStartTimeMs("getRespMinSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        String str2 = this.f288928t;
        SnsMethodCalculate.markEndTimeMs("getRespMinSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        if (!str2.equals("") && p0.compareTo(str2) >= 0) {
            p0 = str2;
        }
        long j2 = C94866e1.Xx0().mo139782Yt("@__weixintimtline").mo139769l2().f139085e;
        if (j2 == 0) {
            SnsMethodCalculate.markEndTimeMs("updateDownLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.SnsTimeLineVending");
            return p0;
        }
        String p05 = C102236a0.m134763p0(j2);
        if (p0.equals("")) {
            SnsMethodCalculate.markEndTimeMs("updateDownLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.SnsTimeLineVending");
            return p05;
        }
        if (p05.compareTo(p0) > 0) {
            p0 = p05;
        }
        SnsMethodCalculate.markEndTimeMs("updateDownLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.SnsTimeLineVending");
        return p0;
    }

    /* renamed from: w */
    public String mo137884w(long j) {
        SnsMethodCalculate.markStartTimeMs("updateUpLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.SnsTimeLineVending");
        Log.m105919d("MicroMsg.SnsTimeLineVending", "updateUpLimitSeq %s", Integer.valueOf(C94866e1.dy0().mo6417h()));
        String p0 = C102236a0.m134763p0(C94866e1.Yx0().c40(j, C94866e1.dy0().mo6417h(), false));
        SnsMethodCalculate.markStartTimeMs("getUnreadBottomSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        String str = this.f288929u;
        SnsMethodCalculate.markEndTimeMs("getUnreadBottomSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
        if (!str.equals("") && p0.compareTo(str) > 0) {
            p0 = "";
        }
        SnsMethodCalculate.markEndTimeMs("updateUpLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.SnsTimeLineVending");
        return p0;
    }
}
