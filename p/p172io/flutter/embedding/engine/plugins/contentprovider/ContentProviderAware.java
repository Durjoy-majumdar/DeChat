package p172io.flutter.embedding.engine.plugins.contentprovider;

/* renamed from: io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware */
public interface ContentProviderAware {
    void onAttachedToContentProvider(ContentProviderPluginBinding contentProviderPluginBinding);

    void onDetachedFromContentProvider();
}
