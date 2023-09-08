package com.tencent.p014mm.p136ui.tools;

import com.tencent.p014mm.p136ui.tools.ShareImgUI;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.ui.tools.l1 */
public class C85959l1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ShareImgUI.C85946h f250359d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f250360e;

    public C85959l1(ShareImgUI shareImgUI, ShareImgUI.C85946h hVar, ArrayList arrayList) {
        this.f250359d = hVar;
        this.f250360e = arrayList;
    }

    public void run() {
        ShareImgUI.C85946h hVar = this.f250359d;
        ArrayList<String> arrayList = this.f250360e;
        ShareImgUI.C85940b bVar = (ShareImgUI.C85940b) hVar;
        ShareImgUI.this.f250325n = arrayList;
        if (arrayList == null || arrayList.size() == 0) {
            Log.m105920e("MicroMsg.ShareImgUI", "launch : fail, filePathList is null");
            ShareImgUI.this.mo119843O7(1);
            ShareImgUI.this.finish();
            return;
        }
        Iterator<String> it = ShareImgUI.this.f250325n.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (ImgUtil.isGif(next)) {
                Log.m105925i("MicroMsg.ShareImgUI", "%s is not image", next);
                ShareImgUI.this.mo119843O7(1);
                ShareImgUI.this.finish();
                return;
            }
        }
        String resolveType = ShareImgUI.this.getIntent().resolveType(ShareImgUI.this);
        if (resolveType == null || !resolveType.contains("image")) {
            Log.m105924i("MicroMsg.ShareImgUI", "mime type is not image, try to set it");
            ShareImgUI.this.getIntent().setDataAndType(ShareImgUI.this.getIntent().getData(), "image/*");
        }
        ShareImgUI.m106254L7(ShareImgUI.this, false);
    }
}
