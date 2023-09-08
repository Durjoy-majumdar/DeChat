package com.tencent.p014mm.plugin.finder.view;

import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.graphics.Point;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import bl3.C39818r;
import cl1.C54991o;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76891l0;
import nj3.C76901s0;
import ok1.C62042e;
import p196ln.C76705f;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49765hx0;
import uo3.C78253a;
import up1.C27696y;

/* renamed from: com.tencent.mm.plugin.finder.view.e3 */
public final class C41573e3 {

    /* renamed from: a */
    public static final C41573e3 f111902a = new C41573e3();

    /* renamed from: b */
    public static C78253a f111903b;

    /* renamed from: c */
    public static C76901s0 f111904c;

    /* renamed from: d */
    public static final C13601g f111905d = C36568h.m40985a(C4048d.f18149d);

    /* renamed from: com.tencent.mm.plugin.finder.view.e3$d */
    public static final class C4048d extends C87413o implements C32224a<Point> {

        /* renamed from: d */
        public static final C4048d f18149d = new C4048d();

        public C4048d() {
            super(0);
        }

        public Object invoke() {
            return new Point(0, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.e3$a */
    public static final class C41574a {

        /* renamed from: a */
        public View f111906a;

        /* renamed from: b */
        public final C41575b f111907b;

        /* renamed from: c */
        public final C49765hx0 f111908c;

        /* renamed from: d */
        public final boolean f111909d;

        /* renamed from: e */
        public boolean f111910e;

        /* renamed from: f */
        public boolean f111911f;

        /* renamed from: g */
        public String f111912g;

        /* renamed from: h */
        public String f111913h;

        public C41574a(View view, C41575b bVar, C49765hx0 hx02, boolean z, boolean z2, boolean z3, String str, String str2, int i, C8480h hVar) {
            bVar = (i & 2) != 0 ? new C41575b((Point) null, false, 3, (C8480h) null) : bVar;
            z2 = (i & 16) != 0 ? false : z2;
            z3 = (i & 32) != 0 ? false : z3;
            str = (i & 64) != 0 ? "" : str;
            str2 = (i & 128) != 0 ? "" : str2;
            C87412m.m108594g(view, "anchorView");
            C87412m.m108594g(bVar, "uiParams");
            C87412m.m108594g(str, "boxId");
            C87412m.m108594g(str2, "likeComment");
            this.f111906a = view;
            this.f111907b = bVar;
            this.f111908c = hx02;
            this.f111909d = z;
            this.f111910e = z2;
            this.f111911f = z3;
            this.f111912g = str;
            this.f111913h = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C41574a)) {
                return false;
            }
            C41574a aVar = (C41574a) obj;
            return C87412m.m108589b(this.f111906a, aVar.f111906a) && C87412m.m108589b(this.f111907b, aVar.f111907b) && C87412m.m108589b(this.f111908c, aVar.f111908c) && this.f111909d == aVar.f111909d && this.f111910e == aVar.f111910e && this.f111911f == aVar.f111911f && C87412m.m108589b(this.f111912g, aVar.f111912g) && C87412m.m108589b(this.f111913h, aVar.f111913h);
        }

        public int hashCode() {
            int hashCode = ((this.f111906a.hashCode() * 31) + this.f111907b.hashCode()) * 31;
            C49765hx0 hx02 = this.f111908c;
            int hashCode2 = (hashCode + (hx02 == null ? 0 : hx02.hashCode())) * 31;
            boolean z = this.f111909d;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f111910e;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f111911f;
            if (!z4) {
                z2 = z4;
            }
            return ((((i2 + (z2 ? 1 : 0)) * 31) + this.f111912g.hashCode()) * 31) + this.f111913h.hashCode();
        }

        public String toString() {
            return "PopupMenuConfig(anchorView=" + this.f111906a + ", uiParams=" + this.f111907b + ", contact=" + this.f111908c + ", isAssistant=" + this.f111909d + ", enableCustomMenuColor=" + this.f111910e + ", isBox=" + this.f111911f + ", boxId=" + this.f111912g + ", likeComment=" + this.f111913h + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.e3$c */
    public static final class C41576c {

        /* renamed from: a */
        public boolean f111916a;

        /* renamed from: b */
        public C76875f0 f111917b;

        /* renamed from: c */
        public boolean f111918c;

        public C41576c(boolean z, C76875f0 f0Var, boolean z2) {
            this.f111916a = z;
            this.f111917b = f0Var;
            this.f111918c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C41576c)) {
                return false;
            }
            C41576c cVar = (C41576c) obj;
            return this.f111916a == cVar.f111916a && C87412m.m108589b(this.f111917b, cVar.f111917b) && this.f111918c == cVar.f111918c;
        }

        public int hashCode() {
            boolean z = this.f111916a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            C76875f0 f0Var = this.f111917b;
            int hashCode = (i + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
            boolean z3 = this.f111918c;
            if (!z3) {
                z2 = z3;
            }
            return hashCode + (z2 ? 1 : 0);
        }

        public String toString() {
            return "TopMemuConfig(isShowTopMenuItem=" + this.f111916a + ", topMemuItem=" + this.f111917b + ", wxContactFirst=" + this.f111918c + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.e3$e */
    public static final class C41577e implements PopupWindow.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ PopupWindow.OnDismissListener f111919d;

        public C41577e(PopupWindow.OnDismissListener onDismissListener) {
            this.f111919d = onDismissListener;
        }

        public final void onDismiss() {
            C41573e3 e3Var = C41573e3.f111902a;
            C76901s0 s0Var = C41573e3.f111904c;
            boolean z = true;
            if (s0Var == null || !s0Var.isShowing()) {
                z = false;
            }
            if (z) {
                C76901s0 s0Var2 = C41573e3.f111904c;
                if (s0Var2 != null) {
                    s0Var2.dismiss();
                }
                C41573e3.f111904c = null;
            }
            this.f111919d.onDismiss();
        }
    }

    /* renamed from: a */
    public final boolean mo64658a() {
        C78253a aVar = f111903b;
        boolean z = true;
        if (aVar != null && aVar.mo108269d()) {
            C78253a aVar2 = f111903b;
            if (aVar2 != null) {
                aVar2.mo108266a();
            }
            C76901s0 s0Var = f111904c;
            if (s0Var != null) {
                s0Var.dismiss();
            }
        } else {
            z = false;
        }
        f111903b = null;
        return z;
    }

    /* renamed from: b */
    public final boolean mo64659b() {
        C78253a aVar = f111903b;
        return aVar != null && aVar.mo108269d();
    }

    /* renamed from: c */
    public final void mo64660c(int i, C41574a aVar) {
        Class cls = C54116w.class;
        if (C62042e.f176370a.mo87027N0()) {
            ((C54108o) C86312j.m106911c(C54108o.class)).Lx0(i);
            return;
        }
        boolean z = false;
        if (aVar != null && aVar.f111911f) {
            z = true;
        }
        if (z) {
            ((C54116w) C86312j.m106911c(cls)).Qx0(i, 1, aVar.f111912g, aVar.f111913h);
        } else {
            ((C54116w) C86312j.m106911c(cls)).Px0(i);
        }
    }

    /* renamed from: d */
    public final void mo64661d(C76891l0 l0Var, C11184p0 p0Var, PopupWindow.OnDismissListener onDismissListener, C41574a aVar, C41576c cVar) {
        C49765hx0 hx02;
        int i;
        String str;
        String str2;
        int i2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ViewGroup.LayoutParams layoutParams;
        C78253a aVar2;
        PopupWindow.OnDismissListener onDismissListener2 = onDismissListener;
        C41574a aVar3 = aVar;
        C41576c cVar2 = cVar;
        C11978e0.C11979a aVar4 = C11978e0.C11979a.AVATAR;
        C27696y yVar = C27696y.SMALL_AVATAR_IMAGE;
        Class<C60200t1> cls = C60200t1.class;
        Class cls2 = C11990s0.class;
        Class cls3 = C76979h.class;
        C87412m.m108594g(l0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C87412m.m108594g(p0Var, "selectedListener");
        C87412m.m108594g(onDismissListener2, "onDimissListener");
        C87412m.m108594g(aVar3, "menuConfig");
        Point point = aVar3.f111907b.f111914a;
        int i3 = point.x;
        int i4 = point.y;
        if (i3 <= 0 && i4 <= 0) {
            View view = aVar3.f111906a;
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            Point point2 = new Point(iArr[0] + ((int) (((float) view.getWidth()) / 2.0f)), iArr[1]);
            i3 = point2.x;
            i4 = point2.y;
        }
        int i5 = i4;
        int i6 = i3;
        if (i6 > 0 && i5 > 0) {
            boolean z = cVar2 != null ? cVar2.f111916a : true;
            C78253a aVar5 = new C78253a(aVar3.f111906a.getContext());
            f111903b = aVar5;
            aVar5.f229257z = true;
            if (aVar3.f111907b.f111915b && (aVar2 = f111903b) != null) {
                aVar2.f229233I = true;
            }
            C78253a aVar6 = f111903b;
            if (aVar6 != null) {
                aVar6.f229232H = aVar3.f111910e;
            }
            if (z) {
                C87412m.m108591d(aVar6);
                aVar6.f229226B = (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3729ci);
            }
            C78253a aVar7 = f111903b;
            C87412m.m108591d(aVar7);
            aVar7.f229227C = new C41577e(onDismissListener2);
            C78253a aVar8 = f111903b;
            C87412m.m108591d(aVar8);
            aVar8.mo108271f(aVar3.f111906a, l0Var, p0Var, i6, i5);
            mo64660c(1, aVar3);
            int i7 = 5;
            if ((cVar2 != null ? cVar2.f111917b : null) != null) {
                mo64660c(2, aVar3);
                C78253a aVar9 = f111903b;
                C87412m.m108591d(aVar9);
                int b = (i5 - aVar9.mo108267b()) - ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3766df));
                Context context = aVar3.f111906a.getContext();
                C87412m.m108593f(context, "menuConfig.anchorView.context");
                C78253a aVar10 = f111903b;
                C87412m.m108591d(aVar10);
                C76874e0 e0Var = aVar10.f229254w;
                int size = e0Var != null ? e0Var.size() : 0;
                View inflate = View.inflate(context, C0966R.C0971layout.ayk, (ViewGroup) null);
                View findViewById = inflate != null ? inflate.findViewById(C0966R.C0970id.hz5) : null;
                View inflate2 = View.inflate(context, C0966R.C0971layout.bnd, (ViewGroup) null);
                View findViewById2 = inflate2 != null ? inflate2.findViewById(C0966R.C0970id.f357785br0) : null;
                int paddingLeft = (findViewById != null ? findViewById.getPaddingLeft() : 0) + (findViewById != null ? findViewById.getPaddingRight() : 0);
                int i8 = (findViewById2 == null || (layoutParams = findViewById2.getLayoutParams()) == null) ? 0 : layoutParams.width;
                int dimension = (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3729ci);
                if (i8 > 0 && size > 0) {
                    if (size <= 5) {
                        i7 = size;
                    }
                    int i9 = paddingLeft + (i8 * i7);
                    if (i9 >= dimension) {
                        dimension = i9;
                    }
                }
                View view2 = aVar3.f111906a;
                C49765hx0 hx03 = aVar3.f111908c;
                C76875f0 f0Var = cVar2.f111917b;
                boolean z2 = cVar2.f111918c;
                if (f0Var != null && hx03 != null) {
                    View inflate3 = View.inflate(view2.getContext(), C0966R.C0971layout.a9s, (ViewGroup) null);
                    ImageView imageView = (ImageView) inflate3.findViewById(C0966R.C0970id.d7x);
                    TextView textView = (TextView) inflate3.findViewById(C0966R.C0970id.d7y);
                    C76875f0 f0Var2 = f0Var;
                    View findViewById3 = inflate3.findViewById(C0966R.C0970id.mc4);
                    C9556a aVar11 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar11.mo10233c(8);
                    View view3 = findViewById3;
                    C117292a.m165358d(view3, aVar11.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderIOSFlowWindowHelper", "showTopMemuItem", "(Lcom/tencent/mm/plugin/finder/view/FinderIOSFlowWindowHelper$PopupMenuConfig;IILcom/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener;Lcom/tencent/mm/plugin/finder/view/FinderIOSFlowWindowHelper$TopMemuConfig;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/FinderIOSFlowWindowHelper", "showTopMemuItem", "(Lcom/tencent/mm/plugin/finder/view/FinderIOSFlowWindowHelper$PopupMenuConfig;IILcom/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener;Lcom/tencent/mm/plugin/finder/view/FinderIOSFlowWindowHelper$TopMemuConfig;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (z2) {
                        C76705f fVar = (C76705f) C86312j.m106911c(C76705f.class);
                        FinderContact finderContact = hx03.f134919d;
                        if (finderContact == null || (str5 = finderContact.username) == null) {
                            str5 = "";
                        }
                        fVar.mo106849z(imageView, str5);
                        C58739j4 j4Var = C58739j4.f168176a;
                        FinderContact finderContact2 = hx03.f134919d;
                        textView.setText(((C76979h) C86312j.m106911c(cls3)).mo107057T1(view2.getContext(), C58739j4.m68250G(j4Var, (finderContact2 == null || (str7 = finderContact2.username) == null) ? "" : str7, (finderContact2 == null || (str6 = finderContact2.nickname) == null) ? "" : str6, false, 4, (Object) null)));
                    } else {
                        C39818r rVar = C39818r.f106831a;
                        C60979d<C100810g0> i25 = ((C11990s0) rVar.mo62446e(cls).mo62447c(cls2)).mo11872i2();
                        FinderContact finderContact3 = hx03.f134919d;
                        if (finderContact3 == null || (str3 = finderContact3.headUrl) == null) {
                            str3 = "";
                        }
                        C62345f fVar2 = new C62345f(str3, yVar);
                        C87412m.m108593f(imageView, "avatarView");
                        i25.mo85957c(fVar2, imageView, ((C11990s0) rVar.mo62446e(cls).mo62447c(cls2)).mo11867O2(aVar4));
                        C76979h hVar = (C76979h) C86312j.m106911c(cls3);
                        Context context2 = view2.getContext();
                        FinderContact finderContact4 = hx03.f134919d;
                        if (finderContact4 == null || (str4 = finderContact4.nickname) == null) {
                            str4 = "";
                        }
                        textView.setText(hVar.mo107057T1(context2, str4));
                    }
                    C76901s0 s0Var = new C76901s0(inflate3, dimension, -2);
                    f111904c = s0Var;
                    s0Var.setFocusable(false);
                    C76901s0 s0Var2 = f111904c;
                    if (s0Var2 != null) {
                        s0Var2.setOutsideTouchable(false);
                    }
                    C76901s0 s0Var3 = f111904c;
                    if (s0Var3 != null) {
                        s0Var3.setAnimationStyle(C0966R.style.f8704ru);
                    }
                    C76901s0 s0Var4 = f111904c;
                    if (s0Var4 != null) {
                        s0Var4.setInputMethodMode(2);
                    }
                    C76901s0 s0Var5 = f111904c;
                    if (s0Var5 != null) {
                        s0Var5.setOnDismissListener(C41584h3.f111929d);
                    }
                    inflate3.setOnClickListener(new C41587i3(aVar, p0Var, f0Var2));
                    int i15 = i6 - (dimension / 2);
                    int a = C74942w4.m89784a(view2.getContext(), 12);
                    if (i15 < a) {
                        i15 = a;
                    }
                    inflate3.measure(0, 0);
                    int measuredHeight = b - inflate3.getMeasuredHeight();
                    C76901s0 s0Var6 = f111904c;
                    if (s0Var6 != null) {
                        s0Var6.showAtLocation(view2, 0, i15, measuredHeight);
                        return;
                    }
                    return;
                }
                return;
            }
            FinderLiveService.f159376d.getClass();
            C45795b bVar = FinderLiveService.f159348A;
            if (!(bVar != null && ((C54991o) bVar.mo71262a(C54991o.class)).f154356q2) && (hx02 = aVar3.f111908c) != null) {
                if (!(hx02.f134926n == 3 && z)) {
                    hx02 = null;
                }
                if (hx02 != null) {
                    f111902a.mo64660c(2, (C41574a) null);
                    int dimension2 = (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3766df);
                    int dimension3 = (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3729ci);
                    C78253a aVar12 = f111903b;
                    List<MenuItem> list = aVar12 != null ? aVar12.f229254w.f224704d : null;
                    if (list != null && list.size() >= 4) {
                        ArrayList arrayList = new ArrayList();
                        for (T next : list) {
                            MenuItem menuItem = (MenuItem) next;
                            if ((menuItem instanceof C76875f0) && ((C76875f0) menuItem).f224708B) {
                                arrayList.add(next);
                            }
                        }
                        int size2 = arrayList.size();
                        int max = Math.max(list.size() - size2, size2);
                        if (max >= 4) {
                            dimension3 = (((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3758d_)) * Math.min(max, 5)) + ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3766df));
                        }
                    }
                    if (aVar3.f111907b.f111915b) {
                        C78253a aVar13 = f111903b;
                        C87412m.m108591d(aVar13);
                        i = i5 + aVar13.mo108267b() + dimension2;
                    } else {
                        C78253a aVar14 = f111903b;
                        C87412m.m108591d(aVar14);
                        i = (i5 - aVar14.mo108267b()) - dimension2;
                    }
                    View view4 = aVar3.f111906a;
                    boolean z3 = aVar3.f111909d;
                    View inflate4 = View.inflate(view4.getContext(), C0966R.C0971layout.a9s, (ViewGroup) null);
                    ImageView imageView2 = (ImageView) inflate4.findViewById(C0966R.C0970id.d7x);
                    TextView textView2 = (TextView) inflate4.findViewById(C0966R.C0970id.d7y);
                    C39818r rVar2 = C39818r.f106831a;
                    boolean z4 = !aVar3.f111907b.f111915b;
                    C60979d<C100810g0> i26 = ((C11990s0) rVar2.mo62446e(cls).mo62447c(cls2)).mo11872i2();
                    boolean z5 = z3;
                    FinderContact finderContact5 = hx02.f134919d;
                    if (finderContact5 == null || (str = finderContact5.headUrl) == null) {
                        str = "";
                    }
                    C62345f fVar3 = new C62345f(str, yVar);
                    C87412m.m108593f(imageView2, "avatarView");
                    i26.mo85957c(fVar3, imageView2, ((C11990s0) rVar2.mo62446e(cls).mo62447c(cls2)).mo11867O2(aVar4));
                    C76979h hVar2 = (C76979h) C86312j.m106911c(cls3);
                    Context context3 = view4.getContext();
                    FinderContact finderContact6 = hx02.f134919d;
                    if (finderContact6 == null || (str2 = finderContact6.nickname) == null) {
                        str2 = "";
                    }
                    textView2.setText(hVar2.mo107057T1(context3, str2));
                    C76901s0 s0Var7 = new C76901s0(inflate4, dimension3, -2);
                    f111904c = s0Var7;
                    s0Var7.setFocusable(false);
                    C76901s0 s0Var8 = f111904c;
                    if (s0Var8 != null) {
                        s0Var8.setOutsideTouchable(false);
                    }
                    C76901s0 s0Var9 = f111904c;
                    if (s0Var9 != null) {
                        s0Var9.setAnimationStyle(C0966R.style.f8704ru);
                    }
                    C76901s0 s0Var10 = f111904c;
                    if (s0Var10 != null) {
                        s0Var10.setInputMethodMode(2);
                    }
                    C76901s0 s0Var11 = f111904c;
                    if (s0Var11 != null) {
                        s0Var11.setOnDismissListener(C41579f3.f111921d);
                    }
                    inflate4.setOnClickListener(new C41581g3(p0Var, view4, hx02, z5));
                    if (z4) {
                        i2 = i6 - (dimension3 / 2);
                        int a2 = C74942w4.m89784a(view4.getContext(), 12);
                        if (i2 < a2) {
                            i2 = a2;
                        }
                    } else {
                        i2 = i6 - (dimension3 / 2);
                        if (i2 < 0) {
                            i2 = 0;
                        }
                    }
                    inflate4.measure(0, 0);
                    if (z4) {
                        i -= inflate4.getMeasuredHeight();
                    }
                    int i16 = i;
                    C76901s0 s0Var12 = f111904c;
                    if (s0Var12 != null) {
                        s0Var12.showAtLocation(view4, 0, i2, i16);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.e3$b */
    public static final class C41575b {

        /* renamed from: a */
        public final Point f111914a;

        /* renamed from: b */
        public final boolean f111915b;

        public C41575b() {
            this((Point) null, false, 3, (C8480h) null);
        }

        public C41575b(Point point, boolean z) {
            C87412m.m108594g(point, "popupWindowPos");
            this.f111914a = point;
            this.f111915b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C41575b)) {
                return false;
            }
            C41575b bVar = (C41575b) obj;
            return C87412m.m108589b(this.f111914a, bVar.f111914a) && this.f111915b == bVar.f111915b;
        }

        public int hashCode() {
            int hashCode = this.f111914a.hashCode() * 31;
            boolean z = this.f111915b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "PopupMenuUIParams(popupWindowPos=" + this.f111914a + ", forceShowAtBottom=" + this.f111915b + ')';
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C41575b(android.graphics.Point r1, boolean r2, int r3, gy3.C8480h r4) {
            /*
                r0 = this;
                r4 = r3 & 1
                if (r4 == 0) goto L_0x0010
                com.tencent.mm.plugin.finder.view.e3 r1 = com.tencent.p014mm.plugin.finder.view.C41573e3.f111902a
                rx3.g r1 = com.tencent.p014mm.plugin.finder.view.C41573e3.f111905d
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                android.graphics.Point r1 = (android.graphics.Point) r1
            L_0x0010:
                r3 = r3 & 2
                if (r3 == 0) goto L_0x0015
                r2 = 0
            L_0x0015:
                r0.<init>(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C41573e3.C41575b.<init>(android.graphics.Point, boolean, int, gy3.h):void");
        }
    }
}
