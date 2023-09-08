package wq3;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39623j;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.view.x2c.X2CMergeView;
import eb0.C31543z5;
import fg3.C107539a;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13598b0;
import sx3.C64175a0;
import te3.e85;
import te3.f85;
import wq3.C38272u;
import z04.C112551y;

/* renamed from: wq3.t */
public final class C111859t implements C91095g {

    /* renamed from: a */
    public static final C111859t f334895a = new C111859t();

    /* renamed from: b */
    public static final String f334896b = "MicroMsg.X2C.X2CLayoutCachePool";

    /* renamed from: c */
    public static final ConcurrentHashMap<String, C38271d> f334897c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static final X2CMergeView f334898d = new X2CMergeView(MMApplicationContext.getContext());

    /* renamed from: e */
    public static final Handler f334899e;

    /* renamed from: f */
    public static final HashMap<String, e85> f334900f = new HashMap<>();

    /* renamed from: g */
    public static MultiProcessMMKV f334901g;

    /* renamed from: wq3.t$a */
    public static final class C38269a implements C32224a<C13598b0> {

        /* renamed from: d */
        public final int f101042d;

        /* renamed from: e */
        public final String f101043e;

        public C38269a(String str, int i, String str2) {
            C87412m.m108594g(str, "taskId");
            C87412m.m108594g(str2, "activityName");
            this.f101042d = i;
            this.f101043e = str2;
        }

        public Object invoke() {
            Iterator<Map.Entry<String, C38271d>> it = C111859t.f334897c.entrySet().iterator();
            while (it.hasNext()) {
                if (C112551y.m153820t((String) it.next().getKey(), String.valueOf(this.f101042d), false, 2, (Object) null)) {
                    it.remove();
                }
            }
            C111855q.f334885a.getClass();
            C38263m mVar = C111855q.f334892h.get(this.f101043e);
            if (mVar != null) {
                new C38270c(mVar.f101032a).mo61581a();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wq3.t$c */
    public static final class C38270c implements C32224a<C13598b0> {

        /* renamed from: d */
        public final e85 f101044d;

        public C38270c(e85 e85) {
            C87412m.m108594g(e85, "preloadData");
            this.f101044d = e85;
        }

        /* renamed from: a */
        public void mo61581a() {
            try {
                byte[] byteArray = this.f101044d.toByteArray();
                e85 e85 = new e85();
                e85.parseFrom(byteArray);
                String str = e85.f182940d;
                if (str == null) {
                    str = "";
                }
                if (C111855q.f334885a.mo163608b().mo163574b().mo163580a(str)) {
                    HashMap<String, e85> hashMap = C111859t.f334900f;
                    e85 e852 = hashMap.get(str);
                    if (e852 == null) {
                        try {
                            MultiProcessMMKV f = C111859t.f334895a.mo163609f();
                            if (f != null) {
                                f.encode(str, byteArray);
                            }
                        } catch (Exception e) {
                            Log.printErrStackTrace(C111859t.f334896b, e, "UpdateLayoutStrategyTask1", new Object[0]);
                        }
                        hashMap.put(str, e85);
                        e852 = e85;
                    }
                    e85 e853 = e852;
                    if (!C87412m.m108589b(e853, e85)) {
                        boolean z = e853.f182941e.size() < e85.f182941e.size();
                        boolean a = C38272u.m41818a(e853, e85);
                        if (!z) {
                            if (!a) {
                                if (Log.isDebug()) {
                                    String str2 = C111859t.f334896b;
                                    Log.m105918d(str2, "update layout strategy by old " + C38272u.m41819b(e853) + " \n new" + C38272u.m41819b(e85));
                                }
                            }
                        }
                        C111859t.f334900f.put(str, e85);
                        try {
                            MultiProcessMMKV f2 = C111859t.f334895a.mo163609f();
                            if (f2 != null) {
                                f2.encode(str, byteArray);
                            }
                        } catch (Exception e2) {
                            Log.printErrStackTrace(C111859t.f334896b, e2, "UpdateLayoutStrategyTask2", new Object[0]);
                        }
                        if (Log.isDebug()) {
                            String str3 = C111859t.f334896b;
                            Log.m105919d(str3, "update layout strategy by new isNewDataSizeLarger:%s isNewDataHasNewLayout:%s: " + C38272u.m41819b(e85), Boolean.valueOf(z), Boolean.valueOf(a));
                        }
                    } else if (Log.isDebug()) {
                        String str4 = C111859t.f334896b;
                        Log.m105918d(str4, "first time save layout strategy " + C38272u.m41819b(e85));
                    }
                    String str5 = C111859t.f334896b;
                    Log.m105924i(str5, "update strategy " + str + ' ' + e85.f182941e.size());
                }
            } catch (Exception e3) {
                Log.printErrStackTrace(C111859t.f334896b, e3, "UpdateLayoutStrategyTask %s", this.f101044d.f182940d);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo61581a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wq3.t$d */
    public static final class C38271d {

        /* renamed from: a */
        public final List<C111861e> f101045a;

        public C38271d() {
            this((List) null, 1, (C8480h) null);
        }

        public C38271d(List<C111861e> list, int i, C8480h hVar) {
            if ((i & 1) != 0) {
                list = Collections.synchronizedList(new LinkedList());
                C87412m.m108593f(list, "synchronizedList(LinkedList())");
            }
            C87412m.m108594g(list, "cacheList");
            this.f101045a = list;
        }
    }

    /* renamed from: wq3.t$b */
    public static final class C111860b implements C32224a<C13598b0> {

        /* renamed from: d */
        public final String f334902d;

        /* renamed from: e */
        public final WeakReference<Context> f334903e;

        public C111860b(String str, WeakReference<Context> weakReference) {
            C87412m.m108594g(str, "taskId");
            C87412m.m108594g(weakReference, "contextRef");
            this.f334902d = str;
            this.f334903e = weakReference;
        }

        public Object invoke() {
            String str;
            C13598b0 b0Var;
            e85 e85;
            long j;
            Iterator<T> it;
            long j2;
            Context context;
            String str2;
            LayoutInflater layoutInflater;
            e85 e852;
            byte[] decodeBytes;
            C111855q.f334885a.getClass();
            if (C111855q.f334890f) {
                C111859t.f334895a.getClass();
                boolean z = true;
                try {
                    Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(Looper.getMainLooper());
                    if (obj instanceof ThreadLocal) {
                        ThreadLocal threadLocal = obj instanceof ThreadLocal ? (ThreadLocal) obj : null;
                        if (threadLocal != null) {
                            threadLocal.set(Looper.getMainLooper());
                        }
                    }
                } catch (Throwable unused) {
                }
                Log.m105924i(C111859t.f334896b, "start to preload taskId" + this.f334902d);
                Context context2 = this.f334903e.get();
                if (context2 != null && (context2 instanceof AppCompatActivity)) {
                    LayoutInflater b = C85868k2.m106137b(context2);
                    String simpleName = context2.getClass().getSimpleName();
                    if (C111855q.f334885a.mo163608b().mo163574b().mo163580a(simpleName)) {
                        C111859t tVar = C111859t.f334895a;
                        tVar.getClass();
                        HashMap<String, e85> hashMap = C111859t.f334900f;
                        e85 e853 = hashMap.get(simpleName);
                        if (e853 == null) {
                            try {
                                MultiProcessMMKV f = tVar.mo163609f();
                                if (!(f == null || (decodeBytes = f.decodeBytes(simpleName)) == null)) {
                                    e853 = new e85();
                                    e853.parseFrom(decodeBytes);
                                    e853.f182940d = simpleName;
                                    hashMap.put(simpleName, e853);
                                }
                            } catch (Exception e) {
                                Log.printErrStackTrace(C111859t.f334896b, e, "loadX2CPreloadData", new Object[0]);
                            }
                            e853 = null;
                        }
                        if (e853 != null) {
                            long c = C31543z5.m39453c();
                            if (Log.isDebug()) {
                                Log.m105918d(C111859t.f334896b, "preload data:" + C38272u.m41819b(e853));
                            }
                            LinkedList<f85> linkedList = e853.f182941e;
                            C87412m.m108593f(linkedList, "preloadData.layoutList");
                            Iterator<T> it4 = linkedList.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    str = simpleName;
                                    e85 = e853;
                                    j = c;
                                    break;
                                }
                                f85 f85 = (f85) it4.next();
                                AppCompatActivity appCompatActivity = (AppCompatActivity) context2;
                                if (appCompatActivity.isFinishing() || appCompatActivity.getLifecycle().getCurrentState() == C39623j.C39626c.DESTROYED) {
                                    str = simpleName;
                                    e85 = e853;
                                    j = c;
                                    Log.m105924i(C111859t.f334896b, "context is Finishing or Destroy");
                                } else {
                                    C111855q.f334885a.getClass();
                                    C111855q.f334891g.set(Boolean.valueOf(z));
                                    long c2 = C31543z5.m39453c();
                                    long nanoTime = System.nanoTime();
                                    if (Log.isDebug()) {
                                        String str3 = C111859t.f334896b;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("preload xml start ");
                                        it = it4;
                                        sb.append(appCompatActivity.getResources().getResourceName(f85.f183093d));
                                        sb.append(", hasParent:");
                                        sb.append(f85.f183094e);
                                        Log.m105918d(str3, sb.toString());
                                    } else {
                                        it = it4;
                                    }
                                    View inflate = f85.f183094e == 1 ? b.inflate(f85.f183093d, C111859t.f334898d, false) : b.inflate(f85.f183093d, (ViewGroup) null);
                                    if (inflate != null) {
                                        inflate.setTag(C0966R.C0970id.mku, inflate.getLayoutParams());
                                        e852 = e853;
                                        long nanoTime2 = System.nanoTime() - nanoTime;
                                        ConcurrentHashMap<String, C38271d> concurrentHashMap = C111859t.f334897c;
                                        layoutInflater = b;
                                        StringBuilder sb4 = new StringBuilder();
                                        str2 = simpleName;
                                        sb4.append(context2.hashCode());
                                        sb4.append('_');
                                        context = context2;
                                        sb4.append(f85.f183093d);
                                        sb4.append('_');
                                        sb4.append(f85.f183094e);
                                        String sb5 = sb4.toString();
                                        C38271d dVar = concurrentHashMap.get(sb5);
                                        if (dVar == null) {
                                            j2 = c;
                                            dVar = new C38271d((List) null, 1, (C8480h) null);
                                            C38271d putIfAbsent = concurrentHashMap.putIfAbsent(sb5, dVar);
                                            if (putIfAbsent != null) {
                                                dVar = putIfAbsent;
                                            }
                                        } else {
                                            j2 = c;
                                        }
                                        dVar.f101045a.add(new C111861e(inflate, nanoTime2));
                                    } else {
                                        context = context2;
                                        layoutInflater = b;
                                        str2 = simpleName;
                                        e852 = e853;
                                        j2 = c;
                                    }
                                    if (Log.isDebug()) {
                                        Log.m105918d(C111859t.f334896b, "preload xml finish " + appCompatActivity.getResources().getResourceName(f85.f183093d) + "  cost:" + (C31543z5.m39453c() - c2));
                                    }
                                    C111855q.f334891g.set(Boolean.FALSE);
                                    e853 = e852;
                                    b = layoutInflater;
                                    simpleName = str2;
                                    it4 = it;
                                    context2 = context;
                                    c = j2;
                                    z = true;
                                }
                            }
                            str = simpleName;
                            e85 = e853;
                            j = c;
                            Log.m105924i(C111859t.f334896b, "context is Finishing or Destroy");
                            Log.m105924i(C111859t.f334896b, "preload taskId:" + this.f334902d + " activityName:" + e85.f182940d + " size:" + e85.f182941e.size() + " cost:" + (C31543z5.m39453c() - j));
                            b0Var = C13598b0.f38549a;
                        } else {
                            str = simpleName;
                            b0Var = null;
                        }
                        if (b0Var == null) {
                            Log.m105924i(C111859t.f334896b, "preload taskId:" + this.f334902d + " not found layoutStrategy " + str);
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wq3.t$e */
    public static final class C111861e {

        /* renamed from: a */
        public final View f334904a;

        public C111861e(View view, long j) {
            C87412m.m108594g(view, "view");
            this.f334904a = view;
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("X2C_LAYOUT_THREAD");
        handlerThread.start();
        f334899e = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public View mo125149a(Context context, int i, ViewGroup viewGroup, boolean z) {
        C87412m.m108594g(context, "context");
        ConcurrentHashMap<String, C38271d> concurrentHashMap = f334897c;
        StringBuilder sb = new StringBuilder();
        sb.append(context.hashCode());
        sb.append('_');
        sb.append(i);
        sb.append('_');
        sb.append(viewGroup != null ? 1 : 0);
        C38271d dVar = concurrentHashMap.get(sb.toString());
        if (dVar == null || !(true ^ dVar.f101045a.isEmpty())) {
            return null;
        }
        C111861e eVar = (C111861e) C64175a0.m75513u(dVar.f101045a);
        View view = eVar.f334904a;
        if (viewGroup != null) {
            C111855q.f334885a.getClass();
            ViewGroup.LayoutParams generateLayoutParams = viewGroup.generateLayoutParams(C111855q.f334888d);
            Object tag = view.getTag(C0966R.C0970id.mku);
            C87412m.m108592e(tag, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tag;
            C87412m.m108593f(generateLayoutParams, "layoutParams");
            generateLayoutParams.width = marginLayoutParams.width;
            generateLayoutParams.height = marginLayoutParams.height;
            if (generateLayoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) generateLayoutParams;
                marginLayoutParams2.rightMargin = marginLayoutParams.rightMargin;
                marginLayoutParams2.topMargin = marginLayoutParams.topMargin;
                marginLayoutParams2.leftMargin = marginLayoutParams.leftMargin;
                marginLayoutParams2.bottomMargin = marginLayoutParams.bottomMargin;
                marginLayoutParams2.setMarginStart(marginLayoutParams.getMarginStart());
                marginLayoutParams2.setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            view.setLayoutParams(generateLayoutParams);
            if (z) {
                viewGroup.addView(view);
            }
        }
        return eVar.f334904a;
    }

    /* renamed from: b */
    public void mo125150b(Context context) {
        C87412m.m108594g(context, "context");
        String str = context.getClass().getSimpleName() + '_' + C31543z5.m39453c();
        f334899e.post(new C38272u.C38273a(new C111860b(str, new WeakReference(context))));
        Log.m105924i(f334896b, "onCreate " + str);
    }

    /* renamed from: c */
    public void mo125151c(e85 e85) {
        C87412m.m108594g(e85, "preloadData");
        f334899e.post(new C38272u.C38273a(new C38270c(e85)));
    }

    /* renamed from: d */
    public void mo125152d() {
        f334899e.removeCallbacksAndMessages((Object) null);
        f334897c.clear();
    }

    /* renamed from: e */
    public void mo125153e(Context context) {
        C87412m.m108594g(context, "context");
        String str = context.getClass().getSimpleName() + '_' + C31543z5.m39453c();
        f334899e.post(new C38272u.C38273a(new C38269a(str, context.hashCode(), context.getClass().getSimpleName())));
        Log.m105924i(f334896b, "onDestroy " + str);
    }

    /* renamed from: f */
    public final MultiProcessMMKV mo163609f() {
        MultiProcessMMKV multiProcessMMKV;
        if (f334901g == null) {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("X2CPreloadLayoutData");
            f334901g = mmkv;
            String decodeString = mmkv != null ? mmkv.decodeString("BuildInfo.TIME") : null;
            boolean z = true;
            if (C79758p.f233760a.mo109883f(new C107539a()) != 1) {
                z = false;
            }
            if ((!C87412m.m108589b(decodeString, BuildInfo.TIME) || z) && (multiProcessMMKV = f334901g) != null) {
                multiProcessMMKV.clearAll();
            }
            MultiProcessMMKV multiProcessMMKV2 = f334901g;
            if (multiProcessMMKV2 != null) {
                multiProcessMMKV2.encode("BuildInfo.TIME", BuildInfo.TIME);
            }
        }
        return f334901g;
    }
}
