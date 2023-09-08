package m10;

import android.content.Context;
import android.view.Surface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.tav.core.AssetExtension;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.EventChannel;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;
import p172io.flutter.view.TextureRegistry;
import tm0.C14016b0;

/* renamed from: m10.g */
public class C117500g implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: d */
    public MethodChannel f351603d;

    /* renamed from: e */
    public FlutterPlugin.FlutterPluginBinding f351604e;

    /* renamed from: f */
    public final Map<Long, C117501a> f351605f = new HashMap();

    /* renamed from: m10.g$a */
    public class C117501a {

        /* renamed from: a */
        public C117492b f351606a;

        /* renamed from: b */
        public Surface f351607b;

        /* renamed from: c */
        public final TextureRegistry.SurfaceTextureEntry f351608c;

        /* renamed from: d */
        public C117494d f351609d = new C117494d();

        /* renamed from: e */
        public final EventChannel f351610e;

        public C117501a(C117500g gVar, Context context, EventChannel eventChannel, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, String str, MethodChannel.Result result, Class<? extends C117492b> cls) {
            this.f351610e = eventChannel;
            this.f351608c = surfaceTextureEntry;
            try {
                C117492b bVar = (C117492b) cls.newInstance();
                this.f351606a = bVar;
                bVar.init(context);
                this.f351606a.mo182202b(str);
                eventChannel.setStreamHandler(new C117498e(this));
                Surface surface = new Surface(surfaceTextureEntry.surfaceTexture());
                this.f351607b = surface;
                this.f351606a.mo182203c(surface);
                this.f351606a.mo182206f();
                this.f351606a.mo182204d(new C117499f(this));
                HashMap hashMap = new HashMap();
                hashMap.put("textureId", Long.valueOf(surfaceTextureEntry.mo159349id()));
                result.success(hashMap);
            } catch (IllegalAccessException e) {
                e.toString();
                throw new RuntimeException("video class is empty.");
            } catch (InstantiationException e2) {
                e2.toString();
                throw new RuntimeException("video class is empty.");
            }
        }

        /* renamed from: a */
        public void mo182214a() {
            this.f351608c.release();
            this.f351610e.setStreamHandler((EventChannel.StreamHandler) null);
            Surface surface = this.f351607b;
            if (surface != null) {
                surface.release();
            }
            C117492b bVar = this.f351606a;
            if (bVar != null) {
                bVar.release();
            }
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.tencent.mm.flutter/videoPlayer");
        this.f351603d = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f351604e = flutterPluginBinding;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.f351603d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
            this.f351603d = null;
            for (C117501a a : ((HashMap) this.f351605f).values()) {
                a.mo182214a();
            }
            ((HashMap) this.f351605f).clear();
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        TextureRegistry textureRegistry = this.f351604e.getTextureRegistry();
        if (textureRegistry == null) {
            result.error("no_activity", "video_player plugin requires a foreground activity", (Object) null);
            return;
        }
        String str = methodCall.method;
        str.getClass();
        if (str.equals("create")) {
            TextureRegistry.SurfaceTextureEntry createSurfaceTexture = textureRegistry.createSurfaceTexture();
            BinaryMessenger binaryMessenger = this.f351604e.getBinaryMessenger();
            EventChannel eventChannel = new EventChannel(binaryMessenger, "com.tencent.mm.flutter/videoPlayer/videoEvents" + createSurfaceTexture.mo159349id());
            if (methodCall.argument("asset") != null) {
                C117501a aVar = new C117501a(this, this.f351604e.getApplicationContext(), eventChannel, createSurfaceTexture, (String) methodCall.argument("asset"), result, (Class<? extends C117492b>) null);
                ((HashMap) this.f351605f).put(Long.valueOf(createSurfaceTexture.mo159349id()), aVar);
                return;
            }
            C117501a aVar2 = new C117501a(this, this.f351604e.getApplicationContext(), eventChannel, createSurfaceTexture, (String) methodCall.argument("uri"), result, (Class<? extends C117492b>) null);
            ((HashMap) this.f351605f).put(Long.valueOf(createSurfaceTexture.mo159349id()), aVar2);
        } else if (!str.equals(APMidasPluginInfo.LAUNCH_INTERFACE_INIT)) {
            long longValue = ((Number) methodCall.argument("textureId")).longValue();
            C117501a aVar3 = (C117501a) ((HashMap) this.f351605f).get(Long.valueOf(longValue));
            if (aVar3 == null) {
                result.error("Unknown textureId", "No video player associated with texture id " + longValue, (Object) null);
                return;
            }
            String str2 = methodCall.method;
            str2.getClass();
            char c = 65535;
            int i = 2;
            switch (str2.hashCode()) {
                case -971364356:
                    if (str2.equals("setLooping")) {
                        c = 0;
                        break;
                    }
                    break;
                case -906224877:
                    if (str2.equals("seekTo")) {
                        c = 1;
                        break;
                    }
                    break;
                case -797672260:
                    if (str2.equals("setOutputMute")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3443508:
                    if (str2.equals(AssetExtension.SCENE_PLAY)) {
                        c = 3;
                        break;
                    }
                    break;
                case 106440182:
                    if (str2.equals("pause")) {
                        c = 4;
                        break;
                    }
                    break;
                case 670514716:
                    if (str2.equals(C14016b0.NAME)) {
                        c = 5;
                        break;
                    }
                    break;
                case 747804969:
                    if (str2.equals("position")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1671767583:
                    if (str2.equals("dispose")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    boolean booleanValue = ((Boolean) methodCall.argument("looping")).booleanValue();
                    C117492b bVar = aVar3.f351606a;
                    if (!booleanValue) {
                        i = 0;
                    }
                    bVar.mo182205e(i);
                    result.success((Object) null);
                    return;
                case 1:
                    aVar3.f351606a.seekTo(((Number) methodCall.argument(FirebaseAnalytics.C113379b.LOCATION)).intValue());
                    result.success((Object) null);
                    return;
                case 2:
                    aVar3.f351606a.setOutputMute(((Boolean) methodCall.argument("outputMute")).booleanValue());
                    result.success((Object) null);
                    return;
                case 3:
                    aVar3.f351606a.mo182201a(true);
                    result.success((Object) null);
                    return;
                case 4:
                    aVar3.f351606a.mo182201a(false);
                    result.success((Object) null);
                    return;
                case 5:
                    aVar3.f351606a.setVolume((float) Math.max(0.0d, Math.min(1.0d, ((Double) methodCall.argument("volume")).doubleValue())));
                    result.success((Object) null);
                    return;
                case 6:
                    result.success(Long.valueOf(aVar3.f351606a.getCurrentPosition()));
                    return;
                case 7:
                    aVar3.mo182214a();
                    ((HashMap) this.f351605f).remove(Long.valueOf(longValue));
                    result.success((Object) null);
                    return;
                default:
                    result.notImplemented();
                    return;
            }
        } else {
            for (C117501a a : ((HashMap) this.f351605f).values()) {
                a.mo182214a();
            }
            ((HashMap) this.f351605f).clear();
        }
    }
}
