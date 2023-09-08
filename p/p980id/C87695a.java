package p980id;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.Surface;
import p292ad.C79502b;
import p817kd.C88140c;
import p830xc.C91165a;
import p830xc.C91167d;

/* renamed from: id.a */
public class C87695a implements C87696b {

    /* renamed from: d */
    public int f253971d;

    /* renamed from: e */
    public String f253972e;

    /* renamed from: f */
    public C88140c f253973f;

    /* renamed from: f */
    public void mo110220f(MotionEvent motionEvent) {
    }

    /* renamed from: g */
    public void mo122120g(String str) {
        this.f253972e = str;
    }

    /* renamed from: h */
    public void mo17968h(Surface surface) {
    }

    /* renamed from: k */
    public void mo122121k(C88140c cVar) {
        this.f253973f = cVar;
    }

    /* renamed from: n */
    public boolean mo17972n(C91165a aVar) {
        return this instanceof C79502b;
    }

    /* renamed from: o */
    public void mo17973o(Bitmap bitmap) {
    }

    /* renamed from: p */
    public String mo122122p() {
        return C91167d.m114403d(this.f253972e, this.f253971d);
    }

    public void setId(int i) {
        this.f253971d = i;
    }
}
