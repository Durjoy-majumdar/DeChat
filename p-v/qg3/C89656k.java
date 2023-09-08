package qg3;

import android.os.ParcelFileDescriptor;
import com.tencent.p014mm.app.C80608o0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.pinus.XWebChildProcessHelper;
import java.io.File;

/* renamed from: qg3.k */
public class C89656k implements XWebChildProcessHelper.ChildProcessCrashDumpFileCallback {

    /* renamed from: a */
    public final /* synthetic */ C89657l f257884a;

    public C89656k(C89657l lVar) {
        this.f257884a = lVar;
    }

    public void setupChildProcessCrashDumpFiles(String str, String str2) {
        Log.m105924i("MicroMsg.XWeb.IsolatedStartupRoutine", "setupChildProcessCrashDumpFiles, crashDumpFileSuffix:" + str2);
        try {
            C80608o0.m98240c(ParcelFileDescriptor.open(new File(C80608o0.m98238a(MMApplicationContext.getContext(), str, str2)), 939524096), ParcelFileDescriptor.open(new File(C80608o0.m98239b(MMApplicationContext.getContext(), str, str2)), 939524096), this.f257884a.f257887e);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.XWeb.IsolatedStartupRoutine", "setupChildProcessCrashDumpFiles, error:" + e);
        }
    }

    public void setupIsolatedProcessCrashDumpFiles(ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
        C80608o0.m98240c(parcelFileDescriptor, parcelFileDescriptor2, this.f257884a.f257887e);
    }
}
