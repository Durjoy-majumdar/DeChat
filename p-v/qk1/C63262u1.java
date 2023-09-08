package qk1;

import al1.C54130j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.HashMap;
import k60.C60979d;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import te3.C49765hx0;
import te3.C64284cg;
import tf0.C64916p1;
import up1.C27696y;

/* renamed from: qk1.u1 */
public final class C63262u1 extends RecyclerView.C16613e<C63263a> {

    /* renamed from: d */
    public final ArrayList<C49765hx0> f179532d = new ArrayList<>();

    /* renamed from: e */
    public HashMap<String, C54130j> f179533e = new HashMap<>();

    /* renamed from: f */
    public C54130j f179534f;

    /* renamed from: g */
    public C32226l<? super C49765hx0, C13598b0> f179535g;

    /* renamed from: qk1.u1$a */
    public static final class C63263a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f179536A;

        /* renamed from: B */
        public final ImageView f179537B;

        /* renamed from: C */
        public final TextView f179538C;

        /* renamed from: D */
        public final TextView f179539D;

        /* renamed from: z */
        public final ImageView f179540z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63263a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f179540z = (ImageView) view.findViewById(C0966R.C0970id.dpd);
            this.f179536A = (TextView) view.findViewById(C0966R.C0970id.dpi);
            this.f179537B = (ImageView) view.findViewById(C0966R.C0970id.dpj);
            this.f179538C = (TextView) view.findViewById(C0966R.C0970id.dpc);
            this.f179539D = (TextView) view.findViewById(C0966R.C0970id.dpm);
        }
    }

    public int getItemCount() {
        return this.f179532d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        String str;
        String str2;
        int i2 = i;
        C63263a aVar = (C63263a) zVar;
        Class cls = C64916p1.class;
        Class cls2 = C11990s0.class;
        Class<C60200t1> cls3 = C60200t1.class;
        C87412m.m108594g(aVar, "holder");
        aVar.f44854d.getContext();
        C49765hx0 hx02 = this.f179532d.get(i2);
        C87412m.m108593f(hx02, "dataList[position]");
        C49765hx0 hx03 = hx02;
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> i25 = ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11872i2();
        FinderContact finderContact = hx03.f134919d;
        FinderAuthInfo finderAuthInfo = null;
        C62345f fVar = new C62345f(finderContact != null ? finderContact.headUrl : null, (C27696y) null, 2, (C8480h) null);
        ImageView imageView = aVar.f179540z;
        C87412m.m108593f(imageView, "holder.avatar");
        i25.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls3).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.AVATAR));
        TextView textView = aVar.f179536A;
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
        C64916p1 p1Var = (C64916p1) c;
        TextView textView2 = aVar.f179536A;
        C87412m.m108593f(textView2, "holder.nicknameTv");
        C58739j4 j4Var = C58739j4.f168176a;
        FinderContact finderContact2 = hx03.f134919d;
        textView.setText(C64916p1.C64917a.m76442i(p1Var, textView2, C58739j4.m68253s(j4Var, (finderContact2 == null || (str2 = finderContact2.username) == null) ? "" : str2, (finderContact2 == null || (str = finderContact2.nickname) == null) ? "" : str, false, 4, (Object) null), 0, 4, (Object) null));
        FinderContact finderContact3 = hx03.f134919d;
        String str3 = finderContact3 != null ? finderContact3.signature : null;
        if (str3 == null || str3.length() == 0) {
            aVar.f179539D.setVisibility(8);
        } else {
            aVar.f179539D.setVisibility(0);
            TextView textView3 = aVar.f179539D;
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Context context = aVar.f179539D.getContext();
            FinderContact finderContact4 = hx03.f134919d;
            textView3.setText(hVar.yp0(context, finderContact4 != null ? finderContact4.signature : null, aVar.f179539D.getTextSize()));
        }
        C54130j jVar = this.f179534f;
        String str4 = jVar != null ? jVar.f151999c : null;
        FinderContact finderContact5 = hx03.f134919d;
        if (Util.isEqual(str4, finderContact5 != null ? finderContact5.username : null)) {
            TextView textView4 = aVar.f179538C;
            textView4.setText(textView4.getContext().getResources().getString(C0966R.string.f360597dr2));
            TextView textView5 = aVar.f179538C;
            textView5.setBackground(textView5.getContext().getDrawable(C0966R.C0969drawable.a2r));
            TextView textView6 = aVar.f179538C;
            textView6.setTextColor(textView6.getContext().getResources().getColor(C0966R.color.Red_100));
        } else {
            HashMap<String, C54130j> hashMap = this.f179533e;
            FinderContact finderContact6 = hx03.f134919d;
            if (hashMap.get(finderContact6 != null ? finderContact6.username : null) == null) {
                TextView textView7 = aVar.f179538C;
                textView7.setText(textView7.getContext().getResources().getString(C0966R.string.f360598dr3));
                TextView textView8 = aVar.f179538C;
                textView8.setBackground(textView8.getContext().getResources().getDrawable(C0966R.C0969drawable.a2r));
                TextView textView9 = aVar.f179538C;
                textView9.setTextColor(textView9.getContext().getResources().getColorStateList(C0966R.color.anm));
            } else {
                TextView textView10 = aVar.f179538C;
                textView10.setText(textView10.getContext().getResources().getString(C0966R.string.f360596dr1));
                TextView textView11 = aVar.f179538C;
                textView11.setBackground(textView11.getContext().getResources().getDrawable(C0966R.C0969drawable.a2r));
                TextView textView12 = aVar.f179538C;
                textView12.setTextColor(textView12.getContext().getResources().getColorStateList(C0966R.color.anm));
            }
        }
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(IFinderCommon…atureService::class.java)");
        C64916p1 p1Var2 = (C64916p1) c2;
        ImageView imageView2 = aVar.f179537B;
        C87412m.m108593f(imageView2, "holder.typeIcon");
        FinderContact finderContact7 = hx03.f134919d;
        if (finderContact7 != null) {
            finderAuthInfo = finderContact7.authInfo;
        }
        C64916p1.C64917a.m76444k(p1Var2, imageView2, finderAuthInfo, 0, (C64284cg) null, 8, (Object) null);
        aVar.f179538C.setOnClickListener(new C63266v1(this, i2));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.ahi, (ViewGroup) null);
        C87412m.m108593f(inflate, "inflate(parent.context, …_anchor_apply_item, null)");
        return new C63263a(inflate);
    }
}
