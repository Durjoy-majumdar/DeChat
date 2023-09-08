package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsEditTipsWidget;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C30699x0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72834u0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import f40.C86709a0;
import gv2.C98242p;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jo3.C76431c;
import kg3.C76577a;
import kr2.C76634a;
import ks2.C99205z;
import lc3.C10485b;
import nj3.C76912y0;
import ns2.C100157a;
import p206nj.C76865k;
import p248ug.C78158s0;
import p248ug.C78160t0;
import p255vr.C65873e;
import p629ny.C76979h;
import p645pj.C77092c;
import pt2.C62496c;
import qn3.C77382c;
import ro3.C110588j;
import te3.w64;
import u73.C101980n;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentFooter */
public class SnsCommentFooter extends InputPanelLinearLayout {

    /* renamed from: M */
    public static String f278037M = ((C65873e) C86312j.m106911c(C65873e.class)).ep0(79);

    /* renamed from: A */
    public boolean f278038A;

    /* renamed from: B */
    public SnsInfo f278039B;

    /* renamed from: C */
    public C99205z f278040C;

    /* renamed from: D */
    public boolean f278041D;

    /* renamed from: E */
    public boolean f278042E;

    /* renamed from: F */
    public String f278043F;

    /* renamed from: G */
    public boolean f278044G;

    /* renamed from: H */
    public boolean f278045H;

    /* renamed from: I */
    public TextWatcher f278046I;

    /* renamed from: J */
    public C95534e f278047J;

    /* renamed from: K */
    public C95536g f278048K;

    /* renamed from: L */
    public C96116p8 f278049L;

    /* renamed from: f */
    public MMActivity f278050f;

    /* renamed from: g */
    public ImageButton f278051g;

    /* renamed from: h */
    public C74974a f278052h;

    /* renamed from: i */
    public ImageView f278053i;

    /* renamed from: j */
    public ImageView f278054j;

    /* renamed from: n */
    public Button f278055n;

    /* renamed from: o */
    public Button f278056o;

    /* renamed from: p */
    public ChatFooterPanel f278057p;

    /* renamed from: q */
    public SnsEditTipsWidget f278058q;

    /* renamed from: r */
    public w64 f278059r = null;

    /* renamed from: s */
    public int f278060s;

    /* renamed from: t */
    public int f278061t;

    /* renamed from: u */
    public int f278062u;

    /* renamed from: v */
    public int f278063v;

    /* renamed from: w */
    public int f278064w;

    /* renamed from: x */
    public String f278065x;

    /* renamed from: y */
    public C95535f f278066y;

    /* renamed from: z */
    public boolean f278067z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$a */
    public class C95528a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C95535f f278068d;

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$a$a */
        public class C95529a implements C77382c.C77383a {

            /* renamed from: d */
            public final /* synthetic */ int f278070d;

            public C95529a(int i) {
                this.f278070d = i;
            }

            /* renamed from: L0 */
            public void mo4083L0(String str) {
                SnsMethodCalculate.markStartTimeMs("doWhenMore", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$13$1");
                Log.m105921e("MicroMsg.SnsCommentFooter", "comment send failed, count over, currentCharacterCount:%d, maxCount:%d", Integer.valueOf(C45078p0.m49927f(SnsCommentFooter.m122046g(SnsCommentFooter.this).getText().toString())), Integer.valueOf(this.f278070d));
                Context context = SnsCommentFooter.this.getContext();
                String q = C76577a.m92166q(SnsCommentFooter.m122042c(SnsCommentFooter.this), C0966R.string.n5n);
                int i = this.f278070d;
                SnsMethodCalculate.markStartTimeMs("characterCount2TextCount", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                SnsMethodCalculate.markEndTimeMs("characterCount2TextCount", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                C76912y0.m92773l(context, String.format(q, new Object[]{Integer.valueOf((int) Math.ceil(((double) i) / 2.0d))}));
                SnsCommentFooter snsCommentFooter = SnsCommentFooter.this;
                SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                C99205z zVar = snsCommentFooter.f278040C;
                SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                zVar.getClass();
                SnsMethodCalculate.markStartTimeMs("hitWordLimitToast", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
                zVar.f290911h++;
                SnsMethodCalculate.markEndTimeMs("hitWordLimitToast", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
                SnsMethodCalculate.markEndTimeMs("doWhenMore", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$13$1");
            }

            /* renamed from: L3 */
            public void mo4084L3(String str) {
                SnsMethodCalculate.markStartTimeMs("doWhenLess", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$13$1");
                SnsMethodCalculate.markEndTimeMs("doWhenLess", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$13$1");
            }

            /* renamed from: P4 */
            public void mo4086P4(String str) {
                SnsMethodCalculate.markStartTimeMs("doWhenOK", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$13$1");
                SnsCommentFooter snsCommentFooter = SnsCommentFooter.this;
                String str2 = SnsCommentFooter.f278037M;
                SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                snsCommentFooter.getClass();
                SnsMethodCalculate.markStartTimeMs("prepareReportTextSubmit", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                if (snsCommentFooter.f278040C == null) {
                    snsCommentFooter.f278040C = C99205z.f290902j.mo138558b();
                }
                C99205z zVar = snsCommentFooter.f278040C;
                zVar.getClass();
                SnsMethodCalculate.markStartTimeMs("setContextType", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
                zVar.f290907d = 2;
                SnsMethodCalculate.markEndTimeMs("setContextType", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
                SnsInfo snsInfo = snsCommentFooter.f278039B;
                if (snsInfo != null) {
                    C99205z zVar2 = snsCommentFooter.f278040C;
                    String q0 = C102236a0.m134765q0(snsInfo.field_snsId);
                    zVar2.getClass();
                    SnsMethodCalculate.markStartTimeMs("setPublishFeedId", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
                    C87412m.m108594g(q0, "<set-?>");
                    zVar2.f290905b = q0;
                    SnsMethodCalculate.markEndTimeMs("setPublishFeedId", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
                }
                snsCommentFooter.f278040C.mo138556d(snsCommentFooter.f278052h.getLayout());
                boolean z = true;
                snsCommentFooter.f278040C.mo138555c(2, 1);
                snsCommentFooter.f278040C = C99205z.f290902j.mo138558b();
                SnsMethodCalculate.markEndTimeMs("prepareReportTextSubmit", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                int i = 0;
                if (TextUtils.equals(SnsCommentFooter.m122046g(SnsCommentFooter.this).getText().toString(), SnsCommentFooter.m122046g(SnsCommentFooter.this).getPasterContent())) {
                    Log.m105924i("MicroMsg.SnsCommentFooter", "paste clip board to send");
                } else {
                    z = false;
                }
                boolean similarPasteChange = SnsCommentFooter.m122046g(SnsCommentFooter.this).getSimilarPasteChange();
                String similarPasteSeqStr = SnsCommentFooter.m122046g(SnsCommentFooter.this).getSimilarPasteSeqStr();
                boolean isCopyFromWX = ClipboardHelper.isCopyFromWX(SnsCommentFooter.m122046g(SnsCommentFooter.this).getText());
                SnsCommentFooter.m122046g(SnsCommentFooter.this).mo104453p();
                if (z) {
                    i = 0 | (isCopyFromWX ? 4 : 8);
                }
                if (similarPasteChange) {
                    i |= isCopyFromWX ? 16 : 32;
                }
                HashMap<Integer, C100157a.C100158a> hashMap = C100157a.f293382a;
                SnsMethodCalculate.markStartTimeMs("saveState", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
                C100157a.f293382a.put(2, new C100157a.C100158a(i, similarPasteSeqStr));
                SnsMethodCalculate.markEndTimeMs("saveState", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
                C95528a aVar = C95528a.this;
                aVar.f278068d.mo132108a(SnsCommentFooter.m122046g(SnsCommentFooter.this).getText().toString(), "");
                SnsCommentFooter.m122046g(SnsCommentFooter.this).setText("");
                SnsMethodCalculate.markEndTimeMs("doWhenOK", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$13$1");
            }
        }

        public C95528a(C95535f fVar) {
            this.f278068d = fVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$13");
            int k = C77092c.m93049k();
            C76431c g = C76431c.m91853g(SnsCommentFooter.m122046g(SnsCommentFooter.this));
            g.f225611e = 0;
            g.f225610d = k;
            g.f225607a = true;
            g.mo107499d(new C95529a(k));
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$13");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$b */
    public class C95530b implements Runnable {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$b$a */
        public class C95531a implements Runnable {
            public C95531a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$2$1");
                int height = SnsCommentFooter.this.getHeight();
                SnsCommentFooter snsCommentFooter = SnsCommentFooter.this;
                String str = SnsCommentFooter.f278037M;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                ChatFooterPanel chatFooterPanel = snsCommentFooter.f278057p;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                if (height < chatFooterPanel.getHeight()) {
                    SnsCommentFooter.this.requestLayout();
                }
                SnsCommentFooter snsCommentFooter2 = SnsCommentFooter.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                C95536g gVar = snsCommentFooter2.f278048K;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                if (gVar != null) {
                    SnsCommentFooter snsCommentFooter3 = SnsCommentFooter.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                    C95536g gVar2 = snsCommentFooter3.f278048K;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                    ((SnsCommentDetailUI.C9549929) gVar2).mo132646a();
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$2$1");
            }
        }

        public C95530b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$2");
            Log.m105924i("MicroMsg.SnsCommentFooter", "showSmileyPanel in run");
            SnsCommentFooter snsCommentFooter = SnsCommentFooter.this;
            String str = SnsCommentFooter.f278037M;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            snsCommentFooter.mo132692n(true);
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            SnsCommentFooter.this.post(new C95531a());
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$c */
    public class C95532c implements TextWatcher {

        /* renamed from: d */
        public int f278074d = 0;

        public C95532c() {
        }

        public void afterTextChanged(Editable editable) {
            SnsMethodCalculate.markStartTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$4");
            if (SnsCommentFooter.m122046g(SnsCommentFooter.this).getText() == null) {
                SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$4");
                return;
            }
            SnsCommentFooter snsCommentFooter = SnsCommentFooter.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            SnsEditTipsWidget snsEditTipsWidget = snsCommentFooter.f278058q;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            snsEditTipsWidget.mo98037a(SnsCommentFooter.m122046g(SnsCommentFooter.this).getText().toString());
            if (C98242p.m126942d(SnsCommentFooter.m122047h(SnsCommentFooter.this), 8) && !Util.isNullOrNil(SnsCommentFooter.m122048i(SnsCommentFooter.this)) && SnsCommentFooter.m122046g(SnsCommentFooter.this).getText() != null && !SnsCommentFooter.m122046g(SnsCommentFooter.this).getText().toString().startsWith(SnsCommentFooter.m122048i(SnsCommentFooter.this))) {
                Log.m105925i("MicroMsg.SnsCommentFooter", "cur text %s", SnsCommentFooter.m122046g(SnsCommentFooter.this).getText());
                SnsCommentFooter snsCommentFooter2 = SnsCommentFooter.this;
                SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                snsCommentFooter2.f278065x = "";
                SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                SnsCommentFooter snsCommentFooter3 = SnsCommentFooter.this;
                SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                snsCommentFooter3.f278059r = null;
                SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                SnsCommentFooter.this.mo132684F(8);
                SnsCommentFooter.m122049j(SnsCommentFooter.this, 0);
            }
            SnsCommentFooter.m122046g(SnsCommentFooter.this).mo104256m();
            boolean z = SnsCommentFooter.m122046g(SnsCommentFooter.this).getText().toString().trim().length() > 0;
            if (z) {
                SnsCommentFooter snsCommentFooter4 = SnsCommentFooter.this;
                if (snsCommentFooter4.f278045H) {
                    SnsCommentFooter.m122050k(snsCommentFooter4, z);
                    SnsCommentFooter.this.f278045H = false;
                }
            }
            if (!z) {
                SnsCommentFooter.m122050k(SnsCommentFooter.this, z);
                SnsCommentFooter.this.f278045H = true;
            }
            SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$4");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SnsMethodCalculate.markStartTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$4");
            this.f278074d = charSequence == null ? 0 : charSequence.length();
            SnsMethodCalculate.markEndTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$4");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SnsMethodCalculate.markStartTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$4");
            if (charSequence == null || charSequence.length() < C76634a.f224255a) {
                SnsCommentFooter.this.mo132684F(16);
                Log.m105918d("MicroMsg.SnsCommentFooter", "clean SNS_COMMENT_FLAG_FOLD");
            } else if (charSequence.length() - this.f278074d > C76634a.f224255a) {
                SnsCommentFooter.this.setCommentFlag(16);
                Log.m105918d("MicroMsg.SnsCommentFooter", "add SNS_COMMENT_FLAG_FOLD");
            }
            SnsMethodCalculate.markEndTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$d */
    public class C95533d implements TextWatcher {

        /* renamed from: d */
        public int f278076d = 0;

        /* renamed from: e */
        public final /* synthetic */ List f278077e;

        public C95533d(List list) {
            this.f278077e = list;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            SnsMethodCalculate.markStartTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$5");
            if (SnsCommentFooter.m122046g(SnsCommentFooter.this).getText() == null) {
                SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$5");
                return;
            }
            if (C98242p.m126942d(SnsCommentFooter.m122047h(SnsCommentFooter.this), 8) && !Util.isNullOrNil(SnsCommentFooter.m122048i(SnsCommentFooter.this)) && !Util.isNullOrNil(SnsCommentFooter.m122046g(SnsCommentFooter.this).getText().toString()) && !SnsCommentFooter.m122046g(SnsCommentFooter.this).getText().toString().startsWith(SnsCommentFooter.m122048i(SnsCommentFooter.this))) {
                Log.m105925i("MicroMsg.SnsCommentFooter", "commentAtPrefix [%s], curTxt [%s]", SnsCommentFooter.m122048i(SnsCommentFooter.this), SnsCommentFooter.m122046g(SnsCommentFooter.this).getText());
                SnsCommentFooter snsCommentFooter = SnsCommentFooter.this;
                SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                snsCommentFooter.f278065x = "";
                SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                SnsCommentFooter snsCommentFooter2 = SnsCommentFooter.this;
                SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                snsCommentFooter2.f278059r = null;
                SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                SnsCommentFooter.this.mo132684F(8);
                SnsCommentFooter.m122049j(SnsCommentFooter.this, 0);
            }
            SnsCommentFooter snsCommentFooter3 = SnsCommentFooter.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            SnsEditTipsWidget snsEditTipsWidget = snsCommentFooter3.f278058q;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            snsEditTipsWidget.mo98037a(SnsCommentFooter.m122046g(SnsCommentFooter.this).getText().toString());
            Log.m105924i("MicroMsg.SnsCommentFooter", "update commentkey:" + SnsCommentFooter.m122041b(SnsCommentFooter.this));
            if (!Util.isNullOrNil(SnsCommentFooter.m122041b(SnsCommentFooter.this))) {
                Iterator it = this.f278077e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    C96213s sVar = (C96213s) it.next();
                    if (SnsCommentFooter.m122041b(SnsCommentFooter.this).equals(sVar.f281156a)) {
                        Log.m105918d("MicroMsg.SnsCommentFooter", "afterTextChanged update");
                        sVar.f281157b = SnsCommentFooter.m122046g(SnsCommentFooter.this).getText().toString();
                        sVar.f281158c = SnsCommentFooter.m122047h(SnsCommentFooter.this);
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    Log.m105918d("MicroMsg.SnsCommentFooter", "afterTextChanged add");
                    C96213s sVar2 = new C96213s();
                    sVar2.f281156a = SnsCommentFooter.m122041b(SnsCommentFooter.this);
                    sVar2.f281157b = SnsCommentFooter.m122046g(SnsCommentFooter.this).getText().toString();
                    sVar2.f281158c = SnsCommentFooter.m122047h(SnsCommentFooter.this);
                    String str = sVar2.f281157b;
                    if (str != null && str.length() > 0) {
                        this.f278077e.add(sVar2);
                    }
                }
            }
            if (this.f278077e.size() > 5) {
                Log.m105918d("MicroMsg.SnsCommentFooter", "comments remove");
                this.f278077e.remove(0);
            }
            SnsCommentFooter.m122046g(SnsCommentFooter.this).mo104256m();
            boolean z2 = SnsCommentFooter.m122046g(SnsCommentFooter.this).getText().toString().trim().length() > 0;
            if (z2) {
                SnsCommentFooter snsCommentFooter4 = SnsCommentFooter.this;
                if (snsCommentFooter4.f278045H) {
                    SnsCommentFooter.m122050k(snsCommentFooter4, z2);
                    SnsCommentFooter.this.f278045H = false;
                }
            }
            if (!z2) {
                SnsCommentFooter.m122050k(SnsCommentFooter.this, z2);
                SnsCommentFooter.this.f278045H = true;
            }
            SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$5");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SnsMethodCalculate.markStartTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$5");
            this.f278076d = charSequence == null ? 0 : charSequence.length();
            SnsMethodCalculate.markEndTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$5");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SnsMethodCalculate.markStartTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$5");
            if (charSequence == null || charSequence.length() < C76634a.f224255a) {
                SnsCommentFooter.this.mo132684F(16);
                Log.m105918d("MicroMsg.SnsCommentFooter", "clean SNS_COMMENT_FLAG_FOLD");
            } else if (charSequence.length() - this.f278076d > C76634a.f224255a) {
                SnsCommentFooter.this.setCommentFlag(16);
                Log.m105918d("MicroMsg.SnsCommentFooter", "add SNS_COMMENT_FLAG_FOLD");
            }
            SnsMethodCalculate.markEndTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$e */
    public interface C95534e {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$f */
    public interface C95535f {
        /* renamed from: a */
        void mo132108a(String str, String str2);
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$g */
    public interface C95536g {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsCommentFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_sns_comment_emoji_enable;
        Class cls = C32735h.class;
        boolean z = false;
        this.f278060s = 0;
        this.f278061t = 0;
        this.f278062u = -1;
        this.f278063v = -1;
        this.f278064w = 0;
        this.f278066y = null;
        this.f278067z = false;
        this.f278038A = false;
        KeyBoardUtil.isPortOrientation(getContext());
        this.f278041D = false;
        this.f278043F = "";
        this.f278044G = false;
        this.f278045H = true;
        this.f278046I = new C95532c();
        this.f278050f = (MMActivity) context;
        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) {
            this.f278067z = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0) == 1 ? true : z;
        } else {
            this.f278067z = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0) == 1 ? true : z;
        }
        this.f278040C = C99205z.f290902j.mo138558b();
    }

    /* renamed from: b */
    public static /* synthetic */ String m122041b(SnsCommentFooter snsCommentFooter) {
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        String str = snsCommentFooter.f278043F;
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return str;
    }

    /* renamed from: c */
    public static /* synthetic */ MMActivity m122042c(SnsCommentFooter snsCommentFooter) {
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        MMActivity mMActivity = snsCommentFooter.f278050f;
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return mMActivity;
    }

    /* renamed from: d */
    public static /* synthetic */ ImageButton m122043d(SnsCommentFooter snsCommentFooter) {
        SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        ImageButton imageButton = snsCommentFooter.f278051g;
        SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return imageButton;
    }

    /* renamed from: e */
    public static void m122044e(SnsCommentFooter snsCommentFooter) {
        SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        snsCommentFooter.getClass();
        SnsMethodCalculate.markStartTimeMs("hideSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        snsCommentFooter.f278057p.mo100196h();
        if (KeyBoardUtil.isPortOrientation(snsCommentFooter.getContext())) {
            snsCommentFooter.getInputPanelHelper().mo104363f(new C95767e4(snsCommentFooter));
        } else {
            snsCommentFooter.mo132692n(false);
        }
        SnsMethodCalculate.markEndTimeMs("hideSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: f */
    public static boolean m122045f(SnsCommentFooter snsCommentFooter) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        snsCommentFooter.getClass();
        SnsMethodCalculate.markStartTimeMs("isInReply", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        w64 w64 = snsCommentFooter.f278059r;
        if (w64 == null || Util.isNullOrNil(w64.f299703d)) {
            z = false;
            SnsMethodCalculate.markEndTimeMs("isInReply", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        } else {
            z = true;
            SnsMethodCalculate.markEndTimeMs("isInReply", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        }
        SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return z;
    }

    /* renamed from: g */
    public static /* synthetic */ C74974a m122046g(SnsCommentFooter snsCommentFooter) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        C74974a aVar = snsCommentFooter.f278052h;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return aVar;
    }

    /* renamed from: h */
    public static /* synthetic */ int m122047h(SnsCommentFooter snsCommentFooter) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int i = snsCommentFooter.f278060s;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return i;
    }

    /* renamed from: i */
    public static /* synthetic */ String m122048i(SnsCommentFooter snsCommentFooter) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        String str = snsCommentFooter.f278065x;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return str;
    }

    /* renamed from: j */
    public static /* synthetic */ int m122049j(SnsCommentFooter snsCommentFooter, int i) {
        SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        snsCommentFooter.f278061t = i;
        SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return i;
    }

    /* renamed from: k */
    public static /* synthetic */ void m122050k(SnsCommentFooter snsCommentFooter, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        snsCommentFooter.mo132690l(z);
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m122051y(android.content.Context r19, java.lang.Object r20, boolean r21, java.lang.String r22, int r23, java.lang.String r24, long r25) {
        /*
            r0 = r19
            r1 = r20
            java.lang.String r2 = "reportInputMenu"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsCommentFooter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            boolean r4 = r1 instanceof com.tencent.p014mm.plugin.sns.storage.SnsInfo
            if (r4 != 0) goto L_0x0014
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0014:
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r1
            r4 = 3
            r5 = 2
            if (r21 == 0) goto L_0x001c
            r8 = 3
            goto L_0x001d
        L_0x001c:
            r8 = 2
        L_0x001d:
            boolean r6 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI
            r7 = 1
            if (r6 == 0) goto L_0x0024
        L_0x0022:
            r9 = 1
            goto L_0x002f
        L_0x0024:
            boolean r6 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI
            if (r6 == 0) goto L_0x002a
            r9 = 3
            goto L_0x002f
        L_0x002a:
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsCommentUI
            if (r0 == 0) goto L_0x0022
            r9 = 2
        L_0x002f:
            java.lang.String r10 = r1.field_userName
            long r11 = r1.field_snsId
            java.lang.String r11 = vr2.C102236a0.m134765q0(r11)
            boolean r0 = r1.isAd()
            if (r0 == 0) goto L_0x003f
            r12 = 2
            goto L_0x0048
        L_0x003f:
            boolean r0 = r1.isWxWork()
            if (r0 == 0) goto L_0x0047
            r12 = 3
            goto L_0x0048
        L_0x0047:
            r12 = 1
        L_0x0048:
            java.lang.Class<c00.m> r0 = c00.C92329m.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r6 = r0
            c00.m r6 = (c00.C92329m) r6
            r7 = 0
            java.lang.String r13 = java.lang.String.valueOf(r22)
            java.lang.String r14 = f278037M
            r15 = r23
            r16 = r24
            r17 = r25
            r6.mo37190PZ(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsCommentFooter.m122051y(android.content.Context, java.lang.Object, boolean, java.lang.String, int, java.lang.String, long):void");
    }

    /* renamed from: A */
    public void mo132679A(List<C96213s> list, String str) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f278043F = str;
        if (this.f278052h != null) {
            if (!Util.isNullOrNil(str)) {
                Iterator<C96213s> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C96213s next = it.next();
                    if (str.equals(next.f281156a)) {
                        list.remove(next);
                        str2 = Util.nullAs(next.f281157b, "");
                        break;
                    }
                }
            }
            str2 = "";
            if (!Util.isNullOrNil(str2)) {
                this.f278056o.setVisibility(0);
                this.f278055n.setVisibility(8);
                this.f278052h.setText("");
                this.f278052h.mo98046o(str2);
            } else {
                this.f278052h.setText("");
            }
            if (!this.f278044G) {
                this.f278052h.addTextChangedListener(new C95533d(list));
            }
            this.f278044G = true;
        }
        SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: B */
    public void mo132680B(boolean z) {
        SnsMethodCalculate.markStartTimeMs("showAtBtn", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        ImageView imageView = this.f278053i;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
                if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("SnsAdAtFriendRedDot", 0) != 1 || !C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.NEW_BANDAGE_SNS_AD_COMMENT_AT_RED_DOT_BOOLEAN_SYNC, true)) {
                    this.f278054j.setVisibility(8);
                } else {
                    this.f278054j.setVisibility(0);
                }
            } else {
                imageView.setVisibility(8);
                this.f278054j.setVisibility(8);
            }
        }
        SnsMethodCalculate.markEndTimeMs("showAtBtn", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: C */
    public void mo132681C() {
        SnsMethodCalculate.markStartTimeMs("showInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        Log.m105924i("MicroMsg.SnsCommentFooter", "showInput: ");
        ((InputMethodManager) this.f278050f.getSystemService("input_method")).showSoftInput(this.f278052h.view(), 0);
        SnsMethodCalculate.markEndTimeMs("showInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: D */
    public final void mo132682D() {
        SnsMethodCalculate.markStartTimeMs("showSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f278057p.mo100197i();
        if (KeyBoardUtil.isPortOrientation(getContext())) {
            SnsMethodCalculate.markStartTimeMs("isShowKeyboard", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            int j = C85875k4.m106188j(getContext());
            boolean z = false;
            Log.m105925i("MicroMsg.SnsCommentFooter", "is show key board %d, %d, %d", Integer.valueOf(this.f278063v), Integer.valueOf(this.f278062u), Integer.valueOf(j));
            int i = this.f278063v;
            if (i > 0 && i < this.f278062u - j) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isShowKeyboard", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            if (z) {
                getInputPanelHelper().mo104362e(new C95530b());
                SnsMethodCalculate.markEndTimeMs("showSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        }
        Log.m105924i("MicroMsg.SnsCommentFooter", "showSmileyPanel");
        mo132692n(true);
        C95536g gVar = this.f278048K;
        if (gVar != null) {
            ((SnsCommentDetailUI.C9549929) gVar).mo132646a();
        }
        SnsMethodCalculate.markEndTimeMs("showSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: E */
    public void mo132683E(boolean z) {
        SnsMethodCalculate.markStartTimeMs("showState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (this.f278057p == null) {
            SnsMethodCalculate.markEndTimeMs("showState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        this.f278042E = z;
        Log.m105924i("MicroMsg.SnsCommentFooter", "showState " + z);
        if (!z) {
            mo132693o(false, false);
            mo132691m();
            this.f278051g.setImageResource(C0966R.raw.icons_outlined_emoji);
            mo132697q();
            mo132698q(false);
            requestLayout();
            SnsMethodCalculate.markEndTimeMs("showState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        if (this.f278061t == 0) {
            this.f278052h.mo104256m();
            mo132681C();
            mo132692n(false);
        } else {
            this.f278052h.mo104256m();
            mo132697q();
            mo132682D();
        }
        SnsMethodCalculate.markEndTimeMs("showState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: F */
    public void mo132684F(int i) {
        SnsMethodCalculate.markStartTimeMs("unsetCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f278060s = (~i) & this.f278060s;
        SnsMethodCalculate.markEndTimeMs("unsetCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: G */
    public final void mo132685G(boolean z, int i) {
        String str;
        String str2;
        String str3;
        int i2;
        boolean z2 = z;
        int i3 = i;
        SnsMethodCalculate.markStartTimeMs("updateOnKeyBoardChange", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        Log.m105925i("MicroMsg.SnsCommentFooter", "updateOnKeyBoardChange: isKeyboardShow:%b, smiley state:%b, keyboardHeight:%d", Boolean.valueOf(z), Boolean.valueOf(mo132700s()), Integer.valueOf(i));
        if (z2 && getVisibility() == 0 && this.f278049L != null) {
            Log.m105918d("MicroMsg.SnsCommentFooter", "jacks dynamic adjust animation up");
            C96116p8 p8Var = this.f278049L;
            p8Var.getClass();
            SnsMethodCalculate.markStartTimeMs("scrollUp", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            p8Var.f280736g = true;
            new MMHandler().postDelayed(p8Var.f280740k, 30);
            p8Var.f280737h = 10;
            Log.m105920e("MicroMsg.TimeLineScrollAnimation", "footerTop when up :" + p8Var.f280739j.getTop());
            Util.currentTicks();
            SnsMethodCalculate.markEndTimeMs("scrollUp", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        }
        C74974a aVar = this.f278052h;
        if (aVar != null) {
            aVar.mo104245f(z2);
            if (z2 && i3 != 0) {
                SnsMethodCalculate.markStartTimeMs("refreshSendEditTextMaxHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                int c = C74942w4.m89786c(this.f278050f, C0966R.dimen.f3679b9);
                C62496c cVar = C62496c.f177535a;
                MMActivity mMActivity = this.f278050f;
                SnsMethodCalculate.markStartTimeMs("refreshInputViewMaxHeightOnKeyboardShow", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
                C87412m.m108594g(mMActivity, "context");
                if (c < 0) {
                    str3 = "refreshSendEditTextMaxHeight";
                    str2 = "MicroMsg.SnsCommentFooter";
                    str = "updateOnKeyBoardChange";
                    i2 = C62496c.m73459a(cVar, mMActivity, i, 0, 0, 0, 0, 0, 0, 252, (Object) null);
                    SnsMethodCalculate.markEndTimeMs("refreshInputViewMaxHeightOnKeyboardShow", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
                } else {
                    str3 = "refreshSendEditTextMaxHeight";
                    str2 = "MicroMsg.SnsCommentFooter";
                    str = "updateOnKeyBoardChange";
                    i2 = C62496c.m73459a(cVar, mMActivity, i, c, 0, 0, 0, 0, 0, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
                    SnsMethodCalculate.markEndTimeMs("refreshInputViewMaxHeightOnKeyboardShow", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
                }
                this.f278052h.setMaxHeight(i2);
                Log.m105925i(str2, "refreshSendEditTextMaxHeight maxHeight:%d", Integer.valueOf(i2));
                SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                if (!(this.f278064w == i3 || i3 == 0)) {
                    this.f278064w = i3;
                    C76865k.m92671b(getContext(), i3);
                    mo132718w();
                }
                mo132693o(z, mo132700s());
                SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        }
        str = "updateOnKeyBoardChange";
        this.f278064w = i3;
        C76865k.m92671b(getContext(), i3);
        mo132718w();
        mo132693o(z, mo132700s());
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public String getCommentAtPrefix() {
        SnsMethodCalculate.markStartTimeMs("getCommentAtPrefix", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        String str = this.f278065x;
        SnsMethodCalculate.markEndTimeMs("getCommentAtPrefix", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return str;
    }

    public int getCommentFlag() {
        SnsMethodCalculate.markStartTimeMs("getCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int i = this.f278060s;
        SnsMethodCalculate.markEndTimeMs("getCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return i;
    }

    public w64 getCommentInfo() {
        SnsMethodCalculate.markStartTimeMs("getCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        w64 w64 = this.f278059r;
        if (w64 == null) {
            w64 w642 = new w64();
            SnsMethodCalculate.markEndTimeMs("getCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return w642;
        }
        SnsMethodCalculate.markEndTimeMs("getCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return w64;
    }

    public int getCurrBottom() {
        SnsMethodCalculate.markStartTimeMs("getCurrBottom", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int i = this.f278063v;
        SnsMethodCalculate.markEndTimeMs("getCurrBottom", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return i;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        SnsMethodCalculate.markStartTimeMs("onInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        SnsMethodCalculate.markStartTimeMs("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        boolean z2 = this.f278041D;
        SnsMethodCalculate.markEndTimeMs("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (z2) {
            SnsMethodCalculate.markEndTimeMs("onInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        super.mo1072i0(z, i);
        mo132685G(z, i);
        SnsMethodCalculate.markEndTimeMs("onInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: l */
    public final void mo132690l(boolean z) {
        SnsMethodCalculate.markStartTimeMs("canSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        Log.m105919d("MicroMsg.SnsCommentFooter", "canSend: %b", Boolean.valueOf(z));
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2456di);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2461dn);
        loadAnimation.setDuration(150);
        loadAnimation2.setDuration(150);
        Button button = this.f278055n;
        if (button == null || this.f278056o == null) {
            SnsMethodCalculate.markEndTimeMs("canSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        if (z) {
            if (button.getVisibility() == 8 || this.f278055n.getVisibility() == 4) {
                SnsMethodCalculate.markEndTimeMs("canSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                return;
            }
            this.f278056o.startAnimation(loadAnimation);
            this.f278056o.setVisibility(0);
            this.f278055n.startAnimation(loadAnimation2);
            this.f278055n.setVisibility(8);
        } else if (button.getVisibility() == 0 || this.f278055n.getVisibility() == 0) {
            SnsMethodCalculate.markEndTimeMs("canSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        } else {
            this.f278055n.startAnimation(loadAnimation);
            this.f278055n.setVisibility(0);
            this.f278056o.startAnimation(loadAnimation2);
            this.f278056o.setVisibility(8);
        }
        this.f278056o.getParent().requestLayout();
        SnsMethodCalculate.markEndTimeMs("canSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: m */
    public final void mo132691m() {
        SnsMethodCalculate.markStartTimeMs("changeSmileyPanelGone", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f278057p.setVisibility(8);
        SnsMethodCalculate.markEndTimeMs("changeSmileyPanelGone", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: n */
    public final void mo132692n(boolean z) {
        SnsMethodCalculate.markStartTimeMs("changeSmileyPanelVisibility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        ChatFooterPanel chatFooterPanel = this.f278057p;
        if (chatFooterPanel != null) {
            if (z) {
                chatFooterPanel.setVisibility(0);
            } else {
                SnsMethodCalculate.markStartTimeMs("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                boolean z2 = this.f278041D;
                SnsMethodCalculate.markEndTimeMs("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                if (!z2) {
                    mo132691m();
                } else if (this.f278057p.getVisibility() == 8) {
                    this.f278057p.setVisibility(4);
                }
            }
            Log.m105925i("MicroMsg.SnsCommentFooter", "changeSmileyPanelVisibility: to %d", Integer.valueOf(this.f278057p.getVisibility()));
        }
        SnsMethodCalculate.markEndTimeMs("changeSmileyPanelVisibility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: o */
    public final void mo132693o(boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("checkReadyInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (this.f278052h == null) {
            SnsMethodCalculate.markEndTimeMs("checkReadyInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        if (!z && !z2) {
            Log.m105924i("MicroMsg.SnsCommentFooter", "checkReadyInput: reset input");
            this.f278040C = C99205z.f290902j.mo138558b();
        }
        SnsMethodCalculate.markEndTimeMs("checkReadyInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        super.onConfigurationChanged(configuration);
        if (this.f278057p != null) {
            mo132718w();
        }
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.f278062u;
        if (i5 < i4) {
            i5 = i4;
        }
        this.f278062u = i5;
        this.f278063v = i4;
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: p */
    public void mo132696p() {
        SnsMethodCalculate.markStartTimeMs("clearComment", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f278052h.setText("");
        this.f278052h.setHint("");
        this.f278059r = null;
        this.f278060s = 0;
        this.f278061t = 0;
        SnsMethodCalculate.markEndTimeMs("clearComment", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: q */
    public void mo132697q() {
        SnsMethodCalculate.markStartTimeMs("hideInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        Log.m105924i("MicroMsg.SnsCommentFooter", "hideInput: ");
        this.f278050f.hideVKB();
        SnsMethodCalculate.markEndTimeMs("hideInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: r */
    public boolean mo132699r() {
        SnsMethodCalculate.markStartTimeMs("isEmojiCommentEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        boolean z = this.f278067z;
        SnsMethodCalculate.markEndTimeMs("isEmojiCommentEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return z;
    }

    /* renamed from: s */
    public boolean mo132700s() {
        SnsMethodCalculate.markStartTimeMs("isInSmileState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        boolean z = true;
        if (this.f278061t != 1) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isInSmileState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return z;
    }

    public void setAfterEditAction(Runnable runnable) {
        SnsMethodCalculate.markStartTimeMs("setAfterEditAction", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        Class cls = C101980n.class;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f278050f, C0966R.C0971layout.c2k, this);
        this.f278053i = (ImageView) viewGroup.findViewById(C0966R.C0970id.f5691lz);
        this.f278054j = (ImageView) viewGroup.findViewById(C0966R.C0970id.f5692m0);
        this.f278055n = (Button) viewGroup.findViewById(C0966R.C0970id.f5706md);
        this.f278056o = (Button) viewGroup.findViewById(C0966R.C0970id.f5699m7);
        this.f278058q = (SnsEditTipsWidget) viewGroup.findViewById(C0966R.C0970id.g6z);
        C74974a aVar = (C74974a) viewGroup.findViewById(C0966R.C0970id.f5695m3);
        this.f278052h = aVar;
        aVar.mo104239a(((C101980n) C86312j.m106911c(cls)).Kr0());
        this.f278052h.getInputExtras(true).putBoolean("if_support_wx_emoji", true);
        this.f278052h.getInputExtras(true).putInt("wechat_scene", 6);
        this.f278055n.setContentDescription(this.f278050f.getString(C0966R.string.mdu));
        SnsMethodCalculate.markStartTimeMs("initSelectHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f278052h.mo104244e(((C101980n) C86312j.m106911c(cls)).mo134685Hw(), LocaleUtil.getCurrentLanguage(this.f278050f), new C71236c4(this), (C110588j.C77559a.C77560a) null);
        this.f278052h.addTextChangedListener(new C71237d4(this));
        SnsMethodCalculate.markEndTimeMs("initSelectHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        mo132690l(false);
        this.f278053i.setOnClickListener(new C71239f4(this));
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(C0966R.C0970id.f5704mb);
        this.f278051g = imageButton;
        imageButton.setOnClickListener(new C95792g4(this));
        this.f278052h.setHint(this.f278050f.getString(C0966R.string.jjl));
        this.f278052h.setOnTouchListener(new C95806h4(this));
        if (C30699x0.m39154a() == null) {
            this.f278057p = new C72834u0(this.f278050f);
            SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        } else {
            ChatFooterPanel si02 = C30699x0.m39154a().si0(getContext());
            this.f278057p = si02;
            si02.setEntranceScene(6);
            this.f278057p.setVisibility(8);
            int validPanelHeight = KeyBoardUtil.getValidPanelHeight(getContext());
            this.f278064w = validPanelHeight;
            ((LinearLayout) findViewById(C0966R.C0970id.iwc)).addView(this.f278057p, -1, validPanelHeight);
            Log.m105925i("MicroMsg.SnsCommentFooter", "init: height %s, addView, Gone smileyPanel", Integer.valueOf(this.f278064w));
            if (!this.f278067z) {
                this.f278057p.mo100191d();
            }
            this.f278057p.mo100197i();
            this.f278057p.setOnTextOperationListener(new C71240i4(this));
            C78158s0 d = C78160t0.m94373d();
            d.f229009a = new C71233b4(this);
            this.f278057p.setCallback(d);
            SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        }
        SnsMethodCalculate.markEndTimeMs("setAfterEditAction", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setAnitiomAdjust(C96116p8 p8Var) {
        SnsMethodCalculate.markStartTimeMs("setAnitiomAdjust", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f278049L = p8Var;
        SnsMethodCalculate.markEndTimeMs("setAnitiomAdjust", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setCommentAtPrefix(String str) {
        SnsMethodCalculate.markStartTimeMs("setCommentAtPrefix", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        Log.m105925i("MicroMsg.SnsCommentFooter", "setCommentAtPrefix: %s", str);
        this.f278065x = str;
        SnsMethodCalculate.markEndTimeMs("setCommentAtPrefix", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setCommentFlag(int i) {
        SnsMethodCalculate.markStartTimeMs("setCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f278060s = i | this.f278060s;
        SnsMethodCalculate.markEndTimeMs("setCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setCommentHint(String str) {
        Class cls = C76979h.class;
        SnsMethodCalculate.markStartTimeMs("setCommentHint", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (Util.isNullOrNil(str)) {
            this.f278052h.setHint("");
        } else if (C98242p.m126942d(this.f278060s, 1)) {
            C74974a aVar = this.f278052h;
            Context context = getContext();
            aVar.setHint(((C76979h) C86312j.m106911c(cls)).yp0(context, this.f278050f.getString(C0966R.string.j9j) + str + this.f278050f.getString(C0966R.string.jan, new Object[]{Float.valueOf(this.f278052h.getTextSize())}), this.f278052h.getTextSize()));
        } else {
            this.f278052h.setHint(((C76979h) C86312j.m106911c(cls)).yp0(getContext(), str, this.f278052h.getTextSize()));
        }
        SnsMethodCalculate.markEndTimeMs("setCommentHint", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setCommentInfo(w64 w64) {
        SnsMethodCalculate.markStartTimeMs("setCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        boolean z = true;
        Object[] objArr = new Object[1];
        if (w64 != null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105919d("MicroMsg.SnsCommentFooter", "setCommentInfo: null = [%b]", objArr);
        this.f278059r = w64;
        SnsMethodCalculate.markEndTimeMs("setCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setFeedEmojiCommentEnable(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setFeedEmojiCommentEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f278038A = z;
        Log.m105925i("MicroMsg.SnsCommentFooter", "setFeedEmojiCommentEnable:%s", Boolean.valueOf(z));
        SnsMethodCalculate.markEndTimeMs("setFeedEmojiCommentEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setModeClick(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setModeClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        SnsMethodCalculate.markEndTimeMs("setModeClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setOnCommentSendImp(C95535f fVar) {
        SnsMethodCalculate.markStartTimeMs("setOnCommentSendImp", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f278066y = fVar;
        this.f278056o.setOnClickListener(new C95528a(fVar));
        SnsMethodCalculate.markEndTimeMs("setOnCommentSendImp", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setOnEditTouchListener(C95534e eVar) {
        SnsMethodCalculate.markStartTimeMs("setOnEditTouchListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f278047J = eVar;
        SnsMethodCalculate.markEndTimeMs("setOnEditTouchListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setOnSmileyShowListener(C95536g gVar) {
        SnsMethodCalculate.markStartTimeMs("setOnSmileyShowListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f278048K = gVar;
        SnsMethodCalculate.markEndTimeMs("setOnSmileyShowListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setSnsInfo(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        boolean z = true;
        Object[] objArr = new Object[1];
        if (snsInfo != null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105919d("MicroMsg.SnsCommentFooter", "setSnsInfo: null = [%b]", objArr);
        this.f278039B = snsInfo;
        SnsMethodCalculate.markEndTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setText(String str) {
        SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        C74974a aVar = this.f278052h;
        if (aVar != null) {
            aVar.setText("");
            this.f278052h.mo98046o(str);
        }
        SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setToSendTextColor(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setToSendTextColor", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        C74974a aVar = this.f278052h;
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("setToSendTextColor", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        if (z) {
            aVar.setTextColor(getResources().getColor(C0966R.color.a4p));
        } else {
            aVar.setTextColor(getResources().getColor(C0966R.color.f3552xi));
            mo132698q(false);
        }
        SnsMethodCalculate.markEndTimeMs("setToSendTextColor", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void setVisibility(int i) {
        SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        boolean z = false;
        this.f278061t = 0;
        if (i == 0) {
            z = true;
        }
        mo132683E(z);
        super.setVisibility(i);
        SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: t */
    public boolean mo132716t() {
        SnsMethodCalculate.markStartTimeMs("isReplyingContentEmpty", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (this.f278052h.getText() == null || Util.isNullOrNil(this.f278052h.getText().toString())) {
            SnsMethodCalculate.markEndTimeMs("isReplyingContentEmpty", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("isReplyingContentEmpty", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return false;
    }

    /* renamed from: v */
    public void mo132717v() {
        SnsMethodCalculate.markStartTimeMs("onDestory", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        Log.m105924i("MicroMsg.SnsCommentFooter", "onDestory: ");
        this.f278049L = null;
        if (this.f278057p != null) {
            Log.m105924i("MicroMsg.SnsCommentFooter", "commentfooter release");
            this.f278057p.mo100200l();
            this.f278057p.mo100189b();
        }
        C74974a aVar = this.f278052h;
        if (aVar != null) {
            aVar.destroy();
        }
        SnsMethodCalculate.markEndTimeMs("onDestory", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: w */
    public final void mo132718w() {
        ViewGroup.LayoutParams layoutParams;
        SnsMethodCalculate.markStartTimeMs("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int i = this.f278064w;
        if (i <= 0) {
            i = KeyBoardUtil.getValidPanelHeight(getContext());
        }
        Log.m105925i("MicroMsg.SnsCommentFooter", "refreshBottomPanelHeight: %s", Integer.valueOf(i));
        ChatFooterPanel chatFooterPanel = this.f278057p;
        if (!(chatFooterPanel == null || (layoutParams = chatFooterPanel.getLayoutParams()) == null)) {
            layoutParams.height = i;
            this.f278057p.setLayoutParams(layoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: x */
    public void mo132719x(int i) {
        SnsMethodCalculate.markStartTimeMs("replaceCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f278060s = i;
        SnsMethodCalculate.markEndTimeMs("replaceCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: z */
    public void mo132720z() {
        SnsMethodCalculate.markStartTimeMs("sendETListen", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        C74974a aVar = this.f278052h;
        if (aVar == null) {
            Log.m105920e("MicroMsg.SnsCommentFooter", "send edittext is null");
            SnsMethodCalculate.markEndTimeMs("sendETListen", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        aVar.removeTextChangedListener(this.f278046I);
        this.f278052h.addTextChangedListener(this.f278046I);
        SnsMethodCalculate.markEndTimeMs("sendETListen", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: q */
    public void mo132698q(boolean z) {
        SnsMethodCalculate.markStartTimeMs("focusEdt", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        Log.m105925i("MicroMsg.SnsCommentFooter", "focusEdt: %s, %s", Boolean.valueOf(z), this.f278052h);
        C74974a aVar = this.f278052h;
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("focusEdt", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        if (z) {
            aVar.mo104256m();
        } else {
            aVar.clearFocus();
        }
        SnsMethodCalculate.markEndTimeMs("focusEdt", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }
}
