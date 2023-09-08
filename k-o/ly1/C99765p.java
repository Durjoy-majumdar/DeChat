package ly1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.game.media.GameVideoTagContainer;
import com.tencent.p014mm.plugin.game.widget.GameGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import o90.C100301b;
import p823sg.C101611g;
import q90.C101062d;
import vw1.C102299l;
import w10.C15032a;
import yt0.C53568b;
import zt3.C119157j;

/* renamed from: ly1.p */
public class C99765p extends RecyclerView {

    /* renamed from: A1 */
    public View f292388A1;

    /* renamed from: B1 */
    public C99766a f292389B1;

    /* renamed from: C1 */
    public boolean f292390C1;

    /* renamed from: D1 */
    public boolean f292391D1;

    /* renamed from: E1 */
    public Set<Integer> f292392E1 = new HashSet();

    /* renamed from: y1 */
    public int f292393y1;

    /* renamed from: z1 */
    public int f292394z1;

    /* renamed from: ly1.p$b */
    public static class C10666b extends RecyclerView.C0129l {

        /* renamed from: d */
        public int f32083d = C74942w4.m89784a(MMApplicationContext.getContext(), 4);

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            recyclerView.mo17029N0(view);
            GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view.getLayoutParams();
            int i = ((GridLayoutManager) recyclerView.getLayoutManager()).f44669w;
            Log.m105925i("MicroMsg.GameHaowanRecycleView", "getItemOffsets, spanSize = %d, spanCount = %d, index = %d", Integer.valueOf(layoutParams.f44674i), Integer.valueOf(i), Integer.valueOf(layoutParams.f44673h));
            if (layoutParams.f44674i == i) {
                rect.set(0, 0, 0, 0);
            } else if (layoutParams.f44673h == 0) {
                int i2 = this.f32083d;
                rect.set(i2 * 2, i2 / 2, i2 / 2, i2 / 2);
            } else {
                int i3 = this.f32083d;
                rect.set(i3 / 2, i3 / 2, i3 * 2, i3 / 2);
            }
        }
    }

    /* renamed from: ly1.p$a */
    public class C99766a extends RecyclerView.C16613e<C99767c> {

        /* renamed from: d */
        public Context f292395d;

        /* renamed from: e */
        public ViewGroup f292396e;

        /* renamed from: f */
        public ViewGroup f292397f;

        /* renamed from: g */
        public LinkedList<View> f292398g = new LinkedList<>();

        /* renamed from: h */
        public LinkedList<View> f292399h = new LinkedList<>();

        /* renamed from: i */
        public LinkedList<C102299l> f292400i = new LinkedList<>();

        /* renamed from: j */
        public C53568b f292401j;

        public C99766a(Context context) {
            this.f292395d = context;
        }

        /* renamed from: F4 */
        public final int mo139128F4(int i) {
            if (i < 0 || i >= this.f292400i.size()) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < i + 1; i3++) {
                C102299l lVar = this.f292400i.get(i3);
                if (!lVar.f301296e && !lVar.f301297f) {
                    i2++;
                }
            }
            return i2;
        }

        /* renamed from: G4 */
        public final void mo139129G4(int i, int i2, String str, String str2) {
            int i3 = C99765p.this.f292393y1 == 8762 ? 7 : 6;
            HashMap hashMap = new HashMap();
            hashMap.put("videoid", str2);
            Context context = MMApplicationContext.getContext();
            C99765p pVar = C99765p.this;
            C40314g.m43487f(context, 87, pVar.f292393y1, i, i2, str, pVar.f292394z1, C15032a.m14200a(i3, hashMap));
        }

        public int getItemCount() {
            return this.f292400i.size() + (this.f292398g.isEmpty() ^ true ? 1 : 0) + (this.f292399h.isEmpty() ^ true ? 1 : 0);
        }

        public int getItemViewType(int i) {
            if (i >= 0 && i < getItemCount()) {
                if (i == 0 && !this.f292398g.isEmpty()) {
                    return Integer.MAX_VALUE;
                }
                if (i == getItemCount() - 1 && !this.f292399h.isEmpty()) {
                    return 2147483646;
                }
                int i2 = i - (this.f292398g.isEmpty() ^ true ? 1 : 0);
                if (i2 >= 0 && i2 < this.f292400i.size()) {
                    C102299l lVar = this.f292400i.get(i2);
                    if (lVar == null || !lVar.f301296e) {
                        return (lVar == null || !lVar.f301297f) ? 0 : 2;
                    }
                    return 1;
                }
            }
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C99767c cVar = (C99767c) zVar;
            int itemViewType = getItemViewType(i);
            if (itemViewType != Integer.MAX_VALUE && itemViewType != 2147483646 && itemViewType != 2) {
                int i2 = i - (this.f292398g.isEmpty() ^ true ? 1 : 0);
                C102299l lVar = (i2 < 0 || i2 >= this.f292400i.size()) ? null : this.f292400i.get(i2);
                if (lVar != null) {
                    if (lVar.f301296e) {
                        cVar.f292407z.setText(lVar.f301298g);
                    } else {
                        cVar.f292403A.setImageBitmap((Bitmap) null);
                        cVar.f292404B.setText(lVar.f301302n);
                        cVar.f292406D.setText(lVar.f301301j);
                        if (lVar.f301295d) {
                            ImageView imageView = cVar.f292403A;
                            String str = lVar.f301300i;
                            C101611g<String, Bitmap> gVar = C99782y0.f292450a;
                            Bitmap bitmap = (Bitmap) ((C100301b) gVar).get(str);
                            if (bitmap == null || bitmap.isRecycled()) {
                                Log.m105925i("MicroMsg.SimpleVideoAnalyzer", "attachVideoThumbBitmap, not from cache, size = %d", Integer.valueOf(((C101062d) gVar).size()));
                                ((C119157j) C119157j.f356862d).mo183875f(new C99780x0(str, new SoftReference(imageView)));
                            } else {
                                Log.m105924i("MicroMsg.SimpleVideoAnalyzer", "attachVideoThumbBitmap, from cache");
                                imageView.setImageBitmap(bitmap);
                            }
                            cVar.f292405C.setVisibility(8);
                        } else {
                            C20937c.C20939b bVar = new C20937c.C20939b();
                            bVar.f59351g = C99772s0.f292415a;
                            bVar.f59346b = true;
                            C20828a.m22825b().mo32520i(lVar.f301299h, cVar.f292403A, bVar.mo32666a(), new C99761n(this));
                            cVar.f292405C.setData(lVar.f301303o);
                        }
                        C99765p pVar = C99765p.this;
                        if (!pVar.f292391D1) {
                            if (!((HashSet) pVar.f292392E1).contains(Integer.valueOf(lVar.hashCode()))) {
                                ((HashSet) C99765p.this.f292392E1).add(Integer.valueOf(lVar.hashCode()));
                                mo139129G4(mo139128F4(i2), 1, lVar.f301307s, lVar.f301312x);
                            }
                        }
                    }
                    if (this.f292401j != null) {
                        cVar.f44854d.setOnClickListener(new C99764o(this, cVar, i2, lVar));
                    }
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == Integer.MAX_VALUE) {
                if (this.f292396e == null) {
                    this.f292396e = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c7x, viewGroup, false);
                }
                this.f292396e.removeAllViews();
                Iterator<View> it = this.f292398g.iterator();
                while (it.hasNext()) {
                    this.f292396e.addView(it.next());
                }
                return new C99767c(this.f292396e);
            } else if (i == 2147483646) {
                if (this.f292397f == null) {
                    this.f292397f = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c7x, viewGroup, false);
                }
                this.f292397f.removeAllViews();
                Iterator<View> it4 = this.f292399h.iterator();
                while (it4.hasNext()) {
                    this.f292397f.addView(it4.next());
                }
                return new C99767c(this.f292397f);
            } else {
                return i == 1 ? new C99767c(LayoutInflater.from(this.f292395d).inflate(C0966R.C0971layout.f359821ay3, viewGroup, false)) : i == 2 ? new C99767c(LayoutInflater.from(this.f292395d).inflate(C0966R.C0971layout.awd, viewGroup, false)) : new C99767c(LayoutInflater.from(this.f292395d).inflate(C0966R.C0971layout.f359819ay1, viewGroup, false));
            }
        }
    }

    /* renamed from: ly1.p$c */
    public static class C99767c extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f292403A;

        /* renamed from: B */
        public TextView f292404B;

        /* renamed from: C */
        public GameVideoTagContainer f292405C;

        /* renamed from: D */
        public TextView f292406D;

        /* renamed from: z */
        public TextView f292407z;

        public C99767c(View view) {
            super(view);
            this.f292407z = (TextView) view.findViewById(C0966R.C0970id.kkx);
            this.f292403A = (ImageView) view.findViewById(C0966R.C0970id.l5y);
            this.f292404B = (TextView) view.findViewById(C0966R.C0970id.cnk);
            this.f292405C = (GameVideoTagContainer) view.findViewById(C0966R.C0970id.l7j);
            this.f292406D = (TextView) view.findViewById(C0966R.C0970id.l7s);
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.eo_);
        }
    }

    public C99765p(Context context, int i, int i2) {
        super(context, (AttributeSet) null);
        this.f292393y1 = i;
        this.f292394z1 = i2;
        this.f292389B1 = new C99766a(getContext());
        GameGridLayoutManager gameGridLayoutManager = new GameGridLayoutManager(getContext(), 2, 1, false);
        gameGridLayoutManager.f44666B = new C99756m(this);
        setLayoutManager(gameGridLayoutManager);
        mo17085h0(new C10666b());
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f359809aw2, this, false);
        this.f292388A1 = inflate;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = inflate;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "addLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "addLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C99766a aVar2 = this.f292389B1;
        aVar2.f292399h.add(this.f292388A1);
        setAdapter(this.f292389B1);
    }

    public void setOnItemClickListener(C53568b bVar) {
        this.f292389B1.f292401j = bVar;
    }

    /* renamed from: x1 */
    public void mo139126x1(LinkedList<C102299l> linkedList, boolean z, boolean z2) {
        this.f292390C1 = z;
        this.f292391D1 = z2;
        View view = this.f292388A1;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "hideLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "hideLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C99766a aVar2 = this.f292389B1;
        aVar2.f292400i.clear();
        aVar2.f292400i.addAll(linkedList);
        aVar2.notifyDataSetChanged();
    }

    /* renamed from: y1 */
    public boolean mo139127y1(int i) {
        int E = ((LinearLayoutManager) getLayoutManager()).mo16959E();
        if (i != 0 || !this.f292390C1 || E < this.f292389B1.getItemCount() - 2) {
            return false;
        }
        View view = this.f292388A1;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "showLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "showLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }
}
