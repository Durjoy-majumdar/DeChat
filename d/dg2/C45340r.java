package dg2;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.qqmail.p090ui.ReadMailUI;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import di3.C86312j;
import p763ym.C79138l;

/* renamed from: dg2.r */
public class C45340r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ReadMailUI f122813d;

    public C45340r(ReadMailUI readMailUI) {
        this.f122813d = readMailUI;
    }

    public void run() {
        Intent launchIntentForPackage = this.f122813d.getPackageManager().getLaunchIntentForPackage("com.tencent.androidqqmail");
        ReadMailUI readMailUI = this.f122813d;
        ((C79138l) C86312j.m106911c(C79138l.class)).px0(readMailUI, launchIntentForPackage, readMailUI.getString(C0966R.string.b5q), (C44580q1) null);
    }
}
