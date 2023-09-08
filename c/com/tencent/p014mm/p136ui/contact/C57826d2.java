package com.tencent.p014mm.p136ui.contact;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.ui.contact.d2 */
public class C57826d2 {

    /* renamed from: a */
    public static int f165449a;

    /* renamed from: b */
    public static List<String> f165450b;

    /* renamed from: c */
    public static List<String> f165451c;

    /* renamed from: a */
    public static void m66826a(List<String> list) {
        List<String> list2;
        if (!(f165450b == null || (list2 = f165451c) == null || list2.size() <= 0 || list == null || list.size() <= 0)) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            LinkedList linkedList3 = new LinkedList();
            for (String next : list) {
                if (!((LinkedList) f165450b).contains(next)) {
                    if (f165451c.contains(next)) {
                        linkedList.add(next);
                    } else {
                        linkedList2.add(next);
                    }
                }
            }
            for (int i = 0; i < f165451c.size(); i++) {
                if (linkedList.contains(f165451c.get(i))) {
                    linkedList3.add("" + i);
                }
            }
            if (linkedList.size() > 0 || linkedList2.size() > 0) {
                C115669n.INSTANCE.mo160131h(18637, Integer.valueOf(f165449a), TextUtils.join(";", f165450b), TextUtils.join(";", f165451c), TextUtils.join(";", linkedList), TextUtils.join(";", linkedList2), TextUtils.join(";", linkedList3));
                Log.m105919d("MicroMsg.NewGroupRecommendDetailReporter", "report, selectFromRecommend: %s, selectNotFromRecommendList: %s", linkedList, linkedList2);
            }
        }
        f165450b = null;
        f165451c = null;
        Log.m105918d("MicroMsg.NewGroupRecommendDetailReporter", "reset");
    }
}
