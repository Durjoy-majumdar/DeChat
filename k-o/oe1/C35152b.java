package oe1;

import android.content.Context;
import fy3.C32227p;
import h81.C32735h;
import pe1.C35464c;
import rx3.C13598b0;
import se1.C36665a;
import sx3.C64197v;

/* renamed from: oe1.b */
public final class C35152b {

    /* renamed from: a */
    public static final C35464c<Integer> f94273a;

    /* renamed from: b */
    public static final C35464c<Integer> f94274b;

    /* renamed from: c */
    public static final C35464c<Integer> f94275c;

    /* renamed from: d */
    public static final C35464c<Integer> f94276d;

    static {
        C36665a aVar = new C36665a(0, "是否打开发现页直播入口", (C32227p<? super Integer, ? super Context, C13598b0>) null);
        aVar.mo60270f(C32735h.C32737c.clicfg_finder_support_find_page_live);
        aVar.mo60268b("FINDER_SUPPORT_FIND_PAGE_LIVE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar.f94897p = "2021T2";
        f94273a = aVar;
        C36665a aVar2 = new C36665a(1, "卡片插入是否感知(是否开启动画)", (C32227p<? super Integer, ? super Context, C13598b0>) null);
        aVar2.mo60270f(C32735h.C32737c.clicfg_finder_recom_card_replace_anim_switch);
        aVar2.mo60268b("FINDER_RECOM_CARD_REPLAEC_ANIM_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar2.f94897p = "2021T2";
        f94274b = aVar2;
        C36665a aVar3 = new C36665a(0, "直播独立入口在看一看上方", (C32227p<? super Integer, ? super Context, C13598b0>) null);
        aVar3.mo60270f(C32735h.C32737c.clicfg_finder_live_above_look);
        aVar3.mo60268b("FINDER_LIVE_ABOVE_LOOK", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar3.f94897p = "2021T2";
        f94275c = aVar3;
        C36665a aVar4 = new C36665a(300000, "新广场二级tab缓存时间", (C32227p<? super Integer, ? super Context, C13598b0>) null);
        aVar4.mo60270f(C32735h.C32737c.clicfg_finder_live_sub_tab_cache_time);
        aVar4.mo60268b("FINDER_LIVE_SUB_TAB_CACHE_TIME", C64197v.m75537f(300000, 30000), C64197v.m75537f("5分钟", "30秒"));
        f94276d = aVar4;
    }
}
