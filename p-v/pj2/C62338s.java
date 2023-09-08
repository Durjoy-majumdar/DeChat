package pj2;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C33052h4;
import ht1.C60153b5;
import ht1.C60200t1;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kv1.C99254i;
import lv1.C99667f;
import nj2.C61767o;
import o40.C61926c;
import p629ny.C76979h;
import rj2.C63449b;
import rx3.C13598b0;
import sx3.C110818d0;
import ve3.C52844o0;
import ve3.C65680f;
import ve3.C65682g;
import wj2.C66132f;

/* renamed from: pj2.s */
public final class C62338s extends C60896i<C62324e> {

    /* renamed from: e */
    public final int f177183e;

    /* renamed from: f */
    public final C32227p<Integer, C62324e, C13598b0> f177184f;

    /* renamed from: g */
    public final C32227p<Integer, C62324e, C13598b0> f177185g;

    /* renamed from: h */
    public final C32228q<Integer, Boolean, C62324e, C13598b0> f177186h;

    /* renamed from: i */
    public final Set<View> f177187i = new LinkedHashSet();

    /* renamed from: j */
    public final C60153b5 f177188j = ((C33052h4) C86312j.m106911c(C33052h4.class)).mo58657F8();

    /* renamed from: pj2.s$a */
    public static final class C62339a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62338s f177189d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62339a(C62338s sVar) {
            super(0);
            this.f177189d = sVar;
        }

        public Object invoke() {
            C62338s sVar = this.f177189d;
            for (View a : sVar.f177187i) {
                sVar.f177188j.mo84616a(a);
            }
            this.f177189d.f177187i.clear();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pj2.s$b */
    public static final class C62340b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62338s f177190d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f177191e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62340b(C62338s sVar, C60905o oVar) {
            super(0);
            this.f177190d = sVar;
            this.f177191e = oVar;
        }

        public Object invoke() {
            C60153b5 b5Var = this.f177190d.f177188j;
            View D = this.f177191e.mo85812D(C0966R.C0970id.o3g);
            C87412m.m108593f(D, "holder.getView(R.id.ringtone_video_container)");
            b5Var.mo84619d((FrameLayout) D, false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pj2.s$c */
    public static final class C62341c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62338s f177192d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f177193e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62341c(C62338s sVar, C60905o oVar) {
            super(0);
            this.f177192d = sVar;
            this.f177193e = oVar;
        }

        public Object invoke() {
            C60153b5 b5Var = this.f177192d.f177188j;
            View D = this.f177193e.mo85812D(C0966R.C0970id.o3g);
            C87412m.m108593f(D, "holder.getView(R.id.ringtone_video_container)");
            b5Var.mo84618c((FrameLayout) D);
            return C13598b0.f38549a;
        }
    }

    public C62338s(int i, C32227p<? super Integer, ? super C62324e, C13598b0> pVar, C32227p<? super Integer, ? super C62324e, C13598b0> pVar2, C32228q<? super Integer, ? super Boolean, ? super C62324e, C13598b0> qVar) {
        C87412m.m108594g(pVar, "onClickAuthor");
        C87412m.m108594g(pVar2, "onClickUse");
        C87412m.m108594g(qVar, "onPlayStateChange");
        this.f177183e = i;
        this.f177184f = pVar;
        this.f177185g = pVar2;
        this.f177186h = qVar;
    }

    /* renamed from: c */
    public int mo43c() {
        int i = this.f177183e;
        return (i == 1 || i == 2 || i != 3) ? C0966R.C0971layout.f359956d70 : C0966R.C0971layout.f359954cp2;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        FinderObject finderObject;
        C65680f fVar;
        C66132f a;
        C66132f fVar2;
        CharSequence charSequence;
        String str;
        C60905o oVar2 = oVar;
        List list2 = list;
        C62324e eVar = (C62324e) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(eVar, "item");
        StringBuilder sb = new StringBuilder();
        sb.append("onBindViewHolder play:");
        sb.append(eVar.f177155e);
        sb.append(", itemId:");
        sb.append(eVar.getItemId());
        sb.append(", position:");
        sb.append(i);
        sb.append(", payloads:");
        int i3 = 0;
        sb.append(list2 != null ? list2.get(0) : null);
        Log.m105918d("MicroMsg.RingtoneConverter", sb.toString());
        if (list2 == null || list.isEmpty()) {
            Class cls = C60200t1.class;
            C65682g gVar = eVar.f177154d.f189022f;
            if (!(gVar == null || (fVar = gVar.f188994d) == null || (a = C63449b.m74791a(fVar.f188983d)) == null)) {
                oVar2.mo85815G(C0966R.C0970id.f359106iv3, C99254i.m129308e(C99667f.m130088a(a.f190086i, eVar.f177157g, false, false)).f292107a);
                ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.iuc);
                if (imageView != null) {
                    ((C60200t1) C86312j.m106911c(cls)).aa0(a.f190088k, imageView, a.mo90174e());
                }
                int i4 = gVar.f189008u;
                if (i4 == 1) {
                    fVar2 = a;
                    charSequence = oVar2.f173499A.getString(C0966R.string.m3f, new Object[]{Long.valueOf(gVar.f189006s)});
                } else if (i4 == 2) {
                    fVar2 = a;
                    charSequence = oVar2.f173499A.getString(C0966R.string.m3g, new Object[]{((C60200t1) C86312j.m106911c(cls)).mo76868qS((int) gVar.f189002o)});
                } else if (i4 != 3) {
                    fVar2 = a;
                    charSequence = oVar2.f173499A.getString(C0966R.string.m3g, new Object[]{((C60200t1) C86312j.m106911c(cls)).mo76868qS((int) gVar.f189002o)});
                } else {
                    fVar2 = a;
                    C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
                    Context context = oVar2.f173499A;
                    C52844o0 o0Var = gVar.f189009v;
                    if (o0Var == null || (str = o0Var.f147612d) == null) {
                        str = "";
                    }
                    charSequence = hVar.mo107057T1(context, str);
                }
                TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.ml6);
                if (textView != null) {
                    textView.setText(charSequence);
                }
                TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.ml6);
                if (textView2 != null) {
                    C87412m.m108593f(charSequence, "recommendReason");
                    textView2.setVisibility(charSequence.length() > 0 ? 0 : 8);
                }
                int i5 = (int) gVar.f189002o;
                TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.mlf);
                if (textView3 != null) {
                    textView3.setText(oVar2.f173499A.getString(C0966R.string.m3g, new Object[]{((C60200t1) C86312j.m106911c(cls)).mo76868qS(i5)}));
                    if (i5 <= 0) {
                        i3 = 8;
                    }
                    textView3.setVisibility(i3);
                }
                oVar2.mo85815G(C0966R.C0970id.iue, fVar2.f190087j);
                oVar2.mo85812D(C0966R.C0970id.iue).setOnClickListener(new C62333o(this, oVar2, eVar));
                oVar2.mo85812D(C0966R.C0970id.iue).setClickable(true);
                oVar2.mo85812D(C0966R.C0970id.f359445ky1).setOnClickListener(new C62334p(this, oVar2, eVar));
            }
            boolean z2 = eVar.f177155e;
            C66132f a2 = C63449b.m74791a(eVar.getItemId());
            if (!(a2 == null || (finderObject = a2.f190081d) == null)) {
                C60153b5 b5Var = this.f177188j;
                View D = oVar2.mo85812D(C0966R.C0970id.o3g);
                C87412m.m108593f(D, "holder.getView(R.id.ringtone_video_container)");
                View D2 = oVar2.mo85812D(C0966R.C0970id.iuc);
                C87412m.m108593f(D2, "holder.getView(R.id.ringtone_album_iv)");
                C61926c.m72657B("MicroMsg.RingtoneConverter", true, new C62336q(b5Var.mo84617b((FrameLayout) D, (ImageView) D2, finderObject, z2), this));
            }
            if (eVar.f177155e) {
                this.f177186h.invoke(Integer.valueOf(i), Boolean.TRUE, eVar);
            }
        } else {
            Object U = C110818d0.m150923U(list);
            C87412m.m108592e(U, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) U).booleanValue();
            eVar.f177155e = booleanValue;
            C61926c.m72657B("MicroMsg.RingtoneConverter", true, new C62337r(this, oVar2, booleanValue));
            this.f177186h.invoke(Integer.valueOf(i), Boolean.valueOf(booleanValue), eVar);
        }
        mo87409j(eVar, oVar2);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: g */
    public void mo2296g(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        this.f173479d = false;
        C61926c.m72657B("MicroMsg.RingtoneConverter", true, new C62339a(this));
    }

    /* renamed from: h */
    public void mo85791h(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        C62324e eVar = (C62324e) oVar.f173503E;
        int j = oVar.mo17363j();
        if (eVar.f177155e) {
            eVar.f177155e = false;
            C61926c.m72657B("MicroMsg.RingtoneConverter", true, new C62340b(this, oVar));
            this.f177186h.invoke(Integer.valueOf(j), Boolean.FALSE, null);
        }
        mo87409j(eVar, oVar);
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        C61926c.m72657B("MicroMsg.RingtoneConverter", true, new C62341c(this, oVar));
    }

    /* renamed from: j */
    public final void mo87409j(C62324e eVar, C60905o oVar) {
        boolean z = eVar.f177155e;
        int i = 4;
        oVar.mo85817I(C0966R.C0970id.iud, z ? 4 : 0);
        MMAnimateView mMAnimateView = (MMAnimateView) oVar.mo85812D(C0966R.C0970id.o3e);
        if (z) {
            i = 0;
        }
        mMAnimateView.setVisibility(i);
        if (z) {
            mMAnimateView.mo129237x();
            mMAnimateView.setImageFilePath(C61767o.f175575a.mo86686c(C61767o.f175585k));
            mMAnimateView.mo129236w();
            return;
        }
        mMAnimateView.mo129237x();
    }
}
