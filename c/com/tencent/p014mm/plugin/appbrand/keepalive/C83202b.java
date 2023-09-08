package com.tencent.p014mm.plugin.appbrand.keepalive;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.keepalive.C83197a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import java.util.Set;
import java.util.regex.Pattern;
import li0.C88508b;
import li0.C88509c;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.appbrand.keepalive.b */
public enum C83202b {
    INSTANCE;
    

    /* renamed from: d */
    public final Set<AppBrandRuntime> f243009d;

    /* renamed from: com.tencent.mm.plugin.appbrand.keepalive.b$a */
    public class C83203a implements C88509c.C88512b {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntime f243010d;

        public C83203a(AppBrandRuntime appBrandRuntime) {
            this.f243010d = appBrandRuntime;
        }

        /* renamed from: b */
        public void mo113102b(String str, C88508b bVar) {
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    C83202b bVar2 = C83202b.this;
                    AppBrandRuntime appBrandRuntime = this.f243010d;
                    bVar2.getClass();
                    if (appBrandRuntime.f238113K.mo122983f() && C83231l.m102143d(appBrandRuntime.f238147j) != C83231l.C83235e.LAUNCH_MINI_PROGRAM && bVar2.f243009d.add(appBrandRuntime)) {
                        String processName = MMApplicationContext.getProcessName();
                        Log.m105925i("MicroMsg.AppBrandKeepAliveManager", "keepAlive processName:%s, rt:%s", processName, appBrandRuntime.f238147j);
                        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCString(processName), C83205c.class, (C1256g) null);
                        return;
                    }
                    return;
                } else if (!(ordinal == 2 || ordinal == 3)) {
                    return;
                }
            }
            C83202b bVar3 = C83202b.this;
            AppBrandRuntime appBrandRuntime2 = this.f243010d;
            if (bVar3.f243009d.remove(appBrandRuntime2)) {
                String processName2 = MMApplicationContext.getProcessName();
                Log.m105925i("MicroMsg.AppBrandKeepAliveManager", "stopKeepAlive processName:%s, rt:%s", processName2, appBrandRuntime2.f238147j);
                XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCString(processName2), C83206d.class, (C1256g) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.keepalive.b$b */
    public class C83204b implements C1256g<IPCVoid> {

        /* renamed from: d */
        public final /* synthetic */ Runnable f243012d;

        public C83204b(Runnable runnable) {
            this.f243012d = runnable;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            Runnable runnable = this.f243012d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.keepalive.b$c */
    public static final class C83205c implements C80883e<IPCString, IPCVoid> {
        private C83205c() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C83197a.C83198a aVar;
            boolean z;
            C83197a aVar2 = C83197a.f242999b;
            String iPCString = ((IPCString) obj).toString();
            aVar2.getClass();
            if (!TextUtils.isEmpty(iPCString)) {
                synchronized (aVar2.f243000a) {
                    aVar = aVar2.f243000a.get(iPCString);
                    if (aVar == null) {
                        aVar = new C83197a.C83198a(iPCString);
                        aVar2.f243000a.put(iPCString, aVar);
                    }
                }
                synchronized (aVar) {
                    aVar.f243002a++;
                    z = aVar.f243002a == 1;
                }
                if (z) {
                    Log.m105925i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s", aVar.f243003b);
                    String str = aVar.f243003b;
                    Class cls = null;
                    try {
                        if (TextUtils.isEmpty(str)) {
                            Log.m105925i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, null, Boolean.FALSE);
                        } else {
                            str = str.replaceFirst(Pattern.quote(MMApplicationContext.getApplicationId()), "");
                            Class cls2 = C83197a.C83198a.f243001d.get(str);
                            if (cls2 == null) {
                                Log.m105925i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, cls2, Boolean.FALSE);
                            } else {
                                try {
                                    Context context = MMApplicationContext.getContext();
                                    Intent intent = new Intent();
                                    intent.setClass(context, cls2);
                                    Log.m105925i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, cls2, Boolean.valueOf(context.bindService(intent, aVar.f243004c, 1)));
                                } catch (Exception e) {
                                    e = e;
                                    cls = cls2;
                                    try {
                                        Log.m105925i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, exception:%s", str, cls, e);
                                        Log.m105925i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, cls, Boolean.FALSE);
                                        gVar.mo894a(IPCVoid.f10316d);
                                    } catch (Throwable th) {
                                        th = th;
                                        cls2 = cls;
                                        Log.m105925i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, cls2, Boolean.FALSE);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    Log.m105925i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, cls2, Boolean.FALSE);
                                    throw th;
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        Log.m105925i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, exception:%s", str, cls, e);
                        Log.m105925i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "bindKeepAliveService, processName:%s, service:%s, bindRet:%b", str, cls, Boolean.FALSE);
                        gVar.mo894a(IPCVoid.f10316d);
                    }
                }
            }
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.keepalive.b$d */
    public static final class C83206d implements C80883e<IPCString, IPCVoid> {
        private C83206d() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C83197a.C83198a aVar;
            boolean z;
            C83197a aVar2 = C83197a.f242999b;
            String iPCString = ((IPCString) obj).toString();
            aVar2.getClass();
            if (!TextUtils.isEmpty(iPCString)) {
                synchronized (aVar2.f243000a) {
                    aVar = aVar2.f243000a.get(iPCString);
                }
                if (aVar == null) {
                    Log.m105929w("MicroMsg.AppBrandKeepAliveMMSavior", "unbindKeepAliveService not had connector of %s", iPCString);
                } else {
                    synchronized (aVar) {
                        aVar.f243002a--;
                        aVar.f243002a = Math.max(0, aVar.f243002a);
                        z = aVar.f243002a == 0;
                    }
                    if (z) {
                        Log.m105925i("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "unbindKeepAliveService, processName:%s", aVar.f243003b);
                        try {
                            MMApplicationContext.getContext().unbindService(aVar.f243004c);
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.AppBrandKeepAliveMMSavior.KeepAliveServiceConnector", "unbindKeepAliveService exp:%s", e);
                        }
                    }
                }
            }
            gVar.mo894a(IPCVoid.f10316d);
        }
    }

    /* renamed from: a */
    public static void m102118a(Runnable runnable) {
        String processName = MMApplicationContext.getProcessName();
        if (!TextUtils.isEmpty(processName)) {
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCString(processName), C83205c.class, new C83204b(runnable));
        }
    }

    /* renamed from: b */
    public void mo115447b(AppBrandRuntime appBrandRuntime) {
        appBrandRuntime.f238113K.mo122978a(new C83203a(appBrandRuntime));
        Log.m105925i("MicroMsg.AppBrandKeepAliveManager", "setUp process:%s", MMApplicationContext.getProcessName());
    }
}
