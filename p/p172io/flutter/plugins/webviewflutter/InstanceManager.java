package p172io.flutter.plugins.webviewflutter;

import android.util.LongSparseArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.flutter.plugins.webviewflutter.InstanceManager */
public class InstanceManager {
    private final LongSparseArray<Object> instanceIdsToInstances = new LongSparseArray<>();
    private final Map<Object, Long> instancesToInstanceIds = new HashMap();

    public void addInstance(Object obj, long j) {
        this.instancesToInstanceIds.put(obj, Long.valueOf(j));
        this.instanceIdsToInstances.append(j, obj);
    }

    public Object getInstance(long j) {
        return this.instanceIdsToInstances.get(j);
    }

    public Long getInstanceId(Object obj) {
        return this.instancesToInstanceIds.get(obj);
    }

    public Long removeInstance(Object obj) {
        Long l = this.instancesToInstanceIds.get(obj);
        if (l != null) {
            this.instanceIdsToInstances.remove(l.longValue());
            this.instancesToInstanceIds.remove(obj);
        }
        return l;
    }

    public Object removeInstanceWithId(long j) {
        Object obj = this.instanceIdsToInstances.get(j);
        if (obj != null) {
            this.instanceIdsToInstances.remove(j);
            this.instancesToInstanceIds.remove(obj);
        }
        return obj;
    }
}
