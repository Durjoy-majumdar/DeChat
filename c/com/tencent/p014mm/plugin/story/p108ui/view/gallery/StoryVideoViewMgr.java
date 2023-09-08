package com.tencent.p014mm.plugin.story.p108ui.view.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryDownloadReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryPreviewReportStruct;
import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.modelvideo.C55394a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.api.ITPPlayer;
import cw2.C97399u;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import gw2.C98268m;
import gw2.C98269n;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import java.util.UUID;
import jw2.C99066b;
import jw2.C99068c;
import jw2.C99069d;
import kw2.C34078m;
import kw2.C99264e;
import kw2.C99265f;
import o40.C61926c;
import ow2.C100604w;
import ow2.C100614x;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p206nj.C100115c;
import p500dy.C97560f;
import p663qo.C101211h;
import p682rz.C101487r;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr */
public final class StoryVideoViewMgr {

    /* renamed from: a */
    public StoryVideoView f282150a;

    /* renamed from: b */
    public C96448b f282151b;

    /* renamed from: c */
    public boolean f282152c;

    /* renamed from: d */
    public String f282153d;

    /* renamed from: e */
    public boolean f282154e;

    /* renamed from: f */
    public C98268m f282155f;

    /* renamed from: g */
    public boolean f282156g;

    /* renamed from: h */
    public C100115c f282157h = new C100115c(MMApplicationContext.getContext());

    /* renamed from: i */
    public boolean f282158i;

    /* renamed from: j */
    public final long f282159j = 987;

    /* renamed from: k */
    public int f282160k;

    /* renamed from: l */
    public final StoryVideoViewMgr$onlineVideoEventListener$1 f282161l;

    /* renamed from: m */
    public final C96450c f282162m;

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr$a */
    public final class C96443a implements C98127h.C98128a {

        /* renamed from: d */
        public volatile boolean f282163d;

        /* renamed from: e */
        public C55394a.C55395a f282164e;

        /* renamed from: f */
        public C34078m f282165f;

        /* renamed from: g */
        public C98268m f282166g;

        /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr$a$a */
        public static final class C96444a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ StoryVideoViewMgr f282168d;

            /* renamed from: e */
            public final /* synthetic */ String f282169e;

            /* renamed from: f */
            public final /* synthetic */ long f282170f;

            /* renamed from: g */
            public final /* synthetic */ long f282171g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C96444a(StoryVideoViewMgr storyVideoViewMgr, String str, long j, long j2) {
                super(0);
                this.f282168d = storyVideoViewMgr;
                this.f282169e = str;
                this.f282170f = j;
                this.f282171g = j2;
            }

            public Object invoke() {
                StoryVideoView storyVideoView = this.f282168d.f282150a;
                if (storyVideoView != null) {
                    storyVideoView.onDataAvailable(this.f282169e, this.f282170f, this.f282171g);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr$a$b */
        public static final class C96445b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C96443a f282172d;

            /* renamed from: e */
            public final /* synthetic */ String f282173e;

            /* renamed from: f */
            public final /* synthetic */ int f282174f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C96445b(C96443a aVar, String str, int i) {
                super(0);
                this.f282172d = aVar;
                this.f282173e = str;
                this.f282174f = i;
            }

            public Object invoke() {
                C55394a.C55395a aVar = this.f282172d.f282164e;
                if (aVar != null) {
                    aVar.mo76640m(this.f282173e, this.f282174f);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr$a$c */
        public static final class C96446c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ StoryVideoViewMgr f282175d;

            /* renamed from: e */
            public final /* synthetic */ String f282176e;

            /* renamed from: f */
            public final /* synthetic */ long f282177f;

            /* renamed from: g */
            public final /* synthetic */ long f282178g;

            /* renamed from: h */
            public final /* synthetic */ CdnLogic.VideoInfo f282179h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C96446c(StoryVideoViewMgr storyVideoViewMgr, String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
                super(0);
                this.f282175d = storyVideoViewMgr;
                this.f282176e = str;
                this.f282177f = j;
                this.f282178g = j2;
                this.f282179h = videoInfo;
            }

            public Object invoke() {
                StoryVideoView storyVideoView = this.f282175d.f282150a;
                if (storyVideoView != null) {
                    String str = this.f282176e;
                    long j = this.f282177f;
                    long j2 = this.f282178g;
                    CdnLogic.VideoInfo videoInfo = this.f282179h;
                    String str2 = videoInfo != null ? videoInfo.svrFlag : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    storyVideoView.mo76639l(str, j, j2, str2);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr$a$d */
        public static final class C96447d extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ StoryVideoViewMgr f282180d;

            /* renamed from: e */
            public final /* synthetic */ String f282181e;

            /* renamed from: f */
            public final /* synthetic */ long f282182f;

            /* renamed from: g */
            public final /* synthetic */ long f282183g;

            /* renamed from: h */
            public final /* synthetic */ C96443a f282184h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C96447d(StoryVideoViewMgr storyVideoViewMgr, String str, long j, long j2, C96443a aVar) {
                super(0);
                this.f282180d = storyVideoViewMgr;
                this.f282181e = str;
                this.f282182f = j;
                this.f282183g = j2;
                this.f282184h = aVar;
            }

            public Object invoke() {
                boolean z;
                StoryVideoViewMgr storyVideoViewMgr = this.f282180d;
                storyVideoViewMgr.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("checkPauseOnProgress, isVideoPause:");
                sb.append(false);
                sb.append(", ");
                StoryVideoView storyVideoView = storyVideoViewMgr.f282150a;
                sb.append(storyVideoView != null ? storyVideoView.getSessionId() : null);
                sb.append(", ");
                sb.append(storyVideoViewMgr.f282153d);
                Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", sb.toString());
                String str = "MicroMsg.VideoPlayProxy";
                StoryVideoView storyVideoView2 = this.f282180d.f282150a;
                if (storyVideoView2 != null) {
                    storyVideoView2.mo76638e(this.f282181e, this.f282182f, this.f282183g);
                }
                C34078m mVar = this.f282184h.f282165f;
                if (mVar != null) {
                    mVar.field_totalSize = (int) this.f282183g;
                }
                if (mVar != null) {
                    mVar.field_cacheSize = (int) this.f282182f;
                }
                StoryCore.C96337h hVar = StoryCore.f281736t;
                boolean update = hVar.mo134193k().update(this.f282184h.f282165f, new String[0]);
                C96443a aVar = this.f282184h;
                C98268m mVar2 = aVar.f282166g;
                if (mVar2 != null) {
                    String str2 = this.f282181e;
                    long j = this.f282182f;
                    long j2 = this.f282183g;
                    C99264e jo = hVar.mo134189g().mo138646jo(mVar2.f288091d);
                    String str3 = str;
                    long j3 = j2;
                    if (jo.field_syncId != mVar2.f288089b || !jo.isValid() || aVar.f282165f == null) {
                        str = str3;
                    } else {
                        long j4 = mVar2.f288089b;
                        String str4 = mVar2.f288093f.f297959d;
                        C87412m.m108593f(str4, "it.media.Id");
                        C34078m mVar3 = aVar.f282165f;
                        int i = mVar3 != null ? mVar3.field_cacheSize : 0;
                        String str5 = str3;
                        if (j4 == jo.field_syncId) {
                            jo.field_preloadStoryId = j4;
                            jo.field_preloadMediaId = str4;
                            jo.field_preLoadResource = (long) i;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            str = str5;
                            Log.m105924i(str, "markPreloadCompleted onProgress, mediaId:" + str2 + ", offset:" + j + ", total:" + j3 + " this:" + aVar);
                            C99265f g = hVar.mo134189g();
                            if (g.mo138642TE((long) ((int) jo.systemRowid), jo) >= 0) {
                                g.doNotify("notify_story_preload", 3, jo);
                            }
                        } else {
                            str = str5;
                        }
                    }
                }
                this.f282184h.getClass();
                Log.m105924i(str, "onProgress, update ret " + update + " mediaId:" + this.f282181e + ", offset:" + this.f282182f + ", total:" + this.f282183g + " this:" + this.f282184h);
                return C13598b0.f38549a;
            }
        }

        public C96443a() {
        }

        /* renamed from: e */
        public void mo17917e(String str, long j, long j2) {
            C87412m.m108594g(str, "mediaId");
            StringBuilder sb = new StringBuilder();
            sb.append("onProgress, mediaId:");
            sb.append(str);
            sb.append(", offset:");
            sb.append(j);
            sb.append(", total:");
            sb.append(j2);
            sb.append(" this:");
            sb.append(this);
            sb.append(" currVideoItem:");
            C98268m mVar = StoryVideoViewMgr.this.f282155f;
            sb.append(mVar != null ? mVar.f288091d : null);
            Log.m105924i("MicroMsg.VideoPlayProxy", sb.toString());
            C61926c.m72668M(new C96447d(StoryVideoViewMgr.this, str, j, j2, this));
        }

        /* renamed from: g */
        public void mo17918g(String str, int i, C98121d dVar) {
            long j;
            C99066b.C99067a aVar;
            long j2;
            String str2 = str;
            int i2 = i;
            C98121d dVar2 = dVar;
            C87412m.m108594g(str2, "mediaId");
            StringBuilder sb = new StringBuilder();
            sb.append("onFinish, mediaId:");
            sb.append(str2);
            sb.append(", ret:");
            sb.append(i2);
            sb.append(", sceneResult:");
            sb.append(dVar2 != null ? dVar2.field_retCode : 0);
            sb.append(" this:");
            sb.append(this);
            sb.append(" currVideoItem:");
            C98268m mVar = StoryVideoViewMgr.this.f282155f;
            String[] strArr = null;
            sb.append(mVar != null ? mVar.f288091d : null);
            Log.m105924i("MicroMsg.VideoPlayProxy", sb.toString());
            C98268m mVar2 = this.f282166g;
            long j3 = 0;
            if (mVar2 != null) {
                C99066b bVar = C99066b.f290392a;
                long j4 = mVar2.f288089b;
                Map<Long, C99066b.C99067a> map = C99066b.f290394c;
                if (map.containsKey(Long.valueOf(j4))) {
                    C99066b.C99067a aVar2 = map.get(Long.valueOf(j4));
                    if (!(j4 == 0 || (aVar = map.get(Long.valueOf(j4))) == null)) {
                        long j5 = aVar.f290402c;
                        if (j5 > 0) {
                            long milliSecondsToNow = Util.milliSecondsToNow(j5);
                            Log.m105924i("MicroMsg.StoryBrowseDetailIDKeyStat", "downloadEnd2 " + milliSecondsToNow);
                            if (aVar.f290403d) {
                                C99066b bVar2 = bVar;
                                j2 = milliSecondsToNow;
                                bVar2.mo138409c(998, 62, 1);
                                bVar2.mo138409c(998, 63, j2);
                            } else {
                                j2 = milliSecondsToNow;
                            }
                            C99066b bVar3 = bVar;
                            bVar3.mo138409c(998, 60, 1);
                            bVar3.mo138409c(998, 61, j2);
                        }
                    }
                }
                C100604w wVar = C100604w.f294753a;
                long j6 = mVar2.f288089b;
                wVar.getClass();
                Long l = C100604w.f294765m;
                if (l != null && l.longValue() == j6) {
                    C100604w.f294765m = 0L;
                }
                if (C100604w.f294768p != j6) {
                    C100604w.f294768p = j6;
                    if (!(C100604w.f294755c == 0 || C100604w.f294757e == 0 || C100604w.f294761i.size() > 0)) {
                        C100604w.C100605a aVar3 = C100604w.f294763k;
                        if (aVar3 != null) {
                            Log.m105924i("MicroMsg.GroupData.StoryVideoPreloadMgr", "resetWalk");
                            aVar3.f294773e = aVar3.f294769a;
                            aVar3.f294774f = aVar3.f294770b;
                            aVar3.f294775g = 0;
                        }
                        wVar.mo140069m(false);
                    }
                }
            }
            C97560f fVar = (C97560f) C86312j.m106911c(C97560f.class);
            C34078m mVar3 = this.f282165f;
            C94554a Z40 = fVar.Z40(mVar3 != null ? mVar3.field_filePath : null);
            if (Z40 != null) {
                StoryDownloadReportStruct storyDownloadReportStruct = C99069d.f290429l;
                storyDownloadReportStruct.f266252j = (long) Z40.f273443a;
                storyDownloadReportStruct.f266253k = (long) Z40.f273444b;
                storyDownloadReportStruct.f266254l = (long) Z40.f273449g;
                storyDownloadReportStruct.f266255m = (long) Z40.f273447e;
                storyDownloadReportStruct.f266256n = (long) Z40.f273445c;
                storyDownloadReportStruct.f266257o = (long) Z40.f273446d;
                storyDownloadReportStruct.f266259q = (long) Z40.f273448f;
            }
            StoryDownloadReportStruct storyDownloadReportStruct2 = C99069d.f290429l;
            C34078m mVar4 = this.f282165f;
            if (mVar4 != null) {
                j3 = (long) mVar4.field_totalSize;
            }
            storyDownloadReportStruct2.f266251i = j3;
            storyDownloadReportStruct2.f266247e = storyDownloadReportStruct2.mo86045b("VideoUrl", mVar4 != null ? mVar4.field_url : null, true);
            StoryDownloadReportStruct storyDownloadReportStruct3 = C99069d.f290429l;
            C101211h hVar = (C101211h) C86312j.m106911c(C101211h.class);
            C34078m mVar5 = this.f282165f;
            storyDownloadReportStruct3.f266248f = storyDownloadReportStruct3.mo86045b("NewMd5", hVar.mo140292k7(mVar5 != null ? mVar5.field_filePath : null), true);
            if (dVar2 != null) {
                StoryDownloadReportStruct storyDownloadReportStruct4 = C99069d.f290429l;
                storyDownloadReportStruct4.f266249g = dVar2.field_startTime;
                storyDownloadReportStruct4.f266250h = dVar2.field_endTime;
            }
            if (dVar2 != null) {
                strArr = dVar2.field_usedSvrIps;
            }
            if (strArr != null) {
                StringBuffer stringBuffer = new StringBuffer();
                String[] strArr2 = dVar2.field_usedSvrIps;
                C87412m.m108593f(strArr2, "sceneResult.field_usedSvrIps");
                for (String append : strArr2) {
                    stringBuffer.append(append);
                    stringBuffer.append("|");
                }
                StoryDownloadReportStruct storyDownloadReportStruct5 = C99069d.f290429l;
                storyDownloadReportStruct5.f266258p = storyDownloadReportStruct5.mo86045b("CDNIp", stringBuffer.toString(), true);
            }
            C96448b bVar4 = StoryVideoViewMgr.this.f282151b;
            if (bVar4 != null) {
                StoryDownloadReportStruct storyDownloadReportStruct6 = C99069d.f290429l;
                storyDownloadReportStruct6.f266260r = (long) bVar4.f282188g;
                C87412m.m108591d(bVar4);
                if (bVar4.f282189h) {
                    j = 3;
                } else {
                    C96448b bVar5 = StoryVideoViewMgr.this.f282151b;
                    C87412m.m108591d(bVar5);
                    j = bVar5.f282188g > 0 ? 2 : 1;
                }
                storyDownloadReportStruct6.f266261s = j;
            }
            C99069d.f290429l.mo86054n();
            C99069d.f290429l = new StoryDownloadReportStruct();
            C61926c.m72668M(new C96445b(this, str2, i2));
        }

        public void onDataAvailable(String str, long j, long j2) {
            C87412m.m108594g(str, "mediaId");
            StringBuilder sb = new StringBuilder();
            sb.append("onDataAvailable, mediaId:");
            sb.append(str);
            sb.append(", offset:");
            sb.append(j);
            sb.append(", length:");
            sb.append(j2);
            sb.append(" this:");
            sb.append(this);
            sb.append(" currVideoItem:");
            C98268m mVar = StoryVideoViewMgr.this.f282155f;
            sb.append(mVar != null ? mVar.f288091d : null);
            Log.m105924i("MicroMsg.VideoPlayProxy", sb.toString());
            C61926c.m72668M(new C96444a(StoryVideoViewMgr.this, str, j, j2));
        }

        public void onM3U8Ready(String str, String str2) {
            C87412m.m108594g(str, "mediaId");
        }

        public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
            StringBuilder sb = new StringBuilder();
            sb.append("onMoovReady, mediaId:");
            sb.append(str);
            sb.append(", offset:");
            sb.append(j);
            sb.append(", length:");
            sb.append(j2);
            sb.append(", isMoovReady:");
            sb.append(this.f282163d);
            sb.append(" this:");
            sb.append(this);
            sb.append(" currVideoItem:");
            C98268m mVar = StoryVideoViewMgr.this.f282155f;
            sb.append(mVar != null ? mVar.f288091d : null);
            Log.m105924i("MicroMsg.VideoPlayProxy", sb.toString());
            if (!this.f282163d) {
                this.f282163d = true;
                C61926c.m72668M(new C96446c(StoryVideoViewMgr.this, str, j, j2, videoInfo));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr$b */
    public final class C96448b implements C55394a {

        /* renamed from: d */
        public C34078m f282185d;

        /* renamed from: e */
        public C55394a.C55395a f282186e;

        /* renamed from: f */
        public C98268m f282187f;

        /* renamed from: g */
        public int f282188g;

        /* renamed from: h */
        public boolean f282189h;

        /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr$b$a */
        public static final class C96449a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C96448b f282191d;

            /* renamed from: e */
            public final /* synthetic */ String f282192e;

            /* renamed from: f */
            public final /* synthetic */ int f282193f;

            /* renamed from: g */
            public final /* synthetic */ int f282194g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C96449a(C96448b bVar, String str, int i, int i2) {
                super(0);
                this.f282191d = bVar;
                this.f282192e = str;
                this.f282193f = i;
                this.f282194g = i2;
            }

            public Object invoke() {
                C96448b bVar = this.f282191d;
                C98268m mVar = bVar.f282187f;
                if (mVar != null) {
                    bVar.f282185d = C97399u.f285903a.mo136668b(mVar);
                }
                int n = ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126990n(this.f282192e, this.f282193f, this.f282194g, 0);
                this.f282191d.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("requestVideoData ");
                sb.append(this.f282192e);
                sb.append(' ');
                sb.append(this.f282193f);
                sb.append(' ');
                sb.append(this.f282194g);
                sb.append(' ');
                C34078m mVar2 = this.f282191d.f282185d;
                sb.append(mVar2 != null ? Integer.valueOf(mVar2.field_cacheSize) : null);
                sb.append(", ret:");
                sb.append(n);
                sb.append(" this:");
                sb.append(this.f282191d);
                Log.m105924i("MicroMsg.VideoPlayProxy", sb.toString());
                return C13598b0.f38549a;
            }
        }

        public C96448b() {
        }

        /* JADX WARNING: type inference failed for: r4v14, types: [java.lang.Long] */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0128, code lost:
            if (r8 != null) goto L_0x012a;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0122  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36227a(java.lang.String r13) {
            /*
                r12 = this;
                java.lang.String r0 = "mediaId"
                gy3.C87412m.m108594g(r13, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "this: "
                r0.append(r1)
                r0.append(r12)
                java.lang.String r1 = " stop "
                r0.append(r1)
                r0.append(r13)
                r1 = 32
                r0.append(r1)
                com.tencent.mm.sdk.platformtools.MMStack r1 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.VideoPlayProxy"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                r0 = 17
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r2 = com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr.this
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView r2 = r2.f282150a
                r3 = 0
                if (r2 == 0) goto L_0x0041
                int r2 = r2.getCurrPosMs()
                goto L_0x0042
            L_0x0041:
                r2 = 0
            L_0x0042:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r3] = r2
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r2 = com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr.this
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView r2 = r2.f282150a
                r4 = 0
                if (r2 == 0) goto L_0x0059
                long r5 = r2.getFirstPlayWaitTime()
                int r2 = (int) r5
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x005a
            L_0x0059:
                r2 = r4
            L_0x005a:
                r5 = 1
                r0[r5] = r2
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r2 = com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr.this
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView r2 = r2.f282150a
                if (r2 == 0) goto L_0x0076
                vd3.c0 r2 = r2.f283584N
                long r6 = r2.f300847m
                long r8 = r2.f300835a
                int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r2 <= 0) goto L_0x0070
                long r6 = r6 - r8
                int r2 = (int) r6
                goto L_0x0071
            L_0x0070:
                r2 = 0
            L_0x0071:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x0077
            L_0x0076:
                r2 = r4
            L_0x0077:
                r6 = 2
                r0[r6] = r2
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r2 = com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr.this
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView r2 = r2.f282150a
                if (r2 == 0) goto L_0x0089
                vd3.c0 r2 = r2.f283584N
                int r2 = r2.f300842h
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x008a
            L_0x0089:
                r2 = r4
            L_0x008a:
                r7 = 3
                r0[r7] = r2
                r2 = 4
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r8 = com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr.this
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView r8 = r8.f282150a
                if (r8 == 0) goto L_0x00a6
                vd3.c0 r8 = r8.f283584N
                int r9 = r8.f300842h
                if (r9 <= 0) goto L_0x00a0
                long r10 = r8.f300841g
                long r8 = (long) r9
                long r10 = r10 / r8
                int r8 = (int) r10
                goto L_0x00a1
            L_0x00a0:
                r8 = 0
            L_0x00a1:
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                goto L_0x00a7
            L_0x00a6:
                r8 = r4
            L_0x00a7:
                r0[r2] = r8
                r2 = 5
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r8 = com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr.this
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView r8 = r8.f282150a
                if (r8 == 0) goto L_0x00b9
                int r8 = r8.getStayTime()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                goto L_0x00ba
            L_0x00b9:
                r8 = r4
            L_0x00ba:
                r0[r2] = r8
                r2 = 6
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r8 = com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr.this
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView r8 = r8.f282150a
                if (r8 == 0) goto L_0x00cc
                int r8 = r8.getErrorCode()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                goto L_0x00cd
            L_0x00cc:
                r8 = r4
            L_0x00cd:
                r0[r2] = r8
                r2 = 7
                int r8 = r12.f282188g
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r0[r2] = r8
                r2 = 8
                int r8 = r12.f282188g
                if (r8 <= 0) goto L_0x00e0
                r8 = 2
                goto L_0x00e1
            L_0x00e0:
                r8 = 1
            L_0x00e1:
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r0[r2] = r8
                r2 = 9
                boolean r8 = r12.f282189h
                if (r8 == 0) goto L_0x00ee
                r6 = 3
            L_0x00ee:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r0[r2] = r6
                r2 = 10
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r6 = com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr.this
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView r6 = r6.f282150a
                java.lang.String r7 = ""
                if (r6 == 0) goto L_0x0104
                java.lang.String r6 = r6.getFilePath()
                if (r6 != 0) goto L_0x0105
            L_0x0104:
                r6 = r7
            L_0x0105:
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r8 == 0) goto L_0x010c
                goto L_0x012d
            L_0x010c:
                o80.a r8 = new o80.a     // Catch:{ Exception -> 0x0126, all -> 0x011f }
                r8.<init>(r6)     // Catch:{ Exception -> 0x0126, all -> 0x011f }
                java.lang.String r6 = r8.mo161326c()     // Catch:{ Exception -> 0x011d, all -> 0x011a }
                if (r6 != 0) goto L_0x0118
                goto L_0x012a
            L_0x0118:
                r7 = r6
                goto L_0x012a
            L_0x011a:
                r13 = move-exception
                r4 = r8
                goto L_0x0120
            L_0x011d:
                goto L_0x0128
            L_0x011f:
                r13 = move-exception
            L_0x0120:
                if (r4 == 0) goto L_0x0125
                r4.mo161327e()
            L_0x0125:
                throw r13
            L_0x0126:
                r8 = r4
            L_0x0128:
                if (r8 == 0) goto L_0x012d
            L_0x012a:
                r8.mo161327e()
            L_0x012d:
                r0[r2] = r7
                r2 = 11
                gw2.m r6 = r12.f282187f
                if (r6 == 0) goto L_0x013b
                long r6 = r6.f288089b
                java.lang.Long r4 = java.lang.Long.valueOf(r6)
            L_0x013b:
                r0[r2] = r4
                r2 = 12
                com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct r4 = jw2.C99069d.f290421d
                long r6 = r4.f266265e
                java.lang.Long r4 = java.lang.Long.valueOf(r6)
                r0[r2] = r4
                r2 = 13
                com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct r4 = jw2.C99069d.f290421d
                long r6 = r4.f266270j
                java.lang.Long r4 = java.lang.Long.valueOf(r6)
                r0[r2] = r4
                r2 = 14
                com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct r4 = jw2.C99069d.f290421d
                long r6 = r4.f266274n
                r8 = 1
                int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r4 != 0) goto L_0x0162
                goto L_0x0163
            L_0x0162:
                r5 = 0
            L_0x0163:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
                r0[r2] = r4
                r2 = 15
                com.tencent.mm.plugin.story.model.StoryCore$h r4 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
                kw2.j r4 = r4.mo134191i()
                gw2.m r5 = r12.f282187f
                r6 = 0
                if (r5 == 0) goto L_0x017a
                long r8 = r5.f288089b
                goto L_0x017b
            L_0x017a:
                r8 = r6
            L_0x017b:
                int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r5 < 0) goto L_0x0185
                int r5 = (int) r8
                kw2.i r4 = r4.mo138667Yt(r5)
                goto L_0x0189
            L_0x0185:
                kw2.i r4 = r4.mo138664Ow(r8)
            L_0x0189:
                if (r4 == 0) goto L_0x018d
                int r3 = r4.field_readCount
            L_0x018d:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0[r2] = r3
                r2 = 16
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r3 = com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr.this
                int r3 = r3.f282160k
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0[r2] = r3
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "reportTips: "
                r2.append(r3)
                java.lang.String r3 = java.util.Arrays.toString(r0)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                java.lang.Class<rz.r> r1 = p682rz.C101487r.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                rz.r r1 = (p682rz.C101487r) r1
                rz.n r1 = r1.mo140795W6()
                com.tencent.mm.modelcdntran.e0 r1 = (com.tencent.p014mm.modelcdntran.C92755e0) r1
                r1.mo126984h(r13, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr.C96448b.mo36227a(java.lang.String):void");
        }

        /* renamed from: b */
        public void mo36228b(C55394a.C55395a aVar) {
            this.f282186e = aVar;
        }

        /* renamed from: c */
        public boolean mo36229c(String str, int i, int i2) {
            C87412m.m108594g(str, "mediaId");
            C98268m mVar = this.f282187f;
            Integer num = null;
            if (mVar != null) {
                C34078m b = C97399u.f285903a.mo136668b(mVar);
                this.f282185d = b;
                if (b.mo59431l2()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("isVideoDataAvailable ");
                    sb.append(str);
                    sb.append(", ");
                    sb.append(i);
                    sb.append(", ");
                    sb.append(i2);
                    sb.append(", download finish cacheSize:");
                    C34078m mVar2 = this.f282185d;
                    if (mVar2 != null) {
                        num = Integer.valueOf(mVar2.field_cacheSize);
                    }
                    sb.append(num);
                    sb.append(" this:");
                    sb.append(this);
                    Log.m105924i("MicroMsg.VideoPlayProxy", sb.toString());
                    return true;
                }
            }
            boolean m = ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126989m(str, i, i2);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("isVideoDataAvailable ");
            sb4.append(str);
            sb4.append(", ");
            sb4.append(i);
            sb4.append(", ");
            sb4.append(i2);
            sb4.append(", available:");
            sb4.append(m);
            sb4.append(" cacheSize:");
            C34078m mVar3 = this.f282185d;
            if (mVar3 != null) {
                num = Integer.valueOf(mVar3.field_cacheSize);
            }
            sb4.append(num);
            sb4.append(" this:");
            sb4.append(this);
            Log.m105924i("MicroMsg.VideoPlayProxy", sb4.toString());
            return m;
        }

        /* renamed from: d */
        public void mo36230d(String str, int i, int i2) {
            C87412m.m108594g(str, "mediaId");
            C61926c.m72668M(new C96449a(this, str, i, i2));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00f2, code lost:
            r5 = r5.f288093f;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36231f(java.lang.String r24, java.lang.String r25, java.lang.String r26) {
            /*
                r23 = this;
                r0 = r23
                r2 = r24
                r1 = r25
                r3 = r26
                java.lang.Class<rz.q> r4 = p682rz.C36594q.class
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "startHttpStream "
                r5.append(r6)
                r5.append(r2)
                r6 = 32
                r5.append(r6)
                r5.append(r1)
                r5.append(r6)
                r5.append(r3)
                java.lang.String r6 = " this:"
                r5.append(r6)
                r5.append(r0)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "MicroMsg.VideoPlayProxy"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
                gw2.m r5 = r0.f282187f
                if (r5 == 0) goto L_0x03a4
                cw2.u r7 = cw2.C97399u.f285903a
                kw2.m r5 = r7.mo136668b(r5)
                r0.f282185d = r5
                java.lang.String r7 = r5.field_filePath
                boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
                r8 = 1
                r9 = 0
                if (r7 != 0) goto L_0x0098
                cw2.o r7 = cw2.C97391o.f285892a
                java.lang.String r10 = r5.field_filePath
                java.lang.String r11 = "it.field_filePath"
                gy3.C87412m.m108593f(r10, r11)
                r7.mo136650c(r10, r8)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r10 = "startHttpStream error downloadFinish "
                r7.append(r10)
                boolean r10 = r5.mo59431l2()
                r7.append(r10)
                java.lang.String r10 = " ret:"
                r7.append(r10)
                java.lang.String r10 = r5.field_filePath
                boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
                r7.append(r10)
                java.lang.String r10 = " path:"
                r7.append(r10)
                java.lang.String r10 = r5.field_filePath
                r7.append(r10)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                r5.field_cacheSize = r9
                r5.field_totalSize = r9
                com.tencent.mm.plugin.story.model.StoryCore$h r7 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
                kw2.n r7 = r7.mo134193k()
                r7.mo138677qq(r5)
            L_0x0098:
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r5 = com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr.this
                gw2.m r5 = r5.f282155f
                r10 = 0
                if (r5 == 0) goto L_0x00ee
                long r12 = jw2.C99068c.f290410e
                int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r7 > 0) goto L_0x00a7
                goto L_0x00b1
            L_0x00a7:
                java.lang.String r7 = "MicroMsg.StoryBrowseIDKeyStat"
                java.lang.String r12 = "startHttp"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r12)
                jw2.C99068c.f290416k = r8
            L_0x00b1:
                jw2.b r7 = jw2.C99066b.f290392a
                long r12 = r5.f288089b
                boolean r5 = r7.mo138407a()
                if (r5 != 0) goto L_0x00bc
                goto L_0x00ee
            L_0x00bc:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = "startHttp storyId "
                r5.append(r7)
                r5.append(r12)
                java.lang.String r5 = r5.toString()
                java.lang.String r7 = "MicroMsg.StoryBrowseDetailIDKeyStat"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r7, r5)
                java.util.Map<java.lang.Long, jw2.b$a> r5 = jw2.C99066b.f290394c
                java.lang.Long r7 = java.lang.Long.valueOf(r12)
                boolean r7 = r5.containsKey(r7)
                if (r7 != 0) goto L_0x00e0
                goto L_0x00ee
            L_0x00e0:
                java.lang.Long r7 = java.lang.Long.valueOf(r12)
                java.lang.Object r5 = r5.get(r7)
                jw2.b$a r5 = (jw2.C99066b.C99067a) r5
                if (r5 == 0) goto L_0x00ee
                r5.f290401b = r8
            L_0x00ee:
                gw2.m r5 = r0.f282187f
                if (r5 == 0) goto L_0x00f9
                te3.bc4 r5 = r5.f288093f
                if (r5 == 0) goto L_0x00f9
                java.lang.String r5 = r5.f297961f
                goto L_0x00fa
            L_0x00f9:
                r5 = 0
            L_0x00fa:
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 != 0) goto L_0x03a4
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r5 = com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr.this
                int r12 = r5.f282160k
                int r12 = r12 + r8
                r5.f282160k = r12
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView r5 = r5.f282150a
                if (r5 == 0) goto L_0x010e
                r5.setNeedShowLoading(r8)
            L_0x010e:
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr$a r5 = new com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr$a
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r12 = com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr.this
                r5.<init>()
                com.tencent.mm.modelvideo.a$a r12 = r0.f282186e
                r5.f282164e = r12
                kw2.m r12 = r0.f282185d
                gw2.m r13 = r0.f282187f
                r5.f282165f = r12
                r5.f282166g = r13
                gi.h r12 = new gi.h
                r12.<init>()
                java.lang.String r13 = "task_StoryVideoViewMgr"
                r12.f287660d = r13
                r12.field_mediaId = r2
                r12.f287705p0 = r3
                r12.f287689V = r8
                r3 = 6
                r12.f287655L = r3
                r13 = 4
                r12.f287696Y0 = r13
                r12.field_fullpath = r1
                r12.f287704f1 = r5
                r13 = 20302(0x4f4e, float:2.8449E-41)
                r12.field_fileType = r13
                di3.d r13 = di3.C86312j.m106911c(r4)
                rz.q r13 = (p682rz.C36594q) r13
                int r1 = r13.mo60729EJ(r8, r1)
                r12.field_requestVideoFormat = r1
                ow2.w r1 = ow2.C100604w.f294753a
                gw2.m r13 = r0.f282187f
                gy3.C87412m.m108591d(r13)
                r1.getClass()
                int r1 = r13.f288090c
                te3.bc4 r14 = r13.f288093f
                java.lang.String r14 = r14.f297961f
                if (r14 != 0) goto L_0x0170
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "story_local_video_"
                r14.append(r15)
                r14.append(r1)
                java.lang.String r1 = r14.toString()
                goto L_0x017b
            L_0x0170:
                long r10 = (long) r1
                java.lang.String r1 = "storyvideo"
                java.lang.String r7 = "story"
                java.lang.String r1 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r1, r10, r7, r14)
            L_0x017b:
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r7 == 0) goto L_0x0182
                r1 = 0
            L_0x0182:
                ow2.C100604w.f294764l = r1
                long r10 = r13.f288089b
                java.lang.Long r7 = java.lang.Long.valueOf(r10)
                ow2.C100604w.f294765m = r7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r10 = "markCurrentPlay:"
                r7.append(r10)
                java.lang.String r10 = ow2.C100604w.f294764l
                r7.append(r10)
                java.lang.String r10 = " then remove it from preload"
                r7.append(r10)
                java.lang.String r7 = r7.toString()
                java.lang.String r10 = "MicroMsg.StoryVideoPreloadMgr"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r7)
                java.util.List<ow2.w$c> r7 = ow2.C100604w.f294761i
                java.util.Iterator r7 = r7.iterator()
            L_0x01b0:
                boolean r11 = r7.hasNext()
                if (r11 == 0) goto L_0x01c6
                java.lang.Object r11 = r7.next()
                r13 = r11
                ow2.w$c r13 = (ow2.C100604w.C100610c) r13
                java.lang.String r13 = r13.f294788c
                boolean r13 = gy3.C87412m.m108589b(r1, r13)
                if (r13 == 0) goto L_0x01b0
                goto L_0x01c7
            L_0x01c6:
                r11 = 0
            L_0x01c7:
                ow2.w$c r11 = (ow2.C100604w.C100610c) r11
                if (r11 == 0) goto L_0x01d7
                java.util.List<ow2.w$c> r1 = ow2.C100604w.f294761i
                r1.remove(r11)
                ow2.w r1 = ow2.C100604w.f294753a
                gw2.m r7 = r11.f294786a
                r1.mo140061d(r7)
            L_0x01d7:
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r1 = com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr.this
                gw2.m r1 = r1.f282155f
                if (r1 == 0) goto L_0x0213
                jw2.b r7 = jw2.C99066b.f290392a
                long r13 = r1.f288089b
                kw2.m r1 = r0.f282185d
                if (r1 == 0) goto L_0x01f1
                int r1 = r1.field_cacheSize
                if (r1 != 0) goto L_0x01eb
                r1 = 1
                goto L_0x01ec
            L_0x01eb:
                r1 = 0
            L_0x01ec:
                if (r1 == 0) goto L_0x01ef
                goto L_0x01f1
            L_0x01ef:
                r1 = 0
                goto L_0x01f2
            L_0x01f1:
                r1 = 1
            L_0x01f2:
                java.util.Map<java.lang.Long, jw2.b$a> r7 = jw2.C99066b.f290394c
                java.lang.Long r11 = java.lang.Long.valueOf(r13)
                boolean r11 = r7.containsKey(r11)
                if (r11 != 0) goto L_0x01ff
                goto L_0x0213
            L_0x01ff:
                java.lang.Long r11 = java.lang.Long.valueOf(r13)
                java.lang.Object r7 = r7.get(r11)
                jw2.b$a r7 = (jw2.C99066b.C99067a) r7
                if (r7 == 0) goto L_0x0213
                long r13 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                r7.f290402c = r13
                r7.f290403d = r1
            L_0x0213:
                java.lang.Class<rz.r> r1 = p682rz.C101487r.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                rz.r r1 = (p682rz.C101487r) r1
                rz.n r1 = r1.mo140795W6()
                com.tencent.mm.modelcdntran.e0 r1 = (com.tencent.p014mm.modelcdntran.C92755e0) r1
                r1.mo126982f(r12)
                gw2.m r1 = r0.f282187f
                if (r1 == 0) goto L_0x03a4
                if (r2 == 0) goto L_0x03a4
                ow2.w r7 = ow2.C100604w.f294753a
                r7.getClass()
                cw2.u r7 = cw2.C97399u.f285903a
                int r11 = r1.f288090c
                te3.bc4 r12 = r1.f288093f
                java.lang.String r12 = r12.f297961f
                java.lang.String r11 = r7.mo136667a(r11, r12)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "checkPreloadOnVideoPlay:"
                r12.append(r13)
                r12.append(r11)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r12)
                kw2.m r7 = r7.mo136668b(r1)
                int r12 = r7.field_cacheSize
                java.lang.String r13 = ", preloadFinish:"
                java.lang.String r14 = ", length:"
                if (r12 <= 0) goto L_0x02f9
                int r15 = r7.field_totalSize
                if (r15 <= 0) goto L_0x02f9
                float r12 = (float) r12
                float r15 = (float) r15
                float r12 = r12 / r15
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r9 = "hit cache, mediaId:"
                r15.append(r9)
                r15.append(r11)
                java.lang.String r9 = ", cachePercent:"
                r15.append(r9)
                r15.append(r12)
                java.lang.String r9 = ", filePath:"
                r15.append(r9)
                java.lang.String r9 = r7.field_filePath
                r15.append(r9)
                java.lang.String r9 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
                java.lang.String r7 = r7.field_filePath
                com.tencent.mars.cdn.CdnLogic$C2CDownloadRequest r9 = new com.tencent.mars.cdn.CdnLogic$C2CDownloadRequest
                r9.<init>()
                r12 = 2
                long[] r12 = new long[r12]
                r9.fileKey = r11
                r9.fileType = r3
                te3.bc4 r1 = r1.f288093f
                java.lang.String r1 = r1.f297961f
                r9.url = r1
                r9.setSavePath(r7)
                di3.d r1 = di3.C86312j.m106911c(r4)
                rz.q r1 = (p682rz.C36594q) r1
                int r1 = r1.mo60729EJ(r8, r7)
                r9.requestVideoFormat = r1
                boolean r1 = com.tencent.mars.cdn.CdnLogic.queryVideoMoovInfo(r9, r12)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r11)
                java.lang.String r4 = " queryMoovReady: "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = ", offset:"
                r3.append(r1)
                r1 = 0
                r8 = r12[r1]
                r3.append(r8)
                r3.append(r14)
                r1 = 1
                r7 = r12[r1]
                r3.append(r7)
                r3.append(r13)
                java.util.Set<java.lang.String> r4 = ow2.C100604w.f294760h
                boolean r7 = sx3.C110818d0.m150903D(r4, r11)
                r3.append(r7)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
                ow2.w$b r3 = new ow2.w$b
                r17 = 1
                r8 = 0
                r18 = r12[r8]
                r20 = r12[r1]
                boolean r22 = sx3.C110818d0.m150903D(r4, r11)
                r16 = r3
                r16.<init>(r17, r18, r20, r22)
                goto L_0x031d
            L_0x02f9:
                r8 = 0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r11)
                java.lang.String r3 = " not hit cache or moov not ready"
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
                ow2.w$b r3 = new ow2.w$b
                r17 = 0
                r18 = 0
                r20 = 0
                r22 = 0
                r16 = r3
                r16.<init>(r17, r18, r20, r22)
            L_0x031d:
                r9 = r3
                boolean r1 = r9.f294782a
                if (r1 == 0) goto L_0x03a4
                boolean r1 = r5.f282163d
                if (r1 != 0) goto L_0x03a4
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "checkPreloadOnVideoPlay "
                r1.append(r3)
                r1.append(r2)
                java.lang.String r3 = ", moovReady, offset:"
                r1.append(r3)
                long r3 = r9.f294783b
                r1.append(r3)
                r1.append(r14)
                long r3 = r9.f294784c
                r1.append(r3)
                java.lang.String r3 = ", cacheSize:"
                r1.append(r3)
                kw2.m r3 = r0.f282185d
                if (r3 == 0) goto L_0x0355
                int r3 = r3.field_cacheSize
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                goto L_0x0356
            L_0x0355:
                r3 = 0
            L_0x0356:
                r1.append(r3)
                java.lang.String r3 = ", totalSize:"
                r1.append(r3)
                kw2.m r3 = r0.f282185d
                if (r3 == 0) goto L_0x0369
                int r3 = r3.field_totalSize
                java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
                goto L_0x036a
            L_0x0369:
                r7 = 0
            L_0x036a:
                r1.append(r7)
                r1.append(r13)
                boolean r3 = r9.f294785d
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
                long r3 = r9.f294783b
                r6 = 0
                int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r1 <= 0) goto L_0x03a4
                long r10 = r9.f294784c
                int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r1 <= 0) goto L_0x03a4
                com.tencent.mars.cdn.CdnLogic$VideoInfo r7 = new com.tencent.mars.cdn.CdnLogic$VideoInfo
                r7.<init>()
                r1 = r5
                r2 = r24
                r5 = r10
                r1.onMoovReady(r2, r3, r5, r7)
                kw2.m r1 = r0.f282185d
                if (r1 == 0) goto L_0x039d
                int r1 = r1.field_cacheSize
                goto L_0x039e
            L_0x039d:
                r1 = 0
            L_0x039e:
                r0.f282188g = r1
                boolean r1 = r9.f294785d
                r0.f282189h = r1
            L_0x03a4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr.C96448b.mo36231f(java.lang.String, java.lang.String, java.lang.String):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr$c */
    public static final class C96450c implements C96814a.C57541b {

        /* renamed from: d */
        public final /* synthetic */ StoryVideoViewMgr f282195d;

        public C96450c(StoryVideoViewMgr storyVideoViewMgr) {
            this.f282195d = storyVideoViewMgr;
        }

        /* renamed from: F */
        public void mo22955F(String str, String str2) {
            String unused = this.f282195d.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("videoViewCallback onVideoWaitingEnd: ");
            sb.append(str);
            sb.append(' ');
            StoryVideoView storyVideoView = this.f282195d.f282150a;
            sb.append(storyVideoView != null ? storyVideoView.getSessionId() : null);
            sb.append(", ");
            sb.append(this.f282195d.f282153d);
            sb.append(", meidiaId:");
            sb.append(str2);
            sb.append(", isVideoPause:");
            this.f282195d.getClass();
            sb.append(false);
            Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", sb.toString());
            if (C112551y.m153810j(str, this.f282195d.f282153d, false, 2, (Object) null)) {
                this.f282195d.getClass();
            }
        }

        /* renamed from: I1 */
        public void mo22956I1(String str, String str2) {
            String unused = this.f282195d.getClass();
            Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", "onVideoFirstFrameDraw: " + str + ", meidiaId:" + str2);
        }

        /* renamed from: I3 */
        public void mo22957I3(String str, String str2, Boolean bool) {
            C99066b.C99067a aVar;
            int i;
            bool.booleanValue();
            String unused = this.f282195d.getClass();
            Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onVideoWaiting: " + str + ", meidiaId:" + str2);
            C98268m mVar = this.f282195d.f282155f;
            if (mVar != null) {
                long j = mVar.f288089b;
                if (C99068c.f290410e > 0 && j != 0 && i == 0 && C99068c.f290409d <= 0 && C99068c.f290407b > 0) {
                    C99068c.f290417l = true;
                }
                if (C99066b.f290392a.mo138407a()) {
                    Map<Long, C99066b.C99067a> map = C99066b.f290394c;
                    if (map.containsKey(Long.valueOf(j)) && (aVar = map.get(Long.valueOf(j))) != null && aVar.f290401b) {
                        aVar.f290404e = true;
                    }
                }
            }
        }

        /* renamed from: L */
        public void mo22958L(String str, String str2) {
            C99066b.C99067a aVar;
            String unused = this.f282195d.getClass();
            Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onVideoEnded: " + str + ", meidiaId:" + str2);
            C99069d dVar = C99069d.f290418a;
            StoryPreviewReportStruct storyPreviewReportStruct = C99069d.f290421d;
            storyPreviewReportStruct.f266279s = storyPreviewReportStruct.f266279s + 1;
            C98268m mVar = this.f282195d.f282155f;
            if (mVar != null) {
                C99066b bVar = C99066b.f290392a;
                long j = mVar.f288089b;
                if (bVar.mo138407a()) {
                    Log.m105926v("MicroMsg.StoryBrowseDetailIDKeyStat", "onVideoEnd " + j);
                    Map<Long, C99066b.C99067a> map = C99066b.f290394c;
                    if (map.containsKey(Long.valueOf(j)) && (aVar = map.get(Long.valueOf(j))) != null) {
                        aVar.f290405f = true;
                    }
                }
            }
        }

        /* renamed from: T */
        public void mo22960T(String str, String str2, String str3, int i, int i2) {
            String unused = this.f282195d.getClass();
            Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onError: " + str + ", meidiaId:" + str2 + ", errorMsg:" + str3 + ", what:" + i + ", extra:" + i2);
        }

        /* renamed from: Z */
        public void mo22962Z(String str, String str2) {
            String unused = this.f282195d.getClass();
            Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onPrepared: " + str + ", meidiaId:" + str2);
        }

        /* renamed from: a0 */
        public void mo22963a0(String str, String str2) {
            String unused = this.f282195d.getClass();
            Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onVideoPause: " + str + ", meidiaId:" + str2);
        }

        /* renamed from: l0 */
        public void mo22964l0(String str, String str2, int i, int i2) {
            String unused = this.f282195d.getClass();
            Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onGetVideoSize: " + str + ", " + this.f282195d.f282153d + ", meidiaId:" + str2);
        }

        /* renamed from: m0 */
        public void mo22965m0(String str, String str2) {
            C99066b.C99067a aVar;
            String str3 = str;
            String unused = this.f282195d.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("videoViewCallback onVideoPlay: ");
            sb.append(str3);
            sb.append(' ');
            StoryVideoView storyVideoView = this.f282195d.f282150a;
            long j = null;
            sb.append(storyVideoView != null ? storyVideoView.getSessionId() : null);
            sb.append(", ");
            sb.append(this.f282195d.f282153d);
            sb.append(", meidiaId:");
            sb.append(str2);
            sb.append(", isVideoPause:");
            this.f282195d.getClass();
            sb.append(false);
            Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", sb.toString());
            if (C112551y.m153810j(str3, this.f282195d.f282153d, false, 2, (Object) null)) {
                this.f282195d.getClass();
            }
            C98268m mVar = this.f282195d.f282155f;
            if (mVar != null) {
                long j2 = mVar.f288089b;
                if (C99068c.f290410e > 0) {
                    if (C99068c.f290409d <= 0) {
                        Log.m105926v("MicroMsg.StoryBrowseIDKeyStat", "storyId  " + j2 + " markStoryId " + 0 + " onPlayCostTime " + C99068c.f290409d + " onResumeTime " + C99068c.f290407b + "  onPlayUser " + C99068c.f290408c);
                    }
                    int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                    if (i != 0 && i == 0 && C99068c.f290409d <= 0) {
                        long j3 = C99068c.f290407b;
                        if (j3 > 0) {
                            C99068c.f290409d = Util.milliSecondsToNow(j3);
                            C99068c.f290415j = Util.nowMilliSecond();
                            Log.m105924i("MicroMsg.StoryBrowseIDKeyStat", "canPlay " + C99068c.f290409d);
                            C99068c.f290417l = false;
                            C115669n nVar = C115669n.INSTANCE;
                            C115669n nVar2 = nVar;
                            nVar2.mo175913w(988, 34, C99068c.f290409d);
                            nVar2.mo175913w(988, 35, 1);
                            nVar2.mo175913w(988, 71, C99068c.f290409d);
                            nVar2.mo175913w(988, 70, 1);
                            if (NetStatusUtil.isWifi(MMApplicationContext.getContext()) || NetStatusUtil.is4G(MMApplicationContext.getContext())) {
                                C115669n nVar3 = nVar;
                                nVar3.mo175913w(988, 73, C99068c.f290409d);
                                nVar3.mo175913w(988, 72, 1);
                            }
                            long j4 = C99068c.f290409d;
                            if (j4 <= 400) {
                                nVar.mo175913w(988, 100, j4);
                            } else if (j4 <= 800) {
                                nVar.mo175913w(988, 101, j4);
                            } else if (j4 <= 1600) {
                                nVar.mo175913w(988, 102, j4);
                            } else if (j4 <= 3200) {
                                nVar.mo175913w(988, 103, j4);
                            } else if (j4 <= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                                nVar.mo175913w(988, 104, j4);
                            } else {
                                nVar.mo175913w(988, 105, j4);
                            }
                        }
                    }
                }
                C99066b bVar = C99066b.f290392a;
                long j5 = mVar.f288089b;
                if (bVar.mo138407a()) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("onVideoPlay storyId ");
                    sb4.append(j5);
                    sb4.append(" lastStoryId ");
                    sb4.append(C99066b.f290393b);
                    sb4.append(" contains:");
                    Map<Long, C99066b.C99067a> map = C99066b.f290394c;
                    sb4.append(map.containsKey(Long.valueOf(j5)));
                    sb4.append(" result");
                    C99066b.C99067a aVar2 = map.get(Long.valueOf(j5));
                    if (aVar2 != null) {
                        aVar2.getClass();
                        j = 0L;
                    }
                    sb4.append(j);
                    Log.m105926v("MicroMsg.StoryBrowseDetailIDKeyStat", sb4.toString());
                    if (j5 == C99066b.f290393b && map.containsKey(Long.valueOf(j5)) && (aVar = map.get(Long.valueOf(j5))) != null) {
                        aVar.getClass();
                    }
                }
                C100604w wVar = C100604w.f294753a;
                long j6 = mVar.f288089b;
                wVar.getClass();
                if (C100604w.f294767o != j6) {
                    C100604w.f294767o = j6;
                    if (C100604w.f294755c != 0) {
                        C100604w.C100605a aVar3 = C100604w.f294763k;
                        if (aVar3 != null) {
                            Log.m105924i("MicroMsg.GroupData.StoryVideoPreloadMgr", "resetWalk");
                            aVar3.f294773e = aVar3.f294769a;
                            aVar3.f294774f = aVar3.f294770b;
                            aVar3.f294775g = 0;
                        }
                        wVar.mo140069m(true);
                    }
                }
                String str4 = mVar.f288091d;
                C87412m.m108594g(str4, "username");
                C99265f g = StoryCore.f281736t.mo134189g();
                C99264e Ow = g.mo138640Ow(str4);
                boolean l2 = Ow.mo138638l2();
                long j7 = Ow.field_readId;
                long j8 = Ow.field_syncId;
                if (j7 != j8) {
                    Ow.field_readId = j8;
                    Ow.field_readTime = C31543z5.m39453c();
                    boolean SE = g.mo138641SE(Ow);
                    boolean l25 = Ow.mo138638l2();
                    if (SE && l2 && !l25) {
                        g.doNotify("notify_story_read", 1, Ow);
                    }
                }
            }
        }

        public void onSeekComplete(ITPPlayer iTPPlayer) {
        }
    }

    public StoryVideoViewMgr() {
        StoryVideoViewMgr$onlineVideoEventListener$1 storyVideoViewMgr$onlineVideoEventListener$1 = new StoryVideoViewMgr$onlineVideoEventListener$1(this, C40008f.f107254d);
        this.f282161l = storyVideoViewMgr$onlineVideoEventListener$1;
        Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", "init create StoryVideoViewMgr " + hashCode());
        storyVideoViewMgr$onlineVideoEventListener$1.alive();
        this.f282162m = new C96450c(this);
    }

    /* renamed from: b */
    public final void mo134424b(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        StoryVideoView storyVideoView;
        C87412m.m108594g(viewGroup, "parent");
        this.f282160k = 0;
        StoryVideoView storyVideoView2 = this.f282150a;
        boolean b = C87412m.m108589b(storyVideoView2 != null ? storyVideoView2.getParent() : null, viewGroup);
        StringBuilder sb = new StringBuilder();
        sb.append("attachVideoView, parent:");
        sb.append(viewGroup.hashCode());
        sb.append(", isVideoPause:");
        sb.append(false);
        sb.append(", currentSessionId:");
        sb.append(this.f282153d);
        sb.append(", isPlayingVideoItem:");
        sb.append(this.f282154e);
        sb.append(" videoView ");
        StoryVideoView storyVideoView3 = this.f282150a;
        sb.append(storyVideoView3 != null ? Integer.valueOf(storyVideoView3.hashCode()) : null);
        sb.append(" sameParent ");
        sb.append(b);
        sb.append(" this:");
        sb.append(hashCode());
        Log.printInfoStack("MicroMsg.Gallery.StoryVideoViewMgr", sb.toString(), new Object[0]);
        mo134426d(viewGroup, true);
        if (this.f282150a == null) {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            StoryVideoView storyVideoView4 = new StoryVideoView(context, (AttributeSet) null);
            this.f282150a = storyVideoView4;
            C96448b bVar = new C96448b();
            this.f282151b = bVar;
            storyVideoView4.setIOnlineVideoProxy(bVar);
            StoryVideoView storyVideoView5 = this.f282150a;
            if (storyVideoView5 != null) {
                storyVideoView5.setIMMVideoViewCallback(this.f282162m);
            }
            StoryVideoView storyVideoView6 = this.f282150a;
            if (storyVideoView6 != null) {
                storyVideoView6.setReporter(new C100614x(this));
            }
            this.f282154e = false;
        }
        if (!b) {
            if (layoutParams == null) {
                viewGroup.addView(this.f282150a);
            } else {
                viewGroup.addView(this.f282150a, layoutParams);
            }
        } else if (layoutParams != null && (storyVideoView = this.f282150a) != null) {
            storyVideoView.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (r7.f288092e == (r4 != null ? r4.f288092e : null)) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0055, code lost:
        if (r0 == r3) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0057, code lost:
        r0 = true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo134425c(gw2.C98268m r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r7, r0)
            int r0 = r7.f288088a
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0025
            gw2.m r4 = r6.f282155f
            if (r4 == 0) goto L_0x0017
            int r5 = r4.f288088a
            if (r5 != r0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x0025
            gw2.n r0 = r7.f288092e
            if (r4 == 0) goto L_0x0021
            gw2.n r4 = r4.f288092e
            goto L_0x0022
        L_0x0021:
            r4 = r3
        L_0x0022:
            if (r0 != r4) goto L_0x0025
            goto L_0x0057
        L_0x0025:
            te3.bc4 r0 = r7.f288093f
            java.lang.String r0 = r0.f297961f
            if (r0 == 0) goto L_0x0034
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r0 = 0
            goto L_0x0035
        L_0x0034:
            r0 = 1
        L_0x0035:
            if (r0 != 0) goto L_0x0059
            gw2.m r0 = r6.f282155f
            if (r0 == 0) goto L_0x0042
            te3.bc4 r0 = r0.f288093f
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = r0.f297961f
            goto L_0x0043
        L_0x0042:
            r0 = r3
        L_0x0043:
            te3.bc4 r4 = r7.f288093f
            java.lang.String r4 = r4.f297961f
            boolean r0 = gy3.C87412m.m108589b(r0, r4)
            if (r0 == 0) goto L_0x0059
            gw2.n r0 = r7.f288092e
            gw2.m r4 = r6.f282155f
            if (r4 == 0) goto L_0x0055
            gw2.n r3 = r4.f288092e
        L_0x0055:
            if (r0 != r3) goto L_0x0059
        L_0x0057:
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            r0 = r0 ^ r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "change:"
            r3.append(r4)
            r3.append(r0)
            r4 = 32
            r3.append(r4)
            boolean r4 = r6.f282156g
            r3.append(r4)
            java.lang.String r4 = ", "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = ", changeVideoItem: origin: "
            r3.append(r4)
            gw2.m r4 = r6.f282155f
            r3.append(r4)
            java.lang.String r4 = ", new: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = ",  change:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = " this:"
            r3.append(r4)
            int r4 = r6.hashCode()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = "MicroMsg.Gallery.StoryVideoViewMgr"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r5, r3, r4)
            if (r0 == 0) goto L_0x00bb
            r6.f282155f = r7
            boolean r7 = r6.f282156g
            if (r7 != 0) goto L_0x00b5
            if (r8 == 0) goto L_0x00bb
        L_0x00b5:
            r6.mo134428f(r1, r2)
            r6.mo134427e()
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr.mo134425c(gw2.m, boolean):void");
    }

    /* renamed from: d */
    public final void mo134426d(ViewGroup viewGroup, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("checkDetachVideoView, videoView:");
        StoryVideoView storyVideoView = this.f282150a;
        sb.append(storyVideoView != null ? storyVideoView.hashCode() : 0);
        sb.append(", isPlay:");
        StoryVideoView storyVideoView2 = this.f282150a;
        sb.append(storyVideoView2 != null ? storyVideoView2.isPlaying() : false);
        sb.append(", parent:");
        StoryVideoView storyVideoView3 = this.f282150a;
        ViewParent parent = storyVideoView3 != null ? storyVideoView3.getParent() : null;
        sb.append(parent != null ? parent.hashCode() : 0);
        sb.append(", newParent:");
        sb.append(viewGroup != null ? viewGroup.hashCode() : 0);
        sb.append(", isPlayingVideoItem:");
        sb.append(this.f282154e);
        Log.printInfoStack("MicroMsg.Gallery.StoryVideoViewMgr", sb.toString(), new Object[0]);
        StoryVideoView storyVideoView4 = this.f282150a;
        if ((storyVideoView4 != null ? storyVideoView4.getParent() : null) != null) {
            StoryVideoView storyVideoView5 = this.f282150a;
            if (!C87412m.m108589b(storyVideoView5 != null ? storyVideoView5.getParent() : null, viewGroup)) {
                mo134428f(false, true);
                StoryVideoView storyVideoView6 = this.f282150a;
                ViewParent parent2 = storyVideoView6 != null ? storyVideoView6.getParent() : null;
                C87412m.m108592e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent2).removeView(this.f282150a);
                this.f282155f = null;
            }
        }
    }

    /* renamed from: e */
    public final void mo134427e() {
        StringBuilder sb = new StringBuilder();
        sb.append("playVideo, ");
        boolean z = false;
        sb.append(false);
        sb.append(' ');
        sb.append(this.f282156g);
        sb.append(", ");
        sb.append(this.f282155f);
        Log.printInfoStack("MicroMsg.Gallery.StoryVideoViewMgr", sb.toString(), new Object[0]);
        Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", "setVideoViewProp, isMute:" + this.f282152c);
        StoryVideoView storyVideoView = this.f282150a;
        if (storyVideoView != null) {
            storyVideoView.setMute(this.f282152c);
        }
        this.f282156g = true;
        C98268m mVar = this.f282155f;
        Context context = null;
        if (mVar != null) {
            this.f282153d = UUID.randomUUID().toString();
            C96448b bVar = this.f282151b;
            if (bVar != null) {
                bVar.f282187f = mVar;
                bVar.f282185d = C97399u.f285903a.mo136668b(mVar);
                Log.m105924i("MicroMsg.VideoPlayProxy", "setStoryVideoItem " + mVar + " videoCache " + bVar.f282185d);
            }
            StoryVideoView storyVideoView2 = this.f282150a;
            if (storyVideoView2 != null) {
                storyVideoView2.mo134416k0(mVar, this.f282153d);
            }
            if (mVar.f288092e != C98269n.Empty) {
                z = true;
            }
            if (z) {
                this.f282154e = true;
            }
            if (!this.f282158i) {
                this.f282157h.mo139415b();
                this.f282158i = true;
            }
        }
        StoryPreviewReportStruct storyPreviewReportStruct = C99069d.f290421d;
        StoryVideoView storyVideoView3 = this.f282150a;
        if (storyVideoView3 != null) {
            context = storyVideoView3.getContext();
        }
        storyPreviewReportStruct.f266264d = (long) NetStatusUtil.getIOSNetType(context);
    }

    /* renamed from: f */
    public final void mo134428f(boolean z, boolean z2) {
        Log.printInfoStack("MicroMsg.Gallery.StoryVideoViewMgr", "stopVideo, detach: " + z, new Object[0]);
        if (this.f282154e) {
            this.f282153d = null;
            StoryVideoView storyVideoView = this.f282150a;
            if (storyVideoView != null) {
                storyVideoView.stop();
            }
            if (this.f282158i) {
                this.f282157h.mo139414a();
                this.f282158i = false;
            }
            this.f282154e = false;
        }
        if (z) {
            this.f282156g = false;
            mo134426d((ViewGroup) null, z2);
            C99069d dVar = C99069d.f290418a;
            C99069d.f290421d.f266271k = System.currentTimeMillis();
            if (z2) {
                dVar.mo138414c();
            }
        }
    }
}
