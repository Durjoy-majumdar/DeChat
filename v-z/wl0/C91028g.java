package wl0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C89782m0;

/* renamed from: wl0.g */
public class C91028g {

    /* renamed from: l */
    public static C91028g f261152l = new C91028g();

    /* renamed from: a */
    public int f261153a = 0;

    /* renamed from: b */
    public boolean f261154b = false;

    /* renamed from: c */
    public boolean f261155c = false;

    /* renamed from: d */
    public boolean f261156d = false;

    /* renamed from: e */
    public MTimerHandler f261157e;

    /* renamed from: f */
    public ComponentName f261158f;

    /* renamed from: g */
    public Activity f261159g;

    /* renamed from: h */
    public ResultReceiver f261160h;

    /* renamed from: i */
    public C89782m0 f261161i;

    /* renamed from: j */
    public C77398g f261162j = null;

    /* renamed from: k */
    public final Handler f261163k = new Handler(Looper.getMainLooper());

    /* renamed from: wl0.g$a */
    public class C91029a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f261164d;

        /* renamed from: e */
        public final /* synthetic */ String f261165e;

        public C91029a(int i, String str) {
            this.f261164d = i;
            this.f261165e = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C91028g.this.mo125080e(this.f261164d, this.f261165e);
        }
    }

    /* renamed from: a */
    public void mo125076a() {
        if (this.f261155c) {
            MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C91021a(this), true);
            this.f261157e = mTimerHandler;
            mTimerHandler.startTimer(0, 300);
            Activity activity = this.f261159g;
            if (activity != null) {
                this.f261161i = C89782m0.m112252c(activity, activity.getString(C0966R.string.gkd), false, (DialogInterface.OnCancelListener) null);
            } else {
                Log.m105920e("MicroMsg.HCEActivityMgr", "alvinluo showProgressDialog mHceActivity is null");
            }
        } else {
            mo125078c();
        }
    }

    /* renamed from: b */
    public final void mo125077b(boolean z) {
        Activity activity = this.f261159g;
        if (activity == null) {
            Log.m105920e("MicroMsg.HCEActivityMgr", "alvinluo checkDefaultNFCApplication mHceActivity is null");
            return;
        }
        CardEmulation instance = CardEmulation.getInstance(NfcAdapter.getDefaultAdapter(activity));
        Log.m105924i("MicroMsg.HCEActivityMgr", "alvinluo component name: " + this.f261158f);
        if (!instance.isDefaultServiceForCategory(this.f261158f, "payment")) {
            Log.m105925i("MicroMsg.HCEActivityMgr", "alvinluo not NFC Default Application, isAutoSet: %b", Boolean.valueOf(z));
            if (z) {
                ComponentName componentName = this.f261158f;
                if (this.f261159g == null) {
                    Log.m105920e("MicroMsg.HCEActivityMgr", "alvinluo reuquestSetDefaultNFCApplication mHceActivity is null");
                    return;
                }
                Log.m105925i("MicroMsg.HCEActivityMgr", "alvinluo request set default NFC application, hasRequestSetDefault: %b", Boolean.valueOf(this.f261156d));
                if (this.f261156d) {
                    Log.m105924i("MicroMsg.HCEActivityMgr", "alvinluo has request set default NFC application");
                    mo125081f(13004, "not set default NFC application", this.f261159g.getString(C0966R.string.gks));
                    return;
                }
                this.f261163k.postDelayed(new C91026f(this, componentName), 200);
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.HCEActivityMgr", "alvinluo now is NFC Default Application");
        mo125080e(0, "NFC switch has opened and now is NFC default application");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0110  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo125078c() {
        /*
            r9 = this;
            boolean r0 = xl0.C91283d.m114511a()
            r1 = 10001(0x2711, float:1.4014E-41)
            java.lang.String r2 = "errMsg"
            java.lang.String r3 = "errCode"
            if (r0 != 0) goto L_0x0022
            r0 = 13000(0x32c8, float:1.8217E-41)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r4.putInt(r3, r0)
            java.lang.String r0 = "not support NFC"
            r4.putString(r2, r0)
            android.os.ResultReceiver r0 = r9.f261160h
            r0.send(r1, r4)
            goto L_0x013d
        L_0x0022:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r4 = "android.hardware.nfc.hce"
            boolean r0 = r0.hasSystemFeature(r4)
            if (r0 != 0) goto L_0x0048
            r0 = 13002(0x32ca, float:1.822E-41)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r4.putInt(r3, r0)
            java.lang.String r0 = "not support HCE"
            r4.putString(r2, r0)
            android.os.ResultReceiver r0 = r9.f261160h
            r0.send(r1, r4)
            goto L_0x013d
        L_0x0048:
            boolean r0 = xl0.C91283d.m114512b()
            r1 = 1
            if (r0 != 0) goto L_0x013a
            android.app.Activity r0 = r9.f261159g
            java.lang.String r2 = "MicroMsg.HCEActivityMgr"
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "alvinluo showOpenNFCDialog mHceActivity is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x013d
        L_0x005c:
            boolean r3 = r9.f261154b
            if (r3 == 0) goto L_0x0078
            java.lang.String r0 = "alvinluo has shown open NFC dialog"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = 13001(0x32c9, float:1.8218E-41)
            android.app.Activity r1 = r9.f261159g
            r2 = 2131832594(0x7f112f12, float:1.9298246E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "system NFC switch not opened"
            r9.mo125081f(r0, r2, r1)
            goto L_0x013d
        L_0x0078:
            qo3.a r3 = new qo3.a
            r3.<init>()
            r4 = 2131832596(0x7f112f14, float:1.929825E38)
            java.lang.String r4 = r0.getString(r4)
            r3.f225660q = r4
            android.app.Activity r4 = r9.f261159g
            r5 = 2131832592(0x7f112f10, float:1.9298242E38)
            java.lang.String r4 = r4.getString(r5)
            r3.f225663t = r4
            wl0.b r4 = new wl0.b
            r4.<init>(r9)
            r3.f225620C = r4
            android.app.Activity r4 = r9.f261159g
            r5 = 0
            if (r4 != 0) goto L_0x00a3
            java.lang.String r4 = "alvinluo isCanJumpNFCSetting mHceActivity is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)
            goto L_0x00fa
        L_0x00a3:
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r6 = "android.settings.NFC_SETTINGS"
            r4.<init>(r6)
            android.app.Activity r6 = r9.f261159g
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            r7 = 65536(0x10000, float:9.18355E-41)
            java.util.List r4 = r6.queryIntentActivities(r4, r7)
            if (r4 == 0) goto L_0x00f5
            int r6 = r4.size()
            if (r6 <= 0) goto L_0x00f5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "alvinluo NFC activity not null, activities size: "
            r6.append(r7)
            int r7 = r4.size()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            r6 = 0
        L_0x00d7:
            int r7 = r4.size()
            if (r6 >= r7) goto L_0x00f3
            java.lang.Object r7 = r4.get(r6)
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            java.lang.Object[] r8 = new java.lang.Object[r1]
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            java.lang.String r7 = r7.name
            r8[r5] = r7
            java.lang.String r7 = "alvinluo NFC activity: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r8)
            int r6 = r6 + 1
            goto L_0x00d7
        L_0x00f3:
            r2 = 1
            goto L_0x00fb
        L_0x00f5:
            java.lang.String r4 = "alvinluo Cannot jump to NFC setting"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)
        L_0x00fa:
            r2 = 0
        L_0x00fb:
            if (r2 == 0) goto L_0x0110
            android.app.Activity r2 = r9.f261159g
            r4 = 2131832578(0x7f112f02, float:1.9298214E38)
            java.lang.String r2 = r2.getString(r4)
            r3.f225664u = r2
            wl0.c r2 = new wl0.c
            r2.<init>(r9)
            r3.f225621D = r2
            goto L_0x011b
        L_0x0110:
            android.app.Activity r2 = r9.f261159g
            r4 = 2131832579(0x7f112f03, float:1.9298216E38)
            java.lang.String r2 = r2.getString(r4)
            r3.f225663t = r2
        L_0x011b:
            wl0.d r2 = new wl0.d
            r2.<init>(r9)
            r3.f225622E = r2
            qo3.g r2 = new qo3.g
            r4 = 2131887328(0x7f1204e0, float:1.940926E38)
            r2.<init>(r0, r4)
            r2.mo107525e(r3)
            r9.f261162j = r2
            r2.setCanceledOnTouchOutside(r5)
            qo3.g r0 = r9.f261162j
            r0.show()
            r9.f261154b = r1
            goto L_0x013d
        L_0x013a:
            r9.mo125077b(r1)
        L_0x013d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wl0.C91028g.mo125078c():void");
    }

    /* renamed from: d */
    public void mo125079d() {
        C77398g gVar = this.f261162j;
        if (gVar != null && gVar.isShowing()) {
            this.f261162j.dismiss();
            this.f261162j = null;
        }
        C89782m0 m0Var = this.f261161i;
        if (m0Var != null) {
            m0Var.dismiss();
            this.f261161i = null;
        }
    }

    /* renamed from: e */
    public final void mo125080e(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("errCode", i);
        bundle.putString("errMsg", str);
        this.f261160h.send(10001, bundle);
    }

    /* renamed from: f */
    public final void mo125081f(int i, String str, String str2) {
        mo125079d();
        Activity activity = this.f261159g;
        if (activity == null) {
            Log.m105920e("MicroMsg.HCEActivityMgr", "alvinluo showErrorDialog mHceActivity is null");
            return;
        }
        C77389a aVar = new C77389a();
        aVar.f225644a = "";
        aVar.f225660q = str2;
        aVar.f225663t = this.f261159g.getString(C0966R.string.gkc);
        aVar.f225620C = new C91029a(i, str);
        aVar.f225668y = true;
        C77398g gVar = new C77398g(activity, C0966R.style.a66);
        gVar.mo107525e(aVar);
        this.f261162j = gVar;
        gVar.setCanceledOnTouchOutside(false);
        this.f261162j.show();
    }
}
