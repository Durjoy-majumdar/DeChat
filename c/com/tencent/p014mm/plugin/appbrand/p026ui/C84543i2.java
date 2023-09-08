package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.ServiceConnection;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.i2 */
public class C84543i2 extends MutableContextWrapper {

    /* renamed from: a */
    public boolean f246706a;

    /* renamed from: b */
    public final ContextThemeWrapper f246707b;

    /* renamed from: c */
    public C84527f3 f246708c;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.i2$a */
    public static final class C84544a extends ContextThemeWrapper {

        /* renamed from: b */
        public static final SparseArray<C84544a> f246709b = new SparseArray<>();

        /* renamed from: a */
        public volatile LayoutInflater f246710a;

        public C84544a(Context context, int i) {
            super(context, i);
        }

        public Object getSystemService(String str) {
            LayoutInflater layoutInflater;
            if (!"layout_inflater".equals(str)) {
                return super.getSystemService(str);
            }
            synchronized (this) {
                if (this.f246710a == null) {
                    this.f246710a = ((LayoutInflater) getApplicationContext().getSystemService(str)).cloneInContext(this);
                    LayoutInflater layoutInflater2 = this.f246710a;
                    C76577a.m92165p(layoutInflater2.getContext());
                    C85868k2.C85870b bVar = new C85868k2.C85870b((C85868k2.C85869a) null);
                    bVar.f250144d = layoutInflater2;
                    layoutInflater2.setFactory(bVar);
                }
                layoutInflater = this.f246710a;
            }
            return layoutInflater;
        }
    }

    public C84543i2(Context context, int i) {
        super(context);
        C84544a aVar;
        Context applicationContext = context.getApplicationContext();
        SparseArray<C84544a> sparseArray = C84544a.f246709b;
        if (applicationContext == MMApplicationContext.getContext() || (applicationContext instanceof Application)) {
            SparseArray<C84544a> sparseArray2 = C84544a.f246709b;
            C84544a aVar2 = sparseArray2.get(i);
            if (aVar2 == null) {
                aVar2 = new C84544a(applicationContext, i);
                sparseArray2.put(i, aVar2);
            }
            aVar = aVar2;
        } else {
            aVar = new C84544a(applicationContext, i);
        }
        this.f246707b = aVar;
        if (!(context instanceof ContextThemeWrapper)) {
            super.setBaseContext(aVar);
        } else {
            context.setTheme(i);
        }
        if (context instanceof Activity) {
            if (context instanceof VASActivity) {
                try {
                    Activity activity = ((VASActivity) context)._activity;
                    if (activity != null) {
                        context = activity;
                    }
                } catch (Exception unused) {
                }
            }
            super.setBaseContext(context);
            this.f246706a = true;
            ((Application) getApplicationContext()).registerActivityLifecycleCallbacks(new C84534h2(this, context));
        }
    }

    /* renamed from: b */
    public static C84543i2 m104128b(Context context) {
        return new C84543i2(context, C84532g3.m104119a(false));
    }

    public Object getSystemService(String str) {
        return "layout_inflater".equals(str) ? this.f246707b.getSystemService(str) : super.getSystemService(str);
    }

    public void setBaseContext(Context context) {
        if (context != getBaseContext()) {
            if (this.f246706a) {
                Log.m105925i("MicroMsg.AppBrandRuntimePersistentContextWrapper", "setBaseContext hash:%d, new:%s, old:%s, stack:%s", Integer.valueOf(hashCode()), context, getBaseContext(), android.util.Log.getStackTraceString(new Throwable()));
            }
            if (context instanceof Activity) {
                if (context instanceof VASActivity) {
                    try {
                        Activity activity = ((VASActivity) context)._activity;
                        if (activity != null) {
                            context = activity;
                        }
                    } catch (Exception unused) {
                    }
                }
                super.setBaseContext(context);
                this.f246706a = true;
                ((Application) getApplicationContext()).registerActivityLifecycleCallbacks(new C84534h2(this, context));
            } else {
                super.setBaseContext(this.f246707b);
            }
            this.f246708c = null;
        }
    }

    public void unbindService(ServiceConnection serviceConnection) {
        try {
            super.unbindService(serviceConnection);
        } catch (IllegalArgumentException e) {
            Log.printErrStackTrace("MicroMsg.AppBrandRuntimePersistentContextWrapper", e, "[CAPTURED CRASH]", new Object[0]);
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e) {
            Log.m105921e("MicroMsg.AppBrandRuntimePersistentContextWrapper", "unregisterReceiver IllegalArgumentException %s", e);
        }
    }
}
