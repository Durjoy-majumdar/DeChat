package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.C116314o;
import com.tencent.p014mm.vfs.C116344z0;
import gy3.C87412m;
import java.util.Map;
import sx3.C110821n;

/* renamed from: com.tencent.mm.vfs.p0 */
public final class C116319p0 implements C116344z0.C116345a {

    /* renamed from: a */
    public static final C116319p0 f349079a = new C116319p0();

    /* renamed from: a */
    public void mo177613a(String str, FileSystem fileSystem, int i, Map<String, ? extends Object> map) {
        String str2 = str;
        Map<String, ? extends Object> map2 = map;
        C87412m.m108594g(str2, "id");
        C87412m.m108594g(fileSystem, "fs");
        C87412m.m108594g(map2, "p");
        if (C110821n.m150959f(C75071z1.f220855a, str, 0, 0, 6, (Object) null) >= 0) {
            Object obj = map2.get("totalSize");
            Long l = null;
            Long l2 = obj instanceof Long ? (Long) obj : null;
            long longValue = l2 != null ? l2.longValue() : 0;
            Object obj2 = map2.get("fileCount");
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            int intValue = num != null ? num.intValue() : 0;
            if (longValue > 65536 && intValue > 0) {
                String str3 = "@TencentRemain-" + str2;
                String str4 = "@TencentRemain-" + str2;
                Object obj3 = map2.get("dirCount");
                Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
                int intValue2 = num2 != null ? num2.intValue() : 0;
                Object obj4 = map2.get("maxDepth");
                Integer num3 = obj4 instanceof Integer ? (Integer) obj4 : null;
                int intValue3 = num3 != null ? num3.intValue() : 0;
                Object obj5 = map2.get("maxFileSize");
                Long l3 = obj5 instanceof Long ? (Long) obj5 : null;
                long longValue2 = l3 != null ? l3.longValue() : 0;
                Object obj6 = map2.get("averageAge");
                if (obj6 instanceof Long) {
                    l = (Long) obj6;
                }
                C116314o.C116316b bVar = r0;
                C116314o.C116316b bVar2 = new C116314o.C116316b(str4, 0, 0, str, longValue, intValue, intValue2, intValue3, longValue2, l != null ? l.longValue() : 0, 0, 0);
                C116314o.m163920f(str3, bVar);
            }
        }
    }
}
