package p923xj;

import android.app.Dialog;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: xj.a */
public class C78853a extends Dialog {

    /* renamed from: d */
    public Runnable f231678d;

    /* renamed from: e */
    public final Runnable f231679e = new C78854a();

    /* renamed from: xj.a$a */
    public class C78854a implements Runnable {
        public C78854a() {
        }

        public void run() {
            try {
                Log.m105924i("MicroMsg.SafeDismissDialog", "run on hijack runnable");
                C78853a.this.f231678d.run();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.SafeDismissDialog", "protect : " + e.getMessage());
            }
        }
    }

    public C78853a(Context context) {
        super(context);
        mo108856a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:4|5|6|7|8|9|10|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0029 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo108856a() {
        /*
            r5 = this;
            java.lang.String r0 = "MicroMsg.SafeDismissDialog"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 <= r2) goto L_0x0009
            return
        L_0x0009:
            java.lang.Class<android.app.Dialog> r1 = android.app.Dialog.class
            java.lang.String r2 = "mDismissAction"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x003d, IllegalAccessException -> 0x0037 }
            r2 = 1
            r1.setAccessible(r2)     // Catch:{ NoSuchFieldException -> 0x003d, IllegalAccessException -> 0x0037 }
            java.lang.Class<java.lang.reflect.Field> r3 = java.lang.reflect.Field.class
            java.lang.String r4 = "accessFlags"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ Exception -> 0x0029 }
            r3.setAccessible(r2)     // Catch:{ Exception -> 0x0029 }
            int r2 = r1.getModifiers()     // Catch:{ Exception -> 0x0029 }
            r2 = r2 & -17
            r3.setInt(r1, r2)     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            java.lang.Object r2 = r1.get(r5)     // Catch:{ NoSuchFieldException -> 0x003d, IllegalAccessException -> 0x0037 }
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ NoSuchFieldException -> 0x003d, IllegalAccessException -> 0x0037 }
            r5.f231678d = r2     // Catch:{ NoSuchFieldException -> 0x003d, IllegalAccessException -> 0x0037 }
            java.lang.Runnable r2 = r5.f231679e     // Catch:{ NoSuchFieldException -> 0x003d, IllegalAccessException -> 0x0037 }
            r1.set(r5, r2)     // Catch:{ NoSuchFieldException -> 0x003d, IllegalAccessException -> 0x0037 }
            goto L_0x0042
        L_0x0037:
            java.lang.String r1 = "hijack fail IllegalAccessException"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x0042
        L_0x003d:
            java.lang.String r1 = "hijack fail NoSuchFieldException"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p923xj.C78853a.mo108856a():void");
    }

    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SafeDismissDialog", e, "", new Object[0]);
        }
    }

    public C78853a(Context context, int i) {
        super(context, i);
        mo108856a();
    }
}
