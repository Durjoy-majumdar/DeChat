package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.ReportAdClickEvent;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.FlowTextMixView;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import fy0.C8219i;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kf2.C46723f;
import kg3.C76577a;
import p214om.C11502f;
import p248ug.C52558c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49001ch;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.m */
public final class C42734m {

    /* renamed from: A */
    public final C13601g f115717A = C36568h.m40985a(new C42756v(this));

    /* renamed from: B */
    public final C13601g f115718B = C36568h.m40985a(new C42746l(this));

    /* renamed from: C */
    public final C13601g f115719C = C36568h.m40985a(new C42747m(this));

    /* renamed from: D */
    public final C13601g f115720D = C36568h.m40985a(new C42754t(this));

    /* renamed from: E */
    public final C13601g f115721E = C36568h.m40985a(new C42755u(this));

    /* renamed from: F */
    public final C13601g f115722F = C36568h.m40985a(new C42743i(this));

    /* renamed from: G */
    public final C13601g f115723G = C36568h.m40985a(new C42744j(this));

    /* renamed from: H */
    public final C13601g f115724H = C36568h.m40985a(new C42760z(this));

    /* renamed from: I */
    public C42713g f115725I;

    /* renamed from: a */
    public final View f115726a;

    /* renamed from: b */
    public final MMActivity f115727b;

    /* renamed from: c */
    public final C42716h0 f115728c;

    /* renamed from: d */
    public final ContactWidgetTabBizHeaderController f115729d;

    /* renamed from: e */
    public final AppCompatActivity f115730e;

    /* renamed from: f */
    public C72996z1 f115731f;

    /* renamed from: g */
    public C52558c f115732g;

    /* renamed from: h */
    public C49001ch f115733h;

    /* renamed from: i */
    public String f115734i;

    /* renamed from: j */
    public C72996z1 f115735j;

    /* renamed from: k */
    public boolean f115736k;

    /* renamed from: l */
    public final C13601g f115737l = C36568h.m40985a(new C42735a(this));

    /* renamed from: m */
    public final C13601g f115738m = C36568h.m40985a(new C42751q(this));

    /* renamed from: n */
    public final C13601g f115739n = C36568h.m40985a(new C42736b(this));

    /* renamed from: o */
    public final C13601g f115740o = C36568h.m40985a(new C42738d(this));

    /* renamed from: p */
    public final C13601g f115741p = C36568h.m40985a(new C42737c(this));

    /* renamed from: q */
    public final C13601g f115742q = C36568h.m40985a(new C42739e(this));

    /* renamed from: r */
    public final C13601g f115743r = C36568h.m40985a(new C42741g(this));

    /* renamed from: s */
    public final C13601g f115744s = C36568h.m40985a(new C42740f(this));

    /* renamed from: t */
    public final C13601g f115745t = C36568h.m40985a(new C42752r(this));

    /* renamed from: u */
    public final C13601g f115746u = C36568h.m40985a(new C42742h(this));

    /* renamed from: v */
    public final C13601g f115747v = C36568h.m40985a(new C42745k(this));

    /* renamed from: w */
    public final C13601g f115748w = C36568h.m40985a(new C42753s(this));

    /* renamed from: x */
    public final C13601g f115749x = C36568h.m40985a(new C42750p(this));

    /* renamed from: y */
    public final C13601g f115750y = C36568h.m40985a(new C42749o(this));

    /* renamed from: z */
    public final C13601g f115751z = C36568h.m40985a(new C42748n(this));

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$a */
    public static final class C42735a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115752d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42735a(C42734m mVar) {
            super(0);
            this.f115752d = mVar;
        }

        public Object invoke() {
            return (ImageView) this.f115752d.f115726a.findViewById(C0966R.C0970id.nj9);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$b */
    public static final class C42736b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115753d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42736b(C42734m mVar) {
            super(0);
            this.f115753d = mVar;
        }

        public Object invoke() {
            return this.f115753d.f115726a.findViewById(C0966R.C0970id.nja);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$c */
    public static final class C42737c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115754d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42737c(C42734m mVar) {
            super(0);
            this.f115754d = mVar;
        }

        public Object invoke() {
            return (ImageView) this.f115754d.f115726a.findViewById(C0966R.C0970id.njb);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$d */
    public static final class C42738d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115755d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42738d(C42734m mVar) {
            super(0);
            this.f115755d = mVar;
        }

        public Object invoke() {
            return (TextView) this.f115755d.f115726a.findViewById(C0966R.C0970id.nj_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$e */
    public static final class C42739e extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115756d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42739e(C42734m mVar) {
            super(0);
            this.f115756d = mVar;
        }

        public Object invoke() {
            return this.f115756d.f115726a.findViewById(C0966R.C0970id.njg);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$f */
    public static final class C42740f extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115757d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42740f(C42734m mVar) {
            super(0);
            this.f115757d = mVar;
        }

        public Object invoke() {
            return (WeImageView) this.f115757d.f115726a.findViewById(C0966R.C0970id.njh);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$g */
    public static final class C42741g extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115758d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42741g(C42734m mVar) {
            super(0);
            this.f115758d = mVar;
        }

        public Object invoke() {
            return (WeImageView) this.f115758d.f115726a.findViewById(C0966R.C0970id.nji);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$h */
    public static final class C42742h extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115759d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42742h(C42734m mVar) {
            super(0);
            this.f115759d = mVar;
        }

        public Object invoke() {
            return this.f115759d.f115726a.findViewById(C0966R.C0970id.njm);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$i */
    public static final class C42743i extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115760d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42743i(C42734m mVar) {
            super(0);
            this.f115760d = mVar;
        }

        public Object invoke() {
            return this.f115760d.f115726a.findViewById(C0966R.C0970id.njo);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$j */
    public static final class C42744j extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115761d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42744j(C42734m mVar) {
            super(0);
            this.f115761d = mVar;
        }

        public Object invoke() {
            return (TextView) this.f115761d.f115726a.findViewById(C0966R.C0970id.njp);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$k */
    public static final class C42745k extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115762d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42745k(C42734m mVar) {
            super(0);
            this.f115762d = mVar;
        }

        public Object invoke() {
            return (TextView) this.f115762d.f115726a.findViewById(C0966R.C0970id.njt);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$l */
    public static final class C42746l extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115763d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42746l(C42734m mVar) {
            super(0);
            this.f115763d = mVar;
        }

        public Object invoke() {
            return this.f115763d.f115726a.findViewById(C0966R.C0970id.njq);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$m */
    public static final class C42747m extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115764d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42747m(C42734m mVar) {
            super(0);
            this.f115764d = mVar;
        }

        public Object invoke() {
            return (TextView) this.f115764d.f115726a.findViewById(C0966R.C0970id.njr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$n */
    public static final class C42748n extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42748n(C42734m mVar) {
            super(0);
            this.f115765d = mVar;
        }

        public Object invoke() {
            return this.f115765d.f115726a.findViewById(C0966R.C0970id.njs);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$o */
    public static final class C42749o extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115766d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42749o(C42734m mVar) {
            super(0);
            this.f115766d = mVar;
        }

        public Object invoke() {
            return (TextView) this.f115766d.f115726a.findViewById(C0966R.C0970id.nju);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$p */
    public static final class C42750p extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115767d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42750p(C42734m mVar) {
            super(0);
            this.f115767d = mVar;
        }

        public Object invoke() {
            return (TextView) this.f115767d.f115726a.findViewById(C0966R.C0970id.njv);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$q */
    public static final class C42751q extends C87413o implements C32224a<MMNeat7extView> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115768d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42751q(C42734m mVar) {
            super(0);
            this.f115768d = mVar;
        }

        public Object invoke() {
            return (MMNeat7extView) this.f115768d.f115726a.findViewById(C0966R.C0970id.njj);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$r */
    public static final class C42752r extends C87413o implements C32224a<FlowTextMixView> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115769d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42752r(C42734m mVar) {
            super(0);
            this.f115769d = mVar;
        }

        public Object invoke() {
            return (FlowTextMixView) this.f115769d.f115726a.findViewById(C0966R.C0970id.njx);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$s */
    public static final class C42753s extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115770d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42753s(C42734m mVar) {
            super(0);
            this.f115770d = mVar;
        }

        public Object invoke() {
            return (TextView) this.f115770d.f115726a.findViewById(C0966R.C0970id.njw);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$t */
    public static final class C42754t extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115771d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42754t(C42734m mVar) {
            super(0);
            this.f115771d = mVar;
        }

        public Object invoke() {
            return this.f115771d.f115726a.findViewById(C0966R.C0970id.njz);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$u */
    public static final class C42755u extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115772d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42755u(C42734m mVar) {
            super(0);
            this.f115772d = mVar;
        }

        public Object invoke() {
            return (TextView) this.f115772d.f115726a.findViewById(C0966R.C0970id.f357532nk0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$v */
    public static final class C42756v extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115773d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42756v(C42734m mVar) {
            super(0);
            this.f115773d = mVar;
        }

        public Object invoke() {
            return this.f115773d.f115726a.findViewById(C0966R.C0970id.f357533nk1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$w */
    public static final class C42757w implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115774d;

        public C42757w(C42734m mVar) {
            this.f115774d = mVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ContactWidgetTabBizHeaderController.this.mo66826d();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$x */
    public static final class C42758x implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115775d;

        public C42758x(C42734m mVar) {
            this.f115775d = mVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ContactWidgetTabBizHeaderController.this.mo66827e();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$y */
    public static final class C42759y implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115776d;

        public C42759y(C42734m mVar) {
            this.f115776d = mVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = ContactWidgetTabBizHeaderController.this;
            if (contactWidgetTabBizHeaderController.f115565s != null) {
                ReportAdClickEvent reportAdClickEvent = new ReportAdClickEvent();
                SnsAdClick snsAdClick = contactWidgetTabBizHeaderController.f115565s;
                snsAdClick.f267472g = 5;
                reportAdClickEvent.f9426d.f9427a = snsAdClick;
                reportAdClickEvent.publish();
            }
            Intent intent = new Intent();
            if (contactWidgetTabBizHeaderController.f115556g.getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false)) {
                intent.setFlags(268435456);
            }
            intent.putExtra("chat_from_scene", contactWidgetTabBizHeaderController.f115556g.getIntent().getIntExtra("chat_from_scene", 0));
            intent.putExtra("KOpenArticleSceneFromScene", 126);
            intent.putExtra("specific_chat_from_scene", 5);
            String str = "";
            if (contactWidgetTabBizHeaderController.f115556g.getIntent().getBundleExtra("Contact_Ext_Args") != null) {
                str = contactWidgetTabBizHeaderController.f115556g.getIntent().getBundleExtra("Contact_Ext_Args").getString("Contact_Ext_Args_Search_Click_Id", str);
            }
            intent.putExtra("uinserve_search_click_id", str);
            if (contactWidgetTabBizHeaderController.f115569w) {
                intent.putExtra("Chat_User", contactWidgetTabBizHeaderController.f115559j.getUsername());
                intent.putExtra("Chat_Mode", 1);
                contactWidgetTabBizHeaderController.f115556g.setResult(-1, intent);
            } else {
                intent.putExtra("Chat_User", contactWidgetTabBizHeaderController.f115559j.getUsername());
                intent.putExtra("Chat_Mode", 1);
                intent.putExtra("finish_direct", true);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent, contactWidgetTabBizHeaderController.f115556g);
            }
            contactWidgetTabBizHeaderController.mo66830h(5, (String) null);
            C46723f.m52019a(contactWidgetTabBizHeaderController.f115559j.getUsername(), 300, contactWidgetTabBizHeaderController.f115568v, contactWidgetTabBizHeaderController.f115541D, contactWidgetTabBizHeaderController.f115556g.getIntent());
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.m$z */
    public static final class C42760z extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C42734m f115777d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42760z(C42734m mVar) {
            super(0);
            this.f115777d = mVar;
        }

        public Object invoke() {
            return this.f115777d.f115726a.findViewById(C0966R.C0970id.nkd);
        }
    }

    public C42734m(View view, MMActivity mMActivity, C42716h0 h0Var, ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController) {
        C87412m.m108594g(view, "rootView");
        C87412m.m108594g(mMActivity, "contactUI");
        C87412m.m108594g(h0Var, "clickCallbacker");
        C87412m.m108594g(contactWidgetTabBizHeaderController, "controller");
        this.f115726a = view;
        this.f115727b = mMActivity;
        this.f115728c = h0Var;
        this.f115729d = contactWidgetTabBizHeaderController;
        this.f115730e = mMActivity.getContext();
    }

    /* renamed from: a */
    public final View mo66884a() {
        Object value = ((C36570n) this.f115746u).getValue();
        C87412m.m108593f(value, "<get-ellipseContainer>(...)");
        return (View) value;
    }

    /* renamed from: b */
    public final TextView mo66885b() {
        Object value = ((C36570n) this.f115747v).getValue();
        C87412m.m108593f(value, "<get-finderTv>(...)");
        return (TextView) value;
    }

    /* renamed from: c */
    public final View mo66886c() {
        Object value = ((C36570n) this.f115751z).getValue();
        C87412m.m108593f(value, "<get-focusContainer>(...)");
        return (View) value;
    }

    /* renamed from: d */
    public final TextView mo66887d() {
        Object value = ((C36570n) this.f115750y).getValue();
        C87412m.m108593f(value, "<get-friendTv>(...)");
        return (TextView) value;
    }

    /* renamed from: e */
    public final TextView mo66888e() {
        Object value = ((C36570n) this.f115749x).getValue();
        C87412m.m108593f(value, "<get-ipTv>(...)");
        return (TextView) value;
    }

    /* renamed from: f */
    public final MMNeat7extView mo66889f() {
        Object value = ((C36570n) this.f115738m).getValue();
        C87412m.m108593f(value, "<get-nameTv>(...)");
        return (MMNeat7extView) value;
    }

    /* renamed from: g */
    public final FlowTextMixView mo66890g() {
        Object value = ((C36570n) this.f115745t).getValue();
        C87412m.m108593f(value, "<get-noEllipseContainer>(...)");
        return (FlowTextMixView) value;
    }

    /* renamed from: h */
    public final TextView mo66891h() {
        Object value = ((C36570n) this.f115748w).getValue();
        C87412m.m108593f(value, "<get-overviewTv>(...)");
        return (TextView) value;
    }

    /* renamed from: i */
    public final View mo66892i() {
        Object value = ((C36570n) this.f115717A).getValue();
        C87412m.m108593f(value, "<get-unFocusContainer>(...)");
        return (View) value;
    }

    /* renamed from: j */
    public final void mo66893j() {
        if (this.f115731f == null || this.f115736k) {
            View c = mo66886c();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(c, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "updateFocus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(c, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "updateFocus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View i = mo66892i();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view = i;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "updateFocus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "updateFocus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C8219i iVar = C8219i.f27144a;
        Object value = ((C36570n) this.f115719C).getValue();
        C87412m.m108593f(value, "<get-focusButtonTv>(...)");
        iVar.mo9271b((TextView) value);
        Object value2 = ((C36570n) this.f115721E).getValue();
        C87412m.m108593f(value2, "<get-unFocusButtonTv>(...)");
        iVar.mo9271b((TextView) value2);
        Object value3 = ((C36570n) this.f115723G).getValue();
        C87412m.m108593f(value3, "<get-enterButtonTv>(...)");
        iVar.mo9271b((TextView) value3);
        Object value4 = ((C36570n) this.f115718B).getValue();
        C87412m.m108593f(value4, "<get-focusButton>(...)");
        ((View) value4).setOnClickListener(new C42757w(this));
        Object value5 = ((C36570n) this.f115720D).getValue();
        C87412m.m108593f(value5, "<get-unFocusButton>(...)");
        ((View) value5).setOnClickListener(new C42758x(this));
        Object value6 = ((C36570n) this.f115722F).getValue();
        C87412m.m108593f(value6, "<get-enterButton>(...)");
        ((View) value6).setOnClickListener(new C42759y(this));
        if (C76577a.m92165p(this.f115730e) >= 1.125f) {
            Object value7 = ((C36570n) this.f115721E).getValue();
            C87412m.m108593f(value7, "<get-unFocusButtonTv>(...)");
            ((TextView) value7).setText(this.f115730e.getResources().getString(C0966R.string.bkt));
        } else {
            Object value8 = ((C36570n) this.f115721E).getValue();
            C87412m.m108593f(value8, "<get-unFocusButtonTv>(...)");
            ((TextView) value8).setText(this.f115730e.getResources().getString(C0966R.string.mus));
        }
        boolean z = true;
        boolean z2 = this.f115727b.getIntent() != null && this.f115727b.getIntent().getBooleanExtra("KIsHardDevice", false);
        if (z2) {
            Log.m105918d("ContactWidgetTabBizHeaderView", "Hard device biz...");
            boolean b = this.f115729d.mo66824b();
            C72996z1 z1Var = this.f115731f;
            C87412m.m108591d(z1Var);
            Log.m105919d("ContactWidgetTabBizHeaderView", "contact.isContact()(%b), isHarDeviceBound(%b)", Boolean.valueOf(z1Var.mo62927s3()), Boolean.valueOf(b));
            C72996z1 z1Var2 = this.f115731f;
            C87412m.m108591d(z1Var2);
            if (!z1Var2.mo62927s3() || !b) {
                if (b) {
                    Object value9 = ((C36570n) this.f115719C).getValue();
                    C87412m.m108593f(value9, "<get-focusButtonTv>(...)");
                    ((TextView) value9).setText(this.f115730e.getResources().getString(C0966R.string.bjw));
                } else {
                    Object value10 = ((C36570n) this.f115719C).getValue();
                    C87412m.m108593f(value10, "<get-focusButtonTv>(...)");
                    ((TextView) value10).setText(this.f115730e.getResources().getString(C0966R.string.f360293bk3));
                }
            }
        }
        if (!z2 || this.f115729d.mo66824b()) {
            z = false;
        }
        C72996z1 z1Var3 = this.f115731f;
        C87412m.m108591d(z1Var3);
        if (!z1Var3.mo62927s3() || z) {
            View i2 = mo66892i();
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view2 = i2;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "updateFocus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "updateFocus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View c2 = mo66886c();
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view3 = c2;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "updateFocus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "updateFocus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View i3 = mo66892i();
        C9556a aVar5 = new C9556a();
        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
        aVar5.mo10233c(0);
        View view4 = i3;
        C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "updateFocus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i3.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "updateFocus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View c3 = mo66886c();
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(8);
        View view5 = c3;
        C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "updateFocus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c3.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "updateFocus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
