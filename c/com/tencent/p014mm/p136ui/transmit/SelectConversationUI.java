package com.tencent.p014mm.p136ui.transmit;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FavInitConfirmDialogContentEvent;
import com.tencent.p014mm.autogen.events.OpenNoteFromSessionEvent;
import com.tencent.p014mm.autogen.events.RecordOperationEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FowardMsgReportStruct;
import com.tencent.p014mm.choosemsgfile.compat.MsgFile;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.modelstat.C68144a;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.chatting.C73313b1;
import com.tencent.p014mm.p136ui.chatting.C73687g1;
import com.tencent.p014mm.p136ui.chatting.C97182r4;
import com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI;
import com.tencent.p014mm.p136ui.contact.C57827q0;
import com.tencent.p014mm.p136ui.contact.C74481e2;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74500h3;
import com.tencent.p014mm.p136ui.contact.C74502i1;
import com.tencent.p014mm.p136ui.contact.C74504i3;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.C74551q1;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.p136ui.contact.SelectContactUI;
import com.tencent.p014mm.p136ui.contact.item.RecentForwardListDataItem;
import com.tencent.p014mm.p136ui.mvvm.MvvmSelectContactUI;
import com.tencent.p014mm.p136ui.transmit.C74917p;
import com.tencent.p014mm.p136ui.transmit.C74920q;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.MMTextView;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.plugin.base.stub.C68748c;
import com.tencent.p014mm.plugin.comm.C55593g;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.pluginsdk.model.app.ReportUtil;
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sendtowework.BaseDataToWeWork;
import com.tencent.p014mm.sendtowework.TextData;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.wework.api.IWWAPI;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import d62.C75339i;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45612m0;
import eb0.C45628s0;
import eb0.C75571d6;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86737h0;
import fy3.C32224a;
import gc0.C20828a;
import gl3.C75922b;
import gl3.C75925c;
import gl3.C75952p;
import gl3.C75976w;
import gy3.C87412m;
import hc0.C20937c;
import hd0.C98410o0;
import he0.C76158j;
import ht1.C60175i;
import ht1.C60181l;
import ht1.C60200t1;
import ht1.C76243a5;
import ic0.C21070h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jc0.C21210b;
import js0.C9515s;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import k60.C99101e;
import kb0.C76529i;
import ke3.C88144b;
import kg3.C76577a;
import lb0.C88394b;
import lb0.C88431k;
import lc3.C10485b;
import n60.C100075f;
import nj3.C76879j;
import nj3.C88989a;
import nj3.C88990b;
import p151er.C75651n;
import p158gt.C98201k;
import p185kq.C76622f;
import p282z2.C16095a;
import p548hg.C98450d;
import p565ir.C60606n;
import p565ir.C60613r;
import p625nu.C100196e;
import p629ny.C76979h;
import p682rz.C101488s;
import p740wo.C53193b;
import p763ym.C79139p;
import p775zi.C79332c;
import p823sg.C90193h;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62368t0;
import qg2.C101147j0;
import qo3.C77398g;
import rn3.C77543c0;
import rn3.C77544d0;
import rn3.C77548e0;
import rn3.C77550f0;
import rx3.C13598b0;
import se3.C77685c;
import sn3.C13745k;
import te3.C64287ci1;
import te3.C64350ew2;
import te3.C77915dp3;
import uf0.C102016c;
import un3.C78244i;
import up1.C27696y;
import vm3.C65764a;
import vm3.C78444g;
import wc3.C78538u;
import wd3.C65953v0;
import wd3.C78575u;
import xm3.C78870a;
import xm3.C78877c0;
import xm3.C78889f0;
import xm3.C78917n;
import xm3.C78924o0;
import xm3.C78928r;
import xm3.C78938y;
import xm3.C78944z;
import yb2.C79062b;
import z04.C112551y;
import za2.C102984b;
import zt3.C119157j;

@C86737h0
@C88989a(19)
/* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI */
public class SelectConversationUI extends MMBaseSelectContactUI {

    /* renamed from: K1 */
    public static final int f220137K1 = C74560s1.m89278g(1, 2);

    /* renamed from: A1 */
    public long f220138A1;

    /* renamed from: B1 */
    public int f220139B1 = 0;

    /* renamed from: C */
    public RelativeLayout f220140C;

    /* renamed from: C1 */
    public int f220141C1;

    /* renamed from: D */
    public RelativeLayout f220142D;

    /* renamed from: D1 */
    public int f220143D1;

    /* renamed from: E */
    public LinearLayout f220144E;

    /* renamed from: E1 */
    public boolean f220145E1 = false;

    /* renamed from: F */
    public ImageView f220146F;

    /* renamed from: F1 */
    public boolean f220147F1 = false;

    /* renamed from: G */
    public TextView f220148G;

    /* renamed from: G1 */
    public boolean f220149G1 = false;

    /* renamed from: H */
    public TextView f220150H;

    /* renamed from: H1 */
    public boolean f220151H1 = true;

    /* renamed from: I */
    public boolean f220152I = false;

    /* renamed from: I1 */
    public MenuItem.OnMenuItemClickListener f220153I1 = new C74886g0();

    /* renamed from: J */
    public boolean f220154J = false;

    /* renamed from: J1 */
    public MenuItem.OnMenuItemClickListener f220155J1 = new C74888h0();

    /* renamed from: K */
    public boolean f220156K = false;

    /* renamed from: L */
    public boolean f220157L = false;

    /* renamed from: M */
    public boolean f220158M = false;

    /* renamed from: N */
    public boolean f220159N = false;

    /* renamed from: P */
    public boolean f220160P = false;

    /* renamed from: Q */
    public boolean f220161Q = false;

    /* renamed from: Q0 */
    public String f220162Q0;

    /* renamed from: R */
    public boolean f220163R = false;

    /* renamed from: R0 */
    public String f220164R0;

    /* renamed from: S */
    public boolean f220165S = false;

    /* renamed from: S0 */
    public Boolean f220166S0 = Boolean.FALSE;

    /* renamed from: T */
    public int f220167T = 0;

    /* renamed from: T0 */
    public boolean f220168T0 = false;

    /* renamed from: U */
    public boolean f220169U = false;

    /* renamed from: U0 */
    public boolean f220170U0 = false;

    /* renamed from: V */
    public long f220171V;

    /* renamed from: V0 */
    public List<String> f220172V0 = null;

    /* renamed from: W */
    public String f220173W;

    /* renamed from: W0 */
    public Map<String, Integer> f220174W0 = null;

    /* renamed from: X */
    public int f220175X;

    /* renamed from: X0 */
    public boolean f220176X0;

    /* renamed from: Y */
    public boolean f220177Y = false;

    /* renamed from: Y0 */
    public ReportUtil.ReportArgs f220178Y0;

    /* renamed from: Z */
    public boolean f220179Z = false;

    /* renamed from: Z0 */
    public BaseDataToWeWork f220180Z0;

    /* renamed from: a1 */
    public int f220181a1;

    /* renamed from: b1 */
    public int f220182b1;

    /* renamed from: c1 */
    public long f220183c1;

    /* renamed from: d1 */
    public ArrayList<Long> f220184d1;

    /* renamed from: e1 */
    public List<C72963f4> f220185e1;

    /* renamed from: f1 */
    public String f220186f1;

    /* renamed from: g1 */
    public String f220187g1;

    /* renamed from: h1 */
    public C72963f4 f220188h1;

    /* renamed from: i1 */
    public String f220189i1;

    /* renamed from: j1 */
    public int f220190j1;

    /* renamed from: k1 */
    public boolean f220191k1 = false;

    /* renamed from: l1 */
    public String f220192l1 = null;

    /* renamed from: m1 */
    public String f220193m1;

    /* renamed from: n1 */
    public String f220194n1 = null;

    /* renamed from: o1 */
    public String f220195o1 = null;

    /* renamed from: p0 */
    public boolean f220196p0 = false;

    /* renamed from: p1 */
    public String f220197p1 = null;

    /* renamed from: q1 */
    public C74481e2 f220198q1;

    /* renamed from: r1 */
    public boolean f220199r1;

    /* renamed from: s1 */
    public List<String> f220200s1;

    /* renamed from: t1 */
    public String f220201t1;

    /* renamed from: u1 */
    public String f220202u1;

    /* renamed from: v1 */
    public int f220203v1;

    /* renamed from: w1 */
    public String f220204w1;

    /* renamed from: x0 */
    public int f220205x0 = -1;

    /* renamed from: x1 */
    public int f220206x1 = 0;

    /* renamed from: y0 */
    public long f220207y0 = -1;

    /* renamed from: y1 */
    public boolean f220208y1 = false;

    /* renamed from: z1 */
    public boolean f220209z1 = false;

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$e */
    public class C24300e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f69771d;

        /* renamed from: e */
        public final /* synthetic */ int f69772e;

        /* renamed from: f */
        public final /* synthetic */ int f69773f;

        /* renamed from: g */
        public final /* synthetic */ int f69774g;

        /* renamed from: h */
        public final /* synthetic */ int f69775h;

        /* renamed from: i */
        public final /* synthetic */ int f69776i;

        /* renamed from: j */
        public final /* synthetic */ int f69777j;

        /* renamed from: n */
        public final /* synthetic */ int f69778n;

        /* renamed from: o */
        public final /* synthetic */ String f69779o;

        /* renamed from: p */
        public final /* synthetic */ int f69780p;

        /* renamed from: q */
        public final /* synthetic */ long f69781q;

        /* renamed from: r */
        public final /* synthetic */ String f69782r;

        /* renamed from: s */
        public final /* synthetic */ int f69783s;

        /* renamed from: t */
        public final /* synthetic */ SelectConversationUI f69784t;

        public C24300e(SelectConversationUI selectConversationUI, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str2, int i8, long j, String str3, int i9, int i15) {
            this.f69784t = selectConversationUI;
            this.f69771d = str;
            this.f69772e = i;
            this.f69773f = i2;
            this.f69774g = i3;
            this.f69775h = i4;
            this.f69776i = i5;
            this.f69777j = i6;
            this.f69778n = i7;
            this.f69779o = str2;
            this.f69780p = i8;
            this.f69781q = j;
            this.f69782r = str3;
            this.f69783s = i9;
        }

        public void run() {
            SelectConversationUI selectConversationUI = this.f69784t;
            int i = SelectConversationUI.f220137K1;
            String v8 = selectConversationUI.mo104144v8(2);
            String str = this.f69771d;
            long j = (long) this.f69777j;
            long j2 = (long) this.f69778n;
            String str2 = this.f69779o;
            long j3 = j2;
            long j4 = (long) this.f69780p;
            long j5 = this.f69781q;
            String str3 = this.f69782r;
            long j6 = j5;
            int i2 = this.f69783s;
            long j7 = (long) this.f69776i;
            C87412m.m108594g(str, "msgTypeList");
            C87412m.m108594g(v8, "appMsgInnerTypeList");
            C87412m.m108594g(str3, "delListString");
            FowardMsgReportStruct fowardMsgReportStruct = new FowardMsgReportStruct();
            long j8 = (long) 2;
            fowardMsgReportStruct.f69506d = fowardMsgReportStruct.mo86045b("MsgTypeList", str, true);
            fowardMsgReportStruct.f69507e = (long) this.f69772e;
            fowardMsgReportStruct.f69508f = (long) this.f69773f;
            fowardMsgReportStruct.f69509g = (long) this.f69774g;
            fowardMsgReportStruct.f69510h = (long) this.f69775h;
            fowardMsgReportStruct.f69511i = j7;
            fowardMsgReportStruct.f69512j = j;
            fowardMsgReportStruct.f69513k = j3;
            fowardMsgReportStruct.f69514l = fowardMsgReportStruct.mo86045b("ToUser", str2 == null ? "" : str2, true);
            fowardMsgReportStruct.f69516n = fowardMsgReportStruct.mo86045b("InnerAppMsgTypeList", v8, true);
            fowardMsgReportStruct.f69515m = j4;
            fowardMsgReportStruct.f69517o = j6;
            fowardMsgReportStruct.f69521s = fowardMsgReportStruct.mo86045b("Del_list", str3, true);
            fowardMsgReportStruct.f69520r = (long) i2;
            long j9 = 0;
            fowardMsgReportStruct.f69519q = 0;
            fowardMsgReportStruct.f69518p = j8;
            if (C45612m0.m50706w(str2)) {
                j9 = 1;
            }
            fowardMsgReportStruct.f69522t = j9;
            fowardMsgReportStruct.mo86054n();
            String q = fowardMsgReportStruct.mo1006q();
            C87412m.m108593f(q, "struct.toShowString()");
            Log.m105925i("ForwardReporter", "report%s %s", 23009, C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
            this.f69784t.f220191k1 = true;
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$e0 */
    public class C57852e0 implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ View f165486a;

        /* renamed from: b */
        public final /* synthetic */ boolean[] f165487b;

        public C57852e0(View view, boolean[] zArr) {
            this.f165486a = view;
            this.f165487b = zArr;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            Bitmap bitmap = bVar.f59988d;
            if (bitmap == null || bitmap.isRecycled()) {
                this.f165487b[0] = true;
                return;
            }
            C55593g.f158270a.mo77114b(SelectConversationUI.this.getContext(), this.f165486a, bVar.f59988d, C90193h.m112878f(str.getBytes()));
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$a */
    public class C74875a implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ String f220210a;

        public C74875a(String str) {
            this.f220210a = str;
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            SelectConversationUI.this.hideVKB();
            if (z) {
                Intent intent = new Intent();
                if (C72996z1.m85820U5(this.f220210a)) {
                    SelectConversationUI selectConversationUI = SelectConversationUI.this;
                    selectConversationUI.mo104126O8(intent, selectConversationUI.f220162Q0, this.f220210a);
                } else {
                    SelectConversationUI selectConversationUI2 = SelectConversationUI.this;
                    String str2 = selectConversationUI2.f220162Q0;
                    String str3 = this.f220210a;
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(str3);
                    selectConversationUI2.mo104125N8(intent, str2, linkedList);
                }
                intent.putExtra("custom_send_text", str);
                SelectConversationUI selectConversationUI3 = SelectConversationUI.this;
                String str4 = this.f220210a;
                int i2 = SelectConversationUI.f220137K1;
                selectConversationUI3.mo104122K8(str4);
                SelectConversationUI.this.mo104127P8(-1, intent);
                SelectConversationUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$a0 */
    public class C74876a0 implements C77398g.C77402i.C77404b {
        public C74876a0(SelectConversationUI selectConversationUI) {
        }

        /* renamed from: a */
        public void mo25a() {
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$b */
    public class C74877b implements C79332c.C79333a {
        public C74877b() {
        }

        /* renamed from: a */
        public void mo104148a(int i, String str, ArrayList<MsgFile> arrayList) {
            Log.m105925i("MicroMsg.SelectConversationUI", "resultCode:%d filePaths:%s", Integer.valueOf(i), arrayList);
            if (i == -1) {
                Intent intent = new Intent();
                intent.putParcelableArrayListExtra("FILEPATHS", arrayList);
                SelectConversationUI.this.setResult(-1, intent);
                SelectConversationUI.this.finish();
            } else if (i == 1) {
                Intent intent2 = new Intent();
                intent2.putExtra("ERRMSG", str);
                SelectConversationUI.this.setResult(1, intent2);
                SelectConversationUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$b0 */
    public class C74878b0 implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ C68070l.C68072b f220213a;

        public C74878b0(C68070l.C68072b bVar) {
            this.f220213a = bVar;
        }

        /* renamed from: a */
        public void mo25a() {
            Intent intent = new Intent(SelectConversationUI.this.getContext(), RetransmitPreviewUI.class);
            intent.putExtra("Retr_Msg_content", this.f220213a.f195570f);
            SelectConversationUI selectConversationUI = SelectConversationUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SelectConversationUI selectConversationUI2 = selectConversationUI;
            C117292a.m165358d(selectConversationUI2, aVar.mo10232b(), "com/tencent/mm/ui/transmit/SelectConversationUI$36", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            selectConversationUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(selectConversationUI2, "com/tencent/mm/ui/transmit/SelectConversationUI$36", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C88990b.m111199h(SelectConversationUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$c */
    public class C74879c implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ String f220215a;

        public C74879c(String str) {
            this.f220215a = str;
        }

        /* renamed from: a */
        public void mo25a() {
            if (SelectConversationUI.this.f220182b1 != 4) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", this.f220215a);
                intent.putExtra("hide_option_menu", true);
                C88144b.m109791i(SelectConversationUI.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$c0 */
    public class C74880c0 implements C77398g.C77402i.C77404b {
        public C74880c0() {
        }

        /* renamed from: a */
        public void mo25a() {
            RecordOperationEvent d = C73313b1.m86458d(SelectConversationUI.this.getContext());
            RecordOperationEvent.C92552b bVar = d.f265028e;
            C77685c cVar = bVar.f265054g;
            C68070l.C68072b u = C68070l.C68072b.m80422u(Util.processXml(C101147j0.m132626g(cVar.f226460d, cVar.f226461e, bVar.f265053f.f264674d.f264676a, d.f265027d.f265042n, SelectConversationUI.this.f220183c1)), (String) null);
            if (u != null) {
                Intent intent = new Intent();
                intent.putExtra("message_id", SelectConversationUI.this.f220183c1);
                intent.putExtra("record_xml", u.f195571f0);
                intent.putExtra("record_show_share", false);
                C88144b.m109791i(SelectConversationUI.this.getContext(), "record", ".ui.RecordMsgDetailUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$d */
    public class C74881d implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ Intent f220218a;

        /* renamed from: b */
        public final /* synthetic */ String f220219b;

        public C74881d(Intent intent, String str) {
            this.f220218a = intent;
            this.f220219b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:73:0x0244  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0246  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x024d  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0251  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x025f  */
        /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo23a(boolean r21, java.lang.String r22, int r23) {
            /*
                r20 = this;
                r0 = r20
                com.tencent.mm.ui.transmit.SelectConversationUI r1 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                r1.hideVKB()
                android.content.Intent r1 = r0.f220218a
                java.lang.String r2 = "need_delete_chatroom_when_cancel"
                r3 = 0
                boolean r1 = r1.getBooleanExtra(r2, r3)
                r2 = 1
                r4 = 2
                if (r1 == 0) goto L_0x0038
                java.lang.Object[] r5 = new java.lang.Object[r4]
                r6 = 13943(0x3677, float:1.9538E-41)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                r5[r3] = r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r21)
                r5[r2] = r7
                java.lang.String r7 = "MicroMsg.SelectContactReportLogic"
                java.lang.String r8 = "reportCreateChatroomOperation %d %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r5)
                com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r7 = new java.lang.Object[r2]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r21)
                r7[r3] = r8
                r5.mo160131h(r6, r7)
            L_0x0038:
                java.lang.String r8 = ""
                r9 = 0
                if (r21 == 0) goto L_0x0213
                android.content.Intent r1 = r0.f220218a
                java.lang.String r10 = "custom_send_text"
                r11 = r22
                r1.putExtra(r10, r11)
                android.content.Intent r1 = r0.f220218a
                com.tencent.mm.ui.transmit.SelectConversationUI r10 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                boolean r10 = r10.f220208y1
                java.lang.String r11 = "KSendGroupToDo"
                r1.putExtra(r11, r10)
                android.content.Intent r1 = r0.f220218a
                com.tencent.mm.ui.transmit.SelectConversationUI r10 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                int r10 = r10.f220206x1
                java.lang.String r11 = "KShowTodoIntroduceView"
                r1.putExtra(r11, r10)
                com.tencent.mm.ui.transmit.SelectConversationUI r1 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                r10 = -1
                android.content.Intent r11 = r0.f220218a
                r1.mo104127P8(r10, r11)
                com.tencent.mm.ui.transmit.SelectConversationUI r1 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                com.tencent.mm.storage.f4 r10 = r1.f220188h1
                java.lang.String r1 = r1.f220193m1
                java.lang.String r11 = r0.f220219b
                java.lang.String r12 = "UTF-8"
                java.lang.String r13 = ","
                java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r1)
                com.tencent.mm.message.l$b r14 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r14, r9)
                if (r14 == 0) goto L_0x0082
                java.lang.String r15 = r14.f195562d
                boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
                if (r15 == 0) goto L_0x00a8
            L_0x0082:
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r1)
                com.tencent.mm.message.l$b r14 = com.tencent.p014mm.message.C68070l.C68072b.m80423v(r3, r1)
                if (r14 == 0) goto L_0x00a8
                if (r10 == 0) goto L_0x00a8
                boolean r1 = r10.mo100979R3()
                if (r1 != 0) goto L_0x00a6
                boolean r1 = r10.mo100961A3()
                if (r1 == 0) goto L_0x009b
                goto L_0x00a6
            L_0x009b:
                boolean r1 = r10.mo100994f4()
                if (r1 == 0) goto L_0x00a8
                r1 = 38
                r14.f195582i = r1
                goto L_0x00a8
            L_0x00a6:
                r14.f195582i = r4
            L_0x00a8:
                java.lang.String r1 = "MicroMsg.ShareReport"
                if (r14 != 0) goto L_0x00b7
                java.lang.String r3 = "reportMsgTransmit msgContent parse failed"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r3)
            L_0x00b1:
                r18 = r8
                r16 = 1
                goto L_0x01dc
            L_0x00b7:
                java.lang.String r15 = r14.f195562d
                com.tencent.mm.pluginsdk.model.app.j r15 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48987g(r15)
                if (r15 != 0) goto L_0x00c0
                goto L_0x00b1
            L_0x00c0:
                java.lang.String r9 = r15.field_appId
                java.lang.String r5 = r15.field_appName
                boolean r15 = r15.mo69359k()
                int r6 = r14.f195582i
                boolean r10 = com.tencent.p014mm.storage.C72996z1.m85820U5(r11)
                java.lang.String r7 = r14.f195586j     // Catch:{ UnsupportedEncodingException -> 0x01d3 }
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)     // Catch:{ UnsupportedEncodingException -> 0x01d3 }
                java.lang.String r7 = p206nj.C117627q.m165909b(r7, r12)     // Catch:{ UnsupportedEncodingException -> 0x01d3 }
                java.lang.String r2 = r14.f195570f     // Catch:{ UnsupportedEncodingException -> 0x01d3 }
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)     // Catch:{ UnsupportedEncodingException -> 0x01d3 }
                java.lang.String r2 = p206nj.C117627q.m165909b(r2, r12)     // Catch:{ UnsupportedEncodingException -> 0x01d3 }
                java.lang.String r3 = r14.f195574g     // Catch:{ UnsupportedEncodingException -> 0x01d3 }
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)     // Catch:{ UnsupportedEncodingException -> 0x01d3 }
                java.lang.String r3 = p206nj.C117627q.m165909b(r3, r12)     // Catch:{ UnsupportedEncodingException -> 0x01d3 }
                java.lang.String r4 = r14.f195577g2     // Catch:{ UnsupportedEncodingException -> 0x01d3 }
                java.lang.String r0 = r14.f195569e2     // Catch:{ UnsupportedEncodingException -> 0x01d3 }
                r18 = r8
                int r8 = r14.f195653z2     // Catch:{ UnsupportedEncodingException -> 0x01d1 }
                r19 = r1
                java.lang.Class<com.tencent.mm.pluginsdk.ui.tools.m> r1 = com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m.class
                com.tencent.mm.message.g r1 = r14.mo93555w(r1)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                com.tencent.mm.pluginsdk.ui.tools.m r1 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r1     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                if (r1 == 0) goto L_0x010f
                java.lang.String r14 = r1.f212519b     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                if (r14 != 0) goto L_0x010f
                java.lang.String r1 = r1.f212519b     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                java.lang.String r1 = p206nj.C117627q.m165909b(r1, r12)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                goto L_0x0111
            L_0x010f:
                r1 = r18
            L_0x0111:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.<init>()     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r9)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r6)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r10)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r14 = 2
                r12.append(r14)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r2)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r7)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r4)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r12.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                java.lang.String r12 = r12.toString()     // Catch:{ UnsupportedEncodingException -> 0x01ce }
                r13 = r19
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r12)     // Catch:{ UnsupportedEncodingException -> 0x01cb }
                com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ UnsupportedEncodingException -> 0x01cb }
                r14 = 15
                java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ UnsupportedEncodingException -> 0x01cb }
                r17 = 0
                r14[r17] = r18     // Catch:{ UnsupportedEncodingException -> 0x01cb }
                r16 = 1
                r14[r16] = r9     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r9 = 2
                r14[r9] = r5     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r15)     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r9 = 3
                r14[r9] = r5     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r5 = 4
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r14[r5] = r6     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r6 = 5
                r14[r6] = r5     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r5 = 2
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r5 = 6
                r14[r5] = r6     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r5 = 7
                r14[r5] = r11     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r5 = 8
                r14[r5] = r2     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r2 = 9
                r14[r2] = r3     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r2 = 10
                r14[r2] = r7     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r2 = 11
                r14[r2] = r4     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r2 = 12
                r14[r2] = r0     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r0 = 13
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r14[r0] = r2     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r0 = 14
                r14[r0] = r1     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                r0 = 16492(0x406c, float:2.311E-41)
                r12.mo160131h(r0, r14)     // Catch:{ UnsupportedEncodingException -> 0x01d7 }
                goto L_0x01dc
            L_0x01cb:
                r16 = 1
                goto L_0x01d7
            L_0x01ce:
                r13 = r19
                goto L_0x01cb
            L_0x01d1:
                r13 = r1
                goto L_0x01cb
            L_0x01d3:
                r13 = r1
                r18 = r8
                goto L_0x01cb
            L_0x01d7:
                java.lang.String r0 = "URLEncoder.encode Error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            L_0x01dc:
                r0 = r20
                com.tencent.mm.ui.transmit.SelectConversationUI r1 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                boolean r2 = r1.f220170U0
                if (r2 != 0) goto L_0x01ee
                boolean r2 = r1.f220176X0
                if (r2 == 0) goto L_0x01ee
                com.tencent.mm.storage.f4 r1 = r1.f220188h1
                r2 = 5
                com.tencent.p014mm.modelstat.C68144a.m80546b(r1, r2)
            L_0x01ee:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onDialogClick:  forward click ok. UserName："
                r1.append(r2)
                java.lang.String r2 = r0.f220219b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "MicroMsg.SelectConversationUI"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                com.tencent.mm.ui.transmit.SelectConversationUI r1 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                java.lang.String r2 = r0.f220219b
                r1.mo104122K8(r2)
                com.tencent.mm.ui.transmit.SelectConversationUI r1 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                r1.finish()
                goto L_0x023e
            L_0x0213:
                r18 = r8
                r16 = 1
                if (r1 == 0) goto L_0x022e
                android.content.Intent r1 = r0.f220218a
                java.lang.String r2 = "Select_Contact"
                java.lang.String r1 = r1.getStringExtra(r2)
                eb0.c r2 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v3 r2 = r2.mo105908w()
                com.tencent.mm.storage.i2 r2 = (com.tencent.p014mm.storage.C44660i2) r2
                r2.mo69763f(r1)
            L_0x022e:
                com.tencent.mm.ui.transmit.SelectConversationUI r1 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                boolean r2 = r1.f220170U0
                if (r2 != 0) goto L_0x023e
                boolean r2 = r1.f220176X0
                if (r2 == 0) goto L_0x023e
                com.tencent.mm.storage.f4 r1 = r1.f220188h1
                r2 = 6
                com.tencent.p014mm.modelstat.C68144a.m80546b(r1, r2)
            L_0x023e:
                com.tencent.mm.ui.transmit.SelectConversationUI r1 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                java.lang.String r3 = r0.f220219b
                if (r21 == 0) goto L_0x0246
                r8 = 2
                goto L_0x0247
            L_0x0246:
                r8 = 1
            L_0x0247:
                int r2 = r1.f220182b1
                r4 = 10
                if (r2 == r4) goto L_0x0251
                r4 = 2
                if (r2 != r4) goto L_0x0292
                goto L_0x0252
            L_0x0251:
                r4 = 2
            L_0x0252:
                java.lang.String r2 = r1.f220193m1
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r2)
                r5 = 0
                com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r5)
                if (r2 == 0) goto L_0x0292
                int r5 = r2.f195581h2
                if (r5 == r4) goto L_0x0270
                r4 = 3
                if (r5 == r4) goto L_0x0270
                int r4 = r2.f195582i
                r5 = 36
                if (r4 == r5) goto L_0x0270
                r5 = 48
                if (r4 != r5) goto L_0x0292
            L_0x0270:
                java.lang.Class<f62.t0> r4 = f62.C75708t0.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                f62.t0 r4 = (f62.C75708t0) r4
                java.lang.String r5 = r2.f195573f2
                r6 = r18
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r6)
                java.lang.String r2 = r2.f195638w
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r6)
                boolean r7 = r1.f220208y1
                int r1 = r1.f220206x1
                r2 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r1
                r2.Xf0(r3, r4, r5, r6, r7, r8)
            L_0x0292:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.transmit.SelectConversationUI.C74881d.mo23a(boolean, java.lang.String, int):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$d0 */
    public class C74882d0 implements C77398g.C77402i.C77404b {
        public C74882d0() {
        }

        /* renamed from: a */
        public void mo25a() {
            Intent intent = new Intent();
            intent.setClassName(SelectConversationUI.this.getContext(), "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
            intent.putExtra("app_msg_id", SelectConversationUI.this.f220183c1);
            intent.putExtra("app_show_share", false);
            SelectConversationUI selectConversationUI = SelectConversationUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SelectConversationUI selectConversationUI2 = selectConversationUI;
            C117292a.m165358d(selectConversationUI2, aVar.mo10232b(), "com/tencent/mm/ui/transmit/SelectConversationUI$38", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            selectConversationUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(selectConversationUI2, "com/tencent/mm/ui/transmit/SelectConversationUI$38", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$f */
    public class C74883f implements C74917p.C74919b {

        /* renamed from: a */
        public final /* synthetic */ Intent f220222a;

        /* renamed from: b */
        public final /* synthetic */ C78575u.C78583h f220223b;

        /* renamed from: c */
        public final /* synthetic */ HashMap f220224c;

        /* renamed from: d */
        public final /* synthetic */ boolean f220225d;

        /* renamed from: e */
        public final /* synthetic */ String f220226e;

        /* renamed from: f */
        public final /* synthetic */ String f220227f;

        /* renamed from: g */
        public final /* synthetic */ String f220228g;

        public C74883f(Intent intent, C78575u.C78583h hVar, HashMap hashMap, boolean z, String str, String str2, String str3) {
            this.f220222a = intent;
            this.f220223b = hVar;
            this.f220224c = hashMap;
            this.f220225d = z;
            this.f220226e = str;
            this.f220227f = str2;
            this.f220228g = str3;
        }

        /* renamed from: a */
        public void mo103253a() {
            this.f220222a.putExtra("KShowTodoIntroduceView", 1);
            SelectConversationUI selectConversationUI = SelectConversationUI.this;
            Intent intent = this.f220222a;
            C78575u.C78583h hVar = this.f220223b;
            HashMap hashMap = this.f220224c;
            boolean z = this.f220225d;
            String str = this.f220226e;
            String str2 = this.f220227f;
            String str3 = this.f220228g;
            int i = SelectConversationUI.f220137K1;
            selectConversationUI.mo104135l8(intent, hVar, hashMap, z, str, str2, str3);
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$f0 */
    public class C74884f0 implements C74481e2.C74483b {
        public C74884f0() {
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$g */
    public class C74885g implements C74920q.C74922b {

        /* renamed from: a */
        public final /* synthetic */ Intent f220231a;

        /* renamed from: b */
        public final /* synthetic */ String f220232b;

        public C74885g(Intent intent, String str) {
            this.f220231a = intent;
            this.f220232b = str;
        }

        /* renamed from: a */
        public void mo104149a(boolean z, String str, int i, boolean z2) {
            this.f220231a.putExtra("KSendGroupToDo", z2);
            if (z) {
                if (!Util.isNullOrNil(this.f220232b)) {
                    SelectConversationUI selectConversationUI = SelectConversationUI.this;
                    String str2 = this.f220232b;
                    int i2 = SelectConversationUI.f220137K1;
                    selectConversationUI.mo104122K8(str2);
                } else {
                    SelectConversationUI selectConversationUI2 = SelectConversationUI.this;
                    int i3 = SelectConversationUI.f220137K1;
                    selectConversationUI2.mo104121J8();
                }
                this.f220231a.putExtra("custom_send_text", str);
                SelectConversationUI.this.mo104127P8(-1, this.f220231a);
                SelectConversationUI.this.finish();
                return;
            }
            SelectConversationUI selectConversationUI3 = SelectConversationUI.this;
            Intent intent = this.f220231a;
            int i4 = SelectConversationUI.f220137K1;
            selectConversationUI3.mo104127P8(0, intent);
            SelectConversationUI selectConversationUI4 = SelectConversationUI.this;
            if (selectConversationUI4.f220209z1) {
                selectConversationUI4.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$g0 */
    public class C74886g0 implements MenuItem.OnMenuItemClickListener {
        public C74886g0() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelectConversationUI selectConversationUI = SelectConversationUI.this;
            if (selectConversationUI.f220149G1 && selectConversationUI.f220170U0) {
                return true;
            }
            selectConversationUI.f220170U0 = !selectConversationUI.f220170U0;
            selectConversationUI.mo103379N7().mo103548p(SelectConversationUI.this.f220170U0);
            SelectConversationUI selectConversationUI2 = SelectConversationUI.this;
            selectConversationUI2.f218608g.mo103548p(selectConversationUI2.f220170U0);
            SelectConversationUI.this.mo104131T8();
            SelectConversationUI selectConversationUI3 = SelectConversationUI.this;
            if (selectConversationUI3.f220170U0) {
                selectConversationUI3.setMMTitle(selectConversationUI3.getString(C0966R.string.ija));
            } else {
                selectConversationUI3.setMMTitle(selectConversationUI3.getString(C0966R.string.ijc));
            }
            SelectConversationUI.this.mo104130S8();
            SelectConversationUI.this.getClass();
            SelectConversationUI selectConversationUI4 = SelectConversationUI.this;
            if (selectConversationUI4.f220170U0 && selectConversationUI4.f220176X0) {
                C68144a.m80546b(selectConversationUI4.f220188h1, 7);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$h */
    public class C74887h implements C88394b.C88411m {

        /* renamed from: d */
        public final /* synthetic */ C74920q f220235d;

        public C74887h(SelectConversationUI selectConversationUI, C74920q qVar) {
            this.f220235d = qVar;
        }

        /* renamed from: b */
        public void mo1907b() {
            this.f220235d.mo104168a();
        }

        /* renamed from: d */
        public void mo1908d() {
        }

        public String key() {
            return C9515s.m9209a(this);
        }

        public void onBitmapLoaded(Bitmap bitmap) {
            this.f220235d.mo104168a();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$h0 */
    public class C74888h0 implements MenuItem.OnMenuItemClickListener {
        public C74888h0() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            String str;
            SelectConversationUI selectConversationUI = SelectConversationUI.this;
            int i = SelectConversationUI.f220137K1;
            if (selectConversationUI.mo104129R8(false)) {
                return false;
            }
            for (String j8 : SelectConversationUI.this.f220172V0) {
                if (SelectConversationUI.this.mo104133j8(j8)) {
                    return false;
                }
            }
            Intent intent = new Intent();
            intent.putExtra("Select_Conv_User", Util.listToString(SelectConversationUI.this.f220172V0, ","));
            Intent intent2 = (Intent) SelectConversationUI.this.getIntent().getParcelableExtra("Select_Conv_NextStep");
            if (intent2 != null) {
                SelectConversationUI.this.mo104113A8(intent, intent2);
            } else {
                SelectConversationUI selectConversationUI2 = SelectConversationUI.this;
                if (selectConversationUI2.f220158M) {
                    selectConversationUI2.mo104127P8(-1, intent);
                    SelectConversationUI.this.finish();
                } else if (C74560s1.m89275d(selectConversationUI2.f220181a1, 256)) {
                    selectConversationUI2.mo104127P8(-1, intent);
                    selectConversationUI2.finish();
                } else {
                    C78575u.C78583h hVar = new C78575u.C78583h(selectConversationUI2.getContext());
                    hVar.mo108578p(selectConversationUI2.f220172V0);
                    if (selectConversationUI2.f220177Y) {
                        Iterator<String> it = selectConversationUI2.f220172V0.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (selectConversationUI2.mo104133j8(it.next())) {
                                    break;
                                }
                            } else {
                                selectConversationUI2.mo104119G8(hVar, selectConversationUI2.f220162Q0);
                                selectConversationUI2.mo104125N8(intent, selectConversationUI2.f220162Q0, selectConversationUI2.f220172V0);
                                break;
                            }
                        }
                    } else if (selectConversationUI2.f220154J) {
                        if (!selectConversationUI2.getIntent().hasExtra("appbrand_params") || !selectConversationUI2.mo104136m8(intent, hVar, (String) null)) {
                            if (selectConversationUI2.f220171V != -1) {
                                FavInitConfirmDialogContentEvent favInitConfirmDialogContentEvent = new FavInitConfirmDialogContentEvent();
                                FavInitConfirmDialogContentEvent.C67700a aVar = favInitConfirmDialogContentEvent.f193616d;
                                aVar.f193617a = selectConversationUI2.f220171V;
                                aVar.f193620d = hVar;
                                aVar.f193621e = selectConversationUI2.getContext();
                                favInitConfirmDialogContentEvent.publish();
                            } else if (selectConversationUI2.f220182b1 == 17 && selectConversationUI2.f220175X != 0) {
                                String string = selectConversationUI2.getContext().getString(C0966R.string.i4_, new Object[]{Integer.valueOf(selectConversationUI2.f220175X)});
                                StringBuffer stringBuffer = new StringBuffer(selectConversationUI2.getResources().getString(C0966R.string.a0p));
                                stringBuffer.append(string);
                                hVar.mo108571i(stringBuffer.toString());
                            }
                        }
                    } else if (selectConversationUI2.f220156K && !selectConversationUI2.f220163R) {
                        HashMap hashMap = (HashMap) selectConversationUI2.getIntent().getSerializableExtra("webview_params");
                        hVar.mo108575m((String) hashMap.get("img_url"));
                        hVar.mo108576n(8);
                        String str2 = (String) hashMap.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        String str3 = (String) hashMap.get("url");
                        if (!selectConversationUI2.f220165S) {
                            String string2 = selectConversationUI2.getResources().getString(C0966R.string.a3w);
                            if (selectConversationUI2.f220182b1 == 4) {
                                string2 = "";
                            }
                            StringBuffer stringBuffer2 = new StringBuffer(string2);
                            stringBuffer2.append(str2);
                            str = stringBuffer2.toString();
                        } else {
                            StringBuffer stringBuffer3 = new StringBuffer(selectConversationUI2.getResources().getString(C0966R.string.f8023zj));
                            stringBuffer3.append((String) hashMap.get("nickname"));
                            str = stringBuffer3.toString();
                        }
                        hVar.mo108571i(str);
                        hVar.mo108564b(new C77544d0(selectConversationUI2, str3));
                    } else if (!selectConversationUI2.f220157L || !selectConversationUI2.mo104136m8(intent, hVar, (String) null)) {
                        selectConversationUI2.mo104114B8(hVar, (String) null);
                        selectConversationUI2.mo104115C8(hVar);
                    }
                    hVar.mo108569g(Boolean.TRUE);
                    hVar.f230208d = selectConversationUI2.mo104146x8();
                    hVar.mo108563a(new C77548e0(selectConversationUI2, intent));
                    hVar.mo108574l();
                    selectConversationUI2.mo104124M8(hVar, selectConversationUI2.getIntent().getBooleanExtra("Retr_finder_in_stream", false), "");
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$i */
    public class C74889i implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ String f220237a;

        /* renamed from: b */
        public final /* synthetic */ C74920q f220238b;

        public C74889i(String str, C74920q qVar) {
            this.f220237a = str;
            this.f220238b = qVar;
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            if (z) {
                if (!Util.isNullOrNil(this.f220237a)) {
                    SelectConversationUI selectConversationUI = SelectConversationUI.this;
                    String str2 = this.f220237a;
                    int i2 = SelectConversationUI.f220137K1;
                    selectConversationUI.mo104122K8(str2);
                } else {
                    SelectConversationUI selectConversationUI2 = SelectConversationUI.this;
                    int i3 = SelectConversationUI.f220137K1;
                    selectConversationUI2.mo104121J8();
                }
            }
            SelectConversationUI.this.hideVKB();
            this.f220238b.mo104169b(z, str, i, false);
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$i0 */
    public class C74890i0 implements Runnable {
        public C74890i0() {
        }

        public void run() {
            Intent intent = new Intent();
            intent.putExtra("finish_by_forward_to_wework", true);
            SelectConversationUI selectConversationUI = SelectConversationUI.this;
            int i = SelectConversationUI.f220137K1;
            selectConversationUI.mo104127P8(0, intent);
            SelectConversationUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$j */
    public class C74891j implements C76529i.C76532c {

        /* renamed from: a */
        public final /* synthetic */ Intent f220241a;

        public C74891j(Intent intent) {
            this.f220241a = intent;
        }

        /* renamed from: a */
        public void mo104153a(boolean z) {
        }

        /* renamed from: b */
        public void mo104154b() {
            this.f220241a.putExtra("KShowTodoIntroduceView", 1);
            C74917p.m89752a(SelectConversationUI.this, (C74917p.C74919b) null);
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$j0 */
    public class C74892j0 implements DialogInterface.OnClickListener {
        public C74892j0(SelectConversationUI selectConversationUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$k */
    public class C74893k implements C68748c.C68750b {
        public C74893k() {
        }

        /* renamed from: a */
        public void mo94586a(boolean z) {
            boolean isFinishing = SelectConversationUI.this.isFinishing();
            Log.m105924i("MicroMsg.SelectConversationUI", "onCheckEnd, isPass = " + z + ", isFinishing = " + isFinishing);
            if (!z && !isFinishing) {
                ReportUtil.m84997c(SelectConversationUI.this, (ReportUtil.ReportArgs) SelectConversationUI.this.getIntent().getParcelableExtra("Select_Report_Args"), true, false);
                SelectConversationUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$l */
    public class C74894l implements AbsListView.OnScrollListener {

        /* renamed from: d */
        public SparseArray f220244d = new SparseArray(0);

        /* renamed from: e */
        public int f220245e = 0;

        /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$l$a */
        public class C74895a {

            /* renamed from: a */
            public int f220247a = 0;

            /* renamed from: b */
            public int f220248b = 0;

            public C74895a(C74894l lVar) {
            }
        }

        public C74894l() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            int i4;
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/transmit/SelectConversationUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            SelectConversationUI selectConversationUI = SelectConversationUI.this;
            C74481e2 e2Var = selectConversationUI.f220198q1;
            if (e2Var != null) {
                int i5 = e2Var.f219023u;
                RelativeLayout relativeLayout = selectConversationUI.f220140C;
                int i6 = 0;
                if (relativeLayout != null) {
                    if (i > i5) {
                        relativeLayout.setVisibility(0);
                        SelectConversationUI selectConversationUI2 = SelectConversationUI.this;
                        if (selectConversationUI2.f220198q1.f219011G) {
                            selectConversationUI2.f220142D.setBackground(selectConversationUI2.getContext().getResources().getDrawable(C0966R.C0969drawable.f357218a91));
                            SelectConversationUI selectConversationUI3 = SelectConversationUI.this;
                            selectConversationUI3.f220144E.setBackground(selectConversationUI3.getContext().getResources().getDrawable(C0966R.C0969drawable.f357218a91));
                        }
                    } else {
                        relativeLayout.setVisibility(8);
                    }
                }
                this.f220245e = i;
                View childAt = absListView.getChildAt(0);
                if (childAt != null) {
                    C74895a aVar = (C74895a) this.f220244d.get(i);
                    if (aVar == null) {
                        aVar = new C74895a(this);
                    }
                    aVar.f220247a = childAt.getHeight();
                    aVar.f220248b = childAt.getTop();
                    this.f220244d.append(i, aVar);
                    int i7 = 0;
                    while (true) {
                        i4 = this.f220245e;
                        if (i6 >= i4) {
                            break;
                        }
                        C74895a aVar2 = (C74895a) this.f220244d.get(i6);
                        if (aVar2 != null) {
                            i7 += aVar2.f220247a;
                        }
                        i6++;
                    }
                    C74895a aVar3 = (C74895a) this.f220244d.get(i4);
                    if (aVar3 == null) {
                        aVar3 = new C74895a(this);
                    }
                    int i8 = i7 - aVar3.f220248b;
                    View view = SelectConversationUI.this.f218611j;
                    if (view != null) {
                        view.setY((float) (-i8));
                    }
                    MultiSelectContactView multiSelectContactView = SelectConversationUI.this.f218609h;
                    if (multiSelectContactView != null) {
                        multiSelectContactView.setY((float) (-i8));
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/transmit/SelectConversationUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/transmit/SelectConversationUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/ui/transmit/SelectConversationUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$l0 */
    public class C74896l0 implements DialogInterface.OnClickListener {
        public C74896l0(SelectConversationUI selectConversationUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$m */
    public class C74897m implements C74920q.C74922b {

        /* renamed from: a */
        public final /* synthetic */ Intent f220249a;

        /* renamed from: b */
        public final /* synthetic */ String f220250b;

        /* renamed from: c */
        public final /* synthetic */ String f220251c;

        /* renamed from: d */
        public final /* synthetic */ View f220252d;

        public C74897m(Intent intent, String str, String str2, View view) {
            this.f220249a = intent;
            this.f220250b = str;
            this.f220251c = str2;
            this.f220252d = view;
        }

        /* renamed from: a */
        public void mo104149a(boolean z, String str, int i, boolean z2) {
            this.f220249a.putExtra("KSendGroupToDo", z2);
            if (z) {
                if (!Util.isNullOrNil(this.f220250b)) {
                    SelectConversationUI selectConversationUI = SelectConversationUI.this;
                    String str2 = this.f220250b;
                    int i2 = SelectConversationUI.f220137K1;
                    selectConversationUI.mo104122K8(str2);
                } else {
                    SelectConversationUI selectConversationUI2 = SelectConversationUI.this;
                    int i3 = SelectConversationUI.f220137K1;
                    selectConversationUI2.mo104121J8();
                }
                this.f220249a.putExtra("custom_send_text", str);
                SelectConversationUI.this.mo104127P8(-1, this.f220249a);
                SelectConversationUI.this.finish();
            } else {
                SelectConversationUI selectConversationUI3 = SelectConversationUI.this;
                Intent intent = this.f220249a;
                int i4 = SelectConversationUI.f220137K1;
                selectConversationUI3.mo104127P8(0, intent);
                SelectConversationUI selectConversationUI4 = SelectConversationUI.this;
                if (selectConversationUI4.f220209z1) {
                    selectConversationUI4.finish();
                }
            }
            ((C76529i) C86312j.m106911c(C76529i.class)).ks0(this.f220251c, this.f220252d);
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$m0 */
    public class C74898m0 implements DialogInterface.OnClickListener {
        public C74898m0() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SelectConversationUI.super.mo66629Z7();
            SelectConversationUI.this.hideVKB();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$n */
    public class C74899n implements C76529i.C76531b {

        /* renamed from: a */
        public final /* synthetic */ C74920q f220255a;

        public C74899n(SelectConversationUI selectConversationUI, C74920q qVar) {
            this.f220255a = qVar;
        }

        /* renamed from: a */
        public void mo94358a(int i) {
            Log.m105925i("MicroMsg.SelectConversationUI", "onLoadImageResult() result:%d", Integer.valueOf(i));
            this.f220255a.mo104168a();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$n0 */
    public class C74900n0 implements Runnable {
        public C74900n0() {
        }

        public void run() {
            SelectConversationUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$o */
    public class C74901o implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ String f220257d;

        /* renamed from: e */
        public final /* synthetic */ View f220258e;

        public C74901o(SelectConversationUI selectConversationUI, String str, View view) {
            this.f220257d = str;
            this.f220258e = view;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            ((C76529i) C86312j.m106911c(C76529i.class)).ks0(this.f220257d, this.f220258e);
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$p */
    public class C74902p implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ String f220259a;

        /* renamed from: b */
        public final /* synthetic */ View f220260b;

        /* renamed from: c */
        public final /* synthetic */ C74920q f220261c;

        public C74902p(String str, View view, C74920q qVar) {
            this.f220259a = str;
            this.f220260b = view;
            this.f220261c = qVar;
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            if (z) {
                if (!Util.isNullOrNil(this.f220259a)) {
                    SelectConversationUI selectConversationUI = SelectConversationUI.this;
                    String str2 = this.f220259a;
                    int i2 = SelectConversationUI.f220137K1;
                    selectConversationUI.mo104122K8(str2);
                } else {
                    SelectConversationUI selectConversationUI2 = SelectConversationUI.this;
                    int i3 = SelectConversationUI.f220137K1;
                    selectConversationUI2.mo104121J8();
                }
            }
            SelectConversationUI.this.hideVKB();
            Object tag = this.f220260b.getTag(C0966R.C0970id.f6023v5);
            this.f220261c.mo104169b(z, str, i, tag == null ? false : ((Boolean) tag).booleanValue());
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$q */
    public class C74903q implements C76529i.C76532c {
        public C74903q() {
        }

        /* renamed from: a */
        public void mo104153a(boolean z) {
            SelectConversationUI.this.f220208y1 = z;
        }

        /* renamed from: b */
        public void mo104154b() {
            SelectConversationUI selectConversationUI = SelectConversationUI.this;
            selectConversationUI.f220206x1 = 1;
            C74917p.m89752a(selectConversationUI, (C74917p.C74919b) null);
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$r */
    public class C74904r implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ String f220264d;

        /* renamed from: e */
        public final /* synthetic */ View f220265e;

        public C74904r(SelectConversationUI selectConversationUI, String str, View view) {
            this.f220264d = str;
            this.f220265e = view;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            ((C76529i) C86312j.m106911c(C76529i.class)).ks0(this.f220264d, this.f220265e);
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$s */
    public class C74905s implements C77398g.C77402i.C77404b {
        public C74905s() {
        }

        /* renamed from: a */
        public void mo25a() {
            Intent intent = new Intent(SelectConversationUI.this.getContext(), RetransmitPreviewUI.class);
            intent.putExtra("Retr_Msg_content", SelectConversationUI.this.f220193m1);
            SelectConversationUI selectConversationUI = SelectConversationUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SelectConversationUI selectConversationUI2 = selectConversationUI;
            C117292a.m165358d(selectConversationUI2, aVar.mo10232b(), "com/tencent/mm/ui/transmit/SelectConversationUI$27", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            selectConversationUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(selectConversationUI2, "com/tencent/mm/ui/transmit/SelectConversationUI$27", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C88990b.m111199h(SelectConversationUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$t */
    public class C74906t implements C77398g.C77402i.C77404b {
        public C74906t() {
        }

        /* renamed from: a */
        public void mo25a() {
            Log.m105924i("MicroMsg.SelectConversationUI", "[ImageGalleryUI] showImgGallery");
            Intent intent = new Intent(SelectConversationUI.this.getContext(), ImageGalleryUI.class);
            intent.putExtra("img_gallery_msg_id", SelectConversationUI.this.f220183c1);
            intent.putExtra("img_gallery_msg_svr_id", SelectConversationUI.this.f220188h1.mo108774y2());
            intent.putExtra("img_gallery_talker", SelectConversationUI.this.f220188h1.mo108768t());
            intent.putExtra("img_gallery_chatroom_name", SelectConversationUI.this.f220188h1.mo108768t());
            intent.putExtra("img_preview_only", true);
            SelectConversationUI selectConversationUI = SelectConversationUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SelectConversationUI selectConversationUI2 = selectConversationUI;
            C117292a.m165358d(selectConversationUI2, aVar.mo10232b(), "com/tencent/mm/ui/transmit/SelectConversationUI$28", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            selectConversationUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(selectConversationUI2, "com/tencent/mm/ui/transmit/SelectConversationUI$28", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C88990b.m111199h(SelectConversationUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$u */
    public class C74907u implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ C72963f4.C72968e f220268a;

        /* renamed from: b */
        public final /* synthetic */ String f220269b;

        public C74907u(C72963f4.C72968e eVar, String str) {
            this.f220268a = eVar;
            this.f220269b = str;
        }

        /* renamed from: a */
        public void mo25a() {
            Intent intent = new Intent();
            intent.putExtra("map_view_type", 1);
            intent.putExtra("kwebmap_slat", this.f220268a.f212704b);
            intent.putExtra("kwebmap_lng", this.f220268a.f212705c);
            intent.putExtra("Kwebmap_locaion", this.f220269b);
            intent.putExtra("kShowshare", false);
            C88144b.m109791i(SelectConversationUI.this.getContext(), FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, (Bundle) null);
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$v */
    public class C74908v implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ String f220271a;

        public C74908v(String str) {
            this.f220271a = str;
        }

        /* renamed from: a */
        public void mo25a() {
            if (!Util.isNullOrNil(this.f220271a)) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", this.f220271a);
                intent.putExtra("showShare", false);
                C88144b.m109791i(SelectConversationUI.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$w */
    public class C74909w implements C77398g.C77402i.C77404b {
        public C74909w() {
        }

        /* renamed from: a */
        public void mo25a() {
            Intent intent = new Intent();
            intent.setClassName(SelectConversationUI.this.getContext(), "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
            intent.putExtra("app_msg_id", SelectConversationUI.this.f220183c1);
            intent.putExtra("app_show_share", false);
            SelectConversationUI selectConversationUI = SelectConversationUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SelectConversationUI selectConversationUI2 = selectConversationUI;
            C117292a.m165358d(selectConversationUI2, aVar.mo10232b(), "com/tencent/mm/ui/transmit/SelectConversationUI$31", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            selectConversationUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(selectConversationUI2, "com/tencent/mm/ui/transmit/SelectConversationUI$31", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$x */
    public class C74910x implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ C68070l.C68072b f220274a;

        public C74910x(C68070l.C68072b bVar) {
            this.f220274a = bVar;
        }

        /* renamed from: a */
        public void mo25a() {
            OpenNoteFromSessionEvent openNoteFromSessionEvent = new OpenNoteFromSessionEvent();
            openNoteFromSessionEvent.f193796d.f193799c = SelectConversationUI.this.getContext();
            OpenNoteFromSessionEvent.C67750a aVar = openNoteFromSessionEvent.f193796d;
            aVar.f193797a = SelectConversationUI.this.f220183c1;
            aVar.f193798b = this.f220274a.f195571f0;
            aVar.f193800d = false;
            aVar.f193801e = 7;
            openNoteFromSessionEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$y */
    public class C74911y implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ C68070l.C68072b f220276a;

        public C74911y(C68070l.C68072b bVar) {
            this.f220276a = bVar;
        }

        /* renamed from: a */
        public void mo25a() {
            Intent intent = new Intent();
            intent.putExtra("message_id", SelectConversationUI.this.f220183c1);
            intent.putExtra("Retr_Security_Msg_Id", SelectConversationUI.this.f220183c1);
            intent.putExtra("record_xml", this.f220276a.f195571f0);
            intent.putExtra("record_show_share", false);
            C88144b.m109791i(SelectConversationUI.this.getContext(), "record", ".ui.RecordMsgDetailUI", intent, (Bundle) null);
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$z */
    public class C74912z implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ C68070l.C68072b f220278a;

        public C74912z(C68070l.C68072b bVar) {
            this.f220278a = bVar;
        }

        /* renamed from: a */
        public void mo25a() {
            Class cls = C79139p.class;
            String K3 = ((C79139p) C86312j.m106911c(cls)).mo108862K3(this.f220278a.f195586j, StateEvent.Name.MESSAGE);
            String K32 = ((C79139p) C86312j.m106911c(cls)).mo108862K3(this.f220278a.f195590k, StateEvent.Name.MESSAGE);
            if (!NetStatusUtil.isMobile(SelectConversationUI.this.getContext()) ? K3 == null || K3.length() <= 0 : K32 != null && K32.length() > 0) {
                K3 = K32;
            }
            Intent intent = new Intent();
            intent.putExtra("rawUrl", K3);
            intent.putExtra("showShare", false);
            C88144b.m109791i(SelectConversationUI.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.SelectConversationUI$k0 */
    public class C74913k0 implements C75976w {
        public C74913k0() {
        }

        /* renamed from: a */
        public void mo103553a() {
            SelectConversationUI selectConversationUI = SelectConversationUI.this;
            if (selectConversationUI.f220170U0) {
                selectConversationUI.mo104138o8();
            } else {
                selectConversationUI.mo104137n8();
            }
        }

        /* JADX WARNING: type inference failed for: r1v4, types: [java.util.List<com.tencent.mm.storage.f4>] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo103554b() {
            /*
                r17 = this;
                r1 = r17
                com.tencent.mm.ui.transmit.SelectConversationUI r2 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                com.tencent.wework.api.IWWAPI$WWAppType r0 = com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeWxwork
                int r3 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.f220137K1
                androidx.appcompat.app.AppCompatActivity r3 = r2.getContext()
                boolean r3 = com.tencent.p014mm.p136ui.chatting.C97182r4.m125141d(r3)
                r10 = 1
                java.lang.Object[] r4 = new java.lang.Object[r10]
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
                r11 = 0
                r4[r11] = r5
                java.lang.String r12 = "MicroMsg.SendToWeWorkHelper"
                java.lang.String r5 = "isSupportForwardToWeWork: isSupportMultiMsgForward:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r4)
                if (r3 == 0) goto L_0x002a
                boolean r3 = r2.f220145E1
                if (r3 != 0) goto L_0x002a
                r3 = 1
                goto L_0x002b
            L_0x002a:
                r3 = 0
            L_0x002b:
                java.lang.String r4 = "MicroMsg.SelectConversationUI"
                if (r3 != 0) goto L_0x0034
                java.lang.String r3 = "doForwardToWeWork: don't support"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r3)
            L_0x0034:
                r2.f220147F1 = r10
                r9 = 6
                java.lang.Object[] r3 = new java.lang.Object[r9]
                int r5 = r2.f220141C1
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3[r11] = r5
                com.tencent.mm.sendtowework.BaseDataToWeWork r5 = r2.f220180Z0
                r3[r10] = r5
                com.tencent.mm.storage.f4 r5 = r2.f220188h1
                r13 = 2
                r3[r13] = r5
                long r5 = r2.f220183c1
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r14 = 3
                r3[r14] = r5
                java.util.List<com.tencent.mm.storage.f4> r5 = r2.f220185e1
                r15 = 4
                r3[r15] = r5
                r8 = 5
                r3[r8] = r0
                java.lang.String r5 = "doForwardToWeWork: contentTypeForwardToWeWork:%s , mBaseDataToWeWork:%s ,msgInfo:%s msgId:%s msgInfoList:%s ,wwAppType:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
                java.util.List<com.tencent.mm.storage.f4> r3 = r2.f220185e1
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
                r5 = -1
                r7 = 0
                r15 = -1
                if (r3 == 0) goto L_0x0375
                com.tencent.mm.storage.f4 r3 = r2.f220188h1
                if (r3 == 0) goto L_0x0076
                long r8 = r2.f220183c1
                int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r3 != 0) goto L_0x0375
            L_0x0076:
                int r3 = r2.f220141C1
                java.lang.String r5 = "], title = ["
                java.lang.String r6 = "]"
                java.lang.String r8 = "], appType = ["
                switch(r3) {
                    case -1: goto L_0x0356;
                    case 0: goto L_0x0081;
                    case 1: goto L_0x0341;
                    case 2: goto L_0x02fb;
                    case 3: goto L_0x02e6;
                    case 4: goto L_0x029b;
                    case 5: goto L_0x019b;
                    case 6: goto L_0x0113;
                    case 7: goto L_0x0097;
                    case 8: goto L_0x0359;
                    case 9: goto L_0x0081;
                    case 10: goto L_0x0356;
                    case 11: goto L_0x0356;
                    case 12: goto L_0x0356;
                    case 13: goto L_0x0356;
                    case 14: goto L_0x0356;
                    case 15: goto L_0x0356;
                    case 16: goto L_0x0356;
                    case 17: goto L_0x0356;
                    case 18: goto L_0x0356;
                    case 19: goto L_0x0356;
                    case 20: goto L_0x0356;
                    default: goto L_0x0081;
                }
            L_0x0081:
                r2.mo104134k8(r15, r0)
                r1 = 1
                java.lang.Object[] r0 = new java.lang.Object[r1]
                int r3 = r2.f220141C1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 0
                r0[r5] = r3
                java.lang.String r3 = "doForwardToWeWork: error type:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r3, r0)
                goto L_0x035a
            L_0x0097:
                androidx.appcompat.app.AppCompatActivity r3 = r2.getContext()
                com.tencent.mm.sendtowework.BaseDataToWeWork r4 = r2.f220180Z0
                if (r4 != 0) goto L_0x00a1
                goto L_0x0359
            L_0x00a1:
                boolean r9 = r4 instanceof com.tencent.p014mm.sendtowework.LinkData
                if (r9 == 0) goto L_0x0359
                com.tencent.mm.sendtowework.LinkData r4 = (com.tencent.p014mm.sendtowework.LinkData) r4
                java.lang.String r9 = r4.f212630d
                java.lang.String r11 = r4.f212631e
                java.lang.String r13 = r4.f212632f
                java.lang.String r4 = r4.f212633g
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "sendLinkToWeWork() called with: context = ["
                r14.append(r15)
                r14.append(r3)
                java.lang.String r15 = "], url = ["
                r14.append(r15)
                r14.append(r9)
                r14.append(r5)
                r14.append(r11)
                java.lang.String r5 = "], description = ["
                r14.append(r5)
                r14.append(r13)
                java.lang.String r5 = "], imgUrl = ["
                r14.append(r5)
                r14.append(r4)
                r14.append(r8)
                r14.append(r0)
                r14.append(r6)
                java.lang.String r5 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)
                com.tencent.wework.api.model.WWMediaLink r5 = new com.tencent.wework.api.model.WWMediaLink
                r5.<init>()
                r5.f285811f = r9
                r5.f285818c = r11
                r5.f285819d = r13
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r6 == 0) goto L_0x0105
                com.tencent.wework.api.IWWAPI r3 = com.tencent.wework.api.WWAPIFactory.m125312a(r3)
                r3.mo136603a(r5, r0)
                goto L_0x0359
            L_0x0105:
                gc0.a r6 = com.tencent.p014mm.modelimage.C92837k0.zx0()
                com.tencent.mm.ui.chatting.s4 r8 = new com.tencent.mm.ui.chatting.s4
                r8.<init>(r5, r3, r0)
                r6.mo32520i(r4, r7, r7, r8)
                goto L_0x0359
            L_0x0113:
                androidx.appcompat.app.AppCompatActivity r3 = r2.getContext()
                com.tencent.mm.sendtowework.BaseDataToWeWork r4 = r2.f220180Z0
                if (r4 != 0) goto L_0x011d
                goto L_0x0359
            L_0x011d:
                boolean r5 = r4 instanceof com.tencent.p014mm.sendtowework.LocationData
                if (r5 == 0) goto L_0x0359
                com.tencent.mm.sendtowework.LocationData r4 = (com.tencent.p014mm.sendtowework.LocationData) r4
                java.lang.String r5 = r4.f283920d
                java.lang.String r7 = r4.f283921e
                java.lang.Double r9 = r4.f283922f
                double r13 = r9.doubleValue()
                java.lang.Double r9 = r4.f283923g
                double r10 = r9.doubleValue()
                java.lang.Double r4 = r4.f283924h
                r16 = r2
                double r1 = r4.doubleValue()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r9 = "sendLocationToWeWork() called with: context = ["
                r4.append(r9)
                r4.append(r3)
                java.lang.String r9 = "], poiName = ["
                r4.append(r9)
                r4.append(r5)
                java.lang.String r9 = "], address = ["
                r4.append(r9)
                r4.append(r7)
                java.lang.String r9 = "], longitude = ["
                r4.append(r9)
                r4.append(r13)
                java.lang.String r9 = "], latitude = ["
                r4.append(r9)
                r4.append(r10)
                java.lang.String r9 = "], zoom = ["
                r4.append(r9)
                r4.append(r1)
                r4.append(r8)
                r4.append(r0)
                r4.append(r6)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
                com.tencent.wework.api.model.WWMediaLocation r4 = new com.tencent.wework.api.model.WWMediaLocation
                r4.<init>()
                r4.f285818c = r5
                r4.f285812f = r7
                r4.f285813g = r13
                r4.f285814h = r10
                r4.f285815i = r1
                com.tencent.wework.api.IWWAPI r1 = com.tencent.wework.api.WWAPIFactory.m125312a(r3)
                r1.mo136603a(r4, r0)
                r2 = r16
                goto L_0x0359
            L_0x019b:
                r16 = r2
                androidx.appcompat.app.AppCompatActivity r1 = r16.getContext()
                com.tencent.mm.sendtowework.BaseDataToWeWork r3 = r2.f220180Z0
                if (r3 != 0) goto L_0x01a7
                goto L_0x0359
            L_0x01a7:
                boolean r4 = r3 instanceof com.tencent.p014mm.sendtowework.AppBrandData
                if (r4 == 0) goto L_0x0359
                com.tencent.mm.sendtowework.AppBrandData r3 = (com.tencent.p014mm.sendtowework.AppBrandData) r3
                java.lang.String r4 = r3.f249798d
                java.lang.String r9 = r3.f249799e
                java.lang.String r10 = r3.f249800f
                java.lang.String r13 = r3.f249801g
                java.lang.String r14 = r3.f249802h
                java.lang.String r15 = r3.f249803i
                java.lang.Integer r3 = r3.f249804j
                int r3 = r3.intValue()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r11 = "sendMiniProgramToWeWork() called with: context = ["
                r7.append(r11)
                r7.append(r1)
                java.lang.String r11 = "], appbrandUsername = ["
                r7.append(r11)
                r7.append(r4)
                java.lang.String r11 = "], appbrandPagepath = ["
                r7.append(r11)
                r7.append(r9)
                java.lang.String r11 = "], appbrandWeAappIconUrl = ["
                r7.append(r11)
                r7.append(r10)
                java.lang.String r11 = "], imgPath = ["
                r7.append(r11)
                r7.append(r13)
                java.lang.String r11 = "], srcDisplayname = ["
                r7.append(r11)
                r7.append(r14)
                r7.append(r5)
                r7.append(r15)
                java.lang.String r5 = "], appbrandType = ["
                r7.append(r5)
                r7.append(r3)
                r7.append(r8)
                r7.append(r0)
                r7.append(r6)
                java.lang.String r5 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)
                com.tencent.wework.api.model.WWMediaMiniProgram r5 = new com.tencent.wework.api.model.WWMediaMiniProgram
                r5.<init>()
                r5.f285821f = r4
                r5.f285822g = r9
                r5.f285824i = r10
                com.tencent.mm.ui.chatting.r4$$a r10 = new com.tencent.mm.ui.chatting.r4$$a
                r7 = r3
                r3 = r10
                r4 = r5
                r5 = r14
                r6 = r15
                r11 = 0
                r8 = r1
                r9 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9)
                boolean r0 = android.text.TextUtils.isEmpty(r13)
                if (r0 == 0) goto L_0x0236
                r10.mo136092a(r11)
                goto L_0x0359
            L_0x0236:
                java.lang.String r0 = "http://"
                boolean r0 = r13.startsWith(r0)
                if (r0 != 0) goto L_0x0249
                java.lang.String r0 = "https://"
                boolean r0 = r13.startsWith(r0)
                if (r0 == 0) goto L_0x0247
                goto L_0x0249
            L_0x0247:
                r0 = 0
                goto L_0x024a
            L_0x0249:
                r0 = 1
            L_0x024a:
                if (r0 != 0) goto L_0x028d
                boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
                if (r0 == 0) goto L_0x0253
                goto L_0x025b
            L_0x0253:
                com.tencent.mm.modelimage.m r0 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
                java.lang.String r13 = r0.h30(r13)
            L_0x025b:
                boolean r0 = rd3.C48020a.m53385b(r13)
                if (r0 == 0) goto L_0x0287
                android.graphics.Bitmap r0 = com.tencent.p014mm.plugin.gallery.model.C93969m.m118772b(r13)     // Catch:{ Exception -> 0x027b }
                java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x027b }
                r1.<init>()     // Catch:{ Exception -> 0x027b }
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x027b }
                r4 = 70
                r0.compress(r3, r4, r1)     // Catch:{ Exception -> 0x027b }
                byte[] r7 = r1.toByteArray()     // Catch:{ Exception -> 0x027b }
                r1.close()     // Catch:{ Exception -> 0x0279 }
                goto L_0x0288
            L_0x0279:
                r0 = move-exception
                goto L_0x027d
            L_0x027b:
                r0 = move-exception
                r7 = r11
            L_0x027d:
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r3 = "resolveMiniProgramImageData, read local file to bitmap data fail"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r3, r1)
                goto L_0x0288
            L_0x0287:
                r7 = r11
            L_0x0288:
                r10.mo136092a(r7)
                goto L_0x0359
            L_0x028d:
                java.lang.String r0 = lb0.C88394b.f255384g
                lb0.b r0 = lb0.C88394b.C88418q.f255427a
                com.tencent.mm.ui.chatting.r4$$b r1 = new com.tencent.mm.ui.chatting.r4$$b
                r1.<init>(r10)
                r0.mo122798q(r13, r1)
                goto L_0x0359
            L_0x029b:
                androidx.appcompat.app.AppCompatActivity r1 = r2.getContext()     // Catch:{ r4$$g -> 0x02a6 }
                com.tencent.mm.sendtowework.BaseDataToWeWork r3 = r2.f220180Z0     // Catch:{ r4$$g -> 0x02a6 }
                com.tencent.p014mm.p136ui.chatting.C97182r4.m125142e(r1, r3, r0)     // Catch:{ r4$$g -> 0x02a6 }
                goto L_0x0359
            L_0x02a6:
                long r0 = p645pj.C77092c.m93047i()
                r3 = 1048576(0x100000, double:5.180654E-318)
                long r0 = r0 / r3
                androidx.appcompat.app.AppCompatActivity r3 = r2.getContext()
                androidx.appcompat.app.AppCompatActivity r4 = r2.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131835639(0x7f113af7, float:1.9304422E38)
                r6 = 1
                java.lang.Object[] r7 = new java.lang.Object[r6]
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r1 = 0
                r7[r1] = r0
                java.lang.String r0 = r4.getString(r5, r7)
                androidx.appcompat.app.AppCompatActivity r1 = r2.getContext()
                android.content.res.Resources r1 = r1.getResources()
                r4 = 2131821704(0x7f110488, float:1.9276159E38)
                java.lang.String r1 = r1.getString(r4)
                nj3.C76879j.m92748s(r3, r0, r1)
                nm2.e r0 = nm2.C76933e.m92785a()
                r0.mo107270d(r13)
                goto L_0x0359
            L_0x02e6:
                androidx.appcompat.app.AppCompatActivity r1 = r2.getContext()
                com.tencent.mm.sendtowework.BaseDataToWeWork r3 = r2.f220180Z0
                if (r3 != 0) goto L_0x02ef
                goto L_0x0359
            L_0x02ef:
                boolean r4 = r3 instanceof com.tencent.p014mm.sendtowework.VideoData
                if (r4 == 0) goto L_0x0359
                com.tencent.mm.sendtowework.VideoData r3 = (com.tencent.p014mm.sendtowework.VideoData) r3
                java.lang.String r3 = r3.f249809d
                com.tencent.p014mm.p136ui.chatting.C97182r4.m125144g(r1, r3, r0)
                goto L_0x0359
            L_0x02fb:
                androidx.appcompat.app.AppCompatActivity r1 = r2.getContext()
                com.tencent.mm.sendtowework.BaseDataToWeWork r3 = r2.f220180Z0
                if (r3 != 0) goto L_0x0304
                goto L_0x0359
            L_0x0304:
                boolean r4 = r3 instanceof com.tencent.p014mm.sendtowework.ImgData
                if (r4 == 0) goto L_0x0359
                com.tencent.mm.sendtowework.ImgData r3 = (com.tencent.p014mm.sendtowework.ImgData) r3
                java.lang.String r3 = r3.f249808d
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "sendImgToWeWork() called with: context = ["
                r4.append(r5)
                r4.append(r1)
                java.lang.String r5 = "], filePath = ["
                r4.append(r5)
                r4.append(r3)
                r4.append(r8)
                r4.append(r0)
                r4.append(r6)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
                com.tencent.wework.api.model.WWMediaImage r4 = new com.tencent.wework.api.model.WWMediaImage
                r4.<init>()
                r4.f285808g = r3
                com.tencent.wework.api.IWWAPI r1 = com.tencent.wework.api.WWAPIFactory.m125312a(r1)
                r1.mo136603a(r4, r0)
                goto L_0x0359
            L_0x0341:
                androidx.appcompat.app.AppCompatActivity r1 = r2.getContext()
                com.tencent.mm.sendtowework.BaseDataToWeWork r3 = r2.f220180Z0
                if (r3 != 0) goto L_0x034a
                goto L_0x0359
            L_0x034a:
                boolean r4 = r3 instanceof com.tencent.p014mm.sendtowework.TextData
                if (r4 == 0) goto L_0x0359
                com.tencent.mm.sendtowework.TextData r3 = (com.tencent.p014mm.sendtowework.TextData) r3
                java.lang.String r3 = r3.f212634d
                com.tencent.p014mm.p136ui.chatting.C97182r4.m125143f(r1, r3, r0)
                goto L_0x0359
            L_0x0356:
                r2.mo104134k8(r3, r0)
            L_0x0359:
                r1 = 1
            L_0x035a:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
                int r0 = r2.f220141C1
                java.lang.String r9 = java.lang.String.valueOf(r0)
                int r10 = r2.f220143D1
                java.lang.String r6 = ""
                com.tencent.p014mm.p136ui.contact.C19791b1.m21486a(r5, r6, r7, r8, r9, r10)
                goto L_0x04be
            L_0x0375:
                r11 = r7
                java.util.LinkedList r1 = new java.util.LinkedList
                r1.<init>()
                java.util.List<com.tencent.mm.storage.f4> r3 = r2.f220185e1
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
                if (r3 != 0) goto L_0x0395
                java.util.List<com.tencent.mm.storage.f4> r1 = r2.f220185e1
                r3 = r1
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                r5 = 0
                java.lang.Object r3 = r3.get(r5)
                com.tencent.mm.storage.f4 r3 = (com.tencent.p014mm.storage.C72963f4) r3
                java.lang.String r3 = r3.mo108768t()
            L_0x0393:
                r9 = r3
                goto L_0x03ac
            L_0x0395:
                com.tencent.mm.storage.f4 r3 = r2.f220188h1
                if (r3 == 0) goto L_0x03a9
                long r7 = r2.f220183c1
                int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r9 == 0) goto L_0x03a9
                r1.add(r3)
                com.tencent.mm.storage.f4 r3 = r2.f220188h1
                java.lang.String r3 = r3.mo108768t()
                goto L_0x0393
            L_0x03a9:
                java.lang.String r3 = ""
                goto L_0x0393
            L_0x03ac:
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
                if (r3 == 0) goto L_0x03b9
                java.lang.String r0 = "doForwardToWeWorkInChattingScene: selectItems is empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x04be
            L_0x03b9:
                int r3 = r2.f220139B1
                r4 = 1
                if (r3 == r4) goto L_0x03c3
                if (r3 != r13) goto L_0x03c1
                goto L_0x03c3
            L_0x03c1:
                r8 = 0
                goto L_0x03c4
            L_0x03c3:
                r8 = 1
            L_0x03c4:
                eb0.c r3 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.u3 r3 = r3.mo105907v()
                com.tencent.mm.storage.z1 r3 = r3.mo69664N2(r9)
                if (r3 != 0) goto L_0x03e2
                eb0.c r3 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.u3 r3 = r3.mo105907v()
                java.lang.String r4 = su0.C13781a.m13082a()
                com.tencent.mm.storage.z1 r3 = r3.mo69664N2(r4)
            L_0x03e2:
                r4 = r3
                androidx.appcompat.app.AppCompatActivity r3 = r2.getContext()
                boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9)
                r5 = r1
                r7 = r0
                r0 = 5
                com.tencent.p014mm.p136ui.chatting.C97182r4.m125145h(r3, r4, r5, r6, r7, r8)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r4 = 0
            L_0x03f7:
                int r5 = r1.size()
                if (r4 >= r5) goto L_0x0491
                java.lang.Object r5 = r1.get(r4)
                com.tencent.mm.storage.f4 r5 = (com.tencent.p014mm.storage.C72963f4) r5
                int r6 = r5.getType()
                r7 = 1
                if (r6 != r7) goto L_0x040c
                r8 = 1
                goto L_0x043c
            L_0x040c:
                if (r6 != r14) goto L_0x0411
            L_0x040e:
                r6 = 6
                goto L_0x0484
            L_0x0411:
                r7 = 43
                if (r6 != r7) goto L_0x0417
                r8 = 3
                goto L_0x043c
            L_0x0417:
                r7 = 49
                if (r6 == r7) goto L_0x043e
                r7 = 268435505(0x10000031, float:2.5243696E-29)
                if (r6 == r7) goto L_0x043e
                r7 = 1090519089(0x41000031, float:8.000047)
                if (r6 != r7) goto L_0x0426
                goto L_0x043e
            L_0x0426:
                r5 = 34
                if (r6 != r5) goto L_0x042d
                r5 = 10
                goto L_0x043b
            L_0x042d:
                r5 = 1040187441(0x3e000031, float:0.12500073)
                if (r6 != r5) goto L_0x0435
                r5 = 11
                goto L_0x043b
            L_0x0435:
                r5 = 47
                if (r6 != r5) goto L_0x046c
                r5 = 14
            L_0x043b:
                r8 = r5
            L_0x043c:
                r6 = 6
                goto L_0x0485
            L_0x043e:
                java.lang.String r6 = r5.getContent()
                boolean r7 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9)
                if (r7 == 0) goto L_0x045e
                java.lang.String r7 = r5.getContent()
                r8 = 58
                int r7 = r7.indexOf(r8)
                if (r7 == r15) goto L_0x045e
                java.lang.String r6 = r5.getContent()
                int r7 = r7 + 1
                java.lang.String r6 = r6.substring(r7)
            L_0x045e:
                if (r6 == 0) goto L_0x0469
                java.lang.String r5 = r5.mo108775z2()
                com.tencent.mm.message.l$b r7 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r5)
                goto L_0x046a
            L_0x0469:
                r7 = r11
            L_0x046a:
                if (r7 != 0) goto L_0x046e
            L_0x046c:
                r6 = 6
                goto L_0x047b
            L_0x046e:
                int r5 = r7.f195582i
                if (r5 == r13) goto L_0x040e
                r6 = 33
                if (r5 == r6) goto L_0x0481
                r6 = 6
                if (r5 == r0) goto L_0x047f
                if (r5 == r6) goto L_0x047d
            L_0x047b:
                r8 = -1
                goto L_0x0485
            L_0x047d:
                r8 = 4
                goto L_0x0485
            L_0x047f:
                r8 = 7
                goto L_0x0485
            L_0x0481:
                r6 = 6
                r8 = 5
                goto L_0x0485
            L_0x0484:
                r8 = 2
            L_0x0485:
                r3.append(r8)
                java.lang.String r5 = ";"
                r3.append(r5)
                int r4 = r4 + 1
                goto L_0x03f7
            L_0x0491:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                int r4 = r3.length()
                r5 = 1
                int r4 = r4 - r5
                r6 = 0
                java.lang.String r3 = r3.substring(r6, r4)
                r0.<init>(r3)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                int r3 = r2.f220139B1
                java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
                int r1 = r1.size()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
                java.lang.String r0 = r0.toString()
                int r10 = r2.f220143D1
                r6 = r9
                r9 = r0
                com.tencent.p014mm.p136ui.contact.C19791b1.m21486a(r5, r6, r7, r8, r9, r10)
            L_0x04be:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.transmit.SelectConversationUI.C74913k0.mo103554b():void");
        }
    }

    /* renamed from: t8 */
    public static String m89667t8(Context context, String str, String str2) {
        C72996z1 N2 = C97625j3.m125812b().mo105907v().mo69664N2(str);
        String string = context.getResources().getString(C0966R.string.f8021zh);
        if (N2 == null) {
            return string;
        }
        int i = ((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(str2).f212691q;
        Set<String> set = C45628s0.f123410p;
        return C72996z1.m85810M4(i) || N2.mo62916m3() ? context.getResources().getString(C0966R.string.f8019zf) : C72996z1.m85843n5(str) ? m89668y8(context, N2) : C72996z1.m85846q5(str) ? context.getResources().getString(C0966R.string.f8020zg) : context.getResources().getString(C0966R.string.f8021zh);
    }

    /* renamed from: y8 */
    public static String m89668y8(Context context, C72996z1 z1Var) {
        String Rn0 = ((C76158j) C86312j.m106911c(C76158j.class)).Rn0(z1Var.mo73980x2(), "openim_card_type_name", C76158j.C8510a.TYPE_WORDING);
        if (TextUtils.isEmpty(Rn0)) {
            return context.getResources().getString(C0966R.string.f8021zh);
        }
        return String.format("[%s]", new Object[]{Rn0});
    }

    /* renamed from: A8 */
    public final void mo104113A8(Intent intent, Intent intent2) {
        Log.m105918d("MicroMsg.SelectConversationUI", "has next step, jump now, intent=" + intent2);
        intent2.setExtrasClassLoader(getClass().getClassLoader());
        intent2.putExtras(intent.getExtras());
        startActivityForResult(intent2, 2);
        C88990b.m111192a(getContext(), intent2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:279:0x0d99  */
    /* JADX WARNING: Removed duplicated region for block: B:321:? A[RETURN, SYNTHETIC] */
    /* renamed from: B8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104114B8(wd3.C78575u.C78583h r31, java.lang.String r32) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            java.lang.Class<er.n> r2 = p151er.C75651n.class
            pl1.e0$a r3 = pl1.C11978e0.C11979a.COMMON
            java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
            java.lang.Class<ny.h> r5 = p629ny.C76979h.class
            int r6 = r0.f220182b1
            r13 = 2131302682(0x7f09191a, float:1.8223457E38)
            r14 = 2131302821(0x7f0919a5, float:1.8223739E38)
            java.lang.String r8 = ""
            r15 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            r15 = 1
            r9 = 0
            r10 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            switch(r6) {
                case 0: goto L_0x0daa;
                case 1: goto L_0x0d9f;
                case 2: goto L_0x0a19;
                case 3: goto L_0x09f5;
                case 4: goto L_0x09e8;
                case 5: goto L_0x09b9;
                case 6: goto L_0x0026;
                case 7: goto L_0x0026;
                case 8: goto L_0x098a;
                case 9: goto L_0x0957;
                case 10: goto L_0x0a19;
                case 11: goto L_0x094b;
                case 12: goto L_0x0904;
                case 13: goto L_0x08c5;
                case 14: goto L_0x0026;
                case 15: goto L_0x0026;
                case 16: goto L_0x0daa;
                case 17: goto L_0x0026;
                case 18: goto L_0x062b;
                case 19: goto L_0x05f7;
                case 20: goto L_0x05c3;
                case 21: goto L_0x054b;
                case 22: goto L_0x04a6;
                case 23: goto L_0x0138;
                case 24: goto L_0x0026;
                case 25: goto L_0x054b;
                case 26: goto L_0x0118;
                case 27: goto L_0x00b8;
                case 28: goto L_0x0099;
                case 29: goto L_0x0138;
                case 30: goto L_0x007a;
                case 31: goto L_0x0138;
                case 32: goto L_0x00b8;
                case 33: goto L_0x003b;
                case 34: goto L_0x0029;
                default: goto L_0x0026;
            }
        L_0x0026:
            r12 = r0
            goto L_0x0de1
        L_0x0029:
            java.lang.Class<hg.d> r2 = p548hg.C98450d.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            hg.d r2 = (p548hg.C98450d) r2
            java.lang.String r3 = r0.f220193m1
            java.lang.String r2 = r2.mo137794Ml(r0, r3)
            r1.mo108571i(r2)
            goto L_0x0026
        L_0x003b:
            java.lang.String r2 = r0.f220193m1
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r2)
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r9)
            java.lang.Class<ht1.j> r3 = ht1.C60176j.class
            com.tencent.mm.message.g r2 = r2.mo93555w(r3)
            ht1.j r2 = (ht1.C60176j) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 2131821536(0x7f1103e0, float:1.9275818E38)
            java.lang.String r4 = r0.getString(r4)
            r3.append(r4)
            r4 = 2131821538(0x7f1103e2, float:1.9275822E38)
            java.lang.Object[] r5 = new java.lang.Object[r15]
            te3.xk1 r2 = r2.f171713b
            java.lang.String r2 = r2.f186328f
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r5[r10] = r2
            java.lang.String r2 = r0.getString(r4, r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.mo108571i(r2)
            goto L_0x0026
        L_0x007a:
            java.lang.String r2 = r0.f220193m1
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r2)
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r9)
            java.lang.Class<ht1.i> r3 = ht1.C60175i.class
            com.tencent.mm.message.g r2 = r2.mo93555w(r3)
            ht1.i r2 = (ht1.C60175i) r2
            if (r2 == 0) goto L_0x0095
            android.view.View r2 = r0.mo104116D8(r2)
            r1.mo108565c(r2)
        L_0x0095:
            r1.mo108570h(r10)
            goto L_0x0026
        L_0x0099:
            java.lang.String r2 = r0.f220193m1
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r2)
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r9)
            java.lang.Class<ht1.h> r3 = ht1.C60174h.class
            com.tencent.mm.message.g r2 = r2.mo93555w(r3)
            ht1.h r2 = (ht1.C60174h) r2
            if (r2 == 0) goto L_0x0026
            te3.sk1 r2 = r2.f171711b
            if (r2 == 0) goto L_0x0026
            java.lang.String r2 = r2.f185424f
            r1.mo108571i(r2)
            goto L_0x0026
        L_0x00b8:
            java.lang.String r2 = r0.f220193m1
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r2)
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r9)
            java.lang.Class<ht1.c> r3 = ht1.C60154c.class
            com.tencent.mm.message.g r2 = r2.mo93555w(r3)
            ht1.c r2 = (ht1.C60154c) r2
            if (r2 == 0) goto L_0x0026
            te3.tk1 r3 = r2.f171699b
            te3.bf0 r3 = r3.f185609j
            if (r3 == 0) goto L_0x0026
            r3 = 2131821532(0x7f1103dc, float:1.927581E38)
            java.lang.String r3 = r0.getString(r3)
            te3.tk1 r4 = r2.f171699b
            int r4 = r4.f185604e
            r5 = 7
            if (r4 != r5) goto L_0x0100
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.Class<ht1.a5> r3 = ht1.C76243a5.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ht1.a5 r3 = (ht1.C76243a5) r3
            te3.tk1 r2 = r2.f171699b
            te3.bf0 r2 = r2.f185609j
            java.lang.String r2 = r3.Vo0(r2)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            goto L_0x0113
        L_0x0100:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            te3.tk1 r2 = r2.f171699b
            java.lang.String r2 = r2.f185603d
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L_0x0113:
            r1.mo108571i(r2)
            goto L_0x0026
        L_0x0118:
            java.lang.String r2 = r0.f220193m1
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r2)
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r9)
            java.lang.Class<ht1.l> r3 = ht1.C60181l.class
            com.tencent.mm.message.g r2 = r2.mo93555w(r3)
            ht1.l r2 = (ht1.C60181l) r2
            if (r2 == 0) goto L_0x0133
            android.view.View r2 = r0.mo104117E8(r2)
            r1.mo108565c(r2)
        L_0x0133:
            r1.mo108570h(r10)
            goto L_0x0026
        L_0x0138:
            java.lang.String r6 = r0.f220193m1
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r6)
            com.tencent.mm.message.l$b r6 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r9)
            java.lang.Class<ht1.b> r10 = ht1.C60151b.class
            com.tencent.mm.message.g r6 = r6.mo93555w(r10)
            ht1.b r6 = (ht1.C60151b) r6
            if (r6 == 0) goto L_0x049e
            java.lang.Class<ir.n> r10 = p565ir.C60606n.class
            n60.f$a r11 = new n60.f$a
            r11.<init>()
            r11.f293176b = r15
            r11.f293175a = r15
            r11.f293186l = r15
            n60.f r11 = r11.mo139398a()
            r15 = 2131497487(0x7f0c120f, float:1.8618568E38)
            android.view.View r15 = android.view.View.inflate(r0, r15, r9)
            android.view.View r14 = r15.findViewById(r14)
            r9 = 2131302758(0x7f091966, float:1.8223611E38)
            android.view.View r9 = r14.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            android.view.View r13 = r14.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r1 = 2131304550(0x7f092066, float:1.8227246E38)
            android.view.View r1 = r14.findViewById(r1)
            r32 = r15
            r15 = 2131304783(0x7f09214f, float:1.8227718E38)
            r14.findViewById(r15)
            k60.a r15 = k60.C99101e.f290571b
            r16 = r1
            te3.p81 r1 = r6.f171698b
            java.lang.String r1 = r1.f184789r
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r15.mo85957c(r1, r13, r11)
            r1 = 2131302761(0x7f091969, float:1.8223617E38)
            android.view.View r1 = r14.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r11 = 2131302762(0x7f09196a, float:1.822362E38)
            android.view.View r11 = r14.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r13 = 2131302759(0x7f091967, float:1.8223613E38)
            android.view.View r13 = r14.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            android.content.Context r15 = r13.getContext()
            r20 = r12
            android.content.Context r12 = r13.getContext()
            r21 = r7
            r7 = 2131099865(0x7f0600d9, float:1.7812095E38)
            int r7 = kg3.C76577a.m92153d(r12, r7)
            r12 = 2131755978(0x7f1003ca, float:1.914285E38)
            android.graphics.drawable.Drawable r7 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r15, r12, r7)
            r13.setImageDrawable(r7)
            di3.d r7 = di3.C86312j.m106911c(r5)
            ny.h r7 = (p629ny.C76979h) r7
            te3.p81 r12 = r6.f171698b
            java.lang.String r12 = r12.f184781g
            android.text.SpannableString r7 = r7.mo107057T1(r0, r12)
            r1.setText(r7)
            r7 = 2131304822(0x7f092176, float:1.8227797E38)
            android.view.View r7 = r14.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r12 = 2131302686(0x7f09191e, float:1.8223465E38)
            android.view.View r12 = r14.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 2131302756(0x7f091964, float:1.8223607E38)
            android.view.View r13 = r14.findViewById(r13)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r15 = 2131302734(0x7f09194e, float:1.8223562E38)
            android.view.View r15 = r14.findViewById(r15)
            di3.d r17 = di3.C86312j.m106911c(r10)
            r18 = r14
            r14 = r17
            ir.n r14 = (p565ir.C60606n) r14
            r0 = 0
            r14.mo85037Tb(r1, r9, r6, r0)
            di3.d r0 = di3.C86312j.m106911c(r10)
            ir.n r0 = (p565ir.C60606n) r0
            te3.p81 r1 = r6.f171698b
            java.lang.String r1 = r1.f184777V
            r9 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            r0.mo84986Aw(r11, r1, r9, r14)
            if (r13 == 0) goto L_0x0233
            di3.d r0 = di3.C86312j.m106911c(r4)
            ht1.t1 r0 = (ht1.C60200t1) r0
            ht1.z4 r0 = r0.mo76861l7()
            r1 = 2131233043(0x7f080913, float:1.8082212E38)
            r9 = 2131233042(0x7f080912, float:1.808221E38)
            r0.mo83777X5(r13, r1, r9)
        L_0x0233:
            te3.p81 r0 = r6.f171698b
            int r0 = r0.f184772Q
            r1 = 1
            if (r0 != r1) goto L_0x0257
            di3.d r0 = di3.C86312j.m106911c(r4)
            ht1.t1 r0 = (ht1.C60200t1) r0
            te3.p81 r1 = r6.f171698b
            java.lang.String r1 = r1.f184783i
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r8)
            r0.mo76808S7(r1, r7, r3)
            te3.p81 r0 = r6.f171698b
            java.lang.String r0 = r0.f184773R
            r12.setText(r0)
            r0 = 0
            r12.setVisibility(r0)
            goto L_0x026d
        L_0x0257:
            di3.d r0 = di3.C86312j.m106911c(r4)
            ht1.t1 r0 = (ht1.C60200t1) r0
            te3.p81 r1 = r6.f171698b
            java.lang.String r1 = r1.f184783i
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r8)
            r0.mo76741Cm(r1, r7, r3)
            r0 = 8
            r12.setVisibility(r0)
        L_0x026d:
            di3.d r0 = di3.C86312j.m106911c(r2)
            er.n r0 = (p151er.C75651n) r0
            int r0 = r0.ld0()
            r1 = 1
            if (r0 != r1) goto L_0x02bb
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r1 = r21
            r0.mo10233c(r1)
            java.lang.Object[] r23 = r0.mo10232b()
            java.lang.String r24 = "com/tencent/mm/ui/transmit/SelectConversationUI"
            java.lang.String r25 = "initFinderLiveObjectDialog"
            java.lang.String r26 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r15
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r15.setVisibility(r0)
            java.lang.String r23 = "com/tencent/mm/ui/transmit/SelectConversationUI"
            java.lang.String r24 = "initFinderLiveObjectDialog"
            java.lang.String r25 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            r9 = r20
            goto L_0x02f9
        L_0x02bb:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r9 = r20
            r0.mo10233c(r9)
            java.lang.Object[] r23 = r0.mo10232b()
            java.lang.String r24 = "com/tencent/mm/ui/transmit/SelectConversationUI"
            java.lang.String r25 = "initFinderLiveObjectDialog"
            java.lang.String r26 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r15
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r15.setVisibility(r0)
            java.lang.String r23 = "com/tencent/mm/ui/transmit/SelectConversationUI"
            java.lang.String r24 = "initFinderLiveObjectDialog"
            java.lang.String r25 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
        L_0x02f9:
            androidx.appcompat.app.AppCompatActivity r0 = r30.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165304(0x7f070078, float:1.7944821E38)
            float r0 = r0.getDimension(r1)
            int r0 = (int) r0
            r1 = 1068149419(0x3faaaaab, float:1.3333334)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            float r3 = (float) r0
            float r3 = r3 * r1
            int r1 = (int) r3
            r2.<init>(r0, r1)
            r7.setLayoutParams(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r0, r1)
            r1 = r16
            r1.setLayoutParams(r2)
            te3.p81 r2 = r6.f171698b
            java.lang.String r2 = r2.f184765I
            if (r2 == 0) goto L_0x0469
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0469
            te3.p81 r2 = r6.f171698b
            java.lang.String r2 = r2.f184768L
            java.lang.String r3 = "1"
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L_0x0469
            r2 = 2131304546(0x7f092062, float:1.8227238E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3 = 2131304547(0x7f092063, float:1.822724E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            di3.d r4 = di3.C86312j.m106911c(r10)
            ir.n r4 = (p565ir.C60606n) r4
            ks3.t r11 = ks3.C61165t.SHARE_BG
            r12 = 2131232945(0x7f0808b1, float:1.8082014E38)
            r4.x30(r2, r11, r12)
            di3.d r2 = di3.C86312j.m106911c(r10)
            ir.n r2 = (p565ir.C60606n) r2
            ks3.t r4 = ks3.C61165t.SHARE_ICON
            r11 = 2131232946(0x7f0808b2, float:1.8082016E38)
            r2.x30(r3, r4, r11)
            r2 = 2131304549(0x7f092065, float:1.8227244E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 1096810496(0x41600000, float:14.0)
            r4 = 1
            r2.setTextSize(r4, r3)
            r11 = 2131304548(0x7f092064, float:1.8227242E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r11.setTextSize(r4, r3)
            r3 = 2131304551(0x7f092067, float:1.8227248E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r12 = 1095761920(0x41500000, float:13.0)
            r3.setTextSize(r4, r12)
            android.text.TextPaint r4 = r2.getPaint()
            r12 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r12)
            android.text.TextPaint r4 = r11.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r12)
            android.text.TextPaint r3 = r3.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r3, r12)
            te3.p81 r3 = r6.f171698b
            java.lang.String r3 = r3.f184766J
            if (r3 == 0) goto L_0x03ce
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x03b6
            goto L_0x03ce
        L_0x03b6:
            di3.d r3 = di3.C86312j.m106911c(r5)
            ny.h r3 = (p629ny.C76979h) r3
            te3.p81 r4 = r6.f171698b
            java.lang.String r4 = r4.f184766J
            r12 = r30
            android.text.SpannableString r3 = r3.mo107057T1(r12, r4)
            r11.setText(r3)
            r3 = 0
            r11.setVisibility(r3)
            goto L_0x03d6
        L_0x03ce:
            r12 = r30
            r3 = 0
            r4 = 8
            r11.setVisibility(r4)
        L_0x03d6:
            androidx.appcompat.app.AppCompatActivity r4 = r30.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131829356(0x7f11226c, float:1.9291679E38)
            r11 = 1
            java.lang.Object[] r13 = new java.lang.Object[r11]
            te3.p81 r11 = r6.f171698b
            java.lang.String r11 = r11.f184765I
            r13[r3] = r11
            java.lang.String r3 = r4.getString(r5, r13)
            androidx.appcompat.app.AppCompatActivity r4 = r30.getContext()
            r5 = 12
            int r4 = kg3.C76577a.m92151b(r4, r5)
            r5 = 2
            int r4 = r4 * 2
            int r24 = r0 - r4
            java.lang.String r0 = "\n"
            java.lang.String r0 = r3.replace(r0, r8)
            android.text.StaticLayout r4 = new android.text.StaticLayout
            r21 = 0
            int r22 = r0.length()
            android.text.TextPaint r23 = r2.getPaint()
            android.text.Layout$Alignment r25 = android.text.Layout.Alignment.ALIGN_NORMAL
            r26 = 1065353216(0x3f800000, float:1.0)
            r27 = 0
            r28 = 1
            r19 = r4
            r20 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            int r4 = r4.getLineCount()
            r5 = 1
            if (r4 > r5) goto L_0x0426
            r3 = r0
        L_0x0426:
            r2.setText(r3)
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r9)
            java.lang.Object[] r21 = r0.mo10232b()
            java.lang.String r22 = "com/tencent/mm/ui/transmit/SelectConversationUI"
            java.lang.String r23 = "initFinderLiveObjectDialog"
            java.lang.String r24 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r1
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r2 = 0
            java.lang.Object r0 = r0.mo10231a(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r21 = "com/tencent/mm/ui/transmit/SelectConversationUI"
            java.lang.String r22 = "initFinderLiveObjectDialog"
            java.lang.String r23 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            r0 = 8
            r7.setVisibility(r0)
            goto L_0x046b
        L_0x0469:
            r12 = r30
        L_0x046b:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r1 = r18
            r1.setLayoutParams(r0)
            di3.d r0 = di3.C86312j.m106911c(r10)
            ir.n r0 = (p565ir.C60606n) r0
            r2 = 2131303693(0x7f091d0d, float:1.8225508E38)
            android.view.View r1 = r1.findViewById(r2)
            te3.p81 r2 = r6.f171698b
            int r2 = r2.f184759C
            r3 = 0
            r0.Ej0(r1, r3, r2)
            java.lang.Class<ir.k> r0 = p565ir.C60603k.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ir.k r0 = (p565ir.C60603k) r0
            r0.cp0(r6)
            r0 = r31
            r1 = r32
            r0.mo108565c(r1)
            goto L_0x04a1
        L_0x049e:
            r12 = r0
            r0 = r1
            r3 = 0
        L_0x04a1:
            r0.mo108570h(r3)
            goto L_0x0de1
        L_0x04a6:
            r12 = r0
            r0 = r1
            java.lang.String r1 = r12.f220193m1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r1)
            r2 = 0
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r2)
            java.lang.Class<ht1.d> r3 = ht1.C60158d.class
            com.tencent.mm.message.g r1 = r1.mo93555w(r3)
            ht1.d r1 = (ht1.C60158d) r1
            if (r1 == 0) goto L_0x0545
            r3 = 2131497485(0x7f0c120d, float:1.8618564E38)
            android.view.View r2 = android.view.View.inflate(r12, r3, r2)
            r3 = 2131315360(0x7f094aa0, float:1.8249171E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 2131302294(0x7f091796, float:1.822267E38)
            android.view.View r4 = r2.findViewById(r4)
            ht1.e2 r4 = (ht1.C60162e2) r4
            android.content.Context r5 = r2.getContext()
            r6 = 70
            int r5 = kg3.C76577a.m92151b(r5, r6)
            r4.setItemViewWidth(r5)
            te3.nk1 r5 = r1.f171700b
            java.util.LinkedList<java.lang.String> r5 = r5.f184478g
            int r6 = r5.size()
            r7 = 4
            int r6 = java.lang.Math.min(r7, r6)
            r7 = 0
            java.util.List r5 = r5.subList(r7, r6)
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            r7 = 0
        L_0x04fb:
            int r8 = r5.size()
            if (r7 >= r8) goto L_0x052a
            te3.rq2 r8 = new te3.rq2
            r8.<init>()
            te3.nk1 r9 = r1.f171700b
            java.util.LinkedList<java.lang.String> r9 = r9.f184478g
            java.lang.Object r9 = r9.get(r7)
            java.lang.String r9 = (java.lang.String) r9
            r8.f185266d = r9
            te3.nk1 r9 = r1.f171700b
            java.util.LinkedList<java.lang.String> r9 = r9.f184479h
            java.lang.Object r9 = r9.get(r7)
            java.lang.String r9 = (java.lang.String) r9
            r8.f185286y = r9
            r8.f185288z = r9
            java.lang.String r9 = r8.f185266d
            r8.f185267e = r9
            r6.add(r8)
            int r7 = r7 + 1
            goto L_0x04fb
        L_0x052a:
            java.lang.Class<ht1.a5> r5 = ht1.C76243a5.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ht1.a5 r5 = (ht1.C76243a5) r5
            r7 = 0
            ht1.e2$a r5 = r5.mo13238gc(r6, r7)
            r4.setAdapter(r5)
            te3.nk1 r1 = r1.f171700b
            java.lang.String r1 = r1.f184476e
            r3.setText(r1)
            r0.mo108565c(r2)
            goto L_0x0546
        L_0x0545:
            r7 = 0
        L_0x0546:
            r0.mo108570h(r7)
            goto L_0x0de1
        L_0x054b:
            r12 = r0
            r0 = r1
            java.lang.String r1 = r12.f220193m1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r1)
            r2 = 0
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r2)
            java.lang.Class<ht1.k> r2 = ht1.C60178k.class
            com.tencent.mm.message.g r1 = r1.mo93555w(r2)
            ht1.k r1 = (ht1.C60178k) r1
            if (r1 == 0) goto L_0x0de1
            te3.tk1 r2 = r1.f171714b
            if (r2 == 0) goto L_0x0de1
            r2 = 2131821532(0x7f1103dc, float:1.927581E38)
            java.lang.String r2 = r12.getString(r2)
            te3.tk1 r3 = r1.f171714b
            int r3 = r3.f185604e
            r4 = 1
            if (r3 != r4) goto L_0x0594
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r2 = 2131830037(0x7f112515, float:1.929306E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            te3.tk1 r1 = r1.f171714b
            java.lang.String r1 = r1.f185603d
            r5 = 0
            r4[r5] = r1
            java.lang.String r1 = r12.getString(r2, r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L_0x05be
        L_0x0594:
            r4 = 4
            if (r3 != r4) goto L_0x05ab
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            te3.tk1 r1 = r1.f171714b
            java.lang.String r1 = r1.f185606g
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L_0x05be
        L_0x05ab:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            te3.tk1 r1 = r1.f171714b
            java.lang.String r1 = r1.f185603d
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x05be:
            r0.mo108571i(r1)
            goto L_0x0de1
        L_0x05c3:
            r12 = r0
            r0 = r1
            java.lang.String r1 = r12.f220193m1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r1)
            r2 = 0
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r2)
            java.lang.Class<ht1.e> r2 = ht1.C60161e.class
            com.tencent.mm.message.g r1 = r1.mo93555w(r2)
            ht1.e r1 = (ht1.C60161e) r1
            if (r1 == 0) goto L_0x0de1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 2131821535(0x7f1103df, float:1.9275816E38)
            java.lang.String r3 = r12.getString(r3)
            r2.append(r3)
            java.lang.String r1 = r1.f171704e
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.mo108571i(r1)
            goto L_0x0de1
        L_0x05f7:
            r12 = r0
            r0 = r1
            java.lang.String r1 = r12.f220193m1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r1)
            r2 = 0
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r2)
            java.lang.Class<ht1.e1> r2 = ht1.C76245e1.class
            com.tencent.mm.message.g r1 = r1.mo93555w(r2)
            ht1.e1 r1 = (ht1.C76245e1) r1
            if (r1 == 0) goto L_0x0de1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 2131821533(0x7f1103dd, float:1.9275812E38)
            java.lang.String r3 = r12.getString(r3)
            r2.append(r3)
            java.lang.String r1 = r1.f223338b
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.mo108571i(r1)
            goto L_0x0de1
        L_0x062b:
            r9 = r12
            r12 = r0
            r0 = r1
            r1 = r7
            java.lang.String r6 = r12.f220193m1
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r6)
            r7 = 0
            com.tencent.mm.message.l$b r6 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r7)
            java.lang.Class<ht1.f> r7 = ht1.C60166f.class
            com.tencent.mm.message.g r6 = r6.mo93555w(r7)
            ht1.f r6 = (ht1.C60166f) r6
            if (r6 == 0) goto L_0x08bf
            n60.f$a r7 = new n60.f$a
            r7.<init>()
            r8 = 1
            r7.f293176b = r8
            r7.f293175a = r8
            r7.f293186l = r8
            n60.f r7 = r7.mo139398a()
            r8 = 2131497486(0x7f0c120e, float:1.8618566E38)
            r10 = 0
            android.view.View r8 = android.view.View.inflate(r12, r8, r10)
            android.view.View r10 = r8.findViewById(r14)
            android.view.View r11 = r10.findViewById(r13)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            k60.a r13 = k60.C99101e.f290571b
            java.lang.String r14 = r6.mo85178f()
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r14)
            r13.mo85957c(r14, r11, r7)
            r7 = 2131299302(0x7f090be6, float:1.8216602E38)
            android.view.View r7 = r10.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            di3.d r11 = di3.C86312j.m106911c(r5)
            ny.h r11 = (p629ny.C76979h) r11
            di3.d r13 = di3.C86312j.m106911c(r4)
            ht1.t1 r13 = (ht1.C60200t1) r13
            ht1.z4 r13 = r13.mo76861l7()
            java.lang.String r14 = r6.mo85179g()
            java.lang.String r13 = r13.mo83768O5(r14)
            android.text.SpannableString r11 = r11.mo107057T1(r12, r13)
            r7.setText(r11)
            r11 = 2131299297(0x7f090be1, float:1.8216591E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            android.content.Context r13 = r11.getContext()
            android.content.Context r14 = r11.getContext()
            r15 = 2131099865(0x7f0600d9, float:1.7812095E38)
            int r14 = kg3.C76577a.m92153d(r14, r15)
            r15 = 2131755978(0x7f1003ca, float:1.914285E38)
            android.graphics.drawable.Drawable r13 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r13, r15, r14)
            r11.setImageDrawable(r13)
            r11 = 2131304822(0x7f092176, float:1.8227797E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r13 = 2131304481(0x7f092021, float:1.8227106E38)
            android.view.View r13 = r10.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r14 = 2131299300(0x7f090be4, float:1.8216598E38)
            android.view.View r14 = r10.findViewById(r14)
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r14 = (com.tencent.p014mm.plugin.sns.p106ui.view.ImageIndicatorView) r14
            r15 = 2131302755(0x7f091963, float:1.8223605E38)
            android.view.View r15 = r10.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r0 = 2131299291(0x7f090bdb, float:1.821658E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r32 = r0
            r0 = 2131302734(0x7f09194e, float:1.8223562E38)
            android.view.View r0 = r10.findViewById(r0)
            r16 = r7
            te3.rk1 r7 = r6.f171710b
            r17 = r8
            int r8 = r7.f185188i
            r20 = r9
            r9 = 1
            if (r8 != r9) goto L_0x0729
            r8 = 8
            r11.setVisibility(r8)
            r3 = 2131304821(0x7f092175, float:1.8227795E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            di3.d r5 = di3.C86312j.m106911c(r5)
            ny.h r5 = (p629ny.C76979h) r5
            te3.rk1 r7 = r6.f171710b
            java.lang.String r7 = r7.f185187h
            android.text.SpannableString r5 = r5.mo107057T1(r12, r7)
            r3.setText(r5)
            r5 = 0
            r3.setVisibility(r5)
            r15.setVisibility(r8)
            r3 = 8
            goto L_0x074c
        L_0x0729:
            r5 = 0
            java.util.LinkedList<te3.pk1> r7 = r7.f185190n
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x0747
            di3.d r7 = di3.C86312j.m106911c(r4)
            ht1.t1 r7 = (ht1.C60200t1) r7
            te3.rk1 r8 = r6.f171710b
            java.util.LinkedList<te3.pk1> r8 = r8.f185190n
            java.lang.Object r8 = r8.get(r5)
            te3.pk1 r8 = (te3.C64628pk1) r8
            java.lang.String r5 = r8.f184828f
            r7.mo76741Cm(r5, r11, r3)
        L_0x0747:
            r3 = 8
            r15.setVisibility(r3)
        L_0x074c:
            te3.rk1 r5 = r6.f171710b
            int r5 = r5.f185188i
            r7 = 4
            if (r5 == r7) goto L_0x0773
            r7 = 6
            if (r5 != r7) goto L_0x0757
            goto L_0x0773
        L_0x0757:
            r7 = 2
            if (r5 != r7) goto L_0x076a
            r13.setVisibility(r3)
            if (r14 == 0) goto L_0x077c
            r3 = 0
            r14.setVisibility(r3)
            te3.rk1 r3 = r6.f171710b
            int r3 = r3.f185189j
            r14.f21258e = r3
            goto L_0x077c
        L_0x076a:
            r13.setVisibility(r3)
            if (r14 == 0) goto L_0x077c
            r14.setVisibility(r3)
            goto L_0x077c
        L_0x0773:
            r5 = 0
            r13.setVisibility(r5)
            if (r14 == 0) goto L_0x077c
            r14.setVisibility(r3)
        L_0x077c:
            di3.d r2 = di3.C86312j.m106911c(r2)
            er.n r2 = (p151er.C75651n) r2
            int r2 = r2.ld0()
            r3 = 1
            if (r2 != r3) goto L_0x07d2
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r1)
            java.lang.Object[] r21 = r2.mo10232b()
            java.lang.String r22 = "com/tencent/mm/ui/transmit/SelectConversationUI"
            java.lang.String r23 = "initFinderObjectDialog"
            java.lang.String r24 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentFinderObject;)Landroid/view/View;"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r0
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r1 = 0
            java.lang.Object r2 = r2.mo10231a(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            r0.setVisibility(r1)
            java.lang.String r21 = "com/tencent/mm/ui/transmit/SelectConversationUI"
            java.lang.String r22 = "initFinderObjectDialog"
            java.lang.String r23 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentFinderObject;)Landroid/view/View;"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            if (r14 == 0) goto L_0x0810
            r0 = 2131099940(0x7f060124, float:1.7812247E38)
            r1 = 2131099697(0x7f060031, float:1.7811755E38)
            r14.f21262i = r1
            r14.f21261h = r0
            goto L_0x0810
        L_0x07d2:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r2 = r20
            r1.mo10233c(r2)
            java.lang.Object[] r21 = r1.mo10232b()
            java.lang.String r22 = "com/tencent/mm/ui/transmit/SelectConversationUI"
            java.lang.String r23 = "initFinderObjectDialog"
            java.lang.String r24 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentFinderObject;)Landroid/view/View;"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r0
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r21 = "com/tencent/mm/ui/transmit/SelectConversationUI"
            java.lang.String r22 = "initFinderObjectDialog"
            java.lang.String r23 = "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentFinderObject;)Landroid/view/View;"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
        L_0x0810:
            androidx.appcompat.app.AppCompatActivity r0 = r30.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165304(0x7f070078, float:1.7944821E38)
            float r0 = r0.getDimension(r1)
            int r0 = (int) r0
            te3.rk1 r1 = r6.f171710b
            java.util.LinkedList<te3.pk1> r1 = r1.f185190n
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0837
            te3.rk1 r1 = r6.f171710b
            java.util.LinkedList<te3.pk1> r1 = r1.f185190n
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            r9 = r1
            te3.pk1 r9 = (te3.C64628pk1) r9
            goto L_0x0838
        L_0x0837:
            r9 = 0
        L_0x0838:
            r1 = 2131299294(0x7f090bde, float:1.8216585E38)
            r2 = r17
            android.view.View r1 = r2.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            if (r9 == 0) goto L_0x0880
            float r3 = (float) r0
            float r5 = r9.f184830h
            float r5 = r5 * r3
            float r7 = r9.f184829g
            float r5 = r5 / r7
            int r5 = (int) r5
            r7 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 * r7
            r7 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 / r7
            int r3 = (int) r3
            if (r0 <= r5) goto L_0x086c
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r3, r0)
            r11.setLayoutParams(r5)
            if (r1 == 0) goto L_0x0888
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.width = r3
            r1.setLayoutParams(r0)
            goto L_0x0888
        L_0x086c:
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r0, r3)
            r11.setLayoutParams(r5)
            if (r1 == 0) goto L_0x0888
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            r3.width = r0
            r1.setLayoutParams(r3)
            goto L_0x0888
        L_0x0880:
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r0, r0)
            r11.setLayoutParams(r3)
        L_0x0888:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r0.<init>(r3, r3)
            r10.setLayoutParams(r0)
            di3.d r0 = di3.C86312j.m106911c(r4)
            ht1.t1 r0 = (ht1.C60200t1) r0
            ht1.z4 r0 = r0.mo76861l7()
            te3.rk1 r3 = r6.f171710b
            r5 = r32
            r7 = r16
            r6 = 0
            r0.mo83761H5(r5, r7, r3, r6)
            if (r1 == 0) goto L_0x08ba
            di3.d r0 = di3.C86312j.m106911c(r4)
            ht1.t1 r0 = (ht1.C60200t1) r0
            ht1.z4 r0 = r0.mo76861l7()
            r3 = 2131233043(0x7f080913, float:1.8082212E38)
            r4 = 2131233042(0x7f080912, float:1.808221E38)
            r0.mo83777X5(r1, r3, r4)
        L_0x08ba:
            r0 = r31
            r0.mo108565c(r2)
        L_0x08bf:
            r1 = 0
            r0.mo108570h(r1)
            goto L_0x0de1
        L_0x08c5:
            r12 = r0
            r0 = r1
            androidx.appcompat.app.AppCompatActivity r1 = r30.getContext()
            com.tencent.mm.autogen.events.RecordOperationEvent r1 = com.tencent.p014mm.p136ui.chatting.C73313b1.m86458d(r1)
            com.tencent.mm.autogen.events.RecordOperationEvent$b r1 = r1.f265028e
            se3.c r1 = r1.f265054g
            java.lang.String r1 = r1.f226460d
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r8)
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131821600(0x7f110420, float:1.9275948E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.mo108571i(r1)
            boolean r0 = r12.f220170U0
            if (r0 == 0) goto L_0x0de1
            boolean r0 = r12.f220176X0
            if (r0 == 0) goto L_0x0de1
            com.tencent.mm.storage.f4 r0 = r12.f220188h1
            r1 = 8
            com.tencent.p014mm.modelstat.C68144a.m80546b(r0, r1)
            goto L_0x0de1
        L_0x0904:
            r12 = r0
            r0 = r1
            androidx.appcompat.app.AppCompatActivity r1 = r30.getContext()
            com.tencent.mm.autogen.events.RecordOperationEvent r1 = com.tencent.p014mm.p136ui.chatting.C73313b1.m86458d(r1)
            com.tencent.mm.autogen.events.RecordOperationEvent$a r1 = r1.f265027d
            java.util.List<com.tencent.mm.storage.f4> r1 = r1.f265040l
            if (r1 == 0) goto L_0x0919
            int r1 = r1.size()
            goto L_0x091a
        L_0x0919:
            r1 = 0
        L_0x091a:
            androidx.appcompat.app.AppCompatActivity r2 = r30.getContext()
            r3 = 2131834847(0x7f1137df, float:1.9302816E38)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 0
            r4[r5] = r1
            java.lang.String r1 = r2.getString(r3, r4)
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131821599(0x7f11041f, float:1.9275946E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.mo108571i(r1)
            goto L_0x0de1
        L_0x094b:
            r12 = r0
            r0 = r1
            android.graphics.Bitmap r1 = r30.mo104147z8()
            r2 = 2
            r0.mo108566d(r1, r2)
            goto L_0x0de1
        L_0x0957:
            r12 = r0
            r0 = r1
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            java.lang.String r2 = r12.f220193m1
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            com.tencent.mm.storage.f4$e r1 = r1.Tx0(r2)
            java.lang.String r1 = r1.f212707e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            androidx.appcompat.app.AppCompatActivity r3 = r30.getContext()
            r4 = 2131821573(0x7f110405, float:1.9275893E38)
            java.lang.String r3 = r3.getString(r4)
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.mo108571i(r1)
            goto L_0x0de1
        L_0x098a:
            r12 = r0
            r0 = r1
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            java.lang.String r2 = r12.f220193m1
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            com.tencent.mm.storage.f4$b r1 = r1.Rv0(r2)
            java.lang.String r2 = r1.f212675a
            r12.f220162Q0 = r2
            java.lang.String r2 = r1.f212676b
            r12.f220164R0 = r2
            int r1 = r1.f212691q
            java.util.Set<java.lang.String> r2 = eb0.C45628s0.f123410p
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85810M4(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r12.f220166S0 = r1
            java.lang.String r1 = r12.f220162Q0
            r12.mo104119G8(r0, r1)
            goto L_0x0de1
        L_0x09b9:
            r12 = r0
            r0 = r1
            java.lang.String r1 = r12.f220189i1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x09ca
            java.lang.String r1 = r12.f220189i1
            r0.mo108567e(r1)
            goto L_0x0de1
        L_0x09ca:
            com.tencent.mm.storage.f4 r1 = r12.f220188h1
            java.lang.String r1 = r1.mo108765s2()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x09e1
            com.tencent.mm.storage.f4 r1 = r12.f220188h1
            java.lang.String r1 = r1.mo108765s2()
            r0.mo108567e(r1)
            goto L_0x0de1
        L_0x09e1:
            java.lang.String r1 = r12.f220194n1
            r0.mo108567e(r1)
            goto L_0x0de1
        L_0x09e8:
            r12 = r0
            r0 = r1
            java.lang.String r1 = r12.f220193m1
            r0.mo108571i(r1)
            r1 = 2
            r0.mo108572j(r1)
            goto L_0x0de1
        L_0x09f5:
            r12 = r0
            r0 = r1
            java.lang.String r1 = r12.f220197p1
            if (r1 == 0) goto L_0x0de1
            android.content.res.Resources r1 = r30.getResources()
            r2 = 2131821530(0x7f1103da, float:1.9275806E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>(r1)
            java.lang.String r1 = r12.f220197p1
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.mo108571i(r1)
            goto L_0x0de1
        L_0x0a19:
            r2 = r12
            r12 = r0
            r0 = r1
            java.lang.String r1 = r12.f220193m1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r1)
            r3 = 0
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r3)
            com.tencent.mm.storage.f4 r4 = r12.f220188h1
            boolean r4 = r4.mo100967F3()
            if (r4 == 0) goto L_0x0a41
            if (r1 != 0) goto L_0x0a41
            java.lang.String r1 = r12.f220193m1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r1)
            java.lang.String r4 = r12.f220193m1
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r4)
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r4)
        L_0x0a41:
            if (r1 != 0) goto L_0x0a64
            java.lang.String r1 = r12.f220195o1
            if (r1 == 0) goto L_0x0a63
            android.content.res.Resources r1 = r30.getResources()
            r2 = 2131821728(0x7f1104a0, float:1.9276207E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = r12.f220195o1
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.mo108571i(r1)
        L_0x0a63:
            return
        L_0x0a64:
            java.lang.String r4 = r1.f195570f
            com.tencent.mm.storage.f4 r5 = r12.f220188h1
            int r6 = r12.f220205x0
            boolean r5 = com.tencent.p014mm.p136ui.chatting.C73687g1.m87264b(r5, r6)
            r6 = 48
            if (r5 == 0) goto L_0x0a7f
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131821053(0x7f1101fd, float:1.9274838E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0d09
        L_0x0a7f:
            int r5 = r1.f195582i
            r7 = 5
            if (r5 != r7) goto L_0x0a91
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131821721(0x7f110499, float:1.9276193E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0d09
        L_0x0a91:
            r7 = 6
            if (r5 != r7) goto L_0x0aa1
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131821530(0x7f1103da, float:1.9275806E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0d09
        L_0x0aa1:
            r7 = 24
            if (r5 != r7) goto L_0x0ab6
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131821616(0x7f110430, float:1.927598E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r4 = r12.mo104145w8(r1)
            goto L_0x0d09
        L_0x0ab6:
            r7 = 19
            if (r5 != r7) goto L_0x0ac7
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131821659(0x7f11045b, float:1.9276067E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0d09
        L_0x0ac7:
            r7 = 3
            if (r5 == r7) goto L_0x0cc2
            r7 = 76
            if (r5 != r7) goto L_0x0ad0
            goto L_0x0cc2
        L_0x0ad0:
            r7 = 4
            if (r5 != r7) goto L_0x0ae0
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131821728(0x7f1104a0, float:1.9276207E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0d09
        L_0x0ae0:
            r7 = 8
            if (r5 != r7) goto L_0x0af1
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131821469(0x7f11039d, float:1.9275682E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0d09
        L_0x0af1:
            r7 = 44
            if (r5 != r7) goto L_0x0b23
            java.lang.String r2 = r1.f195638w
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0b0a
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131821692(0x7f11047c, float:1.9276134E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0d09
        L_0x0b0a:
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131821482(0x7f1103aa, float:1.9275708E38)
            java.lang.String r2 = r2.getString(r3)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = r1.f195638w
            r7 = 0
            r3[r7] = r5
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.safeFormatString(r2, r3)
            goto L_0x0d09
        L_0x0b23:
            r7 = 33
            if (r5 == r7) goto L_0x0b76
            r7 = 36
            if (r5 == r7) goto L_0x0b76
            if (r5 != r6) goto L_0x0b2e
            goto L_0x0b76
        L_0x0b2e:
            r2 = 53
            if (r5 == r2) goto L_0x0b73
            r2 = 57
            if (r5 != r2) goto L_0x0b37
            goto L_0x0b73
        L_0x0b37:
            r2 = 98
            if (r5 != r2) goto L_0x0b55
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131821482(0x7f1103aa, float:1.9275708E38)
            java.lang.String r2 = r2.getString(r3)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r1.f195574g
            r5 = 0
            r3[r5] = r4
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.safeFormatString(r2, r3)
            r4 = r8
            goto L_0x0d09
        L_0x0b55:
            r2 = 101(0x65, float:1.42E-43)
            if (r5 != r2) goto L_0x0b66
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131821721(0x7f110499, float:1.9276193E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0d09
        L_0x0b66:
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131820945(0x7f110191, float:1.927462E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0d09
        L_0x0b73:
            r2 = r8
            goto L_0x0d09
        L_0x0b76:
            int r7 = r1.f195581h2
            r9 = 2
            if (r7 == r9) goto L_0x0b92
            r9 = 3
            if (r7 == r9) goto L_0x0b92
            r7 = 36
            if (r5 == r7) goto L_0x0b92
            if (r5 != r6) goto L_0x0b85
            goto L_0x0b92
        L_0x0b85:
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131821053(0x7f1101fd, float:1.9274838E38)
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0d09
        L_0x0b92:
            int r4 = r1.f195597l2
            r5 = 0
            boolean r7 = r1.mo93554q(r5)
            if (r7 == 0) goto L_0x0bc1
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r3 = "key_biz"
            r9.putInt(r3, r4)
            java.lang.String r3 = r1.f195638w
            java.lang.String r4 = "key_footer_text_default"
            r9.putString(r4, r3)
            androidx.appcompat.app.AppCompatActivity r3 = r30.getContext()
            java.lang.String r3 = r1.mo93549l(r3, r5)
            java.lang.String r4 = "key_footer_text"
            r9.putString(r4, r3)
            java.lang.String r3 = r1.f195471B2
            java.lang.String r4 = "key_footer_icon"
            r9.putString(r4, r3)
            goto L_0x0bf1
        L_0x0bc1:
            int r5 = r1.f195582i
            if (r5 != r6) goto L_0x0bdf
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r3 = "is_video"
            r5 = 1
            r9.putBoolean(r3, r5)
            java.lang.String r3 = r1.f195471B2
            java.lang.String r4 = "key_footer_icon"
            r9.putString(r4, r3)
            java.lang.String r3 = r1.f195638w
            java.lang.String r4 = "key_footer_text"
            r9.putString(r4, r3)
            goto L_0x0bf1
        L_0x0bdf:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r6[r5] = r4
            java.lang.String r4 = "MicroMsg.SelectConversationUI"
            java.lang.String r5 = "fake native share msg biz invalidate, biz: %d."
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r5, r6)
            r9 = r3
        L_0x0bf1:
            java.lang.Class<kb0.i> r3 = kb0.C76529i.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            kb0.i r3 = (kb0.C76529i) r3
            if (r32 != 0) goto L_0x0bfd
            r4 = 0
            goto L_0x0c01
        L_0x0bfd:
            boolean r4 = eb0.C45628s0.m50755T(r32)
        L_0x0c01:
            com.tencent.mm.ui.transmit.SelectConversationUI$q r5 = new com.tencent.mm.ui.transmit.SelectConversationUI$q
            r5.<init>()
            android.view.View r3 = r3.mo106760I7(r12, r9, r4, r5)
            r0.mo108565c(r3)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r0.mo108569g(r4)
            r4 = 0
            r0.mo108570h(r4)
            java.lang.Class<gt.k> r4 = p158gt.C98201k.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            com.tencent.mm.storage.f4 r5 = r12.f220188h1
            java.lang.String r5 = r5.mo108765s2()
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            java.lang.String r4 = r4.h30(r5)
            java.lang.String r5 = js0.C9515s.m9209a(r30)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = r1.f195577g2
            java.lang.String r8 = "app_id"
            r6.putString(r8, r7)
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r8 = r1.f195653z2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 0
            r7[r9] = r8
            r8 = 1
            r7[r8] = r2
            java.lang.String r2 = "%d-%d"
            java.lang.String r2 = java.lang.String.format(r2, r7)
            java.lang.String r7 = "msg_id"
            r6.putString(r7, r2)
            int r2 = r1.f195653z2
            java.lang.String r7 = "msg_pkg_type"
            r6.putInt(r7, r2)
            java.lang.String r2 = "pkg_version"
            r6.putInt(r2, r9)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r2 != 0) goto L_0x0c80
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "file://"
            r2.append(r7)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "image_url"
            r6.putString(r4, r2)
        L_0x0c80:
            java.lang.Class<com.tencent.mm.message.a> r2 = com.tencent.p014mm.message.C80995a.class
            com.tencent.mm.message.g r2 = r1.mo93555w(r2)
            com.tencent.mm.message.a r2 = (com.tencent.p014mm.message.C80995a) r2
            if (r2 == 0) goto L_0x0ca0
            boolean r4 = r2.f237893b
            java.lang.String r7 = "is_dynamic_page"
            r6.putBoolean(r7, r4)
            java.lang.String r4 = r2.f237894c
            java.lang.String r7 = "cache_key"
            r6.putString(r7, r4)
            int r2 = r2.f237911t
            java.lang.String r4 = "sub_type"
            r6.putInt(r4, r2)
        L_0x0ca0:
            java.lang.String r2 = r1.f195570f
            java.lang.String r4 = "title"
            r6.putString(r4, r2)
            java.lang.String r1 = r1.f195569e2
            java.lang.String r2 = "msg_path"
            r6.putString(r2, r1)
            java.lang.Class<kb0.i> r1 = kb0.C76529i.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kb0.i r1 = (kb0.C76529i) r1
            r1.mo106762jI(r5, r3, r6)
            com.tencent.mm.ui.transmit.SelectConversationUI$r r1 = new com.tencent.mm.ui.transmit.SelectConversationUI$r
            r1.<init>(r12, r5, r3)
            r0.f230209e = r1
            return
        L_0x0cc2:
            java.lang.Class<com.tencent.mm.pluginsdk.ui.tools.m> r2 = com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m.class
            com.tencent.mm.message.g r2 = r1.mo93555w(r2)
            com.tencent.mm.pluginsdk.ui.tools.m r2 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r2
            if (r2 == 0) goto L_0x0cfe
            java.lang.Class<gt.k> r3 = p158gt.C98201k.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            gt.k r3 = (p158gt.C98201k) r3
            gt.m r3 = r3.mo137277xi()
            com.tencent.mm.storage.f4 r4 = r12.f220188h1
            java.lang.String r4 = r4.mo108765s2()
            com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
            java.lang.String r3 = r3.h30(r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x0cf0
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r4 != 0) goto L_0x0cf2
        L_0x0cf0:
            java.lang.String r3 = r12.f220192l1
        L_0x0cf2:
            android.view.View r1 = r12.mo104118F8(r3, r1, r2)
            r0.mo108565c(r1)
            r1 = 0
            r0.mo108570h(r1)
            return
        L_0x0cfe:
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131821602(0x7f110422, float:1.9275952E38)
            java.lang.String r2 = r2.getString(r3)
        L_0x0d09:
            int r3 = r1.f195582i
            if (r3 != r6) goto L_0x0d18
            android.content.res.Resources r2 = r30.getResources()
            r3 = 2131821550(0x7f1103ee, float:1.9275846E38)
            java.lang.String r2 = r2.getString(r3)
        L_0x0d18:
            int r3 = r1.f195582i
            r5 = 46
            if (r3 != r5) goto L_0x0d29
            android.graphics.Bitmap r1 = r30.mo104143u8()
            r2 = 2
            r0.mo108566d(r1, r2)
        L_0x0d26:
            r1 = 8
            goto L_0x0d8b
        L_0x0d29:
            r5 = 69
            if (r3 != r5) goto L_0x0d69
            java.lang.Class<gy1.a> r2 = gy1.C76074a.class
            com.tencent.mm.message.g r1 = r1.mo93555w(r2)
            gy1.a r1 = (gy1.C76074a) r1
            if (r1 == 0) goto L_0x0d26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.res.Resources r3 = r30.getResources()
            r4 = 2131821549(0x7f1103ed, float:1.9275844E38)
            java.lang.String r3 = r3.getString(r4)
            r2.append(r3)
            java.lang.String r3 = r1.f222932c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.mo108571i(r2)
            java.lang.String r2 = r1.f222931b
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0d26
            java.lang.String r1 = r1.f222931b
            r0.mo108575m(r1)
            r1 = 8
            r0.mo108576n(r1)
            goto L_0x0d26
        L_0x0d69:
            if (r4 != 0) goto L_0x0d6c
            goto L_0x0d6d
        L_0x0d6c:
            r8 = r4
        L_0x0d6d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = r3.toString()
            r0.mo108571i(r2)
            java.lang.String r1 = r1.f195646y
            if (r1 == 0) goto L_0x0d26
            r0.mo108575m(r1)
            r1 = 8
            r0.mo108576n(r1)
        L_0x0d8b:
            boolean r0 = r12.f220170U0
            if (r0 == 0) goto L_0x0de1
            r0 = 10
            int r2 = r12.f220182b1
            if (r0 != r2) goto L_0x0de1
            boolean r0 = r12.f220176X0
            if (r0 == 0) goto L_0x0de1
            com.tencent.mm.storage.f4 r0 = r12.f220188h1
            com.tencent.p014mm.modelstat.C68144a.m80546b(r0, r1)
            goto L_0x0de1
        L_0x0d9f:
            r12 = r0
            r0 = r1
            android.graphics.Bitmap r1 = r30.mo104147z8()
            r2 = 2
            r0.mo108566d(r1, r2)
            goto L_0x0de1
        L_0x0daa:
            r12 = r0
            r0 = r1
            r1 = 0
            android.graphics.Bitmap r2 = r30.mo104143u8()
            if (r2 != 0) goto L_0x0ddd
            java.lang.String r3 = r12.f220194n1
            if (r3 == 0) goto L_0x0ddd
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r2 = kg3.C76577a.m92156g(r2)
            java.lang.String r3 = r12.f220194n1
            r4 = 140(0x8c, float:1.96E-43)
            r5 = 140(0x8c, float:1.96E-43)
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r3, (int) r4, (int) r5, (float) r2)
            java.lang.String r3 = r12.f220194n1
            com.tencent.mm.compatible.util.Exif r3 = com.tencent.p014mm.compatible.util.Exif.fromFile(r3)
            int r3 = r3.getOrientationInDegree()
            if (r3 >= 0) goto L_0x0dd7
            r10 = 0
            goto L_0x0dd8
        L_0x0dd7:
            r10 = r3
        L_0x0dd8:
            float r1 = (float) r10
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r2, r1)
        L_0x0ddd:
            r1 = 3
            r0.mo108566d(r2, r1)
        L_0x0de1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.transmit.SelectConversationUI.mo104114B8(wd3.u$h, java.lang.String):void");
    }

    /* renamed from: C8 */
    public final void mo104115C8(C78575u.C78583h hVar) {
        int i;
        int i2 = this.f220182b1;
        if (!(i2 == 0 || i2 == 1)) {
            if (i2 != 2) {
                if (i2 == 3) {
                    hVar.mo108564b(new C74882d0());
                    return;
                } else if (i2 == 4) {
                    hVar.mo108564b(new C74905s());
                    return;
                } else if (i2 != 16) {
                    switch (i2) {
                        case 9:
                            if (C97625j3.m125812b().mo105911z() != null) {
                                C72963f4.C72968e Tx0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Tx0(this.f220193m1);
                                hVar.mo108564b(new C74907u(Tx0, Tx0.f212707e));
                                return;
                            }
                            return;
                        case 10:
                            break;
                        case 11:
                            break;
                        case 12:
                            C73313b1.m86458d(getContext());
                            return;
                        case 13:
                            hVar.mo108564b(new C74880c0());
                            return;
                        default:
                            return;
                    }
                }
            }
            C68070l.C68072b u = C68070l.C68072b.m80422u(Util.processXml(this.f220193m1), (String) null);
            if (u != null) {
                if ((u.f195582i == 5 && !C73687g1.m87264b(this.f220188h1, this.f220205x0)) || (i = u.f195582i) == 69) {
                    hVar.mo108564b(new C74908v(u.f195586j));
                    return;
                } else if (i == 6) {
                    hVar.mo108564b(new C74909w());
                    return;
                } else if (i == 24) {
                    hVar.mo108564b(new C74910x(u));
                    return;
                } else if (i == 19) {
                    hVar.mo108564b(new C74911y(u));
                    return;
                } else if (i == 3 || i == 76) {
                    hVar.mo108564b(new C74912z(u));
                    return;
                } else if (i == 4) {
                    hVar.mo108564b(new C74876a0(this));
                    return;
                } else if (i == 53 || i == 57) {
                    hVar.mo108564b(new C74878b0(u));
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        hVar.mo108564b(new C74906t());
    }

    /* renamed from: D8 */
    public final View mo104116D8(C60175i iVar) {
        int i;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Class cls3 = C76243a5.class;
        Class cls4 = C60606n.class;
        C64287ci1 ci12 = iVar.f171712b;
        View inflate = View.inflate(this, C0966R.C0971layout.d8x, (ViewGroup) null);
        MMTextView mMTextView = (MMTextView) inflate.findViewById(C0966R.C0970id.kpm);
        mMTextView.setTextSize(2, 10.0f);
        mMTextView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, Util.nullAsNil(ci12.f182504p)));
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.c2h);
        textView.setTextSize(2, 12.0f);
        ((C76243a5) C86312j.m106911c(cls3)).mo13247y9(textView, false);
        textView.setText("¥" + ((C76243a5) C86312j.m106911c(cls3)).mo13234cB(ci12.f182506r));
        ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11870V().mo85957c(((C62368t0) C86312j.m106911c(C62368t0.class)).mo87412UE(ci12.f182503o, C27696y.THUMB_IMAGE), (ImageView) inflate.findViewById(C0966R.C0970id.bv8), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.o55);
        MMTextView mMTextView2 = (MMTextView) inflate.findViewById(C0966R.C0970id.f6098x9);
        mMTextView2.setTextSize(2, 10.0f);
        ImageView imageView2 = (ImageView) inflate.findViewById(C0966R.C0970id.f6097x8);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.o8g);
        View findViewById = inflate.findViewById(C0966R.C0970id.ohl);
        linearLayout.removeAllViews();
        String str = ci12.f182491E;
        if (str == null || str.isEmpty()) {
            i = 0;
        } else {
            ((C60606n) C86312j.m106911c(cls4)).pu0("MicroMsg.SelectConversationUI", linearLayout.getContext(), linearLayout, ci12.f182491E, 9.0f, MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df) / 4, C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3766df) / 2, true);
            if (linearLayout.getVisibility() != 0) {
                linearLayout.setVisibility(0);
            }
            i = 1;
        }
        String str2 = ci12.f182492F;
        if (str2 != null && !str2.isEmpty()) {
            i++;
            ((C60606n) C86312j.m106911c(cls4)).pu0("MicroMsg.SelectConversationUI", linearLayout.getContext(), linearLayout, ci12.f182492F, 9.0f, MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df) / 4, C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3766df) / 2, true);
            if (linearLayout.getVisibility() != 0) {
                linearLayout.setVisibility(0);
            }
        }
        String str3 = ci12.f182493G;
        if (str3 != null && !str3.isEmpty()) {
            i++;
            ((C60606n) C86312j.m106911c(cls4)).pu0("MicroMsg.SelectConversationUI", linearLayout.getContext(), linearLayout, ci12.f182492F, 9.0f, MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df) / 4, C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3766df) / 2, true);
            if (linearLayout.getVisibility() != 0) {
                linearLayout.setVisibility(0);
            }
        }
        if (i > 0) {
            mMTextView.setMaxLines(1);
        } else {
            mMTextView.setMaxLines(2);
        }
        mMTextView2.setText(ci12.f182508t);
        String str4 = ci12.f182514z;
        if (str4 != null) {
            C99101e eVar = C99101e.f290570a;
            C99101e.f290571b.mo85957c(Util.nullAsNil(str4), imageView, new C100075f.C100076a().mo139398a());
        } else {
            imageView.setVisibility(8);
        }
        if (ci12.f182507s != null) {
            C100075f.C100076a aVar = new C100075f.C100076a();
            aVar.f293176b = true;
            aVar.f293175a = true;
            aVar.f293186l = true;
            C100075f a = aVar.mo139398a();
            C99101e eVar2 = C99101e.f290570a;
            C99101e.f290571b.mo85957c(Util.nullAsNil(ci12.f182507s), imageView2, a);
        }
        String str5 = ci12.f182487A;
        String str6 = ci12.f182489C;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        if (!str5.isEmpty()) {
            linkedList.add(str5);
            linkedList2.add(Float.valueOf(ci12.f182488B));
        }
        if (!str6.isEmpty()) {
            linkedList.add(str6);
            linkedList2.add(Float.valueOf(ci12.f182490D));
        }
        View view = findViewById;
        ((C60606n) C86312j.m106911c(cls4)).mo85040UB(mMTextView, linkedList, linkedList2, ci12.f182504p, C76577a.m92151b(getContext(), 12), true);
        ((C60606n) C86312j.m106911c(cls4)).ae0("product_icon", getUICScope(), mMTextView, linkedList, ci12.f182504p, true, false, true, true, C76577a.m92151b(getContext(), 12), (C32224a<C13598b0>) null);
        if (ci12.f182494H) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/transmit/SelectConversationUI", "initFinderProductDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentFinderProductObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/transmit/SelectConversationUI", "initFinderProductDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentFinderProductObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view3 = view;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/ui/transmit/SelectConversationUI", "initFinderProductDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentFinderProductObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/transmit/SelectConversationUI", "initFinderProductDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentFinderProductObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return inflate;
    }

    /* renamed from: E8 */
    public final View mo104117E8(C60181l lVar) {
        C60181l lVar2 = lVar;
        C11978e0.C11979a aVar = C11978e0.C11979a.COMMON;
        Class cls = C76979h.class;
        Class cls2 = C60200t1.class;
        C100075f.C100076a aVar2 = new C100075f.C100076a();
        aVar2.f293176b = true;
        aVar2.f293175a = true;
        aVar2.f293186l = true;
        C100075f a = aVar2.mo139398a();
        View inflate = View.inflate(this, C0966R.C0971layout.bys, (ViewGroup) null);
        View findViewById = inflate.findViewById(C0966R.C0970id.d94);
        C99101e eVar = C99101e.f290570a;
        C99101e.f290571b.mo85957c(Util.nullAsNil(lVar2.f171715b.f183244g), (ImageView) findViewById.findViewById(C0966R.C0970id.d78), a);
        ((TextView) findViewById.findViewById(C0966R.C0970id.e3v)).setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this, lVar2.f171715b.f183243f));
        ImageView imageView = (ImageView) findViewById.findViewById(C0966R.C0970id.e85);
        ImageView imageView2 = (ImageView) findViewById.findViewById(C0966R.C0970id.e2y);
        TextView textView = (TextView) findViewById.findViewById(C0966R.C0970id.d86);
        View findViewById2 = findViewById.findViewById(C0966R.C0970id.f358061d82);
        if (lVar2.f171715b.f183247j.size() > 0) {
            if (!Util.isNullOrNil(lVar2.f171715b.f183247j.get(0).f183043h)) {
                ((C60200t1) C86312j.m106911c(cls2)).mo76741Cm(lVar2.f171715b.f183247j.get(0).f183043h, imageView, aVar);
            } else {
                ((C60200t1) C86312j.m106911c(cls2)).mo76741Cm(lVar2.f171715b.f183247j.get(0).f183040e, imageView, aVar);
            }
        }
        if (!Util.isNullOrNil(lVar2.f171715b.f183245h)) {
            textView.setVisibility(0);
            textView.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this, lVar2.f171715b.f183245h));
        } else {
            textView.setVisibility(8);
        }
        imageView2.setVisibility(0);
        if (((C75651n) C86312j.m106911c(C75651n.class)).ld0() == 1) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view = findViewById2;
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/ui/transmit/SelectConversationUI", "initMegaVideoDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentMegaVideo;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/transmit/SelectConversationUI", "initMegaVideoDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentMegaVideo;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/ui/transmit/SelectConversationUI", "initMegaVideoDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentMegaVideo;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/transmit/SelectConversationUI", "initMegaVideoDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentMegaVideo;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int dimension = (int) getContext().getResources().getDimension(C0966R.dimen.f3720ca);
        C64350ew2 first = lVar2.f171715b.f183247j.getFirst();
        imageView.setLayoutParams(new FrameLayout.LayoutParams(dimension, (int) (C16095a.m14979a((first.f183042g * 1.0f) / first.f183041f, 1.0f, 1.3333334f) * ((float) dimension))));
        findViewById.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.b6a);
        if (linearLayout != null) {
            ((C60200t1) C86312j.m106911c(cls2)).mo76861l7().mo83777X5(linearLayout, C0966R.C0969drawable.f357203a53, C0966R.C0969drawable.f357201a52);
        }
        return inflate;
    }

    /* renamed from: F8 */
    public final View mo104118F8(String str, C68070l.C68072b bVar, C72916m mVar) {
        boolean z;
        Bitmap bitmap;
        C72916m mVar2 = mVar;
        Class cls = C98201k.class;
        C100075f.C100076a aVar = new C100075f.C100076a();
        aVar.f293176b = true;
        aVar.f293175a = true;
        aVar.f293186l = true;
        aVar.mo139398a();
        View inflate = View.inflate(this, C0966R.C0971layout.f359979bz2, (ViewGroup) null);
        ((RoundCornerRelativeLayout) inflate.findViewById(C0966R.C0970id.iwu)).setRadius((float) C76577a.m92151b(MMApplicationContext.getContext(), 4));
        View findViewById = inflate.findViewById(C0966R.C0970id.aft);
        View findViewById2 = inflate.findViewById(C0966R.C0970id.h5u);
        if (C85875k4.m106211z()) {
            findViewById2.setBackgroundResource(C0966R.C0969drawable.atm);
        } else {
            findViewById2.setBackgroundResource(C0966R.C0969drawable.atn);
        }
        MMRoundCornerImageView mMRoundCornerImageView = (MMRoundCornerImageView) findViewById2.findViewById(C0966R.C0970id.b7t);
        TextView textView = (TextView) findViewById2.findViewById(C0966R.C0970id.b7x);
        TextView textView2 = (TextView) findViewById2.findViewById(C0966R.C0970id.b7y);
        TextView textView3 = (TextView) findViewById2.findViewById(C0966R.C0970id.b7v);
        mMRoundCornerImageView.setImageDrawable(MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.aiu));
        if (C85875k4.m106211z()) {
            mMRoundCornerImageView.setImageDrawable(MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.ait));
        }
        textView2.setText(bVar.mo93550m());
        if (!Util.isNullOrNil(bVar.mo93548k())) {
            textView.setText(bVar.mo93548k());
            textView.setVisibility(0);
        } else {
            textView.setText("");
            textView.setVisibility(8);
        }
        String str2 = mVar2.f212523f;
        String str3 = mVar2.f212524g;
        if (!Util.isNullOrNil(str3)) {
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).topMargin = C76577a.m92151b(MMApplicationContext.getContext(), 6);
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = C76577a.m92151b(MMApplicationContext.getContext(), 2);
            View findViewById3 = findViewById2.findViewById(C0966R.C0970id.hqn);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view = findViewById3;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/transmit/SelectConversationUI", "initMusicPieceDialog", "(Ljava/lang/String;Lcom/tencent/mm/message/AppMessage$Content;Lcom/tencent/mm/pluginsdk/ui/tools/AppContentMusicPiece;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/transmit/SelectConversationUI", "initMusicPieceDialog", "(Ljava/lang/String;Lcom/tencent/mm/message/AppMessage$Content;Lcom/tencent/mm/pluginsdk/ui/tools/AppContentMusicPiece;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView3.setText(str3 + getContext().getString(C0966R.string.h2w));
            textView3.setVisibility(0);
        } else {
            textView3.setText("");
            textView3.setVisibility(8);
        }
        boolean[] zArr = {false};
        if (!Util.isNullOrNil(str2)) {
            C20937c.C20939b bVar2 = new C20937c.C20939b();
            bVar2.f59350f = C102984b.m136166c(str2);
            bVar2.f59346b = true;
            bVar2.f59364t = true;
            bVar2.f59345a = true;
            bVar2.f59365u = (float) C76577a.m92151b(getContext(), 2);
            C20828a.m22825b().mo32520i(str2, mMRoundCornerImageView, bVar2.mo32666a(), new C57852e0(findViewById, zArr));
        } else if (bVar.mo93553p() || !C97625j3.m125812b().mo105883I()) {
            mMRoundCornerImageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.bir));
        } else {
            String h302 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).h30(str);
            if (!C86013q1.m106450k(h302)) {
                z = false;
            } else {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                Bitmap decodeFile = BitmapUtil.decodeFile(h302, options);
                int i = options.outWidth;
                if (options.outHeight * i > 1048576) {
                    Log.m105925i("MicroMsg.SelectConversationUI", "Bitmap to big:%d/%d", Integer.valueOf(i), Integer.valueOf(options.outHeight));
                    z = true;
                } else {
                    z = false;
                }
                if (decodeFile != null) {
                    decodeFile.recycle();
                }
            }
            if (!z) {
                bitmap = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127167Lo(str, true, C76577a.m92156g(MMApplicationContext.getContext()), false, true);
            } else {
                bitmap = null;
            }
            if (bitmap == null || bitmap.isRecycled()) {
                zArr[0] = true;
            } else {
                mMRoundCornerImageView.setImageBitmap(bitmap);
                C55593g.f158270a.mo77114b(getContext(), findViewById, bitmap, C90193h.m112878f(str.getBytes()));
            }
        }
        findViewById2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        return inflate;
    }

    /* renamed from: G8 */
    public final void mo104119G8(C78575u.C78583h hVar, String str) {
        C97625j3.m125812b().mo105907v().mo69664N2(str);
        String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str);
        if (!Util.isNullOrNil(this.f220164R0)) {
            displayName = this.f220164R0;
        }
        StringBuffer stringBuffer = new StringBuffer(m89667t8(this, str, this.f220193m1));
        stringBuffer.append(displayName);
        hVar.mo108571i(stringBuffer.toString());
    }

    /* renamed from: H8 */
    public boolean mo104105H8() {
        return this.f220168T0;
    }

    /* renamed from: I8 */
    public final void mo104120I8(String str, int i) {
        mo103378K7();
        MultiSelectContactView multiSelectContactView = this.f218609h;
        if (multiSelectContactView != null) {
            multiSelectContactView.mo100244d(str);
        }
        if (this.f220172V0.contains(str)) {
            this.f220172V0.remove(str);
            if (this.f220174W0.containsKey(str)) {
                this.f220174W0.remove(str);
                return;
            }
            return;
        }
        this.f220172V0.add(str);
        this.f220174W0.put(str, Integer.valueOf(i));
    }

    /* renamed from: J8 */
    public final void mo104121J8() {
        Log.m105924i("MicroMsg.SelectConversationUI", "resetData: recent forward control switch on");
        if (!Util.isNullOrNil((List) this.f220172V0)) {
            for (int i = 0; i < this.f220172V0.size(); i++) {
                String str = this.f220172V0.get(i);
                Map<String, Integer> map = this.f220174W0;
                int intValue = (map == null || ((HashMap) map).size() <= 0 || !((HashMap) this.f220174W0).containsKey(str)) ? 0 : ((Integer) ((HashMap) this.f220174W0).get(str)).intValue();
                if (intValue == 0) {
                    intValue = -2;
                }
                mo104123L8(str, intValue);
                if (i < 5) {
                    C57827q0.m66828a(str);
                }
            }
            if (!Util.isNullOrNil(this.f220186f1)) {
                this.f220186f1 = null;
            }
            if (!Util.isNullOrNil(this.f220187g1)) {
                this.f220187g1 = null;
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.SelectConversationUI", "reportAndStorageRecentForward:  mSelectedUserSet is empty ");
    }

    /* renamed from: K8 */
    public final void mo104122K8(String str) {
        Log.m105924i("MicroMsg.SelectConversationUI", "resetData: recent forward control switch on");
        if (!Util.isNullOrNil(str)) {
            C57827q0.m66828a(str);
            mo104123L8(str, this.f220190j1);
            if (!Util.isNullOrNil(this.f220186f1)) {
                this.f220186f1 = null;
            }
            if (!Util.isNullOrNil(this.f220187g1)) {
                this.f220187g1 = null;
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.SelectConversationUI", "reportAndStorageRecentForward:  userName is empty ");
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        this.f220198q1 = new C74481e2(this, this.f220200s1, this.f220199r1, this.f220170U0, this.f220169U, this.f220181a1);
        boolean d = C97182r4.m125141d(getContext());
        C74481e2 e2Var = this.f220198q1;
        boolean z = d && !this.f220145E1;
        e2Var.getClass();
        Log.m105924i("MicroMsg.NewRecentConversationAdapter", "setSupportForwardToWeWork() called with: isSupport = [" + z + "]");
        e2Var.f219012H = z;
        if (this.f220149G1) {
            C74481e2 e2Var2 = this.f220198q1;
            e2Var2.f219013I = true;
            e2Var2.f219014J = true;
        }
        C74481e2 e2Var3 = this.f220198q1;
        e2Var3.f219007C = new C74884f0();
        e2Var3.f219008D = new C74913k0();
        return e2Var3;
    }

    /* renamed from: L8 */
    public final void mo104123L8(String str, int i) {
        int i2;
        int i3;
        Map<String, Integer> map;
        Map<String, Integer> map2;
        String str2 = str;
        int i4 = i;
        C74481e2 e2Var = this.f220198q1;
        if (e2Var == null) {
            e2Var = null;
        }
        if (e2Var != null) {
            long a = C31543z5.m39451a() - this.f220138A1;
            int i5 = 2;
            int i6 = 1;
            if (TextUtils.isEmpty(str)) {
                i2 = 0;
            } else {
                i2 = C75592q0.m90764L(str) ? 1 : C72996z1.m85816S4(str) ? 2 : C72996z1.m85820U5(str) ? 4 : 3;
            }
            String v8 = mo104144v8(1);
            int i7 = this.f220167T;
            int i8 = i7 == 17 ? 1 : this.f220176X0 ? 2 : this.f220156K ? 3 : i7 == 3 ? 4 : i7 == 14 ? 5 : (i7 == 1 || this.f220154J) ? 6 : i7 == 15 ? 7 : (i7 == 16 || this.f220177Y || this.f220196p0) ? 8 : (this.f220163R || this.f220158M) ? 9 : 0;
            int intValue = !((Util.isNullOrNil(str) || (map2 = e2Var.f219025w) == null || ((HashMap) map2).isEmpty()) ? false : ((HashMap) e2Var.f219025w).containsKey(str2)) ? 0 : ((Integer) ((HashMap) e2Var.f219025w).get(str2)).intValue();
            int intValue2 = !e2Var.mo103551u(str2) ? 0 : ((Integer) ((HashMap) e2Var.f219024v).get(str2)).intValue();
            if (i4 == -1) {
                i3 = 0;
            } else if (i4 == -2) {
                i3 = 2;
            } else {
                HashSet<String> hashSet = this.f218624z;
                int headerViewsCount = e2Var.f219006B == 0 ? 0 : this.f218605d.getHeaderViewsCount();
                if (!Util.isNullOrNil(this.f218610i.mo153855g()) || (hashSet != null && hashSet.contains(str2))) {
                    i5 = 3;
                } else {
                    if (((Util.isNullOrNil(str) || (map = e2Var.f219025w) == null || ((HashMap) map).isEmpty()) ? false : ((HashMap) e2Var.f219025w).containsKey(str2)) && i4 == headerViewsCount) {
                        i5 = 1;
                    } else if (!e2Var.mo103551u(str2) || i4 <= headerViewsCount + 1) {
                        i5 = 0;
                    }
                }
                i3 = i5;
            }
            boolean z = !Util.isNullOrNil((List) this.f220172V0);
            if (this.f220167T != 13) {
                i6 = 0;
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C24300e(this, v8, i2, intValue, intValue2, i6, z ? 1 : 0, i8, i3, str, e2Var.f219026x, a, e2Var.f219028z, e2Var.f219027y, 2));
        }
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return new C74551q1(this, this.f220200s1, this.f220170U0, this.f218604A);
    }

    /* renamed from: M8 */
    public final void mo104124M8(C78575u.C78583h hVar, boolean z, String str) {
        C77398g gVar = hVar.f230207c;
        if (gVar != null && gVar.f225693g != null) {
            ArrayList arrayList = new ArrayList();
            if (str == null || str.equals("")) {
                List<String> list = this.f220172V0;
                if (list != null && !list.isEmpty()) {
                    arrayList.addAll(this.f220172V0);
                }
            } else {
                arrayList.add(str);
            }
            Button button = hVar.f230207c.f225693g;
            ArrayList arrayList2 = new ArrayList();
            List<C72963f4> list2 = this.f220185e1;
            if (list2 == null) {
                C72963f4 f4Var = this.f220188h1;
                if (f4Var != null) {
                    arrayList2.add(f4Var);
                }
            } else {
                arrayList2.addAll(list2);
            }
            Boolean bool = Boolean.FALSE;
            if (this.f220182b1 == 13) {
                bool = Boolean.TRUE;
            }
            ((C76622f) C86312j.m106911c(C76622f.class)).mo106872hL(button, arrayList, arrayList2, z, bool.booleanValue());
        }
    }

    /* renamed from: N8 */
    public final void mo104125N8(Intent intent, String str, List<String> list) {
        if (list.size() > 0) {
            intent.putExtra("be_send_card_name", str);
            intent.putExtra("received_card_name", Util.listToString(list, ","));
            intent.putExtra("Is_Chatroom", false);
        }
    }

    /* renamed from: O8 */
    public final void mo104126O8(Intent intent, String str, String str2) {
        Assert.assertTrue("cardNameToSend is null", str != null);
        intent.putExtra("be_send_card_name", str);
        intent.putExtra("received_card_name", str2);
        intent.putExtra("Is_Chatroom", true);
    }

    /* renamed from: P7 */
    public int[] mo64515P7() {
        int[] intArrayExtra = getIntent().getIntArrayExtra("search_range");
        int i = this.f220167T;
        if (i != 4 && i != 10) {
            return intArrayExtra != null ? intArrayExtra : super.mo64515P7();
        }
        return new int[]{131072};
    }

    /* renamed from: P8 */
    public final void mo104127P8(int i, Intent intent) {
        Class cls = C60613r.class;
        if (this.f220182b1 == 5) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra("emoji_thumb_path", this.f220189i1);
            intent.putExtra("emoji_activity_id", getIntent().getStringExtra("emoji_activity_id"));
        }
        if (this.f220182b1 == 30 && intent != null) {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (((C60613r) C86312j.m106911c(cls)).mo84974O8() != null) {
                ((C60613r) C86312j.m106911c(cls)).Vb0(((C60613r) C86312j.m106911c(cls)).mo84974O8(), "share_commodity_success", ((C60613r) C86312j.m106911c(cls)).ti0(((C60613r) C86312j.m106911c(cls)).mo84974O8(), Util.nullAsNil(stringExtra), C72996z1.m85820U5(stringExtra) ? "group" : "chat", (Integer) null));
            }
        }
        super.setResult(i, intent);
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        String stringExtra = getIntent().getStringExtra("Select_Conv_ui_title");
        return (stringExtra == null || stringExtra.length() <= 0) ? getString(C0966R.string.ijc) : stringExtra;
    }

    /* renamed from: Q8 */
    public final void mo104128Q8(String str) {
        try {
            ArrayList<String> stringsToList = Util.stringsToList(str.split(","));
            StringBuffer stringBuffer = new StringBuffer();
            boolean z = false;
            for (String next : stringsToList) {
                if (!Util.isNullOrNil(next)) {
                    if (z) {
                        stringBuffer.append(",");
                    }
                    stringBuffer.append(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(next));
                    z = true;
                }
            }
            C76879j.m92749t(this, getString(C0966R.string.j6l, new Object[]{stringBuffer}), "", (DialogInterface.OnClickListener) null);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        RecentForwardListDataItem recentForwardListDataItem;
        if (this.f220170U0) {
            int headerViewsCount = i - this.f218605d.getHeaderViewsCount();
            if (headerViewsCount < 0) {
                Log.m105925i("MicroMsg.SelectConversationUI", "Click HeaderView position=%d", Integer.valueOf(i));
                mo104138o8();
                return;
            }
            C74502i1 N7 = mo103379N7();
            C75922b j2 = N7.getItem(headerViewsCount);
            if (j2 != null && (str = j2.f222621r) != null) {
                Log.m105925i("MicroMsg.SelectConversationUI", "ClickUser=%s", str);
                if (!mo104132i8(str)) {
                    if (this.f220172V0.contains(str) || !mo104129R8(true)) {
                        mo104120I8(str, i);
                        mo104131T8();
                        C74481e2 e2Var = this.f220198q1;
                        if (!(e2Var == null || (recentForwardListDataItem = e2Var.f219009E) == null)) {
                            C87412m.m108594g(str, "userName");
                            ArrayList<C74500h3> arrayList = recentForwardListDataItem.f219065B;
                            if (arrayList != null) {
                                for (C74500h3 h3Var : arrayList) {
                                    if (C87412m.m108589b(h3Var.f219053d.f219061a, str)) {
                                        C74504i3 i3Var = h3Var.f219053d;
                                        i3Var.f219063c = !i3Var.f219063c;
                                    }
                                }
                            }
                        }
                        N7.notifyDataSetChanged();
                        return;
                    }
                    mo103378K7();
                    return;
                }
                return;
            }
            return;
        }
        if (i < this.f218605d.getHeaderViewsCount()) {
            Log.m105925i("MicroMsg.SelectConversationUI", "Click HeaderView position=%d", Integer.valueOf(i));
            if (this.f220177Y) {
                mo104142s8();
                return;
            }
            mo104137n8();
        } else {
            C75922b bVar = (C75922b) this.f218605d.getAdapter().getItem(i);
            if (bVar != null) {
                if ((bVar instanceof C75925c) && ((C75925c) bVar).f222629H == getResources().getString(C0966R.string.f7482hf)) {
                    Log.m105924i("MicroMsg.SelectConversationUI", "doCallSelectBizItem");
                    Intent intent = new Intent();
                    intent.putExtra("list_attr", 16384);
                    C88144b.m109795m(this, "brandservice", ".ui.BrandServiceIndexUI", intent, 4);
                    this.f220156K = true;
                    return;
                } else if (bVar instanceof C75952p) {
                    Intent intent2 = new Intent();
                    intent2.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f218604A);
                    ArrayList arrayList2 = new ArrayList();
                    for (String add : ((C75952p) bVar).f222603z.f292122c) {
                        arrayList2.add(add);
                    }
                    intent2.putExtra("query_phrase_list", arrayList2);
                    C88144b.m109802t(this, ".ui.transmit.MMCreateChatroomUI", intent2, 1);
                    return;
                } else {
                    String str2 = bVar.f222621r;
                    if (str2 != null) {
                        this.f220190j1 = i;
                        mo104140q8(str2);
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (this.f220176X0) {
            C68144a.m80546b(this.f220188h1, 4);
        }
    }

    /* renamed from: R8 */
    public final boolean mo104129R8(boolean z) {
        if (!this.f220151H1) {
            return false;
        }
        if (!z ? this.f220172V0.size() <= 9 : this.f220172V0.size() < 9) {
            return false;
        }
        C76879j.m92749t(getContext(), getString(C0966R.string.iix, new Object[]{Integer.valueOf(getIntent().getIntExtra("max_limit_num", 9))}), "", new C74892j0(this));
        return true;
    }

    /* renamed from: S8 */
    public final void mo104130S8() {
        int i;
        String str;
        if (this.f220170U0) {
            str = getString(C0966R.string.iim);
            i = C0966R.raw.icons_filled_contacts;
        } else {
            str = getString(C0966R.string.iig);
            i = C0966R.raw.icons_filled_add;
        }
        TextView textView = this.f220148G;
        if (textView != null) {
            textView.setText(str);
        }
        ImageView imageView = this.f220146F;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005e, code lost:
        if (r3 != false) goto L_0x008f;
     */
    /* renamed from: T7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64518T7() {
        /*
            r13 = this;
            super.mo64518T7()
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r1 = "select_is_ret"
            r2 = 0
            boolean r0 = r0.getBooleanExtra(r1, r2)
            r13.f220152I = r0
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r1 = "scene_from"
            int r0 = r0.getIntExtra(r1, r2)
            r13.f220167T = r0
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r2] = r0
            java.lang.String r0 = "MicroMsg.SelectConversationUI"
            java.lang.String r4 = "from scene:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r3)
            int r3 = r13.f220167T
            r4 = 7
            r5 = 3
            r6 = 2
            if (r3 != r1) goto L_0x0036
            r13.f220154J = r1
            goto L_0x0091
        L_0x0036:
            if (r3 == r6) goto L_0x008f
            r7 = 10
            if (r3 == r7) goto L_0x008f
            if (r3 != r5) goto L_0x0061
            r13.getIntent()
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "appbrand_params"
            java.io.Serializable r3 = r3.getSerializableExtra(r7)
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r7 = "is_h5"
            java.lang.Object r3 = r3.get(r7)
            boolean r3 = eb0.C75571d6.m90695a(r3, r2)
            if (r3 == 0) goto L_0x005e
            java.lang.String r7 = "hy: is H5 link"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
        L_0x005e:
            if (r3 == 0) goto L_0x0061
            goto L_0x008f
        L_0x0061:
            int r3 = r13.f220167T
            if (r3 != r5) goto L_0x0068
            r13.f220157L = r1
            goto L_0x0091
        L_0x0068:
            r7 = 6
            if (r3 != r7) goto L_0x006e
            r13.f220158M = r1
            goto L_0x0091
        L_0x006e:
            if (r3 != r4) goto L_0x0073
            r13.f220159N = r1
            goto L_0x0091
        L_0x0073:
            r7 = 12
            if (r3 != r7) goto L_0x007a
            r13.f220160P = r1
            goto L_0x0091
        L_0x007a:
            r7 = 18
            if (r3 != r7) goto L_0x0081
            r13.f220161Q = r1
            goto L_0x0091
        L_0x0081:
            r7 = 11
            if (r3 != r7) goto L_0x0091
            r3 = 2130772149(0x7f0100b5, float:1.7147408E38)
            r7 = 2130772147(0x7f0100b3, float:1.7147404E38)
            r13.overridePendingTransition(r3, r7)
            goto L_0x0091
        L_0x008f:
            r13.f220156K = r1
        L_0x0091:
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "from_scene"
            r8 = -1
            int r3 = r3.getIntExtra(r7, r8)
            if (r3 != 0) goto L_0x00a0
            r3 = 1
            goto L_0x00a1
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            r13.f220176X0 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "is_mp_video"
            boolean r3 = r3.getBooleanExtra(r7, r2)
            r13.f220163R = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "is_game_card"
            boolean r3 = r3.getBooleanExtra(r7, r2)
            r13.f220165S = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "send_to_biz"
            boolean r3 = r3.getBooleanExtra(r7, r2)
            r13.f220169U = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "Retr_Biz_Msg_Selected_Msg_Index"
            int r3 = r3.getIntExtra(r7, r8)
            r13.f220205x0 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "select_fav_local_id"
            r9 = -1
            long r11 = r3.getLongExtra(r7, r9)
            r13.f220171V = r11
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "select_fav_fake_local_id"
            java.lang.String r3 = r3.getStringExtra(r7)
            r13.f220173W = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "select_count"
            int r3 = r3.getIntExtra(r7, r2)
            r13.f220175X = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "mutil_select_is_ret"
            boolean r3 = r3.getBooleanExtra(r7, r2)
            r13.f220168T0 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "style_multi_select_conversation"
            boolean r3 = r3.getBooleanExtra(r7, r2)
            r13.f220149G1 = r3
            if (r3 == 0) goto L_0x0118
            r13.f220168T0 = r1
            r13.f220151H1 = r2
        L_0x0118:
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "Select_Send_Card"
            boolean r3 = r3.getBooleanExtra(r7, r2)
            r13.f220177Y = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "forward_card"
            boolean r3 = r3.getBooleanExtra(r7, r2)
            r13.f220196p0 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "Retr_Big_File"
            boolean r3 = r3.getBooleanExtra(r7, r2)
            r13.f220179Z = r3
            boolean r3 = r13.f220177Y
            if (r3 == 0) goto L_0x014c
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "Select_Talker_Name"
            java.lang.String r3 = r3.getStringExtra(r7)
            r13.f220162Q0 = r3
        L_0x014c:
            android.content.Intent r3 = r13.getIntent()
            int r7 = f220137K1
            java.lang.String r11 = "Select_Conv_Type"
            int r3 = r3.getIntExtra(r11, r7)
            r13.f220181a1 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "Retr_Msg_Type"
            int r3 = r3.getIntExtra(r7, r8)
            r13.f220182b1 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "Retr_Msg_Id"
            long r7 = r3.getLongExtra(r7, r9)
            r13.f220183c1 = r7
            eb0.c r3 = eb0.C97625j3.m125812b()
            g62.l r3 = r3.mo105911z()
            long r7 = r13.f220183c1
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            com.tencent.mm.storage.f4 r3 = r3.b00(r7)
            r13.f220188h1 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "Retr_Msg_Id_List"
            java.io.Serializable r3 = r3.getSerializableExtra(r7)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r13.f220184d1 = r3
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
            if (r3 != 0) goto L_0x01cf
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.ArrayList<java.lang.Long> r7 = r13.f220184d1
            int r7 = r7.size()
            r3.<init>(r7)
            r13.f220185e1 = r3
            java.util.ArrayList<java.lang.Long> r3 = r13.f220184d1
            java.util.Iterator r3 = r3.iterator()
        L_0x01ab:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x01cf
            java.lang.Object r7 = r3.next()
            java.lang.Long r7 = (java.lang.Long) r7
            java.util.List<com.tencent.mm.storage.f4> r8 = r13.f220185e1
            eb0.c r9 = eb0.C97625j3.m125812b()
            g62.l r9 = r9.mo105911z()
            long r10 = r7.longValue()
            com.tencent.mm.storage.g4 r9 = (com.tencent.p014mm.storage.C72972g4) r9
            com.tencent.mm.storage.f4 r7 = r9.b00(r10)
            r8.add(r7)
            goto L_0x01ab
        L_0x01cf:
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "image_path"
            java.lang.String r3 = r3.getStringExtra(r7)
            r13.f220194n1 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "ad_video_title"
            java.lang.String r3 = r3.getStringExtra(r7)
            r13.f220195o1 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "desc_title"
            java.lang.String r3 = r3.getStringExtra(r7)
            r13.f220197p1 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "Retr_Msg_thumb_path"
            java.lang.String r3 = r3.getStringExtra(r7)
            r13.f220189i1 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r8 = "Retr_Msg_content_bytes"
            boolean r3 = r3.hasExtra(r8)
            if (r3 == 0) goto L_0x021b
            java.lang.String r3 = new java.lang.String
            android.content.Intent r9 = r13.getIntent()
            byte[] r8 = r9.getByteArrayExtra(r8)
            r3.<init>(r8)
            r13.f220193m1 = r3
            goto L_0x0227
        L_0x021b:
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r8 = "Retr_Msg_content"
            java.lang.String r3 = r3.getStringExtra(r8)
            r13.f220193m1 = r3
        L_0x0227:
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r8 = "Retr_fav_xml_str"
            java.lang.String r3 = r3.getStringExtra(r8)
            r13.f220201t1 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r3 = r3.getStringExtra(r7)
            r13.f220192l1 = r3
            java.lang.String r3 = r13.f220193m1
            if (r3 != 0) goto L_0x024b
            com.tencent.mm.storage.f4 r3 = r13.f220188h1
            if (r3 == 0) goto L_0x024b
            java.lang.String r3 = r3.getContent()
            r13.f220193m1 = r3
        L_0x024b:
            java.lang.String r3 = r13.f220193m1
            if (r3 != 0) goto L_0x0253
            java.lang.String r3 = ""
            r13.f220193m1 = r3
        L_0x0253:
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "Select_Report_Args"
            android.os.Parcelable r3 = r3.getParcelableExtra(r7)
            com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs r3 = (com.tencent.p014mm.pluginsdk.model.app.ReportUtil.ReportArgs) r3
            r13.f220178Y0 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "Select_Data_Send_To_WeWork"
            android.os.Parcelable r3 = r3.getParcelableExtra(r7)
            com.tencent.mm.sendtowework.BaseDataToWeWork r3 = (com.tencent.p014mm.sendtowework.BaseDataToWeWork) r3
            r13.f220180Z0 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "KChooseMsgFileType"
            java.lang.String r3 = r3.getStringExtra(r7)
            r13.f220202u1 = r3
            android.content.Intent r3 = r13.getIntent()
            r7 = 9
            java.lang.String r8 = "KChooseMsgFileCount"
            int r3 = r3.getIntExtra(r8, r7)
            r13.f220203v1 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "KChooseMsgFileExtension"
            java.lang.String r3 = r3.getStringExtra(r7)
            r13.f220204w1 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "Retr_From_Chatting_Forward_Scene"
            int r3 = r3.getIntExtra(r7, r1)
            r13.f220139B1 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "content_type_forward_to_wework"
            int r3 = r3.getIntExtra(r7, r2)
            r13.f220141C1 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "from_scene_forward_to_wework"
            int r3 = r3.getIntExtra(r7, r2)
            r13.f220143D1 = r3
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r7 = "selectionconversationui_forbid_send_to_wework"
            boolean r3 = r3.getBooleanExtra(r7, r2)
            r13.f220145E1 = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r7 = com.tencent.p014mm.p136ui.contact.C74560s1.m89273b()
            r3.addAll(r7)
            android.content.Intent r7 = r13.getIntent()
            java.lang.String r8 = "Select_block_List"
            java.lang.String r7 = r7.getStringExtra(r8)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 != 0) goto L_0x02ee
            java.lang.String r8 = ","
            java.lang.String[] r7 = r7.split(r8)
            java.util.ArrayList r7 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r7)
            r3.addAll(r7)
        L_0x02ee:
            int r7 = r13.f220181a1
            boolean r7 = com.tencent.p014mm.p136ui.contact.C74560s1.m89275d(r7, r6)
            if (r7 == 0) goto L_0x0302
            java.util.HashSet r7 = eb0.C45628s0.m50776h()
            java.lang.String r8 = "filehelper"
            r7.remove(r8)
            r3.addAll(r7)
        L_0x0302:
            int r7 = r13.f220181a1
            r8 = 4
            boolean r7 = com.tencent.p014mm.p136ui.contact.C74560s1.m89275d(r7, r8)
            if (r7 != 0) goto L_0x0310
            java.lang.String r7 = "conversationboxservice"
            r3.remove(r7)
        L_0x0310:
            int r7 = r13.f220181a1
            r8 = 32
            boolean r7 = com.tencent.p014mm.p136ui.contact.C74560s1.m89275d(r7, r8)
            if (r7 == 0) goto L_0x031f
            java.lang.String r7 = "opencustomerservicemsg"
            r3.remove(r7)
        L_0x031f:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r13.f220200s1 = r7
            r7.addAll(r3)
            java.util.List<java.lang.String> r3 = r13.f220200s1
            long r7 = java.lang.System.currentTimeMillis()
            int r9 = r3.size()
            java.util.List r10 = com.tencent.p014mm.pluginsdk.platformtools.ContactBlackListHelper.m6942a()
            r3.addAll(r10)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r7
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            r5[r2] = r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r5[r1] = r2
            int r2 = r3.size()
            int r2 = r2 - r9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5[r6] = r2
            java.lang.String r2 = "[fillBlockList] cost:%sms size:%s block size:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r5)
            int r0 = r13.f220181a1
            boolean r0 = com.tencent.p014mm.p136ui.contact.C74560s1.m89275d(r0, r1)
            if (r0 == 0) goto L_0x0367
            r13.f220199r1 = r1
        L_0x0367:
            boolean r0 = r13.mo104105H8()
            if (r0 == 0) goto L_0x0396
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r13.f220172V0 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r13.f220174W0 = r0
            boolean r0 = r13.mo104105H8()
            if (r0 != 0) goto L_0x0382
            goto L_0x0396
        L_0x0382:
            r6 = 1
            r0 = 2131821601(0x7f110421, float:1.927595E38)
            java.lang.String r7 = r13.getString(r0)
            android.view.MenuItem$OnMenuItemClickListener r8 = r13.f220153I1
            r9 = 0
            com.tencent.mm.ui.MMActivityController$r r10 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.ALTER_BTN_BACKGROUND
            r5 = r13
            r5.addTextOptionMenu(r6, r7, r8, r9, r10)
            r13.mo104131T8()
        L_0x0396:
            boolean r0 = r13.f220156K
            if (r0 == 0) goto L_0x03d2
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r1 = "webview_params"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = "img_url"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "desc"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "title"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = "url"
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            com.tencent.mm.sendtowework.LinkData r5 = new com.tencent.mm.sendtowework.LinkData
            r5.<init>(r0, r3, r2, r1)
            r13.f220180Z0 = r5
            r13.f220141C1 = r4
        L_0x03d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.transmit.SelectConversationUI.mo64518T7():void");
    }

    /* renamed from: T8 */
    public final void mo104131T8() {
        MMActivityController.C73075r rVar = MMActivityController.C73075r.ALTER_BTN_BACKGROUND;
        if (mo104105H8()) {
            List<String> list = this.f220172V0;
            if (!(this.f218615q == null || list == null)) {
                mo103386e8(list.size());
            }
            List<String> list2 = this.f220172V0;
            if (list2 != null && list2.size() > 0) {
                updateOptionMenuText(1, mo104146x8() + "(" + this.f220172V0.size() + ")");
                updateOptionMenuStyle(1, MMActivityController.C73075r.GREEN);
                updateOptionMenuListener(1, this.f220155J1, (View.OnLongClickListener) null);
                enableOptionMenu(1, true);
            } else if (!this.f220170U0) {
                updateOptionMenuText(1, getString(C0966R.string.a0r));
                updateOptionMenuStyle(1, rVar);
                updateOptionMenuListener(1, this.f220153I1, (View.OnLongClickListener) null);
                enableOptionMenu(1, true);
                MultiSelectContactView multiSelectContactView = this.f218609h;
                if (multiSelectContactView != null) {
                    multiSelectContactView.setVisibility(8);
                }
                View view = this.f218611j;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "showTopSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "showTopSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f218615q.setBackgroundColor(getResources().getColor(C0966R.color.BW_93));
                }
            } else {
                updateOptionMenuText(1, getString(C0966R.string.a38));
                updateOptionMenuStyle(1, rVar);
                updateOptionMenuListener(1, this.f220153I1, (View.OnLongClickListener) null);
                enableOptionMenu(1, true);
                MultiSelectContactView multiSelectContactView2 = this.f218609h;
                if (multiSelectContactView2 != null) {
                    multiSelectContactView2.setVisibility(0);
                }
                mo103381S7();
            }
        }
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        if (mo104105H8()) {
            return !this.f220170U0;
        }
        return true;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return false;
    }

    /* renamed from: Y7 */
    public boolean mo103384Y7() {
        return true;
    }

    /* renamed from: Z7 */
    public void mo66629Z7() {
        if (this.f220167T == 5) {
            C76879j.m92709C(this, getString(C0966R.string.giw), (String) null, getString(C0966R.string.f361261il0), getString(C0966R.string.auj), true, new C74896l0(this), new C74898m0());
        } else {
            super.mo66629Z7();
            hideVKB();
        }
        ReportUtil.ReportArgs reportArgs = this.f220178Y0;
        if (reportArgs != null) {
            reportArgs.f211475e = 0;
            ReportUtil.m84997c(this, reportArgs, true, true);
        }
    }

    /* renamed from: b8 */
    public void mo64526b8(ListView listView, int i) {
    }

    /* renamed from: e6 */
    public void mo64521e6(int i, String str) {
        if (i == 1) {
            this.f220172V0.remove(str);
            ((HashMap) this.f220174W0).remove(str);
            mo103379N7().notifyDataSetChanged();
            List<String> list = this.f220172V0;
            C74481e2 e2Var = this.f220198q1;
            if (e2Var != null) {
                e2Var.mo103552v(list);
            }
            mo104131T8();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(-1, C0966R.C0968anim.f2493eh);
    }

    /* renamed from: i8 */
    public final boolean mo104132i8(String str) {
        if ("conversationboxservice".equals(str)) {
            Intent intent = new Intent(this, ConvBoxTransmitUI.class);
            intent.putExtras(getIntent().getExtras());
            intent.putExtra("KIsMultiSelect", this.f220170U0);
            intent.putExtra("Select_Conv_User", Util.listToString(this.f220172V0, ","));
            startActivityForResult(intent, 7);
            C88990b.m111192a(getContext(), intent);
            return true;
        } else if (!"opencustomerservicemsg".equals(str)) {
            return false;
        } else {
            Intent intent2 = new Intent(this, OpenImKefuTransmitUI.class);
            intent2.putExtras(getIntent().getExtras());
            intent2.putExtra("KIsMultiSelect", this.f220170U0);
            intent2.putExtra("Select_Conv_User", Util.listToString(this.f220172V0, ","));
            startActivityForResult(intent2, 8);
            C88990b.m111192a(getContext(), intent2);
            return true;
        }
    }

    public void initView() {
        super.initView();
        this.f220140C = (RelativeLayout) findViewById(C0966R.C0970id.ifd);
        this.f220142D = (RelativeLayout) findViewById(C0966R.C0970id.evk);
        this.f220144E = (LinearLayout) findViewById(C0966R.C0970id.bs4);
        this.f220146F = (ImageView) this.f220140C.findViewById(C0966R.C0970id.f2a);
        this.f220148G = (TextView) this.f220140C.findViewById(C0966R.C0970id.bsk);
        TextView textView = (TextView) this.f220140C.findViewById(C0966R.C0970id.eve);
        this.f220150H = textView;
        C85875k4.m106191k0(textView.getPaint());
        this.f220150H.setText(getString(C0966R.string.iih));
        mo104130S8();
        this.f220144E.setOnClickListener(new C77550f0(this));
        this.f218605d.setOnScrollListener(new C74894l());
    }

    /* renamed from: j8 */
    public boolean mo104133j8(String str) {
        if (!(C72996z1.m85843n5(str) || C72996z1.m85847r5(str))) {
            return false;
        }
        if (!Util.isNullOrNil(getIntent().getStringExtra("Select_App_Id")) && this.f220177Y) {
            return false;
        }
        if (this.f220177Y && C72996z1.m85810M4(C97625j3.m125812b().mo105907v().mo69664N2(this.f220162Q0).mo73953E2())) {
            mo104128Q8(str);
            return true;
        } else if (this.f220182b1 != 8) {
            return false;
        } else {
            int E2 = C97625j3.m125812b().mo105907v().mo69664N2(((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(this.f220193m1).f212675a).mo73953E2();
            Set<String> set = C45628s0.f123410p;
            if (!C72996z1.m85810M4(E2)) {
                return false;
            }
            mo104128Q8(str);
            return true;
        }
    }

    /* renamed from: k8 */
    public final void mo104134k8(int i, IWWAPI.WWAppType wWAppType) {
        String str;
        switch (i) {
            case 10:
                str = getString(C0966R.string.n4w);
                break;
            case 11:
                str = getString(C0966R.string.n4q);
                break;
            case 12:
                str = getString(C0966R.string.n4o);
                break;
            case 13:
                str = getString(C0966R.string.n4s);
                break;
            case 14:
                str = getString(C0966R.string.n4n);
                break;
            case 15:
                str = getString(C0966R.string.n4p);
                break;
            case 16:
                str = getString(C0966R.string.n4l);
                break;
            case 17:
                str = getString(C0966R.string.n4t);
                break;
            case 18:
                str = getString(C0966R.string.n4u);
                break;
            case 19:
                str = getString(C0966R.string.n4m);
                break;
            case 20:
                str = getString(C0966R.string.n4r);
                break;
            default:
                str = getString(C0966R.string.n4v);
                break;
        }
        Log.m105925i("MicroMsg.SelectConversationUI", "createTipsAndSendToWeWork() called with: contentTypeForwardToWeWork = [" + i + "], wwAppType = [" + wWAppType + "] tips:%s", str);
        this.f220180Z0 = new TextData(str);
        AppCompatActivity context = getContext();
        BaseDataToWeWork baseDataToWeWork = this.f220180Z0;
        if (baseDataToWeWork != null && (baseDataToWeWork instanceof TextData)) {
            C97182r4.m125143f(context, ((TextData) baseDataToWeWork).f212634d, wWAppType);
        }
    }

    /* renamed from: l8 */
    public final void mo104135l8(Intent intent, C78575u.C78583h hVar, HashMap<String, Object> hashMap, boolean z, String str, String str2, String str3) {
        String str4;
        int i;
        int i2;
        Bundle bundle;
        C78575u.C78583h hVar2 = hVar;
        HashMap<String, Object> hashMap2 = hashMap;
        String str5 = str3;
        Class cls = C76529i.class;
        String c = C75571d6.m90697c(hashMap2.get("app_id"), (String) null);
        int b = C75571d6.m90696b(hashMap2.get("pkg_type"), 0);
        int b2 = C75571d6.m90696b(hashMap2.get("pkg_version"), 0);
        String c2 = C75571d6.m90697c(hashMap2.get("cache_key"), (String) null);
        String c3 = C75571d6.m90697c(hashMap2.get("path"), (String) null);
        String c4 = C75571d6.m90697c(hashMap2.get("delay_load_img_path"), (String) null);
        String c5 = C75571d6.m90697c(hashMap2.get("nickname"), "");
        String str6 = c4;
        String str7 = "delay_load_img_path";
        boolean a = C75571d6.m90695a(hashMap2.get("is_dynamic"), false);
        String str8 = c3;
        int b3 = C75571d6.m90696b(hashMap2.get("subType"), 0);
        int b4 = C75571d6.m90696b(hashMap2.get("biz"), 2);
        String str9 = "cache_key";
        String str10 = c2;
        boolean z2 = a;
        String str11 = "pkg_version";
        if (C68070l.C68071a.m80416b(b4)) {
            String c6 = C75571d6.m90697c(hashMap2.get("tail_lang"), "");
            i2 = b2;
            String c7 = C75571d6.m90697c(hashMap2.get("icon_url"), "");
            i = b;
            Bundle bundle2 = new Bundle();
            str4 = "app_id";
            bundle2.putInt("key_biz", b4);
            bundle2.putString("key_footer_text_default", c5);
            bundle2.putString("key_footer_text", C68070l.C68071a.m80415a(b4, c6, getContext()));
            bundle2.putString("key_footer_icon", c7);
            Log.m105919d("MicroMsg.SelectConversationUI", "defaultFooterTxt: %s, tailLang: %s.", c5, c6);
            bundle = bundle2;
        } else {
            str4 = "app_id";
            i = b;
            i2 = b2;
            if (z) {
                bundle = new Bundle();
                bundle.putBoolean("is_video", true);
                String c8 = C75571d6.m90697c(hashMap2.get("footer_icon"), "");
                String c9 = C75571d6.m90697c(hashMap2.get("footer_text"), "");
                bundle.putString("key_footer_icon", c8);
                bundle.putString("key_footer_text", c9);
            } else {
                Log.m105929w("MicroMsg.SelectConversationUI", "fake native share msg biz invalidate, biz: %d.", Integer.valueOf(b4));
                bundle = null;
            }
        }
        View I7 = ((C76529i) C86312j.m106911c(cls)).mo106760I7(this, bundle, str5 == null ? false : C45628s0.m50755T(str3), new C74891j(intent));
        String a2 = C9515s.m9209a(this);
        Bundle bundle3 = new Bundle();
        bundle3.putString(str4, c);
        bundle3.putString("msg_id", String.format("%d-%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        bundle3.putInt("msg_pkg_type", i);
        bundle3.putInt(str11, i2);
        bundle3.putString("image_url", str);
        bundle3.putBoolean("is_dynamic_page", z2);
        bundle3.putString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2);
        bundle3.putString(str9, str10);
        bundle3.putString("msg_path", str8);
        bundle3.putString(str7, str6);
        bundle3.putInt("sub_type", b3);
        if (z) {
            String c15 = C75571d6.m90697c(hashMap2.get("video_path"), "");
            String c16 = C75571d6.m90697c(hashMap2.get("video_thumb_path"), "");
            bundle3.putBoolean("is_video", true);
            bundle3.putString("video_path", c15);
            bundle3.putString("video_thumb_path", c16);
        }
        C74920q qVar = new C74920q(this);
        qVar.f220298j = new C74897m(intent, str3, a2, I7);
        ((C76529i) C86312j.m106911c(cls)).sh0(a2, I7, bundle3, new C74899n(this, qVar));
        C78575u.C78583h hVar3 = hVar;
        hVar3.mo108565c(I7);
        hVar3.mo108569g(Boolean.TRUE);
        hVar3.mo108570h(false);
        hVar3.f230209e = new C74901o(this, a2, I7);
        hVar3.f230208d = mo104146x8();
        hVar3.mo108563a(new C74902p(str5, I7, qVar));
        hVar.mo108574l();
    }

    /* renamed from: m8 */
    public final boolean mo104136m8(Intent intent, C78575u.C78583h hVar, String str) {
        HashMap hashMap = (HashMap) getIntent().getSerializableExtra("appbrand_params");
        boolean a = C75571d6.m90695a(hashMap.get("is_weishi_video"), false);
        boolean a2 = C75571d6.m90695a(hashMap.get("is_video"), false);
        if (a) {
            String c = C75571d6.m90697c(hashMap.get("img_url"), (String) null);
            if (!Util.isNullOrNil(c)) {
                RelativeLayout relativeLayout = new RelativeLayout(this);
                View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.f7040vv, (ViewGroup) null);
                relativeLayout.addView(inflate, new RelativeLayout.LayoutParams(-2, -2));
                ((RelativeLayout.LayoutParams) inflate.getLayoutParams()).addRule(14);
                ((ImageView) inflate.findViewById(C0966R.C0970id.f59)).setImageResource(C0966R.raw.video_icon_in_gird);
                hVar.mo108565c(relativeLayout);
                hVar.mo108570h(false);
                String str2 = C88394b.f255384g;
                C88394b.C88418q.f255427a.mo122797p(new C77543c0(this, (ImageView) inflate.findViewById(C0966R.C0970id.gus), c), c, (C88394b.C88408j) null, (C88394b.C88405h) null);
            } else {
                String c2 = C75571d6.m90697c(hashMap.get("msg_img_path"), (String) null);
                if (!Util.isNullOrNil(c2)) {
                    Log.m105925i("Weishi", "dealRetransmitFromWeishiVideoMiniProgram, imageUrl:%s, msgImgPath:%s", c, c2);
                    Bitmap xx02 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).xx0(c2);
                    if (xx02 != null) {
                        try {
                            int orientationInDegree = Exif.fromFile(c2).getOrientationInDegree();
                            if (orientationInDegree < 0) {
                                orientationInDegree = 0;
                            }
                            xx02 = BitmapUtil.rotate(xx02, (float) orientationInDegree);
                        } catch (Throwable th) {
                            Log.printErrStackTrace("MicroMsg.SelectConversationUI", th, "unexpected exception.", new Object[0]);
                        }
                    }
                    hVar.mo108566d(xx02, 2);
                }
            }
            hVar.mo108569g(Boolean.TRUE);
            return false;
        }
        int b = C75571d6.m90696b(hashMap.get("type"), 1);
        String c3 = C75571d6.m90697c(hashMap.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE), "");
        String c4 = C75571d6.m90697c(hashMap.get("img_url"), (String) null);
        int b2 = C75571d6.m90696b(hashMap.get("biz"), 2);
        if (!C68070l.C68071a.m80416b(b2) && (b == 2 || b == 3)) {
            if (str == null || !C45628s0.m50755T(str) || !MultiProcessMMKV.getMMKV("group_to_do").getBoolean("introduce_dialog_first", true)) {
                mo104135l8(intent, hVar, hashMap, a2, c4, c3, str);
            } else {
                MultiProcessMMKV.getMMKV("group_to_do").edit().putBoolean("introduce_dialog_first", false);
                C74917p.m89752a(this, new C74883f(intent, hVar, hashMap, a2, c4, c3, str));
            }
            return true;
        } else if (C68070l.C68071a.m80416b(b2)) {
            String string = getResources().getString(C0966R.string.f7651mp);
            String c5 = C75571d6.m90697c(hashMap.get("nickname"), (String) null);
            if (!Util.isNullOrNil(c5)) {
                string = Util.safeFormatString(getResources().getString(C0966R.string.f7969xt), c5);
            }
            hVar.mo108571i(string + c3);
            C74920q qVar = new C74920q(this);
            qVar.f220298j = new C74885g(intent, str);
            String str3 = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122796o(new C74887h(this, qVar), c4, C88431k.f255437d);
            hVar.mo108569g(Boolean.TRUE);
            hVar.f230208d = mo104146x8();
            hVar.mo108563a(new C74889i(str, qVar));
            hVar.mo108574l();
            return true;
        } else {
            StringBuffer stringBuffer = new StringBuffer(getResources().getString(C0966R.string.f7651mp));
            stringBuffer.append(c3);
            hVar.mo108571i(stringBuffer.toString());
            hVar.mo108575m(c4);
            hVar.mo108576n(8);
            hVar.mo108569g(Boolean.TRUE);
            return false;
        }
    }

    /* renamed from: n1 */
    public String mo7833n1(C75922b bVar) {
        int i;
        int i2;
        String str = bVar.f222621r;
        if (str == null || !C72996z1.m85813P4(str)) {
            String str2 = bVar.f222621r;
            if (str2 == null || !C72996z1.m85845p5(str2)) {
                return null;
            }
            List<String> list = this.f220172V0;
            if (list != null) {
                i = 0;
                for (String q5 : list) {
                    if (C72996z1.m85846q5(q5)) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            if (i == 0) {
                return null;
            }
            return getString(C0966R.string.nfm, new Object[]{Integer.valueOf(i)});
        }
        List<String> list2 = this.f220172V0;
        if (list2 != null) {
            i2 = 0;
            for (String Hd : list2) {
                if (((C53193b) C86312j.m106911c(C53193b.class)).mo73723Hd(Hd)) {
                    i2++;
                }
            }
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            return null;
        }
        return getString(C0966R.string.ij7, new Object[]{Integer.valueOf(i2)});
    }

    /* renamed from: n8 */
    public final void mo104137n8() {
        Log.m105924i("MicroMsg.SelectConversationUI", "doCallSelectContactUI");
        Intent intent = new Intent(this, SelectContactUI.class);
        intent.putExtra("list_type", 5);
        intent.putExtra("titile", getString(C0966R.string.f7496hv));
        int i = this.f220167T;
        if (((i == 4 || i == 9) && getIntent().getIntExtra("jsapi_select_mode", 0) == 1) || this.f220167T == 10) {
            intent.putExtra("block_contact", getIntent().getStringExtra("Select_block_List"));
            intent.putExtra("list_attr", C74560s1.m89278g(32, 16, 1, 2, 4, 16384));
        } else if (this.f220196p0 && !this.f220166S0.booleanValue()) {
            intent.putExtra("list_attr", C74560s1.m89278g(16, 1, 2, 4, 16384));
            intent.putExtra("without_openim", true);
            intent.putExtra("KBlockOpenImFav", true);
        } else if (this.f220160P) {
            C74560s1.m89276e();
            intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219160a, 16384, 64, 4096));
            intent.putExtra("without_openim", true);
            intent.putExtra("KBlockOpenImFav", true);
        } else {
            intent.setClass(this, MvvmSelectContactUI.class);
            C74560s1.m89276e();
            intent.putExtra("list_attr", C74560s1.f219166g);
            intent.putExtra("block_contact", Util.setToString(C74560s1.m89274c(), ","));
            C79062b.m95631b(intent, C13745k.class);
            C79062b.m95631b(intent, C78244i.class);
            C79062b.m95631b(intent, C78924o0.class);
            C79062b.m95631b(intent, C78444g.class);
            C79062b.m95631b(intent, C65764a.class);
            C79062b.m95631b(intent, C78877c0.class);
            C79062b.m95631b(intent, C78889f0.class);
            C79062b.m95631b(intent, C78870a.class);
            C79062b.m95631b(intent, C78938y.class);
            C79062b.m95631b(intent, C78944z.class);
            C79062b.m95631b(intent, C78928r.class);
            C79062b.m95631b(intent, C78917n.class);
        }
        getContext().startActivityForResult(intent, 1);
    }

    /* renamed from: o8 */
    public final void mo104138o8() {
        Log.m105924i("MicroMsg.SelectConversationUI", "doCallSelectContactUIForMultiRetransmit");
        Intent intent = new Intent(this, MvvmSelectContactUI.class);
        intent.putExtra("list_type", 14);
        intent.putExtra("titile", getString(C0966R.string.f7496hv));
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.f219167h);
        intent.putExtra("already_select_contact", Util.listToString(this.f220172V0, ","));
        intent.putExtra("max_limit_num", 9);
        intent.putExtra("block_contact", Util.setToString(C74560s1.m89274c(), ","));
        C79062b.m95631b(intent, C13745k.class);
        C79062b.m95631b(intent, C78924o0.class);
        C79062b.m95631b(intent, C78444g.class);
        C79062b.m95631b(intent, C65764a.class);
        C79062b.m95631b(intent, C78877c0.class);
        C79062b.m95631b(intent, C78889f0.class);
        C79062b.m95631b(intent, C78870a.class);
        C79062b.m95631b(intent, C78938y.class);
        C79062b.m95631b(intent, C78944z.class);
        C79062b.m95631b(intent, C78928r.class);
        C79062b.m95631b(intent, C78917n.class);
        getContext().startActivityForResult(intent, 5);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            this.f220167T = intent.getIntExtra("scene_from", 0);
            Log.m105924i("MicroMsg.SelectConversationUI", "onActivityResult, requestCode = " + i + ", resultCode = " + i2 + ", data = " + intent.toString());
        } else {
            Log.m105924i("MicroMsg.SelectConversationUI", "onActivityResult, requestCode = " + i + ", resultCode = " + i2 + ", data = null");
        }
        if (i == 7 || i == 8) {
            if (i2 == -1) {
                mo104127P8(-1, intent);
                String stringExtra = intent.getStringExtra("Select_Conv_User");
                if (!TextUtils.isEmpty(stringExtra)) {
                    mo104123L8(stringExtra, -2);
                }
                finish();
            } else if (this.f220170U0) {
                String stringExtra2 = intent != null ? intent.getStringExtra("Select_Conv_User") : "";
                List<String> linkedList = TextUtils.isEmpty(stringExtra2) ? new LinkedList<>() : Util.stringsToList(stringExtra2.split(","));
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                }
                MultiSelectContactView multiSelectContactView = this.f218609h;
                if (multiSelectContactView != null) {
                    multiSelectContactView.mo100245e(linkedList);
                }
                this.f220172V0 = linkedList;
                mo104131T8();
                mo103379N7().notifyDataSetChanged();
                List<String> list = this.f220172V0;
                C74481e2 e2Var = this.f220198q1;
                if (e2Var != null) {
                    e2Var.mo103552v(list);
                }
            }
        } else if (i == 1) {
            if (i2 == -1 && intent != null) {
                String stringExtra3 = intent.getStringExtra("Select_Conv_User");
                Log.m105924i("MicroMsg.SelectConversationUI", "getIntent = " + getIntent());
                Intent intent2 = (Intent) getIntent().getParcelableExtra("Select_Conv_NextStep");
                if (intent2 != null) {
                    if (!mo104133j8(stringExtra3)) {
                        mo104113A8(intent, intent2);
                        return;
                    }
                    return;
                } else if (this.f220152I || this.f220177Y || this.f220154J || this.f220156K || this.f220157L || this.f220160P) {
                    mo104141r8(intent, stringExtra3);
                    return;
                } else if (this.f220167T == 11) {
                    mo104139p8(stringExtra3);
                    return;
                } else {
                    mo104127P8(-1, intent);
                    finish();
                    return;
                }
            } else {
                return;
            }
        } else if (i == 2) {
            if (i2 == -1) {
                ((C119157j) C119157j.f356862d).mo183878i(new C74900n0(), 1000);
                if (intent != null && intent.getBooleanExtra("Select_stay_in_wx", false)) {
                    String stringExtra4 = intent.getStringExtra("scene_select_user_liast");
                    if (!Util.isNullOrNil(stringExtra4)) {
                        LinkedList linkedList2 = new LinkedList(Util.stringsToList(stringExtra4.split(",")));
                        this.f220172V0 = linkedList2;
                        if (!Util.isNullOrNil((List) linkedList2)) {
                            if (this.f220172V0.size() == 1) {
                                mo104122K8(this.f220172V0.get(0));
                            } else {
                                mo104121J8();
                            }
                        }
                    }
                    Intent intent3 = new Intent(this, TaskRedirectUI.class);
                    intent3.addFlags(268435456);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent3);
                    C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/transmit/SelectConversationUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/ui/transmit/SelectConversationUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    ReportUtil.m84998d(false, 0);
                    return;
                } else if (intent != null && intent.getExtras() != null && intent.getBooleanExtra("Select_back_to_app", false)) {
                    String stringExtra5 = intent.getStringExtra("scene_select_user_liast");
                    if (!Util.isNullOrNil(stringExtra5)) {
                        LinkedList linkedList3 = new LinkedList(Util.stringsToList(stringExtra5.split(",")));
                        this.f220172V0 = linkedList3;
                        if (!Util.isNullOrNil((List) linkedList3)) {
                            if (this.f220172V0.size() == 1) {
                                mo104122K8(this.f220172V0.get(0));
                            } else {
                                mo104121J8();
                            }
                        }
                    }
                    ReportUtil.m84997c(this, ReportUtil.m84995a(intent.getExtras(), 0), true, false);
                    return;
                } else {
                    return;
                }
            } else if (i2 == 0 && intent != null) {
                this.f220178Y0 = (ReportUtil.ReportArgs) intent.getParcelableExtra("Select_Report_Args");
                return;
            } else {
                return;
            }
        } else if (i == 3) {
            if (i2 == -1 && intent != null) {
                String stringExtra6 = intent.getStringExtra("received_card_name");
                if (!Util.isNullOrNil(stringExtra6) && !mo104133j8(stringExtra6)) {
                    C78575u.C78583h hVar = new C78575u.C78583h(getContext());
                    hVar.mo108578p(stringExtra6);
                    mo104119G8(hVar, this.f220162Q0);
                    hVar.mo108569g(Boolean.TRUE);
                    hVar.f230208d = mo104146x8();
                    hVar.mo108563a(new C74875a(stringExtra6));
                    hVar.mo108574l();
                    return;
                }
                return;
            }
            return;
        } else if (i == 4) {
            if (i2 == -1 && intent != null) {
                mo104141r8(intent, intent.getStringExtra("Select_Contact"));
                return;
            }
            return;
        } else if (i == 5) {
            if (i2 == -1 && intent != null) {
                String stringExtra7 = intent.getStringExtra("Select_Conv_User");
                for (String next : this.f220172V0) {
                    MultiSelectContactView multiSelectContactView2 = this.f218609h;
                    if (next != null) {
                        multiSelectContactView2.mo100247g(next, false, false);
                    } else {
                        multiSelectContactView2.getClass();
                    }
                }
                if (!Util.isNullOrNil(stringExtra7)) {
                    this.f220172V0 = Util.stringsToList(stringExtra7.split(","));
                } else {
                    this.f220172V0.clear();
                    ((HashMap) this.f220174W0).clear();
                }
                for (String a : this.f220172V0) {
                    this.f218609h.mo100240a(a, false);
                }
                mo104131T8();
                mo103379N7().notifyDataSetChanged();
                List<String> list2 = this.f220172V0;
                C74481e2 e2Var2 = this.f220198q1;
                if (e2Var2 != null) {
                    e2Var2.mo103552v(list2);
                    return;
                }
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.SelectConversationUI", "onActivityResult, unknown requestCode = " + i);
    }

    public void onBackPressed() {
        super.mo66629Z7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f220138A1 = C31543z5.m39451a();
        String stringExtra = getIntent().getStringExtra("Select_App_Id");
        String stringExtra2 = getIntent().getStringExtra("Select_Open_Id");
        Log.m105924i("MicroMsg.SelectConversationUI", "onCreate, appId = " + stringExtra + ", openId = " + stringExtra2);
        if (!Util.isNullOrNil(stringExtra) && !Util.isNullOrNil(stringExtra2)) {
            new C68748c(this, stringExtra, stringExtra2, new C74893k()).mo94584a();
        }
        C78538u.m94868d(this);
    }

    public void onDestroy() {
        super.onDestroy();
        removeAllOptionMenu();
        if (!this.f220191k1) {
            mo104123L8("", -1);
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f220147F1) {
            Log.m105924i("MicroMsg.SelectConversationUI", "onPause: hasClickForwardToWeWork");
            MMHandlerThread.postToMainThreadDelayed(new C74890i0(), 200);
        }
    }

    public void onStop() {
        super.onStop();
    }

    /* renamed from: p8 */
    public final void mo104139p8(String str) {
        Log.m105925i("MicroMsg.SelectConversationUI", "doChooseMsgFile userName:%s type:%s count:%d ", str, this.f220202u1, Integer.valueOf(this.f220203v1));
        Log.m105925i("MicroMsg.SelectConversationUI", "doChooseMsgFile extension:%s ", this.f220204w1);
        ((C79332c) C86312j.m106911c(C79332c.class)).P80(this, str, this.f220202u1, this.f220203v1, this.f220204w1, new C74877b());
    }

    /* renamed from: q8 */
    public void mo104140q8(String str) {
        boolean z = true;
        Log.m105925i("MicroMsg.SelectConversationUI", "doClickUser=%s", str);
        if (!mo104133j8(str) && !mo104132i8(str)) {
            Intent intent = new Intent();
            intent.putExtra("Select_Conv_User", str);
            Intent intent2 = (Intent) getIntent().getParcelableExtra("Select_Conv_NextStep");
            if (intent2 != null) {
                mo104113A8(intent, intent2);
            } else if (this.f220152I || this.f220177Y || this.f220154J || this.f220156K || this.f220157L || this.f220163R || this.f220160P || this.f220161Q) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f220207y0;
                if (j <= 40 || j >= 300) {
                    this.f220207y0 = elapsedRealtime;
                } else {
                    this.f220207y0 = elapsedRealtime;
                    z = false;
                }
                if (z) {
                    mo104141r8(intent, str);
                }
            } else if (this.f220167T == 11) {
                mo104139p8(str);
            } else {
                mo104127P8(-1, intent);
                finish();
            }
            hideVKB();
        }
    }

    /* renamed from: r8 */
    public final void mo104141r8(Intent intent, String str) {
        String str2;
        int i;
        if (!mo104133j8(str)) {
            int i2 = -1;
            if (C74560s1.m89275d(this.f220181a1, 256)) {
                mo104127P8(-1, intent);
                finish();
            } else if (Util.isNullOrNil(str)) {
                Log.m105926v("MicroMsg.SelectConversationUI", "avatarUseName is null or nil show dialog fail ");
            } else {
                String str3 = "";
                if (C72996z1.m85820U5(str)) {
                    int p1 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(str);
                    if (!this.f220179Z || p1 <= (i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("CheckBigFileUploadChatroomMemberCountLimit"), 50))) {
                        getString(C0966R.string.iiu, new Object[]{Integer.valueOf(p1)});
                    } else {
                        Log.m105929w("MicroMsg.SelectConversationUI", "summerbig SelectConversationUI group limit[%d], count[%d]", Integer.valueOf(i), Integer.valueOf(p1));
                        C76879j.m92748s(this, getString(C0966R.string.iiw, new Object[]{Integer.valueOf(i)}), str3);
                        return;
                    }
                }
                C78575u.C78583h hVar = new C78575u.C78583h(getContext());
                hVar.mo108578p(str);
                if (this.f220177Y) {
                    mo104119G8(hVar, this.f220162Q0);
                    if (C72996z1.m85820U5(str)) {
                        mo104126O8(intent, this.f220162Q0, str);
                    } else {
                        String str4 = this.f220162Q0;
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(str);
                        mo104125N8(intent, str4, linkedList);
                    }
                    hVar.mo108569g(Boolean.TRUE);
                } else if (this.f220154J) {
                    if (!getIntent().hasExtra("appbrand_params") || !mo104136m8(intent, hVar, (String) null)) {
                        if (this.f220171V != -1) {
                            mo104115C8(hVar);
                            FavInitConfirmDialogContentEvent favInitConfirmDialogContentEvent = new FavInitConfirmDialogContentEvent();
                            FavInitConfirmDialogContentEvent.C67700a aVar = favInitConfirmDialogContentEvent.f193616d;
                            aVar.f193617a = this.f220171V;
                            aVar.f193618b = this.f220173W;
                            aVar.f193619c = this.f220182b1;
                            aVar.f193620d = hVar;
                            aVar.f193622f = this.f220201t1;
                            aVar.f193621e = getContext();
                            favInitConfirmDialogContentEvent.publish();
                        } else if (this.f220182b1 == 17 && this.f220175X != 0) {
                            String string = getContext().getString(C0966R.string.i4_, new Object[]{Integer.valueOf(this.f220175X)});
                            StringBuffer stringBuffer = new StringBuffer(getResources().getString(C0966R.string.a0p));
                            stringBuffer.append(string);
                            hVar.mo108571i(stringBuffer.toString());
                        }
                        hVar.mo108569g(Boolean.TRUE);
                    } else {
                        return;
                    }
                } else if (this.f220161Q) {
                    int i3 = this.f220182b1;
                    if (i3 == 17 && this.f220175X != 0) {
                        String string2 = getContext().getString(C0966R.string.i4_, new Object[]{Integer.valueOf(this.f220175X)});
                        StringBuffer stringBuffer2 = new StringBuffer(getResources().getString(C0966R.string.a0p));
                        stringBuffer2.append(string2);
                        hVar.mo108571i(stringBuffer2.toString());
                        hVar.mo108569g(Boolean.TRUE);
                    } else if (i3 == 34) {
                        if (!Util.isNullOrNil(this.f220193m1)) {
                            hVar.mo108571i(((C98450d) C86312j.m106911c(C98450d.class)).mo137794Ml(this, this.f220193m1));
                        } else {
                            hVar.mo108571i(this.f220197p1);
                        }
                    }
                } else if (this.f220156K && !this.f220163R) {
                    HashMap hashMap = (HashMap) getIntent().getSerializableExtra("webview_params");
                    String str5 = (String) hashMap.get("img_url");
                    String str6 = (String) hashMap.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    String str7 = (String) hashMap.get("url");
                    if (hashMap.containsKey("item_show_type")) {
                        i2 = Util.getInt((String) hashMap.get("item_show_type"), -1);
                    }
                    if (!this.f220165S) {
                        if (this.f220182b1 != 4) {
                            str3 = i2 == 16 ? getResources().getString(C0966R.string.f360103a43) : getResources().getString(C0966R.string.a3w);
                        }
                        StringBuffer stringBuffer3 = new StringBuffer(str3);
                        stringBuffer3.append(str6);
                        str2 = stringBuffer3.toString();
                    } else {
                        StringBuffer stringBuffer4 = new StringBuffer(getResources().getString(C0966R.string.f8023zj));
                        stringBuffer4.append((String) hashMap.get("nickname"));
                        str2 = stringBuffer4.toString();
                    }
                    hVar.mo108571i(str2);
                    hVar.mo108564b(new C74879c(str7));
                    hVar.mo108575m(str5);
                    hVar.mo108576n(8);
                    hVar.mo108569g(Boolean.TRUE);
                } else if (this.f220157L && mo104136m8(intent, hVar, str)) {
                    return;
                } else {
                    if (this.f220159N) {
                        String string3 = getResources().getString(C0966R.string.f8026zm);
                        if (this.f220197p1 != null) {
                            StringBuffer stringBuffer5 = new StringBuffer(string3);
                            stringBuffer5.append(this.f220197p1);
                            string3 = stringBuffer5.toString();
                        }
                        hVar.mo108571i(string3);
                        hVar.mo108569g(Boolean.FALSE);
                    } else if (this.f220160P) {
                        hVar.mo108571i(getResources().getString(C0966R.string.a2c));
                        hVar.mo108569g(Boolean.FALSE);
                    } else {
                        mo104114B8(hVar, str);
                        mo104115C8(hVar);
                        hVar.mo108569g(Boolean.TRUE);
                    }
                }
                hVar.f230208d = mo104146x8();
                hVar.mo108563a(new C74881d(intent, str));
                hVar.mo108574l();
                mo104124M8(hVar, getIntent().getBooleanExtra("Retr_finder_in_stream", false), str);
            }
        }
    }

    /* renamed from: s8 */
    public final void mo104142s8() {
        Log.m105924i("MicroMsg.SelectConversationUI", "doSendCardOrQRCode2CallSelectContactUI");
        Intent intent = new Intent(this, SelectContactUI.class);
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.f219164e);
        intent.putExtra("list_type", 3);
        intent.putExtra("be_send_card_name", this.f220162Q0);
        intent.putExtra("block_contact", getIntent().getStringExtra("Select_block_List"));
        boolean z = true;
        intent.putExtra("Add_SendCard", true);
        intent.putExtra("titile", getString(C0966R.string.f7496hv));
        if (!this.f220177Y || !C72996z1.m85843n5(this.f220162Q0)) {
            z = false;
        }
        intent.putExtra("Forbid_SelectChatRoom", z);
        getContext().startActivityForResult(intent, 3);
    }

    /* renamed from: u8 */
    public final Bitmap mo104143u8() {
        C72963f4 f4Var = this.f220188h1;
        if (f4Var == null) {
            return null;
        }
        String s2 = f4Var.mo108765s2();
        Bitmap xx02 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).xx0(s2);
        if (xx02 == null) {
            return xx02;
        }
        try {
            int orientationInDegree = Exif.fromFile(s2).getOrientationInDegree();
            if (orientationInDegree < 0) {
                orientationInDegree = 0;
            }
            return BitmapUtil.rotate(xx02, (float) orientationInDegree);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.SelectConversationUI", th, "unexpected exception.", new Object[0]);
            return xx02;
        }
    }

    /* renamed from: v8 */
    public final String mo104144v8(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        if (i == 1) {
            str = this.f220186f1;
        } else if (i == 2) {
            str = this.f220187g1;
        } else {
            Log.m105920e("MicroMsg.SelectConversationUI", "getMsgType: Parameter flag error ");
            return "0";
        }
        if (!Util.isNullOrNil(str)) {
            return str;
        }
        if (!Util.isNullOrNil((List) this.f220185e1)) {
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayList) this.f220185e1).iterator();
            while (it.hasNext()) {
                C72963f4 f4Var = (C72963f4) it.next();
                if (f4Var != null) {
                    if (i == 1) {
                        str4 = String.valueOf(f4Var.getType());
                    } else {
                        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
                        if (u != null) {
                            str4 = String.valueOf(u.f195582i);
                        }
                    }
                    sb.append(str4);
                    sb.append("｜");
                }
                str4 = "0";
                sb.append(str4);
                sb.append("｜");
            }
            str2 = sb.substring(0, sb.length() - 1);
        } else {
            C72963f4 f4Var2 = this.f220188h1;
            if (f4Var2 != null) {
                if (i == 1) {
                    str3 = String.valueOf(f4Var2.getType());
                } else {
                    C68070l.C68072b u2 = C68070l.C68072b.m80422u(f4Var2.getContent(), (String) null);
                    if (u2 != null) {
                        str3 = String.valueOf(u2.f195582i);
                    }
                }
                str2 = String.valueOf(str3);
            }
            str3 = "0";
            str2 = String.valueOf(str3);
        }
        if (Util.isNullOrNil(str2)) {
            return "0";
        }
        if (i == 1) {
            this.f220186f1 = str2;
        } else {
            this.f220187g1 = str2;
        }
        return str2;
    }

    /* renamed from: w8 */
    public final String mo104145w8(C68070l.C68072b bVar) {
        RecordOperationEvent recordOperationEvent = new RecordOperationEvent();
        RecordOperationEvent.C92551a aVar = recordOperationEvent.f265027d;
        aVar.f265029a = 0;
        aVar.f265030b = bVar.f195571f0;
        recordOperationEvent.publish();
        C77915dp3 dp32 = recordOperationEvent.f265028e.f265048a;
        String nullAs = dp32 != null ? Util.nullAs(dp32.f227154e, bVar.f195574g) : null;
        return !Util.isNullOrNil(nullAs) ? nullAs.replaceAll("\n", " ") : nullAs;
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        String str;
        if (!bVar.mo106184e() || (str = bVar.f222621r) == null) {
            return false;
        }
        return this.f220172V0.contains(str);
    }

    /* renamed from: x8 */
    public final String mo104146x8() {
        String stringExtra = getIntent().getStringExtra("KSendWording");
        return Util.isNullOrNil(stringExtra) ? getString(C0966R.string.a2s) : stringExtra;
    }

    /* renamed from: z8 */
    public final Bitmap mo104147z8() {
        String r = ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137729r(this.f220188h1.mo108765s2());
        if (r != null) {
            return BitmapUtil.getBitmapNative(r);
        }
        String str = this.f220194n1;
        return C102016c.m134339a(str) ? ((C100196e) C86312j.m106911c(C100196e.class)).mo139319rk(str) : BitmapUtil.getBitmapNative(str);
    }
}
