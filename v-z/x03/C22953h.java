package x03;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import o03.C21724i;
import p03.C21912d;
import p03.C21914h;
import p1081gi.C98121d;
import qo3.C77407n;
import te3.e54;
import te3.uh4;
import te3.w25;
import te3.xh4;
import u73.C90621r0;
import v73.C102158a;

/* renamed from: x03.h */
public abstract class C22953h extends RecyclerView.C16631z implements C22946a {

    /* renamed from: A */
    public xh4 f65949A;

    /* renamed from: B */
    public View.OnClickListener f65950B = new C22954a();

    /* renamed from: C */
    public boolean f65951C;

    /* renamed from: z */
    public C22947b f65952z;

    /* renamed from: x03.h$a */
    public class C22954a implements View.OnClickListener {
        public C22954a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C22953h.this.mo36165C(view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x03.h$b */
    public class C22955b implements C11182m0 {
        public C22955b(C22953h hVar) {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107135b(0, C0966R.string.kbe, C0966R.raw.bottomsheet_icon_transmit);
            e0Var.mo107135b(1, C0966R.string.kbf, C0966R.raw.bottomsheet_icon_moment);
        }
    }

    /* renamed from: x03.h$c */
    public class C22956c implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C22951f f65954d;

        /* renamed from: e */
        public final /* synthetic */ Context f65955e;

        /* renamed from: f */
        public final /* synthetic */ xh4 f65956f;

        /* renamed from: g */
        public final /* synthetic */ C22947b f65957g;

        /* renamed from: h */
        public final /* synthetic */ int f65958h;

        public C22956c(C22951f fVar, Context context, xh4 xh4, C22947b bVar, int i) {
            this.f65954d = fVar;
            this.f65955e = context;
            this.f65956f = xh4;
            this.f65957g = bVar;
            this.f65958h = i;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            e54 e54;
            byte[] bArr;
            e54 e542;
            Class cls = C21912d.class;
            C22953h hVar = C22953h.this;
            if (hVar.f65951C) {
                hVar.f65952z.mo24995y5().mo36219k();
                C22953h.this.f65951C = false;
            }
            C22953h.this.f65952z.mo24962R1();
            boolean z = true;
            if (menuItem.getItemId() == 1) {
                this.f65954d.mo36158n();
                C102531s sVar = C102531s.f301890b;
                Context context = this.f65955e;
                xh4 xh4 = this.f65956f;
                uh4 r4 = this.f65957g.mo24989r4();
                if (!(xh4 == null || r4 == null)) {
                    sVar.f301891a = xh4;
                    Intent intent = new Intent();
                    intent.putExtra("Ksnsupload_title", xh4.f64733o);
                    intent.putExtra("Ksnsupload_imgurl", xh4.f64736q);
                    intent.putExtra("Ksnsupload_link", xh4.f64732n);
                    intent.putExtra("KContentObjDesc", Util.isNullOrNil(xh4.f64734p) ? context.getString(C0966R.string.hta) : xh4.f64734p);
                    intent.putExtra("KlinkThumb_url", xh4.f64736q);
                    intent.putExtra("Ksnsupload_source", 1);
                    intent.putExtra("Ksnsupload_type", 16);
                    intent.putExtra("need_result", true);
                    w25 w25 = new w25();
                    w25.f259899d = xh4.f64729h;
                    w25.f259900e = xh4.f64743x;
                    w25.f259901f = r4.f64643j;
                    w25.f259902g = xh4.f64742w;
                    w25.f259903h = 100201;
                    w25.f259905j = xh4.f64732n;
                    w25.f259906n = xh4.f64733o;
                    w25.f259907o = xh4.f64734p;
                    w25.f259908p = xh4.f64736q;
                    w25.f259909q = xh4.f64737r;
                    w25.f259910r = xh4.f64738s;
                    w25.f259911s = xh4.f64739t;
                    w25.f259912t = xh4.f64740u;
                    w25.f259904i = xh4.f64744y;
                    w25.f259913u = xh4.f64745z;
                    LinkedList linkedList = new LinkedList();
                    linkedList.addAll(r4.f64647q);
                    linkedList.addAll(xh4.f64721W);
                    w25.f259914v = sVar.mo142144c(linkedList).toString();
                    w25.f259915w = C21914h.m25168p(xh4.f64703D).toString();
                    long j = xh4.f64712M;
                    w25.f259916x = j;
                    w25.f259917y = xh4.f64727f;
                    if (j == 100201 || j == 100203) {
                        z = false;
                    }
                    if (z && (e542 = r4.f64646p) != null) {
                        w25.f259918z = e542.f63775i;
                    }
                    try {
                        bArr = w25.toByteArray();
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoShareMgr", e, "", new Object[0]);
                        bArr = null;
                    }
                    if (bArr != null) {
                        intent.putExtra("KWebSearchInfo", bArr);
                    }
                    C88144b.m109795m(context, "sns", ".ui.SnsUploadUI", intent, 1024);
                }
                ((C21724i) ((C21912d) C86312j.m106911c(cls)).av0()).mo34016a(this.f65957g.mo24989r4(), this.f65956f, this.f65958h, 7, "");
            } else if (menuItem.getItemId() == 0) {
                this.f65954d.mo36158n();
                C102531s sVar2 = C102531s.f301890b;
                Context context2 = this.f65955e;
                xh4 xh42 = this.f65956f;
                uh4 r44 = this.f65957g.mo24989r4();
                sVar2.f301891a = xh42;
                C68070l.C68072b bVar = new C68070l.C68072b();
                bVar.f195582i = 5;
                bVar.f195570f = xh42.f64733o;
                bVar.f195574g = Util.isNullOrNil(xh42.f64734p) ? context2.getString(C0966R.string.hta) : xh42.f64734p;
                bVar.f195586j = xh42.f64732n;
                bVar.f195646y = xh42.f64736q;
                C90621r0 r0Var = new C90621r0();
                r0Var.f260345b = xh42.f64729h;
                r0Var.f260346c = xh42.f64743x;
                r0Var.f260347d = r44.f64643j;
                r0Var.f260348e = xh42.f64742w;
                r0Var.f260349f = 100201;
                r0Var.f260350g = xh42.f64732n;
                r0Var.f260351h = xh42.f64733o;
                r0Var.f260352i = xh42.f64734p;
                r0Var.f260353j = xh42.f64736q;
                r0Var.f260354k = xh42.f64737r;
                r0Var.f260355l = xh42.f64738s;
                r0Var.f260356m = xh42.f64739t;
                r0Var.f260357n = xh42.f64740u;
                r0Var.f260358o = xh42.f64744y;
                r0Var.f260359p = xh42.f64745z;
                LinkedList linkedList2 = new LinkedList();
                linkedList2.addAll(r44.f64647q);
                linkedList2.addAll(xh42.f64721W);
                r0Var.f260360q = sVar2.mo142144c(linkedList2).toString();
                r0Var.f260361r = C21914h.m25168p(xh42.f64703D).toString();
                long j2 = xh42.f64712M;
                r0Var.f260362s = j2;
                r0Var.f260363t = xh42.f64727f;
                if (((j2 == 100201 || j2 == 100203) ? false : true) && (e54 = r44.f64646p) != null) {
                    r0Var.f260364u = e54.f63775i;
                }
                bVar.mo93545f(r0Var);
                String s = C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null);
                Intent intent2 = new Intent();
                intent2.putExtra("Retr_Msg_Type", 2);
                intent2.putExtra("Retr_Msg_content", s);
                intent2.putExtra("Multi_Retr", true);
                intent2.putExtra("Retr_go_to_chattingUI", false);
                intent2.putExtra("Retr_show_success_tips", true);
                C88144b.m109802t(context2, ".ui.transmit.MsgRetransmitUI", intent2, 2048);
                ((C21724i) ((C21912d) C86312j.m106911c(cls)).av0()).mo34016a(this.f65957g.mo24989r4(), this.f65956f, this.f65958h, 6, "");
            }
        }
    }

    /* renamed from: x03.h$d */
    public class C22957d implements C77407n.C47880p {
        public C22957d() {
        }

        public void onDismiss() {
            C22953h hVar = C22953h.this;
            if (hVar.f65951C) {
                hVar.f65952z.mo24995y5().mo36219k();
                C22953h.this.f65951C = false;
            }
            C22953h.this.f65952z.mo24962R1();
        }
    }

    public C22953h(View view, C22947b bVar) {
        super(view);
        this.f65952z = bVar;
        mo36166D(view);
    }

    /* renamed from: A */
    public void mo36116A() {
        this.f65952z.mo24943A();
    }

    /* renamed from: B */
    public void mo36164B(View view) {
    }

    /* renamed from: C */
    public void mo36165C(View view) {
        if (this.f65952z.mo24981e2() != mo36118Z()) {
            this.f65952z.mo24967U2().f66023d = 2;
            this.f65952z.mo25017j1(mo36118Z());
            C102158a.m134600a(4);
            this.f65952z.mo24967U2().mo36206d(this.f65949A);
            ((C21724i) ((C21912d) C86312j.m106911c(C21912d.class)).av0()).mo34016a(this.f65952z.mo24989r4(), this.f65949A, mo36118Z(), 2, "");
            return;
        }
        mo36164B(view);
        if (mo36167E()) {
            mo36116A();
            this.f65952z.mo24943A();
            mo36117Y();
            this.f65952z.mo24974Y();
        }
    }

    /* renamed from: D */
    public void mo36166D(View view) {
    }

    /* renamed from: E */
    public boolean mo36167E() {
        return false;
    }

    /* renamed from: F */
    public abstract void mo36168F();

    /* renamed from: G */
    public void mo36169G(xh4 xh4) {
        this.f65949A = xh4;
        Log.m105925i("MicroMsg.TopStory.TopStoryBaseVideoHolder", "onBindItemHolder %s", xh4.f64725d);
        mo36168F();
    }

    /* renamed from: H */
    public void mo36170H(C22947b bVar, Context context, C22951f fVar, int i) {
        xh4 d = bVar.mo24946C6().mo36193d(i);
        ((C21724i) ((C21912d) C86312j.m106911c(C21912d.class)).av0()).mo34016a(bVar.mo24989r4(), d, i, 5, "");
        if (d != null) {
            if (this.f65952z.mo24995y5().mo36212d()) {
                this.f65952z.mo24995y5().mo36216h();
                this.f65951C = true;
            }
            C77407n nVar = new C77407n(context, 1, false);
            nVar.f225771i = new C22955b(this);
            nVar.f225782p = new C22956c(fVar, context, d, bVar, i);
            nVar.f225761d = new C22957d();
            nVar.mo107573q();
        }
    }

    /* renamed from: I */
    public void mo36171I(boolean z) {
        this.f65952z.mo24977a7(this.f65949A);
    }

    /* renamed from: Y */
    public void mo36117Y() {
        this.f65952z.mo24974Y();
    }

    /* renamed from: Z */
    public int mo36118Z() {
        return mo17363j() - this.f65952z.mo24951K0().mo36133O4();
    }

    /* renamed from: y */
    public abstract C22951f mo36172y();

    /* renamed from: z */
    public abstract View mo36173z();
}
