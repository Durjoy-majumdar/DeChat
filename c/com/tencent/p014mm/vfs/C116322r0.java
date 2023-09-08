package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.FileSystem;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.r0 */
public final class C116322r0 {

    /* renamed from: a */
    public static final int[] f349081a = {10, 20};

    /* renamed from: b */
    public static final int[] f349082b = {11, 21};

    /* renamed from: c */
    public static final int[] f349083c = {12, 22};

    /* renamed from: d */
    public static final int[] f349084d = {13, 23};

    /* renamed from: e */
    public static final int[] f349085e = {14, 24};

    /* renamed from: f */
    public static final int[] f349086f = {15, 25};

    /* renamed from: g */
    public static final int[] f349087g = {16, 26};

    /* renamed from: h */
    public static final int[] f349088h = {17, 27};

    /* renamed from: i */
    public static final int[] f349089i = {18, 28};

    /* renamed from: j */
    public static final int[] f349090j = {19, 29};

    /* renamed from: k */
    public static final Map<String, Integer> f349091k;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("attachment", 1966120);
        linkedHashMap.put("Download", 2031657);
        linkedHashMap.put("voice", 2097194);
        linkedHashMap.put("voice2", 2162731);
        linkedHashMap.put("image", 2228268);
        linkedHashMap.put("oldimage2", 2293805);
        linkedHashMap.put("video", 2359342);
        linkedHashMap.put("oneday", 2424879);
        linkedHashMap.put("emoji", 2490416);
        linkedHashMap.put("finder", 2555953);
        linkedHashMap.put("CDNDownloadBigFile", 9896088);
        linkedHashMap.put("CheckResUpdate", 10092699);
        f349091k = Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    public static boolean m163934a(C116309m mVar) {
        List<FileSystem.C85995c> G = mVar.mo119926G();
        for (FileSystem.C85995c list : G.subList(1, G.size())) {
            Iterable<C86001b0> list2 = list.list("");
            if (list2 != null && list2.iterator().hasNext()) {
                return false;
            }
        }
        return true;
    }
}
