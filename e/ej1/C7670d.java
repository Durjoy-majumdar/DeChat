package ej1;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.style.LeadingMarginSpan;
import android.view.View;
import android.view.ViewGroup;
import cj1.C0556j5;
import cj1.C0581o5;
import cl1.C0702z0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveFoldTextView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.FileReaderHelper;
import de3.C75375u;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32227p;
import fy3.C32230s;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedHashMap;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import p206nj.C117627q;
import p629ny.C76979h;
import qk1.C12806i0;
import rx3.C13598b0;
import te3.C64674r41;
import wk1.C15437l;
import wk1.C15439m;
import yg1.C15999b;
import yg1.C16004c;

/* renamed from: ej1.d */
public class C7670d extends C15999b {

    /* renamed from: j */
    public static final C7674d f26030j = new C7674d((C8480h) null);

    /* renamed from: k */
    public static final C32227p<CharSequence, Integer, C75375u> f26031k = C7672b.f26036d;

    /* renamed from: l */
    public static final C32230s<FinderLiveFoldTextView, CharSequence, Integer, Integer, Boolean, C13598b0> f26032l = C7671a.f26035d;

    /* renamed from: m */
    public static final C32230s<FinderLiveFoldTextView, CharSequence, Integer, Integer, Boolean, C13598b0> f26033m = C7673c.f26037d;

    /* renamed from: i */
    public final C45795b f26034i;

    /* renamed from: ej1.d$a */
    public static final class C7671a extends C87413o implements C32230s<FinderLiveFoldTextView, CharSequence, Integer, Integer, Boolean, C13598b0> {

        /* renamed from: d */
        public static final C7671a f26035d = new C7671a();

        public C7671a() {
            super(5);
        }

        /* renamed from: D */
        public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            FinderLiveFoldTextView finderLiveFoldTextView = (FinderLiveFoldTextView) obj;
            CharSequence charSequence = (CharSequence) obj2;
            int intValue = ((Number) obj3).intValue();
            int intValue2 = ((Number) obj4).intValue();
            boolean booleanValue = ((Boolean) obj5).booleanValue();
            C87412m.m108594g(finderLiveFoldTextView, "tv");
            C87412m.m108594g(charSequence, "content");
            finderLiveFoldTextView.mo3269o(charSequence, 5, intValue2, booleanValue, new C7668c(intValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ej1.d$b */
    public static final class C7672b extends C87413o implements C32227p<CharSequence, Integer, C75375u> {

        /* renamed from: d */
        public static final C7672b f26036d = new C7672b();

        public C7672b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            CharSequence charSequence = (CharSequence) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(charSequence, "content");
            C75375u uVar = new C75375u(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), charSequence));
            C7674d dVar = C7670d.f26030j;
            Drawable a = C15437l.C15438a.m14437a(C15437l.f41880f, dVar.mo8803a(), 0.0f, 0.0f, 6, (Object) null);
            String a2 = dVar.mo8803a();
            float f = C15439m.f41885k;
            int i = intValue;
            C15439m mVar = r5;
            C15439m mVar2 = new C15439m(a2, f, f, MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3), C15439m.f41883i, MMApplicationContext.getContext().getResources().getColor(C0966R.color.al_), C15439m.f41884j, 0.0f, 128, (C8480h) null);
            uVar.mo105705b(new C15437l(a, mVar), 0, dVar.mo8803a().length() + 0, 33);
            if (i > 1) {
                uVar.mo105705b(new LeadingMarginSpan.Standard(0, C74942w4.m89784a(MMApplicationContext.getContext(), 11)), 0, uVar.length(), 33);
            }
            return uVar;
        }
    }

    /* renamed from: ej1.d$c */
    public static final class C7673c extends C87413o implements C32230s<FinderLiveFoldTextView, CharSequence, Integer, Integer, Boolean, C13598b0> {

        /* renamed from: d */
        public static final C7673c f26037d = new C7673c();

        public C7673c() {
            super(5);
        }

        /* renamed from: D */
        public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            FinderLiveFoldTextView finderLiveFoldTextView = (FinderLiveFoldTextView) obj;
            CharSequence charSequence = (CharSequence) obj2;
            int intValue = ((Number) obj3).intValue();
            ((Number) obj4).intValue();
            ((Boolean) obj5).booleanValue();
            C87412m.m108594g(finderLiveFoldTextView, "tv");
            C87412m.m108594g(charSequence, "content");
            finderLiveFoldTextView.mo104279b((C75375u) ((C7672b) C7670d.f26031k).invoke(charSequence, Integer.valueOf(intValue)));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ej1.d$d */
    public static final class C7674d {
        public C7674d(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo8803a() {
            String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.dfh);
            C87412m.m108593f(string, "getContext().resources.g…live_anchor_desc_tag_txt)");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7670d(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        this.f26034i = bVar;
    }

    /* renamed from: b */
    public void mo8798b(Context context, C12806i0.C12807a aVar, C0581o5 o5Var, int i) {
        Context context2 = context;
        C12806i0.C12807a aVar2 = aVar;
        int i2 = i;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(aVar2, "holder");
        C87412m.m108594g(o5Var, "msg");
        Class cls = C0702z0.class;
        View view = aVar2.f44854d;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar3.mo10233c(Float.valueOf(1.0f));
        C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemAnnoucement", "onBindWelcomeMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemAnnoucement", "onBindWelcomeMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        MMNeat7extView mMNeat7extView = aVar2.f36658A;
        C87412m.m108592e(mMNeat7extView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView");
        FinderLiveFoldTextView finderLiveFoldTextView = (FinderLiveFoldTextView) mMNeat7extView;
        String str = context2.getString(C0966R.string.dfh) + ' ' + o5Var.getContent();
        C7674d dVar = f26030j;
        int i3 = ((C16004c) this.f26034i.mo71262a(C16004c.class)).f43064j;
        int i4 = this.f43055h;
        Boolean bool = (Boolean) ((LinkedHashMap) ((C0702z0) this.f26034i.mo71262a(cls)).f1683t).get(Integer.valueOf(i));
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        C87412m.m108594g(str, "content");
        C32230s<FinderLiveFoldTextView, CharSequence, Integer, Integer, Boolean, C13598b0> sVar = i3 > 0 ? f26032l : f26033m;
        C8479f0 f0Var = new C8479f0();
        T parent = finderLiveFoldTextView.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        f0Var.f27484d = (ViewGroup) parent;
        finderLiveFoldTextView.setTextSize((float) i4);
        finderLiveFoldTextView.setVisibility(0);
        FinderLiveFoldTextView finderLiveFoldTextView2 = finderLiveFoldTextView;
        sVar.mo237D(finderLiveFoldTextView2, str, 1, Integer.valueOf(i3), Boolean.valueOf(booleanValue));
        finderLiveFoldTextView.post(new C7666b(finderLiveFoldTextView2, f0Var, sVar, str, i3, booleanValue));
        aVar2.f36659B.setBackground(context.getResources().getDrawable(C0966R.C0969drawable.f5166yy));
        aVar2.f36658A.setTag(C0966R.C0970id.d47, dVar.mo8803a());
        finderLiveFoldTextView.setUnFoldListener(new C7676e(this, i2, str));
        finderLiveFoldTextView.setFoldListener(new C7679f(this, i2));
        if (finderLiveFoldTextView.f15236V && !((C0702z0) this.f26034i.mo71262a(cls)).f1682s.contains(Integer.valueOf(i))) {
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 2);
            jSONObject.put(FileReaderHelper.DOC_EXT, C117627q.m165909b(Util.nullAsNil(str), "utf-8"));
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
            wVar.getClass();
            C54116w.Ex0(wVar, C54067f0.C54076o0.LIVE_DESC, jSONObject2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
            ((C0702z0) this.f26034i.mo71262a(cls)).f1682s.add(Integer.valueOf(i));
        }
    }

    /* renamed from: d */
    public C0581o5 mo8796d(C64674r41 r412) {
        C87412m.m108594g(r412, "msg");
        return new C0556j5(r412);
    }

    /* renamed from: j */
    public int mo8797j() {
        return 100000;
    }
}
