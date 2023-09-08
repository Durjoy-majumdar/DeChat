package vg3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85975v4;
import qo3.C77393e;

/* renamed from: vg3.e */
public class C118677e extends Dialog {

    /* renamed from: d */
    public Context f355115d;

    /* renamed from: e */
    public LinearLayout f355116e;

    /* renamed from: f */
    public Button f355117f;

    /* renamed from: g */
    public Button f355118g = ((Button) this.f355116e.findViewById(C0966R.C0970id.gui));

    /* renamed from: h */
    public TextView f355119h = ((TextView) this.f355116e.findViewById(C0966R.C0970id.gux));

    /* renamed from: i */
    public TextView f355120i;

    /* renamed from: j */
    public TextView f355121j;

    /* renamed from: n */
    public LinearLayout f355122n;

    /* renamed from: o */
    public LinearLayout f355123o;

    /* renamed from: p */
    public View f355124p;

    /* renamed from: q */
    public Animation f355125q;

    /* renamed from: r */
    public Animation f355126r;

    /* renamed from: s */
    public Animation f355127s;

    /* renamed from: t */
    public Animation f355128t;

    /* renamed from: u */
    public C77393e f355129u;

    /* renamed from: vg3.e$a */
    public class C118678a implements Runnable {
        public C118678a() {
        }

        public void run() {
            C118677e.this.dismiss();
        }
    }

    public C118677e(Context context, int i) {
        super(context, C0966R.style.a66);
        this.f355115d = context;
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, C0966R.C0971layout.bbw, (ViewGroup) null);
        this.f355116e = linearLayout;
        this.f355117f = (Button) linearLayout.findViewById(C0966R.C0970id.guw);
        TextView textView = (TextView) this.f355116e.findViewById(C0966R.C0970id.guz);
        this.f355120i = (TextView) this.f355116e.findViewById(C0966R.C0970id.guo);
        this.f355121j = (TextView) this.f355116e.findViewById(C0966R.C0970id.gup);
        TextView textView2 = (TextView) this.f355116e.findViewById(C0966R.C0970id.guu);
        TextView textView3 = (TextView) this.f355116e.findViewById(C0966R.C0970id.gut);
        TextView textView4 = (TextView) this.f355116e.findViewById(C0966R.C0970id.blg);
        EditText editText = (EditText) this.f355116e.findViewById(C0966R.C0970id.blm);
        ImageView imageView = (ImageView) this.f355116e.findViewById(C0966R.C0970id.gus);
        this.f355122n = (LinearLayout) this.f355116e.findViewById(C0966R.C0970id.guy);
        ViewStub viewStub = (ViewStub) this.f355116e.findViewById(C0966R.C0970id.koy);
        this.f355123o = (LinearLayout) this.f355116e.findViewById(C0966R.C0970id.guq);
        ViewGroup viewGroup = (ViewGroup) this.f355116e.findViewById(C0966R.C0970id.guc);
        this.f355124p = this.f355116e.findViewById(C0966R.C0970id.guh);
        LinearLayout linearLayout2 = (LinearLayout) this.f355116e.findViewById(C0966R.C0970id.guk);
        ViewGroup viewGroup2 = (ViewGroup) this.f355116e.findViewById(C0966R.C0970id.kox);
        setCanceledOnTouchOutside(true);
        this.f355125q = AnimationUtils.loadAnimation(this.f355115d, C0966R.C0968anim.f2328p);
        this.f355126r = AnimationUtils.loadAnimation(this.f355115d, C0966R.C0968anim.f2328p);
        this.f355127s = AnimationUtils.loadAnimation(this.f355115d, C0966R.C0968anim.f2329q);
        this.f355128t = AnimationUtils.loadAnimation(this.f355115d, C0966R.C0968anim.f2329q);
    }

    /* renamed from: a */
    public void mo183393a(C118675a aVar) {
        CharSequence charSequence = aVar.f355108a;
        if (charSequence != null && ((String) charSequence).length() > 0) {
            TextView textView = this.f355119h;
            if (textView != null) {
                textView.setGravity(1);
            }
            setTitle(aVar.f355108a);
        }
        CharSequence charSequence2 = aVar.f355109b;
        if (charSequence2 != null && ((String) charSequence2).length() > 0) {
            mo183394c(aVar.f355109b);
        }
        CharSequence charSequence3 = aVar.f355109b;
        if (charSequence3 != null && ((String) charSequence3).length() > 0) {
            mo183394c(aVar.f355109b);
        }
        CharSequence charSequence4 = aVar.f355110c;
        if (charSequence4 != null && ((String) charSequence4).length() > 0) {
            CharSequence charSequence5 = aVar.f355110c;
            DialogInterface.OnClickListener onClickListener = aVar.f355113f;
            Button button = this.f355117f;
            if (button != null) {
                button.setVisibility(0);
                this.f355117f.setText(charSequence5);
                this.f355117f.setOnClickListener(new C14870c(this, onClickListener, true));
            }
        }
        CharSequence charSequence6 = aVar.f355111d;
        if (charSequence6 != null && ((String) charSequence6).length() > 0) {
            CharSequence charSequence7 = aVar.f355111d;
            DialogInterface.OnClickListener onClickListener2 = aVar.f355114g;
            Button button2 = this.f355118g;
            if (button2 != null) {
                button2.setVisibility(0);
                this.f355118g.setText(charSequence7);
                this.f355118g.setOnClickListener(new C14871d(this, onClickListener2, true));
            }
        }
        setCancelable(aVar.f355112e);
        if (!aVar.f355112e) {
            super.setCancelable(false);
        }
    }

    /* renamed from: c */
    public void mo183394c(CharSequence charSequence) {
        this.f355123o.setVisibility(0);
        this.f355120i.setVisibility(0);
        this.f355120i.setText(charSequence);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dismiss() {
        /*
            r5 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            java.lang.String r3 = "MicroMsg.MMAlertDialog"
            if (r0 == r1) goto L_0x0026
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            vg3.e$a r1 = new vg3.e$a
            r1.<init>()
            r0.post(r1)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "dialog dismiss error!"
            com.tencent.p014mm.p136ui.C85975v4.m106305b(r3, r1, r0)
            return
        L_0x0026:
            android.content.Context r0 = r5.f355115d     // Catch:{ Exception -> 0x003e }
            if (r0 == 0) goto L_0x003a
            boolean r1 = r0 instanceof android.app.Activity     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x003a
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x003e }
            boolean r0 = r0.isFinishing()     // Catch:{ Exception -> 0x003e }
            if (r0 != 0) goto L_0x0059
            super.dismiss()     // Catch:{ Exception -> 0x003e }
            goto L_0x0059
        L_0x003a:
            super.dismiss()     // Catch:{ Exception -> 0x003e }
            goto L_0x0059
        L_0x003e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "dismiss exception, e = "
            r1.append(r4)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.tencent.p014mm.p136ui.C85975v4.m106305b(r3, r0, r1)
        L_0x0059:
            qo3.e r0 = r5.f355129u
            if (r0 == 0) goto L_0x0060
            r0.onDialogDismiss(r5)
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vg3.C118677e.dismiss():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f355116e);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        setCanceledOnTouchOutside(z);
    }

    public void setTitle(CharSequence charSequence) {
        this.f355122n.setVisibility(0);
        this.f355119h.setVisibility(0);
        this.f355119h.setMaxLines(2);
        this.f355119h.setText(charSequence);
        this.f355119h.getPaint().setFakeBoldText(true);
        int color = this.f355115d.getResources().getColor(C0966R.color.FG_1);
        TextView textView = this.f355120i;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public void show() {
        try {
            super.show();
        } catch (Exception e) {
            C85975v4.m106307d("MicroMsg.MMAlertDialog", e, "", new Object[0]);
        }
    }

    public void setTitle(int i) {
        this.f355122n.setVisibility(0);
        this.f355119h.setVisibility(0);
        this.f355119h.setMaxLines(2);
        this.f355119h.setText(i);
        this.f355119h.getPaint().setFakeBoldText(true);
        int color = this.f355115d.getResources().getColor(C0966R.color.FG_1);
        TextView textView = this.f355120i;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }
}
