package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import hd0.C98410o0;
import hd0.C98426q0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import p159gw.C98250h;
import p182kk.C61104a;
import p682rz.C101488s;
import p910lj.C76701a;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.t1 */
public final class C96892t1 {

    /* renamed from: a */
    public static String f283886a;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.t1$a */
    public class C96893a implements C98250h.C98251a {

        /* renamed from: a */
        public final /* synthetic */ Context f283887a;

        public C96893a(Context context) {
            this.f283887a = context;
        }

        /* renamed from: a */
        public void mo2055a(String str, String str2) {
            Context context = this.f283887a;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.fn4, new Object[]{str2}), 1).show();
        }

        /* renamed from: b */
        public void mo2056b(String str, String str2) {
            Context context = this.f283887a;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.iak), 1).show();
        }
    }

    /* renamed from: a */
    public static void m124461a(String str, Context context) {
        ((C98250h) C86312j.m106911c(C98250h.class)).mo137346Zv(context, str, new C96893a(context));
    }

    /* renamed from: b */
    public static String m124462b(Context context, Intent intent, String str) {
        if (f283886a == null) {
            f283886a = context.getSharedPreferences("system_config_prefs", 0).getString("camera_file_path", (String) null);
        }
        if (!C86013q1.m106450k(f283886a)) {
            f283886a = C7013o.m7260b(context, intent, str);
        }
        AndroidMediaUtil.refreshMediaScanner(f283886a, context);
        return f283886a;
    }

    /* renamed from: c */
    public static void m124463c(Activity activity, int i, int i2, int i3, int i4, boolean z, Intent intent) {
        Bundle extras;
        Intent intent2 = new Intent();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            intent2.putExtras(extras);
        }
        intent2.putExtra("max_select_count", i2);
        intent2.putExtra("query_source_type", i3);
        intent2.putExtra("query_media_type", i4);
        intent2.putExtra("show_header_view", z);
        intent2.addFlags(67108864);
        C88144b.m109795m(activity, "gallery", ".ui.GalleryEntryUI", intent2, i);
    }

    /* renamed from: d */
    public static void m124464d(Activity activity, int i, int i2, int i3, Intent intent, boolean z) {
        Bundle extras;
        Intent intent2 = new Intent();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            intent2.putExtras(extras);
        }
        intent2.putExtra("max_select_count", i2);
        intent2.putExtra("query_source_type", i3);
        intent2.putExtra("need_to_clear_top", z);
        if (z) {
            intent2.addFlags(67108864);
        }
        C88144b.m109795m(activity, "gallery", ".ui.GalleryEntryUI", intent2, i);
    }

    /* renamed from: e */
    public static void m124465e(Fragment fragment, int i, int i2, int i3, int i4, String str, String str2, Intent intent) {
        int i5 = i;
        Log.m105925i("MicroMsg.TakePhotoUtil", "summerhardcoder startPerformance[%s]", Integer.valueOf(C40318k.m43492a().startPerformance(true, 0, 1, 1, 0, 2000, 706, 4, "MicroMsg.TakePhotoUtil")));
        Intent intent2 = intent == null ? new Intent() : intent;
        if (!Util.isNullOrNil(str2)) {
            intent2.putExtra("GalleryUI_FromUser", str);
            intent2.putExtra("GalleryUI_ToUser", str2);
        }
        int i6 = i2;
        intent2.putExtra("max_select_count", i2);
        int i7 = i3;
        intent2.putExtra("query_source_type", i3);
        intent2.putExtra("query_media_type", i4);
        boolean z = C90188n0.f258933a;
        intent2.putExtra("show_header_view", false);
        intent2.addFlags(67108864);
        intent2.putExtra("animation_push_up_in", true);
        Log.m105925i("MicroMsg.TakePhotoUtil", "selectPicFromMMGallery: requestCode:%s", Integer.valueOf(i));
        if (i5 == -1) {
            C88144b.m109791i(fragment.getContext(), "gallery", ".ui.AlbumPreviewUI", intent2, (Bundle) null);
            return;
        }
        Fragment fragment2 = fragment;
        C88144b.m109797o(fragment, "gallery", ".ui.AlbumPreviewUI", intent2, i);
    }

    /* renamed from: f */
    public static void m124466f(Activity activity, String str, int i, int i2, int i3, int i4, boolean z) {
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g()) {
            m1Var.mo119966f();
        }
        Intent intent = new Intent();
        intent.putExtra("output", FileProviderHelper.getUriForFile(activity, m1Var));
        intent.putExtra("android.intent.extra.videoQuality", i4);
        intent.putExtra("android.intent.extras.CAMERA_FACING", z ? 1 : 0);
        if (i2 > 0) {
            intent.putExtra("android.intent.extra.durationLimit", i2);
        }
        if (i3 > 0) {
            intent.putExtra("android.intent.extra.sizeLimit", i3);
        }
        intent.setAction("android.media.action.VIDEO_CAPTURE");
        intent.addCategory("android.intent.category.DEFAULT");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/TakePhotoUtil", "selectVideoFromSys", "(Landroid/app/Activity;Ljava/lang/String;IIIIZ)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: g */
    public static boolean m124467g(Context context, int i, Intent intent, int i2, String str, int i3, String str2) {
        Context context2 = context;
        Intent intent2 = intent;
        int i4 = i2;
        Class cls = C101488s.class;
        Log.m105925i("MicroMsg.TakePhotoUtil", "summerhardcoder startPerformance[%s]", Integer.valueOf(C40318k.m43492a().startPerformance(true, 0, 1, 1, 0, 2000, 707, 4, "MicroMsg.TakePhotoUtil")));
        SightParams sightParams = intent2 != null ? (SightParams) intent2.getParcelableExtra("KEY_SIGHT_PARAMS") : null;
        if (sightParams == null) {
            sightParams = new SightParams(i4, i3);
        }
        sightParams.f248460q = str2;
        intent2.putExtra("KEY_SIGHT_PARAMS", sightParams);
        if (i4 == 1) {
            String a = C98426q0.m127793a(str);
            String q = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(a);
            String r = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137729r(a);
            sightParams.mo118479a(a, q, r, AndroidMediaUtil.getSysCameraDirPath() + String.format("%s%d.%s", new Object[]{"capture", Long.valueOf(System.currentTimeMillis()), "jpg"}));
        }
        intent2.putExtra("KEY_SIGHT_PARAMS", sightParams);
        C88144b.m109795m(context, "mmsight", ".ui.SightCaptureUI", intent2, i);
        if (context2 instanceof Activity) {
            ((Activity) context2).overridePendingTransition(C0966R.C0968anim.f2492eg, -1);
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m124468h(Activity activity, String str, String str2, int i) {
        boolean z;
        Activity activity2 = activity;
        String str3 = str;
        String str4 = str2;
        if (!C61104a.m71651g(activity) && !C61104a.m71665u(activity) && !C61104a.m71649e(activity)) {
            Log.m105925i("MicroMsg.TakePhotoUtil", "summerhardcoder startPerformance[%s]", Integer.valueOf(C40318k.m43492a().startPerformance(true, 0, 1, 1, 0, 2000, 707, 4, "MicroMsg.TakePhotoUtil")));
            f283886a = C86013q1.m106448i(str3 + str4, true);
            Log.m105924i("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), filePath = " + f283886a);
            String str5 = f283886a;
            SharedPreferences.Editor edit = activity2.getSharedPreferences("system_config_prefs", 0).edit();
            edit.putString("camera_file_path", str5);
            edit.commit();
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            C86009m1 m1Var = new C86009m1(str3);
            if (!m1Var.mo119967g()) {
                try {
                    m1Var.mo119987x();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.TakePhotoUtil", e, "", new Object[0]);
                }
            }
            if (!m1Var.mo119967g()) {
                Log.m105920e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), dir not exist. " + str3);
            } else {
                Uri uriForFile = FileProviderHelper.getUriForFile(activity2, new C86009m1(f283886a));
                intent.addFlags(2);
                intent.putExtra("output", uriForFile);
                try {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    aVar.mo10233c(intent);
                    C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/TakePhotoUtil", "takePhotoFromSys", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    Log.m105924i("MicroMsg.TakePhotoUtil", "takePhotoFromSys()");
                    z = true;
                } catch (Exception e2) {
                    Log.m105920e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), " + e2.getMessage());
                }
                Log.m105925i("MicroMsg.TakePhotoUtil", "takePhoto(), dir = [%s], filename = [%s], cmd = [%s], result = [%s]", str3, str4, Integer.valueOf(i), Boolean.valueOf(z));
                return z;
            }
        }
        z = false;
        Log.m105925i("MicroMsg.TakePhotoUtil", "takePhoto(), dir = [%s], filename = [%s], cmd = [%s], result = [%s]", str3, str4, Integer.valueOf(i), Boolean.valueOf(z));
        return z;
    }
}
