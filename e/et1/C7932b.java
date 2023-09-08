package et1;

import android.view.ViewGroup;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import os1.C11748p;
import os1.C11758v;
import ss1.C13778a;
import te3.C64586nn1;

/* renamed from: et1.b */
public final class C7932b extends C13778a {

    /* renamed from: s */
    public final int f26618s;

    public C7932b(int i) {
        super(i);
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11758v.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…StateCacheVM::class.java)");
        this.f26618s = C11748p.m11445d3((C11748p) a, 1, (String) null, 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9047e(boolean r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x0009
            r0 = 2131101252(0x7f060644, float:1.7814908E38)
            r6 = 2131101252(0x7f060644, float:1.7814908E38)
            goto L_0x000f
        L_0x0009:
            r0 = 2131100381(0x7f0602dd, float:1.7813142E38)
            r6 = 2131100381(0x7f0602dd, float:1.7813142E38)
        L_0x000f:
            r0 = 1
            if (r10 == 0) goto L_0x0032
            int r1 = r9.f32063h
            r2 = 2131829334(0x7f112256, float:1.9291634E38)
            if (r1 != r2) goto L_0x001e
            java.lang.String r1 = ""
            r9.mo9050r(r1, r0)
        L_0x001e:
            er1.w3 r1 = er1.C58784w3.f168295a
            java.lang.Integer r0 = r1.mo83917b0(r0, r0)
            if (r0 == 0) goto L_0x002b
            int r0 = r0.intValue()
            goto L_0x0041
        L_0x002b:
            r0 = 2131755982(0x7f1003ce, float:1.9142859E38)
            r5 = 2131755982(0x7f1003ce, float:1.9142859E38)
            goto L_0x0049
        L_0x0032:
            er1.w3 r1 = er1.C58784w3.f168295a
            r2 = 0
            r3 = 2
            r4 = 0
            java.lang.Integer r0 = er1.C58784w3.m68436c0(r1, r0, r2, r3, r4)
            if (r0 == 0) goto L_0x0043
            int r0 = r0.intValue()
        L_0x0041:
            r5 = r0
            goto L_0x0049
        L_0x0043:
            r0 = 2131755983(0x7f1003cf, float:1.914286E38)
            r5 = 2131755983(0x7f1003cf, float:1.914286E38)
        L_0x0049:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "getContext()"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.CharSequence r3 = r9.mo10907i(r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131165329(0x7f070091, float:1.7944872E38)
            float r0 = r0.getDimension(r2)
            int r8 = (int) r0
            er1.w3 r0 = er1.C58784w3.f168295a
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r2, r1)
            r4 = 35
            r1 = r0
            r7 = r8
            java.lang.CharSequence r0 = r1.mo83957q1(r2, r3, r4, r5, r6, r7, r8)
            android.widget.TextView r1 = r9.f32064i
            if (r1 == 0) goto L_0x0084
            r1.setText(r0)
            r9.mo3857k(r10)
            r9.mo10908j(r10)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: et1.C7932b.mo9047e(boolean):void");
    }

    /* renamed from: f */
    public void mo3856f(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "tabView");
        super.mo3856f(viewGroup);
        Log.m105924i("Finder.FinderWxNotifyTab", "onTabSelected real");
        if (this.f32063h == C0966R.string.f360726j30) {
            mo9050r("", true);
        }
    }

    /* renamed from: g */
    public void mo9048g(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "tabView");
        Log.m105924i("Finder.FinderWxNotifyTab", "onTabUnSelected real");
        mo9050r("", false);
    }

    /* renamed from: p */
    public int mo9049p() {
        return this.f26618s;
    }

    /* renamed from: r */
    public void mo9050r(String str, boolean z) {
        Class cls = FinderCommonFeatureService.class;
        if (this.f38897l != null) {
            int i = this.f32063h;
            boolean z2 = true;
            if (i == C0966R.string.f360726j30) {
                C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("WxMessageLike");
                if (R5 == null || R5.f184502d != 2) {
                    z2 = false;
                }
                mo13139q(str, z, z2);
            } else if (i == C0966R.string.eff) {
                C64586nn1 R52 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("WxMessageComment");
                if (R52 == null || R52.f184502d != 2) {
                    z2 = false;
                }
                mo13139q(str, z, z2);
            }
        }
    }
}
