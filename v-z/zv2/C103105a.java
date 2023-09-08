package zv2;

import gy3.C8480h;
import java.util.HashSet;
import sx3.C110818d0;
import xv2.C102776e;
import yv2.C102968a;

/* renamed from: zv2.a */
public final class C103105a extends C102968a<C103106a> implements C102776e {

    /* renamed from: b */
    public static final C103105a f304209b = new C103105a();

    /* renamed from: zv2.a$a */
    public static final class C103106a {

        /* renamed from: a */
        public int f304210a;

        /* renamed from: b */
        public boolean f304211b;

        /* renamed from: c */
        public int f304212c;

        /* renamed from: d */
        public int f304213d;

        /* renamed from: e */
        public final HashSet<C102776e.C102777a> f304214e;

        public C103106a() {
            this(0, false, 0, 0, 15, (C8480h) null);
        }

        public C103106a(int i, boolean z, int i2, int i3, int i4, C8480h hVar) {
            i = (i4 & 1) != 0 ? 2 : i;
            z = (i4 & 2) != 0 ? true : z;
            i2 = (i4 & 4) != 0 ? 0 : i2;
            i3 = (i4 & 8) != 0 ? 0 : i3;
            this.f304210a = i;
            this.f304211b = z;
            this.f304212c = i2;
            this.f304213d = i3;
            this.f304214e = new HashSet<>();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C103106a)) {
                return false;
            }
            C103106a aVar = (C103106a) obj;
            return this.f304210a == aVar.f304210a && this.f304211b == aVar.f304211b && this.f304212c == aVar.f304212c && this.f304213d == aVar.f304213d;
        }

        public int hashCode() {
            int i = this.f304210a * 31;
            boolean z = this.f304211b;
            if (z) {
                z = true;
            }
            return ((((i + (z ? 1 : 0)) * 31) + this.f304212c) * 31) + this.f304213d;
        }

        public String toString() {
            return "StoryBasicConfig(repeatMD5=" + this.f304210a + ", showMusicIcon=" + this.f304211b + ", albumThumbHeight=" + this.f304212c + ", albumThumbWidth=" + this.f304213d + ')';
        }
    }

    /* renamed from: c */
    public synchronized boolean mo142533c(C102776e.C102777a aVar) {
        return C110818d0.m150903D(((C103106a) mo138761d()).f304214e, aVar);
    }

    /* renamed from: g */
    public Object mo137402g() {
        return new C103106a(0, false, 0, 0, 15, (C8480h) null);
    }

    /* renamed from: h */
    public void mo137403h() {
    }
}
