package ao1;

import a14.C0000n0;
import a14.C53934p0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C0317e;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.FinderPostUI;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C75590o4;
import eb0.C75592q0;
import er1.C58684b;
import er1.C7868s3;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C87412m;
import it1.C9247b;
import java.util.Map;
import je1.C9323j1;
import kotlin.ResultKt;
import l31.C61212e;
import nj3.C76912y0;
import nr3.C89059e;
import p196ln.C76705f;
import p196ln.C76706g;
import q31.C118148a;
import q40.C12040d;
import qo3.C12925w;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49300el1;
import te3.C49335eu3;
import te3.C49849ii0;
import te3.C49998jj0;
import te3.C50251le1;
import up1.C37521f;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

/* renamed from: ao1.l */
public final class C0166l extends UIComponent {

    /* renamed from: g */
    public static String f617g = "";

    /* renamed from: h */
    public static String f618h = "";

    /* renamed from: d */
    public C12925w f619d;

    /* renamed from: e */
    public C9247b f620e;

    /* renamed from: f */
    public String f621f = "";

    /* renamed from: ao1.l$a */
    public static final class C0167a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C0166l f622a;

        public C0167a(C0166l lVar) {
            this.f622a = lVar;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C13442s8.class;
            C13604l[] lVarArr = new C13604l[5];
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f622a.getContext());
            lVarArr[0] = new C13604l("behaviour_session_id", f != null ? f.f38099o : null);
            C39818r rVar = C39818r.f106831a;
            lVarArr[1] = new C13604l("finder_context_id", String.valueOf(((C13442s8) rVar.mo62443b(this.f622a.getContext()).mo75002a(cls)).f38098n));
            lVarArr[2] = new C13604l("finder_tab_context_id", String.valueOf(((C13442s8) rVar.mo62443b(this.f622a.getContext()).mo75002a(cls)).f38100p));
            AppCompatActivity activity = this.f622a.getActivity();
            if (activity instanceof FinderPostUI) {
                FinderPostUI finderPostUI = (FinderPostUI) activity;
            }
            lVarArr[3] = new C13604l("comment_scene", 74);
            lVarArr[4] = new C13604l("ref_commentscene", Integer.valueOf(((C13442s8) rVar.mo62443b(this.f622a.getContext()).mo75002a(cls)).f38095h));
            return C90364q0.m113147f(lVarArr);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.post.PostCreateContactUIC$requestCreateUser$1", mo125469f = "PostCreateContactUIC.kt", mo125470l = {258, 271, 278}, mo125471m = "invokeSuspend")
    /* renamed from: ao1.l$b */
    public static final class C0168b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f623d;

        /* renamed from: e */
        public int f624e;

        /* renamed from: f */
        public final /* synthetic */ String f625f;

        /* renamed from: g */
        public final /* synthetic */ C49849ii0 f626g;

        /* renamed from: h */
        public final /* synthetic */ C49849ii0 f627h;

        /* renamed from: i */
        public final /* synthetic */ C8478d0 f628i;

        /* renamed from: j */
        public final /* synthetic */ C8478d0 f629j;

        /* renamed from: n */
        public final /* synthetic */ C0166l f630n;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.post.PostCreateContactUIC$requestCreateUser$1$2$1", mo125469f = "PostCreateContactUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: ao1.l$b$a */
        public static final class C0169a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C0166l f631d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0169a(C0166l lVar, C15601d<? super C0169a> dVar) {
                super(2, dVar);
                this.f631d = lVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C0169a(this.f631d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C0169a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C9247b bVar = this.f631d.f620e;
                if (bVar != null) {
                    bVar.mo8913b();
                }
                C12925w wVar = this.f631d.f619d;
                if (wVar != null) {
                    wVar.f36933o = true;
                    wVar.mo5085n();
                    ((PostMainUIC) C39818r.f106831a.mo62444c(this.f631d.getActivity()).mo75002a(PostMainUIC.class)).mo78411G3().performClick();
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("bottomSheet");
                throw null;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.post.PostCreateContactUIC$requestCreateUser$1$3$1", mo125469f = "PostCreateContactUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: ao1.l$b$b */
        public static final class C0170b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C0166l f632d;

            /* renamed from: e */
            public final /* synthetic */ Throwable f633e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0170b(C0166l lVar, Throwable th, C15601d<? super C0170b> dVar) {
                super(2, dVar);
                this.f632d = lVar;
                this.f633e = th;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C0170b(this.f632d, this.f633e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C0170b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C50251le1 le12;
                String str;
                ResultKt.throwOnFailure(obj);
                C0166l lVar = this.f632d;
                C49335eu3 eu32 = ((C12040d) this.f633e).f35060h;
                C49998jj0 jj02 = eu32 instanceof C49998jj0 ? (C49998jj0) eu32 : null;
                C9247b bVar = lVar.f620e;
                if (bVar != null) {
                    bVar.mo8913b();
                }
                if (!(jj02 == null || (le12 = jj02.f136151e) == null)) {
                    String string = lVar.getString(C0966R.string.msx);
                    String str2 = le12.f137357e;
                    if (!(str2 == null || str2.length() == 0) && (str = le12.f137357e) != null) {
                        string = str;
                    }
                    C76912y0.m92773l(lVar.getContext(), string);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0168b(String str, C49849ii0 ii02, C49849ii0 ii03, C8478d0 d0Var, C8478d0 d0Var2, C0166l lVar, C15601d<? super C0168b> dVar) {
            super(2, dVar);
            this.f625f = str;
            this.f626g = ii02;
            this.f627h = ii03;
            this.f628i = d0Var;
            this.f629j = d0Var2;
            this.f630n = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0168b(this.f625f, this.f626g, this.f627h, this.f628i, this.f629j, this.f630n, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0168b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00cd A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r13.f624e
                r2 = 0
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x002e
                if (r1 == r5) goto L_0x0024
                if (r1 == r3) goto L_0x001d
                if (r1 != r4) goto L_0x0015
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x00ce
            L_0x0015:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x001d:
                java.lang.Object r1 = r13.f623d
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x00ae
            L_0x0024:
                kotlin.ResultKt.throwOnFailure(r14)
                kotlin.Result r14 = (kotlin.Result) r14
                java.lang.Object r14 = r14.m168123unboximpl()
                goto L_0x008e
            L_0x002e:
                kotlin.ResultKt.throwOnFailure(r14)
                zc1.b r14 = zc1.C66785b.f191882e
                bd1.a r1 = new bd1.a
                com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$a r6 = com.tencent.p014mm.plugin.finder.p056ui.FinderCreateContactUI.f16795U0
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "FinderCreateUser_"
                r6.append(r7)
                long r7 = java.lang.System.nanoTime()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r1.<init>(r6)
                java.lang.String r6 = r13.f625f
                te3.ii0 r7 = r13.f626g
                te3.ii0 r8 = r13.f627h
                gy3.d0 r9 = r13.f628i
                gy3.d0 r10 = r13.f629j
                java.lang.String r11 = ao1.C0166l.f618h
                java.lang.String r12 = "<set-?>"
                gy3.C87412m.m108594g(r11, r12)
                r1.f808b = r11
                java.lang.String r11 = ""
                r1.f809c = r11
                gy3.C87412m.m108594g(r6, r12)
                r1.f810d = r6
                r1.f811e = r7
                r1.f812f = r8
                int r6 = r9.f27483d
                r1.f813g = r6
                int r6 = r10.f27483d
                r1.f814h = r6
                r1.f815i = r5
                r6 = 0
                r1.f816j = r6
                te3.i10 r6 = new te3.i10
                r6.<init>()
                r6.f135020d = r4
                r1.f817k = r6
                r13.f624e = r5
                java.lang.Object r14 = r14.mo90659J2(r1, r13)
                if (r14 != r0) goto L_0x008e
                return r0
            L_0x008e:
                r1 = r14
                ao1.l r14 = r13.f630n
                boolean r5 = kotlin.Result.m168121isSuccessimpl(r1)
                if (r5 == 0) goto L_0x00ae
                r5 = r1
                te3.jj0 r5 = (te3.C49998jj0) r5
                a14.h0 r5 = a14.C53872d1.f151117a
                a14.k2 r5 = f14.C58901s.f168555a
                ao1.l$b$a r6 = new ao1.l$b$a
                r6.<init>(r14, r2)
                r13.f623d = r1
                r13.f624e = r3
                java.lang.Object r14 = a14.C53895h.m60469g(r5, r6, r13)
                if (r14 != r0) goto L_0x00ae
                return r0
            L_0x00ae:
                ao1.l r14 = r13.f630n
                java.lang.Throwable r3 = kotlin.Result.m168117exceptionOrNullimpl(r1)
                if (r3 == 0) goto L_0x00ce
                boolean r5 = r3 instanceof q40.C12040d
                if (r5 == 0) goto L_0x00ce
                a14.h0 r5 = a14.C53872d1.f151117a
                a14.k2 r5 = f14.C58901s.f168555a
                ao1.l$b$b r6 = new ao1.l$b$b
                r6.<init>(r14, r3, r2)
                r13.f623d = r1
                r13.f624e = r4
                java.lang.Object r14 = a14.C53895h.m60469g(r5, r6, r13)
                if (r14 != r0) goto L_0x00ce
                return r0
            L_0x00ce:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: ao1.C0166l.C0168b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0166l(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo156c3() {
        Intent intent = new Intent();
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, getActivity(), intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
        intent.putExtra("key_create_scene", 16);
        intent.putExtra("key_router_to_profile", false);
        ((C58684b) C86312j.m106911c(C58684b.class)).b30(getActivity(), intent, 20001);
    }

    /* renamed from: d3 */
    public final void mo157d3(View view, String str, boolean z) {
        Class cls = C61212e.class;
        ((C61212e) C86312j.m106911c(cls)).o30(view, str);
        ((C61212e) C86312j.m106911c(cls)).E60(view, new C0167a(this));
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(view, z ? 40 : 32, 25496);
    }

    /* renamed from: e3 */
    public final void mo158e3(String str) {
        C75590o4 a = C75590o4.m90740a();
        C49849ii0 ii02 = new C49849ii0();
        C49849ii0 ii03 = new C49849ii0();
        C8478d0 d0Var = new C8478d0();
        C8478d0 d0Var2 = new C8478d0();
        boolean z = true;
        d0Var2.f27483d = 1;
        int i = a.f222065b;
        ii02.f135356g = i;
        if (i == 0) {
            d0Var.f27483d = 1;
        }
        String str2 = a.f222070g;
        if (!(str2 == null || str2.length() == 0)) {
            String str3 = a.f222072i;
            if (!(str3 == null || str3.length() == 0)) {
                String str4 = a.f222071h;
                if (!(str4 == null || str4.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    d0Var2.f27483d = 0;
                    ii02.f135353d = a.f222070g;
                    ii02.f135354e = a.f222072i;
                    ii02.f135355f = a.f222071h;
                }
            }
        }
        C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C0168b(str, ii02, ii03, d0Var, d0Var2, this, (C15601d<? super C0168b>) null), 3, (Object) null);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105924i("Finder.PostCreateContactUIC", "requestCode: " + i + ", resultCode: " + i2);
        if (i == 20001 && i2 == 1) {
            ((PostMainUIC) C39818r.f106831a.mo62444c(getActivity()).mo75002a(PostMainUIC.class)).mo78411G3().performClick();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        TextView textView;
        super.onCreate(bundle);
        C66785b bVar = C66785b.f191882e;
        this.f621f = bVar.mo90662O5();
        this.f619d = new C12925w(getContext());
        int intExtra = getIntent().getIntExtra("key_finder_post_from", -1);
        boolean z = false;
        if ((this.f621f.length() == 0) && intExtra == 20) {
            C12925w wVar = this.f619d;
            if (wVar != null) {
                wVar.mo12470j(C0966R.C0971layout.d06);
                View view = wVar.f36927f;
                C87412m.m108593f(view, "rootView");
                mo157d3(view, "finder_create_account_half_view", false);
                wVar.f36933o = true;
                C49300el1 el12 = bVar.mo90673n0().mo62397b().f140458B;
                if (el12 == null || (str = el12.f132995d) == null) {
                    str = "";
                }
                Log.m105924i("Finder.PostCreateContactUIC", "wording: " + str);
                if ((str.length() > 0) && (textView = (TextView) wVar.f36927f.findViewById(C0966R.C0970id.ne_)) != null) {
                    textView.setText(str);
                }
                View view2 = wVar.f36927f;
                if (view2 != null) {
                    TextView textView2 = (TextView) view2.findViewById(C0966R.C0970id.ne9);
                    ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) view2.findViewById(C0966R.C0970id.ne6), C75592q0.m90789s());
                    if (f617g.length() == 0) {
                        String h = ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93559h(C75592q0.m90789s(), false);
                        C87412m.m108593f(h, "getService(IAvatarFeatur…ameFromUserInfo(), false)");
                        f617g = h;
                        if (((int) C86013q1.m106451l(h)) == 0) {
                            Log.m105924i("Finder.PostCreateContactUIC", "WX avatar file size is zero");
                            f617g = "";
                        }
                    }
                    String str2 = f618h;
                    if (str2.length() == 0) {
                        z = true;
                    }
                    if (z) {
                        str2 = C75592q0.m90783m();
                        C87412m.m108593f(str2, "getNicknameFromUserInfo()");
                    }
                    f618h = str2;
                    textView2.setText(str2);
                    Log.m105924i("Finder.PostCreateContactUIC", "lastAvatarPath: " + f617g + ", lastNickName: " + f618h);
                    C37521f.f99374d.getClass();
                    if (C37521f.f99184H1.mo60266n().intValue() == 1) {
                        C89059e i = new C9323j1(1).mo9225i();
                        AppCompatActivity activity = getActivity();
                        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        i.mo11397F((MMActivity) activity);
                        i.mo123420E(new C0151g(textView2, this));
                    }
                }
                View findViewById = wVar.f36927f.findViewById(C0966R.C0970id.ne7);
                findViewById.setOnClickListener(new C0155h(this));
                mo157d3(findViewById, "half_create_account_page_edit_button", true);
                TextView textView3 = (TextView) wVar.f36927f.findViewById(C0966R.C0970id.nff);
                C7868s3 s3Var = C7868s3.f26472a;
                Activity context = getContext();
                C87412m.m108593f(textView3, "tipsTv");
                s3Var.mo8979e(context, textView3, "Finder.PostCreateContactUIC");
                wVar.f36927f.findViewById(C0966R.C0970id.nfc).setOnClickListener(new C0160i(this));
                Button button = (Button) wVar.f36927f.findViewById(C0966R.C0970id.d7z);
                button.setOnClickListener(new C0162j(this));
                mo157d3(button, "half_create_account_page_create_post_button", true);
                View findViewById2 = wVar.f36927f.findViewById(C0966R.C0970id.ne8);
                findViewById2.setOnClickListener(new C0164k(this));
                mo157d3(findViewById2, "half_create_account_page_not_create_button", true);
                return;
            }
            C87412m.m108603p("bottomSheet");
            throw null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C12925w wVar = this.f619d;
        if (wVar != null) {
            wVar.f36933o = false;
            if (wVar != null) {
                wVar.mo5085n();
            } else {
                C87412m.m108603p("bottomSheet");
                throw null;
            }
        } else {
            C87412m.m108603p("bottomSheet");
            throw null;
        }
    }
}
