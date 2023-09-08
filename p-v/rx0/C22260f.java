package rx0;

import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Context;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32226l;
import gw0.C76073b;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.Arrays;
import kg3.C76577a;
import nj3.C11184p0;
import nj3.C76874e0;
import o40.C61926c;
import p196ln.C76706g;
import p248ug.C37468y;
import p248ug.C52558c;
import qo3.C77407n;
import rb0.C48009v0;
import rx3.C13598b0;
import s90.C77627f;
import s90.C77630j;
import te3.C22521pi1;
import te3.C64459j13;
import te3.C64846y23;
import te3.i25;
import te3.re4;
import uo3.C78253a;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: rx0.f */
public final class C22260f {

    /* renamed from: a */
    public final MMActivity f63082a;

    /* renamed from: b */
    public final C18508z2 f63083b;

    /* renamed from: c */
    public final String f63084c = "BizTimeLinePopMenuManager";

    /* renamed from: d */
    public final AppCompatActivity f63085d;

    /* renamed from: e */
    public final C77584b f63086e;

    /* renamed from: f */
    public final C22270n f63087f;

    /* renamed from: rx0.f$a */
    public static final class C22261a implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f63088d;

        /* renamed from: e */
        public final /* synthetic */ C22260f f63089e;

        /* renamed from: f */
        public final /* synthetic */ boolean f63090f;

        public C22261a(boolean z, C22260f fVar, boolean z2) {
            this.f63088d = z;
            this.f63089e = fVar;
            this.f63090f = z2;
        }

        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            C87412m.m108592e(contextMenu, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenu");
            C76874e0 e0Var = (C76874e0) contextMenu;
            if (this.f63088d) {
                e0Var.mo107136c(0, 5, 0, this.f63089e.f63085d.getString(C0966R.string.ddu), C0966R.raw.icons_outlined_multitask);
            }
            if (this.f63090f) {
                e0Var.mo107136c(1, 0, 1, this.f63089e.f63085d.getString(C0966R.string.an5), C0966R.raw.icons_filled_eyes_off_new);
            }
            e0Var.mo107136c(2, 3, 2, this.f63089e.f63085d.getString(C0966R.string.ddq), C0966R.raw.icons_outlined_delete);
        }
    }

    /* renamed from: rx0.f$b */
    public static final class C22262b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C22260f f63091d;

        /* renamed from: e */
        public final /* synthetic */ C22521pi1 f63092e;

        /* renamed from: f */
        public final /* synthetic */ View f63093f;

        /* renamed from: g */
        public final /* synthetic */ C19623o0 f63094g;

        /* renamed from: h */
        public final /* synthetic */ C32226l<C22521pi1, C13598b0> f63095h;

        /* renamed from: i */
        public final /* synthetic */ C32226l<C22521pi1, C13598b0> f63096i;

        /* renamed from: rx0.f$b$a */
        public static final class C22263a extends C87413o implements C32226l<C19623o0, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C22260f f63097d;

            /* renamed from: e */
            public final /* synthetic */ C22521pi1 f63098e;

            /* renamed from: f */
            public final /* synthetic */ C32226l<C22521pi1, C13598b0> f63099f;

            /* renamed from: g */
            public final /* synthetic */ C19623o0 f63100g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22263a(C22260f fVar, C22521pi1 pi12, C32226l<? super C22521pi1, C13598b0> lVar, C19623o0 o0Var) {
                super(1);
                this.f63097d = fVar;
                this.f63098e = pi12;
                this.f63099f = lVar;
                this.f63100g = o0Var;
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((C19623o0) obj, LocaleUtil.ITALIAN);
                String str = this.f63097d.f63084c;
                Log.m105924i(str, "finder: delete -> title = " + this.f63098e.f64433p);
                C32226l<C22521pi1, C13598b0> lVar = this.f63099f;
                if (lVar != null) {
                    lVar.invoke(this.f63098e);
                }
                C18412m3 m3Var = this.f63097d.f63083b.f51443n;
                String str2 = this.f63098e.f64426f;
                C19623o0 o0Var = this.f63100g;
                String str3 = o0Var.mo25774x2().f64526r;
                C22521pi1 pi12 = this.f63098e;
                m3Var.mo22987n(str2, 31, (int) o0Var.field_msgId, str3, pi12.f64435r, pi12.f64431n, "", pi12.f64419N);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: rx0.f$b$b */
        public static final class C22264b extends C87413o implements C32226l<C19623o0, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C32226l<C22521pi1, C13598b0> f63101d;

            /* renamed from: e */
            public final /* synthetic */ C22521pi1 f63102e;

            /* renamed from: f */
            public final /* synthetic */ C22260f f63103f;

            /* renamed from: g */
            public final /* synthetic */ C19623o0 f63104g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22264b(C32226l<? super C22521pi1, C13598b0> lVar, C22521pi1 pi12, C22260f fVar, C19623o0 o0Var) {
                super(1);
                this.f63101d = lVar;
                this.f63102e = pi12;
                this.f63103f = fVar;
                this.f63104g = o0Var;
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((C19623o0) obj, LocaleUtil.ITALIAN);
                C32226l<C22521pi1, C13598b0> lVar = this.f63101d;
                if (lVar != null) {
                    lVar.invoke(this.f63102e);
                }
                C18412m3 m3Var = this.f63103f.f63083b.f51443n;
                String str = this.f63102e.f64426f;
                C19623o0 o0Var = this.f63104g;
                String str2 = o0Var.mo25774x2().f64526r;
                C22521pi1 pi12 = this.f63102e;
                m3Var.mo22987n(str, 32, (int) o0Var.field_msgId, str2, pi12.f64435r, pi12.f64431n, "", pi12.f64419N);
                return C13598b0.f38549a;
            }
        }

        public C22262b(C22260f fVar, C22521pi1 pi12, View view, C19623o0 o0Var, C32226l<? super C22521pi1, C13598b0> lVar, C32226l<? super C22521pi1, C13598b0> lVar2) {
            this.f63091d = fVar;
            this.f63092e = pi12;
            this.f63093f = view;
            this.f63094g = o0Var;
            this.f63095h = lVar;
            this.f63096i = lVar2;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 5) {
                String str = this.f63091d.f63084c;
                Log.m105924i(str, "finder: multitask -> title = " + this.f63092e.f64433p);
                C22260f fVar = this.f63091d;
                View view = this.f63093f;
                C19623o0 o0Var = this.f63094g;
                C22521pi1 pi12 = this.f63092e;
                String str2 = fVar.f63084c;
                Log.m105924i(str2, "doFinderMultiTask, msgid = " + o0Var.field_msgId);
                fVar.f63083b.f51443n.mo22987n(pi12.f64426f, 30, (int) o0Var.field_msgId, o0Var.mo25774x2().f64526r, pi12.f64435r, pi12.f64431n, "", pi12.f64419N);
                fVar.f63086e.mo107766a(view);
                C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
                long P = C61926c.m72671P(pi12.f64435r);
                String str3 = pi12.f64433p;
                String str4 = str3 == null ? "" : str3;
                String str5 = pi12.f64434q;
                String str6 = str5 == null ? "" : str5;
                String str7 = pi12.f64425e;
                String str8 = str7 == null ? "" : str7;
                String str9 = pi12.f64424d;
                t1Var.mo76875sW(P, str4, str6, str8, str9 == null ? "" : str9, (long) pi12.f64440w);
            } else if (itemId == 3) {
                C22260f fVar2 = this.f63091d;
                C19623o0 o0Var2 = this.f63094g;
                String string = fVar2.f63085d.getString(C0966R.string.n0k);
                C87412m.m108593f(string, "mContext.getString(R.str…ne_un_delete_finder_tips)");
                C22260f.m25817a(fVar2, o0Var2, string, new C22263a(this.f63091d, this.f63092e, this.f63095h, this.f63094g));
            } else if (itemId == 0) {
                C22521pi1 pi13 = this.f63092e;
                String string2 = pi13.f64411F == 1 ? this.f63091d.f63085d.getString(C0966R.string.n0l, new Object[]{pi13.f64425e}) : this.f63091d.f63085d.getString(C0966R.string.n0m, new Object[]{pi13.f64425e});
                C87412m.m108593f(string2, "if (finderFeedData.show_…finderFeedData.nick_name)");
                String str10 = this.f63091d.f63084c;
                Log.m105924i(str10, "finder: unfollow -> title = " + this.f63092e.f64433p);
                C22260f fVar3 = this.f63091d;
                C19623o0 o0Var3 = this.f63094g;
                C22260f.m25818b(fVar3, o0Var3, string2, new C22264b(this.f63096i, this.f63092e, fVar3, o0Var3));
            }
        }
    }

    /* renamed from: rx0.f$c */
    public static final class C22265c implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f63105d;

        /* renamed from: e */
        public final /* synthetic */ C22260f f63106e;

        public C22265c(boolean z, C22260f fVar) {
            this.f63105d = z;
            this.f63106e = fVar;
        }

        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            C87412m.m108592e(contextMenu, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenu");
            C76874e0 e0Var = (C76874e0) contextMenu;
            if (this.f63105d) {
                e0Var.mo107136c(0, 4, 0, this.f63106e.f63085d.getString(C0966R.string.ddu), C0966R.raw.icons_outlined_multitask);
            }
            e0Var.mo107136c(0, 0, 1, this.f63106e.f63085d.getString(C0966R.string.an5), C0966R.raw.icons_filled_eyes_off_new);
            e0Var.mo107136c(0, 2, 2, this.f63106e.f63085d.getString(C0966R.string.ddq), C0966R.raw.icons_outlined_delete);
        }
    }

    /* renamed from: rx0.f$d */
    public static final class C22266d implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C19623o0 f63107d;

        /* renamed from: e */
        public final /* synthetic */ C22260f f63108e;

        /* renamed from: f */
        public final /* synthetic */ C77630j f63109f;

        /* renamed from: g */
        public final /* synthetic */ View f63110g;

        /* renamed from: h */
        public final /* synthetic */ int f63111h;

        /* renamed from: rx0.f$d$a */
        public static final class C22267a extends C87413o implements C32226l<C19623o0, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C22260f f63112d;

            /* renamed from: e */
            public final /* synthetic */ C77630j f63113e;

            /* renamed from: f */
            public final /* synthetic */ C19623o0 f63114f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22267a(C22260f fVar, C77630j jVar, C19623o0 o0Var) {
                super(1);
                this.f63112d = fVar;
                this.f63113e = jVar;
                this.f63114f = o0Var;
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((C19623o0) obj, LocaleUtil.ITALIAN);
                String str = this.f63112d.f63084c;
                StringBuilder sb = new StringBuilder();
                sb.append("mp: unfollow -> title = ");
                C77630j jVar = this.f63113e;
                sb.append(jVar != null ? jVar.f226325d : null);
                Log.m105924i(str, sb.toString());
                C22260f fVar = this.f63112d;
                C19623o0 o0Var = this.f63114f;
                fVar.getClass();
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(o0Var.field_talker);
                C52558c SE = C48009v0.Fx0().mo72757SE(o0Var.field_talker);
                String str2 = fVar.f63084c;
                Log.m105924i(str2, "onUnfollow, username = " + o0Var.field_talker);
                fVar.f63083b.f51443n.mo22984k(o0Var, 2);
                AppCompatActivity appCompatActivity = fVar.f63085d;
                C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type android.app.Activity");
                ((C37468y) C86312j.m106911c(C37468y.class)).mo61116ee(SE, appCompatActivity, z1Var, false);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: rx0.f$d$b */
        public static final class C22268b extends C87413o implements C32226l<C19623o0, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C22260f f63115d;

            /* renamed from: e */
            public final /* synthetic */ C77630j f63116e;

            /* renamed from: f */
            public final /* synthetic */ C19623o0 f63117f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22268b(C22260f fVar, C77630j jVar, C19623o0 o0Var) {
                super(1);
                this.f63115d = fVar;
                this.f63116e = jVar;
                this.f63117f = o0Var;
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((C19623o0) obj, LocaleUtil.ITALIAN);
                String str = this.f63115d.f63084c;
                StringBuilder sb = new StringBuilder();
                sb.append("mp: delete -> title = ");
                C77630j jVar = this.f63116e;
                sb.append(jVar != null ? jVar.f226325d : null);
                Log.m105924i(str, sb.toString());
                C22260f fVar = this.f63115d;
                C19623o0 o0Var = this.f63117f;
                Log.m105924i(fVar.f63084c, "deleteMsg: delete in db");
                fVar.f63083b.f51443n.mo22978e(o0Var);
                fVar.f63083b.f51444o.mo23032d(o0Var);
                C48009v0.Jx0().mo25785Lo(o0Var.field_msgId);
                return C13598b0.f38549a;
            }
        }

        public C22266d(C19623o0 o0Var, C22260f fVar, C77630j jVar, View view, int i) {
            this.f63107d = o0Var;
            this.f63108e = fVar;
            this.f63109f = jVar;
            this.f63110g = view;
            this.f63111h = i;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C19623o0 o0Var = this.f63107d;
            C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(o0Var.field_msgId, o0Var.field_content);
            C87412m.m108593f(JZ, "getService(IAppMsgBizHel…melineInfo.field_content)");
            int itemId = menuItem.getItemId();
            if (itemId == 4) {
                String str = this.f63108e.f63084c;
                StringBuilder sb = new StringBuilder();
                sb.append("mp: multitask -> title = ");
                C77630j jVar = this.f63109f;
                String str2 = null;
                sb.append(jVar != null ? jVar.f226325d : null);
                Log.m105924i(str, sb.toString());
                C22260f fVar = this.f63108e;
                View view = this.f63110g;
                C19623o0 o0Var2 = this.f63107d;
                C77630j jVar2 = this.f63109f;
                int i2 = this.f63111h;
                if (jVar2 == null) {
                    fVar.getClass();
                    return;
                }
                String str3 = fVar.f63084c;
                Log.m105924i(str3, "doMpMultiTask, msgid = " + o0Var2.field_msgId);
                fVar.f63083b.f51443n.mo22984k(o0Var2, 29);
                C64459j13 j132 = new C64459j13();
                String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(o0Var2.field_talker);
                C68097n Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(o0Var2.field_talker);
                if (Lo != null) {
                    str2 = Lo.mo93597f();
                }
                j132.f183751d = displayName;
                j132.f183752e = jVar2.f226325d;
                j132.f183753f = str2;
                j132.f183756i = str2;
                j132.f183758n = false;
                i25 i25 = new i25();
                String str4 = jVar2.f226326e;
                i25.f135052f = str4;
                i25.f135051e = str4;
                i25.f135063t = 90;
                C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C22258c(j132, fVar, jVar2, o0Var2, i2, i25, (C15601d<? super C22258c>) null), 3, (Object) null);
                fVar.f63086e.mo107766a(view);
            } else if (itemId == 0) {
                C22260f fVar2 = this.f63108e;
                C19623o0 o0Var3 = this.f63107d;
                String string = fVar2.f63085d.getString(C0966R.string.n0m, new Object[]{JZ.f226293g});
                C87412m.m108593f(string, "mContext.getString(R.str…p, reader.srcDisplayname)");
                C22260f.m25818b(fVar2, o0Var3, string, new C22267a(this.f63108e, this.f63109f, this.f63107d));
            } else if (itemId == 2) {
                C22260f fVar3 = this.f63108e;
                C19623o0 o0Var4 = this.f63107d;
                String string2 = fVar3.f63085d.getString(C0966R.string.apr);
                C87412m.m108593f(string2, "mContext.getString(R.str…_line_un_delete_msg_tips)");
                C22260f.m25817a(fVar3, o0Var4, string2, new C22268b(this.f63108e, this.f63109f, this.f63107d));
            }
        }
    }

    public C22260f(MMActivity mMActivity, C18508z2 z2Var) {
        C87412m.m108594g(mMActivity, "timelineUI");
        C87412m.m108594g(z2Var, "adapter");
        this.f63082a = mMActivity;
        this.f63083b = z2Var;
        this.f63085d = mMActivity.getContext();
        this.f63086e = new C77584b(mMActivity);
        this.f63087f = new C22270n(mMActivity, z2Var);
    }

    /* renamed from: a */
    public static final void m25817a(C22260f fVar, C19623o0 o0Var, String str, C32226l lVar) {
        C77407n nVar = new C77407n((Context) fVar.f63085d, 1, true);
        nVar.mo107568m(str, 17, C76577a.m92151b(fVar.f63085d, 12));
        nVar.f225771i = new C22259d(fVar);
        nVar.f225782p = new C36549e(lVar, o0Var);
        nVar.mo107573q();
    }

    /* renamed from: b */
    public static final void m25818b(C22260f fVar, C19623o0 o0Var, String str, C32226l lVar) {
        String str2 = fVar.f63084c;
        Log.m105924i(str2, "showUnsubscribeBottomSheet, msgid = " + o0Var.field_msgId);
        String format = String.format(str, Arrays.copyOf(new Object[]{((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(o0Var.field_talker)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        C77407n nVar = new C77407n((Context) fVar.f63085d, 1, true);
        nVar.mo107568m(format, 17, C76577a.m92151b(fVar.f63085d, 12));
        nVar.f225771i = new C22269g(fVar);
        nVar.f225782p = new C36550h(lVar, o0Var);
        nVar.mo107573q();
    }

    /* renamed from: c */
    public final void mo35420c(View view, C19623o0 o0Var, C22521pi1 pi12, int i, boolean z, boolean z2, C32226l<? super C22521pi1, C13598b0> lVar, C32226l<? super C22521pi1, C13598b0> lVar2) {
        C64846y23 y232;
        View view2 = view;
        C19623o0 o0Var2 = o0Var;
        C87412m.m108594g(view2, "containerView");
        C87412m.m108594g(o0Var2, "bizTimelineInfo");
        C87412m.m108594g(pi12, "finderFeedData");
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        boolean z3 = false;
        C13590i iVar = new C13590i(iArr[0], iArr[1]);
        int i2 = iVar.f38534a;
        int i3 = iVar.f38535b;
        int width = i2 + (view.getWidth() / 2);
        re4 x2 = o0Var.mo25774x2();
        if (!(x2 == null || (y232 = x2.f64529u) == null || y232.f186438d != 3)) {
            z3 = true;
        }
        if (z3) {
            ViewParent parent = view.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            if (((double) (((float) (((View) parent).getWidth() - i2)) / ((float) view.getWidth()))) < 0.6d) {
                Log.m105924i(this.f63084c, "exposeRatio < 0.6, fail");
                return;
            }
        }
        ViewParent parent2 = view.getParent();
        C87412m.m108592e(parent2, "null cannot be cast to non-null type android.view.View");
        ((View) parent2).getLocationInWindow(new int[2]);
        String str = this.f63084c;
        Log.m105924i(str, "showFinderCardPopMenu, msgid = " + o0Var2.field_msgId);
        this.f63083b.f51443n.mo22984k(o0Var2, 28);
        C22261a aVar = new C22261a(z2, this, z);
        C22262b bVar = new C22262b(this, pi12, view, o0Var, lVar, lVar2);
        C78253a aVar2 = new C78253a(this.f63085d);
        aVar2.f229257z = true;
        aVar2.mo108273h(view, aVar, bVar, width, i3);
    }

    /* renamed from: d */
    public final void mo35421d(View view, C19623o0 o0Var, C77630j jVar, int i, boolean z) {
        View view2 = view;
        C87412m.m108594g(view, "targetView");
        C87412m.m108594g(o0Var, "bizTimelineInfo");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        C13590i iVar = new C13590i(iArr[0], iArr[1]);
        int i2 = iVar.f38534a;
        int i3 = iVar.f38535b;
        int width = i2 + (view.getWidth() / 2);
        String str = this.f63084c;
        Log.m105924i(str, "showHeaderPopMenu, msgid = " + o0Var.field_msgId);
        this.f63083b.f51443n.mo22984k(o0Var, 28);
        C22265c cVar = new C22265c(z, this);
        C22266d dVar = new C22266d(o0Var, this, jVar, view, i);
        C78253a aVar = new C78253a(this.f63085d);
        aVar.f229257z = true;
        aVar.mo108273h(view, cVar, dVar, width, i3);
    }
}
