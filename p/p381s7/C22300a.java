package p381s7;

import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* renamed from: s7.a */
public final class C22300a extends C22304c {

    /* renamed from: c */
    public final List<C22301a> f63210c;

    /* renamed from: d */
    public final List<C22301a> f63211d;

    /* renamed from: e */
    public final List<C22301a> f63212e;

    /* renamed from: f */
    public final Format f63213f;

    /* renamed from: g */
    public final List<Format> f63214g;

    /* renamed from: s7.a$a */
    public static final class C22301a {

        /* renamed from: a */
        public final String f63215a;

        /* renamed from: b */
        public final Format f63216b;

        public C22301a(String str, Format format) {
            this.f63215a = str;
            this.f63216b = format;
        }
    }

    public C22300a(String str, List<String> list, List<C22301a> list2, List<C22301a> list3, List<C22301a> list4, Format format, List<Format> list5) {
        super(str, list);
        this.f63210c = Collections.unmodifiableList(list2);
        this.f63211d = Collections.unmodifiableList(list3);
        this.f63212e = Collections.unmodifiableList(list4);
        this.f63213f = format;
        this.f63214g = list5 != null ? Collections.unmodifiableList(list5) : null;
    }
}
