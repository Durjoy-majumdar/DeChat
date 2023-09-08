package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.r */
public final class C56983r extends RecyclerView.C16613e<C56984a> {

    /* renamed from: d */
    public final C56986b f163191d;

    /* renamed from: e */
    public final int f163192e;

    /* renamed from: f */
    public final ArrayList<String> f163193f = new ArrayList<>();

    /* renamed from: g */
    public int f163194g = -1;

    /* renamed from: com.tencent.mm.plugin.mv.ui.shake.r$a */
    public final class C56984a extends RecyclerView.C16631z {

        /* renamed from: z */
        public final TextView f163195z;

        /* renamed from: com.tencent.mm.plugin.mv.ui.shake.r$a$a */
        public static final class C56985a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C56983r f163196d;

            /* renamed from: e */
            public final /* synthetic */ C56984a f163197e;

            public C56985a(C56983r rVar, C56984a aVar) {
                this.f163196d = rVar;
                this.f163197e = aVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricAdapter$MusicLyricViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f163196d.f163191d.mo80432j(this.f163197e.mo17363j());
                C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricAdapter$MusicLyricViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56984a(C56983r rVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f163195z = (TextView) view.findViewById(C0966R.C0970id.gjt);
            view.setOnClickListener(new C56985a(rVar, this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.shake.r$b */
    public interface C56986b {
        /* renamed from: j */
        void mo80432j(int i);
    }

    public C56983r(C56986b bVar, int i) {
        C87412m.m108594g(bVar, "itemClickListener");
        this.f163191d = bVar;
        this.f163192e = i;
    }

    public int getItemCount() {
        return this.f163193f.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C56984a aVar = (C56984a) zVar;
        C87412m.m108594g(aVar, "holder");
        aVar.f163195z.setText(this.f163193f.get(i));
        aVar.f163195z.setContentDescription(this.f163193f.get(i));
        if (i == this.f163194g && this.f163192e == 1) {
            aVar.f163195z.setTextColor(-16777216);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (this.f163192e == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.byl, viewGroup, false);
            C87412m.m108593f(inflate, "itemView");
            return new C56984a(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.byk, viewGroup, false);
        C87412m.m108593f(inflate2, "itemView");
        return new C56984a(this, inflate2);
    }
}
