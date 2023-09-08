package d60;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import d50.C58114h;
import d60.C58124b;
import di3.C86312j;
import e60.C58532b;
import eb0.C75592q0;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import p447aw.C103918d;
import p629ny.C76979h;
import qn3.C77382c;
import qo3.C47883u;
import qo3.C77426q;
import te3.C49317ep2;
import z04.C112551y;

/* renamed from: d60.l */
public final class C7204l extends C58121a {

    /* renamed from: f */
    public final C58124b f25217f;

    /* renamed from: g */
    public final String f25218g = "MicroMsg.LiveBeforePlugin";

    /* renamed from: h */
    public final Button f25219h;

    /* renamed from: i */
    public final TextView f25220i;

    /* renamed from: j */
    public final EditText f25221j;

    /* renamed from: n */
    public final ViewGroup f25222n;

    /* renamed from: o */
    public final EditText f25223o;

    /* renamed from: p */
    public final TextView f25224p;

    /* renamed from: q */
    public final TextView f25225q;

    /* renamed from: r */
    public final Button f25226r;

    /* renamed from: s */
    public final RelativeLayout f25227s;

    /* renamed from: t */
    public final TextView f25228t;

    /* renamed from: u */
    public String f25229u;

    /* renamed from: v */
    public String f25230v;

    /* renamed from: w */
    public Drawable f25231w;

    /* renamed from: d60.l$a */
    public static final class C7205a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C7204l f25232d;

        /* renamed from: e */
        public final /* synthetic */ RelativeLayout f25233e;

        public C7205a(C7204l lVar, RelativeLayout relativeLayout) {
            this.f25232d = lVar;
            this.f25233e = relativeLayout;
        }

        public final void run() {
            if (this.f25232d.mo82893g0()) {
                ViewGroup.LayoutParams layoutParams = this.f25232d.f25227s.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = C76577a.m92157h(this.f25233e.getContext(), C0966R.dimen.f3705bx) + C76577a.m92157h(this.f25233e.getContext(), C0966R.dimen.ad4) + this.f25232d.f25219h.getHeight();
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.f25232d.f25220i.getLayoutParams();
                if (layoutParams2 != null) {
                    RelativeLayout relativeLayout = this.f25233e;
                    C7204l lVar = this.f25232d;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin += C75044y4.m89991c(relativeLayout.getContext());
                    lVar.f25220i.requestLayout();
                }
                ViewGroup.LayoutParams layoutParams3 = this.f25232d.f25219h.getLayoutParams();
                if (layoutParams3 != null) {
                    RelativeLayout relativeLayout2 = this.f25233e;
                    C7204l lVar2 = this.f25232d;
                    ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin += C75044y4.m89991c(relativeLayout2.getContext());
                    lVar2.f25219h.requestLayout();
                }
                ViewGroup.LayoutParams layoutParams4 = this.f25232d.f25227s.getLayoutParams();
                C87412m.m108592e(layoutParams4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams4).bottomMargin = C76577a.m92157h(this.f25233e.getContext(), C0966R.dimen.f3705bx) + C76577a.m92157h(this.f25233e.getContext(), C0966R.dimen.f3709c2) + this.f25232d.f25219h.getHeight() + C75044y4.m89991c(this.f25233e.getContext());
            }
            this.f25232d.f25227s.requestLayout();
        }
    }

    /* renamed from: d60.l$b */
    public static final class C7206b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7204l f25234d;

        /* renamed from: e */
        public final /* synthetic */ RelativeLayout f25235e;

        public C7206b(C7204l lVar, RelativeLayout relativeLayout) {
            this.f25234d = lVar;
            this.f25235e = relativeLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveBeforePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!Util.isNullOrNil(this.f25234d.f25221j.getText().toString())) {
                Context context = this.f25235e.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) context).hideVKB();
                this.f25234d.f25221j.clearFocus();
            }
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveBeforePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.l$c */
    public static final class C7207c implements TextView.OnEditorActionListener {

        /* renamed from: d */
        public final /* synthetic */ RelativeLayout f25236d;

        /* renamed from: e */
        public final /* synthetic */ C7204l f25237e;

        public C7207c(RelativeLayout relativeLayout, C7204l lVar) {
            this.f25236d = relativeLayout;
            this.f25237e = lVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (6 != i && keyEvent.getAction() != 66) {
                return false;
            }
            Context context = this.f25236d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context).hideVKB();
            this.f25237e.f25221j.clearFocus();
            return false;
        }
    }

    /* renamed from: d60.l$d */
    public static final class C7208d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7204l f25238d;

        public C7208d(C7204l lVar) {
            this.f25238d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveBeforePlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58124b.C7172a.m7372a(this.f25238d.f25217f, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveBeforePlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.l$e */
    public static final class C7209e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7204l f25239d;

        public C7209e(C7204l lVar) {
            this.f25239d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveBeforePlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f25239d.f25217f.statusChange(C58124b.C58125b.SWITCH_CAMERA, new Bundle());
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveBeforePlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.l$f */
    public static final class C7210f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7204l f25240d;

        public C7210f(C7204l lVar) {
            this.f25240d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveBeforePlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f25240d.mo8380x0();
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveBeforePlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.l$g */
    public static final class C7211g implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ C7204l f25241d;

        public C7211g(C7204l lVar) {
            this.f25241d = lVar;
        }

        public void afterTextChanged(Editable editable) {
            if (editable != null) {
                C7204l lVar = this.f25241d;
                lVar.f25226r.setEnabled(!Util.isNullOrNil((CharSequence) editable));
                lVar.f25224p.setText(String.valueOf(28 - C45078p0.m49926e(editable.toString(), C45078p0.C45079a.MODE_CHINESE_AS_2)));
                EditText editText = lVar.f25221j;
                editText.setSelection(editText.getText().length());
                RoomLiveService roomLiveService = RoomLiveService.f157190a;
                RoomLiveService.f157197h.f133051e = lVar.f25221j.getText().toString();
                RoomLiveService.f157213x = true;
                Log.m105924i("MicroMsg.LiveAnchorIDKeyStat", "markAnchorModifyLiveName");
                C115669n.INSTANCE.mo175913w(1380, 3, 1);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: d60.l$h */
    public static final class C7212h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7204l f25242d;

        public C7212h(C7204l lVar) {
            this.f25242d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveBeforePlugin$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7204l lVar = this.f25242d;
            lVar.f25229u = lVar.f25221j.getText().toString();
            if (Util.isNullOrNil(this.f25242d.f25229u)) {
                this.f25242d.f25226r.setEnabled(false);
            } else {
                this.f25242d.f25226r.setEnabled(true);
            }
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveBeforePlugin$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.l$i */
    public static final class C7213i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7204l f25243d;

        /* renamed from: e */
        public final /* synthetic */ RelativeLayout f25244e;

        public C7213i(C7204l lVar, RelativeLayout relativeLayout) {
            this.f25243d = lVar;
            this.f25244e = relativeLayout;
        }

        public final void onClick(View view) {
            Class cls = C76979h.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveBeforePlugin$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C112551y.m153811k(this.f25243d.f25229u)) {
                this.f25243d.f25221j.setHint(((C76979h) C86312j.m106911c(cls)).yp0(this.f25244e.getContext(), this.f25244e.getContext().getString(C0966R.string.g6l, new Object[]{this.f25243d.f25230v}), this.f25243d.f25221j.getTextSize()).toString());
                this.f25243d.f25221j.setText((CharSequence) null);
                RoomLiveService roomLiveService = RoomLiveService.f157190a;
                RoomLiveService.f157197h.f133051e = ((C76979h) C86312j.m106911c(cls)).yp0(this.f25244e.getContext(), this.f25244e.getContext().getString(C0966R.string.g6l, new Object[]{this.f25243d.f25230v}), this.f25243d.f25221j.getTextSize()).toString();
            } else {
                C7204l lVar = this.f25243d;
                lVar.f25221j.setText(lVar.f25229u);
                RoomLiveService roomLiveService2 = RoomLiveService.f157190a;
                RoomLiveService.f157197h.f133051e = this.f25243d.f25221j.getText().toString();
            }
            RoomLiveService roomLiveService3 = RoomLiveService.f157190a;
            RoomLiveService.f157213x = false;
            Context context = this.f25244e.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context).hideVKB();
            this.f25243d.f25221j.clearFocus();
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveBeforePlugin$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.l$j */
    public static final class C7214j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RelativeLayout f25245d;

        /* renamed from: e */
        public final /* synthetic */ C7204l f25246e;

        public C7214j(RelativeLayout relativeLayout, C7204l lVar) {
            this.f25245d = relativeLayout;
            this.f25246e = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveBeforePlugin$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Context context = this.f25245d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context).hideVKB();
            this.f25246e.f25221j.clearFocus();
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveBeforePlugin$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.l$k */
    public static final class C7215k implements C47883u {

        /* renamed from: a */
        public static final C7215k f25247a = new C7215k();

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7204l(RelativeLayout relativeLayout, C58124b bVar) {
        super(relativeLayout, bVar);
        RelativeLayout relativeLayout2 = relativeLayout;
        C58124b bVar2 = bVar;
        C87412m.m108594g(relativeLayout2, "root");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f25217f = bVar2;
        View findViewById = relativeLayout2.findViewById(C0966R.C0970id.fs7);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.live_before_ui_root)");
        View findViewById2 = relativeLayout2.findViewById(C0966R.C0970id.fry);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.l…before_content_start_btn)");
        Button button = (Button) findViewById2;
        this.f25219h = button;
        View findViewById3 = relativeLayout2.findViewById(C0966R.C0970id.f358562fs2);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.live_before_provider_tip)");
        TextView textView = (TextView) findViewById3;
        this.f25220i = textView;
        View findViewById4 = relativeLayout2.findViewById(C0966R.C0970id.frz);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.l…efore_content_title_edit)");
        EditText editText = (EditText) findViewById4;
        this.f25221j = editText;
        View findViewById5 = relativeLayout2.findViewById(C0966R.C0970id.fs4);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.live_before_top_close)");
        WeImageView weImageView = (WeImageView) findViewById5;
        View findViewById6 = relativeLayout2.findViewById(C0966R.C0970id.fs6);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.live_before_top_switch)");
        WeImageView weImageView2 = (WeImageView) findViewById6;
        View findViewById7 = relativeLayout2.findViewById(C0966R.C0970id.fs5);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.live_before_top_group)");
        ViewGroup viewGroup = (ViewGroup) findViewById7;
        this.f25222n = viewGroup;
        View findViewById8 = relativeLayout2.findViewById(C0966R.C0970id.frx);
        C87412m.m108593f(findViewById8, "root.findViewById(R.id.l…fore_content_roomid_edit)");
        EditText editText2 = (EditText) findViewById8;
        this.f25223o = editText2;
        View findViewById9 = relativeLayout2.findViewById(C0966R.C0970id.kok);
        C87412m.m108593f(findViewById9, "root.findViewById(R.id.title_edit_text_num_hint)");
        this.f25224p = (TextView) findViewById9;
        View findViewById10 = relativeLayout2.findViewById(C0966R.C0970id.fzg);
        C87412m.m108593f(findViewById10, "root.findViewById(R.id.live_title_edit_cancel)");
        TextView textView2 = (TextView) findViewById10;
        this.f25225q = textView2;
        View findViewById11 = relativeLayout2.findViewById(C0966R.C0970id.fzh);
        C87412m.m108593f(findViewById11, "root.findViewById(R.id.live_title_edit_ok)");
        Button button2 = (Button) findViewById11;
        this.f25226r = button2;
        View findViewById12 = relativeLayout2.findViewById(C0966R.C0970id.f358560fs0);
        C87412m.m108593f(findViewById12, "root.findViewById(R.id.l…content_title_edit_group)");
        RelativeLayout relativeLayout3 = (RelativeLayout) findViewById12;
        this.f25227s = relativeLayout3;
        View findViewById13 = relativeLayout2.findViewById(C0966R.C0970id.f358561fs1);
        C87412m.m108593f(findViewById13, "root.findViewById(R.id.live_before_edit_top_group)");
        RelativeLayout relativeLayout4 = (RelativeLayout) findViewById13;
        View findViewById14 = relativeLayout2.findViewById(C0966R.C0970id.f358563fs3);
        C87412m.m108593f(findViewById14, "root.findViewById(R.id.live_before_title)");
        this.f25228t = (TextView) findViewById14;
        String str = "";
        this.f25229u = str;
        this.f25230v = str;
        this.f25231w = editText.getBackground();
        ((RelativeLayout) findViewById).setOnClickListener(new C7206b(this, relativeLayout2));
        C72996z1 g = C75592q0.m90777g();
        String f = g != null ? g.mo62898f() : null;
        this.f25230v = f != null ? f : str;
        TextView textView3 = textView;
        RelativeLayout relativeLayout5 = relativeLayout4;
        ViewGroup viewGroup2 = viewGroup;
        editText.setHint(((C76979h) C86312j.m106911c(C76979h.class)).yp0(relativeLayout.getContext(), relativeLayout.getContext().getString(C0966R.string.g6l, new Object[]{this.f25230v}), editText.getTextSize()));
        editText.setOnEditorActionListener(new C7207c(relativeLayout2, this));
        weImageView.setOnClickListener(new C7208d(this));
        weImageView2.setOnClickListener(new C7209e(this));
        button.setOnClickListener(new C7210f(this));
        editText2.setVisibility(C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_LIVE_ANCHOR_CUSTOM_ROOM_ID_INT_SYNC, 0) == 1 ? 0 : 8);
        editText2.setText(String.valueOf(C58114h.f166248e.roomId));
        C77382c b = C77382c.m93286b(editText);
        b.f225611e = 0;
        b.f225610d = 28;
        b.mo107499d((C77382c.C77383a) null);
        editText.addTextChangedListener(new C7211g(this));
        editText.setOnClickListener(new C7212h(this));
        textView2.setOnClickListener(new C7213i(this, relativeLayout2));
        button2.setOnClickListener(new C7214j(relativeLayout2, this));
        relativeLayout3.post(new C7205a(this, relativeLayout2));
        if (!(!mo82893g0() || viewGroup2.getLayoutParams() == null || relativeLayout5.getLayoutParams() == null)) {
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(C75044y4.m89991c(relativeLayout.getContext()));
            ViewGroup.LayoutParams layoutParams2 = relativeLayout5.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(C75044y4.m89991c(relativeLayout.getContext()));
            viewGroup2.requestLayout();
            relativeLayout5.requestLayout();
        }
        try {
            String string = relativeLayout.getContext().getResources().getString(C0966R.string.g9_);
            C87412m.m108593f(string, "root.context.resources.g…string.live_provider_tip)");
            C32735h.C32737c cVar = C32735h.C32737c.clicfg_live_start_tip;
            C104289g gVar = new C104289g(((C32735h) C86312j.m106911c(C32735h.class)).Y60(cVar, "{\"simple_chinese\":\"" + string + "\",\"xg_traditional_chinese\":\"" + string + "\",\"tw_traditional_chinese\":\"" + string + "\",\"english\":\"" + string + "\"}"));
            String applicationLanguage = LocaleUtil.getApplicationLanguage();
            String string2 = C87412m.m108589b("zh_CN", applicationLanguage) ? gVar.getString("simple_chinese") : C87412m.m108589b("zh_TW", applicationLanguage) ? gVar.getString("xg_traditional_chinese") : C87412m.m108589b("zh_HK", applicationLanguage) ? gVar.getString("tw_traditional_chinese") : gVar.getString("english");
            if (!Util.isNullOrNil(string2)) {
                textView3.setText(string2);
            }
        } catch (Exception e) {
            String str2 = this.f25218g;
            Log.m105928w(str2, "Exception: " + e.getMessage());
        }
    }

    /* renamed from: h0 */
    public void mo8378h0(boolean z, int i) {
        int i2;
        int i3;
        String str;
        if (z) {
            this.f25228t.setVisibility(8);
            this.f25222n.setVisibility(8);
            this.f25219h.setVisibility(8);
            if (mo82893g0()) {
                i3 = C75044y4.m89990b(this.f166287d.getContext()).y - i;
                i2 = C76577a.m92157h(this.f166287d.getContext(), C0966R.dimen.f3736cp);
            } else {
                i3 = (C75044y4.m89990b(this.f166287d.getContext()).y - i) - C75044y4.m89991c(this.f166287d.getContext());
                i2 = C76577a.m92157h(this.f166287d.getContext(), C0966R.dimen.f3736cp);
            }
            int i4 = i3 - i2;
            int[] iArr = new int[2];
            this.f25227s.getLocationOnScreen(iArr);
            this.f25227s.animate().translationY((float) (i4 - (iArr[1] + this.f25227s.getHeight()))).start();
            this.f25221j.setBackground(this.f166287d.getContext().getResources().getDrawable(C0966R.color.ahf));
            this.f25221j.setPadding(0, 0, 0, 0);
            this.f25221j.setHint(" ");
            this.f25221j.setCursorVisible(true);
            this.f25224p.setVisibility(0);
            Editable text = this.f25221j.getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            this.f25224p.setText(String.valueOf(28 - C45078p0.m49926e(str, C45078p0.C45079a.MODE_CHINESE_AS_2)));
            this.f25225q.setVisibility(0);
            this.f25226r.setVisibility(0);
            return;
        }
        this.f25228t.setVisibility(0);
        this.f25222n.setVisibility(0);
        this.f25219h.setVisibility(0);
        this.f25227s.animate().translationY(0.0f).start();
        this.f25221j.setBackground(this.f25231w);
        C76577a.m92157h(this.f166287d.getContext(), C0966R.dimen.f3749d0);
        this.f25221j.setPadding(0, 0, 0, C76577a.m92157h(this.f166287d.getContext(), C0966R.dimen.f3766df));
        this.f25221j.setHint(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f166287d.getContext(), this.f166287d.getContext().getString(C0966R.string.g6l, new Object[]{this.f25230v}), this.f25221j.getTextSize()));
        this.f25221j.setCursorVisible(false);
        this.f25224p.setVisibility(8);
        this.f25225q.setVisibility(8);
        this.f25226r.setVisibility(8);
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (mo14483f0() != 0) {
            return false;
        }
        C58124b.C7172a.m7372a(this.f25217f, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
        return true;
    }

    /* renamed from: p0 */
    public void mo8379p0(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.mo8379p0(i, strArr, iArr);
        if (i == 25) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                String str = this.f25218g;
                Log.m105924i(str, "FinderLive request permission " + i + " failed");
                Context context = this.f166287d.getContext();
                C87412m.m108593f(context, "root.context");
                C77426q qVar = new C77426q(context);
                qVar.mo107606r(context.getResources().getString(C0966R.string.m8s));
                qVar.mo107595g(context.getResources().getString(C0966R.string.m8r));
                qVar.mo107602n(context.getResources().getString(C0966R.string.f8028zq));
                qVar.mo107600l(new C7218m(this));
                qVar.mo107603o();
                return;
            }
            Log.m105924i(this.f25218g, "onRequestPermissionsResult microphone granted");
            mo8380x0();
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 5) {
            if (!(ordinal == 6 || ordinal == 7)) {
                if (ordinal == 9) {
                    C58532b.m67951g(RoomLiveService.f157192c, RoomLiveService.f157214y, RoomLiveService.f157215z, RoomLiveService.f157197h.f133051e, RoomLiveService.f157213x, this.f166287d.getResources().getConfiguration().orientation, RoomLiveService.f157170B ? 3 : 2, 0, 128, (Object) null);
                    Log.m105924i("MicroMsg.LiveAnchorIDKeyStat", "markAnchorExitBeforeStartLive");
                    C115669n.INSTANCE.mo175913w(1380, 2, 1);
                    RoomLiveService.f157169A = false;
                    return;
                } else if (ordinal == 10) {
                    Log.m105924i("MicroMsg.LiveAnchorIDKeyStat", "markAnchorSwitchCameraBeforeStartLive");
                    C115669n.INSTANCE.mo175913w(1380, 1, 1);
                    return;
                } else if (ordinal != 27) {
                    return;
                }
            }
            mo10792g(8);
            return;
        }
        Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("PARAM_FACE_VERIFY_ERROR", -1)) : null;
        if (!(valueOf == null || valueOf.intValue() == -1)) {
            C77426q qVar = new C77426q(this.f166287d.getContext());
            qVar.mo107595g(this.f166287d.getContext().getString(valueOf.intValue()));
            qVar.mo107602n(this.f166287d.getContext().getString(C0966R.string.f8028zq));
            qVar.mo107600l(C7215k.f25247a);
            qVar.mo107603o();
        }
        C49317ep2 ep22 = RoomLiveService.f157197h;
        Editable text = this.f25221j.getText();
        ep22.f133051e = text == null || C112551y.m153811k(text) ? ((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f166287d.getContext(), this.f166287d.getContext().getString(C0966R.string.g6l, new Object[]{this.f25230v}), this.f25221j.getTextSize()).toString() : this.f25221j.getText().toString();
        RoomLiveService.f157169A = false;
        mo10792g(0);
    }

    /* renamed from: x0 */
    public final void mo8380x0() {
        Context context = this.f166287d.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1((Activity) context, "android.permission.RECORD_AUDIO", 25, "", "");
        String str = this.f25218g;
        Log.m105924i(str, "check micro:" + z1);
        if (!z1) {
            String str2 = this.f25218g;
            Log.m105924i(str2, "check micro:" + Util.getStack());
            return;
        }
        Editable text = this.f25221j.getText();
        String obj = text == null || C112551y.m153811k(text) ? "" : this.f25221j.getText().toString();
        int parseInt = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_LIVE_ANCHOR_CUSTOM_ROOM_ID_INT_SYNC, 0) == 1 ? Integer.parseInt(this.f25223o.getText().toString()) : -1;
        Bundle bundle = new Bundle();
        bundle.putInt("PARAM_LIVE_TEST_ROOM_ID", parseInt);
        bundle.putString("PARAM_START_LIVE_TITLE", obj);
        RoomLiveService.f157197h.f133066w = ((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f166287d.getContext(), this.f166287d.getContext().getString(C0966R.string.g6l, new Object[]{this.f25230v}), this.f25221j.getTextSize()).toString();
        this.f25217f.statusChange(C58124b.C58125b.LIVE_STATUS_CREATE_LIVE, bundle);
    }
}
