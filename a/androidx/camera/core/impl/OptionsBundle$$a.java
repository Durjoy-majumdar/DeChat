package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;
import java.util.Comparator;

public final /* synthetic */ class OptionsBundle$$a implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return ((Config.Option) obj).getId().compareTo(((Config.Option) obj2).getId());
    }
}
