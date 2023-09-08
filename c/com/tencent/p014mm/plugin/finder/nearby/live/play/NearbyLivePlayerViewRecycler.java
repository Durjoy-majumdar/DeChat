package com.tencent.p014mm.plugin.finder.nearby.live.play;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C0325u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fm1.C8137c;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import ns3.C11264b;
import pm1.C62404u;
import pm1.C62405v;

/* renamed from: com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePlayerViewRecycler */
public final class NearbyLivePlayerViewRecycler extends C0325u<C8137c> implements C11264b {

    /* renamed from: d */
    public final HashSet<NearbyLivePreviewView> f160213d = new HashSet<>();

    /* renamed from: e */
    public final ConcurrentLinkedQueue<WeakReference<NearbyLivePreviewView>> f160214e = new ConcurrentLinkedQueue<>();

    /* renamed from: f */
    public final MMHandler f160215f = new MMHandler(Looper.getMainLooper());

    /* renamed from: g */
    public boolean f160216g;

    /* renamed from: h */
    public int f160217h;

    /* renamed from: i */
    public int f160218i;

    /* renamed from: j */
    public final HashSet<Integer> f160219j = new HashSet<>();

    /* renamed from: c3 */
    public final NearbyLivePreviewView mo78382c3() {
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        NearbyLivePreviewView nearbyLivePreviewView = new NearbyLivePreviewView(context);
        this.f160214e.add(new WeakReference(nearbyLivePreviewView));
        Log.m105924i("NearbyLivePlayerViewRecycler", "createView view:" + nearbyLivePreviewView);
        return nearbyLivePreviewView;
    }

    /* renamed from: n2 */
    public void mo11321n2(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (this.f160218i == 0) {
            this.f160216g = false;
            if (Build.VERSION.SDK_INT >= 23) {
                this.f160217h = this.f160213d.size();
                Looper.getMainLooper().getQueue().addIdleHandler(new C62404u(this));
            }
        }
        if (this.f160219j.add(Integer.valueOf(appCompatActivity.hashCode()))) {
            this.f160218i++;
            appCompatActivity.getLifecycle().addObserver(new NearbyLivePlayerViewRecycler$attach$1(this, appCompatActivity));
        }
    }

    public void onCleared() {
        super.onCleared();
        this.f160219j.clear();
        this.f160216g = true;
        this.f160215f.post(new C62405v(this));
    }
}
