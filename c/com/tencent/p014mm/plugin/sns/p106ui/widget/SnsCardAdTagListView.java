package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView */
public class SnsCardAdTagListView extends LinearLayout {

    /* renamed from: h */
    public static final /* synthetic */ int f281529h = 0;

    /* renamed from: d */
    public List<View> f281530d = new ArrayList();

    /* renamed from: e */
    public int f281531e;

    /* renamed from: f */
    public Activity f281532f;

    /* renamed from: g */
    public volatile String f281533g;

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView$a */
    public class C96298a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f281534d;

        /* renamed from: e */
        public final /* synthetic */ View f281535e;

        public C96298a(TextView textView, View view) {
            this.f281534d = textView;
            this.f281535e = view;
        }

        public boolean onPreDraw() {
            CharSequence text;
            SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView$1");
            if (!(this.f281534d.getLayout() == null || (text = this.f281534d.getLayout().getText()) == null)) {
                String charSequence = text.toString();
                if (Util.isNullOrNil(charSequence) || charSequence.indexOf(8230) >= 0) {
                    SnsCardAdTagListView.this.removeView(this.f281535e);
                    SnsCardAdTagListView snsCardAdTagListView = SnsCardAdTagListView.this;
                    int i = SnsCardAdTagListView.f281529h;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                    List<View> list = snsCardAdTagListView.f281530d;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                    ((ArrayList) list).remove(this.f281535e);
                }
            }
            SnsCardAdTagListView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView$1");
            return true;
        }
    }

    public SnsCardAdTagListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo134071a(java.util.List<com.tencent.p014mm.plugin.sns.storage.ADXml.C95015d> r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r3 = "addTag"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            if (r2 == 0) goto L_0x01ca
            r6 = 0
        L_0x000e:
            int r0 = r17.size()
            if (r6 >= r0) goto L_0x01ca
            if (r6 != 0) goto L_0x0018
            r7 = 0
            goto L_0x001a
        L_0x0018:
            r0 = 1
            r7 = 1
        L_0x001a:
            java.lang.Object r0 = r2.get(r6)
            r8 = r0
            com.tencent.mm.plugin.sns.storage.ADXml$d r8 = (com.tencent.p014mm.plugin.sns.storage.ADXml.C95015d) r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            if (r8 != 0) goto L_0x002c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r10 = 0
            goto L_0x01c6
        L_0x002c:
            java.lang.String r9 = r8.f275673a
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            r10 = 2131101493(0x7f060735, float:1.7815397E38)
            java.lang.String r11 = "MicroMsg.SnsCardTagListView"
            r12 = 2131100381(0x7f0602dd, float:1.7813142E38)
            if (r0 == 0) goto L_0x00a2
            java.lang.String r13 = r8.f275675c
            java.lang.String r0 = r8.f275679g     // Catch:{ all -> 0x005b }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0053
            android.content.Context r0 = r16.getContext()     // Catch:{ all -> 0x005b }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x005b }
            int r0 = r0.getColor(r12)     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x0053:
            java.lang.String r0 = r8.f275679g     // Catch:{ all -> 0x005b }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ all -> 0x005b }
        L_0x0059:
            r12 = r0
            goto L_0x006f
        L_0x005b:
            r0 = move-exception
            android.content.Context r14 = r16.getContext()
            android.content.res.Resources r14 = r14.getResources()
            int r12 = r14.getColor(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
        L_0x006f:
            java.lang.String r0 = r8.f275677e     // Catch:{ all -> 0x008d }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0085
            android.content.Context r0 = r16.getContext()     // Catch:{ all -> 0x008d }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x008d }
            int r0 = r0.getColor(r10)     // Catch:{ all -> 0x008d }
            goto L_0x0106
        L_0x0085:
            java.lang.String r0 = r8.f275677e     // Catch:{ all -> 0x008d }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ all -> 0x008d }
            goto L_0x0106
        L_0x008d:
            r0 = move-exception
            android.content.Context r8 = r16.getContext()
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getColor(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            goto L_0x0105
        L_0x00a2:
            java.lang.String r13 = r8.f275674b
            java.lang.String r0 = r8.f275678f     // Catch:{ all -> 0x00c1 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x00b9
            android.content.Context r0 = r16.getContext()     // Catch:{ all -> 0x00c1 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x00c1 }
            int r0 = r0.getColor(r12)     // Catch:{ all -> 0x00c1 }
            goto L_0x00bf
        L_0x00b9:
            java.lang.String r0 = r8.f275678f     // Catch:{ all -> 0x00c1 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ all -> 0x00c1 }
        L_0x00bf:
            r12 = r0
            goto L_0x00d5
        L_0x00c1:
            r0 = move-exception
            android.content.Context r14 = r16.getContext()
            android.content.res.Resources r14 = r14.getResources()
            int r12 = r14.getColor(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
        L_0x00d5:
            java.lang.String r0 = r8.f275676d     // Catch:{ all -> 0x00f1 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x00ea
            android.content.Context r0 = r16.getContext()     // Catch:{ all -> 0x00f1 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x00f1 }
            int r0 = r0.getColor(r10)     // Catch:{ all -> 0x00f1 }
            goto L_0x0106
        L_0x00ea:
            java.lang.String r0 = r8.f275676d     // Catch:{ all -> 0x00f1 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ all -> 0x00f1 }
            goto L_0x0106
        L_0x00f1:
            r0 = move-exception
            android.content.Context r8 = r16.getContext()
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getColor(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
        L_0x0105:
            r0 = r8
        L_0x0106:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r8 != 0) goto L_0x01c2
            android.app.Activity r8 = r1.f281532f
            android.view.LayoutInflater r8 = r8.getLayoutInflater()
            r10 = 2131492986(0x7f0c007a, float:1.860944E38)
            r11 = 0
            android.view.View r8 = r8.inflate(r10, r11)
            android.graphics.drawable.Drawable r10 = r8.getBackground()
            android.graphics.PorterDuff$Mode r14 = android.graphics.PorterDuff.Mode.SRC
            r10.setColorFilter(r0, r14)
            r0 = 2131298691(0x7f090983, float:1.8215362E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10 = 2131298689(0x7f090981, float:1.8215358E38)
            android.view.View r10 = r8.findViewById(r10)
            com.tencent.mm.ui.widget.imageview.WeImageView r10 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r10
            r14 = 8
            r10.setVisibility(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r15 = -2
            r14.<init>(r15, r15)
            if (r7 == 0) goto L_0x0146
            int r7 = r1.f281531e
            r14.leftMargin = r7
        L_0x0146:
            r0.setText(r9)
            r0.setTextColor(r12)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r7 != 0) goto L_0x01b6
            java.lang.String r7 = "loadTagIcon"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r4)
            r9 = 2131313761(0x7f094461, float:1.8245928E38)
            java.lang.Object r12 = r10.getTag(r9)
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = android.text.TextUtils.equals(r12, r13)
            if (r12 != 0) goto L_0x01b1
            r10.setImageDrawable(r11)
            java.lang.String r11 = "loadImage"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            boolean r15 = android.text.TextUtils.isEmpty(r13)
            if (r15 == 0) goto L_0x017c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            goto L_0x01b1
        L_0x017c:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r5 = "loadImage, hash="
            r15.append(r5)
            int r5 = r10.hashCode()
            r15.append(r5)
            java.lang.String r5 = ", url="
            r15.append(r5)
            r15.append(r13)
            java.lang.String r5 = r15.toString()
            java.lang.String r15 = "SnsCardAdTagUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r5)
            r10.setTag(r9, r13)
            r5 = 41
            gv2.k r9 = new gv2.k
            r9.<init>(r10, r13, r0)
            r10 = 0
            ps2.C100891r.m132206a(r13, r10, r5, r10, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            goto L_0x01b2
        L_0x01b1:
            r10 = 0
        L_0x01b2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            goto L_0x01b7
        L_0x01b6:
            r10 = 0
        L_0x01b7:
            r1.addView(r8, r14)
            java.util.List<android.view.View> r0 = r1.f281530d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r8)
            goto L_0x01c3
        L_0x01c2:
            r10 = 0
        L_0x01c3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
        L_0x01c6:
            int r6 = r6 + 1
            goto L_0x000e
        L_0x01ca:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCardAdTagListView.mo134071a(java.util.List):void");
    }

    public String getOriginSnsId() {
        SnsMethodCalculate.markStartTimeMs("getOriginSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        String str = this.f281533g;
        SnsMethodCalculate.markEndTimeMs("getOriginSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        return str;
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        super.onMeasure(i, i2);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= ((ArrayList) this.f281530d).size()) {
                break;
            }
            if (i3 > 0) {
                i4 += this.f281531e;
            }
            if (i4 >= getMeasuredWidth()) {
                i3--;
                break;
            }
            i4 += ((View) ((ArrayList) this.f281530d).get(i3)).getMeasuredWidth();
            if (i4 >= getMeasuredWidth()) {
                break;
            }
            i3++;
        }
        if (i3 >= 0 && i3 < ((ArrayList) this.f281530d).size()) {
            View view = (View) ((ArrayList) this.f281530d).get(i3);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.f357613as0);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            getViewTreeObserver().addOnPreDrawListener(new C96298a(textView, view));
            while (true) {
                i3++;
                if (i3 >= ((ArrayList) this.f281530d).size()) {
                    break;
                }
                removeView((View) ((ArrayList) this.f281530d).get(i3));
                ((ArrayList) this.f281530d).remove(i3);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    public void removeAllViews() {
        SnsMethodCalculate.markStartTimeMs("removeAllViews", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        super.removeAllViews();
        ((ArrayList) this.f281530d).clear();
        SnsMethodCalculate.markEndTimeMs("removeAllViews", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    public void setActivityContext(Activity activity) {
        SnsMethodCalculate.markStartTimeMs("setActivityContext", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        this.f281532f = activity;
        SnsMethodCalculate.markEndTimeMs("setActivityContext", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    public void setOriginSnsId(String str) {
        SnsMethodCalculate.markStartTimeMs("setOriginSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        this.f281533g = str;
        SnsMethodCalculate.markEndTimeMs("setOriginSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    public void setTagSpace(int i) {
        SnsMethodCalculate.markStartTimeMs("setTagSpace", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        this.f281531e = i;
        SnsMethodCalculate.markEndTimeMs("setTagSpace", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    public SnsCardAdTagListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
