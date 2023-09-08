package bu3;

import a14.C53872d1;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C24561h0;
import gy3.C24573w;
import gy3.C87412m;
import gy3.C87413o;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import ny3.C89104m;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: bu3.a */
public final class C16821a {

    /* renamed from: a */
    public static final /* synthetic */ C89104m[] f45437a;

    /* renamed from: b */
    public static final C13601g f45438b = C36568h.m40985a(C16822a.f45441d);

    /* renamed from: c */
    public static final C13601g f45439c = C36568h.m40985a(C16823b.f45442d);

    /* renamed from: d */
    public static final C13601g f45440d = C36568h.m40985a(C16824c.f45443d);

    /* renamed from: bu3.a$a */
    public static final class C16822a extends C87413o implements C32224a<Field> {

        /* renamed from: d */
        public static final C16822a f45441d = new C16822a();

        public C16822a() {
            super(0);
        }

        public Object invoke() {
            try {
                Field declaredField = Field.class.getDeclaredField("modifiers");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException e) {
                C16821a.m16470b(e);
                return null;
            }
        }
    }

    /* renamed from: bu3.a$b */
    public static final class C16823b extends C87413o implements C32224a<Field> {

        /* renamed from: d */
        public static final C16823b f45442d = new C16823b();

        public C16823b() {
            super(0);
        }

        public Object invoke() {
            try {
                Field declaredField = C53872d1.class.getDeclaredField("a");
                declaredField.setAccessible(true);
                C16821a.m16469a(declaredField);
                return declaredField;
            } catch (NoSuchFieldException e) {
                C16821a.m16470b(e);
                return null;
            }
        }
    }

    /* renamed from: bu3.a$c */
    public static final class C16824c extends C87413o implements C32224a<Field> {

        /* renamed from: d */
        public static final C16824c f45443d = new C16824c();

        public C16824c() {
            super(0);
        }

        public Object invoke() {
            try {
                Field declaredField = C53872d1.class.getDeclaredField("c");
                declaredField.setAccessible(true);
                C16821a.m16469a(declaredField);
                return declaredField;
            } catch (NoSuchFieldException e) {
                C16821a.m16470b(e);
                return null;
            }
        }
    }

    static {
        Class<C16821a> cls = C16821a.class;
        C24561h0 h0Var = C24560g0.f70158a;
        f45437a = new C89104m[]{h0Var.mo51272f(new C24573w(h0Var.mo51269c(cls, "threadpool-coroutines_release"), "field_java_lang_reflect_Field_modifiers", "getField_java_lang_reflect_Field_modifiers()Ljava/lang/reflect/Field;")), h0Var.mo51272f(new C24573w(h0Var.mo51269c(cls, "threadpool-coroutines_release"), "field_kotlinx_coroutines_Dispatchers_Default", "getField_kotlinx_coroutines_Dispatchers_Default()Ljava/lang/reflect/Field;")), h0Var.mo51272f(new C24573w(h0Var.mo51269c(cls, "threadpool-coroutines_release"), "field_kotlinx_coroutines_Dispatchers_IO", "getField_kotlinx_coroutines_Dispatchers_IO()Ljava/lang/reflect/Field;"))};
    }

    /* renamed from: a */
    public static final boolean m16469a(Field field) {
        try {
            C13601g gVar = f45438b;
            C89104m mVar = f45437a[0];
            Field field2 = (Field) ((C36570n) gVar).getValue();
            if (field2 != null) {
                field2.set(field, Integer.valueOf(field.getModifiers() & -17));
            }
            return true;
        } catch (Throwable th) {
            m16470b(th);
            return false;
        }
    }

    /* renamed from: b */
    public static final String m16470b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        C87412m.m108590c(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
