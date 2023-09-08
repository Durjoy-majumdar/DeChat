package ve1;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import bl3.C39818r;
import c00.C0405n;
import cm1.C55033u;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileTimeLineUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import dp1.C58411u;
import dp1.C58417y0;
import e00.C45513i0;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.Map;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import org.json.JSONObject;
import p206nj.C117627q;
import p255vr.C65873e;
import p629ny.C76979h;
import pf1.C62262d0;
import rs1.C13442s8;
import rx3.C13598b0;
import sq1.C64151e;
import te3.C49712hj1;
import te3.C51833wh0;
import te3.C64837xq2;
import tf0.C64916p1;
import up1.C37521f;
import z04.C112551y;

/* renamed from: ve1.i */
public final class C65604i {

    /* renamed from: a */
    public static final C65604i f188772a = new C65604i();

    /* renamed from: b */
    public static String f188773b = "";

    /* renamed from: ve1.i$a */
    public static final class C52816a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ View f147555d;

        /* renamed from: e */
        public final /* synthetic */ C55033u f147556e;

        /* renamed from: f */
        public final /* synthetic */ String f147557f;

        /* renamed from: g */
        public final /* synthetic */ int f147558g;

        public C52816a(View view, C55033u uVar, String str, int i) {
            this.f147555d = view;
            this.f147556e = uVar;
            this.f147557f = str;
            this.f147558g = i;
        }

        public void onAnimationCancel(Animator animator) {
            View view = this.f147555d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvertUtil$blinkView$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderCommentConvertUtil$blinkView$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f147556e.f154502q = false;
            String str = this.f147557f;
            Log.m105924i(str, "blinkView cancel, gone " + this.f147558g);
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f147555d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvertUtil$blinkView$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderCommentConvertUtil$blinkView$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f147556e.f154502q = false;
            String str = this.f147557f;
            Log.m105924i(str, "blinkView end, gone " + this.f147558g);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            String str = this.f147557f;
            Log.m105924i(str, "blinkView start, gone " + this.f147558g);
        }
    }

    /* renamed from: ve1.i$b */
    public static final class C65605b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f188774d;

        /* renamed from: e */
        public final /* synthetic */ Context f188775e;

        /* renamed from: f */
        public final /* synthetic */ TextView f188776f;

        /* renamed from: g */
        public final /* synthetic */ String f188777g;

        /* renamed from: h */
        public final /* synthetic */ View f188778h;

        /* renamed from: i */
        public final /* synthetic */ TextView f188779i;

        /* renamed from: j */
        public final /* synthetic */ TextView f188780j;

        /* renamed from: n */
        public final /* synthetic */ TextView f188781n;

        /* renamed from: o */
        public final /* synthetic */ TextView f188782o;

        public C65605b(View view, Context context, TextView textView, String str, View view2, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
            this.f188774d = view;
            this.f188775e = context;
            this.f188776f = textView;
            this.f188777g = str;
            this.f188778h = view2;
            this.f188779i = textView2;
            this.f188780j = textView3;
            this.f188781n = textView4;
            this.f188782o = textView5;
        }

        public final void run() {
            int i;
            if (this.f188774d.getWidth() > 0) {
                int width = this.f188774d.getWidth() - C76577a.m92157h(this.f188775e, C0966R.dimen.f3763dc);
                float measureText = this.f188776f.getPaint().measureText(this.f188777g) + ((float) C76577a.m92157h(this.f188775e, C0966R.dimen.f3766df));
                View view = this.f188778h;
                int i2 = 0;
                if (view != null && view.getVisibility() == 0) {
                    int width2 = this.f188778h.getWidth();
                    TextView textView = this.f188779i;
                    if (textView == null || textView.getVisibility() != 0) {
                        i2 = width2;
                    } else {
                        i2 = width2;
                        i = this.f188779i.getWidth() + C76577a.m92157h(this.f188775e, C0966R.dimen.f3703bv);
                        C65604i iVar = C65604i.f188772a;
                        this.f188782o.setMaxWidth((int) ((((float) width) - (((((float) ((C65604i.m77288a(iVar, this.f188780j) + C76577a.m92157h(this.f188775e, C0966R.dimen.f3703bv)) + (C65604i.m77288a(iVar, this.f188781n) + C76577a.m92157h(this.f188775e, C0966R.dimen.f3703bv)))) + measureText) + ((float) i2)) + ((float) i))) - ((float) C76577a.m92157h(this.f188775e, C0966R.dimen.f3766df))));
                    }
                }
                i = 0;
                C65604i iVar2 = C65604i.f188772a;
                this.f188782o.setMaxWidth((int) ((((float) width) - (((((float) ((C65604i.m77288a(iVar2, this.f188780j) + C76577a.m92157h(this.f188775e, C0966R.dimen.f3703bv)) + (C65604i.m77288a(iVar2, this.f188781n) + C76577a.m92157h(this.f188775e, C0966R.dimen.f3703bv)))) + measureText) + ((float) i2)) + ((float) i))) - ((float) C76577a.m92157h(this.f188775e, C0966R.dimen.f3766df))));
            }
        }
    }

    /* renamed from: a */
    public static final int m77288a(C65604i iVar, TextView textView) {
        iVar.getClass();
        if (textView.getVisibility() != 0) {
            return 0;
        }
        return ((int) textView.getPaint().measureText(textView.getText().toString())) + 1;
    }

    /* renamed from: b */
    public final void mo89676b(View view, C55033u uVar, int i, String str) {
        C87412m.m108594g(view, "maskView");
        C87412m.m108594g(uVar, "item");
        C87412m.m108594g(str, "tag");
        Log.m105924i(str, "blinkView, " + i + ", blink:" + uVar.f154499n + ", hasBlink:" + uVar.f154501p + " isBlinking:" + uVar.f154502q);
        if (!uVar.f154502q) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvertUtil", "blinkView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderCommentConvertUtil", "blinkView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (uVar.f154499n && !uVar.f154501p && !uVar.f154502q) {
            Log.m105924i(str, "begin blink animation " + i + ", duration:" + uVar.f154500o);
            uVar.f154501p = true;
            uVar.f154502q = true;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvertUtil", "blinkView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderCommentConvertUtil", "blinkView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderCommentConvertUtil", "blinkView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderCommentConvertUtil", "blinkView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.animate().alpha(0.0f).setDuration(1000).setStartDelay(uVar.f154500o).setListener(new C52816a(view, uVar, str, i)).start();
        }
    }

    /* renamed from: c */
    public final int mo89677c(Context context, int i) {
        C87412m.m108594g(context, "context");
        return C76577a.m92151b(context, (i * 15) + 1);
    }

    /* renamed from: d */
    public final String mo89678d(TextPaint textPaint, String str, int i, int i2) {
        C87412m.m108594g(textPaint, "tp");
        if (str == null || Util.isNullOrNil(str)) {
            return str == null ? "" : str;
        }
        try {
            return mo89685k(textPaint, str, i, i2);
        } catch (Throwable th) {
            Log.printErrStackTrace("Finder.FinderCommentConvertUtil", th, "ellipseText: " + str, new Object[0]);
            return str;
        }
    }

    /* renamed from: e */
    public final CharSequence mo89679e(TextView textView, CharSequence charSequence, int i) {
        int i2 = i;
        C87412m.m108594g(textView, "tv");
        CharSequence charSequence2 = charSequence;
        C87412m.m108594g(charSequence2, "spanText");
        Context context = textView.getContext();
        C87412m.m108593f(context, "tv.context");
        int c = mo89677c(context, i2);
        Context context2 = textView.getContext();
        C87412m.m108593f(context2, "tv.context");
        int c2 = mo89677c(context2, i2 + 1);
        CharSequence charSequence3 = charSequence;
        StaticLayout staticLayout = new StaticLayout(charSequence3, 0, charSequence.length(), textView.getPaint(), c, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (new StaticLayout(charSequence3, 0, charSequence.length(), textView.getPaint(), c2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
            return charSequence2;
        }
        int lineEnd = staticLayout.getLineEnd(0);
        Context context3 = textView.getContext();
        StringBuilder sb = new StringBuilder();
        String substring = charSequence.toString().substring(0, lineEnd);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append("...");
        SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context3, sb.toString());
        C87412m.m108593f(T1, "{\n            val ellips…Start) + \"...\")\n        }");
        return T1;
    }

    /* renamed from: f */
    public final void mo89680f(Context context, String str, int i, C55033u uVar, FinderItem finderItem, String str2) {
        Context context2 = context;
        String str3 = str;
        int i2 = i;
        C55033u uVar2 = uVar;
        String str4 = str2;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str3, "bizUsername");
        C87412m.m108594g(uVar2, "item");
        C87412m.m108594g(finderItem, "currentFeed");
        C87412m.m108594g(str4, "bypassData");
        if (i2 == 120) {
            Log.m105924i("Finder.FinderCommentConvertUtil", "jumpBizProfile: hit SOURCE_PROFILE_TIMELINE, avatar can't click.");
            ((Activity) context2).finish();
            return;
        }
        Intent intent = new Intent();
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        long j = uVar2.f154492d.field_feedId;
        String str5 = "Finder.FinderCommentConvertUtil";
        String str6 = str4;
        C13442s8.C13443a.m12791e(aVar, context, intent, j, (String) null, 0, 5, false, 0, 192, (Object) null);
        Intent intent2 = intent;
        intent2.putExtra("Contact_User", str3);
        intent2.putExtra("Contact_Scene", JsApiCheckIsSupportFaceDetect.CTRL_INDEX);
        boolean z = true;
        intent2.putExtra("biz_profile_enter_from_finder", true);
        intent2.putExtra("force_get_contact", true);
        intent2.putExtra("key_use_new_contact_profile", true);
        intent2.putExtra("biz_profile_tab_type", 1);
        String str7 = finderItem.getFeedObject().sessionBuffer;
        if (!(str7 == null || str7.length() == 0)) {
            z = false;
        }
        String Cu = z ? ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(uVar.getItemId(), i2) : finderItem.getFeedObject().sessionBuffer;
        try {
            if (!Util.isNullOrNil(str2)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("commentAdInfo", str6);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
                intent2.putExtra("Contact_Finder_Buffer", C112551y.m153814n(jSONObject2, ",", ";", false));
            }
        } catch (Exception e) {
            Log.m105920e(str5, "jumpBizProfile build finder buffer failed, error=" + e);
        }
        intent2.putExtra("Contact_Scene_Note", Cu);
        C88144b.m109791i(context2, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
    }

    /* renamed from: g */
    public final void mo89681g(Context context, String str, int i, C64151e eVar) {
        Context context2 = context;
        String str2 = str;
        C64151e eVar2 = eVar;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str2, "bizUsername");
        C87412m.m108594g(eVar2, "item");
        if (i == 120) {
            Log.m105924i("Finder.FinderCommentConvertUtil", "jumpBizProfile: hit SOURCE_PROFILE_TIMELINE, avatar can't click.");
            ((Activity) context2).finish();
            return;
        }
        Intent intent = new Intent();
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, context, intent, eVar2.f181868d.field_feedId, (String) null, 0, 5, false, 0, 192, (Object) null);
        intent.putExtra("Contact_User", str2);
        intent.putExtra("Contact_Scene", JsApiCheckIsSupportFaceDetect.CTRL_INDEX);
        intent.putExtra("biz_profile_enter_from_finder", true);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("biz_profile_tab_type", 1);
        C88144b.m109791i(context2, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
    }

    /* renamed from: h */
    public final void mo89682h(Context context, int i, C51833wh0 wh02) {
        C87412m.m108594g(context, "context");
        if (wh02 != null) {
            C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
            C58411u.f167343b = f != null ? f.f38098n : null;
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3();
            String str = wh02.f144053h;
            if (str == null) {
                str = "";
            }
            y0Var.Jy0(q3, true, i, str);
            C7335d c = C86312j.m106911c(C64916p1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            C64837xq2 xq22 = new C64837xq2();
            xq22.f186379e = wh02.f144051f;
            xq22.f186382h = 1;
            C13598b0 b0Var = C13598b0.f38549a;
            C64916p1.C64917a.m76439f((C64916p1) c, context, xq22, (C86299o) null, (C60905o) null, 8, (Object) null);
        }
    }

    /* renamed from: i */
    public final void mo89683i(String str, C55033u uVar, Context context, int i, String str2) {
        String str3 = str;
        C55033u uVar2 = uVar;
        Context context2 = context;
        String str4 = str2;
        C87412m.m108594g(str3, "username");
        C87412m.m108594g(uVar2, "item");
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str4, "bypassData");
        if (Util.isNullOrNil(str) || !Util.isEqual(f188773b, str3) || !(context2 instanceof FinderProfileTimeLineUI)) {
            Intent intent = new Intent();
            intent.putExtra("finder_username", str3);
            intent.putExtra("KEY_FROM_TIMELINE", true);
            intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
            C13442s8.C13443a.m12791e(C13442s8.f38060Q0, context, intent, uVar2.f154492d.field_feedId, (String) null, 0, 5, false, 0, 192, (Object) null);
            try {
                if (!Util.isNullOrNil(str2)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("commentAdInfo", str4);
                    String jSONObject2 = jSONObject.toString();
                    C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
                    intent.putExtra("key_extra_info", C112551y.m153814n(jSONObject2, ",", ";", false));
                }
            } catch (Exception e) {
                Log.m105920e("Finder.FinderCommentConvertUtil", "jumpProfile build finder buffer failed, error=" + e);
            }
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context2, intent);
            ((C58417y0) C86312j.m106911c(C58417y0.class)).yx0(5, uVar2.f154492d.field_feedId, i, 1, str);
            return;
        }
        ((FinderProfileTimeLineUI) context2).finish();
    }

    /* renamed from: j */
    public final void mo89684j(String str, C64151e eVar, Context context, int i) {
        String str2 = str;
        C64151e eVar2 = eVar;
        Context context2 = context;
        C87412m.m108594g(str2, "username");
        C87412m.m108594g(eVar2, "item");
        C87412m.m108594g(context2, "context");
        if (Util.isNullOrNil(str) || !Util.isEqual(f188773b, str2) || !(context2 instanceof FinderProfileTimeLineUI)) {
            Intent intent = new Intent();
            intent.putExtra("finder_username", str2);
            intent.putExtra("KEY_FROM_TIMELINE", true);
            intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
            C13442s8.C13443a.m12791e(C13442s8.f38060Q0, context, intent, eVar2.f181868d.field_feedId, (String) null, 0, 5, false, 0, 192, (Object) null);
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context2, intent);
            ((C58417y0) C86312j.m106911c(C58417y0.class)).yx0(5, eVar2.f181868d.field_feedId, i, 1, str);
            return;
        }
        ((FinderProfileTimeLineUI) context2).finish();
    }

    /* renamed from: k */
    public final String mo89685k(TextPaint textPaint, String str, int i, int i2) {
        String str2 = str;
        SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), str2);
        SpannableString spannableString = T1;
        TextPaint textPaint2 = textPaint;
        StaticLayout staticLayout = new StaticLayout(spannableString, 0, T1.length(), textPaint2, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (new StaticLayout(spannableString, 0, T1.length(), textPaint2, i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
            return str2;
        }
        int lineEnd = staticLayout.getLineEnd(0);
        StringBuilder sb = new StringBuilder();
        String substring = str2.substring(0, lineEnd);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append("...");
        return sb.toString();
    }

    /* renamed from: l */
    public final void mo89686l(C51833wh0 wh02) {
        C87412m.m108594g(wh02, "keywordInfo");
        String str = wh02.f144050e;
        String str2 = wh02.f144053h;
        if (str != null && str2 != null) {
            C62262d0.f176978a.getClass();
            if (!C62262d0.f176981d.containsKey(SearchIntents.EXTRA_QUERY) || !C87412m.m108589b(C62262d0.f176981d.get(SearchIntents.EXTRA_QUERY), str)) {
                C0405n nVar = (C0405n) C86312j.m106911c(C0405n.class);
                Map<String, String> hn = nVar.mo280hn(1001, false, 14);
                C87412m.m108593f(hn, "apiService.genFTSParams(…FINDER_COMMENT_HIGHLIGHT)");
                C62262d0.f176981d = hn;
                long vk02 = ((C65873e) C86312j.m106911c(C65873e.class)).vk0(123);
                C62262d0.f176981d.put("sessionId", String.valueOf(vk02));
                C62262d0.f176981d.put("subSessionId", String.valueOf(vk02));
                Map<String, String> map = C62262d0.f176981d;
                String a = C117627q.m165908a(Util.nullAsNil(str));
                C87412m.m108593f(a, "encode(Util.nullAsNil(it))");
                map.put(SearchIntents.EXTRA_QUERY, a);
                Map<String, String> map2 = C62262d0.f176981d;
                String a2 = C117627q.m165908a(Util.nullAsNil(str2));
                C87412m.m108593f(a2, "encode(Util.nullAsNil(referer))");
                map2.put("referer", a2);
                String Vw = nVar.mo277Vw(C62262d0.f176981d);
                Log.m105918d("Finder.JumperUtils", "preload search url:" + Vw);
                ((C45513i0) C86312j.m106911c(C45513i0.class)).mo70778E3(Vw, true);
            }
        }
    }

    /* renamed from: m */
    public final void mo89687m(TextView textView, CharSequence charSequence) {
        C87412m.m108594g(textView, "tv");
        C87412m.m108594g(charSequence, "spanText");
        textView.setText(mo89679e(textView, charSequence, C37521f.f99374d.mo61150D()));
    }

    /* renamed from: n */
    public final void mo89688n(Context context, View view, TextView textView, TextView textView2, View view2, TextView textView3, TextView textView4, TextView textView5, CharSequence charSequence, String str) {
        View view3 = view;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "feedCommentLayout");
        C87412m.m108594g(textView, "nickNameTv");
        TextView textView6 = textView2;
        C87412m.m108594g(textView6, "commentTime");
        TextView textView7 = textView4;
        C87412m.m108594g(textView7, "ownerTv");
        TextView textView8 = textView5;
        C87412m.m108594g(textView8, "friendTv");
        C87412m.m108594g(charSequence, "nickNameCharsequence");
        String str2 = str;
        C87412m.m108594g(str2, "commentTimeText");
        view.post(new C65605b(view, context, textView6, str2, view2, textView3, textView7, textView8, textView));
    }
}
