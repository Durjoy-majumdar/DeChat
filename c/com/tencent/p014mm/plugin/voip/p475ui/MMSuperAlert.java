package com.tencent.p014mm.plugin.voip.p475ui;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import nj3.C76879j;
import nj3.C88989a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.voip.ui.MMSuperAlert */
public class MMSuperAlert extends HellActivity {

    /* renamed from: d */
    public static final /* synthetic */ int f317798d = 0;

    /* renamed from: com.tencent.mm.plugin.voip.ui.MMSuperAlert$a */
    public class C106402a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f317799d;

        /* renamed from: e */
        public final /* synthetic */ int f317800e;

        /* renamed from: f */
        public final /* synthetic */ boolean f317801f;

        /* renamed from: com.tencent.mm.plugin.voip.ui.MMSuperAlert$a$a */
        public class C106403a implements DialogInterface.OnClickListener {
            public C106403a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                MMSuperAlert.this.finish();
            }
        }

        /* renamed from: com.tencent.mm.plugin.voip.ui.MMSuperAlert$a$b */
        public class C106404b implements DialogInterface.OnClickListener {
            public C106404b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                MMSuperAlert.this.finish();
            }
        }

        public C106402a(int i, int i2, boolean z) {
            this.f317799d = i;
            this.f317800e = i2;
            this.f317801f = z;
        }

        public void run() {
            int i = this.f317799d;
            String str = "";
            String string = i == 0 ? str : MMSuperAlert.this.getString(i);
            int i2 = this.f317800e;
            if (i2 != 0) {
                str = MMSuperAlert.this.getString(i2);
            }
            C76879j.m92714H(MMSuperAlert.this, string, str, this.f317801f, new C106403a(), new C106404b());
        }
    }

    public Resources getResources() {
        return (getAssets() == null || MMApplicationContext.getResources() == null) ? super.getResources() : MMApplicationContext.getResources();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0966R.C0971layout.bfn);
        new MMHandler().postDelayed(new C106402a(getIntent().getIntExtra("MMSuperAlert_msg", 0), getIntent().getIntExtra("MMSuperAlert_title", 0), getIntent().getBooleanExtra("MMSuperAlert_cancelable", true)), 50);
    }
}
