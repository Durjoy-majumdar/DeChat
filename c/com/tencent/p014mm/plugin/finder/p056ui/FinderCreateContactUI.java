package com.tencent.p014mm.plugin.finder.p056ui;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import bd1.C0263a;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderCreateAccountResultEvent;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.p136ui.widget.InputPanelFrameLayout;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import com.tencent.p014mm.vfs.C86013q1;
import d62.C75339i;
import di3.C86312j;
import dp1.C58408t0;
import dp1.C58412u0;
import dp1.C58417y0;
import dp1.C7435f2;
import eb0.C75592q0;
import er1.C58684b;
import er1.C58739j4;
import er1.C58784w3;
import er1.C75655v3;
import er1.C7868s3;
import f12.C7970a;
import f14.C58901s;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import ht1.C60184m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import je1.C46531q4;
import je1.C9323j1;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import l31.C61212e;
import nr3.C89059e;
import o31.C11345b;
import o31.C76986a;
import o40.C61926c;
import o40.C61937h;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import org.json.JSONObject;
import os1.C62153d;
import ot1.C11767a;
import p192l4.C10462b;
import p196ln.C10579k;
import p196ln.C76705f;
import p196ln.C76706g;
import p599lr.C61381b;
import p629ny.C76979h;
import pe3.C47465a;
import q40.C12040d;
import qo3.C77426q;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49783i10;
import te3.C49849ii0;
import te3.C49998jj0;
import te3.C50119ke1;
import te3.C50251le1;
import te3.C51401ti1;
import te3.C64742ty1;
import up1.C37521f;
import wc1.C15071e;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import ye1.C15975i;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;
import zp3.C23564m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderCreateContactUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lob0/n;", "Lcom/tencent/mm/ui/widget/a$d;", "Lln/k$a;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClickEditSex", "onTipsCheckBoxClick", "onClickEditDistrict", "<init>", "()V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderCreateContactUI */
public final class FinderCreateContactUI extends MMFinderUI implements C11385n, C74965a.C74969d, C10579k.C10580a {

    /* renamed from: U0 */
    public static final C3648a f16795U0 = new C3648a((C8480h) null);

    /* renamed from: V0 */
    public static String f16796V0 = "";

    /* renamed from: W0 */
    public static String f16797W0 = "";

    /* renamed from: X0 */
    public static String f16798X0 = "";

    /* renamed from: Y0 */
    public static int f16799Y0 = 0;

    /* renamed from: Z0 */
    public static int f16800Z0 = 0;

    /* renamed from: a1 */
    public static int f16801a1 = 0;

    /* renamed from: b1 */
    public static String f16802b1 = "";

    /* renamed from: c1 */
    public static String f16803c1 = "";

    /* renamed from: d1 */
    public static String f16804d1 = "";

    /* renamed from: e1 */
    public static boolean f16805e1 = true;

    /* renamed from: f1 */
    public static String f16806f1 = "";

    /* renamed from: g1 */
    public static final HashMap<String, String> f16807g1 = new HashMap<>();

    /* renamed from: h1 */
    public static final int f16808h1 = 1;

    /* renamed from: i1 */
    public static final int f16809i1 = 2;

    /* renamed from: A */
    public View f16810A;

    /* renamed from: B */
    public String f16811B;

    /* renamed from: C */
    public Button f16812C;

    /* renamed from: D */
    public View f16813D;

    /* renamed from: E */
    public View f16814E;

    /* renamed from: F */
    public View f16815F;

    /* renamed from: G */
    public InputPanelFrameLayout f16816G;

    /* renamed from: H */
    public View f16817H;

    /* renamed from: I */
    public TextView f16818I;

    /* renamed from: J */
    public TextView f16819J;

    /* renamed from: K */
    public View f16820K;

    /* renamed from: L */
    public View f16821L;

    /* renamed from: M */
    public CheckBox f16822M;

    /* renamed from: N */
    public TextView f16823N;

    /* renamed from: P */
    public final int f16824P = 1000;

    /* renamed from: Q */
    public final int f16825Q = 1001;

    /* renamed from: Q0 */
    public final C13601g f16826Q0;

    /* renamed from: R */
    public final int f16827R = 1002;

    /* renamed from: R0 */
    public boolean f16828R0;

    /* renamed from: S */
    public final int f16829S = 1003;

    /* renamed from: S0 */
    public boolean f16830S0;

    /* renamed from: T */
    public ProgressDialog f16831T;

    /* renamed from: T0 */
    public String f16832T0;

    /* renamed from: U */
    public int f16833U;

    /* renamed from: V */
    public int f16834V;

    /* renamed from: W */
    public int f16835W;

    /* renamed from: X */
    public C50119ke1 f16836X;

    /* renamed from: Y */
    public int f16837Y = 20;

    /* renamed from: Z */
    public boolean f16838Z = true;

    /* renamed from: o */
    public final String f16839o = "Finder.FinderCreateContactUI";

    /* renamed from: p */
    public View f16840p;

    /* renamed from: p0 */
    public final C13601g f16841p0 = C36568h.m40985a(new C3657i(this));

    /* renamed from: q */
    public ImageView f16842q;

    /* renamed from: r */
    public TextView f16843r;

    /* renamed from: s */
    public EditText f16844s;

    /* renamed from: t */
    public TextView f16845t;

    /* renamed from: u */
    public TextView f16846u;

    /* renamed from: v */
    public View f16847v;

    /* renamed from: w */
    public View f16848w;

    /* renamed from: x */
    public View f16849x;

    /* renamed from: x0 */
    public final C13601g f16850x0 = C36568h.m40985a(new C3649b(this));

    /* renamed from: y */
    public View f16851y;

    /* renamed from: y0 */
    public final C13601g f16852y0;

    /* renamed from: z */
    public View f16853z;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$a */
    public static final class C3648a {
        public C3648a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo4033a(String str, int i) {
            if (str == null) {
                return "";
            }
            return str + '_' + i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$b */
    public static final class C3649b extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderCreateContactUI f16854d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3649b(FinderCreateContactUI finderCreateContactUI) {
            super(0);
            this.f16854d = finderCreateContactUI;
        }

        public Object invoke() {
            return ((C15975i) ((C36570n) this.f16854d.f16841p0).getValue()).f42953d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$c */
    public static final class C3650c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ FinderCreateContactUI f16855a;

        public C3650c(FinderCreateContactUI finderCreateContactUI) {
            this.f16855a = finderCreateContactUI;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                String str = ((C51401ti1) cVar.f256796d).f142239d;
                boolean z = false;
                if (str != null) {
                    if (str.length() > 0) {
                        z = true;
                    }
                }
                if (z) {
                    EditText editText = this.f16855a.f16844s;
                    if (editText == null) {
                        C87412m.m108603p("nickEdt");
                        throw null;
                    } else if (Util.isNullOrNil((CharSequence) editText.getText())) {
                        EditText editText2 = this.f16855a.f16844s;
                        if (editText2 != null) {
                            editText2.append(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f16855a.getContext(), str));
                            C3648a aVar = FinderCreateContactUI.f16795U0;
                            C87412m.m108594g(str, "<set-?>");
                            FinderCreateContactUI.f16806f1 = str;
                        } else {
                            C87412m.m108603p("nickEdt");
                            throw null;
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$d */
    public static final class C3651d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f16856d;

        /* renamed from: e */
        public final /* synthetic */ FinderCreateContactUI f16857e;

        /* renamed from: f */
        public final /* synthetic */ int f16858f;

        public C3651d(boolean z, FinderCreateContactUI finderCreateContactUI, int i) {
            this.f16856d = z;
            this.f16857e = finderCreateContactUI;
            this.f16858f = i;
        }

        public final void run() {
            if (this.f16856d) {
                View view = this.f16857e.f16840p;
                if (view != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getLayoutParams());
                    FinderCreateContactUI finderCreateContactUI = this.f16857e;
                    layoutParams.height = finderCreateContactUI.f16835W - this.f16858f;
                    View view2 = finderCreateContactUI.f16840p;
                    if (view2 != null) {
                        view2.setLayoutParams(layoutParams);
                        View view3 = this.f16857e.f16813D;
                        if (view3 != null) {
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(view3.getLayoutParams());
                            layoutParams2.height = C76577a.m92157h(this.f16857e, C0966R.dimen.f3736cp);
                            View view4 = this.f16857e.f16813D;
                            if (view4 != null) {
                                view4.setLayoutParams(layoutParams2);
                                View view5 = this.f16857e.f16814E;
                                if (view5 != null) {
                                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(view5.getLayoutParams());
                                    layoutParams3.height = C76577a.m92157h(this.f16857e, C0966R.dimen.f3763dc);
                                    View view6 = this.f16857e.f16814E;
                                    if (view6 != null) {
                                        view6.setLayoutParams(layoutParams3);
                                        View view7 = this.f16857e.f16815F;
                                        if (view7 != null) {
                                            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(view7.getLayoutParams());
                                            layoutParams4.height = C76577a.m92157h(this.f16857e, C0966R.dimen.f3736cp);
                                            View view8 = this.f16857e.f16815F;
                                            if (view8 != null) {
                                                view8.setLayoutParams(layoutParams4);
                                            } else {
                                                C87412m.m108603p("editBottomSpace");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("editBottomSpace");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("editMiddleSpace");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("editMiddleSpace");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("editTopSpace");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("editTopSpace");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("scrollContainer");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("scrollContainer");
                    throw null;
                }
            } else {
                View view9 = this.f16857e.f16840p;
                if (view9 != null) {
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(view9.getLayoutParams());
                    layoutParams5.height = -1;
                    View view10 = this.f16857e.f16840p;
                    if (view10 != null) {
                        view10.setLayoutParams(layoutParams5);
                        View view11 = this.f16857e.f16813D;
                        if (view11 != null) {
                            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(view11.getLayoutParams());
                            layoutParams6.height = C76577a.m92157h(this.f16857e, C0966R.dimen.f3761db);
                            View view12 = this.f16857e.f16813D;
                            if (view12 != null) {
                                view12.setLayoutParams(layoutParams6);
                                View view13 = this.f16857e.f16814E;
                                if (view13 != null) {
                                    LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(view13.getLayoutParams());
                                    layoutParams7.height = -2;
                                    layoutParams7.weight = 1.0f;
                                    View view14 = this.f16857e.f16814E;
                                    if (view14 != null) {
                                        view14.setLayoutParams(layoutParams7);
                                        View view15 = this.f16857e.f16815F;
                                        if (view15 != null) {
                                            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(view15.getLayoutParams());
                                            layoutParams8.height = C76577a.m92157h(this.f16857e, C0966R.dimen.f3709c2);
                                            View view16 = this.f16857e.f16815F;
                                            if (view16 != null) {
                                                view16.setLayoutParams(layoutParams8);
                                            } else {
                                                C87412m.m108603p("editBottomSpace");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("editBottomSpace");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("editMiddleSpace");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("editMiddleSpace");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("editTopSpace");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("editTopSpace");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("scrollContainer");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("scrollContainer");
                    throw null;
                }
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$onResume$1", mo125469f = "FinderCreateContactUI.kt", mo125470l = {249}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$e */
    public static final class C3652e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f16859d;

        public C3652e(C15601d<? super C3652e> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C3652e(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C3652e((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f16859d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C66785b bVar = C66785b.f191882e;
                this.f16859d = 1;
                if (bVar.mo90679u0(15, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                ((Result) obj).m168123unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$requestCreateUser$1", mo125469f = "FinderCreateContactUI.kt", mo125470l = {872, 890}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$f */
    public static final class C3653f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f16860d;

        /* renamed from: e */
        public int f16861e;

        /* renamed from: f */
        public final /* synthetic */ String f16862f;

        /* renamed from: g */
        public final /* synthetic */ C49849ii0 f16863g;

        /* renamed from: h */
        public final /* synthetic */ C49849ii0 f16864h;

        /* renamed from: i */
        public final /* synthetic */ C8478d0 f16865i;

        /* renamed from: j */
        public final /* synthetic */ C8478d0 f16866j;

        /* renamed from: n */
        public final /* synthetic */ FinderCreateContactUI f16867n;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$requestCreateUser$1$3$1", mo125469f = "FinderCreateContactUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$f$a */
        public static final class C3654a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ FinderCreateContactUI f16868d;

            /* renamed from: e */
            public final /* synthetic */ Throwable f16869e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3654a(FinderCreateContactUI finderCreateContactUI, Throwable th, C15601d<? super C3654a> dVar) {
                super(2, dVar);
                this.f16868d = finderCreateContactUI;
                this.f16869e = th;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C3654a(this.f16868d, this.f16869e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C3654a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C50251le1 le12;
                ResultKt.throwOnFailure(obj);
                FinderCreateContactUI finderCreateContactUI = this.f16868d;
                Throwable th = this.f16869e;
                int i = ((C12040d) th).f35057e;
                int i2 = ((C12040d) th).f35058f;
                C49335eu3 eu32 = ((C12040d) th).f35060h;
                C13598b0 b0Var = null;
                C49998jj0 jj02 = eu32 instanceof C49998jj0 ? (C49998jj0) eu32 : null;
                ProgressDialog progressDialog = finderCreateContactUI.f16831T;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                if (i2 == -4008) {
                    C115669n.INSTANCE.mo175913w(1279, 38, 1);
                } else if (i2 == -4003) {
                    C115669n.INSTANCE.mo175913w(1279, 37, 1);
                }
                if (!(jj02 == null || (le12 = jj02.f136151e) == null)) {
                    String str = finderCreateContactUI.f16839o;
                    Log.m105924i(str, "verify info: " + C61937h.m72709h(le12));
                    if (le12.f137362j == 1) {
                        EditText editText = finderCreateContactUI.f16844s;
                        if (editText != null) {
                            editText.setTextColor(C76577a.m92153d(finderCreateContactUI, C0966R.color.a_0));
                        } else {
                            C87412m.m108603p("nickEdt");
                            throw null;
                        }
                    }
                    if (!Util.isNullOrNil(le12.f137357e)) {
                        String str2 = le12.f137357e;
                        if (str2 == null) {
                            str2 = "";
                        }
                        finderCreateContactUI.mo4027V7(str2, le12.f137364o, le12.f137363n);
                    } else {
                        String string = finderCreateContactUI.getString(C0966R.string.d5b);
                        C87412m.m108593f(string, "getString(R.string.finde…reate_contact_failed_tip)");
                        FinderCreateContactUI.m3834W7(finderCreateContactUI, string, (String) null, (String) null, 6, (Object) null);
                    }
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    String string2 = finderCreateContactUI.getString(C0966R.string.d5b);
                    C87412m.m108593f(string2, "getString(R.string.finde…reate_contact_failed_tip)");
                    FinderCreateContactUI.m3834W7(finderCreateContactUI, string2, (String) null, (String) null, 6, (Object) null);
                }
                finderCreateContactUI.setResult(FinderCreateContactUI.f16809i1);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3653f(String str, C49849ii0 ii02, C49849ii0 ii03, C8478d0 d0Var, C8478d0 d0Var2, FinderCreateContactUI finderCreateContactUI, C15601d<? super C3653f> dVar) {
            super(2, dVar);
            this.f16862f = str;
            this.f16863g = ii02;
            this.f16864h = ii03;
            this.f16865i = d0Var;
            this.f16866j = d0Var2;
            this.f16867n = finderCreateContactUI;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C3653f(this.f16862f, this.f16863g, this.f16864h, this.f16865i, this.f16866j, this.f16867n, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C3653f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C15601d dVar;
            FinderCreateContactUI finderCreateContactUI;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f16861e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C66785b bVar = C66785b.f191882e;
                C3648a aVar2 = FinderCreateContactUI.f16795U0;
                C0263a aVar3 = new C0263a("FinderCreateUser_" + System.nanoTime());
                String str = this.f16862f;
                C49849ii0 ii02 = this.f16863g;
                C49849ii0 ii03 = this.f16864h;
                C8478d0 d0Var = this.f16865i;
                C8478d0 d0Var2 = this.f16866j;
                FinderCreateContactUI finderCreateContactUI2 = this.f16867n;
                String str2 = FinderCreateContactUI.f16797W0;
                C87412m.m108594g(str2, "<set-?>");
                aVar3.f808b = str2;
                aVar3.f809c = "";
                if (str == null) {
                    str = "";
                }
                aVar3.f810d = str;
                aVar3.f811e = ii02;
                aVar3.f812f = ii03;
                aVar3.f813g = d0Var.f27483d;
                aVar3.f814h = d0Var2.f27483d;
                aVar3.f815i = (!FinderCreateContactUI.f16805e1 || finderCreateContactUI2.f16830S0) ? 2 : 1;
                aVar3.f816j = finderCreateContactUI2.f16830S0 ? 1 : 0;
                C49783i10 i102 = new C49783i10();
                if (finderCreateContactUI2.f16830S0) {
                    i102.f135020d = 4;
                }
                i102.f135022f = finderCreateContactUI2.f16832T0;
                aVar3.f817k = i102;
                this.f16861e = 1;
                obj2 = bVar.mo90659J2(aVar3, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).m168123unboximpl();
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FinderCreateContactUI finderCreateContactUI3 = this.f16867n;
            if (Result.m168121isSuccessimpl(obj2)) {
                C49998jj0 jj02 = (C49998jj0) obj2;
                ProgressDialog progressDialog = finderCreateContactUI3.f16831T;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                FinderContact finderContact = jj02.f136150d;
                if (finderContact != null) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.mo175913w(1585, 1, 1);
                    C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                    int i2 = FinderCreateContactUI.f16801a1;
                    int i3 = FinderCreateContactUI.f16800Z0;
                    int i4 = FinderCreateContactUI.f16799Y0;
                    int i5 = finderCreateContactUI3.f16833U;
                    boolean z = FinderCreateContactUI.f16805e1;
                    String str3 = FinderCreateContactUI.f16806f1;
                    EditText editText = finderCreateContactUI3.f16844s;
                    if (editText != null) {
                        boolean z2 = !C87412m.m108589b(str3, editText.getText().toString());
                        C13442s8.C13443a aVar4 = C13442s8.f38060Q0;
                        C13442s8 f = aVar4.mo12873f(finderCreateContactUI3);
                        y0Var.Dx0(0, 1, i2, true, i3, i4, i5, z, z2, f != null ? f.mo12861q3() : null);
                        C115669n nVar2 = nVar;
                        C13442s8.C13443a aVar5 = aVar4;
                        nVar2.mo175913w(1279, 32, 1);
                        Intent intent = new Intent();
                        if (finderCreateContactUI3.f16828R0) {
                            intent.putExtra("finder_username", finderContact.username);
                            intent.putExtra("KEY_FINDER_SELF_FLAG", true);
                            finderCreateContactUI = finderCreateContactUI3;
                            C13442s8.C13443a.m12791e(aVar5, finderCreateContactUI3, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                            ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(finderCreateContactUI, intent);
                        } else {
                            finderCreateContactUI = finderCreateContactUI3;
                        }
                        finderCreateContactUI.setResult(FinderCreateContactUI.f16808h1);
                        finderCreateContactUI.finish();
                        finderCreateContactUI.mo4024S7(1);
                        dVar = null;
                    } else {
                        C87412m.m108603p("nickEdt");
                        throw null;
                    }
                } else {
                    dVar = null;
                    finderCreateContactUI3.mo4024S7(3);
                }
                C61926c.m72668M(C3781d0.f17256d);
            } else {
                dVar = null;
            }
            FinderCreateContactUI finderCreateContactUI4 = this.f16867n;
            Throwable r5 = Result.m168117exceptionOrNullimpl(obj2);
            if (r5 != null && (r5 instanceof C12040d)) {
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C3654a aVar6 = new C3654a(finderCreateContactUI4, r5, dVar);
                this.f16860d = obj2;
                this.f16861e = 2;
                if (C53895h.m60469g(k2Var, aVar6, this) == aVar) {
                    return aVar;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$g */
    public static final class C3655g extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderCreateContactUI f16870d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3655g(FinderCreateContactUI finderCreateContactUI) {
            super(0);
            this.f16870d = finderCreateContactUI;
        }

        public Object invoke() {
            return ((C15975i) ((C36570n) this.f16870d.f16841p0).getValue()).f42954e;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$h */
    public static final class C3656h extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderCreateContactUI f16871d;

        /* renamed from: e */
        public final /* synthetic */ String f16872e;

        /* renamed from: f */
        public final /* synthetic */ String f16873f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3656h(FinderCreateContactUI finderCreateContactUI, String str, String str2) {
            super(1);
            this.f16871d = finderCreateContactUI;
            this.f16872e = str;
            this.f16873f = str2;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            Log.m105924i(this.f16871d.f16839o, "click " + str);
            C58784w3 w3Var = C58784w3.f168295a;
            String str2 = this.f16872e;
            String str3 = this.f16873f;
            FinderCreateContactUI finderCreateContactUI = this.f16871d;
            C58739j4 j4Var = C58739j4.f168176a;
            if (!(str2 == null || str3 == null)) {
                StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                aVar.f9531f = finderCreateContactUI;
                aVar.f9526a = str2;
                aVar.f9527b = str3;
                startAppBrandUIFromOuterEvent.publish();
            }
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            this.f16871d.getClass();
            int i = FinderCreateContactUI.f16801a1;
            int i2 = FinderCreateContactUI.f16800Z0;
            int i3 = FinderCreateContactUI.f16799Y0;
            FinderCreateContactUI finderCreateContactUI2 = this.f16871d;
            int i4 = finderCreateContactUI2.f16833U;
            boolean z = FinderCreateContactUI.f16805e1;
            String str4 = FinderCreateContactUI.f16806f1;
            EditText editText = finderCreateContactUI2.f16844s;
            C49712hj1 hj12 = null;
            if (editText != null) {
                boolean z2 = !C87412m.m108589b(str4, editText.getText().toString());
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f16871d);
                if (f != null) {
                    hj12 = f.mo12861q3();
                }
                y0Var.Dx0(0, 2, i, false, i2, i3, i4, z, z2, hj12);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("nickEdt");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$i */
    public static final class C3657i extends C87413o implements C32224a<C15975i> {

        /* renamed from: d */
        public final /* synthetic */ FinderCreateContactUI f16874d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3657i(FinderCreateContactUI finderCreateContactUI) {
            super(0);
            this.f16874d = finderCreateContactUI;
        }

        public Object invoke() {
            View findViewById = this.f16874d.findViewById(C0966R.C0970id.mc6);
            int i = C0966R.C0970id.f6149yo;
            WeImageView weImageView = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.f6149yo);
            if (weImageView != null) {
                i = C0966R.C0970id.bdl;
                WeImageView weImageView2 = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.bdl);
                if (weImageView2 != null) {
                    i = C0966R.C0970id.c7m;
                    LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.c7m);
                    if (linearLayout != null) {
                        i = C0966R.C0970id.cd9;
                        View a = C10462b.m10395a(findViewById, C0966R.C0970id.cd9);
                        if (a != null) {
                            i = C0966R.C0970id.cda;
                            View a2 = C10462b.m10395a(findViewById, C0966R.C0970id.cda);
                            if (a2 != null) {
                                i = C0966R.C0970id.cdb;
                                View a3 = C10462b.m10395a(findViewById, C0966R.C0970id.cdb);
                                if (a3 != null) {
                                    i = C0966R.C0970id.d79;
                                    ImageView imageView = (ImageView) C10462b.m10395a(findViewById, C0966R.C0970id.d79);
                                    if (imageView != null) {
                                        i = C0966R.C0970id.d7l;
                                        LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.d7l);
                                        if (linearLayout2 != null) {
                                            i = C0966R.C0970id.d7z;
                                            Button button = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.d7z);
                                            if (button != null) {
                                                FrameLayout frameLayout = (FrameLayout) findViewById;
                                                i = C0966R.C0970id.d84;
                                                TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.d84);
                                                if (textView != null) {
                                                    i = C0966R.C0970id.d89;
                                                    TextView textView2 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.d89);
                                                    if (textView2 != null) {
                                                        i = C0966R.C0970id.d_z;
                                                        LinearLayout linearLayout3 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.d_z);
                                                        if (linearLayout3 != null) {
                                                            i = C0966R.C0970id.e3u;
                                                            MMEditText mMEditText = (MMEditText) C10462b.m10395a(findViewById, C0966R.C0970id.e3u);
                                                            if (mMEditText != null) {
                                                                i = C0966R.C0970id.e3w;
                                                                TextView textView3 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.e3w);
                                                                if (textView3 != null) {
                                                                    i = C0966R.C0970id.e78;
                                                                    TextView textView4 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.e78);
                                                                    if (textView4 != null) {
                                                                        i = C0966R.C0970id.f6v;
                                                                        WeImageView weImageView3 = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.f6v);
                                                                        if (weImageView3 != null) {
                                                                            i = C0966R.C0970id.f7u;
                                                                            InputPanelFrameLayout inputPanelFrameLayout = (InputPanelFrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f7u);
                                                                            if (inputPanelFrameLayout != null) {
                                                                                i = C0966R.C0970id.g47;
                                                                                WeImageView weImageView4 = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.g47);
                                                                                if (weImageView4 != null) {
                                                                                    i = C0966R.C0970id.hfx;
                                                                                    LinearLayout linearLayout4 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.hfx);
                                                                                    if (linearLayout4 != null) {
                                                                                        i = C0966R.C0970id.j3w;
                                                                                        ScrollView scrollView = (ScrollView) C10462b.m10395a(findViewById, C0966R.C0970id.j3w);
                                                                                        if (scrollView != null) {
                                                                                            i = C0966R.C0970id.jf8;
                                                                                            WeImageView weImageView5 = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.jf8);
                                                                                            if (weImageView5 != null) {
                                                                                                i = C0966R.C0970id.jf9;
                                                                                                WeImageView weImageView6 = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.jf9);
                                                                                                if (weImageView6 != null) {
                                                                                                    i = C0966R.C0970id.jf_;
                                                                                                    LinearLayout linearLayout5 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.jf_);
                                                                                                    if (linearLayout5 != null) {
                                                                                                        i = C0966R.C0970id.kn6;
                                                                                                        CheckBox checkBox = (CheckBox) C10462b.m10395a(findViewById, C0966R.C0970id.kn6);
                                                                                                        if (checkBox != null) {
                                                                                                            i = C0966R.C0970id.kn7;
                                                                                                            LinearLayout linearLayout6 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.kn7);
                                                                                                            if (linearLayout6 != null) {
                                                                                                                i = C0966R.C0970id.knr;
                                                                                                                TextView textView5 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.knr);
                                                                                                                if (textView5 != null) {
                                                                                                                    i = C0966R.C0970id.krd;
                                                                                                                    TextView textView6 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.krd);
                                                                                                                    if (textView6 != null) {
                                                                                                                        i = C0966R.C0970id.lus;
                                                                                                                        LinearLayout linearLayout7 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.lus);
                                                                                                                        if (linearLayout7 != null) {
                                                                                                                            i = C0966R.C0970id.lut;
                                                                                                                            MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) C10462b.m10395a(findViewById, C0966R.C0970id.lut);
                                                                                                                            if (mMSwitchBtn != null) {
                                                                                                                                return new C15975i(frameLayout, weImageView, weImageView2, linearLayout, a, a2, a3, imageView, linearLayout2, button, frameLayout, textView, textView2, linearLayout3, mMEditText, textView3, textView4, weImageView3, inputPanelFrameLayout, weImageView4, linearLayout4, scrollView, weImageView5, weImageView6, linearLayout5, checkBox, linearLayout6, textView5, textView6, linearLayout7, mMSwitchBtn);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$j */
    public static final class C3658j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCreateContactUI f16875d;

        public C3658j(FinderCreateContactUI finderCreateContactUI) {
            this.f16875d = finderCreateContactUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$updateDistrict$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String string = this.f16875d.getString(C0966R.string.f360710eb0);
            C87412m.m108593f(string, "getString(R.string.finder_location_tip_gps)");
            C77426q qVar = new C77426q(((C60200t1) C86312j.m106911c(C60200t1.class)).mo76771JP());
            qVar.mo107595g(string);
            qVar.mo107601m(C0966R.string.lkg);
            qVar.mo107589a(true);
            qVar.mo107600l(C11767a.C11768a.f34454a);
            qVar.mo107603o();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$updateDistrict$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$k */
    public static final class C3659k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCreateContactUI f16876d;

        public C3659k(FinderCreateContactUI finderCreateContactUI) {
            this.f16876d = finderCreateContactUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$updateSex$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String string = this.f16876d.getString(C0966R.string.eox);
            C87412m.m108593f(string, "getString(R.string.finder_sex_tip)");
            C77426q qVar = new C77426q(((C60200t1) C86312j.m106911c(C60200t1.class)).mo76771JP());
            qVar.mo107595g(string);
            qVar.mo107601m(C0966R.string.lkg);
            qVar.mo107589a(true);
            qVar.mo107600l(C11767a.C11768a.f34454a);
            qVar.mo107603o();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$updateSex$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$l */
    public static final class C3660l extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderCreateContactUI f16877d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3660l(FinderCreateContactUI finderCreateContactUI) {
            super(0);
            this.f16877d = finderCreateContactUI;
        }

        public Object invoke() {
            return ((C15975i) ((C36570n) this.f16877d.f16841p0).getValue()).f42955f;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$m */
    public static final class C3661m extends C87413o implements C32224a<MMSwitchBtn> {

        /* renamed from: d */
        public final /* synthetic */ FinderCreateContactUI f16878d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3661m(FinderCreateContactUI finderCreateContactUI) {
            super(0);
            this.f16878d = finderCreateContactUI;
        }

        public Object invoke() {
            return ((C15975i) ((C36570n) this.f16878d.f16841p0).getValue()).f42956g;
        }
    }

    public FinderCreateContactUI() {
        C36568h.m40985a(new C3655g(this));
        this.f16852y0 = C36568h.m40985a(new C3660l(this));
        this.f16826Q0 = C36568h.m40985a(new C3661m(this));
        this.f16828R0 = true;
        this.f16832T0 = "";
    }

    /* renamed from: N7 */
    public static final void m3833N7(FinderCreateContactUI finderCreateContactUI, int i) {
        finderCreateContactUI.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("CreateScene", finderCreateContactUI.f16833U);
        C7435f2 f2Var = C7435f2.f25626a;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(finderCreateContactUI);
        f2Var.mo8577a(f != null ? f.mo12861q3() : null, "create_account", i, jSONObject);
    }

    /* renamed from: W7 */
    public static /* synthetic */ void m3834W7(FinderCreateContactUI finderCreateContactUI, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        finderCreateContactUI.mo4027V7(str, str2, str3);
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 167;
    }

    /* renamed from: O7 */
    public final void mo4020O7() {
        TextView textView = this.f16818I;
        if (textView != null) {
            textView.setText("");
            TextView textView2 = this.f16818I;
            if (textView2 != null) {
                textView2.setVisibility(8);
            } else {
                C87412m.m108603p("topErrorTip");
                throw null;
            }
        } else {
            C87412m.m108603p("topErrorTip");
            throw null;
        }
    }

    /* renamed from: P7 */
    public final boolean mo4021P7() {
        if (f16802b1.length() == 0) {
            if (f16803c1.length() == 0) {
                if (f16804d1.length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: Q7 */
    public final void mo4022Q7(String str) {
        C49849ii0 ii02 = new C49849ii0();
        C49849ii0 ii03 = new C49849ii0();
        C8478d0 d0Var = new C8478d0();
        C8478d0 d0Var2 = new C8478d0();
        String str2 = f16798X0;
        if (C87412m.m108589b(str2, "female")) {
            d0Var.f27483d = 0;
            ii02.f135356g = 2;
        } else if (C87412m.m108589b(str2, "male")) {
            d0Var.f27483d = 0;
            ii02.f135356g = 1;
        } else {
            d0Var.f27483d = 1;
            ii02.f135356g = 0;
        }
        if (C87412m.m108589b(f16802b1, "unshow")) {
            d0Var2.f27483d = 1;
        } else {
            d0Var2.f27483d = 0;
            ii02.f135353d = f16802b1;
            ii02.f135354e = f16803c1;
            ii02.f135355f = f16804d1;
        }
        C53895h.m60466d(getLifecycleAsyncScope(), (C66212f) null, (C53934p0) null, new C3653f(str, ii02, ii03, d0Var, d0Var2, this, (C15601d<? super C3653f>) null), 3, (Object) null);
    }

    /* renamed from: R7 */
    public final void mo4023R7() {
        int i = C66785b.f191882e.mo90673n0().mo62398d().f141679h;
        C50119ke1 ke12 = this.f16836X;
        if (ke12 != null) {
            i = ke12.f136695i;
        }
        this.f16837Y = i > 0 ? i : 20;
        String str = this.f16839o;
        Log.m105924i(str, "nicknameMaxLength ： " + i + ", " + this.f16837Y + ", prepareResp:" + this.f16836X);
    }

    /* renamed from: S7 */
    public final void mo4024S7(int i) {
        FinderCreateAccountResultEvent finderCreateAccountResultEvent = new FinderCreateAccountResultEvent();
        finderCreateAccountResultEvent.f9191d.f9192a = i;
        finderCreateAccountResultEvent.publish();
    }

    /* renamed from: T7 */
    public final void mo4025T7(String str) {
        Bitmap extractThumbNail;
        if (!Util.isNullOrNil(str) && (extractThumbNail = BitmapUtil.extractThumbNail(str, 256, 256, false)) != null) {
            ImageView imageView = this.f16842q;
            if (imageView != null) {
                imageView.setImageBitmap(extractThumbNail);
            } else {
                C87412m.m108603p("avatarView");
                throw null;
            }
        }
    }

    /* renamed from: U7 */
    public final void mo4026U7(String str, String str2, String str3) {
        String l = RegionCodeDecoder.m124563k().mo135576l(str);
        String m = RegionCodeDecoder.m124563k().mo135577m(str, str2);
        String f = RegionCodeDecoder.m124563k().mo135571f(str, str2, str3);
        if (!Util.isNullOrNil(f)) {
            TextView textView = this.f16846u;
            if (textView != null) {
                textView.setText(((C75339i) C86312j.m106911c(C75339i.class)).K90(m) + ' ' + f);
                return;
            }
            C87412m.m108603p("districtTV");
            throw null;
        } else if (!Util.isNullOrNil(m)) {
            TextView textView2 = this.f16846u;
            if (textView2 != null) {
                textView2.setText(l + ' ' + m);
                return;
            }
            C87412m.m108603p("districtTV");
            throw null;
        } else if (!Util.isNullOrNil(l)) {
            TextView textView3 = this.f16846u;
            if (textView3 != null) {
                textView3.setText(l);
            } else {
                C87412m.m108603p("districtTV");
                throw null;
            }
        } else if (C87412m.m108589b(str, "unshow")) {
            TextView textView4 = this.f16846u;
            if (textView4 != null) {
                textView4.setText(getString(C0966R.string.eov));
            } else {
                C87412m.m108603p("districtTV");
                throw null;
            }
        }
    }

    /* renamed from: V7 */
    public final void mo4027V7(String str, String str2, String str3) {
        String str4 = str;
        String str5 = this.f16839o;
        Log.m105924i(str5, "showError " + str4);
        Matcher matcher = C60184m.f171716a.matcher(str4);
        if (matcher.find()) {
            String group = matcher.group(1);
            StringBuilder sb = new StringBuilder();
            if (matcher.start(0) > 0) {
                String substring = str4.substring(0, matcher.start(0));
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring);
            }
            sb.append(group);
            if (matcher.end(0) < str.length()) {
                String substring2 = str4.substring(matcher.end(0), str.length());
                C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring2);
            }
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "sb.toString()");
            int start = matcher.start(0);
            SpannableString spannableString = new SpannableString(sb4);
            spannableString.setSpan(new C4059g5(group, getContext().getResources().getColor(C0966R.color.f2958ae), getContext().getResources().getColor(C0966R.color.Link_Alpha_0_6), false, false, new C3656h(this, str2, str3), 16, (C8480h) null), start, group.length() + start, 17);
            TextView textView = this.f16818I;
            if (textView != null) {
                textView.setText(spannableString);
                TextView textView2 = this.f16818I;
                if (textView2 != null) {
                    textView2.setOnTouchListener(new C75655v3(spannableString, textView2));
                } else {
                    C87412m.m108603p("topErrorTip");
                    throw null;
                }
            } else {
                C87412m.m108603p("topErrorTip");
                throw null;
            }
        } else {
            TextView textView3 = this.f16818I;
            if (textView3 != null) {
                textView3.setText(str4);
            } else {
                C87412m.m108603p("topErrorTip");
                throw null;
            }
        }
        TextView textView4 = this.f16818I;
        if (textView4 != null) {
            textView4.setVisibility(0);
        } else {
            C87412m.m108603p("topErrorTip");
            throw null;
        }
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        if (C87412m.m108589b(str, C75592q0.m90789s())) {
            String str2 = this.f16839o;
            Log.m105924i(str2, "[notifyChanged] user:" + str + ",avatarPath:" + this.f16811B);
            boolean z = false;
            String h = ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93559h(C75592q0.m90789s(), false);
            int l = (int) C86013q1.m106451l(h);
            String str3 = this.f16811B;
            if (str3 == null || str3.length() == 0) {
                z = true;
            }
            if (z && l > 0) {
                String str4 = this.f16839o;
                Log.m105924i(str4, "[notifyChanged] filesize:" + l);
                this.f16811B = h;
            }
        }
    }

    /* renamed from: X7 */
    public final void mo4028X7(boolean z) {
        C13598b0 b0Var = null;
        if (z) {
            C64742ty1 ty12 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).f176721e;
            if (ty12 != null) {
                String str = ty12.f185694d;
                C87412m.m108593f(str, "it.Country");
                f16802b1 = str;
                String str2 = ty12.f185695e;
                C87412m.m108593f(str2, "it.Province");
                f16803c1 = str2;
                String str3 = ty12.f185696f;
                C87412m.m108593f(str3, "it.City");
                f16804d1 = str3;
                C87412m.m108593f(ty12.f185694d, "it.Country");
                C87412m.m108593f(ty12.f185695e, "it.Province");
                C87412m.m108593f(ty12.f185696f, "it.City");
                View view = this.f16847v;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "updateDistrict", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "updateDistrict", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view3 = this.f16848w;
                    if (view3 != null) {
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(0);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "updateDistrict", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "updateDistrict", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view5 = this.f16849x;
                        if (view5 != null) {
                            C9556a aVar3 = new C9556a();
                            aVar3.mo10233c(8);
                            View view6 = view5;
                            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "updateDistrict", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "updateDistrict", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            View view7 = this.f16849x;
                            if (view7 != null) {
                                view7.setOnClickListener(new C3658j(this));
                                f16800Z0 = 1;
                                mo4026U7(f16802b1, f16803c1, f16804d1);
                                b0Var = C13598b0.f38549a;
                            } else {
                                C87412m.m108603p("locationInfoIcon");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("locationInfoIcon");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("locationArrowIcon");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("locationIcon");
                    throw null;
                }
            }
            if (b0Var == null) {
                f16802b1 = "";
                f16803c1 = "";
                f16804d1 = "";
                f16800Z0 = 3;
            }
        } else {
            View view8 = this.f16847v;
            if (view8 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(8);
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "updateDistrict", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "updateDistrict", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo4026U7(f16802b1, f16803c1, f16804d1);
            } else {
                C87412m.m108603p("locationIcon");
                throw null;
            }
        }
        String str4 = this.f16839o;
        Log.m105924i(str4, "updateDistrict " + f16802b1 + ' ' + f16803c1 + ' ' + f16804d1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015c  */
    /* renamed from: Y7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4029Y7() {
        /*
            r22 = this;
            r0 = r22
            java.lang.String r1 = f16798X0
            int r2 = r1.hashCode()
            r3 = -1278174388(0xffffffffb3d09b4c, float:-9.714003E-8)
            r4 = 2131101252(0x7f060644, float:1.7814908E38)
            java.lang.String r5 = "sexTV"
            r6 = 0
            if (r2 == r3) goto L_0x0076
            r3 = -840239850(0xffffffffcdeaf516, float:-4.92741312E8)
            if (r2 == r3) goto L_0x004a
            r3 = 3343885(0x33060d, float:4.685781E-39)
            if (r2 == r3) goto L_0x001f
            goto L_0x007e
        L_0x001f:
            java.lang.String r2 = "male"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007e
            android.widget.TextView r1 = r0.f16845t
            if (r1 == 0) goto L_0x0046
            r2 = 2131836499(0x7f113e53, float:1.9306167E38)
            java.lang.String r2 = r0.getString(r2)
            r1.setText(r2)
            android.widget.TextView r1 = r0.f16845t
            if (r1 == 0) goto L_0x0042
            int r2 = kg3.C76577a.m92153d(r0, r4)
            r1.setTextColor(r2)
            goto L_0x00bc
        L_0x0042:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x0046:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x004a:
            java.lang.String r2 = "unshow"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0054
            goto L_0x007e
        L_0x0054:
            android.widget.TextView r1 = r0.f16845t
            if (r1 == 0) goto L_0x0072
            r2 = 2131829869(0x7f11246d, float:1.929272E38)
            java.lang.String r2 = r0.getString(r2)
            r1.setText(r2)
            android.widget.TextView r1 = r0.f16845t
            if (r1 == 0) goto L_0x006e
            int r2 = kg3.C76577a.m92153d(r0, r4)
            r1.setTextColor(r2)
            goto L_0x00bc
        L_0x006e:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x0072:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x0076:
            java.lang.String r2 = "female"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00a3
        L_0x007e:
            android.widget.TextView r1 = r0.f16845t
            if (r1 == 0) goto L_0x009f
            r2 = 2131829867(0x7f11246b, float:1.9292715E38)
            java.lang.String r2 = r0.getString(r2)
            r1.setText(r2)
            android.widget.TextView r1 = r0.f16845t
            if (r1 == 0) goto L_0x009b
            r2 = 2131100909(0x7f0604ed, float:1.7814213E38)
            int r2 = kg3.C76577a.m92153d(r0, r2)
            r1.setTextColor(r2)
            goto L_0x00bc
        L_0x009b:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x009f:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x00a3:
            android.widget.TextView r1 = r0.f16845t
            if (r1 == 0) goto L_0x01bb
            r2 = 2131836498(0x7f113e52, float:1.9306164E38)
            java.lang.String r2 = r0.getString(r2)
            r1.setText(r2)
            android.widget.TextView r1 = r0.f16845t
            if (r1 == 0) goto L_0x01b7
            int r2 = kg3.C76577a.m92153d(r0, r4)
            r1.setTextColor(r2)
        L_0x00bc:
            boolean r1 = r0.f16838Z
            java.lang.String r2 = "sexInfoIcon"
            java.lang.String r3 = "sexArrowIcon"
            r4 = 8
            r5 = 0
            if (r1 == 0) goto L_0x015c
            android.view.View r1 = r0.f16851y
            if (r1 == 0) goto L_0x0158
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r3.mo10233c(r7)
            java.lang.Object[] r8 = r3.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI"
            java.lang.String r10 = "updateSex"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r1
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI"
            java.lang.String r9 = "updateSex"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            android.view.View r1 = r0.f16853z
            if (r1 == 0) goto L_0x0154
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r3)
            java.lang.Object[] r15 = r2.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI"
            java.lang.String r17 = "updateSex"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r1
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI"
            java.lang.String r16 = "updateSex"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x01ae
        L_0x0154:
            gy3.C87412m.m108603p(r2)
            throw r6
        L_0x0158:
            gy3.C87412m.m108603p(r3)
            throw r6
        L_0x015c:
            android.view.View r1 = r0.f16851y
            if (r1 == 0) goto L_0x01b3
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r4)
            java.lang.Object[] r8 = r3.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI"
            java.lang.String r10 = "updateSex"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r1
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI"
            java.lang.String r9 = "updateSex"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            android.view.View r1 = r0.f16853z
            if (r1 == 0) goto L_0x01af
            com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$k r2 = new com.tencent.mm.plugin.finder.ui.FinderCreateContactUI$k
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x01ae:
            return
        L_0x01af:
            gy3.C87412m.m108603p(r2)
            throw r6
        L_0x01b3:
            gy3.C87412m.m108603p(r3)
            throw r6
        L_0x01b7:
            gy3.C87412m.m108603p(r5)
            throw r6
        L_0x01bb:
            gy3.C87412m.m108603p(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderCreateContactUI.mo4029Y7():void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a_6;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        View view = this.f16840p;
        if (view != null) {
            view.post(new C3651d(z, this, i));
        } else {
            C87412m.m108603p("scrollContainer");
            throw null;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == this.f16824P) {
            if (intent != null && i2 == -1) {
                setIntent(new Intent());
                getIntent().putExtra("key_source_img_path", C7013o.m7260b(getContext(), intent, C7970a.m8127a()));
                Intent intent2 = getIntent();
                int i3 = this.f16825Q;
                ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
                ((C61381b) C86312j.m106911c(C61381b.class)).Yp0().mo88200k(this, intent2, i3);
            }
        } else if (i != this.f16825Q) {
            String str = "";
            if (i == this.f16827R) {
                if (intent != null && i2 == -1) {
                    String stringExtra = intent.getStringExtra("key_output_sex");
                    if (stringExtra != null) {
                        str = stringExtra;
                    }
                    f16798X0 = str;
                    mo4029Y7();
                    f16799Y0 = 2;
                }
            } else if (i == this.f16829S && intent != null && i2 == -1) {
                String stringExtra2 = intent.getStringExtra("Country");
                if (stringExtra2 == null) {
                    stringExtra2 = str;
                }
                f16802b1 = stringExtra2;
                String stringExtra3 = intent.getStringExtra("Contact_Province");
                if (stringExtra3 == null) {
                    stringExtra3 = str;
                }
                f16803c1 = stringExtra3;
                String stringExtra4 = intent.getStringExtra("Contact_City");
                if (stringExtra4 != null) {
                    str = stringExtra4;
                }
                f16804d1 = str;
                mo4028X7(false);
                f16800Z0 = 2;
            }
        } else if (intent != null && i2 == -1) {
            String stringExtra5 = intent.getStringExtra("key_result_img_path");
            this.f16811B = stringExtra5;
            if (stringExtra5 != null) {
                f16796V0 = stringExtra5;
            }
            Log.m105925i(this.f16839o, "avatar file length %d KB", Long.valueOf(C86013q1.m106451l(stringExtra5) / ((long) 1024)));
            f16801a1 = 2;
            mo4025T7(this.f16811B);
        }
        mo4020O7();
    }

    public void onBackPressed() {
        setResult(f16809i1);
        mo4024S7(2);
        super.onBackPressed();
        FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.exitPageId = 5;
            FinderFeedReportObject finderFeedReportObject2 = C58408t0.f167337b;
            if (finderFeedReportObject2 != null) {
                C61926c.m72661F("Finder.FinderPostReportLogic", new C58412u0(finderFeedReportObject2, false));
            }
        }
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        int i = f16801a1;
        int i2 = f16800Z0;
        int i3 = f16799Y0;
        int i4 = this.f16833U;
        boolean z = f16805e1;
        String str = f16806f1;
        EditText editText = this.f16844s;
        C49712hj1 hj12 = null;
        if (editText != null) {
            boolean z2 = !C87412m.m108589b(str, editText.getText().toString());
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this);
            if (f != null) {
                hj12 = f.mo12861q3();
            }
            y0Var.Dx0(0, 0, i, false, i2, i3, i4, z, z2, hj12);
            return;
        }
        C87412m.m108603p("nickEdt");
        throw null;
    }

    public final void onClickEditDistrict(View view) {
        EditText editText = this.f16844s;
        if (editText != null) {
            editText.clearFocus();
            hideVKB();
            mo1072i0(false, 0);
            Intent intent = new Intent();
            intent.putExtra("GetAddress", true);
            intent.putExtra("ShowSelectedLocation", true);
            intent.putExtra("SetSelectLocation", true);
            intent.putExtra("SelectedCountryCode", f16802b1);
            intent.putExtra("SelectedProvinceCode", f16803c1);
            intent.putExtra("SelectedCityCode", f16804d1);
            intent.putExtra("NeedUnshowItem", true);
            C88144b.m109802t(getContext(), ".ui.tools.MultiStageCitySelectUI", intent, this.f16829S);
            return;
        }
        C87412m.m108603p("nickEdt");
        throw null;
    }

    public final void onClickEditSex(View view) {
        EditText editText = this.f16844s;
        if (editText != null) {
            editText.clearFocus();
            hideVKB();
            mo1072i0(false, 0);
            if (this.f16838Z) {
                Intent intent = new Intent();
                intent.putExtra("key_input_sex", f16798X0);
                int i = this.f16827R;
                ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
                intent.setClass(this, FinderSelectSexUI.class);
                startActivityForResult(intent, i);
                return;
            }
            return;
        }
        C87412m.m108603p("nickEdt");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16830S0 = getIntent().getBooleanExtra("KEY_OTHER_USER", false);
        this.f16833U = getIntent().getIntExtra("key_create_scene", 0);
        String stringExtra = getIntent().getStringExtra("KEY_WX_USERNAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f16832T0 = stringExtra;
        Class cls = C76706g.class;
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        getController().mo177059O0(this, getResources().getColor(C0966R.color.al6));
        View findViewById = findViewById(C0966R.C0970id.j3w);
        C87412m.m108593f(findViewById, "findViewById(R.id.scroll_container)");
        this.f16840p = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.d79);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder_avatar_iv)");
        this.f16842q = (ImageView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.d84);
        C87412m.m108593f(findViewById3, "findViewById(R.id.finder_create_title)");
        this.f16843r = (TextView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.e3u);
        C87412m.m108593f(findViewById4, "findViewById(R.id.finder_nick_tv)");
        this.f16844s = (EditText) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.e78);
        C87412m.m108593f(findViewById5, "findViewById(R.id.finder_sex_tv)");
        this.f16845t = (TextView) findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.d89);
        C87412m.m108593f(findViewById6, "findViewById(R.id.finder_district_tv)");
        this.f16846u = (TextView) findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.c7m);
        C87412m.m108593f(findViewById7, "findViewById(R.id.district_layout)");
        this.f16810A = findViewById7;
        View findViewById8 = findViewById(C0966R.C0970id.g47);
        C87412m.m108593f(findViewById8, "findViewById(R.id.location_icon)");
        this.f16847v = findViewById8;
        View findViewById9 = findViewById(C0966R.C0970id.f6149yo);
        C87412m.m108593f(findViewById9, "findViewById(R.id.arrow_icon)");
        this.f16848w = findViewById9;
        View findViewById10 = findViewById(C0966R.C0970id.f6v);
        C87412m.m108593f(findViewById10, "findViewById(R.id.info_icon)");
        this.f16849x = findViewById10;
        View findViewById11 = findViewById(C0966R.C0970id.jf8);
        C87412m.m108593f(findViewById11, "findViewById(R.id.sex_arrow_icon)");
        this.f16851y = findViewById11;
        View findViewById12 = findViewById(C0966R.C0970id.jf9);
        C87412m.m108593f(findViewById12, "findViewById(R.id.sex_info_icon)");
        this.f16853z = findViewById12;
        View findViewById13 = findViewById(C0966R.C0970id.d7z);
        C87412m.m108593f(findViewById13, "findViewById(R.id.finder_contact_create_btn)");
        this.f16812C = (Button) findViewById13;
        View findViewById14 = findViewById(C0966R.C0970id.f7u);
        C87412m.m108593f(findViewById14, "findViewById(R.id.input_panel)");
        this.f16816G = (InputPanelFrameLayout) findViewById14;
        View findViewById15 = findViewById(C0966R.C0970id.d_z);
        C87412m.m108593f(findViewById15, "findViewById(R.id.finder_input_container)");
        this.f16817H = findViewById15;
        View findViewById16 = findViewById(C0966R.C0970id.cdb);
        C87412m.m108593f(findViewById16, "findViewById(R.id.edt_top_space)");
        this.f16813D = findViewById16;
        View findViewById17 = findViewById(C0966R.C0970id.cda);
        C87412m.m108593f(findViewById17, "findViewById(R.id.edt_middle_space)");
        this.f16814E = findViewById17;
        View findViewById18 = findViewById(C0966R.C0970id.cd9);
        C87412m.m108593f(findViewById18, "findViewById(R.id.edt_bottom_space)");
        this.f16815F = findViewById18;
        View findViewById19 = findViewById(C0966R.C0970id.krd);
        C87412m.m108593f(findViewById19, "findViewById(R.id.top_error_tip)");
        this.f16818I = (TextView) findViewById19;
        View findViewById20 = findViewById(C0966R.C0970id.e3w);
        C87412m.m108593f(findViewById20, "findViewById(R.id.finder_nickname_edit_limit)");
        this.f16819J = (TextView) findViewById20;
        View findViewById21 = findViewById(C0966R.C0970id.bdl);
        C87412m.m108593f(findViewById21, "findViewById(R.id.clear_text_btn)");
        this.f16820K = findViewById21;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById21, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById21.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById21, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById22 = findViewById(C0966R.C0970id.kn7);
        C87412m.m108593f(findViewById22, "findViewById(R.id.tips_container)");
        this.f16821L = findViewById22;
        View findViewById23 = findViewById(C0966R.C0970id.kn6);
        C87412m.m108593f(findViewById23, "findViewById(R.id.tips_check_cb)");
        this.f16822M = (CheckBox) findViewById23;
        View findViewById24 = findViewById(C0966R.C0970id.knr);
        C87412m.m108593f(findViewById24, "findViewById(R.id.tips_warning_tv)");
        this.f16823N = (TextView) findViewById24;
        C37521f.f99374d.getClass();
        if (C37521f.f99175G1.mo60266n().intValue() != 1 || this.f16830S0) {
            ((LinearLayout) ((C36570n) this.f16852y0).getValue()).setVisibility(8);
        } else {
            ((LinearLayout) ((C36570n) this.f16852y0).getValue()).setVisibility(0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WXPROFILE_ENTRY_EDU_INT_SYNC, 1);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WXPROFILE_ENTRY_EDU2_INT_SYNC, 1);
            Log.m105924i(this.f16839o, "showWxProfileTips set USERINFO_FINDER_WXPROFILE_ENTRY_EDU_INT_SYNC 1");
        }
        ((LinearLayout) ((C36570n) this.f16850x0).getValue()).setOnClickListener(new C3790f0(this));
        if (this.f16833U == 16) {
            Button button = this.f16812C;
            if (button != null) {
                button.setText(getResources().getText(C0966R.string.d5c));
            } else {
                C87412m.m108603p("createBtn");
                throw null;
            }
        }
        Button button2 = this.f16812C;
        if (button2 != null) {
            C23564m.m28138h(button2, new C3828g0(this));
            Button button3 = this.f16812C;
            if (button3 != null) {
                button3.setOnClickListener(new C3832h0(this));
                C3864n0 n0Var = new C3864n0(this);
                EditText editText = this.f16844s;
                if (editText != null) {
                    editText.addTextChangedListener(n0Var);
                    EditText editText2 = this.f16844s;
                    if (editText2 != null) {
                        editText2.setOnEditorActionListener(new C3837i0(this));
                        View view = this.f16820K;
                        if (view != null) {
                            view.setOnClickListener(new C3842j0(this));
                            EditText editText3 = this.f16844s;
                            if (editText3 != null) {
                                editText3.setOnFocusChangeListener(new C3847k0(this));
                                setBackBtn(new C3854l0(this));
                                InputPanelFrameLayout inputPanelFrameLayout = this.f16816G;
                                if (inputPanelFrameLayout != null) {
                                    inputPanelFrameLayout.setExternalListener(this);
                                    View view2 = this.f16840p;
                                    if (view2 != null) {
                                        view2.post(new C3859m0(this));
                                        String str = f16797W0;
                                        if (str != null) {
                                            EditText editText4 = this.f16844s;
                                            if (editText4 != null) {
                                                editText4.setText(str);
                                            } else {
                                                C87412m.m108603p("nickEdt");
                                                throw null;
                                            }
                                        }
                                        if (f16796V0.length() == 0) {
                                            C76705f fVar = (C76705f) C86312j.m106911c(C76705f.class);
                                            ImageView imageView = this.f16842q;
                                            if (imageView != null) {
                                                fVar.mo106849z(imageView, C75592q0.m90789s());
                                                String h = ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93559h(C75592q0.m90789s(), false);
                                                this.f16811B = h;
                                                if (((int) C86013q1.m106451l(h)) == 0) {
                                                    Log.m105924i(this.f16839o, "WX avatar file size is zero");
                                                    ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93557b(this);
                                                    this.f16811B = "";
                                                }
                                            } else {
                                                C87412m.m108603p("avatarView");
                                                throw null;
                                            }
                                        } else {
                                            String str2 = f16796V0;
                                            this.f16811B = str2;
                                            mo4025T7(str2);
                                        }
                                        if (C87412m.m108589b(this.f16811B, ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93559h(C75592q0.m90789s(), false))) {
                                            f16801a1 = 1;
                                        } else {
                                            String str3 = this.f16811B;
                                            if (str3 == null || str3.length() == 0) {
                                                f16801a1 = 3;
                                            } else {
                                                f16801a1 = 2;
                                            }
                                        }
                                        if (f16798X0.length() == 0) {
                                            int i = C86709a0.m107535s().mo121142i().mo119688i(12290, 0);
                                            if (i == 0) {
                                                f16798X0 = "";
                                                f16799Y0 = 3;
                                            } else if (i == 1) {
                                                f16798X0 = "male";
                                                f16799Y0 = 1;
                                            } else if (i == 2) {
                                                f16798X0 = "female";
                                                f16799Y0 = 1;
                                            }
                                        } else {
                                            String str4 = this.f16839o;
                                            Log.m105924i(str4, "lastSelectSex = " + f16798X0);
                                        }
                                        ((MMSwitchBtn) ((C36570n) this.f16826Q0).getValue()).setCheck(f16805e1);
                                        ((MMSwitchBtn) ((C36570n) this.f16826Q0).getValue()).setSwitchListener(C3785e0.f17260a);
                                        String str5 = this.f16839o;
                                        Log.m105924i(str5, "lastWxProfileChecked = " + f16805e1);
                                        C7868s3 s3Var = C7868s3.f26472a;
                                        TextView textView = this.f16823N;
                                        if (textView != null) {
                                            s3Var.mo8979e(this, textView, this.f16839o);
                                            mo4029Y7();
                                            String str6 = this.f16839o;
                                            Log.m105924i(str6, "isLastSelectDistrictEmpty = " + mo4021P7());
                                            mo4028X7(mo4021P7());
                                            C86709a0.m107524d().mo123455a(3759, this);
                                            C86709a0.m107524d().mo123455a(7289, this);
                                            this.f16834V = getIntent().getIntExtra("key_mv_status", 0);
                                            this.f16828R0 = getIntent().getBooleanExtra("key_router_to_profile", true);
                                            getIntent().getIntExtra("KEY_GO_TO_AFTER_CREATE_SUCCESS", 0);
                                            if (getIntent().hasExtra("key_prepare_resp")) {
                                                this.f16836X = new C50119ke1();
                                                byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_prepare_resp");
                                                if (byteArrayExtra != null) {
                                                    try {
                                                        C50119ke1 ke12 = this.f16836X;
                                                        if (ke12 != null) {
                                                            ke12.parseFrom(byteArrayExtra);
                                                        }
                                                    } catch (Exception unused) {
                                                        C13598b0 b0Var = C13598b0.f38549a;
                                                    }
                                                }
                                            }
                                            mo4023R7();
                                            C115669n.INSTANCE.mo175913w(1279, 30, 1);
                                            C37521f.f99374d.getClass();
                                            if (C37521f.f99184H1.mo60266n().intValue() == 1) {
                                                C89059e i2 = new C9323j1(0).mo9225i();
                                                i2.mo11397F(this);
                                                i2.mo123420E(new C3650c(this));
                                            }
                                            int i3 = this.f16834V;
                                            if (i3 == 1) {
                                                TextView textView2 = this.f16843r;
                                                if (textView2 != null) {
                                                    textView2.setText(getResources().getText(C0966R.string.d5n));
                                                    Button button4 = this.f16812C;
                                                    if (button4 != null) {
                                                        button4.setText(getResources().getText(C0966R.string.d5d));
                                                    } else {
                                                        C87412m.m108603p("createBtn");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("titleTv");
                                                    throw null;
                                                }
                                            } else if (i3 == 2) {
                                                TextView textView3 = this.f16843r;
                                                if (textView3 != null) {
                                                    textView3.setText(getResources().getText(C0966R.string.d5n));
                                                    Button button5 = this.f16812C;
                                                    if (button5 != null) {
                                                        button5.setText(getResources().getText(C0966R.string.d5c));
                                                    } else {
                                                        C87412m.m108603p("createBtn");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("titleTv");
                                                    throw null;
                                                }
                                            }
                                            ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderCreateContactUI).mo86179qs(this, C76986a.Finder);
                                            return;
                                        }
                                        C87412m.m108603p("tipsWarningTV");
                                        throw null;
                                    }
                                    C87412m.m108603p("scrollContainer");
                                    throw null;
                                }
                                C87412m.m108603p("inputPanel");
                                throw null;
                            }
                            C87412m.m108603p("nickEdt");
                            throw null;
                        }
                        C87412m.m108603p("clearNameBtn");
                        throw null;
                    }
                    C87412m.m108603p("nickEdt");
                    throw null;
                }
                C87412m.m108603p("nickEdt");
                throw null;
            }
            C87412m.m108603p("createBtn");
            throw null;
        }
        C87412m.m108603p("createBtn");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(3759, this);
        C86709a0.m107524d().mo123470p(7289, this);
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93567p(this);
    }

    public void onResume() {
        super.onResume();
        if (this.f16836X == null) {
            C53895h.m60466d(getLifecycleAsyncScope(), (C66212f) null, (C53934p0) null, new C3652e((C15601d<? super C3652e>) null), 3, (Object) null);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = false;
        Log.m105925i(this.f16839o, "errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (!(yVar instanceof C46531q4)) {
            if (yVar != null && yVar.getType() == 7289) {
                z = true;
            }
            if (z) {
                C114799u reqResp = yVar.getReqResp();
                C50119ke1 ke12 = null;
                C47350c cVar = reqResp instanceof C47350c ? (C47350c) reqResp : null;
                C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
                if (aVar instanceof C50119ke1) {
                    ke12 = (C50119ke1) aVar;
                }
                this.f16836X = ke12;
                mo4023R7();
            }
        } else if (i == 0 && i2 == 0) {
            C46531q4 q4Var = (C46531q4) yVar;
            String str2 = q4Var.f125365q;
            String str3 = q4Var.f125360i;
            int i3 = q4Var.f125361j;
            if (str2 != null) {
                String a = f16795U0.mo4033a(str3, i3);
                if (a.length() > 0) {
                    z = true;
                }
                if (z) {
                    f16807g1.put(a, str2);
                }
            }
            mo4022Q7(str2);
        } else {
            ProgressDialog progressDialog = this.f16831T;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            C115669n.INSTANCE.mo175913w(1279, 33, 1);
            String string = getString(C0966R.string.d5b);
            C87412m.m108593f(string, "getString(R.string.finde…reate_contact_failed_tip)");
            m3834W7(this, string, (String) null, (String) null, 6, (Object) null);
        }
    }

    public final void onTipsCheckBoxClick(View view) {
        CheckBox checkBox = this.f16822M;
        if (checkBox == null) {
            C87412m.m108603p("tipsCheckCB");
            throw null;
        } else if (checkBox != null) {
            checkBox.setChecked(!checkBox.isChecked());
        } else {
            C87412m.m108603p("tipsCheckCB");
            throw null;
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C15071e.class);
    }
}
