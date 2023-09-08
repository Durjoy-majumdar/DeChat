package b10;

import a10.C112724v;
import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.app.Activity;
import android.content.Intent;
import com.tencent.pigeon.FlutterNavigatorPigeon;
import gy3.C87412m;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: b10.c */
public final class C104004c implements FlutterNavigatorPigeon.FlutterNavigatorHost, FlutterPlugin, ActivityAware {

    /* renamed from: d */
    public Activity f307615d;

    /* renamed from: e */
    public FlutterNavigatorPigeon.FlutterNavigatorCallback f307616e;

    /* renamed from: f */
    public final C0000n0 f307617f = C53930o0.m60561h(C53930o0.m60555b(), C53959v2.m60598a((C53973z1) null, 1, (Object) null));

    /* renamed from: g */
    public C104005d f307618g;

    public void disableSwipeBack() {
        Log.m165288i("MicroMsg.FlutterNavigatorPlugin", "disableSwipeBack");
        Activity activity = this.f307615d;
        C112724v vVar = activity instanceof C112724v ? (C112724v) activity : null;
        if (vVar != null) {
            vVar.mo164450M3(false);
        }
    }

    public void enableSwipeBack() {
        Log.m165288i("MicroMsg.FlutterNavigatorPlugin", "enableSwipeBack");
        Activity activity = this.f307615d;
        C112724v vVar = activity instanceof C112724v ? (C112724v) activity : null;
        if (vVar != null) {
            vVar.mo164450M3(true);
        }
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        Activity activity = activityPluginBinding.getActivity();
        if (!(activity instanceof Activity)) {
            activity = null;
        }
        this.f307615d = activity;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        Log.m165288i("MicroMsg.FlutterNavigatorPlugin", "onAttachedToEngine");
        FlutterNavigatorPigeon.FlutterNavigatorHost.CC.m144603f(flutterPluginBinding.getBinaryMessenger(), this);
        this.f307616e = new FlutterNavigatorPigeon.FlutterNavigatorCallback(flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromActivity() {
        this.f307615d = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f307615d = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        FlutterNavigatorPigeon.FlutterNavigatorHost.CC.m144603f(flutterPluginBinding.getBinaryMessenger(), (FlutterNavigatorPigeon.FlutterNavigatorHost) null);
        this.f307616e = null;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        Activity activity = activityPluginBinding.getActivity();
        if (!(activity instanceof Activity)) {
            activity = null;
        }
        this.f307615d = activity;
    }

    public void pop(String str, String str2, Map<Object, Object> map) {
        C87412m.m108594g(str, "plugin");
        C87412m.m108594g(str2, "route");
        C87412m.m108594g(map, "result");
        if (!(!map.isEmpty()) || !(map instanceof HashMap)) {
            Activity activity = this.f307615d;
            if (activity != null) {
                activity.setResult(-1);
            }
        } else {
            Intent intent = new Intent();
            intent.putExtra("arg_data", (Serializable) map);
            Activity activity2 = this.f307615d;
            if (activity2 != null) {
                activity2.setResult(-1, intent);
            }
        }
        Activity activity3 = this.f307615d;
        if (activity3 instanceof C112724v) {
            if (activity3 != null) {
                ((C112724v) activity3).pop();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.tencent.mm.flutter.base.IFlutterPageContainer");
        } else if (activity3 != null) {
            activity3.finish();
        }
    }

    public void push(String str, String str2, Map<Object, Object> map, FlutterNavigatorPigeon.Result<Map<Object, Object>> result) {
        C87412m.m108594g(str, "plugin");
        C87412m.m108594g(str2, "route");
        C87412m.m108594g(map, "arguments");
        C87412m.m108594g(result, "result");
        C53895h.m60466d(this.f307617f, (C66212f) null, (C53934p0) null, new c$$b(map, this, str, str2, result, (C15601d<? super c$$b>) null), 3, (Object) null);
    }
}
