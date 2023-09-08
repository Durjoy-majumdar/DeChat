package dg2;

import android.content.SharedPreferences;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCLong;
import com.tencent.p014mm.plugin.qqmail.p090ui.ReadMailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import zf2.C16158d;

/* renamed from: dg2.k */
public class C86281k implements C1256g<IPCLong> {

    /* renamed from: d */
    public final /* synthetic */ ReadMailUI f250896d;

    public C86281k(ReadMailUI readMailUI) {
        this.f250896d = readMailUI;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        IPCLong iPCLong = (IPCLong) obj;
        if (!this.f250896d.isFinishing() && !this.f250896d.isDestroyed()) {
            ReadMailUI readMailUI = this.f250896d;
            long j = iPCLong.f10314d;
            readMailUI.f248808D = j;
            if (j <= 0) {
                Log.m105921e("MicroMsg.ReadMailUI", "doAddDownloadTask fail, downloadId = %d ", Long.valueOf(j));
                return;
            }
            readMailUI.f248813I = MMApplicationContext.getContext().getSharedPreferences("QQMAIL", 4);
            SharedPreferences sharedPreferences = this.f250896d.f248813I;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putLong("qqmail_downloadid", this.f250896d.f248808D).commit();
            }
            ReadMailUI readMailUI2 = this.f250896d;
            readMailUI2.f248812H = 1;
            C80907o.m98781d(MMApplicationContext.getPackageName(), new IPCLong(readMailUI2.f248808D), C16158d.class, new C86285n(readMailUI2));
        }
    }
}
