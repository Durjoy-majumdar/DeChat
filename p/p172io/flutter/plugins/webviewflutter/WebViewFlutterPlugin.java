package p172io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.PluginRegistry;
import p172io.flutter.plugin.platform.PlatformViewRegistry;
import p172io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl;
import p172io.flutter.plugins.webviewflutter.FlutterAssetManager;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import p172io.flutter.plugins.webviewflutter.JavaScriptChannelHostApiImpl;
import p172io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl;
import p172io.flutter.plugins.webviewflutter.WebSettingsHostApiImpl;
import p172io.flutter.plugins.webviewflutter.WebStorageHostApiImpl;
import p172io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl;
import p172io.flutter.plugins.webviewflutter.WebViewHostApiImpl;

/* renamed from: io.flutter.plugins.webviewflutter.WebViewFlutterPlugin */
public class WebViewFlutterPlugin implements FlutterPlugin, ActivityAware {
    private JavaScriptChannelHostApiImpl javaScriptChannelHostApi;
    private FlutterPlugin.FlutterPluginBinding pluginBinding;
    private WebViewHostApiImpl webViewHostApi;

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new WebViewFlutterPlugin().setUp(registrar.messenger(), registrar.platformViewRegistry(), registrar.activity(), registrar.view(), new FlutterAssetManager.RegistrarFlutterAssetManager(registrar.context().getAssets(), registrar));
    }

    private void setUp(BinaryMessenger binaryMessenger, PlatformViewRegistry platformViewRegistry, Context context, View view, FlutterAssetManager flutterAssetManager) {
        InstanceManager instanceManager = new InstanceManager();
        platformViewRegistry.registerViewFactory("plugins.flutter.io/webview", new FlutterWebViewFactory(instanceManager));
        this.webViewHostApi = new WebViewHostApiImpl(instanceManager, new WebViewHostApiImpl.WebViewProxy(), context, view);
        this.javaScriptChannelHostApi = new JavaScriptChannelHostApiImpl(instanceManager, new JavaScriptChannelHostApiImpl.JavaScriptChannelCreator(), new JavaScriptChannelFlutterApiImpl(binaryMessenger, instanceManager), new Handler(context.getMainLooper()));
        GeneratedAndroidWebView.WebViewHostApi.CC.m23461B(binaryMessenger, this.webViewHostApi);
        C21130c.m23516c(binaryMessenger, this.javaScriptChannelHostApi);
        C21133g.m23526c(binaryMessenger, new WebViewClientHostApiImpl(instanceManager, new WebViewClientHostApiImpl.WebViewClientCreator(), new WebViewClientFlutterApiImpl(binaryMessenger, instanceManager)));
        C21131d.m23519c(binaryMessenger, new WebChromeClientHostApiImpl(instanceManager, new WebChromeClientHostApiImpl.WebChromeClientCreator(), new WebChromeClientFlutterApiImpl(binaryMessenger, instanceManager)));
        C21128a.m23509c(binaryMessenger, new DownloadListenerHostApiImpl(instanceManager, new DownloadListenerHostApiImpl.DownloadListenerCreator(), new DownloadListenerFlutterApiImpl(binaryMessenger, instanceManager)));
        C27607e.m37699p(binaryMessenger, new WebSettingsHostApiImpl(instanceManager, new WebSettingsHostApiImpl.WebSettingsCreator()));
        C21129b.m23513d(binaryMessenger, new FlutterAssetManagerHostApiImpl(flutterAssetManager));
        GeneratedAndroidWebView.CookieManagerHostApi.CC.m23446d(binaryMessenger, new CookieManagerHostApiImpl());
        C21132f.m23523d(binaryMessenger, new WebStorageHostApiImpl(instanceManager, new WebStorageHostApiImpl.WebStorageCreator()));
    }

    private void updateContext(Context context) {
        this.webViewHostApi.setContext(context);
        this.javaScriptChannelHostApi.setPlatformThreadHandler(new Handler(context.getMainLooper()));
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        updateContext(activityPluginBinding.getActivity());
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = flutterPluginBinding;
        setUp(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getPlatformViewRegistry(), flutterPluginBinding.getApplicationContext(), (View) null, new FlutterAssetManager.PluginBindingFlutterAssetManager(flutterPluginBinding.getApplicationContext().getAssets(), flutterPluginBinding.getFlutterAssets()));
    }

    public void onDetachedFromActivity() {
        updateContext(this.pluginBinding.getApplicationContext());
    }

    public void onDetachedFromActivityForConfigChanges() {
        updateContext(this.pluginBinding.getApplicationContext());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        updateContext(activityPluginBinding.getActivity());
    }
}
