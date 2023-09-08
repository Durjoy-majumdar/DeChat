package p262wm;

/* renamed from: wm.d */
public enum C15521d {
    TencentMap(0),
    GoogleMap(1),
    SogouMap(2),
    BaiduMap(3),
    AutonaviMap(4);

    /* access modifiers changed from: public */
    C15521d(int i) {
    }

    /* renamed from: a */
    public String mo14299a() {
        int ordinal = ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "com.tencent.map" : "com.autonavi.minimap" : "com.baidu.BaiduMap" : "com.sogou.map.android.maps" : "com.google.android.apps.maps";
    }
}
