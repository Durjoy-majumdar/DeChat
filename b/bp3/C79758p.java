package bp3;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.app.C80622u0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kf3.C61081c;
import z04.C112550d0;
import zt3.C119157j;

/* renamed from: bp3.p */
public final class C79758p {

    /* renamed from: a */
    public static final C79758p f233760a = new C79758p();

    /* renamed from: b */
    public static final HashMap<String, Object> f233761b = new HashMap<>();

    /* renamed from: c */
    public static MultiProcessMMKV f233762c;

    /* renamed from: d */
    public static AtomicBoolean f233763d = new AtomicBoolean(false);

    /* renamed from: e */
    public static ConcurrentLinkedDeque<WeakReference<C79756n>> f233764e = new ConcurrentLinkedDeque<>();

    /* renamed from: bp3.p$a */
    public static final class C79759a implements Runnable {

        /* renamed from: d */
        public static final C79759a f233765d = new C79759a();

        public final void run() {
            C79758p pVar = C79758p.f233760a;
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("Repairer");
            C79758p.f233762c = mmkv;
            int i = 0;
            if (mmkv != null) {
                i = mmkv.decodeInt("RepairerConfig_Inner_Version_Int", 0);
            }
            if (i != 1) {
                MultiProcessMMKV multiProcessMMKV = C79758p.f233762c;
                if (multiProcessMMKV != null) {
                    multiProcessMMKV.clearMemoryCache();
                }
                MultiProcessMMKV multiProcessMMKV2 = C79758p.f233762c;
                if (multiProcessMMKV2 != null) {
                    multiProcessMMKV2.clearAll();
                }
                Log.m105924i("MicroMsg.RepairerLogic", "diff version, clear all currentVersion:" + i + " currentVersion:1");
            } else {
                Log.m105924i("MicroMsg.RepairerLogic", "same version, currentVersion:1");
            }
            MultiProcessMMKV multiProcessMMKV3 = C79758p.f233762c;
            if (multiProcessMMKV3 != null) {
                multiProcessMMKV3.encode("RepairerConfig_Inner_Version_Int", 1);
            }
            C79758p.f233763d.set(true);
            for (WeakReference weakReference : C79758p.f233764e) {
                C79756n nVar = (C79756n) weakReference.get();
                if (nVar != null) {
                    nVar.mo109877a();
                }
            }
            C79758p.f233764e.clear();
        }
    }

    static {
        boolean z = false;
        if (C80622u0.m98265a(MMApplicationContext.getContext()).f235889g == C80622u0.C80623a.ISOLATED) {
            z = true;
        }
        if (!z) {
            ((C119157j) C119157j.f356862d).mo183876g(C79759a.f233765d, "RepairerConfigThread");
        }
    }

    /* renamed from: a */
    public final Object mo109878a(C104160f fVar, Object obj) {
        C87412m.m108594g(fVar, "key");
        C87412m.m108594g(obj, "defaultValue");
        return mo109879b(fVar.name(), obj);
    }

    /* renamed from: b */
    public final Object mo109879b(String str, Object obj) {
        MultiProcessMMKV multiProcessMMKV;
        MultiProcessMMKV multiProcessMMKV2;
        MultiProcessMMKV multiProcessMMKV3;
        C87412m.m108594g(str, "key");
        C87412m.m108594g(obj, "defaultValue");
        HashMap<String, Object> hashMap = f233761b;
        if (hashMap.containsKey(str)) {
            Object obj2 = hashMap.get(str);
            return obj2 == null ? obj : obj2;
        }
        MultiProcessMMKV multiProcessMMKV4 = f233762c;
        boolean z = false;
        if (multiProcessMMKV4 != null && multiProcessMMKV4.containsKey(str)) {
            z = true;
        }
        if (z) {
            List U = C112550d0.m153785U(str, new String[]{"_"}, false, 0, 6, (Object) null);
            String str2 = (String) U.get(U.size() - 1);
            switch (str2.hashCode()) {
                case -1808118735:
                    if (str2.equals("String")) {
                        MultiProcessMMKV multiProcessMMKV5 = f233762c;
                        String decodeString = multiProcessMMKV5 != null ? multiProcessMMKV5.decodeString(str, (String) obj) : null;
                        if (decodeString != null) {
                            obj = decodeString;
                            break;
                        }
                    }
                    break;
                case 73679:
                    if (str2.equals("Int") && (multiProcessMMKV = f233762c) != null) {
                        obj = Integer.valueOf(multiProcessMMKV.decodeInt(str, ((Integer) obj).intValue()));
                        break;
                    }
                case 2374300:
                    if (str2.equals("Long") && (multiProcessMMKV2 = f233762c) != null) {
                        obj = Long.valueOf(multiProcessMMKV2.decodeLong(str, ((Long) obj).longValue()));
                        break;
                    }
                case 67973692:
                    if (str2.equals("Float") && (multiProcessMMKV3 = f233762c) != null) {
                        obj = Float.valueOf(multiProcessMMKV3.decodeFloat(str, ((Float) obj).floatValue()));
                        break;
                    }
            }
            hashMap.put(str, obj);
        }
        return obj;
    }

    /* renamed from: c */
    public final Object mo109880c(C61081c cVar) {
        C87412m.m108594g(cVar, "keyObj");
        return mo109879b(cVar.mo86004j(), cVar.mo54534g());
    }

    /* renamed from: d */
    public final float mo109881d(C104160f fVar, float f) {
        C87412m.m108594g(fVar, "key");
        Object a = mo109878a(fVar, Float.valueOf(f));
        C87412m.m108592e(a, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) a).floatValue();
    }

    /* renamed from: e */
    public final int mo109882e(C104160f fVar, int i) {
        C87412m.m108594g(fVar, "key");
        Object a = mo109878a(fVar, Integer.valueOf(i));
        C87412m.m108592e(a, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) a).intValue();
    }

    /* renamed from: f */
    public final int mo109883f(C61081c cVar) {
        C87412m.m108594g(cVar, "keyObj");
        Object b = mo109879b(cVar.mo86004j(), cVar.mo54534g());
        C87412m.m108592e(b, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) b).intValue();
    }

    /* renamed from: g */
    public final String mo109884g(C104160f fVar, String str) {
        C87412m.m108594g(fVar, "key");
        C87412m.m108594g(str, "defaultValue");
        Object a = mo109878a(fVar, str);
        C87412m.m108592e(a, "null cannot be cast to non-null type kotlin.String");
        return (String) a;
    }

    /* renamed from: h */
    public final String mo109885h(C61081c cVar) {
        C87412m.m108594g(cVar, "keyObj");
        Object b = mo109879b(cVar.mo86004j(), cVar.mo54534g());
        C87412m.m108592e(b, "null cannot be cast to non-null type kotlin.String");
        return (String) b;
    }

    /* renamed from: i */
    public final void mo109886i(C79756n nVar) {
        C87412m.m108594g(nVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (!f233763d.get()) {
            f233764e.add(new WeakReference(nVar));
        }
    }

    /* renamed from: j */
    public final void mo109887j(C104160f fVar, Object obj) {
        C87412m.m108594g(fVar, "key");
        C87412m.m108594g(obj, "value");
        mo109888k(fVar.name(), obj);
    }

    /* renamed from: k */
    public final void mo109888k(String str, Object obj) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(obj, "value");
        List U = C112550d0.m153785U(str, new String[]{"_"}, false, 0, 6, (Object) null);
        String str2 = (String) U.get(U.size() - 1);
        switch (str2.hashCode()) {
            case -1808118735:
                if (str2.equals("String")) {
                    MultiProcessMMKV multiProcessMMKV = f233762c;
                    if (multiProcessMMKV != null) {
                        multiProcessMMKV.encode(str, (String) obj);
                    }
                    f233761b.put(str, obj);
                    return;
                }
                return;
            case 73679:
                if (str2.equals("Int")) {
                    MultiProcessMMKV multiProcessMMKV2 = f233762c;
                    if (multiProcessMMKV2 != null) {
                        multiProcessMMKV2.encode(str, ((Integer) obj).intValue());
                    }
                    f233761b.put(str, obj);
                    return;
                }
                return;
            case 2374300:
                if (str2.equals("Long")) {
                    MultiProcessMMKV multiProcessMMKV3 = f233762c;
                    if (multiProcessMMKV3 != null) {
                        multiProcessMMKV3.encode(str, ((Long) obj).longValue());
                    }
                    f233761b.put(str, obj);
                    return;
                }
                return;
            case 67973692:
                if (str2.equals("Float")) {
                    MultiProcessMMKV multiProcessMMKV4 = f233762c;
                    if (multiProcessMMKV4 != null) {
                        multiProcessMMKV4.encode(str, ((Float) obj).floatValue());
                    }
                    f233761b.put(str, obj);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
