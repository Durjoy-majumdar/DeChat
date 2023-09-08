package p14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import l14.C24951b;
import l14.C88369e;
import n14.C25217e;
import o14.C25346c;
import o14.C25348d;
import o14.C25349e;
import o14.C25350f;
import p14.C25461x;

/* renamed from: p14.p */
public abstract class C25453p<K, V, R> implements C24951b<R> {

    /* renamed from: a */
    public final C24951b<K> f72062a;

    /* renamed from: b */
    public final C24951b<V> f72063b;

    public C25453p(C24951b bVar, C24951b bVar2, C8480h hVar) {
        this.f72062a = bVar;
        this.f72063b = bVar2;
    }

    /* renamed from: b */
    public void mo51999b(C25350f fVar, R r) {
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        C25461x xVar = (C25461x) this;
        C25348d b = fVar.mo52523b(xVar.f72071c);
        C25217e eVar = xVar.f72071c;
        C24951b<K> bVar = this.f72062a;
        Map.Entry entry = (Map.Entry) r;
        C87412m.m108594g(entry, "$this$key");
        b.mo52505q(eVar, 0, bVar, entry.getKey());
        C25217e eVar2 = xVar.f72071c;
        C24951b<V> bVar2 = this.f72063b;
        C87412m.m108594g(entry, "$this$value");
        b.mo52505q(eVar2, 1, bVar2, entry.getValue());
        b.mo52513a(xVar.f72071c);
    }

    /* renamed from: d */
    public R mo51997d(C25349e eVar) {
        C87412m.m108594g(eVar, "decoder");
        C25461x xVar = (C25461x) this;
        C25346c b = eVar.mo52515b(xVar.f72071c);
        if (b.mo52512m()) {
            return new C25461x.C25463a(C25346c.C25347a.m32441a(b, xVar.f72071c, 0, this.f72062a, (Object) null, 8, (Object) null), C25346c.C25347a.m32441a(b, xVar.f72071c, 1, this.f72063b, (Object) null, 8, (Object) null));
        }
        Object obj = C25449m0.f72056a;
        Object obj2 = obj;
        while (true) {
            int e = b.mo52510e(xVar.f72071c);
            if (e == -1) {
                b.mo52508a(xVar.f72071c);
                Object obj3 = C25449m0.f72056a;
                if (obj == obj3) {
                    throw new C88369e("Element 'key' is missing");
                } else if (obj2 != obj3) {
                    return new C25461x.C25463a(obj, obj2);
                } else {
                    throw new C88369e("Element 'value' is missing");
                }
            } else if (e == 0) {
                obj = C25346c.C25347a.m32441a(b, xVar.f72071c, 0, this.f72062a, (Object) null, 8, (Object) null);
            } else if (e == 1) {
                obj2 = C25346c.C25347a.m32441a(b, xVar.f72071c, 1, this.f72063b, (Object) null, 8, (Object) null);
            } else {
                throw new C88369e("Invalid index: " + e);
            }
        }
    }
}
