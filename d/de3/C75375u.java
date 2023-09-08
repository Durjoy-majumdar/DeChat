package de3;

import android.text.GetChars;
import android.text.Spannable;
import android.text.SpannableString;

/* renamed from: de3.u */
public class C75375u implements Spannable, CharSequence, GetChars {

    /* renamed from: d */
    public SpannableString f221617d;

    public C75375u() {
        this.f221617d = null;
        this.f221617d = new SpannableString("");
    }

    /* renamed from: a */
    public void mo105704a(Object obj, CharSequence charSequence, int i) {
        mo105705b(obj, 0, charSequence.length() + 0, i);
    }

    /* renamed from: b */
    public final void mo105705b(Object obj, int i, int i2, int i3) {
        if (i >= 0 && i2 <= this.f221617d.length()) {
            this.f221617d.setSpan(obj, i, i2, i3);
        }
    }

    public char charAt(int i) {
        return this.f221617d.charAt(i);
    }

    public void getChars(int i, int i2, char[] cArr, int i3) {
        this.f221617d.getChars(i, i2, cArr, i3);
    }

    public int getSpanEnd(Object obj) {
        return this.f221617d.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f221617d.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f221617d.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.f221617d.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f221617d.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f221617d.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        this.f221617d.removeSpan(obj);
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        mo105705b(obj, i, i2, i3);
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f221617d.subSequence(i, i2);
    }

    public String toString() {
        return this.f221617d.toString();
    }

    public C75375u(CharSequence charSequence) {
        this.f221617d = null;
        this.f221617d = new SpannableString(charSequence);
    }

    public C75375u(String str) {
        this.f221617d = null;
        this.f221617d = new SpannableString(str);
    }

    public C75375u(Spannable spannable) {
        this.f221617d = null;
        this.f221617d = new SpannableString(spannable);
    }

    public C75375u(SpannableString spannableString) {
        this.f221617d = spannableString;
    }
}
