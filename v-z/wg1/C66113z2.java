package wg1;

import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract;
import gy3.C87412m;
import zk1.C16278q0;

/* renamed from: wg1.z2 */
public final class C66113z2 extends C16278q0 {

    /* renamed from: d */
    public FinderLiveSubTagConstract.Presenter f190028d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66113z2(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ak_;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            r7.mo14775c3()
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r0 = "KEY_HAS_NEXT_ACTION"
            r1 = 0
            boolean r8 = r8.getBooleanExtra(r0, r1)
            te3.y91 r0 = new te3.y91
            r0.<init>()
            android.content.Intent r2 = r7.getIntent()
            java.lang.String r3 = "KEY_TAG_INFO"
            byte[] r2 = r2.getByteArrayExtra(r3)
            r3 = 0
            if (r2 != 0) goto L_0x0024
            goto L_0x0035
        L_0x0024:
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x0028 }
            goto L_0x0036
        L_0x0028:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r0 = "safeParser"
            java.lang.String r1 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r1, r2)
        L_0x0035:
            r0 = r3
        L_0x0036:
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter r1 = new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter
            if (r0 == 0) goto L_0x003d
            java.util.LinkedList<te3.y91> r2 = r0.f186455f
            goto L_0x003e
        L_0x003d:
            r2 = r3
        L_0x003e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r2 == 0) goto L_0x005e
            java.util.Iterator r2 = r2.iterator()
        L_0x0049:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x005e
            java.lang.Object r5 = r2.next()
            te3.y91 r5 = (te3.C64848y91) r5
            cm1.w0 r6 = new cm1.w0
            r6.<init>(r5)
            r4.add(r6)
            goto L_0x0049
        L_0x005e:
            r1.<init>(r0, r4, r8)
            r7.f190028d = r1
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$ViewCallback r8 = new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$ViewCallback
            androidx.appcompat.app.AppCompatActivity r0 = r7.getActivity()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r0, r1)
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter r1 = r7.f190028d
            java.lang.String r2 = "presenter"
            if (r1 == 0) goto L_0x0085
            r8.<init>(r0, r1)
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter r0 = r7.f190028d
            if (r0 == 0) goto L_0x0081
            r0.mo78463e(r8)
            return
        L_0x0081:
            gy3.C87412m.m108603p(r2)
            throw r3
        L_0x0085:
            gy3.C87412m.m108603p(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C66113z2.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        FinderLiveSubTagConstract.Presenter presenter = this.f190028d;
        if (presenter != null && presenter == null) {
            C87412m.m108603p("presenter");
            throw null;
        }
    }
}
