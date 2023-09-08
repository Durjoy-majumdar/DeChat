package com.tencent.p014mm.pluginsdk.p133ui.applet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.patmsg.p086ui.AvatarPatTipImageView;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import java.util.ArrayList;
import java.util.List;
import p609mp.C76803c;
import p609mp.C76805e;
import p609mp.C76808f;
import pj3.C47511g;
import wd3.C78565f0;
import wd3.C78569g0;
import wd3.C78570h0;
import wd3.C78571i0;
import wd3.C78572j0;
import wd3.C78573k0;

/* renamed from: com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference */
public class ContactListExpandPreference extends Preference {

    /* renamed from: J */
    public int f211661J = -1;

    /* renamed from: K */
    public C76803c f211662K;

    /* renamed from: L */
    public C76805e f211663L;

    /* renamed from: com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference$a */
    public interface C72740a {
        /* renamed from: a */
        void mo5953a(ViewGroup viewGroup, View view, int i);

        /* renamed from: b */
        void mo5954b(ViewGroup viewGroup, View view, int i);

        /* renamed from: c */
        void mo5955c(ViewGroup viewGroup, View view, int i);

        /* renamed from: d */
        void mo5956d(ViewGroup viewGroup, View view, int i);

        /* renamed from: e */
        void mo5957e(ViewGroup viewGroup, View view, int i);
    }

    public ContactListExpandPreference(Context context, int i) {
        super(context);
        if (i == 0) {
            mo100299I();
        } else if (i == 1) {
            this.f211661J = 1;
            this.f211663L = ((C76808f) C86312j.m106911c(C76808f.class)).qq0();
        }
        this.f121271G = C0966R.C0971layout.bd_;
    }

    /* renamed from: I */
    public final void mo100299I() {
        this.f211661J = 0;
        this.f211662K = ((C76808f) C86312j.m106911c(C76808f.class)).wv0(this.f121274d);
    }

    /* renamed from: J */
    public void mo100300J() {
        C76803c cVar = this.f211662K;
        if (cVar != null) {
            C78565f0 f0Var = ((C72741a) cVar).f211670g;
            f0Var.f230144h = false;
            f0Var.mo108547f();
        }
    }

    /* renamed from: K */
    public void mo100301K(String str, List<String> list) {
        C76803c cVar = this.f211662K;
        if (cVar != null) {
            C72741a aVar = (C72741a) cVar;
            aVar.f211674k = str;
            if (list == null) {
                list = new ArrayList<>(0);
            }
            C78565f0 f0Var = aVar.f211670g;
            f0Var.f230158y = true;
            f0Var.f230141e = list;
            aVar.mo100308a(str);
        }
    }

    /* renamed from: L */
    public void mo100302L(C47511g gVar, String str) {
        C76803c cVar = this.f211662K;
        if (cVar != null) {
            C72741a aVar = (C72741a) cVar;
            aVar.getClass();
            if (gVar != null && str != null) {
                aVar.f211665b = gVar;
                aVar.f211666c = str;
                gVar.mo72529n(str, true);
            }
        }
    }

    /* renamed from: M */
    public void mo100303M(List<String> list) {
        C76803c cVar = this.f211662K;
        if (cVar != null) {
            C78565f0 f0Var = ((C72741a) cVar).f211670g;
            f0Var.f230158y = true;
            f0Var.f230141e = list;
            f0Var.mo108547f();
        }
    }

    /* renamed from: N */
    public ContactListExpandPreference mo100304N(boolean z) {
        C76803c cVar = this.f211662K;
        if (cVar != null) {
            ((C72741a) cVar).f211670g.f230156w = z;
        }
        return this;
    }

    /* renamed from: P */
    public ContactListExpandPreference mo100305P(boolean z) {
        C76803c cVar = this.f211662K;
        if (cVar != null) {
            ((C72741a) cVar).f211670g.f230155v = z;
        }
        return this;
    }

    /* renamed from: R */
    public void mo100306R(boolean z) {
        C76803c cVar = this.f211662K;
        if (cVar != null) {
            ((C72741a) cVar).mo100310c(z);
        }
        C76805e eVar = this.f211663L;
        if (eVar != null) {
            ((C78569g0) eVar).f230174e = z;
        }
    }

    /* renamed from: S */
    public void mo100307S(C72740a aVar) {
        C76803c cVar = this.f211662K;
        if (cVar != null) {
            ((C72741a) cVar).f211673j = aVar;
        }
    }

    /* renamed from: v */
    public void mo69931v() {
        C76803c cVar = this.f211662K;
        if (cVar != null) {
            ((C72741a) cVar).mo100309b();
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        View view2;
        if (this.f211661J == 1) {
            C78569g0 g0Var = (C78569g0) this.f211663L;
            g0Var.f230175f = view;
            ViewGroup viewGroup = view.getId() == C0966R.C0970id.bpc ? (ViewGroup) view : (ViewGroup) view.findViewById(C0966R.C0970id.bpc);
            int i = g0Var.f230171b;
            if (i == 0) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getResources().getDimensionPixelSize(C0966R.dimen.f3905if), viewGroup.getPaddingRight(), viewGroup.getResources().getDimensionPixelSize(C0966R.dimen.f3913iq));
            } else if (i == (g0Var.f230170a.getCount() / C78565f0.f230133H) - 1) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getResources().getDimensionPixelSize(C0966R.dimen.f3905if));
            } else {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getResources().getDimensionPixelSize(C0966R.dimen.f3913iq), viewGroup.getPaddingRight(), viewGroup.getResources().getDimensionPixelSize(C0966R.dimen.f3913iq));
            }
            C78565f0 f0Var = g0Var.f230170a;
            int i2 = f0Var.f230153t;
            int i3 = C78565f0.f230133H;
            int i4 = i2 % i3;
            if ((i4 == i3 - 1 || i4 == 0) && g0Var.f230173d && g0Var.f230171b == (f0Var.getCount() / C78565f0.f230133H) - 1) {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), 0);
            } else if (!g0Var.f230173d) {
                C78565f0 f0Var2 = g0Var.f230170a;
                if (f0Var2.f230153t % C78565f0.f230133H == 0 && g0Var.f230171b == (f0Var2.getCount() / C78565f0.f230133H) - 1) {
                    viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), (int) viewGroup.getContext().getResources().getDimension(C0966R.dimen.f3956le));
                }
            }
            if (g0Var.f230170a != null) {
                viewGroup.setOnClickListener(g0Var.f230178i);
                if (viewGroup.getChildCount() > C78565f0.f230133H) {
                    viewGroup.removeViews(0, viewGroup.getChildCount() - C78565f0.f230133H);
                    viewGroup.requestLayout();
                }
                for (int i5 = 0; i5 < g0Var.f230172c; i5++) {
                    if (viewGroup.getChildAt(i5) == null) {
                        view2 = View.inflate(viewGroup.getContext(), C0966R.C0971layout.btx, (ViewGroup) null);
                        viewGroup.addView(view2);
                    } else {
                        view2 = viewGroup.getChildAt(i5);
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 49;
                    if (C78565f0.f230133H == 4) {
                        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6);
                        layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
                    } else {
                        int dimensionPixelSize2 = viewGroup.getResources().getDimensionPixelSize(C0966R.dimen.f3913iq);
                        layoutParams.setMargins(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
                    }
                    C78565f0 f0Var3 = g0Var.f230170a;
                    if (!(f0Var3.f230146j ? f0Var3.f230148o : C72996z1.m85820U5(f0Var3.f230135B)) && g0Var.f230170a.f230153t == 1) {
                        int dimensionPixelSize3 = viewGroup.getResources().getDimensionPixelSize(C0966R.dimen.f3633r);
                        layoutParams.setMargins(dimensionPixelSize3, 0, dimensionPixelSize3, 0);
                    }
                    view2.setLayoutParams(layoutParams);
                    int i6 = (g0Var.f230171b * g0Var.f230172c) + i5;
                    g0Var.f230170a.getView(i6, view2, viewGroup);
                    if (g0Var.f230176g != null) {
                        view2.setOnClickListener(new C78570h0(g0Var, viewGroup, i6));
                    }
                    if (g0Var.f230177h != null) {
                        view2.setOnLongClickListener(new C78571i0(g0Var, viewGroup, i6));
                    }
                    AvatarPatTipImageView avatarPatTipImageView = (AvatarPatTipImageView) view2.findViewById(C0966R.C0970id.iwa);
                    avatarPatTipImageView.setOnDoubleClickListener(new C78572j0(g0Var));
                    avatarPatTipImageView.setOnClickListener(new C78573k0(g0Var, viewGroup, i6));
                }
                C78565f0 f0Var4 = g0Var.f230170a;
                if ((f0Var4.f230146j ? f0Var4.f230148o : C72996z1.m85820U5(f0Var4.f230135B)) || g0Var.f230170a.f230153t > 1) {
                    ((LinearLayout) viewGroup).setGravity(17);
                } else {
                    ((LinearLayout) viewGroup).setGravity(19);
                }
            }
        }
        super.mo1086w(view);
    }

    public ContactListExpandPreference(Context context) {
        super(context);
        mo100299I();
        this.f121271G = C0966R.C0971layout.bd_;
    }

    public ContactListExpandPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo100299I();
        this.f121271G = C0966R.C0971layout.bd_;
    }

    public ContactListExpandPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo100299I();
        this.f121271G = C0966R.C0971layout.bd_;
    }
}
