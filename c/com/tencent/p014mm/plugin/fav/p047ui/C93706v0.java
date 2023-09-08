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
import lc1.c$$e;
import nj3.C76879j;
import p640ox.C77049b;
import pb1.C100702d1;
import pb1.C100718j1;
import te3.C101825od0;
import wd3.C65953v0;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.v0 */
public class C93706v0 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FavSearchUI f270502d;

    /* renamed from: com.tencent.mm.plugin.fav.ui.v0$a */
    public class C93707a implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ c$$e f270503a;

        /* renamed from: com.tencent.mm.plugin.fav.ui.v0$a$a */
        public class C93708a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Dialog f270505d;

            /* renamed from: com.tencent.mm.plugin.fav.ui.v0$a$a$a */
            public class C93709a implements Runnable {
                public C93709a() {
                }

                public void run() {
                    C93706v0.this.f270502d.finish();
                }
            }

            public C93708a(Dialog dialog) {
                this.f270505d = dialog;
            }

            public void run() {
                Dialog dialog = this.f270505d;
                if (dialog != null) {
                    dialog.dismiss();
                }
                FavSearchUI favSearchUI = C93706v0.this.f270502d;
                C75026b.m89951a(favSearchUI, favSearchUI.getString(C0966R.string.cmm));
                MMHandlerThread.postToMainThreadDelayed(new C93709a(), 1800);
            }
        }

        public C93707a(c$$e c__e) {
            this.f270503a = c__e;
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            C93706v0.this.f270502d.hideVKB();
            if (z) {
                C93594f1.m118181i(C93706v0.this.f270502d.getContext(), C93706v0.this.f270502d.f269804f, str, this.f270503a.f291387a, new C93708a(C76879j.m92723Q(C93706v0.this.f270502d.getContext(), "", C93706v0.this.f270502d.getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null)));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.v0$b */
    public class C93710b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ c$$e f270508d;

        /* renamed from: e */
        public final /* synthetic */ int f270509e;

        public C93710b(c$$e c__e, int i) {
            this.f270508d = c__e;
            this.f270509e = i;
        }

        public void run() {
            int i;
            Log.m105919d("MicroMsg.FavSearchUI", "type %s", Integer.valueOf(this.f270508d.f291387a.field_type));
            long j = this.f270508d.f291387a.field_localId;
            if (C93706v0.this.f270502d.f269793E.size() == 0) {
                C93706v0.this.f270502d.f269793E = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142270kD();
            }
            if (C93706v0.this.f270502d.f269793E.size() != 0) {
                Iterator<Long> it = C93706v0.this.f270502d.f269793E.iterator();
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
            objArr[0] = Integer.valueOf(this.f270508d.f291387a.field_type);
            FavSearchUI favSearchUI = C93706v0.this.f270502d;
            int size = favSearchUI.f269818w.size();
            int size2 = favSearchUI.f269819x.size();
            int size3 = favSearchUI.f269820y.size();
            if (size == 0 && size2 == 0 && size3 > 0) {
                i2 = 2;
            } else if (!(size == 0 && size2 > 0 && size3 == 0)) {
                i2 = (size > 0 && size2 == 0 && size3 == 0) ? 1 : 4;
            }
            objArr[1] = Integer.valueOf(i2);
            if (C93706v0.this.f270502d.f269793E.size() == 0) {
                i = this.f270509e;
            }
            objArr[2] = Integer.valueOf(i);
            nVar.mo160131h(12746, objArr);
        }
    }

    public C93706v0(FavSearchUI favSearchUI) {
        this.f270502d = favSearchUI;
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
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavSearchUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        c$$e c__e = (c$$e) view.getTag();
        if (!(c__e == null || c__e.f291387a == null)) {
            FavSearchUI favSearchUI = this.f270502d;
            int i3 = FavSearchUI.f269788N;
            favSearchUI.mo128299O7(2, i2);
            this.f270502d.f269794F.mo139618e((C101825od0) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this.f270502d.getContext(), 17, C101825od0.class));
        }
        FavSearchUI favSearchUI2 = this.f270502d;
        int i4 = favSearchUI2.f269802d;
        if (1 == i4) {
            if (c__e == null) {
                Log.m105928w("MicroMsg.FavSearchUI", "on item click, holder is null");
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            } else if (c__e.f291387a == null) {
                Log.m105928w("MicroMsg.FavSearchUI", "on item click, info is null");
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            } else {
                ((C100702d1) C86312j.m106911c(C100702d1.class)).mo123900yk(this.f270502d.getContext(), this.f270502d.f269804f, c__e.f291387a, C0966R.string.a2s, false, new C93707a(c__e));
            }
        } else if (2 != i4) {
            favSearchUI2.f269809n.onItemClick(adapterView, view, i, j);
            if (c__e.f291387a != null) {
                C86709a0.m107525e().postToWorker(new C93710b(c__e, i2));
            }
        } else if (c__e == null) {
            Log.m105928w("MicroMsg.FavSearchUI", "on item click, holder is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        } else if (c__e.f291387a == null) {
            Log.m105928w("MicroMsg.FavSearchUI", "on item click, info is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        } else {
            Intent intent = new Intent();
            intent.putExtra("key_fav_result_local_id", c__e.f291387a.field_localId);
            intent.putExtra("key_fav_result_fake_local_id", c__e.f291387a.f295174S0);
            this.f270502d.setResult(-1, intent);
            this.f270502d.finish();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
