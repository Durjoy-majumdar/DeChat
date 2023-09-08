package kotlinx.coroutines.android;

import a14.C53915k2;
import android.os.Looper;
import b14.C54392a;
import b14.C54394c;
import f14.C58899q;
import gy3.C8480h;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, mo182094d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "Lf14/q;", "", "allFactories", "La14/k2;", "createDispatcher", "", "hintOnError", "", "getLoadPriority", "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-android"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class AndroidDispatcherFactory implements C58899q {
    public C53915k2 createDispatcher(List<? extends C58899q> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C54392a(C54394c.m61090a(mainLooper, true), (String) null, 2, (C8480h) null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
