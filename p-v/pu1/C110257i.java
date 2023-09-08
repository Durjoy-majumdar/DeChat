package pu1;

import d03.C58010a;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashMap;
import m03.C61431n;
import o40.C61926c;
import p172io.flutter.plugin.common.EventChannel;
import rx3.C13598b0;

/* renamed from: pu1.i */
public final class C110257i implements C61431n {

    /* renamed from: a */
    public final /* synthetic */ long f329803a;

    /* renamed from: b */
    public final /* synthetic */ C110251b f329804b;

    /* renamed from: pu1.i$a */
    public static final class C110258a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f329805d;

        /* renamed from: e */
        public final /* synthetic */ long f329806e;

        /* renamed from: f */
        public final /* synthetic */ C110251b f329807f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110258a(long j, long j2, C110251b bVar) {
            super(0);
            this.f329805d = j;
            this.f329806e = j2;
            this.f329807f = bVar;
        }

        public Object invoke() {
            HashMap hashMap = new HashMap();
            hashMap.put("event", "onProgress");
            hashMap.put("playerId", Long.valueOf(this.f329805d));
            hashMap.put("progress", Long.valueOf(this.f329806e));
            EventChannel.EventSink a = this.f329807f.f329786e.mo161672a();
            if (a != null) {
                a.success(hashMap);
            }
            return C13598b0.f38549a;
        }
    }

    public C110257i(long j, C110251b bVar) {
        this.f329803a = j;
        this.f329804b = bVar;
    }

    /* renamed from: a */
    public void mo79982a(C58010a aVar, long j) {
        C61926c.m72668M(new C110258a(this.f329803a, j, this.f329804b));
    }
}
