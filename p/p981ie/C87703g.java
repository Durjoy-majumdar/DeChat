package p981ie;

import android.bluetooth.le.ScanSettings;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import p723vf.C118672d;
import p981ie.C87699e;

/* renamed from: ie.g */
public class C87703g implements InvocationHandler {

    /* renamed from: a */
    public final /* synthetic */ Object f253978a;

    public C87703g(Object obj) {
        this.f253978a = obj;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        ScanSettings scanSettings;
        ScanSettings scanSettings2;
        if ("registerScanner".equals(method.getName())) {
            Iterator it = ((ArrayList) C87699e.f253974a).iterator();
            while (it.hasNext()) {
                ((C87699e.C87701b) it.next()).mo111823c();
            }
        } else if ("startScan".equals(method.getName())) {
            int i = -1;
            if (objArr.length > 0) {
                Integer num = objArr[0];
                if (num instanceof Integer) {
                    i = num.intValue();
                }
                scanSettings2 = null;
                for (ScanSettings scanSettings3 : objArr) {
                    if (scanSettings3 instanceof ScanSettings) {
                        scanSettings2 = scanSettings3;
                    }
                }
            } else {
                scanSettings2 = null;
            }
            Iterator it4 = ((ArrayList) C87699e.f253974a).iterator();
            while (it4.hasNext()) {
                ((C87699e.C87701b) it4.next()).mo111822b(i, scanSettings2);
            }
        } else if ("startScanForIntent".equals(method.getName())) {
            if (objArr != null) {
                scanSettings = null;
                for (ScanSettings scanSettings4 : objArr) {
                    if (scanSettings4 instanceof ScanSettings) {
                        scanSettings = scanSettings4;
                    }
                }
            } else {
                scanSettings = null;
            }
            Iterator it5 = ((ArrayList) C87699e.f253974a).iterator();
            while (it5.hasNext()) {
                ((C87699e.C87701b) it5.next()).mo111821a(scanSettings);
            }
        }
        try {
            return C87699e.m109115a(this.f253978a, method, objArr);
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.battery.BluetoothHooker", th, "invokeBluetoothGatt fail", new Object[0]);
            return null;
        }
    }
}
