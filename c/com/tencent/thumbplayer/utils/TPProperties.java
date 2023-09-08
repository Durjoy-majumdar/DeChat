package com.tencent.thumbplayer.utils;

import android.text.TextUtils;
import com.tencent.thumbplayer.common.report.ITPReportProperties;
import java.util.Map;
import java.util.Properties;
import org.json.JSONException;
import org.json.JSONObject;

public class TPProperties implements ITPReportProperties {
    private static final String TAG = "TPProperties";
    public final Properties properties;

    public TPProperties() {
        this((Properties) null);
    }

    public Properties getProperties() {
        return this.properties;
    }

    public boolean has(String str) {
        return (str == null || this.properties.get(str) == null) ? false : true;
    }

    public void propertiesToMap(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry entry : this.properties.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    map.put(key.toString(), "");
                } else {
                    map.put(key.toString(), value.toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("map must not be null!");
    }

    public void put(String str, String str2) {
        if (str == null) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.properties.put(str, str2);
        } else {
            this.properties.put(str, "");
        }
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject(this.properties);
        if (jSONObject.has("data")) {
            try {
                String string = jSONObject.getString("data");
                jSONObject.remove("data");
                jSONObject.put("data", new JSONObject(string));
            } catch (JSONException e) {
                TPLogUtil.m21895e(TAG, (Throwable) e);
            }
        }
        return jSONObject.toString();
    }

    public TPProperties(Properties properties2) {
        this.properties = new Properties();
        if (properties2 != null) {
            for (Map.Entry entry : properties2.entrySet()) {
                put((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public void put(String str, int i) {
        if (str != null) {
            this.properties.put(str, String.valueOf(i));
        }
    }

    public void put(String str, long j) {
        if (str != null) {
            this.properties.put(str, String.valueOf(j));
        }
    }

    public TPProperties(Map<String, String> map) {
        this.properties = new Properties();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                put((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    public void put(String str, float f) {
        if (str != null) {
            this.properties.put(str, String.valueOf(f));
        }
    }

    public void put(String str, Properties properties2) {
        if (str != null) {
            this.properties.put(str, properties2);
        }
    }

    public void put(String str, JSONObject jSONObject) {
        if (str != null) {
            this.properties.put(str, jSONObject);
        }
    }

    public TPProperties(String str, String str2) {
        this((Properties) new Properties(str, str2) {
            public final /* synthetic */ String val$key;
            public final /* synthetic */ String val$value;

            {
                this.val$key = r1;
                this.val$value = r2;
                put(r1, r2);
            }
        });
    }

    public TPProperties(Object... objArr) {
        this.properties = new Properties();
        int length = objArr.length;
        if (length % 2 == 0) {
            for (int i = 0; i < length; i += 2) {
                put(String.valueOf(objArr[i]), String.valueOf(objArr[i + 1]));
            }
            return;
        }
        throw new IllegalArgumentException("Supplied arguments must be even");
    }
}
