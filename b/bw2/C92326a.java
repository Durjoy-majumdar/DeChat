package bw2;

import gy3.C8480h;
import gy3.C87412m;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: bw2.a */
public final class C92326a {

    /* renamed from: a */
    public static final C92327a f264186a = new C92327a((C8480h) null);

    /* renamed from: bw2.a$a */
    public static final class C92327a {
        public C92327a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo126326a(Integer num) {
            String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date((num != null ? (long) num.intValue() : 0) * 1000));
            C87412m.m108593f(format, "simpleDateFormat.format(date)");
            return format;
        }
    }
}
