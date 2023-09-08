package ge2;

import com.tencent.p014mm.plugin.performance.elf.AbstractProcessChecker;
import java.util.HashMap;

/* renamed from: ge2.b */
public class C32426b {

    /* renamed from: a */
    public static HashMap<Class, AbstractProcessChecker> f85996a = new HashMap<>();

    /* renamed from: a */
    public static <T extends AbstractProcessChecker> T m39718a(Class<? extends AbstractProcessChecker> cls) {
        if (f85996a.containsKey(cls)) {
            return (AbstractProcessChecker) f85996a.get(cls);
        }
        try {
            T t = (AbstractProcessChecker) cls.newInstance();
            f85996a.put(cls, t);
            return t;
        } catch (IllegalAccessException | InstantiationException unused) {
            return null;
        }
    }
}
