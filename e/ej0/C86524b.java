package ej0;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ej0.b */
public class C86524b {

    /* renamed from: a */
    public String f251372a;

    /* renamed from: b */
    public String f251373b;

    /* renamed from: c */
    public int f251374c;

    /* renamed from: d */
    public int f251375d;

    /* renamed from: e */
    public int f251376e;

    /* renamed from: f */
    public String f251377f;

    /* renamed from: g */
    public String f251378g;

    /* renamed from: h */
    public String f251379h;

    /* renamed from: i */
    public String f251380i;

    /* renamed from: j */
    public ArrayList<C86531f> f251381j = new ArrayList<>();

    public C86524b() {
        new ArrayList();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C86524b)) {
            return false;
        }
        C86524b bVar = (C86524b) obj;
        return this.f251373b.equals(bVar.f251373b) && this.f251374c == bVar.f251374c && this.f251380i.equals(bVar.f251380i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<C86531f> it = this.f251381j.iterator();
        while (it.hasNext()) {
            sb.append("[");
            sb.append(it.next().toString());
            sb.append("]\n");
        }
        return "host=" + this.f251373b + "\nport=" + this.f251374c + "\nmajor=" + this.f251375d + "\nminor=" + this.f251376e + "\ndeviceType=" + this.f251377f + "\nfriendlyName=" + this.f251378g + "\nmanufacturer=" + this.f251379h + "\nmodeName=" + null + "\nserviceCount=" + this.f251381j.size() + "\nserviceList=\n" + sb.toString();
    }
}
