package cn1;

import ak1.C54059a;
import ak1.C54067f0;
import an1.C0096i;
import an1.C0101n;
import an1.C0103p;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import bn1.C0331b;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.adapter.main.SpecialColumnItemConvertFactory;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9494d;
import jq3.C9496f;
import jq3.C9499g;
import ln1.C10584f;
import mm1.C10934a;
import pm1.C62381d;
import rs1.C13442s8;
import te3.C48682a91;
import te3.C49098d51;
import te3.C49114d91;
import te3.C49712hj1;
import te3.C64273c21;
import xm1.C15826d;
import xm1.C15828e;
import xm1.C15829e0;
import ym1.C16052a;
import z04.C112551y;
import zm1.C16304h;

/* renamed from: cn1.e1 */
public class C0827e1 extends C60896i<C0103p> {

    /* renamed from: e */
    public final C15829e0 f1944e;

    /* renamed from: f */
    public final C15828e f1945f;

    /* renamed from: g */
    public final C49712hj1 f1946g;

    /* renamed from: h */
    public C54059a f1947h = new C54059a();

    /* renamed from: i */
    public C49712hj1 f1948i;

    /* renamed from: j */
    public C16052a f1949j;

    /* renamed from: cn1.e1$a */
    public static final class C0828a extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f1950d;

        /* renamed from: e */
        public final int f1951e;

        public C0828a(int i, int i2) {
            this.f1950d = i;
            this.f1951e = i2;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            super.mo21g(rect, view, recyclerView, wVar);
            rect.left = this.f1950d;
            rect.right = this.f1951e;
        }
    }

    /* renamed from: cn1.e1$b */
    public final class C0829b {

        /* renamed from: a */
        public WxRecyclerView f1952a;

        /* renamed from: b */
        public C15829e0.C15830a f1953b;

        /* renamed from: c */
        public RecyclerView.C0130p f1954c;

        /* renamed from: d */
        public C62381d f1955d;

        /* renamed from: e */
        public Application.ActivityLifecycleCallbacks f1956e;

        public C0829b(C0827e1 e1Var) {
        }
    }

    /* renamed from: cn1.e1$c */
    public static final class C0830c extends C9499g<C9493c> {

        /* renamed from: a */
        public final /* synthetic */ C60905o f1957a;

        /* renamed from: b */
        public final /* synthetic */ C0827e1 f1958b;

        public C0830c(C60905o oVar, C0827e1 e1Var) {
            this.f1957a = oVar;
            this.f1958b = e1Var;
        }

        /* renamed from: b */
        public void mo752b(Set<C9494d<C9493c>> set) {
            Iterator<T> it;
            Context context;
            String str;
            C39818r rVar;
            Context context2;
            Long l;
            String num;
            String num2;
            C49114d91 d912;
            C49098d51 d512;
            FinderItem o;
            C64273c21 liveInfo;
            C48682a91 a912;
            String str2;
            C48682a91 a913;
            C87412m.m108594g(set, "recordsSet");
            Log.m105924i("Finder.SpecialColumnListConvert", "onExposeTimeRecorded: size = " + set.size());
            C0827e1 e1Var = this.f1958b;
            Iterator<T> it4 = set.iterator();
            while (it4.hasNext()) {
                C9494d dVar = (C9494d) it4.next();
                e1Var.getClass();
                Class cls = C13442s8.class;
                C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD;
                C104289g gVar = new C104289g();
                View view = dVar.f29668f;
                if (!(view == null || (context = view.getContext()) == null)) {
                    C39818r rVar2 = C39818r.f106831a;
                    C10584f fVar = (C10584f) rVar2.mo62443b(context).mo75002a(C10584f.class);
                    if (fVar != null) {
                        T t = dVar.f29663a;
                        boolean z = t instanceof C0096i;
                        it = it4;
                        C54067f0.C54078q qVar2 = qVar;
                        if (z) {
                            C0096i iVar = z ? (C0096i) t : null;
                            if (iVar == null || (a913 = iVar.f535e) == null || (str2 = a913.f130379f) == null) {
                                str2 = "";
                            }
                            gVar.mo145967r("page_index", fVar.f31925g.get(str2));
                            gVar.mo145967r("column_id", str2);
                            C16052a aVar = e1Var.f1949j;
                            String d = aVar != null ? aVar.mo14668d(dVar.f29667e, dVar.f29668f, "onExpose") : null;
                            C49712hj1 hj12 = e1Var.f1948i;
                            String str3 = hj12 != null ? hj12.f134671e : null;
                            String gVar2 = gVar.toString();
                            C87412m.m108593f(gVar2, "eldUdfKv.toString()");
                            fVar.mo10841c3(d, str3, "main_page_column_more", C112551y.m153814n(gVar2, ",", ";", false));
                        } else {
                            C0331b bVar = t instanceof C0331b ? (C0331b) t : null;
                            if (bVar == null || (a912 = bVar.f903d) == null || (str = a912.f130379f) == null) {
                                str = "";
                            }
                            boolean z2 = true;
                            int i = t instanceof C0101n ? 2 : 1;
                            gVar.mo145967r("page_index", fVar.f31925g.get(str));
                            gVar.mo145967r("column_id", str);
                            gVar.mo145967r("card_type", Integer.valueOf(i));
                            gVar.mo145967r("card_index", Integer.valueOf(dVar.f29667e));
                            T t2 = dVar.f29663a;
                            C0331b bVar2 = t2 instanceof C0331b ? (C0331b) t2 : null;
                            if (bVar2 == null || (o = bVar2.mo3513o()) == null || (liveInfo = o.getLiveInfo()) == null) {
                                context2 = context;
                                rVar = rVar2;
                                l = "";
                            } else {
                                context2 = context;
                                rVar = rVar2;
                                l = Long.valueOf(liveInfo.f182392d);
                            }
                            gVar.mo145967r("liveid", l);
                            T t3 = dVar.f29663a;
                            C0101n nVar = t3 instanceof C0101n ? (C0101n) t3 : null;
                            gVar.mo145967r("Noticeid", (nVar == null || (d912 = nVar.f541d) == null || (d512 = d912.f132196d) == null) ? null : d512.f132122h);
                            C16052a aVar2 = e1Var.f1949j;
                            String d2 = aVar2 != null ? aVar2.mo14668d(dVar.f29667e, dVar.f29668f, "onExpose") : null;
                            C49712hj1 hj13 = e1Var.f1948i;
                            String str4 = hj13 != null ? hj13.f134671e : null;
                            String gVar3 = gVar.toString();
                            C87412m.m108593f(gVar3, "eldUdfKv.toString()");
                            fVar.mo10841c3(d2, str4, "main_page_column_card", C112551y.m153814n(gVar3, ",", ";", false));
                            C104289g gVar4 = new C104289g();
                            gVar4.mo145967r("main_page_position", 3);
                            gVar4.mo145967r("column_id", str);
                            if (fVar.f31930o != 0) {
                                String str5 = fVar.f31931p;
                                if (!(str5 == null || str5.length() == 0)) {
                                    z2 = false;
                                }
                                if (!z2) {
                                    gVar4.mo145967r("pull_liveid", Long.valueOf(fVar.f31930o));
                                    gVar4.mo145967r("pull_commentsence", fVar.f31931p);
                                }
                            }
                            T t4 = dVar.f29663a;
                            boolean z3 = t4 instanceof C0101n;
                            if (z3) {
                                C0101n nVar2 = z3 ? (C0101n) t4 : null;
                                if (nVar2 != null) {
                                    C54059a aVar3 = e1Var.f1947h;
                                    int i2 = dVar.f29667e;
                                    C13442s8 s8Var = (C13442s8) rVar.mo62443b(context2).mo75002a(cls);
                                    String str6 = (s8Var == null || (num2 = Integer.valueOf(s8Var.f38096i).toString()) == null) ? "" : num2;
                                    String gVar5 = gVar4.toString();
                                    C87412m.m108593f(gVar5, "chnlExtra.toString()");
                                    aVar3.mo74735d(nVar2, i2, qVar2, str6, "", gVar5);
                                }
                            } else {
                                C0331b bVar3 = t4 instanceof C0331b ? (C0331b) t4 : null;
                                if (bVar3 != null) {
                                    C54059a aVar4 = e1Var.f1947h;
                                    int i3 = dVar.f29667e;
                                    C13442s8 s8Var2 = (C13442s8) rVar.mo62443b(context2).mo75002a(cls);
                                    String str7 = (s8Var2 == null || (num = Integer.valueOf(s8Var2.f38096i).toString()) == null) ? "" : num;
                                    String gVar6 = gVar4.toString();
                                    C87412m.m108593f(gVar6, "chnlExtra.toString()");
                                    aVar4.mo74735d(bVar3, i3, qVar2, str7, "", gVar6);
                                }
                            }
                        }
                        Set<C9494d<C9493c>> set2 = set;
                        it4 = it;
                    }
                }
                it = it4;
                Set<C9494d<C9493c>> set22 = set;
                it4 = it;
            }
            C15826d dVar2 = C15826d.f42633a;
            Context context3 = this.f1957a.f44854d.getContext();
            C87412m.m108593f(context3, "holder.itemView.context");
            dVar2.mo14505a(context3, set);
        }

        /* renamed from: c */
        public void mo753c(C9494d<C9493c> dVar) {
            C87412m.m108594g(dVar, "item");
        }
    }

    /* renamed from: cn1.e1$d */
    public static final class C0831d extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C0831d f1959d = new C0831d();

        public C0831d() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, "view");
            Context context = view.getContext();
            if (!(context instanceof MMActivity) || ((MMActivity) context).isPaused()) {
                return Boolean.FALSE;
            }
            C10934a aVar = C10934a.f32583a;
            boolean z = false;
            boolean z2 = !aVar.mo11134c(0, view, 0.5f);
            boolean z3 = !aVar.mo11134c(1, view, 0.5f);
            if (z2 && z3) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public C0827e1(C15829e0 e0Var, C15828e eVar, C49712hj1 hj12) {
        C87412m.m108594g(e0Var, "outsideEventListener");
        C87412m.m108594g(eVar, "outsideOperator");
        C87412m.m108594g(hj12, "contextObj");
        this.f1944e = e0Var;
        this.f1945f = eVar;
        this.f1946g = hj12;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cni;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02bf  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r24, jq3.C9493c r25, int r26, int r27, boolean r28, java.util.List r29) {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            r8 = r25
            an1.p r8 = (an1.C0103p) r8
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            java.lang.String r2 = "holder"
            gy3.C87412m.m108594g(r7, r2)
            java.lang.String r2 = "item"
            gy3.C87412m.m108594g(r8, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#onBindViewHolder holder="
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " position="
            r2.append(r3)
            r3 = r26
            r2.append(r3)
            java.lang.String r3 = " name="
            r2.append(r3)
            te3.a91 r3 = r8.f545d
            java.lang.String r3 = r3.f130379f
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Finder.SpecialColumnListConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            r23.mo755j(r24)
            cn1.e1$b r9 = new cn1.e1$b
            r9.<init>(r6)
            r2 = 2131312695(0x7f094037, float:1.8243766E38)
            android.view.View r2 = r7.mo85812D(r2)
            r12 = r2
            com.tencent.mm.view.recyclerview.WxRecyclerView r12 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r12
            r9.f1952a = r12
            te3.a91 r2 = r8.f545d
            java.lang.String r2 = r2.f130380g
            r3 = 0
            r10 = 1
            if (r2 == 0) goto L_0x006b
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0066
            r2 = 1
            goto L_0x0067
        L_0x0066:
            r2 = 0
        L_0x0067:
            if (r2 != r10) goto L_0x006b
            r2 = 1
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            r4 = 2131306810(0x7f09293a, float:1.823183E38)
            r5 = 2131306811(0x7f09293b, float:1.8231832E38)
            r11 = 8
            if (r2 == 0) goto L_0x00ca
            android.view.View r2 = r7.mo85812D(r4)
            if (r2 != 0) goto L_0x007d
            goto L_0x00bd
        L_0x007d:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            r4.mo10233c(r13)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert"
            java.lang.String r16 = "onBindViewHolder"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/SpecialColumnListConvertData;IIZLjava/util/List;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert"
            java.lang.String r15 = "onBindViewHolder"
            java.lang.String r16 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/SpecialColumnListConvertData;IIZLjava/util/List;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x00bd:
            android.view.View r2 = r7.mo85812D(r5)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 != 0) goto L_0x00c6
            goto L_0x011d
        L_0x00c6:
            r2.setVisibility(r11)
            goto L_0x011d
        L_0x00ca:
            android.view.View r2 = r7.mo85812D(r4)
            if (r2 != 0) goto L_0x00d1
            goto L_0x0111
        L_0x00d1:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r4.mo10233c(r13)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert"
            java.lang.String r16 = "onBindViewHolder"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/SpecialColumnListConvertData;IIZLjava/util/List;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert"
            java.lang.String r15 = "onBindViewHolder"
            java.lang.String r16 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/SpecialColumnListConvertData;IIZLjava/util/List;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x0111:
            android.view.View r2 = r7.mo85812D(r5)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 != 0) goto L_0x011a
            goto L_0x011d
        L_0x011a:
            r2.setVisibility(r3)
        L_0x011d:
            android.view.View r2 = r7.mo85812D(r5)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r15 = 0
            if (r2 == 0) goto L_0x0164
            te3.a91 r4 = r8.f545d
            java.lang.String r4 = r4.f130380g
            if (r4 == 0) goto L_0x0164
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x0134
            r5 = 1
            goto L_0x0135
        L_0x0134:
            r5 = 0
        L_0x0135:
            if (r5 == 0) goto L_0x0138
            goto L_0x0139
        L_0x0138:
            r4 = r15
        L_0x0139:
            if (r4 == 0) goto L_0x0164
            bl3.r r5 = bl3.C39818r.f106831a
            bl3.r$a r13 = r5.mo62446e(r1)
            bl3.c r13 = r13.mo62447c(r0)
            pl1.s0 r13 = (pl1.C11990s0) r13
            k60.d r13 = r13.mo11872i2()
            pl1.f r14 = new pl1.f
            r3 = 2
            r14.<init>(r4, r15, r3, r15)
            pl1.e0$a r3 = pl1.C11978e0.C11979a.DEFAULT
            bl3.r$a r1 = r5.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r3)
            r13.mo85957c(r14, r2, r0)
        L_0x0164:
            r0 = 2131306766(0x7f09290e, float:1.823174E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131306219(0x7f0926eb, float:1.823063E38)
            android.view.View r1 = r7.mo85812D(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            te3.a91 r2 = r8.f545d
            te3.x91 r2 = r2.f130386p
            if (r2 == 0) goto L_0x017f
            int r2 = r2.f144531d
            goto L_0x0180
        L_0x017f:
            r2 = 0
        L_0x0180:
            if (r2 <= 0) goto L_0x01a2
            cn1.f1 r2 = new cn1.f1
            r2.<init>(r7, r6, r8)
            int r3 = r0.getVisibility()
            if (r3 != r11) goto L_0x0194
            te3.a91 r3 = r8.f545d
            int r3 = r3.f130377d
            r6.mo756k(r7, r3, r10)
        L_0x0194:
            r3 = 0
            r0.setVisibility(r3)
            r1.setVisibility(r3)
            r0.setOnClickListener(r2)
            r1.setOnClickListener(r2)
            goto L_0x01a8
        L_0x01a2:
            r0.setVisibility(r11)
            r1.setVisibility(r11)
        L_0x01a8:
            r0 = 2131306809(0x7f092939, float:1.8231828E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x01ba
            te3.a91 r1 = r8.f545d
            java.lang.String r1 = r1.f130379f
            r0.setText(r1)
        L_0x01ba:
            zm1.h r2 = new zm1.h
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.SpecialColumnItemConvertFactory r0 = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.SpecialColumnItemConvertFactory
            android.content.Context r1 = r7.f173499A
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r1, r3)
            r17 = r1
            com.tencent.mm.ui.MMActivity r17 = (com.tencent.p014mm.p136ui.MMActivity) r17
            r18 = 0
            r19 = 0
            r20 = 0
            xm1.e r1 = r6.f1945f
            te3.hj1 r3 = r6.f1946g
            r16 = r0
            r21 = r1
            r22 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22)
            java.util.ArrayList<cm1.i2> r1 = r8.f546e
            r2.<init>(r0, r1)
            cn1.j1 r0 = new cn1.j1
            r0.<init>(r8, r6, r12)
            r2.f173488o = r0
            cn1.l1 r0 = new cn1.l1
            r0.<init>(r8, r6)
            r2.f173487n = r0
            if (r12 != 0) goto L_0x01f2
            goto L_0x01f5
        L_0x01f2:
            r12.setAdapter(r2)
        L_0x01f5:
            if (r12 != 0) goto L_0x01f9
            r1 = 0
            goto L_0x0202
        L_0x01f9:
            com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager r0 = new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager
            r1 = 0
            r0.<init>(r10, r1)
            r12.setLayoutManager(r0)
        L_0x0202:
            int r0 = r12.getItemDecorationCount()
            if (r0 != 0) goto L_0x021a
            cn1.e1$a r0 = new cn1.e1$a
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r4 = 12
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r4)
            r0.<init>(r3, r1)
            r12.mo17085h0(r0)
        L_0x021a:
            java.util.ArrayList<cm1.i2> r0 = r8.f546e
            te3.a91 r1 = r8.f545d
            int r1 = r1.f130382i
            java.lang.String r3 = "feeds"
            gy3.C87412m.m108594g(r0, r3)
            if (r1 > 0) goto L_0x0228
            goto L_0x0249
        L_0x0228:
            java.lang.Class<an1.l> r1 = an1.C0099l.class
            java.util.List r1 = sx3.C13798c0.m13102z(r0, r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r10
            if (r1 == 0) goto L_0x0238
            goto L_0x0249
        L_0x0238:
            an1.l r1 = new an1.l
            r1.<init>()
            r0.add(r1)
            int r0 = r0.size()
            int r0 = r0 + -1
            r2.notifyItemInserted(r0)
        L_0x0249:
            cn1.g1 r0 = new cn1.g1
            r0.<init>(r8, r6)
            r12.mo17043c(r0)
            r9.f1954c = r0
            cn1.h1 r11 = new cn1.h1
            r0 = r11
            r1 = r8
            r3 = r23
            r4 = r9
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            xm1.e0 r0 = r6.f1944e
            java.util.List<xm1.e0$a> r0 = r0.f42636a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r11)
            r9.f1953b = r11
            pm1.d r0 = new pm1.d
            android.content.Context r11 = r7.f173499A
            java.lang.String r1 = "holder.context"
            gy3.C87412m.m108593f(r11, r1)
            java.util.ArrayList<cm1.i2> r13 = r8.f546e
            r14 = 0
            r1 = 0
            r16 = 1
            r17 = 0
            java.lang.Class<ir.n> r2 = p565ir.C60606n.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ir.n r2 = (p565ir.C60606n) r2
            boolean r2 = r2.mo85009IS()
            r18 = r2 ^ 1
            r19 = 0
            r20 = 256(0x100, float:3.59E-43)
            r21 = 0
            r10 = r0
            r2 = r15
            r15 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r9.f1955d = r0
            qm1.c r1 = new qm1.c
            java.util.ArrayList<cm1.i2> r3 = r8.f546e
            r1.<init>(r3)
            r0.mo87429h(r1)
            pm1.d r0 = r9.f1955d
            if (r0 == 0) goto L_0x02a7
            r0.mo11215b()
        L_0x02a7:
            cn1.i1 r0 = new cn1.i1
            r0.<init>(r7, r9, r6)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r1 = r1.getApplicationContext()
            boolean r3 = r1 instanceof android.app.Application
            if (r3 == 0) goto L_0x02bc
            r15 = r1
            android.app.Application r15 = (android.app.Application) r15
            goto L_0x02bd
        L_0x02bc:
            r15 = r2
        L_0x02bd:
            if (r15 == 0) goto L_0x02c2
            r15.registerActivityLifecycleCallbacks(r0)
        L_0x02c2:
            r9.f1956e = r0
            r7.f173502D = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn1.C0827e1.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        C39818r rVar = C39818r.f106831a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        C49712hj1 q3 = ((C13442s8) rVar.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3();
        Context context2 = oVar.f173499A;
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f1949j = new C16052a(q3, (MMActivity) context2, (Fragment) null, 0, this.f1945f);
        this.f1948i = q3;
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
        }
        WxRecyclerView wxRecyclerView = (WxRecyclerView) oVar.mo85812D(C0966R.C0970id.m_t);
        if (wxRecyclerView != null) {
            C9496f.m9181b(wxRecyclerView, new C0830c(oVar, this), C0831d.f1959d);
        }
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("Finder.SpecialColumnListConvert", "#onViewRecycled holder=" + oVar);
        mo755j(oVar);
    }

    /* renamed from: j */
    public final void mo755j(C60905o oVar) {
        WxRecyclerView wxRecyclerView;
        Object obj = oVar.f173502D;
        if (obj != null && (obj instanceof C0829b)) {
            C0829b bVar = (C0829b) obj;
            WxRecyclerView wxRecyclerView2 = bVar.f1952a;
            if (wxRecyclerView2 != null) {
                Context context = oVar.f173499A;
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                wxRecyclerView2.setAdapter(new C16304h(new SpecialColumnItemConvertFactory((MMActivity) context, false, false, 0, this.f1945f, this.f1946g), new ArrayList()));
            }
            C15829e0.C15830a aVar = bVar.f1953b;
            if (aVar != null) {
                ((ArrayList) this.f1944e.f42636a).remove(aVar);
            }
            RecyclerView.C0130p pVar = bVar.f1954c;
            if (!(pVar == null || (wxRecyclerView = bVar.f1952a) == null)) {
                wxRecyclerView.mo17098m1(pVar);
            }
            C62381d dVar = bVar.f1955d;
            if (dVar != null) {
                dVar.detach();
            }
            bVar.f1955d = null;
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = bVar.f1956e;
            if (activityLifecycleCallbacks != null) {
                Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            }
        }
        oVar.f173502D = null;
    }

    /* renamed from: k */
    public final void mo756k(C60905o oVar, int i, boolean z) {
        Context context = oVar.f173499A;
        MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
        if (mMActivity != null) {
            C39818r rVar = C39818r.f106831a;
            C49712hj1 q3 = ((C13442s8) rVar.mo62444c(mMActivity).mo75002a(C13442s8.class)).mo12861q3();
            C39622i0 a = rVar.mo62444c(mMActivity).mo75002a(C10584f.class);
            C87412m.m108593f(a, "UICProvider.of(it).get(N…eReporterUIC::class.java)");
            C10584f fVar = (C10584f) a;
            C104289g gVar = new C104289g();
            gVar.mo145967r("column_id", Integer.valueOf(i));
            Log.m105924i("Finder.SpecialColumnListConvert", "moreIconReport columnId: " + i + " isExpose: " + z);
            if (z) {
                String str = q3.f134671e;
                String gVar2 = gVar.toString();
                C87412m.m108593f(gVar2, "eldUdfKv.toString()");
                fVar.mo10841c3("", str, "main_page_column_right_more", C112551y.m153814n(gVar2, ",", ";", false));
                return;
            }
            String str2 = q3.f134671e;
            String gVar3 = gVar.toString();
            C87412m.m108593f(gVar3, "eldUdfKv.toString()");
            fVar.mo10842d3(str2, "main_page_column_right_more", C112551y.m153814n(gVar3, ",", ";", false));
        }
    }
}
