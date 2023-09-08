package fs0;

import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.record.WAGameRecordShareUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C75375u;
import di3.C86312j;
import gy3.C87412m;
import nj3.C76912y0;
import p385u2.C111105a;
import p629ny.C76978g;
import sw1.C48478n;

/* renamed from: fs0.g */
public final class C97974g implements C48478n.C48481f {

    /* renamed from: a */
    public final /* synthetic */ WAGameRecordShareUI f287341a;

    /* renamed from: fs0.g$a */
    public static final class C97975a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WAGameRecordShareUI f287342d;

        /* renamed from: e */
        public final /* synthetic */ String f287343e;

        public C97975a(WAGameRecordShareUI wAGameRecordShareUI, String str) {
            this.f287342d = wAGameRecordShareUI;
            this.f287343e = str;
        }

        public final void run() {
            C76912y0.m92767f(this.f287342d, this.f287343e);
        }
    }

    /* renamed from: fs0.g$b */
    public static final class C97976b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WAGameRecordShareUI f287344d;

        public C97976b(WAGameRecordShareUI wAGameRecordShareUI) {
            this.f287344d = wAGameRecordShareUI;
        }

        public final void run() {
            WAGameRecordShareUI wAGameRecordShareUI = this.f287344d;
            Button button = wAGameRecordShareUI.f267615j;
            if (button != null) {
                Button button2 = wAGameRecordShareUI.f267614i;
                if (button2 != null) {
                    wAGameRecordShareUI.mo127311L7(button, button2);
                    TextView textView = wAGameRecordShareUI.f267616n;
                    if (textView != null) {
                        C75375u uVar = new C75375u(wAGameRecordShareUI.getString(C0966R.string.muc));
                        uVar.mo105705b(((C76978g) C86312j.m106911c(C76978g.class)).Co0("", C111105a.m151500b(wAGameRecordShareUI, C0966R.color.a1d), C111105a.m151500b(wAGameRecordShareUI, C0966R.color.BW_0_Alpha_0_2), true, new C97973f(wAGameRecordShareUI)), 7, 16, 18);
                        textView.setText(uVar);
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        WAGameRecordShareUI wAGameRecordShareUI2 = this.f287344d;
                        C76912y0.m92768g(wAGameRecordShareUI2, wAGameRecordShareUI2.getResources().getString(C0966R.string.mky));
                        return;
                    }
                    C87412m.m108603p("shareText");
                    throw null;
                }
                C87412m.m108603p("stashButton");
                throw null;
            }
            C87412m.m108603p("shareButton");
            throw null;
        }
    }

    public C97974g(WAGameRecordShareUI wAGameRecordShareUI) {
        this.f287341a = wAGameRecordShareUI;
    }

    /* renamed from: a */
    public void mo6931a(String str) {
        Log.m105920e("MicroMsg.WAGameRecordShareUI", "stash error");
        WAGameRecordShareUI wAGameRecordShareUI = this.f287341a;
        wAGameRecordShareUI.runOnUiThread(new C97975a(wAGameRecordShareUI, str));
        WAGameRecordShareUI wAGameRecordShareUI2 = this.f287341a;
        String nullAsNil = Util.nullAsNil(str);
        C87412m.m108593f(nullAsNil, "nullAsNil(errorMsg)");
        WAGameRecordShareUI.m117229I7(wAGameRecordShareUI2, 3, 1, nullAsNil);
    }

    public void onCancel() {
        Log.m105924i("MicroMsg.WAGameRecordShareUI", "stash cancel");
        WAGameRecordShareUI.m117229I7(this.f287341a, 3, 2, "user cancel");
    }

    public void onSuccess() {
        Log.m105924i("MicroMsg.WAGameRecordShareUI", "stash success");
        WAGameRecordShareUI wAGameRecordShareUI = this.f287341a;
        wAGameRecordShareUI.runOnUiThread(new C97976b(wAGameRecordShareUI));
        WAGameRecordShareUI wAGameRecordShareUI2 = this.f287341a;
        int i = WAGameRecordShareUI.f267608p;
        wAGameRecordShareUI2.getClass();
        wAGameRecordShareUI2.runOnUiThread(new C97970d(3, wAGameRecordShareUI2));
        WAGameRecordShareUI.m117229I7(this.f287341a, 3, 0, "ok");
    }
}
