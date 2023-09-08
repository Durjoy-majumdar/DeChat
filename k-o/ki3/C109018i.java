package ki3;

import com.tencent.p014mm.timelineedit.TimelineEditor;
import fy3.C32224a;
import gy3.C87413o;
import li3.C109388f;

/* renamed from: ki3.i */
public final class C109018i extends C87413o implements C32224a<byte[]> {

    /* renamed from: d */
    public final /* synthetic */ TimelineEditor f326519d;

    /* renamed from: e */
    public final /* synthetic */ C109388f f326520e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109018i(TimelineEditor timelineEditor, C109388f fVar) {
        super(0);
        this.f326519d = timelineEditor;
        this.f326520e = fVar;
    }

    public Object invoke() {
        TimelineEditor timelineEditor = this.f326519d;
        return timelineEditor.nRemoveTransition(timelineEditor.f318620a, this.f326520e.mo160584b());
    }
}
