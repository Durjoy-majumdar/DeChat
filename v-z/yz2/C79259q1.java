package yz2;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import uz2.C78318v1;
import zp3.C23564m;

/* renamed from: yz2.q1 */
public final class C79259q1 implements C72837v1 {

    /* renamed from: a */
    public final /* synthetic */ TextStatusEditActivity f232683a;

    /* renamed from: yz2.q1$a */
    public static final class C79260a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ IEmojiInfo f232684d;

        /* renamed from: e */
        public final /* synthetic */ TextStatusEditActivity f232685e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79260a(IEmojiInfo iEmojiInfo, TextStatusEditActivity textStatusEditActivity) {
            super(0);
            this.f232684d = iEmojiInfo;
            this.f232685e = textStatusEditActivity;
        }

        public Object invoke() {
            Log.m105918d("MicroMsg.TextStatus.TextStatusEditActivity", "onSendCustomEmoji() called with: emoji = " + this.f232684d);
            C78318v1 Y7 = this.f232685e.mo98454Y7();
            if (Y7 != null) {
                Y7.f229480R0++;
            }
            this.f232685e.mo98458c8(this.f232684d);
            return C13598b0.f38549a;
        }
    }

    public C79259q1(TextStatusEditActivity textStatusEditActivity) {
        this.f232683a = textStatusEditActivity;
    }

    /* renamed from: X1 */
    public void mo65586X1(IEmojiInfo iEmojiInfo) {
        C23564m.m28136f(new C79260a(iEmojiInfo, this.f232683a));
    }

    /* renamed from: a */
    public void mo65587a() {
        Log.m105918d("MicroMsg.TextStatus.TextStatusEditActivity", "onHidePanel() called");
    }

    /* renamed from: b */
    public void mo65588b(boolean z, int i) {
        Log.m105918d("MicroMsg.TextStatus.TextStatusEditActivity", "onSearchDialogShow() called with: isShow = " + z + ", dialogHeight = " + i);
        C78318v1 Y7 = this.f232683a.mo98454Y7();
        if (Y7 != null) {
            Y7.f229484T0++;
        }
    }
}
