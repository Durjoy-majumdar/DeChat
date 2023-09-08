package com.tencent.p014mm.booter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.tencent.p014mm.app.C80595i;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import f40.C75681p0;
import kj2.C117407d;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.booter.b */
public final class C80811b {
    /* renamed from: a */
    public static boolean m98664a(Context context, String str, boolean z) {
        boolean z2;
        boolean z3;
        Context context2 = context;
        String str2 = str;
        if ((!str2.equals("noop") || (ChannelUtil.shouldShowGprsAlert && ChannelUtil.isShowingGprsAlert)) && C75681p0.m90936c(context)) {
            Log.m105924i("MicroMsg.CoreServiceHelper", "fully exited, no need to start service");
            return false;
        }
        Log.m105925i("MicroMsg.CoreServiceHelper", "ensure service running, type=%s ifRepeat=%s", str2, Boolean.valueOf(z));
        Intent intent = new Intent(context2, CoreService.class);
        intent.setFlags(268435456);
        intent.putExtra("START_TYPE", str2);
        if (C28862c.m38402c()) {
            Log.m105924i("MicroMsg.CoreServiceHelper", "ensureServiceInstance() bindService");
            MMApplicationContext.getContext().bindService(intent, new C80595i(), 1);
        } else {
            Log.m105924i("MicroMsg.CoreServiceHelper", "ensureServiceInstance() startService");
            try {
                context2.startService(intent);
                z3 = false;
                z2 = false;
            } catch (Exception e) {
                Exception exc = e;
                Log.m105921e("MicroMsg.CoreServiceHelper", "ensureServiceInstance() Exception = %s, Detail = %s SDK_INT = %s", exc.getClass().toString(), exc.getMessage(), Integer.valueOf(Build.VERSION.SDK_INT));
                z3 = exc instanceof IllegalStateException;
                if (C11171e.m11046c(26)) {
                    MultiProcessMMKV a = C28862c.m38400a();
                    boolean b = C28862c.m38401b(context);
                    if (a.getBoolean("service_first_crash", true)) {
                        Log.m105925i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService service_first_crash=true result=%s", Boolean.valueOf(b));
                        a.edit().putBoolean("service_first_crash", false).commit();
                        C117407d dVar = C117407d.INSTANCE;
                        dVar.idkeyStat(954, 80, 1, false);
                        if (z3) {
                            C28862c.m38405f(false);
                            a.edit().putBoolean("service_IllegalStateException", true).commit();
                            dVar.idkeyStat(954, 81, 1, false);
                            if (b) {
                                dVar.idkeyStat(954, 82, 1, false);
                            } else {
                                a.edit().putBoolean("crash_not_ignore", true).commit();
                                dVar.idkeyStat(954, 83, 1, false);
                            }
                        } else {
                            dVar.idkeyStat(954, 86, 1, false);
                        }
                    } else {
                        Log.m105925i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService service_first_crash=false result=%s", Boolean.valueOf(b));
                        if (z3) {
                            C28862c.m38405f(false);
                            if (!a.getBoolean("service_IllegalStateException", false)) {
                                Log.m105924i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService service_first_crash=false service_IllegalStateException=false");
                                a.edit().putBoolean("service_IllegalStateException", true).commit();
                                C117407d dVar2 = C117407d.INSTANCE;
                                dVar2.idkeyStat(954, 87, 1, false);
                                if (b) {
                                    dVar2.idkeyStat(954, 82, 1, false);
                                } else {
                                    a.edit().putBoolean("crash_not_ignore", true).commit();
                                    dVar2.idkeyStat(954, 83, 1, false);
                                }
                            } else {
                                Log.m105924i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService service_first_crash=false service_IllegalStateException=true");
                            }
                        }
                    }
                }
                z2 = true;
            }
            if (C11171e.m11046c(26)) {
                if (C11171e.m11046c(26)) {
                    Log.m105925i("MicroMsg.CoreServiceUtil", "ensureServiceInstance() startService crash_not_ignore=%s service_IllegalStateException=%s", Boolean.valueOf(C28862c.m38400a().getBoolean("crash_not_ignore", false)), Boolean.valueOf(C28862c.m38401b(context)));
                    if (C28862c.m38400a().getBoolean("crash_not_ignore", false) && C28862c.m38401b(context) && !z2) {
                        C28862c.m38400a().edit().putBoolean("crash_not_ignore", false);
                        C117407d.INSTANCE.idkeyStat(954, 85, 1, false);
                    }
                }
                if (z3) {
                    if (z) {
                        return m98664a(context2, str2, false);
                    }
                    return false;
                }
            }
        }
        Log.m105925i("MicroMsg.CoreServiceUtil", "if_26_num=%s  if_ignore_false=%s  ignore_true=%s", Boolean.valueOf(C28862c.m38400a().getBoolean("if_26_num", true)), Boolean.valueOf(C28862c.m38400a().getBoolean("if_ignore_false", true)), Boolean.valueOf(C28862c.m38400a().getBoolean("ignore_true", false)));
        if (C11171e.m11046c(26) && C28862c.m38400a().getBoolean("if_26_num", true)) {
            C28862c.m38400a().edit().putBoolean("if_26_num", false).commit();
            C117407d.INSTANCE.idkeyStat(954, 92, 1, false);
        }
        if (C11171e.m11046c(26)) {
            if (C28862c.m38401b(context)) {
                C28862c.m38400a().edit().putBoolean("ignore_true", true).commit();
            } else if (C28862c.m38400a().getBoolean("if_ignore_false", true)) {
                C28862c.m38400a().edit().putBoolean("if_ignore_false", false).commit();
                C117407d dVar3 = C117407d.INSTANCE;
                dVar3.idkeyStat(954, 90, 1, false);
                if (C28862c.m38400a().getBoolean("ignore_true", false)) {
                    dVar3.idkeyStat(954, 91, 1, false);
                }
            }
        }
        return true;
    }
}
