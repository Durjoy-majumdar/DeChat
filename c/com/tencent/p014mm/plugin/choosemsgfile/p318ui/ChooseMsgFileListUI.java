package com.tencent.p014mm.plugin.choosemsgfile.p318ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92980d;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92981e;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92985f;
import com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.C92988g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import g11.C98065a;
import g11.C98068c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import qo3.C47883u;
import qo3.C77426q;
import qo3.C89779i0;
import wc3.C78538u;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI */
public class ChooseMsgFileListUI extends MMActivity implements C93015m {

    /* renamed from: q */
    public static final /* synthetic */ int f267824q = 0;

    /* renamed from: d */
    public String f267825d;

    /* renamed from: e */
    public String f267826e;

    /* renamed from: f */
    public int f267827f;

    /* renamed from: g */
    public String f267828g;

    /* renamed from: h */
    public C92985f f267829h;

    /* renamed from: i */
    public C98065a f267830i = new C98065a();

    /* renamed from: j */
    public TextView f267831j;

    /* renamed from: n */
    public RecyclerView f267832n;

    /* renamed from: o */
    public Button f267833o;

    /* renamed from: p */
    public ProgressDialog f267834p;

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI$a */
    public class C92995a implements MenuItem.OnMenuItemClickListener {
        public C92995a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ChooseMsgFileListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI$b */
    public class C92996b implements MenuItem.OnMenuItemClickListener {
        public C92996b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent();
            intent.putExtra("ERRMSG", "cancel");
            ChooseMsgFileListUI.this.setResult(1, intent);
            ChooseMsgFileListUI.this.finish();
            ChooseMsgFileListUI.this.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2469dt);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI$c */
    public class C92997c implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI$c$a */
        public class C92998a implements C47883u {
            public C92998a() {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
                Log.m105925i("MicroMsg.ChooseMsgFileListUI", "bOk:%b", Boolean.valueOf(z));
                if (z) {
                    ChooseMsgFileListUI chooseMsgFileListUI = ChooseMsgFileListUI.this;
                    int i = ChooseMsgFileListUI.f267824q;
                    chooseMsgFileListUI.getClass();
                    Intent intent = new Intent();
                    intent.putParcelableArrayListExtra("FILEPATHS", chooseMsgFileListUI.f267830i.mo137361a());
                    chooseMsgFileListUI.setResult(-1, intent);
                    chooseMsgFileListUI.finish();
                }
            }
        }

        public C92997c() {
        }

        public void onClick(View view) {
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C98065a aVar = ChooseMsgFileListUI.this.f267830i;
            synchronized (aVar) {
                Set<Long> set = aVar.f287514d;
                z = set != null && ((HashSet) set).size() > 0;
            }
            if (z) {
                C77426q qVar = new C77426q(ChooseMsgFileListUI.this);
                qVar.mo107595g(ChooseMsgFileListUI.this.getString(C0966R.string.bd9));
                qVar.mo107589a(true);
                qVar.mo107590b(new C92998a());
                qVar.mo107603o();
                C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ChooseMsgFileListUI chooseMsgFileListUI = ChooseMsgFileListUI.this;
            chooseMsgFileListUI.getClass();
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("FILEPATHS", chooseMsgFileListUI.f267830i.mo137361a());
            chooseMsgFileListUI.setResult(-1, intent);
            chooseMsgFileListUI.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI$d */
    public class C92999d implements Runnable {
        public C92999d() {
        }

        public void run() {
            ChooseMsgFileListUI chooseMsgFileListUI = ChooseMsgFileListUI.this;
            Button button = chooseMsgFileListUI.f267833o;
            Map<Long, C98065a.C98066a> map = chooseMsgFileListUI.f267830i.f287512b;
            boolean z = false;
            if ((map == null ? 0 : ((ConcurrentHashMap) map).size()) > 0) {
                z = true;
            }
            button.setEnabled(z);
        }
    }

    /* renamed from: H7 */
    public final void mo127407H7(boolean z) {
        Log.m105925i("MicroMsg.ChooseMsgFileListUI", "[setProgress] isVisible:%s", Boolean.valueOf(z));
        if (z) {
            this.f267834p = C89779i0.m112248e(this, getString(C0966R.string.gas), true, 0, (DialogInterface.OnCancelListener) null);
            return;
        }
        ProgressDialog progressDialog = this.f267834p;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f267834p.dismiss();
            this.f267834p = null;
        }
    }

    /* renamed from: P1 */
    public void mo127408P1() {
        MMHandlerThread.postToMainThread(new C92999d());
    }

    /* renamed from: Q3 */
    public C98065a mo127409Q3() {
        return this.f267830i;
    }

    /* renamed from: f */
    public void mo127410f(boolean z) {
        mo127407H7(true);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2469dt);
    }

    public View getChildAt(int i) {
        return this.f267832n.getChildAt(i);
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6999uj;
    }

    public String getUserName() {
        return this.f267825d;
    }

    public void initView() {
        this.f267831j = (TextView) findViewById(C0966R.C0970id.hjb);
        this.f267832n = (RecyclerView) findViewById(C0966R.C0970id.d0u);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.ecy);
        this.f267833o = (Button) findViewById(C0966R.C0970id.ka_);
    }

    /* renamed from: k */
    public void mo127413k(boolean z, int i) {
        mo127407H7(false);
        Log.m105925i("MicroMsg.ChooseMsgFileListUI", "[onDataLoaded] isFirst:%s addCount:%s", Boolean.valueOf(z), Integer.valueOf(i));
        if (i <= 0) {
            this.f267831j.setVisibility(0);
            this.f267832n.setVisibility(8);
            this.f267831j.setText(getString(C0966R.string.bdc));
            return;
        }
        this.f267831j.setVisibility(8);
        this.f267832n.setVisibility(0);
        this.f267832n.getAdapter().notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2469dt);
        String stringExtra = getIntent().getStringExtra("USERNAME");
        this.f267825d = stringExtra;
        this.f267826e = C98068c.m126681f(stringExtra);
        this.f267827f = getIntent().getIntExtra("COUNT", 9);
        this.f267828g = getIntent().getStringExtra("EXTENSION");
        Log.m105925i("MicroMsg.ChooseMsgFileListUI", "onCreate mCount:%d mExtension:%s", Integer.valueOf(this.f267827f), this.f267828g);
        this.f267829h = new C92985f(this);
        initView();
        findViewById(C0966R.C0970id.bru).setBackgroundColor(getContext().getResources().getColor(C0966R.color.f3250ks));
        this.f267832n.setBackgroundColor(getContext().getResources().getColor(C0966R.color.f3250ks));
        RecyclerView recyclerView = this.f267832n;
        C92985f fVar = this.f267829h;
        if (fVar.f267809f == null) {
            fVar.f267809f = new LinearLayoutManager(this);
        }
        recyclerView.setLayoutManager(fVar.f267809f);
        RecyclerView recyclerView2 = this.f267832n;
        C92985f fVar2 = this.f267829h;
        fVar2.getClass();
        recyclerView2.mo17085h0(new C92988g(fVar2));
        RecyclerView recyclerView3 = this.f267832n;
        C92985f fVar3 = this.f267829h;
        C92980d dVar = new C92980d(fVar3.f267798b, fVar3.f267808e);
        fVar3.f267807d = dVar;
        dVar.f267796g = new C92981e(fVar3);
        recyclerView3.setAdapter(dVar);
        this.f267832n.setHasFixedSize(true);
        setMMTitle(this.f267826e);
        setBackBtn(new C92995a());
        addTextOptionMenu(0, getString(C0966R.string.f7926wf), new C92996b());
        this.f267833o.setOnClickListener(new C92997c());
        C92985f fVar4 = this.f267829h;
        String str = this.f267828g;
        fVar4.getClass();
        Log.m105925i("MicroMsg.BaseChooseMsgFileUIController", "onCreate type:%s extension:%s", "file", str);
        fVar4.mo127402b(true, "file", str);
        C78538u.m94868d(this);
        this.f267830i.mo137362b(this.f267827f);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f267829h.getClass();
        Log.m105924i("MicroMsg.BaseChooseMsgFileUIController", "onDestroy");
        C98065a aVar = this.f267830i;
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
        this.f267829h.getClass();
        Log.m105924i("MicroMsg.BaseChooseMsgFileUIController", "onPause");
    }

    public void onResume() {
        super.onResume();
        this.f267829h.getClass();
        Log.m105924i("MicroMsg.BaseChooseMsgFileUIController", "onResume");
    }
}
