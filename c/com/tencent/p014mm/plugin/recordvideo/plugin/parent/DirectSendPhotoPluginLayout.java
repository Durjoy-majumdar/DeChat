package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import gy3.C87412m;
import h90.C98324b;
import kotlin.Metadata;
import th2.C110992d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/DirectSendPhotoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditPhotoPluginLayout;", "Lqh2/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.DirectSendPhotoPluginLayout */
public final class DirectSendPhotoPluginLayout extends EditPhotoPluginLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectSendPhotoPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        if (bVar != null) {
            Boolean bool = Boolean.TRUE;
            CaptureDataManager.f272890c.mo129794a(getContext(), new CaptureDataManager.CaptureVideoNormalModel(bool, "", bVar.f288189j, 0L, bool, C110992d.f332425a.mo162676j()));
        }
    }
}
