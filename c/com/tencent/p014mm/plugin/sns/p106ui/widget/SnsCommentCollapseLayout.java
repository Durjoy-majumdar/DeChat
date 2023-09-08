package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94847c1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import de3.C75355a0;
import gv2.C98240n;
import gv2.C98242p;
import gv2.m$$a;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import qy2.C47895k;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout */
public class SnsCommentCollapseLayout extends RelativeLayout implements C47895k {

    /* renamed from: j */
    public static final /* synthetic */ int f281539j = 0;

    /* renamed from: d */
    public SnsComment2LinePreloadTextView f281540d = null;

    /* renamed from: e */
    public SnsCommentPreloadTextView f281541e = null;

    /* renamed from: f */
    public TextView f281542f = null;

    /* renamed from: g */
    public CharSequence f281543g = null;

    /* renamed from: h */
    public CharSequence f281544h = null;

    /* renamed from: i */
    public int f281545i = 0;

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$a */
    public class C5486a implements View.OnTouchListener {
        public C5486a(SnsCommentCollapseLayout snsCommentCollapseLayout) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/widget/SnsCommentCollapseLayout$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$1");
            if (motionEvent.getAction() == 0) {
                view.setTag(C0966R.C0970id.f359414kt0, new int[]{(int) motionEvent.getRawX(), (int) motionEvent.getRawY()});
            }
            SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$1");
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentCollapseLayout$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$b */
    public class C96299b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CharSequence f281546d;

        /* renamed from: e */
        public final /* synthetic */ int f281547e;

        /* renamed from: f */
        public final /* synthetic */ CharSequence f281548f;

        /* renamed from: g */
        public final /* synthetic */ int f281549g;

        public C96299b(CharSequence charSequence, int i, CharSequence charSequence2, int i2) {
            this.f281546d = charSequence;
            this.f281547e = i;
            this.f281548f = charSequence2;
            this.f281549g = i2;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$3");
            Log.m105919d("MicroMsg.SnsCommentCollapseLayout", "setText text:%s, commentFlag:%s", this.f281546d, Integer.valueOf(this.f281547e));
            SnsCommentCollapseLayout snsCommentCollapseLayout = SnsCommentCollapseLayout.this;
            CharSequence charSequence = this.f281546d;
            CharSequence charSequence2 = "";
            if (charSequence == null) {
                charSequence = charSequence2;
            }
            int i = SnsCommentCollapseLayout.f281539j;
            SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
            snsCommentCollapseLayout.f281543g = charSequence;
            SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
            SnsCommentCollapseLayout snsCommentCollapseLayout2 = SnsCommentCollapseLayout.this;
            CharSequence charSequence3 = this.f281548f;
            if (charSequence3 != null) {
                charSequence2 = charSequence3;
            }
            SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
            snsCommentCollapseLayout2.f281544h = charSequence2;
            SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
            if (this.f281549g > 0) {
                SnsCommentCollapseLayout.m123493c(SnsCommentCollapseLayout.this);
            } else if (C98242p.m126942d(this.f281547e, 16)) {
                SnsCommentCollapseLayout snsCommentCollapseLayout3 = SnsCommentCollapseLayout.this;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
                snsCommentCollapseLayout3.getClass();
                SnsMethodCalculate.markStartTimeMs("switchToShrinkMode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
                snsCommentCollapseLayout3.f281542f.setVisibility(4);
                snsCommentCollapseLayout3.post(new C98240n(snsCommentCollapseLayout3));
                SnsMethodCalculate.markEndTimeMs("switchToShrinkMode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
            } else {
                SnsCommentCollapseLayout.m123493c(SnsCommentCollapseLayout.this);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$c */
    public class C96300c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CharSequence f281551d;

        /* renamed from: e */
        public final /* synthetic */ int f281552e;

        /* renamed from: f */
        public final /* synthetic */ CharSequence f281553f;

        /* renamed from: g */
        public final /* synthetic */ int f281554g;

        public C96300c(CharSequence charSequence, int i, CharSequence charSequence2, int i2) {
            this.f281551d = charSequence;
            this.f281552e = i;
            this.f281553f = charSequence2;
            this.f281554g = i2;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$4");
            Log.m105919d("MicroMsg.SnsCommentCollapseLayout", "setText text:%s, commentFlag:%s", this.f281551d, Integer.valueOf(this.f281552e));
            SnsCommentCollapseLayout snsCommentCollapseLayout = SnsCommentCollapseLayout.this;
            CharSequence charSequence = this.f281551d;
            CharSequence charSequence2 = "";
            if (charSequence == null) {
                charSequence = charSequence2;
            }
            int i = SnsCommentCollapseLayout.f281539j;
            SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
            snsCommentCollapseLayout.f281543g = charSequence;
            SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
            SnsCommentCollapseLayout snsCommentCollapseLayout2 = SnsCommentCollapseLayout.this;
            CharSequence charSequence3 = this.f281553f;
            if (charSequence3 != null) {
                charSequence2 = charSequence3;
            }
            SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
            snsCommentCollapseLayout2.f281544h = charSequence2;
            SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
            if (this.f281554g > 0) {
                SnsCommentCollapseLayout.m123493c(SnsCommentCollapseLayout.this);
            } else if (C98242p.m126942d(this.f281552e, 16)) {
                SnsCommentCollapseLayout snsCommentCollapseLayout3 = SnsCommentCollapseLayout.this;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
                snsCommentCollapseLayout3.getClass();
                SnsMethodCalculate.markStartTimeMs("switchToShrinkMode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
                snsCommentCollapseLayout3.f281542f.setVisibility(4);
                snsCommentCollapseLayout3.post(new C98240n(snsCommentCollapseLayout3));
                SnsMethodCalculate.markEndTimeMs("switchToShrinkMode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
            } else {
                SnsCommentCollapseLayout.m123493c(SnsCommentCollapseLayout.this);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout$4");
        }
    }

    public SnsCommentCollapseLayout(Context context) {
        super(context);
        mo134079d();
    }

    /* renamed from: b */
    public static /* synthetic */ SnsComment2LinePreloadTextView m123492b(SnsCommentCollapseLayout snsCommentCollapseLayout) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        SnsComment2LinePreloadTextView snsComment2LinePreloadTextView = snsCommentCollapseLayout.f281540d;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        return snsComment2LinePreloadTextView;
    }

    /* renamed from: c */
    public static /* synthetic */ void m123493c(SnsCommentCollapseLayout snsCommentCollapseLayout) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        snsCommentCollapseLayout.mo134082g();
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    /* renamed from: a */
    public void mo62348a() {
        SnsMethodCalculate.markStartTimeMs("refreshContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        this.f281540d.invalidate();
        this.f281541e.invalidate();
        SnsMethodCalculate.markEndTimeMs("refreshContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    /* renamed from: d */
    public final void mo134079d() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.c2g, this, true);
        this.f281540d = (SnsComment2LinePreloadTextView) findViewById(C0966R.C0970id.js7);
        this.f281541e = (SnsCommentPreloadTextView) findViewById(C0966R.C0970id.js9);
        this.f281540d.setGravity(16);
        this.f281541e.setGravity(16);
        this.f281542f = (TextView) findViewById(C0966R.C0970id.js8);
        this.f281545i = C76577a.m92151b(getContext(), 22);
        setOnTouchListener(new C5486a(this));
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    /* renamed from: e */
    public void mo134080e(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        SnsMethodCalculate.markStartTimeMs("syncSetText", "com.tencent.mm.plugin.sns.model.SnsConfig");
        C94847c1.m120219g();
        boolean z = C94847c1.f274795e;
        SnsMethodCalculate.markEndTimeMs("syncSetText", "com.tencent.mm.plugin.sns.model.SnsConfig");
        if (z) {
            Log.m105919d("MicroMsg.SnsCommentCollapseLayout", "setText text:%s, commentFlag:%s", charSequence, Integer.valueOf(i));
            CharSequence charSequence3 = "";
            this.f281543g = charSequence == null ? charSequence3 : charSequence;
            if (charSequence2 != null) {
                charSequence3 = charSequence2;
            }
            this.f281544h = charSequence3;
            if (i2 > 0) {
                mo134082g();
            } else if (C98242p.m126942d(i, 16)) {
                SnsMethodCalculate.markStartTimeMs("switchToShrinkMode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
                this.f281542f.setVisibility(4);
                post(new C98240n(this));
                SnsMethodCalculate.markEndTimeMs("switchToShrinkMode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
            } else {
                mo134082g();
            }
            post(new C96299b(charSequence, i, charSequence2, i2));
        } else {
            post(new C96300c(charSequence, i, charSequence2, i2));
        }
        SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    /* renamed from: f */
    public void mo134081f(int i, float f) {
        SnsMethodCalculate.markStartTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        this.f281540d.f266765d.mo138747k(i, f);
        this.f281541e.f266765d.mo138747k(i, f);
        this.f281542f.setTextSize(i, f);
        SnsMethodCalculate.markEndTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    /* renamed from: g */
    public final void mo134082g() {
        SnsMethodCalculate.markStartTimeMs("switchToNormalMode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        this.f281542f.setVisibility(4);
        this.f281541e.setText(this.f281543g);
        this.f281541e.setVisibility(0);
        this.f281540d.setVisibility(8);
        invalidate();
        SnsMethodCalculate.markEndTimeMs("switchToNormalMode", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    public SnsComment2LinePreloadTextView get2LineCommentTv() {
        SnsMethodCalculate.markStartTimeMs("get2LineCommentTv", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        SnsComment2LinePreloadTextView snsComment2LinePreloadTextView = this.f281540d;
        SnsMethodCalculate.markEndTimeMs("get2LineCommentTv", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        return snsComment2LinePreloadTextView;
    }

    public SnsCommentPreloadTextView getNormalCommentTv() {
        SnsMethodCalculate.markStartTimeMs("getNormalCommentTv", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        SnsCommentPreloadTextView snsCommentPreloadTextView = this.f281541e;
        SnsMethodCalculate.markEndTimeMs("getNormalCommentTv", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        return snsCommentPreloadTextView;
    }

    public View getView() {
        SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        return this;
    }

    public void setGravity(int i) {
        SnsMethodCalculate.markStartTimeMs("setGravity", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        this.f281540d.setGravity(i);
        this.f281541e.setGravity(i);
        SnsMethodCalculate.markEndTimeMs("setGravity", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    public void setOpClickListener(View.OnClickListener onClickListener) {
        SnsMethodCalculate.markStartTimeMs("setOpClickListener", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        this.f281542f.setOnClickListener(onClickListener);
        SnsMethodCalculate.markEndTimeMs("setOpClickListener", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    public void setPressTouchListener(C75355a0 a0Var) {
        SnsMethodCalculate.markStartTimeMs("setPressTouchListener", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        this.f281540d.setOnTouchListener(a0Var);
        this.f281541e.setOnTouchListener(a0Var);
        a0Var.f221530q = new m$$a(this);
        SnsMethodCalculate.markEndTimeMs("setPressTouchListener", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    public void setTag(Object obj) {
        SnsMethodCalculate.markStartTimeMs("setTag", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        super.setTag(obj);
        SnsComment2LinePreloadTextView snsComment2LinePreloadTextView = this.f281540d;
        if (snsComment2LinePreloadTextView != null) {
            snsComment2LinePreloadTextView.setTag(obj);
        }
        SnsCommentPreloadTextView snsCommentPreloadTextView = this.f281541e;
        if (snsCommentPreloadTextView != null) {
            snsCommentPreloadTextView.setTag(obj);
        }
        SnsMethodCalculate.markEndTimeMs("setTag", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    public void setTextColor(int i) {
        SnsMethodCalculate.markStartTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        this.f281540d.setTextColor(i);
        this.f281541e.setTextColor(i);
        SnsMethodCalculate.markEndTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    public void setTextSize(float f) {
        SnsMethodCalculate.markStartTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        this.f281540d.setTextSize(f);
        this.f281541e.setTextSize(f);
        SnsMethodCalculate.markEndTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
    }

    public SnsCommentCollapseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo134079d();
    }

    public SnsCommentCollapseLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo134079d();
    }
}
