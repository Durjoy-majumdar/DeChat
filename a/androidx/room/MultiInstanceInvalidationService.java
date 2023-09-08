package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import java.util.HashMap;
import p1223z3.C119031d;
import p1223z3.C119032e;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: d */
    public int f338308d = 0;

    /* renamed from: e */
    public final HashMap<Integer, String> f338309e = new HashMap<>();

    /* renamed from: f */
    public final RemoteCallbackList<C119031d> f338310f = new C113024a();

    /* renamed from: g */
    public final C119032e f338311g = new C113025b();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    public class C113024a extends RemoteCallbackList<C119031d> {
        public C113024a() {
        }

        public void onCallbackDied(IInterface iInterface, Object obj) {
            C119031d dVar = (C119031d) iInterface;
            MultiInstanceInvalidationService.this.f338309e.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    public class C113025b extends C119032e {
        public C113025b() {
        }

        /* renamed from: a */
        public void mo165386a(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f338310f) {
                String str = MultiInstanceInvalidationService.this.f338309e.get(Integer.valueOf(i));
                if (str != null) {
                    int beginBroadcast = MultiInstanceInvalidationService.this.f338310f.beginBroadcast();
                    int i2 = 0;
                    while (i2 < beginBroadcast) {
                        try {
                            int intValue = ((Integer) MultiInstanceInvalidationService.this.f338310f.getBroadcastCookie(i2)).intValue();
                            String str2 = MultiInstanceInvalidationService.this.f338309e.get(Integer.valueOf(intValue));
                            if (i != intValue && str.equals(str2)) {
                                try {
                                    MultiInstanceInvalidationService.this.f338310f.getBroadcastItem(i2).mo183690UP(strArr);
                                } catch (RemoteException unused) {
                                }
                            }
                            i2++;
                        } catch (Throwable th) {
                            MultiInstanceInvalidationService.this.f338310f.finishBroadcast();
                            throw th;
                        }
                    }
                    MultiInstanceInvalidationService.this.f338310f.finishBroadcast();
                }
            }
        }

        /* renamed from: c */
        public int mo165387c(C119031d dVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f338310f) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f338308d + 1;
                multiInstanceInvalidationService.f338308d = i;
                if (multiInstanceInvalidationService.f338310f.register(dVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f338309e.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f338308d--;
                return 0;
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f338311g;
    }
}
