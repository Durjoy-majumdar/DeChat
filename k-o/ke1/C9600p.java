package ke1;

import com.tencent.p014mm.plugin.finder.feed.model.C2781d;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import er1.C58784w3;
import f40.C86709a0;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C9360p1;
import kj2.C117407d;
import ob0.C117747y;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C50566nn0;
import wp1.C15585f;

/* renamed from: ke1.p */
public final class C9600p extends C87413o implements C32230s<Integer, Integer, String, C50566nn0, C117747y, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List<FinderObject> f29857d;

    /* renamed from: e */
    public final /* synthetic */ C9595n f29858e;

    /* renamed from: f */
    public final /* synthetic */ int f29859f;

    /* renamed from: g */
    public final /* synthetic */ boolean f29860g;

    /* renamed from: h */
    public final /* synthetic */ boolean f29861h;

    /* renamed from: i */
    public final /* synthetic */ C9360p1.C9361a f29862i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9600p(List<? extends FinderObject> list, C9595n nVar, int i, boolean z, boolean z2, C9360p1.C9361a aVar) {
        super(5);
        this.f29857d = list;
        this.f29858e = nVar;
        this.f29859f = i;
        this.f29860g = z;
        this.f29861h = z2;
        this.f29862i = aVar;
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        List<FinderItem> list;
        ArrayList arrayList;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        String str = (String) obj3;
        C50566nn0 nn02 = (C50566nn0) obj4;
        C117747y yVar = (C117747y) obj5;
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_HEADER_WORDING_STRING_SYNC, "headWording");
        if (f instanceof String) {
            String str2 = (String) f;
        }
        Object f2 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_FOOTER_WORDING_STRING_SYNC, "endWording");
        if (f2 instanceof String) {
            String str3 = (String) f2;
        }
        C89349b bVar = null;
        if (intValue == 0 && intValue2 == 0) {
            C117407d.INSTANCE.idkeyStat(1279, 3, 1, false);
            LinkedList<FinderObject> linkedList = nn02 != null ? nn02.f138688d : null;
            C87412m.m108591d(linkedList);
            LinkedList linkedList2 = new LinkedList();
            List<FinderObject> list2 = this.f29857d;
            if (list2 != null) {
                linkedList2.addAll(list2);
            }
            linkedList2.addAll(linkedList);
            ArrayList arrayList2 = new ArrayList();
            for (Object next : linkedList2) {
                if (C58784w3.f168295a.mo83866E0((FinderObject) next)) {
                    arrayList2.add(next);
                }
            }
            C15585f.C15586a aVar = C15585f.f42211a;
            list = aVar.mo14343f(arrayList2, C58784w3.f168295a.mo83887M1(this.f29858e.f29843g), this.f29858e.f29844h);
            if (this.f29859f != 2) {
                ArrayList arrayList3 = new ArrayList(C36907w.m41090l(list, 10));
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    arrayList3.add(C15585f.f42211a.mo14348k((FinderItem) it.next()));
                }
                aVar.mo14346i(arrayList3, C58784w3.f168295a.mo83887M1(this.f29858e.f29843g), "", this.f29860g);
            }
        } else {
            C117407d.INSTANCE.idkeyStat(1279, 4, 1, false);
            list = null;
        }
        if (list != null) {
            arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (FinderItem k : list) {
                arrayList.add(C15585f.f42211a.mo14348k(k));
            }
        } else {
            arrayList = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[getHistory] tabType=");
        sb.append(this.f29858e.f29843g);
        sb.append(" list ");
        sb.append(list != null ? Integer.valueOf(list.size()) : null);
        sb.append(",isFirstPage=");
        sb.append(this.f29861h);
        sb.append(" extraList=");
        List<FinderObject> list3 = this.f29857d;
        sb.append(list3 != null ? Integer.valueOf(list3.size()) : null);
        sb.append(" pullType=");
        sb.append(this.f29859f);
        sb.append(" continue_flag=");
        sb.append(nn02 != null ? Integer.valueOf(nn02.f138690f) : null);
        sb.append(" errType=");
        sb.append(intValue);
        sb.append(" errCode=");
        sb.append(intValue2);
        Log.m105924i("Finder.FinderLbsFeedFetcher", sb.toString());
        C2781d dVar = new C2781d(arrayList, intValue, intValue2, str);
        if (nn02 != null) {
            bVar = nn02.f138689e;
        }
        dVar.f13977n = bVar;
        int i = 1;
        if (intValue == 0 && intValue2 == 0) {
            if (nn02 != null) {
                i = nn02.f138690f;
            }
            dVar.f13971h = i;
        } else {
            dVar.f13971h = 1;
        }
        this.f29862i.mo2805a(dVar, this.f29859f);
        return C13598b0.f38549a;
    }
}
