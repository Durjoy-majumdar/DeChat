package p14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import l14.C24951b;
import n14.C25217e;
import o14.C25346c;
import o14.C25348d;
import o14.C25350f;

/* renamed from: p14.v */
public abstract class C25459v<Element, Collection, Builder> extends C25419a<Element, Collection, Builder> {

    /* renamed from: a */
    public final C24951b<Element> f72068a;

    public C25459v(C24951b bVar, C8480h hVar) {
        super((C8480h) null);
        this.f72068a = bVar;
    }

    /* renamed from: a */
    public abstract C25217e mo51996a();

    /* renamed from: b */
    public void mo51999b(C25350f fVar, Collection collection) {
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_ENCODER);
        int j = mo52653j(collection);
        C25348d m = fVar.mo52530m(mo51996a(), j);
        Iterator i = mo52652i(collection);
        for (int i2 = 0; i2 < j; i2++) {
            m.mo52505q(mo51996a(), i2, this.f72068a, i.next());
        }
        m.mo52513a(mo51996a());
    }

    /* renamed from: k */
    public final void mo52654k(C25346c cVar, Builder builder, int i, int i2) {
        C87412m.m108594g(cVar, "decoder");
        if (i2 >= 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                mo52655l(cVar, i + i3, builder, false);
            }
            return;
        }
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
    }

    /* renamed from: l */
    public void mo52655l(C25346c cVar, int i, Builder builder, boolean z) {
        C87412m.m108594g(cVar, "decoder");
        mo52663n(builder, i, C25346c.C25347a.m32441a(cVar, mo51996a(), i, this.f72068a, (Object) null, 8, (Object) null));
    }

    /* renamed from: n */
    public abstract void mo52663n(Builder builder, int i, Element element);
}
