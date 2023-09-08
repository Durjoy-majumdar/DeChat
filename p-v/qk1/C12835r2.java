package qk1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.LinkedList;
import ok1.C62042e;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import te3.C64373fs0;
import up1.C27696y;

/* renamed from: qk1.r2 */
public final class C12835r2 extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public C32226l<? super C64373fs0, C13598b0> f36733d;

    /* renamed from: e */
    public C32227p<? super C64373fs0, ? super View, C13598b0> f36734e;

    /* renamed from: f */
    public LinkedList<C64373fs0> f36735f = new LinkedList<>();

    /* renamed from: g */
    public int f36736g = 1;

    /* renamed from: h */
    public boolean f36737h;

    /* renamed from: qk1.r2$a */
    public final class C12836a extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f36738A;

        /* renamed from: B */
        public WeImageView f36739B;

        /* renamed from: z */
        public WeImageView f36740z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12836a(C12835r2 r2Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.l_1);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.visitor_create_iv)");
            this.f36740z = (WeImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.l_2);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.visitor_create_tv)");
            this.f36738A = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.l_0);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.….visitor_create_arrow_iv)");
            this.f36739B = (WeImageView) findViewById3;
        }
    }

    /* renamed from: qk1.r2$b */
    public final class C12837b extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f36741A;

        /* renamed from: B */
        public TextView f36742B;

        /* renamed from: C */
        public WeImageView f36743C;

        /* renamed from: z */
        public ImageView f36744z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12837b(C12835r2 r2Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.l9y);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.visitor_avatar_iv)");
            this.f36744z = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.l_4);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.visitor_nick_name_tv)");
            this.f36741A = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.l_3);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.visitor_mode_tips_tv)");
            this.f36742B = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.l9z);
            C87412m.m108593f(findViewById4, "itemView.findViewById(R.id.visitor_choose_iv)");
            this.f36743C = (WeImageView) findViewById4;
        }
    }

    /* renamed from: F4 */
    public final void mo12365F4(int i, LinkedList<C64373fs0> linkedList, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("updateAliasInfoList,ori size:");
        sb.append(this.f36735f.size());
        sb.append(",new size:");
        sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
        sb.append(",curroleType:");
        sb.append(this.f36736g);
        sb.append(",roleType:");
        sb.append(i);
        sb.append(",enableCreate:");
        sb.append(z);
        Log.m105924i("FinderLiveVisitorRoleAdapter", sb.toString());
        this.f36736g = i;
        this.f36737h = z;
        if (linkedList != null) {
            this.f36735f.clear();
            this.f36735f.addAll(linkedList);
            if (!C62042e.f176370a.mo87129y(this.f36735f)) {
                LinkedList<C64373fs0> linkedList2 = this.f36735f;
                C64373fs0 fs02 = new C64373fs0();
                fs02.f183215f = 10001;
                linkedList2.add(fs02);
            }
        }
    }

    public int getItemCount() {
        return this.f36735f.size();
    }

    public int getItemViewType(int i) {
        return this.f36735f.get(i).f183215f;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        String str;
        C87412m.m108594g(zVar, "holder");
        if (zVar instanceof C12837b) {
            C12837b bVar = (C12837b) zVar;
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            boolean z = true;
            C64373fs0 fs02 = i >= 0 && i < getItemCount() ? this.f36735f.get(i) : null;
            if (fs02 != null) {
                C39818r rVar = C39818r.f106831a;
                ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11865K1().mo85957c(new C62345f(fs02.f183214e, (C27696y) null, 2, (C8480h) null), bVar.f36744z, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
                bVar.f36741A.setText(fs02.f183213d);
                C62042e eVar = C62042e.f176370a;
                int i2 = fs02.f183215f;
                eVar.getClass();
                if (i2 == 1) {
                    str = MMApplicationContext.getContext().getResources().getString(C0966R.string.f360705ea3);
                    C87412m.m108593f(str, "{\n                MMAppl…ole_wechat)\n            }");
                } else if (i2 != 3) {
                    str = "";
                } else {
                    str = MMApplicationContext.getContext().getResources().getString(C0966R.string.e_v);
                    C87412m.m108593f(str, "{\n                MMAppl…ole_finder)\n            }");
                }
                if (str.length() != 0) {
                    z = false;
                }
                if (z) {
                    bVar.f36742B.setVisibility(8);
                } else {
                    bVar.f36742B.setVisibility(0);
                    bVar.f36742B.setText(str);
                }
                if (fs02.f183215f == this.f36736g) {
                    bVar.f36743C.setVisibility(0);
                } else {
                    bVar.f36743C.setVisibility(4);
                }
                bVar.f44854d.setTag(fs02);
            }
            bVar.f44854d.setOnClickListener(new C12841t2(this, bVar));
            bVar.f44854d.setOnLongClickListener(new C12842u2(this));
        } else if (zVar instanceof C12836a) {
            C12836a aVar = (C12836a) zVar;
            if (this.f36737h) {
                aVar.f36740z.setIconColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
                aVar.f36738A.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
                aVar.f36739B.setVisibility(0);
            } else {
                aVar.f36740z.setIconColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_5));
                aVar.f36738A.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_5));
                aVar.f36739B.setVisibility(4);
            }
            aVar.f44854d.setOnClickListener(new C12839s2(this, i, aVar));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 10001) {
            View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.akx, (ViewGroup) null);
            C87412m.m108593f(inflate, "itemView");
            return new C12836a(this, inflate);
        }
        View inflate2 = View.inflate(viewGroup.getContext(), C0966R.C0971layout.akz, (ViewGroup) null);
        C87412m.m108593f(inflate2, "itemView");
        return new C12837b(this, inflate2);
    }
}
