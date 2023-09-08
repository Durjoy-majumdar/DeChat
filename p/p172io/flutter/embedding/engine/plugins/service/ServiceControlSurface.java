package p172io.flutter.embedding.engine.plugins.service;

import android.app.Service;
import androidx.lifecycle.C39623j;

/* renamed from: io.flutter.embedding.engine.plugins.service.ServiceControlSurface */
public interface ServiceControlSurface {
    void attachToService(Service service, C39623j jVar, boolean z);

    void detachFromService();

    void onMoveToBackground();

    void onMoveToForeground();
}
