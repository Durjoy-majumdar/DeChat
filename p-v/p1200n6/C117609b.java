package p1200n6;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import fy3.C32226l;
import gy3.C87412m;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;
import rx3.C13598b0;

/* renamed from: n6.b */
public class C117609b implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: d */
    public Context f351829d;

    /* renamed from: e */
    public MethodChannel f351830e;

    /* renamed from: f */
    public Handler f351831f;

    /* renamed from: g */
    public C117612d f351832g;

    /* renamed from: h */
    public String f351833h;

    /* renamed from: n6.b$a */
    public class C117610a implements C32226l<String, C13598b0> {
        public C117610a() {
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            if (str.equals(C117609b.this.f351833h)) {
                return null;
            }
            C117609b bVar = C117609b.this;
            bVar.f351833h = str;
            bVar.f351831f.post(new C117608a(this));
            return null;
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        this.f351829d = applicationContext;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter.moum/screenshot_callback");
        this.f351830e = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f351829d = null;
        MethodChannel methodChannel = this.f351830e;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
            this.f351830e = null;
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("initialize")) {
            this.f351831f = new Handler(Looper.getMainLooper());
            C117612d dVar = this.f351832g;
            if (dVar != null) {
                ContentObserver contentObserver = dVar.f351838c;
                if (contentObserver != null) {
                    dVar.f351836a.getContentResolver().unregisterContentObserver(contentObserver);
                }
                dVar.f351838c = null;
            }
            C117612d dVar2 = new C117612d(this.f351829d, new C117610a());
            this.f351832g = dVar2;
            if (dVar2.f351838c == null) {
                ContentResolver contentResolver = dVar2.f351836a.getContentResolver();
                C87412m.m108593f(contentResolver, "context.contentResolver");
                C117611c cVar = new C117611c(dVar2, new Handler(Looper.getMainLooper()));
                contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, cVar);
                dVar2.f351838c = cVar;
            }
            result.success("initialize");
        } else if (methodCall.method.equals("dispose")) {
            C117612d dVar3 = this.f351832g;
            if (dVar3 != null) {
                ContentObserver contentObserver2 = dVar3.f351838c;
                if (contentObserver2 != null) {
                    dVar3.f351836a.getContentResolver().unregisterContentObserver(contentObserver2);
                }
                dVar3.f351838c = null;
            }
            this.f351832g = null;
            this.f351833h = null;
            result.success("dispose");
        } else {
            result.notImplemented();
        }
    }
}
