package com.tencent.p014mm.plugin.finder.extension.reddot.render;

import android.view.ViewGroup;
import ht1.C60165e4;
import java.util.List;
import te3.C49308en1;
import te3.C50301lr3;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.a */
public interface C18747a {

    /* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.a$a */
    public static final class C18748a {

        /* renamed from: a */
        public final int f52457a;

        /* renamed from: b */
        public final boolean f52458b;

        public C18748a(int i, boolean z) {
            this.f52457a = i;
            this.f52458b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18748a)) {
                return false;
            }
            C18748a aVar = (C18748a) obj;
            return this.f52457a == aVar.f52457a && this.f52458b == aVar.f52458b;
        }

        public int hashCode() {
            int i = this.f52457a * 31;
            boolean z = this.f52458b;
            if (z) {
                z = true;
            }
            return i + (z ? 1 : 0);
        }

        public String toString() {
            return "RenderParam(maxSize=" + this.f52457a + ", isShort=" + this.f52458b + ')';
        }
    }

    /* renamed from: a */
    List<C41411b> mo23616a(List<? extends C50301lr3> list);

    /* renamed from: b */
    C60165e4.C46105a mo23617b();

    /* renamed from: c */
    ViewGroup mo23618c(C18748a aVar, List<? extends C41411b> list, C49308en1 en12);

    /* renamed from: d */
    boolean mo23619d(C18748a aVar, List<? extends C41411b> list);
}
