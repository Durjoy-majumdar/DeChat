package com.tencent.p014mm.plugin.backup.backupui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.backup.backupmoveui.BackupUI;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72986n2;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import qo3.C101218e0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/backup/backupui/BackupChooseModeUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "a", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.backup.backupui.BackupChooseModeUI */
public final class BackupChooseModeUI extends BaseMvvmActivity {

    /* renamed from: d */
    public static final C2064a f12013d = new C2064a((C8480h) null);

    /* renamed from: com.tencent.mm.plugin.backup.backupui.BackupChooseModeUI$a */
    public static final class C2064a {
        public C2064a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo1997a(Context context) {
            C87412m.m108594g(context, "context");
            try {
                if (((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101185qq()) {
                    C75604z3.m90829a();
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.BackupChooseBackupModeUI", e, "", new Object[0]);
            }
            MMWizardActivity.m7017L7(context, new Intent(context, BackupUI.class));
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backupui.BackupChooseModeUI$b */
    public static final class C2065b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ BackupChooseModeUI f12014d;

        public C2065b(BackupChooseModeUI backupChooseModeUI) {
            this.f12014d = backupChooseModeUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f12014d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backupui.BackupChooseModeUI$c */
    public static final class C2066c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BackupChooseModeUI f12015d;

        public C2066c(BackupChooseModeUI backupChooseModeUI) {
            this.f12015d = backupChooseModeUI;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00e5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r10) {
            /*
                r9 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r10)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/backup/backupui/BackupChooseModeUI$onCreate$2"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r9
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.backup.backupui.BackupChooseModeUI r10 = r9.f12015d
                com.tencent.mm.plugin.backup.backupui.BackupChooseModeUI$a r0 = com.tencent.p014mm.plugin.backup.backupui.BackupChooseModeUI.f12013d
                r10.getClass()
                eb0.c r10 = eb0.C97625j3.m125812b()
                boolean r10 = r10.mo105884J()
                r0 = 2
                r1 = 0
                r2 = 1
                r3 = 15
                r4 = 14
                if (r10 == 0) goto L_0x0051
                java.lang.String r10 = e62.C75554c.f221950e
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                if (r10 != 0) goto L_0x0051
                int r10 = e62.C75554c.f221955j
                r10 = r10 & r0
                if (r10 == 0) goto L_0x0042
                r10 = 1
                goto L_0x0043
            L_0x0042:
                r10 = 0
            L_0x0043:
                if (r10 != 0) goto L_0x0051
                e62.c$b r10 = e62.C75554c.m90588k1()
                int r10 = r10.f182214d
                if (r10 == r4) goto L_0x004f
                if (r10 != r3) goto L_0x0051
            L_0x004f:
                r10 = 1
                goto L_0x0052
            L_0x0051:
                r10 = 0
            L_0x0052:
                if (r10 == 0) goto L_0x00e5
                com.tencent.mm.plugin.backup.backupui.BackupChooseModeUI r10 = r9.f12015d
                r10.getClass()
                eb0.c r5 = eb0.C97625j3.m125812b()
                boolean r5 = r5.mo105884J()
                if (r5 == 0) goto L_0x00d4
                java.lang.String r5 = e62.C75554c.f221950e
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 != 0) goto L_0x00d4
                int r5 = e62.C75554c.f221955j
                r5 = r5 & r0
                if (r5 == 0) goto L_0x0072
                r5 = 1
                goto L_0x0073
            L_0x0072:
                r5 = 0
            L_0x0073:
                if (r5 != 0) goto L_0x00d4
                e62.c$b r5 = e62.C75554c.m90588k1()
                int r6 = r5.f182214d
                int r5 = r5.f182220j
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                r0[r1] = r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
                r0[r2] = r7
                java.lang.String r7 = "MicroMsg.BackupChooseMoveUI"
                java.lang.String r8 = "checkPcClientVersion: DeviceType:%s,DeviceType:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r0)
                if (r6 == r4) goto L_0x00bc
                if (r6 == r3) goto L_0x00a4
                java.lang.Object[] r10 = new java.lang.Object[r2]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
                r10[r1] = r0
                java.lang.String r0 = "checkPcClientVersion: error deviceType:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r0, r10)
                goto L_0x00d4
            L_0x00a4:
                r0 = 1661404672(0x63070600, float:2.4907428E21)
                if (r5 < r0) goto L_0x00aa
                goto L_0x00c1
            L_0x00aa:
                r0 = 2131822157(0x7f11064d, float:1.9277077E38)
                java.lang.String r0 = r10.getString(r0)
                r2 = 2131822156(0x7f11064c, float:1.9277075E38)
                java.lang.String r2 = r10.getString(r2)
                r10.mo1996H7(r0, r2)
                goto L_0x00d4
            L_0x00bc:
                r0 = 319096064(0x13050500, float:1.6789425E-27)
                if (r5 < r0) goto L_0x00c3
            L_0x00c1:
                r1 = 1
                goto L_0x00d4
            L_0x00c3:
                r0 = 2131822155(0x7f11064b, float:1.9277073E38)
                java.lang.String r0 = r10.getString(r0)
                r2 = 2131822154(0x7f11064a, float:1.9277071E38)
                java.lang.String r2 = r10.getString(r2)
                r10.mo1996H7(r0, r2)
            L_0x00d4:
                if (r1 == 0) goto L_0x00f3
                android.content.Intent r10 = new android.content.Intent
                com.tencent.mm.plugin.backup.backupui.BackupChooseModeUI r0 = r9.f12015d
                java.lang.Class<com.tencent.mm.plugin.backup.backuppcui.BackupMigratePCUI> r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI.class
                r10.<init>(r0, r1)
                com.tencent.mm.plugin.backup.backupui.BackupChooseModeUI r0 = r9.f12015d
                com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r0, r10)
                goto L_0x00f3
            L_0x00e5:
                com.tencent.mm.plugin.backup.backupui.BackupChooseModeUI r10 = r9.f12015d
                r0 = 2131822284(0x7f1106cc, float:1.9277335E38)
                java.lang.String r0 = r10.getString(r0)
                java.lang.String r1 = ""
                r10.mo1996H7(r0, r1)
            L_0x00f3:
                java.lang.String r10 = "com/tencent/mm/plugin/backup/backupui/BackupChooseModeUI$onCreate$2"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r9, r10, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.backup.backupui.BackupChooseModeUI.C2066c.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backupui.BackupChooseModeUI$d */
    public static final class C2067d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BackupChooseModeUI f12016d;

        public C2067d(BackupChooseModeUI backupChooseModeUI) {
            this.f12016d = backupChooseModeUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/backup/backupui/BackupChooseModeUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BackupChooseModeUI.f12013d.mo1997a(this.f12016d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupui/BackupChooseModeUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backupui.BackupChooseModeUI$e */
    public static final class C2068e implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f12017a;

        public C2068e(C101218e0 e0Var) {
            this.f12017a = e0Var;
        }

        /* renamed from: a */
        public final void mo2001a() {
            this.f12017a.mo140680z();
        }
    }

    /* renamed from: H7 */
    public final void mo1996H7(String str, String str2) {
        boolean z = true;
        Log.m105919d("MicroMsg.BackupChooseMoveUI", "showTipsDialog: title:%s , content:%s", str, str2);
        if (str != null) {
            C101218e0 e0Var = new C101218e0(getContext(), 2, 0);
            e0Var.mo140677w(getResources().getString(C0966R.string.f8028zq));
            e0Var.f296375F = new C2068e(e0Var);
            e0Var.mo140676v(1);
            View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cxu, (ViewGroup) null);
            ((TextView) inflate.findViewById(C0966R.C0970id.bwu)).setText(str);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.bwt);
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (z) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(str2);
            }
            e0Var.mo140663j(inflate);
            e0Var.mo140655A();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cxf;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setBackBtn(new C2065b(this));
        ((LinearLayout) findViewById(C0966R.C0970id.f357491n62)).setOnClickListener(new C2066c(this));
        ((LinearLayout) findViewById(C0966R.C0970id.f357490n61)).setOnClickListener(new C2067d(this));
        if (!C86709a0.m107523b().mo121114l()) {
            finish();
        }
    }
}
