package hw1;

import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p159gw.C98250h;

public final /* synthetic */ class g$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f288999d;

    /* renamed from: e */
    public final /* synthetic */ boolean f289000e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f289001f;

    public /* synthetic */ g$$b(List list, boolean z, ArrayList arrayList) {
        this.f288999d = list;
        this.f289000e = z;
        this.f289001f = arrayList;
    }

    public final void run() {
        List list = this.f288999d;
        boolean z = this.f289000e;
        ArrayList arrayList = this.f289001f;
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            C86013q1.m106447h(str);
            Log.m105924i("MicroMsg.GalleryCore", "[deleteEditMedia] VFSFileOp.deleteFile = " + str);
        }
        if (z) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                String str2 = (String) arrayList.get(i2);
                if (!(str2 == null || ((HashMap) C93958f.m118749i().f271164j).get(str2) == null)) {
                    int intValue = ((Integer) ((HashMap) C93958f.m118749i().f271164j).get(str2)).intValue();
                    C93958f i3 = C93958f.m118749i();
                    boolean z2 = intValue == 1;
                    i3.getClass();
                    Class cls = C98250h.class;
                    if (z2) {
                        String exportImagePath = AndroidMediaUtil.getExportImagePath("jpg");
                        ((C98250h) C86312j.m106911c(cls)).mo137343Ne(MMApplicationContext.getContext(), str2, exportImagePath);
                        Log.m105925i("MicroMsg.GalleryCore", "exportPhotoToSystemAlbum = %s", exportImagePath);
                    } else {
                        String exportVideoPath = AndroidMediaUtil.getExportVideoPath("mp4");
                        ((C98250h) C86312j.m106911c(cls)).O00(MMApplicationContext.getContext(), str2, exportVideoPath);
                        AndroidMediaUtil.refreshMediaScanner(exportVideoPath, MMApplicationContext.getContext());
                        Log.m105925i("MicroMsg.GalleryCore", "exportVideoToSystemAlbum = %s", exportVideoPath);
                    }
                }
            }
            ((HashMap) C93958f.m118749i().f271164j).clear();
        }
    }
}
