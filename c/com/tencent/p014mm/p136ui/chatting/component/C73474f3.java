package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.CleanStaticMapEvent;
import com.tencent.p014mm.autogen.events.LocationServerEvent;
import com.tencent.p014mm.p136ui.chatting.C73673d4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import he0.C76158j;
import ke3.C88144b;
import nc0.C76850a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import p270xi.C91212b;
import p447aw.C103918d;
import qg0.C12215a;
import qo3.C77407n;
import zj3.C79352f0;

@C91212b(exportInterface = C79352f0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.f3 */
public class C73474f3 extends C73412a implements C79352f0 {

    /* renamed from: com.tencent.mm.ui.chatting.component.f3$a */
    public class C73475a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ boolean f215887d;

        /* renamed from: e */
        public final /* synthetic */ boolean f215888e;

        public C73475a(boolean z, boolean z2) {
            this.f215887d = z;
            this.f215888e = z2;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            if (this.f215887d) {
                e0Var.mo107142f(1, C73474f3.this.f215752d.mo91572m().getString(C0966R.string.gbi));
                e0Var.mo107142f(2, C73474f3.this.f215752d.mo91572m().getString(C0966R.string.gbj));
                return;
            }
            C73474f3 f3Var = C73474f3.this;
            if (!(!f3Var.f215752d.mo91574o().mo62916m3() && !C72996z1.m85855z5(f3Var.f215752d.mo91577r()) && !C72996z1.m85798E5(f3Var.f215752d.mo91577r()) && !C72996z1.m85848s5(f3Var.f215752d.mo91577r()) && !C72996z1.m85811N4(f3Var.f215752d.mo91577r()) && !f3Var.f215752d.mo91577r().equals(C75592q0.m90789s())) || this.f215888e) {
                e0Var.mo107142f(1, C73474f3.this.f215752d.mo91572m().getString(C0966R.string.gbi));
                return;
            }
            e0Var.mo107142f(1, C73474f3.this.f215752d.mo91572m().getString(C0966R.string.gbi));
            e0Var.mo107142f(2, C73474f3.this.f215752d.mo91572m().getString(C0966R.string.gbj));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.f3$b */
    public class C73476b implements C11184p0 {
        public C73476b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC;
            Class cls = C103918d.class;
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                if (C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
                    if (!(((C103918d) C86312j.m106911c(cls)).Lb0(C73474f3.this.f215752d.mo91565f(), "android.permission.ACCESS_FINE_LOCATION") && ((C103918d) C86312j.m106911c(cls)).Lb0(C73474f3.this.f215752d.mo91565f(), "android.permission.ACCESS_COARSE_LOCATION"))) {
                        if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(aVar, Boolean.FALSE)).booleanValue()) {
                            C12215a.m11778c(C73474f3.this.f215752d.mo91565f(), C73474f3.this.f215752d.mo91572m().getString(C0966R.string.gbq, new Object[]{LocaleUtil.getApplicationLanguage()}), 30763, true);
                            return;
                        } else {
                            ((C103918d) C86312j.m106911c(cls)).b40(C73474f3.this.f215752d.mo91565f(), new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 67);
                            return;
                        }
                    }
                } else {
                    boolean Uu0 = ((C103918d) C86312j.m106911c(cls)).Uu0(C73474f3.this.f215752d.mo91565f(), new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 67, (String) null, (String) null);
                    Log.m105919d("MicroMsg.ChattingUI.LocationComponent", "summerper checkPermission checkLocation[%b]", Boolean.valueOf(Uu0));
                    if (!Uu0) {
                        return;
                    }
                }
                C73474f3.this.mo102433Y5();
            } else if (itemId == 2) {
                if (C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
                    if (!(((C103918d) C86312j.m106911c(cls)).Lb0(C73474f3.this.f215752d.mo91565f(), "android.permission.ACCESS_FINE_LOCATION") && ((C103918d) C86312j.m106911c(cls)).Lb0(C73474f3.this.f215752d.mo91565f(), "android.permission.ACCESS_COARSE_LOCATION"))) {
                        if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(aVar, Boolean.FALSE)).booleanValue()) {
                            C12215a.m11778c(C73474f3.this.f215752d.mo91565f(), C73474f3.this.f215752d.mo91572m().getString(C0966R.string.gbq, new Object[]{LocaleUtil.getApplicationLanguage()}), 30762, true);
                            return;
                        } else {
                            ((C103918d) C86312j.m106911c(cls)).b40(C73474f3.this.f215752d.mo91565f(), new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 68);
                            return;
                        }
                    }
                } else {
                    boolean Uu02 = ((C103918d) C86312j.m106911c(cls)).Uu0(C73474f3.this.f215752d.mo91565f(), new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 68, (String) null, (String) null);
                    Log.m105919d("MicroMsg.ChattingUI.LocationComponent", "summerper checkPermission checkLocation[%b]", Boolean.valueOf(Uu02));
                    if (!Uu02) {
                        return;
                    }
                }
                C73474f3.this.mo102434Z5();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.f3$c */
    public class C73477c implements DialogInterface.OnClickListener {
        public C73477c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(C73474f3.this.f215752d.mo91565f());
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        LocationServerEvent locationServerEvent = new LocationServerEvent();
        LocationServerEvent.C67729a aVar = locationServerEvent.f193728d;
        aVar.f193730a = 0;
        aVar.f193731b = LocaleUtil.getApplicationLanguage();
        if (C72996z1.m85820U5(this.f215752d.mo91574o().getUsername())) {
            locationServerEvent.f193728d.f193732c = true;
        } else {
            locationServerEvent.f193728d.f193732c = false;
        }
        locationServerEvent.publish();
    }

    /* renamed from: U4 */
    public void mo102432U4() {
        boolean z = (C72996z1.m85843n5(this.f215752d.mo91577r()) || C72996z1.m85847r5(this.f215752d.mo91574o().getUsername())) && (((C76158j) C86312j.m106911c(C76158j.class)).b10(this.f215752d.mo91574o().mo73980x2(), 0) & 4096) == 0;
        boolean z2 = C45628s0.m50735A(this.f215752d.mo91574o().getUsername()) && (C75592q0.m90774d() & 8) != 0;
        C77407n nVar = new C77407n((Context) this.f215752d.mo91565f(), 1, false);
        nVar.f225771i = new C73475a(z2, z);
        nVar.f225782p = new C73476b();
        nVar.mo107573q();
    }

    /* renamed from: V5 */
    public void mo102183V5(int i, String[] strArr, int[] iArr) {
        if (i != 67 && i != 68) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            C76879j.m92709C(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.f361129hi0), this.f215752d.mo91572m().getString(C0966R.string.hif), this.f215752d.mo91572m().getString(C0966R.string.fyd), this.f215752d.mo91572m().getString(C0966R.string.auj), false, new C73477c(), (DialogInterface.OnClickListener) null);
        } else if (i == 67) {
            mo102433Y5();
        } else {
            mo102434Z5();
        }
    }

    /* renamed from: Y5 */
    public void mo102433Y5() {
        C115669n.INSTANCE.mo160131h(12809, 1, "");
        Intent intent = new Intent();
        if (this.f215752d.mo91583x()) {
            intent.putExtra("type_tag", 2);
        } else {
            intent.putExtra("type_tag", 1);
        }
        intent.putExtra("map_view_type", 0);
        intent.putExtra("map_indoor_support", 1);
        intent.putExtra("map_sender_name", this.f215752d.mo91573n());
        intent.putExtra("map_talker_name", this.f215752d.mo91577r());
        C88144b.m109791i(this.f215752d.mo91565f(), FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, (Bundle) null);
        C5139t.m5183e(3, 10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* renamed from: Z5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102434Z5() {
        /*
            r3 = this;
            ck3.b r0 = r3.f215752d
            android.app.Activity r0 = r0.mo91565f()
            boolean r0 = p182kk.C61104a.m71669y(r0)
            if (r0 != 0) goto L_0x00d6
            ck3.b r0 = r3.f215752d
            android.app.Activity r0 = r0.mo91565f()
            boolean r0 = p182kk.C61104a.m71665u(r0)
            if (r0 != 0) goto L_0x00d6
            ck3.b r0 = r3.f215752d
            android.app.Activity r0 = r0.mo91565f()
            boolean r0 = p182kk.C61104a.m71649e(r0)
            if (r0 != 0) goto L_0x00d6
            java.lang.Class<com.tencent.mm.plugin.multitalk.model.h> r0 = com.tencent.p014mm.plugin.multitalk.model.C69856h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.multitalk.model.h r0 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r0
            ck3.b r1 = r3.f215752d
            java.lang.String r1 = r1.mo91577r()
            boolean r0 = r0.mo96150sV(r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "MicroMsg.ChattingUI.LocationComponent"
            java.lang.String r1 = "click share location, but now is in multitalk!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            ck3.b r0 = r3.f215752d
            android.app.Activity r0 = r0.mo91565f()
            r1 = 2131833187(0x7f113163, float:1.929945E38)
            r2 = 2131821704(0x7f110488, float:1.9276159E38)
            nj3.C76879j.m92738i(r0, r1, r2)
            return
        L_0x004f:
            r0 = 0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x00bf
            ed0.a r1 = ed0.C75610d.m90859a()
            if (r1 == 0) goto L_0x0096
            ed0.a r1 = ed0.C75610d.m90859a()
            ck3.b r2 = r3.f215752d
            com.tencent.mm.storage.z1 r2 = r2.mo91574o()
            java.lang.String r2 = r2.getUsername()
            t22.z r1 = (t22.C77833z) r1
            boolean r1 = r1.mo107954g(r2)
            if (r1 == 0) goto L_0x0096
            ed0.a r1 = ed0.C75610d.m90859a()
            ck3.b r2 = r3.f215752d
            com.tencent.mm.storage.z1 r2 = r2.mo91574o()
            java.lang.String r2 = r2.getUsername()
            t22.z r1 = (t22.C77833z) r1
            java.util.LinkedList r1 = r1.mo107950c(r2)
            if (r1 == 0) goto L_0x0096
            ck3.b r2 = r3.f215752d
            java.lang.String r2 = r2.mo91573n()
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0096
            r1 = 1
            goto L_0x0097
        L_0x0096:
            r1 = 0
        L_0x0097:
            if (r1 != 0) goto L_0x00bf
            qo3.g$i r1 = new qo3.g$i
            ck3.b r2 = r3.f215752d
            android.app.Activity r2 = r2.mo91565f()
            r1.<init>(r2)
            qo3.a r2 = r1.f225714b
            r2.f225660q = r0
            r0 = 2131831354(0x7f112a3a, float:1.9295731E38)
            r1.mo107552e(r0)
            com.tencent.mm.ui.chatting.component.g3 r0 = new com.tencent.mm.ui.chatting.component.g3
            r0.<init>(r3)
            qo3.a r2 = r1.f225714b
            r2.f225620C = r0
            qo3.g r0 = r1.mo107548a()
            r0.show()
            goto L_0x00d6
        L_0x00bf:
            ck3.b r0 = r3.f215752d
            java.lang.Class<zj3.c1> r1 = zj3.C79344c1.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r1)
            zj3.c1 r0 = (zj3.C79344c1) r0
            java.lang.String r1 = "fromPluginLocation"
            r0.mo102261H0(r1)
            r0 = 3
            r1 = 10
            com.tencent.p014mm.plugin.report.service.C5139t.m5183e(r0, r1)
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73474f3.mo102434Z5():void");
    }

    /* renamed from: d */
    public boolean mo102435d(C72963f4 f4Var) {
        if (!f4Var.mo100982U3()) {
            return false;
        }
        Log.m105925i("MicroMsg.ResendMsgLogic", "resendLocation, msgId:%d", Long.valueOf(f4Var.getMsgId()));
        C73673d4.m87252f(f4Var);
        this.f215752d.mo91541B(true);
        return true;
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        LocationServerEvent locationServerEvent = new LocationServerEvent();
        locationServerEvent.f193728d.f193730a = 2;
        locationServerEvent.publish();
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        new CleanStaticMapEvent().publish();
    }
}
