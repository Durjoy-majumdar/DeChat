package com.tencent.p014mm.p136ui.chatting;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import g62.C75875l;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import p262wm.C22923f;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachFileListUI */
public class AppAttachFileListUI extends MMActivity implements C75875l.C75877b {

    /* renamed from: d */
    public ArrayList<C19713f> f55964d;

    /* renamed from: e */
    public HashSet<Long> f55965e;

    /* renamed from: f */
    public ListView f55966f;

    /* renamed from: g */
    public C19712e f55967g;

    /* renamed from: h */
    public boolean f55968h = true;

    /* renamed from: i */
    public boolean f55969i = false;

    /* renamed from: j */
    public View f55970j;

    /* renamed from: n */
    public int f55971n;

    /* renamed from: o */
    public AdapterView.OnItemClickListener f55972o = new C6769b();

    /* renamed from: p */
    public AbsListView.OnScrollListener f55973p = new C19710c();

    /* renamed from: com.tencent.mm.ui.chatting.AppAttachFileListUI$b */
    public class C6769b implements AdapterView.OnItemClickListener {
        public C6769b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachFileListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            Intent intent = new Intent();
            intent.setClassName(AppAttachFileListUI.this, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
            intent.putExtra("app_msg_id", AppAttachFileListUI.this.f55964d.get(i).f55978a.getMsgId());
            intent.setFlags(67108864);
            AppAttachFileListUI appAttachFileListUI = AppAttachFileListUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AppAttachFileListUI appAttachFileListUI2 = appAttachFileListUI;
            C117292a.m165358d(appAttachFileListUI2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/AppAttachFileListUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            appAttachFileListUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appAttachFileListUI2, "com/tencent/mm/ui/chatting/AppAttachFileListUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppAttachFileListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.AppAttachFileListUI$a */
    public class C19709a implements MenuItem.OnMenuItemClickListener {
        public C19709a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AppAttachFileListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.AppAttachFileListUI$c */
    public class C19710c implements AbsListView.OnScrollListener {
        public C19710c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachFileListUI$3", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppAttachFileListUI$3", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/AppAttachFileListUI$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 0) {
                AppAttachFileListUI appAttachFileListUI = AppAttachFileListUI.this;
                if (!appAttachFileListUI.f55969i && appAttachFileListUI.f55968h && absListView.getLastVisiblePosition() == AppAttachFileListUI.this.f55967g.getCount()) {
                    Log.m105918d("MicroMsg.AppAttachFileListUI", "need to add item");
                    int i2 = AppAttachFileListUI.this.f55971n;
                    new C19711d((C19709a) null).execute(new Integer[]{Integer.valueOf(i2), 20});
                    AppAttachFileListUI appAttachFileListUI2 = AppAttachFileListUI.this;
                    appAttachFileListUI2.getClass();
                    Log.m105918d("MicroMsg.AppAttachFileListUI", "start to load");
                    appAttachFileListUI2.f55969i = true;
                    View view = appAttachFileListUI2.f55970j;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/AppAttachFileListUI", "startToLoad", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/AppAttachFileListUI", "startToLoad", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppAttachFileListUI$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.AppAttachFileListUI$d */
    public class C19711d extends AsyncTask<Integer, Integer, List<C72963f4>> {
        public C19711d(C19709a aVar) {
        }

        public Object doInBackground(Object[] objArr) {
            Integer[] numArr = (Integer[]) objArr;
            int intValue = numArr[0].intValue();
            int intValue2 = numArr[1].intValue();
            List<C72963f4> gY = ((C72972g4) C97625j3.m125812b().mo105911z()).mo101117gY(C75592q0.m90789s(), intValue, intValue2);
            AppAttachFileListUI.this.f55971n += intValue2;
            return gY;
        }

        public void onPostExecute(Object obj) {
            List list = (List) obj;
            super.onPostExecute(list);
            AppAttachFileListUI appAttachFileListUI = AppAttachFileListUI.this;
            appAttachFileListUI.f55969i = false;
            View view = appAttachFileListUI.f55970j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/AppAttachFileListUI", "stopToLoad", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/AppAttachFileListUI", "stopToLoad", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Log.m105918d("MicroMsg.AppAttachFileListUI", "stop to load");
            AppAttachFileListUI.this.mo26105I7(list);
            AppAttachFileListUI.this.f55967g.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.AppAttachFileListUI$e */
    public class C19712e extends BaseAdapter {
        public C19712e(C19709a aVar) {
        }

        public int getCount() {
            return AppAttachFileListUI.this.f55964d.size();
        }

        public Object getItem(int i) {
            return AppAttachFileListUI.this.f55964d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C19714g gVar;
            if (view == null) {
                view = AppAttachFileListUI.this.getLayoutInflater().inflate(C0966R.C0971layout.f6374d4, viewGroup, false);
                Assert.assertNotNull(view);
                gVar = new C19714g(AppAttachFileListUI.this, (C19709a) null);
                gVar.f55980a = (MMImageView) view.findViewById(C0966R.C0970id.d0o);
                gVar.f55981b = (TextView) view.findViewById(C0966R.C0970id.d0q);
                gVar.f55982c = (TextView) view.findViewById(C0966R.C0970id.d0n);
                gVar.f55983d = (TextView) view.findViewById(C0966R.C0970id.d0p);
                view.setTag(gVar);
            } else {
                gVar = (C19714g) view.getTag();
            }
            Assert.assertNotNull(gVar);
            C19713f fVar = (C19713f) AppAttachFileListUI.this.f55964d.get(i);
            gVar.f55981b.setText(fVar.f55979b.f195570f);
            gVar.f55982c.setText(String.format("大小：%s，来自：%s", new Object[]{Util.getSizeKB((long) fVar.f55979b.f195594l), fVar.f55978a.mo108769t2() == 1 ? "自己" : ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(fVar.f55979b.f195488G)}));
            gVar.f55983d.setText(C72715f.m85112e(AppAttachFileListUI.this, fVar.f55978a.getCreateTime(), true));
            gVar.f55980a.setImageResource(((C22923f) C86312j.m106911c(C22923f.class)).mo35908u8(fVar.f55979b.f195602n));
            return view;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.AppAttachFileListUI$f */
    public class C19713f {

        /* renamed from: a */
        public C72963f4 f55978a;

        /* renamed from: b */
        public C68070l.C68072b f55979b;

        public C19713f(AppAttachFileListUI appAttachFileListUI, C19709a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.AppAttachFileListUI$g */
    public class C19714g {

        /* renamed from: a */
        public MMImageView f55980a;

        /* renamed from: b */
        public TextView f55981b;

        /* renamed from: c */
        public TextView f55982c;

        /* renamed from: d */
        public TextView f55983d;

        public C19714g(AppAttachFileListUI appAttachFileListUI, C19709a aVar) {
        }
    }

    /* renamed from: I7 */
    public final void mo26105I7(List<C72963f4> list) {
        if (list.size() < 20) {
            this.f55968h = false;
            this.f55966f.removeFooterView(this.f55970j);
        }
        for (C72963f4 next : list) {
            C19713f fVar = null;
            C68070l.C68072b u = C68070l.C68072b.m80422u(next.getContent(), (String) null);
            if (u != null) {
                C19713f fVar2 = new C19713f(this, (C19709a) null);
                fVar2.f55978a = next;
                fVar2.f55979b = u;
                fVar = fVar2;
            }
            if (fVar != null && fVar.f55979b.f195582i == 6 && this.f55965e.add(Long.valueOf(next.getMsgId()))) {
                this.f55964d.add(fVar);
            }
        }
        Log.m105919d("MicroMsg.AppAttachFileListUI", "append file item list size %d, current total size is %d", Integer.valueOf(list.size()), Integer.valueOf(this.f55964d.size()));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6375d5;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.cv6);
        setBackBtn(new C19709a());
        this.f55966f = (ListView) findViewById(C0966R.C0970id.d0r);
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.f6373d3, (ViewGroup) null);
        this.f55970j = inflate;
        this.f55966f.addFooterView(inflate);
        View view = this.f55970j;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/AppAttachFileListUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/AppAttachFileListUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f55964d = new ArrayList<>();
        this.f55965e = new HashSet<>();
        List<C72963f4> gY = ((C72972g4) C97625j3.m125812b().mo105911z()).mo101117gY(C75592q0.m90789s(), 0, 20);
        this.f55971n += 20;
        mo26105I7(gY);
        C19712e eVar = new C19712e((C19709a) null);
        this.f55967g = eVar;
        this.f55966f.setAdapter(eVar);
        this.f55966f.setOnItemClickListener(this.f55972o);
        this.f55966f.setOnScrollListener(this.f55973p);
        ((C72972g4) C97625j3.m125812b().mo105911z()).mo101137qq(this, getMainLooper());
    }

    public void onDestroy() {
        ((C72972g4) C97625j3.m125812b().mo105911z()).sy0(this);
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: w5 */
    public void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
        if ("insert".equals(eVar.f123845b)) {
            Log.m105918d("MicroMsg.AppAttachFileListUI", "reveive a msg");
            int size = eVar.f123846c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C72963f4 f4Var = eVar.f123846c.get(size);
                if (f4Var.mo101020w3()) {
                    C19713f fVar = null;
                    C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
                    if (u != null) {
                        C19713f fVar2 = new C19713f(this, (C19709a) null);
                        fVar2.f55978a = f4Var;
                        fVar2.f55979b = u;
                        fVar = fVar2;
                    }
                    if (fVar != null && fVar.f55979b.f195582i == 6) {
                        this.f55964d.add(0, fVar);
                    }
                }
            }
            C19712e eVar2 = this.f55967g;
            if (eVar2 != null) {
                eVar2.notifyDataSetChanged();
            }
        }
    }
}
