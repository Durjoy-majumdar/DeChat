package yz2;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import b03.C39691c;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import qy2.C63347a;
import rz2.C48201c;

/* renamed from: yz2.w0 */
public final class C79278w0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f232727d;

    public C79278w0(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f232727d = textStatusDoWhatActivityV2;
    }

    public final void run() {
        ImageView imageView = this.f232727d.f206797E;
        if (imageView != null) {
            imageView.setImageDrawable((Drawable) null);
        }
        C39691c N7 = this.f232727d.mo98425N7();
        TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f232727d;
        C39691c.m42340S(N7, textStatusDoWhatActivityV2.f206797E, textStatusDoWhatActivityV2.f206806N, (C63347a.C47893d) null, (C63347a.C47891b) null, (C48201c) null, false, false, 124, (Object) null);
        this.f232727d.mo98428Q7();
        MMEditText mMEditText = this.f232727d.f206794B;
        if (mMEditText != null) {
            mMEditText.requestFocus();
        }
        this.f232727d.showVKB();
    }
}
