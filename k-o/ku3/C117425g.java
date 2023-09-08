package ku3;

import android.util.Printer;
import java.util.List;
import ku3.C117421f;

/* renamed from: ku3.g */
public class C117425g implements Printer {

    /* renamed from: a */
    public int f351468a = 0;

    /* renamed from: b */
    public final /* synthetic */ List f351469b;

    public C117425g(C117421f.C117423b bVar, List list) {
        this.f351469b = list;
    }

    public void println(String str) {
        if (this.f351468a > 1) {
            this.f351469b.add(str.trim());
        }
        this.f351468a++;
    }
}
