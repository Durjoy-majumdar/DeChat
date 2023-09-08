package p166hy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import di3.C7335d;
import gy3.C8480h;
import gy3.C87412m;
import rx3.C13604l;

/* renamed from: hy.o0 */
public interface C98567o0 extends C7335d {

    /* renamed from: hy.o0$a */
    public static final class C76249a {

        /* renamed from: a */
        public boolean f223345a;

        /* renamed from: b */
        public boolean f223346b;

        /* renamed from: c */
        public boolean f223347c;

        /* renamed from: d */
        public boolean f223348d;

        /* renamed from: e */
        public int f223349e;

        /* renamed from: f */
        public String f223350f;

        /* renamed from: g */
        public boolean f223351g;

        /* renamed from: h */
        public boolean f223352h;

        public C76249a() {
            this(false, false, false, false, 0, (String) null, false, false, 255, (C8480h) null);
        }

        public C76249a(boolean z, boolean z2, boolean z3, boolean z4, int i, String str, boolean z5, boolean z6, int i2, C8480h hVar) {
            z = (i2 & 1) != 0 ? false : z;
            z2 = (i2 & 2) != 0 ? true : z2;
            z3 = (i2 & 4) != 0 ? false : z3;
            z4 = (i2 & 8) != 0 ? false : z4;
            i = (i2 & 16) != 0 ? 0 : i;
            str = (i2 & 32) != 0 ? null : str;
            z5 = (i2 & 64) != 0 ? true : z5;
            z6 = (i2 & 128) != 0 ? false : z6;
            this.f223345a = z;
            this.f223346b = z2;
            this.f223347c = z3;
            this.f223348d = z4;
            this.f223349e = i;
            this.f223350f = str;
            this.f223351g = z5;
            this.f223352h = z6;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C76249a)) {
                return false;
            }
            C76249a aVar = (C76249a) obj;
            return this.f223345a == aVar.f223345a && this.f223346b == aVar.f223346b && this.f223347c == aVar.f223347c && this.f223348d == aVar.f223348d && this.f223349e == aVar.f223349e && C87412m.m108589b(this.f223350f, aVar.f223350f) && this.f223351g == aVar.f223351g && this.f223352h == aVar.f223352h;
        }

        public int hashCode() {
            boolean z = this.f223345a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f223346b;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f223347c;
            if (z4) {
                z4 = true;
            }
            int i3 = (i2 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f223348d;
            if (z5) {
                z5 = true;
            }
            int i4 = (((i3 + (z5 ? 1 : 0)) * 31) + this.f223349e) * 31;
            String str = this.f223350f;
            int hashCode = (i4 + (str == null ? 0 : str.hashCode())) * 31;
            boolean z6 = this.f223351g;
            if (z6) {
                z6 = true;
            }
            int i5 = (hashCode + (z6 ? 1 : 0)) * 31;
            boolean z7 = this.f223352h;
            if (!z7) {
                z2 = z7;
            }
            return i5 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "SnsJumpData(clearTopActivity=" + this.f223345a + ", loadInit=" + this.f223346b + ", enterByRed=" + this.f223347c + ", notifyOpen=" + this.f223348d + ", unreadCount=" + this.f223349e + ", newFeedId=" + this.f223350f + ", isResume=" + this.f223351g + ", needResendAllFailSns=" + this.f223352h + ')';
        }
    }

    /* renamed from: DW */
    void mo137587DW(Activity activity);

    boolean Fi0();

    /* renamed from: Mr */
    boolean mo137589Mr();

    void Wk0(Activity activity, int i, byte[] bArr, int i2);

    /* renamed from: Z0 */
    C98564l0 mo137591Z0();

    /* renamed from: an */
    void mo137592an(String str, Bundle bundle, String str2);

    void fb0(MMActivity mMActivity, boolean z);

    boolean gj0();

    /* renamed from: om */
    void mo137595om(Intent intent);

    C13604l<String, String> qa0();

    /* renamed from: wZ */
    boolean mo137597wZ();

    void x50();

    boolean yb0(Context context, Intent intent, int i, C76249a aVar);
}
