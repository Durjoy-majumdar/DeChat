package p009c2;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import sx3.C110821n;

/* renamed from: c2.t */
public final class C104272t {

    /* renamed from: a */
    public String f308603a;

    /* renamed from: b */
    public C104255i f308604b;

    /* renamed from: c */
    public int f308605c = -1;

    /* renamed from: d */
    public int f308606d = -1;

    public C104272t(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        this.f308603a = str;
    }

    /* renamed from: a */
    public final int mo145898a() {
        C104255i iVar = this.f308604b;
        return iVar == null ? this.f308603a.length() : (this.f308603a.length() - (this.f308606d - this.f308605c)) + (iVar.f308584a - (iVar.f308587d - iVar.f308586c));
    }

    /* renamed from: b */
    public final void mo145899b(int i, int i2, String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        C104255i iVar = this.f308604b;
        if (iVar == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(this.f308603a.length() - i2, 64);
            int i3 = i - min;
            C104257j.m139148a(this.f308603a, cArr, 0, i3, i);
            int i4 = max - min2;
            int i5 = min2 + i2;
            C104257j.m139148a(this.f308603a, cArr, i4, i2, i5);
            C104257j.m139148a(str, cArr, min, 0, str.length());
            this.f308604b = new C104255i(cArr, min + str.length(), i4);
            this.f308605c = i3;
            this.f308606d = i5;
            return;
        }
        int i6 = this.f308605c;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > iVar.f308584a - (iVar.f308587d - iVar.f308586c)) {
            this.f308603a = toString();
            this.f308604b = null;
            this.f308605c = -1;
            this.f308606d = -1;
            mo145899b(i, i2, str);
            return;
        }
        int length = str.length() - (i8 - i7);
        int i9 = iVar.f308587d - iVar.f308586c;
        if (length > i9) {
            int i15 = length - i9;
            int i16 = iVar.f308584a;
            do {
                i16 *= 2;
            } while (i16 - iVar.f308584a < i15);
            char[] cArr2 = new char[i16];
            C110821n.m150961h(iVar.f308585b, cArr2, 0, 0, iVar.f308586c);
            int i17 = iVar.f308584a;
            int i18 = iVar.f308587d;
            int i19 = i17 - i18;
            int i25 = i16 - i19;
            C110821n.m150961h(iVar.f308585b, cArr2, i25, i18, i19 + i18);
            iVar.f308585b = cArr2;
            iVar.f308584a = i16;
            iVar.f308587d = i25;
        }
        int i26 = iVar.f308586c;
        if (i7 < i26 && i8 <= i26) {
            int i27 = i26 - i8;
            char[] cArr3 = iVar.f308585b;
            C110821n.m150961h(cArr3, cArr3, iVar.f308587d - i27, i8, i26);
            iVar.f308586c = i7;
            iVar.f308587d -= i27;
        } else if (i7 >= i26 || i8 < i26) {
            int i28 = iVar.f308587d;
            int i29 = i28 - i26;
            int i35 = i7 + i29;
            char[] cArr4 = iVar.f308585b;
            C110821n.m150961h(cArr4, cArr4, i26, i28, i35);
            iVar.f308586c += i35 - i28;
            iVar.f308587d = i8 + i29;
        } else {
            iVar.f308587d = i8 + (iVar.f308587d - i26);
            iVar.f308586c = i7;
        }
        C104257j.m139148a(str, iVar.f308585b, iVar.f308586c, 0, str.length());
        iVar.f308586c += str.length();
    }

    public String toString() {
        C104255i iVar = this.f308604b;
        if (iVar == null) {
            return this.f308603a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f308603a, 0, this.f308605c);
        sb.append(iVar.f308585b, 0, iVar.f308586c);
        char[] cArr = iVar.f308585b;
        int i = iVar.f308587d;
        sb.append(cArr, i, iVar.f308584a - i);
        String str = this.f308603a;
        sb.append(str, this.f308606d, str.length());
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }
}
