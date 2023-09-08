package lv1;

import com.tencent.xweb.file.XVFSFile;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lv1.b */
public abstract class C99664b implements Comparable<C99664b> {

    /* renamed from: d */
    public int f292078d = Integer.MAX_VALUE;

    /* renamed from: e */
    public boolean f292079e = false;

    /* renamed from: f */
    public long f292080f = 0;

    /* renamed from: g */
    public long f292081g = 0;

    /* renamed from: h */
    public List<C99665a> f292082h;

    /* renamed from: i */
    public Object f292083i;

    /* renamed from: lv1.b$a */
    public class C99665a {

        /* renamed from: a */
        public String f292084a;

        /* renamed from: b */
        public long f292085b;

        public C99665a(C99664b bVar) {
        }
    }

    /* renamed from: a */
    public final void mo139037a() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            mo57099b();
            this.f292080f += System.currentTimeMillis() - currentTimeMillis;
        } catch (Exception e) {
            throw e;
        } catch (Throwable th) {
            this.f292080f += System.currentTimeMillis() - currentTimeMillis;
            throw th;
        }
    }

    /* renamed from: b */
    public abstract boolean mo57099b();

    /* renamed from: c */
    public String mo94944c() {
        return "";
    }

    public int compareTo(Object obj) {
        return this.f292078d - ((C99664b) obj).f292078d;
    }

    /* renamed from: d */
    public int mo128767d() {
        return this.f292078d;
    }

    /* renamed from: e */
    public int mo128768e() {
        return -1;
    }

    /* renamed from: f */
    public String mo139039f() {
        List<C99665a> list = this.f292082h;
        if (list == null || ((ArrayList) list).size() <= 1) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < ((ArrayList) this.f292082h).size(); i++) {
            ArrayList arrayList = (ArrayList) this.f292082h;
            C99665a aVar = (C99665a) ((ArrayList) this.f292082h).get(i);
            stringBuffer.append("{");
            stringBuffer.append(aVar.f292084a);
            stringBuffer.append(XVFSFile.PATH_SEPARATOR);
            stringBuffer.append(aVar.f292085b - ((C99665a) arrayList.get(i - 1)).f292085b);
            stringBuffer.append("}");
        }
        return String.format("%s", new Object[]{stringBuffer.toString()});
    }

    /* renamed from: g */
    public boolean mo128769g() {
        return this.f292079e;
    }

    public String getName() {
        return "";
    }

    /* renamed from: h */
    public void mo139040h(String str) {
        if (this.f292082h == null) {
            this.f292082h = new ArrayList();
        }
        C99665a aVar = new C99665a(this);
        aVar.f292084a = str;
        aVar.f292085b = System.currentTimeMillis();
        this.f292082h.add(aVar);
    }
}
