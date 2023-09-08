package ki3;

import com.tencent.p014mm.timelineedit.TimelineEditor;
import fy3.C32224a;
import gy3.C87413o;
import li3.C109386b;

/* renamed from: ki3.o */
public final class C109024o extends C87413o implements C32224a<byte[]> {

    /* renamed from: d */
    public final /* synthetic */ TimelineEditor f326528d;

    /* renamed from: e */
    public final /* synthetic */ C109386b f326529e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109024o(TimelineEditor timelineEditor, C109386b bVar) {
        super(0);
        this.f326528d = timelineEditor;
        this.f326529e = bVar;
    }

    public Object invoke() {
        TimelineEditor timelineEditor = this.f326528d;
        return timelineEditor.nUpdateConfig(timelineEditor.f318620a, this.f326529e.mo160584b());
    }
}
