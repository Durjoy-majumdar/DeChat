package wh2;

import android.view.View;
import com.tencent.p014mm.plugin.recordvideo.p095ui.WxCropOperationLayout;

/* renamed from: wh2.c */
public final class C111811c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f334793d;

    /* renamed from: e */
    public final /* synthetic */ View f334794e;

    /* renamed from: f */
    public final /* synthetic */ WxCropOperationLayout f334795f;

    /* renamed from: g */
    public final /* synthetic */ float f334796g;

    /* renamed from: h */
    public final /* synthetic */ View f334797h;

    public C111811c(int i, View view, WxCropOperationLayout wxCropOperationLayout, float f, View view2) {
        this.f334793d = i;
        this.f334794e = view;
        this.f334795f = wxCropOperationLayout;
        this.f334796g = f;
        this.f334797h = view2;
    }

    public final void run() {
        int i = this.f334793d;
        if (i == 0) {
            this.f334794e.setTranslationY(this.f334795f.getBoxRect().top + this.f334796g);
            this.f334794e.setTranslationX(this.f334795f.getBoxRect().left + this.f334796g);
        } else if (i == 1) {
            this.f334794e.setTranslationY(this.f334795f.getBoxRect().top + this.f334796g);
            this.f334794e.setTranslationX((this.f334795f.getBoxRect().right - this.f334796g) - ((float) this.f334794e.getWidth()));
        } else if (i == 2) {
            this.f334794e.setTranslationY((this.f334795f.getBoxRect().bottom - this.f334796g) - ((float) this.f334797h.getHeight()));
            this.f334794e.setTranslationX(this.f334795f.getBoxRect().left + this.f334796g);
        } else if (i == 3) {
            this.f334794e.setTranslationY((this.f334795f.getBoxRect().bottom - this.f334796g) - ((float) this.f334797h.getHeight()));
            this.f334794e.setTranslationX((this.f334795f.getBoxRect().right - this.f334796g) - ((float) this.f334794e.getWidth()));
        } else if (i == 4) {
            this.f334794e.setTranslationY((this.f334795f.getBoxRect().top - this.f334796g) - ((float) this.f334797h.getHeight()));
            this.f334794e.setTranslationX(this.f334795f.getBoxRect().left + this.f334796g);
        } else if (i == 5) {
            this.f334794e.setTranslationY((this.f334795f.getBoxRect().top - this.f334796g) - ((float) this.f334797h.getHeight()));
            this.f334794e.setTranslationX((this.f334795f.getBoxRect().right - this.f334796g) - ((float) this.f334794e.getWidth()));
        } else if (i == 6) {
            this.f334794e.setTranslationY(this.f334795f.getBoxRect().bottom + this.f334796g);
            this.f334794e.setTranslationX(this.f334795f.getBoxRect().left + this.f334796g);
        } else if (i == 7) {
            this.f334794e.setTranslationY(this.f334795f.getBoxRect().bottom + this.f334796g);
            this.f334794e.setTranslationX((this.f334795f.getBoxRect().right - this.f334796g) - ((float) this.f334794e.getWidth()));
        }
    }
}
