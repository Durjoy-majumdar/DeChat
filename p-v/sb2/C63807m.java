package sb2;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import bl3.C39818r;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderCommentUI;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawer;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentFooter;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.C57126b;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d03.C58010a;
import di3.C86312j;
import er1.C58684b;
import er1.C58739j4;
import er1.C58784w3;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C59822f;
import ht1.C60200t1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import jq3.C60898l;
import lq1.C10637c;
import lq1.C61349d;
import lq1.C61351e;
import lq1.C61355g;
import m03.C109459m;
import nb2.C61646d;
import o40.C61926c;
import p629ny.C76979h;
import p640ox.C77049b;
import qq1.C63317a;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sq1.C64147b;
import sx3.C36907w;
import sx3.C64197v;
import te3.C64793w23;
import ub2.C65306q0;
import up1.C37521f;
import up1.C65426w0;
import ya2.C66601e;

/* renamed from: sb2.m */
public final class C63807m extends UIComponent {

    /* renamed from: d */
    public C56597e1 f180878d;

    /* renamed from: e */
    public C61351e f180879e;

    /* renamed from: f */
    public final C57126b f180880f = new C57126b(getContext());

    /* renamed from: g */
    public final C65306q0 f180881g;

    /* renamed from: h */
    public final C109459m f180882h;

    /* renamed from: i */
    public final HashMap<Integer, WeakReference<TextView>> f180883i;

    /* renamed from: sb2.m$a */
    public static final class C63808a extends C87413o implements C32224a<C54219z<Boolean>> {

        /* renamed from: d */
        public static final C63808a f180884d = new C63808a();

        public C63808a() {
            super(0);
        }

        public Object invoke() {
            C54219z zVar = new C54219z();
            zVar.setValue(Boolean.FALSE);
            return zVar;
        }
    }

    /* renamed from: sb2.m$b */
    public static final class C63809b implements C109459m {

        /* renamed from: a */
        public final /* synthetic */ C63807m f180885a;

        /* renamed from: b */
        public final /* synthetic */ AppCompatActivity f180886b;

        /* renamed from: sb2.m$b$a */
        public static final class C63810a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C63807m f180887d;

            /* renamed from: e */
            public final /* synthetic */ C58010a f180888e;

            /* renamed from: f */
            public final /* synthetic */ AppCompatActivity f180889f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63810a(C63807m mVar, C58010a aVar, C63809b bVar, AppCompatActivity appCompatActivity) {
                super(0);
                this.f180887d = mVar;
                this.f180888e = aVar;
                this.f180889f = appCompatActivity;
            }

            public Object invoke() {
                String str;
                Collection<WeakReference<TextView>> values = this.f180887d.f180883i.values();
                C87412m.m108593f(values, "refVideoNickNameTvMap.values");
                C58010a aVar = this.f180888e;
                AppCompatActivity appCompatActivity = this.f180889f;
                C63807m mVar = this.f180887d;
                for (WeakReference weakReference : values) {
                    TextView textView = (TextView) weakReference.get();
                    if (textView != null) {
                        Object obj = aVar.f165945q;
                        if (obj instanceof FinderObject) {
                            FinderObject finderObject = (FinderObject) obj;
                            FinderContact finderContact = finderObject.contact;
                            Object obj2 = null;
                            if (!(finderContact == null || (str = finderContact.nickname) == null)) {
                                if (!(str.length() > 0)) {
                                    str = null;
                                }
                                if (str != null) {
                                    Object tag = textView.getTag();
                                    FinderContact finderContact2 = finderObject.contact;
                                    if (finderContact2 != null) {
                                        obj2 = finderContact2.username;
                                    }
                                    if (!C87412m.m108589b(tag, obj2)) {
                                        SpannableString spannableString = new SpannableString(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(appCompatActivity, str));
                                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7D90A9")), 0, str.length(), 33);
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                        spannableStringBuilder.append(appCompatActivity.getString(C0966R.string.f361081h41));
                                        spannableStringBuilder.append(spannableString);
                                        spannableStringBuilder.append(appCompatActivity.getString(C0966R.string.f361080h40));
                                        textView.setText(spannableStringBuilder);
                                        textView.setVisibility(0);
                                        textView.setOnClickListener(new C63814n(obj, mVar));
                                    } else {
                                        textView.setVisibility(8);
                                    }
                                    obj2 = C13598b0.f38549a;
                                }
                            }
                            if (obj2 == null) {
                                textView.setVisibility(8);
                            }
                        } else {
                            textView.setVisibility(8);
                        }
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C63809b(C63807m mVar, AppCompatActivity appCompatActivity) {
            this.f180885a = mVar;
            this.f180886b = appCompatActivity;
        }

        /* renamed from: a */
        public void mo80357a(int i, C58010a aVar) {
            C87412m.m108594g(aVar, "targetMedia");
            C61926c.m72668M(new C63810a(this.f180885a, aVar, this, this.f180886b));
        }
    }

    /* renamed from: sb2.m$c */
    public static final class C63811c implements C65306q0.C65308b {

        /* renamed from: a */
        public final /* synthetic */ AppCompatActivity f180890a;

        public C63811c(AppCompatActivity appCompatActivity) {
            this.f180890a = appCompatActivity;
        }

        /* renamed from: a */
        public void mo88606a(C59822f fVar) {
            C39622i0 a = C39818r.f106831a.mo62444c(this.f180890a).mo75002a(C63849t0.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…icMvShareUIC::class.java)");
            ((C63849t0) a).mo88641f3(fVar, true, 2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63807m(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f180881g = new C65306q0(appCompatActivity, new C63811c(appCompatActivity));
        C36568h.m40985a(C63808a.f180884d);
        this.f180882h = new C63809b(this, appCompatActivity);
        this.f180883i = new HashMap<>();
    }

    /* renamed from: c3 */
    public final void mo88600c3(String str, boolean z) {
        Class cls = C60200t1.class;
        Class cls2 = C64793w23.class;
        Class cls3 = C77049b.class;
        C87412m.m108594g(str, "username");
        Integer num = null;
        if (z) {
            C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(cls3)).Wi0(getContext(), 7, cls2);
            if (w232 != null) {
                num = Integer.valueOf(w232.f186049w + 1);
            }
            C64793w23 w233 = (C64793w23) ((C77049b) C86312j.m106911c(cls3)).Wi0(getContext(), 7, cls2);
            if (w233 != null) {
                w233.f186049w = num.intValue();
            }
        } else {
            C64793w23 w234 = (C64793w23) ((C77049b) C86312j.m106911c(cls3)).Wi0(getContext(), 7, cls2);
            if (w234 != null) {
                num = Integer.valueOf(w234.f186050x + 1);
            }
            C64793w23 w235 = (C64793w23) ((C77049b) C86312j.m106911c(cls3)).Wi0(getContext(), 7, cls2);
            if (w235 != null) {
                w235.f186050x = num.intValue();
            }
        }
        Intent intent = new Intent();
        intent.putExtra("finder_username", str);
        intent.putExtra("report_scene", 19);
        intent.putExtra("key_enter_profile_type", 1);
        intent.putExtra("key_not_request_focus", true);
        intent.putExtra("key_hide_float_ball", true);
        intent.putExtra("key_from_comment_scene", 91);
        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(7, 2, 32, intent);
        ((C60200t1) C86312j.m106911c(cls)).mo76819V1(getActivity(), intent);
    }

    /* renamed from: d3 */
    public final void mo88601d3() {
        if (this.f180878d == null) {
            C56597e1.C56598a aVar = C56597e1.f162252i;
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            View decorView = getActivity().getWindow().getDecorView();
            C87412m.m108593f(decorView, "activity.window.decorView");
            this.f180878d = aVar.mo79927b((MMActivity) activity, decorView, 2, false, 70);
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [lq1.h, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88602e3() {
        /*
            r14 = this;
            lq1.e r0 = r14.f180879e
            if (r0 != 0) goto L_0x00a9
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, rx3.l<lq1.c, lq1.d>> r0 = lq1.C61351e.f174509e
            androidx.appcompat.app.AppCompatActivity r0 = r14.getActivity()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r0, r1)
            r3 = r0
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            androidx.appcompat.app.AppCompatActivity r0 = r14.getActivity()
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "activity.window.decorView"
            gy3.C87412m.m108593f(r0, r1)
            r1 = 2
            r2 = 0
            r4 = 70
            android.view.Window r5 = r3.getWindow()
            r6 = 50
            r5.setSoftInputMode(r6)
            lq1.e r13 = new lq1.e
            r10 = 0
            r11 = 4
            r12 = 0
            r8 = 2
            r9 = 0
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            r13.f174511b = r3
            up1.f r5 = up1.C37521f.f99374d
            r5.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99288T0
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r6 = 1
            r7 = 0
            if (r5 != r6) goto L_0x0056
            r13.f174510a = r7
            goto L_0x00a7
        L_0x0056:
            int r5 = com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawer.f161350T
            lq1.g0 r8 = new lq1.g0
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r5 = new com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter
            r5.<init>(r3)
            r8.<init>(r5)
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer r9 = new com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer
            r9.<init>(r3)
            er1.r3 r5 = er1.C7865r3.f26468a
            int r5 = r5.mo8968a()
            double r5 = (double) r5
            r10 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r5 = r5 * r10
            int r5 = (int) r5
            r9.setTopOffset(r5)
            r8.mo86321r(r9, r1)
            lq1.h r1 = r8.f174524d
            boolean r5 = r1 instanceof com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter
            if (r5 == 0) goto L_0x0082
            r7 = r1
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r7 = (com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter) r7
        L_0x0082:
            if (r7 != 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r7.f161377e = r4
        L_0x0087:
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter"
            gy3.C87412m.m108592e(r1, r4)
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter r1 = (com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter) r1
            r1.f161392w = r2
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r6.<init>(r1, r1)
            lq1.f r1 = new lq1.f
            r10 = 0
            r2 = r1
            r4 = r0
            r5 = r9
            r7 = r8
            r8 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.post(r1)
            r13.f174510a = r9
        L_0x00a7:
            r14.f180879e = r13
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63807m.mo88602e3():void");
    }

    /* renamed from: f3 */
    public final void mo88603f3(C59822f fVar, long j, CommentDrawerContract.CloseDrawerCallback closeDrawerCallback) {
        C59822f fVar2 = fVar;
        Class cls = C64793w23.class;
        Class cls2 = C77049b.class;
        C87412m.m108594g(fVar2, "musicMv");
        C87412m.m108594g(closeDrawerCallback, "closeCallback");
        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(cls2)).Wi0(getContext(), 7, cls);
        Integer valueOf = w232 != null ? Integer.valueOf(w232.f186044r + 1) : null;
        C64793w23 w233 = (C64793w23) ((C77049b) C86312j.m106911c(cls2)).Wi0(getContext(), 7, cls);
        if (w233 != null) {
            w233.f186044r = valueOf.intValue();
        }
        C64793w23 w234 = (C64793w23) ((C77049b) C86312j.m106911c(cls2)).Wi0(getContext(), 7, cls);
        if (w234 != null) {
            w234.f186039j = 1;
        }
        FinderObject d = C59822f.f170752A.mo84779d(fVar2);
        if (d != null) {
            Log.m105924i("MicroMsg.Mv.MusicMvInfoUIC", "onCommentClicked id:" + d.f164794id + " nonceId:" + d.objectNonceId);
            FinderItem a = FinderItem.Companion.mo79056a(d, 65536);
            mo88601d3();
            this.f180881g.mo89414a();
            C56597e1 e1Var = this.f180878d;
            if (e1Var != null) {
                C56597e1.m65265e(e1Var, a, false, j, false, true, (C65426w0) null, false, 0, closeDrawerCallback, false, 0, 0, 0, 7808, (Object) null);
            }
        }
    }

    /* renamed from: g3 */
    public final void mo88604g3(long j, C61355g gVar) {
        long j2 = j;
        C61355g gVar2 = gVar;
        C87412m.m108594g(gVar2, "closeCallback");
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C63756e.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
        mo88602e3();
        this.f180881g.mo89414a();
        C61351e eVar = this.f180879e;
        if (eVar != null) {
            C63756e eVar2 = (C63756e) a;
            C63317a aVar = new C63317a(eVar2.f180729A, eVar2.f180730B);
            aVar.f179676h = eVar2.f180744i;
            aVar.f179671c = eVar2.f180732D;
            ConcurrentHashMap<Long, C13604l<C10637c, C61349d>> concurrentHashMap = C61351e.f174509e;
            eVar.getClass();
            C37521f fVar = C37521f.f99374d;
            fVar.getClass();
            if (C37521f.f99288T0.mo60266n().intValue() == 1) {
                C58784w3 w3Var = C58784w3.f168295a;
                C10637c cVar = eVar.f174512c;
                MMFragmentActivity mMFragmentActivity = eVar.f174511b;
                C58739j4 j4Var = C58739j4.f168176a;
                if (cVar != null && mMFragmentActivity != null) {
                    eVar.f174513d = new C61349d(aVar, false, j, true, true, (C64147b) null);
                    long currentTimeMillis = System.currentTimeMillis();
                    ConcurrentHashMap<Long, C13604l<C10637c, C61349d>> concurrentHashMap2 = C61351e.f174509e;
                    Long valueOf = Long.valueOf(currentTimeMillis);
                    C61349d dVar = eVar.f174513d;
                    if (dVar != null) {
                        concurrentHashMap2.put(valueOf, new C13604l(cVar, dVar));
                        Intent intent = new Intent();
                        intent.putExtra("COMMENT_REQUEST_KEY", currentTimeMillis);
                        intent.putExtra("FROM_MSG", false);
                        intent.putExtra("MENTION_ID", 0);
                        intent.putExtra("MENTION_CREATE_TIME", 0);
                        C13442s8.f38060Q0.mo12871c(mMFragmentActivity, intent);
                        ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
                        intent.setClass(mMFragmentActivity, FinderCommentUI.class);
                        mMFragmentActivity.startActivityForResult(intent, 500);
                        mMFragmentActivity.overridePendingTransition(0, 0);
                        return;
                    }
                    C87412m.m108603p("drawerOpenData");
                    throw null;
                }
                return;
            }
            UniCommentDrawer uniCommentDrawer = eVar.f174510a;
            if (uniCommentDrawer != null) {
                uniCommentDrawer.setOnCloseDrawerCallback(gVar2);
            }
            UniCommentDrawer uniCommentDrawer2 = eVar.f174510a;
            if (uniCommentDrawer2 != null) {
                int i = UniCommentDrawer.f161350T;
                uniCommentDrawer2.f161367R = false;
                uniCommentDrawer2.f161359I = true;
                uniCommentDrawer2.f161360J = false;
                uniCommentDrawer2.f161361K = false;
                uniCommentDrawer2.f161365P = false;
                uniCommentDrawer2.f161366Q = 0;
                UniCommentFooter uniCommentFooter = uniCommentDrawer2.f161364N;
                if (uniCommentFooter != null) {
                    uniCommentFooter.setBanSwitchScene(false);
                }
                UniCommentFooter uniCommentFooter2 = uniCommentDrawer2.f161364N;
                if (uniCommentFooter2 != null) {
                    int i2 = UniCommentFooter.f161411J;
                    uniCommentFooter2.mo79286l(true);
                }
                if (fVar.mo61156J() > 0) {
                    fVar.mo61178d0(fVar.mo61156J() - 1);
                }
                if (uniCommentDrawer2.f161355E) {
                    uniCommentDrawer2.f161354D = uniCommentDrawer2.f161353C;
                    Log.m105924i("MicroMsg.MusicUni.CommentDrawer", "refreshSceneForReply isSelfProfile " + uniCommentDrawer2.f161353C);
                } else {
                    uniCommentDrawer2.f161354D = fVar.mo61154H();
                }
                UniCommentFooter uniCommentFooter3 = uniCommentDrawer2.f161364N;
                if (uniCommentFooter3 != null) {
                    uniCommentFooter3.setScene(uniCommentDrawer2.f161354D);
                }
                UniCommentFooter uniCommentFooter4 = uniCommentDrawer2.f161364N;
                if (uniCommentFooter4 != null) {
                    uniCommentFooter4.mo79285k(true);
                }
                if (!uniCommentDrawer2.mo82541i()) {
                    uniCommentDrawer2.f161351A = aVar;
                    uniCommentDrawer2.f161352B = j2;
                    uniCommentDrawer2.f161357G = false;
                    uniCommentDrawer2.f161362L = null;
                    uniCommentDrawer2.f161363M = true;
                    uniCommentDrawer2.mo82542j(true, j2 == 0, 0);
                }
            }
        }
    }

    /* renamed from: i3 */
    public final void mo88605i3(C59822f fVar) {
        Class cls = MusicMvMainUIC.class;
        C87412m.m108594g(fVar, "musicMv");
        C39818r rVar = C39818r.f106831a;
        boolean z = true;
        ((MusicMvMainUIC) rVar.mo62444c(getActivity()).mo75002a(cls)).f163279s.f165720w = true;
        C39622i0 a = rVar.mo62444c(getActivity()).mo75002a(cls);
        C87412m.m108593f(a, "UICProvider.of(activity)…sicMvMainUIC::class.java)");
        C39622i0 a2 = rVar.mo62444c(getActivity()).mo75002a(C63756e.class);
        C87412m.m108593f(a2, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
        C63756e eVar = (C63756e) a2;
        C57126b bVar = this.f180880f;
        ArrayList<C61646d> arrayList = ((MusicMvMainUIC) a).f163270g;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        Iterator<C61646d> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().f175298d);
        }
        int i = eVar.f180731C;
        bVar.getClass();
        bVar.f163668f.clear();
        bVar.f163673n = fVar;
        Iterator it4 = arrayList2.iterator();
        int i2 = 0;
        while (it4.hasNext()) {
            Object next = it4.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C59822f fVar2 = (C59822f) next;
                if (C59822f.f170752A.mo84780e(fVar2)) {
                    bVar.f163668f.add(new C57126b.C57129c((long) i2, fVar2, i));
                }
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        if (bVar.f163668f.isEmpty()) {
            bVar.f163675p = C60898l.m71327S5((WxRecyclerAdapter) ((C36570n) bVar.f163671i).getValue(), bVar.f163674o, -2, false, 4, (Object) null);
        } else {
            C60898l.C60899a aVar = bVar.f163675p;
            if (aVar != null) {
                ((WxRecyclerAdapter) ((C36570n) bVar.f163671i).getValue()).mo85801h6(((C60898l.C60901e) aVar).getItemId(), false);
            }
        }
        TextView textView = bVar.f163670h;
        if (textView != null) {
            textView.setText(bVar.f163666d.getString(C0966R.string.h4w, new Object[]{Integer.valueOf(bVar.f163668f.size())}));
        }
        ((WxRecyclerAdapter) ((C36570n) bVar.f163671i).getValue()).notifyDataSetChanged();
        C57126b bVar2 = this.f180880f;
        if (!bVar2.f163669g.mo90642b()) {
            C66601e eVar2 = bVar2.f163669g;
            eVar2.f191515g = eVar2.mo90641a();
            Context context = eVar2.f191512d;
            eVar2.f191516h = context instanceof Activity ? ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
            if (eVar2.f191513e != null) {
                View view = eVar2.f191514f;
                C87412m.m108591d(view);
                ViewParent parent = view.getParent();
                C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).setVisibility(0);
                View view2 = eVar2.f191514f;
                C87412m.m108591d(view2);
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (eVar2.f191515g && eVar2.f191517i != null) {
                    Rect rect = new Rect();
                    View view3 = eVar2.f191517i;
                    C87412m.m108591d(view3);
                    view3.getWindowVisibleDisplayFrame(rect);
                    layoutParams2.width = rect.right;
                }
                View view4 = eVar2.f191514f;
                C87412m.m108591d(view4);
                view4.setLayoutParams(layoutParams2);
                Dialog dialog = eVar2.f191513e;
                C87412m.m108591d(dialog);
                Window window = dialog.getWindow();
                C87412m.m108591d(window);
                window.addFlags(Integer.MIN_VALUE);
                Dialog dialog2 = eVar2.f191513e;
                C87412m.m108591d(dialog2);
                Window window2 = dialog2.getWindow();
                C87412m.m108591d(window2);
                window2.clearFlags(8);
                Dialog dialog3 = eVar2.f191513e;
                C87412m.m108591d(dialog3);
                Window window3 = dialog3.getWindow();
                C87412m.m108591d(window3);
                window3.clearFlags(131072);
                Dialog dialog4 = eVar2.f191513e;
                C87412m.m108591d(dialog4);
                Window window4 = dialog4.getWindow();
                C87412m.m108591d(window4);
                window4.clearFlags(128);
                Dialog dialog5 = eVar2.f191513e;
                C87412m.m108591d(dialog5);
                Window window5 = dialog5.getWindow();
                C87412m.m108591d(window5);
                window5.getDecorView().setSystemUiVisibility(0);
                View view5 = eVar2.f191517i;
                if (view5 != null) {
                    if (eVar2.f191518j != null) {
                        z = false;
                    }
                    ViewTreeObserver viewTreeObserver = view5.getViewTreeObserver();
                    eVar2.f191518j = viewTreeObserver;
                    if (z) {
                        C87412m.m108591d(viewTreeObserver);
                        viewTreeObserver.addOnGlobalLayoutListener(eVar2);
                    }
                }
                Context context2 = eVar2.f191512d;
                if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
                    Dialog dialog6 = eVar2.f191513e;
                    C87412m.m108591d(dialog6);
                    dialog6.show();
                }
                BottomSheetBehavior<?> bottomSheetBehavior = eVar2.f191519n;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.f309230p = false;
                }
            }
        }
    }

    public boolean onBackPressed() {
        C56597e1 e1Var = this.f180878d;
        if (!(e1Var != null && e1Var.mo79924b())) {
            return false;
        }
        C56597e1 e1Var2 = this.f180878d;
        if (e1Var2 != null) {
            e1Var2.mo79923a();
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo88601d3();
        mo88602e3();
    }

    public void onDestroy() {
        C56597e1 e1Var = this.f180878d;
        if (e1Var != null) {
            e1Var.mo79923a();
        }
        super.onDestroy();
    }
}
