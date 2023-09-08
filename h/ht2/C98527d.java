package ht2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import os2.C100400e0;
import vr2.C102236a0;

/* renamed from: ht2.d */
public class C98527d extends C98524a {

    /* renamed from: E */
    public String f288935E;

    /* renamed from: F */
    public boolean f288936F;

    public C98527d(String str, boolean z) {
        super(new SnsInfo());
        this.f288935E = str;
        this.f288936F = z;
        mo136790j(true);
    }

    /* renamed from: i */
    public Cursor mo136789i() {
        SnsMethodCalculate.markStartTimeMs("prepareCursorAsynchronous", "com.tencent.mm.plugin.sns.ui.adapter.vending.SnsUserPageVending");
        mo137882y();
        C86709a0.m107528h();
        boolean equals = this.f288935E.equals((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null));
        Log.m105918d("MicroMsg.SnsUserPageVending", "prepareCursorAsynchronous");
        C100400e0 Yx0 = C94866e1.Yx0();
        String str = this.f288935E;
        String l = mo137875l();
        Yx0.getClass();
        SnsMethodCalculate.markStartTimeMs("getCursorByUserNameNotBuff", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        Cursor NQ = Yx0.mo139801NQ(false, str, 0, equals, l, 0, 0);
        SnsMethodCalculate.markEndTimeMs("getCursorByUserNameNotBuff", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        SnsMethodCalculate.markEndTimeMs("prepareCursorAsynchronous", "com.tencent.mm.plugin.sns.ui.adapter.vending.SnsUserPageVending");
        return NQ;
    }

    /* renamed from: v */
    public String mo137883v(long j, String str) {
        SnsMethodCalculate.markStartTimeMs("updateDownLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.SnsUserPageVending");
        Log.m105919d("MicroMsg.SnsUserPageVending", "updateLitmitSeq %s %s", Integer.valueOf(C94866e1.dy0().mo6417h()), str);
        String p0 = C102236a0.m134763p0(C94866e1.Yx0().Ab0(j, C94866e1.dy0().mo6418i(this.f288935E), this.f288935E, this.f288936F));
        if (!this.f288928t.equals("") && p0.compareTo(this.f288928t) >= 0) {
            p0 = this.f288928t;
        }
        long j2 = C94866e1.Xx0().mo139782Yt(this.f288935E).mo139769l2().f139085e;
        if (j2 == 0) {
            SnsMethodCalculate.markEndTimeMs("updateDownLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.SnsUserPageVending");
            return p0;
        }
        String p05 = C102236a0.m134763p0(j2);
        if (p0.equals("")) {
            SnsMethodCalculate.markEndTimeMs("updateDownLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.SnsUserPageVending");
            return p05;
        }
        if (p05.compareTo(p0) > 0) {
            p0 = p05;
        }
        SnsMethodCalculate.markEndTimeMs("updateDownLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.SnsUserPageVending");
        return p0;
    }

    /* renamed from: w */
    public String mo137884w(long j) {
        SnsMethodCalculate.markStartTimeMs("updateUpLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.SnsUserPageVending");
        SnsMethodCalculate.markEndTimeMs("updateUpLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.SnsUserPageVending");
        return null;
    }
}
