package p14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import java.util.Map;
import l14.C24951b;
import my3.C61593h;
import my3.C61595o;
import n14.C25207d;
import n14.C25217e;
import o14.C25346c;
import o14.C25348d;
import o14.C25350f;
import sx3.C90364q0;

/* renamed from: p14.z */
public abstract class C25465z<Key, Value, Collection, Builder extends Map<Key, Value>> extends C25419a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a */
    public final C24951b<Key> f72080a;

    /* renamed from: b */
    public final C24951b<Value> f72081b;

    public C25465z(C24951b bVar, C24951b bVar2, C8480h hVar) {
        super((C8480h) null);
        this.f72080a = bVar;
        this.f72081b = bVar2;
    }

    /* renamed from: a */
    public abstract C25217e mo51996a();

    /* renamed from: b */
    public void mo51999b(C25350f fVar, Collection collection) {
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        C25348d m = fVar.mo52530m(mo51996a(), mo52653j(collection));
        Iterator i = mo52652i(collection);
        int i2 = 0;
        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i3 = i2 + 1;
            m.mo52505q(mo51996a(), i2, this.f72080a, key);
            m.mo52505q(mo51996a(), i3, this.f72081b, value);
            i2 = i3 + 1;
        }
        m.mo52513a(mo51996a());
    }

    /* renamed from: k */
    public void mo52654k(C25346c cVar, Object obj, int i, int i2) {
        Map map = (Map) obj;
        C87412m.m108594g(cVar, "decoder");
        C87412m.m108594g(map, "builder");
        if (i2 >= 0) {
            C61593h h = C61595o.m72300h(C61595o.m72301i(0, i2 * 2), 2);
            int i3 = h.f175174d;
            int i4 = h.f175175e;
            int i5 = h.f175176f;
            if (i5 >= 0) {
                if (i3 > i4) {
                    return;
                }
            } else if (i3 < i4) {
                return;
            }
            while (true) {
                mo52655l(cVar, i + i3, map, false);
                if (i3 != i4) {
                    i3 += i5;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
    }

    /* renamed from: n */
    public final void mo52655l(C25346c cVar, int i, Builder builder, boolean z) {
        int i2;
        Value value;
        C87412m.m108594g(cVar, "decoder");
        C87412m.m108594g(builder, "builder");
        Object a = C25346c.C25347a.m32441a(cVar, mo51996a(), i, this.f72080a, (Object) null, 8, (Object) null);
        boolean z2 = true;
        if (z) {
            i2 = cVar.mo52510e(mo51996a());
            if (i2 != i + 1) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i + ", returned index for value: " + i2).toString());
            }
        } else {
            i2 = i + 1;
        }
        int i3 = i2;
        if (!builder.containsKey(a) || (this.f72081b.mo51996a().mo52323f() instanceof C25207d)) {
            value = C25346c.C25347a.m32441a(cVar, mo51996a(), i3, this.f72081b, (Object) null, 8, (Object) null);
        } else {
            value = cVar.mo52495q(mo51996a(), i3, this.f72081b, C90364q0.m113145d(builder, a));
        }
        builder.put(a, value);
    }
}
