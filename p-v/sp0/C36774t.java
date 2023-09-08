package sp0;

import android.net.Network;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.io.FileDescriptor;
import java.lang.reflect.Field;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: sp0.t */
public final class C36774t implements C13763x {

    /* renamed from: a */
    public static final C36774t f97662a = new C36774t();

    /* renamed from: b */
    public static final C13601g f97663b = C36568h.m40985a(C36775a.f97664d);

    /* renamed from: sp0.t$a */
    public static final class C36775a extends C87413o implements C32224a<Field> {

        /* renamed from: d */
        public static final C36775a f97664d = new C36775a();

        public C36775a() {
            super(0);
        }

        public Object invoke() {
            try {
                Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.BindSocketToNetworkApi23Ability", "reflect descriptorField fail since " + e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public boolean mo13124a(int i, Network network) {
        FileDescriptor fileDescriptor;
        C87412m.m108594g(network, "network");
        Field field = (Field) ((C36570n) f97663b).getValue();
        if (field == null) {
            return false;
        }
        try {
            fileDescriptor = new FileDescriptor();
            field.setInt(fileDescriptor, i);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.BindSocketToNetworkApi23Ability", "set descriptorField fail since " + e);
            fileDescriptor = null;
        }
        if (fileDescriptor == null) {
            return false;
        }
        try {
            network.bindSocket(fileDescriptor);
            return true;
        } catch (Exception e2) {
            Log.m105920e("MicroMsg.BindSocketToNetworkApi23Ability", "bindSocket fail since " + e2);
            return false;
        }
    }
}
