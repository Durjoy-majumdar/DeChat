package com.tencent.p014mm.plugin.teenmode.p111ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tmassistantsdk.downloadservice.Downloads;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import ky2.C10432i;
import ky2.C10438n;
import ky2.C10439o;
import ly2.C10677l;
import my2.C11097d;
import my2.C11098e;
import nj3.C76879j;
import nr3.C89059e;
import ny2.C11308c;
import ny2.C11309d;
import o40.C61926c;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/BindGuardianMsgUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lky2/o;", "<init>", "()V", "plugin-teenmode_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI */
public final class BindGuardianMsgUI extends MMActivity implements C10439o {

    /* renamed from: p */
    public static final /* synthetic */ int f21421p = 0;

    /* renamed from: d */
    public final C13601g f21422d = C36568h.m40985a(new C5560k(this));

    /* renamed from: e */
    public final C13601g f21423e = C36568h.m40985a(new C5562m(this));

    /* renamed from: f */
    public final C13601g f21424f = C36568h.m40985a(new C5553d(this));

    /* renamed from: g */
    public final C13601g f21425g = C36568h.m40985a(new C5550a(this));

    /* renamed from: h */
    public final C13601g f21426h = C36568h.m40985a(new C5554e(this));

    /* renamed from: i */
    public final C13601g f21427i = C36568h.m40985a(new C5551b(this));

    /* renamed from: j */
    public final C13601g f21428j = C36568h.m40985a(new C5552c(this));

    /* renamed from: n */
    public final C13601g f21429n = C36568h.m40985a(new C5561l(this));

    /* renamed from: o */
    public final C13601g f21430o = C36568h.m40985a(new C5559j(this));

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI$a */
    public static final class C5550a extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianMsgUI f21431d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5550a(BindGuardianMsgUI bindGuardianMsgUI) {
            super(0);
            this.f21431d = bindGuardianMsgUI;
        }

        public Object invoke() {
            return (Button) this.f21431d.findViewById(C0966R.C0970id.a95);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI$b */
    public static final class C5551b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianMsgUI f21432d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5551b(BindGuardianMsgUI bindGuardianMsgUI) {
            super(0);
            this.f21432d = bindGuardianMsgUI;
        }

        public Object invoke() {
            return this.f21432d.getIntent().getStringExtra("intent_extra_bind_guardian_username");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI$c */
    public static final class C5552c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianMsgUI f21433d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5552c(BindGuardianMsgUI bindGuardianMsgUI) {
            super(0);
            this.f21433d = bindGuardianMsgUI;
        }

        public Object invoke() {
            return this.f21433d.getIntent().getStringExtra("intent_extra_bind_ward_username");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI$d */
    public static final class C5553d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianMsgUI f21434d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5553d(BindGuardianMsgUI bindGuardianMsgUI) {
            super(0);
            this.f21434d = bindGuardianMsgUI;
        }

        public Object invoke() {
            return (TextView) this.f21434d.findViewById(C0966R.C0970id.a_e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI$e */
    public static final class C5554e extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianMsgUI f21435d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5554e(BindGuardianMsgUI bindGuardianMsgUI) {
            super(0);
            this.f21435d = bindGuardianMsgUI;
        }

        public Object invoke() {
            return (Button) this.f21435d.findViewById(C0966R.C0970id.a0y);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI$f */
    public static final class C5555f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianMsgUI f21436d;

        public C5555f(BindGuardianMsgUI bindGuardianMsgUI) {
            this.f21436d = bindGuardianMsgUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f21436d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI$g */
    public static final class C5556g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianMsgUI f21437d;

        public C5556g(BindGuardianMsgUI bindGuardianMsgUI) {
            this.f21437d = bindGuardianMsgUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/BindGuardianMsgUI$onCreate$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BindGuardianMsgUI bindGuardianMsgUI = this.f21437d;
            C89779i0 Q = C76879j.m92723Q(bindGuardianMsgUI, "", bindGuardianMsgUI.getContext().getString(C0966R.string.a2w), true, false, (DialogInterface.OnCancelListener) null);
            ((TextView) bindGuardianMsgUI.findViewById(C0966R.C0970id.ckx)).setVisibility(8);
            String I7 = bindGuardianMsgUI.mo6583I7();
            C87412m.m108591d(I7);
            String str = (String) ((C36570n) bindGuardianMsgUI.f21429n).getValue();
            C87412m.m108591d(str);
            C89059e i = new C10677l(I7, str).mo9225i();
            i.mo11397F(bindGuardianMsgUI);
            i.mo123062e(new C11309d(Q, bindGuardianMsgUI));
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/BindGuardianMsgUI$onCreate$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI$h */
    public static final class C5557h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianMsgUI f21438d;

        public C5557h(BindGuardianMsgUI bindGuardianMsgUI) {
            this.f21438d = bindGuardianMsgUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/BindGuardianMsgUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f21438d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/BindGuardianMsgUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI$i */
    public static final class C5558i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianMsgUI f21439d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5558i(BindGuardianMsgUI bindGuardianMsgUI) {
            super(0);
            this.f21439d = bindGuardianMsgUI;
        }

        public Object invoke() {
            this.f21439d.mo6588N7();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI$j */
    public static final class C5559j extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianMsgUI f21440d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5559j(BindGuardianMsgUI bindGuardianMsgUI) {
            super(0);
            this.f21440d = bindGuardianMsgUI;
        }

        public Object invoke() {
            return Long.valueOf(this.f21440d.getIntent().getLongExtra("intent_extra_request_time", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI$k */
    public static final class C5560k extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianMsgUI f21441d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5560k(BindGuardianMsgUI bindGuardianMsgUI) {
            super(0);
            this.f21441d = bindGuardianMsgUI;
        }

        public Object invoke() {
            return (WeImageView) this.f21441d.findViewById(C0966R.C0970id.a_g);
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI$l */
    public static final class C5561l extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianMsgUI f21442d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5561l(BindGuardianMsgUI bindGuardianMsgUI) {
            super(0);
            this.f21442d = bindGuardianMsgUI;
        }

        public Object invoke() {
            return this.f21442d.getIntent().getStringExtra("intent_extra_bind_ticket");
        }
    }

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI$m */
    public static final class C5562m extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianMsgUI f21443d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5562m(BindGuardianMsgUI bindGuardianMsgUI) {
            super(0);
            this.f21443d = bindGuardianMsgUI;
        }

        public Object invoke() {
            return (TextView) this.f21443d.findViewById(C0966R.C0970id.a_f);
        }
    }

    /* renamed from: H7 */
    public final Button mo6582H7() {
        return (Button) ((C36570n) this.f21425g).getValue();
    }

    /* renamed from: I7 */
    public final String mo6583I7() {
        return (String) ((C36570n) this.f21428j).getValue();
    }

    /* renamed from: J7 */
    public final TextView mo6584J7() {
        return (TextView) ((C36570n) this.f21424f).getValue();
    }

    /* renamed from: K7 */
    public final Button mo6585K7() {
        return (Button) ((C36570n) this.f21426h).getValue();
    }

    /* renamed from: L7 */
    public final WeImageView mo6586L7() {
        return (WeImageView) ((C36570n) this.f21422d).getValue();
    }

    /* renamed from: M7 */
    public final TextView mo6587M7() {
        return (TextView) ((C36570n) this.f21423e).getValue();
    }

    /* renamed from: N7 */
    public final void mo6588N7() {
        C11308c cVar = C11308c.EXPIRED;
        Class cls = C10432i.class;
        C11098e eVar = C11098e.f32878a;
        C11097d dVar = (C11097d) ((C36570n) C11098e.f32881d).getValue();
        String str = (String) ((C36570n) this.f21429n).getValue();
        C87412m.m108591d(str);
        dVar.getClass();
        C10438n nVar = new C10438n();
        nVar.field_ticket = str;
        dVar.get(nVar, "ticket");
        if (C75592q0.m90789s().equals(mo6583I7())) {
            if (nVar.field_time > 0) {
                String str2 = (String) ((C36570n) this.f21427i).getValue();
                C72996z1 BD = ((C10432i) C86312j.m106911c(cls)).mo10736BD();
                cVar = C112551y.m153810j(str2, BD != null ? BD.getUsername() : null, false, 2, (Object) null) ? C11308c.WARD_BINDED : C11308c.WARD_REMOVE;
            } else {
                long longValue = ((Number) ((C36570n) this.f21430o).getValue()).longValue();
                long j = (long) Downloads.MAX_RETYR_AFTER;
                if (longValue / j == C31543z5.m39453c() / j) {
                    cVar = C11308c.WARD_UNBIND;
                }
            }
        } else if (nVar.field_time > 0) {
            cVar = ((C10432i) C86312j.m106911c(cls)).xm0(mo6583I7()) ? C11308c.GUARDIAN_BINDED : C11308c.GUARDIAN_REMOVE;
        } else {
            long longValue2 = ((Number) ((C36570n) this.f21430o).getValue()).longValue();
            long j2 = (long) Downloads.MAX_RETYR_AFTER;
            if (longValue2 / j2 == C31543z5.m39453c() / j2) {
                cVar = C11308c.GUARDIAN_UNBIND;
            }
        }
        switch (cVar.ordinal()) {
            case 0:
                mo6586L7().mo104518r(C0966R.raw.icons_filled_time, C0966R.color.f2933h);
                mo6587M7().setText(C0966R.string.jwj);
                mo6584J7().setVisibility(8);
                mo6582H7().setVisibility(8);
                mo6585K7().setVisibility(0);
                return;
            case 1:
                mo6586L7().mo104518r(C0966R.raw.icons_filled_done2, C0966R.color.akw);
                mo6587M7().setText(C0966R.string.jwb);
                mo6584J7().setVisibility(8);
                mo6582H7().setVisibility(8);
                mo6585K7().setVisibility(0);
                return;
            case 2:
                mo6586L7().mo104518r(C0966R.raw.icons_outlined_umbrella, C0966R.color.akw);
                mo6587M7().setText(C0966R.string.jwc);
                TextView J7 = mo6584J7();
                J7.setVisibility(0);
                J7.setText(getString(C0966R.string.jw7, new Object[]{C45628s0.m50782k(mo6583I7()).mo62898f()}));
                mo6582H7().setVisibility(0);
                mo6585K7().setVisibility(8);
                return;
            case 3:
                mo6586L7().mo104518r(C0966R.raw.icons_filled_done2, C0966R.color.akw);
                mo6587M7().setText(C0966R.string.jwa);
                mo6584J7().setVisibility(8);
                mo6582H7().setVisibility(8);
                mo6585K7().setVisibility(0);
                return;
            case 4:
                mo6586L7().mo104518r(C0966R.raw.icons_filled_error, C0966R.color.f2976b7);
                mo6587M7().setText(C0966R.string.jw9);
                TextView J72 = mo6584J7();
                J72.setVisibility(0);
                J72.setText(C0966R.string.jw9);
                mo6582H7().setVisibility(8);
                mo6585K7().setVisibility(0);
                return;
            case 5:
                mo6586L7().mo104518r(C0966R.raw.icons_filled_error, C0966R.color.f2976b7);
                mo6587M7().setText(C0966R.string.jwi);
                mo6584J7().setVisibility(8);
                mo6582H7().setVisibility(8);
                mo6585K7().setVisibility(0);
                return;
            case 6:
                mo6586L7().mo104518r(C0966R.raw.icons_filled_error, C0966R.color.f2976b7);
                mo6587M7().setText(C0966R.string.jwh);
                mo6584J7().setVisibility(8);
                mo6582H7().setVisibility(8);
                mo6585K7().setVisibility(0);
                return;
            default:
                return;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c8m;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        initView();
        setBackBtn(new C5555f(this));
        mo6582H7().setOnClickListener(new C5556g(this));
        mo6585K7().setOnClickListener(new C5557h(this));
        mo6588N7();
        ((C10432i) C86312j.m106911c(C10432i.class)).mo10739MV(this);
    }

    public void onDataChanged() {
        C61926c.m72668M(new C5558i(this));
    }

    public void onDestroy() {
        ((C10432i) C86312j.m106911c(C10432i.class)).mo10756rY(this);
        super.onDestroy();
    }
}
