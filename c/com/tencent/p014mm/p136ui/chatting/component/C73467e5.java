package com.tencent.p014mm.p136ui.chatting.component;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$j1;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p270xi.C53356d;
import zj3.C79348e;
import zj3.C79357g;
import zj3.C79387w;

/* renamed from: com.tencent.mm.ui.chatting.component.e5 */
public class C73467e5 extends C73412a implements C53356d {

    /* renamed from: e */
    public View f215875e;

    /* renamed from: f */
    public ViewGroup f215876f;

    /* renamed from: g */
    public boolean f215877g;

    /* renamed from: h */
    public boolean f215878h;

    /* renamed from: i */
    public ChatFooter$$j1 f215879i = new C73469b();

    /* renamed from: com.tencent.mm.ui.chatting.component.e5$a */
    public class C73468a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Boolean f215880d;

        public C73468a(Boolean bool) {
            this.f215880d = bool;
        }

        public void onClick(View view) {
            Class cls = C79387w.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/component/TipsBubbleComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f215880d.booleanValue()) {
                C73467e5 e5Var = C73467e5.this;
                Boolean bool = Boolean.TRUE;
                e5Var.mo102420Y5(bool, bool);
                ((C79387w) C73467e5.this.f215752d.f193278b.mo102812a(cls)).mo102193k1().mo100449s((View) null);
            } else {
                C73467e5.this.mo102420Y5(Boolean.TRUE, Boolean.FALSE);
                ((C79387w) C73467e5.this.f215752d.f193278b.mo102812a(cls)).mo102193k1().setMode(2);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/TipsBubbleComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.e5$b */
    public class C73469b implements ChatFooter$$j1 {
        public C73469b() {
        }

        /* renamed from: a */
        public void mo102423a(Boolean bool, Boolean bool2) {
            if (!bool.booleanValue()) {
                return;
            }
            if (bool2.booleanValue()) {
                C73467e5 e5Var = C73467e5.this;
                Boolean bool3 = Boolean.TRUE;
                e5Var.mo102420Y5(bool3, bool3);
                return;
            }
            C73467e5.this.mo102420Y5(Boolean.FALSE, Boolean.TRUE);
        }

        /* renamed from: b */
        public void mo102424b(Boolean bool, Boolean bool2) {
            if (!bool.booleanValue()) {
                return;
            }
            if (bool2.booleanValue()) {
                C73467e5.this.mo102420Y5(Boolean.TRUE, Boolean.FALSE);
                return;
            }
            C73467e5 e5Var = C73467e5.this;
            Boolean bool3 = Boolean.FALSE;
            e5Var.mo102420Y5(bool3, bool3);
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        Class cls = C79387w.class;
        if (C75592q0.m90762J().booleanValue()) {
            if (!this.f215752d.mo91574o().mo62916m3()) {
                boolean nullAsFalse = Util.nullAsFalse((Boolean) C97625j3.m125812b().mo105906u().mo119684e(340228, (Object) null));
                this.f215877g = nullAsFalse;
                if (!nullAsFalse) {
                    if (!((C79357g) this.f215752d.f193278b.mo102812a(C79357g.class)).mo102150S1()) {
                        if (!((C79348e) this.f215752d.f193278b.mo102812a(C79348e.class)).mo70079x5()) {
                            mo102421Z5(Boolean.TRUE);
                        }
                    }
                }
                this.f215878h = Util.nullAsFalse((Boolean) C97625j3.m125812b().mo105906u().mo119684e(340229, (Object) null));
                long currentTimeMillis = System.currentTimeMillis() - Util.nullAs((Long) C97625j3.m125812b().mo105906u().mo119684e(340240, (Object) null), 0);
                if (this.f215877g && !this.f215878h && currentTimeMillis >= 259200000) {
                    mo102421Z5(Boolean.FALSE);
                }
            }
            if (((C79387w) this.f215752d.f193278b.mo102812a(cls)).mo102193k1() != null) {
                ((C79387w) this.f215752d.f193278b.mo102812a(cls)).mo102193k1().setTipsShowCallback(this.f215879i);
            }
        }
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        if (!this.f215752d.mo91574o().mo62916m3() && C75592q0.m90762J().booleanValue()) {
            Boolean bool = Boolean.FALSE;
            mo102420Y5(bool, bool);
        }
    }

    /* renamed from: Y5 */
    public final void mo102420Y5(Boolean bool, Boolean bool2) {
        View view = this.f215875e;
        if (view != null) {
            view.clearAnimation();
            View view2 = this.f215875e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/TipsBubbleComponent", "removeTipsBubble", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/component/TipsBubbleComponent", "removeTipsBubble", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (bool2.booleanValue()) {
                if (bool.booleanValue()) {
                    C97625j3.m125812b().mo105906u().mo119676J(340228, Boolean.TRUE);
                    C115669n.INSTANCE.idkeyStat(232, 1, 1, false);
                }
            } else if (bool.booleanValue()) {
                C97625j3.m125812b().mo105906u().mo119676J(340229, Boolean.TRUE);
                C115669n.INSTANCE.idkeyStat(232, 2, 1, false);
            }
        }
    }

    /* renamed from: Z5 */
    public final void mo102421Z5(Boolean bool) {
        FrameLayout.LayoutParams layoutParams;
        View view;
        this.f215876f = (ViewGroup) this.f215752d.mo91562c(C0966R.C0970id.b49);
        View inflate = View.inflate(this.f215752d.mo91565f(), C0966R.C0971layout.bkx, (ViewGroup) null);
        this.f215875e = inflate;
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f358848he1);
        if (bool.booleanValue()) {
            textView.setText(this.f215752d.mo91565f().getString(C0966R.string.ilm));
            this.f215875e.setBackgroundResource(C0966R.C0969drawable.c9q);
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 85);
        } else {
            textView.setText(this.f215752d.mo91565f().getString(C0966R.string.ilq));
            this.f215875e.setBackgroundResource(C0966R.C0969drawable.c9p);
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 83);
        }
        ViewGroup viewGroup = this.f215876f;
        if (viewGroup != null && (view = this.f215875e) != null) {
            viewGroup.addView(view, layoutParams);
            this.f215875e.startAnimation(AnimationUtils.loadAnimation(this.f215752d.mo91565f(), C0966R.C0968anim.f2490ee));
            this.f215875e.setOnClickListener(new C73468a(bool));
        }
    }
}
