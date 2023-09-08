package ib2;

import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C8480h;
import gy3.C87412m;
import zb2.C66777a;

/* renamed from: ib2.a */
public final class C60265a extends C66777a<C60265a> {

    /* renamed from: d */
    public String f171812d;

    /* renamed from: e */
    public final int f171813e;

    /* renamed from: f */
    public final long f171814f;

    /* renamed from: g */
    public final int f171815g;

    /* renamed from: h */
    public C60266a f171816h;

    /* renamed from: i */
    public C60267b f171817i;

    /* renamed from: j */
    public int f171818j;

    /* renamed from: n */
    public int f171819n = -1;

    /* renamed from: ib2.a$a */
    public static final class C60266a {

        /* renamed from: a */
        public long f171820a;

        /* renamed from: b */
        public long f171821b;

        /* renamed from: c */
        public String f171822c;

        /* renamed from: d */
        public GalleryItem$MediaItem f171823d;

        /* renamed from: e */
        public int f171824e;

        /* renamed from: f */
        public int f171825f;

        public C60266a() {
            this(0, 0, (String) null, (GalleryItem$MediaItem) null, 0, 0, 63, (C8480h) null);
        }

        public C60266a(long j, long j2, String str, GalleryItem$MediaItem galleryItem$MediaItem, int i, int i2, int i3, C8480h hVar) {
            j = (i3 & 1) != 0 ? 0 : j;
            j2 = (i3 & 2) != 0 ? 0 : j2;
            str = (i3 & 4) != 0 ? null : str;
            galleryItem$MediaItem = (i3 & 8) != 0 ? null : galleryItem$MediaItem;
            i = (i3 & 16) != 0 ? 0 : i;
            i2 = (i3 & 32) != 0 ? 0 : i2;
            this.f171820a = j;
            this.f171821b = j2;
            this.f171822c = str;
            this.f171823d = galleryItem$MediaItem;
            this.f171824e = i;
            this.f171825f = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C60266a)) {
                return false;
            }
            C60266a aVar = (C60266a) obj;
            return this.f171820a == aVar.f171820a && this.f171821b == aVar.f171821b && C87412m.m108589b(this.f171822c, aVar.f171822c) && C87412m.m108589b(this.f171823d, aVar.f171823d) && this.f171824e == aVar.f171824e && this.f171825f == aVar.f171825f;
        }

        public int hashCode() {
            long j = this.f171820a;
            long j2 = this.f171821b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            String str = this.f171822c;
            int i2 = 0;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            GalleryItem$MediaItem galleryItem$MediaItem = this.f171823d;
            if (galleryItem$MediaItem != null) {
                i2 = galleryItem$MediaItem.hashCode();
            }
            return ((((hashCode + i2) * 31) + this.f171824e) * 31) + this.f171825f;
        }

        public String toString() {
            return "AlbumItem(origId=" + this.f171820a + ", modifyDate=" + this.f171821b + ", thumbPath=" + this.f171822c + ", mediaItem=" + this.f171823d + ", width=" + this.f171824e + ", height=" + this.f171825f + ')';
        }
    }

    /* renamed from: ib2.a$b */
    public static final class C60267b {

        /* renamed from: a */
        public String f171826a;

        /* renamed from: b */
        public FinderObject f171827b;

        public C60267b() {
            this((String) null, (FinderObject) null, 3, (C8480h) null);
        }

        public C60267b(String str, FinderObject finderObject, int i, C8480h hVar) {
            str = (i & 1) != 0 ? null : str;
            finderObject = (i & 2) != 0 ? null : finderObject;
            this.f171826a = str;
            this.f171827b = finderObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C60267b)) {
                return false;
            }
            C60267b bVar = (C60267b) obj;
            return C87412m.m108589b(this.f171826a, bVar.f171826a) && C87412m.m108589b(this.f171827b, bVar.f171827b);
        }

        public int hashCode() {
            String str = this.f171826a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            FinderObject finderObject = this.f171827b;
            if (finderObject != null) {
                i = finderObject.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "FinderItem(thumbUrl=" + this.f171826a + ", finderObj=" + this.f171827b + ')';
        }
    }

    public C60265a(String str, int i, long j, int i2) {
        C87412m.m108594g(str, "id");
        this.f171812d = str;
        this.f171813e = i;
        this.f171814f = j;
        this.f171815g = i2;
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        return this.f171812d;
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f171813e;
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C60265a aVar = (C60265a) obj;
        C87412m.m108594g(aVar, "other");
        return C87412m.m108597j(this.f171814f, aVar.f171814f);
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C60265a aVar = (C60265a) obj;
        C87412m.m108594g(aVar, "other");
        return this.f171819n == aVar.f171819n && C87412m.m108589b(this.f171817i, aVar.f171817i) && C87412m.m108589b(this.f171816h, aVar.f171816h) && this.f171818j == aVar.f171818j;
    }
}
