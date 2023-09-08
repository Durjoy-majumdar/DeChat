package en3;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import java.util.HashSet;

/* renamed from: en3.g */
public final class C75628g {

    /* renamed from: a */
    public float f222172a;

    /* renamed from: b */
    public float f222173b;

    /* renamed from: c */
    public final int f222174c;

    /* renamed from: d */
    public final int f222175d;

    /* renamed from: e */
    public boolean f222176e;

    /* renamed from: f */
    public boolean f222177f;

    /* renamed from: g */
    public boolean f222178g;

    /* renamed from: h */
    public int f222179h;

    /* renamed from: i */
    public boolean f222180i = true;

    /* renamed from: j */
    public final Runnable f222181j = new C75629a(this);

    /* renamed from: k */
    public final HashSet<C75627f> f222182k = new HashSet<>();

    /* renamed from: en3.g$a */
    public static final class C75629a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C75628g f222183d;

        public C75629a(C75628g gVar) {
            this.f222183d = gVar;
        }

        public final void run() {
            Log.m105918d("MicroMsg.GalleryScrollHelper", "MSG_STORY_LONG_PRESS_CHECK");
            C75628g gVar = this.f222183d;
            if (gVar.f222180i) {
                gVar.getClass();
            }
        }
    }

    public C75628g(Context context) {
        C87412m.m108594g(context, "context");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f222174c = ViewConfiguration.getLongPressTimeout() + 100;
        this.f222175d = viewConfiguration.getScaledTouchSlop();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0044, code lost:
        if (r2 != 3) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0077  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo105976a(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "dispatchTouchEvent "
            r0.append(r1)
            int r1 = r6.getAction()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r1 = r6.getX()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            float r1 = r6.getY()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.GalleryScrollHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            int r0 = r5.f222179h
            int r2 = r6.getActionMasked()
            r3 = 1
            if (r2 == r3) goto L_0x0063
            r4 = 2
            if (r2 == r4) goto L_0x0047
            r1 = 3
            if (r2 == r1) goto L_0x0063
            goto L_0x0065
        L_0x0047:
            boolean r0 = r5.f222178g
            r3 = r3 ^ r0
            int r0 = r5.f222179h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "scrollType "
            r2.append(r4)
            int r4 = r5.f222179h
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
            goto L_0x0065
        L_0x0063:
            r0 = 15
        L_0x0065:
            boolean r1 = r5.f222176e
            if (r1 != 0) goto L_0x0093
            if (r3 == 0) goto L_0x0093
            java.util.HashSet<en3.f> r2 = r5.f222182k
            java.util.Iterator r2 = r2.iterator()
        L_0x0071:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0093
            java.lang.Object r3 = r2.next()
            en3.f r3 = (en3.C75627f) r3
            if (r1 == 0) goto L_0x0080
            goto L_0x0093
        L_0x0080:
            boolean r4 = r5.f222177f
            if (r4 == 0) goto L_0x008b
            int r4 = r3.mo105975b()
            r4 = r4 & r0
            if (r4 == 0) goto L_0x0071
        L_0x008b:
            boolean r4 = r5.f222177f
            boolean r3 = r3.mo105974a(r6, r4, r0)
            r1 = r1 | r3
            goto L_0x0071
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: en3.C75628g.mo105976a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public final void mo105977b(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked != 0) {
            int i = 1;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f = this.f222173b;
                    float f2 = x - f;
                    float f3 = y - this.f222172a;
                    if (!this.f222177f) {
                        if (Math.abs(x - f) > ((float) this.f222175d) || Math.abs(y - this.f222172a) > ((float) this.f222175d)) {
                            z = true;
                        }
                        this.f222177f = z;
                    }
                    if (this.f222177f) {
                        MMHandlerThread.removeRunnable(this.f222181j);
                        if (this.f222179h == 0) {
                            if (Math.abs(f3) <= Math.abs(f2)) {
                                i = f2 < 0.0f ? 4 : 8;
                            } else if (f3 >= 0.0f) {
                                i = 2;
                            }
                            this.f222179h = i;
                        }
                    }
                    Log.m105918d("MicroMsg.GalleryScrollHelper", "scrollType " + this.f222179h + " move: " + f2 + ", " + f3);
                    return;
                } else if (actionMasked != 3) {
                    return;
                }
            }
            MMHandlerThread.removeRunnable(this.f222181j);
            this.f222179h = 0;
            this.f222178g = true;
            return;
        }
        this.f222173b = motionEvent.getX();
        this.f222172a = motionEvent.getY();
        this.f222176e = false;
        this.f222177f = false;
        this.f222178g = false;
        this.f222179h = 0;
        MMHandlerThread.postToMainThreadDelayed(this.f222181j, (long) this.f222174c);
        Log.m105918d("MicroMsg.GalleryScrollHelper", "downX:" + this.f222173b + "  downY:" + this.f222172a);
    }
}
