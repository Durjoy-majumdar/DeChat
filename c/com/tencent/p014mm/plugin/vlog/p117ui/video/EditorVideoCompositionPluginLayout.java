package com.tencent.p014mm.plugin.vlog.p117ui.video;

import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import a33.C91948b;
import a33.C91950d;
import a33.C91952e;
import a33.C91954f;
import a33.C91957h;
import ai2.C92007a;
import ai2.C92013g;
import ai2.C92015i;
import ai2.C92021o;
import ai2.C92024r;
import ai2.C92026t;
import ai2.C92027u;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryDoPublishStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryQuitPublishStruct;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BaseEditVideoPluginLayout;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.tav.player.Player;
import com.tencent.xweb.file.XVFSFile;
import d23.C106976a;
import di3.C86312j;
import f72.C97842b;
import fh2.C97882i;
import gy3.C87412m;
import h90.C98324b;
import hi2.C98452d;
import i21.C60242i;
import ih2.C60287a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import jh2.C108745d;
import k21.C60960c;
import kg3.C76577a;
import kotlin.Metadata;
import lh2.C109339f0;
import lh2.C99418b0;
import lh2.C99451n;
import mh2.C99896a;
import o40.C61926c;
import p166hy.C98568t0;
import p206nj.C100115c;
import pe3.C47465a;
import qh2.C101198e;
import sp3.C110801c;
import sp3.C110803f;
import sx3.C26236u;
import sx3.C36907w;
import te3.C101807lr2;
import th2.C101891f;
import th2.C110992d;
import wg2.C102440a;
import wp3.C111829g;
import wx3.C15601d;
import z04.C112551y;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0004@\u0004X.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006%"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/video/EditorVideoCompositionPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BaseEditVideoPluginLayout;", "Lqh2/e;", "Landroid/view/View;", "getPlayerView", "", "getMuteOrigin", "La33/f;", "E", "La33/f;", "getMediaModel", "()La33/f;", "setMediaModel", "(La33/f;)V", "mediaModel", "La33/d;", "F", "La33/d;", "getPreviewNewPlugin", "()La33/d;", "setPreviewNewPlugin", "(La33/d;)V", "previewNewPlugin", "La14/z1;", "H", "La14/z1;", "getPreviewJob", "()La14/z1;", "setPreviewJob", "(La14/z1;)V", "previewJob", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout */
public class EditorVideoCompositionPluginLayout extends BaseEditVideoPluginLayout {

    /* renamed from: I */
    public static final /* synthetic */ int f282723I = 0;

    /* renamed from: E */
    public C91954f f282724E = new C91954f();

    /* renamed from: F */
    public C91950d f282725F;

    /* renamed from: G */
    public final C91957h f282726G;

    /* renamed from: H */
    public C53973z1 f282727H;

    /* renamed from: com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout$a */
    public static final class C96581a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditorVideoCompositionPluginLayout f282728d;

        public C96581a(EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout) {
            this.f282728d = editorVideoCompositionPluginLayout;
        }

        public final void run() {
            EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout = this.f282728d;
            int i = EditorVideoCompositionPluginLayout.f282723I;
            C98324b captureInfo = editorVideoCompositionPluginLayout.getCaptureInfo();
            String str = null;
            C86013q1.m106447h(captureInfo != null ? captureInfo.f288185f : null);
            C98324b captureInfo2 = this.f282728d.getCaptureInfo();
            if (captureInfo2 != null) {
                str = captureInfo2.f288180a;
            }
            C86013q1.m106447h(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorVideoCompositionPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C106976a.f320208a.mo157401e((EffectManager) null);
        C91957h hVar = new C91957h(context, this);
        this.f282726G = hVar;
        getPluginList().add(hVar);
        C91954f fVar = this.f282724E;
        int i = C60287a.f171906a;
        fVar.mo125808d(C60287a.f171906a, C60287a.f171907b);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        long j;
        if (!super.mo78564e()) {
            Log.m105924i("MicroMsg.EditorVideoCompositionPluginLayout", "onBackPress");
            C110803f.f331490g.mo162371a();
            C110992d dVar = C110992d.f332425a;
            dVar.mo162677k("KEY_AFTER_EDIT_INT", 0);
            dVar.mo162672f();
            Iterator<T> it = getItemContainerPlugin().f291592d.getAllItemViews().iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                j = 1;
                if (!it.hasNext()) {
                    break;
                }
                C92015i iVar = (C92015i) it.next();
                if (iVar instanceof C92013g) {
                    i++;
                } else if (iVar instanceof C92026t) {
                    i2++;
                } else if (iVar instanceof C92024r) {
                    C110992d.f332431g.f310324n = 1;
                } else if (!(iVar instanceof C92021o) && (iVar instanceof C92027u)) {
                    C110992d.f332431g.f310331u = 1;
                }
            }
            StoryQuitPublishStruct storyQuitPublishStruct = C110992d.f332431g;
            if (!getMoreMenuPlugin().f224407j) {
                j = 0;
            }
            storyQuitPublishStruct.f310328r = j;
            StoryQuitPublishStruct storyQuitPublishStruct2 = C110992d.f332431g;
            storyQuitPublishStruct2.f310321k = (long) i;
            storyQuitPublishStruct2.f310322l = (long) i2;
            C98324b captureInfo = getCaptureInfo();
            if (captureInfo != null && captureInfo.f288182c) {
                ((C119157j) C119157j.f356862d).mo183875f(new C96581a(this));
            }
            C91950d previewNewPlugin = getPreviewNewPlugin();
            C100115c cVar = previewNewPlugin.f263240h;
            if (cVar != null) {
                cVar.mo139414a();
            }
            VideoCompositionPlayView videoCompositionPlayView = previewNewPlugin.f263236d;
            if (videoCompositionPlayView != null) {
                videoCompositionPlayView.stop();
            }
            C102440a navigator = getNavigator();
            if (navigator != null) {
                C102440a.C102441a.m135179a(navigator, 0, (C98324b) null, 2, (Object) null);
            }
        }
        return true;
    }

    public final C91954f getMediaModel() {
        return this.f282724E;
    }

    public boolean getMuteOrigin() {
        return getAddMusicPlugin().mo161620c();
    }

    public View getPlayerView() {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        VideoCompositionPlayView videoCompositionPlayView = new VideoCompositionPlayView(context);
        Log.m105924i("MicroMsg.EditorVideoCompositionPluginLayout", "videoPlayView :" + videoCompositionPlayView);
        setPreviewPlugin(new C109339f0((VideoPlayerTextureView) null, this, (TextView) null));
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        setPreviewNewPlugin(new C91950d(videoCompositionPlayView, this, (TextView) findViewById(C0966R.C0970id.l5_), context2));
        getPluginList().add(getPreviewNewPlugin());
        return videoCompositionPlayView;
    }

    public final C53973z1 getPreviewJob() {
        return this.f282727H;
    }

    public final C91950d getPreviewNewPlugin() {
        C91950d dVar = this.f282725F;
        if (dVar != null) {
            return dVar;
        }
        C87412m.m108603p("previewNewPlugin");
        throw null;
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        Bundle bundle;
        C98324b bVar2 = bVar;
        Log.m105924i("MicroMsg.EditorVideoCompositionPluginLayout", "loadCurrentPage info " + bVar2);
        super.mo129855l(bVar);
        C91950d previewNewPlugin = getPreviewNewPlugin();
        C91954f fVar = this.f282724E;
        previewNewPlugin.getClass();
        C87412m.m108594g(fVar, "mediaModel");
        previewNewPlugin.f263246q = fVar;
        CaptureDataManager.f272890c.f272892b.clear();
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105924i("MicroMsg.EditorVideoCompositionPluginLayout", "setupMediaData start:" + currentTimeMillis);
        C98324b captureInfo = getCaptureInfo();
        C87412m.m108591d(captureInfo);
        List b = C26236u.m33719b(captureInfo.mo137615e());
        List b2 = C26236u.m33719b(2);
        boolean z = true;
        Integer[] numArr = new Integer[1];
        for (int i = 0; i < 1; i++) {
            C98324b captureInfo2 = getCaptureInfo();
            numArr[i] = Integer.valueOf((captureInfo2 == null || !captureInfo2.f288182c) ? 0 : 1);
        }
        C53973z1 z1Var = this.f282727H;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f282727H = C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C91952e(this, b, b2, numArr, (C15601d<? super C91952e>) null), 2, (Object) null);
        Log.m105924i("MicroMsg.EditorVideoCompositionPluginLayout", "setupMediaData end cost:" + (System.currentTimeMillis() - currentTimeMillis));
        C101891f fVar2 = C101891f.f300035a;
        RecordConfigProvider configProvider = getConfigProvider();
        int i2 = (configProvider == null || (bundle = configProvider.f272912M) == null) ? 0 : bundle.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 0);
        Log.m105924i("MicroMsg.VideoWidgetReporter", "setTecEnterScene >> type: " + i2);
        C101891f.f300036b.f265886T = i2;
        if (bVar2 != null) {
            C98452d.f288773c = 0;
            if (bVar.mo137611a()) {
                C98452d.f288773c++;
            }
            if (bVar.mo137612b()) {
                C98452d.f288773c++;
            }
            long currentTicks = Util.currentTicks();
            C99418b0 bgPlugin = getBgPlugin();
            C98324b captureInfo3 = getCaptureInfo();
            C87412m.m108591d(captureInfo3);
            bgPlugin.mo138858a(captureInfo3, getConfigProvider());
            C91957h hVar = this.f282726G;
            RecordConfigProvider configProvider2 = getConfigProvider();
            C87412m.m108591d(configProvider2);
            hVar.mo125815c(bVar2, configProvider2);
            Log.m105918d("MicroMsg.EditorVideoCompositionPluginLayout", "reMuxNewPlugin " + Util.ticksToNow(currentTicks));
            C99896a cropVideoPlugin = getCropVideoPlugin();
            C98324b captureInfo4 = getCaptureInfo();
            C87412m.m108591d(captureInfo4);
            RecordConfigProvider configProvider3 = getConfigProvider();
            C87412m.m108591d(configProvider3);
            cropVideoPlugin.getClass();
            cropVideoPlugin.f292727o = captureInfo4;
            cropVideoPlugin.f292728p = configProvider3;
            Log.m105918d("MicroMsg.EditorVideoCompositionPluginLayout", "cropVideoPlugin " + Util.ticksToNow(currentTicks));
            Bundle bundle2 = bVar2.f288193n;
            if (bundle2 != null) {
                ArrayList parcelableArrayList = bundle2.getParcelableArrayList("AUDIO_CACHE_INFO_LIST_KEY");
                Bundle bundle3 = bVar2.f288193n;
                C87412m.m108591d(bundle3);
                int i3 = bundle3.getInt("AUDIO_CACHE_INFO_INDEX_KEY", 0);
                if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                    getAddMusicPlugin().mo161618a(i3, parcelableArrayList);
                }
            }
            C110992d dVar = C110992d.f332425a;
            dVar.mo162677k("KEY_MEDIA_TYPE_INT", 2);
            dVar.mo162677k("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", Integer.valueOf(bVar2.f288184e));
            dVar.mo162677k("KEY_ENTER_EDIT_PAGE_TIME_MS_LONG", Long.valueOf(System.currentTimeMillis()));
            dVar.mo162677k("KEY_EDIT_PUBLISHID_INT", Long.valueOf(System.currentTimeMillis()));
            C110992d.f332428d.f310295h = System.currentTimeMillis();
            StoryDoPublishStruct storyDoPublishStruct = C110992d.f332428d;
            ArrayList<String> arrayList = bVar2.f288190k;
            long j = 1;
            storyDoPublishStruct.f310312y = !(arrayList == null || arrayList.isEmpty()) ? 1 : 2;
            C110992d.f332428d.f310313z = (long) bVar2.f288190k.size();
            StoryQuitPublishStruct storyQuitPublishStruct = C110992d.f332431g;
            ArrayList<String> arrayList2 = bVar2.f288190k;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z = false;
            }
            if (z) {
                j = 2;
            }
            storyQuitPublishStruct.f310329s = j;
            C110992d.f332431g.f310330t = (long) bVar2.f288190k.size();
            if (bVar2.f288182c) {
                fVar2.mo141384r(bVar2.f288180a);
                fVar2.mo141385s(bVar2.f288185f);
            } else {
                fVar2.mo141380n(bVar2.f288180a);
            }
            fVar2.mo141373g(getConfigProvider());
            C98324b captureInfo5 = getCaptureInfo();
            C87412m.m108591d(captureInfo5);
            if (!captureInfo5.f288182c) {
                RecordConfigProvider configProvider4 = getConfigProvider();
                if ((configProvider4 != null ? configProvider4.f272905F : 0) > 0) {
                    dVar.mo162677k("KEY_MEDIA_SOURCE_INT", 0);
                }
            }
        }
    }

    /* renamed from: n */
    public void mo134645n() {
        Log.m105924i("MicroMsg.EditorVideoCompositionPluginLayout", "afterDetach");
        RecordConfigProvider configProvider = getConfigProvider();
        boolean z = false;
        if (configProvider != null && configProvider.f272905F == 2) {
            z = true;
        }
        if (z) {
            C110992d.f332425a.mo162668a("MEDIA_EDIT_PAGE_STAYTIME_LONG", getBrowserTimeMs());
            C60960c.f173618a.mo85927k("SnsPublishProcess", "mediaEditPageStaytime_", Long.valueOf(getBrowserTimeMs()), C60242i.APPEND);
            ((C98568t0) C86312j.m106911c(C98568t0.class)).mo137942Do(getBrowserTimeMs());
        }
        C53973z1 z1Var = this.f282727H;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: o */
    public void mo134646o() {
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.m105924i("MicroMsg.EditorVideoCompositionPluginLayout", "configChange");
        View playerView = getPlayerView();
        C87412m.m108592e(playerView, "null cannot be cast to non-null type com.tencent.mm.videocomposition.play.VideoCompositionPlayView");
        if (!((VideoCompositionPlayView) playerView).isPlaying()) {
            Log.m105924i("MicroMsg.EditorVideoCompositionPluginLayout", "configChange video is no play");
            this.f282724E.mo125808d(getWidth(), getHeight());
            View playerView2 = getPlayerView();
            C87412m.m108592e(playerView2, "null cannot be cast to non-null type com.tencent.mm.videocomposition.play.VideoCompositionPlayView");
            ((VideoCompositionPlayView) playerView2).mo154755e();
        }
    }

    public void onDetach() {
        super.onDetach();
        mo134645n();
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        C111829g gVar;
        Player player;
        int i;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator duration;
        int i2;
        ArrayList<String> arrayList;
        Bundle bundle2;
        Bundle bundle3 = bundle;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 29) {
            C110803f.f331490g.mo162371a();
            super.mo14585p(bVar, bundle);
        } else if (ordinal == 35) {
        } else {
            if (ordinal != 50) {
                int i3 = 0;
                if (ordinal == 53) {
                    getVideoControlContainerPlugin().setVisibility(4);
                    if (bundle3 != null) {
                        boolean z = bundle3.getBoolean("EDIT_CROP_VIDEO_SHOW_WESEE_SWITCH_BOOLEAN", false);
                        C91950d previewNewPlugin = getPreviewNewPlugin();
                        previewNewPlugin.f263243n = true;
                        ViewGroup a = previewNewPlugin.mo125802a();
                        int width = a != null ? a.getWidth() : 0;
                        ViewGroup a2 = previewNewPlugin.mo125802a();
                        int height = a2 != null ? a2.getHeight() : 0;
                        int b = C76577a.m92151b(previewNewPlugin.f263239g, 20) + C76577a.m92151b(previewNewPlugin.f263239g, 95) + C76577a.m92151b(previewNewPlugin.f263239g, 12);
                        if (C75044y4.m89992d(previewNewPlugin.f263239g)) {
                            b += C75044y4.m89991c(previewNewPlugin.f263239g);
                        }
                        if (z) {
                            i = C76577a.m92151b(previewNewPlugin.f263239g, 56) + 0;
                            if (C85875k4.m106205t(previewNewPlugin.f263239g, false)) {
                                Log.m105918d("MicroMsg.EditVideoPreviewPlugin", "hasCutOut is true，videoViewTopMargin: " + i + ", cutout height is " + C85875k4.m106198o(previewNewPlugin.f263239g));
                                i += C85875k4.m106198o(previewNewPlugin.f263239g);
                            } else {
                                Log.m105918d("MicroMsg.EditVideoPreviewPlugin", "hasCutOut is false");
                            }
                        } else {
                            i = 0;
                        }
                        int i4 = (height - b) - i;
                        ViewGroup a3 = previewNewPlugin.mo125802a();
                        if ((a3 != null ? a3.getBottom() : b + 0) < C97842b.m126290g(previewNewPlugin.f263239g).y) {
                            i4 = (int) (((float) (width - (C76577a.m92151b(previewNewPlugin.f263239g, 32) * 2))) / (((float) width) / ((float) height)));
                        }
                        float f = (float) width;
                        float f2 = (float) height;
                        float f3 = (float) i4;
                        int i5 = (int) ((f / f2) * f3);
                        float f4 = ((float) i5) / f;
                        float f5 = f3 / f2;
                        float f6 = -(((float) Math.abs(b - i)) / 2.0f);
                        Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "scaleX: " + f4 + ", scaleY: " + f5 + ", translationY: " + f6);
                        Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "isShowWeseeBtn: " + z + ", videoViewWidth: " + width + ", videoViewHeight: " + height + ", videoViewBottomMargin:" + b + ", videoViewTopMargin:" + i + ", videoViewScaleHeight: " + i4 + ", videoViewScaleWidth: " + i5);
                        ViewGroup a4 = previewNewPlugin.mo125802a();
                        if (!(a4 == null || (animate = a4.animate()) == null || (scaleX = animate.scaleX(f4)) == null || (scaleY = scaleX.scaleY(f5)) == null || (translationY = scaleY.translationY(f6)) == null || (duration = translationY.setDuration(300)) == null)) {
                            duration.setListener(new C91948b(previewNewPlugin));
                        }
                    }
                    getItemContainerPlugin().f291592d.setEnableTouch(false);
                    C110992d.f332425a.mo162677k("KEY_ENTER_CROP_PAGE_TIME_MS_LONG", Long.valueOf(System.currentTimeMillis()));
                } else if (ordinal != 55) {
                    if (ordinal != 62) {
                        switch (ordinal) {
                            case 57:
                                C91950d previewNewPlugin2 = getPreviewNewPlugin();
                                previewNewPlugin2.getClass();
                                Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "videoPause");
                                C100115c cVar = previewNewPlugin2.f263240h;
                                if (cVar != null) {
                                    cVar.mo139414a();
                                }
                                VideoCompositionPlayView videoCompositionPlayView = previewNewPlugin2.f263236d;
                                if (videoCompositionPlayView != null) {
                                    videoCompositionPlayView.pause();
                                    return;
                                }
                                return;
                            case 58:
                                getPreviewNewPlugin().onResume();
                                return;
                            case 59:
                                C98324b captureInfo = getCaptureInfo();
                                if (captureInfo != null) {
                                    RecordConfigProvider configProvider = getConfigProvider();
                                    if (captureInfo.f288184e - captureInfo.f288183d > (configProvider != null ? configProvider.f272935w : 10000) + 250) {
                                        C101891f.f300035a.mo141375i(2, 3);
                                        Context context = getContext();
                                        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                                        ((Activity) context).setResult(3000);
                                        Context context2 = getContext();
                                        C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
                                        ((Activity) context2).finish();
                                        return;
                                    }
                                    getVideoControlContainerPlugin().setVisibility(0);
                                    getPreviewNewPlugin().mo125803b(false);
                                    getItemContainerPlugin().f291592d.setEnableTouch(true);
                                    C110992d.f332425a.mo162677k("KEY_EXIT_CROP_PAGE_TIME_MS_LONG", Long.valueOf(System.currentTimeMillis()));
                                    return;
                                }
                                return;
                            case 60:
                                getVideoControlContainerPlugin().setVisibility(0);
                                getAddMusicPlugin().mo161619b();
                                getPreviewNewPlugin().mo125803b(true);
                                getItemContainerPlugin().f291592d.setEnableTouch(true);
                                Log.m105924i("MicroMsg.EditorVideoCompositionPluginLayout", "crop finish >> startTime: " + ((long) getPreviewNewPlugin().f263244o) + " >> endTime: " + ((long) getPreviewNewPlugin().f263245p));
                                C91954f fVar = this.f282724E;
                                long j = (long) getPreviewNewPlugin().f263244o;
                                long j2 = (long) getPreviewNewPlugin().f263245p;
                                if (fVar.f263266k.size() > 0) {
                                    C106205q0 q0Var = fVar.f263266k.get(0);
                                    C87412m.m108593f(q0Var, "playingList[editIndex]");
                                    C106205q0 q0Var2 = q0Var;
                                    q0Var2.mo81190d(j);
                                    q0Var2.mo81188b(j2);
                                    C110801c.C101691a aVar = C110801c.f331462v;
                                    LinkedList<C106205q0> linkedList = fVar.f263266k;
                                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
                                    for (C106205q0 q0Var3 : linkedList) {
                                        arrayList2.add(q0Var3.f316501l);
                                    }
                                    aVar.mo141145a(arrayList2);
                                }
                                C96552p0 p0Var = new C96552p0((List<C106205q0>) fVar.f263266k);
                                fVar.f263265j = p0Var;
                                p0Var.mo134625v(0);
                                fVar.f263265j.mo134623t(C106976a.f320215h);
                                fVar.f263265j.mo81184c(fVar.f263260e, fVar.f263261f);
                                fVar.mo125805a();
                                C110992d.f332425a.mo162677k("KEY_EXIT_CROP_PAGE_TIME_MS_LONG", Long.valueOf(System.currentTimeMillis()));
                                return;
                            default:
                                super.mo14585p(bVar, bundle);
                                return;
                        }
                    } else if (!this.f282724E.mo125807c()) {
                        Log.m105920e("MicroMsg.EditorVideoCompositionPluginLayout", "size is not valid,return this click");
                    } else if (this.f282724E.f263265j.f282570c.isEmpty()) {
                        Log.m105920e("MicroMsg.EditorVideoCompositionPluginLayout", "composition track is empty");
                    } else {
                        String b2 = getBgPlugin().mo138859b();
                        C91950d previewNewPlugin3 = getPreviewNewPlugin();
                        previewNewPlugin3.getClass();
                        Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "videoPause");
                        C100115c cVar2 = previewNewPlugin3.f263240h;
                        if (cVar2 != null) {
                            cVar2.mo139414a();
                        }
                        VideoCompositionPlayView videoCompositionPlayView2 = previewNewPlugin3.f263236d;
                        if (videoCompositionPlayView2 != null) {
                            videoCompositionPlayView2.pause();
                        }
                        getPreviewNewPlugin().mo125804c();
                        getItemContainerPlugin().onPause();
                        getAddMusicPlugin().onPause();
                        if (getMoreMenuPlugin().f224407j) {
                            Pattern pattern = C61926c.f176038a;
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        CaptureDataManager.f272890c.f272892b.putInt("key_extra_feature_flag", i2);
                        int i6 = 3;
                        if (getMoreMenuPlugin().f224408n == 2) {
                            CaptureDataManager.f272890c.f272892b.putString("key_group_list", getMoreMenuPlugin().mo106974a());
                        } else if (getMoreMenuPlugin().f224408n == 3) {
                            CaptureDataManager.f272890c.f272892b.putString("key_black_list", getMoreMenuPlugin().mo106974a());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        C99451n itemContainerPlugin = getItemContainerPlugin();
                        itemContainerPlugin.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        for (C92015i iVar : itemContainerPlugin.f291592d.getAllItemViews()) {
                            if (iVar instanceof C92013g) {
                                C92013g gVar2 = (C92013g) iVar;
                                if (gVar2.getEmojiInfo() != null) {
                                    IEmojiInfo emojiInfo = gVar2.getEmojiInfo();
                                    C87412m.m108591d(emojiInfo);
                                    arrayList4.add(emojiInfo);
                                }
                            }
                        }
                        Iterator it = arrayList4.iterator();
                        while (it.hasNext()) {
                            IEmojiInfo iEmojiInfo = (IEmojiInfo) it.next();
                            if (iEmojiInfo.mo62639J() != null) {
                                arrayList3.add(iEmojiInfo.mo62639J());
                            }
                        }
                        CaptureDataManager.f272890c.f272892b.putParcelableArrayList("key_edit_safe_strategy_emotion_info_list", arrayList3);
                        C97882i iVar2 = new C97882i(getMuteOrigin(), getAddMusicPlugin().f329710j, getItemContainerPlugin().mo138890d((Matrix) null), getItemContainerPlugin().mo138889c(), getItemContainerPlugin().mo138888b(), getPreviewNewPlugin().f263244o, getPreviewNewPlugin().f263245p, new ArrayList(), b2, getItemContainerPlugin().mo138893h());
                        Log.m105924i("MicroMsg.EditorVideoCompositionPluginLayout", "edit config: " + iVar2);
                        C101891f fVar2 = C101891f.f300035a;
                        int[] iArr = new int[3];
                        iArr[0] = getItemContainerPlugin().mo138891f();
                        iArr[1] = getItemContainerPlugin().mo138892g();
                        iArr[2] = getAddMusicPlugin().f329710j == null ? 0 : 1;
                        fVar2.mo141374h(iArr);
                        C98324b captureInfo2 = getCaptureInfo();
                        boolean z2 = captureInfo2 != null ? captureInfo2.f288182c : false;
                        RecordConfigProvider configProvider2 = getConfigProvider();
                        int i7 = (configProvider2 == null || (bundle2 = configProvider2.f272912M) == null) ? 1 : bundle2.getInt("key_record_bitrate_ratio", 1);
                        boolean z3 = getItemContainerPlugin().mo138891f() > 0 || getItemContainerPlugin().mo138892g() > 0;
                        boolean z4 = getAddMusicPlugin().f329710j != null;
                        Log.m105924i("MicroMsg.VideoWidgetReporter", "setRecordGuessEdit record:" + z2 + " stickerEdit:" + z3 + " musicEdit:" + z4);
                        if (z2) {
                            if (z3 || z4) {
                                if (i7 > 1) {
                                    C101891f.f300036b.f265889W = 3;
                                } else {
                                    C101891f.f300036b.f265889W = 4;
                                }
                            } else if (i7 > 1) {
                                C101891f.f300036b.f265889W = 2;
                            } else {
                                C101891f.f300036b.f265889W = 1;
                            }
                        }
                        this.f282726G.mo125817f(iVar2, this.f282724E);
                        C110992d dVar = C110992d.f332425a;
                        dVar.mo162677k("KEY_ADD_EMOJI_COUNT_INT", Integer.valueOf(getItemContainerPlugin().mo138891f()));
                        dVar.mo162677k("KEY_ADD_TEXT_COUNT_INT", Integer.valueOf(getItemContainerPlugin().mo138892g()));
                        dVar.mo162677k("KEY_SELECT_MUSIC_INT", Integer.valueOf(getAddMusicPlugin().f329710j == null ? 0 : 1));
                        dVar.mo162677k("KEY_SELECT_ORIGIN_INT", Integer.valueOf(getAddMusicPlugin().mo161620c() ^ true ? 1 : 0));
                        dVar.mo162677k("KEY_AFTER_EDIT_INT", 1);
                        Iterator<C92007a> it4 = getItemContainerPlugin().mo138889c().iterator();
                        int i8 = 0;
                        int i9 = 0;
                        while (it4.hasNext()) {
                            C92007a next = it4.next();
                            int ordinal2 = next.f263402a.ordinal();
                            if (ordinal2 == 0) {
                                i9++;
                            } else if (ordinal2 == 1) {
                                i8++;
                            } else if (ordinal2 == 2) {
                                C47465a protoBuf = next.toProtoBuf();
                                C87412m.m108592e(protoBuf, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LocationItemData");
                                C101807lr2 lr22 = (C101807lr2) protoBuf;
                                StoryDoPublishStruct storyDoPublishStruct = C110992d.f332428d;
                                String str = lr22.f298721d;
                                C87412m.m108593f(str, "poiData.cityName");
                                String str2 = lr22.f298722e;
                                C87412m.m108593f(str2, "poiData.poiName");
                                StringBuilder sb = new StringBuilder();
                                if (!TextUtils.isEmpty(str)) {
                                    sb.append(C112551y.m153814n(str, ",", " ", true));
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    if (sb.length() > 0) {
                                        sb.append("|");
                                    }
                                    sb.append(C112551y.m153814n(str2, ",", " ", true));
                                }
                                String sb4 = sb.toString();
                                C87412m.m108593f(sb4, "reportPositionString.toString()");
                                storyDoPublishStruct.f310303p = storyDoPublishStruct.mo86045b("PositionInfo", sb4, true);
                                StoryDoPublishStruct storyDoPublishStruct2 = C110992d.f332428d;
                                storyDoPublishStruct2.f310305r = storyDoPublishStruct2.mo86045b("PositionLatitude", String.valueOf(lr22.f298725h), true);
                                StoryDoPublishStruct storyDoPublishStruct3 = C110992d.f332428d;
                                storyDoPublishStruct3.f310306s = storyDoPublishStruct3.mo86045b("PositionLongitude", String.valueOf(lr22.f298724g), true);
                            } else if (ordinal2 == i6) {
                                C110992d.f332428d.f310288B = 1;
                            } else if (ordinal2 == 4) {
                                C110992d.f332428d.f310287A = 1;
                            }
                            i6 = 3;
                        }
                        StoryDoPublishStruct storyDoPublishStruct4 = C110992d.f332428d;
                        storyDoPublishStruct4.f310299l = (long) i8;
                        storyDoPublishStruct4.f310300m = (long) i9;
                        storyDoPublishStruct4.f310311x = getMoreMenuPlugin().f224407j ? 1 : 0;
                        StringBuilder sb5 = new StringBuilder();
                        C98324b captureInfo3 = getCaptureInfo();
                        if (!(captureInfo3 == null || (arrayList = captureInfo3.f288190k) == null)) {
                            for (String decodeFile : arrayList) {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(decodeFile, options);
                                int i15 = options.outWidth;
                                int i16 = options.outHeight;
                                sb5.append(i16 + XVFSFile.PATH_SEPARATOR_CHAR + i15 + "||");
                            }
                        }
                        int lastIndexOf = sb5.lastIndexOf("||");
                        if (lastIndexOf >= 0) {
                            StoryDoPublishStruct storyDoPublishStruct5 = C110992d.f332428d;
                            storyDoPublishStruct5.f310289C = storyDoPublishStruct5.mo86045b("PhotoWidthHeightScales", sb5.substring(0, lastIndexOf).toString(), true);
                        }
                        C110992d dVar2 = C110992d.f332425a;
                        dVar2.mo162670d(13);
                        C110992d.f332428d.f310296i = System.currentTimeMillis();
                        RecordConfigProvider configProvider3 = getConfigProvider();
                        if (configProvider3 != null) {
                            i3 = configProvider3.f272905F;
                        }
                        dVar2.mo162671e(i3);
                        dVar2.mo162672f();
                        C108745d dVar3 = C108745d.f325633i;
                        if (dVar3 != null) {
                            dVar3.mo159768d();
                        }
                    }
                } else if (bundle3 != null) {
                    int i17 = bundle3.getInt("EDIT_CROP_VIDEO_LENGTH_START_TIME_INT");
                    int i18 = bundle3.getInt("EDIT_CROP_VIDEO_LENGTH_END_TIME_INT");
                    C91950d previewNewPlugin4 = getPreviewNewPlugin();
                    previewNewPlugin4.getClass();
                    Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "setPlayRange >> start: " + i17 + ", end: " + i18);
                    previewNewPlugin4.f263244o = i17;
                    previewNewPlugin4.f263245p = i18;
                    VideoCompositionPlayView videoCompositionPlayView3 = previewNewPlugin4.f263236d;
                    if (videoCompositionPlayView3 != null) {
                        videoCompositionPlayView3.mo154764j((long) i17, (long) i18);
                    }
                    C91950d previewNewPlugin5 = getPreviewNewPlugin();
                    previewNewPlugin5.getClass();
                    Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "seek >> " + i17);
                    VideoCompositionPlayView videoCompositionPlayView4 = previewNewPlugin5.f263236d;
                    if (videoCompositionPlayView4 != null) {
                        if (!videoCompositionPlayView4.isPlaying()) {
                            VideoCompositionPlayView videoCompositionPlayView5 = previewNewPlugin5.f263236d;
                            C87412m.m108591d(videoCompositionPlayView5);
                            videoCompositionPlayView5.mo154761h();
                        }
                        VideoCompositionPlayView videoCompositionPlayView6 = previewNewPlugin5.f263236d;
                        C87412m.m108591d(videoCompositionPlayView6);
                        videoCompositionPlayView6.mo154762i((long) i17);
                    }
                }
            } else if (bundle3 != null) {
                boolean z5 = bundle3.getBoolean("PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN");
                VideoCompositionPlayView videoCompositionPlayView7 = getPreviewNewPlugin().f263236d;
                if (videoCompositionPlayView7 != null && (gVar = videoCompositionPlayView7.f319838d) != null && (player = gVar.f334836a) != null) {
                    player.setVolume(z5 ? 0.0f : 1.0f);
                }
            }
        }
    }

    public final void setMediaModel(C91954f fVar) {
        C87412m.m108594g(fVar, "<set-?>");
        this.f282724E = fVar;
    }

    public final void setPreviewJob(C53973z1 z1Var) {
        this.f282727H = z1Var;
    }

    public final void setPreviewNewPlugin(C91950d dVar) {
        C87412m.m108594g(dVar, "<set-?>");
        this.f282725F = dVar;
    }
}
