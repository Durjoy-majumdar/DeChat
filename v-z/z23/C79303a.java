package z23;

import android.view.GestureDetector;
import com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.view.TimelineEditorDragRectView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: z23.a */
public final class C79303a extends C87413o implements C32224a<GestureDetector> {

    /* renamed from: d */
    public final /* synthetic */ TimelineEditorDragRectView f232816d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79303a(TimelineEditorDragRectView timelineEditorDragRectView) {
        super(0);
        this.f232816d = timelineEditorDragRectView;
    }

    public Object invoke() {
        return new GestureDetector(this.f232816d.getContext(), this.f232816d);
    }
}
