package androidx.camera.extensions.internal.compat.quirk;

import androidx.camera.core.impl.Quirk;
import java.util.ArrayList;
import java.util.List;

public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
    }

    public static List<Quirk> loadQuirks() {
        ArrayList arrayList = new ArrayList();
        if (ExtensionDisabledQuirk.load()) {
            arrayList.add(new ExtensionDisabledQuirk());
        }
        return arrayList;
    }
}
