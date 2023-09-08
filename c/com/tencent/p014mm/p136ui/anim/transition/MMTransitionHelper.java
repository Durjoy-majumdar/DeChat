package com.tencent.p014mm.p136ui.anim.transition;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Pair;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.Log;
import gj3.C59469a;
import gy3.C8480h;
import gy3.C87412m;
import ij3.C60331a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import p329d3.C58104c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ui.anim.transition.MMTransitionHelper */
public final class MMTransitionHelper {

    /* renamed from: a */
    public static final MMTransitionHelper f165034a = new MMTransitionHelper();

    /* renamed from: b */
    public static final WeakHashMap<Activity, C57657a> f165035b = new WeakHashMap<>();

    /* renamed from: c */
    public static final SharedElementCallback f165036c = new C57658b();

    /* renamed from: com.tencent.mm.ui.anim.transition.MMTransitionHelper$a */
    public static final class C57657a {

        /* renamed from: a */
        public boolean f165037a;

        /* renamed from: b */
        public boolean f165038b;

        /* renamed from: c */
        public List<WeakReference<ResultReceiver>> f165039c;

        /* renamed from: d */
        public WeakReference<C59469a> f165040d;

        /* renamed from: e */
        public List<WeakReference<C60331a>> f165041e;

        /* renamed from: f */
        public boolean f165042f;

        public C57657a() {
            this(false, false, (List) null, (WeakReference) null, (List) null, false, 63, (C8480h) null);
        }

        public C57657a(boolean z, boolean z2, List<WeakReference<ResultReceiver>> list, WeakReference<C59469a> weakReference, List<WeakReference<C60331a>> list2, boolean z3, int i, C8480h hVar) {
            z = (i & 1) != 0 ? false : z;
            z2 = (i & 2) != 0 ? false : z2;
            list = (i & 4) != 0 ? new ArrayList<>() : list;
            weakReference = (i & 8) != 0 ? null : weakReference;
            list2 = (i & 16) != 0 ? new ArrayList<>() : list2;
            z3 = (i & 32) != 0 ? false : z3;
            C87412m.m108594g(list, "exitTransitionCoordinator");
            C87412m.m108594g(list2, "animHelperViews");
            this.f165037a = z;
            this.f165038b = z2;
            this.f165039c = list;
            this.f165040d = weakReference;
            this.f165041e = list2;
            this.f165042f = z3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C57657a)) {
                return false;
            }
            C57657a aVar = (C57657a) obj;
            return this.f165037a == aVar.f165037a && this.f165038b == aVar.f165038b && C87412m.m108589b(this.f165039c, aVar.f165039c) && C87412m.m108589b(this.f165040d, aVar.f165040d) && C87412m.m108589b(this.f165041e, aVar.f165041e) && this.f165042f == aVar.f165042f;
        }

        public int hashCode() {
            boolean z = this.f165037a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f165038b;
            if (z3) {
                z3 = true;
            }
            int hashCode = (((i + (z3 ? 1 : 0)) * 31) + this.f165039c.hashCode()) * 31;
            WeakReference<C59469a> weakReference = this.f165040d;
            int hashCode2 = (((hashCode + (weakReference == null ? 0 : weakReference.hashCode())) * 31) + this.f165041e.hashCode()) * 31;
            boolean z4 = this.f165042f;
            if (!z4) {
                z2 = z4;
            }
            return hashCode2 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "ActivityTransitionState(hasSetObserver=" + this.f165037a + ", isCreateByTransition=" + this.f165038b + ", exitTransitionCoordinator=" + this.f165039c + ", exitSharedElementCallback=" + this.f165040d + ", animHelperViews=" + this.f165041e + ", hasEndTransition=" + this.f165042f + ')';
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.transition.MMTransitionHelper$b */
    public static final class C57658b extends SharedElementCallback {
    }

    /* renamed from: a */
    public final Bundle mo81990a(Context context, List<? extends Pair<View, String>> list, C59469a aVar, Intent intent) {
        Pair[] pairArr;
        String str;
        ResultReceiver resultReceiver;
        Log.m105918d("MM.Transition", "getEnterAnimOptionBundle() called with: activity = " + context + ", shareElements = " + list);
        C13598b0 b0Var = null;
        if (!(context instanceof Activity)) {
            return null;
        }
        Activity activity = (Activity) context;
        mo81992c(activity, false, aVar);
        mo81993d(activity);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Pair pair : list) {
                arrayList.add(new C58104c(pair.first, pair.second));
            }
        }
        Object[] array = arrayList.toArray(new C58104c[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        C58104c[] cVarArr = (C58104c[]) array;
        C58104c[] cVarArr2 = (C58104c[]) Arrays.copyOf(cVarArr, cVarArr.length);
        if (cVarArr2 != null) {
            pairArr = new Pair[cVarArr2.length];
            for (int i = 0; i < cVarArr2.length; i++) {
                C58104c cVar = cVarArr2[i];
                pairArr[i] = Pair.create((View) cVar.f166179a, (String) cVar.f166180b);
            }
        } else {
            pairArr = null;
        }
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(activity, pairArr).toBundle();
        if (bundle != null) {
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable("android:activity.transitionCompleteListener");
            } catch (Throwable th) {
                Log.printErrStackTrace("MM.Transition", th, "getEnter err", new Object[0]);
                str = "err";
            }
        } else {
            resultReceiver = null;
        }
        if (!(resultReceiver instanceof ResultReceiver)) {
            resultReceiver = null;
        }
        if (resultReceiver != null) {
            f165034a.mo81991b((Activity) context).f165039c.add(new WeakReference(resultReceiver));
            str = "isNotNull:" + resultReceiver;
            b0Var = C13598b0.f38549a;
        } else {
            str = "default";
        }
        if (b0Var == null) {
            str = "isNull";
        }
        Log.m105924i("MM.Transition", "initOptionBundle act:" + context + ", coordinator:" + str);
        mo81991b(activity).f165040d = new WeakReference<>(aVar);
        if (intent != null) {
            intent.putExtra("KEY_EXIT_ACTIVITY", activity.hashCode());
        }
        return bundle;
    }

    /* renamed from: b */
    public final C57657a mo81991b(Activity activity) {
        C87412m.m108594g(activity, "<this>");
        WeakHashMap<Activity, C57657a> weakHashMap = f165035b;
        C57657a aVar = weakHashMap.get(activity);
        if (aVar != null) {
            return aVar;
        }
        C57657a aVar2 = new C57657a(false, false, (List) null, (WeakReference) null, (List) null, false, 63, (C8480h) null);
        weakHashMap.put(activity, aVar2);
        return aVar2;
    }

    /* renamed from: c */
    public final void mo81992c(Activity activity, boolean z, C59469a aVar) {
        String str;
        if (aVar == null) {
            aVar = new C59469a();
        }
        if (z) {
            str = "MM.Transition.callback." + activity.getClass().getSimpleName() + ", enter";
        } else {
            str = "MM.Transition.callback." + activity.getClass().getSimpleName() + ", exit";
        }
        C87412m.m108594g(str, "<set-?>");
        aVar.f169941a = str;
        if (z) {
            activity.setEnterSharedElementCallback(aVar);
        } else {
            activity.setExitSharedElementCallback(aVar);
        }
    }

    /* renamed from: d */
    public final void mo81993d(Activity activity) {
        C39623j lifecycle;
        C57657a b = mo81991b(activity);
        if (!b.f165037a) {
            b.f165037a = true;
            AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
            if (appCompatActivity != null && (lifecycle = appCompatActivity.getLifecycle()) != null) {
                lifecycle.addObserver(new MMTransitionHelper$tryRegisterObserver$1(b, activity));
            }
        }
    }
}
