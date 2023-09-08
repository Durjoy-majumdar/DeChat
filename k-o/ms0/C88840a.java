package ms0;

import android.os.Bundle;
import p224ra.C12964b;

/* renamed from: ms0.a */
public interface C88840a extends C12964b {

    /* renamed from: ms0.a$a */
    public static class C88841a {

        /* renamed from: a */
        public double f256263a;

        /* renamed from: b */
        public double f256264b;

        /* renamed from: c */
        public String f256265c;

        /* renamed from: d */
        public double f256266d;

        /* renamed from: e */
        public double f256267e;

        /* renamed from: f */
        public double f256268f;

        /* renamed from: g */
        public String f256269g;

        /* renamed from: h */
        public String f256270h;

        /* renamed from: i */
        public int f256271i;

        /* renamed from: j */
        public float f256272j;

        /* renamed from: k */
        public double f256273k = 0.0d;

        /* renamed from: l */
        public String f256274l;

        public String toString() {
            return "Location{latitude=" + this.f256263a + ", longitude=" + this.f256264b + ", provider='" + this.f256265c + '\'' + ", speed=" + this.f256266d + ", accuracy=" + this.f256267e + ", altitude=" + this.f256268f + ", buildingId='" + this.f256269g + '\'' + ", floorName='" + this.f256270h + '\'' + ", extra=" + null + ", indoorLocationType=" + this.f256271i + ", direction=" + this.f256272j + '}';
        }
    }

    /* renamed from: ms0.a$b */
    public interface C88842b {
        /* renamed from: f */
        void mo114898f(int i, String str, C88841a aVar);
    }

    boolean Cb0(String str, C88842b bVar, Bundle bundle);

    /* renamed from: M9 */
    void mo123224M9(String str, C88842b bVar, Bundle bundle);

    /* renamed from: a6 */
    boolean mo123225a6(String str, C88842b bVar, Bundle bundle);
}
