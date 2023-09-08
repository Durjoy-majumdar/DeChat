package wt1;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintAuthUI;
import yq3.C79143a;

/* renamed from: wt1.s */
public class C78704s implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f230411d;

    /* renamed from: e */
    public final /* synthetic */ FingerPrintAuthUI f230412e;

    public C78704s(FingerPrintAuthUI fingerPrintAuthUI, int i) {
        this.f230412e = fingerPrintAuthUI;
        this.f230411d = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C79143a.m95764c(this.f230412e, new Bundle(), this.f230411d);
    }
}
