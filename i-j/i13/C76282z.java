package i13;

import android.view.View;
import com.tencent.p014mm.modelvoiceaddr.C92866b;
import com.tencent.p014mm.plugin.transvoice.model.C71562c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: i13.z */
public final class C76282z implements C92866b.C68146d {

    /* renamed from: a */
    public final /* synthetic */ C76259g f223470a;

    public C76282z(C76259g gVar) {
        this.f223470a = gVar;
    }

    /* renamed from: a */
    public void mo21933a() {
        Log.m105924i("MicroMsg.TransVoiceDialog", "onRecognizeFinish.");
        C76259g gVar = this.f223470a;
        gVar.f223404I = false;
        C71562c cVar = gVar.f223421f;
        cVar.f207384s = 1;
        cVar.f207380o = System.currentTimeMillis();
        MMHandler mMHandler = this.f223470a.f223407L;
        if (mMHandler != null) {
            mMHandler.removeMessages(5000);
        }
        MTimerHandler mTimerHandler = this.f223470a.f223403H;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        C76259g.m91667E(this.f223470a);
        View view = this.f223470a.f223428p;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$startTrans$1", "onRecognizeFinish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$startTrans$1", "onRecognizeFinish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21934b(java.lang.String[] r5, java.util.List<java.lang.String> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "MicroMsg.TransVoiceDialog"
            java.lang.String r1 = "onRes."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            i13.g r1 = r4.f223470a
            r1.f223420Z = r6
            com.tencent.mm.sdk.platformtools.MMHandler r6 = r1.f223407L
            r1 = 5000(0x1388, float:7.006E-42)
            if (r6 == 0) goto L_0x0014
            r6.removeMessages(r1)
        L_0x0014:
            i13.g r6 = r4.f223470a
            com.tencent.mm.sdk.platformtools.MMHandler r6 = r6.f223407L
            if (r6 == 0) goto L_0x001f
            r2 = 5000(0x1388, double:2.4703E-320)
            r6.sendEmptyMessageDelayed(r1, r2)
        L_0x001f:
            r6 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0034
            r2 = r5[r1]
            if (r2 == 0) goto L_0x0034
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x002f
            r2 = 1
            goto L_0x0030
        L_0x002f:
            r2 = 0
        L_0x0030:
            if (r2 != r6) goto L_0x0034
            r2 = 1
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            if (r2 == 0) goto L_0x0081
            i13.g r2 = r4.f223470a
            r5 = r5[r1]
            r2.getClass()
            java.lang.String r3 = "<set-?>"
            gy3.C87412m.m108594g(r5, r3)
            r2.f223438x0 = r5
            java.lang.Object[] r5 = new java.lang.Object[r6]
            i13.g r2 = r4.f223470a
            java.lang.String r2 = r2.f223438x0
            r5[r1] = r2
            java.lang.String r1 = "onRes, curTxt: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r5)
            i13.g r5 = r4.f223470a
            com.tencent.mm.plugin.transvoice.model.c r0 = r5.f223421f
            java.lang.String r5 = r5.f223438x0
            int r5 = r5.length()
            r0.f207381p = r5
            i13.g r5 = r4.f223470a
            boolean r0 = r5.f223404I
            if (r0 != 0) goto L_0x0081
            r5.f223404I = r6
            com.tencent.mm.ui.widget.MMEditText r5 = r5.f223426n
            if (r5 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r5.setFocusable(r6)
        L_0x006e:
            i13.g r5 = r4.f223470a
            com.tencent.mm.ui.widget.MMEditText r5 = r5.f223426n
            if (r5 != 0) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            r5.setFocusableInTouchMode(r6)
        L_0x0078:
            i13.g r5 = r4.f223470a
            com.tencent.mm.ui.widget.MMEditText r5 = r5.f223426n
            if (r5 == 0) goto L_0x0081
            r5.requestFocus()
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i13.C76282z.mo21934b(java.lang.String[], java.util.List):void");
    }

    /* renamed from: c */
    public void mo21935c(int i, int i2, int i3, long j) {
        Log.m105925i("MicroMsg.TransVoiceDialog", "onError, errType: %d, errCode: %d, localCode: %d, voiceid: %d.", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j));
        C71562c cVar = this.f223470a.f223421f;
        cVar.f207384s = 0;
        cVar.f207380o = System.currentTimeMillis();
    }

    /* renamed from: d */
    public void mo21936d() {
        Log.m105918d("MicroMsg.TransVoiceDialog", "onRecordFin.");
    }
}
