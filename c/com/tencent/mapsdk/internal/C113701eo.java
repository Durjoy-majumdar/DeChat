package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.ViewGroup;

/* renamed from: com.tencent.mapsdk.internal.eo */
public interface C113701eo extends C113723fh {

    /* renamed from: com.tencent.mapsdk.internal.eo$a */
    public enum C113702a {
        LEFT(0),
        RIGHT(1),
        BOTTOM(2),
        TOP(3);
        

        /* renamed from: e */
        public int f340162e;

        private C113702a(int i) {
            this.f340162e = i;
        }

        /* renamed from: a */
        public static final C113702a m156707a(int i) {
            if (i < 0 || i >= values().length) {
                i = 0;
            }
            return values()[i];
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.eo$b */
    public enum C113703b {
        LEFT_BOTTOM(0),
        CENTER_BOTTOM(4),
        RIGHT_BOTTOM(1),
        LEFT_TOP(3),
        CENTER_TOP(5),
        RIGHT_TOP(2);
        

        /* renamed from: g */
        public final int f340170g;

        private C113703b(int i) {
            this.f340170g = i;
        }

        /* renamed from: a */
        public static C113703b m156708a(int i) {
            if (i < 0 || i >= values().length) {
                i = 0;
            }
            C113703b bVar = LEFT_BOTTOM;
            for (C113703b bVar2 : values()) {
                if (bVar2.f340170g == i) {
                    return bVar2;
                }
            }
            return bVar;
        }
    }

    /* renamed from: a */
    Rect mo171996a();

    /* renamed from: a */
    void mo171998a(C113703b bVar);

    /* renamed from: a */
    boolean mo171999a(ViewGroup viewGroup, Bundle bundle);

    /* renamed from: c */
    void mo172000c();

    /* renamed from: d */
    C113703b mo172001d();
}
