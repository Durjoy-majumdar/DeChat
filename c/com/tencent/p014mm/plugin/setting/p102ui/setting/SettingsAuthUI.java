package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.plugin.setting.p102ui.setting.C42990q1;
import com.tencent.p014mm.plugin.setting.p102ui.setting.C42993r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C11184p0;
import nj3.C76912y0;
import p192l4.C10462b;
import qo3.C77407n;
import qo3.C89779i0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import te3.io4;
import te3.jo4;
import um2.C52584a;
import uo3.C78253a;
import vo3.C78461f;
import xm2.C15862w;
import xm2.C38760t;
import xm2.C38762v;
import ym2.C53544a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "a", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI */
public final class SettingsAuthUI extends MMActivity {

    /* renamed from: x */
    public static final /* synthetic */ int f116233x = 0;

    /* renamed from: d */
    public final C13601g f116234d = C36568h.m40985a(new C42944l(this));

    /* renamed from: e */
    public View f116235e;

    /* renamed from: f */
    public int f116236f;

    /* renamed from: g */
    public int f116237g;

    /* renamed from: h */
    public int f116238h;

    /* renamed from: i */
    public int f116239i;

    /* renamed from: j */
    public int f116240j = -1;

    /* renamed from: n */
    public C42929a f116241n;

    /* renamed from: o */
    public byte[] f116242o;

    /* renamed from: p */
    public Integer f116243p;

    /* renamed from: q */
    public boolean f116244q;

    /* renamed from: r */
    public boolean f116245r;

    /* renamed from: s */
    public int f116246s = -1;

    /* renamed from: t */
    public C89779i0 f116247t;

    /* renamed from: u */
    public C78253a f116248u;

    /* renamed from: v */
    public boolean f116249v;

    /* renamed from: w */
    public View f116250w;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$b */
    public static final class C5267b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsAuthUI f20828d;

        public C5267b(SettingsAuthUI settingsAuthUI) {
            this.f20828d = settingsAuthUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20828d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$d */
    public static final class C5268d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ProgressBar f20829d;

        /* renamed from: e */
        public final /* synthetic */ SettingsAuthUI f20830e;

        public C5268d(ProgressBar progressBar, SettingsAuthUI settingsAuthUI) {
            this.f20829d = progressBar;
            this.f20830e = settingsAuthUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f20829d.setVisibility(0);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SettingsAuthUI.m46599H7(this.f20830e);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$a */
    public static final class C42929a extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public final Context f116251d;

        /* renamed from: e */
        public final LoadMoreRecyclerView f116252e;

        /* renamed from: f */
        public final List<C42933d> f116253f = new ArrayList();

        /* renamed from: g */
        public boolean f116254g;

        /* renamed from: h */
        public boolean f116255h = true;

        /* renamed from: i */
        public int f116256i;

        /* renamed from: j */
        public C42932c f116257j;

        /* renamed from: n */
        public int f116258n;

        /* renamed from: o */
        public int f116259o;

        /* renamed from: p */
        public int f116260p;

        /* renamed from: q */
        public int f116261q;

        /* renamed from: r */
        public int f116262r;

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$a$a */
        public static final class C42930a extends RecyclerView.C16631z {

            /* renamed from: A */
            public final MMNeat7extView f116263A;

            /* renamed from: B */
            public final TextView f116264B;

            /* renamed from: C */
            public final NeatTextView f116265C;

            /* renamed from: z */
            public final RelativeLayout f116266z;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C42930a(View view) {
                super(view);
                C87412m.m108594g(view, "itemView");
                this.f116266z = (RelativeLayout) view.findViewById(C0966R.C0970id.f359174je3);
                this.f116263A = (MMNeat7extView) view.findViewById(C0966R.C0970id.je4);
                this.f116264B = (TextView) view.findViewById(C0966R.C0970id.je7);
                this.f116265C = (NeatTextView) view.findViewById(C0966R.C0970id.je5);
            }
        }

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$a$b */
        public static final class C42931b extends RecyclerView.C16631z {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C42931b(View view) {
                super(view);
                C87412m.m108594g(view, "itemView");
            }
        }

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$a$c */
        public interface C42932c {
            /* renamed from: a */
            void mo67130a(View view, int i, io4 io4, int i2, int i3);

            /* renamed from: b */
            void mo67131b(int i, io4 io4);
        }

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$a$d */
        public static final class C42933d {

            /* renamed from: a */
            public final int f116267a;

            /* renamed from: b */
            public final io4 f116268b;

            public C42933d(int i, io4 io4) {
                this.f116267a = i;
                this.f116268b = io4;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C42933d)) {
                    return false;
                }
                C42933d dVar = (C42933d) obj;
                return this.f116267a == dVar.f116267a && C87412m.m108589b(this.f116268b, dVar.f116268b);
            }

            public int hashCode() {
                int i = this.f116267a * 31;
                io4 io4 = this.f116268b;
                return i + (io4 == null ? 0 : io4.hashCode());
            }

            public String toString() {
                return "UserAuthAppWrapper(itemType=" + this.f116267a + ", userAuthApp=" + this.f116268b + ')';
            }
        }

        public C42929a(Context context, LoadMoreRecyclerView loadMoreRecyclerView) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(loadMoreRecyclerView, "recyclerView");
            this.f116251d = context;
            this.f116252e = loadMoreRecyclerView;
            int A = (((C76577a.m92145A(context) - (context.getResources().getDimensionPixelSize(C0966R.dimen.f3749d0) * 2)) - context.getResources().getDimensionPixelSize(C0966R.dimen.f3722cc)) - context.getResources().getDimensionPixelSize(C0966R.dimen.f3743cv)) - context.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv);
            this.f116260p = A;
            int i = A / 2;
            this.f116261q = i;
            this.f116262r = A / 2;
            Log.m105925i("MicroMsg.SettingsAuthUI", "computeViewWidth appName: %s, appType: %s, content: %s", Integer.valueOf(i), Integer.valueOf(this.f116262r), Integer.valueOf(this.f116260p));
        }

        /* renamed from: F4 */
        public final boolean mo67128F4() {
            return this.f116256i <= 0;
        }

        /* renamed from: G4 */
        public final boolean mo67129G4(int i) {
            Log.m105924i("MicroMsg.SettingsAuthUI", "removeAuthItem position: " + i + ", size: " + getItemCount());
            if (!(i >= 0 && i < getItemCount())) {
                return false;
            }
            ((ArrayList) this.f116253f).remove(i);
            this.f116256i--;
            notifyItemRemoved(i);
            return true;
        }

        public int getItemCount() {
            return ((ArrayList) this.f116253f).size();
        }

        public int getItemViewType(int i) {
            C42933d dVar = (C42933d) C110818d0.m150917O(this.f116253f, i);
            if (dVar != null) {
                return dVar.f116267a;
            }
            return 1;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "holder");
            if (zVar instanceof C42930a) {
                C42930a aVar = (C42930a) zVar;
                C42933d dVar = (C42933d) C110818d0.m150917O(this.f116253f, i);
                io4 io4 = dVar != null ? dVar.f116268b : null;
                if (io4 != null) {
                    aVar.f116263A.mo104279b(io4.f135549e);
                    String string = this.f116251d.getResources().getString(C0966R.string.f361264im2);
                    C87412m.m108593f(string, "context.resources.getStr….string.seperator_marker)");
                    LinkedList<jo4> linkedList = io4.f135551g;
                    String str = "";
                    String S = linkedList == null ? str : C110818d0.m150921S(C38762v.m41920a(linkedList), string, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C38760t.f104564d, 30, (Object) null);
                    boolean z = true;
                    if (S.length() > 0) {
                        aVar.f116265C.mo104279b(S);
                        aVar.f116265C.setVisibility(0);
                    } else {
                        aVar.f116265C.mo104279b(str);
                        aVar.f116265C.setVisibility(4);
                    }
                    String str2 = io4.f135553i;
                    if (!(str2 == null || str2.length() == 0)) {
                        aVar.f116264B.setText(io4.f135553i);
                        aVar.f116264B.setVisibility(0);
                    } else {
                        aVar.f116264B.setText(str);
                        aVar.f116264B.setVisibility(8);
                    }
                    MMNeat7extView mMNeat7extView = aVar.f116263A;
                    C87412m.m108593f(mMNeat7extView, "authName");
                    TextView textView = aVar.f116264B;
                    C87412m.m108593f(textView, "authType");
                    C15862w.m14786a(mMNeat7extView, textView, this.f116260p, this.f116261q, this.f116262r, true);
                    aVar.f116266z.setOnTouchListener(new C42995s1(this));
                    aVar.f116266z.setOnClickListener(new C42996t1(this, i, io4));
                    RelativeLayout relativeLayout = aVar.f116266z;
                    if (relativeLayout != null) {
                        relativeLayout.setOnLongClickListener(new C42997u1(this, i, io4));
                    }
                    RelativeLayout relativeLayout2 = aVar.f116266z;
                    String str3 = io4.f135549e;
                    if (!(str3 == null || str3.length() == 0)) {
                        str = io4.f135549e;
                        C87412m.m108593f(str, "userAuthApp.appname");
                    }
                    String str4 = io4.f135553i;
                    if (!(str4 == null || str4.length() == 0)) {
                        str = str + ',' + io4.f135553i;
                    }
                    if (S.length() > 0) {
                        str = str + ',' + S;
                    }
                    if (str.length() <= 0) {
                        z = false;
                    }
                    if (z && relativeLayout2 != null) {
                        relativeLayout2.setContentDescription(str);
                    }
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            if (i == 2) {
                View inflate = LayoutInflater.from(this.f116251d).inflate(C0966R.C0971layout.b54, viewGroup, false);
                C87412m.m108593f(inflate, "view");
                return new C42931b(inflate);
            }
            View inflate2 = LayoutInflater.from(this.f116251d).inflate(C0966R.C0971layout.f359851b53, viewGroup, false);
            C87412m.m108593f(inflate2, "view");
            return new C42930a(inflate2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$c */
    public static final class C42934c implements C42929a.C42932c {

        /* renamed from: a */
        public final /* synthetic */ SettingsAuthUI f116269a;

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$c$a */
        public static final class C42935a implements View.OnCreateContextMenuListener {

            /* renamed from: d */
            public final /* synthetic */ SettingsAuthUI f116270d;

            public C42935a(SettingsAuthUI settingsAuthUI) {
                this.f116270d = settingsAuthUI;
            }

            public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                contextMenu.add(0, 1, 0, this.f116270d.getString(C0966R.string.iq7));
            }
        }

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$c$b */
        public static final class C42936b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ SettingsAuthUI f116271d;

            /* renamed from: e */
            public final /* synthetic */ int f116272e;

            /* renamed from: f */
            public final /* synthetic */ io4 f116273f;

            public C42936b(SettingsAuthUI settingsAuthUI, int i, io4 io4) {
                this.f116271d = settingsAuthUI;
                this.f116272e = i;
                this.f116273f = io4;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (menuItem.getItemId() == 1) {
                    this.f116271d.f116246s = this.f116272e;
                    C53544a.f150509a.mo74208a(202, this.f116273f);
                    SettingsAuthUI settingsAuthUI = this.f116271d;
                    io4 io4 = this.f116273f;
                    C77407n nVar = new C77407n((Context) settingsAuthUI.getContext(), 1, true);
                    String string = settingsAuthUI.getResources().getString(C0966R.string.iq8);
                    C87412m.m108593f(string, "resources.getString(R.st…h_del_auth_confirm_title)");
                    Object[] objArr = new Object[1];
                    String str = io4.f135549e;
                    if (str == null) {
                        str = "";
                    }
                    objArr[0] = str;
                    String format = String.format(string, Arrays.copyOf(objArr, 1));
                    C87412m.m108593f(format, "format(format, *args)");
                    nVar.mo107568m(format, 17, C76577a.m92151b(settingsAuthUI, 14));
                    nVar.f225771i = new C5404v1(settingsAuthUI);
                    nVar.f225782p = new C42998w1(io4, settingsAuthUI);
                    nVar.mo107573q();
                }
            }
        }

        public C42934c(SettingsAuthUI settingsAuthUI) {
            this.f116269a = settingsAuthUI;
        }

        /* renamed from: a */
        public void mo67130a(View view, int i, io4 io4, int i2, int i3) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(io4, "userAuthApp");
            Log.m105924i("MicroMsg.SettingsAuthUI", "onLongClick position: " + i + ", appId: " + io4.f135548d);
            SettingsAuthUI settingsAuthUI = this.f116269a;
            C78253a aVar = settingsAuthUI.f116248u;
            if (aVar != null) {
                aVar.mo108273h(view, new C42935a(settingsAuthUI), new C42936b(settingsAuthUI, i, io4), i2, i3);
            }
            C53544a.f150509a.mo74208a(201, io4);
        }

        /* renamed from: b */
        public void mo67131b(int i, io4 io4) {
            C87412m.m108594g(io4, "userAuthApp");
            try {
                this.f116269a.f116246s = i;
                Intent intent = new Intent(this.f116269a.getContext(), SettingsDelAuthUI.class);
                intent.putExtra("key_user_auth_app", io4.toByteArray());
                this.f116269a.startActivityForResult(intent, 1000);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SettingsAuthUI", e, "jump to SettingsDelAuthUI exception", new Object[0]);
            }
            C53544a.f150509a.mo74208a(204, io4);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$e */
    public static final class C42937e implements LoadMoreRecyclerView.C40579c {

        /* renamed from: a */
        public final /* synthetic */ ProgressBar f116274a;

        /* renamed from: b */
        public final /* synthetic */ SettingsAuthUI f116275b;

        public C42937e(ProgressBar progressBar, SettingsAuthUI settingsAuthUI) {
            this.f116274a = progressBar;
            this.f116275b = settingsAuthUI;
        }

        /* renamed from: a */
        public final void mo23454a(LoadMoreRecyclerView loadMoreRecyclerView, RecyclerView.C16613e eVar) {
            if (this.f116274a.getVisibility() == 0) {
                SettingsAuthUI.m46599H7(this.f116275b);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$f */
    public static final class C42938f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsAuthUI f116276d;

        public C42938f(SettingsAuthUI settingsAuthUI) {
            this.f116276d = settingsAuthUI;
        }

        public void onGlobalLayout() {
            View view = this.f116276d.f116235e;
            C87412m.m108591d(view);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            SettingsAuthUI settingsAuthUI = this.f116276d;
            View view2 = settingsAuthUI.f116235e;
            C87412m.m108591d(view2);
            settingsAuthUI.f116236f = view2.getMeasuredHeight();
            Log.m105927v("MicroMsg.SettingsAuthUI", "onGlobalLayout headerView height: %s", Integer.valueOf(this.f116276d.f116236f));
            if (SettingsAuthUI.m46601J7(this.f116276d)) {
                this.f116276d.mo67126N7(true);
                SettingsAuthUI.m46600I7(this.f116276d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$g */
    public static final class C42939g extends RecyclerView.C0130p {

        /* renamed from: d */
        public int f116277d;

        /* renamed from: e */
        public final /* synthetic */ SettingsAuthUI f116278e;

        public C42939g(SettingsAuthUI settingsAuthUI) {
            this.f116278e = settingsAuthUI;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            boolean z = false;
            Log.m105927v("MicroMsg.SettingsAuthUI", "onScrolled y: %s, dy: %s", Integer.valueOf(this.f116277d), Integer.valueOf(i2));
            C42929a aVar = this.f116278e.f116241n;
            if (aVar != null && aVar.mo67128F4()) {
                z = true;
            }
            float f = 0.0f;
            if (z) {
                this.f116278e.getMMTitleView().setAlpha(0.0f);
                C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            int i3 = this.f116277d + i2;
            this.f116277d = i3;
            SettingsAuthUI settingsAuthUI = this.f116278e;
            int i4 = settingsAuthUI.f116237g;
            if (i3 >= i4) {
                int i5 = settingsAuthUI.f116238h;
                f = i3 > i5 ? 1.0f : (((float) (i3 - i4)) * 1.0f) / ((float) (i5 - i4));
            }
            settingsAuthUI.getMMTitleView().setAlpha(f);
            SettingsAuthUI settingsAuthUI2 = this.f116278e;
            Integer num = settingsAuthUI2.f116243p;
            C87412m.m108591d(num);
            settingsAuthUI2.setActionbarColor(C74933u4.m89764a(num.intValue(), (int) (f * ((float) 100))));
            MMActivityController controller = this.f116278e.getController();
            Integer num2 = this.f116278e.f116243p;
            C87412m.m108591d(num2);
            controller.mo177105z0(num2.intValue());
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$h */
    public static final class C42940h implements C42990q1.C42991a {

        /* renamed from: a */
        public final /* synthetic */ SettingsAuthUI f116279a;

        public C42940h(SettingsAuthUI settingsAuthUI) {
            this.f116279a = settingsAuthUI;
        }

        /* renamed from: a */
        public void mo67137a(int i, int i2, String str) {
            Log.m105920e("MicroMsg.SettingsAuthUI", "getAuthData onFailed errType: " + i + ", errCode: " + i2 + ", errMsg: " + str);
            SettingsAuthUI settingsAuthUI = this.f116279a;
            settingsAuthUI.f116249v = false;
            settingsAuthUI.mo67126N7(false);
            C42929a aVar = this.f116279a.f116241n;
            if (aVar != null && aVar.mo67128F4()) {
                this.f116279a.mo67125M7(true);
                this.f116279a.mo67127O7(false, "");
                return;
            }
            View view = this.f116279a.f116250w;
            C87412m.m108591d(view);
            ((LinearLayout) view.findViewById(C0966R.C0970id.g3l)).setVisibility(0);
            View view2 = this.f116279a.f116250w;
            C87412m.m108591d(view2);
            ((ProgressBar) view2.findViewById(C0966R.C0970id.g3k)).setVisibility(8);
        }

        /* renamed from: b */
        public void mo67138b(C42990q1.C42992b bVar) {
            boolean z;
            int i;
            C87412m.m108594g(bVar, "authData");
            SettingsAuthUI settingsAuthUI = this.f116279a;
            settingsAuthUI.f116249v = false;
            settingsAuthUI.f116242o = bVar.f116404c;
            C42929a aVar = settingsAuthUI.f116241n;
            if (aVar != null) {
                if (!bVar.f116402a) {
                    aVar.f116254g = false;
                    ((ArrayList) aVar.f116253f).clear();
                    z = true;
                } else {
                    z = false;
                }
                List<io4> list = bVar.f116403b;
                if (!(list == null || list.isEmpty())) {
                    i = !aVar.f116255h ? ((ArrayList) aVar.f116253f).size() : 0;
                    aVar.f116256i += bVar.f116403b.size();
                    List<C42929a.C42933d> list2 = aVar.f116253f;
                    List<io4> list3 = bVar.f116403b;
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(list3, 10));
                    for (io4 dVar : list3) {
                        arrayList.add(new C42929a.C42933d(1, dVar));
                    }
                    ((ArrayList) list2).addAll(arrayList);
                } else {
                    i = 0;
                }
                Integer num = null;
                if (bVar.f116404c == null) {
                    if (!aVar.f116254g) {
                        aVar.f116254g = true;
                        ((ArrayList) aVar.f116253f).add(new C42929a.C42933d(2, (io4) null));
                    }
                    aVar.f116252e.mo63430I(false);
                } else {
                    aVar.f116252e.mo63430I(true);
                }
                if (z) {
                    aVar.notifyDataSetChanged();
                } else {
                    aVar.notifyItemRangeInserted(i, ((ArrayList) aVar.f116253f).size() - i);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("updateAuthData loadFirst: ");
                sb.append(aVar.f116255h);
                sb.append(", loadFinished: ");
                sb.append(aVar.f116254g);
                sb.append(", requestNextPage: ");
                sb.append(bVar.f116402a);
                sb.append(", getDataSize: ");
                List<io4> list4 = bVar.f116403b;
                if (list4 != null) {
                    num = Integer.valueOf(list4.size());
                }
                sb.append(num);
                sb.append(", currentDataSize: ");
                sb.append(aVar.f116256i);
                sb.append(", insertPosition: ");
                sb.append(i);
                Log.m105924i("MicroMsg.SettingsAuthUI", sb.toString());
                aVar.f116255h = false;
            }
            this.f116279a.mo67126N7(false);
            this.f116279a.mo67123K7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$i */
    public static final class C42941i implements C42993r1.C42994a {

        /* renamed from: a */
        public final /* synthetic */ SettingsAuthUI f116280a;

        public C42941i(SettingsAuthUI settingsAuthUI) {
            this.f116280a = settingsAuthUI;
        }

        /* renamed from: a */
        public void mo67139a(int i, int i2, String str) {
            C89779i0 i0Var = this.f116280a.f116247t;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C76912y0.m92767f(this.f116280a.getContext(), this.f116280a.getResources().getString(C0966R.string.iq9));
        }

        public void onSuccess() {
            C89779i0 i0Var = this.f116280a.f116247t;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C76912y0.m92768g(this.f116280a.getContext(), this.f116280a.getResources().getString(C0966R.string.iqa));
            SettingsAuthUI settingsAuthUI = this.f116280a;
            C42929a aVar = settingsAuthUI.f116241n;
            boolean z = true;
            if (aVar == null || !aVar.mo67129G4(settingsAuthUI.f116246s)) {
                z = false;
            }
            if (z) {
                this.f116280a.mo67123K7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$j */
    public static final class C42942j implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsAuthUI f116281d;

        public C42942j(SettingsAuthUI settingsAuthUI) {
            this.f116281d = settingsAuthUI;
        }

        public void onGlobalLayout() {
            SettingsAuthUI settingsAuthUI = this.f116281d;
            int i = SettingsAuthUI.f116233x;
            settingsAuthUI.mo67124L7().f146869a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int A = C76577a.m92145A(this.f116281d);
            int j = C76577a.m92159j(this.f116281d);
            SettingsAuthUI settingsAuthUI2 = this.f116281d;
            settingsAuthUI2.f116239i = Math.min(Math.max(settingsAuthUI2.mo67124L7().f146869a.getMeasuredHeight(), 0), j);
            Log.m105926v("MicroMsg.SettingsAuthUI", "onGlobalLayout width: " + A + ", height: " + j + ", root_container: " + this.f116281d.mo67124L7().f146869a.getMeasuredHeight() + ", rootViewHeight: " + this.f116281d.f116239i);
            if (SettingsAuthUI.m46601J7(this.f116281d)) {
                this.f116281d.mo67126N7(true);
                SettingsAuthUI.m46600I7(this.f116281d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$k */
    public static final class C42943k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SettingsAuthUI f116282d;

        public C42943k(SettingsAuthUI settingsAuthUI) {
            this.f116282d = settingsAuthUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsAuthUI settingsAuthUI = this.f116282d;
            int i = SettingsAuthUI.f116233x;
            settingsAuthUI.mo67125M7(false);
            this.f116282d.mo67126N7(true);
            C39818r rVar = C39818r.f106831a;
            AppCompatActivity context = this.f116282d.getContext();
            C87412m.m108593f(context, "context");
            ((C42990q1) rVar.mo62444c(context).mo75002a(C42990q1.class)).mo67193c3((byte[]) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI$l */
    public static final class C42944l extends C87413o implements C32224a<C52584a> {

        /* renamed from: d */
        public final /* synthetic */ SettingsAuthUI f116283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42944l(SettingsAuthUI settingsAuthUI) {
            super(0);
            this.f116283d = settingsAuthUI;
        }

        public Object invoke() {
            View findViewById = this.f116283d.findViewById(C0966R.C0970id.iwf);
            RelativeLayout relativeLayout = (RelativeLayout) findViewById;
            int i = C0966R.C0970id.jdy;
            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.jdy);
            if (linearLayout != null) {
                i = C0966R.C0970id.jdz;
                TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.jdz);
                if (textView != null) {
                    i = C0966R.C0970id.je_;
                    ProgressBar progressBar = (ProgressBar) C10462b.m10395a(findViewById, C0966R.C0970id.je_);
                    if (progressBar != null) {
                        i = C0966R.C0970id.jea;
                        LoadMoreRecyclerView loadMoreRecyclerView = (LoadMoreRecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.jea);
                        if (loadMoreRecyclerView != null) {
                            i = C0966R.C0970id.jeb;
                            WeImageView weImageView = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.jeb);
                            if (weImageView != null) {
                                i = C0966R.C0970id.jec;
                                TextView textView2 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.jec);
                                if (textView2 != null) {
                                    return new C52584a(relativeLayout, relativeLayout, linearLayout, textView, progressBar, loadMoreRecyclerView, weImageView, textView2);
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: H7 */
    public static final void m46599H7(SettingsAuthUI settingsAuthUI) {
        settingsAuthUI.getClass();
        Log.m105926v("MicroMsg.SettingsAuthUI", "loadMoreData isLoadingMore: " + settingsAuthUI.f116249v + ", nextPageData: " + settingsAuthUI.f116242o);
        if (!settingsAuthUI.f116249v) {
            settingsAuthUI.f116249v = true;
            C39818r rVar = C39818r.f106831a;
            AppCompatActivity context = settingsAuthUI.getContext();
            C87412m.m108593f(context, "context");
            ((C42990q1) rVar.mo62444c(context).mo75002a(C42990q1.class)).mo67193c3(settingsAuthUI.f116242o);
        }
    }

    /* renamed from: I7 */
    public static final void m46600I7(SettingsAuthUI settingsAuthUI) {
        if (settingsAuthUI.f116239i > 0 && settingsAuthUI.f116240j > 0) {
            boolean z = false;
            settingsAuthUI.mo67126N7(settingsAuthUI.mo67124L7().f146872d.getVisibility() == 0);
            if (settingsAuthUI.mo67124L7().f146870b.getVisibility() == 0) {
                z = true;
            }
            settingsAuthUI.mo67125M7(z);
            if (settingsAuthUI.f116244q) {
                settingsAuthUI.mo67123K7();
            }
        }
    }

    /* renamed from: J7 */
    public static final boolean m46601J7(SettingsAuthUI settingsAuthUI) {
        int i;
        int i2 = settingsAuthUI.f116239i;
        if (i2 <= 0 || (i = settingsAuthUI.f116236f) <= 0 || settingsAuthUI.f116240j >= 0) {
            return false;
        }
        settingsAuthUI.f116240j = i2 - i;
        int dimensionPixelSize = i - settingsAuthUI.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3755d6);
        settingsAuthUI.f116237g = dimensionPixelSize;
        settingsAuthUI.f116238h = dimensionPixelSize + settingsAuthUI.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3738cr);
        Log.m105924i("MicroMsg.SettingsAuthUI", "updateViewParams titleHeaderHeight: " + settingsAuthUI.f116236f + ", containerViewHeight: " + settingsAuthUI.f116240j + ", startOffset: " + settingsAuthUI.f116237g + ", endOffset: " + settingsAuthUI.f116238h);
        return true;
    }

    /* renamed from: K7 */
    public final void mo67123K7() {
        C42929a aVar;
        C42929a aVar2 = this.f116241n;
        boolean z = true;
        if (aVar2 != null && aVar2.mo67128F4()) {
            this.f116244q = true;
            String string = getResources().getString(C0966R.string.iqc);
            C87412m.m108593f(string, "resources.getString(R.st…settings_auth_list_empty)");
            mo67127O7(true, string);
            C42929a aVar3 = this.f116241n;
            if (aVar3 != null) {
                int itemCount = aVar3.getItemCount() - 1;
                C42929a.C42933d dVar = (C42929a.C42933d) C110818d0.m150917O(aVar3.f116253f, itemCount);
                if (dVar != null && dVar.f116267a == 2) {
                    ((ArrayList) aVar3.f116253f).remove(itemCount);
                    aVar3.notifyDataSetChanged();
                }
            }
        } else {
            this.f116244q = false;
            mo67127O7(false, "");
        }
        if (this.f116245r || (aVar = this.f116241n) == null || aVar.mo67128F4()) {
            C42929a aVar4 = this.f116241n;
            if (aVar4 == null || !aVar4.mo67128F4()) {
                z = false;
            }
            if (z) {
                this.f116245r = false;
                removeAllOptionMenu();
                return;
            }
            return;
        }
        this.f116245r = true;
        removeAllOptionMenu();
        addIconOptionMenu(800, (int) C0966R.string.a2p, (int) C0966R.raw.icons_outlined_search, (MenuItem.OnMenuItemClickListener) new C42999x1(this));
    }

    /* renamed from: L7 */
    public final C52584a mo67124L7() {
        return (C52584a) ((C36570n) this.f116234d).getValue();
    }

    /* renamed from: M7 */
    public final void mo67125M7(boolean z) {
        mo67124L7().f146870b.setVisibility(z ? 0 : 8);
        if (z) {
            LinearLayout linearLayout = mo67124L7().f146870b;
            ViewGroup.LayoutParams layoutParams = mo67124L7().f146870b.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = null;
            } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((int) (((float) this.f116240j) * 0.3f)) - getResources().getDimensionPixelSize(C0966R.dimen.f3745cw);
            }
            linearLayout.setLayoutParams(layoutParams);
            if (C86709a0.m107524d().mo123467m() == 0) {
                mo67124L7().f146871c.setText(getResources().getString(C0966R.string.iqf));
            } else {
                mo67124L7().f146871c.setText(getResources().getString(C0966R.string.iqe));
            }
        }
    }

    /* renamed from: N7 */
    public final void mo67126N7(boolean z) {
        Log.m105924i("MicroMsg.SettingsAuthUI", "alvinluo showLoading show: " + z);
        if (z) {
            C42929a aVar = this.f116241n;
            boolean z2 = true;
            if (aVar == null || !aVar.mo67128F4()) {
                z2 = false;
            }
            if (z2) {
                ProgressBar progressBar = mo67124L7().f146872d;
                ViewGroup.LayoutParams layoutParams = mo67124L7().f146872d.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = null;
                } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((int) (((float) this.f116240j) * 0.3f)) - getResources().getDimensionPixelSize(C0966R.dimen.f3722cc);
                }
                progressBar.setLayoutParams(layoutParams);
                mo67124L7().f146872d.setVisibility(0);
                return;
            }
        }
        mo67124L7().f146872d.setVisibility(8);
    }

    /* renamed from: O7 */
    public final void mo67127O7(boolean z, String str) {
        mo67124L7().f146875g.setVisibility(z ? 0 : 8);
        mo67124L7().f146875g.setText(str);
        if (z) {
            TextView textView = mo67124L7().f146875g;
            ViewGroup.LayoutParams layoutParams = mo67124L7().f146875g.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = null;
            } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (((float) this.f116240j) * 0.3f);
            }
            textView.setLayoutParams(layoutParams);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bx6;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1000 && i2 == -1) {
            C42929a aVar = this.f116241n;
            boolean z = true;
            if (aVar == null || !aVar.mo67129G4(this.f116246s)) {
                z = false;
            }
            if (z) {
                mo67123K7();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.iqg);
        hideActionbarLine();
        this.f116243p = Integer.valueOf(getResources().getColor(C0966R.color.f2929c));
        getMMTitleView().setAlpha(0.0f);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        this.f116236f = 0;
        setBackBtn(new C5267b(this));
        this.f116248u = new C78253a(this);
        LoadMoreRecyclerView loadMoreRecyclerView = mo67124L7().f146873e;
        C87412m.m108593f(loadMoreRecyclerView, "uiBinding.settingsAuthRecyclerView");
        C42929a aVar = new C42929a(this, loadMoreRecyclerView);
        this.f116241n = aVar;
        aVar.f116257j = new C42934c(this);
        LoadMoreRecyclerView loadMoreRecyclerView2 = mo67124L7().f146873e;
        loadMoreRecyclerView2.setAdapter(this.f116241n);
        loadMoreRecyclerView2.setLayoutManager(new LinearLayoutManager(loadMoreRecyclerView2.getContext()));
        loadMoreRecyclerView2.setItemAnimator((RecyclerView.C16616j) null);
        View inflate = LayoutInflater.from(loadMoreRecyclerView2.getContext()).inflate(C0966R.C0971layout.b55, (ViewGroup) null);
        this.f116250w = inflate;
        C87412m.m108591d(inflate);
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(C0966R.C0970id.g3k);
        View view = this.f116250w;
        C87412m.m108591d(view);
        ((LinearLayout) view.findViewById(C0966R.C0970id.g3l)).setOnClickListener(new C5268d(progressBar, this));
        View view2 = this.f116250w;
        C87412m.m108591d(view2);
        loadMoreRecyclerView2.setLoadingView(view2);
        loadMoreRecyclerView2.mo63430I(false);
        loadMoreRecyclerView2.setOnLoadingStateChangedListener(new C42937e(progressBar, this));
        View inflate2 = LayoutInflater.from(loadMoreRecyclerView2.getContext()).inflate(C0966R.C0971layout.b56, (ViewGroup) null);
        this.f116235e = inflate2;
        C87412m.m108591d(inflate2);
        C85875k4.m106189j0(((TextView) inflate2.findViewById(C0966R.C0970id.je9)).getPaint(), 0.8f);
        View view3 = this.f116235e;
        C87412m.m108591d(view3);
        view3.getViewTreeObserver().addOnGlobalLayoutListener(new C42938f(this));
        View view4 = this.f116235e;
        C87412m.m108591d(view4);
        loadMoreRecyclerView2.addHeaderView(view4);
        loadMoreRecyclerView2.mo17043c(new C42939g(this));
        C39818r rVar = C39818r.f106831a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        ((C42990q1) rVar.mo62444c(context).mo75002a(C42990q1.class)).f116401d = new C42940h(this);
        AppCompatActivity context2 = getContext();
        C87412m.m108593f(context2, "context");
        ((C42993r1) rVar.mo62444c(context2).mo75002a(C42993r1.class)).f116405d = new C42941i(this);
        mo67124L7().f146869a.getViewTreeObserver().addOnGlobalLayoutListener(new C42942j(this));
        mo67124L7().f146870b.setOnClickListener(new C42943k(this));
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
        Util.expandViewTouchArea(mo67124L7().f146874f, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public void onDestroy() {
        super.onDestroy();
        C39818r rVar = C39818r.f106831a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        ((C42990q1) rVar.mo62444c(context).mo75002a(C42990q1.class)).f116401d = null;
        AppCompatActivity context2 = getContext();
        C87412m.m108593f(context2, "context");
        ((C42993r1) rVar.mo62444c(context2).mo75002a(C42993r1.class)).f116405d = null;
    }

    public void onResume() {
        super.onResume();
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
        MMActivityController controller = getController();
        Integer num = this.f116243p;
        C87412m.m108591d(num);
        controller.mo177105z0(num.intValue());
        C78461f bounceView = getBounceView();
        if (bounceView != null) {
            bounceView.setStart2EndBgColor(getResources().getColor(C0966R.color.f2929c));
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C42990q1.class);
        hashSet.add(C42993r1.class);
    }
}
