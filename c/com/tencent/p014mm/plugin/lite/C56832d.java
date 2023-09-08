package com.tencent.p014mm.plugin.lite;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.lite.d */
public class C56832d {

    /* renamed from: a */
    public final Set<String> f162864a = new HashSet();

    /* renamed from: b */
    public int f162865b;

    /* renamed from: c */
    public C56833a f162866c;

    /* renamed from: com.tencent.mm.plugin.lite.d$a */
    public interface C56833a {
        /* renamed from: a */
        String mo80258a(String str, String str2);

        /* renamed from: b */
        boolean mo80259b(long j, String str, String str2, int i);
    }

    /* renamed from: com.tencent.mm.plugin.lite.d$b */
    public static class C56834b {

        /* renamed from: a */
        public String f162867a;

        /* renamed from: b */
        public String f162868b;

        public C56834b(String str, String str2) {
            this.f162867a = str;
            this.f162868b = str2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.d$c */
    public final class C56835c<T> {

        /* renamed from: a */
        public volatile T f162869a = null;

        public C56835c(C56832d dVar, T t) {
            this.f162869a = t;
        }
    }

    /* renamed from: a */
    public void mo80257a(List<C56834b> list) {
        int size = list.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = list.get(i).f162867a;
            strArr2[i] = list.get(i).f162868b;
        }
        LiteAppCenter.storeSetData(this.f162865b, strArr, strArr2);
    }
}
