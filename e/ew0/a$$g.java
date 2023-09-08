package ew0;

import com.tencent.matrix.batterycanary.stats.C114559a;
import com.tencent.matrix.batterycanary.stats.C114572i;
import com.tencent.p014mm.plugin.battery.stats.MMBatteryStatsActivity;
import com.tencent.xweb.file.XVFSFile;
import java.util.Collections;
import java.util.Set;
import nj3.C11182m0;
import nj3.C76874e0;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;

public final /* synthetic */ class a$$g implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C114572i f350110d;

    public /* synthetic */ a$$g(C114572i iVar) {
        this.f350110d = iVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        Set<String> set;
        C114572i iVar = this.f350110d;
        int i = MMBatteryStatsActivity.f345515j;
        e0Var.add((CharSequence) ":main");
        C114559a aVar = iVar.f343366d;
        if (aVar != null) {
            set = ((C114559a.C114560a) aVar).f343349b.decodeStringSet("bs-proc-set");
            if (set == null) {
                set = Collections.emptySet();
            }
        } else {
            set = Collections.emptySet();
        }
        for (String next : set) {
            if (!FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT.equals(next)) {
                e0Var.add((CharSequence) XVFSFile.PATH_SEPARATOR + next);
            }
        }
    }
}
