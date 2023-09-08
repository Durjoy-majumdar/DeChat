package j40;

import android.app.Application;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import h40.C87422a;

/* renamed from: j40.a */
public abstract class C46396a {

    /* renamed from: a */
    public String f124988a;

    /* renamed from: b */
    public C87422a f124989b;

    /* renamed from: c */
    public Application f124990c;

    /* renamed from: d */
    public Boolean f124991d;

    /* renamed from: e */
    public C46397a f124992e = new C46397a();

    /* renamed from: j40.a$a */
    public static class C46397a {

        /* renamed from: a */
        public long f124993a;

        /* renamed from: b */
        public long f124994b;

        /* renamed from: c */
        public long f124995c;

        /* renamed from: d */
        public long f124996d;

        /* renamed from: e */
        public long f124997e;

        /* renamed from: f */
        public long f124998f;

        /* renamed from: g */
        public long f124999g;

        /* renamed from: h */
        public long f125000h;
    }

    public C46396a(String str, Application application) {
        this.f124988a = str;
        this.f124989b = new C87422a();
        this.f124990c = application;
    }

    /* renamed from: a */
    public String mo71803a() {
        return this.f124988a;
    }

    /* renamed from: b */
    public boolean mo71804b() {
        if (this.f124991d == null) {
            this.f124991d = Boolean.valueOf(mo71805c(""));
        }
        return this.f124991d.booleanValue();
    }

    /* renamed from: c */
    public boolean mo71805c(String str) {
        String str2 = this.f124988a;
        if (str2 != null) {
            if (str2.equals(MMApplicationContext.getPackageName() + str)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String str = this.f124988a;
        return str != null ? str : super.toString();
    }
}
