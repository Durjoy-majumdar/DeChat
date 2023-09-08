package com.tencent.p014mm.app;

import a70.C112760b;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.autogen.events.TalkRoomUitlEvent;
import com.tencent.p014mm.booter.C67852y;
import com.tencent.p014mm.modelgetchatroommsg.C68111c;
import com.tencent.p014mm.p136ui.C74785j2;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.p136ui.contact.C74584x;
import com.tencent.p014mm.p136ui.tools.C45074p;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import di3.C86312j;
import eb0.C97625j3;
import ei3.C86522b;
import f62.C31926d0;
import fw0.C75804d;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import ob0.C100323q;
import ob0.C117747y;
import ob0.C47355o;
import ob0.C76996p;
import p140cw.C7138g;
import p206nj.C88955f;
import p216op.C47389f;
import p248ug.C37468y;
import p248ug.C52558c;
import p248ug.C52574z;
import p371ph.C21967a;
import p763ym.C79138l;
import p763ym.C79139p;
import pc0.C100769w;
import pc0.C47457o;
import pc0.C77064b0;
import sw1.C48477m;
import te3.C50052jy2;
import te3.C77967mx3;
import uc0.C52522u;
import uc0.C52524x;
import wc3.C102431y;
import wc3.C53150x;

@C86522b
/* renamed from: com.tencent.mm.app.j1 */
public final class C67650j1 extends C86301e implements C102431y, C100323q, C37468y, C53150x {
    public boolean Ab0() {
        return C100769w.m131943b();
    }

    /* renamed from: B0 */
    public void mo73832B0(Intent intent, C77967mx3 mx32, int i) {
        ((C52574z) C86312j.m106911c(C52574z.class)).mo73528B0(intent, mx32, i);
    }

    /* renamed from: Bk */
    public void mo93136Bk() {
        C77064b0.yn0().mo182766j(7);
    }

    /* renamed from: CP */
    public String mo93137CP(String str, boolean z) {
        Class cls = C79138l.class;
        return ((C79138l) C86312j.m106911c(cls)).mo73990GW(str, z) != null ? ((C79138l) C86312j.m106911c(cls)).mo73990GW(str, z).field_packageName : "";
    }

    /* renamed from: CZ */
    public void mo93138CZ(int i) {
        Log.m105919d("MicroMsg.WorkerModelCallback", "trigger netscene sync, scene[%d]", Integer.valueOf(i));
        C77064b0.yn0().mo182766j(i);
    }

    /* renamed from: D4 */
    public void mo93139D4(C50052jy2 jy22, String str, byte[] bArr, boolean z, boolean z2, int i) {
        ((C31926d0) C86312j.m106911c(C31926d0.class)).mo57253D4(jy22, str, bArr, z, z2, i);
    }

    /* renamed from: D5 */
    public boolean mo93140D5(Context context, String str) {
        return ((C79138l) C86312j.m106911c(C79138l.class)).Tb0(context, str);
    }

    /* renamed from: J8 */
    public void mo93141J8(Context context, C72963f4.C72964b bVar, boolean z, boolean z2, Bundle bundle) {
        C74584x.m89301d(context, bVar, z, z2, bundle);
    }

    /* renamed from: K3 */
    public String mo93142K3(String str, String str2) {
        return ((C79139p) C86312j.m106911c(C79139p.class)).mo108862K3(str, str2);
    }

    /* renamed from: Kn */
    public void mo93143Kn(Activity activity) {
        MMAppMgr.m85990j(activity, (DialogInterface.OnClickListener) null);
    }

    /* renamed from: L1 */
    public boolean mo93144L1(String str) {
        return ((C79138l) C86312j.m106911c(C79138l.class)).mo73993L1(str);
    }

    /* renamed from: Oa */
    public void mo93145Oa(Context context) {
        MMAppMgr.m85982b(context);
    }

    public C117747y P50(C47355o oVar) {
        if (C100769w.m131943b()) {
            return new C47457o(oVar);
        }
        C77064b0.yn0().mo182766j(4);
        return null;
    }

    /* renamed from: R5 */
    public Bitmap mo93147R5(Activity activity, int i, int i2, Intent intent) {
        Activity activity2 = activity;
        int i3 = i;
        Intent intent2 = intent;
        Class<ImageCropUI> cls = ImageCropUI.class;
        if (i2 != -1) {
            return null;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4 || intent2 == null) {
                    return null;
                }
                String stringExtra = intent2.getStringExtra("CropImage_OutputPath");
                if (stringExtra == null) {
                    Log.m105920e("MicroMsg.WorkerModelCallback", "crop picture failed");
                } else {
                    Log.m105921e("MicroMsg.WorkerModelCallback", "crop picture path %s ", stringExtra);
                    return BitmapUtil.getBitmapNative(stringExtra);
                }
                return null;
            }
            String g6 = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(activity.getApplicationContext(), intent2, C112760b.m154235i());
            if (g6 == null) {
                return null;
            }
            Intent intent3 = new Intent(activity2, cls);
            intent3.putExtra("CropImageMode", 1);
            intent3.putExtra("CropImage_OutputPath", C112760b.m154235i() + "temp.avatar");
            intent3.putExtra("CropImage_ImgPath", g6);
            intent3.putExtra("CropImage_from_scene", 3);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            aVar.mo10233c(intent3);
            C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/app/WorkerModelCallbackImpl", "setAvatarResult", "(Landroid/app/Activity;IILandroid/content/Intent;)Landroid/graphics/Bitmap;", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return null;
        } else if (intent2 == null) {
            return null;
        } else {
            Intent intent4 = new Intent(activity2, cls);
            intent4.putExtra("CropImageMode", 1);
            intent4.putExtra("CropImage_Filter", true);
            intent4.putExtra("CropImage_OutputPath", C112760b.m154235i() + "temp.avatar");
            intent4.putExtra("CropImage_ImgPath", (String) null);
            intent4.putExtra("CropImage_from_scene", 3);
            C7013o.m7259a(activity, intent, intent4, C112760b.m154235i(), 4, (C7013o.C7017c) null);
            return null;
        }
    }

    public void Rv0() {
        TalkRoomUitlEvent talkRoomUitlEvent = new TalkRoomUitlEvent();
        talkRoomUitlEvent.f193954d.f193956b = true;
        talkRoomUitlEvent.publish();
    }

    /* renamed from: TE */
    public boolean mo93149TE(Activity activity) {
        if (!C88955f.m111058b()) {
            C76912y0.m92771j(activity, (View) null);
            return false;
        }
        C96892t1.m124464d(activity, 2, 1, 5, (Intent) null, true);
        return true;
    }

    /* renamed from: TO */
    public void mo93150TO() {
        MMAppMgr.m85986f();
    }

    public void Wa0(Intent intent, String str) {
        C74584x.m89302e(intent, str);
    }

    /* renamed from: a3 */
    public boolean mo93152a3(String str) {
        return ((C79138l) C86312j.m106911c(C79138l.class)).mo74006a3(str);
    }

    /* renamed from: bs */
    public void mo61114bs(C52558c cVar, Activity activity, C72996z1 z1Var, boolean z, Runnable runnable) {
        C45074p.m49920b(cVar, activity, z1Var, z, runnable, 0);
    }

    /* renamed from: c */
    public void mo61115c(C52558c cVar, Activity activity, C72996z1 z1Var, boolean z, Runnable runnable, int i) {
        C45074p.m49920b(cVar, activity, z1Var, z, runnable, i);
    }

    public void c40(Context context, String str, String str2, int i, int i2, String str3, long j) {
        C48477m a = C48477m.C13789a.m13091a();
        if (a != null) {
            a.mo65672zj(context, str, str2, i, i2, str3, j, "", 0);
        }
    }

    /* renamed from: cg */
    public Intent mo93154cg() {
        Intent intent = new Intent(MMApplicationContext.getContext(), LauncherUI.class);
        intent.putExtra("nofification_type", "talkroom_notification");
        intent.addFlags(67108864);
        return intent;
    }

    public boolean cx0() {
        return false;
    }

    /* renamed from: ee */
    public void mo61116ee(C52558c cVar, Activity activity, C72996z1 z1Var, boolean z) {
        C45074p.m49919a(cVar, activity, z1Var, z, 0);
    }

    public C76996p eh0() {
        return new C21967a(MMApplicationContext.getContext(), 0);
    }

    public void fq0() {
        C67852y.m80218c("mm_proc_startup");
        C67852y.m80218c("push_proc_startup");
    }

    public void ko0(String str) {
        C68111c.m80513e().mo93621c(str);
    }

    /* renamed from: l5 */
    public String mo93159l5(Context context, String str) {
        return ((C79138l) C86312j.m106911c(C79138l.class)).mo74012l5(context, str);
    }

    /* renamed from: mL */
    public boolean mo93160mL(C72996z1 z1Var) {
        if (z1Var == null || Util.isNullOrNil(z1Var.getUsername())) {
            Object[] objArr = new Object[1];
            objArr[0] = z1Var == null ? "-1" : z1Var.getUsername();
            Log.m105929w("MicroMsg.BigBallOfMudSyncExtension", "dealModContactExtInfo username:%s ", objArr);
            return false;
        }
        byte[] f4 = C97625j3.m125812b().mo105907v().mo69697f4(z1Var.getUsername());
        if (Util.isNullOrNil(f4)) {
            Object[] objArr2 = new Object[2];
            objArr2[0] = z1Var.getUsername();
            objArr2[1] = Integer.valueOf(f4 == null ? -1 : f4.length);
            Log.m105929w("MicroMsg.BigBallOfMudSyncExtension", "dealModContactExtInfo username:%s  buf:%d", objArr2);
            return false;
        }
        C50052jy2 jy22 = null;
        try {
            jy22 = (C50052jy2) new C50052jy2().parseFrom(f4);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BigBallOfMudSyncExtension", e, "", new Object[0]);
        }
        C97625j3.m125812b().mo105907v().mo69718o4(z1Var.getUsername());
        if (jy22 != null) {
            return C75804d.m91047a(z1Var, jy22, false);
        }
        Log.m105920e("MicroMsg.BigBallOfMudSyncExtension", "dkinit dealModContactExtInfo failed parse buf failed.");
        return false;
    }

    /* renamed from: nP */
    public String mo93161nP(String str, int i) {
        Class cls = C79138l.class;
        return ((C79138l) C86312j.m106911c(cls)).mo74003UV(str, i) != null ? ((C79138l) C86312j.m106911c(cls)).mo74003UV(str, i).field_packageName : "";
    }

    /* renamed from: s5 */
    public void mo93162s5(Context context, String str, String str2, String str3, int i, int i2, int i3, String str4, long j, String str5) {
        C48477m a = C48477m.C13789a.m13091a();
        if (a != null) {
            a.mo65665Uw(context, str, str2, str3, i, i2, i3, str4, j, str5, "");
        }
    }

    /* renamed from: uP */
    public boolean mo93163uP(Context context, int i, int i2, String str) {
        return C74785j2.C6981a.m7247a(context, i, i2, str, 4);
    }

    public String v10(Context context, String str, String str2) {
        return C72688j0.m85016b(context, str, str2);
    }

    /* renamed from: v5 */
    public boolean mo93165v5(Context context, int i, int i2, String str) {
        return C74785j2.C6981a.m7247a(context, i, i2, str, 7);
    }

    public C117747y xs0(int i, boolean z) {
        if (z) {
            ((C52524x) ((C47389f) C86312j.m106911c(C47389f.class)).mo72331SU()).mo73460Lo(i);
        }
        C52522u uVar = new C52522u(i);
        C97625j3.m125815e().mo123460f(uVar);
        return uVar;
    }

    public void yu0(Context context, C72996z1 z1Var, C72963f4.C72964b bVar, boolean z, boolean z2, Bundle bundle, String str) {
        C74584x.m89299b(context, z1Var, bVar, z, z2, bundle, str);
    }
}
