package tj1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import er1.C7919x;
import fy3.C32224a;
import fy3.C32226l;
import go3.C76003c;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.function.BiConsumer;
import kg3.C76577a;
import l60.C99342a;
import l60.C99344b;
import nj3.C76912y0;
import pl1.C100810g0;
import pl1.C11984n0;
import pl1.C11990s0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C48769aw;
import te3.C50767p11;
import te3.C50852pn2;
import te3.C52291zp0;
import tf0.C13887q1;
import tj1.C13929a;
import up1.C27696y;
import z04.C112550d0;

/* renamed from: tj1.b */
public final class C13931b {

    /* renamed from: a */
    public final View f39135a;

    /* renamed from: b */
    public final String f39136b = "FinderLiveGiftPkgChooseView";

    /* renamed from: c */
    public final C13601g f39137c = C36568h.m40985a(new C13944m(this));

    /* renamed from: d */
    public final C13601g f39138d = C36568h.m40985a(new C13942k(this));

    /* renamed from: e */
    public final C13601g f39139e;

    /* renamed from: f */
    public final C13601g f39140f;

    /* renamed from: g */
    public final C13601g f39141g;

    /* renamed from: h */
    public final C13601g f39142h;

    /* renamed from: i */
    public C32226l<? super C13929a, C13598b0> f39143i;

    /* renamed from: j */
    public C32224a<? extends C13604l<? extends C52291zp0, ? extends LinkedHashMap<String, C50767p11>>> f39144j;

    /* renamed from: k */
    public C13929a f39145k;

    /* renamed from: l */
    public long f39146l;

    /* renamed from: m */
    public long f39147m;

    /* renamed from: n */
    public LinkedHashMap<String, C50767p11> f39148n;

    /* renamed from: o */
    public LinkedList<C50852pn2> f39149o;

    /* renamed from: p */
    public long f39150p;

    /* renamed from: q */
    public int f39151q;

    /* renamed from: r */
    public final int f39152r;

    /* renamed from: s */
    public final char f39153s;

    /* renamed from: t */
    public final LinkedHashMap<MMEditText, TextWatcher> f39154t;

    /* renamed from: u */
    public final C13601g f39155u;

    /* renamed from: v */
    public int f39156v;

    /* renamed from: w */
    public int f39157w;

    /* renamed from: tj1.b$a */
    public static final class C13932a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13931b f39158d;

        public C13932a(C13931b bVar) {
            this.f39158d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f39158d.mo13395a(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: tj1.b$b */
    public static final class C13933b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13931b f39159d;

        public C13933b(C13931b bVar) {
            this.f39159d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f39159d.mo13395a(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: tj1.b$c */
    public static final class C13934c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13931b f39160d;

        public C13934c(C13931b bVar) {
            this.f39160d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C13931b bVar = this.f39160d;
            if (bVar.f39145k.f39131b > bVar.f39146l) {
                C76912y0.m92773l(bVar.f39135a.getContext(), this.f39160d.f39135a.getContext().getString(C0966R.string.n88, new Object[]{((C13887q1) C86312j.m106911c(C13887q1.class)).Gc0(this.f39160d.f39146l)}));
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (((long) bVar.f39157w) > bVar.f39147m) {
                C76912y0.m92773l(bVar.f39135a.getContext(), this.f39160d.f39135a.getContext().getString(C0966R.string.n8b, new Object[]{Long.valueOf(this.f39160d.f39147m)}));
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                bVar.mo13395a(false);
                C13931b bVar2 = this.f39160d;
                C32226l<? super C13929a, C13598b0> lVar = bVar2.f39143i;
                if (lVar != null) {
                    lVar.invoke(bVar2.f39145k);
                }
                String str = this.f39160d.f39136b;
                Log.m105924i(str, "chosenData = " + this.f39160d.f39145k);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    /* renamed from: tj1.b$d */
    public final class C13935d extends RecyclerView.C16613e<C13936e> {
        public C13935d() {
        }

        public int getItemCount() {
            return C13931b.this.f39145k.f39132c.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            String str;
            C13936e eVar = (C13936e) zVar;
            C87412m.m108594g(eVar, "holder");
            TextWatcher textWatcher = C13931b.this.f39154t.get(eVar.f39162A);
            if (textWatcher != null) {
                eVar.f39162A.removeTextChangedListener(textWatcher);
            }
            C13929a.C13930a aVar = C13931b.this.f39145k.f39132c.get(i);
            C87412m.m108593f(aVar, "currentData.productList.get(position)");
            C13929a.C13930a aVar2 = aVar;
            C48769aw awVar = aVar2.f39134b;
            boolean z = aVar2.f39133a;
            C50767p11 p112 = C13931b.this.f39148n.get(awVar.f130786d);
            Integer num = null;
            C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11984n0(p112 != null ? p112.f139509f : null, C27696y.THUMB_IMAGE));
            ImageView imageView = eVar.f39169z;
            C87412m.m108593f(imageView, "holder.giftThumb");
            ((C99342a) a).mo85954d(imageView);
            TextView textView = eVar.f39164C;
            if (p112 != null) {
                num = Integer.valueOf((int) p112.f139516p);
            }
            textView.setText(String.valueOf(num));
            eVar.f39162A.setText(String.valueOf(awVar.f130787e), TextView.BufferType.EDITABLE);
            TextView textView2 = eVar.f39163B;
            C87412m.m108593f(textView2, "holder.giftNameTv");
            C7919x.m8091a(textView2);
            TextView textView3 = eVar.f39163B;
            if (p112 == null || (str = p112.f139515o) == null) {
                str = "";
            }
            textView3.setText(str);
            eVar.f39165D.setChecked(z);
            eVar.f39165D.setOnClickListener(new C13947c(eVar, awVar, C13931b.this, aVar2));
            eVar.f39162A.setFilters((InputFilter[]) ((C36570n) C13931b.this.f39155u).getValue());
            C13931b bVar = C13931b.this;
            C13951g gVar = new C13951g(aVar2, bVar);
            LinkedHashMap<MMEditText, TextWatcher> linkedHashMap = bVar.f39154t;
            MMEditText mMEditText = eVar.f39162A;
            C87412m.m108593f(mMEditText, "holder.giftCntTv");
            linkedHashMap.put(mMEditText, gVar);
            eVar.f39162A.addTextChangedListener(gVar);
            eVar.f39162A.setTag(Integer.valueOf(i));
            eVar.f39162A.setOnFocusChangeListener(new C13948d(C13931b.this));
            eVar.f39168G.clearColorFilter();
            int i2 = awVar.f130787e;
            C13931b.this.getClass();
            if (i2 == 0) {
                eVar.f39168G.setAlpha(0.3f);
            } else {
                eVar.f39168G.setAlpha(1.0f);
            }
            eVar.f39166E.setOnClickListener(new C13949e(awVar, C13931b.this, eVar, aVar2));
            eVar.f39167F.setOnClickListener(new C13950f(awVar, C13931b.this, eVar, aVar2));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.c69, (ViewGroup) null);
            C87412m.m108593f(inflate, "inflate(\n               …   null\n                )");
            return new C13936e(inflate);
        }
    }

    /* renamed from: tj1.b$e */
    public static final class C13936e extends RecyclerView.C16631z {

        /* renamed from: A */
        public final MMEditText f39162A;

        /* renamed from: B */
        public final TextView f39163B;

        /* renamed from: C */
        public final TextView f39164C;

        /* renamed from: D */
        public final CheckBox f39165D;

        /* renamed from: E */
        public final View f39166E;

        /* renamed from: F */
        public final View f39167F;

        /* renamed from: G */
        public final WeImageView f39168G;

        /* renamed from: z */
        public final ImageView f39169z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13936e(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f39169z = (ImageView) view.findViewById(C0966R.C0970id.j4l);
            this.f39162A = (MMEditText) view.findViewById(C0966R.C0970id.irq);
            this.f39163B = (TextView) view.findViewById(C0966R.C0970id.irr);
            this.f39164C = (TextView) view.findViewById(C0966R.C0970id.irs);
            this.f39165D = (CheckBox) view.findViewById(C0966R.C0970id.hxd);
            this.f39166E = view.findViewById(C0966R.C0970id.hxi);
            this.f39167F = view.findViewById(C0966R.C0970id.i3s);
            this.f39168G = (WeImageView) view.findViewById(C0966R.C0970id.i7x);
        }
    }

    /* renamed from: tj1.b$f */
    public static final class C13937f extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C13931b f39170d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13937f(C13931b bVar) {
            super(0);
            this.f39170d = bVar;
        }

        public Object invoke() {
            return this.f39170d.f39135a.findViewById(C0966R.C0970id.grd);
        }
    }

    /* renamed from: tj1.b$g */
    public static final class C13938g<T, U> implements BiConsumer {

        /* renamed from: a */
        public static final C13938g<T, U> f39171a = new C13938g<>();

        public void accept(Object obj, Object obj2) {
            MMEditText mMEditText = (MMEditText) obj;
            TextWatcher textWatcher = (TextWatcher) obj2;
            C87412m.m108594g(mMEditText, "mmEditText");
            C87412m.m108594g(textWatcher, "textWatcher");
            mMEditText.removeTextChangedListener(textWatcher);
        }
    }

    /* renamed from: tj1.b$h */
    public static final class C13939h extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C13931b f39172d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13939h(C13931b bVar) {
            super(0);
            this.f39172d = bVar;
        }

        public Object invoke() {
            return (TextView) this.f39172d.f39135a.findViewById(C0966R.C0970id.gre);
        }
    }

    /* renamed from: tj1.b$i */
    public static final class C13940i extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C13931b f39173d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13940i(C13931b bVar) {
            super(0);
            this.f39173d = bVar;
        }

        public Object invoke() {
            return this.f39173d.f39135a.findViewById(C0966R.C0970id.h0o);
        }
    }

    /* renamed from: tj1.b$j */
    public static final class C13941j extends C87413o implements C32224a<InputFilter[]> {

        /* renamed from: d */
        public static final C13941j f39174d = new C13941j();

        public C13941j() {
            super(0);
        }

        public Object invoke() {
            return new InputFilter[]{C13952h.f39195d};
        }
    }

    /* renamed from: tj1.b$k */
    public static final class C13942k extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C13931b f39175d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13942k(C13931b bVar) {
            super(0);
            this.f39175d = bVar;
        }

        public Object invoke() {
            return this.f39175d.f39135a.findViewById(C0966R.C0970id.jsg);
        }
    }

    /* renamed from: tj1.b$l */
    public static final class C13943l extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C13931b f39176d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13943l(C13931b bVar) {
            super(0);
            this.f39176d = bVar;
        }

        public Object invoke() {
            return this.f39176d.f39135a.findViewById(C0966R.C0970id.jlb);
        }
    }

    /* renamed from: tj1.b$m */
    public static final class C13944m extends C87413o implements C32224a<LiveBottomSheetPanel> {

        /* renamed from: d */
        public final /* synthetic */ C13931b f39177d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13944m(C13931b bVar) {
            super(0);
            this.f39177d = bVar;
        }

        public Object invoke() {
            View findViewById = this.f39177d.f39135a.findViewById(C0966R.C0970id.jlc);
            C13931b bVar = this.f39177d;
            LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) findViewById;
            liveBottomSheetPanel.setOnVisibilityListener(new C13953i(bVar));
            liveBottomSheetPanel.setTranslationY((float) C75044y4.m89990b(bVar.f39135a.getContext()).y);
            return liveBottomSheetPanel;
        }
    }

    /* renamed from: tj1.b$n */
    public static final class C13945n extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C13931b f39178d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13945n(C13931b bVar) {
            super(0);
            this.f39178d = bVar;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f39178d.f39135a.findViewById(C0966R.C0970id.h0p);
        }
    }

    /* renamed from: tj1.b$o */
    public static final class C13946o extends C87413o implements C32224a<C13935d> {

        /* renamed from: d */
        public final /* synthetic */ C13931b f39179d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13946o(C13931b bVar) {
            super(0);
            this.f39179d = bVar;
        }

        public Object invoke() {
            return new C13935d();
        }
    }

    public C13931b(View view) {
        C87412m.m108594g(view, "root");
        this.f39135a = view;
        C13601g a = C36568h.m40985a(new C13943l(this));
        C13601g a2 = C36568h.m40985a(new C13937f(this));
        C13601g a3 = C36568h.m40985a(new C13940i(this));
        this.f39139e = a3;
        this.f39140f = C36568h.m40985a(new C13939h(this));
        C13601g a4 = C36568h.m40985a(new C13945n(this));
        this.f39141g = a4;
        C13601g a5 = C36568h.m40985a(new C13946o(this));
        this.f39142h = a5;
        this.f39145k = new C13929a(0, 0, new LinkedList());
        this.f39148n = new LinkedHashMap<>();
        this.f39149o = new LinkedList<>();
        this.f39152r = 999;
        this.f39153s = 8197;
        this.f39154t = new LinkedHashMap<>();
        this.f39155u = C36568h.m40985a(C13941j.f39174d);
        this.f39156v = -1;
        ((View) ((C36570n) a).getValue()).setOnClickListener(new C13932a(this));
        ((View) ((C36570n) a2).getValue()).setOnClickListener(new C13933b(this));
        ((View) ((C36570n) a3).getValue()).setOnClickListener(new C13934c(this));
        WxRecyclerView wxRecyclerView = (WxRecyclerView) ((C36570n) a4).getValue();
        wxRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        wxRecyclerView.setAdapter((C13935d) ((C36570n) a5).getValue());
    }

    /* renamed from: a */
    public final void mo13395a(boolean z) {
        C32226l<? super C13929a, C13598b0> lVar;
        if (((LiveBottomSheetPanel) ((C36570n) this.f39137c).getValue()).f165501h) {
            this.f39154t.forEach(C13938g.f39171a);
            this.f39154t.clear();
            ((LiveBottomSheetPanel) ((C36570n) this.f39137c).getValue()).mo78802a();
            IBinder iBinder = null;
            if (z && (lVar = this.f39143i) != null) {
                lVar.invoke(null);
            }
            Context context = this.f39135a.getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                View currentFocus = activity.getCurrentFocus();
                if (currentFocus != null) {
                    iBinder = currentFocus.getWindowToken();
                }
                if (iBinder != null) {
                    Object systemService = this.f39135a.getContext().getSystemService("input_method");
                    C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(iBinder, 0);
                }
            }
            this.f39156v = -1;
        }
    }

    /* renamed from: b */
    public final void mo13396b() {
        C50852pn2 pn22;
        T t;
        C50852pn2 pn23;
        boolean z;
        boolean z2;
        Iterator<T> it = this.f39149o.iterator();
        while (true) {
            pn22 = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C50852pn2) t).f139839d == this.f39151q) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        C50852pn2 pn24 = (C50852pn2) t;
        if (pn24 != null) {
            long j = 0;
            LinkedList<C13929a.C13930a> linkedList = this.f39145k.f39132c;
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList) {
                C13929a.C13930a aVar = (C13929a.C13930a) next;
                if (aVar.f39133a && aVar.f39134b.f130787e > 0) {
                    arrayList.add(next);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C13929a.C13930a aVar2 = (C13929a.C13930a) it4.next();
                C50767p11 p112 = this.f39148n.get(aVar2.f39134b.f130786d);
                j += (long) (((float) aVar2.f39134b.f130787e) * (p112 != null ? p112.f139516p : 0.0f));
            }
            this.f39145k.f39131b = j;
            long j2 = this.f39150p + j;
            if (j2 <= ((C50852pn2) C110818d0.m150914L(this.f39149o)).f139840e) {
                pn23 = (C50852pn2) C110818d0.m150914L(this.f39149o);
            } else {
                LinkedList<C50852pn2> linkedList2 = this.f39149o;
                ListIterator<C50852pn2> listIterator = linkedList2.listIterator(linkedList2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    C50852pn2 previous = listIterator.previous();
                    if (j2 >= previous.f139840e) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        pn22 = previous;
                        break;
                    }
                }
                pn23 = pn22;
                if (pn23 == null) {
                    pn23 = (C50852pn2) C110818d0.m150923U(this.f39149o);
                }
            }
            int i = pn23.f139839d;
            long j3 = pn24.f139840e;
            int dimensionPixelSize = this.f39135a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3723cd);
            Drawable e = C74933u4.m89768e(this.f39135a.getContext(), C0966R.raw.coin_icon, C76577a.m92153d(this.f39135a.getContext(), C0966R.color.akw));
            e.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            C76003c cVar = new C76003c(e, 1);
            int i2 = this.f39151q;
            if (i < i2) {
                SpannableString spannableString = new SpannableString(this.f39135a.getContext().getResources().getString(C0966R.string.n8f, new Object[]{Long.valueOf(j3 - j2)}));
                String string = this.f39135a.getContext().getResources().getString(C0966R.string.n8g);
                C87412m.m108593f(string, "root.context.resources.g…no_enougth_mark_red_part)");
                SpannableString spannableString2 = spannableString;
                int D = C112550d0.m153768D(spannableString2, this.f39153s, 0, false, 6, (Object) null);
                spannableString.setSpan(cVar, D, D + 1, 34);
                int E = C112550d0.m153769E(spannableString2, string, 0, false, 6, (Object) null);
                if (E >= 0 && string.length() + E < spannableString.length()) {
                    spannableString.setSpan(new ForegroundColorSpan(this.f39135a.getContext().getResources().getColor(C0966R.color.a_0)), E, string.length() + E, 34);
                }
                ((TextView) ((C36570n) this.f39140f).getValue()).setText(spannableString);
                this.f39145k.f39130a = this.f39151q;
                ((View) ((C36570n) this.f39139e).getValue()).setEnabled(false);
            } else if (i2 < i) {
                SpannableString spannableString3 = new SpannableString(this.f39135a.getContext().getResources().getString(C0966R.string.n8d, new Object[]{Long.valueOf(j), Integer.valueOf(i)}));
                int D2 = C112550d0.m153768D(spannableString3, this.f39153s, 0, false, 6, (Object) null);
                spannableString3.setSpan(cVar, D2, D2 + 1, 34);
                ((TextView) ((C36570n) this.f39140f).getValue()).setText(spannableString3);
                this.f39145k.f39130a = i;
                ((View) ((C36570n) this.f39139e).getValue()).setEnabled(true);
            } else {
                SpannableString spannableString4 = new SpannableString(this.f39135a.getContext().getResources().getString(C0966R.string.n8e, new Object[]{Long.valueOf(j)}));
                int D3 = C112550d0.m153768D(spannableString4, this.f39153s, 0, false, 6, (Object) null);
                spannableString4.setSpan(cVar, D3, D3 + 1, 34);
                ((TextView) ((C36570n) this.f39140f).getValue()).setText(spannableString4);
                this.f39145k.f39130a = this.f39151q;
                ((View) ((C36570n) this.f39139e).getValue()).setEnabled(true);
            }
        }
    }
}
