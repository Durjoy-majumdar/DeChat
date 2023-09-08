package p172io.flutter.plugins;

import c10.C79912a;
import com.tencent.p014mm.plugin.flutter.model.ChannelRegistrant;
import d10.C58011a;
import kt3.C88287a;
import kx3.C88326a;
import lx3.C88663a;
import m10.C117500g;
import nx3.C89101a;
import o10.C109900a;
import p1219v6.C118665c;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;
import p172io.flutter.plugins.connectivity.ConnectivityPlugin;
import p172io.flutter.plugins.pathprovider.PathProviderPlugin;
import p973h6.C87452a;
import p979ia.C87683c;
import p991k6.C88116a;
import p997l6.C88385a;
import p998l9.C88391a;
import tw3.C118554e;
import x90.C91144a;

/* renamed from: io.flutter.plugins.GeneratedPluginRegistrant */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(FlutterEngine flutterEngine) {
        new ShimPluginRegistry(flutterEngine);
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new C88391a());
        } catch (Exception e) {
            Log.m165287e(TAG, "Error registering plugin catcher, com.jhomlala.catcher.CatcherPlugin", e);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new ConnectivityPlugin());
        } catch (Exception e2) {
            Log.m165287e(TAG, "Error registering plugin connectivity, io.flutter.plugins.connectivity.ConnectivityPlugin", e2);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new C88326a());
        } catch (Exception e3) {
            Log.m165287e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e3);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new C88116a());
        } catch (Exception e4) {
            Log.m165287e(TAG, "Error registering plugin emoji, com.example.emoji.EmojiPlugin", e4);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new C87452a());
        } catch (Exception e5) {
            Log.m165287e(TAG, "Error registering plugin flutter_mailer, com.dataxad.flutter_mailer.FlutterMailerPlugin", e5);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new C109900a());
        } catch (Exception e6) {
            Log.m165287e(TAG, "Error registering plugin flutter_mmui, com.tencent.mm.flutter.weui.FlutterWeUIPlugin", e6);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new C79912a());
        } catch (Exception e7) {
            Log.m165287e(TAG, "Error registering plugin flutter_music_chat, com.tencent.mm.flutter.music_chat.MusicChatPlugin", e7);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new C88385a());
        } catch (Exception e8) {
            Log.m165287e(TAG, "Error registering plugin home_generator, com.example.home_generator.HomeGeneratorPlugin", e8);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new C91144a());
        } catch (Exception e9) {
            Log.m165287e(TAG, "Error registering plugin mj_template, com.tencent.mm.mj_template.MjTemplatePlugin", e9);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new C58011a());
        } catch (Exception e15) {
            Log.m165287e(TAG, "Error registering plugin mm_foundation, com.tencent.mm.flutter.plugin.MMFoundationPlugin", e15);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new C118665c());
        } catch (Exception e16) {
            Log.m165287e(TAG, "Error registering plugin orientation, com.github.sososdk.orientation.OrientationPlugin", e16);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new C88663a());
        } catch (Exception e17) {
            Log.m165287e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e17);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new PathProviderPlugin());
        } catch (Exception e18) {
            Log.m165287e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e18);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new C89101a());
        } catch (Exception e19) {
            Log.m165287e(TAG, "Error registering plugin screen, flutter.plugins.screen.screen.ScreenPlugin", e19);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new C88287a());
        } catch (Exception e25) {
            Log.m165287e(TAG, "Error registering plugin skyline_android_lib, com.tencent.skyline_android_lib.SkylineAndroidLibPlugin", e25);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new C117500g());
        } catch (Exception e26) {
            Log.m165287e(TAG, "Error registering plugin video_player, com.tencent.mm.flutter.plugins.videoplayer.VideoPlayerPlugin", e26);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new C87683c());
        } catch (Exception e27) {
            Log.m165287e(TAG, "Error registering plugin wxa_lite_app, com.tencent.liteapp.WxaLiteAppPlugin", e27);
        }
        try {
            flutterEngine.getPlugins().add((FlutterPlugin) new C118554e());
        } catch (Exception e28) {
            Log.m165287e(TAG, "Error registering plugin wxa_router, com.tencent.wxa.WxaRouterPlugin", e28);
        }
        try {
            ChannelRegistrant.class.getMethod("registerWith", new Class[]{FlutterEngine.class}).invoke((Object) null, new Object[]{flutterEngine});
        } catch (ClassNotFoundException | Exception unused) {
        }
    }
}
