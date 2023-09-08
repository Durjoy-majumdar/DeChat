package com.tencent.matrix.lifecycle.supervisor;

import android.content.Context;
import android.os.Process;
import com.tencent.matrix.lifecycle.C28660i;
import com.tencent.matrix.lifecycle.C80406g;
import com.tencent.matrix.lifecycle.C80407h;
import com.tencent.matrix.lifecycle.IStatefulOwner;
import com.tencent.matrix.lifecycle.MultiSourceStatefulOwner;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import p723vf.C90779e;
import sx3.C36907w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0010\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB1\u0012\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/DispatcherStateOwner;", "Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;", "Lcom/tencent/matrix/lifecycle/g;", "Lrx3/b0;", "dispatchOn", "dispatchOff", "", "toString", "Lcom/tencent/matrix/lifecycle/h;", "attachedObserver", "Lcom/tencent/matrix/lifecycle/h;", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "attachedSource", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "getAttachedSource", "()Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lkotlin/Function1;", "", "Lcom/tencent/matrix/lifecycle/i;", "", "reduceOperator", "<init>", "(Lfy3/l;Lcom/tencent/matrix/lifecycle/IStatefulOwner;Ljava/lang/String;)V", "Companion", "a", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public class DispatcherStateOwner extends MultiSourceStatefulOwner implements C80406g {
    public static final C80455a Companion = new C80455a((C8480h) null);
    /* access modifiers changed from: private */
    public static final ConcurrentHashMap<String, DispatcherStateOwner> dispatchOwners = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */
    public C80407h attachedObserver;
    private final IStatefulOwner attachedSource;
    private final String name;

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner$a */
    public static final class C80455a {
        public C80455a(C8480h hVar) {
        }

        /* renamed from: a */
        public final ProcessToken[] mo111973a(Context context) {
            C87412m.m108594g(context, "context");
            Collection<DispatcherStateOwner> values = DispatcherStateOwner.dispatchOwners.values();
            C87412m.m108593f(values, "dispatchOwners.values");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(values, 10));
            for (DispatcherStateOwner dispatcherStateOwner : values) {
                String name = dispatcherStateOwner.getName();
                boolean active = dispatcherStateOwner.getAttachedSource().active();
                C87412m.m108594g(name, "statefulName");
                int myPid = Process.myPid();
                String a = C90779e.m113846a(context);
                C87412m.m108593f(a, "MatrixUtil.getProcessName(context)");
                arrayList.add(new ProcessToken(myPid, a, name, active));
            }
            Object[] array = arrayList.toArray(new ProcessToken[0]);
            if (array != null) {
                return (ProcessToken[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DispatcherStateOwner(C32226l<? super Collection<? extends C28660i>, Boolean> lVar, IStatefulOwner iStatefulOwner, String str) {
        super(lVar, new IStatefulOwner[0]);
        C87412m.m108594g(lVar, "reduceOperator");
        C87412m.m108594g(iStatefulOwner, "attachedSource");
        C87412m.m108594g(str, "name");
        this.attachedSource = iStatefulOwner;
        this.name = str;
        dispatchOwners.put(str, this);
    }

    /* access modifiers changed from: private */
    public final void dispatchOff() {
        turnOff();
    }

    /* access modifiers changed from: private */
    public final void dispatchOn() {
        turnOn();
    }

    public final IStatefulOwner getAttachedSource() {
        return this.attachedSource;
    }

    public final String getName() {
        return this.name;
    }

    public boolean serial() {
        return true;
    }

    public String toString() {
        return "DispatcherStateOwner_" + this.name;
    }
}
