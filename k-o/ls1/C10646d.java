package ls1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;

/* renamed from: ls1.d */
public class C10646d extends C10647i {

    /* renamed from: j */
    public View f32057j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10646d(CharSequence charSequence) {
        super(charSequence);
        C87412m.m108594g(charSequence, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
    }

    /* renamed from: c */
    public void mo3854c(ViewGroup viewGroup) {
        super.mo3854c(viewGroup);
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            this.f32057j = (View) parent;
            viewGroup.setTag(this);
        }
    }

    /* renamed from: l */
    public View mo10903l() {
        return null;
    }

    /* renamed from: m */
    public View mo10904m() {
        return this.f32064i;
    }

    /* renamed from: n */
    public int[] mo10704n() {
        return new int[]{0, 0};
    }

    /* renamed from: o */
    public View mo10905o() {
        return this.f32064i;
    }

    public C10646d(int i) {
        super(i);
    }
}
