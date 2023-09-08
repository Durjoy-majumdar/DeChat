package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Map;

public class MutableTagBundle extends TagBundle {
    private MutableTagBundle(Map<String, Object> map) {
        super(map);
    }

    public static MutableTagBundle create() {
        return new MutableTagBundle(new ArrayMap());
    }

    public static MutableTagBundle from(TagBundle tagBundle) {
        ArrayMap arrayMap = new ArrayMap();
        for (String next : tagBundle.listKeys()) {
            arrayMap.put(next, tagBundle.getTag(next));
        }
        return new MutableTagBundle(arrayMap);
    }

    public void addTagBundle(TagBundle tagBundle) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.mTagMap;
        if (map2 != null && (map = tagBundle.mTagMap) != null) {
            map2.putAll(map);
        }
    }

    public void putTag(String str, Object obj) {
        this.mTagMap.put(str, obj);
    }
}
