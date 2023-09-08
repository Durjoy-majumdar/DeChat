package com.tencent.p014mm.plugin.appbrand.keepalive;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80924w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.appbrand.keepalive.a */
public class C83197a {

    /* renamed from: b */
    public static final C83197a f242999b = new C83197a();

    /* renamed from: a */
    public final HashMap<String, C83198a> f243000a = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.keepalive.a$a */
    public static final class C83198a {

        /* renamed from: d */
        public static final HashMap<String, Class<? extends AppBrandKeepAliveService>> f243001d = new C83199a();

        /* renamed from: a */
        public volatile int f243002a = 0;

        /* renamed from: b */
        public final String f243003b;

        /* renamed from: c */
        public final ServiceConnection f243004c = new C83201c(this);

        /* renamed from: com.tencent.mm.plugin.appbrand.keepalive.a$a$a */
        public class C83199a extends HashMap<String, Class<? extends AppBrandKeepAliveService>> {
            public C83199a() {
                put(":appbrand0", AppBrandKeepAliveService.class);
                put(":appbrand1", AppBrandKeepAliveService1.class);
                put(":appbrand2", AppBrandKeepAliveService2.class);
                put(":appbrand3", AppBrandKeepAliveService3.class);
                put(":appbrand4", AppBrandKeepAliveService4.class);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.keepalive.a$a$b */
        public class C83200b implements C80924w {

            /* renamed from: a */
            public final /* synthetic */ String f243005a;

            public C83200b(String str) {
                this.f243005a = str;
            }

            /* renamed from: a */
            public void mo111377a() {
                Log.m105925i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "onProcessDied %s", this.f243005a);
                synchronized (C83198a.this) {
                    C83198a.this.f243002a = 0;
                }
                try {
                    MMApplicationContext.getContext().unbindService(C83198a.this.f243004c);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.keepalive.a$a$c */
        public class C83201c implements ServiceConnection {
            public C83201c(C83198a aVar) {
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            }

            public void onServiceDisconnected(ComponentName componentName) {
            }
        }

        public C83198a(String str) {
            this.f243003b = str;
            C80907o.m98778a(str, new C83200b(str));
        }
    }
}
