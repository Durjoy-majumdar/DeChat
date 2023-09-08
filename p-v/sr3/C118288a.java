package sr3;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: sr3.a */
public class C118288a implements Iterable<Object> {

    /* renamed from: d */
    public final ArrayList<Object> f353538d;

    public C118288a() {
        this.f353538d = new ArrayList<>();
    }

    /* renamed from: f */
    public final void mo183061f(Collection<?> collection, boolean z) {
        ArrayList<Object> arrayList = this.f353538d;
        arrayList.ensureCapacity(arrayList.size() + collection.size());
        if (z) {
            for (Object j : collection) {
                mo183063i(C118290c.m166870j(j));
            }
            return;
        }
        for (Object i : collection) {
            mo183063i(i);
        }
    }

    /* renamed from: h */
    public Object mo183062h(int i) {
        if (i < 0 || i >= this.f353538d.size()) {
            return null;
        }
        return this.f353538d.get(i);
    }

    /* renamed from: i */
    public C118288a mo183063i(Object obj) {
        C118290c.m166869i(obj);
        this.f353538d.add(obj);
        return this;
    }

    public Iterator<Object> iterator() {
        return this.f353538d.iterator();
    }

    /* renamed from: k */
    public Writer mo183065k(Writer writer, int i, int i2) {
        int i3;
        try {
            int size = this.f353538d.size();
            writer.write(91);
            if (size == 1) {
                C118290c.m166871l(writer, this.f353538d.get(0), i, i2);
            } else if (size != 0) {
                int i4 = i2 + i;
                i3 = 0;
                boolean z = false;
                while (i3 < size) {
                    if (z) {
                        writer.write(44);
                    }
                    if (i > 0) {
                        writer.write(10);
                    }
                    Pattern pattern = C118290c.f353539b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        writer.write(32);
                    }
                    C118290c.m166871l(writer, this.f353538d.get(i3), i, i4);
                    i3++;
                    z = true;
                }
                if (i > 0) {
                    writer.write(10);
                }
                Pattern pattern2 = C118290c.f353539b;
                for (int i6 = 0; i6 < i2; i6++) {
                    writer.write(32);
                }
            }
            writer.write(93);
            return writer;
        } catch (Exception e) {
            throw new C118289b("Unable to write JSONArray value at index: " + i3, e);
        } catch (Exception e2) {
            throw new C118289b("Unable to write JSONArray value at index: 0", e2);
        } catch (IOException e3) {
            throw new C118289b((Throwable) e3);
        }
    }

    public String toString() {
        String obj;
        try {
            StringWriter stringWriter = new StringWriter();
            synchronized (stringWriter.getBuffer()) {
                mo183065k(stringWriter, 0, 0);
                obj = stringWriter.toString();
            }
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }

    public C118288a(Collection<?> collection) {
        if (collection == null) {
            this.f353538d = new ArrayList<>();
            return;
        }
        this.f353538d = new ArrayList<>(collection.size());
        mo183061f(collection, true);
    }

    public C118288a(Object obj) {
        this();
        if (!obj.getClass().isArray()) {
            throw new C118289b("JSONArray initial value should be a string or collection or array.");
        } else if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            ArrayList<Object> arrayList = this.f353538d;
            arrayList.ensureCapacity(arrayList.size() + length);
            for (int i = 0; i < length; i++) {
                mo183063i(C118290c.m166870j(Array.get(obj, i)));
            }
        } else if (obj instanceof C118288a) {
            this.f353538d.addAll(((C118288a) obj).f353538d);
        } else if (obj instanceof Collection) {
            mo183061f((Collection) obj, true);
        } else if (obj instanceof Iterable) {
            for (Object j : (Iterable) obj) {
                mo183063i(C118290c.m166870j(j));
            }
        } else {
            throw new C118289b("JSONArray initial value should be a string or collection or array.");
        }
    }
}
