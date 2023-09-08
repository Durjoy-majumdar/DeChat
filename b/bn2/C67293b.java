package bn2;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.plugin.setting.p102ui.fixtools.FixSearchUI;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.pluginsdk.platformtools.C85623c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import p620nm.C89013r;
import u73.C22613h1;

/* renamed from: bn2.b */
public class C67293b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FixSearchUI f193131d;

    public C67293b(FixSearchUI fixSearchUI) {
        this.f193131d = fixSearchUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.FixSearchUI", "delete web search template, and kill process");
        C86013q1.m106445f(C43471q.m46983g(0).mo71059h());
        C22613h1.m26480f(30);
        this.f193131d.finish();
        C85623c.C85624a aVar = C85623c.f249568a;
        if (aVar != null) {
            AppCompatActivity context = this.f193131d.getContext();
            ((C89013r.C89016c) aVar).getClass();
            MMAppMgr.m85985e(context, true);
        }
    }
}
