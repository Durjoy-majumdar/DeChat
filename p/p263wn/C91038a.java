package p263wn;

import a12.C79458l;
import a70.C79471a;
import android.content.Context;
import android.content.Intent;
import b12.C79644b;
import com.tencent.p014mm.app.C80611s0;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.p064hp.mmdiff.MMDiffInstallApkService;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import java.io.File;
import java.util.HashMap;
import mk2.C88739b;
import mk2.C88740c;
import mo0.C88787b;
import p271xn.C38770l;
import p271xn.C91294h;
import p271xn.C91295i;
import v02.C90734a;
import x02.C91131t;
import zt3.C119157j;

@C86522b
/* renamed from: wn.a */
public class C91038a extends C86301e implements C91294h, C38770l, C91295i {
    public void Ek0(String str, int i, int i2) {
        C90734a.m113788e(str, i, i2);
    }

    public C88739b Lh0(String str, String str2, boolean z) {
        return new C88740c(str, str2, z);
    }

    /* renamed from: Vu */
    public void mo125092Vu() {
        File file = C79458l.f232996a;
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            try {
                if (!C79458l.f232997b) {
                    C79458l.m96414a();
                    C79458l.f232997b = true;
                }
            } catch (Throwable th) {
                C80611s0.m98246d("MicroMsg.TinkerRollbackStatistic", th, "[-] Error happened.", new Object[0]);
                return;
            }
            int intValue = Integer.decode(C79471a.f233015c).intValue();
            int i = BuildInfo.CLIENT_VERSION_INT;
            int i2 = C79458l.f232998c;
            if (intValue != i2) {
                C80611s0.m98247e("MicroMsg.TinkerRollbackStatistic", "[+] Basepack was reinstalled, clientversion: [0x%x]=>[0x%x]", Integer.valueOf(i2), Integer.valueOf(intValue));
                C79458l.m96415b(intValue, i);
            } else if (i != intValue) {
                C80611s0.m98247e("MicroMsg.TinkerRollbackStatistic", "[+] Patch was loaded, clientversion: [0x%x]=>[0x%x]", Integer.valueOf(intValue), Integer.valueOf(i));
                C79458l.m96415b(intValue, i);
            } else {
                int i3 = C79458l.f232999d;
                if (i != i3) {
                    C80611s0.m98248f("MicroMsg.TinkerRollbackStatistic", "[+] Patch was rollbacked, clientversion: [0x%x]=>[0x%x]", Integer.valueOf(i3), Integer.valueOf(i));
                    C80611s0.m98243a(C88787b.CTRL_INDEX, 0, 1);
                    C79458l.m96415b(intValue, i);
                }
            }
        } else {
            throw new IllegalStateException("Only main process can call this method.");
        }
    }

    public boolean Wj0(Context context, HashMap<String, Object> hashMap) {
        Context context2 = context;
        HashMap<String, Object> hashMap2 = hashMap;
        int i = MMDiffInstallApkService.f19390q;
        try {
            long j = Util.getLong((String) hashMap2.get("task_size"), 0);
            Object obj = hashMap2.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            String str = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
            Intent intent = new Intent();
            String str2 = (String) hashMap2.get("thumb_url");
            intent.setClass(context2, MMDiffInstallApkService.class);
            intent.putExtra("task_name", (String) hashMap2.get("task_name"));
            intent.putExtra("task_download_type", 1);
            intent.putExtra("app_developer", (String) hashMap2.get("developer"));
            intent.putExtra("app_version", (String) hashMap2.get("app_version"));
            intent.putExtra("app_privacy_url", (String) hashMap2.get("privacy_agreement_url"));
            intent.putExtra("app_permission_url", (String) hashMap2.get("permission_url"));
            intent.putExtra("task_url", (String) hashMap2.get("task_url"));
            intent.putExtra("alternative_url", (String) hashMap2.get("alternative_url"));
            intent.putExtra("task_size", j);
            intent.putExtra("file_md5", (String) hashMap2.get("file_md5"));
            intent.putExtra("extInfo", (String) hashMap2.get("extInfo"));
            intent.putExtra("fileType", 1);
            intent.putExtra("appid", (String) hashMap2.get("appid"));
            intent.putExtra("package_name", (String) hashMap2.get("package_name"));
            intent.putExtra("thumb_url", str2);
            String str3 = str;
            intent.putExtra(str3, (String) obj);
            String str4 = "page_url";
            intent.putExtra(str4, (String) hashMap2.get(str4));
            intent.putExtra("notify_type_extra", "mmdiff_download_full_apk_notify");
            intent.putExtra("page_scene", 0);
            context2.startService(intent);
            return true;
        } catch (Exception e) {
            Log.m105925i("Tinker.MMDiffInstallApkService.HdiffApk", "doAddDownloadTask, e = %s", e);
            return true;
        }
    }

    /* renamed from: YR */
    public boolean mo125093YR(String str) {
        return C79644b.m96724b(str);
    }

    /* renamed from: Z9 */
    public void mo125094Z9() {
        ((C119157j) C119157j.f356862d).mo183875f(new C91131t());
    }

    public boolean mc0() {
        return C90734a.m113785b();
    }
}
