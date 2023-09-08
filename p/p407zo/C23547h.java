package p407zo;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: zo.h */
public interface C23547h extends C7335d {
    /* renamed from: Mf */
    void mo36794Mf(int i, int i2, String str, String str2);

    /* renamed from: xH */
    void mo36799xH(String str, String str2, String str3, long j, String str4, C23548a aVar);

    /* renamed from: zo.h$a */
    public static final class C23548a {

        /* renamed from: a */
        public final boolean f67521a;

        /* renamed from: b */
        public final String f67522b;

        /* renamed from: c */
        public final String f67523c;

        /* renamed from: d */
        public final String f67524d;

        /* renamed from: e */
        public final boolean f67525e;

        /* renamed from: f */
        public final boolean f67526f;

        public C23548a() {
            this(false, (String) null, (String) null, (String) null, false, false, 63, (C8480h) null);
        }

        public C23548a(boolean z, String str, String str2, String str3, boolean z2, boolean z3) {
            C87412m.m108594g(str, "upBtnText");
            C87412m.m108594g(str2, "downBtnText");
            C87412m.m108594g(str3, "defaultAppName");
            this.f67521a = z;
            this.f67522b = str;
            this.f67523c = str2;
            this.f67524d = str3;
            this.f67525e = z2;
            this.f67526f = z3;
        }

        /* renamed from: a */
        public final int mo37002a() {
            Context context = MMApplicationContext.getContext();
            String string = context.getString(C0966R.string.mqe);
            C87412m.m108593f(string, "context.getString(com.te…download_open_by_default)");
            boolean z = true;
            Object[] objArr = new Object[1];
            objArr[0] = this.f67524d.length() == 0 ? context.getString(C0966R.string.fnk) : this.f67524d;
            String format = String.format(string, Arrays.copyOf(objArr, 1));
            C87412m.m108593f(format, "format(format, *args)");
            String string2 = context.getString(C0966R.string.fnk);
            C87412m.m108593f(string2, "context.getString(com.te…le_reader_menu_qqbrowser)");
            String string3 = context.getString(C0966R.string.n46);
            C87412m.m108593f(string3, "context.getString(com.te….string.qb_download_open)");
            String string4 = context.getString(C0966R.string.n47);
            C87412m.m108593f(string4, "context.getString(com.te…ng.qb_download_open_file)");
            boolean z2 = this.f67521a;
            if (z2 || z2) {
                return 1;
            }
            if (this.f67525e && this.f67526f && C87412m.m108589b(this.f67522b, format)) {
                if (this.f67524d.length() != 0) {
                    z = false;
                }
                if (z) {
                    return 2;
                }
            }
            if (!this.f67525e && this.f67526f && C87412m.m108589b(this.f67523c, string3)) {
                return 3;
            }
            if (this.f67525e && this.f67526f && C87412m.m108589b(this.f67522b, format) && !C87412m.m108589b(this.f67524d, string2)) {
                return 4;
            }
            if (!this.f67525e || !this.f67526f || !C87412m.m108589b(this.f67522b, format) || !C87412m.m108589b(this.f67524d, string2)) {
                return (this.f67525e || !this.f67526f || !C87412m.m108589b(this.f67523c, string4)) ? 0 : 6;
            }
            return 5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23548a)) {
                return false;
            }
            C23548a aVar = (C23548a) obj;
            return this.f67521a == aVar.f67521a && C87412m.m108589b(this.f67522b, aVar.f67522b) && C87412m.m108589b(this.f67523c, aVar.f67523c) && C87412m.m108589b(this.f67524d, aVar.f67524d) && this.f67525e == aVar.f67525e && this.f67526f == aVar.f67526f;
        }

        public int hashCode() {
            boolean z = this.f67521a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode = (((((((z ? 1 : 0) * true) + this.f67522b.hashCode()) * 31) + this.f67523c.hashCode()) * 31) + this.f67524d.hashCode()) * 31;
            boolean z3 = this.f67525e;
            if (z3) {
                z3 = true;
            }
            int i = (hashCode + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f67526f;
            if (!z4) {
                z2 = z4;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            return "PageType(isMiniQbPage=" + this.f67521a + ", upBtnText=" + this.f67522b + ", downBtnText=" + this.f67523c + ", defaultAppName=" + this.f67524d + ", upBtnVisitable=" + this.f67525e + ", downBtnVisitable=" + this.f67526f + ')';
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C23548a(boolean r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10, boolean r11, int r12, gy3.C8480h r13) {
            /*
                r5 = this;
                r13 = r12 & 1
                r0 = 0
                if (r13 == 0) goto L_0x0007
                r13 = 0
                goto L_0x0008
            L_0x0007:
                r13 = r6
            L_0x0008:
                r6 = r12 & 2
                java.lang.String r1 = ""
                if (r6 == 0) goto L_0x0010
                r2 = r1
                goto L_0x0011
            L_0x0010:
                r2 = r7
            L_0x0011:
                r6 = r12 & 4
                if (r6 == 0) goto L_0x0017
                r3 = r1
                goto L_0x0018
            L_0x0017:
                r3 = r8
            L_0x0018:
                r6 = r12 & 8
                if (r6 == 0) goto L_0x001d
                goto L_0x001e
            L_0x001d:
                r1 = r9
            L_0x001e:
                r6 = r12 & 16
                if (r6 == 0) goto L_0x0024
                r4 = 0
                goto L_0x0025
            L_0x0024:
                r4 = r10
            L_0x0025:
                r6 = r12 & 32
                if (r6 == 0) goto L_0x002b
                r12 = 0
                goto L_0x002c
            L_0x002b:
                r12 = r11
            L_0x002c:
                r6 = r5
                r7 = r13
                r8 = r2
                r9 = r3
                r10 = r1
                r11 = r4
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p407zo.C23547h.C23548a.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, gy3.h):void");
        }
    }
}
