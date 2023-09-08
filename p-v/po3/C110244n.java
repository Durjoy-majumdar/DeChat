package po3;

import com.tencent.p014mm.p136ui.widget.cropview.DragExitCropLayout;
import gy3.C59741c0;

/* renamed from: po3.n */
public final class C110244n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ DragExitCropLayout f329773d;

    /* renamed from: e */
    public final /* synthetic */ C59741c0 f329774e;

    /* renamed from: f */
    public final /* synthetic */ float f329775f;

    /* renamed from: g */
    public final /* synthetic */ float f329776g;

    public C110244n(DragExitCropLayout dragExitCropLayout, C59741c0 c0Var, float f, float f2) {
        this.f329773d = dragExitCropLayout;
        this.f329774e = c0Var;
        this.f329775f = f;
        this.f329776g = f2;
    }

    public final void run() {
        DragExitCropLayout dragExitCropLayout = this.f329773d;
        dragExitCropLayout.mo154435A(this.f329774e.f170634d, dragExitCropLayout.getContentViewScale()[0], this.f329775f, this.f329776g);
    }
}
