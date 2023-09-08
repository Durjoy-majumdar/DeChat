package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import di3.C86312j;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankChampionInfoView */
public class ExdeviceRankChampionInfoView extends LinearLayout {

    /* renamed from: d */
    public TextView f12330d;

    /* renamed from: e */
    public ImageView f12331e;

    /* renamed from: f */
    public String f12332f;

    /* renamed from: g */
    public TextPaint f12333g;

    /* renamed from: h */
    public int f12334h = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0061, code lost:
        if (r5.f12334h > 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0063, code lost:
        r5.f12334h = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.ExdeviceRankChampionInfoView", "ap: ellipsizewidth: %d", java.lang.Integer.valueOf(r5.f12334h));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0052, code lost:
        if (r6 <= 0) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExdeviceRankChampionInfoView(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            r5.<init>(r6, r7)
            r7 = 0
            r5.f12334h = r7
            java.lang.String r0 = "MicroMsg.ExdeviceRankChampionInfoView"
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r6)
            r2 = 2131494288(0x7f0c0590, float:1.861208E38)
            r3 = 1
            android.view.View r1 = r1.inflate(r2, r5, r3)
            android.text.TextPaint r2 = new android.text.TextPaint
            r2.<init>(r3)
            r5.f12333g = r2
            r2 = 2131315363(0x7f094aa3, float:1.8249177E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r5.f12330d = r2
            r2 = 2131297456(0x7f0904b0, float:1.8212857E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5.f12331e = r1
            com.tencent.mm.plugin.exdevice.ui.t0 r2 = new com.tencent.mm.plugin.exdevice.ui.t0
            r2.<init>(r5, r6)
            r1.setOnClickListener(r2)
            android.widget.TextView r1 = r5.f12330d
            com.tencent.mm.plugin.exdevice.ui.u0 r2 = new com.tencent.mm.plugin.exdevice.ui.u0
            r2.<init>(r5, r6)
            r1.setOnClickListener(r2)
            r1 = 128(0x80, float:1.794E-43)
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ Exception -> 0x0057 }
            r2 = 2131165403(0x7f0700db, float:1.7945022E38)
            int r6 = r6.getDimensionPixelSize(r2)     // Catch:{ Exception -> 0x0057 }
            r5.f12334h = r6     // Catch:{ Exception -> 0x0057 }
            if (r6 > 0) goto L_0x0065
            goto L_0x0063
        L_0x0055:
            r6 = move-exception
            goto L_0x0075
        L_0x0057:
            r6 = move-exception
            java.lang.String r2 = ""
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ all -> 0x0055 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r6, r2, r4)     // Catch:{ all -> 0x0055 }
            int r6 = r5.f12334h
            if (r6 > 0) goto L_0x0065
        L_0x0063:
            r5.f12334h = r1
        L_0x0065:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            int r1 = r5.f12334h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6[r7] = r1
            java.lang.String r7 = "ap: ellipsizewidth: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r7, r6)
            return
        L_0x0075:
            int r7 = r5.f12334h
            if (r7 > 0) goto L_0x007b
            r5.f12334h = r1
        L_0x007b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceRankChampionInfoView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public void mo2146a(String str) {
        Class cls = C76979h.class;
        this.f12332f = str;
        if (this.f12330d != null) {
            if (!Util.isNullOrNil(str)) {
                this.f12330d.setVisibility(0);
                String string = getContext().getString(C0966R.string.cco, new Object[]{TextUtils.ellipsize(((C76979h) C86312j.m106911c(cls)).mo107057T1(getContext(), ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f12332f)), this.f12333g, (float) this.f12334h, TextUtils.TruncateAt.END)});
                Log.m105919d("MicroMsg.ExdeviceRankChampionInfoView", "title : %s", ((C76979h) C86312j.m106911c(cls)).mo107057T1(getContext(), string));
                this.f12330d.setText(((C76979h) C86312j.m106911c(cls)).yp0(getContext(), string, this.f12330d.getTextSize()));
            } else {
                this.f12330d.setVisibility(8);
                this.f12330d.setText("");
            }
        }
        if (this.f12331e == null) {
            return;
        }
        if (!Util.isNullOrNil(str)) {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(this.f12331e, str);
            this.f12331e.setVisibility(0);
            return;
        }
        this.f12331e.setVisibility(4);
    }

    public void setAlpha(float f) {
        this.f12330d.setAlpha(f);
        this.f12331e.setAlpha(f);
    }
}
