package qk1;

import al1.C54130j;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import hp1.C8703w0;
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
import te3.C48868bk1;
import te3.C64284cg;
import tf0.C64916p1;
import up1.C27696y;

/* renamed from: qk1.w1 */
public final class C63270w1 extends RecyclerView.C16613e<C63271a> {

    /* renamed from: d */
    public final ArrayList<C48868bk1> f179568d = new ArrayList<>();

    /* renamed from: e */
    public HashMap<String, C54130j> f179569e = new HashMap<>();

    /* renamed from: f */
    public C54130j f179570f;

    /* renamed from: g */
    public C32226l<? super C48868bk1, C13598b0> f179571g;

    /* renamed from: qk1.w1$a */
    public static final class C63271a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f179572A;

        /* renamed from: B */
        public final ImageView f179573B;

        /* renamed from: C */
        public final TextView f179574C;

        /* renamed from: D */
        public final TextView f179575D;

        /* renamed from: z */
        public final ImageView f179576z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63271a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f179576z = (ImageView) view.findViewById(C0966R.C0970id.dpd);
            this.f179572A = (TextView) view.findViewById(C0966R.C0970id.dpi);
            this.f179573B = (ImageView) view.findViewById(C0966R.C0970id.dpj);
            this.f179574C = (TextView) view.findViewById(C0966R.C0970id.dpc);
            this.f179575D = (TextView) view.findViewById(C0966R.C0970id.dpm);
        }
    }

    public int getItemCount() {
        return this.f179568d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        SpannableString spannableString;
        int i2 = i;
        C63271a aVar = (C63271a) zVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Class cls3 = C76979h.class;
        C87412m.m108594g(aVar, "holder");
        C48868bk1 bk12 = this.f179568d.get(i2);
        C87412m.m108593f(bk12, "dataList[position]");
        C48868bk1 bk13 = bk12;
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> i25 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2();
        FinderContact finderContact = bk13.f131162d;
        FinderAuthInfo finderAuthInfo = null;
        C62345f fVar = new C62345f(finderContact != null ? finderContact.headUrl : null, (C27696y) null, 2, (C8480h) null);
        ImageView imageView = aVar.f179576z;
        C87412m.m108593f(imageView, "holder.avatar");
        i25.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
        TextView textView = aVar.f179572A;
        String str = bk13.f131163e;
        boolean z = true;
        if (str == null || str.length() == 0) {
            C76979h hVar = (C76979h) C86312j.m106911c(cls3);
            Context context = MMApplicationContext.getContext();
            FinderContact finderContact2 = bk13.f131162d;
            spannableString = hVar.Te0(context, finderContact2 != null ? finderContact2.nickname : null, aVar.f179572A.getTextSize());
        } else {
            C76979h hVar2 = (C76979h) C86312j.m106911c(cls3);
            Context context2 = MMApplicationContext.getContext();
            C8703w0 w0Var = C8703w0.f27927a;
            String str2 = bk13.f131163e;
            if (str2 == null) {
                str2 = "";
            }
            spannableString = hVar2.Te0(context2, w0Var.mo9552c(str2, ""), aVar.f179572A.getTextSize());
        }
        textView.setText(spannableString);
        FinderContact finderContact3 = bk13.f131162d;
        String str3 = finderContact3 != null ? finderContact3.signature : null;
        if (!(str3 == null || str3.length() == 0)) {
            z = false;
        }
        if (z) {
            aVar.f179575D.setVisibility(8);
        } else {
            aVar.f179575D.setVisibility(0);
            TextView textView2 = aVar.f179575D;
            C76979h hVar3 = (C76979h) C86312j.m106911c(cls3);
            Context context3 = aVar.f179575D.getContext();
            FinderContact finderContact4 = bk13.f131162d;
            textView2.setText(hVar3.yp0(context3, finderContact4 != null ? finderContact4.signature : null, aVar.f179575D.getTextSize()));
        }
        C54130j jVar = this.f179570f;
        String str4 = jVar != null ? jVar.f151999c : null;
        FinderContact finderContact5 = bk13.f131162d;
        if (Util.isEqual(str4, finderContact5 != null ? finderContact5.username : null)) {
            TextView textView3 = aVar.f179574C;
            textView3.setText(textView3.getContext().getResources().getString(C0966R.string.f360597dr2));
            TextView textView4 = aVar.f179574C;
            textView4.setBackground(textView4.getContext().getDrawable(C0966R.C0969drawable.a2r));
            TextView textView5 = aVar.f179574C;
            textView5.setTextColor(textView5.getContext().getResources().getColor(C0966R.color.Red_100));
        } else {
            HashMap<String, C54130j> hashMap = this.f179569e;
            FinderContact finderContact6 = bk13.f131162d;
            if (hashMap.get(finderContact6 != null ? finderContact6.username : null) == null) {
                TextView textView6 = aVar.f179574C;
                textView6.setText(textView6.getContext().getResources().getString(C0966R.string.f360598dr3));
                TextView textView7 = aVar.f179574C;
                textView7.setBackground(textView7.getContext().getResources().getDrawable(C0966R.C0969drawable.a2r));
                TextView textView8 = aVar.f179574C;
                textView8.setTextColor(textView8.getContext().getResources().getColorStateList(C0966R.color.anm));
            } else {
                TextView textView9 = aVar.f179574C;
                textView9.setText(textView9.getContext().getResources().getString(C0966R.string.f360596dr1));
                TextView textView10 = aVar.f179574C;
                textView10.setBackground(textView10.getContext().getResources().getDrawable(C0966R.C0969drawable.a2r));
                TextView textView11 = aVar.f179574C;
                textView11.setTextColor(textView11.getContext().getResources().getColorStateList(C0966R.color.anm));
            }
        }
        C7335d c = C86312j.m106911c(C64916p1.class);
        C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
        C64916p1 p1Var = (C64916p1) c;
        ImageView imageView2 = aVar.f179573B;
        C87412m.m108593f(imageView2, "holder.typeIcon");
        FinderContact finderContact7 = bk13.f131162d;
        if (finderContact7 != null) {
            finderAuthInfo = finderContact7.authInfo;
        }
        C64916p1.C64917a.m76444k(p1Var, imageView2, finderAuthInfo, 0, (C64284cg) null, 8, (Object) null);
        aVar.f179574C.setOnClickListener(new C63277x1(this, i2));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.ahi, (ViewGroup) null);
        C87412m.m108593f(inflate, "inflate(parent.context, …_anchor_apply_item, null)");
        return new C63271a(inflate);
    }
}
