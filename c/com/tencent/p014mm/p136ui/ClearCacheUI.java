package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.ClearCacheUI */
public class ClearCacheUI extends MMBaseActivity {

    /* renamed from: e */
    public static final /* synthetic */ int f348052e = 0;

    /* renamed from: com.tencent.mm.ui.ClearCacheUI$a */
    public class C116034a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ long f348053d;

        public C116034a(long j) {
            this.f348053d = j;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ClearCacheUI clearCacheUI = ClearCacheUI.this;
            long j = this.f348053d;
            int i2 = ClearCacheUI.f348052e;
            clearCacheUI.getClass();
            ThreadPool.post(new C116111t(clearCacheUI, j), "CleanCacheUIThread");
            ClearCacheUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.ClearCacheUI$b */
    public class C116035b implements DialogInterface.OnClickListener {
        public C116035b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ClearCacheUI.this.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C76879j.m92709C(this, getIntent().getStringExtra("key_message"), getString(C0966R.string.bfc), getString(C0966R.string.bfb), getString(C0966R.string.bf_), false, new C116034a(getIntent().getLongExtra("key_mask", 0)), new C116035b());
    }
}
