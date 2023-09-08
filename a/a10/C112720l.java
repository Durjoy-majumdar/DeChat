package a10;

import android.app.Activity;
import android.content.Intent;
import gy3.C87412m;
import java.util.Stack;
import p172io.flutter.embedding.android.ExclusiveAppComponent;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p172io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import p172io.flutter.plugin.common.PluginRegistry;

/* renamed from: a10.l */
public final class C112720l implements ActivityAware, PluginRegistry.ActivityResultListener {

    /* renamed from: d */
    public final FlutterEngine f337496d;

    /* renamed from: e */
    public final Stack<ActivityPluginBinding> f337497e = new Stack<>();

    /* renamed from: a10.l$a */
    public static final class C112721a implements ExclusiveAppComponent<Activity> {

        /* renamed from: a */
        public final /* synthetic */ ActivityPluginBinding f337498a;

        public C112721a(ActivityPluginBinding activityPluginBinding) {
            this.f337498a = activityPluginBinding;
        }

        public void detachFromFlutterEngine() {
        }

        public Object getAppComponent() {
            Activity activity = this.f337498a.getActivity();
            C87412m.m108593f(activity, "binding.activity");
            return activity;
        }
    }

    public C112720l(FlutterEngine flutterEngine) {
        C87412m.m108594g(flutterEngine, "rootEngine");
        this.f337496d = flutterEngine;
    }

    /* renamed from: a */
    public final void mo164462a(ActivityPluginBinding activityPluginBinding) {
        this.f337496d.getActivityControlSurface().attachToActivity(new C112721a(activityPluginBinding), ((HiddenLifecycleReference) activityPluginBinding.getLifecycle()).getLifecycle());
        activityPluginBinding.addActivityResultListener(this);
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        return this.f337496d.getActivityControlSurface().onActivityResult(i, i2, intent);
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        this.f337497e.push(activityPluginBinding);
        mo164462a(activityPluginBinding);
    }

    public void onDetachedFromActivity() {
        this.f337497e.pop();
        this.f337496d.getActivityControlSurface().detachFromActivity();
        if (!this.f337497e.isEmpty()) {
            ActivityPluginBinding peek = this.f337497e.peek();
            C87412m.m108593f(peek, "top");
            mo164462a(peek);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f337497e.pop();
        this.f337496d.getActivityControlSurface().detachFromActivityForConfigChanges();
        if (!this.f337497e.isEmpty()) {
            ActivityPluginBinding peek = this.f337497e.peek();
            C87412m.m108593f(peek, "top");
            mo164462a(peek);
        }
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        this.f337497e.push(activityPluginBinding);
        mo164462a(activityPluginBinding);
    }
}
