package n00;

import android.view.View;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import lu3.C88654b;
import o00.C47315c;
import u83.C52477a;
import xb3.C15634g;
import xb3.C15640m;
import xb3.C91164l;
import yb3.C79064a;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: n00.c */
public final class C76814c extends C86301e implements C47315c {
    public C52477a U20() {
        return new C15640m();
    }

    /* renamed from: tr */
    public C88654b mo72369tr(C79064a aVar) {
        C88654b bVar;
        C87412m.m108594g(aVar, "options");
        if (aVar.f232170a) {
            C91164l lVar = C91164l.f261397a;
            View view = aVar.f232173d;
            int i = aVar.f232174e;
            long j = aVar.f232172c;
            String str = aVar.f232175f.toString();
            MMFragmentActivity mMFragmentActivity = aVar.f232176g;
            C87412m.m108593f(mMFragmentActivity, "options.activity");
            bVar = lVar.mo125226e(view, i, j, str, mMFragmentActivity, aVar.f232177h, aVar.f232178i, Integer.valueOf(aVar.f232179j));
        } else {
            bVar = null;
        }
        if (aVar.f232171b) {
            View view2 = aVar.f232173d;
            Integer valueOf = Integer.valueOf(aVar.f232174e);
            String str2 = aVar.f232175f.toString();
            MMFragmentActivity mMFragmentActivity2 = aVar.f232176g;
            long j2 = aVar.f232172c;
            C87412m.m108594g(str2, "viewId");
            if (j2 > 0) {
                WeakReference weakReference = new WeakReference(view2);
                WeakReference weakReference2 = new WeakReference(mMFragmentActivity2);
                ((C119157j) C119157j.f356862d).mo183879j(new C15634g(weakReference2, weakReference, valueOf, str2), j2, "wcpay_report_check_btn_no_response");
            }
        }
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r13.getIntent();
     */
    /* renamed from: uk */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo72370uk(java.lang.String r12, android.app.Activity r13) {
        /*
            r11 = this;
            r12 = 0
            r0 = 0
            if (r13 == 0) goto L_0x0015
            android.content.Intent r1 = r13.getIntent()
            if (r1 == 0) goto L_0x0015
            java.lang.String r2 = "pay_report_scene"
            int r1 = r1.getIntExtra(r2, r12)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0016
        L_0x0015:
            r1 = r0
        L_0x0016:
            r2 = 1
            if (r1 != 0) goto L_0x001a
            goto L_0x0053
        L_0x001a:
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x0053
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r13, r1)
            r1 = r13
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
            androidx.appcompat.app.ActionBar r1 = r1.getSupportActionBar()
            if (r1 == 0) goto L_0x003b
            android.view.View r1 = r1.mo91099j()
            if (r1 == 0) goto L_0x003b
            r0 = 2131296477(0x7f0900dd, float:1.8210872E38)
            android.view.View r0 = r1.findViewById(r0)
        L_0x003b:
            r2 = r0
            xb3.l r1 = xb3.C91164l.f261397a
            yb3.c r0 = yb3.C79066c.ViewId_Bankcard_Option_Menu_View
            java.lang.String r6 = r0.toString()
            r7 = r13
            com.tencent.mm.ui.MMFragmentActivity r7 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r7
            r3 = 0
            r4 = 500(0x1f4, double:2.47E-321)
            r8 = 0
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r1.mo125226e(r2, r3, r4, r6, r7, r8, r9, r10)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n00.C76814c.mo72370uk(java.lang.String, android.app.Activity):void");
    }
}
