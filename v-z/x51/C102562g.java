package x51;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96984r2;
import te3.C101754a80;
import te3.C101776f80;
import te3.C101824o80;

/* renamed from: x51.g */
public class C102562g {

    /* renamed from: a */
    public C102563a f301982a;

    /* renamed from: b */
    public C101824o80 f301983b;

    /* renamed from: c */
    public C101754a80 f301984c;

    /* renamed from: d */
    public C101776f80 f301985d;

    /* renamed from: e */
    public int f301986e;

    /* renamed from: f */
    public int f301987f;

    /* renamed from: g */
    public int f301988g;

    /* renamed from: h */
    public boolean f301989h;

    /* renamed from: i */
    public boolean f301990i = true;

    /* renamed from: j */
    public boolean f301991j = false;

    /* renamed from: x51.g$a */
    public enum C102563a {
        summary,
        cellset
    }

    public C102562g(C101824o80 o802) {
        this.f301983b = o802;
        this.f301982a = C102563a.summary;
    }

    /* renamed from: a */
    public void mo142188a(boolean z, C96984r2 r2Var, boolean z2) {
        C96984r2 r2Var2 = r2Var;
        C101824o80 o802 = this.f301983b;
        if (o802 != null) {
            if (z2) {
                mo142189b(7);
                return;
            }
            boolean b = C102561f.m135422b(o802);
            boolean e = C102561f.m135425e(o802);
            boolean c = C102561f.m135423c(o802.f299001n, 8);
            boolean isEmpty = TextUtils.isEmpty(o802.f298999i);
            boolean a = C102561f.m135421a(o802.f299001n);
            int i = o802.f299003p;
            boolean z3 = i > 0 && ((long) i) < System.currentTimeMillis();
            if (c && e) {
                mo142189b(8);
            } else if (z3) {
                mo142189b(-2);
            } else if (b) {
                mo142189b(3);
                if (e || (!z && isEmpty)) {
                    this.f301988g = 0;
                } else {
                    this.f301988g = 1;
                }
            } else if (a) {
                mo142189b(20);
            } else if (e || (!z && isEmpty)) {
                mo142189b(3);
                this.f301988g = 0;
            } else {
                this.f301988g = 1;
                if (z && r2Var2 != null) {
                    int i2 = r2Var2.f284148c;
                    if (i2 == 11) {
                        mo142189b(11);
                    } else if (i2 != 12) {
                        int i3 = r2Var2.f284147b;
                        if (!(i3 == 7 || i3 == 6 || i3 == 3)) {
                            mo142189b(10);
                        }
                    } else {
                        mo142189b(4);
                    }
                } else if (z) {
                    mo142189b(11);
                } else {
                    mo142189b(4);
                }
            }
            if (z && r2Var2 != null && !Util.isNullOrNil(r2Var2.f284152g)) {
                C101824o80 o803 = this.f301983b;
                o803.f298999i = r2Var2.f284152g;
                o803.f299007t = r2Var2.f284151f;
                o803.f299008u = r2Var2.f284150e;
            }
        }
    }

    /* renamed from: b */
    public void mo142189b(int i) {
        if (i == 7 && this.f301987f == 6 && this.f301990i) {
            this.f301989h = true;
        }
        this.f301987f = i;
    }

    public C102562g(C101754a80 a802) {
        this.f301984c = a802;
        this.f301982a = C102563a.cellset;
    }
}
