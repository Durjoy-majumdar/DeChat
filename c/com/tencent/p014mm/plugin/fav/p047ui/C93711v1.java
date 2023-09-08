package com.tencent.p014mm.plugin.fav.p047ui;

import android.app.Dialog;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import java.util.LinkedList;
import java.util.List;
import p749xh.C66261f3;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.v1 */
public class C93711v1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f270511d;

    /* renamed from: e */
    public final /* synthetic */ String[] f270512e;

    /* renamed from: f */
    public final /* synthetic */ Dialog f270513f;

    /* renamed from: com.tencent.mm.plugin.fav.ui.v1$a */
    public class C93712a implements Runnable {
        public C93712a() {
        }

        public void run() {
            C93711v1.this.f270513f.dismiss();
        }

        public String toString() {
            return super.toString() + "|batchAddFavTags";
        }
    }

    public C93711v1(FavoriteIndexUI favoriteIndexUI, List list, String[] strArr, Dialog dialog) {
        this.f270511d = list;
        this.f270512e = strArr;
        this.f270513f = dialog;
    }

    public void run() {
        List<C100755z> list = this.f270511d;
        String[] strArr = this.f270512e;
        int i = FavoriteIndexUI.f269910R;
        if (list != null && !list.isEmpty() && strArr != null && strArr.length > 0) {
            LinkedList<C100755z> linkedList = new LinkedList<>();
            for (C100755z zVar : list) {
                boolean z = false;
                for (String l2 : strArr) {
                    z |= zVar.mo140183l2(l2);
                }
                if (z) {
                    ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).update(zVar, C66261f3.COL_LOCALID);
                    C100734q.m131887z0(zVar);
                    linkedList.add(zVar);
                }
            }
            for (C100755z e0 : linkedList) {
                C100734q.m131845e0(e0, 3);
            }
        }
        MMHandlerThread.postToMainThread(new C93712a());
    }
}
