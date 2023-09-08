package cb3;

/* renamed from: cb3.b */
public class C92391b {

    /* renamed from: a */
    public int f264382a = 0;

    /* renamed from: b */
    public float f264383b = -1.0f;

    /* renamed from: c */
    public float f264384c = -1.0f;

    /* renamed from: d */
    public float f264385d = -1.0f;

    /* renamed from: e */
    public float f264386e = -1.0f;

    /* renamed from: f */
    public int f264387f = -1;

    /* renamed from: g */
    public float f264388g = -1.0f;

    /* renamed from: h */
    public float f264389h = -1.0f;

    /* renamed from: i */
    public float f264390i = -1.0f;

    /* renamed from: j */
    public float f264391j = -1.0f;

    /* renamed from: k */
    public int f264392k = -1;

    /* renamed from: a */
    public int mo126355a() {
        boolean z = false;
        if (!(this.f264383b >= 0.0f && this.f264384c >= 0.0f && this.f264385d >= 0.0f && this.f264386e >= 0.0f && this.f264387f >= 0)) {
            return 0;
        }
        if (this.f264388g >= 0.0f && this.f264389h >= 0.0f && this.f264390i >= 0.0f && this.f264391j >= 0.0f && this.f264392k >= 0) {
            z = true;
        }
        if (!z) {
            return 1;
        }
        return (Math.abs((int) (this.f264385d - this.f264390i)) > 30 || Math.abs((int) (this.f264386e - this.f264391j)) > 30 || this.f264387f != this.f264392k) ? 3 : 2;
    }
}
