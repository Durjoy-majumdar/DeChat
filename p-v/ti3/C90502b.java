package ti3;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: ti3.b */
public abstract class C90502b<P> {

    /* renamed from: a */
    public StringBuffer f260111a = new StringBuffer(String.valueOf(-1));

    /* renamed from: b */
    public final byte[] f260112b = new byte[0];

    public C90502b() {
        new Bundle();
    }

    /* renamed from: a */
    public C90502b mo124670a(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuffer stringBuffer = this.f260111a;
            stringBuffer.append(" --> ");
            stringBuffer.append(str);
        }
        return this;
    }

    /* renamed from: b */
    public C90502b mo124671b(int i) {
        synchronized (this.f260112b) {
        }
        mo124670a(String.valueOf(i));
        return this;
    }
}
