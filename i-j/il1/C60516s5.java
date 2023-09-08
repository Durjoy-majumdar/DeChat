package il1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C54963d0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import er1.C7865r3;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import o40.C61926c;
import ok1.C62042e;
import qj1.C63068w1;
import te3.C51887ww2;

/* renamed from: il1.s5 */
public final class C60516s5 implements View.OnClickListener {

    /* renamed from: d */
    public final RelativeLayout f172486d;

    /* renamed from: e */
    public final C58124b f172487e;

    /* renamed from: f */
    public final C63068w1 f172488f;

    /* renamed from: g */
    public final String f172489g = "FinderLiveMicConditionWidget";

    /* renamed from: h */
    public final View f172490h;

    /* renamed from: i */
    public final C60517a f172491i;

    /* renamed from: j */
    public final ArrayList<C33358b> f172492j;

    /* renamed from: il1.s5$b */
    public static final class C33358b {

        /* renamed from: a */
        public String f90409a;

        /* renamed from: b */
        public boolean f90410b;

        public C33358b(String str, boolean z, int i, C8480h hVar) {
            z = (i & 2) != 0 ? false : z;
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            this.f90409a = str;
            this.f90410b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C33358b)) {
                return false;
            }
            C33358b bVar = (C33358b) obj;
            return C87412m.m108589b(this.f90409a, bVar.f90409a) && this.f90410b == bVar.f90410b;
        }

        public int hashCode() {
            int hashCode = this.f90409a.hashCode() * 31;
            boolean z = this.f90410b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "MicConditionInfo(title=" + this.f90409a + ", checked=" + this.f90410b + ')';
        }
    }

    /* renamed from: il1.s5$a */
    public final class C60517a extends RecyclerView.C16613e<C60518c> {
        public C60517a() {
        }

        public int getItemCount() {
            return C60516s5.this.f172492j.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C60518c cVar = (C60518c) zVar;
            C87412m.m108594g(cVar, "holder");
            C33358b bVar = C60516s5.this.f172492j.get(i);
            C87412m.m108593f(bVar, "dataList[position]");
            C33358b bVar2 = bVar;
            cVar.f172495z.setText(bVar2.f90409a);
            if (bVar2.f90410b) {
                cVar.f172494A.setVisibility(0);
            } else {
                cVar.f172494A.setVisibility(8);
            }
            cVar.f44854d.setOnClickListener(new C60502r5(C60516s5.this, bVar2));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "p0");
            C60516s5 s5Var = C60516s5.this;
            View inflate = View.inflate(s5Var.f172486d.getContext(), C0966R.C0971layout.ai_, (ViewGroup) null);
            C87412m.m108593f(inflate, "inflate(root.context, R.…_condition_item_ui, null)");
            return new C60518c(s5Var, inflate);
        }
    }

    /* renamed from: il1.s5$c */
    public final class C60518c extends RecyclerView.C16631z {

        /* renamed from: A */
        public final WeImageView f172494A;

        /* renamed from: z */
        public final TextView f172495z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60518c(C60516s5 s5Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f172495z = (TextView) view.findViewById(C0966R.C0970id.dsj);
            this.f172494A = (WeImageView) view.findViewById(C0966R.C0970id.dsi);
        }
    }

    /* renamed from: il1.s5$d */
    public static final class C60519d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C60516s5 f172496d;

        public C60519d(C60516s5 s5Var) {
            this.f172496d = s5Var;
        }

        public void onAnimationEnd(Animator animator) {
            this.f172496d.f172486d.setVisibility(8);
        }
    }

    public C60516s5(RelativeLayout relativeLayout, C58124b bVar, C63068w1 w1Var) {
        C87412m.m108594g(relativeLayout, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(w1Var, "basePlugin");
        this.f172486d = relativeLayout;
        this.f172487e = bVar;
        this.f172488f = w1Var;
        View findViewById = relativeLayout.findViewById(C0966R.C0970id.dsm);
        this.f172490h = findViewById;
        RecyclerView recyclerView = (RecyclerView) relativeLayout.findViewById(C0966R.C0970id.dsk);
        C60517a aVar = new C60517a();
        this.f172491i = aVar;
        this.f172492j = new ArrayList<>();
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (C7865r3.f26468a.mo8968a() / 2) + C75044y4.m89991c(relativeLayout.getContext());
        }
        relativeLayout.setTranslationY((float) C75044y4.m89990b(relativeLayout.getContext()).y);
        recyclerView.setAdapter(aVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(relativeLayout.getContext(), 1, false));
        mo85486b();
        relativeLayout.setOnClickListener(this);
        findViewById.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo85485a() {
        this.f172486d.animate().translationY((float) C75044y4.m89990b(this.f172486d.getContext()).y).setDuration(200).setListener(new C60519d(this)).start();
    }

    /* renamed from: b */
    public final void mo85486b() {
        Class cls = C54963d0.class;
        C62042e eVar = C62042e.f176370a;
        C51887ww2 ww22 = ((C54963d0) this.f172488f.mo87696x0(cls)).f154048B;
        long j = 0;
        long j2 = ww22 != null ? ww22.f144324e : 0;
        eVar.getClass();
        boolean z = !C61926c.m72696u((int) j2, 4);
        C51887ww2 ww23 = ((C54963d0) this.f172488f.mo87696x0(cls)).f154048B;
        boolean u = C61926c.m72696u((int) (ww23 != null ? ww23.f144323d : 0), 2);
        C51887ww2 ww24 = ((C54963d0) this.f172488f.mo87696x0(cls)).f154048B;
        boolean u2 = C61926c.m72696u((int) (ww24 != null ? ww24.f144323d : 0), 1);
        C51887ww2 ww25 = ((C54963d0) this.f172488f.mo87696x0(cls)).f154048B;
        if (ww25 != null) {
            j = ww25.f144323d;
        }
        boolean u3 = C61926c.m72696u((int) j, 4);
        String string = u ? this.f172486d.getContext().getResources().getString(C0966R.string.dw8) : u2 ? this.f172486d.getContext().getResources().getString(C0966R.string.dwa) : u3 ? this.f172486d.getContext().getResources().getString(C0966R.string.dw6) : this.f172486d.getContext().getResources().getString(C0966R.string.dw5);
        C87412m.m108593f(string, "when {\n            follo…)\n            }\n        }");
        Log.m105924i(this.f172489g, "prepareData  buyProductSwitchEnable:" + z + "followEnable:" + u + " rewardEnable:" + u2 + " buyProductEnable:" + u3);
        this.f172492j.clear();
        String string2 = this.f172486d.getContext().getResources().getString(C0966R.string.dw5);
        C87412m.m108593f(string2, "root.context.resources.g…r_live_mic_condition_all)");
        C33358b bVar = new C33358b(string2, false, 2, (C8480h) null);
        bVar.f90410b = C87412m.m108589b(bVar.f90409a, string);
        this.f172492j.add(bVar);
        String string3 = this.f172486d.getContext().getResources().getString(C0966R.string.dwa);
        C87412m.m108593f(string3, "root.context.resources.g…ive_mic_condition_reward)");
        C33358b bVar2 = new C33358b(string3, false, 2, (C8480h) null);
        bVar2.f90410b = C87412m.m108589b(bVar2.f90409a, string);
        this.f172492j.add(bVar2);
        String string4 = this.f172486d.getContext().getResources().getString(C0966R.string.dw8);
        C87412m.m108593f(string4, "root.context.resources.g…ive_mic_condition_follow)");
        C33358b bVar3 = new C33358b(string4, false, 2, (C8480h) null);
        bVar3.f90410b = C87412m.m108589b(bVar3.f90409a, string);
        this.f172492j.add(bVar3);
        if (z) {
            String string5 = this.f172486d.getContext().getResources().getString(C0966R.string.dw6);
            C87412m.m108593f(string5, "root.context.resources.g…ic_condition_buy_product)");
            C33358b bVar4 = new C33358b(string5, false, 2, (C8480h) null);
            bVar4.f90410b = C87412m.m108589b(bVar4.f90409a, string);
            this.f172492j.add(bVar4);
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveMicConditionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dsm) {
            mo85485a();
            this.f172488f.f178991t.animate().translationY(0.0f);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMicConditionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
