package il1;

import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import nm0.C89025e;
import ok1.C62042e;
import p140cw.C7138g;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import qj1.C62660c;
import qo3.C12925w;
import qo3.C77407n;
import qo3.C89779i0;
import qo3.w$$c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C50689oj;
import tf0.C64916p1;
import up1.C27696y;
import wx3.C15601d;
import xk1.C15743j1;
import z04.C66731x;

/* renamed from: il1.k2 */
public final class C9030k2 extends C9120u0 implements C15743j1.C15744a {

    /* renamed from: A */
    public String f28517A;

    /* renamed from: B */
    public C12925w f28518B;

    /* renamed from: C */
    public C8978g f28519C;

    /* renamed from: D */
    public final C13601g f28520D;

    /* renamed from: E */
    public C50689oj f28521E;

    /* renamed from: F */
    public KeyboardHeightProvider f28522F;

    /* renamed from: G */
    public C32226l<? super C50689oj, C13598b0> f28523G;

    /* renamed from: H */
    public C53973z1 f28524H;

    /* renamed from: h */
    public final int f28525h = 502;

    /* renamed from: i */
    public final int f28526i = C89025e.CTRL_INDEX;

    /* renamed from: j */
    public final int f28527j = 20010;

    /* renamed from: n */
    public final int f28528n = 1;

    /* renamed from: o */
    public final int f28529o = 2;

    /* renamed from: p */
    public C77407n f28530p;

    /* renamed from: q */
    public View f28531q;

    /* renamed from: r */
    public TextView f28532r;

    /* renamed from: s */
    public View f28533s;

    /* renamed from: t */
    public MMEditText f28534t;

    /* renamed from: u */
    public View f28535u;

    /* renamed from: v */
    public View f28536v;

    /* renamed from: w */
    public ImageView f28537w;

    /* renamed from: x */
    public TextView f28538x;

    /* renamed from: y */
    public View f28539y;

    /* renamed from: z */
    public String f28540z;

    /* renamed from: il1.k2$a */
    public static final class C9031a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9030k2 f28541d;

        public C9031a(C9030k2 k2Var) {
            this.f28541d = k2Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12925w wVar = this.f28541d.getModifyAnnoucementPage().f36949a;
            if (wVar != null) {
                wVar.mo5085n();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.k2$b */
    public final class C9032b extends w$$c {
        public C9032b() {
        }

        /* renamed from: a */
        public View mo4781a(Context context) {
            C87412m.m108594g(context, "context");
            return C9030k2.this;
        }

        /* renamed from: c */
        public void mo4873c() {
            Context context = C9030k2.this.getContext();
            C13598b0 b0Var = null;
            MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
            if (mMActivity != null) {
                C9030k2 k2Var = C9030k2.this;
                C15743j1 j1Var = (C15743j1) C39818r.f106831a.mo62444c(mMActivity).mo75002a(C15743j1.class);
                j1Var.getClass();
                C87412m.m108594g(k2Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                if (!j1Var.f42462d.contains(k2Var)) {
                    j1Var.f42462d.add(k2Var);
                }
            }
            C9030k2 k2Var2 = C9030k2.this;
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C50689oj ojVar = k2Var2.f28521E;
            if (ojVar != null) {
                boolean z = true;
                if (!(ojVar.f139210e != null)) {
                    ojVar = null;
                }
                if (ojVar != null) {
                    k2Var2.f28532r.setText(String.valueOf(ojVar.f139209d));
                    k2Var2.f28534t.setText(ojVar.f139210e);
                    String str = ojVar.f139211f;
                    k2Var2.f28540z = str;
                    if (!(str == null || str.length() == 0)) {
                        z = false;
                    }
                    if (z) {
                        View view = k2Var2.f28536v;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        k2Var2.f28537w.setVisibility(8);
                    } else {
                        C39818r rVar = C39818r.f106831a;
                        ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(ojVar.f139211f, C27696y.THUMB_IMAGE), k2Var2.f28537w, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT));
                        k2Var2.f28537w.setVisibility(0);
                        View view3 = k2Var2.f28536v;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    b0Var = C13598b0.f38549a;
                }
            }
            if (b0Var == null) {
                k2Var2.f28532r.setText("");
                k2Var2.f28534t.setText("");
                k2Var2.f28537w.setVisibility(8);
                View view5 = k2Var2.f28536v;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget", "updateContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            k2Var2.mo9855h();
            C9030k2 k2Var3 = C9030k2.this;
            if (k2Var3.f28522F == null) {
                Context context2 = k2Var3.getContext();
                C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider((MMActivity) context2);
                k2Var3.f28522F = keyboardHeightProvider;
                keyboardHeightProvider.f220015b = new C9061m2(k2Var3);
            }
            KeyboardHeightProvider keyboardHeightProvider2 = k2Var3.f28522F;
            if (keyboardHeightProvider2 != null) {
                keyboardHeightProvider2.mo104022e();
            }
        }
    }

    /* renamed from: il1.k2$c */
    public static final class C9033c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9030k2 f28543d;

        public C9033c(C9030k2 k2Var) {
            this.f28543d = k2Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget$backBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f28543d.mo9851f();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget$backBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.k2$d */
    public static final class C9034d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9030k2 f28544d;

        public C9034d(C9030k2 k2Var) {
            this.f28544d = k2Var;
        }

        public final void onClick(View view) {
            C55908a viewScope;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget$confirmBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9030k2 k2Var = this.f28544d;
            C53973z1 z1Var = k2Var.f28524H;
            C53973z1 z1Var2 = null;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = C89779i0.m112248e(k2Var.f28531q.getContext(), k2Var.f28531q.getContext().getString(C0966R.string.gat), true, 3, (DialogInterface.OnCancelListener) null);
            FinderLiveService.f159376d.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            if (!(bVar == null || (viewScope = bVar.getViewScope()) == null)) {
                z1Var2 = C53895h.m60466d(viewScope, C53872d1.f151119c, (C53934p0) null, new C9069n2(k2Var, f0Var, (C15601d<? super C9069n2>) null), 2, (Object) null);
            }
            k2Var.f28524H = z1Var2;
            C89779i0 i0Var = (C89779i0) f0Var.f27484d;
            if (i0Var != null) {
                i0Var.setOnDismissListener(new C9079o2(k2Var));
            }
            C89779i0 i0Var2 = (C89779i0) f0Var.f27484d;
            if (i0Var2 != null) {
                i0Var2.show();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget$confirmBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.k2$e */
    public static final class C9035e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9030k2 f28545d;

        /* renamed from: il1.k2$e$a */
        public static final class C9036a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ C9030k2 f28546d;

            public C9036a(C9030k2 k2Var) {
                this.f28546d = k2Var;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                C77407n nVar = this.f28546d.f28530p;
                if (nVar != null) {
                    nVar.mo107567l((View) null);
                }
                e0Var.clear();
                e0Var.mo107125a(this.f28546d.f28529o, C0966R.string.mfg);
                C9030k2 k2Var = this.f28546d;
                e0Var.mo107140d(k2Var.f28528n, k2Var.f28531q.getContext().getResources().getColor(C0966R.color.f356948a24), this.f28546d.f28531q.getContext().getString(C0966R.string.mf_));
            }
        }

        /* renamed from: il1.k2$e$b */
        public static final class C9037b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C9030k2 f28547d;

            public C9037b(C9030k2 k2Var) {
                this.f28547d = k2Var;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                C9030k2 k2Var = this.f28547d;
                if (itemId == k2Var.f28528n) {
                    k2Var.f28537w.setVisibility(8);
                    View view = k2Var.f28536v;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget", "delCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget", "delCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    k2Var.f28540z = null;
                    k2Var.f28517A = null;
                    k2Var.mo9855h();
                } else if (itemId == k2Var.f28529o) {
                    C9030k2.m8786d(k2Var);
                }
            }
        }

        public C9035e(C9030k2 k2Var) {
            this.f28545d = k2Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget$currentCoverView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9030k2 k2Var = this.f28545d;
            k2Var.f28530p = new C77407n(k2Var.f28531q.getContext(), 1, false);
            C77407n nVar = this.f28545d.f28530p;
            if (nVar != null) {
                nVar.mo107570o(true);
            }
            C9030k2 k2Var2 = this.f28545d;
            C77407n nVar2 = k2Var2.f28530p;
            if (nVar2 != null) {
                nVar2.f225771i = new C9036a(k2Var2);
            }
            if (nVar2 != null) {
                nVar2.f225782p = new C9037b(k2Var2);
            }
            if (nVar2 != null) {
                nVar2.mo107573q();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget$currentCoverView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.k2$f */
    public static final class C9038f implements InputFilter {

        /* renamed from: d */
        public static final C9038f f28548d = new C9038f();

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return charSequence.toString().contentEquals("\n") ? "" : charSequence;
        }
    }

    /* renamed from: il1.k2$g */
    public static final class C9039g implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ C9030k2 f28549d;

        public C9039g(C9030k2 k2Var) {
            this.f28549d = k2Var;
        }

        public void afterTextChanged(Editable editable) {
            this.f28549d.mo9855h();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: il1.k2$h */
    public static final class C9040h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9030k2 f28550d;

        public C9040h(C9030k2 k2Var) {
            this.f28550d = k2Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget$goSelectPhotoView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9030k2.m8786d(this.f28550d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget$goSelectPhotoView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.k2$i */
    public static final class C9041i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C9030k2 f28551d;

        public C9041i(C9030k2 k2Var) {
            this.f28551d = k2Var;
        }

        public final void run() {
            this.f28551d.getModifyAnnoucementPage().mo12476d();
        }
    }

    /* renamed from: il1.k2$j */
    public static final class C9042j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9030k2 f28552d;

        public C9042j(C9030k2 k2Var) {
            this.f28552d = k2Var;
        }

        public final void onClick(View view) {
            C8978g gVar;
            C8978g gVar2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget$levelSettingView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9030k2 k2Var = this.f28552d;
            if (k2Var.f28519C == null) {
                Context context = k2Var.getContext();
                C87412m.m108593f(context, "context");
                C8978g gVar3 = new C8978g(context);
                gVar3.setBackClickListener(new C9047l2(k2Var));
                k2Var.f28519C = gVar3;
            }
            C62660c basePlugin = k2Var.getBasePlugin();
            C13598b0 b0Var = null;
            if (!(basePlugin == null || (gVar2 = k2Var.f28519C) == null)) {
                gVar2.mo9935a(basePlugin);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null && (gVar = k2Var.f28519C) != null) {
                gVar.setScope(k2Var.getScope());
            }
            C8978g gVar4 = k2Var.f28519C;
            if (gVar4 != null) {
                gVar4.mo9790d(k2Var.f28518B, C66731x.m78731e(k2Var.f28532r.getText().toString()));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget$levelSettingView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.k2$k */
    public static final class C9043k extends C87413o implements C32224a<C9032b> {

        /* renamed from: d */
        public final /* synthetic */ C9030k2 f28553d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9043k(C9030k2 k2Var) {
            super(0);
            this.f28553d = k2Var;
        }

        public Object invoke() {
            return new C9032b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9030k2(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cv5, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…ing_wiget_ui, this, true)");
        this.f28531q = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.f357973mz1);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.f…ub_announcement_level_tv)");
        this.f28532r = (TextView) findViewById;
        View findViewById2 = this.f28531q.findViewById(C0966R.C0970id.f357974mz2);
        findViewById2.setOnClickListener(new C9042j(this));
        this.f28533s = findViewById2;
        View findViewById3 = this.f28531q.findViewById(C0966R.C0970id.f357975mz3);
        MMEditText mMEditText = (MMEditText) findViewById3;
        mMEditText.setFilters(new InputFilter[]{C9038f.f28548d, new C45078p0(60, C45078p0.C45079a.MODE_CHINESE_AS_2)});
        mMEditText.addTextChangedListener(new C9039g(this));
        C87412m.m108593f(findViewById3, "root.findViewById<MMEdit…      }\n\n        })\n    }");
        this.f28534t = (MMEditText) findViewById3;
        View findViewById4 = this.f28531q.findViewById(C0966R.C0970id.ctf);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.fans_modify_content_area)");
        this.f28535u = findViewById4;
        View findViewById5 = this.f28531q.findViewById(C0966R.C0970id.f357972mz0);
        findViewById5.setOnClickListener(new C9040h(this));
        this.f28536v = findViewById5;
        View findViewById6 = this.f28531q.findViewById(C0966R.C0970id.myz);
        ((ImageView) findViewById6).setOnClickListener(new C9035e(this));
        C87412m.m108593f(findViewById6, "root.findViewById<ImageV…tryShow()\n        }\n    }");
        this.f28537w = (ImageView) findViewById6;
        View findViewById7 = this.f28531q.findViewById(C0966R.C0970id.gyb);
        ((TextView) findViewById7).setOnClickListener(new C9034d(this));
        C87412m.m108593f(findViewById7, "root.findViewById<TextVi…rAndMod()\n        }\n    }");
        this.f28538x = (TextView) findViewById7;
        View findViewById8 = this.f28531q.findViewById(C0966R.C0970id.myu);
        findViewById8.setOnClickListener(new C9033c(this));
        this.f28539y = findViewById8;
        this.f28520D = C36568h.m40985a(new C9043k(this));
        this.f28531q.findViewById(C0966R.C0970id.cte).setOnClickListener(new C9031a(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r1 == null) goto L_0x001c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m8784b(il1.C9030k2 r5) {
        /*
            r5.getClass()
            c30.g r0 = new c30.g     // Catch:{ Exception -> 0x005e }
            r0.<init>()     // Catch:{ Exception -> 0x005e }
            java.lang.String r1 = r5.f28540z     // Catch:{ Exception -> 0x005e }
            r2 = 0
            if (r1 == 0) goto L_0x001c
            int r3 = r1.length()     // Catch:{ Exception -> 0x005e }
            if (r3 <= 0) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            if (r3 == 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            if (r1 != 0) goto L_0x0026
        L_0x001c:
            te3.oj r1 = r5.f28521E     // Catch:{ Exception -> 0x005e }
            if (r1 == 0) goto L_0x0024
            java.lang.String r1 = r1.f139211f     // Catch:{ Exception -> 0x005e }
            if (r1 != 0) goto L_0x0026
        L_0x0024:
            java.lang.String r1 = ""
        L_0x0026:
            java.lang.String r3 = "fans_team_level"
            android.widget.TextView r4 = r5.f28532r     // Catch:{ Exception -> 0x005e }
            java.lang.CharSequence r4 = r4.getText()     // Catch:{ Exception -> 0x005e }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x005e }
            java.lang.Integer r4 = z04.C66731x.m78731e(r4)     // Catch:{ Exception -> 0x005e }
            if (r4 == 0) goto L_0x003c
            int r2 = r4.intValue()     // Catch:{ Exception -> 0x005e }
        L_0x003c:
            r0.mo145953n(r3, r2)     // Catch:{ Exception -> 0x005e }
            java.lang.String r2 = "placard_desc"
            com.tencent.mm.ui.widget.MMEditText r5 = r5.f28534t     // Catch:{ Exception -> 0x005e }
            android.text.Editable r5 = r5.getText()     // Catch:{ Exception -> 0x005e }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x005e }
            r0.put(r2, r5)     // Catch:{ Exception -> 0x005e }
            java.lang.String r5 = "pic_url"
            r0.put(r5, r1)     // Catch:{ Exception -> 0x005e }
            java.lang.String r5 = r0.toString()     // Catch:{ Exception -> 0x005e }
            java.lang.String r0 = "{\n            val json =…json.toString()\n        }"
            gy3.C87412m.m108593f(r5, r0)     // Catch:{ Exception -> 0x005e }
            goto L_0x007c
        L_0x005e:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[dumpBulletinInfo] e = "
            r0.append(r1)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "LiveFansClubSlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            java.lang.String r5 = "{}"
        L_0x007c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C9030k2.m8784b(il1.k2):java.lang.String");
    }

    /* renamed from: d */
    public static final void m8786d(C9030k2 k2Var) {
        k2Var.getClass();
        if (!C86709a0.m107535s().mo121147n()) {
            C76912y0.m92772k(k2Var.f28531q.getContext());
            return;
        }
        Context context = k2Var.f28531q.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((C7138g) C86312j.m106911c(C7138g.class)).mo8311H7((MMActivity) context, k2Var.f28527j, 1, 28, (Intent) null);
    }

    /* access modifiers changed from: private */
    public final C9032b getModifyAnnoucementPage() {
        return (C9032b) ((C36570n) this.f28520D).getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if ((r3 == null || r3.length() == 0) != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        if (r0 != (r3 != null ? r3.intValue() : 0)) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a1, code lost:
        if ((r0 != null ? r0.intValue() : 0) > 0) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a9  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9850e() {
        /*
            r5 = this;
            te3.oj r0 = r5.f28521E
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0063
            java.lang.String r3 = r5.f28540z
            if (r3 == 0) goto L_0x0013
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r3 = 0
            goto L_0x0014
        L_0x0013:
            r3 = 1
        L_0x0014:
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = r0.f139211f
            if (r3 == 0) goto L_0x0023
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r3 = 0
            goto L_0x0024
        L_0x0023:
            r3 = 1
        L_0x0024:
            if (r3 == 0) goto L_0x00a6
        L_0x0026:
            java.lang.String r3 = r5.f28517A
            if (r3 == 0) goto L_0x0033
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            if (r3 == 0) goto L_0x00a6
            java.lang.String r3 = r0.f139210e
            com.tencent.mm.ui.widget.MMEditText r4 = r5.f28534t
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x00a6
            int r0 = r0.f139209d
            android.widget.TextView r3 = r5.f28532r
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.Integer r3 = z04.C66731x.m78731e(r3)
            if (r3 == 0) goto L_0x005f
            int r3 = r3.intValue()
            goto L_0x0060
        L_0x005f:
            r3 = 0
        L_0x0060:
            if (r0 == r3) goto L_0x00a4
            goto L_0x00a6
        L_0x0063:
            java.lang.String r0 = r5.f28517A
            if (r0 == 0) goto L_0x0070
            int r0 = r0.length()
            if (r0 != 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r0 = 0
            goto L_0x0071
        L_0x0070:
            r0 = 1
        L_0x0071:
            if (r0 == 0) goto L_0x00a6
            com.tencent.mm.ui.widget.MMEditText r0 = r5.f28534t
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0088
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r0 = 0
            goto L_0x0089
        L_0x0088:
            r0 = 1
        L_0x0089:
            if (r0 == 0) goto L_0x00a6
            android.widget.TextView r0 = r5.f28532r
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.Integer r0 = z04.C66731x.m78731e(r0)
            if (r0 == 0) goto L_0x00a0
            int r0 = r0.intValue()
            goto L_0x00a1
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            if (r0 <= 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r0 = 0
            goto L_0x00a7
        L_0x00a6:
            r0 = 1
        L_0x00a7:
            if (r0 == 0) goto L_0x00d2
            android.widget.TextView r0 = r5.f28532r
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x00ba
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00b8
            goto L_0x00ba
        L_0x00b8:
            r0 = 0
            goto L_0x00bb
        L_0x00ba:
            r0 = 1
        L_0x00bb:
            if (r0 != 0) goto L_0x00d2
            com.tencent.mm.ui.widget.MMEditText r0 = r5.f28534t
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x00ce
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00cc
            goto L_0x00ce
        L_0x00cc:
            r0 = 0
            goto L_0x00cf
        L_0x00ce:
            r0 = 1
        L_0x00cf:
            if (r0 != 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r1 = 0
        L_0x00d3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C9030k2.mo9850e():boolean");
    }

    /* renamed from: f */
    public final void mo9851f() {
        Context context = getContext();
        MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
        if (mMActivity != null) {
            C15743j1 j1Var = (C15743j1) C39818r.f106831a.mo62444c(mMActivity).mo75002a(C15743j1.class);
            j1Var.getClass();
            j1Var.f42462d.remove(this);
        }
        KeyboardHeightProvider keyboardHeightProvider = this.f28522F;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        postDelayed(new C9041i(this), 300);
    }

    /* renamed from: g */
    public final void mo9852g(C12925w wVar, C50689oj ojVar) {
        this.f28521E = ojVar;
        C62042e.f176370a.mo87010H1(this);
        this.f28518B = wVar;
        if (wVar != null) {
            wVar.mo12468h(getModifyAnnoucementPage());
        }
    }

    public final C32226l<C50689oj, C13598b0> getBackClickListener() {
        return this.f28523G;
    }

    public final C53973z1 getUploadAndModJob() {
        return this.f28524H;
    }

    /* renamed from: h */
    public final void mo9855h() {
        this.f28538x.setEnabled(mo9850e());
        C62042e.f176370a.mo87025M1(this.f28538x, mo9850e(), false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == this.f28527j && intent != null) {
            Context context = this.f28531q.getContext();
            MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
            if (mMActivity != null) {
                Uri data = intent.getData();
                String path = data != null ? data.getPath() : null;
                Uri data2 = intent.getData();
                if (Util.isNullOrNil(data2 != null ? data2.getPath() : null)) {
                    path = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(mMActivity, intent, ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76713pw());
                }
                Log.m105924i("Finder.FinderLiveFansClubAnnouncementSettingWidget", "filePath[" + path + "] " + intent);
                if (path != null) {
                    this.f28517A = path;
                    Uri n = C116299g2.m163858n(path);
                    String path2 = n.getPath();
                    if (path2 != null) {
                        String k = C116299g2.m163855k(path2, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    InputStream C = C86013q1.m106421C(n, C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null));
                    C87412m.m108593f(C, "openRead(this)");
                    this.f28537w.setImageDrawable(new BitmapDrawable(this.f28531q.getContext().getResources(), BitmapUtil.decodeStream(C)));
                    this.f28537w.setVisibility(0);
                    View view = this.f28536v;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementSettingWidget", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    mo9855h();
                }
            }
        }
    }

    public final void setBackClickListener(C32226l<? super C50689oj, C13598b0> lVar) {
        this.f28523G = lVar;
    }

    public final void setUploadAndModJob(C53973z1 z1Var) {
        this.f28524H = z1Var;
    }
}
