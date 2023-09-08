package com.tencent.p014mm.recovery.p952ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import cf3.C80031a;
import com.tencent.p014mm.recoveryv2.C85671c;
import com.tencent.p014mm.recoveryv2.C85672d;
import com.tencent.p014mm.recoveryv2.RecoveryCrash;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.recovery.p477wx.C86036R;

/* renamed from: com.tencent.mm.recovery.ui.RecoveryUI */
public class RecoveryUI extends AppCompatActivity {

    /* renamed from: i */
    public static final /* synthetic */ int f249620i = 0;

    /* renamed from: d */
    public TextView f249621d;

    /* renamed from: e */
    public TextView f249622e;

    /* renamed from: f */
    public Button f249623f;

    /* renamed from: g */
    public ProgressBar f249624g;

    /* renamed from: h */
    public RecoveryCrash.Record f249625h;

    public Resources getResources() {
        return MMApplicationContext.getResources() == null ? super.getResources() : MMApplicationContext.getResources();
    }

    public final void init() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        this.f249623f.setClickable(true);
        this.f249623f.setVisibility(0);
        this.f249624g.setVisibility(8);
        this.f249621d.setText(getResources().getString(C86036R.string.hvd));
        this.f249622e.setText(getResources().getString(C86036R.string.hvg));
        this.f249623f.setText(getResources().getString(C86036R.string.hvb));
        this.f249625h = (RecoveryCrash.Record) getIntent().getParcelableExtra("extra_crash_record");
        C85672d.C85674b bVar = new C85672d.C85674b(getApplication(), "recovery_statistic");
        bVar.mo119256e();
        int i = bVar.getInt("crash_count", 0);
        boolean z = bVar.getBoolean("launch_recovery", false);
        bVar.getBoolean("launch_recovery_real", false);
        boolean z2 = bVar.getBoolean("recover_from_crash", false);
        int i2 = bVar.getInt("recovery_status", -1);
        int i3 = bVar.getInt("recovery_from", 0);
        int i4 = bVar.getInt("recover_internal_status", 0);
        int i5 = bVar.getInt("recover_launch_mode", 0);
        long j = bVar.getLong("recover_running_time", 0);
        bVar.getBoolean("recover_is_discard", false);
        bVar.mo119258g("crash_count", (long) i);
        bVar.putBoolean("launch_recovery", z);
        bVar.putBoolean("launch_recovery_real", true);
        bVar.putBoolean("recover_from_crash", z2);
        bVar.mo119258g("recovery_status", (long) i2);
        bVar.mo119258g("recovery_from", (long) i3);
        bVar.mo119258g("recover_internal_status", (long) i4);
        bVar.mo119258g("recover_launch_mode", (long) i5);
        bVar.mo119258g("recover_running_time", j);
        bVar.putBoolean("recover_is_discard", false);
        bVar.putString("recover_app_ver", bVar.getString("recover_app_ver", ""));
        bVar.mo119242c();
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C85671c.m105784b("MicroMsg.recovery.ui", "activity onCreate, id = " + this);
        try {
            setRequestedOrientation(1);
        } catch (Throwable th) {
            C85671c.m105785c("MicroMsg.recovery.ui", "set portrait mode fail", th);
        }
        try {
            setContentView(C86036R.C86038layout.bu);
        } catch (Throwable th4) {
            C85671c.m105785c("MicroMsg.recovery.ui", "setContentView fail, try raw layout", th4);
            setContentView(C86036R.C86038layout.bv);
        }
        this.f249621d = (TextView) findViewById(C86036R.C86037id.f361870tv_main);
        this.f249622e = (TextView) findViewById(C86036R.C86037id.kyk);
        this.f249623f = (Button) findViewById(C86036R.C86037id.alz);
        this.f249624g = (ProgressBar) findViewById(C86036R.C86037id.i7z);
        this.f249623f.setOnClickListener(new C80031a(this));
        init();
    }

    public void onDestroy() {
        super.onDestroy();
        C85671c.m105784b("MicroMsg.recovery.ui", "activity onDestroy, id = " + this);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C85671c.m105784b("MicroMsg.recovery.ui", "activity onNewIntent, id = " + this);
    }
}
