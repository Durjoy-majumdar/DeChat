package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DestroyPreloadedWebViewEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.brandservice.C18161a;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40789z;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.HalfScreenWebView;
import com.tencent.p014mm.plugin.webview.util.WebViewControllerPreloadMrg;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.xweb.WebView;
import di3.C86312j;
import e00.C45513i0;
import e00.C45520t;
import ex0.C45696d;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jw0.C9533e;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kotlin.Metadata;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C88995f1;
import p225rc.C89916g;
import p225rc.g$$h;
import p248ug.C52572q0;
import p910lj.C76701a;
import qo3.C77407n;
import rx3.C13598b0;
import s00.C90110f;
import sx3.C64197v;
import t83.C13853i;
import wc3.C78538u;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lrc/g$$h;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClick", "<init>", "()V", "a", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88995f1
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI */
public final class BizTestUI extends MMActivity implements g$$h {

    /* renamed from: h */
    public static final /* synthetic */ int f80718h = 0;

    /* renamed from: d */
    public final String f80719d = "MicroMsg.BizTestUI";

    /* renamed from: e */
    public final MultiProcessMMKV f80720e = MultiProcessMMKV.getSingleMMKV("brandService");

    /* renamed from: f */
    public HalfScreenWebView f80721f;

    /* renamed from: g */
    public String f80722g = "https://channels.weixin.qq.com/mobile-support/pages/anchor-tasks/op?activity_id=2";

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI$a */
    public static final class C2086a {

        /* renamed from: a */
        public final String f12048a;

        /* renamed from: b */
        public final C32224a<C13598b0> f12049b;

        public C2086a(String str, C32224a<C13598b0> aVar) {
            C87412m.m108594g(str, "name");
            C87412m.m108594g(aVar, "execute");
            this.f12048a = str;
            this.f12049b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2086a)) {
                return false;
            }
            C2086a aVar = (C2086a) obj;
            return C87412m.m108589b(this.f12048a, aVar.f12048a) && C87412m.m108589b(this.f12049b, aVar.f12049b);
        }

        public int hashCode() {
            return (this.f12048a.hashCode() * 31) + this.f12049b.hashCode();
        }

        public String toString() {
            return "TestItem(name=" + this.f12048a + ", execute=" + this.f12049b + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI$h */
    public static final class C2087h implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ List<C2086a> f12050d;

        public C2087h(List<C2086a> list) {
            this.f12050d = list;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            int i = 0;
            for (T next : this.f12050d) {
                int i2 = i + 1;
                if (i >= 0) {
                    e0Var.mo107160r(i, ((C2086a) next).f12048a, false);
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI$i */
    public static final class C2088i implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ List<C2086a> f12051d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f12052e;

        public C2088i(List<C2086a> list, C32224a<C13598b0> aVar) {
            this.f12051d = list;
            this.f12052e = aVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            this.f12051d.get(i).f12049b.invoke();
            this.f12052e.invoke();
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI$b */
    public static final class C29718b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ BizTestUI f80723d;

        public C29718b(BizTestUI bizTestUI) {
            this.f80723d = bizTestUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f80723d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI$c */
    public static final class C29719c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BizTestUI f80724d;

        public C29719c(BizTestUI bizTestUI) {
            this.f80724d = bizTestUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$onCreate$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BizTestUI bizTestUI = this.f80724d;
            int i = BizTestUI.f80718h;
            bizTestUI.getClass();
            C40789z.m44095k(-1);
            ((C45513i0) C86312j.m106911c(C45513i0.class)).mo70778E3("file:///data/user/0/com.tencent.mm/files/public/wxa/template/app.html?isHomePage=0&isSug=1&netType=wifi&isOpenPreload=1&isPreload=1&sessionId=&type=64&version=65900820&WASessionId=&subSessionId=&platform=android&scene=-1&lang=zh_CN&wechatVersion=671094273", false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$onCreate$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI$d */
    public static final class C29720d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BizTestUI f80725d;

        public C29720d(BizTestUI bizTestUI) {
            this.f80725d = bizTestUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BizTestUI bizTestUI = this.f80725d;
            int i = BizTestUI.f80718h;
            bizTestUI.getClass();
            DestroyPreloadedWebViewEvent destroyPreloadedWebViewEvent = new DestroyPreloadedWebViewEvent();
            destroyPreloadedWebViewEvent.f78769d.f78770a = System.currentTimeMillis();
            destroyPreloadedWebViewEvent.publish();
            MMHandlerThread.postToMainThread(new C29796u2(bizTestUI));
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI$e */
    public static final class C29721e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BizTestUI f80726d;

        public C29721e(BizTestUI bizTestUI) {
            this.f80726d = bizTestUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$onCreate$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MultiProcessMMKV multiProcessMMKV = this.f80726d.f80720e;
            multiProcessMMKV.encode("biz_tl_video_auto_play", !multiProcessMMKV.decodeBool("biz_tl_video_auto_play", false));
            this.f80726d.f80720e.apply();
            BizTestUI.m38863H7(this.f80726d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$onCreate$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI$g */
    public static final class C29722g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C29722g f80727d = new C29722g();

        public C29722g() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI$f */
    public static final class C29723f implements MessageQueue.IdleHandler {

        /* renamed from: d */
        public final /* synthetic */ BizTestUI f80728d;

        public C29723f(BizTestUI bizTestUI) {
            this.f80728d = bizTestUI;
        }

        public boolean queueIdle() {
            Looper.myQueue().removeIdleHandler(this);
            WebViewControllerPreloadMrg webViewControllerPreloadMrg = WebViewControllerPreloadMrg.f120348a;
            if (!webViewControllerPreloadMrg.mo69176c(this.f80728d.f80722g)) {
                return false;
            }
            BaseWebViewController Q3 = ((C52572q0) C86312j.m106911c(C52572q0.class)).mo71611Q3(MMWebView.C45103b.m49948a(new MutableContextWrapper(this.f80728d.getContext())), new C45520t.C45522b((C45520t.C45523c) null, false, false, false, false, 0, false, 105, (C8480h) null), (C13853i) null);
            String str = this.f80728d.f80722g;
            C87412m.m108593f(Q3, "controller");
            webViewControllerPreloadMrg.mo69174a(str, Q3, true, -1, -1, 80);
            return false;
        }
    }

    /* renamed from: H7 */
    public static final void m38863H7(BizTestUI bizTestUI) {
        bizTestUI.getClass();
        if (!C18161a.f50162c) {
            Log.m105928w("MicroMsg.BizProcessorCommand", "should not autoReboot now.");
        } else {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "Success! WeChat will kill self in 1 second...", 1).show();
            C119179t tVar = C119157j.f356862d;
            C18161a.C18162a.C18163a aVar = C18161a.C18162a.C18163a.f50164d;
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(aVar, 1000, false);
        }
        bizTestUI.mo56910K7();
    }

    /* renamed from: I7 */
    public static final void m38864I7(BizTestUI bizTestUI) {
        HalfScreenWebView halfScreenWebView = bizTestUI.f80721f;
        if (halfScreenWebView != null) {
            halfScreenWebView.mo7528g(new C2103h(bizTestUI));
        }
        C76875f0 f0Var = new C76875f0(bizTestUI.getContext(), 100, 0);
        f0Var.f224717i = "自定义";
        f0Var.setIcon((int) C0966R.raw.webview_menu_enable_debug);
        HalfScreenWebView halfScreenWebView2 = bizTestUI.f80721f;
        if (halfScreenWebView2 != null) {
            halfScreenWebView2.mo7525a(f0Var);
        }
        HalfScreenWebView halfScreenWebView3 = bizTestUI.f80721f;
        if (halfScreenWebView3 != null) {
            halfScreenWebView3.f119789J.mo68957y(new C2105i(bizTestUI));
        }
        HalfScreenWebView halfScreenWebView4 = bizTestUI.f80721f;
        if (halfScreenWebView4 != null) {
            halfScreenWebView4.mo7526c(new C2120j(bizTestUI));
        }
    }

    /* renamed from: J7 */
    public static final void m38865J7(BizTestUI bizTestUI, int i) {
        bizTestUI.getClass();
        MultiProcessMMKV.getMMKV("WebCanvasStorage").encode("BizTimeLineAdPkgPreviewMode", i);
        MultiProcessMMKV.getMMKV("SurfacePackageDownloadStorage").encode("PkgPreviewMode", i);
    }

    /* renamed from: N7 */
    public static /* synthetic */ void m38866N7(BizTestUI bizTestUI, List list, Context context, C32224a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = C29722g.f80727d;
        }
        bizTestUI.mo56912M7(list, context, aVar);
    }

    /* renamed from: K7 */
    public final void mo56910K7() {
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.putExtra("preferred_tab", 0);
        C88144b.m109801s(this, ".ui.LauncherUI", intent, (Bundle) null);
    }

    /* renamed from: L7 */
    public final void mo56911L7() {
        Looper.myQueue().addIdleHandler(new C29723f(this));
    }

    /* renamed from: M7 */
    public final void mo56912M7(List<C2086a> list, Context context, C32224a<C13598b0> aVar) {
        C77407n nVar = new C77407n(context, 1, false);
        nVar.f225771i = new C2087h(list);
        nVar.f225782p = new C2088i(list, aVar);
        nVar.mo107568m(" ", 1, 0);
        nVar.f225779n1 = true;
        nVar.mo107573q();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6593j7;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C89916g.m112446a(this).mo124233g(i, i2, intent);
    }

    public final void onClick(View view) {
        C87412m.m108594g(view, "view");
        int id = view.getId();
        if (id == C0966R.C0970id.f358302o81) {
            m38866N7(this, C64197v.m75537f(new C2086a("打开Flutter渲染", new C29756n0(this)), new C2086a("Flutter渲染-后台控制", new C29759o0(this)), new C2086a("关闭Flutter渲染", new C29765p0(this)), new C2086a("使用新数据通道", new C29788q0(this)), new C2086a("新数据通道-后台控制", new C29791r0(this)), new C2086a("关闭新数据通道", new C29793s0(this)), new C2086a("当前开关状态", C2142t0.f12112d)), this, (C32224a) null, 2, (Object) null);
        } else if (id == C0966R.C0970id.o7z) {
            m38866N7(this, C64197v.m75537f(new C2086a("ResetData", new C18406j0(this)), new C2086a("测试DB损坏与修复", C115300k0.f345522d), new C2086a("退后台回收engine", new C29750l0(this)), new C2086a("退后台不回收engine", new C29753m0(this))), this, (C32224a) null, 2, (Object) null);
        } else if (id == C0966R.C0970id.hwm) {
            mo56912M7(C64197v.m75537f(new C2086a("预览状态", new C29738h1(this)), new C2086a("发布状态-忽略频控", new C29740i1(this)), new C2086a("发布状态", new C29746j1(this)), new C2086a("清理本地代码包", new C29747k1(this)), new C2086a("代码包版本", new C40691l1(this)), new C2086a("代码包版本-小程序DSL", new C85109m1(this))), this, C2123n1.f12089d);
        } else if (id == C0966R.C0970id.l4v) {
            MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("brandService");
            mo56912M7(C64197v.m75537f(new C2086a("开启频道入口动态化", new C2137q2(singleMMKV)), new C2086a("关闭频道入口动态化", new C2138r2(singleMMKV)), new C2086a("使用后台开关", new C2140s2(singleMMKV))), this, new C29795t2(singleMMKV, this));
        } else if (id == C0966R.C0970id.f5536hq) {
            C2086a[] aVarArr = new C2086a[6];
            aVarArr[0] = new C2086a("清除数据", new C29724a(this));
            C19428d dVar = C19428d.f54856a;
            aVarArr[1] = !dVar.mo25183r() ? new C2086a("强制开启所有直播入口", new C29727b(this)) : new C2086a("恢复现网直播入口开关", new C29729c(this));
            aVarArr[2] = new C2086a("插入直播红点", new C29732d(this));
            aVarArr[3] = new C2086a("检查直播红点", new C29734e(this));
            aVarArr[4] = new C2086a("Profile显示直播中", C2098f.f12062d);
            aVarArr[5] = new C2086a(dVar.mo25176k().decodeBool("showLiveBarWhenExpose", false) ? "直播Bar曝光后不再显示" : "直播Bar曝光后仍然显示", new C29736g(this));
            m38866N7(this, C64197v.m75537f(aVarArr), this, (C32224a) null, 2, (Object) null);
        } else if (id == C0966R.C0970id.cu_) {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("_webview_tmpl_command");
            m38866N7(this, C64197v.m75537f(new C2086a("清理模板", new C29730c0(this)), new C2086a("清理数据", new C29733d0(this)), new C2086a("检查模板更新", new C29735e0(mmkv, this)), new C2086a("模板版本号", new C40682f0(this)), new C2086a("关闭超时跳转", new C2101g0(mmkv, this)), new C2086a("恢复超时跳转", new C2104h0(mmkv, this)), new C2086a("清理上报KV", new C2106i0(this))), this, (C32224a) null, 2, (Object) null);
        } else if (id == C0966R.C0970id.f5531hk) {
            MultiProcessMMKV singleMMKV2 = MultiProcessMMKV.getSingleMMKV("brandService");
            mo56912M7(C64197v.m75537f(new C2086a("预览广告", new C29749l(this)), new C2086a("退出预览广告", new C29752m(this)), new C2086a("正常模式", new C29755n(singleMMKV2, this)), new C2086a("测试模式", new C29758o(singleMMKV2, this)), new C2086a("Mock视频模式", new C29764p(singleMMKV2, this)), new C2086a("Mock图片模式", new C29787q(singleMMKV2, this)), new C2086a("清理广告曝光", new C29790r(MultiProcessMMKV.getSingleMMKV("biz_timeline_ad"), this)), new C2086a("新架构Mock视频模式", C2139s.f12109d), new C2086a("新架构Mock图片模式", C2141t.f12111d)), this, C2121k.f12087d);
        } else if (id == C0966R.C0970id.iev) {
            m38866N7(this, C64197v.m75537f(new C2086a("插入canvas推荐卡片", C29798v1.f80808d), new C2086a("插入唯一性canvas推荐卡片", C29800w1.f80810d), new C2086a("插入原生推荐卡片", C29803x1.f80813d), new C2086a("插入视频号推荐卡片", C29806y1.f80816d), new C2086a("允许前端回收动态推荐卡片", new C29809z1(this)), new C2086a("禁止前端回收动态推荐卡片", new C29726a2(this)), new C2086a("打开推荐流", new C29728b2(this)), new C2086a("关闭推荐流", new C29731c2(this)), new C2086a("新架构Mock Canvas推荐卡片", C2093d2.f12058d)), this, (C32224a) null, 2, (Object) null);
        } else if (id == C0966R.C0970id.acn) {
            m38866N7(this, C64197v.m75537f(new C2086a("关闭DB双写", C2144u.f12114d), new C2086a("打开DB双写", C2147v.f12117d), new C2086a("清空订阅号消息新DB", C55586w.f158257d), new C2086a("延时5秒后，迁移50条旧db数据到新db(需重启)", C29801x.f80811d), new C2086a("关闭卡片更新", new C29804y(this)), new C2086a("打开卡片更新", new C29807z(this)), new C2086a("乱序忽略频控", new C18186a0(this)), new C2086a("乱序恢复频控", new C18190b0(this))), this, (C32224a) null, 2, (Object) null);
        } else if (id == C0966R.C0970id.f357742bj3) {
            m38866N7(this, C64197v.m75537f(new C2086a("打开大秒开使用pkg", new C29760o1(this)), new C2086a("关闭大秒开使用pkg", new C29766p1(this)), new C2086a("x系统控制大秒开使用pkg", new C29789q1(this)), new C2086a("打开大秒开测试", new C29792r1(this)), new C2086a("关闭大秒开测试", new C29794s1(this))), this, (C32224a) null, 2, (Object) null);
        } else if (id == C0966R.C0970id.ln5) {
            m38866N7(this, C64197v.m75537f(new C2086a("禁止后台让网页分享卡片安全降级为蓝链", C2096e2.f12060d), new C2086a("允许后台让网页分享卡片安全降级为蓝链", C2100f2.f12064d), new C2086a("打开url传参指定渲染方式", new C29737g2(this)), new C2086a("关闭url传参指定渲染方式", new C29739h2(this)), new C2086a("弹出半屏WebView", new C40690j2(this)), new C2086a("弹出半屏WebView-沉浸式", new C29751l2(this)), new C2086a("弹出半屏WebView-ReadMode", new C29757n2(this)), new C2086a("弹出半屏WebView-无按钮", new C29767p2(this))), this, (C32224a) null, 2, (Object) null);
        } else if (id == C0966R.C0970id.aqd) {
            C88144b.m109789g(this, "brandservice", ".ui.timeline.BizTestCanvasUI");
        } else if (id == C0966R.C0970id.f358980i73) {
            m38866N7(this, C64197v.m75537f(new C2086a("打开profile不使用缓存", C2143t1.f12113d), new C2086a("打开profile使用缓存", C2146u1.f12116d)), this, (C32224a) null, 2, (Object) null);
        } else if (id == C0966R.C0970id.ma4) {
            View findViewById = findViewById(C0966R.C0970id.ma5);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI", "testNativeFinder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI", "testNativeFinder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((Button) findViewById.findViewById(C0966R.C0970id.ma9)).setOnClickListener(C29797v0.f80807d);
            ((Button) findViewById.findViewById(C0966R.C0970id.ma8)).setOnClickListener(C29799w0.f80809d);
            ((Button) findViewById.findViewById(C0966R.C0970id.ma7)).setOnClickListener(C29802x0.f80812d);
            ((Button) findViewById.findViewById(C0966R.C0970id.n6a)).setOnClickListener(C29805y0.f80815d);
            ((Button) findViewById.findViewById(C0966R.C0970id.nj6)).setOnClickListener(C29808z0.f80818d);
            ((Button) findViewById.findViewById(C0966R.C0970id.nj7)).setOnClickListener(C29725a1.f80730d);
        } else if (id == C0966R.C0970id.mx4) {
            C40789z.m44095k(-1);
            ((C45513i0) C86312j.m106911c(C45513i0.class)).mo70778E3("file:///data/user/0/com.tencent.mm/files/public/wxa/template/app.html?isHomePage=0&isSug=1&netType=wifi&isOpenPreload=1&isPreload=1&sessionId=&type=64&version=65900820&WASessionId=&subSessionId=&platform=android&scene=-1&lang=zh_CN&wechatVersion=671094273", false);
        } else if (id == C0966R.C0970id.mx5) {
            DestroyPreloadedWebViewEvent destroyPreloadedWebViewEvent = new DestroyPreloadedWebViewEvent();
            destroyPreloadedWebViewEvent.f78769d.f78770a = System.currentTimeMillis();
            destroyPreloadedWebViewEvent.publish();
            MMHandlerThread.postToMainThread(new C29796u2(this));
        } else if (id == C0966R.C0970id.bil) {
            View findViewById2 = findViewById(C0966R.C0970id.dtd);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = findViewById2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI", "testLive", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI", "testLive", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((Button) findViewById2.findViewById(C0966R.C0970id.buj)).setOnClickListener(new C2145u0(MultiProcessMMKV.getMMKV("test_biz_finder_live")));
            Button button = (Button) findViewById2.findViewById(C0966R.C0970id.cba);
            ((C45696d) C86709a0.m107533q(C45696d.class)).mo70953B7();
        } else if (id == C0966R.C0970id.ns7) {
            m38866N7(this, C64197v.m75537f(new C2086a("打开hardcode最近阅读日期", C2090b1.f12055d), new C2086a("关闭hardcode最近阅读日期", C2091c1.f12056d), new C2086a("打开最近阅读假删除", C2092d1.f12057d), new C2086a("关闭最近阅读假删除", C2095e1.f12059d), new C2086a("破坏一级页数据", C2099f1.f12063d), new C2086a("修复一级页数据", C2102g1.f12067d)), this, (C32224a) null, 2, (Object) null);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C78538u.m94868d(this);
        setMMTitle((int) C0966R.string.gs6);
        if (!C9533e.f29713a.mo10211d()) {
            Log.m105920e(this.f80719d, "Not test env, finish now!!!");
            finish();
            return;
        }
        String decodeString = this.f80720e.decodeString("HalfscreenWebViewTestUrl");
        if (decodeString != null && !C112551y.m153811k(decodeString)) {
            this.f80722g = decodeString;
        }
        ((C90110f) C86312j.m106911c(C90110f.class)).po0(WebView.sDefaultWebViewKind, (WebView.PreInitCallback) null);
        mo56911L7();
        setBackBtn(new C29718b(this));
        Button button = (Button) findViewById(C0966R.C0970id.mx4);
        if (button != null) {
            button.setOnClickListener(new C29719c(this));
            button.setText("触发预加载");
        }
        Button button2 = (Button) findViewById(C0966R.C0970id.mx5);
        if (button2 != null) {
            button2.setOnClickListener(new C29720d(this));
            button2.setText("触发回收");
        }
        Button button3 = (Button) findViewById(C0966R.C0970id.ns8);
        if (button3 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("TL视频自动播放：");
            sb.append(this.f80720e.decodeBool("biz_tl_video_auto_play", false) ? "打开" : "关闭");
            button3.setText(sb.toString());
            button3.setOnClickListener(new C29721e(this));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        WebViewControllerPreloadMrg.f120348a.mo69175b();
        C89916g.m112447b(this);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr.length == 0) {
            Log.m105925i(this.f80719d, "onRequestPermissionsResult grantResults length 0. requestCode=%d", Integer.valueOf(i));
        } else {
            C89916g.m112446a(this).mo124234h(i, strArr, iArr);
        }
    }
}
