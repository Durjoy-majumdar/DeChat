package com.tencent.p014mm.live.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58121a;
import d60.C58124b;
import gy3.C87412m;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import y50.C66514h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010A\u001a\u00020@\u0012\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bD\u0010EJ\b\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH&J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\"\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J/\u0010 \u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00052\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u000bH\u0016J\b\u0010#\u001a\u00020\u000bH\u0016J\b\u0010$\u001a\u00020\tH\u0016J\b\u0010%\u001a\u00020\tH\u0016J\u0012\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010-\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016J\u0018\u00100\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u0005H\u0016J\b\u00101\u001a\u00020\tH\u0016J\b\u00102\u001a\u00020\u0005H\u0016J\b\u00103\u001a\u00020\u0005H\u0016R \u00105\u001a\b\u0012\u0004\u0012\u00020&048\u0004X\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006F"}, mo182094d2 = {"Lcom/tencent/mm/live/view/BaseLivePluginLayout;", "Landroid/widget/RelativeLayout;", "", "Ld60/b;", "Ly50/h;", "", "getRelativeLayoutId", "Lcom/tencent/mm/live/api/LiveConfig;", "config", "", "isFinished", "Lrx3/b0;", "initLogic", "state", "", "incomingNumber", "onCallStateChanged", "rotationEnable", "onRotationSwitchChange", "mount", "resume", "start", "pause", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "stop", "unMount", "onBackPress", "onSwipeBack", "Ld60/a;", "plugin", "registerPlugin", "Ld60/b$b;", "status", "Landroid/os/Bundle;", "param", "statusChange", "show", "height", "keyboardChange", "isLandscape", "getCurrentOrientation", "getPluginSize", "Ljava/util/concurrent/CopyOnWriteArrayList;", "pluginList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getPluginList", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/ViewGroup;", "getParent", "()Landroid/view/ViewGroup;", "setParent", "(Landroid/view/ViewGroup;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.view.BaseLivePluginLayout */
public abstract class BaseLivePluginLayout extends RelativeLayout implements C58124b, C66514h {
    private ViewGroup parent;
    private final CopyOnWriteArrayList<C58121a> pluginList = new CopyOnWriteArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseLivePluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(getRelativeLayoutId(), this, true);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.parent = (ViewGroup) inflate;
    }

    public int getCurrentOrientation() {
        Context context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        return ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation();
    }

    public abstract /* synthetic */ int getLiveRole();

    public final ViewGroup getParent() {
        return this.parent;
    }

    public final CopyOnWriteArrayList<C58121a> getPluginList() {
        return this.pluginList;
    }

    public int getPluginSize() {
        return this.pluginList.size();
    }

    public abstract int getRelativeLayoutId();

    public abstract void initLogic(LiveConfig liveConfig, boolean z);

    public boolean isLandscape() {
        Log.m105924i("BaseLivePluginLayout", "isLandscape orientation: " + getContext().getResources().getConfiguration().orientation + " context: " + getContext() + "  hashCode: " + getContext().getResources().getConfiguration().hashCode() + " configuration: " + getContext().getResources().getConfiguration());
        return getContext().getResources().getConfiguration().orientation == 2;
    }

    public boolean isLiving() {
        return true;
    }

    public void keyboardChange(boolean z, int i) {
        for (C58121a h0 : this.pluginList) {
            h0.mo8378h0(z, i);
        }
    }

    public void mount() {
        for (C58121a i0 : this.pluginList) {
            i0.mo8357i0();
        }
    }

    public String name() {
        return getClass().getSimpleName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        for (C58121a k0 : this.pluginList) {
            k0.mo8400k0(i, i2, intent);
        }
    }

    public boolean onBackPress() {
        for (C58121a aVar : this.pluginList) {
            if (aVar.mo3207l0()) {
                String name = name();
                Log.m105924i(name, aVar.mo82894j0() + " handle back-press");
                return true;
            }
        }
        return false;
    }

    public abstract void onCallStateChanged(int i, String str);

    public void onCloseLiveMicNotify() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        for (C58121a p0 : this.pluginList) {
            p0.mo8379p0(i, strArr, iArr);
        }
    }

    public abstract void onRotationSwitchChange(boolean z);

    public boolean onSwipeBack() {
        for (C58121a aVar : this.pluginList) {
            if (aVar.mo82896q0()) {
                String name = name();
                Log.m105924i(name, aVar.mo82894j0() + " handle onSwipeBack");
                return true;
            }
        }
        return false;
    }

    public void pause() {
        for (C58121a r0 : this.pluginList) {
            r0.mo8358r0();
        }
    }

    public void registerPlugin(C58121a aVar) {
        if (aVar != null) {
            String name = name();
            Log.m105924i(name, "register plugin " + aVar.mo82894j0());
            this.pluginList.add(aVar);
        }
    }

    public void resume() {
        setVisibility(0);
        for (C58121a s0 : this.pluginList) {
            s0.mo3209s0();
        }
    }

    public final void setParent(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "<set-?>");
        this.parent = viewGroup;
    }

    public void start() {
        for (C58121a t0 : this.pluginList) {
            t0.mo82897t0();
        }
    }

    public void statusChange(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        for (C58121a u0 : this.pluginList) {
            u0.mo3210u0(bVar, bundle);
        }
    }

    public void stop() {
        for (C58121a v0 : this.pluginList) {
            v0.mo12287v0();
        }
    }

    public void unMount() {
        for (C58121a w0 : this.pluginList) {
            w0.mo3211w0();
        }
    }
}
