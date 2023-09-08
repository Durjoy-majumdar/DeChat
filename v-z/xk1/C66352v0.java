package xk1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58782w0;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import je1.C60797c3;
import k20.C60958c;
import k20.C9556a;
import nk1.C11193b;
import nr3.C89059e;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import qg1.C62616r;
import qk1.C63197c;
import rx3.C13598b0;
import sk1.C63948b;
import sx3.C36907w;
import te3.C49110d81;
import te3.C50030js1;
import te3.C50173ks1;
import zc1.C66785b;
import zp3.C23564m;

/* renamed from: xk1.v0 */
public final class C66352v0 extends UIComponent implements C11385n, View.OnClickListener {

    /* renamed from: d */
    public View f190992d;

    /* renamed from: e */
    public View f190993e;

    /* renamed from: f */
    public RefreshLoadMoreLayout f190994f;

    /* renamed from: g */
    public RecyclerView f190995g;

    /* renamed from: h */
    public View f190996h;

    /* renamed from: i */
    public View f190997i;

    /* renamed from: j */
    public EditText f190998j;

    /* renamed from: n */
    public TextView f190999n;

    /* renamed from: o */
    public View f191000o;

    /* renamed from: p */
    public C60797c3 f191001p;

    /* renamed from: q */
    public String f191002q = "";

    /* renamed from: r */
    public String f191003r = "";

    /* renamed from: s */
    public boolean f191004s;

    /* renamed from: t */
    public final ArrayList<C50173ks1> f191005t = new ArrayList<>();

    /* renamed from: u */
    public final C63197c f191006u = new C63197c();

    /* renamed from: xk1.v0$a */
    public static final class C66353a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C66352v0 f191007a;

        /* renamed from: b */
        public final /* synthetic */ String f191008b;

        /* renamed from: c */
        public final /* synthetic */ C63948b f191009c;

        /* renamed from: d */
        public final /* synthetic */ boolean f191010d;

        public C66353a(C66352v0 v0Var, String str, C63948b bVar, boolean z) {
            this.f191007a = v0Var;
            this.f191008b = str;
            this.f191009c = bVar;
            this.f191010d = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:59:0x0050 A[EDGE_INSN: B:59:0x0050->B:23:0x0050 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r11) {
            /*
                r10 = this;
                ob0.b$c r11 = (ob0.C89132b.C89134c) r11
                int r0 = r11.f256793a
                java.lang.String r1 = "Finder.FinderGameLiveSearchUIC"
                r2 = 0
                if (r0 != 0) goto L_0x00d9
                int r0 = r11.f256794b
                if (r0 != 0) goto L_0x00d9
                T r11 = r11.f256796d
                te3.m11 r11 = (te3.C50336m11) r11
                java.util.LinkedList<te3.qs1> r11 = r11.f137744d
                java.lang.String r0 = "it.resp.game_user_info_list"
                gy3.C87412m.m108593f(r11, r0)
                java.lang.String r0 = r10.f191008b
                java.util.Iterator r11 = r11.iterator()
            L_0x001e:
                boolean r3 = r11.hasNext()
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L_0x004f
                java.lang.Object r3 = r11.next()
                r6 = r3
                te3.qs1 r6 = (te3.C51006qs1) r6
                te3.kr1 r7 = r6.f140523e
                if (r7 == 0) goto L_0x0034
                java.lang.String r7 = r7.f137001d
                goto L_0x0035
            L_0x0034:
                r7 = r4
            L_0x0035:
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 != 0) goto L_0x004b
                te3.kr1 r6 = r6.f140523e
                if (r6 == 0) goto L_0x0042
                java.lang.String r6 = r6.f137001d
                goto L_0x0043
            L_0x0042:
                r6 = r4
            L_0x0043:
                boolean r6 = gy3.C87412m.m108589b(r6, r0)
                if (r6 == 0) goto L_0x004b
                r6 = 1
                goto L_0x004c
            L_0x004b:
                r6 = 0
            L_0x004c:
                if (r6 == 0) goto L_0x001e
                goto L_0x0050
            L_0x004f:
                r3 = r4
            L_0x0050:
                te3.qs1 r3 = (te3.C51006qs1) r3
                if (r3 == 0) goto L_0x00d1
                java.lang.String r11 = r10.f191008b
                sk1.b r0 = r10.f191009c
                boolean r4 = r10.f191010d
                xk1.v0 r6 = r10.f191007a
                android.content.Intent r7 = new android.content.Intent
                r7.<init>()
                byte[] r8 = r3.toByteArray()
                java.lang.String r9 = "GameUserInfo"
                r7.putExtra(r9, r8)
                java.lang.String r8 = ""
                java.lang.String r9 = "TICKET"
                r7.putExtra(r9, r8)
                java.lang.String r9 = "APPID"
                r7.putExtra(r9, r11)
                te3.ks1 r11 = r0.f181275d
                te3.js1 r11 = r11.f137024e
                if (r11 == 0) goto L_0x0083
                te3.c05 r11 = r11.f136295r
                if (r11 == 0) goto L_0x0083
                int r11 = r11.f131436e
                goto L_0x0084
            L_0x0083:
                r11 = 0
            L_0x0084:
                java.lang.String r0 = "VERSION_TYPE"
                r7.putExtra(r0, r11)
                java.lang.String r11 = "POST_FROM_SCENE"
                r7.putExtra(r11, r2)
                if (r4 == 0) goto L_0x0092
                r11 = 2
                goto L_0x0093
            L_0x0092:
                r11 = 3
            L_0x0093:
                java.lang.String r0 = "MINI_GAME_SCENE"
                r7.putExtra(r0, r11)
                te3.kr1 r11 = r3.f140523e
                if (r11 == 0) goto L_0x00a1
                int r11 = r11.f137014t
                if (r11 != 0) goto L_0x00a1
                r2 = 1
            L_0x00a1:
                if (r2 == 0) goto L_0x00c0
                te3.as1 r11 = r3.f140525g
                if (r11 == 0) goto L_0x00ab
                java.lang.String r11 = r11.f130748d
                if (r11 != 0) goto L_0x00ac
            L_0x00ab:
                r11 = r8
            L_0x00ac:
                java.lang.String r0 = "DESC"
                r7.putExtra(r0, r11)
                te3.as1 r11 = r3.f140525g
                if (r11 == 0) goto L_0x00bb
                java.lang.String r11 = r11.f130749e
                if (r11 != 0) goto L_0x00ba
                goto L_0x00bb
            L_0x00ba:
                r8 = r11
            L_0x00bb:
                java.lang.String r11 = "COVER_URL"
                r7.putExtra(r11, r8)
            L_0x00c0:
                java.lang.Class<tf0.o1> r11 = tf0.C13883o1.class
                di3.d r11 = di3.C86312j.m106911c(r11)
                tf0.o1 r11 = (tf0.C13883o1) r11
                android.app.Activity r0 = r6.getContext()
                r11.mo13281h6(r0, r7)
                rx3.b0 r4 = rx3.C13598b0.f38549a
            L_0x00d1:
                if (r4 != 0) goto L_0x00f4
                java.lang.String r11 = "CgiFinderLiveGetUserGameConfig error, no match game"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
                goto L_0x00f4
            L_0x00d9:
                java.lang.String r11 = "CgiFinderLiveGetUserGameConfig error, toast"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
                xk1.v0 r11 = r10.f191007a
                android.app.Activity r11 = r11.getContext()
                xk1.v0 r0 = r10.f191007a
                r1 = 2131827489(0x7f111b21, float:1.9287892E38)
                java.lang.String r0 = r0.getString(r1)
                android.widget.Toast r11 = nj3.C76912y0.makeText((android.content.Context) r11, (java.lang.CharSequence) r0, (int) r2)
                r11.show()
            L_0x00f4:
                rx3.b0 r11 = rx3.C13598b0.f38549a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: xk1.C66352v0.C66353a.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: xk1.v0$b */
    public static final class C66354b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66352v0 f191011d;

        /* renamed from: e */
        public final /* synthetic */ int f191012e;

        /* renamed from: f */
        public final /* synthetic */ int f191013f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66354b(C66352v0 v0Var, int i, int i2) {
            super(0);
            this.f191011d = v0Var;
            this.f191012e = i;
            this.f191013f = i2;
        }

        public Object invoke() {
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f191011d.f190994f;
            View loadMoreFooter = refreshLoadMoreLayout != null ? refreshLoadMoreLayout.getLoadMoreFooter() : null;
            if (loadMoreFooter != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(loadMoreFooter, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$onSceneEnd$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                loadMoreFooter.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(loadMoreFooter, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$onSceneEnd$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f191011d.f190994f;
            if (refreshLoadMoreLayout2 != null) {
                refreshLoadMoreLayout2.mo82440F(0);
            }
            View view = this.f191011d.f191000o;
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$onSceneEnd$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$onSceneEnd$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.f191011d.f191005t.isEmpty()) {
                TextView textView = this.f191011d.f190999n;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                RecyclerView recyclerView = this.f191011d.f190995g;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
            } else {
                TextView textView2 = this.f191011d.f190999n;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                RecyclerView recyclerView2 = this.f191011d.f190995g;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(0);
                }
                C66352v0 v0Var = this.f191011d;
                C63197c cVar = v0Var.f191006u;
                ArrayList<C50173ks1> arrayList = v0Var.f191005t;
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                Iterator<C50173ks1> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C63948b(it.next()));
                }
                boolean z = this.f191011d.f191004s;
                cVar.getClass();
                cVar.f179302d.clear();
                cVar.f179302d.addAll(arrayList2);
                cVar.f179304f = z;
            }
            int i = this.f191012e;
            if (i == 0) {
                this.f191011d.f191006u.notifyDataSetChanged();
            } else {
                int i2 = this.f191013f;
                if (i < i2) {
                    this.f191011d.f191006u.notifyItemRangeInserted(i, i2 - i);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66352v0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static final void m78264c3(C66352v0 v0Var, boolean z) {
        v0Var.getClass();
        Class cls = C66350u0.class;
        if (z) {
            C66350u0 u0Var = (C66350u0) C39818r.f106831a.mo62443b(v0Var.getContext()).mo75002a(cls);
            if (u0Var.f190990n.getItemCount() > 0) {
                LinearLayout linearLayout = u0Var.f190986g;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                } else {
                    C87412m.m108603p("container");
                    throw null;
                }
            }
        } else {
            LinearLayout linearLayout2 = ((C66350u0) C39818r.f106831a.mo62443b(v0Var.getContext()).mo75002a(cls)).f190986g;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            } else {
                C87412m.m108603p("container");
                throw null;
            }
        }
    }

    /* renamed from: d3 */
    public final void mo90452d3(C63948b bVar, boolean z) {
        String str;
        C87412m.m108594g(bVar, "gameSearchItem");
        C50030js1 js12 = bVar.f181275d.f137024e;
        if (js12 == null || (str = js12.f136284d) == null) {
            str = "";
        }
        C62616r rVar = new C62616r(str, 0, false);
        rVar.mo85582k(getActivity(), getResources().getString(C0966R.string.ett), 500);
        C89059e i = rVar.mo9225i();
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        i.mo11397F((MMActivity) activity).mo123420E(new C66353a(this, str, bVar, z));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.acp;
    }

    public void onClick(View view) {
        EditText editText;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (!(valueOf == null || valueOf.intValue() != C0966R.C0970id.dl4 || (editText = this.f190998j) == null)) {
            editText.setText("");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f190992d = getActivity().findViewById(C0966R.C0970id.eni);
        this.f190993e = getActivity().findViewById(C0966R.C0970id.enl);
        this.f190994f = (RefreshLoadMoreLayout) getActivity().findViewById(C0966R.C0970id.ivb);
        this.f190995g = (RecyclerView) getActivity().findViewById(C0966R.C0970id.dla);
        this.f190996h = getActivity().findViewById(C0966R.C0970id.f358140dl3);
        this.f190997i = getActivity().findViewById(C0966R.C0970id.dl4);
        this.f190998j = (EditText) getActivity().findViewById(C0966R.C0970id.dl5);
        this.f190999n = (TextView) getActivity().findViewById(C0966R.C0970id.dl6);
        this.f191000o = getActivity().findViewById(C0966R.C0970id.dl_);
        C58782w0.f168290a.mo83842a(this.f190992d);
        View view = this.f190993e;
        if (view != null) {
            view.post(new C15788w0(this));
        }
        View view2 = this.f190993e;
        if (view2 != null) {
            view2.setOnClickListener(new C15791x0(this));
        }
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f190994f;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.setEnablePullDownHeader(false);
        }
        View view3 = this.f190992d;
        if (view3 != null) {
            C11193b.f33003a.mo11281b(C66785b.f191882e.mo90662O5(), "", view3, (C32226l<? super Boolean, C13598b0>) null);
            View inflate = C85868k2.m106137b(view3.getContext()).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.g2t);
            if (textView != null) {
                textView.setTextColor(view3.getContext().getResources().getColor(C0966R.color.f3553xj));
            }
            RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f190994f;
            if (refreshLoadMoreLayout2 != null) {
                refreshLoadMoreLayout2.setLoadMoreFooter(inflate);
            }
        }
        RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f190994f;
        if (refreshLoadMoreLayout3 != null) {
            refreshLoadMoreLayout3.setActionCallback(new C66365y0(this));
        }
        RecyclerView recyclerView = this.f190995g;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.f190995g;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f191006u);
        }
        RecyclerView recyclerView3 = this.f190995g;
        if (recyclerView3 != null) {
            C23564m.m28137g(recyclerView3, new C66367z0());
        }
        EditText editText = this.f190998j;
        if (editText != null) {
            editText.addTextChangedListener(new C66289a1(this));
        }
        EditText editText2 = this.f190998j;
        if (editText2 != null) {
            editText2.setOnEditorActionListener(new C66291b1(this));
        }
        EditText editText3 = this.f190998j;
        if (editText3 != null) {
            editText3.postDelayed(new C66294c1(this), 128);
        }
        View view4 = this.f190996h;
        if (view4 != null) {
            view4.setOnClickListener(this);
        }
        View view5 = this.f190997i;
        if (view5 != null) {
            view5.setOnClickListener(this);
        }
        this.f191006u.f179303e = new C66296d1(this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C49110d81 d812;
        C86709a0.m107524d().mo123470p(4140, this);
        int size = this.f191005t.size();
        if (i == 0 && i2 == 0) {
            C60797c3 c3Var = yVar instanceof C60797c3 ? (C60797c3) yVar : null;
            if (!(c3Var == null || (d812 = c3Var.f173168i) == null)) {
                this.f191005t.addAll(d812.f132181d);
                String str2 = d812.f132183f;
                if (str2 == null) {
                    str2 = "";
                }
                this.f191003r = str2;
                this.f191004s = d812.f132182e;
            }
        }
        int size2 = this.f191005t.size();
        Log.m105924i("Finder.FinderGameLiveSearchUIC", "originSize:" + size + ", currentSize:" + size2 + ", offset:" + this.f191003r + ", hasNext:" + this.f191004s);
        C61926c.m72668M(new C66354b(this, size, size2));
    }
}
