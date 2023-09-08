package gs1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import ao1.C0137a0;
import ao1.C0139b0;
import ao1.C0142c0;
import ao1.C0192y;
import ao1.C0195z;
import bd1.C54446b;
import bl3.C39818r;
import bt1.C0378f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderEmojiSelectUI;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import com.tencent.p014mm.plugin.finder.view.FinderExtendReadingEditView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import de3.C75355a0;
import dp1.C7435f2;
import er1.C58784w3;
import f40.C86709a0;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kq1.C10389f;
import kq1.C10392h;
import kq1.C10393i;
import kq1.C10394j;
import l60.C99342a;
import l60.C99344b;
import lc3.C10485b;
import org.json.JSONObject;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import qo3.C12925w;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C36570n;
import te3.C49712hj1;
import te3.C64364fg1;
import te3.t54;
import up1.C27696y;
import up1.C37521f;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: gs1.d */
public final class C8437d implements C7020t0 {

    /* renamed from: d */
    public final MMActivity f27433d;

    /* renamed from: e */
    public final C58969q f27434e;

    /* renamed from: f */
    public final C32226l<Boolean, C13598b0> f27435f;

    /* renamed from: g */
    public final C32227p<String, Boolean, C13598b0> f27436g;

    /* renamed from: h */
    public final C32229r<String, String, Integer, FinderJumpInfo, C13598b0> f27437h;

    /* renamed from: i */
    public FinderExtendReadingEditView f27438i;

    /* renamed from: j */
    public KeyboardHeightProvider f27439j;

    /* renamed from: n */
    public boolean f27440n = true;

    /* renamed from: o */
    public boolean f27441o;

    /* renamed from: p */
    public boolean f27442p;

    /* renamed from: gs1.d$a */
    public static final class C8438a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8437d f27443d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8438a(C8437d dVar) {
            super(1);
            this.f27443d = dVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "link");
            this.f27443d.mo9366a();
            this.f27443d.f27436g.invoke(str, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gs1.d$b */
    public static final class C8439b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8437d f27444d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8439b(C8437d dVar) {
            super(0);
            this.f27444d = dVar;
        }

        public Object invoke() {
            this.f27444d.mo9366a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gs1.d$c */
    public static final class C8440c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8437d f27445d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8440c(C8437d dVar) {
            super(0);
            this.f27445d = dVar;
        }

        public Object invoke() {
            String string = this.f27445d.f27433d.getResources().getString(C0966R.string.d1y);
            C87412m.m108593f(string, "activity.resources.getSt…R.string.finder_biz_link)");
            String string2 = this.f27445d.f27433d.getResources().getString(C0966R.string.d1w);
            C87412m.m108593f(string2, "activity.resources.getSt…ng.finder_biz_essay_only)");
            String string3 = this.f27445d.f27433d.getResources().getString(C0966R.string.d1v);
            C87412m.m108593f(string3, "activity.resources.getSt…ng.finder_biz_essay_hint)");
            this.f27445d.mo9368c(string, string2, string3);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gs1.d$d */
    public static final class C8441d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8437d f27446d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8441d(C8437d dVar) {
            super(0);
            this.f27446d = dVar;
        }

        public Object invoke() {
            C8437d dVar = this.f27446d;
            dVar.getClass();
            C39818r rVar = C39818r.f106831a;
            C39622i0 a = rVar.mo62444c(dVar.f27433d).mo75002a(C10389f.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…PackCoverUIC::class.java)");
            C10389f fVar = (C10389f) a;
            if (((Boolean) ((C36570n) fVar.f31600d).getValue()).booleanValue() && fVar.f31601e != null) {
                C8446e eVar = new C8446e(dVar);
                C8447f fVar2 = new C8447f(dVar);
                Class cls = C11990s0.class;
                Class<C60200t1> cls2 = C60200t1.class;
                t54 t54 = fVar.f31601e;
                if (t54 != null) {
                    C12925w wVar = new C12925w(fVar.getActivity());
                    View inflate = LayoutInflater.from(fVar.getActivity()).inflate(C0966R.C0971layout.f7194sy, (ViewGroup) null);
                    ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.ber);
                    TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
                    ImageView imageView2 = (ImageView) inflate.findViewById(C0966R.C0970id.bv8);
                    TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.btz);
                    Button button = (Button) inflate.findViewById(C0966R.C0970id.f5585j3);
                    TextView textView3 = (TextView) inflate.findViewById(C0966R.C0970id.knp);
                    if (imageView != null) {
                        imageView.setOnClickListener(new C10392h(eVar, wVar));
                    }
                    C85875k4.m106191k0(textView.getPaint());
                    C99344b<C100810g0, Bitmap> b = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(t54.f141974d, C27696y.RAW_IMAGE), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.COMMON));
                    C87412m.m108593f(imageView2, "coverIv");
                    ((C99342a) b).mo85954d(imageView2);
                    String string = fVar.getActivity().getResources().getString(C0966R.string.nc8, new Object[]{Integer.valueOf(t54.f141976f)});
                    C87412m.m108593f(string, "activity.resources.getSt…over_count, cover.remain)");
                    if (textView2 != null) {
                        textView2.setText(string);
                    }
                    if (button != null) {
                        button.setOnClickListener(new C10393i(fVar, t54, wVar));
                    }
                    String string2 = fVar.getActivity().getResources().getString(C0966R.string.nc9);
                    C87412m.m108593f(string2, "activity.resources.getSt…_add_red_pack_cover_tips)");
                    SpannableString spannableString = new SpannableString(string2);
                    spannableString.setSpan(new C4059g5(string2, fVar.getActivity().getResources().getColor(C0966R.color.f2958ae), fVar.getActivity().getResources().getColor(C0966R.color.ahf), false, false, new C10394j(wVar, fVar2)), string2.length() - 6, string2.length(), 17);
                    if (textView3 != null) {
                        textView3.setOnTouchListener(new C75355a0(fVar.getActivity()));
                    }
                    if (textView3 != null) {
                        textView3.setText(spannableString);
                    }
                    wVar.mo12471k(inflate);
                    wVar.mo5086o();
                }
            } else {
                dVar.mo9367b();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gs1.d$e */
    public static final class C8442e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8437d f27447d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8442e(C8437d dVar) {
            super(0);
            this.f27447d = dVar;
        }

        public Object invoke() {
            C8437d dVar = this.f27447d;
            MMActivity mMActivity = dVar.f27433d;
            C58969q qVar = dVar.f27434e;
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            Intent intent = new Intent(mMActivity, FinderEmojiSelectUI.class);
            String str = qVar != null ? qVar.field_username : null;
            if (str == null) {
                str = C66785b.f191882e.mo90662O5();
            }
            intent.putExtra("finder_username", str);
            mMActivity.startActivityForResult(intent, 20004);
            C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(mMActivity).mo75002a(C13442s8.class)).mo12861q3();
            q3.f134675i = 74;
            C7435f2.f25626a.mo8577a(q3, "button_post_choose_emoji", 1, (JSONObject) null);
            this.f27447d.mo9366a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gs1.d$f */
    public static final class C8443f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8437d f27448d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8443f(C8437d dVar) {
            super(0);
            this.f27448d = dVar;
        }

        public Object invoke() {
            this.f27448d.mo9366a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gs1.d$g */
    public static final class C8444g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8437d f27449d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8444g(C8437d dVar) {
            super(0);
            this.f27449d = dVar;
        }

        public Object invoke() {
            MMActivity mMActivity = this.f27449d.f27433d;
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderTencentVideoChooseLink");
            if (Util.isNullOrNil(c)) {
                c = "https://m.v.qq.com/video/selection/index.html";
            }
            C64364fg1 fg12 = ((PostMainUIC) C39818r.f106831a.mo62444c(mMActivity).mo75002a(PostMainUIC.class)).mo78410F3().f152947E;
            char c2 = '?';
            boolean z = false;
            char c3 = '&';
            if (fg12 != null && fg12.f183130d == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                sb.append('?' + ("businessType=" + fg12 + "?.businessType"));
                c = sb.toString();
                c2 = '&';
            }
            String str = fg12 != null ? fg12.f183131e : null;
            if (!(str == null || str.length() == 0)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(c);
                sb4.append(c2 + ("cid=" + fg12 + "?.cid"));
                c = sb4.toString();
                c2 = '&';
            }
            String str2 = fg12 != null ? fg12.f183132f : null;
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(c);
                sb5.append(c2 + ("lid=" + fg12 + "?.lid"));
                c = sb5.toString();
            } else {
                c3 = c2;
            }
            String str3 = c + c3 + "callBackKey=" + MD5Util.getMD5String(c);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str3);
            C88144b.m109791i(mMActivity, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            this.f27449d.mo9366a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: gs1.d$h */
    public static final class C8445h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C8437d f27450d;

        public C8445h(C8437d dVar) {
            this.f27450d = dVar;
        }

        public final void run() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            View decorView = this.f27450d.f27433d.getWindow().getDecorView();
            C87412m.m108592e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) decorView).addView(this.f27450d.f27438i, layoutParams);
            this.f27450d.f27438i.setVisibility(8);
        }
    }

    public C8437d(MMActivity mMActivity, C58969q qVar, C32226l<? super Boolean, C13598b0> lVar, C32227p<? super String, ? super Boolean, C13598b0> pVar, C32229r<? super String, ? super String, ? super Integer, ? super FinderJumpInfo, C13598b0> rVar) {
        Integer num;
        Integer num2;
        boolean z;
        MMActivity mMActivity2 = mMActivity;
        C32226l<? super Boolean, C13598b0> lVar2 = lVar;
        C32227p<? super String, ? super Boolean, C13598b0> pVar2 = pVar;
        C32229r<? super String, ? super String, ? super Integer, ? super FinderJumpInfo, C13598b0> rVar2 = rVar;
        C87412m.m108594g(mMActivity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(lVar2, "changeEditViewCallback");
        C87412m.m108594g(pVar2, "doVerify");
        C87412m.m108594g(rVar2, "onAddCover");
        this.f27433d = mMActivity2;
        this.f27434e = qVar;
        this.f27435f = lVar2;
        this.f27436g = pVar2;
        this.f27437h = rVar2;
        KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(mMActivity2);
        this.f27439j = keyboardHeightProvider;
        keyboardHeightProvider.f220015b = this;
        FinderExtendReadingEditView finderExtendReadingEditView = new FinderExtendReadingEditView(mMActivity2);
        this.f27438i = finderExtendReadingEditView;
        C8438a aVar = new C8438a(this);
        C8439b bVar = new C8439b(this);
        finderExtendReadingEditView.f17686d = aVar;
        finderExtendReadingEditView.f17687e = bVar;
        C0192y yVar = (C0192y) C39818r.f106831a.mo62444c(mMActivity2).mo75002a(C0192y.class);
        FinderExtendReadingEditView finderExtendReadingEditView2 = this.f27438i;
        yVar.getClass();
        C87412m.m108594g(finderExtendReadingEditView2, "view");
        yVar.f659d = finderExtendReadingEditView2;
        View findViewById = finderExtendReadingEditView2.findViewById(C0966R.C0970id.iv7);
        View findViewById2 = finderExtendReadingEditView2.findViewById(C0966R.C0970id.o6r);
        C37521f.f99374d.getClass();
        if (C37521f.f99517t1.mo60266n().intValue() == 1) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "initViews", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "initViews", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c((Object) null);
            View view2 = findViewById2;
            z = false;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "initViews", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "initViews", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new C0195z(yVar));
            num = null;
            num2 = 8;
        } else {
            z = false;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(8);
            num = null;
            View view3 = findViewById;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "initViews", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "initViews", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view4 = findViewById2;
            num2 = 8;
            C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "initViews", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "initViews", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        finderExtendReadingEditView2.findViewById(C0966R.C0970id.iv_).setOnClickListener(new C0137a0(yVar));
        View findViewById3 = finderExtendReadingEditView2.findViewById(C0966R.C0970id.iva);
        C58784w3.f168295a.getClass();
        C66785b bVar2 = C66785b.f191882e;
        C54446b a = C66783a.C66784a.m78798a(bVar2, bVar2.mo90662O5(), z, 2, (Object) null);
        if (!((67108864 & (a != null ? a.field_extFlag : 0)) != 0)) {
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(num2);
            View view5 = findViewById3;
            C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "initViews", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar6.mo10231a(z)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "initViews", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        findViewById3.setOnClickListener(new C0139b0(yVar));
        if (C0378f.m323a(C0378f.f979a, (C58969q) null, 1, (Object) null)) {
            View findViewById4 = finderExtendReadingEditView2.findViewById(C0966R.C0970id.iv8);
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(num);
            View view6 = findViewById4;
            C117292a.m165358d(view6, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "initViews", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar7.mo10231a(z ? 1 : 0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "initViews", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setOnClickListener(new C0142c0(yVar));
        }
        yVar.mo171c3();
        C8440c cVar = new C8440c(this);
        C8441d dVar = new C8441d(this);
        C8442e eVar = new C8442e(this);
        C8443f fVar = new C8443f(this);
        C8444g gVar = new C8444g(this);
        yVar.f663h = cVar;
        yVar.f664i = dVar;
        yVar.f665j = eVar;
        yVar.f666n = fVar;
        yVar.f667o = gVar;
        mMActivity.getWindow().getDecorView().post(new C8445h(this));
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f27438i.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        if (((FrameLayout.LayoutParams) layoutParams).bottomMargin != i) {
            C8449h hVar = new C8449h(this, i);
            if (i != 0) {
                hVar.setDuration(200);
            } else {
                hVar.setDuration(300);
            }
            this.f27438i.startAnimation(hVar);
        }
        this.f27438i.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo9366a() {
        this.f27435f.invoke(Boolean.FALSE);
        this.f27441o = false;
        this.f27439j.mo104021d();
        this.f27433d.hideVKB();
        if (this.f27442p) {
            FinderExtendReadingEditView finderExtendReadingEditView = this.f27438i;
            finderExtendReadingEditView.f17695p.setVisibility(0);
            finderExtendReadingEditView.f17694o.setVisibility(8);
            finderExtendReadingEditView.f17691i.setVisibility(8);
            finderExtendReadingEditView.f17692j.setVisibility(8);
            finderExtendReadingEditView.f17689g.setVisibility(8);
            finderExtendReadingEditView.f17690h.setText(finderExtendReadingEditView.getContext().getResources().getString(C0966R.string.d7y));
        }
        this.f27438i.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = this.f27438i.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = 0;
        this.f27438i.setLayoutParams(layoutParams2);
    }

    /* renamed from: b */
    public final void mo9367b() {
        String string = this.f27433d.getResources().getString(C0966R.string.emf);
        C87412m.m108593f(string, "activity.resources.getSt…ing.finder_redpack_cover)");
        String string2 = this.f27433d.getResources().getString(C0966R.string.emg);
        C87412m.m108593f(string2, "activity.resources.getSt…inder_redpack_cover_hint)");
        mo9368c(string, "", string2);
    }

    /* renamed from: c */
    public final void mo9368c(String str, String str2, String str3) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "titleTips");
        C87412m.m108594g(str3, "hint");
        this.f27442p = true;
        FinderExtendReadingEditView finderExtendReadingEditView = this.f27438i;
        finderExtendReadingEditView.getClass();
        finderExtendReadingEditView.f17695p.setVisibility(8);
        finderExtendReadingEditView.f17694o.setVisibility(0);
        finderExtendReadingEditView.f17691i.setVisibility(0);
        finderExtendReadingEditView.f17689g.setVisibility(0);
        finderExtendReadingEditView.f17690h.setText(str);
        finderExtendReadingEditView.f17694o.setText(str2);
        finderExtendReadingEditView.f17691i.setHint(str3);
        if (this.f27440n) {
            this.f27438i.post(new C8448g(this));
        }
        this.f27439j.mo104022e();
        this.f27438i.f17691i.requestFocus();
        this.f27433d.showVKB();
    }
}
