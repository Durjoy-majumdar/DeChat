package tu1;

import java.util.ArrayList;
import java.util.Iterator;
import p172io.flutter.plugin.common.EventChannel;

/* renamed from: tu1.q */
public final class C118542q implements EventChannel.EventSink {

    /* renamed from: a */
    public EventChannel.EventSink f354752a;

    /* renamed from: b */
    public ArrayList<Object> f354753b = new ArrayList<>();

    /* renamed from: c */
    public boolean f354754c = false;

    /* renamed from: tu1.q$b */
    public static class C118544b {
        public C118544b(C118543a aVar) {
        }
    }

    /* renamed from: tu1.q$c */
    public static class C118545c {

        /* renamed from: a */
        public String f354755a;

        /* renamed from: b */
        public String f354756b;

        /* renamed from: c */
        public Object f354757c;

        public C118545c(String str, String str2, Object obj) {
            this.f354755a = str;
            this.f354756b = str2;
            this.f354757c = obj;
        }
    }

    /* renamed from: a */
    public final void mo183258a() {
        if (this.f354752a != null) {
            Iterator<Object> it = this.f354753b.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof C118544b) {
                    this.f354752a.endOfStream();
                } else if (next instanceof C118545c) {
                    C118545c cVar = (C118545c) next;
                    this.f354752a.error(cVar.f354755a, cVar.f354756b, cVar.f354757c);
                } else {
                    this.f354752a.success(next);
                }
            }
            this.f354753b.clear();
        }
    }

    public void endOfStream() {
        C118544b bVar = new C118544b((C118543a) null);
        if (!this.f354754c) {
            this.f354753b.add(bVar);
        }
        mo183258a();
        this.f354754c = true;
    }

    public void error(String str, String str2, Object obj) {
        C118545c cVar = new C118545c(str, str2, obj);
        if (!this.f354754c) {
            this.f354753b.add(cVar);
        }
        mo183258a();
    }

    public void success(Object obj) {
        if (!this.f354754c) {
            this.f354753b.add(obj);
        }
        mo183258a();
    }
}
