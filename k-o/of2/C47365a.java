package of2;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.p136ui.widget.happybubble.LabelsView;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p629ny.C76979h;
import rx3.C13598b0;
import te3.C52262zh;

/* renamed from: of2.a */
public final class C47365a extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public final List<C52262zh> f127097d;

    /* renamed from: e */
    public C32228q<? super C52262zh, ? super Integer, ? super Integer, C13598b0> f127098e;

    /* renamed from: f */
    public C32224a<C13598b0> f127099f;

    /* renamed from: of2.a$a */
    public static final class C47366a extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47366a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: of2.a$b */
    public static final class C47367b extends RecyclerView.C16631z {

        /* renamed from: A */
        public final LabelsView f127100A;

        /* renamed from: z */
        public final TextView f127101z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47367b(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.ab6);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.biz_profile_menu_title)");
            this.f127101z = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.ab_);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…ile_sub_menu_title_label)");
            this.f127100A = (LabelsView) findViewById2;
        }
    }

    /* renamed from: of2.a$c */
    public static final class C47368c extends RecyclerView.C16631z {

        /* renamed from: z */
        public final TextView f127102z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47368c(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.ab6);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.biz_profile_menu_title)");
            this.f127102z = (TextView) findViewById;
        }
    }

    /* renamed from: of2.a$d */
    public static final class C47369d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C47365a f127103d;

        /* renamed from: e */
        public final /* synthetic */ int f127104e;

        public C47369d(C47365a aVar, int i) {
            this.f127103d = aVar;
            this.f127104e = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C47365a aVar = this.f127103d;
            C32228q<? super C52262zh, ? super Integer, ? super Integer, C13598b0> qVar = aVar.f127098e;
            if (qVar != null) {
                qVar.invoke(aVar.f127097d.get(this.f127104e), Integer.valueOf(this.f127104e), 0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: of2.a$e */
    public static final class C47370e implements LabelsView.C106817c {

        /* renamed from: a */
        public final /* synthetic */ C47365a f127105a;

        /* renamed from: b */
        public final /* synthetic */ int f127106b;

        public C47370e(C47365a aVar, int i) {
            this.f127105a = aVar;
            this.f127106b = i;
        }

        /* renamed from: a */
        public final void mo22844a(TextView textView, Object obj, int i) {
            C32228q<? super C52262zh, ? super Integer, ? super Integer, C13598b0> qVar = this.f127105a.f127098e;
            if (qVar != null) {
                C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizServiceMenuButton");
                qVar.invoke((C52262zh) obj, Integer.valueOf(this.f127106b), Integer.valueOf(i));
            }
        }
    }

    /* renamed from: of2.a$f */
    public static final class C47371f<T> implements LabelsView.C106816b {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.C16631z f127107a;

        /* renamed from: b */
        public final /* synthetic */ C47365a f127108b;

        /* renamed from: c */
        public final /* synthetic */ int f127109c;

        public C47371f(RecyclerView.C16631z zVar, C47365a aVar, int i) {
            this.f127107a = zVar;
            this.f127108b = aVar;
            this.f127109c = i;
        }

        /* renamed from: a */
        public CharSequence mo22831a(TextView textView, int i, Object obj) {
            C52262zh zhVar = (C52262zh) obj;
            C7007c1.m7256a(textView);
            textView.setOnClickListener(new C47373b(this.f127108b, zhVar, this.f127109c, i));
            String string = this.f127107a.f44854d.getContext().getResources().getString(C0966R.string.aqj);
            C87412m.m108593f(string, "holder.itemView.context.…meline_service_tab_label)");
            Object[] objArr = new Object[1];
            String str = null;
            objArr[0] = zhVar != null ? zhVar.f145950f : null;
            String format = String.format(string, Arrays.copyOf(objArr, 1));
            C87412m.m108593f(format, "format(format, *args)");
            textView.setContentDescription(format);
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Context context = ((C47367b) this.f127107a).f127101z.getContext();
            if (zhVar != null) {
                str = zhVar.f145950f;
            }
            SpannableString T1 = hVar.mo107057T1(context, str);
            return T1 != null ? T1 : "";
        }
    }

    /* renamed from: of2.a$g */
    public static final class C47372g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C47365a f127110d;

        public C47372g(C47365a aVar) {
            this.f127110d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> aVar = this.f127110d.f127099f;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C47365a(List<? extends C52262zh> list) {
        C87412m.m108594g(list, "menuList");
        this.f127097d = list;
    }

    public int getItemCount() {
        return this.f127097d.size() + 1;
    }

    public int getItemViewType(int i) {
        if (i >= this.f127097d.size()) {
            return 3;
        }
        return this.f127097d.get(i).f145949e == 0 ? 2 : 1;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        Class cls = C76979h.class;
        C87412m.m108594g(zVar, "holder");
        if (zVar instanceof C47368c) {
            C47368c cVar = (C47368c) zVar;
            SpannableString T1 = ((C76979h) C86312j.m106911c(cls)).mo107057T1(cVar.f127102z.getContext(), this.f127097d.get(i).f145950f);
            C87412m.m108593f(T1, "getService(ISpannableSer… menuList[position].name)");
            cVar.f127102z.setText(T1);
            zVar.f44854d.setOnClickListener(new C47369d(this, i));
        } else if (zVar instanceof C47367b) {
            C47367b bVar = (C47367b) zVar;
            SpannableString T12 = ((C76979h) C86312j.m106911c(cls)).mo107057T1(bVar.f127101z.getContext(), this.f127097d.get(i).f145950f);
            C87412m.m108593f(T12, "getService(ISpannableSer… menuList[position].name)");
            bVar.f127101z.setText(T12);
            bVar.f127100A.setOnLabelClickListener(new C47370e(this, i));
            bVar.f127100A.mo154537i(this.f127097d.get(i).f145953i, new C47371f(zVar, this, i));
        } else if (zVar instanceof C47366a) {
            C7007c1.m7256a(zVar.f44854d);
            zVar.f44854d.setOnClickListener(new C47372g(this));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f7072xc, viewGroup, false);
            C87412m.m108593f(inflate, "view");
            return new C47368c(inflate);
        } else if (i != 2) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f7057we, viewGroup, false);
            C87412m.m108593f(inflate2, "view");
            return new C47366a(inflate2);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f7071xb, viewGroup, false);
            C87412m.m108593f(inflate3, "view");
            return new C47367b(inflate3);
        }
    }
}
