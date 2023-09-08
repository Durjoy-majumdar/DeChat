package hw1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.List;

public final /* synthetic */ class g$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f28055d;

    public /* synthetic */ g$$a(List list) {
        this.f28055d = list;
    }

    public final void run() {
        List list = this.f28055d;
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            C86013q1.m106447h(str);
            Log.m105924i("MicroMsg.GalleryCore", "[deleteAllEditMedia] VFSFileOp.deleteFile = " + str);
        }
    }
}
