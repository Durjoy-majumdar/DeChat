package pf2;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45696d;
import f40.C86709a0;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kw0.C46746a;
import nf2.C47240a;
import p565ir.C60606n;
import sf0.C77702q0;
import sj3.C63941p;
import te3.C50117ke;
import te3.C50249le;
import te3.C51713vn0;
import te3.C52257zg;
import te3.C64273c21;

/* renamed from: pf2.b0 */
public final class C47469b0 extends C47466a {

    /* renamed from: B */
    public final String f127325B = "SmallLiveViewHolder";

    /* renamed from: C */
    public final Context f127326C;

    /* renamed from: D */
    public final MMNeat7extView f127327D;

    /* renamed from: E */
    public final TextView f127328E;

    /* renamed from: F */
    public final ImageView f127329F;

    /* renamed from: pf2.b0$a */
    public static final class C47470a implements C60606n.C60609c {

        /* renamed from: a */
        public final /* synthetic */ C47469b0 f127330a;

        /* renamed from: b */
        public final /* synthetic */ C52257zg f127331b;

        /* renamed from: c */
        public final /* synthetic */ String f127332c;

        public C47470a(C47469b0 b0Var, C52257zg zgVar, String str) {
            this.f127330a = b0Var;
            this.f127331b = zgVar;
            this.f127332c = str;
        }

        public void onLiveStatusCallback(long j, int i, Object obj) {
            if (j == 0) {
                Log.m105924i(this.f127330a.f127325B, "query fail, liveId = 0");
            }
            if (!this.f127331b.f145868f.equals(this.f127330a.f127327D.getTag(C0966R.C0970id.mxm))) {
                Log.m105924i(this.f127330a.f127325B, "recycled");
                return;
            }
            String str = "";
            if (obj != null && (obj instanceof C51713vn0)) {
                C51713vn0 vn02 = (C51713vn0) obj;
                if (!C77702q0.m93719b(vn02.f143575g)) {
                    str = String.valueOf(vn02.f143575g);
                }
            }
            if (C77702q0.m93719b(str)) {
                this.f127330a.f127328E.setVisibility(8);
            } else {
                this.f127330a.f127328E.setVisibility(0);
                this.f127330a.f127328E.setText(str);
            }
            if (obj != null && (obj instanceof C51713vn0)) {
                C51713vn0 vn03 = (C51713vn0) obj;
                if (vn03.f143572d != null) {
                    ((C45696d) C86709a0.m107533q(C45696d.class)).Ks0(this.f127331b.f145868f, vn03.f143572d);
                    C63941p pVar = C63941p.f181254a;
                    C64273c21 c212 = vn03.f143572d;
                    MMNeat7extView mMNeat7extView = this.f127330a.f127327D;
                    C87412m.m108593f(mMNeat7extView, "leftTextTv");
                    pVar.mo88712j(c212, mMNeat7extView, this.f127332c);
                }
            }
        }
    }

    /* renamed from: pf2.b0$b */
    public static final class C47471b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C52257zg f127333d;

        /* renamed from: e */
        public final /* synthetic */ C47469b0 f127334e;

        public C47471b(C52257zg zgVar, C47469b0 b0Var) {
            this.f127333d = zgVar;
            this.f127334e = b0Var;
        }

        public final void onClick(View view) {
            Class cls = C45696d.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/SmallLiveViewHolder$filling$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C63941p pVar = C63941p.f181254a;
            C52257zg zgVar = this.f127333d;
            FinderObject c = pVar.mo88705c(zgVar.f145868f, zgVar.f145867e);
            C52257zg zgVar2 = this.f127333d;
            pVar.mo88708f(14, zgVar2.f145868f, c, zgVar2.f145866d, this.f127334e.f127316z.f126807f.getUsername());
            int gg02 = ((C45696d) C86709a0.m107533q(cls)).gg0(this.f127334e.f127316z.f126807f.getUsername());
            C47469b0 b0Var = this.f127334e;
            ((C45696d) C86709a0.m107533q(cls)).mo70995gj(b0Var.f127326C, b0Var.f127316z.f126807f.getUsername(), this.f127333d.f145868f, 14, gg02);
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/SmallLiveViewHolder$filling$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47469b0(View view, C47240a aVar, C50117ke keVar) {
        super(view, aVar, keVar);
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(aVar, "outAdapter");
        C87412m.m108594g(keVar, "baseInfo");
        this.f127326C = view.getContext();
        this.f127327D = (MMNeat7extView) view.findViewById(C0966R.C0970id.f6202cs);
        this.f127328E = (TextView) view.findViewById(C0966R.C0970id.lzh);
        this.f127329F = (ImageView) view.findViewById(C0966R.C0970id.lze);
    }

    /* renamed from: y */
    public void mo72488y(C47472c cVar, int i) {
        C87412m.m108594g(cVar, "dataModel");
        C50249le leVar = cVar.f127336b;
        C52257zg zgVar = leVar.f137331P;
        if (zgVar == null) {
            Log.m105924i(this.f127325B, "detailInfo.finder_live == null");
            return;
        }
        C87412m.m108593f(zgVar, "detailInfo.finder_live");
        boolean z = !C77702q0.m93719b(leVar.f137343n) && !C77702q0.m93719b(leVar.f137328L);
        C47478f fVar = C47478f.f127353a;
        View view = this.f44854d;
        C87412m.m108593f(view, "itemView");
        fVar.mo72493a(view, i);
        C64273c21 Pr0 = ((C45696d) C86709a0.m107533q(C45696d.class)).Pr0(zgVar.f145868f);
        String str = z ? leVar.f137336d : zgVar.f145871i;
        C63941p pVar = C63941p.f181254a;
        MMNeat7extView mMNeat7extView = this.f127327D;
        C87412m.m108593f(mMNeat7extView, "leftTextTv");
        pVar.mo88712j(Pr0, mMNeat7extView, str);
        this.f127327D.setTag(C0966R.C0970id.mxm, zgVar.f145868f);
        pVar.mo88707e(zgVar.f145867e, zgVar.f145868f, new C47470a(this, zgVar, str));
        String str2 = z ? leVar.f137343n : zgVar.f145877r.f133134d;
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59361q = C0966R.C0969drawable.f4586h2;
        bVar.f59347c = true;
        C20828a.m22825b().mo32519h(str2, this.f127329F, bVar.mo32666a());
        C46746a.m52038k(C46746a.f125826a, this.f127329F, (float) C76577a.m92151b(this.f127326C, 2), false, false, 12, (Object) null);
        this.f44854d.setOnClickListener(new C47471b(zgVar, this));
    }
}
