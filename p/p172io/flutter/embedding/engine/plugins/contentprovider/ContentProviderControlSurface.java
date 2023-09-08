package p172io.flutter.embedding.engine.plugins.contentprovider;

import android.content.ContentProvider;
import androidx.lifecycle.C39623j;

/* renamed from: io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface */
public interface ContentProviderControlSurface {
    void attachToContentProvider(ContentProvider contentProvider, C39623j jVar);

    void detachFromContentProvider();
}
