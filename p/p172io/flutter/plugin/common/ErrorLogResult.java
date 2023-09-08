package p172io.flutter.plugin.common;

import p172io.flutter.Log;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: io.flutter.plugin.common.ErrorLogResult */
public class ErrorLogResult implements MethodChannel.Result {
    private int level;
    private String tag;

    public ErrorLogResult(String str) {
        this(str, Log.WARN);
    }

    public void error(String str, String str2, Object obj) {
        String str3;
        if (obj != null) {
            str3 = " details: " + obj;
        } else {
            str3 = "";
        }
        int i = this.level;
        if (i >= Log.WARN) {
            Log.println(i, this.tag, str2 + str3);
        }
    }

    public void notImplemented() {
        int i = this.level;
        if (i >= Log.WARN) {
            Log.println(i, this.tag, "method not implemented");
        }
    }

    public void success(Object obj) {
    }

    public ErrorLogResult(String str, int i) {
        this.tag = str;
        this.level = i;
    }
}
