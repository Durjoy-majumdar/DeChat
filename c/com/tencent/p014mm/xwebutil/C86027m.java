package com.tencent.p014mm.xwebutil;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.MainProcessIPCService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.ISharedPreferenceProvider;
import com.tencent.xweb.LibraryLoader;
import com.tencent.xweb.WebViewReporterInterface;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.util.IXWebLogClient;
import com.tencent.xweb.util.WebViewExtensionListener;
import f40.C86709a0;
import hi3.C87520e;
import ii3.C87740c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p206nj.C88957l;

/* renamed from: com.tencent.mm.xwebutil.m */
public class C86027m {

    /* renamed from: a */
    public static IXWebLogClient f250515a = new C30876a();

    /* renamed from: b */
    public static WebViewReporterInterface f250516b = new C86028b();

    /* renamed from: c */
    public static WebViewExtensionListener f250517c = new C86029c();

    /* renamed from: d */
    public static ISharedPreferenceProvider f250518d = new C86030d();

    /* renamed from: e */
    public static LibraryLoader.ILibraryLoader f250519e = new C86031e();

    /* renamed from: com.tencent.mm.xwebutil.m$f */
    public static final class C7098f implements C80916r<IPCString, Bundle> {
        private C7098f() {
        }

        public Object invoke(Object obj) {
            IPCString iPCString = (IPCString) obj;
            Bundle bundle = new Bundle();
            try {
                ArrayList arrayList = new ArrayList();
                int w3 = !Util.isNullOrNil(iPCString.f10315d) ? C86709a0.m107529k().f251779b.f256809d.mo55493w3(iPCString.f10315d, arrayList) : 0;
                bundle.putStringArrayList("ipList", arrayList);
                bundle.putInt("result", w3);
                Log.m105924i("XWeb.MM.GetHostByNameTask", "GetHostByNameTask, result:" + w3 + ", ipList:" + arrayList);
            } catch (Exception e) {
                Log.printErrStackTrace("XWeb.MM.GetHostByNameTask", e, "GetHostByNameTask error", new Object[0]);
            }
            return bundle;
        }
    }

    /* renamed from: com.tencent.mm.xwebutil.m$a */
    public class C30876a implements IXWebLogClient {
        /* renamed from: d */
        public void mo31419d(String str, String str2) {
            Log.m105918d(str, str2);
        }

        /* renamed from: e */
        public void mo31420e(String str, String str2) {
            Log.m105920e(str, str2);
        }

        /* renamed from: i */
        public void mo31422i(String str, String str2) {
            Log.m105924i(str, str2);
        }

        /* renamed from: v */
        public void mo31423v(String str, String str2) {
            Log.m105926v(str, str2);
        }

        /* renamed from: w */
        public void mo31424w(String str, String str2) {
            Log.m105928w(str, str2);
        }

        /* renamed from: e */
        public void mo31421e(String str, String str2, Throwable th) {
            Log.printErrStackTrace(str, th, str2, new Object[0]);
        }
    }

    /* renamed from: com.tencent.mm.xwebutil.m$b */
    public class C86028b extends WebViewReporterInterface {
        public void idkeyForPair(int i, int i2, int i3, int i4, int i5, int i6) {
            StringBuilder sb = new StringBuilder();
            sb.append("callback: idkeyForPair:");
            int i7 = i;
            sb.append(i);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(i5);
            sb.append(", ");
            sb.append(i2);
            sb.append(", ");
            sb.append(i4);
            sb.append(", ");
            int i8 = i6;
            sb.append(i8);
            Log.m105926v("XWeb.MM.WebViewReporterInterface", sb.toString());
            C115669n nVar = C115669n.INSTANCE;
            int i9 = i;
            nVar.mo160130g(i9, i2, i3, i4, i5, i8, true);
        }

        public void idkeyStat(long j, long j2, long j3) {
            StringBuilder sb = new StringBuilder();
            sb.append("callback: idkeyStat:");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(", ");
            long j4 = j3;
            sb.append(j4);
            Log.m105926v("XWeb.MM.WebViewReporterInterface", sb.toString());
            C115669n.INSTANCE.idkeyStat(j, j2, j4, true);
        }

        public void kvStat(int i, String str) {
            Log.m105926v("XWeb.MM.WebViewReporterInterface", "callback: kvStat:" + i + ", " + str);
            C115669n.INSTANCE.kvStat(i, str);
        }
    }

    /* renamed from: com.tencent.mm.xwebutil.m$c */
    public class C86029c extends WebViewExtensionListener {
        public Object onMiscCallBack(String str, Object... objArr) {
            boolean z = true;
            if (ConstValue.EXTENSION_ADD_FILTER_RESOURCES.equals(str)) {
                Log.m105924i("XWeb.MM.WebViewExtensionListener", "onMiscCallBack, AddFilterResources");
                Resources resources = objArr[0];
                Map map = objArr[1];
                C87520e.C87523c cVar = C87520e.f253545a;
                C87740c.m109160c("MicroMsg.SVGResourceLoader", "addFilterResources:" + resources, new Object[0]);
                Iterator it = ((HashMap) C87520e.f253557m).keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((WeakReference) it.next()).get() == resources) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    ((HashMap) C87520e.f253557m).put(new WeakReference(resources), map);
                }
                return Boolean.TRUE;
            } else if (!ConstValue.EXTENSION_GET_HOST_NAME.equals(str)) {
                return null;
            } else {
                String str2 = objArr[0];
                List list = objArr[1];
                Log.m105924i("XWeb.MM.WebViewExtensionListener", "onMiscCallBack, getHostByName, hostName:" + str2);
                Bundle bundle = (Bundle) XIPCInvoker.m98749b(MainProcessIPCService.f108404e, new IPCString(str2), C7098f.class);
                if (list == null || bundle == null) {
                    return 0;
                }
                list.clear();
                ArrayList<String> stringArrayList = bundle.getStringArrayList("ipList");
                int i = bundle.getInt("result");
                list.addAll(stringArrayList);
                return Integer.valueOf(i);
            }
        }
    }

    /* renamed from: com.tencent.mm.xwebutil.m$d */
    public class C86030d implements ISharedPreferenceProvider {
        public SharedPreferences getSharedPreference(Context context, String str, int i, boolean z) {
            MultiProcessMMKV multiProcessMMKV;
            if (z) {
                multiProcessMMKV = MultiProcessMMKV.getMMKVWithTransportByName(str);
            } else {
                multiProcessMMKV = MultiProcessMMKV.getMMKV(str, i == 4 ? 2 : 1);
            }
            if (multiProcessMMKV == null) {
                return null;
            }
            return new XWebMMkvWrapper(multiProcessMMKV);
        }
    }

    /* renamed from: com.tencent.mm.xwebutil.m$e */
    public class C86031e implements LibraryLoader.ILibraryLoader {
        public String findLibrary(Context context, String str) {
            return C88957l.m111071g(str);
        }

        public void loadLibrary(String str) {
            C88957l.m111078n(str);
        }
    }
}
