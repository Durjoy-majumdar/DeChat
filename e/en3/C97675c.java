package en3;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.recyclerview.DynamicViewCacheExtension;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p849e3.C97602x;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: en3.c */
public final class C97675c {

    /* renamed from: a */
    public static final C13601g f286485a = C36568h.m40985a(C31632a.f84509d);

    /* renamed from: en3.c$a */
    public static final class C31632a extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C31632a f84509d = new C31632a();

        public C31632a() {
            super(0);
        }

        public Object invoke() {
            MMHandler mMHandler = new MMHandler("PreCreateViewHandler");
            mMHandler.setLogging(false);
            return mMHandler;
        }
    }

    /* renamed from: a */
    public static final RecyclerView.C16625r m125883a(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "<this>");
        Field declaredField = RecyclerView.class.getDeclaredField("e");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(recyclerView);
        C87412m.m108592e(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Recycler");
        return (RecyclerView.C16625r) obj;
    }

    /* renamed from: b */
    public static final ArrayList<RecyclerView.C16631z> m125884b(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "<this>");
        ArrayList<RecyclerView.C16631z> arrayList = new ArrayList<>();
        C97602x xVar = new C97602x(recyclerView);
        while (xVar.hasNext()) {
            RecyclerView.C16631z F0 = recyclerView.mo17021F0((View) xVar.next());
            if (F0 != null) {
                arrayList.add(F0);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static final void m125885c(RecyclerView recyclerView, C97674b bVar) {
        C87412m.m108594g(recyclerView, "<this>");
        C87412m.m108594g(bVar, "observer");
        RecyclerView.C16613e<RecyclerView.C16631z> adapter = recyclerView.getAdapter();
        if (adapter != null && !C87412m.m108589b(bVar.f286484a, adapter)) {
            bVar.mo26320a(adapter);
            bVar.f286484a = adapter;
        }
        RecyclerView.C16625r a = m125883a(recyclerView);
        C97673a aVar = new C97673a(bVar, recyclerView);
        Field declaredField = RecyclerView.C16625r.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(a, aVar);
    }

    /* renamed from: d */
    public static DynamicViewCacheExtension m125886d(RecyclerView recyclerView, int i, int i2, boolean z, C97680h hVar, MMHandler mMHandler, int i3, Object obj) {
        boolean z2 = (i3 & 4) != 0 ? true : z;
        if ((i3 & 8) != 0) {
            hVar = new C97680h();
        }
        C97680h hVar2 = hVar;
        if ((i3 & 16) != 0) {
            mMHandler = new MMHandler("AsyncBindViewHandler");
            mMHandler.setLogging(false);
        }
        MMHandler mMHandler2 = mMHandler;
        C87412m.m108594g(recyclerView, "<this>");
        C87412m.m108594g(hVar2, "viewPool");
        C87412m.m108594g(mMHandler2, "asyncHandler");
        if (Build.VERSION.SDK_INT <= 23) {
            return null;
        }
        DynamicViewCacheExtension dynamicViewCacheExtension = new DynamicViewCacheExtension(recyclerView, i, i2, z2, hVar2, mMHandler2);
        recyclerView.setViewCacheExtension(dynamicViewCacheExtension);
        return dynamicViewCacheExtension;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: com.tencent.mm.sdk.platformtools.MMHandler} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m125887e(androidx.recyclerview.widget.RecyclerView r7, java.util.List r8, en3.C97680h r9, com.tencent.p014mm.sdk.platformtools.MMHandler r10, int r11, java.lang.Object r12) {
        /*
            r12 = r11 & 2
            if (r12 == 0) goto L_0x0009
            en3.h r9 = new en3.h
            r9.<init>()
        L_0x0009:
            r5 = r9
            r9 = r11 & 4
            if (r9 == 0) goto L_0x0019
            rx3.g r9 = f286485a
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            r10 = r9
            com.tencent.mm.sdk.platformtools.MMHandler r10 = (com.tencent.p014mm.sdk.platformtools.MMHandler) r10
        L_0x0019:
            r2 = r10
            java.lang.String r9 = "<this>"
            gy3.C87412m.m108594g(r7, r9)
            java.lang.String r9 = "viewTypeCount"
            gy3.C87412m.m108594g(r8, r9)
            java.lang.String r9 = "viewPool"
            gy3.C87412m.m108594g(r5, r9)
            java.lang.String r9 = "asyncHandler"
            gy3.C87412m.m108594g(r2, r9)
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r9 > r10) goto L_0x0040
            java.lang.String r7 = "DynamicViewCacheEx"
            java.lang.String r8 = "not support below 23"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r8)
            r7 = 0
            goto L_0x0061
        L_0x0040:
            r7.setRecycledViewPool(r5)
            gy3.f0 r1 = new gy3.f0
            r1.<init>()
            gy3.a0 r4 = new gy3.a0
            r4.<init>()
            en3.d r9 = new en3.d
            r9.<init>(r7, r4, r1, r2)
            r7.post(r9)
            en3.e r9 = new en3.e
            r0 = r9
            r3 = r8
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            m125885c(r7, r9)
            r7 = 1
        L_0x0061:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: en3.C97675c.m125887e(androidx.recyclerview.widget.RecyclerView, java.util.List, en3.h, com.tencent.mm.sdk.platformtools.MMHandler, int, java.lang.Object):boolean");
    }
}
