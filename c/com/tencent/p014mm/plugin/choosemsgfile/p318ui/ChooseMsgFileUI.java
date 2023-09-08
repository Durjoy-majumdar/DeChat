package com.tencent.p014mm.plugin.choosemsgfile.p318ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C68799i;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92977a;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92979c;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92989h;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92993j;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.ChooseMsgFileUIController;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import f11.C97792a;
import g11.C98065a;
import g11.C98068c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k20.C60958c;
import k20.C9556a;
import qo3.C47883u;
import qo3.C77407n;
import qo3.C77426q;
import qo3.C89779i0;
import wc3.C78538u;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI */
public class ChooseMsgFileUI extends MMActivity implements C93015m {

    /* renamed from: y */
    public static final /* synthetic */ int f267840y = 0;

    /* renamed from: d */
    public String f267841d;

    /* renamed from: e */
    public String f267842e;

    /* renamed from: f */
    public String f267843f;

    /* renamed from: g */
    public int f267844g;

    /* renamed from: h */
    public String f267845h;

    /* renamed from: i */
    public ChooseMsgFileUIController f267846i;

    /* renamed from: j */
    public C98065a f267847j = new C98065a();

    /* renamed from: n */
    public TextView f267848n;

    /* renamed from: o */
    public TextView f267849o;

    /* renamed from: p */
    public RecyclerView f267850p;

    /* renamed from: q */
    public TextView f267851q;

    /* renamed from: r */
    public TextView f267852r;

    /* renamed from: s */
    public ImageButton f267853s;

    /* renamed from: t */
    public TextView f267854t;

    /* renamed from: u */
    public Button f267855u;

    /* renamed from: v */
    public ProgressDialog f267856v;

    /* renamed from: w */
    public boolean f267857w = true;

    /* renamed from: x */
    public int f267858x;

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI$a */
    public class C93000a implements Runnable {
        public C93000a() {
        }

        public void run() {
            ChooseMsgFileUI chooseMsgFileUI = ChooseMsgFileUI.this;
            Button button = chooseMsgFileUI.f267855u;
            Map<Long, C98065a.C98066a> map = chooseMsgFileUI.f267847j.f287512b;
            boolean z = false;
            if ((map == null ? 0 : ((ConcurrentHashMap) map).size()) > 0) {
                z = true;
            }
            button.setEnabled(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI$b */
    public class C93001b implements MenuItem.OnMenuItemClickListener {
        public C93001b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ChooseMsgFileUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI$c */
    public class C93002c implements MenuItem.OnMenuItemClickListener {
        public C93002c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent();
            intent.putExtra("ERRMSG", "cancel");
            ChooseMsgFileUI.this.setResult(1, intent);
            ChooseMsgFileUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI$d */
    public class C93003d implements View.OnClickListener {
        public C93003d() {
        }

        public void onClick(View view) {
            ArrayList arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(view);
            Object[] array = arrayList2.toArray();
            arrayList2.clear();
            C117292a.m165356b("com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C98065a aVar = ChooseMsgFileUI.this.f267847j;
            aVar.f287513c = !aVar.f287513c;
            Map<Long, C98065a.C98066a> map = aVar.f287512b;
            if (map == null || ((ConcurrentHashMap) map).size() == 0) {
                Log.m105920e("MicroMsg.ChooseMsgFileHelper", "msgIdToFilePath is null, return");
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList();
                for (C98065a.C98066a add : ((ConcurrentHashMap) aVar.f287512b).values()) {
                    arrayList.add(add);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C98065a.C98066a aVar2 = (C98065a.C98066a) it.next();
                C97792a aVar3 = aVar2.f287516b;
                RecyclerView.C16631z I0 = ChooseMsgFileUI.this.f267850p.mo17023I0(aVar2.f287517c);
                C92993j.C92994a aVar4 = ((C92977a) aVar3.f286877a).f267796g;
                if (aVar4 != null) {
                    aVar4.mo127394a(true, aVar3, I0);
                }
            }
            ChooseMsgFileUI chooseMsgFileUI = ChooseMsgFileUI.this;
            if (chooseMsgFileUI.f267847j.f287513c) {
                chooseMsgFileUI.f267853s.setImageResource(C0966R.raw.radio_on);
            } else {
                chooseMsgFileUI.f267853s.setImageResource(C0966R.raw.radio_off);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI$e */
    public class C93004e implements View.OnClickListener {
        public C93004e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ChooseMsgFileUI.this.f267853s.performClick();
            C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI$f */
    public class C93005f implements View.OnClickListener {
        public C93005f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ChooseMsgFileUI.m117315H7(ChooseMsgFileUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI$g */
    public class C93006g implements View.OnClickListener {
        public C93006g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ChooseMsgFileUI.m117315H7(ChooseMsgFileUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI$h */
    public class C93007h implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI$h$a */
        public class C93008a implements C47883u {
            public C93008a() {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
                Log.m105925i("MicroMsg.ChooseMsgFileUI", "bOk:%b", Boolean.valueOf(z));
                if (z) {
                    ChooseMsgFileUI chooseMsgFileUI = ChooseMsgFileUI.this;
                    int i = ChooseMsgFileUI.f267840y;
                    chooseMsgFileUI.getClass();
                    Intent intent = new Intent();
                    intent.putParcelableArrayListExtra("FILEPATHS", chooseMsgFileUI.f267847j.mo137361a());
                    chooseMsgFileUI.setResult(-1, intent);
                    chooseMsgFileUI.finish();
                }
            }
        }

        public C93007h() {
        }

        public void onClick(View view) {
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C98065a aVar = ChooseMsgFileUI.this.f267847j;
            synchronized (aVar) {
                Set<Long> set = aVar.f287514d;
                z = set != null && ((HashSet) set).size() > 0;
            }
            if (z) {
                C77426q qVar = new C77426q(ChooseMsgFileUI.this);
                qVar.mo107595g(ChooseMsgFileUI.this.getString(C0966R.string.bd9));
                qVar.mo107589a(true);
                qVar.mo107590b(new C93008a());
                qVar.mo107603o();
                C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ChooseMsgFileUI chooseMsgFileUI = ChooseMsgFileUI.this;
            chooseMsgFileUI.getClass();
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("FILEPATHS", chooseMsgFileUI.f267847j.mo137361a());
            chooseMsgFileUI.setResult(-1, intent);
            chooseMsgFileUI.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static void m117315H7(ChooseMsgFileUI chooseMsgFileUI) {
        C77407n nVar = new C77407n((Context) chooseMsgFileUI.getContext(), 1, false);
        nVar.f225771i = new C93013g(chooseMsgFileUI);
        nVar.f225782p = new C93014h(chooseMsgFileUI);
        nVar.mo107573q();
    }

    /* renamed from: I7 */
    public final void mo127418I7(boolean z, String str) {
        Log.m105925i("MicroMsg.ChooseMsgFileUI", "[setProgress] isVisible:%s", Boolean.valueOf(z));
        if (z) {
            if (str == null) {
                str = getString(C0966R.string.gas);
            }
            this.f267856v = C89779i0.m112248e(this, str, true, 0, (DialogInterface.OnCancelListener) null);
            return;
        }
        ProgressDialog progressDialog = this.f267856v;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f267856v.dismiss();
            this.f267856v = null;
        }
    }

    /* renamed from: J7 */
    public final void mo127419J7(String str) {
        if ("image".equals(str) || "video".equals(str) || "all".equals(str)) {
            this.f267853s.setVisibility(0);
            this.f267854t.setVisibility(0);
        } else {
            this.f267853s.setVisibility(4);
            this.f267854t.setVisibility(4);
        }
        if ("all".equals(this.f267843f)) {
            this.f267851q.setVisibility(0);
            this.f267852r.setVisibility(0);
            if ("all".equals(str)) {
                this.f267852r.setText("");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            if ("image".equals(str)) {
                sb.append(getString(C0966R.string.bdg));
            } else if ("video".equals(str)) {
                sb.append(getString(C0966R.string.bdh));
            } else if ("file".equals(str)) {
                sb.append(getString(C0966R.string.bdf));
            }
            sb.append(")");
            this.f267852r.setText(sb.toString());
            return;
        }
        this.f267851q.setVisibility(4);
        this.f267852r.setVisibility(4);
    }

    /* renamed from: P1 */
    public void mo127408P1() {
        MMHandlerThread.postToMainThread(new C93000a());
    }

    /* renamed from: Q3 */
    public C98065a mo127409Q3() {
        return this.f267847j;
    }

    /* renamed from: f */
    public void mo127410f(boolean z) {
        if (z) {
            mo127418I7(true, (String) null);
        } else {
            this.f267858x = ((GridLayoutManager) this.f267850p.getLayoutManager()).mo16959E();
        }
    }

    public View getChildAt(int i) {
        return this.f267850p.getChildAt(i);
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7000uk;
    }

    public String getUserName() {
        return this.f267841d;
    }

    public void initView() {
        this.f267848n = (TextView) findViewById(C0966R.C0970id.hjb);
        this.f267849o = (TextView) findViewById(C0966R.C0970id.f357828bz0);
        this.f267850p = (RecyclerView) findViewById(C0966R.C0970id.d0u);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.ecy);
        this.f267851q = (TextView) findViewById(C0966R.C0970id.d2q);
        this.f267852r = (TextView) findViewById(C0966R.C0970id.d2t);
        this.f267853s = (ImageButton) findViewById(C0966R.C0970id.hpm);
        this.f267854t = (TextView) findViewById(C0966R.C0970id.hpo);
        this.f267855u = (Button) findViewById(C0966R.C0970id.ka_);
    }

    /* renamed from: k */
    public void mo127413k(boolean z, int i) {
        Log.m105925i("MicroMsg.ChooseMsgFileUI", "[onDataLoaded] isFirst:%s addCount:%s", Boolean.valueOf(z), Integer.valueOf(i));
        if (z) {
            mo127418I7(false, (String) null);
            this.f267850p.getAdapter().notifyDataSetChanged();
            int itemCount = this.f267850p.getAdapter().getItemCount();
            RecyclerView recyclerView = this.f267850p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(itemCount - 1));
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
            if (i <= 0) {
                this.f267848n.setVisibility(0);
                this.f267850p.setVisibility(8);
                this.f267848n.setText(getString(C0966R.string.bdc));
                return;
            }
            this.f267848n.setVisibility(8);
            this.f267850p.setVisibility(0);
        } else if (i > 0) {
            this.f267850p.getAdapter().notifyItemRangeInserted(0, i);
            this.f267850p.getAdapter().notifyItemRangeChanged(i, this.f267858x + i);
        } else {
            this.f267850p.getAdapter().notifyItemChanged(0);
        }
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("USERNAME");
        this.f267841d = stringExtra;
        this.f267842e = C98068c.m126681f(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("TYPE");
        if (Util.isNullOrNil(stringExtra2)) {
            Log.m105924i("MicroMsg.MsgFileUtils", "type is null, use default type");
        } else if ("all".equals(stringExtra2) || "image".equals(stringExtra2) || "video".equals(stringExtra2) || "file".equals(stringExtra2)) {
            Log.m105924i("MicroMsg.MsgFileUtils", "type is invalid, use default type");
            this.f267843f = stringExtra2;
            this.f267844g = getIntent().getIntExtra("COUNT", 9);
            this.f267845h = getIntent().getStringExtra("EXTENSION");
            Log.m105925i("MicroMsg.ChooseMsgFileUI", "select msg file from username:%s nickname:%s, type:%s, count:%d", this.f267841d, this.f267842e, this.f267843f, Integer.valueOf(this.f267844g));
            Log.m105925i("MicroMsg.ChooseMsgFileUI", "select msg file from extension:%s", this.f267845h);
            this.f267847j.mo137362b(this.f267844g);
            this.f267846i = new ChooseMsgFileUIController(this);
            initView();
            this.f267850p.setLayoutManager(this.f267846i.mo127388b(this));
            RecyclerView recyclerView = this.f267850p;
            ChooseMsgFileUIController chooseMsgFileUIController = this.f267846i;
            chooseMsgFileUIController.getClass();
            recyclerView.mo17085h0(new C68799i(chooseMsgFileUIController, this));
            RecyclerView recyclerView2 = this.f267850p;
            ChooseMsgFileUIController chooseMsgFileUIController2 = this.f267846i;
            C92979c cVar = new C92979c(chooseMsgFileUIController2.f267798b, chooseMsgFileUIController2.f267799c);
            chooseMsgFileUIController2.f267780d = cVar;
            cVar.f267796g = new C92989h(chooseMsgFileUIController2);
            recyclerView2.setAdapter(cVar);
            this.f267850p.setHasFixedSize(true);
            this.f267850p.mo17043c(new C93010e(this));
            setMMTitle(this.f267842e);
            setBackBtn(new C93001b());
            addTextOptionMenu(0, getString(C0966R.string.f7926wf), new C93002c());
            this.f267853s.setOnClickListener(new C93003d());
            this.f267854t.setOnClickListener(new C93004e());
            this.f267851q.setOnClickListener(new C93005f());
            this.f267852r.setOnClickListener(new C93006g());
            this.f267855u.setOnClickListener(new C93007h());
            ChooseMsgFileUIController chooseMsgFileUIController3 = this.f267846i;
            String str = this.f267843f;
            String str2 = this.f267845h;
            chooseMsgFileUIController3.getClass();
            Log.m105924i("MicroMsg.ChooseMsgFileUIController", "onCreate");
            chooseMsgFileUIController3.f267781e.alive();
            chooseMsgFileUIController3.mo127389c(true, str, str2);
            mo127419J7(this.f267843f);
            C78538u.m94868d(this);
        }
        stringExtra2 = "all";
        this.f267843f = stringExtra2;
        this.f267844g = getIntent().getIntExtra("COUNT", 9);
        this.f267845h = getIntent().getStringExtra("EXTENSION");
        Log.m105925i("MicroMsg.ChooseMsgFileUI", "select msg file from username:%s nickname:%s, type:%s, count:%d", this.f267841d, this.f267842e, this.f267843f, Integer.valueOf(this.f267844g));
        Log.m105925i("MicroMsg.ChooseMsgFileUI", "select msg file from extension:%s", this.f267845h);
        this.f267847j.mo137362b(this.f267844g);
        this.f267846i = new ChooseMsgFileUIController(this);
        initView();
        this.f267850p.setLayoutManager(this.f267846i.mo127388b(this));
        RecyclerView recyclerView3 = this.f267850p;
        ChooseMsgFileUIController chooseMsgFileUIController4 = this.f267846i;
        chooseMsgFileUIController4.getClass();
        recyclerView3.mo17085h0(new C68799i(chooseMsgFileUIController4, this));
        RecyclerView recyclerView22 = this.f267850p;
        ChooseMsgFileUIController chooseMsgFileUIController22 = this.f267846i;
        C92979c cVar2 = new C92979c(chooseMsgFileUIController22.f267798b, chooseMsgFileUIController22.f267799c);
        chooseMsgFileUIController22.f267780d = cVar2;
        cVar2.f267796g = new C92989h(chooseMsgFileUIController22);
        recyclerView22.setAdapter(cVar2);
        this.f267850p.setHasFixedSize(true);
        this.f267850p.mo17043c(new C93010e(this));
        setMMTitle(this.f267842e);
        setBackBtn(new C93001b());
        addTextOptionMenu(0, getString(C0966R.string.f7926wf), new C93002c());
        this.f267853s.setOnClickListener(new C93003d());
        this.f267854t.setOnClickListener(new C93004e());
        this.f267851q.setOnClickListener(new C93005f());
        this.f267852r.setOnClickListener(new C93006g());
        this.f267855u.setOnClickListener(new C93007h());
        ChooseMsgFileUIController chooseMsgFileUIController32 = this.f267846i;
        String str3 = this.f267843f;
        String str22 = this.f267845h;
        chooseMsgFileUIController32.getClass();
        Log.m105924i("MicroMsg.ChooseMsgFileUIController", "onCreate");
        chooseMsgFileUIController32.f267781e.alive();
        chooseMsgFileUIController32.mo127389c(true, str3, str22);
        mo127419J7(this.f267843f);
        C78538u.m94868d(this);
    }

    public void onDestroy() {
        super.onDestroy();
        ChooseMsgFileUIController chooseMsgFileUIController = this.f267846i;
        chooseMsgFileUIController.getClass();
        Log.m105924i("MicroMsg.ChooseMsgFileUIController", "onDestroy");
        chooseMsgFileUIController.f267781e.dead();
        C98065a aVar = this.f267847j;
        synchronized (aVar) {
            Log.m105924i("MicroMsg.ChooseMsgFileHelper", "uninit");
            ((ConcurrentHashMap) aVar.f287512b).clear();
            aVar.f287512b = null;
            ((HashSet) aVar.f287514d).clear();
            aVar.f287514d = null;
        }
    }

    public void onPause() {
        super.onPause();
        this.f267846i.getClass();
        Log.m105924i("MicroMsg.ChooseMsgFileUIController", "onPause");
    }

    public void onResume() {
        super.onResume();
        ChooseMsgFileUIController chooseMsgFileUIController = this.f267846i;
        chooseMsgFileUIController.getClass();
        Log.m105924i("MicroMsg.ChooseMsgFileUIController", "onResume");
        chooseMsgFileUIController.f267780d.notifyDataSetChanged();
    }
}
