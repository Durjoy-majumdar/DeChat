package com.tencent.p014mm.plugin.voip.p475ui;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import fy3.C32227p;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.voip.ui.d */
public final class C106442d extends C60896i<C30537a> {

    /* renamed from: e */
    public C32227p<? super Integer, ? super Integer, C13598b0> f317974e;

    public C106442d(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        C87412m.m108594g(pVar, "onValueChanged");
        this.f317974e = pVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d5g;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r1, jq3.C9493c r2, int r3, int r4, boolean r5, java.util.List r6) {
        /*
            r0 = this;
            com.tencent.mm.plugin.voip.ui.a r2 = (com.tencent.p014mm.plugin.voip.p475ui.C30537a) r2
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r2, r4)
            int r4 = com.tencent.p014mm.plugin.voip.p475ui.RepairerVoipFaceBeautyUI.f317859g
            java.lang.String r4 = r2.f82269d
            java.lang.String r5 = "config"
            gy3.C87412m.m108594g(r4, r5)
            int r5 = r4.hashCode()
            switch(r5) {
                case -2097631529: goto L_0x01a7;
                case -2069664037: goto L_0x019a;
                case -1932026754: goto L_0x018d;
                case -1788224341: goto L_0x0180;
                case -1623590009: goto L_0x0173;
                case -1615366773: goto L_0x0166;
                case -1553133448: goto L_0x0159;
                case -1438036128: goto L_0x014b;
                case -1389202159: goto L_0x013c;
                case -1384944297: goto L_0x012d;
                case -1382171254: goto L_0x011e;
                case -701917643: goto L_0x010e;
                case -296026997: goto L_0x00ff;
                case -53010862: goto L_0x00f0;
                case 3506531: goto L_0x00e1;
                case 73209129: goto L_0x00d2;
                case 236587448: goto L_0x00c3;
                case 340983459: goto L_0x00b4;
                case 351608024: goto L_0x00a4;
                case 455311658: goto L_0x0095;
                case 951540442: goto L_0x0086;
                case 1185487353: goto L_0x0078;
                case 1581412002: goto L_0x0069;
                case 1660656102: goto L_0x005a;
                case 1672808674: goto L_0x004b;
                case 1964435585: goto L_0x003c;
                case 2054228499: goto L_0x002d;
                case 2063955562: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x01b4
        L_0x001e:
            java.lang.String r5 = "smileFolds"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0028
            goto L_0x01b4
        L_0x0028:
            java.lang.String r4 = "祛法令纹"
            goto L_0x01b7
        L_0x002d:
            java.lang.String r5 = "sharpen"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0037
            goto L_0x01b4
        L_0x0037:
            java.lang.String r4 = "清晰"
            goto L_0x01b7
        L_0x003c:
            java.lang.String r5 = "mouthMorph"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0046
            goto L_0x01b4
        L_0x0046:
            java.lang.String r4 = "唇形"
            goto L_0x01b7
        L_0x004b:
            java.lang.String r5 = "enableBeautify"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0055
            goto L_0x01b4
        L_0x0055:
            java.lang.String r4 = "启用美颜"
            goto L_0x01b7
        L_0x005a:
            java.lang.String r5 = "chinLong"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0064
            goto L_0x01b4
        L_0x0064:
            java.lang.String r4 = "长下巴"
            goto L_0x01b7
        L_0x0069:
            java.lang.String r5 = "teethBright"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0073
            goto L_0x01b4
        L_0x0073:
            java.lang.String r4 = "白牙"
            goto L_0x01b7
        L_0x0078:
            java.lang.String r5 = "girlSlim"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0082
            goto L_0x01b4
        L_0x0082:
            java.lang.String r4 = " 瘦脸女神"
            goto L_0x01b7
        L_0x0086:
            java.lang.String r5 = "contour"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0090
            goto L_0x01b4
        L_0x0090:
            java.lang.String r4 = "五官立体"
            goto L_0x01b7
        L_0x0095:
            java.lang.String r5 = "cheekBone"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x009f
            goto L_0x01b4
        L_0x009f:
            java.lang.String r4 = "瘦颧骨"
            goto L_0x01b7
        L_0x00a4:
            java.lang.String r5 = "version"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00af
            goto L_0x01b4
        L_0x00af:
            java.lang.String r4 = "美颜版本 0无美颜 1旧美颜 2 新美颜"
            goto L_0x01b7
        L_0x00b4:
            java.lang.String r5 = "lowerJawbone"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00be
            goto L_0x01b4
        L_0x00be:
            java.lang.String r4 = "瘦下颚骨"
            goto L_0x01b7
        L_0x00c3:
            java.lang.String r5 = "hairLineHigh"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00cd
            goto L_0x01b4
        L_0x00cd:
            java.lang.String r4 = "高发际线"
            goto L_0x01b7
        L_0x00d2:
            java.lang.String r5 = "boySlim"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00dc
            goto L_0x01b4
        L_0x00dc:
            java.lang.String r4 = "瘦脸男神"
            goto L_0x01b7
        L_0x00e1:
            java.lang.String r5 = "rosy"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00eb
            goto L_0x01b4
        L_0x00eb:
            java.lang.String r4 = "红润"
            goto L_0x01b7
        L_0x00f0:
            java.lang.String r5 = "chinShort"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00fa
            goto L_0x01b4
        L_0x00fa:
            java.lang.String r4 = "短下巴"
            goto L_0x01b7
        L_0x00ff:
            java.lang.String r5 = "eyeBright"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0109
            goto L_0x01b4
        L_0x0109:
            java.lang.String r4 = "亮眼"
            goto L_0x01b7
        L_0x010e:
            java.lang.String r5 = "wingOfNose"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0119
            goto L_0x01b4
        L_0x0119:
            java.lang.String r4 = "瘦鼻翼"
            goto L_0x01b7
        L_0x011e:
            java.lang.String r5 = "eyePouch"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0128
            goto L_0x01b4
        L_0x0128:
            java.lang.String r4 = "祛黑眼圈"
            goto L_0x01b7
        L_0x012d:
            java.lang.String r5 = "eyeMorph"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0137
            goto L_0x01b4
        L_0x0137:
            java.lang.String r4 = "大眼，旧版"
            goto L_0x01b7
        L_0x013c:
            java.lang.String r5 = "bigEye"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0146
            goto L_0x01b4
        L_0x0146:
            java.lang.String r4 = "大眼，新版"
            goto L_0x01b7
        L_0x014b:
            java.lang.String r5 = "zhaiLian"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0155
            goto L_0x01b4
        L_0x0155:
            java.lang.String r4 = "窄脸"
            goto L_0x01b7
        L_0x0159:
            java.lang.String r5 = "filterRate"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0162
            goto L_0x01b4
        L_0x0162:
            java.lang.String r4 = "自然滤镜"
            goto L_0x01b7
        L_0x0166:
            java.lang.String r5 = "skinSmooth"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x016f
            goto L_0x01b4
        L_0x016f:
            java.lang.String r4 = "磨皮"
            goto L_0x01b7
        L_0x0173:
            java.lang.String r5 = "smallHead"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x017c
            goto L_0x01b4
        L_0x017c:
            java.lang.String r4 = "小头"
            goto L_0x01b7
        L_0x0180:
            java.lang.String r5 = "faceMorph"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0189
            goto L_0x01b4
        L_0x0189:
            java.lang.String r4 = "瘦脸"
            goto L_0x01b7
        L_0x018d:
            java.lang.String r5 = "hairLineLow"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0196
            goto L_0x01b4
        L_0x0196:
            java.lang.String r4 = "低发际线"
            goto L_0x01b7
        L_0x019a:
            java.lang.String r5 = "enableFilter"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x01b4
        L_0x01a3:
            java.lang.String r4 = "启用滤镜"
            goto L_0x01b7
        L_0x01a7:
            java.lang.String r5 = "skinBright"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x01b0
            goto L_0x01b4
        L_0x01b0:
            java.lang.String r4 = "美白"
            goto L_0x01b7
        L_0x01b4:
            java.lang.String r4 = "未知配置"
        L_0x01b7:
            r5 = 2131315081(0x7f094989, float:1.8248605E38)
            r1.mo85815G(r5, r4)
            r4 = 2131301285(0x7f0913a5, float:1.8220624E38)
            android.view.View r5 = r1.mo85812D(r4)
            android.widget.EditText r5 = (android.widget.EditText) r5
            int r2 = r2.f82270e
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5.setText(r2)
            android.view.View r2 = r1.mo85812D(r4)
            android.widget.EditText r2 = (android.widget.EditText) r2
            com.tencent.mm.plugin.voip.ui.b r5 = new com.tencent.mm.plugin.voip.ui.b
            r5.<init>()
            r2.addTextChangedListener(r5)
            android.view.View r1 = r1.mo85812D(r4)
            android.widget.EditText r1 = (android.widget.EditText) r1
            com.tencent.mm.plugin.voip.ui.c r2 = new com.tencent.mm.plugin.voip.ui.c
            r2.<init>(r0, r3)
            r1.setOnEditorActionListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.p475ui.C106442d.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
