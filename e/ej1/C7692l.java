package ej1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;
import cj1.C0528d1;
import cj1.C0581o5;
import cl1.C54994o1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.WCWebUpdater;
import de3.C75375u;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import org.json.JSONObject;
import p629ny.C76979h;
import qj1.C12322e5;
import qk1.C12806i0;
import r60.C101350i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import t60.C64207e;
import te3.C48770aw0;
import te3.C51443tt0;
import te3.C52013xs0;
import wk1.C15437l;
import wk1.C15439m;
import x60.C102564a;
import yg1.C15999b;

/* renamed from: ej1.l */
public final class C7692l extends C15999b {

    /* renamed from: m */
    public static boolean f26054m;

    /* renamed from: n */
    public static boolean f26055n;

    /* renamed from: i */
    public final C45795b f26056i;

    /* renamed from: j */
    public final String f26057j = "CommentItemComboLiveReward";

    /* renamed from: k */
    public final C13601g f26058k = C36568h.m40985a(C7693a.f26060d);

    /* renamed from: l */
    public final char f26059l = 8230;

    /* renamed from: ej1.l$a */
    public static final class C7693a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7693a f26060d = new C7693a();

        public C7693a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3743cv));
        }
    }

    /* renamed from: ej1.l$b */
    public static final class C7694b extends ClickableSpan {

        /* renamed from: d */
        public final /* synthetic */ C7692l f26061d;

        /* renamed from: e */
        public final /* synthetic */ String f26062e;

        /* renamed from: f */
        public final /* synthetic */ String f26063f;

        /* renamed from: g */
        public final /* synthetic */ int f26064g;

        /* renamed from: h */
        public final /* synthetic */ C8479f0<String> f26065h;

        /* renamed from: i */
        public final /* synthetic */ Context f26066i;

        public C7694b(C7692l lVar, String str, String str2, int i, C8479f0<String> f0Var, Context context) {
            this.f26061d = lVar;
            this.f26062e = str;
            this.f26063f = str2;
            this.f26064g = i;
            this.f26065h = f0Var;
            this.f26066i = context;
        }

        public void onClick(View view) {
            View view2 = view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward$onBindComboLiveRewardMsg$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view2, "widget");
            C7692l lVar = this.f26061d;
            String str = this.f26062e;
            String str2 = this.f26063f;
            int i = this.f26064g;
            lVar.getClass();
            FinderLiveService.f159376d.getClass();
            if (FinderLiveService.f159380h) {
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5 j5Var = (C8777j5) c;
                C0073g0 g0Var = C0073g0.LIVING_SING_SONG;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN);
                if (str == null) {
                    str = "";
                }
                jSONObject.put("music_name", str);
                C13598b0 b0Var = C13598b0.f38549a;
                C8777j5.C8778a.m8605f(j5Var, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
            } else {
                C7335d c2 = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar = (C54116w) c2;
                C54067f0.C54076o0 o0Var = C54067f0.C54076o0.LIVING_SING_SONG;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
                if (str == null) {
                    str = "";
                }
                jSONObject2.put("music_name", str);
                jSONObject2.put("gift_id", str2);
                jSONObject2.put("gift_count", String.valueOf(i));
                C13598b0 b0Var2 = C13598b0.f38549a;
                C54116w.Ex0(wVar, o0Var, jSONObject2.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
            }
            ((C54994o1) this.f26061d.f26056i.mo71262a(C54994o1.class)).f154401h.postValue(this.f26065h.f27484d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward$onBindComboLiveRewardMsg$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            C87412m.m108594g(textPaint, "ds");
            textPaint.setColor(this.f26066i.getResources().getColor(C0966R.color.f3417s5));
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* renamed from: ej1.l$c */
    public static final class C7695c<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C12806i0.C12807a f26067a;

        /* renamed from: b */
        public final /* synthetic */ C51443tt0 f26068b;

        /* renamed from: c */
        public final /* synthetic */ C7692l f26069c;

        /* renamed from: d */
        public final /* synthetic */ Context f26070d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C75375u> f26071e;

        /* renamed from: f */
        public final /* synthetic */ C8478d0 f26072f;

        public C7695c(C12806i0.C12807a aVar, C51443tt0 tt02, C7692l lVar, Context context, C8479f0<C75375u> f0Var, C8478d0 d0Var) {
            this.f26067a = aVar;
            this.f26068b = tt02;
            this.f26069c = lVar;
            this.f26070d = context;
            this.f26071e = f0Var;
            this.f26072f = d0Var;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (!C87412m.m108589b(this.f26067a.f44854d.getTag(), this.f26068b.f142392h)) {
                String str = this.f26069c.f26057j;
                Log.m105924i(str, "onBindComboLiveRewardMsg tag:" + this.f26067a.f44854d.getTag() + ",payload id:" + this.f26068b.f142392h);
            } else if (bitmap != null) {
                C61926c.m72668M(new C7702m(this.f26070d, bitmap, this.f26069c, this.f26071e, this.f26072f, this.f26067a));
            } else {
                Log.m105924i(this.f26069c.f26057j, "onBindComboLiveRewardMsg resource is null!");
            }
        }
    }

    /* renamed from: ej1.l$d */
    public static final class C7696d extends C87413o implements C32224a<C75375u> {

        /* renamed from: d */
        public final /* synthetic */ Context f26073d;

        /* renamed from: e */
        public final /* synthetic */ String f26074e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<String> f26075f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<String> f26076g;

        /* renamed from: h */
        public final /* synthetic */ C8479f0<String> f26077h;

        /* renamed from: i */
        public final /* synthetic */ List<ImageSpan> f26078i;

        /* renamed from: j */
        public final /* synthetic */ List<C48770aw0> f26079j;

        /* renamed from: n */
        public final /* synthetic */ C7692l f26080n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7696d(Context context, String str, C8479f0<String> f0Var, C8479f0<String> f0Var2, C8479f0<String> f0Var3, List<? extends ImageSpan> list, List<? extends C48770aw0> list2, C7692l lVar) {
            super(0);
            this.f26073d = context;
            this.f26074e = str;
            this.f26075f = f0Var;
            this.f26076g = f0Var2;
            this.f26077h = f0Var3;
            this.f26078i = list;
            this.f26079j = list2;
            this.f26080n = lVar;
        }

        public Object invoke() {
            Context context = this.f26073d;
            C75375u uVar = new C75375u(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, this.f26074e + ((String) this.f26075f.f27484d) + ' ' + ((String) this.f26076g.f27484d) + ' ' + ((String) this.f26077h.f27484d)));
            C7692l.m7833y(this.f26080n, uVar, this.f26078i, this.f26079j);
            return uVar;
        }
    }

    /* renamed from: ej1.l$e */
    public static final class C7697e extends C87413o implements C32224a<C75375u> {

        /* renamed from: d */
        public final /* synthetic */ Context f26081d;

        /* renamed from: e */
        public final /* synthetic */ String f26082e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<String> f26083f;

        /* renamed from: g */
        public final /* synthetic */ String f26084g;

        /* renamed from: h */
        public final /* synthetic */ C8479f0<String> f26085h;

        /* renamed from: i */
        public final /* synthetic */ C8479f0<String> f26086i;

        /* renamed from: j */
        public final /* synthetic */ List<ImageSpan> f26087j;

        /* renamed from: n */
        public final /* synthetic */ List<C48770aw0> f26088n;

        /* renamed from: o */
        public final /* synthetic */ C7692l f26089o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7697e(Context context, String str, C8479f0<String> f0Var, String str2, C8479f0<String> f0Var2, C8479f0<String> f0Var3, List<? extends ImageSpan> list, List<? extends C48770aw0> list2, C7692l lVar) {
            super(0);
            this.f26081d = context;
            this.f26082e = str;
            this.f26083f = f0Var;
            this.f26084g = str2;
            this.f26085h = f0Var2;
            this.f26086i = f0Var3;
            this.f26087j = list;
            this.f26088n = list2;
            this.f26089o = lVar;
        }

        public Object invoke() {
            Context context = this.f26081d;
            C75375u uVar = new C75375u(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, this.f26082e + ((String) this.f26083f.f27484d) + ' ' + this.f26084g + ((String) this.f26085h.f27484d) + ' ' + ((String) this.f26086i.f27484d)));
            C7692l.m7833y(this.f26089o, uVar, this.f26087j, this.f26088n);
            return uVar;
        }
    }

    /* renamed from: ej1.l$f */
    public static final class C7698f extends C87413o implements C32224a<C75375u> {

        /* renamed from: d */
        public final /* synthetic */ Context f26090d;

        /* renamed from: e */
        public final /* synthetic */ String f26091e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<CharSequence> f26092f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<String> f26093g;

        /* renamed from: h */
        public final /* synthetic */ C8479f0<String> f26094h;

        /* renamed from: i */
        public final /* synthetic */ List<ImageSpan> f26095i;

        /* renamed from: j */
        public final /* synthetic */ List<C48770aw0> f26096j;

        /* renamed from: n */
        public final /* synthetic */ C7692l f26097n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7698f(Context context, String str, C8479f0<CharSequence> f0Var, C8479f0<String> f0Var2, C8479f0<String> f0Var3, List<? extends ImageSpan> list, List<? extends C48770aw0> list2, C7692l lVar) {
            super(0);
            this.f26090d = context;
            this.f26091e = str;
            this.f26092f = f0Var;
            this.f26093g = f0Var2;
            this.f26094h = f0Var3;
            this.f26095i = list;
            this.f26096j = list2;
            this.f26097n = lVar;
        }

        public Object invoke() {
            Context context = this.f26090d;
            C75375u uVar = new C75375u(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, this.f26091e + this.f26092f.f27484d + ' ' + ((String) this.f26093g.f27484d) + ' ' + ((String) this.f26094h.f27484d)));
            C7692l.m7833y(this.f26097n, uVar, this.f26095i, this.f26096j);
            return uVar;
        }
    }

    /* renamed from: ej1.l$g */
    public static final class C7699g extends C87413o implements C32224a<C75375u> {

        /* renamed from: d */
        public final /* synthetic */ Context f26098d;

        /* renamed from: e */
        public final /* synthetic */ String f26099e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<CharSequence> f26100f;

        /* renamed from: g */
        public final /* synthetic */ String f26101g;

        /* renamed from: h */
        public final /* synthetic */ C8479f0<String> f26102h;

        /* renamed from: i */
        public final /* synthetic */ C8479f0<String> f26103i;

        /* renamed from: j */
        public final /* synthetic */ List<ImageSpan> f26104j;

        /* renamed from: n */
        public final /* synthetic */ List<C48770aw0> f26105n;

        /* renamed from: o */
        public final /* synthetic */ C7692l f26106o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7699g(Context context, String str, C8479f0<CharSequence> f0Var, String str2, C8479f0<String> f0Var2, C8479f0<String> f0Var3, List<? extends ImageSpan> list, List<? extends C48770aw0> list2, C7692l lVar) {
            super(0);
            this.f26098d = context;
            this.f26099e = str;
            this.f26100f = f0Var;
            this.f26101g = str2;
            this.f26102h = f0Var2;
            this.f26103i = f0Var3;
            this.f26104j = list;
            this.f26105n = list2;
            this.f26106o = lVar;
        }

        public Object invoke() {
            Context context = this.f26098d;
            C75375u uVar = new C75375u(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, this.f26099e + this.f26100f.f27484d + ' ' + this.f26101g + ((String) this.f26102h.f27484d) + ' ' + ((String) this.f26103i.f27484d)));
            C7692l.m7833y(this.f26106o, uVar, this.f26104j, this.f26105n);
            return uVar;
        }
    }

    /* renamed from: ej1.l$h */
    public static final class C7700h extends C87413o implements C32224a<C75375u> {

        /* renamed from: d */
        public final /* synthetic */ Context f26107d;

        /* renamed from: e */
        public final /* synthetic */ String f26108e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<CharSequence> f26109f;

        /* renamed from: g */
        public final /* synthetic */ String f26110g;

        /* renamed from: h */
        public final /* synthetic */ C8479f0<String> f26111h;

        /* renamed from: i */
        public final /* synthetic */ C8479f0<String> f26112i;

        /* renamed from: j */
        public final /* synthetic */ List<ImageSpan> f26113j;

        /* renamed from: n */
        public final /* synthetic */ List<C48770aw0> f26114n;

        /* renamed from: o */
        public final /* synthetic */ C7692l f26115o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7700h(Context context, String str, C8479f0<CharSequence> f0Var, String str2, C8479f0<String> f0Var2, C8479f0<String> f0Var3, List<? extends ImageSpan> list, List<? extends C48770aw0> list2, C7692l lVar) {
            super(0);
            this.f26107d = context;
            this.f26108e = str;
            this.f26109f = f0Var;
            this.f26110g = str2;
            this.f26111h = f0Var2;
            this.f26112i = f0Var3;
            this.f26113j = list;
            this.f26114n = list2;
            this.f26115o = lVar;
        }

        public Object invoke() {
            Context context = this.f26107d;
            C75375u uVar = new C75375u(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, this.f26108e + this.f26109f.f27484d + ' ' + this.f26110g + ((String) this.f26111h.f27484d) + ' ' + ((String) this.f26112i.f27484d)));
            C7692l.m7833y(this.f26115o, uVar, this.f26113j, this.f26114n);
            return uVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7692l(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        this.f26056i = bVar;
    }

    /* renamed from: t */
    public static final C75375u m7828t(C13601g<? extends C75375u> gVar) {
        return (C75375u) gVar.getValue();
    }

    /* renamed from: u */
    public static final C75375u m7829u(C13601g<? extends C75375u> gVar) {
        return (C75375u) gVar.getValue();
    }

    /* renamed from: v */
    public static final C75375u m7830v(C13601g<? extends C75375u> gVar) {
        return (C75375u) gVar.getValue();
    }

    /* renamed from: w */
    public static final C75375u m7831w(C13601g<? extends C75375u> gVar) {
        return (C75375u) gVar.getValue();
    }

    /* renamed from: x */
    public static final C75375u m7832x(C13601g<? extends C75375u> gVar) {
        return (C75375u) gVar.getValue();
    }

    /* renamed from: y */
    public static final void m7833y(C7692l lVar, C75375u uVar, List<? extends ImageSpan> list, List<? extends C48770aw0> list2) {
        C75375u uVar2 = uVar;
        lVar.getClass();
        Drawable a = C15437l.C15438a.m14437a(C15437l.f41880f, lVar.mo8816o(), 0.0f, 0.0f, 6, (Object) null);
        String o = lVar.mo8816o();
        float f = C15439m.f41885k;
        C15437l lVar2 = new C15437l(a, new C15439m(o, f, f, MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3), C15439m.f41883i, MMApplicationContext.getContext().getResources().getColor(C0966R.color.al_), C15439m.f41884j, 0.0f, 128, (C8480h) null));
        String o2 = lVar.mo8816o();
        uVar.getClass();
        uVar2.mo105705b(lVar2, 0, o2.length() + 0, 33);
        int length = lVar.mo8816o().length();
        if (list != null) {
            for (ImageSpan b : list) {
                int i = length + 1;
                uVar2.mo105705b(b, length, i, 33);
                length = i;
            }
        }
    }

    /* renamed from: b */
    public void mo8798b(Context context, C12806i0.C12807a aVar, C0581o5 o5Var, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(o5Var, "msg");
        super.mo8798b(context, aVar, o5Var, i);
        Object q = o5Var.mo563q();
        if (!(q instanceof C51443tt0)) {
            Log.m105920e(this.f26057j, "onBindComboLiveRewardMsg payloadContent isn't FinderLiveAppMsgComboLiveRewardInfo");
            View view = aVar.f44854d;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C51443tt0 tt02 = (C51443tt0) q;
        aVar.f44854d.setTag(tt02.f142392h);
        mo8820s(context, aVar, o5Var, tt02);
    }

    /* renamed from: c */
    public C0581o5 mo8804c(C52013xs0 xs02) {
        C87412m.m108594g(xs02, "msg");
        return new C0528d1(xs02);
    }

    /* renamed from: j */
    public int mo8797j() {
        return 20013;
    }

    /* renamed from: k */
    public void mo8813k() {
        f26054m = false;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence mo8814m(java.lang.CharSequence r8, int r9, int r10, com.tencent.neattextview.textview.view.NeatTextView r11) {
        /*
            r7 = this;
            int r0 = r7.mo8817p()
            int r1 = r11.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r11.getPaddingRight()
            int r0 = r0 - r1
            android.view.ViewParent r1 = r11.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            r3 = 0
            if (r2 == 0) goto L_0x001a
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x001b
        L_0x001a:
            r1 = r3
        L_0x001b:
            r2 = 0
            if (r1 == 0) goto L_0x0023
            int r1 = r1.getPaddingLeft()
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            int r0 = r0 - r1
            android.view.ViewParent r1 = r11.getParent()
            boolean r4 = r1 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x0030
            r3 = r1
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x0030:
            if (r3 == 0) goto L_0x0037
            int r1 = r3.getPaddingRight()
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x009a
            int r1 = r11.getMaxLines()
            r3 = 2147483647(0x7fffffff, float:NaN)
            r11.setMaxLines(r3)
            r11.mo104279b(r8)
            yr3.a r3 = r11.mo154990i(r0, r3)
            r4 = r3
            com.tencent.neattextview.textview.layout.NeatLayout r4 = (com.tencent.neattextview.textview.layout.NeatLayout) r4
            int r4 = r4.f319992L
            r11.setMaxLines(r1)
            r1 = 1
            if (r4 > r1) goto L_0x0058
            return r8
        L_0x0058:
            float r0 = (float) r0
            yr3.c r3 = (yr3.C112481c) r3
            float r5 = r3.mo109134r0(r1)
            float r0 = r0 - r5
            r5 = 300(0x12c, float:4.2E-43)
            float r5 = (float) r5
            float r0 = r0 - r5
            int r6 = r7.mo8815n()
            float r6 = (float) r6
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x006f
            r0 = 1
            goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            r6 = 0
            if (r0 == 0) goto L_0x009a
            int r4 = r4 - r1
            if (r4 < 0) goto L_0x0082
        L_0x0076:
            if (r2 <= r1) goto L_0x007d
            float r0 = r3.mo109134r0(r2)
            float r6 = r6 + r0
        L_0x007d:
            if (r2 == r4) goto L_0x0082
            int r2 = r2 + 1
            goto L_0x0076
        L_0x0082:
            float r6 = r6 + r5
            float r11 = r11.getTextSize()
            float r6 = r6 / r11
            float r11 = (float) r1
            float r6 = r6 + r11
            int r11 = (int) r6
            int r11 = r11 + 2
            int r9 = r9 + r10
            int r10 = r9 - r11
            char r11 = r7.f26059l
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.CharSequence r8 = z04.C112550d0.m153781Q(r8, r10, r9, r11)
        L_0x009a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ej1.C7692l.mo8814m(java.lang.CharSequence, int, int, com.tencent.neattextview.textview.view.NeatTextView):java.lang.CharSequence");
    }

    /* renamed from: n */
    public final int mo8815n() {
        return ((Number) ((C36570n) this.f26058k).getValue()).intValue();
    }

    /* renamed from: o */
    public final String mo8816o() {
        if (f26055n) {
            String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.dgf);
            C87412m.m108593f(string, "getContext().resources.g…_annoucement_replacement)");
            return string;
        }
        String string2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.dyb);
        C87412m.m108593f(string2, "getContext().resources.g…ing.finder_live_msg_gift)");
        return string2;
    }

    /* renamed from: p */
    public final int mo8817p() {
        FinderLiveService.f159376d.getClass();
        C56032b bVar = FinderLiveService.f159379g;
        boolean z = true;
        if (bVar == null || !bVar.isLandscape()) {
            z = false;
        }
        if (z) {
            return (int) (((double) C75044y4.m89990b(MMApplicationContext.getContext()).x) * 0.5d);
        }
        C12322e5.C12334g gVar = C12322e5.f35497W;
        return (int) (((float) (C75044y4.m89990b(MMApplicationContext.getContext()).x - MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.a7k))) - C12322e5.f35498X);
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8818q(java.lang.CharSequence r6, com.tencent.neattextview.textview.view.NeatTextView r7, int r8) {
        /*
            r5 = this;
            r0 = 0
            int r1 = r5.mo8817p()     // Catch:{ all -> 0x008d }
            int r2 = r7.getPaddingLeft()     // Catch:{ all -> 0x008d }
            int r1 = r1 - r2
            int r2 = r7.getPaddingRight()     // Catch:{ all -> 0x008d }
            int r1 = r1 - r2
            android.view.ViewParent r2 = r7.getParent()     // Catch:{ all -> 0x008d }
            boolean r3 = r2 instanceof android.view.ViewGroup     // Catch:{ all -> 0x008d }
            r4 = 0
            if (r3 == 0) goto L_0x001b
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x008d }
            goto L_0x001c
        L_0x001b:
            r2 = r4
        L_0x001c:
            if (r2 == 0) goto L_0x0023
            int r2 = r2.getPaddingLeft()     // Catch:{ all -> 0x008d }
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            int r1 = r1 - r2
            android.view.ViewParent r2 = r7.getParent()     // Catch:{ all -> 0x008d }
            boolean r3 = r2 instanceof android.view.ViewGroup     // Catch:{ all -> 0x008d }
            if (r3 == 0) goto L_0x0030
            r4 = r2
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x008d }
        L_0x0030:
            if (r4 == 0) goto L_0x0037
            int r2 = r4.getPaddingRight()     // Catch:{ all -> 0x008d }
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            int r1 = r1 - r2
            int r1 = r1 + -6
            if (r1 <= 0) goto L_0x006e
            int r2 = r5.mo8815n()     // Catch:{ all -> 0x008d }
            if (r1 <= r2) goto L_0x006e
            int r2 = r7.getMaxLines()     // Catch:{ all -> 0x008d }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r7.setMaxLines(r3)     // Catch:{ all -> 0x008d }
            r7.mo104279b(r6)     // Catch:{ all -> 0x008d }
            int r6 = r5.mo8815n()     // Catch:{ all -> 0x008d }
            int r1 = r1 - r6
            yr3.a r6 = r7.mo154990i(r1, r3)     // Catch:{ all -> 0x008d }
            r1 = r6
            com.tencent.neattextview.textview.layout.NeatLayout r1 = (com.tencent.neattextview.textview.layout.NeatLayout) r1     // Catch:{ all -> 0x008d }
            int r1 = r1.f319992L     // Catch:{ all -> 0x008d }
            r7.setMaxLines(r2)     // Catch:{ all -> 0x008d }
            r7 = 1
            if (r1 <= r7) goto L_0x006d
            yr3.c r6 = (yr3.C112481c) r6     // Catch:{ all -> 0x008d }
            int r6 = r6.mo109122b(r7)     // Catch:{ all -> 0x008d }
            if (r6 <= r8) goto L_0x006d
            r0 = 1
        L_0x006d:
            return r0
        L_0x006e:
            java.lang.String r7 = r5.f26057j     // Catch:{ all -> 0x008d }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
            r8.<init>()     // Catch:{ all -> 0x008d }
            java.lang.String r2 = "giftSingleLine "
            r8.append(r2)     // Catch:{ all -> 0x008d }
            r8.append(r1)     // Catch:{ all -> 0x008d }
            java.lang.String r1 = ", "
            r8.append(r1)     // Catch:{ all -> 0x008d }
            r8.append(r6)     // Catch:{ all -> 0x008d }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x008d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)     // Catch:{ all -> 0x008d }
            return r0
        L_0x008d:
            r6 = move-exception
            java.lang.String r7 = r5.f26057j
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r1 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r6, r1, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ej1.C7692l.mo8818q(java.lang.CharSequence, com.tencent.neattextview.textview.view.NeatTextView, int):boolean");
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8819r(java.lang.CharSequence r6, com.tencent.neattextview.textview.view.NeatTextView r7) {
        /*
            r5 = this;
            int r0 = r5.mo8817p()
            int r1 = r7.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r7.getPaddingRight()
            int r0 = r0 - r1
            android.view.ViewParent r1 = r7.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            r3 = 0
            if (r2 == 0) goto L_0x001a
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x001b
        L_0x001a:
            r1 = r3
        L_0x001b:
            r2 = 0
            if (r1 == 0) goto L_0x0023
            int r1 = r1.getPaddingLeft()
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            int r0 = r0 - r1
            android.view.ViewParent r1 = r7.getParent()
            boolean r4 = r1 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x0030
            r3 = r1
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x0030:
            if (r3 == 0) goto L_0x0037
            int r1 = r3.getPaddingRight()
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            int r0 = r0 - r1
            r1 = 1
            if (r0 <= 0) goto L_0x006e
            int r3 = r7.getMaxLines()
            r4 = 2147483647(0x7fffffff, float:NaN)
            r7.setMaxLines(r4)
            r7.mo104279b(r6)
            yr3.a r6 = r7.mo154990i(r0, r4)
            r4 = r6
            com.tencent.neattextview.textview.layout.NeatLayout r4 = (com.tencent.neattextview.textview.layout.NeatLayout) r4
            int r4 = r4.f319992L
            r7.setMaxLines(r3)
            if (r4 > r1) goto L_0x0058
            return r1
        L_0x0058:
            r7 = 2
            if (r4 > r7) goto L_0x006d
            float r7 = (float) r0
            yr3.c r6 = (yr3.C112481c) r6
            float r6 = r6.mo109134r0(r1)
            float r7 = r7 - r6
            int r6 = r5.mo8815n()
            float r6 = (float) r6
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x006d
            r2 = 1
        L_0x006d:
            return r2
        L_0x006e:
            java.lang.String r7 = r5.f26057j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "matchRules "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ej1.C7692l.mo8819r(java.lang.CharSequence, com.tencent.neattextview.textview.view.NeatTextView):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: com.tencent.mm.ui.widget.MMNeat7extView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.util.LinkedList<te3.aw0>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.util.LinkedList<te3.aw0>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.util.LinkedList<te3.aw0>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v64, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v11, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v12, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v13, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v46, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v36, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v47, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v37, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v14, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v6, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v15, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v39, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v42, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v54, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v89, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v43, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v56, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v44, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v57, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v45, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v58, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v46, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v59, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v47, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v60, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v48, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v49, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v61, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v64, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v51, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v107, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v9, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v10, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v87, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v62, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v63, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v64, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v16, resolved type: com.tencent.mm.ui.widget.MMNeat7extView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v65, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v17, resolved type: com.tencent.mm.ui.widget.MMNeat7extView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v18, resolved type: com.tencent.mm.ui.widget.MMNeat7extView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v19, resolved type: com.tencent.mm.ui.widget.MMNeat7extView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v20, resolved type: com.tencent.mm.ui.widget.MMNeat7extView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v21, resolved type: com.tencent.mm.ui.widget.MMNeat7extView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v22, resolved type: com.tencent.mm.ui.widget.MMNeat7extView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v75, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v76, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v22, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v23, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v25, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v26, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v38, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v39, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v79, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v58, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v59, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v60, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v153, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v154, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v155, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v80, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v156, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v62, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v81, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v63, resolved type: java.util.LinkedList<te3.aw0>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v82, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v159, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v83, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v84, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v85, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v86, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v87, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v88, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v89, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v160, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v161, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v162, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v64, resolved type: java.util.LinkedList<te3.aw0>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v44, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v90, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v89, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v91, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v90, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v92, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v91, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v93, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v92, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v93, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v94, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v95, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v46, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v48, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v49, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v51, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v53, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v96, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v96, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v97, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v98, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v38, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v98, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v99, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v99, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v100, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v100, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v101, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v103, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v101, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v102, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v103, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v104, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v104, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v105, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v105, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v106, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v106, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v107, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v108, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v109, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v110, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v111, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v112, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v114, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v107, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v108, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v109, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v110, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v27, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v54, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v55, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v56, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v57, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v58, resolved type: T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v59, resolved type: T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v60, resolved type: T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v38, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v39, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v32, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v34, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v36, resolved type: ej1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v28, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v29, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v30, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v31, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v32, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v33, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v34, resolved type: gy3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v61, resolved type: ej1.l} */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: type inference failed for: r4v28, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r15v8 */
    /* JADX WARNING: type inference failed for: r10v15 */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: type inference failed for: r7v30 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX WARNING: type inference failed for: r4v53, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r5v37 */
    /* JADX WARNING: type inference failed for: r10v28 */
    /* JADX WARNING: type inference failed for: r9v32 */
    /* JADX WARNING: type inference failed for: r9v36, types: [com.tencent.mm.ui.widget.MMNeat7extView, com.tencent.neattextview.textview.view.NeatTextView] */
    /* JADX WARNING: type inference failed for: r5v42 */
    /* JADX WARNING: type inference failed for: r4v77 */
    /* JADX WARNING: type inference failed for: r4v79 */
    /* JADX WARNING: type inference failed for: r5v54 */
    /* JADX WARNING: type inference failed for: r17v20 */
    /* JADX WARNING: type inference failed for: r17v21 */
    /* JADX WARNING: type inference failed for: r17v22 */
    /* JADX WARNING: type inference failed for: r17v23 */
    /* JADX WARNING: type inference failed for: r15v31 */
    /* JADX WARNING: type inference failed for: r15v33 */
    /* JADX WARNING: type inference failed for: r15v35 */
    /* JADX WARNING: type inference failed for: r15v37 */
    /* JADX WARNING: type inference failed for: r15v39 */
    /* JADX WARNING: type inference failed for: r15v40 */
    /* JADX WARNING: type inference failed for: r15v42 */
    /* JADX WARNING: type inference failed for: r15v44 */
    /* JADX WARNING: type inference failed for: r5v57 */
    /* JADX WARNING: type inference failed for: r5v58 */
    /* JADX WARNING: type inference failed for: r7v94 */
    /* JADX WARNING: type inference failed for: r9v69 */
    /* JADX WARNING: type inference failed for: r10v64 */
    /* JADX WARNING: type inference failed for: r7v95 */
    /* JADX WARNING: type inference failed for: r10v65 */
    /* JADX WARNING: type inference failed for: r9v70 */
    /* JADX WARNING: type inference failed for: r7v97 */
    /* JADX WARNING: type inference failed for: r5v59 */
    /* JADX WARNING: type inference failed for: r7v102 */
    /* JADX WARNING: type inference failed for: r5v63 */
    /* JADX WARNING: type inference failed for: r9v77 */
    /* JADX WARNING: type inference failed for: r7v113 */
    /* JADX WARNING: type inference failed for: r5v67 */
    /* JADX WARNING: type inference failed for: r5v68 */
    /* JADX WARNING: type inference failed for: r2v163 */
    /* JADX WARNING: type inference failed for: r4v113 */
    /* JADX WARNING: type inference failed for: r4v114 */
    /* JADX WARNING: type inference failed for: r4v116 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0409 A[Catch:{ all -> 0x03e7, all -> 0x0ae1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0a8c A[Catch:{ all -> 0x0aa2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0a96 A[Catch:{ all -> 0x0aa2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0bb4  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0beb  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f A[SYNTHETIC, Splitter:B:35:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0300 A[SYNTHETIC, Splitter:B:86:0x0300] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8820s(android.content.Context r47, qk1.C12806i0.C12807a r48, cj1.C0581o5 r49, te3.C51443tt0 r50) {
        /*
            r46 = this;
            r11 = r46
            r12 = r47
            r13 = r50
            java.lang.Class<tf0.p1> r8 = tf0.C64916p1.class
            java.lang.Class<ny.h> r14 = p629ny.C76979h.class
            int r0 = r13.f142393i
            r15 = 0
            r10 = 1
            if (r0 != r10) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            f26055n = r0
            te3.hx0 r0 = r49.mo579i()
            if (r0 == 0) goto L_0x001f
            java.util.LinkedList<te3.aw0> r0 = r0.f134930r
            r7 = r0
            goto L_0x0020
        L_0x001f:
            r7 = 0
        L_0x0020:
            java.lang.String r1 = r13.f142390f
            te3.p11 r0 = r13.f142389e
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = r0.f139515o
            r6 = r2
            goto L_0x002b
        L_0x002a:
            r6 = 0
        L_0x002b:
            java.lang.String r5 = r13.f142388d
            if (r0 == 0) goto L_0x0032
            int r0 = r0.f139519s
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            r2 = 256(0x100, float:3.59E-43)
            boolean r26 = o40.C61926c.m72696u(r0, r2)
            gy3.f0 r4 = new gy3.f0
            r4.<init>()
            te3.w81 r0 = new te3.w81
            r0.<init>()
            pe3.b r2 = r13.f142394j
            if (r2 == 0) goto L_0x004c
            byte[] r2 = r2.mo123703f()
            goto L_0x004d
        L_0x004c:
            r2 = 0
        L_0x004d:
            java.lang.String r3 = "safeParser"
            r16 = r7
            java.lang.String r7 = ""
            if (r2 != 0) goto L_0x0057
            goto L_0x0064
        L_0x0057:
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x005b }
            goto L_0x0065
        L_0x005b:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r15] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r7, r0)
        L_0x0064:
            r0 = 0
        L_0x0065:
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = r0.f143922d
            goto L_0x006b
        L_0x006a:
            r0 = 0
        L_0x006b:
            r4.f27484d = r0
            te3.w81 r0 = new te3.w81
            r0.<init>()
            pe3.b r2 = r13.f142394j
            if (r2 == 0) goto L_0x007b
            byte[] r2 = r2.mo123703f()
            goto L_0x007c
        L_0x007b:
            r2 = 0
        L_0x007c:
            if (r2 != 0) goto L_0x007f
            goto L_0x008c
        L_0x007f:
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x0083 }
            goto L_0x008d
        L_0x0083:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r15] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r7, r0)
        L_0x008c:
            r0 = 0
        L_0x008d:
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = r0.f143922d
            goto L_0x0093
        L_0x0092:
            r0 = 0
        L_0x0093:
            T r2 = r4.f27484d
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x009e
            int r2 = r2.length()
            goto L_0x009f
        L_0x009e:
            r2 = 0
        L_0x009f:
            r3 = 8
            if (r2 <= r3) goto L_0x00c8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            T r9 = r4.f27484d
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x00b9
            java.lang.String r3 = r9.substring(r15, r3)
            java.lang.String r9 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r3, r9)
            goto L_0x00ba
        L_0x00b9:
            r3 = 0
        L_0x00ba:
            r2.append(r3)
            char r3 = r11.f26059l
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r4.f27484d = r2
        L_0x00c8:
            int r9 = r13.f142391g
            te3.p11 r2 = r13.f142389e
            if (r2 == 0) goto L_0x00d2
            java.lang.String r2 = r2.f139509f
            r3 = r2
            goto L_0x00d3
        L_0x00d2:
            r3 = 0
        L_0x00d3:
            java.lang.String r2 = r11.f26057j
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r10 = "onBindComboLiveRewardMsg giftContent "
            r15.append(r10)
            r15.append(r1)
            java.lang.String r1 = ",comboCount:"
            r15.append(r1)
            r15.append(r9)
            java.lang.String r1 = ",giftThumbUrl is empty:"
            r15.append(r1)
            if (r3 != 0) goto L_0x00f3
            r1 = 1
            goto L_0x00f4
        L_0x00f3:
            r1 = 0
        L_0x00f4:
            r15.append(r1)
            java.lang.String r1 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            gy3.f0 r15 = new gy3.f0
            r15.<init>()
            ok1.e r10 = ok1.C62042e.f176370a
            java.lang.String r18 = r49.mo571e()
            java.lang.String r19 = r49.mo573g()
            r20 = 0
            r21 = 4
            r22 = 0
            r17 = r10
            java.lang.String r1 = ok1.C62042e.m72808l0(r17, r18, r19, r20, r21, r22)
            r15.f27484d = r1
            di3.d r1 = di3.C86312j.m106911c(r8)
            java.lang.String r2 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            tf0.p1 r1 = (tf0.C64916p1) r1
            com.tencent.mm.ui.widget.MMNeat7extView r17 = r48.mo12335B()
            r18 = r3
            android.text.TextPaint r3 = r17.getPaint()
            r17 = r7
            java.lang.String r7 = "holder.contentTv.paint"
            gy3.C87412m.m108593f(r3, r7)
            r19 = r2
            T r2 = r15.f27484d
            r20 = r2
            java.lang.CharSequence r20 = (java.lang.CharSequence) r20
            r21 = 0
            r22 = 8
            r23 = 0
            r29 = r19
            r2 = r47
            r30 = r18
            r31 = r4
            r4 = r20
            r32 = r5
            r5 = r21
            r33 = r6
            r6 = r22
            r13 = r7
            r34 = r16
            r35 = r17
            r7 = r23
            java.lang.CharSequence r1 = tf0.C64916p1.C64917a.m76441h(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = r1.toString()
            r15.f27484d = r1
            fj1.b r1 = r11.f26056i
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r2)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75998e3()
            if (r1 == 0) goto L_0x01ad
            c50.b r1 = c50.C54655b.f153178f1
            if (r1 == 0) goto L_0x017e
            r1 = 1
            goto L_0x017f
        L_0x017e:
            r1 = 0
        L_0x017f:
            if (r1 != 0) goto L_0x018d
            i50.a r1 = i50.C60251a.f171781k1
            if (r1 == 0) goto L_0x0187
            r1 = 1
            goto L_0x0188
        L_0x0187:
            r1 = 0
        L_0x0188:
            if (r1 == 0) goto L_0x018b
            goto L_0x018d
        L_0x018b:
            r1 = 0
            goto L_0x018e
        L_0x018d:
            r1 = 1
        L_0x018e:
            if (r1 != 0) goto L_0x01ad
            te3.hx0 r1 = r49.mo579i()
            if (r1 == 0) goto L_0x019d
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.f134919d
            if (r1 == 0) goto L_0x019d
            java.lang.String r1 = r1.username
            goto L_0x019e
        L_0x019d:
            r1 = 0
        L_0x019e:
            T r2 = r15.f27484d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = er1.C7878t0.m8042k(r1, r2)
            java.lang.String r2 = "makeAnonymousNameIfIsMyS…  vNickname\n            )"
            gy3.C87412m.m108593f(r1, r2)
            r15.f27484d = r1
        L_0x01ad:
            gy3.f0 r7 = new gy3.f0
            r7.<init>()
            di3.d r1 = di3.C86312j.m106911c(r8)
            r6 = r29
            gy3.C87412m.m108593f(r1, r6)
            tf0.p1 r1 = (tf0.C64916p1) r1
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r48.mo12335B()
            android.text.TextPaint r3 = r2.getPaint()
            gy3.C87412m.m108593f(r3, r13)
            T r2 = r15.f27484d
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r16 = 0
            r17 = 8
            r18 = 0
            r5 = 0
            r2 = r47
            r36 = r6
            r6 = r17
            r29 = r15
            r15 = r7
            r7 = r18
            java.lang.CharSequence r1 = tf0.C64916p1.C64917a.m76441h(r1, r2, r3, r4, r5, r6, r7)
            r15.f27484d = r1
            java.lang.String r18 = r49.mo580j()
            java.lang.String r19 = r49.mo585o()
            r20 = 0
            r23 = 4
            r22 = 0
            r21 = 4
            r17 = r10
            java.lang.String r4 = ok1.C62042e.m72808l0(r17, r18, r19, r20, r21, r22)
            di3.d r1 = di3.C86312j.m106911c(r8)
            r10 = r36
            gy3.C87412m.m108593f(r1, r10)
            tf0.p1 r1 = (tf0.C64916p1) r1
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r48.mo12335B()
            android.text.TextPaint r3 = r2.getPaint()
            gy3.C87412m.m108593f(r3, r13)
            r17 = 8
            r7 = 0
            r6 = 8
            r2 = r47
            java.lang.CharSequence r1 = tf0.C64916p1.C64917a.m76441h(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r7 = r1.toString()
            di3.d r1 = di3.C86312j.m106911c(r8)
            gy3.C87412m.m108593f(r1, r10)
            tf0.p1 r1 = (tf0.C64916p1) r1
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r48.mo12335B()
            android.text.TextPaint r3 = r2.getPaint()
            gy3.C87412m.m108593f(r3, r13)
            r8 = 0
            r2 = r47
            r4 = r7
            r5 = r16
            r6 = r17
            r13 = r7
            r7 = r8
            java.lang.CharSequence r1 = tf0.C64916p1.C64917a.m76441h(r1, r2, r3, r4, r5, r6, r7)
            r2 = 2131828170(0x7f111dca, float:1.9289273E38)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r10 = r33
            r3 = 0
            r4[r3] = r10
            java.lang.String r8 = r12.getString(r2, r4)
            java.lang.String r2 = "context.getString(R.stri…sg_gift_prefix, giftName)"
            gy3.C87412m.m108593f(r8, r2)
            gy3.f0 r7 = new gy3.f0
            r7.<init>()
            r2 = 2131828171(0x7f111dcb, float:1.9289275E38)
            java.lang.String r2 = r12.getString(r2)
            java.lang.String r3 = "context.getString(R.stri…er_live_msg_gift_prefix2)"
            gy3.C87412m.m108593f(r2, r3)
            r7.f27484d = r2
            r2 = 2131828878(0x7f11208e, float:1.929071E38)
            r6 = 2
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r5 = r31
            T r4 = r5.f27484d
            r16 = 0
            r3[r16] = r4
            r4 = 1
            r3[r4] = r10
            java.lang.String r2 = r12.getString(r2, r3)
            java.lang.String r3 = "context.getString(R.stri…text, songName, giftName)"
            gy3.C87412m.m108593f(r2, r3)
            gy3.f0 r4 = new gy3.f0
            r4.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = 120(0x78, float:1.68E-43)
            r3.append(r6)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r4.f27484d = r3
            gy3.d0 r3 = new gy3.d0
            r3.<init>()
            gy3.f0 r6 = new gy3.f0
            r6.<init>()
            r36 = r7
            wk1.n r7 = wk1.C15440n.f41895a
            r37 = r13
            r13 = 3
            r38 = r1
            int[] r1 = new int[r13]
            r1 = {2, 4, 6} // fill-array
            com.tencent.mm.ui.widget.MMNeat7extView r22 = r48.mo12335B()
            r19 = 0
            r20 = 0
            r24 = 0
            r25 = 76
            r39 = 0
            r16 = r7
            r17 = r34
            r18 = r1
            r21 = r23
            r23 = r24
            r24 = r25
            r25 = r39
            java.util.List r1 = wk1.C15440n.m14441q(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r17 = r10
            java.lang.String r10 = r46.mo8816o()
            r13.append(r10)
            java.lang.String r7 = r7.mo14265n(r1)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            com.tencent.mm.ui.widget.MMNeat7extView r7 = r48.mo12335B()
            r10 = 2131302537(0x7f091889, float:1.8223163E38)
            r18 = r4
            java.lang.String r4 = r46.mo8816o()
            r7.setTag(r10, r4)
            r4 = 32
            if (r26 == 0) goto L_0x0409
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0405 }
            r0.<init>()     // Catch:{ all -> 0x0405 }
            r2 = 120(0x78, float:1.68E-43)
            r0.append(r2)     // Catch:{ all -> 0x0405 }
            r0.append(r9)     // Catch:{ all -> 0x0405 }
            r2 = 65292(0xff0c, float:9.1494E-41)
            r0.append(r2)     // Catch:{ all -> 0x0405 }
            r2 = 2131828474(0x7f111efa, float:1.928989E38)
            java.lang.String r2 = r12.getString(r2)     // Catch:{ all -> 0x0405 }
            r0.append(r2)     // Catch:{ all -> 0x0405 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0405 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0405 }
            r2.<init>()     // Catch:{ all -> 0x0405 }
            r2.append(r13)     // Catch:{ all -> 0x0405 }
            T r10 = r15.f27484d     // Catch:{ all -> 0x0405 }
            r2.append(r10)     // Catch:{ all -> 0x0405 }
            r2.append(r4)     // Catch:{ all -> 0x0405 }
            r2.append(r8)     // Catch:{ all -> 0x0405 }
            r2.append(r4)     // Catch:{ all -> 0x0405 }
            r2.append(r0)     // Catch:{ all -> 0x0405 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0405 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0405 }
            r10.<init>()     // Catch:{ all -> 0x0405 }
            r10.append(r13)     // Catch:{ all -> 0x0405 }
            T r7 = r15.f27484d     // Catch:{ all -> 0x0405 }
            r10.append(r7)     // Catch:{ all -> 0x0405 }
            r10.append(r4)     // Catch:{ all -> 0x0405 }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x0405 }
            int r7 = r7.length()     // Catch:{ all -> 0x0405 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0405 }
            r10.<init>()     // Catch:{ all -> 0x0405 }
            r10.append(r4)     // Catch:{ all -> 0x0405 }
            r10.append(r0)     // Catch:{ all -> 0x0405 }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x0405 }
            int r0 = r0.length()     // Catch:{ all -> 0x0405 }
            r10 = 3
            int r7 = r7 + r10
            T r5 = r5.f27484d     // Catch:{ all -> 0x0405 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0405 }
            if (r5 == 0) goto L_0x0376
            int r5 = r5.length()     // Catch:{ all -> 0x0405 }
            goto L_0x0377
        L_0x0376:
            r5 = 0
        L_0x0377:
            com.tencent.mm.ui.widget.MMNeat7extView r10 = r48.mo12335B()     // Catch:{ all -> 0x0405 }
            java.lang.CharSequence r2 = r11.mo8814m(r2, r7, r5, r10)     // Catch:{ all -> 0x0405 }
            de3.u r5 = new de3.u     // Catch:{ all -> 0x0405 }
            di3.d r7 = di3.C86312j.m106911c(r14)     // Catch:{ all -> 0x0405 }
            ny.h r7 = (p629ny.C76979h) r7     // Catch:{ all -> 0x0405 }
            android.text.SpannableString r7 = r7.mo107057T1(r12, r2)     // Catch:{ all -> 0x0405 }
            r5.<init>((android.text.SpannableString) r7)     // Catch:{ all -> 0x0405 }
            r10 = r34
            m7833y(r11, r5, r1, r10)     // Catch:{ all -> 0x0401 }
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0401 }
            com.tencent.mm.ui.widget.MMNeat7extView r7 = r48.mo12335B()     // Catch:{ all -> 0x0401 }
            r22 = r1
            r4 = 3
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x03f8 }
            r34 = r10
            r4 = r29
            T r10 = r4.f27484d     // Catch:{ all -> 0x0ae1 }
            r23 = 0
            r1[r23] = r10     // Catch:{ all -> 0x0ae1 }
            r10 = 1
            r1[r10] = r8     // Catch:{ all -> 0x0ae1 }
            java.lang.String r10 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0ae1 }
            r23 = 2
            r1[r23] = r10     // Catch:{ all -> 0x0ae1 }
            r10 = 2131827219(0x7f111a13, float:1.9287344E38)
            java.lang.String r1 = r12.getString(r10, r1)     // Catch:{ all -> 0x0ae1 }
            r10 = 2131302534(0x7f091886, float:1.8223157E38)
            r7.setTag(r10, r1)     // Catch:{ all -> 0x03e7 }
            r6.f27484d = r5     // Catch:{ all -> 0x0ae1 }
            int r1 = r2.length()     // Catch:{ all -> 0x0ae1 }
            int r1 = r1 - r0
            r3.f27483d = r1     // Catch:{ all -> 0x0ae1 }
            r7 = r3
            r27 = r9
            r24 = r14
            r1 = r15
            r43 = r17
            r14 = r18
            r2 = r22
            r9 = r34
            r10 = 2131302534(0x7f091886, float:1.8223157E38)
            r17 = 1
            r15 = r13
            r13 = r4
            r4 = 32
            r45 = r11
            r11 = r8
            r8 = r45
            goto L_0x0a8a
        L_0x03e7:
            r0 = move-exception
            r7 = r3
            r27 = r9
            r24 = r14
            r1 = r15
            r43 = r17
            r14 = r18
            r2 = r22
            r9 = r34
            goto L_0x0af3
        L_0x03f8:
            r0 = move-exception
        L_0x03f9:
            r34 = r10
        L_0x03fb:
            r4 = r29
            r23 = 2
            goto L_0x0ae2
        L_0x0401:
            r0 = move-exception
            r22 = r1
            goto L_0x03f9
        L_0x0405:
            r0 = move-exception
            r22 = r1
            goto L_0x03fb
        L_0x0409:
            r22 = r1
            r4 = r29
            r23 = 2
            boolean r1 = f26055n     // Catch:{ all -> 0x0ae1 }
            if (r1 == 0) goto L_0x05fc
            r7 = r32
            r11.mo8821z(r0, r7, r9)     // Catch:{ all -> 0x05e7 }
            java.lang.String r1 = r11.f26057j     // Catch:{ all -> 0x05e7 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e7 }
            r10.<init>()     // Catch:{ all -> 0x05e7 }
            r24 = r3
            java.lang.String r3 = "commentItem is Song songName: "
            r10.append(r3)     // Catch:{ all -> 0x05d3 }
            T r3 = r5.f27484d     // Catch:{ all -> 0x05d3 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x05d3 }
            r10.append(r3)     // Catch:{ all -> 0x05d3 }
            java.lang.String r3 = r10.toString()     // Catch:{ all -> 0x05d3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ all -> 0x05d3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05d3 }
            r1.<init>()     // Catch:{ all -> 0x05d3 }
            r1.append(r13)     // Catch:{ all -> 0x05d3 }
            T r3 = r15.f27484d     // Catch:{ all -> 0x05d3 }
            r1.append(r3)     // Catch:{ all -> 0x05d3 }
            r3 = 32
            r1.append(r3)     // Catch:{ all -> 0x05d3 }
            r1.append(r2)     // Catch:{ all -> 0x05d3 }
            r1.append(r3)     // Catch:{ all -> 0x05d3 }
            r10 = r18
            T r2 = r10.f27484d     // Catch:{ all -> 0x05bf }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x05bf }
            r1.append(r2)     // Catch:{ all -> 0x05bf }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x05bf }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x05bf }
            r2.<init>()     // Catch:{ all -> 0x05bf }
            r2.append(r13)     // Catch:{ all -> 0x05bf }
            T r3 = r15.f27484d     // Catch:{ all -> 0x05bf }
            r2.append(r3)     // Catch:{ all -> 0x05bf }
            r3 = 32
            r2.append(r3)     // Catch:{ all -> 0x05bf }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x05bf }
            int r2 = r2.length()     // Catch:{ all -> 0x05bf }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x05bf }
            r3.<init>()     // Catch:{ all -> 0x05bf }
            r29 = r4
            r4 = 32
            r3.append(r4)     // Catch:{ all -> 0x05aa }
            T r4 = r10.f27484d     // Catch:{ all -> 0x05aa }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x05aa }
            r3.append(r4)     // Catch:{ all -> 0x05aa }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x05aa }
            int r18 = r3.length()     // Catch:{ all -> 0x05aa }
            r3 = 3
            int r4 = r2 + 3
            T r2 = r5.f27484d     // Catch:{ all -> 0x05aa }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x05aa }
            if (r2 == 0) goto L_0x04b7
            int r2 = r2.length()     // Catch:{ all -> 0x049c }
            goto L_0x04b8
        L_0x049c:
            r0 = move-exception
            r27 = r9
            r1 = r15
            r43 = r17
            r2 = r22
            r7 = r24
            r9 = r34
            r4 = 32
            r17 = 1
            r15 = r13
            r24 = r14
            r13 = r29
            r14 = r10
            r10 = 2131302534(0x7f091886, float:1.8223157E38)
            goto L_0x0af9
        L_0x04b7:
            r2 = 0
        L_0x04b8:
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r48.mo12335B()     // Catch:{ all -> 0x05aa }
            java.lang.CharSequence r3 = r11.mo8814m(r1, r4, r2, r3)     // Catch:{ all -> 0x05aa }
            de3.u r2 = new de3.u     // Catch:{ all -> 0x05aa }
            di3.d r1 = di3.C86312j.m106911c(r14)     // Catch:{ all -> 0x05aa }
            ny.h r1 = (p629ny.C76979h) r1     // Catch:{ all -> 0x05aa }
            android.text.SpannableString r1 = r1.mo107057T1(r12, r3)     // Catch:{ all -> 0x05aa }
            r2.<init>((android.text.SpannableString) r1)     // Catch:{ all -> 0x05aa }
            r1 = r34
            r45 = r22
            r22 = r3
            r3 = r45
            m7833y(r11, r2, r3, r1)     // Catch:{ all -> 0x059c }
            rx3.b0 r25 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x059c }
            r25 = r10
            ej1.l$b r10 = new ej1.l$b     // Catch:{ all -> 0x0581 }
            r31 = r15
            r15 = r3
            r3 = r1
            r1 = r10
            r11 = r2
            r2 = r46
            r40 = r3
            r21 = r22
            r22 = r15
            r15 = r24
            r24 = 32
            r3 = r0
            r0 = r4
            r32 = r13
            r41 = r25
            r13 = r29
            r4 = r7
            r7 = r5
            r5 = r9
            r24 = r14
            r23 = r15
            r15 = 2
            r14 = r6
            r6 = r7
            r7 = r47
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0576 }
            int r1 = r21.length()     // Catch:{ all -> 0x0576 }
            int r1 = r1 - r18
            if (r17 == 0) goto L_0x0516
            int r2 = r17.length()     // Catch:{ all -> 0x0576 }
            goto L_0x0517
        L_0x0516:
            r2 = 0
        L_0x0517:
            int r1 = r1 - r2
            int r1 = r1 + -4
            r2 = 33
            r11.setSpan(r10, r0, r1, r2)     // Catch:{ all -> 0x0576 }
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r48.mo12335B()     // Catch:{ all -> 0x0576 }
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0576 }
            T r1 = r13.f27484d     // Catch:{ all -> 0x0576 }
            r3 = 0
            r2[r3] = r1     // Catch:{ all -> 0x0576 }
            r1 = 1
            r2[r1] = r8     // Catch:{ all -> 0x0576 }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0576 }
            r2[r15] = r1     // Catch:{ all -> 0x0576 }
            r10 = 2131827219(0x7f111a13, float:1.9287344E38)
            java.lang.String r1 = r12.getString(r10, r2)     // Catch:{ all -> 0x056e }
            r7 = 2131302534(0x7f091886, float:1.8223157E38)
            r0.setTag(r7, r1)     // Catch:{ all -> 0x0569 }
            r14.f27484d = r11     // Catch:{ all -> 0x0569 }
            int r0 = r21.length()     // Catch:{ all -> 0x0569 }
            int r0 = r0 - r18
            r11 = r23
            r11.f27483d = r0     // Catch:{ all -> 0x0ac5 }
            r27 = r9
            r7 = r11
            r6 = r14
            r43 = r17
            r2 = r22
            r1 = r31
            r15 = r32
            r9 = r40
            r14 = r41
            r4 = 32
            r10 = 2131302534(0x7f091886, float:1.8223157E38)
            r17 = 1
            r11 = r8
            r8 = r46
            goto L_0x0a8a
        L_0x0569:
            r0 = move-exception
            r11 = r23
            goto L_0x0ac6
        L_0x056e:
            r0 = move-exception
            r11 = r23
            r7 = 2131302534(0x7f091886, float:1.8223157E38)
            goto L_0x0ac6
        L_0x0576:
            r0 = move-exception
            r11 = r23
            r7 = 2131302534(0x7f091886, float:1.8223157E38)
            r10 = 2131827219(0x7f111a13, float:1.9287344E38)
            goto L_0x0ac6
        L_0x0581:
            r0 = move-exception
            r40 = r1
            r22 = r3
            r32 = r13
            r31 = r15
            r11 = r24
            r41 = r25
        L_0x058e:
            r13 = r29
            r7 = 2131302534(0x7f091886, float:1.8223157E38)
            r10 = 2131827219(0x7f111a13, float:1.9287344E38)
            r15 = 2
        L_0x0597:
            r24 = r14
        L_0x0599:
            r14 = r6
            goto L_0x0ac6
        L_0x059c:
            r0 = move-exception
            r40 = r1
            r22 = r3
            r41 = r10
            r32 = r13
            r31 = r15
            r11 = r24
            goto L_0x058e
        L_0x05aa:
            r0 = move-exception
            r41 = r10
            r32 = r13
            r31 = r15
            r11 = r24
            r13 = r29
            r40 = r34
            r7 = 2131302534(0x7f091886, float:1.8223157E38)
            r10 = 2131827219(0x7f111a13, float:1.9287344E38)
            r15 = 2
            goto L_0x0597
        L_0x05bf:
            r0 = move-exception
            r41 = r10
            r32 = r13
            r31 = r15
            r11 = r24
            r40 = r34
            r7 = 2131302534(0x7f091886, float:1.8223157E38)
            r10 = 2131827219(0x7f111a13, float:1.9287344E38)
            r15 = 2
            r13 = r4
            goto L_0x0597
        L_0x05d3:
            r0 = move-exception
            r32 = r13
            r31 = r15
            r41 = r18
            r11 = r24
            r40 = r34
            r7 = 2131302534(0x7f091886, float:1.8223157E38)
            r10 = 2131827219(0x7f111a13, float:1.9287344E38)
            r15 = 2
            r13 = r4
            goto L_0x0597
        L_0x05e7:
            r0 = move-exception
            r11 = r3
            r32 = r13
            r24 = r14
            r31 = r15
            r41 = r18
            r40 = r34
            r7 = 2131302534(0x7f091886, float:1.8223157E38)
            r10 = 2131827219(0x7f111a13, float:1.9287344E38)
            r15 = 2
            r13 = r4
            goto L_0x0599
        L_0x05fc:
            r11 = r3
            r32 = r13
            r24 = r14
            r31 = r15
            r41 = r18
            r40 = r34
            r7 = 2131302534(0x7f091886, float:1.8223157E38)
            r10 = 2131827219(0x7f111a13, float:1.9287344E38)
            r15 = 2
            r13 = r4
            r14 = r6
            boolean r0 = f26054m     // Catch:{ all -> 0x0ac5 }
            java.lang.String r6 = "\n "
            if (r0 == 0) goto L_0x08de
            int r0 = r37.length()     // Catch:{ all -> 0x08d0 }
            if (r0 != 0) goto L_0x061e
            r0 = 1
            goto L_0x061f
        L_0x061e:
            r0 = 0
        L_0x061f:
            if (r0 == 0) goto L_0x0623
            goto L_0x08de
        L_0x0623:
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x08d0 }
            r1 = 0
            r0[r1] = r37     // Catch:{ all -> 0x08d0 }
            r1 = 2131828169(0x7f111dc9, float:1.9289271E38)
            java.lang.String r0 = r12.getString(r1, r0)     // Catch:{ all -> 0x08d0 }
            java.lang.String r2 = "context.getString(R.stri…_msg_gift_for, aNickname)"
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ all -> 0x08d0 }
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x08d0 }
            r3 = 0
            r2[r3] = r38     // Catch:{ all -> 0x08d0 }
            java.lang.String r4 = r12.getString(r1, r2)     // Catch:{ all -> 0x08d0 }
            java.lang.String r1 = "context.getString(R.stri…g_gift_for, aNicknameElp)"
            gy3.C87412m.m108593f(r4, r1)     // Catch:{ all -> 0x08d0 }
            de3.u r3 = new de3.u     // Catch:{ all -> 0x08d0 }
            di3.d r1 = di3.C86312j.m106911c(r24)     // Catch:{ all -> 0x08d0 }
            ny.h r1 = (p629ny.C76979h) r1     // Catch:{ all -> 0x08d0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x08d0 }
            r2.<init>()     // Catch:{ all -> 0x08d0 }
            r15 = r32
            r2.append(r15)     // Catch:{ all -> 0x08c0 }
            T r5 = r13.f27484d     // Catch:{ all -> 0x08c0 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x08c0 }
            r2.append(r5)     // Catch:{ all -> 0x08c0 }
            r5 = 32
            r2.append(r5)     // Catch:{ all -> 0x08c0 }
            r2.append(r0)     // Catch:{ all -> 0x08c0 }
            r2.append(r8)     // Catch:{ all -> 0x08c0 }
            r2.append(r5)     // Catch:{ all -> 0x08c0 }
            r18 = r14
            r14 = r41
            T r5 = r14.f27484d     // Catch:{ all -> 0x08aa }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x08aa }
            r2.append(r5)     // Catch:{ all -> 0x08aa }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x08aa }
            android.text.SpannableString r1 = r1.mo107057T1(r12, r2)     // Catch:{ all -> 0x08aa }
            r3.<init>((android.text.SpannableString) r1)     // Catch:{ all -> 0x08aa }
            r5 = r46
            r1 = r22
            r2 = r40
            m7833y(r5, r3, r1, r2)     // Catch:{ all -> 0x088d }
            rx3.b0 r19 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x088d }
            ej1.l$e r19 = new ej1.l$e     // Catch:{ all -> 0x088d }
            r22 = r1
            r1 = r19
            r20 = r2
            r2 = r47
            r21 = r11
            r11 = r3
            r3 = r15
            r25 = r4
            r4 = r13
            r28 = 1
            r5 = r0
            r42 = r6
            r6 = r36
            r29 = r36
            r32 = 2131302534(0x7f091886, float:1.8223157E38)
            r7 = r14
            r33 = r11
            r11 = r8
            r8 = r22
            r27 = r9
            r9 = r20
            r43 = r17
            r34 = r20
            r17 = 1
            r10 = r46
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0889 }
            rx3.g r19 = rx3.C36568h.m40985a(r19)     // Catch:{ all -> 0x0889 }
            ej1.l$g r20 = new ej1.l$g     // Catch:{ all -> 0x0889 }
            r1 = r20
            r2 = r47
            r3 = r15
            r4 = r31
            r5 = r0
            r6 = r29
            r7 = r14
            r8 = r22
            r9 = r34
            r10 = r46
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0889 }
            rx3.g r20 = rx3.C36568h.m40985a(r20)     // Catch:{ all -> 0x0889 }
            ej1.l$h r28 = new ej1.l$h     // Catch:{ all -> 0x0889 }
            r1 = r28
            r2 = r47
            r3 = r15
            r4 = r31
            r5 = r25
            r6 = r29
            r7 = r14
            r8 = r22
            r9 = r34
            r10 = r46
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0889 }
            rx3.g r1 = rx3.C36568h.m40985a(r28)     // Catch:{ all -> 0x0889 }
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r48.mo12335B()     // Catch:{ all -> 0x0889 }
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0889 }
            T r3 = r13.f27484d     // Catch:{ all -> 0x0889 }
            r5 = 0
            r4[r5] = r3     // Catch:{ all -> 0x0889 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0889 }
            r3.<init>()     // Catch:{ all -> 0x0889 }
            r3.append(r0)     // Catch:{ all -> 0x0889 }
            r3.append(r11)     // Catch:{ all -> 0x0889 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0889 }
            r4[r17] = r3     // Catch:{ all -> 0x0889 }
            java.lang.String r3 = java.lang.String.valueOf(r27)     // Catch:{ all -> 0x0889 }
            r5 = 2
            r4[r5] = r3     // Catch:{ all -> 0x0889 }
            r10 = 2131827219(0x7f111a13, float:1.9287344E38)
            java.lang.String r3 = r12.getString(r10, r4)     // Catch:{ all -> 0x0889 }
            r9 = 2131302534(0x7f091886, float:1.8223157E38)
            r2.setTag(r9, r3)     // Catch:{ all -> 0x0889 }
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r48.mo12335B()     // Catch:{ all -> 0x0889 }
            r8 = r46
            r3 = r33
            boolean r2 = r8.mo8819r(r3, r2)     // Catch:{ all -> 0x087b }
            if (r2 == 0) goto L_0x07c1
            int r1 = r15.length()     // Catch:{ all -> 0x07b6 }
            T r2 = r13.f27484d     // Catch:{ all -> 0x07b6 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x07b6 }
            int r2 = r2.length()     // Catch:{ all -> 0x07b6 }
            int r1 = r1 + r2
            int r1 = r1 + 1
            int r2 = r0.length()     // Catch:{ all -> 0x07b6 }
            int r1 = r1 + r2
            int r2 = r11.length()     // Catch:{ all -> 0x07b6 }
            int r1 = r1 + r2
            r7 = r21
            r7.f27483d = r1     // Catch:{ all -> 0x07b4 }
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r48.mo12335B()     // Catch:{ all -> 0x07b4 }
            int r2 = r7.f27483d     // Catch:{ all -> 0x07b4 }
            boolean r1 = r8.mo8818q(r3, r1, r2)     // Catch:{ all -> 0x07b4 }
            if (r1 == 0) goto L_0x07ad
            de3.u r3 = new de3.u     // Catch:{ all -> 0x07b4 }
            di3.d r1 = di3.C86312j.m106911c(r24)     // Catch:{ all -> 0x07b4 }
            ny.h r1 = (p629ny.C76979h) r1     // Catch:{ all -> 0x07b4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x07b4 }
            r2.<init>()     // Catch:{ all -> 0x07b4 }
            r2.append(r15)     // Catch:{ all -> 0x07b4 }
            T r4 = r13.f27484d     // Catch:{ all -> 0x07b4 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x07b4 }
            r2.append(r4)     // Catch:{ all -> 0x07b4 }
            r6 = 32
            r2.append(r6)     // Catch:{ all -> 0x07a6 }
            r2.append(r0)     // Catch:{ all -> 0x07a6 }
            r2.append(r11)     // Catch:{ all -> 0x07a6 }
            r0 = r42
            r2.append(r0)     // Catch:{ all -> 0x07a6 }
            T r0 = r14.f27484d     // Catch:{ all -> 0x07a6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x07a6 }
            r2.append(r0)     // Catch:{ all -> 0x07a6 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x07a6 }
            android.text.SpannableString r0 = r1.mo107057T1(r12, r0)     // Catch:{ all -> 0x07a6 }
            r3.<init>((android.text.SpannableString) r0)     // Catch:{ all -> 0x07a6 }
            r4 = r22
            r5 = r34
            m7833y(r8, r3, r4, r5)     // Catch:{ all -> 0x0875 }
            int r0 = r7.f27483d     // Catch:{ all -> 0x0875 }
            int r0 = r0 + 1
            r7.f27483d = r0     // Catch:{ all -> 0x0875 }
            goto L_0x07fc
        L_0x07a6:
            r0 = move-exception
            r4 = r22
            r5 = r34
            goto L_0x0876
        L_0x07ad:
            r4 = r22
            r5 = r34
            r6 = 32
            goto L_0x07fc
        L_0x07b4:
            r0 = move-exception
            goto L_0x07b9
        L_0x07b6:
            r0 = move-exception
            r7 = r21
        L_0x07b9:
            r4 = r22
            r5 = r34
            r6 = 32
            goto L_0x0876
        L_0x07c1:
            r7 = r21
            r4 = r22
            r5 = r34
            r6 = 32
            de3.u r2 = m7831w(r19)     // Catch:{ all -> 0x0875 }
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r48.mo12335B()     // Catch:{ all -> 0x0875 }
            boolean r2 = r8.mo8819r(r2, r3)     // Catch:{ all -> 0x0875 }
            if (r2 == 0) goto L_0x0801
            de3.u r3 = m7831w(r19)     // Catch:{ all -> 0x0875 }
            int r1 = r15.length()     // Catch:{ all -> 0x0875 }
            T r2 = r13.f27484d     // Catch:{ all -> 0x0875 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0875 }
            int r2 = r2.length()     // Catch:{ all -> 0x0875 }
            int r1 = r1 + r2
            int r1 = r1 + 1
            int r0 = r0.length()     // Catch:{ all -> 0x0875 }
            int r1 = r1 + r0
            r2 = r29
            T r0 = r2.f27484d     // Catch:{ all -> 0x0875 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0875 }
            int r0 = r0.length()     // Catch:{ all -> 0x0875 }
            int r1 = r1 + r0
            r7.f27483d = r1     // Catch:{ all -> 0x0875 }
        L_0x07fc:
            r10 = r18
            r9 = r31
            goto L_0x0864
        L_0x0801:
            r2 = r29
            de3.u r3 = m7832x(r20)     // Catch:{ all -> 0x0875 }
            com.tencent.mm.ui.widget.MMNeat7extView r9 = r48.mo12335B()     // Catch:{ all -> 0x0875 }
            boolean r3 = r8.mo8819r(r3, r9)     // Catch:{ all -> 0x0875 }
            if (r3 == 0) goto L_0x083c
            de3.u r1 = m7832x(r20)     // Catch:{ all -> 0x0838 }
            int r3 = r15.length()     // Catch:{ all -> 0x0838 }
            r9 = r31
            T r10 = r9.f27484d     // Catch:{ all -> 0x0871 }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ all -> 0x0871 }
            int r10 = r10.length()     // Catch:{ all -> 0x0871 }
            int r3 = r3 + r10
            int r3 = r3 + 1
            int r0 = r0.length()     // Catch:{ all -> 0x0871 }
            int r3 = r3 + r0
            T r0 = r2.f27484d     // Catch:{ all -> 0x0871 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0871 }
            int r0 = r0.length()     // Catch:{ all -> 0x0871 }
            int r3 = r3 + r0
            r7.f27483d = r3     // Catch:{ all -> 0x0871 }
            r3 = r1
            goto L_0x0862
        L_0x0838:
            r0 = move-exception
            r9 = r31
            goto L_0x0872
        L_0x083c:
            r9 = r31
            de3.u r0 = m7828t(r1)     // Catch:{ all -> 0x0871 }
            int r1 = r15.length()     // Catch:{ all -> 0x0871 }
            T r3 = r9.f27484d     // Catch:{ all -> 0x0871 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x0871 }
            int r3 = r3.length()     // Catch:{ all -> 0x0871 }
            int r1 = r1 + r3
            int r1 = r1 + 1
            int r3 = r25.length()     // Catch:{ all -> 0x0871 }
            int r1 = r1 + r3
            T r2 = r2.f27484d     // Catch:{ all -> 0x0871 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0871 }
            int r2 = r2.length()     // Catch:{ all -> 0x0871 }
            int r1 = r1 + r2
            r7.f27483d = r1     // Catch:{ all -> 0x0871 }
            r3 = r0
        L_0x0862:
            r10 = r18
        L_0x0864:
            r10.f27484d = r3     // Catch:{ all -> 0x0ac2 }
            r2 = r4
            r1 = r9
            r6 = r10
            r4 = 32
            r10 = 2131302534(0x7f091886, float:1.8223157E38)
            r9 = r5
            goto L_0x0a8a
        L_0x0871:
            r0 = move-exception
        L_0x0872:
            r10 = r18
            goto L_0x089f
        L_0x0875:
            r0 = move-exception
        L_0x0876:
            r10 = r18
            r9 = r31
            goto L_0x089f
        L_0x087b:
            r0 = move-exception
        L_0x087c:
            r10 = r18
            r7 = r21
            r4 = r22
            r9 = r31
            r5 = r34
            r6 = 32
            goto L_0x089f
        L_0x0889:
            r0 = move-exception
            r8 = r46
            goto L_0x087c
        L_0x088d:
            r0 = move-exception
            r4 = r1
            r27 = r9
            r7 = r11
            r43 = r17
            r10 = r18
            r9 = r31
            r6 = 32
            r17 = 1
            r11 = r8
            r8 = r5
            r5 = r2
        L_0x089f:
            r2 = r4
            r1 = r9
            r6 = r10
            r4 = 32
            r10 = 2131302534(0x7f091886, float:1.8223157E38)
            r9 = r5
            goto L_0x0afe
        L_0x08aa:
            r0 = move-exception
            r27 = r9
            r7 = r11
            r43 = r17
            r10 = r18
            r4 = r22
            r9 = r31
            r5 = r40
        L_0x08b8:
            r6 = 32
            r17 = 1
            r11 = r8
            r8 = r46
            goto L_0x089f
        L_0x08c0:
            r0 = move-exception
            r27 = r9
            r7 = r11
            r10 = r14
            r43 = r17
            r4 = r22
            r9 = r31
        L_0x08cb:
            r5 = r40
            r14 = r41
            goto L_0x08b8
        L_0x08d0:
            r0 = move-exception
            r27 = r9
            r7 = r11
            r10 = r14
            r43 = r17
            r4 = r22
            r9 = r31
            r15 = r32
            goto L_0x08cb
        L_0x08de:
            r0 = r6
            r27 = r9
            r7 = r11
            r10 = r14
            r43 = r17
            r4 = r22
            r9 = r31
            r15 = r32
            r2 = r36
            r5 = r40
            r14 = r41
            r6 = 32
            r17 = 1
            r11 = r8
            r8 = r46
            de3.u r3 = new de3.u     // Catch:{ all -> 0x0ac2 }
            di3.d r1 = di3.C86312j.m106911c(r24)     // Catch:{ all -> 0x0ac2 }
            ny.h r1 = (p629ny.C76979h) r1     // Catch:{ all -> 0x0ac2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ac2 }
            r6.<init>()     // Catch:{ all -> 0x0ac2 }
            r6.append(r15)     // Catch:{ all -> 0x0ac2 }
            r29 = r2
            T r2 = r13.f27484d     // Catch:{ all -> 0x0ac2 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0ac2 }
            r6.append(r2)     // Catch:{ all -> 0x0ac2 }
            r2 = 32
            r6.append(r2)     // Catch:{ all -> 0x0ac2 }
            r6.append(r11)     // Catch:{ all -> 0x0ac2 }
            r6.append(r2)     // Catch:{ all -> 0x0ac2 }
            T r2 = r14.f27484d     // Catch:{ all -> 0x0ac2 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0ac2 }
            r6.append(r2)     // Catch:{ all -> 0x0ac2 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0ac2 }
            android.text.SpannableString r1 = r1.mo107057T1(r12, r2)     // Catch:{ all -> 0x0ac2 }
            r3.<init>((android.text.SpannableString) r1)     // Catch:{ all -> 0x0ac2 }
            m7833y(r8, r3, r4, r5)     // Catch:{ all -> 0x0ac2 }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0ac2 }
            ej1.l$d r18 = new ej1.l$d     // Catch:{ all -> 0x0ac2 }
            r1 = r18
            r6 = r29
            r19 = 32
            r2 = r47
            r20 = r10
            r10 = r3
            r3 = r15
            r22 = r4
            r4 = r13
            r34 = r5
            r5 = r6
            r6 = r14
            r44 = r7
            r7 = r22
            r8 = r34
            r31 = r9
            r19 = r10
            r10 = 2131302534(0x7f091886, float:1.8223157E38)
            r9 = r46
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0abe }
            rx3.g r18 = rx3.C36568h.m40985a(r18)     // Catch:{ all -> 0x0abe }
            ej1.l$f r21 = new ej1.l$f     // Catch:{ all -> 0x0abe }
            r1 = r21
            r2 = r47
            r3 = r15
            r4 = r31
            r5 = r29
            r6 = r14
            r7 = r22
            r8 = r34
            r9 = r46
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0abe }
            rx3.g r1 = rx3.C36568h.m40985a(r21)     // Catch:{ all -> 0x0abe }
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r48.mo12335B()     // Catch:{ all -> 0x0abe }
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0abe }
            T r3 = r13.f27484d     // Catch:{ all -> 0x0abe }
            r5 = 0
            r4[r5] = r3     // Catch:{ all -> 0x0abe }
            r4[r17] = r11     // Catch:{ all -> 0x0abe }
            java.lang.String r3 = java.lang.String.valueOf(r27)     // Catch:{ all -> 0x0abe }
            r5 = 2
            r4[r5] = r3     // Catch:{ all -> 0x0abe }
            r3 = 2131827219(0x7f111a13, float:1.9287344E38)
            java.lang.String r4 = r12.getString(r3, r4)     // Catch:{ all -> 0x0abe }
            r2.setTag(r10, r4)     // Catch:{ all -> 0x0abe }
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r48.mo12335B()     // Catch:{ all -> 0x0abe }
            r8 = r46
            r3 = r19
            boolean r2 = r8.mo8819r(r3, r2)     // Catch:{ all -> 0x0ab0 }
            if (r2 == 0) goto L_0x0a29
            int r1 = r15.length()     // Catch:{ all -> 0x0a21 }
            T r2 = r13.f27484d     // Catch:{ all -> 0x0a21 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0a21 }
            int r2 = r2.length()     // Catch:{ all -> 0x0a21 }
            int r1 = r1 + r2
            int r1 = r1 + 1
            int r2 = r11.length()     // Catch:{ all -> 0x0a21 }
            int r1 = r1 + r2
            r7 = r44
            r7.f27483d = r1     // Catch:{ all -> 0x0a18 }
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r48.mo12335B()     // Catch:{ all -> 0x0a18 }
            int r2 = r7.f27483d     // Catch:{ all -> 0x0a18 }
            boolean r1 = r8.mo8818q(r3, r1, r2)     // Catch:{ all -> 0x0a18 }
            if (r1 == 0) goto L_0x0a11
            de3.u r3 = new de3.u     // Catch:{ all -> 0x0a18 }
            di3.d r1 = di3.C86312j.m106911c(r24)     // Catch:{ all -> 0x0a18 }
            ny.h r1 = (p629ny.C76979h) r1     // Catch:{ all -> 0x0a18 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a18 }
            r2.<init>()     // Catch:{ all -> 0x0a18 }
            r2.append(r15)     // Catch:{ all -> 0x0a18 }
            T r4 = r13.f27484d     // Catch:{ all -> 0x0a18 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0a18 }
            r2.append(r4)     // Catch:{ all -> 0x0a18 }
            r4 = 32
            r2.append(r4)     // Catch:{ all -> 0x0a0a }
            r2.append(r11)     // Catch:{ all -> 0x0a0a }
            r2.append(r0)     // Catch:{ all -> 0x0a0a }
            T r0 = r14.f27484d     // Catch:{ all -> 0x0a0a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0a0a }
            r2.append(r0)     // Catch:{ all -> 0x0a0a }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0a0a }
            android.text.SpannableString r0 = r1.mo107057T1(r12, r0)     // Catch:{ all -> 0x0a0a }
            r3.<init>((android.text.SpannableString) r0)     // Catch:{ all -> 0x0a0a }
            r2 = r22
            r9 = r34
            m7833y(r8, r3, r2, r9)     // Catch:{ all -> 0x0aaa }
            int r0 = r7.f27483d     // Catch:{ all -> 0x0aaa }
            int r0 = r0 + 1
            r7.f27483d = r0     // Catch:{ all -> 0x0aaa }
            goto L_0x0a5f
        L_0x0a0a:
            r0 = move-exception
            r2 = r22
            r9 = r34
            goto L_0x0aab
        L_0x0a11:
            r2 = r22
            r9 = r34
            r4 = 32
            goto L_0x0a5f
        L_0x0a18:
            r0 = move-exception
            r2 = r22
            r9 = r34
        L_0x0a1d:
            r4 = 32
            goto L_0x0aab
        L_0x0a21:
            r0 = move-exception
            r2 = r22
            r9 = r34
            r7 = r44
            goto L_0x0a1d
        L_0x0a29:
            r2 = r22
            r9 = r34
            r7 = r44
            r4 = 32
            de3.u r0 = m7829u(r18)     // Catch:{ all -> 0x0aaa }
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r48.mo12335B()     // Catch:{ all -> 0x0aaa }
            boolean r0 = r8.mo8819r(r0, r3)     // Catch:{ all -> 0x0aaa }
            if (r0 == 0) goto L_0x0a64
            de3.u r3 = m7829u(r18)     // Catch:{ all -> 0x0aaa }
            int r0 = r15.length()     // Catch:{ all -> 0x0aaa }
            T r1 = r13.f27484d     // Catch:{ all -> 0x0aaa }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0aaa }
            int r1 = r1.length()     // Catch:{ all -> 0x0aaa }
            int r0 = r0 + r1
            int r0 = r0 + 1
            r5 = r29
            T r1 = r5.f27484d     // Catch:{ all -> 0x0aaa }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0aaa }
            int r1 = r1.length()     // Catch:{ all -> 0x0aaa }
            int r0 = r0 + r1
            r7.f27483d = r0     // Catch:{ all -> 0x0aaa }
        L_0x0a5f:
            r6 = r20
            r1 = r31
            goto L_0x0a88
        L_0x0a64:
            r5 = r29
            de3.u r3 = m7830v(r1)     // Catch:{ all -> 0x0aaa }
            int r0 = r15.length()     // Catch:{ all -> 0x0aaa }
            r1 = r31
            T r6 = r1.f27484d     // Catch:{ all -> 0x0aa5 }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x0aa5 }
            int r6 = r6.length()     // Catch:{ all -> 0x0aa5 }
            int r0 = r0 + r6
            int r0 = r0 + 1
            T r5 = r5.f27484d     // Catch:{ all -> 0x0aa5 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0aa5 }
            int r5 = r5.length()     // Catch:{ all -> 0x0aa5 }
            int r0 = r0 + r5
            r7.f27483d = r0     // Catch:{ all -> 0x0aa5 }
            r6 = r20
        L_0x0a88:
            r6.f27484d = r3     // Catch:{ all -> 0x0aa2 }
        L_0x0a8a:
            if (r26 != 0) goto L_0x0a96
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r48.mo12335B()     // Catch:{ all -> 0x0aa2 }
            r3 = 2
            r0.setMaxLines(r3)     // Catch:{ all -> 0x0aa2 }
            goto L_0x0bb0
        L_0x0a96:
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r48.mo12335B()     // Catch:{ all -> 0x0aa2 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0.setMaxLines(r3)     // Catch:{ all -> 0x0aa2 }
            goto L_0x0bb0
        L_0x0aa2:
            r0 = move-exception
            goto L_0x0afe
        L_0x0aa5:
            r0 = move-exception
            r6 = r20
            goto L_0x0afe
        L_0x0aaa:
            r0 = move-exception
        L_0x0aab:
            r6 = r20
            r1 = r31
            goto L_0x0afe
        L_0x0ab0:
            r0 = move-exception
        L_0x0ab1:
            r6 = r20
            r2 = r22
            r1 = r31
            r9 = r34
            r7 = r44
            r4 = 32
            goto L_0x0afe
        L_0x0abe:
            r0 = move-exception
            r8 = r46
            goto L_0x0ab1
        L_0x0ac2:
            r0 = move-exception
            goto L_0x089f
        L_0x0ac5:
            r0 = move-exception
        L_0x0ac6:
            r27 = r9
            r7 = r11
            r6 = r14
            r43 = r17
            r2 = r22
            r1 = r31
            r15 = r32
            r9 = r40
            r14 = r41
            r4 = 32
            r10 = 2131302534(0x7f091886, float:1.8223157E38)
            r17 = 1
            r11 = r8
            r8 = r46
            goto L_0x0afe
        L_0x0ae1:
            r0 = move-exception
        L_0x0ae2:
            r7 = r3
            r27 = r9
            r24 = r14
            r1 = r15
            r43 = r17
            r14 = r18
            r2 = r22
            r9 = r34
            r10 = 2131302534(0x7f091886, float:1.8223157E38)
        L_0x0af3:
            r17 = 1
            r15 = r13
            r13 = r4
            r4 = 32
        L_0x0af9:
            r45 = r11
            r11 = r8
            r8 = r45
        L_0x0afe:
            de3.u r3 = new de3.u
            di3.d r5 = di3.C86312j.m106911c(r24)
            ny.h r5 = (p629ny.C76979h) r5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r15)
            r29 = r13
            T r13 = r1.f27484d
            r10.append(r13)
            r10.append(r4)
            r10.append(r11)
            r10.append(r4)
            T r4 = r14.f27484d
            java.lang.String r4 = (java.lang.String) r4
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            android.text.SpannableString r4 = r5.mo107057T1(r12, r4)
            r3.<init>((android.text.SpannableString) r4)
            r6.f27484d = r3
            m7833y(r8, r3, r2, r9)
            int r2 = r15.length()
            T r3 = r1.f27484d
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            int r2 = r2 + r3
            int r3 = r11.length()
            int r2 = r2 + r3
            int r2 = r2 + 1
            r7.f27483d = r2
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r48.mo12335B()
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            T r1 = r1.f27484d
            r4 = 0
            r3[r4] = r1
            r3[r17] = r11
            java.lang.String r1 = java.lang.String.valueOf(r27)
            r5 = 2
            r3[r5] = r1
            r1 = 2131827219(0x7f111a13, float:1.9287344E38)
            java.lang.String r1 = r12.getString(r1, r3)
            r3 = 2131302534(0x7f091886, float:1.8223157E38)
            r2.setTag(r3, r1)
            java.lang.String r1 = r8.f26057j
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r3 = r35
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r3, r2)
            java.lang.String r0 = r8.f26057j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onBindComboLiveRewardMsg exception for:"
            r1.append(r2)
            r2 = r29
            T r2 = r2.f27484d
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            r3 = r37
            r1.append(r3)
            r1.append(r2)
            r2 = r43
            r1.append(r2)
            java.lang.String r2 = ", fromUsername: "
            r1.append(r2)
            java.lang.String r2 = r49.mo571e()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x0bb0:
            r2 = r30
            if (r2 == 0) goto L_0x0beb
            bl3.r r0 = bl3.C39818r.f106831a
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            bl3.r$a r0 = r0.mo62446e(r1)
            java.lang.Class<pl1.s0> r1 = pl1.C11990s0.class
            bl3.c r0 = r0.mo62447c(r1)
            pl1.s0 r0 = (pl1.C11990s0) r0
            k60.d r0 = r0.mo11871f2()
            pl1.f r1 = new pl1.f
            r3 = 2
            r4 = 0
            r1.<init>(r2, r4, r3, r4)
            l60.b r0 = r0.mo85955a(r1)
            ej1.l$c r9 = new ej1.l$c
            r1 = r9
            r2 = r48
            r3 = r50
            r4 = r46
            r5 = r47
            r10 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.mo85952b(r9)
            r0.mo85951a()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0bec
        L_0x0beb:
            r10 = r6
        L_0x0bec:
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r48.mo12335B()
            android.view.ViewParent r0 = r0.getParent()
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.RelativeLayout"
            gy3.C87412m.m108592e(r0, r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            int r1 = r0.getPaddingTop()
            int r2 = r0.getPaddingRight()
            int r3 = r0.getPaddingBottom()
            r4 = 0
            r0.setPadding(r4, r1, r2, r3)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r48.mo12335B()
            T r1 = r10.f27484d
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.mo104279b(r1)
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r48.mo12335B()
            int r1 = r46.mo14627h()
            float r1 = (float) r1
            r0.setTextSize(r1)
            android.view.View r0 = r48.mo12336z()
            android.content.res.Resources r1 = r47.getResources()
            r2 = 2131232561(0x7f080731, float:1.8081235E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setBackground(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ej1.C7692l.mo8820s(android.content.Context, qk1.i0$a, cj1.o5, te3.tt0):void");
    }

    /* renamed from: z */
    public final void mo8821z(String str, String str2, int i) {
        FinderLiveService.f159376d.getClass();
        String str3 = "";
        if (FinderLiveService.f159380h) {
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5 j5Var = (C8777j5) c;
            C0073g0 g0Var = C0073g0.LIVING_SING_SONG;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
            if (str != null) {
                str3 = str;
            }
            jSONObject.put("music_name", str3);
            C13598b0 b0Var = C13598b0.f38549a;
            C8777j5.C8778a.m8605f(j5Var, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
            return;
        }
        C7335d c2 = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w wVar = (C54116w) c2;
        C54067f0.C54076o0 o0Var = C54067f0.C54076o0.LIVING_SING_SONG;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
        if (str != null) {
            str3 = str;
        }
        jSONObject2.put("music_name", str3);
        jSONObject2.put("gift_id", str2);
        jSONObject2.put("gift_count", String.valueOf(i));
        C13598b0 b0Var2 = C13598b0.f38549a;
        C54116w.Ex0(wVar, o0Var, jSONObject2.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }
}
