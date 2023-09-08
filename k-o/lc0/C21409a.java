package lc0;

import com.tencent.p014mm.modelimage.loader.impr.C114733a;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import gc0.C20829b;
import hc0.C20935b;
import hc0.C20937c;
import ic0.C108455d;
import ic0.C117152b;
import ic0.C21068c;
import jc0.C21210b;

/* renamed from: lc0.a */
public class C21409a implements Runnable {

    /* renamed from: d */
    public final String f60566d;

    /* renamed from: e */
    public final C20937c f60567e;

    /* renamed from: f */
    public final C108455d f60568f;

    /* renamed from: g */
    public final C21068c f60569g;

    /* renamed from: h */
    public final C117152b f60570h;

    public C21409a(String str, C20937c cVar, C20829b bVar, C108455d dVar) {
        this.f60566d = str;
        C20935b bVar2 = bVar.f58840a;
        if (cVar == null) {
            this.f60567e = bVar2.f59290e;
        } else {
            this.f60567e = cVar;
        }
        this.f60568f = dVar;
        C21068c cVar2 = this.f60567e.f59342z;
        if (cVar2 != null) {
            this.f60569g = cVar2;
        } else {
            this.f60569g = bVar2.f59293h;
        }
        this.f60570h = bVar2.f59292g;
    }

    public void run() {
        C21210b a = this.f60569g.mo32789a(this.f60566d);
        if (a == null) {
            C108455d dVar = this.f60568f;
            if (dVar != null) {
                dVar.mo26263a(false, this.f60567e.f59316C);
                return;
            }
            return;
        }
        if (BitmapUtil.decodeByteArray(a.f59987c, 10, 10) != null || !this.f60567e.f59341y) {
            if (((C114733a) this.f60570h).mo174351d(this.f60566d, a.f59987c, this.f60567e)) {
                C108455d dVar2 = this.f60568f;
                if (dVar2 != null) {
                    dVar2.mo26263a(true, this.f60567e.f59316C);
                    return;
                }
                return;
            }
        }
        C108455d dVar3 = this.f60568f;
        if (dVar3 != null) {
            dVar3.mo26263a(false, this.f60567e.f59316C);
        }
    }
}
