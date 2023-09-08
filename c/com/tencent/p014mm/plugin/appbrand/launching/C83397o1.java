package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import rx3.C13598b0;
import te3.C90415hz1;
import te3.C90422jy;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.o1 */
public interface C83397o1 {

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.o1$a */
    public static final class C83398a implements Comparable<C83398a> {

        /* renamed from: d */
        public String f243666d = "";

        /* renamed from: e */
        public String f243667e;

        /* renamed from: f */
        public int f243668f;

        /* renamed from: g */
        public int f243669g;

        /* renamed from: h */
        public int f243670h;

        /* renamed from: i */
        public String f243671i;

        /* renamed from: j */
        public int f243672j;

        /* renamed from: n */
        public int f243673n;

        /* renamed from: o */
        public boolean f243674o;

        /* renamed from: p */
        public String f243675p;

        public int compareTo(Object obj) {
            int i;
            C83398a aVar = (C83398a) obj;
            C87412m.m108594g(aVar, "other");
            if (!C87412m.m108589b(this.f243666d, aVar.f243666d)) {
                i = this.f243666d.compareTo(aVar.f243666d);
            } else if (!C87412m.m108589b(Util.nullAsNil(this.f243667e), Util.nullAsNil(aVar.f243667e))) {
                String nullAsNil = Util.nullAsNil(this.f243667e);
                String nullAsNil2 = Util.nullAsNil(aVar.f243667e);
                C87412m.m108593f(nullAsNil2, "nullAsNil(other.moduleName)");
                i = nullAsNil.compareTo(nullAsNil2);
            } else {
                int i2 = this.f243668f;
                int i3 = aVar.f243668f;
                if (i2 != i3) {
                    i = C87412m.m108596i(i2, i3);
                } else {
                    int i4 = this.f243669g;
                    int i5 = aVar.f243669g;
                    if (i4 != i5) {
                        i = C87412m.m108596i(i4, i5);
                    } else {
                        boolean z = this.f243674o;
                        boolean z2 = aVar.f243674o;
                        if (z != z2) {
                            i = C87412m.m108596i(z ? 1 : 0, z2 ? 1 : 0);
                        } else {
                            int i6 = this.f243670h;
                            int i7 = aVar.f243670h;
                            if (i6 != i7) {
                                i = C87412m.m108596i(i6, i7);
                            } else {
                                int i8 = this.f243672j;
                                int i9 = aVar.f243672j;
                                if (i8 != i9) {
                                    i = C87412m.m108596i(i8, i9);
                                } else {
                                    int i15 = this.f243673n;
                                    int i16 = aVar.f243673n;
                                    if (i15 != i16) {
                                        i = C87412m.m108596i(i15, i16);
                                    } else {
                                        String str = this.f243671i;
                                        String str2 = "";
                                        if (str == null) {
                                            str = str2;
                                        }
                                        String str3 = aVar.f243671i;
                                        if (str3 == null) {
                                            str3 = str2;
                                        }
                                        if (!C87412m.m108589b(str, str3)) {
                                            String str4 = this.f243671i;
                                            if (str4 == null) {
                                                str4 = str2;
                                            }
                                            String str5 = aVar.f243671i;
                                            if (str5 != null) {
                                                str2 = str5;
                                            }
                                            i = str4.compareTo(str2);
                                        } else {
                                            String str6 = this.f243675p;
                                            if (str6 == null) {
                                                str6 = str2;
                                            }
                                            String str7 = aVar.f243675p;
                                            if (str7 == null) {
                                                str7 = str2;
                                            }
                                            if (!C87412m.m108589b(str6, str7)) {
                                                String str8 = this.f243675p;
                                                if (str8 == null) {
                                                    str8 = str2;
                                                }
                                                String str9 = aVar.f243675p;
                                                if (str9 != null) {
                                                    str2 = str9;
                                                }
                                                i = str8.compareTo(str2);
                                            } else {
                                                i = 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Log.m105924i("IGetDownloadUrlCgiExecutor.LocalUnifiedGetDownloadUrlRequest", "request.compareTo=" + i + ", this=" + this + ", other=" + aVar);
            return i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C83398a)) {
                return false;
            }
            return this == obj || hashCode() == ((C83398a) obj).hashCode();
        }

        public int hashCode() {
            return toString().hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LocalUnifiedGetDownloadUrlRequest(appId='");
            sb.append(this.f243666d);
            sb.append("', moduleName=");
            String str = this.f243667e;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            sb.append(str);
            sb.append(", packageType=");
            sb.append(this.f243668f);
            sb.append(", versionType=");
            sb.append(this.f243669g);
            sb.append(", appVersion=");
            sb.append(this.f243670h);
            sb.append(", versionDesc='");
            String str3 = this.f243671i;
            if (str3 == null) {
                str3 = str2;
            }
            sb.append(str3);
            sb.append("' supportEncryptVersion=");
            sb.append(this.f243672j);
            sb.append(", localPkgVersion=");
            sb.append(this.f243673n);
            sb.append(", localPkgEncryptVersion=");
            sb.append(0);
            sb.append(", needLatestVersion=");
            sb.append(this.f243674o);
            sb.append(", semver=");
            String str4 = this.f243675p;
            if (str4 != null) {
                str2 = str4;
            }
            sb.append(str2);
            sb.append(')');
            return sb.toString();
        }
    }

    /* renamed from: a */
    void mo115538a(C83398a aVar, C32226l<? super C90415hz1[], C13598b0> lVar, C32228q<? super Integer, ? super Integer, ? super String, C13598b0> qVar, int i, C90422jy jyVar);
}
