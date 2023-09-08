package up1;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C64186f0;
import te3.C49980je1;
import te3.C50141kk1;
import wp1.C15585f;

/* renamed from: up1.s */
public final class C14362s {

    /* renamed from: a */
    public final C49980je1 f39919a;

    /* renamed from: b */
    public final LinkedList<BaseFinderFeed> f39920b;

    /* renamed from: c */
    public final C13601g f39921c;

    /* renamed from: up1.s$a */
    public static final class C14363a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C14362s f39922d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14363a(C14362s sVar) {
            super(0);
            this.f39922d = sVar;
        }

        public Object invoke() {
            return Long.valueOf((long) MD5Util.getMD5String(this.f39922d.mo13667b()).hashCode());
        }
    }

    public C14362s(C49980je1 je12) {
        Collection collection;
        C87412m.m108594g(je12, "section");
        this.f39919a = je12;
        LinkedList<BaseFinderFeed> linkedList = new LinkedList<>();
        this.f39920b = linkedList;
        LinkedList<FinderObject> linkedList2 = je12.f136046e;
        if (linkedList2 != null) {
            ArrayList<FinderObject> arrayList = new ArrayList<>();
            Iterator<T> it = linkedList2.iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                FinderObject finderObject = (FinderObject) next;
                if ((finderObject != null ? finderObject.objectDesc : null) == null ? false : z) {
                    arrayList.add(next);
                }
            }
            collection = new ArrayList();
            for (FinderObject finderObject2 : arrayList) {
                FinderItem.C56324a aVar = FinderItem.Companion;
                C87412m.m108593f(finderObject2, "feed");
                collection.add(C15585f.f42211a.mo14348k(aVar.mo79056a(finderObject2, 1)));
            }
        } else {
            collection = C64186f0.f181907d;
        }
        linkedList.addAll(collection);
        this.f39921c = C36568h.m40985a(new C14363a(this));
    }

    /* renamed from: a */
    public final int mo13666a() {
        return mo13668c().f136850h;
    }

    /* renamed from: b */
    public final String mo13667b() {
        String str = mo13668c().f136847e;
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public final C50141kk1 mo13668c() {
        C50141kk1 kk12 = this.f39919a.f136045d;
        if (kk12 != null) {
            return kk12;
        }
        C50141kk1 kk13 = new C50141kk1();
        kk13.f136846d = "";
        kk13.f136847e = "";
        kk13.f136848f = "";
        kk13.f136849g = 0;
        kk13.f136850h = 0;
        kk13.f136851i = "";
        kk13.f136852j = "";
        kk13.f136853n = "";
        kk13.f136854o = 0;
        return kk13;
    }

    /* renamed from: d */
    public final String mo13669d() {
        String str = mo13668c().f136846d;
        return str == null ? "" : str;
    }
}
