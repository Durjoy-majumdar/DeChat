package ki3;

import com.tencent.p014mm.timelineedit.TimelineEditor;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: ki3.c */
public final class C109012c extends C87413o implements C32224a<byte[]> {

    /* renamed from: d */
    public final /* synthetic */ TimelineEditor f326511d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109012c(TimelineEditor timelineEditor) {
        super(0);
        this.f326511d = timelineEditor;
    }

    public Object invoke() {
        TimelineEditor timelineEditor = this.f326511d;
        return timelineEditor.nGetNoTransitionComposition(timelineEditor.f318620a);
    }
}
