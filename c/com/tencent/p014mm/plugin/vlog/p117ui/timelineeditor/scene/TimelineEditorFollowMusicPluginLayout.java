package com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.scene;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j23.C108531a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wg2.C102440a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00028BX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/timelineeditor/scene/TimelineEditorFollowMusicPluginLayout;", "Lcom/tencent/mm/plugin/vlog/ui/timelineeditor/scene/TimelineEditorPlatformVideoPluginLayout;", "Lj23/a;", "x", "Lrx3/g;", "getMusicPlugin", "()Lj23/a;", "musicPlugin", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorFollowMusicPluginLayout */
public final class TimelineEditorFollowMusicPluginLayout extends TimelineEditorPlatformVideoPluginLayout {

    /* renamed from: x */
    public final C13601g f316978x = C36568h.m40985a(new C106291a(this));

    /* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorFollowMusicPluginLayout$a */
    public static final class C106291a extends C87413o implements C32224a<C108531a> {

        /* renamed from: d */
        public final /* synthetic */ TimelineEditorFollowMusicPluginLayout f316979d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106291a(TimelineEditorFollowMusicPluginLayout timelineEditorFollowMusicPluginLayout) {
            super(0);
            this.f316979d = timelineEditorFollowMusicPluginLayout;
        }

        public Object invoke() {
            return (C108531a) this.f316979d.mo151221j(C108531a.class);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimelineEditorFollowMusicPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    private final C108531a getMusicPlugin() {
        return (C108531a) ((C36570n) this.f316978x).getValue();
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        super.mo128671k(aVar, recordConfigProvider);
        Log.m105924i("MicroMsg.TimelineEditorFollowMusicPluginLayout", "init logic " + recordConfigProvider);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0019, code lost:
        r2 = r9.f288193n;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo129855l(h90.C98324b r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "loadCurrentPage:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.TimelineEditorFollowMusicPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 0
            if (r9 == 0) goto L_0x0024
            android.os.Bundle r2 = r9.f288193n
            if (r2 == 0) goto L_0x0024
            java.lang.String r3 = "KEY_ORIGIN_MUSIC_PATH"
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0025
        L_0x0024:
            r2 = r0
        L_0x0025:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r4 = 0
            if (r3 != 0) goto L_0x00aa
            if (r9 == 0) goto L_0x003a
            android.os.Bundle r3 = r9.f288193n
            if (r3 == 0) goto L_0x003a
            java.lang.String r5 = "KEY_ORIGIN_MUSIC_NAME"
            java.lang.String r3 = r3.getString(r5)
            if (r3 != 0) goto L_0x003c
        L_0x003a:
            java.lang.String r3 = ""
        L_0x003c:
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r5 = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo
            r5.<init>()
            long r6 = java.lang.System.currentTimeMillis()
            int r7 = (int) r6
            r5.f163813e = r7
            if (r9 == 0) goto L_0x0055
            android.os.Bundle r6 = r9.f288193n
            if (r6 == 0) goto L_0x0055
            java.lang.String r7 = "KEY_BGM_IF_ORIGIN"
            boolean r6 = r6.getBoolean(r7)
            goto L_0x0056
        L_0x0055:
            r6 = 0
        L_0x0056:
            r7 = 1
            if (r6 == 0) goto L_0x005b
            r6 = 1
            goto L_0x005c
        L_0x005b:
            r6 = 2
        L_0x005c:
            r5.f163821p = r6
            r5.f163818j = r7
            r5.f163824s = r7
            r5.f163817i = r2
            r5.f163825t = r3
            long r2 = r8.getMaxCropVideoDurationMs()
            int r3 = (int) r2
            r5.f163822q = r3
            j23.a r2 = r8.getMusicPlugin()
            if (r2 == 0) goto L_0x007a
            java.util.List r3 = sx3.C26236u.m33719b(r5)
            r2.mo159387G(r3)
        L_0x007a:
            if (r9 == 0) goto L_0x0087
            android.os.Bundle r2 = r9.f288193n
            if (r2 == 0) goto L_0x0087
            java.lang.String r3 = "KEY_DISABLE_ADD_MUSIC"
            boolean r2 = r2.getBoolean(r3)
            goto L_0x0088
        L_0x0087:
            r2 = 0
        L_0x0088:
            j23.a r3 = r8.getMusicPlugin()
            if (r3 == 0) goto L_0x0095
            r2 = r2 ^ r7
            boolean r6 = r3.f324885t
            if (r6 == r2) goto L_0x0095
            r3.f324885t = r2
        L_0x0095:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "initFollowMusicLogic audioInfo1:"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x00dd
        L_0x00aa:
            if (r9 == 0) goto L_0x00b9
            android.os.Bundle r2 = r9.f288193n
            if (r2 == 0) goto L_0x00b9
            java.lang.String r3 = "KEY_SELECT_AUDIO_INFO"
            android.os.Parcelable r2 = r2.getParcelable(r3)
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r2 = (com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo) r2
            goto L_0x00ba
        L_0x00b9:
            r2 = r0
        L_0x00ba:
            if (r2 == 0) goto L_0x00c9
            j23.a r3 = r8.getMusicPlugin()
            if (r3 == 0) goto L_0x00c9
            java.util.List r5 = sx3.C26236u.m33719b(r2)
            r3.mo159387G(r5)
        L_0x00c9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "initFollowMusicLogic audioInfo2:"
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
        L_0x00dd:
            if (r9 == 0) goto L_0x00e9
            android.os.Bundle r1 = r9.f288193n
            if (r1 == 0) goto L_0x00e9
            java.lang.String r2 = "KEY_MEDIA_MUTE"
            boolean r4 = r1.getBoolean(r2, r4)
        L_0x00e9:
            r8.setMediaMute(r4)
            super.mo129855l(r9)
            android.content.Context r9 = r8.getContext()
            boolean r1 = r9 instanceof android.app.Activity
            if (r1 == 0) goto L_0x00fa
            android.app.Activity r9 = (android.app.Activity) r9
            goto L_0x00fb
        L_0x00fa:
            r9 = r0
        L_0x00fb:
            if (r9 == 0) goto L_0x0147
            android.content.Intent r1 = r9.getIntent()
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r8.getConfigProvider()
            if (r2 == 0) goto L_0x0112
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo r2 = r2.f272908I
            if (r2 == 0) goto L_0x0112
            long r2 = r2.f272944h
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0113
        L_0x0112:
            r2 = r0
        L_0x0113:
            java.lang.String r3 = "key_ref_feed_id"
            r1.putExtra(r3, r2)
            android.content.Intent r9 = r9.getIntent()
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r8.getConfigProvider()
            if (r1 == 0) goto L_0x012c
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo r1 = r1.f272908I
            if (r1 == 0) goto L_0x012c
            int r0 = r1.f272943g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x012c:
            java.lang.String r1 = "key_ref_comment_scene"
            r9.putExtra(r1, r0)
            java.lang.Class<ht1.e4> r9 = ht1.C60165e4.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ht1.e4 r9 = (ht1.C60165e4) r9
            android.content.Context r0 = r8.getContext()
            java.lang.String r1 = "context"
            gy3.C87412m.m108593f(r0, r1)
            r1 = 67
            r9.mo85160V8(r0, r1)
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.scene.TimelineEditorFollowMusicPluginLayout.mo129855l(h90.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004a, code lost:
        r5 = r5.f288193n;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14585p(qh2.C101198e.C101199b r8, android.os.Bundle r9) {
        /*
            r7 = this;
            java.lang.String r0 = "status"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "statusChange "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " param:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.TimelineEditorFollowMusicPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            qh2.e$b r0 = qh2.C101198e.C101199b.EDIT_FINISH
            if (r8 != r0) goto L_0x00fe
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r0 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r0 = r0.f272892b
            java.lang.String r1 = "SOUND_TRACK_TYPE"
            r2 = 0
            r0.putInt(r1, r2)
            j23.a r0 = r7.getMusicPlugin()
            r3 = 0
            if (r0 == 0) goto L_0x00ae
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r0 = r0.f324881p
            if (r0 == 0) goto L_0x00ae
            boolean r4 = r0.f163824s
            if (r4 == 0) goto L_0x0092
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r4 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r4 = r4.f272892b
            h90.b r5 = r7.getCaptureInfo()
            if (r5 == 0) goto L_0x0055
            android.os.Bundle r5 = r5.f288193n
            if (r5 == 0) goto L_0x0055
            java.lang.String r6 = "KEY_ORIGIN_MUSIC_ID"
            java.lang.String r5 = r5.getString(r6)
            goto L_0x0056
        L_0x0055:
            r5 = r3
        L_0x0056:
            java.lang.String r6 = "ORIGIN_MUSIC_ID"
            r4.putString(r6, r5)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r4 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r4 = r4.f272892b
            h90.b r5 = r7.getCaptureInfo()
            if (r5 == 0) goto L_0x0070
            android.os.Bundle r5 = r5.f288193n
            if (r5 == 0) goto L_0x0070
            java.lang.String r6 = "KEY_ORIGIN_MUSIC_PATH"
            java.lang.String r5 = r5.getString(r6)
            goto L_0x0071
        L_0x0070:
            r5 = r3
        L_0x0071:
            java.lang.String r6 = "ORIGIN_MUSIC_PATH"
            r4.putString(r6, r5)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r4 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r4 = r4.f272892b
            h90.b r5 = r7.getCaptureInfo()
            if (r5 == 0) goto L_0x008b
            android.os.Bundle r5 = r5.f288193n
            if (r5 == 0) goto L_0x008b
            java.lang.String r6 = "KEY_ORIGIN_MUSIC_INFO"
            byte[] r5 = r5.getByteArray(r6)
            goto L_0x008c
        L_0x008b:
            r5 = r3
        L_0x008c:
            java.lang.String r6 = "ORIGIN_MUSIC_INFO"
            r4.putByteArray(r6, r5)
            goto L_0x00a5
        L_0x0092:
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r0.f163830y
            if (r4 != 0) goto L_0x00a5
            te3.xt2 r4 = r0.f163812d
            byte[] r4 = r4.toByteArray()
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r5 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r5 = r5.f272892b
            java.lang.String r6 = "MEDIA_EXTRA_MUSIC"
            r5.putByteArray(r6, r4)
        L_0x00a5:
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r4 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r4 = r4.f272892b
            int r0 = r0.f163821p
            r4.putInt(r1, r0)
        L_0x00ae:
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r0 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r0 = r0.f272892b
            h90.b r1 = r7.getCaptureInfo()
            if (r1 == 0) goto L_0x00c2
            android.os.Bundle r1 = r1.f288193n
            if (r1 == 0) goto L_0x00c2
            java.lang.String r3 = "KEY_ORIGIN_BGM_URL"
            java.lang.String r3 = r1.getString(r3)
        L_0x00c2:
            java.lang.String r1 = "ORIGIN_BGM_URL"
            r0.putString(r1, r3)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r0 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r0 = r0.f272892b
            j23.a r1 = r7.getMusicPlugin()
            if (r1 == 0) goto L_0x00d6
            boolean r1 = r1.mo159392z()
            goto L_0x00d7
        L_0x00d6:
            r1 = 0
        L_0x00d7:
            r3 = 1
            if (r1 != 0) goto L_0x00e1
            boolean r1 = r7.f316955s
            if (r1 == 0) goto L_0x00df
            goto L_0x00e1
        L_0x00df:
            r1 = 0
            goto L_0x00e2
        L_0x00e1:
            r1 = 1
        L_0x00e2:
            java.lang.String r4 = "MEDIA_IS_MUTE"
            r0.putBoolean(r4, r1)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r0 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r0 = r0.f272892b
            j23.a r1 = r7.getMusicPlugin()
            if (r1 == 0) goto L_0x00f9
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView r1 = r1.f324878j
            boolean r1 = r1.getWithMusic()
            r2 = r1 ^ 1
        L_0x00f9:
            java.lang.String r1 = "MUSIC_IS_MUTE"
            r0.putBoolean(r1, r2)
        L_0x00fe:
            super.mo14585p(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.scene.TimelineEditorFollowMusicPluginLayout.mo14585p(qh2.e$b, android.os.Bundle):void");
    }

    /* renamed from: r */
    public String mo152376r() {
        return "MicroMsg.TimelineEditorFollowMusicPluginLayout";
    }
}
