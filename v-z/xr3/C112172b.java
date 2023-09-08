package xr3;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import yr3.C112482d;

/* renamed from: xr3.b */
public abstract class C112172b<T extends CharacterStyle> implements Serializable {

    /* renamed from: d */
    public LinkedList<RectF> f335871d;

    /* renamed from: e */
    public int f335872e;

    /* renamed from: f */
    public int f335873f;

    /* renamed from: g */
    public CharacterStyle f335874g;

    public C112172b(int i, int i2, CharacterStyle characterStyle) {
        this.f335872e = i;
        this.f335873f = i2;
        this.f335874g = characterStyle;
    }

    /* renamed from: a */
    public void mo163972a(List<C112482d> list) {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f335871d == null) {
            this.f335871d = new LinkedList<>();
            for (C112482d next : list) {
                int i5 = next.f336828f;
                int i6 = this.f335872e;
                if (i5 <= i6 && (i4 = this.f335873f) < next.f336829g) {
                    this.f335871d.add(next.mo164225a(i6, i4));
                    return;
                } else if (i5 <= i6 && i6 < (i3 = next.f336829g) && i3 <= this.f335873f) {
                    this.f335871d.add(next.mo164225a(i6, i3));
                } else if (i6 < i5 && (i2 = this.f335873f) < next.f336829g && i2 >= i5) {
                    this.f335871d.add(next.mo164225a(i5, i2));
                    return;
                } else if (i6 < i5 && this.f335873f >= (i = next.f336829g)) {
                    this.f335871d.add(next.mo164225a(i5, i));
                }
            }
        }
    }

    /* renamed from: b */
    public abstract void mo163971b(Canvas canvas, TextPaint textPaint, List<C112482d> list);

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C112172b)) {
            C112172b bVar = (C112172b) obj;
            if (bVar.f335872e == this.f335872e && bVar.f335873f == this.f335873f) {
                for (int i = 0; i < this.f335871d.size(); i++) {
                    if (!this.f335871d.get(i).equals(bVar.f335871d.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.f335871d.size(); i2++) {
            i += this.f335871d.get(i2).hashCode();
        }
        return this.f335872e + this.f335873f + i;
    }

    public String toString() {
        return "CharacterBgStyle{mRectFList=" + this.f335871d + ", mStart=" + this.f335872e + ", mEnd=" + this.f335873f + '}';
    }
}
