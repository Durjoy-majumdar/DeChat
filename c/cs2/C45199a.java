package cs2;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import p923xj.C78853a;

/* renamed from: cs2.a */
public class C45199a {

    /* renamed from: cs2.a$a */
    public class C45200a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ Dialog f122519d;

        public C45200a(Dialog dialog) {
            this.f122519d = dialog;
        }

        public void onCancel(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI$1");
            Log.m105924i("MicroMsg.SnsLuckyCommentAlertUI", "showTipsDialog onCancel");
            Dialog dialog = this.f122519d;
            if (dialog != null && dialog.isShowing()) {
                this.f122519d.dismiss();
            }
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI$1");
        }
    }

    /* renamed from: cs2.a$b */
    public class C45201b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Dialog f122520d;

        /* renamed from: e */
        public final /* synthetic */ View f122521e;

        public C45201b(Dialog dialog, View view) {
            this.f122520d = dialog;
            this.f122521e = view;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyCommentAlertUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI$2");
            Log.m105924i("MicroMsg.SnsLuckyCommentAlertUI", "showTipsDialog onClick");
            Dialog dialog = this.f122520d;
            if (dialog != null && dialog.isShowing()) {
                this.f122520d.dismiss();
            }
            View view2 = this.f122521e;
            if (view2 != null) {
                view2.performClick();
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyCommentAlertUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: cs2.a$c */
    public class C45202c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Dialog f122522d;

        public C45202c(Dialog dialog) {
            this.f122522d = dialog;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyCommentAlertUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI$3");
            Log.m105924i("MicroMsg.SnsLuckyCommentAlertUI", "showTipsDialog OnClick: close");
            Dialog dialog = this.f122522d;
            if (dialog != null && dialog.isShowing()) {
                this.f122522d.dismiss();
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyCommentAlertUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a */
    public static Dialog m50003a(Context context, View view) {
        SnsMethodCalculate.markStartTimeMs("showTipsDialog", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b99, (ViewGroup) null);
        String str = LocaleUtil.isSimplifiedChineseAppLang() ? "font_1.otf" : LocaleUtil.isTraditionalChineseAppLang() ? "font_2.otf" : null;
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gjj);
        if (!Util.isNullOrNil(str)) {
            textView.setTypeface(Typeface.createFromAsset(context.getAssets(), str));
        }
        if (!LocaleUtil.isChineseAppLang()) {
            textView.setTextSize(1, 10.0f);
        }
        C78853a aVar = new C78853a(context, C0966R.style.a66);
        aVar.setContentView(inflate);
        aVar.setTitle((CharSequence) null);
        aVar.setOnCancelListener(new C45200a(aVar));
        ((TextView) inflate.findViewById(C0966R.C0970id.f358369eq0)).setOnClickListener(new C45201b(aVar, view));
        View findViewById = inflate.findViewById(C0966R.C0970id.kn_);
        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 10.0f);
        Util.expandViewTouchArea(findViewById, fromDPToPix, fromDPToPix, fromDPToPix, fromDPToPix);
        findViewById.setOnClickListener(new C45202c(aVar));
        aVar.show();
        SnsMethodCalculate.markEndTimeMs("showTipsDialog", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI");
        return aVar;
    }
}
