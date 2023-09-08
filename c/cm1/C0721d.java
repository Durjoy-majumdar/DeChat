package cm1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import org.json.JSONArray;

/* renamed from: cm1.d */
public final class C0721d {

    /* renamed from: e */
    public static final C0722a f1732e = new C0722a((C8480h) null);

    /* renamed from: a */
    public ArrayList<C0712b0> f1733a = new ArrayList<>();

    /* renamed from: b */
    public ArrayList<C0712b0> f1734b = new ArrayList<>();

    /* renamed from: c */
    public String f1735c = "";

    /* renamed from: d */
    public String f1736d = "";

    /* renamed from: cm1.d$a */
    public static final class C0722a {
        public C0722a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C0721d mo697a(ArrayList<C0712b0> arrayList, ArrayList<C0712b0> arrayList2) {
            C0721d dVar = new C0721d();
            if (arrayList == null && arrayList2 == null) {
                return dVar;
            }
            if (arrayList == null && arrayList2 != null) {
                dVar.f1733a = arrayList2;
                dVar.f1735c = mo698b(arrayList2);
                Log.m105924i("FinderFeedLiveList", "[updateLiveList]increment list:" + arrayList2);
                return dVar;
            } else if (arrayList == null || arrayList2 != null) {
                C87412m.m108591d(arrayList);
                ArrayList arrayList3 = new ArrayList(arrayList);
                ArrayList<C0712b0> arrayList4 = new ArrayList<>(arrayList);
                C87412m.m108591d(arrayList2);
                ArrayList<C0712b0> arrayList5 = new ArrayList<>(arrayList2);
                arrayList3.retainAll(arrayList5);
                arrayList4.removeAll(arrayList3);
                arrayList5.removeAll(arrayList3);
                Log.m105924i("FinderFeedLiveList", "[updateLiveList]mix list:" + arrayList3);
                Log.m105924i("FinderFeedLiveList", "[updateLiveList]remove list:" + arrayList4);
                Log.m105924i("FinderFeedLiveList", "[updateLiveList]increment list:" + arrayList5);
                dVar.f1734b = arrayList4;
                dVar.f1733a = arrayList5;
                dVar.f1736d = mo698b(arrayList4);
                dVar.f1735c = mo698b(arrayList5);
                return dVar;
            } else {
                dVar.f1734b = arrayList;
                dVar.f1736d = mo698b(arrayList);
                Log.m105924i("FinderFeedLiveList", "[updateLiveList]remove list:" + arrayList);
                return dVar;
            }
        }

        /* renamed from: b */
        public final String mo698b(ArrayList<C0712b0> arrayList) {
            if (arrayList == null || arrayList.isEmpty()) {
                return "";
            }
            JSONArray jSONArray = new JSONArray();
            for (C0712b0 b0Var : arrayList) {
                if (b0Var instanceof C0712b0) {
                    FinderContact finderContact = b0Var.f1709d.contact;
                    jSONArray.put(finderContact != null ? finderContact.username : null);
                }
            }
            String jSONArray2 = jSONArray.toString();
            C87412m.m108593f(jSONArray2, "array.toString()");
            return jSONArray2;
        }
    }
}
