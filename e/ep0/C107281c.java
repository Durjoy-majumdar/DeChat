package ep0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import pi0.C110229d;
import pi0.C110230e;
import zi0.C91755a;
import zi0.C91759b;

/* renamed from: ep0.c */
public class C107281c implements C110230e {

    /* renamed from: ep0.c$a */
    public class C107282a implements C91755a.C91757b {

        /* renamed from: a */
        public final /* synthetic */ C110230e.C110231a f320959a;

        /* renamed from: b */
        public final /* synthetic */ C110229d f320960b;

        /* renamed from: c */
        public final /* synthetic */ String f320961c;

        public C107282a(C107281c cVar, C110230e.C110231a aVar, C110229d dVar, String str) {
            this.f320959a = aVar;
            this.f320960b = dVar;
            this.f320961c = str;
        }

        /* renamed from: a */
        public void mo125629a(Bitmap bitmap) {
            if (this.f320959a != null && bitmap != null && !bitmap.isRecycled()) {
                this.f320959a.mo161637a(this.f320960b, this.f320961c, bitmap);
            }
        }
    }

    /* renamed from: Ds */
    public Bitmap mo157759Ds(C110229d dVar, String str, Rect rect, C110230e.C110231a aVar) {
        C82381f fVar = dVar.f329752i;
        return ((C91755a) fVar.mo109668l(C91755a.class)).mo124759Rb(((C91759b) fVar.mo109668l(C91759b.class)).mo115838nO(fVar, str), rect, new C107282a(this, aVar, dVar, str));
    }

    /* renamed from: Q4 */
    public Bitmap mo157760Q4(C110229d dVar, String str, C110230e.C110231a aVar) {
        return mo157759Ds(dVar, str, (Rect) null, aVar);
    }

    public Bitmap Zu0(C110229d dVar, String str) {
        return mo157759Ds(dVar, str, (Rect) null, (C110230e.C110231a) null);
    }
}
