package b43;

import android.view.OrientationEventListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: b43.b */
public class C104032b extends OrientationEventListener {

    /* renamed from: a */
    public int f307667a = -1;

    /* renamed from: b */
    public long f307668b = 0;

    /* renamed from: c */
    public C104033a f307669c;

    /* renamed from: b43.b$a */
    public interface C104033a {
        /* renamed from: c */
        void mo145644c(int i);
    }

    public C104032b(C104033a aVar) {
        super(MMApplicationContext.getContext());
        if (aVar != null) {
            this.f307669c = aVar;
            enable();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOrientationChanged(int r8) {
        /*
            r7 = this;
            if (r8 < 0) goto L_0x006a
            r0 = 360(0x168, float:5.04E-43)
            if (r8 <= r0) goto L_0x0008
            goto L_0x006a
        L_0x0008:
            int r0 = r7.f307667a
            int r0 = r0 - r8
            int r0 = java.lang.Math.abs(r0)
            r1 = 30
            if (r0 >= r1) goto L_0x001f
            long r2 = r7.f307668b
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
            r4 = 300(0x12c, double:1.48E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x006a
        L_0x001f:
            r7.f307667a = r8
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r7.f307668b = r2
            r0 = 330(0x14a, float:4.62E-43)
            r2 = 60
            r3 = -1
            if (r8 <= r2) goto L_0x0059
            r4 = 300(0x12c, float:4.2E-43)
            if (r8 < r4) goto L_0x0033
            goto L_0x0059
        L_0x0033:
            r5 = 150(0x96, float:2.1E-43)
            r6 = 120(0x78, float:1.68E-43)
            if (r8 < r1) goto L_0x0041
            if (r8 > r5) goto L_0x0041
            if (r8 < r2) goto L_0x005e
            if (r8 > r6) goto L_0x005e
            r8 = 2
            goto L_0x0061
        L_0x0041:
            r1 = 240(0xf0, float:3.36E-43)
            r2 = 210(0xd2, float:2.94E-43)
            if (r8 < r6) goto L_0x004f
            if (r8 > r1) goto L_0x004f
            if (r8 < r5) goto L_0x005e
            if (r8 > r2) goto L_0x005e
            r8 = 3
            goto L_0x0061
        L_0x004f:
            if (r8 < r2) goto L_0x005e
            if (r8 > r0) goto L_0x005e
            if (r8 < r1) goto L_0x005e
            if (r8 > r4) goto L_0x005e
            r8 = 4
            goto L_0x0061
        L_0x0059:
            if (r8 <= r1) goto L_0x0060
            if (r8 < r0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r8 = -1
            goto L_0x0061
        L_0x0060:
            r8 = 1
        L_0x0061:
            if (r8 == r3) goto L_0x006a
            b43.b$a r0 = r7.f307669c
            if (r0 == 0) goto L_0x006a
            r0.mo145644c(r8)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b43.C104032b.onOrientationChanged(int):void");
    }
}
