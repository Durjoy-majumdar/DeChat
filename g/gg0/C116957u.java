package gg0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.plugin.account.bind.p021ui.FindMContactAlertUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C77398g;

/* renamed from: gg0.u */
public class C116957u implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ C77398g f350524d;

    /* renamed from: e */
    public final /* synthetic */ FindMContactAlertUI f350525e;

    public C116957u(FindMContactAlertUI findMContactAlertUI, C77398g gVar) {
        this.f350525e = findMContactAlertUI;
        this.f350524d = gVar;
    }

    public void onGlobalLayout() {
        this.f350524d.getWindow().getDecorView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
        int measuredWidth = this.f350524d.getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = this.f350524d.getWindow().getDecorView().getMeasuredHeight();
        int i = FindMContactAlertUI.f344325B;
        View R7 = this.f350525e.mo174552R7((ViewGroup) this.f350524d.getWindow().getDecorView());
        if (R7 != null) {
            measuredWidth = R7.getMeasuredWidth() * 2;
        }
        Log.m105919d("MicroMsg.FindMContactAlertUI", "dialog width: %s height: %s", Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight));
        FindMContactAlertUI findMContactAlertUI = this.f350525e;
        findMContactAlertUI.f344341v = measuredWidth;
        findMContactAlertUI.f344342w = measuredHeight;
        if (findMContactAlertUI.f344343x > 0 && findMContactAlertUI.f344344y > 0) {
            findMContactAlertUI.mo174549O7();
        }
    }
}
