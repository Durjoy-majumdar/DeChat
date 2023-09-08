package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.sns.ui.f */
public abstract class C95772f<T> {

    /* renamed from: a */
    public MMHandler f279397a;

    /* renamed from: b */
    public List<Integer> f279398b;

    /* renamed from: com.tencent.mm.plugin.sns.ui.f$a */
    public class C95773a implements Runnable {
        public C95773a(boolean z) {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.AdapterLoader$1");
            List b = C95772f.this.mo133173b();
            C95772f fVar = C95772f.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            fVar.getClass();
            SnsMethodCalculate.markStartTimeMs("notifyInUI", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            fVar.f279397a.post(new C95786g(fVar, b, true));
            SnsMethodCalculate.markEndTimeMs("notifyInUI", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.AdapterLoader$1");
        }
    }

    public C95772f() {
        this.f279397a = null;
        this.f279398b = new LinkedList();
        this.f279397a = C94866e1.ly0();
        this.f279398b.clear();
    }

    /* renamed from: a */
    public void mo133228a(boolean z) {
        boolean z2;
        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        boolean z3 = !z;
        if (z3) {
            SnsMethodCalculate.markStartTimeMs("getTypeNum", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            Iterator<Integer> it = this.f279398b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().intValue() == z3) {
                        SnsMethodCalculate.markEndTimeMs("getTypeNum", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    SnsMethodCalculate.markEndTimeMs("getTypeNum", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
                    break;
                }
            }
            if (z2) {
                Log.m105920e("MicroMsg.AdapterLoader", "thread is loading ui should be not load any");
                SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
                return;
            }
        }
        if (!z) {
            Log.m105918d("MicroMsg.AdapterLoader", "ui load");
        } else {
            Log.m105918d("MicroMsg.AdapterLoader", "thread load" + ((LinkedList) this.f279398b).size());
        }
        if (((LinkedList) this.f279398b).size() > 1) {
            SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            return;
        }
        SnsMethodCalculate.markStartTimeMs("addType", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        ((LinkedList) this.f279398b).add(Integer.valueOf(z3 ? 1 : 0));
        SnsMethodCalculate.markEndTimeMs("addType", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        if (z) {
            C94866e1.my0().post(new C95773a(z));
        } else {
            List b = mo133173b();
            SnsMethodCalculate.markStartTimeMs("notifyInUI", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
            this.f279397a.post(new C95786g(this, b, true));
            SnsMethodCalculate.markEndTimeMs("notifyInUI", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        }
        SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
    }

    /* renamed from: b */
    public abstract List<T> mo133173b();

    /* renamed from: c */
    public abstract void mo133174c(List<T> list);
}
