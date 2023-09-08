package eu3;

/* renamed from: eu3.g */
public class C116786g extends C97749e {

    /* renamed from: b */
    public static final /* synthetic */ int f350105b = 0;

    /* renamed from: b */
    public static Thread m164739b(String str, Runnable runnable, int i) {
        C116784c cVar = new C116784c(runnable);
        C116785d dVar = new C116785d(cVar, "[GT]" + str);
        dVar.setPriority(i);
        return dVar;
    }
}
