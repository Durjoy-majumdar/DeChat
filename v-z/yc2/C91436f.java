package yc2;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.sdk.event.IEvent;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: yc2.f */
public final class C91436f {

    /* renamed from: a */
    public static final Map<View, Class<? extends IEvent>> f262159a = new WeakHashMap();

    /* renamed from: b */
    public static final Map<View, Boolean> f262160b = new WeakHashMap();

    /* renamed from: yc2.f$a */
    public static final class C91437a implements View.OnClickListener {

        /* renamed from: d */
        public final View.OnClickListener f262161d;

        public C91437a(View.OnClickListener onClickListener) {
            this.f262161d = onClickListener;
        }

        /* JADX WARNING: CFG modification limit reached, blocks count: 142 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.lang.String r0 = "com/tencent/mm/plugin/normsg/utils/ClickBotCheckHelper$CheckerOnClickListener"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r4.add(r8)
                java.lang.Object[] r5 = r4.toArray()
                r4.clear()
                r4 = r7
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                java.util.Map<android.view.View, java.lang.Class<? extends com.tencent.mm.sdk.event.IEvent>> r0 = yc2.C91436f.f262159a
                monitor-enter(r0)
                r1 = r0
                java.util.WeakHashMap r1 = (java.util.WeakHashMap) r1     // Catch:{ all -> 0x008c }
                boolean r1 = r1.containsKey(r8)     // Catch:{ all -> 0x008c }
                if (r1 != 0) goto L_0x002a
                monitor-exit(r0)     // Catch:{ all -> 0x008c }
                goto L_0x0072
            L_0x002a:
                java.util.Map<android.view.View, java.lang.Boolean> r1 = yc2.C91436f.f262160b     // Catch:{ all -> 0x008c }
                monitor-enter(r1)     // Catch:{ all -> 0x008c }
                r2 = r1
                java.util.WeakHashMap r2 = (java.util.WeakHashMap) r2     // Catch:{ all -> 0x0088 }
                boolean r2 = r2.containsKey(r8)     // Catch:{ all -> 0x0088 }
                if (r2 != 0) goto L_0x006a
                r2 = r0
                java.util.WeakHashMap r2 = (java.util.WeakHashMap) r2     // Catch:{ all -> 0x0088 }
                java.lang.Object r2 = r2.get(r8)     // Catch:{ all -> 0x0088 }
                java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x0088 }
                if (r2 == 0) goto L_0x0070
                java.lang.Object r3 = r2.newInstance()     // Catch:{ all -> 0x004b }
                com.tencent.mm.sdk.event.IEvent r3 = (com.tencent.p014mm.sdk.event.IEvent) r3     // Catch:{ all -> 0x004b }
                r3.publish()     // Catch:{ all -> 0x004b }
                goto L_0x0070
            L_0x004b:
                r3 = move-exception
                java.lang.String r4 = "MicroMsg.CBCH"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0088 }
                r5.<init>()     // Catch:{ all -> 0x0088 }
                java.lang.String r6 = "failure to instantiate event class: "
                r5.append(r6)     // Catch:{ all -> 0x0088 }
                java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x0088 }
                r5.append(r2)     // Catch:{ all -> 0x0088 }
                java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0088 }
                r5 = 0
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0088 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r3, r2, r5)     // Catch:{ all -> 0x0088 }
                goto L_0x0070
            L_0x006a:
                r2 = r1
                java.util.WeakHashMap r2 = (java.util.WeakHashMap) r2     // Catch:{ all -> 0x0088 }
                r2.remove(r8)     // Catch:{ all -> 0x0088 }
            L_0x0070:
                monitor-exit(r1)     // Catch:{ all -> 0x0088 }
                monitor-exit(r0)     // Catch:{ all -> 0x008c }
            L_0x0072:
                android.view.View$OnClickListener r0 = r7.f262161d
                if (r0 == 0) goto L_0x0079
                r0.onClick(r8)
            L_0x0079:
                java.lang.String r8 = "com/tencent/mm/plugin/normsg/utils/ClickBotCheckHelper$CheckerOnClickListener"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            L_0x0086:
                monitor-exit(r1)     // Catch:{ all -> 0x0088 }
                throw r8     // Catch:{ all -> 0x008c }
            L_0x0088:
                r8 = move-exception
                goto L_0x0086
            L_0x008a:
                monitor-exit(r0)     // Catch:{ all -> 0x008c }
                throw r8
            L_0x008c:
                r8 = move-exception
                goto L_0x008a
            */
            throw new UnsupportedOperationException("Method not decompiled: yc2.C91436f.C91437a.onClick(android.view.View):void");
        }
    }

    /* renamed from: yc2.f$b */
    public static final class C91438b implements View.OnTouchListener {

        /* renamed from: d */
        public final View.OnTouchListener f262162d;

        public C91438b(View.OnTouchListener onTouchListener) {
            this.f262162d = onTouchListener;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/normsg/utils/ClickBotCheckHelper$CheckerOnTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            Map<View, Class<? extends IEvent>> map = C91436f.f262159a;
            synchronized (map) {
                if (((WeakHashMap) map).containsKey(view)) {
                    Map<View, Boolean> map2 = C91436f.f262160b;
                    synchronized (map2) {
                        ((WeakHashMap) map2).put(view, Boolean.TRUE);
                    }
                }
            }
            View.OnTouchListener onTouchListener = this.f262162d;
            if (onTouchListener != null) {
                boolean onTouch = onTouchListener.onTouch(view, motionEvent);
                C117292a.m165362h(onTouch, this, "com/tencent/mm/plugin/normsg/utils/ClickBotCheckHelper$CheckerOnTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return onTouch;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/normsg/utils/ClickBotCheckHelper$CheckerOnTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }
}
