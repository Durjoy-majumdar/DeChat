package iv0;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import av0.C16686a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.backup.backuppcui.BackupMigratePCUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C97625j3;
import ev0.C20612a;
import gv0.C20842c;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import xd3.C78802b;
import yu0.C102910f;
import yu0.C102911g;
import yu0.C23364b;
import zt3.C119157j;

/* renamed from: iv0.c */
public class C21140c extends C78802b {

    /* renamed from: h */
    public View f59777h = null;

    /* renamed from: i */
    public TextView f59778i = null;

    /* renamed from: j */
    public View f59779j;

    /* renamed from: n */
    public int f59780n = 100;

    /* renamed from: o */
    public int f59781o = 100;

    /* renamed from: p */
    public C23364b f59782p = new C21141a(this);

    /* renamed from: iv0.c$a */
    public static class C21141a implements C23364b {

        /* renamed from: a */
        public final WeakReference<C21140c> f59783a;

        public C21141a(C21140c cVar) {
            this.f59783a = new WeakReference<>(cVar);
        }

        /* renamed from: a */
        public void mo33100a(int i) {
            C21140c cVar = this.f59783a.get();
            if (cVar != null) {
                int i2 = C102910f.f303738g;
                if (i2 == 1) {
                    cVar.mo33099k(i);
                } else if (i2 != 22) {
                    View view = cVar.f59777h;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    cVar.mo33098j(i);
                }
            } else {
                Log.m105920e("MicroMsg.BackupChatBanner", "BackupChatBanner WeakReference is null!");
            }
        }
    }

    public C21140c(Context context) {
        super(context);
        Log.m105924i("MicroMsg.BackupChatBanner", "new BackupChatBanner.");
        if (!C20612a.m22482o().mo32286j()) {
            C20612a.m22480i().mo142622e().mo142628f(-100);
        }
        C16686a.m16193i().mo142622e().mo142628f(-100);
        this.f59778i = (TextView) this.f230569f.findViewById(C0966R.C0970id.a4u);
        this.f59777h = this.f230569f.findViewById(C0966R.C0970id.a4s);
        this.f59779j = this.f230569f.findViewById(C0966R.C0970id.a7i);
        C85801v1 u = C97625j3.m125812b().mo105906u();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_BACKUP_PC_MERGERING_BOOLEAN;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) u.mo119685f(aVar, bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_BACKUP_MOVE_MERGERING_BOOLEAN, bool)).booleanValue();
        Log.m105925i("MicroMsg.BackupChatBanner", "initialize, isPcMerging:%s, isMoveMerging:%s", Boolean.valueOf(booleanValue), Boolean.valueOf(booleanValue2));
        if (booleanValue && C20612a.m22480i().mo32275k().mo32295e()) {
            C102910f.f303738g = 1;
            C20612a.m22480i().mo142622e().mo142628f(24);
        } else if (booleanValue2 && C16686a.m16193i().mo17661j().mo17675h()) {
            C102910f.f303738g = 22;
            C16686a.m16193i().mo142622e().mo142628f(24);
        }
        View view = this.f230569f;
        if (view != null) {
            View findViewById = view.findViewById(C0966R.C0970id.a4s);
            this.f59777h = findViewById;
            findViewById.setOnClickListener(new C21139b(this));
        }
        C20612a.m22480i().mo32276l().f58090b = this.f59782p;
        C20612a.m22480i().mo32275k().f58066o = this.f59782p;
        C16686a.m16193i().mo17661j().f45122Q = this.f59782p;
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("MMKV_BACKUP");
        boolean z = mmkv.getBoolean("MMKV_BACKUP_NEED_REPORT", false);
        int i = mmkv.getInt("MMKV_BACKUP_TRY_TIME", 0);
        if (z && i > 0) {
            ((C119157j) C119157j.f356862d).mo183875f(new C98803a(this, mmkv, i));
        }
    }

    /* renamed from: a */
    public void mo7968a() {
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.f6545ht;
    }

    /* renamed from: c */
    public int mo7974c() {
        return 3;
    }

    /* renamed from: e */
    public boolean mo7970e() {
        boolean z = this.f230567d;
        if (z && this.f230568e) {
            this.f59777h.setBackgroundResource(C0966R.C0969drawable.axp);
            this.f59778i.setBackground((Drawable) null);
        } else if (z) {
            this.f59779j.setBackgroundResource(C0966R.C0969drawable.abh);
            this.f59777h.setBackgroundResource(C0966R.C0969drawable.c4w);
            this.f59778i.setBackgroundResource(C0966R.C0969drawable.bcr);
        } else if (this.f230568e) {
            this.f59779j.setBackgroundResource(C0966R.C0969drawable.abh);
            this.f59777h.setBackgroundResource(C0966R.C0969drawable.bcr);
            this.f59778i.setBackground((Drawable) null);
        } else {
            this.f59779j.setBackgroundResource(C0966R.C0969drawable.abh);
            this.f59777h.setBackground((Drawable) null);
            this.f59778i.setBackgroundResource(C0966R.C0969drawable.bcr);
        }
        int i = C102910f.f303738g;
        if (i == 1) {
            return mo33099k(C20612a.m22480i().mo142622e().mo142623a());
        }
        if (i == 22) {
            return mo33098j(C16686a.m16193i().mo142622e().mo142623a());
        }
        View view = this.f59777h;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return false;
    }

    /* renamed from: h */
    public final void mo33096h(boolean z) {
        Log.m105925i("MicroMsg.BackupChatBanner", "jumpToBackupMoveRecoverUI, isRecoverTransferFinishFromBanner[%b]", Boolean.valueOf(z));
        if (Util.isTopActivity(this.f230570g.get())) {
            Intent className = new Intent().setClassName(this.f230570g.get(), "com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI");
            className.putExtra("isRecoverTransferFinishFromBanner", z);
            MMWizardActivity.m7017L7(this.f230570g.get(), className);
        }
    }

    /* renamed from: i */
    public final void mo33097i(boolean z) {
        Log.m105924i("MicroMsg.BackupChatBanner", "jumpToBackupPcUI");
        if (!Util.isTopActivity(this.f230570g.get())) {
            return;
        }
        if (C20612a.m22480i().mo32274j().mo32285i()) {
            Intent intent = new Intent(this.f230570g.get(), BackupMigratePCUI.class);
            intent.putExtra("isRecoverTransferFinishFromBanner", z);
            MMWizardActivity.m7017L7(this.f230570g.get(), intent);
            return;
        }
        Intent className = new Intent().setClassName(this.f230570g.get(), "com.tencent.mm.plugin.backup.backuppcui.BackupPcUI");
        className.putExtra("isRecoverTransferFinishFromBanner", z);
        MMWizardActivity.m7017L7(this.f230570g.get(), className);
    }

    /* renamed from: j */
    public final boolean mo33098j(int i) {
        int i2 = i;
        if (!(i2 == -100 && i2 == this.f59781o)) {
            Log.m105925i("MicroMsg.BackupChatBanner", "refreshMoveRecoverState backupMode[%d], backupMoveState[%d]", Integer.valueOf(C102910f.f303738g), Integer.valueOf(i));
        }
        C102911g e = C16686a.m16193i().mo142622e();
        if (i2 == 4 || i2 == 5 || i2 == 23) {
            View view = this.f59777h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshMoveRecoverState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshMoveRecoverState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_migration_recieve, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
            Context context = MMApplicationContext.getContext();
            C16686a.m16193i().mo17661j().getClass();
            ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(context.getString(C0966R.string.abq, new Object[]{Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c), C20842c.m22883s1()}));
            return true;
        } else if (i2 == this.f59781o) {
            return true;
        } else {
            this.f59781o = i2;
            if (i2 != -4) {
                if (i2 != 22) {
                    if (i2 != 52) {
                        switch (i2) {
                            case 24:
                                break;
                            case 25:
                                View view3 = this.f59777h;
                                C9556a aVar2 = new C9556a();
                                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                aVar2.mo10233c(0);
                                View view4 = view3;
                                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshMoveRecoverState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view4, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshMoveRecoverState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_migration_recieve, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                                ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(MMApplicationContext.getContext().getString(C0966R.string.abs));
                                return true;
                            case 26:
                            case 27:
                                View view5 = this.f59777h;
                                C9556a aVar3 = new C9556a();
                                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                                aVar3.mo10233c(8);
                                View view6 = view5;
                                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshMoveRecoverState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view6, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshMoveRecoverState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                if (Util.isTopActivity(this.f230570g.get())) {
                                    mo33096h(true);
                                }
                                return true;
                            case 28:
                                break;
                            default:
                                View view7 = this.f59777h;
                                C9556a aVar4 = new C9556a();
                                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                                aVar4.mo10233c(8);
                                View view8 = view7;
                                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshMoveRecoverState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                C117292a.m165359e(view8, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshMoveRecoverState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                return false;
                        }
                    }
                    if (Util.isTopActivity(this.f230570g.get())) {
                        mo33096h(true);
                    }
                    return true;
                }
                View view9 = this.f59777h;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view10 = view9;
                C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshMoveRecoverState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshMoveRecoverState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_migration_recieve, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(MMApplicationContext.getContext().getString(C0966R.string.abl));
                return true;
            }
            View view11 = this.f59777h;
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
            aVar6.mo10233c(0);
            View view12 = view11;
            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshMoveRecoverState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshMoveRecoverState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_migration_recieve, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
            ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(MMApplicationContext.getContext().getString(C0966R.string.aaf));
            return true;
        }
    }

    /* renamed from: k */
    public final boolean mo33099k(int i) {
        int i2 = i;
        C102911g e = C20612a.m22480i().mo142622e();
        boolean i3 = C20612a.m22480i().mo32274j().mo32285i();
        Log.m105925i("MicroMsg.BackupChatBanner", "refreshPcState:%d, isMigrating:%b", Integer.valueOf(i), Boolean.valueOf(i3));
        if (i2 == -25) {
            View view = this.f59777h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i3) {
                ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_migration_move_to_computer, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
            } else {
                ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_display_mobile, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
            }
            ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(this.f230569f.getResources().getString(C0966R.string.ab_));
            return true;
        } else if (i2 == 14) {
            View view3 = this.f59777h;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i3) {
                ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_migration_move_to_computer, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(this.f230569f.getResources().getString(C0966R.string.mkn, new Object[]{C20842c.m22882p1(), C20842c.m22883s1()}));
            } else {
                ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_display_mobile, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                Context context = MMApplicationContext.getContext();
                C20612a.m22480i().mo32274j().getClass();
                ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(context.getString(C0966R.string.f360148ae0, new Object[]{Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c), C20842c.m22883s1()}));
            }
            return true;
        } else if (i2 == 23) {
            View view5 = this.f59777h;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i3) {
                ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_migration_move_to_computer, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(this.f230569f.getResources().getString(C0966R.string.mkn, new Object[]{C20842c.m22882p1(), C20842c.m22883s1()}));
            } else {
                ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_display_mobile, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                Context context2 = MMApplicationContext.getContext();
                C20612a.m22480i().mo32274j().getClass();
                ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(context2.getString(C0966R.string.adl, new Object[]{Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c), C20842c.m22883s1()}));
            }
            return true;
        } else if (i2 == 4 || i2 == 5) {
            View view7 = this.f59777h;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (1 == C20612a.m22480i().mo32274j().f58024a || 3 == C20612a.m22480i().mo32274j().f58024a) {
                if (i3) {
                    ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_migration_move_to_computer, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                    ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(this.f230569f.getResources().getString(C0966R.string.mkn, new Object[]{C20842c.m22882p1(), C20842c.m22883s1()}));
                } else {
                    ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_display_mobile, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                    Context context3 = MMApplicationContext.getContext();
                    C20612a.m22480i().mo32274j().getClass();
                    ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(context3.getString(C0966R.string.f360148ae0, new Object[]{Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c), C20842c.m22883s1()}));
                }
            } else if (2 == C20612a.m22480i().mo32274j().f58024a || 4 == C20612a.m22480i().mo32274j().f58024a) {
                if (i3) {
                    ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_display_mobile, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                    ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(this.f230569f.getResources().getString(C0966R.string.mkn, new Object[]{C20842c.m22882p1(), C20842c.m22883s1()}));
                } else {
                    ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_display_mobile, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                    Context context4 = MMApplicationContext.getContext();
                    C20612a.m22480i().mo32274j().getClass();
                    ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(context4.getString(C0966R.string.adl, new Object[]{Integer.valueOf(e.f303748b), Integer.valueOf(e.f303749c), C20842c.m22883s1()}));
                }
            }
            return true;
        } else if (i2 == this.f59780n) {
            return true;
        } else {
            this.f59780n = i2;
            if (i2 != -4) {
                if (i2 != 12) {
                    if (i2 == 15) {
                        View view9 = this.f59777h;
                        C9556a aVar5 = new C9556a();
                        ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                        aVar5.mo10233c(0);
                        View view10 = view9;
                        C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view10, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_display_mobile, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                        ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(MMApplicationContext.getContext().getString(i3 ? C0966R.string.mko : C0966R.string.ac8));
                        return true;
                    } else if (i2 != 22) {
                        switch (i2) {
                            case 24:
                                if (C20612a.m22482o().f58035l) {
                                    C20612a.m22482o().f58035l = false;
                                    mo33097i(true);
                                }
                                ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_display_mobile, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                                ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(MMApplicationContext.getContext().getString(C0966R.string.adn));
                                return true;
                            case 25:
                                View view11 = this.f59777h;
                                C9556a aVar6 = new C9556a();
                                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                                aVar6.mo10233c(0);
                                View view12 = view11;
                                C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                                C117292a.m165359e(view12, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_display_mobile, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                                ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(MMApplicationContext.getContext().getString(C0966R.string.adn));
                                return true;
                            case 26:
                            case 27:
                                View view13 = this.f59777h;
                                C9556a aVar7 = new C9556a();
                                ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                                aVar7.mo10233c(8);
                                View view14 = view13;
                                C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                                C117292a.m165359e(view14, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                if (Util.isTopActivity(this.f230570g.get())) {
                                    mo33097i(true);
                                }
                                return true;
                            case 28:
                                break;
                            default:
                                View view15 = this.f59777h;
                                C9556a aVar8 = new C9556a();
                                ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                                aVar8.mo10233c(8);
                                View view16 = view15;
                                C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                                C117292a.m165359e(view16, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                return false;
                        }
                    }
                }
                C20612a.m22482o().f58035l = true;
                View view17 = this.f59777h;
                C9556a aVar9 = new C9556a();
                ThreadLocal<C9556a> threadLocal9 = C60958c.f173611a;
                aVar9.mo10233c(0);
                View view18 = view17;
                C117292a.m165358d(view18, aVar9.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view18, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (1 == C20612a.m22480i().mo32274j().f58024a || 3 == C20612a.m22480i().mo32274j().f58024a) {
                    ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_display_mobile, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                } else if (2 == C20612a.m22480i().mo32274j().f58024a || 4 == C20612a.m22480i().mo32274j().f58024a) {
                    ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_display_mobile, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                }
                ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(MMApplicationContext.getContext().getString(C0966R.string.ada));
                return true;
            }
            View view19 = this.f59777h;
            C9556a aVar10 = new C9556a();
            ThreadLocal<C9556a> threadLocal10 = C60958c.f173611a;
            aVar10.mo10233c(0);
            View view20 = view19;
            C117292a.m165358d(view20, aVar10.mo10232b(), "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view19.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view20, "com/tencent/mm/plugin/backup/backupui/BackupChatBanner", "refreshPcState", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (1 == C20612a.m22480i().mo32274j().f58024a || 3 == C20612a.m22480i().mo32274j().f58024a) {
                if (i3) {
                    ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_error, this.f230570g.get().getResources().getColor(C0966R.color.f2966ao)));
                    ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(MMApplicationContext.getContext().getString(C0966R.string.mkp));
                } else {
                    ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_display_mobile, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                    ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(MMApplicationContext.getContext().getString(C0966R.string.acn));
                }
            } else if (2 == C20612a.m22480i().mo32274j().f58024a || 4 == C20612a.m22480i().mo32274j().f58024a) {
                if (i3) {
                    ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_error, this.f230570g.get().getResources().getColor(C0966R.color.f2966ao)));
                    ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(MMApplicationContext.getContext().getString(C0966R.string.mkp));
                } else {
                    ((ImageView) this.f230569f.findViewById(C0966R.C0970id.a4t)).setImageDrawable(C74933u4.m89768e(this.f230570g.get(), C0966R.raw.icons_outlined_display_mobile, this.f230570g.get().getResources().getColor(C0966R.color.BW_50)));
                    ((TextView) this.f230569f.findViewById(C0966R.C0970id.a4u)).setText(MMApplicationContext.getContext().getString(C0966R.string.aco));
                }
            }
            return true;
        }
    }
}
