package fq1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout;
import com.tencent.p014mm.plugin.finder.video.FinderRecordPluginLayout;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoFullScreenPluginLayout;
import com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.scene.TimelineEditorFollowMusicPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import ht1.C60206u1;
import so1.C36752a;
import y90.C38980b;

/* renamed from: fq1.b */
public final class C97947b {

    /* renamed from: a */
    public static final C97947b f287286a = new C97947b();

    /* renamed from: a */
    public final RecordConfigProvider mo137257a() {
        Log.m105924i("Finder.FinderVideoEditorConfig", "getAlbumProvider");
        UICustomParam.C92617b bVar = new UICustomParam.C92617b();
        bVar.mo126651e(true);
        bVar.mo126653g(true);
        bVar.mo126649c(false);
        bVar.mo126648b(true);
        bVar.mo126655i(C0966R.C0969drawable.f4653j6, 0, "", 0);
        RecordConfigProvider d = RecordConfigProvider.m119434d("", "");
        d.f272905F = 11;
        d.f272927o = bVar.f266587a;
        VideoTransPara tD = ((C60206u1) C86312j.m106911c(C60206u1.class)).mo60955tD();
        d.f272926n = tD;
        d.f272929q = 3;
        d.f272935w = tD.f267170h * 1000;
        bVar.mo126654h(false);
        mo137258b(d, false);
        return d;
    }

    /* renamed from: b */
    public final void mo137258b(RecordConfigProvider recordConfigProvider, boolean z) {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_finder_use_timeline_editor, true);
        Log.m105924i("Finder.FinderVideoEditorConfig", "useTimelineEditor: " + wf);
        if (wf) {
            recordConfigProvider.mo129804a(4, TimelineEditorFollowMusicPluginLayout.class.getName());
        } else {
            recordConfigProvider.mo129804a(4, MultiVideoFullScreenPluginLayout.class.getName());
        }
        recordConfigProvider.mo129804a(3, MultiVideoFullScreenPluginLayout.class.getName());
        recordConfigProvider.mo129804a(1, MultiVideoFullScreenPluginLayout.class.getName());
        recordConfigProvider.mo129804a(0, FinderRecordPluginLayout.class.getName());
        if (z) {
            String str = C36752a.f97621a;
            if (C38980b.f105023a.mo61860a()) {
                recordConfigProvider.mo129804a(0, FinderRecordTemplatePluginLayout.class.getName());
            } else {
                recordConfigProvider.mo129804a(0, FinderRecordPluginLayout.class.getName());
            }
        }
    }
}
