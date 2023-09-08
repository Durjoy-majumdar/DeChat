package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.EmotionStrategyInfo;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsBeforePostImageInfoStruct;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.VideoCaptureReportInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94942r1;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.C95738b1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96142a;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96148b;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.DynamicGridView;
import com.tencent.p014mm.plugin.sns.statistics.C57354l;
import com.tencent.p014mm.plugin.sns.statistics.C94992f;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.MD5;
import da0.C58247e;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import f72.C97842b;
import gy3.C87412m;
import h81.C32735h;
import hd0.C98398h0;
import hi2.C98453h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nj3.C76879j;
import nj3.C76912y0;
import os2.C100408j0;
import p214om.C11502f;
import p232rw.C77572l;
import p232rw.C77574q;
import p232rw.C77575r;
import p823sg.C90193h;
import p914oj.C89231c;
import qo3.C77407n;
import te3.C101783gu2;
import te3.C101802kr2;
import te3.i84;
import vr2.C102236a0;
import xb0.C102609h;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.sns.ui.d2 */
public class C95754d2 extends C96157q implements C95712a1 {

    /* renamed from: A */
    public C101802kr2 f279309A;

    /* renamed from: c */
    public d2$$j f279310c = new d2$$j(this);

    /* renamed from: d */
    public MMActivity f279311d;

    /* renamed from: e */
    public C95738b1 f279312e;

    /* renamed from: f */
    public boolean f279313f = false;

    /* renamed from: g */
    public Map<String, Exif.C80833a> f279314g = new HashMap();

    /* renamed from: h */
    public Map<String, i84> f279315h = new HashMap();

    /* renamed from: i */
    public int f279316i = 0;

    /* renamed from: j */
    public String f279317j;

    /* renamed from: k */
    public String f279318k;

    /* renamed from: l */
    public String f279319l;

    /* renamed from: m */
    public String f279320m;

    /* renamed from: n */
    public boolean f279321n = false;

    /* renamed from: o */
    public boolean f279322o = false;

    /* renamed from: p */
    public boolean f279323p = false;

    /* renamed from: q */
    public WXMediaMessage f279324q = null;

    /* renamed from: r */
    public int f279325r;

    /* renamed from: s */
    public C91998s f279326s = null;

    /* renamed from: t */
    public int f279327t = 1;

    /* renamed from: u */
    public String f279328u = "";

    /* renamed from: v */
    public int f279329v = 9;

    /* renamed from: w */
    public C101802kr2 f279330w;

    /* renamed from: x */
    public int f279331x = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_photo_count_share_finder, 0);

    /* renamed from: y */
    public C95738b1.C95739a f279332y = new d2$$c(this);

    /* renamed from: z */
    public C96142a.C96144b f279333z = new d2$$d(this);

    public C95754d2(MMActivity mMActivity) {
        this.f279311d = mMActivity;
    }

    /* renamed from: a */
    public View mo132124a() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.PicWidget");
        PreviewImageView previewImageView = new PreviewImageView(this.f279311d);
        this.f279312e = previewImageView;
        if (this.f279322o) {
            previewImageView.setIsShowAddImage(false);
        }
        this.f279312e.setImageClick(new d2$$e(this));
        this.f279312e.mo132429a(this.f279310c.mo133209d(), this.f279329v);
        View view = this.f279312e.getView();
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.PicWidget");
        return view;
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.PicWidget");
        SnsMethodCalculate.markStartTimeMs("checkMediaFile", "com.tencent.mm.plugin.sns.ui.PicWidget");
        d2$$j d2__j = this.f279310c;
        boolean z = false;
        if (d2__j != null && !Util.isNullOrNil((List) d2$$j.m122603a(d2__j))) {
            Iterator it = d2$$j.m122603a(this.f279310c).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!C86013q1.m106450k((String) it.next())) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkMediaFile", "com.tencent.mm.plugin.sns.ui.PicWidget");
        if (!z) {
            C76879j.m92738i(this.f279311d, C0966R.string.jjx, C0966R.string.a3h);
        }
        SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.PicWidget");
        return z;
    }

    /* renamed from: d */
    public void mo132126d(Bundle bundle) {
        long j;
        String str;
        String str2;
        long j2;
        WXMediaMessage wXMediaMessage;
        WXMediaMessage.IMediaObject iMediaObject;
        Bundle bundle2 = bundle;
        SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.PicWidget");
        this.f279326s = C91998s.m115551f(this.f279311d.getIntent());
        boolean z = false;
        this.f279313f = this.f279311d.getIntent().getBooleanExtra("Kis_take_photo", false);
        this.f279317j = Util.nullAs(this.f279311d.getIntent().getStringExtra("Ksnsupload_appid"), "");
        this.f279318k = Util.nullAs(this.f279311d.getIntent().getStringExtra("Ksnsupload_appname"), "");
        this.f279321n = this.f279311d.getIntent().getBooleanExtra("KThrid_app", false);
        this.f279322o = this.f279311d.getIntent().getBooleanExtra("KBlockAdd", false);
        this.f279323p = this.f279311d.getIntent().getBooleanExtra("KSnsAction", false);
        this.f279325r = this.f279311d.getIntent().getIntExtra("Ksnsupload_source", 0);
        this.f279319l = Util.nullAs(this.f279311d.getIntent().getStringExtra("reportSessionId"), "");
        this.f279320m = this.f279311d.getIntent().getStringExtra("KSessionID");
        Bundle bundleExtra = this.f279311d.getIntent().getBundleExtra("Ksnsupload_timeline");
        if (bundleExtra != null) {
            this.f279324q = new SendMessageToWX.Req(bundleExtra).message;
        }
        String stringExtra = this.f279311d.getIntent().getStringExtra("sns_kemdia_path");
        byte[] byteArrayExtra = this.f279311d.getIntent().getByteArrayExtra("Ksnsupload_imgbuf");
        if (byteArrayExtra == null && (wXMediaMessage = this.f279324q) != null && (iMediaObject = wXMediaMessage.mediaObject) != null && (iMediaObject instanceof WXImageObject)) {
            byteArrayExtra = ((WXImageObject) iMediaObject).imageData;
        }
        if (Util.isNullOrNil(stringExtra) && !Util.isNullOrNil(byteArrayExtra)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C94866e1.m120263iU());
            sb.append(C90193h.m112878f((" " + System.currentTimeMillis()).getBytes()));
            stringExtra = sb.toString();
            C86013q1.m106447h(stringExtra);
            C86013q1.m106438T(stringExtra, byteArrayExtra, 0, byteArrayExtra.length);
        }
        int intExtra = this.f279311d.getIntent().getIntExtra("KFilterId", 0);
        C116281f0.C116288h hVar = null;
        String string = bundle2 == null ? null : bundle2.getString("sns_kemdia_path_list");
        mo133204t(bundle);
        boolean t = mo133204t(this.f279311d.getIntent().getExtras());
        this.f279316i = 0;
        if (!Util.isNullOrNil(string)) {
            d2$$j d2__j = this.f279310c;
            d2__j.getClass();
            SnsMethodCalculate.markStartTimeMs("setMedia", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
            try {
                for (String split : string.split(";")) {
                    String[] split2 = split.split(",");
                    d2__j.f279345a.add(split2[0]);
                    ((HashMap) d2__j.f279347c).put(split2[0], Integer.valueOf(Util.getInt(split2[1], 0)));
                }
            } catch (Exception unused) {
            }
            SnsMethodCalculate.markEndTimeMs("setMedia", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        } else {
            ArrayList<String> stringArrayListExtra = this.f279311d.getIntent().getStringArrayListExtra("sns_kemdia_path_list");
            String str3 = "get report info error ";
            if (!Util.isNullOrNil((List) stringArrayListExtra)) {
                Iterator<String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    Log.m105918d("MicroMsg.PicWidget", "newPath " + next);
                    this.f279310c.mo133207b(next, intExtra, z);
                    try {
                        Uri n = C116299g2.m163858n(next);
                        String path = n.getPath();
                        if (path != null) {
                            String k = C116299g2.m163855k(path, z, z);
                            if (!n.getPath().equals(k)) {
                                n = n.buildUpon().path(k).build();
                            }
                        }
                        i84 i84 = new i84();
                        i84.f298390h = this.f279313f ? 1 : 2;
                        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, hVar);
                        if (l.mo177810a()) {
                            C86001b0 q = l.f348991a.mo119945q(l.f348992b);
                            if (q != null) {
                                str2 = str3;
                                try {
                                    j2 = q.f250475e;
                                    i84.f298392j = j2 / 1000;
                                    i84.f298391i = Exif.fromFile(next).getUxtimeDatatimeOriginal();
                                    ((HashMap) this.f279315h).put(next, i84);
                                    str = str2;
                                } catch (Exception e) {
                                    e = e;
                                    StringBuilder sb4 = new StringBuilder();
                                    str = str2;
                                    sb4.append(str);
                                    sb4.append(e.getMessage());
                                    Log.m105920e("MicroMsg.PicWidget", sb4.toString());
                                    str3 = str;
                                    z = false;
                                    hVar = null;
                                }
                                str3 = str;
                                z = false;
                                hVar = null;
                            }
                        }
                        str2 = str3;
                        j2 = 0;
                        i84.f298392j = j2 / 1000;
                        i84.f298391i = Exif.fromFile(next).getUxtimeDatatimeOriginal();
                        ((HashMap) this.f279315h).put(next, i84);
                        str = str2;
                    } catch (Exception e2) {
                        e = e2;
                        str2 = str3;
                        StringBuilder sb42 = new StringBuilder();
                        str = str2;
                        sb42.append(str);
                        sb42.append(e.getMessage());
                        Log.m105920e("MicroMsg.PicWidget", sb42.toString());
                        str3 = str;
                        z = false;
                        hVar = null;
                    }
                    str3 = str;
                    z = false;
                    hVar = null;
                }
            } else {
                String str4 = str3;
                if (!Util.isNullOrNil(stringExtra)) {
                    String str5 = C94866e1.m120263iU() + "pre_temp_sns_pic" + C90193h.m112878f(stringExtra.getBytes());
                    SnsMethodCalculate.markStartTimeMs("checkToCreateDir", "com.tencent.mm.plugin.sns.ui.PicWidget");
                    C86013q1.m106461v(C86013q1.m106458s(str5));
                    SnsMethodCalculate.markEndTimeMs("checkToCreateDir", "com.tencent.mm.plugin.sns.ui.PicWidget");
                    C86013q1.m106442c(stringExtra, str5);
                    if (intExtra == -1) {
                        intExtra = 0;
                    }
                    this.f279310c.mo133207b(str5, intExtra, this.f279313f);
                    C94942r1.f275179a.mo131224c(str5, this.f279311d.getIntent().getBundleExtra("key_extra_data"), "key_edit_safe_strategy_emotion_info_list");
                    try {
                        Uri n2 = C116299g2.m163858n(stringExtra);
                        String path2 = n2.getPath();
                        if (path2 != null) {
                            String k2 = C116299g2.m163855k(path2, false, false);
                            if (!n2.getPath().equals(k2)) {
                                n2 = n2.buildUpon().path(k2).build();
                            }
                        }
                        i84 i842 = new i84();
                        i842.f298390h = this.f279313f ? 1 : 2;
                        C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
                        if (l2.mo177810a()) {
                            C86001b0 q2 = l2.f348991a.mo119945q(l2.f348992b);
                            if (q2 != null) {
                                j = q2.f250475e;
                                i842.f298392j = j / 1000;
                                i842.f298391i = Exif.fromFile(stringExtra).getUxtimeDatatimeOriginal();
                                ((HashMap) this.f279315h).put(str5, i842);
                            }
                        }
                        j = 0;
                        i842.f298392j = j / 1000;
                        i842.f298391i = Exif.fromFile(stringExtra).getUxtimeDatatimeOriginal();
                        ((HashMap) this.f279315h).put(str5, i842);
                    } catch (Exception e3) {
                        Log.m105920e("MicroMsg.PicWidget", str4 + e3.getMessage());
                    }
                }
            }
        }
        if (this.f279311d.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f279327t = 1;
        } else {
            this.f279327t = 0;
        }
        this.f279328u = Util.nullAs(this.f279311d.getIntent().getStringExtra("SendAppMessageWrapper_PkgName"), "");
        SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.PicWidget");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02b7, code lost:
        if (r4.f237622b != 0.0d) goto L_0x02bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02c4  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo132127e(int r22, int r23, g34.C116918i r24, java.lang.String r25, java.util.List<java.lang.String> r26, te3.C101802kr2 r27, java.util.LinkedList<java.lang.Long> r28, int r29, boolean r30, java.util.List<java.lang.String> r31, com.tencent.p014mm.pointers.PInt r32, java.lang.String r33, int r34, int r35) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r27
            java.lang.String r6 = "commit"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.PicWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            r0.f279330w = r5
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            com.tencent.mm.plugin.sns.ui.d2$$j r9 = r0.f279310c
            java.util.ArrayList r9 = r9.mo133209d()
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
            r11 = 0
        L_0x0026:
            boolean r12 = r9.hasNext()
            r13 = 2
            if (r12 == 0) goto L_0x00c4
            java.lang.Object r12 = r9.next()
            java.lang.String r12 = (java.lang.String) r12
            vr2.y r14 = new vr2.y
            r14.<init>((java.lang.String) r12, (int) r13)
            r14.f301218e = r13
            r14.f301217d = r1
            if (r11 != 0) goto L_0x004b
            r14.f301216c = r2
            if (r3 == 0) goto L_0x004d
            java.lang.String r13 = r3.f350347d
            r14.f301223j = r13
            java.lang.String r13 = r3.f350348e
            r14.f301224k = r13
            goto L_0x004d
        L_0x004b:
            r14.f301216c = r10
        L_0x004d:
            int r11 = r11 + 1
            com.tencent.mm.plugin.sns.ui.d2$$j r13 = r0.f279310c
            r13.getClass()
            java.lang.String r15 = "getFilter"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r10)
            r16 = r9
            java.util.Map<java.lang.String, java.lang.Integer> r9 = r13.f279347c
            java.util.HashMap r9 = (java.util.HashMap) r9
            boolean r9 = r9.containsKey(r12)
            if (r9 == 0) goto L_0x0079
            java.util.Map<java.lang.String, java.lang.Integer> r9 = r13.f279347c
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r9 = r9.get(r12)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r10)
            goto L_0x007d
        L_0x0079:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r10)
            r9 = 0
        L_0x007d:
            r14.f301215b = r9
            r14.f301225l = r4
            com.tencent.mm.plugin.sns.ui.d2$$j r9 = r0.f279310c
            r9.getClass()
            java.lang.String r13 = "isFromTakePhoto"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r10)
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r15 != 0) goto L_0x00ae
            java.util.Map<java.lang.String, java.lang.Boolean> r15 = r9.f279346b
            java.util.HashMap r15 = (java.util.HashMap) r15
            boolean r15 = r15.containsKey(r12)
            if (r15 == 0) goto L_0x00ae
            java.util.Map<java.lang.String, java.lang.Boolean> r9 = r9.f279346b
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r9 = r9.get(r12)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r10)
            goto L_0x00b2
        L_0x00ae:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r10)
            r9 = 0
        L_0x00b2:
            r14.f301227n = r9
            com.tencent.mm.plugin.sns.model.r1 r9 = com.tencent.p014mm.plugin.sns.model.C94942r1.f275179a
            java.util.List r9 = r9.mo131223b(r12)
            r14.f301228o = r9
            r8.add(r14)
            r9 = r16
            r10 = 0
            goto L_0x0026
        L_0x00c4:
            com.tencent.mm.plugin.sns.statistics.l$a r9 = com.tencent.p014mm.plugin.sns.statistics.C57354l.f164333a
            java.lang.String r9 = "setMediaSource"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            k21.c$a r11 = k21.C60960c.f173618a
            com.tencent.mm.plugin.sns.statistics.n r12 = new com.tencent.mm.plugin.sns.statistics.n
            r12.<init>(r8)
            java.lang.String r14 = "SnsPublishProcess"
            java.lang.String r15 = "mediaMD5_"
            r11.mo85935t(r14, r15, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            if (r26 == 0) goto L_0x0116
            java.lang.Class<gw.g> r10 = p159gw.C8462g.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            gw.g r10 = (p159gw.C8462g) r10
            java.util.List r10 = r10.mo9266gt()
            if (r10 == 0) goto L_0x0116
            java.util.Iterator r11 = r26.iterator()
        L_0x00f9:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0116
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            boolean r14 = r10.contains(r12)
            if (r14 != 0) goto L_0x00f9
            te3.f94 r14 = new te3.f94
            r14.<init>()
            r14.f298255d = r12
            r9.add(r14)
            goto L_0x00f9
        L_0x0116:
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.tencent.mm.plugin.sns.ui.d2$$j r12 = r0.f279310c
            int r12 = r12.mo133208c()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r14 = 0
            r11[r14] = r12
            java.lang.String r12 = "MicroMsg.PicWidget"
            java.lang.String r14 = "media size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r14, r11)
            com.tencent.mm.plugin.sns.ui.d2$$j r11 = r0.f279310c
            int r11 = r11.mo133208c()
            if (r11 != 0) goto L_0x013e
            com.tencent.mm.plugin.sns.model.s2 r11 = new com.tencent.mm.plugin.sns.model.s2
            com.tencent.mm.ui.MMActivity r14 = r0.f279311d
            r11.<init>(r13, r14)
            goto L_0x0145
        L_0x013e:
            com.tencent.mm.plugin.sns.model.s2 r11 = new com.tencent.mm.plugin.sns.model.s2
            com.tencent.mm.ui.MMActivity r14 = r0.f279311d
            r11.<init>(r10, r14)
        L_0x0145:
            int r14 = r11.mo131253j()
            r15 = r32
            r15.value = r14
            if (r3 == 0) goto L_0x0156
            java.lang.String r14 = r3.f350347d
            java.lang.String r3 = r3.f350348e
            r11.mo131241O(r14, r3)
        L_0x0156:
            int r3 = kr2.C76634a.f224255a
            r14 = r29
            if (r14 <= r3) goto L_0x0160
            r3 = 3
            r11.mo131261r(r10, r3)
        L_0x0160:
            r11.mo131260q(r4)
            r3 = r28
            r11.mo131262s(r3)
            r11.mo131265v(r5)
            r11.mo131243Q(r9)
            r11.mo131228B(r1)
            r11.mo131239M(r2)
            if (r30 == 0) goto L_0x017a
            r11.mo131264u(r10)
            goto L_0x017e
        L_0x017a:
            r1 = 0
            r11.mo131264u(r1)
        L_0x017e:
            java.lang.String r1 = r0.f279317j
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x018b
            java.lang.String r1 = r0.f279317j
            r11.mo131231E(r1)
        L_0x018b:
            java.lang.String r1 = r0.f279318k
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x019e
            java.lang.String r1 = r0.f279318k
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r2)
            r11.mo131230D(r1)
        L_0x019e:
            int r1 = r0.f279325r
            r11.mo131234H(r1)
            boolean r1 = r0.f279321n
            if (r1 == 0) goto L_0x01ab
            r1 = 5
            r11.mo131234H(r1)
        L_0x01ab:
            boolean r1 = r0.f279323p
            if (r1 == 0) goto L_0x01c3
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r1 = r0.f279324q
            if (r1 == 0) goto L_0x01c3
            java.lang.String r1 = r1.mediaTagName
            r11.mo131238L(r1)
            java.lang.String r1 = r0.f279317j
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r3 = r0.f279324q
            java.lang.String r4 = r3.messageExt
            java.lang.String r3 = r3.messageAction
            r11.mo131240N(r1, r4, r3)
        L_0x01c3:
            r16 = 0
            r17 = 0
            r18 = 0
            r15 = r11
            r19 = r34
            r20 = r35
            r15.mo131235I(r16, r17, r18, r19, r20)
            int r1 = r0.f279327t
            java.lang.String r3 = r0.f279328u
            r11.mo131269z(r1, r3)
            r1 = r31
            r11.mo131263t(r1)
            java.lang.String r1 = r0.f279319l
            r11.mo131232F(r1)
            r0.mo133200p(r11)
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.UploadPackHelper"
            if (r5 == 0) goto L_0x0209
            int r3 = r5.f298660t
            if (r3 == 0) goto L_0x0209
            java.lang.String r4 = r5.f298652i
            java.lang.String r5 = "setScore"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)
            te3.lv2 r9 = r11.f275200g
            te3.q64 r14 = new te3.q64
            r14.<init>()
            r9.f298734H = r14
            te3.lv2 r9 = r11.f275200g
            te3.q64 r9 = r9.f298734H
            r9.f184979i = r3
            r9.f184974d = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
        L_0x0209:
            java.lang.Object[] r3 = new java.lang.Object[r13]
            int r4 = r8.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            int r4 = r0.f279316i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r10] = r4
            java.lang.String r4 = "commit pic size %d, browseImageCount:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r3)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 11602(0x2d52, float:1.6258E-41)
            java.lang.Object[] r9 = new java.lang.Object[r13]
            int r14 = r0.f279316i
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r9[r5] = r14
            int r5 = r8.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9[r10] = r5
            r3.mo160131h(r4, r9)
            java.util.Iterator r3 = r8.iterator()
        L_0x0242:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0391
            java.lang.Object r4 = r3.next()
            vr2.y r4 = (vr2.C102270y) r4
            java.lang.Object[] r5 = new java.lang.Object[r13]
            java.lang.String r9 = r4.f301214a
            r14 = 0
            r5[r14] = r9
            long r15 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
            java.lang.Long r9 = java.lang.Long.valueOf(r15)
            r5[r10] = r9
            java.lang.String r9 = "commit path  %s len: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r9, r5)
            java.lang.String r4 = r4.f301214a
            java.util.Map<java.lang.String, te3.i84> r5 = r0.f279315h
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r4)
            te3.i84 r5 = (te3.i84) r5
            if (r5 != 0) goto L_0x0277
            te3.i84 r5 = new te3.i84
            r5.<init>()
        L_0x0277:
            te3.kr2 r9 = r0.f279309A
            r15 = -998637568(0xffffffffc47a0000, float:-1000.0)
            if (r9 == 0) goto L_0x029a
            float r13 = r9.f298648e
            r16 = 0
            int r17 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r17 != 0) goto L_0x028b
            float r14 = r9.f298647d
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L_0x029a
        L_0x028b:
            r5.f298388f = r13
            float r13 = r9.f298647d
            r5.f298389g = r13
            int r13 = r9.f298657q
            r5.f298394o = r13
            float r9 = r9.f298658r
            r5.f298393n = r9
            goto L_0x029e
        L_0x029a:
            r5.f298388f = r15
            r5.f298389g = r15
        L_0x029e:
            java.util.Map<java.lang.String, com.tencent.mm.compatible.util.Exif$a> r9 = r0.f279314g
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r4 = r9.get(r4)
            com.tencent.mm.compatible.util.Exif$a r4 = (com.tencent.p014mm.compatible.util.Exif.C80833a) r4
            if (r4 == 0) goto L_0x02c4
            double r13 = r4.f237621a
            r16 = 0
            int r9 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r9 != 0) goto L_0x02ba
            r9 = r11
            double r10 = r4.f237622b
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 == 0) goto L_0x02c5
            goto L_0x02bb
        L_0x02ba:
            r9 = r11
        L_0x02bb:
            float r10 = (float) r13
            r5.f298386d = r10
            double r10 = r4.f237622b
            float r4 = (float) r10
            r5.f298387e = r4
            goto L_0x02c9
        L_0x02c4:
            r9 = r11
        L_0x02c5:
            r5.f298386d = r15
            r5.f298387e = r15
        L_0x02c9:
            java.lang.String r4 = "addSnsReportInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r1)
            java.lang.StringBuffer r10 = new java.lang.StringBuffer
            r10.<init>()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "||index: "
            r11.append(r13)
            te3.lv2 r13 = r9.f275200g
            java.util.LinkedList<te3.i84> r13 = r13.f298762z
            int r13 = r13.size()
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            r10.append(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "||item poi lat "
            r11.append(r13)
            float r13 = r5.f298388f
            r11.append(r13)
            java.lang.String r13 = " "
            r11.append(r13)
            float r14 = r5.f298389g
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            r10.append(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "||item pic lat "
            r11.append(r14)
            float r14 = r5.f298386d
            r11.append(r14)
            r11.append(r13)
            float r13 = r5.f298387e
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            r10.append(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "||item exitime:"
            r11.append(r13)
            long r13 = r5.f298391i
            r11.append(r13)
            java.lang.String r13 = " filetime: "
            r11.append(r13)
            long r13 = r5.f298392j
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            r10.append(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "||item source: "
            r11.append(r13)
            int r13 = r5.f298390h
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            r10.append(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "addSnsReportInfo item : "
            r11.append(r13)
            java.lang.String r10 = r10.toString()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "MicroMsg.UploadPackHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            te3.lv2 r10 = r9.f275200g
            java.util.LinkedList<te3.i84> r10 = r10.f298762z
            r10.add(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            r11 = r9
            r10 = 1
            r13 = 2
            goto L_0x0242
        L_0x0391:
            r9 = r11
            r0.mo133779j(r9)
            int r1 = r8.size()
            r3 = 1
            if (r1 > r3) goto L_0x03ab
            java.lang.String r1 = "commitImp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r7)
            r9.mo131242P(r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r7)
            r0.mo133198l(r9)
            goto L_0x03b7
        L_0x03ab:
            com.tencent.mm.plugin.sns.ui.d2$$i r1 = new com.tencent.mm.plugin.sns.ui.d2$$i
            r1.<init>(r0, r9, r8)
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r1.mo131292d(r2)
        L_0x03b7:
            com.tencent.mm.sdk.platformtools.MMHandlerThread r1 = f40.C86709a0.m107525e()
            com.tencent.mm.plugin.sns.ui.d2$$f r2 = new com.tencent.mm.plugin.sns.ui.d2$$f
            r2.<init>(r0)
            r1.postToWorker(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C95754d2.mo132127e(int, int, g34.i, java.lang.String, java.util.List, te3.kr2, java.util.LinkedList, int, boolean, java.util.List, com.tencent.mm.pointers.PInt, java.lang.String, int, int):boolean");
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.PicWidget");
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.PicWidget");
        return true;
    }

    /* renamed from: g */
    public boolean mo132129g() {
        SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.PicWidget");
        C95738b1 b1Var = this.f279312e;
        if (b1Var != null) {
            b1Var.clean();
        }
        ((HashMap) this.f279314g).clear();
        ((HashMap) this.f279315h).clear();
        SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.PicWidget");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo132130h() {
        /*
            r7 = this;
            java.lang.String r0 = "enableNext"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.PicWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.d2$$j r2 = r7.f279310c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x002b
            r2.getClass()
            java.lang.String r5 = "enable"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.util.ArrayList<java.lang.String> r2 = r2.f279345a
            if (r2 == 0) goto L_0x0023
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0023
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            if (r2 == 0) goto L_0x002b
            r2 = 1
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.tencent.mm.plugin.sns.ui.d2$$j r6 = r7.f279310c
            if (r6 != 0) goto L_0x0035
            r6 = 1
            goto L_0x0036
        L_0x0035:
            r6 = 0
        L_0x0036:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5[r4] = r6
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r5[r3] = r4
            java.lang.String r3 = "MicroMsg.PicWidget"
            java.lang.String r4 = "enableNext: mediaObj null:[%b], enable:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C95754d2.mo132130h():boolean");
    }

    /* renamed from: i */
    public void mo132131i(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.PicWidget");
        bundle.putString("sns_kemdia_path_list", this.f279310c.toString());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((HashMap) this.f279314g).entrySet()) {
            arrayList.add(String.format("%s\n%f\n%f", new Object[]{entry.getKey(), Double.valueOf(((Exif.C80833a) entry.getValue()).f237621a), Double.valueOf(((Exif.C80833a) entry.getValue()).f237622b)}));
        }
        bundle.putStringArrayList("sns_media_latlong_list", arrayList);
        SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.PicWidget");
    }

    /* renamed from: k */
    public boolean mo133197k(List<String> list, int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("addPreviewImage", "com.tencent.mm.plugin.sns.ui.PicWidget");
        if (list == null || list.size() == 0) {
            Log.m105924i("MicroMsg.PicWidget", "no image selected");
            SnsMethodCalculate.markEndTimeMs("addPreviewImage", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return true;
        } else if (this.f279310c.mo133208c() >= 9) {
            SnsMethodCalculate.markEndTimeMs("addPreviewImage", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return true;
        } else {
            for (String next : list) {
                if (C86013q1.m106450k(next)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("pre_temp_sns_pic");
                    sb.append(C90193h.m112878f((next + System.currentTimeMillis()).getBytes()));
                    String sb4 = sb.toString();
                    if (!C86013q1.m106450k(C94866e1.m120263iU())) {
                        Log.m105928w("MicroMsg.PicWidget", "sns temp path not exist!");
                        C86013q1.m106461v(C94866e1.m120263iU());
                    }
                    C100408j0.m131382Ow(C94866e1.m120263iU(), next, sb4);
                    C98453h.f288774a.mo137811i(next);
                    String str = C94866e1.m120263iU() + sb4;
                    int i2 = 2;
                    Log.m105925i("MicroMsg.PicWidget", "addPreviewImage oldPath:%s, newPath：%s", next, str);
                    if (SnsTimeLineUI.m122313w8() && C57354l.f164333a.mo80973j(next)) {
                        z = true;
                    }
                    this.f279310c.mo133207b(str, i, z);
                    ((C96148b) this.f279312e).mo133768g(this.f279310c.mo133208c());
                    this.f279312e.mo132429a(this.f279310c.mo133209d(), this.f279329v);
                    this.f279311d.getIntent().putExtra("sns_kemdia_path_list", this.f279310c.mo133209d());
                    MMActivity mMActivity = this.f279311d;
                    if (mMActivity instanceof SnsUploadUI) {
                        ((SnsUploadUI) mMActivity).mo133088a8();
                    }
                    try {
                        Uri n = C116299g2.m163858n(next);
                        String path = n.getPath();
                        if (path != null) {
                            String k = C116299g2.m163855k(path, false, false);
                            if (!n.getPath().equals(k)) {
                                n = n.buildUpon().path(k).build();
                            }
                        }
                        i84 i84 = new i84();
                        if (z) {
                            i2 = 1;
                        }
                        i84.f298390h = i2;
                        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                        long j = 0;
                        if (l.mo177810a()) {
                            C86001b0 q = l.f348991a.mo119945q(l.f348992b);
                            if (q != null) {
                                j = q.f250475e;
                            }
                        }
                        i84.f298392j = j / 1000;
                        i84.f298391i = Exif.fromFile(next).getUxtimeDatatimeOriginal();
                        ((HashMap) this.f279315h).put(str, i84);
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.PicWidget", "get report info error " + e.getMessage());
                    }
                    C94942r1 r1Var = C94942r1.f275179a;
                    SnsMethodCalculate.markStartTimeMs("updateKeyAndMoveEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
                    C87412m.m108594g(next, "oldKey");
                    C87412m.m108594g(str, "newKey");
                    Map<String, List<EmotionStrategyInfo>> map = C94942r1.f275180b;
                    Object obj = (List) ((LinkedHashMap) map).get(next);
                    if (obj == null) {
                        obj = new ArrayList();
                    }
                    map.put(str, obj);
                    map.put(next, new ArrayList());
                    SnsMethodCalculate.markEndTimeMs("updateKeyAndMoveEmotionSafeStrategyInfoList", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
                }
            }
            SnsMethodCalculate.markEndTimeMs("addPreviewImage", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0173  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133198l(com.tencent.p014mm.plugin.sns.model.C94945s2 r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "commitDone"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.PicWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            int r4 = r18.mo131252i()
            ad0.s r0 = r1.f279326s
            if (r0 == 0) goto L_0x001b
            r0.mo125840a(r4)
            com.tencent.mm.plugin.sns.statistics.a0 r0 = com.tencent.p014mm.plugin.sns.statistics.C95006y.f275639b
            ad0.s r5 = r1.f279326s
            r0.mo131398c(r5)
        L_0x001b:
            com.tencent.mm.plugin.sns.ui.d2$$j r0 = r1.f279310c
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0045
            java.util.ArrayList r0 = r0.mo133209d()
            if (r0 == 0) goto L_0x0045
            java.lang.String[] r0 = os2.C100408j0.f294137e
            java.lang.String r0 = "is1080P"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.storage.SnsMediaStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r7)
            int r8 = os2.C100408j0.f294139g
            r9 = 1080(0x438, float:1.513E-42)
            if (r8 < r9) goto L_0x003d
            int r8 = os2.C100408j0.f294138f
            if (r8 < r9) goto L_0x003d
            r8 = 1
            goto L_0x003e
        L_0x003d:
            r8 = 0
        L_0x003e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r7)
            if (r8 == 0) goto L_0x0045
            r7 = 1
            goto L_0x0046
        L_0x0045:
            r7 = 0
        L_0x0046:
            if (r7 == 0) goto L_0x0061
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 12834(0x3222, float:1.7984E-41)
            java.lang.Object[] r9 = new java.lang.Object[r5]
            com.tencent.mm.plugin.sns.ui.d2$$j r10 = r1.f279310c
            java.util.ArrayList r10 = r10.mo133209d()
            int r10 = r10.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r6] = r10
            r0.mo160131h(r8, r9)
        L_0x0061:
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            long r9 = (long) r4
            java.lang.String r0 = "sns_table_"
            java.lang.String r9 = os2.C100417r0.m131421j(r0, r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.tencent.mm.plugin.sns.ui.d2$$j r0 = r1.f279310c
            java.util.ArrayList r11 = r0.mo133209d()
            r12 = 0
        L_0x007a:
            int r0 = r11.size()
            java.lang.String r13 = "MicroMsg.PicWidget"
            if (r12 >= r0) goto L_0x0148
            java.lang.Object r0 = r11.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r14[r6] = r0
            android.net.Uri r15 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r5 = r15.getPath()
            if (r5 == 0) goto L_0x00b1
            java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r6, r6)
            java.lang.String r6 = r15.getPath()
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x00b1
            android.net.Uri$Builder r6 = r15.buildUpon()
            android.net.Uri$Builder r5 = r6.path(r5)
            android.net.Uri r15 = r5.build()
        L_0x00b1:
            com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r6 = 0
            com.tencent.mm.vfs.f0$h r5 = r5.mo177799l(r15, r6)
            boolean r6 = r5.mo177810a()
            r15 = 0
            if (r6 != 0) goto L_0x00c1
            goto L_0x00cf
        L_0x00c1:
            com.tencent.mm.vfs.FileSystem$c r6 = r5.f348991a
            java.lang.String r5 = r5.f348992b
            com.tencent.mm.vfs.b0 r5 = r6.mo119945q(r5)
            if (r5 != 0) goto L_0x00cc
            goto L_0x00cf
        L_0x00cc:
            long r5 = r5.f250473c
            r15 = r5
        L_0x00cf:
            java.lang.Long r5 = java.lang.Long.valueOf(r15)
            r6 = 1
            r14[r6] = r5
            java.lang.String r5 = "mediaPath = %s, isExist = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r5, r14)
            java.lang.String r5 = "pre_temp_sns_pic"
            boolean r6 = r0.contains(r5)
            if (r6 == 0) goto L_0x013e
            int r5 = r0.indexOf(r5)
            int r5 = r5 + 16
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.tencent.mm.ui.MMActivity r14 = r1.f279311d
            java.io.File r14 = r14.getExternalCacheDir()
            java.lang.String r14 = r14.getPath()
            r6.append(r14)
            java.lang.String r14 = "/"
            r6.append(r14)
            java.lang.String r5 = r0.substring(r5)
            r6.append(r5)
            java.lang.String r5 = ".jpg"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r6 = 1
            java.lang.Object[] r14 = new java.lang.Object[r6]
            r6 = 0
            r14[r6] = r5
            java.lang.String r6 = "copy path = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r6, r14)
            java.io.InputStream r0 = com.tencent.p014mm.vfs.C86013q1.m106423E(r0)     // Catch:{ Exception -> 0x0130 }
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.io.InputStream) r0)     // Catch:{ Exception -> 0x0130 }
            r6 = 100
            android.graphics.Bitmap$CompressFormat r14 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0130 }
            r15 = 1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r6, r14, r5, r15)     // Catch:{ Exception -> 0x012e }
            goto L_0x013a
        L_0x012e:
            r0 = move-exception
            goto L_0x0132
        L_0x0130:
            r0 = move-exception
            r15 = 1
        L_0x0132:
            r6 = 0
            java.lang.Object[] r14 = new java.lang.Object[r6]
            java.lang.String r6 = "copy form mediaPath to copyPath result with jpeg fail"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r6, r14)
        L_0x013a:
            r10.add(r5)
            goto L_0x0142
        L_0x013e:
            r15 = 1
            r10.add(r0)
        L_0x0142:
            int r12 = r12 + 1
            r5 = 1
            r6 = 0
            goto L_0x007a
        L_0x0148:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "showFinderEntranceCount = "
            r0.append(r5)
            int r5 = r1.f279331x
            r0.append(r5)
            java.lang.String r5 = ", mediaResultListCount = "
            r0.append(r5)
            int r5 = r10.size()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            int r0 = r1.f279331x
            int r5 = r10.size()
            if (r0 > r5) goto L_0x017a
            yn2.s0 r0 = yn2.C102882s0.f303681a
            te3.kr2 r5 = r1.f279330w
            r0.mo142601m(r9, r5, r10, r7)
        L_0x017a:
            java.lang.String r0 = "sns_local_id"
            r8.putExtra(r0, r4)
            com.tencent.mm.ui.MMActivity r0 = r1.f279311d
            r4 = -1
            r0.setResult(r4, r8)
            com.tencent.mm.ui.MMActivity r0 = r1.f279311d
            r0.finish()
            com.tencent.mm.plugin.sns.model.p2 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.gy0()
            r0.mo131192c()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C95754d2.mo133198l(com.tencent.mm.plugin.sns.model.s2):void");
    }

    /* renamed from: m */
    public void mo133199m() {
        SnsMethodCalculate.markStartTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.PicWidget");
        int c = this.f279329v - this.f279310c.mo133208c();
        if (c <= 0) {
            Log.m105920e("MicroMsg.PicWidget", "has select the max image count");
            SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return;
        }
        SightParams sightParams = new SightParams(2, 0);
        String l = C97842b.m126295l(C98398h0.wx0().ca0());
        String n = C97842b.m126297n(l);
        C94992f fVar = C94992f.f275600a;
        VideoTransPara videoTransPara = sightParams.f248452f;
        RecordConfigProvider a = fVar.mo131399a(l, n, videoTransPara, videoTransPara.f267170h * 1000, 49);
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_ignore_remux_without_edit, false)) {
            a.f272919d = 2;
        }
        VideoCaptureReportInfo videoCaptureReportInfo = new VideoCaptureReportInfo();
        videoCaptureReportInfo.f272940d = 7;
        a.f272908I = videoCaptureReportInfo;
        long c2 = C31543z5.m39453c();
        if (c < this.f279329v) {
            C115669n.INSTANCE.mo160131h(13822, 1, 2, C102236a0.m134754l(), Long.valueOf(c2));
            a.f272932t = Boolean.FALSE;
        } else {
            C115669n.INSTANCE.mo160131h(13822, 1, 2, C102236a0.m134754l(), Long.valueOf(c2));
        }
        ((C77572l) C86312j.m106911c(C77572l.class)).mo107612ZM(this.f279311d, a, new d2$$h(this));
        mo133202r(1);
        SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.PicWidget");
    }

    /* renamed from: n */
    public void mo132254n(Object obj) {
        Object obj2 = obj;
        SnsMethodCalculate.markStartTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
        if (obj2 instanceof C77575r) {
            C77575r rVar = (C77575r) obj2;
            Log.m105925i("MicroMsg.PicWidget", "handleMediaOptResult: resultCode=%d, optCode=%d", Integer.valueOf(rVar.f226147b), Integer.valueOf(rVar.f226148c));
            if (rVar.f226147b == -1 && rVar.f226148c == 0) {
                C77574q qVar = rVar.f226149d;
                C94942r1.f275179a.mo131224c(qVar.f226143b, rVar.f226150e, "key_edit_safe_strategy_emotion_info_list");
                if (qVar.mo107739a()) {
                    String str = qVar.f226143b;
                    if (!Util.isNullOrNil(str)) {
                        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_clear_sns_tmp_file, true)) {
                            C98453h.f288774a.mo137818p(str);
                        }
                        mo133197k(Collections.singletonList(str), 0, true);
                        SnsMethodCalculate.markEndTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                        return;
                    }
                } else {
                    C101783gu2 gu22 = new C101783gu2();
                    gu22.f298309e = true;
                    gu22.f298308d = false;
                    String str2 = qVar.f226143b;
                    SightCaptureResult sightCaptureResult = new SightCaptureResult(true, str2, qVar.f226144c, C86013q1.m106457r(str2), MD5.getMD5(str2), (int) (qVar.f226145d / 1000), gu22);
                    this.f279311d.getIntent().putExtra("key_extra_data", rVar.f226150e);
                    ((SnsUploadUI) this.f279311d).mo133087Z7(sightCaptureResult);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
    }

    /* renamed from: o */
    public View mo133192o(View view, View view2, DynamicGridView dynamicGridView, View view3, View view4) {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.PicWidget");
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.f279312e == null);
        Log.m105925i("MicroMsg.PicWidget", "initView: previewImage null[%b]", objArr);
        C95738b1 b1Var = this.f279312e;
        if (b1Var == null) {
            this.f279312e = new C96148b(view, view2, view3, view4, this.f279311d, this.f279310c.mo133209d(), this.f279329v, dynamicGridView, this.f279332y, this.f279333z, !this.f279322o);
        } else {
            b1Var.mo132429a(this.f279310c.mo133209d(), this.f279329v);
        }
        View view5 = this.f279312e.getView();
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.PicWidget");
        return view5;
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        String str;
        int i3 = i;
        Intent intent2 = intent;
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_clear_sns_tmp_file;
        Class cls = C32735h.class;
        Class cls2 = C11502f.class;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
        if (i3 == 2) {
            Log.m105924i("MicroMsg.PicWidget", "onActivityResult 1 CONTEXT_CHOSE_IMAGE");
            if (intent2 == null) {
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return false;
            }
            Intent intent3 = new Intent();
            intent3.putExtra("CropImageMode", 4);
            intent3.putExtra("CropImage_DirectlyIntoFilter", true);
            intent3.putExtra("CropImage_Filter", true);
            ((C67654r1) ((C11502f) C86312j.m106911c(cls2)).mo11462yM()).mo93179l(this.f279311d, intent, intent3, C94866e1.m120263iU(), 4, new d2$$g(this));
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return true;
        } else if (i3 == 3) {
            Log.m105924i("MicroMsg.PicWidget", "onActivityResult 2 CONTEXT_MENU_TAKE_PICTURE");
            String b = C96892t1.m124462b(this.f279311d.getApplicationContext(), intent2, C94866e1.m120263iU());
            if (b == null) {
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            }
            Intent intent4 = new Intent();
            intent4.putExtra("CropImageMode", 4);
            intent4.putExtra("CropImage_Filter", true);
            intent4.putExtra("CropImage_DirectlyIntoFilter", true);
            intent4.putExtra("CropImage_ImgPath", b);
            String f = C90193h.m112878f((b + System.currentTimeMillis()).getBytes());
            intent4.putExtra("CropImage_OutputPath", C94866e1.m120263iU() + f);
            i84 i84 = new i84();
            i84.f298390h = 1;
            i84.f298392j = System.currentTimeMillis();
            i84.f298391i = Util.safeParseLong(Exif.fromFile(b).dateTime);
            ((HashMap) this.f279315h).put(C94866e1.m120263iU() + f, i84);
            ((C67654r1) ((C11502f) C86312j.m106911c(cls2)).mo11462yM()).mo93178k(this.f279311d, intent4, 4);
            this.f279313f = true;
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return true;
        } else if (i3 == 4) {
            Log.m105924i("MicroMsg.PicWidget", "onActivityResult 3 REQUEST_CODE_IMAGE_SEND_COMFIRM");
            if (intent2 == null) {
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            }
            String stringExtra = intent2.getStringExtra("CropImage_OutputPath");
            Log.m105918d("MicroMsg.PicWidget", "REQUEST_CODE_IMAGE_SEND_COMFIRM filePath " + stringExtra);
            if (stringExtra == null) {
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            } else if (!C86013q1.m106450k(stringExtra)) {
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            } else if (this.f279310c.mo133208c() >= 9) {
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            } else {
                int intExtra = intent2.getIntExtra("CropImage_filterId", 0);
                StringBuilder sb = new StringBuilder();
                sb.append("pre_temp_sns_pic");
                sb.append(C90193h.m112878f((stringExtra + System.currentTimeMillis()).getBytes()));
                String sb4 = sb.toString();
                Log.m105924i("MicroMsg.PicWidget", "onactivity result " + C86013q1.m106451l(stringExtra) + " " + stringExtra);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(C94866e1.m120263iU());
                sb5.append(sb4);
                C86013q1.m106442c(stringExtra, sb5.toString());
                if (((HashMap) this.f279314g).containsKey(stringExtra)) {
                    ((HashMap) this.f279314g).put(C94866e1.m120263iU() + sb4, (Exif.C80833a) ((HashMap) this.f279314g).get(stringExtra));
                }
                String str2 = C94866e1.m120263iU() + sb4;
                Log.m105918d("MicroMsg.PicWidget", "newPath " + str2);
                this.f279310c.mo133207b(str2, intExtra, false);
                this.f279311d.getIntent().putExtra("sns_kemdia_path_list", this.f279310c.mo133209d());
                ((C96148b) this.f279312e).mo133768g(this.f279310c.mo133208c());
                this.f279312e.mo132429a(this.f279310c.mo133209d(), this.f279329v);
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            }
        } else if (i3 != 7) {
            if (i3 == 9) {
                Log.m105924i("MicroMsg.PicWidget", "onActivityResult CONTEXT_MENU_IMAGE_FROM_MMGALLERY");
                if (intent2.hasExtra("key_video_template_info")) {
                    this.f279311d.getIntent().putExtra("KSnsVideoTempalteInfo", intent2.getByteArrayExtra("key_video_template_info"));
                }
                Bundle bundleExtra = intent2.getBundleExtra("key_extra_data");
                if (bundleExtra == null || bundleExtra.getByteArray("key_bg_generate_pb") == null || bundleExtra.getByteArray("key_bg_generate_extra_config") == null) {
                    ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("key_select_video_list");
                    if ((stringArrayListExtra == null || stringArrayListExtra.size() <= 0) && Util.isNullOrNil(intent2.getStringExtra("K_SEGMENTVIDEOPATH"))) {
                        SightCaptureResult sightCaptureResult = (SightCaptureResult) intent2.getParcelableExtra("key_req_result");
                        if (sightCaptureResult != null && !sightCaptureResult.f201515e) {
                            MMActivity mMActivity = this.f279311d;
                            if (mMActivity instanceof SnsUploadUI) {
                                ((SnsUploadUI) mMActivity).mo133087Z7(sightCaptureResult);
                                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                                return true;
                            }
                        }
                        ArrayList<String> stringArrayListExtra2 = intent2.getStringArrayListExtra("CropImage_OutputPath_List");
                        int intExtra2 = intent2.getIntExtra("CropImage_filterId", 0);
                        boolean booleanExtra = intent2.getBooleanExtra("isTakePhoto", false);
                        if (((C32735h) C86312j.m106911c(cls)).mo58784wf(cVar, true) && stringArrayListExtra2 != null) {
                            C98453h hVar = C98453h.f288774a;
                            for (String str3 : stringArrayListExtra2) {
                                if (str3 != null && C112550d0.m153801u(str3, "photoEdited_", false)) {
                                    Log.m105924i("MicroMsg.MediaFileUtil", "markDeletePhotoEditFile: " + str3);
                                    C98453h.f288774a.mo137818p(str3);
                                }
                            }
                        }
                        mo133197k(stringArrayListExtra2, intExtra2, booleanExtra);
                        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                        return true;
                    }
                    String stringExtra2 = (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) ? intent2.getStringExtra("K_SEGMENTVIDEOPATH") : stringArrayListExtra.get(0);
                    String stringExtra3 = intent2.getStringExtra("KSEGMENTVIDEOTHUMBPATH");
                    this.f279311d.getIntent().putExtra("key_extra_data", intent2.getBundleExtra("key_extra_data"));
                    this.f279311d.getIntent().putExtra("Kis_from_sns_drafg_stg", false);
                    if (Util.isNullOrNil(stringExtra3) || !C86013q1.m106450k(stringExtra3)) {
                        String str4 = C94866e1.m120263iU() + C86013q1.m106456q(stringExtra2);
                        C89231c cVar2 = new C89231c();
                        try {
                            cVar2.setDataSource(stringExtra2);
                            Bitmap frameAtTime = cVar2.getFrameAtTime(0);
                            if (frameAtTime == null) {
                                Log.m105920e("MicroMsg.PicWidget", "get bitmap error");
                                try {
                                    cVar2.release();
                                } catch (Exception unused) {
                                }
                            } else {
                                Log.m105925i("MicroMsg.PicWidget", "getBitmap1 %d %d", Integer.valueOf(frameAtTime.getWidth()), Integer.valueOf(frameAtTime.getHeight()));
                                BitmapUtil.saveBitmapToImage(frameAtTime, 80, Bitmap.CompressFormat.JPEG, str4, true);
                                BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str4);
                                Log.m105925i("MicroMsg.PicWidget", "getBitmap2 %d %d", Integer.valueOf(imageOptions.outWidth), Integer.valueOf(imageOptions.outHeight));
                                try {
                                    cVar2.release();
                                } catch (Exception unused2) {
                                }
                                str = str4;
                            }
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.PicWidget", "savebitmap error %s", e.getMessage());
                        } catch (Throwable th) {
                            try {
                                cVar2.release();
                            } catch (Exception unused3) {
                            }
                            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                            throw th;
                        }
                    } else {
                        str = stringExtra3;
                    }
                    Log.m105925i("MicroMsg.PicWidget", "video path %s thumb path %s and %s %s ", stringExtra2, str, Long.valueOf(C86013q1.m106451l(stringExtra2)), Long.valueOf(C86013q1.m106451l(str)));
                    String q = C86013q1.m106456q(stringExtra2);
                    if (this.f279311d instanceof SnsUploadUI) {
                        C102236a0.m134781y0(intent2.getStringExtra("KSEGMENTMEDIAEDITID"));
                        ((SnsUploadUI) this.f279311d).mo133090c8(stringExtra2, str, q, (byte[]) null, false, false);
                        ((SnsUploadUI) this.f279311d).mo133085X7((Bundle) null);
                    }
                    SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                    return true;
                }
                Log.m105924i("MicroMsg.PicWidget", "goto vlog mode");
                this.f279311d.getIntent().getExtras().clear();
                this.f279311d.getIntent().putExtra("Kis_take_photo", false);
                this.f279311d.getIntent().putExtra("KSnsPostManu", true);
                this.f279311d.getIntent().putExtra("Ksnsupload_type", 14);
                this.f279311d.getIntent().putExtra("key_extra_data", intent2.getBundleExtra("key_extra_data"));
                ((SnsUploadUI) this.f279311d).mo133085X7((Bundle) null);
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            } else if (i3 == 11) {
                Log.m105924i("MicroMsg.PicWidget", "onActivityResult REQUEST_CODE_MMSIGHT_CAPTURE");
                SightCaptureResult sightCaptureResult2 = (SightCaptureResult) intent2.getParcelableExtra("key_req_result");
                if (sightCaptureResult2 != null) {
                    if (sightCaptureResult2.f201515e) {
                        String str5 = sightCaptureResult2.f201523p;
                        if (!Util.isNullOrNil(str5)) {
                            if (((C32735h) C86312j.m106911c(cls)).mo58784wf(cVar, true)) {
                                C98453h.f288774a.mo137818p(str5);
                            }
                            mo133197k(Collections.singletonList(str5), 0, true);
                            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                            return true;
                        }
                    } else {
                        this.f279311d.getIntent().putExtra("key_extra_data", intent2.getBundleExtra("key_extra_data"));
                        ((SnsUploadUI) this.f279311d).mo133087Z7(sightCaptureResult2);
                        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                        return true;
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return false;
        } else if (intent2 == null) {
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return true;
        } else {
            Log.m105924i("MicroMsg.PicWidget", "onActivityResult: pic state edit");
            d2$$j d2__j = this.f279310c;
            ArrayList<String> stringArrayListExtra3 = intent2.getStringArrayListExtra("sns_gallery_temp_paths");
            d2__j.getClass();
            SnsMethodCalculate.markStartTimeMs("setMedias", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
            ((HashMap) d2__j.f279346b).clear();
            if (stringArrayListExtra3 == null) {
                d2__j.f279345a = new ArrayList<>();
            } else {
                d2__j.f279345a = stringArrayListExtra3;
                Iterator<String> it = stringArrayListExtra3.iterator();
                while (it.hasNext()) {
                    ((HashMap) d2__j.f279346b).put(it.next(), Boolean.FALSE);
                }
            }
            SnsMethodCalculate.markEndTimeMs("setMedias", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
            this.f279311d.getIntent().putExtra("sns_kemdia_path_list", this.f279310c.mo133209d());
            this.f279312e.mo132429a(this.f279310c.mo133209d(), this.f279329v);
            ((C96148b) this.f279312e).mo133768g(this.f279310c.mo133208c());
            this.f279316i = intent2.getIntExtra("sns_update_preview_image_count", 0);
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return true;
        }
    }

    /* renamed from: p */
    public void mo133200p(C94945s2 s2Var) {
        SnsMethodCalculate.markStartTimeMs("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.PicWidget");
        SnsMethodCalculate.markEndTimeMs("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.PicWidget");
    }

    /* renamed from: q */
    public final void mo133201q() {
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("openGallery", "com.tencent.mm.plugin.sns.ui.PicWidget");
        int c = this.f279329v - this.f279310c.mo133208c();
        if (c <= 0) {
            Log.m105920e("MicroMsg.PicWidget", "has select the max image count");
            SnsMethodCalculate.markEndTimeMs("openGallery", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return;
        }
        String string = this.f279311d.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getString("gallery", "1");
        C115669n.INSTANCE.mo160131h(13822, 2, 2, C102236a0.m134754l(), Long.valueOf(C31543z5.m39453c()));
        if (string.equalsIgnoreCase("0")) {
            C96892t1.m124463c(this.f279311d, 2, 1, 0, 1, false, (Intent) null);
        } else if (c < this.f279329v) {
            Intent intent = new Intent();
            intent.putExtra("key_can_select_video_and_pic", true);
            C96892t1.m124463c(this.f279311d, 9, c, 4, 1, SnsTimeLineUI.m122313w8(), intent);
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("key_edit_video_max_time_length", C102609h.Fx0().Gx0().f267170h);
            intent2.putExtra("key_can_select_video_and_pic", !(C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_enable_vlog, false)));
            if (((C58247e) C86312j.m106911c(C58247e.class)).ni0().mo72159a()) {
                intent2.putExtra("key_sns_publish_template", true);
                c = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_sns_publish_template_media_num, 20);
                Log.m105924i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + c);
            }
            intent2.putExtra("key_can_select_video_and_pic", false);
            C96892t1.m124463c(this.f279311d, 9, c, 4, 3, SnsTimeLineUI.m122313w8(), intent2);
        }
        mo133202r(2);
        SnsMethodCalculate.markEndTimeMs("openGallery", "com.tencent.mm.plugin.sns.ui.PicWidget");
    }

    /* renamed from: r */
    public final void mo133202r(int i) {
        SnsMethodCalculate.markStartTimeMs("rptPostImageInfo", "com.tencent.mm.plugin.sns.ui.PicWidget");
        SnsBeforePostImageInfoStruct snsBeforePostImageInfoStruct = new SnsBeforePostImageInfoStruct();
        long nowMilliSecond = Util.nowMilliSecond();
        snsBeforePostImageInfoStruct.f265951f = nowMilliSecond;
        snsBeforePostImageInfoStruct.mo86048e("ClickTimeStampMs", nowMilliSecond);
        snsBeforePostImageInfoStruct.f265949d = (long) i;
        snsBeforePostImageInfoStruct.f265950e = snsBeforePostImageInfoStruct.mo86045b("SessionId", this.f279320m, true);
        snsBeforePostImageInfoStruct.mo86054n();
        SnsMethodCalculate.markEndTimeMs("rptPostImageInfo", "com.tencent.mm.plugin.sns.ui.PicWidget");
    }

    /* renamed from: s */
    public boolean mo133203s() {
        SnsMethodCalculate.markStartTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.PicWidget");
        C86709a0.m107528h();
        if (!C86709a0.m107535s().mo121147n()) {
            C76912y0.m92771j(this.f279311d, (View) null);
            SnsMethodCalculate.markEndTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return false;
        } else if (this.f279310c.mo133208c() >= 9) {
            C76879j.m92738i(this.f279311d, C0966R.string.jjw, C0966R.string.a3h);
            SnsMethodCalculate.markEndTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return false;
        } else {
            if (SnsTimeLineUI.m122313w8()) {
                mo133201q();
            } else {
                SnsMethodCalculate.markStartTimeMs("showAddPicDialog", "com.tencent.mm.plugin.sns.ui.PicWidget");
                try {
                    C77407n nVar = new C77407n((Context) this.f279311d, 1, false);
                    nVar.f225771i = new d2$$a(this);
                    nVar.f225782p = new d2$$b(this);
                    nVar.mo107573q();
                } catch (Exception unused) {
                }
                SnsMethodCalculate.markEndTimeMs("showAddPicDialog", "com.tencent.mm.plugin.sns.ui.PicWidget");
            }
            SnsMethodCalculate.markEndTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return true;
        }
    }

    /* renamed from: t */
    public final boolean mo133204t(Bundle bundle) {
        Bundle bundle2 = bundle;
        SnsMethodCalculate.markStartTimeMs("tryGetLatLongListFromExtra", "com.tencent.mm.plugin.sns.ui.PicWidget");
        if (bundle2 == null) {
            SnsMethodCalculate.markEndTimeMs("tryGetLatLongListFromExtra", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return false;
        }
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("sns_media_latlong_list");
        if (stringArrayList == null) {
            SnsMethodCalculate.markEndTimeMs("tryGetLatLongListFromExtra", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return false;
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            String[] split = it.next().split("\n");
            if (3 != split.length) {
                Log.m105920e("MicroMsg.PicWidget", "invalid params");
                SnsMethodCalculate.markEndTimeMs("tryGetLatLongListFromExtra", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            }
            try {
                Map<String, Exif.C80833a> map = this.f279314g;
                String trim = split[0].trim();
                double d = Util.getDouble(split[1], 0.0d);
                Exif.C80833a aVar = r10;
                Exif.C80833a aVar2 = new Exif.C80833a(d, Util.getDouble(split[2], 0.0d), 0.0d);
                ((HashMap) map).put(trim, aVar);
            } catch (NumberFormatException e) {
                Log.m105920e("MicroMsg.PicWidget", e.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("tryGetLatLongListFromExtra", "com.tencent.mm.plugin.sns.ui.PicWidget");
        return true;
    }
}
