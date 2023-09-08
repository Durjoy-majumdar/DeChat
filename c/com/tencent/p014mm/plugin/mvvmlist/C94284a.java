package com.tencent.p014mm.plugin.mvvmlist;

import ac2.C39534d;
import ac2.C39535k;
import ac2.C91988j;
import com.tencent.p014mm.sdk.event.pending.PendingEventHandler;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import o40.C61926c;
import rx3.C13598b0;
import zb2.C103001d;
import zb2.C103006g;
import zb2.C103007j;

/* renamed from: com.tencent.mm.plugin.mvvmlist.a */
public final class C94284a implements PendingEventHandler<C103007j<C103001d<Object>>> {

    /* renamed from: d */
    public final /* synthetic */ MvvmList<C103001d<Object>> f272403d;

    /* renamed from: com.tencent.mm.plugin.mvvmlist.a$a */
    public static final class C94285a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<C103007j<C103001d<Object>>> f272404d;

        /* renamed from: e */
        public final /* synthetic */ MvvmList<C103001d<Object>> f272405e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94285a(List<C103007j<C103001d<Object>>> list, MvvmList<C103001d<Object>> mvvmList) {
            super(0);
            this.f272404d = list;
            this.f272405e = mvvmList;
        }

        public Object invoke() {
            List<C103007j<C103001d<Object>>> list = this.f272404d;
            MvvmList<C103001d<Object>> mvvmList = this.f272405e;
            for (C103007j jVar : list) {
                String b = mvvmList.mo5660b();
                StringBuilder sb = new StringBuilder();
                sb.append("submitUIChange callback:");
                C103006g<T> gVar = mvvmList.f272355q;
                sb.append(gVar != null ? Integer.valueOf(gVar.hashCode()) : null);
                sb.append(" eventVersion:");
                sb.append(jVar.f303957e);
                sb.append(" compareDataListVersion:");
                sb.append(jVar.f303954b);
                sb.append(" currentDataListVersion:");
                sb.append(mvvmList.f272352n);
                Log.m105924i(b, sb.toString());
                if (mvvmList.f272352n <= jVar.f303954b) {
                    synchronized (mvvmList.f272353o) {
                        mvvmList.f272353o.clear();
                        mvvmList.f272353o.addAll(jVar.f303953a);
                        mvvmList.f272352n++;
                    }
                    C103006g<T> gVar2 = mvvmList.f272355q;
                    if (gVar2 != null) {
                        gVar2.mo141611A3(jVar);
                    }
                    mvvmList.f272356r.postValue(new C91988j(C39535k.UIRefresh, (C39534d) null));
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C94284a(MvvmList<C103001d<Object>> mvvmList) {
        this.f272403d = mvvmList;
    }

    public void handleEvent(List<C103007j<C103001d<Object>>> list) {
        C87412m.m108594g(list, "eventList");
        C61926c.m72668M(new C94285a(list, this.f272403d));
    }
}
