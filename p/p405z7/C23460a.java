package p405z7;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;
import java.nio.charset.Charset;
import java.util.List;
import p333e8.C20541m;
import p333e8.C20551y;
import p383t7.C22439a;
import p383t7.C22440b;
import p383t7.C22442d;
import p383t7.C22444f;

/* renamed from: z7.a */
public final class C23460a extends C22440b {

    /* renamed from: t */
    public static final int f67277t = C20551y.m22316f("styl");

    /* renamed from: u */
    public static final int f67278u = C20551y.m22316f("tbox");

    /* renamed from: m */
    public final C20541m f67279m = new C20541m();

    /* renamed from: n */
    public boolean f67280n;

    /* renamed from: o */
    public int f67281o;

    /* renamed from: p */
    public int f67282p;

    /* renamed from: q */
    public String f67283q;

    /* renamed from: r */
    public float f67284r;

    /* renamed from: s */
    public int f67285s;

    public C23460a(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z = false;
        if (list != null && list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f67281o = bArr[24];
            this.f67282p = ((bArr[26] & ExifInterface.MARKER) << 24) | ((bArr[27] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[28] & ExifInterface.MARKER) << 8) | (bArr[29] & ExifInterface.MARKER);
            this.f67283q = "Serif".equals(new String(bArr, 43, bArr.length - 43)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.f67285s = i;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.f67280n = z;
            if (z) {
                float f = ((float) ((bArr[11] & ExifInterface.MARKER) | ((bArr[10] & ExifInterface.MARKER) << 8))) / ((float) i);
                this.f67284r = f;
                this.f67284r = Math.max(0.0f, Math.min(f, 0.95f));
                return;
            }
            this.f67284r = 0.85f;
            return;
        }
        this.f67281o = 0;
        this.f67282p = -1;
        this.f67283q = str;
        this.f67280n = false;
        this.f67284r = 0.85f;
    }

    /* renamed from: g */
    public static void m28015g(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = true;
            boolean z2 = (i & 1) != 0;
            boolean z3 = (i & 2) != 0;
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z = false;
            }
            if (z) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z && !z2 && !z3) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* renamed from: f */
    public C22442d mo14895f(byte[] bArr, int i, boolean z) {
        String str;
        String str2;
        this.f67279m.mo32111v(bArr, i);
        C20541m mVar = this.f67279m;
        int i2 = 1;
        if (mVar.f57811c - mVar.f57810b >= 2) {
            int s = mVar.mo32108s();
            if (s == 0) {
                str = "";
            } else {
                int i3 = mVar.f57811c;
                int i4 = mVar.f57810b;
                if (i3 - i4 >= 2) {
                    byte[] bArr2 = mVar.f57809a;
                    char c = (char) ((bArr2[i4 + 1] & ExifInterface.MARKER) | ((bArr2[i4] & ExifInterface.MARKER) << 8));
                    if (c == 65279 || c == 65534) {
                        str2 = new String(mVar.f57809a, mVar.f57810b, s, Charset.forName("UTF-16"));
                        mVar.f57810b += s;
                        str = str2;
                    }
                }
                str2 = new String(mVar.f57809a, mVar.f57810b, s, Charset.forName("UTF-8"));
                mVar.f57810b += s;
                str = str2;
            }
            if (str.isEmpty()) {
                return C23461b.f67286e;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            m28015g(spannableStringBuilder, this.f67281o, 0, 0, spannableStringBuilder.length(), 16711680);
            int i5 = this.f67282p;
            int length = spannableStringBuilder.length();
            if (i5 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan((i5 >>> 8) | ((i5 & 255) << 24)), 0, length, 16711713);
            }
            String str3 = this.f67283q;
            int length2 = spannableStringBuilder.length();
            if (str3 != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str3), 0, length2, 16711713);
            }
            float f = this.f67284r;
            while (true) {
                C20541m mVar2 = this.f67279m;
                int i6 = mVar2.f57811c;
                int i7 = mVar2.f57810b;
                if (i6 - i7 < 8) {
                    return new C23461b(new C22439a(spannableStringBuilder, (Layout.Alignment) null, f, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
                }
                int c2 = mVar2.mo32092c();
                int c3 = this.f67279m.mo32092c();
                if (c3 == f67277t) {
                    C20541m mVar3 = this.f67279m;
                    if (mVar3.f57811c - mVar3.f57810b >= 2) {
                        int s2 = mVar3.mo32108s();
                        int i8 = 0;
                        while (i8 < s2) {
                            C20541m mVar4 = this.f67279m;
                            if (mVar4.f57811c - mVar4.f57810b >= 12) {
                                int s3 = mVar4.mo32108s();
                                int s4 = mVar4.mo32108s();
                                mVar4.mo32114y(2);
                                int n = mVar4.mo32103n();
                                mVar4.mo32114y(i2);
                                int c4 = mVar4.mo32092c();
                                int i9 = s4;
                                int i15 = s3;
                                int i16 = i8;
                                int i17 = s2;
                                m28015g(spannableStringBuilder, n, this.f67281o, s3, i9, 0);
                                if (c4 != this.f67282p) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan((c4 >>> 8) | ((c4 & 255) << 24)), i15, i9, 33);
                                }
                                i8 = i16 + 1;
                                s2 = i17;
                                i2 = 1;
                            } else {
                                throw new C22444f("Unexpected subtitle format.");
                            }
                        }
                        continue;
                    } else {
                        throw new C22444f("Unexpected subtitle format.");
                    }
                } else if (c3 == f67278u && this.f67280n) {
                    C20541m mVar5 = this.f67279m;
                    if (mVar5.f57811c - mVar5.f57810b >= 2) {
                        f = Math.max(0.0f, Math.min(((float) mVar5.mo32108s()) / ((float) this.f67285s), 0.95f));
                    } else {
                        throw new C22444f("Unexpected subtitle format.");
                    }
                }
                this.f67279m.mo32113x(i7 + c2);
                i2 = 1;
            }
        } else {
            throw new C22444f("Unexpected subtitle format.");
        }
    }
}
