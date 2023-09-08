package yz2;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import b03.C39691c;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import j20.C117292a;
import java.util.ArrayList;
import qy2.C63347a;
import rz2.C48201c;

/* renamed from: yz2.d1 */
public final class C79230d1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f232600d;

    public C79230d1(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f232600d = textStatusDoWhatActivityV2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f232600d;
        textStatusDoWhatActivityV2.f206806N = "userdefine";
        ImageView imageView = textStatusDoWhatActivityV2.f206797E;
        if (imageView != null) {
            imageView.setImageDrawable((Drawable) null);
        }
        MMEditText mMEditText = this.f232600d.f206794B;
        if (mMEditText != null) {
            mMEditText.setText("");
        }
        C39691c N7 = this.f232600d.mo98425N7();
        TextStatusDoWhatActivityV2 textStatusDoWhatActivityV22 = this.f232600d;
        C39691c.m42340S(N7, textStatusDoWhatActivityV22.f206797E, textStatusDoWhatActivityV22.f206806N, (C63347a.C47893d) null, (C63347a.C47891b) null, (C48201c) null, false, false, 124, (Object) null);
        this.f232600d.mo98424M7().mo98319c();
        this.f232600d.hideVKB();
        this.f232600d.mo98428Q7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
