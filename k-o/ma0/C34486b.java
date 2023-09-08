package ma0;

import bp3.C104160f;
import com.tencent.p014mm.sdk.platformtools.Log;
import da0.C7256b;
import di3.C86312j;
import h81.C32735h;
import y90.C38980b;

/* renamed from: ma0.b */
public final class C34486b implements C7256b {

    /* renamed from: a */
    public static final C34486b f92813a = new C34486b();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        if (com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64 != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        if (((h81.C32735h) di3.C86312j.m106911c(r0)).dl0(h81.C32735h.C32737c.clicfg_finder_maas_feed_show_creation_with_same_template_entry, bp3.C104160f.RepairerConfig_Maas_ShowFeedCreationSameEntry_Int, 1) == 1) goto L_0x007b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8426a(int r11, int r12, int r13) {
        /*
            r10 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 1011000(0xf6d38, float:1.416713E-39)
            java.lang.String r4 = "FinderMaasXConfigImpl"
            r5 = 0
            if (r3 < r11) goto L_0x00ad
            r6 = 1011000(0xf6d38, double:4.995004E-318)
            long r8 = (long) r12
            long r8 = r8 & r1
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x001a
            goto L_0x00ad
        L_0x001a:
            r11 = 1
            if (r13 == r11) goto L_0x006b
            r12 = 2
            if (r13 == r12) goto L_0x0021
            goto L_0x007c
        L_0x0021:
            bp3.p r12 = bp3.C79758p.f233760a
            bp3.f r13 = bp3.C104160f.RepairerConfig_Maas_RecordTemplateFollow_Int
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r12 = r12.mo109878a(r13, r1)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            boolean r13 = gy3.C87412m.m108589b(r12, r13)
            if (r13 == 0) goto L_0x0039
            goto L_0x007c
        L_0x0039:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            boolean r12 = gy3.C87412m.m108589b(r12, r13)
            if (r12 == 0) goto L_0x0044
            goto L_0x007b
        L_0x0044:
            di3.d r12 = di3.C86312j.m106911c(r0)
            h81.h r12 = (h81.C32735h) r12
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_finder_maas_feed_record_follow_enable
            boolean r12 = r12.mo58784wf(r13, r11)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "MaasTemplateCamera follow enable:"
            r13.append(r0)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)
            if (r12 == 0) goto L_0x007c
            boolean r12 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            if (r12 == 0) goto L_0x007c
            goto L_0x007b
        L_0x006b:
            di3.d r12 = di3.C86312j.m106911c(r0)
            h81.h r12 = (h81.C32735h) r12
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_finder_maas_feed_show_creation_with_same_template_entry
            bp3.f r0 = bp3.C104160f.RepairerConfig_Maas_ShowFeedCreationSameEntry_Int
            int r12 = r12.dl0(r13, r0, r11)
            if (r12 != r11) goto L_0x007c
        L_0x007b:
            r5 = 1
        L_0x007c:
            java.lang.Class<ht1.t1> r11 = ht1.C60200t1.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            ht1.t1 r11 = (ht1.C60200t1) r11
            boolean r11 = r11.mo76879tO()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "showFeedCreationSameEntry: "
            r12.append(r13)
            r12.append(r5)
            java.lang.String r13 = ", enbalePost: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
            r11 = r11 & r5
            y90.b r12 = y90.C38980b.f105023a
            boolean r12 = r12.mo61860a()
            r11 = r11 & r12
            return r11
        L_0x00ad:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "showFeedCreationSameEntry sdk version 1011000 not match template version range ["
            r13.append(r0)
            r13.append(r11)
            java.lang.String r11 = ", "
            r13.append(r11)
            long r11 = (long) r12
            long r11 = r11 & r1
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r13.append(r11)
            r11 = 93
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ma0.C34486b.mo8426a(int, int, int):boolean");
    }

    /* renamed from: b */
    public boolean mo8427b() {
        boolean z = false;
        if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_finder_maas_quick_creation, C104160f.RepairerConfig_Maas_QuickCreation_Int, 0) == 1) {
            z = true;
        }
        Log.m105924i("FinderMaasXConfigImpl", "albumQuickCreation: " + z);
        return C38980b.f105023a.mo61860a() & z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        if (com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64 != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        if (((h81.C32735h) di3.C86312j.m106911c(r0)).dl0(h81.C32735h.C32737c.clicfg_finder_maas_show_creation_with_same_template_entry, bp3.C104160f.RepairerConfig_Maas_ShowCreationSameEntry_Int, 1) == 1) goto L_0x007b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8428c(int r11, int r12, int r13) {
        /*
            r10 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 1011000(0xf6d38, float:1.416713E-39)
            java.lang.String r4 = "FinderMaasXConfigImpl"
            r5 = 0
            if (r3 < r11) goto L_0x00ad
            r6 = 1011000(0xf6d38, double:4.995004E-318)
            long r8 = (long) r12
            long r8 = r8 & r1
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x001a
            goto L_0x00ad
        L_0x001a:
            r11 = 1
            if (r13 == r11) goto L_0x006b
            r12 = 2
            if (r13 == r12) goto L_0x0021
            goto L_0x007c
        L_0x0021:
            bp3.p r12 = bp3.C79758p.f233760a
            bp3.f r13 = bp3.C104160f.RepairerConfig_Maas_RecordTemplateTransfer_Int
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r12 = r12.mo109878a(r13, r1)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            boolean r13 = gy3.C87412m.m108589b(r12, r13)
            if (r13 == 0) goto L_0x0039
            goto L_0x007c
        L_0x0039:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            boolean r12 = gy3.C87412m.m108589b(r12, r13)
            if (r12 == 0) goto L_0x0044
            goto L_0x007b
        L_0x0044:
            di3.d r12 = di3.C86312j.m106911c(r0)
            h81.h r12 = (h81.C32735h) r12
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_finder_maas_feed_record_transfer_enable
            boolean r12 = r12.mo58784wf(r13, r11)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "MaasTemplateCamera transfer enable:"
            r13.append(r0)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)
            if (r12 == 0) goto L_0x007c
            boolean r12 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            if (r12 == 0) goto L_0x007c
            goto L_0x007b
        L_0x006b:
            di3.d r12 = di3.C86312j.m106911c(r0)
            h81.h r12 = (h81.C32735h) r12
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_finder_maas_show_creation_with_same_template_entry
            bp3.f r0 = bp3.C104160f.RepairerConfig_Maas_ShowCreationSameEntry_Int
            int r12 = r12.dl0(r13, r0, r11)
            if (r12 != r11) goto L_0x007c
        L_0x007b:
            r5 = 1
        L_0x007c:
            java.lang.Class<ht1.t1> r11 = ht1.C60200t1.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            ht1.t1 r11 = (ht1.C60200t1) r11
            boolean r11 = r11.mo76879tO()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "showCreationSameEntry: "
            r12.append(r13)
            r12.append(r5)
            java.lang.String r13 = ", enbalePost: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
            r11 = r11 & r5
            y90.b r12 = y90.C38980b.f105023a
            boolean r12 = r12.mo61860a()
            r11 = r11 & r12
            return r11
        L_0x00ad:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "showCreationSameEntry sdk version 1011000 not match template version range ["
            r13.append(r0)
            r13.append(r11)
            java.lang.String r11 = ", "
            r13.append(r11)
            long r11 = (long) r12
            long r11 = r11 & r1
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r13.append(r11)
            r11 = 93
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ma0.C34486b.mo8428c(int, int, int):boolean");
    }

    /* renamed from: d */
    public boolean mo8429d() {
        boolean z = false;
        if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_finder_maas_show_post_entry, C104160f.RepairerConfig_Maas_ShowMainEntry_Int, 0) == 1) {
            z = true;
        }
        Log.m105924i("FinderMaasXConfigImpl", "showMainPostEntry: " + z);
        return C38980b.f105023a.mo61860a() & z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        if (com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64 != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        if (((h81.C32735h) di3.C86312j.m106911c(r0)).dl0(h81.C32735h.C32737c.clicfg_finder_maas_event_show_post_entry, bp3.C104160f.RepairerConfig_Maas_ShowEventEntry_Int, 1) == 1) goto L_0x007b;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8430e(int r11, int r12, int r13) {
        /*
            r10 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 1011000(0xf6d38, float:1.416713E-39)
            java.lang.String r4 = "FinderMaasXConfigImpl"
            r5 = 0
            if (r3 < r11) goto L_0x0098
            r6 = 1011000(0xf6d38, double:4.995004E-318)
            long r8 = (long) r12
            long r8 = r8 & r1
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x001a
            goto L_0x0098
        L_0x001a:
            r11 = 1
            if (r13 == r11) goto L_0x006b
            r12 = 2
            if (r13 == r12) goto L_0x0021
            goto L_0x007c
        L_0x0021:
            bp3.p r12 = bp3.C79758p.f233760a
            bp3.f r13 = bp3.C104160f.RepairerConfig_Maas_RecordTemplateEvent_Int
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r12 = r12.mo109878a(r13, r1)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            boolean r13 = gy3.C87412m.m108589b(r12, r13)
            if (r13 == 0) goto L_0x0039
            goto L_0x007c
        L_0x0039:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            boolean r12 = gy3.C87412m.m108589b(r12, r13)
            if (r12 == 0) goto L_0x0044
            goto L_0x007b
        L_0x0044:
            di3.d r12 = di3.C86312j.m106911c(r0)
            h81.h r12 = (h81.C32735h) r12
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_finder_maas_feed_record_event_enable
            boolean r12 = r12.mo58784wf(r13, r11)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "MaasTemplateCamera transfer enable:"
            r13.append(r0)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)
            if (r12 == 0) goto L_0x007c
            boolean r12 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            if (r12 == 0) goto L_0x007c
            goto L_0x007b
        L_0x006b:
            di3.d r12 = di3.C86312j.m106911c(r0)
            h81.h r12 = (h81.C32735h) r12
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_finder_maas_event_show_post_entry
            bp3.f r0 = bp3.C104160f.RepairerConfig_Maas_ShowEventEntry_Int
            int r12 = r12.dl0(r13, r0, r11)
            if (r12 != r11) goto L_0x007c
        L_0x007b:
            r5 = 1
        L_0x007c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "showEventPostEntry: "
            r11.append(r12)
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            y90.b r11 = y90.C38980b.f105023a
            boolean r11 = r11.mo61860a()
            r11 = r11 & r5
            return r11
        L_0x0098:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "showEventPostEntry sdk version 1011000 not match template version range ["
            r13.append(r0)
            r13.append(r11)
            java.lang.String r11 = ", "
            r13.append(r11)
            long r11 = (long) r12
            long r11 = r11 & r1
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r13.append(r11)
            r11 = 93
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ma0.C34486b.mo8430e(int, int, int):boolean");
    }
}
