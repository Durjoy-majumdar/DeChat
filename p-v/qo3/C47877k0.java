package qo3;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76901s0;

/* renamed from: qo3.k0 */
public class C47877k0 {

    /* renamed from: qo3.k0$a */
    public class C47878a extends Handler {

        /* renamed from: a */
        public final /* synthetic */ C76901s0 f128478a;

        public C47878a(C76901s0 s0Var) {
            this.f128478a = s0Var;
        }

        public void handleMessage(Message message) {
            this.f128478a.dismiss();
            super.handleMessage(message);
        }
    }

    /* renamed from: qo3.k0$b */
    public class C47879b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76901s0 f128479d;

        /* renamed from: e */
        public final /* synthetic */ View.OnClickListener f128480e;

        public C47879b(C76901s0 s0Var, View.OnClickListener onClickListener) {
            this.f128479d = s0Var;
            this.f128480e = onClickListener;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMTipsBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f128479d.dismiss();
            View.OnClickListener onClickListener = this.f128480e;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMTipsBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a */
    public static C76901s0 m53189a(Activity activity, int i, int i2, int i3, String str, int i4, View.OnClickListener onClickListener, PopupWindow.OnDismissListener onDismissListener, View.OnClickListener onClickListener2) {
        View inflate = View.inflate(activity, C0966R.C0971layout.c_q, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.a7m);
        if (i == 1) {
            linearLayout.setBackgroundResource(C0966R.C0969drawable.axv);
        }
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.knw);
        textView.setText(str);
        textView.setOnClickListener(onClickListener);
        WeImageView weImageView = (WeImageView) inflate.findViewById(C0966R.C0970id.knu);
        if (i2 == 0) {
            weImageView.setVisibility(8);
            int a = C74942w4.m89784a(activity, 16);
            textView.setPadding(a, 0, a, 0);
        } else {
            weImageView.setImageResource(i2);
            weImageView.setIconColor(i3);
        }
        C76901s0 s0Var = new C76901s0(inflate);
        s0Var.setWidth(-1);
        s0Var.setHeight(-2);
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i5 = rect.top;
        int a2 = C75044y4.m89989a(activity);
        if (i5 == 0) {
            i5 = C75044y4.m89996h(activity);
        }
        s0Var.showAtLocation(activity.getWindow().getDecorView(), 48, 0, i5 + a2);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.knv);
        if (i4 == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(i4);
        }
        imageView.setOnClickListener(new C47879b(s0Var, onClickListener2));
        if (onDismissListener != null) {
            s0Var.setOnDismissListener(onDismissListener);
        }
        return s0Var;
    }

    /* renamed from: b */
    public static C76901s0 m53190b(Activity activity, int i, int i2, int i3, String str, long j) {
        View inflate = View.inflate(activity, i, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.knt);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.knw);
        textView.setText(str);
        WeImageView weImageView = (WeImageView) inflate.findViewById(C0966R.C0970id.knu);
        if (i2 == 0) {
            weImageView.setVisibility(8);
            int a = C74942w4.m89784a(activity, 16);
            textView.setPadding(a, 0, a, 0);
        } else {
            weImageView.setImageResource(i2);
            weImageView.setIconColor(i3);
        }
        C76901s0 s0Var = new C76901s0(inflate);
        s0Var.setWidth(-1);
        s0Var.setHeight(-2);
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i4 = rect.top;
        int a2 = C75044y4.m89989a(activity);
        if (i4 == 0) {
            i4 = C75044y4.m89996h(activity);
        }
        s0Var.showAtLocation(activity.getWindow().getDecorView(), 48, 0, i4 + a2);
        if (j > 0) {
            new C47878a(s0Var).sendEmptyMessageDelayed(0, j);
        }
        return s0Var;
    }
}
