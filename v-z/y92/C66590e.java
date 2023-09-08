package y92;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.multitask.C56888q;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.multitask.p079ui.minusscreen.view.MinusScreenRoundFrameLayout;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import n60.C100075f;
import v92.C65558a;
import w92.C65943a;

/* renamed from: y92.e */
public abstract class C66590e extends C60896i<C65558a> {

    /* renamed from: e */
    public final int f191495e;

    /* renamed from: f */
    public C65943a f191496f;

    /* renamed from: g */
    public final String f191497g = "MicroMsg.MultiTask.MinusScreenRoundCornerConvert";

    /* renamed from: h */
    public final C100075f f191498h;

    /* renamed from: i */
    public final int f191499i;

    /* renamed from: y92.e$a */
    public static final class C66591a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66590e f191500d;

        /* renamed from: e */
        public final /* synthetic */ C65558a f191501e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f191502f;

        public C66591a(C66590e eVar, C65558a aVar, C60905o oVar) {
            this.f191500d = eVar;
            this.f191501e = aVar;
            this.f191502f = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitask/ui/minusscreen/view/MinusScreenRoundCornerConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C65943a aVar = this.f191500d.f191496f;
            if (aVar != null) {
                aVar.mo89981b(this.f191501e, this.f191502f);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitask/ui/minusscreen/view/MinusScreenRoundCornerConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C66590e(int i, C65943a aVar) {
        this.f191495e = i;
        this.f191496f = aVar;
        C100075f.C100076a aVar2 = new C100075f.C100076a();
        aVar2.f293176b = true;
        aVar2.f293175a = true;
        this.f191498h = aVar2.mo139398a();
        this.f191499i = 5;
    }

    /* renamed from: c */
    public int mo43c() {
        return this.f191495e;
    }

    /* renamed from: d */
    public void mo2292d(RecyclerView recyclerView, WxRecyclerAdapter<?> wxRecyclerAdapter) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(wxRecyclerAdapter, "adapter");
        super.mo2292d(recyclerView, wxRecyclerAdapter);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        View findViewById;
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        String str = this.f191497g;
        Log.m105924i(str, "onCreateViewHolder itemCount:" + itemCount + ", layoutPosition:" + oVar.mo17364k());
        if (itemCount == 2) {
            View findViewById2 = oVar.f44854d.findViewById(C0966R.C0970id.fa8);
            if (findViewById2 != null) {
                MultiTaskUIC.C115597a aVar = MultiTaskUIC.f346667E;
                findViewById2.setTranslationX((float) MultiTaskUIC.f346687W);
                findViewById2.setTranslationY((float) MultiTaskUIC.f346686V);
                findViewById2.getLayoutParams().height = MultiTaskUIC.f346678Q;
                findViewById2.getLayoutParams().width = MultiTaskUIC.f346677P;
                RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) oVar.f44854d.findViewById(C0966R.C0970id.h3h);
                if (roundedCornerFrameLayout != null) {
                    roundedCornerFrameLayout.getLayoutParams().height = MultiTaskUIC.f346685U;
                }
                findViewById2.requestLayout();
            }
        } else if (itemCount == 3) {
            View findViewById3 = oVar.f44854d.findViewById(C0966R.C0970id.fa8);
            if (findViewById3 != null) {
                MultiTaskUIC.C115597a aVar2 = MultiTaskUIC.f346667E;
                findViewById3.setTranslationY((float) MultiTaskUIC.f346688X);
                findViewById3.getLayoutParams().height = MultiTaskUIC.f346676N;
                findViewById3.getLayoutParams().width = MultiTaskUIC.f346675M;
                RoundedCornerFrameLayout roundedCornerFrameLayout2 = (RoundedCornerFrameLayout) oVar.f44854d.findViewById(C0966R.C0970id.h3h);
                if (roundedCornerFrameLayout2 != null) {
                    roundedCornerFrameLayout2.getLayoutParams().height = MultiTaskUIC.f346682S;
                }
                findViewById3.requestLayout();
            }
        } else if (itemCount >= 4 && (findViewById = oVar.f44854d.findViewById(C0966R.C0970id.fa8)) != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            MultiTaskUIC.C115597a aVar3 = MultiTaskUIC.f346667E;
            layoutParams.height = MultiTaskUIC.f346676N;
            findViewById.getLayoutParams().width = MultiTaskUIC.f346675M;
            RoundedCornerFrameLayout roundedCornerFrameLayout3 = (RoundedCornerFrameLayout) oVar.f44854d.findViewById(C0966R.C0970id.h3h);
            if (roundedCornerFrameLayout3 != null) {
                roundedCornerFrameLayout3.getLayoutParams().height = MultiTaskUIC.f346682S;
            }
            findViewById.requestLayout();
        }
    }

    /* renamed from: j */
    public String mo90635j(Context context, C65558a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "item");
        return aVar.f188631d.mo80305m2().f183751d;
    }

    /* renamed from: k */
    public final String mo90636k(int i) {
        if (i < 10) {
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            sb.append(i);
            return sb.toString();
        }
        return i + "";
    }

    /* renamed from: l */
    public void mo90637l(C60905o oVar, C65558a aVar, int i, int i2, boolean z, List<Object> list) {
        C60905o oVar2 = oVar;
        C65558a aVar2 = aVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(aVar2, "item");
        String str = this.f191497g;
        Log.m105918d(str, "onBindViewHolder, position:" + i);
        View findViewById = oVar2.f44854d.findViewById(C0966R.C0970id.h3q);
        TextView textView = (TextView) oVar2.f44854d.findViewById(C0966R.C0970id.h3n);
        TextView textView2 = (TextView) oVar2.f44854d.findViewById(C0966R.C0970id.h3p);
        MMImageView mMImageView = (MMImageView) oVar2.f44854d.findViewById(C0966R.C0970id.h3s);
        MinusScreenRoundFrameLayout minusScreenRoundFrameLayout = (MinusScreenRoundFrameLayout) oVar2.f44854d.findViewById(C0966R.C0970id.h3e);
        TextView textView3 = (TextView) oVar2.f44854d.findViewById(C0966R.C0970id.h3o);
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) oVar2.f44854d.findViewById(C0966R.C0970id.h3h);
        WeImageView weImageView = (WeImageView) oVar2.f44854d.findViewById(C0966R.C0970id.h3k);
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.h3j);
        if (imageView != null) {
            imageView.setOnClickListener(new C66591a(this, aVar2, oVar2));
        }
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        textView.setText(mo90635j(context, aVar2));
        if (Util.isNullOrNil(aVar2.f188631d.mo80305m2().f183752e)) {
            textView2.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C74942w4.m89784a(oVar2.f173499A, 16);
            findViewById.setLayoutParams(marginLayoutParams);
        } else {
            textView2.setVisibility(0);
            textView2.setText(aVar2.f188631d.mo80305m2().f183752e);
            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = C74942w4.m89784a(oVar2.f173499A, 6);
            findViewById.setLayoutParams(marginLayoutParams2);
        }
        if (!Util.isNullOrNil(aVar2.f188631d.mo80305m2().f183759o)) {
            textView3.setText(aVar2.f188631d.mo80305m2().f183759o);
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        minusScreenRoundFrameLayout.setUseBottomGradient(this instanceof C66594h);
        if (aVar2.f188631d.mo80305m2().f183758n) {
            weImageView.setVisibility(0);
            mMImageView.setVisibility(8);
            roundedCornerFrameLayout.setBackgroundColor(oVar2.f173499A.getResources().getColor(C0966R.color.f356958a60));
            int i3 = aVar2.f188631d.field_type;
            weImageView.setImageResource(i3 != 1 ? i3 != 8 ? i3 != 22 ? i3 != 3 ? i3 != 4 ? C0966R.raw.icons_filled_link : C0966R.raw.icons_filled_documentation : C0966R.raw.bottomsheet_icon_fav : C0966R.raw.icons_filled_play2 : C0966R.raw.icons_filled_news : C0966R.raw.icons_filled_mini_program2);
            C20828a.m22825b().mo32513a(C56888q.f162957a.mo80310a(aVar2.f188631d), mMImageView);
        } else {
            weImageView.setVisibility(8);
            mMImageView.setVisibility(0);
            roundedCornerFrameLayout.setBackgroundColor(0);
            MultiTaskInfo multiTaskInfo = aVar2.f188631d;
            C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
            String a = C56888q.f162957a.mo80310a(multiTaskInfo);
            C20828a b = C20828a.m22825b();
            C20937c cVar = C56888q.f162958b;
            C66587d dVar = r0;
            C66587d dVar2 = new C66587d(this, oVar, a, mMImageView, multiTaskInfo, weImageView, roundedCornerFrameLayout);
            b.mo32521j(a, mMImageView, cVar, dVar);
        }
        ImageView imageView2 = (ImageView) oVar2.mo85812D(C0966R.C0970id.h3j);
        if (imageView2 != null) {
            imageView2.setTag(C0966R.C0970id.h5d, Integer.valueOf(aVar2.f188631d.field_type));
        }
        View D = oVar2.mo85812D(C0966R.C0970id.fa8);
        if (D != null) {
            D.setTag(C0966R.C0970id.h5e, Integer.valueOf(aVar2.f188631d.field_type));
        }
    }

    /* renamed from: m */
    public void mo90638m(Bitmap bitmap, ImageView imageView) {
        C87412m.m108594g(bitmap, "bitmap");
        C87412m.m108594g(imageView, "imgView");
    }
}
