package com.tencent.p014mm.sdcard_migrate;

import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.sdcard_migrate.C115961h;
import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor;
import com.tencent.p014mm.sdcard_migrate.util.ExtStorageMigrateException;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import nj3.C88989a;
import p918s2.C90111a;
import vg3.C118675a;
import vg3.C118676b;
import vg3.C118677e;

@C88989a(7)
/* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateAuxActivity */
public class ExtStorageMigrateAuxActivity extends HellActivity {

    /* renamed from: j */
    public static final Random f347812j = new Random();

    /* renamed from: n */
    public static final Set<Integer> f347813n = new HashSet(5);

    /* renamed from: o */
    public static WeakReference<ExtStorageMigrateAuxActivity> f347814o = null;

    /* renamed from: p */
    public static Context f347815p = null;

    /* renamed from: d */
    public final Map<Integer, C115931c> f347816d = new HashMap();

    /* renamed from: e */
    public final Map<Integer, C115930b> f347817e = new HashMap();

    /* renamed from: f */
    public C118677e f347818f = null;

    /* renamed from: g */
    public boolean f347819g = false;

    /* renamed from: h */
    public C115929a f347820h = new C115929a(this, false);

    /* renamed from: i */
    public AuxMigrateResultCallback f347821i = new AuxMigrateResultCallback(this);

    /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateAuxActivity$AuxMigrateResultCallback */
    public static final class AuxMigrateResultCallback extends MigrateResultCallbackAdapter {

        /* renamed from: e */
        public final WeakReference<ExtStorageMigrateAuxActivity> f347822e;

        /* renamed from: f */
        public int f347823f = 0;

        /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateAuxActivity$AuxMigrateResultCallback$a */
        public class C115925a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ExtStorageMigrateAuxActivity f347824d;

            public C115925a(AuxMigrateResultCallback auxMigrateResultCallback, ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity) {
                this.f347824d = extStorageMigrateAuxActivity;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateAuxActivity", "[+] User click cancel on migrating dlg.", new Object[0]);
                ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity = this.f347824d;
                Random random = ExtStorageMigrateAuxActivity.f347812j;
                extStorageMigrateAuxActivity.mo176465G7(false);
            }
        }

        /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateAuxActivity$AuxMigrateResultCallback$b */
        public class C115926b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ExtStorageMigrateAuxActivity f347825d;

            public C115926b(AuxMigrateResultCallback auxMigrateResultCallback, ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity) {
                this.f347825d = extStorageMigrateAuxActivity;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                ExtStorageMigrateRoutine.startWeChat(this.f347825d);
                ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity = this.f347825d;
                Random random = ExtStorageMigrateAuxActivity.f347812j;
                ((NotificationManager) extStorageMigrateAuxActivity.getSystemService("notification")).cancel(ExtStorageMigrateRoutine.NOTIFICATION_TASK_ID);
                this.f347825d.finish();
            }
        }

        /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateAuxActivity$AuxMigrateResultCallback$c */
        public class C115927c implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ExtStorageMigrateAuxActivity f347826d;

            public C115927c(AuxMigrateResultCallback auxMigrateResultCallback, ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity) {
                this.f347826d = extStorageMigrateAuxActivity;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                ExtStorageMigrateRoutine.startWeChat(this.f347826d);
                ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity = this.f347826d;
                Random random = ExtStorageMigrateAuxActivity.f347812j;
                ((NotificationManager) extStorageMigrateAuxActivity.getSystemService("notification")).cancel(ExtStorageMigrateRoutine.NOTIFICATION_TASK_ID);
                this.f347826d.finish();
            }
        }

        /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateAuxActivity$AuxMigrateResultCallback$d */
        public class C115928d implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ExtStorageMigrateAuxActivity f347827d;

            public C115928d(AuxMigrateResultCallback auxMigrateResultCallback, ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity) {
                this.f347827d = extStorageMigrateAuxActivity;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                ExtStorageMigrateRoutine.startWeChat(this.f347827d);
                ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity = this.f347827d;
                Random random = ExtStorageMigrateAuxActivity.f347812j;
                ((NotificationManager) extStorageMigrateAuxActivity.getSystemService("notification")).cancel(ExtStorageMigrateRoutine.NOTIFICATION_TASK_ID);
                this.f347827d.finish();
            }
        }

        public AuxMigrateResultCallback(ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity) {
            this.f347822e = new WeakReference<>(extStorageMigrateAuxActivity);
        }

        /* renamed from: a */
        public void mo176468a(int i, int i2) {
            ExtStorageMigrateMonitor.C85725b bVar = ExtStorageMigrateMonitor.f249775e;
            ((ExtStorageMigrateMonitor.C85724a) bVar).mo119343e("MicroMsg.ExtStorageMigrateAuxActivity", "[!] MigrateCallback was overrided, old_attached_pid: %s, new_attached_pid: %s", Integer.valueOf(i), Integer.valueOf(i2));
        }

        /* renamed from: c */
        public void mo176469c(int i) {
            if (i == 3 || i == 2) {
                ExtStorageMigrateMonitor.m105904c(1315, 108, 1);
            }
            ExtStorageMigrateAuxActivity p = mo176474p();
            if (p != null) {
                C118677e eVar = p.f347818f;
                if (eVar != null && eVar.isShowing()) {
                    p.f347818f.dismiss();
                }
                p.f347818f = C118676b.m167364c(p, ExtStorageMigrateAuxActivity.m163051F7(C0966R.string.cha), (String) null, false, new C115926b(this, p));
            }
        }

        /* renamed from: e */
        public void mo176470e(int i, ExtStorageMigrateException extStorageMigrateException) {
            switch (i) {
                case 4:
                    ExtStorageMigrateMonitor.m105904c(1315, 109, 1);
                    break;
                case 5:
                    ExtStorageMigrateMonitor.m105904c(1315, 113, 1);
                    break;
                case 6:
                    ExtStorageMigrateMonitor.m105904c(1315, 110, 1);
                    break;
                case 7:
                    ExtStorageMigrateMonitor.m105904c(1315, 111, 1);
                    break;
                case 8:
                    ExtStorageMigrateMonitor.m105904c(1315, 112, 1);
                    break;
            }
            ExtStorageMigrateAuxActivity p = mo176474p();
            if (p != null) {
                C118677e eVar = p.f347818f;
                if (eVar != null && eVar.isShowing()) {
                    p.f347818f.dismiss();
                }
                p.f347818f = C118676b.m167364c(p, i == 6 ? ExtStorageMigrateAuxActivity.m163051F7(C0966R.string.chd) : ExtStorageMigrateAuxActivity.m163051F7(C0966R.string.chb), (String) null, false, new C115927c(this, p));
            }
        }

        /* renamed from: f */
        public void mo176471f(int i) {
            C118677e eVar;
            ExtStorageMigrateAuxActivity p = mo176474p();
            if (p != null && (eVar = p.f347818f) != null && eVar.isShowing()) {
                String F7 = ExtStorageMigrateAuxActivity.m163051F7(C0966R.string.che);
                String format = String.format(F7, new Object[]{i + "%"});
                String str = null;
                int i2 = this.f347823f;
                if (i2 == 0) {
                    this.f347823f = 1;
                    str = "—";
                } else if (i2 == 1) {
                    this.f347823f = 2;
                    str = "\\";
                } else if (i2 == 2) {
                    this.f347823f = 3;
                    str = "|";
                } else if (i2 == 3) {
                    this.f347823f = 0;
                    str = "/";
                }
                p.f347818f.mo183394c(format);
                C118677e eVar2 = p.f347818f;
                eVar2.f355123o.setVisibility(0);
                eVar2.f355121j.setVisibility(0);
                eVar2.f355121j.setText(str);
            }
        }

        /* renamed from: g */
        public void mo176472g(String str, String str2) {
            ExtStorageMigrateAuxActivity p = mo176474p();
            if (p != null) {
                C118677e eVar = p.f347818f;
                if (eVar != null && eVar.isShowing()) {
                    p.f347818f.dismiss();
                }
                String F7 = ExtStorageMigrateAuxActivity.m163051F7(C0966R.string.chf);
                String F72 = ExtStorageMigrateAuxActivity.m163051F7(C0966R.string.f7926wf);
                C115925a aVar = new C115925a(this, p);
                C118677e eVar2 = null;
                if (!p.isFinishing()) {
                    C118675a aVar2 = new C118675a();
                    aVar2.f355108a = null;
                    aVar2.f355109b = F7;
                    aVar2.f355110c = F72;
                    aVar2.f355113f = aVar;
                    aVar2.f355112e = false;
                    eVar2 = new C118677e(p, C0966R.style.a66);
                    eVar2.mo183393a(aVar2);
                    eVar2.show();
                    C118676b.m167362a(p, eVar2);
                }
                p.f347818f = eVar2;
            }
        }

        /* renamed from: j */
        public void mo176473j() {
            ExtStorageMigrateMonitor.m105904c(1315, 107, 1);
            MultiProcessMMKV.getMMKV("extmig_status_memo_storage").encode("key_indicate_rescan_needed_by_migrate_routine", true);
            ExtStorageMigrateAuxActivity p = mo176474p();
            if (p != null) {
                C118677e eVar = p.f347818f;
                if (eVar != null && eVar.isShowing()) {
                    p.f347818f.dismiss();
                }
                p.f347818f = C118676b.m167364c(p, ExtStorageMigrateAuxActivity.m163051F7(C0966R.string.chj), (String) null, false, new C115928d(this, p));
            }
        }

        /* renamed from: p */
        public final ExtStorageMigrateAuxActivity mo176474p() {
            ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity = this.f347822e.get();
            if (extStorageMigrateAuxActivity == null || extStorageMigrateAuxActivity.isFinishing() || extStorageMigrateAuxActivity.isDestroyed()) {
                return null;
            }
            return extStorageMigrateAuxActivity;
        }
    }

    /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateAuxActivity$a */
    public static final class C115929a implements ServiceConnection {

        /* renamed from: d */
        public final WeakReference<ExtStorageMigrateAuxActivity> f347828d;

        /* renamed from: e */
        public final boolean f347829e;

        /* renamed from: f */
        public C115961h f347830f = null;

        public C115929a(ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity, boolean z) {
            this.f347828d = new WeakReference<>(extStorageMigrateAuxActivity);
            this.f347829e = z;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity = this.f347828d.get();
            C115961h hVar = null;
            if (extStorageMigrateAuxActivity == null || extStorageMigrateAuxActivity.isFinishing() || extStorageMigrateAuxActivity.isDestroyed()) {
                extStorageMigrateAuxActivity = null;
            }
            if (extStorageMigrateAuxActivity != null) {
                int i = C115961h.C115962a.f347893d;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.sdcard_migrate.IMigrateServiceController");
                    hVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C115961h)) ? new C115961h.C115962a.C115963a(iBinder) : (C115961h) queryLocalInterface;
                }
                this.f347830f = hVar;
                if (this.f347829e) {
                    ExtStorageMigrateAuxActivity.m163050E7(extStorageMigrateAuxActivity, hVar, false);
                    return;
                }
                try {
                    hVar.mo176511uR(extStorageMigrateAuxActivity.f347821i);
                    if (hVar.G90()) {
                        return;
                    }
                } catch (Throwable th) {
                    ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119342d("MicroMsg.ExtStorageMigrateAuxActivity", th, "[-] Exception occurred, do questionnaire.", new Object[0]);
                }
                C115946a aVar = new C115946a(new C115955d(extStorageMigrateAuxActivity));
                ((ArrayList) aVar.f347876a).add(new C115950c(extStorageMigrateAuxActivity));
                ((ArrayList) aVar.f347876a).add(new C115949b(extStorageMigrateAuxActivity, hVar));
                aVar.f347878c.mo176539a();
                return;
            }
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119340b("MicroMsg.ExtStorageMigrateAuxActivity", "[-] Fail to get aux ui instance in onServiceConnected", new Object[0]);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Object[] objArr = {componentName};
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119343e("MicroMsg.ExtStorageMigrateAuxActivity", "[!] Service [%s] disconnected.", objArr);
            ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity = this.f347828d.get();
            if (extStorageMigrateAuxActivity != null && !extStorageMigrateAuxActivity.isFinishing()) {
                extStorageMigrateAuxActivity.isDestroyed();
            }
        }
    }

    /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateAuxActivity$b */
    public interface C115930b {
        /* renamed from: a */
        void mo176481a(Intent intent);
    }

    /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateAuxActivity$c */
    public interface C115931c {
        /* renamed from: a */
        void mo176482a(String str);

        /* renamed from: b */
        void mo176483b(String str, boolean z);
    }

    /* renamed from: E7 */
    public static void m163050E7(ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity, C115961h hVar, boolean z) {
        extStorageMigrateAuxActivity.getClass();
        try {
            hVar.mo176511uR(extStorageMigrateAuxActivity.f347821i);
            hVar.mo176510dx(ExtStorageMigrateRoutine.DEFAULT_CONFIG);
        } catch (RemoteException e) {
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119342d("MicroMsg.ExtStorageMigrateAuxActivity", e, "[-] Exception occurred, try to rebind.", new Object[0]);
            if (z) {
                ExtStorageMigrateRoutine.startupMigrationService(f347815p);
                C115929a aVar = new C115929a(extStorageMigrateAuxActivity, true);
                extStorageMigrateAuxActivity.f347820h = aVar;
                ExtStorageMigrateRoutine.bindMigrationService(f347815p, aVar);
                return;
            }
            try {
                extStorageMigrateAuxActivity.f347821i.mo176532m(5, new ExtStorageMigrateException(e));
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: F7 */
    public static String m163051F7(int i) {
        return MMApplicationContext.getResources().getString(i);
    }

    /* renamed from: H7 */
    public static int m163052H7() {
        while (true) {
            int nextInt = (int) (((long) f347812j.nextInt()) + (System.nanoTime() & Util.MAX_32BIT_VALUE));
            if (nextInt < 0) {
                nextInt = -nextInt;
            }
            if (nextInt != 0) {
                Set<Integer> set = f347813n;
                if (!((HashSet) set).contains(Integer.valueOf(nextInt))) {
                    ((HashSet) set).add(Integer.valueOf(nextInt));
                    return nextInt;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: G7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo176465G7(boolean r4) {
        /*
            r3 = this;
            vg3.e r0 = r3.f347818f
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x000f
            vg3.e r0 = r3.f347818f
            r0.dismiss()
        L_0x000f:
            com.tencent.mm.sdcard_migrate.ExtStorageMigrateAuxActivity$a r0 = r3.f347820h
            com.tencent.mm.sdcard_migrate.h r0 = r0.f347830f
            r1 = 0
            if (r0 == 0) goto L_0x0025
            android.os.IBinder r2 = r0.asBinder()
            boolean r2 = r2.isBinderAlive()
            if (r2 == 0) goto L_0x0025
            r0.vh0()     // Catch:{ all -> 0x0025 }
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            com.tencent.mm.sdcard_migrate.ExtStorageMigrateAuxActivity$a r2 = r3.f347820h     // Catch:{ all -> 0x002c }
            r3.unbindService(r2)     // Catch:{ all -> 0x002c }
            goto L_0x002d
        L_0x002c:
        L_0x002d:
            if (r0 != 0) goto L_0x0034
            android.content.Context r0 = f347815p
            com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateRoutine.cancelMigration(r0)
        L_0x0034:
            java.lang.String r0 = "extmig_status_memo_storage"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r2 = "key_indicate_migrating_by_migrate_routine"
            r0.encode((java.lang.String) r2, (boolean) r1)
            if (r4 == 0) goto L_0x0047
            com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateRoutine.startWeChat(r3)
            r3.finish()
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateAuxActivity.mo176465G7(boolean):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C115930b bVar = (C115930b) ((HashMap) this.f347817e).get(Integer.valueOf(i));
        if (bVar == null) {
            ExtStorageMigrateMonitor.C85725b bVar2 = ExtStorageMigrateMonitor.f249775e;
            ((ExtStorageMigrateMonitor.C85724a) bVar2).mo119340b("MicroMsg.ExtStorageMigrateAuxActivity", "[-] Unknown ticket: %s.", Integer.valueOf(i));
            return;
        }
        bVar.mo176481a(intent);
        ((HashSet) f347813n).remove(Integer.valueOf(i));
        ((HashMap) this.f347817e).remove(Integer.valueOf(i));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ExtStorageMigrateMonitor.C85724a aVar = (ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e;
        aVar.mo119341c("MicroMsg.ExtStorageMigrateAuxActivity", "[+] onCreate called. object: %s", this);
        f347815p = getApplicationContext();
        LocaleUtil.initLanguage(this);
        setContentView(C0966R.C0971layout.bbk);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        WeakReference<ExtStorageMigrateAuxActivity> weakReference = f347814o;
        ExtStorageMigrateAuxActivity extStorageMigrateAuxActivity = weakReference != null ? weakReference.get() : null;
        if (extStorageMigrateAuxActivity == null || extStorageMigrateAuxActivity.isFinishing() || extStorageMigrateAuxActivity.isDestroyed()) {
            f347814o = new WeakReference<>(this);
        } else if (extStorageMigrateAuxActivity != this) {
            aVar.mo119343e("MicroMsg.ExtStorageMigrateAuxActivity", "[!] Duplicated instance. [latest: %s, prev: %s] Finish latest one.", this, extStorageMigrateAuxActivity);
            finish();
            return;
        }
        ((HashSet) f347813n).clear();
        ((HashMap) this.f347816d).clear();
        ((HashMap) this.f347817e).clear();
        C118677e eVar = this.f347818f;
        if (eVar != null) {
            eVar.dismiss();
            this.f347818f = null;
        }
        this.f347819g = false;
    }

    public void onDestroy() {
        Object[] objArr = {this};
        ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateAuxActivity", "[+] onDestroy called. object: %s", objArr);
        super.onDestroy();
        C118677e eVar = this.f347818f;
        if (eVar != null) {
            eVar.dismiss();
            this.f347818f = null;
        }
        mo176465G7(false);
        ((HashMap) this.f347817e).clear();
        ((HashMap) this.f347816d).clear();
        ExtStorageMigrateMonitor.m105903b();
    }

    public void onNewIntent(Intent intent) {
        Object[] objArr = {this};
        ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateAuxActivity", "[+] onNewIntent called. object: %s", objArr);
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C115931c cVar = (C115931c) ((HashMap) this.f347816d).get(Integer.valueOf(i));
        if (cVar == null) {
            ExtStorageMigrateMonitor.C85725b bVar = ExtStorageMigrateMonitor.f249775e;
            ((ExtStorageMigrateMonitor.C85724a) bVar).mo119340b("MicroMsg.ExtStorageMigrateAuxActivity", "[-] Unknown ticket: %s.", Integer.valueOf(i));
            finish();
            return;
        }
        Set<Integer> set = f347813n;
        ((HashSet) set).remove(Integer.valueOf(i));
        ((HashMap) this.f347816d).remove(Integer.valueOf(i));
        if (strArr.length == 0) {
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119340b("MicroMsg.ExtStorageMigrateAuxActivity", "[-] permissions array is empty.", new Object[0]);
            ((HashSet) set).remove(Integer.valueOf(i));
            ((HashMap) this.f347816d).remove(Integer.valueOf(i));
            return;
        }
        String str = strArr[0];
        if (iArr[0] == 0) {
            cVar.mo176482a(str);
        } else {
            cVar.mo176483b(str, !C90111a.m112742f(this, str));
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.f347819g) {
            this.f347819g = true;
            Intent intent = getIntent();
            if (intent == null) {
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119343e("MicroMsg.ExtStorageMigrateAuxActivity", "[!] Income intent is null.", new Object[0]);
                finish();
                return;
            }
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119343e("MicroMsg.ExtStorageMigrateAuxActivity", "[!] Income action is null or empty.", new Object[0]);
                finish();
                return;
            }
            action.getClass();
            if (!action.equals(ExtStorageMigrateRoutine.AUXUI_ACTION_DO_MIGRATE_ROUTINE)) {
                ExtStorageMigrateMonitor.C85725b bVar = ExtStorageMigrateMonitor.f249775e;
                ((ExtStorageMigrateMonitor.C85724a) bVar).mo119343e("MicroMsg.ExtStorageMigrateAuxActivity", "[!] Unknown action: " + action, new Object[0]);
                finish();
            } else if (!ExtStorageMigrateRoutine.needsToDoMigrate(this)) {
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119343e("MicroMsg.ExtStorageMigrateAuxActivity", "[!] Do not need to do migration, start wechat now.", new Object[0]);
                ExtStorageMigrateRoutine.startWeChat(this);
                finish();
            } else if (MultiProcessMMKV.getMMKV("extmig_status_memo_storage").getBoolean("key_indicate_goon_by_migrate_routine", false)) {
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119343e("MicroMsg.ExtStorageMigrateAuxActivity", "[!] Migration routine indicates we should go on normal startup, start wechat now.", new Object[0]);
                ExtStorageMigrateRoutine.startWeChat(this);
                finish();
            } else if (intent.getBooleanExtra(ExtStorageMigrateRoutine.AUXUI_PARAM_IS_MIGRAION_END, false)) {
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119343e("MicroMsg.ExtStorageMigrateAuxActivity", "[!] Migration routine indicates last migration is end, start wechat now.", new Object[0]);
                ExtStorageMigrateRoutine.startWeChat(this);
                finish();
            } else {
                MultiProcessMMKV.getMMKV("extmig_status_memo_storage").encode("key_indicate_migrating_by_migrate_routine", true);
                ExtStorageMigrateRoutine.startupMigrationService(this);
                if (!ExtStorageMigrateRoutine.bindMigrationService(this, this.f347820h)) {
                    ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119340b("MicroMsg.ExtStorageMigrateAuxActivity", "[-] Fail to bind to migrate service, startup WeChat next.", new Object[0]);
                    mo176465G7(true);
                }
            }
        }
    }
}
