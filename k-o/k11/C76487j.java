package k11;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanCacheUI;
import tm2.C14049d;

/* renamed from: k11.j */
public final class C76487j implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ CleanCacheUI f223905d;

    public C76487j(CleanCacheUI cleanCacheUI) {
        this.f223905d = cleanCacheUI;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        ((C67654r1) C14049d.m13403b()).mo93170c(new Intent().putExtra("Intro_Need_Clear_Top ", true), this.f223905d.getContext());
    }
}
