package ki3;

import com.tencent.p014mm.timelineedit.TimelineEditor;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: ki3.e */
public final class C109014e extends C87413o implements C32224a<byte[]> {

    /* renamed from: d */
    public final /* synthetic */ TimelineEditor f326513d;

    /* renamed from: e */
    public final /* synthetic */ long f326514e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109014e(TimelineEditor timelineEditor, long j) {
        super(0);
        this.f326513d = timelineEditor;
        this.f326514e = j;
    }

    public Object invoke() {
        TimelineEditor timelineEditor = this.f326513d;
        return timelineEditor.nGetSingleFullRangeComposition(timelineEditor.f318620a, this.f326514e);
    }
}
