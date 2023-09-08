package m10;

import java.util.ArrayList;
import java.util.Iterator;
import p172io.flutter.plugin.common.EventChannel;

/* renamed from: m10.d */
public final class C117494d implements EventChannel.EventSink {

    /* renamed from: a */
    public EventChannel.EventSink f351596a;

    /* renamed from: b */
    public ArrayList<Object> f351597b = new ArrayList<>();

    /* renamed from: c */
    public boolean f351598c = false;

    /* renamed from: m10.d$b */
    public static class C117496b {
        public C117496b(C117495a aVar) {
        }
    }

    /* renamed from: m10.d$c */
    public static class C117497c {

        /* renamed from: a */
        public String f351599a;

        /* renamed from: b */
        public String f351600b;

        /* renamed from: c */
        public Object f351601c;

        public C117497c(String str, String str2, Object obj) {
            this.f351599a = str;
            this.f351600b = str2;
            this.f351601c = obj;
        }
    }

    /* renamed from: a */
    public final void mo182213a() {
        if (this.f351596a != null) {
            Iterator<Object> it = this.f351597b.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof C117496b) {
                    this.f351596a.endOfStream();
                } else if (next instanceof C117497c) {
                    C117497c cVar = (C117497c) next;
                    this.f351596a.error(cVar.f351599a, cVar.f351600b, cVar.f351601c);
                } else {
                    this.f351596a.success(next);
                }
            }
            this.f351597b.clear();
        }
    }

    public void endOfStream() {
        C117496b bVar = new C117496b((C117495a) null);
        if (!this.f351598c) {
            this.f351597b.add(bVar);
        }
        mo182213a();
        this.f351598c = true;
    }

    public void error(String str, String str2, Object obj) {
        C117497c cVar = new C117497c(str, str2, obj);
        if (!this.f351598c) {
            this.f351597b.add(cVar);
        }
        mo182213a();
    }

    public void success(Object obj) {
        if (!this.f351598c) {
            this.f351597b.add(obj);
        }
        mo182213a();
    }
}
