package dg2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.qqmail.p090ui.ReadMailUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import kg3.C76577a;
import p910lj.C76701a;

/* renamed from: dg2.i */
public class C86279i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f250893d;

    /* renamed from: e */
    public final /* synthetic */ C86280j f250894e;

    public C86279i(C86280j jVar, Bundle bundle) {
        this.f250894e = jVar;
        this.f250893d = bundle;
    }

    public void run() {
        int i = this.f250893d.getInt("err_type");
        int i2 = this.f250893d.getInt("err_type");
        String string = this.f250893d.getString("err_msg");
        if (Util.isNullOrNil(string)) {
            string = this.f250894e.f250895d.getString(C0966R.string.hl6);
        }
        if (i == 0 && i2 == 0) {
            this.f250894e.f250895d.f248829s.setEnabled(false);
            this.f250894e.f250895d.f248829s.setText(C0966R.string.hse);
            this.f250894e.f250895d.f248829s.setTextColor(-7829368);
            ReadMailUI readMailUI = this.f250894e.f250895d;
            readMailUI.f248829s.setCompoundDrawablesWithIntrinsicBounds(C76577a.m92158i(readMailUI, C0966R.C0969drawable.bl4), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f250894e.f250895d.mo118702K7();
            return;
        }
        C76701a.makeText((Context) this.f250894e.f250895d, (CharSequence) string, 1).show();
    }
}
