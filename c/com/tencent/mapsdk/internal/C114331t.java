package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.tencent.map.tools.Callback;
import com.tencent.tencentmap.mapsdk.maps.BaseMapView;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;

/* renamed from: com.tencent.mapsdk.internal.t */
public final class C114331t {

    /* renamed from: a */
    public final Context f342625a;

    public C114331t(Context context) {
        this.f342625a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final BaseMapView.MapViewProxy mo172991a(C114195s sVar, ViewGroup viewGroup, TencentMapOptions tencentMapOptions) {
        return sVar.createDelegate(this.f342625a, tencentMapOptions, viewGroup);
    }

    /* renamed from: a */
    public final BaseMapView.MapViewProxy mo172990a(ViewGroup viewGroup, TencentMapOptions tencentMapOptions) {
        C114361u.m160481a().mo172880a(this.f342625a, mo172992a(tencentMapOptions));
        return mo172991a(C114361u.m160481a().f342770b, viewGroup, tencentMapOptions);
    }

    /* renamed from: a */
    private void m160291a(final ViewGroup viewGroup, final TencentMapOptions tencentMapOptions, final Callback<BaseMapView.MapViewProxy> callback) {
        new Thread(new Runnable(this.f342625a, mo172992a(tencentMapOptions), new Handler(Looper.getMainLooper()), new Callback<Void>() {
            /* renamed from: a */
            private void m160295a() {
                BaseMapView.MapViewProxy a = C114331t.this.mo172991a(C114361u.m160481a().f342770b, viewGroup, tencentMapOptions);
                Callback callback = callback;
                if (callback != null) {
                    callback.callback(a);
                }
            }

            public final /* synthetic */ void callback(Object obj) {
                BaseMapView.MapViewProxy a = C114331t.this.mo172991a(C114361u.m160481a().f342770b, viewGroup, tencentMapOptions);
                Callback callback = callback;
                if (callback != null) {
                    callback.callback(a);
                }
            }
        }) {
            public final void run() {
                C114361u.this.mo172880a(r2, r3);
                r4.post(new Runnable() {
                    public final void run() {
                        Callback callback = r5;
                        if (callback != null) {
                            callback.callback(null);
                        }
                    }
                });
            }
        }, "tms-plugin").start();
    }

    /* renamed from: a */
    public final String mo172992a(TencentMapOptions tencentMapOptions) {
        String mapKey = tencentMapOptions.getMapKey();
        if (C40002he.m42805a(mapKey)) {
            mapKey = C113801hf.m157138a(this.f342625a, "TencentMapSDK");
        }
        String customUserId = tencentMapOptions.getCustomUserId();
        if (TextUtils.isEmpty(customUserId)) {
            customUserId = "undefined";
        }
        return mapKey + "," + customUserId;
    }
}
