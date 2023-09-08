package wd3;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;

/* renamed from: wd3.r0 */
public class C53155r0 {

    /* renamed from: a */
    public int f148310a;

    /* renamed from: b */
    public int f148311b;

    /* renamed from: c */
    public String f148312c;

    /* renamed from: d */
    public int f148313d;

    /* renamed from: e */
    public Object f148314e;

    /* renamed from: f */
    public String f148315f;

    /* renamed from: g */
    public String f148316g;

    /* renamed from: h */
    public Object f148317h;

    /* renamed from: i */
    public String f148318i;

    /* renamed from: j */
    public int f148319j;

    /* renamed from: k */
    public int f148320k;

    /* renamed from: l */
    public int f148321l;

    /* renamed from: m */
    public String f148322m;

    /* renamed from: n */
    public int f148323n = 0;

    /* renamed from: o */
    public C72963f4 f148324o = null;

    /* renamed from: p */
    public int f148325p = 1;

    /* renamed from: q */
    public String f148326q = null;

    @Deprecated
    public C53155r0(int i, int i2, String str, int i3, Object obj) {
        this.f148310a = i;
        this.f148311b = i2;
        this.f148312c = str;
        this.f148313d = i3;
        this.f148314e = obj;
    }

    /* renamed from: a */
    public <T> T mo73845a(Class<T> cls) {
        if (cls.isInstance(this.f148314e)) {
            return cls.cast(this.f148314e);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return obj instanceof C53155r0 ? hashCode() == ((C53155r0) obj).hashCode() : super.equals(obj);
    }

    public int hashCode() {
        int hashCode = super.hashCode();
        if (!Util.isNullOrNil(this.f148312c)) {
            hashCode += this.f148312c.hashCode();
        }
        int i = hashCode + this.f148313d + this.f148311b + this.f148310a;
        Object obj = this.f148314e;
        return obj != null ? i + obj.hashCode() : i;
    }

    public C53155r0(String str, int i, Object obj) {
        this.f148312c = str;
        this.f148314e = obj;
        this.f148313d = i;
    }
}
