package p172io.flutter.embedding.engine.plugins.activity;

/* renamed from: io.flutter.embedding.engine.plugins.activity.ActivityAware */
public interface ActivityAware {
    void onAttachedToActivity(ActivityPluginBinding activityPluginBinding);

    void onDetachedFromActivity();

    void onDetachedFromActivityForConfigChanges();

    void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding);
}
