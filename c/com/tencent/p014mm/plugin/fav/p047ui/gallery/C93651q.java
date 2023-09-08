package com.tencent.p014mm.plugin.fav.p047ui.gallery;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93638m;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93642n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import p749xh.C102666r2;
import pb1.C100718j1;
import pb1.C100755z;
import pb1.C11883v0;
import te3.C101834rc0;
import xb1.C102612a;
import xb1.C102614d;
import xb1.C102615e;

/* renamed from: com.tencent.mm.plugin.fav.ui.gallery.q */
public class C93651q implements C93649o, C93638m.C93641c {

    /* renamed from: a */
    public C93650p f270418a;

    /* renamed from: b */
    public ArrayList<C93642n.C93647f> f270419b = null;

    /* renamed from: c */
    public Context f270420c;

    /* renamed from: d */
    public C93642n f270421d;

    /* renamed from: e */
    public GridLayoutManager f270422e;

    /* renamed from: f */
    public C93642n.C93646d f270423f;

    /* renamed from: g */
    public boolean f270424g = false;

    /* renamed from: h */
    public int f270425h;

    /* renamed from: i */
    public List<Long> f270426i;

    /* renamed from: j */
    public int f270427j;

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.q$b */
    public class C68922b extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ Context f198034d;

        public C68922b(C93651q qVar, Context context) {
            this.f198034d = context;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            int dimension = (int) this.f198034d.getResources().getDimension(C0966R.dimen.f3928j9);
            rect.bottom = dimension;
            rect.top = dimension;
            rect.left = dimension;
            rect.right = dimension;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.q$a */
    public class C93652a extends GridLayoutManager.C0127b {
        public C93652a() {
        }

        /* renamed from: c */
        public int mo118c(int i) {
            if (i >= C93651q.this.f270419b.size()) {
                return 4;
            }
            C93651q.this.f270419b.get(i).getClass();
            return 1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.q$c */
    public class C93653c implements Runnable {
        public C93653c() {
        }

        public void run() {
            Log.m105924i("MicroMsg.MediaHistoryGalleryPresenter", "uiCallback()");
            C93651q.this.mo128572k(true, -1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.q$d */
    public class C93654d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f270430d;

        /* renamed from: e */
        public final /* synthetic */ int f270431e;

        /* renamed from: com.tencent.mm.plugin.fav.ui.gallery.q$d$a */
        public class C93655a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f270433d;

            public C93655a(int i) {
                this.f270433d = i;
            }

            public void run() {
                C93654d dVar = C93654d.this;
                C93651q qVar = C93651q.this;
                qVar.f270421d.f270398i = false;
                C93650p pVar = qVar.f270418a;
                if (pVar != null) {
                    pVar.mo128553k(dVar.f270430d, this.f270433d);
                }
            }
        }

        public C93654d(boolean z, int i) {
            this.f270430d = z;
            this.f270431e = i;
        }

        public void run() {
            Class cls = C100718j1.class;
            if (this.f270430d) {
                C93651q.this.f270419b.clear();
                C93651q.this.f270427j = 0;
                ArrayList arrayList = new ArrayList();
                arrayList.add(21);
                C93651q.this.f270426i = ((C102615e) ((C100718j1) C86312j.m106911c(cls)).mo128208Y3()).mo142274Lo((List<String>) null, (List<String>) null, arrayList);
                C93651q qVar = C93651q.this;
                qVar.f270425h = qVar.f270426i.size();
            }
            int i = this.f270431e;
            int i2 = 100;
            if (i >= 0) {
                int i3 = C93651q.this.f270425h;
                if (i3 - i > 100) {
                    i2 = i3 - i;
                }
            }
            char c = 1;
            Log.m105925i("MicroMsg.MediaHistoryGalleryPresenter", "offset:%s limit:%s", Integer.valueOf(i), Integer.valueOf(i2));
            LinkedList linkedList = new LinkedList();
            while (linkedList.size() < i2) {
                C93651q qVar2 = C93651q.this;
                if (qVar2.f270427j >= qVar2.f270426i.size()) {
                    break;
                }
                C93651q qVar3 = C93651q.this;
                int i4 = qVar3.f270427j;
                int i5 = i4 + i2;
                if (i5 > qVar3.f270426i.size()) {
                    i5 = C93651q.this.f270426i.size();
                }
                C93651q qVar4 = C93651q.this;
                List<Long> subList = qVar4.f270426i.subList(i4, i5);
                qVar4.getClass();
                ArrayList arrayList2 = new ArrayList();
                int i6 = 3;
                if (subList != null && subList.size() != 0) {
                    int i7 = 0;
                    while (true) {
                        int i8 = i7 + 20;
                        if (i8 >= subList.size()) {
                            i8 = subList.size();
                        }
                        Object[] objArr = new Object[i6];
                        objArr[0] = Integer.valueOf(i7);
                        objArr[c] = Integer.valueOf(i8);
                        objArr[2] = Integer.valueOf(subList.size());
                        Log.m105927v("MicroMsg.MediaHistoryGalleryPresenter", "start:%d  end:%d listSize:%d", objArr);
                        ArrayList<C100755z> SE = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142264SE(subList.subList(i7, i8), (List<? extends C102666r2>) null, (Set<Integer>) null, (C11883v0) null, false);
                        if (SE != null && SE.size() > 0) {
                            arrayList2.addAll(SE);
                        }
                        if (i8 >= subList.size()) {
                            break;
                        }
                        i7 = i8;
                        i6 = 3;
                    }
                }
                C93651q.this.f270427j = i5;
                Iterator it = arrayList2.iterator();
                while (true) {
                    int i9 = 4;
                    if (!it.hasNext()) {
                        break;
                    }
                    C100755z zVar = (C100755z) it.next();
                    C93651q.this.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    if (zVar != null && zVar.field_favProto.f298618f.size() != 0) {
                        int size = zVar.field_favProto.f298618f.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            C101834rc0 rc02 = zVar.field_favProto.f298618f.get(size);
                            int i15 = rc02.f299258I;
                            if (i15 == 2 || i15 == i9 || i15 == 15) {
                                arrayList3.add(new C93642n.C93647f(new C93637l(zVar, rc02)));
                            }
                            i9 = 4;
                        }
                    }
                    linkedList.addAll(arrayList3);
                }
                Log.m105925i("MicroMsg.MediaHistoryGalleryPresenter", "traverse until size ok. start:%s, end:%s, idListSize:%s, limit:%s, linklistSize:%s", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(C93651q.this.f270426i.size()), Integer.valueOf(i2), Integer.valueOf(linkedList.size()));
                c = 1;
            }
            int size2 = linkedList.size();
            Collections.reverse(linkedList);
            C93651q.this.f270419b.addAll(0, linkedList);
            linkedList.clear();
            Log.m105925i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] %s", Integer.valueOf(C93651q.this.f270419b.size()));
            MMHandlerThread.postToMainThread(new C93655a(size2));
        }
    }

    public C93651q(Context context) {
        new MMHandler(Looper.getMainLooper());
        this.f270425h = 0;
        this.f270426i = new ArrayList();
        this.f270427j = 0;
        this.f270420c = context;
        this.f270419b = new ArrayList<>();
    }

    /* renamed from: a */
    public RecyclerView.C0129l mo128568a(Context context) {
        return new C68922b(this, context);
    }

    /* renamed from: b */
    public <T extends RecyclerView.LayoutManager> T mo128569b(Context context) {
        if (this.f270422e == null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 4);
            this.f270422e = gridLayoutManager;
            gridLayoutManager.f44666B = new C93652a();
        }
        return this.f270422e;
    }

    /* renamed from: c */
    public void mo128563c(C93637l lVar, boolean z) {
        this.f270424g = true;
    }

    public void clear() {
    }

    /* renamed from: i */
    public void mo128570i() {
        this.f270421d.f270405s = false;
        C93638m mVar = C93638m.C93640b.f270392a;
        mVar.mo128561a();
        mVar.f270390b = false;
        this.f270421d.notifyDataSetChanged();
    }

    /* renamed from: j */
    public RecyclerView.C16613e mo128571j() {
        return this.f270421d;
    }

    /* renamed from: k */
    public void mo128572k(boolean z, int i) {
        this.f270421d.f270398i = true;
        this.f270418a.mo128550f(z);
        C86709a0.m107528h();
        C86709a0.m107525e().postToWorker(new C93654d(z, i));
    }

    /* renamed from: l */
    public void mo128573l() {
        this.f270421d.f270405s = true;
        C93638m.C93640b.f270392a.f270390b = true;
        GridLayoutManager gridLayoutManager = (GridLayoutManager) mo128569b(this.f270420c);
        int C = gridLayoutManager.mo16957C();
        this.f270421d.notifyItemRangeChanged(C, (gridLayoutManager.mo16959E() - C) + 1, 0);
    }

    /* renamed from: m */
    public boolean mo128574m() {
        return C93638m.C93640b.f270392a.f270390b;
    }

    /* renamed from: n */
    public void mo128575n(int i) {
        Log.m105925i("MicroMsg.MediaHistoryGalleryPresenter", "[handleSelectedItem] type:%s", Integer.valueOf(i));
        ArrayList<C93637l> arrayList = C93638m.C93640b.f270392a.f270389a;
        if (arrayList == null || arrayList.size() == 0) {
            Log.m105924i("MicroMsg.MediaHistoryGalleryPresenter", "handleSelectedItem() list == null");
        } else if (i == 0) {
            this.f270418a.mo128544I(arrayList);
            this.f270418a.mo128552i();
        } else if (i == 1) {
            this.f270418a.mo128545J(arrayList);
            this.f270418a.mo128552i();
        }
    }

    /* renamed from: o */
    public void mo128576o(C93642n.C93646d dVar) {
        this.f270423f = dVar;
    }

    public void onDetach() {
        C93650p pVar = this.f270418a;
        if (pVar != null) {
            pVar.mo128514a(null);
            this.f270418a = null;
        }
        C93638m mVar = C93638m.C93640b.f270392a;
        mVar.f270391c.clear();
        mVar.mo128561a();
        mVar.f270390b = false;
        ((C102612a) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128198DE()).mo142250SE(this.f270421d.f270404r);
    }

    public void onResume() {
        if (this.f270424g) {
            C93638m mVar = C93638m.C93640b.f270392a;
            if (mVar.f270390b) {
                this.f270418a.mo128543H(mVar.f270389a.size());
                this.f270421d.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: p */
    public RecyclerView.C16613e mo128578p(FavoriteImageServer favoriteImageServer) {
        C93642n nVar = new C93642n(this.f270420c, this.f270419b, 4, this.f270418a, favoriteImageServer, new C93653c());
        this.f270421d = nVar;
        nVar.f270399j = new C93656r(this);
        nVar.f270400n = this.f270423f;
        ((C102612a) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128198DE()).mo142255jo(this.f270421d.f270404r);
        return this.f270421d;
    }
}
