package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42091s;
import com.tencent.p014mm.plugin.game.model.C42112t;
import com.tencent.p014mm.plugin.game.widget.TextProgressBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import p763ym.C53543s;
import p823sg.C101611g;
import q90.C101062d;
import qy1.C12934a;
import ry1.C48099a;
import ry1.C48104b;
import ry1.C48122i;

/* renamed from: com.tencent.mm.plugin.game.ui.d */
public abstract class C42307d extends C48104b<C42039b> {

    /* renamed from: j */
    public int f114387j;

    /* renamed from: n */
    public Context f114388n;

    /* renamed from: o */
    public int f114389o = 14;

    /* renamed from: p */
    public int f114390p = 0;

    /* renamed from: q */
    public int f114391q;

    /* renamed from: r */
    public ConcurrentHashMap<String, C42112t> f114392r;

    /* renamed from: s */
    public SparseArray<View> f114393s;

    /* renamed from: t */
    public C48122i f114394t;

    /* renamed from: u */
    public C42311d f114395u;

    /* renamed from: v */
    public C42091s.C42092a f114396v = new C42308a();

    /* renamed from: w */
    public View.OnClickListener f114397w = new C42309b();

    /* renamed from: x */
    public DialogInterface.OnClickListener f114398x = new C42310c();

    /* renamed from: com.tencent.mm.plugin.game.ui.d$a */
    public class C42308a implements C42091s.C42092a {
        public C42308a() {
        }

        /* renamed from: a */
        public void mo66052a(int i, String str, boolean z) {
            ConcurrentHashMap<String, C42112t> concurrentHashMap;
            C42311d dVar;
            C42039b bVar;
            if (z && (concurrentHashMap = C42307d.this.f114392r) != null && str != null) {
                try {
                    for (C42112t next : concurrentHashMap.values()) {
                        if (!(next == null || (bVar = next.f113423a) == null)) {
                            if (bVar.field_appId.equals(str) || next.f113423a.field_packageName.equals(str)) {
                                next.mo66072a(C42307d.this.f114388n);
                                next.mo66073b();
                            }
                        }
                    }
                    for (int i2 = 0; i2 < C42307d.this.f128963e.size(); i2++) {
                        C42039b bVar2 = (C42039b) C42307d.this.f128963e.get(i2);
                        if (bVar2.f113271z1 == 0 && ((bVar2.field_appId.equals(str) || bVar2.field_packageName.equals(str)) && (dVar = C42307d.this.f114395u) != null)) {
                            dVar.mo66127a(i2);
                            return;
                        }
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.GameListAdapter", e.getMessage());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.d$b */
    public class C42309b implements View.OnClickListener {
        public C42309b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameListAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!(view.getTag() instanceof C42039b)) {
                Log.m105920e("MicroMsg.GameListAdapter", "No button tag retrived, ignore click");
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameListAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C42039b bVar = (C42039b) view.getTag();
            if (!C42307d.this.f114392r.containsKey(bVar.field_appId)) {
                Log.m105920e("MicroMsg.GameListAdapter", "No DownloadInfo found");
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameListAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C42112t tVar = C42307d.this.f114392r.get(bVar.field_appId);
            tVar.mo66072a(C42307d.this.f114388n);
            C42307d dVar = C42307d.this;
            C48122i iVar = dVar.f114394t;
            iVar.f129003h = bVar.f113263P1;
            iVar.f129002g = dVar.f114390p;
            iVar.mo72863a(bVar, tVar);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameListAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.d$c */
    public class C42310c implements DialogInterface.OnClickListener {
        public C42310c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C42307d.this.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.d$d */
    public interface C42311d {
        /* renamed from: a */
        void mo66127a(int i);
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.d$e */
    public static class C42312e {

        /* renamed from: a */
        public TextView f114402a;

        /* renamed from: b */
        public ImageView f114403b;

        /* renamed from: c */
        public TextView f114404c;

        /* renamed from: d */
        public TextView f114405d;

        /* renamed from: e */
        public TextView f114406e;

        /* renamed from: f */
        public TextView f114407f;

        /* renamed from: g */
        public Button f114408g;

        /* renamed from: h */
        public TextProgressBar f114409h;

        /* renamed from: i */
        public GameListSocialView f114410i;

        /* renamed from: j */
        public ViewGroup f114411j;

        /* renamed from: k */
        public LinearLayout f114412k;
    }

    public C42307d(Context context) {
        super(context);
        this.f114388n = context;
        this.f114392r = new ConcurrentHashMap<>();
        C42091s.m45783a(this.f114396v);
        this.f114393s = new SparseArray<>();
        C48122i iVar = new C48122i(context);
        this.f114394t = iVar;
        iVar.f129001f = this.f114398x;
    }

    /* renamed from: f */
    public static void m46001f(C42307d dVar, LinkedList linkedList) {
        dVar.getClass();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C42039b bVar = (C42039b) it.next();
            if (!dVar.f114392r.containsKey(bVar.field_appId) && bVar.f113271z1 != 1) {
                C42112t tVar = dVar.f114392r.get(bVar.field_appId);
                if (tVar == null) {
                    tVar = new C42112t(bVar);
                    dVar.f114392r.put(bVar.field_appId, tVar);
                }
                tVar.mo66072a(dVar.f114388n);
                tVar.mo66073b();
            }
        }
    }

    public int getItemViewType(int i) {
        return ((C42039b) getItem(i)).f113271z1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C42312e eVar;
        C42039b bVar = (C42039b) getItem(i);
        if (view == null) {
            Context context = this.f114388n;
            int i2 = bVar.f113271z1;
            view = View.inflate(context, i2 != 0 ? i2 != 1 ? 0 : C0966R.C0971layout.au7 : this.f114387j, (ViewGroup) null);
            eVar = new C42312e();
            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(C0966R.C0970id.glb);
            eVar.f114402a = (TextView) view.findViewById(C0966R.C0970id.emy);
            eVar.f114403b = (ImageView) view.findViewById(C0966R.C0970id.ekt);
            eVar.f114404c = (TextView) view.findViewById(C0966R.C0970id.emr);
            eVar.f114405d = (TextView) view.findViewById(C0966R.C0970id.hdd);
            eVar.f114406e = (TextView) view.findViewById(C0966R.C0970id.f358351el0);
            eVar.f114407f = (TextView) view.findViewById(C0966R.C0970id.eim);
            eVar.f114408g = (Button) view.findViewById(C0966R.C0970id.ek8);
            eVar.f114409h = (TextProgressBar) view.findViewById(C0966R.C0970id.ek_);
            eVar.f114412k = (LinearLayout) view.findViewById(C0966R.C0970id.ehz);
            eVar.f114410i = (GameListSocialView) view.findViewById(C0966R.C0970id.enp);
            eVar.f114411j = (ViewGroup) view.findViewById(C0966R.C0970id.bye);
            view.setTag(eVar);
        } else {
            eVar = (C42312e) view.getTag();
        }
        int i3 = bVar.f113271z1;
        if (i3 == 0) {
            mo66277k(bVar, eVar, i);
            if (this.f114391q == 2 && !bVar.f113264Q1) {
                C12934a.m12380b(this.f114388n, 10, 1004, bVar.f113256I1, 1, bVar.field_appId, this.f114390p, bVar.f113263P1);
                bVar.f113264Q1 = true;
            }
        } else if (i3 == 1) {
            mo66276j(bVar, eVar);
        }
        return view;
    }

    public int getViewTypeCount() {
        return 2;
    }

    /* renamed from: i */
    public void mo66379i() {
        LinkedList<T> linkedList = this.f128963e;
        if (linkedList != null) {
            linkedList.clear();
        }
        C101611g<String, Bitmap> gVar = this.f128964f;
        if (gVar != null) {
            ((C101062d) gVar).mo122812a(new C48099a(this));
        }
        this.f128964f = null;
        ((C53543s) C86312j.m106911c(C53543s.class)).Gk0().remove(this.f128966h);
        C42091s.m45785e(this.f114396v);
    }

    /* renamed from: j */
    public abstract void mo66276j(C42039b bVar, C42312e eVar);

    /* renamed from: k */
    public abstract void mo66277k(C42039b bVar, C42312e eVar, int i);

    /* renamed from: l */
    public void mo66380l(View view, int i) {
        C42312e eVar = (C42312e) view.getTag();
        C42039b bVar = (C42039b) this.f128963e.get(i);
        if (eVar != null) {
            this.f114394t.mo72864b(eVar.f114409h, eVar.f114408g, bVar, this.f114392r.get(bVar.field_appId));
            return;
        }
        Log.m105921e("MicroMsg.GameListAdapter", "holder should not be null, %d", Integer.valueOf(i));
    }
}
