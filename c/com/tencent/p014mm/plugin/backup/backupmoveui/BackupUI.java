package com.tencent.p014mm.plugin.backup.backupmoveui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import av0.C16686a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C0991y;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import cv0.C7134b;
import cv0.k$$a;
import di3.C86312j;
import eb0.C97625j3;
import ev0.C20612a;
import gv0.C20842c;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import nj3.C76879j;
import yu0.C102910f;
import yu0.C102913k;

/* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupUI */
public class BackupUI extends MMWizardActivity {

    /* renamed from: h */
    public static boolean f50068h;

    /* renamed from: e */
    public Button f50069e;

    /* renamed from: f */
    public TextView f50070f;

    /* renamed from: g */
    public MTimerHandler f50071g = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C18114c(), true);

    /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupUI$a */
    public class C18111a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupUI$a$a */
        public class C18112a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f50073d;

            public C18112a(int i) {
                this.f50073d = i;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105925i("MicroMsg.BackupUI", "low battery, user click sure. battery:%d", Integer.valueOf(this.f50073d));
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(485, 21, 1, false);
                nVar.mo160131h(11788, 3);
                MMWizardActivity.m7017L7(BackupUI.this, new Intent(BackupUI.this, BackupMoveChooseUI.class));
            }
        }

        public C18111a() {
        }

        public void onClick(View view) {
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_BACKUP_PC_RECOVERING_BOOLEAN;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!C7134b.m7327a(BackupUI.this.getContext(), new k$$a())) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C85801v1 u = C97625j3.m125812b().mo105906u();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_BACKUP_MOVE_RECOVERING_BOOLEAN;
            Boolean bool = Boolean.FALSE;
            if (((Boolean) u.mo119685f(aVar2, bool)).booleanValue()) {
                if (C16686a.m16193i().mo142622e().mo142623a() == -100) {
                    C97625j3.m125812b().mo105906u().mo119677K(aVar2, bool);
                } else {
                    Intent className = new Intent().setClassName(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI");
                    className.addFlags(335544320);
                    className.putExtra("nofification_type", "backup_move_notification");
                    Context context = MMApplicationContext.getContext();
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(className);
                    Context context2 = context;
                    C117292a.m165358d(context2, aVar3.mo10232b(), "com/tencent/mm/plugin/backup/backupmoveui/BackupUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(context2, "com/tencent/mm/plugin/backup/backupmoveui/BackupUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            C85801v1 u2 = C97625j3.m125812b().mo105906u();
            C72994y1.C72995a aVar4 = C72994y1.C72995a.USERINFO_BACKUP_PC_BACKUPING_BOOLEAN;
            if (((Boolean) u2.mo119685f(aVar4, bool)).booleanValue() || ((Boolean) C97625j3.m125812b().mo105906u().mo119685f(aVar, bool)).booleanValue()) {
                if (C20612a.m22480i().mo142622e().mo142623a() == -100) {
                    C97625j3.m125812b().mo105906u().mo119677K(aVar4, bool);
                    C97625j3.m125812b().mo105906u().mo119677K(aVar, bool);
                } else {
                    Intent className2 = new Intent().setClassName(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI");
                    className2.addFlags(335544320);
                    className2.putExtra("nofification_type", "back_to_pcmgr_notification");
                    Context context3 = MMApplicationContext.getContext();
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(className2);
                    Context context4 = context3;
                    C117292a.m165358d(context4, aVar5.mo10232b(), "com/tencent/mm/plugin/backup/backupmoveui/BackupUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context3.startActivity((Intent) aVar5.mo10231a(0));
                    C117292a.m165359e(context4, "com/tencent/mm/plugin/backup/backupmoveui/BackupUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            int d = C102913k.m136039d();
            if (d < 20) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(485, 7, 1, false);
                nVar.mo160131h(11787, 4);
                C76879j.m92741l(BackupUI.this, C0966R.string.aan, C0966R.string.aam, C0966R.string.aei, C0966R.string.a_u, false, new C18112a(d), (DialogInterface.OnClickListener) null, C0966R.color.f3113fp);
            } else {
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.idkeyStat(485, 21, 1, false);
                nVar2.mo160131h(11788, 3);
                MMWizardActivity.m7017L7(BackupUI.this, new Intent(BackupUI.this, BackupMoveChooseUI.class));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupUI$b */
    public class C18113b implements MenuItem.OnMenuItemClickListener {
        public C18113b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BackupUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupUI$c */
    public class C18114c implements MTimerHandler.CallBack {
        public C18114c() {
        }

        public boolean onTimerExpired() {
            if (Util.isNullOrNil(C102913k.m136029A(BackupUI.this))) {
                if (BackupUI.f50068h) {
                    BackupUI.this.f50070f.setText(C0966R.string.aef);
                    BackupUI backupUI = BackupUI.this;
                    backupUI.f50070f.setTextColor(backupUI.getResources().getColor(C0966R.color.f3114fq));
                    BackupUI.this.f50069e.setEnabled(false);
                    BackupUI.f50068h = false;
                    C115669n.INSTANCE.mo160131h(11788, 2);
                }
            } else if (!BackupUI.f50068h) {
                BackupUI.this.f50070f.setText(C0966R.string.aeg);
                BackupUI backupUI2 = BackupUI.this;
                backupUI2.f50070f.setTextColor(backupUI2.getResources().getColor(C0966R.color.f3115fr));
                BackupUI.this.f50069e.setEnabled(true);
                BackupUI.f50068h = true;
            }
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6538hm;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            setMMTitle((int) C0966R.string.f360131aa2);
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(11788, 1);
            C20842c.m22887x1();
            this.f50070f = (TextView) findViewById(C0966R.C0970id.a4a);
            this.f50069e = (Button) findViewById(C0966R.C0970id.a47);
            C16686a.m16193i();
            SharedPreferences.Editor edit = C102910f.m136016d().edit();
            edit.putInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0);
            edit.putInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", 0);
            edit.putLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0);
            edit.putLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0);
            edit.commit();
            MTimerHandler mTimerHandler = C16686a.m16193i().mo17663l().f296795f;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            if (!C16686a.m16193i().mo17663l().f296805s) {
                C16686a.m16193i().mo17663l().mo140764a(true);
            } else {
                C16686a.m16193i().mo17663l().mo140773j();
            }
            if (Util.isNullOrNil(C102913k.m136029A(this))) {
                this.f50070f.setText(C0966R.string.aef);
                this.f50070f.setTextColor(getResources().getColor(C0966R.color.f3114fq));
                this.f50069e.setEnabled(false);
                f50068h = false;
                nVar.mo160131h(11788, 2);
            } else {
                this.f50070f.setText(C0966R.string.aeg);
                this.f50070f.setTextColor(getResources().getColor(C0966R.color.f3115fr));
                this.f50069e.setEnabled(true);
                f50068h = true;
            }
            this.f50069e.setOnClickListener(new C18111a());
            setBackBtn(new C18113b());
            ((C0991y) C86312j.m106911c(C0991y.class)).R20();
        }
    }

    public void onDestroy() {
        Log.m105918d("MicroMsg.BackupUI", "BackupUI onDestroy.");
        super.onDestroy();
        C16686a.m16193i().mo17663l().mo140765b();
        C16686a.m16193i().mo17663l().mo140766c();
        ((C0991y) C86312j.m106911c(C0991y.class)).mo1001Kg();
    }

    public void onStart() {
        super.onStart();
        this.f50071g.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
    }

    public void onStop() {
        super.onStop();
        this.f50071g.stopTimer();
    }
}
