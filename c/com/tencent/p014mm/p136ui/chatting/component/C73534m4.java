package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C74339x2;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import hk3.C76227e;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p270xi.C91212b;
import zj3.C79348e;
import zj3.C79368l;
import zj3.C79369m;
import zj3.C79384u0;

@C91212b(exportInterface = C79384u0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.m4 */
public class C73534m4 extends C73412a implements C79384u0 {

    /* renamed from: e */
    public View f215989e;

    /* renamed from: f */
    public C106742j1 f215990f = null;

    /* renamed from: g */
    public boolean f215991g = false;

    /* renamed from: h */
    public boolean f215992h = false;

    /* renamed from: i */
    public boolean f215993i = false;

    /* renamed from: j */
    public boolean f215994j = false;

    /* renamed from: n */
    public boolean f215995n = false;

    /* renamed from: o */
    public long f215996o = -1;

    /* renamed from: p */
    public ArrayList<String> f215997p;

    /* renamed from: q */
    public boolean f215998q = false;

    /* renamed from: r */
    public TextView f215999r;

    /* renamed from: s */
    public ListView f216000s;

    /* renamed from: t */
    public View f216001t;

    /* renamed from: u */
    public C74339x2 f216002u;

    /* renamed from: v */
    public boolean f216003v = false;

    /* renamed from: w */
    public boolean f216004w = true;

    /* renamed from: x */
    public boolean f216005x = false;

    /* renamed from: com.tencent.mm.ui.chatting.component.m4$a */
    public class C44833a implements View.OnTouchListener {
        public C44833a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/component/SearchComponent$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C73534m4.this.f215752d.mo91578s();
            C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/component/SearchComponent$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.m4$b */
    public class C44834b implements View.OnClickListener {
        public C44834b(C73534m4 m4Var) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/component/SearchComponent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/SearchComponent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.m4$c */
    public class C73535c implements C74339x2.C74340a {
        public C73535c() {
        }

        /* renamed from: a */
        public void mo102514a(int i) {
            C73534m4.this.mo102506R(i);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.m4$d */
    public class C73536d implements AdapterView.OnItemClickListener {
        public C73536d() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/component/SearchComponent$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C72963f4 f4Var = (C72963f4) C73534m4.this.f216002u.getItem(i);
            if (f4Var != null && !Util.isNullOrNil(f4Var.mo108768t())) {
                C73534m4.this.mo102503H2();
                ((C79369m) C73534m4.this.f215752d.f193278b.mo102812a(C79369m.class)).mo102680R1(f4Var);
                C73534m4 m4Var = C73534m4.this;
                if (!m4Var.f215998q) {
                    m4Var.f215998q = true;
                    ((ChattingUIFragment) m4Var.f215752d.f193288l).f215289B.setBottomViewVisible(true);
                    ((ChattingUIFragment) C73534m4.this.f215752d.f193287k).f215304v.setTranscriptMode(0);
                }
                ((ChattingUIFragment) C73534m4.this.f215752d.f193288l).f215289B.setIsTopShowAll(false);
                ((ChattingUIFragment) C73534m4.this.f215752d.f193288l).f215289B.setIsBottomShowAll(false);
                ((C79368l) C73534m4.this.f215752d.f193278b.mo102812a(C79368l.class)).mo108214y2(f4Var.getMsgId(), false, false, false, 0, false, C76227e.C76228a.ACTION_POSITION);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/SearchComponent$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: F2 */
    public boolean mo102501F2() {
        return this.f215994j;
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        if (this.f216003v) {
            mo102503H2();
            ((C79369m) this.f215752d.f193278b.mo102812a(C79369m.class)).mo102684o3();
        }
    }

    /* renamed from: H1 */
    public boolean mo102502H1() {
        return this.f215998q;
    }

    /* renamed from: H2 */
    public void mo102503H2() {
        Log.m105926v("MicroMsg.ChattingUI.SearchComponent", "exit edit search mode");
        this.f216003v = false;
        this.f216004w = true;
        TextView textView = this.f215999r;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View view = this.f216001t;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/SearchComponent", "exitEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/component/SearchComponent", "exitEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ListView listView = this.f216000s;
        if (listView != null) {
            listView.setVisibility(8);
        }
        this.f215752d.mo91547H(0);
        this.f215752d.mo91578s();
    }

    /* renamed from: J5 */
    public boolean mo102504J5() {
        return this.f215995n;
    }

    /* renamed from: N4 */
    public ArrayList<String> mo102505N4() {
        return this.f215997p;
    }

    /* renamed from: N5 */
    public void mo70052N5(int i, int i2, Intent intent) {
        if (((C79368l) this.f215752d.f193278b.mo102812a(C79368l.class)).mo108213v1() && this.f216003v) {
            mo102503H2();
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        boolean z;
        if (this.f215996o >= 0 && !this.f216005x) {
            MMHandlerThread.postToMainThreadDelayed(new C73555n4(this), 2000);
        }
        if (this.f215991g) {
            Log.m105924i("MicroMsg.ChattingUI.SearchComponent", "[initSearchView]");
            C115669n.INSTANCE.idkeyStat(219, 11, 1, true);
            C73521l0.m86927d(this.f215752d.f193286j, C0966R.C0970id.f359132j50);
            this.f215989e = this.f215752d.mo91562c(C0966R.C0970id.j58);
            this.f216001t = this.f215752d.mo91562c(C0966R.C0970id.j4y);
            this.f215752d.mo91570k().setFocusable(false);
            this.f215752d.mo91570k().setFocusableInTouchMode(false);
            this.f216001t.setOnClickListener(new C44835o4(this));
            if (this.f215999r == null) {
                C73521l0.m86927d(this.f215752d.f193286j, C0966R.C0970id.f359499l91);
                this.f215999r = (TextView) this.f215752d.mo91562c(C0966R.C0970id.cj5);
            }
            if (!this.f215752d.mo91582w()) {
                if (!((C79348e) this.f215752d.f193278b.mo102812a(C79348e.class)).mo70075s4()) {
                    z = false;
                    C74339x2 x2Var = new C74339x2(this.f215752d.mo91565f(), new C72963f4(), this.f215752d.mo91577r(), this.f215752d.mo91573n(), z);
                    this.f216002u = x2Var;
                    x2Var.f218370s = new C73576p4(this);
                    ListView listView = (ListView) this.f215752d.mo91562c(C0966R.C0970id.j4z);
                    this.f216000s = listView;
                    listView.setAdapter(this.f216002u);
                    this.f216000s.setOnItemClickListener(new C44837q4(this));
                    this.f216000s.setOnTouchListener(new C44839r4(this));
                    C106742j1 j1Var = new C106742j1();
                    this.f215990f = j1Var;
                    j1Var.f319122j = new C73596s4(this);
                    this.f215752d.f193286j.addSearchMenu(true, j1Var);
                    this.f215990f.mo153851c(true);
                }
            }
            z = true;
            C74339x2 x2Var2 = new C74339x2(this.f215752d.mo91565f(), new C72963f4(), this.f215752d.mo91577r(), this.f215752d.mo91573n(), z);
            this.f216002u = x2Var2;
            x2Var2.f218370s = new C73576p4(this);
            ListView listView2 = (ListView) this.f215752d.mo91562c(C0966R.C0970id.j4z);
            this.f216000s = listView2;
            listView2.setAdapter(this.f216002u);
            this.f216000s.setOnItemClickListener(new C44837q4(this));
            this.f216000s.setOnTouchListener(new C44839r4(this));
            C106742j1 j1Var2 = new C106742j1();
            this.f215990f = j1Var2;
            j1Var2.f319122j = new C73596s4(this);
            this.f215752d.f193286j.addSearchMenu(true, j1Var2);
            this.f215990f.mo153851c(true);
        }
        if (this.f215992h || this.f215993i || this.f215994j || this.f215995n) {
            ((C79368l) this.f215752d.f193278b.mo102812a(C79368l.class)).mo108214y2(this.f215752d.f193286j.getLongExtra("msg_local_id", -1), false, false, false, this.f215752d.f193286j.getIntExtra("SELECTION_TOP_OFFSET", 0), false, C76227e.C76228a.ACTION_POSITION);
        }
    }

    /* renamed from: R */
    public void mo102506R(int i) {
        Log.m105925i("MicroMsg.ChattingUI.SearchComponent", "search result count %d, in edit mode %B, can report %B", Integer.valueOf(i), Boolean.valueOf(this.f216003v), Boolean.valueOf(this.f216004w));
        if (this.f215991g || this.f216003v) {
            if (this.f216004w && i >= 0) {
                this.f216004w = false;
                C115669n.INSTANCE.mo160131h(10811, 2);
            }
            if (i > 0) {
                this.f216000s.setVisibility(0);
                this.f215752d.mo91547H(8);
                this.f215999r.setVisibility(8);
                View view = this.f216001t;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i == 0) {
                this.f216000s.setVisibility(8);
                this.f215752d.mo91547H(8);
                this.f215999r.setVisibility(0);
                View view3 = this.f216001t;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                this.f216000s.setVisibility(8);
                this.f215752d.mo91547H(0);
                this.f215999r.setVisibility(8);
                View view5 = this.f216001t;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/ui/chatting/component/SearchComponent", "changeViewShow", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            Log.m105918d("MicroMsg.ChattingUI.SearchComponent", "not search now");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r4 = r3.f215997p;
     */
    /* renamed from: U0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo102507U0(long r4) {
        /*
            r3 = this;
            long r0 = r3.f215996o
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0016
            boolean r4 = r3.f215993i
            if (r4 == 0) goto L_0x0016
            java.util.ArrayList<java.lang.String> r4 = r3.f215997p
            if (r4 == 0) goto L_0x0016
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0016
            r4 = 1
            return r4
        L_0x0016:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73534m4.mo102507U0(long):boolean");
    }

    /* renamed from: W3 */
    public C74339x2 mo102508W3() {
        return this.f216002u;
    }

    /* renamed from: Y */
    public boolean mo102509Y() {
        return this.f215991g;
    }

    /* renamed from: e */
    public void mo70065e() {
        this.f215991g = this.f215752d.f193286j.getBooleanExtra("search_chat_content", false).booleanValue();
        this.f215992h = this.f215752d.f193286j.getBooleanExtra("show_search_chat_content_result", false).booleanValue();
        this.f215997p = this.f215752d.f193286j.getStringArrayList("highlight_keyword_list");
        this.f215996o = this.f215752d.f193286j.getLongExtra("msg_local_id", -1);
        this.f215993i = this.f215752d.f193286j.getBooleanExtra("from_global_search", false).booleanValue();
        this.f215994j = this.f215752d.f193286j.getBooleanExtra("from_date_search", false).booleanValue();
        this.f215752d.f193286j.getBooleanExtra("img_gallery_enter_from_chatting_ui", false).booleanValue();
        this.f215995n = this.f215752d.f193286j.getBooleanExtra("from_service_notify_content_search", false).booleanValue();
    }

    /* renamed from: i2 */
    public boolean mo102510i2() {
        return this.f215993i;
    }

    /* renamed from: k0 */
    public boolean mo102511k0() {
        return this.f216003v;
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        this.f216005x = true;
        C74339x2 x2Var = this.f216002u;
        if (x2Var != null) {
            x2Var.mo5580b();
        }
        C106742j1 j1Var = this.f215990f;
        if (j1Var != null) {
            j1Var.mo153849a();
        }
    }

    /* renamed from: r2 */
    public void mo102512r2() {
        boolean z;
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.f215989e == null);
        Log.m105927v("MicroMsg.ChattingUI.SearchComponent", "enter edit search mode, search stub view is null?%B", objArr);
        this.f216003v = true;
        this.f215752d.mo91547H(8);
        View view = this.f215989e;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C74339x2 x2Var = this.f216002u;
            if (x2Var != null) {
                x2Var.f218366o = this.f215752d.mo91577r();
            }
        } else {
            C73521l0.m86927d(this.f215752d.f193286j, C0966R.C0970id.f359132j50);
            View c = this.f215752d.mo91562c(C0966R.C0970id.j58);
            this.f215989e = c;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = c;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f216001t = this.f215752d.mo91562c(C0966R.C0970id.j4y);
            this.f215752d.mo91570k().setFocusable(false);
            this.f215752d.mo91570k().setFocusableInTouchMode(false);
            this.f216001t.setOnClickListener(new C44834b(this));
            View view4 = this.f216001t;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/component/SearchComponent", "enterEditSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f215999r = (TextView) this.f215752d.mo91562c(C0966R.C0970id.cj5);
            if (!this.f215752d.mo91582w()) {
                if (!((C79348e) this.f215752d.f193278b.mo102812a(C79348e.class)).mo70075s4()) {
                    z = false;
                    C74339x2 x2Var2 = new C74339x2(this.f215752d.mo91565f(), new C72963f4(), this.f215752d.mo91577r(), this.f215752d.mo91573n(), z);
                    this.f216002u = x2Var2;
                    x2Var2.f218370s = new C73535c();
                    ListView listView = (ListView) this.f215752d.mo91562c(C0966R.C0970id.j4z);
                    this.f216000s = listView;
                    listView.setVisibility(0);
                    this.f216000s.setAdapter(this.f216002u);
                    this.f216000s.setOnItemClickListener(new C73536d());
                    this.f216000s.setOnTouchListener(new C44833a());
                }
            }
            z = true;
            C74339x2 x2Var22 = new C74339x2(this.f215752d.mo91565f(), new C72963f4(), this.f215752d.mo91577r(), this.f215752d.mo91573n(), z);
            this.f216002u = x2Var22;
            x2Var22.f218370s = new C73535c();
            ListView listView2 = (ListView) this.f215752d.mo91562c(C0966R.C0970id.j4z);
            this.f216000s = listView2;
            listView2.setVisibility(0);
            this.f216000s.setAdapter(this.f216002u);
            this.f216000s.setOnItemClickListener(new C73536d());
            this.f216000s.setOnTouchListener(new C44833a());
        }
        mo102506R(-1);
    }

    /* renamed from: x2 */
    public boolean mo102513x2() {
        return this.f215992h;
    }
}
