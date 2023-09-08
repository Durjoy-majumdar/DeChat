package com.tencent.p014mm.plugin.fav.p047ui.gallery;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.plugin.fav.p047ui.C93745z1;
import com.tencent.p014mm.plugin.fav.p047ui.FavSearchUI;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93638m;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93642n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import p1029rf.C89940c;
import p761yd.C91441c;
import p995kf.C88146a;
import pb1.C100695a0;
import pb1.C100734q;
import pb1.C100752x0;
import pb1.C100755z;
import qo3.C47883u;
import qo3.C77426q;
import qo3.C89779i0;
import te3.C101811md0;

/* renamed from: com.tencent.mm.plugin.fav.ui.gallery.k */
public class C93629k implements C93650p, C93642n.C93646d {

    /* renamed from: a */
    public C93649o f270355a;

    /* renamed from: b */
    public RecyclerView f270356b;

    /* renamed from: c */
    public RelativeLayout f270357c;

    /* renamed from: d */
    public LinearLayout f270358d;

    /* renamed from: e */
    public TextView f270359e;

    /* renamed from: f */
    public TextView f270360f;

    /* renamed from: g */
    public ImageButton f270361g;

    /* renamed from: h */
    public ImageButton f270362h;

    /* renamed from: i */
    public ProgressDialog f270363i;

    /* renamed from: j */
    public boolean f270364j = false;

    /* renamed from: k */
    public int f270365k = -1;

    /* renamed from: l */
    public int f270366l;

    /* renamed from: m */
    public boolean f270367m = true;

    /* renamed from: n */
    public Activity f270368n;

    /* renamed from: o */
    public View f270369o;

    /* renamed from: p */
    public C101811md0 f270370p;

    /* renamed from: q */
    public C93636f f270371q;

    /* renamed from: r */
    public long f270372r;

    /* renamed from: s */
    public FavoriteImageServer f270373s;

    /* renamed from: t */
    public long f270374t = 0;

    /* renamed from: u */
    public long f270375u = 0;

    /* renamed from: v */
    public View.OnClickListener f270376v = new C93630a();

    /* renamed from: w */
    public View.OnClickListener f270377w = new C93631b();

    /* renamed from: x */
    public List<C93637l> f270378x = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.k$a */
    public class C93630a implements View.OnClickListener {
        public C93630a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C93629k kVar = C93629k.this;
            C93649o oVar = kVar.f270355a;
            if (oVar != null) {
                oVar.mo128573l();
            }
            kVar.f270357c.setVisibility(8);
            kVar.f270358d.setVisibility(0);
            kVar.f270361g.setEnabled(false);
            kVar.f270362h.setEnabled(false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.k$b */
    public class C93631b implements View.OnClickListener {
        public C93631b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C93649o oVar = C93629k.this.f270355a;
            if (oVar != null) {
                oVar.mo128575n(((Integer) view.getTag()).intValue());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.k$c */
    public class C93632c implements C47883u {
        public C93632c(C93629k kVar) {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.k$d */
    public class C93633d implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C100755z f270381a;

        public C93633d(C100755z zVar) {
            this.f270381a = zVar;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            C93629k.this.f270370p.f298815f = -1;
            C93629k kVar = C93629k.this;
            ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(kVar.f270368n, this.f270381a, kVar.f270370p);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.k$e */
    public class C93634e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f270383d;

        /* renamed from: e */
        public final /* synthetic */ boolean f270384e;

        /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.k$e$a */
        public class C93635a implements C93745z1.C93749c {
            public C93635a() {
            }

            /* renamed from: a */
            public void mo128364a() {
                Log.m105926v("MicroMsg.MediaHistoryGalleryUI", "do refresh job");
                C93629k.this.f270355a.mo128572k(true, -1);
            }
        }

        public C93634e(ArrayList arrayList, boolean z) {
            this.f270383d = arrayList;
            this.f270384e = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C93745z1.m118444a(C93629k.this.f270368n, this.f270383d, new C93635a(), 27);
            if (this.f270384e) {
                FavSearchUI.m118045R7(C93629k.this.f270368n);
            }
            C93636f fVar = C93629k.this.f270371q;
            if (fVar != null) {
                fVar.mo128261T2(0, this.f270383d.size());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.k$f */
    public interface C93636f {
        /* renamed from: D3 */
        void mo128254D3(int i, int i2);

        /* renamed from: G5 */
        void mo128255G5(int i);

        /* renamed from: T2 */
        void mo128261T2(int i, int i2);

        /* renamed from: a4 */
        void mo128262a4(int i);

        /* renamed from: j */
        void mo128263j(int i);

        /* renamed from: k2 */
        void mo128264k2(int i, int i2);

        /* renamed from: u2 */
        void mo128265u2(int i);
    }

    public C93629k(Activity activity, View view, FavoriteImageServer favoriteImageServer) {
        this.f270368n = activity;
        this.f270369o = view;
        this.f270373s = favoriteImageServer;
        this.f270364j = true;
        C93651q qVar = new C93651q(activity);
        qVar.f270418a = this;
        mo128514a(qVar);
        C93638m mVar = C93638m.C93640b.f270392a;
        mVar.f270391c.remove(qVar);
        mVar.f270391c.add(qVar);
        C101811md0 md02 = new C101811md0();
        this.f270370p = md02;
        md02.f298813d = 2;
        md02.f298814e = 2;
        md02.f298815f = 0;
        md02.f298816g = "";
        md02.f298817h = "";
        md02.f298818i = "";
        this.f270357c = (RelativeLayout) this.f270369o.findViewById(C0966R.C0970id.ewm);
        this.f270358d = (LinearLayout) this.f270369o.findViewById(C0966R.C0970id.ewh);
        this.f270359e = (TextView) this.f270369o.findViewById(C0966R.C0970id.f5770o6);
        this.f270360f = (TextView) this.f270369o.findViewById(C0966R.C0970id.j6m);
        this.f270356b = (RecyclerView) this.f270369o.findViewById(C0966R.C0970id.ewn);
        this.f270361g = (ImageButton) this.f270369o.findViewById(C0966R.C0970id.ewg);
        this.f270362h = (ImageButton) this.f270369o.findViewById(C0966R.C0970id.ewf);
        this.f270356b.setLayoutManager(this.f270355a.mo128569b(this.f270368n));
        this.f270356b.mo17085h0(this.f270355a.mo128568a(this.f270368n));
        this.f270356b.setAdapter(this.f270355a.mo128578p(this.f270373s));
        ((C93642n) this.f270355a.mo128571j()).f270401o = this.f270370p;
        this.f270356b.setHasFixedSize(true);
        this.f270356b.setOnScrollListener(new C2296i(this));
        this.f270356b.mo17043c(new C93627j(this));
        ((TextView) this.f270369o.findViewById(C0966R.C0970id.j9e)).setOnClickListener(this.f270376v);
        this.f270361g.setTag(0);
        this.f270361g.setOnClickListener(this.f270377w);
        this.f270362h.setTag(1);
        this.f270362h.setOnClickListener(this.f270377w);
    }

    /* renamed from: H */
    public void mo128543H(int i) {
        if (mo128546b()) {
            boolean z = i > 0;
            this.f270361g.setEnabled(z);
            this.f270362h.setEnabled(z);
        }
    }

    /* renamed from: I */
    public void mo128544I(List<C93637l> list) {
        if (list != null && list.size() > 0) {
            ((ArrayList) this.f270378x).clear();
            ((ArrayList) this.f270378x).addAll(list);
            Intent intent = new Intent();
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("mutil_select_is_ret", true);
            if (((ArrayList) this.f270378x).size() == 1) {
                C93637l lVar = list.get(0);
                String Q = C100734q.m131826Q(lVar.f270388b);
                String w = C100734q.m131880w(lVar.f270388b);
                if (C86013q1.m106450k(Q)) {
                    intent.putExtra("image_path", Q);
                } else {
                    intent.putExtra("image_path", w);
                }
                intent.putExtra("Retr_Msg_Type", (lVar.mo128559c() || lVar.mo128560d()) ? 1 : 0);
                intent.putExtra("select_is_ret", true);
            } else {
                intent.putExtra("scene_from", 1);
                intent.putExtra("Retr_Msg_Type", 17);
            }
            C88144b.m109802t(this.f270368n, ".ui.transmit.SelectConversationUI", intent, 1);
            for (C93637l lVar2 : list) {
                C100695a0.m131729d(lVar2.f270387a.field_localId, 1, 0, -1);
            }
            C93636f fVar = this.f270371q;
            if (fVar != null) {
                fVar.mo128264k2(0, ((ArrayList) this.f270378x).size());
            }
        }
    }

    /* renamed from: J */
    public void mo128545J(List<C93637l> list) {
        int i;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            HashSet hashSet = new HashSet();
            C100755z zVar = null;
            for (C93637l lVar : list) {
                zVar = lVar.f270387a;
                if (zVar == null || !((i = zVar.field_type) == 18 || i == 14)) {
                    arrayList.add(zVar);
                } else {
                    z = true;
                    hashSet.add(Long.valueOf(zVar.field_localId));
                }
            }
            if (arrayList.size() != 0) {
                Activity activity = this.f270368n;
                C76879j.m92750u(activity, activity.getString(C0966R.string.cn5), "", new C93634e(arrayList, z), (DialogInterface.OnClickListener) null);
            } else if (hashSet.size() >= 2) {
                FavSearchUI.m118045R7(this.f270368n);
            } else {
                C77426q qVar = new C77426q(this.f270368n);
                qVar.mo107595g(this.f270368n.getString(C0966R.string.cn6));
                qVar.mo107598j(this.f270368n.getString(C0966R.string.f360416cn0));
                qVar.mo107602n(this.f270368n.getString(C0966R.string.coq));
                qVar.mo107591c(new C93632c(this), new C93633d(zVar));
                qVar.mo107603o();
            }
        }
    }

    /* renamed from: a */
    public void mo128514a(C93620a aVar) {
        C93649o oVar = (C93649o) aVar;
        this.f270355a = oVar;
        if (oVar != null) {
            oVar.mo128576o(this);
        }
    }

    /* renamed from: b */
    public boolean mo128546b() {
        C93649o oVar = this.f270355a;
        if (oVar == null) {
            return false;
        }
        return oVar.mo128574m();
    }

    /* renamed from: c */
    public void mo128547c() {
        C89940c cVar;
        Class cls = C88146a.class;
        C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcMediaGalleryScrollEnable(), this.f270366l);
        this.f270366l = 0;
        if (!(!C91441c.m114729c() || C91441c.m114730d().mo125377a(cls) == null || (cVar = ((C88146a) C91441c.m114730d().mo125377a(cls)).f254918n) == null)) {
            this.f270374t = Math.max(0, ((long) ((int) cVar.f258449e)) - this.f270374t);
        }
        this.f270375u = Util.nowSecond() > this.f270375u ? Util.nowSecond() - this.f270375u : 1;
        C40318k.m43492a().reportFPS(703, C40318k.m43492a().getHcMediaGalleryScrollAction(), 1, this.f270374t, this.f270375u);
        this.f270374t = 0;
        this.f270375u = 0;
    }

    /* renamed from: d */
    public void mo128548d() {
        C89940c cVar;
        Class cls = C88146a.class;
        this.f270375u = Util.nowSecond();
        if (!(!C91441c.m114729c() || C91441c.m114730d().mo125377a(cls) == null || (cVar = ((C88146a) C91441c.m114730d().mo125377a(cls)).f254918n) == null)) {
            this.f270374t = (long) ((int) cVar.f258449e);
        }
        C93649o oVar = this.f270355a;
        if (oVar != null) {
            oVar.onResume();
        }
        if (this.f270364j) {
            C93649o oVar2 = this.f270355a;
            if (oVar2 == null || !oVar2.mo128574m()) {
                mo128552i();
            } else {
                C93649o oVar3 = this.f270355a;
                if (oVar3 != null) {
                    oVar3.mo128573l();
                }
                this.f270357c.setVisibility(8);
                this.f270358d.setVisibility(0);
                this.f270361g.setEnabled(false);
                this.f270362h.setEnabled(false);
            }
        }
        this.f270364j = false;
    }

    /* renamed from: e */
    public final void mo128549e(boolean z, String str) {
        Log.m105925i("MicroMsg.MediaHistoryGalleryUI", "[setProgress] isVisible:%s", Boolean.valueOf(z));
        if (z) {
            Activity activity = this.f270368n;
            if (str == null) {
                str = activity.getString(C0966R.string.gas);
            }
            this.f270363i = C89779i0.m112248e(activity, str, true, 0, (DialogInterface.OnCancelListener) null);
            return;
        }
        ProgressDialog progressDialog = this.f270363i;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f270363i.dismiss();
            this.f270363i = null;
        }
    }

    /* renamed from: f */
    public void mo128550f(boolean z) {
        if (z) {
            mo128549e(true, (String) null);
        } else {
            ((GridLayoutManager) this.f270356b.getLayoutManager()).mo16959E();
        }
    }

    /* renamed from: g */
    public void mo128551g(int i) {
        View view = this.f270369o;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: i */
    public void mo128552i() {
        C93649o oVar = this.f270355a;
        if (oVar != null) {
            oVar.mo128570i();
        }
        this.f270357c.setVisibility(0);
        this.f270358d.setVisibility(8);
    }

    /* renamed from: k */
    public void mo128553k(boolean z, int i) {
        Log.m105925i("MicroMsg.MediaHistoryGalleryUI", "[onDataLoaded] isFirst:%s addCount:%s mIntentPos:%s", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(this.f270365k));
        if (this.f270371q != null) {
            this.f270371q.mo128254D3((int) (System.currentTimeMillis() - this.f270372r), i);
        }
        if (z) {
            mo128549e(false, (String) null);
            this.f270356b.getAdapter().notifyDataSetChanged();
            int i2 = this.f270365k;
            if (i2 > 0) {
                if (i2 % 4 == 0) {
                    this.f270365k = i2 + 1;
                }
                RecyclerView recyclerView = this.f270356b;
                int i3 = this.f270365k;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i3));
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
            } else {
                int itemCount = this.f270356b.getAdapter().getItemCount();
                RecyclerView recyclerView3 = this.f270356b;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(itemCount - 1));
                RecyclerView recyclerView4 = recyclerView3;
                C117292a.m165358d(recyclerView4, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView3.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView4, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
            }
            if (i <= 0) {
                this.f270360f.setVisibility(0);
                this.f270356b.setVisibility(8);
                this.f270360f.setText(this.f270368n.getString(C0966R.string.cmk));
                return;
            }
            this.f270360f.setVisibility(8);
            this.f270356b.setVisibility(0);
        } else if (i > 0) {
            this.f270356b.getAdapter().notifyDataSetChanged();
        } else {
            this.f270356b.getAdapter().notifyItemChanged(0);
        }
    }
}
