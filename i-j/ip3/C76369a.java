package ip3;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: ip3.a */
public class C76369a {

    /* renamed from: a */
    public Bundle f223650a = null;

    public C76369a(Intent intent) {
        this.f223650a = intent.getExtras();
    }

    /* renamed from: a */
    public int mo106599a(String str, int i) {
        Bundle bundle = this.f223650a;
        return bundle == null ? i : bundle.getInt(str, i);
    }

    /* renamed from: b */
    public String mo106600b(String str) {
        Bundle bundle = this.f223650a;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str);
    }
}
