package com.tencent.p014mm.sdcard_migrate;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdcard_migrate.C115946a;
import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateAuxActivity;
import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor;
import di3.C86312j;
import java.util.HashMap;
import java.util.Random;
import p385u2.C111105a;
import p447aw.C103918d;
import p918s2.C90111a;
import vg3.C118676b;
import vg3.C118677e;

/* renamed from: com.tencent.mm.sdcard_migrate.c */
public class C115950c extends C115946a.C115948b {

    /* renamed from: a */
    public final /* synthetic */ ExtStorageMigrateAuxActivity f347882a;

    /* renamed from: com.tencent.mm.sdcard_migrate.c$a */
    public class C115951a implements ExtStorageMigrateAuxActivity.C115931c {

        /* renamed from: a */
        public final /* synthetic */ C115946a.C115947a f347883a;

        /* renamed from: com.tencent.mm.sdcard_migrate.c$a$a */
        public class C115952a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ String f347885d;

            /* renamed from: com.tencent.mm.sdcard_migrate.c$a$a$a */
            public class C115953a implements ExtStorageMigrateAuxActivity.C115930b {
                public C115953a() {
                }

                /* renamed from: a */
                public void mo176481a(Intent intent) {
                    if (((C103918d) C86312j.m106911c(C103918d.class)).Gd0(ExtStorageMigrateAuxActivity.f347815p, C115952a.this.f347885d)) {
                        ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateAuxActivity", "[+] Back from settings, storage permission was granted.", new Object[0]);
                        C115951a.this.f347883a.mo176539a();
                        return;
                    }
                    ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateAuxActivity", "[+] Back from settings, storage permission was denied.", new Object[0]);
                    ExtStorageMigrateMonitor.m105904c(1315, 105, 1);
                    C115950c.this.f347882a.mo176465G7(false);
                }
            }

            public C115952a(String str) {
                this.f347885d = str;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateAuxActivity", "[+] User click yes on ask jump dlg.", new Object[0]);
                ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity = C115950c.this.f347882a;
                C115953a aVar = new C115953a();
                Random random = ExtStorageMigrateAuxActivity.f347812j;
                extStorageMigrateAuxActivity.getClass();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", extStorageMigrateAuxActivity.getPackageName(), (String) null));
                int H7 = ExtStorageMigrateAuxActivity.m163052H7();
                ((HashMap) extStorageMigrateAuxActivity.f347817e).put(Integer.valueOf(H7), aVar);
                extStorageMigrateAuxActivity.startActivityForResult(intent, H7);
            }
        }

        /* renamed from: com.tencent.mm.sdcard_migrate.c$a$b */
        public class C115954b implements DialogInterface.OnClickListener {
            public C115954b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateAuxActivity", "[+] User click no on ask jump dlg.", new Object[0]);
                ExtStorageMigrateMonitor.m105904c(1315, 105, 1);
                ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity = C115950c.this.f347882a;
                Random random = ExtStorageMigrateAuxActivity.f347812j;
                extStorageMigrateAuxActivity.mo176465G7(false);
            }
        }

        public C115951a(C115946a.C115947a aVar) {
            this.f347883a = aVar;
        }

        /* renamed from: a */
        public void mo176482a(String str) {
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateAuxActivity", "[+] User click yes on permission dlg.", new Object[0]);
            this.f347883a.mo176539a();
        }

        /* renamed from: b */
        public void mo176483b(String str, boolean z) {
            if (z) {
                ExtStorageMigrateMonitor.m105904c(1315, 106, 1);
                C118677e eVar = C115950c.this.f347882a.f347818f;
                if (eVar != null && eVar.isShowing()) {
                    C115950c.this.f347882a.f347818f.dismiss();
                }
                ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity = C115950c.this.f347882a;
                extStorageMigrateAuxActivity.f347818f = C118676b.m167363b(extStorageMigrateAuxActivity, ExtStorageMigrateAuxActivity.m163051F7(C0966R.string.chk), (String) null, ExtStorageMigrateAuxActivity.m163051F7(C0966R.string.chc), ExtStorageMigrateAuxActivity.m163051F7(C0966R.string.ch_), false, new C115952a(str), new C115954b());
                return;
            }
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateAuxActivity", "[+] User click no on permission dlg.", new Object[0]);
            ExtStorageMigrateMonitor.m105904c(1315, 105, 1);
            ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity2 = C115950c.this.f347882a;
            Random random = ExtStorageMigrateAuxActivity.f347812j;
            extStorageMigrateAuxActivity2.mo176465G7(false);
        }
    }

    public C115950c(ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity) {
        this.f347882a = extStorageMigrateAuxActivity;
    }

    /* renamed from: a */
    public void mo176540a(C115946a.C115947a aVar) {
        ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity = this.f347882a;
        C115951a aVar2 = new C115951a(aVar);
        Random random = ExtStorageMigrateAuxActivity.f347812j;
        extStorageMigrateAuxActivity.getClass();
        if (C111105a.m151499a(ExtStorageMigrateAuxActivity.f347815p, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            aVar2.mo176482a("android.permission.READ_EXTERNAL_STORAGE");
            return;
        }
        int H7 = ExtStorageMigrateAuxActivity.m163052H7();
        ((HashMap) extStorageMigrateAuxActivity.f347816d).put(Integer.valueOf(H7), aVar2);
        C90111a.m112741e(extStorageMigrateAuxActivity, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, H7);
    }
}
