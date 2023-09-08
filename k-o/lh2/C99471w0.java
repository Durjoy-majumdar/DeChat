package lh2;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import gy3.C87412m;
import i72.C98607d;
import lh2.C109344g0;
import p625nu.C61901d;

/* renamed from: lh2.w0 */
public final class C99471w0 implements C109344g0, C61901d.C61902a {

    /* renamed from: d */
    public Context f291641d;

    /* renamed from: e */
    public C98607d f291642e;

    /* renamed from: f */
    public int f291643f;

    /* renamed from: g */
    public C61901d.C61902a f291644g;

    public C99471w0(Context context) {
        C87412m.m108594g(context, "context");
        this.f291641d = context;
        C98607d dVar = new C98607d(this.f291641d, 2);
        this.f291642e = dVar;
        dVar.f289116g = this;
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C99471w0.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0096 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOrientationChange(int r9) {
        /*
            r8 = this;
            if (r9 >= 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 180(0xb4, float:2.52E-43)
            r1 = 30
            r2 = 60
            r3 = 270(0x10e, float:3.78E-43)
            r4 = 90
            r5 = 1
            r6 = 0
            if (r9 <= r2) goto L_0x0069
            r7 = 300(0x12c, float:4.2E-43)
            if (r9 < r7) goto L_0x0016
            goto L_0x0069
        L_0x0016:
            if (r1 > r9) goto L_0x001e
            r1 = 151(0x97, float:2.12E-43)
            if (r9 >= r1) goto L_0x001e
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            if (r1 == 0) goto L_0x002f
            if (r2 > r9) goto L_0x0029
            r1 = 121(0x79, float:1.7E-43)
            if (r9 >= r1) goto L_0x0029
            r9 = 1
            goto L_0x002a
        L_0x0029:
            r9 = 0
        L_0x002a:
            if (r9 == 0) goto L_0x0069
            r9 = 90
            goto L_0x006a
        L_0x002f:
            r1 = 120(0x78, float:1.68E-43)
            if (r1 > r9) goto L_0x0039
            r1 = 241(0xf1, float:3.38E-43)
            if (r9 >= r1) goto L_0x0039
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            if (r1 == 0) goto L_0x004c
            r1 = 150(0x96, float:2.1E-43)
            if (r1 > r9) goto L_0x0046
            r1 = 211(0xd3, float:2.96E-43)
            if (r9 >= r1) goto L_0x0046
            r9 = 1
            goto L_0x0047
        L_0x0046:
            r9 = 0
        L_0x0047:
            if (r9 == 0) goto L_0x0069
            r9 = 180(0xb4, float:2.52E-43)
            goto L_0x006a
        L_0x004c:
            r1 = 210(0xd2, float:2.94E-43)
            if (r1 > r9) goto L_0x0056
            r1 = 331(0x14b, float:4.64E-43)
            if (r9 >= r1) goto L_0x0056
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            if (r1 == 0) goto L_0x0069
            r1 = 240(0xf0, float:3.36E-43)
            if (r1 > r9) goto L_0x0063
            r1 = 301(0x12d, float:4.22E-43)
            if (r9 >= r1) goto L_0x0063
            r9 = 1
            goto L_0x0064
        L_0x0063:
            r9 = 0
        L_0x0064:
            if (r9 == 0) goto L_0x0069
            r9 = 270(0x10e, float:3.78E-43)
            goto L_0x006a
        L_0x0069:
            r9 = 0
        L_0x006a:
            android.content.Context r1 = r8.f291641d
            java.lang.String r2 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r1, r2)
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.WindowManager r1 = r1.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            int r1 = r1.getRotation()
            if (r1 == r5) goto L_0x008d
            r2 = 2
            if (r1 == r2) goto L_0x008f
            r0 = 3
            if (r1 == r0) goto L_0x008a
            r0 = 0
            goto L_0x008f
        L_0x008a:
            r0 = 270(0x10e, float:3.78E-43)
            goto L_0x008f
        L_0x008d:
            r0 = 90
        L_0x008f:
            int r9 = r9 + r0
            int r9 = r9 + 360
            int r9 = r9 % 360
            if (r9 == r4) goto L_0x009a
            if (r9 == r3) goto L_0x009a
            r4 = r9
            goto L_0x009f
        L_0x009a:
            if (r9 != r3) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            r4 = -90
        L_0x009f:
            int r9 = r8.f291643f
            if (r4 == r9) goto L_0x00ac
            r8.f291643f = r4
            nu.d$a r9 = r8.f291644g
            if (r9 == 0) goto L_0x00ac
            r9.onOrientationChange(r4)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lh2.C99471w0.onOrientationChange(int):void");
    }

    public void onPause() {
        this.f291642e.disable();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
        this.f291642e.enable();
    }

    public void release() {
        C98607d dVar = this.f291642e;
        dVar.f289116g = null;
        dVar.disable();
    }

    public void reset() {
    }

    public void setVisibility(int i) {
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
