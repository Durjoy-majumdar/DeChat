package p91;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: p91.a */
public final class C62209a implements C100693b {

    /* renamed from: a */
    public WeakReference<RecyclerView> f176844a;

    /* renamed from: b */
    public Field f176845b;

    /* renamed from: c */
    public Field f176846c;

    /* renamed from: d */
    public Method f176847d;

    /* renamed from: e */
    public Method f176848e;

    /* renamed from: f */
    public Method f176849f;

    /* renamed from: g */
    public Method f176850g;

    /* renamed from: h */
    public Method f176851h;

    public C62209a() {
        Log.m105928w("HABBYGE-MALI.FinderFeedParamsCatcher", "FinderFeedParamsCatcher");
        Class<WxRecyclerAdapter> cls = WxRecyclerAdapter.class;
        try {
            int i = WxRecyclerAdapter.f165734F;
            Field declaredField = cls.getDeclaredField("data");
            this.f176845b = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = BaseFinderFeed.class.getDeclaredField("feedObject");
            this.f176846c = declaredField2;
            declaredField2.setAccessible(true);
            Class<FeedData> cls2 = FeedData.class;
            FeedData.C56323a aVar = FeedData.Companion;
            Method declaredMethod = cls2.getDeclaredMethod("getId", new Class[0]);
            this.f176847d = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls2.getDeclaredMethod("getUserName", new Class[0]);
            this.f176848e = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = cls2.getDeclaredMethod("getNickName", new Class[0]);
            this.f176849f = declaredMethod3;
            declaredMethod3.setAccessible(true);
            Method declaredMethod4 = cls2.getDeclaredMethod("getLikeCount", new Class[0]);
            this.f176850g = declaredMethod4;
            declaredMethod4.setAccessible(true);
            Method declaredMethod5 = cls2.getDeclaredMethod("getCommentCount", new Class[0]);
            this.f176851h = declaredMethod5;
            declaredMethod5.setAccessible(true);
        } catch (Throwable th) {
            Log.printErrStackTrace("HABBYGE-MALI.FinderFeedParamsCatcher", th, "reflect crash: %s", th.getMessage());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("HABBYGE-MALI.FinderFeedParamsCatcher", r5, "getFeedUserName crash-1: %s", r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0041 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo87288a(android.view.View r5, int r6) {
        /*
            r4 = this;
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r5 = r4.f176844a
            r0 = 0
            if (r5 != 0) goto L_0x0006
            return r0
        L_0x0006:
            java.lang.Object r5 = r5.get()
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 != 0) goto L_0x000f
            return r0
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView$e r5 = r5.getAdapter()
            java.lang.String r1 = "HABBYGE-MALI.FinderFeedParamsCatcher"
            if (r5 != 0) goto L_0x001d
            java.lang.String r5 = "getFeedUserName, RecyclerView.Adapter == NULL !?"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r5)
            return r0
        L_0x001d:
            r2 = 0
            java.lang.reflect.Field r3 = r4.f176845b     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r5 = r3.get(r5)     // Catch:{ Exception -> 0x0041 }
            if (r5 != 0) goto L_0x0027
            return r0
        L_0x0027:
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ Exception -> 0x0041 }
            if (r5 != 0) goto L_0x0030
            return r0
        L_0x0030:
            java.lang.reflect.Field r6 = r4.f176846c     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ Exception -> 0x0041 }
            java.lang.reflect.Method r6 = r4.f176848e     // Catch:{ Exception -> 0x0041 }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r5 = r6.invoke(r5, r3)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0041 }
            return r5
        L_0x0041:
            throw r0     // Catch:{ Exception -> 0x0042 }
        L_0x0042:
            r5 = move-exception
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r3 = r5.getMessage()
            r6[r2] = r3
            java.lang.String r2 = "getFeedUserName crash-1: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r2, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p91.C62209a.mo87288a(android.view.View, int):java.lang.String");
    }

    /* renamed from: b */
    public void mo87289b(View view, PInt pInt, PInt pInt2, int i) {
        RecyclerView recyclerView;
        Object obj;
        pInt.value = 0;
        pInt2.value = 0;
        WeakReference<RecyclerView> weakReference = this.f176844a;
        if (weakReference != null && (recyclerView = weakReference.get()) != null) {
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            if (adapter == null) {
                Log.m105920e("HABBYGE-MALI.FinderFeedParamsCatcher", "getFeedInfo, RecyclerView.Adapter==NULL !!");
                return;
            }
            try {
                Object obj2 = this.f176845b.get(adapter);
                if (obj2 != null && (obj = ((ArrayList) obj2).get(i)) != null) {
                    Object obj3 = this.f176846c.get(obj);
                    pInt.value = ((Integer) this.f176850g.invoke(obj3, new Object[0])).intValue();
                    pInt2.value = ((Integer) this.f176851h.invoke(obj3, new Object[0])).intValue();
                }
            } catch (Exception unused) {
                throw null;
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.FinderFeedParamsCatcher", e, "getFeedInfo crash-1: %s", e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public boolean mo87290c(View view, int i) {
        return false;
    }

    /* renamed from: d */
    public String mo87291d(int i) {
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:11|12|13|14|(2:16|31)(2:17|(1:33)(2:21|(2:23|34)(2:24|(2:26|35)(2:27|29))))) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0023 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b A[Catch:{ Exception -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002c A[Catch:{ Exception -> 0x005e }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo87292e(android.view.View r3, int r4) {
        /*
            r2 = this;
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r3 = r2.f176844a
            java.lang.String r0 = "HABBYGE-MALI.FinderFeedParamsCatcher"
            r1 = 0
            if (r3 != 0) goto L_0x000d
            java.lang.String r3 = "getFeedId, mRecyclerView == NULL !?"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
            return r1
        L_0x000d:
            java.lang.Object r3 = r3.get()
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            if (r3 != 0) goto L_0x0016
            return r1
        L_0x0016:
            androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
            if (r3 != 0) goto L_0x0022
            java.lang.String r3 = "getFeedId, RecyclerView.Adapter == NULL !?"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
            return r1
        L_0x0022:
            throw r1     // Catch:{ Exception -> 0x0023 }
        L_0x0023:
            java.lang.reflect.Field r0 = r2.f176845b     // Catch:{ Exception -> 0x005e }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ Exception -> 0x005e }
            if (r3 != 0) goto L_0x002c
            goto L_0x005e
        L_0x002c:
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ Exception -> 0x005e }
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x005e }
            if (r0 != 0) goto L_0x005e
            r0 = -1
            if (r4 <= r0) goto L_0x005e
            int r0 = r3.size()     // Catch:{ Exception -> 0x005e }
            if (r4 < r0) goto L_0x003e
            goto L_0x005e
        L_0x003e:
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x005e }
            if (r3 != 0) goto L_0x0045
            goto L_0x005e
        L_0x0045:
            java.lang.reflect.Field r4 = r2.f176846c     // Catch:{ Exception -> 0x005e }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ Exception -> 0x005e }
            java.lang.reflect.Method r4 = r2.f176847d     // Catch:{ Exception -> 0x005e }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x005e }
            java.lang.Object r3 = r4.invoke(r3, r0)     // Catch:{ Exception -> 0x005e }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ Exception -> 0x005e }
            long r3 = r3.longValue()     // Catch:{ Exception -> 0x005e }
            java.lang.String r1 = e91.C116711b.m164593r(r3)     // Catch:{ Exception -> 0x005e }
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p91.C62209a.mo87292e(android.view.View, int):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("HABBYGE-MALI.FinderFeedParamsCatcher", r5, "getFeedNickName crash-1: %s", r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0041 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo87293f(android.view.View r5, int r6) {
        /*
            r4 = this;
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r5 = r4.f176844a
            r0 = 0
            if (r5 != 0) goto L_0x0006
            return r0
        L_0x0006:
            java.lang.Object r5 = r5.get()
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 != 0) goto L_0x000f
            return r0
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView$e r5 = r5.getAdapter()
            java.lang.String r1 = "HABBYGE-MALI.FinderFeedParamsCatcher"
            if (r5 != 0) goto L_0x001d
            java.lang.String r5 = "getFeedUserName, RecyclerView.Adapter == NULL !?"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r5)
            return r0
        L_0x001d:
            r2 = 0
            java.lang.reflect.Field r3 = r4.f176845b     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r5 = r3.get(r5)     // Catch:{ Exception -> 0x0041 }
            if (r5 != 0) goto L_0x0027
            return r0
        L_0x0027:
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ Exception -> 0x0041 }
            if (r5 != 0) goto L_0x0030
            return r0
        L_0x0030:
            java.lang.reflect.Field r6 = r4.f176846c     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ Exception -> 0x0041 }
            java.lang.reflect.Method r6 = r4.f176849f     // Catch:{ Exception -> 0x0041 }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r5 = r6.invoke(r5, r3)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0041 }
            return r5
        L_0x0041:
            throw r0     // Catch:{ Exception -> 0x0042 }
        L_0x0042:
            r5 = move-exception
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r3 = r5.getMessage()
            r6[r2] = r3
            java.lang.String r2 = "getFeedNickName crash-1: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r2, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p91.C62209a.mo87293f(android.view.View, int):java.lang.String");
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.f176844a = new WeakReference<>(recyclerView);
    }
}
