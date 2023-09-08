package v21;

/* renamed from: v21.b */
public class C102125b {

    /* renamed from: a */
    public int f300721a = 0;

    /* renamed from: b */
    public float f300722b = -1.0f;

    /* renamed from: c */
    public float f300723c = -1.0f;

    /* renamed from: d */
    public float f300724d = -1.0f;

    /* renamed from: e */
    public float f300725e = -1.0f;

    /* renamed from: f */
    public int f300726f = -1;

    /* renamed from: g */
    public float f300727g = -1.0f;

    /* renamed from: h */
    public float f300728h = -1.0f;

    /* renamed from: i */
    public float f300729i = -1.0f;

    /* renamed from: j */
    public float f300730j = -1.0f;

    /* renamed from: k */
    public int f300731k = -1;

    /* renamed from: a */
    public int mo141641a() {
        boolean z = false;
        if (!(this.f300722b >= 0.0f && this.f300723c >= 0.0f && this.f300724d >= 0.0f && this.f300725e >= 0.0f && this.f300726f >= 0)) {
            return 0;
        }
        if (this.f300727g >= 0.0f && this.f300728h >= 0.0f && this.f300729i >= 0.0f && this.f300730j >= 0.0f && this.f300731k >= 0) {
            z = true;
        }
        if (!z) {
            return 1;
        }
        return (Math.abs((int) (this.f300724d - this.f300729i)) > 30 || Math.abs((int) (this.f300725e - this.f300730j)) > 30 || this.f300726f != this.f300731k) ? 3 : 2;
    }
}
