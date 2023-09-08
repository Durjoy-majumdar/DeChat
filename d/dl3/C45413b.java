package dl3;

import bl3.C16795g;
import bl3.C39818r;
import bp3.C39830h;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: dl3.b */
public interface C45413b extends C16795g, C39830h {

    /* renamed from: dl3.b$a */
    public static final class C45414a {
        /* renamed from: a */
        public static void m50357a(C45413b bVar, MMFragmentActivity mMFragmentActivity) {
            C87412m.m108594g(mMFragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C20479a aVar = (C20479a) C39818r.f106831a.mo62444c(mMFragmentActivity).mo75002a(C20479a.class);
            aVar.getClass();
            C87412m.m108594g(bVar, "gloCom");
            if (aVar.f57582d.containsKey(bVar.getTag())) {
                LinkedList linkedList = aVar.f57582d.get(bVar.getTag());
                if (linkedList != null) {
                    linkedList.add(bVar);
                    return;
                }
                return;
            }
            HashMap<String, LinkedList<C45413b>> hashMap = aVar.f57582d;
            String tag = bVar.getTag();
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(bVar);
            hashMap.put(tag, linkedList2);
        }

        /* renamed from: b */
        public static void m50358b(C45413b bVar, MMFragmentActivity mMFragmentActivity) {
            C87412m.m108594g(mMFragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C20479a aVar = (C20479a) C39818r.f106831a.mo62444c(mMFragmentActivity).mo75002a(C20479a.class);
            aVar.getClass();
            C87412m.m108594g(bVar, "gloCom");
            LinkedList linkedList = aVar.f57582d.get(bVar.getTag());
            if (linkedList != null) {
                linkedList.remove(bVar);
                if (linkedList.isEmpty()) {
                    aVar.f57582d.remove(bVar.getTag());
                }
            }
        }
    }
}
