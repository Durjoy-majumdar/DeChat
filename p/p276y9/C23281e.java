package p276y9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p1224z9.C119086a;
import p276y9.C26627b;
import p296bf.C79695b;

/* renamed from: y9.e */
public final class C23281e {

    /* renamed from: a */
    public static final Set<String> f66913a = new HashSet(Arrays.asList(new String[]{Boolean.class.getName(), Character.class.getName(), Float.class.getName(), Double.class.getName(), Byte.class.getName(), Short.class.getName(), Integer.class.getName(), Long.class.getName()}));

    /* renamed from: a */
    public static String m27761a(Object obj) {
        C26632h hVar = (C26632h) obj;
        List<C26627b.C23279a> g = ((C26627b) hVar).mo53610g();
        Integer num = (Integer) m27762b(g, "count");
        C79695b.m96813a(num, "count");
        if (num.intValue() == 0) {
            return "";
        }
        Object b = m27762b(g, "value");
        C79695b.m96813a(b, "value");
        boolean z = b instanceof C26626a;
        boolean z2 = true;
        if (z && ((C26626a) b).f74066h == C23282o.CHAR) {
            C26626a aVar = (C26626a) b;
            Integer num2 = 0;
            Iterator it = ((ArrayList) g).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C26627b.C23279a) it.next()).f66909a.f66912b.equals("offset")) {
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                num2 = (Integer) m27762b(g, "offset");
                C79695b.m96813a(num2, "offset");
            }
            int intValue = num2.intValue();
            int intValue2 = num.intValue();
            char[] cArr = new char[intValue2];
            ByteBuffer.wrap(aVar.mo53607g(intValue, intValue2)).order(C119086a.f356633a).asCharBuffer().get(cArr);
            return new String(cArr);
        }
        if (z && ((C26626a) b).f74066h == C23282o.BYTE) {
            C26626a aVar2 = (C26626a) b;
            Class<C26626a> cls = C26626a.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("g", new Class[]{cls2, cls2});
                declaredMethod.setAccessible(true);
                return new String((byte[]) declaredMethod.invoke(aVar2, new Object[]{0, num}), Charset.forName("UTF-8"));
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } else {
            throw new UnsupportedOperationException("Could not find char array in " + hVar);
        }
    }

    /* renamed from: b */
    public static <T> T m27762b(List<C26627b.C23279a> list, String str) {
        for (C26627b.C23279a next : list) {
            if (next.f66909a.f66912b.equals(str)) {
                return next.f66910b;
            }
        }
        throw new IllegalArgumentException("Field " + str + " does not exists");
    }
}
