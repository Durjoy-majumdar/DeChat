package p144dt;

import di3.C7335d;
import java.util.Map;

/* renamed from: dt.d */
public interface C7516d extends C7335d {

    /* renamed from: dt.d$a */
    public interface C7517a {
        /* renamed from: a */
        void mo8640a(String str, C7519c cVar, int i);

        /* renamed from: b */
        void mo8641b(String str, C7518b bVar, int i);

        /* renamed from: c */
        Map<String, Object> mo8642c();
    }

    /* renamed from: dt.d$b */
    public enum C7518b {
        SUCCESS,
        NO_NEED_UPDATE,
        REQUEST_ERROR
    }

    /* renamed from: dt.d$c */
    public enum C7519c {
        SUCCESS,
        DOWNLOAD_ERROR,
        INSERT_DB_ERROR
    }

    /* renamed from: Za */
    void mo8638Za();

    /* renamed from: v8 */
    void mo8639v8(String str, String str2, C7517a aVar);
}
