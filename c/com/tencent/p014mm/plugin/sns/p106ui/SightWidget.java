package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SightSendResultEvent;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sight.decode.model.C94571a;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C95006y;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import g34.C116918i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import kr2.C76634a;
import nj3.C76879j;
import nj3.C76912y0;
import p159gw.C8462g;
import p166hy.C98567o0;
import te3.C101802kr2;
import te3.f94;
import vr2.C102236a0;
import xn2.C102694d;

/* renamed from: com.tencent.mm.plugin.sns.ui.SightWidget */
public class SightWidget extends C96157q {

    /* renamed from: c */
    public MMActivity f277459c;

    /* renamed from: d */
    public View f277460d = null;

    /* renamed from: e */
    public C94571a f277461e;

    /* renamed from: f */
    public String f277462f = "";

    /* renamed from: g */
    public String f277463g = "";

    /* renamed from: h */
    public ProgressBar f277464h;

    /* renamed from: i */
    public String f277465i = "";

    /* renamed from: j */
    public boolean f277466j = false;

    /* renamed from: k */
    public Bitmap f277467k = null;

    /* renamed from: l */
    public int f277468l;

    /* renamed from: m */
    public C102694d f277469m = null;

    /* renamed from: n */
    public C91998s f277470n = null;

    /* renamed from: o */
    public int f277471o = 1;

    /* renamed from: p */
    public String f277472p = "";

    /* renamed from: q */
    public IListener f277473q = new IListener<SightSendResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 2027183784;
        }

        public boolean callback(IEvent iEvent) {
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SightWidget$1");
            SightSendResultEvent sightSendResultEvent = (SightSendResultEvent) iEvent;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SightWidget$1");
            Log.m105925i("MicroMsg.SightWidget", "on sight send result callback, type %d", Integer.valueOf(sightSendResultEvent.f265103d.f265105a));
            if (sightSendResultEvent.f265103d.f265105a == 1) {
                Log.m105924i("MicroMsg.SightWidget", "come event done");
                SightWidget sightWidget = SightWidget.this;
                sightSendResultEvent.f265103d.getClass();
                SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SightWidget");
                sightWidget.f277463g = null;
                SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SightWidget");
                SightWidget sightWidget2 = SightWidget.this;
                sightSendResultEvent.f265103d.getClass();
                SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SightWidget");
                sightWidget2.f277465i = null;
                SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SightWidget");
                SightWidget sightWidget3 = SightWidget.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SightWidget");
                ProgressDialog progressDialog = sightWidget3.f277476t;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SightWidget");
                if (progressDialog != null) {
                    SightWidget sightWidget4 = SightWidget.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SightWidget");
                    ProgressDialog progressDialog2 = sightWidget4.f277476t;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SightWidget");
                    progressDialog2.dismiss();
                }
                SightWidget sightWidget5 = SightWidget.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SightWidget");
                C94571a aVar = sightWidget5.f277461e;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SightWidget");
                aVar.mo130071b(SightWidget.m121781k(SightWidget.this), false, 0);
                SightWidget sightWidget6 = SightWidget.this;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SightWidget");
                ProgressBar progressBar = sightWidget6.f277464h;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SightWidget");
                progressBar.setVisibility(8);
                if (sightSendResultEvent.f265103d.f265106b) {
                    SightWidget sightWidget7 = SightWidget.this;
                    if (sightWidget7.f277474r != null) {
                        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SightWidget");
                        sightWidget7.mo132487m();
                        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SightWidget");
                    }
                }
                sightSendResultEvent.f265103d.getClass();
                sightSendResultEvent.f265103d.getClass();
                SightWidget sightWidget8 = SightWidget.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightWidget");
                String str = sightWidget8.f277465i;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightWidget");
                Log.m105925i("MicroMsg.SightWidget", "mux finish %B videoPath %s %d md5 %s", Boolean.valueOf(sightSendResultEvent.f265103d.f265106b), null, Long.valueOf(C86013q1.m106451l((String) null)), str);
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SightWidget$1");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SightWidget$1");
            return false;
        }
    };

    /* renamed from: r */
    public C94945s2 f277474r = null;

    /* renamed from: s */
    public String f277475s = "";

    /* renamed from: t */
    public ProgressDialog f277476t = null;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SightWidget$a */
    public class C95416a implements View.OnClickListener {
        public C95416a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SightWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightWidget$2");
            if (!C86013q1.m106450k(SightWidget.m121781k(SightWidget.this))) {
                Log.m105924i("MicroMsg.SightWidget", "click videopath is not exist " + SightWidget.m121781k(SightWidget.this));
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightWidget$2");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SightWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (SightWidget.m121782l(SightWidget.this) != null) {
                SightWidget.m121782l(SightWidget.this).dismiss();
                SightWidget sightWidget = SightWidget.this;
                SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SightWidget");
                sightWidget.f277469m = null;
                SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SightWidget");
            }
            SightWidget sightWidget2 = SightWidget.this;
            SightWidget sightWidget3 = SightWidget.this;
            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SightWidget");
            MMActivity mMActivity = sightWidget3.f277459c;
            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SightWidget");
            C102694d dVar = new C102694d(mMActivity);
            SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SightWidget");
            sightWidget2.f277469m = dVar;
            SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SightWidget");
            C102694d l = SightWidget.m121782l(SightWidget.this);
            String k = SightWidget.m121781k(SightWidget.this);
            SightWidget sightWidget4 = SightWidget.this;
            SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SightWidget");
            String str = sightWidget4.f277462f;
            SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SightWidget");
            l.f303310f = k;
            l.f303311g = str;
            C102694d l2 = SightWidget.m121782l(SightWidget.this);
            l2.f303312h = 0;
            l2.f303313i = 0;
            l2.f303314j = 1;
            SightWidget.m121782l(SightWidget.this).show();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightWidget$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SightWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SightWidget$b */
    public class C95417b implements DialogInterface.OnCancelListener {
        public C95417b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SightWidget$3");
            SightWidget.this.f277474r = null;
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SightWidget$3");
        }
    }

    public SightWidget(MMActivity mMActivity) {
        this.f277459c = mMActivity;
    }

    /* renamed from: k */
    public static /* synthetic */ String m121781k(SightWidget sightWidget) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SightWidget");
        String str = sightWidget.f277463g;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return str;
    }

    /* renamed from: l */
    public static /* synthetic */ C102694d m121782l(SightWidget sightWidget) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SightWidget");
        C102694d dVar = sightWidget.f277469m;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return dVar;
    }

    /* renamed from: a */
    public View mo132124a() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SightWidget");
        View inflate = View.inflate(this.f277459c, C0966R.C0971layout.cb6, (ViewGroup) null);
        this.f277460d = inflate;
        C94571a aVar = (C94571a) inflate.findViewById(C0966R.C0970id.f39);
        this.f277461e = aVar;
        aVar.setDrawableWidth(C76577a.m92151b(this.f277459c, 90));
        this.f277464h = (ProgressBar) this.f277460d.findViewById(C0966R.C0970id.g2x);
        this.f277459c.getResources().getDisplayMetrics();
        this.f277460d.findViewById(C0966R.C0970id.b47).setOnClickListener(new C95416a());
        Log.m105924i("MicroMsg.SightWidget", "videoPath " + this.f277463g + " thumbPath " + this.f277462f + " " + C86013q1.m106451l(this.f277463g) + " " + C86013q1.m106451l(this.f277462f));
        if (C86013q1.m106450k(this.f277463g)) {
            this.f277461e.mo130071b(this.f277463g, false, 0);
            this.f277464h.setVisibility(8);
            Log.m105925i("MicroMsg.SightWidget", "videopath exist videopath %s md5 %s", this.f277463g, this.f277465i);
        } else {
            C92714n n = C102236a0.m134758n(this.f277462f);
            if (n != null) {
                n.f266822h = false;
                Bitmap bitmap = n.f266818d;
                this.f277467k = bitmap;
                if (C102236a0.m134740e(bitmap)) {
                    this.f277461e.setThumbBmp(this.f277467k);
                }
            }
            this.f277464h.setVisibility(0);
        }
        View view = this.f277460d;
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return view;
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.SightWidget");
        SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return true;
    }

    /* renamed from: d */
    public void mo132126d(Bundle bundle) {
        String str;
        SnsMethodCalculate.markStartTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.SightWidget");
        this.f277470n = C91998s.m115551f(this.f277459c.getIntent());
        this.f277462f = this.f277459c.getIntent().getStringExtra("KSightThumbPath");
        this.f277463g = this.f277459c.getIntent().getStringExtra("KSightPath");
        this.f277465i = this.f277459c.getIntent().getStringExtra("sight_md5");
        this.f277468l = this.f277459c.getIntent().getIntExtra("Ksnsupload_source", 0);
        SightSendResultEvent sightSendResultEvent = new SightSendResultEvent();
        sightSendResultEvent.f265103d.f265105a = 2;
        sightSendResultEvent.publish();
        if (Util.isNullOrNil(this.f277463g)) {
            sightSendResultEvent.f265104e.getClass();
            String nullAs = Util.nullAs((String) null, "");
            this.f277463g = nullAs;
            Log.m105921e("MicroMsg.SightWidget", "videoPath is null %s", nullAs);
        }
        if (Util.isNullOrNil(this.f277465i)) {
            sightSendResultEvent.f265104e.getClass();
            str = Util.nullAs((String) null, "");
        } else {
            str = this.f277465i;
        }
        this.f277465i = str;
        Log.m105925i("MicroMsg.SightWidget", "oncreate thumb path %s videopath %s md5 %s", this.f277462f, this.f277463g, str);
        this.f277473q.alive();
        if (this.f277459c.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f277471o = 1;
        } else {
            this.f277471o = 0;
        }
        this.f277472p = Util.nullAs(this.f277459c.getIntent().getStringExtra("SendAppMessageWrapper_PkgName"), "");
        SnsMethodCalculate.markEndTimeMs("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.SightWidget");
    }

    /* renamed from: e */
    public boolean mo132127e(int i, int i2, C116918i iVar, String str, List<String> list, C101802kr2 kr22, LinkedList<Long> linkedList, int i3, boolean z, List<String> list2, PInt pInt, String str2, int i4, int i5) {
        int i6 = i;
        String str3 = str;
        List<String> list3 = list2;
        SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.SightWidget");
        if (this.f277474r != null) {
            SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.SightWidget");
            return false;
        }
        this.f277475s = str3;
        LinkedList linkedList2 = new LinkedList();
        if (list != null) {
            new LinkedList();
            List<String> gt = ((C8462g) C86312j.m106911c(C8462g.class)).mo9266gt();
            for (String next : list) {
                if (gt != null && !gt.contains(next)) {
                    f94 f94 = new f94();
                    f94.f298255d = next;
                    linkedList2.add(f94);
                }
            }
        }
        C94945s2 s2Var = new C94945s2(15, this.f277459c);
        this.f277474r = s2Var;
        pInt.value = s2Var.mo131253j();
        if (i3 > C76634a.f224255a) {
            this.f277474r.mo131261r(1, 3);
        }
        C94945s2 s2Var2 = this.f277474r;
        s2Var2.mo131260q(str3);
        s2Var2.mo131262s(new LinkedList());
        s2Var2.mo131265v(kr22);
        s2Var2.mo131243Q(linkedList2);
        s2Var2.mo131228B(i);
        int i7 = i2;
        s2Var2.mo131239M(i2);
        s2Var2.mo131263t(list3);
        if (z) {
            this.f277474r.mo131264u(1);
        } else {
            this.f277474r.mo131264u(0);
        }
        C94945s2 s2Var3 = this.f277474r;
        s2Var3.mo131263t(list3);
        s2Var3.mo131228B(i);
        this.f277474r.mo131234H(this.f277468l);
        this.f277474r.mo131269z(this.f277471o, this.f277472p);
        this.f277474r.mo131235I((String) null, (String) null, (String) null, i4, i5);
        mo133779j(this.f277474r);
        if (C86013q1.m106450k(this.f277463g)) {
            mo132487m();
            SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.SightWidget");
            return true;
        }
        Log.m105924i("MicroMsg.SightWidget", "commit file is not exist " + this.f277463g);
        MMActivity mMActivity = this.f277459c;
        this.f277476t = C76879j.m92723Q(mMActivity, mMActivity.getString(C0966R.string.a3h), this.f277459c.getString(C0966R.string.jhe), false, true, new C95417b());
        SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return true;
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.SightWidget");
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return true;
    }

    /* renamed from: g */
    public boolean mo132129g() {
        SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.SightWidget");
        ProgressDialog progressDialog = this.f277476t;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f277473q.dead();
        if (C102236a0.m134740e(this.f277467k)) {
            this.f277467k.recycle();
        }
        SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return false;
    }

    /* renamed from: h */
    public boolean mo132130h() {
        SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.SightWidget");
        SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return true;
    }

    /* renamed from: i */
    public void mo132131i(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.SightWidget");
        SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.SightWidget");
    }

    /* renamed from: m */
    public final void mo132487m() {
        SnsMethodCalculate.markStartTimeMs("commitDone", "com.tencent.mm.plugin.sns.ui.SightWidget");
        if (this.f277466j) {
            SnsMethodCalculate.markEndTimeMs("commitDone", "com.tencent.mm.plugin.sns.ui.SightWidget");
        } else if (!this.f277474r.mo131250g(this.f277463g, this.f277462f, this.f277475s, this.f277465i)) {
            Log.m105924i("MicroMsg.SightWidget", "videopath " + C86013q1.m106451l(this.f277463g) + " thumb: " + C86013q1.m106451l(this.f277462f));
            C76912y0.makeText((Context) this.f277459c, (int) C0966R.string.ilv, 0).show();
            SnsMethodCalculate.markEndTimeMs("commitDone", "com.tencent.mm.plugin.sns.ui.SightWidget");
        } else {
            SightSendResultEvent sightSendResultEvent = new SightSendResultEvent();
            SightSendResultEvent.C92563a aVar = sightSendResultEvent.f265103d;
            aVar.f265105a = 0;
            aVar.f265106b = true;
            sightSendResultEvent.publish();
            this.f277466j = true;
            int i = this.f277474r.mo131252i();
            C91998s sVar = this.f277470n;
            if (sVar != null) {
                sVar.mo125840a(i);
                C95006y.f275639b.mo131398c(this.f277470n);
            }
            C94866e1.Kx0().mo133238a();
            C98567o0.C76249a aVar2 = new C98567o0.C76249a();
            aVar2.f223351g = false;
            aVar2.f223345a = true;
            ((C98567o0) C86312j.m106911c(C98567o0.class)).yb0(this.f277459c, (Intent) null, 4, aVar2);
            this.f277459c.setResult(-1);
            this.f277459c.finish();
            SnsMethodCalculate.markEndTimeMs("commitDone", "com.tencent.mm.plugin.sns.ui.SightWidget");
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightWidget");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightWidget");
        return false;
    }
}
