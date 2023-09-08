package com.tencent.p014mm.plugin.mall.p075ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import b63.C28271z;
import c63.C0425a;
import com.tencent.p014mm.C0966R;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.mall.ui.BannerActView */
public class BannerActView extends LinearLayout {

    /* renamed from: d */
    public List<C0425a> f19966d;

    /* renamed from: e */
    public TextView f19967e = ((TextView) LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6564if, this, true).findViewById(C0966R.C0970id.glh));

    public BannerActView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnClickListener(new C4888a(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setActivityList(java.util.List<c63.C0425a> r8) {
        /*
            r7 = this;
            r7.f19966d = r8
            r0 = 8
            if (r8 == 0) goto L_0x008d
            int r8 = r8.size()
            r1 = 1
            if (r8 >= r1) goto L_0x000f
            goto L_0x008d
        L_0x000f:
            java.util.List<c63.a> r8 = r7.f19966d
            f40.C86709a0.m107528h()
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 270342(0x42006, float:3.7883E-40)
            java.lang.Object r2 = r2.mo119684e(r5, r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r8 == 0) goto L_0x0073
            int r4 = r8.size()
            int r4 = r4 - r1
        L_0x0035:
            if (r4 < 0) goto L_0x0073
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "i:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r6 = ", lastClickedListMaxId:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ", actId:"
            r5.append(r6)
            java.lang.Object r6 = r8.get(r4)
            c63.a r6 = (c63.C0425a) r6
            int r6 = r6.f1047a
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.MallLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r5)
            java.lang.Object r5 = r8.get(r4)
            c63.a r5 = (c63.C0425a) r5
            int r5 = r5.f1047a
            if (r5 <= r2) goto L_0x0070
            goto L_0x0074
        L_0x0070:
            int r4 = r4 + -1
            goto L_0x0035
        L_0x0073:
            r1 = 0
        L_0x0074:
            if (r1 == 0) goto L_0x0089
            android.widget.TextView r8 = r7.f19967e
            java.util.List<c63.a> r0 = r7.f19966d
            java.lang.Object r0 = r0.get(r3)
            c63.a r0 = (c63.C0425a) r0
            java.lang.String r0 = r0.f1048b
            r8.setText(r0)
            r7.setVisibility(r3)
            goto L_0x0097
        L_0x0089:
            r7.setVisibility(r0)
            goto L_0x0097
        L_0x008d:
            java.lang.String r8 = "MicroMsg.BannerActivityView"
            java.lang.String r1 = "func[setActivityList] actList null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            r7.setVisibility(r0)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mall.p075ui.BannerActView.setActivityList(java.util.List):void");
    }

    public void setData(C28271z zVar) {
        if (zVar != null) {
            this.f19967e.setText(zVar.field_bulletin_content);
            setVisibility(0);
            return;
        }
        setVisibility(8);
    }
}
