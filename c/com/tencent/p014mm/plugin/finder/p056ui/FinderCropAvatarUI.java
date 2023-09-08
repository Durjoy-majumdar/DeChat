package com.tencent.p014mm.plugin.finder.p056ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.gallery.picker.view.WxMediaCropLayout;
import com.tencent.p014mm.plugin.recordvideo.p095ui.WxCropOperationLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import er1.C58741j5;
import er1.C7865r3;
import er1.C7919x;
import f40.C86709a0;
import ft3.C116895f;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import lc3.C10485b;
import nj3.C76879j;
import nj3.C88989a;
import o40.C61926c;
import p143ds.C7510m;
import p143ds.C97528n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import up1.C37521f;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderCropAvatarUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(16)
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI */
public final class FinderCropAvatarUI extends MMFinderUI {

    /* renamed from: C */
    public static final /* synthetic */ int f270604C = 0;

    /* renamed from: A */
    public Dialog f270605A;

    /* renamed from: B */
    public final Runnable f270606B = new C93764k(this);

    /* renamed from: o */
    public final String f270607o = "Finder.FinderCropAvatarUI";

    /* renamed from: p */
    public String f270608p;

    /* renamed from: q */
    public String f270609q;

    /* renamed from: r */
    public WxMediaCropLayout f270610r;

    /* renamed from: s */
    public final C13601g f270611s = C36568h.m40985a(new C93754b(this));

    /* renamed from: t */
    public final C13601g f270612t = C36568h.m40985a(new C93755c(this));

    /* renamed from: u */
    public int f270613u;

    /* renamed from: v */
    public final double f270614v = 1.7777777777777777d;

    /* renamed from: w */
    public final C13601g f270615w = C36568h.m40985a(new C93767m(this));

    /* renamed from: x */
    public final C13601g f270616x = C36568h.m40985a(new C93766l(this));

    /* renamed from: y */
    public final C13601g f270617y = C36568h.m40985a(new C93756d(this));

    /* renamed from: z */
    public final C13601g f270618z = C36568h.m40985a(new C93753a(this));

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI$a */
    public static final class C93753a extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ FinderCropAvatarUI f270619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93753a(FinderCropAvatarUI finderCropAvatarUI) {
            super(0);
            this.f270619d = finderCropAvatarUI;
        }

        public Object invoke() {
            return (Button) this.f270619d.findViewById(C0966R.C0970id.bwk);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI$b */
    public static final class C93754b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderCropAvatarUI f270620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93754b(FinderCropAvatarUI finderCropAvatarUI) {
            super(0);
            this.f270620d = finderCropAvatarUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f270620d.getIntent().getIntExtra("key_crop_style", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI$c */
    public static final class C93755c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderCropAvatarUI f270621d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93755c(FinderCropAvatarUI finderCropAvatarUI) {
            super(0);
            this.f270621d = finderCropAvatarUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f270621d.getIntent().getIntExtra("key_crop_type", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI$d */
    public static final class C93756d extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ FinderCropAvatarUI f270622d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93756d(FinderCropAvatarUI finderCropAvatarUI) {
            super(0);
            this.f270622d = finderCropAvatarUI;
        }

        public Object invoke() {
            return (Button) this.f270622d.findViewById(C0966R.C0970id.bwm);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI$e */
    public static final class C93757e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f270623d;

        /* renamed from: e */
        public final /* synthetic */ FinderCropAvatarUI f270624e;

        public C93757e(View view, FinderCropAvatarUI finderCropAvatarUI) {
            this.f270623d = view;
            this.f270624e = finderCropAvatarUI;
        }

        public final void run() {
            this.f270623d.setPadding(0, 0, 0, C75044y4.m89991c(this.f270624e.getContext()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI$f */
    public static final class C93758f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCropAvatarUI f270625d;

        /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI$f$a */
        public static final class C93759a extends C87413o implements C32227p<Boolean, C7510m.C7513c, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderCropAvatarUI f270626d;

            /* renamed from: e */
            public final /* synthetic */ String f270627e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C93759a(FinderCropAvatarUI finderCropAvatarUI, String str) {
                super(2);
                this.f270626d = finderCropAvatarUI;
                this.f270627e = str;
            }

            public Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C87412m.m108594g((C7510m.C7513c) obj2, "result");
                MMHandlerThread.removeRunnable(this.f270626d.f270606B);
                Dialog dialog = this.f270626d.f270605A;
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (booleanValue) {
                    Intent intent = new Intent();
                    intent.putExtra("key_result_img_path", this.f270627e);
                    this.f270626d.setResult(-1, intent);
                    this.f270626d.finish();
                } else {
                    C61926c.m72668M(new C93774o0(this.f270626d));
                }
                return C13598b0.f38549a;
            }
        }

        public C93758f(FinderCropAvatarUI finderCropAvatarUI) {
            this.f270625d = finderCropAvatarUI;
        }

        public final void onClick(View view) {
            int i;
            int i2;
            Class cls = C10485b.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderCropAvatarUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MMHandlerThread.postToMainThreadDelayed(this.f270625d.f270606B, 300);
            C7510m.C7512a aVar = new C7510m.C7512a();
            int i3 = this.f270625d.f270613u;
            boolean z = false;
            if (i3 == 1) {
                C37521f fVar = C37521f.f99374d;
                fVar.getClass();
                aVar.f25772g = C37521f.f99516t;
                fVar.getClass();
                String c = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("FinderHeadCompressPicLevel");
                if (c == null || c.length() == 0) {
                    z = true;
                }
                if (z) {
                    i2 = 90;
                } else {
                    Log.m105924i("FinderConfig", "FinderHeadCompressPicLevel=" + c);
                    C87412m.m108593f(c, "info");
                    i2 = Util.safeParseInt(C112550d0.m153799i0(c).toString());
                }
                aVar.f25771f = i2;
                fVar.getClass();
                aVar.f25770e = C37521f.f99525u;
                fVar.getClass();
                aVar.f25769d = C37521f.f99534v;
            } else if (i3 == 2) {
                C37521f fVar2 = C37521f.f99374d;
                fVar2.getClass();
                String c2 = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("FinderProfileBgImgCompressPicLevel");
                if (c2 == null || c2.length() == 0) {
                    z = true;
                }
                if (z) {
                    i = 70;
                } else {
                    Log.m105924i("FinderConfig", "FinderProfileBgImgCompressPicLevel=" + c2);
                    C87412m.m108593f(c2, "info");
                    i = Util.safeParseInt(C112550d0.m153799i0(c2).toString());
                }
                aVar.f25771f = i;
                aVar.f25770e = fVar2.mo61185k();
                aVar.f25769d = fVar2.mo61184j();
            }
            C58741j5 j5Var = C58741j5.f168184a;
            aVar.mo8636a(C58741j5.f168192i);
            String str = this.f270625d.f270609q;
            if (str == null) {
                str = "default_finder_crop_photo.tmp";
            }
            aVar.f25767b = str;
            String str2 = aVar.f25766a + aVar.f25767b;
            C116895f.m164891c(this.f270625d.f270607o, "resultPath=" + str2 + " size: " + (C86013q1.m106451l(this.f270625d.f270608p) / ((long) 1024)));
            WxMediaCropLayout wxMediaCropLayout = this.f270625d.f270610r;
            if (wxMediaCropLayout != null) {
                WxMediaCropLayout.C4425a currentCropInfo = wxMediaCropLayout.getCurrentCropInfo();
                C7510m Mh0 = ((C97528n) C86312j.m106911c(C97528n.class)).Mh0(aVar);
                String str3 = this.f270625d.f270608p;
                C87412m.m108591d(str3);
                C7510m.C7511b.m7645a(Mh0, str3, 1, currentCropInfo.mo5354a(), currentCropInfo.f19139f, currentCropInfo.f19142i, currentCropInfo.f19141h, 0, false, new C93759a(this.f270625d, str2), 128, (Object) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderCropAvatarUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("roundCropLayout");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI$g */
    public static final class C93760g implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCropAvatarUI f270628d;

        public C93760g(FinderCropAvatarUI finderCropAvatarUI) {
            this.f270628d = finderCropAvatarUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f270628d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI$h */
    public static final class C93761h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCropAvatarUI f270629d;

        public C93761h(FinderCropAvatarUI finderCropAvatarUI) {
            this.f270629d = finderCropAvatarUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderCropAvatarUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WxMediaCropLayout wxMediaCropLayout = this.f270629d.f270610r;
            if (wxMediaCropLayout != null) {
                wxMediaCropLayout.mo150024i();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderCropAvatarUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("roundCropLayout");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI$i */
    public static final class C93762i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCropAvatarUI f270630d;

        public C93762i(FinderCropAvatarUI finderCropAvatarUI) {
            this.f270630d = finderCropAvatarUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderCropAvatarUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f270630d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderCropAvatarUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI$j */
    public static final class C93763j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCropAvatarUI f270631d;

        public C93763j(FinderCropAvatarUI finderCropAvatarUI) {
            this.f270631d = finderCropAvatarUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderCropAvatarUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WxMediaCropLayout wxMediaCropLayout = this.f270631d.f270610r;
            if (wxMediaCropLayout != null) {
                wxMediaCropLayout.mo150023h();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderCropAvatarUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("roundCropLayout");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI$k */
    public static final class C93764k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderCropAvatarUI f270632d;

        /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI$k$a */
        public static final class C93765a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public static final C93765a f270633d = new C93765a();

            public final void onCancel(DialogInterface dialogInterface) {
            }
        }

        public C93764k(FinderCropAvatarUI finderCropAvatarUI) {
            this.f270632d = finderCropAvatarUI;
        }

        public final void run() {
            C13598b0 b0Var;
            Dialog dialog = this.f270632d.f270605A;
            if (dialog != null) {
                dialog.show();
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                FinderCropAvatarUI finderCropAvatarUI = this.f270632d;
                finderCropAvatarUI.f270605A = C76879j.m92723Q(finderCropAvatarUI, finderCropAvatarUI.getString(C0966R.string.a3h), finderCropAvatarUI.getString(C0966R.string.a4d), true, false, C93765a.f270633d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI$l */
    public static final class C93766l extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderCropAvatarUI f270634d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93766l(FinderCropAvatarUI finderCropAvatarUI) {
            super(0);
            this.f270634d = finderCropAvatarUI;
        }

        public Object invoke() {
            return this.f270634d.findViewById(C0966R.C0970id.bwq);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI$m */
    public static final class C93767m extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderCropAvatarUI f270635d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93767m(FinderCropAvatarUI finderCropAvatarUI) {
            super(0);
            this.f270635d = finderCropAvatarUI;
        }

        public Object invoke() {
            return this.f270635d.findViewById(C0966R.C0970id.bws);
        }
    }

    /* renamed from: N7 */
    public final RectF mo128680N7() {
        Point h = C85875k4.m106184h(getContext());
        float dimension = ((float) h.x) - getContext().getResources().getDimension(C0966R.dimen.f3755d6);
        float f = (((float) h.y) - dimension) / ((float) 2);
        return new RectF(getContext().getResources().getDimension(C0966R.dimen.f3743cv), f, getContext().getResources().getDimension(C0966R.dimen.f3743cv) + dimension, dimension + f);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a_7;
    }

    public void initView() {
        float f;
        float f2;
        float f3;
        WxCropOperationLayout.C94436h hVar = WxCropOperationLayout.C94436h.RECT_HARD;
        View findViewById = findViewById(C0966R.C0970id.iwv);
        C87412m.m108593f(findViewById, "findViewById(com.tencent…n.finder.R.id.round_crop)");
        WxMediaCropLayout wxMediaCropLayout = (WxMediaCropLayout) findViewById;
        this.f270610r = wxMediaCropLayout;
        wxMediaCropLayout.setShowBorder(false);
        if (((Number) ((C36570n) this.f270611s).getValue()).intValue() == 0) {
            WxMediaCropLayout wxMediaCropLayout2 = this.f270610r;
            if (wxMediaCropLayout2 != null) {
                wxMediaCropLayout2.mo150015f(mo128680N7(), WxCropOperationLayout.C94436h.CIRCLE);
            } else {
                C87412m.m108603p("roundCropLayout");
                throw null;
            }
        } else if (((Number) ((C36570n) this.f270611s).getValue()).intValue() == 1) {
            if (((Number) ((C36570n) this.f270612t).getValue()).intValue() == 1) {
                WxMediaCropLayout wxMediaCropLayout3 = this.f270610r;
                if (wxMediaCropLayout3 != null) {
                    float dimension = getContext().getResources().getDimension(C0966R.dimen.f3743cv);
                    float dimension2 = getContext().getResources().getDimension(C0966R.dimen.f3743cv);
                    float f4 = (float) 2;
                    float f5 = ((float) getContext().getResources().getDisplayMetrics().heightPixels) / f4;
                    float f6 = ((float) getContext().getResources().getDisplayMetrics().widthPixels) - (f4 * dimension);
                    float f7 = ((float) (this.f270614v / ((double) 2))) * f6;
                    if (f5 >= f7 + dimension2) {
                        dimension2 = f5 - f7;
                        f3 = f5 + f7;
                    } else {
                        f3 = ((float) getContext().getResources().getDisplayMetrics().heightPixels) - dimension2;
                    }
                    wxMediaCropLayout3.mo150015f(new RectF(dimension, dimension2, f6 + dimension, f3), hVar);
                } else {
                    C87412m.m108603p("roundCropLayout");
                    throw null;
                }
            } else {
                WxMediaCropLayout wxMediaCropLayout4 = this.f270610r;
                if (wxMediaCropLayout4 != null) {
                    wxMediaCropLayout4.mo150015f(mo128680N7(), hVar);
                } else {
                    C87412m.m108603p("roundCropLayout");
                    throw null;
                }
            }
        } else if (((Number) ((C36570n) this.f270611s).getValue()).intValue() == 2) {
            float dimension3 = getContext().getResources().getDimension(C0966R.dimen.f3738cr);
            WxMediaCropLayout wxMediaCropLayout5 = this.f270610r;
            if (wxMediaCropLayout5 != null) {
                C7865r3 r3Var = C7865r3.f26468a;
                float f8 = (float) 2;
                float c = ((float) r3Var.mo8970c()) - (f8 * dimension3);
                int a = r3Var.mo8968a() / 2;
                float f9 = (1.0f * c) / f8;
                float f15 = (float) a;
                if (f9 + dimension3 > f15) {
                    f = ((float) (a * 2)) - dimension3;
                    f2 = dimension3;
                } else {
                    f2 = f15 - f9;
                    f = f9 + f15;
                }
                wxMediaCropLayout5.mo150015f(new RectF(dimension3, f2, c + dimension3, f), hVar);
            } else {
                C87412m.m108603p("roundCropLayout");
                throw null;
            }
        } else {
            WxMediaCropLayout wxMediaCropLayout6 = this.f270610r;
            if (wxMediaCropLayout6 != null) {
                wxMediaCropLayout6.mo150015f(mo128680N7(), WxCropOperationLayout.C94436h.RECT_ADJUST);
            } else {
                C87412m.m108603p("roundCropLayout");
                throw null;
            }
        }
        WxMediaCropLayout wxMediaCropLayout7 = this.f270610r;
        if (wxMediaCropLayout7 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String str = this.f270608p;
            C87412m.m108591d(str);
            WxMediaCropLayout.m141519g(wxMediaCropLayout7, currentTimeMillis, str, true, (WxMediaCropLayout.C4426b) null, (C32228q) null, 24, (Object) null);
            return;
        }
        C87412m.m108603p("roundCropLayout");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setFlags(201327616, 201327616);
        setLightNavigationbarIcon();
        View findViewById = findViewById(C0966R.C0970id.bwl);
        findViewById.setPadding(0, 0, 0, C75044y4.m89991c(getContext()));
        findViewById.post(new C93757e(findViewById, this));
        setActionbarColor(C0966R.color.ahf);
        this.f270608p = getIntent().getStringExtra("key_source_img_path");
        this.f270609q = getIntent().getStringExtra("key_result_file_name");
        this.f270613u = getIntent().getIntExtra("key_crop_source", 0);
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.BW_0));
        initView();
        Button button = (Button) ((C36570n) this.f270617y).getValue();
        C87412m.m108593f(button, "finishBtn");
        C7919x.m8091a(button);
        ((Button) ((C36570n) this.f270617y).getValue()).setOnClickListener(new C93758f(this));
        setBackBtn(new C93760g(this));
        ((View) ((C36570n) this.f270616x).getValue()).setOnClickListener(new C93761h(this));
        Button button2 = (Button) ((C36570n) this.f270618z).getValue();
        C87412m.m108593f(button2, "cancelBtn");
        C7919x.m8091a(button2);
        ((Button) ((C36570n) this.f270618z).getValue()).setOnClickListener(new C93762i(this));
        ((View) ((C36570n) this.f270615w).getValue()).setOnClickListener(new C93763j(this));
    }
}
