package com.tencent.p014mm.plugin.sns.p106ui;

import a22.C67001a;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import b22.C28250a;
import c00.C92329m;
import com.tencent.midas.api.ability.MidasActivityAbility;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.HellBizIdEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.LocationWidget;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C5480b;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.DynamicGridView;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AbsSnsUploadSayFooter;
import com.tencent.p014mm.plugin.sns.statistics.C57354l;
import com.tencent.p014mm.plugin.sns.statistics.C95005x;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72930u1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import dm2.C58325i;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import f40.C86737h0;
import h81.C32735h;
import h81.C59774i;
import hi2.C32927f;
import i21.C60242i;
import iv2.C33419c;
import j20.C117292a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k20.C60958c;
import k20.C9556a;
import k21.C60960c;
import ks2.C99205z;
import ms2.C47100l;
import nj3.C76879j;
import nj3.C88989a;
import os2.C35287b0;
import p206nj.C11171e;
import p206nj.C76865k;
import p255vr.C65873e;
import p447aw.C103918d;
import p606mm.C99933h;
import p640ox.C77049b;
import p749xh.C38549d8;
import pe3.C47465a;
import tc2.C118418g;
import te3.C101783gu2;
import u73.C101980n;
import vl3.C102226d;
import vr2.C102236a0;
import zt3.C119157j;
import zt3.C119179t;

@C86737h0
@C88989a(17)
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadUI */
public class SnsUploadUI extends MMSecDataActivity implements LocationWidget.C95344e {

    /* renamed from: Q0 */
    public static final /* synthetic */ int f278903Q0 = 0;

    /* renamed from: A */
    public ArrayList<String> f278904A = new ArrayList<>();

    /* renamed from: B */
    public int f278905B = 0;

    /* renamed from: C */
    public int f278906C = 0;

    /* renamed from: D */
    public boolean f278907D = false;

    /* renamed from: E */
    public boolean f278908E = false;

    /* renamed from: F */
    public boolean f278909F = false;

    /* renamed from: G */
    public boolean f278910G = false;

    /* renamed from: H */
    public String f278911H = null;

    /* renamed from: I */
    public String f278912I = "";

    /* renamed from: J */
    public boolean f278913J = false;

    /* renamed from: K */
    public boolean f278914K = false;

    /* renamed from: L */
    public boolean f278915L = false;

    /* renamed from: M */
    public Map<Integer, C95778f1> f278916M = new HashMap();

    /* renamed from: N */
    public ConcurrentHashMap<String, List<String>> f278917N = new ConcurrentHashMap<>();

    /* renamed from: P */
    public Map<String, List<String>> f278918P = new HashMap();

    /* renamed from: Q */
    public C99205z f278919Q;

    /* renamed from: R */
    public boolean f278920R = false;

    /* renamed from: S */
    public String f278921S = "";

    /* renamed from: T */
    public String f278922T = "";

    /* renamed from: U */
    public long f278923U = 3000;

    /* renamed from: V */
    public Runnable f278924V = new Runnable() {
        public void run() {
            C95778f1 f1Var;
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$1");
            SnsUploadUI snsUploadUI = SnsUploadUI.this;
            if (!(snsUploadUI.f278931f == null || (f1Var = snsUploadUI.f278944u) == null || !f1Var.mo132128f())) {
                Parcel obtain = Parcel.obtain();
                SnsUploadUI.this.getIntent().putExtra("Kdescription", SnsUploadUI.this.f278931f.getText().toString());
                SnsUploadUI.this.getIntent().putExtra("KparseLen", SnsUploadUI.this.f278931f.getPasterLen());
                SnsUploadUI snsUploadUI2 = SnsUploadUI.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                snsUploadUI2.getClass();
                SnsMethodCalculate.markStartTimeMs("resetIntent", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                snsUploadUI2.getIntent().putExtra("Kis_retry_edit", false);
                SnsMethodCalculate.markEndTimeMs("resetIntent", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                SnsUploadUI.this.getIntent().writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                String mD5String = MD5Util.getMD5String(marshall);
                SnsUploadUI snsUploadUI3 = SnsUploadUI.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                String str = snsUploadUI3.f278922T;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                Log.m105927v("MicroMsg.SnsUploadUI", "autoSaveDraft lastMd5:%s, newMd5:%s", str, mD5String);
                SnsUploadUI snsUploadUI4 = SnsUploadUI.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                String str2 = snsUploadUI4.f278922T;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                if (!Util.isEqual(str2, mD5String)) {
                    SnsUploadUI snsUploadUI5 = SnsUploadUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    snsUploadUI5.f278922T = mD5String;
                    SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    SnsUploadUI.m122433I7(SnsUploadUI.this, marshall, 1);
                }
                MMHandler ly02 = C94866e1.ly0();
                Runnable J7 = SnsUploadUI.m122434J7(SnsUploadUI.this);
                SnsUploadUI snsUploadUI6 = SnsUploadUI.this;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                long j = snsUploadUI6.f278923U;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                ly02.postDelayed(J7, j);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$1");
        }
    };

    /* renamed from: W */
    public FrameLayout f278925W = null;

    /* renamed from: X */
    public long f278926X = 0;

    /* renamed from: Y */
    public String f278927Y;

    /* renamed from: Z */
    public long f278928Z = 0;

    /* renamed from: d */
    public WrapScollview f278929d;

    /* renamed from: e */
    public View f278930e;

    /* renamed from: f */
    public C74974a f278931f;

    /* renamed from: g */
    public LinearLayout f278932g;

    /* renamed from: h */
    public String f278933h;

    /* renamed from: i */
    public AtContactWidget f278934i;

    /* renamed from: j */
    public LocationWidget f278935j;

    /* renamed from: n */
    public BaseRangeWidget f278936n;

    /* renamed from: o */
    public AbsSnsUploadSayFooter f278937o;

    /* renamed from: p */
    public SnsUploadConfigView f278938p;

    /* renamed from: p0 */
    public int f278939p0 = 0;

    /* renamed from: q */
    public DynamicGridView f278940q;

    /* renamed from: r */
    public int f278941r = 0;

    /* renamed from: s */
    public boolean f278942s = false;

    /* renamed from: t */
    public long f278943t = 0;

    /* renamed from: u */
    public C95778f1 f278944u = null;

    /* renamed from: v */
    public String f278945v = "";

    /* renamed from: w */
    public String f278946w = "";

    /* renamed from: x */
    public String f278947x = "";

    /* renamed from: x0 */
    public int f278948x0 = 0;

    /* renamed from: y */
    public String f278949y = "";

    /* renamed from: y0 */
    public IListener<HellBizIdEvent> f278950y0 = new IListener<HellBizIdEvent>(C40008f.f107254d) {
        {
            this.__eventId = 184294137;
        }

        public boolean callback(IEvent iEvent) {
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$25");
            HellBizIdEvent hellBizIdEvent = (HellBizIdEvent) iEvent;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$25");
            if (hellBizIdEvent != null) {
                String str = hellBizIdEvent.f264903d.f264904a;
                if (Util.isEqual(str, SnsUploadUI.this.hashCode() + "")) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SNS_POST_BIZ_ID_STRING, hellBizIdEvent.f264903d.f264905b);
                }
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$25");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$25");
            return false;
        }
    };

    /* renamed from: z */
    public ArrayList<String> f278951z = new ArrayList<>();

    /* renamed from: H7 */
    public static void m122432H7(SnsUploadUI snsUploadUI) {
        SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        snsUploadUI.getClass();
        SnsMethodCalculate.markStartTimeMs("descTextViewOnClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        snsUploadUI.f278931f.mo104256m();
        Log.m105918d("MicroMsg.SnsUploadUI", "request fouces");
        if (snsUploadUI.f278937o.mo98022b()) {
            snsUploadUI.f278937o.mo98025g();
        }
        if (!KeyBoardUtil.isPortOrientation(snsUploadUI)) {
            snsUploadUI.f278937o.mo98024f();
        }
        snsUploadUI.getContentView().postInvalidate();
        SnsMethodCalculate.markEndTimeMs("descTextViewOnClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* renamed from: I7 */
    public static void m122433I7(SnsUploadUI snsUploadUI, final byte[] bArr, final int i) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        snsUploadUI.getClass();
        SnsMethodCalculate.markStartTimeMs("saveDraft", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        C94866e1.my0().post(new Runnable() {
            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$3");
                long currentTimeMillis = System.currentTimeMillis();
                C35287b0 Wx0 = C94866e1.Wx0();
                SnsUploadUI snsUploadUI = SnsUploadUI.this;
                int i = SnsUploadUI.f278903Q0;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                String str = snsUploadUI.f278921S;
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                Wx0.mo60186Yt(str, r0, 0);
                SnsUploadUI snsUploadUI2 = SnsUploadUI.this;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                String str2 = snsUploadUI2.f278921S;
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                Log.m105925i("MicroMsg.SnsUploadUI", "saveDraft draftKey:%s, cost time:%s", str2, Long.valueOf(Util.milliSecondsToNow(currentTimeMillis)));
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$3");
            }
        });
        SnsMethodCalculate.markEndTimeMs("saveDraft", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* renamed from: J7 */
    public static /* synthetic */ Runnable m122434J7(SnsUploadUI snsUploadUI) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        Runnable runnable = snsUploadUI.f278924V;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return runnable;
    }

    /* renamed from: K7 */
    public static /* synthetic */ void m122435K7(SnsUploadUI snsUploadUI) {
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        snsUploadUI.mo133075M7();
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* renamed from: T7 */
    public static void m122436T7(int i, String str, String str2, long j, String str3) {
        SnsMethodCalculate.markStartTimeMs("reportInputMenu", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        ((C92329m) C86312j.m106911c(C92329m.class)).mo37190PZ((View) null, 1, 1, C75592q0.m90789s(), str2, 1, "", str3, i, str, j);
        SnsMethodCalculate.markEndTimeMs("reportInputMenu", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* renamed from: L7 */
    public void mo133074L7(Bundle bundle) {
        View view;
        SnsMethodCalculate.markStartTimeMs("attachWidget", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        Log.m105925i("MicroMsg.SnsUploadUI", "attachWidget. share type %d, isManuSnsPost:%b", Integer.valueOf(this.f278941r), Boolean.valueOf(this.f278942s));
        int i = this.f278941r;
        if (i == 0 || i == 14 || i == 9) {
            Parcel obtain = Parcel.obtain();
            getIntent().writeToParcel(obtain, 0);
            obtain.marshall();
            if (this.f278941r == 9) {
                setMMTitle(getContext().getResources().getString(C0966R.string.jio));
            } else {
                setMMTitle("");
            }
        }
        int i2 = this.f278941r;
        switch (i2) {
            case 0:
            case 28:
                this.f278921S = "draft_normal";
                this.f278944u = mo133079Q7(i2);
                this.f278931f.addTextChangedListener(new TextWatcher() {
                    public void afterTextChanged(Editable editable) {
                        SnsMethodCalculate.markStartTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$23");
                        SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$23");
                    }

                    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        SnsMethodCalculate.markStartTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$23");
                        SnsMethodCalculate.markEndTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$23");
                    }

                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        View findViewById;
                        SnsMethodCalculate.markStartTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$23");
                        if (SnsUploadUI.this.f278931f.getText().toString().trim().length() > 10 && (findViewById = SnsUploadUI.this.findViewById(C0966R.C0970id.jto)) != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            View view = findViewById;
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsUploadUI$23", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$23", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        SnsMethodCalculate.markEndTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$23");
                    }
                });
                break;
            case 1:
            case 11:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 29:
            case 32:
            case 34:
                this.f278944u = new C95788g1(this);
                break;
            case 2:
                this.f278944u = new MusicWidget(this);
                break;
            case 3:
                this.f278944u = new C95779f2(this, 9);
                break;
            case 4:
                this.f278944u = new C95753d0(this);
                break;
            case 5:
                this.f278944u = new C95779f2(this, 14);
                break;
            case 6:
                this.f278944u = new C95779f2(this, 12);
                break;
            case 7:
                this.f278944u = new C95779f2(this, 13);
                break;
            case 8:
                this.f278944u = new C96008l8(this);
                break;
            case 9:
                this.f278921S = "draft_text";
                String nullAs = Util.nullAs(getIntent().getStringExtra("Kdescription"), "");
                int nullAs2 = Util.nullAs(Integer.valueOf(getIntent().getIntExtra("KparseLen", 0)), 0);
                this.f278944u = new C96310x1(this, nullAs);
                this.f278931f.setPasterLen(nullAs2);
                this.f278931f.setText(C102226d.m134696a(getContext(), nullAs));
                AppCompatActivity context = getContext();
                View view2 = this.f278931f.view();
                SnsMethodCalculate.markStartTimeMs("launch", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate");
                if (view2 != null) {
                    view2.requestFocus();
                }
                C119179t tVar = C119157j.f356862d;
                C5480b bVar = new C5480b(context, view2);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(bVar, 200, false);
                SnsMethodCalculate.markEndTimeMs("launch", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate");
                C74974a aVar = this.f278931f;
                aVar.setSelection(aVar.getText().length());
                SnsMethodCalculate.markStartTimeMs("watchInputTextEnablePost", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                Log.m105924i("MicroMsg.SnsUploadUI", "watchInputTextEnablePost: ");
                this.f278931f.addTextChangedListener(new TextWatcher() {
                    public void afterTextChanged(Editable editable) {
                        SnsMethodCalculate.markStartTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$26");
                        SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$26");
                    }

                    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        SnsMethodCalculate.markStartTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$26");
                        SnsMethodCalculate.markEndTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$26");
                    }

                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        SnsMethodCalculate.markStartTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$26");
                        SnsUploadUI snsUploadUI = SnsUploadUI.this;
                        snsUploadUI.enableOptionMenu(C96310x1.m123513k(snsUploadUI.f278931f.getText().toString()));
                        SnsMethodCalculate.markEndTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$26");
                    }
                });
                SnsMethodCalculate.markEndTimeMs("watchInputTextEnablePost", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                break;
            case 10:
                this.f278944u = new C95737b0(this);
                break;
            case 12:
                this.f278944u = new C95746c0(this);
                break;
            case 13:
            case 33:
                this.f278944u = new C95763e0(this, i2);
                break;
            case 14:
                this.f278921S = "draft_normal";
                this.f278944u = mo133079Q7(i2);
                break;
            case 17:
                this.f278944u = new FinderMediaWidget(this);
                break;
            case 19:
                this.f278944u = new C96064m1(this);
                break;
            case 21:
                this.f278944u = new C95969j0(this);
                break;
            case 23:
                this.f278944u = new C96109p1(this);
                break;
            case 25:
                this.f278944u = new C96176r1(this);
                break;
            case 27:
                this.f278944u = new C95798h0(this);
                break;
            case 30:
                this.f278944u = new C96004l0(this);
                break;
            case 36:
                this.f278944u = new C95774f0(this);
                break;
        }
        this.f278944u.mo132126d(bundle);
        C95778f1 f1Var = this.f278944u;
        if (!(f1Var instanceof C95754d2) || (f1Var instanceof C95994k0)) {
            view = f1Var.mo132124a();
            LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.f359590lq1);
            this.f278932g = linearLayout;
            linearLayout.setVisibility(0);
            this.f278932g.setClipChildren(false);
            if (view != null) {
                Log.m105918d("MicroMsg.SnsUploadUI", "will add widget view in widgetLL.");
                this.f278932g.addView(view);
            } else {
                this.f278932g.setVisibility(8);
            }
            int i3 = this.f278941r;
            if (i3 == 9 || i3 == 14) {
                Log.m105924i("MicroMsg.SnsUploadUI", "attachWidget: show view: widget_line");
                View findViewById = findViewById(C0966R.C0970id.f359591lq2);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
                layoutParams.addRule(3, C0966R.C0970id.f359590lq1);
                layoutParams.topMargin = (int) (BitmapUtil.getDefaultDisplayMetrics().density * ((float) (this.f278941r == 9 ? 128 : 96)));
                findViewById.setLayoutParams(layoutParams);
            }
        } else {
            View findViewById2 = findViewById(C0966R.C0970id.jsx);
            View findViewById3 = findViewById(C0966R.C0970id.jto);
            DynamicGridView dynamicGridView = (DynamicGridView) findViewById(C0966R.C0970id.jvf);
            this.f278940q = dynamicGridView;
            dynamicGridView.setNeedBanTouch(this.f278915L);
            this.f278940q.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    arrayList.add(motionEvent);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsUploadUI$24", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                    SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$24");
                    Log.m105918d("MicroMsg.SnsUploadUI", "onTouch: GridPreviewImgView");
                    boolean W7 = SnsUploadUI.this.mo133084W7();
                    SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$24");
                    C117292a.m165362h(W7, this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$24", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return W7;
                }
            });
            view = ((C95754d2) this.f278944u).mo133192o(findViewById2, findViewById(C0966R.C0970id.c0_), this.f278940q, findViewById3, findViewById(C0966R.C0970id.f359591lq2));
            this.f278940q.setVisibility(0);
        }
        C95778f1 f1Var2 = this.f278944u;
        if ((f1Var2 instanceof C95788g1) || (f1Var2 instanceof C96064m1)) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.width = -1;
            view.setLayoutParams(layoutParams2);
        }
        C95778f1 f1Var3 = this.f278944u;
        if ((f1Var3 instanceof C95753d0) || (f1Var3 instanceof C95737b0) || (f1Var3 instanceof C95746c0) || (f1Var3 instanceof C95763e0)) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams3.width = -1;
            view.setLayoutParams(layoutParams3);
        }
        mo133088a8();
        if (this.f278941r == 0) {
            SnsMethodCalculate.markStartTimeMs("initDragDropEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            if (!(this.f278944u instanceof C95754d2)) {
                Log.m105920e("MicroMsg.SnsUploadUI", "widget is not instanceof PicWidget");
                SnsMethodCalculate.markEndTimeMs("initDragDropEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            } else {
                C94866e1.my0().post(new Runnable() {
                    public void run() {
                        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$2");
                        C712251 r2 = new View.OnDragListener() {
                            public boolean onDrag(View view, DragEvent dragEvent) {
                                boolean z;
                                String str;
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(view);
                                arrayList.add(dragEvent);
                                Object[] array = arrayList.toArray();
                                arrayList.clear();
                                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsUploadUI$2$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", this, array);
                                SnsMethodCalculate.markStartTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$2$1");
                                int action = dragEvent.getAction();
                                if (!(action == 1 || action == 2)) {
                                    if (action == 3) {
                                        Log.m105924i("MicroMsg.SnsUploadUI", "ACTION_DROP");
                                        ClipData clipData = dragEvent.getClipData();
                                        if (clipData != null) {
                                            int itemCount = clipData.getItemCount();
                                            ArrayList arrayList2 = new ArrayList();
                                            for (int i = 0; i < itemCount; i++) {
                                                ClipData.Item itemAt = clipData.getItemAt(i);
                                                if (itemAt == null) {
                                                    Log.m105920e("MicroMsg.SnsUploadUI", "item == null");
                                                } else if (itemAt.getIntent() != null) {
                                                    SnsUploadUI snsUploadUI = SnsUploadUI.this;
                                                    Intent intent = itemAt.getIntent();
                                                    C9556a aVar = new C9556a();
                                                    aVar.mo10233c(intent);
                                                    SnsUploadUI snsUploadUI2 = snsUploadUI;
                                                    C117292a.m165358d(snsUploadUI2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsUploadUI$2$1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                                    snsUploadUI.startActivity((Intent) aVar.mo10231a(0));
                                                    C117292a.m165359e(snsUploadUI2, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$2$1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                                } else if (itemAt.getUri() != null) {
                                                    C72930u1 u1Var = new C72930u1(SnsUploadUI.this.getContext(), itemAt.getUri());
                                                    int i2 = u1Var.f212554b;
                                                    if (i2 == 0 || (str = u1Var.f212553a) == null) {
                                                        Log.m105920e("MicroMsg.SnsUploadUI", "get file path failed");
                                                    } else if (i2 == 3) {
                                                        arrayList2.add(str);
                                                    }
                                                }
                                            }
                                            if (arrayList2.size() < 0) {
                                                Log.m105920e("MicroMsg.SnsUploadUI", "no image file available");
                                                SnsMethodCalculate.markEndTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$2$1");
                                                C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$2$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
                                                return true;
                                            }
                                            ((C95754d2) SnsUploadUI.this.f278944u).mo133197k(arrayList2, 0, false);
                                        }
                                        z = true;
                                        SnsMethodCalculate.markEndTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$2$1");
                                        C117292a.m165362h(z, this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$2$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
                                        return z;
                                    } else if (!(action == 4 || action == 5)) {
                                        Log.m105920e("MicroMsg.SnsUploadUI", "Unknown action type received by OnDragListener.");
                                        z = false;
                                        SnsMethodCalculate.markEndTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$2$1");
                                        C117292a.m165362h(z, this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$2$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
                                        return z;
                                    }
                                }
                                Log.m105925i("MicroMsg.SnsUploadUI", "ACTION: [%s]", Integer.valueOf(action));
                                z = true;
                                SnsMethodCalculate.markEndTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$2$1");
                                C117292a.m165362h(z, this, "com/tencent/mm/plugin/sns/ui/SnsUploadUI$2$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
                                return z;
                            }
                        };
                        SnsUploadUI snsUploadUI = SnsUploadUI.this;
                        int i = SnsUploadUI.f278903Q0;
                        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        FrameLayout frameLayout = snsUploadUI.f278925W;
                        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        if (frameLayout != null) {
                            SnsUploadUI snsUploadUI2 = SnsUploadUI.this;
                            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            FrameLayout frameLayout2 = snsUploadUI2.f278925W;
                            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                            frameLayout2.setOnDragListener(r2);
                        }
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$2");
                    }
                });
                SnsMethodCalculate.markEndTimeMs("initDragDropEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            }
        }
        SnsMethodCalculate.markEndTimeMs("attachWidget", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* renamed from: M7 */
    public final void mo133075M7() {
        SnsMethodCalculate.markStartTimeMs("cleanDraftSessionId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (this.f278941r == 9) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SNS_OPEN_UPLOAD_DRAFT_NEWTEXT_LAST_SESSIONID_STRING, this.f278912I);
        } else {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SNS_OPEN_UPLOAD_DRAFT_LAST_SESSIONID_STRING, this.f278912I);
        }
        SnsMethodCalculate.markEndTimeMs("cleanDraftSessionId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* renamed from: N7 */
    public final void mo133076N7(int i) {
        SnsMethodCalculate.markStartTimeMs("exit", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        C95005x.f275632a.mo131407b(i == -1 ? 1 : 2);
        if (this.f278931f != null) {
            C99205z P7 = mo133078P7();
            P7.mo138556d(this.f278931f.getLayout());
            P7.mo138555c(1, 2);
            P7.mo138554b();
        }
        if (this.f278913J) {
            SnsReportHelper.f275506m0.mo131354O(10, "", 0, 0, C31543z5.m39453c(), 0);
        }
        setResult(0, new Intent());
        finish();
        C102236a0.m134756m();
        SnsMethodCalculate.markEndTimeMs("exit", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007d, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r12.f278931f.getText().toString()) != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        if (((com.tencent.p014mm.plugin.sns.p106ui.FinderMediaWidget) r3).mo132132l() == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004d, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r12.f278931f.getText().toString()) != false) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0111  */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133077O7() {
        /*
            r12 = this;
            java.lang.String r9 = "exitAndSave"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.SnsUploadUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r1 = "KThrid_app"
            r2 = 0
            boolean r0 = r0.getBooleanExtra(r1, r2)
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r3 = "Ksnsupload_appid"
            java.lang.String r1 = r1.getStringExtra(r3)
            java.lang.String r3 = ""
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r3)
            int r3 = r12.f278941r
            if (r3 != 0) goto L_0x004f
            com.tencent.mm.plugin.sns.ui.f1 r3 = r12.f278944u
            com.tencent.mm.plugin.sns.ui.d2 r3 = (com.tencent.p014mm.plugin.sns.p106ui.C95754d2) r3
            r3.getClass()
            java.lang.String r4 = "getMediaSize"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.PicWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            com.tencent.mm.plugin.sns.ui.d2$$j r3 = r3.f279310c
            int r3 = r3.mo133208c()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            if (r3 > 0) goto L_0x00a3
            com.tencent.mm.ui.widget.cedit.api.a r3 = r12.f278931f
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x00a3
        L_0x004f:
            int r3 = r12.f278941r
            r4 = 14
            if (r3 != r4) goto L_0x007f
            com.tencent.mm.plugin.sns.ui.f1 r3 = r12.f278944u
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.sns.p106ui.NewSightWidget
            if (r4 == 0) goto L_0x007f
            com.tencent.mm.plugin.sns.ui.NewSightWidget r3 = (com.tencent.p014mm.plugin.sns.p106ui.NewSightWidget) r3
            r3.getClass()
            java.lang.String r4 = "isDeleted"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.NewSightWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            boolean r3 = r3.f277072x
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            if (r3 == 0) goto L_0x00a3
            com.tencent.mm.ui.widget.cedit.api.a r3 = r12.f278931f
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x00a3
        L_0x007f:
            int r3 = r12.f278941r
            r4 = 9
            if (r3 != r4) goto L_0x0095
            com.tencent.mm.ui.widget.cedit.api.a r3 = r12.f278931f
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x00a3
        L_0x0095:
            com.tencent.mm.plugin.sns.ui.f1 r3 = r12.f278944u
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.sns.p106ui.FinderMediaWidget
            if (r4 == 0) goto L_0x00cf
            com.tencent.mm.plugin.sns.ui.FinderMediaWidget r3 = (com.tencent.p014mm.plugin.sns.p106ui.FinderMediaWidget) r3
            boolean r3 = r3.mo132132l()
            if (r3 != 0) goto L_0x00cf
        L_0x00a3:
            boolean r3 = r12.f278914K
            if (r3 != 0) goto L_0x00cf
            r2 = 2131837240(0x7f114138, float:1.930767E38)
            r3 = 0
            r4 = 2131837242(0x7f11413a, float:1.9307674E38)
            r5 = 2131837241(0x7f114139, float:1.9307671E38)
            r6 = 1
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$4 r7 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$4
            r7.<init>(r0, r1)
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$5 r8 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$5
            r8.<init>(r0, r1)
            r11 = 2131100027(0x7f06017b, float:1.7812424E38)
            r0 = r12
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r11
            nj3.C76879j.m92741l(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            return
        L_0x00cf:
            com.tencent.mm.plugin.sns.ui.f1 r3 = r12.f278944u
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.sns.p106ui.C95788g1
            java.lang.String r5 = "exit"
            if (r4 != 0) goto L_0x0111
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.sns.p106ui.MusicWidget
            if (r4 != 0) goto L_0x0111
            boolean r3 = r3 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96176r1
            if (r3 == 0) goto L_0x00e0
            goto L_0x0111
        L_0x00e0:
            boolean r3 = r12.f278914K
            if (r3 == 0) goto L_0x00ef
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r10)
            r12.mo133076N7(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r10)
            goto L_0x01d6
        L_0x00ef:
            r2 = 2131837239(0x7f114137, float:1.9307667E38)
            r3 = 0
            r4 = 2131820944(0x7f110190, float:1.9274617E38)
            r5 = 2131821426(0x7f110372, float:1.9275595E38)
            r6 = 0
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$6 r7 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$6
            r7.<init>(r0, r1)
            r8 = 0
            r11 = 2131100028(0x7f06017c, float:1.7812426E38)
            r0 = r12
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r11
            nj3.C76879j.m92741l(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01d6
        L_0x0111:
            com.tencent.mm.ui.widget.cedit.api.a r0 = r12.f278931f
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r1 = 2
            if (r0 != 0) goto L_0x01b1
            com.tencent.mm.sdk.platformtools.MMHandler r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.ly0()
            java.lang.Runnable r3 = r12.f278924V
            r0.removeCallbacks(r3)
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.content.Intent r3 = r12.getIntent()
            com.tencent.mm.ui.widget.cedit.api.a r4 = r12.f278931f
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "Kdescription"
            r3.putExtra(r6, r4)
            android.content.Intent r3 = r12.getIntent()
            com.tencent.mm.ui.widget.cedit.api.a r4 = r12.f278931f
            int r4 = r4.getPasterLen()
            java.lang.String r6 = "KparseLen"
            r3.putExtra(r6, r4)
            java.lang.String r3 = "resetIntent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r10)
            android.content.Intent r4 = r12.getIntent()
            java.lang.String r6 = "Kis_retry_edit"
            r4.putExtra(r6, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r10)
            android.content.Intent r3 = r12.getIntent()
            r3.writeToParcel(r0, r2)
            byte[] r0 = r0.marshall()
            java.lang.String r3 = "saveDraft"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r10)
            com.tencent.mm.sdk.platformtools.MMHandler r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.my0()
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$3 r6 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$3
            r6.<init>(r0, r2)
            r4.post(r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r10)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 14247(0x37a7, float:1.9964E-41)
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r4[r2] = r6
            r6 = 1
            r7 = 7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4[r6] = r7
            java.lang.String r6 = r12.f278912I
            r4[r1] = r6
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 3
            r4[r7] = r6
            r6 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4[r6] = r7
            r0.mo160131h(r3, r4)
        L_0x01b1:
            r12.mo133075M7()
            r12.mo133082U7(r1)
            boolean r0 = r12.f278920R
            if (r0 == 0) goto L_0x01ca
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct r0 = r0.mo131390w()
            r3 = 2
            r0.f266438j = r3
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.mo131352M()
        L_0x01ca:
            r12.mo133083V7()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r10)
            r12.mo133076N7(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r10)
        L_0x01d6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.mo133077O7():void");
    }

    /* renamed from: P7 */
    public final C99205z mo133078P7() {
        SnsMethodCalculate.markStartTimeMs("getInputAreaReporter", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (this.f278919Q == null) {
            this.f278919Q = new C99205z();
        }
        C99205z zVar = this.f278919Q;
        SnsMethodCalculate.markEndTimeMs("getInputAreaReporter", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return zVar;
    }

    /* renamed from: Q7 */
    public final C95778f1 mo133079Q7(int i) {
        SnsMethodCalculate.markStartTimeMs("getWidgetFromCache", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        C95778f1 f1Var = (C95778f1) ((HashMap) this.f278916M).get(Integer.valueOf(i));
        if (f1Var == null) {
            if (i == 0) {
                f1Var = new C95748c2(this);
            } else if (i == 14) {
                f1Var = new NewSightWidget(this);
            } else if (i == 28) {
                f1Var = new C95994k0(this);
            }
            ((HashMap) this.f278916M).put(Integer.valueOf(i), f1Var);
        }
        SnsMethodCalculate.markEndTimeMs("getWidgetFromCache", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return f1Var;
    }

    /* renamed from: R7 */
    public final void mo133080R7() {
        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f278942s = getIntent().getBooleanExtra("KSnsPostManu", false);
        this.f278943t = getIntent().getLongExtra("KTouchCameraTime", 0);
        int intExtra = getIntent().getIntExtra("Ksnsupload_type", 0);
        this.f278941r = intExtra;
        int i = 1;
        Log.m105925i("MicroMsg.SnsUploadUI", "initData shareType:%s", Integer.valueOf(intExtra));
        if (getIntent().getBooleanExtra("Kis_take_photo", false)) {
            i = 2;
        }
        this.f278948x0 = i;
        this.f278908E = getIntent().getBooleanExtra("need_result", false);
        this.f278909F = getIntent().getBooleanExtra("K_go_to_SnsTimeLineUI", false);
        this.f278911H = getIntent().getStringExtra("Ksnsupload_canvas_info");
        this.f278912I = getIntent().getStringExtra("KSessionID");
        this.f278913J = getIntent().getBooleanExtra("ksnsupload_finder_need_report", false);
        this.f278914K = getIntent().getBooleanExtra("need_ban_back_tips", false);
        this.f278915L = getIntent().getBooleanExtra("need_ban_pic_touch", false);
        if (Util.isNullOrNil(this.f278912I)) {
            this.f278912I = C102236a0.m134754l();
            getIntent().putExtra("KSessionID", this.f278912I);
        } else {
            this.f278948x0 = 3;
        }
        this.f278927Y = ((C65873e) C86312j.m106911c(C65873e.class)).ep0(79);
        C47100l lVar = (C47100l) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(this, 2, C47100l.class);
        if (lVar != null) {
            lVar.f126570d = this.f278927Y;
        }
        SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* renamed from: S7 */
    public final void mo133081S7(Boolean bool) {
        SnsMethodCalculate.markStartTimeMs("reflectSetBundleDefusable", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (C11171e.m11046c(33) && ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_reflect_set_bundle_defuse, true)) {
            try {
                Log.m105925i("MicroMsg.SnsUploadUI", "reflectBundleDefusable: defusable:%b, build version:%d", bool, Integer.valueOf(Build.VERSION.SDK_INT));
                Method declaredMethod = BaseBundle.class.getDeclaredMethod("setShouldDefuse", new Class[]{Boolean.TYPE});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke((Object) null, new Object[]{bool});
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SnsUploadUI", e, "reflectSetBundleDefusable failed", new Object[0]);
            }
        }
        SnsMethodCalculate.markEndTimeMs("reflectSetBundleDefusable", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* renamed from: U7 */
    public final void mo133082U7(int i) {
        SnsMethodCalculate.markStartTimeMs("reportSnsPostGroup", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        TimelineGroupUserBehaviorStruct E = SnsReportHelper.f275506m0.mo131344E();
        E.f266375d = E.mo86045b("SessionID", this.f278912I, true);
        SnsReportHelper.f275506m0.mo131344E().f266393v = i;
        if (i == 3 || i == 2) {
            SnsReportHelper.f275506m0.mo131356Q();
        }
        SnsMethodCalculate.markEndTimeMs("reportSnsPostGroup", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* renamed from: V7 */
    public final void mo133083V7() {
        String str;
        Map<String, Boolean> map;
        SnsMethodCalculate.markStartTimeMs("reportSnsPostInfo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        C60960c.f173618a.mo85927k("SnsPublishProcess", "opresult_", Integer.valueOf(this.f278939p0), C60242i.DEFAULT);
        C59774i iVar = (C59774i) C86312j.m106911c(C59774i.class);
        iVar.ut0("startTime", this.f278928Z + "");
        iVar.ut0("endTime", Util.nowMilliSecond() + "");
        iVar.ut0("bussinessId", this.f278912I);
        iVar.ut0(MidasActivityAbility.AbsShare.TYPE_KEY, this.f278941r + "");
        iVar.ut0("hadLocation", this.f278935j.getShowFlag() + "");
        iVar.ut0("desc", this.f278931f.getText().toString());
        iVar.ut0("nextStep", this.f278939p0 + "");
        iVar.ut0("beforeStep", this.f278948x0 + "");
        iVar.ut0("ContactTagCount", this.f278905B + "");
        iVar.ut0("mIsBlackGroup", this.f278907D + "");
        if (this.f278904A != null) {
            str = this.f278904A.size() + "";
        } else {
            str = "0";
        }
        iVar.ut0("mContactNameList", str);
        C95778f1 f1Var = this.f278944u;
        if (f1Var instanceof C95754d2) {
            C95754d2 d2Var = (C95754d2) f1Var;
            d2Var.getClass();
            SnsMethodCalculate.markStartTimeMs("getPathsSourceMap", "com.tencent.mm.plugin.sns.ui.PicWidget");
            HashMap hashMap = new HashMap();
            d2$$j d2__j = d2Var.f279310c;
            if (d2__j != null && !d2$$j.m122603a(d2__j).isEmpty()) {
                Iterator it = d2$$j.m122603a(d2Var.f279310c).iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    d2$$j d2__j2 = d2Var.f279310c;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                    Map<String, Boolean> map2 = d2__j2.f279346b;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                    if (((Boolean) ((HashMap) map2).get(str2)) != null) {
                        d2$$j d2__j3 = d2Var.f279310c;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                        Map<String, Boolean> map3 = d2__j3.f279346b;
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                        hashMap.put(str2, (Boolean) ((HashMap) map3).get(str2));
                    }
                }
            }
            d2$$j d2__j4 = d2Var.f279310c;
            if (d2__j4 != null) {
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                map = d2__j4.f279346b;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
            } else {
                map = null;
            }
            SnsMethodCalculate.markEndTimeMs("getPathsSourceMap", "com.tencent.mm.plugin.sns.ui.PicWidget");
            if (map != null && !map.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (Boolean booleanValue : map.values()) {
                    sb.append(booleanValue.booleanValue() ? 1 : 2);
                    sb.append("#");
                }
                iVar.ut0("picSource", sb.toString());
            }
        }
        C95778f1 f1Var2 = this.f278944u;
        if (f1Var2 instanceof NewSightWidget) {
            NewSightWidget newSightWidget = (NewSightWidget) f1Var2;
            newSightWidget.getClass();
            SnsMethodCalculate.markStartTimeMs("isLocalCaptureVideo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            C101783gu2 gu22 = newSightWidget.f277059m;
            boolean z = gu22 != null ? gu22.f298309e : false;
            SnsMethodCalculate.markEndTimeMs("isLocalCaptureVideo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            iVar.ut0("sightSource", z ? "1" : "2");
        }
        SnsMethodCalculate.markEndTimeMs("reportSnsPostInfo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* renamed from: W7 */
    public boolean mo133084W7() {
        SnsMethodCalculate.markStartTimeMs("resetFooter", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        Log.m105924i("MicroMsg.SnsUploadUI", "resetFooter: ");
        hideVKB();
        if (this.f278937o.mo98022b()) {
            this.f278937o.mo98025g();
            SnsMethodCalculate.markEndTimeMs("resetFooter", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("resetFooter", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return false;
    }

    /* renamed from: X7 */
    public void mo133085X7(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("resetWidget", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        Log.m105924i("MicroMsg.SnsUploadUI", "resetWidget");
        DynamicGridView dynamicGridView = this.f278940q;
        if (dynamicGridView != null) {
            dynamicGridView.setVisibility(8);
        }
        LinearLayout linearLayout = this.f278932g;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.f278932g.setVisibility(8);
        }
        C95778f1 f1Var = this.f278944u;
        if (f1Var != null) {
            f1Var.mo132129g();
        }
        mo133080R7();
        mo133074L7(bundle);
        SnsMethodCalculate.markEndTimeMs("resetWidget", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* renamed from: Y7 */
    public void mo133086Y7(Intent intent) {
        List list;
        final List list2;
        SnsMethodCalculate.markStartTimeMs("setRange", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f278936n.mo132078b(5, -1, intent, this.f278934i);
        this.f278934i.mo132067g(this.f278936n.getLabelRange() == 0);
        int intExtra = intent.getIntExtra("Ktag_range_index", 0);
        if (intExtra >= 2) {
            this.f278945v = intent.getStringExtra("Klabel_name_list");
            this.f278946w = intent.getStringExtra("KNew_label_name_list");
            this.f278947x = intent.getStringExtra("Kother_user_name_list");
            this.f278949y = intent.getStringExtra("Kchat_room_name_list");
            this.f278951z = intent.getStringArrayListExtra("label_id");
            List list3 = null;
            if (!Util.isNullOrNil(this.f278945v)) {
                list = Arrays.asList(this.f278945v.split(","));
                Log.m105925i("MicroMsg.SnsUploadUI", "[setRange] mLabelNameList size:%d", Integer.valueOf(list.size()));
            } else {
                list = null;
            }
            if (!Util.isNullOrNil(this.f278947x)) {
                Log.m105919d("MicroMsg.SnsUploadUI", "[setRange] mOtherUserNameList:%s", this.f278947x);
                list2 = Arrays.asList(this.f278947x.split(","));
                SnsReportHelper.f275506m0.mo131364Y(list2);
            } else {
                list2 = null;
            }
            if (!Util.isNullOrNil(this.f278946w)) {
                if (list2 == null) {
                    list2 = Arrays.asList(this.f278946w.split(","));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(list2);
                    arrayList.addAll(Arrays.asList(this.f278946w.split(",")));
                    list2 = arrayList;
                }
            }
            if (!Util.isNullOrNil(this.f278949y)) {
                list3 = Arrays.asList(this.f278949y.split(","));
            }
            final List list4 = list3;
            if (Util.isNullOrNil((List) this.f278951z)) {
                this.f278951z = new ArrayList<>();
            }
            Log.m105925i("MicroMsg.SnsUploadUI", "[setRange] mLabelIdList:%s", this.f278951z);
            final List list5 = list;
            final int i = intExtra;
            C94866e1.my0().post(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:138:0x0444  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r23 = this;
                        r0 = r23
                        java.lang.String r1 = "run"
                        java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsUploadUI$20"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                        java.lang.String r3 = "enableNewLabelRangeControl"
                        java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                        f40.o r5 = f40.C86709a0.m107535s()
                        com.tencent.mm.storage.v1 r5 = r5.mo121142i()
                        com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_GROUP_INT_SYNC
                        r7 = 0
                        int r5 = r5.mo119689j(r6, r7)
                        r6 = 2
                        r8 = 1
                        if (r5 == 0) goto L_0x0048
                        java.lang.String r9 = "MicroMsg.SnsLabelRangeConfig"
                        if (r5 == r6) goto L_0x0038
                        boolean r5 = mt2.C47101a.f126572a
                        if (r5 == 0) goto L_0x0033
                        java.lang.String r5 = "enableNewLabelRangeControl false"
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
                        mt2.C47101a.f126572a = r7
                    L_0x0033:
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                        r5 = 0
                        goto L_0x004d
                    L_0x0038:
                        boolean r5 = mt2.C47101a.f126572a
                        if (r5 != 0) goto L_0x0043
                        java.lang.String r5 = "enableNewLabelRangeControl true"
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
                        mt2.C47101a.f126572a = r8
                    L_0x0043:
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                        r5 = 1
                        goto L_0x004d
                    L_0x0048:
                        boolean r5 = mt2.C47101a.f126572a
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    L_0x004d:
                        java.lang.String r3 = ";"
                        java.lang.String r4 = "MicroMsg.SnsUploadUI"
                        java.lang.String r9 = "access$2400"
                        java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.SnsUploadUI"
                        if (r5 != 0) goto L_0x016f
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.this
                        java.util.List r11 = r8
                        java.util.List r12 = r9
                        int r13 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.f278903Q0
                        java.lang.String r13 = "access$2200"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r10)
                        r5.getClass()
                        java.lang.String r14 = "getContactNamesFromLabelsAndOtherUserName"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r10)
                        java.util.ArrayList r15 = new java.util.ArrayList
                        r15.<init>()
                        r5.f278904A = r15
                        r5.f278905B = r7
                        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r15 = r5.f278917N
                        r15.clear()
                        if (r11 == 0) goto L_0x0114
                        int r15 = r11.size()
                        if (r15 <= 0) goto L_0x0114
                        java.util.Iterator r15 = r11.iterator()
                        java.util.HashSet r6 = new java.util.HashSet
                        r6.<init>()
                    L_0x008b:
                        boolean r17 = r15.hasNext()
                        if (r17 == 0) goto L_0x0108
                        java.lang.Object r17 = r15.next()
                        r7 = r17
                        java.lang.String r7 = (java.lang.String) r7
                        b22.b r17 = b22.C28250a.m38138a()
                        b22.b r19 = b22.C28250a.m38138a()
                        r8 = r19
                        a22.a r8 = (a22.C67001a) r8
                        java.lang.String r8 = r8.mo90968f(r7)
                        r19 = r15
                        r15 = r17
                        a22.a r15 = (a22.C67001a) r15
                        java.util.List r8 = r15.mo90973k(r8)
                        if (r8 == 0) goto L_0x00fe
                        int r15 = r8.size()
                        if (r15 != 0) goto L_0x00bc
                        goto L_0x00fe
                    L_0x00bc:
                        java.util.Iterator r15 = r8.iterator()
                    L_0x00c0:
                        boolean r17 = r15.hasNext()
                        if (r17 == 0) goto L_0x00ee
                        java.lang.Object r17 = r15.next()
                        r20 = r15
                        r15 = r17
                        java.lang.String r15 = (java.lang.String) r15
                        r6.add(r15)
                        r17 = r1
                        int r1 = r5.f278905B
                        r21 = r2
                        r2 = 1
                        int r1 = r1 + r2
                        r5.f278905B = r1
                        java.lang.Object[] r1 = new java.lang.Object[r2]
                        r2 = 0
                        r1[r2] = r15
                        java.lang.String r2 = "dz:name : %s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r2, r1)
                        r1 = r17
                        r15 = r20
                        r2 = r21
                        goto L_0x00c0
                    L_0x00ee:
                        r17 = r1
                        r21 = r2
                        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r1 = r5.f278917N
                        r1.put(r7, r8)
                        r1 = r17
                        r15 = r19
                        r7 = 0
                        r8 = 1
                        goto L_0x008b
                    L_0x00fe:
                        r17 = r1
                        r21 = r2
                        java.lang.String r1 = "dz: getContactNamesFromLabelsAndOtherUserName,namelist get bu label is null"
                        com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
                        goto L_0x010c
                    L_0x0108:
                        r17 = r1
                        r21 = r2
                    L_0x010c:
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r1.<init>(r6)
                        r5.f278904A = r1
                        goto L_0x0118
                    L_0x0114:
                        r17 = r1
                        r21 = r2
                    L_0x0118:
                        if (r11 == 0) goto L_0x0136
                        java.util.Iterator r1 = r11.iterator()
                        r2 = 0
                    L_0x011f:
                        boolean r6 = r1.hasNext()
                        if (r6 == 0) goto L_0x0134
                        java.lang.Object r6 = r1.next()
                        java.lang.String r6 = (java.lang.String) r6
                        boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                        if (r6 != 0) goto L_0x011f
                        int r2 = r2 + 1
                        goto L_0x011f
                    L_0x0134:
                        r5.f278905B = r2
                    L_0x0136:
                        r1 = 0
                        r5.f278906C = r1
                        if (r12 == 0) goto L_0x0165
                        int r1 = r12.size()
                        if (r1 <= 0) goto L_0x0165
                        java.util.Iterator r1 = r12.iterator()
                    L_0x0145:
                        boolean r2 = r1.hasNext()
                        if (r2 == 0) goto L_0x0165
                        java.lang.Object r2 = r1.next()
                        java.lang.String r2 = (java.lang.String) r2
                        java.util.ArrayList<java.lang.String> r6 = r5.f278904A
                        boolean r6 = r6.contains(r2)
                        if (r6 != 0) goto L_0x0145
                        java.util.ArrayList<java.lang.String> r6 = r5.f278904A
                        r6.add(r2)
                        int r2 = r5.f278906C
                        r6 = 1
                        int r2 = r2 + r6
                        r5.f278906C = r2
                        goto L_0x0145
                    L_0x0165:
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r10)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r10)
                        r20 = r3
                        goto L_0x0296
                    L_0x016f:
                        r17 = r1
                        r21 = r2
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.this
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        int r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.f278903Q0
                        java.lang.String r5 = "access$2302"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r10)
                        r1.f278904A = r2
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r10)
                        java.util.List r1 = r9
                        boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
                        if (r1 != 0) goto L_0x019f
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.this
                        java.util.ArrayList r2 = new java.util.ArrayList
                        java.util.List r6 = r9
                        r2.<init>(r6)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r10)
                        r1.f278904A = r2
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r10)
                    L_0x019f:
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.this
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
                        java.util.ArrayList<java.lang.String> r2 = r1.f278951z
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
                        int r5 = r10
                        java.lang.String r6 = "access$2500"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r10)
                        java.lang.String r7 = "updateLabelReportStructByLabelIdList"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r10)
                        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r8 = r1.f278917N
                        r8.clear()
                        if (r2 == 0) goto L_0x028e
                        int r8 = r2.size()
                        if (r8 <= 0) goto L_0x028e
                        java.util.Iterator r2 = r2.iterator()
                        com.tencent.mm.plugin.sns.statistics.SnsReportHelper r8 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
                        java.util.Set r8 = r8.mo131393z(r5)
                        if (r8 != 0) goto L_0x01d4
                        java.util.HashSet r8 = new java.util.HashSet
                        r8.<init>()
                    L_0x01d4:
                        r11 = 0
                    L_0x01d5:
                        boolean r12 = r2.hasNext()
                        if (r12 == 0) goto L_0x026c
                        java.lang.Object r12 = r2.next()
                        java.lang.String r12 = (java.lang.String) r12
                        b22.b r13 = b22.C28250a.m38138a()
                        a22.a r13 = (a22.C67001a) r13
                        java.util.List r13 = r13.mo90973k(r12)
                        if (r13 == 0) goto L_0x0257
                        int r14 = r13.size()
                        if (r14 != 0) goto L_0x01f4
                        goto L_0x0257
                    L_0x01f4:
                        b22.b r14 = b22.C28250a.m38138a()
                        a22.a r14 = (a22.C67001a) r14
                        java.lang.String r14 = r14.mo90970h(r12)
                        java.util.Iterator r15 = r13.iterator()
                        r19 = r2
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                    L_0x0209:
                        boolean r20 = r15.hasNext()
                        if (r20 == 0) goto L_0x0222
                        java.lang.Object r20 = r15.next()
                        r22 = r15
                        r15 = r20
                        java.lang.String r15 = (java.lang.String) r15
                        r2.append(r15)
                        r2.append(r3)
                        r15 = r22
                        goto L_0x0209
                    L_0x0222:
                        r15 = 3
                        java.lang.Object[] r15 = new java.lang.Object[r15]
                        r18 = 0
                        r15[r18] = r12
                        r20 = r3
                        r3 = 1
                        r15[r3] = r14
                        java.lang.String r2 = r2.toString()
                        r16 = 2
                        r15[r16] = r2
                        java.lang.String r2 = "[updateLabelReportStructByLabelIdList]:labelId:%s;  labelName:%s;  members name: %s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r2, r15)
                        if (r14 != 0) goto L_0x0247
                        java.lang.Object[] r2 = new java.lang.Object[r3]
                        r2[r18] = r12
                        java.lang.String r3 = "[updateLabelReportStructByLabelIdList] labelName empty, labelId is %s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r3, r2)
                        goto L_0x0254
                    L_0x0247:
                        boolean r2 = r8.contains(r12)
                        if (r2 == 0) goto L_0x024f
                        int r11 = r11 + 1
                    L_0x024f:
                        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r2 = r1.f278917N
                        r2.put(r14, r13)
                    L_0x0254:
                        r2 = 1
                        r13 = 0
                        goto L_0x0266
                    L_0x0257:
                        r19 = r2
                        r20 = r3
                        r2 = 1
                        java.lang.Object[] r3 = new java.lang.Object[r2]
                        r13 = 0
                        r3[r13] = r12
                        java.lang.String r12 = "[updateLabelReportStructByLabelIdList] namList empty, labelId is %s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r12, r3)
                    L_0x0266:
                        r2 = r19
                        r3 = r20
                        goto L_0x01d5
                    L_0x026c:
                        r20 = r3
                        r2 = 1
                        r3 = 2
                        r13 = 0
                        java.lang.Object[] r1 = new java.lang.Object[r3]
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                        r1[r13] = r3
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
                        r1[r2] = r3
                        java.lang.String r2 = "updateLabelReportStructByLabelIdList: selectVisibleState:%d, matchCountFromSearch:%d"
                        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
                        com.tencent.mm.plugin.sns.statistics.SnsReportHelper r1 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
                        com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct r1 = r1.mo131344E()
                        r1.f266373M = r11
                        goto L_0x0290
                    L_0x028e:
                        r20 = r3
                    L_0x0290:
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r10)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r10)
                    L_0x0296:
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.this
                        java.util.List r2 = r11
                        int r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.f278903Q0
                        java.lang.String r3 = "access$2600"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r10)
                        r1.getClass()
                        java.lang.String r5 = "getContactNamesFromChatroom"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r10)
                        if (r2 == 0) goto L_0x0354
                        boolean r6 = r2.isEmpty()
                        if (r6 == 0) goto L_0x02b3
                        goto L_0x0354
                    L_0x02b3:
                        java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6 = r1.f278918P
                        java.util.HashMap r6 = (java.util.HashMap) r6
                        r6.clear()
                        java.util.Iterator r2 = r2.iterator()
                    L_0x02be:
                        boolean r6 = r2.hasNext()
                        if (r6 == 0) goto L_0x0350
                        java.lang.Object r6 = r2.next()
                        java.lang.String r6 = (java.lang.String) r6
                        java.util.ArrayList r7 = new java.util.ArrayList
                        r7.<init>()
                        java.lang.Class<wo.b> r8 = p740wo.C53193b.class
                        di3.d r8 = di3.C86312j.m106911c(r8)
                        wo.b r8 = (p740wo.C53193b) r8
                        java.util.List r8 = r8.mo73728mX(r6)
                        if (r8 != 0) goto L_0x02de
                        goto L_0x02be
                    L_0x02de:
                        r11 = 2
                        java.lang.Object[] r12 = new java.lang.Object[r11]
                        r11 = 0
                        r12[r11] = r6
                        int r11 = r8.size()
                        java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                        r13 = 1
                        r12[r13] = r11
                        java.lang.String r11 = "getContactNamesFromChatroom chatromm:%s membersCount:%s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r11, r12)
                        java.util.Iterator r8 = r8.iterator()
                    L_0x02f8:
                        boolean r11 = r8.hasNext()
                        if (r11 == 0) goto L_0x0331
                        java.lang.Object r11 = r8.next()
                        java.lang.String r11 = (java.lang.String) r11
                        java.util.ArrayList<java.lang.String> r12 = r1.f278904A
                        boolean r12 = r12.contains(r11)
                        if (r12 != 0) goto L_0x0327
                        boolean r12 = eb0.C45628s0.m50740E(r11)
                        if (r12 == 0) goto L_0x0327
                        r12 = 1
                        java.lang.Object[] r13 = new java.lang.Object[r12]
                        r14 = 0
                        r13[r14] = r11
                        java.lang.String r14 = "getContactNamesFromChatroom memberName:%s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r14, r13)
                        java.util.ArrayList<java.lang.String> r13 = r1.f278904A
                        r13.add(r11)
                        int r13 = r1.f278906C
                        int r13 = r13 + r12
                        r1.f278906C = r13
                    L_0x0327:
                        boolean r12 = eb0.C45628s0.m50740E(r11)
                        if (r12 == 0) goto L_0x02f8
                        r7.add(r11)
                        goto L_0x02f8
                    L_0x0331:
                        r11 = 2
                        java.lang.Object[] r8 = new java.lang.Object[r11]
                        r12 = 0
                        r8[r12] = r6
                        int r12 = r7.size()
                        java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                        r13 = 1
                        r8[r13] = r12
                        java.lang.String r12 = "%s , %s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r12, r8)
                        java.util.Map<java.lang.String, java.util.List<java.lang.String>> r8 = r1.f278918P
                        java.util.HashMap r8 = (java.util.HashMap) r8
                        r8.put(r6, r7)
                        goto L_0x02be
                    L_0x0350:
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r10)
                        goto L_0x0357
                    L_0x0354:
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r10)
                    L_0x0357:
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r10)
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.this
                        java.lang.String r2 = "access$2700"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r10)
                        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r1 = r1.f278917N
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
                        java.lang.String r3 = "|"
                        java.lang.String r5 = "com.tencent.mm.plugin.sns.statistics.SnsReportHelper"
                        if (r1 == 0) goto L_0x042f
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.this
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r10)
                        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r1 = r1.f278917N
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
                        boolean r1 = r1.isEmpty()
                        if (r1 != 0) goto L_0x042f
                        com.tencent.mm.plugin.sns.statistics.SnsReportHelper r1 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.this
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r10)
                        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r4 = r4.f278917N
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.this
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
                        java.util.ArrayList<java.lang.String> r2 = r2.f278951z
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
                        r1.getClass()
                        java.lang.String r6 = "updateSelectedLabelReport"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
                        if (r4 == 0) goto L_0x0412
                        boolean r7 = r4.isEmpty()
                        if (r7 != 0) goto L_0x0412
                        com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct r7 = r1.f275557n
                        if (r7 == 0) goto L_0x0412
                        java.util.Set r8 = r4.keySet()
                        int r8 = r8.size()
                        r7.f266394w = r8
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.util.Set r8 = r4.entrySet()
                        java.util.Iterator r8 = r8.iterator()
                    L_0x03bf:
                        boolean r9 = r8.hasNext()
                        if (r9 == 0) goto L_0x03ec
                        java.lang.Object r9 = r8.next()
                        java.util.Map$Entry r9 = (java.util.Map.Entry) r9
                        java.lang.Object r11 = r9.getValue()
                        java.util.List r11 = (java.util.List) r11
                        if (r11 == 0) goto L_0x03bf
                        java.lang.Object r9 = r9.getKey()
                        java.lang.String r9 = (java.lang.String) r9
                        r7.append(r9)
                        r7.append(r3)
                        int r9 = r11.size()
                        r7.append(r9)
                        r9 = r20
                        r7.append(r9)
                        goto L_0x03bf
                    L_0x03ec:
                        r9 = r20
                        r11 = 1
                        java.lang.Object[] r8 = new java.lang.Object[r11]
                        int r4 = r4.size()
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                        r12 = 0
                        r8[r12] = r4
                        java.lang.String r4 = "MicroMsg.SnsReportHelper"
                        java.lang.String r12 = "[updateSelectedLabelReport] SelectedLabelList size:%d"
                        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r12, r8)
                        com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct r4 = r1.f275557n
                        java.lang.String r7 = r7.toString()
                        java.lang.String r8 = "SelectedLabelList"
                        java.lang.String r7 = r4.mo86045b(r8, r7, r11)
                        r4.f266395x = r7
                        goto L_0x0414
                    L_0x0412:
                        r9 = r20
                    L_0x0414:
                        boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)
                        if (r4 != 0) goto L_0x042b
                        com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct r1 = r1.f275557n
                        if (r1 == 0) goto L_0x042b
                        java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r2, r9)
                        java.lang.String r4 = "SelectedLabelidList"
                        r7 = 1
                        java.lang.String r2 = r1.mo86045b(r4, r2, r7)
                        r1.f266363C = r2
                    L_0x042b:
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
                        goto L_0x0436
                    L_0x042f:
                        r9 = r20
                        java.lang.String r1 = "[setRange] setLabelReportStruct failed, labelReportStruct empty!!"
                        com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r1)
                    L_0x0436:
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.this
                        java.lang.String r2 = "access$2800"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r10)
                        java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r1.f278918P
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
                        if (r1 == 0) goto L_0x04cd
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.this
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r10)
                        java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r1.f278918P
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
                        java.util.HashMap r1 = (java.util.HashMap) r1
                        boolean r1 = r1.isEmpty()
                        if (r1 != 0) goto L_0x04cd
                        com.tencent.mm.plugin.sns.statistics.SnsReportHelper r1 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI r4 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.this
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r10)
                        java.util.Map<java.lang.String, java.util.List<java.lang.String>> r4 = r4.f278918P
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
                        r1.getClass()
                        java.lang.String r2 = "updateSelectedChatroomReport"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
                        if (r4 == 0) goto L_0x04ca
                        java.util.HashMap r4 = (java.util.HashMap) r4
                        boolean r6 = r4.isEmpty()
                        if (r6 != 0) goto L_0x04ca
                        com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct r6 = r1.f275557n
                        if (r6 == 0) goto L_0x04ca
                        java.util.Set r7 = r4.keySet()
                        int r7 = r7.size()
                        r6.f266388q = r7
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        java.util.Set r4 = r4.entrySet()
                        java.util.Iterator r4 = r4.iterator()
                    L_0x0490:
                        boolean r7 = r4.hasNext()
                        if (r7 == 0) goto L_0x04bb
                        java.lang.Object r7 = r4.next()
                        java.util.Map$Entry r7 = (java.util.Map.Entry) r7
                        java.lang.Object r8 = r7.getValue()
                        java.util.List r8 = (java.util.List) r8
                        if (r8 == 0) goto L_0x0490
                        java.lang.Object r7 = r7.getKey()
                        java.lang.String r7 = (java.lang.String) r7
                        r6.append(r7)
                        r6.append(r3)
                        int r7 = r8.size()
                        r6.append(r7)
                        r6.append(r9)
                        goto L_0x0490
                    L_0x04bb:
                        com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct r1 = r1.f275557n
                        java.lang.String r3 = r6.toString()
                        java.lang.String r4 = "SelectedChatroomList"
                        r6 = 1
                        java.lang.String r3 = r1.mo86045b(r4, r3, r6)
                        r1.f266389r = r3
                    L_0x04ca:
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
                    L_0x04cd:
                        r1 = r17
                        r2 = r21
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.C9568020.run():void");
                }
            });
            if (intExtra == 2) {
                this.f278907D = false;
            } else {
                this.f278907D = true;
            }
        } else if (!Util.isNullOrNil((List) this.f278904A)) {
            this.f278904A.clear();
        }
        SnsReportHelper.f275506m0.mo131365Z(intExtra);
        SnsMethodCalculate.markEndTimeMs("setRange", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* renamed from: Z7 */
    public void mo133087Z7(SightCaptureResult sightCaptureResult) {
        byte[] bArr;
        SnsMethodCalculate.markStartTimeMs("talkVideo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        String str = sightCaptureResult.f201517g;
        String str2 = sightCaptureResult.f201518h;
        getIntent().putExtra("KSightThumbPath", sightCaptureResult.f201518h);
        getIntent().putExtra("KSnsFrom", 17);
        String q = !Util.isNullOrNil(sightCaptureResult.f201520j) ? sightCaptureResult.f201520j : C86013q1.m106456q(str);
        try {
            bArr = sightCaptureResult.f201522o.toByteArray();
        } catch (Exception e) {
            Log.m105925i("MicroMsg.SnsUploadUI", "put sight extinfo to snsuploadui error: %s", e.getMessage());
            bArr = null;
        }
        mo133090c8(str, str2, q, bArr, true, true);
        mo133085X7((Bundle) null);
        SnsMethodCalculate.markEndTimeMs("talkVideo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* renamed from: a8 */
    public void mo133088a8() {
        SnsMethodCalculate.markStartTimeMs("updateNavState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        C95778f1 f1Var = this.f278944u;
        boolean z = f1Var != null && f1Var.mo132130h();
        enableOptionMenu(z);
        Log.m105925i("MicroMsg.SnsUploadUI", "updateNavState: enableOptionMenu=%b", Boolean.valueOf(z));
        SnsMethodCalculate.markEndTimeMs("updateNavState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* renamed from: b8 */
    public void mo133089b8(String str, boolean z, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2, int i2) {
        SnsMethodCalculate.markStartTimeMs("updatePicConfig", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        Log.m105924i("MicroMsg.SnsUploadUI", "updatePicConfig");
        getIntent().getExtras().clear();
        getIntent().putExtra("KTouchCameraTime", Util.nowSecond());
        getIntent().putExtra("KSnsPostManu", true);
        getIntent().putExtra("Ksnsupload_type", 0);
        getIntent().putExtra("KFilterId", i);
        if (!Util.isNullOrNil(str)) {
            getIntent().putExtra("sns_kemdia_path", str);
        }
        if (!Util.isNullOrNil((List) arrayList)) {
            getIntent().putExtra("sns_kemdia_path_list", arrayList);
        }
        if (!Util.isNullOrNil((List) arrayList2)) {
            getIntent().putStringArrayListExtra("sns_media_latlong_list", arrayList2);
        }
        if (z) {
            getIntent().putExtra("Kis_take_photo", z);
        }
        if (i2 != 0) {
            getIntent().putExtra("Ksnsupload_source", 11);
        }
        SnsMethodCalculate.markEndTimeMs("updatePicConfig", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    /* renamed from: c8 */
    public void mo133090c8(String str, String str2, String str3, byte[] bArr, boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("updateSightConfig", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        Log.m105924i("MicroMsg.SnsUploadUI", "updateSightConfig");
        getIntent().getExtras().clear();
        getIntent().putExtra("KSightPath", str);
        getIntent().putExtra("KSightThumbPath", str2);
        getIntent().putExtra("sight_md5", str3);
        getIntent().putExtra("KSnsPostManu", true);
        getIntent().putExtra("Ksnsupload_type", 14);
        getIntent().putExtra("Kis_take_photo", z2);
        getIntent().putExtra("KMMSightExtInfo", bArr);
        if (z) {
            Intent intent = getIntent();
            intent.putExtra("KSessionID", Util.nowMilliSecond() + "_" + Util.getRandomString(5));
        }
        SnsMethodCalculate.markEndTimeMs("updateSightConfig", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        boolean n0 = C85875k4.m106197n0();
        int i = C0966R.C0971layout.d5q;
        if (!n0 || !C85875k4.m106208w()) {
            Log.m105924i("MicroMsg.SnsUploadUI", "getLayoutId: use v2 layout, no magic window");
        } else if (C11171e.m11046c(30) && C85878m2.m106212a(MMApplicationContext.getContext())) {
            Log.m105924i("MicroMsg.SnsUploadUI", "getLayoutId: use v2 layout large");
            SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return i;
        } else if ((C85875k4.m106154K(getTaskId()) || (C85875k4.m106155L(getContentResolver()) && Build.VERSION.SDK_INT >= 24 && !isInMultiWindowMode())) && !C85878m2.m106213b(getTaskId())) {
            Log.m105924i("MicroMsg.SnsUploadUI", "getLayoutId: use v2 layout large");
            SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return i;
        } else {
            Log.m105924i("MicroMsg.SnsUploadUI", "getLayoutId: use v2 layout");
        }
        i = C0966R.C0971layout.d5r;
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return i;
    }

    public boolean isCallSuperOnSaveInstanceState() {
        SnsMethodCalculate.markStartTimeMs("isCallSuperOnSaveInstanceState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        boolean z = true;
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_media_opt_saveinstance, true);
        boolean z2 = C85875k4.m106157N() || C85875k4.m106210y();
        if (!wf || !z2) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isCallSuperOnSaveInstanceState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return z;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        int i4 = i;
        int i5 = i2;
        Intent intent2 = intent;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onActivityResult(i, i2, intent);
        C60960c.C60961a aVar = C60960c.f173618a;
        aVar.mo85927k("SnsPublishProcess", "editPageTimes", 1, C60242i.APPEND);
        C57354l.C57355a aVar2 = C57354l.f164333a;
        SnsMethodCalculate.markStartTimeMs("addTraceFromRequestCode", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        switch (i4) {
            case 5:
                i3 = 4;
                break;
            case 6:
                i3 = 3;
                break;
            case 7:
                i3 = 6;
                break;
            case 9:
                i3 = 7;
                break;
            case 10:
                i3 = 2;
                break;
            case 11:
                i3 = 8;
                break;
            case 12:
                i3 = 9;
                break;
            default:
                i3 = -1;
                break;
        }
        if (i3 != -1) {
            aVar.mo85927k("SnsPublishProcess", "actionTrace_", Integer.valueOf(i3), C60242i.ACTIONTRACE);
        }
        SnsMethodCalculate.markEndTimeMs("addTraceFromRequestCode", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        C74974a aVar3 = this.f278931f;
        if (aVar3 != null) {
            aVar3.clearFocus();
        }
        if (i5 != -1) {
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        } else if (i4 == 30764) {
            Bundle bundleExtra = intent2.getBundleExtra("result_data");
            if (bundleExtra != null && bundleExtra.getString("go_next", "").equals("gdpr_auth_location")) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, Boolean.TRUE);
                ((C103918d) C86312j.m106911c(C103918d.class)).mo125790zt(getContext(), "android.permission.ACCESS_FINE_LOCATION", 64);
            }
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        } else {
            if (this.f278944u.onActivityResult(i4, i5, intent2)) {
                mo133088a8();
            }
            if (i4 != 5) {
                boolean z = false;
                if (i4 != 6) {
                    if (i4 != 8) {
                        if (i4 == 10) {
                            if (intent2 == null) {
                                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                                return;
                            }
                            String nullAs = Util.nullAs(intent2.getStringExtra("get_poi_name"), "");
                            String nullAs2 = Util.nullAs(intent2.getStringExtra("get_city"), "");
                            if (Util.isNullOrNil(nullAs)) {
                                getIntent().removeExtra("get_poi_name");
                            }
                            if (Util.isNullOrNil(nullAs2)) {
                                getIntent().removeExtra("get_city");
                            }
                            getIntent().putExtras(intent.getExtras());
                            this.f278935j.mo132185d(i4, i5, intent2);
                        }
                    } else if (intent2 == null) {
                        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                        return;
                    } else {
                        this.f278938p.mo133061a(intent2.getBooleanExtra("bind_facebook_succ", false));
                    }
                } else if (intent2 == null) {
                    SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                    return;
                } else {
                    getIntent().putExtras(intent.getExtras());
                    AtContactWidget atContactWidget = this.f278934i;
                    if (this.f278936n.getLabelRange() == 0) {
                        z = true;
                    }
                    atContactWidget.mo132065e(i4, i5, intent2, z);
                    this.f278936n.f276688d = !Util.isNullOrNil(intent2.getStringExtra("Select_Contact"));
                }
            } else if (intent2 == null) {
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                return;
            } else {
                getIntent().putExtras(intent.getExtras());
                mo133086Y7(intent2);
            }
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x065d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x065f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x06ec  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x06ee  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0721  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x07f9  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x07fc  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x080a  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x080d  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x081b  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x081e  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x087b A[SYNTHETIC, Splitter:B:192:0x087b] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x04be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r8 = r27
            r0 = r28
            java.lang.String r9 = "onCreate"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.SnsUploadUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            java.lang.String r11 = "MicroMsg.SnsUploadUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r9)
            k21.c$a r12 = k21.C60960c.f173618a
            r13 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            i21.i r2 = i21.C60242i.APPEND
            java.lang.String r14 = "SnsPublishProcess"
            java.lang.String r3 = "editPageTimes"
            r12.mo85927k(r14, r3, r1, r2)
            r1 = 109(0x6d, float:1.53E-43)
            r8.supportRequestWindowFeature(r1)
            if (r0 == 0) goto L_0x0038
            java.lang.Class<rw.l> r1 = p232rw.C77572l.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            rw.l r1 = (p232rw.C77572l) r1
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$$a r2 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$$a
            r2.<init>(r8)
            r1.mo107611FI(r8, r0, r2)
        L_0x0038:
            super.onCreate(r28)
            com.tencent.mm.plugin.sns.statistics.x r1 = com.tencent.p014mm.plugin.sns.statistics.C95005x.f275632a
            java.lang.String r1 = "initReport"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = vr2.C102236a0.m134754l()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "setPostSessionId >> currentPostSessionId: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = ", lastPostSessionId: "
            r4.append(r5)
            java.lang.String r5 = com.tencent.p014mm.plugin.sns.statistics.C95005x.f275633b
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.SnsVideoPublishReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            java.lang.String r4 = "currentPostSessionId"
            gy3.C87412m.m108593f(r3, r4)
            com.tencent.p014mm.plugin.sns.statistics.C95005x.f275633b = r3
            com.tencent.mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct r4 = com.tencent.p014mm.plugin.sns.statistics.C95005x.f275634c
            java.lang.String r5 = "sessionid"
            java.lang.String r3 = r4.mo86045b(r5, r3, r13)
            r4.f266237d = r3
            com.tencent.mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct r3 = com.tencent.p014mm.plugin.sns.statistics.C95005x.f275634c
            r15 = 0
            r3.f266239f = r15
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            com.tencent.mm.plugin.sns.statistics.l$a r7 = com.tencent.p014mm.plugin.sns.statistics.C57354l.f164333a
            r7.mo80972i()
            ks2.z r1 = r27.mo133078P7()
            java.lang.String r2 = vr2.C102236a0.m134754l()
            r1.getClass()
            java.lang.String r3 = "setPostSessionId"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.String r5 = "<set-?>"
            gy3.C87412m.m108594g(r2, r5)
            r1.f290904a = r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            java.lang.String r1 = vr2.C102236a0.m134754l()
            java.lang.String r2 = "SnsTemplate"
            java.lang.String r3 = "sessionID"
            r12.mo85926j(r2, r3, r1)
            androidx.appcompat.app.AppCompatActivity r1 = r27.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099650(0x7f060002, float:1.781166E38)
            int r1 = r1.getColor(r2)
            r8.setActionbarColor(r1)
            androidx.appcompat.app.AppCompatActivity r1 = r27.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            r8.setNavigationbarColor(r1)
            r27.hideActionbarLine()
            android.content.Intent r1 = r27.getIntent()
            java.lang.Class r2 = r27.getClass()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r1.setExtrasClassLoader(r2)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r8.mo133081S7(r1)
            os2.b0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Wx0()
            r1.getClass()
            java.lang.String r2 = "removeDeprecatedDraft"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.SnsDraftStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r1.f94545d
            r6 = 3
            java.lang.String[] r4 = new java.lang.String[r6]
            java.lang.String r5 = "draft_text"
            r4[r15] = r5
            java.lang.String r5 = "draft_normal"
            r4[r13] = r5
            long r16 = java.lang.System.currentTimeMillis()
            r18 = 86400000(0x5265c00, double:4.2687272E-316)
            long r16 = r16 - r18
            java.lang.String r5 = java.lang.String.valueOf(r16)
            r6 = 2
            r4[r6] = r5
            java.lang.String r5 = "snsDraft"
            java.lang.String r6 = "key!=? AND key!=? AND timestamp<?"
            r1.delete(r5, r6, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            android.content.Intent r1 = r27.getIntent()
            java.lang.String r2 = "Kis_retry_edit"
            boolean r1 = r1.getBooleanExtra(r2, r15)
            r8.f278920R = r1
            java.lang.String r1 = "checkLinkWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r10)
            android.content.Intent r2 = r27.getIntent()
            java.lang.String r3 = "Ksnsupload_type"
            int r2 = r2.getIntExtra(r3, r15)
            java.lang.String r3 = ""
            r4 = 11
            r15 = 21
            r6 = 23
            r5 = 0
            if (r2 == r13) goto L_0x01a8
            r13 = 2
            if (r2 == r13) goto L_0x0194
            if (r2 == r4) goto L_0x0191
            if (r2 == r15) goto L_0x0191
            if (r2 == r6) goto L_0x0191
            r4 = 25
            if (r2 == r4) goto L_0x0194
            r4 = 27
            if (r2 == r4) goto L_0x0191
            r6 = 30
            if (r2 == r6) goto L_0x01ab
            switch(r2) {
                case 15: goto L_0x0161;
                case 16: goto L_0x01ab;
                case 17: goto L_0x01ab;
                default: goto L_0x015f;
            }
        L_0x015f:
            goto L_0x0267
        L_0x0161:
            android.content.Intent r2 = r27.getIntent()
            java.lang.String r4 = "fav_note_xml"
            java.lang.String r2 = r2.getStringExtra(r4)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r4 = "favlocalid"
            java.util.Map r2 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r2, r4, r5)
            if (r2 == 0) goto L_0x0267
            int r4 = r2.size()
            if (r4 == 0) goto L_0x0267
            java.lang.String r4 = ".favlocalid"
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "0"
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r4)
            if (r4 != 0) goto L_0x0267
            r8.f278921S = r2
            goto L_0x0267
        L_0x0191:
            r6 = 30
            goto L_0x01ab
        L_0x0194:
            r6 = 30
            android.content.Intent r2 = r27.getIntent()
            java.lang.String r4 = "Ksnsupload_musicid"
            java.lang.String r2 = r2.getStringExtra(r4)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r3)
            r8.f278921S = r2
            goto L_0x0267
        L_0x01a8:
            r6 = 30
            r13 = 2
        L_0x01ab:
            android.content.Intent r2 = r27.getIntent()
            java.lang.String r4 = "Ksnsupload_link"
            java.lang.String r2 = r2.getStringExtra(r4)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r3)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 == 0) goto L_0x01cd
            android.content.Intent r2 = r27.getIntent()
            java.lang.String r4 = "ShareUrlOpen"
            java.lang.String r2 = r2.getStringExtra(r4)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r3)
        L_0x01cd:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 == 0) goto L_0x01e1
            android.content.Intent r2 = r27.getIntent()
            java.lang.String r4 = "ShareUrlOriginal"
            java.lang.String r2 = r2.getStringExtra(r4)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r3)
        L_0x01e1:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 != 0) goto L_0x0246
            java.lang.String r4 = "getDraftKeyForLinkFeed"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.data.SnsUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
            boolean r23 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r23 != 0) goto L_0x0240
            android.net.Uri r13 = android.net.Uri.parse(r2)
            if (r13 == 0) goto L_0x0240
            java.lang.String r15 = r13.getHost()
            java.lang.String r5 = vr2.C102236a0.f301041e
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r15, (java.lang.String) r5)
            if (r5 == 0) goto L_0x0241
            java.lang.String r2 = "__biz"
            java.lang.String r2 = r13.getQueryParameter(r2)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r5 = "mid"
            java.lang.String r5 = r13.getQueryParameter(r5)
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r3)
            java.lang.String r15 = "idx"
            java.lang.String r13 = r13.getQueryParameter(r15)
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r13, (java.lang.String) r3)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r2)
            java.lang.String r2 = "_"
            r15.append(r2)
            r15.append(r5)
            r15.append(r2)
            r15.append(r13)
            java.lang.String r2 = r15.toString()
            goto L_0x0241
        L_0x0240:
            r2 = r3
        L_0x0241:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
            r8.f278921S = r2
        L_0x0246:
            android.content.Intent r2 = r27.getIntent()
            java.lang.String r4 = "ksnsis_appbrand"
            r5 = 0
            boolean r2 = r2.getBooleanExtra(r4, r5)
            if (r2 == 0) goto L_0x0258
            r2 = 0
            r8.f278921S = r2
            goto L_0x0259
        L_0x0258:
            r2 = 0
        L_0x0259:
            android.content.Intent r4 = r27.getIntent()
            java.lang.String r6 = "KSnsIsUploadAdLandingPage"
            boolean r4 = r4.getBooleanExtra(r6, r5)
            if (r4 == 0) goto L_0x0267
            r8.f278921S = r2
        L_0x0267:
            java.lang.String r2 = r8.f278921S
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x029e
            boolean r2 = r8.f278920R
            if (r2 != 0) goto L_0x029e
            os2.b0 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Wx0()
            java.lang.String r4 = r8.f278921S
            os2.a0 r2 = r2.mo60188qq(r4)
            if (r2 == 0) goto L_0x029e
            byte[] r2 = r2.field_draft
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r2)
            if (r4 != 0) goto L_0x029e
            android.os.Parcel r4 = android.os.Parcel.obtain()
            int r5 = r2.length
            r6 = 0
            r4.unmarshall(r2, r6, r5)
            r4.setDataPosition(r6)
            android.os.Parcelable$Creator r2 = android.content.Intent.CREATOR
            java.lang.Object r2 = r2.createFromParcel(r4)
            android.content.Intent r2 = (android.content.Intent) r2
            r8.setIntent(r2)
        L_0x029e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r10)
            r27.mo133080R7()
            java.lang.Class<u73.n> r1 = u73.C101980n.class
            java.lang.String r13 = "initView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r10)
            r2 = 2131312857(0x7f0940d9, float:1.8244094E38)
            android.view.View r2 = r8.findViewById(r2)
            com.tencent.mm.plugin.sns.ui.WrapScollview r2 = (com.tencent.p014mm.plugin.sns.p106ui.WrapScollview) r2
            r8.f278929d = r2
            r2 = 2131313963(0x7f09452b, float:1.8246338E38)
            android.view.View r2 = r8.findViewById(r2)
            r8.f278930e = r2
            java.lang.String r2 = "customizeInputView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
            r2 = 2131313964(0x7f09452c, float:1.824634E38)
            android.view.View r2 = r8.findViewById(r2)
            com.tencent.mm.ui.widget.cedit.api.a r2 = (com.tencent.p014mm.p136ui.widget.cedit.api.C74974a) r2
            r8.f278931f = r2
            androidx.appcompat.app.AppCompatActivity r4 = r27.getContext()
            r5 = 2131165591(0x7f070197, float:1.7945403E38)
            int r4 = kg3.C76577a.m92155f(r4, r5)
            float r4 = (float) r4
            float r5 = kg3.C76577a.m92165p(r27)
            float r4 = r4 * r5
            r5 = 0
            r2.setTextSize(r5, r4)
            com.tencent.mm.ui.widget.cedit.api.a r2 = r8.f278931f
            jo3.c r2 = jo3.C76431c.m91853g(r2)
            int r4 = p645pj.C77092c.m93050l()
            r2.f225611e = r5
            r2.f225610d = r4
            r4 = 1
            r2.f225607a = r4
            r5 = 0
            r2.mo107499d(r5)
            com.tencent.mm.ui.widget.cedit.api.a r2 = r8.f278931f
            di3.d r5 = di3.C86312j.m106911c(r1)
            u73.n r5 = (u73.C101980n) r5
            boolean r5 = r5.Kr0()
            r2.mo104239a(r5)
            com.tencent.mm.ui.widget.cedit.api.a r2 = r8.f278931f
            android.os.Bundle r2 = r2.getInputExtras(r4)
            java.lang.String r5 = "wechat_scene"
            r6 = 3
            r2.putInt(r5, r6)
            com.tencent.mm.ui.widget.cedit.api.a r2 = r8.f278931f
            android.os.Bundle r2 = r2.getInputExtras(r4)
            java.lang.String r5 = "if_support_wx_emoji"
            r2.putBoolean(r5, r4)
            java.lang.String r2 = "initSelectHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r10)
            vo3.f r4 = r27.getBounceView()
            if (r4 == 0) goto L_0x033a
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$14 r5 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$14
            r5.<init>()
            r15 = r4
            com.tencent.mm.ui.widget.pulldown.NestedBounceView r15 = (com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView) r15
            r15.mo154637e(r5)
        L_0x033a:
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$15 r5 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$15
            r5.<init>()
            com.tencent.mm.ui.widget.cedit.api.a r15 = r8.f278931f
            di3.d r1 = di3.C86312j.m106911c(r1)
            u73.n r1 = (u73.C101980n) r1
            java.lang.String r1 = r1.mo134685Hw()
            androidx.appcompat.app.AppCompatActivity r16 = r27.getContext()
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r16)
            r16 = r7
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$16 r7 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$16
            r7.<init>(r8, r4)
            r15.mo104244e(r1, r6, r5, r7)
            com.tencent.mm.ui.widget.cedit.api.a r1 = r8.f278931f
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$17 r4 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$17
            r4.<init>()
            r1.addTextChangedListener(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
            android.content.Intent r1 = r27.getIntent()
            java.lang.String r2 = "Kdescription"
            java.lang.String r1 = r1.getStringExtra(r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0390
            com.tencent.mm.ui.widget.cedit.api.a r1 = r8.f278931f
            androidx.appcompat.app.AppCompatActivity r4 = r27.getContext()
            android.content.Intent r5 = r27.getIntent()
            java.lang.String r5 = r5.getStringExtra(r2)
            java.lang.CharSequence r4 = vl3.C102226d.m134696a(r4, r5)
            r1.setText(r4)
            goto L_0x03a3
        L_0x0390:
            com.tencent.mm.ui.widget.cedit.api.a r1 = r8.f278931f
            if (r1 == 0) goto L_0x03a3
            if (r0 == 0) goto L_0x03a3
            java.lang.String r1 = "contentdesc"
            java.lang.String r1 = r0.getString(r1)
            if (r1 == 0) goto L_0x03a3
            com.tencent.mm.ui.widget.cedit.api.a r4 = r8.f278931f
            r4.setText(r1)
        L_0x03a3:
            int r1 = r8.f278941r
            r4 = 8
            if (r1 != r4) goto L_0x03be
            android.content.Intent r1 = r27.getIntent()
            java.lang.String r1 = r1.getStringExtra(r2)
            com.tencent.mm.ui.widget.cedit.api.a r2 = r8.f278931f
            androidx.appcompat.app.AppCompatActivity r5 = r27.getContext()
            java.lang.CharSequence r1 = vl3.C102226d.m134696a(r5, r1)
            r2.setText(r1)
        L_0x03be:
            com.tencent.mm.ui.widget.cedit.api.a r1 = r8.f278931f
            android.content.Intent r2 = r27.getIntent()
            java.lang.String r5 = "KparseLen"
            r6 = 0
            int r2 = r2.getIntExtra(r5, r6)
            r1.setPasterLen(r2)
            r1 = 2131312632(0x7f093ff8, float:1.8243638E38)
            android.view.View r1 = r8.findViewById(r1)
            com.tencent.mm.ui.KeyboardLinearLayout r1 = (com.tencent.p014mm.p136ui.KeyboardLinearLayout) r1
            r1 = 2131312722(0x7f094052, float:1.824382E38)
            android.view.View r1 = r8.findViewById(r1)
            com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter r1 = (com.tencent.p014mm.plugin.sns.p106ui.widget.AbsSnsUploadSayFooter) r1
            r8.f278937o = r1
            com.tencent.mm.ui.widget.cedit.api.a r2 = r8.f278931f
            r1.setMMEditText(r2)
            com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter r1 = r8.f278937o
            r15 = 4
            r1.setVisibility(r15)
            r1 = 2131312638(0x7f093ffe, float:1.824365E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r8.f278925W = r1
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.WindowManager r2 = r27.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getMetrics(r1)
            os2.j0 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.ay0()
            int r5 = r1.widthPixels
            int r1 = r1.heightPixels
            r2.c40(r5, r1)
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$7 r1 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$7
            r1.<init>()
            com.tencent.mm.ui.widget.cedit.api.a r2 = r8.f278931f
            r2.setOnClickListener(r1)
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$8 r1 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$8
            r1.<init>()
            com.tencent.mm.ui.widget.cedit.api.a r2 = r8.f278931f
            r2.setOnLongClickListener(r1)
            r1 = 1
            boolean[] r2 = new boolean[r1]
            r5 = 0
            r2[r5] = r1
            boolean[] r6 = new boolean[r1]
            r6[r5] = r5
            com.tencent.mm.ui.widget.cedit.api.a r1 = r8.f278931f
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$9 r7 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$9
            r7.<init>(r2)
            r1.addTextChangedListener(r7)
            com.tencent.mm.plugin.sns.ui.WrapScollview r1 = r8.f278929d
            com.tencent.mm.ui.widget.cedit.api.a r2 = r8.f278931f
            android.view.View r2 = r2.view()
            r1.setContentView(r2)
            com.tencent.mm.plugin.sns.ui.WrapScollview r1 = r8.f278929d
            r1.setDoComputeScrollDeltaToGetChildRectOnScreen(r5)
            android.content.Intent r1 = r27.getIntent()
            java.lang.String r2 = "reportSessionId"
            java.lang.String r1 = r1.getStringExtra(r2)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r3)
            r2 = 2131300092(0x7f090efc, float:1.8218204E38)
            android.view.View r2 = r8.findViewById(r2)
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView r2 = (com.tencent.p014mm.plugin.sns.p106ui.SnsUploadConfigView) r2
            r8.f278938p = r2
            int r3 = r8.f278941r
            r7 = 14
            if (r3 != r7) goto L_0x0476
            java.lang.String r3 = "wx5dfbe0a95623607b"
            boolean r1 = r1.contains(r3)
            if (r1 != 0) goto L_0x0476
            r1 = 1
            goto L_0x0477
        L_0x0476:
            r1 = 0
        L_0x0477:
            r2.getClass()
            java.lang.String r3 = "initSettings"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            r2.f278898p = r1
            if (r1 == 0) goto L_0x04a7
            f40.C86709a0.m107528h()
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            r7 = 2842(0xb1a, float:3.982E-42)
            r1.mo123455a(r7, r2)
            com.tencent.mm.plugin.sns.model.x r1 = new com.tencent.mm.plugin.sns.model.x
            r7 = -1216949095(0xffffffffb776d499, float:-1.4712242E-5)
            r1.<init>(r7)
            f40.C86709a0.m107528h()
            f40.g r7 = f40.C86709a0.m107529k()
            ob0.b0 r7 = r7.f251779b
            r7.mo123460f(r1)
        L_0x04a7:
            te3.kr2 r1 = r2.f278900r
            r7 = -998637568(0xffffffffc47a0000, float:-1000.0)
            r1.f298648e = r7
            r1.f298647d = r7
            java.lang.String r1 = "restoreSyncFlagStatus"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r5)
            boolean r7 = r2.f278893h
            if (r7 == 0) goto L_0x04be
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            r4 = 0
            goto L_0x0500
        L_0x04be:
            f40.C86709a0.m107528h()
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            r15 = 68404(0x10b34, float:9.5854E-41)
            r4 = 0
            java.lang.Object r7 = r7.mo119684e(r15, r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r7)
            r15 = r7 & 2
            if (r15 == 0) goto L_0x04dd
            r15 = 1
            goto L_0x04de
        L_0x04dd:
            r15 = 0
        L_0x04de:
            r2.f278894i = r15
            r15 = 8
            r7 = r7 & r15
            if (r7 == 0) goto L_0x04e7
            r7 = 1
            goto L_0x04e8
        L_0x04e7:
            r7 = 0
        L_0x04e8:
            r2.f278895j = r7
            boolean r7 = nc0.C76850a.m92642n()
            if (r7 != 0) goto L_0x04f4
            r7 = 0
            r2.f278895j = r7
            goto L_0x04f5
        L_0x04f4:
            r7 = 0
        L_0x04f5:
            boolean r15 = eb0.C75592q0.m90755C()
            if (r15 != 0) goto L_0x04fd
            r2.f278894i = r7
        L_0x04fd:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
        L_0x0500:
            r2.mo133063c()
            r2.mo133064d()
            r2.mo133065e()
            r2.mo133066f()
            boolean r1 = r2.f278895j
            if (r1 == 0) goto L_0x0528
            tn3.a r1 = r2.f278901s
            tn3.b r1 = (tn3.C118493b) r1
            boolean r7 = r1.f354646e
            if (r7 == 0) goto L_0x0519
            goto L_0x0528
        L_0x0519:
            r1.f354648g = r2
            r2 = 1
            r1.f354646e = r2
            tn3.c r2 = new tn3.c
            r2.<init>(r1)
            java.lang.String r1 = "Twitter_validationAccessToken"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r2, r1)
        L_0x0528:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            int r1 = r8.f278941r
            if (r1 == 0) goto L_0x0556
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView r1 = r8.f278938p
            r1.getClass()
            java.lang.String r2 = "setSyncGone"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
            android.widget.ImageView r3 = r1.f278889d
            r7 = 8
            r3.setVisibility(r7)
            android.widget.ImageView r3 = r1.f278890e
            r3.setVisibility(r7)
            android.widget.ImageView r3 = r1.f278891f
            r3.setVisibility(r7)
            android.widget.ImageView r3 = r1.f278892g
            r3.setVisibility(r7)
            r3 = 0
            r1.f278896n = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
        L_0x0556:
            int r1 = r8.f278941r
            r15 = 9
            if (r1 != r15) goto L_0x0570
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView r1 = r8.f278938p
            r1.getClass()
            java.lang.String r2 = "showQzone"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
            android.widget.ImageView r1 = r1.f278891f
            r3 = 0
            r1.setVisibility(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
        L_0x0570:
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$10 r1 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$10
            r1.<init>()
            r8.setBackBtn(r1)
            r2 = 0
            r1 = 2131837118(0x7f1140be, float:1.9307422E38)
            java.lang.String r3 = r8.getString(r1)
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$11 r5 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$11
            r5.<init>(r6)
            r7 = 0
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$12 r1 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$12
            r1.<init>(r8, r6)
            com.tencent.mm.ui.MMActivityController$r r25 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.GREEN
            r6 = r1
            r1 = r27
            r19 = r4
            r17 = 27
            r4 = r5
            r15 = r19
            r5 = r7
            r7 = 30
            r19 = 3
            r26 = r16
            r7 = r25
            r1.addTextOptionMenu(r2, r3, r4, r5, r6, r7)
            r1 = 2131315982(0x7f094d0e, float:1.8250433E38)
            android.view.View r2 = r8.findViewById(r1)
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$13 r3 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$13
            r3.<init>()
            r2.setOnTouchListener(r3)
            java.lang.String r2 = "setupInputScrollWithV2Config"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r10)
            com.tencent.mm.plugin.sns.ui.q7 r3 = new com.tencent.mm.plugin.sns.ui.q7
            androidx.appcompat.app.AppCompatActivity r4 = r27.getContext()
            r3.<init>(r4)
            androidx.appcompat.app.AppCompatActivity r4 = r27.getContext()
            r5 = 2131165290(0x7f07006a, float:1.7944793E38)
            int r4 = kg3.C76577a.m92157h(r4, r5)
            java.lang.String r5 = "setExtraPadding"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r3.f280957d = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            android.view.View r1 = r8.findViewById(r1)
            com.tencent.mm.ui.widget.cedit.api.a r4 = r8.f278931f
            com.tencent.mm.plugin.sns.ui.WrapScollview r5 = r8.f278929d
            com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter r7 = r8.f278937o
            java.lang.String r15 = "setUpView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r6)
            java.lang.String r0 = "containerView"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "inputView"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "scrollView"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "footer"
            gy3.C87412m.m108594g(r7, r0)
            r0 = 0
            r1.setOnTouchListener(r0)
            r3.f280960g = r4
            r3.f280961h = r5
            r3.f280962i = r7
            r0 = 0
            r5.setCheckInterceptTouchEventByCheckArea(r0)
            android.view.View r0 = r4.view()
            com.tencent.mm.plugin.sns.ui.n7 r1 = new com.tencent.mm.plugin.sns.ui.n7
            r1.<init>(r7, r5, r3)
            r0.setOnTouchListener(r1)
            com.tencent.mm.plugin.sns.ui.o7 r0 = new com.tencent.mm.plugin.sns.ui.o7
            r0.<init>(r3, r7, r4)
            r4.setSelectionChangedListener(r0)
            com.tencent.mm.plugin.sns.ui.p7 r0 = new com.tencent.mm.plugin.sns.ui.p7
            r0.<init>(r4, r7, r3)
            r7.setUploadFooterPanelChangeListener(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
            r0 = 2131297352(0x7f090448, float:1.8212646E38)
            android.view.View r0 = r8.findViewById(r0)
            com.tencent.mm.plugin.sns.ui.AtContactWidget r0 = (com.tencent.p014mm.plugin.sns.p106ui.AtContactWidget) r0
            r8.f278934i = r0
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView r1 = r8.f278938p
            r0.getClass()
            java.lang.String r2 = "initWidget"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.AtContactWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r0.f276682j = r1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r0 = 2131308101(0x7f092e45, float:1.8234448E38)
            android.view.View r0 = r8.findViewById(r0)
            com.tencent.mm.plugin.sns.ui.LocationWidget r0 = (com.tencent.p014mm.plugin.sns.p106ui.LocationWidget) r0
            r8.f278935j = r0
            r0.setLocationWidgetListener(r8)
            int r0 = r8.f278941r
            switch(r0) {
                case 0: goto L_0x065f;
                case 1: goto L_0x065f;
                case 2: goto L_0x065f;
                case 3: goto L_0x065f;
                case 4: goto L_0x065f;
                case 5: goto L_0x065f;
                case 6: goto L_0x065f;
                case 7: goto L_0x065f;
                case 8: goto L_0x065f;
                case 9: goto L_0x065f;
                case 10: goto L_0x065f;
                case 11: goto L_0x065f;
                case 12: goto L_0x065f;
                case 13: goto L_0x065f;
                case 14: goto L_0x065f;
                case 15: goto L_0x065f;
                case 16: goto L_0x065f;
                case 17: goto L_0x065f;
                case 18: goto L_0x065f;
                case 19: goto L_0x065f;
                case 20: goto L_0x065f;
                case 21: goto L_0x065f;
                case 22: goto L_0x065f;
                case 23: goto L_0x065f;
                case 24: goto L_0x065f;
                case 25: goto L_0x065f;
                case 26: goto L_0x065d;
                case 27: goto L_0x065f;
                case 28: goto L_0x065f;
                case 29: goto L_0x065f;
                case 30: goto L_0x065f;
                case 31: goto L_0x065d;
                case 32: goto L_0x065f;
                case 33: goto L_0x065f;
                case 34: goto L_0x065f;
                case 35: goto L_0x065d;
                case 36: goto L_0x065f;
                default: goto L_0x065d;
            }
        L_0x065d:
            r6 = 2
            goto L_0x06c0
        L_0x065f:
            r0 = 2131311735(0x7f093c77, float:1.8241819E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            java.lang.String r1 = "enableNewLabelRangeControl"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_GROUP_INT_SYNC
            r5 = 0
            int r3 = r3.mo119689j(r4, r5)
            if (r3 == 0) goto L_0x06a6
            java.lang.String r4 = "MicroMsg.SnsLabelRangeConfig"
            r6 = 2
            if (r3 == r6) goto L_0x0695
            boolean r3 = mt2.C47101a.f126572a
            if (r3 == 0) goto L_0x0690
            java.lang.String r3 = "enableNewLabelRangeControl false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            mt2.C47101a.f126572a = r5
        L_0x0690:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r3 = 0
            goto L_0x06ac
        L_0x0695:
            boolean r3 = mt2.C47101a.f126572a
            if (r3 != 0) goto L_0x06a1
            java.lang.String r3 = "enableNewLabelRangeControl true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r3 = 1
            mt2.C47101a.f126572a = r3
        L_0x06a1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r3 = 1
            goto L_0x06ac
        L_0x06a6:
            r6 = 2
            boolean r3 = mt2.C47101a.f126572a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
        L_0x06ac:
            if (r3 == 0) goto L_0x06b2
            r1 = 2131497760(0x7f0c1320, float:1.8619122E38)
            goto L_0x06b5
        L_0x06b2:
            r1 = 2131497761(0x7f0c1321, float:1.8619124E38)
        L_0x06b5:
            r0.setLayoutResource(r1)
            android.view.View r0 = r0.inflate()
            com.tencent.mm.plugin.sns.ui.BaseRangeWidget r0 = (com.tencent.p014mm.plugin.sns.p106ui.BaseRangeWidget) r0
            r8.f278936n = r0
        L_0x06c0:
            com.tencent.mm.plugin.sns.ui.BaseRangeWidget r0 = r8.f278936n
            com.tencent.mm.plugin.sns.ui.SnsUploadConfigView r1 = r8.f278938p
            r0.mo132077a(r1)
            com.tencent.mm.plugin.sns.ui.BaseRangeWidget r0 = r8.f278936n
            com.tencent.mm.plugin.sns.ui.SnsUploadUI$$b r1 = new com.tencent.mm.plugin.sns.ui.SnsUploadUI$$b
            r1.<init>(r8)
            r0.setRangeTipClickListener(r1)
            com.tencent.mm.plugin.sns.ui.LocationWidget r0 = r8.f278935j
            r1 = 10
            android.content.Intent r2 = r27.getIntent()
            r3 = -1
            r0.mo132185d(r1, r3, r2)
            com.tencent.mm.plugin.sns.ui.AtContactWidget r0 = r8.f278934i
            r1 = 6
            android.content.Intent r2 = r27.getIntent()
            com.tencent.mm.plugin.sns.ui.BaseRangeWidget r4 = r8.f278936n
            int r4 = r4.getLabelRange()
            if (r4 != 0) goto L_0x06ee
            r4 = 1
            goto L_0x06ef
        L_0x06ee:
            r4 = 0
        L_0x06ef:
            r0.mo132065e(r1, r3, r2, r4)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r1 = 0
            r0.mo131365Z(r1)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct r0 = r0.mo131344E()
            r0.f266378g = r6
            android.content.Intent r0 = r27.getIntent()
            r8.mo133086Y7(r0)
            r27.hideVKB()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r10)
            r27.mo133074L7(r28)
            java.lang.String r0 = "checkAutoDraftReport"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r10)
            os2.b0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Wx0()
            java.lang.String r2 = r8.f278921S
            os2.a0 r1 = r1.mo60188qq(r2)
            if (r1 == 0) goto L_0x07aa
            byte[] r2 = r1.field_draft
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r2)
            if (r2 != 0) goto L_0x0742
            java.lang.String r2 = "setDraft"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = "access$setDraft$cp"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r7 = 1
            com.tencent.p014mm.plugin.sns.statistics.C57354l.f164334b = r7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            goto L_0x0743
        L_0x0742:
            r7 = 1
        L_0x0743:
            int r1 = r1.field_extFlag
            r1 = r1 & r7
            if (r1 != r7) goto L_0x07aa
            int r1 = r8.f278941r
            r2 = 5
            if (r1 == 0) goto L_0x077b
            if (r1 == r7) goto L_0x0778
            r3 = 9
            if (r1 == r3) goto L_0x0776
            r3 = 11
            if (r1 == r3) goto L_0x0778
            r3 = 21
            if (r1 == r3) goto L_0x0778
            r3 = 23
            if (r1 == r3) goto L_0x0778
            r3 = 30
            if (r1 == r3) goto L_0x0778
            r3 = 34
            if (r1 == r3) goto L_0x0778
            r3 = 27
            if (r1 == r3) goto L_0x0778
            r3 = 28
            if (r1 == r3) goto L_0x077b
            switch(r1) {
                case 14: goto L_0x0774;
                case 15: goto L_0x0778;
                case 16: goto L_0x0778;
                case 17: goto L_0x0778;
                default: goto L_0x0772;
            }
        L_0x0772:
            r1 = 0
            goto L_0x077c
        L_0x0774:
            r1 = 5
            goto L_0x077c
        L_0x0776:
            r1 = 1
            goto L_0x077c
        L_0x0778:
            r1 = 3
            r3 = 0
            goto L_0x077e
        L_0x077b:
            r1 = 3
        L_0x077c:
            r3 = r1
            r1 = 2
        L_0x077e:
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 14247(0x37a7, float:1.9964E-41)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r7 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            r2[r7] = r13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7 = 1
            r2[r7] = r3
            java.lang.String r3 = r8.f278912I
            r2[r6] = r3
            long r15 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r3 = java.lang.Long.valueOf(r15)
            r2[r19] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 4
            r2[r3] = r1
            r4.mo160131h(r5, r2)
        L_0x07aa:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r10)
            wc3.C78538u.m94868d(r27)
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.content.Intent r1 = r27.getIntent()
            r2 = 0
            r1.writeToParcel(r0, r2)
            byte[] r0 = r0.marshall()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((byte[]) r0)
            r8.f278922T = r0
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_sns_draft_time
            r2 = 3000(0xbb8, double:1.482E-320)
            long r0 = r0.mo58777He(r1, r2)
            r8.f278923U = r0
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r8.f278928Z = r0
            r0 = 0
            r8.f278910G = r0
            android.content.Intent r1 = r27.getIntent()
            java.lang.String r2 = "KThrid_app"
            boolean r22 = r1.getBooleanExtra(r2, r0)
            android.content.Intent r1 = r27.getIntent()
            java.lang.String r2 = "KSnsFrom"
            int r1 = r1.getIntExtra(r2, r0)
            r3 = 17
            if (r1 != r3) goto L_0x07fc
            r18 = 1
            goto L_0x07fe
        L_0x07fc:
            r18 = 0
        L_0x07fe:
            android.content.Intent r1 = r27.getIntent()
            int r1 = r1.getIntExtra(r2, r0)
            r3 = 14
            if (r1 != r3) goto L_0x080d
            r19 = 1
            goto L_0x080f
        L_0x080d:
            r19 = 0
        L_0x080f:
            android.content.Intent r1 = r27.getIntent()
            int r1 = r1.getIntExtra(r2, r0)
            r2 = 19
            if (r1 != r2) goto L_0x081e
            r24 = 1
            goto L_0x0820
        L_0x081e:
            r24 = 0
        L_0x0820:
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r1 = "sns_exceprt_url"
            java.lang.String r0 = r0.getStringExtra(r1)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r1 = 1
            r25 = r0 ^ 1
            int r0 = r8.f278941r
            boolean r1 = r8.f278920R
            boolean r2 = r8.f278942s
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r4 = "SendAppMessageWrapper_PkgName"
            java.lang.String r3 = r3.getStringExtra(r4)
            java.lang.String r4 = "com.tencent.phoenix"
            boolean r23 = r4.equals(r3)
            r16 = r26
            r17 = r0
            r20 = r1
            r21 = r2
            r16.mo80976m(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r1 = "KSnsVideoTempalteInfo"
            byte[] r0 = r0.getByteArrayExtra(r1)
            if (r0 == 0) goto L_0x086b
            int r0 = r0.length
            if (r0 <= 0) goto L_0x086b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.String r1 = "ifMiaojian"
            r12.mo85926j(r14, r1, r0)
        L_0x086b:
            android.content.Intent r0 = r27.getIntent()
            java.lang.String r1 = "K_with_together_stat"
            java.lang.String r0 = r0.getStringExtra(r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x088e
            c30.g r1 = new c30.g     // Catch:{ Exception -> 0x0886 }
            r1.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0886 }
            r0 = r26
            r0.mo80975l(r1)     // Catch:{ Exception -> 0x0886 }
            goto L_0x088e
        L_0x0886:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
        L_0x088e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onDestroy();
        SnsUploadConfigView snsUploadConfigView = this.f278938p;
        if (snsUploadConfigView != null) {
            snsUploadConfigView.getClass();
            SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(2842, snsUploadConfigView);
            SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        }
        C95778f1 f1Var = this.f278944u;
        if (f1Var != null) {
            f1Var.mo132129g();
        }
        LocationWidget locationWidget = this.f278935j;
        if (locationWidget != null) {
            locationWidget.mo132186e();
        }
        AbsSnsUploadSayFooter absSnsUploadSayFooter = this.f278937o;
        if (absSnsUploadSayFooter != null) {
            absSnsUploadSayFooter.getClass();
            SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            ChatFooterPanel chatFooterPanel = absSnsUploadSayFooter.f206206g;
            if (chatFooterPanel != null) {
                chatFooterPanel.mo100200l();
                absSnsUploadSayFooter.f206206g.mo100189b();
            }
            SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        }
        ((HashMap) this.f278916M).clear();
        C118418g.INSTANCE.mo175826kl("ie_sns_upload");
        C102236a0.m134756m();
        SnsMethodCalculate.markStartTimeMs("unregHellBizId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        this.f278950y0.dead();
        SnsMethodCalculate.markEndTimeMs("unregHellBizId", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        C74974a aVar = this.f278931f;
        if (aVar != null) {
            aVar.destroy();
        }
        C60960c.f173618a.mo85927k("SnsPublishProcess", "editPageStaytime_", Long.valueOf(getActivityBrowseTimeMs()), C60242i.APPEND);
        if (this.f278939p0 != 3) {
            C57354l.f164333a.mo80966c((String) null);
        }
        ((C67001a) C28250a.m38138a()).mo90965c();
        C32927f.f89501a.mo58869c(C33419c.f90549a.mo59133a());
        mo133081S7(Boolean.FALSE);
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (keyEvent.getKeyCode() == 4) {
            AbsSnsUploadSayFooter absSnsUploadSayFooter = this.f278937o;
            absSnsUploadSayFooter.getClass();
            SnsMethodCalculate.markStartTimeMs("isSmileVisble", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            boolean z = absSnsUploadSayFooter.mo98022b() && absSnsUploadSayFooter.getVisibility() == 0;
            SnsMethodCalculate.markEndTimeMs("isSmileVisble", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            if (z) {
                Log.m105924i("MicroMsg.SnsUploadUI", "onKeyDown: back, panel & footer is visible");
                this.f278937o.mo98025g();
                SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                return true;
            }
            Log.m105924i("MicroMsg.SnsUploadUI", "onKeyDown: back, start exit save");
            mo133077O7();
            SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return true;
        }
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        return onKeyDown;
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.hideVKB();
        super.onPause();
        Log.m105924i("MicroMsg.SnsUploadUI", "onPause: ");
        C74974a aVar = this.f278931f;
        if (aVar != null) {
            aVar.onPause();
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void onPreDestroyed() {
        SnsMethodCalculate.markStartTimeMs("onPreDestroyed", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onPreDestroyed();
        SnsMethodCalculate.markStartTimeMs("savePostModel", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        C47100l lVar = (C47100l) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(this, 2, C47100l.class);
        if (lVar == null || lVar.f126571e <= 0) {
            SnsMethodCalculate.markEndTimeMs("savePostModel", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        } else {
            ((C99933h) C86312j.m106911c(C99933h.class)).mo84399BM(2, "SnsPostEnd_" + lVar.f126571e, lVar, new C58325i<C47100l>(this) {
                /* renamed from: a */
                public void mo32063a(int i, boolean z, C38549d8 d8Var, C47465a aVar) {
                    SnsMethodCalculate.markStartTimeMs("onActionDone", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$19");
                    C47100l lVar = (C47100l) aVar;
                    SnsMethodCalculate.markStartTimeMs("onActionDone", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$19");
                    Log.m105925i("MicroMsg.SnsUploadUI", "PluginSecData onActionDone %s %b", Integer.valueOf(i), Boolean.valueOf(z));
                    SnsMethodCalculate.markEndTimeMs("onActionDone", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$19");
                    SnsMethodCalculate.markEndTimeMs("onActionDone", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$19");
                }
            });
            SnsMethodCalculate.markEndTimeMs("savePostModel", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        }
        SnsMethodCalculate.markEndTimeMs("onPreDestroyed", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        SnsMethodCalculate.markStartTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.SnsUploadUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            return;
        }
        Log.m105925i("MicroMsg.SnsUploadUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i != 16) {
            if (i == 64) {
                if (iArr[0] == 0) {
                    this.f278935j.mo132183b();
                } else {
                    C76879j.m92709C(this, getString(C0966R.string.f361129hi0), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$21");
                            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(SnsUploadUI.this.getContext());
                            dialogInterface.dismiss();
                            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$21");
                        }
                    }, new DialogInterface.OnClickListener(this) {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$22");
                            dialogInterface.dismiss();
                            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$22");
                        }
                    });
                }
            }
        } else if (iArr[0] == 0) {
            C95778f1 f1Var = this.f278944u;
            if (f1Var instanceof C95754d2) {
                ((C95754d2) f1Var).mo133199m();
            } else if (f1Var instanceof NewSightWidget) {
                ((NewSightWidget) f1Var).mo132256p();
            }
        }
        SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onResume();
        this.f278937o.post(new Runnable() {
            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$18");
                Log.m105924i("MicroMsg.SnsUploadUI", "onResume run: refreshContentHeight");
                C76865k.m92670a(SnsUploadUI.this);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadUI$18");
            }
        });
        C95778f1 f1Var = this.f278944u;
        if (f1Var != null && (f1Var instanceof NewSightWidget)) {
            NewSightWidget newSightWidget = (NewSightWidget) f1Var;
            newSightWidget.getClass();
            SnsMethodCalculate.markStartTimeMs("resume", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            if (newSightWidget.f277043e != null) {
                if (!newSightWidget.f277072x) {
                    newSightWidget.mo132263w();
                } else {
                    newSightWidget.mo132264x();
                }
            }
            SnsMethodCalculate.markEndTimeMs("resume", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        }
        this.f278931f.mo104239a(((C101980n) C86312j.m106911c(C101980n.class)).Kr0());
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void onSaveInstanceState(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onSaveInstanceState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        if (bundle != null) {
            C74974a aVar = this.f278931f;
            if (aVar != null) {
                bundle.putString("contentdesc", aVar.getText().toString());
            }
            this.f278944u.mo132131i(bundle);
        }
        super.onSaveInstanceState(bundle);
        SnsMethodCalculate.markEndTimeMs("onSaveInstanceState", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void onStart() {
        SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onStart();
        C94866e1.ly0().postDelayed(this.f278924V, this.f278923U);
        SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }

    public void onStop() {
        SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        super.onStop();
        Log.m105924i("MicroMsg.SnsUploadUI", "onStop: ");
        C94866e1.ly0().removeCallbacks(this.f278924V);
        SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
    }
}
