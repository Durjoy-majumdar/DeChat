package p172io.clipworks.analytics;

import java.util.Map;
import java.util.TreeMap;
import p172io.clipworks.analytics.ALS12;

/* renamed from: io.clipworks.analytics.ALEvent */
public class ALEvent {
    private final int _globalSeqNum;
    private final int _localSeqNum;
    private final String _name;
    private Map<String, String> _params;
    private final long _time;
    private final long _timestamp;

    public ALEvent(int i, int i2, long j, long j2, String str, Map<String, String> map) {
        this._globalSeqNum = i;
        this._localSeqNum = i2;
        this._time = j;
        this._timestamp = j2;
        this._name = str;
        this._params = map;
    }

    public static ALEvent S12LoadFrom(ALS12.AnalyticsEvent analyticsEvent) {
        return new ALEvent(analyticsEvent.getGlobalSeqNum(), analyticsEvent.getLocalSeqNum(), analyticsEvent.getTime(), analyticsEvent.getTimestamp(), analyticsEvent.getName(), analyticsEvent.getParamsMap());
    }

    public void embedParams() {
        TreeMap treeMap = new TreeMap();
        Map<String, String> map = this._params;
        if (map != null) {
            treeMap.putAll(map);
        }
        treeMap.put("GSN", String.valueOf(this._globalSeqNum));
        treeMap.put("LSN", String.valueOf(this._localSeqNum));
        treeMap.put("SDKTimestamp", String.valueOf(this._timestamp));
        this._params = treeMap;
    }

    public int getGlobalSeqNum() {
        return this._globalSeqNum;
    }

    public int getLocalSeqNum() {
        return this._localSeqNum;
    }

    public String getName() {
        return this._name;
    }

    public Map<String, String> getParams() {
        return this._params;
    }

    public long getTime() {
        return this._time;
    }

    public long getTimestamp() {
        return this._timestamp;
    }
}
