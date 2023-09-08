package p172io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Trace;
import androidx.lifecycle.C39623j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p172io.flutter.Log;
import p172io.flutter.embedding.android.ExclusiveAppComponent;
import p172io.flutter.embedding.engine.loader.FlutterLoader;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.PluginRegistry;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityControlSurface;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p172io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware;
import p172io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface;
import p172io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverPluginBinding;
import p172io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware;
import p172io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface;
import p172io.flutter.embedding.engine.plugins.contentprovider.ContentProviderPluginBinding;
import p172io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import p172io.flutter.embedding.engine.plugins.service.ServiceAware;
import p172io.flutter.embedding.engine.plugins.service.ServiceControlSurface;
import p172io.flutter.embedding.engine.plugins.service.ServicePluginBinding;
import p172io.flutter.plugin.common.PluginRegistry;

/* renamed from: io.flutter.embedding.engine.FlutterEngineConnectionRegistry */
class FlutterEngineConnectionRegistry implements PluginRegistry, ActivityControlSurface, ServiceControlSurface, BroadcastReceiverControlSurface, ContentProviderControlSurface {
    private static final String TAG = "FlutterEngineCxnRegstry";
    private final Map<Class<? extends FlutterPlugin>, ActivityAware> activityAwarePlugins = new HashMap();
    private FlutterEngineActivityPluginBinding activityPluginBinding;
    private BroadcastReceiver broadcastReceiver;
    private final Map<Class<? extends FlutterPlugin>, BroadcastReceiverAware> broadcastReceiverAwarePlugins = new HashMap();
    private FlutterEngineBroadcastReceiverPluginBinding broadcastReceiverPluginBinding;
    private ContentProvider contentProvider;
    private final Map<Class<? extends FlutterPlugin>, ContentProviderAware> contentProviderAwarePlugins = new HashMap();
    private FlutterEngineContentProviderPluginBinding contentProviderPluginBinding;
    private ExclusiveAppComponent<Activity> exclusiveActivity;
    private final FlutterEngine flutterEngine;
    private boolean isWaitingForActivityReattachment = false;
    private final FlutterPlugin.FlutterPluginBinding pluginBinding;
    private final Map<Class<? extends FlutterPlugin>, FlutterPlugin> plugins = new HashMap();
    private Service service;
    private final Map<Class<? extends FlutterPlugin>, ServiceAware> serviceAwarePlugins = new HashMap();
    private FlutterEngineServicePluginBinding servicePluginBinding;

    /* renamed from: io.flutter.embedding.engine.FlutterEngineConnectionRegistry$DefaultFlutterAssets */
    public static class DefaultFlutterAssets implements FlutterPlugin.FlutterAssets {
        public final FlutterLoader flutterLoader;

        public String getAssetFilePathByName(String str) {
            return this.flutterLoader.getLookupKeyForAsset(str);
        }

        public String getAssetFilePathBySubpath(String str) {
            return this.flutterLoader.getLookupKeyForAsset(str);
        }

        private DefaultFlutterAssets(FlutterLoader flutterLoader2) {
            this.flutterLoader = flutterLoader2;
        }

        public String getAssetFilePathByName(String str, String str2) {
            return this.flutterLoader.getLookupKeyForAsset(str, str2);
        }

        public String getAssetFilePathBySubpath(String str, String str2) {
            return this.flutterLoader.getLookupKeyForAsset(str, str2);
        }
    }

    /* renamed from: io.flutter.embedding.engine.FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding */
    public static class FlutterEngineActivityPluginBinding implements ActivityPluginBinding {
        private final Activity activity;
        private final HiddenLifecycleReference hiddenLifecycleReference;
        private final Set<PluginRegistry.ActivityResultListener> onActivityResultListeners = new HashSet();
        private final Set<PluginRegistry.NewIntentListener> onNewIntentListeners = new HashSet();
        private final Set<PluginRegistry.RequestPermissionsResultListener> onRequestPermissionsResultListeners = new HashSet();
        private final Set<ActivityPluginBinding.OnSaveInstanceStateListener> onSaveInstanceStateListeners = new HashSet();
        private final Set<PluginRegistry.UserLeaveHintListener> onUserLeaveHintListeners = new HashSet();

        public FlutterEngineActivityPluginBinding(Activity activity2, C39623j jVar) {
            this.activity = activity2;
            this.hiddenLifecycleReference = new HiddenLifecycleReference(jVar);
        }

        public void addActivityResultListener(PluginRegistry.ActivityResultListener activityResultListener) {
            this.onActivityResultListeners.add(activityResultListener);
        }

        public void addOnNewIntentListener(PluginRegistry.NewIntentListener newIntentListener) {
            this.onNewIntentListeners.add(newIntentListener);
        }

        public void addOnSaveStateListener(ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceStateListener) {
            this.onSaveInstanceStateListeners.add(onSaveInstanceStateListener);
        }

        public void addOnUserLeaveHintListener(PluginRegistry.UserLeaveHintListener userLeaveHintListener) {
            this.onUserLeaveHintListeners.add(userLeaveHintListener);
        }

        public void addRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
            this.onRequestPermissionsResultListeners.add(requestPermissionsResultListener);
        }

        public Activity getActivity() {
            return this.activity;
        }

        public Object getLifecycle() {
            return this.hiddenLifecycleReference;
        }

        public boolean onActivityResult(int i, int i2, Intent intent) {
            Iterator it = new HashSet(this.onActivityResultListeners).iterator();
            while (true) {
                boolean z = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z;
                    }
                    if (((PluginRegistry.ActivityResultListener) it.next()).onActivityResult(i, i2, intent) || z) {
                        z = true;
                    }
                }
            }
        }

        public void onNewIntent(Intent intent) {
            for (PluginRegistry.NewIntentListener onNewIntent : this.onNewIntentListeners) {
                onNewIntent.onNewIntent(intent);
            }
        }

        public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            Iterator<PluginRegistry.RequestPermissionsResultListener> it = this.onRequestPermissionsResultListeners.iterator();
            while (true) {
                boolean z = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z;
                    }
                    if (it.next().onRequestPermissionsResult(i, strArr, iArr) || z) {
                        z = true;
                    }
                }
            }
        }

        public void onRestoreInstanceState(Bundle bundle) {
            for (ActivityPluginBinding.OnSaveInstanceStateListener onRestoreInstanceState : this.onSaveInstanceStateListeners) {
                onRestoreInstanceState.onRestoreInstanceState(bundle);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            for (ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceState : this.onSaveInstanceStateListeners) {
                onSaveInstanceState.onSaveInstanceState(bundle);
            }
        }

        public void onUserLeaveHint() {
            for (PluginRegistry.UserLeaveHintListener onUserLeaveHint : this.onUserLeaveHintListeners) {
                onUserLeaveHint.onUserLeaveHint();
            }
        }

        public void removeActivityResultListener(PluginRegistry.ActivityResultListener activityResultListener) {
            this.onActivityResultListeners.remove(activityResultListener);
        }

        public void removeOnNewIntentListener(PluginRegistry.NewIntentListener newIntentListener) {
            this.onNewIntentListeners.remove(newIntentListener);
        }

        public void removeOnSaveStateListener(ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceStateListener) {
            this.onSaveInstanceStateListeners.remove(onSaveInstanceStateListener);
        }

        public void removeOnUserLeaveHintListener(PluginRegistry.UserLeaveHintListener userLeaveHintListener) {
            this.onUserLeaveHintListeners.remove(userLeaveHintListener);
        }

        public void removeRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
            this.onRequestPermissionsResultListeners.remove(requestPermissionsResultListener);
        }
    }

    /* renamed from: io.flutter.embedding.engine.FlutterEngineConnectionRegistry$FlutterEngineBroadcastReceiverPluginBinding */
    public static class FlutterEngineBroadcastReceiverPluginBinding implements BroadcastReceiverPluginBinding {
        private final BroadcastReceiver broadcastReceiver;

        public FlutterEngineBroadcastReceiverPluginBinding(BroadcastReceiver broadcastReceiver2) {
            this.broadcastReceiver = broadcastReceiver2;
        }

        public BroadcastReceiver getBroadcastReceiver() {
            return this.broadcastReceiver;
        }
    }

    /* renamed from: io.flutter.embedding.engine.FlutterEngineConnectionRegistry$FlutterEngineContentProviderPluginBinding */
    public static class FlutterEngineContentProviderPluginBinding implements ContentProviderPluginBinding {
        private final ContentProvider contentProvider;

        public FlutterEngineContentProviderPluginBinding(ContentProvider contentProvider2) {
            this.contentProvider = contentProvider2;
        }

        public ContentProvider getContentProvider() {
            return this.contentProvider;
        }
    }

    /* renamed from: io.flutter.embedding.engine.FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding */
    public static class FlutterEngineServicePluginBinding implements ServicePluginBinding {
        private final HiddenLifecycleReference hiddenLifecycleReference;
        private final Set<ServiceAware.OnModeChangeListener> onModeChangeListeners = new HashSet();
        private final Service service;

        public FlutterEngineServicePluginBinding(Service service2, C39623j jVar) {
            this.service = service2;
            this.hiddenLifecycleReference = jVar != null ? new HiddenLifecycleReference(jVar) : null;
        }

        public void addOnModeChangeListener(ServiceAware.OnModeChangeListener onModeChangeListener) {
            this.onModeChangeListeners.add(onModeChangeListener);
        }

        public Object getLifecycle() {
            return this.hiddenLifecycleReference;
        }

        public Service getService() {
            return this.service;
        }

        public void onMoveToBackground() {
            for (ServiceAware.OnModeChangeListener onMoveToBackground : this.onModeChangeListeners) {
                onMoveToBackground.onMoveToBackground();
            }
        }

        public void onMoveToForeground() {
            for (ServiceAware.OnModeChangeListener onMoveToForeground : this.onModeChangeListeners) {
                onMoveToForeground.onMoveToForeground();
            }
        }

        public void removeOnModeChangeListener(ServiceAware.OnModeChangeListener onModeChangeListener) {
            this.onModeChangeListeners.remove(onModeChangeListener);
        }
    }

    public FlutterEngineConnectionRegistry(Context context, FlutterEngine flutterEngine2, FlutterLoader flutterLoader) {
        this.flutterEngine = flutterEngine2;
        this.pluginBinding = new FlutterPlugin.FlutterPluginBinding(context, flutterEngine2, flutterEngine2.getDartExecutor(), flutterEngine2.getRenderer(), flutterEngine2.getPlatformViewsController().getRegistry(), new DefaultFlutterAssets(flutterLoader));
    }

    private void attachToActivityInternal(Activity activity, C39623j jVar) {
        this.activityPluginBinding = new FlutterEngineActivityPluginBinding(activity, jVar);
        this.flutterEngine.getPlatformViewsController().attach(activity, this.flutterEngine.getRenderer(), this.flutterEngine.getDartExecutor());
        for (ActivityAware next : this.activityAwarePlugins.values()) {
            if (this.isWaitingForActivityReattachment) {
                next.onReattachedToActivityForConfigChanges(this.activityPluginBinding);
            } else {
                next.onAttachedToActivity(this.activityPluginBinding);
            }
        }
        this.isWaitingForActivityReattachment = false;
    }

    private Activity attachedActivity() {
        ExclusiveAppComponent<Activity> exclusiveAppComponent = this.exclusiveActivity;
        if (exclusiveAppComponent != null) {
            return exclusiveAppComponent.getAppComponent();
        }
        return null;
    }

    private void detachFromActivityInternal() {
        this.flutterEngine.getPlatformViewsController().detach();
        this.exclusiveActivity = null;
        this.activityPluginBinding = null;
    }

    private void detachFromAppComponent() {
        if (isAttachedToActivity()) {
            detachFromActivity();
        } else if (isAttachedToService()) {
            detachFromService();
        } else if (isAttachedToBroadcastReceiver()) {
            detachFromBroadcastReceiver();
        } else if (isAttachedToContentProvider()) {
            detachFromContentProvider();
        }
    }

    private boolean isAttachedToActivity() {
        return this.exclusiveActivity != null;
    }

    private boolean isAttachedToBroadcastReceiver() {
        return this.broadcastReceiver != null;
    }

    private boolean isAttachedToContentProvider() {
        return this.contentProvider != null;
    }

    private boolean isAttachedToService() {
        return this.service != null;
    }

    public void add(FlutterPlugin flutterPlugin) {
        Trace.beginSection("FlutterEngineConnectionRegistry#add " + flutterPlugin.getClass().getSimpleName());
        try {
            if (has(flutterPlugin.getClass())) {
                Log.m165292w(TAG, "Attempted to register plugin (" + flutterPlugin + ") but it was already registered with this FlutterEngine (" + this.flutterEngine + ").");
                return;
            }
            Log.m165290v(TAG, "Adding plugin: " + flutterPlugin);
            this.plugins.put(flutterPlugin.getClass(), flutterPlugin);
            flutterPlugin.onAttachedToEngine(this.pluginBinding);
            if (flutterPlugin instanceof ActivityAware) {
                ActivityAware activityAware = (ActivityAware) flutterPlugin;
                this.activityAwarePlugins.put(flutterPlugin.getClass(), activityAware);
                if (isAttachedToActivity()) {
                    activityAware.onAttachedToActivity(this.activityPluginBinding);
                }
            }
            if (flutterPlugin instanceof ServiceAware) {
                ServiceAware serviceAware = (ServiceAware) flutterPlugin;
                this.serviceAwarePlugins.put(flutterPlugin.getClass(), serviceAware);
                if (isAttachedToService()) {
                    serviceAware.onAttachedToService(this.servicePluginBinding);
                }
            }
            if (flutterPlugin instanceof BroadcastReceiverAware) {
                BroadcastReceiverAware broadcastReceiverAware = (BroadcastReceiverAware) flutterPlugin;
                this.broadcastReceiverAwarePlugins.put(flutterPlugin.getClass(), broadcastReceiverAware);
                if (isAttachedToBroadcastReceiver()) {
                    broadcastReceiverAware.onAttachedToBroadcastReceiver(this.broadcastReceiverPluginBinding);
                }
            }
            if (flutterPlugin instanceof ContentProviderAware) {
                ContentProviderAware contentProviderAware = (ContentProviderAware) flutterPlugin;
                this.contentProviderAwarePlugins.put(flutterPlugin.getClass(), contentProviderAware);
                if (isAttachedToContentProvider()) {
                    contentProviderAware.onAttachedToContentProvider(this.contentProviderPluginBinding);
                }
            }
            Trace.endSection();
        } finally {
            Trace.endSection();
        }
    }

    public void attachToActivity(ExclusiveAppComponent<Activity> exclusiveAppComponent, C39623j jVar) {
        String str;
        Trace.beginSection("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Attaching to an exclusive Activity: ");
            sb.append(exclusiveAppComponent.getAppComponent());
            String str2 = "";
            if (isAttachedToActivity()) {
                str = " evicting previous activity " + attachedActivity();
            } else {
                str = str2;
            }
            sb.append(str);
            sb.append(".");
            if (this.isWaitingForActivityReattachment) {
                str2 = " This is after a config change.";
            }
            sb.append(str2);
            Log.m165290v(TAG, sb.toString());
            ExclusiveAppComponent<Activity> exclusiveAppComponent2 = this.exclusiveActivity;
            if (exclusiveAppComponent2 != null) {
                exclusiveAppComponent2.detachFromFlutterEngine();
            }
            detachFromAppComponent();
            this.exclusiveActivity = exclusiveAppComponent;
            attachToActivityInternal(exclusiveAppComponent.getAppComponent(), jVar);
        } finally {
            Trace.endSection();
        }
    }

    public void attachToBroadcastReceiver(BroadcastReceiver broadcastReceiver2, C39623j jVar) {
        Trace.beginSection("FlutterEngineConnectionRegistry#attachToBroadcastReceiver");
        Log.m165290v(TAG, "Attaching to BroadcastReceiver: " + broadcastReceiver2);
        try {
            detachFromAppComponent();
            this.broadcastReceiver = broadcastReceiver2;
            this.broadcastReceiverPluginBinding = new FlutterEngineBroadcastReceiverPluginBinding(broadcastReceiver2);
            for (BroadcastReceiverAware onAttachedToBroadcastReceiver : this.broadcastReceiverAwarePlugins.values()) {
                onAttachedToBroadcastReceiver.onAttachedToBroadcastReceiver(this.broadcastReceiverPluginBinding);
            }
        } finally {
            Trace.endSection();
        }
    }

    public void attachToContentProvider(ContentProvider contentProvider2, C39623j jVar) {
        Trace.beginSection("FlutterEngineConnectionRegistry#attachToContentProvider");
        Log.m165290v(TAG, "Attaching to ContentProvider: " + contentProvider2);
        try {
            detachFromAppComponent();
            this.contentProvider = contentProvider2;
            this.contentProviderPluginBinding = new FlutterEngineContentProviderPluginBinding(contentProvider2);
            for (ContentProviderAware onAttachedToContentProvider : this.contentProviderAwarePlugins.values()) {
                onAttachedToContentProvider.onAttachedToContentProvider(this.contentProviderPluginBinding);
            }
        } finally {
            Trace.endSection();
        }
    }

    public void attachToService(Service service2, C39623j jVar, boolean z) {
        Trace.beginSection("FlutterEngineConnectionRegistry#attachToService");
        Log.m165290v(TAG, "Attaching to a Service: " + service2);
        try {
            detachFromAppComponent();
            this.service = service2;
            this.servicePluginBinding = new FlutterEngineServicePluginBinding(service2, jVar);
            for (ServiceAware onAttachedToService : this.serviceAwarePlugins.values()) {
                onAttachedToService.onAttachedToService(this.servicePluginBinding);
            }
        } finally {
            Trace.endSection();
        }
    }

    public void destroy() {
        Log.m165290v(TAG, "Destroying.");
        detachFromAppComponent();
        removeAll();
    }

    public void detachFromActivity() {
        if (isAttachedToActivity()) {
            Trace.beginSection("FlutterEngineConnectionRegistry#detachFromActivity");
            try {
                Log.m165290v(TAG, "Detaching from an Activity: " + attachedActivity());
                for (ActivityAware onDetachedFromActivity : this.activityAwarePlugins.values()) {
                    onDetachedFromActivity.onDetachedFromActivity();
                }
                detachFromActivityInternal();
            } finally {
                Trace.endSection();
            }
        } else {
            Log.m165286e(TAG, "Attempted to detach plugins from an Activity when no Activity was attached.");
        }
    }

    public void detachFromActivityForConfigChanges() {
        if (isAttachedToActivity()) {
            Trace.beginSection("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
            Log.m165290v(TAG, "Detaching from an Activity for config changes: " + attachedActivity());
            try {
                this.isWaitingForActivityReattachment = true;
                for (ActivityAware onDetachedFromActivityForConfigChanges : this.activityAwarePlugins.values()) {
                    onDetachedFromActivityForConfigChanges.onDetachedFromActivityForConfigChanges();
                }
                detachFromActivityInternal();
            } finally {
                Trace.endSection();
            }
        } else {
            Log.m165286e(TAG, "Attempted to detach plugins from an Activity when no Activity was attached.");
        }
    }

    public void detachFromBroadcastReceiver() {
        if (isAttachedToBroadcastReceiver()) {
            Trace.beginSection("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
            Log.m165290v(TAG, "Detaching from BroadcastReceiver: " + this.broadcastReceiver);
            try {
                for (BroadcastReceiverAware onDetachedFromBroadcastReceiver : this.broadcastReceiverAwarePlugins.values()) {
                    onDetachedFromBroadcastReceiver.onDetachedFromBroadcastReceiver();
                }
            } finally {
                Trace.endSection();
            }
        } else {
            Log.m165286e(TAG, "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
        }
    }

    public void detachFromContentProvider() {
        if (isAttachedToContentProvider()) {
            Trace.beginSection("FlutterEngineConnectionRegistry#detachFromContentProvider");
            Log.m165290v(TAG, "Detaching from ContentProvider: " + this.contentProvider);
            try {
                for (ContentProviderAware onDetachedFromContentProvider : this.contentProviderAwarePlugins.values()) {
                    onDetachedFromContentProvider.onDetachedFromContentProvider();
                }
            } finally {
                Trace.endSection();
            }
        } else {
            Log.m165286e(TAG, "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
        }
    }

    public void detachFromService() {
        if (isAttachedToService()) {
            Trace.beginSection("FlutterEngineConnectionRegistry#detachFromService");
            Log.m165290v(TAG, "Detaching from a Service: " + this.service);
            try {
                for (ServiceAware onDetachedFromService : this.serviceAwarePlugins.values()) {
                    onDetachedFromService.onDetachedFromService();
                }
                this.service = null;
                this.servicePluginBinding = null;
            } finally {
                Trace.endSection();
            }
        } else {
            Log.m165286e(TAG, "Attempted to detach plugins from a Service when no Service was attached.");
        }
    }

    public FlutterPlugin get(Class<? extends FlutterPlugin> cls) {
        return this.plugins.get(cls);
    }

    public boolean has(Class<? extends FlutterPlugin> cls) {
        return this.plugins.containsKey(cls);
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        Log.m165290v(TAG, "Forwarding onActivityResult() to plugins.");
        if (isAttachedToActivity()) {
            Trace.beginSection("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                return this.activityPluginBinding.onActivityResult(i, i2, intent);
            } finally {
                Trace.endSection();
            }
        } else {
            Log.m165286e(TAG, "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
    }

    public void onMoveToBackground() {
        if (isAttachedToService()) {
            Trace.beginSection("FlutterEngineConnectionRegistry#onMoveToBackground");
            Log.m165290v(TAG, "Attached Service moved to background.");
            try {
                this.servicePluginBinding.onMoveToBackground();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void onMoveToForeground() {
        if (isAttachedToService()) {
            Trace.beginSection("FlutterEngineConnectionRegistry#onMoveToForeground");
            try {
                Log.m165290v(TAG, "Attached Service moved to foreground.");
                this.servicePluginBinding.onMoveToForeground();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void onNewIntent(Intent intent) {
        Log.m165290v(TAG, "Forwarding onNewIntent() to plugins.");
        if (isAttachedToActivity()) {
            Trace.beginSection("FlutterEngineConnectionRegistry#onNewIntent");
            try {
                this.activityPluginBinding.onNewIntent(intent);
            } finally {
                Trace.endSection();
            }
        } else {
            Log.m165286e(TAG, "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
        }
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log.m165290v(TAG, "Forwarding onRequestPermissionsResult() to plugins.");
        if (isAttachedToActivity()) {
            Trace.beginSection("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                return this.activityPluginBinding.onRequestPermissionsResult(i, strArr, iArr);
            } finally {
                Trace.endSection();
            }
        } else {
            Log.m165286e(TAG, "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        Log.m165290v(TAG, "Forwarding onRestoreInstanceState() to plugins.");
        if (isAttachedToActivity()) {
            Trace.beginSection("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                this.activityPluginBinding.onRestoreInstanceState(bundle);
            } finally {
                Trace.endSection();
            }
        } else {
            Log.m165286e(TAG, "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Log.m165290v(TAG, "Forwarding onSaveInstanceState() to plugins.");
        if (isAttachedToActivity()) {
            Trace.beginSection("FlutterEngineConnectionRegistry#onSaveInstanceState");
            try {
                this.activityPluginBinding.onSaveInstanceState(bundle);
            } finally {
                Trace.endSection();
            }
        } else {
            Log.m165286e(TAG, "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
        }
    }

    public void onUserLeaveHint() {
        Log.m165290v(TAG, "Forwarding onUserLeaveHint() to plugins.");
        if (isAttachedToActivity()) {
            Trace.beginSection("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                this.activityPluginBinding.onUserLeaveHint();
            } finally {
                Trace.endSection();
            }
        } else {
            Log.m165286e(TAG, "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
        }
    }

    public void remove(Class<? extends FlutterPlugin> cls) {
        FlutterPlugin flutterPlugin = this.plugins.get(cls);
        if (flutterPlugin != null) {
            Trace.beginSection("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
            try {
                Log.m165290v(TAG, "Removing plugin: " + flutterPlugin);
                if (flutterPlugin instanceof ActivityAware) {
                    if (isAttachedToActivity()) {
                        ((ActivityAware) flutterPlugin).onDetachedFromActivity();
                    }
                    this.activityAwarePlugins.remove(cls);
                }
                if (flutterPlugin instanceof ServiceAware) {
                    if (isAttachedToService()) {
                        ((ServiceAware) flutterPlugin).onDetachedFromService();
                    }
                    this.serviceAwarePlugins.remove(cls);
                }
                if (flutterPlugin instanceof BroadcastReceiverAware) {
                    if (isAttachedToBroadcastReceiver()) {
                        ((BroadcastReceiverAware) flutterPlugin).onDetachedFromBroadcastReceiver();
                    }
                    this.broadcastReceiverAwarePlugins.remove(cls);
                }
                if (flutterPlugin instanceof ContentProviderAware) {
                    if (isAttachedToContentProvider()) {
                        ((ContentProviderAware) flutterPlugin).onDetachedFromContentProvider();
                    }
                    this.contentProviderAwarePlugins.remove(cls);
                }
                flutterPlugin.onDetachedFromEngine(this.pluginBinding);
                this.plugins.remove(cls);
            } finally {
                Trace.endSection();
            }
        }
    }

    public void removeAll() {
        remove((Set<Class<? extends FlutterPlugin>>) new HashSet(this.plugins.keySet()));
        this.plugins.clear();
    }

    public void remove(Set<Class<? extends FlutterPlugin>> set) {
        for (Class<? extends FlutterPlugin> remove : set) {
            remove(remove);
        }
    }

    public void add(Set<FlutterPlugin> set) {
        for (FlutterPlugin add : set) {
            add(add);
        }
    }
}
