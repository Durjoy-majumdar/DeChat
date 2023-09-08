package cf3;

import af3.C79525e;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.recovery.p952ui.RecoveryUI;
import com.tencent.p014mm.recoveryv2.C85670b;
import com.tencent.p014mm.recoveryv2.C85671c;
import com.tencent.p014mm.recoveryv2.C85672d;
import com.tencent.p014mm.recoveryv2.C85675e;
import com.tencent.p014mm.recoveryv2.C85692k;
import com.tencent.p014mm.recoveryv2.C85695l;
import com.tencent.p014mm.recoveryv2.RecoveryCrash;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.recovery.p477wx.C86036R;
import df3.C86274c;
import iv3.C87824b;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import k20.C9556a;
import zt3.C119157j;

/* renamed from: cf3.a */
public class C80031a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RecoveryUI f234468d;

    /* renamed from: cf3.a$a */
    public class C80032a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CountDownLatch f234469d;

        /* renamed from: cf3.a$a$a */
        public class C80033a implements Runnable {

            /* renamed from: cf3.a$a$a$a */
            public class C80034a implements View.OnClickListener {
                public C80034a() {
                }

                public void onClick(View view) {
                    RecoveryUI recoveryUI;
                    RecoveryUI recoveryUI2 = C80031a.this.f234468d;
                    int i = RecoveryUI.f249620i;
                    recoveryUI2.getClass();
                    C85671c.m105784b("MicroMsg.recovery.ui", "restart WeChat");
                    C85672d.C85674b bVar = new C85672d.C85674b(recoveryUI2.getApplication(), "recovery_statistic");
                    bVar.mo119256e();
                    int i2 = bVar.getInt("crash_count", 0);
                    boolean z = bVar.getBoolean("launch_recovery", false);
                    boolean z2 = bVar.getBoolean("launch_recovery_real", false);
                    bVar.getBoolean("recover_from_crash", false);
                    int i3 = bVar.getInt("recovery_status", -1);
                    int i4 = bVar.getInt("recovery_from", 0);
                    RecoveryUI recoveryUI3 = recoveryUI2;
                    int i5 = bVar.getInt("recover_internal_status", 0);
                    long j = bVar.getLong("recover_running_time", 0);
                    bVar.getBoolean("recover_is_discard", false);
                    bVar.mo119258g("crash_count", (long) i2);
                    bVar.putBoolean("launch_recovery", z);
                    bVar.putBoolean("launch_recovery_real", z2);
                    bVar.putBoolean("recover_from_crash", true);
                    bVar.putInt("recovery_status", i3);
                    bVar.putInt("recovery_from", i4);
                    bVar.putInt("recover_internal_status", i5);
                    bVar.putInt("recover_launch_mode", bVar.getInt("recover_launch_mode", 0));
                    bVar.putLong("recover_running_time", j);
                    bVar.putBoolean("recover_is_discard", false);
                    bVar.putString("recover_app_ver", bVar.getString("recover_app_ver", ""));
                    bVar.mo119242c();
                    C85671c.m105783a(recoveryUI3.getApplicationContext());
                    Intent launchIntentForPackage = recoveryUI3.getApplication().getPackageManager().getLaunchIntentForPackage(recoveryUI3.getPackageName());
                    if (launchIntentForPackage != null) {
                        launchIntentForPackage.addFlags(268468224);
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(launchIntentForPackage);
                        C117292a.m165358d(recoveryUI3, aVar.mo10232b(), "com/tencent/mm/recovery/ui/RecoveryUI", "restart", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        recoveryUI = recoveryUI3;
                        recoveryUI.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(recoveryUI, "com/tencent/mm/recovery/ui/RecoveryUI", "restart", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        recoveryUI.overridePendingTransition(0, 0);
                    } else {
                        recoveryUI = recoveryUI3;
                    }
                    recoveryUI.finish();
                }
            }

            public C80033a() {
            }

            public void run() {
                if (!C80031a.this.f234468d.isFinishing()) {
                    RecoveryUI recoveryUI = C80031a.this.f234468d;
                    int i = RecoveryUI.f249620i;
                    recoveryUI.f249623f.setClickable(true);
                    recoveryUI.f249623f.setVisibility(0);
                    recoveryUI.f249624g.setVisibility(8);
                    RecoveryUI recoveryUI2 = C80031a.this.f234468d;
                    recoveryUI2.f249622e.setText(recoveryUI2.getResources().getString(C86036R.string.hvf));
                    RecoveryUI recoveryUI3 = C80031a.this.f234468d;
                    recoveryUI3.f249623f.setText(recoveryUI3.getResources().getString(C86036R.string.hva));
                    C80031a.this.f234468d.f249623f.setOnClickListener(new C80034a());
                }
            }
        }

        public C80032a(CountDownLatch countDownLatch) {
            this.f234469d = countDownLatch;
        }

        public void run() {
            if (this.f234469d.getCount() > 0) {
                try {
                    this.f234469d.await(10000, TimeUnit.MILLISECONDS);
                } catch (Throwable unused) {
                }
            }
            C80031a.this.f234468d.f249622e.post(new C80033a());
        }
    }

    /* renamed from: cf3.a$b */
    public class C80035b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CountDownLatch f234473d;

        public C80035b(C80031a aVar, CountDownLatch countDownLatch) {
            this.f234473d = countDownLatch;
        }

        public void run() {
            this.f234473d.countDown();
        }
    }

    /* renamed from: cf3.a$c */
    public class C80036c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CountDownLatch f234474d;

        public C80036c(CountDownLatch countDownLatch) {
            this.f234474d = countDownLatch;
        }

        public void run() {
            RecoveryUI recoveryUI = C80031a.this.f234468d;
            int i = RecoveryUI.f249620i;
            recoveryUI.getClass();
            try {
                C85675e eVar = new C85675e(recoveryUI);
                StringBuilder sb = new StringBuilder();
                sb.append("crash count = ");
                RecoveryCrash.Record record = recoveryUI.f249625h;
                sb.append(record == null ? 0 : record.f249630d);
                sb.append(", recovery setting = ");
                sb.append(eVar.f249647b);
                C85671c.m105784b("MicroMsg.recovery.ui", sb.toString());
                RecoveryCrash.Record record2 = recoveryUI.f249625h;
                if (record2 != null && record2.f249630d >= eVar.f249647b) {
                    C85671c.m105784b("MicroMsg.recovery.ui", "clean tinker path (if exists)");
                    C87824b.m109279a(C80589e.f235760a);
                    C85671c.m105784b("MicroMsg.recovery.ui", "clean tinker path done");
                }
                for (Map.Entry entry : ((HashMap) C85695l.m105842a().f249699c).entrySet()) {
                    C86274c cVar = (C86274c) entry.getValue();
                    cVar.mo14949a(recoveryUI.getApplicationContext());
                    String str = "on recovery fallback, operation: \n" + cVar.getDescription();
                    Log.m105928w("MicroMsg.recovery.ui", str);
                    C85692k.C85693a.m105840a(5, "MicroMsg.recovery.ui", str);
                    if (recoveryUI.f249625h != null) {
                        C85670b.m105782a(recoveryUI.getApplicationContext(), (String) entry.getKey(), recoveryUI.f249625h, (C86274c) entry.getValue());
                    }
                }
            } catch (Throwable unused) {
            }
            RecoveryCrash b = RecoveryCrash.m105765b(C80031a.this.f234468d.getApplication());
            b.mo119229d();
            b.mo119230e();
            this.f234474d.countDown();
        }
    }

    /* renamed from: cf3.a$d */
    public class C80037d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CountDownLatch f234476d;

        public C80037d(CountDownLatch countDownLatch) {
            this.f234476d = countDownLatch;
        }

        public void run() {
            RecoveryUI recoveryUI = C80031a.this.f234468d;
            int i = RecoveryUI.f249620i;
            recoveryUI.getClass();
            int[] iArr = {0};
            try {
                C80038b bVar = new C80038b(recoveryUI, iArr);
                Intent intent = recoveryUI.getIntent();
                String stringExtra = intent.getStringExtra("extra_patch_url");
                String dataString = TextUtils.isEmpty(stringExtra) ? intent.getDataString() : stringExtra;
                if (TextUtils.isEmpty(dataString)) {
                    C85671c.m105784b("MicroMsg.recovery.ui", "#fetchTinkerPatch fetch patch url with cgi");
                    C79525e.m96548c(recoveryUI.getApplicationContext(), bVar);
                } else {
                    C85671c.m105784b("MicroMsg.recovery.ui", "#fetchTinkerPatch download patch with given url, url = " + dataString);
                    C79525e.m96547b(recoveryUI.getApplicationContext(), dataString, 0, (String) null, bVar, true);
                }
            } catch (Throwable th) {
                C85671c.m105785c("MicroMsg.recovery.ui", "fetch error", th);
                iArr[0] = 10;
            }
            C85671c.m105784b("MicroMsg.recovery.ui", "#fetchTinkerPatch done, status = " + iArr[0]);
            C85672d.C85674b bVar2 = new C85672d.C85674b(recoveryUI.getApplication(), "recovery_statistic");
            bVar2.mo119256e();
            int i2 = bVar2.getInt("crash_count", 0);
            boolean z = bVar2.getBoolean("launch_recovery", false);
            boolean z2 = bVar2.getBoolean("launch_recovery_real", false);
            boolean z3 = bVar2.getBoolean("recover_from_crash", false);
            bVar2.getInt("recovery_status", -1);
            int i3 = bVar2.getInt("recovery_from", 0);
            int i4 = bVar2.getInt("recover_internal_status", 0);
            int i5 = bVar2.getInt("recover_launch_mode", 0);
            long j = bVar2.getLong("recover_running_time", 0);
            bVar2.getBoolean("recover_is_discard", false);
            String string = bVar2.getString("recover_app_ver", "");
            int i6 = iArr[0];
            bVar2.mo119258g("crash_count", (long) i2);
            bVar2.putBoolean("launch_recovery", z);
            bVar2.putBoolean("launch_recovery_real", z2);
            bVar2.putBoolean("recover_from_crash", z3);
            bVar2.mo119258g("recovery_status", (long) i6);
            bVar2.mo119258g("recovery_from", (long) i3);
            bVar2.mo119258g("recover_internal_status", (long) i4);
            bVar2.mo119258g("recover_launch_mode", (long) i5);
            bVar2.mo119258g("recover_running_time", j);
            bVar2.putBoolean("recover_is_discard", false);
            bVar2.putString("recover_app_ver", string);
            bVar2.mo119242c();
            this.f234476d.countDown();
        }
    }

    public C80031a(RecoveryUI recoveryUI) {
        this.f234468d = recoveryUI;
    }

    public void onClick(View view) {
        RecoveryUI recoveryUI = this.f234468d;
        recoveryUI.f249623f.setClickable(false);
        recoveryUI.f249623f.setVisibility(8);
        recoveryUI.f249624g.setVisibility(0);
        RecoveryUI recoveryUI2 = this.f234468d;
        recoveryUI2.f249622e.setText(recoveryUI2.getResources().getString(C86036R.string.hve));
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ((C119157j) C119157j.f356862d).mo183875f(new C80032a(countDownLatch));
        this.f234468d.f249622e.postDelayed(new C80035b(this, countDownLatch), 3000);
        ((C119157j) C119157j.f356862d).mo183875f(new C80036c(countDownLatch));
        ((C119157j) C119157j.f356862d).mo183875f(new C80037d(countDownLatch));
    }
}
