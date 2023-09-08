package gg0;

import android.view.View;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.plugin.account.bind.p021ui.FindMContactAlertUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: gg0.v */
public class C116958v implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ View f350526d;

    /* renamed from: e */
    public final /* synthetic */ FindMContactAlertUI f350527e;

    public C116958v(FindMContactAlertUI findMContactAlertUI, View view) {
        this.f350527e = findMContactAlertUI;
        this.f350526d = view;
    }

    public void onGlobalLayout() {
        this.f350526d.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        int measuredHeight = this.f350526d.getMeasuredHeight();
        int measuredWidth = this.f350526d.getMeasuredWidth();
        Log.m105919d("MicroMsg.FindMContactAlertUI", "bg width: %s height: %s", Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight));
        FindMContactAlertUI findMContactAlertUI = this.f350527e;
        findMContactAlertUI.f344343x = measuredWidth;
        findMContactAlertUI.f344344y = measuredHeight;
        if (findMContactAlertUI.f344341v > 0 && findMContactAlertUI.f344342w > 0) {
            findMContactAlertUI.mo174549O7();
        }
    }
}
