package com.tencent.matrix.lifecycle;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.tencent.matrix.lifecycle.g0 */
public final class C28657g0 {

    /* renamed from: a */
    public static final C32226l<Collection<? extends C28660i>, Boolean> f78630a = C28659b.f78633d;

    /* renamed from: b */
    public static final C32226l<Collection<? extends C28660i>, Boolean> f78631b = C28658a.f78632d;

    /* renamed from: com.tencent.matrix.lifecycle.g0$a */
    public static final class C28658a extends C87413o implements C32226l<Collection<? extends C28660i>, Boolean> {

        /* renamed from: d */
        public static final C28658a f78632d = new C28658a();

        public C28658a() {
            super(1);
        }

        public Object invoke(Object obj) {
            Collection collection = (Collection) obj;
            C87412m.m108594g(collection, "statefuls");
            boolean z = true;
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((C28660i) it.next()).active()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.g0$b */
    public static final class C28659b extends C87413o implements C32226l<Collection<? extends C28660i>, Boolean> {

        /* renamed from: d */
        public static final C28659b f78633d = new C28659b();

        public C28659b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Collection collection = (Collection) obj;
            C87412m.m108594g(collection, "statefuls");
            boolean z = false;
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C28660i) it.next()).active()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }
}
