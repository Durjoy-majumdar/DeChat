package com.tencent.p014mm.plugin.finder.live.controller.base;

import android.view.ViewGroup;
import androidx.lifecycle.C39622i0;
import gy3.C87412m;
import kotlin.Metadata;
import te3.C48742ao0;
import te3.C52005xq0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomController;", "Landroidx/lifecycle/i0;", "", "T", "Ljava/lang/Class;", "bu", "business", "(Ljava/lang/Class;)Landroidx/lifecycle/i0;", "ctrl", "controller", "(Ljava/lang/Class;)Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomController;", "Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;", "store", "Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;", "getStore", "()Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;", "<init>", "(Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;)V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController */
public abstract class LiveRoomController extends C39622i0 {
    private final LiveRoomControllerStore store;

    public LiveRoomController(LiveRoomControllerStore liveRoomControllerStore) {
        C87412m.m108594g(liveRoomControllerStore, "store");
        this.store = liveRoomControllerStore;
    }

    public void afterViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
    }

    public final <T extends C39622i0> T business(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        return this.store.business(cls);
    }

    public final <T extends LiveRoomController> T controller(Class<T> cls) {
        C87412m.m108594g(cls, "ctrl");
        return this.store.controller(cls);
    }

    public final LiveRoomControllerStore getStore() {
        return this.store;
    }

    public String name() {
        return getClass().getSimpleName();
    }

    public void onFloatMode() {
    }

    public abstract /* synthetic */ void onLiveActivate();

    public abstract /* synthetic */ void onLiveDeactivate();

    public void onLiveEnd() {
    }

    public void onLiveMsg(C48742ao0 ao02) {
    }

    public void onLivePause() {
    }

    public void onLiveResume() {
    }

    public void onLiveStart(C52005xq0 xq02) {
    }

    public void onLiveStartFromWindow() {
    }

    public void onNormalMode() {
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
    }
}
