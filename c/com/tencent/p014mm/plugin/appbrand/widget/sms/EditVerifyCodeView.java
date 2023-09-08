package com.tencent.p014mm.plugin.appbrand.widget.sms;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import zt0.C79430a;
import zt0.C79431b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView */
public class EditVerifyCodeView extends RelativeLayout {

    /* renamed from: d */
    public Context f197411d;

    /* renamed from: e */
    public StringBuilder f197412e = new StringBuilder();

    /* renamed from: f */
    public ImageView[] f197413f = new ImageView[6];

    /* renamed from: g */
    public TextView[] f197414g = new TextView[6];

    /* renamed from: h */
    public VerifyCodeEditText f197415h;

    /* renamed from: i */
    public View.OnKeyListener f197416i = new C68732a();

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView$a */
    public class C68732a implements View.OnKeyListener {
        public C68732a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/sms/EditVerifyCodeView$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            if (i == 67 && keyEvent.getAction() == 1) {
                EditVerifyCodeView editVerifyCodeView = EditVerifyCodeView.this;
                String sb = editVerifyCodeView.f197412e.toString();
                Log.m105924i("MicroMsg.EditVerifyCodeView", "del before str:" + editVerifyCodeView.f197412e);
                int length = sb.length();
                if (length != 0) {
                    if (length > 0 && length <= 6) {
                        int i2 = length - 1;
                        editVerifyCodeView.f197412e.delete(i2, length);
                        editVerifyCodeView.f197414g[i2].setVisibility(4);
                        editVerifyCodeView.f197414g[i2].setText("");
                        editVerifyCodeView.f197413f[i2].setVisibility(0);
                    }
                    Log.m105924i("MicroMsg.EditVerifyCodeView", "del after str:" + editVerifyCodeView.f197412e);
                }
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/appbrand/widget/sms/EditVerifyCodeView$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return true;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/widget/sms/EditVerifyCodeView$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView$b */
    public interface C68733b {
        /* renamed from: a */
        void mo94535a(String str);
    }

    public EditVerifyCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo94529a(context);
    }

    /* renamed from: a */
    public final void mo94529a(Context context) {
        this.f197411d = context;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.a0e, (ViewGroup) null);
        TextView[] textViewArr = this.f197414g;
        textViewArr[0] = (TextView) inflate.findViewById(C0966R.C0970id.f357724bg0);
        textViewArr[1] = (TextView) inflate.findViewById(C0966R.C0970id.f357725bg1);
        textViewArr[2] = (TextView) inflate.findViewById(C0966R.C0970id.f357726bg2);
        textViewArr[3] = (TextView) inflate.findViewById(C0966R.C0970id.f357727bg3);
        textViewArr[4] = (TextView) inflate.findViewById(C0966R.C0970id.bg4);
        textViewArr[5] = (TextView) inflate.findViewById(C0966R.C0970id.bg5);
        ImageView[] imageViewArr = this.f197413f;
        imageViewArr[0] = (ImageView) inflate.findViewById(C0966R.C0970id.bfg);
        imageViewArr[1] = (ImageView) inflate.findViewById(C0966R.C0970id.bfh);
        imageViewArr[2] = (ImageView) inflate.findViewById(C0966R.C0970id.bfi);
        imageViewArr[3] = (ImageView) inflate.findViewById(C0966R.C0970id.bfj);
        imageViewArr[4] = (ImageView) inflate.findViewById(C0966R.C0970id.bfk);
        imageViewArr[5] = (ImageView) inflate.findViewById(C0966R.C0970id.bfl);
        VerifyCodeEditText verifyCodeEditText = (VerifyCodeEditText) inflate.findViewById(C0966R.C0970id.f359481l40);
        this.f197415h = verifyCodeEditText;
        verifyCodeEditText.addTextChangedListener(new C79430a(this));
        this.f197415h.setKeyListener(new C79431b(this));
        this.f197415h.setOnKeyListener(this.f197416i);
        addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
    }

    public VerifyCodeEditText getEditText() {
        return this.f197415h;
    }

    public String getText() {
        return this.f197412e.toString();
    }

    public void setCodeEditCompleListener(C68733b bVar) {
    }

    public void setText(String str) {
        StringBuilder sb = this.f197412e;
        sb.delete(0, sb.length());
        this.f197412e.append(str);
        String sb4 = this.f197412e.toString();
        int length = sb4.length();
        Log.m105924i("MicroMsg.EditVerifyCodeView", "mBuilder:" + this.f197412e);
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                this.f197414g[i].setVisibility(0);
                this.f197414g[i].setText(String.valueOf(sb4.charAt(i)));
                this.f197413f[i].setVisibility(4);
            }
            return;
        }
        for (int i2 = 0; i2 < 6; i2++) {
            this.f197414g[i2].setVisibility(4);
            this.f197414g[i2].setText("");
            this.f197413f[i2].setVisibility(0);
        }
    }

    public EditVerifyCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo94529a(context);
    }
}
