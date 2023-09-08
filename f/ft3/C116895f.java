package ft3;

/* renamed from: ft3.f */
public final class C116895f {

    /* renamed from: a */
    public static C116894e f350315a = new C116897i();

    /* renamed from: a */
    public static void m164889a(String str, Object obj) {
        if (obj != null) {
            if (obj instanceof Exception) {
                Exception exc = (Exception) obj;
                C116894e eVar = f350315a;
                eVar.mo180857e(str, "" + obj);
                return;
            }
            f350315a.mo180857e(str, obj.toString());
        }
    }

    /* renamed from: b */
    public static void m164890b(String str) {
        m164891c("RiskScanner", str);
    }

    /* renamed from: c */
    public static void m164891c(String str, Object obj) {
        if (obj != null) {
            f350315a.mo180858i(str, obj.toString());
        }
    }

    /* renamed from: d */
    public static void m164892d(String str, Object obj) {
        if (obj != null) {
            if (obj instanceof Exception) {
                Exception exc = (Exception) obj;
                C116894e eVar = f350315a;
                eVar.mo180859w(str, "" + obj);
                return;
            }
            f350315a.mo180859w(str, obj.toString());
        }
    }

    /* renamed from: e */
    public static void m164893e(Throwable th) {
        m164892d("RiskScanner", th);
    }
}
