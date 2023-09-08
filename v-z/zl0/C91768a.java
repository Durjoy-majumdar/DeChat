package zl0;

import am0.C79589b;
import android.nfc.NdefMessage;
import android.nfc.Tag;
import fy3.C32228q;
import java.util.List;
import java.util.Set;
import rx3.C13598b0;

/* renamed from: zl0.a */
public interface C91768a {

    /* renamed from: zl0.a$a */
    public enum C91769a {
        SUCCESS,
        FAIL_SYSTEM_INTERNAL_ERROR,
        FAIL_ALREADY_STARTED,
        FAIL_NOT_STARTED
    }

    /* renamed from: a */
    C91769a mo115088a();

    /* renamed from: b */
    Set<C79589b> mo115089b();

    /* renamed from: c */
    void mo115090c(C32228q<? super byte[], ? super List<String>, ? super List<NdefMessage>, C13598b0> qVar);

    /* renamed from: d */
    C91769a mo115091d();

    /* renamed from: e */
    boolean mo115092e();

    /* renamed from: f */
    void mo115093f(boolean z);

    Tag getTag();
}
