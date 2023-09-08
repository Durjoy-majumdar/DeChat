package p225rc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.SparseArray;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import p385u2.C111105a;
import wq0.C91075m;

/* renamed from: rc.g */
public final class C89916g {

    /* renamed from: g */
    public static C91075m f258376g;

    /* renamed from: h */
    public static final WeakHashMap<Activity, C89916g> f258377h = new WeakHashMap<>();

    /* renamed from: i */
    public static final C89916g f258378i = new C89916g((Activity) null);

    /* renamed from: a */
    public final SparseArray<g$$e> f258379a = new SparseArray<>();

    /* renamed from: b */
    public final SparseArray<g$$i> f258380b = new SparseArray<>();

    /* renamed from: c */
    public final Set<g$$f> f258381c = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: d */
    public g$$d f258382d;

    /* renamed from: e */
    public Activity f258383e;

    /* renamed from: f */
    public Random f258384f;

    public C89916g(Activity activity) {
        this.f258383e = activity;
        this.f258384f = new Random();
    }

    /* renamed from: a */
    public static C89916g m112446a(Context context) {
        Assert.assertFalse("must implements ILuggageActivityHelper", false);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                Log.m105921e("Luggage.LuggageActivityHelper", "FOR(%s) instance destroyed, return DUMMY", activity);
                return f258378i;
            }
            WeakHashMap<Activity, C89916g> weakHashMap = f258377h;
            if (!weakHashMap.containsKey(activity)) {
                weakHashMap.put(activity, new C89916g(activity));
            }
            return weakHashMap.get(context);
        }
        Assert.assertFalse(false);
        return f258378i;
    }

    /* renamed from: b */
    public static void m112447b(Context context) {
        C89916g remove;
        if ((context instanceof Activity) && (remove = f258377h.remove(context)) != null) {
            remove.f258379a.clear();
            remove.f258381c.clear();
            remove.f258380b.clear();
        }
    }

    /* renamed from: c */
    public boolean mo124229c(C82381f fVar, String str, g$$i g__i) {
        if (Build.VERSION.SDK_INT < 23 && !"MNC".equals(Build.VERSION.CODENAME)) {
            return true;
        }
        if (this.f258383e == null) {
            return false;
        }
        C91075m mVar = f258376g;
        if (mVar == null || fVar == null || !mVar.mo117445c()) {
            try {
                if (C111105a.m151499a(this.f258383e, str) == 0) {
                    return true;
                }
                mo124235i((C82381f) null, new String[]{str}, g__i);
                return false;
            } catch (Exception e) {
                Log.m105921e("Luggage.LuggageActivityHelper", "check mpermission exception:%s.", e);
                return true;
            }
        } else if (f258376g.mo117444b(this.f258383e, fVar, str)) {
            return true;
        } else {
            f258376g.mo117443a(this.f258383e, fVar, str, new g$$a(g__i, str));
            return false;
        }
    }

    /* renamed from: d */
    public final void mo124230d(C82381f fVar, int i, String[] strArr, int[] iArr, g$$i g__i) {
        int i2 = i;
        String[] strArr2 = strArr;
        int[] iArr2 = iArr;
        if (i2 == strArr2.length) {
            StringBuilder sb = new StringBuilder();
            for (int append : iArr2) {
                sb.append(append);
                sb.append(",");
            }
            Log.m105925i("Luggage.LuggageActivityHelper", "delegateBatchRequestPermissionToSeqLogic finally callback, grantResult:%s", sb);
            g__i.mo1686c(strArr2, iArr2);
            return;
        }
        g$$i g__i2 = g__i;
        if (f258376g != null) {
            String str = strArr2[i2];
            Log.m105925i("Luggage.LuggageActivityHelper", "doReqPerm index:%d permission:%s", Integer.valueOf(i), str);
            C82381f fVar2 = fVar;
            f258376g.mo117443a(this.f258383e, fVar, str, new g$$b(this, iArr, i, str, fVar, strArr, g__i));
        }
    }

    /* renamed from: e */
    public void mo124231e() {
        Activity activity = this.f258383e;
        if (activity != null && !activity.isFinishing() && !this.f258383e.isDestroyed()) {
            g$$d g__d = this.f258382d;
            if (g__d != null ? g__d.mo66353s7() : true) {
                this.f258383e.finish();
            }
        }
    }

    /* renamed from: f */
    public void mo124232f(g$$f g__f) {
        if (g__f != null) {
            this.f258381c.add(new g$$c(this, g__f));
        }
    }

    /* renamed from: g */
    public void mo124233g(int i, int i2, Intent intent) {
        for (g$$f b : this.f258381c) {
            if (b.mo1596b(i, i2, intent)) {
                return;
            }
        }
        g$$g g__g = this.f258379a.get(i);
        this.f258379a.delete(i);
        if (g__g != null) {
            ((g$$e) g__g).mo1626a(i2, intent);
        }
    }

    /* renamed from: h */
    public void mo124234h(int i, String[] strArr, int[] iArr) {
        g$$g g__g = this.f258380b.get(i);
        this.f258380b.delete(i);
        if (g__g != null) {
            ((g$$i) g__g).mo1686c(strArr, iArr);
        }
    }

    /* renamed from: i */
    public void mo124235i(C82381f fVar, String[] strArr, g$$i g__i) {
        int nextInt;
        if (this.f258383e != null) {
            if (Build.VERSION.SDK_INT < 23) {
                int[] iArr = new int[strArr.length];
                Arrays.fill(iArr, 0);
                g__i.mo1686c(strArr, iArr);
                return;
            }
            C91075m mVar = f258376g;
            if (mVar == null || fVar == null || !mVar.mo117445c()) {
                SparseArray<g$$i> sparseArray = this.f258380b;
                do {
                    nextInt = (this.f258384f.nextInt(2147483646) + 1) & 65535;
                } while (sparseArray.get(nextInt) != null);
                this.f258380b.put(nextInt, g__i);
                Activity activity = this.f258383e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(nextInt));
                aVar.mo10233c(strArr);
                Activity activity2 = activity;
                C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/luggage/util/LuggageActivityHelper", "requestPermissions", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;[Ljava/lang/String;Lcom/tencent/luggage/util/LuggageActivityHelper$PermissionResultCallback;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                activity.requestPermissions((String[]) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(activity2, "com/tencent/luggage/util/LuggageActivityHelper", "requestPermissions", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;[Ljava/lang/String;Lcom/tencent/luggage/util/LuggageActivityHelper$PermissionResultCallback;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                return;
            }
            mo124230d(fVar, 0, strArr, new int[strArr.length], g__i);
        }
    }

    /* renamed from: j */
    public void mo124236j(Intent intent, g$$e g__e) {
        int nextInt;
        if (this.f258383e != null) {
            SparseArray<g$$e> sparseArray = this.f258379a;
            do {
                nextInt = (this.f258384f.nextInt(2147483646) + 1) & 65535;
            } while (sparseArray.get(nextInt) != null);
            this.f258379a.put(nextInt, g__e);
            Activity activity = this.f258383e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(nextInt));
            aVar.mo10233c(intent);
            C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/luggage/util/LuggageActivityHelper", "startActivityForResult", "(Landroid/content/Intent;Lcom/tencent/luggage/util/LuggageActivityHelper$ActivityResultCallback;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }
}
