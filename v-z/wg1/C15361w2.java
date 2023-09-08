package wg1;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import eh1.C7652a;
import f40.C86709a0;
import gy3.C8480h;
import ht1.C60172g4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import je1.C9363p2;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import o40.C61926c;
import qo3.C77407n;
import te3.C49098d51;
import te3.C49801i51;
import tf0.C64916p1;
import zc1.C66785b;

/* renamed from: wg1.w2 */
public final class C15361w2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15370z1 f41713d;

    /* renamed from: wg1.w2$a */
    public static final class C15362a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C15370z1 f41714d;

        public C15362a(C15370z1 z1Var) {
            this.f41714d = z1Var;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            if (e0Var.mo107176v()) {
                e0Var.mo107140d(1, this.f41714d.getActivity().getResources().getColor(C0966R.color.f2966ao), this.f41714d.getActivity().getResources().getString(C0966R.string.f360650ls1));
            }
        }
    }

    /* renamed from: wg1.w2$b */
    public static final class C15363b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C15370z1 f41715d;

        /* renamed from: wg1.w2$b$a */
        public static final class C15364a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C15370z1 f41716d;

            /* renamed from: e */
            public final /* synthetic */ C49098d51 f41717e;

            /* renamed from: f */
            public final /* synthetic */ C7652a f41718f;

            public C15364a(C15370z1 z1Var, C49098d51 d512, C7652a aVar) {
                this.f41716d = z1Var;
                this.f41717e = d512;
                this.f41718f = aVar;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initView$9$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C15370z1 z1Var = this.f41716d;
                C49098d51 d512 = this.f41717e;
                String obj = this.f41718f.f25985M.getText().toString();
                z1Var.getClass();
                String O5 = C66785b.f191882e.mo90662O5();
                C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(z1Var.getActivity());
                C86709a0.m107524d().mo123460f(new C9363p2(O5, d512, 1, gr02 != null ? gr02.mo12861q3() : null, (LinkedList) null, (C49801i51) null, obj, 48, (C8480h) null));
                C54108o oVar = (C54108o) C86312j.m106911c(C54108o.class);
                C54067f0.C0050b0 b0Var = C54067f0.C0050b0.LIVE_CANCEL_BOOK;
                String str = d512.f132121g;
                if (str == null) {
                    str = "";
                }
                oVar.mo9608aH(b0Var, "", str);
                C61926c.m72668M(new C15366x2(true, z1Var, (DialogInterface.OnCancelListener) null));
                this.f41718f.mo140680z();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initView$9$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C15363b(C15370z1 z1Var) {
            this.f41715d = z1Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            if ((r3 != null && r3.f138533e == 0) == false) goto L_0x0032;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMMMenuItemSelected(android.view.MenuItem r7, int r8) {
            /*
                r6 = this;
                int r7 = r7.getItemId()
                r8 = 1
                if (r7 != r8) goto L_0x003f
                wg1.z1 r7 = r6.f41715d
                wg1.l4$a r0 = r7.f41739N
                if (r0 == 0) goto L_0x003f
                te3.d51 r0 = r0.f41643b
                if (r0 == 0) goto L_0x003f
                eh1.a r1 = new eh1.a
                android.app.Activity r2 = r7.getContext()
                te3.nc3 r3 = r0.f132128q
                r4 = 0
                if (r3 == 0) goto L_0x0022
                boolean r5 = r3.f138532d
                if (r5 != r8) goto L_0x0022
                r5 = 1
                goto L_0x0023
            L_0x0022:
                r5 = 0
            L_0x0023:
                if (r5 == 0) goto L_0x0031
                if (r3 == 0) goto L_0x002d
                int r3 = r3.f138533e
                if (r3 != 0) goto L_0x002d
                r3 = 1
                goto L_0x002e
            L_0x002d:
                r3 = 0
            L_0x002e:
                if (r3 != 0) goto L_0x0031
                goto L_0x0032
            L_0x0031:
                r8 = 0
            L_0x0032:
                r1.<init>(r2, r4, r8)
                r1.mo140655A()
                wg1.w2$b$a r8 = new wg1.w2$b$a
                r8.<init>(r7, r0, r1)
                r1.f25990S = r8
            L_0x003f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wg1.C15361w2.C15363b.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    public C15361w2(C15370z1 z1Var) {
        this.f41713d = z1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77407n nVar = new C77407n((Context) this.f41713d.getActivity(), 1, true);
        nVar.f225779n1 = true;
        C15370z1 z1Var = this.f41713d;
        nVar.f225771i = new C15362a(z1Var);
        nVar.f225782p = new C15363b(z1Var);
        nVar.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
