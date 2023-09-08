package com.tencent.p014mm.plugin.gallery.picker.manager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gallery/picker/manager/SpeedGirdLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "plugin-gallery_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.gallery.picker.manager.SpeedGirdLayoutManager */
public final class SpeedGirdLayoutManager extends GridLayoutManager {

    /* renamed from: D */
    public float f162777D = 1.0f;

    public SpeedGirdLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        super.onLayoutChildren(rVar, wVar);
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        return (int) (((float) super.scrollVerticallyBy(i, rVar, wVar)) * this.f162777D);
    }

    public SpeedGirdLayoutManager(Context context, int i) {
        super(context, i);
    }
}
