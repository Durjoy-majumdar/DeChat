package com.tencent.p014mm.plugin.finder.p056ui;

import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import ky3.C88334c;
import my3.C61595o;
import org.libpag.PAGView;
import p277yf.C15996c;
import ql1.C12874a;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderLiveNormalOccupyUI5;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderLiveNormalOccupyUI5 */
public final class FinderLiveNormalOccupyUI5 extends MMFinderUI {

    /* renamed from: G */
    public static final /* synthetic */ int f52501G = 0;

    /* renamed from: A */
    public final C13601g f52502A = C36568h.m40985a(new C18758d(this));

    /* renamed from: B */
    public final C13601g f52503B = C36568h.m40985a(new C18759e(this));

    /* renamed from: C */
    public final C13601g f52504C = C36568h.m40985a(new C18760f(this));

    /* renamed from: D */
    public final C13601g f52505D = C36568h.m40985a(new C18761g(this));

    /* renamed from: E */
    public final C13601g f52506E = C36568h.m40985a(new C18764j(this));

    /* renamed from: F */
    public final C13601g f52507F = C36568h.m40985a(new C18762h(this));

    /* renamed from: o */
    public final String f52508o = "Micro.FinderPagLoaderUI";

    /* renamed from: p */
    public final String f52509p = "https://wxapp.tc.qq.com/251/20304/stodownload?m=d1e396e04e11adf78c4fab81c8eb5c65&filekey=30340201010420301e020200fb040253480410d1e396e04e11adf78c4fab81c8eb5c650202501b040d00000004627466730000000132&hy=SH&storeid=161aa14b40001c60a00000000000000fb00004f50534813d6db40b6620efed&dotrans=0&bizid=1023&adaptivelytrans=0";

    /* renamed from: q */
    public final String f52510q = "https://wxapp.tc.qq.com/251/20304/stodownload?m=6c5df5ba07a31cdef08fb41e719e61b2&filekey=30340201010420301e020200fb0402534804106c5df5ba07a31cdef08fb41e719e61b20202723c040d00000004627466730000000132&hy=SH&storeid=5626a3c7100018e4000000000000000fb00004f50534829a34b00b63f4f269&dotrans=0&bizid=1023&adaptivelytrans=0";

    /* renamed from: r */
    public final String f52511r = "https://wxapp.tc.qq.com/251/20304/stodownload?m=1362d4dc5a1a965d26f6fc5a981abcff&filekey=30340201010420301e020200fb0402534804101362d4dc5a1a965d26f6fc5a981abcff02024fde040d00000004627466730000000132&hy=SH&storeid=56242be62000d55c500000000000000fb00004f5053481ec6db40b683982ec&dotrans=0&bizid=1023&adaptivelytrans=0";

    /* renamed from: s */
    public final String f52512s = "https://wxapp.tc.qq.com/251/20304/stodownload?m=d812f5e4cd1f89b0fbf1a19081c8b4ff&filekey=30340201010420301e020200fb040253480410d812f5e4cd1f89b0fbf1a19081c8b4ff02026bce040d00000004627466730000000132&hy=SH&storeid=563bcde740005507e00000000000000fb00004f505348026e0b01e6872b805&dotrans=0&bizid=1023&adaptivelytrans=0";

    /* renamed from: t */
    public final String f52513t = "https://wxapp.tc.qq.com/251/20304/stodownload?m=3251368bbed460fc551a385e0b4f48ab&filekey=30340201010420301e020200fb0402534804103251368bbed460fc551a385e0b4f48ab020276f9040d00000004627466730000000132&hy=SH&storeid=5626a3c03000318a100000000000000fb00004f50534815234b00b6342cc30&dotrans=0&bizid=1023&adaptivelytrans=0";

    /* renamed from: u */
    public final String f52514u = "https://wxapp.tc.qq.com/251/20304/stodownload?m=ae9e7ba5176b533c934288c15187aecb&filekey=30340201010420301e020200fb040253480410ae9e7ba5176b533c934288c15187aecb02025928040d00000004627466730000000132&hy=SH&storeid=161aa173a000a047900000000000000fb00004f5053482d36db40b646a8525&dotrans=0&bizid=1023&adaptivelytrans=0";

    /* renamed from: v */
    public final String f52515v = "https://wxapp.tc.qq.com/251/20304/stodownload?m=cb0d0300ab0038f45448e353c3e53e3d&filekey=30350201010421301f020200fb040253480410cb0d0300ab0038f45448e353c3e53e3d020300d17a040d00000004627466730000000132&hy=SH&storeid=161af495a00074aeb00000000000000fb00004f5053481bb68b40b6990b347&dotrans=0&bizid=1023&adaptivelytrans=0";

    /* renamed from: w */
    public final String f52516w = "https://wxapp.tc.qq.com/251/20304/stodownload?m=99bef3c6947aa5d635cb283dc3554b86&filekey=30350201010421301f020200fb04025348041099bef3c6947aa5d635cb283dc3554b86020300e52e040d00000004627466730000000132&hy=SH&storeid=563775002000e18be00000000000000fb00004f5053481eb008e0b6bae6d4d&dotrans=0&bizid=1023&adaptivelytrans=0";

    /* renamed from: x */
    public final C3679a f52517x = new C3679a(new LinkedList());

    /* renamed from: y */
    public final C13601g f52518y = C36568h.m40985a(new C18765k(this));

    /* renamed from: z */
    public final C13601g f52519z = C36568h.m40985a(new C18763i(this));

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLiveNormalOccupyUI5$a */
    public static final class C3679a extends RecyclerView.C16613e<C3680b> {

        /* renamed from: d */
        public final List<C13604l<String, String>> f16919d;

        public C3679a(List<C13604l<String, String>> list) {
            C87412m.m108594g(list, "dataList");
            this.f16919d = list;
        }

        public int getItemCount() {
            return this.f16919d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C3680b bVar = (C3680b) zVar;
            C87412m.m108594g(bVar, "holder");
            C13604l lVar = this.f16919d.get(i);
            bVar.f16921z.setTag(lVar.f38555d);
            C12874a aVar = C12874a.f36849a;
            PAGView pAGView = bVar.f16921z;
            C87412m.m108593f(pAGView, "holder.pagView");
            C15996c.C15997a.m14902b((C15996c) ((C36570n) C12874a.f36851c).getValue(), (String) lVar.f38556e, pAGView, (String) null, 4, (Object) null);
            C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C3829g1(lVar, (C15601d<? super C3829g1>) null), 3, (Object) null);
            bVar.f16920A.setText((CharSequence) lVar.f38555d);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.f7215yh, viewGroup, false);
            C87412m.m108593f(inflate, "getInflater(parent.conte…em_layout, parent, false)");
            return new C3680b(inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLiveNormalOccupyUI5$b */
    public static final class C3680b extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f16920A;

        /* renamed from: z */
        public final PAGView f16921z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3680b(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f16921z = (PAGView) view.findViewById(C0966R.C0970id.op7);
            this.f16920A = (TextView) view.findViewById(C0966R.C0970id.op5);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLiveNormalOccupyUI5$c */
    public static final class C3681c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveNormalOccupyUI5 f16922d;

        public C3681c(FinderLiveNormalOccupyUI5 finderLiveNormalOccupyUI5) {
            this.f16922d = finderLiveNormalOccupyUI5;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderLiveNormalOccupyUI5$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            for (int i = 0; i < 20; i++) {
                FinderLiveNormalOccupyUI5 finderLiveNormalOccupyUI5 = this.f16922d;
                PAGView pAGView = (PAGView) ((List) ((C36570n) finderLiveNormalOccupyUI5.f52507F).getValue()).get(0);
                C13604l lVar = (C13604l) ((List) ((C36570n) this.f16922d.f52506E).getValue()).get(C61595o.m72299g(C64197v.m75535d((List) ((C36570n) this.f16922d.f52506E).getValue()), C88334c.f255322d));
                String str = finderLiveNormalOccupyUI5.f52508o;
                Log.m105924i(str, "[loadPag] pagView:" + pAGView.getTag() + ", res:" + ((String) lVar.f38555d) + ", thread:" + Thread.currentThread() + ", time:" + System.nanoTime());
                C12874a aVar = C12874a.f36849a;
                ((C15996c) ((C36570n) C12874a.f36851c).getValue()).mo14621a((String) lVar.f38556e, pAGView, (String) lVar.f38555d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderLiveNormalOccupyUI5$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLiveNormalOccupyUI5$d */
    public static final class C18758d extends C87413o implements C32224a<PAGView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveNormalOccupyUI5 f52520d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18758d(FinderLiveNormalOccupyUI5 finderLiveNormalOccupyUI5) {
            super(0);
            this.f52520d = finderLiveNormalOccupyUI5;
        }

        public Object invoke() {
            PAGView pAGView = (PAGView) this.f52520d.findViewById(C0966R.C0970id.op8);
            pAGView.setTag("pagView1");
            return pAGView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLiveNormalOccupyUI5$e */
    public static final class C18759e extends C87413o implements C32224a<PAGView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveNormalOccupyUI5 f52521d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18759e(FinderLiveNormalOccupyUI5 finderLiveNormalOccupyUI5) {
            super(0);
            this.f52521d = finderLiveNormalOccupyUI5;
        }

        public Object invoke() {
            PAGView pAGView = (PAGView) this.f52521d.findViewById(C0966R.C0970id.op9);
            pAGView.setTag("pagView2");
            return pAGView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLiveNormalOccupyUI5$f */
    public static final class C18760f extends C87413o implements C32224a<PAGView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveNormalOccupyUI5 f52522d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18760f(FinderLiveNormalOccupyUI5 finderLiveNormalOccupyUI5) {
            super(0);
            this.f52522d = finderLiveNormalOccupyUI5;
        }

        public Object invoke() {
            PAGView pAGView = (PAGView) this.f52522d.findViewById(C0966R.C0970id.op_);
            pAGView.setTag("pagView3");
            return pAGView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLiveNormalOccupyUI5$g */
    public static final class C18761g extends C87413o implements C32224a<PAGView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveNormalOccupyUI5 f52523d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18761g(FinderLiveNormalOccupyUI5 finderLiveNormalOccupyUI5) {
            super(0);
            this.f52523d = finderLiveNormalOccupyUI5;
        }

        public Object invoke() {
            PAGView pAGView = (PAGView) this.f52523d.findViewById(C0966R.C0970id.opa);
            pAGView.setTag("pagView4");
            return pAGView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLiveNormalOccupyUI5$h */
    public static final class C18762h extends C87413o implements C32224a<List<? extends PAGView>> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveNormalOccupyUI5 f52524d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18762h(FinderLiveNormalOccupyUI5 finderLiveNormalOccupyUI5) {
            super(0);
            this.f52524d = finderLiveNormalOccupyUI5;
        }

        public Object invoke() {
            PAGView pAGView = (PAGView) ((C36570n) this.f52524d.f52502A).getValue();
            C87412m.m108593f(pAGView, "pagView1");
            PAGView pAGView2 = (PAGView) ((C36570n) this.f52524d.f52503B).getValue();
            C87412m.m108593f(pAGView2, "pagView2");
            PAGView pAGView3 = (PAGView) ((C36570n) this.f52524d.f52504C).getValue();
            C87412m.m108593f(pAGView3, "pagView3");
            PAGView pAGView4 = (PAGView) ((C36570n) this.f52524d.f52505D).getValue();
            C87412m.m108593f(pAGView4, "pagView4");
            return C64197v.m75537f(pAGView, pAGView2, pAGView3, pAGView4);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLiveNormalOccupyUI5$i */
    public static final class C18763i extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveNormalOccupyUI5 f52525d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18763i(FinderLiveNormalOccupyUI5 finderLiveNormalOccupyUI5) {
            super(0);
            this.f52525d = finderLiveNormalOccupyUI5;
        }

        public Object invoke() {
            return this.f52525d.findViewById(C0966R.C0970id.op6);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLiveNormalOccupyUI5$j */
    public static final class C18764j extends C87413o implements C32224a<List<? extends C13604l<? extends String, ? extends String>>> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveNormalOccupyUI5 f52526d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18764j(FinderLiveNormalOccupyUI5 finderLiveNormalOccupyUI5) {
            super(0);
            this.f52526d = finderLiveNormalOccupyUI5;
        }

        public Object invoke() {
            FinderLiveNormalOccupyUI5 finderLiveNormalOccupyUI5 = this.f52526d;
            return C64197v.m75537f(new C13604l("干杯", finderLiveNormalOccupyUI5.f52509p), new C13604l("超好看", finderLiveNormalOccupyUI5.f52510q), new C13604l("棒棒糖", finderLiveNormalOccupyUI5.f52511r), new C13604l("突飞猛进", finderLiveNormalOccupyUI5.f52512s), new C13604l("真好听", finderLiveNormalOccupyUI5.f52513t), new C13604l("桃花岛", finderLiveNormalOccupyUI5.f52515v), new C13604l("晚安", finderLiveNormalOccupyUI5.f52514u), new C13604l("甜蜜告白", finderLiveNormalOccupyUI5.f52516w));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLiveNormalOccupyUI5$k */
    public static final class C18765k extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveNormalOccupyUI5 f52527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18765k(FinderLiveNormalOccupyUI5 finderLiveNormalOccupyUI5) {
            super(0);
            this.f52527d = finderLiveNormalOccupyUI5;
        }

        public Object invoke() {
            WxRecyclerView wxRecyclerView = (WxRecyclerView) this.f52527d.findViewById(C0966R.C0970id.op4);
            wxRecyclerView.setLayoutManager(new LinearLayoutManager(this.f52527d, 1, false));
            return wxRecyclerView;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7191wb;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((WxRecyclerView) ((C36570n) this.f52518y).getValue()).setAdapter(this.f52517x);
        ((View) ((C36570n) this.f52519z).getValue()).setOnClickListener(new C3681c(this));
    }
}
