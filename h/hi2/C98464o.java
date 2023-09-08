package hi2;

import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;

/* renamed from: hi2.o */
public final class C98464o {

    /* renamed from: a */
    public static final C98464o f288797a = new C98464o();

    /* renamed from: hi2.o$a */
    public static final class C98465a {

        /* renamed from: a */
        public final int f288798a;

        /* renamed from: b */
        public final int f288799b;

        /* renamed from: c */
        public final int f288800c;

        /* renamed from: d */
        public final int f288801d;

        /* renamed from: e */
        public final int f288802e;

        /* renamed from: f */
        public final int f288803f;

        /* renamed from: g */
        public final boolean f288804g;

        /* renamed from: h */
        public final int f288805h;

        /* renamed from: i */
        public int f288806i;

        /* renamed from: j */
        public final int f288807j;

        public C98465a(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, int i8, int i9) {
            this.f288798a = i;
            this.f288799b = i2;
            this.f288800c = i3;
            this.f288801d = i4;
            this.f288802e = i5;
            this.f288803f = i6;
            this.f288804g = z;
            this.f288805h = i7;
            this.f288806i = i8;
            this.f288807j = i9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C98465a)) {
                return false;
            }
            C98465a aVar = (C98465a) obj;
            return this.f288798a == aVar.f288798a && this.f288799b == aVar.f288799b && this.f288800c == aVar.f288800c && this.f288801d == aVar.f288801d && this.f288802e == aVar.f288802e && this.f288803f == aVar.f288803f && this.f288804g == aVar.f288804g && this.f288805h == aVar.f288805h && this.f288806i == aVar.f288806i && this.f288807j == aVar.f288807j;
        }

        public int hashCode() {
            int i = ((((((((((this.f288798a * 31) + this.f288799b) * 31) + this.f288800c) * 31) + this.f288801d) * 31) + this.f288802e) * 31) + this.f288803f) * 31;
            boolean z = this.f288804g;
            if (z) {
                z = true;
            }
            return ((((((i + (z ? 1 : 0)) * 31) + this.f288805h) * 31) + this.f288806i) * 31) + this.f288807j;
        }

        public String toString() {
            return "VideoInfo(width=" + this.f288798a + ", height=" + this.f288799b + ", duration=" + this.f288800c + ", rotate=" + this.f288801d + ", videoBitrate=" + this.f288802e + ", fps=" + this.f288803f + ", matchScreenRatio=" + this.f288804g + ", useABA=" + this.f288805h + ", bitrateAdaptiveUp=" + this.f288806i + ", useMinMaxQP=" + this.f288807j + ')';
        }
    }

    /* renamed from: a */
    public final C98465a mo137832a(String str) {
        String str2 = str;
        C87412m.m108594g(str2, "path");
        C94554a c = C94555d.m119567c(str2, true);
        if (c == null) {
            return null;
        }
        if (c.f273446d <= 0 || c.f273445c <= 0) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str2);
                c.f273445c = Util.getInt(mediaMetadataRetriever.extractMetadata(18), 0);
                c.f273446d = Util.getInt(mediaMetadataRetriever.extractMetadata(19), 0);
                c.f273444b = Util.getInt(mediaMetadataRetriever.extractMetadata(20), 0);
                mediaMetadataRetriever.release();
            } catch (Exception unused) {
            }
        }
        int mp4RotateVFS = SightVideoJNI.getMp4RotateVFS(str);
        Point h = C85875k4.m106184h(MMApplicationContext.getContext());
        boolean z = mp4RotateVFS == 270 || mp4RotateVFS == 90;
        return new C98465a(c.f273445c, c.f273446d, c.f273443a, mp4RotateVFS, c.f273444b, c.f273447e, ((double) Math.abs((((float) (z ? c.f273446d : c.f273445c)) / ((float) (z ? c.f273445c : c.f273446d))) - (((float) h.x) / ((float) h.y)))) <= 0.01d, c.f273451i, c.f273453k, c.f273452j);
    }
}
