package p1046ue;

import java.util.ArrayList;
import java.util.List;
import p1046ue.C90650d;

/* renamed from: ue.c */
public class C90649c {

    /* renamed from: a */
    public final C90650d f260437a;

    /* renamed from: b */
    public final List<Integer> f260438b;

    /* renamed from: c */
    public final List<String> f260439c = new ArrayList();

    /* renamed from: d */
    public long f260440d;

    /* renamed from: e */
    public int f260441e = 1;

    public C90649c(C90650d dVar) {
        ArrayList arrayList = new ArrayList();
        this.f260438b = arrayList;
        this.f260437a = dVar;
        arrayList.add(Integer.valueOf(dVar.f260443b));
        mo124785a(dVar.f260447f);
        C90648b bVar = dVar.f260447f;
        if (bVar != null) {
            this.f260440d += bVar.mo124782b();
        }
    }

    /* renamed from: a */
    public void mo124785a(C90648b bVar) {
        if (bVar != null) {
            C90650d.C90651a aVar = bVar.f260434j;
            if (aVar == C90650d.C90651a.TEXTURE) {
                for (C90647a aVar2 : bVar.f260436l) {
                    if (aVar2 != null) {
                        this.f260439c.add(aVar2.toString());
                    }
                }
            } else if (aVar == C90650d.C90651a.BUFFER) {
                this.f260439c.add("MemoryInfo{target=" + bVar.f260425a + ", id=" + bVar.f260429e + ", eglContextNativeHandle='" + bVar.f260430f + '\'' + ", usage=" + bVar.f260431g + ", size=" + bVar.mo124782b() + '}');
            } else if (aVar == C90650d.C90651a.RENDER_BUFFERS) {
                this.f260439c.add("MemoryInfo{target=" + bVar.f260425a + ", id=" + bVar.f260429e + ", eglContextNativeHandle='" + bVar.f260430f + '\'' + ", internalFormat=" + bVar.f260426b + ", width=" + bVar.f260427c + ", height=" + bVar.f260428d + ", size=" + bVar.mo124782b() + '}');
            }
        }
    }
}
