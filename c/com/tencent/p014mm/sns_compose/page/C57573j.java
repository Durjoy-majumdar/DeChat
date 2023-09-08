package com.tencent.p014mm.sns_compose.page;

import gy3.C87412m;
import lh3.C99474g;

/* renamed from: com.tencent.mm.sns_compose.page.j */
public abstract class C57573j {

    /* renamed from: com.tencent.mm.sns_compose.page.j$a */
    public static final class C57574a extends C57573j {

        /* renamed from: a */
        public final C99474g f164864a;

        public C57574a(C99474g gVar) {
            C87412m.m108594g(gVar, "entity");
            this.f164864a = gVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C57574a) && C87412m.m108589b(this.f164864a, ((C57574a) obj).f164864a);
        }

        public int hashCode() {
            return this.f164864a.hashCode();
        }

        public String toString() {
            return "Remove(entity=" + this.f164864a + ')';
        }
    }
}
