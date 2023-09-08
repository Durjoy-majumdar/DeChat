package com.tencent.p014mm.plugin.finder.storage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import dp1.C58417y0;
import dq1.C7461a;
import er1.C58684b;
import er1.C58784w3;
import er1.C7878t0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C64273c21;
import te3.C64284cg;
import ve1.C14467b3;
import ve1.C14548j3;
import ve1.C14590p;
import ve1.C14632t2;
import ve1.C14633t3;
import ve1.C14648u3;
import ve1.C14650u6;
import ve1.C14706z2;
import we1.C15155a;

/* renamed from: com.tencent.mm.plugin.finder.storage.FinderConfigForNewLiveCardStyle */
public final class FinderConfigForNewLiveCardStyle extends FinderStaggeredConfig {

    /* renamed from: d */
    public final Context f16707d;

    /* renamed from: e */
    public final FinderVideoCore f16708e;

    /* renamed from: com.tencent.mm.plugin.finder.storage.FinderConfigForNewLiveCardStyle$a */
    public static final class C3618a extends C14633t3 {

        /* renamed from: t */
        public final /* synthetic */ C32228q<C60905o, BaseFinderFeed, Integer, C13598b0> f16709t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3618a(C32228q<? super C60905o, ? super BaseFinderFeed, ? super Integer, C13598b0> qVar, int i, C7461a aVar, FinderVideoCore finderVideoCore) {
            super(i, aVar, finderVideoCore, (C32229r) null, 8, (C8480h) null);
            this.f16709t = qVar;
        }

        /* renamed from: l */
        public void mo3149l(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(baseFinderFeed, "item");
            super.mo3149l(oVar, baseFinderFeed, i, i2, z, list);
            C32228q<C60905o, BaseFinderFeed, Integer, C13598b0> qVar = this.f16709t;
            if (qVar != null) {
                qVar.invoke(oVar, baseFinderFeed, Integer.valueOf(i));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.storage.FinderConfigForNewLiveCardStyle$b */
    public static final class C3619b extends C14648u3 {

        /* renamed from: s */
        public final /* synthetic */ C32228q<C60905o, BaseFinderFeed, Integer, C13598b0> f16710s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3619b(C32228q<? super C60905o, ? super BaseFinderFeed, ? super Integer, C13598b0> qVar, int i, C7461a aVar) {
            super(i, aVar, (C32229r) null, (C32224a) null, 12, (C8480h) null);
            this.f16710s = qVar;
        }

        /* renamed from: l */
        public void mo44e(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(baseFinderFeed, "item");
            super.mo3149l(oVar, baseFinderFeed, i, i2, z, list);
            C32228q<C60905o, BaseFinderFeed, Integer, C13598b0> qVar = this.f16710s;
            if (qVar != null) {
                qVar.invoke(oVar, baseFinderFeed, Integer.valueOf(i));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.storage.FinderConfigForNewLiveCardStyle$c */
    public static final class C3620c extends C15155a {

        /* renamed from: i */
        public final /* synthetic */ FinderConfigForNewLiveCardStyle f16711i;

        /* renamed from: j */
        public final /* synthetic */ C32228q<C60905o, BaseFinderFeed, Integer, C13598b0> f16712j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3620c(FinderConfigForNewLiveCardStyle finderConfigForNewLiveCardStyle, C32228q<? super C60905o, ? super BaseFinderFeed, ? super Integer, C13598b0> qVar, float f, C3621d dVar) {
            super(f, false, false, dVar);
            this.f16711i = finderConfigForNewLiveCardStyle;
            this.f16712j = qVar;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C60905o oVar2 = oVar;
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) cVar;
            C87412m.m108594g(oVar2, "holder");
            C87412m.m108594g(baseFinderFeed, "item");
            super.mo14107l(oVar, baseFinderFeed, i, i2, z, list);
            this.f16711i.getClass();
            View D = oVar2.mo85812D(C0966R.C0970id.dv8);
            TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.if8);
            TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.lkm);
            View D2 = oVar2.mo85812D(C0966R.C0970id.dv9);
            C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
            boolean z2 = true;
            if (liveInfo == null || liveInfo.f182394f != 1) {
                z2 = false;
            }
            if (z2) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = D;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderConfigForNewLiveCardStyle", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/storage/FinderConfigForNewLiveCardStyle", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c((Object) null);
                View view2 = D2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderConfigForNewLiveCardStyle", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/storage/FinderConfigForNewLiveCardStyle", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                String str = baseFinderFeed.mo3513o().getFeedObject().recommendReason;
                if (str == null) {
                    str = "";
                }
                if (TextUtils.isEmpty(str)) {
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view3 = D;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderConfigForNewLiveCardStyle", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/storage/FinderConfigForNewLiveCardStyle", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    textView.setText(str);
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c((Object) null);
                    View view4 = D;
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderConfigForNewLiveCardStyle", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/storage/FinderConfigForNewLiveCardStyle", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C64273c21 liveInfo2 = baseFinderFeed.mo3513o().getLiveInfo();
                int i3 = liveInfo2 != null ? liveInfo2.f182403q : 0;
                if (i3 > 0) {
                    textView2.setText(String.valueOf(C7878t0.m8032a(i3)));
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                }
            } else {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view5 = D2;
                C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderConfigForNewLiveCardStyle", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/storage/FinderConfigForNewLiveCardStyle", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((TextView) oVar2.mo85812D(C0966R.C0970id.d86)).setVisibility(8);
            C32228q<C60905o, BaseFinderFeed, Integer, C13598b0> qVar = this.f16712j;
            if (qVar != null) {
                qVar.invoke(oVar2, baseFinderFeed, Integer.valueOf(i));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.storage.FinderConfigForNewLiveCardStyle$d */
    public static final class C3621d extends C87413o implements C32227p<BaseFinderFeed, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderConfigForNewLiveCardStyle f16713d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3621d(FinderConfigForNewLiveCardStyle finderConfigForNewLiveCardStyle) {
            super(2);
            this.f16713d = finderConfigForNewLiveCardStyle;
        }

        public Object invoke(Object obj, Object obj2) {
            String str;
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) obj;
            String str2 = (String) obj2;
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(str2, "username");
            Context context = this.f16713d.f16707d;
            Class cls = C58417y0.class;
            C64284cg bizInfo = baseFinderFeed.mo3513o().getBizInfo();
            C13598b0 b0Var = null;
            if (bizInfo != null) {
                Log.m105924i("FinderConfigForNewLiveCardStyle", "jumpBizProfile: bizUsername = " + bizInfo.f182468d);
                String str3 = bizInfo.f182468d;
                if (str3 == null) {
                    str3 = "";
                }
                Intent intent = new Intent();
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                C13442s8.C13443a.m12791e(aVar, context, intent, baseFinderFeed.getItemId(), (String) null, 0, 5, false, 0, 192, (Object) null);
                intent.putExtra("Contact_User", str3);
                intent.putExtra("Contact_Scene", 213);
                boolean z = true;
                intent.putExtra("biz_profile_enter_from_finder", true);
                intent.putExtra("force_get_contact", true);
                intent.putExtra("key_use_new_contact_profile", true);
                intent.putExtra("biz_profile_tab_type", 1);
                String str4 = baseFinderFeed.mo3513o().getFeedObject().sessionBuffer;
                int i = 0;
                if (!(str4 == null || str4.length() == 0)) {
                    z = false;
                }
                if (z) {
                    C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                    long itemId = baseFinderFeed.getItemId();
                    C13442s8 f = aVar.mo12873f(context);
                    if (f != null) {
                        i = f.f38096i;
                    }
                    str = y0Var.mo83281Cu(itemId, i);
                } else {
                    str = baseFinderFeed.mo3513o().getFeedObject().sessionBuffer;
                }
                intent.putExtra("Contact_Scene_Note", str);
                C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Intent intent2 = new Intent();
                intent2.putExtra("finder_username", str2);
                C13442s8.C13443a.m12791e(C13442s8.f38060Q0, context, intent2, baseFinderFeed.getItemId(), (String) null, 0, 1, false, 0, 192, (Object) null);
                ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context, intent2);
            }
            C13442s8 f2 = C13442s8.f38060Q0.mo12873f(context);
            if (f2 != null) {
                ((C58417y0) C86312j.m106911c(cls)).yx0(4, baseFinderFeed.getItemId(), f2.f38096i, 1, str2);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.storage.FinderConfigForNewLiveCardStyle$e */
    public static final class C3622e extends C14632t2 {

        /* renamed from: s */
        public final /* synthetic */ C32228q<C60905o, BaseFinderFeed, Integer, C13598b0> f16714s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3622e(C32228q<? super C60905o, ? super BaseFinderFeed, ? super Integer, C13598b0> qVar, int i, C7461a aVar) {
            super(i, aVar, (C32229r) null, (C32224a) null, 12, (C8480h) null);
            this.f16714s = qVar;
        }

        /* renamed from: l */
        public void mo44e(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(baseFinderFeed, "item");
            super.mo3149l(oVar, baseFinderFeed, i, i2, z, list);
            C32228q<C60905o, BaseFinderFeed, Integer, C13598b0> qVar = this.f16714s;
            if (qVar != null) {
                qVar.invoke(oVar, baseFinderFeed, Integer.valueOf(i));
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FinderConfigForNewLiveCardStyle(android.content.Context r1, dq1.C7461a r2, int r3, com.tencent.p014mm.plugin.finder.video.FinderVideoCore r4, int r5, gy3.C8480h r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            dq1.a r2 = new dq1.a
            r2.<init>()
            r6 = 0
            r2.f25670b = r6
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0011
            r3 = -1
        L_0x0011:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0016
            r4 = 0
        L_0x0016:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.storage.FinderConfigForNewLiveCardStyle.<init>(android.content.Context, dq1.a, int, com.tencent.mm.plugin.finder.video.FinderVideoCore, int, gy3.h):void");
    }

    /* renamed from: b */
    public C9500j mo3010b(C32226l<? super Integer, ? extends C60896i<?>> lVar) {
        return new FinderConfigForNewLiveCardStyle$getItemConvertFactory$1(this, lVar);
    }

    /* renamed from: g */
    public final C60896i<?> mo4003g(int i, C32226l<? super Integer, ? extends C60896i<?>> lVar, C32228q<? super C60905o, ? super BaseFinderFeed, ? super Integer, C13598b0> qVar) {
        C60896i<?> iVar;
        C60896i<?> iVar2;
        if (i == -12) {
            return new C14650u6();
        }
        if (i == -7) {
            return new C14467b3();
        }
        if (i == -5) {
            return new C14706z2();
        }
        if (i == -3) {
            return new C14548j3();
        }
        if (i != 2) {
            if (i != 4) {
                if (i == 9) {
                    iVar = new C3620c(this, qVar, MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3723cd), new C3621d(this));
                    return iVar;
                } else if (i != 3001) {
                    if (i != 3002) {
                        if (lVar != null && (iVar2 = (C60896i) lVar.invoke(Integer.valueOf(i))) != null) {
                            return iVar2;
                        }
                        C58784w3.f168295a.mo83916b("FinderStaggeredConfig", i);
                        return new C14590p();
                    }
                }
            }
            FinderVideoCore finderVideoCore = this.f16708e;
            if (finderVideoCore != null) {
                return new C3618a(qVar, this.f16723a, this.f16724b, finderVideoCore);
            }
            iVar = new C3619b(qVar, this.f16723a, this.f16724b);
            return iVar;
        }
        iVar = new C3622e(qVar, this.f16723a, this.f16724b);
        return iVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderConfigForNewLiveCardStyle(Context context, C7461a aVar, int i, FinderVideoCore finderVideoCore) {
        super(i, aVar);
        C87412m.m108594g(context, "baseContext");
        C87412m.m108594g(aVar, "itemViewConfig");
        this.f16707d = context;
        this.f16708e = finderVideoCore;
    }
}
