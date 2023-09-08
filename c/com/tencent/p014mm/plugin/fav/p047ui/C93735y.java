package com.tencent.p014mm.plugin.fav.p047ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import lc1.c$$e;
import nj3.C76879j;
import p640ox.C77049b;
import pb1.C100702d1;
import pb1.C100718j1;
import te3.C101825od0;
import wd3.C65953v0;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.y */
public class C93735y implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FavFilterUI f270574d;

    /* renamed from: com.tencent.mm.plugin.fav.ui.y$a */
    public class C93736a implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ c$$e f270575a;

        /* renamed from: com.tencent.mm.plugin.fav.ui.y$a$a */
        public class C93737a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Dialog f270577d;

            /* renamed from: com.tencent.mm.plugin.fav.ui.y$a$a$a */
            public class C93738a implements Runnable {
                public C93738a() {
                }

                public void run() {
                    C93735y.this.f270574d.finish();
                }
            }

            public C93737a(Dialog dialog) {
                this.f270577d = dialog;
            }

            public void run() {
                Dialog dialog = this.f270577d;
                if (dialog != null) {
                    dialog.dismiss();
                }
                FavFilterUI favFilterUI = C93735y.this.f270574d;
                C75026b.m89951a(favFilterUI, favFilterUI.getString(C0966R.string.cmm));
                MMHandlerThread.postToMainThreadDelayed(new C93738a(), 1800);
            }
        }

        public C93736a(c$$e c__e) {
            this.f270575a = c__e;
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            C93735y.this.f270574d.hideVKB();
            if (z) {
                C93594f1.m118181i(C93735y.this.f270574d.getContext(), C93735y.this.f270574d.f269688f, str, this.f270575a.f291387a, new C93737a(C76879j.m92723Q(C93735y.this.f270574d.getContext(), "", C93735y.this.f270574d.getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null)));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.y$b */
    public class C93739b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ c$$e f270580d;

        /* renamed from: e */
        public final /* synthetic */ int f270581e;

        public C93739b(c$$e c__e, int i) {
            this.f270580d = c__e;
            this.f270581e = i;
        }

        public void run() {
            int i;
            Log.m105919d("MicroMsg.FavFilterUI", "type %s", Integer.valueOf(this.f270580d.f291387a.field_type));
            long j = this.f270580d.f291387a.field_localId;
            if (C93735y.this.f270574d.f269702w.size() == 0) {
                C93735y.this.f270574d.f269702w = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142270kD();
            }
            if (C93735y.this.f270574d.f269702w.size() != 0) {
                Iterator<Long> it = C93735y.this.f270574d.f269702w.iterator();
                i = 1;
                while (it.hasNext() && it.next().longValue() != j) {
                    i++;
                }
            } else {
                i = 1;
            }
            C115669n nVar = C115669n.INSTANCE;
            int i2 = 3;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(this.f270580d.f291387a.field_type);
            FavFilterUI favFilterUI = C93735y.this.f270574d;
            int size = ((LinkedList) favFilterUI.f269698s).size();
            int size2 = ((LinkedList) favFilterUI.f269699t).size();
            int size3 = ((LinkedList) favFilterUI.f269700u).size();
            if (size == 0 && size2 == 0 && size3 > 0) {
                i2 = 2;
            } else if (!(size == 0 && size2 > 0 && size3 == 0)) {
                i2 = (size > 0 && size2 == 0 && size3 == 0) ? 1 : 4;
            }
            objArr[1] = Integer.valueOf(i2);
            if (C93735y.this.f270574d.f269702w.size() == 0) {
                i = this.f270581e;
            }
            objArr[2] = Integer.valueOf(i);
            nVar.mo160131h(12746, objArr);
        }
    }

    public C93735y(FavFilterUI favFilterUI) {
        this.f270574d = favFilterUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavFilterUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        c$$e c__e = (c$$e) view.getTag();
        if (!(c__e == null || c__e.f291387a == null)) {
            FavFilterUI favFilterUI = this.f270574d;
            int i3 = FavFilterUI.f269680F;
            favFilterUI.mo128259M7(2, i2, false);
            this.f270574d.f269703x.mo139618e((C101825od0) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this.f270574d.getContext(), 17, C101825od0.class));
        }
        FavFilterUI favFilterUI2 = this.f270574d;
        int i4 = favFilterUI2.f269686d;
        if (1 == i4) {
            if (c__e == null) {
                Log.m105928w("MicroMsg.FavFilterUI", "on item click, holder is null");
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavFilterUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            } else if (c__e.f291387a == null) {
                Log.m105928w("MicroMsg.FavFilterUI", "on item click, info is null");
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavFilterUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            } else {
                ((C100702d1) C86312j.m106911c(C100702d1.class)).mo123900yk(this.f270574d.getContext(), this.f270574d.f269688f, c__e.f291387a, C0966R.string.a2s, false, new C93736a(c__e));
            }
        } else if (2 != i4) {
            favFilterUI2.f269694o.onItemClick(adapterView, view, i, j);
            if (c__e.f291387a != null) {
                C86709a0.m107525e().postToWorker(new C93739b(c__e, i2));
            }
        } else if (c__e == null) {
            Log.m105928w("MicroMsg.FavFilterUI", "on item click, holder is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavFilterUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        } else if (c__e.f291387a == null) {
            Log.m105928w("MicroMsg.FavFilterUI", "on item click, info is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavFilterUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        } else {
            Intent intent = new Intent();
            intent.putExtra("key_fav_result_local_id", c__e.f291387a.field_localId);
            this.f270574d.setResult(-1, intent);
            this.f270574d.finish();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavFilterUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
