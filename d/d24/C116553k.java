package d24;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import com.tencent.xweb.util.WXWebReporter;
import e24.C20509c;
import h24.C117063d;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: d24.k */
public final class C116553k {

    /* renamed from: j */
    public static final Pattern f349554j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f349555k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f349556l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f349557m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f349558a;

    /* renamed from: b */
    public final String f349559b;

    /* renamed from: c */
    public final long f349560c;

    /* renamed from: d */
    public final String f349561d;

    /* renamed from: e */
    public final String f349562e;

    /* renamed from: f */
    public final boolean f349563f;

    /* renamed from: g */
    public final boolean f349564g;

    /* renamed from: h */
    public final boolean f349565h;

    /* renamed from: i */
    public final boolean f349566i;

    public C116553k(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f349558a = str;
        this.f349559b = str2;
        this.f349560c = j;
        this.f349561d = str3;
        this.f349562e = str4;
        this.f349563f = z;
        this.f349564g = z2;
        this.f349566i = z3;
        this.f349565h = z4;
    }

    /* renamed from: a */
    public static int m164393a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    public static long m164394b(String str, int i, int i2) {
        int a = m164393a(str, i, i2, false);
        Matcher matcher = f349557m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a < i2) {
            int a2 = m164393a(str, a + 1, i2, true);
            matcher.region(a, a2);
            if (i4 == -1 && matcher.usePattern(f349557m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 != -1 || !matcher.usePattern(f349556l).matches()) {
                if (i6 == -1) {
                    Pattern pattern = f349555k;
                    if (matcher.usePattern(pattern).matches()) {
                        i6 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(f349554j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i5 = Integer.parseInt(matcher.group(1));
            }
            a = m164393a(str, a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        } else if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C20509c.f57733e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C116553k)) {
            return false;
        }
        C116553k kVar = (C116553k) obj;
        return kVar.f349558a.equals(this.f349558a) && kVar.f349559b.equals(this.f349559b) && kVar.f349561d.equals(this.f349561d) && kVar.f349562e.equals(this.f349562e) && kVar.f349560c == this.f349560c && kVar.f349563f == this.f349563f && kVar.f349564g == this.f349564g && kVar.f349565h == this.f349565h && kVar.f349566i == this.f349566i;
    }

    public int hashCode() {
        long j = this.f349560c;
        return ((((((((((((((((C1883v2.CTRL_INDEX + this.f349558a.hashCode()) * 31) + this.f349559b.hashCode()) * 31) + this.f349561d.hashCode()) * 31) + this.f349562e.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.f349563f ^ true ? 1 : 0)) * 31) + (this.f349564g ^ true ? 1 : 0)) * 31) + (this.f349565h ^ true ? 1 : 0)) * 31) + (this.f349566i ^ true ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f349558a);
        sb.append('=');
        sb.append(this.f349559b);
        if (this.f349565h) {
            if (this.f349560c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C117063d.f350745a.get().format(new Date(this.f349560c)));
            }
        }
        if (!this.f349566i) {
            sb.append("; domain=");
            sb.append(this.f349561d);
        }
        sb.append("; path=");
        sb.append(this.f349562e);
        if (this.f349563f) {
            sb.append("; secure");
        }
        if (this.f349564g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
