package bn2;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.plugin.setting.p102ui.fixtools.FixSearchUI;
import com.tencent.p014mm.pluginsdk.platformtools.C85623c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import kv1.C99252h;
import p620nm.C89013r;

/* renamed from: bn2.a */
public class C67292a implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FixSearchUI f193130d;

    public C67292a(FixSearchUI fixSearchUI) {
        this.f193130d = fixSearchUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.FixSearchUI", "delete fts db, and kill process");
        C99252h.m129300e(24);
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251807e);
        sb.append("FTS5IndexMicroMsg_encrypt.db");
        String sb4 = sb.toString();
        String[] strArr = {"", "-journal", "-wal", "-shm"};
        for (int i2 = 0; i2 < 4; i2++) {
            String str = sb4 + strArr[i2];
            Log.m105925i("MicroMsg.FixSearchUI", "deleteIndexDB %s %s", str, Boolean.valueOf(C86013q1.m106450k(str)));
            C86013q1.m106447h(str);
        }
        this.f193130d.finish();
        C85623c.C85624a aVar = C85623c.f249568a;
        if (aVar != null) {
            AppCompatActivity context = this.f193130d.getContext();
            ((C89013r.C89016c) aVar).getClass();
            MMAppMgr.m85985e(context, true);
        }
    }
}
