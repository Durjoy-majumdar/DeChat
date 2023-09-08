package com.tencent.p014mm.plugin.appbrand.ipc;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p225rc.C89916g;
import p225rc.g$$e;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask */
public abstract class AppBrandProxyTransparentUIProcessTask implements Parcelable {

    /* renamed from: h */
    public static Map<String, WeakReference<AppBrandProxyTransparentUIProcessTask>> f49237h = new ConcurrentHashMap();

    /* renamed from: i */
    public static final Set<Object> f49238i = new HashSet();

    /* renamed from: d */
    public Context f49239d;

    /* renamed from: e */
    public int f49240e = -1;

    /* renamed from: f */
    public MMActivity.C6739d f49241f = new C17863a();

    /* renamed from: g */
    public String f49242g = ("" + Process.myPid() + "" + hashCode());

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask$a */
    public class C17863a implements MMActivity.C6739d {
        public C17863a() {
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == (AppBrandProxyTransparentUIProcessTask.this.hashCode() & 65535) && intent != null) {
                AppBrandProxyTransparentUIProcessTask appBrandProxyTransparentUIProcessTask = (AppBrandProxyTransparentUIProcessTask) intent.getParcelableExtra("task_object");
                String stringExtra = intent.getStringExtra("task_id");
                AppBrandProxyTransparentUIProcessTask appBrandProxyTransparentUIProcessTask2 = (((ConcurrentHashMap) AppBrandProxyTransparentUIProcessTask.f49237h).containsKey(stringExtra) && ((WeakReference) ((ConcurrentHashMap) AppBrandProxyTransparentUIProcessTask.f49237h).get(stringExtra)).get() != null) ? (AppBrandProxyTransparentUIProcessTask) ((WeakReference) ((ConcurrentHashMap) AppBrandProxyTransparentUIProcessTask.f49237h).get(stringExtra)).get() : null;
                if (appBrandProxyTransparentUIProcessTask2 == null) {
                    Log.m105920e("MicroMsg.AppBrandProxyTransparentUIProcessTask", "task is null");
                    return;
                }
                Parcel obtain = Parcel.obtain();
                appBrandProxyTransparentUIProcessTask.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                appBrandProxyTransparentUIProcessTask2.mo1569b(obtain);
                obtain.recycle();
                ((HashSet) AppBrandProxyTransparentUIProcessTask.f49238i).remove(appBrandProxyTransparentUIProcessTask2);
                appBrandProxyTransparentUIProcessTask2.mo1570c();
                AppBrandProxyTransparentUIProcessTask.this.f49239d = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask$b */
    public class C17864b implements g$$e {
        public C17864b() {
        }

        /* renamed from: a */
        public void mo1626a(int i, Intent intent) {
            AppBrandProxyTransparentUIProcessTask appBrandProxyTransparentUIProcessTask = AppBrandProxyTransparentUIProcessTask.this;
            appBrandProxyTransparentUIProcessTask.f49241f.mmOnActivityResult(appBrandProxyTransparentUIProcessTask.hashCode() & 65535, i, intent);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask$c */
    public interface C17865c {
    }

    public AppBrandProxyTransparentUIProcessTask() {
    }

    /* renamed from: a */
    public final void mo22082a() {
        if (this.f49239d != null) {
            ((ConcurrentHashMap) f49237h).put(this.f49242g, new WeakReference(this));
            Intent intent = new Intent();
            intent.setClass(this.f49239d, AppBrandProxyTransparentUI.class);
            intent.putExtra("task_object", this);
            intent.putExtra("task_class_name", getClass().getName());
            intent.putExtra("task_id", this.f49242g);
            intent.putExtra("orientation", this.f49240e);
            C89916g.m112446a(this.f49239d).mo124236j(intent, new C17864b());
        }
    }

    /* renamed from: b */
    public void mo1569b(Parcel parcel) {
    }

    /* renamed from: c */
    public void mo1570c() {
    }

    /* renamed from: d */
    public abstract void mo1571d(Context context, C17865c cVar);

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public AppBrandProxyTransparentUIProcessTask(Context context) {
        this.f49239d = context;
    }
}
