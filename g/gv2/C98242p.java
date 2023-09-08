package gv2;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import jp2.C98974v;
import jq2.C99009x;
import ps2.C100880k;
import ps2.C100891r;
import te3.w64;

/* renamed from: gv2.p */
public class C98242p {

    /* renamed from: gv2.p$a */
    public class C98243a implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ String f288034a;

        /* renamed from: b */
        public final /* synthetic */ ImageView f288035b;

        public C98243a(String str, ImageView imageView) {
            this.f288034a = str;
            this.f288035b = imageView;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$1");
            Log.m105924i("SnsCommentUtil", "trySetAdBossCommentAvater onDownloadError, url=" + this.f288034a);
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$1");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$1");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$1");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            Bitmap c;
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$1");
            try {
                Log.m105924i("SnsCommentUtil", "trySetAdBossCommentAvater onDownloadedSucc, url=" + this.f288034a);
                String str2 = (String) this.f288035b.getTag(C0966R.C0970id.jve);
                String l = TextUtils.isEmpty(str2) ? "" : C100891r.m132217l("adId", str2);
                if (!TextUtils.isEmpty(str) && str.equals(l) && (c = C98974v.f290191c.mo138336c(str)) != null) {
                    this.f288035b.setImageBitmap(c);
                    Log.m105924i("SnsCommentUtil", "trySetAdBossCommentAvater setImageBitmap");
                }
            } catch (Throwable th) {
                Log.m105920e("SnsCommentUtil", "trySetAdBossCommentAvater, download decode, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$1");
        }
    }

    /* renamed from: a */
    public static String m126939a(ADXml aDXml, String str) {
        SnsMethodCalculate.markStartTimeMs("getAdBossCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        if (aDXml != null) {
            if (aDXml.usePreferedInfo) {
                str = aDXml.preferNickName;
            } else if (Util.isNullOrNil(str) && !Util.isNullOrNil(aDXml.nickname)) {
                str = aDXml.nickname;
            }
        }
        SnsMethodCalculate.markEndTimeMs("getAdBossCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return str;
    }

    /* renamed from: b */
    public static String m126940b(w64 w64) {
        String str;
        SnsMethodCalculate.markStartTimeMs("getCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        C72996z1 H3 = C94866e1.Jx0().mo69656H3(w64.f299703d);
        if (H3 != null) {
            str = H3.mo62898f();
        } else {
            String str2 = w64.f299704e;
            str = str2 != null ? str2 : w64.f299703d;
        }
        SnsMethodCalculate.markEndTimeMs("getCommentNickName", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0410  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence m126941c(android.content.Context r42, te3.w64 r43, com.tencent.p014mm.plugin.sns.p106ui.C96174r r44, int r45, java.lang.String r46, int r47, boolean r48, boolean r49, com.tencent.p014mm.plugin.sns.storage.SnsInfo r50) {
        /*
            r9 = r42
            r10 = r43
            r11 = r44
            r12 = r45
            r13 = r46
            r14 = r47
            r15 = r50
            java.lang.String r8 = "getCommentSpan"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)
            qy2.a$c r6 = qy2.C63347a.C47892c.SNS_COMMENT
            java.lang.Class<ny.h> r16 = p629ny.C76979h.class
            java.lang.Class<yy.k> r17 = p773yy.C79168k.class
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)
            java.lang.String r0 = m126940b(r43)
            java.lang.String r1 = r10.f299703d
            boolean r1 = m126943e(r15, r1)
            if (r1 == 0) goto L_0x0032
            com.tencent.mm.plugin.sns.storage.ADXml r1 = r50.getAdXml()
            java.lang.String r0 = m126939a(r1, r0)
        L_0x0032:
            r5 = r0
            com.tencent.mm.storage.u3 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Jx0()
            java.lang.String r1 = r10.f299711o
            com.tencent.mm.storage.z1 r0 = r0.mo69656H3(r1)
            r4 = 21
            r18 = 3
            if (r12 != r4) goto L_0x0045
            r2 = 3
            goto L_0x0046
        L_0x0045:
            r2 = 2
        L_0x0046:
            java.lang.String r1 = r10.f299707h
            java.lang.String r19 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r46)
            r48 = r8
            if (r1 != 0) goto L_0x0068
            f40.C86709a0.m107528h()
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            com.tencent.mm.storage.z1 r1 = r1.mo69664N2(r13)
            goto L_0x0069
        L_0x0068:
            r1 = 0
        L_0x0069:
            java.lang.String r4 = ""
            java.lang.String r8 = " "
            r20 = r7
            r7 = 1
            r21 = r2
            if (r14 != r7) goto L_0x009e
            boolean r22 = qy2.C77448f0.m93395g()
            if (r22 == 0) goto L_0x009c
            di3.d r22 = di3.C86312j.m106911c(r17)
            r3 = r22
            yy.k r3 = (p773yy.C79168k) r3
            java.lang.String r2 = r10.f299703d
            boolean r2 = r3.mo74105BS(r2)
            if (r2 == 0) goto L_0x009c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r24 = 1
            goto L_0x00a1
        L_0x009c:
            r2 = r5
            goto L_0x009f
        L_0x009e:
            r2 = r4
        L_0x009f:
            r24 = 0
        L_0x00a1:
            int r3 = r10.f299716t
            boolean r3 = m126942d(r3, r7)
            java.lang.String r7 = ": "
            r26 = r5
            r5 = 2131836853(0x7f113fb5, float:1.9306885E38)
            if (r3 == 0) goto L_0x0128
            java.lang.String r3 = r10.f299711o
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0128
            if (r1 == 0) goto L_0x0119
            java.lang.String r0 = r1.mo62898f()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00c6
            r0 = r13
            goto L_0x00ca
        L_0x00c6:
            java.lang.String r0 = r1.mo62898f()
        L_0x00ca:
            if (r15 == 0) goto L_0x00da
            boolean r1 = r50.isAd()
            if (r1 == 0) goto L_0x00da
            com.tencent.mm.plugin.sns.storage.ADXml r1 = r50.getAdXml()
            java.lang.String r0 = m126939a(r1, r0)
        L_0x00da:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = r9.getString(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            int r2 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r1)
            r3.append(r7)
            java.lang.String r1 = r3.toString()
            r3 = r2
            r4 = 0
            r5 = 0
            r2 = r1
            r1 = 0
            goto L_0x0224
        L_0x0119:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r3 = 0
            r1[r3] = r13
            java.lang.String r0 = "SnsCommentUtil"
            java.lang.String r2 = "feedContact null by feedOwnUserName %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r2, r1)
            goto L_0x0252
        L_0x0128:
            r3 = 0
            int r1 = r10.f299716t
            r3 = 8
            boolean r1 = m126942d(r1, r3)
            if (r1 == 0) goto L_0x0190
            java.lang.Class<d62.i> r0 = d62.C75339i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            d62.i r0 = (d62.C75339i) r0
            java.lang.String r1 = r10.f299711o
            java.lang.String r0 = r0.getDisplayName(r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r1 != 0) goto L_0x0156
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = r1.toString()
        L_0x0156:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = r9.getString(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            int r2 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r1)
            r3.append(r8)
            java.lang.String r1 = r3.toString()
            goto L_0x0255
        L_0x0190:
            java.lang.String r1 = r10.f299711o
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x022e
            if (r0 != 0) goto L_0x019d
            java.lang.String r0 = r10.f299711o
            goto L_0x01a1
        L_0x019d:
            java.lang.String r0 = r0.mo62898f()
        L_0x01a1:
            if (r15 == 0) goto L_0x01bd
            boolean r1 = r50.isAd()
            if (r1 == 0) goto L_0x01bd
            java.lang.String r1 = r10.f299711o
            java.lang.String r3 = r50.getUserName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01bd
            com.tencent.mm.plugin.sns.storage.ADXml r1 = r50.getAdXml()
            java.lang.String r0 = m126939a(r1, r0)
        L_0x01bd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r2 = 2131837106(0x7f1140b2, float:1.9307398E38)
            java.lang.String r2 = r9.getString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            int r2 = r1.length()
            boolean r3 = qy2.C77448f0.m93395g()
            if (r3 == 0) goto L_0x01fc
            di3.d r3 = di3.C86312j.m106911c(r17)
            yy.k r3 = (p773yy.C79168k) r3
            java.lang.String r5 = r10.f299711o
            boolean r3 = r3.mo74105BS(r5)
            if (r3 == 0) goto L_0x01fc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r8)
            java.lang.String r0 = r3.toString()
            r3 = 1
            goto L_0x01fd
        L_0x01fc:
            r3 = 0
        L_0x01fd:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r0)
            java.lang.String r1 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r1)
            r5.append(r7)
            java.lang.String r1 = r5.toString()
            r4 = r2
            r5 = r3
            r3 = 0
            r2 = r1
            r1 = r0
            r0 = 0
        L_0x0224:
            r27 = r0
            r28 = r1
            r8 = r3
            r7 = r4
            r29 = r5
            r3 = r2
            goto L_0x025e
        L_0x022e:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 != 0) goto L_0x0243
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r7)
            java.lang.String r2 = r0.toString()
        L_0x0243:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = r0.toString()
        L_0x0252:
            r1 = r4
            r0 = 0
            r2 = 0
        L_0x0255:
            r28 = r0
            r3 = r1
            r7 = r2
            r8 = 0
            r27 = 0
            r29 = 0
        L_0x025e:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r0 = "key_wxa_short_link_launch_scene"
            java.lang.String r1 = "TIME_LINE"
            r5.putString(r0, r1)
            boolean r0 = vr2.C102236a0.m134753k0(r43)
            if (r0 == 0) goto L_0x0273
            r0 = 5
            goto L_0x0274
        L_0x0273:
            r0 = 4
        L_0x0274:
            java.lang.String r4 = "ShareScene"
            r5.putInt(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r50.getUserName()
            r0.append(r4)
            java.lang.String r4 = "#"
            r0.append(r4)
            long r1 = r15.field_snsId
            java.lang.String r1 = vr2.C102236a0.m134765q0(r1)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = r10.f299703d
            r0.append(r1)
            r0.append(r4)
            int r1 = r10.f299709j
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ShareSceneId"
            r5.putString(r1, r0)
            int r0 = r10.f299708i
            long r0 = (long) r0
            java.lang.String r2 = "CreateTime"
            r5.putLong(r2, r0)
            r0 = 2
            if (r14 != r0) goto L_0x02b9
            r0 = 3
            goto L_0x02ba
        L_0x02b9:
            r0 = 1
        L_0x02ba:
            java.lang.String r1 = "TimelineEnterSource"
            r5.putInt(r1, r0)
            int r0 = r15.field_type
            java.lang.String r1 = "SnsContentType"
            r5.putInt(r1, r0)
            java.lang.String r0 = "onItemCommentSpanGenerate"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "context"
            gy3.C87412m.m108594g(r9, r2)
            te3.ze4 r2 = new te3.ze4
            r2.<init>()
            boolean r4 = vr2.C102236a0.m134753k0(r43)
            if (r4 == 0) goto L_0x02e0
            r4 = 5
            goto L_0x02e1
        L_0x02e0:
            r4 = 4
        L_0x02e1:
            r2.f228685e = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r30 = r5
            java.lang.String r5 = r50.getUserName()
            r4.append(r5)
            r5 = 35
            r4.append(r5)
            r31 = r6
            long r5 = r15.field_snsId
            java.lang.String r5 = vr2.C102236a0.m134765q0(r5)
            r4.append(r5)
            r5 = 35
            r4.append(r5)
            java.lang.String r6 = r10.f299703d
            r4.append(r6)
            r4.append(r5)
            int r5 = r10.f299709j
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.f228686f = r4
            int r4 = r10.f299708i
            long r4 = (long) r4
            r2.f228687g = r4
            r4 = 2
            if (r14 != r4) goto L_0x0323
            r5 = 3
            goto L_0x0324
        L_0x0323:
            r5 = 1
        L_0x0324:
            r2.f228688h = r5
            int r5 = r15.field_type
            r2.f228689i = r5
            int r5 = r15.localid
            r2.f228690j = r5
            java.lang.Class<ox.b> r5 = p640ox.C77049b.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ox.b r5 = (p640ox.C77049b) r5
            r6 = 1
            dm2.g r5 = r5.Lq0(r9, r6)
            if (r5 == 0) goto L_0x0355
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Comment_"
            r4.append(r6)
            int r6 = r43.hashCode()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r5.mo70916a(r4, r2)
        L_0x0355:
            java.lang.String r2 = "getTAG"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            java.lang.String r4 = "access$getTAG$cp"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "onItemCommentSpanGenerate Comment_"
            r2.append(r4)
            int r4 = r43.hashCode()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "MicroMsg.Sns.SnsTagSearchSpanClickReportFlow"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            di3.d r0 = di3.C86312j.m106911c(r16)
            ny.h r0 = (p629ny.C76979h) r0
            r32 = 1
            r1 = 15
            float r6 = (float) r1
            float r1 = kg3.C76577a.m92165p(r42)
            float r1 = r1 * r6
            int r1 = (int) r1
            int r4 = kg3.C76577a.m92151b(r9, r1)
            r33 = 2
            r34 = 0
            r35 = 5
            r2 = 1
            r5 = 2
            r1 = r42
            r36 = r21
            r21 = r26
            r22 = r30
            r23 = r6
            r37 = r31
            r25 = 1
            r6 = r22
            r38 = r7
            r39 = r20
            r7 = r34
            r41 = r48
            r40 = r8
            r13 = 0
            r8 = r35
            android.text.SpannableString r8 = r0.mo107082uA(r1, r2, r3, r4, r5, r6, r7, r8)
            di3.d r0 = di3.C86312j.m106911c(r16)
            ny.h r0 = (p629ny.C76979h) r0
            float r1 = kg3.C76577a.m92165p(r42)
            float r6 = r23 * r1
            int r1 = (int) r6
            int r4 = kg3.C76577a.m92151b(r9, r1)
            r7 = 0
            r16 = 5
            r1 = r42
            r2 = r32
            r3 = r19
            r5 = r33
            r6 = r22
            r13 = r8
            r8 = r16
            android.text.SpannableString r0 = r0.mo107082uA(r1, r2, r3, r4, r5, r6, r7, r8)
            long r1 = r15.field_snsId
            int r3 = r10.f299709j
            r4 = 2
            java.lang.CharSequence r0 = zr2.C66976a.m79134f(r1, r0, r3, r4)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            r1.append(r13)
            r1.append(r0)
            r0 = 21
            if (r12 != r0) goto L_0x0403
            r0 = 3
            goto L_0x0404
        L_0x0403:
            r0 = 2
        L_0x0404:
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>(r1)
            r1 = 17
            r7 = 33
            r2 = 1
            if (r14 != r2) goto L_0x048d
            java.lang.String r3 = r10.f299703d
            boolean r3 = m126943e(r15, r3)
            if (r3 == 0) goto L_0x044f
            int r3 = r10.f299716t
            r5 = 32
            boolean r3 = m126942d(r3, r5)
            if (r3 == 0) goto L_0x0427
            r3 = 27
            r35 = 27
            goto L_0x0429
        L_0x0427:
            r35 = 2
        L_0x0429:
            vr2.e r3 = new vr2.e
            boolean r31 = r50.isAd()
            java.lang.String r4 = r10.f299703d
            java.lang.String r33 = r50.getLocalid()
            r34 = 0
            r30 = r3
            r32 = r4
            r30.<init>(r31, r32, r33, r34, r35)
            de3.c0 r4 = new de3.c0
            r5 = r9
            android.app.Activity r5 = (android.app.Activity) r5
            r4.<init>(r5, r3, r11, r0)
            int r0 = r21.length()
            r3 = 0
            r6.setSpan(r4, r3, r0, r7)
            goto L_0x0461
        L_0x044f:
            r3 = 0
            de3.c0 r4 = new de3.c0
            r5 = r9
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.String r8 = r10.f299703d
            r4.<init>(r5, r8, r11, r0)
            int r0 = r21.length()
            r6.setSpan(r4, r3, r0, r7)
        L_0x0461:
            if (r24 == 0) goto L_0x048d
            di3.d r0 = di3.C86312j.m106911c(r17)
            yy.k r0 = (p773yy.C79168k) r0
            java.lang.String r3 = r10.f299703d
            float r4 = kg3.C76577a.m92165p(r42)
            float r4 = r4 * r23
            int r4 = (int) r4
            int r4 = kg3.C76577a.m92151b(r9, r4)
            float r4 = (float) r4
            r5 = r37
            r8 = 0
            android.text.style.ImageSpan r0 = r0.Ig0(r8, r3, r5, r4)
            if (r0 == 0) goto L_0x0490
            int r3 = r21.length()
            int r4 = r21.length()
            int r4 = r4 + r2
            r6.setSpan(r0, r3, r4, r1)
            goto L_0x0490
        L_0x048d:
            r5 = r37
            r8 = 0
        L_0x0490:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r27)
            if (r0 != 0) goto L_0x04e8
            boolean r0 = r50.isAd()
            if (r0 == 0) goto L_0x04d0
            java.lang.String r0 = r50.getUserName()
            r2 = r46
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04d2
            vr2.e r8 = new vr2.e
            boolean r1 = r50.isAd()
            java.lang.String r3 = r50.getLocalid()
            r4 = 0
            r5 = 2
            r0 = r8
            r2 = r46
            r0.<init>(r1, r2, r3, r4, r5)
            de3.c0 r0 = new de3.c0
            r1 = r9
            android.app.Activity r1 = (android.app.Activity) r1
            r3 = r36
            r0.<init>(r1, r8, r11, r3)
            int r1 = r27.length()
            r4 = r40
            int r1 = r1 + r4
            r6.setSpan(r0, r4, r1, r7)
            goto L_0x0572
        L_0x04d0:
            r2 = r46
        L_0x04d2:
            r3 = r36
            r4 = r40
            de3.c0 r0 = new de3.c0
            r1 = r9
            android.app.Activity r1 = (android.app.Activity) r1
            r0.<init>(r1, r2, r11, r3)
            int r1 = r27.length()
            int r1 = r1 + r4
            r6.setSpan(r0, r4, r1, r7)
            goto L_0x0572
        L_0x04e8:
            r0 = r8
            r3 = r36
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r28)
            if (r4 != 0) goto L_0x0572
            boolean r4 = r50.isAd()
            if (r4 == 0) goto L_0x0533
            java.lang.String r4 = r10.f299711o
            java.lang.String r8 = r50.getUserName()
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x0533
            vr2.e r4 = new vr2.e
            boolean r8 = r50.isAd()
            java.lang.String r12 = r10.f299711o
            java.lang.String r13 = r50.getLocalid()
            r14 = 0
            r15 = 2
            r45 = r4
            r46 = r8
            r47 = r12
            r48 = r13
            r49 = r14
            r50 = r15
            r45.<init>(r46, r47, r48, r49, r50)
            de3.c0 r8 = new de3.c0
            r12 = r9
            android.app.Activity r12 = (android.app.Activity) r12
            r8.<init>(r12, r4, r11, r3)
            int r3 = r28.length()
            r4 = r38
            int r3 = r3 + r4
            r6.setSpan(r8, r4, r3, r7)
            goto L_0x0547
        L_0x0533:
            r4 = r38
            de3.c0 r8 = new de3.c0
            r12 = r9
            android.app.Activity r12 = (android.app.Activity) r12
            java.lang.String r13 = r10.f299711o
            r8.<init>(r12, r13, r11, r3)
            int r3 = r28.length()
            int r3 = r3 + r4
            r6.setSpan(r8, r4, r3, r7)
        L_0x0547:
            if (r29 == 0) goto L_0x0572
            di3.d r3 = di3.C86312j.m106911c(r17)
            yy.k r3 = (p773yy.C79168k) r3
            java.lang.String r7 = r10.f299711o
            float r8 = kg3.C76577a.m92165p(r42)
            float r8 = r8 * r23
            int r8 = (int) r8
            int r8 = kg3.C76577a.m92151b(r9, r8)
            float r8 = (float) r8
            android.text.style.ImageSpan r0 = r3.Ig0(r0, r7, r5, r8)
            if (r0 == 0) goto L_0x0572
            int r3 = r28.length()
            int r7 = r4 + r3
            int r7 = r7 - r2
            int r2 = r28.length()
            int r2 = r2 + r4
            r6.setSpan(r0, r7, r2, r1)
        L_0x0572:
            r1 = r39
            r0 = r41
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gv2.C98242p.m126941c(android.content.Context, te3.w64, com.tencent.mm.plugin.sns.ui.r, int, java.lang.String, int, boolean, boolean, com.tencent.mm.plugin.sns.storage.SnsInfo):java.lang.CharSequence");
    }

    /* renamed from: d */
    public static boolean m126942d(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("hasCommentFlag", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        boolean z = (i & i2) == i2;
        SnsMethodCalculate.markEndTimeMs("hasCommentFlag", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return z;
    }

    /* renamed from: e */
    public static boolean m126943e(SnsInfo snsInfo, String str) {
        SnsMethodCalculate.markStartTimeMs("isAdBossComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        boolean z = snsInfo != null && snsInfo.isAd() && str != null && str.equals(snsInfo.getUserName());
        SnsMethodCalculate.markEndTimeMs("isAdBossComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return z;
    }

    /* renamed from: f */
    public static boolean m126944f(w64 w64) {
        SnsMethodCalculate.markStartTimeMs("isDeletedComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        boolean z = w64 != null && w64.f299715s > 0;
        SnsMethodCalculate.markEndTimeMs("isDeletedComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return z;
    }

    /* renamed from: g */
    public static boolean m126945g(ImageView imageView, SnsInfo snsInfo, String str) {
        ADXml adXml;
        SnsMethodCalculate.markStartTimeMs("trySetAdBossCommentAvater", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        boolean z = true;
        if (snsInfo == null || !m126943e(snsInfo, str) || (adXml = snsInfo.getAdXml()) == null || !adXml.usePreferedInfo || TextUtils.isEmpty(adXml.preferAvatar)) {
            z = false;
        } else {
            String str2 = adXml.preferAvatar;
            imageView.setTag(C0966R.C0970id.jve, str2);
            Log.m105924i("SnsCommentUtil", "trySetAdBossCommentAvater, isSet=true");
            String l = C100891r.m132217l("adId", str2);
            if (C86013q1.m106450k(l)) {
                if (C99009x.m128943d()) {
                    C99009x.m128942c(imageView, l, 1);
                } else {
                    try {
                        Bitmap c = C98974v.f290191c.mo138336c(l);
                        if (c != null) {
                            imageView.setImageBitmap(c);
                            Log.m105924i("SnsCommentUtil", "trySetAdBossCommentAvater use local cache, url=" + str2);
                        }
                    } catch (Throwable th) {
                        Log.m105920e("SnsCommentUtil", "trySetAdBossCommentAvater decode exp=" + th.toString());
                    }
                }
            } else if (C99009x.m128943d()) {
                Log.m105924i("SnsCommentUtil", "detail: download use avatar with cdn, but the statement should not reach!");
                C99009x.m128940a(imageView, str2, 1);
            } else {
                C100891r.m132206a(str2, false, 41, 0, new C98243a(str2, imageView));
            }
        }
        SnsMethodCalculate.markEndTimeMs("trySetAdBossCommentAvater", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        return z;
    }
}
