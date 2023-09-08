package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashSet;
import java.util.Set;
import ks2.C99181f;
import ks2.C99203w;
import o40.C61926c;
import o90.C100301b;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.u */
public class C94953u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C101804kv2 f275265d;

    /* renamed from: e */
    public final /* synthetic */ int f275266e;

    /* renamed from: f */
    public final /* synthetic */ String f275267f;

    /* renamed from: g */
    public final /* synthetic */ String f275268g;

    /* renamed from: h */
    public final /* synthetic */ C94901o f275269h;

    public C94953u(C94901o oVar, C101804kv2 kv22, int i, String str, String str2) {
        this.f275269h = oVar;
        this.f275265d = kv22;
        this.f275266e = i;
        this.f275267f = str;
        this.f275268g = str2;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$7");
        if (C94901o.m120384b(this.f275269h).size() >= 60) {
            Log.m105925i("MicroMsg.LazyerImageLoader2", "pushToImageLoaderImpl loaderlist.size:%d exceed, trim to MAX_DECODE_SIZE:%d", Integer.valueOf(C94901o.m120384b(this.f275269h).size()), 60);
        }
        while (C94901o.m120384b(this.f275269h).size() >= 60) {
            C94901o.C94912i iVar = (C94901o.C94912i) C94901o.m120384b(this.f275269h).removeFirst();
            Log.m105921e("MicroMsg.LazyerImageLoader2", "[%s][media:%s] start pushToImageLoaderImpl too many,remove key:%s media:%s", "[image-flow]", this.f275265d.f298689d, C94901o.C94912i.m120452e(iVar), iVar.mo131155g());
            Set<String> set = this.f275269h.f275018x;
            SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            String str = iVar.f275044c;
            SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            ((HashSet) set).remove(str);
        }
        C94901o.C94912i iVar2 = new C94901o.C94912i(C102236a0.m134780y(this.f275266e, this.f275265d.f298689d), this.f275267f + this.f275268g, this.f275267f, this.f275265d, this.f275266e);
        Log.m105925i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] start pushToImageLoaderImpl ImageLoader key:%s", "[image-flow]", this.f275265d.f298689d, C94901o.C94912i.m120452e(iVar2));
        C94901o oVar = this.f275269h;
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        C100301b<C92714n> bVar = oVar.f274997c;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        String str2 = iVar2.f275044c;
        SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        if (!bVar.check(str2)) {
            if (!((HashSet) this.f275269h.f275018x).contains(C94901o.C94912i.m120452e(iVar2))) {
                Log.m105925i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] end pushToImageLoaderImpl add ImageLoader key:%s ", "[image-flow]", this.f275265d.f298689d, C94901o.C94912i.m120452e(iVar2));
                C94901o.m120384b(this.f275269h).add(iVar2);
                ((HashSet) this.f275269h.f275018x).add(C94901o.C94912i.m120452e(iVar2));
            }
        } else {
            Set<String> set2 = this.f275269h.f275018x;
            SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            String str3 = iVar2.f275044c;
            SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            ((HashSet) set2).remove(str3);
            Log.m105921e("MicroMsg.LazyerImageLoader2", "[%s][media:%s] end pushToImageLoaderImpl ImageLoader key:%s for mMemoryCache already contains", "[image-flow]", this.f275265d.f298689d, C94901o.C94912i.m120452e(iVar2));
        }
        Log.m105925i("MicroMsg.LazyerImageLoader2", "add loaderlist size:%d", Integer.valueOf(C94901o.m120384b(this.f275269h).size()));
        String str4 = this.f275265d.f298689d;
        int size = C94901o.m120384b(this.f275269h).size();
        C99181f fVar = C99181f.f290857a;
        SnsMethodCalculate.markStartTimeMs("startImageLoader", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        C87412m.m108594g(str4, "mediaId");
        C61926c.m72661F("SnsImageLoadReporter", new C99203w(str4, size));
        SnsMethodCalculate.markEndTimeMs("startImageLoader", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        C94901o oVar2 = this.f275269h;
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        oVar2.mo131120h0();
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$7");
    }
}
