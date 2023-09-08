package com.tencent.p014mm.sdk.event;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39630m0;
import androidx.lifecycle.C54209k0;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/sdk/event/MvvmEventCenter;", "", "()V", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.event.MvvmEventCenter */
public final class MvvmEventCenter {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Mvvm.MvvmEventCenter";
    public static final String THREAD_TAG = "Mvvm.MvvmEventCenter";
    /* access modifiers changed from: private */
    public static final C39630m0 store = new C39630m0();

    public static final <T extends C39622i0> T getEvent(Class<T> cls) {
        return Companion.getEvent(cls);
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0002H\b¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\u0004\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/sdk/event/MvvmEventCenter$Companion;", "", "Landroidx/lifecycle/i0;", "T", "getEvent", "()Landroidx/lifecycle/i0;", "Ljava/lang/Class;", "eventClass", "(Ljava/lang/Class;)Landroidx/lifecycle/i0;", "", "TAG", "Ljava/lang/String;", "THREAD_TAG", "Landroidx/lifecycle/m0;", "store", "Landroidx/lifecycle/m0;", "<init>", "()V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.sdk.event.MvvmEventCenter$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        public final <T extends C39622i0> T getEvent(Class<T> cls) {
            C87412m.m108594g(cls, "eventClass");
            T a = new C54209k0(MvvmEventCenter.store, (C54209k0.C54210b) new MvvmEventCenter$Companion$getEvent$1()).mo75002a(cls);
            C87412m.m108593f(a, "ViewModelProvider(store,…       }).get(eventClass)");
            return a;
        }

        public final <T extends C39622i0> T getEvent() {
            C87412m.m108602o();
            throw null;
        }
    }
}
