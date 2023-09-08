package qo3;

import android.app.Dialog;
import android.content.Context;
import com.tencent.p014mm.p136ui.C85975v4;

/* renamed from: qo3.c0 */
public class C77390c0 extends Dialog {
    private static final String TAG = "MicroMsg.MMDialog";
    private C77393e iOnDialogDismissListener;
    /* access modifiers changed from: private */
    public Runnable mHijackDismissAction;
    private final Runnable mReplaceRunnable = new C77391a();

    /* renamed from: qo3.c0$a */
    public class C77391a implements Runnable {
        public C77391a() {
        }

        public void run() {
            try {
                C85975v4.m106306c(C77390c0.TAG, "run on hijack runnable", new Object[0]);
                C77390c0.this.mHijackDismissAction.run();
            } catch (Exception e) {
                C85975v4.m106305b(C77390c0.TAG, "protect : " + e.getMessage(), new Object[0]);
            }
        }
    }

    public C77390c0(Context context) {
        super(context);
        hijackDismissAction();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:4|5|6|7|8|9|10|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void hijackDismissAction() {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.MMDialog"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 <= r2) goto L_0x0009
            return
        L_0x0009:
            r1 = 0
            java.lang.Class<android.app.Dialog> r2 = android.app.Dialog.class
            java.lang.String r3 = "mDismissAction"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0040, IllegalAccessException -> 0x0038 }
            r3 = 1
            r2.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0040, IllegalAccessException -> 0x0038 }
            java.lang.Class<java.lang.reflect.Field> r4 = java.lang.reflect.Field.class
            java.lang.String r5 = "accessFlags"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch:{ Exception -> 0x002a }
            r4.setAccessible(r3)     // Catch:{ Exception -> 0x002a }
            int r3 = r2.getModifiers()     // Catch:{ Exception -> 0x002a }
            r3 = r3 & -17
            r4.setInt(r2, r3)     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            java.lang.Object r3 = r2.get(r6)     // Catch:{ NoSuchFieldException -> 0x0040, IllegalAccessException -> 0x0038 }
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ NoSuchFieldException -> 0x0040, IllegalAccessException -> 0x0038 }
            r6.mHijackDismissAction = r3     // Catch:{ NoSuchFieldException -> 0x0040, IllegalAccessException -> 0x0038 }
            java.lang.Runnable r3 = r6.mReplaceRunnable     // Catch:{ NoSuchFieldException -> 0x0040, IllegalAccessException -> 0x0038 }
            r2.set(r6, r3)     // Catch:{ NoSuchFieldException -> 0x0040, IllegalAccessException -> 0x0038 }
            goto L_0x0047
        L_0x0038:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "hijack fail IllegalAccessException"
            com.tencent.p014mm.p136ui.C85975v4.m106305b(r0, r2, r1)
            goto L_0x0047
        L_0x0040:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "hijack fail NoSuchFieldException"
            com.tencent.p014mm.p136ui.C85975v4.m106305b(r0, r2, r1)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qo3.C77390c0.hijackDismissAction():void");
    }

    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
            C85975v4.m106307d(TAG, e, "", new Object[0]);
        }
        C77393e eVar = this.iOnDialogDismissListener;
        if (eVar != null) {
            eVar.onDialogDismiss(this);
        }
    }

    public void setiOnDialogDismissListener(C77393e eVar) {
        this.iOnDialogDismissListener = eVar;
    }

    public void show() {
        try {
            super.show();
        } catch (Exception e) {
            C85975v4.m106307d(TAG, e, "", new Object[0]);
        }
    }

    public C77390c0(Context context, int i) {
        super(context, i);
        hijackDismissAction();
    }
}
