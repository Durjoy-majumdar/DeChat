package f43;

import a43.C103318l;
import java.util.concurrent.atomic.AtomicBoolean;
import p80.C110193b;
import p80.C110194c;

/* renamed from: f43.d */
public class C107476d {

    /* renamed from: e */
    public static C107476d f321552e;

    /* renamed from: a */
    public AtomicBoolean f321553a = new AtomicBoolean(false);

    /* renamed from: b */
    public C110194c f321554b = null;

    /* renamed from: c */
    public C103318l f321555c;

    /* renamed from: d */
    public C107477a f321556d;

    /* renamed from: f43.d$a */
    public interface C107477a {
    }

    /* renamed from: b */
    public static C107476d m145590b() {
        if (f321552e == null) {
            f321552e = new C107476d();
        }
        return f321552e;
    }

    /* renamed from: a */
    public synchronized C103318l mo157898a() {
        this.f321554b = C110193b.m149776b(false, 14);
        this.f321555c = new C103318l(this.f321554b.f329652e);
        this.f321554b.close();
        this.f321554b = null;
        return this.f321555c;
    }
}
