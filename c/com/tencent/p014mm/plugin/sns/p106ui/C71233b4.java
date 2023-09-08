package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentFooter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gv2.C98242p;
import p248ug.C78158s0;
import wd3.C65953v0;

/* renamed from: com.tencent.mm.plugin.sns.ui.b4 */
public class C71233b4 implements C78158s0.C78159a {

    /* renamed from: a */
    public final /* synthetic */ SnsCommentFooter f206175a;

    /* renamed from: com.tencent.mm.plugin.sns.ui.b4$a */
    public class C71234a implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ IEmojiInfo f206176a;

        public C71234a(IEmojiInfo iEmojiInfo) {
            this.f206176a = iEmojiInfo;
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$10$1");
            SnsCommentFooter snsCommentFooter = C71233b4.this.f206175a;
            String str2 = SnsCommentFooter.f278037M;
            SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            SnsCommentFooter.C95535f fVar = snsCommentFooter.f278066y;
            SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            if (fVar != null && z) {
                String commentAtPrefix = C98242p.m126942d(SnsCommentFooter.m122047h(C71233b4.this.f206175a), 8) ? C71233b4.this.f206175a.getCommentAtPrefix() : "";
                SnsCommentFooter snsCommentFooter2 = C71233b4.this.f206175a;
                SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                SnsCommentFooter.C95535f fVar2 = snsCommentFooter2.f278066y;
                SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                fVar2.mo132108a(commentAtPrefix, ((EmojiInfo) this.f206176a).field_md5);
                C115669n.INSTANCE.mo175911u(150, 81);
            }
            SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$10$1");
        }
    }

    public C71233b4(SnsCommentFooter snsCommentFooter) {
        this.f206175a = snsCommentFooter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo68482a(com.tencent.p014mm.api.IEmojiInfo r9) {
        /*
            r8 = this;
            java.lang.String r0 = "onSelectedEmoji"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$10"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r9 instanceof com.tencent.p014mm.storage.emotion.EmojiInfo
            if (r2 == 0) goto L_0x00d0
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r2 = r8.f206175a
            java.lang.String r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentFooter.f278037M
            java.lang.String r3 = "access$700"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.SnsCommentFooter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            te3.w64 r2 = r2.f278059r
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            if (r2 == 0) goto L_0x003e
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r2 = r8.f206175a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            te3.w64 r2 = r2.f278059r
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            java.lang.String r2 = r2.f299703d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x003e
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r2 = r8.f206175a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            te3.w64 r2 = r2.f278059r
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            java.lang.String r2 = r2.f299703d
            r3 = 1
            goto L_0x005d
        L_0x003e:
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r2 = r8.f206175a
            java.lang.Object r2 = r2.getTag()
            if (r2 == 0) goto L_0x00cc
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r2 = r8.f206175a
            java.lang.Object r2 = r2.getTag()
            boolean r2 = r2 instanceof com.tencent.p014mm.plugin.sns.storage.SnsInfo
            if (r2 == 0) goto L_0x00cc
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r2 = r8.f206175a
            java.lang.Object r2 = r2.getTag()
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r2
            java.lang.String r2 = r2.getUserName()
            r3 = 0
        L_0x005d:
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r5 = r8.f206175a
            java.lang.String r6 = "access$1800"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
            boolean r5 = r5.f278038A
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
            if (r5 != 0) goto L_0x006f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x006f:
            java.lang.Class<om.f> r4 = p214om.C11502f.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            om.f r4 = (p214om.C11502f) r4
            wc3.z r4 = r4.mo11462yM()
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r5 = r8.f206175a
            com.tencent.mm.ui.MMActivity r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentFooter.m122042c(r5)
            r6 = r9
            com.tencent.mm.storage.emotion.EmojiInfo r6 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r6
            java.lang.String r6 = r6.field_md5
            com.tencent.mm.plugin.sns.ui.b4$a r7 = new com.tencent.mm.plugin.sns.ui.b4$a
            r7.<init>(r9)
            com.tencent.mm.app.r1 r4 = (com.tencent.p014mm.app.C67654r1) r4
            r4.getClass()
            wd3.u$h r9 = new wd3.u$h
            r9.<init>(r5)
            r9.mo108578p(r2)
            r9.mo108567e(r6)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r9.mo108569g(r2)
            r2 = 2131821677(0x7f11046d, float:1.9276104E38)
            r9.mo108573k(r2)
            if (r3 == 0) goto L_0x00b7
            android.content.res.Resources r2 = r5.getResources()
            r3 = 2131836903(0x7f113fe7, float:1.9306986E38)
            java.lang.String r2 = r2.getString(r3)
            r9.mo108577o(r2)
            goto L_0x00c5
        L_0x00b7:
            android.content.res.Resources r2 = r5.getResources()
            r3 = 2131836904(0x7f113fe8, float:1.9306988E38)
            java.lang.String r2 = r2.getString(r3)
            r9.mo108577o(r2)
        L_0x00c5:
            r9.mo108563a(r7)
            r9.mo108574l()
            goto L_0x00d0
        L_0x00cc:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x00d0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C71233b4.mo68482a(com.tencent.mm.api.IEmojiInfo):void");
    }

    public void onHide() {
        SnsMethodCalculate.markStartTimeMs("onHide", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$10");
        SnsMethodCalculate.markEndTimeMs("onHide", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$10");
    }
}
