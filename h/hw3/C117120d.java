package hw3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* renamed from: hw3.d */
public class C117120d {

    /* renamed from: a */
    public C117122b f350918a;

    /* renamed from: b */
    public C117121a f350919b;

    /* renamed from: hw3.d$a */
    public static class C117121a {

        /* renamed from: a */
        public Map<Integer, Integer> f350920a = new HashMap();

        /* renamed from: b */
        public int f350921b;

        /* renamed from: a */
        public int mo181058a(int i) {
            if (((HashMap) this.f350920a).containsKey(Integer.valueOf(i))) {
                return ((Integer) ((HashMap) this.f350920a).get(Integer.valueOf(i))).intValue();
            }
            int i2 = this.f350921b + 1;
            this.f350921b = i2;
            ((HashMap) this.f350920a).put(Integer.valueOf(i), Integer.valueOf(i2));
            return i2;
        }
    }

    /* renamed from: hw3.d$b */
    public static class C117122b {

        /* renamed from: a */
        public Queue<Integer> f350922a = new LinkedList();

        /* renamed from: b */
        public Map<Integer, C117119c> f350923b = new HashMap();

        /* renamed from: a */
        public void mo181059a() {
            C117119c cVar = (C117119c) ((HashMap) this.f350923b).get(((LinkedList) this.f350922a).peek());
            if (!(cVar != null && cVar.f350917b)) {
                C117119c cVar2 = (C117119c) ((HashMap) this.f350923b).get(((LinkedList) this.f350922a).peek());
                if (cVar2 != null) {
                    cVar2.f350917b = true;
                }
            }
        }
    }

    public C117120d(C117122b bVar, C117121a aVar) {
        this.f350918a = bVar;
        this.f350919b = aVar;
    }
}
