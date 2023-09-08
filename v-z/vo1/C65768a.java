package vo1;

import androidx.lifecycle.C39622i0;
import bp1.C54515a;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import yo1.C66688d;

/* renamed from: vo1.a */
public final class C65768a {

    /* renamed from: a */
    public final C45795b f189181a;

    /* renamed from: b */
    public final C66688d f189182b;

    /* renamed from: c */
    public final C65769a f189183c;

    /* renamed from: vo1.a$a */
    public interface C65769a {
        /* renamed from: a */
        void mo13968a(int i);
    }

    public C65768a(C45795b bVar, int i, boolean z, C66688d dVar, C65769a aVar) {
        this.f189181a = bVar;
        this.f189182b = dVar;
        this.f189183c = aVar;
        C54515a aVar2 = (C54515a) mo89803a(C54515a.class);
        if (aVar2 != null) {
            aVar2.f152831s = i;
            aVar2.f152827o = z;
            Log.m105924i("LiveMsgOffsetSlice", "init scene:" + i + ", enableBulletMsg:" + z);
        }
    }

    /* renamed from: a */
    public final <T extends C39622i0> T mo89803a(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        C45795b bVar = this.f189181a;
        if (bVar != null) {
            return bVar.mo71262a(cls);
        }
        return null;
    }
}
