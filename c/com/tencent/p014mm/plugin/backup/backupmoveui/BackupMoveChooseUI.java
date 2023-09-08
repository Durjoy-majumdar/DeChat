package com.tencent.p014mm.plugin.backup.backupmoveui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import av0.C16686a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.widget.dialog.MMFilterDialog;
import com.tencent.p014mm.p136ui.widget.picker.C19877i;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import cv0.C20365c;
import cv0.d$$a;
import cv0.d$$b;
import cv0.d$$c;
import cv0.d$$i;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import nj3.C88989a;
import qv0.C101303d;
import qv0.C101304e;
import yu0.C102912i;
import yu0.C102913k;
import yu0.C23368l;
import zu0.d$$d;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI */
public class BackupMoveChooseUI extends MMWizardActivity {

    /* renamed from: H */
    public static final /* synthetic */ int f49974H = 0;

    /* renamed from: A */
    public long f49975A;

    /* renamed from: B */
    public TextView f49976B;

    /* renamed from: C */
    public TextView f49977C;

    /* renamed from: D */
    public View f49978D;

    /* renamed from: E */
    public boolean f49979E = false;

    /* renamed from: F */
    public MMFilterDialog.C74986g.C74987a f49980F = new MMFilterDialog.C74986g.C74987a("", false);

    /* renamed from: G */
    public d$$d f49981G = new C18072b();

    /* renamed from: e */
    public C20365c f49982e = new C20365c(this);

    /* renamed from: f */
    public ListView f49983f;

    /* renamed from: g */
    public TextView f49984g;

    /* renamed from: h */
    public TextView f49985h;

    /* renamed from: i */
    public ProgressBar f49986i;

    /* renamed from: j */
    public View f49987j;

    /* renamed from: n */
    public MMFilterDialog f49988n;

    /* renamed from: o */
    public LinearLayout f49989o;

    /* renamed from: p */
    public LinearLayout f49990p;

    /* renamed from: q */
    public TextView f49991q;

    /* renamed from: r */
    public TextView f49992r;

    /* renamed from: s */
    public TextView f49993s;

    /* renamed from: t */
    public Button f49994t;

    /* renamed from: u */
    public int f49995u = 0;

    /* renamed from: v */
    public int f49996v = 0;

    /* renamed from: w */
    public long f49997w;

    /* renamed from: x */
    public long f49998x;

    /* renamed from: y */
    public SimpleDateFormat f49999y = new SimpleDateFormat("yyyy.MM.dd");

    /* renamed from: z */
    public long f50000z;

    /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI$a */
    public class C18071a implements View.OnClickListener {
        public C18071a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (BackupMoveChooseUI.this.mo22640P7().f296805s) {
                C20365c cVar = BackupMoveChooseUI.this.f49982e;
                if (cVar.f57045e.size() == cVar.getCount()) {
                    cVar.f57045e.clear();
                } else {
                    for (int i = 0; i < cVar.getCount(); i++) {
                        cVar.f57045e.add(Integer.valueOf(i));
                    }
                }
                cVar.notifyDataSetChanged();
                cVar.f57044d.mo22642R7(cVar.f57045e);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI$b */
    public class C18072b implements d$$d {
        public C18072b() {
        }

        /* renamed from: N1 */
        public void mo22649N1(LinkedList<C102912i> linkedList) {
            if (linkedList != null) {
                if (linkedList.size() == 0) {
                    BackupMoveChooseUI.this.f49986i.setVisibility(8);
                    BackupMoveChooseUI.this.f49985h.setVisibility(0);
                    BackupMoveChooseUI backupMoveChooseUI = BackupMoveChooseUI.this;
                    int i = backupMoveChooseUI.f49995u;
                    if (i == 0) {
                        backupMoveChooseUI.f49985h.setText(C0966R.string.aa5);
                    } else if (i == 1) {
                        backupMoveChooseUI.f49985h.setText(C0966R.string.ae6);
                    }
                } else {
                    BackupMoveChooseUI.this.f49984g.setClickable(true);
                    BackupMoveChooseUI backupMoveChooseUI2 = BackupMoveChooseUI.this;
                    backupMoveChooseUI2.f49984g.setTextColor(backupMoveChooseUI2.getResources().getColor(C0966R.color.f3113fp));
                    BackupMoveChooseUI.this.f49986i.setVisibility(8);
                    BackupMoveChooseUI.this.f49982e.notifyDataSetChanged();
                }
            }
        }

        /* renamed from: T4 */
        public void mo22650T4(LinkedList<C102912i> linkedList) {
        }

        /* renamed from: g1 */
        public void mo22651g1(LinkedList<C102912i> linkedList, C102912i iVar, int i) {
            BackupMoveChooseUI.this.f49982e.notifyDataSetChanged();
        }
    }

    /* renamed from: N7 */
    public void mo22638N7() {
        LinkedList<C102912i> a = this.f49982e.mo31847a(new PLong(), new PInt());
        LinkedList<String> u = C102913k.m136056u(a);
        mo22640P7().mo140772i(a);
        mo22641Q7().mo17698b(u);
        C101304e P7 = mo22640P7();
        P7.getClass();
        ThreadPool.post(new C101303d(P7), "BackupMoveChooseServer.calculateChooseConvSize");
        C20365c cVar = this.f49982e;
        if (!(cVar.f57045e.size() == cVar.getCount()) && !mo22640P7().f296806t) {
            C101304e P72 = mo22640P7();
            P72.getClass();
            ThreadPool.post(new C101303d(P72), "BackupMoveChooseServer.calculateChooseConvSize");
        }
        mo22644T7(a);
        MMWizardActivity.m7017L7(this, new Intent(this, BackupMoveQRCodeUI.class));
        C115669n.INSTANCE.idkeyStat(485, 23, 1, false);
    }

    /* renamed from: O7 */
    public long mo22639O7(HashSet<Integer> hashSet) {
        LinkedList<C102912i> g = mo22640P7().mo140770g();
        long j = 0;
        if (g.size() == 0) {
            Log.m105920e("MicroMsg.BackupMoveChooseUI", "onClickCheckBox convInfo is null.");
            return 0;
        }
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (intValue < g.size()) {
                j += this.f49996v == 1 ? g.get(intValue).f303761f[1] : g.get(intValue).f303762g;
            }
        }
        return j;
    }

    /* renamed from: P7 */
    public C101304e mo22640P7() {
        return C16686a.m16193i().mo17663l();
    }

    /* renamed from: Q7 */
    public C23368l mo22641Q7() {
        return C16686a.m16193i().mo17662k();
    }

    /* renamed from: R7 */
    public void mo22642R7(HashSet<Integer> hashSet) {
        LinkedList<C102912i> g = mo22640P7().mo140770g();
        if (g.size() == 0) {
            Log.m105920e("MicroMsg.BackupMoveChooseUI", "onClickCheckBox convInfo is null.");
            return;
        }
        HashSet hashSet2 = new HashSet();
        Iterator<Integer> it = hashSet.iterator();
        long j = 0;
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (intValue < g.size()) {
                j = this.f49996v == 1 ? j + g.get(intValue).f303761f[1] : j + g.get(intValue).f303762g;
            } else {
                hashSet2.add(Integer.valueOf(intValue));
            }
        }
        Iterator it4 = hashSet2.iterator();
        while (it4.hasNext()) {
            hashSet.remove((Integer) it4.next());
        }
        HashSet<Integer> hashSet3 = hashSet;
        if (hashSet.size() != 0 || j > 0) {
            this.f49994t.setEnabled(true);
            if (hashSet.size() == this.f49982e.getCount()) {
                this.f49984g.setText(C0966R.string.a_w);
            } else {
                this.f49984g.setText(C0966R.string.a_v);
            }
            View view = this.f49987j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "onClickCheckBox", "(Ljava/util/HashSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "onClickCheckBox", "(Ljava/util/HashSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f49989o.setVisibility(0);
            if (!this.f49979E || j <= 0) {
                this.f49992r.setVisibility(8);
                this.f49990p.setVisibility(0);
                this.f49991q.setText(getString(C0966R.string.a_y, new Object[]{Integer.valueOf(hashSet.size())}));
            } else {
                this.f49992r.setVisibility(0);
                this.f49992r.setText(getResources().getString(C0966R.string.mjo, new Object[]{C102913k.m136058w((float) j)}));
            }
        } else {
            this.f49992r.setVisibility(8);
            this.f49994t.setEnabled(false);
            this.f49984g.setText(C0966R.string.a_v);
            this.f49991q.setText("");
        }
        mo22647W7();
    }

    /* renamed from: S7 */
    public final void mo22643S7(boolean z) {
        C19877i iVar = new C19877i(this);
        iVar.f56638o = new d$$i(this, z);
        Calendar instance = Calendar.getInstance();
        int i = instance.get(1);
        int i2 = instance.get(2) + 1;
        int i3 = instance.get(5);
        iVar.mo26533c(i, i2, i3);
        iVar.mo26534d(i, i2, i3);
        iVar.mo26535e(2011, 1, 21);
        iVar.mo26536f();
    }

    /* renamed from: T7 */
    public void mo22644T7(LinkedList<C102912i> linkedList) {
        int i;
        int i2 = this.f49995u;
        if (i2 == 1 && this.f49996v == 1) {
            C115669n nVar = C115669n.INSTANCE;
            C115669n nVar2 = nVar;
            nVar2.idkeyStat(485, 26, 1, false);
            nVar2.idkeyStat(485, 27, 1, false);
            nVar.mo160131h(11788, 7);
            nVar.mo160131h(11788, 14, Long.valueOf(System.currentTimeMillis()), Long.valueOf(this.f49997w), Long.valueOf(this.f49998x));
        } else if (i2 == 1) {
            C115669n nVar3 = C115669n.INSTANCE;
            nVar3.idkeyStat(485, 26, 1, false);
            nVar3.mo160131h(11788, 5);
            nVar3.mo160131h(11788, 14, Long.valueOf(System.currentTimeMillis()), Long.valueOf(this.f49997w), Long.valueOf(this.f49998x));
        } else if (this.f49996v == 1) {
            C115669n nVar4 = C115669n.INSTANCE;
            nVar4.idkeyStat(485, 27, 1, false);
            nVar4.mo160131h(11788, 6);
        } else {
            C20365c cVar = this.f49982e;
            if (cVar.f57045e.size() == cVar.getCount()) {
                C115669n nVar5 = C115669n.INSTANCE;
                nVar5.idkeyStat(485, 22, 1, false);
                nVar5.mo160131h(11788, 4);
                i = 1;
                C115669n nVar6 = C115669n.INSTANCE;
                nVar6.mo160131h(11788, 13, Integer.valueOf(linkedList.size()), Integer.valueOf(i));
                nVar6.mo160131h(11788, 8);
            }
        }
        i = 0;
        C115669n nVar62 = C115669n.INSTANCE;
        nVar62.mo160131h(11788, 13, Integer.valueOf(linkedList.size()), Integer.valueOf(i));
        nVar62.mo160131h(11788, 8);
    }

    /* renamed from: U7 */
    public final void mo22645U7(int i, long j, long j2, int i2) {
        int i3 = i;
        long j3 = j;
        long j4 = j2;
        mo22641Q7().mo17697a(i, j, j2, i2);
        this.f49996v = i2;
        if (this.f49995u != i3 || this.f49997w != j3 || this.f49998x != j4) {
            this.f49995u = i3;
            this.f49997w = j3;
            this.f49998x = j4;
            Log.m105925i("MicroMsg.BackupMoveChooseUI", "selectTimeAndType timeMode:%d, startTime:%d, endTime:%d, contentType:%d", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i2));
            if (this.f49995u == 1) {
                View view = this.f49987j;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "setSelectExtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "setSelectExtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f49989o.setVisibility(0);
            }
            if (this.f49996v == 1) {
                View view3 = this.f49987j;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "setSelectExtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "setSelectExtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f49989o.setVisibility(0);
            }
            mo22647W7();
            mo22640P7().mo140767d(i2, i, j, j2, mo22640P7().f296803q);
            C20365c cVar = this.f49982e;
            cVar.f57045e.clear();
            cVar.f57044d.mo22642R7(cVar.f57045e);
            mo22640P7().mo140770g();
            if (mo22640P7().mo140770g().size() == 0) {
                if (i3 == 0) {
                    this.f49985h.setText(C0966R.string.aa5);
                } else if (i3 == 1) {
                    this.f49985h.setText(C0966R.string.ae6);
                }
                this.f49985h.setVisibility(0);
            } else {
                this.f49985h.setVisibility(4);
            }
            this.f49982e.notifyDataSetChanged();
        }
    }

    /* renamed from: V7 */
    public final void mo22646V7(TextView textView, long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance.get(5);
        if (textView != null) {
            textView.setText(getString(C0966R.string.mjt, new Object[]{Integer.valueOf(instance.get(1)), Integer.valueOf(instance.get(2) + 1), Integer.valueOf(instance.get(5))}));
            textView.setTextColor(getResources().getColor(C0966R.color.f3133gi));
        }
    }

    /* renamed from: W7 */
    public final void mo22647W7() {
        if (this.f49990p.getVisibility() == 8) {
            View view = this.f49987j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "updateChooseExtInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "updateChooseExtInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f49989o.setVisibility(8);
            return;
        }
        View view3 = this.f49987j;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "updateChooseExtInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "updateChooseExtInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f49989o.setVisibility(0);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6535hi;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.aee);
        this.f49988n = (MMFilterDialog) findViewById(C0966R.C0970id.f358026mq1);
        this.f49983f = (ListView) findViewById(C0966R.C0970id.a3q);
        this.f49982e.f57046f = mo22640P7();
        this.f49983f.setAdapter(this.f49982e);
        this.f49983f.setEmptyView(findViewById(C0966R.C0970id.a3s));
        this.f49984g = (TextView) findViewById(C0966R.C0970id.a3y);
        this.f49985h = (TextView) findViewById(C0966R.C0970id.a3r);
        this.f49986i = (ProgressBar) findViewById(C0966R.C0970id.a3x);
        this.f49987j = findViewById(C0966R.C0970id.a3w);
        this.f49989o = (LinearLayout) findViewById(C0966R.C0970id.a3u);
        this.f49990p = (LinearLayout) findViewById(C0966R.C0970id.a3z);
        this.f49991q = (TextView) findViewById(C0966R.C0970id.f357488a41);
        this.f49992r = (TextView) findViewById(C0966R.C0970id.n64);
        ((TextView) findViewById(C0966R.C0970id.f357487a40)).setText(C0966R.string.aa6);
        setBackBtn(new d$$a(this));
        Button button = (Button) findViewById(C0966R.C0970id.a3v);
        this.f49994t = button;
        button.setOnClickListener(new d$$b(this));
        this.f49994t.setEnabled(false);
        this.f49984g.setOnClickListener(new C18071a());
        if (mo22640P7().f296805s) {
            if (mo22640P7().mo140770g().size() == 0) {
                int i = this.f49995u;
                if (i == 0) {
                    this.f49985h.setText(C0966R.string.aa5);
                } else if (i == 1) {
                    this.f49985h.setText(C0966R.string.ae6);
                }
                this.f49985h.setVisibility(0);
            }
            this.f49986i.setVisibility(4);
        } else if (!mo22640P7().f296805s) {
            this.f49984g.setTextColor(getResources().getColor(C0966R.color.f3115fr));
            this.f49984g.setClickable(false);
            this.f49986i.setVisibility(0);
        } else {
            this.f49986i.setVisibility(4);
        }
        Resources resources = getResources();
        ArrayList arrayList = new ArrayList();
        String[] stringArray = resources.getStringArray(C0966R.array.f2561bb);
        for (int i2 = 0; i2 < stringArray.length; i2++) {
            String str = stringArray[i2];
            if (i2 == 2) {
                MMFilterDialog.C74986g.C74987a aVar = this.f49980F;
                aVar.f220587a = str;
                arrayList.add(aVar);
            } else {
                arrayList.add(new MMFilterDialog.C74986g.C74987a(str, false));
            }
        }
        ((MMFilterDialog.C74986g.C74987a) arrayList.get(0)).f220589c = true;
        MMFilterDialog mMFilterDialog = this.f49988n;
        mMFilterDialog.f220574x = resources.getString(C0966R.string.mjm);
        ((ArrayList) mMFilterDialog.f220551B).clear();
        ((ArrayList) mMFilterDialog.f220551B).addAll(arrayList);
        this.f49988n.setFirstTabSelectListener(new d$$c(this));
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : resources.getStringArray(C0966R.array.f2562bc)) {
            if (str2.contains("\n")) {
                String[] split = str2.split("\n");
                arrayList2.add(new MMFilterDialog.C74986g.C74987a(split[0], split[1], false));
            } else {
                arrayList2.add(new MMFilterDialog.C74986g.C74987a(str2, false));
            }
        }
        ((MMFilterDialog.C74986g.C74987a) arrayList2.get(0)).f220589c = true;
        MMFilterDialog mMFilterDialog2 = this.f49988n;
        mMFilterDialog2.f220575y = resources.getString(C0966R.string.mjn);
        ((ArrayList) mMFilterDialog2.f220552C).clear();
        ((ArrayList) mMFilterDialog2.f220552C).addAll(arrayList2);
        this.f49988n.setSecondTabSelectListener(new cv0.d$$d(this));
        this.f49988n.mo104489e();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            Log.m105921e("MicroMsg.BackupMoveChooseUI", "onActivityResult result error! resultCode:%d", Integer.valueOf(i2));
            return;
        }
        mo22645U7(intent.getIntExtra("BACKUP_SELECT_TIME_MODE", this.f49995u), intent.getLongExtra("BACKUP_SELECT_TIME_START_TIME", 0), intent.getLongExtra("BACKUP_SELECT_TIME_END_TIME", 0), intent.getIntExtra("BACKUP_SELECT_CONTENT_TYPE", this.f49996v));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        this.f49979E = getIntent().getBooleanExtra("isMigrate", false);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onStart() {
        super.onStart();
        mo22640P7().f296794e = this.f49981G;
    }

    public void onStop() {
        super.onStop();
        mo22640P7().f296794e = null;
    }
}
