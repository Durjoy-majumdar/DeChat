package bg0;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import ep3.C97683a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import yf0.C79104i;

/* renamed from: bg0.d */
public class C67226d extends C97683a {

    /* renamed from: bg0.d$a */
    public class C67227a extends C97683a.C75649d<C67228b> {
        public C67227a() {
            super(C67226d.this);
        }

        /* renamed from: a */
        public Object mo91385a() {
            C67226d dVar = C67226d.this;
            boolean z = true;
            int a = dVar.f286525o.mo106599a("enter_scene", 1);
            int a2 = dVar.f286525o.mo106599a("group_solitatire_flag", 0);
            Bundle bundle = dVar.f286525o.f223650a;
            ArrayList<String> arrayList = null;
            ArrayList<String> stringArrayList = bundle == null ? null : bundle.getStringArrayList("oldAmountData");
            Log.m105925i("MicroMsg.LaunchAAByPersonAmountSelectInteractor", "getSelectMembers scene:%s oldDataList: %s", Integer.valueOf(a), stringArrayList);
            C67228b bVar = new C67228b(dVar);
            if (stringArrayList != null) {
                try {
                    if (stringArrayList.size() > 0) {
                        Iterator<String> it = stringArrayList.iterator();
                        while (it.hasNext()) {
                            String[] split = it.next().split(",");
                            if (split != null && split.length == 2) {
                                bVar.f193049b.put(split[0], Double.valueOf(Util.getDouble(split[1], 0.0d)));
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.LaunchAAByPersonAmountSelectInteractor", "getSelectMembers parse old data error: %s", e.getMessage());
                }
            }
            if (a == 6) {
                Bundle bundle2 = dVar.f286525o.f223650a;
                if (bundle2 != null) {
                    arrayList = bundle2.getStringArrayList("third_party_usernamelist");
                }
                if (arrayList != null && arrayList.size() > 0) {
                    bVar.f193048a = new ArrayList();
                    Iterator<String> it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        bVar.f193048a.add(it4.next());
                    }
                }
            } else {
                if (a2 != 1) {
                    z = false;
                }
                if (z) {
                    Bundle bundle3 = dVar.f286525o.f223650a;
                    bVar.f193048a = bundle3 == null ? null : bundle3.getStringArrayList("group_solitatire_username_list");
                    Bundle bundle4 = dVar.f286525o.f223650a;
                    if (bundle4 != null) {
                        arrayList = bundle4.getStringArrayList("group_solitatire_desc_list");
                    }
                    bVar.f193050c = arrayList;
                } else {
                    String b = dVar.f286525o.mo106600b("chatroom");
                    if (!Util.isNullOrNil(b)) {
                        List<String> i = C79104i.m95664i(b);
                        bVar.f193048a = i;
                        if (i.size() > 0) {
                            bVar.f193048a.remove(C75592q0.m90789s());
                        }
                    }
                }
            }
            return bVar;
        }
    }

    /* renamed from: bg0.d$b */
    public class C67228b {

        /* renamed from: a */
        public List<String> f193048a;

        /* renamed from: b */
        public HashMap<String, Double> f193049b = new HashMap<>();

        /* renamed from: c */
        public List<String> f193050c;

        public C67228b(C67226d dVar) {
        }
    }

    /* renamed from: d */
    public void mo67526d() {
        super.mo67526d();
        C67227a aVar = new C67227a();
        mo136932b();
        ((ConcurrentHashMap) this.f286519f).put(C67228b.class, aVar);
    }
}
