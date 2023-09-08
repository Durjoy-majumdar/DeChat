package zk3;

import ak1.C0077k0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ck3.C67391b;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.chatting.viewitems.C57761h6;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.xweb.WCWebUpdater;
import di3.C7335d;
import di3.C86312j;
import gy3.C8478d0;
import gy3.C87412m;
import h81.C59774i;
import hp3.C87581a;
import ht1.C46104b3;
import ht1.C60200t1;
import ht1.C8794p5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import ks3.C61161k;
import ls3.C10649f;
import ls3.C61397g;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import o40.C61926c;
import ob0.C89132b;
import org.json.JSONObject;
import p151er.C58677l;
import p185kq.C10383h;
import p185kq.C61130g;
import p204mr.C61568m;
import p565ir.C60602j;
import p565ir.C60603k;
import p565ir.C60606n;
import p565ir.C60611o;
import p565ir.C60613r;
import p744wt.C66191d;
import p749xh.C38616n3;
import pl1.C11978e0;
import q31.C118148a;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C48978cb0;
import te3.C49712hj1;
import te3.C50401mh0;
import te3.C50542nh0;
import te3.C52245zc1;
import te3.C64238ap2;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64347eq2;
import z04.C119027c;
import zk3.C66908d;
import zp3.C23555k;
import zp3.C23564m;
import zt3.C119157j;

/* renamed from: zk3.c */
public class C66894c implements C66908d {

    /* renamed from: h */
    public static final MultiProcessMMKV f192192h = MultiProcessMMKV.getMMKV("FINDER_LIVE_NOTIFY_REJECT_STATUS");

    /* renamed from: a */
    public final String f192193a = "FinderLiveNotifyTmplV1";

    /* renamed from: b */
    public C77407n f192194b;

    /* renamed from: c */
    public final int f192195c = 1;

    /* renamed from: d */
    public final int f192196d = 2;

    /* renamed from: e */
    public final int f192197e = 3;

    /* renamed from: f */
    public final String f192198f = "https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=62&liveid=%s&liveidentityid=%s&wechat_real_lang=%s";

    /* renamed from: g */
    public final C66896b f192199g = new C66896b();

    /* renamed from: zk3.c$a */
    public static final class C66895a {

        /* renamed from: a */
        public String f192200a;

        /* renamed from: b */
        public String f192201b;

        /* renamed from: c */
        public final int f192202c;

        /* renamed from: d */
        public final String f192203d;

        /* renamed from: e */
        public final String f192204e;

        public C66895a(String str, String str2, int i, String str3, String str4) {
            C87412m.m108594g(str, "item_topic");
            C87412m.m108594g(str2, "item_content");
            C87412m.m108594g(str3, "ext_item_content");
            C87412m.m108594g(str4, "ext_item_reason");
            this.f192200a = str;
            this.f192201b = str2;
            this.f192202c = i;
            this.f192203d = str3;
            this.f192204e = str4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C66895a)) {
                return false;
            }
            C66895a aVar = (C66895a) obj;
            return C87412m.m108589b(this.f192200a, aVar.f192200a) && C87412m.m108589b(this.f192201b, aVar.f192201b) && this.f192202c == aVar.f192202c && C87412m.m108589b(this.f192203d, aVar.f192203d) && C87412m.m108589b(this.f192204e, aVar.f192204e);
        }

        public int hashCode() {
            return (((((((this.f192200a.hashCode() * 31) + this.f192201b.hashCode()) * 31) + this.f192202c) * 31) + this.f192203d.hashCode()) * 31) + this.f192204e.hashCode();
        }

        public String toString() {
            return "InfoItem(item_topic=" + this.f192200a + ", item_content=" + this.f192201b + ", item_maxline=" + this.f192202c + ", ext_item_content=" + this.f192203d + ", ext_item_reason=" + this.f192204e + ')';
        }
    }

    /* renamed from: zk3.c$b */
    public static final class C66896b implements C66908d.C66909a {

        /* renamed from: a */
        public View f192205a;

        /* renamed from: b */
        public ImageView f192206b;

        /* renamed from: c */
        public TextView f192207c;

        /* renamed from: d */
        public ImageView f192208d;

        /* renamed from: e */
        public View f192209e;

        /* renamed from: f */
        public TextView f192210f;

        /* renamed from: g */
        public LinearLayout f192211g;

        /* renamed from: h */
        public View f192212h;

        /* renamed from: i */
        public TextView f192213i;

        /* renamed from: j */
        public View f192214j;

        /* renamed from: k */
        public View f192215k;

        /* renamed from: a */
        public void mo90898a(View view) {
            C87412m.m108594g(view, "view");
            View findViewById = view.findViewById(C0966R.C0970id.kps);
            this.f192205a = findViewById;
            if (findViewById != null) {
                this.f192206b = (ImageView) findViewById.findViewById(C0966R.C0970id.hkc);
                this.f192207c = (TextView) findViewById.findViewById(C0966R.C0970id.hki);
                this.f192208d = (ImageView) findViewById.findViewById(C0966R.C0970id.hkb);
                this.f192209e = findViewById.findViewById(C0966R.C0970id.hkh);
                TextView textView = (TextView) findViewById.findViewById(C0966R.C0970id.fmx);
                this.f192210f = textView;
                C85875k4.m106189j0(textView != null ? textView.getPaint() : null, 0.8f);
                this.f192211g = (LinearLayout) findViewById.findViewById(C0966R.C0970id.hkf);
                this.f192212h = findViewById.findViewById(C0966R.C0970id.f358251e30);
                this.f192213i = (TextView) findViewById.findViewById(C0966R.C0970id.hkl);
                this.f192214j = findViewById.findViewById(C0966R.C0970id.hkj);
                this.f192215k = findViewById.findViewById(C0966R.C0970id.hk_);
            }
        }

        /* renamed from: b */
        public void mo90899b(boolean z) {
            View view = this.f192205a;
            if (view != null) {
                int i = z ? 0 : 8;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "hideOrShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "hideOrShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        /* renamed from: c */
        public void mo90900c(View.OnLongClickListener onLongClickListener, Object obj) {
            C87412m.m108594g(onLongClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            C87412m.m108594g(obj, "tag");
            View view = this.f192205a;
            if (view != null) {
                view.setOnLongClickListener(onLongClickListener);
            }
            View view2 = this.f192205a;
            if (view2 != null) {
                view2.setTag(obj);
            }
        }

        /* renamed from: d */
        public final void mo90901d(int i, long j, String str, String str2, C61161k kVar) {
            Integer num;
            C61161k kVar2;
            C61161k kVar3;
            Integer num2;
            int i2;
            C61161k kVar4;
            String str3;
            boolean z;
            int i3;
            String str4;
            C61161k kVar5;
            boolean z2;
            Integer num3;
            String str5;
            boolean z3;
            String str6 = str;
            String str7 = str2;
            C61161k kVar6 = kVar;
            C61161k kVar7 = C61161k.LiveEnd;
            C61161k kVar8 = C61161k.Living;
            Class cls = C60200t1.class;
            Class cls2 = C60606n.class;
            C87412m.m108594g(str6, "tipsId");
            C87412m.m108594g(str7, "url");
            C87412m.m108594g(kVar6, "state");
            View view = this.f192212h;
            if (view == null) {
                kVar2 = kVar7;
                num = 0;
            } else {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                kVar2 = kVar7;
                num = 0;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view3 = this.f192212h;
            View view4 = null;
            ImageView imageView = view3 != null ? (ImageView) view3.findViewById(C0966R.C0970id.f358252e31) : null;
            View view5 = this.f192212h;
            View findViewById = view5 != null ? view5.findViewById(C0966R.C0970id.dnt) : null;
            View view6 = this.f192212h;
            if (view6 != null) {
                view4 = view6.findViewById(C0966R.C0970id.dke);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("refreshLiveWidget source:");
            sb.append(i);
            sb.append(", liveId:");
            sb.append(j);
            sb.append(", tipsId:");
            sb.append(str6);
            sb.append(" state:");
            sb.append(kVar6);
            sb.append(",url empty:");
            sb.append(str2.length() == 0);
            sb.append('!');
            Log.m105924i("FinderLiveNotifyTmplV1", sb.toString());
            if (str2.length() > 0) {
                int ordinal = kVar.ordinal();
                if (ordinal == 0) {
                    kVar3 = kVar2;
                    num2 = num;
                } else if (ordinal == 1) {
                    C61161k kVar9 = kVar2;
                    Integer num4 = num;
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                    String str8 = "getService(IFinderLiveFeatureService::class.java)";
                    C60200t1.C60201a.m70370h((C60200t1) c, str2, imageView, (C11978e0.C11979a) null, 4, (Object) null);
                    if (findViewById == null) {
                        kVar5 = kVar9;
                        str4 = str8;
                        i3 = 0;
                    } else {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(num4);
                        View view7 = findViewById;
                        i3 = 0;
                        kVar5 = kVar9;
                        str4 = str8;
                        C117292a.m165358d(view7, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view7, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (view4 != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar3.mo10233c(8);
                        View view8 = view4;
                        C117292a.m165358d(view8, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar3.mo10231a(i3)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    C7335d c2 = C86312j.m106911c(cls2);
                    C87412m.m108593f(c2, str4);
                    C60606n.C60607a.m70861e((C60606n) c2, findViewById, C61161k.Replay, false, 4, (Object) null);
                    ((C60606n) C86312j.m106911c(cls2)).jr0(view4, kVar5, true);
                    return;
                } else if (ordinal == 2) {
                    String str9 = "getService(IFinderLiveFeatureService::class.java)";
                    Integer num5 = num;
                    ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83755B5(imageView, str7, 25);
                    if (findViewById == null) {
                        num3 = num5;
                        z2 = true;
                    } else {
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                        aVar4.mo10233c(8);
                        View view9 = findViewById;
                        z2 = true;
                        num3 = num5;
                        C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view9, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (view4 != null) {
                        C9556a aVar5 = new C9556a();
                        ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                        aVar5.mo10233c(num3);
                        View view10 = view4;
                        C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view10, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    C7335d c3 = C86312j.m106911c(cls2);
                    C87412m.m108593f(c3, str9);
                    C60606n.C60607a.m70861e((C60606n) c3, findViewById, kVar8, false, 4, (Object) null);
                    ((C60606n) C86312j.m106911c(cls2)).jr0(view4, C61161k.ReplayAuditing, z2);
                    return;
                } else if (ordinal != 3) {
                    ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83755B5(imageView, str7, 25);
                    if (findViewById == null) {
                        str5 = "getService(IFinderLiveFeatureService::class.java)";
                        z3 = true;
                    } else {
                        C9556a aVar6 = new C9556a();
                        ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                        aVar6.mo10233c(8);
                        View view11 = findViewById;
                        str5 = "getService(IFinderLiveFeatureService::class.java)";
                        z3 = true;
                        C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view11, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (view4 != null) {
                        C9556a aVar7 = new C9556a();
                        ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                        aVar7.mo10233c(num);
                        View view12 = view4;
                        C117292a.m165358d(view12, aVar7.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                        C117292a.m165359e(view12, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    C7335d c4 = C86312j.m106911c(cls2);
                    C87412m.m108593f(c4, str5);
                    C60606n.C60607a.m70861e((C60606n) c4, findViewById, kVar8, false, 4, (Object) null);
                    ((C60606n) C86312j.m106911c(cls2)).jr0(view4, kVar2, z3);
                    return;
                } else {
                    kVar3 = kVar2;
                    num2 = num;
                }
                C7335d c5 = C86312j.m106911c(cls);
                C87412m.m108593f(c5, "getService(IFinderCommon…atureService::class.java)");
                C60200t1.C60201a.m70370h((C60200t1) c5, str2, imageView, (C11978e0.C11979a) null, 4, (Object) null);
                if (findViewById == null) {
                    str3 = "getService(IFinderLiveFeatureService::class.java)";
                    kVar4 = kVar3;
                    z = true;
                    i2 = 0;
                } else {
                    C9556a aVar8 = new C9556a();
                    ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                    aVar8.mo10233c(num2);
                    View view13 = findViewById;
                    i2 = 0;
                    z = true;
                    str3 = "getService(IFinderLiveFeatureService::class.java)";
                    kVar4 = kVar3;
                    C117292a.m165358d(view13, aVar8.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view13, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (view4 != null) {
                    C9556a aVar9 = new C9556a();
                    ThreadLocal<C9556a> threadLocal9 = C60958c.f173611a;
                    aVar9.mo10233c(8);
                    View view14 = view4;
                    C117292a.m165358d(view14, aVar9.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar9.mo10231a(i2)).intValue());
                    C117292a.m165359e(view14, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C7335d c6 = C86312j.m106911c(cls2);
                C87412m.m108593f(c6, str3);
                C60606n.C60607a.m70861e((C60606n) c6, findViewById, kVar8, false, 4, (Object) null);
                ((C60606n) C86312j.m106911c(cls2)).jr0(view4, kVar4, z);
                return;
            }
            View view15 = this.f192212h;
            if (view15 != null) {
                C9556a aVar10 = new C9556a();
                ThreadLocal<C9556a> threadLocal10 = C60958c.f173611a;
                aVar10.mo10233c(8);
                View view16 = view15;
                C117292a.m165358d(view16, aVar10.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view15.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                C117292a.m165359e(view16, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public void setOnTouchListener(View.OnTouchListener onTouchListener) {
            C87412m.m108594g(onTouchListener, "ls");
            View view = this.f192205a;
            if (view != null) {
                view.setOnTouchListener(onTouchListener);
            }
        }
    }

    /* renamed from: zk3.c$c */
    public static final class C66897c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66894c f192216d;

        /* renamed from: e */
        public final /* synthetic */ C67391b f192217e;

        /* renamed from: f */
        public final /* synthetic */ String f192218f;

        /* renamed from: g */
        public final /* synthetic */ C72963f4 f192219g;

        /* renamed from: h */
        public final /* synthetic */ String f192220h;

        /* renamed from: i */
        public final /* synthetic */ Map<String, String> f192221i;

        /* renamed from: j */
        public final /* synthetic */ String f192222j;

        /* renamed from: n */
        public final /* synthetic */ long f192223n;

        /* renamed from: o */
        public final /* synthetic */ long f192224o;

        /* renamed from: p */
        public final /* synthetic */ C66896b f192225p;

        /* renamed from: zk3.c$c$a */
        public static final class C66898a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ C72963f4 f192226d;

            /* renamed from: e */
            public final /* synthetic */ boolean f192227e;

            /* renamed from: f */
            public final /* synthetic */ String f192228f;

            /* renamed from: g */
            public final /* synthetic */ C66894c f192229g;

            /* renamed from: h */
            public final /* synthetic */ Map<String, String> f192230h;

            /* renamed from: i */
            public final /* synthetic */ String f192231i;

            public C66898a(C72963f4 f4Var, boolean z, String str, C66894c cVar, Map<String, String> map, String str2) {
                this.f192226d = f4Var;
                this.f192227e = z;
                this.f192228f = str;
                this.f192229g = cVar;
                this.f192230h = map;
                this.f192231i = str2;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.clear();
                C60613r rVar = (C60613r) C86312j.m106911c(C60613r.class);
                C72963f4 f4Var = this.f192226d;
                if (!rVar.mo84971Bs(f4Var != null ? f4Var.getMsgId() : -1, 8)) {
                    if (!this.f192227e) {
                        int i = this.f192229g.f192196d;
                        int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2966ao);
                        Resources resources = MMApplicationContext.getContext().getResources();
                        Map<String, String> map = this.f192230h;
                        e0Var.mo107140d(i, color, resources.getString(C0966R.string.m_u, new Object[]{map.get(this.f192231i + ".title.nickname")}));
                    } else if (!this.f192228f.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN)) {
                        int i2 = this.f192229g.f192197e;
                        Resources resources2 = MMApplicationContext.getContext().getResources();
                        Map<String, String> map2 = this.f192230h;
                        e0Var.add(0, i2, 0, (CharSequence) resources2.getString(C0966R.string.b3d, new Object[]{map2.get(this.f192231i + ".title.nickname")}));
                    }
                }
                e0Var.add(0, this.f192229g.f192195c, 0, (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.hcy));
            }
        }

        /* renamed from: zk3.c$c$b */
        public static final class C66899b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C66894c f192232d;

            /* renamed from: e */
            public final /* synthetic */ String f192233e;

            /* renamed from: f */
            public final /* synthetic */ long f192234f;

            /* renamed from: g */
            public final /* synthetic */ C67391b f192235g;

            /* renamed from: h */
            public final /* synthetic */ String f192236h;

            /* renamed from: i */
            public final /* synthetic */ long f192237i;

            /* renamed from: j */
            public final /* synthetic */ C66896b f192238j;

            /* renamed from: zk3.c$c$b$a */
            public static final class C66900a<_Ret, _Var> implements C87581a {

                /* renamed from: a */
                public final /* synthetic */ C66896b f192239a;

                /* renamed from: b */
                public final /* synthetic */ String f192240b;

                public C66900a(C66896b bVar, String str) {
                    this.f192239a = bVar;
                    this.f192240b = str;
                }

                public Object call(Object obj) {
                    C89132b.C89134c cVar = (C89132b.C89134c) obj;
                    if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                        View view = this.f192239a.f192215k;
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$filling$1$2$1$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$filling$1$2$1$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        C66894c.f192192h.putBoolean(this.f192240b, true);
                    }
                    return C13598b0.f38549a;
                }
            }

            /* renamed from: zk3.c$c$b$b */
            public static final class C66901b implements C8794p5<C52245zc1> {

                /* renamed from: d */
                public final /* synthetic */ C66894c f192241d;

                /* renamed from: e */
                public final /* synthetic */ C66896b f192242e;

                /* renamed from: f */
                public final /* synthetic */ String f192243f;

                public C66901b(C66894c cVar, C66896b bVar, String str) {
                    this.f192241d = cVar;
                    this.f192242e = bVar;
                    this.f192243f = str;
                }

                /* renamed from: c5 */
                public void mo705c5(Object obj, C50542nh0 nh02) {
                    C87412m.m108594g((C52245zc1) obj, "req");
                    C87412m.m108594g(nh02, "ret");
                    String c = this.f192241d.mo90890c();
                    Log.m105924i(c, "rejectNotify reject ret code = " + nh02.f138603e);
                    if (nh02.f138603e == 0) {
                        View view = this.f192242e.f192215k;
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$filling$1$2$1$2", "onModifyResult", "(Lcom/tencent/mm/protocal/protobuf/FinderModFollowNotifySetting;Lcom/tencent/mm/protocal/protobuf/FinderCmdRet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$filling$1$2$1$2", "onModifyResult", "(Lcom/tencent/mm/protocal/protobuf/FinderModFollowNotifySetting;Lcom/tencent/mm/protocal/protobuf/FinderCmdRet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        C66894c.f192192h.putBoolean(this.f192243f, true);
                    }
                }
            }

            /* renamed from: zk3.c$c$b$c */
            public static final class C66902c<_Ret, _Var> implements C87581a {

                /* renamed from: a */
                public final /* synthetic */ C66896b f192244a;

                /* renamed from: b */
                public final /* synthetic */ String f192245b;

                public C66902c(C66896b bVar, String str) {
                    this.f192244a = bVar;
                    this.f192245b = str;
                }

                public Object call(Object obj) {
                    C89132b.C89134c cVar = (C89132b.C89134c) obj;
                    if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                        View view = this.f192244a.f192215k;
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$filling$1$2$2$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$filling$1$2$2$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        C66894c.f192192h.putBoolean(this.f192245b, false);
                    }
                    return C13598b0.f38549a;
                }
            }

            /* renamed from: zk3.c$c$b$d */
            public static final class C66903d implements C8794p5<C52245zc1> {

                /* renamed from: d */
                public final /* synthetic */ C66894c f192246d;

                /* renamed from: e */
                public final /* synthetic */ C66896b f192247e;

                /* renamed from: f */
                public final /* synthetic */ String f192248f;

                public C66903d(C66894c cVar, C66896b bVar, String str) {
                    this.f192246d = cVar;
                    this.f192247e = bVar;
                    this.f192248f = str;
                }

                /* renamed from: c5 */
                public void mo705c5(Object obj, C50542nh0 nh02) {
                    C87412m.m108594g((C52245zc1) obj, "req");
                    C87412m.m108594g(nh02, "ret");
                    String c = this.f192246d.mo90890c();
                    Log.m105924i(c, "rejectNotify unreject ret code = " + nh02.f138603e);
                    if (nh02.f138603e == 0) {
                        View view = this.f192247e.f192215k;
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$filling$1$2$2$2", "onModifyResult", "(Lcom/tencent/mm/protocal/protobuf/FinderModFollowNotifySetting;Lcom/tencent/mm/protocal/protobuf/FinderCmdRet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$filling$1$2$2$2", "onModifyResult", "(Lcom/tencent/mm/protocal/protobuf/FinderModFollowNotifySetting;Lcom/tencent/mm/protocal/protobuf/FinderCmdRet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        C66894c.f192192h.putBoolean(this.f192248f, false);
                    }
                }
            }

            public C66899b(C66894c cVar, String str, long j, C67391b bVar, String str2, long j2, C66896b bVar2) {
                this.f192232d = cVar;
                this.f192233e = str;
                this.f192234f = j;
                this.f192235g = bVar;
                this.f192236h = str2;
                this.f192237i = j2;
                this.f192238j = bVar2;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                Class cls = C46104b3.class;
                Class cls2 = C60602j.class;
                int itemId = menuItem.getItemId();
                C66894c cVar = this.f192232d;
                if (itemId == cVar.f192196d) {
                    String str = this.f192233e;
                    if (str != null) {
                        String str2 = this.f192236h;
                        long j = this.f192234f;
                        long j2 = this.f192237i;
                        C66896b bVar = this.f192238j;
                        if (str2.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN)) {
                            C50401mh0 zh02 = ((C60602j) C86312j.m106911c(cls2)).zh0(false, str);
                            ((C60602j) C86312j.m106911c(cls2)).p80(j, j2, zh02.f138028d, zh02).mo9225i().mo123420E(new C66900a(bVar, str));
                            return;
                        }
                        ((C46104b3) C86312j.m106911c(cls)).mo71546hS(str, true, new C66901b(cVar, bVar, str));
                    }
                } else if (itemId == cVar.f192197e) {
                    String str3 = this.f192233e;
                    if (str3 != null) {
                        String str4 = this.f192236h;
                        long j3 = this.f192234f;
                        long j4 = this.f192237i;
                        C66896b bVar2 = this.f192238j;
                        if (str4.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN)) {
                            C50401mh0 zh03 = ((C60602j) C86312j.m106911c(cls2)).zh0(true, str3);
                            ((C60602j) C86312j.m106911c(cls2)).p80(j3, j4, zh03.f138028d, zh03).mo9225i().mo123420E(new C66902c(bVar2, str3));
                            return;
                        }
                        ((C46104b3) C86312j.m106911c(cls)).mo71546hS(str3, false, new C66903d(cVar, bVar2, str3));
                    }
                } else if (itemId == cVar.f192195c) {
                    String format = String.format(cVar.f192198f, Arrays.copyOf(new Object[]{Long.valueOf(this.f192234f), this.f192233e, LocaleUtil.getApplicationLanguage()}, 3));
                    C87412m.m108593f(format, "format(format, *args)");
                    Log.m105924i(this.f192232d.mo90890c(), "go to complain page");
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", format);
                    C74023i.m87881c(intent, this.f192235g.mo91577r());
                    C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
            }
        }

        public C66897c(C66894c cVar, C67391b bVar, String str, C72963f4 f4Var, String str2, Map<String, String> map, String str3, long j, long j2, C66896b bVar2) {
            this.f192216d = cVar;
            this.f192217e = bVar;
            this.f192218f = str;
            this.f192219g = f4Var;
            this.f192220h = str2;
            this.f192221i = map;
            this.f192222j = str3;
            this.f192223n = j;
            this.f192224o = j2;
            this.f192225p = bVar2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f192216d.f192194b = new C77407n((Context) this.f192217e.mo91565f(), 1, false);
            MultiProcessMMKV multiProcessMMKV = C66894c.f192192h;
            boolean z = C66894c.f192192h.getBoolean(this.f192218f, false);
            C77407n nVar = this.f192216d.f192194b;
            C87412m.m108591d(nVar);
            C72963f4 f4Var = this.f192219g;
            String str = this.f192220h;
            C66894c cVar = this.f192216d;
            nVar.f225771i = new C66898a(f4Var, z, str, cVar, this.f192221i, this.f192222j);
            C77407n nVar2 = cVar.f192194b;
            C87412m.m108591d(nVar2);
            C66894c cVar2 = this.f192216d;
            nVar2.f225782p = new C66899b(cVar2, this.f192218f, this.f192223n, this.f192217e, this.f192220h, this.f192224o, this.f192225p);
            C77407n nVar3 = cVar2.f192194b;
            if (nVar3 != null) {
                nVar3.mo107573q();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zk3.c$d */
    public static final class C66904d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f192249d;

        public C66904d(C72963f4 f4Var) {
            this.f192249d = f4Var;
        }

        public final void run() {
            C60611o oVar = (C60611o) C86312j.m106911c(C60611o.class);
            C72963f4 f4Var = this.f192249d;
            oVar.mo58914iw(f4Var != null ? f4Var.getMsgId() : -1);
        }
    }

    /* renamed from: zk3.c$e */
    public static final class C66905e extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C72963f4 f192250a;

        /* renamed from: b */
        public final /* synthetic */ String f192251b;

        /* renamed from: c */
        public final /* synthetic */ String f192252c;

        /* renamed from: d */
        public final /* synthetic */ long f192253d;

        /* renamed from: e */
        public final /* synthetic */ String f192254e;

        /* renamed from: f */
        public final /* synthetic */ long f192255f;

        public C66905e(C72963f4 f4Var, String str, String str2, long j, String str3, long j2) {
            this.f192250a = f4Var;
            this.f192251b = str;
            this.f192252c = str2;
            this.f192253d = j;
            this.f192254e = str3;
            this.f192255f = j2;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            byte[] bArr;
            Class cls = C61397g.class;
            Class cls2 = C60606n.class;
            C87412m.m108594g(view, "view");
            if (z) {
                C60611o oVar = (C60611o) C86312j.m106911c(C60611o.class);
                C72963f4 f4Var = this.f192250a;
                C38616n3 T6 = oVar.mo58912T6(f4Var != null ? f4Var.getMsgId() : -1);
                String str = (T6 == null || (bArr = T6.field_businessBuf) == null) ? "" : new String(bArr, C119027c.f356488a);
                String str2 = this.f192251b;
                C87412m.m108593f(str2, "noticeId");
                long j3 = str2.length() == 0 ? 2 : 1;
                C7335d c = C86312j.m106911c(C61568m.class);
                C87412m.m108593f(c, "getService(IHellLiveVisitorReoprter::class.java)");
                C61568m mVar = (C61568m) c;
                C0077k0 k0Var = C0077k0.ExposeMsg;
                String str3 = this.f192252c;
                long j4 = this.f192253d;
                String str4 = T6 != null ? T6.field_forcePushId : null;
                Long valueOf = Long.valueOf(j3);
                String str5 = this.f192254e;
                String str6 = T6 != null ? T6.field_noticeId : null;
                C61568m.C61569a.m72263a(mVar, k0Var, str3, j4, 0, "", str4, valueOf, str, str5, (String) null, (String) null, str6 == null ? "" : str6, (String) null, 0, 0, 30208, (Object) null);
                if (this.f192255f != 0) {
                    C48978cb0 cb02 = new C48978cb0();
                    cb02.f131607d = this.f192255f;
                    cb02.f131608e = this.f192252c;
                    JSONObject jSONObject = new JSONObject();
                    String str7 = this.f192251b;
                    jSONObject.put("feedActionType", 37);
                    jSONObject.put("strValue", str7);
                    cb02.f131610g = jSONObject.toString();
                    ((C58677l) C86312j.m106911c(C58677l.class)).mo75414y((C49712hj1) null, 18054, cb02);
                }
                C64273c21 T70 = ((C60606n) C86312j.m106911c(cls2)).T70(this.f192253d);
                if (((C61397g) C86312j.m106911c(cls)).jx0(this.f192252c, T70)) {
                    ((C61397g) C86312j.m106911c(cls)).mo83473AP(true, this.f192255f, "serve", ((C60606n) C86312j.m106911c(cls2)).Sj0(T70) ? 1 : 2, 0);
                }
            }
        }
    }

    /* renamed from: zk3.c$f */
    public static final class C66906f implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C8478d0 f192256a;

        /* renamed from: b */
        public final /* synthetic */ String f192257b;

        public C66906f(C8478d0 d0Var, String str) {
            this.f192256a = d0Var;
            this.f192257b = str;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C66191d.class;
            Class cls2 = C10383h.class;
            C13604l[] lVarArr = new C13604l[6];
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            C13604l lVar = new C13604l("behaviour_session_id", Wb);
            int i = 0;
            lVarArr[0] = lVar;
            lVarArr[1] = new C13604l("finder_context_id", ((C10383h) C86312j.m106911c(cls2)).mo10696E());
            lVarArr[2] = new C13604l("finder_tab_context_id", ((C10383h) C86312j.m106911c(cls2)).mo10698S0());
            lVarArr[3] = new C13604l("live_enter_status", Long.valueOf(this.f192256a.f27483d == 1 ? ((C66191d) C86312j.m106911c(cls)).mo61350GE() : ((C66191d) C86312j.m106911c(cls)).mo61352JO()));
            lVarArr[4] = new C13604l("share_username", "");
            if (this.f192257b.length() == 0) {
                i = 1;
            }
            lVarArr[5] = new C13604l("live_notice_type", Integer.valueOf(i));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: zk3.c$g */
    public static final class C66907g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f192258d;

        /* renamed from: e */
        public final /* synthetic */ long f192259e;

        /* renamed from: f */
        public final /* synthetic */ String f192260f;

        /* renamed from: g */
        public final /* synthetic */ long f192261g;

        /* renamed from: h */
        public final /* synthetic */ C67391b f192262h;

        /* renamed from: i */
        public final /* synthetic */ String f192263i;

        /* renamed from: j */
        public final /* synthetic */ C72963f4 f192264j;

        /* renamed from: n */
        public final /* synthetic */ C66894c f192265n;

        /* renamed from: o */
        public final /* synthetic */ String f192266o;

        /* renamed from: p */
        public final /* synthetic */ int f192267p;

        public C66907g(String str, long j, String str2, long j2, C67391b bVar, String str3, C72963f4 f4Var, C66894c cVar, String str4, int i) {
            this.f192258d = str;
            this.f192259e = j;
            this.f192260f = str2;
            this.f192261g = j2;
            this.f192262h = bVar;
            this.f192263i = str3;
            this.f192264j = f4Var;
            this.f192265n = cVar;
            this.f192266o = str4;
            this.f192267p = i;
        }

        public final void onClick(View view) {
            int i;
            String str;
            Class cls = C61397g.class;
            Class cls2 = C60606n.class;
            Class cls3 = C60200t1.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$setupUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            try {
                Intent intent = new Intent();
                JSONObject jSONObject = new JSONObject();
                if (this.f192258d.length() == 0) {
                    jSONObject.put("type", 2);
                    str = ((C60200t1) C86312j.m106911c(cls3)).mo76802R1(24, 2, 65);
                    i = 2;
                } else {
                    jSONObject.put("type", 1);
                    jSONObject.put("notice_id", this.f192258d);
                    str = ((C60200t1) C86312j.m106911c(cls3)).mo76802R1(24, 2, 65);
                    i = 1;
                }
                C64273c21 T70 = ((C60606n) C86312j.m106911c(cls2)).T70(this.f192259e);
                if (((C61397g) C86312j.m106911c(cls)).jx0(this.f192260f, T70)) {
                    ((C61397g) C86312j.m106911c(cls)).mo83473AP(false, this.f192261g, "serve", ((C60606n) C86312j.m106911c(cls2)).Sj0(T70) ? 1 : 2, 0);
                    C61397g gVar = (C61397g) C86312j.m106911c(cls);
                    Intent T5 = ((C60200t1) C86312j.m106911c(cls3)).mo76861l7().mo83773T5(intent, "serve", 0);
                    Activity f = this.f192262h.mo91565f();
                    long j = this.f192261g;
                    long j2 = this.f192259e;
                    String str2 = this.f192260f;
                    gVar.mo83482aR(T5, f, j, j2, str2 == null ? "" : str2, this.f192263i, "", str, ((C60200t1) C86312j.m106911c(cls3)).mo76861l7().mo83771R5());
                } else {
                    ((C60603k) C86312j.m106911c(C60603k.class)).Pv0("temp_7");
                    C60611o oVar = (C60611o) C86312j.m106911c(C60611o.class);
                    C72963f4 f4Var = this.f192264j;
                    C38616n3 T6 = oVar.mo58912T6(f4Var != null ? f4Var.getMsgId() : -1);
                    C87412m.m108591d(T6);
                    byte[] bArr = T6.field_businessBuf;
                    if (bArr != null) {
                        String c = this.f192265n.mo90890c();
                        Log.m105924i(c, "source_type:" + bArr);
                        jSONObject.put("source_type", new String(bArr, C119027c.f356488a));
                    }
                    intent.putExtra("key_chnl_extra", jSONObject.toString());
                    C64238ap2 ap22 = new C64238ap2();
                    long j3 = this.f192261g;
                    long j4 = this.f192259e;
                    String str3 = this.f192263i;
                    ap22.f182124d = j3;
                    ap22.f182125e = j4;
                    ap22.f182126f = str3;
                    ap22.f182127g = "";
                    ap22.f182128h = "";
                    ap22.f182129i = "";
                    ap22.f182130j = null;
                    C64279c90 c902 = new C64279c90();
                    int i2 = this.f192267p;
                    c902.f182444d = str;
                    c902.f182445e = "";
                    c902.f182447g = -1;
                    c902.f182448h = -1;
                    c902.f182449i = 1;
                    C64347eq2 eq22 = new C64347eq2();
                    eq22.f183016d = i;
                    eq22.f183028s = i2;
                    c902.f182451n = eq22;
                    Activity f2 = this.f192262h.mo91565f();
                    C87412m.m108593f(f2, "ui.context");
                    String str4 = "";
                    ((C10649f) C86312j.m106911c(C10649f.class)).mo10916tP(f2, intent, ap22, ((C60200t1) C86312j.m106911c(cls3)).mo76861l7().mo83771R5(), c902, (C10649f.C10650a) null);
                    ((C60606n) C86312j.m106911c(cls2)).mo85100ww().mo58256b();
                    ((C61130g) C86312j.m106911c(C61130g.class)).mo33246ry(((C66191d) C86312j.m106911c(C66191d.class)).Ht0());
                    long j5 = this.f192258d.length() == 0 ? 2 : 1;
                    C66894c cVar = this.f192265n;
                    String str5 = this.f192260f;
                    long j6 = this.f192259e;
                    String str6 = this.f192266o;
                    String str7 = T6.field_noticeId;
                    cVar.mo90891d(str5, j6, T6, j5, str6, str7 == null ? str4 : str7);
                }
            } catch (Throwable th) {
                String c2 = this.f192265n.mo90890c();
                Log.m105924i(c2, "click ,err msg: " + th.getMessage());
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$setupUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a */
    public void mo90889a(C57761h6.C57762a aVar, Map<String, String> map, C72963f4 f4Var, C67391b bVar) {
        C57761h6.C57762a aVar2 = aVar;
        Map<String, String> map2 = map;
        C87412m.m108594g(map2, "values");
        C87412m.m108594g(bVar, "ui");
        C66896b bVar2 = aVar2 != null ? (C66896b) aVar2.mo82215a("TipsTempl_MultiReason_Live") : null;
        long P = C61926c.m72671P(Util.nullAsNil(map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id")));
        long P2 = C61926c.m72671P(Util.nullAsNil(map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id")));
        String str = map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_nonce_id");
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String nullAsNil = Util.nullAsNil(str);
        C87412m.m108593f(nullAsNil, "nullAsNil(values[\"$xmlPr….object_nonce_id\"] ?: \"\")");
        String str3 = map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.tips_id");
        if (str3 == null) {
            str3 = str2;
        }
        String nullAsNil2 = Util.nullAsNil(str3);
        C87412m.m108593f(nullAsNil2, "nullAsNil(values[\"$xmlPr…tipsinfo.tips_id\"] ?: \"\")");
        String str4 = map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.notice_id");
        if (str4 != null) {
            str2 = str4;
        }
        String nullAsNil3 = Util.nullAsNil(str2);
        String nullAsNil4 = Util.nullAsNil(map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.finder_username"));
        String nullAsNil5 = Util.nullAsNil(map2.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.msg_type"));
        boolean z = f192192h.getBoolean(nullAsNil4, false);
        String c = mo90890c();
        Log.m105924i(c, "msgType: " + nullAsNil5 + ", " + Util.safeParseInt(nullAsNil5));
        C87412m.m108593f(nullAsNil3, "noticeId");
        String str5 = nullAsNil5;
        String str6 = nullAsNil3;
        String str7 = nullAsNil4;
        String str8 = nullAsNil2;
        mo90894e(map, ".msg.appmsg.extinfo.notifymsg", bVar2, z, nullAsNil3, bVar, P, P2, nullAsNil, f4Var, str7, str8, Util.safeParseInt(nullAsNil5));
        C66896b bVar3 = bVar2;
        View view = bVar3.f192209e;
        if (view != null) {
            view.setOnClickListener(new C66897c(this, bVar, str7, f4Var, str5, map, ".msg.appmsg.extinfo.notifymsg", P2, P, bVar3));
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C66904d(f4Var));
        View view2 = bVar3.f192205a;
        if (view2 != null) {
            C23564m.m28138h(view2, new C66905e(f4Var, str6, str7, P2, str8, P));
        }
    }

    /* renamed from: b */
    public C66908d.C66909a mo90893b() {
        return this.f192199g;
    }

    /* renamed from: c */
    public String mo90890c() {
        return this.f192193a;
    }

    /* renamed from: d */
    public void mo90891d(String str, long j, C38616n3 n3Var, long j2, String str2, String str3) {
        C38616n3 n3Var2 = n3Var;
        C87412m.m108594g(n3Var2, "info");
        C87412m.m108594g(str2, "tipsId");
        C87412m.m108594g(str3, "noticeId");
        C7335d c = C86312j.m106911c(C61568m.class);
        C87412m.m108593f(c, "getService(IHellLiveVisitorReoprter::class.java)");
        C0077k0 k0Var = C0077k0.Click;
        String str4 = n3Var2.field_forcePushId;
        Long valueOf = Long.valueOf(j2);
        byte[] bArr = n3Var2.field_businessBuf;
        C87412m.m108593f(bArr, "info.field_businessBuf");
        String str5 = r6;
        String str6 = new String(bArr, C119027c.f356488a);
        C61568m.C61569a.m72263a((C61568m) c, k0Var, str, j, 0, "", str4, valueOf, str5, str2, (String) null, (String) null, str3, (String) null, 0, 0, 30208, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x05fd  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x061f  */
    /* JADX WARNING: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0283  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90894e(java.util.Map<java.lang.String, java.lang.String> r34, java.lang.String r35, zk3.C66894c.C66896b r36, boolean r37, java.lang.String r38, ck3.C67391b r39, long r40, long r42, java.lang.String r44, com.tencent.p014mm.storage.C72963f4 r45, java.lang.String r46, java.lang.String r47, int r48) {
        /*
            r33 = this;
            r1 = r34
            r2 = r35
            r10 = r36
            r12 = r38
            r15 = r46
            java.lang.Class<ir.n> r0 = p565ir.C60606n.class
            java.lang.Class<pl1.t0> r3 = pl1.C62368t0.class
            java.lang.Class<l31.e> r11 = l31.C61212e.class
            java.lang.String r4 = "values"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "xmlPrefix"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "noticeId"
            gy3.C87412m.m108594g(r12, r4)
            java.lang.String r4 = "ui"
            r13 = r39
            gy3.C87412m.m108594g(r13, r4)
            java.lang.String r4 = "nonceId"
            r14 = r44
            gy3.C87412m.m108594g(r14, r4)
            java.lang.String r4 = "tipsId"
            r9 = r47
            gy3.C87412m.m108594g(r9, r4)
            pl1.e0 r4 = pl1.C11978e0.f34938a
            k60.d r5 = r4.mo11849a()
            di3.d r6 = di3.C86312j.m106911c(r3)
            pl1.t0 r6 = (pl1.C62368t0) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r8 = ".title.avatar"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.Object r7 = r1.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
            java.lang.String r8 = "nullAsNil(values[\"$xmlPrefix.title.avatar\"])"
            gy3.C87412m.m108593f(r7, r8)
            up1.y r8 = up1.C27696y.THUMB_IMAGE
            pl1.g0 r6 = r6.mo87412UE(r7, r8)
            if (r10 == 0) goto L_0x006f
            android.widget.ImageView r7 = r10.f192206b
            goto L_0x0070
        L_0x006f:
            r7 = 0
        L_0x0070:
            gy3.C87412m.m108591d(r7)
            pl1.e0$a r9 = pl1.C11978e0.C11979a.AVATAR_WITHOUT_DEFAULT
            n60.f r13 = r4.mo11851c(r9)
            r5.mo85957c(r6, r7, r13)
            android.widget.TextView r5 = r10.f192207c
            if (r5 != 0) goto L_0x0081
            goto L_0x009f
        L_0x0081:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r7 = ".title.nickname"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            r5.setText(r6)
        L_0x009f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r6 = ".title.icon_url"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r13 = 1
            r7 = 0
            if (r5 == 0) goto L_0x00ee
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x00c2
            r6 = 1
            goto L_0x00c3
        L_0x00c2:
            r6 = 0
        L_0x00c3:
            if (r6 == 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r5 = 0
        L_0x00c7:
            if (r5 == 0) goto L_0x00ee
            k60.d r6 = r4.mo11849a()
            di3.d r3 = di3.C86312j.m106911c(r3)
            pl1.t0 r3 = (pl1.C62368t0) r3
            pl1.g0 r3 = r3.mo87412UE(r5, r8)
            android.widget.ImageView r5 = r10.f192208d
            gy3.C87412m.m108591d(r5)
            n60.f r4 = r4.mo11851c(r9)
            r6.mo85957c(r3, r5, r4)
            android.widget.ImageView r3 = r10.f192208d
            if (r3 != 0) goto L_0x00e8
            goto L_0x00eb
        L_0x00e8:
            r3.setVisibility(r7)
        L_0x00eb:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x00ef
        L_0x00ee:
            r3 = 0
        L_0x00ef:
            r9 = 8
            if (r3 != 0) goto L_0x00fb
            android.widget.ImageView r3 = r10.f192208d
            if (r3 != 0) goto L_0x00f8
            goto L_0x00fb
        L_0x00f8:
            r3.setVisibility(r9)
        L_0x00fb:
            android.view.View r3 = r10.f192215k
            if (r3 != 0) goto L_0x0100
            goto L_0x0149
        L_0x0100:
            if (r37 == 0) goto L_0x0104
            r4 = 0
            goto L_0x0106
        L_0x0104:
            r4 = 8
        L_0x0106:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.mo10233c(r4)
            java.lang.Object[] r18 = r5.mo10232b()
            java.lang.String r19 = "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1"
            java.lang.String r20 = "setupUI$app_release"
            java.lang.String r21 = "(Ljava/util/Map;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1;ZLjava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;JJLjava/lang/String;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;Ljava/lang/String;I)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r3
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r4 = r5.mo10231a(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r18 = "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1"
            java.lang.String r19 = "setupUI$app_release"
            java.lang.String r20 = "(Ljava/util/Map;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1;ZLjava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;JJLjava/lang/String;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;Ljava/lang/String;I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x0149:
            android.widget.TextView r3 = r10.f192210f
            if (r3 != 0) goto L_0x014e
            goto L_0x016c
        L_0x014e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r5 = ".header"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r3.setText(r4)
        L_0x016c:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r5 = ".display_list.ext_item"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = r4
            r6 = 1
        L_0x0184:
            boolean r8 = r1.containsKey(r5)
            java.lang.String r7 = ".content"
            if (r8 == 0) goto L_0x01e6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.Object r7 = r1.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r22 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = ".reason"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r23 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            if (r22 == 0) goto L_0x01d4
            if (r23 == 0) goto L_0x01d4
            zk3.c$a r5 = new zk3.c$a
            r21 = 0
            java.lang.String r19 = ""
            java.lang.String r20 = ""
            r18 = r5
            r18.<init>(r19, r20, r21, r22, r23)
            r3.add(r5)
        L_0x01d4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r6 = r6 + r13
            r7 = 0
            goto L_0x0184
        L_0x01e6:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x027f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r5 = ".display_list.item"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = r4
            r6 = 1
        L_0x01ff:
            boolean r8 = r1.containsKey(r5)
            if (r8 == 0) goto L_0x027f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r9 = ".topic"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r8 = r1.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r20 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.Object r8 = r1.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r21 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = ".maxline"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            if (r20 == 0) goto L_0x026c
            if (r21 == 0) goto L_0x026c
            if (r5 == 0) goto L_0x026c
            zk3.c$a r8 = new zk3.c$a
            int r22 = com.tencent.p014mm.sdk.platformtools.StringKtKt.safeToInt(r5)
            java.lang.String r23 = ""
            java.lang.String r24 = ""
            r19 = r8
            r19.<init>(r20, r21, r22, r23, r24)
            r3.add(r8)
        L_0x026c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r6 = r6 + r13
            r9 = 8
            goto L_0x01ff
        L_0x027f:
            android.view.View r4 = r10.f192205a
            if (r4 == 0) goto L_0x0380
            android.widget.LinearLayout r5 = r10.f192211g
            if (r5 == 0) goto L_0x028a
            r5.removeAllViews()
        L_0x028a:
            java.util.Iterator r3 = r3.iterator()
        L_0x028e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0380
            java.lang.Object r5 = r3.next()
            zk3.c$a r5 = (zk3.C66894c.C66895a) r5
            java.lang.String r6 = r5.f192203d
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x02a4
            r6 = 1
            goto L_0x02a5
        L_0x02a4:
            r6 = 0
        L_0x02a5:
            r7 = 2131306438(0x7f0927c6, float:1.8231075E38)
            r8 = 2131306433(0x7f0927c1, float:1.8231065E38)
            r13 = 2131495110(0x7f0c08c6, float:1.8613747E38)
            if (r6 != 0) goto L_0x02f5
            java.lang.String r6 = r5.f192204e
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x02ba
            r6 = 1
            goto L_0x02bb
        L_0x02ba:
            r6 = 0
        L_0x02bb:
            if (r6 == 0) goto L_0x02be
            goto L_0x02f5
        L_0x02be:
            android.content.Context r6 = r4.getContext()
            android.view.LayoutInflater r6 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r6)
            r9 = 0
            android.view.View r6 = r6.inflate(r13, r9)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x02d8
            java.lang.String r9 = r5.f192200a
            r8.setText(r9)
        L_0x02d8:
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x02ec
            java.lang.String r8 = r5.f192201b
            r7.setText(r8)
            int r5 = r5.f192202c
            if (r5 == 0) goto L_0x02ec
            r7.setMaxLines(r5)
        L_0x02ec:
            android.widget.LinearLayout r5 = r10.f192211g
            if (r5 == 0) goto L_0x037d
            r5.addView(r6)
            goto L_0x037d
        L_0x02f5:
            java.lang.String r6 = r5.f192203d
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x02ff
            r6 = 1
            goto L_0x0300
        L_0x02ff:
            r6 = 0
        L_0x0300:
            if (r6 == 0) goto L_0x0335
            android.content.Context r6 = r4.getContext()
            android.view.LayoutInflater r6 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r6)
            r9 = 0
            android.view.View r6 = r6.inflate(r13, r9)
            android.view.View r9 = r6.findViewById(r8)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 != 0) goto L_0x0318
            goto L_0x031d
        L_0x0318:
            r8 = 8
            r9.setVisibility(r8)
        L_0x031d:
            android.view.View r8 = r6.findViewById(r7)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x032e
            r9 = 4
            r8.setMaxLines(r9)
            java.lang.String r9 = r5.f192203d
            r8.setText(r9)
        L_0x032e:
            android.widget.LinearLayout r8 = r10.f192211g
            if (r8 == 0) goto L_0x0335
            r8.addView(r6)
        L_0x0335:
            java.lang.String r6 = r5.f192204e
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x033f
            r6 = 1
            goto L_0x0340
        L_0x033f:
            r6 = 0
        L_0x0340:
            if (r6 == 0) goto L_0x037d
            android.content.Context r6 = r4.getContext()
            android.view.LayoutInflater r6 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r6)
            r8 = 0
            android.view.View r6 = r6.inflate(r13, r8)
            r9 = 2131306433(0x7f0927c1, float:1.8231065E38)
            android.view.View r9 = r6.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x0368
            r13 = 1
            r9.setMaxLines(r13)
            java.lang.String r5 = r5.f192204e
            r9.setText(r5)
            r5 = 1094713344(0x41400000, float:12.0)
            r9.setTextSize(r13, r5)
        L_0x0368:
            android.view.View r5 = r6.findViewById(r7)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 != 0) goto L_0x0371
            goto L_0x0376
        L_0x0371:
            r7 = 8
            r5.setVisibility(r7)
        L_0x0376:
            android.widget.LinearLayout r5 = r10.f192211g
            if (r5 == 0) goto L_0x037d
            r5.addView(r6)
        L_0x037d:
            r13 = 1
            goto L_0x028e
        L_0x0380:
            android.view.View r3 = r10.f192212h
            if (r3 != 0) goto L_0x0388
            r7 = 0
            r9 = 8
            goto L_0x03ce
        L_0x0388:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r9 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r4.mo10233c(r5)
            java.lang.Object[] r21 = r4.mo10232b()
            java.lang.String r22 = "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1"
            java.lang.String r23 = "setupUI$app_release"
            java.lang.String r24 = "(Ljava/util/Map;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1;ZLjava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;JJLjava/lang/String;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;Ljava/lang/String;I)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r3
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r7 = 0
            java.lang.Object r4 = r4.mo10231a(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r21 = "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1"
            java.lang.String r22 = "setupUI$app_release"
            java.lang.String r23 = "(Ljava/util/Map;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1;ZLjava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;JJLjava/lang/String;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;Ljava/lang/String;I)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
        L_0x03ce:
            gy3.d0 r13 = new gy3.d0
            r13.<init>()
            r3 = -1
            r13.f27483d = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r4 = ".live_widget.thumb_url"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r1.get(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r5 = ".live_widget.status"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object r4 = r1.get(r4)
            if (r3 == 0) goto L_0x049a
            if (r4 == 0) goto L_0x049a
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = (java.lang.String) r3
            int r5 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0483 }
            r13.f27483d = r5     // Catch:{ NumberFormatException -> 0x0483 }
            di3.d r5 = di3.C86312j.m106911c(r0)     // Catch:{ NumberFormatException -> 0x0483 }
            ir.n r5 = (p565ir.C60606n) r5     // Catch:{ NumberFormatException -> 0x0483 }
            r16 = r13
            r12 = r42
            te3.c21 r5 = r5.T70(r12)     // Catch:{ NumberFormatException -> 0x047b }
            java.lang.String r6 = "nullAsNil(url)"
            if (r5 != 0) goto L_0x0457
            r0 = 1
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)     // Catch:{ NumberFormatException -> 0x047b }
            gy3.C87412m.m108593f(r8, r6)     // Catch:{ NumberFormatException -> 0x047b }
            int r3 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x047b }
            r4 = 1
            if (r3 != r4) goto L_0x0444
            ks3.k r17 = ks3.C61161k.Living     // Catch:{ NumberFormatException -> 0x047b }
            r3 = r36
            r4 = r0
            r5 = r42
            r24 = 0
            r7 = r47
            r18 = 4
            r20 = 8
            r9 = r17
            r3.mo90901d(r4, r5, r7, r8, r9)     // Catch:{ NumberFormatException -> 0x0479 }
            goto L_0x04a4
        L_0x0444:
            r18 = 4
            r20 = 8
            r24 = 0
            ks3.k r9 = ks3.C61161k.LiveEnd     // Catch:{ NumberFormatException -> 0x0479 }
            r4 = 1
            r3 = r36
            r5 = r42
            r7 = r47
            r3.mo90901d(r4, r5, r7, r8, r9)     // Catch:{ NumberFormatException -> 0x0479 }
            goto L_0x04a4
        L_0x0457:
            r18 = 4
            r20 = 8
            r24 = 0
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ NumberFormatException -> 0x0479 }
            ir.n r0 = (p565ir.C60606n) r0     // Catch:{ NumberFormatException -> 0x0479 }
            ks3.k r9 = r0.jv0(r15, r5)     // Catch:{ NumberFormatException -> 0x0479 }
            r4 = 2
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)     // Catch:{ NumberFormatException -> 0x0479 }
            gy3.C87412m.m108593f(r8, r6)     // Catch:{ NumberFormatException -> 0x0479 }
            r3 = r36
            r5 = r42
            r7 = r47
            r3.mo90901d(r4, r5, r7, r8, r9)     // Catch:{ NumberFormatException -> 0x0479 }
            goto L_0x04a4
        L_0x0479:
            r0 = move-exception
            goto L_0x048e
        L_0x047b:
            r0 = move-exception
            r18 = 4
            r20 = 8
            r24 = 0
            goto L_0x048e
        L_0x0483:
            r0 = move-exception
            r16 = r13
            r18 = 4
            r20 = 8
            r24 = 0
            r12 = r42
        L_0x048e:
            java.lang.String r3 = r33.mo90890c()
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x04a4
        L_0x049a:
            r16 = r13
            r18 = 4
            r20 = 8
            r24 = 0
            r12 = r42
        L_0x04a4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ".tail"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            java.lang.String r1 = "tailStr"
            gy3.C87412m.m108593f(r0, r1)
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x04cd
            r7 = 1
            goto L_0x04ce
        L_0x04cd:
            r7 = 0
        L_0x04ce:
            if (r7 == 0) goto L_0x0523
            android.view.View r1 = r10.f192214j
            if (r1 != 0) goto L_0x04d6
            r3 = 0
            goto L_0x051a
        L_0x04d6:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
            r2.mo10233c(r3)
            java.lang.Object[] r26 = r2.mo10232b()
            java.lang.String r27 = "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1"
            java.lang.String r28 = "setupUI$app_release"
            java.lang.String r29 = "(Ljava/util/Map;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1;ZLjava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;JJLjava/lang/String;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;Ljava/lang/String;I)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r1
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r26 = "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1"
            java.lang.String r27 = "setupUI$app_release"
            java.lang.String r28 = "(Ljava/util/Map;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1;ZLjava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;JJLjava/lang/String;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;Ljava/lang/String;I)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
        L_0x051a:
            android.widget.TextView r1 = r10.f192213i
            if (r1 != 0) goto L_0x051f
            goto L_0x056c
        L_0x051f:
            r1.setText(r0)
            goto L_0x056c
        L_0x0523:
            r3 = 0
            android.view.View r0 = r10.f192214j
            if (r0 != 0) goto L_0x0529
            goto L_0x056c
        L_0x0529:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r1.mo10233c(r2)
            java.lang.Object[] r21 = r1.mo10232b()
            java.lang.String r22 = "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1"
            java.lang.String r23 = "setupUI$app_release"
            java.lang.String r24 = "(Ljava/util/Map;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1;ZLjava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;JJLjava/lang/String;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;Ljava/lang/String;I)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r0
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r21 = "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1"
            java.lang.String r22 = "setupUI$app_release"
            java.lang.String r23 = "(Ljava/util/Map;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1;ZLjava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;JJLjava/lang/String;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;Ljava/lang/String;I)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
        L_0x056c:
            android.view.View r0 = r10.f192205a
            if (r0 == 0) goto L_0x05f7
            di3.d r1 = di3.C86312j.m106911c(r11)
            l31.e r1 = (l31.C61212e) r1
            java.lang.String r2 = "live_room_card"
            r1.o30(r0, r2)
            di3.d r1 = di3.C86312j.m106911c(r11)
            l31.e r1 = (l31.C61212e) r1
            r2 = 40
            r4 = 26236(0x667c, float:3.6764E-41)
            r1.mo86175pO(r0, r2, r4)
            java.lang.Class<wt.d> r1 = p744wt.C66191d.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            wt.d r1 = (p744wt.C66191d) r1
            java.lang.String r1 = r1.Ht0()
            di3.d r2 = di3.C86312j.m106911c(r11)
            l31.e r2 = (l31.C61212e) r2
            r4 = 5
            rx3.l[] r4 = new rx3.C13604l[r4]
            java.lang.String r5 = o40.C61926c.m72691p(r40)
            rx3.l r6 = new rx3.l
            java.lang.String r7 = "feed_id"
            r6.<init>(r7, r5)
            r4[r3] = r6
            java.lang.String r5 = o40.C61926c.m72691p(r42)
            rx3.l r6 = new rx3.l
            java.lang.String r7 = "live_id"
            r6.<init>(r7, r5)
            r5 = 1
            r4[r5] = r6
            r5 = 2
            rx3.l r6 = new rx3.l
            java.lang.String r7 = "comment_scene"
            r6.<init>(r7, r1)
            r4[r5] = r6
            r1 = 3
            java.lang.String r5 = ""
            if (r15 != 0) goto L_0x05c9
            r6 = r5
            goto L_0x05ca
        L_0x05c9:
            r6 = r15
        L_0x05ca:
            rx3.l r7 = new rx3.l
            java.lang.String r8 = "finder_username"
            r7.<init>(r8, r6)
            r4[r1] = r7
            rx3.l r1 = new rx3.l
            java.lang.String r6 = "session_buffer"
            r1.<init>(r6, r5)
            r4[r18] = r1
            java.util.Map r1 = sx3.C90364q0.m113147f(r4)
            r2.mo86149PM(r0, r1)
            di3.d r1 = di3.C86312j.m106911c(r11)
            l31.e r1 = (l31.C61212e) r1
            zk3.c$f r2 = new zk3.c$f
            r4 = r38
            r5 = r16
            r2.<init>(r5, r4)
            r1.E60(r0, r2)
            goto L_0x05f9
        L_0x05f7:
            r4 = r38
        L_0x05f9:
            android.view.View r0 = r10.f192205a
            if (r0 == 0) goto L_0x061a
            zk3.c$g r1 = new zk3.c$g
            r11 = r1
            r12 = r38
            r13 = r42
            r15 = r46
            r16 = r40
            r18 = r39
            r19 = r44
            r20 = r45
            r21 = r33
            r22 = r47
            r23 = r48
            r11.<init>(r12, r13, r15, r16, r18, r19, r20, r21, r22, r23)
            r0.setOnClickListener(r1)
        L_0x061a:
            android.view.View r0 = r10.f192209e
            if (r0 != 0) goto L_0x061f
            goto L_0x067c
        L_0x061f:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1.mo10233c(r2)
            java.lang.Object[] r2 = r1.mo10232b()
            java.lang.String r4 = "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1"
            java.lang.String r5 = "setupUI$app_release"
            java.lang.String r6 = "(Ljava/util/Map;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1;ZLjava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;JJLjava/lang/String;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;Ljava/lang/String;I)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r34 = r0
            r35 = r2
            r36 = r4
            r37 = r5
            r38 = r6
            r39 = r7
            r40 = r8
            r41 = r9
            j20.C117292a.m165358d(r34, r35, r36, r37, r38, r39, r40, r41)
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r1 = "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1"
            java.lang.String r2 = "setupUI$app_release"
            java.lang.String r3 = "(Ljava/util/Map;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1;ZLjava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;JJLjava/lang/String;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;Ljava/lang/String;I)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            r35 = r1
            r36 = r2
            r37 = r3
            r38 = r4
            r39 = r5
            r40 = r6
            j20.C117292a.m165359e(r34, r35, r36, r37, r38, r39, r40)
        L_0x067c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zk3.C66894c.mo90894e(java.util.Map, java.lang.String, zk3.c$b, boolean, java.lang.String, ck3.b, long, long, java.lang.String, com.tencent.mm.storage.f4, java.lang.String, java.lang.String, int):void");
    }
}
