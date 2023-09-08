package rn3;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import di3.C86312j;
import kb0.C76529i;

/* renamed from: rn3.g0 */
public class C77553g0 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ String f226103d;

    /* renamed from: e */
    public final /* synthetic */ View f226104e;

    public C77553g0(SendAppMessageWrapperUI sendAppMessageWrapperUI, String str, View view) {
        this.f226103d = str;
        this.f226104e = view;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        ((C76529i) C86312j.m106911c(C76529i.class)).ks0(this.f226103d, this.f226104e);
    }
}
