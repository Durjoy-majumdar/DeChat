package u21;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ParagraphStyle;
import java.lang.reflect.Array;

/* renamed from: u21.a */
public class C101939a extends SpannableString {

    /* renamed from: d */
    public Object[] f300111d = new Object[20];

    /* renamed from: e */
    public int[] f300112e = new int[60];

    /* renamed from: f */
    public int f300113f;

    public C101939a(CharSequence charSequence) {
        super(charSequence.toString());
        int length = charSequence.length();
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            for (Object obj : spanned.getSpans(0, length, Object.class)) {
                if ((obj instanceof CharacterStyle) || (obj instanceof ParagraphStyle)) {
                    int spanStart = spanned.getSpanStart(obj);
                    int spanEnd = spanned.getSpanEnd(obj);
                    setSpan(obj, (spanStart < 0 ? 0 : spanStart) - 0, (spanEnd > length ? length : spanEnd) - 0, spanned.getSpanFlags(obj));
                }
            }
        }
    }

    public int getSpanEnd(Object obj) {
        int i = this.f300113f;
        Object[] objArr = this.f300111d;
        int[] iArr = this.f300112e;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (objArr[i2] == obj) {
                return iArr[(i2 * 3) + 1];
            }
        }
        return -1;
    }

    public int getSpanFlags(Object obj) {
        int i = this.f300113f;
        Object[] objArr = this.f300111d;
        int[] iArr = this.f300112e;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (objArr[i2] == obj) {
                return iArr[(i2 * 3) + 2];
            }
        }
        return 0;
    }

    public int getSpanStart(Object obj) {
        int i = this.f300113f;
        Object[] objArr = this.f300111d;
        int[] iArr = this.f300112e;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (objArr[i2] == obj) {
                return iArr[(i2 * 3) + 0];
            }
        }
        return -1;
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        int i3 = this.f300113f;
        T[] tArr = this.f300111d;
        int[] iArr = this.f300112e;
        T[] tArr2 = null;
        T t = null;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            if (cls == null || cls.isInstance(tArr[i5])) {
                int i6 = i5 * 3;
                int i7 = iArr[i6 + 0];
                int i8 = iArr[i6 + 1];
                if (i7 <= i2 && i8 >= i && (i7 == i8 || i == i2 || !(i7 == i2 || i8 == i))) {
                    if (i4 == 0) {
                        t = tArr[i5];
                    } else {
                        if (i4 == 1) {
                            tArr2 = (Object[]) Array.newInstance(cls, (i3 - i5) + 1);
                            tArr2[0] = t;
                        }
                        int i9 = iArr[i6 + 2] & 16711680;
                        if (i9 != 0) {
                            int i15 = 0;
                            while (i15 < i4 && i9 <= (getSpanFlags(tArr2[i15]) & 16711680)) {
                                i15++;
                            }
                            System.arraycopy(tArr2, i15, tArr2, i15 + 1, i4 - i15);
                            tArr2[i15] = tArr[i5];
                        } else {
                            tArr2[i4] = tArr[i5];
                            i4++;
                        }
                    }
                    i4++;
                }
            }
        }
        if (i4 == 0) {
            return (Object[]) Array.newInstance(cls, 0);
        }
        if (i4 == 1) {
            T[] tArr3 = (Object[]) Array.newInstance(cls, 1);
            tArr3[0] = t;
            return tArr3;
        } else if (i4 == tArr2.length) {
            return tArr2;
        } else {
            T[] tArr4 = (Object[]) Array.newInstance(cls, i4);
            System.arraycopy(tArr2, 0, tArr4, 0, i4);
            return tArr4;
        }
    }

    public int nextSpanTransition(int i, int i2, Class<Object> cls) {
        int i3 = this.f300113f;
        Object[] objArr = this.f300111d;
        int[] iArr = this.f300112e;
        if (cls == null) {
            cls = Object.class;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i4 * 3;
            int i6 = iArr[i5 + 0];
            int i7 = iArr[i5 + 1];
            if (i6 > i && i6 < i2 && cls.isInstance(objArr[i4])) {
                i2 = i6;
            }
            if (i7 > i && i7 < i2 && cls.isInstance(objArr[i4])) {
                i2 = i7;
            }
        }
        return i2;
    }

    public void removeSpan(Object obj) {
        int i = this.f300113f;
        Object[] objArr = this.f300111d;
        int[] iArr = this.f300112e;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (objArr[i2] == obj) {
                int i3 = i2 + 1;
                int i4 = i - i3;
                System.arraycopy(objArr, i3, objArr, i2, i4);
                System.arraycopy(iArr, i3 * 3, iArr, i2 * 3, i4 * 3);
                this.f300113f--;
                return;
            }
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        int i4 = this.f300113f;
        int i5 = i4 + 1;
        Object[] objArr = this.f300111d;
        if (i5 >= objArr.length) {
            int i6 = i4 + 10;
            Object[] objArr2 = new Object[i6];
            int[] iArr = new int[(i6 * 3)];
            System.arraycopy(objArr, 0, objArr2, 0, i4);
            System.arraycopy(this.f300112e, 0, iArr, 0, this.f300113f * 3);
            this.f300111d = objArr2;
            this.f300112e = iArr;
        }
        Object[] objArr3 = this.f300111d;
        int i7 = this.f300113f;
        objArr3[i7] = obj;
        int[] iArr2 = this.f300112e;
        iArr2[(i7 * 3) + 0] = i;
        iArr2[(i7 * 3) + 1] = i2;
        iArr2[(i7 * 3) + 2] = i3;
        this.f300113f = i7 + 1;
    }
}
