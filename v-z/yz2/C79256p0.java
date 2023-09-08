package yz2;

import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivity;

/* renamed from: yz2.p0 */
public final class C79256p0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivity f232681d;

    public C79256p0(TextStatusDoWhatActivity textStatusDoWhatActivity) {
        this.f232681d = textStatusDoWhatActivity;
    }

    public final void run() {
        TextStatusDoWhatActivity textStatusDoWhatActivity = this.f232681d;
        textStatusDoWhatActivity.f206772j = false;
        textStatusDoWhatActivity.finish();
    }
}
