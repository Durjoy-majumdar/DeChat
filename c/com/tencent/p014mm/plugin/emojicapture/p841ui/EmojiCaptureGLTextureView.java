package com.tencent.p014mm.plugin.emojicapture.p841ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView;
import gy3.C87412m;
import j71.C108592j;
import kotlin.Metadata;
import p80.C110194c;
import s80.C110777a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u001d\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureGLTextureView;", "Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraPreviewGLTextureView;", "Lp80/c;", "getPreviewTexture", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureGLTextureView */
public final class EmojiCaptureGLTextureView extends CameraPreviewGLTextureView {
    public EmojiCaptureGLTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C110194c getPreviewTexture() {
        if (!(getRenderer() instanceof C108592j)) {
            return super.getPreviewTexture();
        }
        C110777a renderer = getRenderer();
        C87412m.m108592e(renderer, "null cannot be cast to non-null type com.tencent.mm.plugin.emojicapture.ui.gl.EmojiCapturePreviewRenderer");
        return ((C108592j) renderer).mo159587b();
    }

    public EmojiCaptureGLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EmojiCaptureGLTextureView(Context context) {
        super(context);
    }
}
