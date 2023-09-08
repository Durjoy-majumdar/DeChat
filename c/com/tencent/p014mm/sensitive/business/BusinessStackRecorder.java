package com.tencent.p014mm.sensitive.business;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import bh3.C113177k;
import bh3.C113192w;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hh3.C117092b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/sensitive/business/BusinessStackRecorder;", "Landroid/content/BroadcastReceiver;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "b", "c", "sensitive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sensitive.business.BusinessStackRecorder */
public final class BusinessStackRecorder extends BroadcastReceiver implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    public static final C115996b f347906f = new C115996b((C8480h) null);

    /* renamed from: g */
    public static final HashMap<String, String> f347907g = new HashMap<>();

    /* renamed from: h */
    public static final HashMap<String, String> f347908h = new HashMap<>();

    /* renamed from: i */
    public static final LinkedList<C115997c> f347909i = new LinkedList<>();

    /* renamed from: j */
    public static final LinkedList<C115997c> f347910j = new LinkedList<>();

    /* renamed from: n */
    public static final MultiProcessMMKV f347911n = MultiProcessMMKV.getMMKV("BusinessStackRecorder");

    /* renamed from: o */
    public static final C13601g<BusinessStackRecorder> f347912o = C36568h.m40985a(C115995a.f347915d);

    /* renamed from: d */
    public final int f347913d = 1000;

    /* renamed from: e */
    public final C13601g f347914e;

    /* renamed from: com.tencent.mm.sensitive.business.BusinessStackRecorder$a */
    public static final class C115995a extends C87413o implements C32224a<BusinessStackRecorder> {

        /* renamed from: d */
        public static final C115995a f347915d = new C115995a();

        public C115995a() {
            super(0);
        }

        public Object invoke() {
            return new BusinessStackRecorder();
        }
    }

    /* renamed from: com.tencent.mm.sensitive.business.BusinessStackRecorder$b */
    public static final class C115996b {
        public C115996b(C8480h hVar) {
        }

        /* renamed from: a */
        public static final void m163120a(C115996b bVar) {
            bVar.getClass();
            LinkedList<C115997c> linkedList = BusinessStackRecorder.f347910j;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C115997c cVar : linkedList) {
                C113177k.C113178a aVar = cVar.f347922g;
                arrayList.add(aVar != null ? aVar.f338661d : null);
            }
            BusinessStackRecorder.f347911n.putString("SENSITIVE_BUSINESS_STR", Util.listToString(C110818d0.m150900B0(arrayList), ","));
        }

        /* renamed from: b */
        public final BusinessStackRecorder mo176840b() {
            return (BusinessStackRecorder) ((C36570n) BusinessStackRecorder.f347912o).getValue();
        }

        /* renamed from: c */
        public final String mo176841c() {
            C113177k.C113178a aVar;
            if (MMApplicationContext.isMainProcess()) {
                C115997c cVar = (C115997c) C110818d0.m150925W(BusinessStackRecorder.f347910j);
                if (cVar == null || (aVar = cVar.f347922g) == null) {
                    return null;
                }
                return aVar.f338661d;
            }
            String string = BusinessStackRecorder.f347911n.getString("SENSITIVE_BUSINESS_STR", (String) null);
            if (string == null) {
                return null;
            }
            List<String> stringToList = Util.stringToList(string, ",");
            C87412m.m108593f(stringToList, "stringToList(it, \",\")");
            return (String) C110818d0.m150925W(stringToList);
        }
    }

    /* renamed from: com.tencent.mm.sensitive.business.BusinessStackRecorder$c */
    public static final class C115997c {

        /* renamed from: a */
        public final String f347916a;

        /* renamed from: b */
        public final String f347917b;

        /* renamed from: c */
        public final String f347918c;

        /* renamed from: d */
        public final String f347919d;

        /* renamed from: e */
        public final long f347920e;

        /* renamed from: f */
        public String f347921f = "";

        /* renamed from: g */
        public C113177k.C113178a f347922g;

        public C115997c(String str, String str2, String str3, String str4, long j) {
            C87412m.m108594g(str, "action");
            C87412m.m108594g(str2, "pageName");
            C87412m.m108594g(str3, "pageRef");
            C87412m.m108594g(str4, "process");
            this.f347916a = str;
            this.f347917b = str2;
            this.f347918c = str3;
            this.f347919d = str4;
            this.f347920e = j;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof C115997c)) {
                C115997c cVar = (C115997c) obj;
                return C87412m.m108589b(this.f347917b, cVar.f347917b) && C87412m.m108589b(this.f347919d, cVar.f347919d);
            }
        }

        public int hashCode() {
            long j = this.f347920e;
            return (((((((this.f347916a.hashCode() * 31) + this.f347917b.hashCode()) * 31) + this.f347918c.hashCode()) * 31) + this.f347919d.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "page:" + this.f347917b + ", action:" + this.f347916a + ", process:" + this.f347919d + ", time:" + this.f347920e;
        }
    }

    /* renamed from: com.tencent.mm.sensitive.business.BusinessStackRecorder$d */
    public static final class C115998d extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C115998d f347923d = new C115998d();

        public C115998d() {
            super(0);
        }

        public Object invoke() {
            C115996b bVar = BusinessStackRecorder.f347906f;
            MMHandler mMHandler = new MMHandler("BusinessStackRecorder", (MMHandler.Callback) C115999a.f347924d);
            mMHandler.setLogging(false);
            return mMHandler;
        }
    }

    public BusinessStackRecorder() {
        try {
            C113192w wVar = C113192w.f338695a;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            JSONObject jSONObject = new JSONObject(wVar.mo165722a(context, "businessToActivityName.json"));
            Iterator<String> keys = jSONObject.keys();
            C87412m.m108593f(keys, "json.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    HashMap<String, String> hashMap = f347907g;
                    String obj = jSONArray.get(i).toString();
                    C87412m.m108593f(next, LocaleUtil.ITALIAN);
                    hashMap.put(obj, next);
                }
            }
            C113192w wVar2 = C113192w.f338695a;
            Context context2 = MMApplicationContext.getContext();
            C87412m.m108593f(context2, "getContext()");
            JSONObject jSONObject2 = new JSONObject(wVar2.mo165722a(context2, "keywordToBusinessMap.json"));
            Iterator<String> keys2 = jSONObject2.keys();
            C87412m.m108593f(keys2, "json2.keys()");
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                String optString = jSONObject2.optString(next2);
                HashMap<String, String> hashMap2 = f347908h;
                C87412m.m108593f(next2, LocaleUtil.ITALIAN);
                C87412m.m108593f(optString, "businessName");
                hashMap2.put(next2, optString);
            }
        } catch (Exception e) {
            Log.m105924i("BusinessStackRecorder", "catch exception: " + e.getMessage());
            C117092b bVar = C117092b.f350860a;
            bVar.mo181043b("initJson2Map", "[throwAbleStr] catch: " + e.getCause());
        }
        this.f347914e = C36568h.m40985a(C115998d.f347923d);
    }

    /* renamed from: a */
    public final void mo176828a(String str, String str2) {
        C87412m.m108594g(str, "action");
        C87412m.m108594g(str2, "forceBusiness");
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra(MMApplicationContext.INTENT_PROCESS_NAME, MMApplicationContext.getProcessName() + '@' + Process.myPid());
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_CLASS_NAME", str2);
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_REF", str2);
        intent.putExtra("MANUAL_BUSINESS", str2);
        if (MMApplicationContext.isMainProcess()) {
            mo176830c(intent);
        } else {
            MMApplicationContext.getContext().sendBroadcast(intent);
        }
    }

    /* renamed from: b */
    public final void mo176829b(String str, String str2, String str3) {
        C87412m.m108594g(str, "action");
        C87412m.m108594g(str2, "activityName");
        C87412m.m108594g(str3, "activityRef");
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra(MMApplicationContext.INTENT_PROCESS_NAME, MMApplicationContext.getProcessName() + '@' + Process.myPid());
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_CLASS_NAME", str2);
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_REF", str3);
        if (MMApplicationContext.isMainProcess()) {
            mo176830c(intent);
        } else {
            MMApplicationContext.getContext().sendBroadcast(intent);
        }
    }

    /* renamed from: c */
    public final void mo176830c(Intent intent) {
        C115997c cVar;
        if (intent != null) {
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_CLASS_NAME");
            String stringExtra2 = intent.getStringExtra(MMApplicationContext.INTENT_PROCESS_NAME);
            String stringExtra3 = intent.getStringExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_REF");
            String stringExtra4 = intent.getStringExtra("MANUAL_BUSINESS");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            if (action == null || stringExtra == null || stringExtra2 == null || stringExtra3 == null) {
                cVar = null;
            } else {
                cVar = new C115997c(action, stringExtra, stringExtra3, stringExtra2, SystemClock.uptimeMillis());
                cVar.f347921f = stringExtra4;
            }
            if (cVar != null) {
                Log.m105924i("BusinessStackRecorder", "receive " + cVar);
                ((MMHandler) ((C36570n) this.f347914e).getValue()).sendMessage(((MMHandler) ((C36570n) this.f347914e).getValue()).obtainMessage(this.f347913d, cVar));
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105924i("BusinessStackRecorder", "onActivityDestroyed，activity = " + activity);
        mo176829b("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT", activity.getClass().getName(), String.valueOf(activity.hashCode()));
    }

    public void onActivityPaused(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105924i("BusinessStackRecorder", "onActivityPreCreated，activity = " + activity);
        mo176829b("com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER", activity.getClass().getName(), String.valueOf(activity.hashCode()));
    }

    public void onActivityResumed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105924i("BusinessStackRecorder", "onActivityResumed，activity = " + activity);
        mo176829b("com.tencent.mm.sensitive.SENSITIVE_PAGE_RESUME", activity.getClass().getName(), String.valueOf(activity.hashCode()));
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityStopped(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onReceive(Context context, Intent intent) {
        mo176830c(intent);
    }
}
