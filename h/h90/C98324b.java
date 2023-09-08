package h90;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import sx3.C110818d0;

/* renamed from: h90.b */
public final class C98324b {

    /* renamed from: a */
    public String f288180a;

    /* renamed from: b */
    public String f288181b;

    /* renamed from: c */
    public boolean f288182c;

    /* renamed from: d */
    public int f288183d;

    /* renamed from: e */
    public int f288184e;

    /* renamed from: f */
    public String f288185f;

    /* renamed from: g */
    public String f288186g;

    /* renamed from: h */
    public int f288187h;

    /* renamed from: i */
    public int f288188i;

    /* renamed from: j */
    public String f288189j;

    /* renamed from: k */
    public ArrayList<String> f288190k;

    /* renamed from: l */
    public ArrayList<String> f288191l;

    /* renamed from: m */
    public boolean f288192m;

    /* renamed from: n */
    public Bundle f288193n;

    /* renamed from: o */
    public Rect f288194o;

    /* renamed from: p */
    public int f288195p;

    public C98324b() {
        this((String) null, (String) null, false, 0, 0, (String) null, (String) null, 0, 0, (String) null, (ArrayList) null, (ArrayList) null, false, (Bundle) null, (Rect) null, 0, 65535, (C8480h) null);
    }

    public C98324b(String str, String str2, boolean z, int i, int i2, String str3, String str4, int i3, int i4, String str5, ArrayList arrayList, ArrayList arrayList2, boolean z2, Bundle bundle, Rect rect, int i5, int i6, C8480h hVar) {
        int i7 = i6;
        String str6 = "";
        String str7 = (i7 & 1) != 0 ? str6 : str;
        String str8 = (i7 & 2) != 0 ? str6 : str2;
        boolean z3 = (i7 & 4) != 0 ? false : z;
        int i8 = (i7 & 8) != 0 ? 0 : i;
        int i9 = (i7 & 16) != 0 ? 0 : i2;
        String str9 = (i7 & 32) != 0 ? str6 : str3;
        String str10 = (i7 & 64) != 0 ? str6 : str4;
        int i15 = (i7 & 128) != 0 ? 0 : i3;
        int i16 = (i7 & 256) != 0 ? 0 : i4;
        str6 = (i7 & 512) == 0 ? str5 : str6;
        ArrayList arrayList3 = (i7 & 1024) != 0 ? new ArrayList() : arrayList;
        ArrayList arrayList4 = (i7 & 2048) != 0 ? new ArrayList() : arrayList2;
        boolean z4 = (i7 & 4096) != 0 ? false : z2;
        Bundle bundle2 = (i7 & 8192) != 0 ? null : bundle;
        Rect rect2 = (i7 & 16384) != 0 ? new Rect() : rect;
        int i17 = (i7 & 32768) != 0 ? 0 : i5;
        C87412m.m108594g(str7, "sourceVideoPath");
        C87412m.m108594g(str8, "sourceThumb");
        C87412m.m108594g(str9, "daemonVideoPath");
        C87412m.m108594g(str10, "daemonSourceThumb");
        C87412m.m108594g(str6, "photoPath");
        C87412m.m108594g(arrayList3, "photoList");
        C87412m.m108594g(arrayList4, "videoList");
        C87412m.m108594g(rect2, "rect");
        this.f288180a = str7;
        this.f288181b = str8;
        this.f288182c = z3;
        this.f288183d = i8;
        this.f288184e = i9;
        this.f288185f = str9;
        this.f288186g = str10;
        this.f288187h = i15;
        this.f288188i = i16;
        this.f288189j = str6;
        this.f288190k = arrayList3;
        this.f288191l = arrayList4;
        this.f288192m = z4;
        this.f288193n = bundle2;
        this.f288194o = rect2;
        this.f288195p = i17;
    }

    /* renamed from: a */
    public final boolean mo137611a() {
        return !TextUtils.isEmpty(this.f288180a) && C86013q1.m106450k(this.f288180a);
    }

    /* renamed from: b */
    public final boolean mo137612b() {
        return !TextUtils.isEmpty(this.f288185f) && C86013q1.m106450k(this.f288185f);
    }

    /* renamed from: c */
    public final int mo137613c() {
        return this.f288184e;
    }

    /* renamed from: d */
    public final ArrayList<String> mo137614d() {
        return this.f288190k;
    }

    /* renamed from: e */
    public final String mo137615e() {
        return mo137611a() ? this.f288180a : this.f288185f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C98324b)) {
            return false;
        }
        C98324b bVar = (C98324b) obj;
        return C87412m.m108589b(this.f288180a, bVar.f288180a) && C87412m.m108589b(this.f288181b, bVar.f288181b) && this.f288182c == bVar.f288182c && this.f288183d == bVar.f288183d && this.f288184e == bVar.f288184e && C87412m.m108589b(this.f288185f, bVar.f288185f) && C87412m.m108589b(this.f288186g, bVar.f288186g) && this.f288187h == bVar.f288187h && this.f288188i == bVar.f288188i && C87412m.m108589b(this.f288189j, bVar.f288189j) && C87412m.m108589b(this.f288190k, bVar.f288190k) && C87412m.m108589b(this.f288191l, bVar.f288191l) && this.f288192m == bVar.f288192m && C87412m.m108589b(this.f288193n, bVar.f288193n) && C87412m.m108589b(this.f288194o, bVar.f288194o) && this.f288195p == bVar.f288195p;
    }

    /* renamed from: f */
    public final String mo137617f() {
        return this.f288180a;
    }

    /* renamed from: g */
    public final int mo137618g() {
        return this.f288183d;
    }

    /* renamed from: h */
    public final void mo137619h() {
        if (this.f288190k.size() == 0 && this.f288191l.size() == 1) {
            String str = (String) C110818d0.m150914L(this.f288191l);
            this.f288180a = str;
            C94554a c = C94555d.m119567c(str, true);
            if (c != null) {
                this.f288184e = c.f273443a;
            }
        }
    }

    public int hashCode() {
        int hashCode = ((this.f288180a.hashCode() * 31) + this.f288181b.hashCode()) * 31;
        boolean z = this.f288182c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode2 = (((((((((((((((((((hashCode + (z ? 1 : 0)) * 31) + this.f288183d) * 31) + this.f288184e) * 31) + this.f288185f.hashCode()) * 31) + this.f288186g.hashCode()) * 31) + this.f288187h) * 31) + this.f288188i) * 31) + this.f288189j.hashCode()) * 31) + this.f288190k.hashCode()) * 31) + this.f288191l.hashCode()) * 31;
        boolean z3 = this.f288192m;
        if (!z3) {
            z2 = z3;
        }
        int i = (hashCode2 + (z2 ? 1 : 0)) * 31;
        Bundle bundle = this.f288193n;
        return ((((i + (bundle == null ? 0 : bundle.hashCode())) * 31) + this.f288194o.hashCode()) * 31) + this.f288195p;
    }

    public String toString() {
        return "MediaCaptureInfo(sourceVideoPath=" + this.f288180a + ", sourceThumb=" + this.f288181b + ", isCaptureVideo=" + this.f288182c + ", startTime=" + this.f288183d + ", endTime=" + this.f288184e + ", daemonVideoPath=" + this.f288185f + ", daemonSourceThumb=" + this.f288186g + ", daemonStartTime=" + this.f288187h + ", daemonEndTime=" + this.f288188i + ", photoPath=" + this.f288189j + ", photoList=" + this.f288190k + ", videoList=" + this.f288191l + ", isLandscape=" + this.f288192m + ", extInfo=" + this.f288193n + ", rect=" + this.f288194o + ", backgroundColor=" + this.f288195p + ')';
    }
}
