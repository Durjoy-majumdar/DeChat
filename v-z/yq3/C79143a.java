package yq3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nj3.C76912y0;
import yq3.C79148e;

/* renamed from: yq3.a */
public class C79143a {

    /* renamed from: a */
    public static Map<String, Class<?>> f232416a = new ConcurrentHashMap();

    /* renamed from: b */
    public static SparseArray<C79148e> f232417b = new SparseArray<>();

    /* renamed from: a */
    public static void m95762a(Activity activity) {
        C79148e g = m95768g(activity);
        Object[] objArr = new Object[2];
        objArr[0] = activity;
        objArr[1] = g == null ? "" : g.mo91258e();
        Log.m105925i("MicroMsg.ProcessManager", "backProcess to1 context: %s procname %s", objArr);
        if (g != null) {
            g.mo91257c(activity, 0);
        }
    }

    /* renamed from: b */
    public static void m95763b(Activity activity, int i) {
        if (activity == null) {
            Log.m105928w("MicroMsg.ProcessManager", "hy: back context is null");
        }
        C79148e g = m95768g(activity);
        Object[] objArr = new Object[3];
        objArr[0] = activity;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = g == null ? "" : g.mo91258e();
        Log.m105925i("MicroMsg.ProcessManager", "backProcess to1 context: %s errCode %s procname %s ", objArr);
        if (g != null) {
            g.mo91257c(activity, i);
        } else if (!activity.isFinishing()) {
            activity.finish();
        }
    }

    /* renamed from: c */
    public static void m95764c(Activity activity, Bundle bundle, int i) {
        Log.m105924i("MicroMsg.ProcessManager", "endProcess with errCode : " + i);
        if (activity == null) {
            Log.m105928w("MicroMsg.ProcessManager", "hy: end context is null");
        }
        C79148e g = m95768g(activity);
        Object[] objArr = new Object[3];
        objArr[0] = activity;
        String str = "";
        objArr[1] = bundle == null ? str : bundle.toString();
        if (g != null) {
            str = g.mo91258e();
        }
        objArr[2] = str;
        Log.m105925i("MicroMsg.ProcessManager", "endProcess to1 context: %s bundle: %s procName %s", objArr);
        if (g != null) {
            g.mo91259f(activity, bundle);
        } else if (!activity.isFinishing()) {
            activity.finish();
        }
    }

    /* renamed from: d */
    public static void m95765d(Activity activity, Bundle bundle) {
        C79148e g = m95768g(activity);
        Object[] objArr = new Object[3];
        objArr[0] = activity;
        String str = "";
        objArr[1] = bundle == null ? str : bundle.toString();
        if (g != null) {
            str = g.mo91258e();
        }
        objArr[2] = str;
        Log.m105925i("MicroMsg.ProcessManager", "forwardProcess to1 context: %s bundle: %s procName %s", objArr);
        if (g != null) {
            g.mo91264o(activity, 0, bundle);
        }
    }

    /* renamed from: e */
    public static Bundle m95766e(Activity activity) {
        C79148e g = m95768g(activity);
        return g != null ? g.f232423c : new Bundle();
    }

    /* renamed from: f */
    public static List<C79148e> m95767f(String str) {
        ArrayList arrayList = new ArrayList();
        int size = f232417b.size();
        for (int i = 0; i < size; i++) {
            C79148e valueAt = f232417b.valueAt(i);
            if (str.equals(valueAt.mo91258e())) {
                arrayList.add(valueAt);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static C79148e m95768g(Activity activity) {
        if (activity == null) {
            Log.m105928w("MicroMsg.ProcessManager", "hy: ac is null");
            return null;
        } else if (activity.getIntent() != null) {
            return f232417b.get(activity.getIntent().getIntExtra("process_id", 0));
        } else {
            Log.m105928w("MicroMsg.ProcessManager", "hy: get intent is null");
            return null;
        }
    }

    /* renamed from: h */
    public static void m95769h(String str, Class<?> cls) {
        if (!((ConcurrentHashMap) f232416a).containsKey(str)) {
            ((ConcurrentHashMap) f232416a).put(str, cls);
            return;
        }
        throw new IllegalArgumentException("register process fail, exist process=" + str);
    }

    /* renamed from: i */
    public static void m95770i(int i) {
        f232417b.remove(i);
    }

    /* renamed from: j */
    public static void m95771j(Activity activity, Class<?> cls, Bundle bundle, C79148e.C79149a aVar) {
        Object[] objArr = new Object[3];
        objArr[0] = activity;
        objArr[1] = cls.getSimpleName();
        objArr[2] = bundle == null ? "" : bundle.toString();
        Log.m105925i("MicroMsg.ProcessManager", "startProcess to1 context:%s proc name: %s bundle %s", objArr);
        try {
            if ((activity instanceof WalletBaseUI) && aVar != null) {
                ((WalletBaseUI) activity).keepProcessEnd(aVar);
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (bundle.getLong("key_SessionId", 0) == 0) {
                bundle.putLong("key_SessionId", System.currentTimeMillis());
            }
            C79148e eVar = (C79148e) cls.newInstance();
            eVar.f232423c.putAll(bundle);
            eVar.f232421a = new WeakReference<>(aVar);
            eVar.f232422b = new WeakReference<>(activity);
            eVar.mo91260A(activity, bundle);
            f232417b.put(cls.hashCode(), eVar);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ProcessManager", e, "", new Object[0]);
        }
    }

    /* renamed from: k */
    public static void m95772k(Activity activity, String str, String str2, Bundle bundle, C79148e.C79149a aVar) {
        try {
            Object[] objArr = new Object[3];
            objArr[0] = activity;
            objArr[1] = str2;
            objArr[2] = bundle == null ? "" : bundle.toString();
            Log.m105925i("MicroMsg.ProcessManager", "startProcess to2 context:%s proc name: %s bundle %s", objArr);
            Class cls = (Class) ((ConcurrentHashMap) f232416a).get(str2);
            if (cls == null) {
                String format = String.format("start process=%s fail, process not register or plugin no import", new Object[]{str2});
                Log.m105920e("MicroMsg.ProcessManager", format);
                C76912y0.makeText((Context) activity, (CharSequence) format, 1).show();
                return;
            }
            m95771j(activity, cls, bundle, aVar);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.ProcessManager", "plugin load failed : " + e.toString());
            Log.printErrStackTrace("MicroMsg.ProcessManager", e, "", new Object[0]);
        }
    }
}
