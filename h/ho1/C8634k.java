package ho1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ho1.C8637m;
import hp3.C87581a;
import java.util.LinkedList;
import je1.C9310g1;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C51692vg1;
import te3.C51970xg1;

/* renamed from: ho1.k */
public final class C8634k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f27763d;

    /* renamed from: e */
    public final /* synthetic */ String f27764e;

    /* renamed from: f */
    public final /* synthetic */ C8626e f27765f;

    /* renamed from: g */
    public final /* synthetic */ long f27766g;

    /* renamed from: ho1.k$a */
    public static final class C8635a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C8626e f27767a;

        /* renamed from: b */
        public final /* synthetic */ long f27768b;

        public C8635a(C8626e eVar, long j) {
            this.f27767a = eVar;
            this.f27768b = j;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C8637m mVar = this.f27767a.f27745f;
                if (mVar != null) {
                    LinkedList<C51692vg1> linkedList = ((C51970xg1) cVar.f256796d).f144638d;
                    long j = this.f27768b;
                    StringBuilder sb = new StringBuilder();
                    sb.append("[onLoadSearch] list size=");
                    sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
                    sb.append(" queryTime=");
                    sb.append(j);
                    sb.append(", lastQueryTime=");
                    sb.append(mVar.f27783s);
                    Log.m105924i("Finder.FinderProfilePoiListView", sb.toString());
                    if (j > mVar.f27783s) {
                        mVar.f27783s = j;
                        if (linkedList != null) {
                            if (mVar.f27776i.isEmpty()) {
                                mVar.f27776i.addAll(mVar.f27775h);
                            }
                            mVar.f27775h.clear();
                            mVar.f27775h.addAll(linkedList);
                            LinkedList<C51692vg1> linkedList2 = mVar.f27775h;
                            C87412m.m108594g(linkedList2, "list");
                            mVar.mo9509c(linkedList2.size());
                            C8637m.C8639b bVar = mVar.f27777j;
                            if (bVar != null) {
                                bVar.notifyDataSetChanged();
                            } else {
                                C87412m.m108603p("adapter");
                                throw null;
                            }
                        }
                    }
                }
                Log.m105924i("Finder.UserPoiHandler", "[requestPoiSearch] poi_list size=" + ((C51970xg1) cVar.f256796d).f144638d.size());
            } else {
                Log.m105924i("Finder.UserPoiHandler", "[requestPoiSearch] errType=" + cVar.f256793a + " errCode=" + cVar.f256794b + " errMsg=" + cVar.f256795c);
            }
            C8626e eVar = this.f27767a;
            if (eVar.f27748i != 0) {
                eVar.mo9500f(true);
            }
            return C13598b0.f38549a;
        }
    }

    public C8634k(String str, String str2, C8626e eVar, long j) {
        this.f27763d = str;
        this.f27764e = str2;
        this.f27765f = eVar;
        this.f27766g = j;
    }

    public final void run() {
        new C9310g1(this.f27763d, this.f27764e).mo9225i().mo123420E(new C8635a(this.f27765f, this.f27766g));
    }
}
