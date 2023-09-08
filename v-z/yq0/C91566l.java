package yq0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import br0.C79774c;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gt0.C87330d0;
import gt0.C87347g;
import gt0.C87374n0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p224ra.C12964b;
import p225rc.C89923l;
import te3.C90437rw3;
import wq0.C91073k;
import wq0.C91087x;

/* renamed from: yq0.l */
public interface C91566l extends C91073k, C87374n0 {

    /* renamed from: yq0.l$a */
    public static final class C91567a {

        /* renamed from: a */
        public static final C91568a f262418a = new C91568a();

        /* renamed from: yq0.l$a$a */
        public static final class C91568a implements C91569b {
            /* renamed from: e5 */
            public C91566l mo115879e5(C81879g gVar, C91570c cVar, List<? extends C90437rw3> list) {
                C79774c cVar2;
                C87347g gVar2;
                C91565k kVar;
                T t;
                T t2;
                C87412m.m108594g(gVar, "component");
                C87412m.m108594g(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                AppBrandRuntime runtime = gVar.getRuntime();
                if (runtime == null || (cVar2 = runtime.mo113054f0()) == null) {
                    cVar2 = gVar.mo114271f0();
                }
                C87412m.m108591d(cVar2);
                Context context = gVar.getContext();
                if (context == null) {
                    context = MMApplicationContext.getContext();
                }
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        kVar = null;
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (C87412m.m108589b("scope.bluetooth", ((C90437rw3) t).f259822d)) {
                            break;
                        }
                    }
                    boolean z = false;
                    boolean z2 = t != null;
                    Iterator<T> it4 = list.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it4.next();
                        if (C87412m.m108589b("scope.bluetoothBackground", ((C90437rw3) t2).f259822d)) {
                            break;
                        }
                    }
                    if (t2 != null) {
                        z = true;
                    }
                    if (z2) {
                        kVar = new C91565k(this, z);
                    }
                    if (kVar != null) {
                        C87412m.m108593f(context, "context");
                        gVar2 = new C91087x(context, cVar2, cVar, kVar);
                        if ((!C89923l.f258408a.mo117502h()) && cVar2.isLargeScreenWindow()) {
                            gVar2.mo121757e(1);
                        }
                        return gVar2;
                    }
                }
                Context context2 = gVar.getContext();
                if (context2 == null) {
                    context2 = MMApplicationContext.getContext();
                }
                C87412m.m108593f(context2, "component.context ?: MMA…ationContext.getContext()");
                gVar2 = new C87347g(context2, cVar2, cVar);
                gVar2.mo121757e(1);
                return gVar2;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r0 = r0.mo115879e5(r1, r2, r3);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final yq0.C91566l m114904a(com.tencent.p014mm.plugin.appbrand.C81879g r1, yq0.C91566l.C91570c r2, java.util.List<? extends te3.C90437rw3> r3) {
            /*
                java.lang.String r0 = "component"
                gy3.C87412m.m108594g(r1, r0)
                java.lang.String r0 = "listener"
                gy3.C87412m.m108594g(r2, r0)
                java.lang.Class<yq0.l$b> r0 = yq0.C91566l.C91569b.class
                ra.b r0 = r1.mo109668l(r0)
                yq0.l$b r0 = (yq0.C91566l.C91569b) r0
                if (r0 == 0) goto L_0x001a
                yq0.l r0 = r0.mo115879e5(r1, r2, r3)
                if (r0 != 0) goto L_0x0020
            L_0x001a:
                yq0.l$a$a r0 = f262418a
                yq0.l r0 = r0.mo115879e5(r1, r2, r3)
            L_0x0020:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: yq0.C91566l.C91567a.m114904a(com.tencent.mm.plugin.appbrand.g, yq0.l$c, java.util.List):yq0.l");
        }
    }

    /* renamed from: yq0.l$b */
    public interface C91569b extends C12964b {
        /* renamed from: e5 */
        C91566l mo115879e5(C81879g gVar, C91570c cVar, List<? extends C90437rw3> list);
    }

    /* renamed from: yq0.l$c */
    public interface C91570c {

        /* renamed from: yq0.l$c$a */
        public static final class C91571a {
            /* renamed from: a */
            public static /* synthetic */ void m114908a(C91570c cVar, int i, ArrayList arrayList, int i2, boolean z, int i3, Object obj) {
                if (obj == null) {
                    if ((i3 & 4) != 0) {
                        i2 = 0;
                    }
                    if ((i3 & 8) != 0) {
                        z = false;
                    }
                    cVar.mo114536a(i, arrayList, i2, z);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onMsg");
            }
        }

        /* renamed from: a */
        void mo114536a(int i, ArrayList<String> arrayList, int i2, boolean z);
    }

    MotionEvent getLastPointerDownTouchEvent();

    void setAppBrandName(String str);

    void setApplyWording(String str);

    void setExplainOnClickListener(View.OnClickListener onClickListener);

    void setFunctionButtonOnClickListener(View.OnClickListener onClickListener);

    void setFunctionButtonText(String str);

    void setFunctionButtonTextColor(int i);

    void setFunctionButtonVisibility(int i);

    void setIconUrl(String str);

    void setItemCheckedListener(C87330d0.C87332b bVar);

    void setNegativeButtonText(String str);

    void setOnListItemLongClickListener(C87330d0.C87333c cVar);

    void setPositiveButtonText(String str);

    void setRequestDesc(String str);

    void setScope(String str);

    void setSelectListItem(List<C87330d0.C87331a> list);

    void setSimpleDetailDesc(String str);

    /* renamed from: t */
    void mo121473t(boolean z);
}
