package hi0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ki0.C33908a;
import ki0.C33909b;
import te3.e75;
import te3.f75;

/* renamed from: hi0.b */
public class C32917b extends C87491a<Boolean, f75> {
    /* renamed from: b */
    public Object mo58858b(String str, String str2, Object obj) {
        boolean z;
        f75 f75 = (f75) obj;
        C33909b bVar = (C33909b) C81161g2.Bx0(C33909b.class);
        bVar.getClass();
        if (Util.isNullOrNil((List) f75.f133346f) || Util.isNullOrNil((List) f75.f133345e)) {
            Object[] objArr = new Object[4];
            objArr[0] = str;
            objArr[1] = str2;
            LinkedList<Integer> linkedList = f75.f133346f;
            int i = -1;
            objArr[2] = Integer.valueOf(linkedList == null ? -1 : linkedList.size());
            LinkedList<Integer> linkedList2 = f75.f133345e;
            if (linkedList2 != null) {
                i = linkedList2.size();
            }
            objArr[3] = Integer.valueOf(i);
            Log.m105921e("MicroMsg.AppBrand.Predownload.CmdBlockCgiPersistentStorage", "saveBlockList with username(%s) appId(%s) sceneList.size(%d), blockCgi.size(%d), skip", objArr);
            z = false;
        } else {
            C33908a aVar = new C33908a();
            aVar.field_username = str;
            boolean z2 = bVar.get(aVar, new String[0]);
            aVar.field_appId = str2;
            aVar.field_startTime = (long) f75.f133347g;
            aVar.field_endTime = (long) f75.f133348h;
            StringBuilder sb = new StringBuilder(";");
            Iterator<Integer> it = f75.f133346f.iterator();
            while (it.hasNext()) {
                sb.append(it.next().intValue());
                sb.append(";");
            }
            aVar.field_sceneList = sb.toString();
            StringBuilder sb4 = new StringBuilder(";");
            Iterator<Integer> it4 = f75.f133345e.iterator();
            while (it4.hasNext()) {
                sb4.append(it4.next().intValue());
                sb4.append(";");
            }
            aVar.field_cgiList = sb4.toString();
            aVar.field_reportId = f75.f133344d.f132768f;
            Log.m105925i("MicroMsg.AppBrand.Predownload.CmdBlockCgiPersistentStorage", "saveBlockList, record( %s ), doUpdate %b", aVar, Boolean.valueOf(z2));
            z = z2 ? bVar.update(aVar, new String[0]) : bVar.insert(aVar);
        }
        Log.m105925i("MicroMsg.AppBrand.Predownload.CmdBlockCgiRequest", "saveBlockList with username(%s) appId(%s), ret %b", str, str2, Boolean.valueOf(z));
        return Boolean.valueOf(z);
    }

    /* renamed from: d */
    public e75 mo58859d(Object obj) {
        return ((f75) obj).f133344d;
    }

    /* renamed from: e */
    public String mo58860e() {
        return "CmdBlockCgiRequest";
    }
}
