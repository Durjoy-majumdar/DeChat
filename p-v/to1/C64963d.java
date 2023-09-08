package to1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import al3.C0086a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.maas.MJMaasCore;
import com.tencent.maas.model.MJTemplateMetadata;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.record.plugin.FinderTemplateListPlugin;
import com.tencent.p014mm.plugin.finder.video.plugin.view.RecordTypeSelectView;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightCircularProgressBar;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BaseScopePluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import ej3.C45662a;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import kr1.C109039b;
import kr1.C61148q;
import kr1.C99171k;
import lh2.C109344g0;
import lh2.C109360o0;
import lr1.C61382a;
import qh2.C101198e;
import qo3.C77389a;
import qo3.C77398g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.pr4;
import uo1.C14267a;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: to1.d */
public final class C64963d implements C109344g0, View.OnClickListener, MJMaasCore.TemplateServiceProvider {

    /* renamed from: d */
    public BaseScopePluginLayout f187049d;

    /* renamed from: e */
    public final Context f187050e;

    /* renamed from: f */
    public final C13601g f187051f = C36568h.m40985a(new C64965b(this));

    /* renamed from: g */
    public final C61148q f187052g;

    /* renamed from: h */
    public final C99171k f187053h;

    /* renamed from: i */
    public final ViewGroup f187054i;

    /* renamed from: j */
    public RecordConfigProvider f187055j;

    /* renamed from: n */
    public final FinderTemplateListPlugin f187056n;

    /* renamed from: o */
    public final C61382a f187057o;

    /* renamed from: p */
    public final C109360o0 f187058p;

    /* renamed from: q */
    public final ViewGroup f187059q;

    /* renamed from: r */
    public final View f187060r;

    /* renamed from: s */
    public final View f187061s;

    /* renamed from: t */
    public final View f187062t;

    /* renamed from: u */
    public final ArrayList<C109344g0> f187063u;

    /* renamed from: v */
    public final ViewGroup f187064v;

    /* renamed from: w */
    public boolean f187065w;

    /* renamed from: x */
    public boolean f187066x;

    /* renamed from: y */
    public boolean f187067y;

    /* renamed from: z */
    public pr4 f187068z;

    /* renamed from: to1.d$a */
    public static final class C64964a implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C64963d f187069d;

        public C64964a(C64963d dVar) {
            this.f187069d = dVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/record/plugin/FinderRecordControlPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            boolean onTouchEvent = this.f187069d.f187058p.f327380f.onTouchEvent(motionEvent);
            C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/finder/record/plugin/FinderRecordControlPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return onTouchEvent;
        }
    }

    /* renamed from: to1.d$b */
    public static final class C64965b extends C87413o implements C32224a<C77398g> {

        /* renamed from: d */
        public final /* synthetic */ C64963d f187070d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64965b(C64963d dVar) {
            super(0);
            this.f187070d = dVar;
        }

        public Object invoke() {
            Context context = this.f187070d.f187050e;
            C77389a aVar = new C77389a();
            aVar.f225660q = C0086a.m38a(context).getString(C0966R.string.d6j);
            aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.a4h);
            aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.f360090a14);
            C64963d dVar = this.f187070d;
            aVar.f225621D = new C64968e(dVar);
            aVar.f225620C = new C64969f(dVar);
            C77398g gVar = new C77398g(context, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.setOnDismissListener(new C64970g(this.f187070d));
            return gVar;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.plugin.FinderRecordControlPlugin$onBackPress$1", mo125469f = "FinderRecordControlPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: to1.d$c */
    public static final class C64966c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C64963d f187071d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64966c(C64963d dVar, C15601d<? super C64966c> dVar2) {
            super(2, dVar2);
            this.f187071d = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C64966c(this.f187071d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64966c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f187071d.f187053h.mo138537a();
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.plugin.FinderRecordControlPlugin$recordTimeNotEnough$2", mo125469f = "FinderRecordControlPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: to1.d$d */
    public static final class C64967d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C64963d f187072d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64967d(C64963d dVar, C15601d<? super C64967d> dVar2) {
            super(2, dVar2);
            this.f187072d = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C64967d(this.f187072d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64967d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C64963d dVar = this.f187072d;
            dVar.f187058p.mo160558o(dVar.f187052g.f174085d.size());
            this.f187072d.f187058p.mo160561r();
            this.f187072d.reset();
            return C13598b0.f38549a;
        }
    }

    public C64963d(BaseScopePluginLayout baseScopePluginLayout) {
        C87412m.m108594g(baseScopePluginLayout, "pluginLayout");
        this.f187049d = baseScopePluginLayout;
        this.f187050e = baseScopePluginLayout.getContext();
        C61148q qVar = new C61148q(this.f187049d);
        this.f187052g = qVar;
        View findViewById = this.f187049d.findViewById(C0966R.C0970id.lxi);
        C87412m.m108593f(findViewById, "pluginLayout.findViewById(R.id.close_page_img)");
        this.f187053h = new C99171k((WeImageView) findViewById, this.f187049d, (View) null);
        this.f187054i = (ViewGroup) this.f187049d.findViewById(C0966R.C0970id.ii6);
        FinderTemplateListPlugin finderTemplateListPlugin = new FinderTemplateListPlugin(this.f187049d);
        this.f187056n = finderTemplateListPlugin;
        View findViewById2 = this.f187049d.findViewById(C0966R.C0970id.iid);
        C87412m.m108593f(findViewById2, "pluginLayout.findViewById(R.id.record_type_view)");
        this.f187057o = new C61382a((RecordTypeSelectView) findViewById2, this.f187049d);
        BaseScopePluginLayout baseScopePluginLayout2 = this.f187049d;
        C109360o0 o0Var = new C109360o0(baseScopePluginLayout2, baseScopePluginLayout2);
        o0Var.f327396y = false;
        this.f187058p = o0Var;
        ViewGroup viewGroup = (ViewGroup) this.f187049d.findViewById(C0966R.C0970id.lyb);
        this.f187059q = viewGroup;
        BaseScopePluginLayout baseScopePluginLayout3 = this.f187049d;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.f357508a81);
        C87412m.m108593f(findViewById3, "templateLayout.findViewById(R.id.beauty_effect)");
        new C109039b(baseScopePluginLayout3, findViewById3, this.f187049d);
        View findViewById4 = this.f187049d.findViewById(C0966R.C0970id.lxj);
        this.f187060r = findViewById4;
        View findViewById5 = this.f187049d.findViewById(C0966R.C0970id.m7u);
        this.f187061s = findViewById5;
        this.f187062t = this.f187049d.findViewById(C0966R.C0970id.m7w);
        ArrayList<C109344g0> arrayList = new ArrayList<>();
        arrayList.add(o0Var);
        arrayList.add(qVar);
        this.f187063u = arrayList;
        this.f187064v = (ViewGroup) this.f187049d.findViewById(C0966R.C0970id.m7l);
        findViewById5.setOnClickListener(this);
        findViewById4.setOnClickListener(this);
        this.f187049d.findViewById(C0966R.C0970id.m7k).setOnClickListener(this);
        this.f187049d.findViewById(C0966R.C0970id.m7m).setOnClickListener(this);
        finderTemplateListPlugin.f160702n.f187111f = new C64964a(this);
    }

    /* renamed from: a */
    public final int mo89130a() {
        if (this.f187065w || this.f187066x) {
            return 3;
        }
        return this.f187057o.f174589g ? 2 : 1;
    }

    /* renamed from: b */
    public final Object mo89131b(C15601d<? super C13598b0> dVar) {
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C64967d(this, (C15601d<? super C64967d>) null), dVar);
        return g == C15911a.COROUTINE_SUSPENDED ? g : C13598b0.f38549a;
    }

    /* renamed from: c */
    public final void mo89132c() {
        this.f187053h.setVisibility(4);
        View view = this.f187060r;
        C87412m.m108593f(view, "templateCloseBtn");
        C45662a.m50855a(view, 0.0f, 0, (C32224a) null, 7, (Object) null);
        this.f187056n.setVisibility(0);
        this.f187057o.setVisibility(4);
        ViewGroup viewGroup = this.f187059q;
        C87412m.m108593f(viewGroup, "templateLayout");
        C45662a.m50856b(viewGroup, 0, 0, (C32224a) null, 7, (Object) null);
    }

    /* renamed from: d */
    public final void mo89133d(boolean z) {
        Log.m105924i("MicroMsg.FinderRecordControlPlugin", "switchToEmptyTemplate:" + z);
        this.f187065w = z ^ true;
        this.f187067y = z;
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (this.f187052g.f174085d.size() > 0) {
            BaseScopePluginLayout baseScopePluginLayout = this.f187049d;
            C53896h0 h0Var = C53872d1.f151117a;
            BaseScopePluginLayout.m119451m(baseScopePluginLayout, C58901s.f168555a, (C53934p0) null, new C64966c(this, (C15601d<? super C64966c>) null), 2, (Object) null);
            return true;
        }
        Iterator<C109344g0> it = this.f187063u.iterator();
        while (it.hasNext()) {
            C109344g0 next = it.next();
            if (next.mo78564e()) {
                Log.m105924i("MicroMsg.FinderRecordControlPlugin", "plugin:" + next.name() + " handle back press");
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo89134f() {
        this.f187065w = true;
        this.f187053h.setVisibility(0);
        View view = this.f187060r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/record/plugin/FinderRecordControlPlugin", "templateFollowMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/record/plugin/FinderRecordControlPlugin", "templateFollowMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ViewGroup viewGroup = this.f187059q;
        C87412m.m108593f(viewGroup, "templateLayout");
        C45662a.m50856b(viewGroup, 0, 0, (C32224a) null, 7, (Object) null);
        this.f187058p.mo160553j();
        this.f187056n.setVisibility(0);
        this.f187057o.setVisibility(4);
    }

    /* renamed from: g */
    public final void mo89135g(int i) {
        Log.m105924i("MicroMsg.FinderRecordControlPlugin", "updateMaxRecordTimeMs " + i);
        C109360o0 o0Var = this.f187058p;
        RecordConfigProvider recordConfigProvider = this.f187055j;
        C87412m.m108591d(recordConfigProvider);
        int i2 = recordConfigProvider.f272935w + 250;
        if (i > i2) {
            i = i2;
        }
        o0Var.f327384j = i;
    }

    public String name() {
        return C64963d.class.getName();
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
        C117292a.m165356b("com/tencent/mm/plugin/finder/record/plugin/FinderRecordControlPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.m7u) {
            C14267a.f39802a.mo13637b("icon_shooting_template", "");
            this.f187065w = true;
            this.f187058p.mo160553j();
            mo89132c();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.lxj) {
            this.f187065w = false;
            this.f187067y = false;
            C101198e.C62622a.m73576a(this.f187049d, C101198e.C101199b.RECORD_SWITCH_SCREEN, (Bundle) null, 2, (Object) null);
            this.f187053h.setVisibility(0);
            View view2 = this.f187060r;
            C87412m.m108593f(view2, "templateCloseBtn");
            C45662a.m50856b(view2, 0, 0, (C32224a) null, 7, (Object) null);
            this.f187056n.setVisibility(4);
            this.f187057o.setVisibility(0);
            ViewGroup viewGroup = this.f187059q;
            C87412m.m108593f(viewGroup, "templateLayout");
            C45662a.m50855a(viewGroup, 0.0f, 0, (C32224a) null, 7, (Object) null);
            if (this.f187057o.f174589g) {
                this.f187058p.mo160555l();
            } else {
                this.f187058p.mo160554k();
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.m7k) {
            C101198e.C62622a.m73576a(this.f187049d, C101198e.C101199b.SUB_RECORD_FINISH, (Bundle) null, 2, (Object) null);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.m7m) {
            MMSightCircularProgressBar mMSightCircularProgressBar = this.f187058p.f327380f.f313791h;
            mMSightCircularProgressBar.f313750B = true;
            mMSightCircularProgressBar.postInvalidate();
            ((C77398g) ((C36570n) this.f187051f).getValue()).show();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/record/plugin/FinderRecordControlPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
    }

    public void onPause() {
        for (C109344g0 onPause : this.f187063u) {
            onPause.onPause();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public MJTemplateMetadata onRequestTemplateMetadata(String str) {
        C87412m.m108594g(str, "p0");
        return this.f187056n.onRequestTemplateMetadata(str);
    }

    public void onResume() {
        for (C109344g0 onResume : this.f187063u) {
            onResume.onResume();
        }
        Log.m105918d("MicroMsg.FinderRecordControlPlugin", "onResume, templateMode:" + this.f187065w);
        if (this.f187066x) {
            return;
        }
        if (this.f187065w || this.f187067y) {
            this.f187058p.mo160553j();
            mo89132c();
        }
    }

    public void release() {
    }

    public void reset() {
        this.f187058p.reset();
        if (mo89130a() != 3) {
            this.f187053h.setVisibility(0);
            if (this.f187052g.f174085d.isEmpty()) {
                this.f187057o.setVisibility(0);
                this.f187064v.setVisibility(4);
                ViewGroup viewGroup = this.f187059q;
                C87412m.m108593f(viewGroup, "templateLayout");
                C45662a.m50855a(viewGroup, 0.0f, 0, (C32224a) null, 7, (Object) null);
            }
        }
    }

    public void setVisibility(int i) {
        this.f187054i.clearAnimation();
        this.f187054i.setVisibility(i);
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
        this.f187055j = recordConfigProvider;
        this.f187058p.mo160527b(recordConfigProvider);
        byte[] byteArray = recordConfigProvider.f272912M.getByteArray("KEY_POST_VIDEO_TEMPLATE");
        boolean z = false;
        if (byteArray != null) {
            try {
                pr4 pr4 = new pr4();
                pr4.parseFrom(byteArray);
                Log.m105924i("MicroMsg.FinderRecordControlPlugin", "template:" + pr4.f139919d + " name:" + pr4.f139922g.f143760d);
                if (!TextUtils.isEmpty(pr4.f139919d)) {
                    this.f187068z = pr4;
                    mo89134f();
                    FinderTemplateListPlugin finderTemplateListPlugin = this.f187056n;
                    String str = pr4.f139919d;
                    C87412m.m108593f(str, "template.id");
                    finderTemplateListPlugin.getClass();
                    BaseScopePluginLayout.m119451m(finderTemplateListPlugin.f160695d, (C66212f) null, (C53934p0) null, new C64978p(str, finderTemplateListPlugin, (C15601d<? super C64978p>) null), 3, (Object) null);
                    z = true;
                    this.f187066x = true;
                }
            } catch (Exception unused) {
            }
        }
        if (!z) {
            FinderTemplateListPlugin finderTemplateListPlugin2 = this.f187056n;
            BaseScopePluginLayout.m119451m(finderTemplateListPlugin2.f160695d, (C66212f) null, (C53934p0) null, new C64982r(finderTemplateListPlugin2, (C15601d<? super C64982r>) null), 3, (Object) null);
        }
    }
}
