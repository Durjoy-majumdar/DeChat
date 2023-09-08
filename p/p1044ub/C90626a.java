package p1044ub;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p1044ub.C90626a.C90627a;
import p1044ub.C90626a.C90628b;

/* renamed from: ub.a */
public class C90626a<ComponentImpType extends C90628b, ComponentLogicImp extends C90627a, Component extends C82381f> {

    /* renamed from: a */
    public ConcurrentHashMap<String, Class<? extends ComponentLogicImp>> f260366a = new ConcurrentHashMap<>(2);

    /* renamed from: ub.a$a */
    public static abstract class C90627a<Component extends C82381f> {

        /* renamed from: d */
        public Component f260367d;

        /* renamed from: e */
        public final Map<Class, Object> f260368e = new HashMap(2);

        public C90627a(Component component) {
            this.f260367d = component;
        }

        /* renamed from: Y */
        public final Collection<Object> mo124763Y() {
            LinkedList linkedList;
            synchronized (this.f260368e) {
                linkedList = new LinkedList(((HashMap) this.f260368e).values());
            }
            return linkedList;
        }

        /* renamed from: Z */
        public final synchronized Component mo124764Z() {
            return this.f260367d;
        }

        /* renamed from: a0 */
        public final <T> void mo124765a0(Class<T> cls, T t) {
            synchronized (this.f260368e) {
                ((HashMap) this.f260368e).put(cls, t);
            }
        }

        /* renamed from: t */
        public <T> T mo116072t(Class<T> cls) {
            synchronized (this.f260368e) {
                T cast = cls.cast(((HashMap) this.f260368e).get(cls));
                if (cast != null) {
                    return cast;
                }
                for (Object next : ((HashMap) this.f260368e).values()) {
                    if (cls.isInstance(next)) {
                        T cast2 = cls.cast(next);
                        return cast2;
                    }
                }
                return null;
            }
        }
    }

    /* renamed from: ub.a$b */
    public interface C90628b {
    }

    /* renamed from: a */
    public void mo124762a(ComponentImpType componentimptype, Class<? extends ComponentLogicImp> cls) {
        this.f260366a.put(componentimptype.getClass().getName(), cls);
    }
}
