package coil.memory;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103757e;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcoil/memory/RequestDelegate;", "Landroidx/lifecycle/e;", "<init>", "()V", "Lcoil/memory/BaseRequestDelegate;", "Lcoil/memory/ViewTargetRequestDelegate;", "coil-base_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public abstract class RequestDelegate implements C103757e {
    private RequestDelegate() {
    }

    public /* synthetic */ RequestDelegate(C8480h hVar) {
        this();
    }

    /* renamed from: a */
    public void mo146073a() {
    }

    /* renamed from: b */
    public void mo146074b() {
    }

    public /* synthetic */ void onCreate(C0125s sVar) {
    }

    public void onDestroy(C0125s sVar) {
        C87412m.m108594g(sVar, "owner");
        mo146074b();
    }

    public /* synthetic */ void onPause(C0125s sVar) {
    }

    public /* synthetic */ void onResume(C0125s sVar) {
    }

    public /* synthetic */ void onStart(C0125s sVar) {
    }

    public /* synthetic */ void onStop(C0125s sVar) {
    }
}
