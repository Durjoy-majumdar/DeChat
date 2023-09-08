package es0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandProfileUI;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandRecommendStatObj;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.text.DecimalFormat;
import java.util.LinkedList;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;
import oi0.C89215e;
import oi0.C89217f;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64826xd2;
import te3.C90419io3;

/* renamed from: es0.a */
public final class C86647a extends RecyclerView.C16613e<C86650c> {

    /* renamed from: d */
    public final Activity f251610d;

    /* renamed from: e */
    public final C13601g f251611e = C36568h.m40985a(C86660m.f251633d);

    /* renamed from: f */
    public C32227p<? super C90419io3, ? super Integer, C13598b0> f251612f = C86657j.f251630d;

    /* renamed from: g */
    public C32227p<? super C90419io3, ? super Integer, C13598b0> f251613g = C86659l.f251632d;

    /* renamed from: h */
    public C32227p<? super C90419io3, ? super Integer, C13598b0> f251614h = C86658k.f251631d;

    /* renamed from: i */
    public DecimalFormat f251615i = new DecimalFormat("0.00");

    /* renamed from: es0.a$a */
    public final class C86648a extends C86650c {

        /* renamed from: C */
        public final TextView f251616C;

        /* renamed from: D */
        public final TextView f251617D;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86648a(C86647a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.f5983u1);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…d_recommend_content_desc)");
            this.f251616C = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.f5987u5);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…ecommend_footer_app_name)");
            this.f251617D = (TextView) findViewById2;
        }
    }

    /* renamed from: es0.a$b */
    public class C86649b extends C86655h {

        /* renamed from: G */
        public final ImageView f251618G;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86649b(C86647a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.f5992u_);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…rand_recommend_play_icon)");
            this.f251618G = (ImageView) findViewById;
        }
    }

    /* renamed from: es0.a$c */
    public class C86650c extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f251619A;

        /* renamed from: B */
        public final ViewGroup f251620B;

        /* renamed from: z */
        public final ImageView f251621z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86650c(C86647a aVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.f5984u2);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…d_recommend_content_icon)");
            this.f251621z = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.f5994ub);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…p_brand_recommend_reason)");
            this.f251619A = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.f5982u0);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.…_brand_recommend_content)");
            this.f251620B = (ViewGroup) findViewById3;
        }
    }

    /* renamed from: es0.a$d */
    public final class C86651d extends C86649b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86651d(C86647a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: es0.a$e */
    public final class C86652e extends C86656i {

        /* renamed from: F */
        public final TextView f251622F;

        /* renamed from: G */
        public final TextView f251623G;

        /* renamed from: H */
        public final TextView f251624H;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86652e(C86647a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.f5990u8);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…and_recommend_goods_name)");
            this.f251622F = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.f5985u3);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…recommend_discount_price)");
            this.f251623G = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.f5991u9);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.…d_recommend_origin_price)");
            this.f251624H = (TextView) findViewById3;
        }
    }

    /* renamed from: es0.a$f */
    public final class C86653f extends C86655h {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86653f(C86647a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: es0.a$g */
    public class C86654g extends C86655h {

        /* renamed from: G */
        public final ImageView f251625G;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86654g(C86647a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.f5992u_);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…rand_recommend_play_icon)");
            this.f251625G = (ImageView) findViewById;
        }
    }

    /* renamed from: es0.a$h */
    public class C86655h extends C86656i {

        /* renamed from: F */
        public final TextView f251626F;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86655h(C86647a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.f5983u1);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…d_recommend_content_desc)");
            this.f251626F = (TextView) findViewById;
        }
    }

    /* renamed from: es0.a$i */
    public class C86656i extends C86650c {

        /* renamed from: C */
        public final ImageView f251627C;

        /* renamed from: D */
        public final TextView f251628D;

        /* renamed from: E */
        public final ViewGroup f251629E;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86656i(C86647a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.f5989u7);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…nd_recommend_footer_icon)");
            this.f251627C = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.f5987u5);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…ecommend_footer_app_name)");
            this.f251628D = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.f5986u4);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.…p_brand_recommend_footer)");
            this.f251629E = (ViewGroup) findViewById3;
        }
    }

    /* renamed from: es0.a$j */
    public static final class C86657j extends C87413o implements C32227p<C90419io3, Integer, C13598b0> {

        /* renamed from: d */
        public static final C86657j f251630d = new C86657j();

        public C86657j() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C87412m.m108594g((C90419io3) obj, "<anonymous parameter 0>");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: es0.a$k */
    public static final class C86658k extends C87413o implements C32227p<C90419io3, Integer, C13598b0> {

        /* renamed from: d */
        public static final C86658k f251631d = new C86658k();

        public C86658k() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C87412m.m108594g((C90419io3) obj, "<anonymous parameter 0>");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: es0.a$l */
    public static final class C86659l extends C87413o implements C32227p<C90419io3, Integer, C13598b0> {

        /* renamed from: d */
        public static final C86659l f251632d = new C86659l();

        public C86659l() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C87412m.m108594g((C90419io3) obj, "<anonymous parameter 0>");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: es0.a$m */
    public static final class C86660m extends C87413o implements C32224a<LinkedList<C90419io3>> {

        /* renamed from: d */
        public static final C86660m f251633d = new C86660m();

        public C86660m() {
            super(0);
        }

        public Object invoke() {
            return new LinkedList();
        }
    }

    public C86647a(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f251610d = activity;
    }

    /* renamed from: F4 */
    public final AppBrandRecommendStatObj mo121054F4(WxaAttributes wxaAttributes, C90419io3 io32, int i) {
        C89217f fVar;
        C87412m.m108594g(io32, "itemData");
        AppBrandRecommendStatObj appBrandRecommendStatObj = new AppBrandRecommendStatObj();
        appBrandRecommendStatObj.f158158d = io32.f259585f;
        appBrandRecommendStatObj.f158159e = io32.f259594r;
        appBrandRecommendStatObj.f158160f = io32.f259596t;
        if (wxaAttributes != null) {
            appBrandRecommendStatObj.f158161g = wxaAttributes.field_appId;
        }
        appBrandRecommendStatObj.f158162h = io32.f259586g;
        appBrandRecommendStatObj.f158163i = io32.f259587h;
        appBrandRecommendStatObj.f158164j = io32.f259583d;
        appBrandRecommendStatObj.f158165n = io32.f259599w;
        appBrandRecommendStatObj.f158166o = i + 1;
        float f = C89215e.f257066c;
        appBrandRecommendStatObj.f158167p = f;
        appBrandRecommendStatObj.f158168q = f;
        synchronized (C89217f.f257071o) {
            if (C89217f.f257072p == null) {
                C89217f.f257072p = new C89217f();
            }
            fVar = C89217f.f257072p;
            C87412m.m108591d(fVar);
        }
        appBrandRecommendStatObj.f158169r = fVar.f257077e;
        return appBrandRecommendStatObj;
    }

    /* renamed from: G4 */
    public final LinkedList<C90419io3> mo121055G4() {
        return (LinkedList) ((C36570n) this.f251611e).getValue();
    }

    /* renamed from: O4 */
    public final void mo121056O4(Context context, WxaAttributes wxaAttributes, C90419io3 io32, int i, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(io32, "itemData");
        String str = io32.f259594r;
        if (!TextUtils.isEmpty(io32.f259596t)) {
            str = io32.f259594r + XVFSFile.PATH_SEPARATOR_CHAR + io32.f259596t;
        }
        String str2 = str;
        WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
        if (wxaAttributes != null) {
            bVar.f239557a = wxaAttributes.field_appId;
            bVar.f239561e = wxaAttributes.field_nickname;
        }
        bVar.f239560d = io32.f259585f;
        bVar.f239562f = io32.f259598v;
        bVar.f239566j = 12;
        AppBrandRecommendStatObj F4 = mo121054F4(wxaAttributes, io32, i);
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_recommend_stat_obj", F4);
        AppBrandProfileUI.m104017R7(context, io32.f259585f, 7, str2, true, bVar.mo113977a(), bundle, (ActivityStarterIpcDelegate) null);
        if (z) {
            this.f251613g.invoke(io32, Integer.valueOf(i));
        } else {
            this.f251614h.invoke(io32, Integer.valueOf(i));
        }
    }

    /* renamed from: g5 */
    public final void mo121057g5(Context context, View view, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "view");
        if (view instanceof TextView) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if (z) {
                layoutParams2.topMargin = context.getResources().getDimensionPixelOffset(C0966R.dimen.f4113sn);
            } else {
                layoutParams2.topMargin = context.getResources().getDimensionPixelOffset(C0966R.dimen.f4112sm);
            }
            view.setLayoutParams(layoutParams2);
        }
    }

    public int getItemCount() {
        return mo121055G4().size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return mo121055G4().get(i).f259583d;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        int i2 = i;
        C86650c cVar = (C86650c) zVar;
        C87412m.m108594g(cVar, "holder");
        C90419io3 io32 = mo121055G4().get(i2);
        C87412m.m108593f(io32, "wxaList[position]");
        C90419io3 io33 = io32;
        WxaAttributes LL = C81161g2.Cx0().mo114000LL(io33.f259585f, new String[0]);
        Context context = cVar.f251620B.getContext();
        cVar.f251619A.setText(io33.f259589j);
        String str = "";
        if (cVar instanceof C86656i) {
            if (!TextUtils.isEmpty(io33.f259597u)) {
                TextView textView = ((C86656i) cVar).f251628D;
                textView.setText(io33.f259597u + str);
            } else if (LL != null) {
                TextView textView2 = ((C86656i) cVar).f251628D;
                textView2.setText(LL.field_nickname + str);
            }
            if (!TextUtils.isEmpty(io33.f259598v)) {
                String str2 = C88394b.f255384g;
                C88394b.C88418q.f255427a.mo122786b(((C86656i) cVar).f251627C, io33.f259598v, C88393a.m110230a(), C88431k.f255437d);
            } else if (LL != null) {
                String str3 = C88394b.f255384g;
                C88394b.C88418q.f255427a.mo122786b(((C86656i) cVar).f251627C, LL.field_brandIconURL, C88393a.m110230a(), C88431k.f255437d);
            }
            ((C86656i) cVar).f251629E.setOnClickListener(new C86661b(this, cVar, LL, io33, i));
        }
        if (cVar instanceof C86655h) {
            ((C86655h) cVar).f251626F.setText(io33.f259590n);
        }
        if (cVar instanceof C86649b) {
            ((C86649b) cVar).f251618G.setImageResource(C0966R.raw.app_brand_recommend_music_icon);
        }
        if (cVar instanceof C86654g) {
            ((C86654g) cVar).f251625G.setImageResource(C0966R.raw.app_brand_recommend_video_icon);
        }
        if (cVar instanceof C86652e) {
            C86652e eVar = (C86652e) cVar;
            eVar.f251622F.setText(io33.f259590n);
            C64826xd2 xd22 = io33.f259595s;
            if (xd22 == null || (!xd22.f186292g && !xd22.f186291f)) {
                eVar.f251623G.setVisibility(8);
                eVar.f251624H.setVisibility(8);
                eVar.f251622F.setMaxLines(2);
            } else {
                eVar.f251622F.setMaxLines(1);
                eVar.f251623G.setText(str);
                eVar.f251624H.setText(str);
                eVar.f251623G.setVisibility(0);
                eVar.f251624H.setVisibility(0);
                C64826xd2 xd23 = io33.f259595s;
                if (!xd23.f186292g) {
                    eVar.f251623G.setVisibility(8);
                } else {
                    String format = this.f251615i.format(((double) xd23.f186290e) / ((double) 100));
                    C87412m.m108593f(format, "df.format(discountPrice)");
                    TextView textView3 = eVar.f251623G;
                    textView3.setText("¥ " + format);
                }
                C64826xd2 xd24 = io33.f259595s;
                boolean z = xd24.f186291f;
                if (!z) {
                    eVar.f251624H.setVisibility(8);
                } else if (!z || xd24.f186292g) {
                    eVar.f251624H.getPaint().setAntiAlias(true);
                    eVar.f251624H.getPaint().setFlags(16);
                    String format2 = this.f251615i.format(((double) io33.f259595s.f186289d) / ((double) 100));
                    C87412m.m108593f(format2, "df.format(originPrice)");
                    TextView textView4 = eVar.f251624H;
                    textView4.setText("¥ " + format2);
                } else {
                    eVar.f251624H.setVisibility(8);
                    eVar.f251623G.setVisibility(8);
                    eVar.f251622F.setMaxLines(2);
                }
            }
        }
        if (cVar instanceof C86648a) {
            if (!TextUtils.isEmpty(io33.f259598v)) {
                String str4 = C88394b.f255384g;
                C88394b.C88418q.f255427a.mo122786b(cVar.f251621z, io33.f259598v, C86665f.m107490a(this), C88431k.f255437d);
            } else if (LL != null && !TextUtils.isEmpty(LL.field_bigHeadURL)) {
                String str5 = C88394b.f255384g;
                C88394b.C88418q.f255427a.mo122786b(cVar.f251621z, LL.field_bigHeadURL.toString(), C86665f.m107490a(this), C88431k.f255437d);
            } else if (LL != null && !TextUtils.isEmpty(LL.field_brandIconURL)) {
                String str6 = C88394b.f255384g;
                C88394b.C88418q.f255427a.mo122786b(cVar.f251621z, LL.field_brandIconURL.toString(), C86665f.m107490a(this), C88431k.f255437d);
            } else if (!TextUtils.isEmpty(io33.f259591o)) {
                String str7 = C88394b.f255384g;
                C88394b.C88418q.f255427a.mo122786b(cVar.f251621z, io33.f259591o, C86665f.m107490a(this), C88431k.f255437d);
            }
            String str8 = (!TextUtils.isEmpty(io33.f259590n) || LL == null || TextUtils.isEmpty(LL.field_signature)) ? io33.f259590n : LL.field_signature.toString();
            if (!TextUtils.isEmpty(str8)) {
                C86648a aVar = (C86648a) cVar;
                aVar.f251616C.setText(str8);
                aVar.f251616C.setVisibility(0);
                Context context2 = cVar.f44854d.getContext();
                C87412m.m108593f(context2, "baseViewHolder.itemView.context");
                mo121057g5(context2, aVar.f251617D, true);
            } else {
                C86648a aVar2 = (C86648a) cVar;
                aVar2.f251616C.setVisibility(8);
                Context context3 = cVar.f44854d.getContext();
                C87412m.m108593f(context3, "baseViewHolder.itemView.context");
                mo121057g5(context3, aVar2.f251617D, false);
            }
            if (!TextUtils.isEmpty(io33.f259597u) || LL == null) {
                ((C86648a) cVar).f251617D.setText(io33.f259597u);
            } else {
                TextView textView5 = ((C86648a) cVar).f251617D;
                String str9 = LL.field_nickname;
                if (str9 != null) {
                    str = str9;
                }
                textView5.setText(str);
            }
        } else {
            int dimensionPixelOffset = this.f251610d.getResources().getDimensionPixelOffset(C0966R.dimen.f4120sz);
            int dimensionPixelOffset2 = this.f251610d.getResources().getDimensionPixelOffset(C0966R.dimen.f4119sy);
            C86667j jVar = C86667j.f251650f;
            jVar.f251651d = dimensionPixelOffset;
            jVar.f251652e = dimensionPixelOffset2;
            String str10 = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122786b(cVar.f251621z, io33.f259591o, this.f251610d.getResources().getDrawable(C0966R.C0969drawable.f4461d7), jVar);
        }
        if (cVar instanceof C86651d) {
            ((C86651d) cVar).f251618G.setImageResource(C0966R.raw.app_brand_recommend_video_icon);
            cVar.f44854d.setOnClickListener(new C86662c(this, io33, i2));
        } else {
            cVar.f44854d.setOnClickListener(new C86663d(io33, this, cVar, LL, i, context));
        }
        if (BuildInfo.DEBUG) {
            cVar.f44854d.setOnLongClickListener(new C86664e(this, io33));
        }
        this.f251612f.invoke(io33, Integer.valueOf(i));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        LayoutInflater b = C85868k2.m106137b(viewGroup.getContext());
        switch (i) {
            case 1:
                View inflate = b.inflate(C0966R.C0971layout.f6458fe, viewGroup, false);
                C87412m.m108593f(inflate, "inflater.inflate(R.layou…mage_item, parent, false)");
                return new C86653f(this, inflate);
            case 2:
                View inflate2 = b.inflate(C0966R.C0971layout.f6453f_, viewGroup, false);
                C87412m.m108593f(inflate2, "inflater.inflate(R.layou…udio_item, parent, false)");
                return new C86649b(this, inflate2);
            case 3:
                View inflate3 = b.inflate(C0966R.C0971layout.f6459ff, viewGroup, false);
                C87412m.m108593f(inflate3, "inflater.inflate(R.layou…edio_item, parent, false)");
                return new C86654g(this, inflate3);
            case 4:
                View inflate4 = b.inflate(C0966R.C0971layout.f6452f9, viewGroup, false);
                C87412m.m108593f(inflate4, "inflater.inflate(R.layou…_app_item, parent, false)");
                return new C86648a(this, inflate4);
            case 5:
                View inflate5 = b.inflate(C0966R.C0971layout.f6456fc, viewGroup, false);
                C87412m.m108593f(inflate5, "inflater.inflate(R.layou…oods_item, parent, false)");
                return new C86652e(this, inflate5);
            case 6:
                View inflate6 = b.inflate(C0966R.C0971layout.f6454fa, viewGroup, false);
                C87412m.m108593f(inflate6, "inflater.inflate(R.layou…edio_item, parent, false)");
                return new C86651d(this, inflate6);
            default:
                View inflate7 = b.inflate(C0966R.C0971layout.f6458fe, viewGroup, false);
                C87412m.m108593f(inflate7, "inflater.inflate(R.layou…mage_item, parent, false)");
                return new C86653f(this, inflate7);
        }
    }
}
