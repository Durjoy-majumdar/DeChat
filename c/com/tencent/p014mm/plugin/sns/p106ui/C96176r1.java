package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C54026q;
import ad0.C91998s;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicVipInfo;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.plugin.comm.C55593g;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import ht1.C98521u5;
import j20.C117292a;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p823sg.C90193h;
import qc0.C101093a;
import te3.C64719t23;

/* renamed from: com.tencent.mm.plugin.sns.ui.r1 */
public class C96176r1 extends C96157q {

    /* renamed from: c */
    public MMActivity f280968c;

    /* renamed from: d */
    public WXMediaMessage f280969d = null;

    /* renamed from: e */
    public View f280970e;

    /* renamed from: f */
    public TextView f280971f;

    /* renamed from: g */
    public TextView f280972g;

    /* renamed from: h */
    public C54026q f280973h;

    /* renamed from: i */
    public String f280974i;

    /* renamed from: j */
    public String f280975j;

    /* renamed from: k */
    public String f280976k = "";

    /* renamed from: l */
    public String f280977l = "";

    /* renamed from: m */
    public boolean f280978m = false;

    /* renamed from: n */
    public boolean f280979n = false;

    /* renamed from: o */
    public C91998s f280980o = null;

    /* renamed from: p */
    public int f280981p;

    /* renamed from: q */
    public int f280982q = 1;

    /* renamed from: r */
    public String f280983r = "";

    /* renamed from: s */
    public Bitmap f280984s;

    public C96176r1(MMActivity mMActivity) {
        this.f280968c = mMActivity;
    }

    /* renamed from: a */
    public View mo132124a() {
        C64719t23 t232;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.MusicMvWidget");
        View inflate = C85868k2.m106137b(this.f280968c).inflate(C0966R.C0971layout.cb4, (ViewGroup) null);
        this.f280970e = inflate;
        ((RoundCornerRelativeLayout) inflate.findViewById(C0966R.C0970id.iwu)).setRadius((float) C76577a.m92151b(this.f280968c, 4));
        View findViewById = this.f280970e.findViewById(C0966R.C0970id.aft);
        LinearLayout linearLayout = (LinearLayout) this.f280970e.findViewById(C0966R.C0970id.h5u);
        if (C85875k4.m106211z()) {
            linearLayout.setBackgroundResource(C0966R.C0969drawable.atm);
        } else {
            linearLayout.setBackgroundResource(C0966R.C0969drawable.atn);
        }
        MMRoundCornerImageView mMRoundCornerImageView = (MMRoundCornerImageView) this.f280970e.findViewById(C0966R.C0970id.b7t);
        this.f280971f = (TextView) this.f280970e.findViewById(C0966R.C0970id.b7x);
        TextView textView = (TextView) this.f280970e.findViewById(C0966R.C0970id.b7y);
        this.f280972g = (TextView) this.f280970e.findViewById(C0966R.C0970id.b7v);
        byte[] bArr = this.f280969d.thumbData;
        if (bArr != null) {
            this.f280984s = BitmapUtil.decodeByteArray(bArr);
        }
        mMRoundCornerImageView.setImageBitmap(this.f280984s);
        textView.setText(this.f280969d.title);
        if (!Util.isNullOrNil(this.f280969d.description)) {
            this.f280971f.setVisibility(0);
            this.f280971f.setText(this.f280969d.description);
        } else {
            this.f280971f.setText("");
            this.f280971f.setVisibility(0);
        }
        C54026q qVar = this.f280973h;
        if (qVar == null || (t232 = qVar.f151295a) == null || Util.isNullOrNil(t232.f185462g)) {
            this.f280972g.setText("");
            this.f280972g.setVisibility(8);
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = C76577a.m92151b(MMApplicationContext.getContext(), 6);
            ((ViewGroup.MarginLayoutParams) this.f280971f.getLayoutParams()).topMargin = C76577a.m92151b(MMApplicationContext.getContext(), 2);
            View findViewById2 = this.f280970e.findViewById(C0966R.C0970id.hqn);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById2;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/MusicMvWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/MusicMvWidget", "initView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView2 = this.f280972g;
            textView2.setText(this.f280973h.f151295a.f185462g + this.f280968c.getString(C0966R.string.h2w));
            this.f280972g.setVisibility(0);
        }
        Bitmap bitmap = this.f280984s;
        if (bitmap != null && !bitmap.isRecycled()) {
            C55593g.f158270a.mo77114b(this.f280968c, findViewById, this.f280984s, C90193h.m112878f(this.f280969d.thumbData));
        }
        View view2 = this.f280970e;
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.MusicMvWidget");
        return view2;
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.MusicMvWidget");
        SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.MusicMvWidget");
        return true;
    }

    /* renamed from: d */
    public void mo132126d(Bundle bundle) {
        Map<String, String> parseXml;
        SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MusicMvWidget");
        this.f280969d = new SendMessageToWX.Req(this.f280968c.getIntent().getBundleExtra("Ksnsupload_timeline")).message;
        String stringExtra = this.f280968c.getIntent().getStringExtra("Ksnsupload_music_share_object_xml");
        if (!Util.isNullOrNil(stringExtra) && (parseXml = XmlParser.parseXml(stringExtra, "musicShareItem", (String) null)) != null) {
            C54026q qVar = new C54026q();
            this.f280973h = qVar;
            qVar.f151295a = C98521u5.m127974b("", parseXml);
        }
        if (this.f280973h == null) {
            this.f280973h = new C54026q();
        }
        if (this.f280969d.getType() == 76) {
            this.f280974i = this.f280968c.getIntent().getStringExtra("music_mv_cover_url");
            WXMediaMessage wXMediaMessage = this.f280969d;
            WXMusicVideoObject wXMusicVideoObject = (WXMusicVideoObject) wXMediaMessage.mediaObject;
            if (wXMusicVideoObject != null) {
                this.f280975j = wXMusicVideoObject.songLyric;
                C64719t23 t232 = this.f280973h.f151295a;
                t232.f185463h = wXMusicVideoObject.singerName;
                t232.f185464i = wXMusicVideoObject.albumName;
                t232.f185466n = wXMusicVideoObject.musicGenre;
                t232.f185467o = wXMusicVideoObject.issueDate;
                t232.f185468p = wXMusicVideoObject.identification;
                t232.f185469q = wXMusicVideoObject.duration;
                t232.f185465j = wXMediaMessage.messageExt;
                t232.f185471s = wXMusicVideoObject.musicOperationUrl;
                WXMusicVipInfo wXMusicVipInfo = wXMusicVideoObject.musicVipInfo;
                t232.f185470r = wXMusicVipInfo != null ? C101093a.m132484f(wXMusicVipInfo.musicId) : "";
            }
        } else if (this.f280969d.getType() == 3) {
            WXMediaMessage wXMediaMessage2 = this.f280969d;
            WXMusicObject wXMusicObject = (WXMusicObject) wXMediaMessage2.mediaObject;
            if (wXMusicObject != null) {
                this.f280975j = wXMusicObject.songLyric;
                this.f280974i = wXMusicObject.songAlbumUrl;
                this.f280973h.f151295a.f185465j = wXMediaMessage2.messageExt;
            }
        }
        this.f280980o = C91998s.m115551f(this.f280968c.getIntent());
        this.f280976k = Util.nullAs(this.f280968c.getIntent().getStringExtra("Ksnsupload_appid"), "");
        this.f280977l = Util.nullAs(this.f280968c.getIntent().getStringExtra("Ksnsupload_appname"), "");
        this.f280978m = this.f280968c.getIntent().getBooleanExtra("KThrid_app", false);
        this.f280979n = this.f280968c.getIntent().getBooleanExtra("KSnsAction", false);
        this.f280981p = this.f280968c.getIntent().getIntExtra("Ksnsupload_source", 0);
        if (this.f280968c.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f280982q = 1;
        } else {
            this.f280982q = 0;
        }
        this.f280983r = Util.nullAs(this.f280968c.getIntent().getStringExtra("SendAppMessageWrapper_PkgName"), "");
        SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.MusicMvWidget");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0196  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo132127e(int r22, int r23, g34.C116918i r24, java.lang.String r25, java.util.List<java.lang.String> r26, te3.C101802kr2 r27, java.util.LinkedList<java.lang.Long> r28, int r29, boolean r30, java.util.List<java.lang.String> r31, com.tencent.p014mm.pointers.PInt r32, java.lang.String r33, int r34, int r35) {
        /*
            r21 = this;
            r0 = r21
            r1 = r24
            java.lang.String r2 = "commit"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.MusicMvWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.model.p2 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.gy0()
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r5 = r0.f280969d
            java.lang.String r6 = r0.f280976k
            java.lang.String r7 = r0.f280977l
            java.lang.String r15 = r0.f280974i
            java.lang.String r14 = r0.f280975j
            r4.getClass()
            java.lang.String r13 = "shareMvImp"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.model.UploadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r12)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "appmsg.description "
            r8.append(r9)
            java.lang.String r9 = r5.description
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MicroMsg.UploadManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "appmsg.title "
            r8.append(r10)
            java.lang.String r10 = r5.title
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r8)
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r8 = r5.mediaObject
            com.tencent.mm.plugin.sns.model.s2 r11 = new com.tencent.mm.plugin.sns.model.s2
            r10 = 42
            r1 = 0
            r11.<init>(r10, r1)
            java.lang.String r10 = ""
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r10)
            r11.mo131231E(r6)
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r10)
            r11.mo131230D(r6)
            r6 = 5
            r11.mo131234H(r6)
            java.lang.String r7 = "TimeLineType 42"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r25)
            if (r7 != 0) goto L_0x0080
            r7 = r25
            r11.mo131260q(r7)
        L_0x0080:
            java.lang.String r7 = r5.title
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r10)
            r11.mo131267x(r7)
            java.lang.String r7 = r5.description
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r10)
            r11.mo131266w(r7)
            boolean r7 = r8 instanceof com.tencent.p014mm.opensdk.modelmsg.WXMusicObject
            if (r7 == 0) goto L_0x00d2
            r7 = r8
            com.tencent.mm.opensdk.modelmsg.WXMusicObject r7 = (com.tencent.p014mm.opensdk.modelmsg.WXMusicObject) r7
            java.lang.String r6 = r7.musicUrl
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x00a4
            java.lang.String r6 = r7.musicUrl
            goto L_0x00a6
        L_0x00a4:
            java.lang.String r6 = r7.musicLowBandUrl
        L_0x00a6:
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r10)
            java.lang.String r1 = r7.musicDataUrl
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x00b5
            java.lang.String r1 = r7.musicDataUrl
            goto L_0x00b7
        L_0x00b5:
            java.lang.String r1 = r7.musicUrl
        L_0x00b7:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r10)
            r16 = r1
            java.lang.String r1 = r7.musicLowBandDataUrl
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x00c8
            java.lang.String r1 = r7.musicLowBandDataUrl
            goto L_0x00ca
        L_0x00c8:
            java.lang.String r1 = r7.musicLowBandUrl
        L_0x00ca:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r10)
            r7 = r10
            r18 = r16
            goto L_0x012d
        L_0x00d2:
            boolean r1 = r8 instanceof com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject
            if (r1 == 0) goto L_0x0128
            r1 = r8
            com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject r1 = (com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject) r1
            java.lang.String r6 = r1.musicUrl
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r10)
            java.lang.String r7 = r1.musicDataUrl
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x00ea
            java.lang.String r7 = r1.musicDataUrl
            goto L_0x00ec
        L_0x00ea:
            java.lang.String r7 = r1.musicUrl
        L_0x00ec:
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r10)
            r16 = r6
            com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo r6 = r1.musicVipInfo
            if (r6 == 0) goto L_0x0101
            java.lang.String r6 = r6.musicId
            java.lang.String r6 = qc0.C101093a.m132484f(r6)
            r17 = r6
            r18 = r7
            goto L_0x0105
        L_0x0101:
            r18 = r7
            r17 = r10
        L_0x0105:
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r6 = r1.singerName
            r19 = 0
            r7[r19] = r6
            com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo r1 = r1.musicVipInfo
            if (r1 == 0) goto L_0x0114
            r1 = 1
            goto L_0x0115
        L_0x0114:
            r1 = 0
        L_0x0115:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r6 = 1
            r7[r6] = r1
            java.lang.String r1 = "share music mv to sns, singerName:%s, musicVipInfo is valid:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r7)
            r1 = r10
            r6 = r16
            r7 = r17
            goto L_0x012d
        L_0x0128:
            r1 = r10
            r6 = r1
            r7 = r6
            r18 = r7
        L_0x012d:
            r11.mo131267x(r10)
            r11.mo131266w(r10)
            int r8 = r8.type()
            int r4 = r4.mo131193d(r8)
            r8 = -1
            if (r4 != r8) goto L_0x0149
            java.lang.String r1 = "mediaType is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
        L_0x0147:
            r11 = 0
            goto L_0x017b
        L_0x0149:
            byte[] r9 = r5.thumbData
            java.lang.String r8 = r5.title
            java.lang.String r16 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r8, (java.lang.String) r10)
            java.lang.String r5 = r5.description
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r10)
            r8 = r11
            r10 = r6
            r6 = r11
            r11 = r1
            r1 = r12
            r12 = r18
            r20 = r6
            r6 = r13
            r13 = r4
            r4 = r14
            r14 = r16
            r16 = r15
            r15 = r5
            r17 = r4
            r18 = r7
            boolean r4 = r8.mo131249f(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r4 != 0) goto L_0x0176
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
            goto L_0x0147
        L_0x0176:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
            r11 = r20
        L_0x017b:
            if (r11 != 0) goto L_0x0196
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r0.f280976k
            r5 = 0
            r1[r5] = r4
            java.lang.String r4 = r0.f280977l
            r6 = 1
            r1[r6] = r4
            java.lang.String r4 = "MicroMsg.MusicMvWidget"
            java.lang.String r6 = "packHelper == null, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r6, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r5
        L_0x0196:
            ad0.q r1 = r0.f280973h
            if (r1 == 0) goto L_0x01af
            java.lang.String r4 = "setMusicMvFinderObject"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.UploadPackHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            if (r1 == 0) goto L_0x01ac
            com.tencent.mm.protocal.protobuf.TimeLineObject r6 = r11.f275199f
            te3.j00 r6 = r6.ContentObj
            te3.t23 r1 = r1.f151295a
            r6.f298439w = r1
        L_0x01ac:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
        L_0x01af:
            int r1 = r11.mo131253j()
            r4 = r32
            r4.value = r1
            int r1 = kr2.C76634a.f224255a
            r4 = r29
            if (r4 <= r1) goto L_0x01c2
            r1 = 4
            r4 = 1
            r11.mo131261r(r4, r1)
        L_0x01c2:
            int r1 = r0.f280981p
            r11.mo131234H(r1)
            boolean r1 = r0.f280978m
            if (r1 == 0) goto L_0x01cf
            r1 = 5
            r11.mo131234H(r1)
        L_0x01cf:
            r1 = r28
            r11.mo131262s(r1)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            if (r26 == 0) goto L_0x020f
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.lang.Class<gw.g> r4 = p159gw.C8462g.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            gw.g r4 = (p159gw.C8462g) r4
            java.util.List r4 = r4.mo9266gt()
            java.util.Iterator r5 = r26.iterator()
        L_0x01f0:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x020f
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            if (r4 == 0) goto L_0x01f0
            boolean r7 = r4.contains(r6)
            if (r7 != 0) goto L_0x01f0
            te3.f94 r7 = new te3.f94
            r7.<init>()
            r7.f298255d = r6
            r1.add(r7)
            goto L_0x01f0
        L_0x020f:
            r11.mo131243Q(r1)
            r1 = r24
            if (r1 == 0) goto L_0x021d
            java.lang.String r4 = r1.f350347d
            java.lang.String r1 = r1.f350348e
            r11.mo131241O(r4, r1)
        L_0x021d:
            r1 = r27
            r11.mo131265v(r1)
            if (r30 == 0) goto L_0x0229
            r1 = 1
            r11.mo131264u(r1)
            goto L_0x022d
        L_0x0229:
            r1 = 0
            r11.mo131264u(r1)
        L_0x022d:
            r1 = r31
            r11.mo131263t(r1)
            r1 = r22
            r11.mo131228B(r1)
            r1 = 0
            r4 = 0
            r5 = 0
            r26 = r11
            r27 = r1
            r28 = r4
            r29 = r5
            r30 = r34
            r31 = r35
            r26.mo131235I(r27, r28, r29, r30, r31)
            int r1 = r0.f280982q
            java.lang.String r4 = r0.f280983r
            r11.mo131269z(r1, r4)
            boolean r1 = r0.f280979n
            if (r1 == 0) goto L_0x0268
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r1 = r0.f280969d
            if (r1 == 0) goto L_0x0268
            java.lang.String r1 = r1.mediaTagName
            r11.mo131238L(r1)
            java.lang.String r1 = r0.f280976k
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r4 = r0.f280969d
            java.lang.String r5 = r4.messageExt
            java.lang.String r4 = r4.messageAction
            r11.mo131240N(r1, r5, r4)
        L_0x0268:
            r0.mo133779j(r11)
            int r1 = r11.mo131252i()
            ad0.s r4 = r0.f280980o
            if (r4 == 0) goto L_0x027d
            r4.mo125840a(r1)
            com.tencent.mm.plugin.sns.statistics.a0 r1 = com.tencent.p014mm.plugin.sns.statistics.C95006y.f275639b
            ad0.s r4 = r0.f280980o
            r1.mo131398c(r4)
        L_0x027d:
            com.tencent.mm.plugin.sns.model.p2 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.gy0()
            r1.mo131192c()
            com.tencent.mm.ui.MMActivity r1 = r0.f280968c
            r1.finish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96176r1.mo132127e(int, int, g34.i, java.lang.String, java.util.List, te3.kr2, java.util.LinkedList, int, boolean, java.util.List, com.tencent.mm.pointers.PInt, java.lang.String, int, int):boolean");
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MusicMvWidget");
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.MusicMvWidget");
        return true;
    }

    /* renamed from: g */
    public boolean mo132129g() {
        SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MusicMvWidget");
        Bitmap bitmap = this.f280984s;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f280984s.recycle();
        }
        SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.MusicMvWidget");
        return false;
    }

    /* renamed from: h */
    public boolean mo132130h() {
        SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.MusicMvWidget");
        SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.MusicMvWidget");
        return true;
    }

    /* renamed from: i */
    public void mo132131i(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MusicMvWidget");
        SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.MusicMvWidget");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.MusicMvWidget");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.MusicMvWidget");
        return false;
    }
}
