package com.tencent.p014mm.plugin.backup.backuppcui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.backup.backupui.PCChooseConversationUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72986n2;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C97625j3;
import ev0.C20612a;
import ev0.C20625e;
import ev0.C20633g;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import p214om.C11502f;
import qv0.C101304e;
import qv0.C22133b;
import yu0.C102912i;
import yu0.C102913k;
import yu0.C23366d;
import zu0.d$$d;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI */
public class BackupPcUI extends MMWizardActivity implements d$$d {

    /* renamed from: o */
    public static boolean f50094o;

    /* renamed from: e */
    public TextView f50095e;

    /* renamed from: f */
    public TextView f50096f;

    /* renamed from: g */
    public TextView f50097g;

    /* renamed from: h */
    public TextView f50098h;

    /* renamed from: i */
    public TextView f50099i;

    /* renamed from: j */
    public ImageView f50100j;

    /* renamed from: n */
    public C23366d f50101n = new C18125c();

    /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$a */
    public class C18123a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f50102d;

        public C18123a(BackupPcUI backupPcUI, int i) {
            this.f50102d = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105925i("MicroMsg.BackupPcUI", "low battery, user click sure. battery:%d", Integer.valueOf(this.f50102d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$b */
    public class C18124b implements DialogInterface.OnClickListener {
        public C18124b(BackupPcUI backupPcUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.BackupPcUI", "closeImpl merging user click close. stop recover merge.");
            C115669n.INSTANCE.idkeyStat(400, 26, 1, false);
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_BACKUP_PC_MERGERING_BOOLEAN, Boolean.FALSE);
            C20612a.m22480i().mo32273h().mo37036e();
            C20612a.m22480i().mo32275k().mo32292b(true, true, -100);
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c */
    public class C18125c implements C23366d {

        /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$a */
        public class C18126a implements View.OnClickListener {

            /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$a$a */
            public class C18127a implements DialogInterface.OnClickListener {
                public C18127a(C18126a aVar) {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    Log.m105924i("MicroMsg.BackupPcUI", "user click close. stop recover.");
                    C20612a.m22480i().mo32273h().mo37036e();
                    C20612a.m22480i().mo32275k().mo32292b(true, true, -100);
                    C115669n.INSTANCE.idkeyStat(400, 52, 1, false);
                    C20612a.m22480i().mo32275k().mo32291a(13737, 4);
                }
            }

            public C18126a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C76879j.m92741l(BackupPcUI.this, C0966R.string.acm, C0966R.string.acl, C0966R.string.adx, C0966R.string.a_u, false, new C18127a(this), (DialogInterface.OnClickListener) null, C0966R.color.f3114fq);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$b */
        public class C18128b implements View.OnClickListener {

            /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$b$a */
            public class C18129a implements DialogInterface.OnClickListener {
                public C18129a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    Log.m105924i("MicroMsg.BackupPcUI", "user click close. stop backup.");
                    C115669n.INSTANCE.idkeyStat(400, 10, 1, false);
                    C20612a.m22480i().mo32276l().mo32306d(13737, 4);
                    C20612a.m22480i().mo32273h().mo37036e();
                    C20612a.m22480i().mo32276l().mo32307e(true);
                    C20612a.m22480i().mo142622e().mo142628f(-100);
                    BackupPcUI backupPcUI = BackupPcUI.this;
                    boolean z = BackupPcUI.f50094o;
                    backupPcUI.mo7681K7(1);
                }
            }

            public C18128b() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C76879j.m92741l(BackupPcUI.this, C0966R.string.ack, C0966R.string.acj, C0966R.string.adw, C0966R.string.a_u, false, new C18129a(), (DialogInterface.OnClickListener) null, C0966R.color.f3114fq);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$c */
        public class C18130c implements View.OnClickListener {

            /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$c$a */
            public class C18131a implements DialogInterface.OnClickListener {
                public C18131a(C18130c cVar) {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    Log.m105924i("MicroMsg.BackupPcUI", "user click close. stop recover.");
                    C115669n.INSTANCE.idkeyStat(400, 18, 1, false);
                    C20612a.m22480i().mo32275k().mo32291a(13737, 4);
                    C20612a.m22480i().mo32273h().mo37036e();
                    C20612a.m22480i().mo32275k().mo32292b(true, true, -100);
                }
            }

            public C18130c() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C76879j.m92741l(BackupPcUI.this, C0966R.string.acm, C0966R.string.acl, C0966R.string.adx, C0966R.string.a_u, false, new C18131a(this), (DialogInterface.OnClickListener) null, C0966R.color.f3114fq);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$d */
        public class C18132d implements View.OnClickListener {
            public C18132d() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                BackupPcUI.m18750N7(BackupPcUI.this);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$e */
        public class C18133e implements View.OnClickListener {
            public C18133e() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                BackupPcUI.m18750N7(BackupPcUI.this);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$f */
        public class C18134f implements View.OnClickListener {
            public C18134f() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                BackupPcUI backupPcUI = BackupPcUI.this;
                boolean z = BackupPcUI.f50094o;
                backupPcUI.mo22723O7();
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$g */
        public class C18135g implements View.OnClickListener {
            public C18135g() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                BackupPcUI backupPcUI = BackupPcUI.this;
                boolean z = BackupPcUI.f50094o;
                backupPcUI.mo7681K7(1);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$h */
        public class C18136h implements View.OnClickListener {
            public C18136h() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C20612a.m22480i().mo32274j().mo32281e(2);
                C20612a.m22480i().mo142622e().mo142628f(12);
                C18125c.this.mo17667K(12);
                BackupPcUI.this.getClass();
                C101304e m = C20612a.m22480i().mo32277m();
                m.mo140772i(m.mo140770g());
                C20612a.m22480i().mo32276l().mo17698b(C102913k.m136056u(m.mo140769f()));
                C20612a.m22480i().mo32276l().mo32305c((long) m.mo140769f().size());
                C20612a.m22480i().mo32277m().mo140765b();
                C20612a.m22480i().mo32277m().mo140766c();
                C20612a.m22480i().mo32277m().mo140764a(true);
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(400, 7, 1, false);
                nVar.mo160131h(13735, 9, Integer.valueOf(C20612a.m22480i().mo32274j().f58038o));
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$i */
        public class C18137i implements View.OnClickListener {
            public C18137i() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                MMWizardActivity.m7017L7(BackupPcUI.this, new Intent(BackupPcUI.this, PCChooseConversationUI.class));
                C20612a.m22480i().mo32277m().mo140765b();
                C20612a.m22480i().mo32277m().mo140766c();
                C20612a.m22480i().mo32277m().mo140764a(false);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$j */
        public class C18138j implements View.OnClickListener {
            public C18138j() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C20612a.m22480i().mo32273h().mo37036e();
                C20612a.m22480i().mo32276l().mo32307e(true);
                C20612a.m22480i().mo142622e().mo142628f(-100);
                BackupPcUI backupPcUI = BackupPcUI.this;
                boolean z = BackupPcUI.f50094o;
                backupPcUI.mo7681K7(1);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$k */
        public class C18139k implements View.OnClickListener {
            public C18139k() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(13735, 23, Integer.valueOf(C20612a.m22480i().mo32274j().f58038o));
                C20612a.m22480i().mo32274j().mo32281e(4);
                C20612a.m22480i().mo142622e().mo142628f(22);
                C18125c.this.mo17667K(22);
                nVar.idkeyStat(400, 16, 1, false);
                C22133b.f62617a.mo35248a(6, 1, C20612a.m22482o().f58033j);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$l */
        public class C18140l implements View.OnClickListener {
            public C18140l() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.BackupPcUI", "onUpdateUIProgress user click start merge.");
                if (C20612a.m22480i().mo32275k().mo32295e() || C20612a.m22480i().mo32275k().mo32295e()) {
                    C115669n.INSTANCE.mo160131h(13735, 27, Integer.valueOf(C20612a.m22480i().mo32274j().f58038o));
                    C20612a.m22480i().mo32275k().mo32298h();
                    C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C20612a.m22480i().mo142622e().mo142628f(-22);
                C18125c.this.mo17667K(-22);
                C115669n.INSTANCE.idkeyStat(400, 64, 1, false);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$m */
        public class C18141m implements View.OnClickListener {

            /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$m$a */
            public class C18142a implements DialogInterface.OnClickListener {
                public C18142a(C18141m mVar) {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    Log.m105924i("MicroMsg.BackupPcUI", "user click close. stop recover merge.");
                    C115669n.INSTANCE.idkeyStat(400, 26, 1, false);
                    C20612a.m22480i().mo32273h().mo37036e();
                    C20612a.m22480i().mo32275k().mo32292b(true, true, -100);
                }
            }

            public C18141m() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C76879j.m92741l(BackupPcUI.this, C0966R.string.acm, C0966R.string.acl, C0966R.string.adx, C0966R.string.a_u, false, new C18142a(this), (DialogInterface.OnClickListener) null, C0966R.color.f3114fq);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$n */
        public class C18143n implements View.OnClickListener {
            public C18143n() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C20612a.m22480i().mo142622e().mo142628f(25);
                BackupPcUI backupPcUI = BackupPcUI.this;
                boolean z = BackupPcUI.f50094o;
                backupPcUI.mo7681K7(1);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$o */
        public class C18144o implements View.OnClickListener {
            public C18144o() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C20612a.m22480i().mo32273h().mo37036e();
                C20612a.m22480i().mo142622e().mo142628f(-100);
                BackupPcUI backupPcUI = BackupPcUI.this;
                boolean z = BackupPcUI.f50094o;
                backupPcUI.mo7681K7(1);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$p */
        public class C18145p implements View.OnClickListener {

            /* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$p$a */
            public class C18146a implements DialogInterface.OnClickListener {
                public C18146a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    Log.m105924i("MicroMsg.BackupPcUI", "user click close. stop backup.");
                    C20612a.m22480i().mo32273h().mo37036e();
                    C20612a.m22480i().mo32276l().mo32307e(true);
                    C20612a.m22480i().mo142622e().mo142628f(-100);
                    C115669n.INSTANCE.idkeyStat(400, 52, 1, false);
                    C20612a.m22480i().mo32276l().mo32306d(13737, 4);
                    BackupPcUI backupPcUI = BackupPcUI.this;
                    boolean z = BackupPcUI.f50094o;
                    backupPcUI.mo7681K7(1);
                }
            }

            public C18145p() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C76879j.m92741l(BackupPcUI.this, C0966R.string.ack, C0966R.string.acj, C0966R.string.adw, C0966R.string.a_u, false, new C18146a(), (DialogInterface.OnClickListener) null, C0966R.color.f3114fq);
                C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C18125c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:60:0x054c, code lost:
            if (r2 != 4) goto L_0x05ea;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0626, code lost:
            if (r2 != 4) goto L_0x069a;
         */
        /* renamed from: K */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo17667K(int r17) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                ev0.a r2 = ev0.C20612a.m22480i()
                ev0.b r2 = r2.mo32274j()
                int r2 = r2.f58024a
                r3 = 2
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
                r6 = 0
                r4[r6] = r5
                java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
                r7 = 1
                r4[r7] = r5
                java.lang.String r5 = "MicroMsg.BackupPcUI"
                java.lang.String r8 = "onUpdateUIProgress backupPcState:%d, commandMode:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r4)
                ev0.a r4 = ev0.C20612a.m22480i()
                yu0.g r4 = r4.mo142622e()
                r5 = -100
                if (r1 == r5) goto L_0x0939
                r5 = -13
                r8 = 4
                if (r1 == r5) goto L_0x0908
                if (r1 == r7) goto L_0x08db
                r9 = 30
                r10 = 2131100134(0x7f0601e6, float:1.781264E38)
                if (r1 == r9) goto L_0x0895
                r9 = -5
                if (r1 == r9) goto L_0x086e
                r9 = -4
                r11 = 2131822236(0x7f11069c, float:1.9277238E38)
                r14 = 2131822223(0x7f11068f, float:1.9277211E38)
                r13 = 3
                if (r1 == r9) goto L_0x07a4
                r9 = -3
                r12 = 2131822201(0x7f110679, float:1.9277167E38)
                if (r1 == r9) goto L_0x076a
                r9 = -2
                if (r1 == r9) goto L_0x06d0
                r9 = -1
                if (r1 == r9) goto L_0x06d0
                r9 = 2131231120(0x7f080190, float:1.8078312E38)
                if (r1 == r8) goto L_0x0620
                r12 = 5
                if (r1 == r12) goto L_0x0546
                r11 = 11
                if (r1 == r11) goto L_0x04c7
                r11 = 12
                r15 = 2131822211(0x7f110683, float:1.9277187E38)
                r5 = 2131822212(0x7f110684, float:1.927719E38)
                if (r1 == r11) goto L_0x0486
                r11 = 14
                if (r1 == r11) goto L_0x041b
                r11 = 15
                r12 = 2131822056(0x7f1105e8, float:1.9276873E38)
                if (r1 == r11) goto L_0x039f
                switch(r1) {
                    case -23: goto L_0x0378;
                    case -22: goto L_0x0346;
                    case -21: goto L_0x031f;
                    default: goto L_0x007e;
                }
            L_0x007e:
                r2 = 2131822222(0x7f11068e, float:1.927721E38)
                switch(r1) {
                    case 21: goto L_0x02de;
                    case 22: goto L_0x02a0;
                    case 23: goto L_0x023b;
                    case 24: goto L_0x0175;
                    case 25: goto L_0x015b;
                    case 26: goto L_0x0102;
                    case 27: goto L_0x0086;
                    default: goto L_0x0084;
                }
            L_0x0084:
                goto L_0x0940
            L_0x0086:
                qv0.b r1 = qv0.C22133b.f62617a
                r2 = 6
                ev0.b r5 = ev0.C20612a.m22482o()
                java.lang.String r5 = r5.f58033j
                r1.mo35248a(r2, r13, r5)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r1 = r1.f50100j
                r2 = 2131231119(0x7f08018f, float:1.807831E38)
                r1.setImageResource(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50097g
                r2 = 2131822214(0x7f110686, float:1.9277193E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50098h
                r5 = 2131822215(0x7f110687, float:1.9277195E38)
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r9 = r4.f303748b
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r3[r6] = r9
                int r4 = r4.f303749c
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r7] = r4
                java.lang.String r1 = r1.getString(r5, r3)
                r2.setText(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50098h
                android.content.res.Resources r1 = r1.getResources()
                int r1 = r1.getColor(r10)
                r2.setTextColor(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setText(r12)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$o r2 = new com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$o
                r2.<init>()
                r1.setOnClickListener(r2)
                r16.mo22728b()
                goto L_0x0940
            L_0x0102:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r1 = r1.f50100j
                r1.setImageResource(r9)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r3 = r1.f50097g
                r5 = 2131822217(0x7f110689, float:1.92772E38)
                java.lang.Object[] r7 = new java.lang.Object[r7]
                int r4 = r4.f303750d
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r7[r6] = r4
                java.lang.String r1 = r1.getString(r5, r7)
                r3.setText(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r3 = 2131822216(0x7f110688, float:1.9277197E38)
                r1.setText(r3)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r3 = r1.f50098h
                android.content.res.Resources r1 = r1.getResources()
                int r1 = r1.getColor(r10)
                r3.setTextColor(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50099i
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r8)
                r16.mo22728b()
                goto L_0x0940
            L_0x015b:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isTopActivity(r1)
                if (r1 == 0) goto L_0x0940
                ev0.a r1 = ev0.C20612a.m22480i()
                yu0.g r1 = r1.mo142622e()
                r2 = 24
                r1.mo142628f(r2)
                r0.mo17667K(r2)
                goto L_0x0940
            L_0x0175:
                boolean r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.f50094o
                if (r1 == 0) goto L_0x01f9
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r1 = r1.f50100j
                r1.setImageResource(r9)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50097g
                r3 = 2131822224(0x7f110690, float:1.9277213E38)
                r1.setText(r3)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r3 = 2131822226(0x7f110692, float:1.9277217E38)
                r1.setText(r3)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r3 = r1.f50098h
                android.content.res.Resources r1 = r1.getResources()
                int r1 = r1.getColor(r10)
                r3.setTextColor(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r3 = 2131822219(0x7f11068b, float:1.9277203E38)
                r1.setText(r3)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50099i
                r2 = 2131822258(0x7f1106b2, float:1.9277282E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$l r2 = new com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$l
                r2.<init>()
                r1.setOnClickListener(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$m r2 = new com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$m
                r2.<init>()
                r1.setOnClickListener(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50099i
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$n r2 = new com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$n
                r2.<init>()
                r1.setOnClickListener(r2)
                goto L_0x0940
            L_0x01f9:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isTopActivity(r1)
                if (r1 == 0) goto L_0x0940
                ev0.a r1 = ev0.C20612a.m22480i()
                ev0.e r1 = r1.mo32275k()
                boolean r1 = r1.mo32295e()
                if (r1 != 0) goto L_0x022e
                ev0.a r1 = ev0.C20612a.m22480i()
                yu0.g r1 = r1.mo142622e()
                r2 = -22
                r1.mo142628f(r2)
                r1 = -22
                r0.mo17667K(r1)
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 400(0x190, double:1.976E-321)
                r5 = 64
                r7 = 1
                r9 = 0
                r2.idkeyStat(r3, r5, r7, r9)
                return
            L_0x022e:
                ev0.a r1 = ev0.C20612a.m22480i()
                ev0.e r1 = r1.mo32275k()
                r1.mo32298h()
                goto L_0x0940
            L_0x023b:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r1 = r1.f50100j
                r1.setImageResource(r9)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50097g
                java.lang.Object[] r9 = new java.lang.Object[r13]
                int r11 = r4.f303748b
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r9[r6] = r11
                int r4 = r4.f303749c
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r9[r7] = r4
                ev0.a r4 = ev0.C20612a.m22480i()
                ev0.b r4 = r4.mo32274j()
                r4.getClass()
                java.lang.String r4 = gv0.C20842c.m22883s1()
                r9[r3] = r4
                java.lang.String r1 = r1.getString(r14, r9)
                r2.setText(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setText(r5)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50098h
                android.content.res.Resources r1 = r1.getResources()
                int r1 = r1.getColor(r10)
                r2.setTextColor(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r8)
                r16.mo22729c()
                goto L_0x0940
            L_0x02a0:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r1 = r1.f50100j
                r1.setImageResource(r9)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50097g
                r1.setText(r15)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setText(r5)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50098h
                android.content.res.Resources r1 = r1.getResources()
                int r1 = r1.getColor(r10)
                r2.setTextColor(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r8)
                r16.mo22729c()
                goto L_0x0940
            L_0x02de:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r1 = r1.f50100j
                r1.setImageResource(r9)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50097g
                r2 = 2131822221(0x7f11068d, float:1.9277207E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r2 = 2131822220(0x7f11068c, float:1.9277205E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$k r2 = new com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$k
                r2.<init>()
                r1.setOnClickListener(r2)
                r16.mo22728b()
                goto L_0x0940
            L_0x031f:
                r0.mo22727a(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50097g
                r2 = 2131822198(0x7f110676, float:1.927716E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r8)
                r16.mo22728b()
                goto L_0x0940
            L_0x0346:
                r0.mo22727a(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50097g
                r2 = 2131822190(0x7f11066e, float:1.9277144E38)
                r1.setText(r2)
                ev0.a r1 = ev0.C20612a.m22480i()
                zu0.c r1 = r1.mo32273h()
                r1.mo37036e()
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r8)
                r16.mo22728b()
                goto L_0x0940
            L_0x0378:
                r0.mo22727a(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50097g
                r2 = 2131822187(0x7f11066b, float:1.9277138E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r8)
                r16.mo22728b()
                goto L_0x0940
            L_0x039f:
                qv0.b r1 = qv0.C22133b.f62617a
                ev0.b r2 = ev0.C20612a.m22482o()
                java.lang.String r2 = r2.f58033j
                r5 = 5
                r1.mo35248a(r5, r13, r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r1 = r1.f50100j
                r2 = 2131231116(0x7f08018c, float:1.8078304E38)
                r1.setImageResource(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50097g
                r2 = 2131822167(0x7f110657, float:1.9277098E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50098h
                r5 = 2131822168(0x7f110658, float:1.92771E38)
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r9 = r4.f303748b
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r3[r6] = r9
                int r4 = r4.f303749c
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r7] = r4
                java.lang.String r1 = r1.getString(r5, r3)
                r2.setText(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50098h
                android.content.res.Resources r1 = r1.getResources()
                int r1 = r1.getColor(r10)
                r2.setTextColor(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setText(r12)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$j r2 = new com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$j
                r2.<init>()
                r1.setOnClickListener(r2)
                r16.mo22728b()
                goto L_0x0940
            L_0x041b:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r1 = r1.f50100j
                r2 = 2131231117(0x7f08018d, float:1.8078306E38)
                r1.setImageResource(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50097g
                java.lang.Object[] r9 = new java.lang.Object[r13]
                int r11 = r4.f303748b
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r9[r6] = r11
                int r4 = r4.f303749c
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r9[r7] = r4
                ev0.a r4 = ev0.C20612a.m22480i()
                ev0.b r4 = r4.mo32274j()
                r4.getClass()
                java.lang.String r4 = gv0.C20842c.m22883s1()
                r9[r3] = r4
                r3 = 2131822238(0x7f11069e, float:1.9277242E38)
                java.lang.String r1 = r1.getString(r3, r9)
                r2.setText(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setText(r5)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50098h
                android.content.res.Resources r1 = r1.getResources()
                int r1 = r1.getColor(r10)
                r2.setTextColor(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r8)
                r16.mo22729c()
                goto L_0x0940
            L_0x0486:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r1 = r1.f50100j
                r2 = 2131231117(0x7f08018d, float:1.8078306E38)
                r1.setImageResource(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50097g
                r1.setText(r15)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setText(r5)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50098h
                android.content.res.Resources r1 = r1.getResources()
                int r1 = r1.getColor(r10)
                r2.setTextColor(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r8)
                r16.mo22729c()
                goto L_0x0940
            L_0x04c7:
                qv0.b r1 = qv0.C22133b.f62617a
                ev0.b r2 = ev0.C20612a.m22482o()
                java.lang.String r2 = r2.f58033j
                r3 = 5
                r1.mo35248a(r3, r7, r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r1 = r1.f50100j
                r2 = 2131231117(0x7f08018d, float:1.8078306E38)
                r1.setImageResource(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50097g
                r2 = 2131822233(0x7f110699, float:1.9277232E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r2 = 2131822232(0x7f110698, float:1.927723E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50098h
                android.content.res.Resources r1 = r1.getResources()
                int r1 = r1.getColor(r10)
                r2.setTextColor(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r2 = 2131822230(0x7f110696, float:1.9277226E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r2 = 2131822231(0x7f110697, float:1.9277228E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r6)
                r16.mo22728b()
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$h r2 = new com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$h
                r2.<init>()
                r1.setOnClickListener(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$i r2 = new com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$i
                r2.<init>()
                r1.setOnClickListener(r2)
                goto L_0x0940
            L_0x0546:
                if (r2 == r7) goto L_0x0599
                if (r2 == r3) goto L_0x0550
                if (r2 == r13) goto L_0x0599
                if (r2 == r8) goto L_0x0550
                goto L_0x05ea
            L_0x0550:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r1 = r1.f50100j
                r1.setImageResource(r9)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50097g
                java.lang.Object[] r5 = new java.lang.Object[r13]
                int r9 = r4.f303748b
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r5[r6] = r9
                int r4 = r4.f303749c
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5[r7] = r4
                ev0.a r4 = ev0.C20612a.m22480i()
                ev0.b r4 = r4.mo32274j()
                r4.getClass()
                java.lang.String r4 = gv0.C20842c.m22883s1()
                r5[r3] = r4
                java.lang.String r1 = r1.getString(r14, r5)
                r2.setText(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setText(r11)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$a r2 = new com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$a
                r2.<init>()
                r1.setOnClickListener(r2)
                goto L_0x05ea
            L_0x0599:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r1 = r1.f50100j
                r2 = 2131231117(0x7f08018d, float:1.8078306E38)
                r1.setImageResource(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50097g
                java.lang.Object[] r5 = new java.lang.Object[r13]
                int r9 = r4.f303748b
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r5[r6] = r9
                int r4 = r4.f303749c
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5[r7] = r4
                ev0.a r4 = ev0.C20612a.m22480i()
                ev0.b r4 = r4.mo32274j()
                r4.getClass()
                java.lang.String r4 = gv0.C20842c.m22883s1()
                r5[r3] = r4
                r3 = 2131822238(0x7f11069e, float:1.9277242E38)
                java.lang.String r1 = r1.getString(r3, r5)
                r2.setText(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r2 = 2131822234(0x7f11069a, float:1.9277234E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$p r2 = new com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$p
                r2.<init>()
                r1.setOnClickListener(r2)
            L_0x05ea:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r2 = 2131822242(0x7f1106a2, float:1.927725E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50098h
                android.content.res.Resources r1 = r1.getResources()
                r3 = 2131100133(0x7f0601e5, float:1.7812639E38)
                int r1 = r1.getColor(r3)
                r2.setTextColor(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r6)
                r16.mo22729c()
                goto L_0x0940
            L_0x0620:
                if (r2 == r7) goto L_0x065f
                if (r2 == r3) goto L_0x0629
                if (r2 == r13) goto L_0x065f
                if (r2 == r8) goto L_0x0629
                goto L_0x069a
            L_0x0629:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r1 = r1.f50100j
                r1.setImageResource(r9)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50097g
                java.lang.Object[] r5 = new java.lang.Object[r13]
                int r9 = r4.f303748b
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r5[r6] = r9
                int r4 = r4.f303749c
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5[r7] = r4
                ev0.a r4 = ev0.C20612a.m22480i()
                ev0.b r4 = r4.mo32274j()
                r4.getClass()
                java.lang.String r4 = gv0.C20842c.m22883s1()
                r5[r3] = r4
                java.lang.String r1 = r1.getString(r14, r5)
                r2.setText(r1)
                goto L_0x069a
            L_0x065f:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r1 = r1.f50100j
                r2 = 2131231117(0x7f08018d, float:1.8078306E38)
                r1.setImageResource(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50097g
                java.lang.Object[] r5 = new java.lang.Object[r13]
                int r9 = r4.f303748b
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r5[r6] = r9
                int r4 = r4.f303749c
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5[r7] = r4
                ev0.a r4 = ev0.C20612a.m22480i()
                ev0.b r4 = r4.mo32274j()
                r4.getClass()
                java.lang.String r4 = gv0.C20842c.m22883s1()
                r5[r3] = r4
                r3 = 2131822238(0x7f11069e, float:1.9277242E38)
                java.lang.String r1 = r1.getString(r3, r5)
                r2.setText(r1)
            L_0x069a:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r2 = 2131822244(0x7f1106a4, float:1.9277254E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50098h
                android.content.res.Resources r1 = r1.getResources()
                r3 = 2131100133(0x7f0601e5, float:1.7812639E38)
                int r1 = r1.getColor(r3)
                r2.setTextColor(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r8)
                r16.mo22729c()
                goto L_0x0940
            L_0x06d0:
                r0.mo22727a(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50097g
                r2 = 2131822196(0x7f110674, float:1.9277157E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                java.lang.String r1 = yu0.C102913k.m136029A(r1)
                r2 = 2131822197(0x7f110675, float:1.9277159E38)
                if (r1 == 0) goto L_0x070d
                java.lang.String r4 = ""
                boolean r4 = r1.equals(r4)
                if (r4 == 0) goto L_0x06f1
                goto L_0x070d
            L_0x06f1:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r4 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r5 = r4.f50098h
                java.lang.Object[] r3 = new java.lang.Object[r3]
                ev0.a r9 = ev0.C20612a.m22480i()
                ev0.b r9 = r9.mo32274j()
                java.lang.String r9 = r9.f58025b
                r3[r6] = r9
                r3[r7] = r1
                java.lang.String r1 = r4.getString(r2, r3)
                r5.setText(r1)
                goto L_0x072b
            L_0x070d:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r4 = r1.f50098h
                java.lang.Object[] r3 = new java.lang.Object[r3]
                ev0.a r5 = ev0.C20612a.m22480i()
                ev0.b r5 = r5.mo32274j()
                java.lang.String r5 = r5.f58025b
                r3[r6] = r5
                java.lang.String r5 = "移动网络"
                r3[r7] = r5
                java.lang.String r1 = r1.getString(r2, r3)
                r4.setText(r1)
            L_0x072b:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50098h
                android.content.res.Resources r1 = r1.getResources()
                r3 = 2131100133(0x7f0601e5, float:1.7812639E38)
                int r1 = r1.getColor(r3)
                r2.setTextColor(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setText(r12)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$d r2 = new com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$d
                r2.<init>()
                r1.setOnClickListener(r2)
                r16.mo22728b()
                goto L_0x0940
            L_0x076a:
                r0.mo22727a(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50097g
                r2 = 2131822185(0x7f110669, float:1.9277134E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setText(r12)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$e r2 = new com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$e
                r2.<init>()
                r1.setOnClickListener(r2)
                r16.mo22728b()
                goto L_0x0940
            L_0x07a4:
                java.lang.String r1 = "0M"
                if (r7 == r2) goto L_0x07f6
                if (r13 != r2) goto L_0x07ab
                goto L_0x07f6
            L_0x07ab:
                if (r3 == r2) goto L_0x07af
                if (r8 != r2) goto L_0x0842
            L_0x07af:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r2 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r2 = r2.f50100j
                r5 = 2131231118(0x7f08018e, float:1.8078308E38)
                r2.setImageResource(r5)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r2 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r5 = r2.f50097g
                java.lang.Object[] r9 = new java.lang.Object[r13]
                int r10 = r4.f303748b
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r9[r6] = r10
                int r4 = r4.f303749c
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r9[r7] = r4
                r9[r3] = r1
                java.lang.String r1 = r2.getString(r14, r9)
                r5.setText(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r2 = 2131822199(0x7f110677, float:1.9277163E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setText(r11)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$c r2 = new com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$c
                r2.<init>()
                r1.setOnClickListener(r2)
                goto L_0x0842
            L_0x07f6:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r2 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r2 = r2.f50100j
                r5 = 2131231115(0x7f08018b, float:1.8078302E38)
                r2.setImageResource(r5)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r2 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r5 = r2.f50097g
                java.lang.Object[] r9 = new java.lang.Object[r13]
                int r10 = r4.f303748b
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r9[r6] = r10
                int r4 = r4.f303749c
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r9[r7] = r4
                r9[r3] = r1
                r1 = 2131822238(0x7f11069e, float:1.9277242E38)
                java.lang.String r1 = r2.getString(r1, r9)
                r5.setText(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r2 = 2131822191(0x7f11066f, float:1.9277146E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r2 = 2131822234(0x7f11069a, float:1.9277234E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$b r2 = new com.tencent.mm.plugin.backup.backuppcui.BackupPcUI$c$b
                r2.<init>()
                r1.setOnClickListener(r2)
            L_0x0842:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50098h
                android.content.res.Resources r1 = r1.getResources()
                r3 = 2131100133(0x7f0601e5, float:1.7812639E38)
                int r1 = r1.getColor(r3)
                r2.setTextColor(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r6)
                r16.mo22729c()
                goto L_0x0940
            L_0x086e:
                r0.mo22727a(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50097g
                r2 = 2131822186(0x7f11066a, float:1.9277136E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r8)
                r16.mo22728b()
                goto L_0x0940
            L_0x0895:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r1 = r1.f50100j
                r2 = 2131755221(0x7f1000d5, float:1.9141315E38)
                r1.setImageResource(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50097g
                r2 = 2131822256(0x7f1106b0, float:1.9277278E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r2 = 2131822130(0x7f110632, float:1.9277023E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r2 = r1.f50098h
                android.content.res.Resources r1 = r1.getResources()
                int r1 = r1.getColor(r10)
                r2.setTextColor(r1)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r6)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r8)
                r16.mo22728b()
                goto L_0x0940
            L_0x08db:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.ImageView r1 = r1.f50100j
                r2 = 2131231117(0x7f08018d, float:1.8078306E38)
                r1.setImageResource(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50097g
                r2 = 2131822176(0x7f110660, float:1.9277116E38)
                r1.setText(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r8)
                r16.mo22728b()
                goto L_0x0940
            L_0x0908:
                r0.mo22727a(r2)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50097g
                r2 = 2131822195(0x7f110673, float:1.9277155E38)
                r1.setText(r2)
                ev0.a r1 = ev0.C20612a.m22480i()
                zu0.c r1 = r1.mo32273h()
                r1.mo37036e()
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50098h
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50095e
                r1.setVisibility(r8)
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                android.widget.TextView r1 = r1.f50096f
                r1.setVisibility(r8)
                r16.mo22728b()
                goto L_0x0940
            L_0x0939:
                com.tencent.mm.plugin.backup.backuppcui.BackupPcUI r1 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.this
                boolean r2 = com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.f50094o
                r1.mo7681K7(r7)
            L_0x0940:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.backup.backuppcui.BackupPcUI.C18125c.mo17667K(int):void");
        }

        /* renamed from: P */
        public void mo17668P() {
        }

        /* renamed from: a */
        public final void mo22727a(int i) {
            if (2 == i || 4 == i) {
                BackupPcUI.this.f50100j.setImageResource(C0966R.C0969drawable.bvd);
            } else {
                BackupPcUI.this.f50100j.setImageResource(C0966R.C0969drawable.bva);
            }
        }

        /* renamed from: b */
        public final void mo22728b() {
            BackupPcUI.this.f50099i.setText(C0966R.string.a_z);
            BackupPcUI.this.f50099i.setOnClickListener(new C18134f());
        }

        /* renamed from: c */
        public final void mo22729c() {
            BackupPcUI.this.f50099i.setText(C0966R.string.f360130aa1);
            BackupPcUI.this.f50099i.setOnClickListener(new C18135g());
        }

        /* renamed from: g6 */
        public void mo22713g6() {
            int i = C20612a.m22480i().mo32274j().f58024a;
            Log.m105925i("MicroMsg.BackupPcUI", "onBackupPcUpdateUICallback onBackupPcStart, commandMode[%d]", Integer.valueOf(i));
            if (i == 1) {
                C20612a.m22480i().mo142622e().mo142628f(11);
                mo17667K(11);
            } else if (i == 2) {
                C20612a.m22480i().mo142622e().mo142628f(21);
                mo17667K(21);
            } else if (i == 3) {
                C20612a.m22480i().mo142622e().mo142628f(12);
                mo17667K(12);
            } else if (i == 4) {
                C20612a.m22480i().mo142622e().mo142628f(22);
                mo17667K(22);
            }
        }
    }

    /* renamed from: N7 */
    public static void m18750N7(BackupPcUI backupPcUI) {
        backupPcUI.getClass();
        Log.m105924i("MicroMsg.BackupPcUI", "jumpToNetworkDisconnectDoc.");
        Intent intent = new Intent();
        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, backupPcUI.getString(C0966R.string.ad9));
        intent.putExtra("rawUrl", backupPcUI.getString(C0966R.string.ad8, new Object[]{LocaleUtil.getApplicationLanguage()}));
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", true);
        C88144b.m109791i(backupPcUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: N1 */
    public void mo22649N1(LinkedList<C102912i> linkedList) {
    }

    /* renamed from: O7 */
    public final void mo22723O7() {
        int a = C20612a.m22480i().mo142622e().mo142623a();
        int i = C20612a.m22480i().mo32274j().f58024a;
        Log.m105925i("MicroMsg.BackupPcUI", "closeImpl, backupPcState:%d, commandMode:%d", Integer.valueOf(a), Integer.valueOf(i));
        if (!(a == -22 || a == -21 || a == -13 || a == -5 || a == 1 || a == 11)) {
            if (a == 15) {
                Log.m105924i("MicroMsg.BackupPcUI", "closeImpl backup finish, user click close.");
                mo22724P7();
                return;
            } else if (a != 21) {
                if (a != 24) {
                    if (a != 30) {
                        if (!(a == -3 || a == -2 || a == -1)) {
                            if (a != 26) {
                                if (a != 27) {
                                    mo7681K7(1);
                                    return;
                                }
                                Log.m105924i("MicroMsg.BackupPcUI", "closeImpl recover finish, user click close.");
                                mo22724P7();
                                return;
                            }
                        }
                    }
                    C76879j.m92741l(this, C0966R.string.acm, C0966R.string.acl, C0966R.string.adx, C0966R.string.a_u, false, new C18124b(this), (DialogInterface.OnClickListener) null, C0966R.color.f3114fq);
                    return;
                }
                C20612a.m22480i().mo142622e().mo142628f(25);
                mo7681K7(1);
                return;
            }
        }
        if (1 == i || 3 == i) {
            C20612a.m22480i().mo32276l().mo32307e(false);
            C20612a.m22480i().mo142622e().mo142628f(-100);
            mo7681K7(1);
        } else if (2 == i || 4 == i) {
            C20612a.m22480i().mo32275k().mo32292b(false, false, -100);
        } else {
            C20612a.m22480i().mo142622e().mo142628f(-100);
            mo7681K7(1);
        }
    }

    /* renamed from: P7 */
    public final void mo22724P7() {
        Log.m105924i("MicroMsg.BackupPcUI", "exitBackupPc.");
        if (1 == C20612a.m22480i().mo32274j().f58024a || 3 == C20612a.m22480i().mo32274j().f58024a) {
            C20612a.m22480i().mo32277m().mo140765b();
            C20612a.m22480i().mo32277m().mo140766c();
            C20612a.m22480i().mo32276l().mo32307e(true);
            C20612a.m22480i().mo32273h().mo37036e();
            C20612a.m22480i().mo142622e().mo142628f(-100);
            mo7681K7(1);
        } else if (2 == C20612a.m22480i().mo32274j().f58024a || 4 == C20612a.m22480i().mo32274j().f58024a) {
            C20612a.m22480i().mo32275k().mo32292b(true, true, -100);
            C20612a.m22480i().mo32273h().mo37036e();
        }
    }

    /* renamed from: T4 */
    public void mo22650T4(LinkedList<C102912i> linkedList) {
    }

    /* renamed from: g1 */
    public void mo22651g1(LinkedList<C102912i> linkedList, C102912i iVar, int i) {
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6537hk;
    }

    public void initView() {
        this.f50099i = (TextView) findViewById(C0966R.C0970id.a45);
        this.f50100j = (ImageView) findViewById(C0966R.C0970id.a46);
        this.f50097g = (TextView) findViewById(C0966R.C0970id.a4e);
        this.f50098h = (TextView) findViewById(C0966R.C0970id.a4d);
        this.f50095e = (TextView) findViewById(C0966R.C0970id.a3m);
        this.f50096f = (TextView) findViewById(C0966R.C0970id.a3l);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            Log.m105924i("MicroMsg.BackupPcUI", "onCreate.");
            getSupportActionBar().mo91104o();
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).getClass();
            MMAppMgr.m85986f();
            initView();
            if (C20612a.m22480i().mo32274j().f58039p) {
                C20612a.m22480i().mo32274j().f58039p = false;
                int d = C102913k.m136039d();
                if (d < 20) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.idkeyStat(400, 4, 1, false);
                    nVar.mo160131h(13736, 4, C20612a.m22480i().mo32274j().f58025b, C102913k.m136029A(this), 0, Integer.valueOf(C20612a.m22480i().mo32274j().f58038o));
                    C76879j.m92741l(this, C0966R.string.act, C0966R.string.acs, C0966R.string.aei, 0, false, new C18123a(this, d), (DialogInterface.OnClickListener) null, C0966R.color.f3113fp);
                }
            }
            if (((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101185qq()) {
                C75604z3.m90829a();
            }
            C20612a.m22480i().mo32277m().f296794e = this;
            C20612a.m22480i().mo32277m().mo140765b();
            C20612a.m22480i().mo32277m().mo140766c();
            C20612a.m22480i().mo32277m().mo140764a(true);
        }
    }

    public void onDestroy() {
        Log.m105925i("MicroMsg.BackupPcUI", "onDestroy. stack:%s", Util.getStack());
        super.onDestroy();
        C20612a.m22480i().mo32277m().mo140765b();
        C20612a.m22480i().mo32277m().mo140766c();
        C20612a.m22480i().mo32277m().f296794e = null;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo22723O7();
        return true;
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.BackupPcUI", "onPause.");
        C20633g l = C20612a.m22480i().mo32276l();
        C23366d dVar = this.f50101n;
        synchronized (l.f58092d) {
            ((HashSet) l.f58092d).remove(dVar);
        }
        C20625e k = C20612a.m22480i().mo32275k();
        C23366d dVar2 = this.f50101n;
        synchronized (k.f58065n) {
            ((HashSet) k.f58065n).remove(dVar2);
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.BackupPcUI", "onResume.");
        C20633g l = C20612a.m22480i().mo32276l();
        C23366d dVar = this.f50101n;
        synchronized (l.f58092d) {
            ((HashSet) l.f58092d).add(dVar);
        }
        C20625e k = C20612a.m22480i().mo32275k();
        C23366d dVar2 = this.f50101n;
        synchronized (k.f58065n) {
            ((HashSet) k.f58065n).add(dVar2);
        }
        ((C18125c) this.f50101n).mo17667K(C20612a.m22480i().mo142622e().mo142623a());
    }

    public void onStart() {
        super.onStart();
        Log.m105924i("MicroMsg.BackupPcUI", "onStart.");
        f50094o = getIntent().getBooleanExtra("isRecoverTransferFinishFromBanner", false);
    }
}
