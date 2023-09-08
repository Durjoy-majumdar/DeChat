package pf2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.xweb.util.FrequentLimiter;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C60193p4;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kf2.C46720a;
import kf2.C46721b;
import nf2.C47240a;
import rx3.C13598b0;
import sx3.C36907w;
import sx3.C64197v;
import te3.C49699hg;
import te3.C50117ke;
import te3.C50249le;
import z04.C112551y;

/* renamed from: pf2.f */
public final class C47478f {

    /* renamed from: a */
    public static final C47478f f127353a = new C47478f();

    /* renamed from: pf2.f$a */
    public static final class C47479a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C47240a f127354d;

        /* renamed from: e */
        public final /* synthetic */ C49699hg f127355e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f127356f;

        public C47479a(C47240a aVar, C49699hg hgVar, C32226l<? super Boolean, C13598b0> lVar) {
            this.f127354d = aVar;
            this.f127355e = hgVar;
            this.f127356f = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil$initFeaturedBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f127354d.f126816r = true;
            this.f127355e.f134609n = 2;
            C46721b bVar = new C46721b();
            bVar.f125775a = 1903;
            bVar.f125776b = true;
            C46720a aVar = C46720a.f125771a;
            Map<Integer, C46721b> map = C46720a.f125773c;
            ((HashMap) map).remove(1901);
            ((HashMap) map).remove(1902);
            aVar.mo71961a(bVar);
            Log.m105924i("FeatureMsgUtil", "user click feature tips to expand");
            this.f127356f.invoke(Boolean.TRUE);
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil$initFeaturedBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: pf2.f$b */
    public static final class C47480b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C50249le f127357d;

        /* renamed from: e */
        public final /* synthetic */ Context f127358e;

        /* renamed from: f */
        public final /* synthetic */ C47240a f127359f;

        /* renamed from: g */
        public final /* synthetic */ C49699hg f127360g;

        /* renamed from: h */
        public final /* synthetic */ C50117ke f127361h;

        /* renamed from: i */
        public final /* synthetic */ int f127362i;

        public C47480b(C50249le leVar, Context context, C47240a aVar, C49699hg hgVar, C50117ke keVar, int i) {
            this.f127357d = leVar;
            this.f127358e = context;
            this.f127359f = aVar;
            this.f127360g = hgVar;
            this.f127361h = keVar;
            this.f127362i = i;
        }

        public final void onClick(View view) {
            int i;
            Intent intent;
            Map<String, String> parseXml;
            Class cls = C45696d.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil$initJumpLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105925i("FeatureMsgUtil", "onClick jump to url:%s", this.f127357d.f137340h);
            if (!Util.isNullOrNil(this.f127357d.f137330N) && (parseXml = XmlParser.parseXml(this.f127357d.f137330N, "finder_feed", (String) null)) != null) {
                if (((C60193p4) C86312j.m106911c(C60193p4.class)).mo78731f7(this.f127358e, "", parseXml, ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(5, 2, 25, (Intent) null))) {
                    Log.m105924i("FeatureMsgUtil", "profile open finder success!");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil$initJumpLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            Context context = this.f127358e;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            int i2 = -1;
            if (!(activity == null || (intent = activity.getIntent()) == null)) {
                i2 = intent.getIntExtra("KOpenArticleSceneFromScene", -1);
            }
            Intent intent2 = new Intent();
            String str = this.f127357d.f137340h;
            int i3 = this.f127359f.f126809h ? 228 : i2;
            C49699hg hgVar = this.f127360g;
            if (hgVar == null || hgVar.f134609n == 0) {
                i = 126;
            } else {
                C46721b bVar = new C46721b();
                bVar.f125775a = 1904;
                bVar.f125776b = false;
                C46720a.f125771a.mo71961a(bVar);
                i = 231;
            }
            String str2 = "KOpenArticleSceneFromScene";
            String c = C92721n.m116875c(str, i, i3, (int) (System.currentTimeMillis() / ((long) 1000)), (C19623o0) null, (String) null, -1);
            intent2.putExtra("rawUrl", c);
            intent2.putExtra("useJs", true);
            intent2.putExtra("vertical_scroll", true);
            intent2.putExtra("geta8key_scene", 3);
            intent2.putExtra("geta8key_username", this.f127359f.f126807f.getUsername());
            intent2.putExtra("webpageTitle", this.f127357d.f137336d);
            String str3 = this.f127357d.f137343n;
            intent2.putExtra("thumbUrl", str3 == null || C112551y.m153811k(str3) ? this.f127357d.f137342j : this.f127357d.f137343n);
            intent2.putExtra("prePublishId", "brand_profile");
            intent2.putExtra("KPublisherId", "brand_profile");
            intent2.putExtra("preChatTYPE", intent2.getIntExtra("preChatTYPE", 0));
            int intExtra = this.f127359f.f126809h ? 228 : intent2.getIntExtra(str2, 10000);
            if (!((C45696d) C86709a0.m107533q(cls)).mo70957E5(6) || !((C45696d) C86709a0.m107533q(cls)).Ms0(this.f127358e, c, this.f127357d.f137345p, false, 126, intExtra, intent2)) {
                C88144b.m109791i(this.f127358e, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
            } else {
                Log.m105924i("FeatureMsgUtil", "jump to TmplWebview");
            }
            String username = this.f127359f.f126807f.getUsername();
            C87412m.m108593f(username, "adapter.contact.username");
            C47240a aVar = this.f127359f;
            long j = aVar.f126808g;
            C50117ke keVar = this.f127361h;
            int i4 = keVar.f136675d;
            C50249le leVar = this.f127357d;
            C115669n.INSTANCE.mo160131h(17523, 2, username, Long.valueOf(j), Integer.valueOf(i4), Integer.valueOf(leVar.f137339g), Integer.valueOf(leVar.f137345p), Integer.valueOf(this.f127362i), Integer.valueOf(keVar.f136676e), Integer.valueOf(aVar.f126806e));
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil$initJumpLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a */
    public final void mo72493a(View view, int i) {
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.lyo);
        if (findViewById == null) {
            return;
        }
        if (i == 0) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initCompoundDivider", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initCompoundDivider", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view3 = findViewById;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initCompoundDivider", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initCompoundDivider", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: b */
    public final void mo72494b(Context context, C47240a aVar, C49699hg hgVar, View view, View view2, C32226l<? super Boolean, C13598b0> lVar) {
        C47240a aVar2 = aVar;
        C49699hg hgVar2 = hgVar;
        View view3 = view;
        View view4 = view2;
        C32226l<? super Boolean, C13598b0> lVar2 = lVar;
        C87412m.m108594g(context, "mContext");
        C87412m.m108594g(aVar2, "adapter");
        C87412m.m108594g(hgVar2, "bizMessage");
        C87412m.m108594g(view3, "collapseView");
        C87412m.m108594g(view4, "mainView");
        C87412m.m108594g(lVar2, "checkCanShowMainView");
        if (hgVar2.f134609n != 1) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initFeaturedBar", "(Landroid/content/Context;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter;Lcom/tencent/mm/protocal/protobuf/BizMessage;Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initFeaturedBar", "(Landroid/content/Context;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter;Lcom/tencent/mm/protocal/protobuf/BizMessage;Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initFeaturedBar", "(Landroid/content/Context;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter;Lcom/tencent/mm/protocal/protobuf/BizMessage;Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initFeaturedBar", "(Landroid/content/Context;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter;Lcom/tencent/mm/protocal/protobuf/BizMessage;Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            lVar2.invoke(Boolean.TRUE);
            return;
        }
        view3.setOnClickListener(new C47479a(aVar2, hgVar2, lVar2));
        C9556a aVar5 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar5.mo10233c(0);
        C117292a.m165358d(view, aVar5.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initFeaturedBar", "(Landroid/content/Context;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter;Lcom/tencent/mm/protocal/protobuf/BizMessage;Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initFeaturedBar", "(Landroid/content/Context;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter;Lcom/tencent/mm/protocal/protobuf/BizMessage;Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(8);
        C117292a.m165358d(view2, aVar6.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initFeaturedBar", "(Landroid/content/Context;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter;Lcom/tencent/mm/protocal/protobuf/BizMessage;Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil", "initFeaturedBar", "(Landroid/content/Context;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter;Lcom/tencent/mm/protocal/protobuf/BizMessage;Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C46721b bVar = new C46721b();
        bVar.f125775a = 1901;
        bVar.f125776b = true;
        C46720a aVar7 = C46720a.f125771a;
        Map<Integer, C46721b> map = C46720a.f125773c;
        ((HashMap) map).remove(1902);
        if (!((HashMap) map).containsKey(1903)) {
            aVar7.mo71961a(bVar);
        }
        lVar2.invoke(Boolean.FALSE);
    }

    /* renamed from: c */
    public final void mo72495c(Context context, TextView textView, C49699hg hgVar) {
        String str;
        Context context2 = context;
        TextView textView2 = textView;
        C49699hg hgVar2 = hgVar;
        C87412m.m108594g(context2, "mContext");
        C87412m.m108594g(textView2, "timeStampTv");
        C87412m.m108594g(hgVar2, "bizMessage");
        if (hgVar2.f134609n == 2) {
            textView2.setTextColor(context.getResources().getColor(C0966R.color.FG_0_CARE));
            textView2.setText(context.getResources().getString(C0966R.string.f360292lo2));
            Log.m105924i("FeatureMsgUtil", "author featured tips displayed");
            C46721b bVar = new C46721b();
            bVar.f125775a = 1902;
            bVar.f125776b = true;
            C46720a aVar = C46720a.f125771a;
            Map<Integer, C46721b> map = C46720a.f125773c;
            ((HashMap) map).remove(1901);
            if (!((HashMap) map).containsKey(1903)) {
                aVar.mo71961a(bVar);
                return;
            }
            return;
        }
        textView2.setTextColor(context.getResources().getColor(C0966R.color.FG_2));
        C47495s sVar = C47495s.f127426a;
        long j = ((long) hgVar2.f134602d.f135741f) * 1000;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        if (j < 3600000) {
            str = "";
        } else {
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
            gregorianCalendar3.setTimeInMillis(j);
            long timeInMillis = j - gregorianCalendar2.getTimeInMillis();
            if (timeInMillis <= 0 || timeInMillis > 86400000) {
                long j2 = timeInMillis + 86400000;
                if (j2 <= 0 || j2 > 86400000) {
                    long j3 = timeInMillis + FrequentLimiter.WEEK_MILLS;
                    if (j3 <= 0 || j3 > FrequentLimiter.WEEK_MILLS) {
                        boolean isChineseAppLang = LocaleUtil.isChineseAppLang();
                        if (gregorianCalendar2.get(1) == gregorianCalendar3.get(1)) {
                            if (isChineseAppLang) {
                                str = C72715f.m85111d(context2.getString(C0966R.string.eyh), j / ((long) 1000));
                                C87412m.m108593f(str, "{\n                TimeUt…ime / 1000)\n            }");
                            } else {
                                str = String.format("%s %d", Arrays.copyOf(new Object[]{sVar.mo72503a(gregorianCalendar3.get(2)), Integer.valueOf(gregorianCalendar3.get(5))}, 2));
                                C87412m.m108593f(str, "format(format, *args)");
                            }
                        } else if (isChineseAppLang) {
                            str = C72715f.m85111d(context2.getString(C0966R.string.f360810ez1), j / ((long) 1000));
                            C87412m.m108593f(str, "{\n            TimeUtil.f…estTime / 1000)\n        }");
                        } else {
                            str = String.format("%s %d, %d", Arrays.copyOf(new Object[]{sVar.mo72503a(gregorianCalendar3.get(2)), Integer.valueOf(gregorianCalendar3.get(5)), Integer.valueOf(gregorianCalendar3.get(1))}, 3));
                            C87412m.m108593f(str, "format(format, *args)");
                        }
                    } else {
                        int i = 7;
                        int i2 = gregorianCalendar3.get(7) - 1;
                        if (i2 != 0) {
                            i = i2;
                        }
                        str = MMApplicationContext.getContext().getResources().getStringArray(C0966R.array.f2602aq)[i - 1];
                        C87412m.m108593f(str, "MMApplicationContext.get…ray.time_day)[arrayIndex]");
                    }
                } else {
                    str = context2.getString(C0966R.string.f360813f00);
                    C87412m.m108593f(str, "context.getString(com.te…string.fmt_pre_yesterday)");
                }
            } else {
                str = context2.getString(C0966R.string.ezr);
                C87412m.m108593f(str, "context.getString(com.te….R.string.fmt_pre_nowday)");
            }
        }
        textView2.setText(str);
    }

    /* renamed from: d */
    public final void mo72496d(Context context, C47240a aVar, View view, C49699hg hgVar, C50249le leVar, C50117ke keVar, int i) {
        View view2 = view;
        C50249le leVar2 = leVar;
        C87412m.m108594g(context, "mContext");
        C87412m.m108594g(aVar, "adapter");
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(leVar, "detail");
        C87412m.m108594g(keVar, LiteAppCenter.FRAMEWORK_TYPE_BASE);
        C40726l.f109414a.mo63636e(leVar2.f137340h, leVar2.f137345p);
        view.setOnClickListener(new C47480b(leVar2, context, aVar, hgVar, keVar, i));
    }

    /* renamed from: e */
    public final void mo72497e(C49699hg hgVar) {
        Class cls = C45696d.class;
        C87412m.m108594g(hgVar, "bizMessage");
        if (((C45696d) C86709a0.m107533q(cls)).mo70957E5(16)) {
            C45696d dVar = (C45696d) C86709a0.m107533q(cls);
            LinkedList<C50249le> linkedList = hgVar.f134607i.f137969e;
            C87412m.m108593f(linkedList, "bizMessage.AppMsg.DetailInfo");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C50249le leVar : linkedList) {
                arrayList.add(C64197v.m75537f(leVar.f137340h, String.valueOf(leVar.f137345p)));
            }
            dVar.mo71004o8(arrayList, 126);
        }
    }
}
