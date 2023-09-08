package com.tencent.tmassistantsdk.util;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

public class Res {
    private static final String TAG = "Res";
    public final String RclassName = (this.ctx.getPackageName() + ".R");
    public Context ctx;

    public Res(Context context) {
        this.ctx = context;
    }

    private int reflectResouce(String str, String str2) {
        if (this.RclassName == null || str == null || str2 == null) {
            return 0;
        }
        try {
            Class<?> cls = Class.forName(this.RclassName + "$" + str);
            return Util.getInt(cls.getField(str2).get(cls.newInstance()).toString(), -1);
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return -1;
        }
    }

    public int drawable(String str) {
        return reflectResouce("drawable", str);
    }

    /* renamed from: id */
    public int mo179883id(String str) {
        return reflectResouce("id", str);
    }

    public int layout(String str) {
        return reflectResouce("layout", str);
    }

    public int string(String str) {
        return reflectResouce("string", str);
    }

    public int style(String str) {
        return reflectResouce("style", str);
    }
}
