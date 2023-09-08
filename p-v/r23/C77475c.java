package r23;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import d23.C106976a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;

/* renamed from: r23.c */
public final class C77475c extends RecyclerView.C16613e<C77476a> {

    /* renamed from: d */
    public final List<C77482d> f225915d;

    /* renamed from: e */
    public C77479c f225916e;

    /* renamed from: r23.c$a */
    public abstract class C77476a extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77476a(C77475c cVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }

        /* renamed from: y */
        public abstract void mo107646y(C77482d dVar, int i);

        /* renamed from: z */
        public abstract void mo107647z();
    }

    /* renamed from: r23.c$b */
    public final class C77477b extends C77476a {

        /* renamed from: z */
        public final /* synthetic */ C77475c f225917z;

        /* renamed from: r23.c$b$a */
        public static final class C77478a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C77475c f225918d;

            /* renamed from: e */
            public final /* synthetic */ C77482d f225919e;

            /* renamed from: f */
            public final /* synthetic */ int f225920f;

            public C77478a(C77475c cVar, C77482d dVar, int i) {
                this.f225918d = cVar;
                this.f225919e = dVar;
                this.f225920f = i;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/transition/TransitionAdapter$NoneViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C77479c cVar = this.f225918d.f225916e;
                if (cVar != null) {
                    cVar.mo107639a(this.f225919e, this.f225920f);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/transition/TransitionAdapter$NoneViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77477b(C77475c cVar, View view) {
            super(cVar, view);
            C87412m.m108594g(view, "itemView");
            this.f225917z = cVar;
        }

        /* renamed from: y */
        public void mo107646y(C77482d dVar, int i) {
            C87412m.m108594g(dVar, "item");
            this.f44854d.setSelected(dVar.f225928b);
            this.f44854d.setOnClickListener(new C77478a(this.f225917z, dVar, i));
        }

        /* renamed from: z */
        public void mo107647z() {
        }
    }

    /* renamed from: r23.c$c */
    public interface C77479c {
        /* renamed from: a */
        void mo107639a(C77482d dVar, int i);
    }

    /* renamed from: r23.c$d */
    public final class C77480d extends C77476a {

        /* renamed from: A */
        public final TextView f225921A;

        /* renamed from: B */
        public final /* synthetic */ C77475c f225922B;

        /* renamed from: z */
        public final WeImageView f225923z;

        /* renamed from: r23.c$d$a */
        public static final class C77481a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C77475c f225924d;

            /* renamed from: e */
            public final /* synthetic */ C77482d f225925e;

            /* renamed from: f */
            public final /* synthetic */ int f225926f;

            public C77481a(C77475c cVar, C77482d dVar, int i) {
                this.f225924d = cVar;
                this.f225925e = dVar;
                this.f225926f = i;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/transition/TransitionAdapter$TransitionViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C77479c cVar = this.f225924d.f225916e;
                if (cVar != null) {
                    cVar.mo107639a(this.f225925e, this.f225926f);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/transition/TransitionAdapter$TransitionViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77480d(C77475c cVar, View view) {
            super(cVar, view);
            C87412m.m108594g(view, "itemView");
            this.f225922B = cVar;
            View findViewById = view.findViewById(C0966R.C0970id.epf);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.gif_iv)");
            this.f225923z = (WeImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.kts);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.transition_name_text)");
            this.f225921A = (TextView) findViewById2;
        }

        /* renamed from: y */
        public void mo107646y(C77482d dVar, int i) {
            C87412m.m108594g(dVar, "item");
            CharSequence text = this.f225921A.getText();
            C106976a.C75321a aVar = dVar.f225927a;
            String str = null;
            if (!C87412m.m108589b(text, aVar != null ? aVar.f221478a : null)) {
                WeImageView weImageView = this.f225923z;
                Context context = weImageView.getContext();
                C106976a.C75321a aVar2 = dVar.f225927a;
                weImageView.setImageDrawable(C76577a.m92158i(context, aVar2 != null ? aVar2.f221481d : -1));
                TextView textView = this.f225921A;
                C106976a.C75321a aVar3 = dVar.f225927a;
                if (aVar3 != null) {
                    str = aVar3.f221478a;
                }
                textView.setText(str);
            }
            this.f44854d.setSelected(dVar.f225928b);
            this.f44854d.setOnClickListener(new C77481a(this.f225922B, dVar, i));
        }

        /* renamed from: z */
        public void mo107647z() {
            this.f44854d.setSelected(false);
        }
    }

    public C77475c(List<C77482d> list) {
        C87412m.m108594g(list, "transitionList");
        this.f225915d = list;
    }

    public int getItemCount() {
        return this.f225915d.size();
    }

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C77476a aVar = (C77476a) zVar;
        C87412m.m108594g(aVar, "viewHolder");
        aVar.mo107646y(this.f225915d.get(i), i);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.a0i, viewGroup, false);
            C87412m.m108593f(inflate, "from(parent.context).inf…none_item, parent, false)");
            return new C77477b(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.a0h, viewGroup, false);
        C87412m.m108593f(inflate2, "from(parent.context).inf…tion_item, parent, false)");
        return new C77480d(this, inflate2);
    }

    public void onViewRecycled(RecyclerView.C16631z zVar) {
        C77476a aVar = (C77476a) zVar;
        C87412m.m108594g(aVar, "holder");
        aVar.mo107647z();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C77476a aVar = (C77476a) zVar;
        C87412m.m108594g(aVar, "viewHolder");
        C87412m.m108594g(list, "payloads");
        if (list.size() > 0) {
            C77482d dVar = this.f225915d.get(i);
            C87412m.m108594g(dVar, "item");
            aVar.f44854d.setSelected(dVar.f225928b);
            return;
        }
        aVar.mo107646y(this.f225915d.get(i), i);
    }
}
