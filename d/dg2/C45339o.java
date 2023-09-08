package dg2;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.qqmail.p090ui.ReadMailUI;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import di3.C86312j;
import p763ym.C79138l;

/* renamed from: dg2.o */
public class C45339o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f122811d;

    /* renamed from: e */
    public final /* synthetic */ ReadMailUI f122812e;

    public C45339o(ReadMailUI readMailUI, Intent intent) {
        this.f122812e = readMailUI;
        this.f122811d = intent;
    }

    public void run() {
        ReadMailUI readMailUI = this.f122812e;
        ((C79138l) C86312j.m106911c(C79138l.class)).px0(readMailUI, this.f122811d, readMailUI.getString(C0966R.string.b5q), (C44580q1) null);
    }
}
