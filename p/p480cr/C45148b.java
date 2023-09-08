package p480cr;

import ad1.C39543a;
import com.google.firebase.analytics.FirebaseAnalytics;
import di3.C86301e;
import ei3.C86522b;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C89132b;
import org.json.JSONObject;
import p496dr.C31264b;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49335eu3;
import te3.C49571gk0;
import te3.C51430tq0;
import te3.ly4;
import zc1.C66785b;

@C86522b
/* renamed from: cr.b */
public final class C45148b extends C86301e implements C31264b {

    /* renamed from: cr.b$a */
    public static final class C45149a implements C39543a<C51430tq0> {

        /* renamed from: a */
        public final /* synthetic */ C32224a<C13598b0> f122425a;

        public C45149a(C32224a<C13598b0> aVar) {
            this.f122425a = aVar;
        }

        /* renamed from: a */
        public void mo14610a(int i, int i2, String str, C49335eu3 eu32, JSONObject jSONObject) {
            C87412m.m108594g((C51430tq0) eu32, "resp");
            C87412m.m108594g(jSONObject, "reportExt");
        }

        /* renamed from: b */
        public void mo14611b(int i, int i2, String str, C49335eu3 eu32, JSONObject jSONObject) {
            C87412m.m108594g((C51430tq0) eu32, "resp");
            C87412m.m108594g(jSONObject, "reportExt");
            if (i == 0 && i2 == 0) {
                this.f122425a.invoke();
            }
        }

        /* renamed from: c */
        public int mo14612c() {
            return 3930;
        }
    }

    /* renamed from: Vd */
    public ArrayList<C49571gk0> mo58042Vd() {
        ArrayList<C49571gk0> arrayList = new ArrayList<>();
        LinkedList<C89349b> linkedList = C66785b.f191882e.mo90673n0().mo62397b().f140460D;
        C87412m.m108593f(linkedList, "FinderAccountAccess.acco….finder_init.expt_buffers");
        for (C89349b bVar : linkedList) {
            if (bVar != null && bVar.f257327a.length > 0) {
                C49571gk0 gk02 = new C49571gk0();
                gk02.parseFrom(bVar.mo123703f());
                arrayList.add(gk02);
            }
        }
        return arrayList;
    }

    public void f80(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "call");
        C66785b.f191882e.mo75316W2().f152703h.add(new C45149a(aVar));
    }

    public ly4 ur0() {
        return C66785b.f191882e.mo90673n0().mo62397b().f140469j;
    }

    /* renamed from: v4 */
    public C89132b<C51430tq0> mo58045v4(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        return C66785b.f191882e.mo90680v4(str);
    }
}
