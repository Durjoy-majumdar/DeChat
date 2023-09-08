package com.tencent.p014mm.plugin.finder.edit;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.p095ui.WxCropOperationLayout;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout;
import gy3.C87412m;
import h90.C98324b;
import kotlin.Metadata;
import me3.C109612c;
import me3.C109623f;
import wg2.C102440a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/edit/FinderPhotoEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditPhotoPluginLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.edit.FinderPhotoEditPluginLayout */
public final class FinderPhotoEditPluginLayout extends EditPhotoPluginLayout {

    /* renamed from: w */
    public final WxCropOperationLayout f312708w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderPhotoEditPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        WxCropOperationLayout wxCropOperationLayout = new WxCropOperationLayout(context);
        this.f312708w = wxCropOperationLayout;
        wxCropOperationLayout.setStyle(WxCropOperationLayout.C94436h.RECT_HARD);
        ((ViewGroup) findViewById(C0966R.C0970id.f358925hw2)).addView(wxCropOperationLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        Rect rect;
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        super.mo128671k(aVar, recordConfigProvider);
        Bundle bundle = recordConfigProvider.f272912M;
        if (bundle != null && (rect = (Rect) bundle.getParcelable("cropRect")) != null) {
            this.f312708w.getVisibilityRect().set(rect);
        }
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        super.mo129855l(bVar);
        C109623f fVar = getEditPhotoWrapper().f327415o;
        if (fVar != null) {
            ((C109612c) fVar).f328165h = false;
        }
        this.f312708w.bringToFront();
    }
}
