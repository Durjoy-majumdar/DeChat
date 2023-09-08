package p286zl;

import android.app.Activity;
import android.content.Intent;
import di3.C7335d;

/* renamed from: zl.k */
public interface C16293k extends C7335d {

    /* renamed from: zl.k$a */
    public interface C16294a {
        void onActivityResult(int i, int i2, Intent intent);

        void onCancel();
    }

    /* renamed from: zl.k$b */
    public static class C16295b {

        /* renamed from: a */
        public String f43593a;

        /* renamed from: b */
        public String f43594b;

        /* renamed from: c */
        public String f43595c;

        public C16295b(String str, String str2, int i, String str3, boolean z, String str4, boolean z2) {
            this.f43593a = str;
            this.f43594b = str2;
            this.f43595c = str4;
        }
    }

    /* renamed from: XV */
    void mo14653XV(Activity activity, C16294a aVar);

    /* renamed from: YI */
    void mo14654YI();

    /* renamed from: ZE */
    void mo14655ZE(Activity activity, C16294a aVar);

    /* renamed from: pW */
    C16295b mo14656pW();
}
