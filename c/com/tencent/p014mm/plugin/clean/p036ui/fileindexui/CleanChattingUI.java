package com.tencent.p014mm.plugin.clean.p036ui.fileindexui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.dialog.MMFilterDialog;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.z3$$g;
import eb0.z3$$i;
import f40.C86737h0;
import h11.C98311d;
import i11.C98587i;
import j11.C98894c;
import j11.C98896e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k11.C99084r;
import k11.C99086u;
import k11.v$$a;
import k11.v$$a0;
import k11.v$$b;
import k11.v$$c;
import k11.v$$d;
import k11.v$$e;
import k11.v$$f;
import k11.v$$g;
import k11.v$$h;
import k11.v$$l;
import k11.v$$t;
import k11.v$$u;
import k11.v$$v;
import k11.v$$w;
import k11.v$$x;
import k11.v$$y;
import k11.v$$z;
import k11.w$$a;
import k11.w$$b;
import kg3.C76577a;
import qo3.C101218e0;
import qo3.C77407n;
import wy0.C102506a;
import yy0.C102970a;
import zt3.C119157j;

@C86737h0
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingUI */
public class CleanChattingUI extends MMActivity {

    /* renamed from: D */
    public static final long[] f267888D = {-2, 7862400000L, 31536000000L, -1};

    /* renamed from: E */
    public static final int[] f267889E = {0, 2, 3, 4};

    /* renamed from: F */
    public static final int[][] f267890F = {null, C102970a.f303862G, C102970a.f303863H, C102970a.f303865J, C102970a.f303867L};

    /* renamed from: G */
    public static final int[][] f267891G = {null, null, C102970a.f303864I, C102970a.f303866K, C102970a.f303868M};

    /* renamed from: A */
    public volatile boolean f267892A = false;

    /* renamed from: B */
    public volatile boolean f267893B = false;

    /* renamed from: C */
    public final Runnable f267894C = new v$$w(this);

    /* renamed from: d */
    public C99084r f267895d;

    /* renamed from: e */
    public ListView f267896e;

    /* renamed from: f */
    public TextView f267897f;

    /* renamed from: g */
    public TextView f267898g;

    /* renamed from: h */
    public TextView f267899h;

    /* renamed from: i */
    public Button f267900i;

    /* renamed from: j */
    public Button f267901j;

    /* renamed from: n */
    public long f267902n;

    /* renamed from: o */
    public long f267903o;

    /* renamed from: p */
    public ProgressDialog f267904p;

    /* renamed from: q */
    public MMFilterDialog f267905q;

    /* renamed from: r */
    public List<MMFilterDialog.C74986g.C74987a> f267906r;

    /* renamed from: s */
    public int f267907s;

    /* renamed from: t */
    public final long f267908t = System.currentTimeMillis();

    /* renamed from: u */
    public Map<String, C99086u> f267909u;

    /* renamed from: v */
    public volatile int f267910v = 0;

    /* renamed from: w */
    public volatile long f267911w = -2;

    /* renamed from: x */
    public volatile long[] f267912x;

    /* renamed from: y */
    public volatile int f267913y = 0;

    /* renamed from: z */
    public volatile boolean f267914z = false;

    /* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingUI$a */
    public class C93016a implements C98894c, z3$$i, z3$$g {

        /* renamed from: d */
        public volatile int f267915d = Integer.MIN_VALUE;

        /* renamed from: e */
        public volatile long f267916e = -1;

        /* renamed from: f */
        public final long f267917f;

        /* renamed from: g */
        public final boolean f267918g;

        /* renamed from: h */
        public final boolean f267919h;

        /* renamed from: i */
        public final long f267920i;

        /* renamed from: j */
        public final boolean f267921j;

        /* renamed from: n */
        public volatile int f267922n;

        /* renamed from: o */
        public volatile int f267923o;

        /* renamed from: p */
        public final int f267924p;

        /* renamed from: q */
        public boolean f267925q;

        public C93016a(long j, boolean z, boolean z2, int i, boolean z3) {
            this.f267917f = j;
            this.f267918g = z;
            this.f267919h = z2;
            this.f267920i = System.currentTimeMillis();
            this.f267924p = i;
            this.f267921j = z3;
        }

        /* renamed from: W1 */
        public void mo127430W1(int i, int i2) {
            this.f267922n = i;
            ((C119157j) C119157j.f356862d).mo183895z(new w$$a(this));
        }

        /* renamed from: a */
        public void mo105958a(int i, int i2) {
            this.f267923o = i;
            ((C119157j) C119157j.f356862d).mo183895z(new w$$a(this));
        }

        /* renamed from: b */
        public boolean mo24603b() {
            return false;
        }

        /* renamed from: c */
        public void mo24604c() {
            Log.m105924i("MicroMsg.CleanChattingUI", "Triggered async delete messages");
            this.f267915d = -1;
            if (this.f267916e >= 0) {
                mo127436e();
            }
        }

        /* renamed from: d */
        public void mo105959d(boolean z, int i) {
            Log.m105924i("MicroMsg.CleanChattingUI", "Done delete messages, cancelled: " + z + ", count: " + i);
            if (!z) {
                C98587i.f289083d.mo137958a();
            }
            this.f267925q = z | this.f267925q;
            this.f267915d = i;
            if (this.f267916e >= 0) {
                mo127436e();
            }
        }

        /* renamed from: e */
        public final void mo127436e() {
            C98896e wx02 = C98896e.wx0();
            synchronized (C98896e.class) {
                long j = wx02.f289906d;
                long j2 = this.f267917f;
                wx02.f289906d = j - j2;
                wx02.f289907e -= j2;
            }
            ((v$$w) CleanChattingUI.this.f267894C).run();
            ((C119157j) C119157j.f356862d).mo183895z(new w$$b(this));
            long j3 = 0;
            long j4 = -1;
            if (CleanChattingUI.this.f267892A) {
                j4 = CleanChattingUI.this.f267911w == -2 ? 0 : CleanChattingUI.this.f267911w == -1 ? -2 : CleanChattingUI.this.f267911w / 86400000;
            }
            if (this.f267925q) {
                C102506a.m135309i(13, System.currentTimeMillis() - this.f267920i, Long.valueOf((long) this.f267915d));
            } else {
                int i = this.f267918g ? 6 : 7;
                long currentTimeMillis = System.currentTimeMillis() - this.f267920i;
                Long[] lArr = new Long[6];
                lArr[0] = Long.valueOf(this.f267917f);
                if (this.f267919h) {
                    j3 = 1;
                }
                lArr[1] = Long.valueOf(j3);
                int i2 = -1;
                lArr[2] = Long.valueOf((long) (CleanChattingUI.this.f267914z ? CleanChattingUI.this.f267910v : -1));
                lArr[3] = Long.valueOf(j4);
                if (CleanChattingUI.this.f267893B) {
                    i2 = CleanChattingUI.this.f267913y;
                }
                lArr[4] = Long.valueOf((long) i2);
                lArr[5] = Long.valueOf((long) this.f267915d);
                C102506a.m135309i(i, currentTimeMillis, lArr);
            }
            C102506a.f301840i = true;
        }

        /* renamed from: q7 */
        public void mo127431q7(boolean z, long j) {
            Object[] objArr = new Object[2];
            objArr[0] = z ? "cancelled" : "success";
            objArr[1] = Long.valueOf(j);
            Log.m105925i("MicroMsg.CleanChattingUI", "onDeleteEnd [%s, %d] ", objArr);
            if (!z && this.f267921j) {
                Log.m105924i("MicroMsg.CleanChattingUI", "Delete all messages, clear C2C directories.");
                C86013q1.m106445f("wcf://image2/");
                C86013q1.m106445f("wcf://video/");
                C86013q1.m106445f("wcf://voice2/");
                C86013q1.m106445f("wcf://attachment/");
                C86013q1.m106445f("wcf://record/");
            }
            this.f267925q = z | this.f267925q;
            this.f267916e = j;
            if (this.f267915d >= -1) {
                mo127436e();
            }
        }
    }

    /* renamed from: H7 */
    public final long[] mo127432H7() {
        if (this.f267911w == -1 && this.f267912x != null) {
            return this.f267912x;
        }
        if (this.f267911w <= 0) {
            return new long[]{0, MAlarmHandler.NEXT_FIRE_INTERVAL};
        }
        return new long[]{0, this.f267908t - this.f267911w};
    }

    /* renamed from: I7 */
    public final void mo127433I7() {
        C99084r rVar = this.f267895d;
        HashSet<Integer> hashSet = rVar.f290441e;
        if (rVar == null) {
            Log.m105928w("MicroMsg.CleanChattingUI", "on click check box but adapter is null");
            return;
        }
        HashSet hashSet2 = new HashSet();
        Iterator<Integer> it = hashSet.iterator();
        long j = 0;
        long j2 = 0;
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            C99086u a = this.f267895d.getItem(intValue);
            if (a != null) {
                j += a.f290497b[this.f267910v];
                j2 += this.f267910v == 0 ? a.f290497b[1] : 0;
            } else {
                hashSet2.add(Integer.valueOf(intValue));
            }
        }
        Iterator it4 = hashSet2.iterator();
        while (it4.hasNext()) {
            hashSet.remove((Integer) it4.next());
        }
        int size = hashSet.size();
        int i = C0966R.string.f7555ji;
        if (size != 0 || j > 0) {
            this.f267897f.setText(getString(C0966R.string.byb, new Object[]{C98311d.m127053b(j)}));
            this.f267900i.setEnabled(true);
            Button button = this.f267901j;
            if (hashSet.size() == this.f267895d.getCount()) {
                i = C0966R.string.auk;
            }
            button.setText(i);
        } else {
            this.f267897f.setText("");
            this.f267900i.setEnabled(false);
            this.f267901j.setText(C0966R.string.f7555ji);
        }
        this.f267902n = j;
        this.f267903o = j2;
    }

    /* renamed from: J7 */
    public final void mo127434J7(int i, long j, long j2) {
        int i2 = i;
        long j3 = j2;
        Resources resources = getResources();
        boolean z = i2 == 1 && j <= 0;
        C101218e0 e0Var = new C101218e0(this, z ? 2 : 1, 0, true);
        LayoutInflater from = LayoutInflater.from(this);
        if (j3 > 0 && j == 0) {
            View inflate = from.inflate(C0966R.C0971layout.f359635cs3, (ViewGroup) null);
            ((TextView) inflate.findViewById(C0966R.C0970id.moa)).setText(getString(C0966R.string.fqc));
            inflate.setOnClickListener(new v$$d(this, e0Var, j3));
            e0Var.mo140670p(inflate);
        }
        View inflate2 = from.inflate(C0966R.C0971layout.f7002cu, (ViewGroup) null);
        TextView textView = (TextView) inflate2.findViewById(C0966R.C0970id.bh4);
        TextView textView2 = (TextView) inflate2.findViewById(C0966R.C0970id.beh);
        if (z) {
            textView.setText(C0966R.string.fqe);
            textView.setGravity(17);
            textView2.setText(getString(C0966R.string.f360279mb3, new Object[]{C98311d.m127053b(j2)}));
            textView2.setGravity(17);
            e0Var.mo140676v(0);
            e0Var.mo140677w(getString(C0966R.string.fqd));
            e0Var.f296375F = new v$$e(e0Var);
        } else {
            int b = C76577a.m92151b(this, 14);
            C77407n nVar = new C77407n((Context) this, 1, true);
            nVar.mo107568m(resources.getStringArray(C0966R.array.f2569b6)[i2], 17, b);
            nVar.f225771i = new v$$f(resources, i2);
            nVar.f225782p = new v$$g(this, i2);
            textView.setText(resources.getStringArray(C0966R.array.f2571b8)[i2]);
            textView.setGravity(8388611);
            textView2.setText(String.format(resources.getStringArray(C0966R.array.f2570b7)[i2], new Object[]{C98311d.m127053b(j3 - j)}));
            textView2.setGravity(8388611);
            e0Var.mo140668o(2);
            e0Var.mo140675u(resources.getColor(C0966R.color.FG_0));
            e0Var.mo140667n(resources.getText(C0966R.string.auj), String.format(resources.getStringArray(C0966R.array.f2568bd)[i2], new Object[]{C98311d.m127053b(j)}));
            v$$e v__e = new v$$e(e0Var);
            v$$h v__h = new v$$h(nVar, e0Var);
            e0Var.f296373D = v__e;
            e0Var.f296374E = v__h;
        }
        e0Var.mo140663j(inflate2);
        e0Var.mo140655A();
    }

    /* renamed from: K7 */
    public final void mo127435K7() {
        ArrayList arrayList = new ArrayList(this.f267909u.size());
        for (C99086u next : this.f267909u.values()) {
            if (next.f290497b[this.f267910v] > 0) {
                arrayList.add(next);
            }
        }
        Collections.sort(arrayList, new v$$y(this));
        ((C119157j) C119157j.f356862d).mo183895z(new v$$z(this, arrayList));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7007ur;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null) {
            ((C119157j) C119157j.f356862d).mo183871b(new v$$x(this, intent), "CleanChattingLoad");
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.CleanChattingUI", "Create!!");
        setMMTitle((int) C0966R.string.ben);
        this.f267896e = (ListView) findViewById(C0966R.C0970id.bdb);
        C99084r rVar = new C99084r(this);
        this.f267895d = rVar;
        this.f267896e.setAdapter(rVar);
        this.f267898g = (TextView) findViewById(C0966R.C0970id.g3r);
        this.f267899h = (TextView) findViewById(C0966R.C0970id.cjf);
        this.f267897f = (TextView) findViewById(C0966R.C0970id.c1f);
        this.f267901j = (Button) findViewById(C0966R.C0970id.mll);
        this.f267905q = (MMFilterDialog) findViewById(C0966R.C0970id.f358026mq1);
        Button button = (Button) findViewById(C0966R.C0970id.c0a);
        this.f267900i = button;
        button.setEnabled(false);
        setBackBtn(new v$$a(this));
        this.f267896e.setOnItemClickListener(new v$$l(this));
        this.f267895d.f290443g = new v$$t(this);
        this.f267900i.setOnClickListener(new v$$u(this));
        this.f267901j.setOnClickListener(new v$$v(this));
        Resources resources = getResources();
        ArrayList arrayList = new ArrayList();
        for (String aVar : resources.getStringArray(C0966R.array.f2565b3)) {
            arrayList.add(new MMFilterDialog.C74986g.C74987a(aVar, false));
        }
        ((MMFilterDialog.C74986g.C74987a) arrayList.get(0)).f220589c = true;
        MMFilterDialog mMFilterDialog = this.f267905q;
        mMFilterDialog.f220574x = ((MMFilterDialog.C74986g.C74987a) arrayList.get(0)).f220587a;
        ((ArrayList) mMFilterDialog.f220551B).clear();
        ((ArrayList) mMFilterDialog.f220551B).addAll(arrayList);
        this.f267905q.setFirstTabSelectListener(new v$$a0(this));
        this.f267906r = arrayList;
        this.f267907s = 0;
        ArrayList arrayList2 = new ArrayList();
        String[] stringArray = resources.getStringArray(C0966R.array.f2566b4);
        int[] iArr = f267889E;
        for (int i = 0; i < 4; i++) {
            arrayList2.add(new MMFilterDialog.C74986g.C74987a(stringArray[iArr[i]], false));
        }
        ((MMFilterDialog.C74986g.C74987a) arrayList2.get(0)).f220589c = true;
        MMFilterDialog mMFilterDialog2 = this.f267905q;
        mMFilterDialog2.f220575y = ((MMFilterDialog.C74986g.C74987a) arrayList2.get(0)).f220587a;
        ((ArrayList) mMFilterDialog2.f220552C).clear();
        ((ArrayList) mMFilterDialog2.f220552C).addAll(arrayList2);
        this.f267905q.setSecondTabSelectListener(new v$$b(this));
        ArrayList arrayList3 = new ArrayList();
        for (String aVar2 : resources.getStringArray(C0966R.array.f2564b2)) {
            arrayList3.add(new MMFilterDialog.C74986g.C74987a(aVar2, false));
        }
        ((MMFilterDialog.C74986g.C74987a) arrayList3.get(0)).f220589c = true;
        MMFilterDialog mMFilterDialog3 = this.f267905q;
        mMFilterDialog3.f220576z = ((MMFilterDialog.C74986g.C74987a) arrayList3.get(0)).f220587a;
        ((ArrayList) mMFilterDialog3.f220553D).clear();
        ((ArrayList) mMFilterDialog3.f220553D).addAll(arrayList3);
        this.f267905q.setThirdTabSelectListener(new v$$c(this));
        this.f267905q.mo104489e();
        ((C119157j) C119157j.f356862d).mo183871b(this.f267894C, "CleanChattingLoad");
        C115669n.INSTANCE.idkeyStat(714, 20, 1, false);
    }

    public void onDestroy() {
        ProgressDialog progressDialog = this.f267904p;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f267904p.dismiss();
        }
        super.onDestroy();
    }
}
