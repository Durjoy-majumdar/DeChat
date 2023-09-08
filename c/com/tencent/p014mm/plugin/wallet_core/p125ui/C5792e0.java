package com.tencent.p014mm.plugin.wallet_core.p125ui;

import al3.C0086a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OpenECardEvent;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import eb0.C75592q0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import nj3.C76879j;
import p923xj.C78853a;
import qo3.C77389a;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.e0 */
public class C5792e0 {

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.e0$a */
    public class C5793a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ECardInfo f21926d;

        /* renamed from: e */
        public final /* synthetic */ Context f21927e;

        public C5793a(ECardInfo eCardInfo, Context context) {
            this.f21926d = eCardInfo;
            this.f21927e = context;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            String str = this.f21926d.f21889j;
            Log.m105925i("MicroMsg.WalletIdCardTip", "go to url %s", str);
            intent.putExtra("rawUrl", str);
            intent.putExtra("geta8key_username", C75592q0.m90789s());
            intent.putExtra("pay_channel", 1);
            C75228t.m90217J(this.f21927e, intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.e0$b */
    public class C5794b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f21928d;

        /* renamed from: e */
        public final /* synthetic */ Context f21929e;

        public C5794b(String str, Context context) {
            this.f21928d = str;
            this.f21929e = context;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            String str = this.f21928d;
            Log.m105925i("MicroMsg.WalletIdCardTip", "go to url %s", str);
            intent.putExtra("rawUrl", str);
            intent.putExtra("geta8key_username", C75592q0.m90789s());
            intent.putExtra("pay_channel", 1);
            C75228t.m90217J(this.f21929e, intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.e0$c */
    public class C5795c implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ Dialog f21930d;

        public C5795c(Dialog dialog) {
            this.f21930d = dialog;
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.WalletIdCardTip", "SnsLuckyMoneyNewYearTipsUI onCancel");
            Dialog dialog = this.f21930d;
            if (dialog != null && dialog.isShowing()) {
                this.f21930d.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.e0$d */
    public class C5796d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Dialog f21931d;

        public C5796d(Dialog dialog) {
            this.f21931d = dialog;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Dialog dialog = this.f21931d;
            if (dialog != null && dialog.isShowing()) {
                this.f21931d.dismiss();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.e0$e */
    public class C5797e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f21932d;

        /* renamed from: e */
        public final /* synthetic */ Context f21933e;

        /* renamed from: f */
        public final /* synthetic */ Dialog f21934f;

        public C5797e(String str, Context context, Dialog dialog) {
            this.f21932d = str;
            this.f21933e = context;
            this.f21934f = dialog;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            String str = this.f21932d;
            Log.m105925i("MicroMsg.WalletIdCardTip", "go to url %s", str);
            intent.putExtra("rawUrl", str);
            intent.putExtra("geta8key_username", C75592q0.m90789s());
            intent.putExtra("pay_channel", 1);
            C75228t.m90217J(this.f21933e, intent);
            Dialog dialog = this.f21934f;
            if (dialog != null && dialog.isShowing()) {
                this.f21934f.dismiss();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.e0$f */
    public class C5798f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ECardInfo f21935d;

        /* renamed from: e */
        public final /* synthetic */ Context f21936e;

        /* renamed from: f */
        public final /* synthetic */ int f21937f;

        public C5798f(ECardInfo eCardInfo, Context context, int i) {
            this.f21935d = eCardInfo;
            this.f21936e = context;
            this.f21937f = i;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            String str = this.f21935d.f21895s;
            Log.m105925i("MicroMsg.WalletIdCardTip", "go to url %s", str);
            intent.putExtra("rawUrl", str);
            intent.putExtra("geta8key_username", C75592q0.m90789s());
            intent.putExtra("pay_channel", 1);
            C75228t.m90217J(this.f21936e, intent);
            if (this.f21937f == 0) {
                C115669n.INSTANCE.mo160131h(16500, 4);
            } else {
                C115669n.INSTANCE.mo160131h(16500, 6);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.e0$g */
    public class C5799g implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ Dialog f21938d;

        public C5799g(Dialog dialog) {
            this.f21938d = dialog;
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.WalletIdCardTip", "SnsLuckyMoneyNewYearTipsUI onCancel");
            Dialog dialog = this.f21938d;
            if (dialog != null && dialog.isShowing()) {
                this.f21938d.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.e0$h */
    public class C5800h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Dialog f21939d;

        public C5800h(Dialog dialog) {
            this.f21939d = dialog;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Dialog dialog = this.f21939d;
            if (dialog != null && dialog.isShowing()) {
                this.f21939d.dismiss();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.e0$i */
    public class C5801i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ECardInfo f21940d;

        /* renamed from: e */
        public final /* synthetic */ Context f21941e;

        /* renamed from: f */
        public final /* synthetic */ Dialog f21942f;

        public C5801i(ECardInfo eCardInfo, Context context, Dialog dialog) {
            this.f21940d = eCardInfo;
            this.f21941e = context;
            this.f21942f = dialog;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105925i("MicroMsg.WalletIdCardTip", "go to: %s", Integer.valueOf(this.f21940d.f21890n));
            ECardInfo eCardInfo = this.f21940d;
            if (eCardInfo.f21890n == 1) {
                C75228t.m90219L(this.f21941e, eCardInfo.f21891o, false);
            } else {
                OpenECardEvent openECardEvent = new OpenECardEvent();
                openECardEvent.f9381d.f9382a = new WeakReference(this.f21941e);
                openECardEvent.publish();
            }
            Dialog dialog = this.f21942f;
            if (dialog != null && dialog.isShowing()) {
                this.f21942f.dismiss();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.e0$j */
    public class C5802j implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ Button f21943a;

        public C5802j(Button button) {
            this.f21943a = button;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!z) {
                this.f21943a.setEnabled(false);
                this.f21943a.setClickable(false);
                return;
            }
            this.f21943a.setEnabled(true);
            this.f21943a.setClickable(true);
        }
    }

    /* renamed from: a */
    public static Dialog m5545a(Context context, ECardInfo eCardInfo, int i) {
        Context context2 = context;
        ECardInfo eCardInfo2 = eCardInfo;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f360058cf2, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.bem);
        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(context2, 50.0f);
        Util.expandViewTouchArea(imageView, fromDPToPix, fromDPToPix, fromDPToPix, fromDPToPix);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f358705gl3);
        Button button = (Button) inflate.findViewById(C0966R.C0970id.f359464l12);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.gky);
        CheckBox checkBox = (CheckBox) inflate.findViewById(C0966R.C0970id.bab);
        TextView textView3 = (TextView) inflate.findViewById(C0966R.C0970id.bai);
        ((TextView) inflate.findViewById(C0966R.C0970id.gl8)).setText(eCardInfo2.f21892p);
        if (!Util.isNullOrNil(eCardInfo2.f21899w)) {
            textView.setText(eCardInfo2.f21899w);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        int length = eCardInfo2.f21896t.length();
        int length2 = (eCardInfo2.f21896t + eCardInfo2.f21897u).length();
        SpannableString spannableString = new SpannableString(eCardInfo2.f21896t + eCardInfo2.f21897u);
        spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(C0966R.color.ajt)), length, length2, 33);
        if (!Util.isNullOrNil((CharSequence) spannableString)) {
            textView2.setText(spannableString);
            textView2.setOnClickListener(new C5798f(eCardInfo2, context2, i));
        } else {
            textView2.setVisibility(8);
        }
        C78853a aVar = new C78853a(context2, C0966R.style.a66);
        aVar.setContentView(inflate);
        aVar.setTitle((CharSequence) null);
        aVar.setOnCancelListener(new C5799g(aVar));
        imageView.setOnClickListener(new C5800h(aVar));
        button.setOnClickListener(new C5801i(eCardInfo2, context2, aVar));
        if (eCardInfo2.f21885f == 1) {
            checkBox.setOnCheckedChangeListener(new C5802j(button));
            if (eCardInfo2.f21886g == 1) {
                checkBox.setChecked(true);
            } else {
                checkBox.setChecked(false);
                button.setEnabled(false);
                button.setClickable(false);
            }
        } else {
            checkBox.setVisibility(8);
        }
        int length3 = eCardInfo2.f21887h.length();
        int length4 = (eCardInfo2.f21887h + eCardInfo2.f21888i).length();
        SpannableString spannableString2 = new SpannableString(eCardInfo2.f21887h + eCardInfo2.f21888i);
        spannableString2.setSpan(new ForegroundColorSpan(context.getResources().getColor(C0966R.color.ajt)), length3, length4, 33);
        textView3.setText(spannableString2);
        textView3.setOnClickListener(new C5793a(eCardInfo2, context2));
        aVar.show();
        C76879j.m92730a(context2, aVar);
        return aVar;
    }

    /* renamed from: b */
    public static void m5546b(Context context) {
        C77389a aVar = new C77389a();
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cgn, (ViewGroup) null, false);
        ((ImageView) inflate.findViewById(C0966R.C0970id.ltw)).setImageResource(C0966R.C0969drawable.cfe);
        ((TextView) inflate.findViewById(C0966R.C0970id.ltx)).setText(C0966R.string.gn9);
        aVar.f225669z = true;
        aVar.f225668y = false;
        aVar.f225627J = inflate;
        aVar.f225644a = C0086a.m38a(context).getString(C0966R.string.l9s);
        aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.lkg);
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
    }

    /* renamed from: c */
    public static Dialog m5547c(Context context, String str, String str2, List<String> list, String str3, int i, String str4, String str5, String str6, String str7) {
        Context context2 = context;
        String str8 = str4;
        String str9 = str5;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f360056cf0, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.bem);
        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 15.0f);
        Util.expandViewTouchArea(imageView, fromDPToPix, fromDPToPix, fromDPToPix, fromDPToPix);
        MMNeat7extView mMNeat7extView = (MMNeat7extView) inflate.findViewById(C0966R.C0970id.gl8);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.gl7);
        Button button = (Button) inflate.findViewById(C0966R.C0970id.f359464l12);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gky);
        mMNeat7extView.getPaint().setFakeBoldText(true);
        String str10 = str;
        mMNeat7extView.mo104279b(str);
        String str11 = str2;
        ((TextView) inflate.findViewById(C0966R.C0970id.gl6)).setText(str2);
        linearLayout.removeAllViews();
        for (String text : list) {
            View inflate2 = LayoutInflater.from(context).inflate(C0966R.C0971layout.f360057cf1, (ViewGroup) null);
            ((TextView) inflate2.findViewById(C0966R.C0970id.lr7)).setText(text);
            linearLayout.addView(inflate2);
        }
        button.setText(str3);
        if (i > 0) {
            int length = str4.length();
            int length2 = (str8 + str9).length();
            SpannableString spannableString = new SpannableString(str8 + str9);
            spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(C0966R.color.ajt)), length, length2, 33);
            textView.setText(spannableString);
        } else {
            textView.setText("");
        }
        textView.setOnClickListener(new C5794b(str6, context));
        C78853a aVar = new C78853a(context, C0966R.style.a66);
        aVar.setContentView(inflate);
        aVar.setTitle((CharSequence) null);
        aVar.setOnCancelListener(new C5795c(aVar));
        imageView.setOnClickListener(new C5796d(aVar));
        button.setOnClickListener(new C5797e(str7, context, aVar));
        aVar.show();
        Window window = aVar.getWindow();
        int b = C76577a.m92151b(MMApplicationContext.getContext(), 16);
        window.getDecorView().setPadding(b, 0, b, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        return aVar;
    }
}
