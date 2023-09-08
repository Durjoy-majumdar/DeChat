package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.lifecycle.C39622i0;
import b81.C0249a;
import bh3.C113177k;
import bl3.C39818r;
import c81.C0435q;
import c81.C0436u;
import c81.C39926t;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.base.MMPullDownView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.exdevice.model.C41158q1;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.event.MvvmEventCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86009m1;
import d62.C7250m;
import d81.C20448c;
import d81.C45288e;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C86493v0;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kj2.C117407d;
import kr0.C76629w0;
import m71.C46948b;
import nj3.C76879j;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import p206nj.C11171e;
import p385u2.C111105a;
import p447aw.C103918d;
import p732vx.C53036b;
import p910lj.C76701a;
import qo3.C77407n;
import qo3.C89779i0;
import rx3.C13598b0;
import t71.C48540e;
import t71.C48547j;
import te3.C49971jb2;
import te3.n85;
import te3.pa4;
import tv2.C14096e;
import tv2.C52366c;
import tv2.C78112d;
import u71.C52451c;
import u71.C52452d;
import u71.C52453e;
import u71.C52454f;
import v71.C37687a;
import v71.C37689c;
import v71.C52778d;
import w71.C53087d;
import yk3.C53531d;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI */
public class ExdeviceRankInfoUI extends MMSecDataActivity implements C52453e, C41341k1, C52454f, C48547j.C48548a {

    /* renamed from: R */
    public static int f111217R = 128;

    /* renamed from: A */
    public ArrayList<C52778d> f111218A;

    /* renamed from: B */
    public boolean f111219B;

    /* renamed from: C */
    public boolean f111220C;

    /* renamed from: D */
    public String f111221D;

    /* renamed from: E */
    public String f111222E;

    /* renamed from: F */
    public boolean f111223F;

    /* renamed from: G */
    public String f111224G;

    /* renamed from: H */
    public String f111225H;

    /* renamed from: I */
    public String f111226I;

    /* renamed from: J */
    public boolean f111227J;

    /* renamed from: K */
    public boolean f111228K;

    /* renamed from: L */
    public boolean f111229L;

    /* renamed from: M */
    public n85 f111230M;

    /* renamed from: N */
    public C48547j f111231N;

    /* renamed from: P */
    public C46948b<C48547j> f111232P = new C41303l();

    /* renamed from: Q */
    public int f111233Q;

    /* renamed from: d */
    public ListView f111234d;

    /* renamed from: e */
    public C41368s0 f111235e;

    /* renamed from: f */
    public View f111236f;

    /* renamed from: g */
    public ExdeviceRankListHeaderView f111237g;

    /* renamed from: h */
    public ExdeviceRankChampionInfoView f111238h;

    /* renamed from: i */
    public ImageView f111239i;

    /* renamed from: j */
    public View f111240j;

    /* renamed from: n */
    public C89779i0 f111241n = null;

    /* renamed from: o */
    public Map<String, String> f111242o = new HashMap();

    /* renamed from: p */
    public View f111243p;

    /* renamed from: q */
    public String f111244q;

    /* renamed from: r */
    public String f111245r;

    /* renamed from: s */
    public String f111246s;

    /* renamed from: t */
    public String f111247t;

    /* renamed from: u */
    public String f111248u;

    /* renamed from: v */
    public C37687a f111249v;

    /* renamed from: w */
    public String f111250w;

    /* renamed from: x */
    public int f111251x;

    /* renamed from: y */
    public List<C41345l1> f111252y;

    /* renamed from: z */
    public ArrayList<C37689c> f111253z;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$e */
    public class C2252e implements View.OnClickListener {
        public C2252e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C14096e.m13447a(24);
            Intent intent = new Intent();
            intent.putExtra("Select_Talker_Name", "gh_43f2581f6fd6");
            intent.putExtra("Select_block_List", "gh_43f2581f6fd6");
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("Select_Send_Card", true);
            C88144b.m109802t(ExdeviceRankInfoUI.this, ".ui.transmit.SelectConversationUI", intent, 3);
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$a */
    public class C41293a implements MMPullDownView.C73177d {
        public C41293a() {
        }

        /* renamed from: q0 */
        public boolean mo64384q0() {
            ListView listView = ExdeviceRankInfoUI.this.f111234d;
            View childAt = listView.getChildAt(listView.getChildCount() - 1);
            int count = ExdeviceRankInfoUI.this.f111234d.getCount();
            return count > 0 && childAt != null && childAt.getBottom() <= ExdeviceRankInfoUI.this.f111234d.getHeight() && ExdeviceRankInfoUI.this.f111234d.getLastVisiblePosition() == count - 1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$b */
    public class C41294b implements MMPullDownView.C44710c {
        public C41294b() {
        }

        public void onScrollChanged(int i, int i2, int i3, int i4) {
            ExdeviceRankInfoUI exdeviceRankInfoUI = ExdeviceRankInfoUI.this;
            int i5 = ExdeviceRankInfoUI.f111217R;
            exdeviceRankInfoUI.mo64381Q7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$c */
    public class C41295c implements MMPullDownView.C73178e {
        public C41295c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            r0 = r2.f111256d.f111234d.getChildAt(r0);
         */
        /* renamed from: b0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo64386b0() {
            /*
                r2 = this;
                com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI r0 = com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceRankInfoUI.this
                android.widget.ListView r0 = r0.f111234d
                int r0 = r0.getFirstVisiblePosition()
                if (r0 != 0) goto L_0x001c
                com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI r1 = com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceRankInfoUI.this
                android.widget.ListView r1 = r1.f111234d
                android.view.View r0 = r1.getChildAt(r0)
                if (r0 == 0) goto L_0x001c
                int r0 = r0.getTop()
                if (r0 < 0) goto L_0x001c
                r0 = 1
                return r0
            L_0x001c:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceRankInfoUI.C41295c.mo64386b0():boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$d */
    public class C41296d implements AbsListView.OnScrollListener {
        public C41296d() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            C52778d dVar;
            pa4 pa4;
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$13", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            ExdeviceRankInfoUI exdeviceRankInfoUI = ExdeviceRankInfoUI.this;
            int i4 = ExdeviceRankInfoUI.f111217R;
            exdeviceRankInfoUI.mo64381Q7();
            if (Util.isNullOrNil((List) ExdeviceRankInfoUI.this.f111218A)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$13", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
                return;
            }
            C0436u uVar = (C0436u) C39818r.f106831a.mo62444c(ExdeviceRankInfoUI.this.getContext()).mo75002a(C0436u.class);
            List<C41345l1> list = ExdeviceRankInfoUI.this.f111235e.f111373p;
            uVar.getClass();
            if (list != null) {
                int i5 = i2;
                for (int i6 = 0; i6 < i5; i6++) {
                    int i7 = i + i6;
                    C39622i0 a = C39818r.f106831a.mo62444c(uVar.getActivity()).mo75002a(C53531d.class);
                    C87412m.m108593f(a, "UICProvider.of(activity)…MsgReportUIC::class.java)");
                    C53531d dVar2 = (C53531d) a;
                    if (!dVar2.mo74203d3().contains(String.valueOf(i7))) {
                        ArrayList arrayList2 = (ArrayList) list;
                        if (!(i7 > arrayList2.size() - 1 || (dVar = ((C41345l1) arrayList2.get(i7)).f111320a) == null || (pa4 = dVar.field_sportRecord) == null)) {
                            int i8 = pa4.f139686o;
                            if (i8 == 0) {
                                if (C87412m.m108589b("21f9d636b41b25be", pa4.f139678d)) {
                                    C20448c cVar = C20448c.f57466a;
                                    String string = uVar.getString(C0966R.string.jm4);
                                    String str = dVar.field_username;
                                    C87412m.m108593f(str, "info.field_username");
                                    cVar.mo31991a(1, 1, string, 2, 2, str);
                                } else {
                                    ((C76629w0) C86312j.m106911c(C76629w0.class)).Ws0(dVar.field_sportRecord.f139678d, new C39926t(1, dVar));
                                }
                            } else if (i8 == 1) {
                                try {
                                    int i9 = !Util.isNullOrNil(new JSONObject(pa4.f139684j).optString("finder_username")) ? 1 : 2;
                                    C20448c cVar2 = C20448c.f57466a;
                                    String str2 = pa4.f139679e;
                                    C87412m.m108593f(str2, "sportRecord.appName");
                                    String str3 = dVar.field_username;
                                    C87412m.m108593f(str3, "info.field_username");
                                    cVar2.mo31991a(1, 2, str2, i9, 2, str3);
                                } catch (JSONException unused) {
                                }
                            }
                        }
                        dVar2.mo74203d3().add(String.valueOf(i7));
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$13", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$13", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            ExdeviceRankInfoUI exdeviceRankInfoUI = ExdeviceRankInfoUI.this;
            int i2 = ExdeviceRankInfoUI.f111217R;
            exdeviceRankInfoUI.mo64381Q7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$13", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$f */
    public class C41297f implements DialogInterface.OnCancelListener {
        public C41297f() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C89779i0 i0Var = ExdeviceRankInfoUI.this.f111241n;
            if (i0Var != null) {
                i0Var.dismiss();
                ExdeviceRankInfoUI.this.f111241n = null;
            }
            ExdeviceRankInfoUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$g */
    public class C41298g implements Runnable {
        public C41298g() {
        }

        public void run() {
            ExdeviceRankInfoUI exdeviceRankInfoUI = ExdeviceRankInfoUI.this;
            int i = ExdeviceRankInfoUI.f111217R;
            exdeviceRankInfoUI.mo64379O7();
            ExdeviceRankInfoUI.this.mo64375K7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$h */
    public class C41299h implements Runnable {
        public C41299h() {
        }

        public void run() {
            ExdeviceRankInfoUI exdeviceRankInfoUI = ExdeviceRankInfoUI.this;
            int i = ExdeviceRankInfoUI.f111217R;
            exdeviceRankInfoUI.mo64376L7(true);
            ExdeviceRankInfoUI exdeviceRankInfoUI2 = ExdeviceRankInfoUI.this;
            if (!exdeviceRankInfoUI2.f111227J) {
                exdeviceRankInfoUI2.mo64378N7();
                return;
            }
            exdeviceRankInfoUI2.f111235e.mo64440g(exdeviceRankInfoUI2.f111230M);
            ExdeviceRankInfoUI.this.f111235e.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$i */
    public class C41300i implements Runnable {
        public C41300i() {
        }

        public void run() {
            ExdeviceRankInfoUI exdeviceRankInfoUI = ExdeviceRankInfoUI.this;
            int i = ExdeviceRankInfoUI.f111217R;
            exdeviceRankInfoUI.mo64379O7();
            ExdeviceRankInfoUI.this.mo64375K7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$j */
    public class C41301j implements C41158q1.C41162d {
        public C41301j() {
        }

        /* renamed from: a */
        public void mo64226a(String str) {
            Intent intent = new Intent();
            intent.putExtra("Ksnsupload_appid", "wx7fa037cc7dfabad5");
            intent.putExtra("Ksnsupload_appname", ExdeviceRankInfoUI.this.getString(C0966R.string.cgc));
            intent.putExtra("Ksnsupload_source", 1);
            intent.putExtra("need_result", true);
            String a = C86493v0.m107223a("wx_sport");
            C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", "wx_sport");
            intent.putExtra("reportSessionId", a);
            intent.putExtra("Ksnsupload_type", 0);
            intent.putExtra("sns_kemdia_path", str);
            C88144b.m109795m(ExdeviceRankInfoUI.this, "sns", ".ui.SnsUploadUI", intent, 2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$k */
    public class C41302k implements Runnable {
        public C41302k() {
        }

        public void run() {
            ExdeviceRankInfoUI exdeviceRankInfoUI = ExdeviceRankInfoUI.this;
            C41368s0 s0Var = exdeviceRankInfoUI.f111235e;
            s0Var.f111365e = exdeviceRankInfoUI.f111252y;
            s0Var.mo64440g(exdeviceRankInfoUI.f111230M);
            ExdeviceRankInfoUI.this.f111235e.notifyDataSetChanged();
            ExdeviceRankInfoUI.m44689H7(ExdeviceRankInfoUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$l */
    public class C41303l implements C46948b<C48547j> {
        public C41303l() {
        }

        /* renamed from: a */
        public void mo64355a(int i, int i2, String str, C117747y yVar) {
            C48547j jVar = (C48547j) yVar;
            Log.m105925i("MicroMsg.Sport.ExdeviceRankInfoUI", "onNetSceneEndCallback, errType(%s), errCode(%s), errMsg(%s).", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (!ExdeviceRankInfoUI.this.isFinishing()) {
                ExdeviceRankInfoUI exdeviceRankInfoUI = ExdeviceRankInfoUI.this;
                if (!exdeviceRankInfoUI.f111228K) {
                    exdeviceRankInfoUI.runOnUiThread(new C41378v0(this));
                    if (i == 0 && i2 == 0) {
                        ExdeviceRankInfoUI exdeviceRankInfoUI2 = ExdeviceRankInfoUI.this;
                        exdeviceRankInfoUI2.f111221D = jVar.f129856s;
                        exdeviceRankInfoUI2.f111222E = jVar.f129857t;
                        exdeviceRankInfoUI2.f111224G = jVar.f129860w;
                        exdeviceRankInfoUI2.f111223F = jVar.f129859v;
                        exdeviceRankInfoUI2.f111229L = jVar.f129861x;
                        exdeviceRankInfoUI2.f111230M = ((C49971jb2) jVar.mo72130j1()).f135995w;
                        ExdeviceRankInfoUI.this.mo64380P7(false);
                        ExdeviceRankInfoUI.this.runOnUiThread(new C41380x0(this));
                        return;
                    }
                    List<C41345l1> list = ExdeviceRankInfoUI.this.f111252y;
                    if (list == null || list.size() == 0) {
                        ExdeviceRankInfoUI.this.runOnUiThread(new C41379w0(this));
                        return;
                    }
                    return;
                }
            }
            Log.m105924i("MicroMsg.Sport.ExdeviceRankInfoUI", "ExdeviceRankInfoUI has been destroyed.");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$m */
    public class C41304m implements View.OnClickListener {
        public C41304m() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C48540e.m53922d(ExdeviceRankInfoUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$n */
    public class C41305n implements View.OnClickListener {
        public C41305n() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ExdeviceRankInfoUI exdeviceRankInfoUI = ExdeviceRankInfoUI.this;
            int i = ExdeviceRankInfoUI.f111217R;
            C77407n nVar = new C77407n((Context) exdeviceRankInfoUI.getContext(), 1, false);
            nVar.f225771i = new C41321b1(exdeviceRankInfoUI);
            nVar.f225782p = new C41323c1(exdeviceRankInfoUI);
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$o */
    public class C41306o implements View.OnClickListener {
        public C41306o() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d("MicroMsg.Sport.ExdeviceRankInfoUI", "ap: start change cover");
            C48540e.m53922d(ExdeviceRankInfoUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$p */
    public class C41307p implements MMPullDownView.C44709b {
        public C41307p() {
        }

        /* renamed from: a */
        public boolean mo64359a(MotionEvent motionEvent) {
            ExdeviceRankInfoUI exdeviceRankInfoUI = ExdeviceRankInfoUI.this;
            List<C41345l1> list = exdeviceRankInfoUI.f111252y;
            exdeviceRankInfoUI.f111227J = (list == null || list.size() == 0) ? false : true;
            return false;
        }
    }

    /* renamed from: H7 */
    public static void m44689H7(ExdeviceRankInfoUI exdeviceRankInfoUI) {
        View view = exdeviceRankInfoUI.f111243p;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: I6 */
    public void mo64352I6(String str, C52452d dVar) {
        Assert.assertTrue(dVar != null && !Util.isNullOrNil(str));
        if ("HardDeviceRankInfo".equals(str)) {
            String str2 = this.f111248u;
            if (str2 != null && str2.equals(dVar.f146566a)) {
                Log.m105925i("MicroMsg.Sport.ExdeviceRankInfoUI", "onRankChange, rankId(%s).", this.f111248u);
                mo64380P7(true);
                if (Util.isNullOrNil(this.f111250w) || !this.f111250w.equals(mo64373I7())) {
                    String I7 = mo64373I7();
                    if (!Util.isNullOrNil(I7)) {
                        this.f111250w = I7;
                    }
                    this.f111249v = C41166r1.vx0().mo61492jo(this.f111250w);
                    runOnUiThread(new C41298g());
                }
                runOnUiThread(new C41299h());
            }
        } else if ("HardDeviceChampionInfo".equals(str) && !Util.isNullOrNil(this.f111250w) && this.f111250w.equals(dVar.f146567b)) {
            this.f111249v = C41166r1.vx0().mo61492jo(this.f111250w);
            runOnUiThread(new C41300i());
        }
    }

    /* renamed from: I7 */
    public final String mo64373I7() {
        List<C41345l1> list = this.f111252y;
        if (list == null) {
            return null;
        }
        for (C41345l1 l1Var : list) {
            C52778d dVar = l1Var.f111320a;
            if (dVar != null && dVar.field_ranknum == 1) {
                return dVar.field_username;
            }
        }
        return null;
    }

    /* renamed from: J7 */
    public void mo64374J7(String str) {
        C14096e.m13447a(6);
        Intent intent = new Intent(this, ExdeviceProfileUI.class);
        intent.putExtra("username", str);
        intent.putExtra("usernickname", (String) ((HashMap) this.f111242o).get(str));
        intent.putExtra("app_username", this.f111247t);
        intent.putExtra("rank_id", this.f111248u);
        startActivityForResult(intent, 4);
    }

    /* renamed from: K7 */
    public final void mo64375K7() {
        C37687a aVar = this.f111249v;
        if (aVar != null) {
            String str = this.f111226I;
            String str2 = aVar.field_championUrl;
            if (str == str2) {
                return;
            }
            if (str == null || !str.equals(str2)) {
                C48540e.m53920b(this, this.f111239i, this.f111249v.field_championUrl, C0966R.color.f3281m3);
                this.f111226I = this.f111249v.field_championUrl;
                return;
            }
            return;
        }
        this.f111239i.setImageResource(C0966R.color.f3281m3);
        this.f111226I = null;
    }

    /* renamed from: L7 */
    public final void mo64376L7(boolean z) {
        if (z) {
            String I7 = mo64373I7();
            if (!Util.isNullOrNil(I7)) {
                this.f111250w = I7;
            }
        }
        if (!Util.isNullOrNil(this.f111247t)) {
            this.f111238h.mo2146a(this.f111250w);
            this.f111238h.setVisibility(0);
            return;
        }
        this.f111238h.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        r0 = r8.f111230M;
     */
    /* renamed from: M7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64377M7() {
        /*
            r8 = this;
            java.lang.String r0 = r8.f111224G
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0018
            w71.b r0 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.vx0()
            java.lang.String r1 = r8.f111244q
            v71.a r0 = r0.mo61492jo(r1)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r0.field_championUrl
            r8.f111224G = r0
        L_0x0018:
            com.tencent.mm.plugin.exdevice.ui.s0 r0 = r8.f111235e
            java.lang.String r1 = r8.f111244q
            java.util.ArrayList<v71.d> r2 = r8.f111218A
            v71.d r0 = r0.mo64437b(r1, r2)
            java.lang.String r1 = "--"
            if (r0 == 0) goto L_0x0033
            int r1 = r0.field_ranknum
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r0 = r0.field_score
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x0042
        L_0x0033:
            if (r0 != 0) goto L_0x0040
            te3.n85 r0 = r8.f111230M
            if (r0 == 0) goto L_0x0040
            int r0 = r0.f138486e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x0042
        L_0x0040:
            java.lang.String r0 = "0"
        L_0x0042:
            r5 = r0
            r4 = r1
            com.tencent.mm.plugin.exdevice.model.q1 r2 = new com.tencent.mm.plugin.exdevice.model.q1
            r2.<init>()
            java.lang.String r6 = r8.f111224G
            com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$j r7 = new com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI$j
            r7.<init>()
            r3 = r8
            r2.mo64223b(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceRankInfoUI.mo64377M7():void");
    }

    /* renamed from: N7 */
    public final void mo64378N7() {
        int i;
        Log.m105925i("MicroMsg.Sport.ExdeviceRankInfoUI", "try2LocateToUser, locate2User(%s), username(%s).", this.f111225H, this.f111244q);
        if (!Util.isNullOrNil(this.f111225H)) {
            String str = this.f111225H;
            Log.m105925i("MicroMsg.Sport.ExdeviceRankInfoUI", "locateToUser, locate2User(%s), username(%s).", str, this.f111244q);
            if (!Util.isNullOrNil(str)) {
                List<C41345l1> list = this.f111252y;
                if (list != null && ((ArrayList) list).size() != 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= ((ArrayList) this.f111252y).size()) {
                            this.f111235e.f111368h = null;
                            i = -3;
                            break;
                        }
                        C52778d dVar = ((C41345l1) ((ArrayList) this.f111252y).get(i2)).f111320a;
                        int i3 = ((C41345l1) ((ArrayList) this.f111252y).get(i2)).f111322c;
                        if (dVar != null && str.equalsIgnoreCase(dVar.field_username) && !str.equalsIgnoreCase(this.f111244q) && (i3 & 2) != 2) {
                            DisplayMetrics displayMetrics = new DisplayMetrics();
                            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                            int i4 = displayMetrics.heightPixels;
                            Log.m105925i("MicroMsg.Sport.ExdeviceRankInfoUI", "locateToUser pos(%d).(h : %d)", Integer.valueOf(i2), Integer.valueOf(i4));
                            this.f111234d.setSelectionFromTop(i2, i4 / 4);
                            C41368s0 s0Var = this.f111235e;
                            s0Var.f111368h = str;
                            s0Var.mo64440g(this.f111230M);
                            this.f111235e.notifyDataSetInvalidated();
                            mo64381Q7();
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                } else {
                    i = -2;
                }
            } else {
                i = -1;
            }
            if (i >= 0) {
                return;
            }
        }
        Log.m105918d("MicroMsg.Sport.ExdeviceRankInfoUI", "locate to username is null or nil.");
    }

    /* renamed from: O7 */
    public final void mo64379O7() {
        String str;
        C37687a aVar = this.f111249v;
        if (aVar == null || (str = this.f111244q) == null || !str.equals(aVar.field_username) || !Util.isNullOrNil(this.f111249v.field_championUrl)) {
            View view = this.f111240j;
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C37687a aVar3 = this.f111249v;
            if (aVar3 != null && !Util.nullAs(aVar3.field_username, "").equals(this.f111244q) && !Util.isNullOrNil(this.f111249v.field_championUrl)) {
                this.f111237g.setOnViewClickListener(new C41305n());
                return;
            }
            return;
        }
        View view3 = this.f111240j;
        if (view3 != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ExdeviceRankListHeaderView exdeviceRankListHeaderView = this.f111237g;
        if (exdeviceRankListHeaderView != null) {
            exdeviceRankListHeaderView.setOnViewClickListener(new C41304m());
        }
    }

    /* renamed from: P7 */
    public final void mo64380P7(boolean z) {
        if (!this.f111220C || z) {
            this.f111218A = C41166r1.Gx0().mo73407a(this.f111248u);
            ArrayList<C37689c> Yt = C41166r1.Ax0().mo61487Yt();
            this.f111253z = Yt;
            this.f111252y = this.f111235e.mo64436a(Yt, this.f111218A, this.f111223F);
            runOnUiThread(new C41302k());
        }
    }

    /* renamed from: Q7 */
    public final void mo64381Q7() {
        View childAt = this.f111234d.getChildAt(0);
        int[] iArr = new int[2];
        if (childAt != null) {
            if (this.f111234d.getFirstVisiblePosition() == 0) {
                childAt.getLocationOnScreen(iArr);
                if (Util.isNullOrNil(this.f111225H) && f111217R == 128) {
                    f111217R = iArr[1];
                }
                int i = iArr[1];
                if (i > 0) {
                    int i2 = f111217R;
                    float f = i >= i2 ? 1.0f : ((float) i) / ((float) i2);
                    Log.m105919d("MicroMsg.Sport.ExdeviceRankInfoUI", "ap-alpha: %s", Float.valueOf(f));
                    this.f111238h.setAlpha(f);
                    this.f111238h.setVisibility(0);
                    View view = this.f111240j;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Float.valueOf(f));
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateHeaderEffect", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateHeaderEffect", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    return;
                }
            }
            this.f111238h.setAlpha(0.0f);
            View view3 = this.f111240j;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(0.0f));
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateHeaderEffect", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateHeaderEffect", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f111238h.setVisibility(8);
        }
    }

    /* renamed from: R7 */
    public final void mo64382R7() {
        Log.m105924i("MicroMsg.Sport.ExdeviceRankInfoUI", "updateRankInfoUIFromServer");
        C48547j jVar = new C48547j(this.f111248u, this.f111247t, this.f111250w, this.f111219B, this.f111232P);
        this.f111231N = jVar;
        jVar.f129863z = this;
        C86709a0.m107529k().f251779b.mo123460f(this.f111231N);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a4z;
    }

    public void initView() {
        this.f111236f = findViewById(C0966R.C0970id.hi9);
        ExdeviceRankListHeaderView exdeviceRankListHeaderView = new ExdeviceRankListHeaderView(this);
        Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i = rect.top;
        if (i == 0) {
            i = C45288e.m50133d(this, getResources().getDimensionPixelSize(C0966R.dimen.f3773ds));
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int dimensionPixelSize = displayMetrics.widthPixels > displayMetrics.heightPixels ? getResources().getDimensionPixelSize(C0966R.dimen.f3678b8) : getResources().getDimensionPixelSize(C0966R.dimen.f3679b9);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        int height = ((defaultDisplay.getHeight() / 2) - i) - dimensionPixelSize;
        if (defaultDisplay.getHeight() <= 0 || height <= 0) {
            height = getResources().getDimensionPixelSize(C0966R.dimen.f3767dm);
        }
        exdeviceRankListHeaderView.setMinimumHeight(height);
        exdeviceRankListHeaderView.setMinimumWidth(defaultDisplay.getWidth());
        exdeviceRankListHeaderView.setTag(Integer.valueOf(height));
        this.f111237g = exdeviceRankListHeaderView;
        MMPullDownView mMPullDownView = (MMPullDownView) findViewById(C0966R.C0970id.i8o);
        this.f111234d = (ListView) findViewById(C0966R.C0970id.cmi);
        this.f111238h = (ExdeviceRankChampionInfoView) findViewById(C0966R.C0970id.az7);
        View findViewById = findViewById(C0966R.C0970id.jcn);
        this.f111240j = findViewById;
        findViewById.setOnClickListener(new C41306o());
        this.f111237g.setIsShowTip(false);
        mo64379O7();
        mMPullDownView.setIsBottomShowAll(false);
        mMPullDownView.setTopViewVisible(false);
        mMPullDownView.setBottomViewVisible(false);
        mMPullDownView.setIsBottomShowAll(false);
        mMPullDownView.setIsTopShowAll(false);
        boolean z = true;
        mMPullDownView.setCanOverScrool(true);
        mMPullDownView.setOnInterceptTouchEventListener(new C41307p());
        mMPullDownView.setAtBottomCallBack(new C41293a());
        mMPullDownView.setOnScrollChangedListener(new C41294b());
        mMPullDownView.setAtTopCallBack(new C41295c());
        this.f111234d.setOnScrollListener(new C41296d());
        this.f111234d.addHeaderView(this.f111237g, (Object) null, false);
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.a4x, (ViewGroup) null);
        this.f111243p = inflate.findViewById(C0966R.C0970id.f8x);
        inflate.findViewById(C0966R.C0970id.f8w).setOnClickListener(new C2252e());
        View view = this.f111243p;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f111234d.addFooterView(inflate);
        ArrayList<C37689c> arrayList = this.f111253z;
        int size = arrayList != null ? arrayList.size() : 0;
        ArrayList<C52778d> arrayList2 = this.f111218A;
        if (size + (arrayList2 != null ? arrayList2.size() : 0) == 0) {
            ArrayList arrayList3 = new ArrayList();
            this.f111252y = arrayList3;
            this.f111235e.f111365e = arrayList3;
        }
        this.f111241n = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.gas), true, true, new C41297f());
        this.f111234d.setAdapter(this.f111235e);
        this.f111235e.f111369i = this;
        if (this.f111251x == 1) {
            this.f111234d.setVisibility(0);
            View view3 = this.f111236f;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "handleHardwareType", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "handleHardwareType", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.f111234d.setVisibility(8);
            View view4 = this.f111236f;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "handleHardwareType", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "handleHardwareType", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z = false;
        }
        if (!z) {
            Log.m105918d("MicroMsg.Sport.ExdeviceRankInfoUI", "hy: cannot handle this device type");
            finish();
            return;
        }
        this.f111239i = (ImageView) findViewById(C0966R.C0970id.cm4);
        mMPullDownView.setCanOverScrool(false);
        int A = C76577a.m92145A(this);
        int intValue = ((Integer) this.f111237g.getTag()).intValue();
        if (this.f111223F) {
            intValue += (getResources().getDimensionPixelSize(C0966R.dimen.f3782e2) / 2) + getResources().getDimensionPixelSize(C0966R.dimen.f3781e1);
        }
        this.f111239i.setLayoutParams(new RelativeLayout.LayoutParams(A, intValue));
        mo64375K7();
        mo64376L7(false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (C48540e.m53919a(this, i, i2, intent, this.f111247t) || i2 != -1) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                C76879j.m92726T(getContext(), getResources().getString(C0966R.string.f360099a34));
                Log.m105918d("MicroMsg.Sport.ExdeviceRankInfoUI", "Share to timeline return.");
            } else if (i != 3) {
                if (i == 4 && intent != null && intent.getBooleanExtra("KeyNeedUpdateRank", false)) {
                    mo64382R7();
                }
            } else if (intent != null) {
                ArrayList<String> stringsToList = Util.stringsToList(intent.getStringExtra("received_card_name").split(","));
                String stringExtra = intent.getStringExtra("custom_send_text");
                for (String next : stringsToList) {
                    C7250m.m7431a().Y50("gh_43f2581f6fd6", next, C72996z1.m85820U5(next));
                    if (!Util.isNullOrNil(stringExtra)) {
                        SendMsgEvent sendMsgEvent = new SendMsgEvent();
                        SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
                        aVar.f9497a = next;
                        aVar.f9498b = stringExtra;
                        aVar.f9499c = C45628s0.m50810y(next);
                        sendMsgEvent.f9496d.f9500d = 0;
                        sendMsgEvent.publish();
                    }
                }
            }
        } else if (intent == null) {
            Log.m105921e("MicroMsg.Sport.ExdeviceRankInfoUI", "onActivityResult, data is null.(reqestCode : %d)", Integer.valueOf(i));
        } else {
            String stringExtra2 = intent.getStringExtra("Select_Conv_User");
            if (stringExtra2 == null || stringExtra2.length() == 0) {
                Log.m105920e("MicroMsg.Sport.ExdeviceRankInfoUI", "select conversation failed, toUser is null.");
                return;
            }
            C41158q1.m44600c(this, stringExtra2, new C86009m1(getCacheDir(), "sport_share_bitmap.jpg").mo119971i(), intent.getStringExtra("custom_send_text"), this.f111222E);
            C76879j.m92726T(getContext(), getResources().getString(C0966R.string.f360099a34));
            Log.m105918d("MicroMsg.Sport.ExdeviceRankInfoUI", "Select conversation return.");
        }
    }

    public void onCreate(Bundle bundle) {
        ArrayList<C52778d> arrayList;
        String str;
        Integer num;
        Map<String, String> map;
        C52778d dVar;
        super.onCreate(bundle);
        this.f111228K = false;
        this.f111244q = C75592q0.m90789s();
        Intent intent = getIntent();
        this.f111245r = intent.getStringExtra("key_rank_info");
        this.f111246s = intent.getStringExtra("key_rank_semi");
        this.f111247t = intent.getStringExtra("app_username");
        this.f111248u = intent.getStringExtra("rank_id");
        this.f111219B = intent.getBooleanExtra("key_is_latest", false);
        this.f111250w = intent.getStringExtra("key_champioin_username");
        this.f111251x = intent.getIntExtra("device_type", 0);
        this.f111225H = intent.getStringExtra("locate_to_username");
        this.f111220C = intent.getBooleanExtra("key_only_show_latest_rank", false);
        if (Util.isNullOrNil(this.f111248u) || "#".equals(this.f111248u)) {
            if (!this.f111220C) {
                C53087d Hx0 = C41166r1.Hx0();
                Hx0.getClass();
                Cursor rawQuery = Hx0.f148162d.rawQuery(String.format("select * from %s order by %s desc limit 1", new Object[]{"HardDeviceRankInfo", "rankID"}), (String[]) null, 2);
                if (rawQuery == null) {
                    Log.m105920e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
                    dVar = null;
                } else {
                    if (!rawQuery.moveToFirst()) {
                        Log.m105918d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
                        dVar = null;
                    } else {
                        dVar = new C52778d();
                        dVar.convertFrom(rawQuery);
                    }
                    rawQuery.close();
                }
                if (dVar != null) {
                    this.f111248u = dVar.field_rankID;
                    this.f111247t = dVar.field_appusername;
                }
            }
            this.f111250w = null;
            this.f111219B = true;
        }
        ArrayList<C52778d> a = C41166r1.Gx0().mo73407a(this.f111248u);
        this.f111218A = a;
        if (!this.f111220C) {
            String str2 = ".msg.appmsg.hardwareinfo.rankview.rankinfolist.rankinfo";
            String str3 = ".username";
            if (a == null || a.size() <= 0) {
                ArrayList<C37689c> arrayList2 = new ArrayList<>();
                this.f111253z = arrayList2;
                String str4 = this.f111248u;
                String str5 = this.f111247t;
                String str6 = this.f111245r;
                String str7 = this.f111246s;
                Map<String, String> map2 = this.f111242o;
                Log.m105918d("MicroMsg.ExdeviceMsgXmlParser", str6);
                if (Util.isNullOrNil(str6)) {
                    Log.m105920e("MicroMsg.ExdeviceMsgXmlParser", "rank info is null or nil");
                } else {
                    C68070l.C68072b u = C68070l.C68072b.m80422u(str6, str7);
                    if (u != null) {
                        Map<String, String> map3 = u.f195558c;
                        arrayList = new ArrayList<>();
                        Object[] objArr = new Object[1];
                        objArr[0] = Boolean.valueOf(map3 == null);
                        Log.m105919d("MicroMsg.ExdeviceMsgXmlParser", "map is null :%s", objArr);
                        if (map3 != null && !map3.isEmpty()) {
                            Log.m105919d("MicroMsg.ExdeviceMsgXmlParser", "ap: map %s", map3.toString());
                            int i = 0;
                            while (true) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(".msg.appmsg.hardwareinfo.follows.follow");
                                sb.append(i == 0 ? "" : Integer.valueOf(i));
                                sb.append(str3);
                                String str8 = map3.get(sb.toString());
                                if (Util.isNullOrNil(str8)) {
                                    break;
                                }
                                String str9 = str2;
                                String str10 = str3;
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(".msg.appmsg.hardwareinfo.follows.follow");
                                sb4.append(i == 0 ? "" : Integer.valueOf(i));
                                sb4.append(".nickname");
                                String str11 = map3.get(sb4.toString());
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(".msg.appmsg.hardwareinfo.follows.follow");
                                sb5.append(i == 0 ? "" : Integer.valueOf(i));
                                sb5.append(".step");
                                C37689c cVar = new C37689c();
                                cVar.field_appusername = str5;
                                cVar.field_username = str8;
                                cVar.field_rankID = str4;
                                cVar.field_step = Util.getInt(map3.get(sb5.toString()), 0);
                                arrayList2.add(cVar);
                                ((HashMap) map2).put(str8, str11);
                                i++;
                                str3 = str10;
                                str2 = str9;
                                str4 = str4;
                            }
                            Log.m105925i("MicroMsg.ExdeviceMsgXmlParser", "follow should break now : %d", Integer.valueOf(i));
                            int i2 = 0;
                            while (true) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(str2);
                                sb6.append(i2 == 0 ? "" : Integer.valueOf(i2));
                                sb6.append(str3);
                                String str12 = map3.get(sb6.toString());
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(str2);
                                sb7.append(i2 == 0 ? "" : Integer.valueOf(i2));
                                sb7.append(".nickname");
                                String str13 = map3.get(sb7.toString());
                                if (Util.isNullOrNil(str12)) {
                                    break;
                                }
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append(str2);
                                sb8.append(i2 == 0 ? "" : Integer.valueOf(i2));
                                sb8.append(".rank.rankdisplay");
                                String str14 = map3.get(sb8.toString());
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append(str2);
                                if (i2 == 0) {
                                    str = str2;
                                    num = "";
                                } else {
                                    str = str2;
                                    num = Integer.valueOf(i2);
                                }
                                sb9.append(num);
                                sb9.append(".score.scoredisplay");
                                int i3 = Util.getInt(map3.get(sb9.toString()), 0);
                                C52778d dVar2 = new C52778d();
                                dVar2.field_appusername = str5;
                                dVar2.field_rankID = str4;
                                dVar2.field_username = str12;
                                dVar2.field_ranknum = Util.getInt(str14, 0);
                                dVar2.field_score = i3;
                                dVar2.field_selfLikeState = 2;
                                dVar2.field_likecount = 0;
                                arrayList.add(dVar2);
                                ((HashMap) map2).put(str12, str13);
                                i2++;
                                str3 = str3;
                                str2 = str;
                            }
                            Log.m105925i("MicroMsg.ExdeviceMsgXmlParser", "should break now : %d", Integer.valueOf(i2));
                            this.f111218A = arrayList;
                            C52451c Gx0 = C41166r1.Gx0();
                            String str15 = this.f111248u;
                            ArrayList<C52778d> arrayList3 = this.f111218A;
                            Gx0.getClass();
                            C41166r1.Hx0().mo73774qq(str15, arrayList3, false);
                        }
                    }
                }
                arrayList = null;
                this.f111218A = arrayList;
                C52451c Gx02 = C41166r1.Gx0();
                String str152 = this.f111248u;
                ArrayList<C52778d> arrayList32 = this.f111218A;
                Gx02.getClass();
                C41166r1.Hx0().mo73774qq(str152, arrayList32, false);
            } else {
                String str16 = this.f111245r;
                String str17 = this.f111246s;
                Map<String, String> map4 = this.f111242o;
                Log.m105919d("MicroMsg.ExdeviceMsgXmlParser", "ap: only nickname: %s", str16);
                if (Util.isNullOrNil(str16)) {
                    Log.m105920e("MicroMsg.ExdeviceMsgXmlParser", "rank info is null or nil");
                } else {
                    C68070l.C68072b u2 = C68070l.C68072b.m80422u(str16, str17);
                    if (u2 != null && (map = u2.f195558c) != null && !map.isEmpty()) {
                        int i4 = 0;
                        while (true) {
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append(".msg.appmsg.hardwareinfo.follows.follow");
                            sb10.append(i4 == 0 ? "" : Integer.valueOf(i4));
                            sb10.append(str3);
                            String str18 = map.get(sb10.toString());
                            if (Util.isNullOrNil(str18)) {
                                break;
                            }
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append(".msg.appmsg.hardwareinfo.follows.follow");
                            sb11.append(i4 == 0 ? "" : Integer.valueOf(i4));
                            sb11.append(".nickname");
                            ((HashMap) map4).put(str18, map.get(sb11.toString()));
                            i4++;
                        }
                        int i5 = 0;
                        while (true) {
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append(str2);
                            sb12.append(i5 == 0 ? "" : Integer.valueOf(i5));
                            sb12.append(str3);
                            String str19 = map.get(sb12.toString());
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append(str2);
                            sb13.append(i5 == 0 ? "" : Integer.valueOf(i5));
                            sb13.append(".nickname");
                            String str20 = map.get(sb13.toString());
                            if (Util.isNullOrNil(str19)) {
                                break;
                            }
                            ((HashMap) map4).put(str19, str20);
                            i5++;
                        }
                    }
                }
            }
            this.f111253z = C41166r1.Ax0().mo61487Yt();
        }
        C41368s0 s0Var = new C41368s0(this, this.f111247t);
        this.f111235e = s0Var;
        s0Var.f111366f = this.f111242o;
        List<C41345l1> a2 = s0Var.mo64436a(this.f111253z, this.f111218A, this.f111223F);
        this.f111252y = a2;
        this.f111235e.f111365e = a2;
        if (Util.isNullOrNil(this.f111250w)) {
            String I7 = mo64373I7();
            if (!Util.isNullOrNil(I7)) {
                this.f111250w = I7;
            }
        }
        C37687a jo = C41166r1.vx0().mo61492jo(this.f111250w);
        this.f111249v = jo;
        if (jo == null && !Util.isNullOrNil(this.f111250w)) {
            C37687a aVar = new C37687a();
            this.f111249v = aVar;
            aVar.field_username = this.f111250w;
            aVar.field_championMotto = getIntent().getStringExtra("key_champion_info");
            this.f111249v.field_championUrl = getIntent().getStringExtra("key_champion_coverimg");
            C52451c Gx03 = C41166r1.Gx0();
            C37687a aVar2 = this.f111249v;
            Gx03.getClass();
            C41166r1.vx0().mo61491Lo(aVar2, true);
        }
        initView();
        ArrayList<C52778d> arrayList4 = this.f111218A;
        if (arrayList4 != null && arrayList4.size() > 0) {
            this.f111238h.mo2146a(this.f111218A.get(0).field_username);
        }
        C41166r1.Ix0().mo73405b(this);
        C41166r1.Gx0().f146565d = this;
        mo64382R7();
        setBackBtn(new C41325d1(this));
        setMMTitle((int) C0966R.string.cgd);
        showOptionMenu(true);
        mo64378N7();
        ((C78112d) MvvmEventCenter.getEvent(C78112d.class)).publish(2);
        if (C11171e.m11045b(28)) {
            try {
                if (C111105a.m151499a(this, "android.permission.ACTIVITY_RECOGNITION") != 0) {
                    Log.m105924i("MicroMsg.Sport.ExdeviceRankInfoUI", "no ACTIVITY_RECOGNITION permission");
                    ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.ACTIVITY_RECOGNITION", 5, (String) null, (String) null);
                } else {
                    if (((C53036b) C86312j.m106911c(C53036b.class)).Qb0(C113177k.C113179b.HEALTHY, C113177k.C113178a.SPORT, (C32226l<? super Boolean, C13598b0>) null)) {
                        C76701a.makeText((Context) this, (int) C0966R.string.cff, 0).show();
                        Log.m105924i("MicroMsg.Sport.ExdeviceRankInfoUI", "business switch close");
                    }
                    Log.m105924i("MicroMsg.Sport.ExdeviceRankInfoUI", "has ACTIVITY_RECOGNITION permission");
                }
            } catch (Exception unused) {
            }
        }
        if (C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_REGISTER_STEP_COUNTER_FAIL_INT, 0) == 1) {
            Log.m105924i("MicroMsg.Sport.ExdeviceRankInfoUI", "toast get step fail");
            C76701a.makeText((Context) this, (int) C0966R.string.cff, 0).show();
            C117407d.INSTANCE.idkeyStat(323, 6, 1, false);
        }
    }

    public void onDestroy() {
        this.f111228K = true;
        C41368s0 s0Var = this.f111235e;
        if (s0Var != null) {
            s0Var.getClass();
            ((C52366c) C86312j.m106911c(C52366c.class)).W60();
        }
        super.onDestroy();
        C48547j jVar = this.f111231N;
        if (jVar != null) {
            jVar.f129863z = null;
        }
        C41166r1.Ix0().mo73406c(this);
        C41166r1.Gx0().f146565d = null;
        C41166r1.Gx0().getClass();
        int i = this.f111233Q;
        if (i > 0) {
            Log.m105927v("MicroMsg.Sport.SportReportLogic", "reportLikeCount count=%d", Integer.valueOf(i));
            C117407d.INSTANCE.mo160131h(13168, 0, Integer.valueOf(i), 0, 0);
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onRestart() {
        super.onRestart();
        mo64380P7(true);
    }

    public void onResume() {
        super.onResume();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C0435q.class);
        hashSet.add(C0249a.class);
    }
}
