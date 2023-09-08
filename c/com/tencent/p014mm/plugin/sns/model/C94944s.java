package com.tencent.p014mm.plugin.sns.model;

import android.util.SparseArray;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96983o3;
import te3.C101804kv2;
import vr2.C102268v;

/* renamed from: com.tencent.mm.plugin.sns.model.s */
public class C94944s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SparseArray f275186d;

    /* renamed from: e */
    public final /* synthetic */ SparseArray f275187e;

    /* renamed from: f */
    public final /* synthetic */ SparseArray f275188f;

    /* renamed from: g */
    public final /* synthetic */ String f275189g;

    /* renamed from: h */
    public final /* synthetic */ C96983o3 f275190h;

    /* renamed from: i */
    public final /* synthetic */ int f275191i;

    /* renamed from: j */
    public final /* synthetic */ C94901o f275192j;

    public C94944s(C94901o oVar, SparseArray sparseArray, SparseArray sparseArray2, SparseArray sparseArray3, String str, C96983o3 o3Var, int i) {
        this.f275192j = oVar;
        this.f275186d = sparseArray;
        this.f275187e = sparseArray2;
        this.f275188f = sparseArray3;
        this.f275189g = str;
        this.f275190h = o3Var;
        this.f275191i = i;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$4");
        int size = this.f275186d.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.f275186d.keyAt(i);
            C101804kv2 kv22 = (C101804kv2) this.f275186d.get(keyAt);
            if (!C94901o.m120383a(this.f275192j, 0, kv22, true)) {
                C102268v vVar = new C102268v(kv22);
                vVar.mo141832d(0);
                vVar.mo141833e(kv22.f298689d);
                this.f275187e.put(keyAt, vVar);
                this.f275188f.put(keyAt, kv22);
                Log.m105925i("MicroMsg.LazyerImageLoader2", "setSnsMultiImg put %s to downloadList", kv22.f298689d);
            }
        }
        if (this.f275188f.size() > 0) {
            C94866e1.Vx0().mo130977b(this.f275189g, this.f275188f, this.f275187e, this.f275190h, this.f275191i, 2);
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$4");
    }
}
