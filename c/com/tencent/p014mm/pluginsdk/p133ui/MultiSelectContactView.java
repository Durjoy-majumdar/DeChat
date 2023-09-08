package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p196ln.C76705f;
import p240sx.C77809r;
import p240sx.C77810t;
import p418rx.C77582l;
import qn3.C77382c;
import t40.C77853a;

/* renamed from: com.tencent.mm.pluginsdk.ui.MultiSelectContactView */
public class MultiSelectContactView extends LinearLayout {

    /* renamed from: w */
    public static final /* synthetic */ int f211602w = 0;

    /* renamed from: d */
    public int f211603d = 1;

    /* renamed from: e */
    public RecyclerView f211604e;

    /* renamed from: f */
    public ArrayList<String> f211605f = new ArrayList<>();

    /* renamed from: g */
    public HashSet<String> f211606g;

    /* renamed from: h */
    public Animation f211607h;

    /* renamed from: i */
    public View f211608i;

    /* renamed from: j */
    public C72731d f211609j;

    /* renamed from: n */
    public C72732e f211610n;

    /* renamed from: o */
    public C72733f f211611o;

    /* renamed from: p */
    public LayoutInflater f211612p;

    /* renamed from: q */
    public int f211613q = getResources().getDimensionPixelSize(C0966R.dimen.f3667aw);

    /* renamed from: r */
    public boolean f211614r = false;

    /* renamed from: s */
    public MMEditText f211615s;

    /* renamed from: t */
    public LinearLayout f211616t;

    /* renamed from: u */
    public String f211617u;

    /* renamed from: v */
    public ImageView f211618v;

    /* renamed from: com.tencent.mm.pluginsdk.ui.MultiSelectContactView$a */
    public class C44600a implements View.OnClickListener {
        public C44600a(MultiSelectContactView multiSelectContactView) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/MultiSelectContactView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.MultiSelectContactView$b */
    public class C72724b extends RecyclerView.C16613e<C72725c> {
        public C72724b() {
        }

        public int getItemCount() {
            return MultiSelectContactView.this.f211605f.size() + 1;
        }

        public int getItemViewType(int i) {
            return i == getItemCount() - 1 ? 1 : 0;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C72725c cVar = (C72725c) zVar;
            Class cls = C77810t.class;
            if (getItemViewType(i) != 1) {
                String str = MultiSelectContactView.this.f211605f.get(i);
                View view = cVar.f44854d;
                View findViewById = view.findViewById(C0966R.C0970id.gol);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactAdapter", "onBindViewHolder", "(Lcom/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactAdapter", "onBindViewHolder", "(Lcom/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C77809r h502 = ((C77810t) C86312j.m106911c(cls)).h50();
                ImageView imageView = cVar.f211621z;
                ((C77582l) h502).getClass();
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, str);
                ImageView imageView2 = cVar.f211621z;
                ((C77582l) ((C77810t) C86312j.m106911c(cls)).h50()).getClass();
                imageView2.setContentDescription(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str));
                view.setTag(str);
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                MultiSelectContactView multiSelectContactView = MultiSelectContactView.this;
                return new C72725c(multiSelectContactView.f211612p.inflate(C0966R.C0971layout.bjj, (ViewGroup) null, false), i);
            }
            MultiSelectContactView multiSelectContactView2 = MultiSelectContactView.this;
            return new C72725c(multiSelectContactView2.f211612p.inflate(C0966R.C0971layout.bvw, (ViewGroup) null, false), i);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.MultiSelectContactView$c */
    public class C72725c extends RecyclerView.C16631z {

        /* renamed from: z */
        public ImageView f211621z;

        /* renamed from: com.tencent.mm.pluginsdk.ui.MultiSelectContactView$c$a */
        public class C72726a implements View.OnClickListener {
            public C72726a(MultiSelectContactView multiSelectContactView) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                int i = MultiSelectContactView.f211602w;
                MultiSelectContactView.this.mo100247g((String) view.getTag(), true, true);
                C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.pluginsdk.ui.MultiSelectContactView$c$b */
        public class C72727b implements TextWatcher {
            public C72727b(MultiSelectContactView multiSelectContactView) {
            }

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                MultiSelectContactView multiSelectContactView = MultiSelectContactView.this;
                int i4 = MultiSelectContactView.f211602w;
                multiSelectContactView.mo100241b();
                C72732e eVar = MultiSelectContactView.this.f211610n;
                if (eVar != null) {
                    eVar.mo100268O6(charSequence.toString());
                }
            }
        }

        /* renamed from: com.tencent.mm.pluginsdk.ui.MultiSelectContactView$c$c */
        public class C72728c implements View.OnKeyListener {
            public C72728c(MultiSelectContactView multiSelectContactView) {
            }

            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(Integer.valueOf(i));
                arrayList.add(keyEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
                if (i == 67 && keyEvent.getAction() == 0 && MultiSelectContactView.this.getInputText().getSelectionStart() == 0 && MultiSelectContactView.this.getInputText().getSelectionEnd() == 0) {
                    MultiSelectContactView multiSelectContactView = MultiSelectContactView.this;
                    if (multiSelectContactView.f211604e.getChildCount() != 1) {
                        RecyclerView recyclerView = multiSelectContactView.f211604e;
                        View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 2);
                        if (!(childAt == null || childAt.findViewById(C0966R.C0970id.gol) == null)) {
                            if (multiSelectContactView.f211614r) {
                                multiSelectContactView.mo100247g((String) childAt.getTag(), true, false);
                                multiSelectContactView.f211614r = false;
                            } else {
                                multiSelectContactView.f211614r = true;
                                int itemCount = multiSelectContactView.f211604e.getAdapter().getItemCount();
                                RecyclerView recyclerView2 = multiSelectContactView.f211604e;
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(Integer.valueOf(itemCount - 1));
                                RecyclerView recyclerView3 = recyclerView2;
                                C117292a.m165358d(recyclerView3, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "scrollToLast", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
                                recyclerView2.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(recyclerView3, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "scrollToLast", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
                                View findViewById = childAt.findViewById(C0966R.C0970id.gol);
                                C9556a aVar2 = new C9556a();
                                aVar2.mo10233c(0);
                                View view2 = findViewById;
                                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "tryDelLastContact", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "tryDelLastContact", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            multiSelectContactView.getInputText().requestFocus();
                        }
                    }
                }
                C117292a.m165362h(false, this, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            }
        }

        /* renamed from: com.tencent.mm.pluginsdk.ui.MultiSelectContactView$c$d */
        public class C72729d implements View.OnFocusChangeListener {
            public C72729d(MultiSelectContactView multiSelectContactView) {
            }

            public void onFocusChange(View view, boolean z) {
                C72733f fVar = MultiSelectContactView.this.f211611o;
                if (fVar != null) {
                    fVar.mo100269c6(z);
                }
            }
        }

        /* renamed from: com.tencent.mm.pluginsdk.ui.MultiSelectContactView$c$e */
        public class C72730e implements Runnable {
            public C72730e(MultiSelectContactView multiSelectContactView) {
            }

            public void run() {
                MultiSelectContactView multiSelectContactView = MultiSelectContactView.this;
                int i = MultiSelectContactView.f211602w;
                multiSelectContactView.mo100253i();
                MultiSelectContactView.this.mo100252h();
            }
        }

        public C72725c(View view, int i) {
            super(view);
            if (i != 1) {
                this.f211621z = (ImageView) view.findViewById(C0966R.C0970id.a1p);
                int i2 = MultiSelectContactView.this.f211613q;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, C74942w4.m89786c(MultiSelectContactView.this.getContext(), C0966R.dimen.f3736cp) + i2);
                layoutParams.rightMargin = MultiSelectContactView.this.getResources().getDimensionPixelSize(C0966R.dimen.f3623g);
                view.setLayoutParams(layoutParams);
                view.setOnClickListener(new C72726a(MultiSelectContactView.this));
                return;
            }
            MultiSelectContactView.this.f211618v = (ImageView) view.findViewById(C0966R.C0970id.h7p);
            MultiSelectContactView.this.mo100254j();
            MultiSelectContactView.this.f211615s = (MMEditText) view.findViewById(C0966R.C0970id.h7o);
            MultiSelectContactView.this.f211616t = (LinearLayout) view.findViewById(C0966R.C0970id.iwc);
            C77382c b = C77382c.m93286b(MultiSelectContactView.this.f211615s);
            b.f225611e = 0;
            b.f225610d = 100;
            b.mo107499d((C77382c.C77383a) null);
            MultiSelectContactView.this.f211615s.addTextChangedListener(new C72727b(MultiSelectContactView.this));
            MultiSelectContactView.this.f211615s.setOnKeyListener(new C72728c(MultiSelectContactView.this));
            MultiSelectContactView.this.f211615s.clearFocus();
            MultiSelectContactView.this.f211615s.setOnFocusChangeListener(new C72729d(MultiSelectContactView.this));
            MultiSelectContactView.this.f211615s.post(new C72730e(MultiSelectContactView.this));
            if (!Util.isNullOrNil(MultiSelectContactView.this.f211617u)) {
                MultiSelectContactView.this.f211615s.setHint(MultiSelectContactView.this.f211617u);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.MultiSelectContactView$d */
    public interface C72731d {
        /* renamed from: e6 */
        void mo64521e6(int i, String str);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.MultiSelectContactView$e */
    public interface C72732e {
        /* renamed from: O6 */
        void mo100268O6(String str);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.MultiSelectContactView$f */
    public interface C72733f {
        /* renamed from: c6 */
        void mo100269c6(boolean z);
    }

    public MultiSelectContactView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        LayoutInflater from = LayoutInflater.from(context);
        this.f211612p = from;
        from.inflate(C0966R.C0971layout.bjk, this, true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226874t);
            i = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        } else {
            i = 0;
        }
        this.f211604e = (RecyclerView) findViewById(C0966R.C0970id.h7n);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.mo16974W(0);
        this.f211604e.setLayoutManager(linearLayoutManager);
        this.f211604e.setAdapter(new C72724b());
        this.f211606g = new HashSet<>();
        this.f211607h = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2393bw);
        View findViewById = findViewById(C0966R.C0970id.iwc);
        this.f211608i = findViewById;
        if (i == this.f211603d) {
            findViewById.setBackgroundResource(C0966R.C0969drawable.bcr);
            this.f211604e.setBackground((Drawable) null);
        }
        setBackgroundColor(context.getResources().getColor(C0966R.color.f2929c));
        setOnClickListener(new C44600a(this));
    }

    /* renamed from: a */
    public final void mo100240a(String str, boolean z) {
        this.f211606g.add(str);
        this.f211605f.add(str);
        int itemCount = this.f211604e.getAdapter().getItemCount();
        this.f211604e.getAdapter().notifyItemInserted(itemCount - 2);
        RecyclerView recyclerView = this.f211604e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(itemCount - 1));
        RecyclerView recyclerView2 = recyclerView;
        C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "addContact", "(Ljava/lang/String;Z)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView2, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "addContact", "(Ljava/lang/String;Z)V", "Undefined", "scrollToPosition", "(I)V");
        mo100254j();
        mo100252h();
        mo100253i();
        C72731d dVar = this.f211609j;
        if (dVar != null) {
            dVar.mo64521e6(0, str);
        }
    }

    /* renamed from: b */
    public final void mo100241b() {
        if (this.f211604e.getChildCount() != 1) {
            RecyclerView recyclerView = this.f211604e;
            View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 2);
            if (this.f211614r && childAt != null) {
                this.f211614r = false;
                View findViewById = childAt.findViewById(C0966R.C0970id.gol);
                if (findViewById != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "clearDelStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "clearDelStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }

    /* renamed from: c */
    public void mo100242c() {
        getInputText().setText("");
    }

    public void clearFocus() {
        getInputText().clearFocus();
        mo100241b();
    }

    /* renamed from: d */
    public void mo100244d(String str) {
        if (!Util.isNullOrNil(str)) {
            mo100241b();
            if (this.f211606g.contains(str)) {
                mo100247g(str, false, false);
            } else {
                mo100240a(str, true);
            }
        }
    }

    /* renamed from: e */
    public void mo100245e(List<String> list) {
        this.f211605f.clear();
        this.f211606g.clear();
        this.f211605f.addAll(list);
        this.f211606g.addAll(list);
        this.f211604e.getAdapter().notifyDataSetChanged();
        int itemCount = this.f211604e.getAdapter().getItemCount();
        RecyclerView recyclerView = this.f211604e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(itemCount - 1));
        RecyclerView recyclerView2 = recyclerView;
        C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "multiSelectChanged", "(Ljava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView2, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "multiSelectChanged", "(Ljava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
        mo100254j();
        mo100252h();
        mo100253i();
    }

    /* renamed from: f */
    public void mo100246f() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f211605f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mo100247g((String) it.next(), false, false);
        }
    }

    /* renamed from: g */
    public final void mo100247g(String str, boolean z, boolean z2) {
        C72731d dVar;
        int indexOf = this.f211605f.indexOf(str);
        if (indexOf >= 0 && indexOf < this.f211605f.size()) {
            this.f211606g.remove(this.f211605f.remove(indexOf));
            this.f211604e.getAdapter().notifyItemRemoved(indexOf);
        }
        mo100254j();
        mo100252h();
        mo100253i();
        if (z && (dVar = this.f211609j) != null) {
            dVar.mo64521e6(1, str);
        }
    }

    public EditText getInputText() {
        return this.f211615s;
    }

    public String getSearchContent() {
        return getInputText() != null ? getInputText().getText().toString() : "";
    }

    public C72725c getSearchHolder() {
        RecyclerView recyclerView = this.f211604e;
        return (C72725c) recyclerView.mo17024J0(recyclerView.getAdapter().getItemCount() - 1, false);
    }

    public View getSearchIcon() {
        return this.f211618v;
    }

    /* renamed from: h */
    public final void mo100252h() {
        int c = C74942w4.m89786c(getContext(), C0966R.dimen.f3886hx);
        if (this.f211604e.getAdapter().getItemCount() > 1) {
            c = this.f211613q + C74942w4.m89786c(getContext(), C0966R.dimen.f3736cp);
        }
        if (getInputText() != null && getInputText().getLayoutParams().height != c) {
            getInputText().getLayoutParams().height = c;
            getInputText().setHeight(c);
            getInputText().invalidate();
            LinearLayout linearLayout = this.f211616t;
            if (linearLayout != null) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.height = c;
                this.f211616t.setLayoutParams(layoutParams);
                this.f211616t.invalidate();
            }
        }
    }

    /* renamed from: i */
    public final void mo100253i() {
        int A = this.f211605f.size() == 0 ? C76577a.m92145A(getContext()) - (this.f211613q * 2) : Math.max(this.f211613q * 2, this.f211604e.getWidth() - ((this.f211605f.size() + 1) * this.f211613q));
        if (getInputText() != null && getInputText().getLayoutParams().width != A) {
            getInputText().getLayoutParams().width = A;
            getInputText().setWidth(A);
            getInputText().invalidate();
        }
    }

    /* renamed from: j */
    public final void mo100254j() {
        if (getSearchIcon() != null) {
            View searchIcon = getSearchIcon();
            int i = this.f211604e.getAdapter().getItemCount() <= 1 ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(searchIcon, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "updateSearchIconVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            searchIcon.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(searchIcon, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "updateSearchIconVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setDefaultHint(String str) {
        this.f211617u = str;
    }

    public void setHiddenSearchWord(String str) {
    }

    public void setOnContactDeselectListener(C72731d dVar) {
        this.f211609j = dVar;
    }

    public void setOnSearchTextChangeListener(C72732e eVar) {
        this.f211610n = eVar;
    }

    public void setOnSearchTextFouceChangeListener(C72733f fVar) {
        this.f211611o = fVar;
    }
}
