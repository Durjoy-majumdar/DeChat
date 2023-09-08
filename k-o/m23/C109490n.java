package m23;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.vlog.p117ui.plugin.caption.EditorCaptionLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C64368fm;
import z04.C119027c;
import zt3.C119157j;

/* renamed from: m23.n */
public final class C109490n extends LinearLayout implements C7020t0 {

    /* renamed from: d */
    public int f327715d;

    /* renamed from: e */
    public RecyclerView f327716e;

    /* renamed from: f */
    public C109493c f327717f;

    /* renamed from: g */
    public KeyboardHeightProvider f327718g;

    /* renamed from: h */
    public C32227p<? super Integer, ? super ArrayList<C64368fm>, C13598b0> f327719h;

    /* renamed from: i */
    public C32224a<C13598b0> f327720i;

    /* renamed from: j */
    public int f327721j;

    /* renamed from: n */
    public int f327722n;

    /* renamed from: o */
    public final Runnable f327723o;

    /* renamed from: m23.n$a */
    public static final class C109491a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109490n f327724d;

        public C109491a(C109490n nVar) {
            this.f327724d = nVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> cancelClickListener = this.f327724d.getCancelClickListener();
            if (cancelClickListener != null) {
                cancelClickListener.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: m23.n$b */
    public static final class C109492b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109490n f327725d;

        public C109492b(C109490n nVar) {
            this.f327725d = nVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32227p<Integer, ArrayList<C64368fm>, C13598b0> sureClickListener = this.f327725d.getSureClickListener();
            if (sureClickListener != null) {
                sureClickListener.invoke(Integer.valueOf(this.f327725d.f327715d), this.f327725d.f327717f.f327727e);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: m23.n$c */
    public static final class C109493c extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public Context f327726d;

        /* renamed from: e */
        public ArrayList<C64368fm> f327727e = new ArrayList<>();

        /* renamed from: f */
        public final C109494a f327728f = new C109494a(this);

        /* renamed from: m23.n$c$a */
        public static final class C109494a implements TextWatcher {

            /* renamed from: d */
            public int f327729d;

            /* renamed from: e */
            public final /* synthetic */ C109493c f327730e;

            public C109494a(C109493c cVar) {
                this.f327730e = cVar;
            }

            public void afterTextChanged(Editable editable) {
                if (editable != null) {
                    byte[] bytes = editable.toString().getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    this.f327730e.f327727e.get(this.f327729d).f183148d = new C89349b(bytes, 0, bytes.length);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        /* renamed from: m23.n$c$b */
        public static final class C109495b implements View.OnFocusChangeListener {

            /* renamed from: d */
            public final /* synthetic */ C109493c f327731d;

            /* renamed from: e */
            public final /* synthetic */ int f327732e;

            /* renamed from: f */
            public final /* synthetic */ MMEditText f327733f;

            public C109495b(C109493c cVar, int i, MMEditText mMEditText) {
                this.f327731d = cVar;
                this.f327732e = i;
                this.f327733f = mMEditText;
            }

            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    C109494a aVar = this.f327731d.f327728f;
                    aVar.f327729d = this.f327732e;
                    this.f327733f.addTextChangedListener(aVar);
                    return;
                }
                this.f327733f.removeTextChangedListener(this.f327731d.f327728f);
            }
        }

        /* renamed from: m23.n$c$c */
        public static final class C109496c extends RecyclerView.C16631z {
            public C109496c(ViewGroup viewGroup) {
                super(viewGroup);
            }
        }

        public C109493c(Context context) {
            C87412m.m108594g(context, "context");
            this.f327726d = context;
        }

        public int getItemCount() {
            return this.f327727e.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "viewHolder");
            View view = zVar.f44854d;
            C87412m.m108593f(view, "viewHolder.itemView");
            C64368fm fmVar = this.f327727e.get(i);
            C87412m.m108593f(fmVar, "captionItems[position]");
            C64368fm fmVar2 = fmVar;
            if (!fmVar2.f183151g) {
                C89349b bVar = fmVar2.f183148d;
                String str = "";
                if (!TextUtils.isEmpty(bVar == null ? str : bVar.mo123704g("UTF-8"))) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    MMEditText mMEditText = (MMEditText) view.findViewById(C0966R.C0970id.aqh);
                    mMEditText.setOnFocusChangeListener(new C109495b(this, i, mMEditText));
                    C89349b bVar2 = this.f327727e.get(i).f183148d;
                    if (bVar2 != null) {
                        str = bVar2.mo123704g("UTF-8");
                    }
                    mMEditText.setText(str);
                    return;
                }
            }
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            View view3 = view;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(this.f327726d).inflate(C0966R.C0971layout.a0f, viewGroup, false);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            return new C109496c((ViewGroup) inflate);
        }
    }

    /* renamed from: m23.n$d */
    public static final class C109497d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109490n f327734d;

        /* renamed from: e */
        public final /* synthetic */ Context f327735e;

        public C109497d(C109490n nVar, Context context) {
            this.f327734d = nVar;
            this.f327735e = context;
        }

        public final void run() {
            RecyclerView.LayoutManager layoutManager = this.f327734d.f327716e.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            View findViewByPosition = ((LinearLayoutManager) layoutManager).findViewByPosition(this.f327734d.f327721j);
            MMEditText mMEditText = findViewByPosition != null ? (MMEditText) findViewByPosition.findViewById(C0966R.C0970id.aqh) : null;
            if (mMEditText != null) {
                mMEditText.requestFocus();
            }
            if (mMEditText != null) {
                mMEditText.setSelection(mMEditText.getText().length());
            }
            this.f327734d.f327722n++;
            Log.m105924i("MicroMsg.EditorEditCaptionView", "repeat " + this.f327734d.f327722n);
            InputMethodManager inputMethodManager = (InputMethodManager) this.f327735e.getSystemService("input_method");
            if (inputMethodManager != null && !inputMethodManager.showSoftInput(mMEditText, 0)) {
                C109490n nVar = this.f327734d;
                if (nVar.f327722n < 5) {
                    ((C119157j) C119157j.f356862d).mo183869C(nVar.f327723o, 50);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109490n(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f327717f = new C109493c(context);
        this.f327718g = new KeyboardHeightProvider((Activity) context);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.a0g, this, true);
        setBackgroundResource(C0966R.C0969drawable.f4522ez);
        setOrientation(1);
        View findViewById = findViewById(C0966R.C0970id.aqm);
        C87412m.m108593f(findViewById, "findViewById(R.id.caption_list)");
        this.f327716e = (RecyclerView) findViewById;
        findViewById(C0966R.C0970id.aqf).setOnClickListener(new C109491a(this));
        findViewById(C0966R.C0970id.aqu).setOnClickListener(new C109492b(this));
        this.f327716e.setLayoutManager(new EditorCaptionLayoutManager(context, 1));
        this.f327716e.setAdapter(this.f327717f);
        this.f327718g.f220015b = this;
        this.f327723o = new C109497d(this, context);
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        Log.m105924i("MicroMsg.EditorEditCaptionView", "onKeyboardHeightChanged, height:" + i + ", isResized:" + z);
        if (getVisibility() == 0 && (layoutParams = (FrameLayout.LayoutParams) getLayoutParams()) != null) {
            layoutParams.bottomMargin = i;
            setLayoutParams(layoutParams);
        }
    }

    public final C32224a<C13598b0> getCancelClickListener() {
        return this.f327720i;
    }

    public final C32227p<Integer, ArrayList<C64368fm>, C13598b0> getSureClickListener() {
        return this.f327719h;
    }

    public final void setCancelClickListener(C32224a<C13598b0> aVar) {
        this.f327720i = aVar;
    }

    public final void setSureClickListener(C32227p<? super Integer, ? super ArrayList<C64368fm>, C13598b0> pVar) {
        this.f327719h = pVar;
    }
}
