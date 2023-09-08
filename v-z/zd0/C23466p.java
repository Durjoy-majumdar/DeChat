package zd0;

import ae0.C16456a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import at0.C79630a;
import be0.C0265d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gt0.C87370k0;
import gt0.C87375o0;
import gy3.C8479f0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lb0.C88394b;
import lb0.C88430i;
import p385u2.C111105a;
import rx3.C13598b0;
import rx3.C13604l;
import ud0.C22638d;

/* renamed from: zd0.p */
public class C23466p implements C87370k0 {

    /* renamed from: A */
    public CheckBox f67304A;

    /* renamed from: B */
    public TextView f67305B;

    /* renamed from: C */
    public View f67306C;

    /* renamed from: D */
    public List<C23474i> f67307D = new ArrayList();

    /* renamed from: E */
    public boolean f67308E;

    /* renamed from: F */
    public Integer f67309F;

    /* renamed from: G */
    public C87375o0 f67310G;

    /* renamed from: H */
    public C23488h f67311H;

    /* renamed from: I */
    public C32224a<C13598b0> f67312I;

    /* renamed from: J */
    public C23489q f67313J;

    /* renamed from: K */
    public String f67314K;

    /* renamed from: L */
    public String f67315L;

    /* renamed from: M */
    public String f67316M;

    /* renamed from: N */
    public boolean f67317N;

    /* renamed from: P */
    public String f67318P;

    /* renamed from: Q */
    public boolean f67319Q;

    /* renamed from: R */
    public String f67320R;

    /* renamed from: S */
    public int f67321S;

    /* renamed from: T */
    public C23485o f67322T;

    /* renamed from: U */
    public int f67323U;

    /* renamed from: d */
    public final Context f67324d;

    /* renamed from: e */
    public C23483m f67325e;

    /* renamed from: f */
    public final C23484n f67326f;

    /* renamed from: g */
    public View f67327g;

    /* renamed from: h */
    public FrameLayout f67328h;

    /* renamed from: i */
    public ScrollView f67329i;

    /* renamed from: j */
    public ImageView f67330j;

    /* renamed from: n */
    public TextView f67331n;

    /* renamed from: o */
    public TextView f67332o;

    /* renamed from: p */
    public TextView f67333p;

    /* renamed from: q */
    public TextView f67334q;

    /* renamed from: r */
    public Button f67335r;

    /* renamed from: s */
    public Button f67336s;

    /* renamed from: t */
    public View f67337t;

    /* renamed from: u */
    public FrameLayout f67338u;

    /* renamed from: v */
    public View f67339v;

    /* renamed from: w */
    public View f67340w;

    /* renamed from: x */
    public TextView f67341x;

    /* renamed from: y */
    public TextView f67342y;

    /* renamed from: z */
    public View f67343z;

    /* renamed from: zd0.p$a */
    public static final class C23467a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ C23466p f67344d;

        public C23467a(C23466p pVar) {
            this.f67344d = pVar;
        }

        public final void onGlobalLayout() {
            ViewParent parent = this.f67344d.f67327g.getParent();
            if (parent != null) {
                C23466p pVar = this.f67344d;
                ViewGroup viewGroup = (ViewGroup) parent;
                Object systemService = pVar.f67324d.getSystemService("window");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
                if (rotation != 1 && rotation != 3) {
                    int j = C76577a.m92159j(pVar.f67324d) - C76577a.m92151b(MMApplicationContext.getContext(), 60);
                    if (pVar.f67327g.getHeight() > j) {
                        pVar.f67327g.getLayoutParams().height = Math.min(j, pVar.f67327g.getHeight());
                        pVar.f67327g.requestLayout();
                    }
                } else if (pVar.f67327g.getLayoutParams().height != -2) {
                    pVar.f67327g.getLayoutParams().height = -2;
                    pVar.f67327g.requestLayout();
                }
            }
        }
    }

    /* renamed from: zd0.p$b */
    public static final class C23468b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ C23466p f67345d;

        public C23468b(C23466p pVar) {
            this.f67345d = pVar;
        }

        public final void onGlobalLayout() {
            if (this.f67345d.f67338u.getHeight() > 0) {
                this.f67345d.f67337t.getLayoutParams().height = this.f67345d.f67338u.getHeight();
            }
        }
    }

    /* renamed from: zd0.p$c */
    public static final class C23469c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C23466p f67346d;

        /* renamed from: e */
        public final /* synthetic */ List<C23474i> f67347e;

        public C23469c(C23466p pVar, List<? extends C23474i> list) {
            this.f67346d = pVar;
            this.f67347e = list;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C23466p pVar = this.f67346d;
            C23474i iVar = this.f67347e.get(0);
            if (!pVar.f67308E) {
                View a = C0265d.f821a.mo309a(pVar.f67324d, iVar.f67355c, 0);
                a.setId(View.generateViewId());
                pVar.f67309F = Integer.valueOf(a.getId());
                ((LinearLayout) pVar.f67337t.findViewById(C0966R.C0970id.f357785br0)).addView(a);
                View view2 = pVar.f67337t;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "showSample", "(Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$Item;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "showSample", "(Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$Item;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                pVar.f67305B.setText(pVar.f67315L);
                pVar.f67340w.setOnClickListener(new C23492w(pVar));
                pVar.f67337t.getViewTreeObserver().addOnGlobalLayoutListener(new C23493x(pVar));
                C23489q qVar = pVar.f67313J;
                if (qVar != null) {
                    qVar.mo22182a(iVar.f67356d, iVar.f67353a, ((ArrayList) pVar.f67307D).indexOf(iVar));
                }
                pVar.f67308E = true;
            }
            C117292a.m165361g(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zd0.p$d */
    public static final class C23470d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C23466p f67348d;

        public C23470d(C23466p pVar) {
            this.f67348d = pVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f67348d.mo36942e(1);
            this.f67348d.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zd0.p$e */
    public static final class C23471e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C23466p f67349d;

        public C23471e(C23466p pVar) {
            this.f67349d = pVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f67349d.cancel();
            C117292a.m165361g(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zd0.p$f */
    public static final class C23472f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C23466p f67350d;

        /* renamed from: e */
        public final /* synthetic */ List<C23474i> f67351e;

        public C23472f(C23466p pVar, List<? extends C23474i> list) {
            this.f67350d = pVar;
            this.f67351e = list;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CheckBox checkBox = this.f67350d.f67304A;
            checkBox.setChecked(!checkBox.isChecked());
            List<C23474i> list = this.f67351e;
            C23466p pVar = this.f67350d;
            for (C23474i iVar : list) {
                pVar.f67304A.isChecked();
                iVar.getClass();
            }
            C117292a.m165361g(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zd0.p$g */
    public static final class C23473g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C23466p f67352d;

        public C23473g(C23466p pVar) {
            this.f67352d = pVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f67352d.mo36942e(3);
            this.f67352d.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zd0.p$i */
    public static class C23474i {

        /* renamed from: a */
        public boolean f67353a;

        /* renamed from: b */
        public final String f67354b;

        /* renamed from: c */
        public final ArrayList<C13604l<String, String>> f67355c;

        /* renamed from: d */
        public final String f67356d;

        /* renamed from: e */
        public int f67357e;

        public C23474i(boolean z, String str, ArrayList<C13604l<String, String>> arrayList, String str2, int i) {
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(arrayList, "sampleWordings");
            C87412m.m108594g(str2, "templateId");
            this.f67353a = z;
            this.f67354b = str;
            this.f67355c = arrayList;
            this.f67356d = str2;
            this.f67357e = i;
        }
    }

    /* renamed from: zd0.p$j */
    public static final class C23475j extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public List<? extends C23474i> f67358d;

        /* renamed from: e */
        public final C23466p f67359e;

        /* renamed from: f */
        public final List<C23474i> f67360f;

        /* renamed from: zd0.p$j$a */
        public static final class C23476a extends RecyclerView.C16631z {

            /* renamed from: A */
            public WeImageView f67361A;

            /* renamed from: B */
            public MMSwitchBtn f67362B;

            /* renamed from: z */
            public TextView f67363z;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C23476a(View view) {
                super(view);
                C87412m.m108594g(view, "item");
                View findViewById = view.findViewById(C0966R.C0970id.f357845c22);
                C87412m.m108593f(findViewById, "itemView.findViewById(R.id.desc)");
                this.f67363z = (TextView) findViewById;
                View findViewById2 = view.findViewById(C0966R.C0970id.edw);
                C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.force_notify_iv)");
                this.f67361A = (WeImageView) findViewById2;
                View findViewById3 = view.findViewById(C0966R.C0970id.o3y);
                C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.switchBtn_force)");
                this.f67362B = (MMSwitchBtn) findViewById3;
            }
        }

        /* renamed from: zd0.p$j$b */
        public static final class C23477b extends RecyclerView.C16631z {

            /* renamed from: A */
            public MMSwitchBtn f67364A;

            /* renamed from: z */
            public TextView f67365z;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C23477b(View view) {
                super(view);
                C87412m.m108594g(view, "item");
                View findViewById = view.findViewById(C0966R.C0970id.f357845c22);
                C87412m.m108593f(findViewById, "itemView.findViewById(R.id.desc)");
                this.f67365z = (TextView) findViewById;
                View findViewById2 = view.findViewById(C0966R.C0970id.o3x);
                C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.switchBtn)");
                this.f67364A = (MMSwitchBtn) findViewById2;
            }
        }

        /* renamed from: zd0.p$j$c */
        public static final class C23478c implements MMSwitchBtn.C7041b {

            /* renamed from: a */
            public final /* synthetic */ C23475j f67366a;

            /* renamed from: b */
            public final /* synthetic */ RecyclerView.C16631z f67367b;

            /* renamed from: c */
            public final /* synthetic */ int f67368c;

            public C23478c(C23475j jVar, RecyclerView.C16631z zVar, int i) {
                this.f67366a = jVar;
                this.f67367b = zVar;
                this.f67368c = i;
            }

            public final void onStatusChange(boolean z) {
                this.f67366a.mo36962G4(z, this.f67367b, this.f67368c);
            }
        }

        /* renamed from: zd0.p$j$d */
        public static final class C23479d implements MMSwitchBtn.C7041b {

            /* renamed from: a */
            public final /* synthetic */ C23475j f67369a;

            /* renamed from: b */
            public final /* synthetic */ RecyclerView.C16631z f67370b;

            /* renamed from: c */
            public final /* synthetic */ int f67371c;

            public C23479d(C23475j jVar, RecyclerView.C16631z zVar, int i) {
                this.f67369a = jVar;
                this.f67370b = zVar;
                this.f67371c = i;
            }

            public final void onStatusChange(boolean z) {
                this.f67369a.mo36962G4(z, this.f67370b, this.f67371c);
            }
        }

        /* renamed from: zd0.p$j$e */
        public static final class C23480e implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C23474i f67372d;

            /* renamed from: e */
            public final /* synthetic */ C23475j f67373e;

            /* renamed from: f */
            public final /* synthetic */ int f67374f;

            /* renamed from: g */
            public final /* synthetic */ RecyclerView.C16631z f67375g;

            public C23480e(C23474i iVar, C23475j jVar, int i, RecyclerView.C16631z zVar) {
                this.f67372d = iVar;
                this.f67373e = jVar;
                this.f67374f = i;
                this.f67375g = zVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$ItemAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C23474i iVar = this.f67372d;
                ((C23481k) iVar).f67376f = !((C23481k) iVar).f67376f;
                C23475j jVar = this.f67373e;
                int i = this.f67374f;
                jVar.mo36961F4(i, ((C23481k) iVar).f67376f, true, (C23476a) this.f67375g, (C23474i) jVar.f67358d.get(i));
                C117292a.m165361g(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$ItemAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C23475j(List<? extends C23474i> list, C23466p pVar) {
            C87412m.m108594g(list, "items");
            C87412m.m108594g(pVar, "dialog");
            this.f67358d = list;
            this.f67359e = pVar;
            ArrayList arrayList = new ArrayList();
            this.f67360f = arrayList;
            List<? extends C23474i> list2 = this.f67358d;
            ArrayList arrayList2 = new ArrayList();
            for (T next : list2) {
                if (((C23474i) next).f67353a) {
                    arrayList2.add(next);
                }
            }
            arrayList.addAll(arrayList2);
            C23466p.m28046a(this.f67359e, this.f67360f.size(), ((C23474i) this.f67358d.get(0)).f67357e);
        }

        /* renamed from: F4 */
        public final void mo36961F4(int i, boolean z, boolean z2, C23476a aVar, C23474i iVar) {
            int i2;
            Resources resources;
            C23466p pVar;
            C23484n nVar;
            C23483m mVar = this.f67359e.f67325e;
            if (mVar != null) {
                mVar.mo22180a(C16142r.SWITCH_FORCE_NOTIFY, z, iVar, z2);
            }
            if (z2) {
                if (z) {
                    Object systemService = this.f67359e.f67324d.getSystemService("vibrator");
                    C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                    ((Vibrator) systemService).vibrate(10);
                    C23466p pVar2 = this.f67359e;
                    C23484n nVar2 = pVar2.f67326f;
                    if (nVar2 != null) {
                        nVar2.mo36964a(pVar2.f67324d, true);
                    }
                } else if (aVar.f67362B.f220433y && (nVar = pVar.f67326f) != null) {
                    nVar.mo36964a((pVar = this.f67359e).f67324d, false);
                }
            }
            if (z) {
                resources = aVar.f67361A.getContext().getResources();
                i2 = C0966R.color.afw;
            } else {
                resources = aVar.f67361A.getContext().getResources();
                i2 = C0966R.color.BW_0_Alpha_0_5;
            }
            int color = resources.getColor(i2);
            Drawable drawable = aVar.f44854d.getContext().getResources().getDrawable(z ? C0966R.raw.icons_bell_on : C0966R.raw.icons_outlined_bellring_close);
            C74933u4.m89769f(drawable, color);
            aVar.f67361A.setImageDrawable(drawable);
            aVar.f67361A.setIconColor(color);
        }

        /* renamed from: G4 */
        public final void mo36962G4(boolean z, RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "holder");
            if (zVar instanceof C23477b) {
                C23477b bVar = (C23477b) zVar;
                bVar.f67364A.setCheck(z);
                ((C23474i) this.f67358d.get(i)).f67353a = bVar.f67364A.f220433y;
                if (((C23474i) this.f67358d.get(i)).f67353a) {
                    ((ArrayList) this.f67360f).add(this.f67358d.get(i));
                } else {
                    ((ArrayList) this.f67360f).remove(this.f67358d.get(i));
                }
                C23466p.m28046a(this.f67359e, ((ArrayList) this.f67360f).size(), ((C23474i) this.f67358d.get(i)).f67357e);
            } else if (zVar instanceof C23476a) {
                C23476a aVar = (C23476a) zVar;
                aVar.f67362B.setCheck(z);
                boolean z2 = aVar.f67362B.f220433y;
                ((C23474i) this.f67358d.get(i)).f67353a = z2;
                aVar.f67361A.setVisibility(z2 ? 0 : 8);
                C23474i iVar = (C23474i) this.f67358d.get(i);
                if (iVar.f67353a) {
                    ((ArrayList) this.f67360f).add(iVar);
                } else {
                    ((ArrayList) this.f67360f).remove(iVar);
                    if (iVar instanceof C23481k) {
                        ((C23481k) iVar).f67376f = false;
                        mo36961F4(i, false, true, aVar, (C23474i) this.f67358d.get(i));
                    }
                }
                C23466p.m28046a(this.f67359e, ((ArrayList) this.f67360f).size(), iVar.f67357e);
            }
        }

        public int getItemCount() {
            return this.f67358d.size();
        }

        public int getItemViewType(int i) {
            return this.f67358d.get(i) instanceof C23481k ? 2 : 1;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "holder");
            if (zVar instanceof C23477b) {
                C23477b bVar = (C23477b) zVar;
                bVar.f67365z.setText(((C23474i) this.f67358d.get(i)).f67354b);
                bVar.f67364A.setCheck(((C23474i) this.f67358d.get(i)).f67353a);
                bVar.f67364A.setSwitchListener(new C23478c(this, zVar, i));
            } else if (zVar instanceof C23476a) {
                C23476a aVar = (C23476a) zVar;
                aVar.f67362B.setCheck(((C23474i) this.f67358d.get(i)).f67353a);
                aVar.f67363z.setText(((C23474i) this.f67358d.get(i)).f67354b);
                aVar.f67361A.setVisibility(((C23474i) this.f67358d.get(i)).f67353a ? 0 : 8);
                aVar.f67362B.setSwitchListener(new C23479d(this, zVar, i));
                C23474i iVar = (C23474i) this.f67358d.get(i);
                if (iVar instanceof C23481k) {
                    mo36961F4(i, ((C23481k) iVar).f67376f, false, aVar, (C23474i) this.f67358d.get(i));
                    aVar.f67361A.setOnClickListener(new C23480e(iVar, this, i, zVar));
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            if (i == 2) {
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c7n, (ViewGroup) null);
                C87412m.m108593f(inflate, "from(parent.context).inf…notify_item_layout, null)");
                return new C23476a(inflate);
            }
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c7o, (ViewGroup) null);
            C87412m.m108593f(inflate2, "from(parent.context).inf…be_msg_item_layout, null)");
            return new C23477b(inflate2);
        }
    }

    /* renamed from: zd0.p$k */
    public static final class C23481k extends C23474i {

        /* renamed from: f */
        public boolean f67376f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23481k(boolean z, String str, ArrayList<C13604l<String, String>> arrayList, String str2, boolean z2, int i) {
            super(z, str, arrayList, str2, i);
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(arrayList, "sampleWordings");
            C87412m.m108594g(str2, "templateId");
            this.f67376f = z2;
        }
    }

    /* renamed from: zd0.p$l */
    public static final class C23482l extends C23474i {

        /* renamed from: f */
        public final String f67377f;

        /* renamed from: g */
        public boolean f67378g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23482l(boolean z, String str, ArrayList<C13604l<String, String>> arrayList, String str2, String str3, int i) {
            super(z, str, arrayList, str2, i);
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(arrayList, "sampleWordings");
            C87412m.m108594g(str2, "templateId");
            C87412m.m108594g(str3, "voiceMediaUrl");
            this.f67377f = str3;
        }
    }

    /* renamed from: zd0.p$m */
    public interface C23483m {
        /* renamed from: a */
        void mo22180a(C16142r rVar, boolean z, C23474i iVar, boolean z2);

        /* renamed from: b */
        void mo22181b(int i, List<? extends C23474i> list);
    }

    /* renamed from: zd0.p$n */
    public interface C23484n {
        /* renamed from: a */
        void mo36964a(Context context, boolean z);
    }

    /* renamed from: zd0.p$o */
    public interface C23485o {
        void onDismiss();

        void onShow();
    }

    /* renamed from: zd0.p$q */
    public static final class C23486q implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ C23466p f67379d;

        public C23486q(C23466p pVar) {
            this.f67379d = pVar;
        }

        public void onGlobalLayout() {
            this.f67379d.f67327g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C23466p pVar = this.f67379d;
            if (pVar.f67311H == C23488h.Normal) {
                pVar.mo36938c(pVar.f67307D);
            }
        }
    }

    /* renamed from: zd0.p$p */
    public static final class C23487p extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f67380d = 2;

        /* renamed from: e */
        public final Paint f67381e;

        public C23487p(C23466p pVar) {
            C76577a.m92151b(MMApplicationContext.getContext(), 40);
            Paint paint = new Paint();
            this.f67381e = paint;
            paint.setColor(pVar.f67324d.getResources().getColor(C0966R.color.f3305n4));
            paint.setStyle(Paint.Style.FILL);
            paint.setFlags(1);
            paint.setStrokeWidth((float) 2);
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            if (recyclerView.mo17029N0(view) == 0) {
                int i = this.f67380d;
                rect.set(0, i, 0, i);
                return;
            }
            rect.set(0, 0, 0, this.f67380d);
        }

        /* renamed from: h */
        public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(canvas, "c");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            float paddingLeft = (float) recyclerView.getPaddingLeft();
            float width = (float) (recyclerView.getWidth() - recyclerView.getPaddingRight());
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                float bottom = ((float) childAt.getBottom()) + ((float) layoutParams2.bottomMargin) + ((float) this.f67380d);
                if (i == 0) {
                    float top = (((float) childAt.getTop()) + ((float) layoutParams2.topMargin)) - ((float) this.f67380d);
                    canvas.drawLine(paddingLeft, top, width, top, this.f67381e);
                }
                canvas.drawLine(paddingLeft, bottom, width, bottom, this.f67381e);
            }
        }
    }

    /* renamed from: zd0.p$h */
    public enum C23488h {
        Normal,
        SingleMode,
        SingleVoiceMode
    }

    public C23466p(Context context, List<? extends C23474i> list, C23483m mVar, boolean z, boolean z2, C23484n nVar) {
        Context context2 = context;
        List<? extends C23474i> list2 = list;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(list2, "items");
        this.f67324d = context2;
        this.f67325e = mVar;
        this.f67326f = nVar;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.c7q, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…msg_request_dialog, null)");
        this.f67327g = inflate;
        C23488h hVar = C23488h.Normal;
        this.f67311H = hVar;
        this.f67314K = "";
        this.f67315L = "";
        this.f67316M = "";
        this.f67317N = true;
        this.f67318P = "";
        this.f67319Q = true;
        this.f67320R = "";
        View findViewById = this.f67327g.findViewById(C0966R.C0970id.f358469fb1);
        C87412m.m108593f(findViewById, "mRootView.findViewById(R.id.item_list_container)");
        this.f67328h = (FrameLayout) findViewById;
        View findViewById2 = this.f67327g.findViewById(C0966R.C0970id.j48);
        C87412m.m108593f(findViewById2, "mRootView.findViewById(R.id.scroll_view)");
        this.f67329i = (ScrollView) findViewById2;
        View findViewById3 = this.f67327g.findViewById(C0966R.C0970id.f2a);
        C87412m.m108593f(findViewById3, "mRootView.findViewById(R.id.icon_iv)");
        this.f67330j = (ImageView) findViewById3;
        View findViewById4 = this.f67327g.findViewById(C0966R.C0970id.f5373de);
        C87412m.m108593f(findViewById4, "mRootView.findViewById(R.id.action)");
        this.f67331n = (TextView) findViewById4;
        View findViewById5 = this.f67327g.findViewById(C0966R.C0970id.f357845c22);
        C87412m.m108593f(findViewById5, "mRootView.findViewById(R.id.desc)");
        this.f67333p = (TextView) findViewById5;
        View findViewById6 = this.f67327g.findViewById(C0966R.C0970id.km5);
        C87412m.m108593f(findViewById6, "mRootView.findViewById(R.id.tip)");
        this.f67334q = (TextView) findViewById6;
        View findViewById7 = this.f67327g.findViewById(C0966R.C0970id.f6057w4);
        C87412m.m108593f(findViewById7, "mRootView.findViewById(R.id.app_name_tv)");
        this.f67332o = (TextView) findViewById7;
        View findViewById8 = this.f67327g.findViewById(C0966R.C0970id.c6h);
        C87412m.m108593f(findViewById8, "mRootView.findViewById(R.id.dialog_cancel)");
        this.f67335r = (Button) findViewById8;
        View findViewById9 = this.f67327g.findViewById(C0966R.C0970id.c6u);
        C87412m.m108593f(findViewById9, "mRootView.findViewById(R.id.dialog_ok)");
        this.f67336s = (Button) findViewById9;
        View findViewById10 = this.f67327g.findViewById(C0966R.C0970id.j0k);
        C87412m.m108593f(findViewById10, "mRootView.findViewById(R.id.sample_root)");
        this.f67337t = findViewById10;
        View findViewById11 = this.f67327g.findViewById(C0966R.C0970id.j0l);
        C87412m.m108593f(findViewById11, "mRootView.findViewById(R.id.sample_view_title)");
        this.f67305B = (TextView) findViewById11;
        View findViewById12 = this.f67327g.findViewById(C0966R.C0970id.c6z);
        C87412m.m108593f(findViewById12, "mRootView.findViewById(R.id.dialog_view_container)");
        this.f67338u = (FrameLayout) findViewById12;
        View findViewById13 = this.f67327g.findViewById(C0966R.C0970id.c6y);
        C87412m.m108593f(findViewById13, "mRootView.findViewById(R.id.dialog_view)");
        this.f67339v = findViewById13;
        View findViewById14 = this.f67327g.findViewById(C0966R.C0970id.f357722bf2);
        C87412m.m108593f(findViewById14, "mRootView.findViewById(R.id.close_wiv)");
        this.f67340w = findViewById14;
        findViewById14.setContentDescription(context2.getString(C0966R.string.f7580k9));
        View findViewById15 = this.f67327g.findViewById(C0966R.C0970id.f5798p1);
        C87412m.m108593f(findViewById15, "mRootView.findViewById(R.id.always_keep_tv)");
        this.f67341x = (TextView) findViewById15;
        View findViewById16 = this.f67327g.findViewById(C0966R.C0970id.f358879hm0);
        C87412m.m108593f(findViewById16, "mRootView.findViewById(R…_type_always_keep_layout)");
        this.f67343z = findViewById16;
        View findViewById17 = this.f67327g.findViewById(C0966R.C0970id.f5797p0);
        C87412m.m108593f(findViewById17, "mRootView.findViewById(R.id.always_keep_checkbox)");
        this.f67304A = (CheckBox) findViewById17;
        View findViewById18 = this.f67327g.findViewById(C0966R.C0970id.f5799p2);
        C87412m.m108593f(findViewById18, "mRootView.findViewById(R.id.always_reject_tv)");
        this.f67342y = (TextView) findViewById18;
        View findViewById19 = this.f67327g.findViewById(C0966R.C0970id.krr);
        C87412m.m108593f(findViewById19, "mRootView.findViewById(R.id.top_sample)");
        this.f67306C = findViewById19;
        this.f67327g.getViewTreeObserver().addOnGlobalLayoutListener(new C23467a(this));
        this.f67338u.getViewTreeObserver().addOnGlobalLayoutListener(new C23468b(this));
        ((ArrayList) this.f67307D).addAll(list2);
        if (z) {
            this.f67311H = C23488h.SingleMode;
            this.f67328h.setVisibility(8);
            View view = this.f67306C;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$Listener;ZZLcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$ShowToastListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$Listener;ZZLcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$ShowToastListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f67306C.setOnClickListener(new C23469c(this, list2));
        } else if (z2) {
            this.f67311H = C23488h.SingleVoiceMode;
            Object obj = list2.get(0);
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestDialog.ItemWithVoice");
            C23482l lVar = (C23482l) obj;
            this.f67328h.removeAllViews();
            LinearLayout linearLayout = new LinearLayout(context2);
            linearLayout.setBackgroundColor(0);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            C8479f0 f0Var = new C8479f0();
            View inflate2 = LayoutInflater.from(context).inflate(C0966R.C0971layout.c7t, (ViewGroup) null);
            T findViewById20 = inflate2.findViewById(C0966R.C0970id.kav);
            MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) findViewById20;
            mMSwitchBtn.setVisibility(0);
            f0Var.f27484d = findViewById20;
            mMSwitchBtn.setCheck(false);
            MMSwitchBtn mMSwitchBtn2 = (MMSwitchBtn) f0Var.f27484d;
            if (mMSwitchBtn2 != null) {
                mMSwitchBtn2.setSwitchListener(new C23490s(lVar));
            }
            WeImageView weImageView = (WeImageView) inflate2.findViewById(C0966R.C0970id.f1k);
            weImageView.setVisibility(8);
            String str = lVar.f67377f;
            if (!(str == null || str.length() == 0)) {
                weImageView.setVisibility(0);
                weImageView.setOnClickListener(new C119106t(lVar, this));
            }
            ((TextView) inflate2.findViewById(C0966R.C0970id.f357845c22)).setText(context2.getString(C0966R.string.aoa));
            C66786u uVar = new C66786u(this);
            linearLayout.addView((View) uVar.invoke());
            linearLayout.addView(inflate2, new ViewGroup.LayoutParams(-1, (int) TypedValue.applyDimension(1, 56.0f, context.getResources().getDisplayMetrics())));
            linearLayout.addView((View) uVar.invoke());
            this.f67328h.addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        } else {
            this.f67311H = hVar;
            mo36938c(list2);
        }
        this.f67336s.setOnClickListener(new C23470d(this));
        this.f67335r.setOnClickListener(new C23471e(this));
        this.f67343z.setOnClickListener(new C23472f(this, list2));
        this.f67342y.setOnClickListener(new C23473g(this));
        this.f67323U = 2;
    }

    /* renamed from: a */
    public static final void m28046a(C23466p pVar, int i, int i2) {
        if (i2 == 3) {
            pVar.f67336s.setEnabled(i != 0);
        } else {
            pVar.getClass();
        }
    }

    /* renamed from: A */
    public void mo36936A(int i) {
        mo36940d(i);
    }

    /* renamed from: b */
    public void mo36937b() {
        C79630a.m96708a(this.f67327g);
    }

    /* renamed from: c */
    public final void mo36938c(List<? extends C23474i> list) {
        RecyclerView recyclerView = new RecyclerView(this.f67324d, (AttributeSet) null);
        this.f67328h.removeAllViews();
        this.f67328h.addView(recyclerView, new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setAdapter(new C23475j(list, this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f67324d));
        recyclerView.mo17085h0(new C23487p(this));
    }

    public void cancel() {
        mo36942e(2);
        dismiss();
    }

    /* renamed from: d */
    public final void mo36940d(int i) {
        C16137i.f43326a.mo14714a(i, this.f67327g);
        if (i == 1 || i == 3) {
            if (this.f67329i.indexOfChild(this.f67339v) == -1) {
                ViewParent parent = this.f67339v.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.f67339v);
                }
                this.f67329i.addView(this.f67339v);
                this.f67329i.setVisibility(0);
            }
        } else if (this.f67338u.indexOfChild(this.f67339v) == -1) {
            ViewParent parent2 = this.f67339v.getParent();
            if (parent2 != null) {
                ((ViewGroup) parent2).removeView(this.f67339v);
            }
            this.f67338u.addView(this.f67339v);
            this.f67329i.setVisibility(8);
        }
        this.f67327g.getViewTreeObserver().addOnGlobalLayoutListener(new C23486q(this));
    }

    public void dismiss() {
        C87375o0 o0Var = this.f67310G;
        if (o0Var != null) {
            o0Var.mo121777a(this);
        }
        C23485o oVar = this.f67322T;
        if (oVar != null) {
            oVar.onDismiss();
        }
        C32224a<C13598b0> aVar = this.f67312I;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: e */
    public final void mo36942e(int i) {
        Log.m105924i("SubscribeMsgRequestDialog", "dispatchEvent " + i);
        C23483m mVar = this.f67325e;
        if (mVar != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f67307D);
            C13598b0 b0Var = C13598b0.f38549a;
            mVar.mo22181b(i, arrayList);
        }
    }

    /* renamed from: f */
    public final void mo36943f(String str) {
        C87412m.m108594g(str, "value");
        this.f67316M = str;
        View view = this.f67343z;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "setAlwaysKeepText", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "setAlwaysKeepText", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f67341x.setText(this.f67316M);
    }

    /* renamed from: g */
    public final void mo36944g(int i) {
        this.f67323U = i;
        if (i == 1) {
            View findViewById = this.f67327g.findViewById(C0966R.C0970id.f357869c70);
            Context context = this.f67324d;
            Object obj = C111105a.f332697a;
            findViewById.setBackground(C111105a.C111110c.m151511b(context, C0966R.C0969drawable.avt));
        } else if (i == 2) {
            View findViewById2 = this.f67327g.findViewById(C0966R.C0970id.f357869c70);
            Context context2 = this.f67324d;
            Object obj2 = C111105a.f332697a;
            findViewById2.setBackground(C111105a.C111110c.m151511b(context2, C0966R.C0969drawable.avs));
        }
    }

    public View getContentView() {
        return this.f67327g;
    }

    public int getPosition() {
        return this.f67323U;
    }

    /* renamed from: h */
    public final void mo36947h(String str) {
        C87412m.m108594g(str, "value");
        this.f67320R = str;
        this.f67334q.setText(str);
        TextView textView = this.f67334q;
        int i = 0;
        if (this.f67320R.length() == 0) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* renamed from: i */
    public final void mo36948i(boolean z, Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            FrameLayout frameLayout = this.f67338u;
            ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout, View.TRANSLATION_X, new float[]{0.0f, -((float) frameLayout.getWidth())}).setDuration(200);
            duration.setInterpolator(new C16456a());
            C13598b0 b0Var = C13598b0.f38549a;
            View view = this.f67337t;
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{(float) view.getWidth(), 0.0f}).setDuration(200);
            duration2.setInterpolator(new C16456a());
            animatorSet.playTogether(new Animator[]{duration, duration2});
        } else {
            FrameLayout frameLayout2 = this.f67338u;
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(frameLayout2, View.TRANSLATION_X, new float[]{-((float) frameLayout2.getWidth()), 0.0f}).setDuration(200);
            duration3.setInterpolator(new C16456a());
            C13598b0 b0Var2 = C13598b0.f38549a;
            View view2 = this.f67337t;
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, new float[]{0.0f, (float) view2.getWidth()}).setDuration(200);
            duration4.setInterpolator(new C16456a());
            animatorSet.playTogether(new Animator[]{duration3, duration4});
        }
        if (animatorListener != null) {
            animatorSet.addListener(animatorListener);
        }
        animatorSet.start();
    }

    /* renamed from: j */
    public void mo36949j(C87375o0 o0Var) {
        String str = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122785a(this.f67330j, this.f67314K, this.f67321S, new C88430i());
        this.f67310G = o0Var;
        Object systemService = this.f67324d.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        mo36940d(((WindowManager) systemService).getDefaultDisplay().getRotation());
        C23485o oVar = this.f67322T;
        if (oVar != null) {
            oVar.onShow();
        }
    }

    /* renamed from: k */
    public boolean mo36950k() {
        return false;
    }

    /* renamed from: m */
    public boolean mo36951m() {
        return this instanceof C22638d;
    }

    public void onCancel() {
        mo36942e(2);
    }

    /* renamed from: w */
    public boolean mo36953w() {
        if (!this.f67308E) {
            return false;
        }
        mo36948i(false, new C23491v(this));
        this.f67308E = false;
        return true;
    }
}
