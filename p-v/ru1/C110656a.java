package ru1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.pigeon.C26955j;
import com.tencent.pigeon.TPPlayerApi;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.xweb.IXWebBroadcastListener;
import d03.C58010a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import j03.C60695a;
import j03.C60698b;
import java.util.HashMap;
import ky3.C88334c;
import ky3.C88336d;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p172io.flutter.plugin.common.EventChannel;
import p172io.flutter.view.TextureRegistry;
import pu1.C110250a;
import pu1.C110251b;
import pu1.C110254f;
import pu1.C110256h;
import pu1.C110257i;
import pu1.C62500c;
import pu1.C62501d;
import pu1.C62502j;
import qu1.C63330a;
import rr3.C110622b;
import rr3.C110625c0;
import rr3.C110632i;
import rr3.C110634k;
import rx3.C13598b0;
import rx3.C13604l;
import vp3.C111580c;
import yp3.C112478a;

/* renamed from: ru1.a */
public final class C110656a implements TPPlayerApi.TPFlutterApi, FlutterPlugin, C110251b.C110252a, ActivityAware {

    /* renamed from: d */
    public TextureRegistry f331059d;

    /* renamed from: e */
    public HashMap<Long, C110251b> f331060e = new HashMap<>();

    /* renamed from: f */
    public C88334c f331061f = C88336d.m110136a(Util.currentTicks());

    /* renamed from: g */
    public EventChannel f331062g;

    /* renamed from: h */
    public EventChannel.EventSink f331063h;

    /* renamed from: ru1.a$a */
    public static final class C110657a implements EventChannel.StreamHandler {

        /* renamed from: d */
        public final /* synthetic */ C110656a f331064d;

        public C110657a(C110656a aVar) {
            this.f331064d = aVar;
        }

        public void onCancel(Object obj) {
            this.f331064d.f331063h = null;
        }

        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            C87412m.m108594g(eventSink, "eventSink");
            this.f331064d.f331063h = eventSink;
        }
    }

    /* renamed from: a */
    public EventChannel.EventSink mo161672a() {
        return this.f331063h;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "flutterPluginBinding");
        C26955j.m35912A(flutterPluginBinding.getBinaryMessenger(), this);
        this.f331059d = flutterPluginBinding.getTextureRegistry();
        EventChannel eventChannel = new EventChannel(flutterPluginBinding.getBinaryMessenger(), "tp_player/event");
        this.f331062g = eventChannel;
        eventChannel.setStreamHandler(new C110657a(this));
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "flutterPluginBinding");
        C26955j.m35912A(flutterPluginBinding.getBinaryMessenger(), (TPPlayerApi.TPFlutterApi) null);
        EventChannel eventChannel = this.f331062g;
        if (eventChannel != null) {
            eventChannel.setStreamHandler((EventChannel.StreamHandler) null);
        }
        this.f331060e.clear();
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
    }

    public Boolean tpAddEffect(TPPlayerApi.TPPlayerRenderEffect tPPlayerRenderEffect) {
        C110634k kVar;
        C110250a aVar;
        C87412m.m108594g(tPPlayerRenderEffect, "arg");
        Log.m105924i("MicroMsg.FlutterThumbPlayerPlugin", "tpAddEffect playerId:" + tPPlayerRenderEffect.getPlayerId().longValue());
        Long playerId = tPPlayerRenderEffect.getPlayerId();
        C87412m.m108593f(playerId, "arg.playerId");
        C110251b bVar = this.f331060e.get(Long.valueOf(playerId.longValue()));
        boolean z = false;
        if (bVar != null) {
            Long startTimeMs = tPPlayerRenderEffect.getStartTimeMs();
            C87412m.m108593f(startTimeMs, "effect.startTimeMs");
            startTimeMs.longValue();
            Long endTimeMs = tPPlayerRenderEffect.getEndTimeMs();
            C87412m.m108593f(endTimeMs, "effect.endTimeMs");
            endTimeMs.longValue();
            Log.m105924i(bVar.f329787f, "createRenderEffect type:" + tPPlayerRenderEffect.getEffectType().longValue());
            Long effectType = tPPlayerRenderEffect.getEffectType();
            C87412m.m108593f(effectType, "effect.effectType");
            long longValue = effectType.longValue();
            C110250a[] values = C110250a.values();
            int length = values.length;
            int i = 0;
            while (true) {
                kVar = null;
                if (i >= length) {
                    aVar = null;
                    break;
                }
                aVar = values[i];
                if (longValue == ((long) aVar.ordinal())) {
                    break;
                }
                i++;
            }
            if (aVar == null) {
                aVar = C110250a.Unknown;
            }
            int ordinal = aVar.ordinal();
            double d = -1.0d;
            if (ordinal == 1) {
                String str = tPPlayerRenderEffect.getParams().get("contentOffsetPercent");
                if (str != null) {
                    Double.parseDouble(str);
                }
                String str2 = tPPlayerRenderEffect.getParams().get("contentOffsetPx");
                if (str2 != null) {
                    Double.parseDouble(str2);
                }
                String str3 = tPPlayerRenderEffect.getParams().get("radius");
                if (str3 != null) {
                    d = Double.parseDouble(str3);
                }
                String str4 = tPPlayerRenderEffect.getParams().get("blurTop");
                if (str4 != null) {
                    Boolean.parseBoolean(str4);
                }
                String str5 = tPPlayerRenderEffect.getParams().get("blurBottom");
                if (str5 != null) {
                    Boolean.parseBoolean(str5);
                }
                String str6 = tPPlayerRenderEffect.getParams().get("blurMaskRatio");
                if (str6 != null) {
                    Double.parseDouble(str6);
                }
                C110625c0 g = bVar.f329790i.f334033b.mo154927g(C110632i.GradientBlurEffect);
                C110634k kVar2 = g instanceof C110634k ? (C110634k) g : null;
                if (kVar2 != null) {
                    kVar2.mo162191d((float) d);
                    kVar = kVar2;
                }
            } else if (ordinal == 2) {
                String str7 = tPPlayerRenderEffect.getParams().get("radius");
                double parseDouble = str7 != null ? Double.parseDouble(str7) : -1.0d;
                String str8 = tPPlayerRenderEffect.getParams().get("sampleFactor");
                if (str8 != null) {
                    d = Double.parseDouble(str8);
                }
                C110625c0 g2 = bVar.f329790i.f334033b.mo154927g(C110632i.BlurEffect);
                C110622b bVar2 = g2 instanceof C110622b ? (C110622b) g2 : null;
                if (bVar2 != null) {
                    bVar2.mo162186d((float) parseDouble);
                    bVar2.mo162187e((float) d);
                    kVar = bVar2;
                }
            }
            if (kVar != null) {
                Log.m105924i(bVar.f329787f, "addRenderEffect");
                bVar.f329790i.f334033b.mo154923c(kVar);
                HashMap<Long, C110625c0> hashMap = bVar.f329794p;
                Long effectId = tPPlayerRenderEffect.getEffectId();
                C87412m.m108593f(effectId, "effect.effectId");
                hashMap.put(effectId, kVar);
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpClearEffect(Long l) {
        boolean z;
        C110251b bVar = this.f331060e.get(Long.valueOf(l.longValue()));
        if (bVar == null) {
            z = false;
        } else {
            bVar.f329790i.f334033b.mo154926f();
            bVar.f329794p.clear();
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public TPPlayerApi.TPVideoSizeRet tpGetVideoSize(Long l) {
        C62502j jVar;
        C110251b bVar = this.f331060e.get(Long.valueOf(l.longValue()));
        C13604l lVar = null;
        int i = 0;
        if (!(bVar == null || (jVar = bVar.f329791j) == null)) {
            C60698b bVar2 = jVar.f172872c;
            Integer valueOf = Integer.valueOf(bVar2 != null ? bVar2.getVideoWidth() : 0);
            C60698b bVar3 = jVar.f172872c;
            lVar = new C13604l(valueOf, Integer.valueOf(bVar3 != null ? bVar3.getVideoHeight() : 0));
        }
        TPPlayerApi.TPVideoSizeRet tPVideoSizeRet = new TPPlayerApi.TPVideoSizeRet();
        tPVideoSizeRet.setWidth(Long.valueOf((long) (lVar != null ? ((Number) lVar.f38555d).intValue() : 0)));
        if (lVar != null) {
            i = ((Number) lVar.f38556e).intValue();
        }
        tPVideoSizeRet.setHeight(Long.valueOf((long) i));
        return tPVideoSizeRet;
    }

    public Boolean tpPlaySetScaleType(TPPlayerApi.TPPlayerScaleTypeParams tPPlayerScaleTypeParams) {
        C87412m.m108594g(tPPlayerScaleTypeParams, "arg");
        Long playerId = tPPlayerScaleTypeParams.getPlayerId();
        C87412m.m108593f(playerId, "arg.playerId");
        C110251b bVar = this.f331060e.get(Long.valueOf(playerId.longValue()));
        boolean z = false;
        if (bVar != null) {
            int longValue = (int) tPPlayerScaleTypeParams.getScaleType().longValue();
            C111580c cVar = bVar.f329790i;
            cVar.f334016y = longValue;
            String str = cVar.f334011t;
            C112478a.m153625c(str, "setScaleType:" + longValue, new Object[0]);
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Long tpPlayerCreate(Long l) {
        l.longValue();
        TextureRegistry textureRegistry = this.f331059d;
        long j = 0;
        if (textureRegistry != null) {
            long i = this.f331061f.mo122719i();
            while (this.f331060e.containsKey(Long.valueOf(i))) {
                i = this.f331061f.mo122719i();
            }
            TextureRegistry.SurfaceTextureEntry createSurfaceTexture = textureRegistry.createSurfaceTexture();
            if (createSurfaceTexture != null) {
                C110251b bVar = new C110251b(createSurfaceTexture, this);
                this.f331060e.put(Long.valueOf(i), bVar);
                j = i;
            }
        }
        return Long.valueOf(j);
    }

    public TPPlayerApi.TPPlayerRange tpPlayerGetPlayRange(Long l) {
        long longValue = l.longValue();
        long j = -1;
        TPPlayerApi.TPPlayerRange.Builder endTimeMs = new TPPlayerApi.TPPlayerRange.Builder().setStartTimeMs(-1L).setEndTimeMs(-1L);
        C87412m.m108593f(endTimeMs, "Builder()\n            .s…        .setEndTimeMs(-1)");
        C110251b bVar = this.f331060e.get(Long.valueOf(longValue));
        if (bVar == null) {
            TPPlayerApi.TPPlayerRange build = endTimeMs.build();
            C87412m.m108593f(build, "errorPlayRange.build()");
            return build;
        }
        C62502j jVar = bVar.f329791j;
        long j2 = jVar != null ? jVar.f172892w : -1;
        if (jVar != null) {
            j = jVar.f172893x;
        }
        TPPlayerApi.TPPlayerRange build2 = endTimeMs.setStartTimeMs(Long.valueOf(j2)).setEndTimeMs(Long.valueOf(j)).build();
        C87412m.m108593f(build2, "errorPlayRange\n         …eMs)\n            .build()");
        return build2;
    }

    public Long tpPlayerInit(TPPlayerApi.TPPlayerInitParams tPPlayerInitParams) {
        long j;
        C87412m.m108594g(tPPlayerInitParams, "arg");
        Log.m105924i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerInit playerId:" + tPPlayerInitParams.getPlayerId().longValue() + ", width:" + tPPlayerInitParams.getWidth().longValue() + ", height:" + tPPlayerInitParams.getHeight().longValue());
        Long playerId = tPPlayerInitParams.getPlayerId();
        C87412m.m108593f(playerId, "arg.playerId");
        long longValue = playerId.longValue();
        Long width = tPPlayerInitParams.getWidth();
        C87412m.m108593f(width, "arg.width");
        long longValue2 = width.longValue();
        Long height = tPPlayerInitParams.getHeight();
        C87412m.m108593f(height, "arg.height");
        long longValue3 = height.longValue();
        C110251b bVar = this.f331060e.get(Long.valueOf(longValue));
        if (bVar == null) {
            j = 0;
        } else {
            int i = (int) longValue2;
            int i2 = (int) longValue3;
            String str = bVar.f329787f;
            Log.m105924i(str, "init: [" + i + ',' + i2 + ']');
            bVar.f329788g.setDefaultBufferSize(i, i2);
            C111580c cVar = bVar.f329790i;
            SurfaceTexture surfaceTexture = bVar.f329788g;
            cVar.getClass();
            cVar.f334038g = new Surface(surfaceTexture);
            cVar.mo163272i(i, i2);
            cVar.mo163261d();
            bVar.f329790i.mo163265m(bVar);
            j = bVar.f329789h;
        }
        return Long.valueOf(j);
    }

    public Boolean tpPlayerPause(Long l) {
        long longValue = l.longValue();
        Log.m105924i("MicroMsg.FlutterThumbPlayerPlugin", "tpPause playerId:" + longValue);
        C110251b bVar = this.f331060e.get(Long.valueOf(longValue));
        boolean z = false;
        if (bVar != null) {
            Log.m105924i(bVar.f329787f, "pause");
            bVar.f329793o = false;
            C62502j jVar = bVar.f329791j;
            if (jVar != null) {
                C60695a.C60696a.m70998a(jVar, false, 1, (Object) null);
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpPlayerPlay(Long l) {
        boolean z;
        long longValue = l.longValue();
        Log.m105924i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerPlay playerId:" + longValue);
        C110251b bVar = this.f331060e.get(Long.valueOf(longValue));
        if (bVar == null) {
            z = false;
        } else {
            Log.m105924i(bVar.f329787f, IXWebBroadcastListener.STAGE_START);
            bVar.f329793o = true;
            C62502j jVar = bVar.f329791j;
            if (jVar != null) {
                jVar.mo85619m();
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpPlayerPrepare(Long l) {
        boolean z;
        long longValue = l.longValue();
        Log.m105924i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerPrepare playerId:" + longValue);
        C110251b bVar = this.f331060e.get(Long.valueOf(longValue));
        if (bVar == null) {
            z = false;
        } else {
            Log.m105924i(bVar.f329787f, "prepare");
            C62502j jVar = bVar.f329791j;
            if (jVar != null) {
                jVar.prepare();
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpPlayerSeek(TPPlayerApi.TPPlayerSeekParams tPPlayerSeekParams) {
        boolean z;
        C87412m.m108594g(tPPlayerSeekParams, "arg");
        Long playerId = tPPlayerSeekParams.getPlayerId();
        C87412m.m108593f(playerId, "arg.playerId");
        long longValue = playerId.longValue();
        Long timeMs = tPPlayerSeekParams.getTimeMs();
        C87412m.m108593f(timeMs, "arg.timeMs");
        long longValue2 = timeMs.longValue();
        C110251b bVar = this.f331060e.get(Long.valueOf(longValue));
        if (bVar == null) {
            z = false;
        } else {
            int i = (int) longValue2;
            String str = bVar.f329787f;
            Log.m105924i(str, "seek:" + i);
            C62502j jVar = bVar.f329791j;
            if (jVar != null) {
                C60695a.C60696a.m70999b(jVar, i, true, (C32226l) null, 4, (Object) null);
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpPlayerSetLoop(TPPlayerApi.TPPlayerSetLoopParams tPPlayerSetLoopParams) {
        boolean z;
        C87412m.m108594g(tPPlayerSetLoopParams, "arg");
        Long playerId = tPPlayerSetLoopParams.getPlayerId();
        C87412m.m108593f(playerId, "arg.playerId");
        C110251b bVar = this.f331060e.get(Long.valueOf(playerId.longValue()));
        if (bVar == null) {
            z = false;
        } else {
            Boolean loop = tPPlayerSetLoopParams.getLoop();
            C87412m.m108593f(loop, "arg.loop");
            boolean booleanValue = loop.booleanValue();
            C62502j jVar = bVar.f329791j;
            if (jVar != null) {
                jVar.setLoop(booleanValue);
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpPlayerSetMediaInfo(TPPlayerApi.TPPlayerSetMediaInfoParams tPPlayerSetMediaInfoParams) {
        boolean z;
        C87412m.m108594g(tPPlayerSetMediaInfoParams, "arg");
        Long playerId = tPPlayerSetMediaInfoParams.getPlayerId();
        C87412m.m108593f(playerId, "arg.playerId");
        C110251b bVar = this.f331060e.get(Long.valueOf(playerId.longValue()));
        if (bVar == null) {
            z = false;
        } else {
            String mediaId = tPPlayerSetMediaInfoParams.getMediaId();
            C87412m.m108593f(mediaId, "arg.mediaId");
            String path = tPPlayerSetMediaInfoParams.getPath();
            C87412m.m108593f(path, "arg.path");
            String url = tPPlayerSetMediaInfoParams.getUrl();
            C87412m.m108593f(url, "arg.url");
            Long videoWidth = tPPlayerSetMediaInfoParams.getVideoWidth();
            C87412m.m108593f(videoWidth, "arg.videoWidth");
            long longValue = videoWidth.longValue();
            Long videoHeight = tPPlayerSetMediaInfoParams.getVideoHeight();
            C87412m.m108593f(videoHeight, "arg.videoHeight");
            long longValue2 = videoHeight.longValue();
            Boolean isLocal = tPPlayerSetMediaInfoParams.getIsLocal();
            C87412m.m108593f(isLocal, "arg.isLocal");
            boolean booleanValue = isLocal.booleanValue();
            C58010a aVar = new C58010a(mediaId, path, url, (int) longValue, (int) longValue2);
            aVar.f165931c = tPPlayerSetMediaInfoParams.getUrlToken();
            aVar.f165932d = tPPlayerSetMediaInfoParams.getDecodeKey();
            aVar.f165933e = booleanValue;
            int i = C110251b.f329784q;
            String str = bVar.f329787f;
            Log.m105924i(str, "setMediaInfo:" + aVar);
            bVar.mo161671d();
            C62502j jVar = bVar.f329791j;
            if (jVar != null) {
                jVar.mo85613h(new C62500c(bVar));
            }
            C62502j jVar2 = bVar.f329791j;
            if (jVar2 != null) {
                jVar2.setMediaInfo(aVar);
            }
            C62502j jVar3 = bVar.f329791j;
            if (jVar3 != null) {
                jVar3.f172880k = true;
            }
            Surface surface = bVar.f329792n;
            if (!(surface == null || jVar3 == null)) {
                jVar3.mo85606d(surface, bVar.f329793o);
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpPlayerSetMediaProto(TPPlayerApi.TPPlayerSetMediaProtoParams tPPlayerSetMediaProtoParams) {
        boolean z;
        C87412m.m108594g(tPPlayerSetMediaProtoParams, "arg");
        Log.m105924i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerSetMediaProto playerId:" + tPPlayerSetMediaProtoParams.getPlayerId().longValue());
        Long playerId = tPPlayerSetMediaProtoParams.getPlayerId();
        C87412m.m108593f(playerId, "arg.playerId");
        C110251b bVar = this.f331060e.get(Long.valueOf(playerId.longValue()));
        if (bVar == null) {
            z = false;
        } else {
            C63330a aVar = C63330a.values()[(int) tPPlayerSetMediaProtoParams.getMediaType().longValue()];
            byte[] mediaProto = tPPlayerSetMediaProtoParams.getMediaProto();
            C87412m.m108593f(mediaProto, "arg.mediaProto");
            C87412m.m108594g(aVar, "mediaType");
            Log.m105924i(bVar.f329787f, "setMediaProto");
            bVar.mo161671d();
            C62502j jVar = bVar.f329791j;
            if (jVar != null) {
                jVar.mo85613h(new C62501d(bVar));
            }
            C62502j jVar2 = bVar.f329791j;
            if (jVar2 != null) {
                jVar2.f177549K = aVar;
            }
            if (jVar2 != null) {
                jVar2.f177550L = mediaProto;
            }
            z = true;
            if (jVar2 != null) {
                jVar2.f172880k = true;
            }
            Surface surface = bVar.f329792n;
            if (!(surface == null || jVar2 == null)) {
                jVar2.mo85606d(surface, bVar.f329793o);
            }
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpPlayerSetMute(TPPlayerApi.TPPlayerSetMuteParams tPPlayerSetMuteParams) {
        boolean z;
        C87412m.m108594g(tPPlayerSetMuteParams, "arg");
        Log.m105924i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerSetMute mute:" + tPPlayerSetMuteParams.getMute().booleanValue());
        Long playerId = tPPlayerSetMuteParams.getPlayerId();
        C87412m.m108593f(playerId, "arg.playerId");
        C110251b bVar = this.f331060e.get(Long.valueOf(playerId.longValue()));
        if (bVar == null) {
            z = false;
        } else {
            Boolean mute = tPPlayerSetMuteParams.getMute();
            C87412m.m108593f(mute, "arg.mute");
            boolean booleanValue = mute.booleanValue();
            C62502j jVar = bVar.f329791j;
            if (jVar != null) {
                jVar.setMute(booleanValue);
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpPlayerSetPlayRange(TPPlayerApi.TPPlayerSetPlayRangeParams tPPlayerSetPlayRangeParams) {
        boolean z;
        C87412m.m108594g(tPPlayerSetPlayRangeParams, "arg");
        Long playerId = tPPlayerSetPlayRangeParams.getPlayerId();
        C87412m.m108593f(playerId, "arg.playerId");
        C110251b bVar = this.f331060e.get(Long.valueOf(playerId.longValue()));
        if (bVar == null) {
            z = false;
        } else {
            Long startTimeMs = tPPlayerSetPlayRangeParams.getStartTimeMs();
            C87412m.m108593f(startTimeMs, "arg.startTimeMs");
            long longValue = startTimeMs.longValue();
            Long endTimeMs = tPPlayerSetPlayRangeParams.getEndTimeMs();
            C87412m.m108593f(endTimeMs, "arg.endTimeMs");
            long longValue2 = endTimeMs.longValue();
            String str = bVar.f329787f;
            Log.m105924i(str, "setPlayRange:[" + longValue + ", " + longValue2 + ']');
            C62502j jVar = bVar.f329791j;
            if (jVar != null) {
                jVar.mo85603a(longValue, longValue2);
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpPlayerSetStreamType(TPPlayerApi.TPPlayerSetStreamTypeParams tPPlayerSetStreamTypeParams) {
        boolean z;
        C87412m.m108594g(tPPlayerSetStreamTypeParams, "arg");
        Log.m105924i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerSetStreamType streamType:" + tPPlayerSetStreamTypeParams.getStreamType().longValue());
        Long playerId = tPPlayerSetStreamTypeParams.getPlayerId();
        C87412m.m108593f(playerId, "arg.playerId");
        C110251b bVar = this.f331060e.get(Long.valueOf(playerId.longValue()));
        if (bVar == null) {
            z = false;
        } else {
            int longValue = (int) tPPlayerSetStreamTypeParams.getStreamType().longValue();
            C62502j jVar = bVar.f329791j;
            if (jVar != null) {
                jVar.f172895z = longValue;
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpRelease(Long l) {
        long longValue = l.longValue();
        Log.m105924i("MicroMsg.FlutterThumbPlayerPlugin", "tpRelease playerId:" + longValue);
        C110251b bVar = this.f331060e.get(Long.valueOf(longValue));
        boolean z = false;
        if (bVar != null) {
            Log.m105924i(bVar.f329787f, "release");
            bVar.f329793o = false;
            C62502j jVar = bVar.f329791j;
            if (jVar != null) {
                jVar.mo85609g();
            }
            C62502j jVar2 = bVar.f329791j;
            if (jVar2 != null) {
                C60695a.C60696a.m71001d(jVar2, (C32224a) null, 1, (Object) null);
            }
            C62502j jVar3 = bVar.f329791j;
            if (jVar3 != null) {
                jVar3.stop();
            }
            C62502j jVar4 = bVar.f329791j;
            if (jVar4 != null) {
                jVar4.recycle();
            }
            bVar.f329791j = null;
            bVar.f329785d.release();
            bVar.f329790i.mo163270f();
            bVar.f329790i.mo163259b();
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpRemoveEffect(TPPlayerApi.TPPlayerRenderEffect tPPlayerRenderEffect) {
        C87412m.m108594g(tPPlayerRenderEffect, "arg");
        Long playerId = tPPlayerRenderEffect.getPlayerId();
        C87412m.m108593f(playerId, "arg.playerId");
        C110251b bVar = this.f331060e.get(Long.valueOf(playerId.longValue()));
        boolean z = false;
        if (bVar != null) {
            Long effectId = tPPlayerRenderEffect.getEffectId();
            C87412m.m108593f(effectId, "effect.effectId");
            C110625c0 c0Var = bVar.f329794p.get(Long.valueOf(effectId.longValue()));
            if (c0Var != null) {
                bVar.f329790i.f334033b.mo154935o(c0Var);
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpSetOnFirstFrameRenderedListener(Long l) {
        boolean z;
        long longValue = l.longValue();
        C110251b bVar = this.f331060e.get(Long.valueOf(longValue));
        if (bVar == null) {
            z = false;
        } else {
            C62502j jVar = bVar.f329791j;
            if (jVar != null) {
                jVar.mo85636w(new C110254f(longValue, bVar));
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpSetOnPreparedListener(Long l) {
        boolean z;
        long longValue = l.longValue();
        C110251b bVar = this.f331060e.get(Long.valueOf(longValue));
        if (bVar == null) {
            z = false;
        } else {
            C62502j jVar = bVar.f329791j;
            if (jVar != null) {
                jVar.f172884o = new C110256h(longValue, bVar);
                if (jVar.mo85632s()) {
                    C60698b bVar2 = jVar.f172872c;
                    C32226l<? super ITPPlayer, C13598b0> lVar = jVar.f172884o;
                    if (lVar != null) {
                        lVar.invoke(bVar2);
                    }
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpSetProgressListener(Long l) {
        boolean z;
        long longValue = l.longValue();
        C110251b bVar = this.f331060e.get(Long.valueOf(longValue));
        if (bVar == null) {
            z = false;
        } else {
            C62502j jVar = bVar.f329791j;
            if (jVar != null) {
                jVar.mo85620n(new C110257i(longValue, bVar), 33);
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpStop(Long l) {
        long longValue = l.longValue();
        Log.m105924i("MicroMsg.FlutterThumbPlayerPlugin", "tpStop playerId:" + longValue);
        C110251b bVar = this.f331060e.get(Long.valueOf(longValue));
        boolean z = false;
        if (bVar != null) {
            Log.m105924i(bVar.f329787f, "stop");
            bVar.f329793o = false;
            C62502j jVar = bVar.f329791j;
            if (jVar != null) {
                jVar.stop();
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpUpdateDisplaySize(TPPlayerApi.TPPlayerUpdateSizeParams tPPlayerUpdateSizeParams) {
        boolean z;
        C87412m.m108594g(tPPlayerUpdateSizeParams, "arg");
        Log.m105924i("MicroMsg.FlutterThumbPlayerPlugin", "tpUpdateDisplaySize playerId:" + tPPlayerUpdateSizeParams.getPlayerId().longValue() + ", width:" + tPPlayerUpdateSizeParams.getWidth().longValue() + ", height:" + tPPlayerUpdateSizeParams.getHeight().longValue());
        Long playerId = tPPlayerUpdateSizeParams.getPlayerId();
        C87412m.m108593f(playerId, "arg.playerId");
        C110251b bVar = this.f331060e.get(Long.valueOf(playerId.longValue()));
        if (bVar == null) {
            z = false;
        } else {
            int longValue = (int) tPPlayerUpdateSizeParams.getWidth().longValue();
            int longValue2 = (int) tPPlayerUpdateSizeParams.getHeight().longValue();
            String str = bVar.f329787f;
            Log.m105924i(str, "updateRenderSize: [" + longValue + ',' + longValue2 + ']');
            bVar.f329790i.mo163272i(longValue, longValue2);
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean tpUpdateEffect(TPPlayerApi.TPPlayerRenderEffect tPPlayerRenderEffect) {
        boolean z;
        C87412m.m108594g(tPPlayerRenderEffect, "arg");
        Long playerId = tPPlayerRenderEffect.getPlayerId();
        C87412m.m108593f(playerId, "arg.playerId");
        C110251b bVar = this.f331060e.get(Long.valueOf(playerId.longValue()));
        if (bVar == null) {
            z = false;
        } else {
            Long effectId = tPPlayerRenderEffect.getEffectId();
            C87412m.m108593f(effectId, "effect.effectId");
            C110625c0 c0Var = bVar.f329794p.get(Long.valueOf(effectId.longValue()));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
