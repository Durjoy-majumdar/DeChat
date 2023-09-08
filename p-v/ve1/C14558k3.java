package ve1;

import com.google.android.gms.actions.SearchIntents;
import dq1.C7461a;
import fy3.C32224a;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: ve1.k3 */
public class C14558k3 extends C14632t2 {

    /* renamed from: s */
    public final String f40340s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14558k3(String str, C7461a aVar) {
        super(0, aVar, (C32229r) null, (C32224a) null, 13, (C8480h) null);
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(aVar, "itemViewConfig");
        this.f40340s = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r8, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r9, int r10, int r11, boolean r12, java.util.List<java.lang.Object> r13) {
        /*
            r7 = this;
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            java.lang.String r1 = "holder"
            gy3.C87412m.m108594g(r8, r1)
            java.lang.String r1 = "item"
            gy3.C87412m.m108594g(r9, r1)
            super.mo3149l(r8, r9, r10, r11, r12, r13)
            java.lang.String r10 = r7.f40340s
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x0023
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r9.mo3513o()
            java.lang.String r10 = r10.getDescription()
        L_0x0021:
            r2 = r10
            goto L_0x0034
        L_0x0023:
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r9.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r10 = r10.objectDesc
            if (r10 == 0) goto L_0x0033
            java.lang.String r10 = r10.description
            if (r10 != 0) goto L_0x0021
        L_0x0033:
            r2 = r11
        L_0x0034:
            r10 = 2131304533(0x7f092055, float:1.8227211E38)
            android.view.View r10 = r8.mo85812D(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            di3.d r12 = di3.C86312j.m106911c(r0)
            ny.h r12 = (p629ny.C76979h) r12
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            hp1.w0 r1 = hp1.C8703w0.f27927a
            fe1.q r9 = r9.mo3507l()
            if (r9 == 0) goto L_0x0054
            java.lang.String r9 = r9.getNickname()
            goto L_0x0055
        L_0x0054:
            r9 = r11
        L_0x0055:
            android.text.Spanned r9 = r1.mo9552c(r9, r11)
            float r11 = r10.getTextSize()
            android.text.SpannableString r9 = r12.Te0(r13, r9, r11)
            r10.setText(r9)
            r9 = 2131302755(0x7f091963, float:1.8223605E38)
            android.view.View r8 = r8.mo85812D(r9)
            android.widget.TextView r8 = (android.widget.TextView) r8
            int r4 = hp1.C8703w0.f27928b
            if (r8 != 0) goto L_0x0072
            goto L_0x0094
        L_0x0072:
            di3.d r9 = di3.C86312j.m106911c(r0)
            ny.h r9 = (p629ny.C76979h) r9
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.text.TextPaint r3 = r8.getPaint()
            java.lang.String r11 = "descTv.paint"
            gy3.C87412m.m108593f(r3, r11)
            r6 = 0
            java.lang.String r5 = ""
            android.text.Spanned r11 = r1.mo9551b(r2, r3, r4, r5, r6)
            r12 = 0
            android.text.SpannableString r9 = r9.Te0(r10, r11, r12)
            r8.setText(r9)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14558k3.mo44e(jq3.o, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, int, boolean, java.util.List):void");
    }
}
