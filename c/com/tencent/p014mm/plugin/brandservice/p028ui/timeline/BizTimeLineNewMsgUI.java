package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.storage.C19607d1;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.p0$$f;
import com.tencent.p014mm.storage.p0$$g;
import com.tencent.xweb.WCWebUpdater;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C11184p0;
import rb0.C48009v0;
import uo3.C78253a;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI */
public class BizTimeLineNewMsgUI extends MMActivity implements C92953s4 {

    /* renamed from: d */
    public TextView f50186d;

    /* renamed from: e */
    public ListView f50187e;

    /* renamed from: f */
    public View f50188f;

    /* renamed from: g */
    public ProgressBar f50189g;

    /* renamed from: h */
    public TextView f50190h;

    /* renamed from: i */
    public View f50191i;

    /* renamed from: j */
    public View f50192j;

    /* renamed from: n */
    public View f50193n;

    /* renamed from: o */
    public C18193c3 f50194o;

    /* renamed from: p */
    public int f50195p = 1;

    /* renamed from: q */
    public int f50196q = 0;

    /* renamed from: r */
    public int f50197r = 0;

    /* renamed from: s */
    public C78253a f50198s;

    /* renamed from: t */
    public C19623o0 f50199t;

    /* renamed from: u */
    public int f50200u = 0;

    /* renamed from: v */
    public long f50201v = 0;

    /* renamed from: w */
    public C11184p0 f50202w = new C18176b();

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI$b */
    public class C18176b implements C11184p0 {
        public C18176b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 1 && BizTimeLineNewMsgUI.this.f50199t != null) {
                C48009v0.Kx0().mo25732Lo(BizTimeLineNewMsgUI.this.f50199t.field_msgId);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI$a */
    public class C18177a implements MenuItem.OnMenuItemClickListener {
        public C18177a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BizTimeLineNewMsgUI.this.finish();
            return true;
        }
    }

    /* renamed from: D4 */
    public void mo22778D4() {
        C18193c3 c3Var = this.f50194o;
        if (c3Var != null) {
            c3Var.notifyDataSetChanged();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6606jj;
    }

    public void onCreate(Bundle bundle) {
        List<C19623o0> list;
        super.onCreate(bundle);
        TextView textView = (TextView) mo176895$(C0966R.C0970id.f357933cj2);
        this.f50186d = textView;
        textView.setText(C0966R.string.aoj);
        setMMTitle(getString(C0966R.string.api));
        this.f50200u = getIntent().getIntExtra("biz_time_line_line_session_id", 0);
        this.f50201v = System.currentTimeMillis() / 1000;
        int intExtra = getIntent().getIntExtra("biz_time_line_line_enter_scene", 1);
        this.f50195p = intExtra;
        if (intExtra == 1) {
            C19607d1 Kx0 = C48009v0.Kx0();
            list = Kx0.mo25736Yt(Kx0.f55477d.query("BizTimeLineSingleMsgInfo", (String[]) null, "status!=?", new String[]{WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL}, (String) null, (String) null, "createTime DESC "));
        } else {
            C19607d1 Kx02 = C48009v0.Kx0();
            list = Kx02.mo25736Yt(Kx02.f55477d.query("BizTimeLineSingleMsgInfo", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "createTime DESC limit 20"));
        }
        this.f50194o = new C18193c3(this, list, this.f50195p, this.f50200u, this.f50201v);
        ListView listView = (ListView) mo176895$(C0966R.C0970id.ae5);
        this.f50187e = listView;
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.f6599jc, (ViewGroup) null);
        this.f50188f = inflate;
        this.f50189g = (ProgressBar) inflate.findViewById(C0966R.C0970id.f357543ae1);
        this.f50190h = (TextView) this.f50188f.findViewById(C0966R.C0970id.f357544ae2);
        this.f50191i = this.f50188f.findViewById(C0966R.C0970id.agz);
        this.f50192j = this.f50188f.findViewById(C0966R.C0970id.f357542ae0);
        this.f50193n = this.f50188f.findViewById(C0966R.C0970id.ae9);
        listView.addFooterView(this.f50188f);
        this.f50187e.setAdapter(this.f50194o);
        this.f50187e.setFooterDividersEnabled(false);
        this.f50187e.setOnScrollListener(new C2094d3(this));
        this.f50187e.setOnItemClickListener(new C18198e3(this));
        this.f50187e.setEmptyView(this.f50186d);
        if (this.f50195p == 1 && this.f50188f != null) {
            this.f50189g.setVisibility(8);
            this.f50190h.setText(getString(C0966R.string.aph));
            this.f50188f.setBackgroundResource(C0966R.C0969drawable.f4582gy);
            View view = this.f50191i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI", "showMoreData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineNewMsgUI", "showMoreData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f50188f.setOnClickListener(new C68773h3(this));
        }
        this.f50187e.setOnTouchListener(new C68772f3(this));
        this.f50198s = new C78253a(this);
        this.f50187e.setOnItemLongClickListener(new C18200g3(this));
        setBackBtn(new C18177a());
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 1, 0, C0966R.string.aog);
    }

    public void onDestroy() {
        super.onDestroy();
        C18193c3 c3Var = this.f50194o;
        c3Var.getClass();
        C19607d1 Kx0 = C48009v0.Kx0();
        Kx0.f55478e.remove(c3Var.f50282j);
        C19607d1 Kx02 = C48009v0.Kx0();
        Kx02.f55477d.execSQL("BizTimeLineSingleMsgInfo", "update BizTimeLineSingleMsgInfo set status = 4 where status != 4");
        p0$$f p0__f = new p0$$f();
        p0__f.f55562a = p0$$g.UPDATE;
        Kx02.mo25739jo(p0__f);
    }

    public void onPause() {
        super.onPause();
        this.f50194o.getClass();
    }

    public void onResume() {
        super.onResume();
    }
}
