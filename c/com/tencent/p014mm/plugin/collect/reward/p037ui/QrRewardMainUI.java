package com.tencent.p014mm.plugin.collect.reward.p037ui;

import a63.C67008a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import com.tencent.xweb.util.WXWebReporter;
import de3.C75355a0;
import di3.C86312j;
import eb0.C75592q0;
import f21.C45737a;
import f21.C45740b;
import f21.C45745h;
import f40.C86709a0;
import g21.C75825a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kg3.C76577a;
import ob0.C117747y;
import ol0.C117804f0;
import p1081gi.C98124g;
import p159gw.C98250h;
import p196ln.C76705f;
import p629ny.C76979h;
import p663qo.C101213l;
import p910lj.C76701a;
import qo3.C77407n;
import te3.C51578up;
import te3.C77933g43;
import yq3.C79148e;
import z51.C79305f;

/* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI */
public class QrRewardMainUI extends QrRewardBaseUI {

    /* renamed from: I */
    public static final /* synthetic */ int f197698I = 0;

    /* renamed from: A */
    public String f197699A;

    /* renamed from: B */
    public String f197700B;

    /* renamed from: C */
    public String f197701C;

    /* renamed from: D */
    public int f197702D;

    /* renamed from: E */
    public int f197703E;

    /* renamed from: F */
    public boolean f197704F;

    /* renamed from: G */
    public boolean f197705G;

    /* renamed from: H */
    public String f197706H;

    /* renamed from: d */
    public final int f197707d = C76577a.m92151b(getContext(), 200);

    /* renamed from: e */
    public RelativeLayout f197708e;

    /* renamed from: f */
    public Button f197709f;

    /* renamed from: g */
    public ViewGroup f197710g;

    /* renamed from: h */
    public ViewGroup f197711h;

    /* renamed from: i */
    public RelativeLayout f197712i;

    /* renamed from: j */
    public CdnImageView f197713j;

    /* renamed from: n */
    public ImageView f197714n;

    /* renamed from: o */
    public ImageView f197715o;

    /* renamed from: p */
    public MMEditText f197716p;

    /* renamed from: q */
    public TextView f197717q;

    /* renamed from: r */
    public TextView f197718r;

    /* renamed from: s */
    public TextView f197719s;

    /* renamed from: t */
    public TextView f197720t;

    /* renamed from: u */
    public ScrollView f197721u;

    /* renamed from: v */
    public WcPayBannerView f197722v;

    /* renamed from: w */
    public C77933g43 f197723w;

    /* renamed from: x */
    public boolean f197724x = false;

    /* renamed from: y */
    public String f197725y;

    /* renamed from: z */
    public String f197726z;

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI$a */
    public class C68811a implements C45737a.C45739b {

        /* renamed from: a */
        public final /* synthetic */ C45745h f197727a;

        public C68811a(C45745h hVar) {
            this.f197727a = hVar;
        }

        /* renamed from: a */
        public void mo63897a(int i, int i2, String str, C117747y yVar) {
            Log.m105921e("MicroMsg.QrRewardMainUI", "set word error: %s, %s", Integer.valueOf(this.f197727a.f123607n.f145456d), this.f197727a.f123607n.f145457e);
            QrRewardMainUI.this.f197726z = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_WORD_STRING_SYNC, "");
            QrRewardMainUI qrRewardMainUI = QrRewardMainUI.this;
            qrRewardMainUI.mo94662N7(qrRewardMainUI.mo94657I7());
            QrRewardMainUI.this.f197716p.setText("");
            QrRewardMainUI.this.mo94661M7();
            if (!Util.isNullOrNil(this.f197727a.f123607n.f145457e)) {
                C76701a.makeText((Context) QrRewardMainUI.this, (CharSequence) this.f197727a.f123607n.f145457e, 0).show();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI$b */
    public class C68812b implements C45737a.C45739b {

        /* renamed from: a */
        public final /* synthetic */ C45745h f197729a;

        public C68812b(C45745h hVar) {
            this.f197729a = hVar;
        }

        /* renamed from: a */
        public void mo63897a(int i, int i2, String str, C117747y yVar) {
            Log.m105925i("MicroMsg.QrRewardMainUI", "set succ: %s, %s", this.f197729a.f123609p, QrRewardMainUI.this.f197716p.getText());
            if (this.f197729a.f123609p.equals(QrRewardMainUI.this.f197726z)) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_WORD_STRING_SYNC, QrRewardMainUI.this.f197726z);
                QrRewardMainUI.this.mo94661M7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI$c */
    public class C68813c implements C75825a.C75827b {

        /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI$c$a */
        public class C68814a implements Runnable {
            public C68814a() {
            }

            public void run() {
                QrRewardMainUI qrRewardMainUI = QrRewardMainUI.this;
                int i = QrRewardMainUI.f197698I;
                qrRewardMainUI.mo94664P7();
            }
        }

        public C68813c() {
        }

        /* renamed from: a */
        public void mo94665a(String str, int i, int i2) {
            Log.m105925i("MicroMsg.QrRewardMainUI", "callback ret: %s, %s, %s", str, Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 0 && i2 == 0) {
                MMHandlerThread.postToMainThread(new C68814a());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI$d */
    public class C68815d implements C72476y0.C72477a {
        public C68815d() {
        }

        /* renamed from: a */
        public void mo66525a(View view) {
            Log.m105919d("MicroMsg.QrRewardMainUI", "go to: %s", QrRewardMainUI.this.f197701C);
            C75228t.m90221N(QrRewardMainUI.this.getContext(), QrRewardMainUI.this.f197701C, false);
            C115669n.INSTANCE.mo160131h(14721, 1, 6);
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI$e */
    public class C68816e implements TextWatcher {

        /* renamed from: d */
        public int f197734d = 0;

        public C68816e(QrRewardMainUI qrRewardMainUI) {
        }

        public void afterTextChanged(Editable editable) {
            Class cls = C79305f.class;
            Log.m105919d("MicroMsg.QrRewardMainUI", "s: %s, %s", editable.toString(), Integer.valueOf(editable.length()));
            String obj = editable.toString();
            if (Util.isNullOrNil(obj)) {
                this.f197734d = 0;
            } else if (this.f197734d == 0) {
                if (((C79305f) C86312j.m106911c(cls)).mo109309L3(obj) || ((C79305f) C86312j.m106911c(cls)).mo109311R2(obj)) {
                    this.f197734d = editable.length();
                } else {
                    this.f197734d = 1;
                }
            }
            editable.delete(this.f197734d, editable.length());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI$f */
    public class C68817f implements TextView.OnEditorActionListener {
        public C68817f() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            Log.m105925i("MicroMsg.QrRewardMainUI", "action: %s", Integer.valueOf(i));
            QrRewardMainUI qrRewardMainUI = QrRewardMainUI.this;
            qrRewardMainUI.f197726z = qrRewardMainUI.f197716p.getText().toString();
            QrRewardMainUI.this.mo94659K7();
            if (Util.isNullOrNil(QrRewardMainUI.this.f197726z)) {
                QrRewardMainUI.this.mo94662N7(true);
            }
            QrRewardMainUI.this.hideVKB();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI$g */
    public class C68818g extends C7089c0 {
        public C68818g() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105918d("MicroMsg.QrRewardMainUI", "click avatar");
            QrRewardMainUI.this.hideVKB();
            QrRewardMainUI qrRewardMainUI = QrRewardMainUI.this;
            int i = QrRewardMainUI.f197698I;
            qrRewardMainUI.getClass();
            C77407n nVar = new C77407n((Context) qrRewardMainUI, 1, false);
            nVar.f225771i = new C68827b(qrRewardMainUI);
            nVar.f225782p = new C68828c(qrRewardMainUI);
            nVar.mo107573q();
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI$h */
    public class C68819h implements C72476y0.C72477a {

        /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI$h$a */
        public class C68820a implements Runnable {
            public C68820a() {
            }

            public void run() {
                QrRewardMainUI qrRewardMainUI = QrRewardMainUI.this;
                Class cls = C76979h.class;
                if (!qrRewardMainUI.f197704F) {
                    ScrollView scrollView = (ScrollView) ((ViewStub) qrRewardMainUI.findViewById(C0966R.C0970id.iak)).inflate();
                    qrRewardMainUI.f197721u = scrollView;
                    TextView textView = (TextView) scrollView.findViewById(C0966R.C0970id.iaq);
                    textView.setText(((C76979h) C86312j.m106911c(cls)).yp0(qrRewardMainUI, qrRewardMainUI.getString(C0966R.string.hpp, new Object[]{C75228t.m90277z(C75228t.m90268r(qrRewardMainUI.f197706H), 10)}), textView.getTextSize()));
                    qrRewardMainUI.f197704F = true;
                }
                ImageView imageView = (ImageView) qrRewardMainUI.f197721u.findViewById(C0966R.C0970id.ian);
                ViewGroup viewGroup = (ViewGroup) qrRewardMainUI.f197721u.findViewById(C0966R.C0970id.ib6);
                if (!Util.isNullOrNil(qrRewardMainUI.f197699A)) {
                    ((TextView) qrRewardMainUI.f197721u.findViewById(C0966R.C0970id.iap)).setText(((C76979h) C86312j.m106911c(cls)).yp0(qrRewardMainUI, qrRewardMainUI.getString(C0966R.string.f361153hq0, new Object[]{qrRewardMainUI.f197699A}), qrRewardMainUI.f197717q.getTextSize()));
                }
                qrRewardMainUI.f197721u.setVisibility(4);
                MMHandlerThread.postToMainThreadDelayed(new C2188d(qrRewardMainUI, viewGroup, imageView), 250);
                C115669n.INSTANCE.mo160131h(14721, 1, 5);
            }
        }

        /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI$h$b */
        public class C68821b implements Runnable {
            public C68821b() {
            }

            public void run() {
                C76701a.makeText((Context) QrRewardMainUI.this, (int) C0966R.string.iak, 1).show();
            }
        }

        public C68819h() {
        }

        /* renamed from: a */
        public void mo66525a(View view) {
            Log.m105924i("MicroMsg.QrRewardMainUI", "click save code");
            ((C98250h) C86312j.m106911c(C98250h.class)).mo137341Iy(QrRewardMainUI.this, new C68820a(), new C68821b());
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI$i */
    public class C68822i implements C72476y0.C72477a {
        public C68822i() {
        }

        /* renamed from: a */
        public void mo66525a(View view) {
            Log.m105925i("MicroMsg.QrRewardMainUI", "click set code, %s", Boolean.valueOf(QrRewardMainUI.this.f197705G));
            QrRewardMainUI.m81076H7(QrRewardMainUI.this, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI$j */
    public class C68823j implements C45737a.C45739b {

        /* renamed from: a */
        public final /* synthetic */ C45740b f197741a;

        /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI$j$a */
        public class C68824a implements DialogInterface.OnClickListener {
            public C68824a(C68823j jVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.QrRewardMainUI", "RealnameVerifyUtil cancel");
            }
        }

        public C68823j(C45740b bVar) {
            this.f197741a = bVar;
        }

        /* renamed from: a */
        public void mo63897a(int i, int i2, String str, C117747y yVar) {
            boolean z = true;
            Log.m105921e("MicroMsg.QrRewardMainUI", "get code error: %s, %s", Integer.valueOf(this.f197741a.f123593n.f142992d), this.f197741a.f123593n.f142993e);
            C51578up upVar = this.f197741a.f123593n;
            if (upVar.f142992d == 416) {
                Object[] objArr = new Object[1];
                if (upVar.f143006u != null) {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                Log.m105919d("MicroMsg.QrRewardMainUI", "realNameInfo:%s", objArr);
                QrRewardMainUI.this.f197708e.setVisibility(4);
                Bundle bundle = new Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".reward.ui.CollectMainUI");
                bundle.putString("realname_verify_process_jump_plugin", "collect");
                QrRewardMainUI qrRewardMainUI = QrRewardMainUI.this;
                C51578up upVar2 = this.f197741a.f123593n;
                C67008a.m79170e(qrRewardMainUI, upVar2.f142992d, upVar2.f143006u, bundle, true, new C68824a(this), (C79148e.C79149a) null, 1011, 2);
                return;
            }
            if (!Util.isNullOrNil(upVar.f142993e)) {
                C76701a.makeText((Context) QrRewardMainUI.this, (CharSequence) this.f197741a.f123593n.f142993e, 0).show();
            }
            if (!this.f197741a.f123595p) {
                QrRewardMainUI.m81076H7(QrRewardMainUI.this, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI$k */
    public class C68825k implements C45737a.C45739b {

        /* renamed from: a */
        public final /* synthetic */ C45740b f197743a;

        public C68825k(C45740b bVar) {
            this.f197743a = bVar;
        }

        /* renamed from: a */
        public void mo63897a(int i, int i2, String str, C117747y yVar) {
            QrRewardMainUI qrRewardMainUI = QrRewardMainUI.this;
            C51578up upVar = this.f197743a.f123593n;
            qrRewardMainUI.f197726z = upVar.f142997i;
            qrRewardMainUI.f197702D = upVar.f143005t;
            qrRewardMainUI.f197703E = upVar.f142998j;
            qrRewardMainUI.f197699A = upVar.f142999n;
            String str2 = upVar.f143000o;
            qrRewardMainUI.getClass();
            QrRewardMainUI qrRewardMainUI2 = QrRewardMainUI.this;
            C51578up upVar2 = this.f197743a.f123593n;
            qrRewardMainUI2.f197724x = !upVar2.f142994f;
            qrRewardMainUI2.f197700B = upVar2.f143003r;
            qrRewardMainUI2.f197701C = upVar2.f143002q;
            qrRewardMainUI2.f197723w = upVar2.f143007v;
            qrRewardMainUI2.f197705G = true;
            qrRewardMainUI2.mo94663O7();
            QrRewardMainUI qrRewardMainUI3 = QrRewardMainUI.this;
            qrRewardMainUI3.f197722v.setBannerData(qrRewardMainUI3.f197723w);
            QrRewardMainUI qrRewardMainUI4 = QrRewardMainUI.this;
            if (!qrRewardMainUI4.f197724x) {
                qrRewardMainUI4.getClass();
                Log.m105924i("MicroMsg.QrRewardMainUI", "show first guide view");
                qrRewardMainUI4.f197711h.setVisibility(8);
                qrRewardMainUI4.f197710g.setVisibility(0);
                qrRewardMainUI4.f197709f.setOnClickListener(new C68829e(qrRewardMainUI4));
            } else {
                C51578up upVar3 = this.f197743a.f123593n;
                qrRewardMainUI4.mo94658J7(upVar3.f142995g, upVar3.f142996h, false);
                QrRewardMainUI.this.mo94660L7();
                QrRewardMainUI.this.mo94661M7();
            }
            QrRewardMainUI qrRewardMainUI5 = QrRewardMainUI.this;
            qrRewardMainUI5.f197725y = this.f197743a.f123593n.f142995g;
            qrRewardMainUI5.getClass();
            Log.m105919d("MicroMsg.QrRewardMainUI", "url: %s", QrRewardMainUI.this.f197725y);
        }
    }

    /* renamed from: H7 */
    public static void m81076H7(QrRewardMainUI qrRewardMainUI, boolean z) {
        qrRewardMainUI.getClass();
        Log.m105924i("MicroMsg.QrRewardMainUI", "goto set money");
        Intent intent = new Intent(qrRewardMainUI.getContext(), QrRewardSetMoneyUI.class);
        intent.putExtra("key_first_flag", z);
        if (!Util.isNullOrNil(qrRewardMainUI.f197699A)) {
            intent.putExtra("key_desc_word", qrRewardMainUI.f197699A);
        }
        C77933g43 g432 = qrRewardMainUI.f197723w;
        if (g432 != null) {
            try {
                intent.putExtra("key_notice_item", Base64.encodeToString(g432.toByteArray(), 2));
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.QrRewardMainUI", e, "", new Object[0]);
            }
        }
        qrRewardMainUI.startActivityForResult(intent, 1);
    }

    /* renamed from: I7 */
    public final boolean mo94657I7() {
        return Util.isNullOrNil(this.f197726z);
    }

    /* renamed from: J7 */
    public final void mo94658J7(String str, String str2, boolean z) {
        String str3 = this.f197725y;
        boolean z2 = str3 != null && str3.equals(str);
        boolean d = C75825a.m91075c().mo106112d();
        Log.m105925i("MicroMsg.QrRewardMainUI", "do download photo: %s, same url: %s, pic exist: %s", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(d));
        if (z || !z2 || !d) {
            C75825a c = C75825a.m91075c();
            C68813c cVar = new C68813c();
            c.getClass();
            Log.m105925i("MicroMsg.QrRewardCdnDownloadHelper", "downloadImage. imageId:%s", str);
            Uri n = C116299g2.m163858n(C75825a.m91074b());
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0 f0Var = C116281f0.C116289i.f348994a;
            C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                if (l2.mo177810a()) {
                    l2.f348991a.mo119937g(l2.f348992b);
                }
            }
            C98124g gVar = new C98124g();
            gVar.f287660d = "task_QrRewardCdnDownloadHelper";
            gVar.f287661e = false;
            gVar.f287662f = c;
            gVar.field_fullpath = C75825a.m91074b() + c.mo106111a();
            gVar.field_mediaId = Util.nullAsNil(C1297x.m1387b("QrRewardImg", Util.nowMilliSecond(), C75592q0.m90777g().getUsername(), ""));
            gVar.field_fileId = str;
            gVar.field_aesKey = str2;
            gVar.field_fileType = 5;
            gVar.field_priority = 2;
            gVar.field_needStorage = false;
            gVar.field_isStreamMedia = false;
            gVar.field_appType = 0;
            gVar.field_bzScene = 0;
            if (c.f222436d == null) {
                c.f222436d = new HashMap();
            }
            ((HashMap) c.f222436d).put(gVar.field_mediaId, cVar);
            if (!((C101213l) C86312j.m106911c(C101213l.class)).xf0(gVar)) {
                Log.m105921e("MicroMsg.QrRewardCdnDownloadHelper", "ljd: cdntra addSendTask failed. imageId:%s", str);
            }
        }
    }

    /* renamed from: K7 */
    public final void mo94659K7() {
        Log.m105924i("MicroMsg.QrRewardMainUI", "do set photo word");
        C45745h hVar = new C45745h(this.f197726z);
        hVar.f123589g = new WeakReference<>(this);
        doSceneProgress(hVar, true);
    }

    /* renamed from: L7 */
    public final void mo94660L7() {
        int round = Math.round(((float) this.f197707d) * ((((float) this.f197703E) * 1.0f) / ((float) this.f197702D)));
        if (round <= 0) {
            round = WXWebReporter.KEY_TRY_FIX_DEX_FAILED;
        }
        ViewGroup.LayoutParams layoutParams = this.f197715o.getLayoutParams();
        layoutParams.width = round;
        layoutParams.height = round;
        this.f197715o.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f197714n.getLayoutParams();
        layoutParams2.width = round;
        layoutParams2.height = round;
        this.f197714n.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f197716p.getLayoutParams();
        int i = round - 30;
        layoutParams3.width = i;
        layoutParams3.height = i;
        this.f197716p.setLayoutParams(layoutParams3);
        this.f197716p.setTextSize(0, (float) ((round * 2) / 3));
        this.f197711h.requestLayout();
        if (!Util.isNullOrNil(this.f197699A)) {
            this.f197717q.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this, getString(C0966R.string.f361153hq0, new Object[]{this.f197699A}), this.f197717q.getTextSize()));
        } else {
            this.f197717q.setText("");
        }
        mo94662N7(mo94657I7());
    }

    /* renamed from: M7 */
    public final void mo94661M7() {
        if (!mo94657I7()) {
            this.f197716p.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), this.f197726z, this.f197716p.getTextSize()));
            this.f197716p.setSelection(this.f197726z.length());
        }
    }

    /* renamed from: N7 */
    public final void mo94662N7(boolean z) {
        Log.m105925i("MicroMsg.QrRewardMainUI", "switch mode: %s", Boolean.valueOf(z));
        if (z) {
            this.f197714n.setVisibility(0);
            this.f197716p.setVisibility(4);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106843mB(this.f197714n, this.f197706H, 0.03f);
            return;
        }
        this.f197714n.setVisibility(4);
        this.f197716p.setVisibility(0);
    }

    /* renamed from: O7 */
    public final void mo94663O7() {
        if (!Util.isNullOrNil(this.f197700B)) {
            this.f197719s.setClickable(true);
            this.f197719s.setOnTouchListener(new C75355a0(this));
            C72476y0 y0Var = new C72476y0(2, (C72476y0.C72477a) new C68815d());
            SpannableString spannableString = new SpannableString(this.f197700B);
            spannableString.setSpan(y0Var, 0, spannableString.length(), 18);
            this.f197719s.setText(spannableString);
            this.f197719s.setVisibility(0);
            return;
        }
        this.f197719s.setVisibility(8);
    }

    /* renamed from: P7 */
    public final void mo94664P7() {
        if (C75825a.m91075c().mo106112d()) {
            CdnImageView cdnImageView = this.f197713j;
            C75825a c = C75825a.m91075c();
            c.getClass();
            int i = this.f197707d;
            cdnImageView.mo100288c(C75825a.m91074b() + c.mo106111a(), i, i, -1);
            this.f197712i.setVisibility(0);
            return;
        }
        this.f197712i.setVisibility(4);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bp5;
    }

    public void initView() {
        this.f197708e = (RelativeLayout) findViewById(C0966R.C0970id.iwm);
        this.f197709f = (Button) findViewById(C0966R.C0970id.iah);
        this.f197710g = (ViewGroup) findViewById(C0966R.C0970id.iag);
        this.f197711h = (ViewGroup) findViewById(C0966R.C0970id.iaf);
        this.f197713j = (CdnImageView) findViewById(C0966R.C0970id.iaa);
        this.f197717q = (TextView) findViewById(C0966R.C0970id.iae);
        this.f197714n = (ImageView) findViewById(C0966R.C0970id.ia_);
        this.f197715o = (ImageView) findViewById(C0966R.C0970id.ia9);
        this.f197712i = (RelativeLayout) findViewById(C0966R.C0970id.iab);
        this.f197716p = (MMEditText) findViewById(C0966R.C0970id.iac);
        this.f197718r = (TextView) findViewById(C0966R.C0970id.iaj);
        this.f197720t = (TextView) findViewById(C0966R.C0970id.iam);
        this.f197719s = (TextView) findViewById(C0966R.C0970id.ia8);
        WcPayBannerView wcPayBannerView = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f197722v = wcPayBannerView;
        wcPayBannerView.mo105020a();
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106843mB(this.f197714n, this.f197706H, 0.03f);
        try {
            this.f197716p.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), this.f197726z, this.f197716p.getTextSize()));
            this.f197716p.setSelection(this.f197726z.length());
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.QrRewardMainUI", e, "", new Object[0]);
        }
        this.f197716p.addTextChangedListener(new C68816e(this));
        this.f197716p.setOnEditorActionListener(new C68817f());
        this.f197715o.setContentDescription(getString(C0966R.string.mi7));
        this.f197715o.setOnClickListener(new C68818g());
        this.f197718r.setClickable(true);
        this.f197718r.setOnTouchListener(new C75355a0(this));
        C72476y0 y0Var = new C72476y0(2, (C72476y0.C72477a) new C68819h());
        SpannableString spannableString = new SpannableString(getString(C0966R.string.hpo));
        spannableString.setSpan(y0Var, 0, spannableString.length(), 18);
        this.f197718r.setText(spannableString);
        this.f197720t.setClickable(true);
        this.f197720t.setOnTouchListener(new C75355a0(this));
        C72476y0 y0Var2 = new C72476y0(2, (C72476y0.C72477a) new C68822i());
        SpannableString spannableString2 = new SpannableString(getString(C0966R.string.hpy));
        spannableString2.setSpan(y0Var2, 0, spannableString2.length(), 18);
        this.f197720t.setText(spannableString2);
        mo94664P7();
        mo94660L7();
        mo94661M7();
        mo94663O7();
    }

    public boolean needExecuteBackListener() {
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.f197699A = intent.getStringExtra("key_desc");
            this.f197702D = intent.getIntExtra("key_photo_width", 900);
            this.f197703E = intent.getIntExtra("key_icon_width", C117804f0.CTRL_INDEX);
            boolean booleanExtra = intent.getBooleanExtra("key_return_from_first", true);
            Log.m105925i("MicroMsg.QrRewardMainUI", "return from first: %s", Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                this.f197711h.setVisibility(0);
                this.f197710g.setVisibility(8);
            }
            this.f197705G = true;
            mo94660L7();
            String stringExtra = intent.getStringExtra("key_photo_url");
            mo94658J7(stringExtra, intent.getStringExtra("key_photo_aeskey"), true);
            this.f197725y = stringExtra;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.screenBrightness < 0.85f) {
            attributes.screenBrightness = 0.85f;
            getWindow().setAttributes(attributes);
        }
        addSceneEndListener(1323);
        addSceneEndListener(1649);
        this.f197702D = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_PHOTO_WIDTH_INT_SYNC, 900)).intValue();
        this.f197703E = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_ICON_WIDTH_INT_SYNC, Integer.valueOf(C117804f0.CTRL_INDEX))).intValue();
        this.f197699A = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_DESC_STRING_SYNC, "");
        this.f197726z = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_WORD_STRING_SYNC, "");
        this.f197700B = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_BOTTOM_STR_STRING_SYNC, "");
        this.f197701C = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_BOTTOM_URL_STRING_SYNC, "");
        this.f197725y = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_LAST_PHOTO_URL_STRING_SYNC, "");
        if (!Util.isNullOrNil((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_AMT_LIST_STRING_SYNC, ""))) {
            this.f197705G = true;
        }
        this.f197706H = C75592q0.m90789s();
        setMMTitle((int) C0966R.string.hpj);
        initView();
        boolean z = C75825a.m91075c().mo106112d() && this.f197705G;
        Log.m105925i("MicroMsg.QrRewardMainUI", "do get code: %s", Boolean.valueOf(z));
        C45740b bVar = new C45740b(z);
        bVar.f123589g = new WeakReference<>(this);
        if (z) {
            doSceneProgress(bVar, false);
        } else {
            doSceneProgress(bVar, true);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1323);
        removeSceneEndListener(1649);
        C75825a c = C75825a.m91075c();
        c.getClass();
        Log.m105918d("MicroMsg.QrRewardCdnDownloadHelper", "do clear callback");
        Map<String, C75825a.C75827b> map = c.f222436d;
        if (map != null) {
            Log.m105925i("MicroMsg.QrRewardCdnDownloadHelper", "callback size: %s", Integer.valueOf(((HashMap) map).size()));
            ((HashMap) c.f222436d).clear();
        }
    }

    public void onKeyboardStateChanged() {
        super.onKeyboardStateChanged();
        Log.m105925i("MicroMsg.QrRewardMainUI", "key board changed: %s", Integer.valueOf(keyboardState()));
        if (keyboardState() == 2) {
            this.f197726z = this.f197716p.getText().toString();
            mo94659K7();
            if (Util.isNullOrNil(this.f197726z)) {
                mo94662N7(true);
            }
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C45740b) {
            C45740b bVar = (C45740b) yVar;
            bVar.mo71234m1(new C68825k(bVar));
            bVar.mo71233l1(new C68823j(bVar));
            if (bVar.f123590h) {
                Log.m105921e("MicroMsg.QrRewardMainUI", "net error: %s", bVar);
                if (!bVar.f123595p) {
                    m81076H7(this, false);
                }
            }
            return true;
        }
        if (yVar instanceof C45745h) {
            C45745h hVar = (C45745h) yVar;
            hVar.mo71234m1(new C68812b(hVar));
            hVar.mo71233l1(new C68811a(hVar));
            if (hVar.f123590h) {
                Log.m105921e("MicroMsg.QrRewardMainUI", "net error: %s", hVar);
                this.f197726z = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_QR_REWARD_WORD_STRING_SYNC, "");
                mo94662N7(mo94657I7());
                this.f197716p.setText("");
                mo94661M7();
            }
            this.f197716p.clearFocus();
            this.f197716p.setCursorVisible(false);
        }
        return true;
    }
}
