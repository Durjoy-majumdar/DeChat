package pv1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kv1.C99260q;
import lv1.C99672i;
import lv1.C99681n;
import p255vr.C78469f;

/* renamed from: pv1.b */
public abstract class C22019b {

    /* renamed from: a */
    public final int f62323a;

    /* renamed from: b */
    public final int f62324b;

    /* renamed from: c */
    public boolean f62325c;

    /* renamed from: d */
    public boolean f62326d = true;

    /* renamed from: e */
    public C99672i f62327e;

    /* renamed from: f */
    public int f62328f;

    /* renamed from: g */
    public int f62329g;

    /* renamed from: h */
    public int f62330h;

    /* renamed from: i */
    public int f62331i;

    /* renamed from: j */
    public int f62332j;

    /* renamed from: k */
    public String f62333k;

    /* renamed from: l */
    public int f62334l;

    /* renamed from: m */
    public int f62335m;

    /* renamed from: n */
    public String f62336n;

    /* renamed from: o */
    public boolean f62337o;

    /* renamed from: pv1.b$a */
    public abstract class C22020a {
        public C22020a(C22019b bVar) {
        }
    }

    /* renamed from: pv1.b$b */
    public abstract class C22021b {
        public C22021b() {
        }

        /* renamed from: a */
        public void mo35141a(String str, C99681n nVar) {
            Class cls = C78469f.class;
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128752cG(str, nVar, 0);
            ((C78469f) C86312j.m106911c(cls)).Vs0(str);
            if (!Util.isNullOrNil(C22019b.this.mo35132d())) {
                ((C78469f) C86312j.m106911c(cls)).Vs0(C22019b.this.mo35132d());
            }
        }

        /* renamed from: b */
        public abstract void mo35142b(Context context, C22020a aVar, C22019b bVar, Object... objArr);

        /* renamed from: c */
        public abstract View mo35143c(Context context, ViewGroup viewGroup, View view);

        /* renamed from: d */
        public abstract boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr);
    }

    public C22019b(int i, int i2) {
        this.f62323a = i;
        this.f62324b = i2;
        Log.m105927v("MicroMsg.FTS.FTSDataItem", "create data item | viewType=%d | position=%d", Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22020a aVar, Object... objArr) {
    }

    /* renamed from: b */
    public String mo35130b() {
        return "";
    }

    /* renamed from: c */
    public String mo35131c() {
        return "";
    }

    /* renamed from: d */
    public String mo35132d() {
        return "";
    }

    /* renamed from: e */
    public int mo35133e() {
        return 0;
    }

    /* renamed from: f */
    public int mo35134f() {
        return 0;
    }

    /* renamed from: g */
    public int mo35135g() {
        return 0;
    }

    /* renamed from: h */
    public abstract C22021b mo35136h();

    /* renamed from: i */
    public String mo35137i() {
        return "";
    }

    /* renamed from: j */
    public boolean mo35138j() {
        return false;
    }

    /* renamed from: k */
    public String mo35139k() {
        C99672i iVar = this.f62327e;
        return iVar == null ? "" : iVar.f292120a;
    }

    /* renamed from: k */
    public void mo35140k(int i, int i2) {
        this.f62334l = i;
        this.f62335m = i2;
        this.f62337o = true;
    }
}
