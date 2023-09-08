package zh3;

import android.util.Printer;
import android.util.StringBuilderPrinter;
import com.tencent.wcdb.support.LogPrinter;

public class e$$c implements Printer {

    /* renamed from: a */
    public final Printer f356747a;

    /* renamed from: b */
    public final Printer f356748b = new LogPrinter(5, "MicroMsg.MMDataBase");

    public e$$c(C119118e eVar, StringBuilder sb) {
        this.f356747a = new StringBuilderPrinter(sb);
    }

    public void println(String str) {
        ((StringBuilderPrinter) this.f356747a).println(str);
        this.f356748b.println(str);
    }
}
