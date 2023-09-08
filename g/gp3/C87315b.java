package gp3;

import jp3.C9486a;
import junit.framework.Assert;

/* renamed from: gp3.b */
public class C87315b<_Callback> implements C9486a {

    /* renamed from: d */
    public C87314a f253058d;

    /* renamed from: e */
    public _Callback f253059e;

    /* renamed from: f */
    public int f253060f;

    public C87315b(_Callback _callback, C87314a aVar) {
        Assert.assertNotNull("Callback should not be null!", _callback);
        this.f253060f = _callback.hashCode();
        this.f253059e = _callback;
        this.f253058d = aVar;
    }

    public void dead() {
        Assert.assertNotNull(this.f253058d);
        this.f253058d.remove(this);
    }

    public boolean equals(Object obj) {
        return obj != null && obj.hashCode() == this.f253060f;
    }

    public int hashCode() {
        return this.f253060f;
    }
}
