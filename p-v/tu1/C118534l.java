package tu1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Message;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.EventChannel;
import p172io.flutter.plugin.common.MethodChannel;
import p172io.flutter.view.TextureRegistry;
import p823sg.C90193h;
import tu1.C118520b;
import tu1.C118522d;
import z04.C119027c;

/* renamed from: tu1.l */
public class C118534l implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: d */
    public final C118535a f354734d;

    /* renamed from: e */
    public MethodChannel f354735e;

    /* renamed from: f */
    public FlutterPlugin.FlutterPluginBinding f354736f;

    /* renamed from: g */
    public final Map<Long, C118536b> f354737g = new HashMap();

    /* renamed from: h */
    public C118536b f354738h;

    /* renamed from: i */
    public HashMap<String, Integer> f354739i = new HashMap<>();

    /* renamed from: tu1.l$a */
    public class C118535a extends BroadcastReceiver {
        public C118535a(C118534l lVar) {
        }

        public void onReceive(Context context, Intent intent) {
        }
    }

    /* renamed from: tu1.l$b */
    public static class C118536b {

        /* renamed from: a */
        public Context f354740a;

        /* renamed from: b */
        public C118540o f354741b;

        /* renamed from: c */
        public Surface f354742c;

        /* renamed from: d */
        public final TextureRegistry.SurfaceTextureEntry f354743d;

        /* renamed from: e */
        public C118542q f354744e = new C118542q();

        /* renamed from: f */
        public final EventChannel f354745f;

        /* renamed from: g */
        public boolean f354746g = false;

        /* renamed from: h */
        public boolean f354747h = false;

        /* renamed from: i */
        public MMHandler f354748i = new C118537a();

        /* renamed from: tu1.l$b$a */
        public class C118537a extends MMHandler {
            public C118537a() {
            }

            public void handleMessage(Message message) {
                if (message.what == 1001) {
                    C118536b bVar = C118536b.this;
                    bVar.getClass();
                    Log.m105918d("MicroMsg.FlutterVideoPlayerPlugin", "FlutterThumb [buffering prepare]");
                    if (bVar.f354744e != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("event", "preparing");
                        bVar.f354744e.success(hashMap);
                    }
                }
            }
        }

        public C118536b(Context context, EventChannel eventChannel, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, String str, MethodChannel.Result result) {
            Log.m105919d("MicroMsg.FlutterVideoPlayerPlugin", "VideoPlayer create %s", Integer.valueOf(hashCode()));
            this.f354740a = context;
            this.f354745f = eventChannel;
            this.f354743d = surfaceTextureEntry;
            C118522d dVar = new C118522d(context, new C86009m1(context.getCacheDir() + "/flutter/MMVideo-" + str.hashCode() + ".mp4").mo119971i());
            this.f354741b = dVar;
            String str2 = dVar.f354709a;
            Log.m105918d(str2, "setPath mediaId:" + dVar.f354715g + " dataSource:" + str + ' ');
            dVar.f354712d = str;
            byte[] bytes = str.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            dVar.f354715g = C90193h.m112878f(bytes);
            eventChannel.setStreamHandler(new C118538m(this));
            Surface surface = new Surface(surfaceTextureEntry.surfaceTexture());
            this.f354742c = surface;
            C118522d dVar2 = (C118522d) this.f354741b;
            Log.m105919d(dVar2.f354709a, "setSurface %s", Integer.valueOf(surface.hashCode()));
            ITPPlayer iTPPlayer = dVar2.f354711c;
            if (iTPPlayer != null) {
                iTPPlayer.setSurface(surface);
            }
            this.f354741b.getClass();
            ((C118522d) this.f354741b).f354713e = new C118539n(this);
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", Long.valueOf(surfaceTextureEntry.mo159349id()));
            result.success(hashMap);
        }

        /* renamed from: a */
        public void mo183251a() {
            Log.m105919d("MicroMsg.FlutterVideoPlayerPlugin", "VideoPlayer createOfDispose %s", Integer.valueOf(hashCode()));
            if (this.f354746g) {
                C118522d dVar = (C118522d) this.f354741b;
                String str = dVar.f354709a;
                Log.m105918d(str, "video_status stop: " + dVar.f354711c + " , url: " + dVar.f354712d);
                ITPPlayer iTPPlayer = dVar.f354711c;
                if (iTPPlayer != null) {
                    iTPPlayer.stop();
                }
            }
            this.f354743d.release();
            this.f354745f.setStreamHandler((EventChannel.StreamHandler) null);
            Surface surface = this.f354742c;
            if (surface != null && surface.isValid()) {
                this.f354742c.release();
            }
            C118540o oVar = this.f354741b;
            if (oVar != null) {
                C118522d dVar2 = (C118522d) oVar;
                String str2 = dVar2.f354709a;
                Log.m105918d(str2, "video_status release " + dVar2.f354711c + " , url: " + dVar2.f354712d);
                ITPPlayer iTPPlayer2 = dVar2.f354711c;
                if (iTPPlayer2 != null) {
                    iTPPlayer2.setSurface((Surface) null);
                }
                ITPPlayer iTPPlayer3 = dVar2.f354711c;
                if (iTPPlayer3 != null) {
                    iTPPlayer3.release();
                }
            }
        }

        /* renamed from: b */
        public String mo183252b() {
            return ((C118522d) this.f354741b).f354712d;
        }

        /* renamed from: c */
        public void mo183253c() {
            Log.m105925i("MicroMsg.FlutterVideoPlayerPlugin", "VideoPlayer pause %s", Integer.valueOf(hashCode()));
            C118522d dVar = (C118522d) this.f354741b;
            String str = dVar.f354709a;
            Log.m105918d(str, "video_status pause " + dVar.f354711c + ", mediaId:" + dVar.f354715g + ", url:" + dVar.f354712d);
            ITPPlayer iTPPlayer = dVar.f354711c;
            if (iTPPlayer != null) {
                iTPPlayer.pause();
            }
            ITPPlayer iTPPlayer2 = dVar.f354711c;
            if (iTPPlayer2 != null) {
                iTPPlayer2.pauseDownload();
            }
        }

        /* renamed from: d */
        public void mo183254d() {
            Log.m105925i("MicroMsg.FlutterVideoPlayerPlugin", "VideoPlayer play %s", Integer.valueOf(hashCode()));
            ((C118522d) this.f354741b).mo183245a();
        }

        /* renamed from: e */
        public void mo183255e() {
            C118522d dVar = (C118522d) this.f354741b;
            String str = dVar.f354715g;
            C87412m.m108591d(str);
            String str2 = dVar.f354714f;
            C87412m.m108591d(str2);
            C118522d.C118523a aVar = new C118522d.C118523a(dVar, str, str2);
            ITPPlayer iTPPlayer = dVar.f354711c;
            if (iTPPlayer != null) {
                iTPPlayer.enableTPAssetResourceLoader(aVar);
            }
            String str3 = dVar.f354709a;
            Log.m105918d(str3, "video_status prepare url: " + dVar.f354712d + ", media:" + dVar.f354715g);
            if (dVar.f354716h < 3) {
                C118520b.C118521a a = C118532k.f354730c.mo183248a().f354732a.mo183240a(dVar.f354715g);
                TPVideoInfo.Builder builder = new TPVideoInfo.Builder();
                builder.fileId(dVar.f354715g);
                ITPPlayer iTPPlayer2 = dVar.f354711c;
                if (iTPPlayer2 != null) {
                    iTPPlayer2.setVideoInfo(builder.build());
                }
                if (!a.f354703d) {
                    ITPPlayer iTPPlayer3 = dVar.f354711c;
                    if (iTPPlayer3 != null) {
                        iTPPlayer3.setDataSource(dVar.f354712d);
                    }
                } else {
                    ITPPlayer iTPPlayer4 = dVar.f354711c;
                    if (iTPPlayer4 != null) {
                        iTPPlayer4.setDataSource(a.f354704e);
                    }
                }
                ITPPlayer iTPPlayer5 = dVar.f354711c;
                if (iTPPlayer5 != null) {
                    iTPPlayer5.prepareAsync();
                }
            } else {
                String str4 = dVar.f354709a;
                Log.m105918d(str4, "video_status prepare playerState " + dVar.f354716h + ' ');
            }
            this.f354747h = true;
        }

        /* renamed from: f */
        public void mo183256f(int i) {
            Log.m105925i("MicroMsg.FlutterVideoPlayerPlugin", "VideoPlayer seekTo %s", Integer.valueOf(hashCode()));
            C118522d dVar = (C118522d) this.f354741b;
            String str = dVar.f354709a;
            Log.m105924i(str, "video_status seek " + dVar.f354711c + ", state: " + dVar.f354716h);
            if (dVar.f354716h < 4) {
                Log.m105920e(dVar.f354709a, "video_status wrong seek");
                return;
            }
            ITPPlayer iTPPlayer = dVar.f354711c;
            if (iTPPlayer != null) {
                iTPPlayer.resumeDownload();
            }
            ITPPlayer iTPPlayer2 = dVar.f354711c;
            if (iTPPlayer2 != null) {
                iTPPlayer2.seekTo(i);
            }
        }
    }

    public C118534l() {
        NetStatusUtil.getNetType(MMApplicationContext.getContext());
        this.f354734d = new C118535a(this);
    }

    /* renamed from: a */
    public final boolean mo183249a(C118536b bVar) {
        C118532k.f354730c.mo183248a();
        if (MMApplicationContext.getContext() != null ? NetStatusUtil.isConnected(MMApplicationContext.getContext()) : false) {
            return true;
        }
        if (bVar.f354744e != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, 1);
            hashMap.put("errorType", 2);
            hashMap.put(OpenSDKTool4Assistant.EXTRA_ERROR_MSG, "视频加载失败，请检查网络连接后重试");
            hashMap.put("errorActionDesc", "重试");
            bVar.f354744e.error(String.valueOf(1), "视频加载失败，请检查网络连接后重试", hashMap);
        }
        return false;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f354736f = flutterPluginBinding;
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.tencent.mm.flutter/videoPlayer");
        this.f354735e = methodChannel;
        methodChannel.setMethodCallHandler(this);
        MMApplicationContext.getContext().registerReceiver(this.f354734d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f354735e.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        MMApplicationContext.getContext().unregisterReceiver(this.f354734d);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0103, code lost:
        if (r14.equals("setOutputMute") == false) goto L_0x011c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p172io.flutter.plugin.common.MethodCall r17, p172io.flutter.plugin.common.MethodChannel.Result r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r6 = r18
            io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding r2 = r0.f354736f
            io.flutter.view.TextureRegistry r2 = r2.getTextureRegistry()
            java.lang.String r7 = "MicroMsg.FlutterVideoPlayerPlugin"
            r3 = 0
            if (r2 != 0) goto L_0x001e
            java.lang.String r1 = "texture null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            java.lang.String r1 = "no_activity"
            java.lang.String r2 = "video_player plugin requires a foreground activity"
            r6.error(r1, r2, r3)
            return
        L_0x001e:
            java.lang.String r4 = "force"
            java.lang.Object r5 = r1.argument(r4)
            r8 = 0
            if (r5 == 0) goto L_0x0033
            java.lang.Object r4 = r1.argument(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r9 = r4
            goto L_0x0034
        L_0x0033:
            r9 = 0
        L_0x0034:
            java.lang.String r4 = r1.method
            r4.getClass()
            int r5 = r4.hashCode()
            r10 = -1352294148(0xffffffffaf65a0fc, float:-2.0884622E-10)
            r12 = 2
            r13 = 1
            if (r5 == r10) goto L_0x0065
            r10 = -318476791(0xffffffffed046e09, float:-2.5615654E27)
            if (r5 == r10) goto L_0x005a
            r10 = 3237136(0x316510, float:4.536194E-39)
            if (r5 == r10) goto L_0x004f
            goto L_0x006d
        L_0x004f:
            java.lang.String r5 = "init"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0058
            goto L_0x006d
        L_0x0058:
            r4 = 2
            goto L_0x0070
        L_0x005a:
            java.lang.String r5 = "preload"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0063
            goto L_0x006d
        L_0x0063:
            r4 = 1
            goto L_0x0070
        L_0x0065:
            java.lang.String r5 = "create"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x006f
        L_0x006d:
            r4 = -1
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            java.lang.String r10 = "player createOrDispose size:%d "
            if (r4 == 0) goto L_0x03c6
            if (r4 == r13) goto L_0x03ab
            if (r4 == r12) goto L_0x0374
            java.lang.String r2 = "textureId"
            java.lang.Object r2 = r1.argument(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            java.util.Map<java.lang.Long, tu1.l$b> r2 = r0.f354737g
            java.lang.Long r14 = java.lang.Long.valueOf(r4)
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r14)
            tu1.l$b r2 = (tu1.C118534l.C118536b) r2
            if (r2 != 0) goto L_0x00ab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No video player associated with texture id "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Unknown textureId"
            r6.error(r2, r1, r3)
            return
        L_0x00ab:
            java.lang.String r14 = r1.method
            r14.getClass()
            int r15 = r14.hashCode()
            java.lang.String r11 = "setVolume"
            switch(r15) {
                case -971364356: goto L_0x0111;
                case -906224877: goto L_0x0106;
                case -797672260: goto L_0x00fd;
                case -493593704: goto L_0x00f2;
                case 3443508: goto L_0x00e7;
                case 106440182: goto L_0x00dc;
                case 670514716: goto L_0x00d3;
                case 747804969: goto L_0x00c8;
                case 1671767583: goto L_0x00bb;
                default: goto L_0x00b9;
            }
        L_0x00b9:
            goto L_0x011c
        L_0x00bb:
            java.lang.String r12 = "dispose"
            boolean r12 = r14.equals(r12)
            if (r12 != 0) goto L_0x00c5
            goto L_0x011c
        L_0x00c5:
            r12 = 8
            goto L_0x011d
        L_0x00c8:
            java.lang.String r12 = "position"
            boolean r12 = r14.equals(r12)
            if (r12 != 0) goto L_0x00d1
            goto L_0x011c
        L_0x00d1:
            r12 = 7
            goto L_0x011d
        L_0x00d3:
            boolean r12 = r14.equals(r11)
            if (r12 != 0) goto L_0x00da
            goto L_0x011c
        L_0x00da:
            r12 = 6
            goto L_0x011d
        L_0x00dc:
            java.lang.String r12 = "pause"
            boolean r12 = r14.equals(r12)
            if (r12 != 0) goto L_0x00e5
            goto L_0x011c
        L_0x00e5:
            r12 = 5
            goto L_0x011d
        L_0x00e7:
            java.lang.String r12 = "play"
            boolean r12 = r14.equals(r12)
            if (r12 != 0) goto L_0x00f0
            goto L_0x011c
        L_0x00f0:
            r12 = 4
            goto L_0x011d
        L_0x00f2:
            java.lang.String r12 = "resetPosition"
            boolean r12 = r14.equals(r12)
            if (r12 != 0) goto L_0x00fb
            goto L_0x011c
        L_0x00fb:
            r12 = 3
            goto L_0x011d
        L_0x00fd:
            java.lang.String r15 = "setOutputMute"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x011d
            goto L_0x011c
        L_0x0106:
            java.lang.String r12 = "seekTo"
            boolean r12 = r14.equals(r12)
            if (r12 != 0) goto L_0x010f
            goto L_0x011c
        L_0x010f:
            r12 = 1
            goto L_0x011d
        L_0x0111:
            java.lang.String r12 = "setLooping"
            boolean r12 = r14.equals(r12)
            if (r12 != 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r12 = 0
            goto L_0x011d
        L_0x011c:
            r12 = -1
        L_0x011d:
            java.lang.String r14 = "video_status method call: "
            switch(r12) {
                case 0: goto L_0x0358;
                case 1: goto L_0x02f0;
                case 2: goto L_0x02c5;
                case 3: goto L_0x02ad;
                case 4: goto L_0x020b;
                case 5: goto L_0x01d9;
                case 6: goto L_0x01a8;
                case 7: goto L_0x0182;
                case 8: goto L_0x0127;
                default: goto L_0x0122;
            }
        L_0x0122:
            r18.notImplemented()
            goto L_0x0478
        L_0x0127:
            tu1.l$b r9 = r0.f354738h
            if (r9 == 0) goto L_0x0142
            java.lang.String r9 = r9.mo183252b()
            java.lang.String r11 = r2.mo183252b()
            boolean r9 = r9.equalsIgnoreCase(r11)
            if (r9 == 0) goto L_0x0142
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r0.f354739i
            java.lang.String r11 = r2.mo183252b()
            r9.remove(r11)
        L_0x0142:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r14)
            java.lang.String r1 = r1.method
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r1)
            tu1.l$b r1 = r0.f354738h
            if (r1 != r2) goto L_0x015c
            r0.f354738h = r3
        L_0x015c:
            r2.mo183251a()
            java.util.Map<java.lang.Long, tu1.l$b> r1 = r0.f354737g
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.remove(r2)
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.util.Map<java.lang.Long, tu1.l$b> r2 = r0.f354737g
            java.util.HashMap r2 = (java.util.HashMap) r2
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r8] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r10, r1)
            r6.success(r3)
            goto L_0x0478
        L_0x0182:
            tu1.o r1 = r2.f354741b
            tu1.d r1 = (tu1.C118522d) r1
            com.tencent.thumbplayer.api.ITPPlayer r1 = r1.f354711c
            if (r1 == 0) goto L_0x018f
            long r3 = r1.getCurrentPositionMs()
            goto L_0x0191
        L_0x018f:
            r3 = 0
        L_0x0191:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.f354739i
            java.lang.String r2 = r2.mo183252b()
            int r5 = (int) r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.put(r2, r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.success(r1)
            goto L_0x0478
        L_0x01a8:
            java.lang.String r4 = "volume"
            java.lang.Object r1 = r1.argument(r4)
            java.lang.Double r1 = (java.lang.Double) r1
            double r4 = r1.doubleValue()
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = java.lang.Math.min(r7, r4)
            r7 = 0
            double r4 = java.lang.Math.max(r7, r4)
            float r1 = (float) r4
            tu1.o r2 = r2.f354741b
            double r4 = (double) r1
            tu1.d r2 = (tu1.C118522d) r2
            java.lang.String r1 = r2.f354709a
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r11)
            com.tencent.thumbplayer.api.ITPPlayer r1 = r2.f354711c
            if (r1 == 0) goto L_0x01d4
            float r2 = (float) r4
            r1.setAudioGainRatio(r2)
        L_0x01d4:
            r6.success(r3)
            goto L_0x0478
        L_0x01d9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            java.lang.String r1 = r1.method
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r1)
            tu1.l$b r1 = r0.f354738h
            if (r1 != r2) goto L_0x01f5
            r2.mo183253c()
            goto L_0x0206
        L_0x01f5:
            java.lang.Object[] r1 = new java.lang.Object[r13]
            int r2 = r2.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r8] = r2
            java.lang.String r2 = "pause ignore %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r2, r1)
        L_0x0206:
            r6.success(r3)
            goto L_0x0478
        L_0x020b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            java.lang.String r1 = r1.method
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r1)
            tu1.l$b r1 = r0.f354738h
            if (r1 == r2) goto L_0x0243
            if (r1 == 0) goto L_0x0241
            r1.mo183253c()
            tu1.l$b r1 = r0.f354738h
            java.lang.String r1 = r1.mo183252b()
            byte[] r1 = r1.getBytes()
            java.lang.String r1 = p823sg.C90193h.m112878f(r1)
            tu1.k$a r4 = tu1.C118532k.f354730c
            tu1.k r4 = r4.mo183248a()
            tu1.b r4 = r4.f354732a
            r4.mo183244i(r1)
        L_0x0241:
            r0.f354738h = r2
        L_0x0243:
            if (r9 == 0) goto L_0x024a
            tu1.k$a r1 = tu1.C118532k.f354730c
            r1.mo183248a()
        L_0x024a:
            tu1.l$b r1 = r0.f354738h
            boolean r1 = r0.mo183249a(r1)
            if (r1 == 0) goto L_0x02a8
            tu1.l$b r1 = r0.f354738h
            boolean r2 = r1.f354747h
            if (r2 != 0) goto L_0x025b
            r1.mo183255e()
        L_0x025b:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.f354739i
            tu1.l$b r2 = r0.f354738h
            java.lang.String r2 = r2.mo183252b()
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x0284
            tu1.l$b r1 = r0.f354738h
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r0.f354739i
            java.lang.String r4 = r1.mo183252b()
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.mo183256f(r2)
            tu1.l$b r1 = r0.f354738h
            r1.mo183254d()
            goto L_0x0289
        L_0x0284:
            tu1.l$b r1 = r0.f354738h
            r1.mo183254d()
        L_0x0289:
            tu1.l$b r1 = r0.f354738h
            java.lang.String r1 = r1.mo183252b()
            byte[] r1 = r1.getBytes()
            java.lang.String r1 = p823sg.C90193h.m112878f(r1)
            tu1.l$b r2 = r0.f354738h
            java.lang.String r2 = r2.mo183252b()
            tu1.k$a r4 = tu1.C118532k.f354730c
            tu1.k r4 = r4.mo183248a()
            tu1.b r4 = r4.f354732a
            r4.mo183243f(r2, r1)
        L_0x02a8:
            r6.success(r3)
            goto L_0x0478
        L_0x02ad:
            r2.mo183256f(r8)
            r2.mo183253c()
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.f354739i
            java.lang.String r2 = r2.mo183252b()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r1.put(r2, r4)
            r6.success(r3)
            goto L_0x0478
        L_0x02c5:
            java.lang.String r4 = "outputMute"
            java.lang.Object r1 = r1.argument(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            tu1.o r2 = r2.f354741b
            tu1.d r2 = (tu1.C118522d) r2
            java.lang.String r4 = r2.f354709a
            java.lang.Object[] r5 = new java.lang.Object[r13]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r5[r8] = r7
            java.lang.String r7 = "setMute %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r7, r5)
            com.tencent.thumbplayer.api.ITPPlayer r2 = r2.f354711c
            if (r2 == 0) goto L_0x02eb
            r2.setOutputMute(r1)
        L_0x02eb:
            r6.success(r3)
            goto L_0x0478
        L_0x02f0:
            tu1.l$b r4 = r0.f354738h
            if (r4 == r2) goto L_0x0314
            if (r4 == 0) goto L_0x0312
            r4.mo183253c()
            tu1.l$b r4 = r0.f354738h
            java.lang.String r4 = r4.mo183252b()
            byte[] r4 = r4.getBytes()
            java.lang.String r4 = p823sg.C90193h.m112878f(r4)
            tu1.k$a r5 = tu1.C118532k.f354730c
            tu1.k r5 = r5.mo183248a()
            tu1.b r5 = r5.f354732a
            r5.mo183244i(r4)
        L_0x0312:
            r0.f354738h = r2
        L_0x0314:
            java.lang.String r2 = "location"
            java.lang.Object r1 = r1.argument(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r0.f354739i
            tu1.l$b r4 = r0.f354738h
            java.lang.String r4 = r4.mo183252b()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r2.put(r4, r5)
            tu1.l$b r2 = r0.f354738h
            r2.mo183256f(r1)
            tu1.l$b r1 = r0.f354738h
            java.lang.String r1 = r1.mo183252b()
            byte[] r1 = r1.getBytes()
            java.lang.String r1 = p823sg.C90193h.m112878f(r1)
            tu1.l$b r2 = r0.f354738h
            java.lang.String r2 = r2.mo183252b()
            tu1.k$a r4 = tu1.C118532k.f354730c
            tu1.k r4 = r4.mo183248a()
            tu1.b r4 = r4.f354732a
            r4.mo183243f(r2, r1)
            r6.success(r3)
            goto L_0x0478
        L_0x0358:
            java.lang.String r4 = "looping"
            java.lang.Object r1 = r1.argument(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            tu1.o r2 = r2.f354741b
            tu1.d r2 = (tu1.C118522d) r2
            com.tencent.thumbplayer.api.ITPPlayer r2 = r2.f354711c
            if (r2 == 0) goto L_0x036f
            r2.setLoopback(r1)
        L_0x036f:
            r6.success(r3)
            goto L_0x0478
        L_0x0374:
            java.util.Map<java.lang.Long, tu1.l$b> r1 = r0.f354737g
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0380:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0390
            java.lang.Object r2 = r1.next()
            tu1.l$b r2 = (tu1.C118534l.C118536b) r2
            r2.mo183251a()
            goto L_0x0380
        L_0x0390:
            java.util.Map<java.lang.Long, tu1.l$b> r1 = r0.f354737g
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.clear()
            tu1.k$a r1 = tu1.C118532k.f354730c
            r1.mo183248a()
            tu1.k r1 = r1.mo183248a()
            tu1.c r1 = r1.f354733b
            java.util.HashMap<java.lang.String, gi.h> r1 = r1.f300102d
            if (r1 == 0) goto L_0x0478
            r1.clear()
            goto L_0x0478
        L_0x03ab:
            java.lang.String r2 = "url"
            java.lang.Object r1 = r1.argument(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x0478
            tu1.k$a r2 = tu1.C118532k.f354730c
            tu1.k r2 = r2.mo183248a()
            tu1.b r2 = r2.f354732a
            r2.mo183241c(r1, r3)
            goto L_0x0478
        L_0x03c6:
            io.flutter.view.TextureRegistry$SurfaceTextureEntry r11 = r2.createSurfaceTexture()
            io.flutter.plugin.common.EventChannel r3 = new io.flutter.plugin.common.EventChannel
            io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding r2 = r0.f354736f
            io.flutter.plugin.common.BinaryMessenger r2 = r2.getBinaryMessenger()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "com.tencent.mm.flutter/videoPlayer/videoEvents"
            r4.append(r5)
            long r14 = r11.mo159349id()
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            r3.<init>(r2, r4)
            java.lang.String r2 = "asset"
            java.lang.Object r4 = r1.argument(r2)
            if (r4 == 0) goto L_0x0418
            java.lang.Object r1 = r1.argument(r2)
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            tu1.l$b r12 = new tu1.l$b
            io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding r1 = r0.f354736f
            android.content.Context r2 = r1.getApplicationContext()
            r1 = r12
            r4 = r11
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.Map<java.lang.Long, tu1.l$b> r1 = r0.f354737g
            long r2 = r11.mo159349id()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.put(r2, r12)
            goto L_0x043f
        L_0x0418:
            tu1.l$b r12 = new tu1.l$b
            io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding r2 = r0.f354736f
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r4 = "uri"
            java.lang.Object r1 = r1.argument(r4)
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            r1 = r12
            r4 = r11
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.Map<java.lang.Long, tu1.l$b> r1 = r0.f354737g
            long r2 = r11.mo159349id()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.put(r2, r12)
        L_0x043f:
            if (r9 != 0) goto L_0x0447
            boolean r1 = r0.mo183249a(r12)
            if (r1 == 0) goto L_0x0465
        L_0x0447:
            r12.mo183255e()
            java.lang.String r1 = r12.mo183252b()
            byte[] r1 = r1.getBytes()
            java.lang.String r1 = p823sg.C90193h.m112878f(r1)
            java.lang.String r2 = r12.mo183252b()
            tu1.k$a r3 = tu1.C118532k.f354730c
            tu1.k r3 = r3.mo183248a()
            tu1.b r3 = r3.f354732a
            r3.mo183243f(r2, r1)
        L_0x0465:
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.util.Map<java.lang.Long, tu1.l$b> r2 = r0.f354737g
            java.util.HashMap r2 = (java.util.HashMap) r2
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r8] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r10, r1)
        L_0x0478:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tu1.C118534l.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }
}
