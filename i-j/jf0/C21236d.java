package jf0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import kf0.C21331a;

/* renamed from: jf0.d */
public class C21236d extends C21234c {

    /* renamed from: d */
    public int f60034d;

    /* renamed from: e */
    public int f60035e;

    /* renamed from: f */
    public C21331a f60036f;

    /* renamed from: g */
    public boolean f60037g;

    /* renamed from: h */
    public Context f60038h;

    /* renamed from: jf0.d$a */
    public class C21237a implements C21331a {
        public C21237a(C21236d dVar) {
        }

        /* renamed from: a */
        public String mo33229a(String str) {
            return str;
        }
    }

    public C21236d(int i, int i2, Context context) {
        super(i, i2);
        this.f60038h = context;
        C21331a aVar = this.f60036f;
        this.f60036f = aVar;
        if (aVar == null) {
            this.f60036f = new C21237a(this);
        }
        this.f60034d = i;
        this.f60035e = i2;
    }

    /* renamed from: a */
    public String mo33223a(int i) {
        return (i != 0 || !this.f60037g) ? super.mo33223a(i) : this.f60038h.getString(C0966R.string.hj9);
    }

    /* renamed from: b */
    public Integer getItem(int i) {
        if (i < 0 || i >= getItemsCount()) {
            return null;
        }
        return this.f60037g ? Integer.valueOf((this.f60034d + i) - 1) : Integer.valueOf(this.f60034d + i);
    }

    /* renamed from: c */
    public int mo33227c() {
        return this.f60035e;
    }

    /* renamed from: d */
    public int mo33228d() {
        return this.f60034d;
    }

    public int getItemsCount() {
        return (this.f60037g ? (this.f60035e - this.f60034d) + 1 : this.f60035e - this.f60034d) + 1;
    }
}
