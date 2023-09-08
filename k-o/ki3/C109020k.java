package ki3;

import com.tencent.p014mm.timelineedit.TimelineEditor;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: ki3.k */
public final class C109020k extends C87413o implements C32224a<byte[]> {

    /* renamed from: d */
    public final /* synthetic */ TimelineEditor f326522d;

    /* renamed from: e */
    public final /* synthetic */ boolean f326523e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109020k(TimelineEditor timelineEditor, boolean z) {
        super(0);
        this.f326522d = timelineEditor;
        this.f326523e = z;
    }

    public Object invoke() {
        TimelineEditor timelineEditor = this.f326522d;
        return timelineEditor.nRestore(timelineEditor.f318620a, this.f326523e);
    }
}
