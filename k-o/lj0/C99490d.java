package lj0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateRoutine;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kv1.C99252h;
import kv1.C99254i;
import kv1.C99261r;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;
import lv1.C99667f;
import lv1.C99681n;
import p1031sb.C90159e;
import p235sm.C101649q0;
import p235sm.C36699n0;
import p235sm.C36706r0;
import p235sm.C36708s0;
import p255vr.C78470h;
import pv1.C22019b;

/* renamed from: lj0.d */
public class C99490d extends C22019b {

    /* renamed from: p */
    public String f291687p;

    /* renamed from: q */
    public C99681n f291688q;

    /* renamed from: r */
    public AppBrandRecentTaskInfo f291689r;

    /* renamed from: s */
    public CharSequence f291690s;

    /* renamed from: t */
    public int f291691t;

    /* renamed from: u */
    public int f291692u;

    /* renamed from: v */
    public boolean f291693v;

    /* renamed from: w */
    public C99492b f291694w = new C99492b();

    /* renamed from: x */
    public C99491a f291695x = new C99491a(this);

    /* renamed from: lj0.d$a */
    public class C99491a extends C22019b.C22020a {

        /* renamed from: a */
        public View f291696a;

        /* renamed from: b */
        public ImageView f291697b;

        /* renamed from: c */
        public TextView f291698c;

        /* renamed from: d */
        public TextView f291699d;

        /* renamed from: e */
        public TextView f291700e;

        /* renamed from: f */
        public View f291701f;

        /* renamed from: g */
        public ImageView f291702g;

        /* renamed from: h */
        public ImageView f291703h;

        /* renamed from: i */
        public ImageView f291704i;

        public C99491a(C99490d dVar) {
            super(dVar);
        }
    }

    /* renamed from: lj0.d$b */
    public class C99492b extends C22019b.C22021b {
        public C99492b() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            Class cls = C32735h.class;
            C99490d dVar = (C99490d) bVar;
            C99491a aVar2 = (C99491a) aVar;
            ((C78470h) C86312j.m106911c(C78470h.class)).Zo0(aVar2.f291701f, C99490d.this.f62326d);
            if (dVar.f291689r == null) {
                View view = aVar2.f291696a;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/appbrand/fts/FTSWeAppDataItem$FTSWeAppViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/fts/FTSWeAppDataItem$FTSWeAppViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view3 = aVar2.f291696a;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/appbrand/fts/FTSWeAppDataItem$FTSWeAppViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/appbrand/fts/FTSWeAppDataItem$FTSWeAppViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            aVar2.f291698c.setText(C99490d.this.f291690s);
            if (C99490d.this.f62329g == -8) {
                aVar2.f291699d.setText(C0966R.string.iga);
                aVar2.f291699d.setVisibility(0);
            } else {
                aVar2.f291699d.setVisibility(8);
            }
            String b0 = ((C36699n0) C86312j.m106911c(C36699n0.class)).mo60655b0(C99490d.this.f291689r.f239035x);
            if (Util.isNullOrNil(b0)) {
                aVar2.f291700e.setVisibility(8);
            } else {
                aVar2.f291700e.setText(b0);
                aVar2.f291700e.setVisibility(0);
            }
            if (C90159e.m112822a(C99490d.this.f291692u, 4) && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32738b.wxapp_flagship_store, 0) == 1) {
                aVar2.f291703h.setVisibility(0);
                aVar2.f291702g.setVisibility(8);
                ((C36706r0) C86312j.m106911c(C36706r0.class)).mo60652p6(aVar2.f291703h);
            } else if (!C90159e.m112823b(C99490d.this.f291691t, 4) || ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.relievedbuy, 0) != 1) {
                aVar2.f291703h.setVisibility(8);
                aVar2.f291702g.setVisibility(8);
            } else {
                aVar2.f291702g.setVisibility(0);
                aVar2.f291703h.setVisibility(8);
                ((C36708s0) C86312j.m106911c(C36708s0.class)).mo60650a(aVar2.f291702g);
            }
            if (!C99490d.this.f291693v || ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_show_official_flag, 0) != 1) {
                aVar2.f291704i.setVisibility(8);
            } else {
                aVar2.f291704i.setVisibility(0);
            }
            String str = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122786b(aVar2.f291697b, dVar.f291689r.f239033v, C88393a.m110230a(), C88431k.f255437d);
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6402dv, viewGroup, false);
            C99491a aVar = C99490d.this.f291695x;
            aVar.f291697b = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            aVar.f291698c = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            aVar.f291696a = inflate.findViewById(C0966R.C0970id.f359139j63);
            aVar.f291699d = (TextView) inflate.findViewById(C0966R.C0970id.j7l);
            aVar.f291700e = (TextView) inflate.findViewById(C0966R.C0970id.kem);
            aVar.f291701f = inflate.findViewById(C0966R.C0970id.c7p);
            aVar.f291702g = (ImageView) inflate.findViewById(C0966R.C0970id.kte);
            aVar.f291703h = (ImageView) inflate.findViewById(C0966R.C0970id.ole);
            aVar.f291704i = (ImageView) inflate.findViewById(C0966R.C0970id.hl4);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            Class cls = C99261r.class;
            Class cls2 = C32735h.class;
            if (!WeChatBrands.Business.Entries.GlobalAppbrand.checkAvailable(view.getContext())) {
                return true;
            }
            C99490d dVar = (C99490d) bVar;
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            C99490d dVar2 = C99490d.this;
            String str = dVar2.f291689r.f239032u;
            dVar2.getClass();
            C99490d dVar3 = C99490d.this;
            dVar3.f291687p = dVar3.f291689r.f239031t;
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            AppBrandRecentTaskInfo appBrandRecentTaskInfo = dVar.f291689r;
            aVar.f9526a = appBrandRecentTaskInfo.f239031t;
            aVar.f9528c = appBrandRecentTaskInfo.f239035x;
            aVar.f9538m = true;
            aVar.f9529d = ExtStorageMigrateRoutine.NOTIFICATION_TASK_ID;
            int i = 0;
            int i2 = (!C90159e.m112823b(dVar3.f291691t, 4) || ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32737c.relievedbuy, 0) != 1) ? 0 : 1;
            if (C90159e.m112822a(C99490d.this.f291692u, 4) && ((C32735h) C86312j.m106911c(cls2)).mo58779Qe(C32735h.C32738b.wxapp_flagship_store, 0) == 1) {
                i = 1;
            }
            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
            StringBuilder sb = new StringBuilder();
            sb.append("1:");
            sb.append(i2);
            sb.append(XVFSFile.PATH_SEPARATOR);
            C99490d.this.getClass();
            sb.append(C99252h.f291030c);
            sb.append(XVFSFile.PATH_SEPARATOR);
            C99490d.this.getClass();
            sb.append(C99252h.f291031d);
            sb.append(XVFSFile.PATH_SEPARATOR);
            sb.append(C99252h.m129297b());
            sb.append(XVFSFile.PATH_SEPARATOR);
            sb.append(i);
            aVar2.f9530e = sb.toString();
            startAppBrandUIFromOuterEvent.publish();
            mo35141a(C99490d.this.mo35139k(), C99490d.this.f291688q);
            ((C99261r) C86312j.m106911c(cls)).rv0(dVar.f291689r.f239031t, dVar.f291690s.toString(), dVar.f291689r.f239033v, 19);
            ((C99261r) C86312j.m106911c(cls)).mo23817hN(dVar);
            return true;
        }
    }

    public C99490d(int i) {
        super(9, i);
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22019b.C22020a aVar, Object... objArr) {
        AppBrandRecentTaskInfo x5 = ((C101649q0) C86312j.m106911c(C101649q0.class)).mo60645x5(this.f291688q.f292151e);
        this.f291689r = x5;
        if (x5 != null) {
            int i = this.f291688q.f292149c;
            boolean z = true;
            boolean z2 = false;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                } else {
                    z2 = true;
                }
            }
            this.f291690s = C99254i.m129308e(C99667f.m130091d(x5.f239032u, this.f62327e, z, z2)).f292107a;
            AppBrandRecentTaskInfo appBrandRecentTaskInfo = this.f291689r;
            this.f62336n = appBrandRecentTaskInfo.f239031t;
            this.f291691t = appBrandRecentTaskInfo.f239027A;
            this.f291692u = appBrandRecentTaskInfo.f239028B;
            this.f291693v = appBrandRecentTaskInfo.f239029C;
        }
    }

    /* renamed from: b */
    public String mo35130b() {
        return this.f291689r.f239031t;
    }

    /* renamed from: d */
    public String mo35132d() {
        return this.f291689r.f239032u;
    }

    /* renamed from: g */
    public int mo35135g() {
        return this.f291688q.f292164r;
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f291694w;
    }

    /* renamed from: i */
    public String mo35137i() {
        return this.f291687p;
    }
}
