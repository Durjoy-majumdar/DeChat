package com.tencent.p014mm.sdcard_migrate;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdcard_migrate.C115946a;
import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor;
import java.util.Random;
import vg3.C118676b;
import vg3.C118677e;

/* renamed from: com.tencent.mm.sdcard_migrate.d */
public class C115955d extends C115946a.C115948b {

    /* renamed from: a */
    public final /* synthetic */ ExtStorageMigrateAuxActivity f347889a;

    /* renamed from: com.tencent.mm.sdcard_migrate.d$a */
    public class C115956a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C115946a.C115947a f347890d;

        public C115956a(C115955d dVar, C115946a.C115947a aVar) {
            this.f347890d = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateAuxActivity", "[+] User click yes on step 1.", new Object[0]);
            ExtStorageMigrateMonitor.m105904c(1315, 104, 1);
            this.f347890d.mo176539a();
        }
    }

    /* renamed from: com.tencent.mm.sdcard_migrate.d$b */
    public class C115957b implements DialogInterface.OnClickListener {
        public C115957b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateAuxActivity", "[+] User click no on step 1.", new Object[0]);
            ExtStorageMigrateMonitor.m105904c(1315, 103, 1);
            ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity = C115955d.this.f347889a;
            Random random = ExtStorageMigrateAuxActivity.f347812j;
            extStorageMigrateAuxActivity.mo176465G7(false);
        }
    }

    public C115955d(ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity) {
        this.f347889a = extStorageMigrateAuxActivity;
    }

    /* renamed from: a */
    public void mo176540a(C115946a.C115947a aVar) {
        C118677e eVar = this.f347889a.f347818f;
        if (eVar != null && eVar.isShowing()) {
            this.f347889a.f347818f.dismiss();
        }
        ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity = this.f347889a;
        extStorageMigrateAuxActivity.f347818f = C118676b.m167363b(extStorageMigrateAuxActivity, ExtStorageMigrateAuxActivity.m163051F7(C0966R.string.chg), (String) null, ExtStorageMigrateAuxActivity.m163051F7(C0966R.string.chh), ExtStorageMigrateAuxActivity.m163051F7(C0966R.string.ch_), false, new C115956a(this, aVar), new C115957b());
    }
}
