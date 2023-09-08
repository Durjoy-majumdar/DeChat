package p461bw;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import ei3.C86522b;
import ke3.C88144b;
import p140cw.C7138g;
import p182kk.C61104a;

@C86522b
/* renamed from: bw.b */
public class C92325b extends C86301e implements C7138g {
    /* renamed from: Fc */
    public void mo8308Fc(Activity activity, int i, int i2, int i3, Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("max_select_count", i2);
        intent.putExtra("query_media_type", 2);
        intent.putExtra("query_source_type", i3);
        intent.addFlags(67108864);
        C88144b.m109795m(activity, "gallery", ".ui.GalleryEntryUI", intent, i);
    }

    /* renamed from: GS */
    public void mo8309GS(Fragment fragment, int i, int i2, int i3, int i4, String str, String str2, Intent intent) {
        C96892t1.m124465e(fragment, i, i2, i3, i4, str, str2, intent);
    }

    public boolean Gl0(Activity activity, String str, String str2, int i) {
        return C96892t1.m124468h(activity, str, str2, i);
    }

    /* renamed from: H7 */
    public void mo8311H7(Activity activity, int i, int i2, int i3, Intent intent) {
        C96892t1.m124464d(activity, i, i2, i3, intent, true);
    }

    /* renamed from: MW */
    public void mo8312MW(Activity activity, String str, int i, int i2, int i3, int i4, boolean z) {
        C96892t1.m124466f(activity, str, i, i2, i3, i4, z);
    }

    /* renamed from: NO */
    public boolean mo8313NO(Fragment fragment, int i) {
        C96892t1.m124465e(fragment, i, 1, 0, 1, "", "", (Intent) null);
        return true;
    }

    /* renamed from: Vt */
    public boolean mo8314Vt(Context context, int i, Intent intent, int i2, int i3) {
        C96892t1.m124467g(context, i, intent, i2, "", i3, "");
        return true;
    }

    /* renamed from: Wr */
    public void mo8315Wr(String str, Context context) {
        AndroidMediaUtil.refreshMediaScanner(str, context);
    }

    /* renamed from: Ya */
    public boolean mo8316Ya(Activity activity, int i) {
        C96892t1.m124464d(activity, i, 1, 5, (Intent) null, true);
        return true;
    }

    /* renamed from: di */
    public void mo8317di(Activity activity, int i, int i2, int i3, Intent intent, boolean z) {
        C96892t1.m124464d(activity, i, i2, i3, intent, z);
    }

    public boolean fx0(Activity activity, int i, Intent intent) {
        C96892t1.m124464d(activity, i, 1, 11, intent, true);
        return true;
    }

    /* renamed from: g6 */
    public String mo8319g6(Context context, Intent intent, String str) {
        return C96892t1.m124462b(context, intent, str);
    }

    /* renamed from: gi */
    public void mo8320gi(Fragment fragment, int i, int i2, String str, String str2, Intent intent) {
        C96892t1.m124465e(fragment, i, 9, i2, 1, str, str2, intent);
    }

    public void he0(String str, Context context) {
        C96892t1.m124461a(str, context);
    }

    public boolean hh0(MMFragment mMFragment, String str, String str2, int i) {
        boolean z;
        if (mMFragment == null) {
            Log.m105920e("MicroMsg.TakePhotoUtil", "takePhotoFromSys fragment is null!");
        } else if (!C61104a.m71651g(mMFragment.getContext()) && !C61104a.m71665u(mMFragment.getContext()) && !C61104a.m71649e(mMFragment.getContext())) {
            C96892t1.f283886a = C86013q1.m106448i(str + str2, true);
            Log.m105924i("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), filePath = " + C96892t1.f283886a);
            Activity context = mMFragment.getContext();
            String str3 = C96892t1.f283886a;
            SharedPreferences.Editor edit = context.getSharedPreferences("system_config_prefs", 0).edit();
            edit.putString("camera_file_path", str3);
            edit.commit();
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            C86009m1 m1Var = new C86009m1(str);
            if (!m1Var.mo119967g()) {
                try {
                    m1Var.mo119987x();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.TakePhotoUtil", e, "", new Object[0]);
                }
            }
            if (!m1Var.mo119967g()) {
                Log.m105920e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), dir not exist. " + str);
            } else {
                Uri uriForFile = FileProviderHelper.getUriForFile(mMFragment.getContext(), new C86009m1(C96892t1.f283886a));
                intent.addFlags(2);
                intent.putExtra("output", uriForFile);
                try {
                    mMFragment.startActivityForResult(intent, i);
                    z = true;
                } catch (ActivityNotFoundException e2) {
                    Log.m105920e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), " + e2.getMessage());
                }
                Log.m105925i("MicroMsg.TakePhotoUtil", "takePhoto(), dir = [%s], filename = [%s], cmd = [%s], result = [%s]", str, str2, Integer.valueOf(i), Boolean.valueOf(z));
                return z;
            }
        }
        z = false;
        Log.m105925i("MicroMsg.TakePhotoUtil", "takePhoto(), dir = [%s], filename = [%s], cmd = [%s], result = [%s]", str, str2, Integer.valueOf(i), Boolean.valueOf(z));
        return z;
    }

    /* renamed from: lm */
    public String mo8323lm() {
        return AndroidMediaUtil.getSysCameraDirPath();
    }

    /* renamed from: nq */
    public void mo8324nq(Activity activity, int i, int i2, int i3, int i4, boolean z, Intent intent) {
        C96892t1.m124463c(activity, i, i2, i3, i4, z, intent);
    }

    /* renamed from: q7 */
    public void mo8325q7(Fragment fragment, int i, int i2, int i3, String str, String str2) {
        C96892t1.m124465e(fragment, i, 9, i2, i3, str, str2, (Intent) null);
    }

    /* renamed from: sK */
    public void mo8326sK(Fragment fragment, int i, int i2, int i3, String str, String str2, Intent intent) {
        C96892t1.m124465e(fragment, i, 9, i2, i3, str, str2, intent);
    }

    /* renamed from: wx */
    public String mo8327wx() {
        return AndroidMediaUtil.getToastSysCameraPath();
    }

    public boolean xd0(Activity activity, int i) {
        C96892t1.m124464d(activity, i, 1, 24, (Intent) null, true);
        return true;
    }

    /* renamed from: zT */
    public boolean mo8329zT(Activity activity, int i, Intent intent) {
        C96892t1.m124464d(activity, i, 1, 0, intent, true);
        return true;
    }
}
