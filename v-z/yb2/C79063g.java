package yb2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: yb2.g */
public class C79063g extends C15946a {

    /* renamed from: d */
    public boolean f232169d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79063g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateAfter(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onCreateAfter(r3)
            boolean r3 = r2.f232169d
            if (r3 == 0) goto L_0x0036
            androidx.appcompat.app.AppCompatActivity r3 = r2.getActivity()
            boolean r0 = r3 instanceof com.tencent.p014mm.p136ui.MMActivity
            r1 = 0
            if (r0 == 0) goto L_0x0013
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            goto L_0x0014
        L_0x0013:
            r3 = r1
        L_0x0014:
            if (r3 == 0) goto L_0x001f
            com.tencent.mm.ui.MMActivityController r3 = r3.getController()
            if (r3 == 0) goto L_0x001f
            r3.mo177043E()
        L_0x001f:
            androidx.appcompat.app.AppCompatActivity r3 = r2.getActivity()
            boolean r0 = r3 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r0 == 0) goto L_0x002a
            r1 = r3
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
        L_0x002a:
            if (r1 == 0) goto L_0x0036
            vo3.f r3 = r1.getBounceView()
            if (r3 == 0) goto L_0x0036
            r0 = 0
            r3.setBounceEnabled(r0)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb2.C79063g.onCreateAfter(android.os.Bundle):void");
    }

    public void onCreateBefore(Bundle bundle) {
        super.onCreateBefore(bundle);
        this.f232169d = getIntent().getBooleanExtra("Contact_IsHalfScreen", false);
    }
}
