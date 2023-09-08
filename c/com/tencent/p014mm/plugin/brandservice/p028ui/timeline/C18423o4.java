package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19627t;
import java.util.Iterator;
import java.util.List;
import q73.C22077b0;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.o4 */
public class C18423o4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineUI f51107d;

    public C18423o4(BizTimeLineUI bizTimeLineUI) {
        this.f51107d = bizTimeLineUI;
    }

    public void run() {
        int lastVisiblePosition = this.f51107d.f50235f.getLastVisiblePosition() - this.f51107d.f50235f.getHeaderViewsCount();
        if (lastVisiblePosition < 0) {
            lastVisiblePosition = 0;
        }
        C18508z2 z2Var = this.f51107d.f50246s;
        List<C19623o0> list = z2Var.f51439g;
        int i = -1;
        if (!(list == null || list.isEmpty())) {
            Iterator<T> it = z2Var.f51439g.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C19623o0 o0Var = (C19623o0) next;
                    if (i2 > lastVisiblePosition && o0Var.field_isRead == 0) {
                        i = i2;
                        break;
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        C19627t tVar = C19627t.f55586a;
        if (C19627t.f55580H > 0) {
            C22077b0 b0Var = C22077b0.f62466a;
            b0Var.mo35172a(166);
            int i4 = C19627t.f55580H;
            if (i4 == 1) {
                C19627t.f55592g = tVar.mo25831e();
                b0Var.mo35172a(167);
                int i5 = C19627t.f55592g;
                if (i >= i5 || lastVisiblePosition + 1 >= i5) {
                    Log.m105924i("MicroMsg.BizCardLogic", "replaceAd fail firstUnExposePos:" + i + ", lastVisiblePosition:" + lastVisiblePosition + ", insertPos:" + C19627t.f55592g);
                    StringBuilder sb = new StringBuilder();
                    sb.append("err_code:6,err_msg:'pos exposed', traceid:'");
                    sb.append(C19627t.f55594i);
                    sb.append("', insertType:'");
                    sb.append(C19627t.f55580H);
                    sb.append('\'');
                    tVar.mo25828b("adReplace", sb.toString());
                    b0Var.mo35172a(168);
                    return;
                }
                b0Var.mo35172a(169);
                Log.m105924i("MicroMsg.BizCardLogic", "replaceAd lastVisiblePosition=" + lastVisiblePosition + ", firstUnExposePos=" + i);
                tVar.mo25845s(0, true);
            } else if (i4 == 2) {
                b0Var.mo35172a(176);
                if (i < 0) {
                    b0Var.mo35172a(177);
                    Log.m105924i("MicroMsg.BizCardLogic", "replaceAd  fail firstUnExposePos:" + i + " invalid");
                    tVar.mo25828b("adReplace", "err_code:7,err_msg:'pos exposed', traceid:'" + C19627t.f55594i + "', insertType:'" + C19627t.f55580H + '\'');
                    return;
                }
                b0Var.mo35172a(178);
                Log.m105924i("MicroMsg.BizCardLogic", "replaceAd lastVisiblePosition=" + lastVisiblePosition + ", firstUnExposePos=" + i);
                int i6 = i + 1;
                int e = tVar.mo25831e();
                if (i6 < e) {
                    i6 = e;
                }
                tVar.mo25845s(i6, true);
            }
        }
    }
}
