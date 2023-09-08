package yz2;

import android.view.View;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yz2.a2 */
public final class C79220a2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusEditHalfScreenActivity f232592d;

    public C79220a2(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
        this.f232592d = textStatusEditHalfScreenActivity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$initEtDescListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105918d("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "initEtDescListener() called");
        this.f232592d.mo98563V7().setCursorVisible(true);
        this.f232592d.mo98563V7().requestFocus();
        if (IStatusIconHelperKt.m39109a().mo62275E()) {
            this.f232592d.mo98580n8(false);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$initEtDescListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
