package af2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: af2.f */
public class C0036f {

    /* renamed from: a */
    public List<String> f43a;

    public C0036f() {
        ArrayList arrayList = new ArrayList();
        this.f43a = arrayList;
        arrayList.clear();
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(270340, "");
        Log.m105918d("MicroMsg.MallNewsManager", "data : " + str);
        for (String next : Util.stringsToList(str.split(";"))) {
            if (!Util.isNullOrNil(next)) {
                this.f43a.add(next);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo39a() {
        Log.m105918d("MicroMsg.MallNewsManager", "notifyNewsMap.size : " + ((ArrayList) this.f43a).size());
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = ((ArrayList) this.f43a).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!Util.isNullOrNil(str) && !str.contains(";")) {
                stringBuffer.append(str);
            }
        }
        Log.m105918d("MicroMsg.MallNewsManager", "save data  : " + stringBuffer.toString());
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(270340, stringBuffer.toString());
        return true;
    }
}
