package ki3;

import com.tencent.p014mm.timelineedit.TimelineEditor;
import fy3.C32224a;
import gy3.C87413o;
import li3.C109389g;

/* renamed from: ki3.m */
public final class C109022m extends C87413o implements C32224a<byte[]> {

    /* renamed from: d */
    public final /* synthetic */ TimelineEditor f326525d;

    /* renamed from: e */
    public final /* synthetic */ C109389g f326526e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109022m(TimelineEditor timelineEditor, C109389g gVar) {
        super(0);
        this.f326525d = timelineEditor;
        this.f326526e = gVar;
    }

    public Object invoke() {
        TimelineEditor timelineEditor = this.f326525d;
        long j = timelineEditor.f318620a;
        C109389g gVar = this.f326526e;
        String str = gVar.f327468e;
        byte[] b = gVar.f327464a.mo160584b();
        byte[] b2 = this.f326526e.f327465b.mo160584b();
        C109389g gVar2 = this.f326526e;
        return timelineEditor.nSetTransition(j, str, b, b2, gVar2.f327466c.f330969c, gVar2.f327467d);
    }
}
