package ki3;

import com.tencent.p014mm.timelineedit.TimelineEditor;
import fy3.C32224a;
import gy3.C87413o;
import li3.C109388f;

/* renamed from: ki3.g */
public final class C109016g extends C87413o implements C32224a<byte[]> {

    /* renamed from: d */
    public final /* synthetic */ TimelineEditor f326516d;

    /* renamed from: e */
    public final /* synthetic */ C109388f f326517e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109016g(TimelineEditor timelineEditor, C109388f fVar) {
        super(0);
        this.f326516d = timelineEditor;
        this.f326517e = fVar;
    }

    public Object invoke() {
        TimelineEditor timelineEditor = this.f326516d;
        return timelineEditor.nRemoveTrack(timelineEditor.f318620a, this.f326517e.mo160584b());
    }
}
