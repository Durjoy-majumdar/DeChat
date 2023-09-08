package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.vfs.C86009m1;
import gy3.C87412m;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.n */
public abstract class C82739n {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.n$a */
    public static final class C82740a extends C82739n {

        /* renamed from: a */
        public static final C82740a f242060a = new C82740a();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.n$b */
    public static final class C82741b extends C82739n {

        /* renamed from: a */
        public final String f242061a;

        public C82741b(String str) {
            this.f242061a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C82741b) && C87412m.m108589b(this.f242061a, ((C82741b) obj).f242061a);
        }

        public int hashCode() {
            String str = this.f242061a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "FAILED(message=" + this.f242061a + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.n$c */
    public static final class C82742c extends C82739n {

        /* renamed from: a */
        public final List<C86009m1> f242062a;

        /* renamed from: b */
        public final int f242063b;

        public C82742c(List<? extends C86009m1> list, int i) {
            C87412m.m108594g(list, "files");
            this.f242062a = list;
            this.f242063b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C82742c)) {
                return false;
            }
            C82742c cVar = (C82742c) obj;
            return C87412m.m108589b(this.f242062a, cVar.f242062a) && this.f242063b == cVar.f242063b;
        }

        public int hashCode() {
            return (this.f242062a.hashCode() * 31) + this.f242063b;
        }

        public String toString() {
            return "OK(files=" + this.f242062a + ", from=" + this.f242063b + ')';
        }
    }
}
