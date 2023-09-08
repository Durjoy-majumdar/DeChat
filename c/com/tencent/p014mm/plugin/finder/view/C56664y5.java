package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.finder_page_exposeStruct;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import ei3.C86522b;
import er1.C45690w4;
import er1.C58759o4;
import fe1.C58969q;
import ft3.C45807d;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import hp3.C87581a;
import ht1.C60187m5;
import ht1.C60200t1;
import ht1.C60208v1;
import ht1.C60216z4;
import ht1.C76246h5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import jp3.C9486a;
import jp3.C9487b;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import o40.C61926c;
import ob0.C89132b;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C64186f0;
import sx3.C90364q0;
import te3.C49712hj1;
import te3.C49849ii0;
import te3.C50405mi0;
import te3.C50564nm0;
import te3.C51129rn0;
import te3.fp4;
import te3.hp4;
import zc1.C66785b;
import zt3.C119157j;
import zt3.C119179t;

@C86522b
/* renamed from: com.tencent.mm.plugin.finder.view.y5 */
public final class C56664y5 extends C86301e implements C76246h5 {

    /* renamed from: d */
    public static final C56665a f162421d = new C56665a((C8480h) null);

    /* renamed from: com.tencent.mm.plugin.finder.view.y5$a */
    public static final class C56665a {

        /* renamed from: com.tencent.mm.plugin.finder.view.y5$a$g */
        public static final class C4225g implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<String> f18531d;

            /* renamed from: e */
            public final /* synthetic */ int f18532e;

            /* renamed from: f */
            public final /* synthetic */ int f18533f;

            /* renamed from: g */
            public final /* synthetic */ Context f18534g;

            public C4225g(C8479f0<String> f0Var, int i, int i2, Context context) {
                this.f18531d = f0Var;
                this.f18532e = i;
                this.f18533f = i2;
                this.f18534g = context;
            }

            public final void onClick(View view) {
                Class cls = C60200t1.class;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$updateWxProfileFinderEntry$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (!Util.isNullOrNil((String) this.f18531d.f27484d)) {
                    Intent intent = new Intent();
                    intent.putExtra("finder_username", (String) this.f18531d.f27484d);
                    intent.putExtra("key_enter_profile_type", 40);
                    intent.putExtra("key_entrance_type", this.f18532e);
                    intent.putExtra("KEY_REF_COMMENTSCENE", 97);
                    intent.putExtra("key_extra_info", "{\"half_screen_source\":" + this.f18533f + '}');
                    boolean b = C87412m.m108589b(this.f18531d.f27484d, C66785b.f191882e.mo90662O5());
                    ((C60200t1) C86312j.m106911c(cls)).mo76842e7(14, 2, b ? 33 : 32, intent);
                    intent.putExtra("KEY_FINDER_SELF_FLAG", b);
                    Context context = this.f18534g;
                    C87412m.m108593f(context, "context");
                    ((C60200t1) C86312j.m106911c(cls)).mo76819V1(context, intent);
                    int i = this.f18533f;
                    FinderShowInWXProfileStruct finderShowInWXProfileStruct = new FinderShowInWXProfileStruct();
                    finderShowInWXProfileStruct.mo1041w(((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb());
                    finderShowInWXProfileStruct.mo1037s("97");
                    finderShowInWXProfileStruct.mo1042x("{\"scene\":" + i + '}');
                    finderShowInWXProfileStruct.mo1038t("fans_list_to_profile");
                    finderShowInWXProfileStruct.mo86054n();
                    ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(finderShowInWXProfileStruct);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$updateWxProfileFinderEntry$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.y5$a$a */
        public static final class C56666a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public static final C56666a f162422d = new C56666a();

            public final void onCancel(DialogInterface dialogInterface) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.y5$a$b */
        public static final class C56667b implements C60208v1.C60209a {

            /* renamed from: a */
            public final /* synthetic */ String f162423a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f162424b;

            /* renamed from: c */
            public final /* synthetic */ C50405mi0 f162425c;

            /* renamed from: d */
            public final /* synthetic */ C56583a0 f162426d;

            /* renamed from: e */
            public final /* synthetic */ C4191v0 f162427e;

            /* renamed from: f */
            public final /* synthetic */ boolean f162428f;

            /* renamed from: g */
            public final /* synthetic */ C32226l<String, C13598b0> f162429g;

            /* renamed from: com.tencent.mm.plugin.finder.view.y5$a$b$a */
            public static final class C56668a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C56583a0 f162430d;

                /* renamed from: e */
                public final /* synthetic */ C4191v0 f162431e;

                /* renamed from: f */
                public final /* synthetic */ Bundle f162432f;

                /* renamed from: g */
                public final /* synthetic */ boolean f162433g;

                /* renamed from: h */
                public final /* synthetic */ C32226l<String, C13598b0> f162434h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C56668a(C56583a0 a0Var, C4191v0 v0Var, Bundle bundle, boolean z, C32226l<? super String, C13598b0> lVar) {
                    super(0);
                    this.f162430d = a0Var;
                    this.f162431e = v0Var;
                    this.f162432f = bundle;
                    this.f162433g = z;
                    this.f162434h = lVar;
                }

                public Object invoke() {
                    this.f162430d.mo79916a();
                    C56665a aVar = C56664y5.f162421d;
                    View view = this.f162431e.f18463f;
                    C87412m.m108593f(view, "dialog.rootView");
                    C56665a.m65378a(aVar, view, this.f162432f, this.f162433g, this.f162434h);
                    return C13598b0.f38549a;
                }
            }

            /* renamed from: com.tencent.mm.plugin.finder.view.y5$a$b$b */
            public static final class C56669b extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C56583a0 f162435d;

                /* renamed from: e */
                public final /* synthetic */ C4191v0 f162436e;

                /* renamed from: f */
                public final /* synthetic */ Bundle f162437f;

                /* renamed from: g */
                public final /* synthetic */ boolean f162438g;

                /* renamed from: h */
                public final /* synthetic */ C32226l<String, C13598b0> f162439h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C56669b(C56583a0 a0Var, C4191v0 v0Var, Bundle bundle, boolean z, C32226l<? super String, C13598b0> lVar) {
                    super(0);
                    this.f162435d = a0Var;
                    this.f162436e = v0Var;
                    this.f162437f = bundle;
                    this.f162438g = z;
                    this.f162439h = lVar;
                }

                public Object invoke() {
                    this.f162435d.mo79916a();
                    C56665a aVar = C56664y5.f162421d;
                    View view = this.f162436e.f18463f;
                    C87412m.m108593f(view, "dialog.rootView");
                    C56665a.m65378a(aVar, view, this.f162437f, this.f162438g, this.f162439h);
                    return C13598b0.f38549a;
                }
            }

            public C56667b(String str, Bundle bundle, C50405mi0 mi02, C56583a0 a0Var, C4191v0 v0Var, boolean z, C32226l<? super String, C13598b0> lVar) {
                this.f162423a = str;
                this.f162424b = bundle;
                this.f162425c = mi02;
                this.f162426d = a0Var;
                this.f162427e = v0Var;
                this.f162428f = z;
                this.f162429g = lVar;
            }

            /* renamed from: a */
            public final void mo78737a(C60187m5 m5Var) {
                if (C87412m.m108589b(this.f162423a, m5Var.getUsername())) {
                    Log.m105925i("Finder.FinderWxProfileHelper", "get contact success %s", this.f162423a);
                    C56665a aVar = C56664y5.f162421d;
                    Bundle bundle = this.f162424b;
                    C87412m.m108594g(bundle, "extra");
                    bundle.putString("Avatar", m5Var.getAvatarUrl());
                    bundle.putString("Nickname", m5Var.mo84171f());
                    bundle.putInt("Sex", m5Var.getSex());
                    bundle.putLong("contactId", m5Var.mo84168a0());
                    bundle.putString("Province", m5Var.getProvince());
                    bundle.putString("City", m5Var.getCity());
                    bundle.putString("Country", m5Var.getCountry());
                    bundle.putString("Signature", m5Var.getSignature());
                    aVar.mo80020d(this.f162425c.f138041d, this.f162424b);
                    C61926c.m72668M(new C56668a(this.f162426d, this.f162427e, this.f162424b, this.f162428f, this.f162429g));
                    return;
                }
                C61926c.m72668M(new C56669b(this.f162426d, this.f162427e, this.f162424b, this.f162428f, this.f162429g));
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.y5$a$c */
        public static final class C56670c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C4191v0 f162440d;

            public C56670c(C4191v0 v0Var) {
                this.f162440d = v0Var;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$showWxProfileDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f162440d.mo5072g();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$showWxProfileDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.y5$a$d */
        public static final class C56671d extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C4191v0 f162441d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f162442e;

            /* renamed from: f */
            public final /* synthetic */ boolean f162443f;

            /* renamed from: g */
            public final /* synthetic */ C32226l<String, C13598b0> f162444g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56671d(C4191v0 v0Var, Bundle bundle, boolean z, C32226l<? super String, C13598b0> lVar) {
                super(0);
                this.f162441d = v0Var;
                this.f162442e = bundle;
                this.f162443f = z;
                this.f162444g = lVar;
            }

            public Object invoke() {
                C56665a aVar = C56664y5.f162421d;
                View view = this.f162441d.f18463f;
                C87412m.m108593f(view, "dialog.rootView");
                C56665a.m65378a(aVar, view, this.f162442e, this.f162443f, this.f162444g);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.y5$a$e */
        public static final class C56672e implements C4191v0.C4192a {

            /* renamed from: a */
            public final /* synthetic */ Context f162445a;

            /* renamed from: b */
            public final /* synthetic */ int f162446b;

            /* renamed from: c */
            public final /* synthetic */ long f162447c;

            /* renamed from: d */
            public final /* synthetic */ C56583a0 f162448d;

            public C56672e(Context context, int i, long j, C56583a0 a0Var) {
                this.f162445a = context;
                this.f162446b = i;
                this.f162447c = j;
                this.f162448d = a0Var;
            }

            public final void onDismiss() {
                C56664y5.f162421d.mo80019c(this.f162445a, this.f162446b, false, C31543z5.m39453c() - this.f162447c);
                this.f162448d.mo79916a();
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.y5$a$f */
        public static final class C56673f<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ Intent f162449a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f162450b;

            /* renamed from: c */
            public final /* synthetic */ C4191v0 f162451c;

            public C56673f(Intent intent, Bundle bundle, C4191v0 v0Var) {
                this.f162449a = intent;
                this.f162450b = bundle;
                this.f162451c = v0Var;
            }

            public Object call(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    LinkedList<FinderContact> linkedList = ((C50564nm0) cVar.f256796d).f138660d;
                    C87412m.m108593f(linkedList, "back.resp.contactList");
                    if (!linkedList.isEmpty()) {
                        LinkedList<FinderContact> linkedList2 = ((C50564nm0) cVar.f256796d).f138660d;
                        C87412m.m108593f(linkedList2, "back.resp.contactList");
                        FinderContact finderContact = (FinderContact) C110818d0.m150916N(linkedList2);
                        if (finderContact == null) {
                            return null;
                        }
                        Intent intent = this.f162449a;
                        Bundle bundle = this.f162450b;
                        C4191v0 v0Var = this.f162451c;
                        intent.putExtra("V5UserName", finderContact.wx_username_v5);
                        bundle.putString("V5UserName", finderContact.wx_username_v5);
                        C45690w4.f123497a.mo71189a(finderContact.wx_username_v5, (C9487b<C9486a>) null, new C56587b6(bundle, v0Var), (C60216z4.C8821a<Integer>) null, true, 2);
                        return C13598b0.f38549a;
                    }
                }
                Log.m105924i("Finder.FinderWxProfileHelper", "acquire v5 failed.");
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.y5$a$h */
        public static final class C56674h implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ String f162452d;

            /* renamed from: e */
            public final /* synthetic */ Context f162453e;

            /* renamed from: f */
            public final /* synthetic */ String f162454f;

            public C56674h(String str, Context context, String str2) {
                this.f162452d = str;
                this.f162453e = context;
                this.f162454f = str2;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$updateWxProfileFinderEntry$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (!Util.isNullOrNil(this.f162452d)) {
                    ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).getClass();
                    C58759o4.f168229a.mo83762I5(this.f162453e, this.f162452d, this.f162454f, 98);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$updateWxProfileFinderEntry$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C56665a(C8480h hVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:111:0x0418, code lost:
            if ((r41 == null || r41.length() == 0) == false) goto L_0x041a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x041a, code lost:
            r12 = r25;
            r12.setVisibility(0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0420, code lost:
            if (r43 == false) goto L_0x045d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x0422, code lost:
            r4 = r61.getContext().getResources();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x042a, code lost:
            if (r4 == null) goto L_0x0438;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x042c, code lost:
            r4 = r4.getString(com.tencent.p014mm.C0966R.string.eob);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0433, code lost:
            if (r4 == null) goto L_0x0438;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x0435, code lost:
            r12.setText(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x0438, code lost:
            r12.setOnClickListener(new com.tencent.p014mm.plugin.finder.view.C4033c6(r61, r34));
            r39 = r3;
            r17 = 0;
            r57 = r9;
            r22 = r13;
            r56 = r32;
            r15 = r33;
            r47 = r35;
            r19 = r40;
            r20 = r41;
            r25 = r42;
            r58 = r44;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x045d, code lost:
            r11 = r61;
            r4 = r37;
            r17 = 0;
            r19 = r40;
            r15 = r33;
            r39 = r3;
            r56 = r32;
            r20 = r41;
            r47 = r35;
            r57 = r9;
            r14 = r0;
            r58 = r44;
            r22 = r13;
            r25 = r42;
            r0 = new com.tencent.p014mm.plugin.finder.view.C56593d6(r46, r61, r32, r9, r37, r50, r20, r42, r39, r13, r63);
            r12.setOnClickListener(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x03f9, code lost:
            if (gy3.C87412m.m108589b(r4, zc1.C66785b.f191882e.mo90662O5()) == false) goto L_0x03fe;
         */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x04c3  */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x04db  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x04dd  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x04e0  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x04e3  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x04f5  */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x053f  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x015b  */
        /* JADX WARNING: Removed duplicated region for block: B:169:0x05cc  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x015d  */
        /* JADX WARNING: Removed duplicated region for block: B:170:0x05ed  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0240  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0281  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x02c8  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x02ea  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x031b  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x031d  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0320  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0353  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0355  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0358  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x038c  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0394  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x039a  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x039c  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x03ae  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x03b3  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x03b8  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final void m65378a(com.tencent.p014mm.plugin.finder.view.C56664y5.C56665a r60, android.view.View r61, android.os.Bundle r62, boolean r63, fy3.C32226l r64) {
            /*
                r15 = r61
                r14 = r62
                r60.getClass()
                java.lang.Class<ny.h> r0 = p629ny.C76979h.class
                java.lang.Class<pl1.s0> r1 = pl1.C11990s0.class
                java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
                r3 = 2131304872(0x7f0921a8, float:1.8227899E38)
                android.view.View r3 = r15.findViewById(r3)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                r4 = 2131304875(0x7f0921ab, float:1.8227905E38)
                android.view.View r4 = r15.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r5 = 2131304878(0x7f0921ae, float:1.8227911E38)
                android.view.View r5 = r15.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r6 = 2131304874(0x7f0921aa, float:1.8227903E38)
                android.view.View r6 = r15.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r7 = 2131304879(0x7f0921af, float:1.8227913E38)
                android.view.View r7 = r15.findViewById(r7)
                android.widget.TextView r7 = (android.widget.TextView) r7
                r8 = 2131304871(0x7f0921a7, float:1.8227897E38)
                android.view.View r8 = r15.findViewById(r8)
                r13 = r8
                android.widget.TextView r13 = (android.widget.TextView) r13
                r8 = 2131313180(0x7f09421c, float:1.824475E38)
                android.view.View r8 = r15.findViewById(r8)
                r12 = r8
                android.widget.TextView r12 = (android.widget.TextView) r12
                r8 = 2131301036(0x7f0912ac, float:1.8220119E38)
                android.view.View r8 = r15.findViewById(r8)
                r11 = r8
                androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
                r8 = 2131304873(0x7f0921a9, float:1.82279E38)
                android.view.View r16 = r15.findViewById(r8)
                if (r14 == 0) goto L_0x0608
                java.lang.String r10 = ""
                java.lang.String r8 = "Username"
                java.lang.String r9 = r14.getString(r8, r10)
                java.lang.String r8 = "Avatar"
                java.lang.String r8 = r14.getString(r8)
                r23 = r11
                java.lang.String r11 = "Nickname"
                java.lang.String r11 = r14.getString(r11, r10)
                r24 = r13
                java.lang.String r13 = "Sex"
                r15 = 0
                int r13 = r14.getInt(r13, r15)
                java.lang.String r15 = "Province"
                java.lang.String r15 = r14.getString(r15, r10)
                r25 = r12
                java.lang.String r12 = "Country"
                java.lang.String r12 = r14.getString(r12, r10)
                r26 = r7
                java.lang.String r7 = "City"
                java.lang.String r7 = r14.getString(r7, r10)
                r27 = r6
                java.lang.String r6 = "Signature"
                java.lang.CharSequence r6 = r14.getCharSequence(r6)
                r28 = r12
                java.lang.String r12 = "FansId"
                java.lang.String r12 = r14.getString(r12, r10)
                r29 = r5
                java.lang.String r5 = "Action"
                r30 = r4
                r4 = 0
                int r5 = r14.getInt(r5, r4)
                gy3.e0 r4 = new gy3.e0
                r4.<init>()
                r31 = r0
                java.lang.String r0 = "CommentId"
                r17 = r1
                r18 = r2
                r1 = 0
                r33 = r5
                r32 = r6
                long r5 = r14.getLong(r0, r1)
                r4.f124000d = r5
                java.lang.String r0 = "LikeId"
                long r5 = r14.getLong(r0, r1)
                java.lang.String r0 = "LikeType"
                r1 = 0
                int r0 = r14.getInt(r0, r1)
                java.lang.String r1 = "FeedId"
                r34 = r0
                r19 = r3
                r2 = 0
                long r0 = r14.getLong(r1, r2)
                java.lang.String r2 = "FeedNonceId"
                java.lang.String r3 = r14.getString(r2, r10)
                java.lang.String r2 = "feedUser"
                java.lang.String r2 = r14.getString(r2, r10)
                r35 = r5
                java.lang.String r5 = "SessionId"
                java.lang.String r5 = r14.getString(r5, r10)
                java.lang.String r6 = "contactId"
                r37 = r0
                r40 = r3
                r39 = r4
                r0 = 0
                long r3 = r14.getLong(r6, r0)
                java.lang.String r0 = "IsSelf"
                r1 = 0
                boolean r0 = r14.getBoolean(r0, r1)
                java.lang.String r6 = "IsPoster"
                boolean r6 = r14.getBoolean(r6, r1)
                r41 = r12
                java.lang.String r12 = "IsFollowApply"
                boolean r12 = r14.getBoolean(r12, r1)
                r42 = r12
                java.lang.String r12 = "FromWxMsg"
                boolean r43 = r14.getBoolean(r12, r1)
                java.lang.String r12 = "WxUserName"
                java.lang.String r12 = r14.getString(r12, r10)
                r44 = r10
                java.lang.String r10 = "RelationType"
                int r10 = r14.getInt(r10, r1)
                r45 = r7
                java.lang.String r7 = "isFingerLike"
                boolean r7 = r14.getBoolean(r7, r1)
                r46 = r7
                java.lang.String r7 = "FromScene_WXPROFILE"
                int r7 = r14.getInt(r7, r1)
                r1 = 1
                if (r43 == 0) goto L_0x0157
                if (r12 == 0) goto L_0x014f
                int r20 = r12.length()
                if (r20 != 0) goto L_0x014c
                goto L_0x014f
            L_0x014c:
                r20 = 0
                goto L_0x0151
            L_0x014f:
                r20 = 1
            L_0x0151:
                if (r20 != 0) goto L_0x0155
                if (r10 == r1) goto L_0x0157
            L_0x0155:
                r10 = 1
                goto L_0x0158
            L_0x0157:
                r10 = 0
            L_0x0158:
                r1 = 2
                if (r7 != r1) goto L_0x015d
                r7 = 1
                goto L_0x015e
            L_0x015d:
                r7 = 0
            L_0x015e:
                if (r0 != 0) goto L_0x0168
                if (r6 == 0) goto L_0x0168
                if (r10 == 0) goto L_0x0165
                goto L_0x0168
            L_0x0165:
                r48 = 0
                goto L_0x016a
            L_0x0168:
                r48 = 1
            L_0x016a:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r1 = "isSelf:"
                r10.append(r1)
                r10.append(r0)
                java.lang.String r0 = ", isPoster:"
                r10.append(r0)
                r10.append(r6)
                java.lang.String r0 = ", sessionId:"
                r10.append(r0)
                r10.append(r5)
                java.lang.String r0 = ", feedUser:"
                r10.append(r0)
                r10.append(r2)
                java.lang.String r0 = ", contactId:"
                r10.append(r0)
                r10.append(r3)
                java.lang.String r0 = ", username:"
                r10.append(r0)
                r10.append(r9)
                java.lang.String r0 = ", avatar:"
                r10.append(r0)
                r10.append(r8)
                java.lang.String r0 = ", nick:"
                r10.append(r0)
                r10.append(r11)
                java.lang.String r0 = ", sex:"
                r10.append(r0)
                r10.append(r13)
                java.lang.String r0 = ", Province:"
                r10.append(r0)
                r10.append(r15)
                java.lang.String r0 = " ,City:"
                r10.append(r0)
                r0 = r45
                r10.append(r0)
                java.lang.String r1 = " , fansId:"
                r10.append(r1)
                r6 = r41
                r10.append(r6)
                java.lang.String r1 = ", signature:"
                r10.append(r1)
                r1 = r32
                r10.append(r1)
                java.lang.String r3 = ", action:"
                r10.append(r3)
                r4 = r33
                r10.append(r4)
                java.lang.String r3 = ", commentId:"
                r10.append(r3)
                r32 = r5
                r3 = r39
                long r4 = r3.f124000d
                r10.append(r4)
                java.lang.String r4 = ", feedId:"
                r10.append(r4)
                r4 = r37
                r10.append(r4)
                java.lang.String r4 = ", nonceId:"
                r10.append(r4)
                r4 = r40
                r10.append(r4)
                java.lang.String r5 = " likeId:"
                r10.append(r5)
                r4 = r35
                r10.append(r4)
                java.lang.String r14 = " likeType:"
                r10.append(r14)
                r14 = r34
                r10.append(r14)
                r34 = r12
                java.lang.String r12 = " isFollowApply:"
                r10.append(r12)
                r12 = r42
                r10.append(r12)
                java.lang.String r12 = " isPrivacyMsg:"
                r10.append(r12)
                r10.append(r7)
                java.lang.String r10 = r10.toString()
                java.lang.String r12 = "Finder.FinderWxProfileHelper"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10)
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r10 != 0) goto L_0x0281
                bl3.r r10 = bl3.C39818r.f106831a
                r35 = r7
                r12 = r18
                bl3.r$a r7 = r10.mo62446e(r12)
                r41 = r6
                r6 = r17
                bl3.c r7 = r7.mo62447c(r6)
                pl1.s0 r7 = (pl1.C11990s0) r7
                k60.d r7 = r7.mo11865K1()
                r36 = r2
                pl1.n0 r2 = new pl1.n0
                gy3.C87412m.m108591d(r8)
                r39 = r14
                up1.y r14 = up1.C27696y.THUMB_IMAGE
                r2.<init>(r8, r14)
                java.lang.String r8 = "avatar"
                r14 = r19
                gy3.C87412m.m108593f(r14, r8)
                pl1.e0$a r8 = pl1.C11978e0.C11979a.WX_AVATAR
                bl3.r$a r10 = r10.mo62446e(r12)
                bl3.c r6 = r10.mo62447c(r6)
                pl1.s0 r6 = (pl1.C11990s0) r6
                n60.f r6 = r6.mo11867O2(r8)
                r7.mo85957c(r2, r14, r6)
                goto L_0x02a0
            L_0x0281:
                r36 = r2
                r41 = r6
                r35 = r7
                r39 = r14
                r14 = r19
                java.lang.String r2 = eb0.C75592q0.m90789s()
                boolean r2 = gy3.C87412m.m108589b(r9, r2)
                if (r2 == 0) goto L_0x02a0
                java.lang.Class<ln.f> r2 = p196ln.C76705f.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                ln.f r2 = (p196ln.C76705f) r2
                r2.mo106849z(r14, r9)
            L_0x02a0:
                di3.d r2 = di3.C86312j.m106911c(r31)
                ny.h r2 = (p629ny.C76979h) r2
                android.content.Context r6 = r61.getContext()
                er1.w3 r17 = er1.C58784w3.f168295a
                r20 = 0
                r21 = 4
                r22 = 0
                r18 = r9
                r19 = r11
                java.lang.String r7 = er1.C58784w3.m68433S(r17, r18, r19, r20, r21, r22)
                android.text.SpannableString r2 = r2.mo107057T1(r6, r7)
                r6 = r30
                r6.setText(r2)
                r14 = 8
                r2 = 1
                if (r13 == r2) goto L_0x02ea
                r2 = 2
                if (r13 == r2) goto L_0x02d3
                r2 = r29
                r2.setVisibility(r14)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                goto L_0x0300
            L_0x02d3:
                r2 = r29
                r6 = 0
                r2.setVisibility(r6)
                android.content.Context r7 = r61.getContext()
                r8 = 2131836498(0x7f113e52, float:1.9306164E38)
                java.lang.String r7 = r7.getString(r8)
                r2.setText(r7)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                goto L_0x0300
            L_0x02ea:
                r2 = r29
                r6 = 0
                r2.setVisibility(r6)
                android.content.Context r6 = r61.getContext()
                r7 = 2131836499(0x7f113e53, float:1.9306167E38)
                java.lang.String r6 = r6.getString(r7)
                r2.setText(r6)
                rx3.b0 r2 = rx3.C13598b0.f38549a
            L_0x0300:
                com.tencent.mm.storage.RegionCodeDecoder r2 = com.tencent.p014mm.storage.RegionCodeDecoder.m124563k()
                r6 = r28
                java.lang.String r2 = r2.mo135577m(r6, r15)
                com.tencent.mm.storage.RegionCodeDecoder r7 = com.tencent.p014mm.storage.RegionCodeDecoder.m124563k()
                java.lang.String r0 = r7.mo135571f(r6, r15, r0)
                if (r2 == 0) goto L_0x031d
                int r6 = r2.length()
                if (r6 != 0) goto L_0x031b
                goto L_0x031d
            L_0x031b:
                r6 = 0
                goto L_0x031e
            L_0x031d:
                r6 = 1
            L_0x031e:
                if (r6 != 0) goto L_0x0348
                if (r0 == 0) goto L_0x032b
                int r6 = r0.length()
                if (r6 != 0) goto L_0x0329
                goto L_0x032b
            L_0x0329:
                r6 = 0
                goto L_0x032c
            L_0x032b:
                r6 = 1
            L_0x032c:
                if (r6 != 0) goto L_0x0348
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r2)
                r2 = 32
                r6.append(r2)
                r6.append(r0)
                java.lang.String r0 = r6.toString()
                r6 = r27
                r6.setText(r0)
                goto L_0x036d
            L_0x0348:
                r6 = r27
                if (r2 == 0) goto L_0x0355
                int r7 = r2.length()
                if (r7 != 0) goto L_0x0353
                goto L_0x0355
            L_0x0353:
                r7 = 0
                goto L_0x0356
            L_0x0355:
                r7 = 1
            L_0x0356:
                if (r7 != 0) goto L_0x036d
                if (r0 == 0) goto L_0x0363
                int r0 = r0.length()
                if (r0 != 0) goto L_0x0361
                goto L_0x0363
            L_0x0361:
                r0 = 0
                goto L_0x0364
            L_0x0363:
                r0 = 1
            L_0x0364:
                if (r0 == 0) goto L_0x036d
                java.lang.String r0 = java.lang.String.valueOf(r2)
                r6.setText(r0)
            L_0x036d:
                di3.d r0 = di3.C86312j.m106911c(r31)
                ny.h r0 = (p629ny.C76979h) r0
                android.content.Context r2 = r61.getContext()
                android.text.SpannableString r0 = r0.mo107057T1(r2, r1)
                r7 = r26
                r7.setText(r0)
                long r0 = r3.f124000d
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 != 0) goto L_0x0394
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 == 0) goto L_0x0394
                r0 = r39
                r1 = 1
                if (r0 != r1) goto L_0x0397
                r3.f124000d = r4
                goto L_0x0397
            L_0x0394:
                r0 = r39
                r1 = 1
            L_0x0397:
                r2 = 2
                if (r0 != r2) goto L_0x039c
                r13 = 1
                goto L_0x039d
            L_0x039c:
                r13 = 0
            L_0x039d:
                rs1.s8$a r0 = rs1.C13442s8.f38060Q0
                android.content.Context r4 = r61.getContext()
                java.lang.String r5 = "contentView.context"
                gy3.C87412m.m108593f(r4, r5)
                rs1.s8 r0 = r0.mo12873f(r4)
                if (r0 == 0) goto L_0x03b3
                te3.hj1 r0 = r0.mo12861q3()
                goto L_0x03b4
            L_0x03b3:
                r0 = 0
            L_0x03b4:
                r50 = r0
                if (r48 != 0) goto L_0x049c
                up1.f r0 = up1.C37521f.f99374d
                r0.getClass()
                pe1.c<java.lang.Integer> r0 = up1.C37521f.f99376d2
                java.lang.Object r0 = r0.mo60266n()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                if (r0 <= 0) goto L_0x049c
                if (r9 == 0) goto L_0x03d6
                int r0 = r9.length()
                if (r0 != 0) goto L_0x03d4
                goto L_0x03d6
            L_0x03d4:
                r4 = 0
                goto L_0x03d7
            L_0x03d6:
                r4 = 1
            L_0x03d7:
                if (r4 != 0) goto L_0x03df
                boolean r0 = com.tencent.p014mm.storage.C72996z1.m85817T4(r9)
                if (r0 != 0) goto L_0x049c
            L_0x03df:
                if (r36 == 0) goto L_0x03ea
                int r0 = r36.length()
                if (r0 != 0) goto L_0x03e8
                goto L_0x03ea
            L_0x03e8:
                r4 = 0
                goto L_0x03eb
            L_0x03ea:
                r4 = 1
            L_0x03eb:
                if (r4 != 0) goto L_0x03fc
                zc1.b r0 = zc1.C66785b.f191882e
                java.lang.String r0 = r0.mo90662O5()
                r4 = r36
                boolean r0 = gy3.C87412m.m108589b(r4, r0)
                if (r0 != 0) goto L_0x041a
                goto L_0x03fe
            L_0x03fc:
                r4 = r36
            L_0x03fe:
                if (r4 == 0) goto L_0x0409
                int r0 = r4.length()
                if (r0 != 0) goto L_0x0407
                goto L_0x0409
            L_0x0407:
                r4 = 0
                goto L_0x040a
            L_0x0409:
                r4 = 1
            L_0x040a:
                if (r4 == 0) goto L_0x049c
                if (r41 == 0) goto L_0x0417
                int r0 = r41.length()
                if (r0 != 0) goto L_0x0415
                goto L_0x0417
            L_0x0415:
                r4 = 0
                goto L_0x0418
            L_0x0417:
                r4 = 1
            L_0x0418:
                if (r4 != 0) goto L_0x049c
            L_0x041a:
                r12 = r25
                r0 = 0
                r12.setVisibility(r0)
                if (r43 == 0) goto L_0x045d
                android.content.Context r4 = r61.getContext()
                android.content.res.Resources r4 = r4.getResources()
                if (r4 == 0) goto L_0x0438
                r5 = 2131829844(0x7f112454, float:1.9292669E38)
                java.lang.String r4 = r4.getString(r5)
                if (r4 == 0) goto L_0x0438
                r12.setText(r4)
            L_0x0438:
                com.tencent.mm.plugin.finder.view.c6 r4 = new com.tencent.mm.plugin.finder.view.c6
                r11 = r61
                r0 = r34
                r15 = 0
                r4.<init>(r11, r0)
                r12.setOnClickListener(r4)
                r39 = r3
                r17 = r6
                r57 = r9
                r22 = r13
                r56 = r32
                r15 = r33
                r47 = r35
                r19 = r40
                r20 = r41
                r25 = r42
                r58 = r44
                goto L_0x04b9
            L_0x045d:
                r11 = r61
                r15 = 0
                com.tencent.mm.plugin.finder.view.d6 r10 = new com.tencent.mm.plugin.finder.view.d6
                r4 = r37
                r0 = r10
                r17 = r6
                r7 = 1
                r8 = 2
                r1 = r46
                r2 = r61
                r6 = r3
                r19 = r40
                r3 = r32
                r5 = r33
                r4 = r9
                r15 = r5
                r39 = r6
                r56 = r32
                r20 = r41
                r5 = r37
                r47 = r35
                r7 = r50
                r8 = r20
                r57 = r9
                r9 = r42
                r14 = r10
                r58 = r44
                r10 = r39
                r11 = r13
                r22 = r13
                r25 = r42
                r13 = r12
                r12 = r63
                r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
                r13.setOnClickListener(r14)
                goto L_0x04b9
            L_0x049c:
                r39 = r3
                r17 = r6
                r57 = r9
                r22 = r13
                r13 = r25
                r56 = r32
                r15 = r33
                r47 = r35
                r19 = r40
                r20 = r41
                r25 = r42
                r58 = r44
                r0 = 8
                r13.setVisibility(r0)
            L_0x04b9:
                dp1.h$b r0 = dp1.C58363h.f167143g
                zc1.b r1 = zc1.C66785b.f191882e
                java.lang.String r10 = r1.mo90662O5()
                if (r10 != 0) goto L_0x04c5
                r10 = r58
            L_0x04c5:
                java.lang.String r1 = "username"
                r7 = r57
                gy3.C87412m.m108593f(r7, r1)
                r1 = r58
                r0.mo83123c(r10, r7, r1)
                if (r20 == 0) goto L_0x04dd
                int r1 = r20.length()
                if (r1 != 0) goto L_0x04db
                goto L_0x04dd
            L_0x04db:
                r1 = 0
                goto L_0x04de
            L_0x04dd:
                r1 = 1
            L_0x04de:
                if (r1 != 0) goto L_0x04e3
                r1 = 2
                goto L_0x04e5
            L_0x04e3:
                r1 = 1
            L_0x04e5:
                r51 = r1
                r53 = 0
                r54 = 4
                r55 = 0
                r49 = r0
                dp1.C58363h.C58364b.m67609b(r49, r50, r51, r53, r54, r55)
                r0 = 1
                if (r15 == r0) goto L_0x053f
                r1 = 2
                if (r15 == r1) goto L_0x051a
                r0 = 3
                if (r15 == r0) goto L_0x0502
                r0 = 4
                r13 = r24
                r13.setVisibility(r0)
                goto L_0x0517
            L_0x0502:
                r13 = r24
                android.content.Context r0 = r61.getContext()
                r1 = 2131826349(0x7f1116ad, float:1.928558E38)
                java.lang.String r0 = r0.getString(r1)
                r13.setText(r0)
                com.tencent.mm.plugin.finder.view.g6 r0 = com.tencent.p014mm.plugin.finder.view.C4060g6.f18188d
                r13.setOnClickListener(r0)
            L_0x0517:
                r15 = r61
                goto L_0x053c
            L_0x051a:
                r13 = r24
                android.content.Context r0 = r61.getContext()
                r1 = 2131821481(0x7f1103a9, float:1.9275706E38)
                java.lang.String r0 = r0.getString(r1)
                r13.setText(r0)
                r0 = 0
                r13.setVisibility(r0)
                com.tencent.mm.plugin.finder.view.f6 r0 = new com.tencent.mm.plugin.finder.view.f6
                r15 = r61
                r10 = r37
                r9 = r39
                r0.<init>(r15, r10, r9)
                r13.setOnClickListener(r0)
            L_0x053c:
                r8 = r13
                goto L_0x05ca
            L_0x053f:
                r15 = r61
                r13 = r24
                r10 = r37
                r9 = r39
                android.content.Context r1 = r61.getContext()
                r2 = 2131826140(0x7f1115dc, float:1.9285156E38)
                java.lang.String r1 = r1.getString(r2)
                r13.setText(r1)
                if (r43 == 0) goto L_0x055d
                r1 = 8
                r13.setVisibility(r1)
                goto L_0x0574
            L_0x055d:
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r20)
                if (r1 == 0) goto L_0x059a
                if (r25 == 0) goto L_0x0566
                goto L_0x059a
            L_0x0566:
                int r1 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
                if (r1 == 0) goto L_0x0577
                long r1 = r9.f124000d
                int r3 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
                if (r3 == 0) goto L_0x0577
                r1 = 0
                r13.setVisibility(r1)
            L_0x0574:
                r14 = r56
                goto L_0x058f
            L_0x0577:
                if (r47 == 0) goto L_0x0592
                java.lang.String r1 = "sessionId"
                r14 = r56
                gy3.C87412m.m108593f(r14, r1)
                int r1 = r14.length()
                if (r1 <= 0) goto L_0x0588
                goto L_0x0589
            L_0x0588:
                r0 = 0
            L_0x0589:
                if (r0 == 0) goto L_0x0594
                r0 = 0
                r13.setVisibility(r0)
            L_0x058f:
                r12 = 8
                goto L_0x05a2
            L_0x0592:
                r14 = r56
            L_0x0594:
                r12 = 8
                r13.setVisibility(r12)
                goto L_0x05a2
            L_0x059a:
                r14 = r56
                r0 = 0
                r12 = 8
                r13.setVisibility(r0)
            L_0x05a2:
                com.tencent.mm.plugin.finder.view.e6 r8 = new com.tencent.mm.plugin.finder.view.e6
                r0 = r8
                r1 = r64
                r2 = r61
                r3 = r20
                r4 = r63
                r5 = r22
                r6 = r25
                r59 = r8
                r8 = r47
                r17 = 8
                r12 = r19
                r24 = r13
                r13 = r14
                r14 = r16
                r15 = r24
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15)
                r8 = r24
                r0 = r59
                r8.setOnClickListener(r0)
            L_0x05ca:
                if (r48 == 0) goto L_0x05ed
                r0 = 8
                r8.setVisibility(r0)
                int r0 = r23.getPaddingLeft()
                int r1 = r23.getPaddingTop()
                int r2 = r23.getPaddingRight()
                android.content.Context r3 = r23.getContext()
                r4 = 64
                int r3 = kg3.C76577a.m92151b(r3, r4)
                r8 = r23
                r8.setPadding(r0, r1, r2, r3)
                goto L_0x0608
            L_0x05ed:
                r8 = r23
                int r0 = r8.getPaddingLeft()
                int r1 = r8.getPaddingTop()
                int r2 = r8.getPaddingRight()
                android.content.Context r3 = r8.getContext()
                r4 = 24
                int r3 = kg3.C76577a.m92151b(r3, r4)
                r8.setPadding(r0, r1, r2, r3)
            L_0x0608:
                r60.mo80022f(r61, r62)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C56664y5.C56665a.m65378a(com.tencent.mm.plugin.finder.view.y5$a, android.view.View, android.os.Bundle, boolean, fy3.l):void");
        }

        /* renamed from: b */
        public final C60208v1.C60209a mo80018b(Context context, C4191v0 v0Var, C56583a0 a0Var, String str, boolean z, C50405mi0 mi02, Bundle bundle, C32226l<? super String, C13598b0> lVar) {
            String string = context.getResources().getString(C0966R.string.a4d);
            C56666a aVar = C56666a.f162422d;
            a0Var.getClass();
            C119179t tVar = C119157j.f356862d;
            C56675z zVar = new C56675z(a0Var, context, string, true, 0, aVar);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            C56583a0 a0Var2 = a0Var;
            a0Var2.f162215b = jVar.mo183892w(zVar, 1500, false);
            return new C56667b(str, bundle, mi02, a0Var2, v0Var, z, lVar);
        }

        /* renamed from: c */
        public final void mo80019c(Context context, int i, boolean z, long j) {
            String str;
            String str2;
            String str3;
            C49712hj1 q3 = context instanceof MMFinderUI ? ((C13442s8) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(C13442s8.class)).mo12861q3() : null;
            finder_page_exposeStruct finder_page_exposestruct = new finder_page_exposeStruct();
            if (q3 == null || (str = q3.f134670d) == null) {
                str = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            }
            finder_page_exposestruct.f156965d = finder_page_exposestruct.mo86045b("sessionid", str, true);
            String str4 = "";
            if (q3 == null || (str2 = q3.f134671e) == null) {
                str2 = str4;
            }
            finder_page_exposestruct.f156966e = finder_page_exposestruct.mo86045b("findercontextid", str2, true);
            if (!(q3 == null || (str3 = q3.f134672f) == null)) {
                str4 = str3;
            }
            finder_page_exposestruct.f156972k = finder_page_exposestruct.mo86045b("clicktabcontextid", str4, true);
            finder_page_exposestruct.f156973l = finder_page_exposestruct.mo86045b("ref_commentscene", String.valueOf(q3 != null ? q3.f134677n : 0), true);
            finder_page_exposestruct.f156967f = finder_page_exposestruct.mo86045b("commentscene", "97", true);
            finder_page_exposestruct.f156971j = finder_page_exposestruct.mo86045b("udf_kv", "{\"scene\":" + i + '}', true);
            finder_page_exposestruct.f156968g = z ^ true ? 1 : 0;
            finder_page_exposestruct.f156969h = finder_page_exposestruct.mo86045b("event_time", String.valueOf(C31543z5.m39453c()), true);
            finder_page_exposestruct.f156974m = j;
            finder_page_exposestruct.mo86054n();
            ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(finder_page_exposestruct);
        }

        /* renamed from: d */
        public final void mo80020d(String str, Bundle bundle) {
            boolean z = false;
            if (str == null || str.length() == 0) {
                Log.m105920e("Finder.FinderWxProfileHelper", "[saveMsgStrangerContact] msgUsername is null");
                return;
            }
            C58969q qVar = new C58969q();
            String string = bundle.getString("Username", "");
            C87412m.m108593f(string, "extra.getString(Constant…erWxProfile.Username, \"\")");
            qVar.field_username = string;
            String string2 = bundle.getString("Nickname", "");
            C87412m.m108593f(string2, "extra.getString(Constant…erWxProfile.Nickname, \"\")");
            qVar.field_nickname = string2;
            int i = bundle.getInt("Sex", 0);
            C49849ii0 ii02 = qVar.field_extInfo;
            if (ii02 == null) {
                ii02 = new C49849ii0();
            }
            ii02.f135356g = i;
            qVar.field_extInfo = ii02;
            String string3 = bundle.getString("Signature", "");
            C87412m.m108593f(string3, "extra.getString(Constant…rWxProfile.Signature, \"\")");
            qVar.field_signature = string3;
            String string4 = bundle.getString("Province", "");
            C87412m.m108593f(string4, "extra.getString(Constant…erWxProfile.Province, \"\")");
            C49849ii0 ii03 = qVar.field_extInfo;
            if (ii03 == null) {
                ii03 = new C49849ii0();
            }
            ii03.f135354e = string4;
            qVar.field_extInfo = ii03;
            String string5 = bundle.getString("City", "");
            C87412m.m108593f(string5, "extra.getString(Constant…FinderWxProfile.City, \"\")");
            C49849ii0 ii04 = qVar.field_extInfo;
            if (ii04 == null) {
                ii04 = new C49849ii0();
            }
            ii04.f135355f = string5;
            qVar.field_extInfo = ii04;
            String string6 = bundle.getString("Avatar", "");
            C87412m.m108593f(string6, "extra.getString(Constant…nderWxProfile.Avatar, \"\")");
            qVar.field_avatarUrl = string6;
            String string7 = bundle.getString("Country", "");
            C87412m.m108593f(string7, "extra.getString(Constant…derWxProfile.Country, \"\")");
            C49849ii0 ii05 = qVar.field_extInfo;
            if (ii05 == null) {
                ii05 = new C49849ii0();
            }
            ii05.f135353d = string7;
            qVar.field_extInfo = ii05;
            C87412m.m108594g(str, "field_username");
            qVar.field_username = str;
            if (qVar.getAvatarUrl().length() == 0) {
                z = true;
            }
            if (z) {
                Log.m105928w("Finder.FinderWxProfileHelper", "nickname=" + qVar.getNickname() + " avatarUrl is null. username=" + qVar.getUsername());
            }
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Kx0().mo89499S1(qVar, !z);
        }

        /* JADX WARNING: Removed duplicated region for block: B:67:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x01d7  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x024d  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x025b  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x025d  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0260  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0297  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x029d  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x02a0  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x02a2  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.tencent.p014mm.plugin.finder.view.C4191v0 mo80021e(android.content.Context r39, android.content.Intent r40, int r41, fy3.C32226l<? super java.lang.String, rx3.C13598b0> r42) {
            /*
                r38 = this;
                r6 = r39
                r9 = r40
                java.lang.Class<ht1.v1> r10 = ht1.C60208v1.class
                java.lang.String r0 = "context"
                gy3.C87412m.m108594g(r6, r0)
                java.lang.String r0 = "intent"
                gy3.C87412m.m108594g(r9, r0)
                long r7 = eb0.C31543z5.m39453c()
                r3 = 1
                r4 = 0
                r0 = r38
                r1 = r39
                r2 = r41
                r0.mo80019c(r1, r2, r3, r4)
                java.lang.String r0 = "FromScene_WXPROFILE"
                r9.putExtra(r0, r2)
                android.os.Bundle r11 = new android.os.Bundle
                r11.<init>()
                android.os.Bundle r0 = r40.getExtras()
                r11.putAll(r0)
                com.tencent.mm.plugin.finder.view.v0 r12 = new com.tencent.mm.plugin.finder.view.v0
                r12.<init>(r6)
                r0 = 2131495606(0x7f0c0ab6, float:1.8614753E38)
                r12.mo5070e(r0)
                java.lang.String r0 = "Username"
                java.lang.String r15 = r9.getStringExtra(r0)
                java.lang.String r0 = "FansId"
                java.lang.String r13 = r9.getStringExtra(r0)
                java.lang.String r0 = "FavId"
                java.lang.String r0 = r9.getStringExtra(r0)
                java.lang.String r14 = ""
                if (r0 != 0) goto L_0x0055
                r18 = r14
                goto L_0x0057
            L_0x0055:
                r18 = r0
            L_0x0057:
                java.lang.String r0 = "LikeId"
                r3 = 0
                long r19 = r9.getLongExtra(r0, r3)
                java.lang.String r0 = "LikeType"
                r5 = 0
                int r1 = r9.getIntExtra(r0, r5)
                java.lang.String r0 = "CommentId"
                long r16 = r9.getLongExtra(r0, r3)
                java.lang.String r0 = "FeedId"
                long r21 = r11.getLong(r0, r3)
                java.lang.String r0 = "SrvMentionId"
                long r23 = r11.getLong(r0, r3)
                te3.mi0 r0 = new te3.mi0
                r0.<init>()
                java.lang.String r3 = "ContactMsgInfo"
                byte[] r3 = r9.getByteArrayExtra(r3)
                if (r3 != 0) goto L_0x0086
                goto L_0x008b
            L_0x0086:
                r0.parseFrom(r3)     // Catch:{ Exception -> 0x008a }
                goto L_0x008b
            L_0x008a:
            L_0x008b:
                java.lang.String r3 = "V5UserName"
                java.lang.String r3 = r9.getStringExtra(r3)
                java.lang.String r4 = "FromFinderMsg"
                boolean r4 = r9.getBooleanExtra(r4, r5)
                r27 = r1
                java.lang.String r1 = "IsFollowApply"
                boolean r28 = r9.getBooleanExtra(r1, r5)
                java.lang.String r1 = r0.f138042e
                if (r1 == 0) goto L_0x00ac
                int r1 = r1.length()
                if (r1 != 0) goto L_0x00aa
                goto L_0x00ac
            L_0x00aa:
                r1 = 0
                goto L_0x00ad
            L_0x00ac:
                r1 = 1
            L_0x00ad:
                if (r1 != 0) goto L_0x00b6
                java.lang.String r1 = r0.f138042e
                java.lang.String r5 = "SessionId"
                r11.putString(r5, r1)
            L_0x00b6:
                android.view.View r1 = r12.f18463f
                r5 = 2131304873(0x7f0921a9, float:1.82279E38)
                android.view.View r1 = r1.findViewById(r5)
                java.lang.String r5 = eb0.C75592q0.m90789s()
                boolean r5 = gy3.C87412m.m108589b(r15, r5)
                if (r5 != 0) goto L_0x00d8
                java.lang.String r5 = eb0.C75592q0.m90789s()
                boolean r5 = gy3.C87412m.m108589b(r3, r5)
                if (r5 == 0) goto L_0x00d4
                goto L_0x00d8
            L_0x00d4:
                r31 = r0
                r5 = 0
                goto L_0x00db
            L_0x00d8:
                r31 = r0
                r5 = 1
            L_0x00db:
                java.lang.String r0 = "IsSelf"
                r9.putExtra(r0, r5)
                r11.putBoolean(r0, r5)
                java.lang.String r0 = "IsPoster"
                r32 = r5
                r5 = 0
                r9.getBooleanExtra(r0, r5)
                com.tencent.mm.plugin.finder.view.y5$a$c r0 = new com.tencent.mm.plugin.finder.view.y5$a$c
                r0.<init>(r12)
                r1.setOnClickListener(r0)
                com.tencent.mm.plugin.finder.view.y5$a$d r0 = new com.tencent.mm.plugin.finder.view.y5$a$d
                r1 = r42
                r0.<init>(r12, r11, r4, r1)
                o40.C61926c.m72668M(r0)
                com.tencent.mm.plugin.finder.view.a0 r0 = new com.tencent.mm.plugin.finder.view.a0
                r5 = 1500(0x5dc, double:7.41E-321)
                r0.<init>(r5)
                r12.mo5073h()
                com.tencent.mm.plugin.finder.view.y5$a$e r6 = new com.tencent.mm.plugin.finder.view.y5$a$e
                r5 = r31
                r31 = r0
                r0 = r6
                r37 = r27
                r27 = r14
                r14 = r37
                r1 = r39
                r2 = r41
                r9 = r3
                r25 = r4
                r33 = 0
                r3 = r7
                r7 = r5
                r29 = r32
                r8 = 1
                r26 = 0
                r5 = r31
                r0.<init>(r1, r2, r3, r5)
                r12.f18472r = r6
                if (r15 == 0) goto L_0x0136
                int r0 = r15.length()
                if (r0 != 0) goto L_0x0134
                goto L_0x0136
            L_0x0134:
                r5 = 0
                goto L_0x0137
            L_0x0136:
                r5 = 1
            L_0x0137:
                if (r5 == 0) goto L_0x0166
                if (r9 == 0) goto L_0x0144
                int r0 = r9.length()
                if (r0 != 0) goto L_0x0142
                goto L_0x0144
            L_0x0142:
                r5 = 0
                goto L_0x0145
            L_0x0144:
                r5 = 1
            L_0x0145:
                if (r5 == 0) goto L_0x0166
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "[showWxProfileDialog] username "
                r0.append(r1)
                r0.append(r15)
                java.lang.String r1 = ", v5 "
                r0.append(r1)
                r0.append(r9)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "Finder.FinderWxProfileHelper"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
                return r12
            L_0x0166:
                int r0 = (r16 > r33 ? 1 : (r16 == r33 ? 0 : -1))
                if (r0 != 0) goto L_0x0173
                int r0 = (r19 > r33 ? 1 : (r19 == r33 ? 0 : -1))
                if (r0 == 0) goto L_0x0173
                if (r14 != r8) goto L_0x0173
                r35 = r19
                goto L_0x0175
            L_0x0173:
                r35 = r16
            L_0x0175:
                int r0 = (r35 > r33 ? 1 : (r35 == r33 ? 0 : -1))
                if (r0 == 0) goto L_0x017d
                int r1 = (r21 > r33 ? 1 : (r21 == r33 ? 0 : -1))
                if (r1 != 0) goto L_0x018b
            L_0x017d:
                if (r13 == 0) goto L_0x0188
                int r1 = r13.length()
                if (r1 != 0) goto L_0x0186
                goto L_0x0188
            L_0x0186:
                r5 = 0
                goto L_0x0189
            L_0x0188:
                r5 = 1
            L_0x0189:
                if (r5 != 0) goto L_0x0193
            L_0x018b:
                java.lang.String r1 = r7.f138041d
                r6 = r38
                r6.mo80020d(r1, r11)
                goto L_0x0195
            L_0x0193:
                r6 = r38
            L_0x0195:
                r5 = 2
                if (r0 == 0) goto L_0x01c9
                int r0 = (r21 > r33 ? 1 : (r21 == r33 ? 0 : -1))
                if (r0 == 0) goto L_0x01c9
                if (r14 == r5) goto L_0x01c9
                r0 = r38
                r1 = r39
                r2 = r12
                r3 = r31
                r4 = r15
                r13 = 2
                r5 = r25
                r6 = r7
                r7 = r11
                r30 = 1
                r8 = r42
                ht1.v1$a r0 = r0.mo80018b(r1, r2, r3, r4, r5, r6, r7, r8)
                di3.d r1 = di3.C86312j.m106911c(r10)
                ht1.v1 r1 = (ht1.C60208v1) r1
                java.lang.Long r2 = java.lang.Long.valueOf(r35)
                java.lang.Long r3 = java.lang.Long.valueOf(r21)
                r1.mo78710cT(r15, r2, r3, r0)
                r14 = r15
                r28 = 2
                goto L_0x0252
            L_0x01c9:
                r8 = 2
                r30 = 1
                if (r13 == 0) goto L_0x01d7
                int r0 = r13.length()
                if (r0 != 0) goto L_0x01d5
                goto L_0x01d7
            L_0x01d5:
                r5 = 0
                goto L_0x01d8
            L_0x01d7:
                r5 = 1
            L_0x01d8:
                if (r5 == 0) goto L_0x022f
                if (r28 == 0) goto L_0x01de
                goto L_0x022f
            L_0x01de:
                if (r14 != r8) goto L_0x0207
                r0 = r38
                r1 = r39
                r2 = r12
                r3 = r31
                r4 = r15
                r5 = r25
                r6 = r7
                r7 = r11
                r28 = 2
                r8 = r42
                ht1.v1$a r0 = r0.mo80018b(r1, r2, r3, r4, r5, r6, r7, r8)
                di3.d r1 = di3.C86312j.m106911c(r10)
                r13 = r1
                ht1.v1 r13 = (ht1.C60208v1) r13
                r14 = r15
                r8 = r15
                r15 = r21
                r17 = r35
                r21 = r0
                r13.mo78701G6(r14, r15, r17, r19, r21)
                goto L_0x022d
            L_0x0207:
                r8 = r15
                r28 = 2
                r0 = r38
                r1 = r39
                r2 = r12
                r3 = r31
                r4 = r8
                r5 = r25
                r6 = r7
                r7 = r11
                r8 = r42
                ht1.v1$a r0 = r0.mo80018b(r1, r2, r3, r4, r5, r6, r7, r8)
                di3.d r1 = di3.C86312j.m106911c(r10)
                r13 = r1
                ht1.v1 r13 = (ht1.C60208v1) r13
                r14 = r15
                r8 = r15
                r15 = r0
                r16 = r23
                r19 = r21
                r13.lf0(r14, r15, r16, r18, r19)
            L_0x022d:
                r14 = r8
                goto L_0x0252
            L_0x022f:
                r8 = r15
                r28 = 2
                r0 = r38
                r1 = r39
                r2 = r12
                r3 = r31
                r4 = r8
                r5 = r25
                r6 = r7
                r7 = r11
                r14 = r8
                r8 = r42
                ht1.v1$a r0 = r0.mo80018b(r1, r2, r3, r4, r5, r6, r7, r8)
                di3.d r1 = di3.C86312j.m106911c(r10)
                ht1.v1 r1 = (ht1.C60208v1) r1
                if (r13 != 0) goto L_0x024f
                r13 = r27
            L_0x024f:
                r1.mo78703Kv(r14, r13, r0)
            L_0x0252:
                if (r9 == 0) goto L_0x025d
                int r0 = r9.length()
                if (r0 != 0) goto L_0x025b
                goto L_0x025d
            L_0x025b:
                r5 = 0
                goto L_0x025e
            L_0x025d:
                r5 = 1
            L_0x025e:
                if (r5 == 0) goto L_0x0294
                if (r14 == 0) goto L_0x026b
                int r0 = r14.length()
                if (r0 != 0) goto L_0x0269
                goto L_0x026b
            L_0x0269:
                r5 = 0
                goto L_0x026c
            L_0x026b:
                r5 = 1
            L_0x026c:
                if (r5 != 0) goto L_0x0294
                if (r29 != 0) goto L_0x0294
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                te3.mi0 r1 = new te3.mi0
                r1.<init>()
                r1.f138041d = r14
                r0.add(r1)
                je1.w1$a r1 = je1.C60812w1.f173199i
                je1.w1 r0 = r1.mo85732a(r0)
                nr3.e r0 = r0.mo9225i()
                com.tencent.mm.plugin.finder.view.y5$a$f r1 = new com.tencent.mm.plugin.finder.view.y5$a$f
                r2 = r40
                r1.<init>(r2, r11, r12)
                r0.mo123420E(r1)
                goto L_0x02b0
            L_0x0294:
                r0 = r9
                if (r29 == 0) goto L_0x029d
                java.lang.String r3 = eb0.C75592q0.m90789s()
                r5 = r3
                goto L_0x029e
            L_0x029d:
                r5 = r0
            L_0x029e:
                if (r29 == 0) goto L_0x02a2
                r10 = 0
                goto L_0x02a3
            L_0x02a2:
                r10 = 2
            L_0x02a3:
                er1.w4 r4 = er1.C45690w4.f123497a
                com.tencent.mm.plugin.finder.view.b6 r7 = new com.tencent.mm.plugin.finder.view.b6
                r7.<init>(r11, r12)
                r6 = 0
                r8 = 0
                r9 = 1
                r4.mo71189a(r5, r6, r7, r8, r9, r10)
            L_0x02b0:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C56664y5.C56665a.mo80021e(android.content.Context, android.content.Intent, int, fy3.l):com.tencent.mm.plugin.finder.view.v0");
        }

        /* renamed from: f */
        public final void mo80022f(View view, Bundle bundle) {
            FinderHalfContactItem finderHalfContactItem;
            View view2 = view;
            Bundle bundle2 = bundle;
            Class cls = C61212e.class;
            View findViewById = view2.findViewById(C0966R.C0970id.bmt);
            View findViewById2 = view2.findViewById(C0966R.C0970id.gtn);
            FinderHalfContactItem finderHalfContactItem2 = (FinderHalfContactItem) view2.findViewById(C0966R.C0970id.bmu);
            FinderHalfContactItem finderHalfContactItem3 = (FinderHalfContactItem) view2.findViewById(C0966R.C0970id.bqb);
            Context context = view.getContext();
            String string = context.getString(C0966R.string.esc);
            C87412m.m108593f(string, "context.getString(com.te…dk.R.string.finder_title)");
            finderHalfContactItem2.setTitle(string);
            String string2 = context.getString(C0966R.string.loa);
            C87412m.m108593f(string2, "context.getString(R.stri…er_recent_like_entry_new)");
            finderHalfContactItem3.setTitle(string2);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = findViewById2;
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            String string3 = bundle2 != null ? bundle2.getString("UserPreviewInfo", "") : null;
            if (string3 == null) {
                string3 = "";
            }
            String string4 = bundle2 != null ? bundle2.getString("V5UserName", "") : null;
            String str = string4 == null ? "" : string4;
            String string5 = bundle2 != null ? bundle2.getString("Nickname", "") : null;
            String str2 = string5 == null ? "" : string5;
            int i = bundle2 != null ? bundle2.getInt("FromScene_WXPROFILE", 0) : 0;
            int i2 = bundle2 != null ? bundle2.getInt("key_entrance_type", -1) : -1;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            C13604l[] lVarArr = new C13604l[4];
            String str3 = str2;
            lVarArr[0] = new C13604l("behaviour_session_id", q3 != null ? q3.f134670d : null);
            lVarArr[1] = new C13604l("finder_context_id", q3 != null ? q3.f134671e : null);
            lVarArr[2] = new C13604l("finder_tab_context_id", q3 != null ? q3.f134672f : null);
            lVarArr[3] = new C13604l("half_screen_source", Integer.valueOf(i));
            Map f2 = C90364q0.m113147f(lVarArr);
            ((C61212e) C86312j.m106911c(cls)).o30(view2, "wx_personal_card_half_screen");
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(view2, 32, 25496);
            ((C61212e) C86312j.m106911c(cls)).mo86149PM(view2, f2);
            if (!(string3.length() == 0)) {
                fp4 fp4 = new fp4();
                byte[] b = C45807d.m51085b(string3);
                if (b == null) {
                    fp4 = null;
                } else {
                    try {
                        fp4.parseFrom(b);
                    } catch (Exception e) {
                        Log.printDebugStack("safeParser", "", e);
                        fp4 = null;
                    }
                }
                if (fp4 != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c((Object) null);
                    View view4 = findViewById;
                    int i3 = i;
                    int i4 = i2;
                    String str4 = str3;
                    String str5 = str;
                    Context context2 = context;
                    T t = "";
                    FinderHalfContactItem finderHalfContactItem4 = finderHalfContactItem3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C8479f0 f0Var = new C8479f0();
                    f0Var.f27484d = t;
                    if (fp4.f133628d == null) {
                        finderHalfContactItem2.setVisibility(8);
                    } else {
                        ((C61212e) C86312j.m106911c(cls)).o30(finderHalfContactItem2, "wx_personal_card_finder_cell");
                        ((C61212e) C86312j.m106911c(cls)).mo86175pO(finderHalfContactItem2, 40, 25496);
                        ((C61212e) C86312j.m106911c(cls)).mo86149PM(finderHalfContactItem2, f2);
                        finderHalfContactItem2.setVisibility(0);
                        if (fp4.f133629e == 0) {
                            hp4 hp4 = new hp4();
                            hp4.f134812d.addAll(fp4.f133630f);
                            finderHalfContactItem2.f111883f = hp4;
                            finderHalfContactItem2.mo64653b();
                        } else {
                            finderHalfContactItem2.f111883f = null;
                            finderHalfContactItem2.mo64653b();
                        }
                        FinderContact finderContact = fp4.f133628d;
                        T t2 = finderContact != null ? finderContact.username : null;
                        if (t2 == null) {
                            t2 = t;
                        }
                        f0Var.f27484d = t2;
                    }
                    if (fp4.f133631g == 1) {
                        finderHalfContactItem = finderHalfContactItem4;
                        finderHalfContactItem.setVisibility(0);
                        if (finderHalfContactItem2.getVisibility() == 0) {
                            finderHalfContactItem.f111883f = null;
                            finderHalfContactItem.mo64653b();
                        } else {
                            hp4 hp42 = new hp4();
                            LinkedList<FinderObject> linkedList = hp42.f134812d;
                            C51129rn0 rn02 = fp4.f133632h;
                            Collection collection = rn02 != null ? rn02.f141036d : null;
                            if (collection == null) {
                                collection = C64186f0.f181907d;
                            }
                            linkedList.addAll(collection);
                            finderHalfContactItem.f111883f = hp42;
                            finderHalfContactItem.mo64653b();
                        }
                    } else {
                        finderHalfContactItem = finderHalfContactItem4;
                        finderHalfContactItem.setVisibility(8);
                    }
                    Context context3 = context2;
                    finderHalfContactItem2.setOnClickListener(new C4225g(f0Var, i4, i3, context3));
                    finderHalfContactItem.setOnClickListener(new C56674h(str5, context3, str4));
                    if (finderHalfContactItem2.getVisibility() == 0 && finderHalfContactItem.getVisibility() == 0) {
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c((Object) null);
                        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view5 = view3;
                        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    View view6 = view3;
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(8);
                    View view7 = view6;
                    C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (finderHalfContactItem2.getVisibility() == 8 && finderHalfContactItem.getVisibility() == 8) {
                        C9556a aVar5 = new C9556a();
                        aVar5.mo10233c(8);
                        View view8 = findViewById;
                        C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion", "updateWxProfileFinderEntry", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
        }
    }

    /* renamed from: hk */
    public void mo80016hk(C60187m5 m5Var, Intent intent) {
        C87412m.m108594g(m5Var, "contact");
        C87412m.m108594g(intent, "intent");
        intent.putExtra("Username", m5Var.getUsername());
        intent.putExtra("Avatar", m5Var.getAvatarUrl());
        intent.putExtra("Nickname", m5Var.mo84171f());
        intent.putExtra("Sex", m5Var.getSex());
        intent.putExtra("contactId", m5Var.mo84168a0());
        intent.putExtra("Province", m5Var.getProvince());
        intent.putExtra("City", m5Var.getCity());
        intent.putExtra("Country", m5Var.getCountry());
        intent.putExtra("Signature", m5Var.getSignature());
    }

    /* renamed from: zR */
    public void mo80017zR(Context context, Intent intent, int i, C32226l<? super String, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        f162421d.mo80021e(context, intent, i, lVar);
    }
}
