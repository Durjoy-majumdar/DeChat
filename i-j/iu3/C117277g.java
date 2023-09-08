package iu3;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: iu3.g */
public class C117277g {

    /* renamed from: a */
    public HashMap<String, Object> f351130a = new HashMap<>();

    /* renamed from: b */
    public C117278a f351131b;

    /* renamed from: iu3.g$a */
    public static final class C117278a {

        /* renamed from: a */
        public ConcurrentHashMap<String, Object> f351132a = new ConcurrentHashMap<>();

        /* renamed from: b */
        public String f351133b;

        /* renamed from: c */
        public AtomicInteger f351134c;

        public C117278a(String str, AtomicInteger atomicInteger) {
            this.f351133b = str;
            this.f351134c = atomicInteger;
        }
    }

    public C117277g(C117278a aVar) {
        this.f351131b = aVar;
    }
}
