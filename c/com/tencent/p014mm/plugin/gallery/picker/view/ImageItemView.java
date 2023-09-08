package com.tencent.p014mm.plugin.gallery.picker.view;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$ImageMediaItem;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gallery/picker/view/ImageItemView;", "Lcom/tencent/mm/plugin/gallery/picker/view/MediaItemView;", "Lcom/tencent/mm/plugin/gallery/model/GalleryItem$ImageMediaItem;", "", "getLayoutId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.gallery.picker.view.ImageItemView */
public final class ImageItemView extends MediaItemView<GalleryItem$ImageMediaItem> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359924bn0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
