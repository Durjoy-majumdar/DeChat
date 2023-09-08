package p935cb;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import java.io.InputStream;

/* renamed from: cb.k */
public interface C79986k {

    /* renamed from: cb.k$a */
    public interface C79987a {
        void setJavaScriptEnabled(boolean z);
    }

    /* renamed from: cb.k$b */
    public static abstract class C79988b {

        /* renamed from: cb.k$b$a */
        public class C79989a {

            /* renamed from: a */
            public String f234278a;

            /* renamed from: b */
            public InputStream f234279b;

            public C79989a(C79988b bVar, String str, String str2, InputStream inputStream) {
                this.f234278a = str;
                this.f234279b = inputStream;
            }
        }

        /* renamed from: a */
        public abstract void mo110147a();

        /* renamed from: b */
        public C79989a mo110170b(String str) {
            InputStream openRead = ((C79970b) this).f234241a.f234248b.mo114272k().openRead(str);
            if (openRead == null) {
                return null;
            }
            return new C79989a(this, MimeTypeUtil.getMimeTypeByFilePath(str), "UTF-8", openRead);
        }
    }

    /* renamed from: a */
    void mo110152a(String str);

    /* renamed from: b */
    C79987a mo110153b();

    /* renamed from: c */
    void mo110154c(Context context);

    /* renamed from: d */
    void mo110155d(float f);

    void destroy();

    /* renamed from: e */
    void mo110157e(C79988b bVar);

    View getView();

    void loadUrl(String str);

    void requestLayout();

    void setVisibility(int i);
}
