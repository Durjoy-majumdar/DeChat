package com.tencent.p014mm.plugin.story.p108ui.view.gallery;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoPlayTextureView;", "Lcom/tencent/mm/pluginsdk/ui/tools/VideoPlayerTextureView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoPlayTextureView */
public final class StoryVideoPlayTextureView extends VideoPlayerTextureView {
    public StoryVideoPlayTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(C96814a.C96817e.COVER);
    }

    /* renamed from: G */
    public void mo150035G(SurfaceTexture surfaceTexture) {
        super.mo150035G(surfaceTexture);
        this.f318496w.mo76207M0(getCurrentPosition(), getDuration());
    }

    /* renamed from: d */
    public void mo24788d(double d) {
        if (this.f318490q) {
            mo24787a(d, true);
            return;
        }
        String str = this.f318484h;
        Log.printInfoStack(str, hashCode() + " error seekTo " + this.f318490q + ' ', new Object[0]);
    }

    public void onMeasure(int i, int i2) {
        C96814a.C96817e eVar = C96814a.C96817e.DEFAULT;
        setScaleType(C96814a.C96817e.COVER);
        int i3 = this.f318489p;
        if (i3 == 90 || i3 == 270) {
            if (this.f318487n > this.f318488o) {
                this.f318483J.mo153324d(eVar);
            }
        } else if (this.f318488o > this.f318487n) {
            this.f318483J.mo153324d(eVar);
        }
        super.onMeasure(i, i2);
    }

    public StoryVideoPlayTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(C96814a.C96817e.COVER);
    }

    public StoryVideoPlayTextureView(Context context) {
        super(context, (AttributeSet) null);
        setScaleType(C96814a.C96817e.COVER);
    }
}
