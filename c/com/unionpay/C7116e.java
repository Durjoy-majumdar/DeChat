package com.unionpay;

import java.util.Comparator;
import org.json.JSONObject;

/* renamed from: com.unionpay.e */
public final class C7116e implements Comparator {

    /* renamed from: d */
    public String f25069d;

    public C7116e(String str) {
        this.f25069d = str;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = (((JSONObject) obj).optLong(this.f25069d) > ((JSONObject) obj2).optLong(this.f25069d) ? 1 : (((JSONObject) obj).optLong(this.f25069d) == ((JSONObject) obj2).optLong(this.f25069d) ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }
}
