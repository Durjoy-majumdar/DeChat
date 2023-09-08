package com.tencent.p014mm.plugin.fav.p047ui;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import nj3.C76879j;
import pb1.C100755z;
import qo3.C89779i0;
import wd3.C65953v0;

/* renamed from: com.tencent.mm.plugin.fav.ui.g0 */
public final class C93601g0 implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ FavFinderFilterUI f270294a;

    /* renamed from: b */
    public final /* synthetic */ C100755z f270295b;

    /* renamed from: com.tencent.mm.plugin.fav.ui.g0$a */
    public static final class C93602a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f270296d;

        /* renamed from: e */
        public final /* synthetic */ FavFinderFilterUI f270297e;

        /* renamed from: com.tencent.mm.plugin.fav.ui.g0$a$a */
        public static final class C93603a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FavFinderFilterUI f270298d;

            public C93603a(FavFinderFilterUI favFinderFilterUI) {
                this.f270298d = favFinderFilterUI;
            }

            public final void run() {
                this.f270298d.finish();
            }
        }

        public C93602a(Dialog dialog, FavFinderFilterUI favFinderFilterUI) {
            this.f270296d = dialog;
            this.f270297e = favFinderFilterUI;
        }

        public final void run() {
            Dialog dialog = this.f270296d;
            if (dialog != null) {
                dialog.dismiss();
            }
            FavFinderFilterUI favFinderFilterUI = this.f270297e;
            C75026b.m89951a(favFinderFilterUI, favFinderFilterUI.getString(C0966R.string.cmm));
            MMHandlerThread.postToMainThreadDelayed(new C93603a(this.f270297e), 1800);
        }
    }

    public C93601g0(FavFinderFilterUI favFinderFilterUI, C100755z zVar) {
        this.f270294a = favFinderFilterUI;
        this.f270295b = zVar;
    }

    /* renamed from: a */
    public final void mo23a(boolean z, String str, int i) {
        this.f270294a.hideVKB();
        if (z) {
            C89779i0 Q = C76879j.m92723Q(this.f270294a.getContext(), "", this.f270294a.getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null);
            AppCompatActivity context = this.f270294a.getContext();
            FavFinderFilterUI favFinderFilterUI = this.f270294a;
            String str2 = favFinderFilterUI.f269714g;
            if (str2 != null) {
                C93594f1.m118181i(context, str2, str, this.f270295b, new C93602a(Q, favFinderFilterUI));
            } else {
                C87412m.m108603p("toUser");
                throw null;
            }
        }
    }
}
