package com.tencent.p014mm.plugin.vlog.p117ui.video;

import a14.C53973z1;
import a33.C91950d;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import com.tencent.tav.player.Player;
import gy3.C87412m;
import h90.C98324b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import wp3.C111829g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/video/FinderLiveVideoCompositionPluginLayout;", "Lcom/tencent/mm/plugin/vlog/ui/video/EditorVideoCompositionPluginLayout;", "Lqh2/e;", "", "getMuteOrigin", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.video.FinderLiveVideoCompositionPluginLayout */
public final class FinderLiveVideoCompositionPluginLayout extends EditorVideoCompositionPluginLayout {

    /* renamed from: J */
    public boolean f316983J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveVideoCompositionPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public boolean getMuteOrigin() {
        return this.f316983J;
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        Bundle bundle;
        RecordConfigProvider configProvider = getConfigProvider();
        boolean z = false;
        if (!(configProvider == null || (bundle = configProvider.f272912M) == null)) {
            z = bundle.getBoolean("key_mute_video", false);
        }
        this.f316983J = z;
        super.mo129855l(bVar);
    }

    /* renamed from: n */
    public void mo134645n() {
        Log.m105924i("MicroMsg.FinderLiveVideoCompositionPluginLayout", "afterDetach");
        C53973z1 previewJob = getPreviewJob();
        if (previewJob != null) {
            C53973z1.C53974a.m60623a(previewJob, (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: o */
    public void mo134646o() {
        C111829g gVar;
        Player player;
        Log.m105924i("MicroMsg.FinderLiveVideoCompositionPluginLayout", "afterPreviewInit >> " + this.f316983J);
        C91950d previewNewPlugin = getPreviewNewPlugin();
        boolean z = this.f316983J;
        VideoCompositionPlayView videoCompositionPlayView = previewNewPlugin.f263236d;
        if (videoCompositionPlayView != null && (gVar = videoCompositionPlayView.f319838d) != null && (player = gVar.f334836a) != null) {
            player.setVolume(z ? 0.0f : 1.0f);
        }
    }
}
