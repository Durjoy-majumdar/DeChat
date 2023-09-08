package s50;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import javax.microedition.khronos.opengles.GL10;
import k90.C108965b;
import p80.C110194c;
import rx3.C13598b0;
import s50.C110747k;

/* renamed from: s50.j */
public final class C110745j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C110747k f331228d;

    /* renamed from: s50.j$a */
    public static final class C110746a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f331229d;

        /* renamed from: e */
        public final /* synthetic */ int f331230e;

        /* renamed from: f */
        public final /* synthetic */ C110747k f331231f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110746a(int i, int i2, C110747k kVar) {
            super(0);
            this.f331229d = i;
            this.f331230e = i2;
            this.f331231f = kVar;
        }

        public Object invoke() {
            C110194c c;
            Log.m105924i("MicroMsg.LiveCoreRender", "width:" + this.f331229d + " height:" + this.f331230e);
            C108965b bVar = this.f331231f.f331235g;
            if (bVar != null) {
                bVar.mo160067e((GL10) null, this.f331229d, this.f331230e);
            }
            C108965b bVar2 = this.f331231f.f331235g;
            if (!(bVar2 == null || (c = bVar2.mo160065c()) == null)) {
                int i = this.f331229d;
                int i2 = this.f331230e;
                c.f329657j = i;
                c.f329658n = i2;
            }
            C32224a<C13598b0> aVar = this.f331231f.f331240o;
            if (aVar != null) {
                ((C110747k.C110752e) aVar).invoke();
            }
            return C13598b0.f38549a;
        }
    }

    public C110745j(C110747k kVar) {
        this.f331228d = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0029, code lost:
        r3 = r3.f166253d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r0 = kg3.C76577a.m92145A(r0)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r1 = kg3.C76577a.m92159j(r1)
            s50.k r2 = r11.f331228d
            w80.d$a r3 = w80.C111742d.f334647a
            r4 = 0
            r5 = 0
            r6 = 1
            r7 = 1
            r8 = 0
            r9 = 16
            r10 = 0
            w80.d$b r3 = w80.C111742d.C111743a.m152352k(r3, r4, r5, r6, r7, r8, r9, r10)
            r2.f331234f = r3
            s50.k r2 = r11.f331228d
            d50.h r3 = r2.f331239n
            r4 = 0
            if (r3 == 0) goto L_0x0030
            d50.f r3 = r3.f166253d
            if (r3 == 0) goto L_0x0030
            boolean r3 = r3.f166228c
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            s50.u r5 = new s50.u
            r5.<init>(r3)
            r2.f331238j = r5
            s50.k r2 = r11.f331228d
            s50.u r5 = r2.f331238j
            gy3.C87412m.m108591d(r5)
            r2.mo148309j(r5, r3)
            s50.k r2 = r11.f331228d
            k90.b r2 = r2.f331235g
            if (r2 == 0) goto L_0x004c
            r3 = 0
            r2.mo160068f(r3, r3)
        L_0x004c:
            s50.k r2 = r11.f331228d
            k90.b r3 = r2.f331235g
            if (r3 == 0) goto L_0x0062
            r5 = 1
            s50.j$a r6 = new s50.j$a
            r6.<init>(r0, r1, r2)
            j90.f r0 = r3.f326402a
            k90.a r1 = new k90.a
            r1.<init>(r3, r6, r5, r4)
            r0.mo148312q(r1)
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s50.C110745j.run():void");
    }
}
