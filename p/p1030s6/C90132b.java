package p1030s6;

import com.github.henryye.nativeiv.ImageDecodeConfig;
import java.io.InputStream;

/* renamed from: s6.b */
public interface C90132b {

    /* renamed from: s6.b$a */
    public static class C90133a {

        /* renamed from: a */
        public InputStream f258828a;

        /* renamed from: b */
        public String f258829b;

        public C90133a() {
        }

        public C90133a(InputStream inputStream) {
            this.f258828a = inputStream;
        }
    }

    /* renamed from: a */
    String mo109801a();

    boolean accept(Object obj);

    /* renamed from: b */
    C90133a mo109803b(Object obj, ImageDecodeConfig imageDecodeConfig);
}
