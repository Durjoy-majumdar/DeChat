package o10;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import o10.C109903c;
import o10.C109905d;
import org.json.JSONException;
import org.json.JSONObject;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.EventChannel;

/* renamed from: o10.a */
public class C109900a implements FlutterPlugin, EventChannel.StreamHandler, ActivityAware {

    /* renamed from: d */
    public Activity f328845d;

    /* renamed from: e */
    public EventChannel f328846e;

    /* renamed from: f */
    public FlutterPlugin.FlutterPluginBinding f328847f;

    /* renamed from: g */
    public View f328848g;

    /* renamed from: h */
    public EventChannel.EventSink f328849h;

    /* renamed from: i */
    public int f328850i;

    /* renamed from: j */
    public final ViewTreeObserver.OnGlobalLayoutListener f328851j = new C109901a();

    /* renamed from: o10.a$a */
    public class C109901a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C109901a() {
        }

        public void onGlobalLayout() {
            C109905d dVar;
            View view = C109900a.this.f328848g;
            int i = C109903c.f328858a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                dVar = C109903c.C109904a.m149397a(view);
            } else {
                if (C109905d.C109906a.f328863d && view.isAttachedToWindow()) {
                    try {
                        Object obj = C109905d.C109906a.f328860a.get(view.getRootView());
                        if (obj != null) {
                            Rect rect = (Rect) C109905d.C109906a.f328861b.get(obj);
                            Rect rect2 = (Rect) C109905d.C109906a.f328862c.get(obj);
                            if (!(rect == null || rect2 == null)) {
                                C109905d.C109910e dVar2 = i2 >= 30 ? new C109905d.C109909d() : i2 >= 29 ? new C109905d.C109908c() : new C109905d.C109907b();
                                dVar2.mo161223b(C109902b.m149394a(rect.left, rect.top, rect.right, rect.bottom));
                                dVar2.mo161224c(C109902b.m149394a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                                C109905d a = dVar2.mo161222a();
                                a.f328859a.mo161233p(a);
                                a.f328859a.mo161225d(view.getRootView());
                                dVar = a;
                            }
                        }
                    } catch (IllegalAccessException e) {
                        e.getMessage();
                    }
                }
                dVar = null;
            }
            if (dVar != null) {
                C109902b f = dVar.f328859a.mo161228f(8);
                C109902b f2 = dVar.f328859a.mo161228f(7);
                int i3 = f.f328857d;
                C109900a aVar = C109900a.this;
                if (aVar.f328850i != i3) {
                    aVar.f328850i = i3;
                    int i4 = f2.f328857d;
                    if (i3 > i4) {
                        i3 -= i4;
                    }
                    Activity activity = aVar.f328845d;
                    if (activity != null) {
                        double d = (double) (((float) i3) / activity.getResources().getDisplayMetrics().density);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("showKeyboard", i3 != 0);
                            jSONObject.put("keyboardHeight", d);
                        } catch (JSONException unused) {
                        }
                        String jSONObject2 = jSONObject.toString();
                        if (C109900a.this.f328849h != null && !TextUtils.isEmpty(jSONObject2)) {
                            C109900a.this.f328849h.success(jSONObject2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo161212a(Activity activity, BinaryMessenger binaryMessenger) {
        if (this.f328846e == null) {
            EventChannel eventChannel = new EventChannel(binaryMessenger, "keyboard_util");
            this.f328846e = eventChannel;
            eventChannel.setStreamHandler(this);
        }
        if (activity != null) {
            Activity activity2 = this.f328845d;
            if (activity2 == null || !activity2.equals(activity)) {
                View view = this.f328848g;
                if (view != null) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f328851j);
                }
                this.f328845d = activity;
                View findViewById = activity.findViewById(16908290);
                this.f328848g = findViewById;
                if (findViewById != null) {
                    findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this.f328851j);
                }
            }
        }
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        if (this.f328847f != null) {
            mo161212a(activityPluginBinding.getActivity(), this.f328847f.getBinaryMessenger());
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f328847f = flutterPluginBinding;
        mo161212a((Activity) null, flutterPluginBinding.getBinaryMessenger());
    }

    public void onCancel(Object obj) {
    }

    public void onDetachedFromActivity() {
        EventChannel eventChannel = this.f328846e;
        if (eventChannel != null) {
            eventChannel.setStreamHandler((EventChannel.StreamHandler) null);
        }
        this.f328846e = null;
        this.f328849h = null;
        this.f328845d = null;
        View view = this.f328848g;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f328851j);
            this.f328848g = null;
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f328847f = null;
    }

    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f328849h = eventSink;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
