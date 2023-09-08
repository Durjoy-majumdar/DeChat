package com.tencent.p014mm.plugin.qqmail.p090ui;

import android.os.Bundle;
import com.tencent.p014mm.plugin.qqmail.p090ui.ReadMailUI;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.k */
public class C85401k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f248859d;

    /* renamed from: e */
    public final /* synthetic */ ReadMailUI.C85384c f248860e;

    public C85401k(ReadMailUI.C85384c cVar, Bundle bundle) {
        this.f248860e = cVar;
        this.f248859d = bundle;
    }

    public void run() {
        Bundle bundle = this.f248859d;
        if (bundle != null) {
            ReadMailUI.this.f248809E = bundle.getInt("download_status");
            ReadMailUI.this.f248810F = this.f248859d.getString("download_apk_path", "");
        }
        ReadMailUI readMailUI = ReadMailUI.this;
        if (readMailUI.f248809E == 3 && C86013q1.m106450k(readMailUI.f248810F)) {
            ReadMailUI readMailUI2 = ReadMailUI.this;
            readMailUI2.f248812H = 2;
            readMailUI2.mo118703L7();
        }
    }
}
