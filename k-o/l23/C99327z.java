package l23;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c23.C67333e;
import c23.C92334b;
import c23.C92335c;
import c23.C92336d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder;
import com.tencent.p014mm.plugin.vlog.model.C106195f0;
import com.tencent.p014mm.plugin.vlog.model.C30517h0;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import d23.C106976a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import l23.C99310q;
import lh2.C109344g0;
import qh2.C101198e;
import rr3.C110625c0;
import rr3.C110632i;
import rr3.C110642r;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: l23.z */
public final class C99327z implements C109344g0, View.OnClickListener {

    /* renamed from: d */
    public ViewGroup f291245d;

    /* renamed from: e */
    public C101198e f291246e;

    /* renamed from: f */
    public final C106195f0 f291247f;

    /* renamed from: g */
    public final C109202j f291248g;

    /* renamed from: h */
    public final ImageView f291249h;

    /* renamed from: i */
    public final EditorPanelHolder f291250i;

    /* renamed from: j */
    public final EditorPanelHolder f291251j;

    /* renamed from: n */
    public final C13601g f291252n = C36568h.m40985a(new C99331d(this));

    /* renamed from: o */
    public final C13601g f291253o = C36568h.m40985a(new C99332e(this));

    /* renamed from: p */
    public final C76663o f291254p = new C76663o();

    /* renamed from: q */
    public final GridLayoutManager f291255q = new GridLayoutManager(this.f291245d.getContext(), 5);

    /* renamed from: r */
    public final C92335c f291256r = new C92335c();

    /* renamed from: s */
    public C92334b f291257s;

    /* renamed from: t */
    public final C99310q f291258t;

    /* renamed from: u */
    public boolean f291259u;

    /* renamed from: l23.z$a */
    public static final class C99328a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C99327z f291260d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99328a(C99327z zVar) {
            super(1);
            this.f291260d = zVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C101198e.C62622a.m73576a(this.f291260d.f291246e, C101198e.C101199b.EDIT_FINISH_PAG_MAGIC, (Bundle) null, 2, (Object) null);
            } else if (!this.f291260d.f291251j.mo151464b()) {
                C101198e.C62622a.m73576a(this.f291260d.f291246e, C101198e.C101199b.EDIT_IN_PREVIEW, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l23.z$b */
    public static final class C99329b extends GridLayoutManager.C0127b {

        /* renamed from: b */
        public final /* synthetic */ C99327z f291261b;

        public C99329b(C99327z zVar) {
            this.f291261b = zVar;
        }

        /* renamed from: c */
        public int mo118c(int i) {
            return this.f291261b.f291254p.getItemViewType(i) == 1 ? 5 : 1;
        }
    }

    /* renamed from: l23.z$c */
    public static final class C99330c extends C87413o implements C32227p<Integer, C67333e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C99327z f291262d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99330c(C99327z zVar) {
            super(2);
            this.f291262d = zVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C110625c0 c0Var;
            ((Number) obj).intValue();
            C67333e eVar = (C67333e) obj2;
            C87412m.m108594g(eVar, "item");
            if (eVar instanceof C92336d) {
                EffectManager effectManager = C106976a.f320215h;
                if (effectManager != null) {
                    C110632i iVar = C110632i.PAGGlobalAnimateEffect;
                    AssetManager assets = this.f291262d.f291245d.getContext().getAssets();
                    C87412m.m108593f(assets, "parent.context.assets");
                    c0Var = effectManager.mo154928h(iVar, assets, ((C92336d) eVar).f264203b.f264194a);
                } else {
                    c0Var = null;
                }
                EffectManager effectManager2 = C106976a.f320215h;
                if (effectManager2 != null) {
                    effectManager2.mo154923c(c0Var);
                }
                C110642r rVar = c0Var instanceof C110642r ? (C110642r) c0Var : null;
                long j = rVar != null ? rVar.f331004e : 0;
                C109202j jVar = this.f291262d.f291248g;
                jVar.mo160461y();
                VideoCompositionPlayView videoCompositionPlayView = jVar.f326970j;
                C87412m.m108591d(videoCompositionPlayView);
                long position = videoCompositionPlayView.getPosition();
                long j2 = position + j;
                if (j2 > this.f291262d.f291247f.f316438t.mo134613j()) {
                    j2 = this.f291262d.f291247f.f316438t.mo134613j();
                    position = Math.max(j2 - j, 0);
                }
                long j3 = position;
                if (c0Var != null) {
                    c0Var.mo162189b(j3, j2);
                }
                long j4 = j2;
                C92334b bVar = r5;
                long j5 = j3;
                long j6 = j;
                C92334b bVar2 = new C92334b(((C92336d) eVar).f264203b, c0Var, j3, j2, 0, 16, (C8480h) null);
                StringBuilder sb = new StringBuilder();
                sb.append("add magic: ");
                sb.append(c0Var);
                sb.append(", ");
                sb.append(c0Var != null ? Long.valueOf(c0Var.f330967a) : null);
                sb.append(", ");
                sb.append(j5);
                sb.append(", ");
                sb.append(j4);
                sb.append(", ");
                sb.append(j6);
                Log.m105924i("MicroMsg.MultiEditMagicPlugin", sb.toString());
                C92335c cVar = this.f291262d.f291256r;
                cVar.getClass();
                C92334b bVar3 = bVar;
                cVar.f264201a.add(0, bVar3);
                bVar3.f264200f = cVar.f264201a.size();
                C99327z zVar = this.f291262d;
                zVar.f291254p.mo106929c(zVar.f291256r.mo126327a());
                C99327z.m129483a(this.f291262d, bVar3);
                this.f291262d.f291250i.setShow(false);
            } else if (eVar instanceof C92334b) {
                C99327z.m129483a(this.f291262d, (C92334b) eVar);
                this.f291262d.f291250i.setShow(false);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l23.z$d */
    public static final class C99331d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C99327z f291263d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99331d(C99327z zVar) {
            super(0);
            this.f291263d = zVar;
        }

        public Object invoke() {
            return LayoutInflater.from(this.f291263d.f291245d.getContext()).inflate(C0966R.C0971layout.a0t, this.f291263d.f291250i, false);
        }
    }

    /* renamed from: l23.z$e */
    public static final class C99332e extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C99327z f291264d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99332e(C99327z zVar) {
            super(0);
            this.f291264d = zVar;
        }

        public Object invoke() {
            return (RecyclerView) ((View) ((C36570n) this.f291264d.f291252n).getValue()).findViewById(C0966R.C0970id.f357896cc0);
        }
    }

    public C99327z(ViewGroup viewGroup, C101198e eVar, C106195f0 f0Var, C109202j jVar) {
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        C87412m.m108594g(f0Var, "model");
        C87412m.m108594g(jVar, "previewPlugin");
        this.f291245d = viewGroup;
        this.f291246e = eVar;
        this.f291247f = f0Var;
        this.f291248g = jVar;
        ImageView imageView = (ImageView) viewGroup.findViewById(C0966R.C0970id.cbz);
        this.f291249h = imageView;
        EditorPanelHolder editorPanelHolder = (EditorPanelHolder) this.f291245d.findViewById(C0966R.C0970id.ccm);
        this.f291250i = editorPanelHolder;
        EditorPanelHolder editorPanelHolder2 = (EditorPanelHolder) this.f291245d.findViewById(C0966R.C0970id.ccn);
        this.f291251j = editorPanelHolder2;
        C87412m.m108593f(editorPanelHolder2, "timePanelHolder");
        C99310q qVar = new C99310q(editorPanelHolder2, this.f291246e);
        this.f291258t = qVar;
        imageView.setImageDrawable(C74933u4.m89768e(this.f291245d.getContext(), C0966R.raw.icons_filled_magic, C76577a.m92153d(this.f291245d.getContext(), C0966R.color.f356996ai0)));
        imageView.setOnClickListener(this);
        jVar.mo160452K(qVar);
        editorPanelHolder.setOnVisibleChangeCallback(new C99328a(this));
    }

    /* renamed from: a */
    public static final void m129483a(C99327z zVar, C92334b bVar) {
        zVar.f291257s = bVar;
        zVar.f291248g.mo160455N(bVar.f264198d, bVar.f264199e);
        C99310q qVar = zVar.f291258t;
        long j = bVar.f264198d;
        long j2 = bVar.f264199e;
        qVar.f291221o = j;
        qVar.f291222p = j2;
        qVar.f291223q = j;
        qVar.f291224r = j2;
        C96552p0 p0Var = zVar.f291247f.f316438t;
        C87412m.m108594g(p0Var, "composition");
        if (!qVar.f291220n) {
            qVar.f291220n = true;
            qVar.f291213d.setCloseTouchOutside(false);
            ((TimeCropViewGroup) ((C36570n) qVar.f291217h).getValue()).setCallback(qVar.f291226t);
            ((TimeCropViewGroup) ((C36570n) qVar.f291217h).getValue()).setRealTimeCallback(qVar.f291226t);
            qVar.f291213d.setOnVisibleChangeCallback(new C99317r(qVar));
            ((View) ((C36570n) qVar.f291218i).getValue()).setOnClickListener(new C99320s(qVar));
            ((View) ((C36570n) qVar.f291219j).getValue()).setOnClickListener(new C99321t(qVar));
            qVar.mo138711a().findViewById(C0966R.C0970id.gk4).setOnClickListener(new C99322u(qVar));
            qVar.mo138711a().findViewById(C0966R.C0970id.gk5).setOnClickListener(new C99323v(qVar));
        }
        long j3 = (long) 1000;
        if (qVar.f291222p > p0Var.mo134614k().getEndUs() / j3) {
            long endUs = p0Var.mo134614k().getEndUs() / j3;
            qVar.f291222p = endUs;
            qVar.f291224r = endUs;
        }
        ((TimeCropViewGroup) ((C36570n) qVar.f291217h).getValue()).mo152236b(p0Var, qVar.f291221o, qVar.f291222p);
        qVar.f291213d.setShow(true);
        zVar.f291258t.f291225s = new C99297a0(zVar);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (this.f291250i.mo151464b()) {
            this.f291250i.setShow(false);
            return true;
        } else if (!this.f291251j.mo151464b()) {
            return false;
        } else {
            C99310q qVar = this.f291258t;
            long j = qVar.f291221o;
            qVar.f291223q = j;
            long j2 = qVar.f291222p;
            qVar.f291224r = j2;
            C99310q.C99311a aVar = qVar.f291225s;
            if (aVar != null) {
                aVar.mo138698b(j, j2);
            }
            C99310q.C99311a aVar2 = qVar.f291225s;
            if (aVar2 != null) {
                aVar2.onFinish();
            }
            this.f291251j.setShow(false);
            return true;
        }
    }

    public String name() {
        return C99327z.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditMagicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f291250i.mo151464b()) {
            this.f291250i.setShow(false);
        } else {
            if (!this.f291259u) {
                this.f291259u = true;
                EditorPanelHolder editorPanelHolder = this.f291250i;
                C87412m.m108593f(editorPanelHolder, "panelHolder");
                View view2 = (View) ((C36570n) this.f291252n).getValue();
                C87412m.m108593f(view2, "panelRoot");
                EditorPanelHolder.m142603c(editorPanelHolder, view2, (ViewGroup.LayoutParams) null, 2, (Object) null);
                this.f291250i.setCloseTouchOutside(true);
                ((RecyclerView) ((C36570n) this.f291253o).getValue()).setAdapter(this.f291254p);
                ((RecyclerView) ((C36570n) this.f291253o).getValue()).setLayoutManager(this.f291255q);
                this.f291255q.f44666B = new C99329b(this);
                this.f291254p.f224353e = new C99330c(this);
            }
            this.f291254p.mo106929c(this.f291256r.mo126327a());
            this.f291250i.setShow(true);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditMagicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
    }

    public void setVisibility(int i) {
        if (C30517h0.m39114c()) {
            this.f291249h.setVisibility(i);
        } else {
            this.f291249h.setVisibility(8);
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
