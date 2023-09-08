package p1219v6;

import android.app.Activity;
import android.view.OrientationEventListener;
import java.util.List;
import p172io.flutter.plugin.common.EventChannel;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: v6.b */
public class C118664b implements MethodChannel.MethodCallHandler {

    /* renamed from: d */
    public Activity f355070d;

    /* renamed from: e */
    public MethodChannel f355071e;

    /* renamed from: f */
    public EventChannel f355072f;

    /* renamed from: g */
    public OrientationEventListener f355073g;

    /* renamed from: h */
    public int f355074h = -1;

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (this.f355070d == null) {
            result.error("NO_ACTIVITY", "OrientationPlugin requires a foreground activity.", (Object) null);
            return;
        }
        String str = methodCall.method;
        Object obj = methodCall.arguments;
        if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
            List list = (List) obj;
            int i = 7942;
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (list.get(i2).equals("SystemUiOverlay.top")) {
                    i &= -5;
                } else if (list.get(i2).equals("SystemUiOverlay.bottom")) {
                    i &= -3;
                }
            }
            this.f355070d.getWindow().getDecorView().setSystemUiVisibility(i);
            result.success((Object) null);
        } else if (str.equals("SystemChrome.setPreferredOrientations")) {
            List list2 = (List) obj;
            boolean z = false;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                if (list2.get(i3).equals("DeviceOrientation.portraitUp")) {
                    z |= true;
                } else if (list2.get(i3).equals("DeviceOrientation.landscapeLeft")) {
                    z |= true;
                } else if (list2.get(i3).equals("DeviceOrientation.portraitDown")) {
                    z |= true;
                } else if (list2.get(i3).equals("DeviceOrientation.landscapeRight")) {
                    z |= true;
                }
            }
            switch (z) {
                case false:
                    this.f355070d.setRequestedOrientation(-1);
                    break;
                case true:
                    this.f355070d.setRequestedOrientation(1);
                    break;
                case true:
                    this.f355070d.setRequestedOrientation(0);
                    break;
                case true:
                case true:
                case true:
                case true:
                case true:
                case true:
                case true:
                    this.f355070d.setRequestedOrientation(13);
                    break;
                case true:
                    this.f355070d.setRequestedOrientation(9);
                    break;
                case true:
                    this.f355070d.setRequestedOrientation(12);
                    break;
                case true:
                    this.f355070d.setRequestedOrientation(8);
                    break;
                case true:
                    this.f355070d.setRequestedOrientation(11);
                    break;
                case true:
                    this.f355070d.setRequestedOrientation(2);
                    break;
                case true:
                    this.f355070d.setRequestedOrientation(13);
                    break;
            }
            result.success((Object) null);
        } else if (str.equals("SystemChrome.forceOrientation")) {
            String str2 = (String) obj;
            if (str2.equals("DeviceOrientation.portraitUp")) {
                this.f355070d.setRequestedOrientation(1);
            } else if (str2.equals("DeviceOrientation.portraitDown")) {
                this.f355070d.setRequestedOrientation(9);
            } else if (str2.equals("DeviceOrientation.landscapeLeft")) {
                this.f355070d.setRequestedOrientation(8);
            } else if (str2.equals("DeviceOrientation.landscapeRight")) {
                this.f355070d.setRequestedOrientation(0);
            } else {
                this.f355070d.setRequestedOrientation(-1);
            }
            result.success((Object) null);
        } else {
            result.notImplemented();
        }
    }
}
