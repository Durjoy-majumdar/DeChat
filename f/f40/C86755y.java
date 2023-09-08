package f40;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.File;
import kj2.C117407d;
import zt3.C119157j;

/* renamed from: f40.y */
public class C86755y implements C86756z {

    /* renamed from: b */
    public static final C86755y f251837b = new C86755y();

    /* renamed from: a */
    public C86752v f251838a;

    /* renamed from: a */
    public final File mo121157a() {
        return new File(MMApplicationContext.getContext().getExternalFilesDir((String) null), "external_used_mark");
    }

    /* renamed from: b */
    public final void mo121158b(File file) {
        File[] listFiles;
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            Log.m105921e("MicroMsg.FindOutDataDisappeared", "List %s directory:", file.getAbsolutePath());
            for (File file2 : listFiles) {
                Log.m105921e("MicroMsg.FindOutDataDisappeared", " -> %s | Size: %s | Modified: %s", file2.getAbsolutePath(), Long.valueOf(file2.length()), Long.valueOf(file2.lastModified()));
            }
        }
    }

    /* renamed from: c */
    public final void mo121159c(int i) {
        C117407d.INSTANCE.mo160131h(21019, Boolean.FALSE, Integer.valueOf(i), 200, "");
    }

    /* renamed from: d */
    public final void mo121160d(int i, int i2, int i3) {
        if ((i & i2) != 0) {
            mo121159c(i3);
        }
    }

    /* renamed from: e */
    public final void mo121161e(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            Log.m105929w("MicroMsg.FindOutDataDisappeared", "identity is %s?", str);
        } else {
            try {
                File file = new File(MMApplicationContext.getContext().getFilesDir(), "identity_records");
                file.mkdirs();
                File file2 = new File(file, str);
                if (!file2.exists()) {
                    file2.createNewFile();
                    Log.m105929w("MicroMsg.FindOutDataDisappeared", "identity is %s?", str);
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.FindOutDataDisappeared", th, "", new Object[0]);
            }
        }
        ((C119157j) C119157j.f356862d).mo183878i(new C86753w(this, str2), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
    }
}
