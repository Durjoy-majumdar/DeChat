package ob2;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C8503a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: ob2.h */
public final class C110028h extends C104428a {

    /* renamed from: n */
    public final String f329277n;

    /* renamed from: o */
    public final List<C8503a> f329278o;

    /* renamed from: p */
    public final C32227p<C8503a, Boolean, C13598b0> f329279p;

    /* renamed from: q */
    public final C32226l<C8503a, C13598b0> f329280q;

    /* renamed from: r */
    public String f329281r;

    /* renamed from: s */
    public final C13601g f329282s = C36568h.m40985a(new C110035g(this));

    /* renamed from: ob2.h$a */
    public static final class C110029a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final View f329283A;

        /* renamed from: B */
        public final MMAnimateView f329284B;

        /* renamed from: z */
        public final TextView f329285z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110029a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.h_1);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.name)");
            this.f329285z = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.f6k);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.indicator)");
            this.f329283A = findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.j0i);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.sample)");
            this.f329284B = (MMAnimateView) findViewById3;
        }
    }

    /* renamed from: ob2.h$b */
    public final class C110030b extends RecyclerView.C16613e<C110029a> {
        public C110030b() {
        }

        public int getItemCount() {
            return C110028h.this.f329278o.size() + 1;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C110029a aVar = (C110029a) zVar;
            C87412m.m108594g(aVar, "holder");
            String str = null;
            C8503a aVar2 = i == 0 ? null : C110028h.this.f329278o.get(i - 1);
            if (aVar2 != null) {
                str = aVar2.f27531a;
            }
            if (C87412m.m108589b(str, C110028h.this.f329281r)) {
                View view = aVar.f329283A;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view3 = aVar.f329283A;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(4);
                View view4 = view3;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            String str2 = "";
            if (aVar2 != null) {
                aVar.f329284B.setImageFilePath(aVar2.f27533c);
                aVar.f329284B.resume();
                TextView textView = aVar.f329285z;
                String optString = aVar2.f27532b.optString(LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()));
                if (!(optString == null && (optString = aVar2.f27532b.optString("en")) == null)) {
                    str2 = optString;
                }
                textView.setText(str2);
            } else {
                aVar.f329284B.setImageDrawable(aVar.f329284B.getContext().getDrawable(C0966R.raw.f7255wu));
                aVar.f329285z.setText(str2);
            }
            aVar.f44854d.setOnClickListener(new C110036i(C110028h.this, aVar2, this));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.biz, viewGroup, false);
            C87412m.m108593f(inflate, "inflater.inflate(R.layou…fect_item, parent, false)");
            return new C110029a(inflate);
        }
    }

    /* renamed from: ob2.h$c */
    public static final class C110031c implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C110028h f329287d;

        public C110031c(C110028h hVar) {
            this.f329287d = hVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            T t;
            C110028h hVar = this.f329287d;
            C32226l<C8503a, C13598b0> lVar = hVar.f329280q;
            Iterator<T> it = hVar.f329278o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(((C8503a) t).f27531a, hVar.f329277n)) {
                    break;
                }
            }
            lVar.invoke(t);
            this.f329287d.dismiss();
        }
    }

    /* renamed from: ob2.h$d */
    public static final class C110032d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C110028h f329288d;

        public C110032d(C110028h hVar) {
            this.f329288d = hVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f329288d.cancel();
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ob2.h$e */
    public static final class C110033e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C110028h f329289d;

        public C110033e(C110028h hVar) {
            this.f329289d = hVar;
        }

        public final void onClick(View view) {
            T t;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C110028h hVar = this.f329289d;
            C32226l<C8503a, C13598b0> lVar = hVar.f329280q;
            Iterator<T> it = hVar.f329278o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(((C8503a) t).f27531a, hVar.f329281r)) {
                    break;
                }
            }
            lVar.invoke(t);
            this.f329289d.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ob2.h$f */
    public static final class C110034f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C110028h f329290d;

        public C110034f(C110028h hVar) {
            this.f329290d = hVar;
        }

        public final void onClick(View view) {
            T t;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C110028h hVar = this.f329290d;
            C32227p<C8503a, Boolean, C13598b0> pVar = hVar.f329279p;
            Iterator<T> it = hVar.f329278o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(((C8503a) t).f27531a, hVar.f329281r)) {
                    break;
                }
            }
            pVar.invoke(t, Boolean.TRUE);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ob2.h$g */
    public static final class C110035g extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C110028h f329291d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110035g(C110028h hVar) {
            super(0);
            this.f329291d = hVar;
        }

        public Object invoke() {
            View findViewById = this.f329291d.findViewById(C0966R.C0970id.h6t);
            C87412m.m108591d(findViewById);
            return findViewById;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110028h(Context context, String str, List<C8503a> list, C32227p<? super C8503a, ? super Boolean, C13598b0> pVar, C32226l<? super C8503a, C13598b0> lVar) {
        super(context, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(list, "pagInfoList");
        C87412m.m108594g(pVar, "onPreview");
        C87412m.m108594g(lVar, "onSelected");
        this.f329277n = str;
        this.f329278o = list;
        this.f329279p = pVar;
        this.f329280q = lVar;
        this.f329281r = str;
        setContentView((int) C0966R.C0971layout.biy);
    }

    /* renamed from: F */
    public final void mo161372F(boolean z) {
        View view = (View) ((C36570n) this.f329282s).getValue();
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog", "setShowReplay", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog", "setShowReplay", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(C0966R.C0970id.cdo);
        C87412m.m108591d(findViewById);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        recyclerView.setAdapter(new C110030b());
        setOnCancelListener(new C110031c(this));
        View findViewById2 = findViewById(C0966R.C0970id.bee);
        C87412m.m108591d(findViewById2);
        findViewById2.setOnClickListener(new C110032d(this));
        View findViewById3 = findViewById(C0966R.C0970id.bl4);
        C87412m.m108591d(findViewById3);
        findViewById3.setOnClickListener(new C110033e(this));
        View view = (View) ((C36570n) this.f329282s).getValue();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((View) ((C36570n) this.f329282s).getValue()).setOnClickListener(new C110034f(this));
    }
}
