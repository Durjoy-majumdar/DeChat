package com.tencent.p014mm.plugin.radar.p091ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import bh3.C113177k;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.TalkRoomeStatusBarHideEvent;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.plugin.radar.model.RadarAddContact;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eg2.C75616g;
import eg2.C75617h;
import f40.C86709a0;
import f62.C75700k0;
import f62.C75707s0;
import fg2.C8029b0;
import gy3.C87412m;
import java.util.Arrays;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C88989a;
import p447aw.C103918d;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarSearchUI;", "Lcom/tencent/mm/ui/MMBaseActivity;", "<init>", "()V", "plugin-radar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(19)
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarSearchUI */
public final class RadarSearchUI extends MMBaseActivity {

    /* renamed from: h */
    public static final /* synthetic */ int f203322h = 0;

    /* renamed from: e */
    public final C13601g f203323e = C36568h.m40986b(C13602i.NONE, new C8029b0(this, C0966R.C0970id.ibn));

    /* renamed from: f */
    public boolean f203324f = true;

    /* renamed from: g */
    public final int f203325g = 30764;

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarSearchUI$a */
    public static final class C70386a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RadarSearchUI f203326d;

        public C70386a(RadarSearchUI radarSearchUI) {
            this.f203326d = radarSearchUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f203326d);
            RadarSearchUI radarSearchUI = this.f203326d;
            radarSearchUI.f203324f = true;
            radarSearchUI.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarSearchUI$b */
    public static final class C70387b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RadarSearchUI f203327d;

        public C70387b(RadarSearchUI radarSearchUI) {
            this.f203327d = radarSearchUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            RadarSearchUI radarSearchUI = this.f203327d;
            radarSearchUI.f203324f = true;
            radarSearchUI.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarSearchUI$c */
    public static final class C70388c implements C113177k.C113181e {

        /* renamed from: a */
        public final /* synthetic */ RadarSearchUI f203328a;

        public C70388c(RadarSearchUI radarSearchUI) {
            this.f203328a = radarSearchUI;
        }

        public final void onOp(Boolean bool) {
            C87412m.m108593f(bool, LocaleUtil.ITALIAN);
            if (bool.booleanValue()) {
                RadarSearchUI radarSearchUI = this.f203328a;
                int i = RadarSearchUI.f203322h;
                radarSearchUI.mo96940F7();
                return;
            }
            this.f203328a.finish();
        }
    }

    /* renamed from: E7 */
    public final RadarViewController mo96939E7() {
        return (RadarViewController) this.f203323e.getValue();
    }

    /* renamed from: F7 */
    public final void mo96940F7() {
        if (!((C113177k) C86312j.m106911c(C113177k.class)).mo165712hg(C113177k.C113179b.LOCAION, C113177k.C113178a.RADAR, new C70388c(this))) {
            TalkRoomeStatusBarHideEvent talkRoomeStatusBarHideEvent = new TalkRoomeStatusBarHideEvent();
            talkRoomeStatusBarHideEvent.f193957d.f193958a = true;
            talkRoomeStatusBarHideEvent.publish();
            C75616g.f222140e = 0;
            C75616g.f222139d = 0;
            C75616g.f222139d = System.currentTimeMillis();
            C75616g.f222141f = 0;
            C75616g.f222138c = 0;
            C75616g.f222136a = 0;
            C75616g.f222137b = 0;
            C75616g.f222138c = System.currentTimeMillis();
            C115669n.INSTANCE.idkeyStat(759, 0, 1, false);
            if (mo96939E7().getRadarStatus() == C75617h.C75620d.SEARCHING || mo96939E7().getRadarStatus() == C75617h.C75620d.SEARCH_RETRUN) {
                C75617h hVar = mo96939E7().f203355o;
                if (hVar != null) {
                    C92411b bVar = hVar.f222144f;
                    if (bVar != null) {
                        bVar.mo126407a(hVar.f222157v, true);
                    }
                    C75617h hVar2 = mo96939E7().f203355o;
                    if (hVar2 != null) {
                        hVar2.mo105968f();
                        mo96939E7().mo96964n();
                    } else {
                        C87412m.m108603p("radarManager");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("radarManager");
                    throw null;
                }
            }
            C5139t.m5183e(3, 10);
        }
    }

    public Object getSystemService(String str) {
        C87412m.m108594g(str, "name");
        Object systemService = super.getSystemService(str);
        return (systemService == null || !C87412m.m108589b("layout_inflater", str)) ? systemService : C85868k2.m106138c((LayoutInflater) systemService);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != this.f203325g) {
            return;
        }
        if (intent != null) {
            Bundle bundleExtra = intent.getBundleExtra("result_data");
            if (bundleExtra == null || !bundleExtra.getString("go_next", "").equals("gdpr_auth_location")) {
                this.f203324f = true;
                finish();
                return;
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, Boolean.TRUE);
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125790zt(this, "android.permission.ACCESS_FINE_LOCATION", 64);
            this.f203324f = false;
            return;
        }
        this.f203324f = true;
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            C87412m.m108593f(attributes, "window.getAttributes()");
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "window.decorView");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1030);
        setContentView(C0966R.C0971layout.bpf);
        getWindow().getDecorView().setBackgroundColor(C76577a.m92153d(this, C0966R.color.f3131gg));
        getWindow().setStatusBarColor(C76577a.m92153d(this, C0966R.color.f3131gg));
        if (i >= 26 && !MMActivityController.m163190m()) {
            getWindow().setNavigationBarColor(C76577a.m92153d(this, C0966R.color.f3131gg));
        }
        mo96939E7().mo96960j();
        RadarViewController E7 = mo96939E7();
        RadarAddContact radarAddContact = E7.f203356p;
        radarAddContact.getClass();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(radarAddContact);
        radarAddContact.f203281h.alive();
        ((C75707s0) C86312j.m106911c(C75707s0.class)).H60().mo120968d("addcontact", radarAddContact.f203282i, true);
        C75617h hVar = E7.f203355o;
        if (hVar != null) {
            C86709a0.m107524d().mo123455a(425, hVar);
            C86709a0.m107524d().mo123455a(602, hVar);
            Object e = C86709a0.m107535s().mo121142i().mo119684e(229377, 0);
            C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.Int");
            C86709a0.m107535s().mo121142i().mo119676J(229377, Integer.valueOf(((Integer) e).intValue() + 1));
            return;
        }
        C87412m.m108603p("radarManager");
        throw null;
    }

    public void onDestroy() {
        mo96939E7().mo96962l();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        boolean onKeyDown = mo96939E7().onKeyDown(i, keyEvent);
        return onKeyDown ? onKeyDown : super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        TalkRoomeStatusBarHideEvent talkRoomeStatusBarHideEvent = new TalkRoomeStatusBarHideEvent();
        talkRoomeStatusBarHideEvent.f193957d.f193958a = false;
        talkRoomeStatusBarHideEvent.publish();
        if (C75616g.f222139d != 0) {
            long currentTimeMillis = System.currentTimeMillis() - C75616g.f222139d;
            if (!(currentTimeMillis <= ((long) 500))) {
                int i = C75616g.f222140e;
                Log.m105919d("MicroMsg.RadarKvStatReport", "FoundFriendsCnt %d", Integer.valueOf(i));
                C115669n nVar = C115669n.INSTANCE;
                String format = String.format("%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                nVar.kvStat(10679, format);
                C75616g.f222136a++;
                C75616g.f222137b += currentTimeMillis;
                C75616g.f222139d = 0;
            }
        }
        if (C75616g.f222138c != 0) {
            long currentTimeMillis2 = System.currentTimeMillis() - C75616g.f222138c;
            int i2 = C75616g.f222136a;
            float f = (float) 1000;
            float f2 = (((float) C75616g.f222137b) * 1.0f) / f;
            int i3 = C75616g.f222141f;
            float f3 = (((float) currentTimeMillis2) * 1.0f) / f;
            Log.m105919d("MicroMsg.RadarKvStatReport", "RadarAddFriendStat %d,%d,%s,%d,%s", 1, Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Float.valueOf(f3));
            C115669n nVar2 = C115669n.INSTANCE;
            String format2 = String.format("%d,%d,%s,%d,%s", Arrays.copyOf(new Object[]{1, Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Float.valueOf(f3)}, 5));
            C87412m.m108593f(format2, "format(format, *args)");
            nVar2.kvStat(10676, format2);
        }
        if (mo96939E7().getRadarStatus() == C75617h.C75620d.SEARCHING || mo96939E7().getRadarStatus() == C75617h.C75620d.SEARCH_RETRUN) {
            C75617h hVar = mo96939E7().f203355o;
            if (hVar != null) {
                hVar.mo105970h();
                C75617h hVar2 = mo96939E7().f203355o;
                if (hVar2 != null) {
                    C92411b bVar = hVar2.f222144f;
                    if (bVar != null) {
                        bVar.mo126408b(hVar2.f222157v);
                    }
                    mo96939E7().mo96965o();
                    return;
                }
                C87412m.m108603p("radarManager");
                throw null;
            }
            C87412m.m108603p("radarManager");
            throw null;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        if (iArr.length <= 0) {
            Log.m105925i("MicroMsg.RadarSearchUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.RadarSearchUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i != 64) {
            return;
        }
        if (iArr[0] == 0) {
            mo96940F7();
            return;
        }
        this.f203324f = false;
        C76879j.m92709C(this, getString(C0966R.string.f361129hi0), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.hhr), false, new C70386a(this), new C70387b(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r10 = this;
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            super.onResume()
            boolean r1 = r10.f203324f
            if (r1 == 0) goto L_0x00a3
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r2 = 274436(0x43004, float:3.84567E-40)
            r3 = 0
            java.lang.Object r1 = r1.mo119684e(r2, r3)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x0020
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
        L_0x0020:
            boolean r1 = nc0.C76850a.m92639k(r3)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0075
            di3.d r1 = di3.C86312j.m106911c(r0)
            aw.d r1 = (p447aw.C103918d) r1
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = r1.Lb0(r10, r4)
            if (r1 != 0) goto L_0x00a0
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            java.lang.Object r1 = r1.mo119685f(r5, r6)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Boolean"
            gy3.C87412m.m108592e(r1, r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0069
            r0 = 2131832233(0x7f112da9, float:1.9297514E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r1[r2] = r4
            java.lang.String r0 = r10.getString(r0, r1)
            int r1 = r10.f203325g
            qg0.C12215a.m11778c(r10, r0, r1, r3)
            goto L_0x0074
        L_0x0069:
            di3.d r0 = di3.C86312j.m106911c(r0)
            aw.d r0 = (p447aw.C103918d) r0
            r1 = 64
            r0.mo125790zt(r10, r4, r1)
        L_0x0074:
            return
        L_0x0075:
            di3.d r0 = di3.C86312j.m106911c(r0)
            r4 = r0
            aw.d r4 = (p447aw.C103918d) r4
            r7 = 64
            r8 = 0
            r0 = 2131834339(0x7f1135e3, float:1.9301786E38)
            java.lang.String r9 = r10.getString(r0)
            java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
            r5 = r10
            boolean r0 = r4.mo125788z1(r5, r6, r7, r8, r9)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r1[r2] = r3
            java.lang.String r2 = "MicroMsg.RadarSearchUI"
            java.lang.String r3 = "summerper checkPermission checkLocation[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            if (r0 != 0) goto L_0x00a0
            return
        L_0x00a0:
            r10.mo96940F7()
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.radar.p091ui.RadarSearchUI.onResume():void");
    }
}
