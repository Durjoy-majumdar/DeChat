package androidx.camera.core.impl;

import androidx.camera.core.ImageProxy;
import java.util.List;
import p1167z8.C112608f;

public interface ImageProxyBundle {
    List<Integer> getCaptureIds();

    C112608f<ImageProxy> getImageProxy(int i);
}
