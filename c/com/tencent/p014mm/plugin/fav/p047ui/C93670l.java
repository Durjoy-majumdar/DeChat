package com.tencent.p014mm.plugin.fav.p047ui;

import android.app.Dialog;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.FavoriteNormalAdapter;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import pb1.C100734q;
import pb1.C100755z;

/* renamed from: com.tencent.mm.plugin.fav.ui.l */
public class C93670l implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C93674m f270450d;

    /* renamed from: com.tencent.mm.plugin.fav.ui.l$a */
    public class C93671a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f270451d;

        /* renamed from: e */
        public final /* synthetic */ Dialog f270452e;

        /* renamed from: com.tencent.mm.plugin.fav.ui.l$a$a */
        public class C93672a implements Runnable {
            public C93672a() {
            }

            public void run() {
                boolean z;
                C93671a aVar = C93671a.this;
                FavoriteNormalAdapter favoriteNormalAdapter = C93670l.this.f270450d.f270456a.f269658e;
                List list = aVar.f270451d;
                if (favoriteNormalAdapter.f269977j != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<C100755z> it = favoriteNormalAdapter.f269977j.iterator();
                    while (true) {
                        boolean z2 = false;
                        if (!it.hasNext()) {
                            break;
                        }
                        C100755z next = it.next();
                        if (next != null) {
                            Iterator it4 = list.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    C100755z zVar = (C100755z) it4.next();
                                    if (zVar != null && next.field_localId == zVar.field_localId) {
                                        z2 = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (!z2) {
                                arrayList.add(next);
                            }
                        }
                    }
                    favoriteNormalAdapter.f269977j = arrayList;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it5 = ((ArrayList) favoriteNormalAdapter.f269980p).iterator();
                    while (it5.hasNext()) {
                        Long l = (Long) it5.next();
                        Iterator it6 = list.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                z = false;
                                break;
                            }
                            C100755z zVar2 = (C100755z) it6.next();
                            if (zVar2 != null && l.equals(Long.valueOf(zVar2.field_localId))) {
                                z = true;
                                break;
                            }
                        }
                        if (!z) {
                            arrayList2.add(l);
                        }
                    }
                    favoriteNormalAdapter.f269980p = arrayList2;
                }
                C93670l.this.f270450d.f270456a.f269658e.notifyDataSetChanged();
                C93670l.this.f270450d.f270456a.f269665o.mo140206c();
                C93671a.this.f270452e.dismiss();
            }

            public String toString() {
                return super.toString() + "|batchDelFavItems";
            }
        }

        public C93671a(List list, Dialog dialog) {
            this.f270451d = list;
            this.f270452e = dialog;
        }

        public void run() {
            C100734q.m131864o(this.f270451d, 29);
            MMHandlerThread.postToMainThread(new C93672a());
        }
    }

    public C93670l(C93674m mVar) {
        this.f270450d = mVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        long k = this.f270450d.f270456a.f269658e.mo128382k();
        List<C100755z> i2 = this.f270450d.f270456a.f269658e.mo128379i(true);
        this.f270450d.f270456a.f269665o.f295230e += k;
        HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
        C100734q.m131869q0(((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERFINO_FAV_USED_CAPACITY_LONG, 0L)).longValue() - k);
        if (!i2.isEmpty()) {
            C115669n nVar = C115669n.INSTANCE;
            LinkedList linkedList = (LinkedList) i2;
            nVar.mo160131h(14110, Integer.valueOf(this.f270450d.f270456a.f269668r), Integer.valueOf(linkedList.size()), Integer.valueOf((int) ((((double) k) * 1.0d) / 1024.0d)));
            C86709a0.m107525e().postToWorker(new C93671a(i2, C76879j.m92723Q(this.f270450d.f270456a.getContext(), "", this.f270450d.f270456a.getString(C0966R.string.cn8), true, false, (DialogInterface.OnCancelListener) null)));
            nVar.mo160131h(11125, Integer.valueOf(linkedList.size()), 3);
        }
    }
}
