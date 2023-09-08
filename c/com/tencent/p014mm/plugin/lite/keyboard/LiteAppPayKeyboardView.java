package com.tencent.p014mm.plugin.lite.keyboard;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.lite.keyboard.LiteAppPayKeyboardView */
public class LiteAppPayKeyboardView extends RelativeLayout {

    /* renamed from: d */
    public TextView f313501d;

    /* renamed from: e */
    public TextView f313502e;

    /* renamed from: f */
    public TextView f313503f;

    /* renamed from: g */
    public TextView f313504g;

    /* renamed from: h */
    public TextView f313505h;

    /* renamed from: i */
    public TextView f313506i;

    /* renamed from: j */
    public TextView f313507j;

    /* renamed from: n */
    public TextView f313508n;

    /* renamed from: o */
    public TextView f313509o;

    /* renamed from: p */
    public TextView f313510p;

    /* renamed from: q */
    public TextView f313511q;

    /* renamed from: r */
    public TextView f313512r;

    /* renamed from: s */
    public View f313513s;

    /* renamed from: t */
    public WeImageView f313514t;

    /* renamed from: u */
    public LinearLayout f313515u;

    /* renamed from: v */
    public Boolean f313516v = null;

    /* renamed from: w */
    public boolean f313517w = true;

    /* renamed from: x */
    public InputConnection f313518x;

    /* renamed from: com.tencent.mm.plugin.lite.keyboard.LiteAppPayKeyboardView$a */
    public class C105445a implements View.OnClickListener {
        public C105445a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/lite/keyboard/LiteAppPayKeyboardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (LiteAppPayKeyboardView.this.f313518x == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/lite/keyboard/LiteAppPayKeyboardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            int i = view.getId() == C0966R.C0970id.fff ? 7 : view.getId() == C0966R.C0970id.ffg ? 8 : view.getId() == C0966R.C0970id.ffh ? 9 : view.getId() == C0966R.C0970id.ffi ? 10 : view.getId() == C0966R.C0970id.ffj ? 11 : view.getId() == C0966R.C0970id.ffk ? 12 : view.getId() == C0966R.C0970id.ffl ? 13 : view.getId() == C0966R.C0970id.ffm ? 14 : view.getId() == C0966R.C0970id.ffn ? 15 : view.getId() == C0966R.C0970id.ffo ? 16 : view.getId() == C0966R.C0970id.ffw ? 67 : view.getId() == C0966R.C0970id.f358495fg3 ? 56 : view.getId() == C0966R.C0970id.ffp ? 66 : 0;
            if (!Util.isEqual(i, 0)) {
                view.performHapticFeedback(0, 2);
            }
            LiteAppPayKeyboardView.this.f313518x.sendKeyEvent(new KeyEvent(0, i));
            LiteAppPayKeyboardView.this.f313518x.sendKeyEvent(new KeyEvent(1, i));
            C117292a.m165361g(this, "com/tencent/mm/plugin/lite/keyboard/LiteAppPayKeyboardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.keyboard.LiteAppPayKeyboardView$b */
    public interface C105446b {
    }

    public LiteAppPayKeyboardView(Context context) {
        super(context);
        mo150191b();
    }

    /* renamed from: a */
    public final ColorStateList mo150190a(int i) {
        int[][] iArr = {new int[]{16842919}, new int[]{-16842910}, new int[0]};
        int[] iArr2 = new int[3];
        Boolean bool = this.f313516v;
        float f = 1.0f - (bool != null ? bool.booleanValue() ^ true : C85875k4.m106211z() ? 0.6f : 0.1f);
        iArr2[0] = Color.argb(Color.alpha(i), Math.round(((float) Color.red(i)) * f), Math.round(((float) Color.green(i)) * f), Math.round(f * ((float) Color.blue(i))));
        iArr2[1] = Color.argb(Math.round(((float) Color.alpha(i)) * 0.6f), Color.red(i), Color.green(i), Color.blue(i));
        iArr2[2] = i;
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: b */
    public final void mo150191b() {
        if (this.f313517w) {
            LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.d8n, this, true);
        } else {
            LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.d8o, this, true);
        }
        this.f313515u = (LinearLayout) findViewById(C0966R.C0970id.ffr);
        this.f313510p = (TextView) findViewById(C0966R.C0970id.fff);
        this.f313501d = (TextView) findViewById(C0966R.C0970id.ffg);
        this.f313502e = (TextView) findViewById(C0966R.C0970id.ffh);
        this.f313503f = (TextView) findViewById(C0966R.C0970id.ffi);
        this.f313504g = (TextView) findViewById(C0966R.C0970id.ffj);
        this.f313505h = (TextView) findViewById(C0966R.C0970id.ffk);
        this.f313506i = (TextView) findViewById(C0966R.C0970id.ffl);
        this.f313507j = (TextView) findViewById(C0966R.C0970id.ffm);
        this.f313508n = (TextView) findViewById(C0966R.C0970id.ffn);
        this.f313509o = (TextView) findViewById(C0966R.C0970id.ffo);
        this.f313511q = (TextView) findViewById(C0966R.C0970id.f358495fg3);
        this.f313513s = findViewById(C0966R.C0970id.ffw);
        this.f313512r = (TextView) findViewById(C0966R.C0970id.ffp);
        this.f313514t = (WeImageView) findViewById(C0966R.C0970id.ofb);
        if (this.f313512r == null) {
            this.f313512r = new TextView(getContext());
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.nnw);
        this.f313512r.setTypeface(Typeface.defaultFromStyle(1));
        this.f313512r.setTextSize(1, C76577a.m92165p(getContext()) * 17.0f);
        C105445a aVar = new C105445a();
        this.f313515u.setOnClickListener(aVar);
        this.f313510p.setOnClickListener(aVar);
        this.f313501d.setOnClickListener(aVar);
        this.f313502e.setOnClickListener(aVar);
        this.f313503f.setOnClickListener(aVar);
        this.f313504g.setOnClickListener(aVar);
        this.f313505h.setOnClickListener(aVar);
        this.f313506i.setOnClickListener(aVar);
        this.f313507j.setOnClickListener(aVar);
        this.f313508n.setOnClickListener(aVar);
        this.f313509o.setOnClickListener(aVar);
        this.f313513s.setOnClickListener(aVar);
        this.f313511q.setOnClickListener(aVar);
        this.f313512r.setOnClickListener(aVar);
    }

    public void setActionText(String str) {
        this.f313512r.setText(str);
    }

    public void setConfirmBgColor(int i) {
        this.f313512r.getBackground().setTintList(mo150190a(i));
    }

    public void setConfirmColor(int i) {
        this.f313512r.setTextColor(mo150190a(i));
    }

    public void setForceLight(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        this.f313516v = valueOf;
        if (valueOf.booleanValue() && C85875k4.m106211z()) {
            this.f313501d.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            this.f313501d.setBackgroundResource(C0966R.C0969drawable.cqh);
            this.f313502e.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            this.f313502e.setBackgroundResource(C0966R.C0969drawable.cqh);
            this.f313503f.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            this.f313503f.setBackgroundResource(C0966R.C0969drawable.cqh);
            this.f313504g.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            this.f313504g.setBackgroundResource(C0966R.C0969drawable.cqh);
            this.f313505h.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            this.f313505h.setBackgroundResource(C0966R.C0969drawable.cqh);
            this.f313506i.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            this.f313506i.setBackgroundResource(C0966R.C0969drawable.cqh);
            this.f313507j.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            this.f313507j.setBackgroundResource(C0966R.C0969drawable.cqh);
            this.f313508n.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            this.f313508n.setBackgroundResource(C0966R.C0969drawable.cqh);
            this.f313509o.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            this.f313509o.setBackgroundResource(C0966R.C0969drawable.cqh);
            this.f313511q.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            this.f313511q.setBackgroundResource(C0966R.C0969drawable.cqh);
            this.f313510p.setTextColor(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            this.f313510p.setBackgroundResource(C0966R.C0969drawable.cqh);
            this.f313513s.setBackgroundResource(C0966R.C0969drawable.cqh);
            this.f313514t.setEnableColorFilter(false);
            this.f313515u.setBackgroundResource(C0966R.color.UN_BW_97);
        }
    }

    public void setHeightListener(C105446b bVar) {
    }

    public void setIsOnlySupportInteger(boolean z) {
        if (z) {
            this.f313511q.setVisibility(8);
            GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) this.f313510p.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.columnSpec = GridLayout.spec(0, 3, 1.0f);
                this.f313510p.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f313511q.setVisibility(0);
        GridLayout.LayoutParams layoutParams2 = (GridLayout.LayoutParams) this.f313510p.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.columnSpec = GridLayout.spec(0, 2, 1.0f);
            this.f313510p.setLayoutParams(layoutParams2);
        }
    }

    public LiteAppPayKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo150191b();
    }

    public LiteAppPayKeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo150191b();
    }
}
