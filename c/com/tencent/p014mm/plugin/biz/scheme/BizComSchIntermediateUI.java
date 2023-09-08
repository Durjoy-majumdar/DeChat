package com.tencent.p014mm.plugin.biz.scheme;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.coroutines.LifecycleScopeExtKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f14.C58901s;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hw0.C46122a;
import hw0.C46123b;
import hw0.C8824d;
import iw0.C46291b;
import iw0.C46292c;
import iw0.C46293d;
import iw0.C46295e;
import iw0.C46296f;
import iw0.C46297g;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import pe3.C89349b;
import qo3.C89779i0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C110826x0;
import te3.C51009qt;
import te3.C51294st;
import wx3.C15601d;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-biz_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI */
public final class BizComSchIntermediateUI extends MMActivity {

    /* renamed from: v */
    public static final /* synthetic */ int f108994v = 0;

    /* renamed from: d */
    public final String f108995d = "MicroMsg.BizComSchIntermediateUI";

    /* renamed from: e */
    public final C8824d f108996e = new C8824d();

    /* renamed from: f */
    public boolean f108997f;

    /* renamed from: g */
    public boolean f108998g;

    /* renamed from: h */
    public C89779i0 f108999h;

    /* renamed from: i */
    public String f109000i;

    /* renamed from: j */
    public final C13601g f109001j = C36568h.m40985a(new C40589e(this));

    /* renamed from: n */
    public final C13601g f109002n = C36568h.m40985a(new C40592h(this));

    /* renamed from: o */
    public final C13601g f109003o = C36568h.m40985a(new C40591g(this));

    /* renamed from: p */
    public final C13601g f109004p = C36568h.m40985a(new C40590f(this));

    /* renamed from: q */
    public final C13601g f109005q = C36568h.m40985a(new C40585a(this));

    /* renamed from: r */
    public final C13601g f109006r = C36568h.m40985a(new C40594j(this));

    /* renamed from: s */
    public final C13601g f109007s = C36568h.m40985a(new C40595k(this));

    /* renamed from: t */
    public final C13601g f109008t = C36568h.m40985a(new C40588d(this));

    /* renamed from: u */
    public final C13601g f109009u = C36568h.m40985a(new C40593i(this));

    /* renamed from: com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI$a */
    public static final class C40585a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ BizComSchIntermediateUI f109010d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40585a(BizComSchIntermediateUI bizComSchIntermediateUI) {
            super(0);
            this.f109010d = bizComSchIntermediateUI;
        }

        public Object invoke() {
            return this.f109010d.findViewById(C0966R.C0970id.aan);
        }
    }

    /* renamed from: com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI$b */
    public static final class C40586b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BizComSchIntermediateUI f109011d;

        public C40586b(BizComSchIntermediateUI bizComSchIntermediateUI) {
            this.f109011d = bizComSchIntermediateUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI$go2UnknownPage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BizComSchIntermediateUI bizComSchIntermediateUI = this.f109011d;
            int i = BizComSchIntermediateUI.f108994v;
            bizComSchIntermediateUI.mo63448O7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI$go2UnknownPage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI$c */
    public static final class C40587c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C51009qt f109012d;

        /* renamed from: e */
        public final /* synthetic */ BizComSchIntermediateUI f109013e;

        /* renamed from: f */
        public final /* synthetic */ C51294st f109014f;

        public C40587c(C51009qt qtVar, BizComSchIntermediateUI bizComSchIntermediateUI, C51294st stVar) {
            this.f109012d = qtVar;
            this.f109013e = bizComSchIntermediateUI;
            this.f109014f = stVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI$initBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int i = this.f109012d.f140533d;
            if (i == 2) {
                BizComSchIntermediateUI.m43818H7(this.f109013e, this.f109014f);
            } else if (i == 1) {
                BizComSchIntermediateUI bizComSchIntermediateUI = this.f109013e;
                int i2 = BizComSchIntermediateUI.f108994v;
                bizComSchIntermediateUI.mo63448O7();
            } else {
                this.f109013e.mo63447N7();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI$initBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI$d */
    public static final class C40588d extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ BizComSchIntermediateUI f109015d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40588d(BizComSchIntermediateUI bizComSchIntermediateUI) {
            super(0);
            this.f109015d = bizComSchIntermediateUI;
        }

        public Object invoke() {
            return (Button) this.f109015d.findViewById(C0966R.C0970id.afh);
        }
    }

    /* renamed from: com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI$e */
    public static final class C40589e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ BizComSchIntermediateUI f109016d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40589e(BizComSchIntermediateUI bizComSchIntermediateUI) {
            super(0);
            this.f109016d = bizComSchIntermediateUI;
        }

        public Object invoke() {
            return this.f109016d.findViewById(C0966R.C0970id.afd);
        }
    }

    /* renamed from: com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI$f */
    public static final class C40590f extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ BizComSchIntermediateUI f109017d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40590f(BizComSchIntermediateUI bizComSchIntermediateUI) {
            super(0);
            this.f109017d = bizComSchIntermediateUI;
        }

        public Object invoke() {
            return (TextView) this.f109017d.findViewById(C0966R.C0970id.afe);
        }
    }

    /* renamed from: com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI$g */
    public static final class C40591g extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ BizComSchIntermediateUI f109018d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40591g(BizComSchIntermediateUI bizComSchIntermediateUI) {
            super(0);
            this.f109018d = bizComSchIntermediateUI;
        }

        public Object invoke() {
            return (TextView) this.f109018d.findViewById(C0966R.C0970id.afg);
        }
    }

    /* renamed from: com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI$h */
    public static final class C40592h extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ BizComSchIntermediateUI f109019d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40592h(BizComSchIntermediateUI bizComSchIntermediateUI) {
            super(0);
            this.f109019d = bizComSchIntermediateUI;
        }

        public Object invoke() {
            return (ImageView) this.f109019d.findViewById(C0966R.C0970id.amq);
        }
    }

    /* renamed from: com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI$i */
    public static final class C40593i extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ BizComSchIntermediateUI f109020d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40593i(BizComSchIntermediateUI bizComSchIntermediateUI) {
            super(0);
            this.f109020d = bizComSchIntermediateUI;
        }

        public Object invoke() {
            return (Button) this.f109020d.findViewById(C0966R.C0970id.afi);
        }
    }

    /* renamed from: com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI$j */
    public static final class C40594j extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ BizComSchIntermediateUI f109021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40594j(BizComSchIntermediateUI bizComSchIntermediateUI) {
            super(0);
            this.f109021d = bizComSchIntermediateUI;
        }

        public Object invoke() {
            return (Button) this.f109021d.findViewById(C0966R.C0970id.aff);
        }
    }

    /* renamed from: com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI$k */
    public static final class C40595k extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ BizComSchIntermediateUI f109022d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40595k(BizComSchIntermediateUI bizComSchIntermediateUI) {
            super(0);
            this.f109022d = bizComSchIntermediateUI;
        }

        public Object invoke() {
            return this.f109022d.findViewById(C0966R.C0970id.amp);
        }
    }

    /* renamed from: H7 */
    public static final void m43818H7(BizComSchIntermediateUI bizComSchIntermediateUI, C51294st stVar) {
        Log.m105924i(bizComSchIntermediateUI.f108995d, "canPass");
        int i = stVar.f141731d;
        C46292c fVar = i == 2 ? new C46296f() : i == 1 ? new C46297g() : i == 3 ? new C46291b() : i == 4 ? new C46293d() : new C46295e();
        C89349b bVar = stVar.f141732e;
        C87412m.m108593f(bVar, "resp.action_buffer");
        boolean a = fVar.mo71703a(bizComSchIntermediateUI, bVar, stVar.f141733f, stVar.f141734g);
        if (!a) {
            bizComSchIntermediateUI.mo63447N7();
        }
        String str = bizComSchIntermediateUI.f108995d;
        Log.m105924i(str, "handler is " + fVar.getClass().getName() + ", ret = " + a);
    }

    /* renamed from: I7 */
    public static final void m43819I7(BizComSchIntermediateUI bizComSchIntermediateUI, C51294st stVar) {
        Log.m105924i(bizComSchIntermediateUI.f108995d, "needToBlock");
        C89779i0 i0Var = bizComSchIntermediateUI.f108999h;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (Util.isNullOrNil(stVar.f141735h.f139945f) && Util.isNullOrNil(stVar.f141735h.f139946g)) {
            Log.m105924i(bizComSchIntermediateUI.f108995d, "title and desc empty");
            bizComSchIntermediateUI.mo63447N7();
        } else if (Util.isNullOrNil((List) stVar.f141735h.f139947h)) {
            Log.m105924i(bizComSchIntermediateUI.f108995d, "antispam_button empty");
            bizComSchIntermediateUI.mo63447N7();
        } else if (stVar.f141735h.f139947h.size() > 2) {
            Log.m105924i(bizComSchIntermediateUI.f108995d, "antispam_button.size > 2");
            bizComSchIntermediateUI.mo63447N7();
        } else {
            LinkedList<C51009qt> linkedList = stVar.f141735h.f139947h;
            C87412m.m108593f(linkedList, "resp.antispam.antispam_button");
            for (T t : C110818d0.m150947s0(linkedList, 2)) {
                if (Util.isNullOrNil(t.f140534e)) {
                    Log.m105924i(bizComSchIntermediateUI.f108995d, "btn content is empty!");
                    bizComSchIntermediateUI.mo63447N7();
                    return;
                }
            }
            bizComSchIntermediateUI.mo63445L7().setText(stVar.f141735h.f139945f);
            bizComSchIntermediateUI.mo63444K7().setText(stVar.f141735h.f139946g);
            LinkedList<C51009qt> linkedList2 = stVar.f141735h.f139947h;
            C87412m.m108593f(linkedList2, "resp.antispam.antispam_button");
            List<T> s0 = C110818d0.m150947s0(linkedList2, 2);
            if (s0.size() > 1) {
                Object value = ((C36570n) bizComSchIntermediateUI.f109007s).getValue();
                C87412m.m108593f(value, "<get-twinsBtnContainer>(...)");
                Object value2 = ((C36570n) bizComSchIntermediateUI.f109008t).getValue();
                C87412m.m108593f(value2, "<get-leftBtn>(...)");
                Object value3 = ((C36570n) bizComSchIntermediateUI.f109009u).getValue();
                C87412m.m108593f(value3, "<get-rightBtn>(...)");
                bizComSchIntermediateUI.mo63451R7(bizComSchIntermediateUI.mo63443J7(), bizComSchIntermediateUI.mo63445L7(), bizComSchIntermediateUI.mo63444K7(), (View) value, (Button) value2, (Button) value3);
                Object value4 = ((C36570n) bizComSchIntermediateUI.f109008t).getValue();
                C87412m.m108593f(value4, "<get-leftBtn>(...)");
                T t2 = s0.get(0);
                C87412m.m108593f(t2, "buttonList[0]");
                bizComSchIntermediateUI.mo63449P7((Button) value4, (C51009qt) t2, stVar);
                Object value5 = ((C36570n) bizComSchIntermediateUI.f109009u).getValue();
                C87412m.m108593f(value5, "<get-rightBtn>(...)");
                T t3 = s0.get(1);
                C87412m.m108593f(t3, "buttonList[1]");
                bizComSchIntermediateUI.mo63449P7((Button) value5, (C51009qt) t3, stVar);
                return;
            }
            bizComSchIntermediateUI.mo63451R7(bizComSchIntermediateUI.mo63443J7(), bizComSchIntermediateUI.mo63445L7(), bizComSchIntermediateUI.mo63444K7(), bizComSchIntermediateUI.mo63446M7());
            Button M7 = bizComSchIntermediateUI.mo63446M7();
            Object L = C110818d0.m150914L(s0);
            C87412m.m108593f(L, "buttonList.first()");
            bizComSchIntermediateUI.mo63449P7(M7, (C51009qt) L, stVar);
        }
    }

    /* renamed from: J7 */
    public final View mo63443J7() {
        Object value = ((C36570n) this.f109001j).getValue();
        C87412m.m108593f(value, "<get-pageContainer>(...)");
        return (View) value;
    }

    /* renamed from: K7 */
    public final TextView mo63444K7() {
        Object value = ((C36570n) this.f109004p).getValue();
        C87412m.m108593f(value, "<get-pageDescTv>(...)");
        return (TextView) value;
    }

    /* renamed from: L7 */
    public final TextView mo63445L7() {
        Object value = ((C36570n) this.f109003o).getValue();
        C87412m.m108593f(value, "<get-pageTitleTv>(...)");
        return (TextView) value;
    }

    /* renamed from: M7 */
    public final Button mo63446M7() {
        Object value = ((C36570n) this.f109006r).getValue();
        C87412m.m108593f(value, "<get-singleBtn>(...)");
        return (Button) value;
    }

    /* renamed from: N7 */
    public final void mo63447N7() {
        Log.m105924i(this.f108995d, "go2UnknownPage");
        C89779i0 i0Var = this.f108999h;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        mo63451R7(mo63443J7(), mo63444K7(), mo63446M7());
        mo63444K7().setText(getContext().getResources().getString(C0966R.string.mup));
        mo63446M7().setText(getContext().getResources().getString(C0966R.string.f7367e4));
        mo63446M7().setOnClickListener(new C40586b(this));
    }

    /* renamed from: O7 */
    public final void mo63448O7() {
        moveTaskToBack(true);
        C89779i0 i0Var = this.f108999h;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        finish();
    }

    /* renamed from: P7 */
    public final void mo63449P7(Button button, C51009qt qtVar, C51294st stVar) {
        String str = this.f108995d;
        Log.m105924i(str, "btn text = " + qtVar.f140534e + ", btn type = " + qtVar.f140533d);
        button.setText(qtVar.f140534e);
        button.setOnClickListener(new C40587c(qtVar, this, stVar));
    }

    /* renamed from: Q7 */
    public final void mo63450Q7(boolean z) {
        if (z) {
            Object value = ((C36570n) this.f109002n).getValue();
            C87412m.m108593f(value, "<get-pageWarningIcon>(...)");
            ViewGroup.LayoutParams layoutParams = ((ImageView) value).getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams).topMargin = C76577a.m92151b(getContext(), 20);
            Object value2 = ((C36570n) this.f109005q).getValue();
            C87412m.m108593f(value2, "<get-btnContainer>(...)");
            ViewGroup.LayoutParams layoutParams2 = ((View) value2).getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams2).bottomMargin = C76577a.m92151b(getContext(), 20);
            return;
        }
        Object value3 = ((C36570n) this.f109002n).getValue();
        C87412m.m108593f(value3, "<get-pageWarningIcon>(...)");
        ViewGroup.LayoutParams layoutParams3 = ((ImageView) value3).getLayoutParams();
        C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams3).topMargin = C76577a.m92151b(getContext(), 80);
        Object value4 = ((C36570n) this.f109005q).getValue();
        C87412m.m108593f(value4, "<get-btnContainer>(...)");
        ViewGroup.LayoutParams layoutParams4 = ((View) value4).getLayoutParams();
        C87412m.m108592e(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams4).bottomMargin = C76577a.m92151b(getContext(), 96);
    }

    /* renamed from: R7 */
    public final void mo63451R7(View... viewArr) {
        Object value = ((C36570n) this.f109007s).getValue();
        C87412m.m108593f(value, "<get-twinsBtnContainer>(...)");
        Object value2 = ((C36570n) this.f109008t).getValue();
        C87412m.m108593f(value2, "<get-leftBtn>(...)");
        Object value3 = ((C36570n) this.f109009u).getValue();
        C87412m.m108593f(value3, "<get-rightBtn>(...)");
        Set c = C110826x0.m151015c(mo63443J7(), mo63445L7(), mo63444K7(), mo63446M7(), (View) value, (Button) value2, (Button) value3);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : c) {
            if (C110823p.m151009y(viewArr, (View) next)) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI", "showThem", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI", "showThem", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            View view3 = (View) it4.next();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI", "showThem", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI", "showThem", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6587wx;
    }

    public void onBackPressed() {
        mo63448O7();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        mo63450Q7(configuration.orientation == 2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2929c));
        setBackBtn(new C46122a(this));
        View J7 = mo63443J7();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(J7, aVar.mo10232b(), "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z = false;
        J7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(J7, "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        String stringExtra = getIntent().getStringExtra("biz_common_scheme_url");
        this.f109000i = stringExtra;
        String str = this.f108995d;
        Log.m105924i(str, "check url = " + stringExtra);
        if (!Util.isNullOrNil(stringExtra)) {
            C87412m.m108591d(stringExtra);
            if (C112551y.m153819s(stringExtra, "weixin://biz/", false) && stringExtra.length() > 13) {
                z = true;
            }
        }
        if (!z) {
            mo63447N7();
            return;
        }
        String str2 = this.f109000i;
        C87412m.m108591d(str2);
        C0000n0 lifecycleScope = LifecycleScopeExtKt.getLifecycleScope((AppCompatActivity) this);
        C53896h0 h0Var = C53872d1.f151117a;
        C53895h.m60466d(lifecycleScope, C58901s.f168555a, (C53934p0) null, new C46123b(this, str2, (C15601d<? super C46123b>) null), 2, (Object) null);
    }

    public void onResume() {
        String str = this.f108995d;
        Log.m105924i(str, "onResume() " + hashCode());
        super.onResume();
        mo63450Q7(getContext().getResources().getConfiguration().orientation == 2);
        if (this.f108997f && !this.f108998g) {
            mo63448O7();
        }
    }

    public void onStart() {
        String str = this.f108995d;
        Log.m105924i(str, "onStart() " + hashCode());
        super.onStart();
        if (this.f108997f && !this.f108998g) {
            mo63448O7();
        }
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
        this.f108997f = true;
    }

    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
        this.f108997f = true;
    }
}
