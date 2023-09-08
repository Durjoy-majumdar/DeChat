package com.tencent.p014mm.plugin.finder.view;

import a14.C0000n0;
import a14.C53934p0;
import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import al1.C54129i;
import al1.C54131l;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bl3.C39818r;
import c30.C104289g;
import cj1.C0537f2;
import cj1.C0545h1;
import cj1.C0556j5;
import cj1.C0581o5;
import cj1.C0642y3;
import cj1.C54795n5;
import cj1.C54804r0;
import cl1.C54979h1;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.xweb.WCWebUpdater;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import d14.C58052j1;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import dj1.C58275b1;
import eb0.C75592q0;
import fj1.C45795b;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8777j5;
import nj3.C76912y0;
import nk1.C11207i;
import oh1.C62015h;
import ok1.C62042e;
import org.json.JSONObject;
import p206nj.C117627q;
import p823sg.C101614i;
import pe3.C89349b;
import qg1.C47824c0;
import qj1.C12322e5;
import qj1.C62660c;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C48910bv0;
import te3.C49712hj1;
import te3.C49765hx0;
import te3.C50131kh1;
import te3.C50533nf0;
import te3.C52013xs0;
import te3.C64674r41;
import ud2.C14180f;
import vg1.C52891f;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: com.tencent.mm.plugin.finder.view.g7 */
public final class C4061g7 {

    /* renamed from: a */
    public static final C4061g7 f18189a = new C4061g7();

    /* renamed from: com.tencent.mm.plugin.finder.view.g7$a */
    public static final class C4062a implements C76912y0.C61776j {

        /* renamed from: a */
        public static final C4062a f18190a = new C4062a();

        /* renamed from: a */
        public final void mo596a(View view) {
            WeImageView weImageView;
            TextView textView;
            if (!(view == null || (textView = (TextView) view.findViewById(C0966R.C0970id.kpy)) == null)) {
                textView.setTextSize(1, 14.0f);
            }
            if (view != null && (weImageView = (WeImageView) view.findViewById(C0966R.C0970id.kpx)) != null) {
                weImageView.setImageResource(C0966R.raw.icons_filled_done);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.g7$b */
    public static final class C4063b implements C76912y0.C61776j {

        /* renamed from: a */
        public static final C4063b f18191a = new C4063b();

        /* renamed from: a */
        public final void mo596a(View view) {
            WeImageView weImageView;
            TextView textView;
            if (!(view == null || (textView = (TextView) view.findViewById(C0966R.C0970id.kpy)) == null)) {
                textView.setTextSize(1, 14.0f);
            }
            if (view != null && (weImageView = (WeImageView) view.findViewById(C0966R.C0970id.kpx)) != null) {
                weImageView.setImageResource(C0966R.raw.icon_outlined_close_comment);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.g7$c */
    public static final class C4064c extends C87413o implements C32229r<Integer, Integer, String, C50131kh1, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ View f18192d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4064c(View view) {
            super(4);
            this.f18192d = view;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            ((Number) obj).intValue();
            int intValue = ((Number) obj2).intValue();
            String str = (String) obj3;
            C87412m.m108594g((C50131kh1) obj4, "resp");
            if (intValue != 0) {
                if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE) {
                    C76912y0.makeText(this.f18192d.getContext(), (CharSequence) "拍一拍失败", 0).show();
                }
                Log.m105924i("LiveCommentPopupWindowItemClick", "tickle failed ,errCode " + intValue);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r2 = r2.f151988c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4953a(fj1.C45795b r6, cj1.C0581o5 r7) {
        /*
            r5 = this;
            java.lang.String r0 = "buContext"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r7, r0)
            boolean r0 = r7 instanceof cj1.C0556j5
            if (r0 != 0) goto L_0x0012
            boolean r0 = r7 instanceof cj1.C0642y3
            if (r0 == 0) goto L_0x008a
        L_0x0012:
            te3.hj1 r0 = new te3.hj1
            r0.<init>()
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            al1.i r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            r3 = 0
            if (r2 == 0) goto L_0x0028
            al1.l r2 = r2.f151988c
            if (r2 == 0) goto L_0x0028
            int r2 = r2.f152031k
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            r0.f134677n = r2
            r1.getClass()
            al1.i r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r1 == 0) goto L_0x0038
            al1.l r1 = r1.f151988c
            if (r1 == 0) goto L_0x0038
            int r3 = r1.f152031k
        L_0x0038:
            r0.f134675i = r3
            qg1.c0 r1 = new qg1.c0
            qg1.c0$a r2 = qg1.C47824c0.f128387v
            te3.xs0 r2 = new te3.xs0
            r2.<init>()
            long r3 = r7.getSeq()
            r2.f144905g = r3
            r7 = 20008(0x4e28, float:2.8037E-41)
            r2.f144903e = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r3 = eb0.C75592q0.m90789s()
            r7.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            r2.f144904f = r7
            r7 = 0
            r1.<init>(r2, r6, r0, r7)
            r1.mo9225i()
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131827247(0x7f111a2f, float:1.9287401E38)
            java.lang.String r6 = r6.getString(r7)
            java.lang.String r7 = "getContext().resources.g…nder_live_complaint_done)"
            gy3.C87412m.m108593f(r6, r7)
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.plugin.finder.view.g7$a r0 = com.tencent.p014mm.plugin.finder.view.C4061g7.C4062a.f18190a
            nj3.C76912y0.m92766e(r7, r6, r0)
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C4061g7.mo4953a(fj1.b, cj1.o5):void");
    }

    /* renamed from: b */
    public final void mo4954b(int i, C45795b bVar, C0000n0 n0Var, View view, C12322e5 e5Var, View view2, MenuItem menuItem, int i2, C0581o5 o5Var) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        C45795b bVar2 = bVar;
        C12322e5 e5Var2 = e5Var;
        View view3 = view2;
        C0581o5 o5Var2 = o5Var;
        Class cls = C54116w.class;
        Class cls2 = C54108o.class;
        Class cls3 = C54991o.class;
        C87412m.m108594g(bVar2, "buContext");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(e5Var2, "commentPlugin");
        C87412m.m108594g(view3, "root");
        C87412m.m108594g(menuItem, "menuItem");
        C87412m.m108594g(o5Var2, "msg");
        String e = o5Var.mo571e();
        switch (menuItem.getItemId()) {
            case 152:
                C64674r41 r412 = null;
                if (o5Var.getType() == 1) {
                    r412 = ((C0556j5) o5Var2).f1344a;
                } else {
                    int type = o5Var.getType();
                    if (type == 100000 || type == 20036) {
                        C7335d c = C86312j.m106911c(cls2);
                        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                        C0073g0 g0Var = C0073g0.LIVE_DESC;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type", 5);
                        jSONObject.put(FileReaderHelper.DOC_EXT, C117627q.m165909b(Util.nullAsNil(o5Var.getContent()), "utf-8"));
                        C13598b0 b0Var = C13598b0.f38549a;
                        C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
                        if (o5Var2 instanceof C0556j5) {
                            r412 = ((C0556j5) o5Var2).f1344a;
                            r412.f185124d = view2.getContext().getString(C0966R.string.dfh);
                        } else if (o5Var2 instanceof C0545h1) {
                            r412 = new C64674r41();
                            r412.f185124d = view2.getContext().getString(C0966R.string.dfh);
                            r412.f185126f = o5Var.getContent();
                            r412.f185127g = o5Var.getType();
                            r412.f185129i = o5Var.getSeq();
                            C52013xs0 xs02 = ((C0545h1) o5Var2).f1324a;
                            r412.f185130j = xs02.f144904f;
                            r412.f185133p = xs02.f144915t;
                        }
                    } else if (o5Var.getType() == 20002) {
                        C0537f2 f2Var = (C0537f2) o5Var2;
                        r412 = new C64674r41();
                        r412.f185124d = f2Var.mo573g();
                        r412.f185126f = f2Var.getContent();
                        r412.f185127g = 1;
                        r412.f185128h = f2Var.mo571e();
                        C52013xs0 xs03 = f2Var.f1301a;
                        r412.f185129i = xs03.f144913r;
                        r412.f185130j = xs03.f144904f;
                        r412.f185132o = xs03.f144914s;
                        r412.f185135r = xs03.f144902d;
                        r412.f185133p = xs03.f144915t;
                    } else if (o5Var.getType() == 20035) {
                        C0642y3 y3Var = (C0642y3) o5Var2;
                        r412 = new C64674r41();
                        r412.f185124d = y3Var.mo573g();
                        r412.f185126f = y3Var.getContent();
                        r412.f185127g = 1;
                        r412.f185128h = y3Var.mo571e();
                        C52013xs0 xs04 = y3Var.f1530a;
                        r412.f185129i = xs04.f144913r;
                        r412.f185130j = xs04.f144904f;
                        r412.f185132o = xs04.f144914s;
                        r412.f185133p = xs04.f144915t;
                    }
                }
                if (r412 != null) {
                    int type2 = o5Var.getType();
                    int i8 = (type2 == 100000 || type2 == 20036) ? 1 : 0;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("PARAM_FINDER_LIVE_TOP_COMMENT", r412.toByteArray());
                    e5Var2.f35525p.statusChange(C58124b.C58125b.FINDER_LIVE_TOP_COMMENNT, bundle);
                    new C58275b1(bVar2, r412, i8).mo9225i();
                    f18189a.mo4957e(e5Var2, r412);
                }
                if (((C54991o) bVar2.mo71262a(cls3)).f154190D) {
                    ((C54116w) C86312j.m106911c(cls)).Px0(13);
                    return;
                }
                ((C54108o) C86312j.m106911c(cls2)).Lx0(4);
                int n = o5Var.mo584n();
                if (n == 2) {
                    i4 = 1;
                    i3 = 2;
                } else if (n != 3) {
                    i4 = 1;
                    i3 = 0;
                } else {
                    i4 = 1;
                    i3 = 1;
                }
                mo4959g(i7, i4, i3);
                return;
            case 154:
                byte[] bArr = null;
                Log.m105924i("LiveCommentPopupWindowItemClick", "[LONGCLICK_MENU_FINDER_LIVE_REPLY], anchor or assistant, " + ((C54991o) bVar2.mo71262a(cls3)).f154190D + ", riskControlEnableComment:" + ((C54991o) bVar2.mo71262a(cls3)).f154362s + ",enableLiveRoomComment:" + ((C54991o) bVar2.mo71262a(cls3)).f154370u + ", enableCustomerComment:" + ((C54991o) bVar2.mo71262a(cls3)).f154366t);
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
                C49765hx0 i9 = o5Var.mo579i();
                if (i9 != null) {
                    bArr = i9.toByteArray();
                }
                bundle2.putByteArray("PARAM_ENTER_COMMENT_AT_NAME", bArr);
                e5Var2.f35525p.statusChange(C58124b.C58125b.ENTERING_COMMENT, bundle2);
                if (((C54991o) bVar2.mo71262a(cls3)).f154190D) {
                    ((C54116w) C86312j.m106911c(cls)).Px0(8);
                    return;
                } else if (C62042e.f176370a.mo87027N0()) {
                    ((C54108o) C86312j.m106911c(cls2)).Lx0(8);
                    return;
                } else {
                    ((C54116w) C86312j.m106911c(cls)).Px0(4);
                    return;
                }
            case 157:
                C49765hx0 i15 = o5Var.mo579i();
                if (i15 != null) {
                    f18189a.mo4958f(bVar2, e5Var2, view3, i15);
                    return;
                }
                return;
            case 158:
                Boolean bool = ((C54991o) bVar2.mo71262a(cls3)).f154262U0.get(e);
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                Log.m105924i("LiveCommentPopupWindowItemClick", "LONGCLICK_MENU_FINDER_LIVE_ANCHOR_BAN username:" + e + " disableComment:" + booleanValue);
                if (e != null) {
                    C54795n5 D0 = e5Var.mo14476D0();
                    if (D0 != null) {
                        D0.mo75725b(e, booleanValue, 2, C4082j7.f18212d);
                    }
                    if (e5Var2.f35525p.getLiveRole() == 1) {
                        ((C54108o) C86312j.m106911c(cls2)).getClass();
                        C54067f0 f0Var = C54108o.f151869h;
                        f0Var.f151443Y.f151842s++;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(String.valueOf(2), e);
                        C0073g0 g0Var2 = C0073g0.LIVE_ANCHOR_ACTION_BARRAGE;
                        ((C54108o) C86312j.m106911c(cls2)).getClass();
                        if (f0Var.f151448b0) {
                            g0Var2 = C0073g0.LIVE_ANCHOR_ACTION_AUDIENCE;
                        }
                        C7335d c2 = C86312j.m106911c(cls2);
                        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                        C8777j5.C8778a.m8605f((C8777j5) c2, g0Var2, jSONObject2.toString(), (String) null, 4, (Object) null);
                    }
                }
                if (((C54991o) bVar2.mo71262a(cls3)).f154190D) {
                    ((C54116w) C86312j.m106911c(cls)).Px0(booleanValue ? 11 : 10);
                    return;
                }
                ((C54108o) C86312j.m106911c(cls2)).Lx0(booleanValue ? 6 : 5);
                int i16 = booleanValue ? 6 : 4;
                int n2 = o5Var.mo584n();
                mo4959g(i7, i16, n2 != 2 ? n2 != 3 ? 0 : 1 : 2);
                return;
            case 161:
                C77407n nVar = new C77407n(view2.getContext(), 1, true);
                nVar.mo107569n(C85868k2.m106137b(view2.getContext()).inflate(C0966R.C0971layout.aft, (ViewGroup) null), false);
                nVar.f225771i = new C4125n7(view3);
                nVar.f225782p = new C4158q7(e5Var2, e, view3);
                nVar.mo107573q();
                if (((C54991o) bVar2.mo71262a(cls3)).f154190D) {
                    ((C54116w) C86312j.m106911c(cls)).Px0(12);
                    return;
                }
                ((C54108o) C86312j.m106911c(cls2)).Lx0(7);
                int n3 = o5Var.mo584n();
                if (n3 == 2) {
                    i6 = 5;
                    i5 = 2;
                } else if (n3 != 3) {
                    i6 = 5;
                    i5 = 0;
                } else {
                    i6 = 5;
                    i5 = 1;
                }
                mo4959g(i7, i6, i5);
                return;
            case 163:
            case 164:
                Bundle bundle3 = new Bundle();
                bundle3.putString("PARAM_MEMBERS_PROFILE_USERNAME", o5Var.mo571e());
                bundle3.putInt("PARAM_MEMBERS_PROFILE_SOURCE_TYPE", 2);
                e5Var2.f35525p.statusChange(C58124b.C58125b.LIVE_STATUS_OPEN_MEMBER_PROFILE, bundle3);
                if (((C54991o) bVar2.mo71262a(cls3)).f154190D) {
                    ((C54116w) C86312j.m106911c(cls)).Px0(9);
                    return;
                }
                return;
            case 165:
                C52891f fVar = C52891f.f147704a;
                Context context = view2.getContext();
                C87412m.m108593f(context, "root.context");
                fVar.mo73656f(n0Var, o5Var, view, bVar, context);
                return;
            case 166:
                C52891f fVar2 = C52891f.f147704a;
                Context context2 = view2.getContext();
                C87412m.m108593f(context2, "root.context");
                fVar2.mo73656f(n0Var, o5Var, view, bVar, context2);
                return;
            case 168:
                Boolean bool2 = ((C54991o) bVar2.mo71262a(cls3)).f154267V0.get(e);
                boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                Log.m105924i("LiveCommentPopupWindowItemClick", "LONGCLICK_MENU_FINDER_LIVE_ANCHOR_BAN_SELF_SEE username:" + e + " disableComment:" + booleanValue2);
                if (e != null) {
                    C4061g7 g7Var = f18189a;
                    C54795n5 D02 = e5Var.mo14476D0();
                    if (D02 != null) {
                        D02.mo75725b(e, booleanValue2, 3, C4118m7.f18292d);
                    }
                    if (e5Var2.f35525p.getLiveRole() == 1) {
                        JSONObject jSONObject3 = new JSONObject();
                        if (booleanValue2) {
                            jSONObject3.put("type", PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT);
                        } else {
                            jSONObject3.put("type", "9");
                        }
                        C7335d c3 = C86312j.m106911c(cls2);
                        C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
                        C8777j5.C8778a.m8605f((C8777j5) c3, C0073g0.COMMENT_OPTION, jSONObject3.toString(), (String) null, 4, (Object) null);
                        int i17 = booleanValue2 ? 7 : 3;
                        int n4 = o5Var.mo584n();
                        g7Var.mo4959g(i7, i17, n4 != 2 ? n4 != 3 ? 0 : 1 : 2);
                        return;
                    }
                    return;
                }
                return;
            case 169:
                String g = o5Var.mo573g();
                String e2 = o5Var.mo571e();
                if (g == null || g.length() == 0) {
                    Log.m105924i("FlashSaleDataController", "try to open flash sale with empty username");
                    return;
                }
                C50533nf0 nf02 = ((C54979h1) e5Var2.mo87696x0(C54979h1.class)).f154130W;
                if (nf02 != null) {
                    C11207i.m11067c(e5Var, (C66212f) null, (C53934p0) null, new C62015h(e5Var, nf02, e2, g, (C15601d<? super C62015h>) null), 3, (Object) null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public final void mo4955c(int i, C45795b bVar, C0000n0 n0Var, View view, C12322e5 e5Var, View view2, MenuItem menuItem, int i2, C0581o5 o5Var) {
        C64674r41 r412;
        C45795b bVar2 = bVar;
        C12322e5 e5Var2 = e5Var;
        View view3 = view2;
        C0581o5 o5Var2 = o5Var;
        Class cls = C54108o.class;
        Class cls2 = C54116w.class;
        Class cls3 = C54991o.class;
        C87412m.m108594g(bVar2, "buContext");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(e5Var2, "commentPlugin");
        C87412m.m108594g(view3, "root");
        C87412m.m108594g(menuItem, "menuItem");
        C87412m.m108594g(o5Var2, "msg");
        String e = o5Var.mo571e();
        byte[] bArr = null;
        switch (menuItem.getItemId()) {
            case 152:
                if (o5Var.getType() == 1) {
                    r412 = ((C0556j5) o5Var2).f1344a;
                } else {
                    int type = o5Var.getType();
                    if (type == 100000 || type == 20036) {
                        C7335d c = C86312j.m106911c(cls);
                        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                        C0073g0 g0Var = C0073g0.LIVE_DESC;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type", 5);
                        jSONObject.put(FileReaderHelper.DOC_EXT, C117627q.m165909b(Util.nullAsNil(o5Var.getContent()), "utf-8"));
                        C13598b0 b0Var = C13598b0.f38549a;
                        C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
                        if (o5Var2 instanceof C0556j5) {
                            r412 = ((C0556j5) o5Var2).f1344a;
                            r412.f185124d = view2.getContext().getString(C0966R.string.dfh);
                        } else if (o5Var2 instanceof C0545h1) {
                            r412 = new C64674r41();
                            r412.f185124d = view2.getContext().getString(C0966R.string.dfh);
                            r412.f185126f = o5Var.getContent();
                            r412.f185127g = o5Var.getType();
                            r412.f185129i = o5Var.getSeq();
                            C52013xs0 xs02 = ((C0545h1) o5Var2).f1324a;
                            r412.f185130j = xs02.f144904f;
                            r412.f185133p = xs02.f144915t;
                        }
                    } else if (o5Var.getType() == 20002) {
                        C0537f2 f2Var = (C0537f2) o5Var2;
                        r412 = new C64674r41();
                        r412.f185124d = f2Var.mo573g();
                        r412.f185126f = f2Var.getContent();
                        r412.f185127g = 1;
                        r412.f185128h = f2Var.mo571e();
                        C52013xs0 xs03 = f2Var.f1301a;
                        r412.f185129i = xs03.f144913r;
                        r412.f185130j = xs03.f144904f;
                        r412.f185132o = xs03.f144914s;
                        r412.f185135r = xs03.f144902d;
                        r412.f185133p = xs03.f144915t;
                    } else if (o5Var.getType() == 20035) {
                        C0642y3 y3Var = (C0642y3) o5Var2;
                        r412 = new C64674r41();
                        r412.f185124d = y3Var.mo573g();
                        r412.f185126f = y3Var.getContent();
                        r412.f185127g = 1;
                        r412.f185128h = y3Var.mo571e();
                        C52013xs0 xs04 = y3Var.f1530a;
                        r412.f185129i = xs04.f144913r;
                        r412.f185130j = xs04.f144904f;
                        r412.f185132o = xs04.f144914s;
                        r412.f185133p = xs04.f144915t;
                    }
                    r412 = null;
                }
                if (r412 != null) {
                    int type2 = o5Var.getType();
                    int i3 = (type2 == 100000 || type2 == 20036) ? 1 : 0;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("PARAM_FINDER_LIVE_TOP_COMMENT", r412.toByteArray());
                    e5Var2.f35525p.statusChange(C58124b.C58125b.FINDER_LIVE_TOP_COMMENNT, bundle);
                    new C58275b1(bVar2, r412, i3).mo9225i();
                    f18189a.mo4957e(e5Var2, r412);
                    if (((Boolean) ((C58052j1) ((C54991o) bVar2.mo71262a(cls3)).f154194E).getValue()).booleanValue()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("event_type", "1");
                        ((C54116w) C86312j.m106911c(cls2)).uy0(jSONObject2);
                    }
                }
                if (((C54991o) bVar2.mo71262a(cls3)).f154190D) {
                    ((C54116w) C86312j.m106911c(cls2)).Px0(13);
                    return;
                } else {
                    ((C54108o) C86312j.m106911c(cls)).Lx0(4);
                    return;
                }
            case 154:
                Log.m105924i("LiveCommentPopupWindowItemClick", "[LONGCLICK_MENU_FINDER_LIVE_REPLY], anchor or assistant, " + ((C54991o) bVar2.mo71262a(cls3)).f154190D + ", riskControlEnableComment:" + ((C54991o) bVar2.mo71262a(cls3)).f154362s + ",enableLiveRoomComment:" + ((C54991o) bVar2.mo71262a(cls3)).f154370u + ", enableCustomerComment:" + ((C54991o) bVar2.mo71262a(cls3)).f154366t);
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
                C49765hx0 i4 = o5Var.mo579i();
                if (i4 != null) {
                    bArr = i4.toByteArray();
                }
                bundle2.putByteArray("PARAM_ENTER_COMMENT_AT_NAME", bArr);
                e5Var2.f35525p.statusChange(C58124b.C58125b.ENTERING_COMMENT, bundle2);
                if (((C54991o) bVar2.mo71262a(cls3)).f154190D) {
                    ((C54116w) C86312j.m106911c(cls2)).Px0(8);
                    return;
                } else if (C62042e.f176370a.mo87027N0()) {
                    ((C54108o) C86312j.m106911c(cls)).Lx0(8);
                    return;
                } else {
                    ((C54116w) C86312j.m106911c(cls2)).Px0(4);
                    return;
                }
            case 156:
                mo4953a(bVar2, o5Var2);
                if (e5Var2.f35525p.getLiveRole() == 0) {
                    ((C54116w) C86312j.m106911c(cls2)).Vx0(o5Var.mo571e(), C54067f0.C0061j.COMMENT_ZONE);
                }
                ((C54116w) C86312j.m106911c(cls2)).Px0(6);
                return;
            case 157:
                C49765hx0 i5 = o5Var.mo579i();
                if (i5 != null) {
                    f18189a.mo4958f(bVar2, e5Var2, view3, i5);
                    break;
                }
                break;
            case 158:
                Boolean bool = ((C54991o) bVar2.mo71262a(cls3)).f154262U0.get(e);
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                Log.m105924i("LiveCommentPopupWindowItemClick", "LONGCLICK_MENU_FINDER_LIVE_ANCHOR_BAN username:" + e + " disableComment:" + booleanValue);
                if (e != null) {
                    C54795n5 D0 = e5Var.mo14476D0();
                    if (D0 != null) {
                        D0.mo75725b(e, booleanValue, 2, C4082j7.f18212d);
                    }
                    if (e5Var2.f35525p.getLiveRole() == 1) {
                        ((C54108o) C86312j.m106911c(cls)).getClass();
                        C54067f0 f0Var = C54108o.f151869h;
                        f0Var.f151443Y.f151842s++;
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(String.valueOf(2), e);
                        C0073g0 g0Var2 = C0073g0.LIVE_ANCHOR_ACTION_BARRAGE;
                        ((C54108o) C86312j.m106911c(cls)).getClass();
                        if (f0Var.f151448b0) {
                            g0Var2 = C0073g0.LIVE_ANCHOR_ACTION_AUDIENCE;
                        }
                        C7335d c2 = C86312j.m106911c(cls);
                        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                        C8777j5.C8778a.m8605f((C8777j5) c2, g0Var2, jSONObject3.toString(), (String) null, 4, (Object) null);
                    }
                }
                if (!((Boolean) ((C58052j1) ((C54991o) bVar2.mo71262a(cls3)).f154194E).getValue()).booleanValue()) {
                    ((C54108o) C86312j.m106911c(cls)).Lx0(booleanValue ? 6 : 5);
                    break;
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("event_type", booleanValue ? WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY : "3");
                    ((C54116w) C86312j.m106911c(cls2)).uy0(jSONObject4);
                    break;
                }
            case 163:
            case 164:
                Bundle bundle3 = new Bundle();
                bundle3.putString("PARAM_MEMBERS_PROFILE_USERNAME", o5Var.mo571e());
                bundle3.putInt("PARAM_MEMBERS_PROFILE_SOURCE_TYPE", 2);
                e5Var2.f35525p.statusChange(C58124b.C58125b.LIVE_STATUS_OPEN_MEMBER_PROFILE, bundle3);
                if (((C54991o) bVar2.mo71262a(cls3)).f154190D) {
                    ((C54116w) C86312j.m106911c(cls2)).Px0(9);
                    break;
                }
                break;
            case 165:
            case 166:
                C52891f fVar = C52891f.f147704a;
                Context context = view2.getContext();
                C87412m.m108593f(context, "root.context");
                fVar.mo73656f(n0Var, o5Var, view, bVar, context);
                break;
            case 168:
                Boolean bool2 = ((C54991o) bVar2.mo71262a(cls3)).f154267V0.get(e);
                boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                Log.m105924i("LiveCommentPopupWindowItemClick", "LONGCLICK_MENU_FINDER_LIVE_ANCHOR_BAN_SELF_SEE username:" + e + " disableComment:" + booleanValue2);
                if (e != null) {
                    C54795n5 D02 = e5Var.mo14476D0();
                    if (D02 != null) {
                        D02.mo75725b(e, booleanValue2, 3, C4118m7.f18292d);
                    }
                    if (e5Var2.f35525p.getLiveRole() == 1) {
                        JSONObject jSONObject5 = new JSONObject();
                        if (booleanValue2) {
                            jSONObject5.put("type", PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT);
                        } else {
                            jSONObject5.put("type", "9");
                        }
                        C7335d c3 = C86312j.m106911c(cls);
                        C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
                        C8777j5.C8778a.m8605f((C8777j5) c3, C0073g0.COMMENT_OPTION, jSONObject5.toString(), (String) null, 4, (Object) null);
                    }
                }
                if (((Boolean) ((C58052j1) ((C54991o) bVar2.mo71262a(cls3)).f154194E).getValue()).booleanValue()) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("event_type", booleanValue2 ? WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL : "2");
                    ((C54116w) C86312j.m106911c(cls2)).uy0(jSONObject6);
                    break;
                }
                break;
        }
    }

    /* renamed from: d */
    public final void mo4956d(int i, C45795b bVar, C0000n0 n0Var, View view, C12322e5 e5Var, View view2, MenuItem menuItem, int i2, C0581o5 o5Var) {
        int i3 = i;
        C45795b bVar2 = bVar;
        C12322e5 e5Var2 = e5Var;
        C0581o5 o5Var2 = o5Var;
        Class cls = C54116w.class;
        Class cls2 = C54991o.class;
        C87412m.m108594g(bVar2, "buContext");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(e5Var2, "commentPlugin");
        C87412m.m108594g(view2, "root");
        C87412m.m108594g(menuItem, "menuItem");
        C87412m.m108594g(o5Var2, "msg");
        int itemId = menuItem.getItemId();
        boolean z = false;
        int i4 = 1;
        if (itemId == 163) {
            String e = o5Var.mo571e();
            if (e == null || e.length() == 0) {
                z = true;
            }
            if (z) {
                Log.m105924i("LiveCommentPopupWindowItemClick", "goToFinderProfile finderUsername:" + e);
                return;
            }
            boolean g0 = e5Var.mo82893g0();
            Log.m105924i("LiveCommentPopupWindowItemClick", "goToFinderProfile isLandscape:" + g0);
            if (g0) {
                Bundle bundle = new Bundle();
                bundle.putString("PORTRAIT_ACTION_KEY_FINDER_USERNAME", e);
                C62660c.m73644Y0(e5Var, "PORTRAIT_ACTION_GOTO_PROFILE_COMMENT", bundle, 0, 4, (Object) null);
                return;
            }
            C54804r0 r0Var = C54804r0.f153631a;
            Context context = view2.getContext();
            C39818r rVar = C39818r.f106831a;
            Context context2 = view2.getContext();
            C87412m.m108593f(context2, "root.context");
            r0Var.mo75765g(context, bVar, false, e, ((C60172g4) rVar.mo62443b(context2).mo62447c(C60172g4.class)).mo12861q3());
        } else if (itemId == 165) {
            C52891f fVar = C52891f.f147704a;
            Context context3 = view2.getContext();
            C87412m.m108593f(context3, "root.context");
            fVar.mo73656f(n0Var, o5Var, view, bVar, context3);
        } else if (itemId != 166) {
            switch (itemId) {
                case 154:
                    Log.m105924i("LiveCommentPopupWindowItemClick", "[LONGCLICK_MENU_FINDER_LIVE_REPLY],riskControlEnableComment:" + ((C54991o) bVar2.mo71262a(cls2)).f154362s + ",enableLiveRoomComment:" + ((C54991o) bVar2.mo71262a(cls2)).f154370u + ", enableCustomerComment:" + ((C54991o) bVar2.mo71262a(cls2)).f154366t);
                    if (!((C54991o) bVar2.mo71262a(cls2)).f154362s || !((C54991o) bVar2.mo71262a(cls2)).f154370u || !((C54991o) bVar2.mo71262a(cls2)).f154366t) {
                        C76912y0.m92766e(view2.getContext(), MMApplicationContext.getContext().getResources().getString(C0966R.string.e6a), C4063b.f18191a);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
                        C49765hx0 i5 = o5Var.mo579i();
                        bundle2.putByteArray("PARAM_ENTER_COMMENT_AT_NAME", i5 != null ? i5.toByteArray() : null);
                        e5Var2.f35525p.statusChange(C58124b.C58125b.ENTERING_COMMENT, bundle2);
                    }
                    ((C54116w) C86312j.m106911c(cls)).Px0(4);
                    int n = o5Var.mo584n();
                    if (n == 2) {
                        i4 = 2;
                    } else if (n != 3) {
                        i4 = 0;
                    }
                    if (i3 == 2) {
                        ((C54116w) C86312j.m106911c(cls)).Wx0(0, 4, i4);
                        return;
                    }
                    return;
                case 155:
                    Object systemService = MMApplicationContext.getContext().getSystemService("clipboard");
                    C87412m.m108592e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService).setText(o5Var.getContent());
                    if (e5Var2.f35525p.getLiveRole() == 0) {
                        C54116w wVar = (C54116w) C86312j.m106911c(cls);
                        wVar.getClass();
                        C54116w.Ex0(wVar, C54067f0.C54076o0.CopyComment, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
                    }
                    ((C54116w) C86312j.m106911c(cls)).Px0(5);
                    int n2 = o5Var.mo584n();
                    if (n2 == 2) {
                        i4 = 2;
                    } else if (n2 != 3) {
                        i4 = 0;
                    }
                    if (i3 == 2) {
                        ((C54116w) C86312j.m106911c(cls)).Wx0(0, 5, i4);
                        return;
                    }
                    return;
                case 156:
                    mo4953a(bVar2, o5Var2);
                    if (e5Var2.f35525p.getLiveRole() == 0) {
                        ((C54116w) C86312j.m106911c(cls)).Vx0(o5Var.mo571e(), C54067f0.C0061j.COMMENT_ZONE);
                    }
                    ((C54116w) C86312j.m106911c(cls)).Px0(6);
                    int n3 = o5Var.mo584n();
                    if (n3 == 2) {
                        i4 = 2;
                    } else if (n3 != 3) {
                        i4 = 0;
                    }
                    if (i3 == 2) {
                        ((C54116w) C86312j.m106911c(cls)).Wx0(0, 6, i4);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            C52891f fVar2 = C52891f.f147704a;
            Context context4 = view2.getContext();
            C87412m.m108593f(context4, "root.context");
            fVar2.mo73656f(n0Var, o5Var, view, bVar, context4);
        }
    }

    /* renamed from: e */
    public final void mo4957e(C12322e5 e5Var, C64674r41 r412) {
        C87412m.m108594g(e5Var, "commentPlugin");
        C87412m.m108594g(r412, "msg");
        if (e5Var.f35525p.getLiveRole() == 1) {
            C104289g gVar = new C104289g();
            gVar.put("content", r412.f185126f);
            gVar.mo145953n("msgtype", r412.f185127g);
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_TOP_COMMENT, gVar.toString(), (String) null, 4, (Object) null);
        }
    }

    /* renamed from: f */
    public final void mo4958f(C45795b bVar, C12322e5 e5Var, View view, C49765hx0 hx02) {
        String str;
        C54131l lVar;
        C54131l lVar2;
        String str2;
        Class cls = C54108o.class;
        Class cls2 = C54991o.class;
        C101614i<String, Long> iVar = ((C54991o) bVar.mo71262a(cls2)).f154359r1;
        FinderContact finderContact = hx02.f134919d;
        String str3 = "";
        if (finderContact == null || (str = finderContact.username) == null) {
            str = str3;
        }
        Long l = (Long) iVar.get(str);
        String str4 = null;
        int i = 0;
        if (System.currentTimeMillis() - (l == null ? 0 : l.longValue()) < 10000) {
            C76912y0.makeText(view.getContext(), (CharSequence) view.getContext().getString(C0966R.string.e9f), 0).show();
            C101614i<String, Long> iVar2 = ((C54991o) bVar.mo71262a(cls2)).f154359r1;
            FinderContact finderContact2 = hx02.f134919d;
            if (finderContact2 != null) {
                str4 = finderContact2.username;
            }
            iVar2.put(str4, Long.valueOf(System.currentTimeMillis()));
            return;
        }
        C101614i<String, Long> iVar3 = ((C54991o) bVar.mo71262a(cls2)).f154359r1;
        FinderContact finderContact3 = hx02.f134919d;
        iVar3.put(finderContact3 != null ? finderContact3.username : null, Long.valueOf(System.currentTimeMillis()));
        C47824c0.C47825a aVar = C47824c0.f128387v;
        C52013xs0 xs02 = new C52013xs0();
        xs02.f144902d = hx02;
        C48910bv0 bv02 = new C48910bv0();
        FinderContact finderContact4 = hx02.f134919d;
        if (!(finderContact4 == null || (str2 = finderContact4.username) == null)) {
            str3 = str2;
        }
        bv02.f131324d = C14180f.m13511a(str3);
        xs02.f144906h = C89349b.m111674a(bv02.toByteArray());
        xs02.f144903e = 20001;
        xs02.f144904f = C75592q0.m90789s() + System.currentTimeMillis();
        C49712hj1 hj12 = new C49712hj1();
        FinderLiveService.f159376d.getClass();
        C54129i iVar4 = FinderLiveService.f159398z;
        hj12.f134677n = (iVar4 == null || (lVar2 = iVar4.f151988c) == null) ? 0 : lVar2.f152031k;
        if (!(iVar4 == null || (lVar = iVar4.f151988c) == null)) {
            i = lVar.f152031k;
        }
        hj12.f134675i = i;
        new C47824c0(xs02, bVar, hj12, new C4064c(view)).mo9225i();
        C62042e eVar = C62042e.f176370a;
        eVar.getClass();
        C87412m.m108594g(view, "view");
        view.performHapticFeedback(1, 3);
        eVar.mo87065b(xs02, bVar);
        C58124b.C7172a.m7372a(e5Var.f35525p, C58124b.C58125b.POST_MSG, (Bundle) null, 2, (Object) null);
        if (e5Var.f35525p.getLiveRole() == 1) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_TICKLE, "", (String) null, 4, (Object) null);
            ((C54108o) C86312j.m106911c(cls)).getClass();
            C54108o.f151869h.f151443Y.f151847x++;
        }
    }

    /* renamed from: g */
    public final void mo4959g(int i, int i2, int i3) {
        if (i == 2) {
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C0073g0 g0Var = C0073g0.LIVE_DANMAKU_OPERATION;
            C104289g gVar = new C104289g();
            gVar.mo145953n("type", i2);
            gVar.mo145953n("barrage_type", i3);
            C13598b0 b0Var = C13598b0.f38549a;
            C8777j5.C8778a.m8605f((C8777j5) c, g0Var, gVar.toString(), (String) null, 4, (Object) null);
        }
    }
}
