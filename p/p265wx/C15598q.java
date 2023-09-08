package p265wx;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelavatar.C1295s;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ei3.C86522b;
import f12.C7970a;
import f40.C86709a0;
import hn2.C20974j;
import ke3.C88144b;
import m53.C10756c;
import nj3.C76879j;
import p140cw.C7138g;
import p196ln.C10579k;
import p196ln.C117475p;
import p196ln.C76706g;
import p214om.C11502f;
import p220pr.C12001j;
import tm2.C14049d;
import ud2.C78150h;
import zm2.C16305c;
import zm2.C16306g;
import zm2.C23512d;
import zm2.C23519f;
import zm2.C79403a;
import zm2.C79404b;

@C86522b
/* renamed from: wx.q */
public class C15598q extends C86301e implements C12001j {
    /* renamed from: Ee */
    public boolean mo11875Ee(Context context) {
        C23519f fVar = new C23519f(context);
        Context context2 = fVar.f67454a;
        C76879j.m92708B(context2, context2.getResources().getString(C0966R.string.f361325m61), "", fVar.f67454a.getString(C0966R.string.f7930wk), fVar.f67454a.getString(C0966R.string.f7926wf), new C23512d(fVar), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
        return true;
    }

    public boolean isPatEnable() {
        return ((C78150h) C86312j.m106911c(C78150h.class)).isPatEnable();
    }

    /* renamed from: lP */
    public void mo11877lP(Context context) {
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93149TE((Activity) context);
    }

    public String pb0(Context context) {
        long longValue = ((C10756c) C86709a0.m107533q(C10756c.class)).mo10995Wl().longValue();
        Log.m105925i("MicroMsg.SettingsHelperService", "updateWeCoinEntry balance catch: %s", Long.valueOf(longValue));
        if (longValue <= 0) {
            return "";
        }
        return longValue + " " + context.getString(C0966R.string.j2b);
    }

    /* renamed from: zd */
    public void mo11879zd(Context context) {
        if (!((C10756c) C86709a0.m107533q(C10756c.class)).mo10998j3()) {
            C20974j.m23149c(context, 8, true, new C16306g(context));
            return;
        }
        C115669n.INSTANCE.mo160131h(21650, 0);
        Intent intent = new Intent();
        intent.putExtra("launch_from_webview", false);
        C88144b.m109792j(context, "wallet", ".wecoin.ui.WeCoinRechargeView", intent, true);
    }

    public boolean zp0(Activity activity, int i, int i2, Intent intent) {
        C86001b0 q;
        Activity activity2 = activity;
        int i3 = i;
        Intent intent2 = intent;
        Class cls = C76706g.class;
        Log.m105925i("MicroMsg.SettingChangeAvatarHelp", "onAcvityResult requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 != -1) {
            if (i3 == 3 || i3 == 2 || i3 == 4) {
                new MMHandler(Looper.getMainLooper()).post(new C79403a());
            }
        } else if (i3 != 2) {
            if (i3 == 3) {
                String g6 = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(MMApplicationContext.getContext(), intent2, C7970a.m8127a());
                if (g6 != null) {
                    Intent intent3 = new Intent();
                    intent3.putExtra("CropImageMode", 1);
                    intent3.putExtra("CropImage_OutputPath", g6);
                    intent3.putExtra("CropImage_ImgPath", g6);
                    intent3.putExtra("CropImage_from_scene", 3);
                    ((C67654r1) C14049d.m13403b()).mo93178k(activity2, intent3, 4);
                }
            } else if (i3 == 4) {
                new MMHandler(Looper.getMainLooper()).post(new C79404b());
                if (intent2 != null) {
                    String stringExtra = intent2.getStringExtra("CropImage_OutputPath");
                    Bitmap k = ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93562k(C75592q0.m90789s());
                    if (stringExtra == null) {
                        Log.m105920e("MicroMsg.SettingChangeAvatarHelp", "crop picture failed");
                    } else {
                        Object[] objArr = new Object[2];
                        objArr[0] = stringExtra;
                        Uri n = C116299g2.m163858n(stringExtra);
                        String path = n.getPath();
                        if (path != null) {
                            String k2 = C116299g2.m163855k(path, false, false);
                            if (!n.getPath().equals(k2)) {
                                n = n.buildUpon().path(k2).build();
                            }
                        }
                        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                        long j = 0;
                        if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
                            j = q.f250473c;
                        }
                        objArr[1] = Long.valueOf(j);
                        Log.m105925i("MicroMsg.SettingChangeAvatarHelp", "onActivityResult(CONTEXT_MENU_CROP_PICTURE)  file:%s, size:%d", objArr);
                        ((C1295s) ((C117475p) C86312j.m106911c(C117475p.class)).mo182091fC(activity2, stringExtra, false)).mo1220b(1, new C16305c(k), true);
                    }
                }
            }
        } else if (intent2 != null) {
            Intent intent4 = new Intent();
            intent4.putExtra("CropImageMode", 1);
            intent4.putExtra("CropImage_Filter", true);
            C10579k RE = ((C76706g) C86312j.m106911c(cls)).mo106826RE();
            intent4.putExtra("CropImage_OutputPath", ((AvatarStorage) RE).mo93558g(C75592q0.m90789s() + ".crop", true, false));
            intent4.putExtra("CropImage_ImgPath", (String) null);
            intent4.putExtra("CropImage_from_scene", 3);
            ((C67654r1) C14049d.m13403b()).mo93179l(activity, intent, intent4, C7970a.m8127a(), 4, (C7013o.C7017c) null);
        }
        return true;
    }
}
