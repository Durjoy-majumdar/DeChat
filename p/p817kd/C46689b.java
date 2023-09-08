package p817kd;

/* renamed from: kd.b */
public class C46689b implements C88141d {
    private static C46689b sInstance;

    private C46689b() {
    }

    public static C46689b getInstance() {
        if (sInstance == null) {
            sInstance = new C46689b();
        }
        return sInstance;
    }

    public C88140c createClientProxy() {
        return new C88139a();
    }
}
