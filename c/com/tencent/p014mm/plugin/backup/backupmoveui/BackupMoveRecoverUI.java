package com.tencent.p014mm.plugin.backup.backupmoveui;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import av0.C16686a;
import av0.C16690b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.widget.progress.RoundProgressBtn;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import cv0.C20367g;
import cv0.C20368h;
import cv0.C7134b;
import cv0.f$$a;
import di3.C86312j;
import eb0.C97625j3;
import gv0.C20842c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import p1035sf.C90183c;
import p214om.C11502f;
import p447aw.C103918d;
import sv0.C22400b;
import yu0.C102909e;
import yu0.C102911g;
import yu0.C102913k;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI */
public class BackupMoveRecoverUI extends MMWizardActivity {

    /* renamed from: q */
    public static boolean f50019q;

    /* renamed from: r */
    public static boolean f50020r;

    /* renamed from: e */
    public TextView f50021e;

    /* renamed from: f */
    public TextView f50022f;

    /* renamed from: g */
    public TextView f50023g;

    /* renamed from: h */
    public TextView f50024h;

    /* renamed from: i */
    public TextView f50025i;

    /* renamed from: j */
    public ImageView f50026j;

    /* renamed from: n */
    public RoundProgressBtn f50027n;

    /* renamed from: o */
    public boolean f50028o = true;

    /* renamed from: p */
    public C102909e f50029p = new C18083a();

    /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a */
    public class C18083a implements C102909e {

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$e */
        public class C2059e implements View.OnClickListener {
            public C2059e() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                try {
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$TetherSettingsActivity"));
                    BackupMoveRecoverUI backupMoveRecoverUI = BackupMoveRecoverUI.this;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(backupMoveRecoverUI, aVar.mo10232b(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$14", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    backupMoveRecoverUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(backupMoveRecoverUI, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$14", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.BackupMoveRecoverUI", "jump to Settings$TetherSettingsActivity failed");
                    ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(BackupMoveRecoverUI.this.getContext());
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$h */
        public class C2060h implements View.OnClickListener {
            public C2060h() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Intent intent = new Intent();
                intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, BackupMoveRecoverUI.this.getString(C0966R.string.ab9));
                intent.putExtra("rawUrl", BackupMoveRecoverUI.this.getString(C0966R.string.ab8, new Object[]{LocaleUtil.getApplicationLanguage()}));
                intent.putExtra("showShare", false);
                intent.putExtra("neverGetA8Key", true);
                C88144b.m109791i(BackupMoveRecoverUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$j */
        public class C2061j implements View.OnClickListener {
            public C2061j() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C115669n.INSTANCE.mo160131h(11788, 9);
                Intent intent = new Intent();
                intent.putExtra("BaseScanUI_select_scan_mode", 1);
                intent.setFlags(268435456);
                C88144b.m109791i(BackupMoveRecoverUI.this.getContext(), "scanner", ".ui.BaseScanUI", intent, (Bundle) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$p */
        public class C2062p implements View.OnClickListener {
            public C2062p() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.BackupMoveRecoverUI", "backupmove pause click scan qrcode.");
                Intent intent = new Intent();
                intent.putExtra("BaseScanUI_select_scan_mode", 1);
                intent.setFlags(268435456);
                C88144b.m109791i(BackupMoveRecoverUI.this.getContext(), "scanner", ".ui.BaseScanUI", intent, (Bundle) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$a */
        public class C18084a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f50031d;

            /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$a$a */
            public class C18085a implements DialogInterface.OnClickListener {
                public C18085a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    Log.m105925i("MicroMsg.BackupMoveRecoverUI", "user click close. stop recover merge, backupState[%d].", Integer.valueOf(C18084a.this.f50031d));
                    C115669n.INSTANCE.idkeyStat(485, 48, 1, false);
                    C16686a.m16193i().mo17660h().mo37036e();
                    C16686a.m16193i().mo17661j().mo17672e(true, true, -100);
                }
            }

            public C18084a(int i) {
                this.f50031d = i;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.BackupMoveRecoverUI", "backupmove click stop merge button.");
                C76879j.m92741l(BackupMoveRecoverUI.this, C0966R.string.aac, C0966R.string.aab, C0966R.string.abo, C0966R.string.a_u, false, new C18085a(), (DialogInterface.OnClickListener) null, C0966R.color.f3114fq);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$b */
        public class C18086b implements View.OnClickListener {
            public C18086b() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C16686a.m16193i().mo142622e().mo142628f(25);
                BackupMoveRecoverUI backupMoveRecoverUI = BackupMoveRecoverUI.this;
                boolean z = BackupMoveRecoverUI.f50019q;
                backupMoveRecoverUI.mo7681K7(1);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$c */
        public class C18087c implements View.OnClickListener {
            public C18087c() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C16686a.m16193i().mo17660h().mo37036e();
                C16686a.m16193i().mo142622e().mo142628f(-100);
                BackupMoveRecoverUI backupMoveRecoverUI = BackupMoveRecoverUI.this;
                boolean z = BackupMoveRecoverUI.f50019q;
                backupMoveRecoverUI.mo7681K7(1);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$d */
        public class C18088d implements View.OnClickListener {
            public C18088d(C18083a aVar) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.BackupMoveRecoverUI", "backupmove click pause button.");
                C16686a.m16193i().mo17661j().mo17672e(true, false, 28);
                C16686a.m16193i().mo17660h().mo37036e();
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$f */
        public class C18089f implements View.OnClickListener {
            public C18089f() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C16686a.m16193i().mo17661j().mo17670c(11789, 7);
                Intent intent = new Intent();
                intent.putExtra("BaseScanUI_select_scan_mode", 1);
                intent.setFlags(268435456);
                C88144b.m109791i(BackupMoveRecoverUI.this.getContext(), "scanner", ".ui.BaseScanUI", intent, (Bundle) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$g */
        public class C18090g implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f50037d;

            /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$g$a */
            public class C18091a implements DialogInterface.OnClickListener {
                public C18091a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    Log.m105925i("MicroMsg.BackupMoveRecoverUI", "user click close. stop recover, backupState[%d].", Integer.valueOf(C18090g.this.f50037d));
                    C115669n.INSTANCE.idkeyStat(485, 44, 1, false);
                    C16686a.m16193i().mo17661j().mo17670c(11789, 6);
                    C16686a.m16193i().mo17660h().mo37036e();
                    C16686a.m16193i().mo17661j().mo17672e(true, true, -100);
                }
            }

            public C18090g(int i) {
                this.f50037d = i;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C76879j.m92741l(BackupMoveRecoverUI.this, C0966R.string.aae, C0966R.string.aad, C0966R.string.abp, C0966R.string.a_u, false, new C18091a(), (DialogInterface.OnClickListener) null, C0966R.color.f3114fq);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$i */
        public class C18092i implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f50040d;

            /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$i$a */
            public class C18093a implements DialogInterface.OnClickListener {
                public C18093a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    Log.m105925i("MicroMsg.BackupMoveRecoverUI", "user click close. stop recover, backupState[%d].", Integer.valueOf(C18092i.this.f50040d));
                    C115669n.INSTANCE.idkeyStat(485, 44, 1, false);
                    C16686a.m16193i().mo17661j().mo17670c(11789, 5);
                    C16686a.m16193i().mo17660h().mo37036e();
                    C16686a.m16193i().mo17661j().mo17672e(true, true, -100);
                }
            }

            public C18092i(int i) {
                this.f50040d = i;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C76879j.m92741l(BackupMoveRecoverUI.this, C0966R.string.aae, C0966R.string.aad, C0966R.string.abp, C0966R.string.a_u, false, new C18093a(), (DialogInterface.OnClickListener) null, C0966R.color.f3114fq);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$k */
        public class C18094k implements View.OnClickListener {
            public C18094k(C18083a aVar) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.BackupMoveRecoverUI", "click only move new msg.");
                C16686a.m16193i().mo17661j().mo17678k(false);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$l */
        public class C18095l implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f50043d;

            /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$l$a */
            public class C18096a implements DialogInterface.OnClickListener {
                public C18096a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    Log.m105925i("MicroMsg.BackupMoveRecoverUI", "user click close. stop recover, backupState[%d].", Integer.valueOf(C18095l.this.f50043d));
                    C115669n.INSTANCE.idkeyStat(485, 44, 1, false);
                    C16686a.m16193i().mo17661j().mo17670c(11789, 5);
                    C16686a.m16193i().mo17660h().mo37036e();
                    C16686a.m16193i().mo17661j().mo17672e(true, true, -100);
                }
            }

            public C18095l(int i) {
                this.f50043d = i;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C76879j.m92741l(BackupMoveRecoverUI.this, C0966R.string.aae, C0966R.string.aad, C0966R.string.abp, C0966R.string.a_u, false, new C18096a(), (DialogInterface.OnClickListener) null, C0966R.color.f3114fq);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$m */
        public class C18097m implements DialogInterface.OnClickListener {
            public C18097m() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.BackupMoveRecoverUI", "move phone old version");
                BackupMoveRecoverUI backupMoveRecoverUI = BackupMoveRecoverUI.this;
                boolean z = BackupMoveRecoverUI.f50019q;
                backupMoveRecoverUI.mo7681K7(1);
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$n */
        public class C18098n implements View.OnClickListener {
            public C18098n(C18083a aVar) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.BackupMoveRecoverUI", "click move all msg.");
                C16686a.m16193i().mo17661j().mo17678k(true);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$o */
        public class C18099o implements View.OnClickListener {
            public C18099o(C18083a aVar) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.BackupMoveRecoverUI", "backupmove click pause button.");
                C16686a.m16193i().mo17661j().mo17672e(true, false, 28);
                C16686a.m16193i().mo17660h().mo37036e();
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$q */
        public class C18100q implements View.OnClickListener {
            public C18100q() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.BackupMoveRecoverUI", "backupmove pause click stop move button.");
                Log.m105924i("MicroMsg.BackupMoveRecoverUI", "backupmove pause click stop move.");
                C16686a.m16193i().mo142622e().mo142628f(29);
                C18083a.this.mo17667K(29);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$r */
        public class C18101r implements View.OnClickListener {
            public C18101r() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.BackupMoveRecoverUI", "backupmove stop click start merge already move data.");
                if (!C16686a.m16193i().mo17661j().mo17675h()) {
                    Log.m105920e("MicroMsg.BackupMoveRecoverUI", "miss recover merge data.");
                    C16686a.m16193i().mo142622e().mo142628f(-22);
                    C18083a.this.mo17667K(-22);
                    C115669n.INSTANCE.idkeyStat(485, 6, 1, false);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C16686a.m16193i().mo17661j().mo17677j(false);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$s */
        public class C18102s implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f50049d;

            /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$s$a */
            public class C18103a implements DialogInterface.OnClickListener {
                public C18103a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    Log.m105925i("MicroMsg.BackupMoveRecoverUI", "user click close. stop recover merge, backupState[%d].", Integer.valueOf(C18102s.this.f50049d));
                    C115669n.INSTANCE.idkeyStat(485, 48, 1, false);
                    C16686a.m16193i().mo17660h().mo37036e();
                    C16686a.m16193i().mo17661j().mo17672e(true, true, -100);
                }
            }

            public C18102s(int i) {
                this.f50049d = i;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.BackupMoveRecoverUI", "backupmove pause click stop merge button.");
                C76879j.m92741l(BackupMoveRecoverUI.this, C0966R.string.aac, C0966R.string.aab, C0966R.string.abo, C0966R.string.a_u, false, new C18103a(), (DialogInterface.OnClickListener) null, C0966R.color.f3114fq);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$t */
        public class C18104t implements View.OnClickListener {
            public C18104t() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C16686a.m16193i().mo142622e().mo142628f(25);
                BackupMoveRecoverUI backupMoveRecoverUI = BackupMoveRecoverUI.this;
                boolean z = BackupMoveRecoverUI.f50019q;
                backupMoveRecoverUI.mo7681K7(1);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$a$u */
        public class C18105u implements View.OnClickListener {
            public C18105u() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.BackupMoveRecoverUI", "backupmove click start merge button.");
                if (!C16686a.m16193i().mo17661j().mo17675h()) {
                    Log.m105920e("MicroMsg.BackupMoveRecoverUI", "miss recover merge data.");
                    C16686a.m16193i().mo142622e().mo142628f(-22);
                    C18083a.this.mo17667K(-22);
                    C115669n.INSTANCE.idkeyStat(485, 6, 1, false);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C16686a.m16193i().mo17661j().mo17677j(false);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveRecoverUI$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C18083a() {
        }

        /* renamed from: K */
        public void mo17667K(int i) {
            int i2 = i;
            C102911g e = C16686a.m16193i().mo142622e();
            Log.m105925i("MicroMsg.BackupMoveRecoverUI", "onUpdateUIProgress state[%d], isActivityOnTop[%b], transferSession[%d], totalSession[%d], mergePercent[%d]", Integer.valueOf(i), Boolean.valueOf(BackupMoveRecoverUI.f50020r), Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c), Integer.valueOf(e.f303750d));
            if (i2 == -100) {
                BackupMoveRecoverUI.this.mo7681K7(1);
            } else if (i2 == -24) {
                BackupMoveRecoverUI.this.mo7681K7(1);
            } else if (i2 == 1) {
                BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.C0969drawable.bv9);
                BackupMoveRecoverUI.this.f50023g.setText(C0966R.string.aa_);
                if (!C90183c.m112859g(C16686a.m16193i().mo17661j().f45114H)) {
                    TextView textView = BackupMoveRecoverUI.this.f50024h;
                    textView.setText(BackupMoveRecoverUI.this.getString(C0966R.string.mk6) + "\n" + BackupMoveRecoverUI.this.getString(C0966R.string.ab6));
                } else {
                    BackupMoveRecoverUI.this.f50024h.setText(C0966R.string.ab6);
                }
                BackupMoveRecoverUI.this.f50024h.setVisibility(0);
                BackupMoveRecoverUI.this.f50021e.setVisibility(4);
                BackupMoveRecoverUI.this.f50022f.setVisibility(4);
                BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                BackupMoveRecoverUI.m18710N7(BackupMoveRecoverUI.this);
            } else if (i2 == 52) {
                BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.C0969drawable.bv9);
                BackupMoveRecoverUI.this.f50023g.setText(C0966R.string.f360139ab3);
                BackupMoveRecoverUI.this.f50021e.setText(C0966R.string.ab5);
                BackupMoveRecoverUI.this.f50022f.setText(C0966R.string.ab4);
                BackupMoveRecoverUI.this.f50024h.setVisibility(4);
                BackupMoveRecoverUI.this.f50021e.setVisibility(0);
                BackupMoveRecoverUI.this.f50022f.setVisibility(0);
                BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                BackupMoveRecoverUI.this.f50021e.setOnClickListener(new C18094k(this));
                BackupMoveRecoverUI.this.f50022f.setOnClickListener(new C18098n(this));
                BackupMoveRecoverUI.m18710N7(BackupMoveRecoverUI.this);
            } else if (i2 == -22) {
                BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.raw.backup_move_error);
                BackupMoveRecoverUI.this.f50023g.setText(C0966R.string.aao);
                C16686a.m16193i().mo17660h().mo37036e();
                BackupMoveRecoverUI.this.f50024h.setVisibility(4);
                BackupMoveRecoverUI.this.f50021e.setVisibility(4);
                BackupMoveRecoverUI.this.f50022f.setVisibility(4);
                BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                BackupMoveRecoverUI.m18710N7(BackupMoveRecoverUI.this);
            } else if (i2 == -21) {
                BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.raw.backup_move_error);
                BackupMoveRecoverUI.this.f50023g.setText(C0966R.string.aaz);
                BackupMoveRecoverUI.this.f50024h.setVisibility(4);
                BackupMoveRecoverUI.this.f50021e.setVisibility(4);
                BackupMoveRecoverUI.this.f50022f.setVisibility(4);
                BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                BackupMoveRecoverUI.m18710N7(BackupMoveRecoverUI.this);
            } else if (i2 == -5) {
                BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.raw.backup_move_error);
                BackupMoveRecoverUI.this.f50023g.setText(C0966R.string.aai);
                BackupMoveRecoverUI.this.f50021e.setText(C0966R.string.abm);
                BackupMoveRecoverUI.this.f50022f.setText(C0966R.string.abp);
                BackupMoveRecoverUI.this.f50024h.setVisibility(4);
                BackupMoveRecoverUI.this.f50021e.setVisibility(0);
                BackupMoveRecoverUI.this.f50022f.setVisibility(0);
                BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                BackupMoveRecoverUI.this.f50021e.setOnClickListener(new C2061j());
                BackupMoveRecoverUI.this.f50022f.setOnClickListener(new C18095l(i2));
                BackupMoveRecoverUI.m18710N7(BackupMoveRecoverUI.this);
            } else if (i2 == -4) {
                BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.raw.backup_move_error);
                BackupMoveRecoverUI backupMoveRecoverUI = BackupMoveRecoverUI.this;
                backupMoveRecoverUI.f50023g.setText(backupMoveRecoverUI.getString(C0966R.string.ab7, new Object[]{Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c), "0M"}));
                BackupMoveRecoverUI.this.f50024h.setText(C0966R.string.aar);
                BackupMoveRecoverUI.this.f50021e.setText(C0966R.string.abm);
                BackupMoveRecoverUI.this.f50022f.setText(C0966R.string.abp);
                BackupMoveRecoverUI.this.f50021e.setOnClickListener(new C18089f());
                BackupMoveRecoverUI.this.f50022f.setOnClickListener(new C18090g(i2));
                BackupMoveRecoverUI backupMoveRecoverUI2 = BackupMoveRecoverUI.this;
                backupMoveRecoverUI2.f50024h.setTextColor(backupMoveRecoverUI2.getResources().getColor(C0966R.color.f3114fq));
                BackupMoveRecoverUI.this.f50024h.setVisibility(0);
                BackupMoveRecoverUI.this.f50021e.setVisibility(0);
                BackupMoveRecoverUI.this.f50022f.setVisibility(0);
                BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                BackupMoveRecoverUI.m18711O7(BackupMoveRecoverUI.this);
            } else if (i2 == -3) {
                BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.raw.backup_move_error);
                BackupMoveRecoverUI.this.f50023g.setText(C0966R.string.aag);
                BackupMoveRecoverUI.this.f50024h.setText(C0966R.string.aah);
                BackupMoveRecoverUI.this.f50021e.setText(C0966R.string.abk);
                BackupMoveRecoverUI.this.f50022f.setText(C0966R.string.abp);
                BackupMoveRecoverUI backupMoveRecoverUI3 = BackupMoveRecoverUI.this;
                backupMoveRecoverUI3.f50024h.setTextColor(backupMoveRecoverUI3.getResources().getColor(C0966R.color.f3114fq));
                BackupMoveRecoverUI.this.f50024h.setVisibility(0);
                BackupMoveRecoverUI.this.f50021e.setVisibility(0);
                BackupMoveRecoverUI.this.f50022f.setVisibility(0);
                BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                BackupMoveRecoverUI.this.f50021e.setOnClickListener(new C2060h());
                BackupMoveRecoverUI.this.f50022f.setOnClickListener(new C18092i(i2));
                BackupMoveRecoverUI.m18710N7(BackupMoveRecoverUI.this);
            } else if (i2 == -2 || i2 == -1) {
                BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.raw.backup_move_error);
                BackupMoveRecoverUI.this.f50023g.setText(C0966R.string.aau);
                String A = C102913k.m136029A(BackupMoveRecoverUI.this);
                String str = C16686a.m16193i().mo17661j().f45117K;
                if (Util.isNullOrNil(A)) {
                    A = "移动网络";
                }
                if (Util.isNullOrNil(str)) {
                    str = "移动网络";
                }
                if (!A.equals("wifi") && !str.equals("wifi")) {
                    BackupMoveRecoverUI backupMoveRecoverUI4 = BackupMoveRecoverUI.this;
                    backupMoveRecoverUI4.f50024h.setText(backupMoveRecoverUI4.getString(C0966R.string.aav, new Object[]{A, str}));
                }
                BackupMoveRecoverUI backupMoveRecoverUI5 = BackupMoveRecoverUI.this;
                backupMoveRecoverUI5.f50024h.setTextColor(backupMoveRecoverUI5.getResources().getColor(C0966R.color.f3114fq));
                BackupMoveRecoverUI.this.f50024h.setVisibility(0);
                BackupMoveRecoverUI.this.f50021e.setVisibility(4);
                BackupMoveRecoverUI.this.f50022f.setVisibility(4);
                BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                BackupMoveRecoverUI.m18710N7(BackupMoveRecoverUI.this);
            } else if (i2 == 3) {
                BackupMoveRecoverUI.this.finish();
            } else if (i2 != 4) {
                switch (i2) {
                    case -14:
                        BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.raw.backup_move_error);
                        BackupMoveRecoverUI.this.f50023g.setText(C0966R.string.aaj);
                        BackupMoveRecoverUI.this.f50024h.setVisibility(4);
                        BackupMoveRecoverUI.this.f50021e.setVisibility(4);
                        BackupMoveRecoverUI.this.f50022f.setVisibility(4);
                        BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                        BackupMoveRecoverUI.m18710N7(BackupMoveRecoverUI.this);
                        return;
                    case -13:
                        BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.raw.backup_move_error);
                        BackupMoveRecoverUI.this.f50023g.setText(C0966R.string.aas);
                        BackupMoveRecoverUI backupMoveRecoverUI6 = BackupMoveRecoverUI.this;
                        backupMoveRecoverUI6.f50024h.setText(backupMoveRecoverUI6.getString(C0966R.string.aat, new Object[]{Util.getSizeKB(C16686a.m16193i().mo17661j().f45126U)}));
                        BackupMoveRecoverUI.this.f50024h.setVisibility(0);
                        BackupMoveRecoverUI.this.f50021e.setVisibility(4);
                        BackupMoveRecoverUI.this.f50022f.setVisibility(4);
                        BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                        BackupMoveRecoverUI.m18710N7(BackupMoveRecoverUI.this);
                        return;
                    case -12:
                        BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.C0969drawable.bv9);
                        BackupMoveRecoverUI.this.f50023g.setText(C0966R.string.aa_);
                        BackupMoveRecoverUI.this.f50024h.setText(C0966R.string.ab6);
                        BackupMoveRecoverUI.this.f50024h.setVisibility(0);
                        BackupMoveRecoverUI.this.f50021e.setVisibility(4);
                        BackupMoveRecoverUI.this.f50022f.setVisibility(4);
                        BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                        BackupMoveRecoverUI.m18710N7(BackupMoveRecoverUI.this);
                        C76879j.m92741l(BackupMoveRecoverUI.this, C0966R.string.aaq, 0, C0966R.string.aei, 0, false, new C18097m(), (DialogInterface.OnClickListener) null, C0966R.color.f3113fp);
                        return;
                    default:
                        switch (i2) {
                            case 22:
                                BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.C0969drawable.bv9);
                                BackupMoveRecoverUI.this.f50023g.setText(C0966R.string.abl);
                                BackupMoveRecoverUI.this.f50024h.setText(C0966R.string.ab6);
                                BackupMoveRecoverUI backupMoveRecoverUI7 = BackupMoveRecoverUI.this;
                                backupMoveRecoverUI7.f50024h.setTextColor(backupMoveRecoverUI7.getResources().getColor(C0966R.color.f3115fr));
                                BackupMoveRecoverUI.this.f50024h.setVisibility(0);
                                BackupMoveRecoverUI.this.f50021e.setVisibility(4);
                                BackupMoveRecoverUI.this.f50022f.setVisibility(4);
                                BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                                BackupMoveRecoverUI.m18711O7(BackupMoveRecoverUI.this);
                                return;
                            case 23:
                                BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.C0969drawable.bv9);
                                BackupMoveRecoverUI backupMoveRecoverUI8 = BackupMoveRecoverUI.this;
                                TextView textView2 = backupMoveRecoverUI8.f50023g;
                                C16686a.m16193i().mo17661j().getClass();
                                textView2.setText(backupMoveRecoverUI8.getString(C0966R.string.abq, new Object[]{Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c), C20842c.m22883s1()}));
                                BackupMoveRecoverUI.this.f50024h.setText(C0966R.string.ab6);
                                BackupMoveRecoverUI backupMoveRecoverUI9 = BackupMoveRecoverUI.this;
                                backupMoveRecoverUI9.f50024h.setTextColor(backupMoveRecoverUI9.getResources().getColor(C0966R.color.f3115fr));
                                BackupMoveRecoverUI.this.f50024h.setVisibility(0);
                                BackupMoveRecoverUI.this.f50021e.setVisibility(8);
                                BackupMoveRecoverUI.this.f50022f.setVisibility(4);
                                BackupMoveRecoverUI.this.f50027n.setVisibility(0);
                                BackupMoveRecoverUI.this.f50027n.setProgress(e.mo142624b());
                                BackupMoveRecoverUI.this.f50027n.setOnClickListener(new C18099o(this));
                                BackupMoveRecoverUI.m18711O7(BackupMoveRecoverUI.this);
                                return;
                            case 24:
                                Log.m105925i("MicroMsg.BackupMoveRecoverUI", "backupmove BACKUP_STATE_RECOVER_TRANSFER_FINISH isFromBanner[%b]", Boolean.valueOf(BackupMoveRecoverUI.f50019q));
                                if (BackupMoveRecoverUI.f50019q) {
                                    BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.C0969drawable.bv9);
                                    BackupMoveRecoverUI.this.f50023g.setText(C0966R.string.abr);
                                    BackupMoveRecoverUI.this.f50024h.setText(C0966R.string.abt);
                                    BackupMoveRecoverUI backupMoveRecoverUI10 = BackupMoveRecoverUI.this;
                                    backupMoveRecoverUI10.f50024h.setTextColor(backupMoveRecoverUI10.getResources().getColor(C0966R.color.f3115fr));
                                    BackupMoveRecoverUI.this.f50021e.setText(C0966R.string.abn);
                                    BackupMoveRecoverUI.this.f50022f.setText(C0966R.string.abo);
                                    BackupMoveRecoverUI.this.f50025i.setText(C0966R.string.ae4);
                                    BackupMoveRecoverUI.this.f50024h.setVisibility(0);
                                    BackupMoveRecoverUI.this.f50021e.setVisibility(0);
                                    BackupMoveRecoverUI.this.f50022f.setVisibility(0);
                                    BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                                    BackupMoveRecoverUI.this.f50021e.setOnClickListener(new C18105u());
                                    BackupMoveRecoverUI.this.f50022f.setOnClickListener(new C18084a(i2));
                                    BackupMoveRecoverUI.this.f50025i.setOnClickListener(new C18086b());
                                    return;
                                } else if (!BackupMoveRecoverUI.f50020r) {
                                    return;
                                } else {
                                    if (!C16686a.m16193i().mo17661j().mo17675h()) {
                                        Log.m105920e("MicroMsg.BackupMoveRecoverUI", "miss recover merge data.");
                                        C16686a.m16193i().mo142622e().mo142628f(-22);
                                        mo17667K(-22);
                                        C115669n.INSTANCE.idkeyStat(485, 6, 1, false);
                                        return;
                                    }
                                    C16686a.m16193i().mo17661j().mo17677j(false);
                                    return;
                                }
                            case 25:
                                if (BackupMoveRecoverUI.f50020r) {
                                    C16686a.m16193i().mo142622e().mo142628f(24);
                                    mo17667K(24);
                                    return;
                                }
                                return;
                            case 26:
                                BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.raw.backup_move_recover);
                                BackupMoveRecoverUI backupMoveRecoverUI11 = BackupMoveRecoverUI.this;
                                backupMoveRecoverUI11.f50023g.setText(backupMoveRecoverUI11.getString(C0966R.string.abi, new Object[]{Integer.valueOf(e.f303750d)}));
                                BackupMoveRecoverUI.this.f50024h.setText(C0966R.string.abj);
                                BackupMoveRecoverUI backupMoveRecoverUI12 = BackupMoveRecoverUI.this;
                                backupMoveRecoverUI12.f50024h.setTextColor(backupMoveRecoverUI12.getResources().getColor(C0966R.color.f3115fr));
                                BackupMoveRecoverUI.this.f50024h.setVisibility(0);
                                BackupMoveRecoverUI.this.f50021e.setVisibility(4);
                                BackupMoveRecoverUI.this.f50022f.setVisibility(4);
                                BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                                BackupMoveRecoverUI.m18710N7(BackupMoveRecoverUI.this);
                                return;
                            case 27:
                                BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.raw.backup_move_recover_finish);
                                BackupMoveRecoverUI.this.f50023g.setText(C0966R.string.abg);
                                BackupMoveRecoverUI backupMoveRecoverUI13 = BackupMoveRecoverUI.this;
                                backupMoveRecoverUI13.f50024h.setText(backupMoveRecoverUI13.getString(C0966R.string.abh, new Object[]{Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c)}));
                                BackupMoveRecoverUI backupMoveRecoverUI14 = BackupMoveRecoverUI.this;
                                backupMoveRecoverUI14.f50024h.setTextColor(backupMoveRecoverUI14.getResources().getColor(C0966R.color.f3115fr));
                                BackupMoveRecoverUI.this.f50021e.setText(C0966R.string.f360129aa0);
                                BackupMoveRecoverUI.this.f50024h.setVisibility(0);
                                BackupMoveRecoverUI.this.f50021e.setVisibility(0);
                                BackupMoveRecoverUI.this.f50022f.setVisibility(4);
                                BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                                BackupMoveRecoverUI.this.f50021e.setOnClickListener(new C18087c());
                                BackupMoveRecoverUI.m18710N7(BackupMoveRecoverUI.this);
                                return;
                            case 28:
                                BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.C0969drawable.bv9);
                                BackupMoveRecoverUI.this.f50023g.setText(C0966R.string.ab_);
                                BackupMoveRecoverUI.this.f50024h.setText(C0966R.string.abb);
                                BackupMoveRecoverUI backupMoveRecoverUI15 = BackupMoveRecoverUI.this;
                                backupMoveRecoverUI15.f50024h.setTextColor(backupMoveRecoverUI15.getResources().getColor(C0966R.color.f3115fr));
                                BackupMoveRecoverUI.this.f50024h.setVisibility(0);
                                BackupMoveRecoverUI.this.f50021e.setVisibility(0);
                                BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                                BackupMoveRecoverUI.this.f50021e.setText(C0966R.string.aba);
                                BackupMoveRecoverUI.this.f50021e.setOnClickListener(new C2062p());
                                BackupMoveRecoverUI.this.f50022f.setVisibility(0);
                                BackupMoveRecoverUI.this.f50022f.setText(C0966R.string.abp);
                                BackupMoveRecoverUI.this.f50022f.setOnClickListener(new C18100q());
                                BackupMoveRecoverUI.m18711O7(BackupMoveRecoverUI.this);
                                return;
                            case 29:
                                BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.C0969drawable.bv9);
                                BackupMoveRecoverUI.this.f50023g.setText(C0966R.string.aby);
                                BackupMoveRecoverUI.this.f50024h.setText(C0966R.string.f360140ac0);
                                BackupMoveRecoverUI backupMoveRecoverUI16 = BackupMoveRecoverUI.this;
                                backupMoveRecoverUI16.f50024h.setTextColor(backupMoveRecoverUI16.getResources().getColor(C0966R.color.f3115fr));
                                BackupMoveRecoverUI.this.f50024h.setVisibility(0);
                                BackupMoveRecoverUI.this.f50021e.setVisibility(0);
                                BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                                BackupMoveRecoverUI.this.f50021e.setText(C0966R.string.abx);
                                BackupMoveRecoverUI.this.f50021e.setOnClickListener(new C18101r());
                                BackupMoveRecoverUI.this.f50022f.setVisibility(0);
                                BackupMoveRecoverUI.this.f50022f.setText(C0966R.string.aaa);
                                BackupMoveRecoverUI.this.f50022f.setOnClickListener(new C18102s(i2));
                                BackupMoveRecoverUI.this.f50025i.setText(C0966R.string.ae4);
                                BackupMoveRecoverUI.this.f50025i.setOnClickListener(new C18104t());
                                return;
                            case 30:
                                BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.raw.backup_move_recover);
                                BackupMoveRecoverUI.this.f50023g.setText(C0966R.string.f360151ae3);
                                BackupMoveRecoverUI.this.f50024h.setText(C0966R.string.abj);
                                BackupMoveRecoverUI backupMoveRecoverUI17 = BackupMoveRecoverUI.this;
                                backupMoveRecoverUI17.f50024h.setTextColor(backupMoveRecoverUI17.getResources().getColor(C0966R.color.f3115fr));
                                BackupMoveRecoverUI.this.f50024h.setVisibility(0);
                                BackupMoveRecoverUI.this.f50021e.setVisibility(4);
                                BackupMoveRecoverUI.this.f50022f.setVisibility(4);
                                BackupMoveRecoverUI.this.f50027n.setVisibility(8);
                                BackupMoveRecoverUI.m18710N7(BackupMoveRecoverUI.this);
                                return;
                            default:
                                return;
                        }
                }
            } else {
                BackupMoveRecoverUI.this.f50026j.setImageResource(C0966R.C0969drawable.bv9);
                BackupMoveRecoverUI backupMoveRecoverUI18 = BackupMoveRecoverUI.this;
                TextView textView3 = backupMoveRecoverUI18.f50023g;
                C16686a.m16193i().mo17661j().getClass();
                textView3.setText(backupMoveRecoverUI18.getString(C0966R.string.abq, new Object[]{Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c), C20842c.m22883s1()}));
                BackupMoveRecoverUI.this.f50024h.setText(C0966R.string.f360143ac3);
                BackupMoveRecoverUI backupMoveRecoverUI19 = BackupMoveRecoverUI.this;
                backupMoveRecoverUI19.f50024h.setTextColor(backupMoveRecoverUI19.getResources().getColor(C0966R.color.f3115fr));
                BackupMoveRecoverUI.this.f50024h.setVisibility(0);
                BackupMoveRecoverUI.this.f50021e.setVisibility(8);
                BackupMoveRecoverUI.this.f50022f.setVisibility(0);
                BackupMoveRecoverUI.this.f50027n.setVisibility(0);
                BackupMoveRecoverUI.this.f50027n.setProgress(e.mo142624b());
                BackupMoveRecoverUI.this.f50027n.setOnClickListener(new C18088d(this));
                BackupMoveRecoverUI.this.f50022f.setText(C0966R.string.ac4);
                BackupMoveRecoverUI.this.f50022f.setOnClickListener(new C2059e());
                BackupMoveRecoverUI.m18711O7(BackupMoveRecoverUI.this);
            }
        }

        /* renamed from: P */
        public void mo17668P() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$b */
    public class C18106b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f50054d;

        public C18106b(BackupMoveRecoverUI backupMoveRecoverUI, int i) {
            this.f50054d = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105925i("MicroMsg.BackupMoveRecoverUI", "user click close. stop recover move, backupState[%d].", Integer.valueOf(this.f50054d));
            C115669n.INSTANCE.idkeyStat(485, 44, 1, false);
            C16686a.m16193i().mo17661j().mo17670c(11789, 5);
            C16686a.m16193i().mo17660h().mo37036e();
            C16686a.m16193i().mo17661j().mo17672e(true, true, -100);
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI$c */
    public class C18107c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f50055d;

        public C18107c(int i) {
            this.f50055d = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105925i("MicroMsg.BackupMoveRecoverUI", "user click close. stop recover merge, backupState[%d]", Integer.valueOf(this.f50055d));
            C115669n.INSTANCE.idkeyStat(485, 48, 1, false);
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_BACKUP_MOVE_MERGERING_BOOLEAN, Boolean.FALSE);
            C16686a.m16193i().mo17660h().mo37036e();
            C16686a.m16193i().mo17661j().mo17672e(true, true, -100);
            BackupMoveRecoverUI backupMoveRecoverUI = BackupMoveRecoverUI.this;
            boolean z = BackupMoveRecoverUI.f50019q;
            backupMoveRecoverUI.mo7681K7(1);
        }
    }

    /* renamed from: N7 */
    public static void m18710N7(BackupMoveRecoverUI backupMoveRecoverUI) {
        backupMoveRecoverUI.f50025i.setText(C0966R.string.a_z);
        backupMoveRecoverUI.f50025i.setOnClickListener(new C20367g(backupMoveRecoverUI));
    }

    /* renamed from: O7 */
    public static void m18711O7(BackupMoveRecoverUI backupMoveRecoverUI) {
        backupMoveRecoverUI.f50025i.setText(C0966R.string.f360130aa1);
        backupMoveRecoverUI.f50025i.setOnClickListener(new C20368h(backupMoveRecoverUI));
    }

    /* renamed from: P7 */
    public final void mo22662P7() {
        int a = C16686a.m16193i().mo142622e().mo142623a();
        Log.m105925i("MicroMsg.BackupMoveRecoverUI", "close btn, backupPcState:%d, backupPcState:%d ", Integer.valueOf(a), Integer.valueOf(a));
        if (!(a == -22 || a == -21 || a == -14 || a == -13 || a == -5 || a == 1)) {
            if (a != 24) {
                if (a != 30) {
                    if (a == 52) {
                        C76879j.m92741l(this, C0966R.string.aae, C0966R.string.aad, C0966R.string.abp, C0966R.string.a_u, false, new C18106b(this, a), (DialogInterface.OnClickListener) null, C0966R.color.f3114fq);
                        return;
                    } else if (!(a == -3 || a == -2 || a == -1)) {
                        if (a != 26) {
                            if (a != 27) {
                                mo7681K7(1);
                                return;
                            }
                            Log.m105925i("MicroMsg.BackupMoveRecoverUI", "recover finish, user click close, backupState[%d].", Integer.valueOf(a));
                            C16686a.m16193i().mo17661j().mo17672e(true, false, -100);
                            C16686a.m16193i().mo17660h().mo37036e();
                            return;
                        }
                    }
                }
                C76879j.m92741l(this, C0966R.string.acm, C0966R.string.acl, C0966R.string.adx, C0966R.string.a_u, false, new C18107c(a), (DialogInterface.OnClickListener) null, C0966R.color.f3114fq);
                return;
            }
            C16686a.m16193i().mo142622e().mo142628f(25);
            mo7681K7(1);
            return;
        }
        C16686a.m16193i().mo17661j().mo17672e(false, false, -100);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6537hk;
    }

    public void initView() {
        this.f50025i = (TextView) findViewById(C0966R.C0970id.a45);
        this.f50026j = (ImageView) findViewById(C0966R.C0970id.a46);
        this.f50023g = (TextView) findViewById(C0966R.C0970id.a4e);
        this.f50024h = (TextView) findViewById(C0966R.C0970id.a4d);
        this.f50021e = (TextView) findViewById(C0966R.C0970id.a3m);
        this.f50022f = (TextView) findViewById(C0966R.C0970id.a3l);
        this.f50027n = (RoundProgressBtn) findViewById(C0966R.C0970id.a4c);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            Log.m105924i("MicroMsg.BackupMoveRecoverUI", "onCreate.");
            getSupportActionBar().mo91104o();
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93150TO();
            initView();
            if (!C7134b.m7327a(this, new f$$a(this))) {
                this.f50028o = false;
                return;
            }
            try {
                C16686a.m16193i().mo17661j().f45149z = ((Boolean) WifiManager.class.getMethod("isWifiApEnabled", new Class[0]).invoke((WifiManager) getSystemService("wifi"), new Object[0])).booleanValue();
                C16686a.m16193i().mo17661j().mo17674g(this);
                Log.m105919d("MicroMsg.BackupMoveRecoverUI", "new isWifiAp:%s", Boolean.valueOf(C16686a.m16193i().mo17661j().f45149z));
            } catch (Exception unused) {
                Log.m105921e("MicroMsg.BackupMoveRecoverUI", "no such method WifiManager.isWifiApEnabled:%s", Util.getStack());
            }
        }
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.BackupMoveRecoverUI", "BackupMoveRecoverUI onDestroy.");
        super.onDestroy();
        C16690b j = C16686a.m16193i().mo17661j();
        C22400b bVar = j.f45113G;
        if (bVar != null) {
            bVar.mo35550c();
            j.f45113G = null;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo22662P7();
        return true;
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.BackupMoveRecoverUI", "onPause.");
        f50020r = false;
        C16690b j = C16686a.m16193i().mo17661j();
        C102909e eVar = this.f50029p;
        synchronized (j.f45121P) {
            ((HashSet) j.f45121P).remove(eVar);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f50028o) {
            f50020r = true;
            C16690b j = C16686a.m16193i().mo17661j();
            C102909e eVar = this.f50029p;
            synchronized (j.f45121P) {
                ((HashSet) j.f45121P).add(eVar);
            }
            f50019q = getIntent().getBooleanExtra("isRecoverTransferFinishFromBanner", false);
            ((C18083a) this.f50029p).mo17667K(C16686a.m16193i().mo142622e().mo142623a());
        }
    }
}
