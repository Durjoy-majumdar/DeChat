package qo3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.base.CustomScrollView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import k20.C9557b;
import nj3.C11182m0;
import nj3.C11183n0;
import nj3.C11184p0;
import nj3.C47268j0;
import nj3.C47269o0;
import nj3.C61772i0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76877g0;
import nj3.C76878h0;
import nj3.C76900r0;

/* renamed from: qo3.n */
public class C77407n implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: A */
    public C76878h0 f225719A;

    /* renamed from: A1 */
    public C76878h0 f225720A1;

    /* renamed from: B */
    public C76878h0 f225721B;

    /* renamed from: B1 */
    public C76877g0 f225722B1;

    /* renamed from: C */
    public C76877g0 f225723C;

    /* renamed from: C1 */
    public C76900r0 f225724C1;

    /* renamed from: D */
    public C47268j0 f225725D;

    /* renamed from: D1 */
    public boolean f225726D1;

    /* renamed from: E */
    public C47268j0 f225727E;

    /* renamed from: F */
    public C61772i0 f225728F;

    /* renamed from: G */
    public C76874e0 f225729G;

    /* renamed from: H */
    public C76874e0 f225730H;

    /* renamed from: I */
    public C76874e0 f225731I;

    /* renamed from: J */
    public C76874e0 f225732J;

    /* renamed from: K */
    public C76874e0 f225733K;

    /* renamed from: L */
    public C76874e0 f225734L;

    /* renamed from: M */
    public View f225735M;

    /* renamed from: N */
    public Boolean f225736N;

    /* renamed from: P */
    public LinearLayout f225737P;

    /* renamed from: Q */
    public LinearLayout f225738Q;

    /* renamed from: Q0 */
    public boolean f225739Q0;

    /* renamed from: R */
    public LinearLayout f225740R;

    /* renamed from: R0 */
    public boolean f225741R0;

    /* renamed from: S */
    public LinearLayout f225742S;

    /* renamed from: S0 */
    public ViewStub f225743S0;

    /* renamed from: T */
    public CustomScrollView f225744T;

    /* renamed from: T0 */
    public ViewGroup f225745T0;

    /* renamed from: U */
    public View f225746U;

    /* renamed from: U0 */
    public TextView f225747U0;

    /* renamed from: V */
    public View f225748V;

    /* renamed from: V0 */
    public RecyclerView f225749V0;

    /* renamed from: W */
    public TextView f225750W;

    /* renamed from: W0 */
    public RecyclerView f225751W0;

    /* renamed from: X */
    public TextView f225752X;

    /* renamed from: X0 */
    public RecyclerView f225753X0;

    /* renamed from: Y */
    public C77423u f225754Y;

    /* renamed from: Y0 */
    public boolean f225755Y0;

    /* renamed from: Z */
    public C77423u f225756Z;

    /* renamed from: Z0 */
    public int f225757Z0;

    /* renamed from: a1 */
    public View f225758a1;

    /* renamed from: b1 */
    public ViewTreeObserver f225759b1;

    /* renamed from: c1 */
    public ImageView f225760c1;

    /* renamed from: d */
    public C47880p f225761d;

    /* renamed from: d1 */
    public ImageView f225762d1;

    /* renamed from: e */
    public C77419q f225763e;

    /* renamed from: e1 */
    public ImageView f225764e1;

    /* renamed from: f */
    public C77420r f225765f;

    /* renamed from: f1 */
    public ImageView f225766f1;

    /* renamed from: g */
    public Dialog f225767g;

    /* renamed from: g1 */
    public TextView f225768g1;

    /* renamed from: h */
    public Context f225769h;

    /* renamed from: h1 */
    public int f225770h1;

    /* renamed from: i */
    public C11182m0 f225771i;

    /* renamed from: i1 */
    public boolean f225772i1;

    /* renamed from: j */
    public C11182m0 f225773j;

    /* renamed from: j1 */
    public boolean f225774j1;

    /* renamed from: k1 */
    public boolean f225775k1;

    /* renamed from: l1 */
    public boolean f225776l1;

    /* renamed from: m1 */
    public boolean f225777m1;

    /* renamed from: n */
    public C11182m0 f225778n;

    /* renamed from: n1 */
    public boolean f225779n1;

    /* renamed from: o */
    public C11182m0 f225780o;

    /* renamed from: o1 */
    public boolean f225781o1;

    /* renamed from: p */
    public C11184p0 f225782p;

    /* renamed from: p0 */
    public C77423u f225783p0;

    /* renamed from: p1 */
    public boolean f225784p1;

    /* renamed from: q */
    public C11184p0 f225785q;

    /* renamed from: q1 */
    public int f225786q1;

    /* renamed from: r */
    public C11184p0 f225787r;

    /* renamed from: r1 */
    public boolean f225788r1;

    /* renamed from: s */
    public C11184p0 f225789s;

    /* renamed from: s1 */
    public int f225790s1;

    /* renamed from: t */
    public C47269o0 f225791t;

    /* renamed from: t1 */
    public boolean f225792t1;

    /* renamed from: u */
    public C11184p0 f225793u;

    /* renamed from: u1 */
    public boolean f225794u1;

    /* renamed from: v */
    public C11183n0 f225795v;

    /* renamed from: v1 */
    public RecyclerView.C16634v f225796v1;

    /* renamed from: w */
    public C77422t f225797w;

    /* renamed from: w1 */
    public boolean f225798w1;

    /* renamed from: x */
    public C77422t f225799x;

    /* renamed from: x0 */
    public boolean f225800x0;

    /* renamed from: x1 */
    public boolean f225801x1;

    /* renamed from: y */
    public C12924o f225802y;

    /* renamed from: y0 */
    public boolean f225803y0;

    /* renamed from: y1 */
    public boolean f225804y1;

    /* renamed from: z */
    public C76878h0 f225805z;

    /* renamed from: z1 */
    public String f225806z1;

    /* renamed from: qo3.n$g */
    public class C12921g implements View.OnClickListener {
        public C12921g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77407n.this.mo107572p();
            C12924o oVar = C77407n.this.f225802y;
            if (oVar != null) {
                oVar.mo2362a();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.n$h */
    public class C12922h implements CustomScrollView.C57659a {
        public C12922h() {
        }

        /* renamed from: a */
        public void mo12459a(ScrollView scrollView, int i, int i2, int i3, int i4) {
            C9557b bVar = new C9557b();
            bVar.mo10236c(scrollView);
            bVar.mo10235b(i);
            bVar.mo10235b(i2);
            bVar.mo10235b(i3);
            bVar.mo10235b(i4);
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$2", "com/tencent/mm/ui/base/CustomScrollView$OnScrollChangeListener", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V", this, bVar.mo10234a());
            if (scrollView.getChildAt(0).getMeasuredHeight() - (scrollView.getHeight() + scrollView.getScrollY()) < 50) {
                View view = C77407n.this.f225746U;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/widget/dialog/MMBottomSheet$2", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$2", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view3 = C77407n.this.f225746U;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/widget/dialog/MMBottomSheet$2", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$2", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$2", "com/tencent/mm/ui/base/CustomScrollView$OnScrollChangeListener", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V");
        }
    }

    /* renamed from: qo3.n$n */
    public class C12923n implements View.OnClickListener {
        public C12923n(int i) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77407n.this.getClass();
            C77407n nVar = C77407n.this;
            if (!nVar.f225775k1) {
                nVar.mo107572p();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.n$o */
    public interface C12924o {
        /* renamed from: a */
        void mo2362a();
    }

    /* renamed from: qo3.n$p */
    public interface C47880p {
        void onDismiss();
    }

    /* renamed from: qo3.n$a */
    public class C77408a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f225807d;

        public C77408a(int i) {
            this.f225807d = i;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77407n nVar = C77407n.this;
            if (nVar.f225793u != null && this.f225807d < nVar.f225734L.size()) {
                C77407n nVar2 = C77407n.this;
                nVar2.f225793u.onMMMenuItemSelected(nVar2.f225734L.getItem(this.f225807d), this.f225807d);
            }
            C77407n nVar3 = C77407n.this;
            if (!nVar3.f225775k1) {
                nVar3.mo107572p();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qo3.n$b */
    public class C77409b implements DialogInterface.OnDismissListener {
        public C77409b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C77407n nVar = C77407n.this;
            C47880p pVar = nVar.f225761d;
            if (pVar != null && !nVar.f225777m1) {
                pVar.onDismiss();
            }
            Dialog dialog = C77407n.this.f225767g;
            if (dialog != null) {
                C89778c.m112244b(dialog);
            }
        }
    }

    /* renamed from: qo3.n$c */
    public class C77410c implements DialogInterface.OnShowListener {
        public C77410c() {
        }

        public void onShow(DialogInterface dialogInterface) {
            RecyclerView recyclerView;
            C77407n nVar = C77407n.this;
            C77419q qVar = nVar.f225763e;
            if (qVar != null && !nVar.f225777m1) {
                qVar.onShow();
            }
            C77407n nVar2 = C77407n.this;
            if (nVar2.f225765f != null && !nVar2.f225777m1 && (recyclerView = nVar2.f225749V0) != null && recyclerView.getVisibility() == 0) {
                C77407n.this.f225765f.onShow();
            }
        }
    }

    /* renamed from: qo3.n$d */
    public class C77411d implements DialogInterface.OnShowListener {
        public C77411d() {
        }

        public void onShow(DialogInterface dialogInterface) {
            RecyclerView recyclerView;
            C77407n nVar = C77407n.this;
            C77419q qVar = nVar.f225763e;
            if (qVar != null && !nVar.f225777m1) {
                qVar.onShow();
            }
            C77407n nVar2 = C77407n.this;
            if (nVar2.f225765f != null && !nVar2.f225777m1 && (recyclerView = nVar2.f225749V0) != null && recyclerView.getVisibility() == 0) {
                C77407n.this.f225765f.onShow();
            }
        }
    }

    /* renamed from: qo3.n$e */
    public class C77412e implements DialogInterface.OnDismissListener {
        public C77412e() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C77407n nVar = C77407n.this;
            if (!nVar.f225777m1) {
                nVar.f225761d.onDismiss();
            }
        }
    }

    /* renamed from: qo3.n$f */
    public class C77413f implements DialogInterface.OnDismissListener {
        public C77413f() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            ViewTreeObserver viewTreeObserver = C77407n.this.f225759b1;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C77407n nVar = C77407n.this;
                    nVar.f225759b1 = nVar.f225758a1.getViewTreeObserver();
                }
                C77407n nVar2 = C77407n.this;
                nVar2.f225759b1.removeGlobalOnLayoutListener(nVar2);
                C77407n.this.f225759b1 = null;
            }
            C77407n nVar3 = C77407n.this;
            if (!nVar3.f225776l1) {
                nVar3.f225767g = null;
            }
        }
    }

    /* renamed from: qo3.n$i */
    public class C77414i implements AdapterView.OnItemClickListener {
        public C77414i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            if (i < C77407n.this.f225729G.size()) {
                C76875f0 f0Var = (C76875f0) ((ArrayList) C77407n.this.f225729G.f224704d).get(i);
                if (f0Var == null || f0Var.f224722q) {
                    C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
                C11184p0 p0Var = C77407n.this.f225782p;
                if (p0Var != null) {
                    p0Var.onMMMenuItemSelected(f0Var, i);
                } else {
                    f0Var.mo107177c();
                }
            } else if (C77407n.this.f225730H.size() <= 0 || i >= C77407n.this.f225729G.size() + C77407n.this.f225730H.size()) {
                C77407n nVar = C77407n.this;
                if (!nVar.f225804y1) {
                    C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
                nVar.f225797w.mo25383a();
                C77422t tVar = nVar.f225799x;
                if (tVar != null) {
                    tVar.mo25383a();
                }
            } else {
                C77407n nVar2 = C77407n.this;
                C76875f0 f0Var2 = (C76875f0) nVar2.f225730H.getItem(i - nVar2.f225729G.size());
                if (f0Var2 == null || f0Var2.f224722q) {
                    C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
                C11184p0 p0Var2 = C77407n.this.f225785q;
                if (p0Var2 != null) {
                    p0Var2.onMMMenuItemSelected(f0Var2, i);
                } else {
                    f0Var2.mo107177c();
                }
            }
            C77407n nVar3 = C77407n.this;
            if (!nVar3.f225775k1) {
                nVar3.mo107572p();
            }
            C77407n nVar4 = C77407n.this;
            nVar4.f225777m1 = true;
            nVar4.f225786q1 = i;
            nVar4.f225754Y.notifyDataSetChanged();
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: qo3.n$j */
    public class C77415j implements AdapterView.OnItemClickListener {
        public C77415j() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0064, code lost:
            r8 = r7.f225815d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                r0.add(r9)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
                r0.add(r8)
                java.lang.Long r8 = java.lang.Long.valueOf(r11)
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/ui/widget/dialog/MMBottomSheet$4"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                qo3.n r8 = qo3.C77407n.this
                nj3.e0 r8 = r8.f225731I
                int r8 = r8.size()
                java.lang.String r9 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                java.lang.String r11 = "onItemClick"
                java.lang.String r12 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r0 = "com/tencent/mm/ui/widget/dialog/MMBottomSheet$4"
                if (r10 < r8) goto L_0x0042
                j20.C117292a.m165361g(r7, r0, r12, r11, r9)
                return
            L_0x0042:
                qo3.n r8 = qo3.C77407n.this
                nj3.e0 r8 = r8.f225731I
                java.util.List<android.view.MenuItem> r8 = r8.f224704d
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                java.lang.Object r8 = r8.get(r10)
                nj3.f0 r8 = (nj3.C76875f0) r8
                if (r8 == 0) goto L_0x005a
                boolean r8 = r8.f224722q
                if (r8 == 0) goto L_0x005a
                j20.C117292a.m165361g(r7, r0, r12, r11, r9)
                return
            L_0x005a:
                qo3.n r8 = qo3.C77407n.this
                nj3.e0 r8 = r8.f225731I
                int r8 = r8.size()
                if (r10 >= r8) goto L_0x0073
                qo3.n r8 = qo3.C77407n.this
                nj3.p0 r1 = r8.f225787r
                if (r1 == 0) goto L_0x0073
                nj3.e0 r8 = r8.f225731I
                android.view.MenuItem r8 = r8.getItem(r10)
                r1.onMMMenuItemSelected(r8, r10)
            L_0x0073:
                qo3.n r8 = qo3.C77407n.this
                boolean r10 = r8.f225775k1
                if (r10 != 0) goto L_0x007c
                r8.mo107572p()
            L_0x007c:
                qo3.n r8 = qo3.C77407n.this
                r10 = 1
                r8.f225777m1 = r10
                qo3.n$u r8 = r8.f225756Z
                r8.notifyDataSetChanged()
                j20.C117292a.m165361g(r7, r0, r12, r11, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qo3.C77407n.C77415j.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: qo3.n$k */
    public class C77416k implements DialogInterface.OnDismissListener {
        public C77416k() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            ViewTreeObserver viewTreeObserver = C77407n.this.f225759b1;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C77407n nVar = C77407n.this;
                    nVar.f225759b1 = nVar.f225758a1.getViewTreeObserver();
                }
                C77407n nVar2 = C77407n.this;
                nVar2.f225759b1.removeGlobalOnLayoutListener(nVar2);
                C77407n.this.f225759b1 = null;
            }
            Dialog dialog = C77407n.this.f225767g;
            if (dialog != null) {
                C89778c.m112244b(dialog);
            }
            C77407n nVar3 = C77407n.this;
            if (!nVar3.f225776l1) {
                nVar3.f225767g = null;
            }
        }
    }

    /* renamed from: qo3.n$l */
    public class C77417l implements AdapterView.OnItemClickListener {
        public C77417l() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0064, code lost:
            r8 = r7.f225817d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                r0.add(r9)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
                r0.add(r8)
                java.lang.Long r8 = java.lang.Long.valueOf(r11)
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/ui/widget/dialog/MMBottomSheet$6"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                qo3.n r8 = qo3.C77407n.this
                nj3.e0 r8 = r8.f225732J
                int r8 = r8.size()
                java.lang.String r9 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                java.lang.String r11 = "onItemClick"
                java.lang.String r12 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r0 = "com/tencent/mm/ui/widget/dialog/MMBottomSheet$6"
                if (r10 < r8) goto L_0x0042
                j20.C117292a.m165361g(r7, r0, r12, r11, r9)
                return
            L_0x0042:
                qo3.n r8 = qo3.C77407n.this
                nj3.e0 r8 = r8.f225732J
                java.util.List<android.view.MenuItem> r8 = r8.f224704d
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                java.lang.Object r8 = r8.get(r10)
                nj3.f0 r8 = (nj3.C76875f0) r8
                if (r8 == 0) goto L_0x005a
                boolean r8 = r8.f224722q
                if (r8 == 0) goto L_0x005a
                j20.C117292a.m165361g(r7, r0, r12, r11, r9)
                return
            L_0x005a:
                qo3.n r8 = qo3.C77407n.this
                nj3.e0 r8 = r8.f225732J
                int r8 = r8.size()
                if (r10 >= r8) goto L_0x0073
                qo3.n r8 = qo3.C77407n.this
                nj3.p0 r1 = r8.f225789s
                if (r1 == 0) goto L_0x0073
                nj3.e0 r8 = r8.f225732J
                android.view.MenuItem r8 = r8.getItem(r10)
                r1.onMMMenuItemSelected(r8, r10)
            L_0x0073:
                qo3.n r8 = qo3.C77407n.this
                boolean r10 = r8.f225775k1
                if (r10 != 0) goto L_0x007c
                r8.mo107572p()
            L_0x007c:
                qo3.n r8 = qo3.C77407n.this
                r10 = 1
                r8.f225777m1 = r10
                qo3.n$u r8 = r8.f225783p0
                r8.notifyDataSetChanged()
                j20.C117292a.m165361g(r7, r0, r12, r11, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qo3.C77407n.C77417l.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: qo3.n$m */
    public class C77418m implements AdapterView.OnItemLongClickListener {
        public C77418m() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
            r1 = r0.f225818d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onItemLongClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            /*
                r0 = this;
                qo3.n r1 = qo3.C77407n.this
                nj3.e0 r1 = r1.f225732J
                int r1 = r1.size()
                r2 = 0
                if (r3 < r1) goto L_0x000c
                return r2
            L_0x000c:
                qo3.n r1 = qo3.C77407n.this
                nj3.e0 r1 = r1.f225732J
                java.util.List<android.view.MenuItem> r1 = r1.f224704d
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                java.lang.Object r1 = r1.get(r3)
                nj3.f0 r1 = (nj3.C76875f0) r1
                if (r1 == 0) goto L_0x0021
                boolean r1 = r1.f224722q
                if (r1 == 0) goto L_0x0021
                return r2
            L_0x0021:
                qo3.n r1 = qo3.C77407n.this
                nj3.e0 r1 = r1.f225732J
                int r1 = r1.size()
                if (r3 >= r1) goto L_0x003a
                qo3.n r1 = qo3.C77407n.this
                nj3.o0 r4 = r1.f225791t
                if (r4 == 0) goto L_0x003a
                nj3.e0 r1 = r1.f225732J
                android.view.MenuItem r1 = r1.getItem(r3)
                r4.mo2584a(r1, r3)
            L_0x003a:
                qo3.n r1 = qo3.C77407n.this
                qo3.n$u r1 = r1.f225783p0
                r1.notifyDataSetChanged()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: qo3.C77407n.C77418m.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
        }
    }

    /* renamed from: qo3.n$q */
    public interface C77419q {
        void onShow();
    }

    /* renamed from: qo3.n$r */
    public interface C77420r {
        void onShow();
    }

    /* renamed from: qo3.n$s */
    public class C77421s extends RecyclerView.C0130p {
        public C77421s(C12921g gVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0085  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo107585a(androidx.recyclerview.widget.RecyclerView r6) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView$LayoutManager r6 = r6.getLayoutManager()
                boolean r0 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
                if (r0 != 0) goto L_0x0009
                return
            L_0x0009:
                androidx.recyclerview.widget.LinearLayoutManager r6 = (androidx.recyclerview.widget.LinearLayoutManager) r6
                int r0 = r6.mo16957C()
                int r1 = r6.mo16959E()
            L_0x0013:
                if (r0 > r1) goto L_0x0093
                r2 = 0
                if (r0 >= 0) goto L_0x001a
            L_0x0018:
                r3 = r2
                goto L_0x0062
            L_0x001a:
                qo3.n r3 = qo3.C77407n.this
                nj3.e0 r3 = r3.f225729G
                int r3 = r3.size()
                if (r0 >= r3) goto L_0x0033
                qo3.n r3 = qo3.C77407n.this
                nj3.e0 r3 = r3.f225729G
                java.util.List<android.view.MenuItem> r3 = r3.f224704d
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r3 = r3.get(r0)
                nj3.f0 r3 = (nj3.C76875f0) r3
                goto L_0x0062
            L_0x0033:
                qo3.n r3 = qo3.C77407n.this
                nj3.e0 r3 = r3.f225730H
                int r3 = r3.size()
                if (r3 <= 0) goto L_0x0018
                qo3.n r3 = qo3.C77407n.this
                nj3.e0 r3 = r3.f225729G
                int r3 = r3.size()
                qo3.n r4 = qo3.C77407n.this
                nj3.e0 r4 = r4.f225730H
                int r4 = r4.size()
                int r3 = r3 + r4
                if (r0 >= r3) goto L_0x0018
                qo3.n r3 = qo3.C77407n.this
                nj3.e0 r4 = r3.f225730H
                nj3.e0 r3 = r3.f225729G
                int r3 = r3.size()
                int r3 = r0 - r3
                android.view.MenuItem r3 = r4.getItem(r3)
                nj3.f0 r3 = (nj3.C76875f0) r3
            L_0x0062:
                if (r3 != 0) goto L_0x0085
                qo3.n r3 = qo3.C77407n.this
                nj3.e0 r3 = r3.f225729G
                int r3 = r3.size()
                qo3.n r4 = qo3.C77407n.this
                nj3.e0 r4 = r4.f225730H
                int r4 = r4.size()
                int r3 = r3 + r4
                if (r0 != r3) goto L_0x0090
                qo3.n r3 = qo3.C77407n.this
                nj3.r0 r3 = r3.f225724C1
                if (r3 == 0) goto L_0x0090
                android.view.View r4 = r6.findViewByPosition(r0)
                r3.mo107237a(r2, r4)
                goto L_0x0090
            L_0x0085:
                nj3.r0 r2 = r3.f224710D
                if (r2 == 0) goto L_0x0090
                android.view.View r4 = r6.findViewByPosition(r0)
                r2.mo107237a(r3, r4)
            L_0x0090:
                int r0 = r0 + 1
                goto L_0x0013
            L_0x0093:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qo3.C77407n.C77421s.mo107585a(androidx.recyclerview.widget.RecyclerView):void");
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$MenuItemVisibleHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            mo107585a(recyclerView);
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$MenuItemVisibleHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$MenuItemVisibleHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            mo107585a(recyclerView);
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$MenuItemVisibleHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: qo3.n$t */
    public interface C77422t {
        /* renamed from: a */
        void mo25383a();
    }

    /* renamed from: qo3.n$u */
    public class C77423u extends RecyclerView.C16613e<C77424a> {

        /* renamed from: d */
        public final boolean f225820d;

        /* renamed from: e */
        public AdapterView.OnItemClickListener f225821e;

        /* renamed from: f */
        public AdapterView.OnItemLongClickListener f225822f;

        /* renamed from: g */
        public C76874e0 f225823g;

        /* renamed from: qo3.n$u$a */
        public class C77424a extends RecyclerView.C16631z implements View.OnClickListener, View.OnLongClickListener {

            /* renamed from: A */
            public TextView f225825A;

            /* renamed from: B */
            public WeImageView f225826B;

            /* renamed from: C */
            public ImageView f225827C = null;

            /* renamed from: D */
            public ImageView f225828D;

            /* renamed from: E */
            public RadioButton f225829E;

            /* renamed from: F */
            public ImageView f225830F;

            /* renamed from: G */
            public LinearLayout f225831G;

            /* renamed from: H */
            public View f225832H;

            /* renamed from: I */
            public View f225833I;

            /* renamed from: z */
            public TextView f225835z;

            public C77424a(View view) {
                super(view);
                view.setOnClickListener(this);
                view.setOnLongClickListener(this);
                this.f225835z = (TextView) view.findViewById(C0966R.C0970id.knx);
                this.f225826B = (WeImageView) view.findViewById(C0966R.C0970id.f15);
                this.f225831G = (LinearLayout) view.findViewById(C0966R.C0970id.iwc);
                this.f225832H = view.findViewById(C0966R.C0970id.hdw);
                this.f225833I = view.findViewById(C0966R.C0970id.iis);
                if (C77407n.this.f225741R0) {
                    this.f225828D = (ImageView) view.findViewById(C0966R.C0970id.f1j);
                    C77423u uVar = C77407n.this.f225783p0;
                    if (uVar != null && uVar.getItemCount() > 0) {
                        this.f225828D.setLongClickable(true);
                        this.f225828D.setOnLongClickListener(this);
                        this.f225828D.setOnClickListener(this);
                    }
                    this.f225827C = (ImageView) view.findViewById(C0966R.C0970id.f1i);
                }
                if (C77407n.this.f225803y0) {
                    this.f225829E = (RadioButton) view.findViewById(C0966R.C0970id.f359003ic1);
                }
                C77407n nVar = C77407n.this;
                if (nVar.f225803y0 || nVar.f225739Q0) {
                    this.f225825A = (TextView) view.findViewById(C0966R.C0970id.f357845c22);
                    this.f225830F = (ImageView) view.findViewById(C0966R.C0970id.c7p);
                }
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                AdapterView.OnItemClickListener onItemClickListener = C77423u.this.f225821e;
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick((AdapterView) null, view, mo17365l(), (long) mo17365l());
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                AdapterView.OnItemLongClickListener onItemLongClickListener = C77423u.this.f225822f;
                if (onItemLongClickListener != null) {
                    onItemLongClickListener.onItemLongClick((AdapterView) null, view, mo17365l(), (long) mo17365l());
                    C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return true;
                }
                C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
        }

        public C77423u(boolean z) {
            this.f225820d = z;
        }

        public int getItemCount() {
            int size = this.f225823g.size();
            if (!this.f225820d || !C77407n.this.f225798w1) {
                size += C77407n.this.f225730H.size();
            }
            C77407n nVar = C77407n.this;
            return nVar.f225800x0 ? (!this.f225820d || !nVar.f225798w1) ? size + 1 : size : size;
        }

        public int getItemViewType(int i) {
            if (i >= 0 && i < this.f225823g.size()) {
                MenuItem item = this.f225823g.getItem(i);
                return (!(item instanceof C76875f0) || ((C76875f0) item).f224727v) ? 0 : 1;
            } else if (C77407n.this.f225730H.size() <= 0 || i >= this.f225823g.size() + C77407n.this.f225730H.size()) {
                return (!C77407n.this.f225800x0 || i != this.f225823g.size() + C77407n.this.f225730H.size()) ? 0 : 3;
            } else {
                return 2;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:52:0x0173  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x01b4  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x01bb  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0271  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r32, int r33) {
            /*
                r31 = this;
                r0 = r31
                r1 = r33
                r2 = r32
                qo3.n$u$a r2 = (qo3.C77407n.C77423u.C77424a) r2
                nj3.e0 r3 = r0.f225823g
                int r3 = r3.size()
                r4 = 2131101838(0x7f06088e, float:1.7816097E38)
                r5 = 2131100184(0x7f060218, float:1.7812742E38)
                r6 = 2131100185(0x7f060219, float:1.7812744E38)
                r7 = 255(0xff, float:3.57E-43)
                r8 = 2131101688(0x7f0607f8, float:1.7815793E38)
                r9 = 8
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r11 = 0
                java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
                if (r1 >= r3) goto L_0x0440
                qo3.n r3 = qo3.C77407n.this
                int r3 = r3.f225786q1
                nj3.e0 r15 = r0.f225823g
                int r15 = r15.size()
                if (r3 < r15) goto L_0x0039
                qo3.n r3 = qo3.C77407n.this
                r3.f225786q1 = r11
            L_0x0039:
                nj3.e0 r3 = r0.f225823g
                java.util.List<android.view.MenuItem> r3 = r3.f224704d
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r3 = r3.get(r1)
                nj3.f0 r3 = (nj3.C76875f0) r3
                android.widget.TextView r15 = r2.f225835z
                java.lang.CharSequence r13 = r3.getTitle()
                r15.setText(r13)
                java.lang.CharSequence r13 = r3.getTitle()
                boolean r13 = android.text.TextUtils.isEmpty(r13)
                if (r13 == 0) goto L_0x006b
                java.lang.CharSequence r13 = r3.f224719n
                boolean r13 = android.text.TextUtils.isEmpty(r13)
                if (r13 != 0) goto L_0x006b
                android.widget.TextView r13 = r2.f225835z
                java.lang.CharSequence r15 = r3.f224719n
                r13.setText(r15)
                android.text.TextUtils$TruncateAt r13 = android.text.TextUtils.TruncateAt.END
                r3.f224720o = r13
            L_0x006b:
                android.widget.TextView r13 = r2.f225835z
                android.text.TextUtils$TruncateAt r15 = r3.f224720o
                r13.setEllipsize(r15)
                qo3.n r13 = qo3.C77407n.this
                boolean r13 = r13.f225741R0
                if (r13 == 0) goto L_0x0087
                nj3.e0 r13 = r0.f225823g
                int r13 = r13.size()
                r15 = 5
                if (r13 <= r15) goto L_0x0087
                android.widget.TextView r13 = r2.f225835z
                r15 = 2
                r13.setLines(r15)
            L_0x0087:
                android.graphics.drawable.Drawable r13 = r3.getIcon()
                if (r13 == 0) goto L_0x00cb
                com.tencent.mm.ui.widget.imageview.WeImageView r13 = r2.f225826B
                r13.setVisibility(r11)
                com.tencent.mm.ui.widget.imageview.WeImageView r13 = r2.f225826B
                android.graphics.drawable.Drawable r15 = r3.getIcon()
                r13.setImageDrawable(r15)
                qo3.n r13 = qo3.C77407n.this
                boolean r15 = r13.f225803y0
                if (r15 == 0) goto L_0x00b1
                com.tencent.mm.ui.widget.imageview.WeImageView r15 = r2.f225826B
                android.content.Context r13 = r13.f225769h
                android.content.res.Resources r13 = r13.getResources()
                int r13 = r13.getColor(r8)
                r15.setIconColor(r13)
                goto L_0x011e
            L_0x00b1:
                int r15 = r3.f224725t
                if (r15 == 0) goto L_0x00bb
                com.tencent.mm.ui.widget.imageview.WeImageView r13 = r2.f225826B
                r13.setIconColor(r15)
                goto L_0x011e
            L_0x00bb:
                com.tencent.mm.ui.widget.imageview.WeImageView r15 = r2.f225826B
                android.content.Context r13 = r13.f225769h
                android.content.res.Resources r13 = r13.getResources()
                int r13 = r13.getColor(r8)
                r15.setIconColor(r13)
                goto L_0x011e
            L_0x00cb:
                qo3.n r13 = qo3.C77407n.this
                nj3.h0 r13 = r13.f225805z
                if (r13 == 0) goto L_0x00f3
                com.tencent.mm.ui.widget.imageview.WeImageView r13 = r2.f225826B
                r13.setVisibility(r11)
                com.tencent.mm.ui.widget.imageview.WeImageView r13 = r2.f225826B
                qo3.n r15 = qo3.C77407n.this
                android.content.Context r15 = r15.f225769h
                android.content.res.Resources r15 = r15.getResources()
                int r15 = r15.getColor(r8)
                r13.setIconColor(r15)
                qo3.n r13 = qo3.C77407n.this
                nj3.h0 r13 = r13.f225805z
                com.tencent.mm.ui.widget.imageview.WeImageView r15 = r2.f225826B
                android.widget.ImageView r14 = r2.f225828D
                r13.mo6974a(r15, r14, r3)
                goto L_0x011e
            L_0x00f3:
                java.lang.String r13 = r3.f224730y
                boolean r13 = android.text.TextUtils.isEmpty(r13)
                if (r13 != 0) goto L_0x010c
                android.widget.ImageView r13 = r2.f225828D
                r13.setVisibility(r11)
                qo3.n r13 = qo3.C77407n.this
                nj3.i0 r13 = r13.f225728F
                if (r13 == 0) goto L_0x011e
                android.widget.ImageView r14 = r2.f225828D
                r13.mo77066a(r14, r3)
                goto L_0x011e
            L_0x010c:
                qo3.n r13 = qo3.C77407n.this
                boolean r13 = r13.f225781o1
                if (r13 == 0) goto L_0x0119
                com.tencent.mm.ui.widget.imageview.WeImageView r13 = r2.f225826B
                r14 = 4
                r13.setVisibility(r14)
                goto L_0x011e
            L_0x0119:
                com.tencent.mm.ui.widget.imageview.WeImageView r13 = r2.f225826B
                r13.setVisibility(r9)
            L_0x011e:
                nj3.q0 r13 = r3.f224711E
                if (r13 == 0) goto L_0x0129
                android.view.View r14 = r2.f44854d
                com.tencent.mm.ui.chatting.viewitems.d5 r13 = (com.tencent.p014mm.p136ui.chatting.viewitems.C73951d5) r13
                r13.mo103020a(r14)
            L_0x0129:
                qo3.n r13 = qo3.C77407n.this
                nj3.j0 r13 = r13.f225725D
                if (r13 == 0) goto L_0x0134
                android.widget.TextView r14 = r2.f225835z
                r13.mo7130a(r14, r3)
            L_0x0134:
                boolean r13 = r3.f224722q
                r14 = 2131234542(0x7f080eee, float:1.8085253E38)
                if (r13 == 0) goto L_0x01c9
                qo3.n r7 = qo3.C77407n.this
                java.lang.Boolean r7 = r7.f225736N
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto L_0x015c
                qo3.n r7 = qo3.C77407n.this
                boolean r13 = r7.f225794u1
                if (r13 == 0) goto L_0x014c
                goto L_0x015c
            L_0x014c:
                android.widget.TextView r4 = r2.f225835z
                android.content.Context r7 = r7.f225769h
                android.content.res.Resources r7 = r7.getResources()
                int r7 = r7.getColor(r5)
                r4.setTextColor(r7)
                goto L_0x016d
            L_0x015c:
                android.widget.TextView r7 = r2.f225835z
                qo3.n r13 = qo3.C77407n.this
                android.content.Context r13 = r13.f225769h
                android.content.res.Resources r13 = r13.getResources()
                int r4 = r13.getColor(r4)
                r7.setTextColor(r4)
            L_0x016d:
                qo3.n r4 = qo3.C77407n.this
                boolean r7 = r4.f225741R0
                if (r7 == 0) goto L_0x01bb
                java.lang.Boolean r4 = r4.f225736N
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L_0x0195
                qo3.n r4 = qo3.C77407n.this
                boolean r7 = r4.f225794u1
                if (r7 == 0) goto L_0x0182
                goto L_0x0195
            L_0x0182:
                com.tencent.mm.ui.widget.imageview.WeImageView r7 = r2.f225826B
                android.content.Context r4 = r4.f225769h
                android.content.res.Resources r4 = r4.getResources()
                r8 = 2131099712(0x7f060040, float:1.7811785E38)
                int r4 = r4.getColor(r8)
                r7.setIconColor(r4)
                goto L_0x01b0
            L_0x0195:
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = r2.f225826B
                qo3.n r7 = qo3.C77407n.this
                android.content.Context r7 = r7.f225769h
                android.content.res.Resources r7 = r7.getResources()
                r8 = 2131099714(0x7f060042, float:1.781179E38)
                int r7 = r7.getColor(r8)
                r4.setIconColor(r7)
                android.widget.ImageView r4 = r2.f225828D
                if (r4 == 0) goto L_0x01b0
                r4.setBackgroundResource(r14)
            L_0x01b0:
                android.widget.ImageView r4 = r2.f225828D
                if (r4 == 0) goto L_0x0276
                r7 = 128(0x80, float:1.794E-43)
                r4.setAlpha(r7)
                goto L_0x0276
            L_0x01bb:
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = r2.f225826B
                r7 = 77
                r4.setAlpha(r7)
                android.widget.LinearLayout r4 = r2.f225831G
                r4.setBackgroundResource(r8)
                goto L_0x0276
            L_0x01c9:
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = r2.f225826B
                r4.setAlpha(r7)
                android.widget.ImageView r4 = r2.f225828D
                if (r4 == 0) goto L_0x01d5
                r4.setAlpha(r7)
            L_0x01d5:
                qo3.n r4 = qo3.C77407n.this
                java.lang.Boolean r4 = r4.f225736N
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L_0x020d
                qo3.n r4 = qo3.C77407n.this
                boolean r7 = r4.f225794u1
                if (r7 == 0) goto L_0x01e6
                goto L_0x020d
            L_0x01e6:
                boolean r7 = r4.f225741R0
                if (r7 == 0) goto L_0x01fa
                android.widget.TextView r7 = r2.f225835z
                android.content.Context r4 = r4.f225769h
                android.content.res.Resources r4 = r4.getResources()
                int r4 = r4.getColor(r6)
                r7.setTextColor(r4)
                goto L_0x026d
            L_0x01fa:
                android.widget.TextView r7 = r2.f225835z
                android.content.Context r4 = r4.f225769h
                android.content.res.Resources r4 = r4.getResources()
                r8 = 2131100183(0x7f060217, float:1.781274E38)
                int r4 = r4.getColor(r8)
                r7.setTextColor(r4)
                goto L_0x026d
            L_0x020d:
                android.widget.TextView r4 = r2.f225835z
                qo3.n r7 = qo3.C77407n.this
                android.content.Context r7 = r7.f225769h
                android.content.res.Resources r7 = r7.getResources()
                r8 = 2131099704(0x7f060038, float:1.7811769E38)
                int r7 = r7.getColor(r8)
                r4.setTextColor(r7)
                qo3.n r4 = qo3.C77407n.this
                boolean r7 = r4.f225739Q0
                if (r7 == 0) goto L_0x023b
                android.widget.TextView r7 = r2.f225825A
                if (r7 == 0) goto L_0x023b
                android.content.Context r4 = r4.f225769h
                android.content.res.Resources r4 = r4.getResources()
                r8 = 2131099699(0x7f060033, float:1.7811759E38)
                int r4 = r4.getColor(r8)
                r7.setTextColor(r4)
            L_0x023b:
                qo3.n r4 = qo3.C77407n.this
                boolean r7 = r4.f225741R0
                if (r7 == 0) goto L_0x026d
                int r7 = r3.f224725t
                android.content.Context r4 = r4.f225769h
                android.content.res.Resources r4 = r4.getResources()
                r8 = 2131099800(0x7f060098, float:1.7811963E38)
                int r4 = r4.getColor(r8)
                if (r7 != r4) goto L_0x0266
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = r2.f225826B
                qo3.n r7 = qo3.C77407n.this
                android.content.Context r7 = r7.f225769h
                android.content.res.Resources r7 = r7.getResources()
                r8 = 2131099704(0x7f060038, float:1.7811769E38)
                int r7 = r7.getColor(r8)
                r4.setIconColor(r7)
            L_0x0266:
                android.widget.ImageView r4 = r2.f225828D
                if (r4 == 0) goto L_0x026d
                r4.setBackgroundResource(r14)
            L_0x026d:
                int r4 = r3.f224718j
                if (r4 == 0) goto L_0x0276
                android.widget.TextView r7 = r2.f225835z
                r7.setTextColor(r4)
            L_0x0276:
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = r2.f225826B
                boolean r7 = r3.f224727v
                r4.setEnableColorFilter(r7)
                android.widget.TextView r4 = r2.f225825A
                if (r4 == 0) goto L_0x02ac
                java.lang.CharSequence r4 = r3.f224721p
                if (r4 == 0) goto L_0x02a7
                int r4 = r4.length()
                if (r4 <= 0) goto L_0x02a7
                android.widget.TextView r4 = r2.f225825A
                r4.setVisibility(r11)
                android.widget.TextView r4 = r2.f225825A
                java.lang.CharSequence r7 = r3.f224721p
                r4.setText(r7)
                qo3.n r4 = qo3.C77407n.this
                boolean r4 = r4.f225803y0
                if (r4 == 0) goto L_0x02ac
                android.widget.TextView r4 = r2.f225825A
                android.text.method.MovementMethod r7 = android.text.method.LinkMovementMethod.getInstance()
                r4.setMovementMethod(r7)
                goto L_0x02ac
            L_0x02a7:
                android.widget.TextView r4 = r2.f225825A
                r4.setVisibility(r9)
            L_0x02ac:
                qo3.n r4 = qo3.C77407n.this
                boolean r7 = r4.f225803y0
                if (r7 == 0) goto L_0x02f8
                boolean r7 = r3.f224722q
                if (r7 == 0) goto L_0x02cd
                android.widget.RadioButton r4 = r2.f225829E
                r4.setVisibility(r9)
                android.widget.TextView r4 = r2.f225825A
                qo3.n r6 = qo3.C77407n.this
                android.content.Context r6 = r6.f225769h
                android.content.res.Resources r6 = r6.getResources()
                int r5 = r6.getColor(r5)
                r4.setTextColor(r5)
                goto L_0x02f3
            L_0x02cd:
                android.widget.TextView r5 = r2.f225825A
                android.content.Context r4 = r4.f225769h
                android.content.res.Resources r4 = r4.getResources()
                int r4 = r4.getColor(r6)
                r5.setTextColor(r4)
                android.widget.RadioButton r4 = r2.f225829E
                r4.setVisibility(r11)
                qo3.n r4 = qo3.C77407n.this
                int r4 = r4.f225786q1
                if (r4 != r1) goto L_0x02ee
                android.widget.RadioButton r4 = r2.f225829E
                r5 = 1
                r4.setChecked(r5)
                goto L_0x02f3
            L_0x02ee:
                android.widget.RadioButton r4 = r2.f225829E
                r4.setChecked(r11)
            L_0x02f3:
                android.widget.ImageView r4 = r2.f225830F
                r4.setVisibility(r11)
            L_0x02f8:
                android.view.View r4 = r2.f225832H
                if (r4 == 0) goto L_0x0377
                boolean r5 = r3.f224712d
                if (r5 == 0) goto L_0x033c
                k20.a r5 = new k20.a
                r5.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                r5.mo10233c(r12)
                java.lang.Object[] r17 = r5.mo10232b()
                java.lang.String r18 = "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter"
                java.lang.String r19 = "onBindViewHolder"
                java.lang.String r20 = "(Lcom/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder;I)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r16 = r4
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                java.lang.Object r5 = r5.mo10231a(r11)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r4.setVisibility(r5)
                java.lang.String r17 = "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter"
                java.lang.String r18 = "onBindViewHolder"
                java.lang.String r19 = "(Lcom/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder;I)V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
                goto L_0x0377
            L_0x033c:
                k20.a r5 = new k20.a
                r5.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                r5.mo10233c(r10)
                java.lang.Object[] r17 = r5.mo10232b()
                java.lang.String r18 = "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter"
                java.lang.String r19 = "onBindViewHolder"
                java.lang.String r20 = "(Lcom/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder;I)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r16 = r4
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                java.lang.Object r5 = r5.mo10231a(r11)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r4.setVisibility(r5)
                java.lang.String r17 = "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter"
                java.lang.String r18 = "onBindViewHolder"
                java.lang.String r19 = "(Lcom/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder;I)V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            L_0x0377:
                android.view.View r4 = r2.f225833I
                if (r4 == 0) goto L_0x03f6
                boolean r5 = r3.f224713e
                if (r5 == 0) goto L_0x03bb
                k20.a r5 = new k20.a
                r5.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                r5.mo10233c(r12)
                java.lang.Object[] r24 = r5.mo10232b()
                java.lang.String r25 = "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter"
                java.lang.String r26 = "onBindViewHolder"
                java.lang.String r27 = "(Lcom/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder;I)V"
                java.lang.String r28 = "android/view/View_EXEC_"
                java.lang.String r29 = "setVisibility"
                java.lang.String r30 = "(I)V"
                r23 = r4
                j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
                java.lang.Object r5 = r5.mo10231a(r11)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r4.setVisibility(r5)
                java.lang.String r24 = "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter"
                java.lang.String r25 = "onBindViewHolder"
                java.lang.String r26 = "(Lcom/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder;I)V"
                java.lang.String r27 = "android/view/View_EXEC_"
                java.lang.String r28 = "setVisibility"
                java.lang.String r29 = "(I)V"
                j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
                goto L_0x03f6
            L_0x03bb:
                k20.a r5 = new k20.a
                r5.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                r5.mo10233c(r10)
                java.lang.Object[] r24 = r5.mo10232b()
                java.lang.String r25 = "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter"
                java.lang.String r26 = "onBindViewHolder"
                java.lang.String r27 = "(Lcom/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder;I)V"
                java.lang.String r28 = "android/view/View_EXEC_"
                java.lang.String r29 = "setVisibility"
                java.lang.String r30 = "(I)V"
                r23 = r4
                j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
                java.lang.Object r5 = r5.mo10231a(r11)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r4.setVisibility(r5)
                java.lang.String r24 = "com/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter"
                java.lang.String r25 = "onBindViewHolder"
                java.lang.String r26 = "(Lcom/tencent/mm/ui/widget/dialog/MMBottomSheet$RecycleViewAdapter$ViewHolder;I)V"
                java.lang.String r27 = "android/view/View_EXEC_"
                java.lang.String r28 = "setVisibility"
                java.lang.String r29 = "(I)V"
                j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            L_0x03f6:
                qo3.n r4 = qo3.C77407n.this
                boolean r5 = r4.f225739Q0
                if (r5 == 0) goto L_0x042c
                boolean r5 = r4.f225794u1
                if (r5 == 0) goto L_0x042c
                int r5 = r3.f224725t
                if (r5 == 0) goto L_0x0416
                com.tencent.mm.ui.widget.imageview.WeImageView r5 = r2.f225826B
                android.content.Context r4 = r4.f225769h
                android.content.res.Resources r4 = r4.getResources()
                r6 = 2131099704(0x7f060038, float:1.7811769E38)
                int r4 = r4.getColor(r6)
                r5.setIconColor(r4)
            L_0x0416:
                android.widget.ImageView r4 = r2.f225830F
                if (r4 == 0) goto L_0x042c
                qo3.n r5 = qo3.C77407n.this
                android.content.Context r5 = r5.f225769h
                android.content.res.Resources r5 = r5.getResources()
                r6 = 2131099690(0x7f06002a, float:1.781174E38)
                int r5 = r5.getColor(r6)
                r4.setBackgroundColor(r5)
            L_0x042c:
                android.widget.ImageView r4 = r2.f225827C
                if (r4 == 0) goto L_0x0433
                r4.setVisibility(r9)
            L_0x0433:
                qo3.n r4 = qo3.C77407n.this
                nj3.n0 r4 = r4.f225795v
                if (r4 == 0) goto L_0x0711
                android.view.View r5 = r2.f44854d
                r4.mo2585a(r5, r1, r3)
                goto L_0x0711
            L_0x0440:
                qo3.n r3 = qo3.C77407n.this
                nj3.e0 r3 = r3.f225730H
                int r3 = r3.size()
                r10 = 1050253722(0x3e99999a, float:0.3)
                r12 = 1065353216(0x3f800000, float:1.0)
                if (r3 <= 0) goto L_0x0648
                nj3.e0 r3 = r0.f225823g
                int r3 = r3.size()
                qo3.n r13 = qo3.C77407n.this
                nj3.e0 r13 = r13.f225730H
                int r13 = r13.size()
                int r3 = r3 + r13
                if (r1 >= r3) goto L_0x0648
                qo3.n r3 = qo3.C77407n.this
                nj3.e0 r3 = r3.f225730H
                java.util.List<android.view.MenuItem> r3 = r3.f224704d
                nj3.e0 r13 = r0.f225823g
                int r13 = r13.size()
                int r13 = r1 - r13
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r3 = r3.get(r13)
                nj3.f0 r3 = (nj3.C76875f0) r3
                android.widget.TextView r13 = r2.f225835z
                java.lang.CharSequence r14 = r3.getTitle()
                r13.setText(r14)
                qo3.n r13 = qo3.C77407n.this
                int r13 = r13.f225786q1
                nj3.e0 r14 = r0.f225823g
                int r14 = r14.size()
                qo3.n r15 = qo3.C77407n.this
                nj3.e0 r15 = r15.f225730H
                int r15 = r15.size()
                int r14 = r14 + r15
                if (r13 < r14) goto L_0x0498
                qo3.n r13 = qo3.C77407n.this
                r13.f225786q1 = r11
            L_0x0498:
                android.graphics.drawable.Drawable r13 = r3.getIcon()
                if (r13 == 0) goto L_0x04ad
                com.tencent.mm.ui.widget.imageview.WeImageView r13 = r2.f225826B
                r13.setVisibility(r11)
                com.tencent.mm.ui.widget.imageview.WeImageView r13 = r2.f225826B
                android.graphics.drawable.Drawable r14 = r3.getIcon()
                r13.setImageDrawable(r14)
                goto L_0x04b2
            L_0x04ad:
                com.tencent.mm.ui.widget.imageview.WeImageView r13 = r2.f225826B
                r13.setVisibility(r9)
            L_0x04b2:
                qo3.n r13 = qo3.C77407n.this
                boolean r14 = r13.f225798w1
                if (r14 != 0) goto L_0x0533
                boolean r7 = r3.f224722q
                if (r7 == 0) goto L_0x04f3
                java.lang.Boolean r7 = r13.f225736N
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto L_0x04db
                qo3.n r7 = qo3.C77407n.this
                boolean r10 = r7.f225794u1
                if (r10 == 0) goto L_0x04cb
                goto L_0x04db
            L_0x04cb:
                android.widget.TextView r4 = r2.f225835z
                android.content.Context r7 = r7.f225769h
                android.content.res.Resources r7 = r7.getResources()
                int r7 = r7.getColor(r5)
                r4.setTextColor(r7)
                goto L_0x04ec
            L_0x04db:
                android.widget.TextView r7 = r2.f225835z
                qo3.n r10 = qo3.C77407n.this
                android.content.Context r10 = r10.f225769h
                android.content.res.Resources r10 = r10.getResources()
                int r4 = r10.getColor(r4)
                r7.setTextColor(r4)
            L_0x04ec:
                android.widget.LinearLayout r4 = r2.f225831G
                r4.setBackgroundResource(r8)
                goto L_0x05c9
            L_0x04f3:
                java.lang.Boolean r4 = r13.f225736N
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L_0x0515
                qo3.n r4 = qo3.C77407n.this
                boolean r4 = r4.f225794u1
                if (r4 == 0) goto L_0x0502
                goto L_0x0515
            L_0x0502:
                android.widget.TextView r4 = r2.f225835z
                android.content.res.ColorStateList r7 = r4.getTextColors()
                r4.setTextColor(r7)
                android.widget.LinearLayout r4 = r2.f225831G
                r7 = 2131234749(0x7f080fbd, float:1.8085673E38)
                r4.setBackgroundResource(r7)
                goto L_0x05c9
            L_0x0515:
                android.widget.TextView r4 = r2.f225835z
                qo3.n r7 = qo3.C77407n.this
                android.content.Context r7 = r7.f225769h
                android.content.res.Resources r7 = r7.getResources()
                r8 = 2131099704(0x7f060038, float:1.7811769E38)
                int r7 = r7.getColor(r8)
                r4.setTextColor(r7)
                android.widget.LinearLayout r4 = r2.f225831G
                r7 = 2131234750(0x7f080fbe, float:1.8085675E38)
                r4.setBackgroundResource(r7)
                goto L_0x05c9
            L_0x0533:
                android.widget.LinearLayout r4 = r2.f225831G
                boolean r13 = r3.f224722q
                if (r13 == 0) goto L_0x053a
                goto L_0x053c
            L_0x053a:
                r10 = 1065353216(0x3f800000, float:1.0)
            L_0x053c:
                r4.setAlpha(r10)
                int r4 = r3.f224725t
                if (r4 == 0) goto L_0x0549
                com.tencent.mm.ui.widget.imageview.WeImageView r8 = r2.f225826B
                r8.setIconColor(r4)
                goto L_0x055a
            L_0x0549:
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = r2.f225826B
                qo3.n r10 = qo3.C77407n.this
                android.content.Context r10 = r10.f225769h
                android.content.res.Resources r10 = r10.getResources()
                int r8 = r10.getColor(r8)
                r4.setIconColor(r8)
            L_0x055a:
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = r2.f225826B
                r4.setTag(r3)
                qo3.p r4 = new qo3.p
                r4.<init>(r0, r2)
                r3.f224709C = r4
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = r2.f225826B
                r4.setAlpha(r7)
                android.widget.ImageView r4 = r2.f225828D
                if (r4 == 0) goto L_0x0572
                r4.setAlpha(r7)
            L_0x0572:
                qo3.n r4 = qo3.C77407n.this
                nj3.j0 r4 = r4.f225727E
                if (r4 == 0) goto L_0x057d
                android.widget.TextView r7 = r2.f225835z
                r4.mo7130a(r7, r3)
            L_0x057d:
                qo3.n r4 = qo3.C77407n.this
                java.lang.Boolean r4 = r4.f225736N
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L_0x05b5
                qo3.n r4 = qo3.C77407n.this
                boolean r7 = r4.f225794u1
                if (r7 == 0) goto L_0x058e
                goto L_0x05b5
            L_0x058e:
                boolean r7 = r4.f225741R0
                if (r7 == 0) goto L_0x05a2
                android.widget.TextView r7 = r2.f225835z
                android.content.Context r4 = r4.f225769h
                android.content.res.Resources r4 = r4.getResources()
                int r4 = r4.getColor(r6)
                r7.setTextColor(r4)
                goto L_0x05c9
            L_0x05a2:
                android.widget.TextView r7 = r2.f225835z
                android.content.Context r4 = r4.f225769h
                android.content.res.Resources r4 = r4.getResources()
                r8 = 2131100183(0x7f060217, float:1.781274E38)
                int r4 = r4.getColor(r8)
                r7.setTextColor(r4)
                goto L_0x05c9
            L_0x05b5:
                android.widget.TextView r4 = r2.f225835z
                qo3.n r7 = qo3.C77407n.this
                android.content.Context r7 = r7.f225769h
                android.content.res.Resources r7 = r7.getResources()
                r8 = 2131099699(0x7f060033, float:1.7811759E38)
                int r7 = r7.getColor(r8)
                r4.setTextColor(r7)
            L_0x05c9:
                android.widget.TextView r4 = r2.f225825A
                if (r4 == 0) goto L_0x05df
                java.lang.CharSequence r7 = r3.f224721p
                if (r7 == 0) goto L_0x05dc
                r4.setVisibility(r11)
                android.widget.TextView r4 = r2.f225825A
                java.lang.CharSequence r7 = r3.f224721p
                r4.setText(r7)
                goto L_0x05df
            L_0x05dc:
                r4.setVisibility(r9)
            L_0x05df:
                qo3.n r4 = qo3.C77407n.this
                boolean r7 = r4.f225803y0
                if (r7 == 0) goto L_0x062b
                boolean r7 = r3.f224722q
                if (r7 == 0) goto L_0x0600
                android.widget.RadioButton r1 = r2.f225829E
                r1.setVisibility(r9)
                android.widget.TextView r1 = r2.f225825A
                qo3.n r4 = qo3.C77407n.this
                android.content.Context r4 = r4.f225769h
                android.content.res.Resources r4 = r4.getResources()
                int r4 = r4.getColor(r5)
                r1.setTextColor(r4)
                goto L_0x0626
            L_0x0600:
                android.widget.TextView r5 = r2.f225825A
                android.content.Context r4 = r4.f225769h
                android.content.res.Resources r4 = r4.getResources()
                int r4 = r4.getColor(r6)
                r5.setTextColor(r4)
                android.widget.RadioButton r4 = r2.f225829E
                r4.setVisibility(r11)
                qo3.n r4 = qo3.C77407n.this
                int r4 = r4.f225786q1
                if (r4 != r1) goto L_0x0621
                android.widget.RadioButton r1 = r2.f225829E
                r4 = 1
                r1.setChecked(r4)
                goto L_0x0626
            L_0x0621:
                android.widget.RadioButton r1 = r2.f225829E
                r1.setChecked(r11)
            L_0x0626:
                android.widget.ImageView r1 = r2.f225830F
                r1.setVisibility(r11)
            L_0x062b:
                android.widget.ImageView r1 = r2.f225827C
                if (r1 == 0) goto L_0x0711
                qo3.n r4 = qo3.C77407n.this
                nj3.g0 r4 = r4.f225723C
                if (r4 == 0) goto L_0x0643
                r1.setVisibility(r11)
                qo3.n r1 = qo3.C77407n.this
                nj3.g0 r1 = r1.f225723C
                android.widget.ImageView r4 = r2.f225827C
                r1.mo106237a(r4, r3)
                goto L_0x0711
            L_0x0643:
                r1.setVisibility(r9)
                goto L_0x0711
            L_0x0648:
                qo3.n r1 = qo3.C77407n.this
                boolean r3 = r1.f225800x0
                if (r3 == 0) goto L_0x0711
                java.lang.String r1 = r1.f225806z1
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 == 0) goto L_0x065f
                android.widget.TextView r1 = r2.f225835z
                r3 = 2131822889(0x7f110929, float:1.9278562E38)
                r1.setText(r3)
                goto L_0x0668
            L_0x065f:
                android.widget.TextView r1 = r2.f225835z
                qo3.n r3 = qo3.C77407n.this
                java.lang.String r3 = r3.f225806z1
                r1.setText(r3)
            L_0x0668:
                qo3.n r1 = qo3.C77407n.this
                nj3.h0 r1 = r1.f225720A1
                r3 = 0
                if (r1 == 0) goto L_0x0675
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = r2.f225826B
                r1.mo6974a(r4, r3, r3)
                goto L_0x067d
            L_0x0675:
                com.tencent.mm.ui.widget.imageview.WeImageView r1 = r2.f225826B
                r4 = 2131755286(0x7f100116, float:1.9141447E38)
                r1.setImageResource(r4)
            L_0x067d:
                android.widget.ImageView r1 = r2.f225827C
                if (r1 == 0) goto L_0x0697
                qo3.n r4 = qo3.C77407n.this
                nj3.g0 r4 = r4.f225722B1
                if (r4 == 0) goto L_0x0694
                r1.setVisibility(r11)
                qo3.n r1 = qo3.C77407n.this
                nj3.g0 r1 = r1.f225722B1
                android.widget.ImageView r4 = r2.f225827C
                r1.mo106237a(r4, r3)
                goto L_0x0697
            L_0x0694:
                r1.setVisibility(r9)
            L_0x0697:
                qo3.n r1 = qo3.C77407n.this
                boolean r3 = r1.f225801x1
                if (r3 == 0) goto L_0x0711
                android.widget.LinearLayout r3 = r2.f225831G
                boolean r1 = r1.f225804y1
                if (r1 == 0) goto L_0x06a5
                r10 = 1065353216(0x3f800000, float:1.0)
            L_0x06a5:
                r3.setAlpha(r10)
                com.tencent.mm.ui.widget.imageview.WeImageView r1 = r2.f225826B
                qo3.n r3 = qo3.C77407n.this
                android.content.Context r3 = r3.f225769h
                android.content.res.Resources r3 = r3.getResources()
                int r3 = r3.getColor(r8)
                r1.setIconColor(r3)
                com.tencent.mm.ui.widget.imageview.WeImageView r1 = r2.f225826B
                r1.setAlpha(r7)
                android.widget.ImageView r1 = r2.f225828D
                if (r1 == 0) goto L_0x06c5
                r1.setAlpha(r7)
            L_0x06c5:
                qo3.n r1 = qo3.C77407n.this
                java.lang.Boolean r1 = r1.f225736N
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L_0x06fd
                qo3.n r1 = qo3.C77407n.this
                boolean r3 = r1.f225794u1
                if (r3 == 0) goto L_0x06d6
                goto L_0x06fd
            L_0x06d6:
                boolean r3 = r1.f225741R0
                if (r3 == 0) goto L_0x06ea
                android.widget.TextView r3 = r2.f225835z
                android.content.Context r1 = r1.f225769h
                android.content.res.Resources r1 = r1.getResources()
                int r1 = r1.getColor(r6)
                r3.setTextColor(r1)
                goto L_0x0711
            L_0x06ea:
                android.widget.TextView r3 = r2.f225835z
                android.content.Context r1 = r1.f225769h
                android.content.res.Resources r1 = r1.getResources()
                r4 = 2131100183(0x7f060217, float:1.781274E38)
                int r1 = r1.getColor(r4)
                r3.setTextColor(r1)
                goto L_0x0711
            L_0x06fd:
                android.widget.TextView r1 = r2.f225835z
                qo3.n r3 = qo3.C77407n.this
                android.content.Context r3 = r3.f225769h
                android.content.res.Resources r3 = r3.getResources()
                r4 = 2131099699(0x7f060033, float:1.7811759E38)
                int r3 = r3.getColor(r4)
                r1.setTextColor(r3)
            L_0x0711:
                qo3.n r1 = qo3.C77407n.this
                boolean r3 = r1.f225739Q0
                if (r3 == 0) goto L_0x0720
                boolean r1 = r1.f225792t1
                if (r1 != 0) goto L_0x0720
                com.tencent.mm.ui.widget.imageview.WeImageView r1 = r2.f225826B
                r1.setVisibility(r9)
            L_0x0720:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qo3.C77407n.C77423u.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C77407n nVar = C77407n.this;
            int i2 = nVar.f225770h1;
            return new C77424a(i2 == 0 ? LayoutInflater.from(nVar.f225769h).inflate(C0966R.C0971layout.f359881bc2, viewGroup, false) : i2 == 2 ? LayoutInflater.from(nVar.f225769h).inflate(C0966R.C0971layout.f359882bc3, viewGroup, false) : LayoutInflater.from(nVar.f225769h).inflate(C0966R.C0971layout.bc4, viewGroup, false));
        }
    }

    public C77407n(Context context, int i, boolean z) {
        this.f225736N = Boolean.FALSE;
        this.f225800x0 = false;
        this.f225803y0 = false;
        this.f225739Q0 = false;
        this.f225741R0 = false;
        this.f225755Y0 = false;
        this.f225775k1 = false;
        this.f225776l1 = false;
        this.f225777m1 = false;
        this.f225779n1 = false;
        this.f225781o1 = false;
        this.f225786q1 = 0;
        this.f225788r1 = false;
        this.f225790s1 = 0;
        this.f225792t1 = false;
        this.f225794u1 = false;
        this.f225796v1 = null;
        this.f225798w1 = false;
        this.f225801x1 = false;
        this.f225804y1 = true;
        this.f225806z1 = null;
        this.f225720A1 = null;
        this.f225722B1 = null;
        this.f225724C1 = null;
        this.f225726D1 = false;
        this.f225770h1 = i;
        this.f225769h = context;
        this.f225772i1 = z;
        this.f225784p1 = false;
        if (context instanceof Activity) {
            this.f225758a1 = ((ViewGroup) ((Activity) context).getWindow().getDecorView()).findViewById(16908290);
        }
        mo107560e(this.f225769h);
    }

    /* renamed from: a */
    public void mo107556a(C76874e0 e0Var, C11184p0 p0Var, C47268j0 j0Var) {
        List<MenuItem> list;
        this.f225798w1 = true;
        this.f225730H = e0Var;
        this.f225785q = p0Var;
        this.f225727E = j0Var;
        if (!this.f225726D1 && this.f225751W0 != null && e0Var != null && (list = e0Var.f224704d) != null) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                boolean z = false;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MenuItem menuItem = (MenuItem) it.next();
                    if ((menuItem instanceof C76875f0) && ((C76875f0) menuItem).f224710D != null) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    this.f225751W0.mo17043c(new C77421s((C12921g) null));
                    this.f225726D1 = true;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo107557b(int i) {
        RecyclerView recyclerView = this.f225749V0;
        if (recyclerView != null && this.f225745T0 != null) {
            recyclerView.setVisibility(i);
            ImageView imageView = this.f225766f1;
            if (imageView == null) {
                return;
            }
            if (i != 0) {
                this.f225745T0.setVisibility(4);
                this.f225766f1.setVisibility(4);
                return;
            }
            imageView.setVisibility(0);
            this.f225745T0.setVisibility(0);
        }
    }

    /* renamed from: c */
    public Window mo107558c() {
        Dialog dialog = this.f225767g;
        if (dialog != null) {
            return dialog.getWindow();
        }
        return null;
    }

    /* renamed from: d */
    public void mo107559d(boolean z) {
        LinearLayout linearLayout = this.f225740R;
        if (linearLayout != null) {
            if (z) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
            }
        }
    }

    /* renamed from: e */
    public final void mo107560e(Context context) {
        ImageView imageView;
        this.f225729G = new C76874e0(context);
        this.f225730H = new C76874e0(context);
        this.f225731I = new C76874e0(context);
        this.f225732J = new C76874e0(context);
        this.f225733K = new C76874e0(context);
        this.f225734L = new C76874e0(context);
        if (this.f225788r1) {
            this.f225767g = new C12903b(context, 0);
        } else {
            this.f225767g = new C12918l0(context, C0966R.style.f8426i2);
        }
        View inflate = View.inflate(context, C0966R.C0971layout.f359880bc1, (ViewGroup) null);
        this.f225735M = inflate;
        this.f225737P = (LinearLayout) inflate.findViewById(C0966R.C0970id.ahl);
        this.f225738Q = (LinearLayout) this.f225735M.findViewById(C0966R.C0970id.ahd);
        this.f225740R = (LinearLayout) this.f225735M.findViewById(C0966R.C0970id.ah_);
        this.f225748V = this.f225735M.findViewById(C0966R.C0970id.aq6);
        this.f225742S = (LinearLayout) this.f225735M.findViewById(C0966R.C0970id.ahe);
        this.f225750W = (TextView) this.f225735M.findViewById(C0966R.C0970id.aq7);
        this.f225752X = (TextView) this.f225735M.findViewById(C0966R.C0970id.aq8);
        this.f225744T = (CustomScrollView) this.f225735M.findViewById(C0966R.C0970id.bsd);
        this.f225746U = this.f225735M.findViewById(C0966R.C0970id.eqn);
        this.f225760c1 = (ImageView) this.f225735M.findViewById(C0966R.C0970id.c4p);
        this.f225762d1 = (ImageView) this.f225735M.findViewById(C0966R.C0970id.gsf);
        this.f225764e1 = (ImageView) this.f225735M.findViewById(C0966R.C0970id.gsh);
        this.f225740R.setOnClickListener(new C12921g());
        RecyclerView recyclerView = (RecyclerView) this.f225735M.findViewById(C0966R.C0970id.ahh);
        this.f225751W0 = recyclerView;
        recyclerView.setHasFixedSize(true);
        if (this.f225751W0.getItemAnimator() != null) {
            this.f225751W0.getItemAnimator().f44807c = 100;
        }
        RecyclerView recyclerView2 = (RecyclerView) this.f225735M.findViewById(C0966R.C0970id.ahk);
        this.f225753X0 = recyclerView2;
        recyclerView2.setHasFixedSize(true);
        this.f225743S0 = (ViewStub) this.f225735M.findViewById(C0966R.C0970id.aho);
        RecyclerView recyclerView3 = this.f225751W0;
        this.f225796v1 = new C63300o(this, recyclerView3.getContext(), recyclerView3);
        boolean g = mo107562g();
        this.f225755Y0 = g;
        int i = this.f225770h1;
        if (i == 0) {
            this.f225741R0 = true;
            if (g) {
                C74942w4.m89786c(this.f225769h, C0966R.dimen.f3637v);
                C74942w4.m89786c(this.f225769h, C0966R.dimen.aax);
            } else {
                C74942w4.m89786c(this.f225769h, C0966R.dimen.f3636u);
                C74942w4.m89786c(this.f225769h, C0966R.dimen.aax);
            }
            if (this.f225772i1) {
                C74942w4.m89786c(this.f225769h, C0966R.dimen.aax);
            }
            this.f225740R.setVisibility(0);
            if (this.f225735M != null) {
                if (!this.f225788r1 || !mo107562g()) {
                    this.f225735M.setBackgroundResource(C0966R.C0969drawable.az8);
                } else {
                    this.f225735M.setBackgroundColor(this.f225769h.getResources().getColor(C0966R.color.f2928b));
                }
            }
            this.f225744T.setOnScrollChangeListener(new C12922h());
        } else if (i == 2) {
            this.f225803y0 = true;
            C74942w4.m89786c(this.f225769h, C0966R.dimen.f4179v_);
            if (this.f225755Y0) {
                C74942w4.m89786c(this.f225769h, C0966R.dimen.f4175v5);
            } else {
                C74942w4.m89786c(this.f225769h, C0966R.dimen.f4175v5);
            }
            if (this.f225772i1) {
                C74942w4.m89784a(this.f225769h, 88);
            }
        } else {
            this.f225739Q0 = true;
            C74942w4.m89786c(this.f225769h, C0966R.dimen.f4182vc);
            if (this.f225755Y0) {
                C74942w4.m89786c(this.f225769h, C0966R.dimen.f4175v5);
            } else {
                C74942w4.m89786c(this.f225769h, C0966R.dimen.f4175v5);
            }
            if (this.f225772i1) {
                C74942w4.m89786c(this.f225769h, C0966R.dimen.aax);
            }
            LinearLayout linearLayout = this.f225740R;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        }
        if (this.f225772i1 && (imageView = this.f225760c1) != null && this.f225784p1) {
            imageView.setVisibility(0);
        }
        if (this.f225770h1 == 0) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f225769h);
            linearLayoutManager.mo16974W(0);
            this.f225751W0.setLayoutManager(linearLayoutManager);
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this.f225769h);
            linearLayoutManager2.mo16974W(0);
            this.f225753X0.setLayoutManager(linearLayoutManager2);
        } else {
            this.f225751W0.setLayoutManager(new LinearLayoutManager(this.f225769h));
        }
        this.f225751W0.setFocusable(false);
        this.f225751W0.setItemViewCacheSize(20);
        C77423u uVar = new C77423u(false);
        this.f225754Y = uVar;
        uVar.f225823g = this.f225729G;
        uVar.f225821e = new C77414i();
        this.f225751W0.setAdapter(uVar);
        this.f225751W0.setOverScrollMode(1);
        C77423u uVar2 = new C77423u(true);
        this.f225756Z = uVar2;
        uVar2.f225823g = this.f225731I;
        uVar2.f225821e = new C77415j();
        this.f225753X0.setAdapter(uVar2);
        this.f225753X0.setOverScrollMode(1);
        Dialog dialog = this.f225767g;
        if (dialog != null) {
            dialog.setContentView(this.f225735M);
        }
        Dialog dialog2 = this.f225767g;
        if (dialog2 != null) {
            dialog2.setOnDismissListener(new C77416k());
        }
    }

    /* renamed from: f */
    public final void mo107561f() {
        this.f225745T0 = (ViewGroup) this.f225743S0.inflate();
        ImageView imageView = (ImageView) this.f225735M.findViewById(C0966R.C0970id.lvl);
        this.f225766f1 = imageView;
        if (this.f225794u1) {
            imageView.setBackgroundColor(this.f225769h.getResources().getColor(C0966R.color.BW_100_Alpha_0_0_5));
        }
        RecyclerView recyclerView = (RecyclerView) this.f225735M.findViewById(C0966R.C0970id.ahn);
        this.f225749V0 = recyclerView;
        recyclerView.setHasFixedSize(true);
        RecyclerView recyclerView2 = this.f225749V0;
        new C63300o(this, recyclerView2.getContext(), recyclerView2);
        C77423u uVar = new C77423u(true);
        this.f225783p0 = uVar;
        uVar.f225823g = this.f225732J;
        uVar.f225821e = new C77417l();
        uVar.f225822f = new C77418m();
        this.f225749V0.setAdapter(uVar);
        this.f225749V0.setOverScrollMode(1);
        if (this.f225770h1 == 0) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f225769h);
            linearLayoutManager.mo16974W(0);
            this.f225749V0.setLayoutManager(linearLayoutManager);
        }
    }

    /* renamed from: g */
    public final boolean mo107562g() {
        Context context = this.f225769h;
        return context != null && context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: h */
    public boolean mo107563h() {
        Dialog dialog = this.f225767g;
        return dialog != null && dialog.isShowing();
    }

    /* renamed from: i */
    public void mo107564i() {
        C77423u uVar;
        if (this.f225767g != null) {
            this.f225777m1 = false;
            if (!(this.f225730H == null || (uVar = this.f225754Y) == null)) {
                uVar.notifyDataSetChanged();
            }
            C77423u uVar2 = this.f225756Z;
            if (uVar2 != null) {
                uVar2.notifyDataSetChanged();
            }
            C77423u uVar3 = this.f225783p0;
            if (uVar3 != null) {
                if (uVar3.getItemCount() == 0) {
                    mo107557b(8);
                }
                this.f225783p0.notifyDataSetChanged();
            }
            this.f225767g.setOnShowListener(new C77411d());
            if (this.f225761d != null) {
                this.f225767g.setOnDismissListener(new C77412e());
            } else {
                this.f225767g.setOnDismissListener(new C77413f());
            }
            this.f225767g.show();
        }
    }

    /* renamed from: j */
    public void mo107565j() {
        Dialog dialog = this.f225767g;
        if (dialog != null) {
            dialog.setCancelMessage((Message) null);
            this.f225767g.setDismissMessage((Message) null);
            this.f225767g.setOnShowListener((DialogInterface.OnShowListener) null);
            this.f225763e = null;
            this.f225802y = null;
            this.f225761d = null;
        }
        this.f225769h = null;
    }

    /* renamed from: k */
    public void mo107566k(int i) {
        ImageView imageView;
        View view = this.f225735M;
        if (view != null) {
            view.setBackgroundColor(i);
        }
        Boolean valueOf = Boolean.valueOf(C74933u4.m89770g(i));
        this.f225736N = valueOf;
        if (valueOf.booleanValue() && (imageView = this.f225760c1) != null) {
            imageView.setImageDrawable(this.f225769h.getResources().getDrawable(C0966R.color.f3279lz));
        }
    }

    /* renamed from: l */
    public void mo107567l(View view) {
        LinearLayout linearLayout = this.f225738Q;
        if (linearLayout == null) {
            return;
        }
        if (view == null) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        this.f225738Q.removeAllViews();
        this.f225738Q.setGravity(17);
        this.f225738Q.addView(view, -1, -2);
    }

    /* renamed from: m */
    public void mo107568m(CharSequence charSequence, int i, int i2) {
        LinearLayout linearLayout = this.f225737P;
        if (linearLayout != null && this.f225772i1) {
            linearLayout.setVisibility(0);
            this.f225737P.removeAllViews();
            this.f225737P.setGravity(i);
            View inflate = LayoutInflater.from(this.f225769h).inflate(C0966R.C0971layout.bc5, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpi);
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.c7p);
            if (this.f225739Q0) {
                imageView.setVisibility(0);
            }
            this.f225768g1 = textView;
            textView.setText(charSequence);
            if (i2 != 0) {
                textView.setTextSize(0, (float) i2);
            }
            textView.setGravity(i | 80);
            if (this.f225794u1) {
                textView.setTextColor(this.f225769h.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                imageView.setBackgroundColor(this.f225769h.getResources().getColor(C0966R.color.BW_100_Alpha_0_0_5));
            }
            this.f225737P.addView(inflate, -1, -2);
        }
    }

    /* renamed from: n */
    public void mo107569n(View view, boolean z) {
        if (view != null) {
            this.f225772i1 = true;
            ImageView imageView = this.f225760c1;
            if (imageView != null) {
                imageView.setVisibility(z ? 4 : 0);
            }
            LinearLayout linearLayout = this.f225737P;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                this.f225737P.removeAllViews();
                this.f225737P.setGravity(17);
                this.f225737P.addView(view, -1, -2);
            }
        }
    }

    /* renamed from: o */
    public C77407n mo107570o(boolean z) {
        this.f225794u1 = z;
        View view = this.f225735M;
        if (view != null) {
            if (z) {
                if (this.f225770h1 == 0) {
                    view.setBackgroundResource(C0966R.C0969drawable.az9);
                    TextView textView = this.f225750W;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    TextView textView2 = this.f225752X;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                } else {
                    view.setBackgroundResource(C0966R.C0969drawable.az7);
                    TextView textView3 = this.f225750W;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    TextView textView4 = this.f225752X;
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                }
                this.f225748V.setBackgroundColor(this.f225769h.getResources().getColor(C0966R.color.f2948a5));
                this.f225750W.setTextColor(this.f225769h.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                this.f225750W.setBackgroundResource(C0966R.C0969drawable.f4882q5);
                this.f225752X.setTextColor(this.f225769h.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                this.f225752X.setBackgroundResource(C0966R.C0969drawable.f4882q5);
                ImageView imageView = this.f225762d1;
                if (imageView != null) {
                    imageView.setBackgroundColor(this.f225769h.getResources().getColor(C0966R.color.BW_100_Alpha_0_0_5));
                }
                ImageView imageView2 = this.f225764e1;
                if (imageView2 != null) {
                    imageView2.setBackgroundColor(this.f225769h.getResources().getColor(C0966R.color.BW_100_Alpha_0_0_5));
                }
                TextView textView5 = this.f225747U0;
                if (textView5 != null) {
                    textView5.setTextColor(this.f225769h.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                }
            } else {
                view.setBackgroundResource(C0966R.C0969drawable.az_);
                TextView textView6 = this.f225747U0;
                if (textView6 != null) {
                    textView6.setTextColor(this.f225769h.getResources().getColor(C0966R.color.FG_0));
                }
            }
        }
        return this;
    }

    public void onGlobalLayout() {
        if (mo107563h()) {
            View view = this.f225758a1;
            if (view == null || (!view.isShown() && view.getVisibility() != 0)) {
                mo107572p();
            } else if (mo107563h()) {
                if (this.f225755Y0 == mo107562g()) {
                    int i = this.f225757Z0;
                    Context context = this.f225769h;
                    if (i == (context instanceof Activity ? ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        return;
                    }
                }
                mo107572p();
            }
        }
    }

    /* renamed from: p */
    public void mo107572p() {
        Dialog dialog = this.f225767g;
        if (dialog != null) {
            Context context = this.f225769h;
            if (!(context instanceof Activity)) {
                dialog.dismiss();
            } else if (context != null && !((Activity) context).isFinishing() && !((Activity) this.f225769h).isDestroyed()) {
                this.f225767g.dismiss();
            }
        }
    }

    /* renamed from: q */
    public void mo107573q() {
        C77423u uVar;
        View view;
        View view2;
        boolean z = false;
        this.f225777m1 = false;
        this.f225755Y0 = mo107562g();
        Context context = this.f225769h;
        this.f225757Z0 = context instanceof Activity ? ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
        C11182m0 m0Var = this.f225771i;
        if (m0Var != null) {
            m0Var.onCreateMMMenu(this.f225729G);
        }
        C11182m0 m0Var2 = this.f225773j;
        if (m0Var2 != null) {
            m0Var2.onCreateMMMenu(this.f225731I);
        }
        C11182m0 m0Var3 = this.f225778n;
        if (m0Var3 != null) {
            m0Var3.onCreateMMMenu(this.f225732J);
            if (this.f225732J.size() > 0 && this.f225745T0 == null) {
                mo107561f();
            }
        }
        C11182m0 m0Var4 = this.f225780o;
        if (m0Var4 != null) {
            m0Var4.onCreateMMMenu(this.f225734L);
        }
        if (this.f225767g != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f225735M.getLayoutParams();
            this.f225729G.size();
            if (!this.f225800x0 && this.f225730H.size() > 0) {
                this.f225730H.size();
            }
            if (this.f225755Y0 && this.f225758a1 != null) {
                Rect rect = new Rect();
                this.f225758a1.getWindowVisibleDisplayFrame(rect);
                if (this.f225788r1) {
                    layoutParams.width = (int) ((((float) rect.right) * 1.0f) / 2.0f);
                    int i = this.f225790s1;
                    if (i != 0) {
                        layoutParams.width = i;
                    }
                    if (C75044y4.m89999k(this.f225769h)) {
                        layoutParams.height = rect.bottom - C75044y4.m89996h(this.f225769h);
                    } else {
                        layoutParams.height = rect.bottom;
                    }
                } else {
                    layoutParams.width = Math.min(rect.right, rect.bottom);
                    int i2 = this.f225790s1;
                    if (i2 != 0) {
                        layoutParams.width = i2;
                    }
                }
            }
            this.f225735M.setLayoutParams(layoutParams);
            if (this.f225741R0) {
                if (this.f225731I.size() > 0) {
                    this.f225762d1.setVisibility(8);
                    this.f225753X0.setVisibility(0);
                }
                this.f225764e1.setVisibility(0);
                View view3 = this.f225748V;
                if (view3 != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/widget/dialog/MMBottomSheet", "tryShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/ui/widget/dialog/MMBottomSheet", "tryShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                TextView textView = this.f225750W;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                TextView textView2 = this.f225752X;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                if (this.f225732J.size() > 0) {
                    mo107557b(0);
                    View view4 = this.f225748V;
                    if (view4 != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/widget/dialog/MMBottomSheet", "tryShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/ui/widget/dialog/MMBottomSheet", "tryShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                int size = this.f225733K.size();
                int i3 = C0966R.C0970id.f358732gs0;
                if (size > 0) {
                    LinearLayout linearLayout = this.f225737P;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                        this.f225737P.removeAllViews();
                        this.f225737P.setGravity(17);
                    }
                    View inflate = View.inflate(this.f225769h, C0966R.C0971layout.f6664l6, (ViewGroup) null);
                    LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C0966R.C0970id.gse);
                    int i4 = 0;
                    while (i4 < this.f225733K.size()) {
                        C76875f0 f0Var = (C76875f0) ((ArrayList) this.f225733K.f224704d).get(i4);
                        if (f0Var.f224714f) {
                            view2 = View.inflate(this.f225769h, C0966R.C0971layout.f6662l4, (ViewGroup) null);
                        } else {
                            View inflate2 = View.inflate(this.f225769h, C0966R.C0971layout.f6663l5, (ViewGroup) null);
                            WeImageView weImageView = (WeImageView) inflate2.findViewById(C0966R.C0970id.f358740gt1);
                            TextView textView3 = (TextView) inflate2.findViewById(C0966R.C0970id.gst);
                            TextView textView4 = (TextView) inflate2.findViewById(i3);
                            C76878h0 h0Var = this.f225719A;
                            if (h0Var != null) {
                                h0Var.mo6974a(weImageView, (ImageView) null, f0Var);
                            } else {
                                weImageView.setImageDrawable(f0Var.getIcon());
                            }
                            weImageView.setIconColor(f0Var.f224725t);
                            textView3.setText(f0Var.getTitle());
                            if (f0Var.f224721p != null) {
                                textView4.setVisibility(0);
                                textView4.setText(f0Var.f224721p);
                            }
                            inflate2.setOnClickListener(new C12923n(i4));
                            view2 = inflate2;
                        }
                        linearLayout2.addView(view2);
                        i4++;
                        i3 = C0966R.C0970id.f358732gs0;
                    }
                    this.f225737P.addView(inflate);
                }
                if (this.f225734L.size() > 0) {
                    LinearLayout linearLayout3 = this.f225742S;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(0);
                        this.f225742S.removeAllViews();
                        this.f225742S.setGravity(17);
                    }
                    View inflate3 = View.inflate(this.f225769h, C0966R.C0971layout.f6661l3, (ViewGroup) null);
                    LinearLayout linearLayout4 = (LinearLayout) inflate3.findViewById(C0966R.C0970id.gse);
                    for (int i5 = 0; i5 < this.f225734L.size(); i5++) {
                        C76875f0 f0Var2 = (C76875f0) ((ArrayList) this.f225734L.f224704d).get(i5);
                        if (f0Var2.f224714f) {
                            view = View.inflate(this.f225769h, C0966R.C0971layout.f6659l1, (ViewGroup) null);
                        } else {
                            View inflate4 = View.inflate(this.f225769h, C0966R.C0971layout.f6660l2, (ViewGroup) null);
                            WeImageView weImageView2 = (WeImageView) inflate4.findViewById(C0966R.C0970id.f358740gt1);
                            TextView textView5 = (TextView) inflate4.findViewById(C0966R.C0970id.gst);
                            TextView textView6 = (TextView) inflate4.findViewById(C0966R.C0970id.f358732gs0);
                            C76878h0 h0Var2 = this.f225721B;
                            if (h0Var2 != null) {
                                h0Var2.mo6974a(weImageView2, (ImageView) null, f0Var2);
                            } else {
                                weImageView2.setImageDrawable(f0Var2.getIcon());
                            }
                            weImageView2.setIconColor(f0Var2.f224725t);
                            textView5.setText(f0Var2.getTitle());
                            if (f0Var2.f224721p != null) {
                                textView6.setVisibility(0);
                                textView6.setText(f0Var2.f224721p);
                            }
                            inflate4.setOnClickListener(new C77408a(i5));
                            view = inflate4;
                        }
                        linearLayout4.addView(view);
                    }
                    LinearLayout linearLayout5 = this.f225742S;
                    if (linearLayout5 != null) {
                        linearLayout5.addView(inflate3);
                    }
                } else {
                    LinearLayout linearLayout6 = this.f225742S;
                    if (linearLayout6 != null) {
                        linearLayout6.setVisibility(8);
                    }
                }
                int c = C74942w4.m89786c(this.f225769h, C0966R.dimen.aax);
                int c2 = C74942w4.m89786c(this.f225769h, C0966R.dimen.f3736cp);
                if ((this.f225772i1 && this.f225737P.getVisibility() == 0) || this.f225732J.size() > 0) {
                    c = C74942w4.m89784a(this.f225769h, 0);
                }
                RecyclerView recyclerView = this.f225751W0;
                recyclerView.setPadding(0, c, recyclerView.getPaddingRight(), this.f225751W0.getPaddingBottom());
                LinearLayout linearLayout7 = this.f225742S;
                if (linearLayout7 != null && linearLayout7.getVisibility() == 0) {
                    LinearLayout linearLayout8 = this.f225742S;
                    linearLayout8.setPadding(0, linearLayout8.getPaddingTop(), this.f225742S.getPaddingRight(), c2);
                    RecyclerView recyclerView2 = this.f225753X0;
                    recyclerView2.setPadding(0, recyclerView2.getPaddingTop(), this.f225753X0.getPaddingRight(), c2);
                } else if (mo107562g()) {
                    RecyclerView recyclerView3 = this.f225753X0;
                    recyclerView3.setPadding(0, recyclerView3.getPaddingTop(), this.f225753X0.getPaddingRight(), c2);
                } else {
                    RecyclerView recyclerView4 = this.f225753X0;
                    recyclerView4.setPadding(0, recyclerView4.getPaddingTop(), this.f225753X0.getPaddingRight(), this.f225753X0.getPaddingBottom());
                }
                if (this.f225749V0 != null) {
                    int c3 = C74942w4.m89786c(this.f225769h, C0966R.dimen.aax);
                    if (this.f225772i1 && this.f225737P.getVisibility() == 0) {
                        c3 = 0;
                    }
                    RecyclerView recyclerView5 = this.f225749V0;
                    recyclerView5.setPadding(0, c3, recyclerView5.getPaddingRight(), this.f225749V0.getPaddingBottom());
                }
                this.f225744T.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                if (this.f225744T.getChildAt(0) != null) {
                    Rect rect2 = new Rect();
                    this.f225758a1.getWindowVisibleDisplayFrame(rect2);
                    if (this.f225744T.getChildAt(0).getMeasuredHeight() + C74942w4.m89786c(this.f225769h, C0966R.dimen.f3758d_) > rect2.bottom) {
                        View view5 = this.f225746U;
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar3.mo10233c(0);
                        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/ui/widget/dialog/MMBottomSheet", "tryShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/ui/widget/dialog/MMBottomSheet", "tryShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            } else {
                this.f225751W0.setPadding(0, 0, 0, 0);
            }
            if (!(this.f225730H == null || (uVar = this.f225754Y) == null)) {
                uVar.notifyDataSetChanged();
            }
            C77423u uVar2 = this.f225756Z;
            if (uVar2 != null) {
                uVar2.notifyDataSetChanged();
            }
            C77423u uVar3 = this.f225783p0;
            if (uVar3 != null) {
                uVar3.notifyDataSetChanged();
            }
            this.f225767g.getWindow().addFlags(Integer.MIN_VALUE);
            if (this.f225774j1) {
                this.f225767g.getWindow().addFlags(1024);
            }
            if (this.f225779n1) {
                this.f225767g.getWindow().setFlags(8, 8);
                this.f225767g.getWindow().addFlags(131200);
                this.f225767g.getWindow().getDecorView().setSystemUiVisibility(4102);
            } else {
                this.f225767g.getWindow().clearFlags(8);
                this.f225767g.getWindow().clearFlags(131072);
                this.f225767g.getWindow().clearFlags(128);
                this.f225767g.getWindow().getDecorView().setSystemUiVisibility(0);
            }
            if (this.f225761d != null) {
                this.f225767g.setOnDismissListener(new C77409b());
            }
            this.f225767g.setOnShowListener(new C77410c());
            View view6 = this.f225758a1;
            if (view6 != null) {
                if (this.f225759b1 == null) {
                    z = true;
                }
                ViewTreeObserver viewTreeObserver = view6.getViewTreeObserver();
                this.f225759b1 = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                }
            }
            Context context2 = this.f225769h;
            if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
                this.f225767g.show();
            }
        }
    }

    public C77407n(Context context, boolean z, int i) {
        this.f225736N = Boolean.FALSE;
        this.f225800x0 = false;
        this.f225803y0 = false;
        this.f225739Q0 = false;
        this.f225741R0 = false;
        this.f225755Y0 = false;
        this.f225775k1 = false;
        this.f225776l1 = false;
        this.f225777m1 = false;
        this.f225779n1 = false;
        this.f225781o1 = false;
        this.f225784p1 = false;
        this.f225786q1 = 0;
        this.f225790s1 = 0;
        this.f225792t1 = false;
        this.f225794u1 = false;
        this.f225796v1 = null;
        this.f225798w1 = false;
        this.f225801x1 = false;
        this.f225804y1 = true;
        this.f225806z1 = null;
        this.f225720A1 = null;
        this.f225722B1 = null;
        this.f225724C1 = null;
        this.f225726D1 = false;
        this.f225770h1 = i;
        this.f225769h = context;
        this.f225788r1 = z;
        if (context instanceof Activity) {
            this.f225758a1 = ((ViewGroup) ((Activity) context).getWindow().getDecorView()).findViewById(16908290);
        }
        mo107560e(this.f225769h);
    }
}
