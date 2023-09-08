package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.plugin.scanner.model.C94474a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.scanner.model.b0 */
public class C94476b0 {
    /* renamed from: a */
    public static LinkedList<String> m119499a(List<C94474a> list) {
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            LinkedList<C94474a.C94475a> linkedList2 = list.get(i).f273158f;
            for (int i2 = 0; i2 < linkedList2.size(); i2++) {
                C94474a.C94475a aVar = linkedList2.get(i2);
                if (!Util.isNullOrNil(aVar.f273178t)) {
                    linkedList.add(aVar.f273178t);
                }
            }
        }
        return linkedList;
    }

    /* renamed from: b */
    public static boolean m119500b(List<C94474a> list, Map<String, C94474a.C94475a> map) {
        if (map == null || map.size() <= 0 || list == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                LinkedList<C94474a.C94475a> linkedList = list.get(i).f273158f;
                boolean z2 = false;
                for (int i2 = 0; i2 < linkedList.size(); i2++) {
                    C94474a.C94475a aVar = linkedList.get(i2);
                    if (!Util.isNullOrNil(aVar.f273178t)) {
                        C94474a.C94475a aVar2 = map.get(aVar.f273178t);
                        if (aVar2 != null) {
                            Log.m105924i("MicroMsg.ProductUpdateLogic", "Updating action , info: key=" + aVar.f273178t);
                            linkedList.remove(i2);
                            linkedList.add(i2, aVar2);
                            z = true;
                        }
                    }
                    z2 = true;
                }
                list.get(i).f273157e = z2;
            }
        }
        return z;
    }
}
