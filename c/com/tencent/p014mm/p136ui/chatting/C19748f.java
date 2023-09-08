package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.Intent;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.LocalCheckResUpdateCacheFileEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import j20.C117292a;
import k20.C9556a;
import k92.C108976d;
import nj3.C76879j;
import nj3.C76912y0;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.ui.chatting.f */
public class C19748f implements C76879j.C76888o {

    /* renamed from: a */
    public final /* synthetic */ AppAttachDownloadUI f56169a;

    public C19748f(AppAttachDownloadUI appAttachDownloadUI) {
        this.f56169a = appAttachDownloadUI;
    }

    /* renamed from: a */
    public void mo5759a(int i, int i2) {
        C72683d k;
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        if (i2 != 0) {
            switch (i2) {
                case 2:
                    AppAttachDownloadUI appAttachDownloadUI = this.f56169a;
                    if (!appAttachDownloadUI.f55912K && appAttachDownloadUI.f55946u.mo101020w3()) {
                        C68070l.C68072b u = C68070l.C68072b.m80422u(appAttachDownloadUI.f55946u.getContent(), (String) null);
                        if (u.f195582i == 6 && !Util.isNullOrNil(u.f195650z) && (k = C72695v.m85069k(appAttachDownloadUI.f55946u, u.f195606o)) != null && (!C86013q1.m106450k(k.field_fileFullPath) || C86013q1.m106451l(k.field_fileFullPath) != k.field_totalLen)) {
                            appAttachDownloadUI.f55921S = true;
                            k.field_status = 101;
                            k.field_lastModifyTime = Util.nowSecond();
                            C72709y1.vx0().update(k, new String[0]);
                            appAttachDownloadUI.mo26097T7();
                            return;
                        }
                    }
                    DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                    C96787m0.m124256j(doFavoriteEvent, appAttachDownloadUI.f55946u);
                    DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                    aVar.f264684i = appAttachDownloadUI;
                    aVar.f264688m = 39;
                    doFavoriteEvent.publish();
                    return;
                case 3:
                    AppAttachDownloadUI appAttachDownloadUI2 = this.f56169a;
                    int i3 = AppAttachDownloadUI.f55901U0;
                    appAttachDownloadUI2.getClass();
                    Intent intent = new Intent(appAttachDownloadUI2, AppAttachFileListUI.class);
                    intent.setFlags(67108864);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent);
                    AppAttachDownloadUI appAttachDownloadUI3 = appAttachDownloadUI2;
                    C117292a.m165358d(appAttachDownloadUI3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/AppAttachDownloadUI", "showFileList", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    appAttachDownloadUI2.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(appAttachDownloadUI3, "com/tencent/mm/ui/chatting/AppAttachDownloadUI", "showFileList", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C115669n.INSTANCE.mo160131h(11168, 6, 1);
                    return;
                case 4:
                    AppAttachDownloadUI appAttachDownloadUI4 = this.f56169a;
                    int i4 = AppAttachDownloadUI.f55901U0;
                    appAttachDownloadUI4.getClass();
                    Intent intent2 = new Intent();
                    intent2.setClassName(appAttachDownloadUI4, "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI");
                    intent2.putExtra("Retr_Msg_Id", appAttachDownloadUI4.f55946u.getMsgId());
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent2);
                    C117292a.m165358d(appAttachDownloadUI4, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/AppAttachDownloadUI", "doOtherOpenMsg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    appAttachDownloadUI4.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(appAttachDownloadUI4, "com/tencent/mm/ui/chatting/AppAttachDownloadUI", "doOtherOpenMsg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                case 5:
                    AppAttachDownloadUI appAttachDownloadUI5 = this.f56169a;
                    int i5 = AppAttachDownloadUI.f55901U0;
                    if (appAttachDownloadUI5.mo26086I7() != null) {
                        LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent = new LocalCheckResUpdateCacheFileEvent();
                        LocalCheckResUpdateCacheFileEvent.C28773a aVar4 = localCheckResUpdateCacheFileEvent.f78859d;
                        aVar4.f78860a = 27;
                        aVar4.f78861b = 1;
                        if (appAttachDownloadUI5.mo26086I7() != null) {
                            localCheckResUpdateCacheFileEvent.f78859d.f78862c = appAttachDownloadUI5.mo26086I7().field_fileFullPath;
                        }
                        localCheckResUpdateCacheFileEvent.publish();
                        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("current template is %d", new Object[]{Integer.valueOf(C43471q.m46977a(0))}), 1).show();
                        return;
                    }
                    return;
                case 6:
                    AppAttachDownloadUI appAttachDownloadUI6 = this.f56169a;
                    int i6 = AppAttachDownloadUI.f55901U0;
                    appAttachDownloadUI6.getClass();
                    LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent2 = new LocalCheckResUpdateCacheFileEvent();
                    LocalCheckResUpdateCacheFileEvent.C28773a aVar5 = localCheckResUpdateCacheFileEvent2.f78859d;
                    aVar5.f78860a = 40;
                    aVar5.f78861b = 1;
                    if (appAttachDownloadUI6.mo26086I7() != null) {
                        localCheckResUpdateCacheFileEvent2.f78859d.f78862c = appAttachDownloadUI6.mo26086I7().field_fileFullPath;
                        localCheckResUpdateCacheFileEvent2.f78859d.f78862c = appAttachDownloadUI6.mo26086I7().field_fileFullPath;
                    }
                    localCheckResUpdateCacheFileEvent2.publish();
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("current wxa template is %d", new Object[]{Integer.valueOf(C43471q.m46977a(3))}), 1).show();
                    return;
                case 7:
                    AppAttachDownloadUI appAttachDownloadUI7 = this.f56169a;
                    int i7 = AppAttachDownloadUI.f55901U0;
                    appAttachDownloadUI7.getClass();
                    CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = new CheckResUpdateCacheFileEvent();
                    CheckResUpdateCacheFileEvent.C28720a aVar6 = checkResUpdateCacheFileEvent.f78743d;
                    aVar6.f78744a = 35;
                    aVar6.f78745b = 1;
                    if (appAttachDownloadUI7.mo26086I7() != null) {
                        checkResUpdateCacheFileEvent.f78743d.f78746c = appAttachDownloadUI7.mo26086I7().field_fileFullPath;
                    }
                    checkResUpdateCacheFileEvent.publish();
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply success", new Object[0]), 1).show();
                    return;
                case 8:
                    AppAttachDownloadUI appAttachDownloadUI8 = this.f56169a;
                    int i8 = AppAttachDownloadUI.f55901U0;
                    appAttachDownloadUI8.getClass();
                    LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent3 = new LocalCheckResUpdateCacheFileEvent();
                    LocalCheckResUpdateCacheFileEvent.C28773a aVar7 = localCheckResUpdateCacheFileEvent3.f78859d;
                    aVar7.f78860a = 27;
                    aVar7.f78861b = 2;
                    if (appAttachDownloadUI8.mo26086I7() != null) {
                        localCheckResUpdateCacheFileEvent3.f78859d.f78862c = appAttachDownloadUI8.mo26086I7().field_fileFullPath;
                    }
                    localCheckResUpdateCacheFileEvent3.publish();
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("current browse template is %d", new Object[]{Integer.valueOf(C43471q.m46977a(1))}), 1).show();
                    return;
                case 9:
                    C108976d dVar = this.f56169a.f55925U;
                    if (dVar != null) {
                        dVar.mo67895G(true);
                        return;
                    }
                    return;
                case 10:
                    AppAttachDownloadUI appAttachDownloadUI9 = this.f56169a;
                    int i9 = AppAttachDownloadUI.f55901U0;
                    appAttachDownloadUI9.getClass();
                    CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent2 = new CheckResUpdateCacheFileEvent();
                    CheckResUpdateCacheFileEvent.C28720a aVar8 = checkResUpdateCacheFileEvent2.f78743d;
                    aVar8.f78744a = 62;
                    aVar8.f78745b = 1;
                    if (appAttachDownloadUI9.mo26086I7() != null) {
                        checkResUpdateCacheFileEvent2.f78743d.f78746c = appAttachDownloadUI9.mo26086I7().field_fileFullPath;
                    }
                    checkResUpdateCacheFileEvent2.publish();
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply success", new Object[0]), 1).show();
                    return;
                case 11:
                    AppAttachDownloadUI appAttachDownloadUI10 = this.f56169a;
                    int i15 = AppAttachDownloadUI.f55901U0;
                    appAttachDownloadUI10.getClass();
                    CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent3 = new CheckResUpdateCacheFileEvent();
                    CheckResUpdateCacheFileEvent.C28720a aVar9 = checkResUpdateCacheFileEvent3.f78743d;
                    aVar9.f78744a = 62;
                    aVar9.f78745b = 2;
                    if (appAttachDownloadUI10.mo26086I7() != null) {
                        checkResUpdateCacheFileEvent3.f78743d.f78746c = appAttachDownloadUI10.mo26086I7().field_fileFullPath;
                    }
                    checkResUpdateCacheFileEvent3.publish();
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply success", new Object[0]), 1).show();
                    return;
                case 12:
                    AppAttachDownloadUI appAttachDownloadUI11 = this.f56169a;
                    int i16 = AppAttachDownloadUI.f55901U0;
                    appAttachDownloadUI11.getClass();
                    LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent4 = new LocalCheckResUpdateCacheFileEvent();
                    LocalCheckResUpdateCacheFileEvent.C28773a aVar10 = localCheckResUpdateCacheFileEvent4.f78859d;
                    aVar10.f78860a = 66;
                    aVar10.f78861b = 1;
                    if (appAttachDownloadUI11.mo26086I7() != null) {
                        localCheckResUpdateCacheFileEvent4.f78859d.f78862c = appAttachDownloadUI11.mo26086I7().field_fileFullPath;
                    }
                    localCheckResUpdateCacheFileEvent4.publish();
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("current pardus template is %d", new Object[]{Integer.valueOf(C43471q.m46977a(5))}), 1).show();
                    return;
                case 13:
                    AppAttachDownloadUI appAttachDownloadUI12 = this.f56169a;
                    int i17 = AppAttachDownloadUI.f55901U0;
                    appAttachDownloadUI12.getClass();
                    Log.m105924i("MicroMsg.AppAttachDownloadUI", "alvinluo applyToScanGoods");
                    CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent4 = new CheckResUpdateCacheFileEvent();
                    CheckResUpdateCacheFileEvent.C28720a aVar11 = checkResUpdateCacheFileEvent4.f78743d;
                    aVar11.f78744a = 64;
                    aVar11.f78745b = 1;
                    if (appAttachDownloadUI12.mo26086I7() != null) {
                        checkResUpdateCacheFileEvent4.f78743d.f78746c = appAttachDownloadUI12.mo26086I7().field_fileFullPath;
                    }
                    checkResUpdateCacheFileEvent4.publish();
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply success", new Object[0]), 1).show();
                    return;
                case 14:
                    AppAttachDownloadUI appAttachDownloadUI13 = this.f56169a;
                    if (!appAttachDownloadUI13.f55912K) {
                        C76701a.makeText((Context) appAttachDownloadUI13, (CharSequence) appAttachDownloadUI13.getString(C0966R.string.k3a), 1).show();
                        return;
                    }
                    C72683d I7 = appAttachDownloadUI13.mo26086I7();
                    if (I7 == null) {
                        Log.m105920e("MicroMsg.AppAttachDownloadUI", "[-] Fail to get app attach info.");
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z && I7.field_fileFullPath == null) {
                        Log.m105920e("MicroMsg.AppAttachDownloadUI", "[-] field_fileFullPath == null");
                        z = false;
                    }
                    if (!z || C86013q1.m106450k(I7.field_fileFullPath)) {
                        z3 = z;
                    } else {
                        Log.m105921e("MicroMsg.AppAttachDownloadUI", "[-] [%s] does not exist.", I7.field_fileFullPath);
                    }
                    if (z3) {
                        ((C98250h) C86312j.m106911c(C98250h.class)).pk0(appAttachDownloadUI13, I7.field_fileFullPath, new C19749j(appAttachDownloadUI13));
                        return;
                    } else {
                        C76701a.makeText((Context) appAttachDownloadUI13, (CharSequence) appAttachDownloadUI13.getString(C0966R.string.k3b), 1).show();
                        return;
                    }
                case 15:
                    AppAttachDownloadUI appAttachDownloadUI14 = this.f56169a;
                    int i18 = AppAttachDownloadUI.f55901U0;
                    appAttachDownloadUI14.getClass();
                    LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent5 = new LocalCheckResUpdateCacheFileEvent();
                    LocalCheckResUpdateCacheFileEvent.C28773a aVar12 = localCheckResUpdateCacheFileEvent5.f78859d;
                    aVar12.f78860a = 73;
                    aVar12.f78861b = 1;
                    if (appAttachDownloadUI14.mo26086I7() != null) {
                        localCheckResUpdateCacheFileEvent5.f78859d.f78862c = appAttachDownloadUI14.mo26086I7().field_fileFullPath;
                    }
                    localCheckResUpdateCacheFileEvent5.publish();
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply success", new Object[0]), 1).show();
                    return;
                case 16:
                    AppAttachDownloadUI appAttachDownloadUI15 = this.f56169a;
                    int i19 = AppAttachDownloadUI.f55901U0;
                    appAttachDownloadUI15.getClass();
                    LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent6 = new LocalCheckResUpdateCacheFileEvent();
                    LocalCheckResUpdateCacheFileEvent.C28773a aVar13 = localCheckResUpdateCacheFileEvent6.f78859d;
                    aVar13.f78860a = 79;
                    aVar13.f78861b = 1;
                    if (appAttachDownloadUI15.mo26086I7() != null) {
                        localCheckResUpdateCacheFileEvent6.f78859d.f78862c = appAttachDownloadUI15.mo26086I7().field_fileFullPath;
                    }
                    localCheckResUpdateCacheFileEvent6.publish();
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply success", new Object[0]), 1).show();
                    return;
                case 17:
                    if (this.f56169a.f55923T != null) {
                        ((C92331c) C86312j.m106911c(C92331c.class)).k00(this.f56169a.f55923T);
                        return;
                    }
                    return;
                case 18:
                    AppAttachDownloadUI appAttachDownloadUI16 = this.f56169a;
                    int i25 = AppAttachDownloadUI.f55901U0;
                    appAttachDownloadUI16.getClass();
                    Log.m105924i("MicroMsg.AppAttachDownloadUI", "alvinluo applyToImageOcr");
                    CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent5 = new CheckResUpdateCacheFileEvent();
                    CheckResUpdateCacheFileEvent.C28720a aVar14 = checkResUpdateCacheFileEvent5.f78743d;
                    aVar14.f78744a = 84;
                    aVar14.f78745b = 1;
                    if (appAttachDownloadUI16.mo26086I7() != null) {
                        checkResUpdateCacheFileEvent5.f78743d.f78746c = appAttachDownloadUI16.mo26086I7().field_fileFullPath;
                    }
                    checkResUpdateCacheFileEvent5.publish();
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply success", new Object[0]), 1).show();
                    return;
                case 19:
                    AppAttachDownloadUI.m21338H7(this.f56169a, 87, 1);
                    return;
                case 20:
                    AppAttachDownloadUI appAttachDownloadUI17 = this.f56169a;
                    int i26 = AppAttachDownloadUI.f55901U0;
                    if (appAttachDownloadUI17.mo26086I7() != null) {
                        LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent7 = new LocalCheckResUpdateCacheFileEvent();
                        LocalCheckResUpdateCacheFileEvent.C28773a aVar15 = localCheckResUpdateCacheFileEvent7.f78859d;
                        aVar15.f78860a = 86;
                        aVar15.f78861b = 2;
                        if (appAttachDownloadUI17.mo26086I7() != null) {
                            localCheckResUpdateCacheFileEvent7.f78859d.f78862c = appAttachDownloadUI17.mo26086I7().field_fileFullPath;
                        }
                        localCheckResUpdateCacheFileEvent7.publish();
                        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply to TextStatus", new Object[0]), 1).show();
                        return;
                    }
                    return;
                case 21:
                    AppAttachDownloadUI.m21338H7(this.f56169a, 92, 1);
                    return;
                case 22:
                    AppAttachDownloadUI.m21338H7(this.f56169a, 92, 2);
                    return;
                case 23:
                    AppAttachDownloadUI appAttachDownloadUI18 = this.f56169a;
                    int i27 = AppAttachDownloadUI.f55901U0;
                    appAttachDownloadUI18.getClass();
                    Log.m105924i("MicroMsg.AppAttachDownloadUI", "applyToSelectText");
                    CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent6 = new CheckResUpdateCacheFileEvent();
                    CheckResUpdateCacheFileEvent.C28720a aVar16 = checkResUpdateCacheFileEvent6.f78743d;
                    aVar16.f78744a = 84;
                    aVar16.f78745b = 2;
                    if (appAttachDownloadUI18.mo26086I7() != null) {
                        checkResUpdateCacheFileEvent6.f78743d.f78746c = appAttachDownloadUI18.mo26086I7().field_fileFullPath;
                    }
                    checkResUpdateCacheFileEvent6.publish();
                    C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("apply success", new Object[0]), 1).show();
                    return;
                default:
                    return;
            }
        } else {
            AppAttachDownloadUI appAttachDownloadUI19 = this.f56169a;
            int i28 = AppAttachDownloadUI.f55901U0;
            appAttachDownloadUI19.mo26094Q7(2, 7);
            C68070l.C68072b bVar = appAttachDownloadUI19.f55951y;
            if (bVar == null || (bVar.f195626t == 0 && bVar.f195594l <= 26214400)) {
                z2 = false;
            }
            Intent intent3 = new Intent(appAttachDownloadUI19, MsgRetransmitUI.class);
            intent3.putExtra("Retr_Msg_content", appAttachDownloadUI19.f55949x);
            intent3.putExtra("Retr_Msg_Type", 2);
            intent3.putExtra("Retr_Msg_Id", appAttachDownloadUI19.f55946u.getMsgId());
            intent3.putExtra("Retr_Big_File", z2);
            C9556a aVar17 = new C9556a();
            aVar17.mo10233c(intent3);
            AppAttachDownloadUI appAttachDownloadUI20 = appAttachDownloadUI19;
            C117292a.m165358d(appAttachDownloadUI20, aVar17.mo10232b(), "com/tencent/mm/ui/chatting/AppAttachDownloadUI", "doRestransmitMsg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            appAttachDownloadUI19.startActivity((Intent) aVar17.mo10231a(0));
            C117292a.m165359e(appAttachDownloadUI20, "com/tencent/mm/ui/chatting/AppAttachDownloadUI", "doRestransmitMsg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
