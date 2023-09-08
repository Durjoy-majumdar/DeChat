package com.tencent.p014mm.plugin.magicbrush;

import com.tencent.p014mm.plugin.magicbrush.api.IMBNetworkService;
import d42.C86184l;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import h52.C87446i;
import h52.C87449k;
import h52.C87451l;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

@C86522b
/* renamed from: com.tencent.mm.plugin.magicbrush.j1 */
public final class C85273j1 extends C86301e implements C85256f0 {

    /* renamed from: com.tencent.mm.plugin.magicbrush.j1$a */
    public /* synthetic */ class C85274a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f248431a;

        static {
            int[] iArr = new int[IMBNetworkService.Key.values().length];
            iArr[IMBNetworkService.Key.Download.ordinal()] = 1;
            iArr[IMBNetworkService.Key.CDNDownload.ordinal()] = 2;
            f248431a = iArr;
        }
    }

    /* renamed from: NQ */
    public String mo118376NQ(IMBNetworkService.Key key) {
        C87412m.m108594g(key, "type");
        int i = C85274a.f248431a[key.ordinal()];
        if (i == 1) {
            AtomicInteger atomicInteger = C87451l.f253412a;
            return String.valueOf(C87451l.f253412a.incrementAndGet());
        } else if (i != 2) {
            return null;
        } else {
            AtomicInteger atomicInteger2 = C87451l.f253412a;
            return String.valueOf(C87451l.f253413b.incrementAndGet());
        }
    }

    /* renamed from: r3 */
    public C86184l mo118377r3(String str, IMBNetworkService.Key key) {
        C86184l kVar;
        C87412m.m108594g(str, "bizName");
        C87412m.m108594g(key, "type");
        int i = C85274a.f248431a[key.ordinal()];
        if (i == 1) {
            AtomicInteger atomicInteger = C87451l.f253412a;
            HashMap<String, C87449k> hashMap = C87451l.f253414c;
            if (hashMap.containsKey(str)) {
                kVar = hashMap.get(str);
                if (kVar == null) {
                    hashMap.remove(str);
                    kVar = new C87449k();
                    hashMap.put(str, kVar);
                }
            } else {
                kVar = new C87449k();
                hashMap.put(str, kVar);
            }
        } else if (i != 2) {
            return null;
        } else {
            AtomicInteger atomicInteger2 = C87451l.f253412a;
            HashMap<String, C87446i> hashMap2 = C87451l.f253415d;
            if (hashMap2.containsKey(str)) {
                kVar = hashMap2.get(str);
                if (kVar == null) {
                    hashMap2.remove(str);
                    kVar = new C87446i();
                    hashMap2.put(str, kVar);
                }
            } else {
                kVar = new C87446i();
                hashMap2.put(str, kVar);
            }
        }
        return kVar;
    }

    /* renamed from: xf */
    public C86184l mo118378xf(String str, IMBNetworkService.Key key) {
        C87412m.m108594g(str, "bizName");
        C87412m.m108594g(key, "type");
        int i = C85274a.f248431a[key.ordinal()];
        if (i == 1) {
            AtomicInteger atomicInteger = C87451l.f253412a;
            HashMap<String, C87449k> hashMap = C87451l.f253414c;
            if (hashMap.containsKey(str)) {
                return hashMap.get(str);
            }
            return null;
        } else if (i != 2) {
            return null;
        } else {
            AtomicInteger atomicInteger2 = C87451l.f253412a;
            HashMap<String, C87446i> hashMap2 = C87451l.f253415d;
            if (hashMap2.containsKey(str)) {
                return hashMap2.get(str);
            }
            return null;
        }
    }
}
