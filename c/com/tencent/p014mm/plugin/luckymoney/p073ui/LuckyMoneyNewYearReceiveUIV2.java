package com.tencent.p014mm.plugin.luckymoney.p073ui;

import a63.C67008a;
import android.content.DialogInterface;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.huawei.easygo.sdk.constant.EasyGoCode;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WxPayLuckMoneyNewYearDownloadPAGResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.LuckyMoneyNewYearReportStruct;
import com.tencent.p014mm.emoji.view.BaseEmojiView;
import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69209e1;
import com.tencent.p014mm.plugin.luckymoney.model.C69210e2;
import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.p014mm.plugin.luckymoney.model.C69237j2;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.wallet_core.utils.C72506r;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lg3.C88494d;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import org.libpag.PAGView;
import p008bq.C39833l0;
import p008bq.C67303a1;
import p008bq.C67305d1;
import p196ln.C76705f;
import p375qh.C22086d;
import p492dn.C75415t;
import p773yy.C79168k;
import qo3.C89779i0;
import qy2.C63347a;
import vo3.C90852c;
import yq3.C79148e;
import zt3.C119157j;
import zt3.C119179t;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 */
public class LuckyMoneyNewYearReceiveUIV2 extends LuckyMoneyBaseUI {

    /* renamed from: p1 */
    public static final /* synthetic */ int f200103p1 = 0;

    /* renamed from: A */
    public C89779i0 f200104A = null;

    /* renamed from: B */
    public ImageView f200105B;

    /* renamed from: C */
    public ImageView f200106C;

    /* renamed from: D */
    public View f200107D;

    /* renamed from: E */
    public ImageView f200108E;

    /* renamed from: F */
    public View f200109F;

    /* renamed from: G */
    public BaseEmojiView f200110G;

    /* renamed from: H */
    public int f200111H = 0;

    /* renamed from: I */
    public String f200112I;

    /* renamed from: J */
    public String f200113J = "";

    /* renamed from: K */
    public C72963f4 f200114K;

    /* renamed from: L */
    public int f200115L;

    /* renamed from: M */
    public boolean f200116M;

    /* renamed from: N */
    public IEmojiInfo f200117N;

    /* renamed from: P */
    public String f200118P;

    /* renamed from: Q */
    public View f200119Q;

    /* renamed from: Q0 */
    public TextView f200120Q0;

    /* renamed from: R */
    public PAGView f200121R;

    /* renamed from: R0 */
    public boolean f200122R0;

    /* renamed from: S */
    public PAGView.PAGViewListener f200123S;

    /* renamed from: S0 */
    public boolean f200124S0;

    /* renamed from: T */
    public PAGView.PAGViewListener f200125T;

    /* renamed from: T0 */
    public C22086d f200126T0;

    /* renamed from: U */
    public C69209e1 f200127U;

    /* renamed from: U0 */
    public String f200128U0;

    /* renamed from: V */
    public PAGView f200129V;

    /* renamed from: V0 */
    public String f200130V0;

    /* renamed from: W */
    public PAGView.PAGViewListener f200131W;

    /* renamed from: W0 */
    public String f200132W0;

    /* renamed from: X */
    public PAGView.PAGViewListener f200133X;

    /* renamed from: X0 */
    public long f200134X0;

    /* renamed from: Y */
    public View f200135Y;

    /* renamed from: Y0 */
    public boolean f200136Y0;

    /* renamed from: Z */
    public View f200137Z;

    /* renamed from: Z0 */
    public long f200138Z0;

    /* renamed from: a1 */
    public String f200139a1;

    /* renamed from: b1 */
    public int f200140b1;

    /* renamed from: c1 */
    public int f200141c1;

    /* renamed from: d1 */
    public int f200142d1;

    /* renamed from: e1 */
    public boolean f200143e1;

    /* renamed from: f1 */
    public View f200144f1;

    /* renamed from: g */
    public String f200145g;

    /* renamed from: g1 */
    public boolean f200146g1;

    /* renamed from: h */
    public View f200147h;

    /* renamed from: h1 */
    public boolean f200148h1;

    /* renamed from: i */
    public View f200149i;

    /* renamed from: i1 */
    public C69237j2 f200150i1;

    /* renamed from: j */
    public LuckyMoneyAutoScrollView f200151j;

    /* renamed from: j1 */
    public final IListener f200152j1;

    /* renamed from: k1 */
    public C39833l0.C39834a f200153k1;

    /* renamed from: l1 */
    public C22086d.C22087a f200154l1;

    /* renamed from: m1 */
    public C22086d.C22088b f200155m1;

    /* renamed from: n */
    public TextView f200156n;

    /* renamed from: n1 */
    public C55384i f200157n1;

    /* renamed from: o */
    public TextView f200158o;

    /* renamed from: o1 */
    public View.OnClickListener f200159o1;

    /* renamed from: p */
    public ImageView f200160p;

    /* renamed from: p0 */
    public TextView f200161p0;

    /* renamed from: q */
    public TextView f200162q;

    /* renamed from: r */
    public LinearLayout f200163r;

    /* renamed from: s */
    public TextView f200164s;

    /* renamed from: t */
    public ImageView f200165t;

    /* renamed from: u */
    public LinearLayout f200166u;

    /* renamed from: v */
    public LinearLayout f200167v;

    /* renamed from: w */
    public MMAnimateView f200168w;

    /* renamed from: x */
    public TextView f200169x;

    /* renamed from: x0 */
    public CdnImageView f200170x0;

    /* renamed from: y */
    public LinearLayout f200171y;

    /* renamed from: y0 */
    public ImageView f200172y0;

    /* renamed from: z */
    public TextView f200173z;

    public LuckyMoneyNewYearReceiveUIV2() {
        new MMHandler();
        this.f200116M = false;
        this.f200127U = new C69209e1();
        this.f200122R0 = false;
        this.f200124S0 = false;
        this.f200128U0 = "";
        this.f200130V0 = "";
        this.f200132W0 = "";
        this.f200136Y0 = true;
        this.f200139a1 = "";
        this.f200140b1 = 2;
        this.f200141c1 = 2;
        this.f200142d1 = 1;
        this.f200143e1 = false;
        this.f200146g1 = false;
        this.f200148h1 = false;
        this.f200152j1 = new IListener<WxPayLuckMoneyNewYearDownloadPAGResultEvent>(C40008f.f107254d) {
            {
                this.__eventId = -261846412;
            }

            public boolean callback(IEvent iEvent) {
                WxPayLuckMoneyNewYearDownloadPAGResultEvent wxPayLuckMoneyNewYearDownloadPAGResultEvent = (WxPayLuckMoneyNewYearDownloadPAGResultEvent) iEvent;
                Log.m105925i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "downloadPAGResultIListener downloadret：%s unfoldret:%s", Boolean.valueOf(wxPayLuckMoneyNewYearDownloadPAGResultEvent.f194107d.f194108a), Boolean.valueOf(wxPayLuckMoneyNewYearDownloadPAGResultEvent.f194107d.f194109b));
                WxPayLuckMoneyNewYearDownloadPAGResultEvent.C67833a aVar = wxPayLuckMoneyNewYearDownloadPAGResultEvent.f194107d;
                if (aVar.f194108a) {
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "downloadPAGResult succ");
                } else if (!aVar.f194109b || !C69218g1.m81554a()) {
                    LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = LuckyMoneyNewYearReceiveUIV2.this;
                    int i = LuckyMoneyNewYearReceiveUIV2.f200103p1;
                    luckyMoneyNewYearReceiveUIV2.mo95627O7(0);
                } else {
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "zipPAGResult succ");
                    LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV22 = LuckyMoneyNewYearReceiveUIV2.this;
                    int i2 = LuckyMoneyNewYearReceiveUIV2.f200103p1;
                    luckyMoneyNewYearReceiveUIV22.mo95627O7(1);
                    LuckyMoneyNewYearReceiveUIV2.this.mo95632T7(IXWebBroadcastListener.STAGE_START);
                    LuckyMoneyNewYearReceiveUIV2.this.f200152j1.dead();
                }
                return true;
            }
        };
        this.f200153k1 = new LuckyMoneyNewYearReceiveUIV2$$g(this);
        this.f200154l1 = new LuckyMoneyNewYearReceiveUIV2$$k(this);
        this.f200155m1 = new LuckyMoneyNewYearReceiveUIV2$$l(this);
        this.f200157n1 = new LuckyMoneyNewYearReceiveUIV2$$a(this);
        this.f200159o1 = new LuckyMoneyNewYearReceiveUIV2$$m(this);
    }

    /* renamed from: J7 */
    public static void m81812J7(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        luckyMoneyNewYearReceiveUIV2.getClass();
        C22086d DA = ((C75415t) C86312j.m106911c(C75415t.class)).mo91606DA(luckyMoneyNewYearReceiveUIV2);
        luckyMoneyNewYearReceiveUIV2.f200126T0 = DA;
        DA.mo33328d(luckyMoneyNewYearReceiveUIV2.f200154l1);
        luckyMoneyNewYearReceiveUIV2.f200126T0.mo33334i(luckyMoneyNewYearReceiveUIV2.f200155m1);
    }

    /* renamed from: K7 */
    public static void m81813K7(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        Class cls = C39833l0.class;
        luckyMoneyNewYearReceiveUIV2.f200169x.setVisibility(8);
        IEmojiInfo r2 = ((C67303a1) C86312j.m106911c(C67303a1.class)).mo55768r2(luckyMoneyNewYearReceiveUIV2.f200113J);
        luckyMoneyNewYearReceiveUIV2.f200117N = r2;
        if (r2 == null) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "showExpression() mEmojiInfo == null ");
        } else if (C86013q1.m106451l(r2.mo62640K1()) > 0 || luckyMoneyNewYearReceiveUIV2.f200117N.mo62678k() || luckyMoneyNewYearReceiveUIV2.f200117N.mo62637I0()) {
            luckyMoneyNewYearReceiveUIV2.f200110G.setVisibility(0);
            if (((C67305d1) C86312j.m106911c(C67305d1.class)).mo91430hJ(luckyMoneyNewYearReceiveUIV2.f200117N)) {
                luckyMoneyNewYearReceiveUIV2.f200110G.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else if (luckyMoneyNewYearReceiveUIV2.f200117N.mo62678k()) {
                luckyMoneyNewYearReceiveUIV2.f200110G.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            } else {
                luckyMoneyNewYearReceiveUIV2.f200110G.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            luckyMoneyNewYearReceiveUIV2.f200110G.setEmojiInfo(luckyMoneyNewYearReceiveUIV2.f200117N);
        } else {
            luckyMoneyNewYearReceiveUIV2.f200110G.setVisibility(8);
            luckyMoneyNewYearReceiveUIV2.f200167v.setVisibility(0);
            luckyMoneyNewYearReceiveUIV2.f200168w.setImageResource(C0966R.raw.lucky_money_newyear_creat_loading);
            ((C39833l0) C86312j.m106911c(cls)).mo62465NG(luckyMoneyNewYearReceiveUIV2.f200153k1);
            ((C39833l0) C86312j.m106911c(cls)).mo62467VJ(luckyMoneyNewYearReceiveUIV2.f200117N);
        }
    }

    /* renamed from: L7 */
    public final void mo95624L7(int i) {
        StringBuilder sb;
        Log.m105925i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "dealMessageInfo() localReceiveStatus:%s newStatus:%s", Integer.valueOf(this.f200115L), Integer.valueOf(i));
        if (i == 0) {
            this.f200140b1 = 2;
        } else if (i == 1) {
            this.f200140b1 = 4;
        } else if (i == 2) {
            this.f200140b1 = 3;
        }
        if (this.f200114K == null) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "dealMessageInfo() mEmojiInfo == null");
        } else if (!Util.isEqual(this.f200115L, i) && !Util.isEqual(this.f200115L, 2)) {
            try {
                StringBuilder sb4 = new StringBuilder(this.f200114K.getContent());
                StringBuilder sb5 = new StringBuilder();
                int indexOf = sb4.indexOf("<localreceivestatus>");
                if (indexOf <= 0 || indexOf >= sb4.length()) {
                    int indexOf2 = sb4.indexOf("<emoji>");
                    if (indexOf2 <= 0 || indexOf2 >= sb4.length()) {
                        int indexOf3 = sb4.indexOf("<wcpayinfo>");
                        sb5.append("<emoji><localreceivestatus>");
                        sb5.append(i);
                        sb5.append("</localreceivestatus></emoji>");
                        StringBuilder sb6 = new StringBuilder(sb4.substring(0, indexOf3));
                        String trim = sb4.substring(indexOf3).trim();
                        sb6.append(sb5);
                        sb6.append(trim);
                        sb = sb6;
                    } else {
                        sb5.append("<localreceivestatus>");
                        sb5.append(i);
                        sb5.append("</localreceivestatus>");
                        int i2 = indexOf2 + 7;
                        sb = new StringBuilder(sb4.substring(0, i2));
                        String trim2 = sb4.substring(i2).trim();
                        sb.append(sb5);
                        sb.append(trim2);
                    }
                } else {
                    sb = new StringBuilder(sb4.substring(0, indexOf + 20));
                    String substring = sb4.substring(indexOf + 21);
                    sb.append(i);
                    sb.append(substring);
                }
                this.f200114K.mo108732L2(sb.toString());
                ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(this.f200114K.getMsgId(), this.f200114K);
                Log.m105925i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "dealMessageInfo() success msgXml:%s", sb);
            } catch (Exception e) {
                Log.m105925i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "dealMessageInfo() Exception:%s", e.getMessage());
            }
        }
    }

    /* renamed from: M7 */
    public final void mo95625M7(int i, int i2, String str, String str2, String str3) {
        this.f200146g1 = true;
        doSceneProgress(new C69210e2(i, i2, str, str2, C69242l1.m81601g(), C75592q0.m90783m(), getIntent().getStringExtra("key_username"), "v1.0", str3), false);
    }

    /* renamed from: N7 */
    public final void mo95626N7(String str) {
        long l = C86013q1.m106451l(str);
        if (l < this.f200134X0) {
            this.f200142d1 = 4;
            Log.m105921e("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "cdn download finish, and realLength:%s < voiceFileLength:%s, need to delete", Long.valueOf(l), Long.valueOf(this.f200134X0));
            C86013q1.m106447h(str);
            return;
        }
        this.f200142d1 = 3;
        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "cdn download finish, file is exists");
    }

    /* renamed from: O7 */
    public final void mo95627O7(int i) {
        Log.m105925i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "exchangeExpressionState() state:%s", Integer.valueOf(i));
        ((C119157j) C119157j.f356862d).mo183895z(new LuckyMoneyNewYearReceiveUIV2$$i(this, i));
    }

    /* renamed from: P7 */
    public final void mo95628P7() {
        View view = this.f200119Q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "hideAllPAGAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "hideAllPAGAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f200121R.setVisibility(8);
        C69218g1.m81566m(this.f200121R, this.f200123S, this.f200125T);
        this.f200129V.setVisibility(8);
        C69218g1.m81566m(this.f200129V, this.f200131W, this.f200133X);
    }

    /* renamed from: Q7 */
    public final void mo95629Q7(boolean z) {
        if (z) {
            this.f200171y.setVisibility(8);
            ((RelativeLayout.LayoutParams) this.f200171y.getLayoutParams()).addRule(3, C0966R.C0970id.gh7);
            this.f200173z.setText(getString(C0966R.string.giv));
            this.f200171y.setOnClickListener(new LuckyMoneyNewYearReceiveUIV2$$e(this));
            return;
        }
        this.f200171y.setVisibility(8);
        this.f200171y.setOnClickListener(new LuckyMoneyNewYearReceiveUIV2$$f(this));
        this.f200173z.setText(getString(C0966R.string.git));
    }

    /* renamed from: R7 */
    public final void mo95630R7(int i) {
        mo95631S7(i, 0);
    }

    /* renamed from: S7 */
    public final void mo95631S7(int i, long j) {
        LuckyMoneyNewYearReportStruct luckyMoneyNewYearReportStruct = new LuckyMoneyNewYearReportStruct();
        luckyMoneyNewYearReportStruct.f194258h = luckyMoneyNewYearReportStruct.mo86045b("sessionid", this.f200139a1, true);
        luckyMoneyNewYearReportStruct.f194259i = luckyMoneyNewYearReportStruct.mo86045b("flistid", this.f200145g, true);
        C69237j2 j2Var = this.f200150i1;
        if (j2Var != null) {
            luckyMoneyNewYearReportStruct.f194257g = (int) j2Var.f199249r;
        }
        luckyMoneyNewYearReportStruct.f194255e = (long) this.f200141c1;
        luckyMoneyNewYearReportStruct.f194260j = this.f200140b1;
        luckyMoneyNewYearReportStruct.f194254d = (long) i;
        luckyMoneyNewYearReportStruct.f194256f = j;
        luckyMoneyNewYearReportStruct.mo86054n();
    }

    /* renamed from: T7 */
    public final void mo95632T7(String str) {
        if (this.f200122R0) {
            this.f200129V.postDelayed(new LuckyMoneyNewYearReceiveUIV2$$h(this, str), 100);
        }
    }

    /* renamed from: U7 */
    public final void mo95633U7(boolean z) {
        if (this.f200126T0 == null || !this.f200124S0) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "stopVoicePlay but no need");
            return;
        }
        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "stopVoicePlay");
        if (z) {
            C69218g1.m81565l(this.f200172y0);
        }
        this.f200126T0.stop();
        this.f200124S0 = false;
        long milliSecondsToNow = Util.milliSecondsToNow(this.f200138Z0);
        this.f200138Z0 = 0;
        mo95631S7(16, milliSecondsToNow);
    }

    /* renamed from: V7 */
    public final void mo95634V7(boolean z) {
        Class cls = C79168k.class;
        if (Util.isNullOrNil(this.f200127U.f199138f) || !this.f200136Y0) {
            View view = this.f200135Y;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "updateStatusLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "updateStatusLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        Log.m105925i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "show StatusLayout:%s", this.f200127U.f199138f);
        if (z) {
            C69218g1.m81561h(this.f200135Y, 0);
        } else {
            View view2 = this.f200135Y;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "updateStatusLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "updateStatusLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f200161p0.setText(getString(C0966R.string.f360990lv0, new Object[]{this.f200127U.f199138f}));
        String r702 = ((C79168k) C86312j.m106911c(cls)).r70();
        String qb02 = ((C79168k) C86312j.m106911c(cls)).qb0();
        Log.m105925i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "updateStatusLayout:publishIconId:%s  showIconId:%s", r702, qb02);
        ((C79168k) C86312j.m106911c(cls)).mo74132ov(this.f200170x0, qb02, C63347a.C47893d.FILLED, C63347a.C47891b.DEFAULT);
        this.f200135Y.setOnClickListener(new LuckyMoneyNewYearReceiveUIV2$$j(this, r702));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359870cm0;
    }

    public void initView() {
        setActionbarColor(-839716110);
        this.f200147h = findViewById(C0966R.C0970id.m_b);
        if (C85875k4.m106211z()) {
            this.f200147h.setBackgroundResource(C0966R.color.BW_0_Alpha_0_8);
            setActionbarColor(getResources().getColor(C0966R.color.BW_0_Alpha_0_8));
            setNavigationbarColor(getResources().getColor(C0966R.color.BW_0_Alpha_0_8));
        } else {
            this.f200147h.setBackgroundColor(-839716110);
            setActionbarColor(-839716110);
            setNavigationbarColor(-839716110);
        }
        this.f200149i = findViewById(C0966R.C0970id.gh8);
        this.f200151j = (LuckyMoneyAutoScrollView) findViewById(C0966R.C0970id.gh4);
        this.f200156n = (TextView) findViewById(C0966R.C0970id.gbt);
        this.f200158o = (TextView) findViewById(C0966R.C0970id.ghe);
        this.f200160p = (ImageView) findViewById(C0966R.C0970id.gh5);
        this.f200163r = (LinearLayout) findViewById(C0966R.C0970id.ghc);
        this.f200164s = (TextView) findViewById(C0966R.C0970id.gha);
        this.f200165t = (ImageView) findViewById(C0966R.C0970id.ghb);
        this.f200162q = (TextView) findViewById(C0966R.C0970id.ghd);
        this.f200166u = (LinearLayout) findViewById(C0966R.C0970id.gh_);
        MMAnimateView mMAnimateView = (MMAnimateView) findViewById(C0966R.C0970id.hrb);
        this.f200108E = (ImageView) findViewById(C0966R.C0970id.ggu);
        this.f200109F = findViewById(C0966R.C0970id.ggr);
        this.f200110G = (BaseEmojiView) findViewById(C0966R.C0970id.ggn);
        this.f200169x = (TextView) findViewById(C0966R.C0970id.ggz);
        this.f200167v = (LinearLayout) findViewById(C0966R.C0970id.ggw);
        this.f200168w = (MMAnimateView) findViewById(C0966R.C0970id.g3c);
        this.f200171y = (LinearLayout) findViewById(C0966R.C0970id.gcd);
        this.f200173z = (TextView) findViewById(C0966R.C0970id.gce);
        this.f200135Y = findViewById(C0966R.C0970id.m4a);
        this.f200137Z = findViewById(C0966R.C0970id.m4b);
        this.f200161p0 = (TextView) findViewById(C0966R.C0970id.m4h);
        this.f200170x0 = (CdnImageView) findViewById(C0966R.C0970id.m4f);
        View findViewById = findViewById(C0966R.C0970id.m4c);
        this.f200144f1 = findViewById;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.3f));
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "initView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "initView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f200119Q = findViewById(C0966R.C0970id.m47);
        this.f200121R = (PAGView) findViewById(C0966R.C0970id.m49);
        this.f200123S = new C69696u1(this);
        this.f200125T = new C69705v1(this);
        this.f200121R.addListener(this.f200123S);
        this.f200121R.setRepeatCount(1);
        this.f200121R.setScaleMode(3);
        this.f200169x.setOnClickListener(new LuckyMoneyNewYearReceiveUIV2$$n(this));
        this.f200129V = (PAGView) findViewById(C0966R.C0970id.ogo);
        this.f200131W = new C69717x1(this);
        this.f200133X = new C69726y1(this);
        this.f200129V.addListener(this.f200123S);
        this.f200129V.setRepeatCount(1);
        this.f200129V.setScaleMode(3);
        this.f200172y0 = (ImageView) findViewById(C0966R.C0970id.ogw);
        this.f200120Q0 = (TextView) findViewById(C0966R.C0970id.ogx);
        if (this.f200122R0) {
            this.f200172y0.setVisibility(0);
            this.f200120Q0.setVisibility(0);
            this.f200172y0.setOnClickListener(this.f200159o1);
            this.f200149i.setOnClickListener(this.f200159o1);
        }
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f358688gh2);
        this.f200105B = imageView;
        imageView.setOnClickListener(new LuckyMoneyNewYearReceiveUIV2$$o(this));
        this.f200107D = findViewById(C0966R.C0970id.f358682m40);
        ImageView imageView2 = (ImageView) findViewById(C0966R.C0970id.f358687gh1);
        this.f200106C = imageView2;
        imageView2.setOnClickListener(new LuckyMoneyNewYearReceiveUIV2$$p(this));
        setContentViewVisibility(8);
        this.f200104A = C76879j.m92723Q(getContext(), (String) null, getString(C0966R.string.gas), true, true, new LuckyMoneyNewYearReceiveUIV2$$b(this));
        if (this.f200122R0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById(C0966R.C0970id.gh6).getLayoutParams();
            layoutParams.bottomMargin = C76577a.m92151b(getContext(), 161);
            findViewById(C0966R.C0970id.gh6).setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) findViewById(C0966R.C0970id.gh7).getLayoutParams();
            layoutParams2.topMargin = C76577a.m92151b(getContext(), -16);
            findViewById(C0966R.C0970id.gh7).setLayoutParams(layoutParams2);
        }
        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "setBackgroundContainerSize");
        Point b = C75044y4.m89990b(getContext());
        int i = b.x;
        int i2 = b.y;
        int f = C75044y4.m89994f(getContext());
        int c = C75044y4.m89991c(getContext());
        int b2 = C76577a.m92151b(getContext(), C0947jz.f2205e);
        int b3 = C76577a.m92151b(getContext(), EasyGoCode.ReleaseErrCode.UNKNOWN_ERR);
        ViewGroup.LayoutParams layoutParams3 = this.f200149i.getLayoutParams();
        float f2 = C88494d.f255615g;
        float b4 = (float) C76577a.m92151b(getContext(), 48);
        if (f2 > 1.0f) {
            b4 /= f2;
        }
        int b5 = C76577a.m92151b(getContext(), 48) + C76577a.m92151b(getContext(), 40);
        Log.m105925i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "screenWidth：%s containerRealWidth:%s", Integer.valueOf(i), Integer.valueOf(b2));
        float f3 = (float) i;
        if (f3 <= ((float) b2) + b4) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "need adjust width");
            layoutParams3.width = (int) (f3 - b4);
        }
        int i3 = (i2 - f) - c;
        int i4 = b3 + b5;
        Log.m105925i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "carsonhe screenHeighh - s - n：%s  statusHeight:%s containerRealHeight + buttonHeight:%s", Integer.valueOf(i3), Integer.valueOf(f), Integer.valueOf(i4));
        if (i3 < i4) {
            this.f200148h1 = true;
            Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "need adjust height");
            layoutParams3.height = i3 - b5;
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) findViewById(C0966R.C0970id.gh6).getLayoutParams();
            if (this.f200122R0) {
                layoutParams4.bottomMargin = C76577a.m92151b(getContext(), 146);
            } else {
                layoutParams4.bottomMargin = C76577a.m92151b(getContext(), 106);
            }
            findViewById(C0966R.C0970id.gh6).setLayoutParams(layoutParams4);
            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.f200158o.getLayoutParams();
            layoutParams5.bottomMargin = 0;
            this.f200158o.setLayoutParams(layoutParams5);
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f200166u.getLayoutParams();
            layoutParams6.bottomMargin = C76577a.m92151b(getContext(), 6);
            this.f200166u.setLayoutParams(layoutParams6);
            LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) this.f200107D.getLayoutParams();
            layoutParams7.topMargin = C76577a.m92151b(getContext(), 24);
            this.f200107D.setLayoutParams(layoutParams7);
        }
        this.f200149i.setLayoutParams(layoutParams3);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f200112I = getIntent().getStringExtra("key_username");
        this.f200113J = getIntent().getStringExtra("key_emoji_md5");
        this.f200114K = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(getIntent().getLongExtra("key_msgid", 0));
        this.f200115L = getIntent().getIntExtra("key_msg_newyear_localreceivestatus", 0);
        this.f200139a1 = UUID.randomUUID().toString();
        this.f200132W0 = getIntent().getStringExtra("key_voice_url");
        this.f200130V0 = getIntent().getStringExtra("key_voice_asekey");
        this.f200134X0 = getIntent().getLongExtra("key_voice_length", 0);
        long longExtra = getIntent().getLongExtra("key_voice_play_time", 0);
        if (!Util.isNullOrNil(this.f200130V0)) {
            this.f200122R0 = true;
            String str = this.f200130V0;
            String str2 = C69218g1.f199176a;
            StringBuilder sb = new StringBuilder();
            sb.append(C69218g1.f199176a + "voice" + "/");
            sb.append(str);
            String sb4 = sb.toString();
            this.f200128U0 = sb4;
            if (C86013q1.m106450k(sb4)) {
                this.f200142d1 = 3;
            } else if (C69218g1.m81556c(this.f200132W0, this.f200130V0, this.f200157n1)) {
                this.f200142d1 = 2;
            } else {
                Log.m105920e("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "cdn upload fail");
                this.f200142d1 = 4;
            }
        }
        this.f200118P = getIntent().getStringExtra("key_native_url");
        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "emojiMd5:" + this.f200113J + " cdnAesKey:" + this.f200130V0 + " playTime:" + longExtra);
        Uri parse = Uri.parse(Util.nullAsNil(this.f200118P));
        try {
            this.f200145g = parse.getQueryParameter("sendid");
        } catch (Exception e) {
            Log.m105925i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "onCreate() Exception:%s", e.getMessage());
        }
        initView();
        if (!Util.isNullOrNil(this.f200145g)) {
            doSceneProgress(new C69237j2(1, Util.getInt(parse.getQueryParameter("channelid"), 1), this.f200145g, this.f200118P, 1, "v1.0", ""), false);
            C89779i0 i0Var = this.f200104A;
            if (i0Var != null) {
                i0Var.show();
                return;
            }
            return;
        }
        finish();
        Log.m105928w("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "sendid null & finish");
    }

    public void onDestroy() {
        super.onDestroy();
        C89779i0 i0Var = this.f200104A;
        if (i0Var != null && i0Var.isShowing()) {
            this.f200104A.dismiss();
        }
        ((C39833l0) C86312j.m106911c(C39833l0.class)).mo62465NG((C39833l0.C39834a) null);
        mo95628P7();
        mo95633U7(false);
        MMAnimateView mMAnimateView = this.f200168w;
        if (mMAnimateView != null) {
            mMAnimateView.pause();
            this.f200168w.mo129237x();
        }
        this.f200152j1.dead();
    }

    public void onResume() {
        super.onResume();
        if (this.f200116M) {
            finish();
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        C69237j2 j2Var;
        int i4;
        int i5 = i;
        int i6 = i2;
        C117747y yVar2 = yVar;
        Class cls = C76705f.class;
        StringBuilder sb = new StringBuilder();
        sb.append("onSceneEnd() errType:");
        sb.append(i5);
        sb.append(" errCode:");
        sb.append(i6);
        sb.append(" errMsg:");
        String str2 = str;
        sb.append(str2);
        sb.append(" netsceneType:");
        sb.append(yVar.getType());
        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", sb.toString());
        if (yVar2 instanceof C69237j2) {
            if (i5 == 0 && i6 == 0) {
                C69237j2 j2Var2 = (C69237j2) yVar2;
                this.f200150i1 = j2Var2;
                this.f200111H = j2Var2.f199233K;
                this.f200136Y0 = j2Var2.f199239R;
                if (j2Var2.f199255x == 1) {
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "is Sender hb!");
                    this.f200141c1 = 1;
                    if (j2Var2.f199250s != 4) {
                        this.f200166u.setVisibility(8);
                    }
                    C89779i0 i0Var = this.f200104A;
                    if (i0Var != null && i0Var.isShowing()) {
                        this.f200104A.dismiss();
                    }
                    if (j2Var2.f199250s != 5) {
                        String n = C75228t.m90260n(((double) j2Var2.f199249r) / 100.0d);
                        this.f200151j.setContentDescription(n);
                        this.f200151j.setFinalText(n);
                        this.f200151j.mo95512a();
                        C69242l1.m81616v(getContext(), this.f200158o, j2Var2.f199254w);
                        this.f200163r.setVisibility(8);
                        this.f200166u.setVisibility(0);
                        if (j2Var2.f199250s == 4) {
                            ((C76705f) C86312j.m106911c(cls)).mo106822J5(this.f200160p, this.f200112I);
                            mo95624L7(2);
                        } else {
                            this.f200160p.setVisibility(8);
                        }
                        this.f200162q.setText(j2Var2.f199252u);
                        this.f200162q.setTextSize(1, 16.0f);
                        if (!this.f200148h1) {
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f200166u.getLayoutParams();
                            layoutParams.bottomMargin = C76577a.m92151b(this, 20);
                            this.f200166u.setLayoutParams(layoutParams);
                        }
                        this.f200166u.invalidate();
                        View findViewById = findViewById(C0966R.C0970id.gh6);
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view = findViewById;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        View findViewById2 = findViewById(C0966R.C0970id.gh6);
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view2 = findViewById2;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        ((TextView) findViewById(C0966R.C0970id.gh7)).setText(j2Var2.f199252u);
                        ((TextView) findViewById(C0966R.C0970id.gh7)).setVisibility(0);
                        ((TextView) findViewById(C0966R.C0970id.gh7)).setTextSize(24.0f);
                        mo95629Q7(true);
                        mo95624L7(1);
                    }
                    setContentViewVisibility(0);
                    C69218g1.m81559f(this.f200149i, (Animation.AnimationListener) null);
                    this.f200105B.setVisibility(8);
                    this.f200106C.setVisibility(0);
                    j2Var = j2Var2;
                    i3 = 5;
                } else {
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "is receiver hb!");
                    if (!TextUtils.isEmpty(getIntent().getStringExtra("key_username"))) {
                        ((C76705f) C86312j.m106911c(cls)).mo106822J5(this.f200160p, getIntent().getStringExtra("key_username"));
                    } else if (!TextUtils.isEmpty(j2Var2.f199248q)) {
                        C69242l1.m81595a(this.f200160p, j2Var2.f199248q, j2Var2.f199257z);
                    }
                    this.f200162q.setTextSize(1, 16.0f);
                    AppCompatActivity context = getContext();
                    TextView textView = this.f200162q;
                    C69242l1.m81616v(context, textView, j2Var2.f199246o + getString(C0966R.string.gho));
                    if (!this.f200148h1) {
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f200166u.getLayoutParams();
                        layoutParams2.bottomMargin = C76577a.m92151b(this, 20);
                        this.f200166u.setLayoutParams(layoutParams2);
                    }
                    this.f200166u.invalidate();
                    this.f200166u.setVisibility(8);
                    this.f200163r.setVisibility(8);
                    if (j2Var2.f199251t != 0 || (i4 = j2Var2.f199250s) == 4 || i4 == 5 || i4 == 1) {
                        j2Var = j2Var2;
                        i3 = 5;
                        C89779i0 i0Var2 = this.f200104A;
                        if (i0Var2 != null && i0Var2.isShowing()) {
                            this.f200104A.dismiss();
                        }
                        if (j2Var.f199250s != 5) {
                            String n2 = C75228t.m90260n(((double) j2Var.f199249r) / 100.0d);
                            this.f200151j.setContentDescription(n2);
                            this.f200151j.setFinalText(n2);
                            this.f200151j.mo95512a();
                            C69242l1.m81616v(getContext(), this.f200158o, j2Var.f199254w);
                            mo95624L7(2);
                            mo95629Q7(false);
                            View findViewById3 = findViewById(C0966R.C0970id.gh6);
                            C9556a aVar3 = new C9556a();
                            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                            aVar3.mo10233c(0);
                            View view3 = findViewById3;
                            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            this.f200171y.setVisibility(8);
                            View findViewById4 = findViewById(C0966R.C0970id.gh6);
                            C9556a aVar4 = new C9556a();
                            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                            aVar4.mo10233c(8);
                            View view4 = findViewById4;
                            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            ((TextView) findViewById(C0966R.C0970id.gh7)).setText(j2Var.f199252u);
                            ((TextView) findViewById(C0966R.C0970id.gh7)).setVisibility(0);
                            ((TextView) findViewById(C0966R.C0970id.gh7)).setTextSize(24.0f);
                            mo95624L7(1);
                        }
                        setContentViewVisibility(0);
                        C69218g1.m81559f(this.f200149i, (Animation.AnimationListener) null);
                    } else if ("0".equals(j2Var2.f199225C)) {
                        j2Var = j2Var2;
                        i3 = 5;
                        new C67008a().mo90976a(this, this.f199660d, j2Var2.f199226D, j2Var2.f199227E, j2Var2.f199228F, j2Var2.f199229G, new LuckyMoneyNewYearReceiveUIV2$$c(this, j2Var2), true, 1005);
                    } else {
                        j2Var = j2Var2;
                        i3 = 5;
                        mo95625M7(j2Var.f199242h, j2Var.f199243i, j2Var.f199244j, j2Var.f199245n, j2Var.f199237P);
                    }
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f200163r.getLayoutParams();
                    layoutParams3.topMargin = getResources().getDimensionPixelOffset(C0966R.dimen.af6);
                    this.f200163r.setLayoutParams(layoutParams3);
                    this.f200163r.invalidate();
                    this.f200164s.setTextSize(1, 12.0f);
                    this.f200105B.setVisibility(8);
                    this.f200106C.setVisibility(0);
                }
                if (this.f200146g1) {
                    return true;
                }
                this.f200127U = j2Var.f199224B;
                if (!(j2Var.f199255x == 1)) {
                    mo95634V7(false);
                }
                int i7 = j2Var.f199250s;
                boolean z = (i7 == i3 || i7 == 1) ? false : true;
                Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "receiveScene.hbStatus is " + j2Var.f199250s + ", isValidStatus is " + z);
                if ((Util.isEqual(this.f200111H, 1) && !Util.isNullOrNil(this.f200113J)) && z) {
                    mo95627O7(2);
                } else if (C69218g1.m81554a()) {
                    mo95627O7(1);
                    mo95632T7("loop");
                } else {
                    mo95627O7(3);
                }
                this.f200151j.mo95514c(getResources().getDimensionPixelOffset(C0966R.dimen.f357049af3), getResources().getDimensionPixelOffset(C0966R.dimen.aez));
                this.f200151j.invalidate();
                this.f200158o.setVisibility(0);
                return true;
            }
            C89779i0 i0Var3 = this.f200104A;
            if (i0Var3 != null && i0Var3.isShowing()) {
                this.f200104A.dismiss();
            }
            return false;
        } else if (!(yVar2 instanceof C69210e2)) {
            return false;
        } else {
            C89779i0 i0Var4 = this.f200104A;
            if (i0Var4 != null && i0Var4.isShowing()) {
                this.f200104A.dismiss();
            }
            if (i5 == 0 && i6 == 0) {
                C69210e2 e2Var = (C69210e2) yVar2;
                this.f200136Y0 = e2Var.f199164z;
                if (C72506r.m84838d(e2Var.f199159u)) {
                    setContentViewVisibility(4);
                    new C72506r(this).mo99912b(e2Var.f199159u, new LuckyMoneyNewYearReceiveUIV2$$d(this, e2Var));
                    return true;
                }
                setContentViewVisibility(0);
                this.f200146g1 = false;
                this.f200111H = e2Var.f199155q;
                this.f200127U = e2Var.f199162x;
                this.f200151j.mo95514c(getResources().getDimensionPixelOffset(C0966R.dimen.f357049af3), getResources().getDimensionPixelOffset(C0966R.dimen.aez));
                this.f200151j.invalidate();
                this.f200158o.setVisibility(0);
                if (!Util.isEqual(this.f200111H, 1)) {
                    if (C69218g1.m81554a()) {
                        mo95627O7(1);
                        mo95632T7(IXWebBroadcastListener.STAGE_START);
                    } else {
                        mo95627O7(3);
                    }
                } else if (!Util.isNullOrNil(this.f200113J)) {
                    mo95627O7(2);
                } else if (C69218g1.m81554a()) {
                    mo95627O7(1);
                    mo95632T7(IXWebBroadcastListener.STAGE_START);
                } else {
                    mo95627O7(3);
                }
                C69158a0 a0Var = e2Var.f199149h;
                this.f200164s.setText(a0Var.f198966f);
                C119179t tVar = C119157j.f356862d;
                C69682s1 s1Var = new C69682s1(this, e2Var);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(s1Var, 500, false);
                if (a0Var.f198965e == 4 && !TextUtils.isEmpty(e2Var.f199149h.f198966f)) {
                    this.f200165t.setVisibility(8);
                }
                mo95629Q7(false);
                setContentViewVisibility(0);
                C69218g1.m81559f(this.f200149i, (Animation.AnimationListener) null);
                mo95624L7(2);
                mo95630R7(20);
                return true;
            } else if (i6 == 416) {
                C89779i0 i0Var5 = this.f200104A;
                if (i0Var5 != null && i0Var5.isShowing()) {
                    this.f200104A.dismiss();
                }
                this.f200116M = true;
                Bundle bundle = new Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".pay.ui.WalletPayUChangeBankcardUI");
                bundle.putString("realname_verify_process_jump_plugin", "wallet_payu");
                return C69242l1.m81596b(this, i2, str, yVar, bundle, true, (DialogInterface.OnClickListener) null, (C79148e.C79149a) null, 1004);
            } else {
                C76879j.m92713G(this, TextUtils.isEmpty(str) ? getString(C0966R.string.l_3) : str2, (String) null, false, new C42542t1(this));
                return true;
            }
        }
    }

    public void onStop() {
        super.onStop();
        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "onStop");
        mo95633U7(true);
    }
}
