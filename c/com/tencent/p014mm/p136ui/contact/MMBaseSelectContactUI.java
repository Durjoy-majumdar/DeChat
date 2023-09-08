package com.tencent.p014mm.p136ui.contact;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.base.AlphabetScrollBar;
import com.tencent.p014mm.p136ui.base.MMTagPanel;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.p136ui.tools.C106757l0;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.masssend.p076ui.MassSendSelectContactUI;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import f40.C86737h0;
import gl3.C75922b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kv1.C99254i;
import lv1.C99667f;
import nj3.C76901s0;
import nj3.C76912y0;
import p240sx.C77809r;
import p240sx.C77810t;
import p418rx.C77582l;
import zt3.C119157j;

@C86737h0
/* renamed from: com.tencent.mm.ui.contact.MMBaseSelectContactUI */
public abstract class MMBaseSelectContactUI extends MMSecDataActivity implements MultiSelectContactView.C72732e, AdapterView.OnItemClickListener, VerticalScrollBar.C6756b, C106742j1.C106756o, MultiSelectContactView.C72733f, C74493g1, MultiSelectContactView.C72731d {

    /* renamed from: B */
    public static final /* synthetic */ int f218603B = 0;

    /* renamed from: A */
    public int f218604A;

    /* renamed from: d */
    public ListView f218605d;

    /* renamed from: e */
    public AlphabetScrollBar f218606e;

    /* renamed from: f */
    public C74526m1 f218607f;

    /* renamed from: g */
    public C74498h1 f218608g;

    /* renamed from: h */
    public MultiSelectContactView f218609h;

    /* renamed from: i */
    public C106742j1 f218610i;

    /* renamed from: j */
    public View f218611j;

    /* renamed from: n */
    public View f218612n;

    /* renamed from: o */
    public C76901s0 f218613o;

    /* renamed from: p */
    public View f218614p;

    /* renamed from: q */
    public View f218615q;

    /* renamed from: r */
    public View f218616r;

    /* renamed from: s */
    public View f218617s;

    /* renamed from: t */
    public TextView f218618t;

    /* renamed from: u */
    public TextView f218619u;

    /* renamed from: v */
    public LabelContainerView f218620v;

    /* renamed from: w */
    public MMTagPanel f218621w;

    /* renamed from: x */
    public boolean f218622x = true;

    /* renamed from: y */
    public List<String> f218623y = new ArrayList();

    /* renamed from: z */
    public HashSet<String> f218624z = new HashSet<>();

    /* renamed from: com.tencent.mm.ui.contact.MMBaseSelectContactUI$a */
    public class C74391a implements View.OnTouchListener {
        public C74391a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/MMBaseSelectContactUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            MMBaseSelectContactUI.this.m88857c8();
            MMBaseSelectContactUI.this.mo103378K7();
            MMBaseSelectContactUI.this.mo103377J7();
            C117292a.m165362h(false, this, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.MMBaseSelectContactUI$b */
    public class C74392b implements View.OnClickListener {
        public C74392b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/MMBaseSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d("MicroMsg.MMBaseSelectContactUI", "dancy test topSearchView onClick!!");
            MMBaseSelectContactUI.this.f218610i.mo153851c(true);
            View view2 = MMBaseSelectContactUI.this.f218611j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = MMBaseSelectContactUI.this.f218612n;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view6 = MMBaseSelectContactUI.this.f218615q;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.MMBaseSelectContactUI$c */
    public class C74393c implements View.OnTouchListener {
        public C74393c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/MMBaseSelectContactUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            MMBaseSelectContactUI.this.f218610i.mo153850b();
            View view2 = MMBaseSelectContactUI.this.f218611j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = MMBaseSelectContactUI.this.f218612n;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view6 = MMBaseSelectContactUI.this.f218615q;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view7 = view6;
            C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C117292a.m165362h(true, this, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.MMBaseSelectContactUI$d */
    public class C74394d implements MenuItem.OnMenuItemClickListener {
        public C74394d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MMBaseSelectContactUI.this.mo66629Z7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.MMBaseSelectContactUI$e */
    public class C74395e implements C74498h1.C44878a {
        public C74395e() {
        }

        /* renamed from: t6 */
        public void mo62789t6(String str, int i, boolean z) {
            AlphabetScrollBar alphabetScrollBar;
            Log.m105925i("MicroMsg.MMBaseSelectContactUI", "Callback SearchEnd Count=%d", Integer.valueOf(i));
            View view = MMBaseSelectContactUI.this.f218612n;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI$5", "end", "(Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$5", "end", "(Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!z || i != 0) {
                MMBaseSelectContactUI mMBaseSelectContactUI = MMBaseSelectContactUI.this;
                mMBaseSelectContactUI.getClass();
                Log.m105924i("MicroMsg.MMBaseSelectContactUI", "setSearchStatus");
                mMBaseSelectContactUI.mo64526b8(mMBaseSelectContactUI.f218605d, 8);
                mMBaseSelectContactUI.f218605d.setAdapter(mMBaseSelectContactUI.f218608g);
                mMBaseSelectContactUI.f218608g.notifyDataSetChanged();
                if (mMBaseSelectContactUI.mo64520W7() && (alphabetScrollBar = mMBaseSelectContactUI.f218606e) != null) {
                    alphabetScrollBar.setVisibility(mMBaseSelectContactUI.f218608g.mo103533u() ? 0 : 8);
                }
                View view2 = mMBaseSelectContactUI.f218617s;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setSearchStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setSearchStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mMBaseSelectContactUI.f218605d.setVisibility(0);
            } else if (!Util.isNullOrNil(str)) {
                MMBaseSelectContactUI.m88856I7(MMBaseSelectContactUI.this);
            } else {
                MMBaseSelectContactUI.this.m88857c8();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.MMBaseSelectContactUI$f */
    public class C74396f implements AbsListView.OnScrollListener {
        public C74396f() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            if (!MMBaseSelectContactUI.this.mo64519V7()) {
                MMBaseSelectContactUI mMBaseSelectContactUI = MMBaseSelectContactUI.this;
                if (mMBaseSelectContactUI.f218609h != null) {
                    ListView listView = mMBaseSelectContactUI.f218605d;
                    View childAt = listView.getChildAt(listView.getFirstVisiblePosition());
                    if (childAt == null || childAt.getTop() != 0) {
                        View view = MMBaseSelectContactUI.this.f218614p;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "onScroll", "(Landroid/widget/AbsListView;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "onScroll", "(Landroid/widget/AbsListView;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        View view3 = MMBaseSelectContactUI.this.f218614p;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "onScroll", "(Landroid/widget/AbsListView;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "onScroll", "(Landroid/widget/AbsListView;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            if (i < 2) {
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
                return;
            }
            ((C77582l) ((C77810t) C86312j.m106911c(C77810t.class)).h50()).getClass();
            if (!Util.nullAsFalse((Boolean) C86709a0.m107535s().mo121142i().mo119684e(12296, (Object) null))) {
                C86709a0.m107535s().mo121142i().mo119676J(12296, Boolean.TRUE);
                C76901s0 s0Var = MMBaseSelectContactUI.this.f218613o;
                if (s0Var != null) {
                    s0Var.dismiss();
                }
                MMBaseSelectContactUI mMBaseSelectContactUI2 = MMBaseSelectContactUI.this;
                mMBaseSelectContactUI2.f218613o = C76912y0.m92775n(mMBaseSelectContactUI2, mMBaseSelectContactUI2.getString(C0966R.string.gmp), 4000);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i != 0) {
                MMBaseSelectContactUI.this.hideVKB();
                MMBaseSelectContactUI.this.mo103377J7();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: I7 */
    public static void m88856I7(MMBaseSelectContactUI mMBaseSelectContactUI) {
        TextView textView;
        mMBaseSelectContactUI.m88857c8();
        View view = mMBaseSelectContactUI.f218617s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setNoResultStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setNoResultStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!Util.isNullOrNil(mMBaseSelectContactUI.mo103380O7())) {
            TextView textView2 = mMBaseSelectContactUI.f218618t;
            if (textView2 != null) {
                C77809r h502 = ((C77810t) C86312j.m106911c(C77810t.class)).h50();
                String string = mMBaseSelectContactUI.getString(C0966R.string.igo);
                String string2 = mMBaseSelectContactUI.getString(C0966R.string.ign);
                String O7 = mMBaseSelectContactUI.mo103380O7();
                ((C77582l) h502).getClass();
                textView2.setText(C99254i.m129307d(string, string2, C99667f.m130088a(O7, O7, false, false)).f292107a);
                String stringExtra = mMBaseSelectContactUI.getIntent().getStringExtra("no_result_tip");
                if (!Util.isNullOrNil(stringExtra) && (textView = mMBaseSelectContactUI.f218619u) != null) {
                    textView.setVisibility(0);
                    mMBaseSelectContactUI.f218619u.setText(stringExtra);
                }
            }
            TextView textView3 = mMBaseSelectContactUI.f218618t;
            textView3.announceForAccessibility(textView3.getText().toString());
            mMBaseSelectContactUI.f218605d.setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c8 */
    public void m88857c8() {
        AlphabetScrollBar alphabetScrollBar;
        Log.m105924i("MicroMsg.MMBaseSelectContactUI", "setInitStatus");
        mo64526b8(this.f218605d, 0);
        C74526m1 m1Var = this.f218607f;
        if (m1Var != null) {
            this.f218605d.setAdapter(m1Var);
            this.f218607f.notifyDataSetChanged();
        } else {
            if (m1Var == null) {
                this.f218607f = mo64513L7();
            }
            this.f218605d.setAdapter(this.f218607f);
        }
        if (mo64520W7() && (alphabetScrollBar = this.f218606e) != null) {
            alphabetScrollBar.setVisibility(0);
        }
        View view = this.f218617s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f218605d.setVisibility(0);
    }

    /* renamed from: D6 */
    public boolean mo7830D6(C75922b bVar) {
        return false;
    }

    /* renamed from: H5 */
    public void mo1321H5() {
        m88857c8();
        if (mo103383X7()) {
            mo103387f8();
        }
        if (mo64519V7()) {
            View view = this.f218611j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f218615q.setBackgroundColor(getResources().getColor(C0966R.color.BW_93));
            View view2 = this.f218612n;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f218615q;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f218605d.setVisibility(0);
        }
    }

    /* renamed from: J7 */
    public void mo103377J7() {
        C106742j1 j1Var = this.f218610i;
        if (j1Var != null) {
            C106757l0 l0Var = j1Var.f319121i;
            if (l0Var != null ? l0Var.mo153789a() : false) {
                this.f218610i.mo153849a();
                return;
            }
            return;
        }
        MultiSelectContactView multiSelectContactView = this.f218609h;
        if (multiSelectContactView != null && multiSelectContactView.hasFocus()) {
            this.f218609h.clearFocus();
        }
    }

    /* renamed from: K7 */
    public void mo103378K7() {
        C106757l0 l0Var;
        C106742j1 j1Var = this.f218610i;
        if (!(j1Var == null || Util.isNullOrNil(j1Var.mo153855g()) || (l0Var = this.f218610i.f319121i) == null)) {
            l0Var.mo153793e(true);
        }
        MultiSelectContactView multiSelectContactView = this.f218609h;
        if (multiSelectContactView != null && !Util.isNullOrNil(multiSelectContactView.getSearchContent())) {
            this.f218609h.mo100242c();
        }
    }

    /* renamed from: L7 */
    public abstract C74526m1 mo64513L7();

    /* renamed from: M7 */
    public abstract C74498h1 mo64514M7();

    /* renamed from: N7 */
    public C74502i1 mo103379N7() {
        if (this.f218605d.getHeaderViewsCount() > 0) {
            if (this.f218605d.getAdapter() instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) this.f218605d.getAdapter();
                if (headerViewListAdapter.getWrappedAdapter() instanceof C74502i1) {
                    return (C74502i1) headerViewListAdapter.getWrappedAdapter();
                }
            }
            return null;
        } else if (this.f218605d.getAdapter() instanceof C74502i1) {
            return (C74502i1) this.f218605d.getAdapter();
        } else {
            return null;
        }
    }

    /* renamed from: O6 */
    public void mo100268O6(String str) {
        Log.m105925i("MicroMsg.MMBaseSelectContactUI", "onSearchTextChange: text=%s", str);
        if (mo103383X7()) {
            mo103387f8();
        }
        if (this.f218608g == null) {
            return;
        }
        if (!Util.isNullOrNil(str)) {
            this.f218608g.mo63130r(str, mo64515P7(), mo103384Y7());
            return;
        }
        this.f218608g.mo96748q();
        this.f218608g.notifyDataSetChanged();
        m88857c8();
    }

    /* renamed from: O7 */
    public final String mo103380O7() {
        C106742j1 j1Var = this.f218610i;
        if (j1Var != null) {
            return j1Var.mo153855g();
        }
        MultiSelectContactView multiSelectContactView = this.f218609h;
        return multiSelectContactView != null ? multiSelectContactView.getSearchContent() : "";
    }

    /* renamed from: P7 */
    public int[] mo64515P7() {
        return new int[]{131072, 131075, 131081};
    }

    /* renamed from: Q7 */
    public abstract String mo64516Q7();

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
    }

    /* renamed from: S0 */
    public void mo5638S0(String str) {
        int i;
        ListAdapter adapter = this.f218605d.getAdapter();
        if (adapter instanceof HeaderViewListAdapter) {
            adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        C74526m1 m1Var = this.f218607f;
        if (adapter != m1Var || m1Var == null) {
            C74498h1 h1Var = this.f218608g;
            i = adapter == h1Var ? h1Var.mo103532s(str) : 0;
        } else {
            i = m1Var.mo7852q(str);
        }
        if (i == 0) {
            this.f218605d.setSelection(0);
        } else if (i > 0) {
            MultiSelectContactView multiSelectContactView = this.f218609h;
            if (multiSelectContactView != null) {
                this.f218605d.setSelectionFromTop(i, multiSelectContactView.getMeasuredHeight());
                Log.m105925i("MicroMsg.MMBaseSelectContactUI", "Select head selectPosition=%d | header=%s | y=%d", Integer.valueOf(i), str, Integer.valueOf(this.f218609h.getMeasuredHeight()));
                return;
            }
            this.f218605d.setSelection(i);
        } else {
            Log.m105925i("MicroMsg.MMBaseSelectContactUI", "Select unkown head selectPosition=%d | header=%s", Integer.valueOf(i), str);
        }
    }

    /* renamed from: S6 */
    public boolean mo1322S6(String str) {
        return false;
    }

    /* renamed from: S7 */
    public void mo103381S7() {
        View view = this.f218611j;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "hideTopSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "hideTopSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f218615q.setBackgroundColor(getResources().getColor(C0966R.color.al6));
        }
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        this.f218604A = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
    }

    /* renamed from: U7 */
    public boolean mo103382U7() {
        return this.f218608g != null;
    }

    /* renamed from: V7 */
    public abstract boolean mo64519V7();

    /* renamed from: W7 */
    public abstract boolean mo64520W7();

    /* renamed from: X7 */
    public boolean mo103383X7() {
        return this instanceof MassSendSelectContactUI;
    }

    /* renamed from: Y7 */
    public boolean mo103384Y7() {
        return false;
    }

    /* renamed from: Z7 */
    public void mo66629Z7() {
        hideVKB();
        finish();
    }

    /* renamed from: a8 */
    public void mo96068a8(String str) {
        Log.m105925i("MicroMsg.MMBaseSelectContactUI", "select label=%s", str);
    }

    /* renamed from: b8 */
    public void mo64526b8(ListView listView, int i) {
    }

    /* renamed from: c6 */
    public void mo100269c6(boolean z) {
        if (mo103383X7()) {
            mo103387f8();
        }
    }

    /* renamed from: d8 */
    public void mo103385d8() {
        MMEditText mMEditText;
        MultiSelectContactView multiSelectContactView = this.f218609h;
        if (multiSelectContactView != null && (mMEditText = multiSelectContactView.f211615s) != null) {
            mMEditText.setHintTextColor(multiSelectContactView.getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
            multiSelectContactView.f211615s.setTextColor(multiSelectContactView.getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
        }
    }

    /* renamed from: e6 */
    public void mo64521e6(int i, String str) {
    }

    /* renamed from: e8 */
    public void mo103386e8(int i) {
        if (this.f218615q != null) {
            int c = i == 0 ? C74942w4.m89786c(getContext(), C0966R.dimen.f3758d_) : C74942w4.m89786c(getContext(), C0966R.dimen.f3763dc);
            if (this.f218615q.getHeight() != c) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f218615q.getLayoutParams();
                layoutParams.height = c;
                this.f218615q.setLayoutParams(layoutParams);
                Log.m105919d("MicroMsg.MMBaseSelectContactUI", "updateHeaderHeight: %d", Integer.valueOf(c));
            }
        }
    }

    /* renamed from: f6 */
    public ListView mo7831f6() {
        return this.f218605d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* renamed from: f8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103387f8() {
        /*
            r3 = this;
            com.tencent.mm.ui.tools.j1 r0 = r3.f218610i
            r1 = 0
            if (r0 == 0) goto L_0x000e
            com.tencent.mm.ui.tools.l0 r0 = r0.f319121i
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.mo153789a()
            goto L_0x0018
        L_0x000e:
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView r0 = r3.f218609h
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.hasFocus()
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r2 = 8
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = r3.mo103380O7()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0044
            java.util.List<java.lang.String> r0 = r3.f218623y
            if (r0 == 0) goto L_0x003e
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x003e
            com.tencent.mm.ui.contact.LabelContainerView r0 = r3.f218620v
            r0.setVisibility(r1)
            com.tencent.mm.ui.base.MMTagPanel r0 = r3.f218621w
            r1 = 0
            java.util.List<java.lang.String> r2 = r3.f218623y
            r0.mo95190q(r1, r2)
            goto L_0x004b
        L_0x003e:
            com.tencent.mm.ui.contact.LabelContainerView r0 = r3.f218620v
            r0.setVisibility(r2)
            goto L_0x004b
        L_0x0044:
            com.tencent.mm.ui.contact.LabelContainerView r0 = r3.f218620v
            if (r0 == 0) goto L_0x004b
            r0.setVisibility(r2)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI.mo103387f8():void");
    }

    public Activity getActivity() {
        return this;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bfg;
    }

    /* renamed from: i7 */
    public void mo1323i7() {
    }

    public void initView() {
        setMMTitle(mo64516Q7());
        this.f218611j = findViewById(C0966R.C0970id.krs);
        this.f218612n = findViewById(C0966R.C0970id.kro);
        ListView listView = (ListView) findViewById(C0966R.C0970id.j9m);
        this.f218605d = listView;
        listView.setVisibility(0);
        if (this.f218607f == null) {
            this.f218607f = mo64513L7();
        }
        this.f218605d.setAdapter(this.f218607f);
        this.f218608g = mo64514M7();
        this.f218614p = findViewById(C0966R.C0970id.jfc);
        if (mo103382U7()) {
            View findViewById = findViewById(C0966R.C0970id.hgt);
            this.f218617s = findViewById;
            findViewById.setTag(C0966R.C0970id.ked, Boolean.FALSE);
            this.f218618t = (TextView) findViewById(C0966R.C0970id.hgr);
            this.f218619u = (TextView) findViewById(C0966R.C0970id.hgs);
            this.f218617s.setOnTouchListener(new C74391a());
            MultiSelectContactView multiSelectContactView = (MultiSelectContactView) findViewById(C0966R.C0970id.bpe);
            this.f218609h = multiSelectContactView;
            multiSelectContactView.measure(View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
            this.f218609h.setOnSearchTextChangeListener(this);
            this.f218609h.setOnSearchTextFouceChangeListener(this);
            this.f218609h.setOnContactDeselectListener(this);
            View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.f7052w9, (ViewGroup) null);
            this.f218616r = inflate;
            this.f218615q = inflate.findViewById(C0966R.C0970id.eu_);
            this.f218605d.addHeaderView(this.f218616r);
            if (mo64519V7()) {
                hideActionbarLine();
                MultiSelectContactView multiSelectContactView2 = this.f218609h;
                if (multiSelectContactView2 != null) {
                    multiSelectContactView2.setVisibility(8);
                }
                View view = this.f218611j;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f218615q.setBackgroundColor(getResources().getColor(C0966R.color.BW_93));
                View view2 = this.f218612n;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C106742j1 j1Var = new C106742j1(true, true);
                this.f218610i = j1Var;
                j1Var.f319122j = this;
                j1Var.f319126n = true;
                this.f218611j.setOnClickListener(new C74392b());
                this.f218612n.setOnTouchListener(new C74393c());
                addSearchMenu(true, this.f218610i);
            } else {
                View view4 = this.f218611j;
                if (view4 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f218615q.setBackgroundColor(getResources().getColor(C0966R.color.al6));
                }
                View view5 = this.f218612n;
                if (view5 != null) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f218609h.setVisibility(0);
            }
        }
        mo64526b8(this.f218605d, 0);
        setBackBtn(new C74394d());
        C74498h1 h1Var = this.f218608g;
        if (h1Var != null) {
            h1Var.mo70172t(new C74395e());
        }
        this.f218605d.setOnScrollListener(new C74396f());
        this.f218605d.setOnItemClickListener(this);
        if (mo64520W7()) {
            AlphabetScrollBar alphabetScrollBar = (AlphabetScrollBar) findViewById(C0966R.C0970id.j9p);
            this.f218606e = alphabetScrollBar;
            alphabetScrollBar.setVisibility(0);
            this.f218606e.setOnScrollBarTouchListener(this);
        }
        if (mo103383X7()) {
            LabelContainerView labelContainerView = (LabelContainerView) findViewById(C0966R.C0970id.j9l);
            this.f218620v = labelContainerView;
            ((TextView) labelContainerView.findViewById(16908310)).setText(C0966R.string.iie);
            MMTagPanel mMTagPanel = (MMTagPanel) this.f218620v.findViewById(C0966R.C0970id.bp_);
            this.f218621w = mMTagPanel;
            mMTagPanel.setTagSelectedBG(C0966R.C0969drawable.awa);
            this.f218621w.setTagSelectedTextColorRes(C0966R.color.a7f);
            this.f218620v.setOnLabelContainerListener(new C74514j1(this));
            this.f218621w.setCallBack(new C74518k1(this));
        }
    }

    /* renamed from: l3 */
    public void mo1324l3(String str) {
        C106757l0 l0Var;
        Log.m105925i("MicroMsg.MMBaseSelectContactUI", "onSearchChange: searchText=%s", str);
        if (mo103383X7()) {
            C106742j1 j1Var = this.f218610i;
            if (!(j1Var == null || (l0Var = j1Var.f319121i) == null)) {
                l0Var.mo153791c();
            }
            mo103387f8();
        }
        if (!Util.isNullOrNil(str)) {
            this.f218608g.mo63130r(str, mo64515P7(), mo103384Y7());
            return;
        }
        this.f218608g.mo96748q();
        this.f218608g.notifyDataSetChanged();
        m88857c8();
    }

    /* renamed from: l5 */
    public void mo1325l5() {
        View view = this.f218612n;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onClickClearText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onClickClearText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: n1 */
    public String mo7833n1(C75922b bVar) {
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.MMBaseSelectContactUI", "onCreate!");
        mo64518T7();
        Log.m105924i("MicroMsg.MMBaseSelectContactUI", "initData done!");
        initView();
        Log.m105924i("MicroMsg.MMBaseSelectContactUI", "initView done!");
    }

    public void onDestroy() {
        super.onDestroy();
        AlphabetScrollBar alphabetScrollBar = this.f218606e;
        if (alphabetScrollBar != null) {
            alphabetScrollBar.f348311q = null;
        }
        C74526m1 m1Var = this.f218607f;
        if (m1Var != null) {
            m1Var.mo7851i();
        }
        C74498h1 h1Var = this.f218608g;
        if (h1Var != null) {
            h1Var.mo7851i();
        }
        C76901s0 s0Var = this.f218613o;
        if (s0Var != null) {
            s0Var.dismiss();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onItemClick(android.widget.AdapterView<?> r17, android.view.View r18, int r19, long r20) {
        /*
            r16 = this;
            r6 = r16
            r7 = r18
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8 = r17
            r0.add(r8)
            r0.add(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r0.add(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r20)
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/ui/contact/MMBaseSelectContactUI"
            java.lang.String r1 = "android/widget/AdapterView$OnItemClickListener"
            java.lang.String r2 = "onItemClick"
            java.lang.String r3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            r4 = r16
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            android.widget.ListView r0 = r6.f218605d
            int r0 = r0.getHeaderViewsCount()
            int r0 = r19 - r0
            if (r0 < 0) goto L_0x0170
            com.tencent.mm.ui.contact.i1 r2 = r16.mo103379N7()
            gl3.b r0 = r2.getItem(r0)
            gl3.b$b r2 = r0.mo67028b()
            androidx.appcompat.app.AppCompatActivity r3 = r16.getContext()
            boolean r2 = r2.mo67031c(r3, r7, r0)
            java.lang.String r3 = r0.f222621r
            java.util.HashSet<java.lang.String> r4 = r6.f218624z
            if (r4 == 0) goto L_0x008a
            if (r3 == 0) goto L_0x008a
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x008a
            java.lang.String r4 = r0.f222619p
            if (r4 == 0) goto L_0x007d
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x007d
            java.util.HashSet<java.lang.String> r4 = r6.f218624z
            boolean r4 = r4.contains(r3)
            if (r4 != 0) goto L_0x0077
            java.util.HashSet<java.lang.String> r4 = r6.f218624z
            r4.add(r3)
            goto L_0x008a
        L_0x0077:
            java.util.HashSet<java.lang.String> r4 = r6.f218624z
            r4.remove(r3)
            goto L_0x008a
        L_0x007d:
            java.util.HashSet<java.lang.String> r4 = r6.f218624z
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x008a
            java.util.HashSet<java.lang.String> r4 = r6.f218624z
            r4.remove(r3)
        L_0x008a:
            java.lang.Class<sx.t> r3 = p240sx.C77810t.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            sx.t r3 = (p240sx.C77810t) r3
            sx.s r3 = r3.Ag0()
            rx.o r3 = (p418rx.C48095o) r3
            r3.getClass()
            boolean r3 = r0.f222626w
            if (r3 != 0) goto L_0x00a1
            goto L_0x016e
        L_0x00a1:
            int r3 = r0.f222624u
            int r4 = r0.f222623t
            boolean r5 = r0.mo106182c()
            r10 = 131072(0x20000, float:1.83671E-40)
            r11 = 11
            r12 = 7
            r13 = 1
            r14 = 6
            r15 = 2
            r1 = 3
            r9 = 5
            if (r5 == 0) goto L_0x00bb
            r11 = 15
        L_0x00b7:
            r4 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0119
        L_0x00bb:
            if (r3 != r10) goto L_0x00f0
            if (r4 == r11) goto L_0x00ed
            switch(r4) {
                case 1: goto L_0x00e0;
                case 2: goto L_0x00dc;
                case 3: goto L_0x00d8;
                case 4: goto L_0x00d4;
                case 5: goto L_0x00d0;
                case 6: goto L_0x00cc;
                case 7: goto L_0x00c8;
                default: goto L_0x00c2;
            }
        L_0x00c2:
            switch(r4) {
                case 15: goto L_0x00ea;
                case 16: goto L_0x00e7;
                case 17: goto L_0x00e4;
                case 18: goto L_0x00e4;
                default: goto L_0x00c5;
            }
        L_0x00c5:
            r4 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0118
        L_0x00c8:
            r4 = 65536(0x10000, float:9.18355E-41)
            r11 = 7
            goto L_0x0119
        L_0x00cc:
            r4 = 65536(0x10000, float:9.18355E-41)
            r11 = 6
            goto L_0x0119
        L_0x00d0:
            r4 = 65536(0x10000, float:9.18355E-41)
            r11 = 5
            goto L_0x0119
        L_0x00d4:
            r4 = 65536(0x10000, float:9.18355E-41)
            r11 = 4
            goto L_0x0119
        L_0x00d8:
            r4 = 65536(0x10000, float:9.18355E-41)
            r11 = 3
            goto L_0x0119
        L_0x00dc:
            r4 = 65536(0x10000, float:9.18355E-41)
            r11 = 2
            goto L_0x0119
        L_0x00e0:
            r4 = 65536(0x10000, float:9.18355E-41)
            r11 = 1
            goto L_0x0119
        L_0x00e4:
            r11 = 9
            goto L_0x00b7
        L_0x00e7:
            r11 = 10
            goto L_0x00b7
        L_0x00ea:
            r11 = 16
            goto L_0x00b7
        L_0x00ed:
            r11 = 8
            goto L_0x00b7
        L_0x00f0:
            r5 = 131075(0x20003, float:1.83675E-40)
            if (r3 != r5) goto L_0x0111
            if (r4 == r13) goto L_0x010e
            if (r4 == r15) goto L_0x010b
            if (r4 == r1) goto L_0x0108
            if (r4 == r9) goto L_0x010e
            if (r4 == r14) goto L_0x010b
            if (r4 == r12) goto L_0x0108
            switch(r4) {
                case 29: goto L_0x00b7;
                case 30: goto L_0x00b7;
                case 31: goto L_0x00b7;
                case 32: goto L_0x00b7;
                default: goto L_0x0104;
            }
        L_0x0104:
            switch(r4) {
                case 34: goto L_0x00b7;
                case 35: goto L_0x00b7;
                case 36: goto L_0x00b7;
                case 37: goto L_0x00b7;
                case 38: goto L_0x00b7;
                default: goto L_0x0107;
            }
        L_0x0107:
            goto L_0x00c5
        L_0x0108:
            r11 = 14
            goto L_0x00b7
        L_0x010b:
            r11 = 13
            goto L_0x00b7
        L_0x010e:
            r11 = 12
            goto L_0x00b7
        L_0x0111:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r3 != r4) goto L_0x0118
            r11 = 17
            goto L_0x0119
        L_0x0118:
            r11 = 0
        L_0x0119:
            int r3 = r0.f222624u
            if (r3 == r4) goto L_0x012a
            if (r3 == r10) goto L_0x0128
            switch(r3) {
                case 131075: goto L_0x0126;
                case 131076: goto L_0x0124;
                default: goto L_0x0122;
            }
        L_0x0122:
            r3 = 0
            goto L_0x012b
        L_0x0124:
            r3 = 4
            goto L_0x012b
        L_0x0126:
            r3 = 3
            goto L_0x012b
        L_0x0128:
            r3 = 2
            goto L_0x012b
        L_0x012a:
            r3 = 5
        L_0x012b:
            int r4 = r0.f222604a
            if (r4 != r9) goto L_0x0130
            goto L_0x0131
        L_0x0130:
            r12 = r3
        L_0x0131:
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.String r4 = r0.f222619p
            r5 = 0
            r3[r5] = r4
            int r4 = r0.f222622s
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r13] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r3[r15] = r4
            int r0 = r0.f222625v
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1 = 4
            r3[r1] = r0
            java.lang.String r0 = "%s,%d,%d,%d,%d"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            java.lang.Object[] r1 = new java.lang.Object[r13]
            r3 = 0
            r1[r3] = r0
            java.lang.String r3 = "MicroMsg.SelectContactReportLogic"
            java.lang.String r4 = "reportClick: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r4, r1)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 13234(0x33b2, float:1.8545E-41)
            r1.kvStat(r3, r0)
        L_0x016e:
            r1 = r2
            goto L_0x0172
        L_0x0170:
            r3 = 0
            r1 = 0
        L_0x0172:
            if (r1 != 0) goto L_0x0184
            com.tencent.mm.ui.contact.i1 r0 = r16.mo103379N7()
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            boolean r1 = r0.mo103531l(r1, r2, r3, r4)
        L_0x0184:
            if (r1 != 0) goto L_0x0189
            r16.mo64517R7(r17, r18, r19, r20)
        L_0x0189:
            java.lang.String r0 = "com/tencent/mm/ui/contact/MMBaseSelectContactUI"
            java.lang.String r1 = "android/widget/AdapterView$OnItemClickListener"
            java.lang.String r2 = "onItemClick"
            java.lang.String r3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            mo66629Z7();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        C76901s0 s0Var = this.f218613o;
        if (s0Var != null) {
            s0Var.dismiss();
        }
    }

    public void onResume() {
        super.onResume();
        if (mo103383X7() && this.f218622x) {
            this.f218622x = false;
            ((C119157j) C119157j.f356862d).mo183875f(new C74521l1(this));
        }
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        return false;
    }

    /* renamed from: y4 */
    public void mo1326y4() {
    }
}
