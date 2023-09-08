package p178ju;

import d62.C7241k;
import java.util.Map;

/* renamed from: ju.l */
public class C9521l implements C7241k.C7247f {
    /* renamed from: d */
    public Boolean mo8418d(Map<String, String> map) {
        return Boolean.valueOf(map.containsKey(".sysmsg.sysmsgtemplate.content_template.link_list.link.redpacketinfo"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence mo8419q(java.util.Map<java.lang.String, java.lang.String> r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = ".sysmsg.sysmsgtemplate.content_template.link_list.link.redpacketinfo.objectid"
            java.lang.Object r0 = r13.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            long r0 = o40.C61926c.m72671P(r0)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = ".sysmsg.sysmsgtemplate.content_template.link_list.link.redpacketinfo.liveid"
            java.lang.Object r0 = r13.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            long r0 = o40.C61926c.m72671P(r0)
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = ".sysmsg.sysmsgtemplate.content_template.link_list.link.redpacketinfo.objectnonceid"
            java.lang.Object r0 = r13.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            java.lang.String r0 = ".sysmsg.sysmsgtemplate.content_template.link_list.link.redpacketinfo.findernickname"
            java.lang.Object r0 = r13.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            java.lang.String r1 = ".sysmsg.sysmsgtemplate.content_template.link_list.link.redpacketinfo.redpacketsendid"
            java.lang.Object r13 = r13.get(r1)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r1 = 2131828673(0x7f111fc1, float:1.9290294E38)
            java.lang.String r13 = r13.getString(r1)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r13
            r4 = 2131828674(0x7f111fc2, float:1.9290296E38)
            java.lang.String r1 = r1.getString(r4, r2)
            int r9 = r1.indexOf(r13)
            r2 = -1
            if (r9 == r2) goto L_0x00f7
            int r2 = r13.length()
            int r2 = r2 + r9
            int r4 = r1.length()
            if (r2 > r4) goto L_0x00f7
            java.lang.Class<ny.h> r14 = p629ny.C76979h.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            ny.h r14 = (p629ny.C76979h) r14
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.text.SpannableString r14 = r14.mo107057T1(r2, r1)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r10 = "systemmessages_hongbaoicon"
            java.lang.String r11 = "drawable"
            int r2 = r2.getIdentifier(r10, r11, r4)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r2)
            if (r2 == 0) goto L_0x00e5
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r10 = 2131165610(0x7f0701aa, float:1.7945442E38)
            int r4 = r4.getDimensionPixelOffset(r10)
            r2.setBounds(r3, r3, r4, r4)
            go3.c r3 = new go3.c
            r3.<init>(r2, r0)
            r2 = 8197(0x2005, float:1.1486E-41)
            int r2 = r1.indexOf(r2)
            if (r2 < 0) goto L_0x00e5
            int r1 = r1.length()
            int r1 = r1 - r0
            if (r2 >= r1) goto L_0x00e5
            int r0 = r2 + 1
            r1 = 18
            r14.setSpan(r3, r2, r0, r1)
        L_0x00e5:
            c62.e r0 = new c62.e
            r3 = 5
            r4 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            int r13 = r13.length()
            int r13 = r13 + r9
            r1 = 33
            r14.setSpan(r0, r9, r13, r1)
        L_0x00f7:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p178ju.C9521l.mo8419q(java.util.Map, java.lang.String):java.lang.CharSequence");
    }
}
