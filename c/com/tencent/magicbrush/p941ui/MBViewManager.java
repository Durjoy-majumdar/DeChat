package com.tencent.magicbrush.p941ui;

import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import p748xd.C91170c;
import rx3.C13598b0;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b'\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u0019J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0016\u0010\u001e\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR0\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0 j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b`!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, mo182094d2 = {"Lcom/tencent/magicbrush/ui/MBViewManager;", "", "Lcom/tencent/magicbrush/ui/MagicBrushView$c;", "l", "Lrx3/b0;", "addSurfaceListenerForAllViews", "Lcom/tencent/magicbrush/ui/MBViewManager$a;", "addListener", "removeListener", "", "virtualElementId", "Lcom/tencent/magicbrush/ui/MagicBrushView;", "findOrNull", "find", "view", "add$lib_magicbrush_nano_release", "(Lcom/tencent/magicbrush/ui/MagicBrushView;)V", "add", "fromId", "(Lcom/tencent/magicbrush/ui/MagicBrushView;I)V", "remove$lib_magicbrush_nano_release", "remove", "clear$lib_magicbrush_nano_release", "()V", "clear", "Lkotlin/Function1;", "fn", "forEach", "", "toString", "idGenerator", "I", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "viewContainer", "Ljava/util/HashMap;", "Lxd/c;", "listeners", "Lxd/c;", "<init>", "a", "lib-magicbrush-nano_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
/* renamed from: com.tencent.magicbrush.ui.MBViewManager */
public final class MBViewManager {
    private int idGenerator;
    private final C91170c<C80314a> listeners = new C91170c<>();
    private final HashMap<Integer, MagicBrushView> viewContainer = new HashMap<>();

    /* renamed from: com.tencent.magicbrush.ui.MBViewManager$a */
    public interface C80314a {
        /* renamed from: a */
        void mo111627a(MagicBrushView magicBrushView);

        /* renamed from: b */
        void mo111628b(MagicBrushView magicBrushView);
    }

    /* renamed from: com.tencent.magicbrush.ui.MBViewManager$b */
    public static final class C80315b extends C87413o implements C32226l<C80314a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MagicBrushView f235122d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80315b(MagicBrushView magicBrushView) {
            super(1);
            this.f235122d = magicBrushView;
        }

        public Object invoke(Object obj) {
            C80314a aVar = (C80314a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            aVar.mo111628b(this.f235122d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.magicbrush.ui.MBViewManager$c */
    public static final class C80316c implements C80314a {

        /* renamed from: a */
        public final /* synthetic */ MagicBrushView.C80321c f235123a;

        public C80316c(MagicBrushView.C80321c cVar) {
            this.f235123a = cVar;
        }

        /* renamed from: a */
        public void mo111627a(MagicBrushView magicBrushView) {
            C87412m.m108594g(magicBrushView, "v");
        }

        /* renamed from: b */
        public void mo111628b(MagicBrushView magicBrushView) {
            C87412m.m108594g(magicBrushView, "v");
            MagicBrushView.C80321c cVar = this.f235123a;
            C87412m.m108594g(cVar, "l");
            magicBrushView.f235131h.mo125229a(cVar);
        }
    }

    /* renamed from: com.tencent.magicbrush.ui.MBViewManager$d */
    public static final class C80317d extends C87413o implements C32226l<C80314a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MagicBrushView f235124d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80317d(MagicBrushView magicBrushView) {
            super(1);
            this.f235124d = magicBrushView;
        }

        public Object invoke(Object obj) {
            C80314a aVar = (C80314a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            aVar.mo111627a(this.f235124d);
            return C13598b0.f38549a;
        }
    }

    public final void add$lib_magicbrush_nano_release(MagicBrushView magicBrushView) {
        C87412m.m108594g(magicBrushView, "view");
        add$lib_magicbrush_nano_release(magicBrushView, -1);
    }

    public final void addListener(C80314a aVar) {
        C87412m.m108594g(aVar, "l");
        this.listeners.mo125229a(aVar);
    }

    public final void addSurfaceListenerForAllViews(MagicBrushView.C80321c cVar) {
        C87412m.m108594g(cVar, "l");
        this.listeners.mo125229a(new C80316c(cVar));
    }

    public final synchronized void clear$lib_magicbrush_nano_release() {
        this.viewContainer.clear();
        this.listeners.mo125230b();
    }

    public final synchronized MagicBrushView find(int i) {
        MagicBrushView magicBrushView;
        magicBrushView = this.viewContainer.get(Integer.valueOf(i));
        C87412m.m108591d(magicBrushView);
        return magicBrushView;
    }

    public final synchronized MagicBrushView findOrNull(int i) {
        return this.viewContainer.get(Integer.valueOf(i));
    }

    public final void forEach(C32226l<? super MagicBrushView, C13598b0> lVar) {
        C87412m.m108594g(lVar, "fn");
        ArrayList<Object> arrayList = new ArrayList<>();
        synchronized (this) {
            for (MagicBrushView next : this.viewContainer.values()) {
                C87412m.m108593f(next, "v");
                arrayList.add(next);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        for (Object invoke : arrayList) {
            lVar.invoke(invoke);
        }
    }

    public final void remove$lib_magicbrush_nano_release(MagicBrushView magicBrushView) {
        C87412m.m108594g(magicBrushView, "view");
        synchronized (this) {
            int virtualElementId = magicBrushView.getVirtualElementId();
            if (this.viewContainer.containsKey(Integer.valueOf(virtualElementId))) {
                MagicBrushView remove = this.viewContainer.remove(Integer.valueOf(virtualElementId));
            } else {
                String format = String.format("VirtualElementId error. current [%s] request [%d]", Arrays.copyOf(new Object[]{toString(), Integer.valueOf(virtualElementId)}, 2));
                C87412m.m108593f(format, "format(this, *args)");
                throw new IllegalStateException(format.toString());
            }
        }
        this.listeners.mo125231c(new C80317d(magicBrushView));
    }

    public final void removeListener(C80314a aVar) {
        C87412m.m108594g(aVar, "l");
        C91170c<C80314a> cVar = this.listeners;
        synchronized (cVar.f261403a) {
            ((ArrayList) cVar.f261403a).remove(aVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ViewManager(");
        sb.append(hashCode());
        sb.append(")");
        synchronized (this) {
            Set<Integer> keySet = this.viewContainer.keySet();
            C87412m.m108593f(keySet, "viewContainer.keys");
            sb.append(C110818d0.m150952x0(keySet));
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "result.toString()");
        return sb4;
    }

    public final void add$lib_magicbrush_nano_release(MagicBrushView magicBrushView, int i) {
        C87412m.m108594g(magicBrushView, "view");
        synchronized (this) {
            if (i < 0) {
                try {
                    i = this.idGenerator;
                    this.idGenerator = i + 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.viewContainer.put(Integer.valueOf(i), magicBrushView);
            C13598b0 b0Var = C13598b0.f38549a;
        }
        magicBrushView.setVirtualElementId$lib_magicbrush_nano_release(i);
        this.listeners.mo125231c(new C80315b(magicBrushView));
    }
}
