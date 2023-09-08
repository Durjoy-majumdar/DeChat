package t51;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.eggspring.p882ui.SpringLuckyEggActivity;

/* renamed from: t51.f */
public final class C110914f<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ SpringLuckyEggActivity f331726d;

    public C110914f(SpringLuckyEggActivity springLuckyEggActivity) {
        this.f331726d = springLuckyEggActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if ((r0 == 2 || r0 == 1) == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(T r11) {
        /*
            r10 = this;
            rk.n r11 = (p821rk.C48041n) r11
            if (r11 != 0) goto L_0x0006
            goto L_0x01b0
        L_0x0006:
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r0 = r10.f331726d
            t51.q r0 = r0.f312423f
            java.lang.String r1 = "viewBinding"
            r2 = 0
            if (r0 == 0) goto L_0x01c9
            android.widget.TextView r0 = r0.f331757m
            java.lang.String r3 = r11.f128865g
            r0.setText(r3)
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r0 = r10.f331726d
            t51.q r0 = r0.f312423f
            if (r0 == 0) goto L_0x01c5
            android.widget.TextView r0 = r0.f331758n
            java.lang.String r3 = r11.f128866h
            r0.setText(r3)
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r0 = r10.f331726d
            t51.w r0 = r0.mo149514M7()
            androidx.lifecycle.z<java.lang.Boolean> r0 = r0.f331795s
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r0 = gy3.C87412m.m108589b(r0, r3)
            r3 = 2
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0047
            int r0 = r11.f128862d
            if (r0 == r3) goto L_0x0044
            if (r0 != r4) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r0 = 0
            goto L_0x0045
        L_0x0044:
            r0 = 1
        L_0x0045:
            if (r0 != 0) goto L_0x0054
        L_0x0047:
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r0 = r10.f331726d
            t51.q r0 = r0.f312423f
            if (r0 == 0) goto L_0x01c1
            android.widget.Button r0 = r0.f331759o
            java.lang.String r6 = r11.f128867i
            r0.setText(r6)
        L_0x0054:
            rk.o r0 = r11.f128877v
            rk.q r0 = r0.f128882d
            if (r0 == 0) goto L_0x006c
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r6 = r10.f331726d
            t51.q r6 = r6.f312423f
            if (r6 == 0) goto L_0x0068
            android.widget.TextView r6 = r6.f331763s
            java.lang.String r0 = r0.f128889d
            r6.setText(r0)
            goto L_0x006c
        L_0x0068:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x006c:
            java.lang.String r0 = r11.f128874s
            if (r0 == 0) goto L_0x0079
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r0 = 0
            goto L_0x007a
        L_0x0079:
            r0 = 1
        L_0x007a:
            if (r0 != 0) goto L_0x013c
            int r0 = r11.f128873r
            java.lang.String r6 = "material.creative_url"
            if (r0 != r3) goto L_0x0128
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r0 = r10.f331726d
            t51.x r3 = new t51.x
            t51.q r7 = r0.f312423f
            if (r7 == 0) goto L_0x0124
            com.tencent.mm.plugin.eggspring.ui.SpringEggVideoView r8 = r7.f331765u
            java.lang.String r9 = r11.f128874s
            gy3.C87412m.m108593f(r9, r6)
            r3.<init>(r8, r7, r9)
            r0.f312424g = r3
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r0 = r10.f331726d
            t51.x r0 = r0.f312424g
            if (r0 == 0) goto L_0x00d9
            java.lang.String r3 = "MicroMsg.VideoController"
            java.lang.String r6 = "start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            com.tencent.mm.plugin.eggspring.ui.SpringEggVideoView r6 = r0.f297775d
            r6.start()
            com.tencent.mm.plugin.eggspring.ui.SpringEggVideoView r6 = r0.f297775d
            android.content.Context r6 = r6.getContext()
            java.lang.String r7 = "audio"
            java.lang.Object r6 = r6.getSystemService(r7)
            java.lang.String r7 = "null cannot be cast to non-null type android.media.AudioManager"
            gy3.C87412m.m108592e(r6, r7)
            android.media.AudioManager r6 = (android.media.AudioManager) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "init: rangerMode="
            r7.append(r8)
            int r6 = r6.getRingerMode()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            com.tencent.mm.plugin.eggspring.ui.SpringEggVideoView r0 = r0.f297775d
            r0.setVisibility(r5)
        L_0x00d9:
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r0 = r10.f331726d
            t51.q r0 = r0.f312423f
            if (r0 == 0) goto L_0x0120
            android.view.ViewGroup r0 = r0.f331760p
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            gy3.C87412m.m108592e(r0, r3)
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r3 = -1
            r0.width = r3
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r3 = r10.f331726d
            android.content.res.Resources r3 = r3.getResources()
            r6 = 2131166037(0x7f070355, float:1.7946308E38)
            int r3 = r3.getDimensionPixelSize(r6)
            r0.height = r3
            r0.topMargin = r5
            r3 = 17
            r0.gravity = r3
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r0 = r10.f331726d
            t51.q r0 = r0.f312423f
            if (r0 == 0) goto L_0x011c
            android.view.ViewGroup r0 = r0.f331760p
            r0.requestLayout()
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r0 = r10.f331726d
            java.lang.String r3 = r11.f128875t
            java.lang.String r6 = "material.thumb_url"
            gy3.C87412m.m108593f(r3, r6)
            com.tencent.p014mm.plugin.eggspring.p882ui.SpringLuckyEggActivity.m141270K7(r0, r3, r5)
            goto L_0x013c
        L_0x011c:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x0120:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x0124:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x0128:
            if (r0 != r4) goto L_0x013c
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r0 = r10.f331726d
            java.lang.String r3 = r11.f128874s
            gy3.C87412m.m108593f(r3, r6)
            int r6 = r11.f128862d
            r7 = 4
            if (r6 != r7) goto L_0x0138
            r6 = 1
            goto L_0x0139
        L_0x0138:
            r6 = 0
        L_0x0139:
            com.tencent.p014mm.plugin.eggspring.p882ui.SpringLuckyEggActivity.m141270K7(r0, r3, r6)
        L_0x013c:
            int r11 = r11.f128862d
            r0 = 6
            if (r11 != r0) goto L_0x0142
            goto L_0x0143
        L_0x0142:
            r4 = 0
        L_0x0143:
            r11 = 8
            if (r4 == 0) goto L_0x0184
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r0 = r10.f331726d
            t51.q r0 = r0.f312423f
            if (r0 == 0) goto L_0x0180
            android.widget.Button r0 = r0.f331759o
            r0.setVisibility(r11)
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r0 = r10.f331726d
            t51.q r0 = r0.f312423f
            if (r0 == 0) goto L_0x017c
            android.view.ViewGroup r0 = r0.f331764t
            r0.setVisibility(r5)
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r0 = r10.f331726d
            t51.q r0 = r0.f312423f
            if (r0 == 0) goto L_0x0178
            android.view.ViewGroup r0 = r0.f331762r
            r0.setVisibility(r11)
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r0 = r10.f331726d
            t51.q r0 = r0.f312423f
            if (r0 == 0) goto L_0x0174
            android.widget.Button r0 = r0.f331759o
            r0.setVisibility(r11)
            goto L_0x01b0
        L_0x0174:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x0178:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x017c:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x0180:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x0184:
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r0 = r10.f331726d
            t51.q r0 = r0.f312423f
            if (r0 == 0) goto L_0x01bd
            android.widget.Button r0 = r0.f331759o
            r0.setVisibility(r5)
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r0 = r10.f331726d
            t51.q r0 = r0.f312423f
            if (r0 == 0) goto L_0x01b9
            android.view.ViewGroup r0 = r0.f331764t
            r0.setVisibility(r11)
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r11 = r10.f331726d
            t51.q r11 = r11.f312423f
            if (r11 == 0) goto L_0x01b5
            android.view.ViewGroup r11 = r11.f331762r
            r11.setVisibility(r5)
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity r11 = r10.f331726d
            t51.q r11 = r11.f312423f
            if (r11 == 0) goto L_0x01b1
            android.widget.Button r11 = r11.f331759o
            r11.setVisibility(r5)
        L_0x01b0:
            return
        L_0x01b1:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x01b5:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x01b9:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x01bd:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x01c1:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x01c5:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x01c9:
            gy3.C87412m.m108603p(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t51.C110914f.onChanged(java.lang.Object):void");
    }
}
