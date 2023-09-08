package ia0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import p375qh.C110390f;
import rx3.C13598b0;

/* renamed from: ia0.b */
public final class C108436b {

    /* renamed from: a */
    public final C108435a f324690a;

    /* renamed from: b */
    public final String f324691b = "MicroMsg.FinderTemplateAudioRecorder";

    /* renamed from: c */
    public final C110390f f324692c;

    /* renamed from: d */
    public C32227p<? super byte[], ? super Integer, C13598b0> f324693d;

    /* renamed from: ia0.b$a */
    public static final class C108437a implements C110390f.C89659b {

        /* renamed from: a */
        public final /* synthetic */ C108436b f324694a;

        public C108437a(C108436b bVar) {
            this.f324694a = bVar;
        }

        /* renamed from: a */
        public void mo35508a(byte[] bArr, int i) {
            C32227p<? super byte[], ? super Integer, C13598b0> pVar;
            if (bArr != null && i > 0 && (pVar = this.f324694a.f324693d) != null) {
                pVar.invoke(bArr, Integer.valueOf(i));
            }
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
            String str = this.f324694a.f324691b;
            Log.m105920e(str, "onRecError state is in " + i);
        }
    }

    public C108436b(C108435a aVar) {
        C87412m.m108594g(aVar, "audioConfig");
        this.f324690a = aVar;
        C110390f fVar = new C110390f(aVar.f324687a, aVar.f324688b, 5);
        this.f324692c = fVar;
        fVar.mo161900e(1);
        fVar.f330234m = -19;
        fVar.f330245x = new C108437a(this);
        aVar.f324689c = fVar.f330229h;
    }
}
