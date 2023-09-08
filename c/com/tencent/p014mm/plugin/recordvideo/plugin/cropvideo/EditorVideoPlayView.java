package com.tencent.p014mm.plugin.recordvideo.plugin.cropvideo;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/cropvideo/EditorVideoPlayView;", "Lcom/tencent/mm/pluginsdk/ui/tools/VideoPlayerTextureView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditorVideoPlayView */
public class EditorVideoPlayView extends VideoPlayerTextureView {
    public EditorVideoPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: G */
    public void mo150035G(SurfaceTexture surfaceTexture) {
        super.mo150035G(surfaceTexture);
        C96875r0.C96876a aVar = this.f318496w;
        if (aVar != null) {
            aVar.mo76207M0(getCurrentPosition(), getDuration());
        }
    }

    public EditorVideoPlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public EditorVideoPlayView(Context context) {
        super(context, (AttributeSet) null);
    }
}
