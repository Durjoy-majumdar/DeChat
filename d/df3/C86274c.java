package df3;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* renamed from: df3.c */
public interface C86274c {

    /* renamed from: df3.c$b */
    public static abstract class C20456b implements C86274c {

        /* renamed from: a */
        public final List<C20457a> f57487a = new ArrayList();

        /* renamed from: b */
        public final StringBuilder f57488b = new StringBuilder();

        /* renamed from: df3.c$b$a */
        public static abstract class C20457a implements C86275a {

            /* renamed from: a */
            public String f57489a;

            /* renamed from: b */
            public Object f57490b;

            /* renamed from: c */
            public SharedPreferences.Editor f57491c;

            public C20457a(String str, Object obj) {
                this.f57489a = str;
                this.f57490b = obj;
            }

            /* renamed from: a */
            public abstract void mo32007a(SharedPreferences.Editor editor);
        }

        /* renamed from: df3.c$b$b */
        public static class C20458b extends C20457a {
            public C20458b(String str, boolean z) {
                super(str, Boolean.valueOf(z));
            }

            /* renamed from: a */
            public void mo32007a(SharedPreferences.Editor editor) {
                editor.putBoolean(this.f57489a, ((Boolean) this.f57490b).booleanValue());
            }

            public String getDescription() {
                return "putBoolean(" + this.f57489a + ", " + this.f57490b + ")";
            }
        }

        /* renamed from: df3.c$b$c */
        public static class C20459c extends C20457a {
            public C20459c(String str, int i) {
                super(str, Integer.valueOf(i));
            }

            /* renamed from: a */
            public void mo32007a(SharedPreferences.Editor editor) {
                editor.putInt(this.f57489a, ((Integer) this.f57490b).intValue());
            }

            public String getDescription() {
                return "putInt(" + this.f57489a + ", " + this.f57490b + ")";
            }
        }

        public C20456b(String str) {
        }

        public String getDescription() {
            return this.f57488b.toString();
        }
    }

    /* renamed from: df3.c$a */
    public interface C86275a {
        String getDescription();
    }

    /* renamed from: a */
    void mo14949a(Context context);

    /* renamed from: b */
    void mo14948b();

    String getDescription();
}
