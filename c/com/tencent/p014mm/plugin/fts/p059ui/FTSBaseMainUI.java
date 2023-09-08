package com.tencent.p014mm.plugin.fts.p059ui;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import bl3.C39818r;
import cc0.C92411b;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.UpdateFtsSearchDataEvent;
import com.tencent.p014mm.autogen.events.UpdateSearchIndexAtOnceEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.UniverSearchStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.localSearchComfirmActionStruct;
import com.tencent.p014mm.p136ui.tools.C106757l0;
import com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView;
import com.tencent.p014mm.plugin.fts.C93829e;
import com.tencent.p014mm.plugin.fts.p059ui.widget.C18879e;
import com.tencent.p014mm.plugin.fts.p059ui.widget.C18880f;
import com.tencent.p014mm.plugin.fts.p059ui.widget.FTSActionBarSearchView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C45286l;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kv1.C99251g;
import kv1.C99252h;
import kv1.C99254i;
import kv1.C99260q;
import ky2.C10432i;
import lv1.C21461d;
import lv1.C99667f;
import nj3.C76879j;
import nj3.C88989a;
import ov1.C21891f;
import p278yh.C23310h;
import p629ny.C76979h;
import p702ts.C78085c;
import pv1.C22019b;
import qb0.C77306a;
import qo3.C47883u;
import qo3.C77426q;
import te3.C49768hy;
import u73.C101987v0;
import u73.C52468u0;
import u73.C78137s0;
import uv1.C65482d;
import uv1.C65483e;
import vo3.C78461f;
import vv1.C22798i;
import w00.C22832b;
import w00.C22841m;
import w00.C78505k;
import zt3.C119157j;
import zv1.C23592b;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSBaseMainUI */
public class FTSBaseMainUI extends FTSBaseVoiceSearchUI implements C92411b.C92412a {

    /* renamed from: D */
    public static final /* synthetic */ int f52727D = 0;

    /* renamed from: A */
    public int f52728A = -1;

    /* renamed from: B */
    public C77306a f52729B = null;

    /* renamed from: C */
    public int f52730C = 1;

    /* renamed from: o */
    public int f52731o;

    /* renamed from: p */
    public volatile boolean f52732p;

    /* renamed from: q */
    public IListener<UpdateFtsSearchDataEvent> f52733q = new IListener<UpdateFtsSearchDataEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1317958916;
        }

        public boolean callback(IEvent iEvent) {
            if (((UpdateFtsSearchDataEvent) iEvent) == null) {
                return false;
            }
            FTSBaseMainUI.this.mo23770R7();
            Log.m105924i("MicroMsg.FTS.FTSMainUI", "UpdateFtsSearchDataEvent");
            return false;
        }
    };

    /* renamed from: r */
    public C18879e f52734r = new C18818d();

    /* renamed from: s */
    public C18887z f52735s;

    /* renamed from: t */
    public View f52736t;

    /* renamed from: u */
    public View f52737u;

    /* renamed from: v */
    public View f52738v;

    /* renamed from: w */
    public TextView f52739w;

    /* renamed from: x */
    public View f52740x;

    /* renamed from: y */
    public View f52741y;

    /* renamed from: z */
    public Dialog f52742z;

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSBaseMainUI$c */
    public class C18817c implements C18880f.C18881a {
        public C18817c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSBaseMainUI$d */
    public class C18818d implements C18879e {
        public C18818d() {
        }

        /* renamed from: a */
        public void mo23773a(String str, String str2) {
            FTSBaseMainUI fTSBaseMainUI = FTSBaseMainUI.this;
            fTSBaseMainUI.f52735s.f52958o.f67728y = str2;
            fTSBaseMainUI.f52761d.mo23884r(str2);
            FTSBaseMainUI.m19584T7(FTSBaseMainUI.this, str2);
        }

        /* renamed from: b */
        public void mo23774b(boolean z, boolean z2, String str) {
            FTSBaseMainUI.this.f52761d.mo23884r(str);
            FTSBaseMainUI.m19584T7(FTSBaseMainUI.this, str);
            if (z) {
                return;
            }
            if (z2) {
                String string = FTSBaseMainUI.this.getString(C0966R.string.f3w);
                C77426q qVar = new C77426q(MMApplicationContext.getContext());
                qVar.mo107595g(string);
                qVar.mo107589a(true);
                qVar.mo107591c((C47883u) null, (C47883u) null);
                qVar.mo107603o();
                return;
            }
            String string2 = FTSBaseMainUI.this.getString(C0966R.string.f3x);
            C77426q qVar2 = new C77426q(MMApplicationContext.getContext());
            qVar2.mo107595g(string2);
            qVar2.mo107589a(true);
            qVar2.mo107591c((C47883u) null, (C47883u) null);
            qVar2.mo107603o();
        }

        /* renamed from: c */
        public void mo23775c(String str) {
            FTSBaseMainUI.this.f52761d.mo23884r(str);
        }

        /* renamed from: d */
        public void mo23776d() {
            C106757l0 l0Var = FTSBaseMainUI.this.f52761d.f319121i;
            if (l0Var != null && (l0Var instanceof FTSActionBarSearchView)) {
                ((FTSActionBarSearchView) l0Var).setCursorVisible(false);
            }
            FTSBaseMainUI.this.f52735s.f52958o.f67727x = 1;
            if (!C93938f0.m118697e()) {
                FTSBaseMainUI.this.mo23772V7();
            }
            FTSBaseMainUI fTSBaseMainUI = FTSBaseMainUI.this;
            fTSBaseMainUI.f52761d.mo153859q(fTSBaseMainUI.getContext().getString(C0966R.string.f3u));
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSBaseMainUI$e */
    public class C18819e implements Runnable {
        public C18819e() {
        }

        public void run() {
            Log.m105924i("MicroMsg.FTS.FTSMainUI", " finish");
            FTSBaseMainUI.super.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSBaseMainUI$f */
    public class C18820f implements View.OnClickListener {
        public C18820f() {
        }

        public void onClick(View view) {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSBaseMainUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FTSBaseMainUI fTSBaseMainUI = FTSBaseMainUI.this;
            String J7 = fTSBaseMainUI.mo23793J7();
            C18887z zVar = fTSBaseMainUI.f52735s;
            C23592b bVar = zVar.f52958o;
            int i2 = zVar.f52857g;
            int i3 = fTSBaseMainUI.f52731o;
            int i4 = C18843b0.f52842a;
            UniverSearchStruct univerSearchStruct = new UniverSearchStruct();
            univerSearchStruct.f48610d = (long) i3;
            if (C99251g.m129292m(J7)) {
                univerSearchStruct.f48612e = 8;
            } else {
                univerSearchStruct.f48612e = 9;
            }
            univerSearchStruct.f48614f = (long) (i2 + 1);
            long j = bVar.f67705b;
            if (j > 0 && j < System.currentTimeMillis()) {
                univerSearchStruct.f48629p = System.currentTimeMillis() - bVar.f67706c;
            }
            if (!bVar.f67728y.equals(J7)) {
                univerSearchStruct.f48589I = 1;
            }
            univerSearchStruct.f48620i = univerSearchStruct.mo86045b("SearchId", "", true);
            univerSearchStruct.mo21196s("");
            univerSearchStruct.f48630q = (long) bVar.f67708e;
            univerSearchStruct.f48631r = (long) bVar.f67709f;
            univerSearchStruct.f48632s = (long) bVar.f67711h;
            univerSearchStruct.f48633t = (long) bVar.f67715l;
            univerSearchStruct.f48634u = (long) bVar.f67717n;
            univerSearchStruct.f48635v = (long) bVar.f67718o;
            univerSearchStruct.f48637x = (long) bVar.f67719p;
            univerSearchStruct.f48638y = (long) bVar.f67720q;
            univerSearchStruct.f48639z = univerSearchStruct.mo86045b("UniSearchId", String.valueOf(C99252h.f291030c), true);
            univerSearchStruct.f48581A = univerSearchStruct.mo86045b("Query", J7, true);
            int i5 = bVar.f67727x;
            bVar.f67727x = 2;
            univerSearchStruct.f48584D = (long) i5;
            univerSearchStruct.f48585E = univerSearchStruct.mo86045b("HasSHowType", "", true);
            univerSearchStruct.f48586F = univerSearchStruct.mo86045b("VoiceInfo", "", true);
            univerSearchStruct.f48587G = univerSearchStruct.mo86045b("SessionId", "", true);
            univerSearchStruct.f48588H = 1;
            univerSearchStruct.f48597Q = univerSearchStruct.mo86045b("GroupId", "", true);
            univerSearchStruct.f48598R = univerSearchStruct.mo86045b("MatchStr", "", true);
            univerSearchStruct.f48599S = univerSearchStruct.mo86045b("MyRecentMsgCount", "", true);
            univerSearchStruct.f48600T = univerSearchStruct.mo86045b("MyRecentSearchCount", "", true);
            univerSearchStruct.f48601U = univerSearchStruct.mo86045b("MyRecentSearchDays", "", true);
            univerSearchStruct.f48603W = univerSearchStruct.mo86045b("TophitsCount", "", true);
            univerSearchStruct.f48604X = univerSearchStruct.mo86045b("TrainScore", "", true);
            univerSearchStruct.f48607a0 = univerSearchStruct.mo86045b("strDocId", "", true);
            univerSearchStruct.f48621i0 = univerSearchStruct.mo86045b("FtsTimeToken", C99252h.m129297b(), true);
            univerSearchStruct.f48623j0 = C31543z5.m39453c();
            univerSearchStruct.f48608b0 = univerSearchStruct.mo86045b("ClickedAppId", "", true);
            univerSearchStruct.mo86054n();
            Log.m105925i("MicroMsg.FTS.FTSReportLogic", "%s", univerSearchStruct.mo1006q().replace(APLogFileUtil.SEPARATOR_LINE, " "));
            boolean m = C99251g.m129292m(fTSBaseMainUI.mo23793J7());
            boolean n = C99251g.m129293n(fTSBaseMainUI.mo23793J7());
            if (m) {
                i = 8;
            } else {
                if (n) {
                    i = 9;
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
            bVar.mo37067a(i);
            C18887z zVar2 = fTSBaseMainUI.f52735s;
            zVar2.f52956D = true;
            if (!zVar2.f52960q) {
                zVar2.f52960q = true;
                C18843b0.m19723j(J7, true, zVar2.f52857g, 0, bVar);
            }
            if (!(J7 == null || J7.length() == 0 || J7.trim().length() == 0)) {
                fTSBaseMainUI.f52728A = Character.isDigit(J7.charAt(0)) ? 15 : 3;
                if (fTSBaseMainUI.f52729B == null) {
                    fTSBaseMainUI.f52729B = new C68989o(fTSBaseMainUI, J7);
                    C86709a0.m107524d().mo123468n(106, fTSBaseMainUI, fTSBaseMainUI.f52729B);
                }
                C45286l lVar = new C45286l(J7, 3);
                C86709a0.m107524d().mo123460f(lVar);
                fTSBaseMainUI.f52742z = C76879j.m92723Q(fTSBaseMainUI, fTSBaseMainUI.getString(C0966R.string.a3h), fTSBaseMainUI.getString(C0966R.string.igj), true, true, new C68990p(fTSBaseMainUI, lVar));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSBaseMainUI$b */
    public class C18821b implements View.OnFocusChangeListener {
        public C18821b() {
        }

        public void onFocusChange(View view, boolean z) {
            FTSBaseMainUI.this.getStateCenter().dispatch(new C65482d(z));
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSBaseMainUI$a */
    public class C18822a implements C78461f.C78462a {
        public C18822a() {
        }

        /* renamed from: c3 */
        public void mo6473c3(int i) {
            if (i != 0) {
                FTSBaseMainUI fTSBaseMainUI = FTSBaseMainUI.this;
                int i2 = FTSBaseMainUI.f52727D;
                fTSBaseMainUI.getClass();
            }
        }

        /* renamed from: w4 */
        public void mo6474w4(int i) {
        }
    }

    /* renamed from: T7 */
    public static void m19584T7(FTSBaseMainUI fTSBaseMainUI, String str) {
        C106757l0 l0Var = fTSBaseMainUI.f52761d.f319121i;
        if (l0Var != null && (l0Var instanceof FTSActionBarSearchView)) {
            ((FTSActionBarSearchView) l0Var).setCursorVisible(true);
        }
        fTSBaseMainUI.f52761d.mo153859q(fTSBaseMainUI.getContext().getString(C0966R.string.a2p));
        if (!C93938f0.m118697e()) {
            fTSBaseMainUI.getStateCenter().dispatch(new C65483e(true));
        }
    }

    /* renamed from: E2 */
    public void mo23760E2(int i, boolean z) {
        super.mo23760E2(i, z);
        if (z || i != 0 || !this.f52735s.f52955C) {
            View view = this.f52741y;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onEnd", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onEnd", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view3 = this.f52741y;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onEnd", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onEnd", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!z) {
            View view4 = this.f52737u;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onEnd", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onEnd", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f52732p = true;
        boolean m = C99251g.m129292m(mo23793J7());
        boolean n = C99251g.m129293n(mo23793J7());
        if (i <= 0) {
            View view6 = this.f52738v;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onEnd", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onEnd", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (m || n) {
            View view8 = this.f52738v;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            View view9 = view8;
            C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onEnd", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onEnd", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (m || n) {
            View view10 = this.f52737u;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            View view11 = view10;
            C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onEnd", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onEnd", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C23592b bVar = this.f52735s.f52958o;
            bVar.f67722s = m ? 1 : 0;
            bVar.f67723t = n ? 1 : 0;
            int i2 = m ? 8 : n ? 9 : 0;
            bVar.getClass();
            C21461d dVar = new C21461d();
            dVar.f60760b = bVar.f67726w + 1;
            dVar.f60765g = "SearchContactBar";
            dVar.f60764f = C31543z5.m39453c() - bVar.f67705b;
            dVar.f60761c = i2;
            if (!((ArrayList) bVar.f67703J).contains(dVar)) {
                ((ArrayList) bVar.f67703J).add(dVar);
            }
        }
    }

    /* renamed from: H7 */
    public C18852m mo23761H7(C18854q qVar) {
        C18887z zVar = new C18887z(qVar, this.f52731o);
        this.f52735s = zVar;
        zVar.f52958o.f67727x = 2;
        return zVar;
    }

    /* renamed from: I7 */
    public List<View> mo23762I7() {
        ArrayList arrayList = new ArrayList();
        if (this.f52736t == null) {
            View inflate = getLayoutInflater().inflate(C0966R.C0971layout.atl, (ViewGroup) null, false);
            this.f52736t = inflate;
            View findViewById = inflate.findViewById(C0966R.C0970id.j54);
            this.f52737u = findViewById;
            findViewById.setOnClickListener(new C18820f());
            this.f52738v = this.f52736t.findViewById(C0966R.C0970id.f359135j53);
            this.f52739w = (TextView) this.f52736t.findViewById(C0966R.C0970id.j56);
        }
        arrayList.add(this.f52736t);
        if (!((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            C22798i iVar = (C22798i) C39818r.f106831a.mo62444c(this).mo75002a(C22798i.class);
            ListView listView = this.f52762e;
            iVar.getClass();
            C87412m.m108594g(listView, "parentView");
            if (iVar.f65547n == null) {
                iVar.f65547n = new C23310h(LayoutInflater.from(this).inflate(C0966R.C0971layout.d9x, listView, false));
            }
            C23310h hVar = iVar.f65547n;
            View view = hVar != null ? hVar.f67012a : null;
            if (view != null) {
                arrayList.add(view);
            }
        }
        if (this.f52740x == null) {
            View inflate2 = getLayoutInflater().inflate(C0966R.C0971layout.ata, (ViewGroup) null, false);
            this.f52740x = inflate2;
            this.f52741y = inflate2.findViewById(C0966R.C0970id.g3e);
        }
        arrayList.add(this.f52740x);
        return arrayList;
    }

    /* renamed from: K7 */
    public void mo23763K7() {
        int intExtra = getIntent().getIntExtra("from_tab_index", -1);
        if (intExtra == 0) {
            this.f52731o = 1;
        } else if (intExtra == 1) {
            this.f52731o = 2;
        } else if (intExtra == 2) {
            this.f52731o = 3;
        } else if (intExtra != 3) {
            this.f52731o = 0;
        } else {
            this.f52731o = 4;
        }
    }

    /* renamed from: L7 */
    public void mo23764L7() {
        super.mo23764L7();
        getStateCenter().dispatch(new C65483e(true));
        View view = this.f52741y;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: M7 */
    public void mo23765M7() {
        super.mo23765M7();
        mo23772V7();
        View view = this.f52741y;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: N7 */
    public void mo23766N7() {
        View view = this.f52741y;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setFooterViewGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setFooterViewGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: O7 */
    public void mo23767O7() {
        View view = this.f52741y;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setFooterViewVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setFooterViewVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: P7 */
    public void mo23768P7() {
        super.mo23768P7();
        mo23772V7();
        View view = this.f52741y;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f52762e.setVisibility(0);
    }

    /* renamed from: Q7 */
    public void mo23769Q7() {
        super.mo23769Q7();
        mo23772V7();
        View view = this.f52741y;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: R7 */
    public void mo23770R7() {
        super.mo23770R7();
        View view = this.f52738v;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f52737u;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f52730C = 1;
        if (!((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            getStateCenter().dispatch(new C78505k(mo23793J7(), C99252h.f291031d));
        }
        CharSequence charSequence = null;
        if (C99251g.m129292m(mo23793J7())) {
            charSequence = C99254i.m129307d(getString(C0966R.string.f2m), "", C99667f.m130088a(mo23793J7(), mo23793J7(), false, false)).f292107a;
        } else if (C99251g.m129293n(mo23793J7())) {
            charSequence = C99254i.m129307d(getString(C0966R.string.f2n), "", C99667f.m130088a(mo23793J7(), mo23793J7(), false, false)).f292107a;
        }
        this.f52739w.setText(((C76979h) C86312j.m106911c(C76979h.class)).op0(getContext(), charSequence, C76577a.m92157h(getContext(), C0966R.dimen.f3927j7)));
    }

    /* renamed from: S6 */
    public boolean mo1322S6(String str) {
        super.mo1322S6(str);
        if (!this.f52732p || TextUtils.isEmpty(mo23793J7()) || C101987v0.m134276j()) {
            return false;
        }
        C18887z zVar = this.f52735s;
        zVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (C21891f c : zVar.f52957n) {
            arrayList.addAll(c.mo17720c());
        }
        if (arrayList.size() != 0 || !TextUtils.isEmpty(this.f52739w.getText())) {
            localSearchComfirmActionStruct localsearchcomfirmactionstruct = new localSearchComfirmActionStruct();
            localsearchcomfirmactionstruct.f156975d = 1;
            localsearchcomfirmactionstruct.f156976e = 2;
            localsearchcomfirmactionstruct.f156977f = localsearchcomfirmactionstruct.mo86045b(SearchIntents.EXTRA_QUERY, mo23793J7(), true);
            localsearchcomfirmactionstruct.mo86054n();
            return false;
        }
        localSearchComfirmActionStruct localsearchcomfirmactionstruct2 = new localSearchComfirmActionStruct();
        localsearchcomfirmactionstruct2.f156975d = 1;
        localsearchcomfirmactionstruct2.f156976e = 1;
        localsearchcomfirmactionstruct2.f156977f = localsearchcomfirmactionstruct2.mo86045b(SearchIntents.EXTRA_QUERY, mo23793J7(), true);
        localsearchcomfirmactionstruct2.mo86054n();
        return false;
    }

    /* renamed from: S7 */
    public void mo23771S7() {
        super.mo23771S7();
        this.f52730C = 1;
        getStateCenter().dispatch(new C22841m(mo23793J7(), C99252h.f291031d));
    }

    /* renamed from: V7 */
    public final void mo23772V7() {
        getStateCenter().dispatch(new C65483e(false));
    }

    public void finish() {
        MMHandlerThread.postToMainThreadDelayed(new C18819e(), (long) (!getController().mo177045F() ? 0 : 100));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ate;
    }

    /* renamed from: l3 */
    public void mo1324l3(String str) {
        super.mo1324l3(str);
        this.f52732p = false;
    }

    /* renamed from: o6 */
    public void mo23749o6(View view, C22019b bVar, boolean z) {
    }

    public void onBackPressed() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        Class cls = C99260q.class;
        super.onCreate(bundle);
        C78461f bounceView = getBounceView();
        if (bounceView != null) {
            ((NestedBounceView) bounceView).mo154637e(new C18822a());
        }
        this.f52761d.mo153859q(getString(C0966R.string.a2p));
        C106757l0 l0Var = this.f52761d.f319121i;
        if (l0Var != null) {
            l0Var.setImeScene(4);
        }
        setActionbarColor(getContext().getResources().getColor(C0966R.color.a7_));
        hideActionbarLine();
        C99252h.f291030c = C99251g.m129286g(3);
        int i = this.f52731o;
        int i2 = C18843b0.f52842a;
        String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[]{Integer.valueOf(i), 1, 0, 0, 0, "", 0, 0, 0, 0, 0, "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Long.valueOf(C99252h.f291030c), "", 0, 0, 0, "", "", "", 1, 0, "0,0,0,0,0,0", "", "", "", "", "", "", "", "", "", Long.valueOf(C99252h.f291030c), 0, "", "", "", 0, 0, "", "", "", 0, 0, "", "", "", Long.valueOf(C31543z5.m39453c())});
        Log.m105919d("MicroMsg.FTS.FTSReportLogic", "reportFTSEnterClick: %d, %s", 10991, format);
        C115669n.INSTANCE.kvStat(10991, format);
        if (((C99260q) C86312j.m106911c(cls)).mo128746Ta() == null) {
            finish();
            return;
        }
        ((C93829e) ((C99260q) C86312j.m106911c(cls)).mo128746Ta()).mo128779g();
        C78137s0.m94342f((List<String>) null, 3, 0, (List<C49768hy>) null, false);
        this.f52733q.alive();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        C18880f fVar = this.f52761d;
        C18821b bVar = new C18821b();
        C106757l0 l0Var = fVar.f319121i;
        if (l0Var != null) {
            l0Var.setFocusChangeListener(bVar);
        }
        if ((LocaleUtil.isChineseAppLang() || LocaleUtil.getApplicationLanguage().equals("en")) && C93938f0.m118697e()) {
            this.f52761d.f52938t = new C18817c();
        }
        return true;
    }

    public void onDestroy() {
        Class cls = C99260q.class;
        ((C119157j) C119157j.f356862d).mo183894y("FTSMainUI.GetLocation");
        ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(this);
        if (((C99260q) C86312j.m106911c(cls)).mo128746Ta() != null) {
            ((C93829e) ((C99260q) C86312j.m106911c(cls)).mo128746Ta()).mo128774b();
        }
        C99252h.f291032e = "";
        this.f52733q.dead();
        super.onDestroy();
    }

    public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
        Log.m105925i("MicroMsg.FTS.FTSMainUI", "onGetLocation %b %f|%f", Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2));
        ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(this);
        return false;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66) {
            if (!this.f52732p || this.f52735s.f52857g != 0 || Util.isNullOrNil(mo23793J7())) {
                return false;
            }
            getStateCenter().dispatch(new C22832b(mo23793J7(), C99252h.f291031d));
            return false;
        } else if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 4) {
            return false;
        } else {
            onBackPressed();
            return false;
        }
    }

    public void onResume() {
        super.onResume();
        UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = new UpdateSearchIndexAtOnceEvent();
        updateSearchIndexAtOnceEvent.f9570d.f9571a = 0;
        updateSearchIndexAtOnceEvent.publish();
        if (!Util.isNullOrNil((String) null)) {
            this.f52766i = null;
        }
        ((C119157j) C119157j.f356862d).mo183879j(new C52468u0(true, false), 0, "WebSearchThread");
    }

    public void onStop() {
        hideVKB();
        super.onStop();
    }
}
