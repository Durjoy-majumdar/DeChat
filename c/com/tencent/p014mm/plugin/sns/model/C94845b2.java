package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ms2.C99968n;

/* renamed from: com.tencent.mm.plugin.sns.model.b2 */
public class C94845b2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f274782d;

    /* renamed from: e */
    public final /* synthetic */ C94974y1 f274783e;

    public C94845b2(C94974y1 y1Var, List list) {
        this.f274783e = y1Var;
        this.f274782d = list;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$4");
        if (!Util.isNullOrNil(this.f274782d) && !Util.isNullOrNil((List) this.f274783e.f275366u.f292913d)) {
            long longValue = ((Long) this.f274782d.get(0)).longValue();
            List list = this.f274782d;
            long longValue2 = ((Long) list.get(list.size() - 1)).longValue();
            ArrayList arrayList = new ArrayList();
            Iterator<C99968n> it = this.f274783e.f275366u.f292913d.iterator();
            while (it.hasNext()) {
                C99968n next = it.next();
                if (!Util.isNullOrNil((List) next.f292916d)) {
                    Iterator<Long> it4 = next.f292916d.iterator();
                    while (it4.hasNext()) {
                        Long next2 = it4.next();
                        if (next2.longValue() < longValue && next2.longValue() > longValue2) {
                            arrayList.add(next2);
                        }
                    }
                }
            }
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                Long l = (Long) it5.next();
                if (!this.f274782d.contains(l)) {
                    C94974y1 y1Var = this.f274783e;
                    long longValue3 = l.longValue();
                    y1Var.getClass();
                    SnsMethodCalculate.markStartTimeMs("removeFeed", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                    Log.m105925i("MicroMsg.SnsUnreadTipManager", "removeFeed:%s", Long.valueOf(longValue3));
                    if (!Util.isNullOrNil((List) y1Var.f275366u.f292913d)) {
                        Iterator<C99968n> it6 = y1Var.f275366u.f292913d.iterator();
                        while (it6.hasNext()) {
                            C99968n next3 = it6.next();
                            next3.f292916d.remove(Long.valueOf(longValue3));
                            if (Util.isNullOrNil((List) next3.f292916d)) {
                                it6.remove();
                                if (next3 == y1Var.f275367v) {
                                    y1Var.f275367v = null;
                                }
                            }
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("removeFeed", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$4");
    }
}
