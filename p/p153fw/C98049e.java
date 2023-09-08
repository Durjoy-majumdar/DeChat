package p153fw;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.platformtools.ExportFileUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import ei3.C86522b;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import nd3.C88929c;
import p159gw.C98250h;
import p159gw.C98252k;
import p329d3.C86165a;
import sf0.C101602n;
import sf0.C101603o;
import sf0.C101604p;
import sf0.C101605u;
import sf0.C101606v;
import sf0.C101607w;
import sf0.C101608x;
import sf0.C118281t;
import sf0.C48373d0;

@C86522b
/* renamed from: fw.e */
public class C98049e extends C86301e implements C98250h, C98252k {
    public void Aq0(String str, String str2) {
        C48373d0.f129498a.mo73085b(str, str2);
    }

    /* renamed from: Iy */
    public void mo137341Iy(Context context, Runnable runnable, Runnable runnable2) {
        Executor executor = ExportFileUtil.f267555a;
        Log.m105925i("MicroMsg.ExportFileUtil", "[+] Called requestStoragePermission, ctx: %s", context);
        if (!(context instanceof Activity)) {
            Log.m105920e("MicroMsg.ExportFileUtil", "[-] Context [%s] is not an ui context, regard as user denied since we can't ask him.");
            ExportFileUtil.m117203a(runnable2);
        } else if (ExportFileUtil.m117207e()) {
            Log.m105924i("MicroMsg.ExportFileUtil", "[+] hasPermission = true");
            ExportFileUtil.m117203a(runnable);
        } else {
            C88929c.m111022f(context, 241, new C101604p(runnable, runnable2), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, "", "");
        }
    }

    /* renamed from: Lm */
    public void mo137342Lm(Context context, String str, C98250h.C98251a aVar) {
        Executor executor = ExportFileUtil.f267555a;
        String exportVideoPath = AndroidMediaUtil.getExportVideoPath("mp4");
        C86013q1.m106461v(C86013q1.m106458s(exportVideoPath));
        Log.m105925i("MicroMsg.ExportFileUtil", "[+] Called exportVideoWithPermissionRequest, src: %s, dest: %s", str, exportVideoPath);
        ExportFileUtil.m117208f(context, new C118281t(new C101607w(context, str), new C101608x(aVar, str, exportVideoPath)));
    }

    /* renamed from: Ne */
    public String mo137343Ne(Context context, String str, String str2) {
        return ExportFileUtil.m117204b(context, str, str2);
    }

    public String O00(Context context, String str, String str2) {
        return ExportFileUtil.m117205c(context, str, str2);
    }

    public void Rj0(Context context, Callable<String> callable, C86165a<String> aVar) {
        ExportFileUtil.m117208f(context, new C118281t(callable, aVar));
    }

    /* renamed from: Zv */
    public void mo137346Zv(Context context, String str, C98250h.C98251a aVar) {
        Executor executor = ExportFileUtil.f267555a;
        String o = C86013q1.m106454o(str);
        if (Util.isNullOrNil(o) || o.equalsIgnoreCase("pic")) {
            o = "jpg";
        }
        String exportImagePath = AndroidMediaUtil.getExportImagePath(o);
        C86013q1.m106461v(C86013q1.m106458s(exportImagePath));
        Log.m105925i("MicroMsg.ExportFileUtil", "[+] Called exportImageWithPermissionRequest, src: %s, dest: %s", str, exportImagePath);
        ExportFileUtil.m117208f(context, new C118281t(new C101605u(context, str), new C101606v(aVar, str, exportImagePath)));
    }

    public String o50(Context context, String str) {
        return ExportFileUtil.m117205c(MMApplicationContext.getContext(), str, (String) null);
    }

    public String pc0(String str) {
        return C48373d0.f129498a.mo73084a(str);
    }

    public void pk0(Context context, String str, C98250h.C98251a aVar) {
        String d = ExportFileUtil.m117206d(str);
        C86013q1.m106461v(C86013q1.m106458s(d));
        Log.m105925i("MicroMsg.ExportFileUtil", "[+] Called exportToPublicDownloadDirWithPermissionRequest, src: %s, dest: %s", str, d);
        ExportFileUtil.m117208f(context, new C118281t(new C101602n(context, str), new C101603o(aVar, str, d)));
    }

    /* renamed from: sE */
    public String mo137350sE(Context context, String str) {
        return ExportFileUtil.m117204b(context, str, (String) null);
    }

    /* renamed from: wu */
    public void mo137351wu(Context context, C86165a<Boolean> aVar) {
        ExportFileUtil.m117208f(context, aVar);
    }
}
