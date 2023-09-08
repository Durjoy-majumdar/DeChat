package p1202o3;

import android.os.Bundle;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C0125s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p860p3.C117911b;

/* renamed from: o3.a */
public abstract class C117643a {

    /* renamed from: o3.a$a */
    public interface C117644a<D> {
        C117911b<D> onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(C117911b<D> bVar, D d);

        void onLoaderReset(C117911b<D> bVar);
    }

    /* renamed from: b */
    public static <T extends C0125s & C0123n0> C117643a m165934b(T t) {
        return new C117645b(t, ((C0123n0) t).getViewModelStore());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo182366a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
